package androidx.compose.animation.core;

import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.util.AndroidSystemCallbacks;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class Transition$animateTo$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public float F$0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(AndroidSystemCallbacks androidSystemCallbacks, float f, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.L$0 = androidSystemCallbacks;
        this.F$0 = f;
        this.this$0 = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1((Transition) obj2, continuation);
                transition$animateTo$1$1$1.L$0 = obj;
                return transition$animateTo$1$1$1;
            default:
                return new Transition$animateTo$1$1$1((AndroidSystemCallbacks) this.L$0, this.F$0, (AnimationSpec) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((Transition$animateTo$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final float durationScale;
        CoroutineScope coroutineScope;
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    durationScale = AnimatableKt.getDurationScale(coroutineScope2.getCoroutineContext());
                    coroutineScope = coroutineScope2;
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    durationScale = this.F$0;
                    coroutineScope = (CoroutineScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                while (JobKt.isActive(coroutineScope)) {
                    final Transition transition = (Transition) obj2;
                    Function1 function1 = new Function1() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            long longValue = ((Long) obj3).longValue();
                            Transition transition2 = Transition.this;
                            boolean isSeeking = transition2.isSeeking();
                            ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = transition2.startTimeNanos$delegate;
                            if (!isSeeking) {
                                if (parcelableSnapshotMutableLongState.getLongValue() == Long.MIN_VALUE) {
                                    parcelableSnapshotMutableLongState.setLongValue(longValue);
                                    ((ParcelableSnapshotMutableState) transition2.transitionState.$$delegate_0).setValue(Boolean.TRUE);
                                }
                                long longValue2 = longValue - parcelableSnapshotMutableLongState.getLongValue();
                                float f = durationScale;
                                if (f != RecyclerView.DECELERATION_RATE) {
                                    longValue2 = MathKt__MathJVMKt.roundToLong(longValue2 / f);
                                }
                                transition2.setPlayTimeNanos(longValue2);
                                transition2.onFrame$animation_core(longValue2, f == RecyclerView.DECELERATION_RATE);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = coroutineScope;
                    this.F$0 = durationScale;
                    this.label = 1;
                    if (Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, function1) == coroutineSingletons) {
                        break;
                    }
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default((Animatable) ((AndroidSystemCallbacks) this.L$0).activityCallbacks, new Float(this.F$0), (AnimationSpec) obj2, null, null, this, 12) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(Transition transition, Continuation continuation) {
        super(2, continuation);
        this.this$0 = transition;
    }
}
