package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m3q implements r3q {
    public final cd5 a;
    public final tyt b;

    public m3q(cd5 cd5Var, fyt fytVar) {
        fytVar.getClass();
        this.a = cd5Var;
        this.b = fytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3q)) {
            return false;
        }
        m3q m3qVar = (m3q) obj;
        return this.a.equals(m3qVar.a) && Intrinsics.d(this.b, m3qVar.b);
    }

    @Override // defpackage.r3q
    public final q3q g() {
        return this.b;
    }

    @Override // defpackage.r3q, defpackage.u3q
    public final dd5 getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "BasicVariousEntity(id=" + this.a + ", subtype=" + this.b + ")";
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }
}
