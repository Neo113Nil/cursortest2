package defpackage;

/* loaded from: classes.dex */
public final class r5 {
    public static final defpackage.r5 IHQe1A4L2xu = new defpackage.r5();

    public final int IHQe1A4L2xu(android.view.Window window) {
        android.view.WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        android.graphics.Insets insets = currentWindowMetrics.getWindowInsets().getInsets(android.view.WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void oh6vYeIP(android.view.WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsSides(i);
    }

    public final void r1MBDhnF(android.view.WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsTypes(i);
    }
}
