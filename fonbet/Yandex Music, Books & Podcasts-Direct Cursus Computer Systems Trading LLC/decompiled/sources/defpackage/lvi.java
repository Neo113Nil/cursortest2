package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lvi extends nvi {
    public final zab a;
    public final zab b;

    public lvi(zab zabVar, zab zabVar2) {
        zabVar.getClass();
        zabVar2.getClass();
        this.a = zabVar;
        this.b = zabVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvi)) {
            return false;
        }
        lvi lviVar = (lvi) obj;
        return Intrinsics.d(this.a, lviVar.a) && Intrinsics.d(this.b, lviVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonBlock(recentlyPlayed=" + this.a + ", liked=" + this.b + ")";
    }
}
