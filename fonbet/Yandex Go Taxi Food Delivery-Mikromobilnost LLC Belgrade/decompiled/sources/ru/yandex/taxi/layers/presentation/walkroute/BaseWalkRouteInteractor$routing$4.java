package ru.yandex.taxi.layers.presentation.walkroute;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "Lzzs;", "<destruct>", "Lcom/yandex/mapkit/transport/masstransit/Route;", "<anonymous>", "(Lkotlin/Pair;)Lcom/yandex/mapkit/transport/masstransit/Route;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.walkroute.BaseWalkRouteInteractor$routing$4", f = "BaseWalkRouteInteractor.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BaseWalkRouteInteractor$routing$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWalkRouteInteractor$routing$4(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseWalkRouteInteractor$routing$4 baseWalkRouteInteractor$routing$4 = new BaseWalkRouteInteractor$routing$4(continuation, this.this$0);
        baseWalkRouteInteractor$routing$4.L$0 = obj;
        return baseWalkRouteInteractor$routing$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseWalkRouteInteractor$routing$4) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        zzs zzsVar = (zzs) pair.getFirst();
        zzs zzsVar2 = (zzs) pair.getSecond();
        e eVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        Object c = eVar.c(zzsVar, zzsVar2, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
