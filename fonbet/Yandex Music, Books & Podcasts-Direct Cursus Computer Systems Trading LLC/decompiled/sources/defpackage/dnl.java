package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dnl {
    public final snq a;
    public final nxk b;
    public final mwk c;

    public dnl(snq snqVar, nxk nxkVar, mwk mwkVar) {
        snqVar.getClass();
        nxkVar.getClass();
        this.a = snqVar;
        this.b = nxkVar;
        this.c = mwkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnl)) {
            return false;
        }
        dnl dnlVar = (dnl) obj;
        return Intrinsics.d(this.a, dnlVar.a) && Intrinsics.d(this.b, dnlVar.b) && this.c.equals(dnlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlayerScreenSkeletonState(skeleton=" + this.a + ", playableType=" + this.b + ", currentPlayable=" + this.c + ")";
    }
}
