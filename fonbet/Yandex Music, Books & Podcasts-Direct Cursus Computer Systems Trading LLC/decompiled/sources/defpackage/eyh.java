package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class eyh extends y9g implements pxh {
    public static final Method D;
    public sld C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.y9g
    public final nra b(Context context, boolean z) {
        dyh dyhVar = new dyh(context, z);
        dyhVar.setHoverListener(this);
        return dyhVar;
    }

    @Override // defpackage.pxh
    public final void c(hxh hxhVar, MenuItem menuItem) {
        sld sldVar = this.C;
        if (sldVar != null) {
            sldVar.c(hxhVar, menuItem);
        }
    }

    @Override // defpackage.pxh
    public final void m(hxh hxhVar, rxh rxhVar) {
        sld sldVar = this.C;
        if (sldVar != null) {
            sldVar.m(hxhVar, rxhVar);
        }
    }
}
