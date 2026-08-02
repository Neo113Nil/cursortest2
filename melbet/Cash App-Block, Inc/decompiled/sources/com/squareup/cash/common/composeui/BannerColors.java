package com.squareup.cash.common.composeui;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes6.dex */
public final class BannerColors {
    public final long backgroundColor;
    public final long borderColor;
    public final long buttonColor;
    public final long dividerColor;
    public final long iconColor;
    public final long linkColor;
    public final long subtitleColor;
    public final long titleColor;

    public BannerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.borderColor = j;
        this.backgroundColor = j2;
        this.iconColor = j3;
        this.titleColor = j4;
        this.subtitleColor = j5;
        this.buttonColor = j6;
        this.linkColor = j7;
        this.dividerColor = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerColors)) {
            return false;
        }
        BannerColors bannerColors = (BannerColors) obj;
        return Color.m676equalsimpl0(this.borderColor, bannerColors.borderColor) && Color.m676equalsimpl0(this.backgroundColor, bannerColors.backgroundColor) && Color.m676equalsimpl0(this.iconColor, bannerColors.iconColor) && Color.m676equalsimpl0(this.titleColor, bannerColors.titleColor) && Color.m676equalsimpl0(this.subtitleColor, bannerColors.subtitleColor) && Color.m676equalsimpl0(this.buttonColor, bannerColors.buttonColor) && Color.m676equalsimpl0(this.linkColor, bannerColors.linkColor) && Color.m676equalsimpl0(this.dividerColor, bannerColors.dividerColor);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.dividerColor) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.borderColor) * 31, 31, this.backgroundColor), 31, this.iconColor), 31, this.titleColor), 31, this.subtitleColor), 31, this.buttonColor), 31, this.linkColor);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.borderColor);
        String m682toStringimpl2 = Color.m682toStringimpl(this.backgroundColor);
        String m682toStringimpl3 = Color.m682toStringimpl(this.iconColor);
        String m682toStringimpl4 = Color.m682toStringimpl(this.titleColor);
        String m682toStringimpl5 = Color.m682toStringimpl(this.subtitleColor);
        String m682toStringimpl6 = Color.m682toStringimpl(this.buttonColor);
        String m682toStringimpl7 = Color.m682toStringimpl(this.linkColor);
        String m682toStringimpl8 = Color.m682toStringimpl(this.dividerColor);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BannerColors(borderColor=", m682toStringimpl, ", backgroundColor=", m682toStringimpl2, ", iconColor=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", titleColor=", m682toStringimpl4, ", subtitleColor=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", buttonColor=", m682toStringimpl6, ", linkColor=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl7, ", dividerColor=", m682toStringimpl8, ")");
    }
}
