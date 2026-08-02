package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public boolean isVertical;
    public ScrollState state;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver);
        final int i = 0;
        final int i2 = 1;
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new Function0(this) { // from class: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda1
            public final /* synthetic */ ScrollNode f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int intValue;
                int i3 = i;
                ScrollNode scrollNode = this.f$0;
                switch (i3) {
                    case 0:
                        intValue = scrollNode.state.value$delegate.getIntValue();
                        break;
                    default:
                        intValue = scrollNode.state._maxValueState.getIntValue();
                        break;
                }
                return Float.valueOf(intValue);
            }
        }, new Function0(this) { // from class: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda1
            public final /* synthetic */ ScrollNode f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int intValue;
                int i3 = i2;
                ScrollNode scrollNode = this.f$0;
                switch (i3) {
                    case 0:
                        intValue = scrollNode.state.value$delegate.getIntValue();
                        break;
                    default:
                        intValue = scrollNode.state._maxValueState.getIntValue();
                        break;
                }
                return Float.valueOf(intValue);
            }
        });
        if (this.isVertical) {
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.VerticalScrollAxisRange;
            KProperty kProperty = SemanticsPropertiesKt.$$delegatedProperties[13];
            semanticsPropertyReceiver.set(semanticsPropertyKey, scrollAxisRange);
        } else {
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.HorizontalScrollAxisRange;
            KProperty kProperty2 = SemanticsPropertiesKt.$$delegatedProperties[12];
            semanticsPropertyReceiver.set(semanticsPropertyKey2, scrollAxisRange);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        ImageKt.m180checkScrollableContainerConstraintsK40F9xA(j, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, this.isVertical ? Constraints.m1025getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m1024getMaxHeightimpl(j), 5));
        int i = mo833measureBRTryo0.width;
        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
        if (i > m1025getMaxWidthimpl) {
            i = m1025getMaxWidthimpl;
        }
        int i2 = mo833measureBRTryo0.height;
        int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
        if (i2 > m1024getMaxHeightimpl) {
            i2 = m1024getMaxHeightimpl;
        }
        int i3 = mo833measureBRTryo0.height - i2;
        int i4 = mo833measureBRTryo0.width - i;
        if (!this.isVertical) {
            i3 = i4;
        }
        this.state.setMaxValue$foundation(i3);
        this.state.viewportSize$delegate.setIntValue(this.isVertical ? i2 : i);
        this.state.contentSize$delegate.setIntValue(this.isVertical ? mo833measureBRTryo0.height : mo833measureBRTryo0.width);
        return MeasureScope.layout$default(measureScope, i, i2, new ScrollNode$$ExternalSyntheticLambda0(this, i3, mo833measureBRTryo0, 0));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }
}
