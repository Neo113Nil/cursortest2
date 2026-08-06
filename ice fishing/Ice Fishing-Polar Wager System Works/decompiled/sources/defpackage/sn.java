package defpackage;

/* loaded from: classes.dex */
public final class sn implements defpackage.rn, defpackage.fp1 {
    public static final defpackage.sn adDC3e2L = new defpackage.sn();
    public static final defpackage.sn xiZrDbcSW0 = new defpackage.sn();

    @Override // defpackage.rn
    public float AARZUJiTa(android.content.ContextWrapper contextWrapper) {
        return ((android.view.WindowManager) contextWrapper.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.fp1
    public defpackage.bp1 adDC3e2L(android.content.ContextWrapper contextWrapper, defpackage.rn rnVar) {
        rnVar.getClass();
        android.view.WindowManager windowManager = contextWrapper.isUiContext() ? (android.view.WindowManager) contextWrapper.getSystemService(android.view.WindowManager.class) : (android.view.WindowManager) contextWrapper.getApplicationContext().getSystemService(android.view.WindowManager.class);
        android.graphics.Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new defpackage.bp1(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
