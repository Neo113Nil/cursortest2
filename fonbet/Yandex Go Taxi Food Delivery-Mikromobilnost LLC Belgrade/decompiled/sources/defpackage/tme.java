package defpackage;

import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class tme {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData$AfState.PASSIVE_FOCUSED, CameraCaptureMetaData$AfState.PASSIVE_NOT_FOCUSED, CameraCaptureMetaData$AfState.LOCKED_FOCUSED, CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData$AwbState.CONVERGED, CameraCaptureMetaData$AwbState.UNKNOWN));
    public static final Set c;
    public static final Set d;

    static {
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState = CameraCaptureMetaData$AeState.CONVERGED;
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState2 = CameraCaptureMetaData$AeState.FLASH_REQUIRED;
        CameraCaptureMetaData$AeState cameraCaptureMetaData$AeState3 = CameraCaptureMetaData$AeState.UNKNOWN;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(cameraCaptureMetaData$AeState, cameraCaptureMetaData$AeState2, cameraCaptureMetaData$AeState3));
        c = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(cameraCaptureMetaData$AeState2);
        copyOf.remove(cameraCaptureMetaData$AeState3);
        d = Collections.unmodifiableSet(copyOf);
    }
}
