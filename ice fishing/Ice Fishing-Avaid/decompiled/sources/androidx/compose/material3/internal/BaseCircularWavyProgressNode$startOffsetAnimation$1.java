package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CircularWavyProgressModifiers.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.internal.BaseCircularWavyProgressNode$startOffsetAnimation$1", f = "CircularWavyProgressModifiers.kt", i = {}, l = {365}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class BaseCircularWavyProgressNode$startOffsetAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $durationMillis;
    final /* synthetic */ float $startOffset;
    int label;
    final /* synthetic */ BaseCircularWavyProgressNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCircularWavyProgressNode$startOffsetAnimation$1(BaseCircularWavyProgressNode baseCircularWavyProgressNode, float f, int i, Continuation<? super BaseCircularWavyProgressNode$startOffsetAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = baseCircularWavyProgressNode;
        this.$startOffset = f;
        this.$durationMillis = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseCircularWavyProgressNode$startOffsetAnimation$1(this.this$0, this.$startOffset, this.$durationMillis, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseCircularWavyProgressNode$startOffsetAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVector1D> offsetAnimatable = this.this$0.getOffsetAnimatable();
            if (offsetAnimatable == null) {
                return Unit.INSTANCE;
            }
            offsetAnimatable.updateBounds(Boxing.boxFloat(this.$startOffset), Boxing.boxFloat(this.$startOffset + 1.0f));
            Float boxFloat = Boxing.boxFloat(this.$startOffset + 1.0f);
            InfiniteRepeatableSpec m238infiniteRepeatable9IiC70o$default = AnimationSpecKt.m238infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(this.$durationMillis, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null);
            final BaseCircularWavyProgressNode baseCircularWavyProgressNode = this.this$0;
            this.label = 1;
            if (Animatable.animateTo$default(offsetAnimatable, boxFloat, m238infiniteRepeatable9IiC70o$default, null, new Function1() { // from class: androidx.compose.material3.internal.BaseCircularWavyProgressNode$startOffsetAnimation$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = BaseCircularWavyProgressNode$startOffsetAnimation$1.invokeSuspend$lambda$0(BaseCircularWavyProgressNode.this, (Animatable) obj2);
                    return invokeSuspend$lambda$0;
                }
            }, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(BaseCircularWavyProgressNode baseCircularWavyProgressNode, Animatable animatable) {
        baseCircularWavyProgressNode.getWaveOffsetState().setFloatValue(((Number) animatable.getValue()).floatValue() % 1.0f);
        return Unit.INSTANCE;
    }
}
