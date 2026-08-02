package defpackage;

import com.yandex.pulse.histogram.ComponentHistograms;

/* loaded from: classes8.dex */
public abstract class z0b0 {
    public static final vku a = ffx.L(2, "MetricsState.PersistentLogRecallProtobufs");
    public static final vku b = ffx.Q("UMA.ProtoCompressionRatio");
    public static final vku c;
    public static final vku d;

    static {
        Object obj = ComponentHistograms.b;
        c = vez0.u().b(1, 1000000, 50, "UMA.Large Accumulated Log Not Persisted");
        d = vez0.u().b(1, 1000000, 50, "UMA.UnsentLogs.Dropped");
    }
}
