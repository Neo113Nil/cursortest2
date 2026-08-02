package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vj2 extends xci implements ipa, ekj {
    public long o;
    public ai3 p;
    public float q;
    public dup r;
    public long s;
    public xof t;
    public ocg u;
    public dup v;
    public ocg w;

    @Override // defpackage.ekj
    public final void J() {
        this.s = 9205357640488583168L;
        this.t = null;
        this.u = null;
        this.v = null;
        vq1.Z(this);
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        ocg ocgVar;
        ocg ocgVar2;
        ou3 ou3Var = opfVar.a;
        if (this.r == vnj.i) {
            if (!d85.c(this.o, d85.n)) {
                jpa.B(opfVar, this.o, 0L, 0L, 0.0f, null, 0, 126);
            }
            ai3 ai3Var = this.p;
            if (ai3Var != null) {
                jpa.A0(opfVar, ai3Var, 0L, 0L, this.q, null, null, 0, 118);
            }
        } else {
            if (nmq.a(ou3Var.e(), this.s) && opfVar.getLayoutDirection() == this.t && Intrinsics.d(this.v, this.r)) {
                ocgVar = this.u;
                ocgVar.getClass();
            } else {
                neg.y(this, new ha0(7, this, opfVar));
                ocgVar = this.w;
                this.w = null;
            }
            this.u = ocgVar;
            this.s = ou3Var.e();
            this.t = opfVar.getLayoutDirection();
            this.v = this.r;
            ocgVar.getClass();
            if (d85.c(this.o, d85.n)) {
                ocgVar2 = ocgVar;
            } else {
                ocgVar2 = ocgVar;
                pcg.z(opfVar, ocgVar2, this.o, null, 60);
            }
            ai3 ai3Var2 = this.p;
            if (ai3Var2 != null) {
                pcg.y(opfVar, ocgVar2, ai3Var2, this.q, 56);
            }
        }
        opfVar.a();
    }
}
