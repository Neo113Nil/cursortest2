package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zul {
    public final cvl a;
    public final List b;
    public final List c;
    public final r1u d;
    public final ff e;
    public final ArrayList f;

    public zul(cvl cvlVar, List list, List list2, r1u r1uVar, ff ffVar) {
        ArrayList arrayList;
        if (list != null) {
            List list3 = list;
            arrayList = new ArrayList(v75.o(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((mqs) it.next()).v);
            }
        } else {
            arrayList = null;
        }
        cvlVar.getClass();
        list2.getClass();
        this.a = cvlVar;
        this.b = list;
        this.c = list2;
        this.d = r1uVar;
        this.e = ffVar;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zul)) {
            return false;
        }
        zul zulVar = (zul) obj;
        return Intrinsics.d(this.a, zulVar.a) && Intrinsics.d(this.b, zulVar.b) && Intrinsics.d(this.c, zulVar.c) && Intrinsics.d(this.d, zulVar.d) && Intrinsics.d(this.e, zulVar.e) && Intrinsics.d(this.f, zulVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int d = k5r.d((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.c);
        r1u r1uVar = this.d;
        int hashCode2 = (d + (r1uVar == null ? 0 : r1uVar.hashCode())) * 31;
        ff ffVar = this.e;
        int hashCode3 = (hashCode2 + (ffVar == null ? 0 : ffVar.hashCode())) * 31;
        ArrayList arrayList = this.f;
        return hashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "PlaylistFull(playlistHeader=" + this.a + ", fullTracks=" + this.b + ", similar=" + this.c + ", vibeButtonInfo=" + this.d + ", actionInfo=" + this.e + ", playlistTracks=" + this.f + ")";
    }
}
