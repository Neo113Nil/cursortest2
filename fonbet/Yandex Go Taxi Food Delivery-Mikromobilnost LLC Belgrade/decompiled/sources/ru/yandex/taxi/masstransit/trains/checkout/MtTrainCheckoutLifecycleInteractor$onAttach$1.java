package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.ab40;
import defpackage.gb40;
import defpackage.gd40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lfb40;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutLifecycleInteractor$onAttach$1", f = "MtTrainCheckoutLifecycleInteractor.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainCheckoutLifecycleInteractor$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ a $actionInteractor;
    final /* synthetic */ ab40 $navigator;
    final /* synthetic */ gb40 $payload;
    final /* synthetic */ tse $scope;
    final /* synthetic */ r $uiStateRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainCheckoutLifecycleInteractor$onAttach$1(a aVar, gb40 gb40Var, r rVar, ab40 ab40Var, tse tseVar, Continuation continuation) {
        super(2, continuation);
        this.$actionInteractor = aVar;
        this.$payload = gb40Var;
        this.$uiStateRepository = rVar;
        this.$navigator = ab40Var;
        this.$scope = tseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainCheckoutLifecycleInteractor$onAttach$1(this.$actionInteractor, this.$payload, this.$uiStateRepository, this.$navigator, this.$scope, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainCheckoutLifecycleInteractor$onAttach$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.$actionInteractor;
            gb40 gb40Var = this.$payload;
            gd40 gd40Var = new gd40(gb40Var);
            r rVar = this.$uiStateRepository;
            ab40 ab40Var = this.$navigator;
            tse tseVar = this.$scope;
            this.label = 1;
            if (aVar.b(gd40Var, rVar, ab40Var, gb40Var, tseVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
