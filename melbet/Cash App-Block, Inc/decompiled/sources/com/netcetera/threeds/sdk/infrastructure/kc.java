package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class kc implements jq {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2ServiceInstance;
    private static int get;
    private static long getWarnings;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        get = 1;
        ThreeDS2ServiceInstance = new char[]{35099, 31678, 27752, 20756, 17301, 13426, 14697, 16539, 45626, 42464, 39042, 35337, 64996, 61631, 57983, 54553, 51397};
        getWarnings = -6079903035033748597L;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        int i3;
        long[] jArr;
        int i4;
        Object method;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i];
        int i5 = 0;
        threeDS2ServiceInitializationCallback.initialize = 0;
        $10 = ($11 + 43) % 128;
        while (true) {
            int i6 = threeDS2ServiceInitializationCallback.initialize;
            if (i6 >= i) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(ThreeDS2ServiceInstance[i2 + i6])};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-54653524);
                int i7 = i5;
                Class cls = Integer.TYPE;
                if (obj != null) {
                    jArr = jArr2;
                    i4 = i6;
                    method = obj;
                    i3 = 2;
                } else {
                    i3 = 2;
                    Class cls2 = (Class) removeParam.initialize(48 - Color.blue(i7), (char) (ViewConfiguration.getScrollBarSize() >> 8), 3222 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    byte b = (byte) (-$$a[1]);
                    byte b2 = (byte) (b - 1);
                    jArr = jArr2;
                    i4 = i6;
                    Object[] objArr3 = new Object[1];
                    b(b, b2, b2, objArr3);
                    method = cls2.getMethod((String) objArr3[i7], cls);
                    map.put(-54653524, method);
                }
                Long l = (Long) ((Method) method).invoke(null, objArr2);
                l.longValue();
                long j = threeDS2ServiceInitializationCallback.initialize;
                long j2 = getWarnings;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c);
                objArr4[i3] = Long.valueOf(j2);
                objArr4[1] = Long.valueOf(j);
                objArr4[i7] = l;
                Object obj2 = map.get(1319531906);
                if (obj2 == null) {
                    Class cls3 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0') + 70, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50703), 7789 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    Class cls4 = Long.TYPE;
                    obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                    map.put(1319531906, obj2);
                }
                jArr[i4] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i3];
                objArr5[1] = threeDS2ServiceInitializationCallback;
                objArr5[i7] = threeDS2ServiceInitializationCallback;
                Object obj3 = map.get(1724349229);
                if (obj3 == null) {
                    Class cls5 = (Class) removeParam.initialize(48 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (27779 - TextUtils.lastIndexOf("", '0')), View.MeasureSpec.getMode(i7) + 2441);
                    byte b3 = (byte) ($$a[1] + 1);
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    b(b3, b4, b4, objArr6);
                    obj3 = cls5.getMethod((String) objArr6[i7], Object.class, Object.class);
                    map.put(1724349229, obj3);
                }
                ((Method) obj3).invoke(null, objArr5);
                i5 = i7;
                jArr2 = jArr;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        long[] jArr3 = jArr2;
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = i5;
        $10 = ($11 + 57) % 128;
        while (true) {
            int i8 = threeDS2ServiceInitializationCallback.initialize;
            if (i8 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            int i9 = $10 + 25;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[i8] = (char) jArr3[i8];
                Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(1724349229);
                if (obj4 == null) {
                    Class cls6 = (Class) removeParam.initialize(49 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (27780 - TextUtils.indexOf("", "", 0)), 2441 - View.resolveSize(0, 0));
                    byte b5 = (byte) ($$a[1] + 1);
                    byte b6 = b5;
                    Object[] objArr8 = new Object[1];
                    b(b5, b6, b6, objArr8);
                    obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(1724349229, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                int i10 = 59 / 0;
            } else {
                cArr[i8] = (char) jArr3[i8];
                Object[] objArr9 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj5 = map3.get(1724349229);
                if (obj5 == null) {
                    Class cls7 = (Class) removeParam.initialize(48 - TextUtils.getOffsetBefore("", 0), (char) (27780 - Color.blue(0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 2441);
                    byte b7 = (byte) ($$a[1] + 1);
                    byte b8 = b7;
                    Object[] objArr10 = new Object[1];
                    b(b7, b8, b8, objArr10);
                    obj5 = cls7.getMethod((String) objArr10[0], Object.class, Object.class);
                    map3.put(1724349229, obj5);
                }
                ((Method) obj5).invoke(null, objArr9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, short s2, Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (s * 3) + 97;
        int i5 = 1 - (s2 * 3);
        int i6 = 3 - (i * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i4 = i5;
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i6;
            i4 += -i6;
            i6 = i8;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            int i9 = i6 + 1;
            i3 = i2 + 1;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i9];
            byte[] bArr4 = bArr;
            i8 = i9;
            i6 = b;
            i7 = i3;
            bArr3 = bArr4;
            i4 += -i6;
            i6 = i8;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            int i92 = i6 + 1;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i922 = i6 + 1;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{81, -1, 84, 11};
        $$b = 192;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public String ThreeDS2Service() {
        Object obj;
        int i = get + 9;
        initialize = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            a(50 >>> MotionEvent.axisFromString(""), (-1) % TextUtils.indexOf((CharSequence) "", 'Q', 0), (char) Drawable.resolveOpacity(0, 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(6 - MotionEvent.axisFromString(""), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), (char) Drawable.resolveOpacity(0, 0), objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        get = (initialize + 55) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = (initialize + 87) % 128;
        get = i;
        int i2 = i + 101;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            return 16;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public int createTransaction() {
        int i = get + 29;
        initialize = i % 128;
        return i % 2 != 0 ? 2 : 4;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        initialize = (get + 111) % 128;
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, Process.myTid() >> 22, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        initialize = (get + 51) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public int getWarnings() {
        int i = get + 51;
        initialize = i % 128;
        return i % 2 != 0 ? 5 : 4;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        Object obj;
        int i = get + 63;
        initialize = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            a(55 - (ViewConfiguration.getWindowTouchSlop() - 121), 99 << TextUtils.indexOf((CharSequence) "", '%'), (char) (51665 << ExpandableListView.getPackedPositionChild(1L)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getWindowTouchSlop() >> 8) + 10, TextUtils.indexOf((CharSequence) "", '0') + 8, (char) (ExpandableListView.getPackedPositionChild(0L) + 51665), objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        initialize = (get + 3) % 128;
        return intern;
    }
}
