package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k1q implements z3q, d2q {
    public final qhd a;
    public final l1q b;

    public k1q(qhd qhdVar) {
        qhdVar.getClass();
        this.a = qhdVar;
        this.b = new l1q(qhdVar.a);
    }

    @Override // defpackage.z3q
    public final qhd e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1q) && Intrinsics.d(this.a, ((k1q) obj).a);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedGlagolOtherEntity(preview=" + this.a + ")";
    }

    @Override // defpackage.z3q, defpackage.u3q
    public final g1q getId() {
        return this.b;
    }

    public k1q() {
        this(qhd.f);
    }
}
