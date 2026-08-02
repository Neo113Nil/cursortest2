package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.connectsdk.service.airplay.PListParser;
import defpackage.xq0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AFf1vSDK extends AFf1tSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 1;
    private static int AFInAppEventType;
    private static char[] AFKeystoreWrapper = {33841, 33847, 45515, 45518, 33844, 45533, 33846, 45505, 45517};
    private static char registerClient = 33846;
    private final AFg1tSDK AFLogger;
    private final AFc1hSDK copy;
    private final AFc1kSDK copydefault;
    private final String equals;

    public AFf1vSDK(@NonNull String str, @NonNull AFc1fSDK aFc1fSDK) {
        super(new AFg1xSDK(), aFc1fSDK, str);
        this.copydefault = aFc1fSDK.getRevenue();
        this.copy = aFc1fSDK.AFLogger();
        this.equals = str;
        this.AFLogger = aFc1fSDK.component3();
    }

    private static void a(String str, int i, byte b, Object[] objArr) {
        int i2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        char[] cArr3 = AFKeystoreWrapper;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $10 + 119;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr4[i3] = (char) (cArr3[i3] ^ (-2775045471812025291L));
                } else {
                    cArr4[i3] = (char) (cArr3[i3] ^ (-2775045471812025291L));
                    i3++;
                }
            }
            cArr3 = cArr4;
        }
        char c = (char) ((-2775045471812025291L) ^ registerClient);
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aFk1rSDK.getRevenue = 0;
            while (true) {
                int i5 = aFk1rSDK.getRevenue;
                if (i5 >= i2) {
                    break;
                }
                char c2 = cArr2[i5];
                aFk1rSDK.AFAdRevenueData = c2;
                char c3 = cArr2[i5 + 1];
                aFk1rSDK.getMediationNetwork = c3;
                if (c2 == c3) {
                    cArr5[i5] = (char) (c2 - b);
                    cArr5[i5 + 1] = (char) (c3 - b);
                } else {
                    int i6 = c2 / c;
                    aFk1rSDK.getMonetizationNetwork = i6;
                    int i7 = c2 % c;
                    aFk1rSDK.component3 = i7;
                    int i8 = c3 / c;
                    aFk1rSDK.getCurrencyIso4217Code = i8;
                    int i9 = c3 % c;
                    aFk1rSDK.component2 = i9;
                    if (i7 == i9) {
                        $10 = ($11 + 105) % 128;
                        int i10 = ((i6 + c) - 1) % c;
                        aFk1rSDK.getMonetizationNetwork = i10;
                        int i11 = ((i8 + c) - 1) % c;
                        aFk1rSDK.getCurrencyIso4217Code = i11;
                        cArr5[i5] = cArr3[(i10 * c) + i7];
                        cArr5[i5 + 1] = cArr3[(i11 * c) + i9];
                    } else if (i6 == i8) {
                        $11 = ($10 + 85) % 128;
                        int i12 = ((i7 + c) - 1) % c;
                        aFk1rSDK.component3 = i12;
                        int i13 = ((i9 + c) - 1) % c;
                        aFk1rSDK.component2 = i13;
                        cArr5[i5] = cArr3[(i6 * c) + i12];
                        cArr5[i5 + 1] = cArr3[(i8 * c) + i13];
                    } else {
                        cArr5[i5] = cArr3[(i6 * c) + i9];
                        cArr5[i5 + 1] = cArr3[(i8 * c) + i7];
                    }
                }
                aFk1rSDK.getRevenue = i5 + 2;
            }
        }
        int i14 = 0;
        while (i14 < i) {
            cArr5[i14] = (char) (cArr5[i14] ^ 13722);
            i14++;
            $10 = ($11 + 101) % 128;
        }
        objArr[0] = new String(cArr5);
    }

    private void equals() {
        int i = AFInAppEventType + 97;
        AFInAppEventParameterName = i % 128;
        this.toString.getCurrencyIso4217Code("sentRegisterRequestToAF", i % 2 != 0);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void AFAdRevenueData(AFh1tSDK aFh1tSDK) {
        getMonetizationNetwork(new Object[]{this, aFh1tSDK}, -1677420347, 1677420347, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void component3(AFh1tSDK aFh1tSDK) {
        String currencyIso4217Code = this.copydefault.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            AFInAppEventType = (AFInAppEventParameterName + 11) % 128;
            aFh1tSDK.getMonetizationNetwork("advertiserId", currencyIso4217Code);
        }
        AFInAppEventParameterName = (AFInAppEventType + 57) % 128;
    }

    @Override // com.appsflyer.internal.AFf1tSDK, com.appsflyer.internal.AFe1kSDK
    public final boolean copydefault() {
        AFInAppEventParameterName = (AFInAppEventType + 115) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final void getCurrencyIso4217Code() {
        AFInAppEventParameterName = (AFInAppEventType + 101) % 128;
        super.getCurrencyIso4217Code();
        ResponseNetwork responseNetwork = ((AFe1kSDK) this).component2;
        if (responseNetwork != null) {
            int i = AFInAppEventType + 11;
            AFInAppEventParameterName = i % 128;
            if (i % 2 == 0) {
                responseNetwork.isSuccessful();
                throw null;
            }
            if (responseNetwork.isSuccessful()) {
                equals();
            }
        }
        int i2 = AFInAppEventType + 47;
        AFInAppEventParameterName = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void getMediationNetwork(AFh1tSDK aFh1tSDK) {
        int i = AFInAppEventParameterName + 67;
        AFInAppEventType = i % 128;
        if (i % 2 != 0) {
            int i2 = 48 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        int i = AFInAppEventParameterName + 95;
        AFInAppEventType = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void getRevenue(AFh1tSDK aFh1tSDK) {
        super.getRevenue(aFh1tSDK);
        Context context = this.copy.getMonetizationNetwork;
        AFa1zSDK monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
        if (context == null) {
            xq0.q("Context is not provided, can't send register request");
            return;
        }
        if (monetizationNetwork.getCurrencyIso4217Code()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            xq0.q("CustomerUserId not set, register is not sent");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            aFh1tSDK.getMonetizationNetwork("app_version_code", Integer.toString(packageInfo.versionCode));
            aFh1tSDK.getMonetizationNetwork(CommonUrlParts.APP_VERSION, packageInfo.versionName);
            aFh1tSDK.getMonetizationNetwork("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFh1tSDK.getMonetizationNetwork("installDate", AFa1zSDK.getMediationNetwork(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.AFLogger.getRevenue(aFh1tSDK.getMonetizationNetwork);
        aFh1tSDK.getMonetizationNetwork.remove("ivc");
        String str = (String) AFa1zSDK.AFAdRevenueData(new Object[0], -775349742, 775349749, (int) System.currentTimeMillis());
        if (str != null) {
            aFh1tSDK.getMonetizationNetwork("appUserId", str);
        }
        try {
            aFh1tSDK.getMonetizationNetwork(CommonUrlParts.MODEL, Build.MODEL);
            Object[] objArr = new Object[1];
            a("\u0002\b\u0004\u0006㘕", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, (byte) (23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr);
            aFh1tSDK.getMonetizationNetwork(((String) objArr[0]).intern(), Build.BRAND);
            AFInAppEventParameterName = (AFInAppEventType + 43) % 128;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            aFh1tSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, PListParser.TAG_TRUE);
        }
        AFb1lSDK k_ = AFb1iSDK.k_(context.getContentResolver());
        if (k_ != null) {
            AFInAppEventType = (AFInAppEventParameterName + 113) % 128;
            aFh1tSDK.getMonetizationNetwork("amazon_aid", k_.getMonetizationNetwork);
            aFh1tSDK.getMonetizationNetwork("amazon_aid_limit", String.valueOf(k_.getCurrencyIso4217Code));
        }
        aFh1tSDK.getMonetizationNetwork("devkey", ((AFe1kSDK) this).component4.getRevenue());
        aFh1tSDK.getMonetizationNetwork("uid", AFb1kSDK.getMonetizationNetwork(this.toString));
        aFh1tSDK.getMonetizationNetwork("af_gcm_token", this.equals);
        aFh1tSDK.getMonetizationNetwork("launch_counter", Integer.toString(this.toString.AFAdRevenueData("appsFlyerCount", 0)));
        aFh1tSDK.getMonetizationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String component1 = this.copydefault.component1();
        if (component1 != null) {
            int i = AFInAppEventType + 81;
            AFInAppEventParameterName = i % 128;
            if (i % 2 == 0) {
                aFh1tSDK.getMonetizationNetwork("channel", component1);
                int i2 = 82 / 0;
            } else {
                aFh1tSDK.getMonetizationNetwork("channel", component1);
            }
        }
        int i3 = AFInAppEventParameterName + 67;
        AFInAppEventType = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i, int i2, int i3) {
        return getRevenue(objArr);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK) {
        int i = AFInAppEventParameterName + 113;
        AFInAppEventType = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i = AFInAppEventType + 43;
        AFInAppEventParameterName = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }
}
