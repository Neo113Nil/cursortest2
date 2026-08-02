package defpackage;

import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.metrics.MetricsState;

/* loaded from: classes5.dex */
public final class q4i {
    public static final lyd g;
    public static final r4r h;
    public static final lyd i;
    public static final lyd j;
    public final m4i a;
    public final j4i b;
    public boolean c;
    public l4i d;
    public e5i e;
    public long f;

    static {
        Object obj = ComponentHistograms.b;
        g = xee.B().b("UMA.ActualLogUploadInterval", 1, (int) 720, 50);
        ComponentHistograms B = xee.B();
        lyd a = B.a("UMA.LogUpload.ResponseOrErrorCode");
        if (a == null) {
            a = B.e(new r4r());
        }
        if (!(a instanceof r4r)) {
            xq0.q("Already registered as non-sparse histogram");
            return;
        }
        h = (r4r) a;
        i = xee.B().b("UMA.LogSize.OnSuccess", 1, 10000, 50);
        j = xee.B().b("UMA.Large Rejected Log was Discarded", 1, 1000000, 50);
    }

    public q4i(m4i m4iVar, MetricsState metricsState) {
        m4iVar.getClass();
        metricsState.getClass();
        this.a = m4iVar;
        this.b = new j4i(metricsState);
        this.f = -1L;
    }

    public final void a() {
        if (this.c) {
            e5i e5iVar = this.e;
            e5iVar.getClass();
            e5iVar.start(15000L);
        }
    }
}
