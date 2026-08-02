package androidx.media3.common;

import androidx.media3.common.util.Util;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class PlaybackParameters {
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f, 1.0f);
    public final float pitch;
    public final int scaledUsPerMs;
    public final float speed;

    static {
        Util.intToStringMaxRadix(0);
        Util.intToStringMaxRadix(1);
    }

    public PlaybackParameters(float f, float f2) {
        Trace.checkArgument(f > RecyclerView.DECELERATION_RATE);
        Trace.checkArgument(f2 > RecyclerView.DECELERATION_RATE);
        this.speed = f;
        this.pitch = f2;
        this.scaledUsPerMs = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlaybackParameters.class == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.pitch) + ((Float.floatToRawIntBits(this.speed) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.speed), Float.valueOf(this.pitch)};
        String str = Util.DEVICE_DEBUG_INFO;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
