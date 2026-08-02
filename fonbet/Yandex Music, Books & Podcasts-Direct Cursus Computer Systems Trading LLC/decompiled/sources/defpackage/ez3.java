package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ez3 {
    public final c01 a;
    public final int b;

    public ez3(c01 c01Var, int i) {
        c01Var.getClass();
        this.a = c01Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez3)) {
            return false;
        }
        ez3 ez3Var = (ez3) obj;
        return Intrinsics.d(this.a, ez3Var.a) && this.b == ez3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "CarouselArtist(artist=" + this.a + ", likesCount=" + this.b + ")";
    }
}
