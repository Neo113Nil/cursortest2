package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class jfd {
    public final ked a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final rjq e;
    public final um6 f;
    public final x0q g;
    public final xdr h;
    public final xdr i;
    public final xdr j;
    public final ub7 k;

    public jfd(ked kedVar) {
        this.a = kedVar;
        bdt I = hag.I(yjd.class);
        l18 l18Var = l18.b;
        jyr b = l18Var.b(I, true);
        this.b = b;
        this.c = l18Var.b(hag.I(ohd.class), true);
        this.d = l18Var.b(hag.I(akd.class), true);
        rjq rjqVar = new rjq(false);
        this.e = rjqVar;
        this.f = hld.s(rjqVar, dm6.b());
        Continuation continuation = null;
        x0q b2 = y0q.b(0, 1, null, 5);
        this.g = b2;
        c5b c5bVar = c5b.a;
        this.h = ydr.a(c5bVar);
        this.i = ydr.a(c5bVar);
        this.j = ydr.a(qzq.a);
        this.k = zsd.Q(((yjd) b.getValue()).h, ((yjd) b.getValue()).i, new clc(b2, new z21(2, 24, continuation)), new kdd(this, continuation, 1));
    }

    public final void a(boolean z, boolean z2) {
        rjq rjqVar = this.e;
        if (!z) {
            ssg.a(4, null, "aggressive scan: stopped", null);
            rjqVar.V();
            return;
        }
        rjqVar.g();
        this.a.h = false;
        ox6.B(zsd.M0(this.k, new dfd(null, this, z2)), this.f, new ffd(this, 0));
        ssg.a(4, null, "aggressive scan: started", null);
        ox6.B(new eno(new gfd(2, null)), hld.s(rjqVar, dm6.b()), new ffd(this, 1));
    }
}
