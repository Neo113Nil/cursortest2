package defpackage;

import android.app.Activity;
import java.util.Set;

/* loaded from: classes3.dex */
public final class nh7 implements mj5 {
    public final boolean a;
    public final jj5 b;
    public final jyr c;
    public final jyr d;

    public nh7(boolean z, jj5 jj5Var, jyr jyrVar, jyr jyrVar2) {
        this.a = z;
        this.b = jj5Var;
        this.c = jyrVar;
        this.d = jyrVar2;
    }

    @Override // defpackage.mj5
    public final void a(xh5 xh5Var, zh5 zh5Var, Activity activity) {
        Object value;
        Set set;
        rg5 rg5Var;
        lh5 lh5Var = (lh5) xh5Var;
        zh5Var.getClass();
        lh5Var.getClass();
        activity.getClass();
        String str = zh5Var.a;
        String str2 = lh5Var.a;
        String str3 = lh5Var.b;
        ssg.a(4, "DeeplinkCommunicationTriggerHandler", hrg.r("handle anchorId: ", str, ", screenId: ", str2), null);
        if (this.a) {
            ((oi5) this.c.getValue()).i(str, str3);
        } else {
            ((pi5) this.d.getValue()).e(str3);
        }
        String str4 = lh5Var.d;
        str4.getClass();
        ssg.a(3, "CommunicationTriggerExternalActionsImpl", "openUri: ".concat(str4), null);
        wg5 wg5Var = (wg5) this.b.f.getValue();
        wg5Var.getClass();
        xdr xdrVar = ((ug5) wg5Var.a.getValue()).a;
        do {
            value = xdrVar.getValue();
            tg5 tg5Var = (tg5) value;
            tg5Var.getClass();
            boolean z = tg5Var instanceof rg5;
            rg5 rg5Var2 = z ? (rg5) tg5Var : null;
            if (rg5Var2 == null || (set = rg5Var2.a) == null) {
                set = q5b.a;
            }
            rg5Var = z ? (rg5) tg5Var : null;
        } while (!xdrVar.k(value, new rg5(wop.j(set, lh5Var), wop.g(rg5Var != null ? rg5Var.b : q5b.a, lh5Var))));
        w1g.y(activity, str4, true);
    }
}
