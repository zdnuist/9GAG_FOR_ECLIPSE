// Generated code from Butter Knife. Do not modify!
package me.storm.ninegag.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final me.storm.ninegag.ui.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034121, "field 'blurImage'");
    target.blurImage = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131034119, "field 'mDrawerLayout'");
    target.mDrawerLayout = (me.storm.ninegag.view.FoldingDrawerLayout) view;
    view = finder.findRequiredView(source, 2131034120, "field 'contentLayout'");
    target.contentLayout = (android.widget.FrameLayout) view;
  }

  public static void reset(me.storm.ninegag.ui.MainActivity target) {
    target.blurImage = null;
    target.mDrawerLayout = null;
    target.contentLayout = null;
  }
}
