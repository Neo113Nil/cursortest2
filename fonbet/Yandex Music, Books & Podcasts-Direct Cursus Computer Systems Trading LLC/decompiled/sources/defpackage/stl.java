package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class stl {
    public final cvl a;
    public final boolean b;
    public final List c;

    public stl(cvl cvlVar, boolean z, List list) {
        cvlVar.getClass();
        list.getClass();
        this.a = cvlVar;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stl)) {
            return false;
        }
        stl stlVar = (stl) obj;
        return Intrinsics.d(this.a, stlVar.a) && this.b == stlVar.b && Intrinsics.d(this.c, stlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistUpdateInfo(playlistHeader=");
        sb.append(this.a);
        sb.append(", liked=");
        sb.append(this.b);
        sb.append(", tracks=");
        return vz1.u(sb, this.c, ")");
    }
}
