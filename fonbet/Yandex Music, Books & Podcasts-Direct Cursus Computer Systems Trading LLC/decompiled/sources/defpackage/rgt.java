package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rgt extends eht {
    public final eul a;
    public final ArrayList b;
    public final boolean c;
    public final String d;
    public final usj e;

    public rgt(eul eulVar, ArrayList arrayList, boolean z, String str, usj usjVar) {
        this.a = eulVar;
        this.b = arrayList;
        this.c = z;
        this.d = str;
        this.e = usjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgt)) {
            return false;
        }
        rgt rgtVar = (rgt) obj;
        return this.a.equals(rgtVar.a) && this.b.equals(rgtVar.b) && this.c == rgtVar.c && Intrinsics.d(this.d, rgtVar.d) && this.e.equals(rgtVar.e);
    }

    public final int hashCode() {
        int e = k5r.e(dfi.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Success(playlistDomainItem=" + this.a + ", coverTrackItems=" + this.b + ", covered=" + this.c + ", coverUrl=" + this.d + ", openPlaylistBlockState=" + this.e + ")";
    }
}
