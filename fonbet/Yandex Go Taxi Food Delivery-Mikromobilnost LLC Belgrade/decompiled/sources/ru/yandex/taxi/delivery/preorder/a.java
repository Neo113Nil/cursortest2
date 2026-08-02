package ru.yandex.taxi.delivery.preorder;

import com.yandex.go.utils.storage.json.b;
import defpackage.am2;
import defpackage.bhh;
import defpackage.eex;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.p53;
import defpackage.sdc;
import defpackage.tcc;
import defpackage.uki;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class a {
    public final b a;

    public a(eex eexVar) {
        EmptyList emptyList = EmptyList.a;
        am2 am2Var = new am2(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, "delivery_preorder_storage", emptyList);
        KSerializer serializer = uki.Companion.serializer();
        eexVar.getClass();
        this.a = eexVar.c(am2Var, new p53(serializer, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0056, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[LOOP:0: B:17:0x006c->B:19:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LinkedHashSet linkedHashSet, ContinuationImpl continuationImpl) {
        DeliveryPreorderCache$clearAllExcept$1 deliveryPreorderCache$clearAllExcept$1;
        int i;
        Collection collection;
        Iterator it;
        if (continuationImpl instanceof DeliveryPreorderCache$clearAllExcept$1) {
            deliveryPreorderCache$clearAllExcept$1 = (DeliveryPreorderCache$clearAllExcept$1) continuationImpl;
            int i2 = deliveryPreorderCache$clearAllExcept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPreorderCache$clearAllExcept$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryPreorderCache$clearAllExcept$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPreorderCache$clearAllExcept$1.label;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    deliveryPreorderCache$clearAllExcept$1.L$0 = linkedHashSet;
                    deliveryPreorderCache$clearAllExcept$1.label = 1;
                    obj = bVar.a(deliveryPreorderCache$clearAllExcept$1);
                    collection = linkedHashSet;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    Collection collection2 = (Set) deliveryPreorderCache$clearAllExcept$1.L$0;
                    kotlin.b.b(obj);
                    collection = collection2;
                }
                List list = (List) obj;
                Collection collection3 = collection;
                ArrayList arrayList = new ArrayList(tcc.n(collection3, 10));
                it = collection3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UUID) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (arrayList.contains(((uki) obj2).a)) {
                        arrayList2.add(obj2);
                    }
                }
                deliveryPreorderCache$clearAllExcept$1.L$0 = null;
                deliveryPreorderCache$clearAllExcept$1.L$1 = null;
                deliveryPreorderCache$clearAllExcept$1.L$2 = null;
                deliveryPreorderCache$clearAllExcept$1.L$3 = null;
                deliveryPreorderCache$clearAllExcept$1.label = 2;
                Object d = bVar.d(arrayList2, deliveryPreorderCache$clearAllExcept$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        deliveryPreorderCache$clearAllExcept$1 = new DeliveryPreorderCache$clearAllExcept$1(this, continuationImpl);
        Object obj3 = deliveryPreorderCache$clearAllExcept$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPreorderCache$clearAllExcept$1.label;
        b bVar2 = this.a;
        if (i != 0) {
        }
        List list2 = (List) obj3;
        Collection collection32 = collection;
        ArrayList arrayList3 = new ArrayList(tcc.n(collection32, 10));
        it = collection32.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r9.hasNext()) {
        }
        deliveryPreorderCache$clearAllExcept$1.L$0 = null;
        deliveryPreorderCache$clearAllExcept$1.L$1 = null;
        deliveryPreorderCache$clearAllExcept$1.L$2 = null;
        deliveryPreorderCache$clearAllExcept$1.L$3 = null;
        deliveryPreorderCache$clearAllExcept$1.label = 2;
        Object d2 = bVar2.d(arrayList22, deliveryPreorderCache$clearAllExcept$1);
        if (d2 != coroutineSingletons2) {
        }
    }

    public final uki b(UUID uuid) {
        Object obj;
        Iterator it = ((List) this.a.c()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((uki) obj).a, uuid != null ? uuid.toString() : null)) {
                break;
            }
        }
        uki ukiVar = (uki) obj;
        if (ukiVar != null) {
            return new uki(ukiVar.a, ukiVar.b.clone(), ukiVar.c, ukiVar.d, ukiVar.e, ukiVar.f);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(uki ukiVar, ContinuationImpl continuationImpl) {
        DeliveryPreorderCache$put$1 deliveryPreorderCache$put$1;
        int i;
        if (continuationImpl instanceof DeliveryPreorderCache$put$1) {
            deliveryPreorderCache$put$1 = (DeliveryPreorderCache$put$1) continuationImpl;
            int i2 = deliveryPreorderCache$put$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPreorderCache$put$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryPreorderCache$put$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPreorderCache$put$1.label;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    deliveryPreorderCache$put$1.L$0 = ukiVar;
                    deliveryPreorderCache$put$1.label = 1;
                    obj = bVar.a(deliveryPreorderCache$put$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ukiVar = (uki) deliveryPreorderCache$put$1.L$0;
                    kotlin.b.b(obj);
                }
                ArrayList arrayList = new ArrayList((Collection) obj);
                arrayList.removeIf(new sdc(3, new bhh(20, ukiVar)));
                arrayList.add(ukiVar);
                deliveryPreorderCache$put$1.L$0 = null;
                deliveryPreorderCache$put$1.L$1 = null;
                deliveryPreorderCache$put$1.label = 2;
                Object d = bVar.d(arrayList, deliveryPreorderCache$put$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        deliveryPreorderCache$put$1 = new DeliveryPreorderCache$put$1(this, continuationImpl);
        Object obj2 = deliveryPreorderCache$put$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPreorderCache$put$1.label;
        b bVar2 = this.a;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList((Collection) obj2);
        arrayList2.removeIf(new sdc(3, new bhh(20, ukiVar)));
        arrayList2.add(ukiVar);
        deliveryPreorderCache$put$1.L$0 = null;
        deliveryPreorderCache$put$1.L$1 = null;
        deliveryPreorderCache$put$1.label = 2;
        Object d2 = bVar2.d(arrayList2, deliveryPreorderCache$put$1);
        if (d2 != coroutineSingletons2) {
        }
    }
}
