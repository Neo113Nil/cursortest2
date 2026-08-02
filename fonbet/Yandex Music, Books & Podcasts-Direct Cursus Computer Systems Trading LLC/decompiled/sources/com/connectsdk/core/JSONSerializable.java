package com.connectsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface JSONSerializable {
    JSONObject toJSONObject() throws JSONException;
}
