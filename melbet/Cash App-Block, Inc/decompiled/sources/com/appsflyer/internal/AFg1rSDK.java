package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1uSDK;
import com.plaid.internal.EnumC0170g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1rSDK implements AFg1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int e = 1;
    private static int unregisterClient;
    private final String AFAdRevenueData;
    private final Lazy AFKeystoreWrapper;
    private final AFh1xSDK areAllFieldsValid;
    private final AFc1qSDK component1;
    private final AFg1vSDK component2;
    private final AFi1pSDK component3;
    private final AFc1oSDK component4;
    private final AFc1hSDK copy;
    private final AFg1zSDK copydefault;
    private final Lazy equals;
    private final Context getCurrencyIso4217Code;
    private final AFi1kSDK getMediationNetwork;
    private final AFg1uSDK getMonetizationNetwork;
    private final AFj1lSDK getRevenue;
    private final AFf1eSDK hashCode;
    private final AFc1eSDK toString;
    private static char[] AFInAppEventParameterName = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int registerClient = 1912311267;
    private static boolean AFLogger = true;
    private static boolean AFInAppEventType = true;

    public AFg1rSDK(String str, Context context, AFi1kSDK aFi1kSDK, AFg1uSDK aFg1uSDK, AFj1lSDK aFj1lSDK, AFg1vSDK aFg1vSDK, AFh1xSDK aFh1xSDK, AFc1qSDK aFc1qSDK, AFc1oSDK aFc1oSDK, AFi1pSDK aFi1pSDK, AFf1eSDK aFf1eSDK, AFc1hSDK aFc1hSDK, AFg1zSDK aFg1zSDK, AFc1eSDK aFc1eSDK) {
        str.getClass();
        context.getClass();
        aFi1kSDK.getClass();
        aFg1uSDK.getClass();
        aFj1lSDK.getClass();
        aFg1vSDK.getClass();
        aFh1xSDK.getClass();
        aFc1qSDK.getClass();
        aFc1oSDK.getClass();
        aFi1pSDK.getClass();
        aFf1eSDK.getClass();
        aFc1hSDK.getClass();
        aFg1zSDK.getClass();
        aFc1eSDK.getClass();
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = context;
        this.getMediationNetwork = aFi1kSDK;
        this.getMonetizationNetwork = aFg1uSDK;
        this.getRevenue = aFj1lSDK;
        this.component2 = aFg1vSDK;
        this.areAllFieldsValid = aFh1xSDK;
        this.component1 = aFc1qSDK;
        this.component4 = aFc1oSDK;
        this.component3 = aFi1pSDK;
        this.hashCode = aFf1eSDK;
        this.copy = aFc1hSDK;
        this.copydefault = aFg1zSDK;
        this.toString = aFc1eSDK;
        this.equals = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1rSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFKeystoreWrapper = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1rSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r0 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Object AFAdRevenueData(Object[] objArr) {
        boolean z;
        boolean z2 = false;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int intValue = ((Number) objArr[2]).intValue();
        map.getClass();
        String component3 = aFg1rSDK.component4.component3();
        String AFAdRevenueData = AFAdRevenueData(aFg1rSDK.component1, component3);
        if (AFAdRevenueData == null || AFAdRevenueData.equals(component3)) {
            z = false;
        } else {
            unregisterClient = (e + 125) % 128;
            z = true;
        }
        if (AFAdRevenueData == null && component3 != null) {
            z2 = true;
        }
        if (!z) {
            int i = unregisterClient + 83;
            e = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
        map.put("af_latestchannel", component3);
        String monetizationNetwork = aFg1rSDK.getMonetizationNetwork(intValue);
        if (monetizationNetwork != null) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = monetizationNetwork.toLowerCase(locale);
            lowerCase.getClass();
            map.put("af_installstore", lowerCase);
        }
        String str = (String) getRevenue(new Object[]{aFg1rSDK, Integer.valueOf(intValue)}, -994471321, 994471330, intValue);
        if (str != null) {
            Locale locale2 = Locale.getDefault();
            locale2.getClass();
            String lowerCase2 = str.toLowerCase(locale2);
            lowerCase2.getClass();
            map.put("af_preinstall_name", lowerCase2);
            e = (unregisterClient + 19) % 128;
        }
        String areAllFieldsValid = aFg1rSDK.areAllFieldsValid();
        if (areAllFieldsValid != null) {
            Locale locale3 = Locale.getDefault();
            locale3.getClass();
            String lowerCase3 = areAllFieldsValid.toLowerCase(locale3);
            lowerCase3.getClass();
            map.put("af_currentstore", lowerCase3);
        }
        return null;
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        e = (unregisterClient + 113) % 128;
        map.getClass();
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        if (string2 != null) {
            unregisterClient = (e + 59) % 128;
            if (string2.length() != 0) {
                map.put(AppsFlyerProperties.EXTENSION, string2);
            }
        }
        int i = e + 19;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    private void AFInAppEventType(Map<String, Object> map) {
        unregisterClient = (e + 71) % 128;
        map.getClass();
        map.putAll(this.copydefault.AFAdRevenueData());
        e = (unregisterClient + 111) % 128;
    }

    private static void AFKeystoreWrapper(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
    }

    private static void AFLogger(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) {
        char[] cArr;
        char[] cArr2 = str2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            $11 = ($10 + 103) % 128;
            cArr2 = charArray;
        }
        char[] cArr3 = cArr2;
        byte[] bArr = str;
        if (str != null) {
            $11 = ($10 + 67) % 128;
            byte[] bytes = str.getBytes("ISO-8859-1");
            $10 = ($11 + 25) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr4 = AFInAppEventParameterName;
        if (cArr4 != null) {
            $10 = ($11 + 111) % 128;
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                int i3 = $10 + 117;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    cArr5[i2] = (char) (cArr4[i2] - 1825820251896122634L);
                } else {
                    cArr5[i2] = (char) (cArr4[i2] ^ 1825820251896122634L);
                    i2++;
                }
            }
            cArr4 = cArr5;
        }
        int i4 = (int) (1825820251896122634L ^ registerClient);
        if (AFInAppEventType) {
            int i5 = $11 + 25;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int length2 = bArr2.length;
                aFk1oSDK.getMonetizationNetwork = length2;
                cArr = new char[length2];
                aFk1oSDK.AFAdRevenueData = 1;
            } else {
                int length3 = bArr2.length;
                aFk1oSDK.getMonetizationNetwork = length3;
                cArr = new char[length3];
                aFk1oSDK.AFAdRevenueData = 0;
            }
            while (true) {
                int i6 = aFk1oSDK.AFAdRevenueData;
                int i7 = aFk1oSDK.getMonetizationNetwork;
                if (i6 >= i7) {
                    objArr[0] = new String(cArr);
                    return;
                } else {
                    cArr[i6] = (char) (cArr4[bArr2[(i7 - 1) - i6] + i] - i4);
                    aFk1oSDK.AFAdRevenueData = i6 + 1;
                    $11 = ($10 + 17) % 128;
                }
            }
        } else if (AFLogger) {
            int i8 = $11 + 23;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length4 = cArr3.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr6 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i10 = aFk1oSDK.AFAdRevenueData;
                int i11 = aFk1oSDK.getMonetizationNetwork;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i10] = (char) (cArr4[cArr3[(i11 - 1) - i10] - i] - i4);
                    aFk1oSDK.AFAdRevenueData = i10 + 1;
                }
            }
        } else {
            int length5 = iArr.length;
            aFk1oSDK.getMonetizationNetwork = length5;
            char[] cArr7 = new char[length5];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i12 = aFk1oSDK.AFAdRevenueData;
                int i13 = aFk1oSDK.getMonetizationNetwork;
                if (i12 >= i13) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i12] = (char) (cArr4[iArr[(i13 - 1) - i12] - i] - i4);
                    aFk1oSDK.AFAdRevenueData = i12 + 1;
                }
            }
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        String str;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int intValue = ((Number) objArr[1]).intValue();
        int i = unregisterClient + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        e = i % 128;
        if (i % 2 == 0) {
            ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
            throw null;
        }
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
        if (string2 != null) {
            return string2;
        }
        if (aFg1rSDK.component1.getMonetizationNetwork("preInstallName")) {
            int i2 = e + 71;
            unregisterClient = i2 % 128;
            int i3 = i2 % 2;
            AFc1qSDK aFc1qSDK = aFg1rSDK.component1;
            if (i3 != 0) {
                str = aFc1qSDK.getMonetizationNetwork("preInstallName", (String) null);
                int i4 = 30 / 0;
            } else {
                str = aFc1qSDK.getMonetizationNetwork("preInstallName", (String) null);
            }
        } else {
            if (intValue <= 1) {
                unregisterClient = (e + 99) % 128;
                String equals = aFg1rSDK.equals();
                if (equals == null) {
                    int i5 = e + 79;
                    unregisterClient = i5 % 128;
                    if (i5 % 2 != 0) {
                        aFg1rSDK.getMonetizationNetwork("AF_PRE_INSTALL_NAME");
                        throw null;
                    }
                    equals = aFg1rSDK.getMonetizationNetwork("AF_PRE_INSTALL_NAME");
                }
                string2 = equals;
            }
            if (string2 != null) {
                aFg1rSDK.component1.getRevenue("preInstallName", string2);
            }
            str = string2;
        }
        if (str != null) {
            unregisterClient = (e + 89) % 128;
            ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", str);
        }
        return str;
    }

    private static long component1() {
        int i = e + 101;
        unregisterClient = i % 128;
        long currentTimeMillis = i % 2 != 0 ? System.currentTimeMillis() & SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i2 = e + 31;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            return currentTimeMillis;
        }
        throw null;
    }

    private final void component2(Map<String, Object> map) {
        int i = e + 107;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled();
            throw null;
        }
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            return;
        }
        map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
        e = (unregisterClient + 95) % 128;
    }

    private void component3(Map<String, Object> map) {
        int i = e + 99;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            throw null;
        }
        map.getClass();
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        String string3 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string2 != null) {
            map.put("onelink_id", string2);
        }
        if (string3 != null) {
            int i2 = e + 75;
            unregisterClient = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("onelink_ver", string3);
            } else {
                map.put("onelink_ver", string3);
                int i3 = 0 / 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String component4() {
        String str;
        int i = e + 119;
        unregisterClient = i % 128;
        int i2 = i % 2;
        AFc1qSDK aFc1qSDK = this.component1;
        try {
        } catch (Exception e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2);
            str = i2;
        }
        if (i2 != 0) {
            aFc1qSDK.getMonetizationNetwork("androidIdCached", (String) null);
            Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
            throw null;
        }
        String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("androidIdCached", (String) null);
        String string2 = Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
        str = monetizationNetwork;
        if (string2 != null) {
            unregisterClient = (e + 29) % 128;
            return string2;
        }
        if (str == 0) {
            return null;
        }
        AFLogger.afDebugLog("use cached AndroidId: " + str);
        return str;
    }

    private final boolean copy() {
        int i = unregisterClient + 15;
        e = i % 128;
        if (i % 2 != 0 ? !((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) : !((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, true)) {
            if (!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                int i2 = (unregisterClient + 33) % 128;
                e = i2;
                int i3 = i2 + 81;
                unregisterClient = i3 % 128;
                if (i3 % 2 != 0) {
                    AFa1ySDK.getRevenue();
                    AFa1ySDK.getRevenue(this.getCurrencyIso4217Code);
                    throw null;
                }
                AFa1ySDK.getRevenue();
                if (AFa1ySDK.getRevenue(this.getCurrencyIso4217Code)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static List<AFe1pSDK> copydefault() {
        unregisterClient = (e + 47) % 128;
        List<AFe1pSDK> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.ADREVENUE});
        int i = e + 109;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
        return listOf;
    }

    private void d(Map<String, Object> map) {
        String str;
        int i = unregisterClient + 119;
        e = i % 128;
        if (i % 2 == 0) {
            map.getClass();
            if (!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, false)) {
                return;
            }
        } else {
            map.getClass();
            if (!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        }
        try {
            this.getCurrencyIso4217Code.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            str = this.component4.AFAdRevenueData(this.getCurrencyIso4217Code);
            unregisterClient = (e + 23) % 128;
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            unregisterClient = (e + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            map.put("fb", str);
        }
    }

    private void e(Map<String, Object> map) {
        unregisterClient = (e + 5) % 128;
        map.getClass();
        boolean monetizationNetwork = AFg1sSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
        if (!monetizationNetwork) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1sSDK.AFAdRevenueData(this.component1)));
        unregisterClient = (e + 45) % 128;
    }

    private final String equals() {
        int i = unregisterClient + 111;
        e = i % 128;
        if (i % 2 == 0) {
            getCurrencyIso4217Code(getMediationNetwork(getCurrencyIso4217Code("ro.appsflyer.preinstall.path")));
            throw null;
        }
        File mediationNetwork = getMediationNetwork(getCurrencyIso4217Code("ro.appsflyer.preinstall.path"));
        if (getCurrencyIso4217Code(mediationNetwork)) {
            mediationNetwork = getMediationNetwork(getMonetizationNetwork("AF_PRE_INSTALL_PATH"));
            unregisterClient = (e + 125) % 128;
        }
        if (getCurrencyIso4217Code(mediationNetwork)) {
            mediationNetwork = getMediationNetwork("/data/local/tmp/pre_install.appsflyer");
        }
        if (getCurrencyIso4217Code(mediationNetwork)) {
            mediationNetwork = getMediationNetwork("/etc/pre_install.appsflyer");
        }
        if (getCurrencyIso4217Code(mediationNetwork)) {
            return null;
        }
        String packageName = this.getCurrencyIso4217Code.getPackageName();
        packageName.getClass();
        return getMediationNetwork(mediationNetwork, packageName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r9.component4.n_().versionCode > r2.getRevenue("versionCode", 0)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getMediationNetwork(Map<String, Object> map, int i) {
        int i2 = e + 1;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        AFc1qSDK aFc1qSDK = this.component1;
        try {
            if (i3 != 0) {
                if (this.component4.n_().versionCode > aFc1qSDK.getRevenue("versionCode", 0)) {
                    int i4 = e + 103;
                    unregisterClient = i4 % 128;
                    int i5 = i4 % 2;
                    AFc1qSDK aFc1qSDK2 = this.component1;
                    if (i5 != 0) {
                        aFc1qSDK2.getMediationNetwork("versionCode", this.component4.n_().versionCode);
                        int i6 = 78 / 0;
                    } else {
                        aFc1qSDK2.getMediationNetwork("versionCode", this.component4.n_().versionCode);
                    }
                }
                map.put("app_version_code", String.valueOf(this.component4.n_().versionCode));
                map.put("app_version_name", this.component4.n_().versionName);
                map.put("targetSDKver", Integer.valueOf(this.component4.getCurrencyIso4217Code.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
                map.put("date1", getRevenue().format(new Date(((Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this))).longValue())));
                map.put("date2", getRevenue().format(new Date(this.component4.n_().lastUpdateTime)));
                Object[] objArr = new Object[1];
                a("\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
                String intern = ((String) objArr[0]).intern();
                SimpleDateFormat revenue = getRevenue();
                revenue.getClass();
                map.put(intern, getMediationNetwork(revenue, i));
                return;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
        AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        String AFAdRevenueData;
        AFb1jSDK mediationNetwork;
        int i4 = ~i3;
        int i5 = ((i2 | i3) * 521) + (((~(i4 | i2)) | i) * (-1042)) + (i2 * (-520)) + (i * 522);
        int i6 = ~i;
        switch ((((~(i | i4 | i2)) | (~(i3 | i6)) | (~((~i2) | i6))) * 521) + i5) {
            case 1:
                return getMediationNetwork(objArr);
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                Map map = (Map) objArr[1];
                map.getClass();
                AFh1xSDK aFh1xSDK = aFg1rSDK.areAllFieldsValid;
                HashMap hashMap = new HashMap(aFh1xSDK.getRevenue);
                aFh1xSDK.getRevenue.clear();
                aFh1xSDK.getMonetizationNetwork.AFAdRevenueData("gcd");
                if (!hashMap.isEmpty()) {
                    e = (unregisterClient + 61) % 128;
                    Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
                    mediationNetwork2.getClass();
                    mediationNetwork2.put("gcd", hashMap);
                }
                return null;
            case 5:
                AFg1rSDK aFg1rSDK2 = (AFg1rSDK) objArr[0];
                Map map2 = (Map) objArr[1];
                String str = (String) objArr[2];
                map2.getClass();
                if (((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK2}, -854454525, 854454532, System.identityHashCode(aFg1rSDK2))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                    map2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                    return null;
                }
                String monetizationNetwork = aFg1rSDK2.hashCode.getMonetizationNetwork(aFg1rSDK2.component1);
                if (monetizationNetwork != null) {
                    e = (unregisterClient + 103) % 128;
                    if (monetizationNetwork.length() != 0) {
                        map2.put("imei", monetizationNetwork);
                        AFAdRevenueData = aFg1rSDK2.AFAdRevenueData(str);
                        if (AFAdRevenueData == null) {
                            aFg1rSDK2.component1.getRevenue("androidIdCached", AFAdRevenueData);
                            map2.put("android_id", AFAdRevenueData);
                        } else {
                            AFLogger.afInfoLog("Android ID was not collected.");
                        }
                        mediationNetwork = AFb1lSDK.getMediationNetwork(aFg1rSDK2.getCurrencyIso4217Code);
                        if (mediationNetwork != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Boolean bool = mediationNetwork.getMonetizationNetwork;
                            bool.getClass();
                            linkedHashMap.put("isManual", bool);
                            String str2 = mediationNetwork.getRevenue;
                            str2.getClass();
                            linkedHashMap.put("val", str2);
                            Boolean bool2 = mediationNetwork.getCurrencyIso4217Code;
                            if (bool2 != null) {
                                unregisterClient = (e + 93) % 128;
                                linkedHashMap.put("isLat", bool2);
                                unregisterClient = (e + 79) % 128;
                            }
                            map2.put("oaid", linkedHashMap);
                        }
                        return null;
                    }
                }
                e = (unregisterClient + 95) % 128;
                AFAdRevenueData = aFg1rSDK2.AFAdRevenueData(str);
                if (AFAdRevenueData == null) {
                }
                mediationNetwork = AFb1lSDK.getMediationNetwork(aFg1rSDK2.getCurrencyIso4217Code);
                if (mediationNetwork != null) {
                }
                return null;
            case 6:
                return AFAdRevenueData(objArr);
            case 7:
                return component1(objArr);
            case 8:
                return component4(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                AFg1rSDK aFg1rSDK3 = (AFg1rSDK) objArr[0];
                e = (unregisterClient + 41) % 128;
                Long valueOf = Long.valueOf(aFg1rSDK3.component4.n_().firstInstallTime);
                e = (unregisterClient + 73) % 128;
                return valueOf;
            case 11:
                AFg1rSDK aFg1rSDK4 = (AFg1rSDK) objArr[0];
                AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
                e = (unregisterClient + 109) % 128;
                aFh1mSDK.getClass();
                Map<String, Object> map3 = aFh1mSDK.AFAdRevenueData;
                map3.getClass();
                getRevenue(new Object[]{aFg1rSDK4, map3}, -539509618, 539509626, System.identityHashCode(aFg1rSDK4));
                Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
                map4.getClass();
                aFg1rSDK4.getMediationNetwork(map4, aFh1mSDK.component4);
                Map<String, Object> map5 = aFh1mSDK.AFAdRevenueData;
                map5.getClass();
                int i7 = aFh1mSDK.component4;
                getRevenue(new Object[]{aFg1rSDK4, map5, Integer.valueOf(i7)}, 1731268052, -1731268046, i7);
                Map<String, Object> map6 = aFh1mSDK.AFAdRevenueData;
                map6.getClass();
                aFg1rSDK4.registerClient(map6);
                Map<String, Object> map7 = aFh1mSDK.AFAdRevenueData;
                map7.getClass();
                aFg1rSDK4.d(map7);
                Map<String, Object> map8 = aFh1mSDK.AFAdRevenueData;
                map8.getClass();
                AFe1pSDK AFAdRevenueData2 = aFh1mSDK.AFAdRevenueData();
                AFAdRevenueData2.getClass();
                aFg1rSDK4.getMediationNetwork(map8, AFAdRevenueData2);
                e = (unregisterClient + 67) % 128;
                return null;
            case 12:
                AFg1rSDK aFg1rSDK5 = (AFg1rSDK) objArr[0];
                Map map9 = (Map) objArr[1];
                unregisterClient = (e + 49) % 128;
                AFg1uSDK.AFa1zSDK currencyIso4217Code = aFg1rSDK5.getMonetizationNetwork.getCurrencyIso4217Code(aFg1rSDK5.getCurrencyIso4217Code);
                float f = currencyIso4217Code.getMonetizationNetwork;
                String str3 = currencyIso4217Code.AFAdRevenueData;
                map9.put("btl", String.valueOf(f));
                if (str3 != null) {
                    map9.put("btch", str3);
                    unregisterClient = (e + 73) % 128;
                }
                return null;
            default:
                return getCurrencyIso4217Code(objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        com.appsflyer.internal.AFg1rSDK.e = (com.appsflyer.internal.AFg1rSDK.unregisterClient + 49) % 128;
        r5.put("prev_session_dur", java.lang.Long.valueOf(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void hashCode(Map<String, Object> map) {
        long j;
        int i = e + 71;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            j = this.areAllFieldsValid.copydefault;
        } else {
            map.getClass();
            j = this.areAllFieldsValid.copydefault;
        }
        e = (unregisterClient + 101) % 128;
    }

    private void i(Map<String, Object> map) {
        map.getClass();
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
            e = (unregisterClient + 33) % 128;
        }
        unregisterClient = (e + 3) % 128;
    }

    private void registerClient(Map<String, Object> map) {
        int i = e + 91;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
            throw null;
        }
        map.getClass();
        map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
        unregisterClient = (e + 37) % 128;
    }

    private final void toString(Map<String, Object> map) {
        int i = unregisterClient + 89;
        e = i % 128;
        int i2 = i % 2;
        Context context = this.getCurrencyIso4217Code;
        if (i2 == 0) {
            int i3 = 38 / 0;
            if (!AFg1iSDK.getMonetizationNetwork(context)) {
                return;
            }
        } else if (!AFg1iSDK.getMonetizationNetwork(context)) {
            return;
        }
        int i4 = unregisterClient + 25;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            map.put("inst_app", Boolean.TRUE);
            throw null;
        }
        map.put("inst_app", Boolean.TRUE);
        e = (unregisterClient + 91) % 128;
    }

    private void unregisterClient(Map<String, Object> map) {
        int i = unregisterClient + 105;
        e = i % 128;
        if (i % 2 == 0) {
            map.getClass();
            AFb1lSDK.l_(this.getCurrencyIso4217Code.getContentResolver());
            throw null;
        }
        map.getClass();
        AFb1jSDK l_ = AFb1lSDK.l_(this.getCurrencyIso4217Code.getContentResolver());
        if (l_ == null) {
            unregisterClient = (e + 121) % 128;
            return;
        }
        int i2 = unregisterClient + 49;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            map.put("amazon_aid", l_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(l_.getCurrencyIso4217Code));
        } else {
            map.put("amazon_aid", l_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(l_.getCurrencyIso4217Code));
            int i3 = 37 / 0;
        }
    }

    private void w(Map<String, Object> map) {
        int i = unregisterClient + 113;
        e = i % 128;
        if (i % 2 == 0) {
            map.getClass();
            this.hashCode.getMediationNetwork();
            throw null;
        }
        map.getClass();
        String mediationNetwork = this.hashCode.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.length() == 0) {
            return;
        }
        e = (unregisterClient + 109) % 128;
        map.put("appsflyerKey", mediationNetwork);
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        e = (unregisterClient + 103) % 128;
        aFh1mSDK.getClass();
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        map.getClass();
        AFAdRevenueData(map, aFh1mSDK.getRevenue());
        areAllFieldsValid(map);
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
        getRevenue(map);
        getRevenue(new Object[]{this, map, this.toString.getCurrencyIso4217Code}, 274047423, -274047418, System.identityHashCode(this));
        unregisterClient(map);
        map.put("cell", MapsKt__MapsKt.mapOf(new Pair("mcc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mnc))));
        map.put("sig", AFAdRevenueData());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", component2());
        unregisterClient = (e + 73) % 128;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(Map<String, Object> map) {
        Object obj;
        unregisterClient = (e + 13) % 128;
        map.getClass();
        Object string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_ID);
        if (string2 != null) {
            int i = unregisterClient + 109;
            e = i % 128;
            if (i % 2 == 0) {
                map.put(AppsFlyerProperties.APP_ID, string2);
                int i2 = 21 / 0;
            } else {
                map.put(AppsFlyerProperties.APP_ID, string2);
            }
        }
        String string3 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string3 != null) {
            int i3 = e + 93;
            unregisterClient = i3 % 128;
            if (i3 % 2 == 0 ? string3.length() != 3 : string3.length() != 2) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string3);
                sb.append("' is not a legal value.");
                AFLogger.afWarnLog(sb.toString());
            }
            map.put("currency", string3);
        }
        Object string4 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            e = (unregisterClient + 113) % 128;
            map.put("isUpdate", string4);
            e = (unregisterClient + 27) % 128;
        }
        Object string5 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            map.put("customData", string5);
        }
        Object string6 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            int i4 = unregisterClient + 85;
            e = i4 % 128;
            if (i4 % 2 == 0) {
                map.put("appUserId", string6);
                int i5 = 2 / 0;
            } else {
                map.put("appUserId", string6);
            }
        }
        Object string7 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            int i6 = unregisterClient + 31;
            e = i6 % 128;
            if (i6 % 2 == 0) {
                map.put("user_emails", string7);
                throw null;
            }
            map.put("user_emails", string7);
        }
        AFb1tSDK aFb1tSDK = this.toString.getRevenue;
        if (aFb1tSDK == null || (obj = aFb1tSDK.AFAdRevenueData) == null) {
            return;
        }
        map.put("sharing_filter", obj);
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i = unregisterClient + 83;
        e = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1rSDK.equals.getValue();
        if (i2 != 0) {
            return appsFlyerProperties;
        }
        throw null;
    }

    private void component1(Map<String, ? extends Object> map) {
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
    }

    private void copydefault(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
    }

    private static String component2() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        int i = e + 113;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        try {
            long longValue = ((Long) getRevenue(new Object[]{aFg1rSDK}, 1297709710, -1297709700, System.identityHashCode(aFg1rSDK))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(longValue)));
            int i = unregisterClient + 109;
            e = i % 128;
            if (i % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e2);
            return null;
        }
    }

    private final void component4(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -753773633, 753773645, System.identityHashCode(this));
    }

    private void equals(Map<String, Object> map) {
        int i = e + 107;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            int i2 = 75 / 0;
        } else {
            map.getClass();
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        }
        e = (unregisterClient + 89) % 128;
    }

    private final void copy(Map<String, Object> map) {
        e = (unregisterClient + 59) % 128;
        UiModeManager uiModeManager = (UiModeManager) this.getCurrencyIso4217Code.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            int i = unregisterClient + 27;
            e = i % 128;
            if (i % 2 == 0) {
                if (uiModeManager.getCurrentModeType() != 2) {
                    return;
                }
            } else if (uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            int i2 = unregisterClient + 65;
            e = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("tv", Boolean.TRUE);
            } else {
                map.put("tv", Boolean.TRUE);
                throw null;
            }
        }
    }

    private boolean component3() {
        unregisterClient = (e + 73) % 128;
        boolean parseBoolean = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
        int i = e + 13;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
            return parseBoolean;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, int i, int i2) {
        boolean z;
        map.getClass();
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        if (component3()) {
            unregisterClient = (e + 67) % 128;
            z = false;
        } else {
            unregisterClient = (e + 109) % 128;
            z = true;
        }
        map.put("isFirstCall", String.valueOf(z));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final long getCurrencyIso4217Code() {
        e = (unregisterClient + 57) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        int i = e + 121;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
            return currentTimeMillis;
        }
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        e = (unregisterClient + 69) % 128;
        map.getClass();
        long monetizationNetwork = aFg1rSDK.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        aFg1rSDK.component1.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        map.put("timepassedsincelastlaunch", String.valueOf(monetizationNetwork > 0 ? (currentTimeMillis - monetizationNetwork) / 1000 : -1L));
        int i = e + 107;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
        return null;
    }

    private void AFAdRevenueData(Map<String, Object> map, boolean z) {
        map.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", getCurrencyIso4217Code("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", getCurrencyIso4217Code("ro.product.cpu.abi2"));
        hashMap.put("arch", getCurrencyIso4217Code("os.arch"));
        hashMap.put("build_display_id", getCurrencyIso4217Code("ro.build.display.id"));
        if (z) {
            getRevenue(new Object[]{this, hashMap}, -753773633, 753773645, System.identityHashCode(this));
            if (this.component4.getMediationNetwork.getRevenue("appsFlyerCount", 0) <= 2) {
                int i = unregisterClient + 43;
                e = i % 128;
                int i2 = i % 2;
                AFj1lSDK aFj1lSDK = this.getRevenue;
                if (i2 == 0) {
                    hashMap.putAll(aFj1lSDK.getMediationNetwork());
                    throw null;
                }
                hashMap.putAll(aFj1lSDK.getMediationNetwork());
            }
        }
        hashMap.put("dim", this.component2.getMediationNetwork(this.getCurrencyIso4217Code));
        map.put("deviceData", hashMap);
        unregisterClient = (e + 119) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        r0 = getMonetizationNetwork("AF_STORE");
        com.appsflyer.internal.AFg1rSDK.e = (com.appsflyer.internal.AFg1rSDK.unregisterClient + 31) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String areAllFieldsValid() {
        String string2;
        int i = unregisterClient + 109;
        e = i % 128;
        if (i % 2 == 0) {
            string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i2 = 81 / 0;
        } else {
            string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
        }
        unregisterClient = (e + 111) % 128;
        return string2;
    }

    private static String getCurrencyIso4217Code(String str) {
        unregisterClient = (e + 75) % 128;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            invoke.getClass();
            String str2 = (String) invoke;
            e = (unregisterClient + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static void areAllFieldsValid(Map<String, Object> map) {
        e = (unregisterClient + 91) % 128;
        map.getClass();
        Object[] objArr = new Object[1];
        a("\u008f\u0089\u0087\u0083\u008e", null, null, (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 127, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        e = (unregisterClient + 19) % 128;
    }

    private static boolean getCurrencyIso4217Code(File file) {
        int i = e;
        unregisterClient = (i + 33) % 128;
        if (file == null) {
            return true;
        }
        unregisterClient = (i + 79) % 128;
        if (!file.exists()) {
            return true;
        }
        int i2 = unregisterClient + 59;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 528204691, -528204690, System.identityHashCode(this));
    }

    private String AFAdRevenueData() {
        int i = unregisterClient + 69;
        e = i % 128;
        int i2 = i % 2;
        Context context = this.getCurrencyIso4217Code;
        if (i2 == 0) {
            AFj1kSDK.N_(context.getApplicationContext().getPackageManager(), this.getCurrencyIso4217Code.getApplicationContext().getPackageName());
            throw null;
        }
        String N_ = AFj1kSDK.N_(context.getApplicationContext().getPackageManager(), this.getCurrencyIso4217Code.getApplicationContext().getPackageName());
        unregisterClient = (e + 55) % 128;
        return N_;
    }

    private final String AFAdRevenueData(String str) {
        int i = e + 43;
        unregisterClient = i % 128;
        if (i % 2 == 0 ? ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) : ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, true)) {
            if (str == null || str.length() == 0) {
                e = (unregisterClient + 13) % 128;
                if (!copy()) {
                    return null;
                }
                int i2 = e + 105;
                unregisterClient = i2 % 128;
                if (i2 % 2 == 0) {
                    return component4();
                }
                component4();
                throw null;
            }
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    private void AFAdRevenueData(AFh1mSDK aFh1mSDK, String str, String str2, AFb1rSDK aFb1rSDK) {
        e = (unregisterClient + 61) % 128;
        aFh1mSDK.getClass();
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
            map.getClass();
            component2(map);
            copy(map);
            toString(map);
            AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
        }
        map.getClass();
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
        component3(map);
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
        getMonetizationNetwork(map, str2);
        AFAdRevenueData(map, str);
        hashCode(map);
        if (aFb1rSDK != null) {
            e = (unregisterClient + 31) % 128;
            aFb1rSDK.getCurrencyIso4217Code(map);
            return;
        }
        int i = e + 35;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
        }
    }

    private void AFAdRevenueData(Map<String, Object> map, String str) {
        e = (unregisterClient + 7) % 128;
        map.getClass();
        if (str != null) {
            e = (unregisterClient + 89) % 128;
            if (str.length() != 0) {
                map.put("referrer", str);
            }
        }
        Object monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", (String) null);
        if (monetizationNetwork != null) {
            map.put("extraReferrers", monetizationNetwork);
        }
        String referrer = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getReferrer(this.component1);
        if (referrer != null && referrer.length() != 0) {
            unregisterClient = (e + 27) % 128;
            if (map.get("referrer") == null) {
                map.put("referrer", referrer);
                return;
            }
            return;
        }
        e = (unregisterClient + 111) % 128;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(Map<String, Object> map) {
        map.getClass();
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component4.getMediationNetwork);
        if (currencyIso4217Code != null) {
            map.put("uid", currencyIso4217Code);
            if (this.component4.getMediationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false)) {
                e = (unregisterClient + 97) % 128;
                map.put("custom_install_id", Boolean.TRUE);
            }
            int i = unregisterClient + 87;
            e = i % 128;
            if (i % 2 == 0) {
                int i2 = 63 / 0;
            }
        }
    }

    private static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
        int i = unregisterClient + 73;
        e = i % 128;
        if (i % 2 != 0) {
            String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            if (monetizationNetwork != null) {
                e = (unregisterClient + 39) % 128;
                return monetizationNetwork;
            }
            aFc1qSDK.getRevenue("CACHED_CHANNEL", str);
            return str;
        }
        aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        throw null;
    }

    private void AFAdRevenueData(Map<String, Object> map, int i) {
        getRevenue(new Object[]{this, map, Integer.valueOf(i)}, 1731268052, -1731268046, i);
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        getRevenue(new Object[]{this, aFh1mSDK}, 572486758, -572486747, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        AFd1aSDK aFd1aSDK;
        aFh1mSDK.getClass();
        if (!this.component4.component2()) {
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            mediationNetwork.getClass();
            mediationNetwork.put("ad_ids_disabled", Boolean.TRUE);
        } else {
            AFh1rSDK aFh1rSDK = this.component4.getMonetizationNetwork.component3;
            if (aFh1rSDK == null) {
                return;
            }
            String str = aFh1rSDK.getRevenue;
            if (str != null && str.length() != 0) {
                unregisterClient = (e + 121) % 128;
                aFh1mSDK.getMonetizationNetwork("gaidError", aFh1rSDK.getRevenue);
            }
            String str2 = aFh1rSDK.getMediationNetwork;
            if (str2 != null && aFh1rSDK.getMonetizationNetwork != null) {
                aFh1mSDK.getMonetizationNetwork("advertiserId", str2);
                aFh1mSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1rSDK.getMonetizationNetwork));
                aFh1mSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1rSDK.getCurrencyIso4217Code));
            }
        }
        AFh1rSDK aFh1rSDK2 = this.component4.getMonetizationNetwork.component3;
        aFh1mSDK.getMonetizationNetwork("GAID_retry", String.valueOf(aFh1rSDK2 != null ? Intrinsics.areEqual(aFh1rSDK2.areAllFieldsValid, Boolean.TRUE) : false));
        if (!CollectionsKt__CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH}).contains(aFh1mSDK.AFAdRevenueData()) || (aFd1aSDK = this.toString.component4) == null) {
            return;
        }
        int i = unregisterClient + 57;
        e = i % 128;
        int i2 = i % 2;
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        if (i2 != 0) {
            Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork(map);
            mediationNetwork2.getClass();
            mediationNetwork2.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
        } else {
            Map<String, Object> mediationNetwork3 = AFa1ySDK.getMediationNetwork(map);
            mediationNetwork3.getClass();
            mediationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
            throw null;
        }
    }

    private static Object getMediationNetwork(Object[] objArr) {
        Object failure;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        unregisterClient = (e + 91) % 128;
        map.getClass();
        String str = aFg1rSDK.toString.getMonetizationNetwork;
        if (str != null) {
            e = (unregisterClient + 107) % 128;
            if (map.get("af_deeplink") != null) {
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    failure = Unit.INSTANCE;
                    unregisterClient = (e + 59) % 128;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", m4120exceptionOrNullimpl, false, false, false, false, 120, null);
                } else {
                    unregisterClient = (e + 3) % 128;
                }
            }
        }
        aFg1rSDK.toString.getMonetizationNetwork = null;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFg1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        int i;
        aFh1mSDK.getClass();
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        map.getClass();
        map.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
        String str = aFh1mSDK.copydefault;
        if (str != null) {
            int i2 = unregisterClient + 37;
            e = i2 % 128;
            if (i2 % 2 != 0) {
                if (!StringsKt.isBlank(str)) {
                    int i3 = unregisterClient + 111;
                    e = i3 % 128;
                    int i4 = i3 % 2;
                    String str2 = aFh1mSDK.copydefault;
                    if (i4 == 0) {
                        map.put("af_web_referrer", str2);
                        int i5 = 19 / 0;
                    } else {
                        map.put("af_web_referrer", str2);
                    }
                    i = unregisterClient + 61;
                    e = i % 128;
                    if (i % 2 != 0) {
                        int i6 = 77 / 0;
                        return;
                    }
                    return;
                }
            } else {
                StringsKt.isBlank(str);
                throw null;
            }
        }
        unregisterClient = (e + 23) % 128;
        i = unregisterClient + 61;
        e = i % 128;
        if (i % 2 != 0) {
        }
    }

    private void getMediationNetwork(Map<String, Object> map, String str) {
        unregisterClient = (e + 49) % 128;
        map.getClass();
        str.getClass();
        try {
            String monetizationNetwork = this.component1.getMonetizationNetwork("prev_event_name", (String) null);
            if (monetizationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.component1.getMonetizationNetwork("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", monetizationNetwork);
                map.put("prev_event", jSONObject);
            }
            this.component1.getRevenue("prev_event_name", str);
            this.component1.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
            int i = unregisterClient + 113;
            e = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (Exception e2) {
            AFLogger.afErrorLog("Error while processing previous event.", e2);
        }
    }

    private String getMediationNetwork(SimpleDateFormat simpleDateFormat, int i) {
        String str;
        int i2 = e + 7;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            simpleDateFormat.getClass();
            String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
            if (monetizationNetwork == null) {
                int i3 = unregisterClient;
                e = (i3 + 93) % 128;
                if (i <= 1) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    str = simpleDateFormat.format(new Date());
                } else {
                    e = (i3 + 41) % 128;
                    str = "";
                }
                monetizationNetwork = str;
                this.component1.getRevenue("appsFlyerFirstInstall", monetizationNetwork);
            }
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, Recorder$$ExternalSyntheticOutline2.m("AppsFlyer: first launch date: ", monetizationNetwork), false, 4, null);
            monetizationNetwork.getClass();
            return monetizationNetwork;
        }
        simpleDateFormat.getClass();
        this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
        throw null;
    }

    private void getMonetizationNetwork(Map<String, Object> map, boolean z) {
        e = (unregisterClient + 19) % 128;
        map.getClass();
        map.put("platformextension", this.AFAdRevenueData);
        if (z) {
            map.put("platform_extension_v2", this.getMediationNetwork.getCurrencyIso4217Code());
        }
        unregisterClient = (e + 3) % 128;
    }

    private String getMonetizationNetwork(int i) {
        String str = null;
        if (this.component1.getMonetizationNetwork("INSTALL_STORE")) {
            unregisterClient = (e + 83) % 128;
            String monetizationNetwork = this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
            int i2 = e + 21;
            unregisterClient = i2 % 128;
            if (i2 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        if (i <= 1) {
            int i3 = unregisterClient + 103;
            e = i3 % 128;
            if (i3 % 2 != 0) {
                str = areAllFieldsValid();
                this.component1.getRevenue("INSTALL_STORE", str);
                return str;
            }
        }
        unregisterClient = (e + 77) % 128;
        this.component1.getRevenue("INSTALL_STORE", str);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        r2.put("phone", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r3 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i = e + 87;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            int i2 = 86 / 0;
        } else {
            map.getClass();
        }
        int i3 = e + 61;
        unregisterClient = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        e = (unregisterClient + 43) % 128;
        map.getClass();
        aFe1pSDK.getClass();
        if (!copydefault().contains(aFe1pSDK)) {
            unregisterClient = (e + 57) % 128;
            return;
        }
        if (this.toString.getMediationNetwork()) {
            map.put("app_set_id", MapsKt__MapsJVMKt.mapOf(new Pair("app_set_id_disabled", Boolean.TRUE)));
            if (this.toString.copydefault != null) {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                return;
            } else {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                return;
            }
        }
        AFb1gSDK aFb1gSDK = this.toString.copydefault;
        if (aFb1gSDK != null) {
            map.put("app_set_id", MapsKt__MapsKt.mapOf(new Pair("scope", Integer.valueOf(aFb1gSDK.getMonetizationNetwork)), new Pair("id", aFb1gSDK.getMediationNetwork)));
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        e = (unregisterClient + 11) % 128;
        map.getClass();
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e2);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e3);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            unregisterClient = (e + 85) % 128;
            return null;
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e4);
            return null;
        }
    }

    private final String getMonetizationNetwork(String str) {
        e = (unregisterClient + 119) % 128;
        String currencyIso4217Code = this.component4.getCurrencyIso4217Code(str);
        e = (unregisterClient + 69) % 128;
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final Long getMonetizationNetwork() {
        return (Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this));
    }

    private static File getMediationNetwork(String str) {
        int i = e + 5;
        unregisterClient = i % 128;
        try {
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        if (i % 2 == 0) {
            if (str != null && StringsKt.trim(str).toString().length() > 0) {
                File file = new File(StringsKt.trim(str).toString());
                int i2 = e + 55;
                unregisterClient = i2 % 128;
                if (i2 % 2 == 0) {
                    return file;
                }
                throw null;
            }
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r3 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getMediationNetwork(File file, String str) {
        InputStreamReader inputStreamReader;
        Properties properties;
        try {
            if (file == null) {
                int i = unregisterClient + 65;
                e = i % 128;
                if (i % 2 != 0) {
                    return null;
                }
                throw null;
            }
            try {
                properties = new Properties();
                inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            } catch (FileNotFoundException unused) {
                inputStreamReader = null;
            } catch (Throwable th) {
                th = th;
                inputStreamReader = null;
            }
            try {
                properties.load(inputStreamReader);
                AFLogger.afInfoLog("Found PreInstall property!");
                String property = properties.getProperty(str);
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    AFLogger.afErrorLog(th2.getMessage(), th2);
                }
                int i2 = unregisterClient + 55;
                e = i2 % 128;
                if (i2 % 2 != 0) {
                    return property;
                }
                throw null;
            } catch (FileNotFoundException unused2) {
                AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
            } catch (Throwable th3) {
                th = th3;
                AFLogger.afErrorLog(th.getMessage(), th);
            }
            return null;
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    AFLogger.afErrorLog(th4.getMessage(), th4);
                }
            }
        }
    }

    private static void getMediationNetwork(Map<String, Object> map, AFh1mSDK aFh1mSDK) {
        map.getClass();
        aFh1mSDK.getClass();
        String str = aFh1mSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1mSDK.getRevenue;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private final void getMediationNetwork(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -539509618, 539509626, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getMediationNetwork() {
        return (AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(Map<String, Object> map) {
        AFi1rSDK aFi1rSDK;
        map.getClass();
        AFi1qSDK aFi1qSDK = this.component3.getMonetizationNetwork;
        if (aFi1qSDK != null) {
            unregisterClient = (e + 107) % 128;
            aFi1rSDK = aFi1qSDK.getMonetizationNetwork();
        } else {
            aFi1rSDK = null;
        }
        if (aFi1rSDK != null) {
            map.put("network", aFi1rSDK.getCurrencyIso4217Code);
            map.put("ivc", Boolean.valueOf(aFi1rSDK.getMediationNetwork()));
            if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            int i = (e + 65) % 128;
            unregisterClient = i;
            int i2 = i + 99;
            e = i2 % 128;
            int i3 = i2 % 2;
            String str = aFi1rSDK.getMonetizationNetwork;
            if (i3 != 0) {
                if (str != null) {
                    map.put("operator", str);
                }
                String str2 = aFi1rSDK.getRevenue;
                if (str2 != null) {
                    map.put("carrier", str2);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    private final SimpleDateFormat getRevenue() {
        int i = unregisterClient + 71;
        e = i % 128;
        int i2 = i % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        if (i2 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(AFh1mSDK aFh1mSDK) {
        int i = unregisterClient + 75;
        e = i % 128;
        if (i % 2 != 0) {
            aFh1mSDK.getClass();
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            if (aFh1mSDK.getRevenue()) {
                unregisterClient = (e + 47) % 128;
                String str = aFh1mSDK.component1;
                AFc1eSDK aFc1eSDK = this.toString;
                AFAdRevenueData(aFh1mSDK, str, aFc1eSDK.getMediationNetwork, aFc1eSDK.AFAdRevenueData);
            } else if (!(aFh1mSDK instanceof AFh1fSDK)) {
                map.getClass();
                String str2 = aFh1mSDK.areAllFieldsValid;
                str2.getClass();
                getMediationNetwork(map, str2);
            }
            if (CollectionsKt__CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP}).contains(aFh1mSDK.AFAdRevenueData())) {
                int i2 = e + 107;
                unregisterClient = i2 % 128;
                if (i2 % 2 != 0) {
                    map.getClass();
                    equals(map);
                    int i3 = 37 / 0;
                } else {
                    map.getClass();
                    equals(map);
                }
            }
            map.getClass();
            w(map);
            getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
            AFInAppEventType(map);
            AFInAppEventParameterName(map);
            AFAdRevenueData(map);
            getMonetizationNetwork(map, aFh1mSDK.getRevenue());
            e(map);
            i(map);
            getMediationNetwork(map, aFh1mSDK);
            map.put("af_events_api", "1");
            return;
        }
        aFh1mSDK.getClass();
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        aFh1mSDK.getRevenue();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        com.appsflyer.internal.AFg1rSDK.unregisterClient = (com.appsflyer.internal.AFg1rSDK.e + 67) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (java.lang.Integer.parseInt(r2) <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r3 = com.appsflyer.internal.AFg1rSDK.unregisterClient + 109;
        com.appsflyer.internal.AFg1rSDK.e = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if ((r3 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r6.put("reinstallCounter", r2);
        r6.put("originalAppsflyerId", r1);
        r6 = 28 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r6.put("reinstallCounter", r2);
        r6.put("originalAppsflyerId", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String monetizationNetwork;
        String currencyIso4217Code;
        Map map = (Map) objArr[0];
        int i = e + 79;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
            currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
            int i2 = 20 / 0;
        } else {
            map.getClass();
            monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
            currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
        }
        int i3 = e + 57;
        unregisterClient = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void getRevenue(Map<String, Object> map, String str) {
        getRevenue(new Object[]{this, map, str}, 274047423, -274047418, System.identityHashCode(this));
    }

    private String getRevenue(int i) {
        return (String) getRevenue(new Object[]{this, Integer.valueOf(i)}, -994471321, 994471330, i);
    }
}
