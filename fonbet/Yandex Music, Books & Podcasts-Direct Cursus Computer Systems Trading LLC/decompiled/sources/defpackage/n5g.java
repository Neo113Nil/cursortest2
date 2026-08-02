package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n5g implements opv {
    public final opv a;
    public final int b;

    public n5g(opv opvVar, int i) {
        this.a = opvVar;
        this.b = i;
    }

    @Override // defpackage.opv
    public final int a(jx7 jx7Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(jx7Var);
        }
        return 0;
    }

    @Override // defpackage.opv
    public final int b(jx7 jx7Var, xof xofVar) {
        if (((xofVar == xof.a ? 4 : 1) & this.b) != 0) {
            return this.a.b(jx7Var, xofVar);
        }
        return 0;
    }

    @Override // defpackage.opv
    public final int c(jx7 jx7Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(jx7Var);
        }
        return 0;
    }

    @Override // defpackage.opv
    public final int d(jx7 jx7Var, xof xofVar) {
        if (((xofVar == xof.a ? 8 : 2) & this.b) != 0) {
            return this.a.d(jx7Var, xofVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5g)) {
            return false;
        }
        n5g n5gVar = (n5g) obj;
        return Intrinsics.d(this.a, n5gVar.a) && this.b == n5gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = q7g.a;
        if ((i & i2) == i2) {
            q7g.W("Start", sb3);
        }
        int i3 = q7g.c;
        if ((i & i3) == i3) {
            q7g.W("Left", sb3);
        }
        if ((i & 16) == 16) {
            q7g.W("Top", sb3);
        }
        int i4 = q7g.b;
        if ((i & i4) == i4) {
            q7g.W("End", sb3);
        }
        int i5 = q7g.d;
        if ((i & i5) == i5) {
            q7g.W("Right", sb3);
        }
        if ((i & 32) == 32) {
            q7g.W("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
