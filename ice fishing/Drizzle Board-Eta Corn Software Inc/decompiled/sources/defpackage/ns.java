package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ns extends xp implements bs {
    public static final Method euDDoUNr;
    public tg0 Mq3SeTnW;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                euDDoUNr = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.bs
    public final void Qr9iLBAD(yr yrVar, MenuItem menuItem) {
        tg0 tg0Var = this.Mq3SeTnW;
        if (tg0Var != null) {
            tg0Var.Qr9iLBAD(yrVar, menuItem);
        }
    }

    @Override // defpackage.bs
    public final void eVhOlqcC(yr yrVar, cs csVar) {
        tg0 tg0Var = this.Mq3SeTnW;
        if (tg0Var != null) {
            tg0Var.eVhOlqcC(yrVar, csVar);
        }
    }

    @Override // defpackage.xp
    public final fe qoPGr6Ce(Context context, boolean z) {
        ms msVar = new ms(context, z);
        msVar.setHoverListener(this);
        return msVar;
    }
}
