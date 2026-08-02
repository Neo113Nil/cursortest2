package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class wn0 {
    public final SharedPreferences a;
    public final qdc b;
    public volatile String c;
    public volatile long d;

    public wn0(SharedPreferences sharedPreferences, qdc qdcVar) {
        sharedPreferences.getClass();
        qdcVar.getClass();
        this.a = sharedPreferences;
        this.b = qdcVar;
        this.d = sharedPreferences.getLong("ANONYMOUS_TOKEN_GENERATED_TIME_KEY", 0L);
        if (this.d + 2592000000L <= System.currentTimeMillis()) {
            sharedPreferences.edit().remove("ANONYMOUS_TOKEN_KEY").remove("ANONYMOUS_GUID_KEY").remove("ANONYMOUS_TOKEN_GENERATED_TIME_KEY").apply();
        } else {
            this.c = sharedPreferences.getString("ANONYMOUS_TOKEN_KEY", null);
            sharedPreferences.getString("ANONYMOUS_GUID_KEY", null);
        }
    }

    public final String a() {
        if (this.d + 2592000000L > System.currentTimeMillis()) {
            return this.c;
        }
        return null;
    }
}
