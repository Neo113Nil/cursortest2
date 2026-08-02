package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lg2s;", "<anonymous>", "(Ltse;)Lg2s;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.ForceTariffSwitchOrderInteractor$onSummaryShown$tariffSwitchInfo$1", f = "ForceTariffSwitchOrderInteractor.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ForceTariffSwitchOrderInteractor$onSummaryShown$tariffSwitchInfo$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceTariffSwitchOrderInteractor$onSummaryShown$tariffSwitchInfo$1(y yVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ForceTariffSwitchOrderInteractor$onSummaryShown$tariffSwitchInfo$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ForceTariffSwitchOrderInteractor$onSummaryShown$tariffSwitchInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        y yVar = this.this$0;
        this.label = 1;
        Object z = kotlinx.coroutines.flow.e.z(new kotlinx.coroutines.flow.m0(new x(((com.yandex.go.taxi.tariffs.internal.repository.k) yVar.g).r("")), yVar.l, new ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$3(yVar, null)), new ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$4(2, null), this);
        return z == coroutineSingletons ? coroutineSingletons : z;
    }
}
