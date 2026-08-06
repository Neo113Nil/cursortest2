package defpackage;

/* loaded from: classes.dex */
public final class w6 extends defpackage.lj0 implements defpackage.da0 {
    public float EgCjBq0SZwJ;

    @Override // defpackage.da0
    public final int F7NU4MC0GW(defpackage.zf0 zf0Var, defpackage.di0 di0Var, int i) {
        return i != Integer.MAX_VALUE ? java.lang.Math.round(i * this.EgCjBq0SZwJ) : di0Var.AsxAYCCkb3Hi(i);
    }

    public final long H6IrRhrpWoH(long j, boolean z) {
        int round;
        int EXtogiMhuM = defpackage.ki.EXtogiMhuM(j);
        if (EXtogiMhuM == Integer.MAX_VALUE || (round = java.lang.Math.round(EXtogiMhuM / this.EgCjBq0SZwJ)) <= 0) {
            return 0L;
        }
        if (!z || defpackage.gq1.V7bD7b8KA(EXtogiMhuM, round, j)) {
            return (EXtogiMhuM << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.da0
    public final int SH1y5HwkJhh(defpackage.zf0 zf0Var, defpackage.di0 di0Var, int i) {
        return i != Integer.MAX_VALUE ? java.lang.Math.round(i / this.EgCjBq0SZwJ) : di0Var.AARZUJiTa(i);
    }

    public final long UVjEelCZ(long j, boolean z) {
        int round;
        int AARZUJiTa = defpackage.ki.AARZUJiTa(j);
        if (AARZUJiTa == Integer.MAX_VALUE || (round = java.lang.Math.round(AARZUJiTa * this.EgCjBq0SZwJ)) <= 0) {
            return 0L;
        }
        if (!z || defpackage.gq1.V7bD7b8KA(round, AARZUJiTa, j)) {
            return (round << 32) | (AARZUJiTa & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.da0
    public final int V7bD7b8KA(defpackage.zf0 zf0Var, defpackage.di0 di0Var, int i) {
        return i != Integer.MAX_VALUE ? java.lang.Math.round(i / this.EgCjBq0SZwJ) : di0Var.RmCzwkUxICV(i);
    }

    public final long WnQbjbWuMR(long j, boolean z) {
        int SH1y5HwkJhh = defpackage.ki.SH1y5HwkJhh(j);
        int round = java.lang.Math.round(SH1y5HwkJhh / this.EgCjBq0SZwJ);
        if (round <= 0) {
            return 0L;
        }
        if (!z || defpackage.gq1.V7bD7b8KA(SH1y5HwkJhh, round, j)) {
            return (SH1y5HwkJhh << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.da0
    public final defpackage.ji0 nVhUznk1t(defpackage.ki0 ki0Var, defpackage.di0 di0Var, long j) {
        long H6IrRhrpWoH = H6IrRhrpWoH(j, true);
        if (defpackage.i70.IHQe1A4L2xu(H6IrRhrpWoH, 0L)) {
            H6IrRhrpWoH = UVjEelCZ(j, true);
            if (defpackage.i70.IHQe1A4L2xu(H6IrRhrpWoH, 0L)) {
                H6IrRhrpWoH = WnQbjbWuMR(j, true);
                if (defpackage.i70.IHQe1A4L2xu(H6IrRhrpWoH, 0L)) {
                    H6IrRhrpWoH = pm90rNzI5F(j, true);
                    if (defpackage.i70.IHQe1A4L2xu(H6IrRhrpWoH, 0L)) {
                        H6IrRhrpWoH = H6IrRhrpWoH(j, false);
                        if (defpackage.i70.IHQe1A4L2xu(H6IrRhrpWoH, 0L)) {
                            H6IrRhrpWoH = UVjEelCZ(j, false);
                            if (defpackage.i70.IHQe1A4L2xu(H6IrRhrpWoH, 0L)) {
                                H6IrRhrpWoH = WnQbjbWuMR(j, false);
                                if (defpackage.i70.IHQe1A4L2xu(H6IrRhrpWoH, 0L)) {
                                    H6IrRhrpWoH = pm90rNzI5F(j, false);
                                    if (defpackage.i70.IHQe1A4L2xu(H6IrRhrpWoH, 0L)) {
                                        H6IrRhrpWoH = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!defpackage.i70.IHQe1A4L2xu(H6IrRhrpWoH, 0L)) {
            int i = (int) (H6IrRhrpWoH >> 32);
            int i2 = (int) (4294967295L & H6IrRhrpWoH);
            if (!((i >= 0) & (i2 >= 0))) {
                defpackage.z50.IHQe1A4L2xu("width and height must be >= 0");
            }
            j = defpackage.li.AARZUJiTa(i, i, i2, i2);
        }
        defpackage.bv0 xiZrDbcSW0 = di0Var.xiZrDbcSW0(j);
        return ki0Var.EoOhNTTfIN7K(xiZrDbcSW0.adDC3e2L, xiZrDbcSW0.xiZrDbcSW0, defpackage.ot.adDC3e2L, new defpackage.v6(xiZrDbcSW0, 0));
    }

    public final long pm90rNzI5F(long j, boolean z) {
        int riuEU0zW4 = defpackage.ki.riuEU0zW4(j);
        int round = java.lang.Math.round(riuEU0zW4 * this.EgCjBq0SZwJ);
        if (round <= 0) {
            return 0L;
        }
        if (!z || defpackage.gq1.V7bD7b8KA(round, riuEU0zW4, j)) {
            return (round << 32) | (riuEU0zW4 & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.da0
    public final int wll2JLbTBC2(defpackage.zf0 zf0Var, defpackage.di0 di0Var, int i) {
        return i != Integer.MAX_VALUE ? java.lang.Math.round(i * this.EgCjBq0SZwJ) : di0Var.lpprD5VAS(i);
    }
}
