package defpackage;

import com.yandex.pulse.metrics.MetricsState;
import com.yandex.pulse.metrics.l;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class y4i {
    public final MetricsState a;

    public y4i(MetricsState metricsState) {
        metricsState.getClass();
        this.a = metricsState;
        b5i b5iVar = metricsState.d;
        if (((l) b5iVar.b).hasClientId()) {
            return;
        }
        String uuid = UUID.randomUUID().toString();
        b5iVar.d();
        ((l) b5iVar.b).setClientId(uuid);
        metricsState.a();
    }
}
