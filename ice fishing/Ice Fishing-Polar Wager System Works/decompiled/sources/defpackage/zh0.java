package defpackage;

/* loaded from: classes.dex */
public final class zh0 {
    public final java.lang.String IHQe1A4L2xu;
    public final defpackage.d70 oh6vYeIP;

    public zh0(java.lang.String str, defpackage.d70 d70Var) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = d70Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.zh0)) {
            return false;
        }
        defpackage.zh0 zh0Var = (defpackage.zh0) obj;
        return this.IHQe1A4L2xu.equals(zh0Var.IHQe1A4L2xu) && this.oh6vYeIP.equals(zh0Var.oh6vYeIP);
    }

    public final int hashCode() {
        return this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "MatchGroup(value=" + this.IHQe1A4L2xu + ", range=" + this.oh6vYeIP + ')';
    }
}
