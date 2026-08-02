package ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ DeliveryCommentRequirementType b;

    public b(gci0 gci0Var, DeliveryCommentRequirementType deliveryCommentRequirementType) {
        this.a = gci0Var;
        this.b = deliveryCommentRequirementType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1 deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1;
        int i;
        if (continuation instanceof DeliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1) {
            deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1 = (DeliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1) continuation;
            int i2 = deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1.L$0 = null;
                    deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1.L$1 = null;
                    deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1.L$2 = null;
                    deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1) == coroutineSingletons) {
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
        deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1 = new DeliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1(this, continuation);
        Object obj2 = deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryExplicitCommentRequirementStateInteractor$getRequirementState$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
