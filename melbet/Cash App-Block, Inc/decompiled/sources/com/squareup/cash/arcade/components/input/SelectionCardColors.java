package com.squareup.cash.arcade.components.input;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes5.dex */
public final class SelectionCardColors {
    public final long body;
    public final long border;
    public final long label;

    public SelectionCardColors(long j, long j2, long j3) {
        this.border = j;
        this.label = j2;
        this.body = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionCardColors)) {
            return false;
        }
        SelectionCardColors selectionCardColors = (SelectionCardColors) obj;
        return Color.m676equalsimpl0(this.border, selectionCardColors.border) && Color.m676equalsimpl0(this.label, selectionCardColors.label) && Color.m676equalsimpl0(this.body, selectionCardColors.body);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.body) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.border) * 31, 31, this.label);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.border);
        String m682toStringimpl2 = Color.m682toStringimpl(this.label);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectionCardColors(border=", m682toStringimpl, ", label=", m682toStringimpl2, ", body="), Color.m682toStringimpl(this.body), ")");
    }
}
