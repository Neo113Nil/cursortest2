package defpackage;

/* loaded from: classes.dex */
public final class w8 implements defpackage.v8, defpackage.fp1 {
    public static final defpackage.w8 adDC3e2L = new defpackage.w8();
    public static final defpackage.w8 xiZrDbcSW0 = new defpackage.w8();

    @Override // defpackage.fp1
    public defpackage.bp1 adDC3e2L(android.content.ContextWrapper contextWrapper, defpackage.rn rnVar) {
        rnVar.getClass();
        android.view.WindowManager windowManager = (android.view.WindowManager) contextWrapper.getSystemService(android.view.WindowManager.class);
        float f = contextWrapper.getResources().getDisplayMetrics().density;
        android.graphics.Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new defpackage.bp1(bounds, f);
    }

    @Override // defpackage.v8
    public android.graphics.Rect xiZrDbcSW0(android.app.Activity activity) {
        android.graphics.Rect bounds = ((android.view.WindowManager) activity.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
