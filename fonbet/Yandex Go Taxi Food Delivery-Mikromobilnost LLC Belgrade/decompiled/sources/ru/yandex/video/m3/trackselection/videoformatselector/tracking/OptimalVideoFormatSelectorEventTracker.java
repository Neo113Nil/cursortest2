package ru.yandex.video.m3.trackselection.videoformatselector.tracking;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.SimpleIndexGenerator;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.tracking.TrackingCommonArguments;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultEventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.EventsLabel;
import ru.yandex.video.m3.player.impl.tracking.event.VideoType;
import ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorAnalyticsData;
import ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorException;
import ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorExceptionKt;
import ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorObserver;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 .2\u00020\u0001:\u0003./0B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J[\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aj\u0004\u0018\u0001`\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020%2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-¨\u00061"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEventTracker;", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorObserver;", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "strmTrackingApi", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "trackingCommonArguments", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "eventTypeProvider", "Lru/yandex/video/m3/player/IndexGenerator;", "eventIndexGenerator", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;Lru/yandex/video/m3/player/IndexGenerator;)V", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;", Constants.KEY_EXCEPTION, "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", Constants.KEY_DATA, "", "vsid", "Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "createError", "(Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;Ljava/lang/String;)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "eventName", "Lru/yandex/video/m3/player/impl/tracking/event/EventType;", "eventType", "", ClidProvider.TIMESTAMP, "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "createEvent", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/event/EventType;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;JLjava/util/Map;)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEventTracker$SelectionErrorData;", "createErrorData", "(Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;)Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEventTracker$SelectionErrorData;", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorAnalyticsData;", "optimalVideoFormatSelectorAnalyticsData", "Lzy11;", "onSelectionFinished", "(Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorAnalyticsData;Ljava/lang/String;)V", "onSelectionError", "(Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;Ljava/lang/String;)V", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "Lru/yandex/video/m3/player/IndexGenerator;", "Companion", "SelectionErrorData", "SelectionResultData", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OptimalVideoFormatSelectorEventTracker implements OptimalVideoFormatSelectorObserver {
    private static final String SELECTOR_ERROR_CATEGORY = "DEFAULT";
    private final IndexGenerator eventIndexGenerator;
    private final EventTypeProvider eventTypeProvider;
    private final StrmTrackingApi strmTrackingApi;
    private final TrackingCommonArguments trackingCommonArguments;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEventTracker$SelectionErrorData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", Constants.KEY_MESSAGE, "", AuthSdkActivity.RESPONSE_TYPE_CODE, "isFatal", "", "stack", "category", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getCode", "()Z", "getMessage", "getStack", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SelectionErrorData extends DefaultEventData {
        private final String category;
        private final String code;
        private final boolean isFatal;
        private final String message;
        private final String stack;

        public SelectionErrorData(String str, String str2, boolean z, String str3, String str4) {
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

    public /* synthetic */ OptimalVideoFormatSelectorEventTracker(StrmTrackingApi strmTrackingApi, TrackingCommonArguments trackingCommonArguments, EventTypeProvider eventTypeProvider, IndexGenerator indexGenerator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(strmTrackingApi, trackingCommonArguments, (i & 4) != 0 ? new DefaultEventTypeProvider() : eventTypeProvider, (i & 8) != 0 ? new SimpleIndexGenerator() : indexGenerator);
    }

    private final EventDefault createError(OptimalVideoFormatSelectorException exception, DefaultEventData data, String vsid) {
        return createEvent$default(this, OptimalVideoFormatSelectorExceptionKt.toEventName(exception), vsid, EventType.ERROR, data, System.currentTimeMillis(), null, 32, null);
    }

    private final SelectionErrorData createErrorData(OptimalVideoFormatSelectorException exception) {
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        return new SelectionErrorData(message, OptimalVideoFormatSelectorExceptionKt.toEventName(exception), false, stringWriter2, SELECTOR_ERROR_CATEGORY);
    }

    private final EventDefault createEvent(String eventName, String vsid, EventType eventType, DefaultEventData data, long timestamp, Map<String, ? extends Object> additionalParameters) {
        String service = this.trackingCommonArguments.getService();
        int playerIndex = this.trackingCommonArguments.getPlayerIndex();
        String from = this.trackingCommonArguments.getFrom();
        if (from == null) {
            from = this.trackingCommonArguments.getAppInfo().getApplicationId();
        }
        return new EventDefault(service, vsid, playerIndex, eventName, timestamp, new EventsLabel(from, this.trackingCommonArguments.getAppInfo().getAppVersionName(), String.valueOf(this.trackingCommonArguments.getAppInfo().getAppVersionCode()), VideoType.VOD, null, 16, null), this.eventTypeProvider.getEventType(eventType), null, this.trackingCommonArguments.getDeviceWithDisplayInfo(), this.trackingCommonArguments.getPuid(), this.trackingCommonArguments.getSlots(), this.trackingCommonArguments.getTestIds(), null, null, Boolean.FALSE, additionalParameters, data, Integer.valueOf(this.eventIndexGenerator.getNextIndex()), null, this.trackingCommonArguments.getVpuid(), 0);
    }

    public static /* synthetic */ EventDefault createEvent$default(OptimalVideoFormatSelectorEventTracker optimalVideoFormatSelectorEventTracker, String str, String str2, EventType eventType, DefaultEventData defaultEventData, long j, Map map, int i, Object obj) {
        Map map2;
        OptimalVideoFormatSelectorEventTracker optimalVideoFormatSelectorEventTracker2;
        String str3;
        String str4;
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
        long j2 = j;
        if ((i & 32) != 0) {
            map2 = null;
            str3 = str;
            str4 = str2;
            optimalVideoFormatSelectorEventTracker2 = optimalVideoFormatSelectorEventTracker;
        } else {
            map2 = map;
            optimalVideoFormatSelectorEventTracker2 = optimalVideoFormatSelectorEventTracker;
            str3 = str;
            str4 = str2;
        }
        return optimalVideoFormatSelectorEventTracker2.createEvent(str3, str4, eventType2, defaultEventData2, j2, map2);
    }

    @Override // ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorObserver
    public void onSelectionError(OptimalVideoFormatSelectorException exception, String vsid) {
        this.strmTrackingApi.trackEvent(createError(exception, createErrorData(exception), vsid));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorObserver
    public void onSelectionFinished(OptimalVideoFormatSelectorAnalyticsData optimalVideoFormatSelectorAnalyticsData, String vsid) {
        this.strmTrackingApi.trackEvent(createEvent$default(this, OptimalVideoFormatSelectorEvent.FINISHED.toEventName(), vsid, null, new SelectionResultData(optimalVideoFormatSelectorAnalyticsData, null, 2, 0 == true ? 1 : 0), 0L, null, 52, null));
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEventTracker$SelectionResultData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", Constants.KEY_DATA, "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorAnalyticsData;", Constants.KEY_MESSAGE, "", "(Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorAnalyticsData;Ljava/lang/String;)V", "getData", "()Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorAnalyticsData;", "getMessage", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SelectionResultData extends DefaultEventData {
        private final OptimalVideoFormatSelectorAnalyticsData data;
        private final String message;

        public SelectionResultData(OptimalVideoFormatSelectorAnalyticsData optimalVideoFormatSelectorAnalyticsData, String str) {
            super(null, 1, null);
            this.data = optimalVideoFormatSelectorAnalyticsData;
            this.message = str;
        }

        public final OptimalVideoFormatSelectorAnalyticsData getData() {
            return this.data;
        }

        public final String getMessage() {
            return this.message;
        }

        public /* synthetic */ SelectionResultData(OptimalVideoFormatSelectorAnalyticsData optimalVideoFormatSelectorAnalyticsData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(optimalVideoFormatSelectorAnalyticsData, (i & 2) != 0 ? null : str);
        }
    }

    public OptimalVideoFormatSelectorEventTracker(StrmTrackingApi strmTrackingApi, TrackingCommonArguments trackingCommonArguments, EventTypeProvider eventTypeProvider, IndexGenerator indexGenerator) {
        this.strmTrackingApi = strmTrackingApi;
        this.trackingCommonArguments = trackingCommonArguments;
        this.eventTypeProvider = eventTypeProvider;
        this.eventIndexGenerator = indexGenerator;
    }
}
