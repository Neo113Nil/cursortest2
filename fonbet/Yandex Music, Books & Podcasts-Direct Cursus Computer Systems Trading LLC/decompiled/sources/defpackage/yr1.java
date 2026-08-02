package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yr1 extends bs1 {
    public final w4k a;
    public final pgb b;

    public yr1(w4k w4kVar, pgb pgbVar) {
        this.a = w4kVar;
        this.b = pgbVar;
    }

    @Override // defpackage.bs1
    public final w4k a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr1)) {
            return false;
        }
        yr1 yr1Var = (yr1) obj;
        return Intrinsics.d(this.a, yr1Var.a) && Intrinsics.d(this.b, yr1Var.b);
    }

    public final int hashCode() {
        w4k w4kVar = this.a;
        return this.b.hashCode() + ((w4kVar == null ? 0 : w4kVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ')';
    }
}
