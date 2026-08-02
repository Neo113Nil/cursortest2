package androidx.compose.foundation.text.modifiers;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda1;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    public SelectionController selectionController;
    public final TextAnnotatedStringNode textAnnotatedStringNode;

    public SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamilyResolverImpl fontFamilyResolverImpl, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
        this.selectionController = selectionController;
        TextAnnotatedStringNode textAnnotatedStringNode = new TextAnnotatedStringNode(annotatedString, textStyle, fontFamilyResolverImpl, function1, i, z, i2, i3, list, function12, selectionController, colorProducer, null);
        delegate(textAnnotatedStringNode);
        this.textAnnotatedStringNode = textAnnotatedStringNode;
        if (this.selectionController == null) {
            throw Recorder$$ExternalSyntheticOutline2.m("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        this.textAnnotatedStringNode.draw(layoutNodeDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        return this.textAnnotatedStringNode.mo144measure3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.textAnnotatedStringNode.minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.params = StaticTextSelectionParams.copy$default(selectionController.params, nodeCoordinator, null, 2);
            SelectionRegistrar selectionRegistrar = selectionController.selectionRegistrar;
            long j = selectionController.selectableId;
            SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) selectionRegistrar;
            selectionRegistrarImpl.sorted = false;
            SelectionManager$$ExternalSyntheticLambda1 selectionManager$$ExternalSyntheticLambda1 = selectionRegistrarImpl.onPositionChangeCallback;
            if (selectionManager$$ExternalSyntheticLambda1 != null) {
                selectionManager$$ExternalSyntheticLambda1.invoke(Long.valueOf(j));
            }
        }
    }
}
