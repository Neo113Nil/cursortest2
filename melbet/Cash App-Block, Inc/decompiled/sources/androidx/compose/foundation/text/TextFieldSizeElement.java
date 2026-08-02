package androidx.compose.foundation.text;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.core.os.BundleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/TextFieldSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/TextFieldSizeNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldSizeElement extends ModifierNodeElement {
    public final TextStyle style;

    public TextFieldSizeElement(TextStyle textStyle) {
        this.style = textStyle;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new TextFieldSizeNode(this.style);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldSizeElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.style, ((TextFieldSizeElement) obj).style);
    }

    public final int hashCode() {
        return this.style.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("textFieldMinSize");
        inspectorInfo.getProperties().set(this.style, "style");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        TextFieldSizeNode textFieldSizeNode = (TextFieldSizeNode) node;
        textFieldSizeNode.getClass();
        TextStyle resolveDefaults = BundleKt.resolveDefaults(this.style, DepthSortedSetKt.requireLayoutNode(textFieldSizeNode).layoutDirection);
        textFieldSizeNode.updateFontResolutionState(resolveDefaults, (FontFamilyResolverImpl) DepthSortedSetKt.currentValueOf(textFieldSizeNode, CompositionLocalsKt.LocalFontFamilyResolver));
        TextFieldSize textFieldSize = textFieldSizeNode.minSizeState;
        if (textFieldSize == null) {
            throw Recorder$$ExternalSyntheticOutline2.m("Min size state is not set.");
        }
        TextFieldSize.update$default(textFieldSize, null, null, resolveDefaults, 23);
        DepthSortedSetKt.requireLayoutNode(textFieldSizeNode).invalidateMeasurements$ui();
    }
}
