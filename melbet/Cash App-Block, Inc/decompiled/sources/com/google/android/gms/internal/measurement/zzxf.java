package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import com.google.common.base.Ticker;

/* loaded from: classes4.dex */
public final class zzxf extends Ticker {
    public final /* synthetic */ int $r8$classId;

    @Override // com.google.common.base.Ticker
    public final long read() {
        switch (this.$r8$classId) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
