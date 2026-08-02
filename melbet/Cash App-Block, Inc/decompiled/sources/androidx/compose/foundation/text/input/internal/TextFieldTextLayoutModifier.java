package androidx.compose.foundation.text.input.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifier extends ModifierNodeElement {
    public final KeyboardOptions keyboardOptions;
    public final boolean singleLine;
    public final TransformedTextFieldState textFieldState;
    public final TextLayoutState textLayoutState;
    public final TextStyle textStyle;

    public TextFieldTextLayoutModifier(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textStyle = textStyle;
        this.singleLine = z;
        this.keyboardOptions = keyboardOptions;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new TextFieldTextLayoutModifierNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.keyboardOptions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return this.singleLine == textFieldTextLayoutModifier.singleLine && Intrinsics.areEqual(this.textLayoutState, textFieldTextLayoutModifier.textLayoutState) && Intrinsics.areEqual(this.textFieldState, textFieldTextLayoutModifier.textFieldState) && Intrinsics.areEqual(this.textStyle, textFieldTextLayoutModifier.textStyle) && this.keyboardOptions.equals(textFieldTextLayoutModifier.keyboardOptions);
    }

    public final int hashCode() {
        return this.keyboardOptions.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.textStyle, (this.textFieldState.hashCode() + ((this.textLayoutState.hashCode() + (Boolean.hashCode(this.singleLine) * 31)) * 31)) * 31, 961);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        TextFieldTextLayoutModifierNode textFieldTextLayoutModifierNode = (TextFieldTextLayoutModifierNode) node;
        TextLayoutState textLayoutState = textFieldTextLayoutModifierNode.textLayoutState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        textFieldTextLayoutModifierNode.textLayoutState = textLayoutState2;
        textLayoutState2.getClass();
        boolean z = this.singleLine;
        textFieldTextLayoutModifierNode.singleLine = z;
        boolean z2 = !z;
        TextFieldLayoutStateCache textFieldLayoutStateCache = textLayoutState2.layoutCache;
        textFieldLayoutStateCache.getClass();
        textFieldLayoutStateCache.nonMeasureInputs$delegate.setValue(new TextFieldLayoutStateCache.NonMeasureInputs(this.textFieldState, this.textStyle, z, z2, this.keyboardOptions.keyboardType == 4));
        if (Intrinsics.areEqual(textLayoutState, textLayoutState2)) {
            return;
        }
        textFieldTextLayoutModifierNode.bringIntoViewRequesterNode.updateRequester(textLayoutState2.bringIntoViewRequester);
    }
}
