package flex.core.velocity;

import android.view.Choreographer;
import defpackage.i3y;
import defpackage.j8s;
import kotlin.a;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class FpsMonitoringHelper {
    public int b;
    public Double e;
    public final int f;
    public final FpsMonitoringHelper$callback$1 g;
    public final i3y a = a.a(new j8s(14));
    public long c = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
    public long d = Long.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r0v8, types: [flex.core.velocity.FpsMonitoringHelper$callback$1] */
    public FpsMonitoringHelper() {
        this.f = 1000000000;
        this.g = new Choreographer.FrameCallback() { // from class: flex.core.velocity.FpsMonitoringHelper$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long frameTimeNanos) {
                FpsMonitoringHelper fpsMonitoringHelper = FpsMonitoringHelper.this;
                long j = fpsMonitoringHelper.c;
                if (j > frameTimeNanos) {
                    j = frameTimeNanos;
                }
                fpsMonitoringHelper.c = j;
                long j2 = fpsMonitoringHelper.d;
                if (j2 >= frameTimeNanos) {
                    frameTimeNanos = j2;
                }
                fpsMonitoringHelper.d = frameTimeNanos;
                fpsMonitoringHelper.b++;
                ((Choreographer) fpsMonitoringHelper.a.getValue()).postFrameCallback(this);
            }
        };
    }
}
