package com.squareup.cash.arcade.components.button;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.arcade.theme.RippleConfiguration;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ButtonColors {
    public final long backgroundDisabled;
    public final long backgroundEnabled;
    public final long circularProgress;
    public final long iconDisabled;
    public final long iconEnabled;
    public final RippleConfiguration rippleConfiguration;
    public final long textDisabled;
    public final long textEnabled;

    public ButtonColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, RippleConfiguration rippleConfiguration) {
        rippleConfiguration.getClass();
        this.textEnabled = j;
        this.textDisabled = j2;
        this.backgroundEnabled = j3;
        this.backgroundDisabled = j4;
        this.iconEnabled = j5;
        this.iconDisabled = j6;
        this.circularProgress = j7;
        this.rippleConfiguration = rippleConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        return Color.m676equalsimpl0(this.textEnabled, buttonColors.textEnabled) && Color.m676equalsimpl0(this.textDisabled, buttonColors.textDisabled) && Color.m676equalsimpl0(this.backgroundEnabled, buttonColors.backgroundEnabled) && Color.m676equalsimpl0(this.backgroundDisabled, buttonColors.backgroundDisabled) && Color.m676equalsimpl0(this.iconEnabled, buttonColors.iconEnabled) && Color.m676equalsimpl0(this.iconDisabled, buttonColors.iconDisabled) && Color.m676equalsimpl0(this.circularProgress, buttonColors.circularProgress) && Intrinsics.areEqual(this.rippleConfiguration, buttonColors.rippleConfiguration);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return this.rippleConfiguration.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.textEnabled) * 31, 31, this.textDisabled), 31, this.backgroundEnabled), 31, this.backgroundDisabled), 31, this.iconEnabled), 31, this.iconDisabled), 31, this.circularProgress);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.textEnabled);
        String m682toStringimpl2 = Color.m682toStringimpl(this.textDisabled);
        String m682toStringimpl3 = Color.m682toStringimpl(this.backgroundEnabled);
        String m682toStringimpl4 = Color.m682toStringimpl(this.backgroundDisabled);
        String m682toStringimpl5 = Color.m682toStringimpl(this.iconEnabled);
        String m682toStringimpl6 = Color.m682toStringimpl(this.iconDisabled);
        String m682toStringimpl7 = Color.m682toStringimpl(this.circularProgress);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ButtonColors(textEnabled=", m682toStringimpl, ", textDisabled=", m682toStringimpl2, ", backgroundEnabled=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", backgroundDisabled=", m682toStringimpl4, ", iconEnabled=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", iconDisabled=", m682toStringimpl6, ", circularProgress=");
        m.append(m682toStringimpl7);
        m.append(", rippleConfiguration=");
        m.append(this.rippleConfiguration);
        m.append(")");
        return m.toString();
    }
}
