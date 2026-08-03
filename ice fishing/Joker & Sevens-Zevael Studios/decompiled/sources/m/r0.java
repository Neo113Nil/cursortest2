package m;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r0 extends o0 implements p0 {
    public static final Method F;
    public f8.c E;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                F = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.p0
    public final void e(l.h hVar, l.i iVar) {
        f8.c cVar = this.E;
        if (cVar != null) {
            cVar.e(hVar, iVar);
        }
    }

    @Override // m.p0
    public final void g(l.h hVar, MenuItem menuItem) {
        f8.c cVar = this.E;
        if (cVar != null) {
            cVar.g(hVar, menuItem);
        }
    }
}
