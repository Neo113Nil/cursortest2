package defpackage;

/* loaded from: classes.dex */
public final class pv extends defpackage.lj0 implements defpackage.da0 {
    public defpackage.up EgCjBq0SZwJ;
    public float fnWB2E7cs;

    @Override // defpackage.da0
    public final defpackage.ji0 nVhUznk1t(defpackage.ki0 ki0Var, defpackage.di0 di0Var, long j) {
        int SH1y5HwkJhh;
        int EXtogiMhuM;
        int i;
        int i2;
        if (!defpackage.ki.F7NU4MC0GW(j) || this.EgCjBq0SZwJ == defpackage.up.adDC3e2L) {
            SH1y5HwkJhh = defpackage.ki.SH1y5HwkJhh(j);
            EXtogiMhuM = defpackage.ki.EXtogiMhuM(j);
        } else {
            int round = java.lang.Math.round(defpackage.ki.EXtogiMhuM(j) * this.fnWB2E7cs);
            int SH1y5HwkJhh2 = defpackage.ki.SH1y5HwkJhh(j);
            SH1y5HwkJhh = defpackage.ki.EXtogiMhuM(j);
            if (round < SH1y5HwkJhh2) {
                round = SH1y5HwkJhh2;
            }
            if (round <= SH1y5HwkJhh) {
                SH1y5HwkJhh = round;
            }
            EXtogiMhuM = SH1y5HwkJhh;
        }
        if (!defpackage.ki.r1MBDhnF(j) || this.EgCjBq0SZwJ == defpackage.up.xiZrDbcSW0) {
            int riuEU0zW4 = defpackage.ki.riuEU0zW4(j);
            int AARZUJiTa = defpackage.ki.AARZUJiTa(j);
            i = riuEU0zW4;
            i2 = AARZUJiTa;
        } else {
            int round2 = java.lang.Math.round(defpackage.ki.AARZUJiTa(j) * this.fnWB2E7cs);
            int riuEU0zW42 = defpackage.ki.riuEU0zW4(j);
            i = defpackage.ki.AARZUJiTa(j);
            if (round2 < riuEU0zW42) {
                round2 = riuEU0zW42;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        defpackage.bv0 xiZrDbcSW0 = di0Var.xiZrDbcSW0(defpackage.li.IHQe1A4L2xu(SH1y5HwkJhh, EXtogiMhuM, i, i2));
        return ki0Var.EoOhNTTfIN7K(xiZrDbcSW0.adDC3e2L, xiZrDbcSW0.xiZrDbcSW0, defpackage.ot.adDC3e2L, new defpackage.v6(xiZrDbcSW0, 1));
    }
}
