package ru.yandex.video.m3.benchmark;

import kotlin.Metadata;
import ru.yandex.video.m3.benchmark.models.MetricsEvent;
import ru.yandex.video.m3.benchmark.models.MetricsTimeline;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/benchmark/MetricsManager;", "", "Lru/yandex/video/m3/benchmark/models/MetricsTimeline;", "makeTimeline", "()Lru/yandex/video/m3/benchmark/models/MetricsTimeline;", "Lru/yandex/video/m3/benchmark/models/MetricsEvent;", "metricsEvent", "Lzy11;", "onEvent", "(Lru/yandex/video/m3/benchmark/models/MetricsEvent;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MetricsManager {
    MetricsTimeline makeTimeline();

    void onEvent(MetricsEvent metricsEvent);
}
