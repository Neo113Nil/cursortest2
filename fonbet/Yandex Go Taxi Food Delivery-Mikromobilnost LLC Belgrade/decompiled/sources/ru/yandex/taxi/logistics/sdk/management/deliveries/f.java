package ru.yandex.taxi.logistics.sdk.management.deliveries;

import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import defpackage.aci;
import defpackage.buh;
import defpackage.duh;
import defpackage.hfi;
import defpackage.igu;
import defpackage.ike;
import defpackage.jgu;
import defpackage.jl40;
import defpackage.jwh;
import defpackage.nuh;
import defpackage.ny61;
import defpackage.q32;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uct0;
import defpackage.vct0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wct0;
import defpackage.xct0;
import defpackage.yct0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.o;

/* loaded from: classes9.dex */
public final class f implements vpr {
    public final /* synthetic */ duh a;
    public final /* synthetic */ vpr b;

    public f(duh duhVar, vpr vprVar) {
        this.a = duhVar;
        this.b = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e1, code lost:
    
        if (r17.b.emit(r12, r3) == r4) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0269, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x026d, code lost:
    
        if (r0 != r4) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x026f, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022e A[LOOP:1: B:33:0x0228->B:35:0x022e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0255 A[LOOP:2: B:38:0x024f->B:40:0x0255, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(yct0 yct0Var, Continuation continuation) {
        DeliveriesModel$deliveriesFlow$2$1$1$emit$1 deliveriesModel$deliveriesFlow$2$1$1$emit$1;
        int i;
        duh duhVar;
        buh buhVar;
        boolean z;
        buh buhVar2;
        Object obj;
        Iterator it;
        Iterator it2;
        Iterator it3;
        if (continuation instanceof DeliveriesModel$deliveriesFlow$2$1$1$emit$1) {
            deliveriesModel$deliveriesFlow$2$1$1$emit$1 = (DeliveriesModel$deliveriesFlow$2$1$1$emit$1) continuation;
            int i2 = deliveriesModel$deliveriesFlow$2$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveriesModel$deliveriesFlow$2$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveriesModel$deliveriesFlow$2$1$1$emit$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesModel$deliveriesFlow$2$1$1$emit$1.label;
                Object obj4 = zy11.a;
                duhVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    buh buhVar3 = duhVar.k;
                    boolean z2 = yct0Var instanceof vct0;
                    Object obj5 = EmptyList.a;
                    if (z2) {
                        buhVar = new buh(((vct0) yct0Var).a, null, buhVar3.c);
                    } else if (yct0Var instanceof uct0) {
                        buhVar = new buh(buhVar3.a, ((uct0) yct0Var).a, buhVar3.c);
                    } else if (yct0Var instanceof xct0) {
                        buhVar = new buh(buhVar3.a, buhVar3.b, ((xct0) yct0Var).a);
                    } else {
                        if (!(yct0Var instanceof wct0)) {
                            w511.b();
                            return null;
                        }
                        buhVar = new buh(obj5, null, EmptySet.a);
                    }
                    duhVar.k = buhVar;
                    List list = buhVar.a;
                    if (list != null) {
                        aci aciVar = duhVar.d;
                        aciVar.getClass();
                        ConcurrentHashMap concurrentHashMap = aciVar.a;
                        List<hfi> list2 = list;
                        for (hfi hfiVar : list2) {
                            concurrentHashMap.put(hfiVar.e(), Integer.valueOf(hfiVar.n()));
                        }
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList.add(((hfi) it4.next()).e());
                        }
                        Set keySet = concurrentHashMap.keySet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj6 : keySet) {
                            if (!arrayList.contains((String) obj6)) {
                                arrayList2.add(obj6);
                            }
                        }
                        Iterator it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            concurrentHashMap.remove((String) it5.next());
                        }
                    }
                    buh buhVar4 = duhVar.k;
                    List list3 = buhVar4.a;
                    Set set = buhVar4.c;
                    if (list3 != null && set != null) {
                        obj5 = new ArrayList();
                        for (Object obj7 : list3) {
                            hfi hfiVar2 = (hfi) obj7;
                            Set<jgu> set2 = set;
                            boolean z3 = false;
                            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                for (jgu jguVar : set2) {
                                    if (jl40.l(jguVar.a(), hfiVar2.e()) && hfiVar2.n() <= jguVar.b()) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            z = false;
                            boolean booleanValue = ((Boolean) ((o) duhVar.i.b).o.a.b()).booleanValue();
                            if (z && !hfiVar2.d().e() && booleanValue) {
                                jwh jwhVar = duhVar.h;
                                q32 q32Var = new q32("Delivery.RestoreFalseCompletedOrder");
                                q32Var.d(hfiVar2.e(), "delivery_id");
                                jwhVar.a(q32Var);
                                final ru.yandex.taxi.logistics.sdk.management.localstate.e eVar = duhVar.g;
                                final String e = hfiVar2.e();
                                eVar.getClass();
                                ru.yandex.taxi.logistics.sdk.utils.a.b(new sls() { // from class: ru.yandex.taxi.logistics.sdk.management.localstate.c
                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        e eVar2 = e.this;
                                        eVar2.a.a(eVar2.a().getString("HIDDEN_DELIVERIES_PREF", null));
                                        igu iguVar = eVar2.a;
                                        int size = iguVar.c.getMarkedDeliveries().size();
                                        HiddenDeliveries$HiddenDeliveriesData hiddenDeliveries$HiddenDeliveriesData = iguVar.c;
                                        List<HiddenDeliveries$HiddenDelivery> markedDeliveries = hiddenDeliveries$HiddenDeliveriesData.getMarkedDeliveries();
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj8 : markedDeliveries) {
                                            if (!jl40.l(((HiddenDeliveries$HiddenDelivery) obj8).getDeliveryId(), e)) {
                                                arrayList3.add(obj8);
                                            }
                                        }
                                        hiddenDeliveries$HiddenDeliveriesData.setMarkedDeliveries(arrayList3);
                                        if (iguVar.c.getMarkedDeliveries().size() != size) {
                                            iguVar.b();
                                        }
                                        SharedPreferences.Editor edit = eVar2.a().edit();
                                        edit.putString("HIDDEN_DELIVERIES_PREF", ((JsonAdapter) iguVar.b.getValue()).toJson(iguVar.c));
                                        edit.apply();
                                        tje.X(new DeliveriesLocalStateRepositoryImpl$removeFromHidden$1$2(eVar2, null));
                                        return zy11.a;
                                    }
                                });
                            } else {
                                z3 = z;
                            }
                            if (!z3) {
                                obj5.add(obj7);
                            }
                        }
                    }
                    deliveriesModel$deliveriesFlow$2$1$1$emit$1.L$0 = null;
                    deliveriesModel$deliveriesFlow$2$1$1$emit$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        buh buhVar5 = duhVar.k;
                        ike ikeVar = duhVar.j;
                        tje.N(ikeVar, null, null, new DeliveriesModel$clearAlerts$1(buhVar5, duhVar, null), 3);
                        tje.N(ikeVar, null, null, new DeliveriesModel$clearAutoOpenedEditOrderDetailsDeliveries$1(duhVar.k, duhVar, null), 3);
                        tje.N(ikeVar, null, null, new DeliveriesModel$clearOnFirstLoadActionDataStore$1(duhVar.k, duhVar, null), 3);
                        return obj4;
                    }
                    kotlin.b.b(obj2);
                }
                buhVar2 = duhVar.k;
                deliveriesModel$deliveriesFlow$2$1$1$emit$1.L$0 = null;
                deliveriesModel$deliveriesFlow$2$1$1$emit$1.label = 2;
                if (buhVar2.a != null && buhVar2.c != null) {
                    ArrayList b = duhVar.e.b();
                    ArrayList arrayList3 = new ArrayList();
                    it = b.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof nuh) {
                            arrayList3.add(next);
                        }
                    }
                    ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d dVar = duhVar.f;
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((nuh) it2.next()).a());
                    }
                    List list4 = buhVar2.a;
                    ArrayList arrayList5 = new ArrayList(tcc.n(list4, 10));
                    it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(((hfi) it3.next()).e());
                    }
                    obj = dVar.c(arrayList4, arrayList5, deliveriesModel$deliveriesFlow$2$1$1$emit$1);
                }
                obj = obj4;
            }
        }
        deliveriesModel$deliveriesFlow$2$1$1$emit$1 = new DeliveriesModel$deliveriesFlow$2$1$1$emit$1(this, continuation);
        Object obj22 = deliveriesModel$deliveriesFlow$2$1$1$emit$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesModel$deliveriesFlow$2$1$1$emit$1.label;
        Object obj42 = zy11.a;
        duhVar = this.a;
        if (i != 0) {
        }
        buhVar2 = duhVar.k;
        deliveriesModel$deliveriesFlow$2$1$1$emit$1.L$0 = null;
        deliveriesModel$deliveriesFlow$2$1$1$emit$1.label = 2;
        if (buhVar2.a != null) {
            ArrayList b2 = duhVar.e.b();
            ArrayList arrayList32 = new ArrayList();
            it = b2.iterator();
            while (it.hasNext()) {
            }
            ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d dVar2 = duhVar.f;
            ArrayList arrayList42 = new ArrayList(tcc.n(arrayList32, 10));
            it2 = arrayList32.iterator();
            while (it2.hasNext()) {
            }
            List list42 = buhVar2.a;
            ArrayList arrayList52 = new ArrayList(tcc.n(list42, 10));
            it3 = list42.iterator();
            while (it3.hasNext()) {
            }
            obj = dVar2.c(arrayList42, arrayList52, deliveriesModel$deliveriesFlow$2$1$1$emit$1);
        }
        obj = obj42;
    }
}
