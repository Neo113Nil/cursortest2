package defpackage;

/* loaded from: classes4.dex */
public final class ynf {
    public volatile wnf a;

    public final void a(long j) {
        wnf wnfVar = this.a;
        if (wnfVar == null) {
            ssg.a(3, "LaunchTrackMetricsHelper", "LaunchTrackMetrics not initialized", null);
            return;
        }
        Long l = wnfVar.c;
        if (l == null || l.longValue() > j) {
            this.a = wnf.a(wnfVar, null, null, Long.valueOf(j), null, 11);
        }
    }
}
