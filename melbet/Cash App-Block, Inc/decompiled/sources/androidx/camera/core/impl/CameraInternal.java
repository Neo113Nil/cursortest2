package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface CameraInternal extends Camera, UseCase.StateChangeCallback {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State CLOSED;
        public static final State CLOSING;
        public static final State OPEN;
        public static final State OPENING;
        public static final State PENDING_OPEN;
        public static final State RELEASED;
        public static final State RELEASING;

        static {
            State state = new State("RELEASED", 0);
            RELEASED = state;
            State state2 = new State("RELEASING", 1);
            RELEASING = state2;
            State state3 = new State("CLOSED", 2);
            CLOSED = state3;
            State state4 = new State("PENDING_OPEN", 3);
            PENDING_OPEN = state4;
            State state5 = new State("CLOSING", 4);
            CLOSING = state5;
            State state6 = new State("OPENING", 5);
            OPENING = state6;
            State state7 = new State("OPEN", 6);
            OPEN = state7;
            $VALUES = new State[]{state, state2, state3, state4, state5, state6, state7, new State("CONFIGURED", 7)};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    void attachUseCases(Collection collection);

    void detachUseCases(ArrayList arrayList);

    @Override // androidx.camera.core.Camera
    default CameraControlInternal getCameraControl() {
        return getCameraControlInternal();
    }

    CameraControlInternal getCameraControlInternal();

    @Override // androidx.camera.core.Camera
    default CameraInfo getCameraInfo() {
        return getCameraInfoInternal();
    }

    CameraInfoInternal getCameraInfoInternal();

    Observable getCameraState();

    default CameraConfig getExtendedConfig() {
        return CameraConfigs.DEFAULT_CAMERA_CONFIG;
    }

    default boolean getHasTransform() {
        return true;
    }

    default boolean isFrontFacing() {
        return getCameraInfo().getLensFacing() == 0;
    }

    default boolean isRemoved() {
        return false;
    }

    default void onRemoved() {
    }

    ListenableFuture release();

    default void setActiveResumingMode(boolean z) {
    }

    default void setExtendedConfig(CameraConfig cameraConfig) {
    }

    default void setPrimary(boolean z) {
    }
}
