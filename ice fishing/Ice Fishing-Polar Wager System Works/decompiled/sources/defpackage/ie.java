package defpackage;

/* loaded from: classes.dex */
public abstract class ie {
    public final java.lang.String IHQe1A4L2xu;
    public final long oh6vYeIP;
    public final int r1MBDhnF;

    public ie(java.lang.String str, long j, int i) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = j;
        this.r1MBDhnF = i;
        if (str.length() == 0) {
            defpackage.db.fnWB2E7cs("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            defpackage.db.fnWB2E7cs("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract long F7NU4MC0GW(float f, float f2, float f3);

    public abstract float IHQe1A4L2xu(int i);

    public abstract float adDC3e2L(float f, float f2, float f3);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.ie ieVar = (defpackage.ie) obj;
        if (this.r1MBDhnF == ieVar.r1MBDhnF && this.IHQe1A4L2xu.equals(ieVar.IHQe1A4L2xu)) {
            return defpackage.x70.QQUzIjv3iOC5(this.oh6vYeIP, ieVar.oh6vYeIP);
        }
        return false;
    }

    public int hashCode() {
        return defpackage.fx0.r1MBDhnF(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP) + this.r1MBDhnF;
    }

    public abstract float oh6vYeIP(int i);

    public boolean r1MBDhnF() {
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.IHQe1A4L2xu);
        sb.append(" (id=");
        sb.append(this.r1MBDhnF);
        sb.append(", model=");
        long j = this.oh6vYeIP;
        sb.append((java.lang.Object) (defpackage.x70.QQUzIjv3iOC5(j, 12884901888L) ? "Rgb" : defpackage.x70.QQUzIjv3iOC5(j, 12884901889L) ? "Xyz" : defpackage.x70.QQUzIjv3iOC5(j, 12884901890L) ? "Lab" : defpackage.x70.QQUzIjv3iOC5(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    public abstract long xiZrDbcSW0(float f, float f2, float f3, float f4, defpackage.ie ieVar);
}
