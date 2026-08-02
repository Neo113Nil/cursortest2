package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tit implements opv {
    public final opv a;
    public final opv b;

    public tit(opv opvVar, opv opvVar2) {
        this.a = opvVar;
        this.b = opvVar2;
    }

    @Override // defpackage.opv
    public final int a(jx7 jx7Var) {
        return Math.max(this.a.a(jx7Var), this.b.a(jx7Var));
    }

    @Override // defpackage.opv
    public final int b(jx7 jx7Var, xof xofVar) {
        return Math.max(this.a.b(jx7Var, xofVar), this.b.b(jx7Var, xofVar));
    }

    @Override // defpackage.opv
    public final int c(jx7 jx7Var) {
        return Math.max(this.a.c(jx7Var), this.b.c(jx7Var));
    }

    @Override // defpackage.opv
    public final int d(jx7 jx7Var, xof xofVar) {
        return Math.max(this.a.d(jx7Var, xofVar), this.b.d(jx7Var, xofVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tit)) {
            return false;
        }
        tit titVar = (tit) obj;
        return Intrinsics.d(titVar.a, this.a) && Intrinsics.d(titVar.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
