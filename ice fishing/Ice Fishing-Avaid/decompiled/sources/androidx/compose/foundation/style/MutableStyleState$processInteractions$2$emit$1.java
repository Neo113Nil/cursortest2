package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StyleState.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.foundation.style.MutableStyleState$processInteractions$2", f = "StyleState.kt", i = {0}, l = {626}, m = "emit", n = {"interaction"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class MutableStyleState$processInteractions$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MutableStyleState$processInteractions$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutableStyleState$processInteractions$2$emit$1(MutableStyleState$processInteractions$2<? super T> mutableStyleState$processInteractions$2, Continuation<? super MutableStyleState$processInteractions$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = mutableStyleState$processInteractions$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Interaction) null, (Continuation<? super Unit>) this);
    }
}
