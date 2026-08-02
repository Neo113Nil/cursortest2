package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n54 {
    public final so1 a;
    public final int b;

    public n54(so1 so1Var, int i) {
        so1Var.getClass();
        this.a = so1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n54)) {
            return false;
        }
        n54 n54Var = (n54) obj;
        return Intrinsics.d(this.a, n54Var.a) && this.b == n54Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CarouselTopArtist(artist=" + this.a + ", likesCount=" + this.b + ")";
    }
}
