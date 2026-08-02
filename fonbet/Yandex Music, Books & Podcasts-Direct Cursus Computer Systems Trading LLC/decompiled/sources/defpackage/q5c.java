package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q5c implements drf {
    public final nrf a;
    public final cvl b;

    public q5c(nrf nrfVar, cvl cvlVar) {
        nrfVar.getClass();
        this.a = nrfVar;
        this.b = cvlVar;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5c)) {
            return false;
        }
        q5c q5cVar = (q5c) obj;
        return Intrinsics.d(this.a, q5cVar.a) && Intrinsics.d(this.b, q5cVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cvl cvlVar = this.b;
        return hashCode + (cvlVar == null ? 0 : cvlVar.hashCode());
    }

    public final String toString() {
        return "FavouritePlaylistBlock(meta=" + this.a + ", playlistHeader=" + this.b + ")";
    }
}
