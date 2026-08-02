package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Ldb40;", "", "it", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutLifecycleInteractor$onAttach$4", f = "MtTrainCheckoutLifecycleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainCheckoutLifecycleInteractor$onAttach$4 extends SuspendLambda implements wls {
    final /* synthetic */ a $actionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainCheckoutLifecycleInteractor$onAttach$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.$actionInteractor = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainCheckoutLifecycleInteractor$onAttach$4(this.$actionInteractor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtTrainCheckoutLifecycleInteractor$onAttach$4 mtTrainCheckoutLifecycleInteractor$onAttach$4 = (MtTrainCheckoutLifecycleInteractor$onAttach$4) create((Pair) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtTrainCheckoutLifecycleInteractor$onAttach$4.invokeSuspend(zy11Var);
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
        pzt0 pzt0Var = this.$actionInteractor.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        return zy11.a;
    }
}
