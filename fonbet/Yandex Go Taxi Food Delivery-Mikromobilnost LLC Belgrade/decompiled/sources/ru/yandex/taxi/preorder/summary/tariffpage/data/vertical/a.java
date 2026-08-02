package ru.yandex.taxi.preorder.summary.tariffpage.data.vertical;

import com.yandex.go.zone.dto.objects.VerticalMode;
import com.yandex.go.zone.model.Zone;
import defpackage.c1f0;
import defpackage.dk31;
import defpackage.dqe0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gwk0;
import defpackage.h3y;
import defpackage.ik31;
import defpackage.ikx0;
import defpackage.jgv;
import defpackage.jl40;
import defpackage.jn40;
import defpackage.kb5;
import defpackage.m1a0;
import defpackage.mct0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.oa31;
import defpackage.oi31;
import defpackage.pex0;
import defpackage.sgx0;
import defpackage.viv0;
import defpackage.w511;
import defpackage.xc11;
import defpackage.yfh0;
import defpackage.za31;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes6.dex */
public final class a {
    public final jgv a;
    public final h3y b;
    public final dqe0 c;
    public final xc11 d;
    public final ru.yandex.taxi.preorder.summary.tariffpage.experiment.a e;
    public final viv0 f;

    public a(jgv jgvVar, h3y h3yVar, dqe0 dqe0Var, xc11 xc11Var, ru.yandex.taxi.preorder.summary.tariffpage.experiment.a aVar, viv0 viv0Var) {
        this.a = jgvVar;
        this.b = h3yVar;
        this.c = dqe0Var;
        this.d = xc11Var;
        this.e = aVar;
        this.f = viv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(za31 za31Var, mi31 mi31Var, sgx0 sgx0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, Zone zone, m1a0 m1a0Var, String str, ContinuationImpl continuationImpl) {
        VerticalTariffPagerModelMapper$createVerticalModel$1 verticalTariffPagerModelMapper$createVerticalModel$1;
        int i;
        oa31 oa31Var;
        mi31 mi31Var2;
        String str2;
        c1f0 c1f0Var;
        if (continuationImpl instanceof VerticalTariffPagerModelMapper$createVerticalModel$1) {
            verticalTariffPagerModelMapper$createVerticalModel$1 = (VerticalTariffPagerModelMapper$createVerticalModel$1) continuationImpl;
            int i2 = verticalTariffPagerModelMapper$createVerticalModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalTariffPagerModelMapper$createVerticalModel$1.label = i2 - Integer.MIN_VALUE;
                VerticalTariffPagerModelMapper$createVerticalModel$1 verticalTariffPagerModelMapper$createVerticalModel$12 = verticalTariffPagerModelMapper$createVerticalModel$1;
                Object obj = verticalTariffPagerModelMapper$createVerticalModel$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalTariffPagerModelMapper$createVerticalModel$12.label;
                if (i != 0) {
                    b.b(obj);
                    oa31 oa31Var2 = za31Var.a;
                    mi31 d = mi31Var.d(oa31Var2.a);
                    ru.yandex.taxi.preorder.summary.tariffpage.data.single.a aVar = (ru.yandex.taxi.preorder.summary.tariffpage.data.single.a) this.b.get();
                    verticalTariffPagerModelMapper$createVerticalModel$12.L$0 = null;
                    verticalTariffPagerModelMapper$createVerticalModel$12.L$1 = null;
                    verticalTariffPagerModelMapper$createVerticalModel$12.L$2 = null;
                    verticalTariffPagerModelMapper$createVerticalModel$12.L$3 = null;
                    verticalTariffPagerModelMapper$createVerticalModel$12.L$4 = null;
                    verticalTariffPagerModelMapper$createVerticalModel$12.L$5 = null;
                    verticalTariffPagerModelMapper$createVerticalModel$12.L$6 = null;
                    verticalTariffPagerModelMapper$createVerticalModel$12.L$7 = oa31Var2;
                    verticalTariffPagerModelMapper$createVerticalModel$12.L$8 = d;
                    verticalTariffPagerModelMapper$createVerticalModel$12.label = 1;
                    Object a = aVar.a(d, sgx0Var, priceUpdate$PriceLoadingState, zone, m1a0Var, str, verticalTariffPagerModelMapper$createVerticalModel$12);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oa31Var = oa31Var2;
                    obj = a;
                    mi31Var2 = d;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mi31Var2 = (mi31) verticalTariffPagerModelMapper$createVerticalModel$12.L$8;
                    oa31Var = (oa31) verticalTariffPagerModelMapper$createVerticalModel$12.L$7;
                    b.b(obj);
                }
                ikx0 ikx0Var = (ikx0) obj;
                m1a0 m1a0Var2 = ikx0Var.q;
                str2 = ikx0Var.c;
                kb5 kb5Var = kb5.g;
                ArrayList arrayList = new ArrayList();
                kb5 kb5Var2 = ikx0Var.b;
                String str3 = ikx0Var.o;
                jn40 jn40Var = ikx0Var.k;
                String str4 = ikx0Var.d;
                String str5 = ikx0Var.e;
                String str6 = ikx0Var.f;
                c1f0Var = ikx0Var.g;
                List list = ikx0Var.i;
                ArrayList arrayList2 = ikx0Var.j;
                arrayList.clear();
                arrayList.addAll(arrayList2);
                mct0 mct0Var = ikx0Var.l;
                String str7 = ikx0Var.m;
                String str8 = ikx0Var.n;
                boolean z = ikx0Var.u;
                boolean z2 = ikx0Var.v;
                boolean z3 = ikx0Var.w;
                Map map = ikx0Var.r;
                Map map2 = ikx0Var.s;
                Map map3 = ikx0Var.t;
                boolean z4 = ikx0Var.x;
                if (!mi31Var2.e && !evu0.J(oa31Var.d)) {
                    str2 = oa31Var.d;
                }
                int i3 = yfh0.card_type_vertical;
                String str9 = mi31Var2.d;
                String a2 = this.a.a(oa31Var.h);
                String str10 = (a2 != null || evu0.J(a2)) ? str4 : a2;
                int i4 = ikx0Var.a;
                if (str2 == null) {
                    str2 = "";
                }
                if (c1f0Var == null) {
                    return new ikx0(i4, kb5Var2, str2, str10, str5, str6, c1f0Var, i3, list, new ArrayList(arrayList), jn40Var, mct0Var, str7, str8, str3, str9, m1a0Var2, map, map2, map3, z, z2, z3, z4);
                }
                ny61.g("priceUiState");
                return null;
            }
        }
        verticalTariffPagerModelMapper$createVerticalModel$1 = new VerticalTariffPagerModelMapper$createVerticalModel$1(this, continuationImpl);
        VerticalTariffPagerModelMapper$createVerticalModel$1 verticalTariffPagerModelMapper$createVerticalModel$122 = verticalTariffPagerModelMapper$createVerticalModel$1;
        Object obj2 = verticalTariffPagerModelMapper$createVerticalModel$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalTariffPagerModelMapper$createVerticalModel$122.label;
        if (i != 0) {
        }
        ikx0 ikx0Var2 = (ikx0) obj2;
        m1a0 m1a0Var22 = ikx0Var2.q;
        str2 = ikx0Var2.c;
        kb5 kb5Var3 = kb5.g;
        ArrayList arrayList3 = new ArrayList();
        kb5 kb5Var22 = ikx0Var2.b;
        String str32 = ikx0Var2.o;
        jn40 jn40Var2 = ikx0Var2.k;
        String str42 = ikx0Var2.d;
        String str52 = ikx0Var2.e;
        String str62 = ikx0Var2.f;
        c1f0Var = ikx0Var2.g;
        List list2 = ikx0Var2.i;
        ArrayList arrayList22 = ikx0Var2.j;
        arrayList3.clear();
        arrayList3.addAll(arrayList22);
        mct0 mct0Var2 = ikx0Var2.l;
        String str72 = ikx0Var2.m;
        String str82 = ikx0Var2.n;
        boolean z5 = ikx0Var2.u;
        boolean z22 = ikx0Var2.v;
        boolean z32 = ikx0Var2.w;
        Map map4 = ikx0Var2.r;
        Map map22 = ikx0Var2.s;
        Map map32 = ikx0Var2.t;
        boolean z42 = ikx0Var2.x;
        if (!mi31Var2.e) {
            str2 = oa31Var.d;
        }
        int i32 = yfh0.card_type_vertical;
        String str92 = mi31Var2.d;
        String a22 = this.a.a(oa31Var.h);
        if (a22 != null) {
        }
        int i42 = ikx0Var2.a;
        if (str2 == null) {
        }
        if (c1f0Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x018a, code lost:
    
        if (r2 == r12) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b1, code lost:
    
        if (r2 == r12) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ik31 ik31Var, Zone zone, m1a0 m1a0Var, String str, ContinuationImpl continuationImpl) {
        VerticalTariffPagerModelMapper$mapSinglePageVertical$1 verticalTariffPagerModelMapper$mapSinglePageVertical$1;
        Object obj;
        int i;
        mi31 mi31Var;
        Object obj2;
        za31 za31Var;
        ik31 ik31Var2;
        boolean z;
        za31 za31Var2;
        String str2;
        Zone zone2;
        sgx0 sgx0Var;
        m1a0 m1a0Var2;
        Object obj3;
        ikx0 ikx0Var;
        if (continuationImpl instanceof VerticalTariffPagerModelMapper$mapSinglePageVertical$1) {
            verticalTariffPagerModelMapper$mapSinglePageVertical$1 = (VerticalTariffPagerModelMapper$mapSinglePageVertical$1) continuationImpl;
            int i2 = verticalTariffPagerModelMapper$mapSinglePageVertical$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalTariffPagerModelMapper$mapSinglePageVertical$1.label = i2 - Integer.MIN_VALUE;
                VerticalTariffPagerModelMapper$mapSinglePageVertical$1 verticalTariffPagerModelMapper$mapSinglePageVertical$12 = verticalTariffPagerModelMapper$mapSinglePageVertical$1;
                obj = verticalTariffPagerModelMapper$mapSinglePageVertical$12.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalTariffPagerModelMapper$mapSinglePageVertical$12.label;
                if (i != 0) {
                    b.b(obj);
                    mi31Var = ik31Var.b;
                    dk31 dk31Var = ik31Var.a;
                    VerticalMode verticalMode = dk31Var.b;
                    List list = dk31Var.a;
                    int i3 = oi31.a[verticalMode.ordinal()];
                    if (i3 == 1) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jl40.l(((za31) obj2).d, mi31Var.b)) {
                                break;
                            }
                        }
                        za31Var = (za31) obj2;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (jl40.l(((za31) obj3).a.b, mi31Var.f)) {
                                break;
                            }
                        }
                        za31Var = (za31) obj3;
                    }
                    if (za31Var == null) {
                        za31 za31Var3 = (za31) kotlin.collections.a.R(list);
                        if (za31Var3 != null) {
                            za31Var = za31Var3;
                        }
                        return EmptyList.a;
                    }
                    boolean l = gwk0.l(za31Var.a, mi31Var.b);
                    sgx0 sgx0Var2 = l ? mi31Var.a.J0 : null;
                    String str3 = za31Var.d;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$0 = ik31Var;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$1 = zone;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$2 = m1a0Var;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$3 = str;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$4 = mi31Var;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$5 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$6 = za31Var;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$7 = sgx0Var2;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.Z$0 = l;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.label = 1;
                    Object f = f(verticalMode, str3, verticalTariffPagerModelMapper$mapSinglePageVertical$12);
                    if (f != obj4) {
                        ik31Var2 = ik31Var;
                        z = l;
                        obj = f;
                        za31Var2 = za31Var;
                        str2 = str;
                        zone2 = zone;
                        sgx0Var = sgx0Var2;
                        m1a0Var2 = m1a0Var;
                    }
                    return obj4;
                }
                if (i != 1) {
                    if (i == 2) {
                        b.b(obj);
                        ikx0Var = (ikx0) obj;
                        if (ikx0Var != null) {
                        }
                        return EmptyList.a;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    ikx0Var = (ikx0) obj;
                    if (ikx0Var != null) {
                        return Collections.singletonList(ikx0Var);
                    }
                    return EmptyList.a;
                }
                z = verticalTariffPagerModelMapper$mapSinglePageVertical$12.Z$0;
                sgx0 sgx0Var3 = (sgx0) verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$7;
                za31 za31Var4 = (za31) verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$6;
                mi31Var = (mi31) verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$4;
                String str4 = (String) verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$3;
                m1a0 m1a0Var3 = (m1a0) verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$2;
                Zone zone3 = (Zone) verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$1;
                ik31Var2 = (ik31) verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$0;
                b.b(obj);
                sgx0Var = sgx0Var3;
                za31Var2 = za31Var4;
                str2 = str4;
                m1a0Var2 = m1a0Var3;
                zone2 = zone3;
                if (((Boolean) obj).booleanValue()) {
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = ik31Var2.c;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$0 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$1 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$2 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$3 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$4 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$5 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$6 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$7 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.Z$0 = z;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.label = 3;
                    obj = e(za31Var2, sgx0Var, priceUpdate$PriceLoadingState, zone2, m1a0Var2, str2, verticalTariffPagerModelMapper$mapSinglePageVertical$12);
                } else {
                    ru.yandex.taxi.preorder.summary.tariffpage.data.single.a aVar = (ru.yandex.taxi.preorder.summary.tariffpage.data.single.a) this.b.get();
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2 = ik31Var2.c;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$0 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$1 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$2 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$3 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$4 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$5 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$6 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.L$7 = null;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.Z$0 = z;
                    verticalTariffPagerModelMapper$mapSinglePageVertical$12.label = 2;
                    obj = aVar.a(mi31Var, sgx0Var, priceUpdate$PriceLoadingState2, zone2, m1a0Var2, str2, verticalTariffPagerModelMapper$mapSinglePageVertical$12);
                }
                return obj4;
            }
        }
        verticalTariffPagerModelMapper$mapSinglePageVertical$1 = new VerticalTariffPagerModelMapper$mapSinglePageVertical$1(this, continuationImpl);
        VerticalTariffPagerModelMapper$mapSinglePageVertical$1 verticalTariffPagerModelMapper$mapSinglePageVertical$122 = verticalTariffPagerModelMapper$mapSinglePageVertical$1;
        obj = verticalTariffPagerModelMapper$mapSinglePageVertical$122.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalTariffPagerModelMapper$mapSinglePageVertical$122.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return obj42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
    
        if (r0 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ik31 ik31Var, Zone zone, m1a0 m1a0Var, String str, ContinuationImpl continuationImpl) {
        VerticalTariffPagerModelMapper$mapVerticalModels$1 verticalTariffPagerModelMapper$mapVerticalModels$1;
        Object obj;
        int i;
        ik31 a;
        if (continuationImpl instanceof VerticalTariffPagerModelMapper$mapVerticalModels$1) {
            verticalTariffPagerModelMapper$mapVerticalModels$1 = (VerticalTariffPagerModelMapper$mapVerticalModels$1) continuationImpl;
            int i2 = verticalTariffPagerModelMapper$mapVerticalModels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalTariffPagerModelMapper$mapVerticalModels$1.label = i2 - Integer.MIN_VALUE;
                VerticalTariffPagerModelMapper$mapVerticalModels$1 verticalTariffPagerModelMapper$mapVerticalModels$12 = verticalTariffPagerModelMapper$mapVerticalModels$1;
                obj = verticalTariffPagerModelMapper$mapVerticalModels$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalTariffPagerModelMapper$mapVerticalModels$12.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            a = (ik31) verticalTariffPagerModelMapper$mapVerticalModels$12.L$4;
                            str = (String) verticalTariffPagerModelMapper$mapVerticalModels$12.L$3;
                            m1a0Var = (m1a0) verticalTariffPagerModelMapper$mapVerticalModels$12.L$2;
                            zone = (Zone) verticalTariffPagerModelMapper$mapVerticalModels$12.L$1;
                            b.b(obj);
                        } else {
                            if (i != 3 && i != 4 && i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                    }
                    b.b(obj);
                    return obj;
                }
                b.b(obj);
                if (ik31Var.d) {
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$0 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$1 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$2 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$3 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.label = 1;
                    Object b = b(ik31Var, zone, m1a0Var, str, verticalTariffPagerModelMapper$mapVerticalModels$12);
                    if (b != obj2) {
                        return b;
                    }
                } else {
                    a = this.d.a(ik31Var);
                    if (a.a.a.isEmpty()) {
                        return EmptyList.a;
                    }
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$0 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$1 = zone;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$2 = m1a0Var;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$3 = str;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$4 = a;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$5 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.label = 2;
                    obj = this.e.a(verticalTariffPagerModelMapper$mapVerticalModels$12);
                }
                return obj2;
                if (!((Boolean) obj).booleanValue()) {
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$0 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$1 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$2 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$3 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$4 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$5 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.label = 3;
                    Object b2 = b(a, zone, m1a0Var, str, verticalTariffPagerModelMapper$mapVerticalModels$12);
                    if (b2 != obj2) {
                        return b2;
                    }
                } else if (this.f.b().b) {
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$0 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$1 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$2 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$3 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$4 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$5 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.label = 4;
                    Object b3 = b(a, zone, m1a0Var, str, verticalTariffPagerModelMapper$mapVerticalModels$12);
                    if (b3 != obj2) {
                        return b3;
                    }
                } else {
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$0 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$1 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$2 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$3 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$4 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.L$5 = null;
                    verticalTariffPagerModelMapper$mapVerticalModels$12.label = 5;
                    Object d = d(a, zone, m1a0Var, str, verticalTariffPagerModelMapper$mapVerticalModels$12);
                    if (d != obj2) {
                        return d;
                    }
                }
                return obj2;
            }
        }
        verticalTariffPagerModelMapper$mapVerticalModels$1 = new VerticalTariffPagerModelMapper$mapVerticalModels$1(this, continuationImpl);
        VerticalTariffPagerModelMapper$mapVerticalModels$1 verticalTariffPagerModelMapper$mapVerticalModels$122 = verticalTariffPagerModelMapper$mapVerticalModels$1;
        obj = verticalTariffPagerModelMapper$mapVerticalModels$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalTariffPagerModelMapper$mapVerticalModels$122.label;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return obj22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r14v0, types: [ru.yandex.taxi.preorder.summary.tariffpage.data.vertical.a] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a8 -> B:10:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ik31 ik31Var, Zone zone, m1a0 m1a0Var, String str, ContinuationImpl continuationImpl) {
        VerticalTariffPagerModelMapper$mapVerticalsWithSelector$1 verticalTariffPagerModelMapper$mapVerticalsWithSelector$1;
        int i;
        ik31 ik31Var2;
        Zone zone2;
        m1a0 m1a0Var2;
        String str2;
        VerticalTariffPagerModelMapper$mapVerticalsWithSelector$1 verticalTariffPagerModelMapper$mapVerticalsWithSelector$12;
        ArrayList t;
        Iterator it;
        if (continuationImpl instanceof VerticalTariffPagerModelMapper$mapVerticalsWithSelector$1) {
            verticalTariffPagerModelMapper$mapVerticalsWithSelector$1 = (VerticalTariffPagerModelMapper$mapVerticalsWithSelector$1) continuationImpl;
            int i2 = verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.label;
                if (i != 0) {
                    ik31Var2 = ik31Var;
                    zone2 = zone;
                    m1a0Var2 = m1a0Var;
                    str2 = str;
                    verticalTariffPagerModelMapper$mapVerticalsWithSelector$12 = verticalTariffPagerModelMapper$mapVerticalsWithSelector$1;
                    t = g8e.t(obj);
                    it = ik31Var.a.a.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it2 = (Iterator) verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.L$5;
                    ?? r6 = (List) verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.L$4;
                    String str3 = (String) verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.L$3;
                    m1a0 m1a0Var3 = (m1a0) verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.L$2;
                    Zone zone3 = (Zone) verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.L$1;
                    ik31 ik31Var3 = (ik31) verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.L$0;
                    b.b(obj);
                    verticalTariffPagerModelMapper$mapVerticalsWithSelector$12 = verticalTariffPagerModelMapper$mapVerticalsWithSelector$1;
                    t = r6;
                    str2 = str3;
                    m1a0Var2 = m1a0Var3;
                    ikx0 ikx0Var = (ikx0) obj;
                    if (ikx0Var != null) {
                        t.add(ikx0Var);
                    }
                    it = it2;
                    ik31Var2 = ik31Var3;
                    zone2 = zone3;
                    if (it.hasNext()) {
                        za31 za31Var = (za31) it.next();
                        pex0 pex0Var = ik31Var2.b.a;
                        boolean l = gwk0.l(za31Var.a, za31Var.d);
                        sgx0 sgx0Var = l ? pex0Var.J0 : null;
                        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = ik31Var2.c;
                        verticalTariffPagerModelMapper$mapVerticalsWithSelector$12.L$0 = ik31Var2;
                        verticalTariffPagerModelMapper$mapVerticalsWithSelector$12.L$1 = zone2;
                        verticalTariffPagerModelMapper$mapVerticalsWithSelector$12.L$2 = m1a0Var2;
                        verticalTariffPagerModelMapper$mapVerticalsWithSelector$12.L$3 = str2;
                        verticalTariffPagerModelMapper$mapVerticalsWithSelector$12.L$4 = t;
                        verticalTariffPagerModelMapper$mapVerticalsWithSelector$12.L$5 = it;
                        verticalTariffPagerModelMapper$mapVerticalsWithSelector$12.L$6 = null;
                        verticalTariffPagerModelMapper$mapVerticalsWithSelector$12.L$7 = null;
                        verticalTariffPagerModelMapper$mapVerticalsWithSelector$12.Z$0 = l;
                        verticalTariffPagerModelMapper$mapVerticalsWithSelector$12.label = 1;
                        Object e = e(za31Var, sgx0Var, priceUpdate$PriceLoadingState, zone2, m1a0Var2, str2, verticalTariffPagerModelMapper$mapVerticalsWithSelector$12);
                        if (e == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        zone3 = zone2;
                        ik31Var3 = ik31Var2;
                        it2 = it;
                        obj = e;
                        ikx0 ikx0Var2 = (ikx0) obj;
                        if (ikx0Var2 != null) {
                        }
                        it = it2;
                        ik31Var2 = ik31Var3;
                        zone2 = zone3;
                        if (it.hasNext()) {
                            return t;
                        }
                    }
                }
            }
        }
        verticalTariffPagerModelMapper$mapVerticalsWithSelector$1 = new VerticalTariffPagerModelMapper$mapVerticalsWithSelector$1(this, continuationImpl);
        Object obj2 = verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalTariffPagerModelMapper$mapVerticalsWithSelector$1.label;
        if (i != 0) {
        }
    }

    public final Object e(za31 za31Var, sgx0 sgx0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, Zone zone, m1a0 m1a0Var, String str, ContinuationImpl continuationImpl) {
        oa31 oa31Var = za31Var.a;
        List list = za31Var.b;
        if (oa31Var.d()) {
            if (list.isEmpty()) {
                return null;
            }
            Object a = ((ru.yandex.taxi.preorder.summary.tariffpage.data.single.a) this.b.get()).a((mi31) list.get(0), sgx0Var, priceUpdate$PriceLoadingState, zone, m1a0Var, str, continuationImpl);
            return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : (ikx0) a;
        }
        mi31 mi31Var = za31Var.c;
        if (mi31Var == null) {
            return null;
        }
        return a(za31Var, mi31Var, sgx0Var, priceUpdate$PriceLoadingState, zone, m1a0Var, str, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(VerticalMode verticalMode, String str, ContinuationImpl continuationImpl) {
        VerticalTariffPagerModelMapper$needHideTariffSelector$1 verticalTariffPagerModelMapper$needHideTariffSelector$1;
        Object obj;
        int i;
        if (continuationImpl instanceof VerticalTariffPagerModelMapper$needHideTariffSelector$1) {
            verticalTariffPagerModelMapper$needHideTariffSelector$1 = (VerticalTariffPagerModelMapper$needHideTariffSelector$1) continuationImpl;
            int i2 = verticalTariffPagerModelMapper$needHideTariffSelector$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalTariffPagerModelMapper$needHideTariffSelector$1.label = i2 - Integer.MIN_VALUE;
                obj = verticalTariffPagerModelMapper$needHideTariffSelector$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalTariffPagerModelMapper$needHideTariffSelector$1.label;
                boolean z = true;
                if (i != 0) {
                    b.b(obj);
                    verticalTariffPagerModelMapper$needHideTariffSelector$1.L$0 = verticalMode;
                    verticalTariffPagerModelMapper$needHideTariffSelector$1.L$1 = str;
                    verticalTariffPagerModelMapper$needHideTariffSelector$1.label = 1;
                    obj = this.e.b(str, verticalTariffPagerModelMapper$needHideTariffSelector$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) verticalTariffPagerModelMapper$needHideTariffSelector$1.L$1;
                    verticalMode = (VerticalMode) verticalTariffPagerModelMapper$needHideTariffSelector$1.L$0;
                    b.b(obj);
                }
                if (((Boolean) obj).booleanValue() || (verticalMode == VerticalMode.WITHOUT_SELECTOR && !jl40.l(str, ""))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        verticalTariffPagerModelMapper$needHideTariffSelector$1 = new VerticalTariffPagerModelMapper$needHideTariffSelector$1(this, continuationImpl);
        obj = verticalTariffPagerModelMapper$needHideTariffSelector$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalTariffPagerModelMapper$needHideTariffSelector$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
