package io.appmetrica.analytics.blecollecting.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0161p {
    public final Context a;

    public C0161p(Context context) {
        this.a = context;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("io.appmetrica.analytics.blecollecting.APPMETRICA_LAST_SEND_SHARED_PREFERENCES_NAME", 0).edit();
        edit.clear();
        edit.apply();
        SharedPreferences.Editor edit2 = this.a.getSharedPreferences("io.appmetrica.analytics.blecollecting.RTM_LAST_SEND_SHARED_PREFERENCES_NAME", 0).edit();
        edit2.clear();
        edit2.apply();
    }

    public final SharedPreferences b() {
        return this.a.getSharedPreferences("io.appmetrica.analytics.blecollecting.APPMETRICA_LAST_SEND_SHARED_PREFERENCES_NAME", 0);
    }

    public final SharedPreferences c() {
        return this.a.getSharedPreferences("io.appmetrica.analytics.blecollecting.RTM_LAST_SEND_SHARED_PREFERENCES_NAME", 0);
    }
}
