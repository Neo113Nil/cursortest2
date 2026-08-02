package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.e;

/* loaded from: classes4.dex */
public final class ncl implements d80, i6q {
    public final String a;
    public final xdr b;
    public final xdr c;
    public final xdr d;
    public final xdr e;
    public final xdr f;
    public final xdr g;
    public final xdr h;
    public final xdr i;
    public final xdr j;
    public final xdr k;
    public final uzc l;
    public final gw1 m;

    public ncl(b7q b7qVar, int i) {
        f6q f6qVar = f6q.None;
        b7qVar.getClass();
        this.a = wdp.W(this, "PlayerEffects");
        jyr b = b7qVar.b(hag.I(jw1.class), true);
        jyr b2 = b7qVar.b(hag.I(k2b.class), true);
        xdr a = ydr.a(f6q.None);
        this.b = a;
        xdr a2 = ydr.a(g6q.a);
        this.c = a2;
        xdr a3 = ydr.a(h6q.None);
        this.d = a3;
        this.e = ydr.a(Boolean.FALSE);
        Float valueOf = Float.valueOf(Float.NaN);
        this.f = ydr.a(valueOf);
        this.g = ydr.a(valueOf);
        this.h = ydr.a(valueOf);
        this.i = ydr.a(valueOf);
        this.j = ydr.a(valueOf);
        this.k = ydr.a(valueOf);
        uzc uzcVar = new uzc();
        this.l = uzcVar;
        rjq rjqVar = new rjq(true);
        e eVar = ca8.b;
        um6 s = hld.s(rjqVar, eVar);
        mal.a();
        jw1 jw1Var = (jw1) b.getValue();
        k2b k2bVar = (k2b) b2.getValue();
        jw1Var.getClass();
        k2bVar.getClass();
        b12 b12Var = new b12(jw1Var, this, k2bVar);
        a.l(b12Var.getImplementation());
        b12Var.d(i);
        ox6.B(b12Var.b(), s, new mcl(this, 3));
        this.m = b12Var;
        ox6.B((xdr) uzcVar.b, gld.e(eVar), new mcl(this, 0));
        ox6.B(a2, gld.e(eVar), new mcl(this, 1));
        ox6.B(a3, gld.e(eVar), new mcl(this, 2));
    }

    @Override // defpackage.i6q
    public final vdr C() {
        return this.c;
    }

    @Override // defpackage.i6q
    public final vdr G() {
        return this.d;
    }

    @Override // defpackage.fl6
    public final vdr N() {
        return this.j;
    }

    @Override // defpackage.fl6
    public final vdr S() {
        return this.i;
    }

    @Override // defpackage.d80
    public final void X(c80 c80Var, int i) {
        mal.a();
        this.m.d(i);
    }

    @Override // defpackage.fl6
    public final vdr a() {
        return this.h;
    }

    @Override // defpackage.i6q
    public final vdr b() {
        return this.e;
    }

    @Override // defpackage.fl6
    public final vdr f0() {
        return this.f;
    }

    @Override // defpackage.fl6
    public final vdr g0() {
        return this.k;
    }

    @Override // defpackage.fl6
    public final vdr h() {
        return this.g;
    }

    public final void q0(oxs oxsVar, long j, long j2) {
        mal.a();
        ssg.a(3, this.a, "Applying new normalization data " + oxsVar, null);
        vzg vzgVar = oxsVar != null ? Intrinsics.d(oxsVar.a, Boolean.FALSE) : false ? oxsVar.b : null;
        uzc uzcVar = this.l;
        uzcVar.c = vzgVar;
        uzcVar.b(j, j2);
    }

    @Override // defpackage.i6q
    public final vdr z() {
        return this.b;
    }
}
