package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class jag {
    public final List a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Integer f;
    public final i6r g;
    public final Boolean h;
    public final Boolean i;
    public final Map j;
    public final Map k;
    public final List l;
    public final List m;
    public final imh n;
    public final boolean o;
    public final Long p;

    public jag(List list, Map map, Map map2, Map map3, Map map4, Integer num, i6r i6rVar, Boolean bool, Boolean bool2, Map map5, Map map6, List list2, List list3, imh imhVar, boolean z, Long l) {
        list.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        map6.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.f = num;
        this.g = i6rVar;
        this.h = bool;
        this.i = bool2;
        this.j = map5;
        this.k = map6;
        this.l = list2;
        this.m = list3;
        this.n = imhVar;
        this.o = z;
        this.p = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jag)) {
            return false;
        }
        jag jagVar = (jag) obj;
        return Intrinsics.d(this.a, jagVar.a) && Intrinsics.d(this.b, jagVar.b) && Intrinsics.d(this.c, jagVar.c) && Intrinsics.d(this.d, jagVar.d) && Intrinsics.d(this.e, jagVar.e) && Intrinsics.d(this.f, jagVar.f) && Intrinsics.d(this.g, jagVar.g) && Intrinsics.d(this.h, jagVar.h) && Intrinsics.d(this.i, jagVar.i) && Intrinsics.d(this.j, jagVar.j) && Intrinsics.d(this.k, jagVar.k) && Intrinsics.d(this.l, jagVar.l) && Intrinsics.d(this.m, jagVar.m) && Intrinsics.d(this.n, jagVar.n) && this.o == jagVar.o && Intrinsics.d(this.p, jagVar.p);
    }

    public final int hashCode() {
        int b = f1d.b(this.e, f1d.b(this.d, f1d.b(this.c, f1d.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        Integer num = this.f;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        i6r i6rVar = this.g;
        int hashCode2 = (hashCode + (i6rVar == null ? 0 : i6rVar.hashCode())) * 31;
        Boolean bool = this.h;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int d = k5r.d(k5r.d(f1d.b(this.k, f1d.b(this.j, (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31), 31), 31, this.l), 31, this.m);
        imh imhVar = this.n;
        int e = k5r.e((d + (imhVar == null ? 0 : imhVar.hashCode())) * 31, 31, this.o);
        Long l = this.p;
        return e + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListSdkPlayerDebugData(mediaData=");
        sb.append(this.a);
        sb.append(", preloadData=");
        sb.append(this.b);
        sb.append(", attachedListPlayerIndex=");
        sb.append(this.c);
        sb.append(", attachedEnginesData=");
        sb.append(this.d);
        sb.append(", decoderData=");
        sb.append(this.e);
        sb.append(", numOfFatals=");
        sb.append(this.f);
        sb.append(", speedTelemetry=");
        sb.append(this.g);
        sb.append(", isStartFromCache=");
        sb.append(this.h);
        sb.append(", isOnDemand=");
        sb.append(this.i);
        sb.append(", videoTrackData=");
        sb.append(this.j);
        sb.append(", currentBufferSize=");
        sb.append(this.k);
        sb.append(", listBandwidthHistory=");
        sb.append(this.l);
        sb.append(", loadedChunksHistory=");
        sb.append(this.m);
        sb.append(", activeMediaData=");
        sb.append(this.n);
        sb.append(", isCompactView=");
        sb.append(this.o);
        sb.append(", playDelta=");
        return tlm.k(sb, this.p, ')');
    }
}
