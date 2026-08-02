package defpackage;

import com.yandex.pulse.metrics.MetricsState;

/* loaded from: classes5.dex */
public final class j4i extends ixf {
    public final olk d;
    public final olk e;
    public boolean f;

    public j4i(MetricsState metricsState) {
        metricsState.getClass();
        this.d = new olk(new mka(metricsState), 20, 0);
        this.e = new olk(new h4b(metricsState), 8, 102400);
    }

    public final boolean O() {
        return this.d.O() || this.e.O();
    }

    public final boolean P() {
        return this.d.g.size() > 0 || this.e.g.size() > 0;
    }
}
