package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s63 {
    public final drf a;
    public final int b;
    public final String c;
    public final t63 d;

    public s63(drf drfVar, int i, String str, t63 t63Var) {
        drfVar.getClass();
        str.getClass();
        this.a = drfVar;
        this.b = i;
        this.c = str;
        this.d = t63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s63)) {
            return false;
        }
        s63 s63Var = (s63) obj;
        return Intrinsics.d(this.a, s63Var.a) && this.b == s63Var.b && Intrinsics.d(this.c, s63Var.c) && Intrinsics.d(this.d, s63Var.d);
    }

    public final int hashCode() {
        int c = k5r.c(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        t63 t63Var = this.d;
        return c + (t63Var == null ? 0 : t63Var.hashCode());
    }

    public final String toString() {
        return "BlockNode(block=" + this.a + ", position=" + this.b + ", skeletonId=" + this.c + ", tab=" + this.d + ")";
    }
}
