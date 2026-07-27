package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFh1cSDK {
    public AFi1uSDK getCurrencyIso4217Code;
    public final AFh1dSDK getMediationNetwork;
    public final AFi1xSDK getMonetizationNetwork;

    public AFh1cSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getCurrencyIso4217Code = AFAdRevenueData(jSONObject);
        this.getMediationNetwork = getRevenue(jSONObject);
        this.getMonetizationNetwork = getMonetizationNetwork(jSONObject);
    }

    private static AFi1xSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object m6239constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject revenue = getRevenue(jSONObject, "meta_data");
            m6239constructorimpl = Result.m6239constructorimpl(revenue != null ? new AFi1xSDK(revenue.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6239constructorimpl = Result.m6239constructorimpl(ResultKt.createFailure(th));
        }
        return (AFi1xSDK) (Result.m6245isFailureimpl(m6239constructorimpl) ? null : m6239constructorimpl);
    }

    private static AFh1dSDK getRevenue(JSONObject jSONObject) {
        Object m6239constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject revenue = getRevenue(jSONObject, "exc_mngr");
            m6239constructorimpl = Result.m6239constructorimpl(revenue != null ? new AFh1dSDK(revenue.getString("sdk_ver"), revenue.optInt("min", -1), revenue.optInt("expire", -1), revenue.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6239constructorimpl = Result.m6239constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1dSDK) (Result.m6245isFailureimpl(m6239constructorimpl) ? null : m6239constructorimpl);
    }

    private static AFi1uSDK AFAdRevenueData(JSONObject jSONObject) {
        Object m6239constructorimpl;
        AFi1uSDK aFi1uSDK;
        List emptyList;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject revenue = getRevenue(jSONObject, "r_debugger");
            if (revenue != null) {
                long j = revenue.getLong("ttl");
                int i = revenue.getInt("counter");
                String optString = revenue.optString("app_ver", "");
                String optString2 = revenue.optString("sdk_ver", "");
                float optDouble = (float) revenue.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = revenue.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = optJSONArray.getString(i2);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                    emptyList = arrayList;
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                aFi1uSDK = new AFi1uSDK(j, optDouble, emptyList, i, optString, optString2);
            } else {
                aFi1uSDK = null;
            }
            m6239constructorimpl = Result.m6239constructorimpl(aFi1uSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6239constructorimpl = Result.m6239constructorimpl(ResultKt.createFailure(th));
        }
        return (AFi1uSDK) (Result.m6245isFailureimpl(m6239constructorimpl) ? null : m6239constructorimpl);
    }

    private static JSONObject getRevenue(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFh1cSDK aFh1cSDK = (AFh1cSDK) obj;
        return Intrinsics.areEqual(this.getMediationNetwork, aFh1cSDK.getMediationNetwork) && Intrinsics.areEqual(this.getMonetizationNetwork, aFh1cSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1cSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        AFh1dSDK aFh1dSDK = this.getMediationNetwork;
        int hashCode = (aFh1dSDK != null ? aFh1dSDK.hashCode() : 0) * 31;
        AFi1xSDK aFi1xSDK = this.getMonetizationNetwork;
        int hashCode2 = (hashCode + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0)) * 31;
        AFi1uSDK aFi1uSDK = this.getCurrencyIso4217Code;
        return hashCode2 + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0);
    }
}
