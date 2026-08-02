package ru.yandex.video.m3.benchmark;

import defpackage.d5z0;
import defpackage.h5z0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.benchmark.models.MetricsEvent;
import ru.yandex.video.m3.benchmark.models.MetricsMeasurement;
import ru.yandex.video.m3.benchmark.models.MetricsTimeline;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/benchmark/MetricsManagerImpl;", "Lru/yandex/video/m3/benchmark/MetricsManager;", "Lru/yandex/video/m3/benchmark/MetricsReporter;", "metricsReporter", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "<init>", "(Lru/yandex/video/m3/benchmark/MetricsReporter;Lru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "Lru/yandex/video/m3/benchmark/models/MetricsTimeline;", "makeTimeline", "()Lru/yandex/video/m3/benchmark/models/MetricsTimeline;", "Lru/yandex/video/m3/benchmark/models/MetricsEvent;", "metricsEvent", "Lzy11;", "onEvent", "(Lru/yandex/video/m3/benchmark/models/MetricsEvent;)V", "Lru/yandex/video/m3/benchmark/MetricsReporter;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetricsManagerImpl implements MetricsManager {
    public static final int $stable = 0;
    private final MetricsReporter metricsReporter;
    private final TimeProvider timeProvider;

    public /* synthetic */ MetricsManagerImpl(MetricsReporter metricsReporter, TimeProvider timeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(metricsReporter, (i & 2) != 0 ? new SystemTimeProvider() : timeProvider);
    }

    @Override // ru.yandex.video.m3.benchmark.MetricsManager
    public MetricsTimeline makeTimeline() {
        return new MetricsTimeline(this.timeProvider);
    }

    @Override // ru.yandex.video.m3.benchmark.MetricsManager
    public void onEvent(MetricsEvent metricsEvent) {
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.a("Event received = " + metricsEvent + "; Thread: " + Thread.currentThread().getName(), new Object[0]);
        MetricsMeasurement measurement = metricsEvent.getMeasurement();
        Long valueOf = measurement != null ? Long.valueOf(measurement.getDuration()) : null;
        if (valueOf != null) {
            this.metricsReporter.reportDuration(metricsEvent.getName(), metricsEvent.getMinMs(), metricsEvent.getMaxMs(), metricsEvent.getBuckets(), valueOf.longValue());
            return;
        }
        d5z0Var.d("Event " + metricsEvent + " has invalid timestamp, probably it's start event was not recorded.", new Object[0]);
    }

    public MetricsManagerImpl(MetricsReporter metricsReporter, TimeProvider timeProvider) {
        this.metricsReporter = metricsReporter;
        this.timeProvider = timeProvider;
    }
}
