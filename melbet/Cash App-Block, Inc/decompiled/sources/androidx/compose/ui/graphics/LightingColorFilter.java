package androidx.compose.ui.graphics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class LightingColorFilter extends ColorFilter {
    public final long add;
    public final long multiply;

    public LightingColorFilter(long j, long j2, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j;
        this.add = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        return Color.m676equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m676equalsimpl0(this.add, lightingColorFilter.add);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.add) + (Long.hashCode(this.multiply) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LightingColorFilter(multiply=");
        Recorder$$ExternalSyntheticOutline1.m(this.multiply, ", add=", sb);
        sb.append((Object) Color.m682toStringimpl(this.add));
        sb.append(')');
        return sb.toString();
    }
}
