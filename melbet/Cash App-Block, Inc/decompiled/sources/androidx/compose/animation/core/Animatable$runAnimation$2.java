package androidx.compose.animation.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class Animatable$runAnimation$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ TargetBasedAnimation $animation;
    public final /* synthetic */ Function1 $block;
    public final /* synthetic */ Object $initialVelocity;
    public final /* synthetic */ long $startTime;
    public AnimationState L$0;
    public Ref$BooleanRef L$1;
    public int label;
    public final /* synthetic */ Animatable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(Animatable animatable, Object obj, TargetBasedAnimation targetBasedAnimation, long j, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.this$0 = animatable;
        this.$initialVelocity = obj;
        this.$animation = targetBasedAnimation;
        this.$startTime = j;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnimationState animationState;
        Ref$BooleanRef ref$BooleanRef;
        TargetBasedAnimation targetBasedAnimation = this.$animation;
        Animatable animatable = this.this$0;
        AnimationState animationState2 = animatable.internalState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                animationState2.velocityVector = (AnimationVector) animatable.typeConverter.convertToVector.invoke(this.$initialVelocity);
                animatable.targetValue$delegate.setValue(targetBasedAnimation.mutableTargetValue);
                animatable.isRunning$delegate.setValue(Boolean.TRUE);
                AnimationState animationState3 = new AnimationState(animationState2.typeConverter, animationState2.value$delegate.getValue(), AnimatableKt.copy(animationState2.velocityVector), animationState2.lastFrameTimeNanos, Long.MIN_VALUE, animationState2.isRunning);
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                long j = this.$startTime;
                HeartBeatInfoStorage$$ExternalSyntheticLambda0 heartBeatInfoStorage$$ExternalSyntheticLambda0 = new HeartBeatInfoStorage$$ExternalSyntheticLambda0(animatable, animationState3, this.$block, ref$BooleanRef2, 1);
                this.L$0 = animationState3;
                this.L$1 = ref$BooleanRef2;
                this.label = 1;
                if (AnimatableKt.animate(animationState3, targetBasedAnimation, j, heartBeatInfoStorage$$ExternalSyntheticLambda0, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                animationState = animationState3;
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$BooleanRef = this.L$1;
                animationState = this.L$0;
                SafeTrace.throwOnFailure(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            Animatable.access$endAnimation(animatable);
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e) {
            Animatable.access$endAnimation(animatable);
            throw e;
        }
    }
}
