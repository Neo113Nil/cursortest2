package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o3u {
    public final x1u a;
    public final mqs b;
    public final j1g c;

    public o3u(x1u x1uVar, mqs mqsVar, j1g j1gVar) {
        x1uVar.getClass();
        this.a = x1uVar;
        this.b = mqsVar;
        this.c = j1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3u)) {
            return false;
        }
        o3u o3uVar = (o3u) obj;
        return Intrinsics.d(this.a, o3uVar.a) && Intrinsics.d(this.b, o3uVar.b) && this.c == o3uVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mqs mqsVar = this.b;
        int hashCode2 = (hashCode + (mqsVar == null ? 0 : mqsVar.a.hashCode())) * 31;
        j1g j1gVar = this.c;
        return hashCode2 + (j1gVar != null ? j1gVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoClipData(videoClip=" + this.a + ", firstAssociatedTrack=" + this.b + ", likeState=" + this.c + ")";
    }
}
