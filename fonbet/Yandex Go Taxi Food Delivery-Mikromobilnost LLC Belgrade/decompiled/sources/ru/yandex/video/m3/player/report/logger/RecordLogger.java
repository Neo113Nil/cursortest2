package ru.yandex.video.m3.player.report.logger;

import defpackage.sls;
import defpackage.w511;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0019\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/report/logger/RecordLogger;", "", "", "condition", "", ClidProvider.TIMESTAMP, "Lkotlin/Function0;", "", Constants.KEY_MESSAGE, "Lzy11;", "assert", "(ZJLsls;)V", "region", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "error", "(Ljava/lang/String;Ljava/lang/Exception;J)V", "timestampMs", "log", "(JLsls;)V", "startMs", "endMs", "durationMs", "interruptionReason", "span", "(Ljava/lang/String;JJJLjava/lang/String;)V", "isLoggerEnabled", "()Z", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RecordLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final boolean LOGGING_ENABLED = true;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/report/logger/RecordLogger$Companion;", "", "()V", "LOGGING_ENABLED", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final boolean LOGGING_ENABLED = true;

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void assert$default(RecordLogger recordLogger, boolean z, long j, sls slsVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: assert");
            return;
        }
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        recordLogger.mo812assert(z, j, slsVar);
    }

    static /* synthetic */ void error$default(RecordLogger recordLogger, String str, Exception exc, long j, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: error");
            return;
        }
        if ((i & 4) != 0) {
            j = System.currentTimeMillis();
        }
        recordLogger.error(str, exc, j);
    }

    static /* synthetic */ void log$default(RecordLogger recordLogger, long j, sls slsVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: log");
            return;
        }
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        recordLogger.log(j, slsVar);
    }

    static /* synthetic */ void span$default(RecordLogger recordLogger, String str, long j, long j2, long j3, String str2, int i, Object obj) {
        if (obj == null) {
            recordLogger.span(str, j, j2, j3, (i & 16) != 0 ? null : str2);
        } else {
            w511.x("Super calls with default arguments not supported in this target, function: span");
        }
    }

    /* renamed from: assert */
    void mo812assert(boolean condition, long timestamp, sls message);

    void error(String region, Exception e, long timestamp);

    boolean isLoggerEnabled();

    void log(long timestampMs, sls message);

    void span(String region, long startMs, long endMs, long durationMs, String interruptionReason);
}
