package androidx.work.impl;

import androidx.work.Logger$LogcatLogger;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 extends SuspendLambda implements Function4 {
    public /* synthetic */ long J$0;
    public /* synthetic */ Throwable L$0;
    public int label;

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 = new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(4, (Continuation) obj4);
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.L$0 = (Throwable) obj2;
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.J$0 = longValue;
        return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Throwable th = this.L$0;
            long j = this.J$0;
            Logger$LogcatLogger.get().error(UnfinishedWorkListenerKt.TAG, "Cannot check for unfinished work", th);
            long min = Math.min(j * 30000, UnfinishedWorkListenerKt.MAX_DELAY_MS);
            this.label = 1;
            if (JobKt.delay(min, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Boolean.TRUE;
    }
}
