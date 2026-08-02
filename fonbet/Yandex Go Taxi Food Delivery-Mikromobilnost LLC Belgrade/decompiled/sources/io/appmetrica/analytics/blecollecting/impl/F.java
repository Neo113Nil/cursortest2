package io.appmetrica.analytics.blecollecting.impl;

import android.content.SharedPreferences;
import io.appmetrica.analytics.blewrapper.internal.result.BleData;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes4.dex */
public final class F {
    public final SharedPreferences a;
    public final SystemTimeProvider b;

    public /* synthetic */ F(SharedPreferences sharedPreferences) {
        this(sharedPreferences, new SystemTimeProvider());
    }

    public final boolean a(BleData bleData, long j) {
        String address = bleData.getAddress();
        if (address != null) {
            if (address.length() == 0) {
                address = null;
            }
            if (address != null) {
                long currentTimeMillis = this.b.currentTimeMillis();
                long j2 = this.a.getLong(address, -1L);
                r0 = j2 == -1 || currentTimeMillis - j2 > j;
                if (r0) {
                    SharedPreferences.Editor edit = this.a.edit();
                    edit.putLong(address, currentTimeMillis);
                    edit.apply();
                }
            }
        }
        return r0;
    }

    public F(SharedPreferences sharedPreferences, SystemTimeProvider systemTimeProvider) {
        this.a = sharedPreferences;
        this.b = systemTimeProvider;
    }
}
