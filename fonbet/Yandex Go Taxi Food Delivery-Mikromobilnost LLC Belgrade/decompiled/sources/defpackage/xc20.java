package defpackage;

import com.yandex.pulse.metrics.MetricsState;

/* loaded from: classes8.dex */
public final class xc20 extends ufz {
    public final y0b0 a;
    public final y0b0 b;
    public boolean c;

    public xc20(MetricsState metricsState) {
        int i = 28;
        this.a = new y0b0(new cot(i, metricsState), 20, 0);
        this.b = new y0b0(new gp50(i, metricsState), 8, 102400);
    }

    public final boolean a() {
        return this.a.a() || this.b.a();
    }

    public final boolean b() {
        return this.a.e.size() > 0 || this.b.e.size() > 0;
    }
}
