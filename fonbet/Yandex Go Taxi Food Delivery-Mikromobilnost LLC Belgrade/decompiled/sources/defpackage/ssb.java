package defpackage;

/* loaded from: classes10.dex */
public final class ssb implements xyl0 {
    public final tsb a;
    public final uyl0 b;
    public final int c;
    public boolean w;
    public final /* synthetic */ tsb x;

    public ssb(tsb tsbVar, tsb tsbVar2, uyl0 uyl0Var, int i) {
        this.x = tsbVar;
        this.a = tsbVar2;
        this.b = uyl0Var;
        this.c = i;
    }

    public final void a() {
        if (this.w) {
            return;
        }
        tsb tsbVar = this.x;
        xf10 xf10Var = tsbVar.z;
        int[] iArr = tsbVar.b;
        int i = this.c;
        xf10Var.b(iArr[i], tsbVar.c[i], 0, null, tsbVar.M);
        this.w = true;
    }

    @Override // defpackage.xyl0
    public final void b() {
    }

    @Override // defpackage.xyl0
    public final boolean isReady() {
        tsb tsbVar = this.x;
        return !tsbVar.w() && this.b.t(tsbVar.R);
    }

    @Override // defpackage.xyl0
    public final int q(o7s o7sVar, nyg nygVar, int i) {
        tsb tsbVar = this.x;
        if (tsbVar.w()) {
            return -3;
        }
        z35 z35Var = tsbVar.O;
        uyl0 uyl0Var = this.b;
        if (z35Var != null && z35Var.c(this.c + 1) <= uyl0Var.p()) {
            return -3;
        }
        a();
        return uyl0Var.y(o7sVar, nygVar, i, tsbVar.R);
    }

    @Override // defpackage.xyl0
    public final int r(long j) {
        tsb tsbVar = this.x;
        if (tsbVar.w()) {
            return 0;
        }
        boolean z = tsbVar.R;
        uyl0 uyl0Var = this.b;
        int r = uyl0Var.r(j, z);
        z35 z35Var = tsbVar.O;
        if (z35Var != null) {
            r = Math.min(r, z35Var.c(this.c + 1) - uyl0Var.p());
        }
        uyl0Var.D(r);
        if (r > 0) {
            a();
        }
        return r;
    }
}
