package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class szj {
    public final nvl a;
    public final int b;
    public final int c;
    public final Boolean d;
    public final List e;

    public szj(nvl nvlVar, int i, int i2, Boolean bool, List list) {
        nvlVar.getClass();
        list.getClass();
        this.a = nvlVar;
        this.b = i;
        this.c = i2;
        this.d = bool;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szj)) {
            return false;
        }
        szj szjVar = (szj) obj;
        return Intrinsics.d(this.a, szjVar.a) && this.b == szjVar.b && this.c == szjVar.c && Intrinsics.d(this.d, szjVar.d) && Intrinsics.d(this.e, szjVar.e);
    }

    public final int hashCode() {
        int a = f1d.a(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31);
        Boolean bool = this.d;
        return this.e.hashCode() + ((a + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnPlaylistInfo(playlistId=");
        sb.append(this.a);
        sb.append(", revision=");
        sb.append(this.b);
        sb.append(", snapshot=");
        sb.append(this.c);
        sb.append(", allValuesRequired=");
        sb.append(this.d);
        sb.append(", tracks=");
        return vz1.u(sb, this.e, ")");
    }
}
