package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class setForegroundTintMode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    static final String ThreeDS2Service;
    static final String ThreeDS2ServiceInstance;
    private static int addParam;
    private static int[] cleanup;
    private static int createTransaction;
    static final String get;
    static final String getSDKInfo;
    static final String getSDKVersion;
    static final String getWarnings;
    static final String initialize;
    private final completed ThreeDS2ServiceInitializationCallback;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        createTransaction = 0;
        addParam = 1;
        getWarnings();
        Object[] objArr = new Object[1];
        a(new int[]{-1110980954, 384570594, 709419082, 1589723737, -946199522, -1219789143, -943747095, 109813035}, 17 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        getSDKInfo = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{-1110980954, 384570594, 709419082, 1589723737, 1109066293, -1335699415}, 11 - View.getDefaultSize(0, 0), objArr2);
        getSDKVersion = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{-1110980954, 384570594, 1837761922, -1378175594, -1820049806, -804562942, -2099520473, -1956913731, 890496779, -1704025714, 630300576, 1441882494}, View.combineMeasuredStates(0, 0) + 22, objArr3);
        initialize = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{-1110980954, 384570594, -166746528, 1067304353, 1805918035, -1993034121, 2124069614, -987480048, 296316102, -827166071}, 21 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr4);
        getWarnings = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new int[]{-1110980954, 384570594, -166746528, 1067304353, 1805918035, -1993034121, 2124069614, -987480048, 1104224057, 678333462}, 17 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr5);
        ThreeDS2ServiceInstance = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new int[]{-1110980954, 384570594, -1829461146, -944818472, -2054274184, 1195028869}, KeyEvent.normalizeMetaState(0) + 12, objArr6);
        ThreeDS2Service = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a(new int[]{-1110980954, 384570594, 1897310436, 277384573, -1250447005, -483995766, -1803260210, 147491678}, 13 - Gravity.getAbsoluteGravity(0, 0), objArr7);
        get = ((String) objArr7[0]).intern();
        createTransaction = (addParam + 29) % 128;
    }

    public setForegroundTintMode(completed completedVar) {
        this.ThreeDS2ServiceInitializationCallback = completedVar;
    }

    private Set<String> ThreeDS2Service(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str) {
        addParam = (createTransaction + 3) % 128;
        Object[] objArr = new Object[1];
        a(new int[]{-1110980954, 384570594, 1897310436, 277384573, -1250447005, -483995766, -1803260210, 147491678}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13, objArr);
        String paramValue = configParameters.getParamValue(((String) objArr[0]).intern(), str);
        if (paramValue == null || paramValue.isEmpty()) {
            Set<String> set = Collections.EMPTY_SET;
            createTransaction = (addParam + 3) % 128;
            return set;
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{961002063, 1322456398}, -TextUtils.indexOf((CharSequence) "", '0'), objArr2);
        return new HashSet(Arrays.asList(oj.initialize(paramValue, ((String) objArr2[0]).intern())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009a, code lost:
    
        r7 = 40 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.initialize(r7) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.initialize(r7) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a3, code lost:
    
        return new java.util.HashSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        r1 = new java.lang.Object[1];
        a(new int[]{961002063, 1322456398}, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1, r1);
        r2 = new java.util.HashSet(java.util.Arrays.asList(com.netcetera.threeds.sdk.infrastructure.oj.initialize(r7, ((java.lang.String) r1[0]).intern())));
        r7 = com.netcetera.threeds.sdk.infrastructure.setForegroundTintMode.createTransaction + 49;
        com.netcetera.threeds.sdk.infrastructure.setForegroundTintMode.addParam = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        if ((r7 % 2) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        String paramValue;
        com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters = (com.netcetera.threeds.sdk.api.configparameters.ConfigParameters) objArr[1];
        String str = (String) objArr[2];
        int i = addParam + 31;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            Object[] objArr2 = new Object[1];
            a(new int[]{-1110980954, 384570594, 1837761922, -1378175594, -1820049806, -804562942, -2099520473, -1956913731, 890496779, -1704025714, 630300576, 1441882494}, 15 / (KeyEvent.getMaxKeyCode() >>> 84), objArr2);
            paramValue = configParameters.getParamValue(((String) objArr2[0]).intern(), str);
        } else {
            Object[] objArr3 = new Object[1];
            a(new int[]{-1110980954, 384570594, 1837761922, -1378175594, -1820049806, -804562942, -2099520473, -1956913731, 890496779, -1704025714, 630300576, 1441882494}, 22 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
            paramValue = configParameters.getParamValue(((String) objArr3[0]).intern(), str);
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2;
        int i3;
        String str;
        Object method;
        char[] cArr;
        int[] iArr2;
        int i4;
        int[] iArr3;
        String str2;
        int i5;
        Object method2;
        int[] iArr4;
        char[] cArr2;
        int i6;
        int[] iArr5;
        int i7;
        Object method3;
        createTransaction createtransaction = new createTransaction();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr6 = cleanup;
        String str3 = "";
        Class cls = Integer.TYPE;
        int i8 = 2;
        if (iArr6 != null) {
            int length = iArr6.length;
            int[] iArr7 = new int[length];
            int i9 = 0;
            i2 = 16;
            while (i9 < length) {
                int i10 = $10 + 75;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr6[i9])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(2095751688);
                        if (obj != null) {
                            iArr4 = iArr7;
                            cArr2 = cArr3;
                            iArr5 = iArr6;
                            i7 = i9;
                            method3 = obj;
                            i6 = length;
                        } else {
                            iArr4 = iArr7;
                            cArr2 = cArr3;
                            Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getLongPressTimeout() >> 16) + 64, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 1197);
                            byte b = (byte) ($$b & 7);
                            byte b2 = (byte) (b - 1);
                            i6 = length;
                            iArr5 = iArr6;
                            i7 = i9;
                            Object[] objArr3 = new Object[1];
                            b(b, b2, b2, objArr3);
                            method3 = cls2.getMethod((String) objArr3[0], cls);
                            map.put(2095751688, method3);
                        }
                        iArr4[i7] = ((Integer) ((Method) method3).invoke(null, objArr2)).intValue();
                        length = i6;
                        iArr7 = iArr4;
                        cArr3 = cArr2;
                        iArr6 = iArr5;
                        i9 = i7;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int[] iArr8 = iArr7;
                    char[] cArr5 = cArr3;
                    int i11 = length;
                    int[] iArr9 = iArr6;
                    int i12 = i9;
                    Object[] objArr4 = {Integer.valueOf(iArr9[i12])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(2095751688);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize(Process.getGidForName("") + 65, (char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1196);
                        byte b3 = (byte) ($$b & 7);
                        byte b4 = (byte) (b3 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b3, b4, b4, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2095751688, obj2);
                    }
                    iArr8[i12] = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                    i9 = i12 + 1;
                    length = i11;
                    iArr7 = iArr8;
                    cArr3 = cArr5;
                    iArr6 = iArr9;
                }
            }
            iArr6 = iArr7;
        } else {
            i2 = 16;
        }
        char[] cArr6 = cArr3;
        int i13 = 0;
        int length2 = iArr6.length;
        int[] iArr10 = new int[length2];
        int[] iArr11 = cleanup;
        if (iArr11 != null) {
            $10 = ($11 + 49) % 128;
            int length3 = iArr11.length;
            int[] iArr12 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                int i15 = $10 + 37;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    Object[] objArr6 = {Integer.valueOf(iArr11[i14])};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(2095751688);
                    if (obj3 != null) {
                        cArr = cArr4;
                        iArr2 = iArr11;
                        i4 = length3;
                        iArr3 = iArr12;
                        str2 = str3;
                        method2 = obj3;
                        i5 = i14;
                    } else {
                        iArr2 = iArr11;
                        int i16 = i13;
                        i4 = length3;
                        iArr3 = iArr12;
                        Class cls4 = (Class) removeParam.initialize(64 - View.resolveSizeAndState(i16, i16, i16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 1197 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                        byte b5 = (byte) ($$b & 7);
                        byte b6 = (byte) (b5 - 1);
                        i5 = i14;
                        cArr = cArr4;
                        str2 = str3;
                        Object[] objArr7 = new Object[1];
                        b(b5, b6, b6, objArr7);
                        method2 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2095751688, method2);
                    }
                    iArr3[i5] = ((Integer) ((Method) method2).invoke(null, objArr6)).intValue();
                    i14 = i5;
                } else {
                    cArr = cArr4;
                    iArr2 = iArr11;
                    i4 = length3;
                    iArr3 = iArr12;
                    int i17 = i14;
                    str2 = str3;
                    Object[] objArr8 = {Integer.valueOf(iArr2[i17])};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(2095751688);
                    if (obj4 == null) {
                        Class cls5 = (Class) removeParam.initialize(64 - Color.alpha(0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 1196 - MotionEvent.axisFromString(str2));
                        byte b7 = (byte) ($$b & 7);
                        byte b8 = (byte) (b7 - 1);
                        Object[] objArr9 = new Object[1];
                        b(b7, b8, b8, objArr9);
                        obj4 = cls5.getMethod((String) objArr9[0], cls);
                        map4.put(2095751688, obj4);
                    }
                    iArr3[i17] = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                    i14 = i17 + 1;
                }
                iArr11 = iArr2;
                length3 = i4;
                cArr4 = cArr;
                iArr12 = iArr3;
                str3 = str2;
                i13 = 0;
            }
            iArr11 = iArr12;
        }
        char[] cArr7 = cArr4;
        String str4 = str3;
        System.arraycopy(iArr11, 0, iArr10, 0, length2);
        createtransaction.initialize = 0;
        $11 = ($10 + 79) % 128;
        while (true) {
            int i18 = createtransaction.initialize;
            if (i18 >= iArr.length) {
                objArr[0] = new String(cArr7, 0, i);
                return;
            }
            int i19 = iArr[i18];
            char c = (char) (i19 >> 16);
            cArr6[0] = c;
            char c2 = (char) i19;
            cArr6[1] = c2;
            char c3 = (char) (iArr[i18 + 1] >> 16);
            cArr6[i8] = c3;
            char c4 = (char) iArr[i18 + 1];
            cArr6[3] = c4;
            createtransaction.getWarnings = (c << 16) + c2;
            createtransaction.get = (c3 << 16) + c4;
            createTransaction.ThreeDS2ServiceInstance(iArr10);
            int i20 = 0;
            while (true) {
                i3 = createtransaction.getWarnings;
                if (i20 >= i2) {
                    break;
                }
                int i21 = i3 ^ iArr10[i20];
                createtransaction.getWarnings = i21;
                int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i21);
                Object[] objArr10 = new Object[4];
                objArr10[3] = createtransaction;
                objArr10[i8] = createtransaction;
                objArr10[1] = Integer.valueOf(ThreeDS2Service2);
                objArr10[0] = createtransaction;
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(-411264147);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(50 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), Color.green(0) + 13121)).getMethod("y", Object.class, cls, Object.class, Object.class);
                    map5.put(-411264147, obj5);
                }
                int intValue = ((Integer) ((Method) obj5).invoke(null, objArr10)).intValue();
                createtransaction.getWarnings = createtransaction.get;
                createtransaction.get = intValue;
                i20++;
                i2 = 16;
            }
            int i22 = createtransaction.get;
            createtransaction.getWarnings = i22;
            createtransaction.get = i3;
            int i23 = i3 ^ iArr10[16];
            createtransaction.get = i23;
            int i24 = i22 ^ iArr10[17];
            createtransaction.getWarnings = i24;
            cArr6[0] = (char) (i24 >>> 16);
            cArr6[1] = (char) i24;
            cArr6[i8] = (char) (i23 >>> 16);
            cArr6[3] = (char) i23;
            createTransaction.ThreeDS2ServiceInstance(iArr10);
            int i25 = createtransaction.initialize;
            cArr7[i25 * 2] = cArr6[0];
            cArr7[(i25 * 2) + 1] = cArr6[1];
            cArr7[(i25 * 2) + 2] = cArr6[i8];
            cArr7[(i25 * 2) + 3] = cArr6[3];
            int i26 = i8;
            Object[] objArr11 = new Object[i26];
            objArr11[1] = createtransaction;
            objArr11[0] = createtransaction;
            Map map6 = removeParam.visaSchemeConfiguration;
            Object obj6 = map6.get(-1870831722);
            if (obj6 != null) {
                method = obj6;
                str = str4;
                i2 = 16;
            } else {
                str = str4;
                i2 = 16;
                Class cls6 = (Class) removeParam.initialize(TextUtils.indexOf(str, str, 0) + 99, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getEdgeSlop() >> 16) + 1880);
                Object[] objArr12 = new Object[1];
                b((short) 0, 0, 0, objArr12);
                method = cls6.getMethod((String) objArr12[0], Object.class, Object.class);
                map6.put(-1870831722, method);
            }
            ((Method) method).invoke(null, objArr11);
            i8 = i26;
            str4 = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4 = (i * 3) + 4;
        int i5 = i2 * 2;
        byte[] bArr = $$a;
        int i6 = 118 - (s * 5);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i4;
            int i10 = i7;
            i6 = (-i6) + i10;
            i4 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i4];
            int i11 = i4;
            i10 = i6;
            i6 = b;
            i8 = i3 + 1;
            bArr3 = bArr;
            i9 = i11;
            i6 = (-i6) + i10;
            i4 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    private String get(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str) {
        createTransaction = (addParam + 37) % 128;
        Object[] objArr = new Object[1];
        a(new int[]{-1110980954, 384570594, -166746528, 1067304353, 1805918035, -1993034121, 2124069614, -987480048, 296316102, -827166071}, 20 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        String str2 = (String) oj.getWarnings(configParameters.getParamValue(((String) objArr[0]).intern(), str), "");
        int i = addParam + 99;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            return str2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0075, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.initialize(r2) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.setForegroundTintMode.createTransaction = (com.netcetera.threeds.sdk.infrastructure.setForegroundTintMode.addParam + 109) % 128;
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        r4 = r4 + 1;
        com.netcetera.threeds.sdk.infrastructure.setForegroundTintMode.addParam = (com.netcetera.threeds.sdk.infrastructure.setForegroundTintMode.createTransaction + 79) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r5.length == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0060, code lost:
    
        if (r5.length == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0067, code lost:
    
        r0 = new java.util.ArrayList();
        r1 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006d, code lost:
    
        if (r4 >= r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        r2 = r5[r4];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<String> getWarnings(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters) {
        createTransaction = (addParam + 7) % 128;
        Object[] objArr = new Object[1];
        a(new int[]{-1110980954, 384570594, -1829461146, -944818472, -2054274184, 1195028869}, (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12, objArr);
        int i = 0;
        String paramValue = configParameters.getParamValue(null, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new int[]{961002063, 1322456398}, 1 - TextUtils.indexOf("", ""), objArr2);
        String[] initialize2 = oj.initialize(paramValue, ((String) objArr2[0]).intern());
        if (initialize2 != null) {
            int i2 = createTransaction + 41;
            addParam = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 84 / 0;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public static void init$0() {
        $$a = new byte[]{115, -38, 117, 120};
        $$b = 57;
    }

    public setForegroundTintBlendMode initialize(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, setPadding setpadding) {
        int i;
        int i2;
        int i3;
        setRenderEffect setrendereffect;
        setRenderEffect setrendereffect2;
        setForegroundTintMode setforegroundtintmode = this;
        com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters2 = configParameters;
        List<String> warnings = getWarnings(configParameters);
        HashMap hashMap = new HashMap();
        for (String str : warnings) {
            addParam = (createTransaction + 103) % 128;
            Set<String> ThreeDS2Service2 = setforegroundtintmode.ThreeDS2Service(configParameters2, str);
            Object[] objArr = new Object[1];
            a(new int[]{-1110980954, 384570594, 709419082, 1589723737, 1109066293, -1335699415}, 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
            Integer warnings2 = setforegroundtintmode.getWarnings(configParameters2, ((String) objArr[0]).intern(), str);
            int intValue = warnings2.intValue();
            Object[] objArr2 = new Object[1];
            a(new int[]{-1110980954, 384570594, 709419082, 1589723737, -946199522, -1219789143, -943747095, 109813035}, ((byte) KeyEvent.getModifierMetaStateMask()) + 17, objArr2);
            Integer warnings3 = setforegroundtintmode.getWarnings(configParameters2, ((String) objArr2[0]).intern(), str);
            int intValue2 = warnings3.intValue();
            String initialize2 = setforegroundtintmode.initialize(configParameters2, str);
            String str2 = setforegroundtintmode.get(configParameters2, str);
            Set set = (Set) ThreeDS2ServiceInstance(new Object[]{setforegroundtintmode, configParameters2, str}, -1323173200, 1323173200, System.identityHashCode(setforegroundtintmode));
            setpadding.getWarnings(ThreeDS2Service2, str);
            setBackground setbackground = (setBackground) setBackground.initialize(new Object[]{str}, -1719229398, 1719229399, (int) System.currentTimeMillis());
            setDrawingCacheEnabled setdrawingcacheenabled = (setDrawingCacheEnabled) setDrawingCacheEnabled.get(new Object[]{ThreeDS2Service2}, 1622279849, -1622279846, (int) System.currentTimeMillis());
            if (intValue == -1) {
                i = 0;
                setrendereffect = (setRenderEffect) setRenderEffect.initialize(new Object[0], 1772295054, -1772295054, (int) System.currentTimeMillis());
                i2 = -1831759758;
                i3 = 1831759760;
            } else {
                i = 0;
                Object[] objArr3 = {warnings2};
                i2 = -1831759758;
                i3 = 1831759760;
                setrendereffect = (setRenderEffect) setRenderEffect.initialize(objArr3, 1831759760, -1831759758, intValue);
            }
            setRenderEffect setrendereffect3 = setrendereffect;
            if (intValue2 == -1) {
                setrendereffect2 = (setRenderEffect) setRenderEffect.initialize(new Object[i], 1772295054, -1772295054, (int) System.currentTimeMillis());
            } else {
                setrendereffect2 = (setRenderEffect) setRenderEffect.initialize(new Object[]{warnings3}, i3, i2, intValue2);
                createTransaction = (addParam + 43) % 128;
            }
            hashMap.put(str, (setLayerType) setLayerType.getWarnings(new Object[]{setbackground, setdrawingcacheenabled, setrendereffect3, setrendereffect2, (setLayerPaint) setLayerPaint.initialize(new Object[]{initialize2, str2}, 2144845291, -2144845290, (int) System.currentTimeMillis()), (setBackgroundResource) setBackgroundResource.ThreeDS2ServiceInstance(new Object[]{set}, -1666386940, 1666386942, (int) System.currentTimeMillis())}, -1347106739, 1347106739, (int) System.currentTimeMillis()));
            setforegroundtintmode = this;
            configParameters2 = configParameters;
        }
        return new setSelected(hashMap);
    }

    private Integer getWarnings(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, String str2) {
        createTransaction = (addParam + 63) % 128;
        String paramValue = configParameters.getParamValue(str, str2);
        if (paramValue == null) {
            createTransaction = (addParam + 65) % 128;
            return -1;
        }
        try {
            return Integer.valueOf(Integer.parseInt(paramValue.trim()));
        } catch (NumberFormatException e) {
            throw setTextAlignment.configureScheme.initialize(str2, e);
        }
    }

    public static void getWarnings() {
        cleanup = new int[]{480352170, -40927723, 2100548982, 1595568104, 1526415752, -802291298, 163265978, -1142533156, -258915567, 1351609334, 1277772090, 662991520, -1818660708, 407907030, 503971693, 95398202, 1048747923, -1562613972};
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2ServiceInstance(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        r5.ThreeDS2ServiceInitializationCallback.ThreeDS2ServiceInstance(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r6 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r6 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String initialize(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str) {
        String paramValue;
        int i = addParam + 83;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            a(new int[]{-1110980954, 384570594, -166746528, 1067304353, 1805918035, -1993034121, 2124069614, -987480048, 1104224057, 678333462}, TextUtils.lastIndexOf("", '\n', 0, 0) * 118, objArr);
            paramValue = configParameters.getParamValue(((String) objArr[0]).intern(), str);
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{-1110980954, 384570594, -166746528, 1067304353, 1805918035, -1993034121, 2124069614, -987480048, 1104224057, 678333462}, TextUtils.lastIndexOf("", '0', 0, 0) + 18, objArr2);
            paramValue = configParameters.getParamValue(((String) objArr2[0]).intern(), str);
        }
        String str2 = (String) oj.getWarnings(paramValue, "");
        int i2 = addParam + 27;
        createTransaction = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return str2;
    }
}
