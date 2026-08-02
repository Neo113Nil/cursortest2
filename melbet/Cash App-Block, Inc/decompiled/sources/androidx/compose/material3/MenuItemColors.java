package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class MenuItemColors {
    public final long disabledLeadingIconColor;
    public final long disabledTextColor;
    public final long disabledTrailingIconColor;
    public final long leadingIconColor;
    public final long textColor;
    public final long trailingIconColor;

    public MenuItemColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.textColor = j;
        this.leadingIconColor = j2;
        this.trailingIconColor = j3;
        this.disabledTextColor = j4;
        this.disabledLeadingIconColor = j5;
        this.disabledTrailingIconColor = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) obj;
        return Color.m676equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m676equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m676equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m676equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m676equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m676equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.disabledTrailingIconColor) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.textColor) * 31, 31, this.leadingIconColor), 31, this.trailingIconColor), 31, this.disabledTextColor), 31, this.disabledLeadingIconColor);
    }
}
