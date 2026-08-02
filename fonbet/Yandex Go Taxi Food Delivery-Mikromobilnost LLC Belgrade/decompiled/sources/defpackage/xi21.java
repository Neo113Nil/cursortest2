package defpackage;

import android.util.Range;
import androidx.camera.camera2.internal.n;
import androidx.camera.camera2.internal.p;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import java.util.Objects;

/* loaded from: classes10.dex */
public interface xi21 extends max0, eav {
    public static final x34 j4 = new x34("camerax.core.useCase.defaultSessionConfig", jyq0.class, null);
    public static final x34 k4 = new x34("camerax.core.useCase.defaultCaptureConfig", s38.class, null);
    public static final x34 l4 = new x34("camerax.core.useCase.sessionConfigUnpacker", p.class, null);
    public static final x34 m4 = new x34("camerax.core.useCase.captureConfigUnpacker", n.class, null);
    public static final x34 n4;
    public static final x34 o4;
    public static final x34 p4;
    public static final x34 q4;
    public static final x34 r4;
    public static final x34 s4;
    public static final x34 t4;
    public static final x34 u4;
    public static final x34 w4;
    public static final x34 x4;
    public static final x34 y4;

    static {
        Class cls = Integer.TYPE;
        n4 = new x34("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        o4 = new x34("camerax.core.useCase.sessionType", cls, null);
        p4 = new x34("camerax.core.useCase.targetFrameRate", Range.class, null);
        q4 = new x34("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        Class cls2 = Boolean.TYPE;
        r4 = new x34("camerax.core.useCase.zslDisabled", cls2, null);
        s4 = new x34("camerax.core.useCase.highResolutionDisabled", cls2, null);
        t4 = new x34("camerax.core.useCase.captureType", UseCaseConfigFactory$CaptureType.class, null);
        u4 = new x34("camerax.core.useCase.previewStabilizationMode", cls, null);
        w4 = new x34("camerax.core.useCase.videoStabilizationMode", cls, null);
        x4 = new x34("camerax.core.useCase.takePictureManagerProvider", vi21.class, null);
        y4 = new x34("camerax.core.useCase.streamUseCase", StreamUseCase.class, null);
    }

    default int l() {
        return ((Integer) g(w4, 0)).intValue();
    }

    default int m() {
        return ((Integer) g(u4, 0)).intValue();
    }

    default StreamUseCase x() {
        StreamUseCase streamUseCase = (StreamUseCase) g(y4, StreamUseCase.DEFAULT);
        Objects.requireNonNull(streamUseCase);
        return streamUseCase;
    }

    default UseCaseConfigFactory$CaptureType y() {
        return (UseCaseConfigFactory$CaptureType) f(t4);
    }
}
