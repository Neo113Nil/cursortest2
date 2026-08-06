package defpackage;

/* loaded from: classes.dex */
public final class m10 {
    public final boolean IHQe1A4L2xu;
    public final boolean oh6vYeIP;
    public final defpackage.jg1 r1MBDhnF;

    public m10(boolean z, boolean z2, defpackage.jg1 jg1Var) {
        jg1Var.getClass();
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = z2;
        this.r1MBDhnF = jg1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.m10)) {
            return false;
        }
        defpackage.m10 m10Var = (defpackage.m10) obj;
        return this.IHQe1A4L2xu == m10Var.IHQe1A4L2xu && this.oh6vYeIP == m10Var.oh6vYeIP && this.r1MBDhnF == m10Var.r1MBDhnF;
    }

    public final int hashCode() {
        return this.r1MBDhnF.hashCode() + defpackage.fx0.adDC3e2L(java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP);
    }

    public final java.lang.String toString() {
        return "GameSettings(soundEnabled=" + this.IHQe1A4L2xu + ", vibrationEnabled=" + this.oh6vYeIP + ", themeMode=" + this.r1MBDhnF + ")";
    }
}
