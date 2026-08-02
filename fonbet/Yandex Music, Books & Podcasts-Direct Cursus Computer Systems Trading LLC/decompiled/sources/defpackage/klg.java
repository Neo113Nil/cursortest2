package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class klg {
    public final jyr a;
    public final cus b;
    public final btl c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final ykf g;

    public klg() {
        bdt I = hag.I(frt.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = new cus();
        this.c = new btl();
        this.d = l18Var.b(hag.I(pi4.class), true);
        this.e = l18Var.b(hag.I(xlg.class), true);
        this.f = l18Var.b(hag.I(t3g.class), true);
        this.g = new ykf(3, this);
    }

    public static eno b(Function1 function1) {
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str = ((frt) qdcVar.C(I)).c().a;
        str.getClass();
        bdt I2 = hag.I(i5h.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        return ((i5h) qdcVar2.C(I2)).f(str, new String[]{"playlist_mview", "playlist_track"}, function1);
    }

    public final xlg a() {
        return (xlg) this.e.getValue();
    }

    public final Object c(cvl cvlVar, cg6 cg6Var) {
        jyr jyrVar = i2q.e;
        Continuation continuation = null;
        if (!lsq.v()) {
            return x97.V(dm6.a, new n71(continuation, this, this.g, cvlVar, 19), cg6Var);
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((frt) qdcVar.C(I)).c().a.getClass();
        xlg a = a();
        Object V = x97.V(dm6.b, new akc(a, a.h, cvlVar, continuation, 29), cg6Var);
        return V == nm6.a ? V : (rrl) V;
    }

    public final Object d(String str, String str2, cg6 cg6Var) {
        jyr jyrVar = i2q.e;
        if (!lsq.v()) {
            return x97.V(dm6.a, new v24((Continuation) null, this, this.g, str, str2, 7), cg6Var);
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((frt) qdcVar.C(I)).c().a.getClass();
        xlg a = a();
        Object V = x97.V(dm6.b, new rfg(a, a.h, str, str2, null, 5), cg6Var);
        return V == nm6.a ? V : (rrl) V;
    }

    public final Object e(cvl cvlVar, cg6 cg6Var) {
        jyr jyrVar = i2q.e;
        int i = 1;
        Continuation continuation = null;
        return lsq.v() ? x97.V(dm6.a, new zig(this, cvlVar, continuation, i), cg6Var) : x97.V(dm6.a, new seg(continuation, this, cvlVar, i), cg6Var);
    }

    public final Object f(String str, String str2, cg6 cg6Var) {
        jyr jyrVar = i2q.e;
        if (!lsq.v()) {
            return x97.V(dm6.a, new v24((Continuation) null, this, str, str2, this, 8), cg6Var);
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((frt) qdcVar.C(I)).c().a.getClass();
        xlg a = a();
        a.getClass();
        Object V = x97.V(dm6.b, new rfg(a, str, str2, (Continuation) null, a), cg6Var);
        return V == nm6.a ? V : (rrl) V;
    }

    public final Object g(cvl cvlVar, cg6 cg6Var) {
        return x97.V(dm6.a, new e05(cvlVar, this, (Continuation) null), cg6Var);
    }
}
