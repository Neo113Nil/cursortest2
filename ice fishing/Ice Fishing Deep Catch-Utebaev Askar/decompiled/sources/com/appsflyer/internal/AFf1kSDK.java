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

/* JADX INFO: loaded from: classes.dex */
public final class AFf1kSDK extends AFe1eSDK<Map<String, Object>> {
    private static final int component1 = (int) TimeUnit.SECONDS.toMillis(2);
    private final AFc1kSDK areAllFieldsValid;
    private final Uri component2;
    private final AFc1oSDK component3;
    private Map<String, Object> component4;
    private final List<String> equals;

    public AFf1kSDK(AFc1kSDK aFc1kSDK, AFc1oSDK aFc1oSDK, Uri uri, List<String> list) {
        super(AFf1zSDK.RESOLVE_ESP, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "ResolveEsp");
        this.areAllFieldsValid = aFc1kSDK;
        this.component3 = aFc1oSDK;
        this.component2 = uri;
        this.equals = list;
    }

    private static Map<String, Object> v_(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i2 = component1;
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.15.2");
            int responseCode = httpURLConnection.getResponseCode();
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th) {
            map.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        return map;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() {
        Integer num = null;
        if (getMediationNetwork(this.component2.toString())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String string = this.component2.toString();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            String str = null;
            while (i2 < 5) {
                Map<String, Object> mapV_ = v_(Uri.parse(string));
                String str2 = (String) mapV_.get("res");
                Integer num2 = (Integer) mapV_.get("status");
                String str3 = (String) mapV_.get("error");
                if (str2 == null || !getMediationNetwork(str2)) {
                    str = str3;
                    string = str2;
                    num = num2;
                    break;
                }
                if (i2 < 4) {
                    arrayList.add(str2);
                }
                i2++;
                str = str3;
                string = str2;
                num = num2;
            }
            HashMap map = new HashMap();
            map.put("res", string != null ? string : "");
            map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
            if (str != null) {
                map.put("error", str);
            }
            if (!arrayList.isEmpty()) {
                map.put("redirects", arrayList);
            }
            map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            synchronized (this.component3) {
                this.component3.getMediationNetwork("af_deeplink_r", map);
                this.component3.getMediationNetwork("af_deeplink", this.component2.toString());
            }
            this.areAllFieldsValid.r_(this.component3, string != null ? Uri.parse(string) : this.component2, this.component2);
            this.component4 = map;
        } else {
            this.areAllFieldsValid.r_(this.component3, this.component2, null);
        }
        return AFe1cSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 60000L;
    }

    private boolean getMediationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.equals);
        AFLogger.afRDLog(sb.toString());
        try {
            return this.equals.contains(new URL(str).getHost());
        } catch (MalformedURLException e2) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e2);
            return false;
        }
    }
}
