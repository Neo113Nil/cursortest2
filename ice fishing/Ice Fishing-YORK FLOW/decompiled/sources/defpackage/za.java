package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class za implements defpackage.ya, defpackage.ax1 {
    public static final defpackage.za WDYagTQQm9ns = new defpackage.za();
    public static final defpackage.za oh71FJcDz6S2 = new defpackage.za();

    @Override // defpackage.ya
    public android.graphics.Rect QiMR8OkAhezm(android.app.Activity activity) {
        android.graphics.Rect bounds = ((android.view.WindowManager) activity.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.ax1
    public defpackage.ww1 giKS3J6vZuNy(android.content.ContextWrapper contextWrapper, defpackage.ip ipVar) {
        ipVar.getClass();
        android.view.WindowManager windowManager = (android.view.WindowManager) contextWrapper.getSystemService(android.view.WindowManager.class);
        float f = contextWrapper.getResources().getDisplayMetrics().density;
        android.graphics.Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new defpackage.ww1(bounds, f);
    }
}
