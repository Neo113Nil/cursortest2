package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0k implements opv {
    public final o0k a;

    public r0k(q0k q0kVar) {
        this.a = q0kVar;
    }

    @Override // defpackage.opv
    public final int a(jx7 jx7Var) {
        return jx7Var.L(this.a.d());
    }

    @Override // defpackage.opv
    public final int b(jx7 jx7Var, xof xofVar) {
        return jx7Var.L(this.a.c(xofVar));
    }

    @Override // defpackage.opv
    public final int c(jx7 jx7Var) {
        return jx7Var.L(this.a.a());
    }

    @Override // defpackage.opv
    public final int d(jx7 jx7Var, xof xofVar) {
        return jx7Var.L(this.a.b(xofVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0k) {
            return Intrinsics.d(((r0k) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        xof xofVar = xof.a;
        o0k o0kVar = this.a;
        return "PaddingValues(" + ((Object) cma.b(o0kVar.b(xofVar))) + ", " + ((Object) cma.b(o0kVar.d())) + ", " + ((Object) cma.b(o0kVar.c(xofVar))) + ", " + ((Object) cma.b(o0kVar.a())) + ')';
    }
}
