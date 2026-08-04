package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFf1qSDK extends AFf1vSDK {
    private final AppsFlyerProperties component3;
    private final AFj1hSDK copy;
    private final Map<String, String> copydefault;
    private final AppsFlyerInAppPurchaseValidationCallback equals;
    private final AFPurchaseDetails toString;

    public static final class AFa1tSDK extends RuntimeException {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1qSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    private final void getMediationNetwork(String str, int i2) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.equals;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(d0.d(new Pair("error_code", Integer.valueOf(i2)), new Pair("error_message", str)));
        }
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final AFe1tSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        return ((AFf1oSDK) this).component2.getMonetizationNetwork(map, str);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        Object objC;
        String str;
        super.getRevenue();
        Throwable thComponent1 = component1();
        if (thComponent1 != null && !(thComponent1 instanceof AFf1ySDK)) {
            if (thComponent1 instanceof AFf1wSDK) {
                str = "No dev key";
            } else {
                str = thComponent1 instanceof AFa1tSDK ? "One or more of provided arguments is empty" : "Error while sending request to server";
            }
            getMediationNetwork(str, -1);
        }
        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.equals;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(d0.d(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                f.d dVar = f.f.f121a;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.equals;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1dSDK.AFAdRevenueData(new JSONObject((String) responseNetwork.getBody())));
                    objC = Unit.f157a;
                } else {
                    objC = null;
                }
            } catch (Throwable th) {
                f.d dVar2 = f.f.f121a;
                objC = a.c.c(th);
            }
            if (f.f.a(objC) != null) {
                getMediationNetwork("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1qSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1hSDK aFj1hSDK) {
        super(AFf1zSDK.MANUAL_PURCHASE_VALIDATION, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, null, d0.c());
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1hSDK, "");
        this.component3 = appsFlyerProperties;
        this.toString = aFPurchaseDetails;
        this.copydefault = map;
        this.equals = appsFlyerInAppPurchaseValidationCallback;
        this.copy = aFj1hSDK;
        this.getCurrencyIso4217Code.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final String AFAdRevenueData(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return this.copy.AFAdRevenueData();
    }

    public /* synthetic */ AFf1qSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1hSDK aFj1hSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i2 & 32) != 0 ? new AFj1gSDK() : aFj1hSDK);
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final void AFAdRevenueData(Map<String, Object> map, String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(map, "");
        super.AFAdRevenueData(map, str);
        List listB = kotlin.collections.o.b(this.toString.getPurchaseToken(), this.toString.getProductId(), this.toString.getPrice(), this.toString.getCurrency());
        boolean z2 = true;
        if (!(listB instanceof Collection) || !listB.isEmpty()) {
            Iterator it = listB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else {
                    if (((String) it.next()).length() == 0) {
                        z = true;
                        break;
                    }
                }
            }
        } else {
            z = false;
            break;
        }
        if (z) {
            throw new AFa1tSDK();
        }
        map.put("purchase_token", this.toString.getPurchaseToken());
        map.put("product_id", this.toString.getProductId());
        map.put("revenue", this.toString.getPrice());
        map.put("currency", this.toString.getCurrency());
        map.put("purchase_type", this.toString.getPurchaseType().getValue());
        Map<String, String> map2 = this.copydefault;
        if (!(map2 == null || map2.isEmpty())) {
            map.put("extra_event_values", this.copydefault);
        }
        String string = this.component3.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string != null && string.length() != 0) {
            z2 = false;
        }
        map.put("custom_data", z2 ? d0.c() : AFj1dSDK.AFAdRevenueData(new JSONObject(string)));
    }
}
