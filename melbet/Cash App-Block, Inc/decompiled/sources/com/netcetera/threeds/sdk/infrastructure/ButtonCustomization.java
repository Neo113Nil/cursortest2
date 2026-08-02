package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class ButtonCustomization {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final ButtonCustomization ThreeDS2Service;
    private static long ThreeDS2ServiceInitializationCallback;
    private static char[] cleanup;
    private static final ButtonCustomization get;
    private static int getSDKInfo;
    private static final ButtonCustomization getWarnings;
    private static final ButtonCustomization initialize;
    private static int onCompleted;
    private final List<String> ThreeDS2ServiceInstance;
    private final ThreeDS2Service createTransaction;
    private final boolean getSDKVersion;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ThreeDS2Service {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int ThreeDS2Service;
        private static int ThreeDS2ServiceInitializationCallback;
        private static final /* synthetic */ ThreeDS2Service[] ThreeDS2ServiceInstance;
        private static boolean cleanup;
        private static char[] get;
        private static int getSDKInfo;
        private static boolean getSDKVersion;
        public static final ThreeDS2Service getWarnings;
        public static final ThreeDS2Service initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKInfo = 0;
            ThreeDS2ServiceInitializationCallback = 1;
            getWarnings();
            Object[] objArr = new Object[1];
            a(null, null, 126 - MotionEvent.axisFromString(""), "\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            initialize = new ThreeDS2Service(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(null, null, 127 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\u0086\u0085\u0084\u0083\u0082\u0081\u0089\u008b\u008a\u0089\u0088\u0087\u0083\u0083\u0087", objArr2);
            getWarnings = new ThreeDS2Service(((String) objArr2[0]).intern(), 1);
            ThreeDS2ServiceInstance = ThreeDS2Service();
            int i = ThreeDS2ServiceInitializationCallback + 53;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private ThreeDS2Service(String str, int i) {
        }

        private static /* synthetic */ ThreeDS2Service[] ThreeDS2Service() {
            int i = (ThreeDS2ServiceInitializationCallback + 83) % 128;
            getSDKInfo = i;
            ThreeDS2Service[] threeDS2ServiceArr = {initialize, getWarnings};
            ThreeDS2ServiceInitializationCallback = (i + 105) % 128;
            return threeDS2ServiceArr;
        }

        private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
            int i2;
            long j;
            char[] cArr;
            Class cls;
            int i3;
            Object method;
            String str3 = str2;
            byte[] bArr = str3;
            if (str3 != null) {
                bArr = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] charArray = str != null ? str.toCharArray() : str;
            onError onerror = new onError();
            char[] cArr2 = get;
            Class cls2 = Integer.TYPE;
            int i4 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                i2 = 2;
                while (i5 < length) {
                    int i6 = $11 + 101;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Map map = removeParam.visaSchemeConfiguration;
                            Object obj = map.get(-939298638);
                            if (obj != null) {
                                cArr = cArr2;
                                i3 = i5;
                                method = obj;
                                cls = cls2;
                            } else {
                                cArr = cArr2;
                                cls = cls2;
                                i3 = i5;
                                Class cls3 = (Class) removeParam.initialize(72 - Color.alpha(i4), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.resolveSizeAndState(0, 0, 0) + 1405);
                                Object[] objArr3 = new Object[1];
                                b((byte) 0, (byte) 1, (byte) 0, objArr3);
                                method = cls3.getMethod((String) objArr3[0], cls);
                                map.put(-939298638, method);
                            }
                            cArr3[i3] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                            i5 = i3 << 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        cArr = cArr2;
                        cls = cls2;
                        int i7 = i5;
                        Object[] objArr4 = {Integer.valueOf(cArr[i7])};
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(-939298638);
                        if (obj2 == null) {
                            Class cls4 = (Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 72, (char) (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 1405 - (KeyEvent.getMaxKeyCode() >> 16));
                            Object[] objArr5 = new Object[1];
                            b((byte) 0, (byte) 1, (byte) 0, objArr5);
                            obj2 = cls4.getMethod((String) objArr5[0], cls);
                            map2.put(-939298638, obj2);
                        }
                        cArr3[i7] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                        i5 = i7 + 1;
                    }
                    cls2 = cls;
                    cArr2 = cArr;
                    i4 = 0;
                }
                cArr2 = cArr3;
            } else {
                i2 = 2;
            }
            Class cls5 = cls2;
            Object[] objArr6 = {Integer.valueOf(ThreeDS2Service)};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj3 = map3.get(-1598850155);
            if (obj3 == null) {
                Class cls6 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0') + 74, (char) (7530 - View.getDefaultSize(0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 2489);
                Object[] objArr7 = new Object[1];
                b((byte) 0, (byte) 0, (byte) 0, objArr7);
                obj3 = cls6.getMethod((String) objArr7[0], cls5);
                map3.put(-1598850155, obj3);
            }
            int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
            long j2 = 0;
            if (cleanup) {
                $10 = ($11 + 31) % 128;
                int length2 = bArr2.length;
                onerror.ThreeDS2ServiceInstance = length2;
                char[] cArr4 = new char[length2];
                onerror.getWarnings = 0;
                while (true) {
                    int i8 = onerror.getWarnings;
                    int i9 = onerror.ThreeDS2ServiceInstance;
                    if (i8 >= i9) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    $10 = ($11 + 67) % 128;
                    cArr4[i8] = (char) (cArr2[bArr2[(i9 - 1) - i8] + i] - intValue);
                    Object[] objArr8 = new Object[i2];
                    objArr8[1] = onerror;
                    objArr8[0] = onerror;
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(73542081);
                    if (obj4 != null) {
                        j = j2;
                    } else {
                        j = j2;
                        obj4 = ((Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 48, (char) ((Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 11441)).getMethod("k", Object.class, Object.class);
                        map4.put(73542081, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr8);
                    j2 = j;
                    i2 = 2;
                }
            } else if (getSDKVersion) {
                int length3 = charArray.length;
                onerror.ThreeDS2ServiceInstance = length3;
                char[] cArr5 = new char[length3];
                onerror.getWarnings = 0;
                while (true) {
                    int i10 = onerror.getWarnings;
                    int i11 = onerror.ThreeDS2ServiceInstance;
                    if (i10 >= i11) {
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    $11 = ($10 + 81) % 128;
                    cArr5[i10] = (char) (cArr2[charArray[(i11 - 1) - i10] - i] - intValue);
                    Object[] objArr9 = {onerror, onerror};
                    Map map5 = removeParam.visaSchemeConfiguration;
                    Object obj5 = map5.get(73542081);
                    if (obj5 == null) {
                        obj5 = ((Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 11441 - Color.red(0))).getMethod("k", Object.class, Object.class);
                        map5.put(73542081, obj5);
                    }
                    ((Method) obj5).invoke(null, objArr9);
                }
            } else {
                int length4 = iArr.length;
                onerror.ThreeDS2ServiceInstance = length4;
                char[] cArr6 = new char[length4];
                onerror.getWarnings = 0;
                while (true) {
                    int i12 = onerror.getWarnings;
                    int i13 = onerror.ThreeDS2ServiceInstance;
                    if (i12 >= i13) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i14 = $11 + 39;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr6[i12] = (char) (cArr2[iArr[(i13 % 1) % i12] >> i] - intValue);
                    } else {
                        cArr6[i12] = (char) (cArr2[iArr[(i13 - 1) - i12] - i] - intValue);
                        i12++;
                    }
                    onerror.getWarnings = i12;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        /* JADX WARN: Type inference failed for: r7v2, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, byte b2, byte b3, Object[] objArr) {
            int i;
            int i2;
            int i3 = 109 - b2;
            ?? r7 = (b3 * 4) + 4;
            int i4 = b * 2;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                byte b4 = r7;
                int i5 = 0;
                int i6 = r7;
                i3 += b4;
                i = i5;
                i2 = i6 + 1;
                bArr2[i] = (byte) i3;
                i5 = i + 1;
                if (i == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                b4 = bArr[i2];
                i6 = i2;
                i3 += b4;
                i = i5;
                i2 = i6 + 1;
                bArr2[i] = (byte) i3;
                i5 = i + 1;
                if (i == i4) {
                }
            } else {
                i = 0;
                i2 = r7;
                bArr2[i] = (byte) i3;
                i5 = i + 1;
                if (i == i4) {
                }
            }
        }

        public static void getWarnings() {
            get = new char[]{15125, 15124, 15126, 15135, 15122, 15129, 15111, 15087, 15073, 15121, 15130};
            ThreeDS2Service = 993475392;
            getSDKVersion = true;
            cleanup = true;
        }

        public static void init$0() {
            $$a = new byte[]{20, -30, -118, -100};
            $$b = 50;
        }

        public static ThreeDS2Service valueOf(String str) {
            int i = getSDKInfo + 101;
            ThreeDS2ServiceInitializationCallback = i % 128;
            if (i % 2 != 0) {
                return (ThreeDS2Service) Enum.valueOf(ThreeDS2Service.class, str);
            }
            Enum.valueOf(ThreeDS2Service.class, str);
            throw null;
        }

        public static ThreeDS2Service[] values() {
            getSDKInfo = (ThreeDS2ServiceInitializationCallback + 83) % 128;
            ThreeDS2Service[] threeDS2ServiceArr = (ThreeDS2Service[]) ThreeDS2ServiceInstance.clone();
            ThreeDS2ServiceInitializationCallback = (getSDKInfo + 47) % 128;
            return threeDS2ServiceArr;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKInfo = 0;
        onCompleted = 1;
        getSDKInfo();
        Object[] objArr = new Object[1];
        a(Color.green(0) + 4, View.combineMeasuredStates(0, 0) + 11, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        get = (ButtonCustomization) ThreeDS2Service(new Object[]{((String) objArr[0]).intern()}, 1474880219, -1474880219, (int) System.currentTimeMillis());
        Object[] objArr2 = new Object[1];
        a(TextUtils.getOffsetAfter("", 0) + 4, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, (char) View.MeasureSpec.getSize(0), objArr2);
        ThreeDS2Service = (ButtonCustomization) ThreeDS2Service(new Object[]{((String) objArr2[0]).intern()}, 1474880219, -1474880219, (int) System.currentTimeMillis());
        Object[] objArr3 = new Object[1];
        a(4 - View.MeasureSpec.getSize(0), (ViewConfiguration.getEdgeSlop() >> 16) + 19, (char) ((-16747250) - Color.rgb(0, 0, 0)), objArr3);
        getWarnings = (ButtonCustomization) ThreeDS2Service(new Object[]{((String) objArr3[0]).intern()}, 1474880219, -1474880219, (int) System.currentTimeMillis());
        Object[] objArr4 = new Object[1];
        a(4 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr4);
        initialize = (ButtonCustomization) ThreeDS2Service(new Object[]{((String) objArr4[0]).intern()}, 1474880219, -1474880219, (int) System.currentTimeMillis());
        int i = getSDKInfo + 45;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ButtonCustomization(List<String> list, boolean z, ThreeDS2Service threeDS2Service) {
        this.ThreeDS2ServiceInstance = list;
        this.getSDKVersion = z;
        this.createTransaction = threeDS2Service;
    }

    public static ButtonCustomization ThreeDS2Service(String str) {
        int i = getSDKInfo + 5;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            oj.initialize(str);
            throw null;
        }
        boolean z = false;
        if (oj.initialize(str)) {
            getSDKInfo = (onCompleted + 99) % 128;
            Object[] objArr = new Object[1];
            a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, TextUtils.getOffsetBefore("", 0), (char) TextUtils.getOffsetAfter("", 0), objArr);
            if (str.matches(((String) objArr[0]).intern())) {
                onCompleted = (getSDKInfo + 71) % 128;
                Object[] objArr2 = new Object[1];
                a(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 10, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr2);
                if (((String) objArr2[0]).intern().equals(str)) {
                    getSDKInfo = (onCompleted + 49) % 128;
                } else {
                    getSDKInfo = (onCompleted + 95) % 128;
                    z = true;
                }
                ButtonCustomization initialize2 = initialize(z);
                int i2 = onCompleted + 9;
                getSDKInfo = i2 % 128;
                if (i2 % 2 == 0) {
                    return initialize2;
                }
                throw null;
            }
        }
        return (ButtonCustomization) ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
    }

    public static ButtonCustomization ThreeDS2ServiceInstance(List<String> list) {
        if (list != null) {
            getSDKInfo = (onCompleted + 63) % 128;
            ListIterator<String> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                int i = onCompleted + 47;
                getSDKInfo = i % 128;
                if (i % 2 != 0) {
                    oj.get(listIterator.next());
                    throw null;
                }
                if (oj.get(listIterator.next())) {
                    listIterator.remove();
                }
            }
            if (!list.isEmpty()) {
                return new ButtonCustomization(Collections.unmodifiableList(new ArrayList(list)), true, ThreeDS2Service.getWarnings);
            }
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        getSDKInfo = (onCompleted + 51) % 128;
        return buttonCustomization;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0344  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        long[] jArr;
        int i3;
        Integer num;
        Integer num2 = -54653524;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i];
        int i4 = 0;
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i5 = threeDS2ServiceInitializationCallback.initialize;
            if (i5 >= i) {
                break;
            }
            int i6 = $11 + 59;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i7 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cleanup[i2 << i5])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(num2);
                    if (obj != null) {
                        jArr = jArr2;
                    } else {
                        Class cls3 = (Class) removeParam.initialize(47 - MotionEvent.axisFromString(""), (char) TextUtils.indexOf("", "", i4), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3221);
                        Object[] objArr3 = new Object[1];
                        jArr = jArr2;
                        b((byte) 0, (short) -1, (byte) 0, objArr3);
                        Method method = cls3.getMethod((String) objArr3[0], cls2);
                        map.put(num2, method);
                        obj = method;
                    }
                    Long l = (Long) ((Method) obj).invoke(null, objArr2);
                    l.longValue();
                    Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(ThreeDS2ServiceInitializationCallback), Integer.valueOf(c)};
                    Object obj2 = map.get(1319531906);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(68 - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 50703), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7788)).getMethod("b", cls, cls, cls, cls2);
                        map.put(1319531906, obj2);
                    }
                    jArr[i5] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47, (char) (27780 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 2441 - View.resolveSize(0, 0));
                        Object[] objArr6 = new Object[1];
                        b((byte) 0, (short) -1, (byte) 1, objArr6);
                        obj3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1724349229, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                    num = num2;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                jArr = jArr2;
                Object[] objArr7 = {Integer.valueOf(cleanup[i2 + i5])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(num2);
                if (obj4 != null) {
                    i3 = i5;
                } else {
                    Class cls5 = (Class) removeParam.initialize(49 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.alpha(0) + 3221);
                    Object[] objArr8 = new Object[1];
                    i3 = i5;
                    b((byte) 0, (short) -1, (byte) 0, objArr8);
                    obj4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(num2, obj4);
                }
                Long l2 = (Long) ((Method) obj4).invoke(null, objArr7);
                l2.longValue();
                num = num2;
                Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(ThreeDS2ServiceInitializationCallback), Integer.valueOf(c)};
                Object obj5 = map2.get(1319531906);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(68 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Process.getGidForName("") + 50705), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7788)).getMethod("b", cls, cls, cls, cls2);
                    map2.put(1319531906, obj5);
                }
                jArr[i3] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj6 = map2.get(1724349229);
                if (obj6 == null) {
                    Class cls6 = (Class) removeParam.initialize(View.MeasureSpec.getMode(0) + 48, (char) (27779 - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) + 2442);
                    Object[] objArr11 = new Object[1];
                    b((byte) 0, (short) -1, (byte) 1, objArr11);
                    obj6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1724349229, obj6);
                }
                ((Method) obj6).invoke(null, objArr10);
            }
            jArr2 = jArr;
            num2 = num;
            i4 = 0;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        long[] jArr3 = jArr2;
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        $10 = ($11 + 23) % 128;
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
                Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj7 = map3.get(1724349229);
                if (obj7 == null) {
                    Class cls7 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 49, (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 27779), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2440);
                    Object[] objArr13 = new Object[1];
                    b((byte) 0, (short) -1, (byte) 1, objArr13);
                    obj7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                    map3.put(1724349229, obj7);
                }
                ((Method) obj7).invoke(null, objArr12);
                int i10 = 48 / 0;
            } else {
                cArr[i8] = (char) jArr3[i8];
                Object[] objArr14 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj8 = map4.get(1724349229);
                if (obj8 == null) {
                    Class cls8 = (Class) removeParam.initialize(Color.green(0) + 48, (char) (27780 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2441);
                    Object[] objArr15 = new Object[1];
                    b((byte) 0, (short) -1, (byte) 1, objArr15);
                    obj8 = cls8.getMethod((String) objArr15[0], Object.class, Object.class);
                    map4.put(1724349229, obj8);
                }
                ((Method) obj8).invoke(null, objArr14);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, Object[] objArr) {
        int i;
        int i2;
        int i3 = 1 - (b * 4);
        int i4 = s + 4;
        byte[] bArr = $$a;
        int i5 = 100 - (b2 * 3);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i5 += -i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            i4++;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i5 += -i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            i4++;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            i4++;
            if (i2 == i3) {
            }
        }
    }

    public static ButtonCustomization get(boolean z) {
        String num;
        int i = onCompleted + 39;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (z) {
            num = Integer.toString(1);
        } else {
            num = Integer.toString(0);
            onCompleted = (getSDKInfo + 69) % 128;
        }
        return getWarnings(num);
    }

    public static void getSDKInfo() {
        cleanup = new char[]{35174, 50470, 4505, 28122, 47217, 62558, 16634, 40127, 60219, 10097, 35080, 35178, 50488, 4482, 28102, 35178, 50488, 4482, 28101, 64612, 45110, 25740, 6346, 35178, 50488, 4482, 28099};
        ThreeDS2ServiceInitializationCallback = -6755388747712903811L;
    }

    public static ButtonCustomization getWarnings(String str) {
        onCompleted = (getSDKInfo + 39) % 128;
        if (oj.initialize(str)) {
            return new ButtonCustomization(Collections.singletonList(str), true, ThreeDS2Service.initialize);
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        onCompleted = (getSDKInfo + 39) % 128;
        return buttonCustomization;
    }

    public static void init$0() {
        $$a = new byte[]{27, -11, -32, -41};
        $$b = 239;
    }

    public static ButtonCustomization initialize(double d) {
        if (d % 1.0d <= 0.0d) {
            return ThreeDS2ServiceInstance((long) d);
        }
        getSDKInfo = (onCompleted + 89) % 128;
        ButtonCustomization warnings = getWarnings(Double.toString(d));
        onCompleted = (getSDKInfo + 53) % 128;
        return warnings;
    }

    public boolean ThreeDS2ServiceInitializationCallback() {
        int i = getSDKInfo + 9;
        onCompleted = i % 128;
        int i2 = i % 2;
        boolean z = this.getSDKVersion;
        if (i2 == 0) {
            int i3 = 1 / 0;
        }
        return z;
    }

    public ThreeDS2Service cleanup() {
        int i = onCompleted;
        ThreeDS2Service threeDS2Service = this.createTransaction;
        int i2 = i + 43;
        getSDKInfo = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
        return threeDS2Service;
    }

    public static ButtonCustomization get() {
        int i = onCompleted;
        int i2 = i + 125;
        getSDKInfo = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ButtonCustomization buttonCustomization = get;
        getSDKInfo = (i + 25) % 128;
        return buttonCustomization;
    }

    public static ButtonCustomization initialize(CharSequence charSequence) {
        String str;
        if (charSequence != null) {
            onCompleted = (getSDKInfo + 29) % 128;
            str = String.valueOf(charSequence);
            getSDKInfo = (onCompleted + 125) % 128;
        } else {
            str = null;
        }
        return getWarnings(str);
    }

    public static ButtonCustomization initialize(boolean z) {
        onCompleted = (getSDKInfo + 37) % 128;
        ButtonCustomization warnings = getWarnings(Boolean.toString(z));
        int i = getSDKInfo + 1;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 1 / 0;
        }
        return warnings;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        ButtonCustomization buttonCustomization = new ButtonCustomization(Collections.singletonList((String) objArr[0]), false, ThreeDS2Service.initialize);
        int i = onCompleted + 111;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            int i2 = 17 / 0;
        }
        return buttonCustomization;
    }

    public List<String> initialize() {
        int i = onCompleted + 105;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        List<String> list = this.ThreeDS2ServiceInstance;
        if (i2 == 0) {
            return list;
        }
        throw null;
    }

    public static ButtonCustomization getWarnings() {
        int i = onCompleted + 65;
        int i2 = i % 128;
        getSDKInfo = i2;
        if (i % 2 != 0) {
            throw null;
        }
        ButtonCustomization buttonCustomization = ThreeDS2Service;
        onCompleted = (i2 + 37) % 128;
        return buttonCustomization;
    }

    public static ButtonCustomization ThreeDS2ServiceInstance(String str) {
        getSDKInfo = (onCompleted + 39) % 128;
        if (om.getWarnings(str)) {
            onCompleted = (getSDKInfo + 45) % 128;
            return initialize(Double.parseDouble(str));
        }
        return (ButtonCustomization) ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
    }

    public static ButtonCustomization ThreeDS2ServiceInstance(long j) {
        int i = getSDKInfo + 75;
        onCompleted = i % 128;
        int i2 = i % 2;
        String l = Long.toString(j);
        if (i2 == 0) {
            getWarnings(l);
            throw null;
        }
        ButtonCustomization warnings = getWarnings(l);
        getSDKInfo = (onCompleted + 59) % 128;
        return warnings;
    }

    public static ButtonCustomization ThreeDS2ServiceInstance() {
        return (ButtonCustomization) ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
    }

    public static ButtonCustomization ThreeDS2Service() {
        int i = onCompleted + 91;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return getWarnings;
        }
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        int i = onCompleted + 59;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return initialize;
        }
        throw null;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * 399) + (i * 399);
        int i5 = ~((~i) | i2);
        int i6 = ~i2;
        int i7 = ~(i6 | i);
        return ((((~((~i3) | i6)) | i5) | i7) * 398) + (((i | i2) * (-1194)) + ((((i5 | i7) | (~(i6 | i3))) * 398) + i4)) != 1 ? initialize(objArr) : ThreeDS2Service(objArr);
    }
}
