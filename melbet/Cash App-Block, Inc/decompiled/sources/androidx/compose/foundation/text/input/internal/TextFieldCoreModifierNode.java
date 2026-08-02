package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.DerivedSnapshotState$$ExternalSyntheticLambda0;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.DimensionKt;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.session.backend.RealSessionManager$updateSessionState$newOnboarded$1;
import com.squareup.cash.session.backend.RealSessionManager$updateSessionState$newSession$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda13;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public StandaloneCoroutine changeObserverJob;
    public CursorAnimationState cursorAnimation;
    public Brush cursorBrush;
    public boolean isDragHovered;
    public boolean isFocused;
    public Orientation orientation;
    public PlatformSelectionBehaviorsImpl platformSelectionBehaviors;
    public int previousContainerSize;
    public Rect previousCursorRect = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);
    public TextRange previousSelection;
    public int previousTextLayoutSize;
    public ScrollState scrollState;
    public final TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode;
    public final TextFieldMagnifierNodeImpl28 textFieldMagnifierNode;
    public TextFieldSelectionState textFieldSelectionState;
    public TransformedTextFieldState textFieldState;
    public TextLayoutState textLayoutState;
    public ToolbarRequesterImpl toolbarRequester;
    public boolean writeable;

    public TextFieldCoreModifierNode(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequesterImpl toolbarRequesterImpl, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl) {
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
        int i = 1;
        boolean z4 = z || z2;
        SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.MagnifierPositionInRoot;
        TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = new TextFieldMagnifierNodeImpl28(transformedTextFieldState, textFieldSelectionState, textLayoutState, z4);
        delegate(textFieldMagnifierNodeImpl28);
        this.textFieldMagnifierNode = textFieldMagnifierNodeImpl28;
        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = new TextContextMenuToolbarHandlerNode(this.toolbarRequester, new RealSessionManager$updateSessionState$newOnboarded$1(this, null, i), new RealSessionManager$updateSessionState$newSession$1(this, null, 1), new CashApp$$ExternalSyntheticLambda2(this, 9));
        delegate(textContextMenuToolbarHandlerNode);
        this.textContextMenuToolbarHandlerNode = textContextMenuToolbarHandlerNode;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.textFieldMagnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        int m990getMinimpl;
        int m989getMaximpl;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        layoutNodeDrawScope.drawContent();
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        Pair pair = visualText.highlight;
        Pair pair2 = visualText.highlight;
        long j = visualText.selection;
        if (pair != null) {
            int m384unboximpl = ((TextHighlightType) pair.first).m384unboximpl();
            long j2 = ((TextRange) pair.second).packedValue;
            if (!TextRange.m987getCollapsedimpl(j2)) {
                AndroidPath pathForRange = layoutResult.getPathForRange(TextRange.m990getMinimpl(j2), TextRange.m989getMaximpl(j2));
                TextStyle textStyle = layoutResult.layoutInput.style;
                if (TextHighlightType.m383equalsimpl0(m384unboximpl)) {
                    Brush brush = textStyle.getBrush();
                    if (brush != null) {
                        DrawScope.m744drawPathGBMwjPU$default(layoutNodeDrawScope, pathForRange, brush, 0.2f, null, 56);
                    } else {
                        long m996getColor0d7_KjU = textStyle.m996getColor0d7_KjU();
                        if (m996getColor0d7_KjU == 16) {
                            m996getColor0d7_KjU = Color.Black;
                        }
                        DrawScope.m745drawPathLG529CI$default(layoutNodeDrawScope, pathForRange, Color.m675copywmQWz5c$default(Color.m677getAlphaimpl(m996getColor0d7_KjU) * 0.2f, m996getColor0d7_KjU, 14), RecyclerView.DECELERATION_RATE, null, 60);
                    }
                } else {
                    DrawScope.m745drawPathLG529CI$default(layoutNodeDrawScope, pathForRange, ((TextSelectionColors) DepthSortedSetKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m459getBackgroundColor0d7_KjU(), RecyclerView.DECELERATION_RATE, null, 60);
                }
            }
        }
        if (TextRange.m987getCollapsedimpl(j)) {
            DimensionKt.paint(canvasDrawScope.drawContext.getCanvas(), layoutResult);
            if (pair2 == null) {
                Brush brush2 = this.cursorBrush;
                boolean showCursor = getShowCursor();
                CursorAnimationState cursorAnimationState = this.cursorAnimation;
                TextFieldSelectionState textFieldSelectionState = this.textFieldSelectionState;
                float floatValue = cursorAnimationState != null ? cursorAnimationState.cursorAlpha$delegate.getFloatValue() : 0.0f;
                if (floatValue != RecyclerView.DECELERATION_RATE && showCursor) {
                    Rect cursorRect = textFieldSelectionState.getCursorRect();
                    DrawScope.m741drawLine1RTmtNc$default(layoutNodeDrawScope, brush2, cursorRect.m635getTopCenterF1C5BW0(), cursorRect.m630getBottomCenterF1C5BW0(), cursorRect.right - cursorRect.left, floatValue, 432);
                }
            }
        } else {
            if (pair2 == null && (m990getMinimpl = TextRange.m990getMinimpl(j)) != (m989getMaximpl = TextRange.m989getMaximpl(j))) {
                DrawScope.m745drawPathLG529CI$default(layoutNodeDrawScope, layoutResult.getPathForRange(m990getMinimpl, m989getMaximpl), ((TextSelectionColors) DepthSortedSetKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m459getBackgroundColor0d7_KjU(), RecyclerView.DECELERATION_RATE, null, 60);
            }
            DimensionKt.paint(canvasDrawScope.drawContext.getCanvas(), layoutResult);
        }
        this.textFieldMagnifierNode.draw(layoutNodeDrawScope);
    }

    public final boolean getShowCursor() {
        if (!this.writeable) {
            return false;
        }
        if (!this.isFocused && !this.isDragHovered) {
            return false;
        }
        Brush brush = this.cursorBrush;
        return ((brush instanceof SolidColor) && ((SolidColor) brush).value == 16) ? false : true;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        if (this.orientation == Orientation.Vertical) {
            Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7));
            int min = Math.min(mo833measureBRTryo0.height, Constraints.m1024getMaxHeightimpl(j));
            return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, min, new Hero3DCardViewKt$$ExternalSyntheticLambda13(this, min, mo833measureBRTryo0, measureScope));
        }
        Placeable mo833measureBRTryo02 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        int min2 = Math.min(mo833measureBRTryo02.width, Constraints.m1025getMaxWidthimpl(j));
        return MeasureScope.layout$default(measureScope, min2, mo833measureBRTryo02.height, new DerivedSnapshotState$$ExternalSyntheticLambda0(this, min2, mo833measureBRTryo02, measureScope));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        if (this.isFocused && getShowCursor()) {
            startCursorJob();
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        this.textLayoutState.coreNodeCoordinates$delegate.setValue(nodeCoordinator);
        this.textFieldMagnifierNode.onGloballyPositioned(nodeCoordinator);
    }

    public final void startCursorJob() {
        if (this.cursorAnimation == null) {
            this.cursorAnimation = new CursorAnimationState(((Boolean) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalCursorBlinkEnabled)).booleanValue());
            DepthSortedSetKt.invalidateDraw(this);
        }
        this.changeObserverJob = JobKt.launch$default(getCoroutineScope(), null, null, new CashApp$onCreate$4$1$1(this, null, 3), 3);
    }

    /* renamed from: updateScrollState-tIlFzwE, reason: not valid java name */
    public final void m406updateScrollStatetIlFzwE(Placeable.PlacementScope placementScope, int i, int i2, long j, LayoutDirection layoutDirection) {
        int i3;
        TextLayoutResult layoutResult;
        float f;
        this.scrollState.viewportSize$delegate.setIntValue(i);
        this.scrollState.setMaxValue$foundation(i2 - i);
        TextRange textRange = this.previousSelection;
        if (textRange != null) {
            int i4 = TextRange.$r8$clinit;
            int i5 = (int) (j & BodyPartID.bodyIdMax);
            long j2 = textRange.packedValue;
            if (i5 == ((int) (j2 & BodyPartID.bodyIdMax))) {
                i3 = (int) (j >> 32);
                if (i3 == ((int) (j2 >> 32)) && i2 == this.previousTextLayoutSize && i == this.previousContainerSize) {
                    i3 = -1;
                }
                if (i3 >= 0 || !getShowCursor() || (layoutResult = this.textLayoutState.getLayoutResult()) == null) {
                    return;
                }
                Rect cursorRect = layoutResult.getCursorRect(RangesKt___RangesKt.coerceIn(i3, new IntRange(0, layoutResult.layoutInput.text.text.length(), 1)));
                float f2 = cursorRect.left;
                float f3 = cursorRect.right;
                boolean z = layoutDirection == LayoutDirection.Rtl;
                int mo230roundToPx0680j_4 = placementScope.mo230roundToPx0680j_4(2.0f);
                float f4 = z ? i2 - f3 : f2;
                if (z) {
                    f2 = i2 - f3;
                }
                Rect copy$default = Rect.copy$default(cursorRect, f4, f2 + mo230roundToPx0680j_4, RecyclerView.DECELERATION_RATE, 10);
                float f5 = copy$default.top;
                float f6 = copy$default.left;
                Rect rect = this.previousCursorRect;
                boolean z2 = (f6 == rect.left && f5 == rect.top && i2 == this.previousTextLayoutSize) ? false : true;
                if (z2 || i != this.previousContainerSize) {
                    boolean z3 = this.orientation == Orientation.Vertical;
                    if (!z3) {
                        f5 = f6;
                    }
                    float f7 = z3 ? copy$default.bottom : copy$default.right;
                    int intValue = this.scrollState.value$delegate.getIntValue();
                    float f8 = intValue + i;
                    if (f7 <= f8) {
                        float f9 = intValue;
                        if (f5 >= f9 || f7 - f5 <= i) {
                            f = (f5 >= f9 || f7 - f5 > ((float) i)) ? RecyclerView.DECELERATION_RATE : f5 - f9;
                            this.previousSelection = new TextRange(j);
                            this.previousCursorRect = copy$default;
                            this.previousContainerSize = i;
                            this.previousTextLayoutSize = i2;
                            JobKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new TextFieldCoreModifierNode$updateScrollState$1(this, f, z2, cursorRect, null), 1);
                            return;
                        }
                    }
                    f = f7 - f8;
                    this.previousSelection = new TextRange(j);
                    this.previousCursorRect = copy$default;
                    this.previousContainerSize = i;
                    this.previousTextLayoutSize = i2;
                    JobKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new TextFieldCoreModifierNode$updateScrollState$1(this, f, z2, cursorRect, null), 1);
                    return;
                }
                return;
            }
        }
        int i6 = TextRange.$r8$clinit;
        i3 = (int) (j & BodyPartID.bodyIdMax);
        if (i3 >= 0) {
        }
    }
}
