package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import l.C4648e;

/* loaded from: classes.dex */
public final class G0 extends B0 implements C0 {

    /* renamed from: W, reason: collision with root package name */
    public static final Method f39006W;

    /* renamed from: V, reason: collision with root package name */
    public C4648e f39007V;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f39006W = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.C0
    public final void c(l.m mVar, l.o oVar) {
        C4648e c4648e = this.f39007V;
        if (c4648e != null) {
            c4648e.c(mVar, oVar);
        }
    }

    @Override // m.C0
    public final void l(l.m mVar, l.o oVar) {
        C4648e c4648e = this.f39007V;
        if (c4648e != null) {
            c4648e.l(mVar, oVar);
        }
    }

    @Override // m.B0
    public final C4706p0 n(Context context, boolean z3) {
        F0 f02 = new F0(context, z3);
        f02.setHoverListener(this);
        return f02;
    }
}
