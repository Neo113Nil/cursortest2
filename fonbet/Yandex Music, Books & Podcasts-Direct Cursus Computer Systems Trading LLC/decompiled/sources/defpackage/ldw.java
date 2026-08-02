package defpackage;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ldw {
    public final amw a;
    public final rjq b;
    public final um6 c;
    public boolean d;
    public final xdr e;
    public final xdr f;
    public final xdr g;
    public final xdr h;
    public final xdr i;
    public final xdr j;

    public ldw(amw amwVar, slw slwVar, rgw rgwVar) {
        this.a = amwVar;
        rjq rjqVar = new rjq(false);
        this.b = rjqVar;
        this.c = hld.s(rjqVar, dm6.b);
        this.e = ydr.a(null);
        this.f = ydr.a(null);
        this.g = ydr.a(null);
        this.h = ydr.a(null);
        this.i = ydr.a(null);
        this.j = ydr.a(null);
    }

    public static final boolean a(ldw ldwVar) {
        return ldwVar.d && (ldwVar.a.b().b instanceof maq);
    }

    public static qm c(xdr xdrVar, String str, Object obj, String str2) {
        return new qm(new bca(xdrVar, 18), obj, str2, str, 7);
    }

    public final Object b(int i, aur aurVar) {
        icw icwVar;
        jcw jcwVar = (jcw) this.e.getValue();
        if (jcwVar != null && (icwVar = (icw) jcwVar.b) != null && icwVar.b == i) {
            return Unit.a;
        }
        Object o = y2x.o(1000L, aurVar);
        return o == nm6.a ? o : Unit.a;
    }

    public final ub7 d(int i, String str) {
        str.getClass();
        return new ub7(12, new mcw(c(this.g, "player_state", Integer.valueOf(i), str), str, 0), new dt0(2, 22, null));
    }
}
