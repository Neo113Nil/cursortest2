package ru.yandex.taxi.cashback.sdk;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public g(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderPlusInfoRepository$special$$inlined$map$1$2$1 orderPlusInfoRepository$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderPlusInfoRepository$special$$inlined$map$1$2$1) {
            orderPlusInfoRepository$special$$inlined$map$1$2$1 = (OrderPlusInfoRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = orderPlusInfoRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPlusInfoRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderPlusInfoRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPlusInfoRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    Map c = k.c((TaxiOrder) obj);
                    orderPlusInfoRepository$special$$inlined$map$1$2$1.L$0 = null;
                    orderPlusInfoRepository$special$$inlined$map$1$2$1.L$1 = null;
                    orderPlusInfoRepository$special$$inlined$map$1$2$1.L$2 = null;
                    orderPlusInfoRepository$special$$inlined$map$1$2$1.L$3 = null;
                    orderPlusInfoRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(c, orderPlusInfoRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        orderPlusInfoRepository$special$$inlined$map$1$2$1 = new OrderPlusInfoRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderPlusInfoRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPlusInfoRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
