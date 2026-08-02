package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.ui.node.DepthSortedSetKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes.dex */
public final class ToolbarRequesterImpl {
    public TextContextMenuToolbarHandlerNode toolbarHandlerNode;
    public ToolbarHandlerState toolbarHandlerState = ToolbarHandlerState.Uninitialized;

    public final void show() {
        TextContextMenuProvider textContextMenuProvider;
        if (this.toolbarHandlerState == ToolbarHandlerState.Uninitialized) {
            InlineClassHelperKt.throwIllegalStateException("ToolbarRequester is not initialized.");
        }
        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = this.toolbarHandlerNode;
        if (textContextMenuToolbarHandlerNode == null || !textContextMenuToolbarHandlerNode.isAttached()) {
            return;
        }
        StandaloneCoroutine standaloneCoroutine = textContextMenuToolbarHandlerNode.textToolbarJob;
        if ((standaloneCoroutine == null || !standaloneCoroutine.isActive()) && (textContextMenuProvider = (TextContextMenuProvider) DepthSortedSetKt.currentValueOf(textContextMenuToolbarHandlerNode, TextContextMenuProviderKt.LocalTextContextMenuToolbarProvider)) != null) {
            textContextMenuToolbarHandlerNode.textToolbarJob = JobKt.launch$default(textContextMenuToolbarHandlerNode.getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new SliderDraggableState$drag$2(textContextMenuToolbarHandlerNode, textContextMenuProvider, (Continuation) null, 25), 1);
        }
    }
}
