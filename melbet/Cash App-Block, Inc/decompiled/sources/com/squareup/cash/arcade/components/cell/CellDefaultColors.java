package com.squareup.cash.arcade.components.cell;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes5.dex */
public final class CellDefaultColors {
    public final long body;
    public final long label;
    public final long largeIcon;
    public final long smallIcon;

    public CellDefaultColors(long j, long j2, long j3, long j4) {
        this.smallIcon = j;
        this.largeIcon = j2;
        this.label = j3;
        this.body = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellDefaultColors)) {
            return false;
        }
        CellDefaultColors cellDefaultColors = (CellDefaultColors) obj;
        return Color.m676equalsimpl0(this.smallIcon, cellDefaultColors.smallIcon) && Color.m676equalsimpl0(this.largeIcon, cellDefaultColors.largeIcon) && Color.m676equalsimpl0(this.label, cellDefaultColors.label) && Color.m676equalsimpl0(this.body, cellDefaultColors.body);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.body) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.smallIcon) * 31, 31, this.largeIcon), 31, this.label);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.smallIcon);
        String m682toStringimpl2 = Color.m682toStringimpl(this.largeIcon);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CellDefaultColors(smallIcon=", m682toStringimpl, ", largeIcon=", m682toStringimpl2, ", label="), Color.m682toStringimpl(this.label), ", body=", Color.m682toStringimpl(this.body), ")");
    }
}
