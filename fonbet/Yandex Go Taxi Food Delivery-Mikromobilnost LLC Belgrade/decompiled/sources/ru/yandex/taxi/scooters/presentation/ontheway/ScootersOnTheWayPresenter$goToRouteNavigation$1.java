package ru.yandex.taxi.scooters.presentation.ontheway;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.seu;
import defpackage.tls;
import defpackage.tse;
import defpackage.vam0;
import defpackage.wls;
import defpackage.wxm0;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$goToRouteNavigation$1", f = "ScootersOnTheWayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOnTheWayPresenter$goToRouteNavigation$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersOnTheWayAction $onTheWayAction;
    final /* synthetic */ zuo0 $scootersSessionState;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$goToRouteNavigation$1$1", f = "ScootersOnTheWayPresenter.kt", l = {522}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$goToRouteNavigation$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ l8x $activityJob;
        final /* synthetic */ zuo0 $scootersSessionState;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l8x l8xVar, f fVar, zuo0 zuo0Var, Continuation continuation) {
            super(1, continuation);
            this.$activityJob = l8xVar;
            this.this$0 = fVar;
            this.$scootersSessionState = zuo0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.$activityJob, this.this$0, this.$scootersSessionState, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                l8x l8xVar = this.$activityJob;
                this.label = 1;
                if (l8xVar.u0(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            f fVar = this.this$0;
            fVar.L.d(null, this.$scootersSessionState.getSessionId());
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnTheWayPresenter$goToRouteNavigation$1(f fVar, zuo0 zuo0Var, ScootersOnTheWayAction scootersOnTheWayAction, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$scootersSessionState = zuo0Var;
        this.$onTheWayAction = scootersOnTheWayAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersOnTheWayPresenter$goToRouteNavigation$1 scootersOnTheWayPresenter$goToRouteNavigation$1 = new ScootersOnTheWayPresenter$goToRouteNavigation$1(this.this$0, this.$scootersSessionState, this.$onTheWayAction, continuation);
        scootersOnTheWayPresenter$goToRouteNavigation$1.L$0 = obj;
        return scootersOnTheWayPresenter$goToRouteNavigation$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersOnTheWayPresenter$goToRouteNavigation$1 scootersOnTheWayPresenter$goToRouteNavigation$1 = (ScootersOnTheWayPresenter$goToRouteNavigation$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersOnTheWayPresenter$goToRouteNavigation$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.Sg(this.$scootersSessionState.getSessionId(), this.$onTheWayAction);
        l8x l8xVar = (l8x) tseVar.getCoroutineContext().get(seu.C);
        zy11 zy11Var = zy11.a;
        if (l8xVar == null) {
            return zy11Var;
        }
        wxm0 wxm0Var = this.this$0.O;
        Pair pair = new Pair(this.$scootersSessionState.getSessionId(), ScootersOnTheWayAction.ROUTE);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(l8xVar, this.this$0, this.$scootersSessionState, null);
        ConcurrentHashMap concurrentHashMap = wxm0Var.c;
        l8x l8xVar2 = (l8x) concurrentHashMap.get(pair);
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
        pzt0 c = wxm0Var.c(anonymousClass1);
        concurrentHashMap.put(pair, c);
        c.w(new vam0(18, wxm0Var, pair));
        return zy11Var;
    }
}
