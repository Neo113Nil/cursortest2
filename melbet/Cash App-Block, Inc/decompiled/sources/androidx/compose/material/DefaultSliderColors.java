package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Color;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class DefaultSliderColors {
    public final long activeTickColor;
    public final long activeTrackColor;
    public final long disabledActiveTickColor;
    public final long disabledActiveTrackColor;
    public final long disabledInactiveTickColor;
    public final long disabledInactiveTrackColor;
    public final long disabledThumbColor;
    public final long inactiveTickColor;
    public final long inactiveTrackColor;
    public final long thumbColor;

    public DefaultSliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.thumbColor = j;
        this.disabledThumbColor = j2;
        this.activeTrackColor = j3;
        this.inactiveTrackColor = j4;
        this.disabledActiveTrackColor = j5;
        this.disabledInactiveTrackColor = j6;
        this.activeTickColor = j7;
        this.inactiveTickColor = j8;
        this.disabledActiveTickColor = j9;
        this.disabledInactiveTickColor = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSliderColors.class != obj.getClass()) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) obj;
        return Color.m676equalsimpl0(this.thumbColor, defaultSliderColors.thumbColor) && Color.m676equalsimpl0(this.disabledThumbColor, defaultSliderColors.disabledThumbColor) && Color.m676equalsimpl0(this.activeTrackColor, defaultSliderColors.activeTrackColor) && Color.m676equalsimpl0(this.inactiveTrackColor, defaultSliderColors.inactiveTrackColor) && Color.m676equalsimpl0(this.disabledActiveTrackColor, defaultSliderColors.disabledActiveTrackColor) && Color.m676equalsimpl0(this.disabledInactiveTrackColor, defaultSliderColors.disabledInactiveTrackColor) && Color.m676equalsimpl0(this.activeTickColor, defaultSliderColors.activeTickColor) && Color.m676equalsimpl0(this.inactiveTickColor, defaultSliderColors.inactiveTickColor) && Color.m676equalsimpl0(this.disabledActiveTickColor, defaultSliderColors.disabledActiveTickColor) && Color.m676equalsimpl0(this.disabledInactiveTickColor, defaultSliderColors.disabledInactiveTickColor);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.disabledInactiveTickColor) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.thumbColor) * 31, 31, this.disabledThumbColor), 31, this.activeTrackColor), 31, this.inactiveTrackColor), 31, this.disabledActiveTrackColor), 31, this.disabledInactiveTrackColor), 31, this.activeTickColor), 31, this.inactiveTickColor), 31, this.disabledActiveTickColor);
    }

    public final MutableState tickColor(boolean z, boolean z2, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1491563694);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(z ? z2 ? this.activeTickColor : this.inactiveTickColor : z2 ? this.disabledActiveTickColor : this.disabledInactiveTickColor), gapComposer);
        gapComposer.end(false);
        return rememberUpdatedState;
    }

    public final MutableState trackColor(boolean z, boolean z2, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1575395620);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(z ? z2 ? this.activeTrackColor : this.inactiveTrackColor : z2 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor), gapComposer);
        gapComposer.end(false);
        return rememberUpdatedState;
    }
}
