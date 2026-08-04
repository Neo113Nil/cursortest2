package com.appsflyer.internal;

import com.gamericefishpro.space.ph.g0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFi1zSDK {
    public final AFh1aSDK getCurrencyIso4217Code;
    public AFi1xSDK getMediationNetwork;
    public final AFi1uSDK getMonetizationNetwork;

    public AFi1zSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getMediationNetwork = AFAdRevenueData(jSONObject);
        this.getCurrencyIso4217Code = getMediationNetwork(jSONObject);
        this.getMonetizationNetwork = getCurrencyIso4217Code(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.gamericefishpro.space.ph.g0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    private static AFi1xSDK AFAdRevenueData(JSONObject jSONObject) {
        Object objQ;
        ?? arrayList;
        try {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (jSONObjectAFAdRevenueData != null) {
                long j = jSONObjectAFAdRevenueData.getLong("ttl");
                int i = jSONObjectAFAdRevenueData.getInt("counter");
                String strOptString = jSONObjectAFAdRevenueData.optString("app_ver", "");
                String strOptString2 = jSONObjectAFAdRevenueData.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectAFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectAFAdRevenueData.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArrayOptJSONArray.getString(i2);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                } else {
                    arrayList = g0.d;
                }
                ?? r7 = arrayList;
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                objQ = new AFi1xSDK(j, fOptDouble, r7, i, strOptString, strOptString2);
            } else {
                objQ = null;
            }
        } catch (Throwable th) {
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            objQ = com.gamericefishpro.space.wa.b.q(th);
        }
        com.gamericefishpro.space.oh.n nVar3 = com.gamericefishpro.space.oh.p.d;
        return (AFi1xSDK) (objQ instanceof com.gamericefishpro.space.oh.o ? null : objQ);
    }

    private static AFi1uSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object objQ;
        try {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            objQ = jSONObjectAFAdRevenueData != null ? new AFi1uSDK(jSONObjectAFAdRevenueData.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            objQ = com.gamericefishpro.space.wa.b.q(th);
        }
        return (AFi1uSDK) (objQ instanceof com.gamericefishpro.space.oh.o ? null : objQ);
    }

    private static AFh1aSDK getMediationNetwork(JSONObject jSONObject) {
        Object objQ;
        try {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            objQ = jSONObjectAFAdRevenueData != null ? new AFh1aSDK(jSONObjectAFAdRevenueData.getString("sdk_ver"), jSONObjectAFAdRevenueData.optInt("min", -1), jSONObjectAFAdRevenueData.optInt("expire", -1), jSONObjectAFAdRevenueData.optLong("ttl", -1L)) : null;
        } catch (Throwable th) {
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            objQ = com.gamericefishpro.space.wa.b.q(th);
        }
        return (AFh1aSDK) (objQ instanceof com.gamericefishpro.space.oh.o ? null : objQ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFi1zSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "");
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return Intrinsics.a(this.getCurrencyIso4217Code, aFi1zSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getMonetizationNetwork, aFi1zSDK.getMonetizationNetwork) && Intrinsics.a(this.getMediationNetwork, aFi1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.getCurrencyIso4217Code;
        int iHashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFi1uSDK aFi1uSDK = this.getMonetizationNetwork;
        int iHashCode2 = (iHashCode + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0)) * 31;
        AFi1xSDK aFi1xSDK = this.getMediationNetwork;
        return iHashCode2 + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
