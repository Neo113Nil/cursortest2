package com.appsflyer.internal;

import defpackage.c5b;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1iSDK {
    public final AFh1hSDK AFAdRevenueData;
    public final AFh1gSDK getMediationNetwork;
    public AFh1bSDK getRevenue;

    public AFh1iSDK(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.getRevenue = getMediationNetwork(jSONObject);
        this.getMediationNetwork = getMonetizationNetwork(jSONObject);
        this.AFAdRevenueData = getRevenue(jSONObject);
    }

    private static AFh1bSDK getMediationNetwork(JSONObject jSONObject) {
        Object t7oVar;
        List list;
        try {
            r7o r7oVar = z7o.b;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "r_debugger");
            if (mediationNetwork != null) {
                long j = mediationNetwork.getLong("ttl");
                int i = mediationNetwork.getInt("counter");
                String optString = mediationNetwork.optString("app_ver", "");
                String optString2 = mediationNetwork.optString("sdk_ver", "");
                float optDouble = (float) mediationNetwork.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = mediationNetwork.optJSONArray("tags");
                if (optJSONArray != null) {
                    list = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = optJSONArray.getString(i2);
                        string.getClass();
                        list.add(string);
                    }
                } else {
                    list = c5b.a;
                }
                List list2 = list;
                optString.getClass();
                optString2.getClass();
                t7oVar = new AFh1bSDK(j, optDouble, list2, i, optString, optString2);
            } else {
                t7oVar = null;
            }
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        r7o r7oVar3 = z7o.b;
        return (AFh1bSDK) (t7oVar instanceof t7o ? null : t7oVar);
    }

    private static AFh1gSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "exc_mngr");
            t7oVar = mediationNetwork != null ? new AFh1gSDK(mediationNetwork.getString("sdk_ver"), mediationNetwork.optInt("min", -1), mediationNetwork.optInt("expire", -1), mediationNetwork.optLong("ttl", -1L)) : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        return (AFh1gSDK) (t7oVar instanceof t7o ? null : t7oVar);
    }

    private static AFh1hSDK getRevenue(JSONObject jSONObject) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "meta_data");
            t7oVar = mediationNetwork != null ? new AFh1hSDK(mediationNetwork.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        return (AFh1hSDK) (t7oVar instanceof t7o ? null : t7oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1iSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AFh1iSDK aFh1iSDK = (AFh1iSDK) obj;
        return Intrinsics.d(this.getMediationNetwork, aFh1iSDK.getMediationNetwork) && Intrinsics.d(this.AFAdRevenueData, aFh1iSDK.AFAdRevenueData) && Intrinsics.d(this.getRevenue, aFh1iSDK.getRevenue);
    }

    public final int hashCode() {
        AFh1gSDK aFh1gSDK = this.getMediationNetwork;
        int hashCode = (aFh1gSDK != null ? aFh1gSDK.hashCode() : 0) * 31;
        AFh1hSDK aFh1hSDK = this.AFAdRevenueData;
        int hashCode2 = (hashCode + (aFh1hSDK != null ? aFh1hSDK.hashCode() : 0)) * 31;
        AFh1bSDK aFh1bSDK = this.getRevenue;
        return hashCode2 + (aFh1bSDK != null ? aFh1bSDK.hashCode() : 0);
    }

    private static JSONObject getMediationNetwork(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
