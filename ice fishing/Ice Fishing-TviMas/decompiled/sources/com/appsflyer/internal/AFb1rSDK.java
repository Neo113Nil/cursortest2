package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatDelegate;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFd1eSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass2;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.GoogleApiAvailability;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFb1rSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static char[] AFInAppEventParameterName = null;
    private static boolean AFInAppEventType = false;
    private static AFb1rSDK component3 = null;
    private static int e = 1;
    static final String getCurrencyIso4217Code;
    static AppsFlyerInAppPurchaseValidatorListener getMediationNetwork;
    public static final String getRevenue;
    private static int registerClient;
    private static boolean valueOf;
    private static int values;
    private AFg1xSDK AFKeystoreWrapper;
    Application component4;
    private Map<Long, String> copy;
    private boolean equals;
    private SharedPreferences hashCode;
    private final AFd1oSDK toString;
    public volatile AppsFlyerConversionListener getMonetizationNetwork = null;
    private long component1 = -1;
    long areAllFieldsValid = -1;
    private long copydefault = TimeUnit.SECONDS.toMillis(5);
    boolean component2 = false;

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * (-716)) + (i2 * 1435) + ((i2 | i4) * (-1434));
        int i6 = ~i3;
        int i7 = ~(i6 | i2);
        int i8 = ~(i | i2);
        int i9 = i4 | (~i2);
        int i10 = i5 + ((i7 | i8 | (~(i9 | i3))) * 717) + ((i8 | (~(i9 | i6)) | (~(i2 | i3))) * 717);
        switch (i10) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                return getMediationNetwork(objArr);
            case 4:
                AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
                Context context = (Context) objArr[1];
                int i11 = 2 % 2;
                AFj1iSDK aFj1iSDK = new AFj1iSDK((Intent) objArr[2]);
                if (aFj1iSDK.AFAdRevenueData("appsflyer_preinstall") != null) {
                    AFAdRevenueData(aFj1iSDK.AFAdRevenueData("appsflyer_preinstall"));
                    int i12 = registerClient + 87;
                    e = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 2 % 4;
                    }
                }
                AFLogger.afInfoLog("****** onReceive called *******");
                AppsFlyerProperties.getInstance();
                String AFAdRevenueData2 = aFj1iSDK.AFAdRevenueData("referrer");
                AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(AFAdRevenueData2)));
                if (AFAdRevenueData2 == null) {
                    return null;
                }
                int i14 = e + 87;
                registerClient = i14 % 128;
                int i15 = i14 % 2;
                aFb1rSDK.getMonetizationNetwork(context).AFAdRevenueData("referrer", AFAdRevenueData2);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", AFAdRevenueData2);
                appsFlyerProperties.getCurrencyIso4217Code = AFAdRevenueData2;
                if (!AppsFlyerProperties.getInstance().getMonetizationNetwork()) {
                    return null;
                }
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                aFb1rSDK.getCurrencyIso4217Code(context, AFh1qSDK.onReceive);
                aFb1rSDK.getMonetizationNetwork(AFAdRevenueData2);
                return null;
            case 5:
                return getCurrencyIso4217Code(objArr);
            case 6:
                return getRevenue(objArr);
            case 7:
                return component3(objArr);
            case 8:
                int i16 = 2 % 2;
                ((AFb1rSDK) objArr[0]).getMonetizationNetwork().e().getMediationNetwork = new AFc1cSDK((String[]) objArr[1]);
                int i17 = registerClient + 57;
                e = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 9:
                AFb1rSDK aFb1rSDK2 = (AFb1rSDK) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                int i19 = 2 % 2;
                int i20 = e + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
                registerClient = i20 % 128;
                if (i20 % 2 != 0) {
                    AFb1cSDK copydefault = aFb1rSDK2.getMonetizationNetwork().copydefault();
                    String[] strArr = new String[1];
                    strArr[1] = String.valueOf(booleanValue);
                    copydefault.getMediationNetwork("setCollectAndroidID", strArr);
                } else {
                    aFb1rSDK2.getMonetizationNetwork().copydefault().getMediationNetwork("setCollectAndroidID", String.valueOf(booleanValue));
                }
                getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(booleanValue));
                getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(booleanValue));
                int i21 = e + 75;
                registerClient = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 10:
                AFb1rSDK aFb1rSDK3 = (AFb1rSDK) objArr[0];
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i23 = 2 % 2;
                AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(booleanValue2)));
                if (booleanValue2) {
                    int i24 = registerClient + 91;
                    e = i24 % 128;
                    int i25 = i24 % 2;
                } else {
                    int i26 = e + 87;
                    int i27 = i26 % 128;
                    registerClient = i27;
                    r8 = i26 % 2 == 0;
                    int i28 = i27 + 43;
                    e = i28 % 128;
                    int i29 = i28 % 2;
                }
                AFb1vSDK.getCurrencyIso4217Code = Boolean.valueOf(r8);
                AFd1kSDK monetizationNetwork = aFb1rSDK3.getMonetizationNetwork();
                monetizationNetwork.e().areAllFieldsValid = booleanValue2;
                if (booleanValue2) {
                    monetizationNetwork.e().component4 = null;
                    return null;
                }
                AFe1aSDK copy = monetizationNetwork.copy();
                copy.AFAdRevenueData.execute(copy.new AnonymousClass2(new AFf1pSDK(aFb1rSDK3.getMonetizationNetwork())));
                return null;
            case 11:
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objArr[0];
                long longValue = ((Number) objArr[1]).longValue();
                int i30 = 2 % 2;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                String format = simpleDateFormat.format(new Date(longValue));
                int i31 = registerClient + 11;
                e = i31 % 128;
                int i32 = i31 % 2;
                return format;
            case 12:
                return component4(objArr);
            case 13:
                return component2(objArr);
            case 14:
                return areAllFieldsValid(objArr);
            case 15:
                return component1(objArr);
            case 16:
                return equals(objArr);
            case 17:
                return toString(objArr);
            case 18:
                return copy(objArr);
            case 19:
                return hashCode(objArr);
            case 20:
                return copydefault(objArr);
            case 21:
                return values(objArr);
            case 22:
                AFb1rSDK aFb1rSDK4 = (AFb1rSDK) objArr[0];
                AFa1oSDK aFa1oSDK = (AFa1oSDK) objArr[1];
                int i33 = 2 % 2;
                int i34 = registerClient + 31;
                e = i34 % 128;
                int i35 = i34 % 2;
                r8 = aFa1oSDK.areAllFieldsValid == null;
                if (!(!aFb1rSDK4.AFAdRevenueData())) {
                    AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                    return null;
                }
                if (r8) {
                    int i36 = e + 73;
                    registerClient = i36 % 128;
                    if (i36 % 2 == 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                        AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                    } else if (aFb1rSDK4.component3()) {
                        AppsFlyerRequestListener appsFlyerRequestListener = aFa1oSDK.getMediationNetwork;
                        if (appsFlyerRequestListener == null) {
                            return null;
                        }
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        return null;
                    }
                    aFb1rSDK4.component1 = System.currentTimeMillis();
                }
                AFj1cSDK.getMonetizationNetwork(aFb1rSDK4.getMonetizationNetwork().AFAdRevenueData(), aFb1rSDK4.new AFa1tSDK(aFa1oSDK), 0L, TimeUnit.MILLISECONDS);
                return null;
            case 23:
                int i37 = 2 % 2;
                ((AFb1rSDK) objArr[0]).getRevenue(new AFh1lSDK());
                int i38 = e + 17;
                registerClient = i38 % 128;
                int i39 = i38 % 2;
                return null;
            default:
                String str = (String) objArr[0];
                int i40 = 2 % 2;
                int i41 = e + 35;
                registerClient = i41 % 128;
                int i42 = i41 % 2;
                boolean z = AppsFlyerProperties.getInstance().getBoolean(str, false);
                int i43 = registerClient + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
                e = i43 % 128;
                int i44 = i43 % 2;
                return Boolean.valueOf(z);
        }
    }

    static {
        areAllFieldsValid();
        getCurrencyIso4217Code = "331";
        AFAdRevenueData = "6.15";
        getRevenue = new StringBuilder().append("6.15").append("/androidevent?buildnumber=6.15.2&app_id=").toString();
        getMediationNetwork = null;
        component3 = new AFb1rSDK();
        int i = registerClient + 113;
        e = i % 128;
        if (i % 2 == 0) {
            int i2 = 41 / 0;
        }
    }

    public final AFd1kSDK getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 + 5;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
        AFd1oSDK aFd1oSDK = this.toString;
        int i5 = i2 + 17;
        registerClient = i5 % 128;
        int i6 = i5 % 2;
        return aFd1oSDK;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = registerClient + 51;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AFd1oSDK aFd1oSDK = aFb1rSDK.toString;
            if (context != null) {
                AFd1nSDK aFd1nSDK = aFd1oSDK.getCurrencyIso4217Code;
                if (context != null) {
                    aFd1nSDK.AFAdRevenueData = context.getApplicationContext();
                    int i3 = registerClient + 33;
                    e = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            return null;
        }
        AFd1oSDK aFd1oSDK2 = aFb1rSDK.toString;
        obj.hashCode();
        throw null;
    }

    private static void a(String str, String str2, int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = $11 + 61;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            int i5 = $10 + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArr3 = AFInAppEventParameterName;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = $11 + 47;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = $10 + 29;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[i9] = (char) (cArr3[i9] ^ 358767465314578885L);
            }
            cArr3 = cArr4;
        }
        int i12 = (int) (358767465314578885L ^ values);
        if (AFInAppEventType) {
            int i13 = $11 + 71;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            aFk1nSDK.AFAdRevenueData = bArr2.length;
            char[] cArr5 = new char[aFk1nSDK.AFAdRevenueData];
            aFk1nSDK.getRevenue = 0;
            while (aFk1nSDK.getRevenue < aFk1nSDK.AFAdRevenueData) {
                cArr5[aFk1nSDK.getRevenue] = (char) (cArr3[bArr2[(aFk1nSDK.AFAdRevenueData - 1) - aFk1nSDK.getRevenue] + i] - i12);
                aFk1nSDK.getRevenue++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!valueOf) {
            aFk1nSDK.AFAdRevenueData = iArr.length;
            char[] cArr6 = new char[aFk1nSDK.AFAdRevenueData];
            aFk1nSDK.getRevenue = 0;
            while (aFk1nSDK.getRevenue < aFk1nSDK.AFAdRevenueData) {
                cArr6[aFk1nSDK.getRevenue] = (char) (cArr3[iArr[(aFk1nSDK.AFAdRevenueData - 1) - aFk1nSDK.getRevenue] - i] - i12);
                aFk1nSDK.getRevenue++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i15 = $11 + 13;
        $10 = i15 % 128;
        int i16 = i15 % 2;
        aFk1nSDK.AFAdRevenueData = cArr2.length;
        char[] cArr7 = new char[aFk1nSDK.AFAdRevenueData];
        aFk1nSDK.getRevenue = 0;
        while (aFk1nSDK.getRevenue < aFk1nSDK.AFAdRevenueData) {
            cArr7[aFk1nSDK.getRevenue] = (char) (cArr3[cArr2[(aFk1nSDK.AFAdRevenueData - 1) - aFk1nSDK.getRevenue] - i] - i12);
            aFk1nSDK.getRevenue++;
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFf1bSDK aFf1bSDK) {
        int i = 2 % 2;
        int i2 = e + 43;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AFd1kSDK monetizationNetwork = getMonetizationNetwork();
        if (aFf1bSDK == AFf1bSDK.SUCCESS) {
            monetizationNetwork.afErrorLog().getCurrencyIso4217Code();
        }
        if (monetizationNetwork.copydefault().getCurrencyIso4217Code()) {
            monetizationNetwork.i().getMediationNetwork();
            return;
        }
        int i4 = registerClient + 7;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            monetizationNetwork.i().getCurrencyIso4217Code();
        } else {
            monetizationNetwork.i().getCurrencyIso4217Code();
            int i5 = 15 / 0;
        }
    }

    final synchronized AFg1xSDK getMediationNetwork() {
        AFg1xSDK aFg1xSDK;
        int i = 2 % 2;
        if (this.AFKeystoreWrapper == null) {
            int i2 = e + 37;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            this.AFKeystoreWrapper = new AFg1xSDK() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda1
                @Override // com.appsflyer.internal.AFg1xSDK
                public final void onRemoteConfigUpdateFinished(AFf1bSDK aFf1bSDK) {
                    AFb1rSDK.this.getCurrencyIso4217Code(aFf1bSDK);
                }
            };
            int i4 = 2 % 2;
        }
        aFg1xSDK = this.AFKeystoreWrapper;
        int i5 = registerClient + 119;
        e = i5 % 128;
        int i6 = i5 % 2;
        return aFg1xSDK;
    }

    public AFb1rSDK() {
        AFVersionDeclaration.init();
        this.toString = new AFd1oSDK();
        getMonetizationNetwork().i().getMediationNetwork();
        getMonetizationNetwork().i().AFAdRevenueData();
        AFe1aSDK copy = getMonetizationNetwork().copy();
        copy.getRevenue.add(new AFa1vSDK());
    }

    public static AFb1rSDK getRevenue() {
        int i = 2 % 2;
        int i2 = e + 11;
        registerClient = i2 % 128;
        if (i2 % 2 == 0) {
            return component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        int i = 2 % 2;
        int i2 = e + 101;
        int i3 = i2 % 128;
        registerClient = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (uri != null) {
                int i4 = i3 + 75;
                e = i4 % 128;
                if (i4 % 2 != 0) {
                    if (!uri.toString().isEmpty()) {
                        if (context == null) {
                            getMonetizationNetwork().d().getMonetizationNetwork(new StringBuilder("Context is \"").append(context).append("\"").toString(), DeepLinkResult.Error.NETWORK);
                            return;
                        } else {
                            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
                            getMonetizationNetwork().d().o_(AFc1oSDK.AFAdRevenueData(getMonetizationNetwork().afInfoLog()), Uri.parse(uri.toString()));
                            return;
                        }
                    }
                } else {
                    uri.toString().isEmpty();
                    obj.hashCode();
                    throw null;
                }
            }
            getMonetizationNetwork().d().getMonetizationNetwork(new StringBuilder("Link is \"").append(uri).append("\"").toString(), DeepLinkResult.Error.NETWORK);
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = 2 % 2;
        int i2 = registerClient + 91;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners(strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = 2 % 2;
        int i2 = e + 81;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            setSharingFilterForPartners("all");
        } else {
            setSharingFilterForPartners("all");
        }
        int i3 = e + 35;
        registerClient = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i = 2 % 2;
        int i2 = registerClient + 77;
        e = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        PurchaseHandler areAllFieldsValid = getMonetizationNetwork().areAllFieldsValid();
        if (areAllFieldsValid.getCurrencyIso4217Code(map, purchaseValidationCallback, "subscriptions")) {
            AFf1rSDK aFf1rSDK = new AFf1rSDK(map, purchaseValidationCallback, areAllFieldsValid.getRevenue);
            AFe1aSDK aFe1aSDK = areAllFieldsValid.getMediationNetwork;
            aFe1aSDK.AFAdRevenueData.execute(aFe1aSDK.new AnonymousClass2(aFf1rSDK));
        }
        int i4 = registerClient + 97;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i = 2 % 2;
        int i2 = e + 33;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        PurchaseHandler areAllFieldsValid = getMonetizationNetwork().areAllFieldsValid();
        if (areAllFieldsValid.getCurrencyIso4217Code(map, purchaseValidationCallback, "purchases")) {
            AFf1nSDK aFf1nSDK = new AFf1nSDK(map, purchaseValidationCallback, areAllFieldsValid.getRevenue);
            AFe1aSDK aFe1aSDK = areAllFieldsValid.getMediationNetwork;
            aFe1aSDK.AFAdRevenueData.execute(aFe1aSDK.new AnonymousClass2(aFf1nSDK));
        }
        int i4 = registerClient + 81;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        Map<String, String> map = (Map) objArr[2];
        int i = 2 % 2;
        int i2 = e + 119;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFc1kSDK d = aFb1rSDK.getMonetizationNetwork().d();
            d.getMediationNetwork = str;
            d.getCurrencyIso4217Code = map;
            int i3 = 1 / 0;
            return null;
        }
        AFc1kSDK d2 = aFb1rSDK.getMonetizationNetwork().d();
        d2.getMediationNetwork = str;
        d2.getCurrencyIso4217Code = map;
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = 2 % 2;
        int i2 = registerClient + 87;
        e = i2 % 128;
        int i3 = i2 % 2;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i4 = registerClient + 45;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        DeepLinkListener deepLinkListener = (DeepLinkListener) objArr[1];
        long longValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = registerClient + 101;
        e = i2 % 128;
        int i3 = i2 % 2;
        aFb1rSDK.getMonetizationNetwork().d().getMonetizationNetwork = deepLinkListener;
        aFb1rSDK.getMonetizationNetwork().d().component3 = longValue;
        int i4 = registerClient + 111;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i_(Context context, Intent intent) {
        Uri uri;
        boolean z;
        int i = 2 % 2;
        int i2 = registerClient + 13;
        e = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFc1kSDK d = getMonetizationNetwork().d();
        AFd1rSDK revenue = getMonetizationNetwork().getRevenue();
        Object obj = null;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            int i4 = registerClient + 11;
            e = i4 % 128;
            if (i4 % 2 == 0) {
                intent.getData();
                throw null;
            }
            uri = intent.getData();
        }
        if (uri == null || uri.toString().isEmpty()) {
            z = false;
        } else {
            int i5 = registerClient + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
            e = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (revenue.getMediationNetwork("ddl_sent") && !z) {
            d.getMonetizationNetwork("No direct deep link", null);
            return;
        }
        d.n_(AFc1oSDK.AFAdRevenueData(d.areAllFieldsValid.afInfoLog()), intent, context);
        int i7 = e + 31;
        registerClient = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        getMonetizationNetwork().d().getMonetizationNetwork("performOnDeepLinking was called with null intent", com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if (r6 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        getMonetizationNetwork().d().getMonetizationNetwork("performOnDeepLinking was called with null context", com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR);
        r5 = com.appsflyer.internal.AFb1rSDK.e + 7;
        com.appsflyer.internal.AFb1rSDK.registerClient = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r6 = r6.getApplicationContext();
        getCurrencyIso4217Code(new java.lang.Object[]{r4, r6}, -608775197, 608775214, java.lang.System.identityHashCode(r4));
        getMonetizationNetwork().getMonetizationNetwork().execute(new com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda0(r4, r6, r5));
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performOnDeepLinking(final Intent intent, Context context) {
        int i = 2 % 2;
        int i2 = e + 71;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = 2 % 2;
        int i2 = e + 35;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = getMonetizationNetwork().d().AFAdRevenueData;
        if (list.contains(asList)) {
            return;
        }
        int i4 = registerClient + 77;
        e = i4 % 128;
        int i5 = i4 % 2;
        list.add(asList);
        int i6 = registerClient + 121;
        e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 % 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r7.isEmpty() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        com.appsflyer.AFLogger.afDebugLog(new java.lang.StringBuilder("Setting partner data for ").append(r2).append(": ").append(r7).toString());
        r0 = new org.json.JSONObject(r7).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (r0 <= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r7 = new java.util.HashMap();
        r7.put("error", "limit exceeded: ".concat(java.lang.String.valueOf(r0)));
        r1.getRevenue.put(r2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        r1.getCurrencyIso4217Code.put(r2, r7);
        r1.getRevenue.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r7.isEmpty() != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object copy(Object[] objArr) {
        String concat;
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        Map map = (Map) objArr[2];
        int i = 2 % 2;
        AFd1tSDK e2 = aFb1rSDK.getMonetizationNetwork().e();
        if (e2.getMonetizationNetwork == null) {
            e2.getMonetizationNetwork = new AFc1aSDK();
        }
        AFc1aSDK aFc1aSDK = e2.getMonetizationNetwork;
        if (str == null || str.isEmpty()) {
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return null;
        }
        if (map != null) {
            int i2 = e + 31;
            registerClient = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 51 / 0;
            }
        }
        if (aFc1aSDK.getCurrencyIso4217Code.remove(str) == null) {
            int i4 = e + 125;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
            concat = "Partner data is missing or `null`";
        } else {
            concat = "Cleared partner data for ".concat(String.valueOf(str));
        }
        AFLogger.afWarnLog(concat);
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        int i = 2 % 2;
        int i2 = e + 87;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        AFAdRevenueData(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
        int i4 = registerClient + 71;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getMonetizationNetwork(JSONObject jSONObject) {
        String str;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    int i3 = e + 73;
                    registerClient = i3 % 128;
                    int i4 = i3 % 2;
                    arrayList.add(Long.valueOf(jSONArray.getLong(i2)));
                }
            } catch (JSONException e2) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e2);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (!(!keys2.hasNext()) && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i5 = 0;
                    while (i5 < jSONArray2.length()) {
                        int i6 = e + 71;
                        registerClient = i6 % 128;
                        if (i6 % 2 == 0) {
                            if (jSONArray2.getLong(i5) == ((Long) arrayList.get(0)).longValue()) {
                                break;
                            }
                            if (jSONArray2.getLong(i5) == ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                        } else if (jSONArray2.getLong(i5) != ((Long) arrayList.get(1)).longValue()) {
                            if (jSONArray2.getLong(i5) == ((Long) arrayList.get(1)).longValue()) {
                                int i7 = registerClient + 123;
                                e = i7 % 128;
                                int i8 = i7 % 2;
                                if (jSONArray2.getLong(i5) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                    break;
                                }
                                i5++;
                                int i9 = e + 17;
                                registerClient = i9 % 128;
                                int i10 = i9 % 2;
                                str = next;
                            }
                        }
                    }
                } catch (JSONException e3) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e3);
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    public final void getCurrencyIso4217Code(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        int i = 2 % 2;
        int i2 = e + 29;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String monetizationNetwork = getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
            if (monetizationNetwork == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
                int i4 = registerClient + 55;
                e = i4 % 128;
                int i5 = i4 % 2;
            } else {
                JSONObject jSONObject2 = new JSONObject(monetizationNetwork);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                int i6 = e + 29;
                registerClient = i6 % 128;
                int i7 = i6 % 2;
                jSONArray2.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                getMonetizationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            getMonetizationNetwork(context).AFAdRevenueData("extraReferrers", jSONObject.toString());
        } catch (JSONException e2) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e2);
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Couldn't save referrer - ").append(str).append(": ").toString(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue(AFd1kSDK aFd1kSDK) {
        int i = 2 % 2;
        int i2 = e + 79;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        aFd1kSDK.valueOf().getCurrencyIso4217Code();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = registerClient + 91;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        getCurrencyIso4217Code(new Object[]{aFb1rSDK, (Context) objArr[2]}, -608775197, 608775214, System.identityHashCode(aFb1rSDK));
        final AFd1kSDK monetizationNetwork = aFb1rSDK.getMonetizationNetwork();
        monetizationNetwork.AFKeystoreWrapper().getCurrencyIso4217Code(booleanValue);
        monetizationNetwork.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AFb1rSDK.getRevenue(AFd1kSDK.this);
            }
        });
        if (booleanValue) {
            int i2 = e + 21;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            monetizationNetwork.getRevenue().getRevenue("is_stop_tracking_used", true);
        }
        int i4 = registerClient + 15;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        int i = 2 % 2;
        int i2 = e + 77;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            aFb1rSDK.getMonetizationNetwork().copydefault().getMediationNetwork("getSdkVersion", new String[0]);
        } else {
            aFb1rSDK.getMonetizationNetwork().copydefault().getMediationNetwork("getSdkVersion", new String[0]);
        }
        String areAllFieldsValid = AFd1qSDK.areAllFieldsValid();
        int i3 = registerClient + 35;
        e = i3 % 128;
        if (i3 % 2 != 0) {
            return areAllFieldsValid;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        int i = 2 % 2;
        int i2 = registerClient + 31;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
            return;
        }
        getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = 2 % 2;
        int i2 = registerClient + 7;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getMonetizationNetwork().w().AFAdRevenueData();
            int i3 = registerClient + 123;
            e = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        getMonetizationNetwork().w().AFAdRevenueData();
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFg1jSDK aFg1jSDK = new AFg1jSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFh1vSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFh1vSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(String.valueOf(str)));
        AFg1mSDK mediationNetwork = aFg1jSDK.getMediationNetwork();
        if (mediationNetwork == null || !str.equals(mediationNetwork.getRevenue)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = mediationNetwork == null || currentTimeMillis - mediationNetwork.getCurrencyIso4217Code > TimeUnit.SECONDS.toMillis(2L);
            AFg1mSDK aFg1mSDK = new AFg1mSDK(str, currentTimeMillis, !z);
            aFg1jSDK.AFAdRevenueData.AFAdRevenueData("afUninstallToken", aFg1mSDK.getRevenue);
            aFg1jSDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken_received_time", aFg1mSDK.getCurrencyIso4217Code);
            aFg1jSDK.AFAdRevenueData.getRevenue("afUninstallToken_queued", aFg1mSDK.getCurrencyIso4217Code());
            if (z) {
                AFg1jSDK.getMediationNetwork(str);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i = 2 % 2;
        int i2 = registerClient + 81;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
            int i3 = registerClient + 41;
            e = i3 % 128;
            int i4 = i3 % 2;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = 2 % 2;
        int i2 = e + 11;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[1] = str;
            copydefault.getMediationNetwork("setImeiData", strArr);
            AFg1wSDK AFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
            AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper, str}, 1318882910, -1318882909, System.identityHashCode(AFKeystoreWrapper));
            return;
        }
        getMonetizationNetwork().copydefault().getMediationNetwork("setImeiData", str);
        AFg1wSDK AFKeystoreWrapper2 = getMonetizationNetwork().AFKeystoreWrapper();
        AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper2, str}, 1318882910, -1318882909, System.identityHashCode(AFKeystoreWrapper2));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = 2 % 2;
        int i2 = registerClient + 81;
        e = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setOaidData", str);
        AFb1vSDK.getRevenue = str;
        int i4 = e + 59;
        registerClient = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = e + 13;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        aFb1rSDK.getMonetizationNetwork().copydefault().getMediationNetwork("setAndroidIdData", str);
        aFb1rSDK.getMonetizationNetwork().e().getRevenue = str;
        int i4 = e + 9;
        registerClient = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return null;
    }

    private static void getMediationNetwork(String str, String str2) {
        int i = 2 % 2;
        int i2 = e + 67;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i4 = e + 43;
        registerClient = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void AFAdRevenueData(String str, boolean z) {
        int i = 2 % 2;
        int i2 = registerClient + 57;
        e = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties.getInstance().set(str, z);
        int i4 = registerClient + 11;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = e + 121;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            AppsFlyerProperties.getInstance().getString(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i3 = e + 3;
        registerClient = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (getCurrencyIso4217Code(com.appsflyer.AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (getCurrencyIso4217Code(com.appsflyer.AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (getCurrencyIso4217Code() != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = com.appsflyer.internal.AFb1rSDK.e + 105;
        com.appsflyer.internal.AFb1rSDK.registerClient = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = e + 37;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i = 2 % 2;
        int i2 = registerClient + 21;
        e = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        int i4 = registerClient + 75;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        Context context = (Context) objArr[2];
        int i = 2 % 2;
        int i2 = e + 93;
        int i3 = i2 % 128;
        registerClient = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (context != null) {
            int i5 = i3 + 81;
            e = i5 % 128;
            int i6 = i5 % 2;
            if (aFb1rSDK.AFAdRevenueData()) {
                aFb1rSDK.setCustomerUserId(str);
                AFLogger.afInfoLog(new StringBuilder("CustomerUserId set: ").append(str).append(" - Initializing AppsFlyer Tacking").toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(aFb1rSDK.getMonetizationNetwork().getRevenue());
                aFb1rSDK.getCurrencyIso4217Code(context, AFh1qSDK.setCustomerIdAndLogSession);
                AFg1wSDK AFKeystoreWrapper = aFb1rSDK.getMonetizationNetwork().AFKeystoreWrapper();
                if (referrer == null) {
                    int i7 = registerClient + 103;
                    e = i7 % 128;
                    if (i7 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    referrer = "";
                }
                if (context instanceof Activity) {
                    int i8 = registerClient + 95;
                    e = i8 % 128;
                    if (i8 % 2 == 0) {
                        ((Activity) context).getIntent();
                        int i9 = 16 / 0;
                    } else {
                        ((Activity) context).getIntent();
                    }
                }
                aFb1rSDK.getMonetizationNetwork(context, referrer);
                return null;
            }
            aFb1rSDK.setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i = 2 % 2;
        int i2 = registerClient + 99;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string != null) {
                return string;
            }
            String AFAdRevenueData2 = AFAdRevenueData(context, "AF_STORE");
            if (AFAdRevenueData2 == null) {
                AFLogger.afInfoLog("No out-of-store value set");
                return null;
            }
            int i3 = registerClient + 81;
            e = i3 % 128;
            int i4 = i3 % 2;
            return AFAdRevenueData2;
        }
        AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = 2 % 2;
        int i2 = registerClient;
        int i3 = i2 + 35;
        e = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            int i5 = i2 + 119;
            e = i5 % 128;
            int i6 = i5 % 2;
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if ((!r9.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID))) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r9 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r9 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005e, code lost:
    
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_DOMAIN);
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_VERSION);
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_SCHEME);
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppInviteOneLink(String str) {
        int i = 2 % 2;
        int i2 = e + 33;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[1] = str;
            copydefault.getMediationNetwork("setAppInviteOneLink", strArr);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("setAppInviteOneLink", str);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        }
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
        int i3 = e + 55;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = e + 61;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (map != null) {
            getMonetizationNetwork().copydefault().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        int i3 = registerClient + 47;
        e = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01a5  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        long j;
        char c;
        int i = 2 % 2;
        int i2 = registerClient + 41;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (activity != null && activity.getIntent() != null) {
            getMonetizationNetwork().copydefault().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), new StringBuilder("activity_intent_").append(activity.getIntent().toString()).toString());
        } else if (activity != null) {
            int i3 = e + 113;
            registerClient = i3 % 128;
            if (i3 % 2 != 0) {
                AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
                String[] strArr = new String[5];
                strArr[0] = activity.getLocalClassName();
                strArr[1] = "activity_intent_null";
                copydefault.getMediationNetwork("sendPushNotificationData", strArr);
            } else {
                getMonetizationNetwork().copydefault().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            }
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("sendPushNotificationData", "activity_null");
        }
        AFd1tSDK e2 = getMonetizationNetwork().e();
        e2.AFAdRevenueData = getCurrencyIso4217Code(activity);
        if (e2.AFAdRevenueData != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.copy == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copy = new ConcurrentHashMap();
                j = currentTimeMillis;
            } else {
                try {
                    long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    Iterator<Long> it = this.copy.keySet().iterator();
                    j = currentTimeMillis;
                    while (it.hasNext()) {
                        try {
                            Long next = it.next();
                            JSONObject jSONObject = new JSONObject(e2.AFAdRevenueData);
                            JSONObject jSONObject2 = new JSONObject(this.copy.get(next));
                            Iterator<Long> it2 = it;
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                AFLogger.afInfoLog(new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ").append(jSONObject2).append(", new: ").append(jSONObject).append(")").toString());
                                e2.AFAdRevenueData = null;
                                return;
                            }
                            if (currentTimeMillis - next.longValue() > j2) {
                                this.copy.remove(next);
                            }
                            if (next.longValue() <= j) {
                                j = next.longValue();
                            }
                            int i4 = registerClient + 1;
                            e = i4 % 128;
                            if (i4 % 2 == 0) {
                                c = 5;
                                int i5 = 2 / 5;
                            } else {
                                c = 5;
                            }
                            it = it2;
                        } catch (Throwable th) {
                            th = th;
                            AFLogger.afErrorLog(new StringBuilder("Error while handling push notification measurement: ").append(th.getClass().getSimpleName()).toString(), th);
                            if (this.copy.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                            }
                            this.copy.put(Long.valueOf(currentTimeMillis), e2.AFAdRevenueData);
                            start(activity);
                            int i6 = registerClient + 59;
                            e = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = currentTimeMillis;
                }
            }
            if (this.copy.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                AFLogger.afInfoLog(new StringBuilder("pushes: removing oldest overflowing push (oldest push:").append(j).append(")").toString());
                this.copy.remove(Long.valueOf(j));
                int i8 = registerClient + 111;
                e = i8 % 128;
                int i9 = i8 % 2;
            }
            this.copy.put(Long.valueOf(currentTimeMillis), e2.AFAdRevenueData);
            start(activity);
        }
        int i62 = registerClient + 59;
        e = i62 % 128;
        int i72 = i62 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = 2 % 2;
        int i2 = e + 47;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i4 = registerClient + 123;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: com.appsflyer.internal.AFb1rSDK$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getRevenue = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getMonetizationNetwork().copydefault().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        int i2 = e + 121;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        int i4 = 0;
        while (i4 < length) {
            String str2 = strArr[i4];
            if (AnonymousClass5.getRevenue[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1jSDK.getMonetizationNetwork(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
            i4++;
            int i5 = registerClient + 81;
            e = i5 % 128;
            int i6 = i5 % 2;
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        int i = 2 % 2;
        int i2 = e + 113;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            copydefault.getMediationNetwork("setCollectIMEI", strArr);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("setCollectIMEI", String.valueOf(z));
        }
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i3 = registerClient + 59;
        e = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = 2 % 2;
        int i2 = registerClient + 19;
        e = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setCollectOaid", String.valueOf(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i4 = e + 31;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i = 2 % 2;
        int i2 = e + 113;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFc1kSDK d = getMonetizationNetwork().d();
        d.component4.clear();
        d.component4.addAll(Arrays.asList(strArr));
        int i4 = registerClient + 51;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i = 2 % 2;
        int i2 = registerClient + 121;
        e = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        aFb1rSDK.getMonetizationNetwork().d().component1 = strArr;
        int i4 = registerClient + 121;
        e = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(boolean z) {
        int i = 2 % 2;
        if (!z) {
            getMonetizationNetwork().i().getRevenue();
            int i2 = registerClient + 79;
            e = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = registerClient + 67;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            getMonetizationNetwork().i().getMonetizationNetwork();
        } else {
            getMonetizationNetwork().i().getMonetizationNetwork();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        String str2;
        int i = 2 % 2;
        int i2 = e + 27;
        int i3 = i2 % 128;
        registerClient = i3;
        int i4 = i2 % 2;
        if (!(!this.equals)) {
            int i5 = i3 + 51;
            e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }
        this.equals = true;
        getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code(str);
        if (context != null) {
            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
            Application f_ = AFb1qSDK.f_(context);
            if (f_ == null) {
                return this;
            }
            this.component4 = f_;
            getMonetizationNetwork().valueOf().getMonetizationNetwork();
            getMonetizationNetwork().component3().getMediationNetwork = System.currentTimeMillis();
            AFe1aSDK copy = getMonetizationNetwork().copy();
            copy.AFAdRevenueData.execute(copy.new AnonymousClass2(new AFf1pSDK(getMonetizationNetwork())));
            AFi1qSDK registerClient2 = getMonetizationNetwork().registerClient();
            registerClient2.getMediationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1lSDK(registerClient2.getCurrencyIso4217Code) : new AFi1sSDK(registerClient2.getCurrencyIso4217Code);
            getMonetizationNetwork().afErrorLog().getCurrencyIso4217Code(new AFd1eSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda2
                @Override // com.appsflyer.internal.AFd1eSDK.AFa1vSDK
                public final void onConfigurationChanged(boolean z) {
                    AFb1rSDK.this.getCurrencyIso4217Code(z);
                }
            });
            getMonetizationNetwork().component2().AFAdRevenueData(getMediationNetwork());
            AFj1uSDK equals = getMonetizationNetwork().equals();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1rSDK.this.copydefault();
                }
            };
            AFi1eSDK AFAdRevenueData2 = equals.AFAdRevenueData(runnable);
            Runnable revenue = equals.getRevenue(AFAdRevenueData2, runnable);
            equals.getMonetizationNetwork(AFAdRevenueData2);
            equals.getMonetizationNetwork(new AFj1lSDK(equals.AFAdRevenueData.getMediationNetwork(), revenue));
            equals.getMonetizationNetwork(new AFj1zSDK(revenue, equals.AFAdRevenueData, new AFj1ySDK()));
            equals.getMonetizationNetwork(new AFj1pSDK(revenue, equals.AFAdRevenueData));
            if (equals.AFAdRevenueData.afDebugLog().AFAdRevenueData(AFg1hSDK.IS_SAMSUNG_PRELOAD_REFERRER_COLLECTION_ENABLED)) {
                equals.getMonetizationNetwork(new AFj1rSDK(equals.AFAdRevenueData.getMonetizationNetwork(), equals.AFAdRevenueData.getMediationNetwork(), revenue));
            }
            equals.getCurrencyIso4217Code(revenue);
            if (!equals.AFAdRevenueData()) {
                Context context2 = equals.AFAdRevenueData.values().AFAdRevenueData;
                AFd1kSDK aFd1kSDK = equals.AFAdRevenueData;
                List<ResolveInfo> queryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                    while (it.hasNext()) {
                        int i7 = e + 25;
                        registerClient = i7 % 128;
                        int i8 = i7 % 2;
                        ProviderInfo providerInfo = it.next().providerInfo;
                        if (providerInfo != null) {
                            arrayList.add(new AFj1tSDK(providerInfo, revenue, aFd1kSDK));
                        } else {
                            AFLogger.INSTANCE.w(AFh1vSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                            int i9 = registerClient + 53;
                            e = i9 % 128;
                            int i10 = i9 % 2;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        equals.getMonetizationNetwork.addAll(arrayList);
                        AFLogger.INSTANCE.d(AFh1vSDK.PREINSTALL, new StringBuilder("Detected ").append(arrayList.size()).append(" valid preinstall provider(s)").toString());
                    }
                }
            }
            AFj1sSDK[] currencyIso4217Code = equals.getCurrencyIso4217Code();
            int length = currencyIso4217Code.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = registerClient + 59;
                e = i12 % 128;
                if (i12 % 2 == 0) {
                    currencyIso4217Code[i11].getMediationNetwork(equals.AFAdRevenueData.values().AFAdRevenueData);
                    i11 += 52;
                } else {
                    currencyIso4217Code[i11].getMediationNetwork(equals.AFAdRevenueData.values().AFAdRevenueData);
                    i11++;
                }
            }
            if (getMonetizationNetwork().afDebugLog().AFAdRevenueData(AFg1hSDK.IS_PLAY_INTEGRITY_DATA_COLLECTION_ENABLED)) {
                component1();
            }
            this.toString.AFKeystoreWrapper().getMediationNetwork(getMonetizationNetwork().getMediationNetwork());
        } else {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            int i13 = registerClient;
            int i14 = i13 + 103;
            e = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            int i15 = i13 + 13;
            e = i15 % 128;
            int i16 = i15 % 2;
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        copydefault.getMediationNetwork("init", strArr);
        AFLogger.INSTANCE.force(AFh1vSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.15.2", getCurrencyIso4217Code));
        this.getMonetizationNetwork = appsFlyerConversionListener;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFi1jSDK aFi1jSDK) {
        int i = 2 % 2;
        AFf1jSDK aFf1jSDK = new AFf1jSDK(aFi1jSDK, getMonetizationNetwork().getMediationNetwork(), getMonetizationNetwork());
        AFe1aSDK copy = getMonetizationNetwork().copy();
        copy.AFAdRevenueData.execute(copy.new AnonymousClass2(aFf1jSDK));
        int i2 = registerClient + 111;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        int i = 2 % 2;
        final AFi1jSDK force = getMonetizationNetwork().force();
        if (force != null) {
            int i2 = registerClient + 83;
            e = i2 % 128;
            int i3 = i2 % 2;
            if (force.AFAdRevenueData()) {
                int i4 = registerClient + 97;
                e = i4 % 128;
                int i5 = i4 % 2;
                force.getCurrencyIso4217Code(new AFi1dSDK() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda5
                    @Override // com.appsflyer.internal.AFi1dSDK
                    public final void onRequestFinished() {
                        AFb1rSDK.this.getMediationNetwork(force);
                    }
                });
            }
        }
    }

    private void component1() {
        int i = 2 % 2;
        int i2 = e + 119;
        registerClient = i2 % 128;
        if (i2 % 2 == 0) {
            getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1rSDK.this.copy();
                }
            });
            return;
        }
        getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                AFb1rSDK.this.copy();
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = 2 % 2;
        int i2 = e + 117;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().unregisterClient().AFAdRevenueData(z);
        int i4 = registerClient + 37;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = registerClient + 63;
        e = i2 % 128;
        int i3 = i2 % 2;
        aFb1rSDK.start(context, null);
        int i4 = registerClient + 93;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i = 2 % 2;
        int i2 = e + 111;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        start(context, str, null);
        int i4 = registerClient + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        int i = 2 % 2;
        int i2 = e + 99;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (getMonetizationNetwork().w().getMediationNetwork()) {
            int i4 = e + 45;
            registerClient = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (!this.equals) {
            getMediationNetwork("start");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        }
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        final AFh1oSDK component32 = getMonetizationNetwork().component3();
        component32.AFAdRevenueData(AFa1mSDK.AFAdRevenueData(context));
        if (this.component4 == null) {
            int i5 = e + 119;
            registerClient = i5 % 128;
            if (i5 % 2 != 0) {
                AFb1qSDK.f_(context);
                obj.hashCode();
                throw null;
            }
            Application f_ = AFb1qSDK.f_(context);
            if (f_ == null) {
                return;
            } else {
                this.component4 = f_;
            }
        }
        getMonetizationNetwork().copydefault().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.GENERAL;
        String str2 = getCurrencyIso4217Code;
        aFLogger.i(aFh1vSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.15.2", str2));
        AFLogger.INSTANCE.i(AFh1vSDK.GENERAL, new StringBuilder("Build Number: ").append(str2).toString());
        AppsFlyerProperties.getInstance().loadProperties(getMonetizationNetwork().getRevenue());
        if (TextUtils.isEmpty(str)) {
            AFg1wSDK AFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
            if (TextUtils.isEmpty((String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(AFKeystoreWrapper)))) {
                int i6 = registerClient + 105;
                e = i6 % 128;
                int i7 = i6 % 2;
                equals();
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        } else {
            getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code(str);
        }
        getMonetizationNetwork().component2().AFAdRevenueData(getMediationNetwork());
        getCurrencyIso4217Code(new Object[]{this}, -1730576944, 1730576958, System.identityHashCode(this));
        getCurrencyIso4217Code(this.component4.getBaseContext());
        getMonetizationNetwork().unregisterClient().getMediationNetwork();
        this.toString.w().getRevenue(context, new AFd1wSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFb1rSDK.4
            @Override // com.appsflyer.internal.AFd1wSDK.AFa1tSDK
            public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
                component32.getMonetizationNetwork();
                AFd1kSDK monetizationNetwork = AFb1rSDK.this.getMonetizationNetwork();
                monetizationNetwork.component2().AFAdRevenueData(AFb1rSDK.this.getMediationNetwork());
                AFb1rSDK.this.component4();
                int mediationNetwork = monetizationNetwork.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (mediationNetwork < 2) {
                    AFb1rSDK.this.getMonetizationNetwork().component4().getMediationNetwork();
                }
                AFh1iSDK aFh1iSDK = new AFh1iSDK();
                if (aFh1mSDK != null) {
                    AFb1rSDK.this.getMonetizationNetwork().d().n_(AFc1oSDK.getMediationNetwork(aFh1iSDK), aFh1mSDK.getCurrencyIso4217Code, monetizationNetwork.values().AFAdRevenueData);
                }
                AFb1rSDK aFb1rSDK = AFb1rSDK.this;
                aFh1iSDK.getMediationNetwork = appsFlyerRequestListener;
                aFb1rSDK.getRevenue(aFh1iSDK, aFh1mSDK);
            }

            @Override // com.appsflyer.internal.AFd1wSDK.AFa1tSDK
            public final void getRevenue() {
                Context context2 = AFb1rSDK.this.getMonetizationNetwork().values().AFAdRevenueData;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1oSDK aFh1oSDK = component32;
                long currentTimeMillis = System.currentTimeMillis();
                if (aFh1oSDK.areAllFieldsValid != 0) {
                    long j = currentTimeMillis - aFh1oSDK.areAllFieldsValid;
                    if (j > 0 && j < 1000) {
                        j = 1000;
                    }
                    aFh1oSDK.equals = TimeUnit.MILLISECONDS.toSeconds(j);
                    aFh1oSDK.AFAdRevenueData.getMonetizationNetwork("prev_session_dur", aFh1oSDK.equals);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1rSDK.this.getMonetizationNetwork().afErrorLog().getMonetizationNetwork();
                AFb1cSDK copydefault = AFb1rSDK.this.getMonetizationNetwork().copydefault();
                if (copydefault.areAllFieldsValid()) {
                    copydefault.AFAdRevenueData();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        copydefault.k_(context2.getPackageName(), context2.getPackageManager());
                    }
                    copydefault.getMonetizationNetwork();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1rSDK.this.getMonetizationNetwork().component4().getRevenue();
                AFb1rSDK.this.getMonetizationNetwork().afInfoLog().getCurrencyIso4217Code();
            }
        });
        int i8 = registerClient + 89;
        e = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 35 / 0;
        }
    }

    private static void getCurrencyIso4217Code(Context context) {
        int i = 2 % 2;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (Build.VERSION.SDK_INT < 31) {
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.i(AFh1vSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    } else {
                        AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                        return;
                    }
                }
                int i2 = registerClient + 53;
                e = i2 % 128;
                if (i2 % 2 != 0) {
                    if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.i(AFh1vSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                        int i3 = registerClient + 33;
                        e = i3 % 128;
                        int i4 = i3 % 2;
                        return;
                    }
                    AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    return;
                }
                context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName());
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    public static String getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = registerClient + 117;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            return (String) getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.APP_USER_ID}, 143536171, -143536152, (int) System.currentTimeMillis());
        }
        int i3 = 44 / 0;
        return (String) getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.APP_USER_ID}, 143536171, -143536152, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i = 2 % 2;
        int i2 = registerClient + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        e = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i4 = registerClient + 115;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = e + 11;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork().e().getCurrencyIso4217Code = AFb1jSDK.getMonetizationNetwork(str);
            int i3 = 77 / 0;
        } else {
            getMonetizationNetwork().e().getCurrencyIso4217Code = AFb1jSDK.getMonetizationNetwork(str);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = 2 % 2;
        int i2 = registerClient + 105;
        e = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setAppId", str);
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
        int i4 = e + 49;
        registerClient = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = 2 % 2;
        int i2 = e + 69;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i4 = e + 85;
        registerClient = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = 2 % 2;
        int i2 = e + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            copydefault.getMediationNetwork("setIsUpdate", strArr);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("setIsUpdate", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i = 2 % 2;
        int i2 = e + 115;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[0] = str;
            copydefault.getMediationNetwork("setCurrencyCode", strArr);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("setCurrencyCode", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        int i = 2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        getRevenue(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i2 = registerClient + 61;
        e = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i = 2 % 2;
        int i2 = registerClient + 43;
        e = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("logSession", new String[0]);
        getMonetizationNetwork().copydefault().getRevenue();
        getCurrencyIso4217Code(context, AFh1qSDK.logSession);
        getRevenue(context, (String) null, (Map<String, Object>) null);
        int i4 = registerClient + 7;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    private void getCurrencyIso4217Code(Context context, AFh1qSDK aFh1qSDK) {
        int i = 2 % 2;
        int i2 = e + 23;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFh1oSDK component32 = getMonetizationNetwork().component3();
        AFh1sSDK AFAdRevenueData2 = AFa1mSDK.AFAdRevenueData(context);
        if (!(!component32.getCurrencyIso4217Code())) {
            component32.getCurrencyIso4217Code.put("api_name", aFh1qSDK.toString());
            component32.AFAdRevenueData(AFAdRevenueData2);
            int i4 = registerClient + 3;
            e = i4 % 128;
            int i5 = i4 % 2;
        }
        component32.getMonetizationNetwork();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.w(com.appsflyer.internal.AFh1vSDK.AD_REVENUE, "SDK is stopped");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r1 = getMonetizationNetwork().AFKeystoreWrapper();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getRevenue((java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r1}, -1684451992, 1684451992, java.lang.System.identityHashCode(r1))) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r6 = com.appsflyer.internal.AFb1rSDK.registerClient + 83;
        com.appsflyer.internal.AFb1rSDK.e = r6 % 128;
        r6 = r6 % 2;
        equals();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        getCurrencyIso4217Code(new java.lang.Object[]{r5, new com.appsflyer.internal.AFh1nSDK(r6, r7)}, 1781271842, -1781271820, java.lang.System.identityHashCode(r5));
        r6 = com.appsflyer.internal.AFb1rSDK.e + 49;
        com.appsflyer.internal.AFb1rSDK.registerClient = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x001b, code lost:
    
        getMediationNetwork("logAdRevenue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0019, code lost:
    
        if (r5.equals == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r5.equals == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r6.areAllFieldsValid() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.w(com.appsflyer.internal.AFh1vSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = e + 9;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        Map<String, Object> map = (Map) objArr[3];
        int i = 2 % 2;
        int i2 = registerClient + 105;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            aFb1rSDK.logEvent(context, str, map, null);
            int i3 = 52 / 0;
        } else {
            aFb1rSDK.logEvent(context, str, map, null);
        }
        int i4 = registerClient + 21;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private AFh1mSDK component3(Context context) {
        int i = 2 % 2;
        int i2 = registerClient + 81;
        e = i2 % 128;
        int i3 = i2 % 2;
        if (!(context instanceof Activity)) {
            return null;
        }
        AFh1mSDK aFh1mSDK = new AFh1mSDK((Activity) context, getMonetizationNetwork().AFLogger());
        int i4 = registerClient + 125;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return aFh1mSDK;
        }
        throw null;
    }

    private void getRevenue(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        aFh1eSDK.areAllFieldsValid = str;
        aFh1eSDK.getCurrencyIso4217Code = map;
        getRevenue(aFh1eSDK, component3(context));
        int i2 = e + 63;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0090, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0092, code lost:
    
        r6.component2 = r7;
        getCurrencyIso4217Code(new java.lang.Object[]{r5, r6}, 1781271842, -1781271820, java.lang.System.identityHashCode(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
        r6 = r6.getMediationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r7 = com.appsflyer.internal.AFb1rSDK.registerClient + 91;
        com.appsflyer.internal.AFb1rSDK.e = r7 % 128;
        r7 = r7 % 2;
        r6.onError(41, "No dev key");
        r6 = com.appsflyer.internal.AFb1rSDK.e + 3;
        com.appsflyer.internal.AFb1rSDK.registerClient = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (((java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r7}, -1684451992, 1684451992, java.lang.System.identityHashCode(r7))) == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (((java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r7}, -1684451992, 1684451992, java.lang.System.identityHashCode(r7))) == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0071, code lost:
    
        r7 = com.appsflyer.AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().getRevenue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0081, code lost:
    
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0083, code lost:
    
        r7 = com.appsflyer.internal.AFb1rSDK.e + 79;
        com.appsflyer.internal.AFb1rSDK.registerClient = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008c, code lost:
    
        if ((r7 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008e, code lost:
    
        r7 = 5 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getRevenue(AFa1oSDK aFa1oSDK, AFh1mSDK aFh1mSDK) {
        int i = 2 % 2;
        int i2 = e + 107;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFAdRevenueData(aFa1oSDK, aFh1mSDK);
            AFg1wSDK AFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
            int i3 = 0 / 0;
        } else {
            AFAdRevenueData(aFa1oSDK, aFh1mSDK);
            AFg1wSDK AFKeystoreWrapper2 = getMonetizationNetwork().AFKeystoreWrapper();
        }
    }

    private static void AFAdRevenueData(AFa1oSDK aFa1oSDK, AFh1mSDK aFh1mSDK) {
        int i = 2 % 2;
        if (aFh1mSDK != null) {
            int i2 = e + 17;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            aFa1oSDK.AFAdRevenueData = aFh1mSDK.getRevenue;
            aFa1oSDK.component3 = aFh1mSDK.getMonetizationNetwork;
            int i4 = registerClient + 115;
            e = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = 2 % 2;
        int i2 = registerClient + 25;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            copydefault.getMediationNetwork("anonymizeUser", strArr);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        int i2 = e + 123;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("registerConversionListener", new String[0]);
        getCurrencyIso4217Code(appsFlyerConversionListener);
        int i4 = registerClient + 123;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    private void getCurrencyIso4217Code(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        if (appsFlyerConversionListener == null) {
            int i2 = registerClient + 33;
            e = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.getMonetizationNetwork = appsFlyerConversionListener;
        int i4 = e + 67;
        registerClient = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = 2 % 2;
        int i2 = e + 97;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork().copydefault().getMediationNetwork("unregisterConversionListener", new String[1]);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("unregisterConversionListener", new String[0]);
        }
        this.getMonetizationNetwork = null;
        int i3 = e + 47;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = 2 % 2;
        int i2 = e + 117;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            int i4 = e + 113;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        getMediationNetwork = appsFlyerInAppPurchaseValidatorListener;
        int i6 = registerClient + 103;
        e = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private void getMonetizationNetwork(Context context, String str) {
        int i = 2 % 2;
        AFh1iSDK aFh1iSDK = new AFh1iSDK();
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        aFh1iSDK.areAllFieldsValid = null;
        aFh1iSDK.getCurrencyIso4217Code = null;
        aFh1iSDK.component2 = str;
        aFh1iSDK.AFAdRevenueData = null;
        getCurrencyIso4217Code(new Object[]{this, aFh1iSDK}, 1781271842, -1781271820, System.identityHashCode(this));
        int i2 = registerClient + 11;
        e = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0090, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        if (isStopped() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006d, code lost:
    
        if (isStopped() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0076, code lost:
    
        com.appsflyer.AFLogger.afInfoLog(java.lang.String.format(java.util.Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", r5, r1, java.lang.Long.valueOf(r3), java.lang.Long.valueOf(r11.copydefault)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean component3() {
        String format;
        int i = 2 % 2;
        int i2 = e + 9;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        if (this.component1 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.component1;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            String str = (String) getCurrencyIso4217Code(new Object[]{simpleDateFormat, Long.valueOf(this.component1)}, 1382084704, -1382084693, (int) System.currentTimeMillis());
            String str2 = (String) getCurrencyIso4217Code(new Object[]{simpleDateFormat, Long.valueOf(this.areAllFieldsValid)}, 1382084704, -1382084693, (int) System.currentTimeMillis());
            if (currentTimeMillis < this.copydefault) {
                int i4 = registerClient + 31;
                e = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 95 / 0;
                }
            }
            if (!isStopped()) {
                int i6 = registerClient + 117;
                e = i6 % 128;
                if (i6 % 2 == 0) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[2];
                    objArr[0] = str;
                    objArr[0] = str2;
                    objArr[3] = Long.valueOf(currentTimeMillis);
                    format = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", objArr);
                } else {
                    format = String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", str, str2, Long.valueOf(currentTimeMillis));
                }
                AFLogger.afInfoLog(format);
            }
        } else if (!isStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    private void getMonetizationNetwork(String str) {
        int i = 2 % 2;
        AFa1oSDK mediationNetwork = new AFh1jSDK().getMediationNetwork(getMonetizationNetwork().getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0));
        mediationNetwork.component2 = str;
        if (str != null) {
            int i2 = e + 45;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() <= 5 || !getMonetizationNetwork().equals().getMediationNetwork(mediationNetwork)) {
                return;
            }
            AFj1cSDK.getMonetizationNetwork(getMonetizationNetwork().AFAdRevenueData(), new AFa1tSDK(mediationNetwork), 5L, TimeUnit.MILLISECONDS);
            int i4 = registerClient + 53;
            e = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r2.length() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r2 = getMonetizationNetwork(r1);
        com.appsflyer.AppsFlyerProperties.getInstance().saveProperties(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        if (getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        com.appsflyer.AFLogger.afInfoLog(new java.lang.StringBuilder("sendWithEvent from activity: ").append(r1.getClass().getName()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
    
        r1 = r12.getRevenue();
        r3 = getMonetizationNetwork(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        if ((!isStopped()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        r2 = getMediationNetwork(r2, false);
        r4 = new com.appsflyer.internal.AFj1jSDK(getMonetizationNetwork().getMediationNetwork());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "");
        r7 = r12.getRevenue();
        r8 = r12 instanceof com.appsflyer.internal.AFh1nSDK;
        r9 = r12 instanceof com.appsflyer.internal.AFh1jSDK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c5, code lost:
    
        if ((r12 instanceof com.appsflyer.internal.AFh1lSDK) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
    
        if (r9 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d3, code lost:
    
        if (r8 == true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
    
        if (r7 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
    
        r7 = com.appsflyer.internal.AFb1rSDK.registerClient + 65;
        com.appsflyer.internal.AFb1rSDK.e = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ea, code lost:
    
        if (r4.getRevenue.getRevenue.getMediationNetwork("appsFlyerCount", 0) >= 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ec, code lost:
    
        r7 = r4.AFAdRevenueData.getMonetizationNetwork(com.appsflyer.internal.AFj1jSDK.getMediationNetwork);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010f, code lost:
    
        r4 = r4.getRevenue(com.appsflyer.internal.AFj1jSDK.getMonetizationNetwork(r4.getMediationNetwork(r7), r8));
        getCurrencyIso4217Code(new java.lang.Object[]{r11, r3}, -1216379940, 1216379960, java.lang.System.identityHashCode(r11));
        r7 = new com.appsflyer.internal.AFc1tSDK(getMonetizationNetwork(), r12.getRevenue(r4).getRevenue(r3).getMediationNetwork(r2), getMonetizationNetwork().unregisterClient().getCurrencyIso4217Code());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014d, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x014f, code lost:
    
        r12 = component2();
        r1 = r12.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0155, code lost:
    
        if (r5 >= r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0157, code lost:
    
        r3 = r12[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015d, code lost:
    
        if (r3.component2 != com.appsflyer.internal.AFj1sSDK.AFa1zSDK.STARTED) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015f, code lost:
    
        com.appsflyer.AFLogger.afDebugLog(new java.lang.StringBuilder("Failed to get ").append(r3.getMonetizationNetwork).append(" referrer, wait ...").toString());
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x017a, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0189, code lost:
    
        if (getMonetizationNetwork().unregisterClient().getMonetizationNetwork() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x018b, code lost:
    
        r12 = com.appsflyer.internal.AFb1rSDK.e + 73;
        com.appsflyer.internal.AFb1rSDK.registerClient = r12 % 128;
        r12 = r12 % 2;
        com.appsflyer.AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a8, code lost:
    
        if (getMonetizationNetwork().AFKeystoreWrapper().getMonetizationNetwork() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01aa, code lost:
    
        r12 = com.appsflyer.internal.AFb1rSDK.e + 89;
        com.appsflyer.internal.AFb1rSDK.registerClient = r12 % 128;
        r12 = r12 % 2;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019b, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b4, code lost:
    
        r12 = getMonetizationNetwork().AFAdRevenueData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bc, code lost:
    
        if (r5 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01be, code lost:
    
        r0 = 500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c3, code lost:
    
        com.appsflyer.internal.AFj1cSDK.getMonetizationNetwork(r12, r7, r0, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c1, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r7 = r4.AFAdRevenueData.getMonetizationNetwork(com.appsflyer.internal.AFj1jSDK.areAllFieldsValid);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
    
        r7 = r4.AFAdRevenueData.getMonetizationNetwork(com.appsflyer.internal.AFj1jSDK.component1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0107, code lost:
    
        r7 = r4.AFAdRevenueData.getMonetizationNetwork(com.appsflyer.internal.AFj1jSDK.getCurrencyIso4217Code);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
    
        r7 = r4.AFAdRevenueData.getMonetizationNetwork(com.appsflyer.internal.AFj1jSDK.getMonetizationNetwork);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0059, code lost:
    
        if (r2.length() == 0) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getRevenue(AFa1oSDK aFa1oSDK) {
        int i = 2 % 2;
        Context context = getMonetizationNetwork().values().AFAdRevenueData;
        if (context == null) {
            int i2 = registerClient + 89;
            e = i2 % 128;
            int i3 = i2 % 2;
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        AFg1wSDK AFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
        String str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(AFKeystoreWrapper));
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1oSDK.getMediationNetwork;
        if (str != null) {
            int i4 = e + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
            registerClient = i4 % 128;
            int i5 = 0;
            if (i4 % 2 != 0) {
                int i6 = 13 / 0;
            }
        }
        AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
        AFLogger.afInfoLog("AppsFlyer will not track this event.");
        if (appsFlyerRequestListener != null) {
            int i7 = e + 85;
            registerClient = i7 % 128;
            appsFlyerRequestListener.onError(i7 % 2 != 0 ? 99 : 41, "No dev key");
        }
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        int i2 = e + 39;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i4 = e + 11;
            registerClient = i4 % 128;
            if (i4 % 2 == 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                int i5 = e + 125;
                registerClient = i5 % 128;
                int i6 = i5 % 2;
                if (map.get("advertiserId") != null) {
                    try {
                        if (AFc1sSDK.getRevenue(aFb1rSDK.getMonetizationNetwork().e().getRevenue) && map.remove("android_id") != null) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                        if (AFc1sSDK.getRevenue(aFb1rSDK.getMonetizationNetwork().AFKeystoreWrapper().getRevenue()) && map.remove("imei") != null) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        }
                        return null;
                    } catch (Exception e2) {
                        AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e2);
                    }
                }
            }
        }
        return null;
    }

    final Map<String, Object> getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        String str;
        int i = 2 % 2;
        Context context = getMonetizationNetwork().values().AFAdRevenueData;
        AFd1rSDK monetizationNetwork = getMonetizationNetwork(context);
        AFg1kSDK component1 = getMonetizationNetwork().component1();
        boolean currencyIso4217Code = getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code();
        boolean revenue = aFa1oSDK.getRevenue();
        Map<String, Object> map = aFa1oSDK.getRevenue;
        long time = new Date().getTime();
        boolean z = false;
        Object[] objArr = new Object[1];
        a(null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 127 - Color.blue(0), objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (currencyIso4217Code) {
                AFLogger.INSTANCE.i(AFh1vSDK.GENERAL, "SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (!(!revenue)) {
                    int i2 = e + 117;
                    registerClient = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 40 / 0;
                    }
                    str = "Launch";
                } else {
                    str = aFa1oSDK.areAllFieldsValid;
                }
                aFLogger.i(aFh1vSDK, sb.append(str).toString(), true);
            }
            getCurrencyIso4217Code(new Object[]{context}, 2054602482, -2054602479, (int) System.currentTimeMillis());
            int mediationNetwork = getMediationNetwork(monetizationNetwork, revenue);
            if (aFa1oSDK.areAllFieldsValid != null) {
                int i4 = registerClient + 125;
                e = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
            int currencyIso4217Code2 = getCurrencyIso4217Code(monetizationNetwork, z);
            if (revenue && mediationNetwork == 1) {
                AppsFlyerProperties.getInstance().getMonetizationNetwork = true;
            }
            component1.getCurrencyIso4217Code(map, mediationNetwork, currencyIso4217Code2);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
        }
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r5.contains("android.permission.INTERNET") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        List asList;
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = registerClient + 55;
        e = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 11102).requestedPermissions);
                if (!asList.contains("android.permission.INTERNET")) {
                    int i3 = registerClient + 73;
                    e = i3 % 128;
                    if (i3 % 2 != 0) {
                        AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                    } else {
                        AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                        throw null;
                    }
                }
                if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                    AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                }
                if (Build.VERSION.SDK_INT > 32 && !asList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                }
                return null;
            }
            asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
        } catch (Exception e2) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Exception while validation permissions. ", e2);
            return null;
        }
    }

    public static Map<String, Object> getCurrencyIso4217Code(Map<String, Object> map) {
        Map<String, Object> map2;
        int i = 2 % 2;
        int i2 = registerClient + 91;
        e = i2 % 128;
        int i3 = i2 % 2;
        if (map.containsKey("meta")) {
            map2 = (Map) map.get("meta");
        } else {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            map2 = hashMap;
        }
        int i4 = registerClient + 97;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return map2;
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        Intent intent;
        int i = 2 % 2;
        int i2 = e + 13;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i4 = registerClient + 75;
                    e = i4 % 128;
                    int i5 = i4 % 2;
                    str = extras.getString("af");
                    if (str != null) {
                        int i6 = registerClient + 97;
                        e = i6 % 128;
                        int i7 = i6 % 2;
                        AFLogger.INSTANCE.w(AFh1vSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(str)));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                    }
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.ENGAGEMENT, th.getMessage(), th);
            }
        }
        return str;
    }

    public static boolean getRevenue(Context context) {
        int i = 2 % 2;
        int i2 = e + 49;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i4 = registerClient;
                int i5 = i4 + 51;
                e = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 79;
                e = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 46 / 0;
                }
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            int i9 = e + 87;
            registerClient = i9 % 128;
            if (i9 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (PackageManager.NameNotFoundException e2) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e2);
            return false;
        }
    }

    private String AFAdRevenueData(Context context, String str) {
        int i = 2 % 2;
        if (context != null) {
            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
            return getMonetizationNetwork().getMediationNetwork().getRevenue(str);
        }
        int i2 = registerClient + 65;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        registerClient = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        int i = 2 % 2;
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
                int i2 = e + 73;
                registerClient = i2 % 128;
                int i3 = i2 % 2;
            } catch (JSONException e2) {
                AFLogger.afErrorLog(e2.getMessage(), e2);
            }
        }
        if (str2 != null) {
            int i4 = registerClient + 119;
            e = i4 % 128;
            int i5 = i4 % 2;
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            int i6 = registerClient + 103;
            e = i6 % 128;
            int i7 = i6 % 2;
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            getMediationNetwork("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    private static void AFAdRevenueData(String str) {
        int i = 2 % 2;
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                return;
            }
            int i2 = registerClient + 117;
            e = i2 % 128;
            int i3 = i2 % 2;
            getMediationNetwork("preInstallName", str);
            int i4 = registerClient + 65;
            e = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException e2) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e2);
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        int i = 2 % 2;
        int i2 = registerClient + 101;
        e = i2 % 128;
        int i3 = i2 % 2;
        if (AFf1mSDK.component4()) {
            return null;
        }
        AFd1kSDK monetizationNetwork = aFb1rSDK.getMonetizationNetwork();
        AFe1aSDK copy = monetizationNetwork.copy();
        copy.AFAdRevenueData.execute(copy.new AnonymousClass2(new AFf1mSDK(monetizationNetwork)));
        int i4 = e + 113;
        registerClient = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i = 2 % 2;
        int i2 = e + 25;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        getMonetizationNetwork().getMediationNetwork();
        boolean monetizationNetwork = AFd1qSDK.getMonetizationNetwork(context);
        int i4 = e + 103;
        registerClient = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return monetizationNetwork;
    }

    public static String getMonetizationNetwork(AFd1rSDK aFd1rSDK, String str) {
        int i = 2 % 2;
        int i2 = registerClient + 59;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String monetizationNetwork = aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            if (monetizationNetwork == null) {
                aFd1rSDK.AFAdRevenueData("CACHED_CHANNEL", str);
                return str;
            }
            int i3 = registerClient + 103;
            e = i3 % 128;
            if (i3 % 2 != 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        int i = 2 % 2;
        int i2 = e + 55;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        String AFAdRevenueData2 = getMonetizationNetwork().getMediationNetwork().AFAdRevenueData(context);
        int i4 = e + 79;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
        return AFAdRevenueData2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public static synchronized SharedPreferences h_(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFb1rSDK.class) {
            int i = 2 % 2;
            int i2 = e + 1;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            if (getRevenue().hashCode == null) {
                int i4 = registerClient + 47;
                e = i4 % 128;
                StrictMode.ThreadPolicy threadPolicy = i4 % 2;
                try {
                    if (threadPolicy == 0) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        getRevenue().hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = allowThreadDiskReads;
                    } else {
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        getRevenue().hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = allowThreadDiskReads2;
                    }
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            }
            sharedPreferences = getRevenue().hashCode;
        }
        return sharedPreferences;
    }

    public final AFd1rSDK getMonetizationNetwork(Context context) {
        int i = 2 % 2;
        int i2 = registerClient + 63;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
            AFd1rSDK revenue = getMonetizationNetwork().getRevenue();
            int i3 = registerClient + 111;
            e = i3 % 128;
            int i4 = i3 % 2;
            return revenue;
        }
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        getMonetizationNetwork().getRevenue();
        throw null;
    }

    public static int getMediationNetwork(AFd1rSDK aFd1rSDK, boolean z) {
        int i = 2 % 2;
        int i2 = registerClient + 51;
        e = i2 % 128;
        int i3 = i2 % 2;
        int revenue = getRevenue(aFd1rSDK, "appsFlyerCount", z);
        int i4 = e + 9;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
        return revenue;
    }

    private static int getCurrencyIso4217Code(AFd1rSDK aFd1rSDK, boolean z) {
        int i = 2 % 2;
        int i2 = registerClient + 43;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            getRevenue(aFd1rSDK, "appsFlyerInAppEventCount", z);
            throw null;
        }
        int revenue = getRevenue(aFd1rSDK, "appsFlyerInAppEventCount", z);
        int i3 = e + 97;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
        return revenue;
    }

    private static int getRevenue(AFd1rSDK aFd1rSDK, String str, boolean z) {
        int i = 2 % 2;
        int i2 = registerClient + 33;
        e = i2 % 128;
        int i3 = i2 % 2;
        int mediationNetwork = aFd1rSDK.getMediationNetwork(str, 0);
        if (!z) {
            return mediationNetwork;
        }
        int i4 = e + 57;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
        int i6 = mediationNetwork + 1;
        aFd1rSDK.AFAdRevenueData(str, i6);
        return i6;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        int i = 2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("getAppsFlyerUID", new String[0]);
        if (context != null) {
            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
            AFd1qSDK mediationNetwork = getMonetizationNetwork().getMediationNetwork();
            return AFb1iSDK.getCurrencyIso4217Code(mediationNetwork.getMonetizationNetwork, mediationNetwork.getRevenue);
        }
        int i2 = e + 93;
        int i3 = i2 % 128;
        registerClient = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        e = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a1, code lost:
    
        if (r12 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
    
        r7 = r3.getApplicationContext();
        r3 = r1.getMonetizationNetwork().AFKeystoreWrapper();
        new java.lang.Thread(new com.appsflyer.internal.AFa1bSDK(r7, (java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r3}, -1684451992, 1684451992, java.lang.System.identityHashCode(r3)), r1.getMonetizationNetwork().getMediationNetwork(), r10, r11, r12, r13, r14, r15)).start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        if (r12 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String obj;
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        String str5 = (String) objArr[6];
        Map map = (Map) objArr[7];
        int i = 2 % 2;
        AFb1cSDK copydefault = aFb1rSDK.getMonetizationNetwork().copydefault();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        if (map == null) {
            int i2 = registerClient + 43;
            e = i2 % 128;
            int i3 = i2 % 2;
            obj = "";
        } else {
            obj = map.toString();
        }
        strArr[5] = obj;
        copydefault.getMediationNetwork("validateAndTrackInAppPurchase", strArr);
        if (!aFb1rSDK.isStopped()) {
            AFLogger.INSTANCE.i(AFh1vSDK.PURCHASE_VALIDATION, new StringBuilder("Validate in app called with parameters: ").append(str3).append(" ").append(str4).append(" ").append(str5).toString());
        }
        if (str != null && str4 != null && str2 != null && str5 != null) {
            int i4 = e + 71;
            registerClient = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
            return null;
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getMediationNetwork;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            int i6 = registerClient + 7;
            e = i6 % 128;
            int i7 = i6 % 2;
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i = 2 % 2;
        int i2 = e + 97;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        boolean currencyIso4217Code = getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code();
        int i4 = registerClient + 97;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return currencyIso4217Code;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        int i = 2 % 2;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i2 = e;
            int i3 = i2 + 73;
            registerClient = i3 % 128;
            z = i3 % 2 == 0;
            int i4 = i2 + 99;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
        } else {
            z = false;
        }
        getMonetizationNetwork().copydefault().getMediationNetwork("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (!z) {
            getMonetizationNetwork().i().AFAdRevenueData();
            int i6 = registerClient + 5;
            e = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        getMonetizationNetwork().i().component1();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String str3;
        int i = 2 % 2;
        int i2 = e + 83;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        if (AFc1sSDK.getMonetizationNetwork(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i4 = e + 69;
        registerClient = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            str3 = str.trim();
            int i5 = e + 31;
            registerClient = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str3 = "";
        }
        AFe1iSDK.getMonetizationNetwork(new AFe1hSDK(str3, str2.trim()));
        int i7 = e + 23;
        registerClient = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i = 2 % 2;
        int i2 = registerClient + 65;
        e = i2 % 128;
        int i3 = i2 % 2;
        String AFAdRevenueData2 = getMonetizationNetwork().AFInAppEventType().AFAdRevenueData();
        int i4 = registerClient + 89;
        e = i4 % 128;
        int i5 = i4 % 2;
        return AFAdRevenueData2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i = 2 % 2;
        int i2 = registerClient + 117;
        e = i2 % 128;
        int i3 = i2 % 2;
        AFe1iSDK AFInAppEventType2 = getMonetizationNetwork().AFInAppEventType();
        if (i3 != 0) {
            return AFInAppEventType2.getMediationNetwork();
        }
        AFInAppEventType2.getMediationNetwork();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = 2 % 2;
        int i3 = e + 113;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = TimeUnit.SECONDS.toMillis(i);
        int i5 = registerClient + 27;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
    }

    private AFj1sSDK[] component2() {
        int i = 2 % 2;
        int i2 = registerClient + 13;
        e = i2 % 128;
        int i3 = i2 % 2;
        AFj1uSDK equals = getMonetizationNetwork().equals();
        if (i3 != 0) {
            return equals.getCurrencyIso4217Code();
        }
        equals.getCurrencyIso4217Code();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    class AFa1tSDK implements Runnable {
        private final AFa1oSDK getMediationNetwork;

        AFa1tSDK(AFa1oSDK aFa1oSDK) {
            this.getMediationNetwork = aFa1oSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1rSDK.this.getRevenue(this.getMediationNetwork);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i = 2 % 2;
        int i2 = registerClient + 117;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            getMonetizationNetwork().AFInAppEventParameterName().getRevenue(pluginInfo);
        } else {
            Objects.requireNonNull(pluginInfo);
            getMonetizationNetwork().AFInAppEventParameterName().getRevenue(pluginInfo);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i = 2 % 2;
        int i2 = registerClient + 55;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            Objects.requireNonNull(appsFlyerConsent);
            getMonetizationNetwork().e().component1 = appsFlyerConsent;
            int i3 = e + 33;
            registerClient = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Objects.requireNonNull(appsFlyerConsent);
        getMonetizationNetwork().e().component1 = appsFlyerConsent;
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        int i = 2 % 2;
        AFe1aSDK copy = this.toString.copy();
        copy.AFAdRevenueData.execute(copy.new AnonymousClass2(new AFf1qSDK(this.toString, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i2 = e + 25;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void getMediationNetwork(String str) {
        int i = 2 % 2;
        AFLogger.INSTANCE.w(AFh1vSDK.SDK_LIFECYCLE, new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '").append(str).append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.").toString());
        int i2 = registerClient + 67;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
    }

    private static void equals() {
        int i = 2 % 2;
        int i2 = registerClient + 119;
        e = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.INSTANCE.w(AFh1vSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i4 = registerClient + 21;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    class AFa1vSDK implements AFe1dSDK {
        @Override // com.appsflyer.internal.AFe1dSDK
        public final void getMediationNetwork(AFe1eSDK<?> aFe1eSDK) {
        }

        AFa1vSDK() {
        }

        @Override // com.appsflyer.internal.AFe1dSDK
        public final void getCurrencyIso4217Code(AFe1eSDK<?> aFe1eSDK) {
            if (aFe1eSDK instanceof AFf1fSDK) {
                AFb1rSDK.this.getMonetizationNetwork().component3().getRevenue(((AFf1eSDK) aFe1eSDK).component3.component1);
            }
        }

        @Override // com.appsflyer.internal.AFe1dSDK
        public final void getMonetizationNetwork(AFe1eSDK<?> aFe1eSDK, AFe1cSDK aFe1cSDK) {
            JSONObject AFAdRevenueData;
            AFg1mSDK mediationNetwork;
            if (aFe1eSDK instanceof AFf1eSDK) {
                AFf1eSDK aFf1eSDK = (AFf1eSDK) aFe1eSDK;
                boolean z = aFe1eSDK instanceof AFf1fSDK;
                if (z && AFAdRevenueData()) {
                    AFf1fSDK aFf1fSDK = (AFf1fSDK) aFe1eSDK;
                    if (aFf1fSDK.getMediationNetwork == AFe1cSDK.SUCCESS || aFf1fSDK.AFAdRevenueData == 1) {
                        AFg1cSDK aFg1cSDK = new AFg1cSDK(aFf1fSDK, AFb1rSDK.this.getMonetizationNetwork().getRevenue());
                        AFe1aSDK copy = AFb1rSDK.this.getMonetizationNetwork().copy();
                        copy.AFAdRevenueData.execute(copy.new AnonymousClass2(aFg1cSDK));
                    }
                }
                if (aFe1cSDK == AFe1cSDK.SUCCESS) {
                    AFb1rSDK aFb1rSDK = AFb1rSDK.this;
                    aFb1rSDK.getMonetizationNetwork(aFb1rSDK.component4).AFAdRevenueData("sentSuccessfully", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    if (!(aFe1eSDK instanceof AFf1cSDK) && (mediationNetwork = new AFg1jSDK(AFb1rSDK.this.component4).getMediationNetwork()) != null && mediationNetwork.getCurrencyIso4217Code()) {
                        String str = mediationNetwork.getRevenue;
                        AFLogger.INSTANCE.d(AFh1vSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFg1jSDK.getMediationNetwork(str);
                    }
                    ResponseNetwork responseNetwork = ((AFf1oSDK) aFf1eSDK).component4;
                    if (responseNetwork != null && (AFAdRevenueData = AFc1uSDK.AFAdRevenueData((String) responseNetwork.getBody())) != null) {
                        AFb1rSDK.this.component2 = AFAdRevenueData.optBoolean("send_background", false);
                    }
                    if (z) {
                        AFb1rSDK.this.areAllFieldsValid = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFe1eSDK instanceof AFg1cSDK) || aFe1cSDK == AFe1cSDK.SUCCESS) {
                return;
            }
            AFg1bSDK aFg1bSDK = new AFg1bSDK(AFb1rSDK.this.getMonetizationNetwork());
            AFe1aSDK copy2 = AFb1rSDK.this.getMonetizationNetwork().copy();
            copy2.AFAdRevenueData.execute(copy2.new AnonymousClass2(aFg1bSDK));
        }

        private boolean AFAdRevenueData() {
            return AFb1rSDK.this.getMonetizationNetwork != null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        aFh1eSDK.areAllFieldsValid = str;
        aFh1eSDK.getMediationNetwork = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFh1vSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1eSDK.getRevenue(singletonMap);
        }
        aFh1eSDK.getCurrencyIso4217Code = hashMap;
        AFb1cSDK copydefault = getMonetizationNetwork().copydefault();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject(aFh1eSDK.getCurrencyIso4217Code == null ? new HashMap() : aFh1eSDK.getCurrencyIso4217Code).toString();
        copydefault.getMediationNetwork("logEvent", strArr);
        if (str == null) {
            getCurrencyIso4217Code(context, AFh1qSDK.logEvent);
        }
        getRevenue(aFh1eSDK, component3(context));
    }

    static void areAllFieldsValid() {
        AFInAppEventParameterName = new char[]{61619, 61630, 61617, 61516, 61627, 61511, 61631, 61517, 61504};
        values = -552931120;
        valueOf = true;
        AFInAppEventType = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copydefault() {
        getCurrencyIso4217Code(new Object[]{this}, -927250196, 927250219, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        getCurrencyIso4217Code(new Object[]{this, context, str, str2, str3, str4, str5, map}, 123597494, -123597492, System.identityHashCode(this));
    }

    final void component4() {
        getCurrencyIso4217Code(new Object[]{this}, -1730576944, 1730576958, System.identityHashCode(this));
    }

    private static void component2(Context context) {
        getCurrencyIso4217Code(new Object[]{context}, 2054602482, -2054602479, (int) System.currentTimeMillis());
    }

    private void getRevenue(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -1216379940, 1216379960, System.identityHashCode(this));
    }

    private void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFa1oSDK}, 1781271842, -1781271820, System.identityHashCode(this));
    }

    public static String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, long j) {
        return (String) getCurrencyIso4217Code(new Object[]{simpleDateFormat, Long.valueOf(j)}, 1382084704, -1382084693, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, context, str, map}, 1252837027, -1252837011, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        getCurrencyIso4217Code(new Object[]{this, context}, -1799167514, 1799167526, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        getCurrencyIso4217Code(new Object[]{this, strArr}, 1539108454, -1539108439, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z)}, 1505293153, -1505293144, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        getCurrencyIso4217Code(new Object[]{this, str, context}, 231975276, -231975269, System.identityHashCode(this));
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{str}, -1187185472, 1187185472, (int) System.currentTimeMillis())).booleanValue();
    }

    private static String getRevenue(String str) {
        return (String) getCurrencyIso4217Code(new Object[]{str}, 143536171, -143536152, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        getCurrencyIso4217Code(new Object[]{this, str}, 1241603377, -1241603372, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, 2001963572, -2001963566, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z), context}, -2043587704, 2043587717, System.identityHashCode(this));
    }

    public final void g_(Context context, Intent intent) {
        getCurrencyIso4217Code(new Object[]{this, context, intent}, -687234173, 687234177, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z)}, -1685759045, 1685759055, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, str, map}, -1784713538, 1784713556, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        getCurrencyIso4217Code(new Object[]{this, deepLinkListener, Long.valueOf(j)}, 1858628735, -1858628714, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        getCurrencyIso4217Code(new Object[]{this, str, map}, -1888684226, 1888684227, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getCurrencyIso4217Code(new Object[]{this, strArr}, -2050013962, 2050013970, System.identityHashCode(this));
    }

    public final void AFAdRevenueData(Context context) {
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
    }
}
