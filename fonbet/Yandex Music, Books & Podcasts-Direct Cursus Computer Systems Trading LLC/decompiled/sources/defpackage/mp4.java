package defpackage;

/* loaded from: classes.dex */
public final class mp4 implements aoo {
    public final aoo a;
    public boolean b;
    public final /* synthetic */ np4 c;

    public mp4(np4 np4Var, aoo aooVar) {
        this.c = np4Var;
        this.a = aooVar;
    }

    @Override // defpackage.aoo
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.aoo
    public final boolean p() {
        return !this.c.d() && this.a.p();
    }

    @Override // defpackage.aoo
    public final int q(qdc qdcVar, qg7 qg7Var, int i) {
        np4 np4Var = this.c;
        if (np4Var.d()) {
            return -3;
        }
        if (this.b) {
            qg7Var.b = 4;
            return -4;
        }
        long r = np4Var.r();
        int q = this.a.q(qdcVar, qg7Var, i);
        if (q != -5) {
            long j = np4Var.f;
            if (j == Long.MIN_VALUE || ((q != -4 || qg7Var.k < j) && !(q == -3 && r == Long.MIN_VALUE && !qg7Var.j))) {
                return q;
            }
            qg7Var.z();
            qg7Var.b = 4;
            this.b = true;
            return -4;
        }
        dsc dscVar = (dsc) qdcVar.c;
        dscVar.getClass();
        int i2 = dscVar.H;
        int i3 = dscVar.G;
        if (i3 == 0 && i2 == 0) {
            return -5;
        }
        if (np4Var.e != 0) {
            i3 = 0;
        }
        if (np4Var.f != Long.MIN_VALUE) {
            i2 = 0;
        }
        bsc a = dscVar.a();
        a.F = i3;
        a.G = i2;
        qdcVar.c = new dsc(a);
        return -5;
    }

    @Override // defpackage.aoo
    public final int x(long j) {
        if (this.c.d()) {
            return -3;
        }
        return this.a.x(j);
    }
}
