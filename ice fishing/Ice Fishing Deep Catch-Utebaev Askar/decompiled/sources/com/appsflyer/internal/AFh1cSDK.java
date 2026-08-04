package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
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

    private static AFi1uSDK AFAdRevenueData(JSONObject jSONObject) {
        Object objC;
        List list;
        try {
            f.d dVar = f.f.f121a;
            JSONObject revenue = getRevenue(jSONObject, "r_debugger");
            if (revenue != null) {
                long j2 = revenue.getLong("ttl");
                int i2 = revenue.getInt("counter");
                String strOptString = revenue.optString("app_ver", "");
                String strOptString2 = revenue.optString("sdk_ver", "");
                float fOptDouble = (float) revenue.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = revenue.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        String string = jSONArrayOptJSONArray.getString(i3);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                    list = arrayList;
                } else {
                    list = x.f177a;
                }
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                objC = new AFi1uSDK(j2, fOptDouble, list, i2, strOptString, strOptString2);
            } else {
                objC = null;
            }
        } catch (Throwable th) {
            f.d dVar2 = f.f.f121a;
            objC = a.c.c(th);
        }
        f.d dVar3 = f.f.f121a;
        return (AFi1uSDK) (objC instanceof f.e ? null : objC);
    }

    private static AFi1xSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object objC;
        try {
            f.d dVar = f.f.f121a;
            JSONObject revenue = getRevenue(jSONObject, "meta_data");
            objC = revenue != null ? new AFi1xSDK(revenue.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            f.d dVar2 = f.f.f121a;
            objC = a.c.c(th);
        }
        return (AFi1xSDK) (objC instanceof f.e ? null : objC);
    }

    private static AFh1dSDK getRevenue(JSONObject jSONObject) {
        Object objC;
        try {
            f.d dVar = f.f.f121a;
            JSONObject revenue = getRevenue(jSONObject, "exc_mngr");
            objC = revenue != null ? new AFh1dSDK(revenue.getString("sdk_ver"), revenue.optInt("min", -1), revenue.optInt("expire", -1), revenue.optLong("ttl", -1L)) : null;
        } catch (Throwable th) {
            f.d dVar2 = f.f.f121a;
            objC = a.c.c(th);
        }
        return (AFh1dSDK) (objC instanceof f.e ? null : objC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.a(AFh1cSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "");
        AFh1cSDK aFh1cSDK = (AFh1cSDK) obj;
        return Intrinsics.a(this.getMediationNetwork, aFh1cSDK.getMediationNetwork) && Intrinsics.a(this.getMonetizationNetwork, aFh1cSDK.getMonetizationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFh1cSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        AFh1dSDK aFh1dSDK = this.getMediationNetwork;
        int iHashCode = (aFh1dSDK != null ? aFh1dSDK.hashCode() : 0) * 31;
        AFi1xSDK aFi1xSDK = this.getMonetizationNetwork;
        int iHashCode2 = (iHashCode + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0)) * 31;
        AFi1uSDK aFi1uSDK = this.getCurrencyIso4217Code;
        return iHashCode2 + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0);
    }

    private static JSONObject getRevenue(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
