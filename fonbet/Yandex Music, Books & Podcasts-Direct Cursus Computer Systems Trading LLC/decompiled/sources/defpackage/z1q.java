package defpackage;

/* loaded from: classes5.dex */
public final class z1q implements g4q {
    public final uid e;
    public final rjq f;
    public final um6 g;
    public final um6 h;
    public tid i;
    public final xdr j;
    public final rre k;

    public z1q(uid uidVar) {
        this.e = uidVar;
        rjq rjqVar = new rjq(false);
        this.f = rjqVar;
        this.g = hld.s(rjqVar, dm6.b());
        this.h = hld.s(rjqVar, dm6.b);
        this.j = ydr.a(r7q.a);
        this.k = rre.l;
    }

    @Override // defpackage.g4q
    public final void a(c9g c9gVar) {
        this.f.V();
        ced cedVar = this.e.c;
        dhd dhdVar = new dhd(1, false);
        cedVar.getClass();
        cedVar.a(dhdVar);
        s7q s7qVar = new s7q(this);
        xdr xdrVar = this.j;
        xdrVar.getClass();
        xdrVar.m(null, s7qVar);
    }

    public final void b() {
        ced cedVar = this.e.c;
        if (((t1q) cedVar.r.k.getValue()).d != null) {
            x97.y(this.h, null, null, new w1q(cedVar, null, this, 1), 3);
        }
    }

    @Override // defpackage.g4q
    public final k7q getDescriptor() {
        return this.e;
    }

    @Override // defpackage.g4q
    public final vdr getState() {
        return this.j;
    }

    @Override // defpackage.g4q
    public final void start() {
        this.f.g();
        ced cedVar = this.e.c;
        xdr xdrVar = cedVar.r.k;
        y1q y1qVar = new y1q(this, 0);
        um6 um6Var = this.g;
        ox6.B(xdrVar, um6Var, y1qVar);
        ox6.B(new ail(26, cedVar.r.k, this), um6Var, new y1q(this, 1));
    }
}
