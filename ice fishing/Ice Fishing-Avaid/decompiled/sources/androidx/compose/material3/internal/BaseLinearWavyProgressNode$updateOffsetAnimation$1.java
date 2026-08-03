package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
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

/* compiled from: LinearWavyProgressModifiers.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.internal.BaseLinearWavyProgressNode$updateOffsetAnimation$1", f = "LinearWavyProgressModifiers.kt", i = {}, l = {313}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class BaseLinearWavyProgressNode$updateOffsetAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $durationMillis;
    int label;
    final /* synthetic */ BaseLinearWavyProgressNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseLinearWavyProgressNode$updateOffsetAnimation$1(BaseLinearWavyProgressNode baseLinearWavyProgressNode, int i, Continuation<? super BaseLinearWavyProgressNode$updateOffsetAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = baseLinearWavyProgressNode;
        this.$durationMillis = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseLinearWavyProgressNode$updateOffsetAnimation$1(this.this$0, this.$durationMillis, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseLinearWavyProgressNode$updateOffsetAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float floatValue = this.this$0.getWaveOffset().getFloatValue();
            Animatable Animatable$default = AnimatableKt.Animatable$default(floatValue, 0.0f, 2, null);
            float f = 1.0f + floatValue;
            Animatable$default.updateBounds(Boxing.boxFloat(floatValue), Boxing.boxFloat(f));
            Float boxFloat = Boxing.boxFloat(f);
            InfiniteRepeatableSpec m238infiniteRepeatable9IiC70o$default = AnimationSpecKt.m238infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(this.$durationMillis, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null);
            final BaseLinearWavyProgressNode baseLinearWavyProgressNode = this.this$0;
            this.label = 1;
            if (Animatable.animateTo$default(Animatable$default, boxFloat, m238infiniteRepeatable9IiC70o$default, null, new Function1() { // from class: androidx.compose.material3.internal.BaseLinearWavyProgressNode$updateOffsetAnimation$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = BaseLinearWavyProgressNode$updateOffsetAnimation$1.invokeSuspend$lambda$0(BaseLinearWavyProgressNode.this, (Animatable) obj2);
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
    public static final Unit invokeSuspend$lambda$0(BaseLinearWavyProgressNode baseLinearWavyProgressNode, Animatable animatable) {
        baseLinearWavyProgressNode.getWaveOffset().setFloatValue(((Number) animatable.getValue()).floatValue() % 1.0f);
        return Unit.INSTANCE;
    }
}
