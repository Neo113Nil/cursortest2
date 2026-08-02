package defpackage;

/* loaded from: classes.dex */
public final class vk4 implements aoo {
    public final wk4 a;
    public final zno b;
    public final int c;
    public boolean d;
    public final /* synthetic */ wk4 e;

    public vk4(wk4 wk4Var, wk4 wk4Var2, zno znoVar, int i) {
        this.e = wk4Var;
        this.a = wk4Var2;
        this.b = znoVar;
        this.c = i;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        wk4 wk4Var = this.e;
        x0 x0Var = wk4Var.g;
        int[] iArr = wk4Var.b;
        int i = this.c;
        x0Var.y(iArr[i], wk4Var.c[i], 0, null, wk4Var.t);
        this.d = true;
    }

    @Override // defpackage.aoo
    public final boolean p() {
        wk4 wk4Var = this.e;
        return !wk4Var.z() && this.b.t(wk4Var.y);
    }

    @Override // defpackage.aoo
    public final int q(qdc qdcVar, qg7 qg7Var, int i) {
        wk4 wk4Var = this.e;
        if (wk4Var.z()) {
            return -3;
        }
        fs2 fs2Var = wk4Var.v;
        zno znoVar = this.b;
        if (fs2Var != null && fs2Var.d(this.c + 1) <= znoVar.p()) {
            return -3;
        }
        a();
        return znoVar.y(qdcVar, qg7Var, i, wk4Var.y);
    }

    @Override // defpackage.aoo
    public final int x(long j) {
        wk4 wk4Var = this.e;
        if (wk4Var.z()) {
            return 0;
        }
        boolean z = wk4Var.y;
        zno znoVar = this.b;
        int r = znoVar.r(j, z);
        fs2 fs2Var = wk4Var.v;
        if (fs2Var != null) {
            r = Math.min(r, fs2Var.d(this.c + 1) - znoVar.p());
        }
        znoVar.D(r);
        if (r > 0) {
            a();
        }
        return r;
    }

    @Override // defpackage.aoo
    public final void b() {
    }
}
