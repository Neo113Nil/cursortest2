package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class c11 extends defpackage.b11 {
    @Override // defpackage.hu
    public final void gUjdnLbkVAaA(android.view.View view, android.graphics.Rect rect) {
        android.view.WindowMetrics currentWindowMetrics;
        android.graphics.Rect bounds;
        java.lang.Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        currentWindowMetrics = ((android.view.WindowManager) systemService).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        rect.set(bounds);
    }
}
