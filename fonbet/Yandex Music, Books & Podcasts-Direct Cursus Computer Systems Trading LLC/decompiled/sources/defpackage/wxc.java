package defpackage;

/* loaded from: classes4.dex */
public final class wxc {
    public static final /* synthetic */ s9f[] f;
    public final mm6 a;
    public final xdr b;
    public final fkn c;
    public final xdr d;
    public final rhp e;

    static {
        opi opiVar = new opi(wxc.class, "scheduleFullScreen", "getScheduleFullScreen()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        f = new s9f[]{opiVar};
    }

    public wxc(mm6 mm6Var, tll tllVar, oq7 oq7Var) {
        this.a = mm6Var;
        Boolean bool = Boolean.FALSE;
        xdr a = ydr.a(bool);
        this.b = a;
        this.c = new fkn(a);
        xdr a2 = ydr.a(bool);
        this.d = a2;
        this.e = new rhp();
        ox6.B(zsd.Q(tllVar.f, a2, zsd.b0(new bca(oq7Var.a.c, 24)), uxc.a), mm6Var, new u58(24, this));
    }

    public final void a(boolean z) {
        r2f b = this.e.b(f[0]);
        if (b != null) {
            b.g(null);
        }
        v3w.n(z, this.b, null);
    }
}
