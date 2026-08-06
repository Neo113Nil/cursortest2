package defpackage;

/* loaded from: classes.dex */
public final class mt0 extends defpackage.lc1 implements android.os.Parcelable, defpackage.ab1, defpackage.ec1, defpackage.sl0 {
    public static final android.os.Parcelable.Creator<defpackage.mt0> CREATOR = new defpackage.nMM9nLv63p(3);
    public defpackage.xa1 xiZrDbcSW0;

    public mt0(float f) {
        defpackage.oa1 SH1y5HwkJhh = defpackage.wa1.SH1y5HwkJhh();
        defpackage.xa1 xa1Var = new defpackage.xa1(SH1y5HwkJhh.AARZUJiTa(), f);
        if (!(SH1y5HwkJhh instanceof defpackage.l20)) {
            xa1Var.oh6vYeIP = new defpackage.xa1(1L, f);
        }
        this.xiZrDbcSW0 = xa1Var;
    }

    public final float AARZUJiTa() {
        return ((defpackage.xa1) defpackage.wa1.fnWB2E7cs(this.xiZrDbcSW0, this)).r1MBDhnF;
    }

    public final void EXtogiMhuM(float f) {
        defpackage.oa1 SH1y5HwkJhh;
        defpackage.xa1 xa1Var = (defpackage.xa1) defpackage.wa1.EXtogiMhuM(this.xiZrDbcSW0);
        if (xa1Var.r1MBDhnF == f) {
            return;
        }
        defpackage.xa1 xa1Var2 = this.xiZrDbcSW0;
        synchronized (defpackage.wa1.r1MBDhnF) {
            SH1y5HwkJhh = defpackage.wa1.SH1y5HwkJhh();
            ((defpackage.xa1) defpackage.wa1.cnag84Bm(xa1Var2, this, SH1y5HwkJhh, xa1Var)).r1MBDhnF = f;
        }
        defpackage.wa1.SyNS6RMn(SH1y5HwkJhh, this);
    }

    @Override // defpackage.ab1
    public final defpackage.cb1 F7NU4MC0GW() {
        return defpackage.ad1.xiZrDbcSW0;
    }

    @Override // defpackage.kc1
    public final defpackage.mc1 IHQe1A4L2xu() {
        return this.xiZrDbcSW0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ec1
    public final java.lang.Object getValue() {
        return java.lang.Float.valueOf(AARZUJiTa());
    }

    @Override // defpackage.kc1
    public final defpackage.mc1 oh6vYeIP(defpackage.mc1 mc1Var, defpackage.mc1 mc1Var2, defpackage.mc1 mc1Var3) {
        if (((defpackage.xa1) mc1Var2).r1MBDhnF == ((defpackage.xa1) mc1Var3).r1MBDhnF) {
            return mc1Var2;
        }
        return null;
    }

    @Override // defpackage.kc1
    public final void r1MBDhnF(defpackage.mc1 mc1Var) {
        mc1Var.getClass();
        this.xiZrDbcSW0 = (defpackage.xa1) mc1Var;
    }

    @Override // defpackage.sl0
    public final void setValue(java.lang.Object obj) {
        EXtogiMhuM(((java.lang.Number) obj).floatValue());
    }

    public final java.lang.String toString() {
        return "MutableFloatState(value=" + ((defpackage.xa1) defpackage.wa1.EXtogiMhuM(this.xiZrDbcSW0)).r1MBDhnF + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(AARZUJiTa());
    }
}
