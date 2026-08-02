package defpackage;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t38 implements Comparable {
    public final float a;
    public final int b;

    static {
        y38 y38Var = a48.a;
        new t38(0.0f);
    }

    public t38(float f) {
        x38 x38Var = a48.b;
        this.a = f;
        x38Var.a(f);
        y38 y38Var = a48.a;
        x38Var.a(f);
        y38Var.getClass();
        float f2 = Resources.getSystem().getDisplayMetrics().scaledDensity;
        this.b = (int) x38Var.a(f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.e(this.b, ((t38) obj).b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t38.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        if (this.a != ((t38) obj).a) {
            return false;
        }
        y38 y38Var = a48.a;
        return true;
    }

    public final int hashCode() {
        return a48.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Dimension(value=" + this.a + ", unit=" + a48.b + ")";
    }
}
