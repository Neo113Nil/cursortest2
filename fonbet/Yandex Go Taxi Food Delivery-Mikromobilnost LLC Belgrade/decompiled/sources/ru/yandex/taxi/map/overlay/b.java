package ru.yandex.taxi.map.overlay;

import com.yandex.mapkit.geometry.Polygon;
import defpackage.ah00;
import defpackage.d56;
import defpackage.et00;
import defpackage.g050;
import defpackage.gh00;
import defpackage.gr7;
import defpackage.gtq0;
import defpackage.iwa1;
import defpackage.j63;
import defpackage.jst;
import defpackage.kv5;
import defpackage.n3e0;
import defpackage.n56;
import defpackage.ny61;
import defpackage.o56;
import defpackage.pzt0;
import defpackage.r8;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.unr0;
import defpackage.xm00;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes6.dex */
public final class b extends r8 {
    public final kotlinx.coroutines.sync.a A;
    public a B;
    public int C;
    public pzt0 D;
    public final tse c;
    public final tt2 w;
    public final et00 x;
    public final ConcurrentHashMap y;
    public final xm00 z;

    public b(ah00 ah00Var, tse tseVar, tt2 tt2Var, et00 et00Var) {
        super(5, ah00Var);
        this.c = tseVar;
        this.w = tt2Var;
        this.x = et00Var;
        this.y = new ConcurrentHashMap();
        this.z = new xm00();
        this.A = gtq0.a();
        gh00 gh00Var = (gh00) ah00Var;
        this.C = (int) gh00Var.j();
        gh00Var.q(new kv5(13, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:11:0x0064, B:12:0x006e, B:14:0x0074, B:19:0x0094), top: B:10:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Hg(b bVar, ContinuationImpl continuationImpl) {
        BlockedZonesOverlay$onZoomUpdate$1 blockedZonesOverlay$onZoomUpdate$1;
        int i;
        g050 g050Var;
        bVar.getClass();
        try {
            if (continuationImpl instanceof BlockedZonesOverlay$onZoomUpdate$1) {
                blockedZonesOverlay$onZoomUpdate$1 = (BlockedZonesOverlay$onZoomUpdate$1) continuationImpl;
                int i2 = blockedZonesOverlay$onZoomUpdate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    blockedZonesOverlay$onZoomUpdate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = blockedZonesOverlay$onZoomUpdate$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = blockedZonesOverlay$onZoomUpdate$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        int j = (int) ((gh00) ((ah00) bVar.b)).j();
                        pzt0 pzt0Var = bVar.D;
                        if ((pzt0Var == null || !pzt0Var.isActive()) && j != bVar.C) {
                            bVar.C = j;
                            kotlinx.coroutines.sync.a aVar = bVar.A;
                            blockedZonesOverlay$onZoomUpdate$1.L$0 = aVar;
                            blockedZonesOverlay$onZoomUpdate$1.I$0 = j;
                            blockedZonesOverlay$onZoomUpdate$1.label = 1;
                            if (aVar.a(blockedZonesOverlay$onZoomUpdate$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            g050Var = aVar;
                        }
                        return zy11.a;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) blockedZonesOverlay$onZoomUpdate$1.L$0;
                    kotlin.b.b(obj);
                    for (Map.Entry entry : bVar.y.entrySet()) {
                        d56 d56Var = (d56) entry.getKey();
                        n3e0 n3e0Var = (n3e0) entry.getValue();
                        int[] iArr = d56Var.e;
                        boolean z = false;
                        int i3 = iArr[0];
                        int i4 = iArr[1];
                        int i5 = bVar.C;
                        if (i3 <= i5 && i5 <= i4) {
                            z = true;
                        }
                        n3e0Var.i(z);
                    }
                    return zy11.a;
                }
            }
            while (r9.hasNext()) {
            }
            return zy11.a;
        } finally {
            g050Var.d(null);
        }
        blockedZonesOverlay$onZoomUpdate$1 = new BlockedZonesOverlay$onZoomUpdate$1(bVar, continuationImpl);
        Object obj2 = blockedZonesOverlay$onZoomUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = blockedZonesOverlay$onZoomUpdate$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:11:0x004e, B:12:0x0059, B:14:0x005f, B:17:0x006d, B:22:0x0074, B:23:0x0085, B:25:0x008b, B:30:0x00b8, B:34:0x00c2), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:11:0x004e, B:12:0x0059, B:14:0x005f, B:17:0x006d, B:22:0x0074, B:23:0x0085, B:25:0x008b, B:30:0x00b8, B:34:0x00c2), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2 A[LOOP:2: B:36:0x00dc->B:38:0x00e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8 A[LOOP:3: B:41:0x00f2->B:43:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r13v11, types: [hr7, ru.yandex.taxi.map.overlay.a] */
    /* JADX WARN: Type inference failed for: r13v13, types: [g050] */
    /* JADX WARN: Type inference failed for: r14v11, types: [gh00] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Ig(final b bVar, n56 n56Var, ContinuationImpl continuationImpl) {
        BlockedZonesOverlay$updatePolygons$1 blockedZonesOverlay$updatePolygons$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Iterator it;
        Iterator it2;
        xm00 xm00Var = bVar.z;
        ConcurrentHashMap concurrentHashMap = bVar.y;
        try {
            if (continuationImpl instanceof BlockedZonesOverlay$updatePolygons$1) {
                blockedZonesOverlay$updatePolygons$1 = (BlockedZonesOverlay$updatePolygons$1) continuationImpl;
                int i2 = blockedZonesOverlay$updatePolygons$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    blockedZonesOverlay$updatePolygons$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = blockedZonesOverlay$updatePolygons$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = blockedZonesOverlay$updatePolygons$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = bVar.A;
                        blockedZonesOverlay$updatePolygons$1.L$0 = n56Var;
                        blockedZonesOverlay$updatePolygons$1.L$1 = aVar;
                        blockedZonesOverlay$updatePolygons$1.label = 1;
                        if (aVar.a(blockedZonesOverlay$updatePolygons$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r13 = (g050) blockedZonesOverlay$updatePolygons$1.L$1;
                        n56 n56Var2 = (n56) blockedZonesOverlay$updatePolygons$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r13;
                        n56Var = n56Var2;
                    }
                    j63 j63Var = n56Var.a;
                    ArrayList arrayList = new ArrayList();
                    it = j63Var.iterator();
                    while (it.hasNext()) {
                        n3e0 n3e0Var = (n3e0) concurrentHashMap.remove((d56) it.next());
                        if (n3e0Var != null) {
                            arrayList.add(n3e0Var);
                        }
                    }
                    ArrayList<o56> arrayList2 = n56Var.b;
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    for (o56 o56Var : arrayList2) {
                        Polygon polygon = o56Var.a;
                        d56 d56Var = o56Var.b;
                        n3e0 n3e0Var2 = new n3e0(polygon);
                        n3e0Var2.r(d56Var.b);
                        n3e0Var2.u(d56Var.a);
                        n3e0Var2.p(d56Var.c);
                        int[] iArr = d56Var.e;
                        boolean z = false;
                        int i3 = iArr[0];
                        int i4 = iArr[1];
                        int i5 = bVar.C;
                        if (i3 <= i5 && i5 <= i4) {
                            z = true;
                        }
                        n3e0Var2.i(z);
                        concurrentHashMap.put(d56Var, n3e0Var2);
                        arrayList3.add(n3e0Var2);
                    }
                    Pair pair = new Pair(arrayList, arrayList3);
                    aVar.d(null);
                    List list = (List) pair.getFirst();
                    List<n3e0> list2 = (List) pair.getSecond();
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        xm00Var.o((n3e0) it2.next());
                    }
                    for (n3e0 n3e0Var3 : list2) {
                        xm00Var.getClass();
                        n3e0Var3.b(xm00Var);
                    }
                    if (bVar.B == null && !concurrentHashMap.isEmpty()) {
                        ?? r132 = new gr7() { // from class: ru.yandex.taxi.map.overlay.a
                            @Override // defpackage.gr7
                            public final void a8() {
                                b bVar2 = b.this;
                                tje.N(bVar2.c, null, null, new BlockedZonesOverlay$updatePolygons$5$1(bVar2, null), 3);
                            }
                        };
                        ((gh00) ((ah00) bVar.b)).e(r132);
                        bVar.B = r132;
                    }
                    return zy11.a;
                }
            }
            j63 j63Var2 = n56Var.a;
            ArrayList arrayList4 = new ArrayList();
            it = j63Var2.iterator();
            while (it.hasNext()) {
            }
            ArrayList<o56> arrayList22 = n56Var.b;
            ArrayList arrayList32 = new ArrayList(tcc.n(arrayList22, 10));
            while (r13.hasNext()) {
            }
            Pair pair2 = new Pair(arrayList4, arrayList32);
            aVar.d(null);
            List list3 = (List) pair2.getFirst();
            List<n3e0> list22 = (List) pair2.getSecond();
            it2 = list3.iterator();
            while (it2.hasNext()) {
            }
            while (r13.hasNext()) {
            }
            if (bVar.B == null) {
                ?? r1322 = new gr7() { // from class: ru.yandex.taxi.map.overlay.a
                    @Override // defpackage.gr7
                    public final void a8() {
                        b bVar2 = b.this;
                        tje.N(bVar2.c, null, null, new BlockedZonesOverlay$updatePolygons$5$1(bVar2, null), 3);
                    }
                };
                ((gh00) ((ah00) bVar.b)).e(r1322);
                bVar.B = r1322;
            }
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        blockedZonesOverlay$updatePolygons$1 = new BlockedZonesOverlay$updatePolygons$1(bVar, continuationImpl);
        Object obj2 = blockedZonesOverlay$updatePolygons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = blockedZonesOverlay$updatePolygons$1.label;
        if (i != 0) {
        }
    }

    public static o56 Lg(d56 d56Var) {
        Polygon j;
        unr0.C(new Object[]{d56Var.f}, 1, "create polygon for %s", jst.e);
        List list = d56Var.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ru.yandex.taxi.map.utils.a.H((List) it.next()));
        }
        List list2 = (List) kotlin.collections.a.P(arrayList);
        List J = kotlin.collections.a.J(arrayList, 1);
        ArrayList a = iwa1.a(list2);
        if (a == null) {
            j = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int size = J.size();
            for (int i = 0; i < size; i++) {
                ArrayList a2 = iwa1.a((List) J.get(i));
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            j = k.j(a, arrayList2);
        }
        if (j != null) {
            return new o56(j, d56Var);
        }
        return null;
    }

    public final void Jg() {
        pzt0 pzt0Var = this.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.D = null;
        Kg();
    }

    public final void Kg() {
        a aVar = this.B;
        if (aVar != null) {
            ((gh00) ((ah00) this.b)).u(aVar);
            this.B = null;
        }
        this.z.m();
        kotlinx.coroutines.sync.a aVar2 = this.A;
        if (aVar2.h()) {
            try {
                this.y.clear();
            } finally {
                aVar2.d(null);
            }
        }
    }

    public final void Mg(List list) {
        pzt0 pzt0Var = this.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.D = tje.N(this.c, null, null, new BlockedZonesOverlay$showZones$1(this, list, null), 3);
    }
}
