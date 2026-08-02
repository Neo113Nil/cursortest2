package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class la5 {
    public static final la5 c = new la5(null, new int[0]);
    public final int[] a;
    public final float[] b;

    public la5(float[] fArr, int[] iArr) {
        this.a = iArr;
        this.b = fArr;
        if (iArr.length == (fArr != null ? fArr.length : iArr.length)) {
            return;
        }
        xq0.x("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!la5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        la5 la5Var = (la5) obj;
        return Arrays.equals(this.a, la5Var.a) && Arrays.equals(this.b, la5Var.b);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.a) * 31;
        float[] fArr = this.b;
        return hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0);
    }
}
