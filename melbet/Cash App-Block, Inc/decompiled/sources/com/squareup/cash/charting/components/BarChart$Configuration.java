package com.squareup.cash.charting.components;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes6.dex */
public final class BarChart$Configuration {
    public final boolean animateBar;
    public final long backgroundColor;
    public final long barColor;
    public final float bottomEndCornerRadius;
    public final float bottomStartCornerRadius;
    public final BarChart$Direction direction;
    public final boolean reverseDirection;
    public final long shadowColor;
    public final float shadowSize;
    public final float topEndCornerRadius;
    public final float topStartCornerRadius;

    public BarChart$Configuration(long j, long j2, long j3, float f, boolean z, int i) {
        BarChart$Direction barChart$Direction = BarChart$Direction.HORIZONTAL;
        j = (i & 1) != 0 ? Color.Green : j;
        j2 = (i & 2) != 0 ? Color.Transparent : j2;
        j3 = (i & 4) != 0 ? Color.Transparent : j3;
        int i2 = i & 8;
        float f2 = RecyclerView.DECELERATION_RATE;
        f = i2 != 0 ? 0.0f : f;
        f2 = (i & 16) == 0 ? 150.0f : f2;
        barChart$Direction = (i & 32) != 0 ? BarChart$Direction.VERTICAL : barChart$Direction;
        z = (i & 64) != 0 ? false : z;
        this.barColor = j;
        this.backgroundColor = j2;
        this.shadowColor = j3;
        this.shadowSize = f;
        this.topStartCornerRadius = f2;
        this.topEndCornerRadius = f2;
        this.bottomStartCornerRadius = f2;
        this.bottomEndCornerRadius = f2;
        this.direction = barChart$Direction;
        this.reverseDirection = z;
        this.animateBar = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarChart$Configuration)) {
            return false;
        }
        BarChart$Configuration barChart$Configuration = (BarChart$Configuration) obj;
        return Color.m676equalsimpl0(this.barColor, barChart$Configuration.barColor) && Color.m676equalsimpl0(this.backgroundColor, barChart$Configuration.backgroundColor) && Color.m676equalsimpl0(this.shadowColor, barChart$Configuration.shadowColor) && Dp.m1037equalsimpl0(this.shadowSize, barChart$Configuration.shadowSize) && Dp.m1037equalsimpl0(this.topStartCornerRadius, barChart$Configuration.topStartCornerRadius) && Dp.m1037equalsimpl0(this.topEndCornerRadius, barChart$Configuration.topEndCornerRadius) && Dp.m1037equalsimpl0(this.bottomStartCornerRadius, barChart$Configuration.bottomStartCornerRadius) && Dp.m1037equalsimpl0(this.bottomEndCornerRadius, barChart$Configuration.bottomEndCornerRadius) && this.direction == barChart$Configuration.direction && this.reverseDirection == barChart$Configuration.reverseDirection && this.animateBar == barChart$Configuration.animateBar;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Boolean.hashCode(this.animateBar) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.direction.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.bottomEndCornerRadius, CameraState$Type$EnumUnboxingLocalUtility.m(this.bottomStartCornerRadius, CameraState$Type$EnumUnboxingLocalUtility.m(this.topEndCornerRadius, CameraState$Type$EnumUnboxingLocalUtility.m(this.topStartCornerRadius, CameraState$Type$EnumUnboxingLocalUtility.m(this.shadowSize, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.barColor) * 31, 31, this.backgroundColor), 31, this.shadowColor), 31), 31), 31), 31), 31)) * 31, 31, this.reverseDirection);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.barColor);
        String m682toStringimpl2 = Color.m682toStringimpl(this.backgroundColor);
        String m682toStringimpl3 = Color.m682toStringimpl(this.shadowColor);
        String m1038toStringimpl = Dp.m1038toStringimpl(this.shadowSize);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.topStartCornerRadius);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(this.topEndCornerRadius);
        String m1038toStringimpl4 = Dp.m1038toStringimpl(this.bottomStartCornerRadius);
        String m1038toStringimpl5 = Dp.m1038toStringimpl(this.bottomEndCornerRadius);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Configuration(barColor=", m682toStringimpl, ", backgroundColor=", m682toStringimpl2, ", shadowColor=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", shadowSize=", m1038toStringimpl, ", topStartCornerRadius=");
        Boxes$$ExternalSyntheticOutline1.m(m, m1038toStringimpl2, ", topEndCornerRadius=", m1038toStringimpl3, ", bottomStartCornerRadius=");
        Boxes$$ExternalSyntheticOutline1.m(m, m1038toStringimpl4, ", bottomEndCornerRadius=", m1038toStringimpl5, ", direction=");
        m.append(this.direction);
        m.append(", reverseDirection=");
        m.append(this.reverseDirection);
        m.append(", animateBar=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.animateBar, ")");
    }
}
