package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nc1 {
    public final m7g a;
    public final p43 b;

    public nc1(m7g m7gVar, p43 p43Var) {
        this.a = m7gVar;
        this.b = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc1)) {
            return false;
        }
        nc1 nc1Var = (nc1) obj;
        return this.a.equals(nc1Var.a) && Intrinsics.d(this.b, nc1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p43 p43Var = this.b;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "ArtistLink(link=" + this.a + ", analytics=" + this.b + ")";
    }
}
