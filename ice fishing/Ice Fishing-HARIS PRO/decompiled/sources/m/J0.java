package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import l.MenuC0229m;

/* loaded from: classes.dex */
public final class J0 extends E0 implements F0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f3838D;

    /* renamed from: C, reason: collision with root package name */
    public B.b f3839C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3838D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.F0
    public final void e(MenuC0229m menuC0229m, l.o oVar) {
        B.b bVar = this.f3839C;
        if (bVar != null) {
            bVar.e(menuC0229m, oVar);
        }
    }

    @Override // m.F0
    public final void i(MenuC0229m menuC0229m, l.o oVar) {
        B.b bVar = this.f3839C;
        if (bVar != null) {
            bVar.i(menuC0229m, oVar);
        }
    }

    @Override // m.E0
    public final C0276r0 q(Context context, boolean z2) {
        I0 i02 = new I0(context, z2);
        i02.setHoverListener(this);
        return i02;
    }
}
