package app.cash.local.views.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class RadioColors {
    public final long border;
    public final long borderDisabled;
    public final long borderPressed;

    public RadioColors(long j, long j2, long j3) {
        this.border = j;
        this.borderDisabled = j2;
        this.borderPressed = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioColors)) {
            return false;
        }
        RadioColors radioColors = (RadioColors) obj;
        return Color.m676equalsimpl0(this.border, radioColors.border) && Color.m676equalsimpl0(this.borderDisabled, radioColors.borderDisabled) && Color.m676equalsimpl0(this.borderPressed, radioColors.borderPressed);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.borderPressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.border) * 31, 31, this.borderDisabled);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.border);
        String m682toStringimpl2 = Color.m682toStringimpl(this.borderDisabled);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RadioColors(border=", m682toStringimpl, ", borderDisabled=", m682toStringimpl2, ", borderPressed="), Color.m682toStringimpl(this.borderPressed), ")");
    }
}
