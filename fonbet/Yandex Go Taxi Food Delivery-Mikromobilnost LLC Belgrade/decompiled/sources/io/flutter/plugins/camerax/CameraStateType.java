package io.flutter.plugins.camerax;

import defpackage.jt7;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/camerax/CameraStateType;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "jt7", "CLOSED", "CLOSING", "OPEN", "OPENING", "PENDING_OPEN", "UNKNOWN", "camera_android_camerax_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CameraStateType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CameraStateType[] $VALUES;
    public static final CameraStateType CLOSED;
    public static final CameraStateType CLOSING;
    public static final jt7 Companion;
    public static final CameraStateType OPEN;
    public static final CameraStateType OPENING;
    public static final CameraStateType PENDING_OPEN;
    public static final CameraStateType UNKNOWN;
    private final int raw;

    static {
        CameraStateType cameraStateType = new CameraStateType("CLOSED", 0, 0);
        CLOSED = cameraStateType;
        CameraStateType cameraStateType2 = new CameraStateType("CLOSING", 1, 1);
        CLOSING = cameraStateType2;
        CameraStateType cameraStateType3 = new CameraStateType("OPEN", 2, 2);
        OPEN = cameraStateType3;
        CameraStateType cameraStateType4 = new CameraStateType("OPENING", 3, 3);
        OPENING = cameraStateType4;
        CameraStateType cameraStateType5 = new CameraStateType("PENDING_OPEN", 4, 4);
        PENDING_OPEN = cameraStateType5;
        CameraStateType cameraStateType6 = new CameraStateType("UNKNOWN", 5, 5);
        UNKNOWN = cameraStateType6;
        CameraStateType[] cameraStateTypeArr = {cameraStateType, cameraStateType2, cameraStateType3, cameraStateType4, cameraStateType5, cameraStateType6};
        $VALUES = cameraStateTypeArr;
        $ENTRIES = kotlin.enums.a.a(cameraStateTypeArr);
        Companion = new jt7();
    }

    public CameraStateType(String str, int i, int i2) {
        this.raw = i2;
    }

    public static CameraStateType valueOf(String str) {
        return (CameraStateType) Enum.valueOf(CameraStateType.class, str);
    }

    public static CameraStateType[] values() {
        return (CameraStateType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
