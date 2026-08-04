package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.RequestError;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
public final class AFg1iSDK implements AFg1kSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 2115549242;
    private static int AFKeystoreWrapper = 1;
    private static int values;
    private final AFi1oSDK AFAdRevenueData;
    private final f.a AFInAppEventType;
    private final AFa1aSDK areAllFieldsValid;
    private final AFd1rSDK component1;
    private final AFi1qSDK component2;
    private final AFd1qSDK component3;
    private final AFh1oSDK component4;
    private final AFd1nSDK copy;
    private final AFg1rSDK copydefault;
    private final AFd1tSDK equals;
    private final AFj1oSDK getCurrencyIso4217Code;
    private final AFd1vSDK getMediationNetwork;
    private final Context getMonetizationNetwork;
    private final String getRevenue;
    private final f.a hashCode;
    private final AFg1wSDK toString;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1iSDK$3, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass3 extends m.d implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass3 getMediationNetwork = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1iSDK$4, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass4 extends m.d implements Function0<SimpleDateFormat> {
        public static final AnonymousClass4 AFAdRevenueData = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    public AFg1iSDK(String str, Context context, AFi1oSDK aFi1oSDK, AFd1vSDK aFd1vSDK, AFj1oSDK aFj1oSDK, AFa1aSDK aFa1aSDK, AFh1oSDK aFh1oSDK, AFd1rSDK aFd1rSDK, AFd1qSDK aFd1qSDK, AFi1qSDK aFi1qSDK, AFg1wSDK aFg1wSDK, AFd1nSDK aFd1nSDK, AFg1rSDK aFg1rSDK, AFd1tSDK aFd1tSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1vSDK, "");
        Intrinsics.checkNotNullParameter(aFj1oSDK, "");
        Intrinsics.checkNotNullParameter(aFa1aSDK, "");
        Intrinsics.checkNotNullParameter(aFh1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFi1qSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1tSDK, "");
        this.getRevenue = str;
        this.getMonetizationNetwork = context;
        this.AFAdRevenueData = aFi1oSDK;
        this.getMediationNetwork = aFd1vSDK;
        this.getCurrencyIso4217Code = aFj1oSDK;
        this.areAllFieldsValid = aFa1aSDK;
        this.component4 = aFh1oSDK;
        this.component1 = aFd1rSDK;
        this.component3 = aFd1qSDK;
        this.component2 = aFi1qSDK;
        this.toString = aFg1wSDK;
        this.copy = aFd1nSDK;
        this.copydefault = aFg1rSDK;
        this.equals = aFd1tSDK;
        this.hashCode = f.b.a(AnonymousClass3.getMediationNetwork);
        this.AFInAppEventType = f.b.a(AnonymousClass4.AFAdRevenueData);
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        int i2 = AFKeystoreWrapper + 33;
        values = i2 % 128;
        char c2 = i2 % 2 != 0 ? 'A' : '6';
        Intrinsics.checkNotNullParameter(map, "");
        if (c2 != '6') {
            map.putAll(this.copydefault.getRevenue());
            int i3 = 35 / 0;
        } else {
            map.putAll(this.copydefault.getRevenue());
        }
        int i4 = AFKeystoreWrapper + 67;
        values = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
    /* JADX WARN: Code duplicated, block: B:12:0x006f  */
    /* JADX WARN: Code duplicated, block: B:9:0x004b  */
    private final String AFInAppEventType() {
        File file;
        int i2;
        int i3 = values + 23;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 == 0) {
            file = (File) getCurrencyIso4217Code(new Object[]{AFAdRevenueData("ro.appsflyer.preinstall.path")}, 1393711468, -1393711457, (int) System.currentTimeMillis());
            int i4 = 91 / 0;
            if (getCurrencyIso4217Code(file)) {
                i2 = values + 73;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 == 0) {
                    file = (File) getCurrencyIso4217Code(new Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, 1393711468, -1393711457, (int) System.currentTimeMillis());
                    int i5 = 6 / 0;
                } else {
                    file = (File) getCurrencyIso4217Code(new Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, 1393711468, -1393711457, (int) System.currentTimeMillis());
                }
            }
        } else {
            file = (File) getCurrencyIso4217Code(new Object[]{AFAdRevenueData("ro.appsflyer.preinstall.path")}, 1393711468, -1393711457, (int) System.currentTimeMillis());
            if (getCurrencyIso4217Code(file)) {
                i2 = values + 73;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 == 0) {
                    file = (File) getCurrencyIso4217Code(new Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, 1393711468, -1393711457, (int) System.currentTimeMillis());
                    int i6 = 6 / 0;
                } else {
                    file = (File) getCurrencyIso4217Code(new Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, 1393711468, -1393711457, (int) System.currentTimeMillis());
                }
            }
        }
        if (!(!getCurrencyIso4217Code(file))) {
            int i7 = values + 39;
            AFKeystoreWrapper = i7 % 128;
            if ((i7 % 2 == 0 ? '4' : '6') == '4') {
                throw null;
            }
            file = (File) getCurrencyIso4217Code(new Object[]{"/data/local/tmp/pre_install.appsflyer"}, 1393711468, -1393711457, (int) System.currentTimeMillis());
        }
        if (!(getCurrencyIso4217Code(file) ? false : true)) {
            file = (File) getCurrencyIso4217Code(new Object[]{"/etc/pre_install.appsflyer"}, 1393711468, -1393711457, (int) System.currentTimeMillis());
        }
        if (getCurrencyIso4217Code(file)) {
            return null;
        }
        String packageName = this.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return (String) getCurrencyIso4217Code(new Object[]{file, packageName}, 2000545293, -2000545286, (int) System.currentTimeMillis());
    }

    private void AFKeystoreWrapper(Map<String, Object> map) {
        TimeUnit timeUnit;
        long j2;
        long seconds;
        Intrinsics.checkNotNullParameter(map, "");
        long mediationNetwork = this.component1.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
        if (!(mediationNetwork > 0)) {
            seconds = -1;
        } else {
            int i2 = AFKeystoreWrapper + 69;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                timeUnit = TimeUnit.MILLISECONDS;
                j2 = jCurrentTimeMillis * mediationNetwork;
            } else {
                timeUnit = TimeUnit.MILLISECONDS;
                j2 = jCurrentTimeMillis - mediationNetwork;
            }
            seconds = timeUnit.toSeconds(j2);
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
        int i3 = values + 5;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
    }

    private static void AFLogger(Map<String, Object> map) {
        int i2 = AFKeystoreWrapper + 7;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            int i4 = AFKeystoreWrapper + 73;
            values = i4 % 128;
            int i5 = i4 % 2;
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
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e4);
        }
    }

    private static void a(int i2, int i3, String str, boolean z, int i4, Object[] objArr) {
        int i5 = $11 + 121;
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = i5 % 2;
        Object charArray = str;
        if (str != null) {
            int i8 = i6 + 49;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr2 = new char[i2];
        aFk1kSDK.getMediationNetwork = 0;
        while (true) {
            int i10 = aFk1kSDK.getMediationNetwork;
            if (i10 >= i2) {
                break;
            }
            int i11 = $11 + 29;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char c2 = cArr[i10];
            aFk1kSDK.getCurrencyIso4217Code = c2;
            char c3 = (char) (c2 + i3);
            cArr2[i10] = c3;
            cArr2[i10] = (char) (c3 - ((int) (((long) AFInAppEventParameterName) ^ (-5894730465753384902L))));
            aFk1kSDK.getMediationNetwork = i10 + 1;
        }
        if ((i4 > 0 ? 'K' : 'Y') == 'K') {
            aFk1kSDK.getRevenue = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            int i13 = aFk1kSDK.getRevenue;
            System.arraycopy(cArr3, 0, cArr2, i2 - i13, i13);
            int i14 = aFk1kSDK.getRevenue;
            System.arraycopy(cArr3, i14, cArr2, 0, i2 - i14);
        }
        if ((z ? '!' : 'V') == '!') {
            char[] cArr4 = new char[i2];
            aFk1kSDK.getMediationNetwork = 0;
            while (true) {
                int i15 = aFk1kSDK.getMediationNetwork;
                if (!(i15 < i2)) {
                    break;
                }
                cArr4[i15] = cArr2[(i2 - i15) - 1];
                aFk1kSDK.getMediationNetwork = i15 + 1;
            }
            cArr2 = cArr4;
        }
        String str2 = new String(cArr2);
        int i16 = $10 + 1;
        $11 = i16 % 128;
        if (i16 % 2 != 0) {
            objArr[0] = str2;
        } else {
            int i17 = 70 / 0;
            objArr[0] = str2;
        }
    }

    private void afInfoLog(Map<String, Object> map) {
        int i2 = values + 41;
        AFKeystoreWrapper = i2 % 128;
        boolean z = i2 % 2 != 0;
        Intrinsics.checkNotNullParameter(map, "");
        if (!z) {
            this.component1.getMonetizationNetwork("is_stop_tracking_used");
            throw null;
        }
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            int i3 = AFKeystoreWrapper + 83;
            values = i3 % 128;
            int i4 = i3 % 2;
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used")));
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) throws NoSuchAlgorithmException {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        AFa1oSDK aFa1oSDK = (AFa1oSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        if (aFa1oSDK.getRevenue()) {
            int i2 = values + 5;
            AFKeystoreWrapper = i2 % 128;
            if (!(i2 % 2 != 0)) {
                String str = aFa1oSDK.component2;
                AFd1tSDK aFd1tSDK = aFg1iSDK.equals;
                aFg1iSDK.getRevenue(aFa1oSDK, str, aFd1tSDK.getCurrencyIso4217Code, aFd1tSDK.getMonetizationNetwork);
                throw null;
            }
            String str2 = aFa1oSDK.component2;
            AFd1tSDK aFd1tSDK2 = aFg1iSDK.equals;
            aFg1iSDK.getRevenue(aFa1oSDK, str2, aFd1tSDK2.getCurrencyIso4217Code, aFd1tSDK2.getMonetizationNetwork);
        } else if (!(aFa1oSDK instanceof AFh1gSDK)) {
            int i3 = AFKeystoreWrapper + 99;
            values = i3 % 128;
            char c2 = i3 % 2 != 0 ? '\n' : '6';
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            if (c2 != '\n') {
                String str3 = aFa1oSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                aFg1iSDK.getMonetizationNetwork(monetizationNetwork, str3);
            } else {
                String str4 = aFa1oSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                aFg1iSDK.getMonetizationNetwork(monetizationNetwork, str4);
                int i4 = 36 / 0;
            }
        }
        if (kotlin.collections.o.b(AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH, AFf1zSDK.INAPP).contains(aFa1oSDK.getCurrencyIso4217Code())) {
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            aFg1iSDK.copy(monetizationNetwork);
        }
        if (aFa1oSDK.areAllFieldsValid()) {
            int i5 = AFKeystoreWrapper + 19;
            values = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            aFg1iSDK.component4(monetizationNetwork);
            if (i6 != 0) {
                throw null;
            }
        }
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        aFg1iSDK.force(monetizationNetwork);
        values(monetizationNetwork);
        aFg1iSDK.AFInAppEventParameterName(monetizationNetwork);
        aFg1iSDK.AFInAppEventType(monetizationNetwork);
        aFg1iSDK.registerClient(monetizationNetwork);
        aFg1iSDK.getRevenue(monetizationNetwork, aFa1oSDK.getRevenue());
        aFg1iSDK.unregisterClient(monetizationNetwork);
        aFg1iSDK.afInfoLog(monetizationNetwork);
        getRevenue(monetizationNetwork, aFa1oSDK);
        monetizationNetwork.put("af_events_api", "1");
        int i7 = AFKeystoreWrapper + 31;
        values = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = values + 21;
        AFKeystoreWrapper = i2 % 128;
        char c2 = i2 % 2 == 0 ? 'Q' : '0';
        Intrinsics.checkNotNullParameter(map, "");
        if (c2 == 'Q') {
            AFb1vSDK.b_(aFg1iSDK.getMonetizationNetwork.getContentResolver());
            throw null;
        }
        AFb1tSDK aFb1tSDKB_ = AFb1vSDK.b_(aFg1iSDK.getMonetizationNetwork.getContentResolver());
        if ((aFb1tSDKB_ != null ? '\\' : 'N') != 'N') {
            int i3 = values + 1;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            map.put("amazon_aid", aFb1tSDKB_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(aFb1tSDKB_.AFAdRevenueData));
        }
        return null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        Map map = (Map) objArr[0];
        String str = (String) objArr[1];
        int i2 = AFKeystoreWrapper + 65;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if ((str != null ? (char) 21 : (char) 31) != 21) {
            return null;
        }
        int i4 = values + 15;
        AFKeystoreWrapper = i4 % 128;
        boolean z = i4 % 2 == 0;
        map.put("phone", str);
        if (z) {
            int i5 = 0 / 0;
        }
        int i6 = AFKeystoreWrapper + 49;
        values = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static long component3() {
        long jCurrentTimeMillis;
        int i2 = AFKeystoreWrapper + 99;
        values = i2 % 128;
        if ((i2 % 2 != 0 ? '\"' : '$') != '$') {
            jCurrentTimeMillis = SystemClock.elapsedRealtime() + System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        }
        int i3 = AFKeystoreWrapper + 7;
        values = i3 % 128;
        int i4 = i3 % 2;
        return jCurrentTimeMillis;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        int i2 = AFKeystoreWrapper + 97;
        values = i2 % 128;
        char c2 = i2 % 2 != 0 ? ':' : 'C';
        boolean z = Boolean.parseBoolean(aFg1iSDK.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
        if (c2 != 'C') {
            int i3 = 31 / 0;
        }
        return Boolean.valueOf(z);
    }

    private void copy(Map<String, Object> map) {
        int i2 = AFKeystoreWrapper + 29;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        int i4 = values + 87;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    private final String copydefault() {
        int i2 = AFKeystoreWrapper + 3;
        values = i2 % 128;
        int i3 = i2 % 2;
        String monetizationNetwork = this.component1.getMonetizationNetwork("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
            if ((string != null ? 'R' : (char) 16) != 16) {
                int i4 = AFKeystoreWrapper + 79;
                values = i4 % 128;
                int i5 = i4 % 2;
                return string;
            }
        } catch (Exception e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2);
        }
        if ((monetizationNetwork != null ? (char) 11 : '(') != 11) {
            return null;
        }
        AFLogger.afDebugLog("use cached AndroidId: " + monetizationNetwork);
        return monetizationNetwork;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    private void d(Map<String, Object> map) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(map, "");
        String strComponent4 = this.component3.component4();
        String str = (String) getCurrencyIso4217Code(new Object[]{this.component1, strComponent4}, -1548056329, 1548056332, (int) System.currentTimeMillis());
        if ((str != null ? (char) 22 : (char) 0) == 22 && !Intrinsics.a(str, strComponent4)) {
            z = true;
        } else {
            int i2 = values + 5;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if (str == null) {
            int i4 = AFKeystoreWrapper + 3;
            values = i4 % 128;
            int i5 = i4 % 2;
            if (strComponent4 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if ((!z ? '[' : 'S') == 'S' || z2) {
            map.put("af_latestchannel", strComponent4);
        }
        String strComponent5 = component4();
        if (strComponent5 != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = strComponent5.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String strEquals = equals();
        if (strEquals != null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = strEquals.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String str2 = (String) getCurrencyIso4217Code(new Object[]{this}, -505986928, 505986930, System.identityHashCode(this));
        if (str2 != null) {
            int i6 = values + 69;
            AFKeystoreWrapper = i6 % 128;
            boolean z3 = i6 % 2 != 0;
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            String lowerCase3 = str2.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
            if (!z3) {
                throw null;
            }
        }
    }

    private void e(Map<String, Object> map) {
        int i2 = values + 7;
        AFKeystoreWrapper = i2 % 128;
        boolean z = i2 % 2 != 0;
        Intrinsics.checkNotNullParameter(map, "");
        if (z) {
            map.put("af_preinstalled", String.valueOf(AFd1qSDK.getMonetizationNetwork(this.getMonetizationNetwork)));
        } else {
            map.put("af_preinstalled", String.valueOf(AFd1qSDK.getMonetizationNetwork(this.getMonetizationNetwork)));
            int i3 = 24 / 0;
        }
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        boolean z = false;
        String str = (String) objArr[0];
        if ((str != null ? (char) 4 : (char) 26) == 26) {
            return null;
        }
        int i2 = AFKeystoreWrapper + 123;
        values = i2 % 128;
        int i3 = i2 % 2;
        try {
            if ((kotlin.text.q.l(str).toString().length() > 0 ? (char) 30 : '#') != '#') {
                int i4 = values + 89;
                AFKeystoreWrapper = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
            if (z) {
                return new File(kotlin.text.q.l(str).toString());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    private void force(Map<String, Object> map) {
        boolean z;
        Intrinsics.checkNotNullParameter(map, "");
        AFg1wSDK aFg1wSDK = this.toString;
        String str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK));
        if ((str != null ? '\b' : '\t') != '\b') {
            z = true;
        } else {
            int i2 = values + 91;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            if ((str.length() == 0 ? (char) 15 : (char) 7) != 7) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            return;
        }
        int i4 = values + 15;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        map.put("appsflyerKey", str);
        int i6 = AFKeystoreWrapper + 5;
        values = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        int i2 = values + 7;
        AFKeystoreWrapper = i2 % 128;
        boolean z = i2 % 2 == 0;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) ((f.g) aFg1iSDK.hashCode).a();
        if (z) {
            int i3 = 88 / 0;
        }
        int i4 = values + 87;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return appsFlyerProperties;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if ((r3 == null) != true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r1.AFAdRevenueData("CACHED_CHANNEL", r6);
        r0 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFg1iSDK.values = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String monetizationNetwork;
        AFd1rSDK aFd1rSDK = (AFd1rSDK) objArr[0];
        String str = (String) objArr[1];
        int i2 = AFKeystoreWrapper + 79;
        values = i2 % 128;
        if (!(i2 % 2 != 0)) {
            monetizationNetwork = aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        } else {
            monetizationNetwork = aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            int i3 = 56 / 0;
        }
    }

    private final AppsFlyerProperties getRevenue() {
        return (AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this));
    }

    private static void hashCode(Map<String, Object> map) {
        int i2 = values + 93;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 5, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 103, "\ufffb\u000b\ufffa\u0007�", false, 5 - TextUtils.indexOf("", "", 0, 0), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i4 = values + 27;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void i(Map<String, Object> map) throws NoSuchAlgorithmException {
        getCurrencyIso4217Code(new Object[]{this, map}, -1748783943, 1748783953, System.identityHashCode(this));
    }

    private void registerClient(Map<String, Object> map) {
        int i2 = values + 37;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(this.copy, this.component1);
            if (!(currencyIso4217Code == null)) {
                map.put("uid", currencyIso4217Code);
                int i4 = AFKeystoreWrapper + 75;
                values = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("ERROR: could not get uid ");
            sb.append(th.getMessage());
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            AFLogger.afErrorLog(string, th);
        }
    }

    private final void toString(Map<String, Object> map) {
        int i2 = AFKeystoreWrapper + 65;
        values = i2 % 128;
        int i3 = i2 % 2;
        if ((!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).isOtherSdkStringDisabled() ? 'F' : 'H') == 'F') {
            map.put("batteryLevel", String.valueOf(this.getMediationNetwork.AFAdRevenueData(this.getMonetizationNetwork).getCurrencyIso4217Code));
        }
        int i4 = values + 11;
        AFKeystoreWrapper = i4 % 128;
        if ((i4 % 2 == 0 ? 'I' : (char) 19) != 'I') {
            return;
        }
        int i5 = 47 / 0;
    }

    private void unregisterClient(Map<String, Object> map) {
        int i2 = values + 115;
        AFKeystoreWrapper = i2 % 128;
        char c2 = i2 % 2 == 0 ? '`' : (char) 23;
        Intrinsics.checkNotNullParameter(map, "");
        if (c2 == '`') {
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + AFg1jSDK.getMonetizationNetwork(this.getMonetizationNetwork));
            throw null;
        }
        boolean monetizationNetwork = AFg1jSDK.getMonetizationNetwork(this.getMonetizationNetwork);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
        if (!monetizationNetwork) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1jSDK.getRevenue(this.component1)));
        int i3 = values + 27;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        int i4 = 48 / 0;
    }

    private void v(Map<String, Object> map) {
        PackageManager.NameNotFoundException nameNotFoundException;
        AFLogger aFLogger;
        AFh1vSDK aFh1vSDK;
        String str;
        int i2 = values + 107;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (i3 == 0) {
            if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, false) ? false : true) {
                return;
            }
        } else if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            return;
        }
        String strAFAdRevenueData = null;
        try {
            this.getMonetizationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            strAFAdRevenueData = this.component3.AFAdRevenueData(this.getMonetizationNetwork);
        } catch (PackageManager.NameNotFoundException e2) {
            nameNotFoundException = e2;
            aFLogger = AFLogger.INSTANCE;
            aFh1vSDK = AFh1vSDK.ATTRIBUTION;
            str = "Exception while collecting facebook's attribution ID. com.facebook.katana not found";
            aFLogger.e(aFh1vSDK, str, nameNotFoundException, false, false, true, false);
        } catch (Throwable th) {
            nameNotFoundException = th;
            aFLogger = AFLogger.INSTANCE;
            aFh1vSDK = AFh1vSDK.ATTRIBUTION;
            str = "Exception while collecting facebook's attribution ID. ";
            aFLogger.e(aFh1vSDK, str, nameNotFoundException, false, false, true, false);
        }
        if ((strAFAdRevenueData != null ? 'D' : 'Q') != 'D') {
            return;
        }
        map.put("fb", strAFAdRevenueData);
        int i4 = AFKeystoreWrapper + 105;
        values = i4 % 128;
        int i5 = i4 % 2;
    }

    private void valueOf(Map<String, Object> map) {
        long j2;
        int i2 = AFKeystoreWrapper + 9;
        values = i2 % 128;
        char c2 = i2 % 2 != 0 ? '0' : 'D';
        Intrinsics.checkNotNullParameter(map, "");
        if (c2 != 'D') {
            j2 = this.component4.equals;
            if ((j2 == 0 ? (char) 21 : 'D') == 21) {
                return;
            }
        } else {
            j2 = this.component4.equals;
            if (j2 == 0) {
                return;
            }
        }
        map.put("prev_session_dur", Long.valueOf(j2));
        int i3 = AFKeystoreWrapper + 99;
        values = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void values(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Object currencyIso4217Code = AFc1rSDK.getCurrencyIso4217Code();
        String monetizationNetwork = AFc1rSDK.getMonetizationNetwork();
        if (currencyIso4217Code != null) {
            int i2 = AFKeystoreWrapper + 77;
            values = i2 % 128;
            if ((i2 % 2 != 0 ? '2' : '7') == '2') {
                throw null;
            }
            if (monetizationNetwork != null) {
                if (!(Integer.parseInt(monetizationNetwork) <= 0)) {
                    int i3 = values + 99;
                    AFKeystoreWrapper = i3 % 128;
                    char c2 = i3 % 2 == 0 ? (char) 20 : '0';
                    map.put("reinstallCounter", monetizationNetwork);
                    map.put("originalAppsflyerId", currencyIso4217Code);
                    if (c2 != '0') {
                        throw null;
                    }
                }
            }
        }
        int i4 = AFKeystoreWrapper + 63;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static PackageInfo w_(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        if ((Build.VERSION.SDK_INT >= 33 ? 'C' : '_') == '_') {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "");
            int i2 = values + 47;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
        int i4 = AFKeystoreWrapper + 5;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return packageInfo2;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final Long AFAdRevenueData() throws PackageManager.NameNotFoundException {
        Context context = this.copy.AFAdRevenueData;
        if (!(context != null)) {
            int i2 = values + 27;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            PackageInfo packageInfoW_ = w_(packageManager, packageName);
            if (packageInfoW_ != null) {
                int i4 = AFKeystoreWrapper + 17;
                values = i4 % 128;
                if (i4 % 2 == 0) {
                    return Long.valueOf(packageInfoW_.firstInstallTime);
                }
                long j2 = packageInfoW_.firstInstallTime;
                throw null;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final long getCurrencyIso4217Code() {
        int i2 = values + 87;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            return System.currentTimeMillis();
        }
        System.currentTimeMillis();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        boolean z;
        String monetizationNetwork;
        boolean z2;
        String referrer;
        char c2;
        int i2;
        int i3;
        boolean z3;
        int i4;
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        boolean z4 = true;
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        int i5 = values + 71;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (i6 != 0) {
            if (str != null) {
                if (str.length() == 0) {
                    z = false;
                }
            }
            if (!z) {
                map.put("referrer", str);
            }
            monetizationNetwork = aFg1iSDK.component1.getMonetizationNetwork("extraReferrers", (String) null);
            if (monetizationNetwork != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i7 = values + 17;
                AFKeystoreWrapper = i7 % 128;
                i4 = i7 % 2;
                map.put("extraReferrers", monetizationNetwork);
                if (i4 == 0) {
                    int i8 = 17 / 0;
                }
            }
            referrer = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1iSDK}, 1273246331, -1273246327, System.identityHashCode(aFg1iSDK))).getReferrer(aFg1iSDK.component1);
            if (referrer != null) {
                c2 = '\'';
            } else {
                c2 = 31;
            }
            if (c2 == '\'') {
                if (referrer.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    z4 = false;
                }
            }
            if (!z4) {
                i2 = AFKeystoreWrapper + 11;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    int i9 = 74 / 0;
                    if (map.get("referrer") == null) {
                        int i10 = values + 75;
                        AFKeystoreWrapper = i10 % 128;
                        i3 = i10 % 2;
                        map.put("referrer", referrer);
                        if (i3 == 0) {
                            throw null;
                        }
                    }
                } else if (map.get("referrer") == null) {
                    int i11 = values + 75;
                    AFKeystoreWrapper = i11 % 128;
                    i3 = i11 % 2;
                    map.put("referrer", referrer);
                    if (i3 == 0) {
                        throw null;
                    }
                }
            }
            return null;
        }
        int i12 = 58 / 0;
        if (str != null) {
            if (str.length() == 0) {
                z = false;
            }
        }
        if (!z) {
            map.put("referrer", str);
        }
        monetizationNetwork = aFg1iSDK.component1.getMonetizationNetwork("extraReferrers", (String) null);
        if (monetizationNetwork != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i13 = values + 17;
            AFKeystoreWrapper = i13 % 128;
            i4 = i13 % 2;
            map.put("extraReferrers", monetizationNetwork);
            if (i4 == 0) {
                int i14 = 17 / 0;
            }
        }
        referrer = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1iSDK}, 1273246331, -1273246327, System.identityHashCode(aFg1iSDK))).getReferrer(aFg1iSDK.component1);
        if (referrer != null) {
            c2 = '\'';
        } else {
            c2 = 31;
        }
        if (c2 == '\'') {
            if (referrer.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                z4 = false;
            }
        }
        if (!z4) {
            i2 = AFKeystoreWrapper + 11;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                int i15 = 74 / 0;
                if (map.get("referrer") == null) {
                    int i16 = values + 75;
                    AFKeystoreWrapper = i16 % 128;
                    i3 = i16 % 2;
                    map.put("referrer", referrer);
                    if (i3 == 0) {
                        throw null;
                    }
                }
            } else if (map.get("referrer") == null) {
                int i17 = values + 75;
                AFKeystoreWrapper = i17 % 128;
                i3 = i17 % 2;
                map.put("referrer", referrer);
                if (i3 == 0) {
                    throw null;
                }
            }
        }
        return null;
        z = true;
        if (!z) {
            map.put("referrer", str);
        }
        monetizationNetwork = aFg1iSDK.component1.getMonetizationNetwork("extraReferrers", (String) null);
        if (monetizationNetwork != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i18 = values + 17;
            AFKeystoreWrapper = i18 % 128;
            i4 = i18 % 2;
            map.put("extraReferrers", monetizationNetwork);
            if (i4 == 0) {
                int i19 = 17 / 0;
            }
        }
        referrer = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1iSDK}, 1273246331, -1273246327, System.identityHashCode(aFg1iSDK))).getReferrer(aFg1iSDK.component1);
        if (referrer != null) {
            c2 = '\'';
        } else {
            c2 = 31;
        }
        if (c2 == '\'') {
            if (referrer.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                z4 = false;
            }
        }
        if (!z4) {
            i2 = AFKeystoreWrapper + 11;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                int i110 = 74 / 0;
                if (map.get("referrer") == null) {
                    int i111 = values + 75;
                    AFKeystoreWrapper = i111 % 128;
                    i3 = i111 % 2;
                    map.put("referrer", referrer);
                    if (i3 == 0) {
                        throw null;
                    }
                }
            } else if (map.get("referrer") == null) {
                int i112 = values + 75;
                AFKeystoreWrapper = i112 % 128;
                i3 = i112 % 2;
                map.put("referrer", referrer);
                if (i3 == 0) {
                    throw null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    private void AFInAppEventType(Map<String, Object> map) {
        boolean z;
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        if ((string != null ? (char) 11 : '!') != 11) {
            z = true;
        } else {
            int i2 = values + 73;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            if (string.length() == 0) {
                z = true;
            } else {
                int i4 = AFKeystoreWrapper + 63;
                values = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
        }
        if (!(z ? false : true)) {
            return;
        }
        int i6 = AFKeystoreWrapper + 105;
        values = i6 % 128;
        int i7 = i6 % 2;
        map.put(AppsFlyerProperties.EXTENSION, string);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0053  */
    private final boolean AFKeystoreWrapper() {
        boolean z;
        int i2 = AFKeystoreWrapper + 73;
        values = i2 % 128;
        int i3 = i2 % 2;
        if ((!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) ? 'B' : '%') != '%') {
            int i4 = values + 125;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if ((!z ? ':' : '8') == ':') {
            AFb1rSDK.getRevenue();
            if (AFb1rSDK.getRevenue(this.getMonetizationNetwork)) {
                int i6 = values + 13;
                AFKeystoreWrapper = i6 % 128;
                if (i6 % 2 != 0) {
                    return false;
                }
                throw null;
            }
        }
        return true;
    }

    private static String areAllFieldsValid() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
        int i2 = AFKeystoreWrapper + 107;
        values = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 25 : (char) 29) == 29) {
            return str;
        }
        throw null;
    }

    private String component1() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -505986928, 505986930, System.identityHashCode(this));
    }

    private void component2(Map<String, ? extends Object> map) {
        boolean z;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1oSDK aFh1oSDK = this.component4;
        HashMap map2 = new HashMap(aFh1oSDK.getMonetizationNetwork);
        aFh1oSDK.getMonetizationNetwork.clear();
        this.component4.AFAdRevenueData.AFAdRevenueData("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (!(map2.isEmpty())) {
            int i2 = AFKeystoreWrapper + 39;
            values = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if ((z ? '5' : (char) 2) != '5') {
            return;
        }
        int i4 = AFKeystoreWrapper + 13;
        values = i4 % 128;
        boolean z2 = i4 % 2 == 0;
        Map<String, Object> currencyIso4217Code = AFb1rSDK.getCurrencyIso4217Code(map);
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        currencyIso4217Code.put("gcd", map2);
        if (z2) {
            return;
        }
        int i5 = 27 / 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.InputStreamReader, java.io.Reader] */
    private static /* synthetic */ Object component3(Object[] objArr) {
        File file = (File) objArr[0];
        ?? inputStreamReader = 1;
        inputStreamReader = 1;
        String str = (String) objArr[1];
        int i2 = values + 69;
        int i3 = i2 % 128;
        AFKeystoreWrapper = i3;
        int i4 = i2 % 2;
        try {
            try {
                if (!(file != null)) {
                    int i5 = i3 + 97;
                    values = i5 % 128;
                    if ((i5 % 2 != 0 ? '4' : (char) 21) != 21) {
                        int i6 = 61 / 0;
                    }
                    return null;
                }
                try {
                    ?? properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th) {
                            AFLogger.afErrorLog(th.getMessage(), th);
                        }
                        return property;
                    } catch (FileNotFoundException unused) {
                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                        if (inputStreamReader != 0) {
                            inputStreamReader.close();
                            inputStreamReader = inputStreamReader;
                        } else {
                            int i7 = AFKeystoreWrapper + 15;
                            values = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != 0) {
                            inputStreamReader.close();
                            inputStreamReader = inputStreamReader;
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = 0;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = 0;
                }
            } catch (Throwable th4) {
                AFLogger.afErrorLog(th4.getMessage(), th4);
            }
        } catch (Throwable th5) {
            if (inputStreamReader != 0) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th6) {
                    AFLogger.afErrorLog(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
        return null;
    }

    private String component4() {
        int i2 = values + 51;
        AFKeystoreWrapper = i2 % 128;
        if (!(i2 % 2 != 0)) {
            this.component1.getMonetizationNetwork("INSTALL_STORE");
            throw null;
        }
        if (this.component1.getMonetizationNetwork("INSTALL_STORE")) {
            return this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
        }
        String str = !component2() ? null : (String) getCurrencyIso4217Code(new Object[]{this}, -505986928, 505986930, System.identityHashCode(this));
        this.component1.AFAdRevenueData("INSTALL_STORE", str);
        int i3 = values + 117;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private boolean copy() {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this}, -156743048, 156743056, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    private final void copydefault(Map<String, Object> map) {
        Object systemService;
        UiModeManager uiModeManager;
        int i2 = AFKeystoreWrapper + 25;
        values = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 11 : 'P') == 'P') {
            systemService = this.getMonetizationNetwork.getSystemService((Class<Object>) UiModeManager.class);
            uiModeManager = (UiModeManager) systemService;
        } else {
            if ((Build.VERSION.SDK_INT >= 125 ? (char) 6 : '\n') != 6) {
                systemService = this.getMonetizationNetwork.getSystemService("uimode");
                if ((systemService instanceof UiModeManager ? 'N' : 'W') != 'N') {
                    uiModeManager = null;
                }
            } else {
                systemService = this.getMonetizationNetwork.getSystemService((Class<Object>) UiModeManager.class);
            }
            uiModeManager = (UiModeManager) systemService;
        }
        if ((uiModeManager != null) && uiModeManager.getCurrentModeType() == 4) {
            int i3 = AFKeystoreWrapper + 79;
            values = i3 % 128;
            if (i3 % 2 == 0) {
                map.put("tv", Boolean.TRUE);
            } else {
                map.put("tv", Boolean.TRUE);
                throw null;
            }
        }
    }

    private String equals() {
        String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString("preInstallName");
        if (string != null) {
            int i2 = AFKeystoreWrapper + 39;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            throw null;
        }
        if (this.component1.getMonetizationNetwork("preInstallName")) {
            int i3 = AFKeystoreWrapper + 13;
            values = i3 % 128;
            if (i3 % 2 != 0) {
                string = this.component1.getMonetizationNetwork("preInstallName", (String) null);
                int i4 = 31 / 0;
            } else {
                string = this.component1.getMonetizationNetwork("preInstallName", (String) null);
            }
        } else {
            if (component2()) {
                int i5 = AFKeystoreWrapper + 19;
                values = i5 % 128;
                if (i5 % 2 != 0) {
                    AFInAppEventType();
                    throw null;
                }
                string = AFInAppEventType();
                if (string == null) {
                    string = getMediationNetwork("AF_PRE_INSTALL_NAME");
                }
            }
            if ((string != null ? 'b' : 'M') != 'M') {
                int i6 = AFKeystoreWrapper + 59;
                values = i6 % 128;
                if (i6 % 2 != 0) {
                    this.component1.AFAdRevenueData("preInstallName", string);
                    throw null;
                }
                this.component1.AFAdRevenueData("preInstallName", string);
            }
        }
        if (string != null) {
            ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).set("preInstallName", string);
        }
        return string;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        int i2 = AFKeystoreWrapper + 33;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1iSDK}, 1273246331, -1273246327, System.identityHashCode(aFg1iSDK))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if ((string == null ? '\r' : '?') == '?') {
                return string;
            }
        } else {
            String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1iSDK}, 1273246331, -1273246327, System.identityHashCode(aFg1iSDK))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i3 = 40 / 0;
            if (string2 != null) {
                return string2;
            }
        }
        int i4 = values + 123;
        AFKeystoreWrapper = i4 % 128;
        boolean z = i4 % 2 == 0;
        String mediationNetwork = aFg1iSDK.getMediationNetwork("AF_STORE");
        if (z) {
            int i5 = 35 / 0;
        }
        return mediationNetwork;
    }

    private static String getMediationNetwork(AFd1rSDK aFd1rSDK, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{aFd1rSDK, str}, -1548056329, 1548056332, (int) System.currentTimeMillis());
    }

    private String getMonetizationNetwork() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, 76539304, -76539295, System.identityHashCode(this));
    }

    private static File getRevenue(String str) {
        return (File) getCurrencyIso4217Code(new Object[]{str}, 1393711468, -1393711457, (int) System.currentTimeMillis());
    }

    private static String AFAdRevenueData(String str) {
        int i2 = values + 103;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.c(objInvoke, "");
            String str2 = (String) objInvoke;
            int i4 = values + 67;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b A[PHI: r0
      0x004b: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v12 java.lang.String) binds: [B:18:0x0049, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    private final void areAllFieldsValid(Map<String, Object> map) {
        String str;
        int i2 = AFKeystoreWrapper + 93;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            AFd1vSDK.AFa1zSDK aFa1zSDKAFAdRevenueData = this.getMediationNetwork.AFAdRevenueData(this.getMonetizationNetwork);
            float f2 = aFa1zSDKAFAdRevenueData.getCurrencyIso4217Code;
            str = aFa1zSDKAFAdRevenueData.AFAdRevenueData;
            map.put("btl", String.valueOf(f2));
            if (!(str == null)) {
                map.put("btch", str);
            }
        } else {
            AFd1vSDK.AFa1zSDK aFa1zSDKAFAdRevenueData2 = this.getMediationNetwork.AFAdRevenueData(this.getMonetizationNetwork);
            float f3 = aFa1zSDKAFAdRevenueData2.getCurrencyIso4217Code;
            str = aFa1zSDKAFAdRevenueData2.AFAdRevenueData;
            map.put("btl", String.valueOf(f3));
            int i3 = 80 / 0;
            if (!(str == null)) {
                map.put("btch", str);
            }
        }
        int i4 = values + 5;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void component1(Map<String, Object> map) throws NoSuchAlgorithmException {
        getCurrencyIso4217Code(new Object[]{this, map}, -1208384822, 1208384822, System.identityHashCode(this));
    }

    private boolean component2() {
        int i2 = values + 51;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        if ((this.component3.getRevenue.getMediationNetwork("appsFlyerCount", 0) <= 1 ? 'a' : (char) 30) != 'a') {
            int i4 = values + 85;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = values + 27;
        AFKeystoreWrapper = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private void component3(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            int i2 = values + 47;
            AFKeystoreWrapper = i2 % 128;
            boolean z = i2 % 2 != 0;
            map.put("onelink_id", string);
            if (!z) {
                throw null;
            }
        }
        if (!(string2 == null)) {
            map.put("onelink_ver", string2);
            int i3 = values + 9;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private void component4(Map<String, Object> map) {
        int i2 = AFKeystoreWrapper + 63;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFg1wSDK.AFAdRevenueData(map, this.component3);
        int i4 = values + 79;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void equals(Map<String, Object> map) {
        int i2 = values + 101;
        AFKeystoreWrapper = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 15 : '*') != 15) {
            if (!(AFh1zSDK.getRevenue(this.getMonetizationNetwork))) {
                return;
            }
        } else {
            int i3 = 82 / 0;
            if (AFh1zSDK.getRevenue(this.getMonetizationNetwork) ? false : true) {
                return;
            }
        }
        map.put("inst_app", Boolean.TRUE);
        int i4 = values + 101;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    public static Object getCurrencyIso4217Code(Object[] objArr, int i2, int i3, int i4) throws NoSuchAlgorithmException {
        int i5 = ~i2;
        int i6 = ((i3 | i5) * (-1434)) + (i3 * 1435) + (i2 * (-716));
        int i7 = ~i4;
        int i8 = ~(i7 | i3);
        int i9 = ~(i2 | i3);
        int i10 = i5 | (~i3);
        switch (((i9 | (~(i10 | i7)) | (~(i3 | i4))) * 717) + ((i8 | i9 | (~(i10 | i4))) * 717) + i6) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getCurrencyIso4217Code(objArr);
            case 3:
                return getMonetizationNetwork(objArr);
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                return getMediationNetwork(objArr);
            case 5:
                return areAllFieldsValid(objArr);
            case 6:
                return component2(objArr);
            case 7:
                return component3(objArr);
            case 8:
                return component4(objArr);
            case 9:
                AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
                int i11 = values + 7;
                AFKeystoreWrapper = i11 % 128;
                int i12 = i11 % 2;
                String strE_ = AFb1qSDK.e_(aFg1iSDK.getMonetizationNetwork.getApplicationContext().getPackageManager(), aFg1iSDK.getMonetizationNetwork.getApplicationContext().getPackageName());
                int i13 = AFKeystoreWrapper + 51;
                values = i13 % 128;
                int i14 = i13 % 2;
                return strE_;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return component1(objArr);
            case RequestError.STOP_TRACKING /* 11 */:
                return equals(objArr);
            case 12:
                AFg1iSDK aFg1iSDK2 = (AFg1iSDK) objArr[0];
                AFa1oSDK aFa1oSDK = (AFa1oSDK) objArr[1];
                int i15 = values + 43;
                AFKeystoreWrapper = i15 % 128;
                int i16 = i15 % 2;
                Intrinsics.checkNotNullParameter(aFa1oSDK, "");
                Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                aFg1iSDK2.getMonetizationNetwork(monetizationNetwork, aFa1oSDK.getRevenue());
                hashCode(monetizationNetwork);
                AFLogger(monetizationNetwork);
                aFg1iSDK2.getCurrencyIso4217Code(monetizationNetwork);
                aFg1iSDK2.AFAdRevenueData(monetizationNetwork, aFg1iSDK2.equals.getRevenue);
                getCurrencyIso4217Code(new Object[]{aFg1iSDK2, monetizationNetwork}, -1748783943, 1748783953, System.identityHashCode(aFg1iSDK2));
                monetizationNetwork.put("cell", d0.d(new Pair("mcc", Integer.valueOf(aFg1iSDK2.getMonetizationNetwork.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(aFg1iSDK2.getMonetizationNetwork.getResources().getConfiguration().mnc))));
                monetizationNetwork.put("sig", (String) getCurrencyIso4217Code(new Object[]{aFg1iSDK2}, 76539304, -76539295, System.identityHashCode(aFg1iSDK2)));
                monetizationNetwork.put("last_boot_time", Long.valueOf(component3()));
                monetizationNetwork.put("disk", areAllFieldsValid());
                int i17 = AFKeystoreWrapper + 87;
                values = i17 % 128;
                int i18 = i17 % 2;
                return null;
            default:
                return getRevenue(objArr);
        }
    }

    private final String getMediationNetwork(String str) {
        String revenue;
        int i2 = values + 25;
        AFKeystoreWrapper = i2 % 128;
        if (!(i2 % 2 == 0)) {
            revenue = this.component3.getRevenue(str);
        } else {
            revenue = this.component3.getRevenue(str);
            int i3 = 50 / 0;
        }
        int i4 = AFKeystoreWrapper + 79;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = AFKeystoreWrapper + 111;
        values = i2 % 128;
        int i3 = i2 % 2;
        try {
            PackageInfo packageInfo = aFg1iSDK.getMonetizationNetwork.getPackageManager().getPackageInfo(aFg1iSDK.getMonetizationNetwork.getPackageName(), 0);
            int mediationNetwork = aFg1iSDK.component1.getMediationNetwork("versionCode", 0);
            int i4 = packageInfo.versionCode;
            if (i4 > mediationNetwork) {
                int i5 = values + 93;
                AFKeystoreWrapper = i5 % 128;
                int i6 = i5 % 2;
                aFg1iSDK.component1.AFAdRevenueData("versionCode", i4);
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            Context context = aFg1iSDK.component3.getMonetizationNetwork.AFAdRevenueData;
            map.put("app_version_name", AFb1qSDK.getMediationNetwork(context, context.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(aFg1iSDK.component3.getMonetizationNetwork.AFAdRevenueData.getApplicationInfo().targetSdkVersion));
            long j2 = packageInfo.firstInstallTime;
            long j3 = packageInfo.lastUpdateTime;
            map.put("date1", aFg1iSDK.getMediationNetwork().format(new Date(j2)));
            map.put("date2", aFg1iSDK.getMediationNetwork().format(new Date(j3)));
            Object[] objArr2 = new Object[1];
            a(View.getDefaultSize(0, 0) + 15, 102 - ((Process.getThreadPriority(0) + 20) >> 6), "￦\ufffb\u000f\b�\u0002\uffde\ufffb\u000e\uffff\u0000\u0003\f\r\u000e", false, 10 - (Process.myTid() >> 22), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            SimpleDateFormat mediationNetwork2 = aFg1iSDK.getMediationNetwork();
            Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
            map.put(strIntern, aFg1iSDK.getCurrencyIso4217Code(mediationNetwork2));
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMonetizationNetwork(AFa1oSDK aFa1oSDK) throws NoSuchAlgorithmException {
        getCurrencyIso4217Code(new Object[]{this, aFa1oSDK}, -1645166160, 1645166165, System.identityHashCode(this));
    }

    private final SimpleDateFormat getMediationNetwork() {
        int i2 = values + 21;
        AFKeystoreWrapper = i2 % 128;
        if ((i2 % 2 == 0 ? '3' : 'G') == '3') {
            throw null;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) ((f.g) this.AFInAppEventType).a();
        int i3 = values + 9;
        AFKeystoreWrapper = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 28 : 'G') != 28) {
            return simpleDateFormat;
        }
        int i4 = 20 / 0;
        return simpleDateFormat;
    }

    private static String getRevenue(File file, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{file, str}, 2000545293, -2000545286, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void AFAdRevenueData(AFa1oSDK aFa1oSDK) {
        AFe1nSDK aFe1nSDK;
        int i2 = AFKeystoreWrapper + 85;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        boolean zA = false;
        if ((!this.component3.component1() ? '\t' : 'M') != 'M') {
            Map<String, Object> currencyIso4217Code = AFb1rSDK.getCurrencyIso4217Code(aFa1oSDK.getMonetizationNetwork());
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            currencyIso4217Code.put("ad_ids_disabled", Boolean.TRUE);
        } else {
            AFh1pSDK aFh1pSDK = this.component3.AFAdRevenueData.component4;
            boolean z = true;
            if (!(aFh1pSDK != null)) {
                int i4 = values + 9;
                AFKeystoreWrapper = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            String str = aFh1pSDK.component3;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (!z) {
                aFa1oSDK.getCurrencyIso4217Code("gaidError", aFh1pSDK.component3);
                int i6 = AFKeystoreWrapper + 103;
                values = i6 % 128;
                int i7 = i6 % 2;
            }
            String str2 = aFh1pSDK.getMonetizationNetwork;
            if (str2 != null && aFh1pSDK.getCurrencyIso4217Code != null) {
                aFa1oSDK.getCurrencyIso4217Code("advertiserId", str2);
                aFa1oSDK.getCurrencyIso4217Code("advertiserIdEnabled", String.valueOf(aFh1pSDK.getCurrencyIso4217Code));
                aFa1oSDK.getCurrencyIso4217Code("isGaidWithGps", String.valueOf(aFh1pSDK.getRevenue));
                int i8 = values + 31;
                AFKeystoreWrapper = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        AFh1pSDK aFh1pSDK2 = this.component3.AFAdRevenueData.component4;
        if (aFh1pSDK2 != null) {
            int i10 = values + 49;
            AFKeystoreWrapper = i10 % 128;
            int i11 = i10 % 2;
            Boolean bool = aFh1pSDK2.areAllFieldsValid;
            if (i11 == 0) {
                int i12 = 96 / 0;
                zA = Intrinsics.a(bool, Boolean.TRUE);
            } else {
                zA = Intrinsics.a(bool, Boolean.TRUE);
            }
        }
        aFa1oSDK.getCurrencyIso4217Code("GAID_retry", String.valueOf(zA));
        if (!kotlin.collections.o.b(AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH).contains(aFa1oSDK.getCurrencyIso4217Code()) || (aFe1nSDK = this.equals.component3) == null) {
            return;
        }
        Map<String, Object> currencyIso4217Code2 = AFb1rSDK.getCurrencyIso4217Code(aFa1oSDK.getMonetizationNetwork());
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code2, "");
        currencyIso4217Code2.put("fetchAdIdLatency", Long.valueOf(aFe1nSDK.getRevenue));
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMonetizationNetwork(Map<String, Object> map) throws NoSuchAlgorithmException {
        int i2 = values + 81;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        getRevenue(map);
        getCurrencyIso4217Code(new Object[]{this, map}, -1208384822, 1208384822, System.identityHashCode(this));
        d(map);
        e(map);
        v(map);
        int i4 = AFKeystoreWrapper + 79;
        values = i4 % 128;
        int i5 = i4 % 2;
    }

    private void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i2 = values + 91;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String monetizationNetwork = this.component1.getMonetizationNetwork("prev_event_name", (String) null);
            if (monetizationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.component1.getMediationNetwork("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", monetizationNetwork);
                map.put("prev_event", jSONObject);
            }
            this.component1.AFAdRevenueData("prev_event_name", str);
            this.component1.getMonetizationNetwork("prev_event_timestamp", System.currentTimeMillis());
            int i4 = values + 33;
            AFKeystoreWrapper = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            int i5 = 16 / 0;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Error while processing previous event.", e2);
        }
    }

    private void getRevenue(AFa1oSDK aFa1oSDK, String str, String str2, AFc1aSDK aFc1aSDK) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        if (aFa1oSDK.getCurrencyIso4217Code() == AFf1zSDK.CONVERSION) {
            int i2 = AFKeystoreWrapper + 53;
            values = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            toString(monetizationNetwork);
            copydefault(monetizationNetwork);
            equals(monetizationNetwork);
            if (i3 != 0) {
                AFc1rSDK.getMonetizationNetwork(this.copy, this.component1);
                int i4 = 72 / 0;
            } else {
                AFc1rSDK.getMonetizationNetwork(this.copy, this.component1);
            }
        }
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        AFKeystoreWrapper(monetizationNetwork);
        component3(monetizationNetwork);
        component2((Map<String, ? extends Object>) monetizationNetwork);
        getCurrencyIso4217Code(new Object[]{monetizationNetwork, str2}, -830168679, 830168685, (int) System.currentTimeMillis());
        getCurrencyIso4217Code(new Object[]{this, monetizationNetwork, str}, 86217130, -86217129, System.identityHashCode(this));
        valueOf(monetizationNetwork);
        if (aFc1aSDK == null) {
            int i5 = AFKeystoreWrapper + 97;
            values = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i6 = values + 75;
        AFKeystoreWrapper = i6 % 128;
        char c2 = i6 % 2 == 0 ? 'L' : '\"';
        aFc1aSDK.getRevenue(monetizationNetwork);
        if (c2 == 'L') {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFg1kSDK
    public final void AFAdRevenueData(Map<String, Object> map) {
        Object objC;
        Throwable thA;
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.equals.AFAdRevenueData;
        if (str != null) {
            int i2 = AFKeystoreWrapper + 61;
            values = i2 % 128;
            if (!(i2 % 2 == 0)) {
                int i3 = 85 / 0;
                if ((map.get("af_deeplink") != null ? (char) 18 : 'F') != 18) {
                    f.d dVar = f.f.f121a;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    objC = Unit.f157a;
                    thA = f.f.a(objC);
                    if (thA != null) {
                        AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thA, false, false, false, false, 120, null);
                    }
                    int i4 = values + 117;
                    AFKeystoreWrapper = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                }
            } else if (map.get("af_deeplink") != null) {
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    f.d dVar2 = f.f.f121a;
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject2.put("isPush", "true");
                    map.put("af_deeplink", jSONObject2.toString());
                    objC = Unit.f157a;
                } catch (Throwable th) {
                    f.d dVar3 = f.f.f121a;
                    objC = a.c.c(th);
                }
                thA = f.f.a(objC);
                if (thA != null) {
                    AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thA, false, false, false, false, 120, null);
                }
                int i6 = values + 117;
                AFKeystoreWrapper = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        this.equals.AFAdRevenueData = null;
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMediationNetwork(AFa1oSDK aFa1oSDK) throws NoSuchAlgorithmException {
        getCurrencyIso4217Code(new Object[]{this, aFa1oSDK}, 1541874918, -1541874906, System.identityHashCode(this));
    }

    private void AFAdRevenueData(Map<String, Object> map, String str) {
        boolean z;
        int i2 = AFKeystoreWrapper + 91;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i4 = AFKeystoreWrapper + 29;
            values = i4 % 128;
            int i5 = i4 % 2;
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            if (i5 != 0) {
                int i6 = 7 / 0;
                return;
            }
            return;
        }
        String revenue = this.toString.getRevenue(this.component1);
        if (revenue == null || revenue.length() == 0) {
            int i7 = AFKeystoreWrapper + 93;
            values = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(z)) {
            map.put("imei", revenue);
        }
        String currencyIso4217Code = getCurrencyIso4217Code(str);
        if (currencyIso4217Code != null) {
            int i9 = values + 5;
            AFKeystoreWrapper = i9 % 128;
            int i10 = i9 % 2;
            this.component1.AFAdRevenueData("androidIdCached", currencyIso4217Code);
            map.put("android_id", currencyIso4217Code);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
            int i11 = AFKeystoreWrapper + 31;
            values = i11 % 128;
            int i12 = i11 % 2;
        }
        AFb1tSDK currencyIso4217Code2 = AFb1vSDK.getCurrencyIso4217Code(this.getMonetizationNetwork);
        if (currencyIso4217Code2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = currencyIso4217Code2.getMediationNetwork;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str2 = currencyIso4217Code2.getRevenue;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            linkedHashMap.put("val", str2);
            Boolean bool2 = currencyIso4217Code2.AFAdRevenueData;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    private void getMonetizationNetwork(Map<String, Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", AFAdRevenueData("ro.product.cpu.abi"));
        map2.put("cpu_abi2", AFAdRevenueData("ro.product.cpu.abi2"));
        map2.put("arch", AFAdRevenueData("os.arch"));
        map2.put("build_display_id", AFAdRevenueData("ro.build.display.id"));
        if (z) {
            int i2 = AFKeystoreWrapper + 103;
            values = i2 % 128;
            int i3 = i2 % 2;
            areAllFieldsValid(map2);
            if (i3 == 0) {
                if (!(this.component3.getRevenue.getMediationNetwork("appsFlyerCount", 0) > 2)) {
                    map2.putAll(this.getCurrencyIso4217Code.getCurrencyIso4217Code());
                    int i4 = values + 103;
                    AFKeystoreWrapper = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else if (this.component3.getRevenue.getMediationNetwork("appsFlyerCount", 0) <= 3) {
                map2.putAll(this.getCurrencyIso4217Code.getCurrencyIso4217Code());
                int i6 = values + 103;
                AFKeystoreWrapper = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        map2.put("dim", this.areAllFieldsValid.getCurrencyIso4217Code(this.getMonetizationNetwork));
        map.put("deviceData", map2);
    }

    private final void getRevenue(Map<String, Object> map) {
        try {
            long j2 = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j2)));
            int i2 = AFKeystoreWrapper + 27;
            values = i2 % 128;
            if (!(i2 % 2 == 0)) {
                throw null;
            }
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e2);
        }
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMediationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Object string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_ID);
        if ((string != null ? '<' : 'I') != 'I') {
            int i2 = AFKeystoreWrapper + 21;
            values = i2 % 128;
            int i3 = i2 % 2;
            map.put(AppsFlyerProperties.APP_ID, string);
            int i4 = values + 41;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
        }
        String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            int i6 = values + 71;
            AFKeystoreWrapper = i6 % 128;
            int i7 = i6 % 2;
            if (string2.length() != 3) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                String string3 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                AFLogger.afWarnLog(string3);
            }
            map.put("currency", string2);
        }
        Object string4 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            map.put("isUpdate", string4);
        }
        Object string5 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            map.put("customData", string5);
        }
        Object string6 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            map.put("appUserId", string6);
            int i8 = values + 79;
            AFKeystoreWrapper = i8 % 128;
            int i9 = i8 % 2;
        }
        Object string7 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            map.put("user_emails", string7);
        }
        AFc1cSDK aFc1cSDK = this.equals.getMediationNetwork;
        if (aFc1cSDK != null) {
            Object obj = aFc1cSDK.getCurrencyIso4217Code;
            if ((obj != null ? '\'' : (char) 25) != '\'') {
                return;
            }
            int i10 = values + 75;
            AFKeystoreWrapper = i10 % 128;
            int i11 = i10 % 2;
            map.put("sharing_filter", obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    private final String getCurrencyIso4217Code(String str) {
        int i2;
        boolean z;
        if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            int i3 = values + 115;
            int i4 = i3 % 128;
            AFKeystoreWrapper = i4;
            int i5 = i3 % 2;
            if (str != null) {
                int i6 = i4 + 123;
                values = i6 % 128;
                int i7 = i6 % 2;
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                if ((AFKeystoreWrapper() ? ':' : '5') == ':') {
                    int i8 = values + 123;
                    AFKeystoreWrapper = i8 % 128;
                    if (i8 % 2 == 0) {
                        copydefault();
                        throw null;
                    }
                    str = copydefault();
                    i2 = values + 115;
                    AFKeystoreWrapper = i2 % 128;
                    int i9 = i2 % 2;
                    return str;
                }
                return null;
            }
        }
        if (str != null) {
            i2 = AFKeystoreWrapper + 107;
            values = i2 % 128;
            int i10 = i2 % 2;
            return str;
        }
        return null;
    }

    private static void getRevenue(Map<String, Object> map, AFa1oSDK aFa1oSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        String str = aFa1oSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFa1oSDK.getCurrencyIso4217Code;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    private String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat) {
        int i2 = AFKeystoreWrapper + 75;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
        if (monetizationNetwork == null) {
            int i4 = values + 79;
            AFKeystoreWrapper = i4 % 128;
            if (!(i4 % 2 != 0)) {
                int i5 = 74 / 0;
                if (component2()) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    monetizationNetwork = simpleDateFormat.format(new Date());
                } else {
                    int i6 = AFKeystoreWrapper + 37;
                    values = i6 % 128;
                    int i7 = i6 % 2;
                    monetizationNetwork = "";
                }
            } else if (component2()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                monetizationNetwork = simpleDateFormat.format(new Date());
            } else {
                int i8 = AFKeystoreWrapper + 37;
                values = i8 % 128;
                int i9 = i8 % 2;
                monetizationNetwork = "";
            }
            this.component1.AFAdRevenueData("appsFlyerFirstInstall", monetizationNetwork);
            int i10 = values + 77;
            AFKeystoreWrapper = i10 % 128;
            int i11 = i10 % 2;
        }
        AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.GENERAL, "AppsFlyer: first launch date: " + monetizationNetwork, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        return monetizationNetwork;
    }

    private static void getRevenue(Map<String, Object> map, String str) throws NoSuchAlgorithmException {
        getCurrencyIso4217Code(new Object[]{map, str}, -830168679, 830168685, (int) System.currentTimeMillis());
    }

    private void getRevenue(Map<String, Object> map, boolean z) {
        int i2 = AFKeystoreWrapper + 103;
        values = i2 % 128;
        char c2 = i2 % 2 != 0 ? 'K' : (char) 16;
        Intrinsics.checkNotNullParameter(map, "");
        if (c2 != 'K') {
            map.put("platformextension", this.getRevenue);
            if ((z ? 'H' : (char) 23) == 23) {
                return;
            }
        } else {
            map.put("platformextension", this.getRevenue);
            int i3 = 35 / 0;
            if ((z ? ':' : '#') != ':') {
                return;
            }
        }
        int i4 = AFKeystoreWrapper + 59;
        values = i4 % 128;
        if ((i4 % 2 != 0 ? 'E' : '(') == '(') {
            map.put("platform_extension_v2", this.AFAdRevenueData.getMediationNetwork());
        } else {
            map.put("platform_extension_v2", this.AFAdRevenueData.getMediationNetwork());
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        boolean z;
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        monetizationNetwork.put("open_referrer", aFa1oSDK.AFAdRevenueData);
        String str = aFa1oSDK.component3;
        if (str != null) {
            int i2 = values + 25;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            if ((kotlin.text.o.b(str) ? (char) 0 : 'G') != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        if (!(z)) {
            int i4 = values + 109;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            monetizationNetwork.put("af_web_referrer", aFa1oSDK.component3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        AFi1pSDK monetizationNetwork;
        boolean z;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1rSDK aFi1rSDK = this.component2.getMediationNetwork;
        if (!(aFi1rSDK != null)) {
            monetizationNetwork = null;
        } else {
            int i2 = values + 115;
            AFKeystoreWrapper = i2 % 128;
            char c2 = i2 % 2 == 0 ? 'Z' : (char) 31;
            monetizationNetwork = aFi1rSDK.getMonetizationNetwork();
            if (c2 != 31) {
                int i3 = 62 / 0;
            }
        }
        if (monetizationNetwork == null) {
            int i4 = values + 25;
            AFKeystoreWrapper = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 98 / 0;
                return;
            }
            return;
        }
        int i6 = values + 105;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            map.put("network", monetizationNetwork.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(monetizationNetwork.getMediationNetwork()));
            if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            map.put("network", monetizationNetwork.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(monetizationNetwork.getMediationNetwork()));
            if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            String str = monetizationNetwork.getCurrencyIso4217Code;
            if (str != null) {
                map.put("operator", str);
            } else {
                int i7 = AFKeystoreWrapper + 97;
                values = i7 % 128;
                int i8 = i7 % 2;
            }
            String str2 = monetizationNetwork.getMediationNetwork;
            if (str2 != null) {
                map.put("carrier", str2);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, int i2, int i3) {
        int i4 = values + 7;
        AFKeystoreWrapper = i4 % 128;
        char c2 = i4 % 2 == 0 ? '_' : 'S';
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i2));
        map.put("iaecounter", String.valueOf(i3));
        if (c2 != 'S') {
            copy();
            throw null;
        }
        map.put("isFirstCall", String.valueOf((!copy() ? '+' : '9') == '+'));
        int i5 = values + 17;
        AFKeystoreWrapper = i5 % 128;
        if ((i5 % 2 == 0 ? 'G' : (char) 4) != 4) {
            throw null;
        }
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, String str) throws NoSuchAlgorithmException {
        getCurrencyIso4217Code(new Object[]{this, map, str}, 86217130, -86217129, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[RETURN] */
    private static boolean getCurrencyIso4217Code(File file) {
        char c2;
        int i2 = AFKeystoreWrapper + 87;
        values = i2 % 128;
        if ((i2 % 2 != 0 ? '\\' : 'U') != 'U') {
            int i3 = 92 / 0;
            if ((file != null ? ',' : (char) 30) == ',') {
                if (file.exists()) {
                    c2 = '^';
                } else {
                    c2 = '%';
                }
                if (c2 == '^') {
                    return false;
                }
            }
        } else if (file != null) {
            if (file.exists()) {
                c2 = '%';
            } else {
                c2 = '^';
            }
            if (c2 == '^') {
                return false;
            }
        }
        int i4 = values + 81;
        AFKeystoreWrapper = i4 % 128;
        if ((i4 % 2 == 0 ? '8' : (char) 31) == 31) {
            return true;
        }
        throw null;
    }
}
