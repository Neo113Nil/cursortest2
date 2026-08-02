package androidx.compose.foundation.text.modifiers;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends ModifierNodeElement {
    public final ColorProducer color;
    public final FontFamilyResolverImpl fontFamilyResolver;
    public final int maxLines;
    public final int minLines;
    public final Function1 onPlaceholderLayout;
    public final Function1 onShowTranslation;
    public final Function1 onTextLayout;
    public final int overflow;
    public final List placeholders;
    public final boolean softWrap;
    public final TextStyle style;
    public final AnnotatedString text;

    public TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamilyResolverImpl fontFamilyResolverImpl, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, ColorProducer colorProducer, Function1 function13) {
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
        this.color = colorProducer;
        this.onShowTranslation = function13;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new TextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, null, this.color, this.onShowTranslation);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return Intrinsics.areEqual(this.color, textAnnotatedStringElement.color) && Intrinsics.areEqual(this.text, textAnnotatedStringElement.text) && Intrinsics.areEqual(this.style, textAnnotatedStringElement.style) && Intrinsics.areEqual(this.placeholders, textAnnotatedStringElement.placeholders) && Intrinsics.areEqual(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && this.overflow == textAnnotatedStringElement.overflow && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout;
    }

    public final int hashCode() {
        int hashCode = (this.fontFamilyResolver.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.style, this.text.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.onTextLayout;
        int m = (((JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.overflow, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.softWrap) + this.maxLines) * 31) + this.minLines) * 31;
        List list = this.placeholders;
        int hashCode2 = (m + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.onPlaceholderLayout;
        int hashCode3 = (hashCode2 + (function12 != null ? function12.hashCode() : 0)) * 961;
        ColorProducer colorProducer = this.color;
        int hashCode4 = (hashCode3 + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31;
        Function1 function13 = this.onShowTranslation;
        return hashCode4 + (function13 != null ? function13.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1.spanStyle.hasSameNonLayoutAttributes$ui_text(r10.spanStyle) != false) goto L10;
     */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void update(Modifier.Node node) {
        boolean z;
        TextAnnotatedStringNode textAnnotatedStringNode = (TextAnnotatedStringNode) node;
        ColorProducer colorProducer = textAnnotatedStringNode.overrideColor;
        ColorProducer colorProducer2 = this.color;
        boolean areEqual = Intrinsics.areEqual(colorProducer2, colorProducer);
        textAnnotatedStringNode.overrideColor = colorProducer2;
        if (areEqual) {
            TextStyle textStyle = textAnnotatedStringNode.style;
            TextStyle textStyle2 = this.style;
            if (textStyle2 == textStyle) {
                textStyle2.getClass();
            }
            z = false;
            textAnnotatedStringNode.doInvalidations(z, textAnnotatedStringNode.updateText$foundation(this.text), textAnnotatedStringNode.m434updateLayoutRelatedArgsy0kMQk(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow), textAnnotatedStringNode.updateCallbacks(this.onTextLayout, this.onPlaceholderLayout, null, this.onShowTranslation));
        }
        z = true;
        textAnnotatedStringNode.doInvalidations(z, textAnnotatedStringNode.updateText$foundation(this.text), textAnnotatedStringNode.m434updateLayoutRelatedArgsy0kMQk(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow), textAnnotatedStringNode.updateCallbacks(this.onTextLayout, this.onPlaceholderLayout, null, this.onShowTranslation));
    }
}
