package defpackage;

/* loaded from: classes4.dex */
public final class gr1 implements yfg {
    public static final /* synthetic */ s9f[] d;
    public final tfg a;
    public final mm6 b;
    public final rhp c;

    static {
        opi opiVar = new opi(gr1.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        d = new s9f[]{opiVar};
    }

    public gr1(tfg tfgVar, mm6 mm6Var) {
        mm6Var.getClass();
        this.a = tfgVar;
        this.b = mm6Var;
        this.c = new rhp();
    }

    @Override // defpackage.yfg
    public final void a() {
        rar y = x97.y(this.b, null, null, new hl(this, null, 12), 3);
        this.c.d(d[0], y);
    }

    @Override // defpackage.yfg
    public final vfg b() {
        return this.a;
    }

    @Override // defpackage.yfg
    public final void cancel() {
        r2f b = this.c.b(d[0]);
        if (b != null) {
            b.g(null);
        }
    }
}
