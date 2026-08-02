package ru.yandex.taxi.superapp.knownOrder;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class p implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ u b;

    public p(tpr tprVar, u uVar) {
        this.a = tprVar;
        this.b = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        KnownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1 knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1;
        int i;
        if (continuation instanceof KnownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1) {
            knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1 = (KnownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1) continuation;
            int i2 = knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar, this.b);
                    knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1.L$0 = null;
                    knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1.L$1 = null;
                    knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1.L$2 = null;
                    knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1.label = 1;
                    if (this.a.collect(oVar, knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1) == coroutineSingletons) {
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
        knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1 = new KnownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1(this, continuation);
        Object obj2 = knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = knownOrdersRepositoryImpl$scootersOrders$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
