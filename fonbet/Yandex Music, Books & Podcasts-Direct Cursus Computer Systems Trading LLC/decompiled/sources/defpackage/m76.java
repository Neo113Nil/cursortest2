package defpackage;

/* loaded from: classes4.dex */
public final class m76 implements rnq, wmm {
    public static final /* synthetic */ s9f[] h;
    public final s63 a;
    public final k76 b;
    public final z66 c;
    public boolean d;
    public final z6n e;
    public kzp f;
    public final xdr g;

    static {
        opi opiVar = new opi(m76.class, "connectivityInfoJob", "getConnectivityInfoJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        h = new s9f[]{opiVar};
    }

    public m76(s63 s63Var, k76 k76Var, z66 z66Var) {
        z66Var.getClass();
        this.a = s63Var;
        this.b = k76Var;
        this.c = z66Var;
        this.e = new z6n(7);
        this.g = ydr.a(Boolean.valueOf(z66Var.g()));
    }

    @Override // defpackage.rnq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vjg a() {
        return (vjg) this.a.a;
    }

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, "Skeleton:ConnectivityInfoBlock", hrg.q("Block cancel[", a().a.a, "]"), null);
        this.e.setValue(this, h[0], null);
        this.d = false;
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, "Skeleton:ConnectivityInfoBlock", hrg.q("Block reload[", a().a.a, "]"), null);
        cancel();
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.f = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        if (this.d) {
            return;
        }
        ssg.a(3, "Skeleton:ConnectivityInfoBlock", hrg.q("Block load[", a().a.a, "]"), null);
        rar B = ox6.B(zsd.b0(new cz(this.c.c(), this, 27)), mm6Var, new i64(23, this));
        this.e.setValue(this, h[0], B);
        kzp kzpVar = this.f;
        if (kzpVar != null) {
            kzpVar.invoke(new d73(a()));
        }
    }
}
