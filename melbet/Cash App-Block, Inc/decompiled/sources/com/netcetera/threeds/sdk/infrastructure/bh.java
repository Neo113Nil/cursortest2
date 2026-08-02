package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class bh extends loadFromXML<LinearLayout> implements containsValue, getServices {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static final ArrayList<String> get;
    private static int getSDKInfo;
    private static int getSDKVersion;
    private RadioGroup ThreeDS2ServiceInstance;
    private final jr getWarnings;

    static {
        get();
        Object[] objArr = new Object[1];
        a(false, 6 - (ViewConfiguration.getEdgeSlop() >> 16), 38 - (ViewConfiguration.getFadingEdgeLength() >> 16), "￼\u000f\u0000￦\u0000\u0014￮\u0004\t\u0002\u0007\u0000\uffde\u0003\n\u0004\ufffe\u0000￤\t\u000b\u0010\u000f\ufff0\u0004\uffde\n\b\u000b\n\t\u0000\t\u000f\ufff0\u0004￮\u000f", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, objArr);
        ThreeDS2Service = ((String) objArr[0]).intern();
        get = new ArrayList<String>() { // from class: com.netcetera.threeds.sdk.infrastructure.bh.4
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static int[] ThreeDS2Service;
            private static char ThreeDS2ServiceInstance;
            private static int createTransaction;
            private static char get;
            private static int getSDKVersion;
            private static char getWarnings;
            private static char initialize;

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getSDKVersion = 0;
                createTransaction = 1;
                getWarnings = (char) 43163;
                get = (char) 33758;
                initialize = (char) 46662;
                ThreeDS2ServiceInstance = (char) 24964;
                ThreeDS2Service = new int[]{856663036, 1914385373, 735058840, -1388896756, -1566893000, -1766994283, -1592126407, 1935661845, 1146430853, -534121358, 825402108, -169404688, -356931974, -48557276, 447181614, -1022127997, 941881760, 1233148995};
            }

            {
                Object[] objArr2 = new Object[1];
                a("╔Ⴇ䇐䦴Ꞵ࡚鐟ࣛ꒺ᨊ\udd1b䘫쒺\uf83a辯聕켜큦햖쯮叞烆캰ৠ펜‛劭虫栙\ue786ᐚ䁸윾\uf280\uf769蓫", ExpandableListView.getPackedPositionGroup(0L) + 36, objArr2);
                add(((String) objArr2[0]).intern());
                Object[] objArr3 = new Object[1];
                a("╔Ⴇ䇐䦴Ꞵ࡚鐟ࣛ꒺ᨊ\udd1b䘫쒺\uf83a辯聕켜큦햖쯮叞烆캰ৠ펜‛劭虫栙\ue786ᐚ䁸윾\uf280脛㴡", 36 - TextUtils.getOffsetAfter("", 0), objArr3);
                add(((String) objArr3[0]).intern());
                Object[] objArr4 = new Object[1];
                a("╔Ⴇ䇐䦴Ꞵ࡚鐟ࣛ꒺ᨊ\udd1b䘫쒺\uf83a辯聕켜큦햖쯮叞烆캰ৠ펜‛劭虫栙\ue786ᐚ䁸윾\uf280♳\ude9c", 36 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr4);
                add(((String) objArr4[0]).intern());
                Object[] objArr5 = new Object[1];
                a("╔Ⴇ䇐䦴Ꞵ࡚鐟ࣛ꒺ᨊ\udd1b䘫쒺\uf83a辯聕켜큦햖쯮叞烆캰ৠ펜‛劭虫栙\ue786ᐚ䁸윾\uf280㒔⊁", KeyEvent.keyCodeFromString("") + 36, objArr5);
                add(((String) objArr5[0]).intern());
                Object[] objArr6 = new Object[1];
                b(new int[]{-1167373106, -245451648, 296380508, -1676010251, 633516729, -1536453185, 1276808113, 269341072, -775247946, 956879494, 2057128792, -1814012388, -528774219, -225100267, -1783682578, 916880213, 1586962660, -1553040983}, (ViewConfiguration.getPressedStateDuration() >> 16) + 36, objArr6);
                add(((String) objArr6[0]).intern());
                Object[] objArr7 = new Object[1];
                a("╔Ⴇ䇐䦴Ꞵ࡚鐟ࣛ꒺ᨊ\udd1b䘫쒺\uf83a辯聕켜큦햖쯮叞烆캰ৠ펜‛劭虫栙\ue786ᐚ䁸윾\uf280㚯鼫", 36 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr7);
                add(((String) objArr7[0]).intern());
                Object[] objArr8 = new Object[1];
                a("╔Ⴇ䇐䦴Ꞵ࡚鐟ࣛ꒺ᨊ\udd1b䘫쒺\uf83a辯聕켜큦햖쯮叞烆캰ৠ펜‛劭虫栙\ue786ᐚ䁸윾\uf280偈ꈳ", 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr8);
                add(((String) objArr8[0]).intern());
                Object[] objArr9 = new Object[1];
                b(new int[]{-1167373106, -245451648, 296380508, -1676010251, 633516729, -1536453185, 1276808113, 269341072, -775247946, 956879494, 2057128792, -1814012388, -528774219, -225100267, -1783682578, 916880213, 2102906147, 2007452867}, 35 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr9);
                add(((String) objArr9[0]).intern());
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] ThreeDS2Service(int r51, int r52) {
                /*
                    Method dump skipped, instructions count: 2262
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.bh.AnonymousClass4.ThreeDS2Service(int, int):java.lang.Object[]");
            }

            private static void a(String str, int i, Object[] objArr2) {
                char[] cArr;
                int i2 = $11 + 115;
                $10 = i2 % 128;
                int i3 = 2;
                if (i2 % 2 != 0) {
                    throw null;
                }
                char[] charArray = str != null ? str.toCharArray() : str;
                ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
                char[] cArr2 = new char[charArray.length];
                int i4 = 0;
                configurationBuilder.ThreeDS2ServiceInstance = 0;
                char[] cArr3 = new char[2];
                $10 = ($11 + 63) % 128;
                while (true) {
                    int i5 = configurationBuilder.ThreeDS2ServiceInstance;
                    if (i5 >= charArray.length) {
                        break;
                    }
                    cArr3[i4] = charArray[i5];
                    char c = 1;
                    cArr3[1] = charArray[i5 + 1];
                    int i6 = 58224;
                    int i7 = i4;
                    while (i7 < 16) {
                        $10 = ($11 + 105) % 128;
                        char c2 = cArr3[c];
                        char c3 = cArr3[i4];
                        char c4 = c;
                        int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (initialize ^ (-1730380012335540218L))));
                        int i9 = c3 >>> 5;
                        int i10 = i3;
                        int i11 = i4;
                        try {
                            Object[] objArr3 = new Object[4];
                            objArr3[3] = Integer.valueOf(ThreeDS2ServiceInstance);
                            objArr3[i10] = Integer.valueOf(i9);
                            objArr3[c4] = Integer.valueOf(i8);
                            objArr3[i11] = Integer.valueOf(c2);
                            Map map = removeParam.visaSchemeConfiguration;
                            Object obj = map.get(936379577);
                            Class cls = Integer.TYPE;
                            if (obj != null) {
                                cArr = charArray;
                            } else {
                                cArr = charArray;
                                obj = ((Class) removeParam.initialize(66 - TextUtils.indexOf((CharSequence) "", '0'), (char) (62396 - KeyEvent.normalizeMetaState(i11)), 5352 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("C", cls, cls, cls, cls);
                                map.put(936379577, obj);
                            }
                            char charValue = ((Character) ((Method) obj).invoke(null, objArr3)).charValue();
                            cArr3[c4] = charValue;
                            char c5 = cArr3[i11];
                            char[] cArr4 = cArr3;
                            int i12 = (charValue + i6) ^ ((charValue << 4) + ((char) (getWarnings ^ (-1730380012335540218L))));
                            int i13 = charValue >>> 5;
                            Object[] objArr4 = new Object[4];
                            objArr4[3] = Integer.valueOf(get);
                            objArr4[i10] = Integer.valueOf(i13);
                            objArr4[c4] = Integer.valueOf(i12);
                            objArr4[i11] = Integer.valueOf(c5);
                            Object obj2 = map.get(936379577);
                            if (obj2 == null) {
                                obj2 = ((Class) removeParam.initialize(KeyEvent.keyCodeFromString("") + 67, (char) (62396 - TextUtils.getCapsMode("", i11, i11)), (ExpandableListView.getPackedPositionForGroup(i11) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i11) == 0L ? 0 : -1)) + 5352)).getMethod("C", cls, cls, cls, cls);
                                map.put(936379577, obj2);
                            }
                            cArr4[0] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                            i6 -= 40503;
                            i7++;
                            c = c4;
                            i3 = i10;
                            cArr3 = cArr4;
                            charArray = cArr;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr5 = charArray;
                    int i14 = i3;
                    char[] cArr6 = cArr3;
                    char c6 = c;
                    int i15 = configurationBuilder.ThreeDS2ServiceInstance;
                    cArr2[i15] = cArr6[0];
                    cArr2[i15 + 1] = cArr6[c6];
                    Object[] objArr5 = new Object[i14];
                    objArr5[c6] = configurationBuilder;
                    objArr5[0] = configurationBuilder;
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(108358357);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 54, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39909), 7059 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("B", Object.class, Object.class);
                        map2.put(108358357, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                    cArr3 = cArr6;
                    charArray = cArr5;
                    i3 = 2;
                    i4 = 0;
                }
                String str2 = new String(cArr2, 0, i);
                int i16 = $10 + 43;
                $11 = i16 % 128;
                if (i16 % 2 != 0) {
                    objArr2[0] = str2;
                } else {
                    int i17 = 19 / 0;
                    objArr2[0] = str2;
                }
            }

            private static void b(int[] iArr, int i, Object[] objArr2) {
                int i2;
                long j;
                int i3;
                int i4;
                char c;
                Object method;
                int length;
                int[] iArr2;
                int i5;
                int[] iArr3;
                int i6;
                int[] iArr4;
                int i7;
                Object method2;
                char[] cArr;
                Object method3;
                createTransaction createtransaction = new createTransaction();
                char[] cArr2 = new char[4];
                char[] cArr3 = new char[iArr.length * 2];
                int[] iArr5 = ThreeDS2Service;
                Class cls = Integer.TYPE;
                if (iArr5 != null) {
                    j = 0;
                    int length2 = iArr5.length;
                    int[] iArr6 = new int[length2];
                    i2 = 2;
                    int i8 = 0;
                    while (i8 < length2) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                            Map map = removeParam.visaSchemeConfiguration;
                            Object obj = map.get(2095751688);
                            if (obj != null) {
                                cArr = cArr2;
                                method3 = obj;
                            } else {
                                cArr = cArr2;
                                Class cls2 = (Class) removeParam.initialize((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 63, (char) ExpandableListView.getPackedPositionGroup(0L), 1197 - ((Process.getThreadPriority(0) + 20) >> 6));
                                Object[] objArr4 = new Object[1];
                                d((byte) 0, (short) 0, 0, objArr4);
                                method3 = cls2.getMethod((String) objArr4[0], cls);
                                map.put(2095751688, method3);
                            }
                            iArr6[i8] = ((Integer) ((Method) method3).invoke(null, objArr3)).intValue();
                            i8++;
                            cArr2 = cArr;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr5 = iArr6;
                } else {
                    i2 = 2;
                    j = 0;
                }
                char[] cArr4 = cArr2;
                int length3 = iArr5.length;
                int[] iArr7 = new int[length3];
                int[] iArr8 = ThreeDS2Service;
                if (iArr8 != null) {
                    int i9 = $10 + 115;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = iArr8.length;
                        iArr2 = new int[length];
                        i5 = 1;
                    } else {
                        length = iArr8.length;
                        iArr2 = new int[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        Object[] objArr5 = {Integer.valueOf(iArr8[i5])};
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(2095751688);
                        if (obj2 != null) {
                            iArr3 = iArr8;
                            method2 = obj2;
                            i6 = length;
                            iArr4 = iArr2;
                            i7 = i5;
                        } else {
                            iArr3 = iArr8;
                            i6 = length;
                            iArr4 = iArr2;
                            i7 = i5;
                            Class cls3 = (Class) removeParam.initialize(64 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(j), TextUtils.lastIndexOf("", '0', 0, 0) + 1198);
                            Object[] objArr6 = new Object[1];
                            d((byte) 0, (short) 0, 0, objArr6);
                            method2 = cls3.getMethod((String) objArr6[0], cls);
                            map2.put(2095751688, method2);
                        }
                        iArr4[i7] = ((Integer) ((Method) method2).invoke(null, objArr5)).intValue();
                        i5 = i7 + 1;
                        iArr8 = iArr3;
                        length = i6;
                        iArr2 = iArr4;
                    }
                    iArr8 = iArr2;
                }
                System.arraycopy(iArr8, 0, iArr7, 0, length3);
                createtransaction.initialize = 0;
                while (true) {
                    int i10 = createtransaction.initialize;
                    if (i10 >= iArr.length) {
                        objArr2[0] = new String(cArr3, 0, i);
                        return;
                    }
                    $10 = ($11 + 69) % 128;
                    int i11 = iArr[i10];
                    char c2 = (char) (i11 >> 16);
                    cArr4[0] = c2;
                    char c3 = (char) i11;
                    cArr4[1] = c3;
                    int i12 = 16;
                    char c4 = (char) (iArr[i10 + 1] >> 16);
                    cArr4[i2] = c4;
                    char c5 = (char) iArr[i10 + 1];
                    char c6 = 3;
                    cArr4[3] = c5;
                    createtransaction.getWarnings = (c2 << 16) + c3;
                    createtransaction.get = (c4 << 16) + c5;
                    createTransaction.ThreeDS2ServiceInstance(iArr7);
                    $11 = ($10 + 95) % 128;
                    int i13 = 0;
                    while (true) {
                        i3 = createtransaction.getWarnings;
                        if (i13 >= i12) {
                            break;
                        }
                        int i14 = i3 ^ iArr7[i13];
                        createtransaction.getWarnings = i14;
                        int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i14);
                        Object[] objArr7 = new Object[4];
                        objArr7[c6] = createtransaction;
                        objArr7[i2] = createtransaction;
                        objArr7[1] = Integer.valueOf(ThreeDS2Service2);
                        objArr7[0] = createtransaction;
                        Map map3 = removeParam.visaSchemeConfiguration;
                        Object obj3 = map3.get(-411264147);
                        if (obj3 != null) {
                            i4 = i12;
                            method = obj3;
                            c = c6;
                        } else {
                            i4 = i12;
                            c = c6;
                            method = ((Class) removeParam.initialize(49 - View.resolveSizeAndState(0, 0, 0), (char) (1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), 13121 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("y", Object.class, cls, Object.class, Object.class);
                            map3.put(-411264147, method);
                        }
                        int intValue = ((Integer) ((Method) method).invoke(null, objArr7)).intValue();
                        createtransaction.getWarnings = createtransaction.get;
                        createtransaction.get = intValue;
                        i13++;
                        c6 = c;
                        i12 = i4;
                    }
                    char c7 = c6;
                    int i15 = createtransaction.get;
                    createtransaction.getWarnings = i15;
                    createtransaction.get = i3;
                    int i16 = i3 ^ iArr7[i12];
                    createtransaction.get = i16;
                    int i17 = i15 ^ iArr7[17];
                    createtransaction.getWarnings = i17;
                    cArr4[0] = (char) (i17 >>> 16);
                    cArr4[1] = (char) i17;
                    cArr4[i2] = (char) (i16 >>> 16);
                    cArr4[c7] = (char) i16;
                    createTransaction.ThreeDS2ServiceInstance(iArr7);
                    int i18 = createtransaction.initialize;
                    cArr3[i18 * 2] = cArr4[0];
                    cArr3[(i18 * 2) + 1] = cArr4[1];
                    cArr3[(i18 * 2) + 2] = cArr4[i2];
                    cArr3[(i18 * 2) + 3] = cArr4[c7];
                    int i19 = i2;
                    Object[] objArr8 = new Object[i19];
                    objArr8[1] = createtransaction;
                    objArr8[0] = createtransaction;
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(-1870831722);
                    if (obj4 == null) {
                        Class cls4 = (Class) removeParam.initialize(99 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf("", "") + 1880);
                        Object[] objArr9 = new Object[1];
                        d((byte) 0, (short) 0, 1, objArr9);
                        obj4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                        map4.put(-1870831722, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr8);
                    $11 = ($10 + 29) % 128;
                    i2 = i19;
                }
            }

            private static void c(short s, int i, short s2, Object[] objArr2) {
                int i2 = s2 + 4;
                int i3 = s * 20;
                byte[] bArr = $$a;
                int i4 = (i * 19) + 84;
                byte[] bArr2 = new byte[i3 + 3];
                int i5 = i3 + 2;
                int i6 = -1;
                if (bArr == null) {
                    i4 = i4 + (-i2) + 2;
                    i2 = i2;
                    bArr = bArr;
                    i6 = -1;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i4;
                    int i8 = i2 + 1;
                    if (i7 == i5) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    byte[] bArr3 = bArr;
                    i4 = i4 + (-bArr[i8]) + 2;
                    i2 = i8;
                    bArr = bArr3;
                    i6 = i7;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x0030). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void d(byte b, short s, int i, Object[] objArr2) {
                int i2;
                int i3;
                int i4 = s * 4;
                int i5 = 3 - (b * 3);
                byte[] bArr = $$d;
                int i6 = (i * 5) + 113;
                byte[] bArr2 = new byte[1 - i4];
                int i7 = 0 - i4;
                if (bArr == null) {
                    i2 = i5;
                    int i8 = i7;
                    i3 = 0;
                    i5 += i8;
                    i2++;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i7) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    i3++;
                    i8 = bArr[i2];
                    i5 += i8;
                    i2++;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i7) {
                    }
                } else {
                    i2 = i5;
                    i5 = i6;
                    i3 = 0;
                    i2++;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i7) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{114, 64, -72, -72, -18, -8, 15, 2, 35, -13, 35, -31, -16, -11, -2, 15, 8, 0, 30, -35, -3, 1, 21, -11, 13, 0, 4, -13};
                $$b = EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE;
            }

            public static void init$1() {
                $$d = new byte[]{102, -52, -46, 35};
                $$e = 45;
            }
        };
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 85) % 128;
    }

    public bh(Context context, jr jrVar) {
        super(context);
        this.getWarnings = jrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        char c;
        Object method;
        Throwable cause;
        Object method2;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr = new char[i2];
        getsdkinfo.getWarnings = 0;
        $11 = ($10 + 23) % 128;
        while (true) {
            int i4 = getsdkinfo.getWarnings;
            if (i4 >= i2) {
                break;
            }
            $10 = ($11 + 105) % 128;
            char c2 = charArray[i4];
            getsdkinfo.ThreeDS2ServiceInstance = c2;
            char c3 = (char) (i3 + c2);
            cArr[i4] = c3;
            try {
                Object[] objArr2 = {Integer.valueOf(c3), Integer.valueOf(getSDKVersion)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    method2 = obj;
                } else {
                    Class cls = (Class) removeParam.initialize(67 - TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 45769), 4879 - KeyEvent.getDeadChar(0, 0));
                    Class cls2 = Integer.TYPE;
                    method2 = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method2);
                }
                cArr[i4] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getsdkinfo, getsdkinfo};
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(((byte) KeyEvent.getModifierMetaStateMask()) + 60, (char) (AndroidCharacter.getMirror('0') - '0'), 12373 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
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
        char c4 = '0';
        if (i > 0) {
            $11 = ($10 + 115) % 128;
            getsdkinfo.get = i;
            char[] cArr2 = new char[i2];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            int i5 = getsdkinfo.get;
            System.arraycopy(cArr2, 0, cArr, i2 - i5, i5);
            int i6 = getsdkinfo.get;
            System.arraycopy(cArr2, i6, cArr, 0, i2 - i6);
        }
        if (z) {
            char[] cArr3 = new char[i2];
            getsdkinfo.getWarnings = 0;
            while (true) {
                int i7 = getsdkinfo.getWarnings;
                if (i7 >= i2) {
                    break;
                }
                cArr3[i7] = cArr[(i2 - i7) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 != null) {
                    method = obj3;
                    c = c4;
                } else {
                    c = c4;
                    method = ((Class) removeParam.initialize(TextUtils.indexOf("", c) + 60, (char) View.resolveSizeAndState(0, 0, 0), 12373 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, method);
                }
                ((Method) method).invoke(null, objArr4);
                c4 = c;
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    private /* synthetic */ void aN_(setTextIsSelectable settextisselectable, CompoundButton compoundButton, boolean z) {
        int i = ThreeDS2ServiceInitializationCallback + 25;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            compoundButton.isChecked();
            throw null;
        }
        if (compoundButton.isChecked()) {
            int i2 = ThreeDS2ServiceInitializationCallback + 49;
            getSDKInfo = i2 % 128;
            if (i2 % 2 != 0) {
                initialize(settextisselectable.getWarnings());
                throw null;
            }
            initialize(settextisselectable.getWarnings());
        }
        int i3 = getSDKInfo + 71;
        ThreeDS2ServiceInitializationCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void aO_(bh bhVar, setTextIsSelectable settextisselectable, CompoundButton compoundButton, boolean z) {
        int i = getSDKInfo + 125;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        bhVar.aN_(settextisselectable, compoundButton, z);
        if (i2 == 0) {
            int i3 = 87 / 0;
        }
    }

    public static void get() {
        getSDKVersion = 1141902374;
    }

    private void initialize(String str) {
        int i = getSDKInfo + 121;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            ThreeDS2Service().setTag(str);
            throw null;
        }
        ThreeDS2Service().setTag(str);
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 113) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        List<setTextIsSelectable> amexConfiguration;
        int i = ThreeDS2ServiceInitializationCallback + 19;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            initialize();
            amexConfiguration = setscroller.amexConfiguration();
            this.ThreeDS2ServiceInstance.removeAllViews();
            int i2 = 7 / 0;
            if (amexConfiguration == null) {
                return;
            }
        } else {
            initialize();
            amexConfiguration = setscroller.amexConfiguration();
            this.ThreeDS2ServiceInstance.removeAllViews();
            if (amexConfiguration == null) {
                return;
            }
        }
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 65) % 128;
        if (amexConfiguration.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < amexConfiguration.size(); i3++) {
            setTextIsSelectable settextisselectable = amexConfiguration.get(i3);
            RadioButton radioButton = new RadioButton(this.ThreeDS2ServiceInstance.getContext());
            radioButton.setText(settextisselectable.get());
            int i4 = es.ThreeDS2Service;
            radioButton.setPadding(0, i4, 0, i4);
            radioButton.setMinHeight(es.getSDKInfo);
            radioButton.setOnCheckedChangeListener(new bj(this, settextisselectable));
            ArrayList<String> arrayList = get;
            if (i3 < arrayList.size()) {
                getSDKInfo = (ThreeDS2ServiceInitializationCallback + 77) % 128;
                getWarnings(radioButton, arrayList.get(i3));
            }
            et.bm_(radioButton, this.getWarnings);
            this.ThreeDS2ServiceInstance.addView(radioButton);
        }
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 103) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        int i = ThreeDS2ServiceInitializationCallback + 99;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            aM_(context);
            throw null;
        }
        LinearLayout aM_ = aM_(context);
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 61) % 128;
        return aM_;
    }

    public LinearLayout aM_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = es.getSDKVersion;
        linearLayout.setPadding(i, es.initialize, i, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        RadioGroup radioGroup = new RadioGroup(context);
        this.ThreeDS2ServiceInstance = radioGroup;
        radioGroup.setLayoutParams((LinearLayout.LayoutParams) eu.ThreeDS2Service(new Object[0], -691514327, 691514327, (int) System.currentTimeMillis()));
        linearLayout.addView(this.ThreeDS2ServiceInstance);
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 5) % 128;
        return linearLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r9 = new java.lang.Object[1];
        a(false, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6, 38 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), "￼\u000f\u0000￦\u0000\u0014￮\u0004\t\u0002\u0007\u0000\uffde\u0003\n\u0004\ufffe\u0000￤\t\u000b\u0010\u000f\ufff0\u0004\uffde\n\b\u000b\n\t\u0000\t\u000f\ufff0\u0004￮\u000f", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 138, r9);
        r11.get(((java.lang.String) r9[0]).intern(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        return;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getWarnings(eq eqVar) {
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 83) % 128;
        int i = 0;
        while (true) {
            if (i >= this.ThreeDS2ServiceInstance.getChildCount()) {
                i = -1;
                break;
            }
            int i2 = getSDKInfo + 1;
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            int i3 = i2 % 2;
            RadioGroup radioGroup = this.ThreeDS2ServiceInstance;
            if (i3 == 0) {
                ((CompoundButton) radioGroup.getChildAt(i)).isChecked();
                throw null;
            }
            if (((CompoundButton) radioGroup.getChildAt(i)).isChecked()) {
                getSDKInfo = (ThreeDS2ServiceInitializationCallback + 125) % 128;
                break;
            } else {
                i++;
                ThreeDS2ServiceInitializationCallback = (getSDKInfo + 121) % 128;
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getServices
    public size ThreeDS2ServiceInstance() {
        initialize();
        bg bgVar = new bg((String) ThreeDS2Service().getTag());
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 75) % 128;
        return bgVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        CompoundButton compoundButton;
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 89) % 128;
        initialize();
        Object[] objArr = new Object[1];
        a(false, 6 - View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37, "￼\u000f\u0000￦\u0000\u0014￮\u0004\t\u0002\u0007\u0000\uffde\u0003\n\u0004\ufffe\u0000￤\t\u000b\u0010\u000f\ufff0\u0004\uffde\n\b\u000b\n\t\u0000\t\u000f\ufff0\u0004￮\u000f", (ViewConfiguration.getLongPressTimeout() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, objArr);
        int intValue = erVar.ThreeDS2Service(((String) objArr[0]).intern(), -1).intValue();
        if (intValue != -1 && (compoundButton = (CompoundButton) this.ThreeDS2ServiceInstance.getChildAt(intValue)) != null) {
            getSDKInfo = (ThreeDS2ServiceInitializationCallback + 67) % 128;
            compoundButton.setChecked(true);
        }
        int i = getSDKInfo + 13;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
