package defpackage;

/* loaded from: classes.dex */
public final class WnQbjbWuMR {
    public final int F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final int adDC3e2L;
    public final java.lang.String oh6vYeIP;
    public final java.lang.String r1MBDhnF;
    public final boolean xiZrDbcSW0;

    public WnQbjbWuMR(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = str2;
        this.r1MBDhnF = str3;
        this.F7NU4MC0GW = i;
        this.adDC3e2L = i2;
        this.xiZrDbcSW0 = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.WnQbjbWuMR)) {
            return false;
        }
        defpackage.WnQbjbWuMR wnQbjbWuMR = (defpackage.WnQbjbWuMR) obj;
        return this.IHQe1A4L2xu.equals(wnQbjbWuMR.IHQe1A4L2xu) && this.oh6vYeIP.equals(wnQbjbWuMR.oh6vYeIP) && this.r1MBDhnF.equals(wnQbjbWuMR.r1MBDhnF) && this.F7NU4MC0GW == wnQbjbWuMR.F7NU4MC0GW && this.adDC3e2L == wnQbjbWuMR.adDC3e2L && this.xiZrDbcSW0 == wnQbjbWuMR.xiZrDbcSW0;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.xiZrDbcSW0) + defpackage.fx0.oh6vYeIP(this.adDC3e2L, defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW, defpackage.fx0.F7NU4MC0GW(defpackage.fx0.F7NU4MC0GW(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP), 31, this.r1MBDhnF), 31), 31);
    }

    public final java.lang.String toString() {
        return "AchievementUi(id=" + this.IHQe1A4L2xu + ", title=" + this.oh6vYeIP + ", description=" + this.r1MBDhnF + ", progress=" + this.F7NU4MC0GW + ", target=" + this.adDC3e2L + ", unlocked=" + this.xiZrDbcSW0 + ")";
    }
}
