package androidx.compose.material3;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FloatingToolbar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.FloatingToolbarKt", f = "FloatingToolbar.kt", i = {0, 0, 0, 1}, l = {1508, 1523}, m = "settleFloatingToolbar", n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, s = {"L$0", "L$1", "L$2", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class FloatingToolbarKt$settleFloatingToolbar$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    FloatingToolbarKt$settleFloatingToolbar$1(Continuation<? super FloatingToolbarKt$settleFloatingToolbar$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        obj2 = FloatingToolbarKt.settleFloatingToolbar(null, 0.0f, null, null, this);
        return obj2;
    }
}
