package defpackage;

import android.os.Looper;
import android.view.View;
import androidx.fragment.app.t;
import androidx.fragment.app.y;

/* loaded from: classes3.dex */
public abstract class px2 {
    public static final jyr a;
    public static final jyr b;
    public static final jyr c;

    static {
        bdt I = hag.I(rw2.class);
        l18 l18Var = l18.b;
        a = l18Var.b(I, true);
        b = l18Var.b(hag.I(lx2.class), true);
        c = l18Var.b(hag.I(iw2.class), true);
    }

    public static rw2 a() {
        return (rw2) a.getValue();
    }

    public static void b(t tVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            dfi.r("Call BatteryRestrictionsScreenApi.show() only from main thread ", "BatteryRestrictionsScreenApi");
            return;
        }
        if (tVar.getLifecycle().c().a.getValue() == lyf.e && gld.T(wyf.F(tVar.getLifecycle()))) {
            View decorView = tVar.getWindow().getDecorView();
            decorView.getClass();
            if (swf.E(decorView) == null) {
                return;
            }
            y supportFragmentManager = tVar.getSupportFragmentManager();
            supportFragmentManager.getClass();
            rw2 a2 = a();
            rx2 rx2Var = new rx2(tVar, a2, (lx2) b.getValue(), wyf.F(tVar.getLifecycle()));
            int i = 0;
            boolean z = a2.a.c(tVar) != null;
            ((iw2) c.getValue()).getClass();
            l18 l18Var = l18.b;
            bdt I = hag.I(byb.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (((fw2) ((byb) qdcVar.C(I)).b(fw2.class)).h()) {
                cvo cvoVar = cvo.i;
                fxf.P(tVar, o6m.b(wjb.BottomsheetScreen, null, 6), rx2Var.f, pd.t(new qzm[0]), new oi1(0, rx2Var, rx2.class, "onClose", "onClose()V", 0, 16), new wn5(new mx2(rx2Var, z, i), 1498908096, true), 4);
            } else {
                cvo cvoVar2 = cvo.i;
                e3s.X(o6m.b(wjb.BottomsheetScreen, null, 6), supportFragmentManager, null, rx2Var.f, new oi1(0, rx2Var, rx2.class, "onClose", "onClose()V", 0, 17), new wn5(new nx2(rx2Var, z, i), -571389452, true), 20);
            }
        }
    }

    public static final void c(t tVar) {
        x97.y(wyf.F(tVar.getLifecycle()), dm6.b, null, new hl(tVar, null, 24), 2);
    }
}
