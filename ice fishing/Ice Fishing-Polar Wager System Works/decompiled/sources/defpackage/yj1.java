package defpackage;

/* loaded from: classes.dex */
public final class yj1 {
    public final int F7NU4MC0GW;
    public final defpackage.ne1 IHQe1A4L2xu;
    public final java.lang.Object adDC3e2L;
    public final defpackage.dz oh6vYeIP;
    public final int r1MBDhnF;

    public yj1(defpackage.ne1 ne1Var, defpackage.dz dzVar, int i, int i2, java.lang.Object obj) {
        this.IHQe1A4L2xu = ne1Var;
        this.oh6vYeIP = dzVar;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = i2;
        this.adDC3e2L = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.yj1)) {
            return false;
        }
        defpackage.yj1 yj1Var = (defpackage.yj1) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, yj1Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, yj1Var.oh6vYeIP) && this.r1MBDhnF == yj1Var.r1MBDhnF && this.F7NU4MC0GW == yj1Var.F7NU4MC0GW && defpackage.x70.QoRHpC4k(this.adDC3e2L, yj1Var.adDC3e2L);
    }

    public final int hashCode() {
        defpackage.ne1 ne1Var = this.IHQe1A4L2xu;
        int oh6vYeIP = defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW, defpackage.fx0.oh6vYeIP(this.r1MBDhnF, (((ne1Var == null ? 0 : ne1Var.hashCode()) * 31) + this.oh6vYeIP.adDC3e2L) * 31, 31), 31);
        java.lang.Object obj = this.adDC3e2L;
        return oh6vYeIP + (obj != null ? obj.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", fontWeight=");
        sb.append(this.oh6vYeIP);
        sb.append(", fontStyle=");
        java.lang.String str = "Invalid";
        int i = this.r1MBDhnF;
        sb.append((java.lang.Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.F7NU4MC0GW;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((java.lang.Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.adDC3e2L);
        sb.append(')');
        return sb.toString();
    }
}
