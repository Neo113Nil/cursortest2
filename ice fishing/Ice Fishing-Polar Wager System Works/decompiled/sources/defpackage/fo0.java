package defpackage;

/* loaded from: classes.dex */
public final class fo0 {
    public final float F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final long adDC3e2L;
    public final float oh6vYeIP;
    public final float r1MBDhnF;

    public fo0(int i, float f, float f2, float f3, long j) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = f;
        this.r1MBDhnF = f2;
        this.F7NU4MC0GW = f3;
        this.adDC3e2L = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && defpackage.fo0.class == obj.getClass()) {
            defpackage.fo0 fo0Var = (defpackage.fo0) obj;
            return this.r1MBDhnF == fo0Var.r1MBDhnF && this.F7NU4MC0GW == fo0Var.F7NU4MC0GW && this.oh6vYeIP == fo0Var.oh6vYeIP && this.IHQe1A4L2xu == fo0Var.IHQe1A4L2xu && this.adDC3e2L == fo0Var.adDC3e2L;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.adDC3e2L) + defpackage.fx0.oh6vYeIP(this.IHQe1A4L2xu, defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, defpackage.fx0.IHQe1A4L2xu(this.F7NU4MC0GW, java.lang.Float.hashCode(this.r1MBDhnF) * 31, 31), 31), 31);
    }

    public final java.lang.String toString() {
        return "NavigationEvent(touchX=" + this.r1MBDhnF + ", touchY=" + this.F7NU4MC0GW + ", progress=" + this.oh6vYeIP + ", swipeEdge=" + this.IHQe1A4L2xu + ", frameTimeMillis=" + this.adDC3e2L + ')';
    }
}
