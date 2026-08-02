package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.dp01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "requirementDisappearedInCurrentTariff", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3", f = "TransferRequirementStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3(u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3 transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3 = new TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3(this.this$0, continuation);
        transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3.Z$0 = ((Boolean) obj).booleanValue();
        return transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3 transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3 = (TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z) {
            ((dp01) this.this$0.d()).a();
            this.this$0.b.f();
        }
        return zy11.a;
    }
}
