package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lrw30;", "", "", "it", "Lai30;", "<anonymous>", "(Lkotlin/Pair;)Lai30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.v2.MtDetailedRouteUiStateInteractor$routeUiStateFlow$2", f = "MtDetailedRouteUiStateInteractor.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteUiStateInteractor$routeUiStateFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteUiStateInteractor$routeUiStateFlow$2(Continuation continuation, o oVar) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtDetailedRouteUiStateInteractor$routeUiStateFlow$2 mtDetailedRouteUiStateInteractor$routeUiStateFlow$2 = new MtDetailedRouteUiStateInteractor$routeUiStateFlow$2(continuation, this.this$0);
        mtDetailedRouteUiStateInteractor$routeUiStateFlow$2.L$0 = obj;
        return mtDetailedRouteUiStateInteractor$routeUiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRouteUiStateInteractor$routeUiStateFlow$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
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
        o oVar = this.this$0;
        this.L$0 = null;
        this.label = 1;
        Object b = o.b(oVar, pair, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
