package androidx.media3.common;

import android.media.AudioAttributes;
import android.os.Build;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public final class AudioAttributes {
    public static final AudioAttributes DEFAULT = new AudioAttributes();
    public android.media.AudioAttributes platformAudioAttributes;

    public abstract class Api32 {
        public static void setIsContentSpatialized(AudioAttributes.Builder builder) {
            builder.setIsContentSpatialized(false);
        }

        public static void setSpatializationBehavior(AudioAttributes.Builder builder) {
            builder.setSpatializationBehavior(0);
        }
    }

    static {
        Fragment$5$$ExternalSyntheticOutline0.m$1(0, 1, 2, 3, 4);
        Util.intToStringMaxRadix(5);
        Util.intToStringMaxRadix(6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final android.media.AudioAttributes getPlatformAudioAttributes() {
        if (this.platformAudioAttributes == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            usage.setAllowedCapturePolicy(1);
            usage.setHapticChannelsMuted(true);
            if (Build.VERSION.SDK_INT >= 32) {
                Api32.setSpatializationBehavior(usage);
                Api32.setIsContentSpatialized(usage);
            }
            this.platformAudioAttributes = usage.build();
        }
        return this.platformAudioAttributes;
    }

    public final int hashCode() {
        return -436042064;
    }
}
