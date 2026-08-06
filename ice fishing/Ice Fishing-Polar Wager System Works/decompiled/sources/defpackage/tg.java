package defpackage;

/* loaded from: classes.dex */
public final class tg {
    public final int IHQe1A4L2xu;
    public final java.lang.Integer oh6vYeIP;

    public tg(int i, defpackage.x80 x80Var, java.lang.Integer num) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.tg)) {
            return false;
        }
        defpackage.tg tgVar = (defpackage.tg) obj;
        return this.IHQe1A4L2xu == tgVar.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(null, null) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, tgVar.oh6vYeIP);
    }

    public final int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31) + 0) * 31;
        java.lang.Integer num = this.oh6vYeIP;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.IHQe1A4L2xu + ", sourceInfo=" + ((java.lang.Object) null) + ", groupOffset=" + this.oh6vYeIP + ')';
    }
}
