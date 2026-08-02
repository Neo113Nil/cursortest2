package androidx.compose.foundation.text.modifiers;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextStringSimpleElement extends ModifierNodeElement {
    public final ColorProducer color;
    public final FontFamilyResolverImpl fontFamilyResolver;
    public final int maxLines;
    public final int minLines;
    public final int overflow;
    public final boolean softWrap;
    public final TextStyle style;
    public final String text;

    public TextStringSimpleElement(String str, TextStyle textStyle, FontFamilyResolverImpl fontFamilyResolverImpl, int i, boolean z, int i2, int i3, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = fontFamilyResolverImpl;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.color = colorProducer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        TextStringSimpleNode textStringSimpleNode = new TextStringSimpleNode();
        textStringSimpleNode.text = this.text;
        textStringSimpleNode.style = this.style;
        textStringSimpleNode.fontFamilyResolver = this.fontFamilyResolver;
        textStringSimpleNode.overflow = this.overflow;
        textStringSimpleNode.softWrap = this.softWrap;
        textStringSimpleNode.maxLines = this.maxLines;
        textStringSimpleNode.minLines = this.minLines;
        textStringSimpleNode.overrideColor = this.color;
        return textStringSimpleNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return Intrinsics.areEqual(this.color, textStringSimpleElement.color) && Intrinsics.areEqual(this.text, textStringSimpleElement.text) && Intrinsics.areEqual(this.style, textStringSimpleElement.style) && Intrinsics.areEqual(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && this.overflow == textStringSimpleElement.overflow && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    public final int hashCode() {
        int m = (((JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.overflow, (this.fontFamilyResolver.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.style, this.text.hashCode() * 31, 31)) * 31, 31), 31, this.softWrap) + this.maxLines) * 31) + this.minLines) * 31;
        ColorProducer colorProducer = this.color;
        return m + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r5.spanStyle.hasSameNonLayoutAttributes$ui_text(r2.spanStyle) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0075  */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void update(Modifier.Node node) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        FontFamilyResolverImpl fontFamilyResolverImpl;
        FontFamilyResolverImpl fontFamilyResolverImpl2;
        int i5;
        int i6;
        TextStringSimpleNode textStringSimpleNode = (TextStringSimpleNode) node;
        ColorProducer colorProducer = textStringSimpleNode.overrideColor;
        ColorProducer colorProducer2 = this.color;
        boolean areEqual = Intrinsics.areEqual(colorProducer2, colorProducer);
        textStringSimpleNode.overrideColor = colorProducer2;
        boolean z4 = false;
        boolean z5 = true;
        TextStyle textStyle = this.style;
        if (areEqual) {
            TextStyle textStyle2 = textStringSimpleNode.style;
            if (textStyle == textStyle2) {
                textStyle.getClass();
            }
            z = false;
            str = textStringSimpleNode.text;
            str2 = this.text;
            if (!Intrinsics.areEqual(str, str2)) {
                textStringSimpleNode.text = str2;
                textStringSimpleNode.textSubstitution = null;
                z4 = true;
            }
            boolean z6 = !textStringSimpleNode.style.hasSameLayoutAffectingAttributes(textStyle);
            textStringSimpleNode.style = textStyle;
            i = textStringSimpleNode.minLines;
            i2 = this.minLines;
            if (i != i2) {
                textStringSimpleNode.minLines = i2;
                z6 = true;
            }
            i3 = textStringSimpleNode.maxLines;
            i4 = this.maxLines;
            if (i3 != i4) {
                textStringSimpleNode.maxLines = i4;
                z6 = true;
            }
            z2 = textStringSimpleNode.softWrap;
            z3 = this.softWrap;
            if (z2 != z3) {
                textStringSimpleNode.softWrap = z3;
                z6 = true;
            }
            fontFamilyResolverImpl = textStringSimpleNode.fontFamilyResolver;
            fontFamilyResolverImpl2 = this.fontFamilyResolver;
            if (!Intrinsics.areEqual(fontFamilyResolverImpl, fontFamilyResolverImpl2)) {
                textStringSimpleNode.fontFamilyResolver = fontFamilyResolverImpl2;
                z6 = true;
            }
            i5 = textStringSimpleNode.overflow;
            i6 = this.overflow;
            if (i5 != i6) {
                z5 = z6;
            } else {
                textStringSimpleNode.overflow = i6;
            }
            if (!z || z4 || z5) {
                textStringSimpleNode.resolvedInheritedStyle = null;
            }
            if (!z4 || z5) {
                textStringSimpleNode.getLayoutCache().m433updateL6sJoHM(textStringSimpleNode.text, textStringSimpleNode.style, textStringSimpleNode.fontFamilyResolver, textStringSimpleNode.overflow, textStringSimpleNode.softWrap, textStringSimpleNode.maxLines, textStringSimpleNode.minLines);
            }
            if (textStringSimpleNode.isAttached()) {
                return;
            }
            if (z4 || (z && textStringSimpleNode.semanticsTextLayoutResult != null)) {
                DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateSemantics$ui();
            }
            if (z4 || z5) {
                DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateMeasurements$ui();
                DepthSortedSetKt.invalidateDraw(textStringSimpleNode);
            }
            if (z) {
                DepthSortedSetKt.invalidateDraw(textStringSimpleNode);
                return;
            }
            return;
        }
        z = true;
        str = textStringSimpleNode.text;
        str2 = this.text;
        if (!Intrinsics.areEqual(str, str2)) {
        }
        boolean z62 = !textStringSimpleNode.style.hasSameLayoutAffectingAttributes(textStyle);
        textStringSimpleNode.style = textStyle;
        i = textStringSimpleNode.minLines;
        i2 = this.minLines;
        if (i != i2) {
        }
        i3 = textStringSimpleNode.maxLines;
        i4 = this.maxLines;
        if (i3 != i4) {
        }
        z2 = textStringSimpleNode.softWrap;
        z3 = this.softWrap;
        if (z2 != z3) {
        }
        fontFamilyResolverImpl = textStringSimpleNode.fontFamilyResolver;
        fontFamilyResolverImpl2 = this.fontFamilyResolver;
        if (!Intrinsics.areEqual(fontFamilyResolverImpl, fontFamilyResolverImpl2)) {
        }
        i5 = textStringSimpleNode.overflow;
        i6 = this.overflow;
        if (i5 != i6) {
        }
        if (!z) {
        }
        textStringSimpleNode.resolvedInheritedStyle = null;
        if (!z4) {
        }
        textStringSimpleNode.getLayoutCache().m433updateL6sJoHM(textStringSimpleNode.text, textStringSimpleNode.style, textStringSimpleNode.fontFamilyResolver, textStringSimpleNode.overflow, textStringSimpleNode.softWrap, textStringSimpleNode.maxLines, textStringSimpleNode.minLines);
        if (textStringSimpleNode.isAttached()) {
        }
    }
}
