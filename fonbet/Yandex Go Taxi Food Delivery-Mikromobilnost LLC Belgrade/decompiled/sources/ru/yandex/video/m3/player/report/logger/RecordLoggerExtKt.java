package ru.yandex.video.m3.player.report.logger;

import kotlin.Metadata;
import ru.yandex.video.m3.player.report.logger.RecordLogger;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0004"}, d2 = {"createNoOp", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "Lru/yandex/video/m3/player/report/logger/RecordLogger$Companion;", "orNoOp", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RecordLoggerExtKt {
    public static final RecordLogger createNoOp(RecordLogger.Companion companion) {
        return NoOpRecordLogger.INSTANCE;
    }

    public static final RecordLogger orNoOp(RecordLogger recordLogger) {
        return recordLogger == null ? NoOpRecordLogger.INSTANCE : recordLogger;
    }
}
