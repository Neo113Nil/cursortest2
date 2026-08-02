package ru.yandex.taxi.masstransit.detailedroute.router;

import defpackage.gci0;
import defpackage.kf30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.su30;
import defpackage.tse;
import defpackage.wls;
import defpackage.ye;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.router.MtDetailedRouteRouterImpl$onAttach$1", f = "MtDetailedRouteRouterImpl.kt", l = {274}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ su30 $route;
    final /* synthetic */ kf30 $stateRepository;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteRouterImpl$onAttach$1(kf30 kf30Var, c cVar, su30 su30Var, Continuation continuation) {
        super(2, continuation);
        this.$stateRepository = kf30Var;
        this.this$0 = cVar;
        this.$route = su30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtDetailedRouteRouterImpl$onAttach$1(this.$stateRepository, this.this$0, this.$route, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRouteRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kf30 kf30Var = this.$stateRepository;
            gci0 gci0Var = kf30Var.b;
            c cVar = this.this$0;
            su30 su30Var = this.$route;
            o oVar = new o(gci0Var, new MtDetailedRouteRouterImpl$onAttach$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            ye yeVar = new ye(14, cVar, su30Var, kf30Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(yeVar, this) == coroutineSingletons) {
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
