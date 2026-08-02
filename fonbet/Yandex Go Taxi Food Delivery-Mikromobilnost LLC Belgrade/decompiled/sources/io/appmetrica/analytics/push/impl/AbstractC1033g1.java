package io.appmetrica.analytics.push.impl;

import android.location.Location;
import android.os.SystemClock;

/* renamed from: io.appmetrica.analytics.push.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1033g1 {
    public static final long a(Location location) {
        return SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos();
    }
}
