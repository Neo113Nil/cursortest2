package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0f implements f0f {
    public final eul a;
    public final lwl b;

    public a0f(eul eulVar, lwl lwlVar) {
        eulVar.getClass();
        lwlVar.getClass();
        this.a = eulVar;
        this.b = lwlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0f)) {
            return false;
        }
        a0f a0fVar = (a0f) obj;
        return Intrinsics.d(this.a, a0fVar.a) && Intrinsics.d(this.b, a0fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Playlist(playlist=" + this.a + ", uiPlaylist=" + this.b + ")";
    }
}
