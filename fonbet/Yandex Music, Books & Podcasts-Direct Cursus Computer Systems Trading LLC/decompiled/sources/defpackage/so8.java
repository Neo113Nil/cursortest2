package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class so8 extends wo8 {
    public final int a;
    public final la5 b;

    public so8(int i, la5 la5Var) {
        this.a = i;
        this.b = la5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so8)) {
            return false;
        }
        so8 so8Var = (so8) obj;
        return this.a == so8Var.a && Intrinsics.d(this.b, so8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LinearGradient(angle=" + this.a + ", colormap=" + this.b + ')';
    }
}
