package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/FocusableNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FocusableElement extends ModifierNodeElement {
    public final MutableInteractionSourceImpl interactionSource;

    public FocusableElement(MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        this.interactionSource = mutableInteractionSourceImpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new FocusableNode(this.interactionSource, (TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2) null, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return Intrinsics.areEqual(this.interactionSource, ((FocusableElement) obj).interactionSource);
        }
        return false;
    }

    public final int hashCode() {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        if (mutableInteractionSourceImpl != null) {
            return mutableInteractionSourceImpl.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "focusable";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(Boolean.TRUE, "enabled");
        linesSequence.set(this.interactionSource, "interactionSource");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((FocusableNode) node).update(this.interactionSource);
    }
}
