package com.knotapi.knot.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PreferenceManager {
    public static final String PREF_CLIENT_COOKIES = "client_cookies";
    public static final String PREF_INTERNET_SPEED = "internet_speed";
    public static final String PREF_SDK_LOAD_TIME = "sdk_load_time";
    public static final String PREF_SETTINGS = "settings";
    public static final String TAG = "Knot:PreferenceManager";
    private final String DEFAULT_PREF_FILE_NAME = "knotapi_sdk";

    public static String getGoogleAuthPattern(Context context, String str) {
        try {
            PreferenceManager preferenceManager = new PreferenceManager();
            if (!preferenceManager.getString(context, PREF_SETTINGS, "").isEmpty()) {
                String optString = new JSONObject(new JSONObject(preferenceManager.getString(context, PREF_SETTINGS, "")).optString(str)).optString("user_id_page_pattern");
                if (!optString.isEmpty()) {
                    return optString;
                }
            }
        } catch (JSONException unused) {
        }
        return Constants.google_auth_pattern;
    }

    public static String getUserAgent(Context context, String str, Boolean bool) {
        try {
            PreferenceManager preferenceManager = new PreferenceManager();
            if (!preferenceManager.getString(context, PREF_SETTINGS, "").isEmpty()) {
                String optString = new JSONObject(new JSONObject(preferenceManager.getString(context, PREF_SETTINGS, "")).optString(str)).optString("user_agent");
                if (!optString.isEmpty()) {
                    return optString;
                }
            }
        } catch (JSONException unused) {
        }
        return bool.booleanValue() ? Constants.operaPopupUserAgent : Constants.operaUserAgent;
    }

    public void deletePrefData(Context context) {
        SharedPreferences.Editor edit = getSharedPreferences(context, "knotapi_sdk").edit();
        edit.remove(PREF_SETTINGS);
        edit.apply();
    }

    public SharedPreferences getSharedPreferences(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    public String getString(Context context, String str, String str2) {
        return getSharedPreferences(context, "knotapi_sdk").getString(str, str2);
    }

    public String internetSpeed(Context context) {
        String string2;
        try {
            string2 = new PreferenceManager().getString(context, PREF_INTERNET_SPEED, "");
        } catch (Exception unused) {
        }
        return !string2.isEmpty() ? string2 : "";
    }

    public void saveString(Context context, String str, String str2) {
        SharedPreferences.Editor edit = getSharedPreferences(context, "knotapi_sdk").edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
