package androidx.compose.ui.input.indirect;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatableNode;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes.dex */
public interface IndirectPointerInputModifierNode extends DelegatableNode {
    void onCancelIndirectPointerInput();

    void onIndirectPointerEvent(HuffmanTreeGroup huffmanTreeGroup, PointerEventPass pointerEventPass);
}
