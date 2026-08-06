package defpackage;

/* loaded from: classes.dex */
public final class w11 implements defpackage.qn {
    public long DFo87pBq1E5;
    public int EgCjBq0SZwJ;
    public defpackage.qn G3OKOH3wZRC;
    public float JlrlGoKF;
    public long QoRHpC4k;
    public long SH1y5HwkJhh;
    public defpackage.e91 SyNS6RMn;
    public int adDC3e2L;
    public boolean cnag84Bm;
    public long ez2rX8ReCYw;
    public defpackage.e90 fnWB2E7cs;
    public defpackage.w90 kd6TUFXn;
    public float riuEU0zW4;
    public float xiZrDbcSW0 = 1.0f;
    public float AARZUJiTa = 1.0f;
    public float EXtogiMhuM = 1.0f;

    public w11() {
        long j = defpackage.u20.IHQe1A4L2xu;
        this.SH1y5HwkJhh = j;
        this.ez2rX8ReCYw = j;
        this.JlrlGoKF = 8.0f;
        this.DFo87pBq1E5 = defpackage.ci1.oh6vYeIP;
        this.SyNS6RMn = defpackage.gq1.DFo87pBq1E5;
        this.QoRHpC4k = 9205357640488583168L;
        this.G3OKOH3wZRC = defpackage.x70.xiZrDbcSW0();
        this.kd6TUFXn = defpackage.w90.adDC3e2L;
        this.EgCjBq0SZwJ = 3;
    }

    public final void AARZUJiTa(float f) {
        if (this.AARZUJiTa == f) {
            return;
        }
        this.adDC3e2L |= 2;
        this.AARZUJiTa = f;
    }

    @Override // defpackage.qn
    public final float EXtogiMhuM() {
        return this.G3OKOH3wZRC.EXtogiMhuM();
    }

    public final void F7NU4MC0GW(float f) {
        if (this.EXtogiMhuM == f) {
            return;
        }
        this.adDC3e2L |= 4;
        this.EXtogiMhuM = f;
    }

    public final void IHQe1A4L2xu() {
        xiZrDbcSW0(1.0f);
        AARZUJiTa(1.0f);
        F7NU4MC0GW(1.0f);
        if (this.riuEU0zW4 != 0.0f) {
            this.adDC3e2L |= 32;
            this.riuEU0zW4 = 0.0f;
        }
        long j = defpackage.u20.IHQe1A4L2xu;
        if (!defpackage.ae.r1MBDhnF(this.SH1y5HwkJhh, j)) {
            this.adDC3e2L |= 64;
            this.SH1y5HwkJhh = j;
        }
        if (!defpackage.ae.r1MBDhnF(this.ez2rX8ReCYw, j)) {
            this.adDC3e2L |= 128;
            this.ez2rX8ReCYw = j;
        }
        if (this.JlrlGoKF != 8.0f) {
            this.adDC3e2L |= 2048;
            this.JlrlGoKF = 8.0f;
        }
        SH1y5HwkJhh(defpackage.ci1.oh6vYeIP);
        defpackage.j40 j40Var = defpackage.gq1.DFo87pBq1E5;
        if (!defpackage.x70.QoRHpC4k(this.SyNS6RMn, j40Var)) {
            this.adDC3e2L |= 8192;
            this.SyNS6RMn = j40Var;
        }
        if (this.cnag84Bm) {
            this.adDC3e2L |= 16384;
            this.cnag84Bm = false;
        }
        if (this.EgCjBq0SZwJ != 3) {
            this.adDC3e2L |= 524288;
            this.EgCjBq0SZwJ = 3;
        }
        this.QoRHpC4k = 9205357640488583168L;
        this.fnWB2E7cs = null;
        this.adDC3e2L = 0;
    }

    public final void SH1y5HwkJhh(long j) {
        if (defpackage.ci1.IHQe1A4L2xu(this.DFo87pBq1E5, j)) {
            return;
        }
        this.adDC3e2L |= 4096;
        this.DFo87pBq1E5 = j;
    }

    @Override // defpackage.qn
    public final float oh6vYeIP() {
        return this.G3OKOH3wZRC.oh6vYeIP();
    }

    public final void xiZrDbcSW0(float f) {
        if (this.xiZrDbcSW0 == f) {
            return;
        }
        this.adDC3e2L |= 1;
        this.xiZrDbcSW0 = f;
    }
}
