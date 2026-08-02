package androidx.camera.camera2.pipe;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes3.dex */
public final class CameraError {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m43toStringimpl(int i) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("CameraError("), i == 0 ? "ERROR_UNDETERMINED" : i == 1 ? "ERROR_CAMERA_IN_USE" : i == 2 ? "ERROR_CAMERA_LIMIT_EXCEEDED" : i == 3 ? "ERROR_CAMERA_DISABLED" : i == 4 ? "ERROR_CAMERA_DEVICE" : i == 5 ? "ERROR_CAMERA_SERVICE" : i == 6 ? "ERROR_CAMERA_DISCONNECTED" : i == 7 ? "ERROR_ILLEGAL_ARGUMENT_EXCEPTION" : i == 8 ? "ERROR_SECURITY_EXCEPTION" : i == 9 ? "ERROR_GRAPH_CONFIG" : i == 10 ? "ERROR_DO_NOT_DISTURB_ENABLED" : i == 11 ? "ERROR_UNKNOWN_EXCEPTION" : i == 12 ? "ERROR_CAMERA_OPENER" : i == 13 ? "ERROR_CAMERA_OPEN_TIMEOUT" : "ERROR_UNKNOWN", ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CameraError) {
            return this.value == ((CameraError) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m43toStringimpl(this.value);
    }
}
