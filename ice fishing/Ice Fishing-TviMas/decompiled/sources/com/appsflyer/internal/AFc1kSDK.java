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
import com.appsflyer.internal.AFf1lSDK;
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

/* loaded from: classes4.dex */
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

    public final void n_(AFc1oSDK aFc1oSDK, Intent intent, Context context) {
        AFd1oSDK aFd1oSDK = (AFd1oSDK) this.areAllFieldsValid;
        if (context != null) {
            AFd1nSDK aFd1nSDK = aFd1oSDK.getCurrencyIso4217Code;
            if (context != null) {
                aFd1nSDK.AFAdRevenueData = context.getApplicationContext();
            }
        }
        if (!p_(intent, aFc1oSDK) && this.getMonetizationNetwork != null && this.areAllFieldsValid.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.getRevenue().getMediationNetwork("ddl_sent")) {
            AFc1qSDK aFc1qSDK = new AFc1qSDK();
            AFe1aSDK copy = this.areAllFieldsValid.copy();
            copy.AFAdRevenueData.execute(copy.new AnonymousClass2(new AFf1iSDK(aFc1qSDK, this.areAllFieldsValid)));
        }
        this.areAllFieldsValid.getRevenue().getRevenue("ddl_sent", true);
    }

    public final void o_(AFc1oSDK aFc1oSDK, Uri uri) {
        AFf1kSDK aFf1kSDK = new AFf1kSDK(this, aFc1oSDK, uri, this.component4);
        AFe1aSDK copy = this.areAllFieldsValid.copy();
        copy.AFAdRevenueData.execute(copy.new AnonymousClass2(aFf1kSDK));
        this.getRevenue = null;
    }

    private Uri q_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    public final void getMonetizationNetwork(String str, DeepLinkResult.Error error) {
        if (this.getMonetizationNetwork != null) {
            AFLogger.INSTANCE.d(AFh1vSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getMonetizationNetwork(new DeepLinkResult(null, error));
        } else {
            getMediationNetwork(str);
        }
    }

    public final void AFAdRevenueData(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getMonetizationNetwork != null) {
            try {
                try {
                    DeepLink monetizationNetwork = DeepLink.getMonetizationNetwork(map);
                    monetizationNetwork.getMediationNetwork.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(monetizationNetwork, null);
                } catch (JSONException e) {
                    AFLogger.INSTANCE.e(AFh1vSDK.DDL, "Error occurred", e, true);
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
                AFLogger.afDebugLog(new StringBuilder("Calling onAppOpenAttribution with:\n").append(map.toString()).toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    public final void getMonetizationNetwork(DeepLinkResult deepLinkResult) {
        if (this.getMonetizationNetwork != null) {
            AFLogger.INSTANCE.d(AFh1vSDK.DDL, new StringBuilder("Calling onDeepLinking with:\n").append(deepLinkResult.toString()).toString());
            try {
                this.getMonetizationNetwork.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.INSTANCE.d(AFh1vSDK.DDL, "skipping, no callback registered");
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

    public final void r_(AFc1oSDK aFc1oSDK, Uri uri, Uri uri2) {
        if (!aFc1oSDK.getMonetizationNetwork("af_deeplink")) {
            String obj = uri.toString();
            if (obj == null) {
                obj = null;
            } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
                int indexOf = obj.indexOf(63);
                String substring = indexOf == -1 ? "" : obj.substring(indexOf);
                if (substring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (substring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(substring.split("&")));
                    } else {
                        arrayList.add(substring);
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
                    obj = obj.replace(substring, sb.toString());
                }
            }
            String str2 = this.getMediationNetwork;
            if (str2 != null && this.getCurrencyIso4217Code != null && obj.contains(str2)) {
                Uri.Builder buildUpon = Uri.parse(obj).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                obj = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFc1oSDK.getRevenue.put("appended_query_params", encodedQuery);
                AFc1hSDK aFc1hSDK = aFc1oSDK.getMonetizationNetwork;
                if (aFc1hSDK != null) {
                    aFc1hSDK.AFAdRevenueData(aFc1oSDK.getRevenue);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFc1oSDK.getRevenue.put("af_deeplink", obj);
            AFc1hSDK aFc1hSDK2 = aFc1oSDK.getMonetizationNetwork;
            if (aFc1hSDK2 != null) {
                aFc1hSDK2.AFAdRevenueData(aFc1oSDK.getRevenue);
            }
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            hashMap.put("original_link", uri2.toString());
        }
        AFb1qSDK.d_(this.areAllFieldsValid.values().AFAdRevenueData, hashMap, uri);
        AFf1lSDK aFf1lSDK = new AFf1lSDK(this.areAllFieldsValid, UUID.randomUUID(), uri);
        if (aFf1lSDK.copy()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFc1oSDK.getRevenue.put("isBrandedDomain", bool);
            AFc1hSDK aFc1hSDK3 = aFc1oSDK.getMonetizationNetwork;
            if (aFc1hSDK3 != null) {
                aFc1hSDK3.AFAdRevenueData(aFc1oSDK.getRevenue);
            }
        }
        if (!aFf1lSDK.equals()) {
            this.areAllFieldsValid.d().AFAdRevenueData(hashMap);
            return;
        }
        aFf1lSDK.component3 = new AFf1lSDK.AFa1uSDK() { // from class: com.appsflyer.internal.AFc1kSDK.4
            @Override // com.appsflyer.internal.AFf1lSDK.AFa1uSDK
            public final void getCurrencyIso4217Code(String str3) {
                AFc1kSDK.this.getMonetizationNetwork(str3, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1lSDK.AFa1uSDK
            public final void getRevenue(Map<String, String> map) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3));
                }
                AFc1kSDK.this.AFAdRevenueData(hashMap);
            }
        };
        AFe1aSDK copy = this.areAllFieldsValid.copy();
        copy.AFAdRevenueData.execute(copy.new AnonymousClass2(aFf1lSDK));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:42:0x0047->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean p_(Intent intent, AFc1oSDK aFc1oSDK) {
        String string;
        Uri q_;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.getRevenue;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent == null) {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        } else {
            Bundle extras = intent.getExtras();
            if (!this.AFAdRevenueData.isEmpty() && extras != null) {
                Iterator<List<String>> it = this.AFAdRevenueData.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List<String> next = it.next();
                    if (next != null) {
                        Iterator<String> it2 = next.iterator();
                        if (it2.hasNext() && (string = extras.getString(it2.next())) != null) {
                            q_ = q_(string, it2);
                            if (q_ == null) {
                                AFLogger.afDebugLog(new StringBuilder("Found deeplink in push payload at ").append(next.toString()).toString());
                                List<List<String>> list = this.AFAdRevenueData;
                                Intrinsics.checkNotNullParameter("payloadKey", "");
                                Map<String, Object> currencyIso4217Code = AFb1rSDK.getCurrencyIso4217Code(aFc1oSDK.getRevenue);
                                Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
                                currencyIso4217Code.put("payloadKey", list);
                                AFc1hSDK aFc1hSDK = aFc1oSDK.getMonetizationNetwork;
                                if (aFc1hSDK != null) {
                                    aFc1hSDK.AFAdRevenueData(aFc1oSDK.getRevenue);
                                }
                                uri = q_;
                            }
                        }
                    }
                    q_ = null;
                    if (q_ == null) {
                    }
                }
            }
        }
        if (data != null) {
            AFj1iSDK aFj1iSDK = new AFj1iSDK(intent);
            if (!aFj1iSDK.getMediationNetwork("af_consumed")) {
                aFj1iSDK.K_("af_consumed", System.currentTimeMillis());
                o_(aFc1oSDK, data);
                return true;
            }
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed deep link: ").append(data.toString()).append(" w/af_consumed").toString());
            return false;
        }
        if (data2 != null) {
            AFj1iSDK aFj1iSDK2 = new AFj1iSDK(this.getRevenue);
            if (!aFj1iSDK2.getMediationNetwork("af_consumed")) {
                aFj1iSDK2.K_("af_consumed", System.currentTimeMillis());
                o_(aFc1oSDK, data2);
                return true;
            }
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed trampoline deep link: ").append(data2.toString()).append(" w/af_consumed").toString());
            return false;
        }
        if (uri != null) {
            AFj1iSDK aFj1iSDK3 = new AFj1iSDK(intent);
            if (!aFj1iSDK3.getMediationNetwork("af_consumed")) {
                aFj1iSDK3.K_("af_consumed", System.currentTimeMillis());
                o_(aFc1oSDK, uri);
                return true;
            }
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed deep link from push: ").append(uri.toString()).append(" w/af_consumed").toString());
            return false;
        }
        AFLogger.afDebugLog("No deep link detected");
        return false;
    }
}
