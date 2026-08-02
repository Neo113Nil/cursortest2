package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class lve {
    public final o4c a;
    public final kve b;

    public lve(o4c o4cVar, kve kveVar) {
        o4cVar.getClass();
        this.a = o4cVar;
        this.b = kveVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lve)) {
            return false;
        }
        lve lveVar = (lve) obj;
        return Intrinsics.d(this.a, lveVar.a) && Intrinsics.d(this.b, lveVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kve kveVar = this.b;
        return hashCode + (kveVar == null ? 0 : kveVar.hashCode());
    }

    public final String toString() {
        return "PreHeatedPlayer(player=" + this.a + ", sourceWithTrack=" + this.b + ")";
    }
}
