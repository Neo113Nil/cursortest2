package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String AFAdRevenueData = null;
    private static int areAllFieldsValid = 0;
    private static byte[] component1 = null;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copy = 0;
    private static int copydefault = 1;
    private static short[] equals;
    private static String getRevenue;
    private final AFe1iSDK component4;
    private final AFe1wSDK getCurrencyIso4217Code;
    private final AFd1qSDK getMediationNetwork;
    private final AppsFlyerProperties getMonetizationNetwork;

    static {
        getCurrencyIso4217Code();
        AFAdRevenueData = "https://%sgcdsdk.%s/install_data/v5.0/";
        getRevenue = "https://%sonelink.%s/shortlink-sdk/v2";
        int i2 = copydefault + 55;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public AFe1qSDK(AFe1wSDK aFe1wSDK, AFd1qSDK aFd1qSDK, AppsFlyerProperties appsFlyerProperties, AFe1iSDK aFe1iSDK) {
        this.getCurrencyIso4217Code = aFe1wSDK;
        this.getMediationNetwork = aFd1qSDK;
        this.getMonetizationNetwork = appsFlyerProperties;
        this.component4 = aFe1iSDK;
    }

    private static void a(short s, int i2, int i3, int i4, byte b2, Object[] objArr) {
        int i5;
        boolean z;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        StringBuilder sb = new StringBuilder();
        int i6 = ((int) (((long) component2) ^ 3554368215783393998L)) + i2;
        boolean z2 = !(i6 != -1);
        if ((z2 ? 'c' : '\t') != '\t') {
            byte[] bArr = component1;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = $10 + 9;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    bArr2[i7] = (byte) (((long) bArr[i7]) ^ 3554368215783393998L);
                }
                bArr = bArr2;
            }
            i6 = bArr != null ? (byte) (((byte) (((long) component1[i3 + ((int) (((long) component3) ^ 3554368215783393998L))]) ^ 3554368215783393998L)) + ((int) (((long) component2) ^ 3554368215783393998L))) : (short) (((short) (((long) equals[i3 + ((int) (((long) component3) ^ 3554368215783393998L))]) ^ 3554368215783393998L)) + ((int) (((long) component2) ^ 3554368215783393998L)));
        }
        if (i6 > 0) {
            int i10 = ((i3 + i6) - 2) + ((int) (((long) component3) ^ 3554368215783393998L));
            if (!(!z2)) {
                int i11 = $11 + 41;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i5 = 1;
            } else {
                i5 = 0;
            }
            aFk1jSDK.getCurrencyIso4217Code = i10 + i5;
            char c2 = (char) (i4 + ((int) (((long) areAllFieldsValid) ^ 3554368215783393998L)));
            aFk1jSDK.AFAdRevenueData = c2;
            sb.append(c2);
            aFk1jSDK.getMonetizationNetwork = aFk1jSDK.AFAdRevenueData;
            byte[] bArr3 = component1;
            if (!(bArr3 == null)) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i13 = 0; i13 < length2; i13++) {
                    int i14 = $10 + 33;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    bArr4[i13] = (byte) (((long) bArr3[i13]) ^ 3554368215783393998L);
                }
                bArr3 = bArr4;
            }
            if ((bArr3 != null ? '\\' : '\b') != '\\') {
                z = false;
            } else {
                int i16 = $11 + 71;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                z = true;
            }
            aFk1jSDK.getRevenue = 1;
            while (aFk1jSDK.getRevenue < i6) {
                if (z) {
                    byte[] bArr5 = component1;
                    int i18 = aFk1jSDK.getCurrencyIso4217Code;
                    aFk1jSDK.getCurrencyIso4217Code = i18 - 1;
                    aFk1jSDK.AFAdRevenueData = (char) (aFk1jSDK.getMonetizationNetwork + (((byte) (((byte) (((long) bArr5[i18]) ^ 3554368215783393998L)) + s)) ^ b2));
                    int i19 = $10 + 107;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                } else {
                    short[] sArr = equals;
                    int i21 = aFk1jSDK.getCurrencyIso4217Code;
                    aFk1jSDK.getCurrencyIso4217Code = i21 - 1;
                    aFk1jSDK.AFAdRevenueData = (char) (aFk1jSDK.getMonetizationNetwork + (((short) (((short) (((long) sArr[i21]) ^ 3554368215783393998L)) + s)) ^ b2));
                }
                sb.append(aFk1jSDK.AFAdRevenueData);
                aFk1jSDK.getMonetizationNetwork = aFk1jSDK.AFAdRevenueData;
                aFk1jSDK.getRevenue++;
            }
        }
        objArr[0] = sb.toString();
    }

    private <T> AFe1tSDK<T> getMonetizationNetwork(AFe1mSDK aFe1mSDK, AFe1jSDK<T> aFe1jSDK, boolean z) {
        aFe1mSDK.getMonetizationNetwork = z;
        AFe1wSDK aFe1wSDK = this.getCurrencyIso4217Code;
        AFe1tSDK<T> aFe1tSDK = new AFe1tSDK<>(aFe1mSDK, aFe1wSDK.getMonetizationNetwork, aFe1wSDK.getMediationNetwork, aFe1jSDK);
        int i2 = copy + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        return aFe1tSDK;
    }

    public final AFe1tSDK<String> AFAdRevenueData(AFa1oSDK aFa1oSDK, String str, AFd1nSDK aFd1nSDK) {
        int i2 = copydefault + 43;
        copy = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr = {aFa1oSDK, str, aFd1nSDK};
            Map map = AFa1vSDK.registerClient;
            Object method = map.get(1754022303);
            if (method == null) {
                method = ((Class) AFa1vSDK.getRevenue(TextUtils.lastIndexOf("", '0') + 36, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, (char) View.combineMeasuredStates(0, 0))).getMethod("getRevenue", AFa1oSDK.class, String.class, AFd1nSDK.class);
                map.put(1754022303, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            int i4 = copy + 49;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFa1oSDK.component4, bArr, "POST", Collections.emptyMap(), aFa1oSDK.AFAdRevenueData()), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th2);
                return null;
            }
        }
    }

    public final AFe1tSDK<Map<String, String>> getCurrencyIso4217Code(String str, String str2, UUID uuid, String str3) {
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, str, str2, uuid, str3}, -15930200, 15930202, System.identityHashCode(this));
    }

    public final AFe1tSDK<Map<String, Object>> getMediationNetwork(String str, String str2) {
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, str, str2}, -465858035, 465858035, System.identityHashCode(this));
    }

    public final AFe1tSDK<AFc1pSDK> getRevenue(AFc1qSDK aFc1qSDK) {
        AFe1tSDK<AFc1pSDK> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFc1qSDK.component4, AFa1mSDK.getMediationNetwork((Map<String, ?>) aFc1qSDK.getMonetizationNetwork()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), aFc1qSDK.AFAdRevenueData()), new AFc1jSDK()}, -194014191, 194014192, System.identityHashCode(this));
        int i2 = copydefault + 105;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return aFe1tSDK;
        }
        int i3 = 97 / 0;
        return aFe1tSDK;
    }

    private <T> AFe1tSDK<T> AFAdRevenueData(AFe1mSDK aFe1mSDK, AFe1jSDK<T> aFe1jSDK) {
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, aFe1mSDK, aFe1jSDK}, -194014191, 194014192, System.identityHashCode(this));
    }

    public final AFe1tSDK<String> getCurrencyIso4217Code(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", "-1");
        map2.put("uuid", string);
        map2.put("data", map);
        map2.put("meta", getRevenue());
        if (!(str2 == null)) {
            int i2 = copydefault + 5;
            copy = i2 % 128;
            char c2 = i2 % 2 != 0 ? (char) 15 : (char) 11;
            map2.put("brand_domain", str2);
            if (c2 != 11) {
                throw null;
            }
            int i3 = copy + 59;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        String string2 = AFa1mSDK.getMediationNetwork((Map<String, ?>) map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getTouchSlop() >> 8), (-67) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-864846193) - View.resolveSizeAndState(0, 0, 0), View.getDefaultSize(0, 0) + 1981934312, (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
        map3.put(((String) objArr[0]).intern(), getRevenue(str3, string, "POST", string2));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        sb.append("/");
        sb.append(str);
        return getMonetizationNetwork(new AFe1mSDK(sb.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), new AFe1oSDK(), true);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    public final AFe1tSDK<String> getMediationNetwork(Map<String, Object> map, String str, String str2) throws Throwable {
        boolean z;
        boolean z2;
        AFj1bSDK aFj1bSDK;
        String str3;
        int i2 = copy + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1vSDK.registerClient;
            Object method = map2.get(-113710151);
            if (method == null) {
                method = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getScrollDefaultDelay() >> 16) + 35, TextUtils.getOffsetAfter("", 0) + 37, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                map2.put(-113710151, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMediationNetwork);
            if ((str2 != null ? (char) 20 : 'F') == 20) {
                if ((str2.length() == 0 ? 'E' : ':') != 'E') {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            if (z || new Regex("4.?(\\d+)?.?(\\d+)").b(str2)) {
                z2 = true;
            } else {
                if ((new Regex("3.?(\\d+)?.?(\\d+)").b(str2) ? (char) 22 : '\r') != 22) {
                    int i4 = copy + 77;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (!(z2 ? false : true)) {
                int i6 = copy + 23;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                aFj1bSDK = aFj1jSDK.AFAdRevenueData;
                str3 = "https://%sviap.%s/api/v1/android/validate_purchase?app_id=";
            } else {
                aFj1bSDK = aFj1jSDK.AFAdRevenueData;
                str3 = "https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=";
            }
            return (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getRevenue(aFj1jSDK.getMediationNetwork(aFj1bSDK.getMonetizationNetwork(str3))), bArr, "POST", Collections.emptyMap(), true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e2) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e2);
                return null;
            }
        }
    }

    public final AFe1tSDK<String> getMonetizationNetwork(String str) {
        AFe1mSDK aFe1mSDK = new AFe1mSDK(str, null, "GET", Collections.emptyMap(), false);
        aFe1mSDK.component3 = 10000;
        aFe1mSDK.AFAdRevenueData = false;
        AFe1tSDK<String> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, aFe1mSDK, new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        int i2 = copy + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return aFe1tSDK;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    public final AFe1tSDK<String> getRevenue(Map<String, Object> map, String str, String str2) throws Throwable {
        boolean z;
        AFj1bSDK aFj1bSDK;
        String str3;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1vSDK.registerClient;
            Object method = map2.get(-113710151);
            boolean z2 = true;
            if (method == null) {
                method = ((Class) AFa1vSDK.getRevenue(34 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 38, (char) (ImageFormat.getBitsPerPixel(0) + 1))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                map2.put(-113710151, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMediationNetwork);
            if (!(str2 == null)) {
                int i2 = copydefault + 25;
                copy = i2 % 128;
                int i3 = i2 % 2;
                if (str2.length() == 0) {
                    z = true;
                } else {
                    int i4 = copydefault + 103;
                    copy = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                }
            } else {
                z = true;
            }
            if (z || new Regex("4.?(\\d+)?.?(\\d+)").b(str2) || new Regex("3.?(\\d+)?.?(\\d+)").b(str2)) {
                int i6 = copydefault + 95;
                copy = i6 % 128;
                int i7 = i6 % 2;
            } else {
                z2 = false;
            }
            if ((z2 ? (char) 17 : '$') != 17) {
                aFj1bSDK = aFj1jSDK.AFAdRevenueData;
                str3 = "https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=";
            } else {
                int i8 = copydefault + 105;
                copy = i8 % 128;
                int i9 = i8 % 2;
                aFj1bSDK = aFj1jSDK.AFAdRevenueData;
                str3 = "https://%sars.%s/api/v2/android/validate_subscription?app_id=";
            }
            return (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getRevenue(aFj1jSDK.getMediationNetwork(aFj1bSDK.getMonetizationNetwork(str3))), bArr, "POST", Collections.emptyMap(), true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e2) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e2);
                return null;
            }
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        UUID uuid = (UUID) objArr[3];
        String str3 = (String) objArr[4];
        String string = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String string2 = sb.toString();
        Map<String, Object> revenue = aFe1qSDK.getRevenue();
        String strValueOf = String.valueOf(revenue.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(revenue.get("counter")));
        map.put("Af-Meta-Model", String.valueOf(revenue.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(revenue.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(revenue.get("sdk")));
        Object[] objArr2 = new Object[1];
        a((short) (Process.myPid() >> 22), (-68) - View.resolveSizeAndState(0, 0, 0), (-864846193) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1981934312 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr2);
        map.put(((String) objArr2[0]).intern(), getRevenue(str3, string, "GET", string, str, str2, strValueOf));
        AFe1tSDK aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{aFe1qSDK, new AFe1mSDK(string2, null, "GET", map, false), new AFe1gSDK()}, -194014191, 194014192, System.identityHashCode(aFe1qSDK));
        int i2 = copy + 45;
        copydefault = i2 % 128;
        if ((i2 % 2 == 0 ? '8' : 'N') != '8') {
            return aFe1tSDK;
        }
        throw null;
    }

    private static String getRevenue(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String monetizationNetwork = AFb1jSDK.getMonetizationNetwork(strJoin, sb.toString());
        int i2 = copydefault + 11;
        copy = i2 % 128;
        if ((i2 % 2 != 0 ? '2' : '1') != '2') {
            return monetizationNetwork;
        }
        throw null;
    }

    public final AFe1tSDK<String> AFAdRevenueData(AFh1hSDK aFh1hSDK) {
        AFe1tSDK<String> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFh1hSDK.component4, aFh1hSDK.getMediationNetwork(), "POST", Collections.emptyMap(), true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        int i2 = copydefault + 31;
        copy = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 28 : 'X') != 28) {
            return aFe1tSDK;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038 A[PHI: r13
      0x0038: PHI (r13v10 com.appsflyer.internal.AFe1iSDK) = (r13v6 com.appsflyer.internal.AFe1iSDK), (r13v11 com.appsflyer.internal.AFe1iSDK) binds: [B:18:0x0036, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003b A[PHI: r13
      0x003b: PHI (r13v7 com.appsflyer.internal.AFe1iSDK) = (r13v6 com.appsflyer.internal.AFe1iSDK), (r13v11 com.appsflyer.internal.AFe1iSDK) binds: [B:18:0x0036, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public final AFe1tSDK<AFi1vSDK> getCurrencyIso4217Code(boolean z, boolean z2, String str, int i2) {
        AFe1iSDK aFe1iSDK;
        int i3;
        String str2;
        String str3;
        String str4;
        int i4 = copy + 29;
        copydefault = i4 % 128;
        if (!(i4 % 2 == 0)) {
            aFe1iSDK = this.component4;
            Intrinsics.checkNotNullParameter(str, "");
            if ((z ? 'T' : '<') != '<') {
                i3 = copy + 27;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    str2 = AFe1iSDK.AFAdRevenueData;
                    int i5 = 26 / 0;
                } else {
                    str2 = AFe1iSDK.AFAdRevenueData;
                }
            } else {
                str2 = AFe1iSDK.getMediationNetwork;
            }
        } else {
            aFe1iSDK = this.component4;
            Intrinsics.checkNotNullParameter(str, "");
            int i6 = 51 / 0;
            if ((z ? '.' : (char) 21) != '.') {
                str2 = AFe1iSDK.getMediationNetwork;
            } else {
                i3 = copy + 27;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    str2 = AFe1iSDK.AFAdRevenueData;
                    int i7 = 26 / 0;
                } else {
                    str2 = AFe1iSDK.AFAdRevenueData;
                }
            }
        }
        if ((z2 ? (char) 29 : 'U') != 'U') {
            int i8 = copydefault + 119;
            copy = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            str3 = "stg";
        } else {
            str3 = "";
        }
        Object[] objArr = new Object[4];
        if (AFe1iSDK.getCurrencyIso4217Code()) {
            int i9 = copy + 117;
            copydefault = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            str4 = (String) ((f.g) aFe1iSDK.getMonetizationNetwork).a();
        } else {
            str4 = "";
        }
        objArr[0] = str4;
        objArr[1] = str3;
        objArr[2] = aFe1iSDK.AFAdRevenueData();
        objArr[3] = str;
        String str5 = String.format(str2, Arrays.copyOf(objArr, 4));
        Intrinsics.checkNotNullExpressionValue(str5, "");
        AFe1mSDK aFe1mSDK = new AFe1mSDK(str5, "GET");
        aFe1mSDK.component3 = 1500;
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, aFe1mSDK, new AFe1pSDK()}, -194014191, 194014192, System.identityHashCode(this));
    }

    public final AFe1tSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1vSDK.registerClient;
            Object method = map2.get(-113710151);
            if (method == null) {
                method = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34, View.MeasureSpec.makeMeasureSpec(0, 0) + 37, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                map2.put(-113710151, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            int i2 = copy + 71;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMediationNetwork);
            AFe1tSDK<String> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getMediationNetwork(aFj1jSDK.AFAdRevenueData.getMonetizationNetwork("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr, "POST", Collections.emptyMap(), true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
            int i4 = copydefault + 47;
            copy = i4 % 128;
            int i5 = i4 % 2;
            return aFe1tSDK;
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFh1vSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th2, false, false);
                return null;
            }
        }
    }

    public static void getCurrencyIso4217Code() {
        component3 = 1161415615;
        component2 = 1991592606;
        areAllFieldsValid = -9740393;
        component1 = new byte[]{61, 51, -49, -35, 61, -55, 48, -40, -24, 9, -21, 56, -61, 33, -34, -50, -50};
    }

    private boolean getMediationNetwork() {
        if (this.getMonetizationNetwork.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return false;
        }
        int i2 = copydefault + 77;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        AFe1mSDK aFe1mSDK = (AFe1mSDK) objArr[1];
        AFe1jSDK aFe1jSDK = (AFe1jSDK) objArr[2];
        int i2 = copy + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AFe1tSDK monetizationNetwork = aFe1qSDK.getMonetizationNetwork(aFe1mSDK, aFe1jSDK, aFe1qSDK.getMediationNetwork());
        int i4 = copy + 59;
        copydefault = i4 % 128;
        if ((i4 % 2 == 0 ? (char) 11 : 'H') == 'H') {
            return monetizationNetwork;
        }
        throw null;
    }

    private Map<String, Object> getRevenue() {
        HashMap map = new HashMap();
        map.put("build_number", "6.15.2");
        map.put("counter", Integer.valueOf(this.getMediationNetwork.getRevenue.getMediationNetwork("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a((short) View.MeasureSpec.makeMeasureSpec(0, 0), Color.alpha(0) - 75, TextUtils.indexOf((CharSequence) "", '0', 0) - 864846181, 1981934345 - Color.red(0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData;
        map.put("app_version_name", AFb1qSDK.getMediationNetwork(context, context.getPackageName()));
        map.put("app_id", this.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData.getPackageName());
        map.put("platformextension", new AFb1aSDK().getMediationNetwork());
        int i2 = copydefault + 29;
        copy = i2 % 128;
        if ((i2 % 2 != 0 ? '`' : '^') != '`') {
            return map;
        }
        int i3 = 28 / 0;
        return map;
    }

    public final AFe1ySDK AFAdRevenueData(Map<String, Object> map, String str) throws Throwable {
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1vSDK.registerClient;
                Object method = map2.get(-113710151);
                if (method == null) {
                    method = ((Class) AFa1vSDK.getRevenue(MotionEvent.axisFromString("") + 36, 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                    map2.put(-113710151, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                    return null;
                }
                int i2 = copy + 99;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AFe1ySDK aFe1ySDK = new AFe1ySDK(this.getMediationNetwork, bArr);
                int i4 = copy + 101;
                copydefault = i4 % 128;
                if ((i4 % 2 == 0 ? 'U' : '+') == '+') {
                    return aFe1ySDK;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e2);
            return null;
        }
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i2, int i3, int i4) {
        int i5 = ~i2;
        int i6 = ((~(i5 | i3 | i4)) * 521) + (i3 * 522) + (i2 * (-520));
        int i7 = ~(i2 | (~i3));
        int i8 = ((i7 | (~(i3 | (~i4) | i5))) * 521) + (i7 * (-1042)) + i6;
        if (i8 == 1) {
            return getMonetizationNetwork(objArr);
        }
        if (i8 == 2) {
            return getMediationNetwork(objArr);
        }
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String packageName = aFe1qSDK.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        AFd1qSDK aFd1qSDK = aFe1qSDK.getMediationNetwork;
        AFe1tSDK aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{aFe1qSDK, AFe1sSDK.getRevenue(packageName, AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue), str, str2), new AFe1rSDK()}, -194014191, 194014192, System.identityHashCode(aFe1qSDK));
        int i9 = copydefault + 119;
        copy = i9 % 128;
        int i10 = i9 % 2;
        return aFe1tSDK;
    }
}
