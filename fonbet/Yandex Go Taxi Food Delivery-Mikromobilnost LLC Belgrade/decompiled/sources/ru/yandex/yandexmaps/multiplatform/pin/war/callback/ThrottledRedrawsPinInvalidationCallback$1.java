package ru.yandex.yandexmaps.multiplatform.pin.war.callback;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lvpr;", "Lqwb0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.callback.ThrottledRedrawsPinInvalidationCallback$1", f = "ThrottledRedrawsPinInvalidationCallback.kt", l = {33}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class ThrottledRedrawsPinInvalidationCallback$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ThrottledRedrawsPinInvalidationCallback$1 throttledRedrawsPinInvalidationCallback$1 = new ThrottledRedrawsPinInvalidationCallback$1(2, continuation);
        throttledRedrawsPinInvalidationCallback$1.L$0 = obj;
        return throttledRedrawsPinInvalidationCallback$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ThrottledRedrawsPinInvalidationCallback$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(null, this) == coroutineSingletons) {
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
