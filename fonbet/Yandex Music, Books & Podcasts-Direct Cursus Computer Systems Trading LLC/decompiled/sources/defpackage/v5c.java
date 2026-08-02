package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v5c implements x5c {
    public final cvl a;
    public final odc b;

    public v5c(cvl cvlVar, odc odcVar) {
        cvlVar.getClass();
        this.a = cvlVar;
        this.b = odcVar;
    }

    @Override // defpackage.x5c
    public final cvl a() {
        return this.a;
    }

    @Override // defpackage.x5c
    public final odc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5c)) {
            return false;
        }
        v5c v5cVar = (v5c) obj;
        return Intrinsics.d(this.a, v5cVar.a) && this.b.equals(v5cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(playlistHeader=" + this.a + ", filtersState=" + this.b + ")";
    }
}
