package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pda {
    public final c01 a;
    public final long b;

    public pda(c01 c01Var, long j) {
        c01Var.getClass();
        this.a = c01Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pda)) {
            return false;
        }
        pda pdaVar = (pda) obj;
        return Intrinsics.d(this.a, pdaVar.a) && this.b == pdaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadedArtistItem(artist=" + this.a + ", timestampMs=" + this.b + ")";
    }
}
