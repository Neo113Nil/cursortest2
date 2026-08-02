package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class mrw {
    public final mm6 a;
    public final rjq b;
    public final um6 c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final xdr n;

    public mrw(um6 um6Var) {
        um6Var.getClass();
        this.a = um6Var;
        rjq rjqVar = new rjq(false);
        this.b = rjqVar;
        this.c = hld.s(rjqVar, dm6.b());
        bdt I = hag.I(Context.class);
        l18 l18Var = l18.b;
        this.d = l18Var.b(I, true);
        this.e = l18Var.b(hag.I(oq7.class), true);
        this.f = l18Var.b(hag.I(q8b.class), true);
        this.g = l18Var.b(hag.I(fos.class), true);
        this.h = l18Var.b(hag.I(frt.class), true);
        this.i = l18Var.b(hag.I(z66.class), true);
        this.j = l18Var.b(hag.I(tiw.class), true);
        this.k = l18Var.b(hag.I(hew.class), true);
        this.l = l18Var.b(hag.I(v3i.class), true);
        this.m = l18Var.b(hag.I(d6m.class), true);
        this.n = ydr.a(a());
    }

    public final xqw a() {
        yxc E = v3g.E((frt) this.h.getValue());
        x66 a = ((z66) this.i.getValue()).a();
        boolean booleanValue = ((Boolean) b().a.getValue()).booleanValue();
        String str = (String) ((v3i) this.l.getValue()).b.getValue();
        boolean booleanValue2 = ((Boolean) fzk.e.getValue()).booleanValue();
        jyr jyrVar = p6m.f;
        return new xqw(false, E.a.d, E.g, false, a.a, booleanValue, false, str != null, (o6m.e() && Intrinsics.d(((j6m) ((d6m) this.m.getValue())).j.getValue(), r6m.a)) ? false : true, booleanValue2);
    }

    public final tiw b() {
        return (tiw) this.j.getValue();
    }
}
