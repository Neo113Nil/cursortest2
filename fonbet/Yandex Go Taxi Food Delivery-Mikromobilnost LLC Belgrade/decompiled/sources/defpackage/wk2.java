package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public final class wk2 {
    public final SharedPreferences a;
    public final ew2 b;
    public volatile String c;
    public volatile long d;

    public wk2(SharedPreferences sharedPreferences, ew2 ew2Var) {
        this.a = sharedPreferences;
        this.b = ew2Var;
        jl40.m();
        this.d = sharedPreferences.getLong("ANONYMOUS_TOKEN_GENERATED_TIME_KEY", 0L);
        if (this.d + 2592000000L <= System.currentTimeMillis()) {
            sharedPreferences.edit().remove("ANONYMOUS_TOKEN_KEY").remove("ANONYMOUS_GUID_KEY").remove("ANONYMOUS_TOKEN_GENERATED_TIME_KEY").apply();
        } else {
            this.c = sharedPreferences.getString("ANONYMOUS_TOKEN_KEY", null);
            sharedPreferences.getString("ANONYMOUS_GUID_KEY", null);
        }
    }
}
