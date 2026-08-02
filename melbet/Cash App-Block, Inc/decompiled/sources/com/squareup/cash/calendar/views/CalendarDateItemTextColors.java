package com.squareup.cash.calendar.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes5.dex */
public final class CalendarDateItemTextColors {

    /* renamed from: default, reason: not valid java name */
    public final long f334default;
    public final long disabled;
    public final long selected;

    public CalendarDateItemTextColors(long j, long j2, long j3) {
        this.selected = j;
        this.disabled = j2;
        this.f334default = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDateItemTextColors)) {
            return false;
        }
        CalendarDateItemTextColors calendarDateItemTextColors = (CalendarDateItemTextColors) obj;
        return Color.m676equalsimpl0(this.selected, calendarDateItemTextColors.selected) && Color.m676equalsimpl0(this.disabled, calendarDateItemTextColors.disabled) && Color.m676equalsimpl0(this.f334default, calendarDateItemTextColors.f334default);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.f334default) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.selected) * 31, 31, this.disabled);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.selected);
        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CalendarDateItemTextColors(selected=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", default="), Color.m682toStringimpl(this.f334default), ")");
    }
}
