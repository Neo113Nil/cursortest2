package ru.yandex.video.m3.benchmark.models;

import java.util.concurrent.atomic.AtomicLongArray;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/benchmark/models/MetricsTimeline;", "", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "<init>", "(Lru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "Lru/yandex/video/m3/benchmark/models/MetricsTimelineEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "mark", "(Lru/yandex/video/m3/benchmark/models/MetricsTimelineEvent;)V", "startEvent", "Lru/yandex/video/m3/benchmark/models/MetricsMeasurement;", "measure", "(Lru/yandex/video/m3/benchmark/models/MetricsTimelineEvent;)Lru/yandex/video/m3/benchmark/models/MetricsMeasurement;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Ljava/util/concurrent/atomic/AtomicLongArray;", "marks", "Ljava/util/concurrent/atomic/AtomicLongArray;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetricsTimeline {
    public static final int $stable = 8;
    private final AtomicLongArray marks;
    private final TimeProvider timeProvider;

    public MetricsTimeline(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
        this.marks = new AtomicLongArray(MetricsTimelineEvent.values().length);
    }

    public final void mark(MetricsTimelineEvent event) {
        this.marks.set(event.ordinal(), this.timeProvider.uptimeMillis());
    }

    public final MetricsMeasurement measure(MetricsTimelineEvent startEvent) {
        long j = this.marks.get(startEvent.ordinal());
        if (j != 0) {
            return new MetricsMeasurement(this.timeProvider.uptimeMillis() - j);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MetricsTimeline() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MetricsTimeline(TimeProvider timeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SystemTimeProvider() : timeProvider);
    }
}
