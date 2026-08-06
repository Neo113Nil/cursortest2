package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class q6 {
    public static final defpackage.q6 ZpBGe2uQfcn8 = new defpackage.q6();

    public final int ZpBGe2uQfcn8(android.view.Window window) {
        android.view.WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        android.graphics.Insets insets = currentWindowMetrics.getWindowInsets().getInsets(android.view.WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void fWTAfUmVKrZq(android.view.WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsTypes(i);
    }

    public final void giKS3J6vZuNy(android.view.WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsSides(i);
    }
}
