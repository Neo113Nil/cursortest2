package defpackage;

/* loaded from: classes.dex */
public final class t20 implements defpackage.ss0 {
    public final defpackage.v0 AARZUJiTa;
    public float[] DFo87pBq1E5;
    public defpackage.k00 EXtogiMhuM;
    public boolean SyNS6RMn;
    public boolean V7bD7b8KA;
    public boolean abhbClRa;
    public defpackage.q20 adDC3e2L;
    public boolean ez2rX8ReCYw;
    public defpackage.e90 fnWB2E7cs;
    public boolean kNAkVymC;
    public int kd6TUFXn;
    public defpackage.vz riuEU0zW4;
    public final defpackage.p20 xiZrDbcSW0;
    public long SH1y5HwkJhh = 9223372034707292159L;
    public final float[] JlrlGoKF = defpackage.c80.JlrlGoKF();
    public defpackage.qn cnag84Bm = defpackage.x70.xiZrDbcSW0();
    public defpackage.w90 QoRHpC4k = defpackage.w90.adDC3e2L;
    public final defpackage.jb G3OKOH3wZRC = new defpackage.jb();
    public long EgCjBq0SZwJ = defpackage.ci1.oh6vYeIP;
    public boolean PAEGRtP0bX = true;
    public final defpackage.s NHJTzaLwkd = new defpackage.s(15, this);

    public t20(defpackage.q20 q20Var, defpackage.p20 p20Var, defpackage.v0 v0Var, defpackage.k00 k00Var, defpackage.vz vzVar) {
        this.adDC3e2L = q20Var;
        this.xiZrDbcSW0 = p20Var;
        this.AARZUJiTa = v0Var;
        this.EXtogiMhuM = k00Var;
        this.riuEU0zW4 = vzVar;
    }

    public final void AARZUJiTa() {
        defpackage.v0.QoRHpC4k();
        if (this.SyNS6RMn) {
            if (!defpackage.ci1.IHQe1A4L2xu(this.EgCjBq0SZwJ, defpackage.ci1.oh6vYeIP) && !defpackage.i70.IHQe1A4L2xu(this.adDC3e2L.kNAkVymC, this.SH1y5HwkJhh)) {
                defpackage.q20 q20Var = this.adDC3e2L;
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.EgCjBq0SZwJ >> 32)) * ((int) (this.SH1y5HwkJhh >> 32));
                float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.EgCjBq0SZwJ & 4294967295L)) * ((int) (this.SH1y5HwkJhh & 4294967295L));
                long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!defpackage.gq0.oh6vYeIP(q20Var.V7bD7b8KA, floatToRawIntBits)) {
                    q20Var.V7bD7b8KA = floatToRawIntBits;
                    q20Var.IHQe1A4L2xu.hyxIchWRW(floatToRawIntBits);
                }
            }
            defpackage.q20 q20Var2 = this.adDC3e2L;
            defpackage.qn qnVar = this.cnag84Bm;
            defpackage.w90 w90Var = this.QoRHpC4k;
            long j = this.SH1y5HwkJhh;
            long j2 = q20Var2.kNAkVymC;
            defpackage.s20 s20Var = q20Var2.IHQe1A4L2xu;
            if (!defpackage.i70.IHQe1A4L2xu(j2, j)) {
                q20Var2.kNAkVymC = j;
                long j3 = q20Var2.fnWB2E7cs;
                s20Var.D2vUnMij((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (q20Var2.riuEU0zW4 == 9205357640488583168L) {
                    q20Var2.AARZUJiTa = true;
                    q20Var2.IHQe1A4L2xu();
                }
            }
            q20Var2.oh6vYeIP = qnVar;
            q20Var2.r1MBDhnF = w90Var;
            q20Var2.F7NU4MC0GW = this.NHJTzaLwkd;
            s20Var.abhbClRa(qnVar, w90Var, q20Var2, q20Var2.adDC3e2L);
            xiZrDbcSW0(false);
        }
    }

    public final void F7NU4MC0GW(long j) {
        boolean QoRHpC4k = defpackage.v0.QoRHpC4k();
        defpackage.v0 v0Var = this.AARZUJiTa;
        if (QoRHpC4k) {
            v0Var.XZx205DYe(-4.0f);
        }
        defpackage.q20 q20Var = this.adDC3e2L;
        if (!defpackage.z60.IHQe1A4L2xu(q20Var.fnWB2E7cs, j)) {
            q20Var.fnWB2E7cs = j;
            q20Var.IHQe1A4L2xu.D2vUnMij((int) (j >> 32), (int) (j & 4294967295L), q20Var.kNAkVymC);
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            v0Var.invalidate();
            return;
        }
        android.view.ViewParent parent = v0Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(v0Var, v0Var);
        }
    }

    public final float[] IHQe1A4L2xu() {
        float[] fArr = this.DFo87pBq1E5;
        if (fArr == null) {
            fArr = defpackage.c80.JlrlGoKF();
            this.DFo87pBq1E5 = fArr;
        }
        if (this.V7bD7b8KA) {
            this.V7bD7b8KA = false;
            float[] oh6vYeIP = oh6vYeIP();
            if (this.PAEGRtP0bX) {
                return oh6vYeIP;
            }
            if (!defpackage.l80.fnWB2E7cs(oh6vYeIP, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (java.lang.Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final void adDC3e2L(long j) {
        if (defpackage.i70.IHQe1A4L2xu(j, this.SH1y5HwkJhh)) {
            return;
        }
        if (defpackage.v0.QoRHpC4k()) {
            this.AARZUJiTa.XZx205DYe(-4.0f);
        }
        this.SH1y5HwkJhh = j;
        r1MBDhnF();
    }

    public final float[] oh6vYeIP() {
        boolean z = this.kNAkVymC;
        float[] fArr = this.JlrlGoKF;
        if (z) {
            defpackage.q20 q20Var = this.adDC3e2L;
            long j = q20Var.V7bD7b8KA;
            defpackage.s20 s20Var = q20Var.IHQe1A4L2xu;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = defpackage.e90.G3OKOH3wZRC(defpackage.j70.frpfPPIgqM9O(this.SH1y5HwkJhh));
            }
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
            float kd6TUFXn = s20Var.kd6TUFXn();
            float AARZUJiTa = s20Var.AARZUJiTa();
            float PAEGRtP0bX = s20Var.PAEGRtP0bX();
            float frpfPPIgqM9O = s20Var.frpfPPIgqM9O();
            float XZx205DYe = s20Var.XZx205DYe();
            float adDC3e2L = s20Var.adDC3e2L();
            float wll2JLbTBC2 = s20Var.wll2JLbTBC2();
            double d = PAEGRtP0bX * 0.017453292519943295d;
            float sin = (float) java.lang.Math.sin(d);
            float cos = (float) java.lang.Math.cos(d);
            float f = -sin;
            float f2 = (AARZUJiTa * cos) - (0.0f * sin);
            float f3 = (0.0f * cos) + (AARZUJiTa * sin);
            double d2 = frpfPPIgqM9O * 0.017453292519943295d;
            float sin2 = (float) java.lang.Math.sin(d2);
            float cos2 = (float) java.lang.Math.cos(d2);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (kd6TUFXn * cos2);
            float f10 = (f3 * cos2) + ((-kd6TUFXn) * sin2);
            double d3 = XZx205DYe * 0.017453292519943295d;
            float sin3 = (float) java.lang.Math.sin(d3);
            float cos3 = (float) java.lang.Math.cos(d3);
            float f11 = -sin3;
            float f12 = (cos3 * f5) + (f11 * cos2);
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * adDC3e2L;
            float f14 = sin3 * cos * adDC3e2L;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * adDC3e2L;
            float f16 = f12 * wll2JLbTBC2;
            float f17 = cos * cos3 * wll2JLbTBC2;
            float f18 = ((cos3 * f6) + (f11 * f4)) * wll2JLbTBC2;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.kNAkVymC = false;
            this.PAEGRtP0bX = defpackage.l80.V7bD7b8KA(fArr);
        }
        return fArr;
    }

    public final void r1MBDhnF() {
        if (this.SyNS6RMn || this.ez2rX8ReCYw) {
            return;
        }
        this.AARZUJiTa.invalidate();
        xiZrDbcSW0(true);
    }

    public final void xiZrDbcSW0(boolean z) {
        if (z != this.SyNS6RMn) {
            this.SyNS6RMn = z;
            defpackage.v0 v0Var = this.AARZUJiTa;
            defpackage.gl0 gl0Var = v0Var.yIx6ChFVk;
            boolean z2 = v0Var.XZx205DYe;
            if (!z) {
                if (z2) {
                    return;
                }
                gl0Var.SH1y5HwkJhh(this);
                defpackage.gl0 gl0Var2 = v0Var.wll2JLbTBC2;
                if (gl0Var2 != null) {
                    gl0Var2.SH1y5HwkJhh(this);
                    return;
                }
                return;
            }
            if (!z2) {
                gl0Var.IHQe1A4L2xu(this);
                return;
            }
            defpackage.gl0 gl0Var3 = v0Var.wll2JLbTBC2;
            if (gl0Var3 == null) {
                gl0Var3 = new defpackage.gl0();
                v0Var.wll2JLbTBC2 = gl0Var3;
            }
            gl0Var3.IHQe1A4L2xu(this);
        }
    }
}
