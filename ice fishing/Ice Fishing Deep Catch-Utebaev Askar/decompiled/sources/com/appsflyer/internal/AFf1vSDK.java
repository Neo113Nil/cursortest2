package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFf1vSDK extends AFf1oSDK<String> {
    private final AFf1zSDK component3;
    private final Map<String, Object> copy;
    private final AFg1kSDK copydefault;
    private final AFd1rSDK equals;
    private final AFd1qSDK hashCode;
    private final AFg1tSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1vSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str, Map<String, ? extends Object> map) {
        super(aFf1zSDK, aFf1zSDKArr, aFd1kSDK, null);
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1zSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component3 = aFf1zSDK;
        this.copy = map;
        AFd1qSDK mediationNetwork = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.hashCode = mediationNetwork;
        AFd1rSDK revenue = aFd1kSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.equals = revenue;
        AFg1kSDK aFg1kSDKComponent1 = aFd1kSDK.component1();
        Intrinsics.checkNotNullExpressionValue(aFg1kSDKComponent1, "");
        this.copydefault = aFg1kSDKComponent1;
        AFg1tSDK aFg1tSDKV = aFd1kSDK.v();
        Intrinsics.checkNotNullExpressionValue(aFg1tSDKV, "");
        this.toString = aFg1tSDKV;
    }

    public abstract AFe1tSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2);

    public String AFAdRevenueData(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public boolean component4() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return true;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<String> getMediationNetwork(String str) {
        AFe1mSDK aFe1mSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> map = this.copy;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map<String, Object> linkedHashMap = new LinkedHashMap<>(map);
        String strAFAdRevenueData = AFAdRevenueData(linkedHashMap);
        String mediationNetwork = getMediationNetwork(linkedHashMap);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Map<String, Object> linkedHashMap2 = new LinkedHashMap<>(linkedHashMap);
        AFAdRevenueData(linkedHashMap2, strAFAdRevenueData);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        String monetizationNetwork = this.hashCode.getMonetizationNetwork();
        boolean z = true;
        if (!(monetizationNetwork == null || kotlin.text.o.b(monetizationNetwork))) {
            linkedHashMap3.put("advertising_id", monetizationNetwork);
        }
        AFb1tSDK currencyIso4217Code = AFb1vSDK.getCurrencyIso4217Code(this.hashCode.getMonetizationNetwork.AFAdRevenueData);
        String str2 = null;
        String str3 = currencyIso4217Code != null ? currencyIso4217Code.getRevenue : null;
        if (!(str3 == null || kotlin.text.o.b(str3))) {
            linkedHashMap3.put("oaid", str3);
        }
        AFb1tSDK aFb1tSDKB_ = AFb1vSDK.b_(this.hashCode.getMonetizationNetwork.AFAdRevenueData.getContentResolver());
        String str4 = aFb1tSDKB_ != null ? aFb1tSDKB_.getRevenue : null;
        if (!(str4 == null || kotlin.text.o.b(str4))) {
            linkedHashMap3.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            linkedHashMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String revenue = this.component1.getRevenue(this.equals);
            if (!(revenue == null || kotlin.text.o.b(revenue))) {
                linkedHashMap3.put("imei", revenue);
            }
        }
        AFd1qSDK aFd1qSDK = this.hashCode;
        String currencyIso4217Code2 = AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue);
        if (currencyIso4217Code2 == null) {
            currencyIso4217Code2 = "";
        }
        linkedHashMap3.put("appsflyer_id", currencyIso4217Code2);
        linkedHashMap3.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap3.put("sdk_version", "6.15.2");
        if (mediationNetwork != null && !kotlin.text.o.b(mediationNetwork)) {
            z = false;
        }
        if (!z) {
            linkedHashMap3.put("sdk_connector_version", mediationNetwork);
        }
        linkedHashMap2.put("device_data", linkedHashMap3);
        this.toString.AFAdRevenueData(linkedHashMap2, this.component3);
        AFe1tSDK<String> aFe1tSDKAFAdRevenueData = AFAdRevenueData(linkedHashMap2, str, strAFAdRevenueData);
        if (aFe1tSDKAFAdRevenueData != null && (aFe1mSDK = aFe1tSDKAFAdRevenueData.getRevenue) != null) {
            str2 = aFe1mSDK.getMediationNetwork;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(linkedHashMap2);
            AFb1bSDK.getCurrencyIso4217Code(toString() + ": preparing data: ", jSONObject);
            AFb1cSDK aFb1cSDK = ((AFf1oSDK) this).areAllFieldsValid;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            aFb1cSDK.getMediationNetwork(str2, string);
        }
        return aFe1tSDKAFAdRevenueData;
    }

    public void AFAdRevenueData(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.hashCode.getMonetizationNetwork.AFAdRevenueData.getPackageName());
        String strAFAdRevenueData = AFd1qSDK.AFAdRevenueData();
        if (strAFAdRevenueData != null) {
            map.put("cuid", strAFAdRevenueData);
        }
        Context context = this.hashCode.getMonetizationNetwork.AFAdRevenueData;
        map.put("app_version_name", AFb1qSDK.getMediationNetwork(context, context.getPackageName()));
        if (component4()) {
            map.put("event_timestamp", Long.valueOf(this.copydefault.getCurrencyIso4217Code()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    public String getMediationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }
}
