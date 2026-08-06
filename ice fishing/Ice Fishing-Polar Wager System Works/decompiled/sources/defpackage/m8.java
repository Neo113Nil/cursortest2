package defpackage;

/* loaded from: classes.dex */
public final class m8 {
    public defpackage.o2 IHQe1A4L2xu = null;
    public defpackage.c0 oh6vYeIP = null;
    public defpackage.jb r1MBDhnF = null;
    public defpackage.y2 F7NU4MC0GW = null;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.m8)) {
            return false;
        }
        defpackage.m8 m8Var = (defpackage.m8) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, m8Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, m8Var.oh6vYeIP) && defpackage.x70.QoRHpC4k(this.r1MBDhnF, m8Var.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, m8Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        defpackage.o2 o2Var = this.IHQe1A4L2xu;
        int hashCode = (o2Var == null ? 0 : o2Var.hashCode()) * 31;
        defpackage.c0 c0Var = this.oh6vYeIP;
        int hashCode2 = (hashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        defpackage.jb jbVar = this.r1MBDhnF;
        int hashCode3 = (hashCode2 + (jbVar == null ? 0 : jbVar.hashCode())) * 31;
        defpackage.y2 y2Var = this.F7NU4MC0GW;
        return hashCode3 + (y2Var != null ? y2Var.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "BorderCache(imageBitmap=" + this.IHQe1A4L2xu + ", canvas=" + this.oh6vYeIP + ", canvasDrawScope=" + this.r1MBDhnF + ", borderPath=" + this.F7NU4MC0GW + ')';
    }
}
