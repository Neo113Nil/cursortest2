package androidx.glance.unit;

import androidx.compose.ui.graphics.Color;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class FixedColorProvider {
    public final long color;

    public FixedColorProvider(long j) {
        this.color = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedColorProvider) && Color.m676equalsimpl0(this.color, ((FixedColorProvider) obj).color);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.color);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) Color.m682toStringimpl(this.color)) + ')';
    }
}
