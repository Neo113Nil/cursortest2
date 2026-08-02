package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pgh implements rgh {
    public final n7q a;
    public final w0l b;
    public final v0l c;
    public final rnh d;
    public final cgh e;

    public pgh(n7q n7qVar, w0l w0lVar, v0l v0lVar, rnh rnhVar, cgh cghVar) {
        n7qVar.getClass();
        rnhVar.getClass();
        cghVar.getClass();
        this.a = n7qVar;
        this.b = w0lVar;
        this.c = v0lVar;
        this.d = rnhVar;
        this.e = cghVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgh)) {
            return false;
        }
        pgh pghVar = (pgh) obj;
        return Intrinsics.d(this.a, pghVar.a) && this.b == pghVar.b && this.c == pghVar.c && Intrinsics.d(this.d, pghVar.d) && Intrinsics.d(this.e, pghVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlaybackStateWithMeta(queueState=" + this.a + ", playingState=" + this.b + ", playerState=" + this.c + ", cachedMediaMetadata=" + this.d + ", rating=" + this.e + ")";
    }
}
