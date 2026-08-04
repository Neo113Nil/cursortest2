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
import com.android.installreferrer.api.InstallReferrerClient;
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
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass2;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.UnsupportedEncodingException;
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

/* JADX INFO: loaded from: classes.dex */
public final class AFb1rSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static char[] AFInAppEventParameterName = null;
    private static boolean AFInAppEventType = false;
    private static AFb1rSDK component3 = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f64e = 1;
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

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1rSDK$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
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

    public class AFa1tSDK implements Runnable {
        private final AFa1oSDK getMediationNetwork;

        public AFa1tSDK(AFa1oSDK aFa1oSDK) {
            this.getMediationNetwork = aFa1oSDK;
        }

        @Override // java.lang.Runnable
        public final void run() throws UnsupportedEncodingException {
            AFb1rSDK.this.getRevenue(this.getMediationNetwork);
        }
    }

    public class AFa1vSDK implements AFe1dSDK {
        public AFa1vSDK() {
        }

        private boolean AFAdRevenueData() {
            return AFb1rSDK.this.getMonetizationNetwork != null;
        }

        @Override // com.appsflyer.internal.AFe1dSDK
        public final void getCurrencyIso4217Code(AFe1eSDK<?> aFe1eSDK) {
            if (aFe1eSDK instanceof AFf1fSDK) {
                AFb1rSDK.this.getMonetizationNetwork().component3().getRevenue(((AFf1eSDK) aFe1eSDK).component3.component1);
            }
        }

        @Override // com.appsflyer.internal.AFe1dSDK
        public final void getMediationNetwork(AFe1eSDK<?> aFe1eSDK) {
        }

        @Override // com.appsflyer.internal.AFe1dSDK
        public final void getMonetizationNetwork(AFe1eSDK<?> aFe1eSDK, AFe1cSDK aFe1cSDK) {
            JSONObject jSONObjectAFAdRevenueData;
            AFg1mSDK mediationNetwork;
            if (!(aFe1eSDK instanceof AFf1eSDK)) {
                if (!(aFe1eSDK instanceof AFg1cSDK) || aFe1cSDK == AFe1cSDK.SUCCESS) {
                    return;
                }
                AFg1bSDK aFg1bSDK = new AFg1bSDK(AFb1rSDK.this.getMonetizationNetwork());
                AFe1aSDK aFe1aSDKCopy = AFb1rSDK.this.getMonetizationNetwork().copy();
                aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(aFg1bSDK));
                return;
            }
            AFf1eSDK aFf1eSDK = (AFf1eSDK) aFe1eSDK;
            boolean z = aFe1eSDK instanceof AFf1fSDK;
            if (z && AFAdRevenueData()) {
                AFf1fSDK aFf1fSDK = (AFf1fSDK) aFe1eSDK;
                boolean z2 = true;
                if (aFf1fSDK.getMediationNetwork != AFe1cSDK.SUCCESS && aFf1fSDK.AFAdRevenueData != 1) {
                    z2 = false;
                }
                if (z2) {
                    AFg1cSDK aFg1cSDK = new AFg1cSDK(aFf1fSDK, AFb1rSDK.this.getMonetizationNetwork().getRevenue());
                    AFe1aSDK aFe1aSDKCopy2 = AFb1rSDK.this.getMonetizationNetwork().copy();
                    aFe1aSDKCopy2.AFAdRevenueData.execute(aFe1aSDKCopy2.new AnonymousClass2(aFg1cSDK));
                }
            }
            if (aFe1cSDK == AFe1cSDK.SUCCESS) {
                AFb1rSDK aFb1rSDK = AFb1rSDK.this;
                aFb1rSDK.getMonetizationNetwork(aFb1rSDK.component4).AFAdRevenueData("sentSuccessfully", "true");
                if (!(aFe1eSDK instanceof AFf1cSDK) && (mediationNetwork = new AFg1jSDK(AFb1rSDK.this.component4).getMediationNetwork()) != null && mediationNetwork.getCurrencyIso4217Code()) {
                    String str = mediationNetwork.getRevenue;
                    AFLogger.INSTANCE.d(AFh1vSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFg1jSDK.getMediationNetwork(str);
                }
                ResponseNetwork responseNetwork = ((AFf1oSDK) aFf1eSDK).component4;
                if (responseNetwork != null && (jSONObjectAFAdRevenueData = AFc1uSDK.AFAdRevenueData((String) responseNetwork.getBody())) != null) {
                    AFb1rSDK.this.component2 = jSONObjectAFAdRevenueData.optBoolean("send_background", false);
                }
                if (z) {
                    AFb1rSDK.this.areAllFieldsValid = System.currentTimeMillis();
                }
            }
        }
    }

    static {
        areAllFieldsValid();
        getCurrencyIso4217Code = "331";
        AFAdRevenueData = "6.15";
        StringBuilder sb = new StringBuilder();
        sb.append("6.15");
        sb.append("/androidevent?buildnumber=6.15.2&app_id=");
        getRevenue = sb.toString();
        getMediationNetwork = null;
        component3 = new AFb1rSDK();
        int i2 = registerClient + 113;
        f64e = i2 % 128;
        if ((i2 % 2 == 0 ? '-' : ',') != ',') {
            int i3 = 41 / 0;
        }
    }

    public AFb1rSDK() {
        AFVersionDeclaration.init();
        this.toString = new AFd1oSDK();
        getMonetizationNetwork().i().getMediationNetwork();
        getMonetizationNetwork().i().AFAdRevenueData();
        AFe1aSDK aFe1aSDKCopy = getMonetizationNetwork().copy();
        aFe1aSDKCopy.getRevenue.add(new AFa1vSDK());
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        Map<String, String> map = (Map) objArr[2];
        int i2 = f64e + 119;
        registerClient = i2 % 128;
        if (i2 % 2 == 0) {
            AFc1kSDK aFc1kSDKD = aFb1rSDK.getMonetizationNetwork().d();
            aFc1kSDKD.getMediationNetwork = str;
            aFc1kSDKD.getCurrencyIso4217Code = map;
            return null;
        }
        AFc1kSDK aFc1kSDKD2 = aFb1rSDK.getMonetizationNetwork().d();
        aFc1kSDKD2.getMediationNetwork = str;
        aFc1kSDKD2.getCurrencyIso4217Code = map;
        int i3 = 1 / 0;
        return null;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        int i2 = registerClient + 101;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        if (AFf1mSDK.component4()) {
            return null;
        }
        AFd1kSDK monetizationNetwork = aFb1rSDK.getMonetizationNetwork();
        AFe1aSDK aFe1aSDKCopy = monetizationNetwork.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(new AFf1mSDK(monetizationNetwork)));
        int i4 = f64e + 113;
        registerClient = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i2 = registerClient + 121;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        aFb1rSDK.getMonetizationNetwork().d().component1 = strArr;
        int i4 = registerClient + 121;
        f64e = i4 % 128;
        if ((i4 % 2 == 0 ? 'R' : '5') == '5') {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) throws UnsupportedEncodingException {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        getCurrencyIso4217Code(new Object[]{aFb1rSDK, (Context) objArr[2]}, -608775197, 608775214, System.identityHashCode(aFb1rSDK));
        AFd1kSDK monetizationNetwork = aFb1rSDK.getMonetizationNetwork();
        monetizationNetwork.AFKeystoreWrapper().getCurrencyIso4217Code(zBooleanValue);
        monetizationNetwork.getMonetizationNetwork().submit(new a(1, monetizationNetwork));
        if (zBooleanValue) {
            int i2 = f64e + 21;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            monetizationNetwork.getRevenue().getRevenue("is_stop_tracking_used", true);
        }
        int i4 = registerClient + 15;
        f64e = i4 % 128;
        if ((i4 % 2 != 0 ? (char) 25 : (char) 15) != 25) {
            int i5 = 18 / 0;
        }
        return null;
    }

    private AFh1mSDK component3(Context context) {
        int i2 = registerClient + 81;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        if (!(context instanceof Activity)) {
            return null;
        }
        AFh1mSDK aFh1mSDK = new AFh1mSDK((Activity) context, getMonetizationNetwork().AFLogger());
        int i4 = registerClient + 125;
        f64e = i4 % 128;
        if ((i4 % 2 == 0 ? 'A' : '<') != 'A') {
            return aFh1mSDK;
        }
        throw null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) throws UnsupportedEncodingException {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i2 = registerClient + 63;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        aFb1rSDK.start(context, null);
        int i4 = registerClient + 93;
        f64e = i4 % 128;
        if ((i4 % 2 == 0 ? 'G' : 'J') != 'G') {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r8.isEmpty() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if ((r8.isEmpty() ? 22 : 'c') != 22) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r0 = new java.lang.StringBuilder("Setting partner data for ");
        r0.append(r3);
        r0.append(": ");
        r0.append(r8);
        com.appsflyer.AFLogger.afDebugLog(r0.toString());
        r0 = new org.json.JSONObject(r8).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if (r0 <= 1000) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r8 = new java.util.HashMap();
        r8.put("error", "limit exceeded: ".concat(java.lang.String.valueOf(r0)));
        r1.getRevenue.put(r3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        r1.getCurrencyIso4217Code.put(r3, r8);
        r1.getRevenue.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object copy(Object[] objArr) {
        String strConcat;
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        Map map = (Map) objArr[2];
        AFd1tSDK aFd1tSDKE = aFb1rSDK.getMonetizationNetwork().e();
        if (aFd1tSDKE.getMonetizationNetwork == null) {
            aFd1tSDKE.getMonetizationNetwork = new AFc1aSDK();
        }
        AFc1aSDK aFc1aSDK = aFd1tSDKE.getMonetizationNetwork;
        if (str != null) {
            if ((str.isEmpty() ? 'E' : '2') != 'E') {
                if ((map != null ? '-' : 'a') != 'a') {
                    int i2 = f64e + 31;
                    registerClient = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 51 / 0;
                    }
                }
                if (aFc1aSDK.getCurrencyIso4217Code.remove(str) != null) {
                    strConcat = "Cleared partner data for ".concat(str);
                } else {
                    int i4 = f64e + 125;
                    registerClient = i4 % 128;
                    int i5 = i4 % 2;
                    strConcat = "Partner data is missing or `null`";
                }
                AFLogger.afWarnLog(strConcat);
                return null;
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    private static /* synthetic */ Object copydefault(Object[] objArr) {
        boolean z;
        boolean z2 = false;
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = f64e + 39;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            z = true;
        } else {
            int i4 = f64e + 11;
            registerClient = i4 % 128;
            if (!(i4 % 2 == 0) ? AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true) : AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                int i5 = f64e + 125;
                registerClient = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            } else {
                z = true;
            }
        }
        if ((!z ? 'V' : (char) 21) == 'V') {
            if (map.get("advertiserId") != null) {
                try {
                    if (AFc1sSDK.getRevenue(aFb1rSDK.getMonetizationNetwork().e().getRevenue)) {
                        if (map.remove("android_id") == null) {
                            z2 = true;
                        }
                        if (!z2) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                    }
                    if (AFc1sSDK.getRevenue(aFb1rSDK.getMonetizationNetwork().AFKeystoreWrapper().getRevenue())) {
                        if ((map.remove("imei") != null ? (char) 17 : 'V') != 'V') {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        }
                    }
                    return null;
                } catch (Exception e2) {
                    AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e2);
                }
            }
        }
        return null;
    }

    private static /* synthetic */ Object equals(Object[] objArr) throws UnsupportedEncodingException {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        Map<String, Object> map = (Map) objArr[3];
        int i2 = registerClient + 105;
        f64e = i2 % 128;
        char c2 = i2 % 2 == 0 ? (char) 6 : '_';
        aFb1rSDK.logEvent(context, str, map, null);
        if (c2 == 6) {
            int i3 = 52 / 0;
        }
        int i4 = registerClient + 21;
        f64e = i4 % 128;
        if ((i4 % 2 == 0 ? '\t' : (char) 27) == 27) {
            return null;
        }
        throw null;
    }

    private static int getCurrencyIso4217Code(AFd1rSDK aFd1rSDK, boolean z) {
        int i2 = registerClient + 43;
        f64e = i2 % 128;
        if (!(i2 % 2 != 0)) {
            getRevenue(aFd1rSDK, "appsFlyerInAppEventCount", z);
            throw null;
        }
        int revenue = getRevenue(aFd1rSDK, "appsFlyerInAppEventCount", z);
        int i3 = f64e + 97;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
        return revenue;
    }

    public static int getMediationNetwork(AFd1rSDK aFd1rSDK, boolean z) {
        int i2 = registerClient + 51;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        int revenue = getRevenue(aFd1rSDK, "appsFlyerCount", z);
        int i4 = f64e + 9;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
        return revenue;
    }

    private static int getRevenue(AFd1rSDK aFd1rSDK, String str, boolean z) {
        int i2 = registerClient + 33;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        int mediationNetwork = aFd1rSDK.getMediationNetwork(str, 0);
        if (!(z)) {
            return mediationNetwork;
        }
        int i4 = f64e + 57;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
        int i6 = mediationNetwork + 1;
        aFd1rSDK.AFAdRevenueData(str, i6);
        return i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    public static synchronized SharedPreferences h_(Context context) {
        int i2 = f64e + 1;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        if ((getRevenue().hashCode == null ? '4' : 'W') == '4') {
            int i4 = registerClient + 47;
            f64e = i4 % 128;
            ?? r1 = i4 % 2 == 0 ? 52 : 20;
            try {
                if (r1 != 52) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    getRevenue().hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    r1 = threadPolicyAllowThreadDiskReads;
                } else {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                    getRevenue().hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    r1 = threadPolicyAllowThreadDiskReads2;
                }
                StrictMode.setThreadPolicy(r1);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(r1);
                throw th;
            }
        }
        return getRevenue().hashCode;
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        String str = (String) objArr[0];
        int i2 = f64e + 121;
        registerClient = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 17 : '!') == 17) {
            AppsFlyerProperties.getInstance().getString(str);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i3 = f64e + 3;
        registerClient = i3 % 128;
        if ((i3 % 2 != 0 ? 'I' : '\'') != '\'') {
            int i4 = 36 / 0;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    public /* synthetic */ void i_(Context context, Intent intent) throws UnsupportedEncodingException {
        Uri data;
        boolean z;
        int i2 = registerClient + 13;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFc1kSDK aFc1kSDKD = getMonetizationNetwork().d();
        AFd1rSDK revenue = getMonetizationNetwork().getRevenue();
        if (intent == null) {
            data = null;
        } else {
            if (("android.intent.action.VIEW".equals(intent.getAction()) ? 'U' : '8') != '8') {
                int i4 = registerClient + 11;
                f64e = i4 % 128;
                if (i4 % 2 == 0) {
                    intent.getData();
                    throw null;
                }
                data = intent.getData();
            } else {
                data = null;
            }
        }
        if ((data != null ? 'G' : 'E') == 'E' || data.toString().isEmpty()) {
            z = false;
        } else {
            int i5 = registerClient + 109;
            f64e = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if ((revenue.getMediationNetwork("ddl_sent") ? 'O' : '4') == 'O' && !z) {
            aFc1kSDKD.getMonetizationNetwork("No direct deep link", null);
            return;
        }
        aFc1kSDKD.n_(AFc1oSDK.AFAdRevenueData(aFc1kSDKD.areAllFieldsValid.afInfoLog()), intent, context);
        int i7 = f64e + 31;
        registerClient = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i2 = registerClient + 51;
        f64e = i2 % 128;
        if ((i2 % 2 == 0 ? '0' : '.') == '0') {
            AFd1oSDK aFd1oSDK = aFb1rSDK.toString;
            throw null;
        }
        AFd1oSDK aFd1oSDK2 = aFb1rSDK.toString;
        if ((context != null ? (char) 17 : 'C') != 'C') {
            AFd1nSDK aFd1nSDK = aFd1oSDK2.getCurrencyIso4217Code;
            if (context != null) {
                aFd1nSDK.AFAdRevenueData = context.getApplicationContext();
                int i3 = registerClient + 33;
                f64e = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return null;
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        DeepLinkListener deepLinkListener = (DeepLinkListener) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i2 = registerClient + 101;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        aFb1rSDK.getMonetizationNetwork().d().getMonetizationNetwork = deepLinkListener;
        aFb1rSDK.getMonetizationNetwork().d().component3 = jLongValue;
        int i4 = registerClient + 111;
        f64e = i4 % 128;
        if ((i4 % 2 == 0 ? '$' : (char) 6) != 6) {
            int i5 = 17 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i2 = f64e + 35;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = getMonetizationNetwork().d().AFAdRevenueData;
        if (list.contains(listAsList)) {
            return;
        }
        int i4 = registerClient + 77;
        f64e = i4 % 128;
        int i5 = i4 % 2;
        list.add(listAsList);
        int i6 = registerClient + 121;
        f64e = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i2 = registerClient + 25;
        f64e = i2 % 128;
        if ((i2 % 2 == 0 ? 'X' : (char) 28) != 'X') {
            getMonetizationNetwork().copydefault().getMediationNetwork("anonymizeUser", String.valueOf(z));
        } else {
            AFb1cSDK aFb1cSDKCopydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            aFb1cSDKCopydefault.getMediationNetwork("anonymizeUser", strArr);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, str, map}, -1888684226, 1888684227, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i2 = f64e + 117;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().unregisterClient().AFAdRevenueData(z);
        int i4 = registerClient + 37;
        f64e = i4 % 128;
        if (!(i4 % 2 != 0)) {
            int i5 = 96 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        int i2 = registerClient + 31;
        f64e = i2 % 128;
        boolean z2 = i2 % 2 == 0;
        getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
        if (z2) {
            throw null;
        }
    }

    public final void g_(Context context, Intent intent) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, context, intent}, -687234173, 687234177, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) throws UnsupportedEncodingException {
        getMonetizationNetwork().copydefault().getMediationNetwork("getAppsFlyerUID", new String[0]);
        if (!(context == null)) {
            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
            AFd1qSDK mediationNetwork = getMonetizationNetwork().getMediationNetwork();
            return AFb1iSDK.getCurrencyIso4217Code(mediationNetwork.getMonetizationNetwork, mediationNetwork.getRevenue);
        }
        int i2 = f64e + 93;
        int i3 = i2 % 128;
        registerClient = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        f64e = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) throws UnsupportedEncodingException {
        int i2 = f64e + 55;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        String strAFAdRevenueData = getMonetizationNetwork().getMediationNetwork().AFAdRevenueData(context);
        int i4 = f64e + 79;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
        return strAFAdRevenueData;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i2 = registerClient + 65;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        String strAFAdRevenueData = getMonetizationNetwork().AFInAppEventType().AFAdRevenueData();
        int i4 = registerClient + 89;
        f64e = i4 % 128;
        int i5 = i4 % 2;
        return strAFAdRevenueData;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i2 = registerClient + 117;
        f64e = i2 % 128;
        if (i2 % 2 != 0) {
            return getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
        }
        getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
        throw null;
    }

    public final AFd1kSDK getMonetizationNetwork() {
        int i2 = f64e;
        int i3 = i2 + 5;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
        AFd1oSDK aFd1oSDK = this.toString;
        int i5 = i2 + 17;
        registerClient = i5 % 128;
        int i6 = i5 % 2;
        return aFd1oSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) throws UnsupportedEncodingException {
        int i2 = registerClient + 99;
        f64e = i2 % 128;
        if (!(i2 % 2 != 0)) {
            AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        String strAFAdRevenueData = AFAdRevenueData(context, "AF_STORE");
        if (strAFAdRevenueData == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i3 = registerClient + 81;
        f64e = i3 % 128;
        int i4 = i3 % 2;
        return strAFAdRevenueData;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, 2001963572, -2001963566, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) throws UnsupportedEncodingException {
        String str2;
        int i2 = f64e + 27;
        int i3 = i2 % 128;
        registerClient = i3;
        int i4 = i2 % 2;
        int i5 = 0;
        if (!(!this.equals)) {
            int i6 = i3 + 51;
            f64e = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }
        this.equals = true;
        getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code(str);
        if (!(context == null)) {
            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
            Application applicationF_ = AFb1qSDK.f_(context);
            if (applicationF_ == null) {
                return this;
            }
            this.component4 = applicationF_;
            getMonetizationNetwork().valueOf().getMonetizationNetwork();
            getMonetizationNetwork().component3().getMediationNetwork = System.currentTimeMillis();
            AFe1aSDK aFe1aSDKCopy = getMonetizationNetwork().copy();
            aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(new AFf1pSDK(getMonetizationNetwork())));
            AFi1qSDK aFi1qSDKRegisterClient = getMonetizationNetwork().registerClient();
            aFi1qSDKRegisterClient.getMediationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1lSDK(aFi1qSDKRegisterClient.getCurrencyIso4217Code) : new AFi1sSDK(aFi1qSDKRegisterClient.getCurrencyIso4217Code);
            getMonetizationNetwork().afErrorLog().getCurrencyIso4217Code(new e(this));
            getMonetizationNetwork().component2().AFAdRevenueData(getMediationNetwork());
            AFj1uSDK aFj1uSDKEquals = getMonetizationNetwork().equals();
            f fVar = new f(this, i5);
            AFi1eSDK aFi1eSDKAFAdRevenueData = aFj1uSDKEquals.AFAdRevenueData(fVar);
            Runnable revenue = aFj1uSDKEquals.getRevenue(aFi1eSDKAFAdRevenueData, fVar);
            aFj1uSDKEquals.getMonetizationNetwork(aFi1eSDKAFAdRevenueData);
            aFj1uSDKEquals.getMonetizationNetwork(new AFj1lSDK(aFj1uSDKEquals.AFAdRevenueData.getMediationNetwork(), revenue));
            aFj1uSDKEquals.getMonetizationNetwork(new AFj1zSDK(revenue, aFj1uSDKEquals.AFAdRevenueData, new AFj1ySDK()));
            aFj1uSDKEquals.getMonetizationNetwork(new AFj1pSDK(revenue, aFj1uSDKEquals.AFAdRevenueData));
            if (aFj1uSDKEquals.AFAdRevenueData.afDebugLog().AFAdRevenueData(AFg1hSDK.IS_SAMSUNG_PRELOAD_REFERRER_COLLECTION_ENABLED)) {
                aFj1uSDKEquals.getMonetizationNetwork(new AFj1rSDK(aFj1uSDKEquals.AFAdRevenueData.getMonetizationNetwork(), aFj1uSDKEquals.AFAdRevenueData.getMediationNetwork(), revenue));
            }
            aFj1uSDKEquals.getCurrencyIso4217Code(revenue);
            if (!aFj1uSDKEquals.AFAdRevenueData()) {
                Context context2 = aFj1uSDKEquals.AFAdRevenueData.values().AFAdRevenueData;
                AFd1kSDK aFd1kSDK = aFj1uSDKEquals.AFAdRevenueData;
                List<ResolveInfo> listQueryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if ((listQueryIntentContentProviders != null) && !listQueryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                    while (true) {
                        if ((it.hasNext() ? (char) 15 : '$') != 15) {
                            break;
                        }
                        int i8 = f64e + 25;
                        registerClient = i8 % 128;
                        int i9 = i8 % 2;
                        ProviderInfo providerInfo = it.next().providerInfo;
                        if (providerInfo != null) {
                            arrayList.add(new AFj1tSDK(providerInfo, revenue, aFd1kSDK));
                        } else {
                            AFLogger.INSTANCE.w(AFh1vSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                            int i10 = registerClient + 53;
                            f64e = i10 % 128;
                            int i11 = i10 % 2;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        aFj1uSDKEquals.getMonetizationNetwork.addAll(arrayList);
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1vSDK aFh1vSDK = AFh1vSDK.PREINSTALL;
                        StringBuilder sb = new StringBuilder("Detected ");
                        sb.append(arrayList.size());
                        sb.append(" valid preinstall provider(s)");
                        aFLogger.d(aFh1vSDK, sb.toString());
                    }
                }
            }
            AFj1sSDK[] currencyIso4217Code = aFj1uSDKEquals.getCurrencyIso4217Code();
            int length = currencyIso4217Code.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = registerClient + 59;
                f64e = i13 % 128;
                if (i13 % 2 == 0) {
                    currencyIso4217Code[i12].getMediationNetwork(aFj1uSDKEquals.AFAdRevenueData.values().AFAdRevenueData);
                    i12 += 52;
                } else {
                    currencyIso4217Code[i12].getMediationNetwork(aFj1uSDKEquals.AFAdRevenueData.values().AFAdRevenueData);
                    i12++;
                }
            }
            if (getMonetizationNetwork().afDebugLog().AFAdRevenueData(AFg1hSDK.IS_PLAY_INTEGRITY_DATA_COLLECTION_ENABLED)) {
                component1();
            }
            this.toString.AFKeystoreWrapper().getMediationNetwork(getMonetizationNetwork().getMediationNetwork());
        } else {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFb1cSDK aFb1cSDKCopydefault = getMonetizationNetwork().copydefault();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            int i14 = registerClient;
            int i15 = i14 + 103;
            f64e = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            int i16 = i14 + 13;
            f64e = i16 % 128;
            int i17 = i16 % 2;
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        aFb1cSDKCopydefault.getMediationNetwork("init", strArr);
        AFLogger.INSTANCE.force(AFh1vSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.15.2", getCurrencyIso4217Code));
        this.getMonetizationNetwork = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) throws UnsupportedEncodingException {
        int i2 = f64e + 25;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        getMonetizationNetwork().getMediationNetwork();
        boolean monetizationNetwork = AFd1qSDK.getMonetizationNetwork(context);
        int i4 = f64e + 103;
        registerClient = i4 % 128;
        if (i4 % 2 == 0) {
            return monetizationNetwork;
        }
        int i5 = 40 / 0;
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i2 = f64e + 97;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        boolean currencyIso4217Code = getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code();
        int i4 = registerClient + 97;
        f64e = i4 % 128;
        if ((i4 % 2 == 0 ? '&' : (char) 19) == 19) {
            return currencyIso4217Code;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r5.equals == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        getMediationNetwork("logAdRevenue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r6.areAllFieldsValid() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.w(com.appsflyer.internal.AFh1vSDK.registerClient, "Invalid ad revenue parameters provided");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r0 = '_';
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r0 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.w(com.appsflyer.internal.AFh1vSDK.registerClient, "SDK is stopped");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r0 = getMonetizationNetwork().AFKeystoreWrapper();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getRevenue((java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r0}, -1684451992, 1684451992, java.lang.System.identityHashCode(r0))) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        r6 = com.appsflyer.internal.AFb1rSDK.registerClient + 83;
        com.appsflyer.internal.AFb1rSDK.f64e = r6 % 128;
        r6 = r6 % 2;
        equals();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        getCurrencyIso4217Code(new java.lang.Object[]{r5, new com.appsflyer.internal.AFh1nSDK(r6, r7)}, 1781271842, -1781271820, java.lang.System.identityHashCode(r5));
        r6 = com.appsflyer.internal.AFb1rSDK.f64e + 49;
        com.appsflyer.internal.AFb1rSDK.registerClient = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5.equals == false) goto L12;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) throws UnsupportedEncodingException {
        int i2 = f64e + 9;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, context, str, map}, 1252837027, -1252837011, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d2, double d3) throws UnsupportedEncodingException {
        getMonetizationNetwork().copydefault().getMediationNetwork("logLocation", String.valueOf(d2), String.valueOf(d3));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d3));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d2));
        getRevenue(context, AFInAppEventType.LOCATION_COORDINATES, map);
        int i2 = registerClient + 61;
        f64e = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) throws UnsupportedEncodingException {
        int i2 = registerClient + 43;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("logSession", new String[0]);
        getMonetizationNetwork().copydefault().getRevenue();
        getCurrencyIso4217Code(context, AFh1qSDK.logSession);
        getRevenue(context, (String) null, (Map<String, Object>) null);
        int i4 = registerClient + 7;
        f64e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i2 = registerClient + 7;
        f64e = i2 % 128;
        if (!(i2 % 2 != 0)) {
            getMonetizationNetwork().w().AFAdRevenueData();
            throw null;
        }
        getMonetizationNetwork().w().AFAdRevenueData();
        int i3 = registerClient + 123;
        f64e = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) throws UnsupportedEncodingException {
        int i2 = f64e + 101;
        int i3 = i2 % 128;
        registerClient = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (uri != null) {
            int i4 = i3 + 75;
            f64e = i4 % 128;
            if (i4 % 2 == 0) {
                uri.toString().isEmpty();
                throw null;
            }
            if (!uri.toString().isEmpty()) {
                if (context != null) {
                    getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
                    getMonetizationNetwork().d().o_(AFc1oSDK.AFAdRevenueData(getMonetizationNetwork().afInfoLog()), Uri.parse(uri.toString()));
                    return;
                }
                AFc1kSDK aFc1kSDKD = getMonetizationNetwork().d();
                StringBuilder sb = new StringBuilder("Context is \"");
                sb.append(context);
                sb.append("\"");
                aFc1kSDKD.getMonetizationNetwork(sb.toString(), DeepLinkResult.Error.NETWORK);
                return;
            }
        }
        AFc1kSDK aFc1kSDKD2 = getMonetizationNetwork().d();
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        aFc1kSDKD2.getMonetizationNetwork(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if ((r6 == null ? '\f' : 2) != '\f') goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if ((r6 == null ? 16 : 'U') != 16) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r7 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        getMonetizationNetwork().d().getMonetizationNetwork("performOnDeepLinking was called with null context", com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR);
        r6 = com.appsflyer.internal.AFb1rSDK.f64e + 7;
        com.appsflyer.internal.AFb1rSDK.registerClient = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r7 = r7.getApplicationContext();
        getCurrencyIso4217Code(new java.lang.Object[]{r5, r7}, -608775197, 608775214, java.lang.System.identityHashCode(r5));
        getMonetizationNetwork().getMonetizationNetwork().execute(new com.appsflyer.internal.g(r5, r7, r6, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        getMonetizationNetwork().d().getMonetizationNetwork("performOnDeepLinking was called with null intent", com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performOnDeepLinking(Intent intent, Context context) throws UnsupportedEncodingException {
        int i2 = f64e + 71;
        registerClient = i2 % 128;
        int i3 = 0;
        if (!(i2 % 2 == 0)) {
            int i4 = 33 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i2 = f64e + 123;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("registerConversionListener", new String[0]);
        getCurrencyIso4217Code(appsFlyerConversionListener);
        int i4 = registerClient + 123;
        f64e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i2 = f64e + 117;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if ((appsFlyerInAppPurchaseValidatorListener == null ? ':' : (char) 11) == ':') {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            int i4 = f64e + 113;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        getMediationNetwork = appsFlyerInAppPurchaseValidatorListener;
        int i6 = registerClient + 103;
        f64e = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) throws UnsupportedEncodingException {
        int i2 = f64e + 33;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        PurchaseHandler purchaseHandlerAreAllFieldsValid = getMonetizationNetwork().areAllFieldsValid();
        if (purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code(map, purchaseValidationCallback, "purchases")) {
            AFf1nSDK aFf1nSDK = new AFf1nSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.getRevenue);
            AFe1aSDK aFe1aSDK = purchaseHandlerAreAllFieldsValid.getMediationNetwork;
            aFe1aSDK.AFAdRevenueData.execute(aFe1aSDK.new AnonymousClass2(aFf1nSDK));
        }
        int i4 = registerClient + 81;
        f64e = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) throws UnsupportedEncodingException {
        int i2 = registerClient + 77;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        PurchaseHandler purchaseHandlerAreAllFieldsValid = getMonetizationNetwork().areAllFieldsValid();
        if (purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code(map, purchaseValidationCallback, "subscriptions")) {
            AFf1rSDK aFf1rSDK = new AFf1rSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.getRevenue);
            AFe1aSDK aFe1aSDK = purchaseHandlerAreAllFieldsValid.getMediationNetwork;
            aFe1aSDK.AFAdRevenueData.execute(aFe1aSDK.new AnonymousClass2(aFf1rSDK));
        }
        int i4 = registerClient + 97;
        f64e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(Activity activity) throws UnsupportedEncodingException {
        long jLongValue;
        int i2 = registerClient + 41;
        f64e = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!(activity == null) && activity.getIntent() != null) {
            AFb1cSDK aFb1cSDKCopydefault = getMonetizationNetwork().copydefault();
            String localClassName = activity.getLocalClassName();
            StringBuilder sb = new StringBuilder("activity_intent_");
            sb.append(activity.getIntent().toString());
            aFb1cSDKCopydefault.getMediationNetwork("sendPushNotificationData", localClassName, sb.toString());
        } else if (activity != null) {
            int i3 = f64e + 113;
            registerClient = i3 % 128;
            if (i3 % 2 != 0) {
                AFb1cSDK aFb1cSDKCopydefault2 = getMonetizationNetwork().copydefault();
                String[] strArr = new String[5];
                strArr[0] = activity.getLocalClassName();
                strArr[1] = "activity_intent_null";
                aFb1cSDKCopydefault2.getMediationNetwork("sendPushNotificationData", strArr);
            } else {
                getMonetizationNetwork().copydefault().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            }
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("sendPushNotificationData", "activity_null");
        }
        AFd1tSDK aFd1tSDKE = getMonetizationNetwork().e();
        String currencyIso4217Code = getCurrencyIso4217Code(activity);
        aFd1tSDKE.AFAdRevenueData = currencyIso4217Code;
        if (currencyIso4217Code != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.copy == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copy = new ConcurrentHashMap();
                jLongValue = jCurrentTimeMillis;
            } else {
                try {
                    long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    Iterator<Long> it = this.copy.keySet().iterator();
                    jLongValue = jCurrentTimeMillis;
                    while (it.hasNext()) {
                        try {
                            Long next = it.next();
                            JSONObject jSONObject = new JSONObject(aFd1tSDKE.AFAdRevenueData);
                            JSONObject jSONObject2 = new JSONObject(this.copy.get(next));
                            Iterator<Long> it2 = it;
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                sb2.append(jSONObject2);
                                sb2.append(", new: ");
                                sb2.append(jSONObject);
                                sb2.append(")");
                                AFLogger.afInfoLog(sb2.toString());
                                aFd1tSDKE.AFAdRevenueData = null;
                                return;
                            }
                            if ((jCurrentTimeMillis - next.longValue() > j2 ? (char) 25 : 'Y') != 'Y') {
                                this.copy.remove(next);
                            }
                            if (next.longValue() <= jLongValue) {
                                jLongValue = next.longValue();
                            }
                            int i4 = registerClient + 1;
                            f64e = i4 % 128;
                            int i5 = i4 % 2;
                            it = it2;
                        } catch (Throwable th) {
                            th = th;
                            AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jLongValue = jCurrentTimeMillis;
                }
            }
            if (this.copy.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb3.append(jLongValue);
                sb3.append(")");
                AFLogger.afInfoLog(sb3.toString());
                this.copy.remove(Long.valueOf(jLongValue));
                int i6 = registerClient + 111;
                f64e = i6 % 128;
                int i7 = i6 % 2;
            }
            this.copy.put(Long.valueOf(jCurrentTimeMillis), aFd1tSDKE.AFAdRevenueData);
            start(activity);
        }
        int i8 = registerClient + 59;
        f64e = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i2 = f64e + 61;
        registerClient = i2 % 128;
        if (!(i2 % 2 == 0)) {
            throw null;
        }
        if (map != null) {
            getMonetizationNetwork().copydefault().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        int i3 = registerClient + 47;
        f64e = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, str}, 1241603377, -1241603372, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i2 = registerClient + 105;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setAppId", str);
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
        int i4 = f64e + 49;
        registerClient = i4 % 128;
        if (!(i4 % 2 == 0)) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        int i2 = f64e + 33;
        registerClient = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 6 : '=') != 6) {
            getMonetizationNetwork().copydefault().getMediationNetwork("setAppInviteOneLink", str);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
            if ((str != null ? (char) 23 : '>') == 23) {
                if (str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID)) ? false : true) {
                }
            }
            getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
            int i3 = f64e + 55;
            registerClient = i3 % 128;
            int i4 = i3 % 2;
        }
        AFb1cSDK aFb1cSDKCopydefault = getMonetizationNetwork().copydefault();
        String[] strArr = new String[0];
        strArr[1] = str;
        aFb1cSDKCopydefault.getMediationNetwork("setAppInviteOneLink", strArr);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            if (str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID)) ? false : true) {
            }
        }
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
        int i5 = f64e + 55;
        registerClient = i5 % 128;
        int i6 = i5 % 2;
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
        int i7 = f64e + 55;
        registerClient = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z)}, 1505293153, -1505293144, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        int i2 = f64e + 113;
        registerClient = i2 % 128;
        if (i2 % 2 == 0) {
            getMonetizationNetwork().copydefault().getMediationNetwork("setCollectIMEI", String.valueOf(z));
        } else {
            AFb1cSDK aFb1cSDKCopydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            aFb1cSDKCopydefault.getMediationNetwork("setCollectIMEI", strArr);
        }
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i3 = registerClient + 59;
        f64e = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i2 = registerClient + 19;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setCollectOaid", String.valueOf(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i4 = f64e + 31;
        registerClient = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i2 = registerClient + 55;
        f64e = i2 % 128;
        char c2 = i2 % 2 == 0 ? '@' : '.';
        Objects.requireNonNull(appsFlyerConsent);
        if (c2 != '.') {
            getMonetizationNetwork().e().component1 = appsFlyerConsent;
            throw null;
        }
        getMonetizationNetwork().e().component1 = appsFlyerConsent;
        int i3 = f64e + 33;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i2 = f64e + 115;
        registerClient = i2 % 128;
        if (i2 % 2 == 0) {
            getMonetizationNetwork().copydefault().getMediationNetwork("setCurrencyCode", str);
        } else {
            AFb1cSDK aFb1cSDKCopydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[0] = str;
            aFb1cSDKCopydefault.getMediationNetwork("setCurrencyCode", strArr);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, str, context}, 231975276, -231975269, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i2 = registerClient + 109;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i4 = registerClient + 115;
        f64e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i2 = registerClient + 81;
        f64e = i2 % 128;
        if ((i2 % 2 == 0 ? '%' : (char) 0) != 0) {
            throw null;
        }
        if ((z ? '\f' : 'C') != 'C') {
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
            int i3 = registerClient + 41;
            f64e = i3 % 128;
            int i4 = i3 % 2;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z)}, -1685759045, 1685759055, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        int i2 = f64e + 87;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        AFAdRevenueData(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
        int i4 = registerClient + 71;
        f64e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i2 = f64e + 69;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i4 = f64e + 85;
        registerClient = i4 % 128;
        if (!(i4 % 2 == 0)) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String strTrim;
        int i2 = f64e + 83;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        if ((!AFc1sSDK.getMonetizationNetwork(str2) ? ',' : '#') != ',') {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i4 = f64e + 69;
        registerClient = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if ((str != null ? '-' : (char) 31) != '-') {
            strTrim = "";
        } else {
            strTrim = str.trim();
            int i5 = f64e + 31;
            registerClient = i5 % 128;
            int i6 = i5 % 2;
        }
        AFe1iSDK.getMonetizationNetwork(new AFe1hSDK(strTrim, str2.trim()));
        int i7 = f64e + 23;
        registerClient = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i2 = f64e + 11;
        registerClient = i2 % 128;
        if (!(i2 % 2 != 0)) {
            getMonetizationNetwork().copydefault().getMediationNetwork("setImeiData", str);
            AFg1wSDK aFg1wSDKAFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
            AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKAFKeystoreWrapper, str}, 1318882910, -1318882909, System.identityHashCode(aFg1wSDKAFKeystoreWrapper));
        } else {
            AFb1cSDK aFb1cSDKCopydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[0];
            strArr[1] = str;
            aFb1cSDKCopydefault.getMediationNetwork("setImeiData", strArr);
            AFg1wSDK aFg1wSDKAFKeystoreWrapper2 = getMonetizationNetwork().AFKeystoreWrapper();
            AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKAFKeystoreWrapper2, str}, 1318882910, -1318882909, System.identityHashCode(aFg1wSDKAFKeystoreWrapper2));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i2 = f64e + 109;
        registerClient = i2 % 128;
        if ((i2 % 2 != 0 ? '%' : '#') != '#') {
            AFb1cSDK aFb1cSDKCopydefault = getMonetizationNetwork().copydefault();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            aFb1cSDKCopydefault.getMediationNetwork("setIsUpdate", strArr);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("setIsUpdate", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z = false;
        if ((logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel() ? (char) 7 : '8') == 7) {
            int i2 = f64e;
            int i3 = i2 + 73;
            registerClient = i3 % 128;
            z = (i3 % 2 != 0 ? '0' : ' ') != '0';
            int i4 = i2 + 99;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
        }
        getMonetizationNetwork().copydefault().getMediationNetwork("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        AFh1xSDK aFh1xSDKI = getMonetizationNetwork().i();
        if (z) {
            aFh1xSDKI.component1();
            return;
        }
        aFh1xSDKI.AFAdRevenueData();
        int i6 = registerClient + 5;
        f64e = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i2) {
        int i3 = f64e + 113;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = TimeUnit.SECONDS.toMillis(i2);
        int i5 = registerClient + 27;
        f64e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i2 = registerClient + 81;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setOaidData", str);
        AFb1vSDK.getRevenue = str;
        int i4 = f64e + 59;
        registerClient = i4 % 128;
        if (!(i4 % 2 == 0)) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, strArr}, 1539108454, -1539108439, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i2 = registerClient;
        int i3 = i2 + 35;
        f64e = i3 % 128;
        int i4 = i3 % 2;
        if ((str != null ? (char) 22 : 'C') != 22) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        int i5 = i2 + 119;
        f64e = i5 % 128;
        if (i5 % 2 == 0) {
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, str, map}, -1784713538, 1784713556, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i2 = f64e + 11;
        registerClient = i2 % 128;
        if ((i2 % 2 != 0 ? '=' : '(') == '(') {
            getMonetizationNetwork().e().getCurrencyIso4217Code = AFb1jSDK.getMonetizationNetwork(str);
        } else {
            getMonetizationNetwork().e().getCurrencyIso4217Code = AFb1jSDK.getMonetizationNetwork(str);
            int i3 = 77 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i2 = registerClient + 117;
        f64e = i2 % 128;
        char c2 = i2 % 2 == 0 ? ',' : '<';
        Objects.requireNonNull(pluginInfo);
        if (c2 != ',') {
            getMonetizationNetwork().AFInAppEventParameterName().getRevenue(pluginInfo);
        } else {
            getMonetizationNetwork().AFInAppEventParameterName().getRevenue(pluginInfo);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            if (str2 != null) {
                int i2 = registerClient + 119;
                f64e = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put("c", str2);
            }
            if ((str3 == null ? '[' : (char) 0) != '[') {
                int i4 = registerClient + 103;
                f64e = i4 % 128;
                int i5 = i4 % 2;
                jSONObject.put("af_siteid", str3);
            }
        } else {
            try {
                jSONObject.put("pid", str);
                int i6 = f64e + 73;
                registerClient = i6 % 128;
                int i7 = i6 % 2;
                if (str2 != null) {
                    int i8 = registerClient + 119;
                    f64e = i8 % 128;
                    int i9 = i8 % 2;
                    jSONObject.put("c", str2);
                }
                if ((str3 == null ? '[' : (char) 0) != '[') {
                    int i10 = registerClient + 103;
                    f64e = i10 % 128;
                    int i11 = i10 % 2;
                    jSONObject.put("af_siteid", str3);
                }
            } catch (JSONException e2) {
                AFLogger.afErrorLog(e2.getMessage(), e2);
            }
        }
        if (jSONObject.has("pid")) {
            getMediationNetwork("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i2 = f64e + 113;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFc1kSDK aFc1kSDKD = getMonetizationNetwork().d();
        aFc1kSDKD.component4.clear();
        aFc1kSDKD.component4.addAll(Arrays.asList(strArr));
        int i4 = registerClient + 51;
        f64e = i4 % 128;
        if (!(i4 % 2 != 0)) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) throws UnsupportedEncodingException {
        int i2 = registerClient + 91;
        f64e = i2 % 128;
        char c2 = i2 % 2 == 0 ? 'Q' : (char) 20;
        setSharingFilterForPartners(strArr);
        if (c2 != 20) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() throws UnsupportedEncodingException {
        int i2 = f64e + 81;
        registerClient = i2 % 128;
        if ((i2 % 2 != 0 ? '(' : '5') != '(') {
            setSharingFilterForPartners("all");
        } else {
            setSharingFilterForPartners("all");
        }
        int i3 = f64e + 35;
        registerClient = i3 % 128;
        if ((i3 % 2 != 0 ? '>' : '#') != '>') {
            return;
        }
        int i4 = 74 / 0;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, strArr}, -2050013962, 2050013970, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getMonetizationNetwork().copydefault().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        int i2 = f64e + 121;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        int i4 = 0;
        while (true) {
            if (!(i4 < length)) {
                map.put(str, arrayList2);
                AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
                return;
            }
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
            f64e = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, context}, -1799167514, 1799167526, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z), context}, -2043587704, 2043587717, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) throws UnsupportedEncodingException {
        int i2 = registerClient + 87;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i4 = registerClient + 45;
        f64e = i4 % 128;
        if (!(i4 % 2 != 0)) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i2 = f64e + 97;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork().copydefault().getMediationNetwork("unregisterConversionListener", new String[1]);
        } else {
            getMonetizationNetwork().copydefault().getMediationNetwork("unregisterConversionListener", new String[0]);
        }
        this.getMonetizationNetwork = null;
        int i3 = f64e + 47;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFg1jSDK aFg1jSDK = new AFg1jSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFh1vSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFh1vSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFg1mSDK mediationNetwork = aFg1jSDK.getMediationNetwork();
        if (mediationNetwork == null || !str.equals(mediationNetwork.getRevenue)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = mediationNetwork == null || jCurrentTimeMillis - mediationNetwork.getCurrencyIso4217Code > TimeUnit.SECONDS.toMillis(2L);
            AFg1mSDK aFg1mSDK = new AFg1mSDK(str, jCurrentTimeMillis, !z);
            aFg1jSDK.AFAdRevenueData.AFAdRevenueData("afUninstallToken", aFg1mSDK.getRevenue);
            aFg1jSDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken_received_time", aFg1mSDK.getCurrencyIso4217Code);
            aFg1jSDK.AFAdRevenueData.getRevenue("afUninstallToken_queued", aFg1mSDK.getCurrencyIso4217Code());
            if (z) {
                AFg1jSDK.getMediationNetwork(str);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, context, str, str2, str3, str4, str5, map}, 123597494, -123597492, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i2 = registerClient + 21;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        int i4 = registerClient + 75;
        f64e = i4 % 128;
        int i5 = i4 % 2;
    }

    private String AFAdRevenueData(Context context, String str) throws UnsupportedEncodingException {
        if (context != null) {
            getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
            return getMonetizationNetwork().getMediationNetwork().getRevenue(str);
        }
        int i2 = registerClient + 65;
        int i3 = i2 % 128;
        f64e = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        registerClient = i5 % 128;
        if ((i5 % 2 != 0 ? '>' : 'V') != '>') {
            return null;
        }
        throw null;
    }

    private static void a(String str, String str2, int[] iArr, int i2, Object[] objArr) throws UnsupportedEncodingException {
        int i3 = $11 + 61;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            int i5 = $10 + 109;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArr2 = AFInAppEventParameterName;
        if ((cArr2 != null ? 'X' : 'b') != 'b') {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = $11 + 47;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = $10 + 29;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr3[i9] = (char) (((long) cArr2[i9]) ^ 358767465314578885L);
            }
            cArr2 = cArr3;
        }
        int i12 = (int) (((long) values) ^ 358767465314578885L);
        if (AFInAppEventType) {
            int i13 = $11 + 71;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            int length2 = bArr.length;
            aFk1nSDK.AFAdRevenueData = length2;
            char[] cArr4 = new char[length2];
            aFk1nSDK.getRevenue = 0;
            while (true) {
                int i15 = aFk1nSDK.getRevenue;
                int i16 = aFk1nSDK.AFAdRevenueData;
                if ((i15 < i16 ? '*' : (char) 30) == 30) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    cArr4[i15] = (char) (cArr2[bArr[(i16 - 1) - i15] + i2] - i12);
                    aFk1nSDK.getRevenue = i15 + 1;
                }
            }
        } else if (valueOf) {
            int i17 = $11 + 13;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            int length3 = cArr.length;
            aFk1nSDK.AFAdRevenueData = length3;
            char[] cArr5 = new char[length3];
            aFk1nSDK.getRevenue = 0;
            while (true) {
                int i19 = aFk1nSDK.getRevenue;
                int i20 = aFk1nSDK.AFAdRevenueData;
                if ((i19 < i20 ? 'P' : 'S') == 'S') {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i19] = (char) (cArr2[cArr[(i20 - 1) - i19] - i2] - i12);
                    aFk1nSDK.getRevenue = i19 + 1;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1nSDK.AFAdRevenueData = length4;
            char[] cArr6 = new char[length4];
            aFk1nSDK.getRevenue = 0;
            while (true) {
                int i21 = aFk1nSDK.getRevenue;
                int i22 = aFk1nSDK.AFAdRevenueData;
                if (!(i21 < i22)) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i21] = (char) (cArr2[iArr[(i22 - 1) - i21] - i2] - i12);
                    aFk1nSDK.getRevenue = i21 + 1;
                }
            }
        }
    }

    public static void areAllFieldsValid() {
        AFInAppEventParameterName = new char[]{61619, 61630, 61617, 61516, 61627, 61511, 61631, 61517, 61504};
        values = -552931120;
        valueOf = true;
        AFInAppEventType = true;
    }

    private void component1() {
        int i2 = f64e + 119;
        registerClient = i2 % 128;
        int i3 = 2;
        if ((i2 % 2 != 0 ? 'c' : '<') != 'c') {
            getMonetizationNetwork().getMonetizationNetwork().execute(new f(this, 1));
        } else {
            getMonetizationNetwork().getMonetizationNetwork().execute(new f(this, i3));
            throw null;
        }
    }

    private static void component2(Context context) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{context}, 2054602482, -2054602479, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object component3(Object[] objArr) throws UnsupportedEncodingException {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        Context context = (Context) objArr[2];
        int i2 = f64e + 93;
        int i3 = i2 % 128;
        registerClient = i3;
        int i4 = i2 % 2;
        if (context != null) {
            int i5 = i3 + 81;
            f64e = i5 % 128;
            int i6 = i5 % 2;
            boolean zAFAdRevenueData = aFb1rSDK.AFAdRevenueData();
            aFb1rSDK.setCustomerUserId(str);
            if (zAFAdRevenueData) {
                StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(str);
                sb.append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(sb.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(aFb1rSDK.getMonetizationNetwork().getRevenue());
                aFb1rSDK.getCurrencyIso4217Code(context, AFh1qSDK.setCustomerIdAndLogSession);
                AFg1wSDK aFg1wSDKAFKeystoreWrapper = aFb1rSDK.getMonetizationNetwork().AFKeystoreWrapper();
                if (!(referrer != null)) {
                    int i7 = registerClient + 103;
                    f64e = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    referrer = "";
                }
                if (context instanceof Activity) {
                    int i8 = registerClient + 95;
                    f64e = i8 % 128;
                    if (!(i8 % 2 == 0)) {
                        ((Activity) context).getIntent();
                    } else {
                        ((Activity) context).getIntent();
                        int i9 = 16 / 0;
                    }
                }
                aFb1rSDK.getMonetizationNetwork(context, referrer);
                return null;
            }
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        final AFi1jSDK aFi1jSDKForce = getMonetizationNetwork().force();
        if ((aFi1jSDKForce != null ? '=' : '\t') != '=') {
            return;
        }
        int i2 = registerClient + 83;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        if ((aFi1jSDKForce.AFAdRevenueData() ? '7' : (char) 23) != '7') {
            return;
        }
        int i4 = registerClient + 97;
        f64e = i4 % 128;
        int i5 = i4 % 2;
        aFi1jSDKForce.getCurrencyIso4217Code(new AFi1dSDK() { // from class: com.appsflyer.internal.d
            @Override // com.appsflyer.internal.AFi1dSDK
            public final void onRequestFinished() {
                this.f77a.getMediationNetwork(aFi1jSDKForce);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copydefault() throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this}, -927250196, 927250219, System.identityHashCode(this));
    }

    private static void equals() {
        int i2 = registerClient + 119;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.INSTANCE.w(AFh1vSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i4 = registerClient + 21;
        f64e = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        int i2 = f64e + 13;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        aFb1rSDK.getMonetizationNetwork().copydefault().getMediationNetwork("setAndroidIdData", str);
        aFb1rSDK.getMonetizationNetwork().e().getRevenue = str;
        int i4 = f64e + 9;
        registerClient = i4 % 128;
        if (!(i4 % 2 == 0)) {
            int i5 = 16 / 0;
        }
        return null;
    }

    public static AFb1rSDK getRevenue() {
        int i2 = f64e + 11;
        registerClient = i2 % 128;
        if ((i2 % 2 != 0 ? '_' : '7') == '7') {
            return component3;
        }
        throw null;
    }

    public final void component4() throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this}, -1730576944, 1730576958, System.identityHashCode(this));
    }

    public final synchronized AFg1xSDK getMediationNetwork() {
        AFg1xSDK aFg1xSDK;
        if (this.AFKeystoreWrapper == null) {
            int i2 = f64e + 37;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            this.AFKeystoreWrapper = new e(this);
        }
        aFg1xSDK = this.AFKeystoreWrapper;
        int i4 = registerClient + 119;
        f64e = i4 % 128;
        int i5 = i4 % 2;
        return aFg1xSDK;
    }

    public final AFd1rSDK getMonetizationNetwork(Context context) {
        int i2 = registerClient + 63;
        f64e = i2 % 128;
        Object[] objArr = {this, context};
        if ((i2 % 2 == 0 ? '%' : (char) 26) == '%') {
            getCurrencyIso4217Code(objArr, -608775197, 608775214, System.identityHashCode(this));
            getMonetizationNetwork().getRevenue();
            throw null;
        }
        getCurrencyIso4217Code(objArr, -608775197, 608775214, System.identityHashCode(this));
        AFd1rSDK revenue = getMonetizationNetwork().getRevenue();
        int i3 = registerClient + 111;
        f64e = i3 % 128;
        int i4 = i3 % 2;
        return revenue;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) throws UnsupportedEncodingException {
        HashMap map2 = map == null ? null : new HashMap(map);
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        aFh1eSDK.areAllFieldsValid = str;
        aFh1eSDK.getMediationNetwork = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFh1vSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1eSDK.getRevenue(mapSingletonMap);
        }
        aFh1eSDK.getCurrencyIso4217Code = map2;
        AFb1cSDK aFb1cSDKCopydefault = getMonetizationNetwork().copydefault();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map5 = aFh1eSDK.getCurrencyIso4217Code;
        if (map5 == null) {
            map5 = new HashMap();
        }
        strArr[1] = new JSONObject(map5).toString();
        aFb1cSDKCopydefault.getMediationNetwork("logEvent", strArr);
        if (str == null) {
            getCurrencyIso4217Code(context, AFh1qSDK.logEvent);
        }
        getRevenue(aFh1eSDK, component3(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i2 = f64e + 47;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork().copydefault().getMediationNetwork("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i4 = registerClient + 123;
        f64e = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) throws UnsupportedEncodingException {
        int i2 = f64e + 111;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        start(context, str, null);
        int i4 = registerClient + 109;
        f64e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j2) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, deepLinkListener, Long.valueOf(j2)}, 1858628735, -1858628714, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1aSDK aFe1aSDKCopy = this.toString.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(new AFf1qSDK(this.toString, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i2 = f64e + 25;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
    }

    private AFj1sSDK[] component2() {
        int i2 = registerClient + 13;
        f64e = i2 % 128;
        if ((i2 % 2 == 0 ? 'P' : '?') != 'P') {
            return getMonetizationNetwork().equals().getCurrencyIso4217Code();
        }
        getMonetizationNetwork().equals().getCurrencyIso4217Code();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (isStopped() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (isStopped() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        com.appsflyer.AFLogger.afInfoLog(java.lang.String.format(r5, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", r6, r0, java.lang.Long.valueOf(r3), java.lang.Long.valueOf(r12.copydefault)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean component3() {
        String str;
        int i2 = f64e + 9;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        if (this.component1 > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.component1;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String str2 = (String) getCurrencyIso4217Code(new Object[]{simpleDateFormat, Long.valueOf(this.component1)}, 1382084704, -1382084693, (int) System.currentTimeMillis());
            String str3 = (String) getCurrencyIso4217Code(new Object[]{simpleDateFormat, Long.valueOf(this.areAllFieldsValid)}, 1382084704, -1382084693, (int) System.currentTimeMillis());
            if (jCurrentTimeMillis < this.copydefault) {
                int i4 = registerClient + 31;
                f64e = i4 % 128;
                if ((i4 % 2 == 0 ? '\b' : (char) 3) != 3) {
                    int i5 = 95 / 0;
                }
            }
            if (!isStopped()) {
                int i6 = registerClient + 117;
                f64e = i6 % 128;
                if (i6 % 2 == 0) {
                    Object[] objArr = new Object[2];
                    objArr[0] = str2;
                    objArr[0] = str3;
                    objArr[3] = Long.valueOf(jCurrentTimeMillis);
                    str = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", objArr);
                } else {
                    str = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", str2, str3, Long.valueOf(jCurrentTimeMillis));
                }
                AFLogger.afInfoLog(str);
            }
        } else if (!isStopped()) {
            str = "Sending first launch for this session!";
            AFLogger.afInfoLog(str);
        }
        return false;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i2, int i3, int i4) throws UnsupportedEncodingException {
        int i5;
        boolean z;
        int i6 = ~i2;
        int i7 = ((i3 | i6) * (-1434)) + (i3 * 1435) + (i2 * (-716));
        int i8 = ~i4;
        int i9 = ~(i8 | i3);
        int i10 = ~(i2 | i3);
        int i11 = i6 | (~i3);
        int i12 = ((i10 | (~(i11 | i8)) | (~(i3 | i4))) * 717) + ((i9 | i10 | (~(i11 | i4))) * 717) + i7;
        String str = null;
        switch (i12) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                return getMediationNetwork(objArr);
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
                Context context = (Context) objArr[1];
                AFj1iSDK aFj1iSDK = new AFj1iSDK((Intent) objArr[2]);
                if (!(aFj1iSDK.AFAdRevenueData("appsflyer_preinstall") == null)) {
                    AFAdRevenueData(aFj1iSDK.AFAdRevenueData("appsflyer_preinstall"));
                    int i13 = registerClient + 87;
                    f64e = i13 % 128;
                    int i14 = i13 % 2;
                }
                AFLogger.afInfoLog("****** onReceive called *******");
                AppsFlyerProperties.getInstance();
                String strAFAdRevenueData = aFj1iSDK.AFAdRevenueData("referrer");
                AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(strAFAdRevenueData)));
                if (strAFAdRevenueData == null) {
                    return null;
                }
                int i15 = f64e + 87;
                registerClient = i15 % 128;
                int i16 = i15 % 2;
                aFb1rSDK.getMonetizationNetwork(context).AFAdRevenueData("referrer", strAFAdRevenueData);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", strAFAdRevenueData);
                appsFlyerProperties.getCurrencyIso4217Code = strAFAdRevenueData;
                if ((AppsFlyerProperties.getInstance().getMonetizationNetwork() ? '\f' : 'D') == 'D') {
                    return null;
                }
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                aFb1rSDK.getCurrencyIso4217Code(context, AFh1qSDK.onReceive);
                aFb1rSDK.getMonetizationNetwork(strAFAdRevenueData);
                return null;
            case 5:
                return getCurrencyIso4217Code(objArr);
            case 6:
                return getRevenue(objArr);
            case 7:
                return component3(objArr);
            case 8:
                ((AFb1rSDK) objArr[0]).getMonetizationNetwork().e().getMediationNetwork = new AFc1cSDK((String[]) objArr[1]);
                i5 = registerClient + 57;
                f64e = i5 % 128;
                int i17 = i5 % 2;
                return str;
            case 9:
                AFb1rSDK aFb1rSDK2 = (AFb1rSDK) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i18 = f64e + 109;
                registerClient = i18 % 128;
                char c2 = i18 % 2 != 0 ? ')' : '0';
                AFb1cSDK aFb1cSDKCopydefault = aFb1rSDK2.getMonetizationNetwork().copydefault();
                if (c2 != ')') {
                    aFb1cSDKCopydefault.getMediationNetwork("setCollectAndroidID", String.valueOf(zBooleanValue));
                } else {
                    String[] strArr = new String[1];
                    strArr[1] = String.valueOf(zBooleanValue);
                    aFb1cSDKCopydefault.getMediationNetwork("setCollectAndroidID", strArr);
                }
                getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(zBooleanValue));
                getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(zBooleanValue));
                i5 = f64e + 75;
                registerClient = i5 % 128;
                int i19 = i5 % 2;
                return str;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                AFb1rSDK aFb1rSDK3 = (AFb1rSDK) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(zBooleanValue2)));
                if ((!zBooleanValue2 ? (char) 7 : '@') != 7) {
                    int i20 = registerClient + 91;
                    f64e = i20 % 128;
                    int i21 = i20 % 2;
                    z = false;
                } else {
                    int i22 = f64e + 87;
                    int i23 = i22 % 128;
                    registerClient = i23;
                    z = i22 % 2 == 0;
                    int i24 = i23 + 43;
                    f64e = i24 % 128;
                    int i25 = i24 % 2;
                }
                AFb1vSDK.getCurrencyIso4217Code = Boolean.valueOf(z);
                AFd1kSDK monetizationNetwork = aFb1rSDK3.getMonetizationNetwork();
                monetizationNetwork.e().areAllFieldsValid = zBooleanValue2;
                if (zBooleanValue2) {
                    monetizationNetwork.e().component4 = null;
                    return null;
                }
                AFe1aSDK aFe1aSDKCopy = monetizationNetwork.copy();
                aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(new AFf1pSDK(aFb1rSDK3.getMonetizationNetwork())));
                return null;
            case RequestError.STOP_TRACKING /* 11 */:
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                str = simpleDateFormat.format(new Date(jLongValue));
                i5 = registerClient + 11;
                f64e = i5 % 128;
                int i110 = i5 % 2;
                return str;
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
                int i26 = registerClient + 31;
                f64e = i26 % 128;
                int i27 = i26 % 2;
                boolean z2 = (aFa1oSDK.areAllFieldsValid != null ? 'R' : 'D') != 'R';
                if (!(!aFb1rSDK4.AFAdRevenueData())) {
                    AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                    return null;
                }
                if (z2) {
                    int i28 = f64e + 73;
                    registerClient = i28 % 128;
                    boolean z3 = i28 % 2 == 0;
                    boolean z4 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true);
                    if (z3 ? !z4 : !z4) {
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
                ((AFb1rSDK) objArr[0]).getRevenue(new AFh1lSDK());
                i5 = f64e + 17;
                registerClient = i5 % 128;
                int i111 = i5 % 2;
                return str;
            default:
                String str2 = (String) objArr[0];
                int i29 = f64e + 35;
                registerClient = i29 % 128;
                if (i29 % 2 != 0) {
                }
                boolean z5 = AppsFlyerProperties.getInstance().getBoolean(str2, false);
                int i30 = registerClient + 109;
                f64e = i30 % 128;
                int i31 = i30 % 2;
                return Boolean.valueOf(z5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066 A[Catch: Exception -> 0x00ae, TRY_ENTER, TryCatch #0 {Exception -> 0x00ae, blocks: (B:4:0x0014, B:18:0x0066, B:19:0x006e, B:20:0x0075, B:23:0x0078, B:28:0x0088, B:29:0x0091, B:31:0x0097, B:37:0x00a4, B:10:0x0037), top: B:42:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x006e A[Catch: Exception -> 0x00ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ae, blocks: (B:4:0x0014, B:18:0x0066, B:19:0x006e, B:20:0x0075, B:23:0x0078, B:28:0x0088, B:29:0x0091, B:31:0x0097, B:37:0x00a4, B:10:0x0037), top: B:42:0x0012 }] */
    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        List listAsList;
        int i2;
        char c2;
        boolean z = false;
        Context context = (Context) objArr[0];
        int i3 = registerClient + 55;
        f64e = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 11102).requestedPermissions);
                if ((!listAsList.contains("android.permission.INTERNET") ? 'Y' : '8') != '8') {
                    i2 = registerClient + 73;
                    f64e = i2 % 128;
                    if (i2 % 2 == 0) {
                        c2 = '\t';
                    } else {
                        c2 = 5;
                    }
                    if (c2 != '\t') {
                        AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                        throw null;
                    }
                    AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            } else {
                listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                if (!listAsList.contains("android.permission.INTERNET")) {
                    i2 = registerClient + 73;
                    f64e = i2 % 128;
                    if (i2 % 2 == 0) {
                        c2 = '\t';
                    } else {
                        c2 = 5;
                    }
                    if (c2 != '\t') {
                        AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                        throw null;
                    }
                    AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            }
            if ((!listAsList.contains("android.permission.ACCESS_NETWORK_STATE") ? '\f' : 'D') != 'D') {
                AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                if (listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                    z = true;
                }
                if (!z) {
                    AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                }
            }
            return null;
        } catch (Exception e2) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Exception while validation permissions. ", e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String string;
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener;
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        String str5 = (String) objArr[6];
        Map map = (Map) objArr[7];
        AFb1cSDK aFb1cSDKCopydefault = aFb1rSDK.getMonetizationNetwork().copydefault();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        if (map == null) {
            int i2 = registerClient + 43;
            f64e = i2 % 128;
            int i3 = i2 % 2;
            string = "";
        } else {
            string = map.toString();
        }
        strArr[5] = string;
        aFb1cSDKCopydefault.getMediationNetwork("validateAndTrackInAppPurchase", strArr);
        if (!aFb1rSDK.isStopped()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.PURCHASE_VALIDATION;
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            aFLogger.i(aFh1vSDK, sb.toString());
        }
        if (str == null || str4 == null) {
            appsFlyerInAppPurchaseValidatorListener = getMediationNetwork;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                int i4 = registerClient + 7;
                f64e = i4 % 128;
                int i5 = i4 % 2;
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return null;
            }
        } else {
            if ((str2 != null) && str5 != null) {
                int i6 = f64e + 71;
                registerClient = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 20 / 0;
                    if (!(str3 != null)) {
                        appsFlyerInAppPurchaseValidatorListener = getMediationNetwork;
                        if (appsFlyerInAppPurchaseValidatorListener != null) {
                            int i8 = registerClient + 7;
                            f64e = i8 % 128;
                            int i9 = i8 % 2;
                            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                            return null;
                        }
                    } else {
                        Context applicationContext = context.getApplicationContext();
                        AFg1wSDK aFg1wSDKAFKeystoreWrapper = aFb1rSDK.getMonetizationNetwork().AFKeystoreWrapper();
                        new Thread(new AFa1bSDK(applicationContext, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKAFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDKAFKeystoreWrapper)), aFb1rSDK.getMonetizationNetwork().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                    }
                } else {
                    if ((str3 == null ? (char) 0 : '\t') != 0) {
                        Context applicationContext2 = context.getApplicationContext();
                        AFg1wSDK aFg1wSDKAFKeystoreWrapper2 = aFb1rSDK.getMonetizationNetwork().AFKeystoreWrapper();
                        new Thread(new AFa1bSDK(applicationContext2, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKAFKeystoreWrapper2}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDKAFKeystoreWrapper2)), aFb1rSDK.getMonetizationNetwork().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                    } else {
                        appsFlyerInAppPurchaseValidatorListener = getMediationNetwork;
                        if (appsFlyerInAppPurchaseValidatorListener != null) {
                            int i10 = registerClient + 7;
                            f64e = i10 % 128;
                            int i11 = i10 % 2;
                            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                            return null;
                        }
                    }
                }
            } else {
                appsFlyerInAppPurchaseValidatorListener = getMediationNetwork;
                if (appsFlyerInAppPurchaseValidatorListener != null) {
                    int i12 = registerClient + 7;
                    f64e = i12 % 128;
                    int i13 = i12 % 2;
                    appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                    return null;
                }
            }
        }
        return null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        int i2 = f64e + 77;
        registerClient = i2 % 128;
        boolean z = i2 % 2 != 0;
        AFb1cSDK aFb1cSDKCopydefault = aFb1rSDK.getMonetizationNetwork().copydefault();
        String[] strArr = new String[0];
        if (!z) {
            aFb1cSDKCopydefault.getMediationNetwork("getSdkVersion", strArr);
        } else {
            aFb1cSDKCopydefault.getMediationNetwork("getSdkVersion", strArr);
        }
        String strAreAllFieldsValid = AFd1qSDK.areAllFieldsValid();
        int i3 = registerClient + 35;
        f64e = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 4 : 'U') == 'U') {
            return strAreAllFieldsValid;
        }
        throw null;
    }

    public final void AFAdRevenueData(Context context) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) throws UnsupportedEncodingException {
        int i2 = f64e + 99;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        if (getMonetizationNetwork().w().getMediationNetwork()) {
            int i4 = f64e + 45;
            registerClient = i4 % 128;
            if ((i4 % 2 != 0 ? '&' : '^') == '&') {
                throw null;
            }
            return;
        }
        if (!this.equals) {
            getMediationNetwork("start");
            if ((str == null ? (char) 25 : 'T') == 25) {
                if (appsFlyerRequestListener == null) {
                    return;
                }
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
        }
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        final AFh1oSDK aFh1oSDKComponent3 = getMonetizationNetwork().component3();
        aFh1oSDKComponent3.AFAdRevenueData(AFa1mSDK.AFAdRevenueData(context));
        if (this.component4 == null) {
            int i5 = f64e + 119;
            registerClient = i5 % 128;
            if (!(i5 % 2 == 0)) {
                AFb1qSDK.f_(context);
                throw null;
            }
            Application applicationF_ = AFb1qSDK.f_(context);
            if (applicationF_ == null) {
                return;
            } else {
                this.component4 = applicationF_;
            }
        }
        getMonetizationNetwork().copydefault().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.GENERAL;
        String str2 = getCurrencyIso4217Code;
        aFLogger.i(aFh1vSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.15.2", str2));
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        aFLogger.i(aFh1vSDK, sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(getMonetizationNetwork().getRevenue());
        if (TextUtils.isEmpty(str)) {
            AFg1wSDK aFg1wSDKAFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
            if ((TextUtils.isEmpty((String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKAFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDKAFKeystoreWrapper))) ? (char) 19 : (char) 21) != 21) {
                int i6 = registerClient + 105;
                f64e = i6 % 128;
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
            public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
                aFh1oSDKComponent3.getMonetizationNetwork();
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
                AFh1oSDK aFh1oSDK = aFh1oSDKComponent3;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = aFh1oSDK.areAllFieldsValid;
                if (j2 != 0) {
                    long j3 = jCurrentTimeMillis - j2;
                    if (j3 > 0 && j3 < 1000) {
                        j3 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j3);
                    aFh1oSDK.equals = seconds;
                    aFh1oSDK.AFAdRevenueData.getMonetizationNetwork("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1rSDK.this.getMonetizationNetwork().afErrorLog().getMonetizationNetwork();
                AFb1cSDK aFb1cSDKCopydefault = AFb1rSDK.this.getMonetizationNetwork().copydefault();
                if (aFb1cSDKCopydefault.areAllFieldsValid()) {
                    aFb1cSDKCopydefault.AFAdRevenueData();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFb1cSDKCopydefault.k_(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFb1cSDKCopydefault.getMonetizationNetwork();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1rSDK.this.getMonetizationNetwork().component4().getRevenue();
                AFb1rSDK.this.getMonetizationNetwork().afInfoLog().getCurrencyIso4217Code();
            }
        });
        int i8 = registerClient + 89;
        f64e = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 35 / 0;
        }
    }

    private static void AFAdRevenueData(AFa1oSDK aFa1oSDK, AFh1mSDK aFh1mSDK) {
        if ((aFh1mSDK != null ? (char) 18 : (char) 16) != 16) {
            int i2 = f64e + 17;
            int i3 = i2 % 128;
            registerClient = i3;
            int i4 = i2 % 2;
            aFa1oSDK.AFAdRevenueData = aFh1mSDK.getRevenue;
            aFa1oSDK.component3 = aFh1mSDK.getMonetizationNetwork;
            int i5 = i3 + 115;
            f64e = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static String getCurrencyIso4217Code() {
        int i2 = registerClient + 117;
        f64e = i2 % 128;
        if ((i2 % 2 == 0 ? 'V' : '+') != 'V') {
            return (String) getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.APP_USER_ID}, 143536171, -143536152, (int) System.currentTimeMillis());
        }
        int i3 = 44 / 0;
        return (String) getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.APP_USER_ID}, 143536171, -143536152, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFi1jSDK aFi1jSDK) {
        AFf1jSDK aFf1jSDK = new AFf1jSDK(aFi1jSDK, getMonetizationNetwork().getMediationNetwork(), getMonetizationNetwork());
        AFe1aSDK aFe1aSDKCopy = getMonetizationNetwork().copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(aFf1jSDK));
        int i2 = registerClient + 111;
        f64e = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static String getMonetizationNetwork(AFd1rSDK aFd1rSDK, String str) {
        int i2 = registerClient + 59;
        f64e = i2 % 128;
        if (i2 % 2 == 0) {
            aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            throw null;
        }
        String monetizationNetwork = aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        if (monetizationNetwork == null) {
            aFd1rSDK.AFAdRevenueData("CACHED_CHANNEL", str);
            return str;
        }
        int i3 = registerClient + 103;
        f64e = i3 % 128;
        if ((i3 % 2 == 0 ? 'Q' : 'X') != 'Q') {
            return monetizationNetwork;
        }
        throw null;
    }

    private static String getRevenue(String str) {
        return (String) getCurrencyIso4217Code(new Object[]{str}, 143536171, -143536152, (int) System.currentTimeMillis());
    }

    private static void AFAdRevenueData(String str) {
        try {
            if ((new JSONObject(str).has("pid") ? '\r' : 'K') == 'K') {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                return;
            }
            int i2 = registerClient + 117;
            f64e = i2 % 128;
            int i3 = i2 % 2;
            getMediationNetwork("preInstallName", str);
            int i4 = registerClient + 65;
            f64e = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException e2) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e2);
        }
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        Intent intent;
        int i2 = f64e + 13;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        String string = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (!(extras == null)) {
                    int i4 = registerClient + 75;
                    f64e = i4 % 128;
                    int i5 = i4 % 2;
                    string = extras.getString("af");
                    if (string != null) {
                        int i6 = registerClient + 97;
                        f64e = i6 % 128;
                        int i7 = i6 % 2;
                        AFLogger.INSTANCE.w(AFh1vSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(string)));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                    }
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.ENGAGEMENT, th.getMessage(), th);
            }
        }
        return string;
    }

    private static void getMediationNetwork(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFh1vSDK, sb.toString());
        int i2 = registerClient + 67;
        f64e = i2 % 128;
        if (!(i2 % 2 != 0)) {
            int i3 = 31 / 0;
        }
    }

    private void getRevenue(Context context, String str, Map<String, Object> map) throws UnsupportedEncodingException {
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        aFh1eSDK.areAllFieldsValid = str;
        aFh1eSDK.getCurrencyIso4217Code = map;
        getRevenue(aFh1eSDK, component3(context));
        int i2 = f64e + 63;
        registerClient = i2 % 128;
        if ((i2 % 2 != 0 ? 'E' : (char) 15) != 'E') {
            return;
        }
        int i3 = 67 / 0;
    }

    public final Map<String, Object> getMonetizationNetwork(AFa1oSDK aFa1oSDK) throws UnsupportedEncodingException {
        AFLogger aFLogger;
        AFh1vSDK aFh1vSDK;
        String str;
        String string;
        Context context = getMonetizationNetwork().values().AFAdRevenueData;
        AFd1rSDK monetizationNetwork = getMonetizationNetwork(context);
        AFg1kSDK aFg1kSDKComponent1 = getMonetizationNetwork().component1();
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
                aFLogger = AFLogger.INSTANCE;
                aFh1vSDK = AFh1vSDK.GENERAL;
                string = "SDK Reporting has been stopped";
            } else {
                aFLogger = AFLogger.INSTANCE;
                aFh1vSDK = AFh1vSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (!revenue) {
                    str = aFa1oSDK.areAllFieldsValid;
                } else {
                    int i2 = f64e + 117;
                    registerClient = i2 % 128;
                    if ((i2 % 2 != 0 ? '5' : '?') != '?') {
                        int i3 = 40 / 0;
                    }
                    str = "Launch";
                }
                sb.append(str);
                string = sb.toString();
            }
            aFLogger.i(aFh1vSDK, string, true);
            getCurrencyIso4217Code(new Object[]{context}, 2054602482, -2054602479, (int) System.currentTimeMillis());
            int mediationNetwork = getMediationNetwork(monetizationNetwork, revenue);
            if ((aFa1oSDK.areAllFieldsValid != null ? (char) 15 : '4') == 15) {
                int i4 = registerClient + 125;
                f64e = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
            int currencyIso4217Code2 = getCurrencyIso4217Code(monetizationNetwork, z);
            if (revenue) {
                if ((mediationNetwork == 1 ? 'J' : '0') != '0') {
                    AppsFlyerProperties.getInstance().getMonetizationNetwork = true;
                }
            }
            aFg1kSDKComponent1.getCurrencyIso4217Code(map, mediationNetwork, currencyIso4217Code2);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
        }
        return map;
    }

    private static void AFAdRevenueData(String str, boolean z) {
        int i2 = registerClient + 57;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties.getInstance().set(str, z);
        int i4 = registerClient + 11;
        f64e = i4 % 128;
        int i5 = i4 % 2;
    }

    public static String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, long j2) {
        return (String) getCurrencyIso4217Code(new Object[]{simpleDateFormat, Long.valueOf(j2)}, 1382084704, -1382084693, (int) System.currentTimeMillis());
    }

    private static void getMediationNetwork(String str, String str2) {
        int i2 = f64e + 67;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i4 = f64e + 43;
        registerClient = i4 % 128;
        if (!(i4 % 2 == 0)) {
            throw null;
        }
    }

    private void getMonetizationNetwork(Context context, String str) throws UnsupportedEncodingException {
        AFh1iSDK aFh1iSDK = new AFh1iSDK();
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        aFh1iSDK.areAllFieldsValid = null;
        aFh1iSDK.getCurrencyIso4217Code = null;
        aFh1iSDK.component2 = str;
        aFh1iSDK.AFAdRevenueData = null;
        getCurrencyIso4217Code(new Object[]{this, aFh1iSDK}, 1781271842, -1781271820, System.identityHashCode(this));
        int i2 = registerClient + 11;
        f64e = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if ((r1 != 0) != true) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r1 == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r1 = getMonetizationNetwork(r0);
        com.appsflyer.AppsFlyerProperties.getInstance().saveProperties(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("sendWithEvent from activity: ".concat(r0.getClass().getName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        r0 = r12.getRevenue();
        r2 = getMonetizationNetwork(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (isStopped() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r4 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        r1 = getMediationNetwork(r1, false);
        r4 = new com.appsflyer.internal.AFj1jSDK(getMonetizationNetwork().getMediationNetwork());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "");
        r7 = r12.getRevenue();
        r8 = r12 instanceof com.appsflyer.internal.AFh1nSDK;
        r9 = r12 instanceof com.appsflyer.internal.AFh1jSDK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        if ((r12 instanceof com.appsflyer.internal.AFh1lSDK) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (r10 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r9 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        r7 = r4.AFAdRevenueData;
        r9 = com.appsflyer.internal.AFj1jSDK.getMonetizationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        if (r8 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (r9 == true) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        r7 = '#';
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        r7 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        if (r7 == '#') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        r7 = r4.AFAdRevenueData;
        r9 = com.appsflyer.internal.AFj1jSDK.component1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
    
        r7 = com.appsflyer.internal.AFb1rSDK.registerClient + 65;
        com.appsflyer.internal.AFb1rSDK.f64e = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
    
        if (r4.getRevenue.getRevenue.getMediationNetwork("appsFlyerCount", 0) >= 2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r7 = r4.AFAdRevenueData;
        r9 = com.appsflyer.internal.AFj1jSDK.getMediationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
    
        r7 = r4.AFAdRevenueData;
        r9 = com.appsflyer.internal.AFj1jSDK.areAllFieldsValid;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ff, code lost:
    
        r7 = r4.AFAdRevenueData;
        r9 = com.appsflyer.internal.AFj1jSDK.getCurrencyIso4217Code;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0104, code lost:
    
        r4 = r4.getRevenue(com.appsflyer.internal.AFj1jSDK.getMonetizationNetwork(r4.getMediationNetwork(r7.getMonetizationNetwork(r9)), r8));
        getCurrencyIso4217Code(new java.lang.Object[]{r11, r2}, -1216379940, 1216379960, java.lang.System.identityHashCode(r11));
        r7 = new com.appsflyer.internal.AFc1tSDK(getMonetizationNetwork(), r12.getRevenue(r4).getRevenue(r2).getMediationNetwork(r1), getMonetizationNetwork().unregisterClient().getCurrencyIso4217Code());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0146, code lost:
    
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r0 = 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
    
        r0 = '`';
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        if (r0 == 18) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014f, code lost:
    
        r12 = component2();
        r0 = r12.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0155, code lost:
    
        if (r5 >= r0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        r4 = r12[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
    
        if (r4.component2 != com.appsflyer.internal.AFj1sSDK.AFa1zSDK.AFAdRevenueData) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015f, code lost:
    
        r2 = new java.lang.StringBuilder("Failed to get ");
        r2.append(r4.getMonetizationNetwork);
        r2.append(" referrer, wait ...");
        com.appsflyer.AFLogger.afDebugLog(r2.toString());
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0187, code lost:
    
        if (getMonetizationNetwork().unregisterClient().getMonetizationNetwork() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0189, code lost:
    
        r12 = com.appsflyer.internal.AFb1rSDK.f64e + 73;
        com.appsflyer.internal.AFb1rSDK.registerClient = r12 % 128;
        r12 = r12 % 2;
        com.appsflyer.AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0199, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a6, code lost:
    
        if (getMonetizationNetwork().AFKeystoreWrapper().getMonetizationNetwork() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a8, code lost:
    
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01aa, code lost:
    
        r12 = '`';
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ab, code lost:
    
        if (r12 == '`') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ad, code lost:
    
        r12 = com.appsflyer.internal.AFb1rSDK.f64e + 89;
        com.appsflyer.internal.AFb1rSDK.registerClient = r12 % 128;
        r12 = r12 % 2;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b7, code lost:
    
        r12 = getMonetizationNetwork().AFAdRevenueData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bf, code lost:
    
        if (r5 == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c1, code lost:
    
        r0 = 500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c4, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c6, code lost:
    
        com.appsflyer.internal.AFj1cSDK.getMonetizationNetwork(r12, r7, r0, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cb, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getRevenue(AFa1oSDK aFa1oSDK) throws UnsupportedEncodingException {
        Context context = getMonetizationNetwork().values().AFAdRevenueData;
        if ((context == null ? '^' : 'a') == '^') {
            int i2 = registerClient + 89;
            f64e = i2 % 128;
            int i3 = i2 % 2;
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        AFg1wSDK aFg1wSDKAFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
        String str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKAFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDKAFKeystoreWrapper));
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1oSDK.getMediationNetwork;
        if (str != null) {
            int i4 = f64e + 109;
            registerClient = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            int length = str.length();
            if (i5 != 0) {
                int i7 = 13 / 0;
            }
        }
        AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
        AFLogger.afInfoLog("AppsFlyer will not track this event.");
        if ((appsFlyerRequestListener != null ? '2' : (char) 27) != '2') {
            return;
        }
        int i8 = f64e + 85;
        registerClient = i8 % 128;
        appsFlyerRequestListener.onError(i8 % 2 != 0 ? 99 : 41, "No dev key");
    }

    public static Map<String, Object> getCurrencyIso4217Code(Map<String, Object> map) {
        Map<String, Object> map2;
        int i2 = registerClient + 91;
        f64e = i2 % 128;
        int i3 = i2 % 2;
        if ((map.containsKey("meta") ? 'T' : '$') != '$') {
            map2 = (Map) map.get("meta");
        } else {
            HashMap map3 = new HashMap();
            map.put("meta", map3);
            map2 = map3;
        }
        int i4 = registerClient + 97;
        f64e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return map2;
    }

    private void getMonetizationNetwork(String str) {
        AFa1oSDK mediationNetwork = new AFh1jSDK().getMediationNetwork(getMonetizationNetwork().getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0));
        mediationNetwork.component2 = str;
        if (!(str == null)) {
            int i2 = f64e + 45;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            if ((str.length() <= 5) || !getMonetizationNetwork().equals().getMediationNetwork(mediationNetwork)) {
                return;
            }
            AFj1cSDK.getMonetizationNetwork(getMonetizationNetwork().AFAdRevenueData(), new AFa1tSDK(mediationNetwork), 5L, TimeUnit.MILLISECONDS);
            int i4 = registerClient + 53;
            f64e = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    public final boolean AFAdRevenueData() {
        boolean z;
        int i2 = f64e + 37;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
            if ((getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) ? 'L' : ',') != ',') {
                if (getCurrencyIso4217Code() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i4 = f64e + 105;
                    registerClient = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else if (getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            if (getCurrencyIso4217Code() == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i6 = f64e + 105;
                registerClient = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if ((((java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r9}, -1684451992, 1684451992, java.lang.System.identityHashCode(r9))) == null) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (((java.lang.String) com.appsflyer.internal.AFg1wSDK.getCurrencyIso4217Code(new java.lang.Object[]{r9}, -1684451992, 1684451992, java.lang.System.identityHashCode(r9))) == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
        r8 = r8.getMediationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r5 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r9 = com.appsflyer.internal.AFb1rSDK.registerClient + 91;
        com.appsflyer.internal.AFb1rSDK.f64e = r9 % 128;
        r9 = r9 % 2;
        r8.onError(41, "No dev key");
        r8 = com.appsflyer.internal.AFb1rSDK.f64e + 3;
        com.appsflyer.internal.AFb1rSDK.registerClient = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        r9 = com.appsflyer.AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().getRevenue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r9 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r9 = com.appsflyer.internal.AFb1rSDK.f64e + 79;
        com.appsflyer.internal.AFb1rSDK.registerClient = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if ((r9 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r5 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r2 = 5 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        r8.component2 = r9;
        getCurrencyIso4217Code(new java.lang.Object[]{r7, r8}, 1781271842, -1781271820, java.lang.System.identityHashCode(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getRevenue(AFa1oSDK aFa1oSDK, AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
        int i2 = f64e + 107;
        registerClient = i2 % 128;
        char c2 = i2 % 2 != 0 ? ':' : (char) 5;
        boolean z = true;
        AFAdRevenueData(aFa1oSDK, aFh1mSDK);
        AFg1wSDK aFg1wSDKAFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
        if (c2 == ':') {
            int i3 = 0 / 0;
        }
    }

    private static void getCurrencyIso4217Code(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (Build.VERSION.SDK_INT < 31) {
                    if (!(context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0)) {
                        AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                        return;
                    } else {
                        AFLogger.INSTANCE.i(AFh1vSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    }
                }
                int i2 = registerClient + 53;
                f64e = i2 % 128;
                if (i2 % 2 == 0) {
                    context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName());
                    throw null;
                }
                if (!(context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) != 0)) {
                    AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    return;
                }
                AFLogger.INSTANCE.i(AFh1vSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                int i3 = registerClient + 33;
                f64e = i3 % 128;
                int i4 = i3 % 2;
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee A[LOOP:4: B:25:0x0071->B:51:0x00ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x004e A[EDGE_INSN: B:72:0x004e->B:70:0x004e BREAK  A[LOOP:3: B:16:0x004f->B:76:0x004f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x004e A[EDGE_INSN: B:73:0x004e->B:70:0x004e BREAK  A[LOOP:3: B:16:0x004f->B:76:0x004f], SYNTHETIC] */
    private static void getMonetizationNetwork(JSONObject jSONObject) {
        String str;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    int i3 = f64e + 73;
                    registerClient = i3 % 128;
                    int i4 = i3 % 2;
                    arrayList.add(Long.valueOf(jSONArray.getLong(i2)));
                }
            } catch (JSONException e2) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e2);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (true) {
                if ((!itKeys2.hasNext()) || str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i5 = 0;
                    while (i5 < jSONArray2.length()) {
                        int i6 = f64e + 71;
                        registerClient = i6 % 128;
                        if ((i6 % 2 != 0 ? '\t' : (char) 5) == '\t') {
                            if (jSONArray2.getLong(i5) == ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                            if (jSONArray2.getLong(i5) != ((Long) arrayList.get(1)).longValue()) {
                                break;
                                break;
                            }
                            int i7 = registerClient + 123;
                            f64e = i7 % 128;
                            int i8 = i7 % 2;
                            if (jSONArray2.getLong(i5) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                break;
                                break;
                            }
                            i5++;
                            int i9 = f64e + 17;
                            registerClient = i9 % 128;
                            int i10 = i9 % 2;
                            str = next;
                        } else {
                            if (jSONArray2.getLong(i5) == ((Long) arrayList.get(0)).longValue()) {
                                break;
                            }
                            if (jSONArray2.getLong(i5) != ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                            int i11 = registerClient + 123;
                            f64e = i11 % 128;
                            int i12 = i11 % 2;
                            if (jSONArray2.getLong(i5) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                break;
                            }
                            i5++;
                            int i13 = f64e + 17;
                            registerClient = i13 % 128;
                            int i14 = i13 % 2;
                            str = next;
                        }
                    }
                } catch (JSONException e3) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e3);
                }
            }
        }
        if ((str != null ? 1 : 0) != 1) {
            return;
        }
        jSONObject.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue(AFd1kSDK aFd1kSDK) {
        int i2 = f64e + 79;
        registerClient = i2 % 128;
        char c2 = i2 % 2 != 0 ? (char) 29 : '#';
        aFd1kSDK.valueOf().getCurrencyIso4217Code();
        if (c2 == 29) {
            throw null;
        }
        int i3 = registerClient + 91;
        f64e = i3 % 128;
        int i4 = i3 % 2;
    }

    private void getCurrencyIso4217Code(Context context, AFh1qSDK aFh1qSDK) throws UnsupportedEncodingException {
        int i2 = f64e + 23;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code(new Object[]{this, context}, -608775197, 608775214, System.identityHashCode(this));
        AFh1oSDK aFh1oSDKComponent3 = getMonetizationNetwork().component3();
        AFh1sSDK aFh1sSDKAFAdRevenueData = AFa1mSDK.AFAdRevenueData(context);
        if (!(!aFh1oSDKComponent3.getCurrencyIso4217Code())) {
            aFh1oSDKComponent3.getCurrencyIso4217Code.put("api_name", aFh1qSDK.toString());
            aFh1oSDKComponent3.AFAdRevenueData(aFh1sSDKAFAdRevenueData);
            int i4 = registerClient + 3;
            f64e = i4 % 128;
            int i5 = i4 % 2;
        }
        aFh1oSDKComponent3.getMonetizationNetwork();
    }

    private void getRevenue(Map<String, Object> map) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, map}, -1216379940, 1216379960, System.identityHashCode(this));
    }

    public static boolean getRevenue(Context context) {
        int i2 = f64e + 49;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i4 = registerClient;
                int i5 = i4 + 51;
                f64e = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 79;
                f64e = i7 % 128;
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
            int i9 = f64e + 87;
            registerClient = i9 % 128;
            if (i9 % 2 == 0) {
                return true;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException e2) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e2);
            return false;
        }
    }

    public final void getCurrencyIso4217Code(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        int i2 = f64e + 29;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String monetizationNetwork = getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
            if (monetizationNetwork == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
                int i4 = registerClient + 55;
                f64e = i4 % 128;
                int i5 = i4 % 2;
            } else {
                JSONObject jSONObject2 = new JSONObject(monetizationNetwork);
                jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                jSONObject = jSONObject2;
            }
            if (!(((long) jSONArray.length()) >= 5)) {
                int i6 = f64e + 29;
                registerClient = i6 % 128;
                int i7 = i6 % 2;
                jSONArray.put(jCurrentTimeMillis);
            }
            if (((long) jSONObject.length()) >= 4) {
                getMonetizationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            getMonetizationNetwork(context).AFAdRevenueData("extraReferrers", jSONObject.toString());
        } catch (JSONException e2) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e2);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    private void getCurrencyIso4217Code(AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener == null) {
            int i2 = registerClient + 33;
            f64e = i2 % 128;
            int i3 = i2 % 2;
        } else {
            this.getMonetizationNetwork = appsFlyerConversionListener;
            int i4 = f64e + 67;
            registerClient = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    private void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, aFa1oSDK}, 1781271842, -1781271820, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFf1bSDK aFf1bSDK) {
        int i2 = f64e + 43;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        AFd1kSDK monetizationNetwork = getMonetizationNetwork();
        if (aFf1bSDK == AFf1bSDK.SUCCESS) {
            monetizationNetwork.afErrorLog().getCurrencyIso4217Code();
        }
        if ((!monetizationNetwork.copydefault().getCurrencyIso4217Code() ? 'Z' : (char) 15) == 15) {
            monetizationNetwork.i().getMediationNetwork();
            return;
        }
        int i4 = registerClient + 7;
        f64e = i4 % 128;
        if ((i4 % 2 == 0 ? '0' : (char) 22) != '0') {
            monetizationNetwork.i().getCurrencyIso4217Code();
        } else {
            monetizationNetwork.i().getCurrencyIso4217Code();
            int i5 = 15 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(boolean z) {
        if ((z ? (char) 17 : (char) 1) == 1) {
            getMonetizationNetwork().i().getRevenue();
            int i2 = registerClient + 79;
            f64e = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = registerClient + 67;
        f64e = i4 % 128;
        if (!(i4 % 2 == 0)) {
            getMonetizationNetwork().i().getMonetizationNetwork();
        } else {
            getMonetizationNetwork().i().getMonetizationNetwork();
            throw null;
        }
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{str}, -1187185472, 1187185472, (int) System.currentTimeMillis())).booleanValue();
    }
}
