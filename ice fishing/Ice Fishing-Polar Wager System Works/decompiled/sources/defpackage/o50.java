package defpackage;

/* loaded from: classes.dex */
public final class o50 {
    public defpackage.sa1 AARZUJiTa;
    public long EXtogiMhuM = 9205357640488583168L;
    public defpackage.l50 F7NU4MC0GW;
    public final defpackage.a61 IHQe1A4L2xu;
    public long JlrlGoKF;
    public final defpackage.p50 SH1y5HwkJhh;
    public defpackage.k50 adDC3e2L;
    public final defpackage.p50 ez2rX8ReCYw;
    public defpackage.j50 oh6vYeIP;
    public defpackage.m50 r1MBDhnF;
    public defpackage.gh1 riuEU0zW4;
    public defpackage.s21 xiZrDbcSW0;

    public o50(defpackage.a61 a61Var) {
        this.IHQe1A4L2xu = a61Var;
        defpackage.p50 p50Var = new defpackage.p50();
        p50Var.oh6vYeIP = new java.util.ArrayList();
        this.SH1y5HwkJhh = p50Var;
        defpackage.p50 p50Var2 = new defpackage.p50();
        p50Var2.oh6vYeIP = new java.util.ArrayList();
        this.ez2rX8ReCYw = p50Var2;
        this.JlrlGoKF = 0L;
    }

    public static void r1MBDhnF(defpackage.o50 o50Var, defpackage.h50 h50Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        defpackage.a61 a61Var = o50Var.IHQe1A4L2xu;
        defpackage.l50 l50Var = o50Var.F7NU4MC0GW;
        if (l50Var == null) {
            l50Var = new defpackage.l50();
            l50Var.DFo87pBq1E5 = null;
            l50Var.SyNS6RMn = Long.MAX_VALUE;
            l50Var.cnag84Bm = false;
            o50Var.F7NU4MC0GW = l50Var;
        }
        l50Var.DFo87pBq1E5 = h50Var;
        l50Var.SyNS6RMn = j;
        defpackage.gh1 gh1Var = o50Var.riuEU0zW4;
        defpackage.ks0 ks0Var = a61Var.kNAkVymC;
        if (gh1Var == null) {
            o50Var.riuEU0zW4 = new defpackage.gh1(ks0Var);
        } else {
            gh1Var.IHQe1A4L2xu = ks0Var;
            gh1Var.oh6vYeIP = j2;
        }
        l50Var.cnag84Bm = false;
        o50Var.xiZrDbcSW0 = l50Var;
    }

    public final defpackage.sa1 F7NU4MC0GW() {
        defpackage.sa1 sa1Var = this.AARZUJiTa;
        if (sa1Var != null) {
            return sa1Var;
        }
        defpackage.db.fnWB2E7cs("Velocity Tracker not initialized.");
        return null;
    }

    public final void IHQe1A4L2xu() {
        defpackage.j50 j50Var = this.oh6vYeIP;
        defpackage.i50 i50Var = defpackage.i50.AARZUJiTa;
        if (j50Var == null) {
            j50Var = new defpackage.j50();
            j50Var.DFo87pBq1E5 = i50Var;
            j50Var.SyNS6RMn = false;
            this.oh6vYeIP = j50Var;
        }
        j50Var.DFo87pBq1E5 = i50Var;
        j50Var.SyNS6RMn = false;
        this.xiZrDbcSW0 = j50Var;
    }

    public final void adDC3e2L(defpackage.h50 h50Var, defpackage.g50 g50Var, long j) {
        defpackage.a61 a61Var = this.IHQe1A4L2xu;
        long F7NU4MC0GW = defpackage.w70.v5iciZok(a61Var).F7NU4MC0GW(0L);
        if (!defpackage.gq0.oh6vYeIP(this.EXtogiMhuM, 9205357640488583168L) && !defpackage.gq0.oh6vYeIP(F7NU4MC0GW, this.EXtogiMhuM)) {
            this.JlrlGoKF = defpackage.gq0.adDC3e2L(this.JlrlGoKF, defpackage.gq0.F7NU4MC0GW(F7NU4MC0GW, this.EXtogiMhuM));
        }
        this.EXtogiMhuM = F7NU4MC0GW;
        defpackage.ks0 ks0Var = a61Var.kNAkVymC;
        ks0Var.getClass();
        if (java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (ks0Var == defpackage.ks0.adDC3e2L ? j & 4294967295L : j >> 32))) > 2.0f) {
            defpackage.mj1.DFo87pBq1E5(F7NU4MC0GW(), h50Var, a61Var.kNAkVymC, g50Var, this.SH1y5HwkJhh, this.JlrlGoKF);
            defpackage.p50 p50Var = this.ez2rX8ReCYw;
            java.util.ArrayList arrayList = p50Var.oh6vYeIP;
            if (arrayList.size() == 3) {
                int i = p50Var.IHQe1A4L2xu;
                p50Var.IHQe1A4L2xu = i + 1;
                arrayList.set(i, new defpackage.gq0(j));
            } else {
                arrayList.add(new defpackage.gq0(j));
            }
            if (p50Var.IHQe1A4L2xu == 3) {
                p50Var.IHQe1A4L2xu = 0;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (((defpackage.gq0) arrayList.get(i2)).IHQe1A4L2xu >> 32))));
            }
            float AQHddgaEX = (float) defpackage.td.AQHddgaEX(arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (((defpackage.gq0) arrayList.get(i3)).IHQe1A4L2xu & 4294967295L))));
            }
            a61Var.nMM9nLv63p(new defpackage.fr((java.lang.Float.floatToRawIntBits((float) defpackage.td.AQHddgaEX(arrayList3)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(AQHddgaEX) << 32), true));
        }
    }

    public final void oh6vYeIP(defpackage.h50 h50Var, long j, defpackage.gh1 gh1Var) {
        defpackage.k50 k50Var = this.adDC3e2L;
        if (k50Var == null) {
            k50Var = new defpackage.k50();
            k50Var.DFo87pBq1E5 = null;
            k50Var.SyNS6RMn = Long.MAX_VALUE;
            this.adDC3e2L = k50Var;
        }
        k50Var.DFo87pBq1E5 = h50Var;
        k50Var.SyNS6RMn = j;
        gh1Var.oh6vYeIP = 0L;
        this.xiZrDbcSW0 = k50Var;
    }

    public final void xiZrDbcSW0(defpackage.h50 h50Var, defpackage.h50 h50Var2, defpackage.g50 g50Var, long j) {
        if (this.AARZUJiTa == null) {
            this.AARZUJiTa = new defpackage.sa1(9);
        }
        this.JlrlGoKF = 0L;
        defpackage.sa1 F7NU4MC0GW = F7NU4MC0GW();
        defpackage.a61 a61Var = this.IHQe1A4L2xu;
        defpackage.mj1.DFo87pBq1E5(F7NU4MC0GW, h50Var, a61Var.kNAkVymC, g50Var, this.SH1y5HwkJhh, this.JlrlGoKF);
        long F7NU4MC0GW2 = defpackage.gq0.F7NU4MC0GW(defpackage.mj1.Uv8CGu3G(h50Var2, a61Var.kNAkVymC, g50Var), j);
        a61Var.V7bD7b8KA.getClass();
        this.EXtogiMhuM = defpackage.w70.v5iciZok(a61Var).F7NU4MC0GW(0L);
        a61Var.nMM9nLv63p(new defpackage.gr(F7NU4MC0GW2));
        defpackage.p50 p50Var = this.ez2rX8ReCYw;
        p50Var.IHQe1A4L2xu = 0;
        p50Var.oh6vYeIP.clear();
    }
}
