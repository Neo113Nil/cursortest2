package androidx.compose.ui.graphics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.ULong;

/* loaded from: classes.dex */
public final class BlendModeColorFilter extends ColorFilter {
    public final int blendMode;
    public final long color;

    public BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j;
        this.blendMode = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.m676equalsimpl0(this.color, blendModeColorFilter.color) && this.blendMode == blendModeColorFilter.blendMode;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Integer.hashCode(this.blendMode) + (Long.hashCode(this.color) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        Recorder$$ExternalSyntheticOutline1.m(this.color, ", blendMode=", sb);
        sb.append((Object) BlendMode.m669toStringimpl(this.blendMode));
        sb.append(')');
        return sb.toString();
    }
}
