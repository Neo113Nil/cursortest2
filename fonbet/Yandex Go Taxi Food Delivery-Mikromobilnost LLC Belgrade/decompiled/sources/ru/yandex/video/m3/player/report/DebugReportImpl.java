package ru.yandex.video.m3.player.report;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001By\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n\u0012\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\rR\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR'\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R'\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/report/DebugReportImpl;", "Lru/yandex/video/m3/player/report/DebugReport;", "asserts", "", "", "Lru/yandex/video/m3/player/report/format/FormattedRecord;", "logs", "", "deviceInfo", "", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoDto;", "errors", "experimentalFlags", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)V", "getAsserts", "()Ljava/util/List;", "getDeviceInfo", "()Ljava/util/Map;", "getErrors", "getExperimentalFlags", "getLogs", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugReportImpl implements DebugReport {
    public static final int $stable = 8;
    private final List<String> asserts;
    private final Map<String, Object> deviceInfo;
    private final List<String> errors;
    private final Map<String, Object> experimentalFlags;
    private final Map<String, List<String>> logs;

    /* JADX WARN: Multi-variable type inference failed */
    public DebugReportImpl(List<String> list, Map<String, ? extends List<String>> map, Map<String, ? extends Object> map2, List<String> list2, Map<String, ? extends Object> map3) {
        this.asserts = list;
        this.logs = map;
        this.deviceInfo = map2;
        this.errors = list2;
        this.experimentalFlags = map3;
    }

    public final List<String> getAsserts() {
        return this.asserts;
    }

    public final Map<String, Object> getDeviceInfo() {
        return this.deviceInfo;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final Map<String, Object> getExperimentalFlags() {
        return this.experimentalFlags;
    }

    public final Map<String, List<String>> getLogs() {
        return this.logs;
    }
}
