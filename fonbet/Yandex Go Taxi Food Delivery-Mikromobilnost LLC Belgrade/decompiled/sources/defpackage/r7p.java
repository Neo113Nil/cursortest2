package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class r7p {
    public final int a;

    public /* synthetic */ r7p(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof r7p)) {
                return false;
            }
            r7p r7pVar = (r7p) obj;
            if (Float.floatToIntBits(0.1f) != Float.floatToIntBits(0.1f) || !ooc.m(1, 1) || !ooc.m(Integer.valueOf(this.a), Integer.valueOf(r7pVar.a)) || !ooc.m(1, 1)) {
                return false;
            }
            Boolean bool = Boolean.FALSE;
            if (!ooc.m(bool, bool) || !ooc.m(1, 1) || !ooc.m(null, null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Float.floatToIntBits(0.1f)), 1, Integer.valueOf(this.a), 1, Boolean.FALSE, 1, null});
    }

    public final String toString() {
        p891 p891Var = new p891("FaceDetectorOptions", 11);
        p891Var.f(1, "landmarkMode");
        p891Var.f(this.a, "contourMode");
        p891Var.f(1, "classificationMode");
        p891Var.f(1, "performanceMode");
        String valueOf = String.valueOf(false);
        mqb1 mqb1Var = new mqb1(10);
        ((p891) p891Var.w).w = mqb1Var;
        p891Var.w = mqb1Var;
        mqb1Var.c = valueOf;
        mqb1Var.b = "trackingEnabled";
        p891Var.d(0.1f, "minFaceSize");
        return p891Var.toString();
    }
}
