package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bb3 implements cb3 {
    public final String a;
    public final oq b;

    public bb3(oq oqVar, String str) {
        str.getClass();
        oqVar.getClass();
        this.a = str;
        this.b = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb3)) {
            return false;
        }
        bb3 bb3Var = (bb3) obj;
        return Intrinsics.d(this.a, bb3Var.a) && Intrinsics.d(this.b, bb3Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Unavailable(title=" + this.a + ", album=" + this.b + ")";
    }
}
