package com.fillr.core.model;

import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class ModelBase implements Parcelable {
    public boolean mFromCache = false;

    public static String getFilteredString(String str, JSONObject jSONObject) {
        String trim;
        if (jSONObject == null || jSONObject.isNull(str) || (trim = jSONObject.getString(str).trim()) == null || trim.equals("")) {
            return null;
        }
        return trim;
    }

    public abstract boolean onValidate();
}
