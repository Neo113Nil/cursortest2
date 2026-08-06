package defpackage;

/* loaded from: classes.dex */
public final class kf1 {
    public static final defpackage.kf1 r1MBDhnF = new defpackage.kf1(defpackage.e90.kNAkVymC(0), defpackage.e90.kNAkVymC(0));
    public final long IHQe1A4L2xu;
    public final long oh6vYeIP;

    public kf1(long j, long j2) {
        this.IHQe1A4L2xu = j;
        this.oh6vYeIP = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kf1)) {
            return false;
        }
        defpackage.kf1 kf1Var = (defpackage.kf1) obj;
        return defpackage.fg1.IHQe1A4L2xu(this.IHQe1A4L2xu, kf1Var.IHQe1A4L2xu) && defpackage.fg1.IHQe1A4L2xu(this.oh6vYeIP, kf1Var.oh6vYeIP);
    }

    public final int hashCode() {
        defpackage.gg1[] gg1VarArr = defpackage.fg1.oh6vYeIP;
        return java.lang.Long.hashCode(this.oh6vYeIP) + (java.lang.Long.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return "TextIndent(firstLine=" + ((java.lang.Object) defpackage.fg1.F7NU4MC0GW(this.IHQe1A4L2xu)) + ", restLine=" + ((java.lang.Object) defpackage.fg1.F7NU4MC0GW(this.oh6vYeIP)) + ')';
    }
}
