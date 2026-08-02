package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h1q implements z3q {
    public final qhd a;
    public final i1q b;
    public final String c;

    public h1q(qhd qhdVar) {
        qhdVar.getClass();
        this.a = qhdVar;
        String str = qhdVar.a;
        this.b = new i1q(str == null ? "" : str);
        String str2 = qhdVar.d;
        this.c = str2 != null ? str2 : "";
    }

    @Override // defpackage.z3q
    public final qhd e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1q) && Intrinsics.d(this.a, ((h1q) obj).a);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedGlagolGenerativeEntity(preview=" + this.a + ")";
    }

    @Override // defpackage.z3q, defpackage.u3q
    public final g1q getId() {
        return this.b;
    }
}
