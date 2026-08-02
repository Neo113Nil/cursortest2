package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jho {
    public float a = 0.0f;
    public boolean b = true;
    public jf0 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jho)) {
            return false;
        }
        jho jhoVar = (jho) obj;
        return Float.compare(this.a, jhoVar.a) == 0 && this.b == jhoVar.b && Intrinsics.d(this.c, jhoVar.c);
    }

    public final int hashCode() {
        int e = k5r.e(Float.hashCode(this.a) * 31, 31, this.b);
        jf0 jf0Var = this.c;
        return (e + (jf0Var == null ? 0 : jf0Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
