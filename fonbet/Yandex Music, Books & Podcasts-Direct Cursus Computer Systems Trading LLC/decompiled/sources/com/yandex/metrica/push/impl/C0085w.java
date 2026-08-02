package com.yandex.metrica.push.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.push.impl.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0085w implements InterfaceC0084v {
    private final Context a;

    public C0085w(Context context) {
        this.a = context;
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC0084v
    public Location a(LocationManager locationManager, String str, long j, long j2, int i) {
        Location location;
        InternalLogger.i("Trying get last known location", new Object[0]);
        Iterator<String> it = locationManager.getProviders(true).iterator();
        do {
            location = null;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            try {
                if (com.yandex.metrica.push.utils.i.a(this.a, next)) {
                    location = locationManager.getLastKnownLocation(next);
                }
            } catch (Throwable th) {
                InternalLogger.e(th, "Failed to get last known location", new Object[0]);
            }
        } while (!AbstractC0088z.a(location, Long.valueOf(j2), i));
        return location;
    }
}
