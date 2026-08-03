package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.graphics.shapes.Morph;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoadingIndicator.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1", f = "LoadingIndicator.kt", i = {}, l = {394, 400}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $currentMorphIndex$delegate;
    final /* synthetic */ SpringSpec<Float> $morphAnimationSpec;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $morphProgress;
    final /* synthetic */ MutableFloatState $morphRotationTargetAngle$delegate;
    final /* synthetic */ List<Morph> $morphSequence;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1(Animatable<Float, AnimationVector1D> animatable, SpringSpec<Float> springSpec, List<Morph> list, MutableIntState mutableIntState, MutableFloatState mutableFloatState, Continuation<? super LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1> continuation) {
        super(2, continuation);
        this.$morphProgress = animatable;
        this.$morphAnimationSpec = springSpec;
        this.$morphSequence = list;
        this.$currentMorphIndex$delegate = mutableIntState;
        this.$morphRotationTargetAngle$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1(this.$morphProgress, this.$morphAnimationSpec, this.$morphSequence, this.$currentMorphIndex$delegate, this.$morphRotationTargetAngle$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (r12.$morphProgress.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), r12) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r13 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int LoadingIndicatorImpl_eopBjH0$lambda$9;
        float LoadingIndicatorImpl_eopBjH0$lambda$5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = Animatable.animateTo$default(this.$morphProgress, Boxing.boxFloat(1.0f), this.$morphAnimationSpec, null, null, this, 12, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutableFloatState mutableFloatState = this.$morphRotationTargetAngle$delegate;
                LoadingIndicatorImpl_eopBjH0$lambda$5 = LoadingIndicatorKt.LoadingIndicatorImpl_eopBjH0$lambda$5(mutableFloatState);
                mutableFloatState.setFloatValue((LoadingIndicatorImpl_eopBjH0$lambda$5 + 90.0f) % 360.0f);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((AnimationResult) obj).getEndReason() == AnimationEndReason.Finished) {
            MutableIntState mutableIntState = this.$currentMorphIndex$delegate;
            LoadingIndicatorImpl_eopBjH0$lambda$9 = LoadingIndicatorKt.LoadingIndicatorImpl_eopBjH0$lambda$9(mutableIntState);
            mutableIntState.setIntValue((LoadingIndicatorImpl_eopBjH0$lambda$9 + 1) % this.$morphSequence.size());
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
