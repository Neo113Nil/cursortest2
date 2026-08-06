package defpackage;

/* loaded from: classes.dex */
public abstract class a91 extends defpackage.h1 {
    public defpackage.sa1 D2vUnMij;
    public long frpfPPIgqM9O = 9205357640488583168L;

    @Override // defpackage.h1
    public final void JlrlGoKF(float f, long j, defpackage.r2 r2Var) {
        android.graphics.Paint paint = (android.graphics.Paint) r2Var.oh6vYeIP;
        defpackage.sa1 sa1Var = this.D2vUnMij;
        if (sa1Var == null || !defpackage.z91.IHQe1A4L2xu(this.frpfPPIgqM9O, j)) {
            if (defpackage.z91.r1MBDhnF(j)) {
                this.D2vUnMij = null;
                this.frpfPPIgqM9O = 9205357640488583168L;
                sa1Var = null;
            } else {
                sa1Var = this.D2vUnMij;
                if (sa1Var == null) {
                    sa1Var = new defpackage.sa1(4);
                    this.D2vUnMij = sa1Var;
                }
                sa1Var.xiZrDbcSW0 = hkbnNdmy(j);
                this.D2vUnMij = sa1Var;
                this.frpfPPIgqM9O = j;
            }
        }
        long F7NU4MC0GW = defpackage.w70.F7NU4MC0GW(paint.getColor());
        long j2 = defpackage.ae.oh6vYeIP;
        if (!defpackage.ae.r1MBDhnF(F7NU4MC0GW, j2)) {
            r2Var.adDC3e2L(j2);
        }
        if (!defpackage.x70.QoRHpC4k((android.graphics.Shader) r2Var.r1MBDhnF, sa1Var != null ? (android.graphics.Shader) sa1Var.xiZrDbcSW0 : null)) {
            r2Var.AARZUJiTa(sa1Var != null ? (android.graphics.Shader) sa1Var.xiZrDbcSW0 : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        r2Var.r1MBDhnF(f);
    }

    public abstract android.graphics.Shader hkbnNdmy(long j);
}
