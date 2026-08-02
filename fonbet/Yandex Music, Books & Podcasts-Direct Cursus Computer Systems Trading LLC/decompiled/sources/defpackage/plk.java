package defpackage;

import com.yandex.pulse.histogram.ComponentHistograms;

/* loaded from: classes5.dex */
public abstract class plk {
    public static final lyd a = y2x.y(2, "MetricsState.PersistentLogRecallProtobufs");
    public static final lyd b = y2x.z("UMA.ProtoCompressionRatio");
    public static final lyd c;
    public static final lyd d;

    static {
        Object obj = ComponentHistograms.b;
        c = xee.B().b("UMA.Large Accumulated Log Not Persisted", 1, 1000000, 50);
        d = xee.B().b("UMA.UnsentLogs.Dropped", 1, 1000000, 50);
    }
}
