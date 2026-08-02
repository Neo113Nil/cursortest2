package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c63 implements k63 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final ArrayList e;
    public final jyr f;
    public final jyr g;
    public final jyr h;

    public c63(List list, List list2, List list3, List list4, ArrayList arrayList) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = arrayList;
        final int i = 0;
        this.f = btf.b(new Function0(this) { // from class: b63
            public final /* synthetic */ c63 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        c63 c63Var = this.b;
                        ArrayList g0 = CollectionsKt.g0(CollectionsKt.g0(c63Var.a, c63Var.b), c63Var.c);
                        ArrayList arrayList2 = new ArrayList(v75.o(g0, 10));
                        Iterator it = g0.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((String) ((afa) it.next()).a);
                        }
                        return arrayList2;
                    case 1:
                        List list5 = this.b.d;
                        ArrayList arrayList3 = new ArrayList(v75.o(list5, 10));
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add((String) ((afa) it2.next()).a);
                        }
                        return arrayList3;
                    default:
                        ArrayList arrayList4 = this.b.e;
                        ArrayList arrayList5 = new ArrayList(v75.o(arrayList4, 10));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add((nvl) ((afa) it3.next()).a);
                        }
                        return arrayList5;
                }
            }
        });
        final int i2 = 1;
        this.g = btf.b(new Function0(this) { // from class: b63
            public final /* synthetic */ c63 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        c63 c63Var = this.b;
                        ArrayList g0 = CollectionsKt.g0(CollectionsKt.g0(c63Var.a, c63Var.b), c63Var.c);
                        ArrayList arrayList2 = new ArrayList(v75.o(g0, 10));
                        Iterator it = g0.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((String) ((afa) it.next()).a);
                        }
                        return arrayList2;
                    case 1:
                        List list5 = this.b.d;
                        ArrayList arrayList3 = new ArrayList(v75.o(list5, 10));
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add((String) ((afa) it2.next()).a);
                        }
                        return arrayList3;
                    default:
                        ArrayList arrayList4 = this.b.e;
                        ArrayList arrayList5 = new ArrayList(v75.o(arrayList4, 10));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add((nvl) ((afa) it3.next()).a);
                        }
                        return arrayList5;
                }
            }
        });
        final int i3 = 2;
        this.h = btf.b(new Function0(this) { // from class: b63
            public final /* synthetic */ c63 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        c63 c63Var = this.b;
                        ArrayList g0 = CollectionsKt.g0(CollectionsKt.g0(c63Var.a, c63Var.b), c63Var.c);
                        ArrayList arrayList2 = new ArrayList(v75.o(g0, 10));
                        Iterator it = g0.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((String) ((afa) it.next()).a);
                        }
                        return arrayList2;
                    case 1:
                        List list5 = this.b.d;
                        ArrayList arrayList3 = new ArrayList(v75.o(list5, 10));
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add((String) ((afa) it2.next()).a);
                        }
                        return arrayList3;
                    default:
                        ArrayList arrayList4 = this.b.e;
                        ArrayList arrayList5 = new ArrayList(v75.o(arrayList4, 10));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add((nvl) ((afa) it3.next()).a);
                        }
                        return arrayList5;
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c63)) {
            return false;
        }
        c63 c63Var = (c63) obj;
        return Intrinsics.d(this.a, c63Var.a) && Intrinsics.d(this.b, c63Var.b) && Intrinsics.d(this.c, c63Var.c) && Intrinsics.d(this.d, c63Var.d) && this.e.equals(c63Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.d(k5r.d(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadedEntitiesBlockLocalData(autoDownloadedTracks=");
        sb.append(this.a);
        sb.append(", smartDownloadedTracks=");
        sb.append(this.b);
        sb.append(", manualDownloadedTracks=");
        sb.append(this.c);
        sb.append(", downloadedAlbums=");
        sb.append(this.d);
        sb.append(", downloadedPlaylists=");
        return vz1.t(sb, this.e, ")");
    }
}
