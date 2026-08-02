package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    public SpringSpec animationSpec;
    public boolean checked;
    public float initialOffset;
    public float initialSize;
    public MutableInteractionSourceImpl interactionSource;
    public boolean isPressed;
    public Animatable offsetAnim;
    public Animatable sizeAnim;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int i = 0;
        float mo236toPx0680j_4 = measureScope.mo236toPx0680j_4(this.isPressed ? SwitchTokens.PressedHandleWidth : ((measurable.maxIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j)) != 0 && measurable.maxIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j)) != 0) || this.checked) ? SwitchKt.ThumbDiameter : SwitchKt.UncheckedThumbDiameter);
        Animatable animatable = this.sizeAnim;
        int floatValue = (int) (animatable != null ? ((Number) animatable.getValue()).floatValue() : mo236toPx0680j_4);
        if (!((floatValue >= 0) & (floatValue >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.createConstraints(floatValue, floatValue, floatValue, floatValue));
        float mo236toPx0680j_42 = measureScope.mo236toPx0680j_4((SwitchKt.SwitchHeight - measureScope.mo232toDpu2uoSUM(mo236toPx0680j_4)) / 2.0f);
        float mo236toPx0680j_43 = measureScope.mo236toPx0680j_4((SwitchKt.SwitchWidth - SwitchKt.ThumbDiameter) - SwitchKt.ThumbPadding);
        boolean z = this.isPressed;
        if (z && this.checked) {
            mo236toPx0680j_42 = mo236toPx0680j_43 - measureScope.mo236toPx0680j_4(SwitchTokens.TrackOutlineWidth);
        } else if (z && !this.checked) {
            mo236toPx0680j_42 = measureScope.mo236toPx0680j_4(SwitchTokens.TrackOutlineWidth);
        } else if (this.checked) {
            mo236toPx0680j_42 = mo236toPx0680j_43;
        }
        Animatable animatable2 = this.sizeAnim;
        if (!Intrinsics.areEqual(animatable2 != null ? (Float) animatable2.targetValue$delegate.getValue() : null, mo236toPx0680j_4)) {
            JobKt.launch$default(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, mo236toPx0680j_4, null, 0), 3);
        }
        Animatable animatable3 = this.offsetAnim;
        if (!Intrinsics.areEqual(animatable3 != null ? (Float) animatable3.targetValue$delegate.getValue() : null, mo236toPx0680j_42)) {
            JobKt.launch$default(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, mo236toPx0680j_42, null, 1), 3);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = mo236toPx0680j_4;
            this.initialOffset = mo236toPx0680j_42;
        }
        return MeasureScope.layout$default(measureScope, floatValue, floatValue, new ThumbNode$$ExternalSyntheticLambda0(mo833measureBRTryo0, this, mo236toPx0680j_42, i));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        JobKt.launch$default(getCoroutineScope(), null, null, new ThumbNode$onAttach$1(this, (Continuation) null, 0), 3);
    }
}
