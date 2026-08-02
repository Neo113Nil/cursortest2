package ru.yandex.taxi.routes.presentation;

import com.yandex.mapkit.directions.driving.VehicleType;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cv00;
import defpackage.d0l0;
import defpackage.dvw;
import defpackage.gpc;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uz;
import defpackage.vj;
import defpackage.wj;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzk0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.map_common.map.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llgl0;", "<anonymous>", "(Ltse;)Llgl0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routes.presentation.CommonRouteOverlay$getRouteInfo$3", f = "CommonRouteOverlay.kt", l = {405}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CommonRouteOverlay$getRouteInfo$3 extends SuspendLambda implements wls {
    final /* synthetic */ d0l0 $route;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRouteOverlay$getRouteInfo$3(c cVar, d0l0 d0l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$route = d0l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CommonRouteOverlay$getRouteInfo$3(this.this$0, this.$route, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CommonRouteOverlay$getRouteInfo$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, uz] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Boolean bool = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        d0l0 d0l0Var = this.$route;
        this.label = 1;
        cVar.getClass();
        j18 j18Var = new j18(1, dvw.b(this));
        Ref$ObjectRef y = b64.y(j18Var);
        vj vjVar = new vj(8, y);
        cl7 cl7Var = new cl7(j18Var, vjVar);
        CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2 commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2 = new CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
        CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3 commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3 = new CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        if (cVar.Ig() && !cVar.Pg()) {
            bool = Boolean.TRUE;
        }
        Boolean bool2 = bool;
        long nanoTime = System.nanoTime();
        cv00 cv00Var = cVar.A;
        zzk0 zzk0Var = d0l0.Companion;
        ((o) cv00Var).f(d0l0Var.d(false, false), bool2, new gpc(cVar, d0l0Var, nanoTime, commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2, commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3), null, null, VehicleType.TAXI);
        y.element = new uz(18, cVar);
        if (cl7Var.c()) {
            vjVar.invoke();
        } else {
            j18Var.w(new wj(cl7Var, 8));
        }
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
