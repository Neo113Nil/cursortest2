package com.google.android.datatransport;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadJava {
    public final Object WinterFlowCacheManagerAgent;
    public final Object WinterFlowHookDataSource;
    public long WinterFlowRouterStructure;

    public WinterFlowThreadJava() {
        this.WinterFlowHookDataSource = new WinterFlowConcurrencyProxy();
        this.WinterFlowCacheManagerAgent = new WinterFlowConcurrencyProxy();
    }

    public static WinterFlowThreadJava WinterFlowHookDataSource(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new WinterFlowThreadJava(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new WinterFlowThreadJava(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }

    public void WinterFlowRouterStructure(long j, long j2) {
        ((WinterFlowConcurrencyProxy) this.WinterFlowHookDataSource).WinterFlowRouterStructure(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((WinterFlowConcurrencyProxy) this.WinterFlowCacheManagerAgent).WinterFlowRouterStructure(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public WinterFlowThreadJava(String str, String str2, long j) {
        this.WinterFlowHookDataSource = str;
        this.WinterFlowCacheManagerAgent = str2;
        this.WinterFlowRouterStructure = j;
    }
}
