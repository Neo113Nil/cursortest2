package androidx.camera.camera2.pipe.compat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ClosedReason {
    public static final /* synthetic */ ClosedReason[] $VALUES;
    public static final ClosedReason APP_CLOSED;
    public static final ClosedReason APP_DISCONNECTED;
    public static final ClosedReason CAMERA2_CLOSED;
    public static final ClosedReason CAMERA2_DISCONNECTED;
    public static final ClosedReason CAMERA2_ERROR;
    public static final ClosedReason CAMERA2_EXCEPTION;

    static {
        ClosedReason closedReason = new ClosedReason("APP_CLOSED", 0);
        APP_CLOSED = closedReason;
        ClosedReason closedReason2 = new ClosedReason("APP_DISCONNECTED", 1);
        APP_DISCONNECTED = closedReason2;
        ClosedReason closedReason3 = new ClosedReason("CAMERA2_CLOSED", 2);
        CAMERA2_CLOSED = closedReason3;
        ClosedReason closedReason4 = new ClosedReason("CAMERA2_DISCONNECTED", 3);
        CAMERA2_DISCONNECTED = closedReason4;
        ClosedReason closedReason5 = new ClosedReason("CAMERA2_ERROR", 4);
        CAMERA2_ERROR = closedReason5;
        ClosedReason closedReason6 = new ClosedReason("CAMERA2_EXCEPTION", 5);
        CAMERA2_EXCEPTION = closedReason6;
        $VALUES = new ClosedReason[]{closedReason, closedReason2, closedReason3, closedReason4, closedReason5, closedReason6};
    }

    public static ClosedReason valueOf(String str) {
        return (ClosedReason) Enum.valueOf(ClosedReason.class, str);
    }

    public static ClosedReason[] values() {
        return (ClosedReason[]) $VALUES.clone();
    }
}
