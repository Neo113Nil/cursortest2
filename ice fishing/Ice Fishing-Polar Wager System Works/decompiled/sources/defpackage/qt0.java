package defpackage;

/* loaded from: classes.dex */
public final class qt0 extends defpackage.lc1 implements android.os.Parcelable, defpackage.ab1 {
    public static final android.os.Parcelable.Creator<defpackage.qt0> CREATOR = new defpackage.pt0();
    public defpackage.bb1 AARZUJiTa;
    public final defpackage.cb1 xiZrDbcSW0;

    public qt0(java.lang.Object obj, defpackage.cb1 cb1Var) {
        this.xiZrDbcSW0 = cb1Var;
        defpackage.oa1 SH1y5HwkJhh = defpackage.wa1.SH1y5HwkJhh();
        defpackage.bb1 bb1Var = new defpackage.bb1(SH1y5HwkJhh.AARZUJiTa(), obj);
        if (!(SH1y5HwkJhh instanceof defpackage.l20)) {
            bb1Var.oh6vYeIP = new defpackage.bb1(1L, obj);
        }
        this.AARZUJiTa = bb1Var;
    }

    @Override // defpackage.ab1
    public final defpackage.cb1 F7NU4MC0GW() {
        return this.xiZrDbcSW0;
    }

    @Override // defpackage.kc1
    public final defpackage.mc1 IHQe1A4L2xu() {
        return this.AARZUJiTa;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ec1
    public final java.lang.Object getValue() {
        return ((defpackage.bb1) defpackage.wa1.fnWB2E7cs(this.AARZUJiTa, this)).r1MBDhnF;
    }

    @Override // defpackage.kc1
    public final defpackage.mc1 oh6vYeIP(defpackage.mc1 mc1Var, defpackage.mc1 mc1Var2, defpackage.mc1 mc1Var3) {
        if (this.xiZrDbcSW0.F7NU4MC0GW(((defpackage.bb1) mc1Var2).r1MBDhnF, ((defpackage.bb1) mc1Var3).r1MBDhnF)) {
            return mc1Var2;
        }
        return null;
    }

    @Override // defpackage.kc1
    public final void r1MBDhnF(defpackage.mc1 mc1Var) {
        mc1Var.getClass();
        this.AARZUJiTa = (defpackage.bb1) mc1Var;
    }

    @Override // defpackage.sl0
    public final void setValue(java.lang.Object obj) {
        defpackage.oa1 SH1y5HwkJhh;
        defpackage.bb1 bb1Var = (defpackage.bb1) defpackage.wa1.EXtogiMhuM(this.AARZUJiTa);
        if (this.xiZrDbcSW0.F7NU4MC0GW(bb1Var.r1MBDhnF, obj)) {
            return;
        }
        defpackage.bb1 bb1Var2 = this.AARZUJiTa;
        synchronized (defpackage.wa1.r1MBDhnF) {
            SH1y5HwkJhh = defpackage.wa1.SH1y5HwkJhh();
            ((defpackage.bb1) defpackage.wa1.cnag84Bm(bb1Var2, this, SH1y5HwkJhh, bb1Var)).r1MBDhnF = obj;
        }
        defpackage.wa1.SyNS6RMn(SH1y5HwkJhh, this);
    }

    public final java.lang.String toString() {
        return "MutableState(value=" + ((defpackage.bb1) defpackage.wa1.EXtogiMhuM(this.AARZUJiTa)).r1MBDhnF + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        defpackage.n nVar = defpackage.n.QPwENk36pDC;
        defpackage.cb1 cb1Var = this.xiZrDbcSW0;
        if (defpackage.x70.QoRHpC4k(cb1Var, nVar)) {
            i2 = 0;
        } else if (defpackage.x70.QoRHpC4k(cb1Var, defpackage.ad1.xiZrDbcSW0)) {
            i2 = 1;
        } else {
            if (!defpackage.x70.QoRHpC4k(cb1Var, defpackage.n.AsxAYCCkb3Hi)) {
                defpackage.db.AARZUJiTa("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
