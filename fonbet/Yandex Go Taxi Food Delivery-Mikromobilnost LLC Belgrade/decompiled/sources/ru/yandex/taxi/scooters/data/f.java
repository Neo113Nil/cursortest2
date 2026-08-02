package ru.yandex.taxi.scooters.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class f implements tpr {
    public final /* synthetic */ d a;

    public f(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1 scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1) {
            scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1 = (ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1) continuation;
            int i2 = scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1.L$0 = null;
                    scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1.L$1 = null;
                    scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1.L$2 = null;
                    scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1 = new ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentActiveOrdersStateRepository$listenActiveOrders$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
