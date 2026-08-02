package ru.yandex.taxi.layers.domain;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.bzw0;
import defpackage.dzx;
import defpackage.fxe0;
import defpackage.gcc0;
import defpackage.gp50;
import defpackage.gw00;
import defpackage.ike;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jxi0;
import defpackage.jyi;
import defpackage.kib1;
import defpackage.lm00;
import defpackage.lxi0;
import defpackage.mth;
import defpackage.nxi0;
import defpackage.ny61;
import defpackage.oaq0;
import defpackage.oxi0;
import defpackage.p0u;
import defpackage.p2y0;
import defpackage.pfq0;
import defpackage.pwy0;
import defpackage.pxi0;
import defpackage.pzt0;
import defpackage.q0c;
import defpackage.qc20;
import defpackage.r0c;
import defpackage.rp60;
import defpackage.t7s0;
import defpackage.tao;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vng;
import defpackage.vxi0;
import defpackage.y9q0;
import defpackage.yk;
import defpackage.yp00;
import defpackage.zp00;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes9.dex */
public final class o {
    public static final Set q = j73.f0(new DriveState[]{DriveState.COMPLETE, DriveState.CANCELLED, DriveState.FAILED, DriveState.EXPIRED});
    public final com.yandex.go.layers.domain.g a;
    public final l b;
    public final rp60 c;
    public final dzx d;
    public final pfq0 e;
    public final p2y0 f;
    public final ru.yandex.taxi.logistics.order.g g;
    public final qc20 h;
    public final zp00 i;
    public final gp50 j;
    public final com.yandex.go.navigation.screen.c k;
    public final gcc0 l;
    public final pwy0 m;
    public pzt0 n;
    public boolean o;
    public pzt0 p;

    public o(com.yandex.go.layers.domain.g gVar, l lVar, rp60 rp60Var, dzx dzxVar, pfq0 pfq0Var, p2y0 p2y0Var, ru.yandex.taxi.logistics.order.g gVar2, qc20 qc20Var, zp00 zp00Var, tao taoVar, gp50 gp50Var, com.yandex.go.navigation.screen.c cVar, gcc0 gcc0Var, pwy0 pwy0Var) {
        this.a = gVar;
        this.b = lVar;
        this.c = rp60Var;
        this.d = dzxVar;
        this.e = pfq0Var;
        this.f = p2y0Var;
        this.g = gVar2;
        this.h = qc20Var;
        this.i = zp00Var;
        this.j = gp50Var;
        this.k = cVar;
        this.l = gcc0Var;
        this.m = pwy0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
    
        if (r9.d(r11, r3) == r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x024a, code lost:
    
        if (r9.d(r10, r3) == r4) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0139 A[LOOP:0: B:23:0x0133->B:25:0x0139, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x035e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, fxe0 fxe0Var, ContinuationImpl continuationImpl) {
        MapObjectsRenderingInteractor$handlePresentationState$1 mapObjectsRenderingInteractor$handlePresentationState$1;
        int i;
        Map linkedHashMap;
        lm00 lm00Var;
        pfq0 pfq0Var = oVar.e;
        rp60 rp60Var = oVar.c;
        zp00 zp00Var = oVar.i;
        if (continuationImpl instanceof MapObjectsRenderingInteractor$handlePresentationState$1) {
            mapObjectsRenderingInteractor$handlePresentationState$1 = (MapObjectsRenderingInteractor$handlePresentationState$1) continuationImpl;
            int i2 = mapObjectsRenderingInteractor$handlePresentationState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectsRenderingInteractor$handlePresentationState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectsRenderingInteractor$handlePresentationState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectsRenderingInteractor$handlePresentationState$1.label;
                zy11 zy11Var = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        if (fxe0Var instanceof t7s0) {
                            if (oVar.k.b() != Screen.MAIN_V4) {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap2.putAll(((t7s0) fxe0Var).a);
                                if (!zp00Var.j && oVar.h.u() && (lm00Var = zp00Var.h) != null) {
                                    linkedHashMap2.put(lm00Var.a, lm00Var);
                                }
                                r0 r0Var = zp00Var.b;
                                r0Var.getClass();
                                r0Var.m(null, linkedHashMap2);
                                linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                    if (!oVar.f(entry)) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                if (oVar.o) {
                                    zp00Var.e = kotlin.collections.b.f();
                                    zp00Var.f = kotlin.collections.b.f();
                                    List singletonList = Collections.singletonList(new oxi0(0));
                                    mapObjectsRenderingInteractor$handlePresentationState$1.L$0 = null;
                                    mapObjectsRenderingInteractor$handlePresentationState$1.L$1 = null;
                                    mapObjectsRenderingInteractor$handlePresentationState$1.L$2 = linkedHashMap;
                                    mapObjectsRenderingInteractor$handlePresentationState$1.label = 1;
                                    break;
                                }
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
                                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                    linkedHashMap3.put(entry2.getKey(), kib1.c((lm00) entry2.getValue()));
                                }
                                vxi0 N = oVar.j.N(new vxi0(zp00Var.f, linkedHashMap, linkedHashMap3, new ArrayList()));
                                zp00Var.f = linkedHashMap3;
                                List list = N.d;
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$0 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$1 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$2 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$3 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$4 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$5 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$6 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.label = 2;
                                Object d = oVar.d(list, mapObjectsRenderingInteractor$handlePresentationState$1);
                                return d != obj2 ? obj2 : d;
                            }
                            return zy11Var;
                        }
                        if (fxe0Var instanceof r0c) {
                            if (pfq0Var.a.b.a.getValue() == null) {
                                Map a = zp00Var.a();
                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                for (Map.Entry entry3 : a.entrySet()) {
                                    if (((lm00) entry3.getValue()).g) {
                                        linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                    }
                                }
                                r0 r0Var2 = zp00Var.b;
                                r0Var2.getClass();
                                r0Var2.m(null, linkedHashMap4);
                                Map map = zp00Var.e;
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                for (Map.Entry entry4 : map.entrySet()) {
                                    if (((lm00) entry4.getValue()).g) {
                                        linkedHashMap5.put(entry4.getKey(), entry4.getValue());
                                    }
                                }
                                zp00Var.e = linkedHashMap5;
                                Map map2 = zp00Var.f;
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                for (Map.Entry entry5 : map2.entrySet()) {
                                    if (zp00Var.a().containsKey(entry5.getKey())) {
                                        linkedHashMap6.put(entry5.getKey(), entry5.getValue());
                                    }
                                }
                                zp00Var.f = linkedHashMap6;
                                List singletonList2 = Collections.singletonList(new jxi0(0));
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$0 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.label = 3;
                                break;
                            }
                            return zy11Var;
                        }
                        if (!(fxe0Var instanceof q0c)) {
                            if (fxe0Var instanceof y9q0) {
                                String a2 = rp60Var.a();
                                y9q0 y9q0Var = (y9q0) fxe0Var;
                                rp60Var.b(y9q0Var.a());
                                ArrayList arrayList = new ArrayList();
                                if (a2 != null && !a2.equals(y9q0Var.a())) {
                                    oVar.e(a2, false);
                                    arrayList.add(new lxi0(a2));
                                }
                                oVar.e(y9q0Var.a(), true);
                                arrayList.add(new pxi0(y9q0Var.a()));
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$0 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$1 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$2 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.label = 4;
                                Object d2 = oVar.d(arrayList, mapObjectsRenderingInteractor$handlePresentationState$1);
                                if (d2 != obj2) {
                                    return d2;
                                }
                            } else if (fxe0Var instanceof jyi) {
                                jyi jyiVar = (jyi) fxe0Var;
                                if (jl40.l(rp60Var.a(), jyiVar.a())) {
                                    rp60Var.b(null);
                                }
                                oVar.e(jyiVar.a(), false);
                                List singletonList3 = Collections.singletonList(new lxi0(jyiVar.a()));
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$0 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.label = 5;
                                Object d3 = oVar.d(singletonList3, mapObjectsRenderingInteractor$handlePresentationState$1);
                                if (d3 != obj2) {
                                    return d3;
                                }
                            } else if (fxe0Var instanceof oaq0) {
                                lm00 a3 = ((oaq0) fxe0Var).a();
                                if (a3 != null) {
                                    String str = a3.a;
                                    String a4 = rp60Var.a();
                                    rp60Var.b(str);
                                    ArrayList arrayList2 = new ArrayList();
                                    if (a4 != null && !a4.equals(str)) {
                                        oVar.e(a4, false);
                                        arrayList2.add(new lxi0(a4));
                                    }
                                    oVar.e(str, true);
                                    arrayList2.add(new pxi0(str));
                                    mapObjectsRenderingInteractor$handlePresentationState$1.L$0 = null;
                                    mapObjectsRenderingInteractor$handlePresentationState$1.L$1 = null;
                                    mapObjectsRenderingInteractor$handlePresentationState$1.L$2 = null;
                                    mapObjectsRenderingInteractor$handlePresentationState$1.L$3 = null;
                                    mapObjectsRenderingInteractor$handlePresentationState$1.label = 6;
                                    if (oVar.d(arrayList2, mapObjectsRenderingInteractor$handlePresentationState$1) == obj2) {
                                    }
                                }
                            } else if (fxe0Var instanceof bzw0) {
                                List singletonList4 = Collections.singletonList(new nxi0(((bzw0) fxe0Var).a));
                                mapObjectsRenderingInteractor$handlePresentationState$1.L$0 = null;
                                mapObjectsRenderingInteractor$handlePresentationState$1.label = 7;
                                Object d4 = oVar.d(singletonList4, mapObjectsRenderingInteractor$handlePresentationState$1);
                                if (d4 != obj2) {
                                    return d4;
                                }
                            }
                        }
                        if (pfq0Var.a.b.a.getValue() == null) {
                            oVar.b();
                            return zy11Var;
                        }
                        return zy11Var;
                    case 1:
                        linkedHashMap = (Map) mapObjectsRenderingInteractor$handlePresentationState$1.L$2;
                        kotlin.b.b(obj);
                        oVar.o = false;
                        LinkedHashMap linkedHashMap32 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
                        while (r0.hasNext()) {
                        }
                        vxi0 N2 = oVar.j.N(new vxi0(zp00Var.f, linkedHashMap, linkedHashMap32, new ArrayList()));
                        zp00Var.f = linkedHashMap32;
                        List list2 = N2.d;
                        mapObjectsRenderingInteractor$handlePresentationState$1.L$0 = null;
                        mapObjectsRenderingInteractor$handlePresentationState$1.L$1 = null;
                        mapObjectsRenderingInteractor$handlePresentationState$1.L$2 = null;
                        mapObjectsRenderingInteractor$handlePresentationState$1.L$3 = null;
                        mapObjectsRenderingInteractor$handlePresentationState$1.L$4 = null;
                        mapObjectsRenderingInteractor$handlePresentationState$1.L$5 = null;
                        mapObjectsRenderingInteractor$handlePresentationState$1.L$6 = null;
                        mapObjectsRenderingInteractor$handlePresentationState$1.label = 2;
                        Object d5 = oVar.d(list2, mapObjectsRenderingInteractor$handlePresentationState$1);
                        if (d5 != obj2) {
                        }
                        break;
                    case 2:
                        kotlin.b.b(obj);
                        return obj;
                    case 3:
                        kotlin.b.b(obj);
                        zp00Var.i.clear();
                        zp00Var.j = false;
                        zp00Var.h = null;
                        return zy11Var;
                    case 4:
                        kotlin.b.b(obj);
                        return obj;
                    case 5:
                    case 7:
                        kotlin.b.b(obj);
                        return obj;
                    case 6:
                        kotlin.b.b(obj);
                        return zy11Var;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        mapObjectsRenderingInteractor$handlePresentationState$1 = new MapObjectsRenderingInteractor$handlePresentationState$1(oVar, continuationImpl);
        Object obj3 = mapObjectsRenderingInteractor$handlePresentationState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectsRenderingInteractor$handlePresentationState$1.label;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
        }
    }

    public static Object c(o oVar, LinkedHashMap linkedHashMap, List list, List list2, Continuation continuation, int i) {
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 != 0) {
            list = emptyList;
        }
        if ((i & 4) != 0) {
            list2 = emptyList;
        }
        zp00 zp00Var = oVar.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), kib1.c((lm00) entry.getValue()));
        }
        vxi0 N = oVar.j.N(new vxi0(zp00Var.f, linkedHashMap, linkedHashMap2, new ArrayList()));
        zp00Var.f = linkedHashMap2;
        return oVar.d(kotlin.collections.a.m0(list2, kotlin.collections.a.m0(N.d, list)), (ContinuationImpl) continuation);
    }

    public final void b() {
        this.e.a(null);
        Map f = kotlin.collections.b.f();
        zp00 zp00Var = this.i;
        r0 r0Var = zp00Var.b;
        r0Var.getClass();
        r0Var.m(null, f);
        zp00Var.e = kotlin.collections.b.f();
        zp00Var.f = kotlin.collections.b.f();
        zp00Var.g = null;
        zp00Var.h = null;
        zp00Var.i.clear();
        zp00Var.j = false;
        n0 n0Var = zp00Var.c;
        n0Var.f();
        n0Var.g(new yp00(zp00Var.a.a(), Collections.singletonList(new oxi0(0))));
        this.c.b(null);
    }

    public final Object d(List list, ContinuationImpl continuationImpl) {
        zp00 zp00Var = this.i;
        return zp00Var.c.emit(new yp00(zp00Var.a.a(), list), continuationImpl);
    }

    public final void e(String str, boolean z) {
        zp00 zp00Var = this.i;
        lm00 lm00Var = (lm00) zp00Var.a().get(str);
        if (lm00Var != null) {
            lm00Var.g = z;
        }
        lm00 lm00Var2 = (lm00) zp00Var.e.get(str);
        if (lm00Var2 != null) {
            lm00Var2.g = z;
        }
    }

    public final boolean f(Map.Entry entry) {
        Object key = entry.getKey();
        zp00 zp00Var = this.i;
        if (jl40.l(key, zp00Var.g)) {
            return true;
        }
        Object key2 = entry.getKey();
        lm00 lm00Var = zp00Var.h;
        if (jl40.l(key2, lm00Var != null ? lm00Var.a : null) && zp00Var.j) {
            return true;
        }
        return zp00Var.i.contains(entry.getKey()) && !zp00Var.j;
    }

    public final void g(ike ikeVar) {
        yk ykVar = vng.c;
        int i = 3;
        kotlinx.coroutines.flow.e.H(ikeVar, new jqr((tpr) this.a.k.getValue(), new MapObjectsRenderingInteractor$startListening$1(this, null), i));
        rp60 rp60Var = this.c;
        int i2 = 6;
        kotlinx.coroutines.flow.e.H(ikeVar, new jqr(new mth(new m0(rp60Var.b, new mth(new j0(null, rp60Var.a, new MapObjectsRenderingInteractor$startListening$$inlined$withPreviousEmit$1(3, null)), i2), new MapObjectsRenderingInteractor$startListening$2(3, null)), i2), new MapObjectsRenderingInteractor$startListening$3(this, null), i));
        kotlinx.coroutines.flow.e.H(ikeVar, new jqr(new mth(kotlinx.coroutines.flow.e.d(this.d.a), i2), new MapObjectsRenderingInteractor$startListening$4(this, null), i));
        kotlinx.coroutines.flow.e.H(ikeVar, new jqr(new mth(this.m.a(), 4), new MapObjectsRenderingInteractor$startListening$5(this, null), i));
        if (this.h.u()) {
            pfq0 pfq0Var = this.e;
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(pfq0Var.a.b, new MapObjectsRenderingInteractor$startListening$6(this, null), i));
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(vng.l(pfq0Var.a.b, new p0u(26), ykVar), new MapObjectsRenderingInteractor$startListening$8(this, null), i));
        }
        kotlinx.coroutines.flow.e.H(ikeVar, new jqr(kotlinx.coroutines.flow.e.K(new n(vng.l(kotlinx.coroutines.flow.e.X(new mth(((e0) this.f).g, i2), new MapObjectsRenderingInteractor$taxiOrderFinishedFlow$$inlined$flatMapLatest$1(3, null)), new p0u(27), ykVar)), this.g.c), new MapObjectsRenderingInteractor$startListening$9(this, null), i));
    }

    public final void h(ike ikeVar) {
        pzt0 pzt0Var = this.n;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.p;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        l lVar = this.b;
        int i = 3;
        this.n = kotlinx.coroutines.flow.e.H(ikeVar, new jqr(lVar.b(), new MapObjectsRenderingInteractor$startMapObjectsListening$1(this, null), i));
        g gVar = new g(new e(new c(new mth(new j0(null, lVar.i.c(), new BaseLayersInteractor$listenToMainScreenClear$$inlined$withPreviousEmit$1(3, null)), 6))));
        lVar.a.getClass();
        this.p = kotlinx.coroutines.flow.e.H(ikeVar, new jqr(kotlinx.coroutines.flow.e.F(gVar, uyj.a), new MapObjectsRenderingInteractor$startMapObjectsListening$2(this, null), i));
    }
}
