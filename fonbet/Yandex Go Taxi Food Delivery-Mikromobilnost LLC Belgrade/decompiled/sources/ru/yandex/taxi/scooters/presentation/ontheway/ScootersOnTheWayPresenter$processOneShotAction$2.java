package ru.yandex.taxi.scooters.presentation.ontheway;

import defpackage.f5o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.domain.model.ScootersDetailedOrderOneShotAction;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzuo0;", "session", "Lru/yandex/taxi/scooters/domain/model/ScootersDetailedOrderOneShotAction;", "oneShotAction", "Lzy11;", "<anonymous>", "(Lzuo0;Lru/yandex/taxi/scooters/domain/model/ScootersDetailedOrderOneShotAction;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$processOneShotAction$2", f = "ScootersOnTheWayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOnTheWayPresenter$processOneShotAction$2 extends SuspendLambda implements zls {
    final /* synthetic */ zuo0 $scootersSessionState;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnTheWayPresenter$processOneShotAction$2(f fVar, zuo0 zuo0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
        this.$scootersSessionState = zuo0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersOnTheWayPresenter$processOneShotAction$2 scootersOnTheWayPresenter$processOneShotAction$2 = new ScootersOnTheWayPresenter$processOneShotAction$2(this.this$0, this.$scootersSessionState, (Continuation) obj3);
        scootersOnTheWayPresenter$processOneShotAction$2.L$0 = (zuo0) obj;
        scootersOnTheWayPresenter$processOneShotAction$2.L$1 = (ScootersDetailedOrderOneShotAction) obj2;
        zy11 zy11Var = zy11.a;
        scootersOnTheWayPresenter$processOneShotAction$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zuo0 zuo0Var = (zuo0) this.L$0;
        ScootersDetailedOrderOneShotAction scootersDetailedOrderOneShotAction = (ScootersDetailedOrderOneShotAction) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zy11 zy11Var = zy11.a;
        if (scootersDetailedOrderOneShotAction == null) {
            return zy11Var;
        }
        this.this$0.N.d(null, this.$scootersSessionState.getSessionId());
        int i = f5o0.a[scootersDetailedOrderOneShotAction.ordinal()];
        if (i == 1) {
            this.this$0.Ng(zuo0Var, ScootersOnTheWayAction.CANCEL);
            return zy11Var;
        }
        if (i == 2) {
            this.this$0.Ng(zuo0Var, ScootersOnTheWayAction.FINISH);
            return zy11Var;
        }
        if (i == 3) {
            this.this$0.Pg(zuo0Var, ScootersOnTheWayAction.ROUTE);
            return zy11Var;
        }
        w511.b();
        return null;
    }
}
