package ru.yandex.taxi.preorder.map;

import defpackage.e6l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt3l0;", "<anonymous>", "()Lt3l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$loadingState$4", f = "RouteOverlayIconHolder.kt", l = {320}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteOverlayIconHolder$loadingState$4 extends SuspendLambda implements tls {
    final /* synthetic */ e6l0 $appearance;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteOverlayIconHolder$loadingState$4(n nVar, e6l0 e6l0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = nVar;
        this.$appearance = e6l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RouteOverlayIconHolder$loadingState$4(this.this$0, this.$appearance, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((RouteOverlayIconHolder$loadingState$4) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0.j;
        e6l0 e6l0Var = this.$appearance;
        this.label = 1;
        Object e = cVar.e(e6l0Var, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
