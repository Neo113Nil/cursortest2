package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k79 {
    public final jc8 a;
    public final xzb b;

    public k79(jc8 jc8Var, xzb xzbVar) {
        this.a = jc8Var;
        this.b = xzbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k79)) {
            return false;
        }
        k79 k79Var = (k79) obj;
        return Intrinsics.d(this.a, k79Var.a) && Intrinsics.d(this.b, k79Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DivItemBuilderResult(div=" + this.a + ", expressionResolver=" + this.b + ')';
    }
}
