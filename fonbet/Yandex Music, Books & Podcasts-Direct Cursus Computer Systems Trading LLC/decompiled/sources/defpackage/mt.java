package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mt {
    public final oq a;
    public final List b;
    public final ff c;
    public final r1u d;

    public mt(oq oqVar, List list, ff ffVar, r1u r1uVar) {
        oqVar.getClass();
        list.getClass();
        this.a = oqVar;
        this.b = list;
        this.c = ffVar;
        this.d = r1uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt)) {
            return false;
        }
        mt mtVar = (mt) obj;
        return Intrinsics.d(this.a, mtVar.a) && Intrinsics.d(this.b, mtVar.b) && Intrinsics.d(this.c, mtVar.c) && Intrinsics.d(this.d, mtVar.d);
    }

    public final int hashCode() {
        int d = k5r.d(this.a.a.hashCode() * 31, 31, this.b);
        ff ffVar = this.c;
        int hashCode = (d + (ffVar == null ? 0 : ffVar.hashCode())) * 31;
        r1u r1uVar = this.d;
        return hashCode + (r1uVar != null ? r1uVar.hashCode() : 0);
    }

    public final String toString() {
        return "AlbumFull(album=" + this.a + ", artists=" + this.b + ", actionInfo=" + this.c + ", vibeButtonInfo=" + this.d + ")";
    }
}
