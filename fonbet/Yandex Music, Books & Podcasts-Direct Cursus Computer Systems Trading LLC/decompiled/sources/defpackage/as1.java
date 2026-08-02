package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class as1 extends bs1 {
    public final w4k a;
    public final bqr b;

    public as1(w4k w4kVar, bqr bqrVar) {
        this.a = w4kVar;
        this.b = bqrVar;
    }

    @Override // defpackage.bs1
    public final w4k a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as1)) {
            return false;
        }
        as1 as1Var = (as1) obj;
        return this.a.equals(as1Var.a) && Intrinsics.d(this.b, as1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ')';
    }
}
