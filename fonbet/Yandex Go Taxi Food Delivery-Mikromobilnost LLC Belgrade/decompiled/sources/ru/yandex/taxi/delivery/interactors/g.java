package ru.yandex.taxi.delivery.interactors;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class g implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ h c;

    public g(kotlinx.coroutines.flow.n nVar, ArrayList arrayList, h hVar) {
        this.a = nVar;
        this.b = arrayList;
        this.c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1 deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof DeliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1) {
            deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1 = (DeliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1) continuation;
            int i2 = deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b, this.c);
                    deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1.L$0 = null;
                    deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1.L$1 = null;
                    deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1.L$2 = null;
                    deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1 = new DeliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
