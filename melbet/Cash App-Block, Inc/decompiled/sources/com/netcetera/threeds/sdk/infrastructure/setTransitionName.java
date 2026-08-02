package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class setTransitionName {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ setTransitionName[] ThreeDS2Service;
    private static short[] ThreeDS2ServiceInitializationCallback;
    private static int ThreeDS2ServiceInstance;
    private static int cleanup;
    private static int createTransaction;
    private static int get;
    private static byte[] getSDKInfo;
    private static int getSDKVersion;
    public static final setTransitionName getWarnings;
    public static final setTransitionName initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        createTransaction = 0;
        getSDKVersion = 1;
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a((-300436316) - View.MeasureSpec.getMode(0), (byte) (Color.argb(0, 0, 0, 0) + 6), (short) (57 - TextUtils.lastIndexOf("", '0', 0)), 1397620848 + (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 62, objArr);
        initialize = new setTransitionName(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) - 300436334, (byte) (126 - (ViewConfiguration.getLongPressTimeout() >> 16)), (short) (3 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1397620856 - View.MeasureSpec.getSize(0), (-63) - TextUtils.indexOf("", ""), objArr2);
        getWarnings = new setTransitionName(((String) objArr2[0]).intern(), 1);
        ThreeDS2Service = ThreeDS2Service();
        int i = createTransaction + 115;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private setTransitionName(String str, int i) {
    }

    private static /* synthetic */ setTransitionName[] ThreeDS2Service() {
        int i = getSDKVersion + 15;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            return new setTransitionName[]{initialize, getWarnings};
        }
        setTransitionName[] settransitionnameArr = new setTransitionName[4];
        settransitionnameArr[0] = initialize;
        settransitionnameArr[1] = getWarnings;
        return settransitionnameArr;
    }

    public static void ThreeDS2ServiceInstance() {
        get = 936044425;
        ThreeDS2ServiceInstance = -1686431706;
        cleanup = -1970056280;
        getSDKInfo = new byte[]{-45, -53, -90, -38, -37, -34, -47, -90, -91, -46, 99, 117, -98, 96, -99, 101, 114};
    }

    private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) {
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        char c;
        int i8;
        byte[] bArr;
        int i9;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        int i13;
        byte[] bArr3;
        Object method;
        getSDKVersion getsdkversion = new getSDKVersion();
        StringBuilder sb = new StringBuilder();
        try {
            int i14 = 1;
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(ThreeDS2ServiceInstance)};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(981393365);
            Class cls = Integer.TYPE;
            if (obj != null) {
                i4 = 2;
                i5 = 0;
                j = 0;
            } else {
                j = 0;
                Class cls2 = (Class) removeParam.initialize((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 61, (char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 654);
                byte b2 = (byte) ($$b & 10);
                byte b3 = (byte) (b2 - 2);
                i4 = 2;
                i5 = 0;
                Object[] objArr3 = new Object[1];
                b(b2, b3, b3, objArr3);
                obj = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(981393365, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $11 = ($10 + 59) % 128;
                i6 = 1;
            } else {
                i6 = i5;
            }
            if (i6 != 0) {
                int i15 = ($10 + 75) % 128;
                $11 = i15;
                byte[] bArr4 = getSDKInfo;
                if (bArr4 != null) {
                    int i16 = i15 + 23;
                    j2 = 2786809877878216728L;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        int length = bArr4.length;
                        bArr = new byte[length];
                        i9 = length;
                        i10 = 1;
                    } else {
                        int length2 = bArr4.length;
                        bArr = new byte[length2];
                        i9 = length2;
                        i10 = i5;
                    }
                    while (i10 < i9) {
                        Object[] objArr4 = {Integer.valueOf(bArr4[i10])};
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(-1684720202);
                        if (obj2 != null) {
                            i11 = i10;
                            bArr2 = bArr4;
                            i13 = i9;
                            bArr3 = bArr;
                            method = obj2;
                            i12 = i6;
                        } else {
                            int i17 = i14;
                            i11 = i10;
                            i12 = i6;
                            bArr2 = bArr4;
                            int i18 = i5;
                            Class cls3 = (Class) removeParam.initialize((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 58, (char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), TextUtils.getCapsMode("", i18, i18) + 3162);
                            byte b4 = (byte) ($$a[i17] - 1);
                            byte b5 = b4;
                            i13 = i9;
                            bArr3 = bArr;
                            Object[] objArr5 = new Object[i17];
                            b(b4, b5, b5, objArr5);
                            method = cls3.getMethod((String) objArr5[0], cls);
                            map2.put(-1684720202, method);
                        }
                        bArr3[i11] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i10 = i11 + 1;
                        i6 = i12;
                        bArr4 = bArr2;
                        i9 = i13;
                        bArr = bArr3;
                        i5 = 0;
                        i14 = 1;
                    }
                    bArr4 = bArr;
                } else {
                    j2 = 2786809877878216728L;
                }
                i7 = i6;
                c = '0';
                if (bArr4 != null) {
                    byte[] bArr5 = getSDKInfo;
                    Object[] objArr6 = new Object[i4];
                    objArr6[1] = Integer.valueOf(get);
                    objArr6[0] = Integer.valueOf(i2);
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(981393365);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize(AndroidCharacter.getMirror('0') + 14, (char) Color.blue(0), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 653);
                        byte b6 = (byte) ($$b & 10);
                        byte b7 = (byte) (b6 - 2);
                        Object[] objArr7 = new Object[1];
                        b(b6, b7, b7, objArr7);
                        obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                        map3.put(981393365, obj3);
                    }
                    intValue = (byte) (((byte) (bArr5[((Integer) ((Method) obj3).invoke(null, objArr6)).intValue()] ^ j2)) + ((int) (ThreeDS2ServiceInstance ^ j2)));
                } else {
                    intValue = (short) (((short) (ThreeDS2ServiceInitializationCallback[i2 + ((int) (get ^ j2))] ^ j2)) + ((int) (ThreeDS2ServiceInstance ^ j2)));
                }
            } else {
                i7 = i6;
                j2 = 2786809877878216728L;
                c = '0';
            }
            if (intValue > 0) {
                int i19 = ($10 + 105) % 128;
                $11 = i19;
                int i20 = ((i2 + intValue) - 2) + ((int) (get ^ j2));
                if (i7 != 0) {
                    $10 = (i19 + 37) % 128;
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                getsdkversion.ThreeDS2ServiceInstance = i20 + i8;
                Object[] objArr8 = {getsdkversion, Integer.valueOf(i), Integer.valueOf(cleanup), sb};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(-1855485602);
                if (obj4 == null) {
                    Class cls5 = (Class) removeParam.initialize(TextUtils.indexOf("", c) + 55, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 13765), 2802 - ((Process.getThreadPriority(0) + 20) >> 6));
                    byte b8 = $$a[1];
                    byte b9 = (byte) (b8 - 1);
                    Object[] objArr9 = new Object[1];
                    b(b8, b9, b9, objArr9);
                    obj4 = cls5.getMethod((String) objArr9[0], Object.class, cls, cls, Object.class);
                    map4.put(-1855485602, obj4);
                }
                ((StringBuilder) ((Method) obj4).invoke(null, objArr8)).append(getsdkversion.ThreeDS2Service);
                getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                byte[] bArr6 = getSDKInfo;
                if (bArr6 != null) {
                    int length3 = bArr6.length;
                    byte[] bArr7 = new byte[length3];
                    int i21 = 0;
                    while (i21 < length3) {
                        int i22 = $11 + 35;
                        $10 = i22 % 128;
                        if (i22 % 2 != 0) {
                            bArr7[i21] = (byte) (bArr6[i21] & j2);
                        } else {
                            bArr7[i21] = (byte) (bArr6[i21] ^ j2);
                            i21++;
                        }
                    }
                    bArr6 = bArr7;
                }
                boolean z = bArr6 != null;
                getsdkversion.initialize = 1;
                while (getsdkversion.initialize < intValue) {
                    if (z) {
                        $10 = ($11 + 25) % 128;
                        byte[] bArr8 = getSDKInfo;
                        getsdkversion.ThreeDS2ServiceInstance = getsdkversion.ThreeDS2ServiceInstance - 1;
                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((byte) (((byte) (bArr8[r1] ^ j2)) + s)) ^ b));
                    } else {
                        short[] sArr = ThreeDS2ServiceInitializationCallback;
                        getsdkversion.ThreeDS2ServiceInstance = getsdkversion.ThreeDS2ServiceInstance - 1;
                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[r1] ^ j2)) + s)) ^ b));
                    }
                    sb.append(getsdkversion.ThreeDS2Service);
                    getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                    getsdkversion.initialize++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, Object[] objArr) {
        int i;
        int i2;
        int i3 = s + 102;
        int i4 = (b * 4) + 4;
        byte[] bArr = $$a;
        int i5 = 1 - (b2 * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i2 = 0;
            int i6 = i4;
            i3 = (-i3) + i4;
            i4 = i6 + 1;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i4];
            int i7 = i4;
            i4 = i3;
            i3 = b3;
            bArr3 = bArr;
            i6 = i7;
            i3 = (-i3) + i4;
            i4 = i6 + 1;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{6, 1, 30, -98};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE;
    }

    public static setTransitionName valueOf(String str) {
        createTransaction = (getSDKVersion + 85) % 128;
        setTransitionName settransitionname = (setTransitionName) Enum.valueOf(setTransitionName.class, str);
        int i = getSDKVersion + 45;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            return settransitionname;
        }
        throw null;
    }

    public static setTransitionName[] values() {
        createTransaction = (getSDKVersion + 121) % 128;
        setTransitionName[] settransitionnameArr = (setTransitionName[]) ThreeDS2Service.clone();
        createTransaction = (getSDKVersion + 59) % 128;
        return settransitionnameArr;
    }
}
