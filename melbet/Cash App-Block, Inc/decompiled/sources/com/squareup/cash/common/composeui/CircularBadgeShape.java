package com.squareup.cash.common.composeui;

import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class CircularBadgeShape {
    public final float diameter;

    public CircularBadgeShape(float f) {
        this.diameter = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CircularBadgeShape) && Dp.m1037equalsimpl0(this.diameter, ((CircularBadgeShape) obj).diameter);
    }

    public final int hashCode() {
        return Float.hashCode(this.diameter);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CircularBadgeShape(diameter=", Dp.m1038toStringimpl(this.diameter), ")");
    }
}
