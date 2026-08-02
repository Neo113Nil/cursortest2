package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.yo0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld0l0;", "<unused var>", "Lyo0;", "tariffs", "<anonymous>", "(Ld0l0;Lyo0;)Lyo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.AddressActionsOnSummaryInteractor$handleSelectionChange$6", f = "AddressActionsOnSummaryInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddressActionsOnSummaryInteractor$handleSelectionChange$6 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AddressActionsOnSummaryInteractor$handleSelectionChange$6 addressActionsOnSummaryInteractor$handleSelectionChange$6 = new AddressActionsOnSummaryInteractor$handleSelectionChange$6(3, (Continuation) obj3);
        addressActionsOnSummaryInteractor$handleSelectionChange$6.L$0 = (yo0) obj2;
        return addressActionsOnSummaryInteractor$handleSelectionChange$6.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yo0 yo0Var = (yo0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return yo0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
