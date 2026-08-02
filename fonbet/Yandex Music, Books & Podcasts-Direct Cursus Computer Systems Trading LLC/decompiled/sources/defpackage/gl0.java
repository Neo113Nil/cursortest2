package defpackage;

import androidx.compose.animation.a;

/* loaded from: classes.dex */
public final class gl0 extends ixe {
    public t7t p;
    public aqi q;
    public hl0 r;
    public long s;

    @Override // defpackage.xci
    public final void M0() {
        this.s = a.a;
    }

    @Override // defpackage.ixe, defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        long j2;
        ksk M = ffhVar.M(j);
        if (mfhVar.F()) {
            j2 = (M.a << 32) | (M.b & 4294967295L);
        } else {
            t7t t7tVar = this.p;
            int i = M.a;
            if (t7tVar == null) {
                j2 = (i << 32) | (M.b & 4294967295L);
                this.s = j2;
            } else {
                long j3 = (M.b & 4294967295L) | (i << 32);
                s7t a = t7tVar.a(new fl0(this, j3, 0), new fl0(this, j3, 1));
                this.r.getClass();
                j2 = ((hqe) a.getValue()).a;
                this.s = ((hqe) a.getValue()).a;
            }
        }
        return mfh.m0(mfhVar, (int) (j2 >> 32), (int) (4294967295L & j2), new el0(this, M, j2));
    }
}
