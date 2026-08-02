package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import androidx.camera.camera2.adapter.CaptureResultAdapter;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public abstract class ConvergenceUtils {
    public static final Set AE_CONVERGED_STATE_SET;
    public static final Set AE_TORCH_AS_FLASH_CONVERGED_STATE_SET;
    public static final Set AF_CONVERGED_STATE_SET = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData$AfState.PASSIVE_FOCUSED, CameraCaptureMetaData$AfState.PASSIVE_NOT_FOCUSED, CameraCaptureMetaData$AfState.LOCKED_FOCUSED, CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED));
    public static final Set AWB_CONVERGED_STATE_SET = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData$AwbState.CONVERGED, CameraCaptureMetaData$AwbState.UNKNOWN));

    static {
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState = CameraCaptureMetaData$AeState.CONVERGED;
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState2 = CameraCaptureMetaData$AeState.FLASH_REQUIRED;
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState3 = CameraCaptureMetaData$AeState.UNKNOWN;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(cameraCaptureMetaData$AeState, cameraCaptureMetaData$AeState2, cameraCaptureMetaData$AeState3));
        AE_CONVERGED_STATE_SET = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(cameraCaptureMetaData$AeState2);
        copyOf.remove(cameraCaptureMetaData$AeState3);
        AE_TORCH_AS_FLASH_CONVERGED_STATE_SET = Collections.unmodifiableSet(copyOf);
    }

    public static boolean is3AConverged(CaptureResultAdapter captureResultAdapter, boolean z) {
        char c;
        char c2;
        AndroidFrameMetadata metadata = captureResultAdapter.result.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
        key.getClass();
        Integer num = (Integer) metadata.get(key);
        char c3 = 5;
        char c4 = 4;
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 5)) {
            c = 2;
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            c = 3;
        } else if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 3)) {
            c = 4;
        } else {
            if (num != null && StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "Unknown AF mode (" + num.intValue() + ") for " + ((Object) FrameNumber.m47toStringimpl(metadata.captureResult.getFrameNumber())) + '!');
            }
            c = 1;
        }
        boolean z2 = c == 2 || AF_CONVERGED_STATE_SET.contains(captureResultAdapter.getAfState());
        AndroidFrameMetadata metadata2 = captureResultAdapter.result.getMetadata();
        CaptureResult.Key key2 = CaptureResult.CONTROL_AE_MODE;
        key2.getClass();
        Integer num2 = (Integer) metadata2.get(key2);
        if (num2 != null && num2.intValue() == 0) {
            c2 = 2;
        } else if (num2 != null && num2.intValue() == 1) {
            c2 = 3;
        } else if (num2 != null && num2.intValue() == 2) {
            c2 = 4;
        } else if (num2 != null && num2.intValue() == 3) {
            c2 = 5;
        } else if (num2 != null && num2.intValue() == 4) {
            c2 = 6;
        } else {
            if (num2 != null && StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "Unknown AE mode (" + num2.intValue() + ") for " + ((Object) FrameNumber.m47toStringimpl(metadata2.captureResult.getFrameNumber())) + '!');
            }
            c2 = 1;
        }
        boolean z3 = c2 == 2;
        boolean z4 = !z ? !(z3 || AE_CONVERGED_STATE_SET.contains(captureResultAdapter.getAeState())) : !(z3 || AE_TORCH_AS_FLASH_CONVERGED_STATE_SET.contains(captureResultAdapter.getAeState()));
        AndroidFrameMetadata metadata3 = captureResultAdapter.result.getMetadata();
        CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
        key3.getClass();
        Integer num3 = (Integer) metadata3.get(key3);
        if (num3 != null && num3.intValue() == 0) {
            c3 = 2;
        } else if (num3 != null && num3.intValue() == 1) {
            c3 = 3;
        } else {
            if (num3 == null || num3.intValue() != 2) {
                if (num3 == null || num3.intValue() != 3) {
                    if (num3 != null && num3.intValue() == 4) {
                        c3 = 6;
                    } else {
                        c4 = 7;
                        if (num3 == null || num3.intValue() != 5) {
                            c3 = '\b';
                            if (num3 == null || num3.intValue() != 6) {
                                if (num3 != null && num3.intValue() == 7) {
                                    c3 = '\t';
                                } else if (num3 != null && num3.intValue() == 8) {
                                    c3 = '\n';
                                } else {
                                    if (num3 != null && StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                        Log.d("CXCP", "Unknown AWB mode (" + num3.intValue() + ") for " + ((Object) FrameNumber.m47toStringimpl(metadata3.captureResult.getFrameNumber())) + '!');
                                    }
                                    c3 = 1;
                                }
                            }
                        }
                    }
                }
            }
            c3 = c4;
        }
        boolean z5 = c3 == 2 || AWB_CONVERGED_STATE_SET.contains(captureResultAdapter.getAwbState());
        StringUtilsKt.d("ConvergenceUtils", "checkCaptureResult, AE=" + captureResultAdapter.getAeState() + " AF =" + captureResultAdapter.getAfState() + " AWB=" + captureResultAdapter.getAwbState());
        return z2 && z4 && z5;
    }
}
