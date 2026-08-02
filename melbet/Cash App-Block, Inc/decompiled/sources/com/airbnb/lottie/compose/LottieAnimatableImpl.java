package com.airbnb.lottie.compose;

import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jj\u0010P\u001a\u00020Q2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010+\u001a\u00020$2\u0006\u0010A\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010R\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$H\u0082@¢\u0006\u0002\u0010YJ\u0018\u0010Z\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$2\u0006\u0010[\u001a\u00020/H\u0002J0\u0010\\\u001a\u00020Q2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u00108\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010]\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020Q2\u0006\u00108\u001a\u00020\u0014H\u0002J\u0016\u0010`\u001a\u00020\u0014*\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001eR+\u0010 \u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000b\u001a\u0004\b \u0010\u001e\"\u0004\b!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u000b\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010+\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u000b\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R+\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020/8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u000b\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R+\u00108\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u000b\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010;R+\u0010=\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u000b\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010;R+\u0010A\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u000b\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010\"R+\u0010E\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u000b\u001a\u0004\bF\u0010\u0016\"\u0004\bG\u0010;R+\u0010I\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\u000b\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010\"R\u0014\u0010M\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatableImpl;", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "()V", "<set-?>", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "setClipSpec", "(Lcom/airbnb/lottie/compose/LottieClipSpec;)V", "clipSpec$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "getComposition", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition", "(Lcom/airbnb/lottie/LottieComposition;)V", "composition$delegate", "endProgress", "", "getEndProgress", "()F", "endProgress$delegate", "Landroidx/compose/runtime/State;", "frameSpeed", "getFrameSpeed", "frameSpeed$delegate", "isAtEnd", "", "()Z", "isAtEnd$delegate", "isPlaying", "setPlaying", "(Z)V", "isPlaying$delegate", "", "iteration", "getIteration", "()I", "setIteration", "(I)V", "iteration$delegate", "iterations", "getIterations", "setIterations", "iterations$delegate", "", "lastFrameNanos", "getLastFrameNanos", "()J", "setLastFrameNanos", "(J)V", "lastFrameNanos$delegate", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "progress", "getProgress", "setProgress", "(F)V", "progress$delegate", "progressRaw", "getProgressRaw", "setProgressRaw", "progressRaw$delegate", "reverseOnRepeat", "getReverseOnRepeat", "setReverseOnRepeat", "reverseOnRepeat$delegate", "speed", "getSpeed", "setSpeed", "speed$delegate", "useCompositionFrameRate", "getUseCompositionFrameRate", "setUseCompositionFrameRate", "useCompositionFrameRate$delegate", "value", "getValue", "()Ljava/lang/Float;", "animate", "", "initialProgress", "continueFromPreviousAnimate", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimationsDisabled", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFrame", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFrame", "frameNanos", "snapTo", "resetLastFrameNanos", "(Lcom/airbnb/lottie/LottieComposition;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProgress", "roundToCompositionFrameRate", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class LottieAnimatableImpl implements LottieAnimatable {

    /* renamed from: clipSpec$delegate, reason: from kotlin metadata */
    private final MutableState clipSpec;

    /* renamed from: composition$delegate, reason: from kotlin metadata */
    private final MutableState composition;

    /* renamed from: endProgress$delegate, reason: from kotlin metadata */
    private final State endProgress;

    /* renamed from: frameSpeed$delegate, reason: from kotlin metadata */
    private final State frameSpeed;

    /* renamed from: isAtEnd$delegate, reason: from kotlin metadata */
    private final State isAtEnd;

    /* renamed from: isPlaying$delegate, reason: from kotlin metadata */
    private final MutableState isPlaying;

    /* renamed from: iteration$delegate, reason: from kotlin metadata */
    private final MutableState iteration;

    /* renamed from: iterations$delegate, reason: from kotlin metadata */
    private final MutableState iterations;

    /* renamed from: lastFrameNanos$delegate, reason: from kotlin metadata */
    private final MutableState lastFrameNanos;
    private final MutatorMutex mutex;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final MutableState progress;

    /* renamed from: progressRaw$delegate, reason: from kotlin metadata */
    private final MutableState progressRaw;

    /* renamed from: reverseOnRepeat$delegate, reason: from kotlin metadata */
    private final MutableState reverseOnRepeat;

    /* renamed from: speed$delegate, reason: from kotlin metadata */
    private final MutableState speed;

    /* renamed from: useCompositionFrameRate$delegate, reason: from kotlin metadata */
    private final MutableState useCompositionFrameRate;

    public LottieAnimatableImpl() {
        Boolean bool = Boolean.FALSE;
        this.isPlaying = Updater.mutableStateOf$default(bool);
        this.iteration = Updater.mutableStateOf$default(1);
        this.iterations = Updater.mutableStateOf$default(1);
        this.reverseOnRepeat = Updater.mutableStateOf$default(bool);
        this.clipSpec = Updater.mutableStateOf$default(null);
        this.speed = Updater.mutableStateOf$default(Float.valueOf(1.0f));
        this.useCompositionFrameRate = Updater.mutableStateOf$default(bool);
        this.frameSpeed = Updater.derivedStateOf(new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$frameSpeed$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf((LottieAnimatableImpl.this.getReverseOnRepeat() && LottieAnimatableImpl.this.getIteration() % 2 == 0) ? -LottieAnimatableImpl.this.getSpeed() : LottieAnimatableImpl.this.getSpeed());
            }
        });
        this.composition = Updater.mutableStateOf$default(null);
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        this.progressRaw = Updater.mutableStateOf$default(valueOf);
        this.progress = Updater.mutableStateOf$default(valueOf);
        this.lastFrameNanos = Updater.mutableStateOf$default(Long.MIN_VALUE);
        this.endProgress = Updater.derivedStateOf(new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$endProgress$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                LottieComposition composition = LottieAnimatableImpl.this.getComposition();
                float f = RecyclerView.DECELERATION_RATE;
                if (composition != null) {
                    float speed = LottieAnimatableImpl.this.getSpeed();
                    LottieAnimatableImpl lottieAnimatableImpl = LottieAnimatableImpl.this;
                    if (speed < RecyclerView.DECELERATION_RATE) {
                        LottieClipSpec clipSpec = lottieAnimatableImpl.getClipSpec();
                        if (clipSpec != null) {
                            f = clipSpec.getMinProgress$lottie_compose_release(composition);
                        }
                    } else {
                        LottieClipSpec clipSpec2 = lottieAnimatableImpl.getClipSpec();
                        f = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
                    }
                }
                return Float.valueOf(f);
            }
        });
        this.isAtEnd = Updater.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$isAtEnd$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z;
                float endProgress;
                if (LottieAnimatableImpl.this.getIteration() == LottieAnimatableImpl.this.getIterations()) {
                    float progress = LottieAnimatableImpl.this.getProgress();
                    endProgress = LottieAnimatableImpl.this.getEndProgress();
                    if (progress == endProgress) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        });
        this.mutex = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doFrame(final int i, Continuation<? super Boolean> continuation) {
        if (i == Integer.MAX_VALUE) {
            return ArcSplineKt.withInfiniteAnimationFrameNanos(continuation, new Function1<Long, Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final Boolean invoke(long j) {
                    boolean onFrame;
                    onFrame = LottieAnimatableImpl.this.onFrame(i, j);
                    return Boolean.valueOf(onFrame);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).longValue());
                }
            });
        }
        return Updater.getMonotonicFrameClock(continuation.getContext()).withFrameNanos(continuation, new Function1<Long, Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Boolean invoke(long j) {
                boolean onFrame;
                onFrame = LottieAnimatableImpl.this.onFrame(i, j);
                return Boolean.valueOf(onFrame);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getEndProgress() {
        return ((Number) this.endProgress.getValue()).floatValue();
    }

    private final float getFrameSpeed() {
        return ((Number) this.frameSpeed.getValue()).floatValue();
    }

    private final float getProgressRaw() {
        return ((Number) this.progressRaw.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onFrame(int iterations, long frameNanos) {
        LottieComposition composition = getComposition();
        if (composition == null) {
            return true;
        }
        long lastFrameNanos = getLastFrameNanos() == Long.MIN_VALUE ? 0L : frameNanos - getLastFrameNanos();
        setLastFrameNanos(frameNanos);
        LottieClipSpec clipSpec = getClipSpec();
        float minProgress$lottie_compose_release = clipSpec != null ? clipSpec.getMinProgress$lottie_compose_release(composition) : 0.0f;
        LottieClipSpec clipSpec2 = getClipSpec();
        float maxProgress$lottie_compose_release = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
        float duration = ((lastFrameNanos / 1000000) / composition.getDuration()) * getFrameSpeed();
        float progressRaw = getFrameSpeed() < RecyclerView.DECELERATION_RATE ? minProgress$lottie_compose_release - (getProgressRaw() + duration) : (getProgressRaw() + duration) - maxProgress$lottie_compose_release;
        if (minProgress$lottie_compose_release == maxProgress$lottie_compose_release) {
            updateProgress(minProgress$lottie_compose_release);
            return false;
        }
        if (progressRaw < RecyclerView.DECELERATION_RATE) {
            updateProgress(RangesKt___RangesKt.coerceIn(getProgressRaw(), minProgress$lottie_compose_release, maxProgress$lottie_compose_release) + duration);
        } else {
            float f = maxProgress$lottie_compose_release - minProgress$lottie_compose_release;
            int i = (int) (progressRaw / f);
            int i2 = i + 1;
            if (getIteration() + i2 > iterations) {
                updateProgress(getEndProgress());
                setIteration(iterations);
                return false;
            }
            setIteration(getIteration() + i2);
            float f2 = progressRaw - (i * f);
            updateProgress(getFrameSpeed() < RecyclerView.DECELERATION_RATE ? maxProgress$lottie_compose_release - f2 : minProgress$lottie_compose_release + f2);
        }
        return true;
    }

    private final float roundToCompositionFrameRate(float f, LottieComposition lottieComposition) {
        return lottieComposition == null ? f : f - (f % (1.0f / lottieComposition.getFrameRate()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipSpec(LottieClipSpec lottieClipSpec) {
        this.clipSpec.setValue(lottieClipSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComposition(LottieComposition lottieComposition) {
        this.composition.setValue(lottieComposition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIteration(int i) {
        this.iteration.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIterations(int i) {
        this.iterations.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastFrameNanos(long j) {
        this.lastFrameNanos.setValue(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaying(boolean z) {
        this.isPlaying.setValue(Boolean.valueOf(z));
    }

    private void setProgress(float f) {
        this.progress.setValue(Float.valueOf(f));
    }

    private final void setProgressRaw(float f) {
        this.progressRaw.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReverseOnRepeat(boolean z) {
        this.reverseOnRepeat.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(float f) {
        this.speed.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCompositionFrameRate(boolean z) {
        this.useCompositionFrameRate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgress(float progress) {
        setProgressRaw(progress);
        if (getUseCompositionFrameRate()) {
            progress = roundToCompositionFrameRate(progress, getComposition());
        }
        setProgress(progress);
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object animate(LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, Continuation<? super Unit> continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutex, new LottieAnimatableImpl$animate$2(this, i, i2, z, f, lottieClipSpec, lottieComposition, f2, z4, z2, lottieCancellationBehavior, null), continuation);
        return mutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? mutate$default : Unit.INSTANCE;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieClipSpec getClipSpec() {
        return (LottieClipSpec) this.clipSpec.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieComposition getComposition() {
        return (LottieComposition) this.composition.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIteration() {
        return ((Number) this.iteration.getValue()).intValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIterations() {
        return ((Number) this.iterations.getValue()).intValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public long getLastFrameNanos() {
        return ((Number) this.lastFrameNanos.getValue()).longValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getReverseOnRepeat() {
        return ((Boolean) this.reverseOnRepeat.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getSpeed() {
        return ((Number) this.speed.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getUseCompositionFrameRate() {
        return ((Boolean) this.useCompositionFrameRate.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable, com.airbnb.lottie.compose.LottieAnimationState, androidx.compose.runtime.State
    public Float getValue() {
        return Float.valueOf(getProgress());
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isAtEnd() {
        return ((Boolean) this.isAtEnd.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isPlaying() {
        return ((Boolean) this.isPlaying.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object snapTo(LottieComposition lottieComposition, float f, int i, boolean z, Continuation<? super Unit> continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutex, new LottieAnimatableImpl$snapTo$2(this, lottieComposition, f, i, z, null), continuation);
        return mutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? mutate$default : Unit.INSTANCE;
    }
}
