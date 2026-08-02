package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class addSuppressed implements notify {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final addSuppressed ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static long ThreeDS2ServiceInstance;
    private static int createTransaction;
    private static final /* synthetic */ addSuppressed[] get;
    private static int getSDKInfo;
    private static char getSDKVersion;
    public static final addSuppressed initialize;
    private final String getWarnings;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a("㕛钼ힺ芦", (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 566577008, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 8152), "튽ⳝ浚", "郒㪸\ud8de\ue91f", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("㕛钼ힺ芦", (-2006519033) - (Process.myPid() >> 22), (char) (47376 - TextUtils.indexOf("", "")), "噆", "ߋ曳ႈ\ue4b9", objArr2);
        ThreeDS2Service = new addSuppressed(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("㕛钼ힺ芦", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 25773), "\udf51᪑", "퀏鈮굵\ue764", objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("㕛钼ힺ芦", (-826653771) - TextUtils.indexOf("", "", 0, 0), (char) (3934 - View.resolveSize(0, 0)), "옸", "떠멃廎ȏ", objArr4);
        initialize = new addSuppressed(intern2, 1, ((String) objArr4[0]).intern());
        get = get();
        int i = createTransaction + 105;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
        }
    }

    private addSuppressed(String str, int i, String str2) {
        this.getWarnings = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2ServiceInstance = 461492129830282286L;
        getSDKInfo = 898634101;
        getSDKVersion = (char) 4469;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        int i2;
        char[] cArr2;
        Integer num;
        String str4;
        Object method;
        Integer num2 = 246986610;
        String str5 = "";
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        int i3 = 2;
        if (str2 != 0) {
            int i4 = $11 + 55;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr = str2.toCharArray();
                int i5 = 0 / 0;
            } else {
                cArr = str2.toCharArray();
            }
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        ConfigParameters configParameters = new ConfigParameters();
        int length = charArray.length;
        char[] cArr4 = new char[length];
        int length2 = charArray2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(charArray, 0, cArr4, 0, length);
        System.arraycopy(charArray2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            $11 = ($10 + 37) % 128;
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-258783473);
                int i6 = i3;
                if (obj != null) {
                    i2 = length3;
                    cArr2 = cArr3;
                } else {
                    i2 = length3;
                    cArr2 = cArr3;
                    obj = ((Class) removeParam.initialize((ViewConfiguration.getLongPressTimeout() >> 16) + 58, (char) KeyEvent.keyCodeFromString(str5), 6414 - TextUtils.getOffsetAfter(str5, 0))).getMethod("j", Object.class);
                    map.put(-258783473, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num2);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize((ViewConfiguration.getTouchSlop() >> 8) + 63, (char) (11345 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8576)).getMethod("i", Object.class);
                    map.put(num2, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i6] = Integer.valueOf(cArr5[intValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[0] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 != null) {
                    num = num2;
                    str4 = str5;
                    method = obj3;
                } else {
                    num = num2;
                    str4 = str5;
                    method = ((Class) removeParam.initialize((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 75, (char) View.MeasureSpec.getMode(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9819)).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, method);
                }
                ((Method) method).invoke(null, objArr4);
                int i8 = cArr4[intValue2] * 32718;
                char c2 = cArr5[intValue];
                Object[] objArr5 = new Object[i6];
                objArr5[1] = Integer.valueOf(c2);
                objArr5[0] = Integer.valueOf(i8);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getTapTimeout() >> 16), (char) (63350 - (ViewConfiguration.getTapTimeout() >> 16)), 11536 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr5[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr4[intValue2] = configParameters.get;
                int i9 = configParameters.initialize;
                cArr6[i9] = (char) ((((r2 ^ cArr2[i9]) ^ (ThreeDS2ServiceInstance ^ (-8880716800597159563L))) ^ ((int) (getSDKInfo ^ (-8880716800597159563L)))) ^ ((char) (getSDKVersion ^ (-8880716800597159563L))));
                configParameters.initialize = i9 + 1;
                length3 = i2;
                cArr3 = cArr2;
                str5 = str4;
                num2 = num;
                i3 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str6 = new String(cArr6);
        $11 = ($10 + 93) % 128;
        objArr[0] = str6;
    }

    private static /* synthetic */ addSuppressed[] get() {
        addSuppressed[] addsuppressedArr;
        int i = createTransaction + 17;
        int i2 = i % 128;
        ThreeDS2ServiceInitializationCallback = i2;
        if (i % 2 == 0) {
            addsuppressedArr = new addSuppressed[2];
            addsuppressedArr[1] = ThreeDS2Service;
            addsuppressedArr[1] = initialize;
        } else {
            addsuppressedArr = new addSuppressed[]{ThreeDS2Service, initialize};
        }
        int i3 = i2 + 83;
        createTransaction = i3 % 128;
        if (i3 % 2 == 0) {
            return addsuppressedArr;
        }
        throw null;
    }

    public static addSuppressed valueOf(String str) {
        int i = ThreeDS2ServiceInitializationCallback + 109;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            Enum.valueOf(addSuppressed.class, str);
            throw null;
        }
        addSuppressed addsuppressed = (addSuppressed) Enum.valueOf(addSuppressed.class, str);
        createTransaction = (ThreeDS2ServiceInitializationCallback + 79) % 128;
        return addsuppressed;
    }

    public static addSuppressed[] values() {
        addSuppressed[] addsuppressedArr;
        int i = createTransaction + 13;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            addsuppressedArr = (addSuppressed[]) get.clone();
            int i2 = 9 / 0;
        } else {
            addsuppressedArr = (addSuppressed[]) get.clone();
        }
        int i3 = ThreeDS2ServiceInitializationCallback + 105;
        createTransaction = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return addsuppressedArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = (createTransaction + 73) % 128;
        ThreeDS2ServiceInitializationCallback = i;
        String str = this.getWarnings;
        int i2 = i + 37;
        createTransaction = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
