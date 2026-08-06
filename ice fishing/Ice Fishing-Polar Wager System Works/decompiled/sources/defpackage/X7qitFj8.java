package defpackage;

/* loaded from: classes.dex */
public final class X7qitFj8 {
    public final boolean AARZUJiTa;
    public final java.util.List F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final int adDC3e2L;
    public final int oh6vYeIP;
    public final java.util.List r1MBDhnF;
    public final int xiZrDbcSW0;

    public X7qitFj8(boolean z, int i, java.util.List list, java.util.List list2, int i2, int i3, boolean z2) {
        list.getClass();
        list2.getClass();
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = i;
        this.r1MBDhnF = list;
        this.F7NU4MC0GW = list2;
        this.adDC3e2L = i2;
        this.xiZrDbcSW0 = i3;
        this.AARZUJiTa = z2;
    }

    public static defpackage.X7qitFj8 IHQe1A4L2xu(defpackage.X7qitFj8 x7qitFj8, boolean z) {
        boolean z2 = x7qitFj8.IHQe1A4L2xu;
        int i = x7qitFj8.oh6vYeIP;
        java.util.List list = x7qitFj8.r1MBDhnF;
        java.util.List list2 = x7qitFj8.F7NU4MC0GW;
        int i2 = x7qitFj8.adDC3e2L;
        int i3 = x7qitFj8.xiZrDbcSW0;
        x7qitFj8.getClass();
        list.getClass();
        list2.getClass();
        return new defpackage.X7qitFj8(z2, i, list, list2, i2, i3, z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.X7qitFj8)) {
            return false;
        }
        defpackage.X7qitFj8 x7qitFj8 = (defpackage.X7qitFj8) obj;
        return this.IHQe1A4L2xu == x7qitFj8.IHQe1A4L2xu && this.oh6vYeIP == x7qitFj8.oh6vYeIP && defpackage.x70.QoRHpC4k(this.r1MBDhnF, x7qitFj8.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, x7qitFj8.F7NU4MC0GW) && this.adDC3e2L == x7qitFj8.adDC3e2L && this.xiZrDbcSW0 == x7qitFj8.xiZrDbcSW0 && this.AARZUJiTa == x7qitFj8.AARZUJiTa;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.AARZUJiTa) + defpackage.fx0.oh6vYeIP(this.xiZrDbcSW0, defpackage.fx0.oh6vYeIP(this.adDC3e2L, (this.F7NU4MC0GW.hashCode() + ((this.r1MBDhnF.hashCode() + defpackage.fx0.oh6vYeIP(this.oh6vYeIP, java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31, 31)) * 31)) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AlbumUiState(loading=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", doubloons=");
        sb.append(this.oh6vYeIP);
        sb.append(", shards=");
        sb.append(this.r1MBDhnF);
        sb.append(", sections=");
        sb.append(this.F7NU4MC0GW);
        sb.append(", relicsOwned=");
        defpackage.fx0.EgCjBq0SZwJ(sb, this.adDC3e2L, ", relicsTotal=", this.xiZrDbcSW0, ", isBusy=");
        sb.append(this.AARZUJiTa);
        sb.append(")");
        return sb.toString();
    }
}
