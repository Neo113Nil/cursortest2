package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.bvf0;
import defpackage.d1j;
import defpackage.e1j;
import defpackage.hfi;
import defpackage.isi;
import defpackage.jgz;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.lsi;
import defpackage.nuh;
import defpackage.ny61;
import defpackage.ouh;
import defpackage.pth;
import defpackage.puh;
import defpackage.quh;
import defpackage.st2;
import defpackage.tcc;
import defpackage.tdi;
import defpackage.w511;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveryStub$C2CStub;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveryStub$MarketStub;

/* loaded from: classes9.dex */
public final class d extends ru.yandex.taxi.logistics.sdk.concurrency.b {
    public static final /* synthetic */ int C = 0;
    public ArrayList A;
    public final LinkedHashSet B;
    public final lsi c;
    public final tdi w;
    public final ru.yandex.taxi.logistics.sdk.management.storage.e x;
    public final ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d y;
    public final r0 z;

    public d(st2 st2Var, lsi lsiVar, tdi tdiVar, ru.yandex.taxi.logistics.sdk.management.storage.e eVar, ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d dVar) {
        super(st2Var.c);
        this.c = lsiVar;
        this.w = tdiVar;
        this.x = eVar;
        this.y = dVar;
        this.z = bvf0.c(EmptyList.a);
        this.B = new LinkedHashSet();
    }

    public static void i(String str) {
        jgz.a.h("d");
        jgz.a(str, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // ru.yandex.taxi.logistics.sdk.concurrency.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        DeliveriesManagerActor$afterEachUpdate$1 deliveriesManagerActor$afterEachUpdate$1;
        int i;
        if (continuationImpl instanceof DeliveriesManagerActor$afterEachUpdate$1) {
            deliveriesManagerActor$afterEachUpdate$1 = (DeliveriesManagerActor$afterEachUpdate$1) continuationImpl;
            int i2 = deliveriesManagerActor$afterEachUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveriesManagerActor$afterEachUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveriesManagerActor$afterEachUpdate$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesManagerActor$afterEachUpdate$1.label;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    deliveriesManagerActor$afterEachUpdate$1.label = 1;
                    obj = h(deliveriesManagerActor$afterEachUpdate$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj3;
                    }
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                i("New deliveries snapshot: " + list);
                deliveriesManagerActor$afterEachUpdate$1.L$0 = null;
                deliveriesManagerActor$afterEachUpdate$1.label = 2;
                this.z.emit(list, deliveriesManagerActor$afterEachUpdate$1);
                return obj3 != obj2 ? obj2 : obj3;
            }
        }
        deliveriesManagerActor$afterEachUpdate$1 = new DeliveriesManagerActor$afterEachUpdate$1(this, continuationImpl);
        Object obj4 = deliveriesManagerActor$afterEachUpdate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesManagerActor$afterEachUpdate$1.label;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        List list2 = (List) obj4;
        i("New deliveries snapshot: " + list2);
        deliveriesManagerActor$afterEachUpdate$1.L$0 = null;
        deliveriesManagerActor$afterEachUpdate$1.label = 2;
        this.z.emit(list2, deliveriesManagerActor$afterEachUpdate$1);
        if (obj32 != obj22) {
        }
    }

    public final Object d(String str, Continuation continuation) {
        return a(new DeliveriesManagerActor$acquireDeliveryCancelling$2(this, str, null), (ContinuationImpl) continuation);
    }

    public final void e(UUID uuid, String str, int i) {
        c(new DeliveriesManagerActor$addPersistentC2CStub$1(this, uuid, str, i, null));
    }

    public final void f(String str) {
        c(new DeliveriesManagerActor$addPersistentMarketStub$1(this, str, null));
    }

    public final void g(UUID uuid) {
        c(new DeliveriesManagerActor$addTemporaryC2CStub$1(this, uuid, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
    
        if (r6.a(r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015e -> B:12:0x0162). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(ContinuationImpl continuationImpl) {
        DeliveriesManagerActor$getDeliveriesSnapshot$1 deliveriesManagerActor$getDeliveriesSnapshot$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        List list;
        List b;
        Object a;
        List list2;
        Object obj2;
        List list3;
        Map map;
        List list4;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
        boolean hasNext;
        quh ouhVar;
        UUID uuid;
        Object obj3;
        d dVar = this;
        if (continuationImpl instanceof DeliveriesManagerActor$getDeliveriesSnapshot$1) {
            deliveriesManagerActor$getDeliveriesSnapshot$1 = (DeliveriesManagerActor$getDeliveriesSnapshot$1) continuationImpl;
            int i4 = deliveriesManagerActor$getDeliveriesSnapshot$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                deliveriesManagerActor$getDeliveriesSnapshot$1.label = i4 - Integer.MIN_VALUE;
                Object obj4 = deliveriesManagerActor$getDeliveriesSnapshot$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesManagerActor$getDeliveriesSnapshot$1.label;
                ru.yandex.taxi.logistics.sdk.management.storage.e eVar = dVar.x;
                if (i != 0) {
                    obj = null;
                    kotlin.b.b(obj4);
                    List list5 = dVar.A;
                    if (list5 == null) {
                        list5 = EmptyList.a;
                    }
                    list = list5;
                    b = dVar.c.b();
                    if (list.size() > 1) {
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$0 = list;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$1 = b;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.label = 1;
                    }
                } else if (i == 1) {
                    obj = null;
                    b = (List) deliveriesManagerActor$getDeliveriesSnapshot$1.L$1;
                    list = (List) deliveriesManagerActor$getDeliveriesSnapshot$1.L$0;
                    kotlin.b.b(obj4);
                } else if (i == 2) {
                    obj = null;
                    List list6 = (List) deliveriesManagerActor$getDeliveriesSnapshot$1.L$1;
                    List list7 = (List) deliveriesManagerActor$getDeliveriesSnapshot$1.L$0;
                    kotlin.b.b(obj4);
                    list3 = list7;
                    list2 = list6;
                    obj2 = obj4;
                    List list8 = list3;
                    ArrayList arrayList = new ArrayList(tcc.n(list8, 10));
                    map = (Map) obj2;
                    list4 = list2;
                    it = list8.iterator();
                    collection = arrayList;
                    i2 = 0;
                    i3 = 0;
                    hasNext = it.hasNext();
                    r12 = dVar.w;
                    if (!hasNext) {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = deliveriesManagerActor$getDeliveriesSnapshot$1.I$1;
                    i3 = deliveriesManagerActor$getDeliveriesSnapshot$1.I$0;
                    collection = (Collection) deliveriesManagerActor$getDeliveriesSnapshot$1.L$14;
                    tdi tdiVar = (tdi) deliveriesManagerActor$getDeliveriesSnapshot$1.L$13;
                    hfi hfiVar = (hfi) deliveriesManagerActor$getDeliveriesSnapshot$1.L$12;
                    map = (Map) deliveriesManagerActor$getDeliveriesSnapshot$1.L$11;
                    list4 = (List) deliveriesManagerActor$getDeliveriesSnapshot$1.L$10;
                    Set set = (Set) deliveriesManagerActor$getDeliveriesSnapshot$1.L$9;
                    it = (Iterator) deliveriesManagerActor$getDeliveriesSnapshot$1.L$6;
                    Collection collection2 = (Collection) deliveriesManagerActor$getDeliveriesSnapshot$1.L$5;
                    Map map2 = (Map) deliveriesManagerActor$getDeliveriesSnapshot$1.L$2;
                    List list9 = (List) deliveriesManagerActor$getDeliveriesSnapshot$1.L$1;
                    kotlin.b.b(obj4);
                    Object y = obj4;
                    boolean booleanValue = ((Boolean) y).booleanValue();
                    tdiVar.getClass();
                    String e = hfiVar.e();
                    String j = hfiVar.j();
                    String e2 = hfiVar.e();
                    UUID uuid2 = (UUID) map.get(e2);
                    if (uuid2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : list4) {
                            if (obj5 instanceof DeliveryStub$C2CStub) {
                                arrayList2.add(obj5);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (jl40.l(((DeliveryStub$C2CStub) obj3).getDeliveryId(), e2)) {
                                break;
                            }
                        }
                        DeliveryStub$C2CStub deliveryStub$C2CStub = (DeliveryStub$C2CStub) obj3;
                        uuid = deliveryStub$C2CStub != null ? deliveryStub$C2CStub.getLocalUuid() : null;
                    } else {
                        uuid = uuid2;
                    }
                    collection.add(new puh(e, j, uuid, hfiVar.o(), hfiVar.g(), hfiVar.h(), hfiVar.l(), hfiVar.m(), hfiVar.d().c(), hfiVar.c(), hfiVar.f(), hfiVar.a(), hfiVar.k(), hfiVar.i(), hfiVar.b(), hfiVar.d().e(), hfiVar.d().a(), set.contains(hfiVar.e()), hfiVar.d().f(), hfiVar.d().b(), hfiVar.p(), booleanValue, hfiVar.d().d()));
                    dVar = this;
                    map = map2;
                    collection = collection2;
                    list4 = list9;
                    obj = null;
                    hasNext = it.hasNext();
                    tdiVar = dVar.w;
                    if (!hasNext) {
                        hfiVar = (hfi) it.next();
                        String e3 = hfiVar.e();
                        Object obj6 = obj;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$0 = obj6;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$1 = list4;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$2 = map;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$3 = obj6;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$4 = obj6;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$5 = collection;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$6 = it;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$7 = obj6;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$8 = obj6;
                        set = dVar.B;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$9 = set;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$10 = list4;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$11 = map;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$12 = hfiVar;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$13 = tdiVar;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.L$14 = collection;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.I$0 = i3;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.I$1 = i2;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.I$2 = 0;
                        deliveriesManagerActor$getDeliveriesSnapshot$1.label = 3;
                        eVar.getClass();
                        y = kotlinx.coroutines.flow.e.y(new e1j(d1j.a(ru.yandex.taxi.logistics.sdk.management.storage.e.b, eVar.a).getData(), new kme0(e3), 0), deliveriesManagerActor$getDeliveriesSnapshot$1);
                        if (y != coroutineSingletons) {
                            collection2 = collection;
                            map2 = map;
                            list9 = list4;
                            boolean booleanValue2 = ((Boolean) y).booleanValue();
                            tdiVar.getClass();
                            String e4 = hfiVar.e();
                            String j2 = hfiVar.j();
                            String e22 = hfiVar.e();
                            UUID uuid22 = (UUID) map.get(e22);
                            if (uuid22 != null) {
                            }
                            collection.add(new puh(e4, j2, uuid, hfiVar.o(), hfiVar.g(), hfiVar.h(), hfiVar.l(), hfiVar.m(), hfiVar.d().c(), hfiVar.c(), hfiVar.f(), hfiVar.a(), hfiVar.k(), hfiVar.i(), hfiVar.b(), hfiVar.d().e(), hfiVar.d().a(), set.contains(hfiVar.e()), hfiVar.d().f(), hfiVar.d().b(), hfiVar.p(), booleanValue2, hfiVar.d().d()));
                            dVar = this;
                            map = map2;
                            collection = collection2;
                            list4 = list9;
                            obj = null;
                            hasNext = it.hasNext();
                            tdiVar = dVar.w;
                            if (!hasNext) {
                                List list10 = (List) collection;
                                List<isi> x0 = kotlin.collections.a.x0(list4, new pth());
                                ArrayList arrayList3 = new ArrayList(tcc.n(x0, 10));
                                for (isi isiVar : x0) {
                                    tdiVar.getClass();
                                    if (isiVar instanceof DeliveryStub$C2CStub) {
                                        ouhVar = new nuh(((DeliveryStub$C2CStub) isiVar).getLocalUuid());
                                    } else {
                                        if (!(isiVar instanceof DeliveryStub$MarketStub)) {
                                            w511.b();
                                            return null;
                                        }
                                        ouhVar = new ouh(((DeliveryStub$MarketStub) isiVar).getOriginalOrderId());
                                    }
                                    arrayList3.add(ouhVar);
                                }
                                return kotlin.collections.a.m0(arrayList3, list10);
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                deliveriesManagerActor$getDeliveriesSnapshot$1.L$0 = list;
                deliveriesManagerActor$getDeliveriesSnapshot$1.L$1 = b;
                deliveriesManagerActor$getDeliveriesSnapshot$1.label = 2;
                a = dVar.y.a.a(deliveriesManagerActor$getDeliveriesSnapshot$1);
                if (a != coroutineSingletons) {
                    List list11 = list;
                    list2 = b;
                    obj2 = a;
                    list3 = list11;
                    List list82 = list3;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list82, 10));
                    map = (Map) obj2;
                    list4 = list2;
                    it = list82.iterator();
                    collection = arrayList4;
                    i2 = 0;
                    i3 = 0;
                    hasNext = it.hasNext();
                    tdiVar = dVar.w;
                    if (!hasNext) {
                    }
                }
                return coroutineSingletons;
            }
        }
        deliveriesManagerActor$getDeliveriesSnapshot$1 = new DeliveriesManagerActor$getDeliveriesSnapshot$1(dVar, continuationImpl);
        Object obj42 = deliveriesManagerActor$getDeliveriesSnapshot$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesManagerActor$getDeliveriesSnapshot$1.label;
        ru.yandex.taxi.logistics.sdk.management.storage.e eVar2 = dVar.x;
        if (i != 0) {
        }
        deliveriesManagerActor$getDeliveriesSnapshot$1.L$0 = list;
        deliveriesManagerActor$getDeliveriesSnapshot$1.L$1 = b;
        deliveriesManagerActor$getDeliveriesSnapshot$1.label = 2;
        a = dVar.y.a.a(deliveriesManagerActor$getDeliveriesSnapshot$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void j(List list) {
        c(new DeliveriesManagerActor$onDeliveriesReceived$1(this, list, null));
    }

    public final void k(String str) {
        c(new DeliveriesManagerActor$releaseDeliveryCancelling$1(this, str, null));
    }

    public final void l(UUID uuid) {
        c(new DeliveriesManagerActor$removeC2CStub$1(this, uuid, null));
    }

    public final void m(String str, UUID uuid) {
        c(new DeliveriesManagerActor$updateC2CStub$1(this, uuid, str, null));
    }

    public final void n() {
        c(new DeliveriesManagerActor$updateDetailsCardShownFlag$1(this, null));
    }
}
