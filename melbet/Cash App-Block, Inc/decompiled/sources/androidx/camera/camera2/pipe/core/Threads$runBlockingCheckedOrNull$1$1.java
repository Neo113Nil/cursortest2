package androidx.camera.camera2.pipe.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Threads$runBlockingCheckedOrNull$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeferredCoroutine $result;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Threads$runBlockingCheckedOrNull$1$1(DeferredCoroutine deferredCoroutine, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$result = deferredCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        DeferredCoroutine deferredCoroutine = this.$result;
        switch (i) {
            case 0:
                return new Threads$runBlockingCheckedOrNull$1$1(deferredCoroutine, continuation, 0);
            default:
                return new Threads$runBlockingCheckedOrNull$1$1(deferredCoroutine, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((Threads$runBlockingCheckedOrNull$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        DeferredCoroutine deferredCoroutine = this.$result;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object awaitInternal = deferredCoroutine.awaitInternal(this);
                    return awaitInternal == coroutineSingletons ? coroutineSingletons : awaitInternal;
                }
                if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object awaitInternal2 = deferredCoroutine.awaitInternal(this);
                    return awaitInternal2 == coroutineSingletons2 ? coroutineSingletons2 : awaitInternal2;
                }
                if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
