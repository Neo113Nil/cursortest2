package ru.yandex.video.m3.preload_manager.tracking;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.tracking.TrackingCommonArguments;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultEventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.EventsLabel;
import ru.yandex.video.m3.player.impl.tracking.event.VideoType;
import ru.yandex.video.m3.preload_manager.DownloadResult;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.PreloadExceptionKt;
import ru.yandex.video.m3.preload_manager.PreloadObserver;
import ru.yandex.video.m3.preload_manager.PreloadRequest;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 32\u00020\u0001:\u0003345B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u001b\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102¨\u00066"}, d2 = {"Lru/yandex/video/m3/preload_manager/tracking/PreloadEventTracker;", "Lru/yandex/video/m3/preload_manager/PreloadObserver;", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "strmTrackingApi", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "trackingCommonArguments", "Lru/yandex/video/m3/preload_manager/tracking/ContentIdProvider;", "contentIdProvider", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "eventTypeProvider", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;Lru/yandex/video/m3/preload_manager/tracking/ContentIdProvider;Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;)V", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "preloadRequest", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_EXCEPTION, "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", Constants.KEY_DATA, "Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "createError", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadException;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "", "eventName", "Lru/yandex/video/m3/player/impl/tracking/event/EventType;", "eventType", "", ClidProvider.TIMESTAMP, "createEvent", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/event/EventType;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;J)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "Lru/yandex/video/m3/preload_manager/tracking/PreloadEventTracker$PreloadErrorData;", "createErrorData", "(Lru/yandex/video/m3/preload_manager/PreloadException;)Lru/yandex/video/m3/preload_manager/tracking/PreloadEventTracker$PreloadErrorData;", "Lzy11;", "onRequestQueued", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;)V", "", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "downloadResults", "onJobSuccess", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Ljava/util/List;)V", "onJobCancel", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadException;Ljava/util/List;)V", "onJobError", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadException;)V", "Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;", "onApiError", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;)V", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "Lru/yandex/video/m3/preload_manager/tracking/ContentIdProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "Companion", "DownloadResultData", "PreloadErrorData", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadEventTracker implements PreloadObserver {
    public static final String PRELOAD_ERROR_CATEGORY = "PRELOAD";
    private final ContentIdProvider contentIdProvider;
    private final EventTypeProvider eventTypeProvider;
    private final StrmTrackingApi strmTrackingApi;
    private final TrackingCommonArguments trackingCommonArguments;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/preload_manager/tracking/PreloadEventTracker$PreloadErrorData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", Constants.KEY_MESSAGE, "", AuthSdkActivity.RESPONSE_TYPE_CODE, "isFatal", "", "stack", "category", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getCode", "()Z", "getMessage", "getStack", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PreloadErrorData extends DefaultEventData {
        private final String category;
        private final String code;
        private final boolean isFatal;
        private final String message;
        private final String stack;

        public PreloadErrorData(String str, String str2, boolean z, String str3, String str4) {
            super(null, 1, null);
            this.message = str;
            this.code = str2;
            this.isFatal = z;
            this.stack = str3;
            this.category = str4;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getStack() {
            return this.stack;
        }

        /* renamed from: isFatal, reason: from getter */
        public final boolean getIsFatal() {
            return this.isFatal;
        }
    }

    public /* synthetic */ PreloadEventTracker(StrmTrackingApi strmTrackingApi, TrackingCommonArguments trackingCommonArguments, ContentIdProvider contentIdProvider, EventTypeProvider eventTypeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(strmTrackingApi, trackingCommonArguments, contentIdProvider, (i & 8) != 0 ? new DefaultEventTypeProvider() : eventTypeProvider);
    }

    private final EventDefault createError(PreloadRequest preloadRequest, PreloadException exception, DefaultEventData data) {
        String eventName = PreloadExceptionKt.toEventName(exception);
        EventType eventType = EventType.ERROR;
        PreloadException.ApiCallError apiCallError = exception instanceof PreloadException.ApiCallError ? (PreloadException.ApiCallError) exception : null;
        return createEvent(preloadRequest, eventName, eventType, data, apiCallError != null ? apiCallError.getTimestamp() : System.currentTimeMillis());
    }

    private final PreloadErrorData createErrorData(PreloadException exception) {
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        return new PreloadErrorData(message, PreloadExceptionKt.toEventName(exception), false, stringWriter2, PRELOAD_ERROR_CATEGORY);
    }

    private final EventDefault createEvent(PreloadRequest preloadRequest, String eventName, EventType eventType, DefaultEventData data, long timestamp) {
        String service = this.trackingCommonArguments.getService();
        String videoSessionId = preloadRequest.getVideoSessionId();
        int playerIndex = this.trackingCommonArguments.getPlayerIndex();
        String from = this.trackingCommonArguments.getFrom();
        if (from == null) {
            from = this.trackingCommonArguments.getAppInfo().getApplicationId();
        }
        EventsLabel eventsLabel = new EventsLabel(from, this.trackingCommonArguments.getAppInfo().getAppVersionName(), String.valueOf(this.trackingCommonArguments.getAppInfo().getAppVersionCode()), VideoType.VOD, null, 16, null);
        String eventType2 = this.eventTypeProvider.getEventType(eventType);
        String manifestUrl = preloadRequest.getManifestUrl();
        Map<String, Object> deviceWithDisplayInfo = this.trackingCommonArguments.getDeviceWithDisplayInfo();
        String puid = this.trackingCommonArguments.getPuid();
        String slots = this.trackingCommonArguments.getSlots();
        List<Integer> testIds = this.trackingCommonArguments.getTestIds();
        ContentIdProvider contentIdProvider = this.contentIdProvider;
        return new EventDefault(service, videoSessionId, playerIndex, eventName, timestamp, eventsLabel, eventType2, manifestUrl, deviceWithDisplayInfo, puid, slots, testIds, contentIdProvider != null ? contentIdProvider.getContentId(preloadRequest.getRawVideoDataWithIncorrectVsid()) : null, null, Boolean.FALSE, preloadRequest.getConfig().getAdditionalParameters(), data, Integer.valueOf(preloadRequest.getEventIndexGenerator().getNextIndex()), null, this.trackingCommonArguments.getVpuid(), Integer.valueOf(preloadRequest.getSourceIndex()));
    }

    public static /* synthetic */ EventDefault createEvent$default(PreloadEventTracker preloadEventTracker, PreloadRequest preloadRequest, String str, EventType eventType, DefaultEventData defaultEventData, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            eventType = EventType.EVENT;
        }
        EventType eventType2 = eventType;
        if ((i & 8) != 0) {
            defaultEventData = new DefaultEventData(null, 1, null);
        }
        DefaultEventData defaultEventData2 = defaultEventData;
        if ((i & 16) != 0) {
            j = System.currentTimeMillis();
        }
        return preloadEventTracker.createEvent(preloadRequest, str, eventType2, defaultEventData2, j);
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadObserver
    public void onApiError(PreloadRequest preloadRequest, PreloadException.ApiCallError exception) {
        EventDefault createError = createError(preloadRequest, exception, createErrorData(exception));
        if (createError != null) {
            this.strmTrackingApi.trackEvent(createError);
        }
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadObserver
    public void onJobCancel(PreloadRequest preloadRequest, PreloadException exception, List<DownloadResult> downloadResults) {
        this.strmTrackingApi.trackEvent(createEvent$default(this, preloadRequest, PreloadEvent.CANCELED.toEventName(), null, new DownloadResultData(downloadResults, exception.getMessage()), 0L, 20, null));
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadObserver
    public void onJobError(PreloadRequest preloadRequest, PreloadException exception) {
        EventDefault createError = createError(preloadRequest, exception, createErrorData(exception));
        if (createError != null) {
            this.strmTrackingApi.trackEvent(createError);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.video.m3.preload_manager.PreloadObserver
    public void onJobSuccess(PreloadRequest preloadRequest, List<DownloadResult> downloadResults) {
        this.strmTrackingApi.trackEvent(createEvent$default(this, preloadRequest, PreloadEvent.FINISHED.toEventName(), null, new DownloadResultData(downloadResults, null, 2, 0 == true ? 1 : 0), 0L, 20, null));
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadObserver
    public void onRequestQueued(PreloadRequest preloadRequest) {
        this.strmTrackingApi.trackEvent(createEvent$default(this, preloadRequest, PreloadEvent.QUEUED.toEventName(), null, null, 0L, 28, null));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/preload_manager/tracking/PreloadEventTracker$DownloadResultData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "preloadDownloadResults", "", "Lru/yandex/video/m3/preload_manager/DownloadResult;", Constants.KEY_MESSAGE, "", "(Ljava/util/List;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getPreloadDownloadResults", "()Ljava/util/List;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DownloadResultData extends DefaultEventData {
        private final String message;
        private final List<DownloadResult> preloadDownloadResults;

        public DownloadResultData(List<DownloadResult> list, String str) {
            super(null, 1, null);
            this.preloadDownloadResults = list;
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }

        public final List<DownloadResult> getPreloadDownloadResults() {
            return this.preloadDownloadResults;
        }

        public /* synthetic */ DownloadResultData(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : str);
        }
    }

    public PreloadEventTracker(StrmTrackingApi strmTrackingApi, TrackingCommonArguments trackingCommonArguments, ContentIdProvider contentIdProvider, EventTypeProvider eventTypeProvider) {
        this.strmTrackingApi = strmTrackingApi;
        this.trackingCommonArguments = trackingCommonArguments;
        this.contentIdProvider = contentIdProvider;
        this.eventTypeProvider = eventTypeProvider;
    }
}
