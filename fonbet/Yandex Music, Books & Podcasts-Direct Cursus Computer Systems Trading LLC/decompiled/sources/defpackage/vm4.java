package defpackage;

import com.yandex.pulse.metrics.MetricsState;
import com.yandex.pulse.metrics.l;
import com.yandex.pulse.metrics.m;

/* loaded from: classes5.dex */
public final class vm4 {
    public final MetricsState a;
    public final boolean b;

    public vm4(MetricsState metricsState) {
        metricsState.getClass();
        this.a = metricsState;
        this.b = (((l) metricsState.d.b).hasStability() && metricsState.d.h().hasIsExitedCleanly()) ? metricsState.d.h().getIsExitedCleanly() : true;
    }

    public final void a(boolean z) {
        MetricsState metricsState = this.a;
        b5i b5iVar = metricsState.d;
        c5i c5iVar = (c5i) b5iVar.h().m30toBuilder();
        c5iVar.d();
        ((m) c5iVar.b).setIsExitedCleanly(z);
        m mVar = (m) c5iVar.b();
        b5iVar.d();
        ((l) b5iVar.b).setStability(mVar);
        metricsState.a();
    }
}
