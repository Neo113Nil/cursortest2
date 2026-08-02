package defpackage;

import androidx.compose.animation.b;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qmq extends ixe {
    public tm0 p;
    public long q;
    public long r;
    public boolean s;
    public final x6k t;

    public qmq(tm0 tm0Var) {
        super(1);
        this.p = tm0Var;
        this.q = b.a;
        this.r = ia6.b(0, 0, 15);
        this.t = szf.g0(null);
    }

    @Override // defpackage.xci
    public final void K0() {
        this.q = b.a;
        this.s = false;
    }

    @Override // defpackage.xci
    public final void M0() {
        this.t.setValue(null);
    }

    @Override // defpackage.ixe, defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ksk M;
        char c;
        long j2;
        omq omqVar;
        long d;
        omq omqVar2;
        if (mfhVar.F()) {
            this.r = j;
            this.s = true;
            M = ffhVar.M(j);
        } else {
            M = ffhVar.M(this.s ? this.r : j);
        }
        ksk kskVar = M;
        long j3 = (kskVar.b & 4294967295L) | (kskVar.a << 32);
        if (mfhVar.F()) {
            this.q = j3;
            c = ' ';
            d = j3;
            j2 = d;
        } else {
            long j4 = !hqe.a(this.q, b.a) ? this.q : j3;
            x6k x6kVar = this.t;
            omq omqVar3 = (omq) x6kVar.getValue();
            if (omqVar3 != null) {
                fk0 fk0Var = omqVar3.a;
                c = ' ';
                j2 = j3;
                boolean z = (hqe.a(j4, ((hqe) fk0Var.e()).a) || ((Boolean) fk0Var.d.getValue()).booleanValue()) ? false : true;
                if (!hqe.a(j4, ((hqe) fk0Var.e.getValue()).a) || z) {
                    omqVar3.b = ((hqe) fk0Var.e()).a;
                    omqVar2 = omqVar3;
                    x97.y(G0(), null, null, new f84(omqVar2, j4, this, (Continuation) null), 3);
                } else {
                    omqVar2 = omqVar3;
                }
                omqVar = omqVar2;
            } else {
                c = ' ';
                j2 = j3;
                long j5 = 1;
                omqVar = new omq(new fk0(new hqe(j4), azt.h, new hqe((j5 << 32) | (j5 & 4294967295L)), 8), j4);
            }
            x6kVar.setValue(omqVar);
            d = ia6.d(j, ((hqe) omqVar.a.e()).a);
        }
        int i = (int) (d >> c);
        int i2 = (int) (d & 4294967295L);
        return mfh.m0(mfhVar, i, i2, new pmq(this, j2, i, i2, mfhVar, kskVar));
    }
}
