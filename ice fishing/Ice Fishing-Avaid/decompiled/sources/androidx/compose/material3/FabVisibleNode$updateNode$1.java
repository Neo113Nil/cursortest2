package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
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

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.FabVisibleNode$updateNode$1", f = "FloatingActionButton.kt", i = {}, l = {1244}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class FabVisibleNode$updateNode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnimationSpec<Float> $scaleAnimationSpec;
    final /* synthetic */ boolean $visible;
    int label;
    final /* synthetic */ FabVisibleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FabVisibleNode$updateNode$1(FabVisibleNode fabVisibleNode, boolean z, AnimationSpec<Float> animationSpec, Continuation<? super FabVisibleNode$updateNode$1> continuation) {
        super(2, continuation);
        this.this$0 = fabVisibleNode;
        this.$visible = z;
        this.$scaleAnimationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FabVisibleNode$updateNode$1(this.this$0, this.$visible, this.$scaleAnimationSpec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FabVisibleNode$updateNode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            animatable = this.this$0.scaleAnimatable;
            Float boxFloat = Boxing.boxFloat(this.$visible ? 1.0f : 0.0f);
            FiniteAnimationSpec finiteAnimationSpec = this.$scaleAnimationSpec;
            if (finiteAnimationSpec == null) {
                finiteAnimationSpec = ((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getMotionScheme().fastSpatialSpec();
            }
            this.label = 1;
            if (Animatable.animateTo$default(animatable, boxFloat, finiteAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
