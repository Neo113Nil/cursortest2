package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ojn implements yfg {
    public static final /* synthetic */ s9f[] d;
    public final ufg a;
    public final mm6 b;
    public final rhp c;

    static {
        opi opiVar = new opi(ojn.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        d = new s9f[]{opiVar};
    }

    public ojn(ufg ufgVar, mm6 mm6Var) {
        mm6Var.getClass();
        this.a = ufgVar;
        this.b = mm6Var;
        this.c = new rhp();
    }

    @Override // defpackage.yfg
    public final void a() {
        rar y = x97.y(this.b, dm6.b, null, new s1n(this, (Continuation) null, 14), 2);
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
