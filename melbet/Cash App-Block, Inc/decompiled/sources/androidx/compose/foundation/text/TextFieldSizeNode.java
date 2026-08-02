package androidx.compose.foundation.text;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.FillNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextFieldSizeNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public TypefaceResult fontResolutionState;
    public TextFieldSize minSizeState;
    public final TextStyle style;

    public TextFieldSizeNode(TextStyle textStyle) {
        this.style = textStyle;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long computeSizeForDefaultText;
        TextFieldSize textFieldSize = this.minSizeState;
        if (textFieldSize == null) {
            throw Recorder$$ExternalSyntheticOutline2.m("Min size state is not set.");
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = textFieldSize.dirty$delegate;
        TypefaceResult typefaceResult = this.fontResolutionState;
        if (typefaceResult == null) {
            throw Recorder$$ExternalSyntheticOutline2.m("Font resolution state is not set.");
        }
        Object value = typefaceResult.getValue();
        if (!Intrinsics.areEqual(value, textFieldSize.typeface)) {
            textFieldSize.typeface = value;
            parcelableSnapshotMutableState.setValue(Boolean.TRUE);
        }
        if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
            computeSizeForDefaultText = TextFieldDelegateKt.computeSizeForDefaultText(textFieldSize.resolvedStyle, textFieldSize.density, textFieldSize.fontFamilyResolver, TextFieldDelegateKt.EmptyTextReplacement, 1);
            textFieldSize.minSize = computeSizeForDefaultText;
            parcelableSnapshotMutableState.setValue(Boolean.FALSE);
        }
        long j2 = textFieldSize.minSize;
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.m1031constrainN9IONVI(j, ConstraintsKt.Constraints$default((int) (j2 >> 32), 0, (int) (j2 & BodyPartID.bodyIdMax), 0, 10)));
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo0, 5));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        TextStyle resolveDefaults = BundleKt.resolveDefaults(this.style, DepthSortedSetKt.requireLayoutNode(this).layoutDirection);
        FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalFontFamilyResolver);
        updateFontResolutionState(resolveDefaults, fontFamilyResolverImpl);
        LayoutDirection layoutDirection = DepthSortedSetKt.requireLayoutNode(this).layoutDirection;
        Density density = DepthSortedSetKt.requireLayoutNode(this).density;
        TypefaceResult typefaceResult = this.fontResolutionState;
        if (typefaceResult == null) {
            throw Recorder$$ExternalSyntheticOutline2.m("Font resolution state is not set.");
        }
        this.minSizeState = new TextFieldSize(layoutDirection, density, fontFamilyResolverImpl, resolveDefaults, typefaceResult.getValue());
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        TextFieldSize textFieldSize = this.minSizeState;
        if (textFieldSize != null) {
            TextFieldSize.update$default(textFieldSize, null, DepthSortedSetKt.requireLayoutNode(this).density, null, 29);
        }
        DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.fontResolutionState = null;
        this.minSizeState = null;
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void onLayoutDirectionChange() {
        TextFieldSize textFieldSize = this.minSizeState;
        if (textFieldSize != null) {
            TextFieldSize.update$default(textFieldSize, DepthSortedSetKt.requireLayoutNode(this).layoutDirection, null, null, 30);
        }
        DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
    }

    public final void updateFontResolutionState(TextStyle textStyle, FontFamilyResolverImpl fontFamilyResolverImpl) {
        SpanStyle spanStyle = textStyle.spanStyle;
        FontFamily fontFamily = spanStyle.fontFamily;
        FontWeight fontWeight = spanStyle.fontWeight;
        if (fontWeight == null) {
            fontWeight = FontWeight.Normal;
        }
        FontStyle fontStyle = spanStyle.fontStyle;
        int i = fontStyle != null ? fontStyle.value : 0;
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        this.fontResolutionState = fontFamilyResolverImpl.m997resolveDPcqOEQ(fontFamily, fontWeight, i, fontSynthesis != null ? fontSynthesis.value : 65535);
        DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
    }
}
