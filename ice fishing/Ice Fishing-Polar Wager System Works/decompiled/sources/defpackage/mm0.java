package defpackage;

/* loaded from: classes.dex */
public final class mm0 {
    public final defpackage.eo0 IHQe1A4L2xu;
    public final boolean oh6vYeIP = false;

    public mm0(defpackage.eo0 eo0Var) {
        this.IHQe1A4L2xu = eo0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.mm0.class != obj.getClass()) {
            return false;
        }
        defpackage.mm0 mm0Var = (defpackage.mm0) obj;
        return this.oh6vYeIP == mm0Var.oh6vYeIP && this.IHQe1A4L2xu.equals(mm0Var.IHQe1A4L2xu);
    }

    public final int hashCode() {
        return ((this.IHQe1A4L2xu.hashCode() * 961) + (this.oh6vYeIP ? 1 : 0)) * 31;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(defpackage.sz0.IHQe1A4L2xu(defpackage.mm0.class).r1MBDhnF());
        sb.append(" Type: " + this.IHQe1A4L2xu);
        sb.append(" Nullable: false");
        if (this.oh6vYeIP) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}
