package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import defpackage.iyn;
import defpackage.jl40;
import defpackage.lyn;
import defpackage.mvg;
import defpackage.nhn0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.wnj;
import defpackage.x950;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.k;
import ru.yandex.taxi.scooters.domain.ScootersDetailedOrderFocusInteractor$FocusType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2Presenter$listenNavigationStateChange$$inlined$collectLatestIn$1", f = "ScootersDetailedOrderV2Presenter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersDetailedOrderV2Presenter$listenNavigationStateChange$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2Presenter$listenNavigationStateChange$$inlined$collectLatestIn$1$1", f = "ScootersDetailedOrderV2Presenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2Presenter$listenNavigationStateChange$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, e eVar) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Pair pair = (Pair) obj2;
            zuo0 zuo0Var = (zuo0) pair.getFirst();
            x950 x950Var = (x950) pair.getSecond();
            e eVar = this.this$0;
            eVar.b0 = zuo0Var;
            eVar.c0 = x950Var;
            if (x950Var instanceof wnj) {
                pzt0 pzt0Var = eVar.Z;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                pzt0 pzt0Var2 = eVar.W;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                eVar.Ng(zuo0Var);
                ((nhn0) eVar.Dg()).Z9(zuo0Var.getNumber());
                ((nhn0) eVar.Dg()).l9();
            } else if (x950Var instanceof iyn) {
                eVar.F.b.Fg(Boolean.FALSE);
                ((nhn0) eVar.Dg()).H8();
                eVar.W = tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$onRouteNavigationEnabled$$inlined$collectLatestIn$1(new k(eVar.L.b(), new ScootersDetailedOrderV2Presenter$onRouteNavigationEnabled$1(null, eVar)), null), 3);
                eVar.Z = tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$onRouteNavigationEnabled$$inlined$collectLatestIn$2(eVar.R.e, null, eVar), 3);
                eVar.Q.a(ScootersDetailedOrderFocusInteractor$FocusType.FOCUS_ON_ROUTE);
            } else {
                if (!jl40.l(x950Var, lyn.a)) {
                    w511.b();
                    return null;
                }
                e eVar2 = this.this$0;
                eVar2.c0 = x950Var;
                eVar2.F.b.Fg(Boolean.FALSE);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderV2Presenter$listenNavigationStateChange$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, e eVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDetailedOrderV2Presenter$listenNavigationStateChange$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDetailedOrderV2Presenter$listenNavigationStateChange$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.this$0);
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
