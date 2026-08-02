package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class kvu {
    public final ArrayList a;
    public final boolean b;
    public final jyr c = btf.b(new jvu(0, this));

    public kvu(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final lvu a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.a;
        for (Object obj : arrayList3) {
            if (((jja) obj).c == hja.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((jja) obj2).c == hja.c) {
                arrayList4.add(obj2);
            } else {
                arrayList5.add(obj2);
            }
        }
        return new lvu(arrayList, arrayList5, arrayList4, arrayList3.size());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvu)) {
            return false;
        }
        kvu kvuVar = (kvu) obj;
        return this.a.equals(kvuVar.a) && this.b == kvuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadedTracks(allTracks=" + this.a + ", withExplicit=" + this.b + ")";
    }
}
