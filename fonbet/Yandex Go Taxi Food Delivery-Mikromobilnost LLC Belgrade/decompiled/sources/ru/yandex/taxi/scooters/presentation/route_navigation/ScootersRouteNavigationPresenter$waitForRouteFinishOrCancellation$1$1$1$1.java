package ru.yandex.taxi.scooters.presentation.route_navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v0o0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.scooters.data.ScootersNavigationRouteGuidanceRepository$waitRouteFinish$$inlined$flatMapLatest$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$1", f = "ScootersRouteNavigationPresenter.kt", l = {HProv.PP_CONTAINER_STATUS}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        v0o0 v0o0Var = this.this$0.K;
        this.label = 1;
        Object y = e.y(e.X(v0o0Var.d, new ScootersNavigationRouteGuidanceRepository$waitRouteFinish$$inlined$flatMapLatest$1(null, v0o0Var)), this);
        if (y != coroutineSingletons) {
            y = zy11Var;
        }
        return y == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
