package ru.yandex.taxi.masstransit.trains.search;

import defpackage.avj0;
import defpackage.b611;
import defpackage.cc01;
import defpackage.czo0;
import defpackage.e0h0;
import defpackage.fmt;
import defpackage.hbp0;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.lc01;
import defpackage.mdh;
import defpackage.nc01;
import defpackage.ny61;
import defpackage.p6o;
import defpackage.p8v0;
import defpackage.pc01;
import defpackage.pzt0;
import defpackage.q8v0;
import defpackage.qoi0;
import defpackage.s8o;
import defpackage.sc01;
import defpackage.sib1;
import defpackage.sjh;
import defpackage.smw0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u1n;
import defpackage.uyj;
import defpackage.vwp0;
import defpackage.w511;
import defpackage.wc01;
import defpackage.xb01;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.video.m3.BuildConfig;

/* loaded from: classes6.dex */
public final class a {
    public final lc01 a;
    public final d b;
    public final b611 c;
    public final TransportRouteAnalytics$FlowOrigin d;
    public final hbp0 e;
    public pzt0 f;
    public boolean g;

    public a(lc01 lc01Var, d dVar, b611 b611Var, TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin) {
        this.a = lc01Var;
        this.b = dVar;
        this.c = b611Var;
        this.d = transportRouteAnalytics$FlowOrigin;
        String d = qoi0.a(a.class.getClass()).d();
        this.e = new hbp0(new czo0(14), d == null ? "" : d, null);
    }

    public final void a(String str, pc01 pc01Var, SuggestType suggestType) {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = hbp0.e(this.e, null, null, new TrainStationSearchActionInteractor$debouncedSearch$1(this, str, pc01Var, suggestType, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0165 A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #2 {all -> 0x019f, blocks: (B:16:0x015f, B:18:0x0165, B:23:0x01a2, B:24:0x01a6, B:27:0x01c3, B:29:0x01c7, B:61:0x013b, B:83:0x0111), top: B:82:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a2 A[Catch: all -> 0x019f, TRY_ENTER, TryCatch #2 {all -> 0x019f, blocks: (B:16:0x015f, B:18:0x0165, B:23:0x01a2, B:24:0x01a6, B:27:0x01c3, B:29:0x01c7, B:61:0x013b, B:83:0x0111), top: B:82:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02a6 A[LOOP:1: B:34:0x01ff->B:36:0x02a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0218 A[EDGE_INSN: B:37:0x0218->B:38:0x0218 BREAK  A[LOOP:1: B:34:0x01ff->B:36:0x02a6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0196 -> B:14:0x0198). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, pc01 pc01Var, SuggestType suggestType, ContinuationImpl continuationImpl) {
        TrainStationSearchActionInteractor$performSearch$1 trainStationSearchActionInteractor$performSearch$1;
        int i;
        Object value;
        nc01 nc01Var;
        ArrayList arrayList;
        Pair pair;
        SuggestType suggestType2;
        ArrayList arrayList2;
        String str2;
        SuggestType suggestType3;
        Iterator it;
        pc01 pc01Var2;
        String b;
        r0 r0Var;
        Object value2;
        String str3;
        String str4;
        String str5;
        zuj0 zuj0Var;
        Object value3;
        avj0 avj0Var;
        Object value4;
        String str6;
        pc01 pc01Var3 = pc01Var;
        if (continuationImpl instanceof TrainStationSearchActionInteractor$performSearch$1) {
            trainStationSearchActionInteractor$performSearch$1 = (TrainStationSearchActionInteractor$performSearch$1) continuationImpl;
            int i2 = trainStationSearchActionInteractor$performSearch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trainStationSearchActionInteractor$performSearch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trainStationSearchActionInteractor$performSearch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trainStationSearchActionInteractor$performSearch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var2 = pc01Var3.d;
                    do {
                        value = r0Var2.getValue();
                        nc01Var = (nc01) value;
                        arrayList = new ArrayList(2);
                        for (int i3 = 0; i3 < 2; i3++) {
                            arrayList.add(p8v0.a);
                        }
                    } while (!r0Var2.k(value, nc01.a(nc01Var, null, null, arrayList, null, null, null, 4091)));
                    nc01 nc01Var2 = (nc01) pc01Var3.d.getValue();
                    int i4 = cc01.b[suggestType.ordinal()];
                    if (i4 == 1) {
                        vwp0 vwp0Var = nc01Var2.b;
                        String str7 = vwp0Var.e;
                        if (!vwp0Var.d) {
                            str7 = null;
                        }
                        pair = new Pair(null, str7);
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        vwp0 vwp0Var2 = nc01Var2.a;
                        String str8 = vwp0Var2.e;
                        if (!vwp0Var2.d) {
                            str8 = null;
                        }
                        pair = new Pair(str8, null);
                    }
                    String str9 = (String) pair.getFirst();
                    String str10 = (String) pair.getSecond();
                    try {
                        lc01 lc01Var = this.a;
                        trainStationSearchActionInteractor$performSearch$1.L$0 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$1 = pc01Var3;
                        suggestType2 = suggestType;
                        trainStationSearchActionInteractor$performSearch$1.L$2 = suggestType2;
                        trainStationSearchActionInteractor$performSearch$1.L$3 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$4 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$5 = null;
                        trainStationSearchActionInteractor$performSearch$1.label = 1;
                        lc01Var.a.getClass();
                        sjh sjhVar = uyj.a;
                        obj = tje.k0(mdh.b, new TrainStationSearchRepository$searchStations$2(str, str9, str10, lc01Var, null), trainStationSearchActionInteractor$performSearch$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        th = th;
                        pc01Var2 = pc01Var3;
                        jst.e.getClass();
                        b = sib1.b(s8o.O(th));
                        r0Var = pc01Var2.d;
                        while (true) {
                            value2 = r0Var.getValue();
                            str3 = b;
                            if (r0Var.k(value2, nc01.a((nc01) value2, null, null, null, null, null, b, BuildConfig.VERSION_CODE))) {
                            }
                            b = str3;
                        }
                        nc01 nc01Var3 = (nc01) r0Var.getValue();
                        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = nc01Var3.e;
                        str4 = nc01Var3.a.e;
                        str5 = nc01Var3.b.e;
                        b611 b611Var = this.c;
                        HashMap o = smw0.o(b611Var);
                        if (str3 != null) {
                        }
                        if (str4 != null) {
                        }
                        if (str5 != null) {
                        }
                        o.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
                        b611Var.a.a("TransportRoute.RouteOptionsError.Shown", o, 3, new HashMap());
                        zuj0Var = pc01Var2.b;
                        do {
                            value3 = r0Var.getValue();
                            avj0Var = (avj0) zuj0Var;
                        } while (!r0Var.k(value3, nc01.a((nc01) value3, null, null, null, new p6o(avj0Var.h(kyh0.mt_station_search_title), e0h0.ic_error_stations, avj0Var.h(kyh0.masstransit_trains_station_search_error_title), avj0Var.h(kyh0.masstransit_trains_error_subtitle), new u1n(9, avj0Var.h(kyh0.mt_refresh), xb01.a)), null, null, 3967)));
                        return zy11.a;
                    }
                } else if (i == 1) {
                    SuggestType suggestType4 = (SuggestType) trainStationSearchActionInteractor$performSearch$1.L$2;
                    pc01 pc01Var4 = (pc01) trainStationSearchActionInteractor$performSearch$1.L$1;
                    try {
                        kotlin.b.b(obj);
                        suggestType2 = suggestType4;
                        pc01Var3 = pc01Var4;
                    } catch (Throwable th2) {
                        th = th2;
                        pc01Var2 = pc01Var4;
                        jst.e.getClass();
                        b = sib1.b(s8o.O(th));
                        r0Var = pc01Var2.d;
                        while (true) {
                            value2 = r0Var.getValue();
                            str3 = b;
                            if (r0Var.k(value2, nc01.a((nc01) value2, null, null, null, null, null, b, BuildConfig.VERSION_CODE))) {
                            }
                            b = str3;
                        }
                        nc01 nc01Var32 = (nc01) r0Var.getValue();
                        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin2 = nc01Var32.e;
                        str4 = nc01Var32.a.e;
                        str5 = nc01Var32.b.e;
                        b611 b611Var2 = this.c;
                        HashMap o2 = smw0.o(b611Var2);
                        if (str3 != null) {
                        }
                        if (str4 != null) {
                        }
                        if (str5 != null) {
                        }
                        o2.put("origin", transportRouteAnalytics$FlowOrigin2.getEventValue());
                        b611Var2.a.a("TransportRoute.RouteOptionsError.Shown", o2, 3, new HashMap());
                        zuj0Var = pc01Var2.b;
                        do {
                            value3 = r0Var.getValue();
                            avj0Var = (avj0) zuj0Var;
                        } while (!r0Var.k(value3, nc01.a((nc01) value3, null, null, null, new p6o(avj0Var.h(kyh0.mt_station_search_title), e0h0.ic_error_stations, avj0Var.h(kyh0.masstransit_trains_station_search_error_title), avj0Var.h(kyh0.masstransit_trains_error_subtitle), new u1n(9, avj0Var.h(kyh0.mt_refresh), xb01.a)), null, null, 3967)));
                        return zy11.a;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection = (Collection) trainStationSearchActionInteractor$performSearch$1.L$15;
                    it = (Iterator) trainStationSearchActionInteractor$performSearch$1.L$12;
                    ?? r9 = (Collection) trainStationSearchActionInteractor$performSearch$1.L$11;
                    String str11 = (String) trainStationSearchActionInteractor$performSearch$1.L$8;
                    suggestType3 = (SuggestType) trainStationSearchActionInteractor$performSearch$1.L$2;
                    pc01Var2 = (pc01) trainStationSearchActionInteractor$performSearch$1.L$1;
                    try {
                        kotlin.b.b(obj);
                        str2 = str11;
                        arrayList2 = r9;
                        collection.add((q8v0) obj);
                        pc01Var3 = pc01Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        jst.e.getClass();
                        b = sib1.b(s8o.O(th));
                        r0Var = pc01Var2.d;
                        while (true) {
                            value2 = r0Var.getValue();
                            str3 = b;
                            if (r0Var.k(value2, nc01.a((nc01) value2, null, null, null, null, null, b, BuildConfig.VERSION_CODE))) {
                                break;
                            }
                            b = str3;
                        }
                        nc01 nc01Var322 = (nc01) r0Var.getValue();
                        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin22 = nc01Var322.e;
                        str4 = nc01Var322.a.e;
                        str5 = nc01Var322.b.e;
                        b611 b611Var22 = this.c;
                        HashMap o22 = smw0.o(b611Var22);
                        if (str3 != null) {
                            o22.put("request_id", str3);
                        }
                        if (str4 != null) {
                            o22.put("start_stop_id", str4);
                        }
                        if (str5 != null) {
                            o22.put("final_stop_id", str5);
                        }
                        o22.put("origin", transportRouteAnalytics$FlowOrigin22.getEventValue());
                        b611Var22.a.a("TransportRoute.RouteOptionsError.Shown", o22, 3, new HashMap());
                        zuj0Var = pc01Var2.b;
                        do {
                            value3 = r0Var.getValue();
                            avj0Var = (avj0) zuj0Var;
                        } while (!r0Var.k(value3, nc01.a((nc01) value3, null, null, null, new p6o(avj0Var.h(kyh0.mt_station_search_title), e0h0.ic_error_stations, avj0Var.h(kyh0.masstransit_trains_station_search_error_title), avj0Var.h(kyh0.masstransit_trains_error_subtitle), new u1n(9, avj0Var.h(kyh0.mt_refresh), xb01.a)), null, null, 3967)));
                        return zy11.a;
                    }
                    if (!it.hasNext()) {
                        sc01 sc01Var = (sc01) it.next();
                        d dVar = this.b;
                        trainStationSearchActionInteractor$performSearch$1.L$0 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$1 = pc01Var3;
                        trainStationSearchActionInteractor$performSearch$1.L$2 = suggestType3;
                        trainStationSearchActionInteractor$performSearch$1.L$3 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$4 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$5 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$6 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$7 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$8 = str2;
                        trainStationSearchActionInteractor$performSearch$1.L$9 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$10 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$11 = arrayList2;
                        trainStationSearchActionInteractor$performSearch$1.L$12 = it;
                        trainStationSearchActionInteractor$performSearch$1.L$13 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$14 = null;
                        trainStationSearchActionInteractor$performSearch$1.L$15 = arrayList2;
                        trainStationSearchActionInteractor$performSearch$1.label = 2;
                        obj = dVar.a(sc01Var, suggestType3, trainStationSearchActionInteractor$performSearch$1);
                        if (obj != coroutineSingletons) {
                            pc01Var2 = pc01Var3;
                            collection = arrayList2;
                            collection.add((q8v0) obj);
                            pc01Var3 = pc01Var2;
                            if (!it.hasNext()) {
                                ArrayList arrayList3 = arrayList2;
                                r0 r0Var3 = pc01Var3.d;
                                do {
                                    value4 = r0Var3.getValue();
                                    str6 = str2;
                                    str2 = str6;
                                } while (!r0Var3.k(value4, nc01.a((nc01) value4, null, null, arrayList3, null, null, str6, 3067)));
                                if (!this.g) {
                                    nc01 nc01Var4 = (nc01) pc01Var3.d.getValue();
                                    this.c.h(nc01Var4.l, nc01Var4.e, str2, nc01Var4.a.e, nc01Var4.b.e, Boolean.valueOf(nc01Var4.c.isEmpty()));
                                    this.g = true;
                                }
                                return zy11.a;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                fmt fmtVar = (fmt) obj;
                List list = ((wc01) fmtVar.a).a;
                String a = fmtVar.e.a("X-YaMasstransitRequestId");
                List list2 = list;
                arrayList2 = new ArrayList(tcc.n(list2, 10));
                str2 = a;
                suggestType3 = suggestType2;
                it = list2.iterator();
                if (!it.hasNext()) {
                }
            }
        }
        trainStationSearchActionInteractor$performSearch$1 = new TrainStationSearchActionInteractor$performSearch$1(this, continuationImpl);
        Object obj2 = trainStationSearchActionInteractor$performSearch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trainStationSearchActionInteractor$performSearch$1.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj2;
        List list3 = ((wc01) fmtVar2.a).a;
        String a2 = fmtVar2.e.a("X-YaMasstransitRequestId");
        List list22 = list3;
        arrayList2 = new ArrayList(tcc.n(list22, 10));
        str2 = a2;
        suggestType3 = suggestType2;
        it = list22.iterator();
        if (!it.hasNext()) {
        }
    }
}
