package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class eok {
    public final nvl a;
    public final int b;
    public final List c;

    public eok(nvl nvlVar, int i, List list) {
        list.getClass();
        this.a = nvlVar;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eok)) {
            return false;
        }
        eok eokVar = (eok) obj;
        return this.a.equals(eokVar.a) && this.b == eokVar.b && Intrinsics.d(this.c, eokVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistChecksumInfo(playlistId=");
        sb.append(this.a);
        sb.append(", revision=");
        sb.append(this.b);
        sb.append(", tracks=");
        return vz1.u(sb, this.c, ")");
    }
}
