package defpackage;

/* loaded from: classes.dex */
public final class RmCzwkUxICV extends defpackage.wKlPRKlRnfqr {
    public static defpackage.RmCzwkUxICV adDC3e2L;
    public defpackage.f71 F7NU4MC0GW;
    public defpackage.rf1 r1MBDhnF;
    public static final defpackage.l11 xiZrDbcSW0 = defpackage.l11.xiZrDbcSW0;
    public static final defpackage.l11 AARZUJiTa = defpackage.l11.adDC3e2L;

    @Override // defpackage.wKlPRKlRnfqr
    public final int[] F7NU4MC0GW(int i) {
        int i2;
        if (r1MBDhnF().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            defpackage.f71 f71Var = this.F7NU4MC0GW;
            if (f71Var == null) {
                defpackage.x70.Ye0N2xE9Hc("node");
                throw null;
            }
            defpackage.kz0 AARZUJiTa2 = f71Var.AARZUJiTa();
            int round = java.lang.Math.round(AARZUJiTa2.F7NU4MC0GW - AARZUJiTa2.oh6vYeIP);
            int length = r1MBDhnF().length();
            if (length <= i) {
                i = length;
            }
            defpackage.rf1 rf1Var = this.r1MBDhnF;
            if (rf1Var == null) {
                defpackage.x70.Ye0N2xE9Hc("layoutResult");
                throw null;
            }
            int IHQe1A4L2xu = rf1Var.IHQe1A4L2xu(i);
            defpackage.rf1 rf1Var2 = this.r1MBDhnF;
            if (rf1Var2 == null) {
                defpackage.x70.Ye0N2xE9Hc("layoutResult");
                throw null;
            }
            float F7NU4MC0GW = rf1Var2.F7NU4MC0GW(IHQe1A4L2xu) - round;
            if (F7NU4MC0GW > 0.0f) {
                defpackage.rf1 rf1Var3 = this.r1MBDhnF;
                if (rf1Var3 == null) {
                    defpackage.x70.Ye0N2xE9Hc("layoutResult");
                    throw null;
                }
                i2 = rf1Var3.oh6vYeIP(F7NU4MC0GW);
            } else {
                i2 = 0;
            }
            if (i == r1MBDhnF().length() && i2 < IHQe1A4L2xu) {
                i2++;
            }
            return oh6vYeIP(adDC3e2L(i2, xiZrDbcSW0), i);
        } catch (java.lang.IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.wKlPRKlRnfqr
    public final int[] IHQe1A4L2xu(int i) {
        int i2;
        if (r1MBDhnF().length() > 0 && i < r1MBDhnF().length()) {
            try {
                defpackage.f71 f71Var = this.F7NU4MC0GW;
                if (f71Var == null) {
                    defpackage.x70.Ye0N2xE9Hc("node");
                    throw null;
                }
                defpackage.kz0 AARZUJiTa2 = f71Var.AARZUJiTa();
                int round = java.lang.Math.round(AARZUJiTa2.F7NU4MC0GW - AARZUJiTa2.oh6vYeIP);
                if (i <= 0) {
                    i = 0;
                }
                defpackage.rf1 rf1Var = this.r1MBDhnF;
                if (rf1Var == null) {
                    defpackage.x70.Ye0N2xE9Hc("layoutResult");
                    throw null;
                }
                int IHQe1A4L2xu = rf1Var.IHQe1A4L2xu(i);
                defpackage.rf1 rf1Var2 = this.r1MBDhnF;
                if (rf1Var2 == null) {
                    defpackage.x70.Ye0N2xE9Hc("layoutResult");
                    throw null;
                }
                float F7NU4MC0GW = rf1Var2.F7NU4MC0GW(IHQe1A4L2xu) + round;
                defpackage.rf1 rf1Var3 = this.r1MBDhnF;
                if (rf1Var3 == null) {
                    defpackage.x70.Ye0N2xE9Hc("layoutResult");
                    throw null;
                }
                float F7NU4MC0GW2 = rf1Var3.F7NU4MC0GW(rf1Var3.oh6vYeIP.oh6vYeIP - 1);
                defpackage.rf1 rf1Var4 = this.r1MBDhnF;
                if (F7NU4MC0GW < F7NU4MC0GW2) {
                    if (rf1Var4 == null) {
                        defpackage.x70.Ye0N2xE9Hc("layoutResult");
                        throw null;
                    }
                    i2 = rf1Var4.oh6vYeIP(F7NU4MC0GW);
                } else {
                    if (rf1Var4 == null) {
                        defpackage.x70.Ye0N2xE9Hc("layoutResult");
                        throw null;
                    }
                    i2 = rf1Var4.oh6vYeIP.oh6vYeIP;
                }
                return oh6vYeIP(i, adDC3e2L(i2 - 1, AARZUJiTa) + 1);
            } catch (java.lang.IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int adDC3e2L(int i, defpackage.l11 l11Var) {
        defpackage.rf1 rf1Var = this.r1MBDhnF;
        if (rf1Var == null) {
            defpackage.x70.Ye0N2xE9Hc("layoutResult");
            throw null;
        }
        int r1MBDhnF = rf1Var.r1MBDhnF(i);
        defpackage.rf1 rf1Var2 = this.r1MBDhnF;
        if (rf1Var2 == null) {
            defpackage.x70.Ye0N2xE9Hc("layoutResult");
            throw null;
        }
        defpackage.l11 adDC3e2L2 = rf1Var2.adDC3e2L(r1MBDhnF);
        defpackage.rf1 rf1Var3 = this.r1MBDhnF;
        if (l11Var != adDC3e2L2) {
            if (rf1Var3 != null) {
                return rf1Var3.r1MBDhnF(i);
            }
            defpackage.x70.Ye0N2xE9Hc("layoutResult");
            throw null;
        }
        if (rf1Var3 == null) {
            defpackage.x70.Ye0N2xE9Hc("layoutResult");
            throw null;
        }
        defpackage.nk0 nk0Var = rf1Var3.oh6vYeIP;
        nk0Var.oh6vYeIP(i);
        java.util.ArrayList arrayList = (java.util.ArrayList) nk0Var.adDC3e2L;
        defpackage.t2 t2Var = ((defpackage.gt0) arrayList.get(defpackage.f70.JlrlGoKF(i, arrayList))).IHQe1A4L2xu;
        return (t2Var.F7NU4MC0GW.adDC3e2L(i - r4.F7NU4MC0GW) + r4.oh6vYeIP) - 1;
    }
}
