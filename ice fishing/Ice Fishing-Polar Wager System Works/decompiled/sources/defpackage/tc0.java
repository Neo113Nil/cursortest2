package defpackage;

/* loaded from: classes.dex */
public final class tc0 {
    public final java.lang.Object AARZUJiTa;
    public final int DFo87pBq1E5;
    public final java.lang.Object EXtogiMhuM;
    public final defpackage.w90 F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final int JlrlGoKF;
    public final int[] QoRHpC4k;
    public int SH1y5HwkJhh;
    public boolean SyNS6RMn;
    public final int adDC3e2L;
    public int cnag84Bm = Integer.MIN_VALUE;
    public final int ez2rX8ReCYw;
    public final java.util.List oh6vYeIP;
    public final defpackage.c8 r1MBDhnF;
    public final defpackage.qb0 riuEU0zW4;
    public final long xiZrDbcSW0;

    public tc0(int i, java.util.List list, defpackage.c8 c8Var, defpackage.w90 w90Var, int i2, int i3, int i4, long j, java.lang.Object obj, java.lang.Object obj2, defpackage.qb0 qb0Var, long j2) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = list;
        this.r1MBDhnF = c8Var;
        this.F7NU4MC0GW = w90Var;
        this.adDC3e2L = i4;
        this.xiZrDbcSW0 = j;
        this.AARZUJiTa = obj;
        this.EXtogiMhuM = obj2;
        this.riuEU0zW4 = qb0Var;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            defpackage.bv0 bv0Var = (defpackage.bv0) list.get(i7);
            i5 += bv0Var.xiZrDbcSW0;
            i6 = java.lang.Math.max(i6, bv0Var.adDC3e2L);
        }
        this.ez2rX8ReCYw = i5;
        int i8 = i5 + this.adDC3e2L;
        this.JlrlGoKF = i8 >= 0 ? i8 : 0;
        this.DFo87pBq1E5 = i6;
        this.QoRHpC4k = new int[this.oh6vYeIP.size() * 2];
    }

    public final long IHQe1A4L2xu(int i) {
        if (i == 0 && this.oh6vYeIP.size() == 0) {
            return this.SH1y5HwkJhh & 4294967295L;
        }
        int[] iArr = this.QoRHpC4k;
        return (iArr[r5 + 1] & 4294967295L) | (iArr[i * 2] << 32);
    }

    public final void oh6vYeIP(defpackage.av0 av0Var) {
        defpackage.vs0 vs0Var = defpackage.vs0.EXtogiMhuM;
        if (this.cnag84Bm == Integer.MIN_VALUE) {
            defpackage.a60.IHQe1A4L2xu("position() should be called first");
        }
        java.util.List list = this.oh6vYeIP;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.bv0 bv0Var = (defpackage.bv0) list.get(i);
            int i2 = bv0Var.xiZrDbcSW0;
            long IHQe1A4L2xu = IHQe1A4L2xu(i);
            defpackage.fx0.kd6TUFXn(this.riuEU0zW4.IHQe1A4L2xu.AARZUJiTa(this.AARZUJiTa));
            long r1MBDhnF = defpackage.z60.r1MBDhnF(IHQe1A4L2xu, this.xiZrDbcSW0);
            int i3 = defpackage.cv0.oh6vYeIP;
            av0Var.getClass();
            defpackage.av0.IHQe1A4L2xu(av0Var, bv0Var);
            bv0Var.mL9sMlGfef(defpackage.z60.r1MBDhnF(r1MBDhnF, bv0Var.riuEU0zW4), 0.0f, vs0Var);
        }
    }

    public final void r1MBDhnF(int i, int i2, int i3) {
        this.SH1y5HwkJhh = i;
        this.cnag84Bm = i3;
        java.util.List list = this.oh6vYeIP;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            defpackage.bv0 bv0Var = (defpackage.bv0) list.get(i4);
            int i5 = i4 * 2;
            defpackage.c8 c8Var = this.r1MBDhnF;
            if (c8Var == null) {
                defpackage.a60.oh6vYeIP("null horizontalAlignment when isVertical == true");
                throw new defpackage.cf();
            }
            int IHQe1A4L2xu = c8Var.IHQe1A4L2xu(bv0Var.adDC3e2L, i2, this.F7NU4MC0GW);
            int[] iArr = this.QoRHpC4k;
            iArr[i5] = IHQe1A4L2xu;
            iArr[i5 + 1] = i;
            i += bv0Var.xiZrDbcSW0;
        }
    }
}
