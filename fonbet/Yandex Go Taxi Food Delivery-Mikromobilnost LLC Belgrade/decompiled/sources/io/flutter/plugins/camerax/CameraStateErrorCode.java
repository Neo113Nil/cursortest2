package io.flutter.plugins.camerax;

import defpackage.at7;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lio/flutter/plugins/camerax/CameraStateErrorCode;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "at7", "CAMERA_DISABLED", "CAMERA_FATAL_ERROR", "CAMERA_IN_USE", "DO_NOT_DISTURB_MODE_ENABLED", "MAX_CAMERAS_IN_USE", "OTHER_RECOVERABLE_ERROR", "STREAM_CONFIG", "UNKNOWN", "camera_android_camerax_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CameraStateErrorCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CameraStateErrorCode[] $VALUES;
    public static final CameraStateErrorCode CAMERA_DISABLED;
    public static final CameraStateErrorCode CAMERA_FATAL_ERROR;
    public static final CameraStateErrorCode CAMERA_IN_USE;
    public static final at7 Companion;
    public static final CameraStateErrorCode DO_NOT_DISTURB_MODE_ENABLED;
    public static final CameraStateErrorCode MAX_CAMERAS_IN_USE;
    public static final CameraStateErrorCode OTHER_RECOVERABLE_ERROR;
    public static final CameraStateErrorCode STREAM_CONFIG;
    public static final CameraStateErrorCode UNKNOWN;
    private final int raw;

    static {
        CameraStateErrorCode cameraStateErrorCode = new CameraStateErrorCode("CAMERA_DISABLED", 0, 0);
        CAMERA_DISABLED = cameraStateErrorCode;
        CameraStateErrorCode cameraStateErrorCode2 = new CameraStateErrorCode("CAMERA_FATAL_ERROR", 1, 1);
        CAMERA_FATAL_ERROR = cameraStateErrorCode2;
        CameraStateErrorCode cameraStateErrorCode3 = new CameraStateErrorCode("CAMERA_IN_USE", 2, 2);
        CAMERA_IN_USE = cameraStateErrorCode3;
        CameraStateErrorCode cameraStateErrorCode4 = new CameraStateErrorCode("DO_NOT_DISTURB_MODE_ENABLED", 3, 3);
        DO_NOT_DISTURB_MODE_ENABLED = cameraStateErrorCode4;
        CameraStateErrorCode cameraStateErrorCode5 = new CameraStateErrorCode("MAX_CAMERAS_IN_USE", 4, 4);
        MAX_CAMERAS_IN_USE = cameraStateErrorCode5;
        CameraStateErrorCode cameraStateErrorCode6 = new CameraStateErrorCode("OTHER_RECOVERABLE_ERROR", 5, 5);
        OTHER_RECOVERABLE_ERROR = cameraStateErrorCode6;
        CameraStateErrorCode cameraStateErrorCode7 = new CameraStateErrorCode("STREAM_CONFIG", 6, 6);
        STREAM_CONFIG = cameraStateErrorCode7;
        CameraStateErrorCode cameraStateErrorCode8 = new CameraStateErrorCode("UNKNOWN", 7, 7);
        UNKNOWN = cameraStateErrorCode8;
        CameraStateErrorCode[] cameraStateErrorCodeArr = {cameraStateErrorCode, cameraStateErrorCode2, cameraStateErrorCode3, cameraStateErrorCode4, cameraStateErrorCode5, cameraStateErrorCode6, cameraStateErrorCode7, cameraStateErrorCode8};
        $VALUES = cameraStateErrorCodeArr;
        $ENTRIES = kotlin.enums.a.a(cameraStateErrorCodeArr);
        Companion = new at7();
    }

    public CameraStateErrorCode(String str, int i, int i2) {
        this.raw = i2;
    }

    public static CameraStateErrorCode valueOf(String str) {
        return (CameraStateErrorCode) Enum.valueOf(CameraStateErrorCode.class, str);
    }

    public static CameraStateErrorCode[] values() {
        return (CameraStateErrorCode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
