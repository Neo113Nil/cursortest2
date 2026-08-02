package ru.yandex.taxi.persuggest.source;

import defpackage.acv0;
import defpackage.bvf0;
import defpackage.cn0;
import defpackage.co0;
import defpackage.i4v0;
import defpackage.jl40;
import defpackage.jna1;
import defpackage.k5q0;
import defpackage.ksw;
import defpackage.lk6;
import defpackage.nc61;
import defpackage.ny61;
import defpackage.o2s;
import defpackage.oc61;
import defpackage.rc61;
import defpackage.scc;
import defpackage.sta0;
import defpackage.tcc;
import defpackage.uhp;
import defpackage.v03;
import defpackage.w7v0;
import defpackage.xhp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes9.dex */
public final class m {
    public final ru.yandex.taxi.persuggest.api.a a;
    public final ru.yandex.taxi.preorder.source.userposition.b b;
    public final sta0 c;
    public final a d;
    public final ru.yandex.taxi.favorites.suggest.b e;
    public final o2s f;
    public final com.yandex.go.address.search.perf.c g;
    public final w7v0 h;

    public m(ru.yandex.taxi.persuggest.api.a aVar, ru.yandex.taxi.preorder.source.userposition.b bVar, sta0 sta0Var, a aVar2, ru.yandex.taxi.favorites.suggest.b bVar2, o2s o2sVar, com.yandex.go.address.search.perf.c cVar, w7v0 w7v0Var) {
        this.a = aVar;
        this.b = bVar;
        this.c = sta0Var;
        this.d = aVar2;
        this.e = bVar2;
        this.f = o2sVar;
        this.g = cVar;
        this.h = w7v0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ce, code lost:
    
        if (r10 == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v6, types: [k5q0] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r5v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(RoutePointType routePointType, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        ZeroSuggestRepositoryImpl$request$1 zeroSuggestRepositoryImpl$request$1;
        int i;
        RoutePointType routePointType2;
        boolean z3;
        boolean z4;
        Object a;
        boolean booleanValue;
        RoutePointType routePointType3;
        boolean z5;
        boolean z6;
        boolean z7;
        RoutePointType routePointType4;
        boolean z8;
        boolean z9;
        boolean z10;
        Pair pair;
        int i2;
        Throwable th;
        int i3;
        boolean z11;
        Object b;
        lk6 lk6Var;
        RoutePointType routePointType5;
        v03 v03Var;
        boolean z12;
        Object g;
        boolean z13;
        List a2;
        ArrayList arrayList;
        List b2;
        cn0 cn0Var;
        if (continuationImpl instanceof ZeroSuggestRepositoryImpl$request$1) {
            zeroSuggestRepositoryImpl$request$1 = (ZeroSuggestRepositoryImpl$request$1) continuationImpl;
            int i4 = zeroSuggestRepositoryImpl$request$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zeroSuggestRepositoryImpl$request$1.label = i4 - Integer.MIN_VALUE;
                ZeroSuggestRepositoryImpl$request$1 zeroSuggestRepositoryImpl$request$12 = zeroSuggestRepositoryImpl$request$1;
                Object obj = zeroSuggestRepositoryImpl$request$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zeroSuggestRepositoryImpl$request$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    routePointType2 = routePointType;
                    zeroSuggestRepositoryImpl$request$12.L$0 = routePointType2;
                    z3 = z;
                    zeroSuggestRepositoryImpl$request$12.Z$0 = z3;
                    z4 = z2;
                    zeroSuggestRepositoryImpl$request$12.Z$1 = z4;
                    zeroSuggestRepositoryImpl$request$12.label = 1;
                    a = this.g.a(zeroSuggestRepositoryImpl$request$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            z10 = zeroSuggestRepositoryImpl$request$12.Z$2;
                            z9 = zeroSuggestRepositoryImpl$request$12.Z$1;
                            z8 = zeroSuggestRepositoryImpl$request$12.Z$0;
                            routePointType4 = (RoutePointType) zeroSuggestRepositoryImpl$request$12.L$0;
                            kotlin.b.b(obj);
                            pair = (Pair) obj;
                            i2 = 1;
                            th = null;
                            i3 = 0;
                            lk6 lk6Var2 = (lk6) pair.getFirst();
                            v03Var = (v03) pair.getSecond();
                            ru.yandex.taxi.favorites.suggest.b bVar = this.e;
                            uhp uhpVar = bVar.a;
                            List J0 = kotlin.collections.a.J0((Set) uhpVar.a.getValue(uhpVar, uhp.b[i3]));
                            z12 = ((xhp) bVar.b.a.b()).b;
                            ?? r11 = new k5q0(new acv0(J0));
                            if (!z12) {
                            }
                            nc61 nc61Var = new nc61(oc61.a[routePointType4.ordinal()] != i2 ? lk6Var2.d : lk6Var2.e, v03Var, routePointType4.getType(), r11);
                            String a3 = this.c.a();
                            zeroSuggestRepositoryImpl$request$12.L$0 = th;
                            zeroSuggestRepositoryImpl$request$12.L$1 = th;
                            zeroSuggestRepositoryImpl$request$12.L$2 = v03Var;
                            zeroSuggestRepositoryImpl$request$12.L$3 = th;
                            zeroSuggestRepositoryImpl$request$12.L$4 = th;
                            zeroSuggestRepositoryImpl$request$12.L$5 = th;
                            zeroSuggestRepositoryImpl$request$12.Z$0 = z8;
                            zeroSuggestRepositoryImpl$request$12.Z$1 = z9;
                            zeroSuggestRepositoryImpl$request$12.Z$2 = z10;
                            zeroSuggestRepositoryImpl$request$12.Z$3 = z12;
                            zeroSuggestRepositoryImpl$request$12.label = 5;
                            g = this.a.g(a3, nc61Var, z9, zeroSuggestRepositoryImpl$request$12);
                            if (g != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        if (i == 3) {
                            z7 = zeroSuggestRepositoryImpl$request$12.Z$2;
                            z5 = zeroSuggestRepositoryImpl$request$12.Z$1;
                            z6 = zeroSuggestRepositoryImpl$request$12.Z$0;
                            routePointType3 = (RoutePointType) zeroSuggestRepositoryImpl$request$12.L$0;
                            kotlin.b.b(obj);
                            lk6 lk6Var3 = (lk6) obj;
                            this.f.getClass();
                            String str = !jl40.l(routePointType3.getType(), RoutePointType.SERVICE_NAVIGATOR_B.getType()) ? "navigator" : null;
                            zeroSuggestRepositoryImpl$request$12.L$0 = routePointType3;
                            zeroSuggestRepositoryImpl$request$12.L$1 = null;
                            zeroSuggestRepositoryImpl$request$12.L$2 = lk6Var3;
                            zeroSuggestRepositoryImpl$request$12.Z$0 = z6;
                            zeroSuggestRepositoryImpl$request$12.Z$1 = z5;
                            zeroSuggestRepositoryImpl$request$12.Z$2 = z7;
                            zeroSuggestRepositoryImpl$request$12.label = 4;
                            boolean z14 = z5;
                            boolean z15 = z6;
                            RoutePointType routePointType6 = routePointType3;
                            String str2 = str;
                            i2 = 1;
                            z11 = z7;
                            th = null;
                            i3 = 0;
                            b = a.b(this.d, str2, null, null, null, null, null, lk6Var3, false, zeroSuggestRepositoryImpl$request$12, 62);
                            if (b != coroutineSingletons) {
                                lk6Var = lk6Var3;
                                routePointType5 = routePointType6;
                                z9 = z14;
                                z8 = z15;
                                pair = new Pair(lk6Var, b);
                                routePointType4 = routePointType5;
                                z10 = z11;
                                lk6 lk6Var22 = (lk6) pair.getFirst();
                                v03Var = (v03) pair.getSecond();
                                ru.yandex.taxi.favorites.suggest.b bVar2 = this.e;
                                uhp uhpVar2 = bVar2.a;
                                List J02 = kotlin.collections.a.J0((Set) uhpVar2.a.getValue(uhpVar2, uhp.b[i3]));
                                z12 = ((xhp) bVar2.b.a.b()).b;
                                ?? r112 = new k5q0(new acv0(J02));
                                if (!z12) {
                                }
                                nc61 nc61Var2 = new nc61(oc61.a[routePointType4.ordinal()] != i2 ? lk6Var22.d : lk6Var22.e, v03Var, routePointType4.getType(), r112);
                                String a32 = this.c.a();
                                zeroSuggestRepositoryImpl$request$12.L$0 = th;
                                zeroSuggestRepositoryImpl$request$12.L$1 = th;
                                zeroSuggestRepositoryImpl$request$12.L$2 = v03Var;
                                zeroSuggestRepositoryImpl$request$12.L$3 = th;
                                zeroSuggestRepositoryImpl$request$12.L$4 = th;
                                zeroSuggestRepositoryImpl$request$12.L$5 = th;
                                zeroSuggestRepositoryImpl$request$12.Z$0 = z8;
                                zeroSuggestRepositoryImpl$request$12.Z$1 = z9;
                                zeroSuggestRepositoryImpl$request$12.Z$2 = z10;
                                zeroSuggestRepositoryImpl$request$12.Z$3 = z12;
                                zeroSuggestRepositoryImpl$request$12.label = 5;
                                g = this.a.g(a32, nc61Var2, z9, zeroSuggestRepositoryImpl$request$12);
                                if (g != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i == 4) {
                            boolean z16 = zeroSuggestRepositoryImpl$request$12.Z$2;
                            z9 = zeroSuggestRepositoryImpl$request$12.Z$1;
                            z8 = zeroSuggestRepositoryImpl$request$12.Z$0;
                            lk6Var = (lk6) zeroSuggestRepositoryImpl$request$12.L$2;
                            routePointType5 = (RoutePointType) zeroSuggestRepositoryImpl$request$12.L$0;
                            kotlin.b.b(obj);
                            z11 = z16;
                            th = null;
                            i3 = 0;
                            b = obj;
                            i2 = 1;
                            pair = new Pair(lk6Var, b);
                            routePointType4 = routePointType5;
                            z10 = z11;
                            lk6 lk6Var222 = (lk6) pair.getFirst();
                            v03Var = (v03) pair.getSecond();
                            ru.yandex.taxi.favorites.suggest.b bVar22 = this.e;
                            uhp uhpVar22 = bVar22.a;
                            List J022 = kotlin.collections.a.J0((Set) uhpVar22.a.getValue(uhpVar22, uhp.b[i3]));
                            z12 = ((xhp) bVar22.b.a.b()).b;
                            ?? r1122 = new k5q0(new acv0(J022));
                            if (!z12) {
                                r1122 = th;
                            }
                            nc61 nc61Var22 = new nc61(oc61.a[routePointType4.ordinal()] != i2 ? lk6Var222.d : lk6Var222.e, v03Var, routePointType4.getType(), r1122);
                            String a322 = this.c.a();
                            zeroSuggestRepositoryImpl$request$12.L$0 = th;
                            zeroSuggestRepositoryImpl$request$12.L$1 = th;
                            zeroSuggestRepositoryImpl$request$12.L$2 = v03Var;
                            zeroSuggestRepositoryImpl$request$12.L$3 = th;
                            zeroSuggestRepositoryImpl$request$12.L$4 = th;
                            zeroSuggestRepositoryImpl$request$12.L$5 = th;
                            zeroSuggestRepositoryImpl$request$12.Z$0 = z8;
                            zeroSuggestRepositoryImpl$request$12.Z$1 = z9;
                            zeroSuggestRepositoryImpl$request$12.Z$2 = z10;
                            zeroSuggestRepositoryImpl$request$12.Z$3 = z12;
                            zeroSuggestRepositoryImpl$request$12.label = 5;
                            g = this.a.g(a322, nc61Var22, z9, zeroSuggestRepositoryImpl$request$12);
                            if (g != coroutineSingletons) {
                                z13 = z8;
                                rc61 rc61Var = (rc61) g;
                                ArrayList arrayList2 = new ArrayList();
                                a2 = rc61Var.getA();
                                ?? r5 = EmptyList.a;
                                if (a2 == null) {
                                }
                                b2 = rc61Var.getB();
                                if (b2 != null) {
                                }
                                arrayList2.addAll((Collection) r5);
                                arrayList2.addAll(arrayList);
                                return arrayList2;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z17 = zeroSuggestRepositoryImpl$request$12.Z$0;
                        v03 v03Var2 = (v03) zeroSuggestRepositoryImpl$request$12.L$2;
                        kotlin.b.b(obj);
                        g = obj;
                        i2 = 1;
                        v03Var = v03Var2;
                        z13 = z17;
                        th = null;
                        i3 = 0;
                        rc61 rc61Var2 = (rc61) g;
                        ArrayList arrayList22 = new ArrayList();
                        a2 = rc61Var2.getA();
                        ?? r52 = EmptyList.a;
                        if (a2 == null) {
                            List list = a2;
                            arrayList = new ArrayList(tcc.n(list, 10));
                            int i5 = i3;
                            int i6 = -1;
                            for (Object obj2 : list) {
                                int i7 = i5 + 1;
                                if (i5 < 0) {
                                    scc.m();
                                    throw th;
                                }
                                ksw kswVar = (ksw) obj2;
                                if (i6 == -1 && (cn0Var = kswVar.F) != null) {
                                    cn0.e eVar = cn0Var.a;
                                    if ((eVar != null ? eVar.c() : i3) == i2) {
                                        i6 = i5;
                                    }
                                }
                                i4v0 i4v0Var = i4v0.j;
                                arrayList.add(w7v0.b(this.h, kswVar, new i4v0("zerosuggest", v03Var.k, rc61Var2.getC(), Integer.valueOf(i5), null, null, null, z13, false, 368), (i6 == -1 || i5 <= i6) ? i3 : i2, null, 24));
                                i5 = i7;
                            }
                        } else {
                            arrayList = r52;
                        }
                        b2 = rc61Var2.getB();
                        if (b2 != null) {
                            List list2 = b2;
                            r52 = new ArrayList(tcc.n(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                r52.add(jna1.d((co0) it.next()));
                            }
                        }
                        arrayList22.addAll((Collection) r52);
                        arrayList22.addAll(arrayList);
                        return arrayList22;
                    }
                    boolean z18 = zeroSuggestRepositoryImpl$request$12.Z$1;
                    boolean z19 = zeroSuggestRepositoryImpl$request$12.Z$0;
                    RoutePointType routePointType7 = (RoutePointType) zeroSuggestRepositoryImpl$request$12.L$0;
                    kotlin.b.b(obj);
                    a = obj;
                    routePointType2 = routePointType7;
                    z4 = z18;
                    z3 = z19;
                }
                booleanValue = ((Boolean) a).booleanValue();
                if (booleanValue) {
                    zeroSuggestRepositoryImpl$request$12.L$0 = routePointType2;
                    zeroSuggestRepositoryImpl$request$12.Z$0 = z3;
                    zeroSuggestRepositoryImpl$request$12.Z$1 = z4;
                    zeroSuggestRepositoryImpl$request$12.Z$2 = booleanValue;
                    zeroSuggestRepositoryImpl$request$12.label = 3;
                    Object a4 = this.b.a(zeroSuggestRepositoryImpl$request$12);
                    if (a4 != coroutineSingletons) {
                        boolean z20 = z4;
                        routePointType3 = routePointType2;
                        obj = a4;
                        z5 = z20;
                        z6 = z3;
                        z7 = booleanValue;
                        lk6 lk6Var32 = (lk6) obj;
                        this.f.getClass();
                        if (!jl40.l(routePointType3.getType(), RoutePointType.SERVICE_NAVIGATOR_B.getType())) {
                        }
                        zeroSuggestRepositoryImpl$request$12.L$0 = routePointType3;
                        zeroSuggestRepositoryImpl$request$12.L$1 = null;
                        zeroSuggestRepositoryImpl$request$12.L$2 = lk6Var32;
                        zeroSuggestRepositoryImpl$request$12.Z$0 = z6;
                        zeroSuggestRepositoryImpl$request$12.Z$1 = z5;
                        zeroSuggestRepositoryImpl$request$12.Z$2 = z7;
                        zeroSuggestRepositoryImpl$request$12.label = 4;
                        boolean z142 = z5;
                        boolean z152 = z6;
                        RoutePointType routePointType62 = routePointType3;
                        String str22 = str;
                        i2 = 1;
                        z11 = z7;
                        th = null;
                        i3 = 0;
                        b = a.b(this.d, str22, null, null, null, null, null, lk6Var32, false, zeroSuggestRepositoryImpl$request$12, 62);
                        if (b != coroutineSingletons) {
                        }
                    }
                } else {
                    ZeroSuggestRepositoryImpl$request$2 zeroSuggestRepositoryImpl$request$2 = new ZeroSuggestRepositoryImpl$request$2(this, routePointType2, null);
                    zeroSuggestRepositoryImpl$request$12.L$0 = routePointType2;
                    zeroSuggestRepositoryImpl$request$12.Z$0 = z3;
                    zeroSuggestRepositoryImpl$request$12.Z$1 = z4;
                    zeroSuggestRepositoryImpl$request$12.Z$2 = booleanValue;
                    zeroSuggestRepositoryImpl$request$12.label = 2;
                    Object n = bvf0.n(zeroSuggestRepositoryImpl$request$2, zeroSuggestRepositoryImpl$request$12);
                    if (n != coroutineSingletons) {
                        routePointType4 = routePointType2;
                        z8 = z3;
                        obj = n;
                        z9 = z4;
                        z10 = booleanValue;
                        pair = (Pair) obj;
                        i2 = 1;
                        th = null;
                        i3 = 0;
                        lk6 lk6Var2222 = (lk6) pair.getFirst();
                        v03Var = (v03) pair.getSecond();
                        ru.yandex.taxi.favorites.suggest.b bVar222 = this.e;
                        uhp uhpVar222 = bVar222.a;
                        List J0222 = kotlin.collections.a.J0((Set) uhpVar222.a.getValue(uhpVar222, uhp.b[i3]));
                        z12 = ((xhp) bVar222.b.a.b()).b;
                        ?? r11222 = new k5q0(new acv0(J0222));
                        if (!z12) {
                        }
                        nc61 nc61Var222 = new nc61(oc61.a[routePointType4.ordinal()] != i2 ? lk6Var2222.d : lk6Var2222.e, v03Var, routePointType4.getType(), r11222);
                        String a3222 = this.c.a();
                        zeroSuggestRepositoryImpl$request$12.L$0 = th;
                        zeroSuggestRepositoryImpl$request$12.L$1 = th;
                        zeroSuggestRepositoryImpl$request$12.L$2 = v03Var;
                        zeroSuggestRepositoryImpl$request$12.L$3 = th;
                        zeroSuggestRepositoryImpl$request$12.L$4 = th;
                        zeroSuggestRepositoryImpl$request$12.L$5 = th;
                        zeroSuggestRepositoryImpl$request$12.Z$0 = z8;
                        zeroSuggestRepositoryImpl$request$12.Z$1 = z9;
                        zeroSuggestRepositoryImpl$request$12.Z$2 = z10;
                        zeroSuggestRepositoryImpl$request$12.Z$3 = z12;
                        zeroSuggestRepositoryImpl$request$12.label = 5;
                        g = this.a.g(a3222, nc61Var222, z9, zeroSuggestRepositoryImpl$request$12);
                        if (g != coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        zeroSuggestRepositoryImpl$request$1 = new ZeroSuggestRepositoryImpl$request$1(this, continuationImpl);
        ZeroSuggestRepositoryImpl$request$1 zeroSuggestRepositoryImpl$request$122 = zeroSuggestRepositoryImpl$request$1;
        Object obj3 = zeroSuggestRepositoryImpl$request$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zeroSuggestRepositoryImpl$request$122.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) a).booleanValue();
        if (booleanValue) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r6 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(RoutePointType routePointType, String str, ContinuationImpl continuationImpl) {
        ZeroSuggestRepositoryImpl$requestV2$1 zeroSuggestRepositoryImpl$requestV2$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        RoutePointType routePointType2;
        String str2;
        Object a;
        k5q0 k5q0Var;
        Object b;
        RoutePointType routePointType3;
        lk6 lk6Var;
        if (continuationImpl instanceof ZeroSuggestRepositoryImpl$requestV2$1) {
            zeroSuggestRepositoryImpl$requestV2$1 = (ZeroSuggestRepositoryImpl$requestV2$1) continuationImpl;
            int i2 = zeroSuggestRepositoryImpl$requestV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zeroSuggestRepositoryImpl$requestV2$1.label = i2 - Integer.MIN_VALUE;
                ZeroSuggestRepositoryImpl$requestV2$1 zeroSuggestRepositoryImpl$requestV2$12 = zeroSuggestRepositoryImpl$requestV2$1;
                Object obj = zeroSuggestRepositoryImpl$requestV2$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zeroSuggestRepositoryImpl$requestV2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    routePointType2 = routePointType;
                    zeroSuggestRepositoryImpl$requestV2$12.L$0 = routePointType2;
                    str2 = str;
                    zeroSuggestRepositoryImpl$requestV2$12.L$1 = str2;
                    zeroSuggestRepositoryImpl$requestV2$12.label = 1;
                    a = this.b.a(zeroSuggestRepositoryImpl$requestV2$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        lk6Var = (lk6) zeroSuggestRepositoryImpl$requestV2$12.L$2;
                        routePointType3 = (RoutePointType) zeroSuggestRepositoryImpl$requestV2$12.L$0;
                        kotlin.b.b(obj);
                        k5q0Var = null;
                        nc61 nc61Var = new nc61(oc61.a[routePointType3.ordinal()] != 1 ? lk6Var.d : lk6Var.e, (v03) obj, routePointType3.getType(), k5q0Var);
                        String a2 = this.c.a();
                        zeroSuggestRepositoryImpl$requestV2$12.L$0 = k5q0Var;
                        zeroSuggestRepositoryImpl$requestV2$12.L$1 = k5q0Var;
                        zeroSuggestRepositoryImpl$requestV2$12.L$2 = k5q0Var;
                        zeroSuggestRepositoryImpl$requestV2$12.L$3 = k5q0Var;
                        zeroSuggestRepositoryImpl$requestV2$12.L$4 = k5q0Var;
                        zeroSuggestRepositoryImpl$requestV2$12.label = 3;
                        Object h = this.a.h(a2, nc61Var, zeroSuggestRepositoryImpl$requestV2$12);
                        return h != coroutineSingletons ? coroutineSingletons : h;
                    }
                    str2 = (String) zeroSuggestRepositoryImpl$requestV2$12.L$1;
                    RoutePointType routePointType4 = (RoutePointType) zeroSuggestRepositoryImpl$requestV2$12.L$0;
                    kotlin.b.b(obj);
                    a = obj;
                    routePointType2 = routePointType4;
                }
                lk6 lk6Var2 = (lk6) a;
                zeroSuggestRepositoryImpl$requestV2$12.L$0 = routePointType2;
                zeroSuggestRepositoryImpl$requestV2$12.L$1 = null;
                zeroSuggestRepositoryImpl$requestV2$12.L$2 = lk6Var2;
                zeroSuggestRepositoryImpl$requestV2$12.label = 2;
                k5q0Var = null;
                b = a.b(this.d, str2, null, null, null, null, null, lk6Var2, false, zeroSuggestRepositoryImpl$requestV2$12, 62);
                if (b != coroutineSingletons) {
                    routePointType3 = routePointType2;
                    obj = b;
                    lk6Var = lk6Var2;
                    nc61 nc61Var2 = new nc61(oc61.a[routePointType3.ordinal()] != 1 ? lk6Var.d : lk6Var.e, (v03) obj, routePointType3.getType(), k5q0Var);
                    String a22 = this.c.a();
                    zeroSuggestRepositoryImpl$requestV2$12.L$0 = k5q0Var;
                    zeroSuggestRepositoryImpl$requestV2$12.L$1 = k5q0Var;
                    zeroSuggestRepositoryImpl$requestV2$12.L$2 = k5q0Var;
                    zeroSuggestRepositoryImpl$requestV2$12.L$3 = k5q0Var;
                    zeroSuggestRepositoryImpl$requestV2$12.L$4 = k5q0Var;
                    zeroSuggestRepositoryImpl$requestV2$12.label = 3;
                    Object h2 = this.a.h(a22, nc61Var2, zeroSuggestRepositoryImpl$requestV2$12);
                    if (h2 != coroutineSingletons) {
                    }
                }
            }
        }
        zeroSuggestRepositoryImpl$requestV2$1 = new ZeroSuggestRepositoryImpl$requestV2$1(this, continuationImpl);
        ZeroSuggestRepositoryImpl$requestV2$1 zeroSuggestRepositoryImpl$requestV2$122 = zeroSuggestRepositoryImpl$requestV2$1;
        Object obj2 = zeroSuggestRepositoryImpl$requestV2$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zeroSuggestRepositoryImpl$requestV2$122.label;
        if (i != 0) {
        }
        lk6 lk6Var22 = (lk6) a;
        zeroSuggestRepositoryImpl$requestV2$122.L$0 = routePointType2;
        zeroSuggestRepositoryImpl$requestV2$122.L$1 = null;
        zeroSuggestRepositoryImpl$requestV2$122.L$2 = lk6Var22;
        zeroSuggestRepositoryImpl$requestV2$122.label = 2;
        k5q0Var = null;
        b = a.b(this.d, str2, null, null, null, null, null, lk6Var22, false, zeroSuggestRepositoryImpl$requestV2$122, 62);
        if (b != coroutineSingletons) {
        }
    }
}
