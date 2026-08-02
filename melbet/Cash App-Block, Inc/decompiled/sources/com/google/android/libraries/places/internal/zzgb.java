package com.google.android.libraries.places.internal;

import android.os.SystemClock;
import java.time.Duration;

/* loaded from: classes4.dex */
public final class zzgb {
    static {
        new zzgb();
    }

    public zzgb() {
        SystemClock.elapsedRealtime();
        Duration.ofMillis(SystemClock.uptimeMillis()).toMillis();
    }
}
