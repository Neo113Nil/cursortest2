package ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common;

import defpackage.e9i;
import defpackage.gl;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x7i;
import defpackage.zch;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryExplicitCommentRequirementBasePresenter$onFieldSeen$1", f = "DeliveryExplicitCommentRequirementBasePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryExplicitCommentRequirementBasePresenter$onFieldSeen$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e9i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryExplicitCommentRequirementBasePresenter$onFieldSeen$1(e9i e9iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = e9iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryExplicitCommentRequirementBasePresenter$onFieldSeen$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryExplicitCommentRequirementBasePresenter$onFieldSeen$1 deliveryExplicitCommentRequirementBasePresenter$onFieldSeen$1 = (DeliveryExplicitCommentRequirementBasePresenter$onFieldSeen$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryExplicitCommentRequirementBasePresenter$onFieldSeen$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gl Kg = this.this$0.Kg();
        if (Kg != null) {
            zch zchVar = this.this$0.z;
            zchVar.getClass();
            if (x7i.a[((DeliveryCommentRequirementType) Kg.x).ordinal()] != 1) {
                w511.b();
                return null;
            }
            zchVar.n("Summary.SummaryCard.CommentToCourierButton.Shown", Kg);
        }
        return zy11.a;
    }
}
