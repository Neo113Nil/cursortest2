package androidx.compose.foundation.text;

import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.FillNode$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.unit.Constraints;
import androidx.core.os.BundleKt;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class HeightInLinesNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode, ObserverModifierNode {
    public boolean dirty;
    public TypefaceResult fontResolutionState;
    public int maxLines;
    public int minLines;
    public int precomputedMaxLinesHeight;
    public int precomputedMinLinesHeight;
    public TextStyle resolvedStyle;
    public TextStyle textStyle;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        if (this.dirty) {
            TextStyle requireResolvedStyle = requireResolvedStyle();
            FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalFontFamilyResolver);
            String str = TextFieldDelegateKt.EmptyTextReplacement;
            int computeSizeForDefaultText = (int) (TextFieldDelegateKt.computeSizeForDefaultText(requireResolvedStyle, measureScope, fontFamilyResolverImpl, str, 1) & BodyPartID.bodyIdMax);
            int computeSizeForDefaultText2 = ((int) (TextFieldDelegateKt.computeSizeForDefaultText(requireResolvedStyle, measureScope, fontFamilyResolverImpl, str + '\n' + str, 2) & BodyPartID.bodyIdMax)) - computeSizeForDefaultText;
            int i = this.minLines;
            this.precomputedMinLinesHeight = i == 1 ? -1 : ((i - 1) * computeSizeForDefaultText2) + computeSizeForDefaultText;
            int i2 = this.maxLines;
            this.precomputedMaxLinesHeight = i2 == Integer.MAX_VALUE ? -1 : ((i2 - 1) * computeSizeForDefaultText2) + computeSizeForDefaultText;
            this.dirty = false;
        }
        int i3 = this.precomputedMinLinesHeight;
        int coerceIn = i3 != -1 ? RangesKt___RangesKt.coerceIn(i3, Constraints.m1026getMinHeightimpl(j), Constraints.m1024getMaxHeightimpl(j)) : Constraints.m1026getMinHeightimpl(j);
        int i4 = this.precomputedMaxLinesHeight;
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, coerceIn, i4 != -1 ? RangesKt___RangesKt.coerceIn(i4, Constraints.m1026getMinHeightimpl(j), Constraints.m1024getMaxHeightimpl(j)) : Constraints.m1024getMaxHeightimpl(j), 3));
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo0, 4));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalFontFamilyResolver);
        this.resolvedStyle = BundleKt.resolveDefaults(this.textStyle, DepthSortedSetKt.requireLayoutNode(this).layoutDirection);
        FontFamily fontFamily = requireResolvedStyle().spanStyle.fontFamily;
        FontWeight fontWeight = requireResolvedStyle().spanStyle.fontWeight;
        if (fontWeight == null) {
            fontWeight = FontWeight.Normal;
        }
        FontStyle fontStyle = requireResolvedStyle().spanStyle.fontStyle;
        int i = fontStyle != null ? fontStyle.value : 0;
        FontSynthesis fontSynthesis = requireResolvedStyle().spanStyle.fontSynthesis;
        this.fontResolutionState = fontFamilyResolverImpl.m997resolveDPcqOEQ(fontFamily, fontWeight, i, fontSynthesis != null ? fontSynthesis.value : 65535);
        DepthSortedSetKt.observeReads(this, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 6));
        this.dirty = true;
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        this.dirty = true;
        DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.resolvedStyle = null;
        this.fontResolutionState = null;
        this.dirty = false;
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void onLayoutDirectionChange() {
        this.resolvedStyle = BundleKt.resolveDefaults(this.textStyle, DepthSortedSetKt.requireLayoutNode(this).layoutDirection);
        this.dirty = true;
        DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        if (this.fontResolutionState != null) {
            DepthSortedSetKt.observeReads(this, new Threads$$ExternalSyntheticLambda1(this, 22));
        }
        this.dirty = true;
        DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
    }

    public final TextStyle requireResolvedStyle() {
        TextStyle textStyle = this.resolvedStyle;
        if (textStyle != null) {
            return textStyle;
        }
        throw Recorder$$ExternalSyntheticOutline2.m("Resolved style is not set.");
    }
}
