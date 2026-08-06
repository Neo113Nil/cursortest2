package defpackage;

/* loaded from: classes.dex */
public final class ro {
    public final boolean F7NU4MC0GW;
    public final defpackage.o80 IHQe1A4L2xu;
    public final java.util.ArrayList oh6vYeIP;
    public final int r1MBDhnF;

    public ro(defpackage.o80 o80Var, java.util.ArrayList arrayList, int i, boolean z) {
        this.IHQe1A4L2xu = o80Var;
        this.oh6vYeIP = arrayList;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ro)) {
            return false;
        }
        defpackage.ro roVar = (defpackage.ro) obj;
        return this.IHQe1A4L2xu.equals(roVar.IHQe1A4L2xu) && this.oh6vYeIP.equals(roVar.oh6vYeIP) && this.r1MBDhnF == roVar.r1MBDhnF && this.F7NU4MC0GW == roVar.F7NU4MC0GW;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.F7NU4MC0GW) + defpackage.fx0.oh6vYeIP(this.r1MBDhnF, (this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31, 31);
    }

    public final java.lang.String toString() {
        return "DigBoard(island=" + this.IHQe1A4L2xu + ", cells=" + this.oh6vYeIP + ", movesLeft=" + this.r1MBDhnF + ", finished=" + this.F7NU4MC0GW + ")";
    }
}
