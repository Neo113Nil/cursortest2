package defpackage;

/* loaded from: classes.dex */
public final class hq0 implements defpackage.b6, defpackage.pl1 {
    public final java.lang.Object AARZUJiTa;
    public final int adDC3e2L;
    public int xiZrDbcSW0;

    public hq0(int i, int i2, defpackage.ds dsVar) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = new defpackage.y((defpackage.cw) new defpackage.gw(i, i2, dsVar));
    }

    @Override // defpackage.b6
    public void DFo87pBq1E5(defpackage.k00 k00Var, java.lang.Object obj) {
        ((defpackage.b6) this.AARZUJiTa).DFo87pBq1E5(k00Var, obj);
    }

    @Override // defpackage.b6
    public void EXtogiMhuM(int i, int i2, int i3) {
        int i4 = this.xiZrDbcSW0 == 0 ? this.adDC3e2L : 0;
        ((defpackage.b6) this.AARZUJiTa).EXtogiMhuM(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.b6
    public void F7NU4MC0GW(java.lang.Object obj) {
        this.xiZrDbcSW0++;
        ((defpackage.b6) this.AARZUJiTa).F7NU4MC0GW(obj);
    }

    @Override // defpackage.b6
    public void G3OKOH3wZRC() {
        if (this.xiZrDbcSW0 <= 0) {
            defpackage.dh.IHQe1A4L2xu("OffsetApplier up called with no corresponding down");
        }
        this.xiZrDbcSW0--;
        ((defpackage.b6) this.AARZUJiTa).G3OKOH3wZRC();
    }

    @Override // defpackage.nl1
    public defpackage.i5 JlrlGoKF(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        return ((defpackage.y) this.AARZUJiTa).JlrlGoKF(j, i5Var, i5Var2, i5Var3);
    }

    @Override // defpackage.b6
    public void SH1y5HwkJhh(int i, int i2) {
        ((defpackage.b6) this.AARZUJiTa).SH1y5HwkJhh(i + (this.xiZrDbcSW0 == 0 ? this.adDC3e2L : 0), i2);
    }

    @Override // defpackage.pl1
    public int SyNS6RMn() {
        return this.adDC3e2L;
    }

    @Override // defpackage.b6
    public void adDC3e2L() {
        ((defpackage.b6) this.AARZUJiTa).adDC3e2L();
    }

    @Override // defpackage.nl1
    public defpackage.i5 cnag84Bm(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        return ((defpackage.y) this.AARZUJiTa).cnag84Bm(j, i5Var, i5Var2, i5Var3);
    }

    @Override // defpackage.pl1
    public int ez2rX8ReCYw() {
        return this.xiZrDbcSW0;
    }

    @Override // defpackage.b6
    public void r1MBDhnF(int i, java.lang.Object obj) {
        ((defpackage.b6) this.AARZUJiTa).r1MBDhnF(i + (this.xiZrDbcSW0 == 0 ? this.adDC3e2L : 0), obj);
    }

    @Override // defpackage.b6
    public java.lang.Object riuEU0zW4() {
        return ((defpackage.b6) this.AARZUJiTa).riuEU0zW4();
    }

    @Override // defpackage.b6
    public void xiZrDbcSW0(int i, java.lang.Object obj) {
        ((defpackage.b6) this.AARZUJiTa).xiZrDbcSW0(i + (this.xiZrDbcSW0 == 0 ? this.adDC3e2L : 0), obj);
    }

    public hq0(defpackage.b6 b6Var, int i) {
        this.AARZUJiTa = b6Var;
        this.adDC3e2L = i;
    }
}
