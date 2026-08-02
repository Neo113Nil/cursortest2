package io.appmetrica.analytics.push.impl;

import android.content.Context;
import defpackage.g8e;

/* loaded from: classes9.dex */
public final class M1 {
    public final Context a;
    public final String b;

    public M1(Context context, String str) {
        this.a = context;
        this.b = context.getPackageName() + str;
    }

    public final Boolean a(String str) {
        if (this.a.getSharedPreferences(this.b, 0).contains(str)) {
            return Boolean.valueOf(this.a.getSharedPreferences(this.b, 0).getBoolean(str, false));
        }
        return null;
    }

    public final M1 a(String str, boolean z) {
        this.a.getSharedPreferences(this.b, 0).edit().putBoolean(str, z).apply();
        return this;
    }

    public final M1 a(String str, String str2) {
        this.a.getSharedPreferences(this.b, 0).edit().putString(str, str2).apply();
        return this;
    }

    public final void a(int i) {
        this.a.getSharedPreferences(this.b, 0).edit().putInt("pending_intent_id", i).apply();
    }

    public final void a(String str, long j) {
        this.a.getSharedPreferences(this.b, 0).edit().putLong(g8e.o("appmetrica_tracker_event_id_", str), j).apply();
    }
}
