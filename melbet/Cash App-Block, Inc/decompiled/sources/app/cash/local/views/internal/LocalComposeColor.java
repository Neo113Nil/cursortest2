package app.cash.local.views.internal;

import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class LocalComposeColor {
    public final long dark;
    public final long light;

    public LocalComposeColor(long j, long j2) {
        this.light = j;
        this.dark = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalComposeColor)) {
            return false;
        }
        LocalComposeColor localComposeColor = (LocalComposeColor) obj;
        return Color.m676equalsimpl0(this.light, localComposeColor.light) && Color.m676equalsimpl0(this.dark, localComposeColor.dark);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.dark) + (Long.hashCode(this.light) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LocalComposeColor(light=", Color.m682toStringimpl(this.light), ", dark=", Color.m682toStringimpl(this.dark), ")");
    }
}
