package defpackage;

/* loaded from: classes.dex */
public abstract class P82Dd68gK implements defpackage.u00, java.io.Serializable {
    public final java.lang.String AARZUJiTa;
    public final java.lang.String EXtogiMhuM;
    public final int SH1y5HwkJhh;
    public final java.lang.Object adDC3e2L;
    public final int ez2rX8ReCYw;
    public final boolean riuEU0zW4 = false;
    public final java.lang.Class xiZrDbcSW0;

    public P82Dd68gK(int i, int i2, java.lang.Class cls, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        this.adDC3e2L = obj;
        this.xiZrDbcSW0 = cls;
        this.AARZUJiTa = str;
        this.EXtogiMhuM = str2;
        this.SH1y5HwkJhh = i;
        this.ez2rX8ReCYw = i2 >> 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.P82Dd68gK)) {
            return false;
        }
        defpackage.P82Dd68gK p82Dd68gK = (defpackage.P82Dd68gK) obj;
        return this.riuEU0zW4 == p82Dd68gK.riuEU0zW4 && this.SH1y5HwkJhh == p82Dd68gK.SH1y5HwkJhh && this.ez2rX8ReCYw == p82Dd68gK.ez2rX8ReCYw && this.adDC3e2L.equals(p82Dd68gK.adDC3e2L) && this.xiZrDbcSW0.equals(p82Dd68gK.xiZrDbcSW0) && this.AARZUJiTa.equals(p82Dd68gK.AARZUJiTa) && this.EXtogiMhuM.equals(p82Dd68gK.EXtogiMhuM);
    }

    public final int hashCode() {
        return ((((defpackage.fx0.F7NU4MC0GW(defpackage.fx0.F7NU4MC0GW((this.xiZrDbcSW0.hashCode() + (this.adDC3e2L.hashCode() * 31)) * 31, 31, this.AARZUJiTa), 31, this.EXtogiMhuM) + (this.riuEU0zW4 ? 1231 : 1237)) * 31) + this.SH1y5HwkJhh) * 31) + this.ez2rX8ReCYw;
    }

    @Override // defpackage.u00
    public final int oh6vYeIP() {
        return this.SH1y5HwkJhh;
    }

    public final java.lang.String toString() {
        defpackage.sz0.IHQe1A4L2xu.getClass();
        return defpackage.tz0.IHQe1A4L2xu(this);
    }
}
