package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1oSDK {
    public String AFAdRevenueData;
    public final AFc1fSDK areAllFieldsValid;
    public long component1;
    public String[] component4;
    public Intent getCurrencyIso4217Code;
    public DeepLinkListener getMonetizationNetwork;
    public Map<String, String> getRevenue;

    @NonNull
    public List<List<String>> getMediationNetwork = new ArrayList();

    @NonNull
    public final List<String> component3 = new ArrayList();

    public AFa1oSDK(@NonNull AFc1fSDK aFc1fSDK) {
        this.areAllFieldsValid = aFc1fSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:42:0x0047->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean g_(Intent intent, AFa1kSDK aFa1kSDK) {
        String string;
        Uri h_;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.getCurrencyIso4217Code;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent == null) {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        } else {
            Bundle extras = intent.getExtras();
            if (!this.getMediationNetwork.isEmpty() && extras != null) {
                Iterator<List<String>> it = this.getMediationNetwork.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List<String> next = it.next();
                    if (next != null) {
                        Iterator<String> it2 = next.iterator();
                        if (it2.hasNext() && (string = extras.getString(it2.next())) != null) {
                            h_ = h_(string, it2);
                            if (h_ == null) {
                                StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                                sb.append(next.toString());
                                AFLogger.afDebugLog(sb.toString());
                                List<List<String>> list = this.getMediationNetwork;
                                Map<String, Object> AFAdRevenueData = AFa1zSDK.AFAdRevenueData(aFa1kSDK.getCurrencyIso4217Code);
                                AFAdRevenueData.getClass();
                                AFAdRevenueData.put("payloadKey", list);
                                AFa1lSDK aFa1lSDK = aFa1kSDK.getMonetizationNetwork;
                                if (aFa1lSDK != null) {
                                    aFa1lSDK.getMonetizationNetwork(aFa1kSDK.getCurrencyIso4217Code);
                                }
                                uri = h_;
                            }
                        }
                    }
                    h_ = null;
                    if (h_ == null) {
                    }
                }
            }
        }
        if (data != null) {
            AFj1pSDK aFj1pSDK = new AFj1pSDK(intent);
            if (!aFj1pSDK.AFAdRevenueData("af_consumed")) {
                aFj1pSDK.G_("af_consumed", System.currentTimeMillis());
                f_(aFa1kSDK, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.afInfoLog(sb2.toString());
            return false;
        }
        if (data2 != null) {
            AFj1pSDK aFj1pSDK2 = new AFj1pSDK(this.getCurrencyIso4217Code);
            if (!aFj1pSDK2.AFAdRevenueData("af_consumed")) {
                aFj1pSDK2.G_("af_consumed", System.currentTimeMillis());
                f_(aFa1kSDK, data2);
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
        AFj1pSDK aFj1pSDK3 = new AFj1pSDK(intent);
        if (!aFj1pSDK3.AFAdRevenueData("af_consumed")) {
            aFj1pSDK3.G_("af_consumed", System.currentTimeMillis());
            f_(aFa1kSDK, uri);
            return true;
        }
        StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb4.append(uri.toString());
        sb4.append(" w/af_consumed");
        AFLogger.afInfoLog(sb4.toString());
        return false;
    }

    private static void getMonetizationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1zSDK.getMonetizationNetwork().getRevenue;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    private Uri h_(Object obj, Iterator<String> it) {
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

    public final void AFAdRevenueData(String str, DeepLinkResult.Error error) {
        if (this.getMonetizationNetwork == null) {
            getMonetizationNetwork(str);
        } else {
            AFLogger.INSTANCE.d(AFh1zSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getCurrencyIso4217Code(new DeepLinkResult(null, error));
        }
    }

    public final void e_(AFa1kSDK aFa1kSDK, Intent intent, Context context) {
        AFc1gSDK aFc1gSDK = (AFc1gSDK) this.areAllFieldsValid;
        if (context != null) {
            aFc1gSDK.AFAdRevenueData.getMonetizationNetwork = context.getApplicationContext();
        }
        if (!g_(intent, aFa1kSDK) && this.getMonetizationNetwork != null && this.areAllFieldsValid.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.component1().AFAdRevenueData("ddl_sent", false)) {
            AFa1pSDK aFa1pSDK = new AFa1pSDK();
            AFe1sSDK equals = this.areAllFieldsValid.equals();
            equals.getRevenue.execute(equals.new AnonymousClass3(new AFf1zSDK(aFa1pSDK, this.areAllFieldsValid)));
        }
        this.areAllFieldsValid.component1().getCurrencyIso4217Code("ddl_sent", true);
    }

    public final void f_(AFa1kSDK aFa1kSDK, Uri uri) {
        AFf1wSDK aFf1wSDK = new AFf1wSDK(this, aFa1kSDK, uri, this.component3);
        AFe1sSDK equals = this.areAllFieldsValid.equals();
        equals.getRevenue.execute(equals.new AnonymousClass3(aFf1wSDK));
        this.getCurrencyIso4217Code = null;
    }

    public final void getCurrencyIso4217Code(DeepLinkResult deepLinkResult) {
        if (this.getMonetizationNetwork == null) {
            AFLogger.INSTANCE.d(AFh1zSDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.DDL;
        StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        aFLogger.d(aFh1zSDK, sb.toString());
        try {
            this.getMonetizationNetwork.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th);
        }
    }

    public final void getMediationNetwork(Map<String, String> map) {
        if (this.getMonetizationNetwork != null) {
            try {
                try {
                    DeepLink monetizationNetwork = DeepLink.getMonetizationNetwork(map);
                    monetizationNetwork.getMediationNetwork.put("is_deferred", false);
                    getCurrencyIso4217Code(new DeepLinkResult(monetizationNetwork, null));
                    return;
                } catch (JSONException e) {
                    AFLogger.INSTANCE.e(AFh1zSDK.DDL, "Error occurred", e, true);
                    getCurrencyIso4217Code(new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED));
                    return;
                }
            } catch (Throwable th) {
                getCurrencyIso4217Code(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1zSDK.getMonetizationNetwork().getRevenue;
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

    public final void i_(AFa1kSDK aFa1kSDK, Uri uri, Uri uri2) {
        if (!aFa1kSDK.getRevenue("af_deeplink")) {
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
            String str2 = this.AFAdRevenueData;
            if (str2 != null && this.getRevenue != null && obj.contains(str2)) {
                Uri.Builder buildUpon = Uri.parse(obj).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getRevenue.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                obj = buildUpon.build().toString();
                aFa1kSDK.getCurrencyIso4217Code.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                AFa1lSDK aFa1lSDK = aFa1kSDK.getMonetizationNetwork;
                if (aFa1lSDK != null) {
                    aFa1lSDK.getMonetizationNetwork(aFa1kSDK.getCurrencyIso4217Code);
                }
            }
            aFa1kSDK.getCurrencyIso4217Code.put("af_deeplink", obj);
            AFa1lSDK aFa1lSDK2 = aFa1kSDK.getMonetizationNetwork;
            if (aFa1lSDK2 != null) {
                aFa1lSDK2.getMonetizationNetwork(aFa1kSDK.getCurrencyIso4217Code);
            }
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            hashMap.put("original_link", uri2.toString());
        }
        AFj1nSDK.K_(this.areAllFieldsValid.AFLogger().getMonetizationNetwork, hashMap, uri);
        AFe1aSDK aFe1aSDK = new AFe1aSDK(this.areAllFieldsValid, UUID.randomUUID(), uri);
        if (aFe1aSDK.equals()) {
            aFa1kSDK.getCurrencyIso4217Code.put("isBrandedDomain", Boolean.TRUE);
            AFa1lSDK aFa1lSDK3 = aFa1kSDK.getMonetizationNetwork;
            if (aFa1lSDK3 != null) {
                aFa1lSDK3.getMonetizationNetwork(aFa1kSDK.getCurrencyIso4217Code);
            }
        }
        if (!aFe1aSDK.copy()) {
            this.areAllFieldsValid.e().getMediationNetwork(hashMap);
            return;
        }
        aFe1aSDK.component1 = new AFe1aSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFa1oSDK.5
            @Override // com.appsflyer.internal.AFe1aSDK.AFa1ySDK
            public final void getMediationNetwork(Map<String, String> map) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3));
                }
                AFa1oSDK.this.getMediationNetwork(hashMap);
            }

            @Override // com.appsflyer.internal.AFe1aSDK.AFa1ySDK
            public final void getMonetizationNetwork(String str3) {
                AFa1oSDK.this.AFAdRevenueData(str3, DeepLinkResult.Error.NETWORK);
            }
        };
        AFe1sSDK equals = this.areAllFieldsValid.equals();
        equals.getRevenue.execute(equals.new AnonymousClass3(aFe1aSDK));
    }
}
