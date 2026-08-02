package defpackage;

/* loaded from: classes10.dex */
public final class yhs0 implements xyl0 {
    public int a;
    public boolean b;
    public final /* synthetic */ ais0 c;

    public yhs0(ais0 ais0Var) {
        this.c = ais0Var;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ais0 ais0Var = this.c;
        ais0Var.x.b(eh20.i(ais0Var.C.n), ais0Var.C, 0, null, 0L);
        this.b = true;
    }

    @Override // defpackage.xyl0
    public final void b() {
        ais0 ais0Var = this.c;
        if (ais0Var.D) {
            return;
        }
        ais0Var.B.b();
    }

    @Override // defpackage.xyl0
    public final boolean isReady() {
        return this.c.E;
    }

    @Override // defpackage.xyl0
    public final int q(o7s o7sVar, nyg nygVar, int i) {
        a();
        ais0 ais0Var = this.c;
        boolean z = ais0Var.E;
        if (z && ais0Var.F == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            nygVar.a(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            o7sVar.b = ais0Var.C;
            this.a = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        ais0Var.F.getClass();
        nygVar.a(1);
        nygVar.y = 0L;
        if ((i & 4) == 0) {
            nygVar.f(ais0Var.G);
            nygVar.w.put(ais0Var.F, 0, ais0Var.G);
        }
        if ((i & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }

    @Override // defpackage.xyl0
    public final int r(long j) {
        a();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }
}
