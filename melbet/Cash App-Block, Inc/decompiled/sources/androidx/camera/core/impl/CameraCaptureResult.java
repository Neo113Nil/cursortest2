package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.utils.ExifData;
import java.util.ArrayList;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public interface CameraCaptureResult {
    CameraCaptureMetaData$AeState getAeState();

    CameraCaptureMetaData$AfState getAfState();

    CameraCaptureMetaData$AwbState getAwbState();

    default CaptureResult getCaptureResult() {
        return null;
    }

    int getFlashState();

    TagBundle getTagBundle();

    long getTimestamp();

    default void populateExifData(ExifData.Builder builder) {
        int i;
        ArrayList arrayList = builder.mAttributes;
        int flashState = getFlashState();
        if (flashState == 1) {
            return;
        }
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(flashState);
        if (ordinal == 1) {
            i = 32;
        } else if (ordinal == 2) {
            i = 0;
        } else {
            if (ordinal != 3) {
                StringUtilsKt.w("ExifData", "Unknown flash state: ".concat(flashState != 1 ? flashState != 2 ? flashState != 3 ? flashState != 4 ? "null" : "FIRED" : "READY" : "NONE" : "UNKNOWN"));
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            builder.setAttributeInternal("LightSource", String.valueOf(4), arrayList);
        }
        builder.setAttributeInternal("Flash", String.valueOf(i), arrayList);
    }
}
