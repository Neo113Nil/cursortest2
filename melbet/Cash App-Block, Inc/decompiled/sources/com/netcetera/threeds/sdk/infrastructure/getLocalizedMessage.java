package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class getLocalizedMessage implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char ConfigParameters;
    private static int ConfigurationBuilder;
    public static final getLocalizedMessage ThreeDS2Service;
    public static final getLocalizedMessage ThreeDS2ServiceInitializationCallback;
    public static final getLocalizedMessage ThreeDS2ServiceInstance;
    private static char addParam;
    private static final /* synthetic */ getLocalizedMessage[] cleanup;
    public static final getLocalizedMessage createTransaction;
    public static final getLocalizedMessage get;
    private static char getParamValue;
    private static char[] getSDKInfo;
    public static final getLocalizedMessage getWarnings;
    public static final getLocalizedMessage initialize;
    private static char onCompleted;
    private static char onError;
    private static int restrictedParameters;
    private String getSDKVersion;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ConfigurationBuilder = 0;
        restrictedParameters = 1;
        initialize();
        Object[] objArr = new Object[1];
        a((byte) (ImageFormat.getBitsPerPixel(0) + 58), "\u0017\u0001\u0001\u0018", 4 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((byte) (View.resolveSizeAndState(0, 0, 0) + 37), "\u000e\u0015", 2 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        initialize = new getLocalizedMessage(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 58), "\b\u000b\u0017\u0011\u0012\u0004\u0001\u0007\u0004\u0012\u0001\u0012㘈", 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((byte) ((-16777175) - Color.rgb(0, 0, 0)), "\f\u0010", KeyEvent.keyCodeFromString("") + 2, objArr4);
        ThreeDS2Service = new getLocalizedMessage(intern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a((byte) (62 - TextUtils.indexOf((CharSequence) "", '0')), "\u0014\r\u0010\u0018\f\u0003\b\u0001\u0012\u0004\u0015\u0001", 12 - Gravity.getAbsoluteGravity(0, 0), objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a((byte) (View.resolveSize(0, 0) + 41), "\u000e\u0006", 2 - Color.argb(0, 0, 0, 0), objArr6);
        ThreeDS2ServiceInstance = new getLocalizedMessage(intern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a((byte) (22 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "㗪㗪㗭", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a((byte) (KeyEvent.keyCodeFromString("") + 112), "\f\n", 2 - Drawable.resolveOpacity(0, 0), objArr8);
        get = new getLocalizedMessage(intern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        b("\u0a5f蘏줬깣", (Process.myPid() >> 22) + 4, objArr9);
        String intern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b("ꭩ듆", (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2, objArr10);
        getWarnings = new getLocalizedMessage(intern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        a((byte) (94 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0006\u0014\u0018\u0012\u0003\u0007\u0005\u0017", ((Process.getThreadPriority(0) + 20) >> 6) + 8, objArr11);
        String intern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b("겒\ue115", 1 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr12);
        createTransaction = new getLocalizedMessage(intern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        b("慲밭褦윥", View.MeasureSpec.getMode(0) + 4, objArr13);
        String intern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a((byte) (78 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0010\u0006", 2 - Color.blue(0), objArr14);
        ThreeDS2ServiceInitializationCallback = new getLocalizedMessage(intern7, 6, ((String) objArr14[0]).intern());
        cleanup = ThreeDS2ServiceInstance();
        restrictedParameters = (ConfigurationBuilder + 109) % 128;
    }

    private getLocalizedMessage(String str, int i, String str2) {
        this.getSDKVersion = str2;
    }

    private static /* synthetic */ getLocalizedMessage[] ThreeDS2ServiceInstance() {
        getLocalizedMessage[] getlocalizedmessageArr;
        int i = restrictedParameters;
        int i2 = i + 75;
        ConfigurationBuilder = i2 % 128;
        if (i2 % 2 != 0) {
            getlocalizedmessageArr = new getLocalizedMessage[87];
            getlocalizedmessageArr[0] = initialize;
            getlocalizedmessageArr[0] = ThreeDS2Service;
            getlocalizedmessageArr[4] = ThreeDS2ServiceInstance;
            getlocalizedmessageArr[4] = get;
            getlocalizedmessageArr[5] = getWarnings;
            getlocalizedmessageArr[3] = createTransaction;
            getlocalizedmessageArr[73] = ThreeDS2ServiceInitializationCallback;
        } else {
            getlocalizedmessageArr = new getLocalizedMessage[]{initialize, ThreeDS2Service, ThreeDS2ServiceInstance, get, getWarnings, createTransaction, ThreeDS2ServiceInitializationCallback};
        }
        ConfigurationBuilder = (i + 53) % 128;
        return getlocalizedmessageArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0165, code lost:
    
        if (r12 == r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a4, code lost:
    
        r7 = new java.lang.Object[13];
        r7[12] = r5;
        r7[11] = java.lang.Integer.valueOf(r3);
        r7[10] = r5;
        r7[9] = r5;
        r7[r11] = java.lang.Integer.valueOf(r3);
        r7[7] = r5;
        r7[6] = r5;
        r7[5] = java.lang.Integer.valueOf(r3);
        r7[4] = r5;
        r7[3] = r5;
        r7[r16] = java.lang.Integer.valueOf(r3);
        r7[1] = r5;
        r7[0] = r5;
        r9 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r24 = r9.get(-1395483366);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ec, code lost:
    
        if (r24 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ee, code lost:
    
        r25 = r11;
        r26 = '\t';
        r27 = 6;
        r11 = r24;
        r24 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r42 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024a, code lost:
    
        r7 = ((java.lang.Integer) ((java.lang.reflect.Method) r11).invoke(null, r7)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0257, code lost:
    
        r11 = r5.cleanup;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0259, code lost:
    
        if (r7 != r11) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025b, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.$10 = (com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.$11 + 101) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0263, code lost:
    
        r7 = new java.lang.Object[11];
        r7[10] = r5;
        r7[r26] = java.lang.Integer.valueOf(r3);
        r7[r25] = r5;
        r7[r24] = java.lang.Integer.valueOf(r3);
        r7[r27] = java.lang.Integer.valueOf(r3);
        r7[5] = r5;
        r7[4] = r5;
        r7[3] = java.lang.Integer.valueOf(r3);
        r7[r16] = java.lang.Integer.valueOf(r3);
        r7[1] = r5;
        r7[0] = r5;
        r11 = r9.get(1507360409);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0297, code lost:
    
        if (r11 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02db, code lost:
    
        r7 = ((java.lang.Integer) ((java.lang.reflect.Method) r11).invoke(null, r7)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e8, code lost:
    
        r9 = (r5.ThreeDS2ServiceInstance * r3) + r5.cleanup;
        r11 = r5.getWarnings;
        r4[r11] = r8[r7];
        r4[r11 + 1] = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        r4 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029a, code lost:
    
        r11 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 48, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25644), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 11489);
        r28 = java.lang.Integer.TYPE;
        r11 = r11.getMethod("x", java.lang.Object.class, java.lang.Object.class, r28, r28, java.lang.Object.class, java.lang.Object.class, r28, r28, java.lang.Object.class, r28, java.lang.Object.class);
        r9.put(1507360409, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02fe, code lost:
    
        r7 = r5.ThreeDS2Service;
        r9 = r5.ThreeDS2ServiceInstance;
        r12 = r5.ThreeDS2ServiceInitializationCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0305, code lost:
    
        if (r7 != r9) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0307, code lost:
    
        r12 = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r12, r3, 1, r3);
        r5.ThreeDS2ServiceInitializationCallback = r12;
        r11 = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r11, r3, 1, r3);
        r5.cleanup = r11;
        r9 = (r9 * r3) + r11;
        r11 = r5.getWarnings;
        r4[r11] = r8[(r7 * r3) + r12];
        r4[r11 + 1] = r8[r9];
        com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.$11 = (com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.$10 + 39) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x032d, code lost:
    
        r7 = (r7 * r3) + r11;
        r11 = r5.getWarnings;
        r4[r11] = r8[r7];
        r4[r11 + 1] = r8[(r9 * r3) + r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f9, code lost:
    
        r25 = r11;
        r26 = '\t';
        r24 = 7;
        r11 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(47 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.getTrimmedLength("") + 3221);
        r14 = new java.lang.Object[1];
        r27 = 6;
        c((byte) 0, 0, 1, r14);
        r13 = (java.lang.String) r14[0];
        r30 = java.lang.Integer.TYPE;
        r11 = r11.getMethod(r13, java.lang.Object.class, java.lang.Object.class, r30, java.lang.Object.class, java.lang.Object.class, r30, java.lang.Object.class, java.lang.Object.class, r30, java.lang.Object.class, java.lang.Object.class, r30, java.lang.Object.class);
        r9.put(-1395483366, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0174, code lost:
    
        r9 = r9 + 37;
        com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.$10 = r9 % 128;
        r9 = r9 % 2;
        r12 = r5.get;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017e, code lost:
    
        if (r9 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0180, code lost:
    
        r4[r7] = (char) (r12 >> r41);
        r4[r7] = (char) (r5.initialize >> r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018c, code lost:
    
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
    
        r4[r7] = (char) (r12 - r41);
        r4[r7 + 1] = (char) (r5.initialize - r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0172, code lost:
    
        if (r12 == r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x002c, code lost:
    
        r5 = r5 + 99;
        com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.$10 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0033, code lost:
    
        if ((r5 % 2) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0035, code lost:
    
        r4 = r42.toCharArray();
        r5 = 7 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x003c, code lost:
    
        r4 = r42.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x002a, code lost:
    
        if (r42 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, String str, int i, Object[] objArr) {
        char[] charArray;
        char c;
        long j;
        int i2;
        char c2;
        char[] cArr;
        int i3 = $10 + 39;
        int i4 = i3 % 128;
        $11 = i4;
        if (i3 % 2 == 0) {
            int i5 = 84 / 0;
        }
        char[] cArr2 = charArray;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr3 = getSDKInfo;
        Class cls = Integer.TYPE;
        if (cArr3 != null) {
            int length = cArr3.length;
            c = 2;
            char[] cArr4 = new char[length];
            int i6 = 0;
            j = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        cArr = cArr2;
                    } else {
                        cArr = cArr2;
                        Class cls2 = (Class) removeParam.initialize(95 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 1), (KeyEvent.getMaxKeyCode() >> 16) + 1559);
                        Object[] objArr3 = new Object[1];
                        c((byte) 0, 0, (short) 0, objArr3);
                        Method method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method);
                        obj = method;
                    }
                    cArr4[i6] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i6++;
                    cArr2 = cArr;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        } else {
            c = 2;
            j = 0;
        }
        char[] cArr5 = cArr2;
        Object[] objArr4 = {Integer.valueOf(onCompleted)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        char c3 = '\b';
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getWindowTouchSlop() >> 8) + 94, (char) View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 1558);
            Object[] objArr5 = new Object[1];
            c((byte) 0, 0, (short) 0, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 39;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = i + 119;
                cArr6[i2] = (char) (cArr5[i2] * b);
            } else {
                i2 = i - 1;
                cArr6[i2] = (char) (cArr5[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = 0;
            while (true) {
                int i8 = getparamvalue.getWarnings;
                if (i8 >= i2) {
                    break;
                }
                int i9 = $11;
                int i10 = i9 + 71;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    char c4 = cArr5[i8];
                    getparamvalue.get = c4;
                    char c5 = cArr5[0];
                    getparamvalue.initialize = c5;
                } else {
                    char c6 = cArr5[i8];
                    getparamvalue.get = c6;
                    char c7 = cArr5[i8 + 1];
                    getparamvalue.initialize = c7;
                }
                getparamvalue.getWarnings += 2;
                c3 = c2;
            }
        }
        $10 = ($11 + 61) % 128;
        for (int i11 = 0; i11 < i; i11++) {
            cArr6[i11] = (char) (cArr6[i11] ^ 13722);
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(String str, int i, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str != null) {
            $11 = ($10 + 115) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr4 = new char[cArr3.length];
        int i2 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        int i3 = 2;
        char[] cArr5 = new char[2];
        while (true) {
            int i4 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i4 >= cArr3.length) {
                int i5 = i2;
                objArr[i5] = new String(cArr4, i5, i);
                return;
            }
            int i6 = $10 + 5;
            $11 = i6 % 128;
            int i7 = 58224;
            char c = 1;
            if (i6 % i3 == 0) {
                cArr5[i2] = cArr3[i4];
                cArr5[1] = cArr3[i4 - 1];
            } else {
                cArr5[i2] = cArr3[i4];
                cArr5[1] = cArr3[i4 + 1];
            }
            int i8 = i2;
            while (i8 < 16) {
                char c2 = cArr5[c];
                char c3 = cArr5[i2];
                char c4 = c;
                int i9 = (c3 + i7) ^ ((c3 << 4) + ((char) (getParamValue ^ (-1730380012335540218L))));
                int i10 = c3 >>> 5;
                int i11 = i2;
                int i12 = i3;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(addParam);
                    objArr2[i12] = Integer.valueOf(i10);
                    objArr2[c4] = Integer.valueOf(i9);
                    objArr2[i11] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj != null) {
                        cArr2 = cArr3;
                    } else {
                        cArr2 = cArr3;
                        obj = ((Class) removeParam.initialize(66 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 62396), 5353 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr5[c4] = charValue;
                    char c5 = cArr5[i11];
                    char[] cArr6 = cArr5;
                    int i13 = (charValue + i7) ^ ((charValue << 4) + ((char) (onError ^ (-1730380012335540218L))));
                    int i14 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(ConfigParameters);
                    objArr3[i12] = Integer.valueOf(i14);
                    objArr3[c4] = Integer.valueOf(i13);
                    objArr3[i11] = Integer.valueOf(c5);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(View.MeasureSpec.getSize(i11) + 67, (char) (62396 - Color.blue(i11)), 5352 - KeyEvent.normalizeMetaState(i11))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr6[i11] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    c = c4;
                    i2 = i11;
                    i3 = i12;
                    cArr5 = cArr6;
                    cArr3 = cArr2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr7 = cArr3;
            int i15 = i2;
            int i16 = i3;
            char[] cArr8 = cArr5;
            char c6 = c;
            int i17 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr4[i17] = cArr8[i15];
            cArr4[i17 + 1] = cArr8[c6];
            Object[] objArr4 = new Object[i16];
            objArr4[c6] = configurationBuilder;
            objArr4[i15] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(54 - TextUtils.indexOf("", ""), (char) (39910 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7059)).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            i3 = i16;
            i2 = i15;
            cArr5 = cArr8;
            cArr3 = cArr7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, short s, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = (i * 4) + 4;
        int i6 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        byte b2 = 119 - (s * 2);
        if (bArr == null) {
            int i8 = 0;
            int i9 = i5;
            int i10 = i9 + b2;
            i2 = i5 + 1;
            i3 = i10;
            i4 = i8;
            bArr2[i4] = (byte) i3;
            i8 = i4 + 1;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            b2 = bArr[i2];
            int i11 = i2;
            i9 = i3;
            i5 = i11;
            int i102 = i9 + b2;
            i2 = i5 + 1;
            i3 = i102;
            i4 = i8;
            bArr2[i4] = (byte) i3;
            i8 = i4 + 1;
            if (i4 == i7) {
            }
        } else {
            i2 = i5;
            i3 = b2;
            i4 = 0;
            bArr2[i4] = (byte) i3;
            i8 = i4 + 1;
            if (i4 == i7) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{121, 105, 114, 117};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE;
    }

    public static void initialize() {
        getSDKInfo = new char[]{41442, 37965, 37925, 37951, 37922, 37938, 37929, 41444, 37941, 37961, 37935, 37962, 41441, 37939, 37966, 41443, 37945, 37960, 37949, 37942, 37944, 37934, 37940, 37943, 37963};
        onCompleted = (char) 41445;
        onError = (char) 32157;
        ConfigParameters = (char) 49981;
        getParamValue = (char) 50754;
        addParam = (char) 50808;
    }

    public static getLocalizedMessage valueOf(String str) {
        ConfigurationBuilder = (restrictedParameters + 63) % 128;
        getLocalizedMessage getlocalizedmessage = (getLocalizedMessage) Enum.valueOf(getLocalizedMessage.class, str);
        int i = restrictedParameters + 73;
        ConfigurationBuilder = i % 128;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
        return getlocalizedmessage;
    }

    public static getLocalizedMessage[] values() {
        ConfigurationBuilder = (restrictedParameters + 51) % 128;
        getLocalizedMessage[] getlocalizedmessageArr = (getLocalizedMessage[]) cleanup.clone();
        int i = restrictedParameters + 33;
        ConfigurationBuilder = i % 128;
        if (i % 2 == 0) {
            return getlocalizedmessageArr;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = restrictedParameters + 125;
        ConfigurationBuilder = i % 128;
        int i2 = i % 2;
        String str = this.getSDKVersion;
        if (i2 != 0) {
            int i3 = 23 / 0;
        }
        return str;
    }
}
