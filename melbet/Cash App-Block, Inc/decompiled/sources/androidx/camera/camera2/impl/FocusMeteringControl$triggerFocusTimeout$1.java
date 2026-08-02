package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class FocusMeteringControl$triggerFocusTimeout$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CompletableDeferredImpl $resultToComplete;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusMeteringControl$triggerFocusTimeout$1(CompletableDeferredImpl completableDeferredImpl, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$resultToComplete = completableDeferredImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CompletableDeferredImpl completableDeferredImpl = this.$resultToComplete;
        switch (i) {
            case 0:
                return new FocusMeteringControl$triggerFocusTimeout$1(completableDeferredImpl, continuation, 0);
            case 1:
                return new FocusMeteringControl$triggerFocusTimeout$1(completableDeferredImpl, continuation, 1);
            default:
                return new FocusMeteringControl$triggerFocusTimeout$1(completableDeferredImpl, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FocusMeteringControl$triggerFocusTimeout$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CompletableDeferredImpl completableDeferredImpl = this.$resultToComplete;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(5000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "triggerFocusTimeout: completing with focus result unsuccessful after 5000 ms");
                }
                completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(new Transition.AnonymousClass1());
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (completableDeferredImpl.awaitInternal(this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object awaitInternal = completableDeferredImpl.awaitInternal(this);
                    return awaitInternal == coroutineSingletons3 ? coroutineSingletons3 : awaitInternal;
                }
                if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
