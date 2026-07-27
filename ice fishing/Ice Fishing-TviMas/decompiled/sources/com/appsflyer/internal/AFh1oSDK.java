package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFh1oSDK {
    public final AFd1rSDK AFAdRevenueData;
    public long areAllFieldsValid;
    public final long[] component1;
    public final long[] component2;
    public long component3;
    public final long[] component4;
    public long equals;
    public final Map<String, Object> getCurrencyIso4217Code;
    public long getMediationNetwork;
    public final Map<String, Object> getMonetizationNetwork;
    public final Map<String, Object> getRevenue;
    public long hashCode;

    public AFh1oSDK(AFd1rSDK aFd1rSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.getCurrencyIso4217Code = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.getRevenue = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.getMonetizationNetwork = concurrentHashMap3;
        this.getMediationNetwork = 0L;
        this.areAllFieldsValid = 0L;
        this.component1 = new long[2];
        this.component2 = new long[2];
        this.component4 = new long[2];
        this.component3 = 0L;
        this.hashCode = 0L;
        this.AFAdRevenueData = aFd1rSDK;
        concurrentHashMap.putAll(getRevenue("first_launch"));
        concurrentHashMap2.putAll(getRevenue("ddl"));
        concurrentHashMap3.putAll(getRevenue("gcd"));
        this.equals = aFd1rSDK.getMediationNetwork("prev_session_dur", 0L);
    }

    public final void getMonetizationNetwork() {
        this.areAllFieldsValid = System.currentTimeMillis();
        if (getCurrencyIso4217Code()) {
            long j = this.getMediationNetwork;
            if (j != 0) {
                this.getCurrencyIso4217Code.put("init_to_fg", Long.valueOf(this.areAllFieldsValid - j));
                this.AFAdRevenueData.AFAdRevenueData("first_launch", new JSONObject(this.getCurrencyIso4217Code).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void AFAdRevenueData(AFh1sSDK aFh1sSDK) {
        if (getCurrencyIso4217Code()) {
            this.getCurrencyIso4217Code.put("start_with", aFh1sSDK.toString());
            this.AFAdRevenueData.AFAdRevenueData("first_launch", new JSONObject(this.getCurrencyIso4217Code).toString());
        }
    }

    public final void getRevenue(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.component3 = currentTimeMillis;
        if (i == 1) {
            long j = this.areAllFieldsValid;
            if (j != 0) {
                this.getCurrencyIso4217Code.put("from_fg", Long.valueOf(currentTimeMillis - j));
                this.AFAdRevenueData.AFAdRevenueData("first_launch", new JSONObject(this.getCurrencyIso4217Code).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void getRevenue(DeepLinkResult deepLinkResult, long j) {
        this.getRevenue.put("status", deepLinkResult.getStatus().toString());
        this.getRevenue.put("timeout_value", Long.valueOf(j));
        this.AFAdRevenueData.AFAdRevenueData("ddl", new JSONObject(this.getRevenue).toString());
    }

    public final void getCurrencyIso4217Code(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.hashCode;
        if (j != 0) {
            this.getMonetizationNetwork.put("net", Long.valueOf(currentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.getMonetizationNetwork.put("retries", Integer.valueOf(i));
        this.AFAdRevenueData.AFAdRevenueData("gcd", new JSONObject(this.getMonetizationNetwork).toString());
    }

    private Map<String, Object> getRevenue(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String monetizationNetwork = this.AFAdRevenueData.getMonetizationNetwork(str, (String) null);
        if (monetizationNetwork == null) {
            return emptyMap;
        }
        try {
            return AFa1mSDK.getRevenue(new JSONObject(monetizationNetwork));
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while parsing cached json data", e, true);
            return emptyMap;
        }
    }

    public final boolean getCurrencyIso4217Code() {
        return this.AFAdRevenueData.getMediationNetwork("appsFlyerCount", 0) == 0;
    }
}
