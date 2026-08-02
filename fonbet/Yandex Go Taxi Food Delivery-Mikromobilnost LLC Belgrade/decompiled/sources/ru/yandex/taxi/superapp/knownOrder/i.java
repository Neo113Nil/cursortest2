package ru.yandex.taxi.superapp.knownOrder;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes10.dex */
public final class i implements tpr {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ boolean b;

    public i(m0 m0Var, boolean z) {
        this.a = m0Var;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        KnownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1 knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1;
        int i;
        if (continuation instanceof KnownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1) {
            knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1 = (KnownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1) continuation;
            int i2 = knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b);
                    knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1.L$0 = null;
                    knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1.L$1 = null;
                    knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1.L$2 = null;
                    knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1.label = 1;
                    if (this.a.collect(hVar, knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1) == coroutineSingletons) {
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
        knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1 = new KnownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1(this, continuation);
        Object obj2 = knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
