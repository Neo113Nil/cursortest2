package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
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

    public AFg1wSDK(AFd1nSDK aFd1nSDK, AFg1uSDK aFg1uSDK) {
        this.AFAdRevenueData = aFd1nSDK;
        this.getMediationNetwork = aFg1uSDK;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFd1pSDK aFd1pSDK = new AFd1pSDK((Map) objArr[1], ((AFg1wSDK) objArr[0]).AFAdRevenueData.AFAdRevenueData);
        int i2 = component2 + 89;
        copy = i2 % 128;
        if ((i2 % 2 == 0 ? ']' : 'G') != ']') {
            return aFd1pSDK;
        }
        throw null;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) {
        int i3;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component3;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = 0;
            while (true) {
                if ((i4 < length ? ',' : (char) 14) != ',') {
                    break;
                }
                int i5 = $11 + 27;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    iArr3[i4] = (int) (((long) iArr2[i4]) ^ 7040698834646313678L);
                    i4 <<= 0;
                } else {
                    iArr3[i4] = (int) (((long) iArr2[i4]) ^ 7040698834646313678L);
                    i4++;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component3;
        if ((iArr5 != null ? 'Y' : '!') != 'Y') {
            i3 = length2;
        } else {
            int i6 = $10 + 11;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
            }
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                iArr6[i7] = (int) (((long) iArr5[i7]) ^ 7040698834646313678L);
                i7++;
                length2 = length2;
            }
            iArr5 = iArr6;
            i3 = length2;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i3);
        aFk1pSDK.AFAdRevenueData = 0;
        while (true) {
            int i8 = aFk1pSDK.AFAdRevenueData;
            if (i8 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i2);
                return;
            }
            int i9 = iArr[i8];
            char c2 = (char) (i9 >> 16);
            cArr[0] = c2;
            char c3 = (char) i9;
            cArr[1] = c3;
            char c4 = (char) (iArr[i8 + 1] >> 16);
            cArr[2] = c4;
            char c5 = (char) iArr[i8 + 1];
            cArr[3] = c5;
            aFk1pSDK.getCurrencyIso4217Code = (c2 << 16) + c3;
            aFk1pSDK.getMonetizationNetwork = (c4 << 16) + c5;
            AFk1pSDK.getCurrencyIso4217Code(iArr4);
            int i10 = 0;
            while (true) {
                if ((i10 < 16 ? ':' : '.') != '.') {
                    int i11 = aFk1pSDK.getCurrencyIso4217Code ^ iArr4[i10];
                    aFk1pSDK.getCurrencyIso4217Code = i11;
                    int revenue = AFk1pSDK.getRevenue(i11) ^ aFk1pSDK.getMonetizationNetwork;
                    int i12 = aFk1pSDK.getCurrencyIso4217Code;
                    aFk1pSDK.getCurrencyIso4217Code = revenue;
                    aFk1pSDK.getMonetizationNetwork = i12;
                    i10++;
                }
            }
            int i13 = aFk1pSDK.getCurrencyIso4217Code;
            int i14 = aFk1pSDK.getMonetizationNetwork;
            int i15 = i13 ^ iArr4[16];
            aFk1pSDK.getMonetizationNetwork = i15;
            int i16 = i14 ^ iArr4[17];
            aFk1pSDK.getCurrencyIso4217Code = i16;
            cArr[0] = (char) (i16 >>> 16);
            cArr[1] = (char) i16;
            cArr[2] = (char) (i15 >>> 16);
            cArr[3] = (char) i15;
            AFk1pSDK.getCurrencyIso4217Code(iArr4);
            int i17 = aFk1pSDK.AFAdRevenueData;
            cArr2[i17 * 2] = cArr[0];
            cArr2[(i17 * 2) + 1] = cArr[1];
            cArr2[(i17 * 2) + 2] = cArr[2];
            cArr2[(i17 * 2) + 3] = cArr[3];
            aFk1pSDK.AFAdRevenueData = i17 + 2;
        }
    }

    private boolean areAllFieldsValid() {
        Map<String, Object> map = this.getRevenue;
        if (map != null) {
            int i2 = copy + 3;
            component2 = i2 % 128;
            if (!(i2 % 2 == 0)) {
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

    private long component4() {
        int i2 = copy + 29;
        component2 = i2 % 128;
        if ((i2 % 2 != 0 ? 'J' : ':') != 'J') {
            return this.getCurrencyIso4217Code;
        }
        throw null;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i2, int i3, int i4) {
        int i5 = ~i3;
        int i6 = ~i4;
        int i7 = ~(i5 | i6);
        int i8 = ~i2;
        int i9 = ((i7 | (~(i8 | i4))) * (-370)) + (i3 * 371) + (i2 * 371);
        int i10 = (~(i4 | i5)) | (~(i8 | i6));
        int i11 = ~(i2 | i3);
        int i12 = (i11 * 370) + ((i10 | i11) * (-370)) + i9;
        if (i12 == 1) {
            AFg1wSDK aFg1wSDK = (AFg1wSDK) objArr[0];
            String str = (String) objArr[1];
            int i13 = component2 + 107;
            copy = i13 % 128;
            int i14 = i13 % 2;
            aFg1wSDK.areAllFieldsValid = str;
            int i15 = component2 + 103;
            copy = i15 % 128;
            int i16 = i15 % 2;
            return null;
        }
        if (i12 == 2) {
            return AFAdRevenueData(objArr);
        }
        AFg1wSDK aFg1wSDK2 = (AFg1wSDK) objArr[0];
        int i17 = component2 + 61;
        copy = i17 % 128;
        int i18 = i17 % 2;
        String str2 = aFg1wSDK2.component4;
        int i19 = component2 + 53;
        copy = i19 % 128;
        int i20 = i19 % 2;
        return str2;
    }

    private long getMonetizationNetwork(AFd1qSDK aFd1qSDK) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue));
        sb.append(component4());
        long revenue = AFb1jSDK.getRevenue(sb.toString());
        int i2 = component2 + 11;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        return revenue;
    }

    public final void component2() {
        int i2 = copy + 91;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        this.getRevenue.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getCurrencyIso4217Code));
        this.getRevenue.put("lvl_timestamp", Long.valueOf(component4()));
    }

    public final Map<String, Object> getMediationNetwork() {
        HashMap map = new HashMap();
        if ((areAllFieldsValid() ? '@' : (char) 7) == '@') {
            int i2 = component2 + 65;
            copy = i2 % 128;
            int i3 = i2 % 2;
            map.put("lvl", this.getRevenue);
        } else if (this.getMonetizationNetwork) {
            this.getRevenue = new HashMap();
            component2();
            this.getRevenue.put("error", "pending LVL response");
            map.put("lvl", this.getRevenue);
            int i4 = component2 + 73;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }
        return map;
    }

    public final String getRevenue() {
        int i2 = copy + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.areAllFieldsValid;
        int i4 = copy + 55;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String AFAdRevenueData() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -1684451992, 1684451992, System.identityHashCode(this));
    }

    public final Map<String, Object> getCurrencyIso4217Code(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.AFAdRevenueData.AFAdRevenueData};
                Map map2 = AFa1vSDK.registerClient;
                Object declaredConstructor = map2.get(-1068415224);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1vSDK.getRevenue(Color.blue(0) + 37, 360 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (40289 - View.combineMeasuredStates(0, 0)))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(-1068415224, declaredConstructor);
                }
                Map<String, Object> map3 = (Map) ((Constructor) declaredConstructor).newInstance(objArr);
                int i2 = copy + 71;
                component2 = i2 % 128;
                if ((i2 % 2 != 0 ? (char) 23 : '[') == '[') {
                    return map3;
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

    public final void getMediationNetwork(AFd1qSDK aFd1qSDK) {
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

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        return (Map) getCurrencyIso4217Code(new Object[]{this, map}, 896699170, -896699168, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    public final String getRevenue(AFd1rSDK aFd1rSDK) {
        String str;
        StringBuilder sb;
        boolean z = false;
        boolean z2 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String monetizationNetwork = aFd1rSDK.getMonetizationNetwork("imeiCached", (String) null);
        if ((z2 ? (char) 17 : 'P') == 17 && AFc1sSDK.getRevenue(this.areAllFieldsValid)) {
            Context context = this.AFAdRevenueData.AFAdRevenueData;
            if (context == null) {
                str = null;
            } else {
                int i2 = component2 + 117;
                copy = i2 % 128;
                if (i2 % 2 == 0) {
                    getMonetizationNetwork(context);
                    throw null;
                }
                if (!(!getMonetizationNetwork(context))) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                        if (str == null) {
                            if (monetizationNetwork == null) {
                                z = true;
                            }
                            if (!z) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(monetizationNetwork)));
                            } else {
                                monetizationNetwork = null;
                            }
                            int i3 = component2 + 53;
                            copy = i3 % 128;
                            int i4 = i3 % 2;
                            str = monetizationNetwork;
                        }
                    } catch (InvocationTargetException e2) {
                        e = e2;
                        if (monetizationNetwork != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                        } else {
                            monetizationNetwork = null;
                        }
                        sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                        sb.append(e.getMessage());
                        AFLogger.afErrorLog(sb.toString(), e);
                    } catch (Exception e3) {
                        e = e3;
                        if (monetizationNetwork != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                        } else {
                            monetizationNetwork = null;
                        }
                        sb = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                        sb.append(e.getMessage());
                        AFLogger.afErrorLog(sb.toString(), e);
                    }
                } else {
                    str = null;
                }
            }
        } else {
            if ((this.areAllFieldsValid != null ? 'R' : '2') != '2') {
                str = this.areAllFieldsValid;
            } else {
                str = null;
            }
        }
        if (AFc1sSDK.getRevenue(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        aFd1rSDK.AFAdRevenueData("imeiCached", str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    public static void AFAdRevenueData(Map<String, Object> map, AFd1qSDK aFd1qSDK) {
        String revenue;
        if ((AFc1sSDK.getRevenue(aFd1qSDK.getCurrencyIso4217Code) ? (char) 2 : '@') == 2) {
            int i2 = component2 + 69;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                revenue = aFd1qSDK.getRevenue("com.appsflyer.security.uuid");
                int i3 = 57 / 0;
                if (AFc1sSDK.getRevenue(revenue)) {
                    revenue = AFd1qSDK.getMediationNetwork();
                }
            } else {
                revenue = aFd1qSDK.getRevenue("com.appsflyer.security.uuid");
                if (AFc1sSDK.getRevenue(revenue)) {
                    revenue = AFd1qSDK.getMediationNetwork();
                }
            }
            aFd1qSDK.getCurrencyIso4217Code = revenue.substring(0, 8);
        }
        String str = aFd1qSDK.getCurrencyIso4217Code;
        try {
            Object[] objArr = new Object[1];
            a(new int[]{1091213027, 1132401161, -1174855883, -1091241639, -1587464187, 1289805057}, 12 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            long j2 = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
            char[] charArray = str.toCharArray();
            int i4 = ((int) (j2 % 94)) + 33;
            int i5 = copy + 57;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            for (int i7 = 0; i7 < charArray.length; i7++) {
                charArray[i7] = (char) (charArray[i7] ^ i4);
            }
            map.put("sbid", new String(charArray));
        } catch (Exception e2) {
            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Exception occurred while generating sbid ", e2);
        }
    }

    public static void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        try {
            new AFb1sSDK(aFa1oSDK).afInfoLog();
            int i2 = component2 + 35;
            copy = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e2);
        }
    }

    public final boolean getMonetizationNetwork() {
        int i2 = copy + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (this.getMonetizationNetwork) {
            if (!areAllFieldsValid()) {
                return true;
            }
        }
        int i4 = component2 + 41;
        copy = i4 % 128;
        if ((i4 % 2 == 0 ? (char) 6 : ')') == ')') {
            return false;
        }
        throw null;
    }

    public final void getRevenue(String str) {
        getCurrencyIso4217Code(new Object[]{this, str}, 1318882910, -1318882909, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    private static boolean getMonetizationNetwork(Context context) {
        boolean z;
        int i2 = component2 + 23;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (!(AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false))) {
            int i4 = component2 + 41;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) ? '&' : ' ') != ' ') {
                    int i5 = copy + 15;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) ? '?' : 'B') != '?') {
                    z = false;
                } else {
                    int i7 = copy + 15;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                }
            }
        } else {
            int i9 = copy + 15;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        if (!z) {
            AFb1rSDK.getRevenue();
            if (!(!AFb1rSDK.getRevenue(context))) {
                return false;
            }
        }
        return true;
    }

    public final void getCurrencyIso4217Code(String str) {
        int i2 = copy + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.component4 = str;
        int i4 = component2 + 65;
        copy = i4 % 128;
        if ((i4 % 2 == 0 ? ')' : (char) 5) != 5) {
            throw null;
        }
    }

    public final void getCurrencyIso4217Code(boolean z) {
        int i2 = copy + 109;
        component2 = i2 % 128;
        boolean z2 = i2 % 2 != 0;
        this.component1 = z;
        if (z2) {
            throw null;
        }
    }

    public final boolean getCurrencyIso4217Code() {
        int i2 = component2 + 99;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        int i3 = 49 / 0;
        return this.component1;
    }
}
