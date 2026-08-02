package defpackage;

/* loaded from: classes6.dex */
public final class bis {
    public final long a;
    public final jyr b;
    public final jyr c;
    public final xdr d;
    public final xdr e;
    public final jp0 f;
    public final sai g;
    public final tf6 h;

    public bis(long j) {
        n7q n7qVar;
        this.a = j;
        bdt I = hag.I(oq7.class);
        l18 l18Var = l18.b;
        int i = 1;
        jyr b = l18Var.b(I, true);
        this.b = b;
        this.c = l18Var.b(hag.I(kmd.class), true);
        d6l x = p6g.x((e6l) ((oq7) b.getValue()).a.c.getValue());
        mwk b2 = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
        int i2 = 0;
        boolean booleanValue = b2 != null ? ((Boolean) dag.p(b2, aaw.d)).booleanValue() : false;
        xdr a = ydr.a(new rhs(j, booleanValue, booleanValue && (b().e.getValue() instanceof ijs), b().e.getValue() instanceof kjs));
        this.d = a;
        this.e = a;
        this.f = new jp0(new vuq(0, this, bis.class, "dismiss", "dismiss()V", 0, 29));
        this.g = new sai(false);
        dq7 dq7Var = ca8.a;
        tf6 e = gld.e(j5h.a);
        this.h = e;
        ox6.B(b().e, e, new ais(this, i));
        ox6.B(((oq7) b.getValue()).a.c, e, new ais(this, i2));
    }

    public final void a() {
        gld.L(this.h, null);
        this.g.a();
        this.f.e();
    }

    public final kmd b() {
        return (kmd) this.c.getValue();
    }
}
