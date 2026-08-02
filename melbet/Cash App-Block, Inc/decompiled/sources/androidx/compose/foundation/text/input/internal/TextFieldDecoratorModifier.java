package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldDecoratorModifier extends ModifierNodeElement {
    public final boolean enabled;
    public final InputTransformation filter;
    public final MutableInteractionSourceImpl interactionSource;
    public final KeyboardActionHandler keyboardActionHandler;
    public final KeyboardOptions keyboardOptions;
    public final boolean readOnly;
    public final boolean singleLine;
    public final MutableSharedFlow stylusHandwritingTrigger;
    public final TextFieldSelectionState textFieldSelectionState;
    public final TransformedTextFieldState textFieldState;
    public final TextLayoutState textLayoutState;

    public TextFieldDecoratorModifier(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSourceImpl mutableInteractionSourceImpl, MutableSharedFlow mutableSharedFlow) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z3;
        this.interactionSource = mutableInteractionSourceImpl;
        this.stylusHandwritingTrigger = mutableSharedFlow;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new TextFieldDecoratorModifierNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.stylusHandwritingTrigger);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return Intrinsics.areEqual(this.textFieldState, textFieldDecoratorModifier.textFieldState) && Intrinsics.areEqual(this.textLayoutState, textFieldDecoratorModifier.textLayoutState) && Intrinsics.areEqual(this.textFieldSelectionState, textFieldDecoratorModifier.textFieldSelectionState) && Intrinsics.areEqual(this.filter, textFieldDecoratorModifier.filter) && this.enabled == textFieldDecoratorModifier.enabled && this.readOnly == textFieldDecoratorModifier.readOnly && this.keyboardOptions.equals(textFieldDecoratorModifier.keyboardOptions) && Intrinsics.areEqual(this.keyboardActionHandler, textFieldDecoratorModifier.keyboardActionHandler) && this.singleLine == textFieldDecoratorModifier.singleLine && Intrinsics.areEqual(this.interactionSource, textFieldDecoratorModifier.interactionSource) && Intrinsics.areEqual(this.stylusHandwritingTrigger, textFieldDecoratorModifier.stylusHandwritingTrigger);
    }

    public final int hashCode() {
        int hashCode = (this.textFieldSelectionState.hashCode() + ((this.textLayoutState.hashCode() + (this.textFieldState.hashCode() * 31)) * 31)) * 31;
        InputTransformation inputTransformation = this.filter;
        int hashCode2 = (this.keyboardOptions.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (inputTransformation == null ? 0 : inputTransformation.hashCode())) * 31, 31, this.enabled), 31, this.readOnly)) * 31;
        KeyboardActionHandler keyboardActionHandler = this.keyboardActionHandler;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.interactionSource.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (keyboardActionHandler == null ? 0 : keyboardActionHandler.hashCode())) * 31, 31, this.singleLine)) * 31, 31, false);
        MutableSharedFlow mutableSharedFlow = this.stylusHandwritingTrigger;
        return m + (mutableSharedFlow != null ? mutableSharedFlow.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.textFieldState + ", textLayoutState=" + this.textLayoutState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", filter=" + this.filter + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActionHandler=" + this.keyboardActionHandler + ", singleLine=" + this.singleLine + ", interactionSource=" + this.interactionSource + ", isPassword=false, stylusHandwritingTrigger=" + this.stylusHandwritingTrigger + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        StandaloneCoroutine standaloneCoroutine;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) node;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = textFieldDecoratorModifierNode.pointerInputNode;
        FocusableNode focusableNode = textFieldDecoratorModifierNode.focusableNode;
        boolean z = textFieldDecoratorModifierNode.enabled;
        boolean z2 = z && !textFieldDecoratorModifierNode.readOnly;
        TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.textFieldState;
        KeyboardOptions keyboardOptions = textFieldDecoratorModifierNode.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState = textFieldDecoratorModifierNode.textFieldSelectionState;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = textFieldDecoratorModifierNode.interactionSource;
        MutableSharedFlow mutableSharedFlow = textFieldDecoratorModifierNode.stylusHandwritingTrigger;
        boolean z3 = this.enabled;
        boolean z4 = this.readOnly;
        boolean z5 = z3 && !z4;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        textFieldDecoratorModifierNode.textFieldState = transformedTextFieldState2;
        textFieldDecoratorModifierNode.textLayoutState = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        textFieldDecoratorModifierNode.textFieldSelectionState = textFieldSelectionState2;
        textFieldDecoratorModifierNode.filter = this.filter;
        textFieldDecoratorModifierNode.enabled = z3;
        textFieldDecoratorModifierNode.readOnly = z4;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        textFieldDecoratorModifierNode.keyboardOptions = keyboardOptions2;
        textFieldDecoratorModifierNode.keyboardActionHandler = this.keyboardActionHandler;
        textFieldDecoratorModifierNode.singleLine = this.singleLine;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = this.interactionSource;
        textFieldDecoratorModifierNode.interactionSource = mutableInteractionSourceImpl2;
        MutableSharedFlow mutableSharedFlow2 = this.stylusHandwritingTrigger;
        textFieldDecoratorModifierNode.stylusHandwritingTrigger = mutableSharedFlow2;
        if (z5 != z2 || !Intrinsics.areEqual(transformedTextFieldState2, transformedTextFieldState) || !keyboardOptions2.equals(keyboardOptions) || !Intrinsics.areEqual(mutableSharedFlow2, mutableSharedFlow)) {
            if (z5 && (textFieldDecoratorModifierNode.isFocused$1() || textFieldDecoratorModifierNode.inputSessionJob != null)) {
                textFieldDecoratorModifierNode.startInputSession(false);
            } else if (!z5) {
                textFieldDecoratorModifierNode.disposeInputSession();
            }
        }
        if (z3 != z || z5 != z2 || keyboardOptions2.m360getImeActionOrDefaulteUduSuo$foundation() != keyboardOptions.m360getImeActionOrDefaulteUduSuo$foundation()) {
            DepthSortedSetKt.requireLayoutNode(textFieldDecoratorModifierNode).invalidateSemantics$ui();
        }
        if (!Intrinsics.areEqual(textFieldSelectionState2, textFieldSelectionState)) {
            suspendingPointerInputModifierNodeImpl.resetPointerInputHandler();
            if (textFieldDecoratorModifierNode.isAttached()) {
                textFieldSelectionState2.receiveContentConfiguration = textFieldDecoratorModifierNode.receiveContentConfigurationProvider;
                if (textFieldDecoratorModifierNode.isFocused$1() && (standaloneCoroutine = textFieldDecoratorModifierNode.toolbarAndHandlesVisibilityObserverJob) != null) {
                    standaloneCoroutine.cancel(null);
                    textFieldDecoratorModifierNode.toolbarAndHandlesVisibilityObserverJob = JobKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new ThumbNode$onAttach$1(textFieldSelectionState2, (Continuation) null, 23), 3);
                }
            }
            textFieldSelectionState2.requestAutofillAction = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12(textFieldDecoratorModifierNode, 0);
        }
        if (!Intrinsics.areEqual(mutableInteractionSourceImpl2, mutableInteractionSourceImpl)) {
            suspendingPointerInputModifierNodeImpl.resetPointerInputHandler();
            if (focusableNode.isAttached()) {
                focusableNode.update(mutableInteractionSourceImpl2);
            }
        }
        if (z3 != z) {
            if (!z3) {
                textFieldDecoratorModifierNode.undelegate(focusableNode);
            } else {
                textFieldDecoratorModifierNode.delegate(focusableNode);
                focusableNode.update(mutableInteractionSourceImpl2);
            }
        }
    }
}
