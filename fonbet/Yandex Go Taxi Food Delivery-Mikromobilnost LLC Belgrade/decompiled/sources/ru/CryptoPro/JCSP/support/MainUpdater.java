package ru.CryptoPro.JCSP.support;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public abstract class MainUpdater {
    private final SharedPreferences sharedPreferences;
    private final String updateMark;
    private String updateValue;

    public MainUpdater(Context context, String str, String str2) {
        this.updateMark = str2;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        this.sharedPreferences = sharedPreferences;
        this.updateValue = sharedPreferences.getString(str2, null);
    }

    public String getUpdateValue() {
        return this.updateValue;
    }

    public boolean markUpdated() {
        if (this.updateValue == null) {
            return false;
        }
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(this.updateMark, this.updateValue);
        return edit.commit();
    }

    public abstract boolean needUpdate();

    public void setUpdateValue(String str) {
        this.updateValue = str;
    }
}
