package io.flutter.plugins.videoplayer;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.ny61;
import defpackage.oyr;

/* loaded from: classes4.dex */
public enum ExoPlayerEventListener$RotationDegrees {
    ROTATE_0(0),
    ROTATE_90(90),
    ROTATE_180(SubsamplingScaleImageView.ORIENTATION_180),
    ROTATE_270(SubsamplingScaleImageView.ORIENTATION_270);

    private final int degrees;

    ExoPlayerEventListener$RotationDegrees(int i) {
        this.degrees = i;
    }

    public static ExoPlayerEventListener$RotationDegrees a(int i) {
        for (ExoPlayerEventListener$RotationDegrees exoPlayerEventListener$RotationDegrees : values()) {
            if (exoPlayerEventListener$RotationDegrees.degrees == i) {
                return exoPlayerEventListener$RotationDegrees;
            }
        }
        ny61.g(oyr.i(i, "Invalid rotation degrees specified: "));
        return null;
    }

    public final int b() {
        return this.degrees;
    }
}
