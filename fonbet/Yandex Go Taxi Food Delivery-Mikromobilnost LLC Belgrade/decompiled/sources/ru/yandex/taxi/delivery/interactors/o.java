package ru.yandex.taxi.delivery.interactors;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class o implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ p b;

    public o(kotlinx.coroutines.flow.n nVar, p pVar) {
        this.a = nVar;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryRequirementsInteractorImpl$special$$inlined$map$1$1 deliveryRequirementsInteractorImpl$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof DeliveryRequirementsInteractorImpl$special$$inlined$map$1$1) {
            deliveryRequirementsInteractorImpl$special$$inlined$map$1$1 = (DeliveryRequirementsInteractorImpl$special$$inlined$map$1$1) continuation;
            int i2 = deliveryRequirementsInteractorImpl$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryRequirementsInteractorImpl$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryRequirementsInteractorImpl$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryRequirementsInteractorImpl$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n(vprVar, this.b);
                    deliveryRequirementsInteractorImpl$special$$inlined$map$1$1.L$0 = null;
                    deliveryRequirementsInteractorImpl$special$$inlined$map$1$1.L$1 = null;
                    deliveryRequirementsInteractorImpl$special$$inlined$map$1$1.L$2 = null;
                    deliveryRequirementsInteractorImpl$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(nVar, deliveryRequirementsInteractorImpl$special$$inlined$map$1$1) == coroutineSingletons) {
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
        deliveryRequirementsInteractorImpl$special$$inlined$map$1$1 = new DeliveryRequirementsInteractorImpl$special$$inlined$map$1$1(this, continuation);
        Object obj2 = deliveryRequirementsInteractorImpl$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryRequirementsInteractorImpl$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
