package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.ysq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0017\u0018\u00002\u00020\u0001Bï\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fj\u0002`\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R%\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u001a¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R(\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fj\u0002`\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0014\u0010)\u001a\u00020\u0018X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u00103\u001a\u0004\b\u0017\u00102R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0015\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010/\u001a\u0004\b=\u0010.R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\bD\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010#R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010#¨\u0006H"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "", Constants.KEY_SERVICE, "", "vsid", "playerIndex", "", "eventName", ClidProvider.TIMESTAMP, "", "labels", "Lru/yandex/video/m3/player/impl/tracking/event/EventsLabel;", "eventType", "streamUrl", "deviceInfo", "", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoDto;", "puid", "slots", "testIds", "", "videoContentId", "adContentId", "isAd", "", "additionalParameters", "Lru/yandex/video/m3/data/AdditionalParameters;", Constants.KEY_DATA, "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "eventIndex", "drm", "vpuid", "sourceIndex", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLru/yandex/video/m3/player/impl/tracking/event/EventsLabel;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAdContentId", "()Ljava/lang/String;", "getAdditionalParameters", "()Ljava/util/Map;", "getData", "()Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "getDeviceInfo", "documentIsVisible", "getDocumentIsVisible", "()Z", "getDrm", "getEventIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEventName", "getEventType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLabels", "()Lru/yandex/video/m3/player/impl/tracking/event/EventsLabel;", "logVersion", "getLogVersion", "getPlayerIndex", "()I", "getPuid", "getService", "getSlots", "getSourceIndex", "getStreamUrl", "getTestIds", "()Ljava/util/List;", "getTimestamp", "()J", "version", "getVersion", "getVideoContentId", "getVpuid", "getVsid", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class EventDefault {
    public static final int $stable = 8;
    private final String adContentId;
    private final Map<String, Object> additionalParameters;
    private final DefaultEventData data;

    @ysq0("device")
    private final Map<String, Object> deviceInfo;
    private final String drm;
    private final Integer eventIndex;
    private final String eventName;
    private final String eventType;
    private final Boolean isAd;
    private final EventsLabel labels;
    private final int playerIndex;
    private final String puid;
    private final String service;
    private final String slots;
    private final Integer sourceIndex;
    private final String streamUrl;
    private final List<Integer> testIds;
    private final long timestamp;
    private final String videoContentId;
    private final String vpuid;
    private final String vsid;
    private final String version = "3071";
    private final String logVersion = "1.3.0";
    private final boolean documentIsVisible = true;

    public EventDefault(String str, String str2, int i, String str3, long j, EventsLabel eventsLabel, String str4, String str5, Map<String, ? extends Object> map, String str6, String str7, List<Integer> list, String str8, String str9, Boolean bool, Map<String, ? extends Object> map2, DefaultEventData defaultEventData, Integer num, String str10, String str11, Integer num2) {
        this.service = str;
        this.vsid = str2;
        this.playerIndex = i;
        this.eventName = str3;
        this.timestamp = j;
        this.labels = eventsLabel;
        this.eventType = str4;
        this.streamUrl = str5;
        this.deviceInfo = map;
        this.puid = str6;
        this.slots = str7;
        this.testIds = list;
        this.videoContentId = str8;
        this.adContentId = str9;
        this.isAd = bool;
        this.additionalParameters = map2;
        this.data = defaultEventData;
        this.eventIndex = num;
        this.drm = str10;
        this.vpuid = str11;
        this.sourceIndex = num2;
    }

    public final String getAdContentId() {
        return this.adContentId;
    }

    public final Map<String, Object> getAdditionalParameters() {
        return this.additionalParameters;
    }

    public final DefaultEventData getData() {
        return this.data;
    }

    public final Map<String, Object> getDeviceInfo() {
        return this.deviceInfo;
    }

    public final boolean getDocumentIsVisible() {
        return this.documentIsVisible;
    }

    public final String getDrm() {
        return this.drm;
    }

    public final Integer getEventIndex() {
        return this.eventIndex;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final EventsLabel getLabels() {
        return this.labels;
    }

    public final String getLogVersion() {
        return this.logVersion;
    }

    public final int getPlayerIndex() {
        return this.playerIndex;
    }

    public final String getPuid() {
        return this.puid;
    }

    public final String getService() {
        return this.service;
    }

    public final String getSlots() {
        return this.slots;
    }

    public final Integer getSourceIndex() {
        return this.sourceIndex;
    }

    public final String getStreamUrl() {
        return this.streamUrl;
    }

    public final List<Integer> getTestIds() {
        return this.testIds;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getVideoContentId() {
        return this.videoContentId;
    }

    public final String getVpuid() {
        return this.vpuid;
    }

    public final String getVsid() {
        return this.vsid;
    }

    /* renamed from: isAd, reason: from getter */
    public final Boolean getIsAd() {
        return this.isAd;
    }
}
