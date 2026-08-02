package androidx.camera.video.internal.encoder;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_VideoEncoderDataSpace {
    public final int range;
    public final int standard;
    public final int transfer;
    public static final AutoValue_VideoEncoderDataSpace ENCODER_DATA_SPACE_UNSPECIFIED = new AutoValue_VideoEncoderDataSpace(0, 0, 0);
    public static final AutoValue_VideoEncoderDataSpace ENCODER_DATA_SPACE_BT709 = new AutoValue_VideoEncoderDataSpace(1, 3, 2);
    public static final AutoValue_VideoEncoderDataSpace ENCODER_DATA_SPACE_SRGB = new AutoValue_VideoEncoderDataSpace(1, 3, 1);
    public static final AutoValue_VideoEncoderDataSpace ENCODER_DATA_SPACE_BT2020_HLG = new AutoValue_VideoEncoderDataSpace(6, 7, 1);
    public static final AutoValue_VideoEncoderDataSpace ENCODER_DATA_SPACE_BT2020_PQ = new AutoValue_VideoEncoderDataSpace(6, 6, 1);

    public AutoValue_VideoEncoderDataSpace(int i, int i2, int i3) {
        this.standard = i;
        this.transfer = i2;
        this.range = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_VideoEncoderDataSpace)) {
            return false;
        }
        AutoValue_VideoEncoderDataSpace autoValue_VideoEncoderDataSpace = (AutoValue_VideoEncoderDataSpace) obj;
        return this.standard == autoValue_VideoEncoderDataSpace.standard && this.transfer == autoValue_VideoEncoderDataSpace.transfer && this.range == autoValue_VideoEncoderDataSpace.range;
    }

    public final int hashCode() {
        return this.range ^ ((((this.standard ^ 1000003) * 1000003) ^ this.transfer) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.standard);
        sb.append(", transfer=");
        sb.append(this.transfer);
        sb.append(", range=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.range, "}", sb);
    }
}
