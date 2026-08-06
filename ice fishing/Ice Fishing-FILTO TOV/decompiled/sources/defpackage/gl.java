package defpackage;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gl implements fl, kh1 {
    public static final gl OOA6hdeuvCS = new gl();
    public static final gl EljAMC1QTz = new gl();

    @Override // defpackage.fl
    public float AvO7iQsrTN(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.kh1
    public gh1 OOA6hdeuvCS(ContextWrapper contextWrapper, fl flVar) {
        flVar.getClass();
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new gh1(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
