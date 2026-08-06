package defpackage;

/* loaded from: classes.dex */
public final class wn {
    public final long IHQe1A4L2xu;
    public final long oh6vYeIP;

    public wn(long j, long j2) {
        this.IHQe1A4L2xu = j;
        this.oh6vYeIP = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.wn)) {
            return false;
        }
        defpackage.wn wnVar = (defpackage.wn) obj;
        return defpackage.i70.IHQe1A4L2xu(this.IHQe1A4L2xu, wnVar.IHQe1A4L2xu) && this.oh6vYeIP == wnVar.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.oh6vYeIP) + (java.lang.Long.hashCode(this.IHQe1A4L2xu) * 31);
    }
}
