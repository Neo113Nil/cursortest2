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
import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import androidx.compose.material3.MenuKt;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1vSDK;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFg1iSDK implements AFg1kSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 2115549242;
    private static int AFKeystoreWrapper = 1;
    private static int values;
    private final AFi1oSDK AFAdRevenueData;
    private final Lazy AFInAppEventType;
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
    private final Lazy hashCode;
    private final AFg1wSDK toString;

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * (-716)) + (i2 * 1435) + ((i2 | i4) * (-1434));
        int i6 = ~i3;
        int i7 = ~(i6 | i2);
        int i8 = ~(i | i2);
        int i9 = i4 | (~i2);
        switch (i5 + ((i7 | i8 | (~(i9 | i3))) * 717) + ((i8 | (~(i9 | i6)) | (~(i2 | i3))) * 717)) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getCurrencyIso4217Code(objArr);
            case 3:
                return getMonetizationNetwork(objArr);
            case 4:
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
                int i10 = 2 % 2;
                int i11 = values + 7;
                AFKeystoreWrapper = i11 % 128;
                int i12 = i11 % 2;
                String e_ = AFb1qSDK.e_(aFg1iSDK.getMonetizationNetwork.getApplicationContext().getPackageManager(), aFg1iSDK.getMonetizationNetwork.getApplicationContext().getPackageName());
                int i13 = AFKeystoreWrapper + 51;
                values = i13 % 128;
                int i14 = i13 % 2;
                return e_;
            case 10:
                return component1(objArr);
            case 11:
                return equals(objArr);
            case 12:
                AFg1iSDK aFg1iSDK2 = (AFg1iSDK) objArr[0];
                AFa1oSDK aFa1oSDK = (AFa1oSDK) objArr[1];
                int i15 = 2 % 2;
                int i16 = values + 43;
                AFKeystoreWrapper = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(aFa1oSDK, "");
                Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                aFg1iSDK2.getMonetizationNetwork(monetizationNetwork, aFa1oSDK.getRevenue());
                hashCode(monetizationNetwork);
                AFLogger(monetizationNetwork);
                aFg1iSDK2.getCurrencyIso4217Code(monetizationNetwork);
                aFg1iSDK2.AFAdRevenueData(monetizationNetwork, aFg1iSDK2.equals.getRevenue);
                getCurrencyIso4217Code(new Object[]{aFg1iSDK2, monetizationNetwork}, -1748783943, 1748783953, System.identityHashCode(aFg1iSDK2));
                monetizationNetwork.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(aFg1iSDK2.getMonetizationNetwork.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(aFg1iSDK2.getMonetizationNetwork.getResources().getConfiguration().mnc))));
                monetizationNetwork.put("sig", (String) getCurrencyIso4217Code(new Object[]{aFg1iSDK2}, 76539304, -76539295, System.identityHashCode(aFg1iSDK2)));
                monetizationNetwork.put("last_boot_time", Long.valueOf(component3()));
                monetizationNetwork.put("disk", areAllFieldsValid());
                int i18 = AFKeystoreWrapper + 87;
                values = i18 % 128;
                int i19 = i18 % 2;
                return null;
            default:
                return getRevenue(objArr);
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
        this.hashCode = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1iSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFInAppEventType = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1iSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        int i = 2 % 2;
        int i2 = values + 7;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1iSDK.hashCode.getValue();
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = values + 87;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
        return appsFlyerProperties;
    }

    private final SimpleDateFormat getMediationNetwork() {
        int i = 2 % 2;
        int i2 = values + 21;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFInAppEventType.getValue();
        int i3 = values + 9;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
        return simpleDateFormat;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        AFa1oSDK aFa1oSDK = (AFa1oSDK) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        Object obj = null;
        if (aFa1oSDK.getRevenue()) {
            int i2 = values + 5;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 == 0) {
                aFg1iSDK.getRevenue(aFa1oSDK, aFa1oSDK.component2, aFg1iSDK.equals.getCurrencyIso4217Code, aFg1iSDK.equals.getMonetizationNetwork);
                throw null;
            }
            aFg1iSDK.getRevenue(aFa1oSDK, aFa1oSDK.component2, aFg1iSDK.equals.getCurrencyIso4217Code, aFg1iSDK.equals.getMonetizationNetwork);
        } else if (!(aFa1oSDK instanceof AFh1gSDK)) {
            int i3 = AFKeystoreWrapper + 99;
            values = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                String str = aFa1oSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str, "");
                aFg1iSDK.getMonetizationNetwork(monetizationNetwork, str);
                int i4 = 36 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                String str2 = aFa1oSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                aFg1iSDK.getMonetizationNetwork(monetizationNetwork, str2);
            }
        }
        if (CollectionsKt.listOf((Object[]) new AFf1zSDK[]{AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH, AFf1zSDK.INAPP}).contains(aFa1oSDK.getCurrencyIso4217Code())) {
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            aFg1iSDK.copy(monetizationNetwork);
        }
        if (aFa1oSDK.areAllFieldsValid()) {
            int i5 = AFKeystoreWrapper + 19;
            values = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                aFg1iSDK.component4(monetizationNetwork);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            aFg1iSDK.component4(monetizationNetwork);
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
        monetizationNetwork.put("af_events_api", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        int i6 = AFKeystoreWrapper + 31;
        values = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static void a(int i, int i2, String str, boolean z, int i3, Object[] objArr) {
        int i4 = 2 % 2;
        int i5 = $11 + 121;
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = i5 % 2;
        char[] cArr = str;
        if (str != null) {
            int i8 = i6 + 49;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr3 = new char[i];
        aFk1kSDK.getMediationNetwork = 0;
        while (aFk1kSDK.getMediationNetwork < i) {
            int i10 = $11 + 29;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            aFk1kSDK.getCurrencyIso4217Code = cArr2[aFk1kSDK.getMediationNetwork];
            cArr3[aFk1kSDK.getMediationNetwork] = (char) (aFk1kSDK.getCurrencyIso4217Code + i2);
            int i12 = aFk1kSDK.getMediationNetwork;
            cArr3[i12] = (char) (cArr3[i12] - ((int) (AFInAppEventParameterName ^ (-5894730465753384902L))));
            aFk1kSDK.getMediationNetwork++;
        }
        if (i3 > 0) {
            aFk1kSDK.getRevenue = i3;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - aFk1kSDK.getRevenue, aFk1kSDK.getRevenue);
            System.arraycopy(cArr4, aFk1kSDK.getRevenue, cArr3, 0, i - aFk1kSDK.getRevenue);
        }
        if (z) {
            char[] cArr5 = new char[i];
            aFk1kSDK.getMediationNetwork = 0;
            while (aFk1kSDK.getMediationNetwork < i) {
                cArr5[aFk1kSDK.getMediationNetwork] = cArr3[(i - aFk1kSDK.getMediationNetwork) - 1];
                aFk1kSDK.getMediationNetwork++;
            }
            cArr3 = cArr5;
        }
        String str2 = new String(cArr3);
        int i13 = $10 + 1;
        $11 = i13 % 128;
        if (i13 % 2 != 0) {
            objArr[0] = str2;
        } else {
            int i14 = 70 / 0;
            objArr[0] = str2;
        }
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMonetizationNetwork(Map<String, Object> map) {
        int i = 2 % 2;
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

    private final void getRevenue(Map<String, Object> map) {
        int i = 2 % 2;
        try {
            long j = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j)));
            int i2 = AFKeystoreWrapper + 27;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e);
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 111;
        values = i2 % 128;
        int i3 = i2 % 2;
        try {
            PackageInfo packageInfo = aFg1iSDK.getMonetizationNetwork.getPackageManager().getPackageInfo(aFg1iSDK.getMonetizationNetwork.getPackageName(), 0);
            if (packageInfo.versionCode > aFg1iSDK.component1.getMediationNetwork("versionCode", 0)) {
                int i4 = values + 93;
                AFKeystoreWrapper = i4 % 128;
                int i5 = i4 % 2;
                aFg1iSDK.component1.AFAdRevenueData("versionCode", packageInfo.versionCode);
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            AFd1qSDK aFd1qSDK = aFg1iSDK.component3;
            map.put("app_version_name", AFb1qSDK.getMediationNetwork(aFd1qSDK.getMonetizationNetwork.AFAdRevenueData, aFd1qSDK.getMonetizationNetwork.AFAdRevenueData.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(aFg1iSDK.component3.getMonetizationNetwork.AFAdRevenueData.getApplicationInfo().targetSdkVersion));
            long j = packageInfo.firstInstallTime;
            long j2 = packageInfo.lastUpdateTime;
            map.put("date1", aFg1iSDK.getMediationNetwork().format(new Date(j)));
            map.put("date2", aFg1iSDK.getMediationNetwork().format(new Date(j2)));
            Object[] objArr2 = new Object[1];
            a(View.getDefaultSize(0, 0) + 15, 102 - ((Process.getThreadPriority(0) + 20) >> 6), "￦\ufffb\u000f\b�\u0002\uffde\ufffb\u000e\uffff\u0000\u0003\f\r\u000e", false, 10 - (Process.myTid() >> 22), objArr2);
            String intern = ((String) objArr2[0]).intern();
            SimpleDateFormat mediationNetwork = aFg1iSDK.getMediationNetwork();
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            map.put(intern, aFg1iSDK.getCurrencyIso4217Code(mediationNetwork));
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMediationNetwork(Map<String, Object> map) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
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
                String obj2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '").append(string2).append("' is not a legal value.").toString();
                Intrinsics.checkNotNullExpressionValue(obj2, "");
                AFLogger.afWarnLog(obj2);
            }
            map.put("currency", string2);
        }
        Object string3 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
        }
        Object string4 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        Object string5 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
            int i8 = values + 79;
            AFKeystoreWrapper = i8 % 128;
            int i9 = i8 % 2;
        }
        Object string6 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFc1cSDK aFc1cSDK = this.equals.getMediationNetwork;
        if (aFc1cSDK == null || (obj = aFc1cSDK.getCurrencyIso4217Code) == null) {
            return;
        }
        int i10 = values + 75;
        AFKeystoreWrapper = i10 % 128;
        int i11 = i10 % 2;
        map.put("sharing_filter", obj);
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void AFAdRevenueData(AFa1oSDK aFa1oSDK) {
        boolean z;
        AFe1nSDK aFe1nSDK;
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 85;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        if (this.component3.component1()) {
            AFh1pSDK aFh1pSDK = this.component3.AFAdRevenueData.component4;
            if (aFh1pSDK == null) {
                int i4 = values + 9;
                AFKeystoreWrapper = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            String str = aFh1pSDK.getRevenue;
            if (str != null && str.length() != 0) {
                aFa1oSDK.getCurrencyIso4217Code("gaidError", aFh1pSDK.getRevenue);
                int i6 = AFKeystoreWrapper + 103;
                values = i6 % 128;
                int i7 = i6 % 2;
            }
            if (aFh1pSDK.AFAdRevenueData != null && aFh1pSDK.getMediationNetwork != null) {
                aFa1oSDK.getCurrencyIso4217Code("advertiserId", aFh1pSDK.AFAdRevenueData);
                aFa1oSDK.getCurrencyIso4217Code("advertiserIdEnabled", String.valueOf(aFh1pSDK.getMediationNetwork));
                aFa1oSDK.getCurrencyIso4217Code("isGaidWithGps", String.valueOf(aFh1pSDK.getCurrencyIso4217Code));
                int i8 = values + 31;
                AFKeystoreWrapper = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 5 / 4;
                }
            }
        } else {
            Map<String, Object> currencyIso4217Code = AFb1rSDK.getCurrencyIso4217Code(aFa1oSDK.getMonetizationNetwork());
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            currencyIso4217Code.put("ad_ids_disabled", Boolean.TRUE);
        }
        AFh1pSDK aFh1pSDK2 = this.component3.AFAdRevenueData.component4;
        if (aFh1pSDK2 != null) {
            int i10 = values + 49;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 == 0) {
                z = Intrinsics.areEqual(aFh1pSDK2.component4, Boolean.TRUE);
                int i11 = 96 / 0;
            } else {
                z = Intrinsics.areEqual(aFh1pSDK2.component4, Boolean.TRUE);
            }
        } else {
            z = false;
        }
        aFa1oSDK.getCurrencyIso4217Code("GAID_retry", String.valueOf(z));
        if (!CollectionsKt.listOf((Object[]) new AFf1zSDK[]{AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH}).contains(aFa1oSDK.getCurrencyIso4217Code()) || (aFe1nSDK = this.equals.component3) == null) {
            return;
        }
        Map<String, Object> currencyIso4217Code2 = AFb1rSDK.getCurrencyIso4217Code(aFa1oSDK.getMonetizationNetwork());
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code2, "");
        currencyIso4217Code2.put("fetchAdIdLatency", Long.valueOf(aFe1nSDK.getRevenue));
    }

    private static PackageInfo w_(PackageManager packageManager, String str) {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "");
            int i2 = AFKeystoreWrapper + 5;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                return packageInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
        int i3 = values + 47;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        return packageInfo2;
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final Long AFAdRevenueData() {
        int i = 2 % 2;
        Context context = this.copy.AFAdRevenueData;
        Object obj = null;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String packageName = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                PackageInfo w_ = w_(packageManager, packageName);
                if (w_ != null) {
                    int i2 = AFKeystoreWrapper + 17;
                    values = i2 % 128;
                    if (i2 % 2 == 0) {
                        return Long.valueOf(w_.firstInstallTime);
                    }
                    Long.valueOf(w_.firstInstallTime);
                    obj.hashCode();
                    throw null;
                }
            }
            return null;
        }
        int i3 = values + 27;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static long component3() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 99;
        values = i2 % 128;
        long currentTimeMillis = i2 % 2 != 0 ? System.currentTimeMillis() + SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i3 = AFKeystoreWrapper + 7;
        values = i3 % 128;
        int i4 = i3 % 2;
        return currentTimeMillis;
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final long getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = values + 87;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            return System.currentTimeMillis();
        }
        System.currentTimeMillis();
        throw null;
    }

    private static String areAllFieldsValid() {
        int i = 2 % 2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        int i2 = AFKeystoreWrapper + 107;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void getRevenue(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 103;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.getRevenue);
            int i3 = 35 / 0;
            if (!z) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.getRevenue);
            if (!z) {
                return;
            }
        }
        int i4 = AFKeystoreWrapper + 59;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            map.put("platform_extension_v2", this.AFAdRevenueData.getMediationNetwork());
            return;
        }
        map.put("platform_extension_v2", this.AFAdRevenueData.getMediationNetwork());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void component4(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 63;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFg1wSDK.AFAdRevenueData(map, this.component3);
        int i4 = values + 79;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0059, code lost:
    
        if (r4.component3.getRevenue.getMediationNetwork("appsFlyerCount", 0) <= 3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0069, code lost:
    
        r1.putAll(r4.getCurrencyIso4217Code.getCurrencyIso4217Code());
        r6 = com.appsflyer.internal.AFg1iSDK.values + 103;
        com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        if (r4.component3.getRevenue.getMediationNetwork("appsFlyerCount", 0) <= 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getMonetizationNetwork(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFAdRevenueData("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFAdRevenueData("ro.product.cpu.abi2"));
        hashMap.put("arch", AFAdRevenueData("os.arch"));
        hashMap.put("build_display_id", AFAdRevenueData("ro.build.display.id"));
        if (z) {
            int i2 = AFKeystoreWrapper + 103;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                areAllFieldsValid(hashMap);
            } else {
                areAllFieldsValid(hashMap);
            }
        }
        hashMap.put("dim", this.areAllFieldsValid.getCurrencyIso4217Code(this.getMonetizationNetwork));
        map.put("deviceData", hashMap);
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        AFi1pSDK aFi1pSDK;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1rSDK aFi1rSDK = this.component2.getMediationNetwork;
        if (aFi1rSDK != null) {
            int i2 = values + 115;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 == 0) {
                aFi1pSDK = aFi1rSDK.getMonetizationNetwork();
                int i3 = 62 / 0;
            } else {
                aFi1pSDK = aFi1rSDK.getMonetizationNetwork();
            }
        } else {
            aFi1pSDK = null;
        }
        if (aFi1pSDK == null) {
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
            map.put("network", aFi1pSDK.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(aFi1pSDK.getMediationNetwork()));
            if (!(!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false))) {
                return;
            }
        } else {
            map.put("network", aFi1pSDK.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(aFi1pSDK.getMediationNetwork()));
            if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
        }
        String str = aFi1pSDK.getCurrencyIso4217Code;
        if (str != null) {
            map.put("operator", str);
        } else {
            int i7 = AFKeystoreWrapper + 97;
            values = i7 % 128;
            int i8 = i7 % 2;
        }
        String str2 = aFi1pSDK.getMediationNetwork;
        if (str2 != null) {
            map.put("carrier", str2);
        }
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = values + 7;
        AFKeystoreWrapper = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i));
            map.put("iaecounter", String.valueOf(i2));
            copy();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        map.put("isFirstCall", String.valueOf(!copy()));
        int i5 = values + 17;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r12 = kotlin.Result.m6239constructorimpl(kotlin.ResultKt.createFailure(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r12.get("af_deeplink") != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r12.get("af_deeplink") != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r2 = r11;
        r2 = new org.json.JSONObject(r1);
        r2.put("isPush", com.facebook.internal.ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        r12.put("af_deeplink", r2.toString());
        r12 = kotlin.Result.m6239constructorimpl(kotlin.Unit.INSTANCE);
     */
    @Override // com.appsflyer.internal.AFg1kSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFAdRevenueData(Map<String, Object> map) {
        Object m6239constructorimpl;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.equals.AFAdRevenueData;
        if (str != null) {
            int i2 = AFKeystoreWrapper + 61;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 85 / 0;
            }
        }
        this.equals.AFAdRevenueData = null;
        Throwable m6242exceptionOrNullimpl = Result.m6242exceptionOrNullimpl(m6239constructorimpl);
        if (m6242exceptionOrNullimpl != null) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", m6242exceptionOrNullimpl, false, false, false, false, MenuKt.InTransitionDuration, null);
        }
        Result.m6238boximpl(m6239constructorimpl);
        int i4 = values + 117;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        this.equals.AFAdRevenueData = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // com.appsflyer.internal.AFg1kSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        monetizationNetwork.put("open_referrer", aFa1oSDK.AFAdRevenueData);
        String str = aFa1oSDK.component3;
        if (str != null) {
            int i2 = values + 25;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            if (!StringsKt.isBlank(str)) {
                z = false;
                if (z) {
                    int i4 = values + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
                    AFKeystoreWrapper = i4 % 128;
                    int i5 = i4 % 2;
                    monetizationNetwork.put("af_web_referrer", aFa1oSDK.component3);
                    return;
                }
                return;
            }
        }
        z = true;
        if (z) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        r5.put("btch", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void areAllFieldsValid(Map<String, Object> map) {
        String str;
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 93;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            AFd1vSDK.AFa1zSDK AFAdRevenueData = this.getMediationNetwork.AFAdRevenueData(this.getMonetizationNetwork);
            float f = AFAdRevenueData.getCurrencyIso4217Code;
            str = AFAdRevenueData.AFAdRevenueData;
            map.put("btl", String.valueOf(f));
            int i3 = 80 / 0;
        } else {
            AFd1vSDK.AFa1zSDK AFAdRevenueData2 = this.getMediationNetwork.AFAdRevenueData(this.getMonetizationNetwork);
            float f2 = AFAdRevenueData2.getCurrencyIso4217Code;
            str = AFAdRevenueData2.AFAdRevenueData;
            map.put("btl", String.valueOf(f2));
        }
        int i4 = values + 5;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    private void component3(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            int i2 = values + 47;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("onelink_id", string);
                throw null;
            }
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
            int i3 = values + 9;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private void component2(Map<String, ? extends Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1oSDK aFh1oSDK = this.component4;
        HashMap hashMap = new HashMap(aFh1oSDK.getMonetizationNetwork);
        aFh1oSDK.getMonetizationNetwork.clear();
        this.component4.AFAdRevenueData.AFAdRevenueData("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (!hashMap.isEmpty()) {
            int i2 = AFKeystoreWrapper;
            int i3 = i2 + 39;
            values = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 13;
            values = i5 % 128;
            if (i5 % 2 == 0) {
                Map<String, Object> currencyIso4217Code = AFb1rSDK.getCurrencyIso4217Code(map);
                Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
                currencyIso4217Code.put("gcd", hashMap);
            } else {
                Map<String, Object> currencyIso4217Code2 = AFb1rSDK.getCurrencyIso4217Code(map);
                Intrinsics.checkNotNullExpressionValue(currencyIso4217Code2, "");
                currencyIso4217Code2.put("gcd", hashMap);
                int i6 = 27 / 0;
            }
        }
    }

    private void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i = 2 % 2;
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
            if (i4 % 2 == 0) {
                int i5 = 16 / 0;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    private String component4() {
        int i = 2 % 2;
        int i2 = values + 51;
        AFKeystoreWrapper = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.component1.getMonetizationNetwork("INSTALL_STORE");
            obj.hashCode();
            throw null;
        }
        if (this.component1.getMonetizationNetwork("INSTALL_STORE")) {
            return this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
        }
        String str = component2() ^ true ? null : (String) getCurrencyIso4217Code(new Object[]{this}, -505986928, 505986930, System.identityHashCode(this));
        this.component1.AFAdRevenueData("INSTALL_STORE", str);
        int i3 = values + 117;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 33;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1iSDK}, 1273246331, -1273246327, System.identityHashCode(aFg1iSDK))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i3 = 40 / 0;
            if (string != null) {
                return string;
            }
        } else {
            String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1iSDK}, 1273246331, -1273246327, System.identityHashCode(aFg1iSDK))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string2 != null) {
                return string2;
            }
        }
        int i4 = values + 123;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        String mediationNetwork = aFg1iSDK.getMediationNetwork("AF_STORE");
        if (i5 == 0) {
            int i6 = 35 / 0;
        }
        return mediationNetwork;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("AppsFlyer: first launch detected");
        r2 = r10.format(new java.util.Date());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (component2() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (component2() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        r10 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper + 37;
        com.appsflyer.internal.AFg1iSDK.values = r10 % 128;
        r10 = r10 % 2;
        r2 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 75;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
        if (monetizationNetwork == null) {
            int i4 = values + 79;
            AFKeystoreWrapper = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
            }
            this.component1.AFAdRevenueData("appsFlyerFirstInstall", monetizationNetwork);
            int i6 = values + 77;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 4;
            }
        }
        AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.GENERAL, "AppsFlyer: first launch date: " + monetizationNetwork, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        return monetizationNetwork;
    }

    private boolean component2() {
        int i = 2 % 2;
        int i2 = values + 51;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        if (this.component3.getRevenue.getMediationNetwork("appsFlyerCount", 0) <= 1) {
            int i4 = values + 27;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = values + 85;
        AFKeystoreWrapper = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 97;
        values = i2 % 128;
        int i3 = i2 % 2;
        boolean parseBoolean = Boolean.parseBoolean(aFg1iSDK.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return Boolean.valueOf(parseBoolean);
    }

    private String equals() {
        String str;
        int i = 2 % 2;
        String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString("preInstallName");
        Object obj = null;
        if (string == null) {
            if (!this.component1.getMonetizationNetwork("preInstallName")) {
                if (component2()) {
                    int i2 = AFKeystoreWrapper + 19;
                    values = i2 % 128;
                    if (i2 % 2 == 0) {
                        string = AFInAppEventType();
                        if (string == null) {
                            string = getMediationNetwork("AF_PRE_INSTALL_NAME");
                        }
                    } else {
                        AFInAppEventType();
                        obj.hashCode();
                        throw null;
                    }
                }
                if (string != null) {
                    int i3 = AFKeystoreWrapper + 59;
                    values = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.component1.AFAdRevenueData("preInstallName", string);
                    } else {
                        this.component1.AFAdRevenueData("preInstallName", string);
                        throw null;
                    }
                }
                str = string;
            } else {
                int i4 = AFKeystoreWrapper + 13;
                values = i4 % 128;
                if (i4 % 2 != 0) {
                    str = this.component1.getMonetizationNetwork("preInstallName", (String) null);
                    int i5 = 31 / 0;
                } else {
                    str = this.component1.getMonetizationNetwork("preInstallName", (String) null);
                }
            }
            if (str != null) {
                ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).set("preInstallName", str);
            }
            return str;
        }
        int i6 = AFKeystoreWrapper + 39;
        values = i6 % 128;
        if (i6 % 2 == 0) {
            return string;
        }
        throw null;
    }

    private void AFAdRevenueData(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 91;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        boolean z = false;
        if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i4 = AFKeystoreWrapper + 29;
            values = i4 % 128;
            if (i4 % 2 == 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                return;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                int i5 = 7 / 0;
                return;
            }
        }
        Object revenue = this.toString.getRevenue(this.component1);
        String str2 = (CharSequence) revenue;
        if (str2 == null || str2.length() == 0) {
            int i6 = AFKeystoreWrapper + 93;
            values = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        if (!z) {
            map.put("imei", revenue);
        }
        String currencyIso4217Code = getCurrencyIso4217Code(str);
        if (currencyIso4217Code != null) {
            int i8 = values + 5;
            AFKeystoreWrapper = i8 % 128;
            int i9 = i8 % 2;
            this.component1.AFAdRevenueData("androidIdCached", currencyIso4217Code);
            map.put("android_id", currencyIso4217Code);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
            int i10 = AFKeystoreWrapper + 31;
            values = i10 % 128;
            int i11 = i10 % 2;
        }
        AFb1tSDK currencyIso4217Code2 = AFb1vSDK.getCurrencyIso4217Code(this.getMonetizationNetwork);
        if (currencyIso4217Code2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = currencyIso4217Code2.getMediationNetwork;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str3 = currencyIso4217Code2.getRevenue;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            linkedHashMap.put("val", str3);
            Boolean bool2 = currencyIso4217Code2.AFAdRevenueData;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (r1.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getCurrencyIso4217Code(String str) {
        int i;
        int i2 = 2 % 2;
        if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            int i3 = values + 115;
            int i4 = i3 % 128;
            AFKeystoreWrapper = i4;
            int i5 = i3 % 2;
            String str2 = str;
            if (str2 != null) {
                int i6 = i4 + 123;
                values = i6 % 128;
                int i7 = i6 % 2;
            }
            if (AFKeystoreWrapper()) {
                int i8 = values + 123;
                AFKeystoreWrapper = i8 % 128;
                if (i8 % 2 == 0) {
                    copydefault();
                    throw null;
                }
                str = copydefault();
                i = values + 115;
                AFKeystoreWrapper = i % 128;
                int i9 = i % 2;
                return str;
            }
            return null;
        }
        if (str != null) {
            i = AFKeystoreWrapper + 107;
            values = i % 128;
            int i92 = i % 2;
            return str;
        }
        return null;
    }

    private final String copydefault() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 3;
        values = i2 % 128;
        int i3 = i2 % 2;
        String monetizationNetwork = this.component1.getMonetizationNetwork("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
            if (string != null) {
                int i4 = AFKeystoreWrapper + 79;
                values = i4 % 128;
                int i5 = i4 % 2;
                return string;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (monetizationNetwork == null) {
            return null;
        }
        AFLogger.afDebugLog("use cached AndroidId: " + monetizationNetwork);
        return monetizationNetwork;
    }

    private static void hashCode(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = values + 93;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 5, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 103, "\ufffb\u000b\ufffa\u0007�", false, 5 - TextUtils.indexOf("", "", 0, 0), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, String.valueOf(Build.VERSION.SDK_INT));
        map.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i4 = values + 27;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void getRevenue(AFa1oSDK aFa1oSDK, String str, String str2, AFc1aSDK aFc1aSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        if (aFa1oSDK.getCurrencyIso4217Code() == AFf1zSDK.CONVERSION) {
            int i2 = AFKeystoreWrapper + 53;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                toString(monetizationNetwork);
                copydefault(monetizationNetwork);
                equals(monetizationNetwork);
                AFc1rSDK.getMonetizationNetwork(this.copy, this.component1);
                int i3 = 72 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                toString(monetizationNetwork);
                copydefault(monetizationNetwork);
                equals(monetizationNetwork);
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
        Object obj = null;
        if (aFc1aSDK == null) {
            int i4 = AFKeystoreWrapper + 97;
            values = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i5 = values + 75;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 != 0) {
            aFc1aSDK.getRevenue(monetizationNetwork);
        } else {
            aFc1aSDK.getRevenue(monetizationNetwork);
            obj.hashCode();
            throw null;
        }
    }

    private final void toString(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 65;
        values = i2 % 128;
        int i3 = i2 % 2;
        if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            map.put("batteryLevel", String.valueOf(this.getMediationNetwork.AFAdRevenueData(this.getMonetizationNetwork).getCurrencyIso4217Code));
        }
        int i4 = values + 11;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
    }

    private final void copydefault(Map<String, Object> map) {
        UiModeManager uiModeManager;
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 25;
        values = i2 % 128;
        if (i2 % 2 == 0 || Build.VERSION.SDK_INT >= 125) {
            uiModeManager = (UiModeManager) this.getMonetizationNetwork.getSystemService(UiModeManager.class);
        } else {
            Object systemService = this.getMonetizationNetwork.getSystemService("uimode");
            uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        }
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        int i3 = AFKeystoreWrapper + 79;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            map.put("tv", Boolean.TRUE);
        } else {
            map.put("tv", Boolean.TRUE);
            throw null;
        }
    }

    private void copy(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 29;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        int i4 = values + 87;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void equals(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = values + 101;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
            if (!AFh1zSDK.getRevenue(this.getMonetizationNetwork)) {
                return;
            }
        } else if (!AFh1zSDK.getRevenue(this.getMonetizationNetwork)) {
            return;
        }
        map.put("inst_app", Boolean.TRUE);
        int i4 = values + 101;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    private void AFKeystoreWrapper(Map<String, Object> map) {
        long j;
        TimeUnit timeUnit;
        long j2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        long mediationNetwork = this.component1.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        this.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (mediationNetwork > 0) {
            int i2 = AFKeystoreWrapper + 69;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                timeUnit = TimeUnit.MILLISECONDS;
                j2 = currentTimeMillis * mediationNetwork;
            } else {
                timeUnit = TimeUnit.MILLISECONDS;
                j2 = currentTimeMillis - mediationNetwork;
            }
            j = timeUnit.toSeconds(j2);
        } else {
            j = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(j));
        int i3 = values + 5;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        Map map = (Map) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 65;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (str == null) {
            return null;
        }
        int i4 = values + 15;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 == 0) {
            map.put(HintConstants.AUTOFILL_HINT_PHONE, str);
            int i5 = 0 / 0;
        } else {
            map.put(HintConstants.AUTOFILL_HINT_PHONE, str);
        }
        int i6 = AFKeystoreWrapper + 49;
        values = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        if (r2.get("referrer") == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        r0 = com.appsflyer.internal.AFg1iSDK.values + 75;
        com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        if ((r0 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        r2.put("referrer", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        r2.put("referrer", r9);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (r2.get("referrer") == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
    
        if (r4.length() != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
    
        r2.put("referrer", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0032, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r4 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        String str;
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = values + 71;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            str = str2;
            int i3 = 58 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            str = str2;
        }
        Object obj = null;
        String monetizationNetwork = aFg1iSDK.component1.getMonetizationNetwork("extraReferrers", (String) null);
        if (monetizationNetwork != null) {
            int i4 = values + 17;
            AFKeystoreWrapper = i4 % 128;
            if (i4 % 2 == 0) {
                map.put("extraReferrers", monetizationNetwork);
                int i5 = 17 / 0;
            } else {
                map.put("extraReferrers", monetizationNetwork);
            }
        }
        String referrer = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1iSDK}, 1273246331, -1273246327, System.identityHashCode(aFg1iSDK))).getReferrer(aFg1iSDK.component1);
        String str3 = referrer;
        if (str3 != null && str3.length() != 0) {
            int i6 = AFKeystoreWrapper + 11;
            values = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 74 / 0;
            }
        }
        return null;
    }

    private void valueOf(Map<String, Object> map) {
        long j;
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 9;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            j = this.component4.equals;
            if (j == 0) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            j = this.component4.equals;
            if (j == 0) {
                return;
            }
        }
        map.put("prev_session_dur", Long.valueOf(j));
        int i3 = AFKeystoreWrapper + 99;
        values = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void values(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFc1rSDK aFc1rSDK = AFc1rSDK.INSTANCE;
        Object currencyIso4217Code = AFc1rSDK.getCurrencyIso4217Code();
        AFc1rSDK aFc1rSDK2 = AFc1rSDK.INSTANCE;
        String monetizationNetwork = AFc1rSDK.getMonetizationNetwork();
        Object obj = null;
        if (currencyIso4217Code != null) {
            int i2 = AFKeystoreWrapper + 77;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (monetizationNetwork != null && Integer.parseInt(monetizationNetwork) > 0) {
                int i3 = values + 99;
                AFKeystoreWrapper = i3 % 128;
                if (i3 % 2 == 0) {
                    map.put("reinstallCounter", monetizationNetwork);
                    map.put("originalAppsflyerId", currencyIso4217Code);
                    throw null;
                }
                map.put("reinstallCounter", monetizationNetwork);
                map.put("originalAppsflyerId", currencyIso4217Code);
            }
        }
        int i4 = AFKeystoreWrapper + 63;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 33;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.copydefault.getRevenue());
            int i3 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.copydefault.getRevenue());
        }
        int i4 = AFKeystoreWrapper + 67;
        values = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventType(Map<String, Object> map) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        String str = string;
        if (str != null) {
            int i2 = values + 73;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                int i4 = AFKeystoreWrapper + 63;
                values = i4 % 128;
                int i5 = i4 % 2;
                z = false;
                if (!z) {
                    return;
                }
                int i6 = AFKeystoreWrapper + 105;
                values = i6 % 128;
                int i7 = i6 % 2;
                map.put(AppsFlyerProperties.EXTENSION, string);
                return;
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r2 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d(Map<String, Object> map) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String component4 = this.component3.component4();
        String str = (String) getCurrencyIso4217Code(new Object[]{this.component1, component4}, -1548056329, 1548056332, (int) System.currentTimeMillis());
        boolean z2 = true;
        if (str == null || Intrinsics.areEqual(str, component4)) {
            int i2 = values + 5;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        } else {
            z = true;
        }
        if (str == null) {
            int i4 = AFKeystoreWrapper + 3;
            values = i4 % 128;
            int i5 = i4 % 2;
        }
        z2 = false;
        if (z || z2) {
            map.put("af_latestchannel", component4);
        }
        String component42 = component4();
        if (component42 != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = component42.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String equals = equals();
        if (equals != null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = equals.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String str2 = (String) getCurrencyIso4217Code(new Object[]{this}, -505986928, 505986930, System.identityHashCode(this));
        if (str2 != null) {
            int i6 = values + 69;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 != 0) {
                Locale locale3 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                String lowerCase3 = str2.toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                map.put("af_currentstore", lowerCase3);
                return;
            }
            Locale locale4 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale4, "");
            String lowerCase4 = str2.toLowerCase(locale4);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
            map.put("af_currentstore", lowerCase4);
            throw null;
        }
    }

    private void e(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = values + 7;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(AFd1qSDK.getMonetizationNetwork(this.getMonetizationNetwork)));
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(AFd1qSDK.getMonetizationNetwork(this.getMonetizationNetwork)));
            int i3 = 24 / 0;
        }
    }

    private static void AFLogger(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 7;
        values = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            int i4 = AFKeystoreWrapper + 73;
            values = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e2);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e3);
        }
    }

    private void registerClient(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = values + 37;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(this.copy, this.component1);
            if (currencyIso4217Code != null) {
                map.put("uid", currencyIso4217Code);
                int i4 = AFKeystoreWrapper + 75;
                values = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Throwable th) {
            String obj = new StringBuilder("ERROR: could not get uid ").append(th.getMessage()).toString();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            AFLogger.afErrorLog(obj, th);
        }
    }

    private void unregisterClient(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = values + 115;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + AFg1jSDK.getMonetizationNetwork(this.getMonetizationNetwork));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        boolean monetizationNetwork = AFg1jSDK.getMonetizationNetwork(this.getMonetizationNetwork);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
        if (!monetizationNetwork) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1jSDK.getRevenue(this.component1)));
        int i3 = values + 27;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        int i2 = values + 21;
        AFKeystoreWrapper = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFb1vSDK.b_(aFg1iSDK.getMonetizationNetwork.getContentResolver());
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFb1tSDK b_ = AFb1vSDK.b_(aFg1iSDK.getMonetizationNetwork.getContentResolver());
        if (b_ != null) {
            int i3 = values + 1;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            map.put("amazon_aid", b_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(b_.AFAdRevenueData));
        }
        return null;
    }

    private void afInfoLog(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = values + 41;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.component1.getMonetizationNetwork("is_stop_tracking_used");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            int i3 = AFKeystoreWrapper + 83;
            values = i3 % 128;
            int i4 = i3 % 2;
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used")));
        }
    }

    private void force(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFg1wSDK aFg1wSDK = this.toString;
        String str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK));
        String str2 = str;
        if (str2 != null) {
            int i2 = values + 91;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            if (str2.length() == 0) {
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
    }

    private void v(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = values + 107;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, false)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        }
        String str = null;
        try {
            this.getMonetizationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            str = this.component3.AFAdRevenueData(this.getMonetizationNetwork);
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFh1vSDK.ATTRIBUTION, "Exception while collecting facebook's attribution ID. com.facebook.katana not found", e, false, false, true, false);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.ATTRIBUTION, "Exception while collecting facebook's attribution ID. ", th, false, false, true, false);
        }
        if (str != null) {
            map.put("fb", str);
            int i3 = AFKeystoreWrapper + 105;
            values = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        r1.AFAdRevenueData("CACHED_CHANNEL", r6);
        r0 = com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFg1iSDK.values = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String monetizationNetwork;
        AFd1rSDK aFd1rSDK = (AFd1rSDK) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 79;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            monetizationNetwork = aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            int i3 = 56 / 0;
        } else {
            monetizationNetwork = aFd1rSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        }
    }

    private static String AFAdRevenueData(String str) {
        int i = 2 % 2;
        int i2 = values + 103;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(invoke, "");
            String str2 = (String) invoke;
            int i4 = values + 67;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private final String getMediationNetwork(String str) {
        String revenue;
        int i = 2 % 2;
        int i2 = values + 25;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            revenue = this.component3.getRevenue(str);
            int i3 = 50 / 0;
        } else {
            revenue = this.component3.getRevenue(str);
        }
        int i4 = AFKeystoreWrapper + 79;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        r1 = com.appsflyer.internal.AFg1iSDK.values + 73;
        com.appsflyer.internal.AFg1iSDK.AFKeystoreWrapper = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r1 = (java.io.File) getCurrencyIso4217Code(new java.lang.Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, 1393711468, -1393711457, (int) java.lang.System.currentTimeMillis());
        r2 = 6 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        r1 = (java.io.File) getCurrencyIso4217Code(new java.lang.Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, 1393711468, -1393711457, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if (getCurrencyIso4217Code(r1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (getCurrencyIso4217Code(r1) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String AFInAppEventType() {
        File file;
        int i = 2 % 2;
        int i2 = values + 23;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            file = (File) getCurrencyIso4217Code(new Object[]{AFAdRevenueData("ro.appsflyer.preinstall.path")}, 1393711468, -1393711457, (int) System.currentTimeMillis());
            int i3 = 91 / 0;
        } else {
            file = (File) getCurrencyIso4217Code(new Object[]{AFAdRevenueData("ro.appsflyer.preinstall.path")}, 1393711468, -1393711457, (int) System.currentTimeMillis());
        }
        Object obj = null;
        if (!(!getCurrencyIso4217Code(file))) {
            int i4 = values + 39;
            AFKeystoreWrapper = i4 % 128;
            if (i4 % 2 != 0) {
                file = (File) getCurrencyIso4217Code(new Object[]{"/data/local/tmp/pre_install.appsflyer"}, 1393711468, -1393711457, (int) System.currentTimeMillis());
            } else {
                obj.hashCode();
                throw null;
            }
        }
        if (!(!getCurrencyIso4217Code(file))) {
            file = (File) getCurrencyIso4217Code(new Object[]{"/etc/pre_install.appsflyer"}, 1393711468, -1393711457, (int) System.currentTimeMillis());
        }
        if (getCurrencyIso4217Code(file)) {
            return null;
        }
        String packageName = this.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return (String) getCurrencyIso4217Code(new Object[]{file, packageName}, 2000545293, -2000545286, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        if (str == null) {
            return null;
        }
        int i2 = AFKeystoreWrapper + 123;
        values = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (StringsKt.trim((CharSequence) str).toString().length() <= 0) {
                return null;
            }
            int i4 = values + 89;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            return new File(StringsKt.trim((CharSequence) str).toString());
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r3.exists() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getCurrencyIso4217Code(File file) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 87;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        int i4 = values + 81;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x006a -> B:25:0x0096). Please report as a decompilation issue!!! */
    private static /* synthetic */ Object component3(Object[] objArr) {
        InputStreamReader inputStreamReader;
        Properties properties;
        File file = (File) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = values + 69;
        ?? r5 = i2 % 128;
        AFKeystoreWrapper = r5;
        int i3 = i2 % 2;
        try {
            try {
                if (file == null) {
                    int i4 = r5 + 97;
                    values = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 61 / 0;
                    }
                    return null;
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
                    return property;
                } catch (FileNotFoundException unused2) {
                    AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                        r5 = inputStreamReader;
                    } else {
                        int i6 = AFKeystoreWrapper + 15;
                        values = i6 % 128;
                        int i7 = i6 % 2;
                        r5 = inputStreamReader;
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    AFLogger.afErrorLog(th.getMessage(), th);
                    r5 = inputStreamReader;
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                        r5 = inputStreamReader;
                    }
                    return null;
                }
            } catch (Throwable th4) {
                if (r5 != 0) {
                    try {
                        r5.close();
                    } catch (Throwable th5) {
                        AFLogger.afErrorLog(th5.getMessage(), th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLog(th6.getMessage(), th6);
            r5 = r5;
        }
    }

    private final boolean AFKeystoreWrapper() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 73;
        values = i2 % 128;
        int i3 = i2 % 2;
        if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return true;
        }
        int i4 = values + 125;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFb1rSDK.getRevenue();
        if (!AFb1rSDK.getRevenue(this.getMonetizationNetwork)) {
            return true;
        }
        int i6 = values + 13;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void getRevenue(Map<String, Object> map, AFa1oSDK aFa1oSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        String str = aFa1oSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            map.put("eventValue", new JSONObject(aFa1oSDK.getCurrencyIso4217Code == null ? new HashMap() : aFa1oSDK.getCurrencyIso4217Code).toString());
        }
    }

    private static String getRevenue(File file, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{file, str}, 2000545293, -2000545286, (int) System.currentTimeMillis());
    }

    private static File getRevenue(String str) {
        return (File) getCurrencyIso4217Code(new Object[]{str}, 1393711468, -1393711457, (int) System.currentTimeMillis());
    }

    private static String getMediationNetwork(AFd1rSDK aFd1rSDK, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{aFd1rSDK, str}, -1548056329, 1548056332, (int) System.currentTimeMillis());
    }

    private void i(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -1748783943, 1748783953, System.identityHashCode(this));
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        getCurrencyIso4217Code(new Object[]{this, map, str}, 86217130, -86217129, System.identityHashCode(this));
    }

    private static void getRevenue(Map<String, Object> map, String str) {
        getCurrencyIso4217Code(new Object[]{map, str}, -830168679, 830168685, (int) System.currentTimeMillis());
    }

    private boolean copy() {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this}, -156743048, 156743056, System.identityHashCode(this))).booleanValue();
    }

    private String component1() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -505986928, 505986930, System.identityHashCode(this));
    }

    private String getMonetizationNetwork() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        return (String) getCurrencyIso4217Code(new Object[]{this}, 76539304, -76539295, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMediationNetwork(AFa1oSDK aFa1oSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFa1oSDK}, 1541874918, -1541874906, System.identityHashCode(this));
    }

    private final void component1(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -1208384822, 1208384822, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final void getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFa1oSDK}, -1645166160, 1645166165, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getRevenue() {
        return (AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, 1273246331, -1273246327, System.identityHashCode(this));
    }
}
