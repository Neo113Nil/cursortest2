package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class um implements opv {
    public final r0k a;
    public final opv b;

    public um(r0k r0kVar, opv opvVar) {
        this.a = r0kVar;
        this.b = opvVar;
    }

    @Override // defpackage.opv
    public final int a(jx7 jx7Var) {
        return this.b.a(jx7Var) + this.a.a(jx7Var);
    }

    @Override // defpackage.opv
    public final int b(jx7 jx7Var, xof xofVar) {
        return this.b.b(jx7Var, xofVar) + this.a.b(jx7Var, xofVar);
    }

    @Override // defpackage.opv
    public final int c(jx7 jx7Var) {
        return this.b.c(jx7Var) + this.a.c(jx7Var);
    }

    @Override // defpackage.opv
    public final int d(jx7 jx7Var, xof xofVar) {
        return this.b.d(jx7Var, xofVar) + this.a.d(jx7Var, xofVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um)) {
            return false;
        }
        um umVar = (um) obj;
        return umVar.a.equals(this.a) && Intrinsics.d(umVar.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
