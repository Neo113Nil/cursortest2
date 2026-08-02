package ru.yandex.taxi.masstransit.stopbubble.interactor;

import defpackage.gl50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzy11;", "it", "Lpfu0;", "<anonymous>", "(V)Lru/yandex/taxi/masstransit/stopbubble/model/StopBubbleState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stopbubble.interactor.StopBubbleInteractor$stateFlow$2$1", f = "StopBubbleInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StopBubbleInteractor$stateFlow$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ gl50 $stopDto;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBubbleInteractor$stateFlow$2$1(a aVar, gl50 gl50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$stopDto = gl50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBubbleInteractor$stateFlow$2$1(this.this$0, this.$stopDto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBubbleInteractor$stateFlow$2$1) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        gl50 gl50Var = this.$stopDto;
        this.label = 1;
        Object a = a.a(aVar, gl50Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
