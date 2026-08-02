package com.squareup.cash.sheet;

import androidx.compose.foundation.layout.ValueInsets;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.util.compose.SquircleShape;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class AnimatedCornerShape implements Shape {
    public final Integer contentHeight;
    public final Offset contentPosition;
    public final SquircleShape delegate;
    public final RealSheetState state;
    public final WindowInsets statusBarInsets;
    public final SheetTopCornerBehavior topCornerBehavior;
    public final Integer viewportHeight;

    public AnimatedCornerShape(Integer num, Integer num2, Offset offset, RealSheetState realSheetState, SquircleShape squircleShape, ValueInsets valueInsets, SheetTopCornerBehavior sheetTopCornerBehavior) {
        valueInsets.getClass();
        sheetTopCornerBehavior.getClass();
        this.contentHeight = num;
        this.viewportHeight = num2;
        this.contentPosition = offset;
        this.state = realSheetState;
        this.delegate = squircleShape;
        this.statusBarInsets = valueInsets;
        this.topCornerBehavior = sheetTopCornerBehavior;
    }

    public final float calculateDistanceFractionFromStatusBar(Density density) {
        density.getClass();
        RealSheetState realSheetState = this.state;
        Integer num = (Integer) realSheetState.viewportHeightPx$delegate.getValue();
        Integer num2 = (Integer) realSheetState.contentHeightPx$delegate.getValue();
        Offset offset = (Offset) realSheetState.contentPositionInWindow$delegate.getValue();
        if (num != null && num2 != null && offset != null) {
            int top = this.statusBarInsets.getTop(density);
            if (num2.intValue() >= num.intValue() - top) {
                float intValue = num2.intValue() * 0.3f;
                float f = top;
                if (intValue < f) {
                    intValue = f;
                }
                return intValue == RecyclerView.DECELERATION_RATE ? RecyclerView.DECELERATION_RATE : RangesKt___RangesKt.coerceIn((Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax)) - RecyclerView.DECELERATION_RATE) / (intValue - RecyclerView.DECELERATION_RATE), RecyclerView.DECELERATION_RATE, 1.0f);
            }
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float calculateDistanceFractionFromStatusBar;
        layoutDirection.getClass();
        density.getClass();
        int ordinal = this.topCornerBehavior.ordinal();
        if (ordinal == 0) {
            calculateDistanceFractionFromStatusBar = calculateDistanceFractionFromStatusBar(density);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            calculateDistanceFractionFromStatusBar = 1.0f;
        }
        CornerBasedShape cornerBasedShape = this.delegate;
        if (calculateDistanceFractionFromStatusBar != 1.0f) {
            cornerBasedShape = CornerBasedShape.copy$default(cornerBasedShape, new AnimatedCornerShape$fraction$1(cornerBasedShape.topStart, calculateDistanceFractionFromStatusBar, 0), new AnimatedCornerShape$fraction$1(cornerBasedShape.topEnd, calculateDistanceFractionFromStatusBar, 0), null, null, 12);
        }
        return cornerBasedShape.mo175createOutlinePq9zytI(j, layoutDirection, density);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnimatedCornerShape) {
            AnimatedCornerShape animatedCornerShape = (AnimatedCornerShape) obj;
            if (Intrinsics.areEqual(this.contentHeight, animatedCornerShape.contentHeight) && Intrinsics.areEqual(this.viewportHeight, animatedCornerShape.viewportHeight) && Intrinsics.areEqual(this.contentPosition, animatedCornerShape.contentPosition) && this.state == animatedCornerShape.state && this.delegate == animatedCornerShape.delegate && Intrinsics.areEqual(this.statusBarInsets, animatedCornerShape.statusBarInsets) && this.topCornerBehavior == animatedCornerShape.topCornerBehavior) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.contentHeight;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.viewportHeight;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Offset offset = this.contentPosition;
        return this.topCornerBehavior.hashCode() + ((this.statusBarInsets.hashCode() + ((this.delegate.hashCode() + ((this.state.hashCode() + ((hashCode2 + (offset != null ? Long.hashCode(offset.packedValue) : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AnimatedCornerShape(contentHeight=" + this.contentHeight + ", viewportHeight=" + this.viewportHeight + ", contentPosition=" + this.contentPosition + ", state=" + this.state + ", delegate=" + this.delegate + ", statusBarInsets=" + this.statusBarInsets + ", topCornerBehavior=" + this.topCornerBehavior + ")";
    }
}
