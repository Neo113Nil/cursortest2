package com.gamericefishpro.space.d0;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.data.db.IceFishingDatabase;
import com.gamericefishpro.space.i9.a4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0728 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x072a A[LOOP:5: B:109:0x06e3->B:122:0x072a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x072d A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Bundle source;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Integer.valueOf(Math.round((1 + (((com.gamericefishpro.space.c3.l) obj2) != com.gamericefishpro.space.c3.l.d ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 1:
                com.gamericefishpro.space.e1.d dVar = (com.gamericefishpro.space.e1.d) obj2;
                Map map = dVar.d;
                com.gamericefishpro.space.t.h0 h0Var = dVar.e;
                Object[] objArr = h0Var.b;
                Object[] objArr2 = h0Var.c;
                long[] jArr = h0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapD = ((com.gamericefishpro.space.e1.f) objArr2[i4]).d();
                                    if (mapD.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapD);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 2:
                return obj2;
            case 3:
                com.gamericefishpro.space.f0.w wVar = (com.gamericefishpro.space.f0.w) obj2;
                return com.gamericefishpro.space.ph.x.f(Integer.valueOf(wVar.e.b.g()), Integer.valueOf(wVar.e.c.g()));
            case 4:
                ((Integer) obj2).getClass();
                return new com.gamericefishpro.space.g0.b(1);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.g0.v vVar = (com.gamericefishpro.space.g0.v) obj2;
                return com.gamericefishpro.space.ph.x.f(Integer.valueOf(vVar.d.b.g()), Integer.valueOf(vVar.d.c.g()));
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.f5.d0 d0Var = (com.gamericefishpro.space.f5.d0) obj2;
                com.gamericefishpro.space.i5.g gVar = d0Var.b;
                LinkedHashMap linkedHashMap = gVar.m;
                com.gamericefishpro.space.ph.r rVar = gVar.f;
                LinkedHashMap linkedHashMap2 = gVar.l;
                ArrayList arrayList = new ArrayList();
                com.gamericefishpro.space.ph.m0.c();
                Bundle source2 = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                Intrinsics.checkNotNullParameter(source2, "source");
                for (Map.Entry entry : com.gamericefishpro.space.ph.m0.h(gVar.s.a).entrySet()) {
                    ((com.gamericefishpro.space.f5.p0) entry.getValue()).getClass();
                }
                if (arrayList.isEmpty()) {
                    source = null;
                } else {
                    com.gamericefishpro.space.ph.m0.c();
                    source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(source2, "source");
                    com.gamericefishpro.space.z5.f.c(source2, "android-support-nav:controller:navigatorState:names", arrayList);
                    com.gamericefishpro.space.z5.f.b(source, "android-support-nav:controller:navigatorState", source2);
                }
                if (!rVar.isEmpty()) {
                    if (source == null) {
                        com.gamericefishpro.space.ph.m0.c();
                        source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        Intrinsics.checkNotNullParameter(source, "source");
                    }
                    ArrayList<? extends Parcelable> value = new ArrayList<>();
                    Iterator<E> it = rVar.iterator();
                    while (it.hasNext()) {
                        value.add(new com.gamericefishpro.space.f5.l((com.gamericefishpro.space.f5.k) it.next()).b());
                    }
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStack", "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStack", "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(value, "<this>");
                    source.putParcelableArrayList("android-support-nav:controller:backStack", value);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (source == null) {
                        com.gamericefishpro.space.ph.m0.c();
                        source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        Intrinsics.checkNotNullParameter(source, "source");
                    }
                    int[] value2 = new int[linkedHashMap2.size()];
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int iIntValue = ((Number) entry2.getKey()).intValue();
                        String str = (String) entry2.getValue();
                        int i6 = i5 + 1;
                        value2[i5] = iIntValue;
                        if (str == null) {
                            str = "";
                        }
                        arrayList2.add(str);
                        i5 = i6;
                    }
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackDestIds", "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    source.putIntArray("android-support-nav:controller:backStackDestIds", value2);
                    com.gamericefishpro.space.z5.f.c(source, "android-support-nav:controller:backStackIds", arrayList2);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (source == null) {
                        com.gamericefishpro.space.ph.m0.c();
                        source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        Intrinsics.checkNotNullParameter(source, "source");
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str2 = (String) entry3.getKey();
                        com.gamericefishpro.space.ph.r rVar2 = (com.gamericefishpro.space.ph.r) entry3.getValue();
                        arrayList3.add(str2);
                        ArrayList<? extends Parcelable> value3 = new ArrayList<>();
                        Iterator it2 = rVar2.iterator();
                        while (it2.hasNext()) {
                            value3.add(((com.gamericefishpro.space.f5.l) it2.next()).b());
                        }
                        Intrinsics.checkNotNullParameter(source, "source");
                        String key = "android-support-nav:controller:backStackStates:" + str2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        Intrinsics.checkNotNullParameter(value3, "<this>");
                        source.putParcelableArrayList(key, value3);
                    }
                    Intrinsics.checkNotNullParameter(source, "source");
                    com.gamericefishpro.space.z5.f.c(source, "android-support-nav:controller:backStackStates", arrayList3);
                }
                if (d0Var.e) {
                    if (source == null) {
                        com.gamericefishpro.space.ph.m0.c();
                        source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        Intrinsics.checkNotNullParameter(source, "source");
                    }
                    Intrinsics.checkNotNullParameter(source, "source");
                    boolean z = d0Var.e;
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:deepLinkHandled", "key");
                    source.putBoolean("android-support-nav:controller:deepLinkHandled", z);
                }
                return source;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.pj.a viewModel = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it3 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                Intrinsics.checkNotNullParameter(it3, "it");
                com.gamericefishpro.space.f7.c gameRepository = (com.gamericefishpro.space.f7.c) viewModel.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.f7.c.class));
                Intrinsics.checkNotNullParameter(gameRepository, "gameRepository");
                com.gamericefishpro.space.l7.e eVar = new com.gamericefishpro.space.l7.e(new com.gamericefishpro.space.l7.d(0, 1));
                com.gamericefishpro.space.si.e0.k(new com.gamericefishpro.space.si.m(gameRepository.h, new com.gamericefishpro.space.b2.e0(eVar, null, 7), 1), com.gamericefishpro.space.z4.m0.h(eVar));
                return eVar;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.pj.a viewModel2 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it4 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(viewModel2, "$this$viewModel");
                Intrinsics.checkNotNullParameter(it4, "it");
                com.gamericefishpro.space.f7.c gameRepository2 = (com.gamericefishpro.space.f7.c) viewModel2.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.f7.c.class));
                Intrinsics.checkNotNullParameter(gameRepository2, "gameRepository");
                com.gamericefishpro.space.r7.e eVar2 = new com.gamericefishpro.space.r7.e(new com.gamericefishpro.space.r7.d(com.gamericefishpro.space.ph.g0.d, true));
                com.gamericefishpro.space.si.e0.k(new com.gamericefishpro.space.si.m(com.gamericefishpro.space.hj.c.o(gameRepository2.a.a, new String[]{"fish_levels"}, new p(8)), new com.gamericefishpro.space.k7.e(eVar2, null, 7), 1), com.gamericefishpro.space.z4.m0.h(eVar2));
                return eVar2;
            case 9:
                com.gamericefishpro.space.pj.a single = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it5 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(single, "$this$single");
                Intrinsics.checkNotNullParameter(it5, "it");
                return ((IceFishingDatabase) single.a(com.gamericefishpro.space.ei.b0.a(IceFishingDatabase.class))).w();
            case 10:
                com.gamericefishpro.space.pj.a viewModel3 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a aVar = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(viewModel3, "$this$viewModel");
                Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                return new com.gamericefishpro.space.n7.q(((Number) aVar.a(com.gamericefishpro.space.ei.b0.a(Integer.class))).intValue(), (com.gamericefishpro.space.f7.c) viewModel3.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.f7.c.class)), (com.gamericefishpro.space.w7.b) viewModel3.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.w7.b.class)));
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.pj.a viewModel4 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it6 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(viewModel4, "$this$viewModel");
                Intrinsics.checkNotNullParameter(it6, "it");
                com.gamericefishpro.space.f7.c gameRepository3 = (com.gamericefishpro.space.f7.c) viewModel4.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.f7.c.class));
                Intrinsics.checkNotNullParameter(gameRepository3, "gameRepository");
                com.gamericefishpro.space.k7.f fVar = new com.gamericefishpro.space.k7.f(new com.gamericefishpro.space.k7.c(com.gamericefishpro.space.ph.g0.d));
                com.gamericefishpro.space.si.e0.k(new com.gamericefishpro.space.si.m(com.gamericefishpro.space.hj.c.o(gameRepository3.b.a, new String[]{"ice_achievements"}, new p(11)), new com.gamericefishpro.space.k7.e(fVar, null, 0), 1), com.gamericefishpro.space.z4.m0.h(fVar));
                return fVar;
            case 12:
                com.gamericefishpro.space.pj.a viewModel5 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it7 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(viewModel5, "$this$viewModel");
                Intrinsics.checkNotNullParameter(it7, "it");
                return new com.gamericefishpro.space.s7.i((com.gamericefishpro.space.f7.c) viewModel5.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.f7.c.class)));
            case 13:
                com.gamericefishpro.space.pj.a viewModel6 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it8 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(viewModel6, "$this$viewModel");
                Intrinsics.checkNotNullParameter(it8, "it");
                com.gamericefishpro.space.f7.c gameRepository4 = (com.gamericefishpro.space.f7.c) viewModel6.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.f7.c.class));
                Intrinsics.checkNotNullParameter(gameRepository4, "gameRepository");
                com.gamericefishpro.space.u7.c cVar = new com.gamericefishpro.space.u7.c(new com.gamericefishpro.space.u7.b(0, 0, 0, 0, 0));
                com.gamericefishpro.space.th.a aVar2 = null;
                com.gamericefishpro.space.si.e0.k(new com.gamericefishpro.space.si.m(new com.gamericefishpro.space.si.y(com.gamericefishpro.space.hj.c.o(gameRepository4.a.a, new String[]{"fish_levels"}, new p(8)), gameRepository4.h, new com.gamericefishpro.space.l4.n(3, 2, aVar2)), new com.gamericefishpro.space.k7.e(cVar, aVar2, 11), 1), com.gamericefishpro.space.z4.m0.h(cVar));
                return cVar;
            case 14:
                com.gamericefishpro.space.pj.a viewModel7 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it9 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(viewModel7, "$this$viewModel");
                Intrinsics.checkNotNullParameter(it9, "it");
                com.gamericefishpro.space.f7.c gameRepository5 = (com.gamericefishpro.space.f7.c) viewModel7.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.f7.c.class));
                Intrinsics.checkNotNullParameter(gameRepository5, "gameRepository");
                com.gamericefishpro.space.o7.e eVar3 = new com.gamericefishpro.space.o7.e(new com.gamericefishpro.space.o7.d(com.gamericefishpro.space.ph.g0.d, true));
                com.gamericefishpro.space.si.e0.k(new com.gamericefishpro.space.si.m(com.gamericefishpro.space.hj.c.o(gameRepository5.d.a, new String[]{"ice_game_history"}, new p(13)), new com.gamericefishpro.space.k7.e(eVar3, null, 6), 1), com.gamericefishpro.space.z4.m0.h(eVar3));
                return eVar3;
            case 15:
                com.gamericefishpro.space.pj.a single2 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it10 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(single2, "$this$single");
                Intrinsics.checkNotNullParameter(it10, "it");
                return ((IceFishingDatabase) single2.a(com.gamericefishpro.space.ei.b0.a(IceFishingDatabase.class))).z();
            case 16:
                com.gamericefishpro.space.pj.a single3 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it11 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(single3, "$this$single");
                Intrinsics.checkNotNullParameter(it11, "it");
                return ((IceFishingDatabase) single3.a(com.gamericefishpro.space.ei.b0.a(IceFishingDatabase.class))).x();
            case 17:
                com.gamericefishpro.space.pj.a single4 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it12 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(single4, "$this$single");
                Intrinsics.checkNotNullParameter(it12, "it");
                return IceFishingDatabase.l.b(a4.m(single4));
            case 18:
                com.gamericefishpro.space.pj.a single5 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it13 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(single5, "$this$single");
                Intrinsics.checkNotNullParameter(it13, "it");
                return ((IceFishingDatabase) single5.a(com.gamericefishpro.space.ei.b0.a(IceFishingDatabase.class))).y();
            case 19:
                com.gamericefishpro.space.lj.a it14 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter((com.gamericefishpro.space.pj.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it14, "it");
                return new com.gamericefishpro.space.e7.h();
            case 20:
                com.gamericefishpro.space.lj.a it15 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter((com.gamericefishpro.space.pj.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it15, "it");
                return new com.gamericefishpro.space.e7.e();
            case 21:
                com.gamericefishpro.space.lj.a it16 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter((com.gamericefishpro.space.pj.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it16, "it");
                return new com.gamericefishpro.space.e7.g();
            case 22:
                com.gamericefishpro.space.lj.a it17 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter((com.gamericefishpro.space.pj.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it17, "it");
                return new com.gamericefishpro.space.e7.b();
            case 23:
                com.gamericefishpro.space.pj.a single6 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it18 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(single6, "$this$single");
                Intrinsics.checkNotNullParameter(it18, "it");
                return new com.gamericefishpro.space.c7.m(a4.m(single6));
            case 24:
                com.gamericefishpro.space.pj.a single7 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it19 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(single7, "$this$single");
                Intrinsics.checkNotNullParameter(it19, "it");
                return new com.gamericefishpro.space.f7.j(a4.m(single7), (com.gamericefishpro.space.d7.n) single7.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.d7.n.class)), (com.gamericefishpro.space.e7.h) single7.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.e7.h.class)), (com.gamericefishpro.space.e7.e) single7.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.e7.e.class)), (com.gamericefishpro.space.e7.g) single7.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.e7.g.class)), (com.gamericefishpro.space.e7.b) single7.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.e7.b.class)));
            case 25:
                com.gamericefishpro.space.pj.a single8 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it20 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(single8, "$this$single");
                Intrinsics.checkNotNullParameter(it20, "it");
                return new com.gamericefishpro.space.f7.c((com.gamericefishpro.space.d7.c) single8.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.d7.c.class)), (com.gamericefishpro.space.d7.f) single8.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.d7.f.class)), (com.gamericefishpro.space.c7.m) single8.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.c7.m.class)), (com.gamericefishpro.space.d7.k) single8.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.d7.k.class)));
            case 26:
                com.gamericefishpro.space.lj.a it21 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter((com.gamericefishpro.space.pj.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it21, "it");
                return new com.gamericefishpro.space.x7.g();
            case 27:
                com.gamericefishpro.space.lj.a it22 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter((com.gamericefishpro.space.pj.a) obj, "$this$single");
                Intrinsics.checkNotNullParameter(it22, "it");
                return new com.gamericefishpro.space.x7.c();
            case 28:
                com.gamericefishpro.space.pj.a single9 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it23 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(single9, "$this$single");
                Intrinsics.checkNotNullParameter(it23, "it");
                return new com.gamericefishpro.space.x7.f((com.gamericefishpro.space.x7.g) single9.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.x7.g.class)), (com.gamericefishpro.space.x7.c) single9.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.x7.c.class)));
            default:
                com.gamericefishpro.space.pj.a single10 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it24 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(single10, "$this$single");
                Intrinsics.checkNotNullParameter(it24, "it");
                return new com.gamericefishpro.space.w7.b(a4.m(single10));
        }
    }
}
