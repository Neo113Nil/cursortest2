package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class eoe implements o0k {
    public final opv a;
    public final jx7 b;

    public eoe(opv opvVar, jx7 jx7Var) {
        this.a = opvVar;
        this.b = jx7Var;
    }

    @Override // defpackage.o0k
    public final float a() {
        opv opvVar = this.a;
        jx7 jx7Var = this.b;
        return jx7Var.c0(opvVar.c(jx7Var));
    }

    @Override // defpackage.o0k
    public final float b(xof xofVar) {
        opv opvVar = this.a;
        jx7 jx7Var = this.b;
        return jx7Var.c0(opvVar.d(jx7Var, xofVar));
    }

    @Override // defpackage.o0k
    public final float c(xof xofVar) {
        opv opvVar = this.a;
        jx7 jx7Var = this.b;
        return jx7Var.c0(opvVar.b(jx7Var, xofVar));
    }

    @Override // defpackage.o0k
    public final float d() {
        opv opvVar = this.a;
        jx7 jx7Var = this.b;
        return jx7Var.c0(opvVar.a(jx7Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoe)) {
            return false;
        }
        eoe eoeVar = (eoe) obj;
        return Intrinsics.d(this.a, eoeVar.a) && Intrinsics.d(this.b, eoeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
