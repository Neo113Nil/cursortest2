package com.yandex.metrica.push.impl;

import android.location.Location;
import android.os.SystemClock;

/* loaded from: classes3.dex */
abstract class A {
    public static long a(Location location) {
        return SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos();
    }
}
