package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class load implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ load[] ConfigParameters;
    public static final load ThreeDS2Service;
    public static final load ThreeDS2ServiceInstance;
    private static int addParam;
    private static int apiKey;
    public static final load cleanup;
    private static boolean configureScheme;
    public static final load createTransaction;
    public static final load get;
    private static char[] getParamValue;
    public static final load getSDKInfo;
    public static final load getSDKVersion;
    public static final load getWarnings;
    public static final load initialize;
    private static char[] onCompleted;
    private static long onError;
    private static boolean removeParam;
    private static int restrictedParameters;
    private String ThreeDS2ServiceInitializationCallback;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        apiKey = 0;
        restrictedParameters = 1;
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a(3 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(null, null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0084\u0083\u0082\u0081", objArr2);
        getWarnings = new load(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(3 - ImageFormat.getBitsPerPixel(0), 5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (34400 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(View.resolveSize(0, 0) + 4, (ViewConfiguration.getScrollBarSize() >> 8) + 8, (char) (18991 - Process.getGidForName("")), objArr4);
        initialize = new load(intern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Drawable.resolveOpacity(0, 0) + 12, (char) View.resolveSizeAndState(0, 0, 0), objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(4 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0) + 16, (char) Drawable.resolveOpacity(0, 0), objArr6);
        get = new load(intern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        b(null, null, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0087\u0086\u0082\u0085", objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(4 - View.getDefaultSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 20, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr8);
        ThreeDS2ServiceInstance = new load(intern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        b(null, null, Color.blue(0) + 127, "\u0088\u0086\u0082\u0081", objArr9);
        String intern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b(null, null, View.MeasureSpec.getSize(0) + 127, "\u0089\u0083\u0082\u0081", objArr10);
        ThreeDS2Service = new load(intern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        b(null, null, 127 - View.MeasureSpec.getMode(0), "\u0088\u0086\u0082\u008a", objArr11);
        String intern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0089\u0083\u0082\u008a", objArr12);
        cleanup = new load(intern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 5, View.resolveSize(0, 0) + 24, (char) (ExpandableListView.getPackedPositionGroup(0L) + 2624), objArr13);
        String intern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a(4 - (ViewConfiguration.getJumpTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 28, (char) (28481 - TextUtils.getCapsMode("", 0, 0)), objArr14);
        createTransaction = new load(intern7, 6, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        a(4 - Gravity.getAbsoluteGravity(0, 0), 32 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 8723), objArr15);
        String intern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        b(null, null, 127 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\u0089\u0083\u0082\u0082", objArr16);
        getSDKInfo = new load(intern8, 7, ((String) objArr16[0]).intern());
        Object[] objArr17 = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 4, View.MeasureSpec.getSize(0) + 36, (char) (17088 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr17);
        String intern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        b(null, null, 127 - Color.red(0), "\u0084\u0083\u0082\u0082", objArr18);
        getSDKVersion = new load(intern9, 8, ((String) objArr18[0]).intern());
        ConfigParameters = initialize();
        apiKey = (restrictedParameters + 107) % 128;
    }

    private load(String str, int i, String str2) {
        this.ThreeDS2ServiceInitializationCallback = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        getParamValue = new char[]{35195, 48038, 60645, 4367, 3869, 15814, 27282, 38771, 49997, 61878, 42722, 23299, 35193, 48038, 60645, 4365, 35193, 48038, 60613, 4397, 35193, 48038, 60613, 4399, 33576, 45542, 59045, 6991, 58921, 54503, 33668, 32366, 43896, 39348, 52983, 13087, 52181, 63769, 44634, 21424};
        onError = 6519517646766783476L;
        onCompleted = new char[]{15223, 15168, 15189, 15143, 15217, 15221, 15175, 15169, 15137, 15170};
        addParam = 993475506;
        removeParam = true;
        configureScheme = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        char c2;
        Object method;
        Throwable cause;
        int i3;
        int i4;
        Object method2;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr = new long[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i5 = threeDS2ServiceInitializationCallback.initialize;
            if (i5 >= i) {
                break;
            }
            $11 = ($10 + 39) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(getParamValue[i2 + i5])};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-54653524);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    i4 = 1;
                    method2 = obj;
                    i3 = 2;
                } else {
                    i3 = 2;
                    Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatDelay() >> 16) + 48, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3220);
                    Object[] objArr3 = new Object[1];
                    i4 = 1;
                    c((byte) 9, 0, (byte) 0, objArr3);
                    method2 = cls2.getMethod((String) objArr3[0], cls);
                    map.put(-54653524, method2);
                }
                Long l = (Long) ((Method) method2).invoke(null, objArr2);
                l.longValue();
                long j = threeDS2ServiceInitializationCallback.initialize;
                long j2 = onError;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c);
                objArr4[i3] = Long.valueOf(j2);
                objArr4[i4] = Long.valueOf(j);
                objArr4[0] = l;
                Object obj2 = map.get(1319531906);
                if (obj2 == null) {
                    Class cls3 = (Class) removeParam.initialize(69 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (AndroidCharacter.getMirror('0') + 50656), 7790 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    Class cls4 = Long.TYPE;
                    obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                    map.put(1319531906, obj2);
                }
                jArr[i5] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i3];
                objArr5[i4] = threeDS2ServiceInitializationCallback;
                objArr5[0] = threeDS2ServiceInitializationCallback;
                Object obj3 = map.get(1724349229);
                if (obj3 == null) {
                    Class cls5 = (Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 48, (char) (27780 - View.MeasureSpec.getSize(0)), 2441 - View.MeasureSpec.getMode(0));
                    Object[] objArr6 = new Object[i4];
                    c((byte) 12, 0, (byte) 0, objArr6);
                    obj3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1724349229, obj3);
                }
                ((Method) obj3).invoke(null, objArr5);
                $11 = ($10 + 87) % 128;
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
        char c3 = '0';
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i6 = threeDS2ServiceInitializationCallback.initialize;
            if (i6 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i6] = (char) jArr[i6];
            Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(1724349229);
            if (obj4 != null) {
                method = obj4;
                c2 = c3;
            } else {
                c2 = c3;
                Class cls6 = (Class) removeParam.initialize(48 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (27779 - TextUtils.indexOf("", c2, 0)), 2441 - TextUtils.indexOf("", ""));
                Object[] objArr8 = new Object[1];
                c((byte) 12, 0, (byte) 0, objArr8);
                method = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1724349229, method);
            }
            ((Method) method).invoke(null, objArr7);
            c3 = c2;
        }
    }

    private static void b(String str, int[] iArr, int i, String str2, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3;
        char[] cArr2;
        int length;
        char[] cArr3;
        int i4;
        int i5;
        char[] cArr4;
        Class cls;
        int i6;
        char[] cArr5;
        Object method;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            $10 = ($11 + 59) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        int i7 = 0;
        if (str != null) {
            int i8 = $10 + 87;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr = str.toCharArray();
                int i9 = 62 / 0;
            } else {
                cArr = str.toCharArray();
            }
        } else {
            cArr = str;
        }
        char[] cArr6 = cArr;
        onError onerror = new onError();
        char[] cArr7 = onCompleted;
        Class cls2 = Integer.TYPE;
        if (cArr7 != null) {
            int i10 = $10 + 109;
            i2 = 2;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = cArr7.length;
                cArr3 = new char[length];
                i4 = 1;
            } else {
                length = cArr7.length;
                cArr3 = new char[length];
                i4 = 0;
            }
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr7[i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        i5 = length;
                        method = obj;
                        cArr4 = cArr7;
                        cls = cls2;
                        i6 = i4;
                        cArr5 = cArr3;
                    } else {
                        i5 = length;
                        cArr4 = cArr7;
                        cls = cls2;
                        Class cls3 = (Class) removeParam.initialize(View.MeasureSpec.makeMeasureSpec(i7, i7) + 72, (char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf("", "", 0, 0) + 1405);
                        byte b = (byte) ($$b & 1);
                        byte b2 = (byte) (b - 1);
                        i6 = i4;
                        cArr5 = cArr3;
                        Object[] objArr3 = new Object[1];
                        c(b, b2, b2, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-939298638, method);
                    }
                    cArr5[i6] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i4 = i6 + 1;
                    $11 = ($10 + 9) % 128;
                    length = i5;
                    cArr7 = cArr4;
                    cls2 = cls;
                    cArr3 = cArr5;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr7 = cArr3;
        } else {
            i2 = 2;
        }
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(addParam)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        float f = RecyclerView.DECELERATION_RATE;
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize(TextUtils.getOffsetBefore("", 0) + 73, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7530), 2490 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
            Object[] objArr5 = new Object[1];
            c((byte) 0, 0, (byte) 0, objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        if (configureScheme) {
            int i11 = $11 + 75;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                int length2 = bArr2.length;
                onerror.ThreeDS2ServiceInstance = length2;
                cArr2 = new char[length2];
                i3 = 0;
            } else {
                i3 = 0;
                int length3 = bArr2.length;
                onerror.ThreeDS2ServiceInstance = length3;
                cArr2 = new char[length3];
            }
            onerror.getWarnings = i3;
            while (true) {
                int i12 = onerror.getWarnings;
                int i13 = onerror.ThreeDS2ServiceInstance;
                if (i12 >= i13) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                int i14 = $11 + 35;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr2[i12] = (char) (cArr7[bArr2[i13 >>> i12] >> i] - intValue);
                    Object[] objArr6 = new Object[i2];
                    objArr6[1] = onerror;
                    objArr6[0] = onerror;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(73542081);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), Color.alpha(0) + 11441)).getMethod("k", Object.class, Object.class);
                        map3.put(73542081, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                } else {
                    cArr2[i12] = (char) (cArr7[bArr2[(i13 - 1) - i12] + i] - intValue);
                    Object[] objArr7 = {onerror, onerror};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(73542081);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 47, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11441)).getMethod("k", Object.class, Object.class);
                        map4.put(73542081, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr7);
                }
                i2 = 2;
            }
        } else if (removeParam) {
            int length4 = cArr6.length;
            onerror.ThreeDS2ServiceInstance = length4;
            char[] cArr8 = new char[length4];
            onerror.getWarnings = 0;
            while (true) {
                int i15 = onerror.getWarnings;
                int i16 = onerror.ThreeDS2ServiceInstance;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr8);
                    return;
                }
                cArr8[i15] = (char) (cArr7[cArr6[(i16 - 1) - i15] - i] - intValue);
                Object[] objArr8 = {onerror, onerror};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(73542081);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(TextUtils.getTrimmedLength("") + 48, (char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 11440 - TextUtils.indexOf((CharSequence) "", '0', 0))).getMethod("k", Object.class, Object.class);
                    map5.put(73542081, obj5);
                }
                ((Method) obj5).invoke(null, objArr8);
                $10 = ($11 + 19) % 128;
                f = RecyclerView.DECELERATION_RATE;
            }
        } else {
            int length5 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length5;
            char[] cArr9 = new char[length5];
            onerror.getWarnings = 0;
            while (true) {
                int i17 = onerror.getWarnings;
                int i18 = onerror.ThreeDS2ServiceInstance;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr9);
                    return;
                } else {
                    cArr9[i17] = (char) (cArr7[iArr[(i18 - 1) - i17] - i] - intValue);
                    onerror.getWarnings = i17 + 1;
                }
            }
        }
    }

    private static void c(byte b, int i, byte b2, Object[] objArr) {
        int i2 = i * 3;
        byte[] bArr = $$a;
        int i3 = (b2 * 4) + 4;
        int i4 = 109 - b;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = i5 + i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i3];
                i3++;
                i4 += b3;
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{107, 82, -52, 66};
        $$b = 119;
    }

    private static /* synthetic */ load[] initialize() {
        int i = restrictedParameters;
        load[] loadVarArr = {getWarnings, initialize, get, ThreeDS2ServiceInstance, ThreeDS2Service, cleanup, createTransaction, getSDKInfo, getSDKVersion};
        apiKey = (i + 17) % 128;
        return loadVarArr;
    }

    public static load valueOf(String str) {
        restrictedParameters = (apiKey + 93) % 128;
        load loadVar = (load) Enum.valueOf(load.class, str);
        apiKey = (restrictedParameters + 27) % 128;
        return loadVar;
    }

    public static load[] values() {
        int i = apiKey + 37;
        restrictedParameters = i % 128;
        if (i % 2 == 0) {
            ConfigParameters.clone();
            throw null;
        }
        load[] loadVarArr = (load[]) ConfigParameters.clone();
        restrictedParameters = (apiKey + 103) % 128;
        return loadVarArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = apiKey;
        String str = this.ThreeDS2ServiceInitializationCallback;
        int i2 = i + 63;
        restrictedParameters = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
