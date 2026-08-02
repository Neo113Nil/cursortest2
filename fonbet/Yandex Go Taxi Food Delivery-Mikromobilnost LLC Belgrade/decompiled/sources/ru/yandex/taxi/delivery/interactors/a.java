package ru.yandex.taxi.delivery.interactors;

import android.app.Activity;
import com.yandex.delivery.mapper.model.PointType;
import com.yandex.go.address.models.Address;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.delivery.AddressDeliveryInfo;
import com.yandex.go.taxi.order.models.api.preorder.delivery.RouteDeliveryInfo;
import defpackage.a0t;
import defpackage.aji;
import defpackage.bgq0;
import defpackage.boj0;
import defpackage.cvu0;
import defpackage.doe;
import defpackage.dqe0;
import defpackage.e4a0;
import defpackage.evu0;
import defpackage.fga0;
import defpackage.fvt;
import defpackage.gdi;
import defpackage.j6i;
import defpackage.jl40;
import defpackage.jve;
import defpackage.k1a0;
import defpackage.k6i;
import defpackage.kzo;
import defpackage.l4f;
import defpackage.l6i;
import defpackage.l8i;
import defpackage.lkb0;
import defpackage.lv90;
import defpackage.lvt;
import defpackage.m4f;
import defpackage.m6i;
import defpackage.mkb0;
import defpackage.n4f;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.s9e;
import defpackage.scc;
import defpackage.t8i;
import defpackage.tbi;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.ubi;
import defpackage.v4r0;
import defpackage.vbi;
import defpackage.vuh;
import defpackage.w511;
import defpackage.wbi;
import defpackage.wt90;
import defpackage.x5i;
import defpackage.xku0;
import defpackage.y5i;
import defpackage.ybi;
import defpackage.ycc;
import defpackage.zy11;
import defpackage.zzs;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.delivery.exception.CreateDeliveryOrderCancelledError;
import ru.yandex.taxi.delivery.exception.CreateDeliveryOrderIllegalStateError;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class a {
    public final tse a;
    public final dqe0 b;
    public final ybi c;
    public final ru.yandex.taxi.logistics.sdk.management.f d;
    public final y5i e;
    public final gdi f;
    public final ru.yandex.taxi.logistics.sdk.management.j g;
    public final xku0 h;
    public final t8i i;
    public final l8i j;
    public final wt90 k;
    public final ru.yandex.taxi.delivery.experiments.e l;
    public final aji m;
    public final ru.yandex.taxi.logistics.address.g n;

    public a(tse tseVar, dqe0 dqe0Var, ybi ybiVar, ru.yandex.taxi.logistics.sdk.management.f fVar, y5i y5iVar, gdi gdiVar, ru.yandex.taxi.logistics.sdk.management.j jVar, xku0 xku0Var, t8i t8iVar, l8i l8iVar, wt90 wt90Var, ru.yandex.taxi.delivery.experiments.e eVar, aji ajiVar, ru.yandex.taxi.logistics.address.g gVar) {
        this.a = tseVar;
        this.b = dqe0Var;
        this.c = ybiVar;
        this.d = fVar;
        this.e = y5iVar;
        this.f = gdiVar;
        this.g = jVar;
        this.h = xku0Var;
        this.i = t8iVar;
        this.j = l8iVar;
        this.k = wt90Var;
        this.l = eVar;
        this.m = ajiVar;
        this.n = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    public final k6i a(Address address, AddressDeliveryInfo addressDeliveryInfo, vuh vuhVar, PointType pointType, String str) {
        ?? r7;
        zzs B = address.B();
        String uri = address.getUri();
        String str2 = uri == null ? "" : uri;
        bgq0 bgq0Var = addressDeliveryInfo.a;
        String str3 = bgq0Var.b;
        String str4 = bgq0Var.a;
        String str5 = addressDeliveryInfo.d;
        String str6 = str5 == null ? "" : str5;
        UUID randomUUID = UUID.randomUUID();
        aji ajiVar = this.m;
        if (ajiVar.b().b && ajiVar.b().c.contains(str)) {
            List list = vuhVar.h;
            r7 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof lkb0) {
                    r7.add(obj);
                }
            }
        } else {
            r7 = EmptyList.a;
        }
        randomUUID.toString();
        double d = B.b;
        double d2 = B.a;
        Iterable iterable = r7;
        doe doeVar = new doe(d2, d);
        String d3 = address.d();
        String D1 = address.D1();
        String D = q5z.D(address);
        String str7 = addressDeliveryInfo.b;
        String str8 = addressDeliveryInfo.c;
        String str9 = addressDeliveryInfo.e;
        String str10 = addressDeliveryInfo.f;
        s9e s9eVar = new s9e(str4, str3);
        Iterable<lkb0> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(tcc.n(iterable2, 10));
        for (lkb0 lkb0Var : iterable2) {
            arrayList.add(new m6i(lkb0Var.a(), lkb0Var.b()));
        }
        return new k6i(pointType, str2, doeVar, d3, str6, D1, D, str7, str8, str9, str10, s9eVar, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03d8 A[LOOP:2: B:26:0x03d2->B:28:0x03d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(l4f l4fVar, ContinuationImpl continuationImpl) {
        CreateDeliveryDraftInteractor$execute$1 createDeliveryDraftInteractor$execute$1;
        int i;
        AddressDeliveryInfo addressDeliveryInfo;
        List list;
        boolean x;
        n4f n4fVar;
        l4f l4fVar2;
        k6i k6iVar;
        ArrayList arrayList;
        String str;
        e4a0 h;
        PaymentMethod$Type paymentMethod$Type;
        ArrayList arrayList2;
        m4f m4fVar;
        Map map;
        Iterator it;
        wbi wbiVar;
        if (continuationImpl instanceof CreateDeliveryDraftInteractor$execute$1) {
            createDeliveryDraftInteractor$execute$1 = (CreateDeliveryDraftInteractor$execute$1) continuationImpl;
            int i2 = createDeliveryDraftInteractor$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createDeliveryDraftInteractor$execute$1.label = i2 - Integer.MIN_VALUE;
                CreateDeliveryDraftInteractor$execute$1 createDeliveryDraftInteractor$execute$12 = createDeliveryDraftInteractor$execute$1;
                Object obj = createDeliveryDraftInteractor$execute$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createDeliveryDraftInteractor$execute$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kzo e = this.j.e(l4fVar.c);
                    String str2 = (e != null ? (boj0) e.x : null) != null ? ((t8i.a) this.i.b.a.getValue()).a : null;
                    if (str2 == null && (str2 = this.e.j) == null && (str2 = this.b.a.d()) == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    String str4 = l4fVar.c;
                    Address e2 = this.b.e();
                    if (e2 == null) {
                        throw new CreateDeliveryOrderIllegalStateError("Address should not be null when creating src points");
                    }
                    RouteDeliveryInfo routeDeliveryInfo = this.b.a.H;
                    if (routeDeliveryInfo == null || (addressDeliveryInfo = routeDeliveryInfo.a) == null) {
                        throw new CreateDeliveryOrderIllegalStateError("DeliveryInfo should not be null when creating src points");
                    }
                    k6i a = a(e2, addressDeliveryInfo, ((x5i) this.e.k.getValue()).a.a, PointType.SOURCE, str4);
                    String str5 = l4fVar.c;
                    List b = this.b.b();
                    RouteDeliveryInfo routeDeliveryInfo2 = this.b.a.H;
                    if (routeDeliveryInfo2 == null || (list = routeDeliveryInfo2.b) == null) {
                        throw new CreateDeliveryOrderIllegalStateError("DestinationPointsInfo should not be null when creating dst points or");
                    }
                    if (b.isEmpty()) {
                        throw new CreateDeliveryOrderIllegalStateError("Addresses should not be empty when creating dst points");
                    }
                    if (b.size() != list.size()) {
                        throw new CreateDeliveryOrderIllegalStateError("Dst point number is not equal to destinations in preorder");
                    }
                    ArrayList P0 = kotlin.collections.a.P0(b, list);
                    ArrayList arrayList3 = new ArrayList(tcc.n(P0, 10));
                    Iterator it2 = P0.iterator();
                    int i3 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        Pair pair = (Pair) next;
                        arrayList3.add(a((Address) pair.getFirst(), (AddressDeliveryInfo) pair.getSecond(), this.e.m(i3), PointType.DESTINATION, str5));
                        a = a;
                        i3 = i4;
                    }
                    k6i k6iVar2 = a;
                    Preorder preorder = this.b.a;
                    lv90 e3 = preorder.e();
                    PaymentMethod$Type paymentMethod$Type2 = e3 != null ? e3.a : null;
                    String str6 = e3 != null ? e3.b : null;
                    ArrayList arrayList4 = (paymentMethod$Type2 == null || str6 == null || evu0.J(str6)) ? new ArrayList() : scc.i(new k1a0(paymentMethod$Type2.getCode(), e3.b));
                    if (((Boolean) this.k.b.getValue()).booleanValue() && this.l.b()) {
                        arrayList4.add(new k1a0("pay_on_delivery", null));
                    }
                    lv90 c = preorder.c();
                    PaymentMethod$Type paymentMethod$Type3 = c.a;
                    if (paymentMethod$Type3 == null) {
                        throw new CreateDeliveryOrderIllegalStateError("Payment method type should not be null when creating payment info snap");
                    }
                    String str7 = c.b;
                    if (str7 == null || evu0.J(str7)) {
                        str7 = null;
                    }
                    if (str7 == null && paymentMethod$Type3 != PaymentMethod$Type.CASH && paymentMethod$Type3 != PaymentMethod$Type.GOOGLE_PAY) {
                        throw new CreateDeliveryOrderIllegalStateError("Payment method id should not be null with type " + paymentMethod$Type3 + " when creating payment info snap");
                    }
                    n4f n4fVar2 = new n4f(paymentMethod$Type3, str7, arrayList4);
                    this.g.a(l4fVar.a);
                    x = cvu0.x(l4fVar.a, "fk_id", false);
                    ru.yandex.taxi.logistics.address.g gVar = this.n;
                    createDeliveryDraftInteractor$execute$12.L$0 = l4fVar;
                    createDeliveryDraftInteractor$execute$12.L$1 = null;
                    createDeliveryDraftInteractor$execute$12.L$2 = str3;
                    createDeliveryDraftInteractor$execute$12.L$3 = k6iVar2;
                    createDeliveryDraftInteractor$execute$12.L$4 = arrayList3;
                    createDeliveryDraftInteractor$execute$12.L$5 = n4fVar2;
                    createDeliveryDraftInteractor$execute$12.Z$0 = x;
                    createDeliveryDraftInteractor$execute$12.label = 1;
                    obj = gVar.a(createDeliveryDraftInteractor$execute$12);
                    if (obj != coroutineSingletons) {
                        n4fVar = n4fVar2;
                        l4fVar2 = l4fVar;
                        k6iVar = k6iVar2;
                        arrayList = arrayList3;
                        str = str3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m4fVar = (m4f) createDeliveryDraftInteractor$execute$12.L$7;
                    kotlin.b.b(obj);
                    wbiVar = (wbi) obj;
                    if (jl40.l(wbiVar, vbi.a)) {
                        if (jl40.l(wbiVar, tbi.a)) {
                            throw new CreateDeliveryOrderCancelledError(0);
                        }
                        if (wbiVar instanceof ubi) {
                            throw new CreateDeliveryOrderIllegalStateError("select google pay card error");
                        }
                        w511.b();
                        return null;
                    }
                    tje.N(this.a, null, null, new CreateDeliveryDraftInteractor$launchCreateDelivery$1(m4fVar, this, null), 3);
                    y5i y5iVar = this.e;
                    ArrayList m0 = kotlin.collections.a.m0(y5iVar.l().b, Collections.singletonList(y5iVar.l().a));
                    ArrayList arrayList5 = new ArrayList();
                    it = m0.iterator();
                    while (it.hasNext()) {
                        List list2 = ((vuh) it.next()).h;
                        ArrayList arrayList6 = new ArrayList(tcc.n(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(((mkb0) it3.next()).getId());
                        }
                        ycc.r(arrayList6, arrayList5);
                    }
                    for (String str8 : kotlin.collections.a.J0(v4r0.g(this.f.b, kotlin.collections.a.N0(arrayList5)))) {
                        this.f.getClass();
                        new File(str8).delete();
                    }
                    return zy11.a;
                }
                x = createDeliveryDraftInteractor$execute$12.Z$0;
                n4f n4fVar3 = (n4f) createDeliveryDraftInteractor$execute$12.L$5;
                ?? r4 = (List) createDeliveryDraftInteractor$execute$12.L$4;
                k6i k6iVar3 = (k6i) createDeliveryDraftInteractor$execute$12.L$3;
                String str9 = (String) createDeliveryDraftInteractor$execute$12.L$2;
                l4fVar2 = (l4f) createDeliveryDraftInteractor$execute$12.L$0;
                kotlin.b.b(obj);
                n4fVar = n4fVar3;
                arrayList = r4;
                k6iVar = k6iVar3;
                str = str9;
                a0t a0tVar = (a0t) obj;
                doe doeVar = new doe(a0tVar.a, a0tVar.b);
                String str10 = l4fVar2.a;
                UUID uuid = l4fVar2.b;
                Preorder preorder2 = this.b.a;
                h = preorder2.h();
                paymentMethod$Type = PaymentMethod$Type.CORP;
                if (h == paymentMethod$Type) {
                    xku0 xku0Var = this.h;
                    fga0 fga0Var = xku0Var.a;
                    fga0Var.getClass();
                    CorpAccount j = fga0Var.j(fga0Var.q(paymentMethod$Type));
                    jve b2 = j != null ? xku0Var.c.b(j) : null;
                    if (b2 != null) {
                        List list3 = b2.e;
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj2 : list3) {
                            if (((CostCenterField) obj2).c.contains(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                                arrayList7.add(obj2);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it4 = arrayList7.iterator();
                        while (it4.hasNext()) {
                            CostCenterField costCenterField = (CostCenterField) it4.next();
                            String f = preorder2.f(costCenterField.a);
                            j6i j6iVar = (f == null || evu0.J(f)) ? null : new j6i(costCenterField.a, costCenterField.b, f);
                            if (j6iVar != null) {
                                arrayList8.add(j6iVar);
                            }
                        }
                        arrayList2 = arrayList8;
                        m4f m4fVar2 = new m4f(str10, uuid, str, k6iVar, arrayList, n4fVar, arrayList2, (x || (map = l4fVar2.d) == null) ? null : new l6i(map), doeVar);
                        if (n4fVar.a != PaymentMethod$Type.GOOGLE_PAY) {
                            tje.N(this.a, null, null, new CreateDeliveryDraftInteractor$launchCreateDelivery$1(m4fVar2, this, null), 3);
                            y5i y5iVar2 = this.e;
                            ArrayList m02 = kotlin.collections.a.m0(y5iVar2.l().b, Collections.singletonList(y5iVar2.l().a));
                            ArrayList arrayList52 = new ArrayList();
                            it = m02.iterator();
                            while (it.hasNext()) {
                            }
                            while (r1.hasNext()) {
                            }
                            return zy11.a;
                        }
                        ybi ybiVar = this.c;
                        createDeliveryDraftInteractor$execute$12.L$0 = null;
                        createDeliveryDraftInteractor$execute$12.L$1 = null;
                        createDeliveryDraftInteractor$execute$12.L$2 = null;
                        createDeliveryDraftInteractor$execute$12.L$3 = null;
                        createDeliveryDraftInteractor$execute$12.L$4 = null;
                        createDeliveryDraftInteractor$execute$12.L$5 = null;
                        createDeliveryDraftInteractor$execute$12.L$6 = null;
                        createDeliveryDraftInteractor$execute$12.L$7 = m4fVar2;
                        createDeliveryDraftInteractor$execute$12.Z$0 = x;
                        createDeliveryDraftInteractor$execute$12.label = 2;
                        fvt fvtVar = ybiVar.c;
                        Activity activity = ybiVar.a;
                        fvtVar.getClass();
                        com.yandex.go.payments.googlepay.domain.e eVar = (com.yandex.go.payments.googlepay.domain.e) fvtVar;
                        Object ubiVar = !eVar.m(activity, false, lvt.f) ? new ubi(new Exception("can not select googlepay card")) : kotlinx.coroutines.flow.e.y(new kotlinx.coroutines.flow.o(new l(eVar.h()), new DeliveryGooglePayInteractor$selectGooglePayCard$3(3, null)), createDeliveryDraftInteractor$execute$12);
                        if (ubiVar != coroutineSingletons) {
                            Object obj3 = ubiVar;
                            m4fVar = m4fVar2;
                            obj = obj3;
                            wbiVar = (wbi) obj;
                            if (jl40.l(wbiVar, vbi.a)) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                arrayList2 = null;
                m4f m4fVar22 = new m4f(str10, uuid, str, k6iVar, arrayList, n4fVar, arrayList2, (x || (map = l4fVar2.d) == null) ? null : new l6i(map), doeVar);
                if (n4fVar.a != PaymentMethod$Type.GOOGLE_PAY) {
                }
            }
        }
        createDeliveryDraftInteractor$execute$1 = new CreateDeliveryDraftInteractor$execute$1(this, continuationImpl);
        CreateDeliveryDraftInteractor$execute$1 createDeliveryDraftInteractor$execute$122 = createDeliveryDraftInteractor$execute$1;
        Object obj4 = createDeliveryDraftInteractor$execute$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createDeliveryDraftInteractor$execute$122.label;
        if (i != 0) {
        }
        a0t a0tVar2 = (a0t) obj4;
        doe doeVar2 = new doe(a0tVar2.a, a0tVar2.b);
        String str102 = l4fVar2.a;
        UUID uuid2 = l4fVar2.b;
        Preorder preorder22 = this.b.a;
        h = preorder22.h();
        paymentMethod$Type = PaymentMethod$Type.CORP;
        if (h == paymentMethod$Type) {
        }
        arrayList2 = null;
        m4f m4fVar222 = new m4f(str102, uuid2, str, k6iVar, arrayList, n4fVar, arrayList2, (x || (map = l4fVar2.d) == null) ? null : new l6i(map), doeVar2);
        if (n4fVar.a != PaymentMethod$Type.GOOGLE_PAY) {
        }
    }
}
