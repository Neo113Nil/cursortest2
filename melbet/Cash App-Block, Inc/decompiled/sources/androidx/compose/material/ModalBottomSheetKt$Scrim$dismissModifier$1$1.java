package androidx.compose.material;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda16;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ModalBottomSheetKt$Scrim$dismissModifier$1$1 implements PointerInputEventHandler {
    public final /* synthetic */ Function0 $onDismiss;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ModalBottomSheetKt$Scrim$dismissModifier$1$1(int i, Function0 function0) {
        this.$r8$classId = i;
        this.$onDismiss = function0;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        Function0 function0 = this.$onDismiss;
        switch (i) {
            case 0:
                Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new LocalMapKt$$ExternalSyntheticLambda10(4, function0), continuation, 7);
                if (detectTapGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object detectTapGestures$default2 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new LocalMapKt$$ExternalSyntheticLambda10(20, function0), continuation, 7);
                if (detectTapGestures$default2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object detectTapGestures$default3 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new CardTransitionKt$$ExternalSyntheticLambda16(3, function0), continuation, 7);
                if (detectTapGestures$default3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object detectTapGestures$default4 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new CardTransitionKt$$ExternalSyntheticLambda16(4, function0), continuation, 7);
                if (detectTapGestures$default4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object detectTapGestures$default5 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new CardTransitionKt$$ExternalSyntheticLambda16(6, function0), continuation, 7);
                if (detectTapGestures$default5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
