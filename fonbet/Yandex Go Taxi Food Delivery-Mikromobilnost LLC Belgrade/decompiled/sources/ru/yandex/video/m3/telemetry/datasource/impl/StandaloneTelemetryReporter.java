package ru.yandex.video.m3.telemetry.datasource.impl;

import defpackage.tje;
import defpackage.tse;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.EventsLabel;
import ru.yandex.video.m3.player.impl.tracking.event.StateBasedEventData;
import ru.yandex.video.m3.player.tracking.LoadError;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001c\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*¨\u0006+"}, d2 = {"Lru/yandex/video/m3/telemetry/datasource/impl/StandaloneTelemetryReporter;", "", "Lru/yandex/video/m3/telemetry/datasource/impl/LoggingInfoHolder;", "loggingInfoHolder", "Lru/yandex/video/m3/player/IndexGenerator;", "eventIndexGenerator", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "errorCategoryProvider", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "eventTypeProvider", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "strmTrackingApi", "Ltse;", "coroutineScope", "<init>", "(Lru/yandex/video/m3/telemetry/datasource/impl/LoggingInfoHolder;Lru/yandex/video/m3/player/IndexGenerator;Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;Ltse;)V", "Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "trackEvent", "(Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;)V", "", "url", "eventName", "Lru/yandex/video/m3/player/impl/tracking/event/EventType;", "eventType", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", Constants.KEY_DATA, "createDefaultEvent", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/event/EventType;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "Lru/yandex/video/m3/player/impl/tracking/event/StateBasedEventData;", "createUnknownDataForEvent", "()Lru/yandex/video/m3/player/impl/tracking/event/StateBasedEventData;", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/tracking/LoadError;)V", "Lru/yandex/video/m3/telemetry/datasource/impl/LoggingInfoHolder;", "Lru/yandex/video/m3/player/IndexGenerator;", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "Ltse;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StandaloneTelemetryReporter {
    public static final int $stable = 8;
    private final tse coroutineScope;
    private final ErrorCategoryProvider errorCategoryProvider;
    private final IndexGenerator eventIndexGenerator;
    private final EventTypeProvider eventTypeProvider;
    private final LoggingInfoHolder loggingInfoHolder;
    private final StrmTrackingApi strmTrackingApi;

    public StandaloneTelemetryReporter(LoggingInfoHolder loggingInfoHolder, IndexGenerator indexGenerator, ErrorCategoryProvider errorCategoryProvider, EventTypeProvider eventTypeProvider, StrmTrackingApi strmTrackingApi, tse tseVar) {
        this.loggingInfoHolder = loggingInfoHolder;
        this.eventIndexGenerator = indexGenerator;
        this.errorCategoryProvider = errorCategoryProvider;
        this.eventTypeProvider = eventTypeProvider;
        this.strmTrackingApi = strmTrackingApi;
        this.coroutineScope = tseVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventDefault createDefaultEvent(String url, String eventName, EventType eventType, DefaultEventData data) {
        return new EventDefault(this.loggingInfoHolder.getService(), this.loggingInfoHolder.getSessionId(), -1, eventName, System.currentTimeMillis(), new EventsLabel(this.loggingInfoHolder.getFrom(), this.loggingInfoHolder.getAppInfo().getAppVersionName(), String.valueOf(this.loggingInfoHolder.getAppInfo().getAppVersionCode()), null, null), this.eventTypeProvider.getEventType(eventType), url, this.loggingInfoHolder.getDeviceInfo(), null, null, this.loggingInfoHolder.getTestIds(), null, null, Boolean.FALSE, null, data, Integer.valueOf(this.eventIndexGenerator.getNextIndex()), null, this.loggingInfoHolder.getVpuid(), -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateBasedEventData createUnknownDataForEvent() {
        return new StateBasedEventData(null, null, null, false, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackEvent(EventDefault event) {
        this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(event);
    }

    public final void onLoadError(LoadError loadError) {
        tje.N(this.coroutineScope, null, null, new StandaloneTelemetryReporter$onLoadError$1(loadError, this, null), 3);
    }
}
