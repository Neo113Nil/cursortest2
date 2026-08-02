package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AFe1jSDK extends AFe1fSDK<String> {
    private final AFe1pSDK component2;
    private final AFc1qSDK copy;
    private final Map<String, Object> copydefault;
    private final AFc1oSDK equals;
    private final AFg1nSDK hashCode;
    private final AFf1fSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1jSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1zSDK aFd1zSDK, String str, Map<String, ? extends Object> map) {
        super(aFe1pSDK, aFe1pSDKArr, aFd1zSDK, null);
        aFe1pSDK.getClass();
        aFe1pSDKArr.getClass();
        aFd1zSDK.getClass();
        map.getClass();
        this.component2 = aFe1pSDK;
        this.copydefault = map;
        AFc1oSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        AFAdRevenueData.getClass();
        this.equals = AFAdRevenueData;
        AFc1qSDK component4 = aFd1zSDK.component4();
        component4.getClass();
        this.copy = component4;
        AFg1nSDK component3 = aFd1zSDK.component3();
        component3.getClass();
        this.hashCode = component3;
        AFf1fSDK afDebugLog = aFd1zSDK.afDebugLog();
        afDebugLog.getClass();
        this.toString = afDebugLog;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<String> AFAdRevenueData(String str) {
        AFd1bSDK aFd1bSDK;
        str.getClass();
        Map<String, Object> mutableMap = MapsKt__MapsKt.toMutableMap(this.copydefault);
        String currencyIso4217Code = getCurrencyIso4217Code(mutableMap);
        String monetizationNetwork = getMonetizationNetwork(mutableMap);
        Map<String, Object> linkedHashMap = new LinkedHashMap<>(mutableMap);
        getMonetizationNetwork(linkedHashMap, currencyIso4217Code);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String areAllFieldsValid = this.equals.areAllFieldsValid();
        if (areAllFieldsValid != null && !StringsKt.isBlank(areAllFieldsValid)) {
            linkedHashMap2.put("advertising_id", areAllFieldsValid);
        }
        AFb1jSDK mediationNetwork = AFb1lSDK.getMediationNetwork(this.equals.getCurrencyIso4217Code.getMonetizationNetwork);
        String str2 = null;
        String str3 = mediationNetwork != null ? mediationNetwork.getRevenue : null;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            linkedHashMap2.put("oaid", str3);
        }
        AFb1jSDK l_ = AFb1lSDK.l_(this.equals.getCurrencyIso4217Code.getMonetizationNetwork.getContentResolver());
        String str4 = l_ != null ? l_.getRevenue : null;
        if (str4 != null && !StringsKt.isBlank(str4)) {
            linkedHashMap2.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            linkedHashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String monetizationNetwork2 = ((AFe1fSDK) this).component1.getMonetizationNetwork(this.copy);
            if (monetizationNetwork2 != null && !StringsKt.isBlank(monetizationNetwork2)) {
                linkedHashMap2.put("imei", monetizationNetwork2);
            }
        }
        String currencyIso4217Code2 = AFb1kSDK.getCurrencyIso4217Code(this.equals.getMediationNetwork);
        if (currencyIso4217Code2 == null) {
            currencyIso4217Code2 = "";
        }
        linkedHashMap2.put("appsflyer_id", currencyIso4217Code2);
        linkedHashMap2.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap2.put("sdk_version", "6.17.5");
        if (monetizationNetwork != null && !StringsKt.isBlank(monetizationNetwork)) {
            linkedHashMap2.put("sdk_connector_version", monetizationNetwork);
        }
        this.hashCode.getMediationNetwork(linkedHashMap2, this.component2);
        linkedHashMap.put("device_data", linkedHashMap2);
        this.toString.getCurrencyIso4217Code(linkedHashMap, this.component2);
        AFd1hSDK<String> revenue = getRevenue(linkedHashMap, str, currencyIso4217Code);
        if (revenue != null && (aFd1bSDK = revenue.getMonetizationNetwork) != null) {
            str2 = aFd1bSDK.getMediationNetwork;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            AFg1aSDK.getRevenue(toString() + ": preparing data: ", jSONObject);
            AFd1oSDK aFd1oSDK = this.component3;
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            aFd1oSDK.getRevenue(str2, jSONObject2);
        }
        return revenue;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AppsFlyerRequestListener component2() {
        return null;
    }

    public boolean component3() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return true;
    }

    public String getCurrencyIso4217Code(Map<String, Object> map) {
        map.getClass();
        return null;
    }

    public void getMonetizationNetwork(Map<String, Object> map, String str) {
        map.getClass();
        map.put("app_id", this.equals.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName());
        String revenue = AFc1oSDK.getRevenue();
        if (revenue != null) {
            map.put("cuid", revenue);
        }
        map.put("app_version_name", this.equals.n_().versionName);
        if (component3()) {
            map.put("event_timestamp", Long.valueOf(this.hashCode.getCurrencyIso4217Code()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    public abstract AFd1hSDK<String> getRevenue(Map<String, Object> map, String str, String str2);

    public String getMonetizationNetwork(Map<String, Object> map) {
        map.getClass();
        return null;
    }
}
