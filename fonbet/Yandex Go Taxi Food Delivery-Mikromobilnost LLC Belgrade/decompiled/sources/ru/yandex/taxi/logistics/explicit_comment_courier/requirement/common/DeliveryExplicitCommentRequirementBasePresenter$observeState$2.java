package ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common;

import defpackage.e9i;
import defpackage.h9i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qzh;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqzh;", "it", "Lzy11;", "<anonymous>", "(Lqzh;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryExplicitCommentRequirementBasePresenter$observeState$2", f = "DeliveryExplicitCommentRequirementBasePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryExplicitCommentRequirementBasePresenter$observeState$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e9i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryExplicitCommentRequirementBasePresenter$observeState$2(e9i e9iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = e9iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryExplicitCommentRequirementBasePresenter$observeState$2 deliveryExplicitCommentRequirementBasePresenter$observeState$2 = new DeliveryExplicitCommentRequirementBasePresenter$observeState$2(this.this$0, continuation);
        deliveryExplicitCommentRequirementBasePresenter$observeState$2.L$0 = obj;
        return deliveryExplicitCommentRequirementBasePresenter$observeState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryExplicitCommentRequirementBasePresenter$observeState$2 deliveryExplicitCommentRequirementBasePresenter$observeState$2 = (DeliveryExplicitCommentRequirementBasePresenter$observeState$2) create((qzh) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryExplicitCommentRequirementBasePresenter$observeState$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qzh qzhVar = (qzh) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((h9i) this.this$0.Dg()).dg(qzhVar);
        return zy11.a;
    }
}
