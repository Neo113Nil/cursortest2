package com.squareup.cash.graphics.swampgl;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class EngineSurfaceViewTarget$destroyInternal$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ JobSupport $destroyJob;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EngineSurfaceViewTarget$destroyInternal$1(JobSupport jobSupport, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$destroyJob = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        JobSupport jobSupport = this.$destroyJob;
        switch (i) {
            case 0:
                return new EngineSurfaceViewTarget$destroyInternal$1(jobSupport, continuation, 0);
            default:
                return new EngineSurfaceViewTarget$destroyInternal$1(jobSupport, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((EngineSurfaceViewTarget$destroyInternal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        JobSupport jobSupport = this.$destroyJob;
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
                EngineSurfaceViewTarget$destroyInternal$1 engineSurfaceViewTarget$destroyInternal$1 = new EngineSurfaceViewTarget$destroyInternal$1(jobSupport, continuation, i2);
                this.label = 1;
                Object withTimeoutOrNull = JobKt.withTimeoutOrNull(100L, engineSurfaceViewTarget$destroyInternal$1, this);
                return withTimeoutOrNull == coroutineSingletons ? coroutineSingletons : withTimeoutOrNull;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (jobSupport.join(this) == coroutineSingletons2) {
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
