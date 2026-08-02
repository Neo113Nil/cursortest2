package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes.dex */
public final /* synthetic */ class TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldDecoratorModifierNode f$0;

    public /* synthetic */ TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.$r8$classId = i;
        this.f$0 = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Set set;
        int i = this.$r8$classId;
        int i2 = 1;
        int i3 = 3;
        Continuation continuation = null;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f$0;
        switch (i) {
            case 0:
                JobKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, continuation, i3), 3);
                return Boolean.TRUE;
            case 1:
                JobKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, continuation, 2), 3);
                return Boolean.TRUE;
            case 2:
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) DepthSortedSetKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.LocalWindowInfo);
                textFieldDecoratorModifierNode.textFieldSelectionState.isFocused = textFieldDecoratorModifierNode.isFocused$1();
                if (textFieldDecoratorModifierNode.isFocused$1() && textFieldDecoratorModifierNode.toolbarAndHandlesVisibilityObserverJob == null) {
                    textFieldDecoratorModifierNode.toolbarAndHandlesVisibilityObserverJob = JobKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$startInputSession$1(textFieldDecoratorModifierNode, continuation, i2), 3);
                } else if (!textFieldDecoratorModifierNode.isFocused$1()) {
                    StandaloneCoroutine standaloneCoroutine = textFieldDecoratorModifierNode.toolbarAndHandlesVisibilityObserverJob;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    textFieldDecoratorModifierNode.toolbarAndHandlesVisibilityObserverJob = null;
                }
                return Unit.INSTANCE;
            case 3:
                DepthSortedSetKt.requestAutofill(textFieldDecoratorModifierNode);
                return Unit.INSTANCE;
            case 4:
                ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
                return null;
            case 5:
                ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
                set = TextFieldDecoratorModifierKt.MediaTypesText;
                return set;
            case 6:
                if (!textFieldDecoratorModifierNode.isFocused$1()) {
                    FocusableNode focusableNode = textFieldDecoratorModifierNode.focusableNode;
                    if (focusableNode.isAttached()) {
                        focusableNode.focusTargetNode.m608requestFocus3ESFkO8(7);
                    }
                } else if (!textFieldDecoratorModifierNode.readOnly) {
                    textFieldDecoratorModifierNode.requireKeyboardController().show();
                }
                return Boolean.TRUE;
            case 7:
                if (!textFieldDecoratorModifierNode.isFocused$1()) {
                    FocusableNode focusableNode2 = textFieldDecoratorModifierNode.focusableNode;
                    if (focusableNode2.isAttached()) {
                        focusableNode2.focusTargetNode.m608requestFocus3ESFkO8(7);
                    }
                }
                textFieldDecoratorModifierNode.textFieldSelectionState.setTextToolbarState(TextToolbarState.Selection);
                return Boolean.TRUE;
            case 8:
                JobKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, continuation, i2), 3);
                return Boolean.TRUE;
            default:
                textFieldDecoratorModifierNode.textFieldSelectionState.setTextToolbarState(TextToolbarState.Selection);
                return Unit.INSTANCE;
        }
    }
}
