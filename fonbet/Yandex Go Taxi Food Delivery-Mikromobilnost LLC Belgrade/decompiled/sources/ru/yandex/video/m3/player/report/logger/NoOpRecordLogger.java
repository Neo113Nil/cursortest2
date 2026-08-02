package ru.yandex.video.m3.player.report.logger;

import defpackage.sls;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/report/logger/NoOpRecordLogger;", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "<init>", "()V", "", "condition", "", ClidProvider.TIMESTAMP, "Lkotlin/Function0;", "", Constants.KEY_MESSAGE, "Lzy11;", "assert", "(ZJLsls;)V", "region", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "error", "(Ljava/lang/String;Ljava/lang/Exception;J)V", "timestampMs", "log", "(JLsls;)V", "startMs", "endMs", "durationMs", "interruptionReason", "span", "(Ljava/lang/String;JJJLjava/lang/String;)V", "isLoggerEnabled", "()Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpRecordLogger implements RecordLogger {
    public static final int $stable = 0;
    public static final NoOpRecordLogger INSTANCE = new NoOpRecordLogger();

    private NoOpRecordLogger() {
    }

    @Override // ru.yandex.video.m3.player.report.logger.RecordLogger
    /* renamed from: assert, reason: not valid java name */
    public void mo812assert(boolean condition, long timestamp, sls message) {
    }

    @Override // ru.yandex.video.m3.player.report.logger.RecordLogger
    public void error(String region, Exception e, long timestamp) {
    }

    @Override // ru.yandex.video.m3.player.report.logger.RecordLogger
    public boolean isLoggerEnabled() {
        return false;
    }

    @Override // ru.yandex.video.m3.player.report.logger.RecordLogger
    public void log(long timestampMs, sls message) {
    }

    @Override // ru.yandex.video.m3.player.report.logger.RecordLogger
    public void span(String region, long startMs, long endMs, long durationMs, String interruptionReason) {
    }
}
