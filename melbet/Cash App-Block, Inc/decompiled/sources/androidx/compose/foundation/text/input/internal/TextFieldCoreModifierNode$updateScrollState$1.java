package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$updateScrollState$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ float $offsetDifference;
    public final /* synthetic */ Rect $rawCursorRect;
    public final /* synthetic */ boolean $shouldBringIntoView;
    public int label;
    public final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$updateScrollState$1(TextFieldCoreModifierNode textFieldCoreModifierNode, float f, boolean z, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.this$0 = textFieldCoreModifierNode;
        this.$offsetDifference = f;
        this.$shouldBringIntoView = z;
        this.$rawCursorRect = rect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.this$0, this.$offsetDifference, this.$shouldBringIntoView, this.$rawCursorRect, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r8.bringIntoView(r7.$rawCursorRect, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (app.cash.molecule.PlatformKt.scrollBy(r8, r1, r7) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        TextFieldCoreModifierNode textFieldCoreModifierNode = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ScrollState scrollState = textFieldCoreModifierNode.scrollState;
            float f = this.$offsetDifference;
            if (!Float.isNaN(f) && !Float.isInfinite(f)) {
                f = (float) (f > RecyclerView.DECELERATION_RATE ? Math.ceil(f) : Math.floor(f));
            }
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        if (this.$shouldBringIntoView) {
            BringIntoViewRequesterImpl bringIntoViewRequesterImpl = textFieldCoreModifierNode.textLayoutState.bringIntoViewRequester;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
