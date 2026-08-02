package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a2q implements z3q, d2q {
    public final mqs a;
    public final qhd b;
    public final b2q c;
    public final String d;

    public a2q(mqs mqsVar, qhd qhdVar) {
        mqsVar.getClass();
        qhdVar.getClass();
        this.a = mqsVar;
        this.b = qhdVar;
        this.c = new b2q(mqsVar.a);
        this.d = mqsVar.c;
    }

    @Override // defpackage.z3q
    public final qhd e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2q)) {
            return false;
        }
        a2q a2qVar = (a2q) obj;
        return Intrinsics.d(this.a, a2qVar.a) && Intrinsics.d(this.b, a2qVar.b);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SharedGlagolTrackEntity(track=" + this.a + ", preview=" + this.b + ")";
    }

    @Override // defpackage.z3q, defpackage.u3q
    public final g1q getId() {
        return this.c;
    }
}
