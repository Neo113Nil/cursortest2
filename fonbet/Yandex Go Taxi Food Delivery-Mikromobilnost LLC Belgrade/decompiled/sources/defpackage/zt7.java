package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class zt7 implements max0 {
    public static final x34 A;
    public static final x34 B;
    public static final x34 C;
    public static final x34 D;
    public static final x34 E;
    public static final x34 F;
    public static final x34 b = new x34("camerax.core.appConfig.cameraFactoryProvider", mn7.class, null);
    public static final x34 c = new x34("camerax.core.appConfig.deviceSurfaceManagerProvider", nn7.class, null);
    public static final x34 w = new x34("camerax.core.appConfig.useCaseConfigFactoryProvider", on7.class, null);
    public static final x34 x = new x34("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final x34 y = new x34("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final x34 z;
    public final ug70 a;

    static {
        Class cls = Integer.TYPE;
        z = new x34("camerax.core.appConfig.minimumLoggingLevel", cls, null);
        A = new x34("camerax.core.appConfig.availableCamerasLimiter", xs7.class, null);
        B = new x34("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
        C = new x34("camerax.core.appConfig.cameraProviderInitRetryPolicy", b2k0.class, null);
        D = new x34("camerax.core.appConfig.quirksSettings", ilg0.class, null);
        E = new x34("camerax.core.appConfig.configImplType", cls, null);
        F = new x34("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    }

    public zt7(ug70 ug70Var) {
        this.a = ug70Var;
    }

    public final xs7 a() {
        return (xs7) this.a.g(A, null);
    }

    public final mn7 b() {
        return (mn7) this.a.g(b, null);
    }

    @Override // defpackage.ybi0
    public final szd getConfig() {
        return this.a;
    }

    public final long p() {
        return ((Long) this.a.g(B, -1L)).longValue();
    }

    public final nn7 t() {
        return (nn7) this.a.g(c, null);
    }

    public final on7 w() {
        return (on7) this.a.g(w, null);
    }
}
