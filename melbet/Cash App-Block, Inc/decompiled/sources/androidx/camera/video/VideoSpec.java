package androidx.camera.video;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class VideoSpec {
    public static final VideoSpec DEFAULT;
    public final int aspectRatio;
    public final int bitrate;
    public final String mimeType;
    public final QualitySelector qualitySelector;

    static {
        QualitySelector qualitySelector = QualitySelector.NONE;
        qualitySelector.getClass();
        DEFAULT = new VideoSpec(qualitySelector, 0, -1, "video/*");
    }

    public VideoSpec(QualitySelector qualitySelector, int i, int i2, String str) {
        qualitySelector.getClass();
        str.getClass();
        this.qualitySelector = qualitySelector;
        this.bitrate = i;
        this.aspectRatio = i2;
        this.mimeType = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSpec)) {
            return false;
        }
        VideoSpec videoSpec = (VideoSpec) obj;
        return Intrinsics.areEqual(this.qualitySelector, videoSpec.qualitySelector) && this.bitrate == videoSpec.bitrate && this.aspectRatio == videoSpec.aspectRatio && Intrinsics.areEqual(this.mimeType, videoSpec.mimeType);
    }

    public final int hashCode() {
        return Objects.hash(this.qualitySelector, 0, Integer.valueOf(this.bitrate), Integer.valueOf(this.aspectRatio), this.mimeType);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.qualitySelector);
        sb.append(", encodeFrameRate=0, bitrate=");
        sb.append(this.bitrate);
        sb.append(", aspectRatio=");
        sb.append(this.aspectRatio);
        sb.append(", mimeType=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.mimeType, '}');
    }
}
