package com.onesignal.notifications.internal.open.impl;

import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    private JSONArray dataArray;
    private JSONObject jsonData;

    public a(JSONArray dataArray, JSONObject jsonData) {
        h.e(dataArray, "dataArray");
        h.e(jsonData, "jsonData");
        this.dataArray = dataArray;
        this.jsonData = jsonData;
    }

    public static /* synthetic */ a copy$default(a aVar, JSONArray jSONArray, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONArray = aVar.dataArray;
        }
        if ((i & 2) != 0) {
            jSONObject = aVar.jsonData;
        }
        return aVar.copy(jSONArray, jSONObject);
    }

    public final JSONArray component1() {
        return this.dataArray;
    }

    public final JSONObject component2() {
        return this.jsonData;
    }

    public final a copy(JSONArray dataArray, JSONObject jsonData) {
        h.e(dataArray, "dataArray");
        h.e(jsonData, "jsonData");
        return new a(dataArray, jsonData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.dataArray, aVar.dataArray) && h.a(this.jsonData, aVar.jsonData);
    }

    public final JSONArray getDataArray() {
        return this.dataArray;
    }

    public final JSONObject getJsonData() {
        return this.jsonData;
    }

    public int hashCode() {
        return this.jsonData.hashCode() + (this.dataArray.hashCode() * 31);
    }

    public final void setDataArray(JSONArray jSONArray) {
        h.e(jSONArray, "<set-?>");
        this.dataArray = jSONArray;
    }

    public final void setJsonData(JSONObject jSONObject) {
        h.e(jSONObject, "<set-?>");
        this.jsonData = jSONObject;
    }

    public String toString() {
        return "NotificationIntentExtras(dataArray=" + this.dataArray + ", jsonData=" + this.jsonData + ')';
    }
}
