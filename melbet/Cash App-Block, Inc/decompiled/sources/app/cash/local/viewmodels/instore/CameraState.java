package app.cash.local.viewmodels.instore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CameraState {
    public static final /* synthetic */ CameraState[] $VALUES;
    public static final CameraState PAUSED;
    public static final CameraState RESUMED;

    static {
        CameraState cameraState = new CameraState("PAUSED", 0);
        PAUSED = cameraState;
        CameraState cameraState2 = new CameraState("RESUMED", 1);
        RESUMED = cameraState2;
        $VALUES = new CameraState[]{cameraState, cameraState2};
    }

    public static CameraState valueOf(String str) {
        return (CameraState) Enum.valueOf(CameraState.class, str);
    }

    public static CameraState[] values() {
        return (CameraState[]) $VALUES.clone();
    }
}
