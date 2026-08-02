package com.connectsdk.core;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppInfo implements JSONSerializable {
    String id;
    String name;
    JSONObject raw;

    public AppInfo(String str) {
        this.id = str;
    }

    public boolean equals(Object obj) {
        return obj instanceof AppInfo ? this.id.equals(((AppInfo) obj).id) : super.equals(obj);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public JSONObject getRawData() {
        return this.raw;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str.trim();
    }

    public void setRawData(JSONObject jSONObject) {
        this.raw = jSONObject;
    }

    @Override // com.connectsdk.core.JSONSerializable
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.name);
        jSONObject.put(ConnectableDevice.KEY_ID, this.id);
        return jSONObject;
    }

    public AppInfo() {
    }
}
