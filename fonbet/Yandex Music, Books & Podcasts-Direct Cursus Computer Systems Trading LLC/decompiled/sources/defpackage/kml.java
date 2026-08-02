package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kml {
    public final cml a;
    public final cml b;
    public final cml c;

    public kml(cml cmlVar, cml cmlVar2, cml cmlVar3) {
        this.a = cmlVar;
        this.b = cmlVar2;
        this.c = cmlVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kml)) {
            return false;
        }
        kml kmlVar = (kml) obj;
        return Intrinsics.d(this.a, kmlVar.a) && this.b.equals(kmlVar.b) && Intrinsics.d(this.c, kmlVar.c);
    }

    public final int hashCode() {
        cml cmlVar = this.a;
        int hashCode = (this.b.hashCode() + ((cmlVar == null ? 0 : cmlVar.hashCode()) * 31)) * 31;
        cml cmlVar2 = this.c;
        return hashCode + (cmlVar2 != null ? cmlVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerScreenQueuePlayablesBase(previousPlayable=" + this.a + ", currentPlayable=" + this.b + ", nextPlayable=" + this.c + ")";
    }
}
