package app.cash.local.views.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalMenuAvailabilityTextStyle {
    public final long defaultTextColor;
    public final TextStyle defaultTextStyle;
    public final float horizontalSpacing;
    public final long soldOutTextColor;
    public final TextStyle soldOutTextStyle;
    public final long strikethroughTextColor;
    public final TextStyle strikethroughTextStyle;

    public LocalMenuAvailabilityTextStyle(TextStyle textStyle, long j, TextStyle textStyle2, long j2, TextStyle textStyle3, long j3, float f) {
        textStyle.getClass();
        textStyle3.getClass();
        this.defaultTextStyle = textStyle;
        this.defaultTextColor = j;
        this.strikethroughTextStyle = textStyle2;
        this.strikethroughTextColor = j2;
        this.soldOutTextStyle = textStyle3;
        this.soldOutTextColor = j3;
        this.horizontalSpacing = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMenuAvailabilityTextStyle)) {
            return false;
        }
        LocalMenuAvailabilityTextStyle localMenuAvailabilityTextStyle = (LocalMenuAvailabilityTextStyle) obj;
        return Intrinsics.areEqual(this.defaultTextStyle, localMenuAvailabilityTextStyle.defaultTextStyle) && Color.m676equalsimpl0(this.defaultTextColor, localMenuAvailabilityTextStyle.defaultTextColor) && this.strikethroughTextStyle.equals(localMenuAvailabilityTextStyle.strikethroughTextStyle) && Color.m676equalsimpl0(this.strikethroughTextColor, localMenuAvailabilityTextStyle.strikethroughTextColor) && Intrinsics.areEqual(this.soldOutTextStyle, localMenuAvailabilityTextStyle.soldOutTextStyle) && Color.m676equalsimpl0(this.soldOutTextColor, localMenuAvailabilityTextStyle.soldOutTextColor) && Dp.m1037equalsimpl0(this.horizontalSpacing, localMenuAvailabilityTextStyle.horizontalSpacing);
    }

    public final int hashCode() {
        int hashCode = this.defaultTextStyle.hashCode() * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Float.hashCode(this.horizontalSpacing) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline1.m(this.soldOutTextStyle, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline1.m(this.strikethroughTextStyle, Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.defaultTextColor), 31), 31, this.strikethroughTextColor), 31), 31, this.soldOutTextColor);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.defaultTextColor);
        String m682toStringimpl2 = Color.m682toStringimpl(this.strikethroughTextColor);
        String m682toStringimpl3 = Color.m682toStringimpl(this.soldOutTextColor);
        String m1038toStringimpl = Dp.m1038toStringimpl(this.horizontalSpacing);
        StringBuilder sb = new StringBuilder("LocalMenuAvailabilityTextStyle(defaultTextStyle=");
        sb.append(this.defaultTextStyle);
        sb.append(", defaultTextColor=");
        sb.append(m682toStringimpl);
        sb.append(", strikethroughTextStyle=");
        sb.append(this.strikethroughTextStyle);
        sb.append(", strikethroughTextColor=");
        sb.append(m682toStringimpl2);
        sb.append(", soldOutTextStyle=");
        sb.append(this.soldOutTextStyle);
        sb.append(", soldOutTextColor=");
        sb.append(m682toStringimpl3);
        sb.append(", horizontalSpacing=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m1038toStringimpl, ")");
    }
}
