package ru.yandex.taxi.scooters.presentation.ontheway;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4o0;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$attachView$$inlined$collectLatestIn$1", f = "ScootersOnTheWayPresenter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersOnTheWayPresenter$attachView$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ f $receiver$inlined;
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$attachView$$inlined$collectLatestIn$1$1", f = "ScootersOnTheWayPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$attachView$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ f $receiver$inlined;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, f fVar) {
            super(2, continuation);
            this.$receiver$inlined = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.$receiver$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
            zuo0 zuo0Var = (zuo0) obj2;
            f fVar = this.$receiver$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            tse tseVar = fVar.x;
            x4o0 x4o0Var = fVar.L;
            tje.N(tseVar, null, null, new ScootersOnTheWayPresenter$handleSessionSelection$2(fVar, zuo0Var, null), 3);
            ScootersOnTheWayAction scootersOnTheWayAction = (ScootersOnTheWayAction) x4o0Var.b(zuo0Var.getSessionId());
            ScootersOnTheWayAction scootersOnTheWayAction2 = ScootersOnTheWayAction.ROUTE;
            if (scootersOnTheWayAction == scootersOnTheWayAction2) {
                l8x l8xVar = (l8x) fVar.O.c.remove(new Pair(zuo0Var.getSessionId(), scootersOnTheWayAction2));
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                x4o0Var.d(null, zuo0Var.getSessionId());
            }
            if (zuo0Var.b()) {
                fVar.Og(zuo0Var, ScootersOnTheWayAction.START);
            }
            pzt0 pzt0Var = fVar.T;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            fVar.T = tje.N(fVar.Jg(), null, null, new ScootersOnTheWayPresenter$processOneShotAction$$inlined$collectIn$1(new m0(new e(fVar.M.b(false), zuo0Var), kotlinx.coroutines.flow.e.d(fVar.N.c(zuo0Var.getSessionId())), new ScootersOnTheWayPresenter$processOneShotAction$2(fVar, zuo0Var, null)), null), 3);
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnTheWayPresenter$attachView$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, f fVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.$receiver$inlined = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersOnTheWayPresenter$attachView$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.$receiver$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOnTheWayPresenter$attachView$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$receiver$inlined);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
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
