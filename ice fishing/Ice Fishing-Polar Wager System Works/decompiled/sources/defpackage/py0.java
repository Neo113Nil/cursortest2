package defpackage;

/* loaded from: classes.dex */
public final class py0 extends defpackage.a91 {
    public final java.util.List SiPhmbmu;
    public final long p4kuH6PDtgom;
    public final float yIx6ChFVk;

    public py0(java.util.List list, long j, float f) {
        this.SiPhmbmu = list;
        this.p4kuH6PDtgom = j;
        this.yIx6ChFVk = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.py0)) {
            return false;
        }
        defpackage.py0 py0Var = (defpackage.py0) obj;
        return this.SiPhmbmu.equals(py0Var.SiPhmbmu) && defpackage.gq0.oh6vYeIP(this.p4kuH6PDtgom, py0Var.p4kuH6PDtgom) && this.yIx6ChFVk == py0Var.yIx6ChFVk;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(0) + defpackage.fx0.IHQe1A4L2xu(this.yIx6ChFVk, defpackage.fx0.r1MBDhnF(this.SiPhmbmu.hashCode() * 961, 31, this.p4kuH6PDtgom), 31);
    }

    @Override // defpackage.a91
    public final android.graphics.Shader hkbnNdmy(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.p4kuH6PDtgom;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long G3OKOH3wZRC = defpackage.e90.G3OKOH3wZRC(j);
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (G3OKOH3wZRC >> 32));
            intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (G3OKOH3wZRC & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (java.lang.Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = java.lang.Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (java.lang.Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
        float f = this.yIx6ChFVk;
        if (f == Float.POSITIVE_INFINITY) {
            f = defpackage.z91.oh6vYeIP(j) / 2.0f;
        }
        float f2 = f;
        java.util.List list = this.SiPhmbmu;
        defpackage.gq1.p4kuH6PDtgom(list);
        int cnag84Bm = defpackage.gq1.cnag84Bm(list);
        return new android.graphics.RadialGradient(java.lang.Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), java.lang.Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f2, defpackage.gq1.PAEGRtP0bX(cnag84Bm, list), defpackage.gq1.abhbClRa(cnag84Bm, list), android.graphics.Shader.TileMode.CLAMP);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        long j = this.p4kuH6PDtgom;
        java.lang.String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((java.lang.Object) defpackage.gq0.AARZUJiTa(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.yIx6ChFVk;
        if ((java.lang.Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.SiPhmbmu + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
