package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class AFf1kSDK extends AFe1eSDK<Map<String, Object>> {
    private static final int component1 = (int) TimeUnit.SECONDS.toMillis(2);
    private final AFc1kSDK areAllFieldsValid;
    private final Uri component2;
    private final AFc1oSDK component3;
    private Map<String, Object> component4;
    private final List<String> equals;

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 60000L;
    }

    public AFf1kSDK(AFc1kSDK aFc1kSDK, AFc1oSDK aFc1oSDK, Uri uri, List<String> list) {
        super(AFf1zSDK.RESOLVE_ESP, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "ResolveEsp");
        this.areAllFieldsValid = aFc1kSDK;
        this.component3 = aFc1oSDK;
        this.component2 = uri;
        this.equals = list;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() throws Exception {
        Integer num = null;
        if (!getMediationNetwork(this.component2.toString())) {
            this.areAllFieldsValid.r_(this.component3, this.component2, null);
            return AFe1cSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.component2.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> v_ = v_(Uri.parse(obj));
            String str2 = (String) v_.get("res");
            Integer num2 = (Integer) v_.get("status");
            String str3 = (String) v_.get("error");
            if (str2 == null || !getMediationNetwork(str2)) {
                str = str3;
                obj = str2;
                num = num2;
                break;
            }
            if (i < 4) {
                arrayList.add(str2);
            }
            i++;
            str = str3;
            obj = str2;
            num = num2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("res", obj != null ? obj : "");
        hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            hashMap.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.component3) {
            this.component3.getMediationNetwork("af_deeplink_r", hashMap);
            this.component3.getMediationNetwork("af_deeplink", this.component2.toString());
        }
        this.areAllFieldsValid.r_(this.component3, obj != null ? Uri.parse(obj) : this.component2, this.component2);
        this.component4 = hashMap;
        return AFe1cSDK.SUCCESS;
    }

    private static Map<String, Object> v_(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            AFLogger.afDebugLog(new StringBuilder("ESP deeplink resolving is started: ").append(uri.toString()).toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = component1;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.15.2");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th) {
            hashMap.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        return hashMap;
    }

    private boolean getMediationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        AFLogger.afRDLog(new StringBuilder("Validate if link ").append(str).append(" belongs to ESP domains: ").append(this.equals).toString());
        try {
            return this.equals.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }
}
