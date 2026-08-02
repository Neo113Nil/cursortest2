package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellInfo;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeOffsetProvider;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class V implements InterfaceC0998x {
    public final SystemTimeOffsetProvider a;

    public V() {
        this(new SystemTimeOffsetProvider());
    }

    public final void a(CellInfo cellInfo, C0963l c0963l) {
        long timeStamp = cellInfo.getTimeStamp();
        Long l = null;
        if (timeStamp > 0) {
            SystemTimeOffsetProvider systemTimeOffsetProvider = this.a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long systemNanoTimeOffsetInSeconds = systemTimeOffsetProvider.systemNanoTimeOffsetInSeconds(timeStamp, timeUnit);
            if (systemNanoTimeOffsetInSeconds > 0 && systemNanoTimeOffsetInSeconds < 3600) {
                l = Long.valueOf(systemNanoTimeOffsetInSeconds);
            }
            if (l == null) {
                long elapsedRealtimeOffsetInSeconds = this.a.elapsedRealtimeOffsetInSeconds(timeStamp, timeUnit);
                if (elapsedRealtimeOffsetInSeconds > 0 && elapsedRealtimeOffsetInSeconds < 3600) {
                    l = Long.valueOf(elapsedRealtimeOffsetInSeconds);
                }
            }
        }
        c0963l.k = l;
        c0963l.h = cellInfo.isRegistered();
    }

    public V(SystemTimeOffsetProvider systemTimeOffsetProvider) {
        this.a = systemTimeOffsetProvider;
    }
}
