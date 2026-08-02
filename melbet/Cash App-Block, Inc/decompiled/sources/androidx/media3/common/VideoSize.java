package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes3.dex */
public final class VideoSize {
    public static final VideoSize UNKNOWN = new VideoSize(0, 0);
    public final int height;
    public final float pixelWidthHeightRatio;
    public final int width;

    static {
        Util.intToStringMaxRadix(0);
        Util.intToStringMaxRadix(1);
        Util.intToStringMaxRadix(3);
    }

    public VideoSize(float f, int i, int i2) {
        this.width = i;
        this.height = i2;
        this.pixelWidthHeightRatio = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSize) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.width == videoSize.width && this.height == videoSize.height && this.pixelWidthHeightRatio == videoSize.pixelWidthHeightRatio) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.pixelWidthHeightRatio) + ((((EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE + this.width) * 31) + this.height) * 31);
    }

    public VideoSize(int i, int i2) {
        this(1.0f, i, i2);
    }
}
