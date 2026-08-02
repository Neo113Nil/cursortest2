package androidx.compose.ui.layout;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ApproachIntrinsicsMeasureScope implements ApproachMeasureScope, ApproachIntrinsicMeasureScope {
    public final /* synthetic */ ApproachIntrinsicMeasureScope $$delegate_0;
    public final LayoutDirection layoutDirection;

    public ApproachIntrinsicsMeasureScope(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.$$delegate_0 = approachIntrinsicMeasureScope;
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(final int i, final int i2, final Map map, final Function1 function1, Function1 function12) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope$layout$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public final Map getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getHeight() {
                return i2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Function1 getRulers() {
                return function1;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getWidth() {
                return i;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public final int mo229roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo229roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public final int mo230roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo230roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public final float mo231toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo231toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo232toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo232toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public final long mo234toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo234toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public final float mo235toPxR2X_6o(long j) {
        return this.$$delegate_0.mo235toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public final float mo236toPx0680j_4(float f) {
        return this.$$delegate_0.mo236toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public final long mo237toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo237toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public final long mo238toSp0xMU5do(float f) {
        return this.$$delegate_0.mo238toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo239toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo239toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo233toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo233toDpu2uoSUM(i);
    }
}
