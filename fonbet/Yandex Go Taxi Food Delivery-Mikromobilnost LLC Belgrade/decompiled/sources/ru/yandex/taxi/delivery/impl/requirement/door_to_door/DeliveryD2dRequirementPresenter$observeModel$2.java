package ru.yandex.taxi.delivery.impl.requirement.door_to_door;

import defpackage.l3i;
import defpackage.m3i;
import defpackage.mvg;
import defpackage.n3i;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll3i;", "it", "Lzy11;", "<anonymous>", "(Ll3i;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.impl.requirement.door_to_door.DeliveryD2dRequirementPresenter$observeModel$2", f = "DeliveryD2dRequirementPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryD2dRequirementPresenter$observeModel$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n3i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryD2dRequirementPresenter$observeModel$2(n3i n3iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = n3iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryD2dRequirementPresenter$observeModel$2 deliveryD2dRequirementPresenter$observeModel$2 = new DeliveryD2dRequirementPresenter$observeModel$2(this.this$0, continuation);
        deliveryD2dRequirementPresenter$observeModel$2.L$0 = obj;
        return deliveryD2dRequirementPresenter$observeModel$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryD2dRequirementPresenter$observeModel$2 deliveryD2dRequirementPresenter$observeModel$2 = (DeliveryD2dRequirementPresenter$observeModel$2) create((l3i) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryD2dRequirementPresenter$observeModel$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l3i l3iVar = (l3i) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((m3i) this.this$0.Dg()).bind(l3iVar);
        return zy11.a;
    }
}
