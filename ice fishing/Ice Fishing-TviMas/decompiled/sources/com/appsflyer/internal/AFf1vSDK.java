package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.facebook.internal.ServerProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class AFf1vSDK extends AFf1oSDK<String> {
    private final AFf1zSDK component3;
    private final Map<String, Object> copy;
    private final AFg1kSDK copydefault;
    private final AFd1rSDK equals;
    private final AFd1qSDK hashCode;
    private final AFg1tSDK toString;

    public abstract AFe1tSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2);

    protected String AFAdRevenueData(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    protected boolean component4() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final boolean copydefault() {
        return true;
    }

    protected String getMediationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

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
        AFg1kSDK component1 = aFd1kSDK.component1();
        Intrinsics.checkNotNullExpressionValue(component1, "");
        this.copydefault = component1;
        AFg1tSDK v = aFd1kSDK.v();
        Intrinsics.checkNotNullExpressionValue(v, "");
        this.toString = v;
    }

    protected void AFAdRevenueData(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.hashCode.getMonetizationNetwork.AFAdRevenueData.getPackageName());
        String AFAdRevenueData = AFd1qSDK.AFAdRevenueData();
        if (AFAdRevenueData != null) {
            map.put("cuid", AFAdRevenueData);
        }
        AFd1qSDK aFd1qSDK = this.hashCode;
        map.put("app_version_name", AFb1qSDK.getMediationNetwork(aFd1qSDK.getMonetizationNetwork.AFAdRevenueData, aFd1qSDK.getMonetizationNetwork.AFAdRevenueData.getPackageName()));
        if (component4()) {
            map.put("event_timestamp", Long.valueOf(this.copydefault.getCurrencyIso4217Code()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final AFe1tSDK<String> getMediationNetwork(String str) {
        AFe1mSDK aFe1mSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(this.copy);
        String AFAdRevenueData = AFAdRevenueData(mutableMap);
        String mediationNetwork = getMediationNetwork(mutableMap);
        Map<String, Object> mutableMap2 = MapsKt.toMutableMap(mutableMap);
        AFAdRevenueData(mutableMap2, AFAdRevenueData);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String monetizationNetwork = this.hashCode.getMonetizationNetwork();
        String str2 = monetizationNetwork;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            linkedHashMap.put("advertising_id", monetizationNetwork);
        }
        AFb1tSDK currencyIso4217Code = AFb1vSDK.getCurrencyIso4217Code(this.hashCode.getMonetizationNetwork.AFAdRevenueData);
        String str3 = null;
        String str4 = currencyIso4217Code != null ? currencyIso4217Code.getRevenue : null;
        String str5 = str4;
        if (str5 != null && !StringsKt.isBlank(str5)) {
            linkedHashMap.put("oaid", str4);
        }
        AFb1tSDK b_ = AFb1vSDK.b_(this.hashCode.getMonetizationNetwork.AFAdRevenueData.getContentResolver());
        String str6 = b_ != null ? b_.getRevenue : null;
        String str7 = str6;
        if (str7 != null && !StringsKt.isBlank(str7)) {
            linkedHashMap.put("amazon_aid", str6);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            mutableMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        } else {
            String revenue = this.component1.getRevenue(this.equals);
            String str8 = revenue;
            if (str8 != null && !StringsKt.isBlank(str8)) {
                linkedHashMap.put("imei", revenue);
            }
        }
        AFd1qSDK aFd1qSDK = this.hashCode;
        String currencyIso4217Code2 = AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue);
        if (currencyIso4217Code2 == null) {
            currencyIso4217Code2 = "";
        }
        linkedHashMap.put("appsflyer_id", currencyIso4217Code2);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.15.2");
        String str9 = mediationNetwork;
        if (str9 != null && !StringsKt.isBlank(str9)) {
            linkedHashMap.put("sdk_connector_version", mediationNetwork);
        }
        mutableMap2.put("device_data", linkedHashMap);
        this.toString.AFAdRevenueData(mutableMap2, this.component3);
        AFe1tSDK<String> AFAdRevenueData2 = AFAdRevenueData(mutableMap2, str, AFAdRevenueData);
        if (AFAdRevenueData2 != null && (aFe1mSDK = AFAdRevenueData2.getRevenue) != null) {
            str3 = aFe1mSDK.getMediationNetwork;
        }
        if (str3 != null) {
            JSONObject jSONObject = new JSONObject(mutableMap2);
            AFb1bSDK.getCurrencyIso4217Code(toString() + ": preparing data: ", jSONObject);
            AFb1cSDK aFb1cSDK = ((AFf1oSDK) this).areAllFieldsValid;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            aFb1cSDK.getMediationNetwork(str3, jSONObject2);
        }
        return AFAdRevenueData2;
    }
}
