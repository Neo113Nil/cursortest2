package ru.yandex.video.m3.player.report.builder;

import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfo;
import ru.yandex.video.m3.player.report.DebugReport;
import ru.yandex.video.m3.player.report.logger.RecordLogger;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "", "", "key", "value", "Lzy11;", "addExperimentalFlag", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lru/yandex/video/m3/player/report/DebugReport;", "getDebugReport", "()Lru/yandex/video/m3/player/report/DebugReport;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "deviceInfo", "setDeviceInfo", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;)V", "tag", "", "retainedRecords", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "registerLogger", "(Ljava/lang/String;I)Lru/yandex/video/m3/player/report/logger/RecordLogger;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReportBuilder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/report/builder/ReportBuilder$Companion;", "", "()V", "DEFAULT_RETAINED_LOGS", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DEFAULT_RETAINED_LOGS = 50;

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ RecordLogger registerLogger$default(ReportBuilder reportBuilder, String str, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: registerLogger");
            return null;
        }
        if ((i2 & 2) != 0) {
            i = 50;
        }
        return reportBuilder.registerLogger(str, i);
    }

    void addExperimentalFlag(String key, Object value);

    DebugReport getDebugReport();

    RecordLogger registerLogger(String tag, int retainedRecords);

    void setDeviceInfo(DeviceInfo deviceInfo);
}
