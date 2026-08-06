package defpackage;

/* loaded from: classes.dex */
public final class d81 {
    public final java.util.ArrayList AARZUJiTa;
    public final int F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final boolean adDC3e2L;
    public final java.lang.String oh6vYeIP;
    public final int r1MBDhnF;
    public final boolean xiZrDbcSW0;

    public d81(java.lang.String str, java.lang.String str2, int i, int i2, boolean z, boolean z2, java.util.ArrayList arrayList) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = str2;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = i2;
        this.adDC3e2L = z;
        this.xiZrDbcSW0 = z2;
        this.AARZUJiTa = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.d81)) {
            return false;
        }
        defpackage.d81 d81Var = (defpackage.d81) obj;
        return this.IHQe1A4L2xu.equals(d81Var.IHQe1A4L2xu) && this.oh6vYeIP.equals(d81Var.oh6vYeIP) && this.r1MBDhnF == d81Var.r1MBDhnF && this.F7NU4MC0GW == d81Var.F7NU4MC0GW && this.adDC3e2L == d81Var.adDC3e2L && this.xiZrDbcSW0 == d81Var.xiZrDbcSW0 && this.AARZUJiTa.equals(d81Var.AARZUJiTa);
    }

    public final int hashCode() {
        return this.AARZUJiTa.hashCode() + defpackage.fx0.adDC3e2L(defpackage.fx0.adDC3e2L(defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW, defpackage.fx0.oh6vYeIP(8, defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.F7NU4MC0GW(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP), 31), 31), 31), 31, this.adDC3e2L), 31, this.xiZrDbcSW0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetSectionUi(setId=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", title=");
        sb.append(this.oh6vYeIP);
        sb.append(", progress=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.r1MBDhnF, ", target=8, reward=", this.F7NU4MC0GW, ", claimed=");
        sb.append(this.adDC3e2L);
        sb.append(", canClaim=");
        sb.append(this.xiZrDbcSW0);
        sb.append(", slots=");
        sb.append(this.AARZUJiTa);
        sb.append(")");
        return sb.toString();
    }
}
