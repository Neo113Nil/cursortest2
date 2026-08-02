package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RippleConfiguration {
    public final long color;
    public final RippleAlpha rippleAlpha;

    public RippleConfiguration(long j, RippleAlpha rippleAlpha) {
        this.color = j;
        this.rippleAlpha = rippleAlpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.m676equalsimpl0(this.color, rippleConfiguration.color) && Intrinsics.areEqual(this.rippleAlpha, rippleConfiguration.rippleAlpha);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        int hashCode = Long.hashCode(this.color) * 31;
        RippleAlpha rippleAlpha = this.rippleAlpha;
        return hashCode + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        Recorder$$ExternalSyntheticOutline1.m(this.color, ", rippleAlpha=", sb);
        sb.append(this.rippleAlpha);
        sb.append(')');
        return sb.toString();
    }
}
