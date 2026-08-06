package defpackage;

/* loaded from: classes.dex */
public final class d90 {
    public final java.lang.Integer IHQe1A4L2xu;
    public final java.lang.Object oh6vYeIP;

    public d90(java.lang.Integer num, java.lang.Object obj) {
        this.IHQe1A4L2xu = num;
        this.oh6vYeIP = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.d90)) {
            return false;
        }
        defpackage.d90 d90Var = (defpackage.d90) obj;
        return this.IHQe1A4L2xu.equals(d90Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, d90Var.oh6vYeIP);
    }

    public final int hashCode() {
        int hashCode = this.IHQe1A4L2xu.hashCode() * 31;
        java.lang.Object obj = this.oh6vYeIP;
        return (obj instanceof java.lang.Enum ? ((java.lang.Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final java.lang.String toString() {
        return "JoinedKey(left=" + this.IHQe1A4L2xu + ", right=" + this.oh6vYeIP + ')';
    }
}
