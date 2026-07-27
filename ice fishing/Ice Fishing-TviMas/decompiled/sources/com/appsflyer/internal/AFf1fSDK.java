package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1sSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AFf1fSDK extends AFf1eSDK {
    private final AppsFlyerProperties AFInAppEventParameterName;
    private final AFh1oSDK AFInAppEventType;
    private final AFj1uSDK copy;
    public Map<String, Object> copydefault;
    private final AFd1rSDK hashCode;
    private final AFc1hSDK valueOf;
    private final AFf1aSDK values;

    public AFf1fSDK(AFa1oSDK aFa1oSDK, AFd1kSDK aFd1kSDK) {
        super(aFa1oSDK, aFd1kSDK);
        this.copy = aFd1kSDK.equals();
        this.hashCode = aFd1kSDK.getRevenue();
        this.AFInAppEventType = aFd1kSDK.component3();
        this.values = aFd1kSDK.component2();
        this.AFInAppEventParameterName = AppsFlyerProperties.getInstance();
        this.valueOf = aFd1kSDK.afInfoLog();
        this.getCurrencyIso4217Code.add(AFf1zSDK.RESOLVE_ESP);
        this.getCurrencyIso4217Code.add(AFf1zSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        super.getRevenue();
        AFh1oSDK aFh1oSDK = this.AFInAppEventType;
        int i = ((AFf1eSDK) this).component3.component1;
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            if (aFh1oSDK.component3 != 0) {
                aFh1oSDK.getCurrencyIso4217Code.put("net", Long.valueOf(currentTimeMillis - aFh1oSDK.component3));
                aFh1oSDK.AFAdRevenueData.AFAdRevenueData("first_launch", new JSONObject(aFh1oSDK.getCurrencyIso4217Code).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: launch start ts is missing");
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    protected void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        super.getCurrencyIso4217Code(aFa1oSDK);
        int i = aFa1oSDK.component1;
        getMonetizationNetwork(i);
        Map map = (Map) aFa1oSDK.getMonetizationNetwork().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1oSDK.getMonetizationNetwork().put("meta", map);
        }
        if (!aFa1oSDK.getMonetizationNetwork().containsKey("af_deeplink")) {
            aFa1oSDK.getRevenue(this.valueOf.getMonetizationNetwork());
        }
        AFi1ySDK AFAdRevenueData = this.values.AFAdRevenueData();
        if (AFAdRevenueData != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFAdRevenueData.AFAdRevenueData);
            if (AFAdRevenueData.getMediationNetwork != null) {
                hashMap.put("c_ver", AFAdRevenueData.getMediationNetwork);
            }
            if (AFAdRevenueData.getRevenue > 0) {
                hashMap.put("latency", Long.valueOf(AFAdRevenueData.getRevenue));
            }
            if (AFAdRevenueData.getCurrencyIso4217Code > 0) {
                hashMap.put("delay", Long.valueOf(AFAdRevenueData.getCurrencyIso4217Code));
            }
            if (AFAdRevenueData.getMonetizationNetwork > 0) {
                hashMap.put("res_code", Integer.valueOf(AFAdRevenueData.getMonetizationNetwork));
            }
            if (AFAdRevenueData.component2 != null) {
                hashMap.put("error", new StringBuilder().append(AFAdRevenueData.component2.getClass().getSimpleName()).append(": ").append(AFAdRevenueData.component2.getMessage()).toString());
            }
            if (AFAdRevenueData.component1 != null) {
                hashMap.put("sig", AFAdRevenueData.component1.toString());
            }
            if (AFAdRevenueData.component4 != null) {
                hashMap.put("cdn_cache_status", AFAdRevenueData.component4);
            }
            map.put("rc", hashMap);
        }
        ((AFf1eSDK) this).equals.AFAdRevenueData(aFa1oSDK.getMonetizationNetwork());
        if (i == 1) {
            if (this.AFInAppEventParameterName.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1oSDK.getMonetizationNetwork().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.AFInAppEventType.getRevenue);
            this.AFInAppEventType.AFAdRevenueData.AFAdRevenueData("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.AFInAppEventType.getCurrencyIso4217Code);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i == 2) {
            HashMap hashMap4 = new HashMap(this.AFInAppEventType.getCurrencyIso4217Code);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.AFInAppEventType.AFAdRevenueData.AFAdRevenueData("first_launch");
        }
        if (map.isEmpty()) {
            aFa1oSDK.getMonetizationNetwork().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1sSDK aFj1sSDK : this.copy.getCurrencyIso4217Code()) {
                boolean z = aFj1sSDK instanceof AFi1eSDK;
                int i2 = AnonymousClass2.getCurrencyIso4217Code[aFj1sSDK.component2.ordinal()];
                if (i2 == 1) {
                    if (z) {
                        aFa1oSDK.getCurrencyIso4217Code("rfr", ((AFi1eSDK) aFj1sSDK).getRevenue);
                        this.hashCode.getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1sSDK.getMediationNetwork);
                } else if (i2 == 2 && i == 2 && !z) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFj1sSDK.getMonetizationNetwork);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFj1sSDK.component3);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1oSDK.getCurrencyIso4217Code("referrers", arrayList);
            }
            Object obj = this.copydefault;
            if (obj != null) {
                aFa1oSDK.getCurrencyIso4217Code("fb_ddl", obj);
            }
        }
        ((AFf1eSDK) this).equals.getCurrencyIso4217Code(aFa1oSDK);
    }

    /* renamed from: com.appsflyer.internal.AFf1fSDK$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFj1sSDK.AFa1zSDK.values().length];
            getCurrencyIso4217Code = iArr;
            try {
                iArr[AFj1sSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getCurrencyIso4217Code[AFj1sSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected void getMonetizationNetwork(int i) {
        this.AFInAppEventType.getRevenue(i);
    }
}
