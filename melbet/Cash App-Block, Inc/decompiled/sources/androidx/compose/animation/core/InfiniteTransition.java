package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class InfiniteTransition {
    public final MutableVector _animations = new MutableVector(0, new TransitionAnimationState[16]);
    public final ParcelableSnapshotMutableState refreshChildNeeded$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public long startTimeNanos = Long.MIN_VALUE;
    public final ParcelableSnapshotMutableState isRunning$delegate = Updater.mutableStateOf$default(Boolean.TRUE);

    public final class TransitionAnimationState implements State {
        public TargetBasedAnimation animation;
        public Number initialValue;
        public boolean isFinished;
        public long playTimeNanosOffset;
        public boolean startOnTheNextFrame;
        public Number targetValue;
        public final TwoWayConverterImpl typeConverter;
        public final ParcelableSnapshotMutableState value$delegate;

        public TransitionAnimationState(Number number, Number number2, TwoWayConverterImpl twoWayConverterImpl, InfiniteRepeatableSpec infiniteRepeatableSpec) {
            this.initialValue = number;
            this.targetValue = number2;
            this.typeConverter = twoWayConverterImpl;
            this.value$delegate = Updater.mutableStateOf$default(number);
            this.animation = new TargetBasedAnimation(infiniteRepeatableSpec, twoWayConverterImpl, this.initialValue, this.targetValue, null);
        }

        @Override // androidx.compose.runtime.State
        public final Object getValue() {
            return this.value$delegate.getValue();
        }
    }

    public final void run$animation_core(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-318043801);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (((Boolean) this.isRunning$delegate.getValue()).booleanValue() || ((Boolean) this.refreshChildNeeded$delegate.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(-144841960);
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new FlowExtKt$simpleScan$1(mutableState, this, continuation, 9);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, this, (Function2) rememberedValue2);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-143455237);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HintHandler$$ExternalSyntheticLambda0(this, i, i3);
        }
    }
}
