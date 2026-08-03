package androidx.compose.material3;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FloatingToolbar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior", f = "FloatingToolbar.kt", i = {0}, l = {664, 666}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"}, v = 1)
/* loaded from: classes.dex */
final class ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExitAlwaysFloatingToolbarScrollBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1(ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior, Continuation<? super ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1> continuation) {
        super(continuation);
        this.this$0 = exitAlwaysFloatingToolbarScrollBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo716onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
