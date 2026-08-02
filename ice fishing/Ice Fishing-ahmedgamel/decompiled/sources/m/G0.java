package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import l.C4659e;

/* loaded from: classes.dex */
public final class G0 extends B0 implements C0 {

    /* renamed from: W, reason: collision with root package name */
    public static final Method f39074W;

    /* renamed from: V, reason: collision with root package name */
    public C4659e f39075V;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f39074W = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.C0
    public final void c(l.m mVar, l.o oVar) {
        C4659e c4659e = this.f39075V;
        if (c4659e != null) {
            c4659e.c(mVar, oVar);
        }
    }

    @Override // m.B0
    public final C4719p0 m(Context context, boolean z6) {
        F0 f02 = new F0(context, z6);
        f02.setHoverListener(this);
        return f02;
    }

    @Override // m.C0
    public final void p(l.m mVar, l.o oVar) {
        C4659e c4659e = this.f39075V;
        if (c4659e != null) {
            c4659e.p(mVar, oVar);
        }
    }
}
