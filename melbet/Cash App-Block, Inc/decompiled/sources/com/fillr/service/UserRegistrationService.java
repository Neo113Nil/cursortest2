package com.fillr.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.fillr.core.model.ModelBase;
import com.fillr.core.utilities.AppPreferenceStore;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class UserRegistrationService extends BaseIntentService {
    public AppPreferenceStore preferences;

    public UserRegistrationService() {
        super("User Registration");
        this.preferences = null;
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIData(int i, ModelBase modelBase) {
        SharedPreferences sharedPreferences = this.preferences.mPreferences;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("F_INITIAL_DATA", null);
            edit.apply();
        }
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        this.preferences = new AppPreferenceStore(this);
        String str = "com.fillr";
        String stringExtra = (intent == null || !intent.hasExtra("com.fillr.browser_ref")) ? "com.fillr" : intent.getStringExtra("com.fillr.browser_ref");
        String stringExtra2 = (intent == null || !intent.hasExtra("com.fillr.browser_dev_key")) ? null : intent.getStringExtra("com.fillr.browser_dev_key");
        if (stringExtra != null) {
            try {
                getPackageManager().getPackageInfo(stringExtra, 1);
            } catch (PackageManager.NameNotFoundException unused) {
                stringExtra2 = null;
            }
        }
        str = stringExtra;
        SharedPreferences sharedPreferences = this.preferences.mPreferences;
        String string2 = sharedPreferences != null ? sharedPreferences.getString("F_INITIAL_DATA", null) : null;
        if (string2 != null) {
            try {
                String[] split = string2.split("\\|");
                if (split == null || split.length < 1) {
                    return;
                }
                String str2 = split[0];
                String str3 = split.length >= 2 ? split[1] : null;
                String str4 = split.length == 3 ? split[2] : null;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("EmailAddress", str2);
                StringBuilder sb = new StringBuilder();
                if (str3 == null) {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(" ");
                if (str4 == null) {
                    str4 = "";
                }
                sb.append(str4);
                jSONObject.put("Name", sb.toString());
                JSONArray jSONArray = new JSONArray();
                if (str != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("Key", "browser_name");
                    jSONObject2.put("Value", str);
                    jSONArray.put(jSONObject2);
                }
                if (stringExtra2 != null && !stringExtra2.trim().equals("")) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("Key", "dev_key");
                    jSONObject3.put("Value", stringExtra2);
                    jSONArray.put(jSONObject3);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("CustomFields", jSONArray);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
