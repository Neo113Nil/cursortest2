package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends ModifierNodeElement {
    public final LegacyTextFieldState legacyTextFieldState;
    public final AndroidLegacyPlatformTextInputServiceAdapter serviceAdapter;
    public final TextFieldSelectionManager textFieldSelectionManager;

    public LegacyAdaptingPlatformTextInputModifier(AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.serviceAdapter = androidLegacyPlatformTextInputServiceAdapter;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new LegacyAdaptingPlatformTextInputModifierNode(this.serviceAdapter, this.legacyTextFieldState, this.textFieldSelectionManager);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyAdaptingPlatformTextInputModifier) {
            LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
            return Intrinsics.areEqual(this.serviceAdapter, legacyAdaptingPlatformTextInputModifier.serviceAdapter) && this.legacyTextFieldState == legacyAdaptingPlatformTextInputModifier.legacyTextFieldState && this.textFieldSelectionManager == legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager;
        }
        return false;
    }

    public final int hashCode() {
        return this.textFieldSelectionManager.hashCode() + ((this.legacyTextFieldState.hashCode() + (this.serviceAdapter.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.serviceAdapter + ", legacyTextFieldState=" + this.legacyTextFieldState + ", textFieldSelectionManager=" + this.textFieldSelectionManager + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = (LegacyAdaptingPlatformTextInputModifierNode) node;
        if (legacyAdaptingPlatformTextInputModifierNode.isAttached()) {
            legacyAdaptingPlatformTextInputModifierNode.serviceAdapter.stopInput();
            legacyAdaptingPlatformTextInputModifierNode.serviceAdapter.unregisterModifier(legacyAdaptingPlatformTextInputModifierNode);
        }
        legacyAdaptingPlatformTextInputModifierNode.serviceAdapter = this.serviceAdapter;
        if (legacyAdaptingPlatformTextInputModifierNode.isAttached()) {
            AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter = legacyAdaptingPlatformTextInputModifierNode.serviceAdapter;
            if (androidLegacyPlatformTextInputServiceAdapter.textInputModifierNode != null) {
                InlineClassHelperKt.throwIllegalStateException("Expected textInputModifierNode to be null");
            }
            androidLegacyPlatformTextInputServiceAdapter.textInputModifierNode = legacyAdaptingPlatformTextInputModifierNode;
        }
        legacyAdaptingPlatformTextInputModifierNode.legacyTextFieldState = this.legacyTextFieldState;
        legacyAdaptingPlatformTextInputModifierNode.textFieldSelectionManager = this.textFieldSelectionManager;
    }
}
