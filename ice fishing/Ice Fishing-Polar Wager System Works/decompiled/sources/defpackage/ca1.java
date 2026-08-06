package defpackage;

/* loaded from: classes.dex */
public final class ca1 extends defpackage.lj0 implements defpackage.da0 {
    public float EgCjBq0SZwJ;
    public boolean PAEGRtP0bX;
    public float V7bD7b8KA;
    public float fnWB2E7cs;
    public float kNAkVymC;

    @Override // defpackage.da0
    public final int F7NU4MC0GW(defpackage.zf0 zf0Var, defpackage.di0 di0Var, int i) {
        long UVjEelCZ = UVjEelCZ(zf0Var);
        if (defpackage.ki.xiZrDbcSW0(UVjEelCZ)) {
            return defpackage.ki.EXtogiMhuM(UVjEelCZ);
        }
        if (!this.PAEGRtP0bX) {
            i = defpackage.li.adDC3e2L(i, UVjEelCZ);
        }
        return defpackage.li.xiZrDbcSW0(di0Var.AsxAYCCkb3Hi(i), UVjEelCZ);
    }

    @Override // defpackage.da0
    public final int SH1y5HwkJhh(defpackage.zf0 zf0Var, defpackage.di0 di0Var, int i) {
        long UVjEelCZ = UVjEelCZ(zf0Var);
        if (defpackage.ki.adDC3e2L(UVjEelCZ)) {
            return defpackage.ki.AARZUJiTa(UVjEelCZ);
        }
        if (!this.PAEGRtP0bX) {
            i = defpackage.li.xiZrDbcSW0(i, UVjEelCZ);
        }
        return defpackage.li.adDC3e2L(di0Var.AARZUJiTa(i), UVjEelCZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long UVjEelCZ(defpackage.ki0 ki0Var) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (java.lang.Float.isNaN(this.kNAkVymC)) {
            i = Integer.MAX_VALUE;
        } else {
            i = ki0Var.yIx6ChFVk(this.kNAkVymC);
            if (i < 0) {
                i = 0;
            }
        }
        if (java.lang.Float.isNaN(this.V7bD7b8KA)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = ki0Var.yIx6ChFVk(this.V7bD7b8KA);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!java.lang.Float.isNaN(this.EgCjBq0SZwJ)) {
            i3 = ki0Var.yIx6ChFVk(this.EgCjBq0SZwJ);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!java.lang.Float.isNaN(this.fnWB2E7cs)) {
            int yIx6ChFVk = ki0Var.yIx6ChFVk(this.fnWB2E7cs);
            if (yIx6ChFVk < 0) {
                yIx6ChFVk = 0;
            }
            if (yIx6ChFVk > i2) {
                yIx6ChFVk = i2;
            }
            if (yIx6ChFVk != Integer.MAX_VALUE) {
                i4 = yIx6ChFVk;
            }
        }
        return defpackage.li.IHQe1A4L2xu(i3, i, i4, i2);
    }

    @Override // defpackage.da0
    public final int V7bD7b8KA(defpackage.zf0 zf0Var, defpackage.di0 di0Var, int i) {
        long UVjEelCZ = UVjEelCZ(zf0Var);
        if (defpackage.ki.adDC3e2L(UVjEelCZ)) {
            return defpackage.ki.AARZUJiTa(UVjEelCZ);
        }
        if (!this.PAEGRtP0bX) {
            i = defpackage.li.xiZrDbcSW0(i, UVjEelCZ);
        }
        return defpackage.li.adDC3e2L(di0Var.RmCzwkUxICV(i), UVjEelCZ);
    }

    @Override // defpackage.da0
    public final defpackage.ji0 nVhUznk1t(defpackage.ki0 ki0Var, defpackage.di0 di0Var, long j) {
        int SH1y5HwkJhh;
        int EXtogiMhuM;
        int riuEU0zW4;
        int AARZUJiTa;
        long IHQe1A4L2xu;
        long UVjEelCZ = UVjEelCZ(ki0Var);
        if (this.PAEGRtP0bX) {
            int SH1y5HwkJhh2 = defpackage.ki.SH1y5HwkJhh(j);
            int EXtogiMhuM2 = defpackage.ki.EXtogiMhuM(j);
            int riuEU0zW42 = defpackage.ki.riuEU0zW4(j);
            int AARZUJiTa2 = defpackage.ki.AARZUJiTa(j);
            int SH1y5HwkJhh3 = defpackage.ki.SH1y5HwkJhh(UVjEelCZ);
            if (SH1y5HwkJhh3 < SH1y5HwkJhh2) {
                SH1y5HwkJhh3 = SH1y5HwkJhh2;
            }
            if (SH1y5HwkJhh3 > EXtogiMhuM2) {
                SH1y5HwkJhh3 = EXtogiMhuM2;
            }
            int EXtogiMhuM3 = defpackage.ki.EXtogiMhuM(UVjEelCZ);
            if (EXtogiMhuM3 >= SH1y5HwkJhh2) {
                SH1y5HwkJhh2 = EXtogiMhuM3;
            }
            if (SH1y5HwkJhh2 <= EXtogiMhuM2) {
                EXtogiMhuM2 = SH1y5HwkJhh2;
            }
            int riuEU0zW43 = defpackage.ki.riuEU0zW4(UVjEelCZ);
            if (riuEU0zW43 < riuEU0zW42) {
                riuEU0zW43 = riuEU0zW42;
            }
            if (riuEU0zW43 > AARZUJiTa2) {
                riuEU0zW43 = AARZUJiTa2;
            }
            int AARZUJiTa3 = defpackage.ki.AARZUJiTa(UVjEelCZ);
            if (AARZUJiTa3 >= riuEU0zW42) {
                riuEU0zW42 = AARZUJiTa3;
            }
            if (riuEU0zW42 <= AARZUJiTa2) {
                AARZUJiTa2 = riuEU0zW42;
            }
            IHQe1A4L2xu = defpackage.li.IHQe1A4L2xu(SH1y5HwkJhh3, EXtogiMhuM2, riuEU0zW43, AARZUJiTa2);
        } else {
            if (java.lang.Float.isNaN(this.EgCjBq0SZwJ)) {
                SH1y5HwkJhh = defpackage.ki.SH1y5HwkJhh(j);
                int EXtogiMhuM4 = defpackage.ki.EXtogiMhuM(UVjEelCZ);
                if (SH1y5HwkJhh > EXtogiMhuM4) {
                    SH1y5HwkJhh = EXtogiMhuM4;
                }
            } else {
                SH1y5HwkJhh = defpackage.ki.SH1y5HwkJhh(UVjEelCZ);
            }
            if (java.lang.Float.isNaN(this.kNAkVymC)) {
                EXtogiMhuM = defpackage.ki.EXtogiMhuM(j);
                int SH1y5HwkJhh4 = defpackage.ki.SH1y5HwkJhh(UVjEelCZ);
                if (EXtogiMhuM < SH1y5HwkJhh4) {
                    EXtogiMhuM = SH1y5HwkJhh4;
                }
            } else {
                EXtogiMhuM = defpackage.ki.EXtogiMhuM(UVjEelCZ);
            }
            if (java.lang.Float.isNaN(this.fnWB2E7cs)) {
                riuEU0zW4 = defpackage.ki.riuEU0zW4(j);
                int AARZUJiTa4 = defpackage.ki.AARZUJiTa(UVjEelCZ);
                if (riuEU0zW4 > AARZUJiTa4) {
                    riuEU0zW4 = AARZUJiTa4;
                }
            } else {
                riuEU0zW4 = defpackage.ki.riuEU0zW4(UVjEelCZ);
            }
            if (java.lang.Float.isNaN(this.V7bD7b8KA)) {
                AARZUJiTa = defpackage.ki.AARZUJiTa(j);
                int riuEU0zW44 = defpackage.ki.riuEU0zW4(UVjEelCZ);
                if (AARZUJiTa < riuEU0zW44) {
                    AARZUJiTa = riuEU0zW44;
                }
            } else {
                AARZUJiTa = defpackage.ki.AARZUJiTa(UVjEelCZ);
            }
            IHQe1A4L2xu = defpackage.li.IHQe1A4L2xu(SH1y5HwkJhh, EXtogiMhuM, riuEU0zW4, AARZUJiTa);
        }
        defpackage.bv0 xiZrDbcSW0 = di0Var.xiZrDbcSW0(IHQe1A4L2xu);
        return ki0Var.EoOhNTTfIN7K(xiZrDbcSW0.adDC3e2L, xiZrDbcSW0.xiZrDbcSW0, defpackage.ot.adDC3e2L, new defpackage.v6(xiZrDbcSW0, 3));
    }

    @Override // defpackage.da0
    public final int wll2JLbTBC2(defpackage.zf0 zf0Var, defpackage.di0 di0Var, int i) {
        long UVjEelCZ = UVjEelCZ(zf0Var);
        if (defpackage.ki.xiZrDbcSW0(UVjEelCZ)) {
            return defpackage.ki.EXtogiMhuM(UVjEelCZ);
        }
        if (!this.PAEGRtP0bX) {
            i = defpackage.li.adDC3e2L(i, UVjEelCZ);
        }
        return defpackage.li.xiZrDbcSW0(di0Var.lpprD5VAS(i), UVjEelCZ);
    }
}
