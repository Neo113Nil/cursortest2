package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r5r implements s5r {
    public final hfs a;
    public final o43 b;

    public r5r(hfs hfsVar, o43 o43Var) {
        this.a = hfsVar;
        this.b = o43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5r)) {
            return false;
        }
        r5r r5rVar = (r5r) obj;
        return Intrinsics.d(this.a, r5rVar.a) && Intrinsics.d(this.b, r5rVar.b);
    }

    public final int hashCode() {
        hfs hfsVar = this.a;
        int hashCode = (hfsVar == null ? 0 : hfsVar.hashCode()) * 31;
        o43 o43Var = this.b;
        return hashCode + (o43Var != null ? o43Var.hashCode() : 0);
    }

    public final String toString() {
        return "SimpleImageLogo(textColors=" + this.a + ", blockAction=" + this.b + ")";
    }
}
