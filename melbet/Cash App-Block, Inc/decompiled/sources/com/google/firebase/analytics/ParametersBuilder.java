package com.google.firebase.analytics;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class ParametersBuilder {
    public final Bundle zza;

    public ParametersBuilder() {
        this.zza = new Bundle();
    }

    public static boolean isNotification(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String userFriendlyKey(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean getBoolean(String str) {
        String string2 = getString(str);
        return "1".equals(string2) || Boolean.parseBoolean(string2);
    }

    public Bundle getBundle() {
        return this.zza;
    }

    public Integer getInteger(String str) {
        String string2 = getString(str);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(string2));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + userFriendlyKey(str) + "(" + string2 + ") into an int");
            return null;
        }
    }

    public JSONArray getJSONArray(String str) {
        String string2 = getString(str);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        try {
            return new JSONArray(string2);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + userFriendlyKey(str) + ": " + string2 + ", falling back to default");
            return null;
        }
    }

    public String getPossiblyLocalizedString(Resources resources, String str, String str2) {
        String[] strArr;
        String string2 = getString(str2);
        if (!TextUtils.isEmpty(string2)) {
            return string2;
        }
        String string3 = getString(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(string3)) {
            return null;
        }
        int identifier = resources.getIdentifier(string3, InquiryField.StringField.TYPE, str);
        if (identifier == 0) {
            Log.w("NotificationParams", userFriendlyKey(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArray = getJSONArray(str2.concat("_loc_args"));
        if (jSONArray == null) {
            strArr = null;
        } else {
            int length = jSONArray.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArray.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + userFriendlyKey(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String getString(String str) {
        Bundle bundle = this.zza;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public void param(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.zza.putString(str, str2);
    }

    public Bundle paramsForAnalyticsIntent() {
        Bundle bundle = this.zza;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public ParametersBuilder(Bundle bundle) {
        this.zza = new Bundle(bundle);
    }
}
