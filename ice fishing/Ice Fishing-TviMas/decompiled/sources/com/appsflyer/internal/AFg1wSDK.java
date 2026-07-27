package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1uSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class AFg1wSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;
    private static int[] component3 = {-822670749, 1075086223, 147004145, 479090167, -532315947, 551557374, 1465503631, -1445164187, -1205793421, -530934650, 1110614146, 1724100027, -1279723807, 1741964355, -470761703, -2125897653, 1290985041, -235853772};
    private static int copy = 1;
    private final AFd1nSDK AFAdRevenueData;
    private volatile String areAllFieldsValid;
    private volatile String component4;
    private long getCurrencyIso4217Code;
    private final AFg1uSDK getMediationNetwork;
    Map<String, Object> getRevenue;
    private boolean getMonetizationNetwork = false;
    private volatile boolean component1 = false;

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ~(i4 | i5);
        int i7 = ~i;
        int i8 = (i * 371) + (i2 * 371) + ((i6 | (~(i7 | i3))) * (-370));
        int i9 = (~(i3 | i4)) | (~(i5 | i7));
        int i10 = ~(i | i2);
        int i11 = i8 + ((i9 | i10) * (-370)) + (i10 * 370);
        if (i11 == 1) {
            AFg1wSDK aFg1wSDK = (AFg1wSDK) objArr[0];
            String str = (String) objArr[1];
            int i12 = 2 % 2;
            int i13 = component2 + 107;
            copy = i13 % 128;
            int i14 = i13 % 2;
            aFg1wSDK.areAllFieldsValid = str;
            int i15 = component2 + 103;
            copy = i15 % 128;
            int i16 = i15 % 2;
            return null;
        }
        if (i11 == 2) {
            return AFAdRevenueData(objArr);
        }
        AFg1wSDK aFg1wSDK2 = (AFg1wSDK) objArr[0];
        int i17 = 2 % 2;
        int i18 = component2 + 61;
        copy = i18 % 128;
        int i19 = i18 % 2;
        String str2 = aFg1wSDK2.component4;
        int i20 = component2 + 53;
        copy = i20 % 128;
        int i21 = i20 % 2;
        return str2;
    }

    public AFg1wSDK(AFd1nSDK aFd1nSDK, AFg1uSDK aFg1uSDK) {
        this.AFAdRevenueData = aFd1nSDK;
        this.getMediationNetwork = aFg1uSDK;
    }

    public final void getCurrencyIso4217Code(String str) {
        int i = 2 % 2;
        int i2 = copy + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.component4 = str;
        int i4 = component2 + 65;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final boolean getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        copy = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.component1;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return z;
    }

    public final void getCurrencyIso4217Code(boolean z) {
        int i = 2 % 2;
        int i2 = copy + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.component1 = z;
            return;
        }
        this.component1 = z;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRevenue() {
        int i = 2 % 2;
        int i2 = copy + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.areAllFieldsValid;
        int i4 = copy + 55;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getRevenue(AFd1rSDK aFd1rSDK) {
        String str;
        int i = 2 % 2;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        Object obj = null;
        String monetizationNetwork = aFd1rSDK.getMonetizationNetwork("imeiCached", (String) null);
        if (z && AFc1sSDK.getRevenue(this.areAllFieldsValid)) {
            Context context = this.AFAdRevenueData.AFAdRevenueData;
            if (context != null) {
                int i2 = component2 + 117;
                copy = i2 % 128;
                if (i2 % 2 == 0) {
                    getMonetizationNetwork(context);
                    obj.hashCode();
                    throw null;
                }
                if (!(!getMonetizationNetwork(context))) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                        str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                    } catch (InvocationTargetException e) {
                        if (monetizationNetwork != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(monetizationNetwork)));
                        } else {
                            monetizationNetwork = null;
                        }
                        AFLogger.afErrorLog(new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ").append(e.getMessage()).toString(), e);
                    } catch (Exception e2) {
                        if (monetizationNetwork != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(monetizationNetwork)));
                        } else {
                            monetizationNetwork = null;
                        }
                        AFLogger.afErrorLog(new StringBuilder("WARNING: Can't collect IMEI: other reason: ").append(e2.getMessage()).toString(), e2);
                    }
                    if (str == null) {
                        if (monetizationNetwork != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(monetizationNetwork)));
                        } else {
                            monetizationNetwork = null;
                        }
                        int i3 = component2 + 53;
                        copy = i3 % 128;
                        int i4 = i3 % 2;
                        str = monetizationNetwork;
                    }
                }
            }
            str = null;
        } else {
            if (this.areAllFieldsValid != null) {
                str = this.areAllFieldsValid;
            }
            str = null;
        }
        if (AFc1sSDK.getRevenue(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        aFd1rSDK.AFAdRevenueData("imeiCached", str);
        return str;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        int i = 2 % 2;
        AFd1pSDK aFd1pSDK = new AFd1pSDK((Map) objArr[1], ((AFg1wSDK) objArr[0]).AFAdRevenueData.AFAdRevenueData);
        int i2 = component2 + 89;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component3;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i3 = 0;
            while (i3 < length2) {
                int i4 = $11 + 27;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    iArr4[i3] = (int) (iArr3[i3] ^ 7040698834646313678L);
                } else {
                    iArr4[i3] = (int) (iArr3[i3] ^ 7040698834646313678L);
                    i3++;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = component3;
        if (iArr6 != null) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            for (int i6 = 0; i6 < length; i6++) {
                iArr2[i6] = (int) (iArr6[i6] ^ 7040698834646313678L);
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        aFk1pSDK.AFAdRevenueData = 0;
        while (aFk1pSDK.AFAdRevenueData < iArr.length) {
            cArr[0] = (char) (iArr[aFk1pSDK.AFAdRevenueData] >> 16);
            cArr[1] = (char) iArr[aFk1pSDK.AFAdRevenueData];
            cArr[2] = (char) (iArr[aFk1pSDK.AFAdRevenueData + 1] >> 16);
            cArr[3] = (char) iArr[aFk1pSDK.AFAdRevenueData + 1];
            aFk1pSDK.getCurrencyIso4217Code = (cArr[0] << 16) + cArr[1];
            aFk1pSDK.getMonetizationNetwork = (cArr[2] << 16) + cArr[3];
            AFk1pSDK.getCurrencyIso4217Code(iArr5);
            for (int i7 = 0; i7 < 16; i7++) {
                aFk1pSDK.getCurrencyIso4217Code ^= iArr5[i7];
                aFk1pSDK.getMonetizationNetwork = AFk1pSDK.getRevenue(aFk1pSDK.getCurrencyIso4217Code) ^ aFk1pSDK.getMonetizationNetwork;
                int i8 = aFk1pSDK.getCurrencyIso4217Code;
                aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getMonetizationNetwork;
                aFk1pSDK.getMonetizationNetwork = i8;
            }
            int i9 = aFk1pSDK.getCurrencyIso4217Code;
            aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getMonetizationNetwork;
            aFk1pSDK.getMonetizationNetwork = i9;
            aFk1pSDK.getMonetizationNetwork ^= iArr5[16];
            aFk1pSDK.getCurrencyIso4217Code ^= iArr5[17];
            int i10 = aFk1pSDK.getCurrencyIso4217Code;
            int i11 = aFk1pSDK.getMonetizationNetwork;
            cArr[0] = (char) (aFk1pSDK.getCurrencyIso4217Code >>> 16);
            cArr[1] = (char) aFk1pSDK.getCurrencyIso4217Code;
            cArr[2] = (char) (aFk1pSDK.getMonetizationNetwork >>> 16);
            cArr[3] = (char) aFk1pSDK.getMonetizationNetwork;
            AFk1pSDK.getCurrencyIso4217Code(iArr5);
            cArr2[aFk1pSDK.AFAdRevenueData * 2] = cArr[0];
            cArr2[(aFk1pSDK.AFAdRevenueData * 2) + 1] = cArr[1];
            cArr2[(aFk1pSDK.AFAdRevenueData * 2) + 2] = cArr[2];
            cArr2[(aFk1pSDK.AFAdRevenueData * 2) + 3] = cArr[3];
            aFk1pSDK.AFAdRevenueData += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final Map<String, Object> getCurrencyIso4217Code(Map<String, Object> map) {
        int i = 2 % 2;
        try {
            try {
                Object[] objArr = {map, this.AFAdRevenueData.AFAdRevenueData};
                Object obj = AFa1vSDK.registerClient.get(-1068415224);
                if (obj == null) {
                    obj = ((Class) AFa1vSDK.getRevenue(Color.blue(0) + 37, 360 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (40289 - View.combineMeasuredStates(0, 0)))).getDeclaredConstructor(Map.class, Context.class);
                    AFa1vSDK.registerClient.put(-1068415224, obj);
                }
                Map<String, Object> map2 = (Map) ((Constructor) obj).newInstance(objArr);
                int i2 = copy + 71;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return map2;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th2);
            return new HashMap();
        }
    }

    public static void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        int i = 2 % 2;
        try {
            new AFb1sSDK(aFa1oSDK).afInfoLog();
            int i2 = component2 + 35;
            copy = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getRevenue(r1) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getRevenue(r1) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        r7.getCurrencyIso4217Code = r1.substring(0, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        r1 = com.appsflyer.internal.AFd1qSDK.getMediationNetwork();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void AFAdRevenueData(Map<String, Object> map, AFd1qSDK aFd1qSDK) {
        String revenue;
        int i = 2 % 2;
        if (AFc1sSDK.getRevenue(aFd1qSDK.getCurrencyIso4217Code)) {
            int i2 = component2 + 69;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                revenue = aFd1qSDK.getRevenue("com.appsflyer.security.uuid");
                int i3 = 57 / 0;
            } else {
                revenue = aFd1qSDK.getRevenue("com.appsflyer.security.uuid");
            }
        }
        String str = aFd1qSDK.getCurrencyIso4217Code;
        try {
            Object[] objArr = new Object[1];
            a(new int[]{1091213027, 1132401161, -1174855883, -1091241639, -1587464187, 1289805057}, 12 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            long parseLong = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
            char[] charArray = str.toCharArray();
            int i4 = ((int) (parseLong % 94)) + 33;
            int i5 = copy + 57;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            for (int i7 = 0; i7 < charArray.length; i7++) {
                charArray[i7] = (char) (charArray[i7] ^ i4);
            }
            map.put("sbid", new String(charArray));
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Exception occurred while generating sbid ", e);
        }
    }

    public final Map<String, Object> getMediationNetwork() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        if (!areAllFieldsValid()) {
            if (this.getMonetizationNetwork) {
                this.getRevenue = new HashMap();
                component2();
                this.getRevenue.put("error", "pending LVL response");
                hashMap.put("lvl", this.getRevenue);
                int i2 = component2 + 73;
                copy = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 % 2;
                }
            }
        } else {
            int i4 = component2 + 65;
            copy = i4 % 128;
            int i5 = i4 % 2;
            hashMap.put("lvl", this.getRevenue);
        }
        return hashMap;
    }

    private boolean areAllFieldsValid() {
        int i = 2 % 2;
        Map<String, Object> map = this.getRevenue;
        if (map != null) {
            int i2 = copy + 3;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                map.isEmpty();
                throw null;
            }
            if (!map.isEmpty()) {
                int i3 = component2 + 97;
                copy = i3 % 128;
                return i3 % 2 != 0;
            }
        }
        return false;
    }

    public final boolean getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = copy + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (this.getMonetizationNetwork && (!areAllFieldsValid())) {
            return true;
        }
        int i4 = component2 + 41;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void getMediationNetwork(AFd1qSDK aFd1qSDK) {
        int i = 2 % 2;
        this.getCurrencyIso4217Code = System.currentTimeMillis();
        this.getMonetizationNetwork = this.getMediationNetwork.getMediationNetwork(getMonetizationNetwork(aFd1qSDK), this.AFAdRevenueData.AFAdRevenueData, new AFg1uSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFg1wSDK.4
            @Override // com.appsflyer.internal.AFg1uSDK.AFa1vSDK
            public final void AFAdRevenueData(String str, String str2) {
                AFg1wSDK.this.getRevenue = new ConcurrentHashMap();
                AFg1wSDK.this.getRevenue.put("signedData", str);
                AFg1wSDK.this.getRevenue.put("signature", str2);
                AFg1wSDK.this.component2();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFg1uSDK.AFa1vSDK
            public final void getCurrencyIso4217Code(String str, Exception exc) {
                AFg1wSDK.this.getRevenue = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFg1wSDK.this.component2();
                AFg1wSDK.this.getRevenue.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        int i2 = component2 + 9;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private long getMonetizationNetwork(AFd1qSDK aFd1qSDK) {
        int i = 2 % 2;
        long revenue = AFb1jSDK.getRevenue(new StringBuilder().append(AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue)).append(component4()).toString());
        int i2 = component2 + 11;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return revenue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private long component4() {
        int i = 2 % 2;
        int i2 = copy + 29;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getCurrencyIso4217Code;
        }
        throw null;
    }

    final void component2() {
        int i = 2 % 2;
        int i2 = copy + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.getRevenue.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getCurrencyIso4217Code));
        this.getRevenue.put("lvl_timestamp", Long.valueOf(component4()));
    }

    private static boolean getMonetizationNetwork(Context context) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i4 = component2 + 41;
            copy = i4 % 128;
            if (i4 % 2 != 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                AFb1rSDK.getRevenue();
                return AFb1rSDK.getRevenue(context) ^ true;
            }
        }
        int i5 = copy + 15;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        return (Map) getCurrencyIso4217Code(new Object[]{this, map}, 896699170, -896699168, System.identityHashCode(this));
    }

    public final String AFAdRevenueData() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -1684451992, 1684451992, System.identityHashCode(this));
    }

    public final void getRevenue(String str) {
        getCurrencyIso4217Code(new Object[]{this, str}, 1318882910, -1318882909, System.identityHashCode(this));
    }
}
