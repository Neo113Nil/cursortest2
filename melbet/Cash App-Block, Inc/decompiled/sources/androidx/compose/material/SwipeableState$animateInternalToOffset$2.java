package androidx.compose.material;

import android.graphics.PointF;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.material3.SliderState$dragScope$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.score.views.ScoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $spec;
    public final /* synthetic */ float $target;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(Flow flow, HeatRenderer heatRenderer, float f, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.L$0 = flow;
        this.this$0 = heatRenderer;
        this.$target = f;
        this.$spec = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        float f = this.$target;
        Object obj2 = this.$spec;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2((DismissState) obj3, f, (AnimationSpec) obj2, continuation);
                swipeableState$animateInternalToOffset$2.L$0 = obj;
                return swipeableState$animateInternalToOffset$2;
            case 1:
                SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$22 = new SwipeableState$animateInternalToOffset$2(f, (AnimationSpec) obj2, (Ref$FloatRef) obj3, continuation);
                swipeableState$animateInternalToOffset$22.L$0 = obj;
                return swipeableState$animateInternalToOffset$22;
            default:
                return new SwipeableState$animateInternalToOffset$2((Flow) this.L$0, (HeatRenderer) obj3, this.$target, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((SwipeableState$animateInternalToOffset$2) create((SliderState$dragScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((SwipeableState$animateInternalToOffset$2) create((ScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((SwipeableState$animateInternalToOffset$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final float f = this.$target;
        Object obj2 = this.$spec;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                DismissState dismissState = (DismissState) obj3;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = dismissState.isAnimationRunning$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = dismissState.animationTarget;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SliderState$dragScope$1 sliderState$dragScope$1 = (SliderState$dragScope$1) this.L$0;
                        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                        ref$FloatRef.element = dismissState.absoluteOffset.getFloatValue();
                        parcelableSnapshotMutableState2.setValue(new Float(f));
                        parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                        SliderKt$animateToTarget$2$$ExternalSyntheticLambda0 sliderKt$animateToTarget$2$$ExternalSyntheticLambda0 = new SliderKt$animateToTarget$2$$ExternalSyntheticLambda0(sliderState$dragScope$1, ref$FloatRef, 1);
                        this.label = 1;
                        obj = Animatable.animateTo$default(AnimatableKt.Animatable(ref$FloatRef.element, 0.01f), new Float(f), (AnimationSpec) obj2, null, sliderKt$animateToTarget$2$$ExternalSyntheticLambda0, this, 4);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    parcelableSnapshotMutableState2.setValue(null);
                    parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    parcelableSnapshotMutableState2.setValue(null);
                    parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                    throw th;
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0 scoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0 = new ScoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0(1, (ScrollScope) this.L$0, (Ref$FloatRef) obj3);
                    this.label = 1;
                    if (AnimatableKt.animate$default(RecyclerView.DECELERATION_RATE, this.$target, (AnimationSpec) obj2, scoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0, this, 4) == coroutineSingletons2) {
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
                    Flow flow = (Flow) this.L$0;
                    final HeatRenderer heatRenderer = (HeatRenderer) obj3;
                    final MutableState mutableState = (MutableState) obj2;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$ThemedCardV2$1$1$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj4, Continuation continuation) {
                            PointF pointF = (PointF) obj4;
                            float f2 = pointF.x;
                            int i5 = CardStudioViewV2Kt.$r8$clinit;
                            MutableState mutableState2 = mutableState;
                            float intBitsToFloat = f2 - Float.intBitsToFloat((int) (((Offset) mutableState2.getValue()).packedValue >> 32));
                            HeatRenderer.this.applyHeat(pointF.y - Float.intBitsToFloat((int) (((Offset) mutableState2.getValue()).packedValue & BodyPartID.bodyIdMax)), f - intBitsToFloat);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(DismissState dismissState, float f, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dismissState;
        this.$target = f;
        this.$spec = animationSpec;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(float f, AnimationSpec animationSpec, Ref$FloatRef ref$FloatRef, Continuation continuation) {
        super(2, continuation);
        this.$target = f;
        this.$spec = animationSpec;
        this.this$0 = ref$FloatRef;
    }
}
