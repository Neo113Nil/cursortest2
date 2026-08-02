package ru.yandex.taxi.am;

import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class t {
    public final r a;

    public t(r rVar) {
        this.a = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AutoLoginInitialFlowAwaiterImpl$awaitCompletion$1 autoLoginInitialFlowAwaiterImpl$awaitCompletion$1;
        int i;
        if (continuationImpl instanceof AutoLoginInitialFlowAwaiterImpl$awaitCompletion$1) {
            autoLoginInitialFlowAwaiterImpl$awaitCompletion$1 = (AutoLoginInitialFlowAwaiterImpl$awaitCompletion$1) continuationImpl;
            int i2 = autoLoginInitialFlowAwaiterImpl$awaitCompletion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLoginInitialFlowAwaiterImpl$awaitCompletion$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLoginInitialFlowAwaiterImpl$awaitCompletion$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLoginInitialFlowAwaiterImpl$awaitCompletion$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.flow.r0 r0Var = this.a.u;
                    AutoLoginInitialFlowAwaiterImpl$awaitCompletion$2 autoLoginInitialFlowAwaiterImpl$awaitCompletion$2 = new AutoLoginInitialFlowAwaiterImpl$awaitCompletion$2(2, null);
                    autoLoginInitialFlowAwaiterImpl$awaitCompletion$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(r0Var, autoLoginInitialFlowAwaiterImpl$awaitCompletion$2, autoLoginInitialFlowAwaiterImpl$awaitCompletion$1) == coroutineSingletons) {
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
        autoLoginInitialFlowAwaiterImpl$awaitCompletion$1 = new AutoLoginInitialFlowAwaiterImpl$awaitCompletion$1(this, continuationImpl);
        Object obj2 = autoLoginInitialFlowAwaiterImpl$awaitCompletion$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLoginInitialFlowAwaiterImpl$awaitCompletion$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
