package defpackage;

/* loaded from: classes.dex */
public final class vf1 {
    public final int IHQe1A4L2xu;
    public final boolean oh6vYeIP;
    public static final defpackage.vf1 r1MBDhnF = new defpackage.vf1(2, false);
    public static final defpackage.vf1 F7NU4MC0GW = new defpackage.vf1(1, true);

    public vf1(int i, boolean z) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.vf1)) {
            return false;
        }
        defpackage.vf1 vf1Var = (defpackage.vf1) obj;
        return this.IHQe1A4L2xu == vf1Var.IHQe1A4L2xu && this.oh6vYeIP == vf1Var.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.oh6vYeIP) + (java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return equals(r1MBDhnF) ? "TextMotion.Static" : equals(F7NU4MC0GW) ? "TextMotion.Animated" : "Invalid";
    }
}
