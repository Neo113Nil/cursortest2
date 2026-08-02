package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Store {
    public final SharedPreferences store;

    public final class Token {
        public final String appVersion;
        public final long timestamp;
        public final String token;

        public Token(String str, String str2, long j) {
            this.token = str;
            this.appVersion = str2;
            this.timestamp = j;
        }

        public static String encode(long j, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        public static Token parse(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new Token(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new Token(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }
    }

    public Store(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.store = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public static String createTokenKey(String str, String str2) {
        return Boxes$$ExternalSyntheticOutline1.m(str, "|T|", str2, "|*");
    }
}
