package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AFf1fSDK extends AFf1eSDK {
    private final AppsFlyerProperties AFInAppEventParameterName;
    private final AFh1oSDK AFInAppEventType;
    private final AFj1uSDK copy;
    public Map<String, Object> copydefault;
    private final AFd1rSDK hashCode;
    private final AFc1hSDK valueOf;
    private final AFf1aSDK values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1fSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
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

    @Override // com.appsflyer.internal.AFf1eSDK
    public void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        super.getCurrencyIso4217Code(aFa1oSDK);
        int i2 = aFa1oSDK.component1;
        getMonetizationNetwork(i2);
        Map map = (Map) aFa1oSDK.getMonetizationNetwork().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1oSDK.getMonetizationNetwork().put("meta", map);
        }
        if (!aFa1oSDK.getMonetizationNetwork().containsKey("af_deeplink")) {
            aFa1oSDK.getRevenue(this.valueOf.getMonetizationNetwork());
        }
        AFi1ySDK aFi1ySDKAFAdRevenueData = this.values.AFAdRevenueData();
        if (aFi1ySDKAFAdRevenueData != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", aFi1ySDKAFAdRevenueData.AFAdRevenueData);
            String str = aFi1ySDKAFAdRevenueData.getMediationNetwork;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j2 = aFi1ySDKAFAdRevenueData.getRevenue;
            if (j2 > 0) {
                map2.put("latency", Long.valueOf(j2));
            }
            long j3 = aFi1ySDKAFAdRevenueData.getCurrencyIso4217Code;
            if (j3 > 0) {
                map2.put("delay", Long.valueOf(j3));
            }
            int i3 = aFi1ySDKAFAdRevenueData.getMonetizationNetwork;
            if (i3 > 0) {
                map2.put("res_code", Integer.valueOf(i3));
            }
            if (aFi1ySDKAFAdRevenueData.component2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(aFi1ySDKAFAdRevenueData.component2.getClass().getSimpleName());
                sb.append(": ");
                sb.append(aFi1ySDKAFAdRevenueData.component2.getMessage());
                map2.put("error", sb.toString());
            }
            AFi1wSDK aFi1wSDK = aFi1ySDKAFAdRevenueData.component1;
            if (aFi1wSDK != null) {
                map2.put("sig", aFi1wSDK.toString());
            }
            String str2 = aFi1ySDKAFAdRevenueData.component4;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        ((AFf1eSDK) this).equals.AFAdRevenueData(aFa1oSDK.getMonetizationNetwork());
        if (i2 == 1) {
            if (this.AFInAppEventParameterName.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1oSDK.getMonetizationNetwork().put("wait_cid", Boolean.toString(true));
            }
            HashMap map3 = new HashMap(this.AFInAppEventType.getRevenue);
            this.AFInAppEventType.AFAdRevenueData.AFAdRevenueData("ddl");
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.AFInAppEventType.getCurrencyIso4217Code);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
        } else if (i2 == 2) {
            HashMap map5 = new HashMap(this.AFInAppEventType.getCurrencyIso4217Code);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            this.AFInAppEventType.AFAdRevenueData.AFAdRevenueData("first_launch");
        }
        if (map.isEmpty()) {
            aFa1oSDK.getMonetizationNetwork().remove("meta");
        }
        if (i2 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1sSDK aFj1sSDK : this.copy.getCurrencyIso4217Code()) {
                boolean z = aFj1sSDK instanceof AFi1eSDK;
                int i4 = AnonymousClass2.getCurrencyIso4217Code[aFj1sSDK.component2.ordinal()];
                if (i4 == 1) {
                    if (z) {
                        aFa1oSDK.getCurrencyIso4217Code("rfr", ((AFi1eSDK) aFj1sSDK).getRevenue);
                        this.hashCode.getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1sSDK.getMediationNetwork);
                } else if (i4 == 2 && i2 == 2 && !z) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFj1sSDK.getMonetizationNetwork);
                    map6.put("response", "TIMEOUT");
                    map6.put("type", aFj1sSDK.component3);
                    arrayList.add(map6);
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

    public void getMonetizationNetwork(int i2) {
        this.AFInAppEventType.getRevenue(i2);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        super.getRevenue();
        AFh1oSDK aFh1oSDK = this.AFInAppEventType;
        int i2 = ((AFf1eSDK) this).component3.component1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i2 == 1) {
            long j2 = aFh1oSDK.component3;
            if (j2 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1oSDK.getCurrencyIso4217Code.put("net", Long.valueOf(jCurrentTimeMillis - j2));
            aFh1oSDK.AFAdRevenueData.AFAdRevenueData("first_launch", new JSONObject(aFh1oSDK.getCurrencyIso4217Code).toString());
        }
    }
}
