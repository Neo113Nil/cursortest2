package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.nw;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class nx implements nw.getWarnings {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int cleanup;
    private static char[] get;
    private static int getSDKInfo;
    private static boolean getWarnings;
    private static boolean initialize;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getSDKInfo = 0;
        cleanup = 1;
        get = new char[]{15254, 15201, 15211, 15205, 15200, 15214, 15265, 15252, 15227, 15210, 15284, 15231, 15208, 15286, 15207, 15203, 15246, 15209, 15202, 15204, 15264, 15212, 15266, 15253, 15226, 15270};
        ThreeDS2Service = 993475575;
        getWarnings = true;
        initialize = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x03a7, code lost:
    
        if (r2.contains(r5.getField((java.lang.String) r7[r24]).get(null)) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] ThreeDS2Service(Context context, int i, int i2) {
        int i3;
        Object[] objArr;
        char c;
        boolean z;
        char c2;
        int i4 = cleanup;
        int i5 = i4 + 119;
        getSDKInfo = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        Class cls = Integer.TYPE;
        try {
            if (context == null) {
                getSDKInfo = (i4 + 49) % 128;
                Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                Object[] objArr3 = {Integer.valueOf(i2), 0, Integer.valueOf((((~(i | (-466131126))) | (-467196670)) * 433) + (((~((-47237754) | i)) | (-466131126)) * (-433)) + (((~((~i) | (-419958917))) * 433) - 478834766))};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1544987438);
                if (obj == null) {
                    Class cls2 = (Class) removeParam.initialize(86 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (Color.blue(0) + 28641), 3317 - TextUtils.getTrimmedLength(""));
                    byte[] bArr = $$a;
                    byte b = bArr[17];
                    Object[] objArr4 = new Object[1];
                    a(b, (byte) (b | 37), (byte) (bArr[4] - 1), objArr4);
                    obj = cls2.getMethod((String) objArr4[0], cls, cls, cls);
                    map.put(-1544987438, obj);
                }
                ((int[]) objArr2[3])[0] = ((Integer) ((Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            float f = 2.2E-44f;
            try {
                Object[] objArr5 = new Object[1];
                b(null, null, 127 - View.resolveSize(0, 0), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                Class<?> cls3 = Class.forName(((String) objArr5[0]).intern());
                Object[] objArr6 = new Object[1];
                b(null, null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, "\u0085\u0092\u0082\u0091\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0090\u008f\u008f\u008e\u0089\u008a\u008d", objArr6);
                Object invoke = cls3.getMethod(((String) objArr6[0]).intern(), null).invoke(context, null);
                Object[] objArr7 = new Object[1];
                b(null, null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u0085\u0092\u0082\u0091\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0090\u008f\u008f\u008e\u0087\u0093\u008f\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                Class<?> cls4 = Class.forName(((String) objArr7[0]).intern());
                Object[] objArr8 = new Object[1];
                b(null, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, "\u0094\u008d\u0081\u0090\u0092", objArr8);
                if ((cls4.getField(((String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    objArr = new Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    Object[] objArr9 = {Integer.valueOf(i2), 16, Integer.valueOf((((~((~i) | 364220630)) | 541746177 | (~((-28377299) | i))) * 757) + ((~(905966807 | i)) * 1514) + (((877589509 | r0) * (-757)) - 34192966))};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-1544987438);
                    if (obj2 != null) {
                        i3 = 0;
                        c2 = 3;
                    } else {
                        i3 = 0;
                        Class cls5 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 87, (char) (KeyEvent.keyCodeFromString("") + 28641), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3316);
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[17];
                        c2 = 3;
                        Object[] objArr10 = new Object[1];
                        a(b2, (byte) (b2 | 37), (byte) (bArr2[4] - 1), objArr10);
                        obj2 = cls5.getMethod((String) objArr10[0], cls, cls, cls);
                        map2.put(-1544987438, obj2);
                    }
                    ((int[]) objArr[c2])[i3] = ((Integer) ((Method) obj2).invoke(null, objArr9)).intValue();
                } else {
                    i3 = 0;
                    objArr = new Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    int i6 = ~i;
                    Object[] objArr11 = {Integer.valueOf(i2), 0, Integer.valueOf((((~(i6 | (-540463015))) | 1330214) * 52) + (((~(540463014 | i6)) | (~(27094135 | i6)) | (-566226936)) * (-52)) + ((~((-25763922) | i6)) * 52) + 1065168150)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1544987438);
                    if (obj3 == null) {
                        Class cls6 = (Class) removeParam.initialize(85 - ImageFormat.getBitsPerPixel(0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 28641), 3317 - Color.red(0));
                        byte[] bArr3 = $$a;
                        byte b3 = bArr3[17];
                        Object[] objArr12 = new Object[1];
                        a(b3, (byte) (b3 | 37), (byte) (bArr3[4] - 1), objArr12);
                        obj3 = cls6.getMethod((String) objArr12[0], cls, cls, cls);
                        map3.put(-1544987438, obj3);
                    }
                    ((int[]) objArr[3])[0] = ((Integer) ((Method) obj3).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[i3] != i) {
                    cleanup = (getSDKInfo + 17) % 128;
                    return objArr;
                }
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(-618166559);
                if (obj4 == null) {
                    Class cls7 = (Class) removeParam.initialize(70 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) TextUtils.indexOf("", ""), ((Process.getThreadPriority(i3) + 20) >> 6) + 2178);
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    a((byte) (bArr4[9] - 1), bArr4[4], (byte) (-bArr4[31]), objArr13);
                    obj4 = cls7.getMethod((String) objArr13[i3], null);
                    map4.put(-618166559, obj4);
                }
                Set set = (Set) ((Method) obj4).invoke(null, null);
                Class cls8 = (Class) removeParam.initialize(70 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 2179);
                byte[] bArr5 = $$a;
                Object[] objArr14 = new Object[1];
                a((byte) 20, bArr5[4], (byte) (-bArr5[21]), objArr14);
                if (set.contains(cls8.getField((String) objArr14[i3]).get(null))) {
                    c = 22;
                } else {
                    c = 22;
                    Class cls9 = (Class) removeParam.initialize(71 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (Process.myPid() >> 22), TextUtils.indexOf((CharSequence) "", '0') + 2179);
                    byte b4 = bArr5[17];
                    Object[] objArr15 = new Object[1];
                    a(b4, (byte) (b4 | 37), (byte) (bArr5[4] - 1), objArr15);
                }
                if (Build.VERSION.SDK_INT == 30) {
                    cleanup = (getSDKInfo + 93) % 128;
                    Object[] objArr16 = new Object[4];
                    int[] iArr = new int[1];
                    objArr16[i3] = iArr;
                    int[] iArr2 = new int[1];
                    objArr16[1] = iArr2;
                    objArr16[3] = new int[1];
                    iArr[i3] = i;
                    iArr2[i3] = i;
                    objArr16[2] = null;
                    int i7 = (((~((-1047771953) | i)) | 539075376 | (~(534403073 | i))) * (-880)) + 1306415438;
                    int i8 = (~((-1047771953) | (~i))) | (-534403074);
                    int i9 = ~(i | 1047771952);
                    int i10 = ((i8 | i9) * (-880)) + i7;
                    Object[] objArr17 = new Object[3];
                    objArr17[2] = Integer.valueOf((i9 * 880) + i10);
                    objArr17[1] = 0;
                    objArr17[i3] = Integer.valueOf(i2);
                    Object obj5 = map4.get(-1544987438);
                    if (obj5 == null) {
                        int i11 = i3;
                        Class cls10 = (Class) removeParam.initialize((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 86, (char) (TextUtils.indexOf("", "", i11, i11) + 28641), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3317);
                        byte b5 = bArr5[17];
                        byte b6 = (byte) (bArr5[4] - 1);
                        Object[] objArr18 = new Object[1];
                        a(b5, (byte) (b5 | 37), b6, objArr18);
                        obj5 = cls10.getMethod((String) objArr18[0], cls, cls, cls);
                        map4.put(-1544987438, obj5);
                    }
                    ((int[]) objArr16[3])[0] = ((Integer) ((Method) obj5).invoke(null, objArr17)).intValue();
                    cleanup = (getSDKInfo + 57) % 128;
                    return objArr16;
                }
                try {
                } catch (Exception unused) {
                    f = 0.0f;
                }
                if (Build.VERSION.SDK_INT > 33) {
                    getSDKInfo = (cleanup + 33) % 128;
                    Object[] objArr19 = new Object[1];
                    b(null, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, "\u0088\u0084\u0087\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0097\u0083\u0096\u0090\u0090\u0095\u0089\u0086\u0082\u0086\u0095\u0088\u0089\u008a\u0095", objArr19);
                    try {
                        Object[] objArr20 = {((String) objArr19[0]).intern()};
                        Object obj6 = map4.get(-108371147);
                        if (obj6 != null) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            try {
                                Class cls11 = (Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 48, (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 2754);
                                Object[] objArr21 = new Object[1];
                                a((byte) 20, bArr5[4], (byte) (-bArr5[21]), objArr21);
                                obj6 = cls11.getMethod((String) objArr21[0], String.class);
                                map4.put(-108371147, obj6);
                            } catch (Throwable th) {
                                th = th;
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        long longValue = ((Long) ((Method) obj6).invoke(null, objArr20)).longValue();
                        long j = longValue ^ (-1);
                        long j2 = 794457233 | j;
                        long j3 = i;
                        long j4 = j3 ^ (-1);
                        long m = SVG$Unit$EnumUnboxingLocalUtility.m(920L, ((j2 | j4) ^ (-1)) | (((794457233 | longValue) | j3) ^ (-1)) | (((j | (-794457234)) | j3) ^ (-1)), (((j2 ^ (-1)) | ((794457233 | j4) ^ (-1))) * 920) + ((((j2 | j3) ^ (-1)) | (((j | j4) | (-794457234)) ^ (-1))) * 920) + ((-919) * longValue) + 730106198046L, 1293776453L);
                        int i12 = ~i;
                        if (((((int) (m >> 32)) & Boxes$$ExternalSyntheticOutline1.m((~((-973836314) | i)) | (~((-463390098) | i12)) | (-1000330650), -370, (((~((-973836314) | i12)) | (~((-463390098) | i))) * (-370)) + 635053406, -755153044)) | ((((~(i12 | (-17080321))) * 501) + ((((~((-17080321) | i)) | (-1605304251)) * 501) - 305986740)) & ((int) m))) == 1) {
                            getSDKInfo = (cleanup + 71) % 128;
                            z = true;
                        }
                        z = false;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    f = 0.0f;
                    Object[] objArr22 = new Object[1];
                    b(null, null, View.MeasureSpec.getSize(0) + 127, "\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0087\u0085\u0084", objArr22);
                    try {
                        Object[] objArr23 = {((String) objArr22[0]).intern()};
                        Object obj7 = map4.get(-690415720);
                        if (obj7 == null) {
                            Class cls12 = (Class) removeParam.initialize(KeyEvent.getDeadChar(0, 0) + 47, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.lastIndexOf("", '0', 0) + 2249);
                            byte b7 = (byte) (-bArr5[c]);
                            byte b8 = bArr5[17];
                            Object[] objArr24 = new Object[1];
                            a(b7, b8, b8, objArr24);
                            obj7 = cls12.getMethod((String) objArr24[0], String.class);
                            map4.put(-690415720, obj7);
                        }
                        Object invoke2 = ((Method) obj7).invoke(null, objArr23);
                        Object[] objArr25 = new Object[1];
                        b(null, null, AndroidCharacter.getMirror('0') + 'O', "\u009a", objArr25);
                        z = invoke2.equals(((String) objArr25[0]).intern());
                        cleanup = (getSDKInfo + 15) % 128;
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                }
                if (z) {
                    Object[] objArr26 = {new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                    int i13 = ~((-2197521) | i);
                    int i14 = ~i;
                    Object[] objArr27 = {Integer.valueOf(i2), 16, Integer.valueOf((((~(337758482 | i14)) | (~((-175610397) | i14)) | 173412876) * 50) + ((i13 | (~((-173412877) | i14))) * 50) + ((i | 337758482) * (-50)) + 30838586)};
                    Map map5 = removeParam.visaSchemeConfiguration;
                    Object obj8 = map5.get(-1544987438);
                    if (obj8 == null) {
                        Class cls13 = (Class) removeParam.initialize(86 - Color.blue(0), (char) (MotionEvent.axisFromString("") + 28642), 3317 - TextUtils.getOffsetAfter("", 0));
                        byte[] bArr6 = $$a;
                        byte b9 = bArr6[17];
                        Object[] objArr28 = new Object[1];
                        a(b9, (byte) (b9 | 37), (byte) (bArr6[4] - 1), objArr28);
                        obj8 = cls13.getMethod((String) objArr28[0], cls, cls, cls);
                        map5.put(-1544987438, obj8);
                    }
                    ((int[]) objArr26[3])[0] = ((Integer) ((Method) obj8).invoke(null, objArr27)).intValue();
                    return objArr26;
                }
                Object[] objArr29 = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i15 = ~((-44171268) | i);
                Object[] objArr30 = {Integer.valueOf(i2), 0, Integer.valueOf((((~(i | (-139551009))) | (~((~i) | (-329646604))) | 285475336) * 497) + (((i15 | (~(r5 | (-139551009)))) * 497) - 749609805))};
                Map map6 = removeParam.visaSchemeConfiguration;
                Object obj9 = map6.get(-1544987438);
                if (obj9 == null) {
                    Class cls14 = (Class) removeParam.initialize((-16777130) - Color.rgb(0, 0, 0), (char) (28641 - Drawable.resolveOpacity(0, 0)), 3317 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)));
                    byte[] bArr7 = $$a;
                    byte b10 = bArr7[17];
                    Object[] objArr31 = new Object[1];
                    a(b10, (byte) (b10 | 37), (byte) (bArr7[4] - 1), objArr31);
                    obj9 = cls14.getMethod((String) objArr31[0], cls, cls, cls);
                    map6.put(-1544987438, obj9);
                }
                ((int[]) objArr29[3])[0] = ((Integer) ((Method) obj9).invoke(null, objArr30)).intValue();
                return objArr29;
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th4;
            }
        } catch (Throwable th5) {
            Throwable cause4 = th5.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, short s2, Object[] objArr) {
        int i;
        int i2 = 121 - s;
        byte[] bArr = $$a;
        int i3 = 37 - (s2 * 2);
        byte[] bArr2 = new byte[23 - b];
        int i4 = 22 - b;
        if (bArr == null) {
            i2 = i4;
            byte[] bArr3 = bArr;
            int i5 = 0;
            int i6 = i3;
            i2 = i2 + i3 + 2;
            i3 = i6;
            bArr = bArr3;
            i = i5;
            bArr2[i] = (byte) i2;
            i5 = i + 1;
            int i7 = i3 + 1;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i7];
            byte[] bArr4 = bArr;
            i6 = i7;
            i3 = b2;
            bArr3 = bArr4;
            i2 = i2 + i3 + 2;
            i3 = i6;
            bArr = bArr3;
            i = i5;
            bArr2[i] = (byte) i2;
            i5 = i + 1;
            int i72 = i3 + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i5 = i + 1;
            int i722 = i3 + 1;
            if (i == i4) {
            }
        }
    }

    private static void b(String str, int[] iArr, int i, String str2, Object[] objArr) {
        Class cls;
        float f;
        long j;
        float f2;
        float f3;
        char[] cArr;
        Class cls2;
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
        Class cls3 = Integer.TYPE;
        float f4 = RecyclerView.DECELERATION_RATE;
        int i2 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                $11 = ($10 + 61) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        cArr = cArr2;
                        cls2 = cls3;
                        f3 = f4;
                        method = obj;
                    } else {
                        f3 = f4;
                        int i4 = i2;
                        cArr = cArr2;
                        Class cls4 = (Class) removeParam.initialize((TypedValue.complexToFraction(i2, f4, f4) > f4 ? 1 : (TypedValue.complexToFraction(i2, f4, f4) == f4 ? 0 : -1)) + 72, (char) Color.alpha(i4), (ViewConfiguration.getScrollFriction() > f3 ? 1 : (ViewConfiguration.getScrollFriction() == f3 ? 0 : -1)) + 1404);
                        Object[] objArr3 = new Object[1];
                        cls2 = cls3;
                        c((byte) 1, i4, i4, objArr3);
                        method = cls4.getMethod((String) objArr3[i4], cls2);
                        map.put(-939298638, method);
                    }
                    cArr3[i3] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i3++;
                    f4 = f3;
                    cls3 = cls2;
                    cArr2 = cArr;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cls = cls3;
            f = f4;
            $11 = ($10 + 43) % 128;
            cArr2 = cArr3;
        } else {
            cls = cls3;
            f = 0.0f;
        }
        Object[] objArr4 = {Integer.valueOf(ThreeDS2Service)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        long j2 = 0;
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize(TextUtils.getCapsMode("", 0, 0) + 73, (char) (TextUtils.getOffsetAfter("", 0) + 7530), ExpandableListView.getPackedPositionChild(0L) + 2490);
            Object[] objArr5 = new Object[1];
            c((byte) 0, 0, 0, objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        int i5 = 2;
        if (initialize) {
            int i6 = ($10 + 67) % 128;
            $11 = i6;
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr4 = new char[length2];
            onerror.getWarnings = 0;
            $10 = (i6 + 59) % 128;
            while (true) {
                int i7 = onerror.getWarnings;
                int i8 = onerror.ThreeDS2ServiceInstance;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i7] = (char) (cArr2[bArr2[(i8 - 1) - i7] + i] - intValue);
                Object[] objArr6 = {onerror, onerror};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(73542081);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(Drawable.resolveOpacity(0, 0) + 48, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myPid() >> 22) + 11441)).getMethod("k", Object.class, Object.class);
                    map3.put(73542081, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
            }
        } else if (getWarnings) {
            int length3 = charArray.length;
            onerror.ThreeDS2ServiceInstance = length3;
            char[] cArr5 = new char[length3];
            onerror.getWarnings = 0;
            while (true) {
                int i9 = onerror.getWarnings;
                int i10 = onerror.ThreeDS2ServiceInstance;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i11 = $11 + 103;
                $10 = i11 % 128;
                if (i11 % i5 != 0) {
                    cArr5[i9] = (char) (cArr2[charArray[i10 + i9] * i] >>> intValue);
                    Object[] objArr7 = new Object[i5];
                    objArr7[1] = onerror;
                    objArr7[0] = onerror;
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(73542081);
                    if (obj4 != null) {
                        j = j2;
                    } else {
                        j = j2;
                        obj4 = ((Class) removeParam.initialize(TextUtils.getOffsetBefore("", 0) + 48, (char) (ViewConfiguration.getEdgeSlop() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 11441)).getMethod("k", Object.class, Object.class);
                        map4.put(73542081, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr7);
                    j2 = j;
                } else {
                    long j3 = j2;
                    cArr5[i9] = (char) (cArr2[charArray[(i10 - 1) - i9] - i] - intValue);
                    Object[] objArr8 = new Object[i5];
                    objArr8[1] = onerror;
                    objArr8[0] = onerror;
                    Map map5 = removeParam.visaSchemeConfiguration;
                    Object obj5 = map5.get(73542081);
                    if (obj5 != null) {
                        f2 = f;
                    } else {
                        f2 = f;
                        obj5 = ((Class) removeParam.initialize((SystemClock.uptimeMillis() > j3 ? 1 : (SystemClock.uptimeMillis() == j3 ? 0 : -1)) + 47, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11441 - (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)))).getMethod("k", Object.class, Object.class);
                        map5.put(73542081, obj5);
                    }
                    ((Method) obj5).invoke(null, objArr8);
                    f = f2;
                    j2 = j3;
                    i5 = 2;
                }
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
                } else {
                    $11 = ($10 + 61) % 128;
                    cArr6[i12] = (char) (cArr2[iArr[(i13 - 1) - i12] - i] - intValue);
                    onerror.getWarnings = i12 + 1;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$d;
        int i5 = 109 - b;
        int i6 = 1 - (i2 * 3);
        int i7 = 3 - (i * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i6;
            i4 = 0;
            int i10 = i7 + i9;
            i7 = i8;
            i5 = i10;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i7 + 1;
            i9 = bArr[i11];
            i7 = i5;
            i8 = i11;
            int i102 = i7 + i9;
            i7 = i8;
            i5 = i102;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{93, 117, 76, -7, 18, 8, -15, -2, -35, 13, -35, 31, 16, 11, 2, -15, -8, 0, -30, 35, 3, -1, -21, 11, -13, 0, -4, 13, -31, 8, 15, -6, -7, 3, -9, 10, -4, 13, -35};
        $$b = 96;
    }

    public static void init$1() {
        $$d = new byte[]{44, -9, -32, -33};
        $$e = 92;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.nw.getWarnings
    public void get(String str) {
        getSDKInfo = (cleanup + 95) % 128;
    }
}
