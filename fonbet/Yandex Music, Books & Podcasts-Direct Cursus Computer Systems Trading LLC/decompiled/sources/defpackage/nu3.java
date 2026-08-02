package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nu3 {
    public jx7 a;
    public xof b;
    public mu3 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu3)) {
            return false;
        }
        nu3 nu3Var = (nu3) obj;
        return Intrinsics.d(this.a, nu3Var.a) && this.b == nu3Var.b && Intrinsics.d(this.c, nu3Var.c) && nmq.a(this.d, nu3Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) nmq.g(this.d)) + ')';
    }
}
