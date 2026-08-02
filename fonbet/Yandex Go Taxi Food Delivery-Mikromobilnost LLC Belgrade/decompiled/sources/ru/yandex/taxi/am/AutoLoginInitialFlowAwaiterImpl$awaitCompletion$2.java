package ru.yandex.taxi.am;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.AutoLoginState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ClidProvider.STATE, "Lru/yandex/taxi/AutoLoginState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.AutoLoginInitialFlowAwaiterImpl$awaitCompletion$2", f = "AutoLoginInitialFlowAwaiterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AutoLoginInitialFlowAwaiterImpl$awaitCompletion$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoLoginInitialFlowAwaiterImpl$awaitCompletion$2 autoLoginInitialFlowAwaiterImpl$awaitCompletion$2 = new AutoLoginInitialFlowAwaiterImpl$awaitCompletion$2(2, continuation);
        autoLoginInitialFlowAwaiterImpl$awaitCompletion$2.L$0 = obj;
        return autoLoginInitialFlowAwaiterImpl$awaitCompletion$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoLoginInitialFlowAwaiterImpl$awaitCompletion$2) create((AutoLoginState) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AutoLoginState autoLoginState = (AutoLoginState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf((autoLoginState == AutoLoginState.NOT_STARTED || autoLoginState == AutoLoginState.STARTED) ? false : true);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
