package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes4.dex */
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

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i, int i2, int i3) {
        AFh1cSDK aFh1cSDK;
        int i4 = ~((~i) | i2);
        int i5 = (i * 71) + (i2 * (-69)) + (((~(i2 | i3)) | i4) * (-140)) + ((~(i | i2 | i3)) * 70) + (((~(i | i3)) | (~((~i2) | i)) | i4) * 70);
        if (i5 == 1) {
            return getMonetizationNetwork(objArr);
        }
        if (i5 == 2) {
            return getRevenue(objArr);
        }
        if (i5 == 3) {
            AFi1vSDK aFi1vSDK = (AFi1vSDK) objArr[0];
            int i6 = 2 % 2;
            int i7 = copy + 43;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            if (aFi1vSDK != null && (aFh1cSDK = aFi1vSDK.getRevenue) != null) {
                return aFh1cSDK.getCurrencyIso4217Code;
            }
            int i9 = copy + 15;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return null;
        }
        float floatValue = ((Number) objArr[0]).floatValue();
        int i11 = 2 % 2;
        double d = floatValue;
        if (d < 1.0d) {
            if (d <= 0.0d) {
                int i12 = copydefault + 111;
                copy = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            if (component3() > floatValue) {
                return false;
            }
            int i14 = copydefault + 121;
            copy = i14 % 128;
            int i15 = i14 % 2;
        }
        return true;
    }

    static {
        component2();
        AFAdRevenueData = 98166;
        int i = copy + 55;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public AFb1gSDK(AFd1kSDK aFd1kSDK) {
        this.component3 = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final boolean getCurrencyIso4217Code() {
        int i;
        int i2 = 2 % 2;
        int i3 = copy + 53;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean mediationNetwork = getMediationNetwork((AFi1uSDK) getMonetizationNetwork(new Object[]{this.component3.component2().getCurrencyIso4217Code.getRevenue}, 1236177641, -1236177638, (int) System.currentTimeMillis()), (AFi1uSDK) getMonetizationNetwork(new Object[]{this.component3.component2().getCurrencyIso4217Code.AFAdRevenueData}, 1236177641, -1236177638, (int) System.currentTimeMillis()));
        if (mediationNetwork) {
            component4();
            i = copydefault + 25;
        } else {
            getMediationNetwork();
            AFAdRevenueData();
            i = copydefault + 91;
        }
        copy = i % 128;
        int i5 = i % 2;
        return mediationNetwork;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r8.areAllFieldsValid != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r8.areAllFieldsValid = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        getMonetizationNetwork("r_debugging_on", new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", java.util.Locale.ENGLISH).format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r1 = com.appsflyer.internal.AFb1gSDK.copydefault + 45;
        com.appsflyer.internal.AFb1gSDK.copy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if ((r1 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.e(com.appsflyer.internal.AFh1vSDK.PROXY, "Error while starting remote debugger", r0, true, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x001c, code lost:
    
        if (r8.areAllFieldsValid != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void component4() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final synchronized void AFAdRevenueData() {
        int i = 2 % 2;
        if (!this.areAllFieldsValid) {
            int i2 = copy;
            int i3 = i2 + 53;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if (!this.getMediationNetwork) {
                int i5 = i2 + 7;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this.areAllFieldsValid = false;
        this.getMediationNetwork = false;
        try {
            getMonetizationNetwork("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(char c, String str, String str2, String str3, int i, Object[] objArr) {
        char[] cArr;
        int i2 = 2 % 2;
        Object obj = null;
        if (str3 != null) {
            int i3 = $10 + 117;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str3.toCharArray();
                obj.hashCode();
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr2 = cArr;
        char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        int length = charArray2.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray2, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr5 = new char[length3];
        aFk1sSDK.getMediationNetwork = 0;
        while (aFk1sSDK.getMediationNetwork < length3) {
            int i4 = $10 + 63;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = (aFk1sSDK.getMediationNetwork + 2) % 4;
            int i7 = (aFk1sSDK.getMediationNetwork + 3) % 4;
            aFk1sSDK.getMonetizationNetwork = (char) (((cArr3[aFk1sSDK.getMediationNetwork % 4] * 32718) + cArr4[i6]) % 65535);
            cArr4[i7] = (char) (((cArr3[i7] * 32718) + cArr4[i6]) / 65535);
            cArr3[i7] = aFk1sSDK.getMonetizationNetwork;
            cArr5[aFk1sSDK.getMediationNetwork] = (char) ((((cArr3[i7] ^ charArray[aFk1sSDK.getMediationNetwork]) ^ (component2 ^ 4316357171685541830L)) ^ ((int) (component4 ^ 4316357171685541830L))) ^ ((char) (equals ^ 4316357171685541830L)));
            aFk1sSDK.getMediationNetwork++;
        }
        String str4 = new String(cArr5);
        int i8 = $11 + 25;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str4;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final synchronized void getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = copy + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
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

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1gSDK aFb1gSDK = (AFb1gSDK) objArr[0];
        String str = (String) objArr[1];
        PackageManager packageManager = (PackageManager) objArr[2];
        int i = 2 % 2;
        int i2 = copy + 107;
        copydefault = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Map<String, Object> l_ = aFb1gSDK.l_(str, packageManager);
                AFg1wSDK AFKeystoreWrapper = aFb1gSDK.component3.AFKeystoreWrapper();
                final AFe1ySDK AFAdRevenueData2 = aFb1gSDK.component3.getCurrencyIso4217Code().AFAdRevenueData(l_, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(AFKeystoreWrapper)));
                if (AFAdRevenueData2 == null) {
                    AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                    int i3 = copydefault + 1;
                    copy = i3 % 128;
                    int i4 = i3 % 2;
                    return null;
                }
                ExecutorService monetizationNetwork = aFb1gSDK.component3.getMonetizationNetwork();
                Objects.requireNonNull(AFAdRevenueData2);
                monetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1gSDK$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1ySDK.this.AFAdRevenueData();
                    }
                });
                return null;
            }
            Map<String, Object> l_2 = aFb1gSDK.l_(str, packageManager);
            AFg1wSDK AFKeystoreWrapper2 = aFb1gSDK.component3.AFKeystoreWrapper();
            aFb1gSDK.component3.getCurrencyIso4217Code().AFAdRevenueData(l_2, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper2}, -1684451992, 1684451992, System.identityHashCode(AFKeystoreWrapper2)));
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getMediationNetwork(String str, String... strArr) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork("public_api_call", str, strArr);
        int i4 = copydefault + 107;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String message;
        StackTraceElement[] stackTrace;
        AFb1gSDK aFb1gSDK = (AFb1gSDK) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            message = th.getMessage();
            int i2 = copy + 27;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        } else {
            message = cause.getMessage();
        }
        if (cause == null) {
            int i4 = copydefault + 33;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                stackTrace = th.getStackTrace();
                int i5 = 50 / 0;
            } else {
                stackTrace = th.getStackTrace();
            }
        } else {
            stackTrace = cause.getStackTrace();
        }
        aFb1gSDK.getMonetizationNetwork("exception", simpleName, getRevenue(message, stackTrace));
        int i6 = copydefault + 15;
        copy = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getMediationNetwork(String str, String str2) {
        int i = 2 % 2;
        int i2 = copy + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork("server_request", str, str2);
        int i4 = copy + 61;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getMediationNetwork(String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = copydefault + 63;
        copy = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork("server_response", str, String.valueOf(i), str2);
        int i5 = copy + 39;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            getMonetizationNetwork(null, str, str2);
        } else {
            getMonetizationNetwork(null, str, str2);
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final synchronized void getMediationNetwork() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            this.getMediationNetwork = false;
            getMonetizationNetwork();
        } else {
            this.getMediationNetwork = false;
            getMonetizationNetwork();
        }
        copydefault();
        int i3 = copy + 23;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 73 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getRevenue() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.component1 = false;
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final boolean areAllFieldsValid() {
        int i = 2 % 2;
        int i2 = copy + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.areAllFieldsValid;
        int i4 = i3 + 45;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    private static float component3() {
        int i = 2 % 2;
        float nextFloat = new Random().nextFloat();
        int i2 = copy + 89;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
        return nextFloat;
    }

    private Map<String, Object> l_(String str, PackageManager packageManager) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m_(str, packageManager, this.component3.AFKeystoreWrapper(), this.component3.e());
        Map<String, Object> copy2 = copy();
        int i4 = copydefault + 89;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return copy2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        copy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return "6.15.2";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean equals() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 105;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (!this.component1) {
            return false;
        }
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        if (!this.getMediationNetwork && !this.areAllFieldsValid) {
            return false;
        }
        int i7 = i2 + 41;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private synchronized void getMediationNetwork(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = copy + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            Map<String, Object> map = this.getRevenue;
            Object[] objArr = new Object[1];
            a((char) ((-16733443) - Color.rgb(0, 0, 0)), "鰒冷ﵪ\ue6aa", "쩽缤䈽\ufade쏟", "奡雜ﬣꪐ", 1783740316 - View.getDefaultSize(0, 0), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getRevenue.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
            this.getRevenue.put("platform", "Android");
            this.getRevenue.put("platform_version", Build.VERSION.RELEASE);
            Object obj = null;
            if (str != null) {
                int i4 = copy + 93;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    str.length();
                    obj.hashCode();
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
                    int i7 = 2 % 2;
                }
            }
            if (str3 != null && str3.length() > 0) {
                int i8 = copy + 97;
                copydefault = i8 % 128;
                if (i8 % 2 != 0) {
                    this.getRevenue.put("android_id", str3);
                    throw null;
                }
                this.getRevenue.put("android_id", str3);
            }
            int i9 = copydefault + 85;
            copy = i9 % 128;
            int i10 = i9 % 2;
        } catch (Throwable unused) {
        }
    }

    private synchronized void getRevenue(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        try {
            this.getRevenue.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                int i2 = copy + 55;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    this.getRevenue.put("devkey", str2);
                    throw null;
                }
                this.getRevenue.put("devkey", str2);
                int i3 = 2 % 2;
            }
            if (str3 != null) {
                int i4 = copy + 51;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                if (str3.length() > 0) {
                    this.getRevenue.put("originalAppsFlyerId", str3);
                }
            }
            if (str4 != null) {
                int i6 = copydefault + 77;
                copy = i6 % 128;
                int i7 = i6 % 2;
                if (str4.length() > 0) {
                    this.getRevenue.put("uid", str4);
                    int i8 = copy + 83;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 2 % 2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void AFAdRevenueData(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.getRevenue.put("app_id", str);
                    int i2 = 2 % 2;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.getRevenue.put("app_version", str2);
            int i3 = copy + 97;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        if (str3 != null && str3.length() > 0) {
            this.getRevenue.put(AppsFlyerProperties.CHANNEL, str3);
            int i6 = copydefault + 61;
            copy = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if (str4 != null) {
            int i9 = copy + 41;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            if (str4.length() > 0) {
                int i11 = copydefault + 57;
                copy = i11 % 128;
                int i12 = i11 % 2;
                this.getRevenue.put("preInstall", str4);
            }
        }
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String... strArr) {
        int i = 2 % 2;
        int i2 = copy + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (!equals() || this.getMonetizationNetwork >= 98304) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String join = TextUtils.join(", ", strArr);
            String obj = str != null ? new StringBuilder().append(currentTimeMillis).append(" ").append(Thread.currentThread().getId()).append(" _/AppsFlyer_6.15.2 [").append(str).append("] ").append(str2).append(" ").append(join).toString() : new StringBuilder().append(currentTimeMillis).append(" ").append(Thread.currentThread().getId()).append(" ").append(str2).append("/AppsFlyer_6.15.2 ").append(join).toString();
            int i4 = 2 % 2;
            int length = this.getMonetizationNetwork + (obj.length() << 1);
            int i5 = AFAdRevenueData;
            boolean z = false;
            if (length > i5) {
                obj = obj.substring(0, (i5 - this.getMonetizationNetwork) / 2);
                z = true;
            }
            this.getCurrencyIso4217Code.add(obj);
            this.getMonetizationNetwork += obj.length() << 1;
            if (z) {
                int i6 = copydefault + 43;
                copy = i6 % 128;
                if (i6 % 2 == 0) {
                    this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                    this.getMonetizationNetwork += 24700;
                } else {
                    this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                    this.getMonetizationNetwork += 138;
                }
                int i7 = copy + 37;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 % 3;
                } else {
                    int i9 = 2 % 2;
                }
            }
            int i10 = copydefault + 55;
            copy = i10 % 128;
            if (i10 % 2 != 0) {
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized Map<String, Object> copy() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            this.getRevenue.put("data", this.getCurrencyIso4217Code);
            copydefault();
        } else {
            this.getRevenue.put("data", this.getCurrencyIso4217Code);
            copydefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return this.getRevenue;
    }

    private synchronized void m_(String str, PackageManager packageManager, AFg1wSDK aFg1wSDK, AFd1tSDK aFd1tSDK) {
        AFb1tSDK aFb1tSDK;
        int i = 2 % 2;
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
            if (aFh1pSDK != null) {
                aFb1tSDK = new AFb1tSDK(aFh1pSDK.AFAdRevenueData, aFh1pSDK.areAllFieldsValid);
                int i4 = 2 % 2;
            } else {
                aFb1tSDK = null;
            }
            if (aFb1tSDK != null) {
                int i5 = copy + 3;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                str2 = aFb1tSDK.getRevenue;
                int i7 = 2 % 2;
            }
            getMediationNetwork(str2, aFg1wSDK.getRevenue(), aFd1tSDK.getRevenue);
            String obj = new StringBuilder("6.15.2.").append(AFb1rSDK.getCurrencyIso4217Code).toString();
            AFg1wSDK AFKeystoreWrapper = revenue.getMonetizationNetwork().AFKeystoreWrapper();
            getRevenue(obj, (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{AFKeystoreWrapper}, -1684451992, 1684451992, System.identityHashCode(AFKeystoreWrapper)), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                AFAdRevenueData(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getRevenue).toString());
        }
        int i8 = 2 % 2;
        this.getRevenue.put("launch_counter", String.valueOf(this.component3.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0)));
    }

    private static String[] getRevenue(String str, StackTraceElement[] stackTraceElementArr) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 1;
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        while (i4 < stackTraceElementArr.length) {
            int i5 = copydefault + 65;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                strArr[i4] = stackTraceElementArr[i4].toString();
                i4 += 106;
            } else {
                strArr[i4] = stackTraceElementArr[i4].toString();
                i4++;
            }
        }
        return strArr;
    }

    private synchronized void copydefault() {
        int i = 2 % 2;
        this.getCurrencyIso4217Code = new ArrayList();
        this.getMonetizationNetwork = 0;
        int i2 = copy + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private synchronized boolean getMediationNetwork(AFi1uSDK aFi1uSDK, AFi1uSDK aFi1uSDK2) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (aFi1uSDK == null) {
            valueOf();
            return false;
        }
        if (!aFi1uSDK.getCurrencyIso4217Code()) {
            return false;
        }
        if (this.component3.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0) > aFi1uSDK.AFAdRevenueData) {
            int i4 = 2 % 2;
            return false;
        }
        if (!getRevenue(aFi1uSDK, aFi1uSDK2)) {
            int i5 = copy + 27;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            int i6 = 65 / 0;
            return false;
        }
        if (!getCurrencyIso4217Code(aFi1uSDK.getMonetizationNetwork)) {
            int i7 = copydefault + 85;
            copy = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (getMediationNetwork(aFi1uSDK.getMediationNetwork)) {
            return true;
        }
        int i9 = copydefault + 85;
        copy = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        int i10 = 26 / 0;
        return false;
    }

    private boolean getRevenue(AFi1uSDK aFi1uSDK, AFi1uSDK aFi1uSDK2) {
        boolean currencyIso4217Code;
        int i = 2 % 2;
        int i2 = copy + 47;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            if (!aFi1uSDK.equals(aFi1uSDK2)) {
                currencyIso4217Code = getCurrencyIso4217Code(aFi1uSDK.getRevenue);
                getMediationNetwork(currencyIso4217Code);
            } else {
                int i3 = copy + 119;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                currencyIso4217Code = values();
            }
            int i5 = copy + 39;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return currencyIso4217Code;
            }
            throw null;
        }
        aFi1uSDK.equals(aFi1uSDK2);
        throw null;
    }

    private static boolean getMediationNetwork(String str) {
        int i = 2 % 2;
        int i2 = copy + 95;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            if (!AFc1sSDK.getMonetizationNetwork(str)) {
                new AFe1vSDK();
                return AFe1vSDK.getMonetizationNetwork(component1(), str);
            }
            int i3 = copy + 67;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 73 / 0;
            }
            return true;
        }
        AFc1sSDK.getMonetizationNetwork(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean getCurrencyIso4217Code(String str) {
        int i = 2 % 2;
        if (AFc1sSDK.getMonetizationNetwork(str)) {
            int i2 = copydefault + 57;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        AFd1qSDK mediationNetwork = this.component3.getMediationNetwork();
        boolean equals2 = str.equals(AFb1qSDK.getMediationNetwork(mediationNetwork.getMonetizationNetwork.AFAdRevenueData, mediationNetwork.getMonetizationNetwork.AFAdRevenueData.getPackageName()));
        int i4 = copydefault + 31;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return equals2;
    }

    private void valueOf() {
        int i = 2 % 2;
        int i2 = copy + 107;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.component3.getRevenue().AFAdRevenueData("participantInProxy");
            int i3 = copydefault + 89;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.component3.getRevenue().AFAdRevenueData("participantInProxy");
        throw null;
    }

    private void getMediationNetwork(boolean z) {
        int i = 2 % 2;
        int i2 = copy + 79;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.component3.getRevenue().getRevenue("participantInProxy", z);
            int i3 = copydefault + 3;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.component3.getRevenue().getRevenue("participantInProxy", z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean values() {
        int i = 2 % 2;
        int i2 = copy + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean mediationNetwork = this.component3.getRevenue().getMediationNetwork("participantInProxy");
        int i4 = copy + 101;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return mediationNetwork;
    }

    static void component2() {
        component2 = -7965111987969810777L;
        component4 = -2046375994;
        equals = (char) 51142;
    }

    private static AFi1uSDK getRevenue(AFi1vSDK aFi1vSDK) {
        return (AFi1uSDK) getMonetizationNetwork(new Object[]{aFi1vSDK}, 1236177641, -1236177638, (int) System.currentTimeMillis());
    }

    private static boolean getCurrencyIso4217Code(float f) {
        return ((Boolean) getMonetizationNetwork(new Object[]{Float.valueOf(f)}, 169076754, -169076754, (int) System.currentTimeMillis())).booleanValue();
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void getRevenue(Throwable th) {
        getMonetizationNetwork(new Object[]{this, th}, 353230021, -353230020, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void k_(String str, PackageManager packageManager) {
        getMonetizationNetwork(new Object[]{this, str, packageManager}, 1187970804, -1187970802, System.identityHashCode(this));
    }
}
