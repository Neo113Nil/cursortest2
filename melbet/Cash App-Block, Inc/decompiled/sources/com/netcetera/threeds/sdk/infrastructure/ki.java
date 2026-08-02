package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ki implements jw {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInstance;
    private static char[] get;
    private static char getWarnings;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        initialize = 1;
        get = new char[]{37908, 37962, 37944, 37902, 37948, 37977, 37929, 37919, 37911, 37903, 37978, 37912, 37909, 37906, 37914, 37910, 37945, 37915, 37896, 37905, 37916, 37897, 37913, 37975, 37907};
        getWarnings = (char) 41445;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        char c2;
        char c3;
        char c4;
        Object method;
        char[] cArr2;
        Object method2;
        int i3 = $10 + 19;
        $11 = i3 % 128;
        char c5 = 2;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 21) % 128;
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr4 = get;
        Class cls = Integer.TYPE;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    char c6 = c5;
                    Object[] objArr2 = {Integer.valueOf(cArr4[i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        cArr2 = cArr3;
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) removeParam.initialize(94 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) View.MeasureSpec.getMode(0), 1559 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        Object[] objArr3 = new Object[1];
                        cArr2 = cArr3;
                        b((short) -1, (short) 0, (byte) 0, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method2);
                    }
                    cArr5[i4] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i4++;
                    c5 = c6;
                    cArr3 = cArr2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        }
        char[] cArr6 = cArr3;
        char c7 = c5;
        Object[] objArr4 = {Integer.valueOf(getWarnings)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize(94 - View.MeasureSpec.getMode(0), (char) (Process.myTid() >> 22), 1560 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            Object[] objArr5 = new Object[1];
            b((short) -1, (short) 0, (byte) 0, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr7 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = i + 91;
                cArr7[i2] = (char) (cArr6[i2] * b);
            } else {
                i2 = i - 1;
                cArr7[i2] = (char) (cArr6[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = 0;
            while (true) {
                int i6 = getparamvalue.getWarnings;
                if (i6 >= i2) {
                    break;
                }
                char c8 = cArr6[i6];
                getparamvalue.get = c8;
                char c9 = cArr6[i6 + 1];
                getparamvalue.initialize = c9;
                if (c8 == c9) {
                    cArr7[i6] = (char) (c8 - b);
                    cArr7[i6 + 1] = (char) (c9 - b);
                    $11 = ($10 + 43) % 128;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = getparamvalue;
                    objArr6[11] = Integer.valueOf(charValue);
                    objArr6[10] = getparamvalue;
                    objArr6[9] = getparamvalue;
                    objArr6[8] = Integer.valueOf(charValue);
                    objArr6[7] = getparamvalue;
                    objArr6[6] = getparamvalue;
                    objArr6[5] = Integer.valueOf(charValue);
                    objArr6[4] = getparamvalue;
                    objArr6[3] = getparamvalue;
                    objArr6[c7] = Integer.valueOf(charValue);
                    objArr6[1] = getparamvalue;
                    objArr6[0] = getparamvalue;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1395483366);
                    if (obj3 != null) {
                        c = 7;
                        c2 = '\b';
                        c3 = 6;
                        c4 = 4;
                        method = obj3;
                    } else {
                        c = 7;
                        c2 = '\b';
                        c3 = 6;
                        Class cls4 = (Class) removeParam.initialize(Color.green(0) + 48, (char) (ViewConfiguration.getLongPressTimeout() >> 16), View.combineMeasuredStates(0, 0) + 3221);
                        Object[] objArr7 = new Object[1];
                        c4 = 4;
                        b((short) -1, (short) 0, (byte) 1, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(-1395483366, method);
                    }
                    int intValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i7 = getparamvalue.cleanup;
                    if (intValue == i7) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = getparamvalue;
                        objArr8[9] = Integer.valueOf(charValue);
                        objArr8[c2] = getparamvalue;
                        objArr8[c] = Integer.valueOf(charValue);
                        objArr8[c3] = Integer.valueOf(charValue);
                        objArr8[5] = getparamvalue;
                        objArr8[c4] = getparamvalue;
                        objArr8[3] = Integer.valueOf(charValue);
                        objArr8[c7] = Integer.valueOf(charValue);
                        objArr8[1] = getparamvalue;
                        objArr8[0] = getparamvalue;
                        Object obj4 = map3.get(1507360409);
                        if (obj4 == null) {
                            Class cls6 = (Class) removeParam.initialize(View.getDefaultSize(0, 0) + 47, (char) (Color.argb(0, 0, 0, 0) + 25644), Color.rgb(0, 0, 0) + 16788705);
                            Class cls7 = Integer.TYPE;
                            obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(1507360409, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                        int i8 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i9 = getparamvalue.getWarnings;
                        cArr7[i9] = cArr4[intValue2];
                        cArr7[i9 + 1] = cArr4[i8];
                    } else {
                        int i10 = getparamvalue.ThreeDS2Service;
                        int i11 = getparamvalue.ThreeDS2ServiceInstance;
                        if (i10 == i11) {
                            $11 = ($10 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                            int m = Thread$State$EnumUnboxingLocalUtility.m(getparamvalue.ThreeDS2ServiceInitializationCallback, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i7, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i12 = (i11 * charValue) + m2;
                            int i13 = getparamvalue.getWarnings;
                            cArr7[i13] = cArr4[(i10 * charValue) + m];
                            cArr7[i13 + 1] = cArr4[i12];
                        } else {
                            int i14 = (i10 * charValue) + i7;
                            int i15 = (i11 * charValue) + getparamvalue.ThreeDS2ServiceInitializationCallback;
                            int i16 = getparamvalue.getWarnings;
                            cArr7[i16] = cArr4[i14];
                            cArr7[i16 + 1] = cArr4[i15];
                            getparamvalue.getWarnings += 2;
                        }
                    }
                }
                getparamvalue.getWarnings += 2;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr7[i17] = (char) (cArr7[i17] ^ 13722);
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, Object[] objArr) {
        int i;
        int i2;
        ?? r8 = 119 - (b * 2);
        int i3 = s + 4;
        byte[] bArr = $$a;
        int i4 = s2 * 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            byte b2 = r8;
            i = 0;
            int i5 = i3;
            int i6 = i5;
            i2 = i3 + b2;
            i3 = i6;
            int i7 = i3 + 1;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            b2 = bArr[i7];
            int i8 = i2;
            i5 = i7;
            i3 = i8;
            int i62 = i5;
            i2 = i3 + b2;
            i3 = i62;
            int i72 = i3 + 1;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = r8;
            int i722 = i3 + 1;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{115, -38, 117, 120};
        $$b = 17;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String ThreeDS2Service() {
        Object obj;
        int i = ThreeDS2ServiceInstance + 87;
        initialize = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            a((byte) (Gravity.getAbsoluteGravity(1, 1) + 9), "\u0011\u0012\u0002\u0014\u0005\u0011", (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 93, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((byte) (34 - Gravity.getAbsoluteGravity(0, 0)), "\u0011\u0012\u0002\u0014\u0005\u0011", 7 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        initialize = (ThreeDS2ServiceInstance + 11) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance + 93;
        initialize = i % 128;
        if (i % 2 != 0) {
            return 18;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        ThreeDS2ServiceInstance = (initialize + 51) % 128;
        Object[] objArr = new Object[1];
        a((byte) (117 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), "\u0006\u0000㘞㘞㘞㘞㘞", 7 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        String intern = ((String) objArr[0]).intern();
        ThreeDS2ServiceInstance = (initialize + 13) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String getSDKInfo() {
        ThreeDS2ServiceInstance = (initialize + 11) % 128;
        Object[] objArr = new Object[1];
        a((byte) (19 - Color.argb(0, 0, 0, 0)), "\t\u0000\u0003\u0000\u0003\u0000㗫", 7 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        initialize = (ThreeDS2ServiceInstance + 43) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String getWarnings() {
        Object obj;
        int i = initialize + 105;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i2 != 0) {
            Object[] objArr = new Object[1];
            a((byte) (74 / (uptimeMillis > 1L ? 1 : (uptimeMillis == 1L ? 0 : -1))), "\u0007\b\u0018\u0007\u0011\b\u000b\u000f\f\b\u0018\u0011\u000e\u0007㗶", 47 >>> (ViewConfiguration.getKeyRepeatTimeout() % 58), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((byte) (9 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1))), "\u0007\b\u0018\u0007\u0011\b\u000b\u000f\f\b\u0018\u0011\u000e\u0007㗶", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        ThreeDS2ServiceInstance = (initialize + 105) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        initialize = (ThreeDS2ServiceInstance + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        Object[] objArr = new Object[1];
        a((byte) (TextUtils.indexOf((CharSequence) "", '0') + 25), "\u0016\u0010\u0001\u0014\u0018\u0016\b\u0011\u0014\u0015", (KeyEvent.getMaxKeyCode() >> 16) + 10, objArr);
        String intern = ((String) objArr[0]).intern();
        int i = ThreeDS2ServiceInstance + 93;
        initialize = i % 128;
        if (i % 2 == 0) {
            int i2 = 48 / 0;
        }
        return intern;
    }
}
