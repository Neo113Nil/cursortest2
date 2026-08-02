package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class SelectionContainerKt$SelectionContainer$5$1$1$1$1$1$1 implements PointerInputEventHandler {
    public final /* synthetic */ TextDragObserver $observer;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SelectionContainerKt$SelectionContainer$5$1$1$1$1$1$1(TextDragObserver textDragObserver, int i) {
        this.$r8$classId = i;
        this.$observer = textDragObserver;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        TextDragObserver textDragObserver = this.$observer;
        switch (i) {
            case 0:
                Object detectDownAndDragGesturesWithObserver = KeyMappingKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, continuation);
                if (detectDownAndDragGesturesWithObserver != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object detectDownAndDragGesturesWithObserver2 = KeyMappingKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, continuation);
                if (detectDownAndDragGesturesWithObserver2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
