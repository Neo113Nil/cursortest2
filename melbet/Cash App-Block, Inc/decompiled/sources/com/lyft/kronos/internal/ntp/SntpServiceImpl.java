package com.lyft.kronos.internal.ntp;

import android.os.SystemClock;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.fillr.e;
import com.fillr.n;
import com.google.zxing.BinaryBitmap;
import com.lyft.kronos.internal.ntp.SntpClient;
import com.lyft.kronos.internal.ntp.SntpServiceImpl;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class SntpServiceImpl {
    public final long cacheExpirationMs;
    public final long maxNtpResponseTimeMs;
    public final long minWaitTimeBetweenSyncMs;
    public final List ntpHosts;
    public final n.b ntpSyncListener;
    public final long requestTimeoutMs;
    public final BinaryBitmap responseCache;
    public final SntpClient sntpClient;
    public final AtomicReference state = new AtomicReference(State.IDLE);
    public final AtomicLong cachedSyncTime = new AtomicLong(0);
    public final ExecutorService executor = Executors.newSingleThreadExecutor(SntpServiceImpl$executor$1.INSTANCE);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State IDLE;
        public static final State STOPPED;
        public static final State SYNCING;

        static {
            State state = new State("IDLE", 0);
            IDLE = state;
            State state2 = new State("SYNCING", 1);
            SYNCING = state2;
            State state3 = new State("STOPPED", 2);
            STOPPED = state3;
            $VALUES = new State[]{state, state2, state3};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public SntpServiceImpl(SntpClient sntpClient, e eVar, BinaryBitmap binaryBitmap, n.b bVar, List list, long j, long j2, long j3, long j4) {
        this.sntpClient = sntpClient;
        this.responseCache = binaryBitmap;
        this.ntpSyncListener = bVar;
        this.ntpHosts = list;
        this.requestTimeoutMs = j;
        this.minWaitTimeBetweenSyncMs = j2;
        this.cacheExpirationMs = j3;
        this.maxNtpResponseTimeMs = j4;
    }

    public final void ensureServiceIsRunning() {
        if (((State) this.state.get()) != State.STOPPED) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Service already shutdown");
    }

    public final void syncInBackground() {
        ensureServiceIsRunning();
        if (((State) this.state.get()) != State.SYNCING) {
            this.executor.submit(new Runnable() { // from class: com.lyft.kronos.internal.ntp.SntpServiceImpl$syncInBackground$1
                @Override // java.lang.Runnable
                public final void run() {
                    SntpServiceImpl sntpServiceImpl;
                    Iterator it;
                    Throwable th;
                    SntpServiceImpl sntpServiceImpl2 = SntpServiceImpl.this;
                    sntpServiceImpl2.ensureServiceIsRunning();
                    Iterator it2 = sntpServiceImpl2.ntpHosts.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        long j = sntpServiceImpl2.maxNtpResponseTimeMs;
                        n.b bVar = sntpServiceImpl2.ntpSyncListener;
                        AtomicLong atomicLong = sntpServiceImpl2.cachedSyncTime;
                        SntpServiceImpl.State state = SntpServiceImpl.State.IDLE;
                        AtomicReference atomicReference = sntpServiceImpl2.state;
                        SntpServiceImpl.State state2 = SntpServiceImpl.State.SYNCING;
                        if (((SntpServiceImpl.State) atomicReference.getAndSet(state2)) != state2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            str.getClass();
                            try {
                                SntpClient.Response requestTime = sntpServiceImpl2.sntpClient.requestTime(Long.valueOf(sntpServiceImpl2.requestTimeoutMs), str);
                                if ((SystemClock.elapsedRealtime() - requestTime.deviceElapsedTimestampMs) + requestTime.deviceCurrentTimestampMs + requestTime.offsetMs >= 0) {
                                    try {
                                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        if (elapsedRealtime2 <= j) {
                                            sntpServiceImpl2.responseCache.update(requestTime);
                                            return;
                                        }
                                        throw new NTPSyncException("Ignoring response from " + str + " because the network latency (" + elapsedRealtime2 + " ms) is longer than the required value (" + j + " ms");
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sntpServiceImpl = sntpServiceImpl2;
                                        it = it2;
                                        try {
                                            str.getClass();
                                            DBUtil.log$default((InternalLogger) bVar.b, 5, InternalLogger.Target.MAINTAINER, new DatadogInterceptor$intercept$1(str, 11), th, false, 48);
                                            it2 = it;
                                            sntpServiceImpl2 = sntpServiceImpl;
                                        } finally {
                                            atomicReference.set(state);
                                            atomicLong.set(SystemClock.elapsedRealtime());
                                        }
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder("Invalid time ");
                                    sntpServiceImpl = sntpServiceImpl2;
                                    it = it2;
                                    try {
                                        sb.append((SystemClock.elapsedRealtime() - requestTime.deviceElapsedTimestampMs) + requestTime.deviceCurrentTimestampMs + requestTime.offsetMs);
                                        sb.append(" received from ");
                                        sb.append(str);
                                        throw new NTPSyncException(sb.toString());
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th = th;
                                        str.getClass();
                                        DBUtil.log$default((InternalLogger) bVar.b, 5, InternalLogger.Target.MAINTAINER, new DatadogInterceptor$intercept$1(str, 11), th, false, 48);
                                        it2 = it;
                                        sntpServiceImpl2 = sntpServiceImpl;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sntpServiceImpl = sntpServiceImpl2;
                                it = it2;
                            }
                        } else {
                            sntpServiceImpl = sntpServiceImpl2;
                            it = it2;
                        }
                        it2 = it;
                        sntpServiceImpl2 = sntpServiceImpl;
                    }
                }
            });
        }
    }
}
