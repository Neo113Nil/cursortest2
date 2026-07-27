package com.appsflyer.internal;

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
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.ConnectionResult;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
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

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * (-520)) + (i2 * 522) + ((~(i4 | i2 | i3)) * 521);
        int i6 = ~(i | (~i2));
        int i7 = i5 + (i6 * (-1042)) + ((i6 | (~(i2 | (~i3) | i4))) * 521);
        if (i7 == 1) {
            return getMonetizationNetwork(objArr);
        }
        if (i7 == 2) {
            return getMediationNetwork(objArr);
        }
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i8 = 2 % 2;
        String packageName = aFe1qSDK.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        AFd1qSDK aFd1qSDK = aFe1qSDK.getMediationNetwork;
        AFe1tSDK aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{aFe1qSDK, AFe1sSDK.getRevenue(packageName, AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue), str, str2), new AFe1rSDK()}, -194014191, 194014192, System.identityHashCode(aFe1qSDK));
        int i9 = copydefault + 119;
        copy = i9 % 128;
        int i10 = i9 % 2;
        return aFe1tSDK;
    }

    static {
        getCurrencyIso4217Code();
        AFAdRevenueData = "https://%sgcdsdk.%s/install_data/v5.0/";
        getRevenue = "https://%sonelink.%s/shortlink-sdk/v2";
        int i = copydefault + 55;
        copy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public AFe1qSDK(AFe1wSDK aFe1wSDK, AFd1qSDK aFd1qSDK, AppsFlyerProperties appsFlyerProperties, AFe1iSDK aFe1iSDK) {
        this.getCurrencyIso4217Code = aFe1wSDK;
        this.getMediationNetwork = aFd1qSDK;
        this.getMonetizationNetwork = appsFlyerProperties;
        this.component4 = aFe1iSDK;
    }

    public final AFe1tSDK<String> getRevenue(Map<String, Object> map, String str, String str2) {
        String monetizationNetwork;
        int i = 2 % 2;
        try {
            Object[] objArr = {map, str};
            Object obj = AFa1vSDK.registerClient.get(-113710151);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue(34 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 38, (char) (ImageFormat.getBitsPerPixel(0) + 1))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                AFa1vSDK.registerClient.put(-113710151, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMediationNetwork);
            String str3 = str2;
            if (str3 != null) {
                int i2 = copydefault + 25;
                copy = i2 % 128;
                int i3 = i2 % 2;
                if (str3.length() != 0) {
                    int i4 = copydefault + 103;
                    copy = i4 % 128;
                    int i5 = i4 % 2;
                    if (!new Regex("4.?(\\d+)?.?(\\d+)").matches(str3) && !new Regex("3.?(\\d+)?.?(\\d+)").matches(str3)) {
                        monetizationNetwork = aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getRevenue(aFj1jSDK.getMediationNetwork(monetizationNetwork)), bArr, "POST", Collections.emptyMap(), true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
                    }
                }
            }
            int i6 = copydefault;
            int i7 = i6 + 95;
            copy = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 105;
            copy = i9 % 128;
            int i10 = i9 % 2;
            monetizationNetwork = aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            return (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getRevenue(aFj1jSDK.getMediationNetwork(monetizationNetwork)), bArr, "POST", Collections.emptyMap(), true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                return null;
            }
        }
    }

    public final AFe1tSDK<String> getMediationNetwork(Map<String, Object> map, String str, String str2) {
        String monetizationNetwork;
        int i = 2 % 2;
        int i2 = copy + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr = {map, str};
            boolean z = false;
            Object obj = AFa1vSDK.registerClient.get(-113710151);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getScrollDefaultDelay() >> 16) + 35, TextUtils.getOffsetAfter("", 0) + 37, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                AFa1vSDK.registerClient.put(-113710151, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMediationNetwork);
            String str3 = str2;
            if (str3 == null || str3.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").matches(str3) || new Regex("3.?(\\d+)?.?(\\d+)").matches(str3)) {
                z = true;
            } else {
                int i4 = copy + 77;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
            if (!(!z)) {
                int i6 = copy + 23;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                monetizationNetwork = aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            } else {
                monetizationNetwork = aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
            }
            return (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getRevenue(aFj1jSDK.getMediationNetwork(monetizationNetwork)), bArr, "POST", Collections.emptyMap(), true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                return null;
            }
        }
    }

    public final AFe1tSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
        int i = 2 % 2;
        try {
            Object[] objArr = {map, str};
            Object obj = AFa1vSDK.registerClient.get(-113710151);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34, View.MeasureSpec.makeMeasureSpec(0, 0) + 37, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                AFa1vSDK.registerClient.put(-113710151, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            int i2 = copy + 71;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMediationNetwork);
            AFe1tSDK<String> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFj1jSDK.getMediationNetwork(aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr, "POST", Collections.emptyMap(), true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0023, code lost:
    
        r6 = com.appsflyer.internal.AFe1qSDK.copy + 27;
        com.appsflyer.internal.AFe1qSDK.copydefault = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        if ((r6 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        r6 = com.appsflyer.internal.AFe1iSDK.AFAdRevenueData;
        r2 = 26 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
    
        r6 = com.appsflyer.internal.AFe1iSDK.AFAdRevenueData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0021, code lost:
    
        if (r6 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r6 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
    
        r6 = com.appsflyer.internal.AFe1iSDK.getMediationNetwork;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1tSDK<AFi1vSDK> getCurrencyIso4217Code(boolean z, boolean z2, String str, int i) {
        AFe1iSDK aFe1iSDK;
        String str2;
        String str3;
        String str4;
        int i2 = 2 % 2;
        int i3 = copy + 29;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            aFe1iSDK = this.component4;
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = 51 / 0;
        } else {
            aFe1iSDK = this.component4;
            Intrinsics.checkNotNullParameter(str, "");
        }
        Object obj = null;
        if (z2) {
            int i5 = copydefault + 119;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str3 = "stg";
        } else {
            str3 = "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        if (AFe1iSDK.getCurrencyIso4217Code()) {
            int i6 = copy + 117;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str4 = (String) aFe1iSDK.getCurrencyIso4217Code.getValue();
        } else {
            str4 = "";
        }
        String format = String.format(str2, Arrays.copyOf(new Object[]{str4, str3, aFe1iSDK.AFAdRevenueData(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFe1mSDK aFe1mSDK = new AFe1mSDK(format, "GET");
        aFe1mSDK.component3 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, aFe1mSDK, new AFe1pSDK()}, -194014191, 194014192, System.identityHashCode(this));
    }

    public final AFe1tSDK<String> AFAdRevenueData(AFa1oSDK aFa1oSDK, String str, AFd1nSDK aFd1nSDK) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        copy = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr = {aFa1oSDK, str, aFd1nSDK};
            Object obj = AFa1vSDK.registerClient.get(1754022303);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue(TextUtils.lastIndexOf("", '0') + 36, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, (char) View.combineMeasuredStates(0, 0))).getMethod("getRevenue", AFa1oSDK.class, String.class, AFd1nSDK.class);
                AFa1vSDK.registerClient.put(1754022303, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
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

    public final AFe1tSDK<AFc1pSDK> getRevenue(AFc1qSDK aFc1qSDK) {
        int i = 2 % 2;
        AFe1tSDK<AFc1pSDK> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFc1qSDK.component4, AFa1mSDK.getMediationNetwork((Map<String, ?>) aFc1qSDK.getMonetizationNetwork()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), aFc1qSDK.AFAdRevenueData()), new AFc1jSDK()}, -194014191, 194014192, System.identityHashCode(this));
        int i2 = copydefault + 105;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        return aFe1tSDK;
    }

    public final AFe1tSDK<String> AFAdRevenueData(AFh1hSDK aFh1hSDK) {
        int i = 2 % 2;
        AFe1tSDK<String> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, new AFe1mSDK(aFh1hSDK.component4, aFh1hSDK.getMediationNetwork(), "POST", Collections.emptyMap(), true), new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        int i2 = copydefault + 31;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return aFe1tSDK;
        }
        throw null;
    }

    private static void a(short s, int i, int i2, int i3, byte b, Object[] objArr) {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        StringBuilder sb = new StringBuilder();
        int i6 = ((int) (component2 ^ 3554368215783393998L)) + i;
        boolean z2 = i6 != -1;
        if (!z2) {
            byte[] bArr = component1;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = $10 + 9;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    bArr2[i7] = (byte) (bArr[i7] ^ 3554368215783393998L);
                }
                bArr = bArr2;
            }
            i6 = bArr != null ? (byte) (((byte) (component1[i2 + ((int) (component3 ^ 3554368215783393998L))] ^ 3554368215783393998L)) + ((int) (component2 ^ 3554368215783393998L))) : (short) (((short) (equals[i2 + ((int) (component3 ^ 3554368215783393998L))] ^ 3554368215783393998L)) + ((int) (component2 ^ 3554368215783393998L)));
        }
        if (i6 > 0) {
            int i10 = ((i2 + i6) - 2) + ((int) (component3 ^ 3554368215783393998L));
            if (!z2) {
                int i11 = $11 + 41;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            aFk1jSDK.getCurrencyIso4217Code = i10 + i4;
            aFk1jSDK.AFAdRevenueData = (char) (i3 + ((int) (areAllFieldsValid ^ 3554368215783393998L)));
            sb.append(aFk1jSDK.AFAdRevenueData);
            aFk1jSDK.getMonetizationNetwork = aFk1jSDK.AFAdRevenueData;
            byte[] bArr3 = component1;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i13 = 0; i13 < length2; i13++) {
                    int i14 = $10 + 33;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    bArr4[i13] = (byte) (bArr3[i13] ^ 3554368215783393998L);
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i16 = $11 + 71;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                z = true;
            } else {
                z = false;
            }
            aFk1jSDK.getRevenue = 1;
            while (aFk1jSDK.getRevenue < i6) {
                if (z) {
                    byte[] bArr5 = component1;
                    aFk1jSDK.getCurrencyIso4217Code = aFk1jSDK.getCurrencyIso4217Code - 1;
                    aFk1jSDK.AFAdRevenueData = (char) (aFk1jSDK.getMonetizationNetwork + (((byte) (((byte) (bArr5[r10] ^ 3554368215783393998L)) + s)) ^ b));
                    int i18 = $10 + 107;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                } else {
                    short[] sArr = equals;
                    aFk1jSDK.getCurrencyIso4217Code = aFk1jSDK.getCurrencyIso4217Code - 1;
                    aFk1jSDK.AFAdRevenueData = (char) (aFk1jSDK.getMonetizationNetwork + (((short) (((short) (sArr[r10] ^ 3554368215783393998L)) + s)) ^ b));
                }
                sb.append(aFk1jSDK.AFAdRevenueData);
                aFk1jSDK.getMonetizationNetwork = aFk1jSDK.AFAdRevenueData;
                aFk1jSDK.getRevenue++;
            }
        }
        objArr[0] = sb.toString();
    }

    public final AFe1tSDK<String> getCurrencyIso4217Code(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        int i = 2 % 2;
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", getRevenue());
        if (str2 != null) {
            int i2 = copydefault + 5;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                hashMap.put("brand_domain", str2);
                throw null;
            }
            hashMap.put("brand_domain", str2);
            int i3 = copy + 59;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        String jSONObject = AFa1mSDK.getMediationNetwork((Map<String, ?>) hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getTouchSlop() >> 8), (-67) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-864846193) - View.resolveSizeAndState(0, 0, 0), View.getDefaultSize(0, 0) + 1981934312, (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
        hashMap2.put(((String) objArr[0]).intern(), getRevenue(str3, obj, "POST", jSONObject));
        return getMonetizationNetwork(new AFe1mSDK(new StringBuilder().append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName())).append("/").append(str).toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), new AFe1oSDK(), true);
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        UUID uuid = (UUID) objArr[3];
        String str3 = (String) objArr[4];
        int i = 2 % 2;
        String obj = uuid.toString();
        String obj2 = new StringBuilder().append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName())).append("/").append(str).append("?id=").append(str2).toString();
        Map<String, Object> revenue = aFe1qSDK.getRevenue();
        String valueOf = String.valueOf(revenue.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf);
        hashMap.put("Af-Meta-Counter", String.valueOf(revenue.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(revenue.get(DeviceRequestsHelper.DEVICE_INFO_MODEL)));
        hashMap.put("Af-Meta-Platform", String.valueOf(revenue.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(revenue.get(ServerProtocol.DIALOG_PARAM_SDK_VERSION)));
        Object[] objArr2 = new Object[1];
        a((short) (Process.myPid() >> 22), (-68) - View.resolveSizeAndState(0, 0, 0), (-864846193) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1981934312 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr2);
        hashMap.put(((String) objArr2[0]).intern(), getRevenue(str3, obj, "GET", obj, str, str2, valueOf));
        AFe1tSDK aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{aFe1qSDK, new AFe1mSDK(obj2, null, "GET", hashMap, false), new AFe1gSDK()}, -194014191, 194014192, System.identityHashCode(aFe1qSDK));
        int i2 = copy + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return aFe1tSDK;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final AFe1tSDK<String> getMonetizationNetwork(String str) {
        int i = 2 % 2;
        AFe1mSDK aFe1mSDK = new AFe1mSDK(str, null, "GET", Collections.emptyMap(), false);
        aFe1mSDK.component3 = 10000;
        aFe1mSDK.AFAdRevenueData = false;
        AFe1tSDK<String> aFe1tSDK = (AFe1tSDK) AFAdRevenueData(new Object[]{this, aFe1mSDK, new AFe1oSDK()}, -194014191, 194014192, System.identityHashCode(this));
        int i2 = copy + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return aFe1tSDK;
    }

    public final AFe1ySDK AFAdRevenueData(Map<String, Object> map, String str) {
        int i = 2 % 2;
        try {
            try {
                Object[] objArr = {map, str};
                Object obj = AFa1vSDK.registerClient.get(-113710151);
                if (obj == null) {
                    obj = ((Class) AFa1vSDK.getRevenue(MotionEvent.axisFromString("") + 36, 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                    AFa1vSDK.registerClient.put(-113710151, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
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
                if (i4 % 2 != 0) {
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
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
            return null;
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFe1qSDK aFe1qSDK = (AFe1qSDK) objArr[0];
        AFe1mSDK aFe1mSDK = (AFe1mSDK) objArr[1];
        AFe1jSDK aFe1jSDK = (AFe1jSDK) objArr[2];
        int i = 2 % 2;
        int i2 = copy + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AFe1tSDK monetizationNetwork = aFe1qSDK.getMonetizationNetwork(aFe1mSDK, aFe1jSDK, aFe1qSDK.getMediationNetwork());
        int i4 = copy + 59;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return monetizationNetwork;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private <T> AFe1tSDK<T> getMonetizationNetwork(AFe1mSDK aFe1mSDK, AFe1jSDK<T> aFe1jSDK, boolean z) {
        int i = 2 % 2;
        aFe1mSDK.getMonetizationNetwork = z;
        AFe1wSDK aFe1wSDK = this.getCurrencyIso4217Code;
        AFe1tSDK<T> aFe1tSDK = new AFe1tSDK<>(aFe1mSDK, aFe1wSDK.getMonetizationNetwork, aFe1wSDK.getMediationNetwork, aFe1jSDK);
        int i2 = copy + 89;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return aFe1tSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Map<String, Object> getRevenue() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.15.2");
        hashMap.put("counter", Integer.valueOf(this.getMediationNetwork.getRevenue.getMediationNetwork("appsFlyerCount", 0)));
        hashMap.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        Object[] objArr = new Object[1];
        a((short) View.MeasureSpec.makeMeasureSpec(0, 0), Color.alpha(0) - 75, TextUtils.indexOf((CharSequence) "", '0', 0) - 864846181, 1981934345 - Color.red(0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        AFd1qSDK aFd1qSDK = this.getMediationNetwork;
        hashMap.put("app_version_name", AFb1qSDK.getMediationNetwork(aFd1qSDK.getMonetizationNetwork.AFAdRevenueData, aFd1qSDK.getMonetizationNetwork.AFAdRevenueData.getPackageName()));
        hashMap.put("app_id", this.getMediationNetwork.getMonetizationNetwork.AFAdRevenueData.getPackageName());
        hashMap.put("platformextension", new AFb1aSDK().getMediationNetwork());
        int i2 = copydefault + 29;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return hashMap;
    }

    private static String getRevenue(String str, String str2, String... strArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String monetizationNetwork = AFb1jSDK.getMonetizationNetwork(TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0])), new StringBuilder().append(str).append(str2).append("v2").toString());
        int i2 = copydefault + 11;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private boolean getMediationNetwork() {
        int i = 2 % 2;
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

    static void getCurrencyIso4217Code() {
        component3 = 1161415615;
        component2 = 1991592606;
        areAllFieldsValid = -9740393;
        component1 = new byte[]{Base64.padSymbol, 51, -49, -35, Base64.padSymbol, -55, 48, -40, -24, 9, -21, 56, -61, 33, -34, -50, -50};
    }

    private <T> AFe1tSDK<T> AFAdRevenueData(AFe1mSDK aFe1mSDK, AFe1jSDK<T> aFe1jSDK) {
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, aFe1mSDK, aFe1jSDK}, -194014191, 194014192, System.identityHashCode(this));
    }

    public final AFe1tSDK<Map<String, String>> getCurrencyIso4217Code(String str, String str2, UUID uuid, String str3) {
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, str, str2, uuid, str3}, -15930200, 15930202, System.identityHashCode(this));
    }

    public final AFe1tSDK<Map<String, Object>> getMediationNetwork(String str, String str2) {
        return (AFe1tSDK) AFAdRevenueData(new Object[]{this, str, str2}, -465858035, 465858035, System.identityHashCode(this));
    }
}
