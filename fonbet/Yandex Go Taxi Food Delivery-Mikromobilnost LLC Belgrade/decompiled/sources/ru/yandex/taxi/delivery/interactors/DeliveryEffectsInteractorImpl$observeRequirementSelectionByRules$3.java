package ru.yandex.taxi.delivery.interactors;

import defpackage.cpi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rpn;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.interactors.DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3", f = "DeliveryEffectsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3 deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3 = new DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3(this.this$0, continuation);
        deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3.L$0 = obj;
        return deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3 deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3 = (DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        cpi cpiVar = this.this$0.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof rpn) {
                arrayList.add(obj2);
            }
        }
        cpiVar.a = arrayList;
        return zy11.a;
    }
}
