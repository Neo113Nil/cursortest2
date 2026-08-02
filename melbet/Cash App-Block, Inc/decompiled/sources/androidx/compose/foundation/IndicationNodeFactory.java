package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.node.DelegatableNode;

/* loaded from: classes.dex */
public interface IndicationNodeFactory {
    DelegatableNode create(MutableInteractionSourceImpl mutableInteractionSourceImpl);

    int hashCode();
}
