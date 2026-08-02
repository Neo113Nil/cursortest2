package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j46 {
    public final long a;
    public final n46 b;
    public final long c;
    public final float d;

    public j46(long j, n46 n46Var, long j2, float f) {
        n46Var.getClass();
        this.a = j;
        this.b = n46Var;
        this.c = j2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j46)) {
            return false;
        }
        j46 j46Var = (j46) obj;
        return d85.c(this.a, j46Var.a) && Intrinsics.d(this.b, j46Var.b) && enj.c(this.c, j46Var.c) && Float.compare(this.d, j46Var.d) == 0;
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Float.hashCode(this.d) + tlm.c(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Confetti(color=" + d85.i(this.a) + ", shape=" + this.b + ", offset=" + enj.j(this.c) + ", rotation=" + this.d + ")";
    }
}
