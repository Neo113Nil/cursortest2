package h;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class L extends AbstractC0202I implements InterfaceC0203J {

    /* renamed from: z, reason: collision with root package name */
    public static final Method f3183z;

    /* renamed from: y, reason: collision with root package name */
    public Z0.i f3184y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3183z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // h.InterfaceC0203J
    public final void b(g.j jVar, g.k kVar) {
        Z0.i iVar = this.f3184y;
        if (iVar != null) {
            iVar.b(jVar, kVar);
        }
    }

    @Override // h.InterfaceC0203J
    public final void d(g.j jVar, g.k kVar) {
        Z0.i iVar = this.f3184y;
        if (iVar != null) {
            iVar.d(jVar, kVar);
        }
    }
}
