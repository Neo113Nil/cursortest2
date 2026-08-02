package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.FillNode$$ExternalSyntheticLambda0;
import androidx.compose.foundation.relocation.BringIntoViewRequesterNode;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.DimensionKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifierNode extends DelegatingNode implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public Map baselineCache;
    public final BringIntoViewRequesterNode bringIntoViewRequesterNode;
    public boolean singleLine;
    public TextLayoutState textLayoutState;

    public TextFieldTextLayoutModifierNode(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.singleLine = z;
        BringIntoViewRequesterNode bringIntoViewRequesterNode = new BringIntoViewRequesterNode(textLayoutState.bringIntoViewRequester);
        delegate(bringIntoViewRequesterNode);
        this.bringIntoViewRequesterNode = bringIntoViewRequesterNode;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        textLayoutState2.getClass();
        boolean z2 = this.singleLine;
        boolean z3 = !z2;
        TextFieldLayoutStateCache textFieldLayoutStateCache = textLayoutState2.layoutCache;
        textFieldLayoutStateCache.getClass();
        textFieldLayoutStateCache.nonMeasureInputs$delegate.setValue(new TextFieldLayoutStateCache.NonMeasureInputs(transformedTextFieldState, textStyle, z2, z3, keyboardOptions.keyboardType == 4));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        TextLayoutState textLayoutState = this.textLayoutState;
        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
        FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalFontFamilyResolver);
        TextFieldLayoutStateCache textFieldLayoutStateCache = textLayoutState.layoutCache;
        textFieldLayoutStateCache.getClass();
        TextFieldLayoutStateCache.MeasureInputs measureInputs = new TextFieldLayoutStateCache.MeasureInputs(measureScope, layoutDirection, fontFamilyResolverImpl, j);
        textFieldLayoutStateCache.measureInputs$delegate.setValue(measureInputs);
        TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs = (TextFieldLayoutStateCache.NonMeasureInputs) textFieldLayoutStateCache.nonMeasureInputs$delegate.getValue();
        if (nonMeasureInputs == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            OptionalProvider$$ExternalSyntheticLambda0.m$1();
            return null;
        }
        TextLayoutResult orComputeLayout = textFieldLayoutStateCache.getOrComputeLayout(nonMeasureInputs, measureInputs);
        long j2 = orComputeLayout.size;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(DimensionKt.m1465fitPrioritizingWidthZbe2FdA(i, i, i2, i2));
        this.textLayoutState.minHeightForSingleLineField$delegate.setValue(new Dp(this.singleLine ? measureScope.mo233toDpu2uoSUM(BasicTextKt.ceilToIntPx(orComputeLayout.multiParagraph.getLineBottom(0))) : RecyclerView.DECELERATION_RATE));
        Map map = this.baselineCache;
        if (map == null) {
            map = new LinkedHashMap(2);
        }
        map.put(AlignmentLineKt.FirstBaseline, Integer.valueOf(Math.round(orComputeLayout.firstBaseline)));
        map.put(AlignmentLineKt.LastBaseline, Integer.valueOf(Math.round(orComputeLayout.lastBaseline)));
        this.baselineCache = map;
        return measureScope.layout(i, i2, map, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo0, 6));
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        this.textLayoutState.textLayoutNodeCoordinates$delegate.setValue(nodeCoordinator);
    }
}
