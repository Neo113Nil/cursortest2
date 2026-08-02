package app.cash.broadway.ui;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes.dex */
public final class UpdatesWindowFlags$TabConfig {
    public final long backgroundColor;
    public final long itemBackgroundSelectedColor;
    public final long itemForegroundSelectedColor;
    public final long itemForegroundUnselectedColor;

    public UpdatesWindowFlags$TabConfig(long j, long j2, long j3, long j4) {
        this.backgroundColor = j;
        this.itemBackgroundSelectedColor = j2;
        this.itemForegroundSelectedColor = j3;
        this.itemForegroundUnselectedColor = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatesWindowFlags$TabConfig)) {
            return false;
        }
        UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig = (UpdatesWindowFlags$TabConfig) obj;
        return Color.m676equalsimpl0(this.backgroundColor, updatesWindowFlags$TabConfig.backgroundColor) && Color.m676equalsimpl0(this.itemBackgroundSelectedColor, updatesWindowFlags$TabConfig.itemBackgroundSelectedColor) && Color.m676equalsimpl0(this.itemForegroundSelectedColor, updatesWindowFlags$TabConfig.itemForegroundSelectedColor) && Color.m676equalsimpl0(this.itemForegroundUnselectedColor, updatesWindowFlags$TabConfig.itemForegroundUnselectedColor);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Boolean.hashCode(false) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.backgroundColor) * 31, 31, this.itemBackgroundSelectedColor), 31, this.itemForegroundSelectedColor), 31, this.itemForegroundUnselectedColor);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.backgroundColor);
        String m682toStringimpl2 = Color.m682toStringimpl(this.itemBackgroundSelectedColor);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TabConfig(backgroundColor=", m682toStringimpl, ", itemBackgroundSelectedColor=", m682toStringimpl2, ", itemForegroundSelectedColor="), Color.m682toStringimpl(this.itemForegroundSelectedColor), ", itemForegroundUnselectedColor=", Color.m682toStringimpl(this.itemForegroundUnselectedColor), ", drawDivider=false)");
    }
}
