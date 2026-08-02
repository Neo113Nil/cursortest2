package ru.yandex.taxi.masstransit.stoproute.interactor;

import defpackage.c4l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/transport/masstransit/ThreadInfo;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/transport/masstransit/ThreadInfo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.interactor.MtStopRouteInfoInteractor$requestRouteInfo$2$thread$1", f = "MtStopRouteInfoInteractor.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteInfoInteractor$requestRouteInfo$2$thread$1 extends SuspendLambda implements wls {
    final /* synthetic */ c4l0 $fromStopParams;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteInfoInteractor$requestRouteInfo$2$thread$1(a aVar, c4l0 c4l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$fromStopParams = c4l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopRouteInfoInteractor$requestRouteInfo$2$thread$1(this.this$0, this.$fromStopParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopRouteInfoInteractor$requestRouteInfo$2$thread$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.masstransit.datasource.thread.a aVar = this.this$0.b;
        String str = this.$fromStopParams.c;
        this.label = 1;
        Object b = aVar.b(str, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
