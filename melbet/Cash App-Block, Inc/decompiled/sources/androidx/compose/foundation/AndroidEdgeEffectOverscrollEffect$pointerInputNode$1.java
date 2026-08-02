package androidx.compose.foundation;

import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode;
import androidx.compose.foundation.text.handwriting.StylusHandwritingNode;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.redwood.compose.HostFocusDirectorKt$depthFirst$1;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzade;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect$pointerInputNode$1 implements PointerInputEventHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect$pointerInputNode$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        Continuation continuation2 = null;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new HostFocusDirectorKt$depthFirst$1((AndroidEdgeEffectOverscrollEffect) obj, continuation2, 1), continuation);
                if (awaitEachGesture != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object onRightClickDown = zzade.onRightClickDown(pointerInputScope, new GraphLoop$processingQueue$1((TextContextMenuGestureNode) obj), continuation);
                if (onRightClickDown != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object awaitEachGesture2 = Draggable2DKt.awaitEachGesture(pointerInputScope, new LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1((StylusHandwritingNode) obj, continuation2, 2), continuation);
                if (awaitEachGesture2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object coroutineScope = JobKt.coroutineScope(new AnimatedImageDecoder$wrapDrawable$2((TextFieldDecoratorModifierNode) obj, pointerInputScope, continuation2, 3), continuation);
                if (coroutineScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
