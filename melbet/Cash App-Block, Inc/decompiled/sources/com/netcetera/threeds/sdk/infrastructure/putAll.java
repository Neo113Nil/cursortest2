package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class putAll implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ putAll[] ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static int getSDKVersion;
    public static final putAll getWarnings;
    private static int[] initialize;
    private String get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        getSDKVersion = 1;
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        a(new int[]{176348501, -2093974022, 1299260351, -456933713}, Color.blue(0) + 5, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{-272896041, 1671127380}, 2 - KeyEvent.keyCodeFromString(""), objArr2);
        getWarnings = new putAll(intern, 0, ((String) objArr2[0]).intern());
        ThreeDS2Service = ThreeDS2ServiceInstance();
        int i = getSDKVersion + 11;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            int i2 = 80 / 0;
        }
    }

    private putAll(String str, int i, String str2) {
        this.get = str2;
    }

    public static void ThreeDS2Service() {
        initialize = new int[]{-2132871182, 198904867, -980882604, 1114859440, 199969105, 301347256, 462419000, 1974248389, 1524342629, -1170165642, -1414013557, 724589781, 939975758, 1486792317, 1129966729, -901765866, -1625077519, 748230064};
    }

    private static /* synthetic */ putAll[] ThreeDS2ServiceInstance() {
        int i = (ThreeDS2ServiceInstance + 103) % 128;
        getSDKVersion = i;
        putAll[] putallArr = {getWarnings};
        ThreeDS2ServiceInstance = (i + 125) % 128;
        return putallArr;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        Integer num;
        char[] cArr;
        Object method;
        int[] iArr4;
        char[] cArr2;
        int i6;
        int[] iArr5;
        int i7;
        Object method2;
        Integer num2 = -1870831722;
        createTransaction createtransaction = new createTransaction();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr6 = initialize;
        Class cls = Integer.TYPE;
        int i8 = 2;
        if (iArr6 != null) {
            int length = iArr6.length;
            int[] iArr7 = new int[length];
            int i9 = 0;
            i2 = 16;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr6[i9])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(2095751688);
                    if (obj != null) {
                        iArr4 = iArr7;
                        i6 = length;
                        iArr5 = iArr6;
                        i7 = i9;
                        method2 = obj;
                        cArr2 = cArr3;
                    } else {
                        iArr4 = iArr7;
                        cArr2 = cArr3;
                        i6 = length;
                        Class cls2 = (Class) removeParam.initialize((KeyEvent.getMaxKeyCode() >> 16) + 64, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 1198);
                        byte b = (byte) ($$b & 1);
                        byte b2 = (byte) (-b);
                        iArr5 = iArr6;
                        i7 = i9;
                        Object[] objArr3 = new Object[1];
                        b(b, b2, (byte) (b2 + 1), objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2095751688, method2);
                    }
                    iArr4[i7] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i9 = i7 + 1;
                    $11 = ($10 + 7) % 128;
                    cArr3 = cArr2;
                    iArr7 = iArr4;
                    length = i6;
                    iArr6 = iArr5;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr6 = iArr7;
        } else {
            i2 = 16;
        }
        char[] cArr5 = cArr3;
        int length2 = iArr6.length;
        int[] iArr8 = new int[length2];
        int[] iArr9 = initialize;
        if (iArr9 != null) {
            int length3 = iArr9.length;
            int[] iArr10 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr9[i10])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(2095751688);
                if (obj2 != null) {
                    num = num2;
                    cArr = cArr4;
                    iArr2 = iArr9;
                    i4 = length3;
                    iArr3 = iArr10;
                    method = obj2;
                    i5 = i10;
                } else {
                    iArr2 = iArr9;
                    i4 = length3;
                    iArr3 = iArr10;
                    Class cls3 = (Class) removeParam.initialize(64 - KeyEvent.keyCodeFromString(""), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1196);
                    byte b3 = (byte) ($$b & 1);
                    byte b4 = (byte) (-b3);
                    i5 = i10;
                    num = num2;
                    cArr = cArr4;
                    Object[] objArr5 = new Object[1];
                    b(b3, b4, (byte) (b4 + 1), objArr5);
                    method = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2095751688, method);
                }
                iArr3[i5] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                i10 = i5 + 1;
                iArr9 = iArr2;
                length3 = i4;
                cArr4 = cArr;
                iArr10 = iArr3;
                num2 = num;
            }
            iArr9 = iArr10;
        }
        Integer num3 = num2;
        char[] cArr6 = cArr4;
        System.arraycopy(iArr9, 0, iArr8, 0, length2);
        createtransaction.initialize = 0;
        $11 = ($10 + 71) % 128;
        while (true) {
            int i11 = createtransaction.initialize;
            if (i11 >= iArr.length) {
                objArr[0] = new String(cArr6, 0, i);
                return;
            }
            int i12 = iArr[i11];
            char c = (char) (i12 >> 16);
            cArr5[0] = c;
            char c2 = (char) i12;
            cArr5[1] = c2;
            char c3 = (char) (iArr[i11 + 1] >> 16);
            cArr5[i8] = c3;
            char c4 = (char) iArr[i11 + 1];
            cArr5[3] = c4;
            createtransaction.getWarnings = (c << 16) + c2;
            createtransaction.get = (c3 << 16) + c4;
            createTransaction.ThreeDS2ServiceInstance(iArr8);
            int i13 = 0;
            while (true) {
                i3 = createtransaction.getWarnings;
                if (i13 >= i2) {
                    break;
                }
                int i14 = i3 ^ iArr8[i13];
                createtransaction.getWarnings = i14;
                int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i14);
                Object[] objArr6 = new Object[4];
                objArr6[3] = createtransaction;
                objArr6[i8] = createtransaction;
                objArr6[1] = Integer.valueOf(ThreeDS2Service2);
                objArr6[0] = createtransaction;
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(-411264147);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize((Process.myPid() >> 22) + 49, (char) (MotionEvent.axisFromString("") + 1), TextUtils.indexOf("", "", 0, 0) + 13121)).getMethod("y", Object.class, cls, Object.class, Object.class);
                    map3.put(-411264147, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                createtransaction.getWarnings = createtransaction.get;
                createtransaction.get = intValue;
                i13++;
                i2 = 16;
            }
            int i15 = createtransaction.get;
            createtransaction.getWarnings = i15;
            createtransaction.get = i3;
            i2 = 16;
            int i16 = i3 ^ iArr8[16];
            createtransaction.get = i16;
            int i17 = i15 ^ iArr8[17];
            createtransaction.getWarnings = i17;
            cArr5[0] = (char) (i17 >>> 16);
            cArr5[1] = (char) i17;
            cArr5[i8] = (char) (i16 >>> 16);
            cArr5[3] = (char) i16;
            createTransaction.ThreeDS2ServiceInstance(iArr8);
            int i18 = createtransaction.initialize;
            cArr6[i18 * 2] = cArr5[0];
            cArr6[(i18 * 2) + 1] = cArr5[1];
            cArr6[(i18 * 2) + 2] = cArr5[i8];
            cArr6[(i18 * 2) + 3] = cArr5[3];
            Object[] objArr7 = new Object[i8];
            objArr7[1] = createtransaction;
            objArr7[0] = createtransaction;
            Map map4 = removeParam.visaSchemeConfiguration;
            Integer num4 = num3;
            Object obj4 = map4.get(num4);
            if (obj4 == null) {
                Class cls4 = (Class) removeParam.initialize(99 - ExpandableListView.getPackedPositionGroup(0L), (char) TextUtils.indexOf("", "", 0), 1880 - View.combineMeasuredStates(0, 0));
                Object[] objArr8 = new Object[1];
                b((short) 0, (byte) -1, (byte) 0, objArr8);
                obj4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(num4, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
            num3 = num4;
            i8 = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    private static void b(short s, byte b, byte b2, Object[] objArr) {
        int i = b2 * 4;
        int i2 = 118 - (s * 5);
        byte[] bArr = $$a;
        int i3 = b + 4;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        byte b3 = i2;
        if (bArr == null) {
            int i6 = i2 + i3;
            i3 = i3;
            bArr = bArr;
            i5 = -1;
            b3 = i6;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = b3;
            int i8 = i3 + 1;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte[] bArr3 = bArr;
            b3 = bArr[i8] + b3;
            i3 = i8;
            bArr = bArr3;
            i5 = i7;
        }
    }

    public static void init$0() {
        $$a = new byte[]{87, -47, -17, 35};
        $$b = 79;
    }

    public static putAll valueOf(String str) {
        ThreeDS2ServiceInstance = (getSDKVersion + 71) % 128;
        putAll putall = (putAll) Enum.valueOf(putAll.class, str);
        int i = getSDKVersion + 89;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
        }
        return putall;
    }

    public static putAll[] values() {
        getSDKVersion = (ThreeDS2ServiceInstance + 29) % 128;
        putAll[] putallArr = (putAll[]) ThreeDS2Service.clone();
        int i = ThreeDS2ServiceInstance + 75;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return putallArr;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = ThreeDS2ServiceInstance + 31;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        String str = this.get;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }
}
