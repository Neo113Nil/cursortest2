package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellInfo;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeOffsetProvider;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class V implements InterfaceC0923x {
    public final SystemTimeOffsetProvider a;

    public V() {
        this(new SystemTimeOffsetProvider());
    }

    public final void a(@NonNull CellInfo cellInfo, @NonNull C0888l c0888l) {
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
        c0888l.k = l;
        c0888l.h = cellInfo.isRegistered();
    }

    public V(SystemTimeOffsetProvider systemTimeOffsetProvider) {
        this.a = systemTimeOffsetProvider;
    }
}
