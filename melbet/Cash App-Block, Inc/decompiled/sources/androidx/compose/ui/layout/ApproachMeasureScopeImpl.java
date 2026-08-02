package androidx.compose.ui.layout;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {
    public boolean approachMeasureRequired;
    public ApproachLayoutModifierNode approachNode;
    public final LayoutModifierNodeCoordinator coordinator;

    public ApproachMeasureScopeImpl(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = layoutModifierNodeCoordinator;
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.coordinator.layoutNode.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(final int i, final int i2, final Map map, final Function1 function1, final Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i, i2, map, function1, function12, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl$layout$1
            public final /* synthetic */ Function1 $placementBlock;
            public final Map alignmentLines;
            public final int height;
            public final Function1 rulers;
            public final /* synthetic */ ApproachMeasureScopeImpl this$0;
            public final int width;

            {
                this.$placementBlock = function12;
                this.this$0 = this;
                this.width = i;
                this.height = i2;
                this.alignmentLines = map;
                this.rulers = function1;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Map getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Function1 getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
                this.$placementBlock.invoke(this.this$0.coordinator.placementScope);
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public final int mo229roundToPxR2X_6o(long j) {
        return this.coordinator.mo229roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public final int mo230roundToPx0680j_4(float f) {
        return this.coordinator.mo230roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public final float mo231toDpGaN1DYA(long j) {
        return this.coordinator.mo231toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo232toDpu2uoSUM(float f) {
        return f / this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public final long mo234toDpSizekrfVVM(long j) {
        return this.coordinator.mo234toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            return layoutCoordinates;
        }
        if (layoutCoordinates instanceof NodeCoordinator) {
            LookaheadDelegate lookaheadDelegate = ((NodeCoordinator) layoutCoordinates).getLookaheadDelegate();
            return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.lookaheadLayoutCoordinates) == null) ? layoutCoordinates : lookaheadLayoutCoordinates;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported LayoutCoordinates");
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
        return null;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public final float mo235toPxR2X_6o(long j) {
        return this.coordinator.mo235toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public final float mo236toPx0680j_4(float f) {
        return this.coordinator.getDensity() * f;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public final long mo237toSizeXkaWNTQ(long j) {
        return this.coordinator.mo237toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public final long mo238toSp0xMU5do(float f) {
        return this.coordinator.mo238toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo239toSpkPz2Gy4(float f) {
        return this.coordinator.mo239toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo233toDpu2uoSUM(int i) {
        return this.coordinator.mo233toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(int i, int i2, Map map, Function1 function1) {
        return this.coordinator.layout(i, i2, map, null, function1);
    }
}
