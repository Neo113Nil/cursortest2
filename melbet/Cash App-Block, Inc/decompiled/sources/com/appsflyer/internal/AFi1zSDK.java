package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFi1zSDK {
    public final AFh1aSDK getCurrencyIso4217Code;
    public AFi1xSDK getMediationNetwork;
    public final AFi1uSDK getMonetizationNetwork;

    public AFi1zSDK(JSONObject jSONObject) {
        jSONObject.getClass();
        this.getMediationNetwork = AFAdRevenueData(jSONObject);
        this.getCurrencyIso4217Code = getMediationNetwork(jSONObject);
        this.getMonetizationNetwork = getCurrencyIso4217Code(jSONObject);
    }

    private static AFi1xSDK AFAdRevenueData(JSONObject jSONObject) {
        Object failure;
        List list;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (AFAdRevenueData != null) {
                long j = AFAdRevenueData.getLong("ttl");
                int i = AFAdRevenueData.getInt("counter");
                String optString = AFAdRevenueData.optString("app_ver", "");
                String optString2 = AFAdRevenueData.optString("sdk_ver", "");
                float optDouble = (float) AFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFAdRevenueData.optJSONArray("tags");
                if (optJSONArray != null) {
                    list = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string2 = optJSONArray.getString(i2);
                        string2.getClass();
                        list.add(string2);
                    }
                } else {
                    list = EmptyList.INSTANCE;
                }
                List list2 = list;
                optString.getClass();
                optString2.getClass();
                failure = new AFi1xSDK(j, optDouble, list2, i, optString, optString2);
            } else {
                failure = null;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Result.Companion companion3 = Result.Companion;
        return (AFi1xSDK) (failure instanceof Result.Failure ? null : failure);
    }

    private static AFi1uSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            failure = AFAdRevenueData != null ? new AFi1uSDK(AFAdRevenueData.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        return (AFi1uSDK) (failure instanceof Result.Failure ? null : failure);
    }

    private static AFh1aSDK getMediationNetwork(JSONObject jSONObject) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            failure = AFAdRevenueData != null ? new AFh1aSDK(AFAdRevenueData.getString("sdk_ver"), AFAdRevenueData.optInt("min", -1), AFAdRevenueData.optInt("expire", -1), AFAdRevenueData.optLong("ttl", -1L)) : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        return (AFh1aSDK) (failure instanceof Result.Failure ? null : failure);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFi1zSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1zSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMonetizationNetwork, aFi1zSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getMediationNetwork, aFi1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.getCurrencyIso4217Code;
        int hashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFi1uSDK aFi1uSDK = this.getMonetizationNetwork;
        int hashCode2 = (hashCode + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0)) * 31;
        AFi1xSDK aFi1xSDK = this.getMediationNetwork;
        return hashCode2 + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
