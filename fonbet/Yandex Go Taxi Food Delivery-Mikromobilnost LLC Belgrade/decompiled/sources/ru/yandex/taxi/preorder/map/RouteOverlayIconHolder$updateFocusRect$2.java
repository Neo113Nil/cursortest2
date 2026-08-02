package ru.yandex.taxi.preorder.map;

import android.graphics.Rect;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$updateFocusRect$2", f = "RouteOverlayIconHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteOverlayIconHolder$updateFocusRect$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteOverlayIconHolder$updateFocusRect$2(Continuation continuation, n nVar) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteOverlayIconHolder$updateFocusRect$2 routeOverlayIconHolder$updateFocusRect$2 = new RouteOverlayIconHolder$updateFocusRect$2(continuation, this.this$0);
        routeOverlayIconHolder$updateFocusRect$2.L$0 = obj;
        return routeOverlayIconHolder$updateFocusRect$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RouteOverlayIconHolder$updateFocusRect$2 routeOverlayIconHolder$updateFocusRect$2 = (RouteOverlayIconHolder$updateFocusRect$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        routeOverlayIconHolder$updateFocusRect$2.invokeSuspend(zy11Var);
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
        int u = tje.u(56, this.this$0.l);
        this.this$0.h.Lc(tseVar, new Rect(u, 0, u, 0));
        return zy11.a;
    }
}
