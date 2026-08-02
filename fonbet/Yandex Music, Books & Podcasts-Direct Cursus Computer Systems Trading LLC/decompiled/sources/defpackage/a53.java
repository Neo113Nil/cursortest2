package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a53 {
    public final k63 a;
    public final jwr b;

    public a53(k63 k63Var, jwr jwrVar) {
        this.a = k63Var;
        this.b = jwrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a53)) {
            return false;
        }
        a53 a53Var = (a53) obj;
        return Intrinsics.d(this.a, a53Var.a) && Intrinsics.d(this.b, a53Var.b);
    }

    public final int hashCode() {
        k63 k63Var = this.a;
        int hashCode = (k63Var == null ? 0 : k63Var.hashCode()) * 31;
        jwr jwrVar = this.b;
        return hashCode + (jwrVar != null ? jwrVar.hashCode() : 0);
    }

    public final String toString() {
        return "BlockInfo(local=" + this.a + ", remote=" + this.b + ")";
    }
}
