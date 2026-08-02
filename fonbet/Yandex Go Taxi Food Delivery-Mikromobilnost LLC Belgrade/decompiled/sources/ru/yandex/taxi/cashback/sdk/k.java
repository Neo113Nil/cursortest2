package ru.yandex.taxi.cashback.sdk;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.tcc;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class k {
    public final p2y0 a;

    public k(p2y0 p2y0Var) {
        this.a = p2y0Var;
    }

    public static Map c(TaxiOrder taxiOrder) {
        OrderStatusInfo V;
        OrderStatusInfo.PlusInfo plusInfo;
        List a;
        if (taxiOrder == null || (V = taxiOrder.V()) == null || (plusInfo = V.y) == null || (a = plusInfo.getA()) == null) {
            return kotlin.collections.b.f();
        }
        List<OrderStatusInfo.PlusInfo.PlusInfoTemplate> list = a;
        int d = gw00.d(tcc.n(list, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (OrderStatusInfo.PlusInfo.PlusInfoTemplate plusInfoTemplate : list) {
            Pair pair = new Pair(plusInfoTemplate.getA(), plusInfoTemplate.getB());
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        OrderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1 orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1;
        int i;
        o2y0 o2y0Var;
        TaxiOrder b;
        OrderStatusInfo V;
        OrderStatusInfo.PlusInfo plusInfo;
        if (continuationImpl instanceof OrderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1) {
            orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1 = (OrderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1) continuationImpl;
            int i2 = orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.domain.repositories.e0) this.a).y(orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null || (b = o2y0Var.b()) == null || (V = b.V()) == null || (plusInfo = V.y) == null) {
                    return null;
                }
                return plusInfo.getB();
            }
        }
        orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1 = new OrderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1(this, continuationImpl);
        Object obj2 = orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPlusInfoRepository$activeOrderAdditionalDeeplinkParams$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        OrderPlusInfoRepository$getLastTemplates$1 orderPlusInfoRepository$getLastTemplates$1;
        int i;
        TaxiOrder b;
        if (continuationImpl instanceof OrderPlusInfoRepository$getLastTemplates$1) {
            orderPlusInfoRepository$getLastTemplates$1 = (OrderPlusInfoRepository$getLastTemplates$1) continuationImpl;
            int i2 = orderPlusInfoRepository$getLastTemplates$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPlusInfoRepository$getLastTemplates$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPlusInfoRepository$getLastTemplates$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPlusInfoRepository$getLastTemplates$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderPlusInfoRepository$getLastTemplates$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.domain.repositories.e0) this.a).y(orderPlusInfoRepository$getLastTemplates$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var = (o2y0) obj;
                return (o2y0Var != null || (b = o2y0Var.b()) == null) ? (Serializable) kotlin.collections.b.f() : (Serializable) c(b);
            }
        }
        orderPlusInfoRepository$getLastTemplates$1 = new OrderPlusInfoRepository$getLastTemplates$1(this, continuationImpl);
        Object obj2 = orderPlusInfoRepository$getLastTemplates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPlusInfoRepository$getLastTemplates$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = (o2y0) obj2;
        if (o2y0Var2 != null) {
        }
    }
}
