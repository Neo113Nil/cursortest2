package ru.yandex.video.m3.player.report.logger;

import defpackage.sls;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.report.aggregator.RecordAggregator;
import ru.yandex.video.m3.player.report.builder.BaseReportBuilder;
import ru.yandex.video.m3.player.report.dto.Record;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b \u0010!J9\u0010&\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/yandex/video/m3/player/report/logger/RecordLoggerImpl;", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "", "loggerTag", "Lru/yandex/video/m3/player/report/aggregator/RecordAggregator;", "Lru/yandex/video/m3/player/report/dto/Record$Log;", "aggregator", "Lru/yandex/video/m3/player/report/builder/BaseReportBuilder;", "builder", "<init>", "(Ljava/lang/String;Lru/yandex/video/m3/player/report/aggregator/RecordAggregator;Lru/yandex/video/m3/player/report/builder/BaseReportBuilder;)V", "", "isLoggerEnabled", "()Z", "value", "Lzy11;", "setLoggerEnabled", "(Z)V", "condition", "", ClidProvider.TIMESTAMP, "Lkotlin/Function0;", Constants.KEY_MESSAGE, "assert", "(ZJLsls;)V", "region", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "error", "(Ljava/lang/String;Ljava/lang/Exception;J)V", "timestampMs", "log", "(JLsls;)V", "startMs", "endMs", "durationMs", "interruptionReason", "span", "(Ljava/lang/String;JJJLjava/lang/String;)V", "Ljava/lang/String;", "Lru/yandex/video/m3/player/report/aggregator/RecordAggregator;", "Lru/yandex/video/m3/player/report/builder/BaseReportBuilder;", "isEnabled", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RecordLoggerImpl implements RecordLogger {
    public static final int $stable = 8;
    private final RecordAggregator<Record.Log> aggregator;
    private final BaseReportBuilder builder;
    private volatile boolean isEnabled = true;
    private final String loggerTag;

    public RecordLoggerImpl(String str, RecordAggregator<Record.Log> recordAggregator, BaseReportBuilder baseReportBuilder) {
        this.loggerTag = str;
        this.aggregator = recordAggregator;
        this.builder = baseReportBuilder;
    }

    @Override // ru.yandex.video.m3.player.report.logger.RecordLogger
    /* renamed from: assert */
    public void mo812assert(boolean condition, long timestamp, sls message) {
        if (condition || !getIsEnabled()) {
            return;
        }
        this.builder.addAssert$video_player_internalRelease(this.loggerTag, (String) message.invoke(), timestamp);
    }

    @Override // ru.yandex.video.m3.player.report.logger.RecordLogger
    public void error(String region, Exception e, long timestamp) {
        if (getIsEnabled()) {
            this.builder.addError$video_player_internalRelease(this.loggerTag, region, e, timestamp);
        }
    }

    @Override // ru.yandex.video.m3.player.report.logger.RecordLogger
    /* renamed from: isLoggerEnabled, reason: from getter */
    public boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Override // ru.yandex.video.m3.player.report.logger.RecordLogger
    public void log(long timestampMs, sls message) {
        if (getIsEnabled()) {
            this.aggregator.add(new Record.BasicLog((String) message.invoke(), timestampMs));
        }
    }

    public final void setLoggerEnabled(boolean value) {
        this.isEnabled = value;
    }

    @Override // ru.yandex.video.m3.player.report.logger.RecordLogger
    public void span(String region, long startMs, long endMs, long durationMs, String interruptionReason) {
        if (getIsEnabled()) {
            this.aggregator.add(new Record.SpanLog(region, startMs, endMs, durationMs, interruptionReason));
        }
    }
}
