package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class py5 implements ry5 {
    public final boolean a;
    public final thj b;

    public py5(boolean z, thj thjVar) {
        thjVar.getClass();
        this.a = z;
        this.b = thjVar;
    }

    @Override // defpackage.ry5
    public final thj a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py5)) {
            return false;
        }
        py5 py5Var = (py5) obj;
        return this.a == py5Var.a && Intrinsics.d(this.b, py5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Placeholder(isLoading=" + this.a + ", info=" + this.b + ")";
    }
}
