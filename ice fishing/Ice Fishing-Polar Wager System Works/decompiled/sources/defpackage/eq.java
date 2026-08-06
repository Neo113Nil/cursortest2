package defpackage;

/* loaded from: classes.dex */
public final class eq {
    public final java.lang.String IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final int r1MBDhnF;

    public eq(int i, int i2, java.lang.String str) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = i;
        this.r1MBDhnF = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.eq)) {
            return false;
        }
        defpackage.eq eqVar = (defpackage.eq) obj;
        return this.IHQe1A4L2xu.equals(eqVar.IHQe1A4L2xu) && this.oh6vYeIP == eqVar.oh6vYeIP && this.r1MBDhnF == eqVar.r1MBDhnF;
    }

    public final int hashCode() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.oh6vYeIP);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.r1MBDhnF);
        java.lang.Float valueOf3 = java.lang.Float.valueOf(1.0f);
        return java.util.Objects.hash(this.IHQe1A4L2xu, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final java.lang.String toString() {
        return "DisplayShapeCompat{ spec=" + java.lang.Integer.valueOf(this.IHQe1A4L2xu.hashCode()) + " displayWidth=" + this.oh6vYeIP + " displayHeight=" + this.r1MBDhnF + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
