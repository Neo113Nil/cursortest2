package defpackage;

/* loaded from: classes.dex */
public final class rlq implements aoo {
    public int a;
    public boolean b;
    public final /* synthetic */ tlq c;

    public rlq(tlq tlqVar) {
        this.c = tlqVar;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        tlq tlqVar = this.c;
        tlqVar.e.y(l5i.i(tlqVar.j.n), tlqVar.j, 0, null, 0L);
        this.b = true;
    }

    @Override // defpackage.aoo
    public final void b() {
        tlq tlqVar = this.c;
        if (tlqVar.k) {
            return;
        }
        tlqVar.i.b();
    }

    @Override // defpackage.aoo
    public final boolean p() {
        return this.c.l;
    }

    @Override // defpackage.aoo
    public final int q(qdc qdcVar, qg7 qg7Var, int i) {
        a();
        tlq tlqVar = this.c;
        boolean z = tlqVar.l;
        if (z && tlqVar.m == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            qg7Var.b(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            qdcVar.c = tlqVar.j;
            this.a = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        tlqVar.m.getClass();
        qg7Var.b(1);
        qg7Var.k = 0L;
        if ((i & 4) == 0) {
            qg7Var.B(tlqVar.n);
            qg7Var.i.put(tlqVar.m, 0, tlqVar.n);
        }
        if ((i & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }

    @Override // defpackage.aoo
    public final int x(long j) {
        a();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }
}
