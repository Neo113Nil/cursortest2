package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class eag {
    public final List a;
    public final List b;
    public final List c;
    public final Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final List i;
    public final List j;
    public final Map k;
    public final Map l;
    public final Map m;
    public final Map n;
    public final Set o;
    public final Set p;
    public final Map q;

    public eag(List list, List list2, List list3, Map map, Map map2, Map map3, Map map4, Map map5, List list4, List list5, Map map6, Map map7, Map map8, Map map9, Set set, Set set2, Map map10) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        list4.getClass();
        list5.getClass();
        map6.getClass();
        map7.getClass();
        map8.getClass();
        map9.getClass();
        set.getClass();
        set2.getClass();
        map10.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = map;
        this.e = map2;
        this.f = map3;
        this.g = map4;
        this.h = map5;
        this.i = list4;
        this.j = list5;
        this.k = map6;
        this.l = map7;
        this.m = map8;
        this.n = map9;
        this.o = set;
        this.p = set2;
        this.q = map10;
    }

    public static eag a(eag eagVar, ArrayList arrayList, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, ArrayList arrayList3, ArrayList arrayList4, LinkedHashMap linkedHashMap6, LinkedHashMap linkedHashMap7, LinkedHashMap linkedHashMap8, LinkedHashMap linkedHashMap9, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap10, int i) {
        List list2 = (i & 1) != 0 ? eagVar.a : arrayList;
        List list3 = (i & 2) != 0 ? eagVar.b : list;
        List list4 = (i & 4) != 0 ? eagVar.c : arrayList2;
        Map map = (i & 8) != 0 ? eagVar.d : linkedHashMap;
        Map map2 = (i & 16) != 0 ? eagVar.e : linkedHashMap2;
        Map map3 = (i & 32) != 0 ? eagVar.f : linkedHashMap3;
        Map map4 = (i & 64) != 0 ? eagVar.g : linkedHashMap4;
        Map map5 = (i & 128) != 0 ? eagVar.h : linkedHashMap5;
        List list5 = (i & 256) != 0 ? eagVar.i : arrayList3;
        List list6 = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? eagVar.j : arrayList4;
        Map map6 = (i & 1024) != 0 ? eagVar.k : linkedHashMap6;
        Map map7 = (i & 2048) != 0 ? eagVar.l : linkedHashMap7;
        Map map8 = (i & 4096) != 0 ? eagVar.m : linkedHashMap8;
        Map map9 = (i & RemoteCameraConfig.Notification.ID) != 0 ? eagVar.n : linkedHashMap9;
        List list7 = list2;
        Set set = (i & 16384) != 0 ? eagVar.o : linkedHashSet;
        Set set2 = (i & SQLiteDatabase.OPEN_NOMUTEX) != 0 ? eagVar.p : linkedHashSet2;
        Map map10 = (i & SQLiteDatabase.OPEN_FULLMUTEX) != 0 ? eagVar.q : linkedHashMap10;
        eagVar.getClass();
        list7.getClass();
        list3.getClass();
        list4.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        list5.getClass();
        list6.getClass();
        map6.getClass();
        map7.getClass();
        map8.getClass();
        map9.getClass();
        set.getClass();
        set2.getClass();
        map10.getClass();
        return new eag(list7, list3, list4, map, map2, map3, map4, map5, list5, list6, map6, map7, map8, map9, set, set2, map10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eag)) {
            return false;
        }
        eag eagVar = (eag) obj;
        return Intrinsics.d(this.a, eagVar.a) && Intrinsics.d(this.b, eagVar.b) && Intrinsics.d(this.c, eagVar.c) && Intrinsics.d(this.d, eagVar.d) && Intrinsics.d(this.e, eagVar.e) && Intrinsics.d(this.f, eagVar.f) && Intrinsics.d(this.g, eagVar.g) && Intrinsics.d(this.h, eagVar.h) && Intrinsics.d(this.i, eagVar.i) && Intrinsics.d(this.j, eagVar.j) && Intrinsics.d(this.k, eagVar.k) && Intrinsics.d(this.l, eagVar.l) && Intrinsics.d(this.m, eagVar.m) && Intrinsics.d(this.n, eagVar.n) && Intrinsics.d(this.o, eagVar.o) && Intrinsics.d(this.p, eagVar.p) && Intrinsics.d(this.q, eagVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + su4.f(this.p, su4.f(this.o, f1d.b(this.n, f1d.b(this.m, f1d.b(this.l, f1d.b(this.k, k5r.d(k5r.d(f1d.b(this.h, f1d.b(this.g, f1d.b(this.f, f1d.b(this.e, f1d.b(this.d, k5r.d(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31), 31), 31, this.i), 31, this.j), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListSdkDebugData(mediaData=");
        sb.append(this.a);
        sb.append(", visibleMediaData=");
        sb.append(this.b);
        sb.append(", currentItems=");
        sb.append(this.c);
        sb.append(", preloadData=");
        sb.append(this.d);
        sb.append(", attachedListPlayerIndex=");
        sb.append(this.e);
        sb.append(", attachedEnginesData=");
        sb.append(this.f);
        sb.append(", decoderData=");
        sb.append(this.g);
        sb.append(", fatalErrorData=");
        sb.append(this.h);
        sb.append(", startVideoBitrateData=");
        sb.append(this.i);
        sb.append(", speedTelemetry=");
        sb.append(this.j);
        sb.append(", isStartFromCache=");
        sb.append(this.k);
        sb.append(", isOnDemand=");
        sb.append(this.l);
        sb.append(", videoTrackData=");
        sb.append(this.m);
        sb.append(", currentBufferSize=");
        sb.append(this.n);
        sb.append(", listBandwidthHistory=");
        sb.append(this.o);
        sb.append(", loadedChunksHistory=");
        sb.append(this.p);
        sb.append(", playDelta=");
        return k5r.p(sb, this.q, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eag() {
        this(r1, r1, r1, r4, r4, r4, r4, r4, r1, r1, r4, r4, r4, r4, r15, r15, r4);
        c5b c5bVar = c5b.a;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        e5bVar.getClass();
        e5bVar.getClass();
        e5bVar.getClass();
        e5bVar.getClass();
        e5bVar.getClass();
        e5bVar.getClass();
        e5bVar.getClass();
        e5bVar.getClass();
        q5b q5bVar = q5b.a;
        e5bVar.getClass();
    }
}
