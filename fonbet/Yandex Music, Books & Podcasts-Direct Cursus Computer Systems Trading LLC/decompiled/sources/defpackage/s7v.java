package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s7v implements t7v {
    public final ai3 a;

    public s7v(ai3 ai3Var) {
        ai3Var.getClass();
        this.a = ai3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7v) && Intrinsics.d(this.a, ((s7v) obj).a) && Float.compare(112.0f, 112.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(112.0f) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RadialGradient(brush=" + this.a + ", rotationDegrees=112.0)";
    }
}
