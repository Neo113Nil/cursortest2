package com.appsflyer.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1lSDK;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class AFf1iSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 586908573;
    private static int component4 = -2033323395;
    private static byte[] copy = {-101, -126, 109, -103, -116, -106, -102, -107, -75, -111, -123, -107};
    private static short[] copydefault = null;
    private static int equals = 1;
    private static int hashCode = 0;
    private static int toString = 1998795834;

    @NonNull
    private final AFf1lSDK AFAdRevenueData;
    private volatile String areAllFieldsValid;
    private volatile String component2;

    @NonNull
    private final AFc1hSDK getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private long getRevenue;
    private boolean getMonetizationNetwork = false;
    private volatile boolean component3 = false;

    public AFf1iSDK(@NonNull AFc1hSDK aFc1hSDK, @NonNull AFf1lSDK aFf1lSDK) {
        this.getCurrencyIso4217Code = aFc1hSDK;
        this.AFAdRevenueData = aFf1lSDK;
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-489)) + (i * 491);
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = (i5 * 490) + (((~(i | i6)) | (~(i6 | i3))) * 490) + ((i5 | i6 | (~i3)) * (-490)) + i4;
        return i7 != 1 ? i7 != 2 ? getMonetizationNetwork(objArr) : getCurrencyIso4217Code(objArr) : getMediationNetwork(objArr);
    }

    private static void a(int i, int i2, int i3, byte b, short s, Object[] objArr) {
        int i4;
        boolean z;
        char c;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        StringBuilder sb = new StringBuilder();
        int i5 = i3 + ((int) (component1 ^ (-1123129136953719915L)));
        if (i5 == -1) {
            $10 = ($11 + 9) % 128;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            byte[] bArr = copy;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-1123129136953719915L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i5 = (byte) (((byte) (copy[((int) (component4 ^ (-1123129136953719915L))) + i2] ^ (-1123129136953719915L))) + ((int) (component1 ^ (-1123129136953719915L))));
                $10 = ($11 + 73) % 128;
            } else {
                i5 = (short) (((short) (copydefault[((int) (component4 ^ (-1123129136953719915L))) + i2] ^ (-1123129136953719915L))) + ((int) (component1 ^ (-1123129136953719915L))));
            }
        }
        if (i5 > 0) {
            aFk1pSDK.getCurrencyIso4217Code = ((i2 + i5) - 2) + ((int) (component4 ^ (-1123129136953719915L))) + i4;
            char c2 = (char) (i + ((int) (toString ^ (-1123129136953719915L))));
            aFk1pSDK.AFAdRevenueData = c2;
            sb.append(c2);
            aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
            byte[] bArr3 = copy;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-1123129136953719915L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                $10 = ($11 + 29) % 128;
                z = true;
            } else {
                z = false;
            }
            aFk1pSDK.getMediationNetwork = 1;
            while (aFk1pSDK.getMediationNetwork < i5) {
                int i8 = $10;
                $11 = (i8 + 23) % 128;
                if (z) {
                    int i9 = i8 + 117;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = aFk1pSDK.getCurrencyIso4217Code;
                    if (i10 == 0) {
                        byte[] bArr5 = copy;
                        aFk1pSDK.getCurrencyIso4217Code = i11 + 1;
                        c = (char) (aFk1pSDK.getMonetizationNetwork << (((byte) (((byte) (bArr5[i11] - (-1123129136953719915L))) >> s)) ^ b));
                    } else {
                        byte[] bArr6 = copy;
                        aFk1pSDK.getCurrencyIso4217Code = i11 - 1;
                        c = (char) (aFk1pSDK.getMonetizationNetwork + (((byte) (((byte) (bArr6[i11] ^ (-1123129136953719915L))) + s)) ^ b));
                    }
                    aFk1pSDK.AFAdRevenueData = c;
                } else {
                    short[] sArr = copydefault;
                    aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code - 1;
                    aFk1pSDK.AFAdRevenueData = (char) (aFk1pSDK.getMonetizationNetwork + (((short) (((short) (sArr[r2] ^ (-1123129136953719915L))) + s)) ^ b));
                }
                sb.append(aFk1pSDK.AFAdRevenueData);
                aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
                aFk1pSDK.getMediationNetwork++;
            }
        }
        objArr[0] = sb.toString();
    }

    private long component3() {
        return ((Long) AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this))).longValue();
    }

    private boolean component4() {
        int i = equals;
        hashCode = (i + 37) % 128;
        Map<String, Object> map = this.getMediationNetwork;
        if (map != null) {
            hashCode = (i + 115) % 128;
            if (!map.isEmpty()) {
                hashCode = (equals + 31) % 128;
                return true;
            }
        }
        equals = (hashCode + 79) % 128;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (getRevenue(r1) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        r1 = (android.telephony.TelephonyManager) r1.getSystemService("phone");
        r1 = (java.lang.String) r1.getClass().getMethod("getDeviceId", null).invoke(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(java.lang.String.valueOf(r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r6 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        r0 = new java.lang.StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
        r0.append(r1.getMessage());
        com.appsflyer.AFLogger.afErrorLog(r0.toString(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r6 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        r0 = new java.lang.StringBuilder("WARNING: Can't collect IMEI: other reason: ");
        r0.append(r1.getMessage());
        com.appsflyer.AFLogger.afErrorLog(r0.toString(), r1);
        com.appsflyer.internal.AFf1iSDK.equals = (com.appsflyer.internal.AFf1iSDK.hashCode + 117) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003d, code lost:
    
        if (com.appsflyer.internal.AFj1eSDK.getCurrencyIso4217Code(r2.areAllFieldsValid) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (com.appsflyer.internal.AFj1eSDK.getCurrencyIso4217Code(r2.areAllFieldsValid) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        r1 = r2.getCurrencyIso4217Code.getMonetizationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String str;
        AFf1iSDK aFf1iSDK = (AFf1iSDK) objArr[0];
        AFc1sSDK aFc1sSDK = (AFc1sSDK) objArr[1];
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String AFAdRevenueData = aFc1sSDK.AFAdRevenueData("imeiCached", (String) null);
        if (z) {
            int i = hashCode + 105;
            equals = i % 128;
            if (i % 2 == 0) {
                int i2 = 30 / 0;
            }
            if (AFj1eSDK.getCurrencyIso4217Code(str)) {
                aFc1sSDK.getRevenue("imeiCached", str);
                return str;
            }
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        if (aFf1iSDK.areAllFieldsValid != null) {
            int i3 = hashCode + 37;
            equals = i3 % 128;
            int i4 = i3 % 2;
            str = aFf1iSDK.areAllFieldsValid;
            if (i4 == 0) {
                throw null;
            }
            if (AFj1eSDK.getCurrencyIso4217Code(str)) {
            }
        }
        str = null;
        if (AFj1eSDK.getCurrencyIso4217Code(str)) {
        }
        str = AFAdRevenueData;
        if (AFj1eSDK.getCurrencyIso4217Code(str)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        r0 = com.appsflyer.internal.AFc1kSDK.AFAdRevenueData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        com.appsflyer.internal.AFc1kSDK.AFAdRevenueData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (com.appsflyer.internal.AFj1eSDK.getCurrencyIso4217Code(r0) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (com.appsflyer.internal.AFj1eSDK.getCurrencyIso4217Code(r0) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        r12.getCurrencyIso4217Code = r0.substring(0, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        r0 = com.appsflyer.internal.AFf1iSDK.hashCode + 47;
        com.appsflyer.internal.AFf1iSDK.equals = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void getRevenue(Map<String, Object> map, AFc1kSDK aFc1kSDK) {
        String currencyIso4217Code;
        if (AFj1eSDK.getCurrencyIso4217Code(aFc1kSDK.getCurrencyIso4217Code)) {
            int i = equals + 57;
            hashCode = i % 128;
            if (i % 2 != 0) {
                currencyIso4217Code = aFc1kSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
                int i2 = 10 / 0;
            } else {
                currencyIso4217Code = aFc1kSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
            }
        }
        String str = aFc1kSDK.getCurrencyIso4217Code;
        try {
            Object[] objArr = new Object[1];
            a((-1440266062) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1539935768 - View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (short) ((-11) - View.MeasureSpec.getMode(0)), objArr);
            long parseLong = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
            char[] charArray = str.toCharArray();
            int i3 = ((int) (parseLong % 94)) + 33;
            for (int i4 = 0; i4 < charArray.length; i4++) {
                equals = (hashCode + 97) % 128;
                charArray[i4] = (char) (charArray[i4] ^ i3);
            }
            map.put("sbid", new String(charArray));
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Exception occurred while generating sbid ", e);
        }
    }

    public final void component2() {
        Map<String, Object> map;
        Object AFAdRevenueData;
        int i = hashCode + 79;
        equals = i % 128;
        if (i % 2 == 0) {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() ^ this.getRevenue));
            map = this.getMediationNetwork;
            AFAdRevenueData = AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this));
        } else {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getRevenue));
            map = this.getMediationNetwork;
            AFAdRevenueData = AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this));
        }
        map.put("lvl_timestamp", Long.valueOf(((Long) AFAdRevenueData).longValue()));
    }

    @NonNull
    public final Map<String, Object> getCurrencyIso4217Code() {
        HashMap hashMap = new HashMap();
        if (component4()) {
            int i = hashCode + 5;
            equals = i % 128;
            int i2 = i % 2;
            Map<String, Object> map = this.getMediationNetwork;
            if (i2 == 0) {
                hashMap.put("lvl", map);
                throw null;
            }
            hashMap.put("lvl", map);
        } else if (this.getMonetizationNetwork) {
            this.getMediationNetwork = new HashMap();
            component2();
            this.getMediationNetwork.put("error", "pending LVL response");
            hashMap.put("lvl", this.getMediationNetwork);
        }
        int i3 = equals + 47;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return hashMap;
    }

    public final boolean getMediationNetwork() {
        int i = hashCode + 43;
        equals = i % 128;
        int i2 = i % 2;
        boolean z = this.component3;
        if (i2 == 0) {
            throw null;
        }
        int i3 = hashCode + 77;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
        return z;
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        AFc1jSDK aFc1jSDK = new AFc1jSDK(map, this.getCurrencyIso4217Code.getMonetizationNetwork);
        int i = hashCode + 39;
        equals = i % 128;
        if (i % 2 != 0) {
            return aFc1jSDK;
        }
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1iSDK aFf1iSDK = (AFf1iSDK) objArr[0];
        int i = hashCode + 51;
        equals = i % 128;
        if (i % 2 != 0) {
            return Long.valueOf(aFf1iSDK.getRevenue);
        }
        long j = aFf1iSDK.getRevenue;
        throw null;
    }

    public final String AFAdRevenueData() {
        equals = (hashCode + 23) % 128;
        String str = this.areAllFieldsValid;
        int i = equals + 79;
        hashCode = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
        return str;
    }

    public final void AFAdRevenueData(String str) {
        AFAdRevenueData(new Object[]{this, str}, 99232209, -99232207, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFf1iSDK aFf1iSDK = (AFf1iSDK) objArr[0];
        String str = (String) objArr[1];
        int i = equals + 119;
        hashCode = i % 128;
        if (i % 2 != 0) {
            aFf1iSDK.component2 = str;
            int i2 = 14 / 0;
        } else {
            aFf1iSDK.component2 = str;
        }
        hashCode = (equals + 9) % 128;
        return null;
    }

    public final void getCurrencyIso4217Code(AFc1kSDK aFc1kSDK) {
        this.getRevenue = System.currentTimeMillis();
        this.getMonetizationNetwork = this.AFAdRevenueData.AFAdRevenueData(getRevenue(aFc1kSDK), this.getCurrencyIso4217Code.getMonetizationNetwork, new AFf1lSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFf1iSDK.1
            @Override // com.appsflyer.internal.AFf1lSDK.AFa1vSDK
            public final void AFAdRevenueData(@NonNull String str, @NonNull String str2) {
                AFf1iSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1iSDK.this.getMediationNetwork.put("signedData", str);
                AFf1iSDK.this.getMediationNetwork.put("signature", str2);
                AFf1iSDK.this.component2();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1lSDK.AFa1vSDK
            public final void getMediationNetwork(String str, Exception exc) {
                AFf1iSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1iSDK.this.component2();
                AFf1iSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        int i = equals + 69;
        hashCode = i % 128;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
        }
    }

    public final String getCurrencyIso4217Code(AFc1sSDK aFc1sSDK) {
        return (String) AFAdRevenueData(new Object[]{this, aFc1sSDK}, 527487030, -527487030, System.identityHashCode(this));
    }

    public final String getRevenue() {
        hashCode = (equals + 37) % 128;
        String str = this.component2;
        equals = (hashCode + 45) % 128;
        return str;
    }

    public final void getRevenue(boolean z) {
        equals = (hashCode + 73) % 128;
        this.component3 = z;
        equals = (hashCode + 27) % 128;
    }

    public final Map<String, Object> getRevenue(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getCurrencyIso4217Code.getMonetizationNetwork};
                Map map2 = AFa1gSDK.e;
                Object obj = map2.get(-2122095116);
                if (obj == null) {
                    obj = ((Class) AFa1gSDK.getMonetizationNetwork(TextUtils.getOffsetAfter("", 0) + 37, 123 - MotionEvent.axisFromString(""), (char) Gravity.getAbsoluteGravity(0, 0))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(-2122095116, obj);
                }
                Map<String, Object> map3 = (Map) ((Constructor) obj).newInstance(objArr);
                int i = equals + 121;
                hashCode = i % 128;
                if (i % 2 == 0) {
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

    private long getRevenue(AFc1kSDK aFc1kSDK) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFb1kSDK.getMonetizationNetwork(aFc1kSDK.getRevenue));
        sb.append(((Long) AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this))).longValue());
        long monetizationNetwork = AFj1hSDK.getMonetizationNetwork(AFj1hSDK.getMediationNetwork(sb.toString()));
        equals = (hashCode + 111) % 128;
        return monetizationNetwork;
    }

    private static boolean getRevenue(Context context) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i = hashCode + 117;
            equals = i % 128;
            if (i % 2 != 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                AFa1zSDK.getMonetizationNetwork();
                if (AFa1zSDK.getMonetizationNetwork(context)) {
                    equals = (hashCode + 15) % 128;
                    return false;
                }
            }
        }
        return true;
    }

    public final void getRevenue(@NonNull String str) {
        hashCode = (equals + 59) % 128;
        this.areAllFieldsValid = str;
        hashCode = (equals + 29) % 128;
    }

    public static void getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        try {
            new AFb1sSDK(aFh1tSDK).afInfoLog();
            int i = equals + 99;
            hashCode = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
        }
    }

    public final boolean getMonetizationNetwork() {
        equals = (hashCode + 45) % 128;
        if (!this.getMonetizationNetwork || component4()) {
            return false;
        }
        int i = equals + 21;
        hashCode = i % 128;
        if (i % 2 == 0) {
            return true;
        }
        throw null;
    }
}
