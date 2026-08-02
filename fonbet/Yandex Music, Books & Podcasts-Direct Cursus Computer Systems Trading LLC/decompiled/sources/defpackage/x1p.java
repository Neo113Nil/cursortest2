package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class x1p extends z1p {
    public final cvl a;

    public x1p(cvl cvlVar) {
        cvlVar.getClass();
        this.a = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1p) && Intrinsics.d(this.a, ((x1p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CollectionPlaylist(playlistHeader=" + this.a + ")";
    }
}
