package com.icefishing.icefishingmoneygame11.storage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class PreferenceStore {
    SharedPreferences.Editor editor;
    SharedPreferences sharedPreferences;

    public PreferenceStore(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("MyApp", 0);
        this.sharedPreferences = sharedPreferences;
        this.editor = sharedPreferences.edit();
    }

    public boolean getIntrosOpen() {
        return this.sharedPreferences.getBoolean("intros", false);
    }

    public void setIntrosScreen(boolean z) {
        this.editor.putBoolean("intros", z);
        this.editor.apply();
    }
}
