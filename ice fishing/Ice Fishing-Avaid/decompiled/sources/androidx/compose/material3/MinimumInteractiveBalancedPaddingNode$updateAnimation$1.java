package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
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

/* compiled from: FloatingToolbar.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.MinimumInteractiveBalancedPaddingNode$updateAnimation$1", f = "FloatingToolbar.kt", i = {}, l = {2155, 2157}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class MinimumInteractiveBalancedPaddingNode$updateAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MinimumInteractiveBalancedPaddingNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MinimumInteractiveBalancedPaddingNode$updateAnimation$1(MinimumInteractiveBalancedPaddingNode minimumInteractiveBalancedPaddingNode, Continuation<? super MinimumInteractiveBalancedPaddingNode$updateAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = minimumInteractiveBalancedPaddingNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MinimumInteractiveBalancedPaddingNode$updateAnimation$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MinimumInteractiveBalancedPaddingNode$updateAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r13 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r13 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        Animatable animatable2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.getHasVisibleLeadingContent() || this.this$0.getHasVisibleTrailingContent()) {
                animatable = this.this$0.paddingAnimation;
                this.label = 2;
                obj = Animatable.animateTo$default(animatable, Boxing.boxFloat(0.0f), this.this$0.getAnimationSpec(), null, null, this, 12, null);
            } else {
                animatable2 = this.this$0.paddingAnimation;
                this.label = 1;
                obj = Animatable.animateTo$default(animatable2, Boxing.boxFloat(1.0f), this.this$0.getAnimationSpec(), null, null, this, 12, null);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
