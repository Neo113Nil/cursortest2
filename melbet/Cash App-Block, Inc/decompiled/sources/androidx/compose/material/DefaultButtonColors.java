package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class DefaultButtonColors {
    public final long backgroundColor;
    public final long contentColor;
    public final long disabledBackgroundColor;
    public final long disabledContentColor;

    public DefaultButtonColors(long j, long j2, long j3, long j4) {
        this.backgroundColor = j;
        this.contentColor = j2;
        this.disabledBackgroundColor = j3;
        this.disabledContentColor = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultButtonColors defaultButtonColors = (DefaultButtonColors) obj;
        return Color.m676equalsimpl0(this.backgroundColor, defaultButtonColors.backgroundColor) && Color.m676equalsimpl0(this.contentColor, defaultButtonColors.contentColor) && Color.m676equalsimpl0(this.disabledBackgroundColor, defaultButtonColors.disabledBackgroundColor) && Color.m676equalsimpl0(this.disabledContentColor, defaultButtonColors.disabledContentColor);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.disabledContentColor) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.backgroundColor) * 31, 31, this.contentColor), 31, this.disabledBackgroundColor);
    }
}
