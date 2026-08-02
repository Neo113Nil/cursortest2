package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class n7v {
    public static final /* synthetic */ s9f[] j;
    public final mm6 a;
    public final rmb b;
    public final p1v c;
    public final p7v d;
    public final vdr e;
    public final Function0 f;
    public final xdr g;
    public final z6n h;
    public final apo i;

    static {
        opi opiVar = new opi(n7v.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        j = new s9f[]{opiVar};
    }

    public n7v(mm6 mm6Var, rmb rmbVar, p1v p1vVar, p7v p7vVar, vdr vdrVar, Function0 function0) {
        p7vVar.getClass();
        vdrVar.getClass();
        function0.getClass();
        this.a = mm6Var;
        this.b = rmbVar;
        this.c = p1vVar;
        this.d = p7vVar;
        this.e = vdrVar;
        this.f = function0;
        this.g = p7vVar.o;
        this.h = new z6n(7);
        this.i = new apo(new jvu(11, this), new m7v(this, 1, (byte) 0), false, 15);
    }

    public final a7v a() {
        return (a7v) this.e.getValue();
    }

    public final thj b(m6v m6vVar) {
        if (!a().o || m6vVar.g.isEmpty()) {
            return sj2.o(m6vVar);
        }
        String str = (String) CollectionsKt.Q(m6vVar.g);
        pkb pkbVar = pkb.BigFact;
        str.getClass();
        return new thj(pkbVar, str, 1, 1, "");
    }
}
