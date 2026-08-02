package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e08 implements g08 {
    public final s64 a;
    public final int b;

    public e08(s64 s64Var, int i) {
        s64Var.getClass();
        this.a = s64Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e08)) {
            return false;
        }
        e08 e08Var = (e08) obj;
        return Intrinsics.d(this.a, e08Var.a) && this.b == e08Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Remote(castDeviceDescriptor=" + this.a + ", castIconRes=" + this.b + ")";
    }
}
