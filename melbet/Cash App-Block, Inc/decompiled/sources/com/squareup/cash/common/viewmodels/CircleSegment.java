package com.squareup.cash.common.viewmodels;

import androidx.compose.ui.graphics.Color;
import kotlin.ULong;

/* loaded from: classes6.dex */
public final class CircleSegment {
    public final long color;
    public final float percent;

    public CircleSegment(long j, float f) {
        this.percent = f;
        this.color = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircleSegment)) {
            return false;
        }
        CircleSegment circleSegment = (CircleSegment) obj;
        return Float.compare(this.percent, circleSegment.percent) == 0 && Color.m676equalsimpl0(this.color, circleSegment.color);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.percent) * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.color) + hashCode;
    }

    public final String toString() {
        return "CircleSegment(percent=" + this.percent + ", color=" + Color.m682toStringimpl(this.color) + ")";
    }
}
