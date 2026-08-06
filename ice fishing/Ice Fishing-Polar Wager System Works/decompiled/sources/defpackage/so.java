package defpackage;

/* loaded from: classes.dex */
public final class so {
    public final int IHQe1A4L2xu;
    public final defpackage.yo oh6vYeIP;
    public final boolean r1MBDhnF;

    public so(int i, defpackage.yo yoVar, boolean z) {
        yoVar.getClass();
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = yoVar;
        this.r1MBDhnF = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.so)) {
            return false;
        }
        defpackage.so soVar = (defpackage.so) obj;
        return this.IHQe1A4L2xu == soVar.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(this.oh6vYeIP, soVar.oh6vYeIP) && this.r1MBDhnF == soVar.r1MBDhnF;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.r1MBDhnF) + ((this.oh6vYeIP.hashCode() + (java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "DigCell(index=" + this.IHQe1A4L2xu + ", content=" + this.oh6vYeIP + ", revealed=" + this.r1MBDhnF + ")";
    }
}
