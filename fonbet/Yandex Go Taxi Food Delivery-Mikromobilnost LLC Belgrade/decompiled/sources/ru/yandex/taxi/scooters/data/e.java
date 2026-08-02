package ru.yandex.taxi.scooters.data;

import defpackage.ibn0;
import defpackage.ny61;
import defpackage.sqm0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1 scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1) {
            scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1 = (ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1) continuation;
            int i2 = scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = ibn0.a;
                    sqm0 sqm0Var = (sqm0) ((Pair) obj).f();
                    scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.L$0 = null;
                    scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.L$1 = null;
                    scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.L$2 = null;
                    scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.L$3 = null;
                    scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(sqm0Var, scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1 = new ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
