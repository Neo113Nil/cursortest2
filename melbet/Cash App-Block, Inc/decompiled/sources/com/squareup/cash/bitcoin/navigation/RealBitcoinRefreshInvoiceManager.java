package com.squareup.cash.bitcoin.navigation;

import androidx.room.RoomDatabase$closeBarrier$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.preferences.PreferenceFlow;
import com.squareup.preferences.StringPreference;

/* loaded from: classes.dex */
public final class RealBitcoinRefreshInvoiceManager {
    public final StringPreference refreshInvoiceIdPref;
    public final AppLockMonitor$special$$inlined$map$2 requests;

    public RealBitcoinRefreshInvoiceManager(StringPreference stringPreference) {
        this.refreshInvoiceIdPref = stringPreference;
        this.requests = new AppLockMonitor$special$$inlined$map$2(new PreferenceFlow(stringPreference.key, stringPreference.preferences, new RoomDatabase$closeBarrier$1(0, stringPreference, StringPreference.class, "get", "get()Ljava/lang/String;", 0, 13)), 1);
    }
}
