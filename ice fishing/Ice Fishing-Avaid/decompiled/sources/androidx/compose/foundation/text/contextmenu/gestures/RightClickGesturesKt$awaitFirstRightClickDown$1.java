package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.view.MotionEventCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RightClickGestures.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt", f = "RightClickGestures.kt", i = {0}, l = {MotionEventCompat.AXIS_GENERIC_14}, m = "awaitFirstRightClickDown", n = {"$this$awaitFirstRightClickDown"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class RightClickGesturesKt$awaitFirstRightClickDown$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RightClickGesturesKt$awaitFirstRightClickDown$1(Continuation<? super RightClickGesturesKt$awaitFirstRightClickDown$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitFirstRightClickDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitFirstRightClickDown = RightClickGesturesKt.awaitFirstRightClickDown(null, this);
        return awaitFirstRightClickDown;
    }
}
