package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.dp01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrsn;", "", "emit", "Lzy11;", "<anonymous>", "(Lrsn;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$5", f = "TransferRequirementStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$5(u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$5 transferRequirementStateInteractor$subscribeOrderRequirementDeletions$5 = new TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$5(this.this$0, continuation);
        transferRequirementStateInteractor$subscribeOrderRequirementDeletions$5.L$0 = obj;
        return transferRequirementStateInteractor$subscribeOrderRequirementDeletions$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$5 transferRequirementStateInteractor$subscribeOrderRequirementDeletions$5 = (TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$5) create((rsn) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        transferRequirementStateInteractor$subscribeOrderRequirementDeletions$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rsn rsnVar = (rsn) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Boolean bool = (Boolean) rsnVar.a;
        if ((bool != null ? bool.booleanValue() : false) && !((Boolean) rsnVar.b).booleanValue()) {
            ((dp01) this.this$0.d()).a();
        }
        return zy11.a;
    }
}
