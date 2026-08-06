package defpackage;

/* loaded from: classes.dex */
public final class b50 {
    public final int IHQe1A4L2xu;
    public final java.lang.Object oh6vYeIP;

    public b50(int i, java.lang.Object obj) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.b50)) {
            return false;
        }
        defpackage.b50 b50Var = (defpackage.b50) obj;
        return this.IHQe1A4L2xu == b50Var.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(this.oh6vYeIP, b50Var.oh6vYeIP);
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31;
        java.lang.Object obj = this.oh6vYeIP;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        return "IndexedValue(index=" + this.IHQe1A4L2xu + ", value=" + this.oh6vYeIP + ')';
    }
}
