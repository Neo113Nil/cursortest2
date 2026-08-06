package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jp implements defpackage.ip, defpackage.ax1 {
    public static final defpackage.jp WDYagTQQm9ns = new defpackage.jp();
    public static final defpackage.jp oh71FJcDz6S2 = new defpackage.jp();

    @Override // defpackage.ip
    public float P05cfTpS5W5L(android.content.ContextWrapper contextWrapper) {
        return ((android.view.WindowManager) contextWrapper.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.ax1
    public defpackage.ww1 giKS3J6vZuNy(android.content.ContextWrapper contextWrapper, defpackage.ip ipVar) {
        ipVar.getClass();
        android.view.WindowManager windowManager = contextWrapper.isUiContext() ? (android.view.WindowManager) contextWrapper.getSystemService(android.view.WindowManager.class) : (android.view.WindowManager) contextWrapper.getApplicationContext().getSystemService(android.view.WindowManager.class);
        android.graphics.Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new defpackage.ww1(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
