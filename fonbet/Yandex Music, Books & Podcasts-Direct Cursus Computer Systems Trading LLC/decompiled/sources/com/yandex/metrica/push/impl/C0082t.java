package com.yandex.metrica.push.impl;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.push.LocationProvider;
import com.yandex.metrica.push.common.utils.InternalLogger;

/* renamed from: com.yandex.metrica.push.impl.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0082t {
    private final Context a;

    public C0082t(Context context) {
        this.a = context;
    }

    public Location a(String str, long j, long j2, int i) {
        InternalLogger.i("Trying get location from custom LocationProvider", new Object[0]);
        LocationProvider a = C0077n.a(this.a).a();
        if (a == null) {
            return null;
        }
        Location a2 = C0087y.a(a).a("passive".equals(str), j2, j);
        if (AbstractC0088z.a(a2, null, i)) {
            return a2;
        }
        return null;
    }
}
