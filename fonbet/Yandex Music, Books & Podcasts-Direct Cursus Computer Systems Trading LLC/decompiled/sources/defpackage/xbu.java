package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes6.dex */
public final class xbu {
    public final gm5 a;
    public final jau b;
    public final qdc c;
    public final String d;
    public final c5p e;
    public final c5p f;
    public final rp7 g;
    public final ime h;
    public ecg i;
    public final int j;
    public final ArrayList k;
    public final ArrayList l;
    public LinkedHashMap m;
    public boolean n;
    public final LinkedHashSet o;
    public final LinkedHashMap p;
    public final s5g q;
    public boolean r;
    public hnm s;
    public int t;
    public int u;

    public xbu(gm5 gm5Var, jau jauVar, qdc qdcVar, String str, c5p c5pVar, c5p c5pVar2, rp7 rp7Var, ime imeVar, s1 s1Var, tf6 tf6Var) {
        s1Var.getClass();
        this.a = gm5Var;
        this.b = jauVar;
        this.c = qdcVar;
        this.d = str;
        this.e = c5pVar;
        this.f = c5pVar2;
        this.g = rp7Var;
        this.h = imeVar;
        this.j = s1Var.d();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new LinkedHashMap();
        this.o = new LinkedHashSet();
        this.p = new LinkedHashMap();
        this.q = new s5g();
        vbu vbuVar = new vbu(this);
        x97.y(tf6Var, null, null, new npt(this, null, 6), 3);
        ((yjj) imeVar.c).a(vbuVar);
        this.t = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
    }

    public static String a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((imh) it.next()).d);
        }
        return CollectionsKt.X(arrayList, null, null, null, null, 63);
    }

    public final void b() {
        if (!this.r) {
            ngl.r(this.c, "VideoPreloadManager", "releasePreloadManager", "preloadManager is not ready!", null, new Object[0], 8);
            return;
        }
        hnm hnmVar = this.s;
        if (hnmVar == null) {
            Intrinsics.j("preloadManager");
            throw null;
        }
        aom d = hnmVar.d();
        Iterator it = this.p.values().iterator();
        while (it.hasNext()) {
            d.c((VideoData) it.next());
        }
        d.commit();
        hnm hnmVar2 = this.s;
        if (hnmVar2 == null) {
            Intrinsics.j("preloadManager");
            throw null;
        }
        hnmVar2.shutdown();
        jau jauVar = this.b;
        jauVar.c.shutdown();
        Iterator it2 = jauVar.f.entrySet().iterator();
        while (it2.hasNext()) {
            ((Future) ((Map.Entry) it2.next()).getValue()).cancel(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z) {
        Throwable th;
        Set<imh> A0;
        hnm hnmVar;
        String str;
        boolean z2 = this.r;
        qdc qdcVar = this.c;
        if (!z2) {
            ngl.r(qdcVar, "VideoPreloadManager", "scheduleItemsToPreloader", "preloadManager is not ready!", null, new Object[0], 8);
            return;
        }
        Throwable th2 = null;
        qdcVar.H("VideoPreloadManager", "scheduleItemsToPreloader", null, new Object[0]);
        Object firstOrNull = CollectionsKt.firstOrNull(this.l);
        ArrayList arrayList = this.k;
        int T = CollectionsKt.T(arrayList, firstOrNull);
        if (T == -1) {
            ngl.r(qdcVar, "VideoPreloadManager", "scheduleItemsToPreloader", "current item not found", null, new Object[0], 8);
        }
        qdcVar.H("VideoPreloadManager", "scheduleItemsToPreloader", "items next to visible = ".concat(a(arrayList.subList(Integer.max(0, T - 4), Integer.min(arrayList.size(), T + 4)))), new Object[0]);
        ArrayList arrayList2 = new ArrayList();
        if (T >= 0) {
            arrayList2.addAll(arrayList.subList(T, Integer.min(arrayList.size(), this.j + T)));
        }
        s5g s5gVar = this.q;
        Set A02 = CollectionsKt.A0(CollectionsKt.e0(arrayList2, s5gVar));
        Set set = A02;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : set) {
            imh imhVar = (imh) obj;
            if (imhVar.a.isEmpty() && (str = imhVar.d) != null && str.length() != 0) {
                arrayList3.add(obj);
            }
        }
        Set A03 = CollectionsKt.A0(arrayList3);
        boolean isEmpty = A03.isEmpty();
        LinkedHashSet linkedHashSet = this.o;
        if (!isEmpty) {
            Set h = wop.h(linkedHashSet, A03);
            qdcVar.H("VideoPreloadManager", "scheduleVideoDataPreload", "items selected for stop preloading by contentId = ".concat(a(CollectionsKt.w0(h))), new Object[0]);
            Set h2 = wop.h(wop.h(wop.h(A03, linkedHashSet), this.m.keySet()), s5gVar);
            qdcVar.H("VideoPreloadManager", "scheduleVideoDataPreload", "items selected for start preloading by contentId = ".concat(a(CollectionsKt.w0(h2))), new Object[0]);
            linkedHashSet.removeAll(h);
            ArrayList arrayList4 = new ArrayList();
            Iterator it = h.iterator();
            while (it.hasNext()) {
                String str2 = ((imh) it.next()).d;
                if (str2 != null) {
                    arrayList4.add(str2);
                }
            }
            jau jauVar = this.b;
            jauVar.a(arrayList4);
            Set<imh> set2 = h2;
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                String str3 = ((imh) it2.next()).d;
                if (str3 != null) {
                    arrayList5.add(str3);
                }
            }
            if (!arrayList5.isEmpty()) {
                ConcurrentHashMap concurrentHashMap = jauVar.f;
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    Throwable th3 = th2;
                    Object next = it3.next();
                    Future future = (Future) concurrentHashMap.get((String) next);
                    if (future == null || future.isDone()) {
                        arrayList6.add(next);
                    }
                    th2 = th3;
                }
                th = th2;
                Future Z = y2x.Z(jauVar.c, new xlr(14, arrayList6, jauVar));
                if (Z != null) {
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        concurrentHashMap.put((String) it4.next(), Z);
                    }
                }
                linkedHashSet.addAll(h2);
                for (imh imhVar2 : set2) {
                    ecg ecgVar = this.i;
                    if (ecgVar != null) {
                        ecgVar.f(imhVar2);
                    }
                }
                LinkedHashMap linkedHashMap = this.p;
                A0 = !z ? CollectionsKt.A0(linkedHashMap.keySet()) : wop.h(linkedHashMap.keySet(), set);
                qdcVar.H("VideoPreloadManager", "scheduleStreamsPreload", "items selected for stop preloading by url = ".concat(a(CollectionsKt.w0(A0))), new Object[0]);
                Set h3 = !z ? wop.h(wop.h(A02, linkedHashSet), s5gVar) : wop.h(wop.h(wop.h(A02, linkedHashSet), linkedHashMap.keySet()), s5gVar);
                qdcVar.H("VideoPreloadManager", "scheduleStreamsPreload", "items selected for start preloading by url = ".concat(a(CollectionsKt.w0(h3))), new Object[0]);
                List<imh> w0 = CollectionsKt.w0(h3);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (imh imhVar3 : w0) {
                    VideoData videoData = (VideoData) this.m.get(imhVar3);
                    if (videoData != null) {
                        linkedHashMap2.put(imhVar3, new wbu(imhVar3, videoData.getManifestUrl()));
                    } else {
                        String P = y7g.P(imhVar3);
                        if (P != null) {
                            linkedHashMap2.put(imhVar3, new wbu(imhVar3, P));
                        }
                    }
                }
                if (A0.isEmpty() || !linkedHashMap2.isEmpty()) {
                    hnmVar = this.s;
                    if (hnmVar != null) {
                        Intrinsics.j("preloadManager");
                        throw th;
                    }
                    aom d = hnmVar.d();
                    for (imh imhVar4 : A0) {
                        VideoData videoData2 = (VideoData) linkedHashMap.get(imhVar4);
                        if (videoData2 != null) {
                            d.c(videoData2);
                        }
                        linkedHashMap.remove(imhVar4);
                    }
                    dnm dnmVar = new dnm(1, Integer.valueOf(this.t), Integer.valueOf(this.u), this.d, Integer.valueOf(((AtomicInteger) this.e.b).getAndIncrement()), this.h.B(), this.f);
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        imh imhVar5 = (imh) entry.getKey();
                        VideoData videoData3 = (VideoData) entry.getValue();
                        d.K(videoData3, dnmVar, new jnm(1));
                        linkedHashMap.put(imhVar5, videoData3);
                        ecg ecgVar2 = this.i;
                        if (ecgVar2 != null) {
                            ecgVar2.f(imhVar5);
                        }
                    }
                    d.commit();
                }
                qdcVar.H("VideoPreloadManager", "scheduleItemsToPreloader", "now preloading streams [" + a(CollectionsKt.w0(linkedHashMap.keySet())) + "], videoData [" + a(CollectionsKt.w0(linkedHashSet)) + ']', new Object[0]);
                return;
            }
        }
        th = null;
        LinkedHashMap linkedHashMap3 = this.p;
        if (!z) {
        }
        qdcVar.H("VideoPreloadManager", "scheduleStreamsPreload", "items selected for stop preloading by url = ".concat(a(CollectionsKt.w0(A0))), new Object[0]);
        if (!z) {
        }
        qdcVar.H("VideoPreloadManager", "scheduleStreamsPreload", "items selected for start preloading by url = ".concat(a(CollectionsKt.w0(h3))), new Object[0]);
        List<imh> w02 = CollectionsKt.w0(h3);
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        while (r1.hasNext()) {
        }
        if (A0.isEmpty()) {
        }
        hnmVar = this.s;
        if (hnmVar != null) {
        }
    }
}
