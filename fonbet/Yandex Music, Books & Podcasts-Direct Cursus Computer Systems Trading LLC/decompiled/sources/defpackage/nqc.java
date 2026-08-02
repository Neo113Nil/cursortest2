package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class nqc implements lqc {
    public final float[] a;
    public final float[] b;

    public nqc(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            xq0.x("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.lqc
    public final float a(float f) {
        return h1b.v(f, this.b, this.a);
    }

    @Override // defpackage.lqc
    public final float b(float f) {
        return h1b.v(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nqc)) {
            return false;
        }
        nqc nqcVar = (nqc) obj;
        return Arrays.equals(this.a, nqcVar.a) && Arrays.equals(this.b, nqcVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
