package androidx.compose.foundation.text.modifiers;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement {
    public final ColorProducer color;
    public final FontFamilyResolverImpl fontFamilyResolver;
    public final int maxLines;
    public final int minLines;
    public final Function1 onPlaceholderLayout;
    public final Function1 onTextLayout;
    public final int overflow;
    public final List placeholders;
    public final SelectionController selectionController;
    public final boolean softWrap;
    public final TextStyle style;
    public final AnnotatedString text;

    public SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamilyResolverImpl fontFamilyResolverImpl, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = fontFamilyResolverImpl;
        this.onTextLayout = function1;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = selectionController;
        this.color = colorProducer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return Intrinsics.areEqual(this.color, selectableTextAnnotatedStringElement.color) && Intrinsics.areEqual(this.text, selectableTextAnnotatedStringElement.text) && Intrinsics.areEqual(this.style, selectableTextAnnotatedStringElement.style) && Intrinsics.areEqual(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && Intrinsics.areEqual(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == selectableTextAnnotatedStringElement.onTextLayout && this.overflow == selectableTextAnnotatedStringElement.overflow && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && this.onPlaceholderLayout == selectableTextAnnotatedStringElement.onPlaceholderLayout && Intrinsics.areEqual(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
    }

    public final int hashCode() {
        int hashCode = (this.fontFamilyResolver.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.style, this.text.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.onTextLayout;
        int m = (((JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.overflow, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.softWrap) + this.maxLines) * 31) + this.minLines) * 31;
        List list = this.placeholders;
        int hashCode2 = (m + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.onPlaceholderLayout;
        int hashCode3 = (hashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31;
        SelectionController selectionController = this.selectionController;
        int hashCode4 = (hashCode3 + (selectionController != null ? selectionController.hashCode() : 0)) * 961;
        ColorProducer colorProducer = this.color;
        return hashCode4 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r4.spanStyle.hasSameNonLayoutAttributes$ui_text(r1.spanStyle) != false) goto L10;
     */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void update(Modifier.Node node) {
        boolean z;
        SelectableTextAnnotatedStringNode selectableTextAnnotatedStringNode = (SelectableTextAnnotatedStringNode) node;
        TextAnnotatedStringNode textAnnotatedStringNode = selectableTextAnnotatedStringNode.textAnnotatedStringNode;
        ColorProducer colorProducer = textAnnotatedStringNode.overrideColor;
        ColorProducer colorProducer2 = this.color;
        boolean areEqual = Intrinsics.areEqual(colorProducer2, colorProducer);
        textAnnotatedStringNode.overrideColor = colorProducer2;
        TextStyle textStyle = this.style;
        if (areEqual) {
            TextStyle textStyle2 = textAnnotatedStringNode.style;
            if (textStyle == textStyle2) {
                textStyle.getClass();
            }
            z = false;
            boolean updateText$foundation = textAnnotatedStringNode.updateText$foundation(this.text);
            boolean m434updateLayoutRelatedArgsy0kMQk = selectableTextAnnotatedStringNode.textAnnotatedStringNode.m434updateLayoutRelatedArgsy0kMQk(textStyle, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow);
            Function1 function1 = this.onTextLayout;
            Function1 function12 = this.onPlaceholderLayout;
            SelectionController selectionController = this.selectionController;
            textAnnotatedStringNode.doInvalidations(z, updateText$foundation, m434updateLayoutRelatedArgsy0kMQk, textAnnotatedStringNode.updateCallbacks(function1, function12, selectionController, null));
            selectableTextAnnotatedStringNode.selectionController = selectionController;
            DepthSortedSetKt.requireLayoutNode(selectableTextAnnotatedStringNode).invalidateMeasurements$ui();
        }
        z = true;
        boolean updateText$foundation2 = textAnnotatedStringNode.updateText$foundation(this.text);
        boolean m434updateLayoutRelatedArgsy0kMQk2 = selectableTextAnnotatedStringNode.textAnnotatedStringNode.m434updateLayoutRelatedArgsy0kMQk(textStyle, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow);
        Function1 function13 = this.onTextLayout;
        Function1 function122 = this.onPlaceholderLayout;
        SelectionController selectionController2 = this.selectionController;
        textAnnotatedStringNode.doInvalidations(z, updateText$foundation2, m434updateLayoutRelatedArgsy0kMQk2, textAnnotatedStringNode.updateCallbacks(function13, function122, selectionController2, null));
        selectableTextAnnotatedStringNode.selectionController = selectionController2;
        DepthSortedSetKt.requireLayoutNode(selectableTextAnnotatedStringNode).invalidateMeasurements$ui();
    }
}
