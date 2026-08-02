package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class IconButtonColors {
    public final long containerColor;
    public final long contentColor;
    public final long disabledContainerColor;
    public final long disabledContentColor;

    public IconButtonColors(long j, long j2, long j3, long j4) {
        this.containerColor = j;
        this.contentColor = j2;
        this.disabledContainerColor = j3;
        this.disabledContentColor = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconButtonColors)) {
            return false;
        }
        IconButtonColors iconButtonColors = (IconButtonColors) obj;
        return Color.m676equalsimpl0(this.containerColor, iconButtonColors.containerColor) && Color.m676equalsimpl0(this.contentColor, iconButtonColors.contentColor) && Color.m676equalsimpl0(this.disabledContainerColor, iconButtonColors.disabledContainerColor) && Color.m676equalsimpl0(this.disabledContentColor, iconButtonColors.disabledContentColor);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.disabledContentColor) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.containerColor) * 31, 31, this.contentColor), 31, this.disabledContainerColor);
    }
}
