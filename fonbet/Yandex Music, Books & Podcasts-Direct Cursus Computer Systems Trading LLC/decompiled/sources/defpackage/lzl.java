package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lzl implements mzl {
    public final raj a;
    public final mqs b;

    public lzl(raj rajVar, mqs mqsVar) {
        mqsVar.getClass();
        this.a = rajVar;
        this.b = mqsVar;
    }

    @Override // defpackage.mzl
    public final mqs a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzl)) {
            return false;
        }
        lzl lzlVar = (lzl) obj;
        return this.a.equals(lzlVar.a) && Intrinsics.d(this.b, lzlVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NonMusicCoverTrack(nonMusicCoverTrackUiData=" + this.a + ", track=" + this.b + ")";
    }
}
