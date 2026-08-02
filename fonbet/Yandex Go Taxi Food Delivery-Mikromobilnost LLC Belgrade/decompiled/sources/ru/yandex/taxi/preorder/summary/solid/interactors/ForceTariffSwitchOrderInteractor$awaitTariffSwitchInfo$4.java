package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.g2s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg2s;", "it", "", "<anonymous>", "(Lg2s;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$4", f = "ForceTariffSwitchOrderInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$4 forceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$4 = new ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$4(2, continuation);
        forceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$4.L$0 = obj;
        return forceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$4) create((g2s) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g2s g2sVar = (g2s) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(g2sVar != null);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
