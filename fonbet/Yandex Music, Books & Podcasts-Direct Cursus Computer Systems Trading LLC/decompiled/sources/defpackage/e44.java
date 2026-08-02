package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e44 {
    public final a44 a;
    public final f34 b;

    public e44(a44 a44Var, f34 f34Var) {
        a44Var.getClass();
        this.a = a44Var;
        this.b = f34Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e44)) {
            return false;
        }
        e44 e44Var = (e44) obj;
        return Intrinsics.d(this.a, e44Var.a) && Intrinsics.d(this.b, e44Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f34 f34Var = this.b;
        return hashCode + (f34Var == null ? 0 : f34Var.hashCode());
    }

    public final String toString() {
        return "Snapshot(order=" + this.a + ", meta=" + this.b + ")";
    }
}
