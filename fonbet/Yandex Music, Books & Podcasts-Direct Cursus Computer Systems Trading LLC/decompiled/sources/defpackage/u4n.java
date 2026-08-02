package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public final class u4n {
    public final SharedPreferences a;

    public u4n(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    public final void a(boolean z) {
        this.a.edit().putBoolean("KEY_PUSH_TOKEN_SUCCESS_SENT", z).apply();
    }
}
