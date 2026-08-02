package ru.yandex.taxi.routestats.prefetch;

import com.yandex.go.routestats.PrefetchRouteStatsMode;
import defpackage.boe0;
import defpackage.mvg;
import defpackage.nbl0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.experiments.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lboe0;", "<anonymous>", "(Ltse;)Lboe0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchExperimentRepositoryImpl$config$2$1", f = "RouteStatsPrefetchExperimentRepositoryImpl.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class RouteStatsPrefetchExperimentRepositoryImpl$config$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ nbl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteStatsPrefetchExperimentRepositoryImpl$config$2$1(nbl0 nbl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nbl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteStatsPrefetchExperimentRepositoryImpl$config$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteStatsPrefetchExperimentRepositoryImpl$config$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PrefetchRouteStatsMode prefetchRouteStatsMode;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boe0 boe0Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            q qVar = this.this$0.c;
            this.label = 1;
            obj = qVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        RouteStatsPrefetchExperiment routeStatsPrefetchExperiment = (RouteStatsPrefetchExperiment) obj;
        if (routeStatsPrefetchExperiment.b) {
            int i2 = routeStatsPrefetchExperiment.d;
            int i3 = d.a[routeStatsPrefetchExperiment.c.ordinal()];
            if (i3 == 1) {
                prefetchRouteStatsMode = PrefetchRouteStatsMode.DISABLED;
            } else if (i3 == 2) {
                prefetchRouteStatsMode = PrefetchRouteStatsMode.ONLY_FIRST;
            } else if (i3 == 3) {
                prefetchRouteStatsMode = PrefetchRouteStatsMode.ALL;
            } else {
                if (i3 != 4) {
                    w511.b();
                    return null;
                }
                prefetchRouteStatsMode = PrefetchRouteStatsMode.FIRST_TWO;
            }
            boe0Var = new boe0(i2, prefetchRouteStatsMode, routeStatsPrefetchExperiment.e, routeStatsPrefetchExperiment.f, routeStatsPrefetchExperiment.g);
        }
        if (boe0Var != null) {
            this.this$0.b.a("RouteStats.Prefetch.ExperimentApplied");
        }
        return boe0Var;
    }
}
