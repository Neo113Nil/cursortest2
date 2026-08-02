package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w5c implements x5c {
    public final cvl a;
    public final odc b;
    public final ArrayList c;

    public w5c(cvl cvlVar, odc odcVar, ArrayList arrayList) {
        cvlVar.getClass();
        this.a = cvlVar;
        this.b = odcVar;
        this.c = arrayList;
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
        if (!(obj instanceof w5c)) {
            return false;
        }
        w5c w5cVar = (w5c) obj;
        return Intrinsics.d(this.a, w5cVar.a) && this.b.equals(w5cVar.b) && this.c.equals(w5cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(playlistHeader=");
        sb.append(this.a);
        sb.append(", filtersState=");
        sb.append(this.b);
        sb.append(", coverTrackList=");
        return vz1.t(sb, this.c, ")");
    }
}
