package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommonContextMenuArea.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt", f = "CommonContextMenuArea.kt", i = {0}, l = {212}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    CommonContextMenuAreaKt$getContextMenuItemsAvailability$2(Continuation<? super CommonContextMenuAreaKt$getContextMenuItemsAvailability$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CommonContextMenuAreaKt.getContextMenuItemsAvailability((TextFieldSelectionManager) null, this);
    }
}
