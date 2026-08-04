package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1kSDK {
    public final AFd1kSDK areAllFieldsValid;
    public String[] component1;
    public long component3;
    public Map<String, String> getCurrencyIso4217Code;
    public String getMediationNetwork;
    public DeepLinkListener getMonetizationNetwork;
    public Intent getRevenue;
    public List<List<String>> AFAdRevenueData = new ArrayList();
    public final List<String> component4 = new ArrayList();

    public AFc1kSDK(AFd1kSDK aFd1kSDK) {
        this.areAllFieldsValid = aFd1kSDK;
    }

    private static void getMediationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getMonetizationNetwork;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    private boolean p_(Intent intent, AFc1oSDK aFc1oSDK) {
        String string;
        Uri uriQ_;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.getRevenue;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (!this.AFAdRevenueData.isEmpty() && extras != null) {
                for (List<String> list : this.AFAdRevenueData) {
                    if (list == null) {
                        uriQ_ = null;
                    } else {
                        Iterator<String> it = list.iterator();
                        if (it.hasNext() && (string = extras.getString(it.next())) != null) {
                            uriQ_ = q_(string, it);
                        } else {
                            uriQ_ = null;
                        }
                    }
                    if (uriQ_ != null) {
                        StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                        sb.append(list.toString());
                        AFLogger.afDebugLog(sb.toString());
                        List<List<String>> list2 = this.AFAdRevenueData;
                        Intrinsics.checkNotNullParameter("payloadKey", "");
                        Map<String, Object> currencyIso4217Code = AFb1rSDK.getCurrencyIso4217Code(aFc1oSDK.getCurrencyIso4217Code);
                        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
                        currencyIso4217Code.put("payloadKey", list2);
                        AFc1hSDK aFc1hSDK = aFc1oSDK.getMonetizationNetwork;
                        if (aFc1hSDK != null) {
                            aFc1hSDK.AFAdRevenueData(aFc1oSDK.getCurrencyIso4217Code);
                        }
                        uri = uriQ_;
                        break;
                    }
                }
            }
        } else {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        }
        if (data != null) {
            AFj1iSDK aFj1iSDK = new AFj1iSDK(intent);
            if (!aFj1iSDK.getMediationNetwork("af_consumed")) {
                aFj1iSDK.K_("af_consumed", System.currentTimeMillis());
                o_(aFc1oSDK, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.afInfoLog(sb2.toString());
            return false;
        }
        if (data2 != null) {
            AFj1iSDK aFj1iSDK2 = new AFj1iSDK(this.getRevenue);
            if (!aFj1iSDK2.getMediationNetwork("af_consumed")) {
                aFj1iSDK2.K_("af_consumed", System.currentTimeMillis());
                o_(aFc1oSDK, data2);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb3.append(data2.toString());
            sb3.append(" w/af_consumed");
            AFLogger.afInfoLog(sb3.toString());
            return false;
        }
        if (uri == null) {
            AFLogger.afDebugLog("No deep link detected");
            return false;
        }
        AFj1iSDK aFj1iSDK3 = new AFj1iSDK(intent);
        if (!aFj1iSDK3.getMediationNetwork("af_consumed")) {
            aFj1iSDK3.K_("af_consumed", System.currentTimeMillis());
            o_(aFc1oSDK, uri);
            return true;
        }
        StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb4.append(uri.toString());
        sb4.append(" w/af_consumed");
        AFLogger.afInfoLog(sb4.toString());
        return false;
    }

    private Uri q_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e2) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e2);
                return null;
            }
        }
        return null;
    }

    public final void AFAdRevenueData(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getMonetizationNetwork != null) {
            try {
                try {
                    DeepLink monetizationNetwork = DeepLink.getMonetizationNetwork(map);
                    monetizationNetwork.getMediationNetwork.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(monetizationNetwork, null);
                } catch (JSONException e2) {
                    AFLogger.INSTANCE.e(AFh1vSDK.DDL, "Error occurred", e2, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                getMonetizationNetwork(deepLinkResult);
                return;
            } catch (Throwable th) {
                getMonetizationNetwork(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getMonetizationNetwork;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    public final void getMonetizationNetwork(DeepLinkResult deepLinkResult) {
        if (this.getMonetizationNetwork == null) {
            AFLogger.INSTANCE.d(AFh1vSDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.DDL;
        StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        aFLogger.d(aFh1vSDK, sb.toString());
        try {
            this.getMonetizationNetwork.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th);
        }
    }

    public final void n_(AFc1oSDK aFc1oSDK, Intent intent, Context context) {
        AFd1oSDK aFd1oSDK = (AFd1oSDK) this.areAllFieldsValid;
        if (context != null) {
            aFd1oSDK.getCurrencyIso4217Code.AFAdRevenueData = context.getApplicationContext();
        }
        if (!p_(intent, aFc1oSDK) && this.getMonetizationNetwork != null && this.areAllFieldsValid.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.getRevenue().getMediationNetwork("ddl_sent")) {
            AFc1qSDK aFc1qSDK = new AFc1qSDK();
            AFe1aSDK aFe1aSDKCopy = this.areAllFieldsValid.copy();
            aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(new AFf1iSDK(aFc1qSDK, this.areAllFieldsValid)));
        }
        this.areAllFieldsValid.getRevenue().getRevenue("ddl_sent", true);
    }

    public final void o_(AFc1oSDK aFc1oSDK, Uri uri) {
        AFf1kSDK aFf1kSDK = new AFf1kSDK(this, aFc1oSDK, uri, this.component4);
        AFe1aSDK aFe1aSDKCopy = this.areAllFieldsValid.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(aFf1kSDK));
        this.getRevenue = null;
    }

    public final void r_(AFc1oSDK aFc1oSDK, Uri uri, Uri uri2) {
        if (!aFc1oSDK.getMonetizationNetwork("af_deeplink")) {
            String string = uri.toString();
            if (string == null) {
                string = null;
            } else if (string.matches("fb\\d*?://authorize.*") && string.contains("access_token")) {
                int iIndexOf = string.indexOf(63);
                String strSubstring = iIndexOf == -1 ? "" : string.substring(iIndexOf);
                if (strSubstring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (strSubstring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(strSubstring.split("&")));
                    } else {
                        arrayList.add(strSubstring);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb.length() != 0) {
                                sb.append("&");
                            } else if (!str.startsWith("?")) {
                                sb.append("?");
                            }
                            sb.append(str);
                        }
                    }
                    string = string.replace(strSubstring, sb.toString());
                }
            }
            String str2 = this.getMediationNetwork;
            if (str2 != null && this.getCurrencyIso4217Code != null && string.contains(str2)) {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                string = builderBuildUpon.build().toString();
                String encodedQuery = builderBuildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFc1oSDK.getCurrencyIso4217Code.put("appended_query_params", encodedQuery);
                AFc1hSDK aFc1hSDK = aFc1oSDK.getMonetizationNetwork;
                if (aFc1hSDK != null) {
                    aFc1hSDK.AFAdRevenueData(aFc1oSDK.getCurrencyIso4217Code);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFc1oSDK.getCurrencyIso4217Code.put("af_deeplink", string);
            AFc1hSDK aFc1hSDK2 = aFc1oSDK.getMonetizationNetwork;
            if (aFc1hSDK2 != null) {
                aFc1hSDK2.AFAdRevenueData(aFc1oSDK.getCurrencyIso4217Code);
            }
        }
        final HashMap map = new HashMap();
        map.put("link", uri.toString());
        if (uri2 != null) {
            map.put("original_link", uri2.toString());
        }
        AFb1qSDK.d_(this.areAllFieldsValid.values().AFAdRevenueData, map, uri);
        AFf1lSDK aFf1lSDK = new AFf1lSDK(this.areAllFieldsValid, UUID.randomUUID(), uri);
        if (aFf1lSDK.copy()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFc1oSDK.getCurrencyIso4217Code.put("isBrandedDomain", bool);
            AFc1hSDK aFc1hSDK3 = aFc1oSDK.getMonetizationNetwork;
            if (aFc1hSDK3 != null) {
                aFc1hSDK3.AFAdRevenueData(aFc1oSDK.getCurrencyIso4217Code);
            }
        }
        if (!aFf1lSDK.equals()) {
            this.areAllFieldsValid.d().AFAdRevenueData(map);
            return;
        }
        aFf1lSDK.component3 = new AFf1lSDK.AFa1uSDK() { // from class: com.appsflyer.internal.AFc1kSDK.4
            @Override // com.appsflyer.internal.AFf1lSDK.AFa1uSDK
            public final void getCurrencyIso4217Code(String str3) {
                AFc1kSDK.this.getMonetizationNetwork(str3, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1lSDK.AFa1uSDK
            public final void getRevenue(Map<String, String> map2) {
                for (String str3 : map2.keySet()) {
                    map.put(str3, map2.get(str3));
                }
                AFc1kSDK.this.AFAdRevenueData(map);
            }
        };
        AFe1aSDK aFe1aSDKCopy = this.areAllFieldsValid.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(aFf1lSDK));
    }

    public final void getMonetizationNetwork(String str, DeepLinkResult.Error error) {
        if (this.getMonetizationNetwork == null) {
            getMediationNetwork(str);
        } else {
            AFLogger.INSTANCE.d(AFh1vSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getMonetizationNetwork(new DeepLinkResult(null, error));
        }
    }
}
