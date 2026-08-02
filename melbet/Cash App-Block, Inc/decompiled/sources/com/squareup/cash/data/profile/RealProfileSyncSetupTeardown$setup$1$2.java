package com.squareup.cash.data.profile;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealProfileSyncSetupTeardown$setup$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int I$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealProfileSyncSetupTeardown$setup$1$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new RealProfileSyncSetupTeardown$setup$1$2((RealProfileSyncSetupTeardown) obj2, continuation, 0);
            default:
                RealProfileSyncSetupTeardown$setup$1$2 realProfileSyncSetupTeardown$setup$1$2 = new RealProfileSyncSetupTeardown$setup$1$2((TextFieldCoreModifierNode) obj2, continuation, 1);
                realProfileSyncSetupTeardown$setup$1$2.label = ((Number) obj).intValue();
                return realProfileSyncSetupTeardown$setup$1$2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((RealProfileSyncSetupTeardown$setup$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                return ((RealProfileSyncSetupTeardown$setup$1$2) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:29:0x0057, B:30:0x005f, B:33:0x0064, B:34:0x0080, B:35:0x009b, B:37:0x00a7, B:38:0x00b3, B:56:0x008c, B:57:0x0097, B:47:0x0073, B:43:0x009a), top: B:23:0x004c, inners: #1, #2 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x007d -> B:32:0x0080). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        CursorAnimationState cursorAnimationState;
        int i2 = this.$r8$classId;
        Object obj2 = this.this$0;
        ?? r2 = "call to 'resume' before 'invoke' with coroutine";
        int i3 = 1;
        Continuation continuation = null;
        switch (i2) {
            case 0:
                RealProfileSyncSetupTeardown realProfileSyncSetupTeardown = (RealProfileSyncSetupTeardown) obj2;
                StateFlowImpl stateFlowImpl = realProfileSyncSetupTeardown.isDone;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                    try {
                    } catch (Exception e) {
                        if (r2 < 3) {
                            Timber.Forest.e("profileSyncer.refresh failed, trying again", new Object[0], e);
                        }
                        i = r2 + 1;
                    }
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        i = 1;
                        if (i < 4) {
                            RealProfileSyncer realProfileSyncer = realProfileSyncSetupTeardown.profileSyncer;
                            this.I$0 = i;
                            this.label = 1;
                            r2 = i;
                            if (realProfileSyncer.refresh(true, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            Boolean bool = Boolean.TRUE;
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, bool);
                        }
                        if (!((Boolean) stateFlowImpl.getValue()).booleanValue()) {
                        }
                        Boolean bool2 = Boolean.TRUE;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, bool2);
                        this.label = 2;
                        JobKt.awaitCancellation(this);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        return coroutineSingletons;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    int i5 = this.I$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        r2 = i5;
                        Boolean bool3 = Boolean.TRUE;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, bool3);
                        if (!((Boolean) stateFlowImpl.getValue()).booleanValue()) {
                            realProfileSyncSetupTeardown.errorReporter.report(new ProfileSyncError(), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                        }
                        Boolean bool22 = Boolean.TRUE;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, bool22);
                        this.label = 2;
                        JobKt.awaitCancellation(this);
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        return coroutineSingletons;
                    } catch (CancellationException e2) {
                        throw e2;
                    }
                } catch (Throwable th) {
                    Boolean bool4 = Boolean.FALSE;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, bool4);
                    throw th;
                }
            default:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.I$0;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Math.abs(this.label) == 1 && (cursorAnimationState = ((TextFieldCoreModifierNode) obj2).cursorAnimation) != null) {
                        this.I$0 = 1;
                        Object coroutineScope = JobKt.coroutineScope(new RealGcmRegistrar$unregister$2(cursorAnimationState, continuation, i3), this);
                        if (coroutineScope != obj3) {
                            coroutineScope = Unit.INSTANCE;
                        }
                        if (coroutineScope == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
