package com.squareup.cash.money.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes6.dex */
public final class OverrideColors {
    public final long iconColor;
    public final long textColor;
    public final boolean useLightStatusBarIconsInLightMode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OverrideColors() {
        this(true, r0.text, r0.icon.f218default);
        Colors.Component.TitleBar titleBar = ColorsDarkKt.colorsDark.component.titleBar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverrideColors)) {
            return false;
        }
        OverrideColors overrideColors = (OverrideColors) obj;
        return Color.m676equalsimpl0(this.textColor, overrideColors.textColor) && Color.m676equalsimpl0(this.iconColor, overrideColors.iconColor) && this.useLightStatusBarIconsInLightMode == overrideColors.useLightStatusBarIconsInLightMode;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Boolean.hashCode(this.useLightStatusBarIconsInLightMode) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.textColor) * 31, 31, this.iconColor);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OverrideColors(textColor=", Color.m682toStringimpl(this.textColor), ", iconColor=", Color.m682toStringimpl(this.iconColor), ", useLightStatusBarIconsInLightMode="), this.useLightStatusBarIconsInLightMode, ")");
    }

    public OverrideColors(boolean z, long j, long j2) {
        this.textColor = j;
        this.iconColor = j2;
        this.useLightStatusBarIconsInLightMode = z;
    }
}
