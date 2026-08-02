package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import app.cash.local.presenters.brand.checkout.CheckoutTipStateKt$rememberCheckoutTipState$1$1;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class BasicTextFieldKt$TextFieldCursorHandle$2$1 implements PointerInputEventHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionState $selectionState;

    public /* synthetic */ BasicTextFieldKt$TextFieldCursorHandle$2$1(TextFieldSelectionState textFieldSelectionState, int i) {
        this.$r8$classId = i;
        this.$selectionState = textFieldSelectionState;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        TextFieldSelectionState textFieldSelectionState = this.$selectionState;
        switch (i) {
            case 0:
                textFieldSelectionState.getClass();
                Object coroutineScope = JobKt.coroutineScope(new AnimatedImageDecoder$wrapDrawable$2(textFieldSelectionState, pointerInputScope, (Continuation) null, 4), continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (coroutineScope != coroutineSingletons) {
                    coroutineScope = Unit.INSTANCE;
                }
                if (coroutineScope != coroutineSingletons) {
                    break;
                }
                break;
            case 1:
                textFieldSelectionState.getClass();
                Object coroutineScope2 = JobKt.coroutineScope(new CheckoutTipStateKt$rememberCheckoutTipState$1$1(textFieldSelectionState, pointerInputScope, true, (Continuation) null), continuation);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (coroutineScope2 != coroutineSingletons2) {
                    coroutineScope2 = Unit.INSTANCE;
                }
                if (coroutineScope2 != coroutineSingletons2) {
                    break;
                }
                break;
            default:
                textFieldSelectionState.getClass();
                Object coroutineScope3 = JobKt.coroutineScope(new CheckoutTipStateKt$rememberCheckoutTipState$1$1(textFieldSelectionState, pointerInputScope, false, (Continuation) null), continuation);
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (coroutineScope3 != coroutineSingletons3) {
                    coroutineScope3 = Unit.INSTANCE;
                }
                if (coroutineScope3 != coroutineSingletons3) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
