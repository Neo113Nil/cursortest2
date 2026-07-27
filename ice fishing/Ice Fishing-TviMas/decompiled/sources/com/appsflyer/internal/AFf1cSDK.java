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
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes4.dex */
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

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        AFf1cSDK aFf1cSDK = (AFf1cSDK) objArr[0];
        int i4 = 2 % 2;
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

    public AFf1cSDK(String str, AFd1kSDK aFd1kSDK) {
        super(new AFg1lSDK(aFd1kSDK.values().AFAdRevenueData), aFd1kSDK, str);
        this.hashCode = aFd1kSDK.getMediationNetwork();
        this.copydefault = aFd1kSDK.values();
        this.copy = str;
        this.AFInAppEventType = aFd1kSDK.component1();
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        int i = 2 % 2;
        int i2 = valueOf + 49;
        AFInAppEventParameterName = i2 % 128;
        int i3 = i2 % 2;
        super.getRevenue();
        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
        if (responseNetwork == null || !responseNetwork.isSuccessful()) {
            return;
        }
        int i4 = AFInAppEventParameterName + 43;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            getRevenue(new Object[]{this}, 1340322794, -1340322794, System.identityHashCode(this));
            return;
        }
        getRevenue(new Object[]{this}, 1340322794, -1340322794, System.identityHashCode(this));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    protected final void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        int i = 2 % 2;
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
            aFa1oSDK.getCurrencyIso4217Code(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
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
            if (i2 % 2 == 0) {
                int i3 = 5 % 4;
            }
        }
        try {
            aFa1oSDK.getCurrencyIso4217Code(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
            Object[] objArr = new Object[1];
            a(KeyEvent.getDeadChar(0, 0) + 5, (byte) (51 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u0001\u0002\b\u0005㘱", objArr);
            aFa1oSDK.getCurrencyIso4217Code(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (!(!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false))) {
            aFa1oSDK.getCurrencyIso4217Code(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        AFb1tSDK b_ = AFb1vSDK.b_(context.getContentResolver());
        if (b_ != null) {
            aFa1oSDK.getCurrencyIso4217Code("amazon_aid", b_.getRevenue);
            aFa1oSDK.getCurrencyIso4217Code("amazon_aid_limit", String.valueOf(b_.AFAdRevenueData));
        }
        AFg1wSDK aFg1wSDK = this.component1;
        aFa1oSDK.getCurrencyIso4217Code("devkey", (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK)));
        aFa1oSDK.getCurrencyIso4217Code("uid", AFb1iSDK.getCurrencyIso4217Code(this.copydefault, ((AFf1eSDK) this).toString));
        aFa1oSDK.getCurrencyIso4217Code("af_gcm_token", this.copy);
        aFa1oSDK.getCurrencyIso4217Code("launch_counter", Integer.toString(((AFf1eSDK) this).toString.getMediationNetwork("appsFlyerCount", 0)));
        aFa1oSDK.getCurrencyIso4217Code(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        String component4 = this.hashCode.component4();
        if (component4 != null) {
            aFa1oSDK.getCurrencyIso4217Code(AppsFlyerProperties.CHANNEL, component4);
            int i4 = AFInAppEventParameterName + 25;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    protected final void component2(AFa1oSDK aFa1oSDK) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 9;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        String monetizationNetwork = this.hashCode.getMonetizationNetwork();
        if (monetizationNetwork != null) {
            aFa1oSDK.getCurrencyIso4217Code("advertiserId", monetizationNetwork);
            int i4 = AFInAppEventParameterName + 23;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK, com.appsflyer.internal.AFf1oSDK
    protected final boolean copydefault() {
        int i = 2 % 2;
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
    protected final void getMediationNetwork(AFa1oSDK aFa1oSDK) {
        int i = 2 % 2;
        int i2 = valueOf + 5;
        AFInAppEventParameterName = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    protected final void getRevenue(AFa1oSDK aFa1oSDK) {
        int i = 2 % 2;
        int i2 = valueOf + 97;
        AFInAppEventParameterName = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    protected final void AFAdRevenueData(AFa1oSDK aFa1oSDK) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 17;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    protected final void getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 33;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int i, byte b, String str, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        char[] cArr = str;
        if (str != null) {
            int i4 = $11 + 37;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr3 = values;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = $10 + 71;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr4[i5] = (char) (cArr3[i5] & 3167490297675737264L);
                } else {
                    cArr4[i5] = (char) (cArr3[i5] ^ 3167490297675737264L);
                }
            }
            int i7 = $11 + 49;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr3 = cArr4;
        }
        char c = (char) (3167490297675737264L ^ AFKeystoreWrapper);
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i9 = $10 + 31;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                i2 = i + 34;
                cArr5[i2] = (char) (cArr2[i2] << b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr2[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i10 = $10 + 3;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            aFk1qSDK.getCurrencyIso4217Code = 0;
            while (aFk1qSDK.getCurrencyIso4217Code < i2) {
                int i12 = $11 + 41;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                aFk1qSDK.getMediationNetwork = cArr2[aFk1qSDK.getCurrencyIso4217Code];
                aFk1qSDK.getRevenue = cArr2[aFk1qSDK.getCurrencyIso4217Code + 1];
                if (aFk1qSDK.getMediationNetwork == aFk1qSDK.getRevenue) {
                    cArr5[aFk1qSDK.getCurrencyIso4217Code] = (char) (aFk1qSDK.getMediationNetwork - b);
                    cArr5[aFk1qSDK.getCurrencyIso4217Code + 1] = (char) (aFk1qSDK.getRevenue - b);
                } else {
                    aFk1qSDK.AFAdRevenueData = aFk1qSDK.getMediationNetwork / c;
                    aFk1qSDK.areAllFieldsValid = aFk1qSDK.getMediationNetwork % c;
                    aFk1qSDK.getMonetizationNetwork = aFk1qSDK.getRevenue / c;
                    aFk1qSDK.component4 = aFk1qSDK.getRevenue % c;
                    if (aFk1qSDK.areAllFieldsValid == aFk1qSDK.component4) {
                        aFk1qSDK.AFAdRevenueData = ((aFk1qSDK.AFAdRevenueData + c) - 1) % c;
                        aFk1qSDK.getMonetizationNetwork = ((aFk1qSDK.getMonetizationNetwork + c) - 1) % c;
                        int i14 = (aFk1qSDK.AFAdRevenueData * c) + aFk1qSDK.areAllFieldsValid;
                        int i15 = (aFk1qSDK.getMonetizationNetwork * c) + aFk1qSDK.component4;
                        cArr5[aFk1qSDK.getCurrencyIso4217Code] = cArr3[i14];
                        cArr5[aFk1qSDK.getCurrencyIso4217Code + 1] = cArr3[i15];
                    } else if (aFk1qSDK.AFAdRevenueData == aFk1qSDK.getMonetizationNetwork) {
                        aFk1qSDK.areAllFieldsValid = ((aFk1qSDK.areAllFieldsValid + c) - 1) % c;
                        aFk1qSDK.component4 = ((aFk1qSDK.component4 + c) - 1) % c;
                        int i16 = (aFk1qSDK.AFAdRevenueData * c) + aFk1qSDK.areAllFieldsValid;
                        int i17 = (aFk1qSDK.getMonetizationNetwork * c) + aFk1qSDK.component4;
                        cArr5[aFk1qSDK.getCurrencyIso4217Code] = cArr3[i16];
                        cArr5[aFk1qSDK.getCurrencyIso4217Code + 1] = cArr3[i17];
                    } else {
                        int i18 = (aFk1qSDK.AFAdRevenueData * c) + aFk1qSDK.component4;
                        int i19 = (aFk1qSDK.getMonetizationNetwork * c) + aFk1qSDK.areAllFieldsValid;
                        cArr5[aFk1qSDK.getCurrencyIso4217Code] = cArr3[i18];
                        cArr5[aFk1qSDK.getCurrencyIso4217Code + 1] = cArr3[i19];
                    }
                }
                aFk1qSDK.getCurrencyIso4217Code += 2;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr5[i20] = (char) (cArr5[i20] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    private void copy() {
        getRevenue(new Object[]{this}, 1340322794, -1340322794, System.identityHashCode(this));
    }
}
