package defpackage;

/* loaded from: classes.dex */
public final class et0 implements java.io.Serializable {
    public final java.lang.Object adDC3e2L;
    public final java.lang.Object xiZrDbcSW0;

    public et0(java.lang.Object obj, java.lang.Object obj2) {
        this.adDC3e2L = obj;
        this.xiZrDbcSW0 = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.et0)) {
            return false;
        }
        defpackage.et0 et0Var = (defpackage.et0) obj;
        return defpackage.x70.QoRHpC4k(this.adDC3e2L, et0Var.adDC3e2L) && defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, et0Var.xiZrDbcSW0);
    }

    public final int hashCode() {
        java.lang.Object obj = this.adDC3e2L;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.xiZrDbcSW0;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "(" + this.adDC3e2L + ", " + this.xiZrDbcSW0 + ')';
    }
}
