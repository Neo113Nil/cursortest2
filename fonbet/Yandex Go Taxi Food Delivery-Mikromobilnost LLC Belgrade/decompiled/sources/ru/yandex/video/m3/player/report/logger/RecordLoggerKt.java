package ru.yandex.video.m3.player.report.logger;

import defpackage.sls;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"T", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "", "tag", "Lkotlin/Function0;", "body", "profile", "(Lru/yandex/video/m3/player/report/logger/RecordLogger;Ljava/lang/String;Lsls;)Ljava/lang/Object;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RecordLoggerKt {
    public static final <T> T profile(RecordLogger recordLogger, String str, sls slsVar) {
        RecordLogger recordLogger2;
        String str2;
        long j;
        if (!recordLogger.isLoggerEnabled()) {
            return (T) slsVar.invoke();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long nanoTime = System.nanoTime();
        String str3 = null;
        try {
            T t = (T) slsVar.invoke();
            long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
            recordLogger.span(str, currentTimeMillis, Math.max(System.currentTimeMillis(), currentTimeMillis + nanoTime2), nanoTime2, null);
            return t;
        } catch (Exception e) {
            recordLogger2 = recordLogger;
            str2 = str;
            j = nanoTime;
            try {
                str3 = e.getClass().getName() + Extension.COLON_SPACE + e.getMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                long nanoTime3 = (System.nanoTime() - j) / 1000000;
                recordLogger2.span(str2, currentTimeMillis, Math.max(System.currentTimeMillis(), currentTimeMillis + nanoTime3), nanoTime3, str3);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            recordLogger2 = recordLogger;
            str2 = str;
            j = nanoTime;
            Throwable th22 = th;
            long nanoTime32 = (System.nanoTime() - j) / 1000000;
            recordLogger2.span(str2, currentTimeMillis, Math.max(System.currentTimeMillis(), currentTimeMillis + nanoTime32), nanoTime32, str3);
            throw th22;
        }
    }
}
