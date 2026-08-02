package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lob implements opv {
    public final opv a;
    public final opv b;

    public lob(opv opvVar, opv opvVar2) {
        this.a = opvVar;
        this.b = opvVar2;
    }

    @Override // defpackage.opv
    public final int a(jx7 jx7Var) {
        int a = this.a.a(jx7Var) - this.b.a(jx7Var);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.opv
    public final int b(jx7 jx7Var, xof xofVar) {
        int b = this.a.b(jx7Var, xofVar) - this.b.b(jx7Var, xofVar);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.opv
    public final int c(jx7 jx7Var) {
        int c = this.a.c(jx7Var) - this.b.c(jx7Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.opv
    public final int d(jx7 jx7Var, xof xofVar) {
        int d = this.a.d(jx7Var, xofVar) - this.b.d(jx7Var, xofVar);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lob)) {
            return false;
        }
        lob lobVar = (lob) obj;
        return Intrinsics.d(lobVar.a, this.a) && Intrinsics.d(lobVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
