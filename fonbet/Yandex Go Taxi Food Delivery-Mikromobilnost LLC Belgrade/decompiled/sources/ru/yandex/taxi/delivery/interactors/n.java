package ru.yandex.taxi.delivery.interactors;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p b;

    public n(vpr vprVar, p pVar) {
        this.a = vprVar;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1 deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1) {
            deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1 = (DeliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList a = this.b.a();
                    deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
                    deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
                    deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
                    deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
                    deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1 = new DeliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryRequirementsInteractorImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
