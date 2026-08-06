package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j7 implements i7, kh1 {
    public static final j7 OOA6hdeuvCS = new j7();
    public static final j7 EljAMC1QTz = new j7();

    @Override // defpackage.i7
    public Rect EljAMC1QTz(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.kh1
    public gh1 OOA6hdeuvCS(ContextWrapper contextWrapper, fl flVar) {
        flVar.getClass();
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new gh1(bounds, f);
    }
}
