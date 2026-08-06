package defpackage;

/* loaded from: classes.dex */
public final class sd {
    public final int IHQe1A4L2xu;
    public final int oh6vYeIP;

    public sd(int i, int i2) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.sd)) {
            return false;
        }
        defpackage.sd sdVar = (defpackage.sd) obj;
        return this.IHQe1A4L2xu == sdVar.IHQe1A4L2xu && this.oh6vYeIP == sdVar.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.oh6vYeIP) + (java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return "CollectionInfo(rowCount=" + this.IHQe1A4L2xu + ", columnCount=" + this.oh6vYeIP + ')';
    }
}
