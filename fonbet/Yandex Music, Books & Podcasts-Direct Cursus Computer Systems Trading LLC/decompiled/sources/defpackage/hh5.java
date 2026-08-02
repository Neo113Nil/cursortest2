package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hh5 {
    public final String a;
    public final gh5 b;

    public hh5(String str, gh5 gh5Var) {
        this.a = str;
        this.b = gh5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh5)) {
            return false;
        }
        hh5 hh5Var = (hh5) obj;
        return this.a.equals(hh5Var.a) && Intrinsics.d(this.b, hh5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gh5 gh5Var = this.b;
        return hashCode + (gh5Var == null ? 0 : gh5Var.hashCode());
    }

    public final String toString() {
        return "Image(url=" + this.a + ", color=" + this.b + ")";
    }
}
