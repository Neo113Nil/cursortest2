package com.lyft.kronos.internal;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.fillr.e;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.zxing.BinaryBitmap;
import com.lyft.kronos.KronosTime;
import com.lyft.kronos.internal.ntp.SntpClient;
import com.lyft.kronos.internal.ntp.SntpServiceImpl;

/* loaded from: classes4.dex */
public final class KronosClockImpl {
    public final SntpServiceImpl ntpService;

    public KronosClockImpl(SntpServiceImpl sntpServiceImpl, e eVar) {
        this.ntpService = sntpServiceImpl;
    }

    public final long getCurrentTimeMs() {
        KronosTime kronosTime;
        SntpServiceImpl sntpServiceImpl = this.ntpService;
        sntpServiceImpl.ensureServiceIsRunning();
        BinaryBitmap binaryBitmap = sntpServiceImpl.responseCache;
        zzr zzrVar = (zzr) binaryBitmap.binarizer;
        long j = ((SharedPreferences) zzrVar.zza).getLong("com.lyft.kronos.cached_current_time", 0L);
        long j2 = ((SharedPreferences) zzrVar.zza).getLong("com.lyft.kronos.cached_elapsed_time", 0L);
        SntpClient.Response response = j2 == 0 ? null : new SntpClient.Response(j, j2, ((SharedPreferences) zzrVar.zza).getLong("com.lyft.kronos.cached_offset", 0L), (e) binaryBitmap.matrix);
        if (((SntpServiceImpl.State) sntpServiceImpl.state.get()) == SntpServiceImpl.State.IDLE && response != null && Math.abs((response.deviceCurrentTimestampMs - response.deviceElapsedTimestampMs) - (System.currentTimeMillis() - SystemClock.elapsedRealtime())) >= 1000) {
            BinaryBitmap binaryBitmap2 = sntpServiceImpl.responseCache;
            synchronized (binaryBitmap2) {
                ((SharedPreferences) ((zzr) binaryBitmap2.binarizer).zza).edit().clear().apply();
            }
            response = null;
        }
        if (response == null) {
            if (SystemClock.elapsedRealtime() - sntpServiceImpl.cachedSyncTime.get() >= sntpServiceImpl.minWaitTimeBetweenSyncMs) {
                sntpServiceImpl.syncInBackground();
            }
            kronosTime = null;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime() - response.deviceElapsedTimestampMs;
            if (elapsedRealtime >= sntpServiceImpl.cacheExpirationMs && SystemClock.elapsedRealtime() - sntpServiceImpl.cachedSyncTime.get() >= sntpServiceImpl.minWaitTimeBetweenSyncMs) {
                sntpServiceImpl.syncInBackground();
            }
            kronosTime = new KronosTime((SystemClock.elapsedRealtime() - response.deviceElapsedTimestampMs) + response.deviceCurrentTimestampMs + response.offsetMs, Long.valueOf(elapsedRealtime));
        }
        if (kronosTime == null) {
            kronosTime = new KronosTime(System.currentTimeMillis(), null);
        }
        return kronosTime.posixTimeMs;
    }
}
