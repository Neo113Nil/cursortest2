package com.bugsnag.android;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class SharedPrefMigrator {
    public final SharedPreferences prefs;

    public SharedPrefMigrator(Context context) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.getSharedPreferences("com.bugsnag.android", 0);
        } catch (RuntimeException unused) {
            sharedPreferences = null;
        }
        this.prefs = sharedPreferences;
    }
}
