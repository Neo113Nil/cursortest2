package ru.yandex.taxi.layers.source.requesttrigger;

import defpackage.ny61;
import defpackage.uo70;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;

    public l(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1 orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1) {
            orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1 = (OrderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1) continuation;
            int i2 = orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.L$0 = null;
                    orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.L$1 = null;
                    orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.L$2 = null;
                    orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.L$3 = null;
                    orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(uo70.a, orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1 = new OrderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderConditionsChangeRepository$listenToOrderConditionsChange$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
