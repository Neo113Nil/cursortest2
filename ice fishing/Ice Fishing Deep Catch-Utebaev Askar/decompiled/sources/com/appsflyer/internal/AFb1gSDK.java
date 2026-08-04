package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1gSDK implements AFb1cSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int AFAdRevenueData;
    private static long component2 = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static int copydefault;
    private static char equals;
    private final AFd1kSDK component3;
    private List<String> getCurrencyIso4217Code = new ArrayList();
    private boolean getMediationNetwork = true;
    private final Map<String, Object> getRevenue = new HashMap();
    private boolean component1 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean areAllFieldsValid = false;

    static {
        component2();
        AFAdRevenueData = 98166;
        int i2 = copy + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public AFb1gSDK(AFd1kSDK aFd1kSDK) {
        this.component3 = aFd1kSDK;
    }

    private static void a(char c2, String str, String str2, String str3, int i2, Object[] objArr) {
        char[] charArray;
        if (str3 != null) {
            int i3 = $10 + 117;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] cArr2 = (char[]) ((str2 != null ? 'V' : (char) 7) != 'V' ? str2 : str2.toCharArray());
        char[] cArr3 = (char[]) ((str != null ? (char) 1 : 'F') != 1 ? str : str.toCharArray());
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        aFk1sSDK.getMediationNetwork = 0;
        while (true) {
            int i4 = aFk1sSDK.getMediationNetwork;
            if (i4 >= length3) {
                break;
            }
            int i5 = $10 + 63;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = (i4 + 3) % 4;
            int i8 = cArr4[i4 % 4] * 32718;
            char c3 = cArr5[(i4 + 2) % 4];
            char c4 = (char) ((i8 + c3) % 65535);
            aFk1sSDK.getMonetizationNetwork = c4;
            cArr5[i7] = (char) (((cArr4[i7] * 32718) + c3) / 65535);
            cArr4[i7] = c4;
            cArr6[i4] = (char) (((((long) (cArr2[i4] ^ c4)) ^ (component2 ^ 4316357171685541830L)) ^ ((long) ((int) (((long) component4) ^ 4316357171685541830L)))) ^ ((long) ((char) (((long) equals) ^ 4316357171685541830L))));
            aFk1sSDK.getMediationNetwork = i4 + 1;
        }
        String str4 = new String(cArr6);
        int i9 = $11 + 25;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    private static String component1() {
        int i2 = copydefault;
        int i3 = i2 + 71;
        copy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        copy = i5 % 128;
        if ((i5 % 2 == 0 ? ')' : 'Z') == 'Z') {
            return "6.15.2";
        }
        throw null;
    }

    public static void component2() {
        component2 = -7965111987969810777L;
        component4 = -2046375994;
        equals = (char) 51142;
    }

    private static float component3() {
        float fNextFloat = new Random().nextFloat();
        int i2 = copy + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return fNextFloat;
        }
        int i3 = 1 / 0;
        return fNextFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        if (r8.areAllFieldsValid != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void component4() {
        int i2 = copydefault + 23;
        copy = i2 % 128;
        if ((i2 % 2 == 0 ? 'N' : 'A') != 'N') {
            if (this.areAllFieldsValid) {
                return;
            }
            this.areAllFieldsValid = true;
            try {
                getMonetizationNetwork("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                int i3 = copydefault + 45;
                copy = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
                return;
            }
        }
        int i4 = 93 / 0;
        throw th;
    }

    private synchronized Map<String, Object> copy() {
        int i2 = copydefault + 3;
        copy = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 16 : (char) 22) == 16) {
            this.getRevenue.put("data", this.getCurrencyIso4217Code);
            copydefault();
            throw null;
        }
        this.getRevenue.put("data", this.getCurrencyIso4217Code);
        copydefault();
        return this.getRevenue;
    }

    private synchronized void copydefault() {
        this.getCurrencyIso4217Code = new ArrayList();
        this.getMonetizationNetwork = 0;
        int i2 = copy + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private boolean equals() {
        int i2 = copy;
        int i3 = i2 + 105;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.component1)) {
            int i5 = i2 + 123;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            if ((!this.getMediationNetwork ? '#' : (char) 11) != '#' || this.areAllFieldsValid) {
                int i7 = i2 + 41;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String message;
        StackTraceElement[] stackTrace;
        AFb1gSDK aFb1gSDK = (AFb1gSDK) objArr[0];
        Throwable th = (Throwable) objArr[1];
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (!(cause == null)) {
            message = cause.getMessage();
        } else {
            message = th.getMessage();
            int i2 = copy + 27;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!(cause == null)) {
            stackTrace = cause.getStackTrace();
        } else {
            int i4 = copydefault + 33;
            copy = i4 % 128;
            int i5 = i4 % 2;
            stackTrace = th.getStackTrace();
            if (i5 == 0) {
                int i6 = 50 / 0;
            }
        }
        aFb1gSDK.getMonetizationNetwork("exception", simpleName, getRevenue(message, stackTrace));
        int i7 = copydefault + 15;
        copy = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static AFi1uSDK getRevenue(AFi1vSDK aFi1vSDK) {
        return (AFi1uSDK) getMonetizationNetwork(new Object[]{aFi1vSDK}, 1236177641, -1236177638, (int) System.currentTimeMillis());
    }

    private Map<String, Object> l_(String str, PackageManager packageManager) {
        int i2 = copydefault + 65;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m_(str, packageManager, this.component3.AFKeystoreWrapper(), this.component3.e());
        Map<String, Object> mapCopy = copy();
        int i4 = copydefault + 89;
        copy = i4 % 128;
        if ((i4 % 2 == 0 ? 'T' : '(') != 'T') {
            return mapCopy;
        }
        throw null;
    }

    private synchronized void m_(String str, PackageManager packageManager, AFg1wSDK aFg1wSDK, AFd1tSDK aFd1tSDK) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.getRevenue.clear();
        if (string != null) {
            try {
                this.getRevenue.putAll(AFa1mSDK.getRevenue(new JSONObject(string)));
                int i2 = copydefault + 59;
                copy = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable unused) {
            }
        } else {
            AFb1rSDK revenue = AFb1rSDK.getRevenue();
            AFh1pSDK aFh1pSDK = AFb1rSDK.getRevenue().getMonetizationNetwork().getMediationNetwork().AFAdRevenueData.component4;
            String str2 = null;
            AFb1tSDK aFb1tSDK = aFh1pSDK != null ? new AFb1tSDK(aFh1pSDK.getMonetizationNetwork, aFh1pSDK.AFAdRevenueData) : null;
            if ((aFb1tSDK != null ? 'J' : 'D') != 'D') {
                int i4 = copy + 3;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                str2 = aFb1tSDK.getRevenue;
            }
            getMediationNetwork(str2, aFg1wSDK.getRevenue(), aFd1tSDK.getRevenue);
            StringBuilder sb = new StringBuilder("6.15.2.");
            sb.append(AFb1rSDK.getCurrencyIso4217Code);
            String string2 = sb.toString();
            AFg1wSDK aFg1wSDKAFKeystoreWrapper = revenue.getMonetizationNetwork().AFKeystoreWrapper();
            getRevenue(string2, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKAFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDKAFKeystoreWrapper)), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                AFAdRevenueData(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getRevenue).toString());
        }
        this.getRevenue.put("launch_counter", String.valueOf(this.component3.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0)));
    }

    private void valueOf() {
        int i2 = copy + 107;
        copydefault = i2 % 128;
        if ((i2 % 2 != 0 ? 'U' : 'Q') == 'U') {
            this.component3.getRevenue().AFAdRevenueData("participantInProxy");
            throw null;
        }
        this.component3.getRevenue().AFAdRevenueData("participantInProxy");
        int i3 = copydefault + 89;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    private boolean values() {
        int i2 = copy + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean mediationNetwork = this.component3.getRevenue().getMediationNetwork("participantInProxy");
        int i4 = copy + 101;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return mediationNetwork;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final synchronized void AFAdRevenueData() {
        if (!(this.areAllFieldsValid)) {
            int i2 = copy;
            int i3 = i2 + 53;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if (!this.getMediationNetwork) {
                int i5 = i2 + 7;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                } else {
                    throw null;
                }
            }
            throw th;
        }
        this.areAllFieldsValid = false;
        this.getMediationNetwork = false;
        try {
            getMonetizationNetwork("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final boolean areAllFieldsValid() {
        int i2 = copy + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.areAllFieldsValid;
        int i4 = i3 + 45;
        copy = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return z;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i2 = copydefault + 25;
        copy = i2 % 128;
        String[] strArr = {str2};
        if ((i2 % 2 == 0 ? 'L' : '0') != '0') {
            getMonetizationNetwork(null, str, strArr);
        } else {
            getMonetizationNetwork(null, str, strArr);
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final synchronized void getMediationNetwork() {
        int i2 = copydefault + 19;
        copy = i2 % 128;
        if ((i2 % 2 == 0 ? 'O' : (char) 26) != 'O') {
            this.getMediationNetwork = false;
            getMonetizationNetwork();
        } else {
            this.getMediationNetwork = false;
            getMonetizationNetwork();
        }
        copydefault();
        int i3 = copy + 23;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        int i4 = 73 / 0;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void k_(String str, PackageManager packageManager) {
        getMonetizationNetwork(new Object[]{this, str, packageManager}, 1187970804, -1187970802, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {, blocks: (B:19:0x002f, B:27:0x004d, B:32:0x005d, B:35:0x006d), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006d A[Catch: all -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:19:0x002f, B:27:0x004d, B:32:0x005d, B:35:0x006d), top: B:45:0x002f }] */
    private synchronized void AFAdRevenueData(String str, String str2, String str3, String str4) {
        boolean z;
        if (str != null) {
            try {
                if ((str.length() > 0 ? ']' : 'V') != 'V') {
                    this.getRevenue.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        boolean z2 = false;
        if (str2 == null) {
            if (str3 != null) {
                z = false;
            } else {
                z = true;
            }
            if (!z && str3.length() > 0) {
                this.getRevenue.put(AppsFlyerProperties.CHANNEL, str3);
                int i2 = copydefault + 61;
                copy = i2 % 128;
                int i3 = i2 % 2;
            }
            if (str4 != null) {
                z2 = true;
            }
            if (!z2) {
                int i4 = copy + 41;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                if (str4.length() > 0) {
                    int i6 = copydefault + 57;
                    copy = i6 % 128;
                    int i7 = i6 % 2;
                    this.getRevenue.put("preInstall", str4);
                }
            }
        } else {
            if (str2.length() > 0) {
                this.getRevenue.put("app_version", str2);
                int i8 = copy + 97;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
            }
            if (str3 != null) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                this.getRevenue.put(AppsFlyerProperties.CHANNEL, str3);
                int i10 = copydefault + 61;
                copy = i10 % 128;
                int i11 = i10 % 2;
            }
            if (str4 != null) {
                z2 = true;
            }
            if (!z2) {
                int i12 = copy + 41;
                copydefault = i12 % 128;
                int i13 = i12 % 2;
                if (str4.length() > 0) {
                    int i14 = copydefault + 57;
                    copy = i14 % 128;
                    int i15 = i14 % 2;
                    this.getRevenue.put("preInstall", str4);
                }
            }
        }
        throw th;
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i2, int i3, int i4) {
        int i5 = ~((~i2) | i3);
        int i6 = (((~(i2 | i4)) | (~((~i3) | i2)) | i5) * 70) + ((~(i2 | i3 | i4)) * 70) + (((~(i3 | i4)) | i5) * (-140)) + (i3 * (-69)) + (i2 * 71);
        if (i6 == 1) {
            return getMonetizationNetwork(objArr);
        }
        if (i6 == 2) {
            return getRevenue(objArr);
        }
        if (i6 != 3) {
            float fFloatValue = ((Number) objArr[0]).floatValue();
            double d2 = fFloatValue;
            if ((d2 >= 1.0d ? (char) 14 : 'Y') != 14) {
                if ((d2 <= 0.0d ? 'P' : '<') == 'P') {
                    int i7 = copydefault + 111;
                    copy = i7 % 128;
                    int i8 = i7 % 2;
                } else if (component3() <= fFloatValue) {
                    int i9 = copydefault + 121;
                    copy = i9 % 128;
                    int i10 = i9 % 2;
                }
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        AFi1vSDK aFi1vSDK = (AFi1vSDK) objArr[0];
        int i11 = copy;
        int i12 = i11 + 43;
        copydefault = i12 % 128;
        int i13 = i12 % 2;
        if ((aFi1vSDK != null ? '%' : '*') == '%') {
            AFh1cSDK aFh1cSDK = aFi1vSDK.getRevenue;
            if ((aFh1cSDK != null ? '2' : '!') != '!') {
                return aFh1cSDK.getCurrencyIso4217Code;
            }
        }
        int i14 = i11 + 15;
        copydefault = i14 % 128;
        int i15 = i14 % 2;
        return null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1gSDK aFb1gSDK = (AFb1gSDK) objArr[0];
        String str = (String) objArr[1];
        PackageManager packageManager = (PackageManager) objArr[2];
        int i2 = copy + 107;
        copydefault = i2 % 128;
        try {
            if (!(i2 % 2 == 0)) {
                Map<String, Object> mapL_ = aFb1gSDK.l_(str, packageManager);
                AFg1wSDK aFg1wSDKAFKeystoreWrapper = aFb1gSDK.component3.AFKeystoreWrapper();
                aFb1gSDK.component3.getCurrencyIso4217Code().AFAdRevenueData(mapL_, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKAFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDKAFKeystoreWrapper)));
                throw null;
            }
            Map<String, Object> mapL_2 = aFb1gSDK.l_(str, packageManager);
            AFg1wSDK aFg1wSDKAFKeystoreWrapper2 = aFb1gSDK.component3.AFKeystoreWrapper();
            AFe1ySDK aFe1ySDKAFAdRevenueData = aFb1gSDK.component3.getCurrencyIso4217Code().AFAdRevenueData(mapL_2, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKAFKeystoreWrapper2}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDKAFKeystoreWrapper2)));
            if (aFe1ySDKAFAdRevenueData != null) {
                aFb1gSDK.component3.getMonetizationNetwork().execute(new a(0, aFe1ySDKAFAdRevenueData));
                return null;
            }
            AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
            int i3 = copydefault + 1;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final boolean getCurrencyIso4217Code() {
        int i2;
        int i3 = copy + 53;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean mediationNetwork = getMediationNetwork((AFi1uSDK) getMonetizationNetwork(new Object[]{this.component3.component2().getCurrencyIso4217Code.getRevenue}, 1236177641, -1236177638, (int) System.currentTimeMillis()), (AFi1uSDK) getMonetizationNetwork(new Object[]{this.component3.component2().getCurrencyIso4217Code.AFAdRevenueData}, 1236177641, -1236177638, (int) System.currentTimeMillis()));
        if ((mediationNetwork ? '\b' : '1') != '1') {
            component4();
            i2 = copydefault + 25;
        } else {
            getMediationNetwork();
            AFAdRevenueData();
            i2 = copydefault + 91;
        }
        copy = i2 % 128;
        int i5 = i2 % 2;
        return mediationNetwork;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getMediationNetwork(String str, int i2, String str2) {
        int i3 = copydefault + 63;
        copy = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork("server_response", str, String.valueOf(i2), str2);
        int i5 = copy + 39;
        copydefault = i5 % 128;
        if (!(i5 % 2 == 0)) {
            int i6 = 20 / 0;
        }
    }

    private static boolean getCurrencyIso4217Code(float f2) {
        return ((Boolean) getMonetizationNetwork(new Object[]{Float.valueOf(f2)}, 169076754, -169076754, (int) System.currentTimeMillis())).booleanValue();
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getMediationNetwork(String str, String str2) {
        int i2 = copy + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork("server_request", str, str2);
        int i4 = copy + 61;
        copydefault = i4 % 128;
        if ((i4 % 2 != 0 ? 'a' : 'V') != 'V') {
            int i5 = 90 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final synchronized void getMonetizationNetwork() {
        int i2 = copy + 115;
        copydefault = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 6 : (char) 27) != 6) {
            this.getRevenue.clear();
            this.getCurrencyIso4217Code.clear();
        } else {
            this.getRevenue.clear();
            this.getCurrencyIso4217Code.clear();
        }
        this.getMonetizationNetwork = 0;
        int i3 = copydefault + 21;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getRevenue() {
        int i2 = copydefault + 41;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
        }
        this.component1 = false;
    }

    private boolean getCurrencyIso4217Code(String str) {
        if ((AFc1sSDK.getMonetizationNetwork(str) ? 'Y' : (char) 11) != 11) {
            int i2 = copydefault + 57;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        Context context = this.component3.getMediationNetwork().getMonetizationNetwork.AFAdRevenueData;
        boolean zEquals = str.equals(AFb1qSDK.getMediationNetwork(context, context.getPackageName()));
        int i4 = copydefault + 31;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return zEquals;
    }

    private synchronized void getMediationNetwork(String str, String str2, String str3) {
        int i2 = copy + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            Map<String, Object> map = this.getRevenue;
            Object[] objArr = new Object[1];
            a((char) ((-16733443) - Color.rgb(0, 0, 0)), "鰒冷ﵪ\ue6aa", "쩽缤䈽\ufade쏟", "奡雜ﬣꪐ", 1783740316 - View.getDefaultSize(0, 0), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getRevenue.put("model", Build.MODEL);
            this.getRevenue.put("platform", "Android");
            this.getRevenue.put("platform_version", Build.VERSION.RELEASE);
            if ((str != null ? (char) 23 : ']') != ']') {
                int i4 = copy + 93;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    str.length();
                    throw null;
                }
                if (str.length() > 0) {
                    this.getRevenue.put("advertiserId", str);
                }
            }
            if (str2 != null) {
                int i5 = copydefault + 101;
                copy = i5 % 128;
                int i6 = i5 % 2;
                if (str2.length() > 0) {
                    this.getRevenue.put("imei", str2);
                }
            }
            if ((str3 != null ? ' ' : (char) 5) != 5 && str3.length() > 0) {
                int i7 = copy + 97;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    this.getRevenue.put("android_id", str3);
                    throw null;
                }
                this.getRevenue.put("android_id", str3);
            }
            int i8 = copydefault + 85;
            copy = i8 % 128;
            int i9 = i8 % 2;
        } catch (Throwable unused) {
        }
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String... strArr) {
        String string;
        int i2 = copy + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if ((equals() ? '\"' : 'B') == 'B' || this.getMonetizationNetwork >= 98304) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strJoin = TextUtils.join(", ", strArr);
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(jCurrentTimeMillis);
                sb.append(" ");
                sb.append(Thread.currentThread().getId());
                sb.append(" _/AppsFlyer_6.15.2 [");
                sb.append(str);
                sb.append("] ");
                sb.append(str2);
                sb.append(" ");
                sb.append(strJoin);
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jCurrentTimeMillis);
                sb2.append(" ");
                sb2.append(Thread.currentThread().getId());
                sb2.append(" ");
                sb2.append(str2);
                sb2.append("/AppsFlyer_6.15.2 ");
                sb2.append(strJoin);
                string = sb2.toString();
            }
            int length = this.getMonetizationNetwork + (string.length() << 1);
            int i4 = AFAdRevenueData;
            char c2 = length > i4 ? (char) 19 : 'B';
            boolean z = false;
            if (c2 == 19) {
                string = string.substring(0, (i4 - this.getMonetizationNetwork) / 2);
                z = true;
            }
            this.getCurrencyIso4217Code.add(string);
            this.getMonetizationNetwork += string.length() << 1;
            if (z) {
                int i5 = copydefault + 43;
                copy = i5 % 128;
                if (i5 % 2 == 0) {
                    this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                    this.getMonetizationNetwork += 24700;
                } else {
                    this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                    this.getMonetizationNetwork += 138;
                }
                int i6 = copy + 37;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = copydefault + 55;
            copy = i8 % 128;
            if (i8 % 2 != 0) {
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:12:0x001a, B:25:0x0044, B:37:0x0068, B:44:0x0087), top: B:53:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x0001, B:5:0x000b, B:18:0x002d, B:19:0x0035, B:20:0x003d, B:26:0x004e, B:28:0x0054, B:38:0x0072, B:43:0x0080), top: B:52:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:12:0x001a, B:25:0x0044, B:37:0x0068, B:44:0x0087), top: B:53:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x0001, B:5:0x000b, B:18:0x002d, B:19:0x0035, B:20:0x003d, B:26:0x004e, B:28:0x0054, B:38:0x0072, B:43:0x0080), top: B:52:0x0001 }] */
    private synchronized void getRevenue(String str, String str2, String str3, String str4) {
        char c2;
        char c3;
        try {
            this.getRevenue.put("sdk_version", str);
            if (str2 == null) {
                if (str3 != null) {
                    int i2 = copy + 51;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    if (str3.length() > 0) {
                        this.getRevenue.put("originalAppsFlyerId", str3);
                    }
                }
                if (str4 != null) {
                    c2 = '9';
                } else {
                    c2 = 'G';
                }
                if (c2 != 'G') {
                    int i4 = copydefault + 77;
                    copy = i4 % 128;
                    int i5 = i4 % 2;
                    if (str4.length() > 0) {
                        c3 = ',';
                    } else {
                        c3 = ';';
                    }
                    if (c3 != ';') {
                        this.getRevenue.put("uid", str4);
                        int i6 = copy + 83;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
            } else {
                if ((str2.length() > 0 ? '-' : (char) 26) != '-') {
                    if (str3 != null) {
                        int i8 = copy + 51;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                        if (str3.length() > 0) {
                            this.getRevenue.put("originalAppsFlyerId", str3);
                        }
                    }
                    if (str4 != null) {
                        c2 = '9';
                    } else {
                        c2 = 'G';
                    }
                    if (c2 != 'G') {
                        int i10 = copydefault + 77;
                        copy = i10 % 128;
                        int i11 = i10 % 2;
                        if (str4.length() > 0) {
                            c3 = ',';
                        } else {
                            c3 = ';';
                        }
                        if (c3 != ';') {
                            this.getRevenue.put("uid", str4);
                            int i12 = copy + 83;
                            copydefault = i12 % 128;
                            int i13 = i12 % 2;
                        }
                    }
                } else {
                    int i14 = copy + 55;
                    copydefault = i14 % 128;
                    if ((i14 % 2 != 0 ? (char) 1 : 'Y') != 'Y') {
                        this.getRevenue.put("devkey", str2);
                        throw null;
                    }
                    this.getRevenue.put("devkey", str2);
                    if (str3 != null) {
                        int i15 = copy + 51;
                        copydefault = i15 % 128;
                        int i16 = i15 % 2;
                        if (str3.length() > 0) {
                            this.getRevenue.put("originalAppsFlyerId", str3);
                        }
                    }
                    if (str4 != null) {
                        c2 = '9';
                    } else {
                        c2 = 'G';
                    }
                    if (c2 != 'G') {
                        int i17 = copydefault + 77;
                        copy = i17 % 128;
                        int i18 = i17 % 2;
                        if (str4.length() > 0) {
                            c3 = ',';
                        } else {
                            c3 = ';';
                        }
                        if (c3 != ';') {
                            this.getRevenue.put("uid", str4);
                            int i19 = copy + 83;
                            copydefault = i19 % 128;
                            int i110 = i19 % 2;
                        }
                    }
                }
            }
            throw th;
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getMediationNetwork(String str, String... strArr) {
        int i2 = copydefault + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork("public_api_call", str, strArr);
        int i4 = copydefault + 107;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getRevenue(Throwable th) {
        getMonetizationNetwork(new Object[]{this, th}, 353230021, -353230020, System.identityHashCode(this));
    }

    private void getMediationNetwork(boolean z) {
        int i2 = copy + 79;
        copydefault = i2 % 128;
        if (!(i2 % 2 == 0)) {
            this.component3.getRevenue().getRevenue("participantInProxy", z);
            throw null;
        }
        this.component3.getRevenue().getRevenue("participantInProxy", z);
        int i3 = copydefault + 3;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    private boolean getRevenue(AFi1uSDK aFi1uSDK, AFi1uSDK aFi1uSDK2) {
        boolean currencyIso4217Code;
        int i2 = copy + 47;
        copydefault = i2 % 128;
        if ((i2 % 2 != 0 ? 'K' : 'W') != 'W') {
            aFi1uSDK.equals(aFi1uSDK2);
            throw null;
        }
        if (aFi1uSDK.equals(aFi1uSDK2)) {
            int i3 = copy + 119;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            currencyIso4217Code = values();
        } else {
            currencyIso4217Code = getCurrencyIso4217Code(aFi1uSDK.getMonetizationNetwork);
            getMediationNetwork(currencyIso4217Code);
        }
        int i5 = copy + 39;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    private synchronized boolean getMediationNetwork(AFi1uSDK aFi1uSDK, AFi1uSDK aFi1uSDK2) {
        int i2 = copydefault + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if ((aFi1uSDK == null ? (char) 25 : '#') == 25) {
            valueOf();
            return false;
        }
        if (!aFi1uSDK.getCurrencyIso4217Code()) {
            return false;
        }
        if (!(this.component3.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0) <= aFi1uSDK.getRevenue)) {
            return false;
        }
        if (!getRevenue(aFi1uSDK, aFi1uSDK2)) {
            int i4 = copy + 27;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            int i5 = 65 / 0;
            return false;
        }
        if (!getCurrencyIso4217Code(aFi1uSDK.getCurrencyIso4217Code)) {
            int i6 = copydefault + 85;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (getMediationNetwork(aFi1uSDK.component4)) {
            return true;
        }
        int i8 = copydefault + 85;
        copy = i8 % 128;
        if ((i8 % 2 == 0 ? (char) 15 : (char) 31) == 31) {
            return false;
        }
        int i9 = 26 / 0;
        return false;
        throw th;
    }

    private static String[] getRevenue(String str, StackTraceElement[] stackTraceElementArr) {
        int i2 = copydefault + 67;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (!(stackTraceElementArr != null)) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        int i4 = 1;
        while (true) {
            if (!(i4 < stackTraceElementArr.length)) {
                return strArr;
            }
            int i5 = copydefault + 65;
            copy = i5 % 128;
            if ((i5 % 2 == 0 ? '@' : '0') != '0') {
                strArr[i4] = stackTraceElementArr[i4].toString();
                i4 += 106;
            } else {
                strArr[i4] = stackTraceElementArr[i4].toString();
                i4++;
            }
        }
    }

    private static boolean getMediationNetwork(String str) {
        int i2 = copy + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            AFc1sSDK.getMonetizationNetwork(str);
            throw null;
        }
        if (!AFc1sSDK.getMonetizationNetwork(str)) {
            new AFe1vSDK();
            return AFe1vSDK.getMonetizationNetwork(component1(), str);
        }
        int i3 = copy + 67;
        copydefault = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 18 : 'M') != 'M') {
            int i4 = 73 / 0;
        }
        return true;
    }
}
