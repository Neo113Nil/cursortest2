package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content;

import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Alignment;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Type;
import defpackage.a7n;
import defpackage.b6n;
import defpackage.b7n;
import defpackage.cyu0;
import defpackage.d6n;
import defpackage.esi;
import defpackage.f6n;
import defpackage.gv90;
import defpackage.h8j;
import defpackage.hri;
import defpackage.i6n;
import defpackage.iri;
import defpackage.j6n;
import defpackage.jk51;
import defpackage.jri;
import defpackage.kkb0;
import defpackage.kri;
import defpackage.kus0;
import defpackage.l690;
import defpackage.l6n;
import defpackage.l7x0;
import defpackage.lri;
import defpackage.lvi0;
import defpackage.m5n;
import defpackage.mri;
import defpackage.mu90;
import defpackage.n351;
import defpackage.nkb0;
import defpackage.nr;
import defpackage.nri;
import defpackage.ny61;
import defpackage.o4b1;
import defpackage.o5n;
import defpackage.o6q0;
import defpackage.ori;
import defpackage.p6i;
import defpackage.pri;
import defpackage.q5n;
import defpackage.q6n;
import defpackage.qri;
import defpackage.rri;
import defpackage.s5n;
import defpackage.s6n;
import defpackage.scc;
import defpackage.sri;
import defpackage.tcc;
import defpackage.uri;
import defpackage.wts0;
import defpackage.y7m;
import defpackage.ycc;
import defpackage.zez0;
import defpackage.zp1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class d {
    public final l7x0 a;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a b;

    public d(l7x0 l7x0Var, ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar) {
        this.a = l7x0Var;
        this.b = aVar;
    }

    public static boolean c(uri uriVar, boolean z) {
        boolean z2;
        if ((uriVar instanceof kri) || (uriVar instanceof pri)) {
            return true;
        }
        if (!(uriVar instanceof sri) || ((sri) uriVar).h != DeliveryStateItem$TextWidget$Type.FIXED) {
            if (z) {
                if (uriVar instanceof iri) {
                    iri iriVar = (iri) uriVar;
                    if (iriVar.b != null || iriVar.c != null) {
                        z2 = true;
                    }
                }
                z2 = false;
            } else {
                z2 = uriVar instanceof iri;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0142 -> B:10:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a2 -> B:14:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p6i p6iVar, ContinuationImpl continuationImpl) {
        DynamicContentMapper$map$1 dynamicContentMapper$map$1;
        int i;
        Object obj;
        p6i p6iVar2;
        Collection arrayList;
        Iterator it;
        int i2;
        d dVar = this;
        if (continuationImpl instanceof DynamicContentMapper$map$1) {
            dynamicContentMapper$map$1 = (DynamicContentMapper$map$1) continuationImpl;
            int i3 = dynamicContentMapper$map$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dynamicContentMapper$map$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = dynamicContentMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dynamicContentMapper$map$1.label;
                if (i != 0) {
                    obj = null;
                    kotlin.b.b(obj2);
                    p6iVar2 = p6iVar;
                    ArrayList arrayList2 = p6iVar2.a;
                    arrayList = new ArrayList();
                    it = arrayList2.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = dynamicContentMapper$map$1.I$6;
                    int i5 = dynamicContentMapper$map$1.I$5;
                    int i6 = dynamicContentMapper$map$1.I$4;
                    int i7 = dynamicContentMapper$map$1.I$3;
                    int i8 = dynamicContentMapper$map$1.I$2;
                    int i9 = dynamicContentMapper$map$1.I$1;
                    int i10 = dynamicContentMapper$map$1.I$0;
                    Iterator it2 = (Iterator) dynamicContentMapper$map$1.L$8;
                    ?? r15 = (Collection) dynamicContentMapper$map$1.L$6;
                    esi esiVar = (esi) dynamicContentMapper$map$1.L$3;
                    Iterator it3 = (Iterator) dynamicContentMapper$map$1.L$2;
                    arrayList = (Collection) dynamicContentMapper$map$1.L$1;
                    p6i p6iVar3 = (p6i) dynamicContentMapper$map$1.L$0;
                    kotlin.b.b(obj2);
                    d dVar2 = dVar;
                    p6i p6iVar4 = p6iVar3;
                    Object obj3 = obj2;
                    Iterator it4 = it3;
                    esi esiVar2 = esiVar;
                    ArrayList arrayList3 = r15;
                    Iterator it5 = it2;
                    int i11 = i4;
                    n351 n351Var = (n351) obj3;
                    if (n351Var != null) {
                        arrayList3.add(n351Var);
                    }
                    Iterator it6 = it5;
                    ArrayList arrayList4 = arrayList3;
                    int i12 = i10;
                    int i13 = i11;
                    Iterator it7 = it6;
                    p6iVar2 = p6iVar4;
                    dVar = dVar2;
                    it = it4;
                    obj = null;
                    if (it7.hasNext()) {
                        Object next = it7.next();
                        CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            scc.m();
                            throw null;
                        }
                        uri uriVar = (uri) next;
                        int i15 = i13;
                        uri uriVar2 = (uri) kotlin.collections.a.S(i15 - 1, esiVar2.a);
                        float f = ((uriVar2 == null || c(uriVar2, true)) && c(uriVar, false)) ? uriVar instanceof iri ? 16.0f : 8.0f : 0.0f;
                        dynamicContentMapper$map$1.L$0 = p6iVar2;
                        dynamicContentMapper$map$1.L$1 = arrayList;
                        dynamicContentMapper$map$1.L$2 = it;
                        dynamicContentMapper$map$1.L$3 = esiVar2;
                        Object obj4 = obj;
                        dynamicContentMapper$map$1.L$4 = obj4;
                        dynamicContentMapper$map$1.L$5 = obj4;
                        dynamicContentMapper$map$1.L$6 = arrayList4;
                        dynamicContentMapper$map$1.L$7 = obj4;
                        dynamicContentMapper$map$1.L$8 = it7;
                        dynamicContentMapper$map$1.L$9 = obj4;
                        dynamicContentMapper$map$1.L$10 = obj4;
                        dynamicContentMapper$map$1.L$11 = obj4;
                        dynamicContentMapper$map$1.L$12 = obj4;
                        dynamicContentMapper$map$1.I$0 = i12;
                        dynamicContentMapper$map$1.I$1 = i9;
                        dynamicContentMapper$map$1.I$2 = i8;
                        dynamicContentMapper$map$1.I$3 = i7;
                        dynamicContentMapper$map$1.I$4 = i6;
                        dynamicContentMapper$map$1.I$5 = i5;
                        dynamicContentMapper$map$1.I$6 = i14;
                        it4 = it;
                        dynamicContentMapper$map$1.I$7 = i15;
                        int i16 = i12;
                        dynamicContentMapper$map$1.I$8 = 0;
                        dynamicContentMapper$map$1.I$9 = i15;
                        dynamicContentMapper$map$1.I$10 = 0;
                        dynamicContentMapper$map$1.F$0 = f;
                        dynamicContentMapper$map$1.label = 1;
                        dVar2 = this;
                        Object b = dVar2.b(uriVar, f, dynamicContentMapper$map$1);
                        coroutineSingletons = coroutineSingletons2;
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        p6i p6iVar5 = p6iVar2;
                        obj3 = b;
                        p6iVar4 = p6iVar5;
                        arrayList3 = arrayList4;
                        it5 = it7;
                        i11 = i14;
                        i10 = i16;
                        n351 n351Var2 = (n351) obj3;
                        if (n351Var2 != null) {
                        }
                        Iterator it62 = it5;
                        ArrayList arrayList42 = arrayList3;
                        int i122 = i10;
                        int i132 = i11;
                        Iterator it72 = it62;
                        p6iVar2 = p6iVar4;
                        dVar = dVar2;
                        it = it4;
                        obj = null;
                        if (it72.hasNext()) {
                            Iterator it8 = it;
                            int i17 = i122;
                            d dVar3 = dVar;
                            ArrayList arrayList5 = arrayList42;
                            if (i9 != scc.f(p6iVar2.a)) {
                                arrayList5 = kotlin.collections.a.o0(arrayList5, new o6q0());
                            }
                            ycc.r(arrayList5, arrayList);
                            i2 = i17;
                            dVar = dVar3;
                            it = it8;
                            obj = null;
                            if (it.hasNext()) {
                                return (List) arrayList;
                            }
                            Object next2 = it.next();
                            int i18 = i2 + 1;
                            if (i2 < 0) {
                                scc.m();
                                throw null;
                            }
                            esiVar2 = (esi) next2;
                            List list = esiVar2.a;
                            ArrayList arrayList6 = new ArrayList();
                            i9 = i2;
                            i122 = i18;
                            it72 = list.iterator();
                            arrayList42 = arrayList6;
                            i5 = 0;
                            i6 = 0;
                            i7 = 0;
                            i8 = 0;
                            i132 = 0;
                            if (it72.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        dynamicContentMapper$map$1 = new DynamicContentMapper$map$1(dVar, continuationImpl);
        Object obj22 = dynamicContentMapper$map$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dynamicContentMapper$map$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v38, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(uri uriVar, float f, ContinuationImpl continuationImpl) {
        DynamicContentMapper$mapItem$1 dynamicContentMapper$mapItem$1;
        int i;
        String str;
        ?? r2;
        lvi0 lvi0Var;
        String str2;
        uri uriVar2 = uriVar;
        if (continuationImpl instanceof DynamicContentMapper$mapItem$1) {
            dynamicContentMapper$mapItem$1 = (DynamicContentMapper$mapItem$1) continuationImpl;
            int i2 = dynamicContentMapper$mapItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dynamicContentMapper$mapItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dynamicContentMapper$mapItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dynamicContentMapper$mapItem$1.label;
                String str3 = null;
                i6n i6nVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (uriVar2 instanceof ori) {
                        ori oriVar = (ori) uriVar2;
                        String str4 = oriVar.a;
                        gv90 gv90Var = oriVar.b;
                        if (gv90Var != null) {
                            if (gv90Var instanceof mu90) {
                                nr nrVar = ((mu90) gv90Var).a;
                                String c = nrVar.c();
                                String a = nrVar.a();
                                lvi0 lvi0Var2 = a != null ? new lvi0(this.a.a(a), null, null, null, null, 62) : null;
                                str2 = nrVar.b();
                                lvi0Var = lvi0Var2;
                                str3 = c;
                            } else {
                                lvi0Var = null;
                                str2 = null;
                            }
                            i6nVar = new i6n(str3, lvi0Var, str2, gv90Var);
                        }
                        return new j6n(str4, i6nVar, oriVar.c);
                    }
                    boolean z = uriVar2 instanceof jri;
                    ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar = this.b;
                    if (z) {
                        jri jriVar = (jri) uriVar2;
                        zp1 zp1Var = jriVar.b;
                        jk51 jk51Var = jriVar.a;
                        lvi0 b = jk51Var != null ? aVar.b(jk51Var) : null;
                        cyu0 i3 = aVar.i(zp1Var);
                        zp1 zp1Var2 = jriVar.c;
                        return new q5n(b, i3, zp1Var2 != null ? aVar.i(zp1Var2) : null, new h8j((String) zp1Var.b, jriVar.d), jriVar.e);
                    }
                    if (uriVar2 instanceof kri) {
                        return new s5n(aVar.i(((kri) uriVar2).a), f);
                    }
                    if (uriVar2 instanceof mri) {
                        mri mriVar = (mri) uriVar2;
                        List list = mriVar.a;
                        if (list != null) {
                            List<nkb0> list2 = list;
                            r2 = new ArrayList(tcc.n(list2, 10));
                            for (nkb0 nkb0Var : list2) {
                                r2.add(new kkb0(nkb0Var.a, nkb0Var.b));
                            }
                        } else {
                            r2 = EmptyList.a;
                        }
                        return new d6n(r2, mriVar.b, mriVar.c, mriVar.d);
                    }
                    if (uriVar2 instanceof sri) {
                        sri sriVar = (sri) uriVar2;
                        cyu0 i4 = aVar.i(sriVar.a);
                        zp1 zp1Var3 = sriVar.b;
                        cyu0 i5 = zp1Var3 != null ? aVar.i(zp1Var3) : null;
                        DeliveryStateItem$TextWidget$Alignment deliveryStateItem$TextWidget$Alignment = sriVar.c;
                        DeliveryStateItem$TextWidget$Alignment deliveryStateItem$TextWidget$Alignment2 = sriVar.d;
                        y7m y7mVar = sriVar.e != null ? new y7m(r6.intValue()) : null;
                        l690 l690Var = sriVar.f != null ? new l690(r6.a, r6.b, r6.c, r6.d) : null;
                        l690 l690Var2 = sriVar.g != null ? new l690(r6.a, r6.b, r6.c, r6.d) : null;
                        DeliveryStateItem$TextWidget$Type deliveryStateItem$TextWidget$Type = sriVar.h;
                        gv90 gv90Var2 = sriVar.i;
                        boolean z2 = sriVar.j;
                        String str5 = sriVar.k;
                        l690 l690Var3 = l690Var;
                        cyu0 cyu0Var = i5;
                        float f2 = y7mVar != null ? y7mVar.a : 56.0f;
                        if (l690Var3 == null) {
                            l690Var3 = a7n.a;
                        }
                        if (l690Var2 == null) {
                            l690Var2 = a7n.b;
                        }
                        return new b7n(i4, cyu0Var, deliveryStateItem$TextWidget$Alignment, deliveryStateItem$TextWidget$Alignment2, f, f2, l690Var3, l690Var2, deliveryStateItem$TextWidget$Type, gv90Var2, z2, str5);
                    }
                    if (uriVar2 instanceof lri) {
                        lri lriVar = (lri) uriVar2;
                        jk51 jk51Var2 = lriVar.a;
                        lvi0 b2 = jk51Var2 != null ? aVar.b(jk51Var2) : null;
                        cyu0 i6 = aVar.i(lriVar.b);
                        zp1 zp1Var4 = lriVar.c;
                        cyu0 i7 = zp1Var4 != null ? aVar.i(zp1Var4) : null;
                        gv90 gv90Var3 = lriVar.d;
                        zp1 zp1Var5 = lriVar.e;
                        cyu0 i8 = zp1Var5 != null ? aVar.i(zp1Var5) : null;
                        zp1 zp1Var6 = lriVar.f;
                        cyu0 i9 = zp1Var6 != null ? aVar.i(zp1Var6) : null;
                        jk51 jk51Var3 = lriVar.g;
                        return new b6n(b2, i6, i7, gv90Var3, i8, i9, jk51Var3 != null ? aVar.b(jk51Var3) : null, lriVar.h, lriVar.i, lriVar.j);
                    }
                    if (uriVar2 instanceof nri) {
                        nri nriVar = (nri) uriVar2;
                        return new f6n(nriVar.a, nriVar.b, nriVar.c);
                    }
                    if (uriVar2 instanceof pri) {
                        return new l6n(f);
                    }
                    if (uriVar2 instanceof hri) {
                        hri hriVar = (hri) uriVar2;
                        cyu0 i10 = aVar.i(hriVar.a);
                        zp1 zp1Var7 = hriVar.b;
                        return new m5n(i10, zp1Var7 != null ? aVar.i(zp1Var7) : null, aVar.b.d(hriVar.c), hriVar.d, hriVar.e);
                    }
                    if (uriVar2 instanceof rri) {
                        return new s6n(((rri) uriVar2).a);
                    }
                    if (uriVar2 instanceof iri) {
                        iri iriVar = (iri) uriVar2;
                        o4b1 o4b1Var = iriVar.a;
                        String str6 = iriVar.b;
                        String str7 = iriVar.c;
                        return new o5n(o4b1Var, iriVar.d, str6, str7 != null ? new lvi0(str7, null, null, null, new zez0(aVar.d("textMinor")), 46) : null, iriVar.e, iriVar.f, f);
                    }
                    if (!(uriVar2 instanceof qri)) {
                        return null;
                    }
                    qri qriVar = (qri) uriVar2;
                    String str8 = qriVar.a;
                    kus0 kus0Var = qriVar.b;
                    dynamicContentMapper$mapItem$1.L$0 = uriVar2;
                    dynamicContentMapper$mapItem$1.L$1 = str8;
                    dynamicContentMapper$mapItem$1.F$0 = f;
                    dynamicContentMapper$mapItem$1.label = 1;
                    obj = aVar.e(kus0Var, dynamicContentMapper$mapItem$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str8;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) dynamicContentMapper$mapItem$1.L$1;
                    uriVar2 = (uri) dynamicContentMapper$mapItem$1.L$0;
                    kotlin.b.b(obj);
                }
                wts0 wts0Var = (wts0) obj;
                return new q6n(str, new wts0(wts0Var.a, wts0Var.b, wts0Var.c, wts0Var.d, wts0Var.e, wts0Var.f, wts0Var.g, wts0Var.h, wts0Var.i, ((qri) uriVar2).c));
            }
        }
        dynamicContentMapper$mapItem$1 = new DynamicContentMapper$mapItem$1(this, continuationImpl);
        Object obj2 = dynamicContentMapper$mapItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dynamicContentMapper$mapItem$1.label;
        String str32 = null;
        i6n i6nVar2 = null;
        if (i != 0) {
        }
        wts0 wts0Var2 = (wts0) obj2;
        return new q6n(str, new wts0(wts0Var2.a, wts0Var2.b, wts0Var2.c, wts0Var2.d, wts0Var2.e, wts0Var2.f, wts0Var2.g, wts0Var2.h, wts0Var2.i, ((qri) uriVar2).c));
    }
}
