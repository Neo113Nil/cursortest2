package ru.yandex.video.m3.player.report.builder;

import defpackage.jxi;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.player.report.DebugReport;
import ru.yandex.video.m3.player.report.DebugReportReason;
import ru.yandex.video.m3.player.report.builder.ReportBuilder;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0002`\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/report/builder/ReportBuilder$Companion;", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "create", "(Lru/yandex/video/m3/player/report/builder/ReportBuilder$Companion;)Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "", "", "", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoDto;", "deviceInfo", "Lzy11;", "setDeviceInfo", "(Lru/yandex/video/m3/player/report/builder/ReportBuilder;Ljava/util/Map;)Lzy11;", "Lru/yandex/video/m3/player/report/DebugReportReason;", "trigger", "Lru/yandex/video/m3/player/report/DebugReport;", "getDebugReportIfNecessary", "(Lru/yandex/video/m3/player/report/builder/ReportBuilder;Lru/yandex/video/m3/player/report/DebugReportReason;)Lru/yandex/video/m3/player/report/DebugReport;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReportBuilderExtKt {
    public static final ReportBuilder create(ReportBuilder.Companion companion) {
        return new ReportBuilderImpl();
    }

    @jxi
    public static final DebugReport getDebugReportIfNecessary(ReportBuilder reportBuilder, DebugReportReason debugReportReason) {
        BaseReportBuilder baseReportBuilder = reportBuilder instanceof BaseReportBuilder ? (BaseReportBuilder) reportBuilder : null;
        if (baseReportBuilder != null) {
            return baseReportBuilder.getDebugReportIfNecessary$video_player_internalRelease(debugReportReason);
        }
        return null;
    }

    @jxi
    public static final zy11 setDeviceInfo(ReportBuilder reportBuilder, Map<String, ? extends Object> map) {
        BaseReportBuilder baseReportBuilder = reportBuilder instanceof BaseReportBuilder ? (BaseReportBuilder) reportBuilder : null;
        if (baseReportBuilder == null) {
            return null;
        }
        baseReportBuilder.setDeviceInfo$video_player_internalRelease(map);
        return zy11.a;
    }
}
