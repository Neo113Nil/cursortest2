package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wsu implements xsu {
    public final List a;
    public final List b;
    public final vsu c;
    public final teq d;
    public final boolean e;

    public wsu(List list, List list2, vsu vsuVar, teq teqVar, boolean z) {
        list.getClass();
        list2.getClass();
        vsuVar.getClass();
        this.a = list;
        this.b = list2;
        this.c = vsuVar;
        this.d = teqVar;
        this.e = z;
        List list3 = list;
        if (list3.isEmpty()) {
            su4.s(2, null, "RadioInitialTracksInfo.StartWithTracks.tracks must be not empty", null);
        }
        if (vsuVar instanceof ssu) {
            int size = list3.size();
            ssu ssuVar = (ssu) vsuVar;
            int i = ssuVar.b;
            int i2 = ssuVar.a;
            if (i2 < 0 || i2 >= size) {
                su4.s(2, null, hrg.p("Specified tracks current item index is out of bounds: size=", list.size(), ", index = ", ran.a(i2)), null);
            }
            int size2 = list.size();
            if (i < 0 || i > size2) {
                su4.s(2, null, hrg.p("Specified tracks live item index is out of [0; size]: size=", list.size(), ", index = ", ran.a(i)), null);
            }
            if (Intrinsics.e(i2, i) <= 0) {
                return;
            }
            int size3 = list.size();
            String a = ran.a(i2);
            String a2 = ran.a(i);
            StringBuilder r = k5r.r(size3, "Specified tracks current item index is greater than live item index: size=", ", current = ", a, ", live = ");
            r.append(a2);
            su4.s(2, null, r.toString(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [teq] */
    public static wsu a(wsu wsuVar, ArrayList arrayList, ArrayList arrayList2, seq seqVar, int i) {
        ArrayList arrayList3 = arrayList;
        if ((i & 1) != 0) {
            arrayList3 = wsuVar.a;
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = arrayList2;
        if ((i & 2) != 0) {
            arrayList5 = wsuVar.b;
        }
        ArrayList arrayList6 = arrayList5;
        vsu vsuVar = wsuVar.c;
        seq seqVar2 = seqVar;
        if ((i & 8) != 0) {
            seqVar2 = wsuVar.d;
        }
        boolean z = wsuVar.e;
        wsuVar.getClass();
        arrayList4.getClass();
        arrayList6.getClass();
        vsuVar.getClass();
        return new wsu(arrayList4, arrayList6, vsuVar, seqVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsu)) {
            return false;
        }
        wsu wsuVar = (wsu) obj;
        return Intrinsics.d(this.a, wsuVar.a) && Intrinsics.d(this.b, wsuVar.b) && Intrinsics.d(this.c, wsuVar.c) && this.d.equals(wsuVar.d) && this.e == wsuVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("StartWithPlayables(playables=", w1g.J(this.a), ", recommendedPlayables=", w1g.J(this.b), ", startType=");
        m.append(this.c);
        m.append(", shuffle=");
        m.append(this.d);
        m.append(", reverse=");
        return ouj.r(m, this.e, ")");
    }
}
