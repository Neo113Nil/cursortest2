package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.StandaloneCoroutine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldCoreModifier extends ModifierNodeElement {
    public final Brush cursorBrush;
    public final boolean isDragHovered;
    public final boolean isFocused;
    public final Orientation orientation;
    public final PlatformSelectionBehaviorsImpl platformSelectionBehaviors;
    public final ScrollState scrollState;
    public final TextFieldSelectionState textFieldSelectionState;
    public final TransformedTextFieldState textFieldState;
    public final TextLayoutState textLayoutState;
    public final ToolbarRequesterImpl toolbarRequester;
    public final boolean writeable;

    public TextFieldCoreModifier(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequesterImpl toolbarRequesterImpl, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl) {
        this.isFocused = z;
        this.isDragHovered = z2;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z3;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.toolbarRequester = toolbarRequesterImpl;
        this.platformSelectionBehaviors = platformSelectionBehaviorsImpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new TextFieldCoreModifierNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation, this.toolbarRequester, this.platformSelectionBehaviors);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.isFocused == textFieldCoreModifier.isFocused && this.isDragHovered == textFieldCoreModifier.isDragHovered && Intrinsics.areEqual(this.textLayoutState, textFieldCoreModifier.textLayoutState) && Intrinsics.areEqual(this.textFieldState, textFieldCoreModifier.textFieldState) && Intrinsics.areEqual(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && Intrinsics.areEqual(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && Intrinsics.areEqual(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation && Intrinsics.areEqual(this.toolbarRequester, textFieldCoreModifier.toolbarRequester) && Intrinsics.areEqual(this.platformSelectionBehaviors, textFieldCoreModifier.platformSelectionBehaviors);
    }

    public final int hashCode() {
        int hashCode = (this.toolbarRequester.hashCode() + ((this.orientation.hashCode() + ((this.scrollState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.cursorBrush.hashCode() + ((this.textFieldSelectionState.hashCode() + ((this.textFieldState.hashCode() + ((this.textLayoutState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isFocused) * 31, 31, this.isDragHovered)) * 31)) * 31)) * 31)) * 31, 31, this.writeable)) * 31)) * 31)) * 31;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = this.platformSelectionBehaviors;
        return hashCode + (platformSelectionBehaviorsImpl == null ? 0 : platformSelectionBehaviorsImpl.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.isFocused + ", isDragHovered=" + this.isDragHovered + ", textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", cursorBrush=" + this.cursorBrush + ", writeable=" + this.writeable + ", scrollState=" + this.scrollState + ", orientation=" + this.orientation + ", toolbarRequester=" + this.toolbarRequester + ", platformSelectionBehaviors=" + this.platformSelectionBehaviors + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        Job job;
        TextFieldCoreModifierNode textFieldCoreModifierNode = (TextFieldCoreModifierNode) node;
        boolean showCursor = textFieldCoreModifierNode.getShowCursor();
        boolean z = textFieldCoreModifierNode.isFocused;
        TransformedTextFieldState transformedTextFieldState = textFieldCoreModifierNode.textFieldState;
        TextLayoutState textLayoutState = textFieldCoreModifierNode.textLayoutState;
        TextFieldSelectionState textFieldSelectionState = textFieldCoreModifierNode.textFieldSelectionState;
        ScrollState scrollState = textFieldCoreModifierNode.scrollState;
        boolean z2 = this.isFocused;
        textFieldCoreModifierNode.isFocused = z2;
        boolean z3 = this.isDragHovered;
        textFieldCoreModifierNode.isDragHovered = z3;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        textFieldCoreModifierNode.textLayoutState = textLayoutState2;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        textFieldCoreModifierNode.textFieldState = transformedTextFieldState2;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        textFieldCoreModifierNode.textFieldSelectionState = textFieldSelectionState2;
        textFieldCoreModifierNode.cursorBrush = this.cursorBrush;
        textFieldCoreModifierNode.writeable = this.writeable;
        ScrollState scrollState2 = this.scrollState;
        textFieldCoreModifierNode.scrollState = scrollState2;
        textFieldCoreModifierNode.orientation = this.orientation;
        ToolbarRequesterImpl toolbarRequesterImpl = this.toolbarRequester;
        textFieldCoreModifierNode.toolbarRequester = toolbarRequesterImpl;
        textFieldCoreModifierNode.platformSelectionBehaviors = this.platformSelectionBehaviors;
        TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = textFieldCoreModifierNode.textFieldMagnifierNode;
        boolean z4 = z2 || z3;
        TransformedTextFieldState transformedTextFieldState3 = textFieldMagnifierNodeImpl28.textFieldState;
        TextFieldSelectionState textFieldSelectionState3 = textFieldMagnifierNodeImpl28.textFieldSelectionState;
        TextLayoutState textLayoutState3 = textFieldMagnifierNodeImpl28.textLayoutState;
        boolean z5 = textFieldMagnifierNodeImpl28.visible;
        textFieldMagnifierNodeImpl28.textFieldState = transformedTextFieldState2;
        textFieldMagnifierNodeImpl28.textFieldSelectionState = textFieldSelectionState2;
        textFieldMagnifierNodeImpl28.textLayoutState = textLayoutState2;
        textFieldMagnifierNodeImpl28.visible = z4;
        if (!Intrinsics.areEqual(transformedTextFieldState2, transformedTextFieldState3) || !Intrinsics.areEqual(textFieldSelectionState2, textFieldSelectionState3) || !Intrinsics.areEqual(textLayoutState2, textLayoutState3) || z4 != z5) {
            textFieldMagnifierNodeImpl28.restartAnimationJob();
        }
        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = textFieldCoreModifierNode.textContextMenuToolbarHandlerNode;
        textContextMenuToolbarHandlerNode.requester.toolbarHandlerNode = null;
        textContextMenuToolbarHandlerNode.requester = toolbarRequesterImpl;
        toolbarRequesterImpl.toolbarHandlerNode = textContextMenuToolbarHandlerNode;
        toolbarRequesterImpl.toolbarHandlerState = textContextMenuToolbarHandlerNode.isAttached() ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached;
        if (!textFieldCoreModifierNode.getShowCursor()) {
            StandaloneCoroutine standaloneCoroutine = textFieldCoreModifierNode.changeObserverJob;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            textFieldCoreModifierNode.changeObserverJob = null;
            CursorAnimationState cursorAnimationState = textFieldCoreModifierNode.cursorAnimation;
            if (cursorAnimationState != null && (job = (Job) cursorAnimationState.animationJob.getAndSet(null)) != null) {
                job.cancel(null);
            }
        } else if (!z || !Intrinsics.areEqual(transformedTextFieldState, transformedTextFieldState2) || !showCursor) {
            textFieldCoreModifierNode.startCursorJob();
        }
        if (Intrinsics.areEqual(transformedTextFieldState, transformedTextFieldState2) && Intrinsics.areEqual(textLayoutState, textLayoutState2) && Intrinsics.areEqual(textFieldSelectionState, textFieldSelectionState2) && Intrinsics.areEqual(scrollState, scrollState2)) {
            return;
        }
        DepthSortedSetKt.requireLayoutNode(textFieldCoreModifierNode).invalidateMeasurements$ui();
    }
}
