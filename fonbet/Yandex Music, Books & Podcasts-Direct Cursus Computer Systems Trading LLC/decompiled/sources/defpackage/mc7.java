package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class mc7 {
    public final oc7 a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public mc7(Context context, gwc gwcVar, l9w l9wVar, m9w m9wVar, pej pejVar, o9w o9wVar, e1n e1nVar) {
        oc7 oc7Var = new oc7();
        vl1 vl1Var = new vl1(context, gwcVar, l9wVar, m9wVar, pejVar, o9wVar, e1nVar, 2);
        if (oc7Var.a != null) {
            xq0.q("Di already initialized");
            throw null;
        }
        o18 o18Var = new o18();
        vl1Var.invoke(o18Var, oc7Var);
        oc7Var.a = new qdc(new ix6(o18Var.a));
        this.a = oc7Var;
        this.b = oc7Var.b(hag.I(i5h.class), true);
        this.c = oc7Var.b(hag.I(dst.class), true);
        this.d = oc7Var.b(hag.I(nc7.class), true);
        this.e = oc7Var.b(hag.I(z2b.class), true);
    }
}
