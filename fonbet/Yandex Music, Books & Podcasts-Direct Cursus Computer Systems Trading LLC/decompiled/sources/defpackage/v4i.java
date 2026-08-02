package defpackage;

import com.yandex.pulse.metrics.MetricsService;

/* loaded from: classes5.dex */
public final /* synthetic */ class v4i implements zyc {
    public final /* synthetic */ MetricsService a;

    public v4i(MetricsService metricsService) {
        this.a = metricsService;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v4i) {
            return getFunctionDelegate().equals(((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(1, 0, MetricsService.class, this.a, "onConnectionTypeChanged", "onConnectionTypeChanged(I)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
