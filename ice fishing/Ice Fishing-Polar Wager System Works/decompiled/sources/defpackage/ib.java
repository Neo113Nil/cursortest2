package defpackage;

/* loaded from: classes.dex */
public final class ib {
    public long F7NU4MC0GW;
    public defpackage.qn IHQe1A4L2xu;
    public defpackage.w90 oh6vYeIP;
    public defpackage.hb r1MBDhnF;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ib)) {
            return false;
        }
        defpackage.ib ibVar = (defpackage.ib) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, ibVar.IHQe1A4L2xu) && this.oh6vYeIP == ibVar.oh6vYeIP && defpackage.x70.QoRHpC4k(this.r1MBDhnF, ibVar.r1MBDhnF) && defpackage.z91.IHQe1A4L2xu(this.F7NU4MC0GW, ibVar.F7NU4MC0GW);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.F7NU4MC0GW) + ((this.r1MBDhnF.hashCode() + ((this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "DrawParams(density=" + this.IHQe1A4L2xu + ", layoutDirection=" + this.oh6vYeIP + ", canvas=" + this.r1MBDhnF + ", size=" + ((java.lang.Object) defpackage.z91.F7NU4MC0GW(this.F7NU4MC0GW)) + ')';
    }
}
