package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class computeValue {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInitializationCallback;
    private static char[] get;
    private static int getSDKInfo;
    private static long getWarnings;
    private final String ThreeDS2Service;
    private final setTextAlignment ThreeDS2ServiceInstance;
    private final String initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKInfo = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        get = new char[]{12630, 3449, 18908, 34211, 49257, 7377, 22661, 38732, 54244, 12216, 27214, 42514, 58081, 8544, 32002, 47552, 62588, 12289, 3290, 19322, 34620, 50138, 8129, 23146, 38576, 53911, 4377, 28070, 43395, 58437, 8210, 31921, 47938, 63250, 13295, 3704, 18950, 34506, 50475, 316, 24004, 39325, 54315, 4351, 27791, 43863, 59299, 9124, 32348, 47840, 63158, 13642, 28952, 19900, 34930, 50181, 219, 24382, 39799, 55171, 4994, 48397, 33088, 50600, 2530, 19528, 36996, 54507};
        getWarnings = -6625457188226747031L;
    }

    public computeValue(setTextAlignment settextalignment, String str, String str2) {
        this.ThreeDS2ServiceInstance = settextalignment;
        this.initialize = str;
        this.ThreeDS2Service = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0309  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        char c2;
        Throwable cause;
        long[] jArr;
        int i3;
        int i4;
        Object method;
        int i5 = i;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i5];
        int i6 = 0;
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i7 = threeDS2ServiceInitializationCallback.initialize;
            if (i7 >= i5) {
                break;
            }
            int i8 = $11 + 121;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i9 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(get[i2 % i7])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-54653524);
                    if (obj != null) {
                        jArr = jArr2;
                        i3 = i6;
                        i4 = i7;
                        method = obj;
                    } else {
                        i3 = i6;
                        Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47, (char) KeyEvent.getDeadChar(i6, i6), (Process.myPid() >> 22) + 3221);
                        byte b = $$a[1];
                        byte b2 = b;
                        jArr = jArr2;
                        i4 = i7;
                        Object[] objArr3 = new Object[1];
                        b(b2, (byte) (b2 + 1), (byte) (-b), objArr3);
                        method = cls3.getMethod((String) objArr3[i3], cls2);
                        map.put(-54653524, method);
                    }
                    Long l = (Long) ((Method) method).invoke(null, objArr2);
                    l.longValue();
                    long j = threeDS2ServiceInitializationCallback.initialize;
                    long j2 = getWarnings;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(c);
                    objArr4[2] = Long.valueOf(j2);
                    objArr4[1] = Long.valueOf(j);
                    objArr4[i3] = l;
                    Object obj2 = map.get(1319531906);
                    if (obj2 == null) {
                        int i10 = i3;
                        obj2 = ((Class) removeParam.initialize((ExpandableListView.getPackedPositionForChild(i10, i10) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i10, i10) == 0L ? 0 : -1)) + 70, (char) ((TypedValue.complexToFraction(i10, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(i10, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 50704), 7837 - AndroidCharacter.getMirror('0'))).getMethod("b", cls, cls, cls, cls2);
                        map.put(1319531906, obj2);
                    }
                    jArr[i4] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatDelay() >> 16) + 48, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 27780), 2441 - Color.argb(0, 0, 0, 0));
                        byte b3 = $$a[1];
                        byte b4 = (byte) (b3 + 1);
                        Object[] objArr6 = new Object[1];
                        b(b3, b4, b4, objArr6);
                        obj3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1724349229, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                jArr = jArr2;
                Object[] objArr7 = {Integer.valueOf(get[i2 + i7])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(-54653524);
                if (obj4 == null) {
                    Class cls5 = (Class) removeParam.initialize(48 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (Process.myTid() >> 22), View.MeasureSpec.getMode(0) + 3221);
                    byte b5 = $$a[1];
                    byte b6 = b5;
                    Object[] objArr8 = new Object[1];
                    b(b6, (byte) (b6 + 1), (byte) (-b5), objArr8);
                    obj4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(-54653524, obj4);
                }
                Long l2 = (Long) ((Method) obj4).invoke(null, objArr7);
                l2.longValue();
                Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(getWarnings), Integer.valueOf(c)};
                Object obj5 = map2.get(1319531906);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 69, (char) (50704 - View.MeasureSpec.getMode(0)), 7789 - Gravity.getAbsoluteGravity(0, 0))).getMethod("b", cls, cls, cls, cls2);
                    map2.put(1319531906, obj5);
                }
                jArr[i7] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj6 = map2.get(1724349229);
                if (obj6 == null) {
                    Class cls6 = (Class) removeParam.initialize((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 48, (char) ((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 27779), View.getDefaultSize(0, 0) + 2441);
                    byte b7 = $$a[1];
                    byte b8 = (byte) (b7 + 1);
                    Object[] objArr11 = new Object[1];
                    b(b7, b8, b8, objArr11);
                    obj6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1724349229, obj6);
                }
                ((Method) obj6).invoke(null, objArr10);
            }
            i5 = i;
            jArr2 = jArr;
            i6 = 0;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        long[] jArr3 = jArr2;
        char c3 = '0';
        char[] cArr = new char[i5];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i11 = threeDS2ServiceInitializationCallback.initialize;
            if (i11 >= i5) {
                String str = new String(cArr);
                $10 = ($11 + 113) % 128;
                objArr[0] = str;
                return;
            }
            cArr[i11] = (char) jArr3[i11];
            Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj7 = map3.get(1724349229);
            if (obj7 != null) {
                c2 = c3;
            } else {
                c2 = c3;
                Class cls7 = (Class) removeParam.initialize(47 - TextUtils.lastIndexOf("", c2), (char) (27780 - (ViewConfiguration.getScrollBarSize() >> 8)), 2441 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                byte b9 = $$a[1];
                byte b10 = (byte) (b9 + 1);
                Object[] objArr13 = new Object[1];
                b(b9, b10, b10, objArr13);
                obj7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1724349229, obj7);
            }
            ((Method) obj7).invoke(null, objArr12);
            c3 = c2;
        }
    }

    private static void b(byte b, byte b2, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i = b2 * 4;
        int i2 = b + 4;
        int i3 = (s * 3) + 97;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 += -i;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i3;
            if (i4 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2++;
                i3 += -bArr[i2];
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{73, -1, 31, 60};
        $$b = 67;
    }

    private String initialize() {
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 5) % 128;
        Object[] objArr = new Object[1];
        a(61 - TextUtils.getOffsetBefore("", 0), ViewConfiguration.getEdgeSlop() >> 16, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 47157), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 7, 61 - KeyEvent.normalizeMetaState(0), (char) (13319 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr2);
        String ThreeDS2ServiceInstance = oj.ThreeDS2ServiceInstance(String.format(intern, ((String) objArr2[0]).intern(), this.initialize, this.ThreeDS2Service), 2048);
        int i = ThreeDS2ServiceInitializationCallback + 31;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    public setScrollCaptureCallback ThreeDS2Service() {
        int i = ThreeDS2ServiceInitializationCallback + 41;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        setTextAlignment settextalignment = this.ThreeDS2ServiceInstance;
        if (i2 != 0) {
            ((setScrollCaptureCallback.initialize) setScrollCaptureCallback.getWarnings(new Object[]{settextalignment}, -1667499669, 1667499669, (int) System.currentTimeMillis())).ThreeDS2Service(initialize()).ThreeDS2ServiceInstance();
            throw null;
        }
        setScrollCaptureCallback ThreeDS2ServiceInstance = ((setScrollCaptureCallback.initialize) setScrollCaptureCallback.getWarnings(new Object[]{settextalignment}, -1667499669, 1667499669, (int) System.currentTimeMillis())).ThreeDS2Service(initialize()).ThreeDS2ServiceInstance();
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return ThreeDS2ServiceInstance;
    }

    public setTextAlignment ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInitializationCallback + 61;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        setTextAlignment settextalignment = this.ThreeDS2ServiceInstance;
        if (i2 == 0) {
            return settextalignment;
        }
        throw null;
    }

    public String get() {
        int i = (getSDKInfo + 29) % 128;
        ThreeDS2ServiceInitializationCallback = i;
        String str = this.ThreeDS2Service;
        int i2 = i + 77;
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getWarnings() {
        int i = getSDKInfo;
        String str = this.initialize;
        ThreeDS2ServiceInitializationCallback = (i + 97) % 128;
        return str;
    }

    public setScrollCaptureCallback initialize(Throwable th) {
        int i = getSDKInfo + 117;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        setTextAlignment settextalignment = this.ThreeDS2ServiceInstance;
        if (i2 != 0) {
            setScrollCaptureCallback ThreeDS2ServiceInstance = ((setScrollCaptureCallback.initialize) setScrollCaptureCallback.getWarnings(new Object[]{settextalignment}, -1667499669, 1667499669, (int) System.currentTimeMillis())).ThreeDS2Service(initialize()).ThreeDS2Service(th).ThreeDS2ServiceInstance();
            int i3 = getSDKInfo + 37;
            ThreeDS2ServiceInitializationCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 79 / 0;
            }
            return ThreeDS2ServiceInstance;
        }
        ((setScrollCaptureCallback.initialize) setScrollCaptureCallback.getWarnings(new Object[]{settextalignment}, -1667499669, 1667499669, (int) System.currentTimeMillis())).ThreeDS2Service(initialize()).ThreeDS2Service(th).ThreeDS2ServiceInstance();
        throw null;
    }
}
