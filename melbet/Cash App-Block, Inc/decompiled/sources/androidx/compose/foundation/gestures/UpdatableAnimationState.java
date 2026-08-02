package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.MotionDurationScale;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class UpdatableAnimationState {
    public static final AnimationVector1D ZeroVector = new AnimationVector1D(RecyclerView.DECELERATION_RATE);
    public boolean isRunning;
    public long lastFrameTime = Long.MIN_VALUE;
    public AnimationVector1D lastVelocity = ZeroVector;
    public float value;
    public final VectorizedAnimationSpec vectorizedSpec;

    public UpdatableAnimationState(AnimationSpec animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(AnimatableKt.FloatToVector);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        if (r13 != androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (androidx.compose.runtime.Updater.getMonotonicFrameClock(r4.getContext()).withFrameNanos(r4, r9) == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a9 -> B:23:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateToZero(MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0, n$$ExternalSyntheticLambda1 n__externalsyntheticlambda1, ContinuationImpl continuationImpl) {
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$1;
        int i;
        AnimationVector1D animationVector1D;
        float f;
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$12;
        Function function;
        Function0 function0;
        try {
            if (continuationImpl instanceof UpdatableAnimationState$animateToZero$1) {
                updatableAnimationState$animateToZero$1 = (UpdatableAnimationState$animateToZero$1) continuationImpl;
                int i2 = updatableAnimationState$animateToZero$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    updatableAnimationState$animateToZero$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = updatableAnimationState$animateToZero$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = updatableAnimationState$animateToZero$1.label;
                    animationVector1D = ZeroVector;
                    int i3 = 1;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.isRunning) {
                            InlineClassHelperKt.throwIllegalStateException("animateToZero called while previous animation is running");
                        }
                        MotionDurationScale motionDurationScale = (MotionDurationScale) updatableAnimationState$animateToZero$1.getContext().get(Alignment.Companion.$$INSTANCE);
                        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
                        this.isRunning = true;
                        f = scaleFactor;
                        updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$1;
                        function = menuKt$$ExternalSyntheticLambda0;
                        function0 = n__externalsyntheticlambda1;
                        if (Math.abs(this.value) >= 0.01f) {
                            ThumbNode$$ExternalSyntheticLambda0 thumbNode$$ExternalSyntheticLambda0 = new ThumbNode$$ExternalSyntheticLambda0(this, f, function, i3);
                            updatableAnimationState$animateToZero$12.L$0 = function;
                            updatableAnimationState$animateToZero$12.L$1 = function0;
                            updatableAnimationState$animateToZero$12.F$0 = f;
                            updatableAnimationState$animateToZero$12.label = 1;
                            if (Updater.getMonotonicFrameClock(updatableAnimationState$animateToZero$12.getContext()).withFrameNanos(updatableAnimationState$animateToZero$12, thumbNode$$ExternalSyntheticLambda0) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            function0.invoke();
                        } else {
                            if (Math.abs(this.value) == RecyclerView.DECELERATION_RATE) {
                                this.lastFrameTime = Long.MIN_VALUE;
                                this.lastVelocity = animationVector1D;
                                this.isRunning = false;
                                return Unit.INSTANCE;
                            }
                            ClickableKt$$ExternalSyntheticLambda0 clickableKt$$ExternalSyntheticLambda0 = new ClickableKt$$ExternalSyntheticLambda0(19, this, function);
                            updatableAnimationState$animateToZero$12.L$0 = function0;
                            updatableAnimationState$animateToZero$12.L$1 = null;
                            updatableAnimationState$animateToZero$12.label = 2;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            function0 = (Function0) updatableAnimationState$animateToZero$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            function0.invoke();
                            this.lastFrameTime = Long.MIN_VALUE;
                            this.lastVelocity = animationVector1D;
                            this.isRunning = false;
                            return Unit.INSTANCE;
                        }
                        float f2 = updatableAnimationState$animateToZero$1.F$0;
                        Function0 function02 = updatableAnimationState$animateToZero$1.L$1;
                        Function function2 = (Function1) updatableAnimationState$animateToZero$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$1;
                        function0 = function02;
                        f = f2;
                        function = function2;
                        function0.invoke();
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.lastFrameTime = Long.MIN_VALUE;
            this.lastVelocity = animationVector1D;
            this.isRunning = false;
            throw th;
        }
        updatableAnimationState$animateToZero$1 = new UpdatableAnimationState$animateToZero$1(this, continuationImpl);
        Object obj2 = updatableAnimationState$animateToZero$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updatableAnimationState$animateToZero$1.label;
        animationVector1D = ZeroVector;
        int i32 = 1;
    }
}
