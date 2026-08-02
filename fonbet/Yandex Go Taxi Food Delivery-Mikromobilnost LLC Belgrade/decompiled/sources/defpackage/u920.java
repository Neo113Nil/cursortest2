package defpackage;

import androidx.camera.camera2.internal.p;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class u920 implements xi21 {
    public final yy40 a;

    public u920() {
        yy40 b = yy40.b();
        b.w(xi21.l4, new p());
        b.w(eav.j2, 34);
        b.w(max0.f4, v920.class);
        b.w(max0.e4, v920.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = b;
    }

    @Override // defpackage.ybi0
    public final szd getConfig() {
        return this.a;
    }

    @Override // defpackage.xi21
    public final UseCaseConfigFactory$CaptureType y() {
        return UseCaseConfigFactory$CaptureType.METERING_REPEATING;
    }
}
