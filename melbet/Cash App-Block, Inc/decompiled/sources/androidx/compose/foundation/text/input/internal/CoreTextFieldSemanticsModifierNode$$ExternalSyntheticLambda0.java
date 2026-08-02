package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f$0;

    public /* synthetic */ CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda0(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i) {
        this.$r8$classId = i;
        this.f$0 = coreTextFieldSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        int i = this.$r8$classId;
        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.f$0;
        switch (i) {
            case 0:
                DepthSortedSetKt.requestAutofill(coreTextFieldSemanticsModifierNode);
                break;
            case 1:
                coreTextFieldSemanticsModifierNode.manager.enterSelectionMode$foundation(true);
                break;
            case 2:
                coreTextFieldSemanticsModifierNode.manager.copy$foundation(true);
                break;
            case 3:
                coreTextFieldSemanticsModifierNode.manager.cut$foundation();
                break;
            case 4:
                DepthSortedSetKt.requestAutofill(coreTextFieldSemanticsModifierNode);
                break;
            case 5:
                coreTextFieldSemanticsModifierNode.manager.paste$foundation();
                break;
            case 6:
                coreTextFieldSemanticsModifierNode.state.onImeActionPerformed.f$0.keyboardActionRunner.m358runActionKlQnJC8(coreTextFieldSemanticsModifierNode.imeOptions.imeAction);
                break;
            default:
                LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.state;
                FocusRequester focusRequester = coreTextFieldSemanticsModifierNode.focusRequester;
                boolean z = coreTextFieldSemanticsModifierNode.readOnly;
                if (!legacyTextFieldState.getHasFocus()) {
                    FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                } else if (!z && (delegatingSoftwareKeyboardController = legacyTextFieldState.keyboardController) != null) {
                    delegatingSoftwareKeyboardController.show();
                }
                break;
        }
        return Boolean.TRUE;
    }
}
