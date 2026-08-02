package ru.yandex.taxi.scooters.presentation.arbitrary_destination.domain;

import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w33;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmo21;", "userLocation", "Lw33;", "destination", "Lkotlin/Pair;", "Lzzs;", "<anonymous>", "(Lmo21;Lw33;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.arbitrary_destination.domain.ScootersArbitraryDestinationRouteInteractor$listenRouteState$1", f = "ScootersArbitraryDestinationRouteInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersArbitraryDestinationRouteInteractor$listenRouteState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersArbitraryDestinationRouteInteractor$listenRouteState$1 scootersArbitraryDestinationRouteInteractor$listenRouteState$1 = new ScootersArbitraryDestinationRouteInteractor$listenRouteState$1(3, (Continuation) obj3);
        scootersArbitraryDestinationRouteInteractor$listenRouteState$1.L$0 = (mo21) obj;
        scootersArbitraryDestinationRouteInteractor$listenRouteState$1.L$1 = (w33) obj2;
        return scootersArbitraryDestinationRouteInteractor$listenRouteState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mo21 mo21Var = (mo21) this.L$0;
        w33 w33Var = (w33) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new Pair(mo21Var.a(), w33Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
