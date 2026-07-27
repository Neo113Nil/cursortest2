package h;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class M extends J implements K {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2124D;

    /* renamed from: C, reason: collision with root package name */
    public A.j f2125C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2124D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // h.K
    public final void b(g.j jVar, g.k kVar) {
        A.j jVar2 = this.f2125C;
        if (jVar2 != null) {
            jVar2.b(jVar, kVar);
        }
    }

    @Override // h.K
    public final void q(g.j jVar, g.k kVar) {
        A.j jVar2 = this.f2125C;
        if (jVar2 != null) {
            jVar2.q(jVar, kVar);
        }
    }
}
