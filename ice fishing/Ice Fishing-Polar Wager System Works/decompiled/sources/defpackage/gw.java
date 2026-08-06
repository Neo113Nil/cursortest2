package defpackage;

/* loaded from: classes.dex */
public final class gw implements defpackage.cw {
    public final long F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final defpackage.ds oh6vYeIP;
    public final long r1MBDhnF;

    public gw(int i, int i2, defpackage.ds dsVar) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = dsVar;
        this.r1MBDhnF = i * 1000000;
        this.F7NU4MC0GW = i2 * 1000000;
    }

    @Override // defpackage.cw
    public final long F7NU4MC0GW(float f, float f2, float f3) {
        return this.F7NU4MC0GW + this.r1MBDhnF;
    }

    @Override // defpackage.cw
    public final float oh6vYeIP(long j, float f, float f2, float f3) {
        long j2 = j - this.F7NU4MC0GW;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.r1MBDhnF;
        if (j2 > j3) {
            j2 = j3;
        }
        float oh6vYeIP = this.oh6vYeIP.oh6vYeIP(this.IHQe1A4L2xu == 0 ? 1.0f : j2 / j3);
        return (f2 * oh6vYeIP) + ((1.0f - oh6vYeIP) * f);
    }

    @Override // defpackage.cw
    public final float r1MBDhnF(long j, float f, float f2, float f3) {
        long j2 = j - this.F7NU4MC0GW;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.r1MBDhnF;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (oh6vYeIP(j4, f, f2, f3) - oh6vYeIP(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }
}
