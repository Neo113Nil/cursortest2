package ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point;

import androidx.compose.ui.focus.c;
import defpackage.dur;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x7l0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.RoutePointKt$RoutePoint$1$1", f = "RoutePoint.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RoutePointKt$RoutePoint$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ dur $focusManager;
    final /* synthetic */ x7l0 $model;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutePointKt$RoutePoint$1$1(x7l0 x7l0Var, dur durVar, Continuation continuation) {
        super(2, continuation);
        this.$model = x7l0Var;
        this.$focusManager = durVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoutePointKt$RoutePoint$1$1(this.$model, this.$focusManager, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RoutePointKt$RoutePoint$1$1 routePointKt$RoutePoint$1$1 = (RoutePointKt$RoutePoint$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        routePointKt$RoutePoint$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!this.$model.n) {
            ((c) this.$focusManager).d(8, true, true);
        }
        return zy11.a;
    }
}
