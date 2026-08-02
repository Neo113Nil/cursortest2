package androidx.camera.camera2.adapter;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.camera.camera2.impl.TagsKt;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CaptureResultAdapter implements CameraCaptureResult, UnsafeWrapper {
    public final RequestMetadata requestMetadata;
    public final FrameInfo result;

    public CaptureResultAdapter(RequestMetadata requestMetadata, FrameInfo frameInfo) {
        requestMetadata.getClass();
        this.requestMetadata = requestMetadata;
        this.result = frameInfo;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData$AeState getAeState() {
        AndroidFrameMetadata metadata = this.result.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        Integer num = (Integer) metadata.get(key);
        if (num != null && num.intValue() == 0) {
            return CameraCaptureMetaData$AeState.INACTIVE;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return CameraCaptureMetaData$AeState.SEARCHING;
        }
        if (num != null && num.intValue() == 4) {
            return CameraCaptureMetaData$AeState.FLASH_REQUIRED;
        }
        if (num != null && num.intValue() == 2) {
            return CameraCaptureMetaData$AeState.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return CameraCaptureMetaData$AeState.LOCKED;
        }
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState = CameraCaptureMetaData$AeState.UNKNOWN;
        if (num != null && StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Unknown AE state (" + num.intValue() + ") for " + ((Object) FrameNumber.m47toStringimpl(metadata.captureResult.getFrameNumber())) + '!');
        }
        return cameraCaptureMetaData$AeState;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData$AfState getAfState() {
        AndroidFrameMetadata metadata = this.result.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
        key.getClass();
        Integer num = (Integer) metadata.get(key);
        if (num != null && num.intValue() == 0) {
            return CameraCaptureMetaData$AfState.INACTIVE;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return CameraCaptureMetaData$AfState.SCANNING;
        }
        if (num != null && num.intValue() == 4) {
            return CameraCaptureMetaData$AfState.LOCKED_FOCUSED;
        }
        if (num != null && num.intValue() == 5) {
            return CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED;
        }
        if (num != null && num.intValue() == 2) {
            return CameraCaptureMetaData$AfState.PASSIVE_FOCUSED;
        }
        if (num != null && num.intValue() == 6) {
            return CameraCaptureMetaData$AfState.PASSIVE_NOT_FOCUSED;
        }
        CameraCaptureMetaData$AfState cameraCaptureMetaData$AfState = CameraCaptureMetaData$AfState.UNKNOWN;
        if (num != null && StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Unknown AF state (" + num.intValue() + ") for " + ((Object) FrameNumber.m47toStringimpl(metadata.captureResult.getFrameNumber())) + '!');
        }
        return cameraCaptureMetaData$AfState;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData$AwbState getAwbState() {
        AndroidFrameMetadata metadata = this.result.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AWB_STATE;
        key.getClass();
        Integer num = (Integer) metadata.get(key);
        if (num != null && num.intValue() == 0) {
            return CameraCaptureMetaData$AwbState.INACTIVE;
        }
        if (num != null && num.intValue() == 1) {
            return CameraCaptureMetaData$AwbState.METERING;
        }
        if (num != null && num.intValue() == 2) {
            return CameraCaptureMetaData$AwbState.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return CameraCaptureMetaData$AwbState.LOCKED;
        }
        CameraCaptureMetaData$AwbState cameraCaptureMetaData$AwbState = CameraCaptureMetaData$AwbState.UNKNOWN;
        if (num != null && StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Unknown AWB state (" + num.intValue() + ") for " + ((Object) FrameNumber.m47toStringimpl(metadata.captureResult.getFrameNumber())) + '!');
        }
        return cameraCaptureMetaData$AwbState;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CaptureResult getCaptureResult() {
        Object unwrapAs = unwrapAs(Reflection.factory.getOrCreateKotlinClass(TotalCaptureResult.class));
        if (unwrapAs != null) {
            return (CaptureResult) unwrapAs;
        }
        Handlers$$ExternalSyntheticBUOutline0.m("Failed to unwrap ", this, " as TotalCaptureResult");
        return null;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final int getFlashState() {
        AndroidFrameMetadata metadata = this.result.getMetadata();
        CaptureResult.Key key = CaptureResult.FLASH_STATE;
        key.getClass();
        Integer num = (Integer) metadata.get(key);
        int i = 2;
        if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 2) {
                return 3;
            }
            i = 4;
            if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 4)) {
                if (num != null && StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "Unknown flash state (" + num.intValue() + ") for " + ((Object) FrameNumber.m47toStringimpl(metadata.captureResult.getFrameNumber())) + '!');
                }
                return 1;
            }
        }
        return i;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final TagBundle getTagBundle() {
        return (TagBundle) this.requestMetadata.getOrDefault(TagsKt.CAMERAX_TAG_BUNDLE, TagBundle.EMPTY_TAGBUNDLE);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final long getTimestamp() {
        AndroidFrameMetadata metadata = this.result.getMetadata();
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        metadata.getClass();
        Object obj = metadata.get(key);
        return ((Number) (obj != null ? obj : -1L)).longValue();
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final void populateExifData(ExifData.Builder builder) {
        super.populateExifData(builder);
        ArrayList arrayList = builder.mAttributes;
        AndroidFrameMetadata metadata = this.result.getMetadata();
        try {
            CaptureResult.Key key = CaptureResult.JPEG_ORIENTATION;
            key.getClass();
            Integer num = (Integer) metadata.get(key);
            if (num != null) {
                builder.setOrientationDegrees(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                Log.w("CXCP", "Failed to get JPEG orientation.");
            }
        }
        CaptureResult.Key key2 = CaptureResult.SENSOR_EXPOSURE_TIME;
        key2.getClass();
        if (((Long) metadata.get(key2)) != null) {
            builder.setAttributeInternal("ExposureTime", String.valueOf(r1.longValue() / 1.0E9d), arrayList);
        }
        CaptureResult.Key key3 = CaptureResult.LENS_APERTURE;
        key3.getClass();
        Float f = (Float) metadata.get(key3);
        if (f != null) {
            builder.setAttributeInternal("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        CaptureResult.Key key4 = CaptureResult.SENSOR_SENSITIVITY;
        key4.getClass();
        Integer num2 = (Integer) metadata.get(key4);
        if (num2 != null) {
            int intValue = num2.intValue();
            builder.setAttributeInternal("SensitivityType", String.valueOf(3), arrayList);
            builder.setAttributeInternal("PhotographicSensitivity", String.valueOf(Math.min(65535, intValue)), arrayList);
            CaptureResult.Key key5 = CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST;
            key5.getClass();
            if (((Integer) metadata.get(key5)) != null) {
                builder.setAttributeInternal("SensitivityType", String.valueOf(3), arrayList);
                builder.setAttributeInternal("PhotographicSensitivity", String.valueOf(Math.min(65535, intValue * ((int) (r5.intValue() / 100.0f)))), arrayList);
            }
        }
        CaptureResult.Key key6 = CaptureResult.LENS_FOCAL_LENGTH;
        key6.getClass();
        Float f2 = (Float) metadata.get(key6);
        if (f2 != null) {
            builder.setAttributeInternal("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        CaptureResult.Key key7 = CaptureResult.CONTROL_AWB_MODE;
        key7.getClass();
        Integer num3 = (Integer) metadata.get(key7);
        if (num3 != null) {
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(num3.intValue() == 0 ? 2 : 1);
            builder.setAttributeInternal("WhiteBalance", ordinal != 0 ? ordinal != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        boolean equals = kClass.equals(Reflection.factory.getOrCreateKotlinClass(FrameInfo.class));
        FrameInfo frameInfo = this.result;
        return equals ? frameInfo : frameInfo.unwrapAs(kClass);
    }
}
