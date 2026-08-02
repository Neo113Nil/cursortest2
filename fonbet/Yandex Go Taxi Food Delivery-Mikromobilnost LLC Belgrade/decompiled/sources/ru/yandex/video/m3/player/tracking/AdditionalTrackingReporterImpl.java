package ru.yandex.video.m3.player.tracking;

import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/tracking/AdditionalTrackingReporterImpl;", "Lru/yandex/video/m3/player/tracking/AdditionalTrackingReporter;", "reporter", "(Lru/yandex/video/m3/player/tracking/AdditionalTrackingReporter;)V", "reportCustomTracking", "", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lru/yandex/video/m3/player/tracking/TrackingEvent;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdditionalTrackingReporterImpl implements AdditionalTrackingReporter {
    public static final int $stable = 8;
    private final /* synthetic */ AdditionalTrackingReporter $$delegate_0;

    public AdditionalTrackingReporterImpl(AdditionalTrackingReporter additionalTrackingReporter) {
        this.$$delegate_0 = additionalTrackingReporter;
    }

    @Override // ru.yandex.video.m3.player.tracking.AdditionalTrackingReporter
    public boolean reportCustomTracking(TrackingEvent event) {
        return this.$$delegate_0.reportCustomTracking(event);
    }
}
