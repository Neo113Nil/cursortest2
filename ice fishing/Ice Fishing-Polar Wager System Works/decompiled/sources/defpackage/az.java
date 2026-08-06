package defpackage;

/* loaded from: classes.dex */
public final class az implements defpackage.yy {
    public final float[] IHQe1A4L2xu;
    public final float[] oh6vYeIP;

    public az(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            defpackage.db.fnWB2E7cs("Array lengths must match and be nonzero");
            throw null;
        }
        this.IHQe1A4L2xu = fArr;
        this.oh6vYeIP = fArr2;
    }

    @Override // defpackage.yy
    public final float IHQe1A4L2xu(float f) {
        return defpackage.ky.riuEU0zW4(f, this.oh6vYeIP, this.IHQe1A4L2xu);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.az)) {
            return false;
        }
        defpackage.az azVar = (defpackage.az) obj;
        return java.util.Arrays.equals(this.IHQe1A4L2xu, azVar.IHQe1A4L2xu) && java.util.Arrays.equals(this.oh6vYeIP, azVar.oh6vYeIP);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.oh6vYeIP) + (java.util.Arrays.hashCode(this.IHQe1A4L2xu) * 31);
    }

    @Override // defpackage.yy
    public final float oh6vYeIP(float f) {
        return defpackage.ky.riuEU0zW4(f, this.IHQe1A4L2xu, this.oh6vYeIP);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FontScaleConverter{fromSpValues=");
        java.lang.String arrays = java.util.Arrays.toString(this.IHQe1A4L2xu);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        java.lang.String arrays2 = java.util.Arrays.toString(this.oh6vYeIP);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
