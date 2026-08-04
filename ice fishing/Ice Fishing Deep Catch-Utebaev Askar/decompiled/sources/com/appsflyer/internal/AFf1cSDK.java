package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1cSDK extends AFf1eSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 0;
    private static int valueOf = 1;
    private final AFg1kSDK AFInAppEventType;
    private final String copy;
    private final AFd1nSDK copydefault;
    private final AFd1qSDK hashCode;
    private static char[] values = {23880, 23896, 23876, 23886, 23885, 23883, 23881, 23882, 23884};
    private static char AFKeystoreWrapper = 26803;

    public AFf1cSDK(String str, AFd1kSDK aFd1kSDK) {
        super(new AFg1lSDK(aFd1kSDK.values().AFAdRevenueData), aFd1kSDK, str);
        this.hashCode = aFd1kSDK.getMediationNetwork();
        this.copydefault = aFd1kSDK.values();
        this.copy = str;
        this.AFInAppEventType = aFd1kSDK.component1();
    }

    private static void a(int i2, byte b2, String str, Object[] objArr) {
        char[] charArray;
        int i3;
        if (str != null) {
            int i4 = $11 + 37;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr2 = values;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = $10 + 71;
                $11 = i6 % 128;
                if (!(i6 % 2 == 0)) {
                    cArr3[i5] = (char) (((long) cArr2[i5]) ^ 3167490297675737264L);
                } else {
                    cArr3[i5] = (char) (((long) cArr2[i5]) & 3167490297675737264L);
                }
            }
            int i7 = $11 + 49;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        char c2 = (char) (3167490297675737264L ^ ((long) AFKeystoreWrapper));
        char[] cArr4 = new char[i2];
        if ((i2 % 2 != 0 ? (char) 1 : 'R') != 'R') {
            int i9 = $10 + 31;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                i3 = i2 + 34;
                cArr4[i3] = (char) (cArr[i3] << b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i10 = $10 + 3;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            aFk1qSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i12 = aFk1qSDK.getCurrencyIso4217Code;
                if (i12 >= i3) {
                    break;
                }
                int i13 = $11 + 41;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                char c3 = cArr[i12];
                aFk1qSDK.getMediationNetwork = c3;
                char c4 = cArr[i12 + 1];
                aFk1qSDK.getRevenue = c4;
                if (c3 == c4) {
                    cArr4[i12] = (char) (c3 - b2);
                    cArr4[i12 + 1] = (char) (c4 - b2);
                } else {
                    int i15 = c3 / c2;
                    aFk1qSDK.AFAdRevenueData = i15;
                    int i16 = c3 % c2;
                    aFk1qSDK.areAllFieldsValid = i16;
                    int i17 = c4 / c2;
                    aFk1qSDK.getMonetizationNetwork = i17;
                    int i18 = c4 % c2;
                    aFk1qSDK.component4 = i18;
                    if (i16 == i18) {
                        int i19 = ((i15 + c2) - 1) % c2;
                        aFk1qSDK.AFAdRevenueData = i19;
                        int i20 = ((i17 + c2) - 1) % c2;
                        aFk1qSDK.getMonetizationNetwork = i20;
                        cArr4[i12] = cArr2[(i19 * c2) + i16];
                        cArr4[i12 + 1] = cArr2[(i20 * c2) + i18];
                    } else if ((i15 == i17 ? '?' : 'C') != 'C') {
                        int i21 = ((i16 + c2) - 1) % c2;
                        aFk1qSDK.areAllFieldsValid = i21;
                        int i22 = ((i18 + c2) - 1) % c2;
                        aFk1qSDK.component4 = i22;
                        cArr4[i12] = cArr2[(i15 * c2) + i21];
                        cArr4[i12 + 1] = cArr2[(i17 * c2) + i22];
                    } else {
                        cArr4[i12] = cArr2[(i15 * c2) + i18];
                        cArr4[i12 + 1] = cArr2[(i17 * c2) + i16];
                    }
                }
                aFk1qSDK.getCurrencyIso4217Code = i12 + 2;
            }
        }
        for (int i23 = 0; i23 < i2; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private void copy() {
        getRevenue(new Object[]{this}, 1340322794, -1340322794, System.identityHashCode(this));
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i2, int i3, int i4) {
        AFf1cSDK aFf1cSDK = (AFf1cSDK) objArr[0];
        int i5 = AFInAppEventParameterName + 95;
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        ((AFf1eSDK) aFf1cSDK).toString.getRevenue("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i7 = AFInAppEventParameterName + 9;
        valueOf = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void AFAdRevenueData(AFa1oSDK aFa1oSDK) {
        int i2 = AFInAppEventParameterName + 17;
        valueOf = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 24 : (char) 11) != 11) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void component2(AFa1oSDK aFa1oSDK) {
        int i2 = AFInAppEventParameterName + 9;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        String monetizationNetwork = this.hashCode.getMonetizationNetwork();
        if ((monetizationNetwork != null ? (char) 6 : '6') != 6) {
            return;
        }
        aFa1oSDK.getCurrencyIso4217Code("advertiserId", monetizationNetwork);
        int i4 = AFInAppEventParameterName + 23;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFf1eSDK, com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        int i2 = valueOf + 51;
        int i3 = i2 % 128;
        AFInAppEventParameterName = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        super.getCurrencyIso4217Code(aFa1oSDK);
        Context context = this.copydefault.AFAdRevenueData;
        AFb1rSDK revenue = AFb1rSDK.getRevenue();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (revenue.AFAdRevenueData()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            aFa1oSDK.getCurrencyIso4217Code("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1oSDK.getCurrencyIso4217Code("app_version_name", packageInfo.versionName);
            aFa1oSDK.getCurrencyIso4217Code("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1oSDK.getCurrencyIso4217Code("installDate", AFb1rSDK.getCurrencyIso4217Code(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.AFInAppEventType.getCurrencyIso4217Code(aFa1oSDK.getMonetizationNetwork());
        aFa1oSDK.getMonetizationNetwork().remove("ivc");
        String currencyIso4217Code = AFb1rSDK.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            aFa1oSDK.getCurrencyIso4217Code("appUserId", currencyIso4217Code);
            int i2 = AFInAppEventParameterName + 97;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
        }
        try {
            aFa1oSDK.getCurrencyIso4217Code("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a(KeyEvent.getDeadChar(0, 0) + 5, (byte) (51 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u0001\u0002\b\u0005㘱", objArr);
            aFa1oSDK.getCurrencyIso4217Code(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (!(!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false))) {
            aFa1oSDK.getCurrencyIso4217Code(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFb1tSDK aFb1tSDKB_ = AFb1vSDK.b_(context.getContentResolver());
        if ((aFb1tSDKB_ != null ? (char) 25 : 'Z') != 'Z') {
            aFa1oSDK.getCurrencyIso4217Code("amazon_aid", aFb1tSDKB_.getRevenue);
            aFa1oSDK.getCurrencyIso4217Code("amazon_aid_limit", String.valueOf(aFb1tSDKB_.AFAdRevenueData));
        }
        AFg1wSDK aFg1wSDK = this.component1;
        aFa1oSDK.getCurrencyIso4217Code("devkey", (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK)));
        aFa1oSDK.getCurrencyIso4217Code("uid", AFb1iSDK.getCurrencyIso4217Code(this.copydefault, ((AFf1eSDK) this).toString));
        aFa1oSDK.getCurrencyIso4217Code("af_gcm_token", this.copy);
        aFa1oSDK.getCurrencyIso4217Code("launch_counter", Integer.toString(((AFf1eSDK) this).toString.getMediationNetwork("appsFlyerCount", 0)));
        aFa1oSDK.getCurrencyIso4217Code("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String strComponent4 = this.hashCode.component4();
        if (strComponent4 != null) {
            aFa1oSDK.getCurrencyIso4217Code(AppsFlyerProperties.CHANNEL, strComponent4);
            int i4 = AFInAppEventParameterName + 25;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getMediationNetwork(AFa1oSDK aFa1oSDK) {
        int i2 = valueOf + 5;
        AFInAppEventParameterName = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        int i2 = AFInAppEventParameterName + 33;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        int i2 = valueOf + 49;
        AFInAppEventParameterName = i2 % 128;
        int i3 = i2 % 2;
        super.getRevenue();
        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
        if ((responseNetwork != null ? '^' : (char) 28) != 28) {
            if ((responseNetwork.isSuccessful() ? (char) 22 : (char) 21) != 22) {
                return;
            }
            int i4 = AFInAppEventParameterName + 43;
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                getRevenue(new Object[]{this}, 1340322794, -1340322794, System.identityHashCode(this));
            } else {
                getRevenue(new Object[]{this}, 1340322794, -1340322794, System.identityHashCode(this));
                throw null;
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getRevenue(AFa1oSDK aFa1oSDK) {
        int i2 = valueOf + 97;
        AFInAppEventParameterName = i2 % 128;
        if ((i2 % 2 != 0 ? 'c' : 'F') != 'c') {
            return;
        }
        int i3 = 38 / 0;
    }
}
