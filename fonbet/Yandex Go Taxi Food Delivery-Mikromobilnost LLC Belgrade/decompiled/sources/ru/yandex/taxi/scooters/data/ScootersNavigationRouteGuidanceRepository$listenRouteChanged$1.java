package ru.yandex.taxi.scooters.data;

import com.yandex.mapkit.navigation.transport.Navigation;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t0o0;
import defpackage.u0o0;
import defpackage.v0o0;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.ScootersNavigationRouteGuidanceRepository$listenRouteChanged$1", f = "ScootersNavigationRouteGuidanceRepository.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersNavigationRouteGuidanceRepository$listenRouteChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ Navigation $navigation;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ v0o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersNavigationRouteGuidanceRepository$listenRouteChanged$1(v0o0 v0o0Var, Navigation navigation, Continuation continuation) {
        super(2, continuation);
        this.this$0 = v0o0Var;
        this.$navigation = navigation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersNavigationRouteGuidanceRepository$listenRouteChanged$1 scootersNavigationRouteGuidanceRepository$listenRouteChanged$1 = new ScootersNavigationRouteGuidanceRepository$listenRouteChanged$1(this.this$0, this.$navigation, continuation);
        scootersNavigationRouteGuidanceRepository$listenRouteChanged$1.L$0 = obj;
        return scootersNavigationRouteGuidanceRepository$listenRouteChanged$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersNavigationRouteGuidanceRepository$listenRouteChanged$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v0o0 v0o0Var = this.this$0;
            ScootersNavigationRouteGuidanceRepository$GuidanceEvent scootersNavigationRouteGuidanceRepository$GuidanceEvent = ScootersNavigationRouteGuidanceRepository$GuidanceEvent.ROUTE_CHANGED;
            u0o0 u0o0Var = new u0o0(y6f0Var, 0);
            v0o0Var.getClass();
            t tVar = new t(u0o0Var, scootersNavigationRouteGuidanceRepository$GuidanceEvent, v0o0Var);
            this.$navigation.getGuidance().addListener(tVar);
            t0o0 t0o0Var = new t0o0(this.$navigation, tVar, 1);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, t0o0Var, this) == coroutineSingletons) {
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
