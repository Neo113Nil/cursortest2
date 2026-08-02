package ru.yandex.taxi.preorder.map;

import defpackage.g92;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$sourceIconFlow$$inlined$flatMapLatest$1", f = "RouteOverlayIconHolder.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class RouteOverlayIconHolder$sourceIconFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteOverlayIconHolder$sourceIconFlow$$inlined$flatMapLatest$1(Continuation continuation, n nVar) {
        super(3, continuation);
        this.this$0 = nVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RouteOverlayIconHolder$sourceIconFlow$$inlined$flatMapLatest$1 routeOverlayIconHolder$sourceIconFlow$$inlined$flatMapLatest$1 = new RouteOverlayIconHolder$sourceIconFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        routeOverlayIconHolder$sourceIconFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        routeOverlayIconHolder$sourceIconFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return routeOverlayIconHolder$sourceIconFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            n nVar = this.this$0;
            if (booleanValue) {
                i = 1;
                g gVar = new g(new tpr[]{nVar.d.c(nVar.s), kotlinx.coroutines.flow.e.t(new f(((com.yandex.go.taxi.tariffs.internal.repository.k) nVar.c).j.a())), kotlinx.coroutines.flow.e.t(new i(((com.yandex.go.taxi.tariffs.internal.repository.k) nVar.b).j.b())), new k(nVar.J), ((com.yandex.go.summary.branding_pin.i) nVar.i).d(), nVar.m.a(), nVar.u, nVar.e.a(), nVar.o.a}, nVar);
                nVar.g.getClass();
                g92Var = new jqr(kotlinx.coroutines.flow.e.F(gVar, uyj.a), new RouteOverlayIconHolder$sourceIconResultFlow$4(null, nVar), 3);
            } else {
                i = 1;
                g92Var = new g92(2, nVar.w);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = i;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
