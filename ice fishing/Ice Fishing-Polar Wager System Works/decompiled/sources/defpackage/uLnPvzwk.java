package defpackage;

/* loaded from: classes.dex */
public final class uLnPvzwk {
    public final boolean IHQe1A4L2xu;
    public final java.lang.String oh6vYeIP;

    public uLnPvzwk(java.lang.String str, boolean z) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.uLnPvzwk)) {
            return false;
        }
        defpackage.uLnPvzwk ulnpvzwk = (defpackage.uLnPvzwk) obj;
        return this.IHQe1A4L2xu == ulnpvzwk.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(this.oh6vYeIP, ulnpvzwk.oh6vYeIP);
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31;
        java.lang.String str = this.oh6vYeIP;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "ActionOutcome(ok=" + this.IHQe1A4L2xu + ", message=" + this.oh6vYeIP + ")";
    }
}
