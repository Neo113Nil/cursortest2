package ru.yandex.video.m3.telemetry.datasource.impl;

import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.utils.AppInfo;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u001b\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000eHÆ\u0003Jg\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R#\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006("}, d2 = {"Lru/yandex/video/m3/telemetry/datasource/impl/LoggingInfoHolder;", "", "sessionId", "", "vpuid", Constants.KEY_SERVICE, "testIds", "", "", "from", "appInfo", "Lru/yandex/video/m3/player/impl/utils/AppInfo;", "deviceInfo", "", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/yandex/video/m3/player/impl/utils/AppInfo;Ljava/util/Map;)V", "getAppInfo", "()Lru/yandex/video/m3/player/impl/utils/AppInfo;", "getDeviceInfo", "()Ljava/util/Map;", "getFrom", "()Ljava/lang/String;", "getService", "getSessionId", "getTestIds", "()Ljava/util/List;", "getVpuid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LoggingInfoHolder {
    public static final int $stable = 8;
    private final AppInfo appInfo;
    private final Map<String, Object> deviceInfo;
    private final String from;
    private final String service;
    private final String sessionId;
    private final List<Integer> testIds;
    private final String vpuid;

    public LoggingInfoHolder(String str, String str2, String str3, List<Integer> list, String str4, AppInfo appInfo, Map<String, ? extends Object> map) {
        this.sessionId = str;
        this.vpuid = str2;
        this.service = str3;
        this.testIds = list;
        this.from = str4;
        this.appInfo = appInfo;
        this.deviceInfo = map;
    }

    public static /* synthetic */ LoggingInfoHolder copy$default(LoggingInfoHolder loggingInfoHolder, String str, String str2, String str3, List list, String str4, AppInfo appInfo, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loggingInfoHolder.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = loggingInfoHolder.vpuid;
        }
        if ((i & 4) != 0) {
            str3 = loggingInfoHolder.service;
        }
        if ((i & 8) != 0) {
            list = loggingInfoHolder.testIds;
        }
        if ((i & 16) != 0) {
            str4 = loggingInfoHolder.from;
        }
        if ((i & 32) != 0) {
            appInfo = loggingInfoHolder.appInfo;
        }
        if ((i & 64) != 0) {
            map = loggingInfoHolder.deviceInfo;
        }
        AppInfo appInfo2 = appInfo;
        Map map2 = map;
        String str5 = str4;
        String str6 = str3;
        return loggingInfoHolder.copy(str, str2, str6, list, str5, appInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVpuid() {
        return this.vpuid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getService() {
        return this.service;
    }

    public final List<Integer> component4() {
        return this.testIds;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* renamed from: component6, reason: from getter */
    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final Map<String, Object> component7() {
        return this.deviceInfo;
    }

    public final LoggingInfoHolder copy(String sessionId, String vpuid, String service, List<Integer> testIds, String from, AppInfo appInfo, Map<String, ? extends Object> deviceInfo) {
        return new LoggingInfoHolder(sessionId, vpuid, service, testIds, from, appInfo, deviceInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoggingInfoHolder)) {
            return false;
        }
        LoggingInfoHolder loggingInfoHolder = (LoggingInfoHolder) other;
        return jl40.l(this.sessionId, loggingInfoHolder.sessionId) && jl40.l(this.vpuid, loggingInfoHolder.vpuid) && jl40.l(this.service, loggingInfoHolder.service) && jl40.l(this.testIds, loggingInfoHolder.testIds) && jl40.l(this.from, loggingInfoHolder.from) && jl40.l(this.appInfo, loggingInfoHolder.appInfo) && jl40.l(this.deviceInfo, loggingInfoHolder.deviceInfo);
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final Map<String, Object> getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getService() {
        return this.service;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<Integer> getTestIds() {
        return this.testIds;
    }

    public final String getVpuid() {
        return this.vpuid;
    }

    public int hashCode() {
        return this.deviceInfo.hashCode() + ((this.appInfo.hashCode() + unr0.b(unr0.c(unr0.b(unr0.b(this.sessionId.hashCode() * 31, 31, this.vpuid), 31, this.service), 31, this.testIds), 31, this.from)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoggingInfoHolder(sessionId=");
        sb.append(this.sessionId);
        sb.append(", vpuid=");
        sb.append(this.vpuid);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", testIds=");
        sb.append(this.testIds);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", appInfo=");
        sb.append(this.appInfo);
        sb.append(", deviceInfo=");
        return smw0.n(sb, this.deviceInfo, ')');
    }
}
