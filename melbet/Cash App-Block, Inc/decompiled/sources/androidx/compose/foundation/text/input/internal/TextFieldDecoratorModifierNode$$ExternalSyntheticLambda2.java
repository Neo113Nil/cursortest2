package androidx.compose.foundation.text.input.internal;

import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import coil3.size.SizeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final /* synthetic */ class TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldDecoratorModifierNode f$0;

    public /* synthetic */ TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.$r8$classId = i;
        this.f$0 = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Continuation continuation = null;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f$0;
        switch (i) {
            case 0:
                List list = (List) obj;
                TextLayoutResult layoutResult = textFieldDecoratorModifierNode.textLayoutState.getLayoutResult();
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z = textFieldDecoratorModifierNode.enabled && !textFieldDecoratorModifierNode.readOnly;
                if (booleanValue) {
                    if (((InputMode) ((InputModeManagerImpl) DepthSortedSetKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.LocalInputModeManager)).inputMode$delegate.getValue()).value != 1) {
                        textFieldDecoratorModifierNode.textFieldSelectionState.setInTouchMode(false);
                    }
                    if (z) {
                        textFieldDecoratorModifierNode.startInputSession(false);
                    }
                } else {
                    textFieldDecoratorModifierNode.disposeInputSession();
                    TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.textFieldState;
                    TextFieldState textFieldState = transformedTextFieldState.textFieldState;
                    InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
                    TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
                    textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
                    TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
                    textFieldBuffer.m378setCompositionOEnZFl4(null);
                    transformedTextFieldState.updateWedgeAffinity(textFieldBuffer);
                    TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
                    textFieldState.setUserCommit(true);
                    textFieldDecoratorModifierNode.textFieldState.collapseSelectionToMax();
                }
                DepthSortedSetKt.observeReads(textFieldDecoratorModifierNode, new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(textFieldDecoratorModifierNode, 2));
                break;
            case 2:
                ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
                break;
            case 3:
                DragAndDropHoverInteraction$Enter dragAndDropHoverInteraction$Enter = new DragAndDropHoverInteraction$Enter();
                textFieldDecoratorModifierNode.interactionSource.tryEmit(dragAndDropHoverInteraction$Enter);
                textFieldDecoratorModifierNode.dragEnterEvent = dragAndDropHoverInteraction$Enter;
                ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
                break;
            case 4:
                long m399fromWindowToDecorationUv8p0NA = MathUtilsKt.m399fromWindowToDecorationUv8p0NA(textFieldDecoratorModifierNode.textLayoutState, ((Offset) obj).packedValue);
                int m410getOffsetForPosition3MmeM6k = textFieldDecoratorModifierNode.textLayoutState.m410getOffsetForPosition3MmeM6k(m399fromWindowToDecorationUv8p0NA, true);
                if (m410getOffsetForPosition3MmeM6k >= 0) {
                    textFieldDecoratorModifierNode.textFieldState.m416selectCharsIn5zctL8(SizeKt.TextRange(m410getOffsetForPosition3MmeM6k, m410getOffsetForPosition3MmeM6k));
                }
                textFieldDecoratorModifierNode.textFieldSelectionState.m422updateHandleDraggingUv8p0NA(Handle.Cursor, m399fromWindowToDecorationUv8p0NA);
                break;
            case 5:
                textFieldDecoratorModifierNode.emitDragExitEvent();
                textFieldDecoratorModifierNode.textFieldSelectionState.clearHandleDragging();
                ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
                break;
            case 6:
                textFieldDecoratorModifierNode.emitDragExitEvent();
                break;
            case 7:
                JobKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new VirtualCameraState$connect$2$1((KeyCommand) obj, textFieldDecoratorModifierNode, continuation, 29), 1);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                textFieldDecoratorModifierNode.textFieldSelectionState.isInTouchMode$delegate.setValue(bool);
                break;
        }
        return Unit.INSTANCE;
    }
}
