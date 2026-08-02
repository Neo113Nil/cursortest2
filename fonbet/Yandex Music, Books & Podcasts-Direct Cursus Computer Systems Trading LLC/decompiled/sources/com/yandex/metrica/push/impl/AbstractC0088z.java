package com.yandex.metrica.push.impl;

import android.location.Location;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.push.impl.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0088z {
    public static boolean a(Location location, Long l, int i) {
        if (location == null) {
            return false;
        }
        if (l != null) {
            if ((com.yandex.metrica.push.utils.f.a(17) ? A.a(location) : TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis() - location.getTime())) > TimeUnit.SECONDS.toNanos(l.longValue())) {
                return false;
            }
        }
        return ((int) location.getAccuracy()) <= i;
    }
}
