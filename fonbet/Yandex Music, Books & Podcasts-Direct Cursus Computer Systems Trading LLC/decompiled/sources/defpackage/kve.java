package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kve {
    public final u2q a;
    public final iaw b;
    public final Long c;

    public kve(u2q u2qVar, iaw iawVar, Long l) {
        u2qVar.getClass();
        this.a = u2qVar;
        this.b = iawVar;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kve)) {
            return false;
        }
        kve kveVar = (kve) obj;
        return Intrinsics.d(this.a, kveVar.a) && this.b.equals(kveVar.b) && Intrinsics.d(this.c, kveVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Long l = this.c;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "SourceWithTrack(sharedPlayableTrack=" + this.a + ", mediaSource=" + this.b + ", startPosition=" + this.c + ")";
    }
}
