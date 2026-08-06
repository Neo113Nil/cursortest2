package defpackage;

/* loaded from: classes.dex */
public final class me0 extends defpackage.a91 {
    public final java.util.List SiPhmbmu;
    public final long p4kuH6PDtgom;
    public final long yIx6ChFVk;

    public me0(java.util.List list, long j, long j2) {
        this.SiPhmbmu = list;
        this.p4kuH6PDtgom = j;
        this.yIx6ChFVk = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.me0)) {
            return false;
        }
        defpackage.me0 me0Var = (defpackage.me0) obj;
        return this.SiPhmbmu.equals(me0Var.SiPhmbmu) && defpackage.gq0.oh6vYeIP(this.p4kuH6PDtgom, me0Var.p4kuH6PDtgom) && defpackage.gq0.oh6vYeIP(this.yIx6ChFVk, me0Var.yIx6ChFVk);
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(0) + defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(this.SiPhmbmu.hashCode() * 961, 31, this.p4kuH6PDtgom), 31, this.yIx6ChFVk);
    }

    @Override // defpackage.a91
    public final android.graphics.Shader hkbnNdmy(long j) {
        long j2 = this.p4kuH6PDtgom;
        int i = (int) (j2 >> 32);
        if (java.lang.Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        long j3 = this.yIx6ChFVk;
        int i3 = (int) (j3 >> 32);
        if (java.lang.Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat(i4);
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (java.lang.Float.floatToRawIntBits(intBitsToFloat3) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        java.util.List list = this.SiPhmbmu;
        defpackage.gq1.p4kuH6PDtgom(list);
        int cnag84Bm = defpackage.gq1.cnag84Bm(list);
        return new android.graphics.LinearGradient(java.lang.Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), java.lang.Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), java.lang.Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), java.lang.Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)), defpackage.gq1.PAEGRtP0bX(cnag84Bm, list), defpackage.gq1.abhbClRa(cnag84Bm, list), android.graphics.Shader.TileMode.CLAMP);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        long j = this.p4kuH6PDtgom;
        java.lang.String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((java.lang.Object) defpackage.gq0.AARZUJiTa(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.yIx6ChFVk;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((java.lang.Object) defpackage.gq0.AARZUJiTa(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.SiPhmbmu + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
