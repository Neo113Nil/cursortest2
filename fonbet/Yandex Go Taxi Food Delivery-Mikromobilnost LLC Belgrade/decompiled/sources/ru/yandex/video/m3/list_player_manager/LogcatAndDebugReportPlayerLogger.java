package ru.yandex.video.m3.list_player_manager;

import android.util.Log;
import defpackage.i3y;
import defpackage.sls;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.video.m3.player.report.builder.ReportBuilder;
import ru.yandex.video.m3.player.report.logger.RecordLogger;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u000b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u000b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJM\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u000b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/list_player_manager/LogcatAndDebugReportPlayerLogger;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "reportBuilder", "<init>", "(Lru/yandex/video/m3/player/report/builder/ReportBuilder;)V", "", "tag", "method", "", Constants.KEY_MESSAGE, "", "values", "Lzy11;", "verbose", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "info", "", "throwable", "error", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "logger$delegate", "Li3y;", "getLogger", "()Lru/yandex/video/m3/player/report/logger/RecordLogger;", "logger", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogcatAndDebugReportPlayerLogger implements PlayerLogger {
    public static final int $stable = 8;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    private final i3y logger = a.a(new sls() { // from class: ru.yandex.video.m3.list_player_manager.LogcatAndDebugReportPlayerLogger$logger$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final RecordLogger invoke() {
            ReportBuilder reportBuilder;
            reportBuilder = LogcatAndDebugReportPlayerLogger.this.reportBuilder;
            return reportBuilder.registerLogger("LPM", 250);
        }
    });
    private final ReportBuilder reportBuilder;

    public LogcatAndDebugReportPlayerLogger(ReportBuilder reportBuilder) {
        this.reportBuilder = reportBuilder;
    }

    @Override // ru.yandex.video.m3.player.utils.PlayerLogger
    public void error(final String tag, final String method, final Object message, Throwable throwable, Object... values) {
        RecordLogger.log$default(getLogger(), 0L, new sls() { // from class: ru.yandex.video.m3.list_player_manager.LogcatAndDebugReportPlayerLogger$error$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                return "[" + tag + "][" + method + "] " + message;
            }
        }, 1, null);
        RecordLogger.error$default(getLogger(), tag, new RuntimeException(String.valueOf(message), throwable), 0L, 4, null);
        Log.e(tag, "[" + method + "] " + message, throwable);
    }

    public final RecordLogger getLogger() {
        return (RecordLogger) this.logger.getValue();
    }

    @Override // ru.yandex.video.m3.player.utils.PlayerLogger
    public void info(final String tag, final String method, final Object message, Object... values) {
        RecordLogger.log$default(getLogger(), 0L, new sls() { // from class: ru.yandex.video.m3.list_player_manager.LogcatAndDebugReportPlayerLogger$info$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                return "[" + tag + "][" + method + "] " + message;
            }
        }, 1, null);
        Log.i(tag, "[" + method + "] " + message);
    }

    @Override // ru.yandex.video.m3.player.utils.PlayerLogger
    public void verbose(final String tag, final String method, final Object message, Object... values) {
        RecordLogger.log$default(getLogger(), 0L, new sls() { // from class: ru.yandex.video.m3.list_player_manager.LogcatAndDebugReportPlayerLogger$verbose$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                return "[" + tag + "][" + method + "] " + message;
            }
        }, 1, null);
        Objects.toString(message);
    }
}
