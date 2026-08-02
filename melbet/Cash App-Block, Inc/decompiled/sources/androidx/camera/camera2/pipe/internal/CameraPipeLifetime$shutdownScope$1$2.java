package androidx.camera.camera2.pipe.internal;

import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CameraPipeLifetime$shutdownScope$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CameraPipeLifetime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraPipeLifetime$shutdownScope$1$2(CameraPipeLifetime cameraPipeLifetime, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cameraPipeLifetime;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CameraPipeLifetime cameraPipeLifetime = this.this$0;
        switch (i) {
            case 0:
                return new CameraPipeLifetime$shutdownScope$1$2(cameraPipeLifetime, continuation, 0);
            default:
                return new CameraPipeLifetime$shutdownScope$1$2(cameraPipeLifetime, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CameraPipeLifetime$shutdownScope$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CameraPipeLifetime cameraPipeLifetime = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CameraPipeLifetime$shutdownScope$1$2 cameraPipeLifetime$shutdownScope$1$2 = new CameraPipeLifetime$shutdownScope$1$2(cameraPipeLifetime, continuation, i2);
                this.label = 1;
                Object withTimeoutOrNull = JobKt.withTimeoutOrNull(3000L, cameraPipeLifetime$shutdownScope$1$2, this);
                return withTimeoutOrNull == coroutineSingletons ? coroutineSingletons : withTimeoutOrNull;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Log.d("CXCP", "Cancelling CameraPipe root Job...");
                    Job job = cameraPipeLifetime.cameraPipeJob;
                    this.label = 1;
                    if (JobKt.cancelAndJoin(job, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
