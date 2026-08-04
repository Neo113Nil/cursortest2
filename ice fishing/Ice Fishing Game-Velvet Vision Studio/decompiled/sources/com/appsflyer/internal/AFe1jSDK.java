package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.gamericefishpro.space.ph.m0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
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
        Intrinsics.checkNotNullParameter(aFe1pSDK, "");
        Intrinsics.checkNotNullParameter(aFe1pSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component2 = aFe1pSDK;
        this.copydefault = map;
        AFc1oSDK aFc1oSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFc1oSDKAFAdRevenueData, "");
        this.equals = aFc1oSDKAFAdRevenueData;
        AFc1qSDK aFc1qSDKComponent4 = aFd1zSDK.component4();
        Intrinsics.checkNotNullExpressionValue(aFc1qSDKComponent4, "");
        this.copy = aFc1qSDKComponent4;
        AFg1nSDK aFg1nSDKComponent3 = aFd1zSDK.component3();
        Intrinsics.checkNotNullExpressionValue(aFg1nSDKComponent3, "");
        this.hashCode = aFg1nSDKComponent3;
        AFf1fSDK aFf1fSDKAfDebugLog = aFd1zSDK.afDebugLog();
        Intrinsics.checkNotNullExpressionValue(aFf1fSDKAfDebugLog, "");
        this.toString = aFf1fSDKAfDebugLog;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<String> AFAdRevenueData(String str) {
        AFd1bSDK aFd1bSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mapI = m0.i(this.copydefault);
        String currencyIso4217Code = getCurrencyIso4217Code(mapI);
        String monetizationNetwork = getMonetizationNetwork(mapI);
        Map<String, Object> mapI2 = m0.i(mapI);
        getMonetizationNetwork(mapI2, currencyIso4217Code);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strAreAllFieldsValid = this.equals.areAllFieldsValid();
        if (strAreAllFieldsValid != null && !StringsKt.u(strAreAllFieldsValid)) {
            linkedHashMap.put("advertising_id", strAreAllFieldsValid);
        }
        AFb1jSDK mediationNetwork = AFb1lSDK.getMediationNetwork(this.equals.getCurrencyIso4217Code.getMonetizationNetwork);
        String str2 = null;
        String str3 = mediationNetwork != null ? mediationNetwork.getRevenue : null;
        if (str3 != null && !StringsKt.u(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1jSDK aFb1jSDKL_ = AFb1lSDK.l_(this.equals.getCurrencyIso4217Code.getMonetizationNetwork.getContentResolver());
        String str4 = aFb1jSDKL_ != null ? aFb1jSDKL_.getRevenue : null;
        if (str4 != null && !StringsKt.u(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            mapI2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String monetizationNetwork2 = ((AFe1fSDK) this).component1.getMonetizationNetwork(this.copy);
            if (monetizationNetwork2 != null && !StringsKt.u(monetizationNetwork2)) {
                linkedHashMap.put("imei", monetizationNetwork2);
            }
        }
        String currencyIso4217Code2 = AFb1kSDK.getCurrencyIso4217Code(this.equals.getMediationNetwork);
        if (currencyIso4217Code2 == null) {
            currencyIso4217Code2 = "";
        }
        linkedHashMap.put("appsflyer_id", currencyIso4217Code2);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.17.5");
        if (monetizationNetwork != null && !StringsKt.u(monetizationNetwork)) {
            linkedHashMap.put("sdk_connector_version", monetizationNetwork);
        }
        this.hashCode.getMediationNetwork(linkedHashMap, this.component2);
        mapI2.put("device_data", linkedHashMap);
        this.toString.getCurrencyIso4217Code(mapI2, this.component2);
        AFd1hSDK<String> revenue = getRevenue(mapI2, str, currencyIso4217Code);
        if (revenue != null && (aFd1bSDK = revenue.getMonetizationNetwork) != null) {
            str2 = aFd1bSDK.getMediationNetwork;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(mapI2);
            AFg1aSDK.getRevenue(toString() + ": preparing data: ", jSONObject);
            AFd1oSDK aFd1oSDK = this.component3;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            aFd1oSDK.getRevenue(str2, string);
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
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public String getMonetizationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public abstract AFd1hSDK<String> getRevenue(Map<String, Object> map, String str, String str2);

    public void getMonetizationNetwork(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
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
}
