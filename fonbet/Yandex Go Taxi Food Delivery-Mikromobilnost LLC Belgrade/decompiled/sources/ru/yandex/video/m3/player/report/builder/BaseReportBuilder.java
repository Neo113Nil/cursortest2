package ru.yandex.video.m3.player.report.builder;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfo;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoDtoKt;
import ru.yandex.video.m3.player.report.DebugReport;
import ru.yandex.video.m3.player.report.DebugReportReason;
import ru.yandex.video.m3.player.report.aggregator.LatestRecordsAggregator;
import ru.yandex.video.m3.player.report.aggregator.RecordAggregator;
import ru.yandex.video.m3.player.report.dto.Record;
import ru.yandex.video.m3.player.report.logger.RecordLogger;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H ¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\b\u001a\u00020\u0007H ¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H ¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH ¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010'\u001a\u00020\t2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\"0!j\u0002`#H ¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\"H&¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0016H&¢\u0006\u0004\b,\u0010-J\u0015\u0010'\u001a\u00020\t2\u0006\u0010$\u001a\u00020.¢\u0006\u0004\b'\u0010/J\u001d\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u000200¢\u0006\u0004\b \u00102¨\u00063"}, d2 = {"Lru/yandex/video/m3/player/report/builder/BaseReportBuilder;", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "<init>", "()V", "", "tag", Constants.KEY_MESSAGE, "", ClidProvider.TIMESTAMP, "Lzy11;", "addAssert$video_player_internalRelease", "(Ljava/lang/String;Ljava/lang/String;J)V", "addAssert", "region", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "addError$video_player_internalRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;J)V", "addError", "Lru/yandex/video/m3/player/report/DebugReportReason;", "trigger", "Lru/yandex/video/m3/player/report/DebugReport;", "getDebugReportIfNecessary$video_player_internalRelease", "(Lru/yandex/video/m3/player/report/DebugReportReason;)Lru/yandex/video/m3/player/report/DebugReport;", "getDebugReportIfNecessary", "Lru/yandex/video/m3/player/report/aggregator/RecordAggregator;", "Lru/yandex/video/m3/player/report/dto/Record$Log;", "aggregator", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "registerLogger$video_player_internalRelease", "(Ljava/lang/String;Lru/yandex/video/m3/player/report/aggregator/RecordAggregator;)Lru/yandex/video/m3/player/report/logger/RecordLogger;", "registerLogger", "", "", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoDto;", "deviceInfo", "setDeviceInfo$video_player_internalRelease", "(Ljava/util/Map;)V", "setDeviceInfo", "key", "value", "addExperimentalFlag", "(Ljava/lang/String;Ljava/lang/Object;)V", "getDebugReport", "()Lru/yandex/video/m3/player/report/DebugReport;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;)V", "", "retainedRecords", "(Ljava/lang/String;I)Lru/yandex/video/m3/player/report/logger/RecordLogger;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseReportBuilder implements ReportBuilder {
    public static final int $stable = 0;

    public abstract void addAssert$video_player_internalRelease(String tag, String message, long timestamp);

    public abstract void addError$video_player_internalRelease(String tag, String region, Exception error, long timestamp);

    @Override // ru.yandex.video.m3.player.report.builder.ReportBuilder
    public abstract void addExperimentalFlag(String key, Object value);

    @Override // ru.yandex.video.m3.player.report.builder.ReportBuilder
    public abstract DebugReport getDebugReport();

    public abstract DebugReport getDebugReportIfNecessary$video_player_internalRelease(DebugReportReason trigger);

    @Override // ru.yandex.video.m3.player.report.builder.ReportBuilder
    public final RecordLogger registerLogger(String tag, int retainedRecords) {
        return registerLogger$video_player_internalRelease(tag, new LatestRecordsAggregator(retainedRecords));
    }

    public abstract RecordLogger registerLogger$video_player_internalRelease(String tag, RecordAggregator<Record.Log> aggregator);

    @Override // ru.yandex.video.m3.player.report.builder.ReportBuilder
    public final void setDeviceInfo(DeviceInfo deviceInfo) {
        setDeviceInfo$video_player_internalRelease(DeviceInfoDtoKt.toDeviceInfoDto(deviceInfo));
    }

    public abstract void setDeviceInfo$video_player_internalRelease(Map<String, ? extends Object> deviceInfo);
}
