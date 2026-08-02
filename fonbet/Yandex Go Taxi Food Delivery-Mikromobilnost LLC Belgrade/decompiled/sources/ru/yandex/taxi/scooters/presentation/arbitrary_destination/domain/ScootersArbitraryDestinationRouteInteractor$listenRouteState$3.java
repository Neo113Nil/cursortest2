package ru.yandex.taxi.scooters.presentation.arbitrary_destination.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x33;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx33;", "it", "Lzy11;", "<anonymous>", "(Lx33;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.arbitrary_destination.domain.ScootersArbitraryDestinationRouteInteractor$listenRouteState$3", f = "ScootersArbitraryDestinationRouteInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersArbitraryDestinationRouteInteractor$listenRouteState$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersArbitraryDestinationRouteInteractor$listenRouteState$3(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersArbitraryDestinationRouteInteractor$listenRouteState$3 scootersArbitraryDestinationRouteInteractor$listenRouteState$3 = new ScootersArbitraryDestinationRouteInteractor$listenRouteState$3(this.this$0, continuation);
        scootersArbitraryDestinationRouteInteractor$listenRouteState$3.L$0 = obj;
        return scootersArbitraryDestinationRouteInteractor$listenRouteState$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersArbitraryDestinationRouteInteractor$listenRouteState$3 scootersArbitraryDestinationRouteInteractor$listenRouteState$3 = (ScootersArbitraryDestinationRouteInteractor$listenRouteState$3) create((x33) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersArbitraryDestinationRouteInteractor$listenRouteState$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x33 x33Var = (x33) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.c.a.g(x33Var);
        return zy11.a;
    }
}
