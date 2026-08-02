package ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors;

import defpackage.a0t;
import defpackage.bpc;
import defpackage.bvf0;
import defpackage.c5i;
import defpackage.dpc;
import defpackage.flg;
import defpackage.fpc;
import defpackage.g2a0;
import defpackage.ha2;
import defpackage.ike;
import defpackage.ikg;
import defpackage.jkg;
import defpackage.kkg;
import defpackage.mea0;
import defpackage.ny61;
import defpackage.oig;
import defpackage.oo0;
import defpackage.q4i;
import defpackage.st2;
import defpackage.tje;
import defpackage.v0q0;
import defpackage.w511;
import defpackage.zch;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class c {
    public final List a;
    public final List b;
    public final zch c;
    public final ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a d;
    public final c5i e;
    public final ru.yandex.taxi.logistics.sdk.dashboard.storage.c f;
    public final ru.yandex.taxi.logistics.payment.a g;
    public final q4i h;
    public final flg i;
    public final ike j;

    public c(List list, List list2, zch zchVar, ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a aVar, c5i c5iVar, ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar, ru.yandex.taxi.logistics.payment.a aVar2, q4i q4iVar, st2 st2Var, flg flgVar) {
        this.a = list;
        this.b = list2;
        this.c = zchVar;
        this.d = aVar;
        this.e = c5iVar;
        this.f = cVar;
        this.g = aVar2;
        this.h = q4iVar;
        this.i = flgVar;
        this.j = bvf0.a(st2Var.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f6, code lost:
    
        if (kotlinx.coroutines.a.i(300, r8) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e2, code lost:
    
        if (r15 != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0093, code lost:
    
        if (r15 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, oo0 oo0Var, Continuation continuation) {
        FetchDashboardContentInteractor$fetchContent$1 fetchDashboardContentInteractor$fetchContent$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        mea0 mea0Var;
        List list;
        Object b;
        a0t a0tVar;
        int i2;
        ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a aVar;
        List list2;
        fpc fpcVar;
        q4i q4iVar = cVar.h;
        if (continuation instanceof FetchDashboardContentInteractor$fetchContent$1) {
            fetchDashboardContentInteractor$fetchContent$1 = (FetchDashboardContentInteractor$fetchContent$1) continuation;
            int i3 = fetchDashboardContentInteractor$fetchContent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fetchDashboardContentInteractor$fetchContent$1.label = i3 - Integer.MIN_VALUE;
                FetchDashboardContentInteractor$fetchContent$1 fetchDashboardContentInteractor$fetchContent$12 = fetchDashboardContentInteractor$fetchContent$1;
                Object obj = fetchDashboardContentInteractor$fetchContent$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchDashboardContentInteractor$fetchContent$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q4iVar.a(kkg.a);
                    ha2 ha2Var = cVar.g.a;
                    fetchDashboardContentInteractor$fetchContent$12.L$0 = oo0Var;
                    fetchDashboardContentInteractor$fetchContent$12.label = 1;
                    obj = e.y(ha2Var, fetchDashboardContentInteractor$fetchContent$12);
                } else if (i == 1) {
                    oo0Var = (oo0) fetchDashboardContentInteractor$fetchContent$12.L$0;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    List list3 = (List) fetchDashboardContentInteractor$fetchContent$12.L$5;
                    list = (List) fetchDashboardContentInteractor$fetchContent$12.L$4;
                    a0t a0tVar2 = (a0t) fetchDashboardContentInteractor$fetchContent$12.L$3;
                    ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a aVar2 = (ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a) fetchDashboardContentInteractor$fetchContent$12.L$2;
                    mea0Var = (mea0) fetchDashboardContentInteractor$fetchContent$12.L$1;
                    kotlin.b.b(obj);
                    aVar = aVar2;
                    list2 = list3;
                    i2 = 3;
                    a0tVar = a0tVar2;
                    List list4 = list;
                    ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a aVar3 = aVar;
                    String str = (String) obj;
                    g2a0 g2a0Var = mea0Var == null ? new g2a0(mea0Var.b, mea0Var.a) : null;
                    fetchDashboardContentInteractor$fetchContent$12.L$0 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$1 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$2 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$3 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$4 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$5 = null;
                    fetchDashboardContentInteractor$fetchContent$12.label = i2;
                    obj = aVar3.b(a0tVar, list4, list2, str, g2a0Var, fetchDashboardContentInteractor$fetchContent$12);
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fpcVar = (fpc) fetchDashboardContentInteractor$fetchContent$12.L$2;
                        kotlin.b.b(obj);
                        if (fpcVar instanceof dpc) {
                            oig oigVar = (oig) ((dpc) fpcVar).a;
                            q4iVar.a(new jkg(oigVar));
                            flg flgVar = cVar.i;
                            List<v0q0> list5 = oigVar.a;
                            ArrayList arrayList = new ArrayList();
                            for (v0q0 v0q0Var : list5) {
                                String str2 = v0q0Var.d;
                                Pair pair = str2 != null ? new Pair(str2, Boolean.valueOf(v0q0Var.e)) : null;
                                if (pair != null) {
                                    arrayList.add(pair);
                                }
                            }
                            flgVar.a(arrayList);
                        } else {
                            if (!(fpcVar instanceof bpc)) {
                                w511.b();
                                return null;
                            }
                            q4iVar.a(new ikg((bpc) fpcVar));
                        }
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                    fpcVar = (fpc) obj;
                    fetchDashboardContentInteractor$fetchContent$12.L$0 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$1 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$2 = fpcVar;
                    fetchDashboardContentInteractor$fetchContent$12.label = 4;
                }
                mea0Var = (mea0) obj;
                ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a aVar4 = cVar.d;
                a0t a0tVar3 = oo0Var.f;
                list = cVar.a;
                List list6 = cVar.b;
                ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar2 = cVar.f;
                fetchDashboardContentInteractor$fetchContent$12.L$0 = null;
                fetchDashboardContentInteractor$fetchContent$12.L$1 = mea0Var;
                fetchDashboardContentInteractor$fetchContent$12.L$2 = aVar4;
                fetchDashboardContentInteractor$fetchContent$12.L$3 = a0tVar3;
                fetchDashboardContentInteractor$fetchContent$12.L$4 = list;
                fetchDashboardContentInteractor$fetchContent$12.L$5 = list6;
                fetchDashboardContentInteractor$fetchContent$12.label = 2;
                b = cVar2.b(fetchDashboardContentInteractor$fetchContent$12);
                if (b != coroutineSingletons) {
                    a0tVar = a0tVar3;
                    i2 = 3;
                    aVar = aVar4;
                    list2 = list6;
                    obj = b;
                    List list42 = list;
                    ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a aVar32 = aVar;
                    String str3 = (String) obj;
                    if (mea0Var == null) {
                    }
                    fetchDashboardContentInteractor$fetchContent$12.L$0 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$1 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$2 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$3 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$4 = null;
                    fetchDashboardContentInteractor$fetchContent$12.L$5 = null;
                    fetchDashboardContentInteractor$fetchContent$12.label = i2;
                    obj = aVar32.b(a0tVar, list42, list2, str3, g2a0Var, fetchDashboardContentInteractor$fetchContent$12);
                }
                return coroutineSingletons;
            }
        }
        fetchDashboardContentInteractor$fetchContent$1 = new FetchDashboardContentInteractor$fetchContent$1(cVar, continuation);
        FetchDashboardContentInteractor$fetchContent$1 fetchDashboardContentInteractor$fetchContent$122 = fetchDashboardContentInteractor$fetchContent$1;
        Object obj2 = fetchDashboardContentInteractor$fetchContent$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchDashboardContentInteractor$fetchContent$122.label;
        if (i != 0) {
        }
        mea0Var = (mea0) obj2;
        ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a aVar42 = cVar.d;
        a0t a0tVar32 = oo0Var.f;
        list = cVar.a;
        List list62 = cVar.b;
        ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar22 = cVar.f;
        fetchDashboardContentInteractor$fetchContent$122.L$0 = null;
        fetchDashboardContentInteractor$fetchContent$122.L$1 = mea0Var;
        fetchDashboardContentInteractor$fetchContent$122.L$2 = aVar42;
        fetchDashboardContentInteractor$fetchContent$122.L$3 = a0tVar32;
        fetchDashboardContentInteractor$fetchContent$122.L$4 = list;
        fetchDashboardContentInteractor$fetchContent$122.L$5 = list62;
        fetchDashboardContentInteractor$fetchContent$122.label = 2;
        b = cVar22.b(fetchDashboardContentInteractor$fetchContent$122);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void b() {
        FetchDashboardContentInteractor$start$1 fetchDashboardContentInteractor$start$1 = new FetchDashboardContentInteractor$start$1(this, null);
        ike ikeVar = this.j;
        tje.N(ikeVar, null, null, fetchDashboardContentInteractor$start$1, 3);
        tje.N(ikeVar, null, null, new FetchDashboardContentInteractor$start$2(this, null), 3);
    }
}
