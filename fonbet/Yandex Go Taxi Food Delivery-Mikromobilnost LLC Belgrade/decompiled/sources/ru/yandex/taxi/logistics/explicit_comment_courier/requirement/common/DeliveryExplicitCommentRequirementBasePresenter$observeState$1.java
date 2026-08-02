package ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common;

import defpackage.e9i;
import defpackage.j9i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oex0;
import defpackage.pzh;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loex0;", "tariffData", "Lpzh;", "requirementInfo", "Lqzh;", "<anonymous>", "(Loex0;Lpzh;)Lqzh;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryExplicitCommentRequirementBasePresenter$observeState$1", f = "DeliveryExplicitCommentRequirementBasePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryExplicitCommentRequirementBasePresenter$observeState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e9i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryExplicitCommentRequirementBasePresenter$observeState$1(e9i e9iVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = e9iVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryExplicitCommentRequirementBasePresenter$observeState$1 deliveryExplicitCommentRequirementBasePresenter$observeState$1 = new DeliveryExplicitCommentRequirementBasePresenter$observeState$1(this.this$0, (Continuation) obj3);
        deliveryExplicitCommentRequirementBasePresenter$observeState$1.L$0 = (oex0) obj;
        deliveryExplicitCommentRequirementBasePresenter$observeState$1.L$1 = (pzh) obj2;
        return deliveryExplicitCommentRequirementBasePresenter$observeState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oex0 oex0Var = (oex0) this.L$0;
        pzh pzhVar = (pzh) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j9i j9iVar = this.this$0.x;
        String str = oex0Var.a;
        if (str == null) {
            str = "";
        }
        return j9iVar.a(pzhVar, str, oex0Var.b, oex0Var.c);
    }
}
