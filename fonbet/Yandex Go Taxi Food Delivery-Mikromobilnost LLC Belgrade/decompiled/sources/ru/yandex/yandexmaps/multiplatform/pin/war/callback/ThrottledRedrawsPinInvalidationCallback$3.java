package ru.yandex.yandexmaps.multiplatform.pin.war.callback;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qwb0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lqwb0;", "it", "Lzy11;", "<anonymous>", "(Lqwb0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.callback.ThrottledRedrawsPinInvalidationCallback$3", f = "ThrottledRedrawsPinInvalidationCallback.kt", l = {41}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class ThrottledRedrawsPinInvalidationCallback$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrottledRedrawsPinInvalidationCallback$3(Continuation continuation, b bVar) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ThrottledRedrawsPinInvalidationCallback$3 throttledRedrawsPinInvalidationCallback$3 = new ThrottledRedrawsPinInvalidationCallback$3(continuation, this.this$0);
        throttledRedrawsPinInvalidationCallback$3.L$0 = obj;
        return throttledRedrawsPinInvalidationCallback$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ThrottledRedrawsPinInvalidationCallback$3) create((qwb0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qwb0 qwb0Var = (qwb0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0.b;
            this.L$0 = null;
            this.label = 1;
            if (aVar.invoke(qwb0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
