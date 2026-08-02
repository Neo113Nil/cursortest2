package com.squareup.cash.arcade.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes.dex */
public final class DynamicColorConfiguration {
    public final long bottomNavigationIconDeselected;
    public final long bottomNavigationIconSelected;
    public final long titleBarIcon;
    public final long titleBarText;

    public DynamicColorConfiguration(long j, long j2, long j3, long j4) {
        this.titleBarText = j;
        this.titleBarIcon = j2;
        this.bottomNavigationIconSelected = j3;
        this.bottomNavigationIconDeselected = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicColorConfiguration)) {
            return false;
        }
        DynamicColorConfiguration dynamicColorConfiguration = (DynamicColorConfiguration) obj;
        return Color.m676equalsimpl0(this.titleBarText, dynamicColorConfiguration.titleBarText) && Color.m676equalsimpl0(this.titleBarIcon, dynamicColorConfiguration.titleBarIcon) && Color.m676equalsimpl0(this.bottomNavigationIconSelected, dynamicColorConfiguration.bottomNavigationIconSelected) && Color.m676equalsimpl0(this.bottomNavigationIconDeselected, dynamicColorConfiguration.bottomNavigationIconDeselected);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.bottomNavigationIconDeselected) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.titleBarText) * 31, 31, this.titleBarIcon), 31, this.bottomNavigationIconSelected);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.titleBarText);
        String m682toStringimpl2 = Color.m682toStringimpl(this.titleBarIcon);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DynamicColorConfiguration(titleBarText=", m682toStringimpl, ", titleBarIcon=", m682toStringimpl2, ", bottomNavigationIconSelected="), Color.m682toStringimpl(this.bottomNavigationIconSelected), ", bottomNavigationIconDeselected=", Color.m682toStringimpl(this.bottomNavigationIconDeselected), ")");
    }
}
