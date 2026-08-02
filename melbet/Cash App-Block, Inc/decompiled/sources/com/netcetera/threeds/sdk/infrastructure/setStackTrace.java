package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class setStackTrace implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static boolean ThreeDS2ServiceInitializationCallback;
    public static final setStackTrace ThreeDS2ServiceInstance;
    private static int cleanup;
    private static int createTransaction;
    private static final /* synthetic */ setStackTrace[] get;
    private static boolean getSDKInfo;
    private static int getSDKVersion;
    public static final setStackTrace initialize;
    private final String getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        cleanup = 0;
        createTransaction = 1;
        get();
        Object[] objArr = new Object[1];
        a(null, null, 127 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\u0086\u0085\u0084\u0083\u0081\u0082\u0081", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, 127 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\u0088\u0087", objArr2);
        ThreeDS2ServiceInstance = new setStackTrace(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u008c\u008b\u0084\u008a\u0081\u0081\u0089\u0086", objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, "\u008d\u0087", objArr4);
        initialize = new setStackTrace(intern2, 1, ((String) objArr4[0]).intern());
        get = ThreeDS2ServiceInstance();
        createTransaction = (cleanup + 17) % 128;
    }

    private setStackTrace(String str, int i, String str2) {
        this.getWarnings = str2;
    }

    private static /* synthetic */ setStackTrace[] ThreeDS2ServiceInstance() {
        int i = (createTransaction + 21) % 128;
        cleanup = i;
        setStackTrace[] setstacktraceArr = {ThreeDS2ServiceInstance, initialize};
        int i2 = i + 77;
        createTransaction = i2 % 128;
        if (i2 % 2 != 0) {
            return setstacktraceArr;
        }
        throw null;
    }

    private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
        int i2;
        int i3;
        char[] cArr;
        Class cls;
        Object method;
        String str3 = str2;
        int i4 = $11 + 119;
        $10 = i4 % 128;
        byte[] bArr = str3;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        onError onerror = new onError();
        char[] cArr2 = ThreeDS2Service;
        Class cls2 = Integer.TYPE;
        int i5 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            i2 = 2;
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        i3 = i6;
                        method = obj;
                        cArr = cArr2;
                        cls = cls2;
                    } else {
                        i3 = i6;
                        Class cls3 = (Class) removeParam.initialize(72 - Color.green(i5), (char) Color.argb(i5, i5, i5, i5), (ViewConfiguration.getTapTimeout() >> 16) + 1405);
                        Object[] objArr3 = new Object[1];
                        cArr = cArr2;
                        cls = cls2;
                        b(0, (byte) -1, (byte) 1, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-939298638, method);
                    }
                    cArr3[i3] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i6 = i3 + 1;
                    cArr2 = cArr;
                    cls2 = cls;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        } else {
            i2 = 2;
        }
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(getSDKVersion)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize(72 - ExpandableListView.getPackedPositionChild(0L), (char) (7530 - (Process.myPid() >> 22)), 2489 - TextUtils.getOffsetBefore("", 0));
            Object[] objArr5 = new Object[1];
            b(0, (byte) -1, (byte) 0, objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        if (getSDKInfo) {
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr4 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i7 = onerror.getWarnings;
                int i8 = onerror.ThreeDS2ServiceInstance;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                int i9 = $10 + 99;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr4[i7] = (char) (cArr2[bArr2[(i8 + 1) % i7] >>> i] + intValue);
                    Object[] objArr6 = new Object[i2];
                    objArr6[1] = onerror;
                    objArr6[0] = onerror;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(73542081);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11441)).getMethod("k", Object.class, Object.class);
                        map3.put(73542081, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                } else {
                    cArr4[i7] = (char) (cArr2[bArr2[(i8 - 1) - i7] + i] - intValue);
                    Object[] objArr7 = {onerror, onerror};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(73542081);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(48 - Drawable.resolveOpacity(0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 11441 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("k", Object.class, Object.class);
                        map4.put(73542081, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr7);
                }
                i2 = 2;
            }
        } else if (ThreeDS2ServiceInitializationCallback) {
            int i10 = $11;
            $10 = (i10 + 119) % 128;
            int length3 = charArray.length;
            onerror.ThreeDS2ServiceInstance = length3;
            char[] cArr5 = new char[length3];
            onerror.getWarnings = 0;
            $10 = (i10 + 67) % 128;
            while (true) {
                int i11 = onerror.getWarnings;
                int i12 = onerror.ThreeDS2ServiceInstance;
                if (i11 >= i12) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i11] = (char) (cArr2[charArray[(i12 - 1) - i11] - i] - intValue);
                Object[] objArr8 = {onerror, onerror};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(73542081);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(Color.argb(0, 0, 0, 0) + 48, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 11441 - ((Process.getThreadPriority(0) + 20) >> 6))).getMethod("k", Object.class, Object.class);
                    map5.put(73542081, obj5);
                }
                ((Method) obj5).invoke(null, objArr8);
            }
        } else {
            int length4 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length4;
            char[] cArr6 = new char[length4];
            onerror.getWarnings = 0;
            while (true) {
                int i13 = onerror.getWarnings;
                int i14 = onerror.ThreeDS2ServiceInstance;
                if (i13 >= i14) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    $11 = ($10 + 53) % 128;
                    cArr6[i13] = (char) (cArr2[iArr[(i14 - 1) - i13] - i] - intValue);
                    onerror.getWarnings = i13 + 1;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3 = i * 3;
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = 109 - b2;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i5;
            int i8 = i4;
            int i9 = (-i4) + i7;
            int i10 = i8;
            i5 = i9;
            i4 = i10;
            bArr = bArr3;
            i2 = i6;
            int i11 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i8 = i11;
            i4 = bArr[i11];
            i6 = i2 + 1;
            bArr3 = bArr;
            i7 = i12;
            int i92 = (-i4) + i7;
            int i102 = i8;
            i5 = i92;
            i4 = i102;
            bArr = bArr3;
            i2 = i6;
            int i112 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            int i1122 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    public static void get() {
        ThreeDS2Service = new char[]{15224, 15206, 15220, 15204, 15231, 15227, 15259, 15258, 15210, 15228, 15225, 15215, 15257};
        getSDKVersion = 993475499;
        ThreeDS2ServiceInitializationCallback = true;
        getSDKInfo = true;
    }

    public static void init$0() {
        $$a = new byte[]{40, -102, -94, 123};
        $$b = 49;
    }

    public static setStackTrace valueOf(String str) {
        int i = createTransaction + 119;
        cleanup = i % 128;
        int i2 = i % 2;
        setStackTrace setstacktrace = (setStackTrace) Enum.valueOf(setStackTrace.class, str);
        if (i2 != 0) {
            int i3 = 23 / 0;
        }
        return setstacktrace;
    }

    public static setStackTrace[] values() {
        int i = createTransaction + 53;
        cleanup = i % 128;
        if (i % 2 == 0) {
            return (setStackTrace[]) get.clone();
        }
        get.clone();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = createTransaction;
        int i2 = i + 9;
        cleanup = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getWarnings;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = i + 41;
        cleanup = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
