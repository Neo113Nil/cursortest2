package androidx.compose.material3;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ButtonGroup.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.ButtonGroupKt", f = "ButtonGroup.kt", i = {0, 1, 1}, l = {1343, 1345}, m = "waitUntil", n = {"condition", "condition", "initialTimeMillis"}, s = {"L$0", "L$0", "J$0"}, v = 1)
/* loaded from: classes.dex */
final class ButtonGroupKt$waitUntil$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ButtonGroupKt$waitUntil$1(Continuation<? super ButtonGroupKt$waitUntil$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object waitUntil;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        waitUntil = ButtonGroupKt.waitUntil(null, this);
        return waitUntil;
    }
}
