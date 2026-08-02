package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class RippleConfiguration {
    public final long color = Color.Unspecified;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RippleConfiguration) {
            return Color.m676equalsimpl0(this.color, ((RippleConfiguration) obj).color);
        }
        return false;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.color) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) Color.m682toStringimpl(this.color)) + ", rippleAlpha=null)";
    }
}
