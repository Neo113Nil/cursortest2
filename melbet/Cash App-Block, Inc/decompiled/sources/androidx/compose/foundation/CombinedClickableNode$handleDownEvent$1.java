package androidx.compose.foundation;

import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CombinedClickableNode$handleDownEvent$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CombinedClickableNode$handleDownEvent$1(CombinedClickableNode combinedClickableNode, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = combinedClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CombinedClickableNode combinedClickableNode = this.this$0;
        switch (i) {
            case 0:
                return new CombinedClickableNode$handleDownEvent$1(combinedClickableNode, continuation, 0);
            case 1:
                return new CombinedClickableNode$handleDownEvent$1(combinedClickableNode, continuation, 1);
            default:
                return new CombinedClickableNode$handleDownEvent$1(combinedClickableNode, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CombinedClickableNode$handleDownEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CombinedClickableNode combinedClickableNode = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long longPressTimeoutMillis = ((ViewConfiguration) DepthSortedSetKt.currentValueOf(combinedClickableNode, CompositionLocalsKt.LocalViewConfiguration)).getLongPressTimeoutMillis();
                    this.label = 1;
                    if (JobKt.delay(longPressTimeoutMillis, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                Function0 function0 = combinedClickableNode.onLongClick;
                if (function0 != null) {
                    function0.invoke();
                }
                if (combinedClickableNode.hapticFeedbackEnabled) {
                    ((PlatformHapticFeedback) DepthSortedSetKt.currentValueOf(combinedClickableNode, CompositionLocalsKt.LocalHapticFeedback)).m769performHapticFeedbackCdsT49E(0);
                }
                combinedClickableNode.longPressTriggered = true;
                StandaloneCoroutine standaloneCoroutine = combinedClickableNode.tapJob;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                combinedClickableNode.tapJob = null;
                combinedClickableNode.longPressJob = null;
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long longPressTimeoutMillis2 = ((ViewConfiguration) DepthSortedSetKt.currentValueOf(combinedClickableNode, CompositionLocalsKt.LocalViewConfiguration)).getLongPressTimeoutMillis();
                    this.label = 1;
                    if (JobKt.delay(longPressTimeoutMillis2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                Function0 function02 = combinedClickableNode.onLongClick;
                if (function02 != null) {
                    function02.invoke();
                }
                if (combinedClickableNode.hapticFeedbackEnabled) {
                    ((PlatformHapticFeedback) DepthSortedSetKt.currentValueOf(combinedClickableNode, CompositionLocalsKt.LocalHapticFeedback)).m769performHapticFeedbackCdsT49E(0);
                }
                combinedClickableNode.indirectLongPressTriggered = true;
                StandaloneCoroutine standaloneCoroutine2 = combinedClickableNode.indirectTapJob;
                if (standaloneCoroutine2 != null) {
                    standaloneCoroutine2.cancel(null);
                }
                combinedClickableNode.indirectTapJob = null;
                combinedClickableNode.indirectLongPressJob = null;
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long longPressTimeoutMillis3 = ((ViewConfiguration) DepthSortedSetKt.currentValueOf(combinedClickableNode, CompositionLocalsKt.LocalViewConfiguration)).getLongPressTimeoutMillis();
                    this.label = 1;
                    if (JobKt.delay(longPressTimeoutMillis3, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                Function0 function03 = combinedClickableNode.onLongClick;
                if (function03 != null) {
                    function03.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
