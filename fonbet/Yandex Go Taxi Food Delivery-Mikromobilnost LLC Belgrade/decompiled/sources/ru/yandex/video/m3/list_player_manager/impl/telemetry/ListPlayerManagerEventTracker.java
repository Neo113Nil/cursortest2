package ru.yandex.video.m3.list_player_manager.impl.telemetry;

import defpackage.b64;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.debug.SpeedTelemetryCallback;
import ru.yandex.video.m3.debug.model.InitMediaItemBundle;
import ru.yandex.video.m3.list_player_manager.PlaybackConfig;
import ru.yandex.video.m3.list_player_manager.UtilKt;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.list_player_manager.pool.ForceEnginePoolError;
import ru.yandex.video.m3.list_player_manager.pool.GetEngineFromPausePlayerError;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.tracking.TrackingCommonArguments;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultEventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.EventsLabel;
import ru.yandex.video.m3.player.impl.tracking.event.VideoType;
import ru.yandex.video.m3.player.report.builder.ReportBuilder;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.preload_manager.PreloadException;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002<=B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJa\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\"2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020-¢\u0006\u0004\b'\u0010.J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker;", "", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "strmTrackingApi", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "trackingCommonArguments", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "reportBuilder", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/debug/SpeedTelemetryCallback;", "speedTelemetryCallback", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;Lru/yandex/video/m3/player/report/builder/ReportBuilder;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/debug/SpeedTelemetryCallback;)V", "", "eventName", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaData", "Lru/yandex/video/m3/player/impl/tracking/event/EventType;", "eventType", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", Constants.KEY_DATA, "", ClidProvider.TIMESTAMP, "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "playbackConfig", "", "playerIndex", "sourceIndex", "Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "createEvent", "(Ljava/lang/String;Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/player/impl/tracking/event/EventType;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;JLru/yandex/video/m3/list_player_manager/PlaybackConfig;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/InitMediaItemData;", "itemData", "Lzy11;", "reportInitMediaItemEvent", "(Lru/yandex/video/m3/list_player_manager/impl/telemetry/InitMediaItemData;Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/PlaybackConfig;)V", "Lru/yandex/video/m3/list_player_manager/pool/ForceEnginePoolError;", "poolError", "reportPoolError", "(Lru/yandex/video/m3/list_player_manager/pool/ForceEnginePoolError;)V", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", "cacheInitError", "reportCacheInitError", "(Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;)V", "Lru/yandex/video/m3/list_player_manager/pool/GetEngineFromPausePlayerError;", "(Lru/yandex/video/m3/list_player_manager/pool/GetEngineFromPausePlayerError;)V", "reportDebugReport", "()V", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/debug/SpeedTelemetryCallback;", "Lru/yandex/video/m3/player/impl/tracking/data/DefaultEventTypeProvider;", "eventTypeProvider", "Lru/yandex/video/m3/player/impl/tracking/data/DefaultEventTypeProvider;", "Ljava/util/concurrent/atomic/AtomicInteger;", "eventIndexProvider", "Ljava/util/concurrent/atomic/AtomicInteger;", "DebugReportData", "ErrorWithStackTrace", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListPlayerManagerEventTracker {
    public static final int $stable = 8;
    private final JsonConverter jsonConverter;
    private final ReportBuilder reportBuilder;
    private final SpeedTelemetryCallback speedTelemetryCallback;
    private final StrmTrackingApi strmTrackingApi;
    private final TrackingCommonArguments trackingCommonArguments;
    private final DefaultEventTypeProvider eventTypeProvider = new DefaultEventTypeProvider();
    private final AtomicInteger eventIndexProvider = new AtomicInteger(0);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker$DebugReportData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "reportData", "", "(Ljava/lang/String;)V", "getReportData", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DebugReportData extends DefaultEventData {
        public static final int $stable = 0;
        private final String reportData;

        public DebugReportData(String str) {
            super(null, 1, null);
            this.reportData = str;
        }

        public final String getReportData() {
            return this.reportData;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker$ErrorWithStackTrace;", "", "throwable", "", "stackTrace", "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "getStackTrace", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ErrorWithStackTrace {
        private final String stackTrace;
        private final Throwable throwable;

        public ErrorWithStackTrace(Throwable th, String str) {
            this.throwable = th;
            this.stackTrace = str;
        }

        public static /* synthetic */ ErrorWithStackTrace copy$default(ErrorWithStackTrace errorWithStackTrace, Throwable th, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                th = errorWithStackTrace.throwable;
            }
            if ((i & 2) != 0) {
                str = errorWithStackTrace.stackTrace;
            }
            return errorWithStackTrace.copy(th, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStackTrace() {
            return this.stackTrace;
        }

        public final ErrorWithStackTrace copy(Throwable throwable, String stackTrace) {
            return new ErrorWithStackTrace(throwable, stackTrace);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorWithStackTrace)) {
                return false;
            }
            ErrorWithStackTrace errorWithStackTrace = (ErrorWithStackTrace) other;
            return jl40.l(this.throwable, errorWithStackTrace.throwable) && jl40.l(this.stackTrace, errorWithStackTrace.stackTrace);
        }

        public final String getStackTrace() {
            return this.stackTrace;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.stackTrace.hashCode() + (this.throwable.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ErrorWithStackTrace(throwable=");
            sb.append(this.throwable);
            sb.append(", stackTrace=");
            return b64.p(sb, this.stackTrace, ')');
        }
    }

    public ListPlayerManagerEventTracker(StrmTrackingApi strmTrackingApi, TrackingCommonArguments trackingCommonArguments, ReportBuilder reportBuilder, JsonConverter jsonConverter, SpeedTelemetryCallback speedTelemetryCallback) {
        this.strmTrackingApi = strmTrackingApi;
        this.trackingCommonArguments = trackingCommonArguments;
        this.reportBuilder = reportBuilder;
        this.jsonConverter = jsonConverter;
        this.speedTelemetryCallback = speedTelemetryCallback;
    }

    private final EventDefault createEvent(String eventName, MediaData mediaData, EventType eventType, DefaultEventData data, long timestamp, PlaybackConfig playbackConfig, Integer playerIndex, Integer sourceIndex) {
        String service = this.trackingCommonArguments.getService();
        String vsid = this.trackingCommonArguments.getVsid();
        String from = this.trackingCommonArguments.getFrom();
        if (from == null) {
            from = this.trackingCommonArguments.getAppInfo().getApplicationId();
        }
        return new EventDefault(service, vsid, playerIndex != null ? playerIndex.intValue() : -1, eventName, timestamp, new EventsLabel(from, this.trackingCommonArguments.getAppInfo().getAppVersionName(), String.valueOf(this.trackingCommonArguments.getAppInfo().getAppVersionCode()), VideoType.VOD, null, 16, null), this.eventTypeProvider.getEventType(eventType), mediaData != null ? UtilKt.streamFromMediaData(mediaData) : null, this.trackingCommonArguments.getDeviceWithDisplayInfo(), this.trackingCommonArguments.getPuid(), this.trackingCommonArguments.getSlots(), this.trackingCommonArguments.getTestIds(), mediaData != null ? mediaData.getVideoContentId() : null, null, Boolean.FALSE, playbackConfig != null ? playbackConfig.getAdditionalParameters() : null, data, Integer.valueOf(this.eventIndexProvider.getAndIncrement()), null, this.trackingCommonArguments.getVpuid(), sourceIndex);
    }

    public static /* synthetic */ EventDefault createEvent$default(ListPlayerManagerEventTracker listPlayerManagerEventTracker, String str, MediaData mediaData, EventType eventType, DefaultEventData defaultEventData, long j, PlaybackConfig playbackConfig, Integer num, Integer num2, int i, Object obj) {
        Integer num3;
        ListPlayerManagerEventTracker listPlayerManagerEventTracker2;
        String str2;
        MediaData mediaData2;
        PlaybackConfig playbackConfig2;
        if ((i & 4) != 0) {
            eventType = EventType.EVENT;
        }
        EventType eventType2 = eventType;
        DefaultEventData defaultEventData2 = (i & 8) != 0 ? new DefaultEventData(null, 1, null) : defaultEventData;
        long currentTimeMillis = (i & 16) != 0 ? System.currentTimeMillis() : j;
        Integer num4 = (i & 64) != 0 ? null : num;
        if ((i & 128) != 0) {
            num3 = null;
            listPlayerManagerEventTracker2 = listPlayerManagerEventTracker;
            mediaData2 = mediaData;
            playbackConfig2 = playbackConfig;
            str2 = str;
        } else {
            num3 = num2;
            listPlayerManagerEventTracker2 = listPlayerManagerEventTracker;
            str2 = str;
            mediaData2 = mediaData;
            playbackConfig2 = playbackConfig;
        }
        return listPlayerManagerEventTracker2.createEvent(str2, mediaData2, eventType2, defaultEventData2, currentTimeMillis, playbackConfig2, num4, num3);
    }

    public final void reportCacheInitError(PreloadException.CacheInitException cacheInitError) {
        StringWriter stringWriter = new StringWriter();
        cacheInitError.printStackTrace(new PrintWriter(stringWriter));
        this.strmTrackingApi.trackEvent(createEvent$default(this, "CacheInitError", null, EventType.ERROR, new DefaultEventData(this.jsonConverter.to(new ErrorWithStackTrace(cacheInitError, stringWriter.toString()))), 0L, null, null, null, 208, null));
    }

    public final void reportDebugReport() {
        this.strmTrackingApi.trackEvent(createEvent$default(this, "DebugReport", null, null, new DebugReportData(this.jsonConverter.to(this.reportBuilder.getDebugReport())), 0L, null, null, null, 212, null));
    }

    public final void reportInitMediaItemEvent(InitMediaItemData itemData, MediaData mediaData, PlaybackConfig playbackConfig) {
        this.speedTelemetryCallback.onNemInitMediaItemBundle(new InitMediaItemBundle(itemData, mediaData));
        this.strmTrackingApi.trackEvent(createEvent$default(this, "InitMediaItem", mediaData, null, itemData, 0L, playbackConfig, itemData.getPlayerIndex(), itemData.getSourceIndex(), 20, null));
    }

    public final void reportPoolError(ForceEnginePoolError poolError) {
        this.strmTrackingApi.trackEvent(createEvent$default(this, "PollError", null, EventType.ERROR, new DefaultEventData(this.jsonConverter.to(poolError)), 0L, null, null, null, 208, null));
    }

    public final void reportPoolError(GetEngineFromPausePlayerError poolError) {
        this.strmTrackingApi.trackEvent(createEvent$default(this, "PollError", null, EventType.ERROR, new DefaultEventData(this.jsonConverter.to(poolError)), 0L, null, null, null, 208, null));
    }
}
