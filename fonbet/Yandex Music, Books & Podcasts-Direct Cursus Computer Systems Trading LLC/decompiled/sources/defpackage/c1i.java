package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c1i {
    public final jd1 a;
    public final c01 b;

    public c1i(c01 c01Var, jd1 jd1Var) {
        c01Var.getClass();
        this.a = jd1Var;
        this.b = c01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1i)) {
            return false;
        }
        c1i c1iVar = (c1i) obj;
        return this.a.equals(c1iVar.a) && Intrinsics.d(this.b, c1iVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaTagArtistListItem(uiData=" + this.a + ", artist=" + this.b + ")";
    }
}
