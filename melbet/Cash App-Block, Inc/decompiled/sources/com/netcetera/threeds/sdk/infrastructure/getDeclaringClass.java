package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class getDeclaringClass {
    private static final no ThreeDS2Service = (no) nu.initialize(new Object[]{getDeclaringClass.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private static int initialize;
    private static int ThreeDS2ServiceInstance = ((-2) - ((initialize + 118) ^ (-1))) % 128;

    private static /* synthetic */ Object ConfigParameters(Object[] objArr) {
        final int intValue = ((Number) objArr[0]).intValue();
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.14
            private static int getWarnings = 0;
            private static int initialize = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public findFragmentById get(nq nqVar, String str, boolean z) {
                int i = getWarnings;
                int i2 = i & 95;
                int i3 = (i | 95) & (~i2);
                int i4 = -(-(i2 << 1));
                initialize = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
                int i5 = intValue;
                findFragmentById findfragmentbyid = ((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{Integer.valueOf(i5)}, 605561253, -605561234, i5)).get(nqVar, str, z);
                if (!findfragmentbyid.get()) {
                    int i6 = getWarnings;
                    int i7 = ((i6 & 44) + (i6 | 44)) - 1;
                    int i8 = i7 % 128;
                    initialize = i8;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    if (z) {
                        getWarnings = (i8 + 1) % 128;
                        ((no) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 1464134729, -1464134714, (int) System.currentTimeMillis())).initialize(findfragmentbyid.toString());
                        findFragmentById findfragmentbyid2 = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                        int i9 = getWarnings;
                        int i10 = i9 & 111;
                        int i11 = -(-((i9 ^ 111) | i10));
                        initialize = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                        return findfragmentbyid2;
                    }
                }
                int i12 = getWarnings;
                int i13 = ((i12 ^ 41) | (i12 & 41)) << 1;
                int i14 = -(((~i12) & 41) | (i12 & (-42)));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                initialize = i15 % 128;
                if (i15 % 2 != 0) {
                    return findfragmentbyid;
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public nq getWarnings(nq nqVar, String str, boolean z) {
                int i = initialize;
                int m = Thread$State$EnumUnboxingLocalUtility.m(i & 38, i | 38, 1, 128);
                getWarnings = m;
                if (z) {
                    int i2 = m & 59;
                    int i3 = m | 59;
                    int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
                    initialize = i4 % 128;
                    if (i4 % 2 == 0) {
                        nqVar.ThreeDS2Service(str, oj.ThreeDS2ServiceInstance(nqVar.initialize(str), intValue));
                        throw null;
                    }
                    nqVar.ThreeDS2Service(str, oj.ThreeDS2ServiceInstance(nqVar.initialize(str), intValue));
                    int i5 = initialize + 88;
                    getWarnings = ((i5 ^ (-1)) + (i5 << 1)) % 128;
                }
                int i6 = initialize + 17;
                getWarnings = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 32 / 0;
                }
                return nqVar;
            }
        };
        int i = initialize;
        int i2 = i & 55;
        int i3 = (((i ^ 55) | i2) << 1) - ((i | 55) & (~i2));
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 != 0) {
            return compareto;
        }
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        final String str = (String) objArr[0];
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static long ThreeDS2ServiceInstance;
            private static int get;
            private static int getWarnings;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                get = 0;
                getWarnings = 1;
                ThreeDS2ServiceInstance = -5849766170111339685L;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0162  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0163  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(String str2, int i, Object[] objArr2) {
                char[] cArr;
                Throwable cause;
                int i2;
                short s;
                if (str2 != null) {
                    int i3 = $10 + 19;
                    $11 = i3 % 128;
                    if (i3 % 2 == 0) {
                        str2.toCharArray();
                        throw null;
                    }
                    cArr = str2.toCharArray();
                } else {
                    cArr = str2;
                }
                char[] cArr2 = cArr;
                addParam addparam = new addParam();
                addparam.initialize = i;
                int length = cArr2.length;
                long[] jArr = new long[length];
                short s2 = 0;
                addparam.ThreeDS2Service = 0;
                while (true) {
                    int i4 = addparam.ThreeDS2Service;
                    if (i4 >= cArr2.length) {
                        break;
                    }
                    char c = cArr2[i4];
                    try {
                        Object[] objArr3 = new Object[3];
                        objArr3[2] = addparam;
                        objArr3[1] = addparam;
                        objArr3[s2] = Integer.valueOf(c);
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-983980093);
                        if (obj != null) {
                            s = s2;
                            i2 = 62097;
                        } else {
                            i2 = 62097;
                            s = s2;
                            obj = ((Class) removeParam.initialize(ExpandableListView.getPackedPositionChild(0L) + 67, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ExpandableListView.getPackedPositionForChild(s2, s2) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(s2, s2) == 0L ? 0 : -1)) + 12512)).getMethod("e", Integer.TYPE, Object.class, Object.class);
                            map.put(-983980093, obj);
                        }
                        jArr[i4] = ((Long) ((Method) obj).invoke(null, objArr3)).longValue() ^ (ThreeDS2ServiceInstance ^ 6009743645011411028L);
                        Object[] objArr4 = new Object[2];
                        objArr4[1] = addparam;
                        objArr4[s] = addparam;
                        Object obj2 = map.get(-1840119381);
                        if (obj2 == null) {
                            Class cls = (Class) removeParam.initialize(76 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (i2 - (TypedValue.complexToFloat(s) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(s) == RecyclerView.DECELERATION_RATE ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2102);
                            Object[] objArr5 = new Object[1];
                            short s3 = s;
                            b(s3, s3, s3, objArr5);
                            obj2 = cls.getMethod((String) objArr5[s3], Object.class, Object.class);
                            map.put(-1840119381, obj2);
                        }
                        ((Method) obj2).invoke(null, objArr4);
                        s2 = 0;
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
                char[] cArr3 = new char[length];
                addparam.ThreeDS2Service = 0;
                while (true) {
                    int i5 = addparam.ThreeDS2Service;
                    if (i5 >= cArr2.length) {
                        objArr2[0] = new String(cArr3);
                        return;
                    }
                    cArr3[i5] = (char) jArr[i5];
                    Object[] objArr6 = {addparam, addparam};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(-1840119381);
                    if (obj3 == null) {
                        Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 76, (char) (62097 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 2102 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        Object[] objArr7 = new Object[1];
                        b((short) 0, 0, 0, objArr7);
                        obj3 = cls2.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1840119381, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                    $10 = ($11 + 21) % 128;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0034). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(short s, int i, int i2, Object[] objArr2) {
                int i3;
                int i4 = 99 - (i * 4);
                byte[] bArr = $$a;
                int i5 = 3 - (s * 3);
                int i6 = i2 * 2;
                byte[] bArr2 = new byte[1 - i6];
                int i7 = 0 - i6;
                if (bArr == null) {
                    int i8 = i5;
                    byte[] bArr3 = bArr;
                    int i9 = 0;
                    int i10 = i7;
                    int i11 = (-i5) + i10;
                    int i12 = i8;
                    i4 = i11;
                    i5 = i12;
                    bArr = bArr3;
                    i3 = i9;
                    bArr2[i3] = (byte) i4;
                    int i13 = i5 + 1;
                    if (i3 == i7) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    int i14 = i4;
                    i8 = i13;
                    i5 = bArr[i13];
                    i9 = i3 + 1;
                    bArr3 = bArr;
                    i10 = i14;
                    int i112 = (-i5) + i10;
                    int i122 = i8;
                    i4 = i112;
                    i5 = i122;
                    bArr = bArr3;
                    i3 = i9;
                    bArr2[i3] = (byte) i4;
                    int i132 = i5 + 1;
                    if (i3 == i7) {
                    }
                } else {
                    i3 = 0;
                    bArr2[i3] = (byte) i4;
                    int i1322 = i5 + 1;
                    if (i3 == i7) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{105, 18, 104, -16};
                $$b = 110;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public findFragmentById get(nq nqVar, String str2, boolean z) {
                getWarnings = (get + 35) % 128;
                String str3 = (String) oj.getWarnings(nqVar.initialize(str2), "");
                if (!oj.initialize((CharSequence) str3, (CharSequence) str)) {
                    setTextAlignment settextalignment = setTextAlignment.getMessageVersion;
                    Object[] objArr2 = new Object[1];
                    a("鍟ⶋ\ueeb7꿁棶⤓\uea25ꬩ摕┢\ue7a6ꃽ懀⋳\ue3a9밍紬㸚ｻ릟窟㯦\uf4c4뗭瘂㜳\uf021너牷\u0c91췹軀俇࣯쥅訲䭞ѵ요螅䂱Ǉ싹荘尥ᴯ\ude45齱妚\u1af4\udb95铕嗳ᘖ휤遟兣᎗겉淨\u2ef8\uefbbꠊ椉⩣\ueb0aꑗ暅➸\ue0d3ꇸ拺⌂ﰦ봝繃㣖劣몔", 48869 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
                    return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str2, String.format(((String) objArr2[0]).intern(), str2, str, str3))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                }
                findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                int i = getWarnings + 7;
                get = i % 128;
                if (i % 2 != 0) {
                    int i2 = 21 / 0;
                }
                return findfragmentbyid;
            }
        };
        int i = initialize + 118;
        int i2 = (i ^ (-1)) + (i << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return compareto;
        }
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInitializationCallback(Object[] objArr) {
        final int intValue = ((Number) objArr[0]).intValue();
        final int intValue2 = ((Number) objArr[1]).intValue();
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.16
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static int ThreeDS2ServiceInitializationCallback;
            private static int ThreeDS2ServiceInstance;
            private static char get;
            private static char[] initialize;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                ThreeDS2ServiceInstance = 0;
                ThreeDS2ServiceInitializationCallback = 1;
                initialize = new char[]{37902, 37906, 37912, 37921, 37900, 37914, 37974, 38880, 37910, 37918, 37919, 37911, 37947, 37952, 37909, 38881, 37905, 37972, 37948, 37930, 37927, 37915, 37975, 37917, 37897, 37903, 37978, 37916, 37901, 37891, 37913, 37904, 37907, 37983, 37908, 37896};
                get = (char) 41446;
            }

            private static void a(byte b, String str, int i, Object[] objArr2) {
                char[] cArr;
                int i2;
                char c;
                char c2;
                char c3;
                char c4;
                char c5;
                Object method;
                char[] cArr2;
                Object method2;
                if (str != null) {
                    $10 = ($11 + 15) % 128;
                    cArr = str.toCharArray();
                } else {
                    cArr = str;
                }
                char[] cArr3 = cArr;
                getParamValue getparamvalue = new getParamValue();
                char[] cArr4 = initialize;
                Class cls = Integer.TYPE;
                if (cArr4 != null) {
                    int length = cArr4.length;
                    char[] cArr5 = new char[length];
                    int i3 = 0;
                    while (i3 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr4[i3])};
                            Map map = removeParam.visaSchemeConfiguration;
                            Object obj = map.get(-78420608);
                            if (obj != null) {
                                cArr2 = cArr3;
                                method2 = obj;
                            } else {
                                cArr2 = cArr3;
                                Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getEdgeSlop() >> 16) + 94, (char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1559);
                                Object[] objArr4 = new Object[1];
                                b(0, (short) 0, 0, objArr4);
                                method2 = cls2.getMethod((String) objArr4[0], cls);
                                map.put(-78420608, method2);
                            }
                            cArr5[i3] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                            i3++;
                            cArr3 = cArr2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr4 = cArr5;
                }
                char[] cArr6 = cArr3;
                Object[] objArr5 = {Integer.valueOf(get)};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(-78420608);
                if (obj2 == null) {
                    Class cls3 = (Class) removeParam.initialize(95 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1559 - TextUtils.indexOf("", "", 0, 0));
                    Object[] objArr6 = new Object[1];
                    b(0, (short) 0, 0, objArr6);
                    obj2 = cls3.getMethod((String) objArr6[0], cls);
                    map2.put(-78420608, obj2);
                }
                char charValue = ((Character) ((Method) obj2).invoke(null, objArr5)).charValue();
                char[] cArr7 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr7[i2] = (char) (cArr6[i2] - b);
                    $10 = ($11 + 87) % 128;
                } else {
                    i2 = i;
                }
                char c6 = 2;
                if (i2 > 1) {
                    getparamvalue.getWarnings = 0;
                    while (true) {
                        int i4 = getparamvalue.getWarnings;
                        if (i4 >= i2) {
                            break;
                        }
                        char c7 = cArr6[i4];
                        getparamvalue.get = c7;
                        char c8 = cArr6[i4 + 1];
                        getparamvalue.initialize = c8;
                        if (c7 == c8) {
                            cArr7[i4] = (char) (c7 - b);
                            cArr7[i4 + 1] = (char) (c8 - b);
                            $10 = ($11 + 79) % 128;
                            c = c6;
                        } else {
                            Object[] objArr7 = new Object[13];
                            objArr7[12] = getparamvalue;
                            objArr7[11] = Integer.valueOf(charValue);
                            objArr7[10] = getparamvalue;
                            objArr7[9] = getparamvalue;
                            objArr7[8] = Integer.valueOf(charValue);
                            objArr7[7] = getparamvalue;
                            objArr7[6] = getparamvalue;
                            objArr7[5] = Integer.valueOf(charValue);
                            objArr7[4] = getparamvalue;
                            objArr7[3] = getparamvalue;
                            objArr7[c6] = Integer.valueOf(charValue);
                            objArr7[1] = getparamvalue;
                            objArr7[0] = getparamvalue;
                            c = c6;
                            Map map3 = removeParam.visaSchemeConfiguration;
                            Object obj3 = map3.get(-1395483366);
                            if (obj3 != null) {
                                c2 = '\n';
                                c3 = '\t';
                                c5 = '\b';
                                method = obj3;
                                c4 = 7;
                            } else {
                                c2 = '\n';
                                c3 = '\t';
                                c4 = 7;
                                c5 = '\b';
                                Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 48, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 3221 - Gravity.getAbsoluteGravity(0, 0));
                                Object[] objArr8 = new Object[1];
                                b(0, (short) 1, 0, objArr8);
                                String str2 = (String) objArr8[0];
                                Class cls5 = Integer.TYPE;
                                method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                                map3.put(-1395483366, method);
                            }
                            int intValue3 = ((Integer) ((Method) method).invoke(null, objArr7)).intValue();
                            int i5 = getparamvalue.cleanup;
                            if (intValue3 == i5) {
                                $11 = ($10 + 65) % 128;
                                Object[] objArr9 = new Object[11];
                                objArr9[c2] = getparamvalue;
                                objArr9[c3] = Integer.valueOf(charValue);
                                objArr9[c5] = getparamvalue;
                                objArr9[c4] = Integer.valueOf(charValue);
                                objArr9[6] = Integer.valueOf(charValue);
                                objArr9[5] = getparamvalue;
                                objArr9[4] = getparamvalue;
                                objArr9[3] = Integer.valueOf(charValue);
                                objArr9[c] = Integer.valueOf(charValue);
                                objArr9[1] = getparamvalue;
                                objArr9[0] = getparamvalue;
                                Object obj4 = map3.get(1507360409);
                                if (obj4 == null) {
                                    Class cls6 = (Class) removeParam.initialize((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47, (char) (25644 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 11489 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    Class cls7 = Integer.TYPE;
                                    obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                                    map3.put(1507360409, obj4);
                                }
                                int intValue4 = ((Integer) ((Method) obj4).invoke(null, objArr9)).intValue();
                                int i6 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                                int i7 = getparamvalue.getWarnings;
                                cArr7[i7] = cArr4[intValue4];
                                cArr7[i7 + 1] = cArr4[i6];
                            } else {
                                int i8 = getparamvalue.ThreeDS2Service;
                                int i9 = getparamvalue.ThreeDS2ServiceInstance;
                                if (i8 == i9) {
                                    $11 = ($10 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                    int m = Thread$State$EnumUnboxingLocalUtility.m(getparamvalue.ThreeDS2ServiceInitializationCallback, charValue, 1, charValue);
                                    getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                                    int m2 = Thread$State$EnumUnboxingLocalUtility.m(i5, charValue, 1, charValue);
                                    getparamvalue.cleanup = m2;
                                    int i10 = (i9 * charValue) + m2;
                                    int i11 = getparamvalue.getWarnings;
                                    cArr7[i11] = cArr4[(i8 * charValue) + m];
                                    cArr7[i11 + 1] = cArr4[i10];
                                } else {
                                    int i12 = (i8 * charValue) + i5;
                                    int i13 = (i9 * charValue) + getparamvalue.ThreeDS2ServiceInitializationCallback;
                                    int i14 = getparamvalue.getWarnings;
                                    cArr7[i14] = cArr4[i12];
                                    cArr7[i14 + 1] = cArr4[i13];
                                    getparamvalue.getWarnings += 2;
                                    c6 = c;
                                }
                            }
                        }
                        getparamvalue.getWarnings += 2;
                        c6 = c;
                    }
                }
                int i15 = 0;
                while (i15 < i) {
                    int i16 = $11 + 39;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        cArr7[i15] = (char) (cArr7[i15] ^ 17224);
                        i15 += 29;
                    } else {
                        cArr7[i15] = (char) (cArr7[i15] ^ 13722);
                        i15++;
                    }
                }
                objArr2[0] = new String(cArr7);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(int i, short s, int i2, Object[] objArr2) {
                int i3;
                int i4 = i * 4;
                byte[] bArr = $$a;
                int i5 = (i2 * 4) + 4;
                int i6 = 119 - (s * 2);
                byte[] bArr2 = new byte[i4 + 1];
                if (bArr == null) {
                    int i7 = i6;
                    int i8 = 0;
                    i6 = i4;
                    i5++;
                    i6 += i7;
                    i3 = i8;
                    bArr2[i3] = (byte) i6;
                    i8 = i3 + 1;
                    if (i3 == i4) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    i7 = bArr[i5];
                    i5++;
                    i6 += i7;
                    i3 = i8;
                    bArr2[i3] = (byte) i6;
                    i8 = i3 + 1;
                    if (i3 == i4) {
                    }
                } else {
                    i3 = 0;
                    bArr2[i3] = (byte) i6;
                    i8 = i3 + 1;
                    if (i3 == i4) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{105, -80, 28, 44};
                $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public findFragmentById get(nq nqVar, String str, boolean z) {
                int i = ThreeDS2ServiceInitializationCallback + 29;
                ThreeDS2ServiceInstance = i % 128;
                if (i % 2 != 0) {
                    nqVar.ThreeDS2ServiceInitializationCallback(str).getWarnings();
                    throw null;
                }
                ns ThreeDS2ServiceInitializationCallback2 = nqVar.ThreeDS2ServiceInitializationCallback(str);
                if (ThreeDS2ServiceInitializationCallback2.getWarnings() >= intValue) {
                    int i2 = ThreeDS2ServiceInstance + 33;
                    ThreeDS2ServiceInitializationCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        ThreeDS2ServiceInitializationCallback2.getWarnings();
                        throw null;
                    }
                    if (ThreeDS2ServiceInitializationCallback2.getWarnings() <= intValue2) {
                        return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                    }
                }
                setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                Object[] objArr2 = new Object[1];
                a((byte) (104 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1))), "\u0014\u0016!\u0017\u0006\u000b\u0004\u0006 \u001d\t\u0003\u001a\u0012\u001b\u0014㙐㙐\u0017\u001b\u0018 \r\u001a\u001e\u0004 \u0002\u0004\n\u0014\t!\b\u000e\u001d\u0014\f\u001c\u001f\b\u001b\t\u0003\u001a\u0012 \u0002\u0004\u0006\u0006\u001d\b\u0018\u000e\u0006\u000e\u0014\"\u0010\u0007\u000f\u001b\u0002\u001e\u001b\u001c\u0014\u001b \u001a\u0012 \u0002\u0004\u0006\u0006\u001d", 78 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
                findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(((String) objArr2[0]).intern(), str, Integer.valueOf(ThreeDS2ServiceInitializationCallback2.getWarnings()), Integer.valueOf(intValue), Integer.valueOf(intValue2)))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                int i3 = ThreeDS2ServiceInitializationCallback + 9;
                ThreeDS2ServiceInstance = i3 % 128;
                if (i3 % 2 == 0) {
                    return findfragmentbyid;
                }
                throw null;
            }
        };
        int i = ThreeDS2ServiceInstance;
        int i2 = (i ^ 85) + ((i & 85) << 1);
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            return compareto;
        }
        throw null;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i4 | (~(i5 | i6));
        int i8 = ~(i | i2);
        switch ((((~(i | i6)) | (~(i2 | i5))) * 722) + (((~(i3 | i2)) | (~(i | i3)) | i8) * (-1444)) + ((i7 | i8) * 1444) + (i2 * (-721)) + (i * (-721))) {
            case 1:
                return getWarnings(objArr);
            case 2:
                return ThreeDS2Service(objArr);
            case 3:
                return ThreeDS2ServiceInstance(objArr);
            case 4:
                return initialize(objArr);
            case 5:
                final String[] strArr = (String[]) objArr[0];
                compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.12
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static long get;
                    private static int getWarnings;
                    private static int initialize;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        initialize = 0;
                        getWarnings = 1;
                        get = -1976504503302864643L;
                    }

                    private static void a(String str, int i9, Object[] objArr2) {
                        char[] cArr;
                        $10 = ($11 + 15) % 128;
                        if (str != null) {
                            cArr = str.toCharArray();
                            $10 = ($11 + 37) % 128;
                        } else {
                            cArr = str;
                        }
                        onCompleted oncompleted = new onCompleted();
                        char[] initialize2 = onCompleted.initialize(get ^ (-2776494906517314268L), cArr, i9);
                        oncompleted.initialize = 4;
                        while (true) {
                            int i10 = oncompleted.initialize;
                            if (i10 >= initialize2.length) {
                                objArr2[0] = new String(initialize2, 4, initialize2.length - 4);
                                return;
                            }
                            $10 = ($11 + 3) % 128;
                            int i11 = i10 - 4;
                            oncompleted.ThreeDS2Service = i11;
                            try {
                                Object[] objArr3 = {Long.valueOf(initialize2[i10] ^ initialize2[i10 % 4]), Long.valueOf(i11), Long.valueOf(get)};
                                Map map = removeParam.visaSchemeConfiguration;
                                Object obj = map.get(-1242395160);
                                if (obj == null) {
                                    Class cls = (Class) removeParam.initialize((ViewConfiguration.getLongPressTimeout() >> 16) + 48, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 27780), 2440 - TextUtils.lastIndexOf("", '0', 0, 0));
                                    Object[] objArr4 = new Object[1];
                                    b((byte) 0, 0, (short) 0, objArr4);
                                    String str2 = (String) objArr4[0];
                                    Class cls2 = Long.TYPE;
                                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                                    map.put(-1242395160, obj);
                                }
                                initialize2[i10] = ((Character) ((Method) obj).invoke(null, objArr3)).charValue();
                                Object[] objArr5 = {oncompleted, oncompleted};
                                Object obj2 = map.get(1526822639);
                                if (obj2 == null) {
                                    obj2 = ((Class) removeParam.initialize((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 65, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 14235)).getMethod("s", Object.class, Object.class);
                                    map.put(1526822639, obj2);
                                }
                                ((Method) obj2).invoke(null, objArr5);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0030). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(byte b, int i9, short s, Object[] objArr2) {
                        int i10;
                        int i11 = 4 - (b * 2);
                        int i12 = i9 * 4;
                        int i13 = (s * 4) + 112;
                        byte[] bArr = $$a;
                        byte[] bArr2 = new byte[i12 + 1];
                        if (bArr == null) {
                            byte[] bArr3 = bArr;
                            int i14 = 0;
                            int i15 = i13;
                            int i16 = i11;
                            int i17 = i16 + 1;
                            i13 = i11 + i15;
                            i11 = i17;
                            bArr = bArr3;
                            i10 = i14;
                            bArr2[i10] = (byte) i13;
                            if (i10 == i12) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            int i18 = i13;
                            i16 = i11;
                            i11 = bArr[i11];
                            i14 = i10 + 1;
                            bArr3 = bArr;
                            i15 = i18;
                            int i172 = i16 + 1;
                            i13 = i11 + i15;
                            i11 = i172;
                            bArr = bArr3;
                            i10 = i14;
                            bArr2[i10] = (byte) i13;
                            if (i10 == i12) {
                            }
                        } else {
                            i10 = 0;
                            bArr2[i10] = (byte) i13;
                            if (i10 == i12) {
                            }
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{125, 122, 65, -124};
                        $$b = EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public findFragmentById get(nq nqVar, String str, boolean z) {
                        Object[] objArr2 = new Object[1];
                        a("䊕䋼윰⊍㝉禱", 1 - View.getDefaultSize(0, 0), objArr2);
                        if (ne.get(strArr, nqVar.initialize(((String) objArr2[0]).intern()), z)) {
                            int i9 = initialize + 51;
                            getWarnings = i9 % 128;
                            if (i9 % 2 != 0) {
                                return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                            }
                            int i10 = 61 / 0;
                            return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                        }
                        Boolean sDKInfo = nqVar.getSDKInfo(str);
                        if (sDKInfo != null) {
                            initialize = (getWarnings + 57) % 128;
                            if (sDKInfo.booleanValue()) {
                                setTextAlignment settextalignment = setTextAlignment.getSDKTransactionID;
                                Object[] objArr3 = new Object[1];
                                a("僅傕둻凃루猨쨕篿쟌ⲛ\udb8a芟繿䕂䋉⩣隚ﶛ⤖뷊ഴዙ醊앚ꑣ譛砋汊\udcfe⎀\ue08b\uf782猐堵埧Ἶ\ueb8c\uf14e㹃ꚞȨ槰ꚺ칳륎鹣ആ儉퇻㛈\uf436\uf88f䠐꼹峹O\ue0b6쑋쌎ꯏៅ糦ꮧ㍸蹪锟ሉ娜⚥ද若\uedb6崀ꋐ懚畖\uf5a8\udb46", 1 - Gravity.getAbsoluteGravity(0, 0), objArr3);
                                return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, ((String) objArr3[0]).intern())}}, 695740153, -695740153, (int) System.currentTimeMillis());
                            }
                        }
                        findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                        initialize = (getWarnings + 101) % 128;
                        return findfragmentbyid;
                    }
                };
                int i9 = ThreeDS2ServiceInstance;
                initialize = ((i9 ^ 29) + ((i9 & 29) << 1)) % 128;
                return compareto;
            case 6:
                final Integer num = (Integer) objArr[0];
                final Integer num2 = (Integer) objArr[1];
                compareTo compareto2 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.20
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static long ThreeDS2Service;
                    private static int get;
                    private static int getWarnings;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        get = 0;
                        getWarnings = 1;
                        ThreeDS2Service = -4221171751191081634L;
                    }

                    private Map<String, String> ThreeDS2Service(nq nqVar, String str) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        ns ThreeDS2ServiceInitializationCallback = nqVar.ThreeDS2ServiceInitializationCallback(str);
                        for (int i10 = 0; i10 < ThreeDS2ServiceInitializationCallback.getWarnings(); i10++) {
                            Object ThreeDS2Service2 = ThreeDS2ServiceInitializationCallback.ThreeDS2Service(i10);
                            if (ThreeDS2Service2 instanceof String) {
                                int i11 = getWarnings + 47;
                                get = i11 % 128;
                                if (i11 % 2 != 0) {
                                    String str2 = (String) ThreeDS2Service2;
                                    linkedHashMap.put(str2, str2);
                                    int i12 = 93 / 0;
                                } else {
                                    String str3 = (String) ThreeDS2Service2;
                                    linkedHashMap.put(str3, str3);
                                }
                            } else if (ThreeDS2Service2 instanceof JSONObject) {
                                nq initialize2 = nq.initialize((JSONObject) ThreeDS2Service2);
                                Iterator<String> it = initialize2.get();
                                while (it.hasNext()) {
                                    int i13 = get + 7;
                                    getWarnings = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        String next = it.next();
                                        linkedHashMap.put(next, initialize2.initialize(next));
                                        throw null;
                                    }
                                    String next2 = it.next();
                                    linkedHashMap.put(next2, initialize2.initialize(next2));
                                }
                            } else {
                                continue;
                            }
                        }
                        return linkedHashMap;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:24:0x0163  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x0164  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void a(String str, int i10, Object[] objArr2) {
                        char[] cArr;
                        Throwable cause;
                        int i11;
                        byte b;
                        int i12;
                        if (str != null) {
                            $10 = ($11 + 95) % 128;
                            cArr = str.toCharArray();
                        } else {
                            cArr = str;
                        }
                        char[] cArr2 = cArr;
                        addParam addparam = new addParam();
                        addparam.initialize = i10;
                        int length = cArr2.length;
                        long[] jArr = new long[length];
                        byte b2 = 0;
                        addparam.ThreeDS2Service = 0;
                        while (true) {
                            int i13 = addparam.ThreeDS2Service;
                            if (i13 >= cArr2.length) {
                                break;
                            }
                            char c = cArr2[i13];
                            try {
                                Object[] objArr3 = new Object[3];
                                objArr3[2] = addparam;
                                objArr3[1] = addparam;
                                objArr3[b2] = Integer.valueOf(c);
                                Map map = removeParam.visaSchemeConfiguration;
                                Object obj = map.get(-983980093);
                                if (obj != null) {
                                    b = b2;
                                    i12 = 1;
                                    i11 = 62097;
                                } else {
                                    i11 = 62097;
                                    b = b2;
                                    i12 = 1;
                                    Method method = ((Class) removeParam.initialize((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 65, (char) Color.alpha((int) b), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12510)).getMethod("e", Integer.TYPE, Object.class, Object.class);
                                    map.put(-983980093, method);
                                    obj = method;
                                }
                                jArr[i13] = ((Long) ((Method) obj).invoke(null, objArr3)).longValue() ^ (ThreeDS2Service ^ 6009743645011411028L);
                                Object[] objArr4 = new Object[2];
                                objArr4[i12] = addparam;
                                objArr4[b] = addparam;
                                Object obj2 = map.get(-1840119381);
                                if (obj2 == null) {
                                    Class cls = (Class) removeParam.initialize(76 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (i11 - TextUtils.indexOf("", "")), 2102 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                    Object[] objArr5 = new Object[i12];
                                    byte b3 = b;
                                    b(b3, b3, b3, objArr5);
                                    obj2 = cls.getMethod((String) objArr5[b3], Object.class, Object.class);
                                    map.put(-1840119381, obj2);
                                }
                                ((Method) obj2).invoke(null, objArr4);
                                b2 = 0;
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
                        char[] cArr3 = new char[length];
                        addparam.ThreeDS2Service = 0;
                        $11 = ($10 + 29) % 128;
                        while (true) {
                            int i14 = addparam.ThreeDS2Service;
                            if (i14 >= cArr2.length) {
                                objArr2[0] = new String(cArr3);
                                return;
                            }
                            cArr3[i14] = (char) jArr[i14];
                            Object[] objArr6 = {addparam, addparam};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj3 = map2.get(-1840119381);
                            if (obj3 == null) {
                                Class cls2 = (Class) removeParam.initialize(76 - KeyEvent.keyCodeFromString(""), (char) (62097 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2102);
                                Object[] objArr7 = new Object[1];
                                b(0, (byte) 0, 0, objArr7);
                                obj3 = cls2.getMethod((String) objArr7[0], Object.class, Object.class);
                                map2.put(-1840119381, obj3);
                            }
                            ((Method) obj3).invoke(null, objArr6);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0032). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(int i10, byte b, int i11, Object[] objArr2) {
                        int i12;
                        byte[] bArr = $$a;
                        int i13 = 99 - (b * 4);
                        int i14 = i10 * 2;
                        int i15 = 3 - (i11 * 3);
                        byte[] bArr2 = new byte[1 - i14];
                        int i16 = 0 - i14;
                        if (bArr == null) {
                            byte[] bArr3 = bArr;
                            int i17 = 0;
                            int i18 = i15;
                            i13 = (-i13) + i15;
                            i15 = i18;
                            bArr = bArr3;
                            i12 = i17;
                            int i19 = i15 + 1;
                            bArr2[i12] = (byte) i13;
                            i17 = i12 + 1;
                            if (i12 == i16) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            byte b2 = bArr[i19];
                            i15 = i13;
                            i13 = b2;
                            bArr3 = bArr;
                            i18 = i19;
                            i13 = (-i13) + i15;
                            i15 = i18;
                            bArr = bArr3;
                            i12 = i17;
                            int i192 = i15 + 1;
                            bArr2[i12] = (byte) i13;
                            i17 = i12 + 1;
                            if (i12 == i16) {
                            }
                        } else {
                            i12 = 0;
                            int i1922 = i15 + 1;
                            bArr2[i12] = (byte) i13;
                            i17 = i12 + 1;
                            if (i12 == i16) {
                            }
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{PnmConstants.PPM_RAW_CODE, 91, 76, 65};
                        $$b = 200;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public findFragmentById get(nq nqVar, String str, boolean z) {
                        Throwable th;
                        int i10 = get + 75;
                        getWarnings = i10 % 128;
                        if (i10 % 2 == 0) {
                            ThreeDS2Service(nqVar, str).entrySet().iterator();
                            throw null;
                        }
                        findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                        for (Map.Entry<String, String> entry : ThreeDS2Service(nqVar, str).entrySet()) {
                            get = (getWarnings + 53) % 128;
                            int ThreeDS2ServiceInstance2 = oj.ThreeDS2ServiceInstance(entry.getValue());
                            if (ThreeDS2ServiceInstance2 > num2.intValue()) {
                                setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                                th = null;
                                Object[] objArr2 = new Object[1];
                                a("赚蹂謪萐臃芢龈魰鐰酛鋋꿬ꢕꑂꄔꈛ뿻룟떝녤눞켻죩엋욵쉿\udf48\ud879픓훗펧\uec98\ue84f\ue527\ue61d\ue3f5ﳠ劉\uf551\uf654\uf31a\u0cbbড়ઌ٨͘ᰠ᧥᪀៳ፓⰄ⤭⨪➀⃥㶳㥈㨴㜌ヷ䶣仄䨧䝪䀸嶽廂害", (ViewConfiguration.getJumpTapTimeout() >> 16) + 809, objArr2);
                                findfragmentbyid.get((findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(((String) objArr2[0]).intern(), str, num2, Integer.valueOf(ThreeDS2ServiceInstance2)))}}, 695740153, -695740153, (int) System.currentTimeMillis()));
                            } else {
                                th = null;
                            }
                            int length = entry.getKey().length();
                            Integer num3 = num;
                            if (num3 != null) {
                                int i11 = getWarnings + 35;
                                get = i11 % 128;
                                if (i11 % 2 != 0) {
                                    num3.intValue();
                                    throw th;
                                }
                                if (length > num3.intValue()) {
                                    setTextAlignment settextalignment2 = setTextAlignment.getSDKReferenceNumber;
                                    Object[] objArr3 = new Object[1];
                                    a("赚\ue546崢뗬ⷓ薎ﱰ呔찐Ⓙ鲓\uf4c0潥윞㽜韂྿枎\ude00㘱껫ە纳텵䥚ꅏ᧽燍\ue985䁶렩ဝ裏\ue0a3壞댍⬓菪ﯜ叱쩮≚騆\uf2e2櫂슋㔦굩ԡ網햳䶠ꐂᱻ琵\uecc2䒦뽺\u1759輹\ue7a6徉럌⹂虯︔囍", TextUtils.getOffsetAfter("", 0) + 26669, objArr3);
                                    findfragmentbyid.get((findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment2, str, String.format(((String) objArr3[0]).intern(), str, num, Integer.valueOf(length)))}}, 695740153, -695740153, (int) System.currentTimeMillis()));
                                }
                            }
                        }
                        if (!z || findfragmentbyid.get()) {
                            getWarnings = (get + 53) % 128;
                            return findfragmentbyid;
                        }
                        int i12 = getWarnings + 83;
                        get = i12 % 128;
                        if (i12 % 2 == 0) {
                            ((no) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 1464134729, -1464134714, (int) System.currentTimeMillis())).initialize(findfragmentbyid.toString());
                            return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                        }
                        ((no) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 1464134729, -1464134714, (int) System.currentTimeMillis())).initialize(findfragmentbyid.toString());
                        throw null;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public nq getWarnings(nq nqVar, String str, boolean z) {
                        Map<String, String> ThreeDS2Service2 = ThreeDS2Service(nqVar, str);
                        ns ThreeDS2Service3 = ns.ThreeDS2Service();
                        Iterator<Map.Entry<String, String>> it = ThreeDS2Service2.entrySet().iterator();
                        while (it.hasNext()) {
                            int i10 = get + 45;
                            getWarnings = i10 % 128;
                            if (i10 % 2 == 0) {
                                it.next().getValue();
                                throw null;
                            }
                            Map.Entry<String, String> next = it.next();
                            String value = next.getValue();
                            if (z) {
                                int i11 = getWarnings + 103;
                                get = i11 % 128;
                                if (i11 % 2 != 0) {
                                    oj.ThreeDS2ServiceInstance(next.getValue());
                                    num2.intValue();
                                    throw null;
                                }
                                if (oj.ThreeDS2ServiceInstance(next.getValue()) > num2.intValue()) {
                                    value = oj.ThreeDS2ServiceInstance(next.getValue(), num2.intValue());
                                }
                            }
                            nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
                            ThreeDS2ServiceInstance2.ThreeDS2Service(next.getKey(), value);
                            ThreeDS2Service3.ThreeDS2Service(ThreeDS2ServiceInstance2);
                        }
                        nqVar.ThreeDS2Service(str, ThreeDS2Service3);
                        return nqVar;
                    }
                };
                int i10 = ThreeDS2ServiceInstance;
                int i11 = i10 & 61;
                int i12 = (i10 | 61) & (~i11);
                int i13 = -(-(i11 << 1));
                initialize = ((i12 & i13) + (i12 | i13)) % 128;
                return compareto2;
            case 7:
                final String[] strArr2 = (String[]) objArr[0];
                compareTo compareto3 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.1
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static long ThreeDS2ServiceInstance;
                    private static int getWarnings;
                    private static int initialize;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        initialize = 0;
                        getWarnings = 1;
                        ThreeDS2ServiceInstance = 2512179390234060745L;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:25:0x0184  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0185  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void a(String str, int i14, Object[] objArr2) {
                        char[] cArr;
                        Throwable cause;
                        int i15;
                        int i16;
                        Object method;
                        int i17;
                        int i18 = $11 + 81;
                        $10 = i18 % 128;
                        char c = 2;
                        if (i18 % 2 != 0) {
                            throw null;
                        }
                        if (str != null) {
                            cArr = str.toCharArray();
                            $10 = ($11 + 47) % 128;
                        } else {
                            cArr = str;
                        }
                        char[] cArr2 = cArr;
                        addParam addparam = new addParam();
                        addparam.initialize = i14;
                        int length = cArr2.length;
                        long[] jArr = new long[length];
                        int i19 = 0;
                        addparam.ThreeDS2Service = 0;
                        while (true) {
                            int i20 = addparam.ThreeDS2Service;
                            if (i20 >= cArr2.length) {
                                break;
                            }
                            $10 = ($11 + 83) % 128;
                            char c2 = cArr2[i20];
                            try {
                                Object[] objArr3 = new Object[3];
                                objArr3[c] = addparam;
                                objArr3[1] = addparam;
                                objArr3[i19] = Integer.valueOf(c2);
                                Map map = removeParam.visaSchemeConfiguration;
                                Object obj = map.get(-983980093);
                                if (obj != null) {
                                    method = obj;
                                    i15 = 62097;
                                    i16 = 1;
                                } else {
                                    i15 = 62097;
                                    i16 = 1;
                                    method = ((Class) removeParam.initialize((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 65, (char) TextUtils.indexOf("", "", i19), View.resolveSizeAndState(i19, i19, i19) + 12511)).getMethod("e", Integer.TYPE, Object.class, Object.class);
                                    map.put(-983980093, method);
                                }
                                jArr[i20] = ((Long) ((Method) method).invoke(null, objArr3)).longValue() ^ (ThreeDS2ServiceInstance ^ 6009743645011411028L);
                                Object[] objArr4 = new Object[2];
                                objArr4[i16] = addparam;
                                objArr4[i19] = addparam;
                                Object obj2 = map.get(-1840119381);
                                if (obj2 != null) {
                                    i17 = i19;
                                } else {
                                    Class cls = (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 76, (char) (i15 - ExpandableListView.getPackedPositionGroup(0L)), 2102 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                    byte b = (byte) ($$a[i16] + 1);
                                    byte b2 = b;
                                    i17 = i19;
                                    Object[] objArr5 = new Object[i16];
                                    b(b, b2, b2, objArr5);
                                    obj2 = cls.getMethod((String) objArr5[i17], Object.class, Object.class);
                                    map.put(-1840119381, obj2);
                                }
                                ((Method) obj2).invoke(null, objArr4);
                                i19 = i17;
                                c = 2;
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
                        char[] cArr3 = new char[length];
                        addparam.ThreeDS2Service = i19;
                        while (true) {
                            int i21 = addparam.ThreeDS2Service;
                            if (i21 >= cArr2.length) {
                                objArr2[0] = new String(cArr3);
                                return;
                            }
                            cArr3[i21] = (char) jArr[i21];
                            Object[] objArr6 = {addparam, addparam};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj3 = map2.get(-1840119381);
                            if (obj3 == null) {
                                Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 76, (char) (62097 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 2101 - ExpandableListView.getPackedPositionChild(0L));
                                byte b3 = (byte) ($$a[1] + 1);
                                byte b4 = b3;
                                Object[] objArr7 = new Object[1];
                                b(b3, b4, b4, objArr7);
                                obj3 = cls2.getMethod((String) objArr7[0], Object.class, Object.class);
                                map2.put(-1840119381, obj3);
                            }
                            ((Method) obj3).invoke(null, objArr6);
                        }
                    }

                    private static void b(byte b, byte b2, byte b3, Object[] objArr2) {
                        int i14 = (b2 * 2) + 99;
                        byte[] bArr = $$a;
                        int i15 = (b3 * 3) + 4;
                        int i16 = b * 3;
                        byte[] bArr2 = new byte[i16 + 1];
                        int i17 = -1;
                        if (bArr == null) {
                            int i18 = i15 + i16;
                            i15++;
                            i14 = i18;
                        }
                        while (true) {
                            i17++;
                            bArr2[i17] = (byte) i14;
                            if (i17 == i16) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            int i19 = i15;
                            i15 = i19 + 1;
                            i14 += bArr[i15];
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{81, -1, 84, 11};
                        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public findFragmentById get(nq nqVar, String str, boolean z) {
                        int i14 = getWarnings + 31;
                        initialize = i14 % 128;
                        if (i14 % 2 != 0) {
                            oh.get(strArr2, (String) oj.getWarnings(nqVar.initialize(str), ""));
                            throw null;
                        }
                        String str2 = (String) oj.getWarnings(nqVar.initialize(str), "");
                        if (oh.get(strArr2, str2)) {
                            findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                            int i15 = initialize + 15;
                            getWarnings = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i16 = 8 / 0;
                            }
                            return findfragmentbyid;
                        }
                        setTextAlignment settextalignment = setTextAlignment.getId;
                        Object[] objArr2 = new Object[1];
                        a("柍쁅⢝郗樂Ⅵ覿\uf1f7娧舼\ueafc卋뭂\ue3a5䮣됣᱾䓴곱ᕉ綝ꖐฌ癫\udeb1ۤ漾흰㾁頉쁐⢙郘老ⅻ観\uf1fd娀芝\uead3匙뭉\ue3a2䯽둿\u1c38䓢괉ᕎ綑ꗏา癬\udeb4ڻ潔힄㿀頂쁛⢲邲拾⅁觸\uf217婲苘\uea99匁뭨\ue3a6䯠됽\u1c8b䒎괇ᕙ綯ꗿศ瘮\udeffܽ漌힃㿦", 42937 - Color.red(0), objArr2);
                        String intern = ((String) objArr2[0]).intern();
                        String[] strArr3 = strArr2;
                        Object[] objArr3 = new Object[1];
                        a("枱", 4481 - (Process.myPid() >> 22), objArr3);
                        return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(intern, str, oj.ThreeDS2Service(strArr3, ((String) objArr3[0]).intern()), str2))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                    }
                };
                int i14 = initialize;
                int i15 = (i14 & 2) + (i14 | 2);
                ThreeDS2ServiceInstance = ((i15 ^ (-1)) + (i15 << 1)) % 128;
                return compareto3;
            case 8:
                compareTo compareto4 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.19
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static long ThreeDS2ServiceInstance;
                    private static int get;
                    private static int getWarnings;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        getWarnings = 0;
                        get = 1;
                        ThreeDS2ServiceInstance = -5750734740498855416L;
                    }

                    private static void a(String str, int i16, Object[] objArr2) {
                        char[] cArr;
                        if (str != null) {
                            $10 = ($11 + 1) % 128;
                            cArr = str.toCharArray();
                        } else {
                            cArr = str;
                        }
                        onCompleted oncompleted = new onCompleted();
                        char[] initialize2 = onCompleted.initialize(ThreeDS2ServiceInstance ^ (-2776494906517314268L), cArr, i16);
                        oncompleted.initialize = 4;
                        while (true) {
                            int i17 = oncompleted.initialize;
                            if (i17 >= initialize2.length) {
                                objArr2[0] = new String(initialize2, 4, initialize2.length - 4);
                                return;
                            }
                            $11 = ($10 + 103) % 128;
                            int i18 = i17 - 4;
                            oncompleted.ThreeDS2Service = i18;
                            try {
                                Object[] objArr3 = {Long.valueOf(initialize2[i17] ^ initialize2[i17 % 4]), Long.valueOf(i18), Long.valueOf(ThreeDS2ServiceInstance)};
                                Map map = removeParam.visaSchemeConfiguration;
                                Object obj = map.get(-1242395160);
                                if (obj == null) {
                                    Class cls = (Class) removeParam.initialize(48 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (27781 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 2441 - View.MeasureSpec.getMode(0));
                                    Object[] objArr4 = new Object[1];
                                    b((short) 0, (short) -1, (short) 0, objArr4);
                                    String str2 = (String) objArr4[0];
                                    Class cls2 = Long.TYPE;
                                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                                    map.put(-1242395160, obj);
                                }
                                initialize2[i17] = ((Character) ((Method) obj).invoke(null, objArr3)).charValue();
                                Object[] objArr5 = {oncompleted, oncompleted};
                                Object obj2 = map.get(1526822639);
                                if (obj2 == null) {
                                    obj2 = ((Class) removeParam.initialize(66 - TextUtils.getOffsetAfter("", 0), (char) (Process.myPid() >> 22), 14235 - View.getDefaultSize(0, 0))).getMethod("s", Object.class, Object.class);
                                    map.put(1526822639, obj2);
                                }
                                ((Method) obj2).invoke(null, objArr5);
                                $11 = ($10 + 115) % 128;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                    }

                    private static void b(short s, short s2, short s3, Object[] objArr2) {
                        byte[] bArr = $$a;
                        int i16 = s2 + 4;
                        int i17 = s3 * 4;
                        int i18 = 112 - (s * 4);
                        byte[] bArr2 = new byte[i17 + 1];
                        int i19 = -1;
                        if (bArr == null) {
                            i18 = i17 + i16;
                            i16 = i16;
                            bArr = bArr;
                            i19 = -1;
                        }
                        while (true) {
                            int i20 = i16 + 1;
                            int i21 = i19 + 1;
                            bArr2[i21] = (byte) i18;
                            if (i21 == i17) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            byte[] bArr3 = bArr;
                            i18 += bArr[i20];
                            i16 = i20;
                            bArr = bArr3;
                            i19 = i21;
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{98, 104, -90, -34};
                        $$b = 59;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
                    
                        return r4;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
                    
                        throw null;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
                    
                        if (r5.createTransaction(r6) == false) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
                    
                        if (r4 == false) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:6:0x0081, code lost:
                    
                        return (com.netcetera.threeds.sdk.infrastructure.findFragmentById) com.netcetera.threeds.sdk.infrastructure.findFragmentById.initialize(new java.lang.Object[0], -2096046705, 2096046707, (int) java.lang.System.currentTimeMillis());
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
                    
                        r5 = com.netcetera.threeds.sdk.infrastructure.setTextAlignment.getSDKReferenceNumber;
                        r1 = new java.lang.Object[1];
                        a("섊ꑬ셚䬡ひ\uee58᧳퐖緗࿕ꬎ鎢렘쳀枑弲\uf769脍\u243aᨎ㎹䖠\ue104\ud9d8渎㫐뷛攧굠ｳ穅’\ue9fa돿㜸\uefcd⓯炣\uf3de", (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1, r1);
                        r4 = (com.netcetera.threeds.sdk.infrastructure.findFragmentById) com.netcetera.threeds.sdk.infrastructure.findFragmentById.initialize(new java.lang.Object[]{new com.netcetera.threeds.sdk.infrastructure.computeValue[]{new com.netcetera.threeds.sdk.infrastructure.computeValue(r5, r6, java.lang.String.format(((java.lang.String) r1[0]).intern(), r6))}}, 695740153, -695740153, (int) java.lang.System.currentTimeMillis());
                        r5 = com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.AnonymousClass19.get + 47;
                        com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.AnonymousClass19.getWarnings = r5 % 128;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
                    
                        if ((r5 % 2) != 0) goto L12;
                     */
                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public findFragmentById get(nq nqVar, String str, boolean z) {
                        int i16 = get + 43;
                        getWarnings = i16 % 128;
                        if (i16 % 2 != 0) {
                            boolean createTransaction = nqVar.createTransaction(str);
                            int i17 = 93 / 0;
                        }
                    }
                };
                int i16 = initialize;
                int i17 = i16 & 83;
                int i18 = (i16 ^ 83) | i17;
                ThreeDS2ServiceInstance = ((i17 & i18) + (i18 | i17)) % 128;
                return compareto4;
            case 9:
                final String str = (String) objArr[0];
                final String str2 = (String) objArr[1];
                compareTo compareto5 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.23
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static char[] get;
                    private static int getSDKInfo;
                    private static long getWarnings;
                    private static int initialize;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        initialize = 0;
                        getSDKInfo = 1;
                        get = new char[]{35176, 8061, 42242, 19253, 53701, 26601, 3476, 37793, 14442, 52828, 21515, 64145, 33019, 5809, 48352, 17741, 60171, 29052, 2014, 44539, 13212, 55788, 28233, 62570, 39544, 8392, 46840, 23697, 58088, 35661, 4451, 42759, 19933, 54252, 31108, 4017, 37964, 14892, 49170, 22053, 64758, 33435, 10421, 45332, 18259, 60745, 29491, 6532, 45013, 13820, 55829, 24679, 63029, 40034, 8832, 51414, 24253, 59231, 36213, 4893, 47422, 20425, 54756, 31684, 'c', 38457, 15363, 49673};
                        getWarnings = -1606196928817127652L;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:28:0x019f  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x01a0  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void a(int i19, int i20, char c, Object[] objArr2) {
                        Throwable cause;
                        long[] jArr;
                        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
                        long[] jArr2 = new long[i19];
                        threeDS2ServiceInitializationCallback.initialize = 0;
                        while (true) {
                            int i21 = threeDS2ServiceInitializationCallback.initialize;
                            if (i21 >= i19) {
                                break;
                            }
                            try {
                                Object[] objArr3 = {Integer.valueOf(get[i20 + i21])};
                                Map map = removeParam.visaSchemeConfiguration;
                                Object obj = map.get(-54653524);
                                Class cls = Integer.TYPE;
                                if (obj != null) {
                                    jArr = jArr2;
                                } else {
                                    jArr = jArr2;
                                    Class cls2 = (Class) removeParam.initialize(Drawable.resolveOpacity(0, 0) + 48, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0, 0) + 3222);
                                    Object[] objArr4 = new Object[1];
                                    b((short) 0, 0, 1, objArr4);
                                    obj = cls2.getMethod((String) objArr4[0], cls);
                                    map.put(-54653524, obj);
                                }
                                Long l = (Long) ((Method) obj).invoke(null, objArr3);
                                l.longValue();
                                Object[] objArr5 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(getWarnings), Integer.valueOf(c)};
                                Object obj2 = map.get(1319531906);
                                if (obj2 == null) {
                                    Class cls3 = (Class) removeParam.initialize(View.MeasureSpec.makeMeasureSpec(0, 0) + 69, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 50704), TextUtils.getCapsMode("", 0, 0) + 7789);
                                    Class cls4 = Long.TYPE;
                                    obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                                    map.put(1319531906, obj2);
                                }
                                jArr[i21] = ((Long) ((Method) obj2).invoke(null, objArr5)).longValue();
                                Object[] objArr6 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                                Object obj3 = map.get(1724349229);
                                if (obj3 == null) {
                                    Class cls5 = (Class) removeParam.initialize(48 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (27780 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 2441 - TextUtils.getCapsMode("", 0, 0));
                                    Object[] objArr7 = new Object[1];
                                    b((short) 0, 0, 0, objArr7);
                                    obj3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                                    map.put(1724349229, obj3);
                                }
                                ((Method) obj3).invoke(null, objArr6);
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
                        char[] cArr = new char[i19];
                        threeDS2ServiceInitializationCallback.initialize = 0;
                        while (true) {
                            int i22 = threeDS2ServiceInitializationCallback.initialize;
                            if (i22 >= i19) {
                                String str3 = new String(cArr);
                                $11 = ($10 + 119) % 128;
                                objArr2[0] = str3;
                                return;
                            }
                            $10 = ($11 + 43) % 128;
                            cArr[i22] = (char) jArr3[i22];
                            Object[] objArr8 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj4 = map2.get(1724349229);
                            if (obj4 == null) {
                                Class cls6 = (Class) removeParam.initialize((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 48, (char) (Color.green(0) + 27780), 2441 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                Object[] objArr9 = new Object[1];
                                b((short) 0, 0, 0, objArr9);
                                obj4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                                map2.put(1724349229, obj4);
                            }
                            ((Method) obj4).invoke(null, objArr8);
                        }
                    }

                    private static void b(short s, int i19, int i20, Object[] objArr2) {
                        int i21 = i19 * 4;
                        int i22 = (s * 2) + 4;
                        int i23 = (i20 * 3) + 97;
                        byte[] bArr = $$a;
                        byte[] bArr2 = new byte[1 - i21];
                        int i24 = 0 - i21;
                        int i25 = -1;
                        if (bArr == null) {
                            i22++;
                            i23 += i24;
                        }
                        while (true) {
                            i25++;
                            bArr2[i25] = (byte) i23;
                            if (i25 == i24) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            } else {
                                byte b = bArr[i22];
                                i22++;
                                i23 += b;
                            }
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{78, -37, -92, -118};
                        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public findFragmentById get(nq nqVar, String str3, boolean z) {
                        int i19 = getSDKInfo + 75;
                        initialize = i19 % 128;
                        if (i19 % 2 != 0) {
                            ((Boolean) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{(String) oj.getWarnings(nqVar.initialize(str3), ""), str, str2, Boolean.valueOf(z)}, 846007254, -846007250, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        String str4 = (String) oj.getWarnings(nqVar.initialize(str3), "");
                        if (((Boolean) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{str4, str, str2, Boolean.valueOf(z)}, 846007254, -846007250, (int) System.currentTimeMillis())).booleanValue()) {
                            return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                        }
                        setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                        Object[] objArr2 = new Object[1];
                        a(TextUtils.getTrimmedLength("") + 68, ViewConfiguration.getEdgeSlop() >> 16, (char) (1 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr2);
                        findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str3, String.format(((String) objArr2[0]).intern(), str3, str, str2, str4))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                        int i20 = initialize + 59;
                        getSDKInfo = i20 % 128;
                        if (i20 % 2 != 0) {
                            return findfragmentbyid;
                        }
                        throw null;
                    }
                };
                int i19 = ThreeDS2ServiceInstance + 38;
                initialize = ((i19 ^ (-1)) + (i19 << 1)) % 128;
                return compareto5;
            case 10:
                final setCacheColorHint.getWarnings getwarnings = (setCacheColorHint.getWarnings) objArr[0];
                compareTo compareto6 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.4
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static int ThreeDS2Service;
                    private static long ThreeDS2ServiceInstance;
                    private static int get;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        get = 0;
                        ThreeDS2Service = 1;
                        ThreeDS2ServiceInstance = -4994495248834835609L;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0157  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void a(String str3, int i20, Object[] objArr2) {
                        Throwable cause;
                        int i21;
                        byte b;
                        int i22 = $10 + 119;
                        $11 = i22 % 128;
                        if (i22 % 2 == 0) {
                            throw null;
                        }
                        char[] charArray = str3 != null ? str3.toCharArray() : str3;
                        addParam addparam = new addParam();
                        addparam.initialize = i20;
                        int length = charArray.length;
                        long[] jArr = new long[length];
                        byte b2 = 0;
                        addparam.ThreeDS2Service = 0;
                        while (true) {
                            int i23 = addparam.ThreeDS2Service;
                            if (i23 >= charArray.length) {
                                break;
                            }
                            char c = charArray[i23];
                            try {
                                Object[] objArr3 = new Object[3];
                                objArr3[2] = addparam;
                                objArr3[1] = addparam;
                                objArr3[b2] = Integer.valueOf(c);
                                Map map = removeParam.visaSchemeConfiguration;
                                Object obj = map.get(-983980093);
                                if (obj != null) {
                                    b = b2;
                                    i21 = 1;
                                } else {
                                    i21 = 1;
                                    b = b2;
                                    obj = ((Class) removeParam.initialize(TextUtils.indexOf("", "", b2) + 66, (char) KeyEvent.keyCodeFromString(""), 12511 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("e", Integer.TYPE, Object.class, Object.class);
                                    map.put(-983980093, obj);
                                }
                                jArr[i23] = ((Long) ((Method) obj).invoke(null, objArr3)).longValue() ^ (ThreeDS2ServiceInstance ^ 6009743645011411028L);
                                Object[] objArr4 = new Object[2];
                                objArr4[i21] = addparam;
                                objArr4[b] = addparam;
                                Object obj2 = map.get(-1840119381);
                                if (obj2 == null) {
                                    byte b3 = b;
                                    Class cls = (Class) removeParam.initialize('|' - AndroidCharacter.getMirror('0'), (char) (62097 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 2102 - TextUtils.indexOf("", "", b3, b3));
                                    Object[] objArr5 = new Object[i21];
                                    b(b3, b3, b3, objArr5);
                                    obj2 = cls.getMethod((String) objArr5[b3], Object.class, Object.class);
                                    map.put(-1840119381, obj2);
                                }
                                ((Method) obj2).invoke(null, objArr4);
                                b2 = 0;
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
                        char[] cArr = new char[length];
                        addparam.ThreeDS2Service = 0;
                        while (true) {
                            int i24 = addparam.ThreeDS2Service;
                            if (i24 >= charArray.length) {
                                break;
                            }
                            cArr[i24] = (char) jArr[i24];
                            Object[] objArr6 = {addparam, addparam};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj3 = map2.get(-1840119381);
                            if (obj3 == null) {
                                Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getTapTimeout() >> 16) + 76, (char) (View.MeasureSpec.getMode(0) + 62097), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2102);
                                Object[] objArr7 = new Object[1];
                                b(0, (byte) 0, (byte) 0, objArr7);
                                obj3 = cls2.getMethod((String) objArr7[0], Object.class, Object.class);
                                map2.put(-1840119381, obj3);
                            }
                            ((Method) obj3).invoke(null, objArr6);
                        }
                        String str4 = new String(cArr);
                        int i25 = $11 + 33;
                        $10 = i25 % 128;
                        if (i25 % 2 == 0) {
                            objArr2[0] = str4;
                        } else {
                            int i26 = 72 / 0;
                            objArr2[0] = str4;
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(int i20, byte b, byte b2, Object[] objArr2) {
                        int i21;
                        int i22 = (i20 * 4) + 4;
                        int i23 = b2 * 4;
                        int i24 = (b * 2) + 99;
                        byte[] bArr = $$a;
                        byte[] bArr2 = new byte[i23 + 1];
                        if (bArr == null) {
                            int i25 = i23;
                            i21 = 0;
                            i22++;
                            i24 += -i25;
                            bArr2[i21] = (byte) i24;
                            if (i21 == i23) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            i21++;
                            i25 = bArr[i22];
                            i22++;
                            i24 += -i25;
                            bArr2[i21] = (byte) i24;
                            if (i21 == i23) {
                            }
                        } else {
                            i21 = 0;
                            bArr2[i21] = (byte) i24;
                            if (i21 == i23) {
                            }
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{69, 111, 44, 110};
                        $$b = EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public findFragmentById get(nq nqVar, String str3, boolean z) {
                        get = (ThreeDS2Service + 119) % 128;
                        String str4 = (String) oj.getWarnings(nqVar.initialize(str3), "");
                        if (oj.initialize((CharSequence) str4, (CharSequence) setCacheColorHint.getWarnings.this.getWarnings())) {
                            return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                        }
                        setTextAlignment settextalignment = setTextAlignment.getSDKAppID;
                        Object[] objArr2 = new Object[1];
                        a("쭣\ue4b5钏䓧瓂ⓕ퐭萇둹搌ᑮ엻\uf594ꗕ喱ד㔰\ue544镣䕹畋⛠회蚃뛮曝ᘩ왎\uf603ꙷ嘁\u07be㞻\ue791鞽䟔眪✳휜蝫띝悩Ⴑ샞\uf0f1ꃉ僝/〆\ue02a逍䁳熧←퇬臱뇏愹ᄁ섮\uf14cꄝ劲ʷ㋟\ue2b4鋯䈣爌∕퉰艔뎮授Ꮥ쏅\uf382ꌻ匌", 12264 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
                        findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str3, String.format(((String) objArr2[0]).intern(), str3, setCacheColorHint.getWarnings.this.getWarnings(), str4))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                        int i20 = get + 51;
                        ThreeDS2Service = i20 % 128;
                        if (i20 % 2 == 0) {
                            int i21 = 63 / 0;
                        }
                        return findfragmentbyid;
                    }
                };
                int i20 = initialize;
                int i21 = i20 & 33;
                int i22 = -(-((i20 ^ 33) | i21));
                ThreeDS2ServiceInstance = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
                return compareto6;
            case 11:
                Integer num3 = (Integer) objArr[0];
                int i23 = initialize;
                ThreeDS2ServiceInstance = Thread$State$EnumUnboxingLocalUtility.m(i23 ^ 84, (i23 & 84) << 1, 1, 128);
                compareTo compareto7 = (compareTo) ThreeDS2ServiceInstance(new Object[]{null, num3}, -735320945, 735320951, (int) System.currentTimeMillis());
                int i24 = ThreeDS2ServiceInstance;
                int i25 = i24 & 65;
                initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i24 ^ 65) | i25) << 1, ~(-((i24 | 65) & (~i25))), 1, 128);
                return compareto7;
            case 12:
                return getSDKInfo(objArr);
            case 13:
                return ThreeDS2ServiceInitializationCallback(objArr);
            case 14:
                return cleanup(objArr);
            case 15:
                return createTransaction(objArr);
            case 16:
                return getSDKVersion(objArr);
            case 17:
                compareTo compareto8 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.18
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static long ThreeDS2Service;
                    private static char[] ThreeDS2ServiceInstance;
                    private static int get;
                    private static int getWarnings;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        getWarnings = 0;
                        get = 1;
                        ThreeDS2ServiceInstance = new char[]{35176, 59757, 18722, 43461, 2437, 26713, 51316, 10289, 35050, 59596, 19307, 43809, 2875, 27585, 52160, 10845, 35339, 60012, 19198, 43659, 3420, 27996, 52513, 11700, 36242, 60543, 19519, 44042, 3240, 27805, 53074, 12038, 36825, 61429};
                        ThreeDS2Service = -6662084565775554292L;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:30:0x02d5  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x02d6  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void a(int i26, int i27, char c, Object[] objArr2) {
                        Throwable cause;
                        long[] jArr;
                        Object method;
                        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
                        long[] jArr2 = new long[i26];
                        int i28 = 0;
                        threeDS2ServiceInitializationCallback.initialize = 0;
                        while (true) {
                            int i29 = threeDS2ServiceInitializationCallback.initialize;
                            if (i29 >= i26) {
                                break;
                            }
                            int i30 = $10 + 39;
                            $11 = i30 % 128;
                            int i31 = i30 % 2;
                            Class cls = Long.TYPE;
                            Class cls2 = Integer.TYPE;
                            if (i31 == 0) {
                                try {
                                    Object[] objArr3 = {Integer.valueOf(ThreeDS2ServiceInstance[i27 / i29])};
                                    Map map = removeParam.visaSchemeConfiguration;
                                    Object obj = map.get(-54653524);
                                    if (obj != null) {
                                        jArr = jArr2;
                                        method = obj;
                                    } else {
                                        jArr = jArr2;
                                        Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47, (char) (TextUtils.lastIndexOf("", '0', i28, i28) + 1), 3222 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                        Object[] objArr4 = new Object[1];
                                        b((byte) 0, 0, (byte) 0, objArr4);
                                        method = cls3.getMethod((String) objArr4[0], cls2);
                                        map.put(-54653524, method);
                                    }
                                    Long l = (Long) ((Method) method).invoke(null, objArr3);
                                    l.longValue();
                                    Object[] objArr5 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(ThreeDS2Service), Integer.valueOf(c)};
                                    Object obj2 = map.get(1319531906);
                                    if (obj2 == null) {
                                        obj2 = ((Class) removeParam.initialize((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 69, (char) (TextUtils.lastIndexOf("", '0', 0) + 50705), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7789)).getMethod("b", cls, cls, cls, cls2);
                                        map.put(1319531906, obj2);
                                    }
                                    jArr[i29] = ((Long) ((Method) obj2).invoke(null, objArr5)).longValue();
                                    Object[] objArr6 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                                    Object obj3 = map.get(1724349229);
                                    if (obj3 == null) {
                                        Class cls4 = (Class) removeParam.initialize(48 - KeyEvent.normalizeMetaState(0), (char) (27779 - TextUtils.indexOf((CharSequence) "", '0', 0)), 2441 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                        Object[] objArr7 = new Object[1];
                                        b((byte) 0, 0, (byte) 1, objArr7);
                                        obj3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                                        map.put(1724349229, obj3);
                                    }
                                    ((Method) obj3).invoke(null, objArr6);
                                } catch (Throwable th) {
                                    cause = th.getCause();
                                    if (cause != null) {
                                    }
                                }
                            } else {
                                jArr = jArr2;
                                Object[] objArr8 = {Integer.valueOf(ThreeDS2ServiceInstance[i27 + i29])};
                                Map map2 = removeParam.visaSchemeConfiguration;
                                Object obj4 = map2.get(-54653524);
                                if (obj4 == null) {
                                    Class cls5 = (Class) removeParam.initialize(MotionEvent.axisFromString("") + 49, (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3221);
                                    Object[] objArr9 = new Object[1];
                                    b((byte) 0, 0, (byte) 0, objArr9);
                                    obj4 = cls5.getMethod((String) objArr9[0], cls2);
                                    map2.put(-54653524, obj4);
                                }
                                Long l2 = (Long) ((Method) obj4).invoke(null, objArr8);
                                l2.longValue();
                                Object[] objArr10 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(ThreeDS2Service), Integer.valueOf(c)};
                                Object obj5 = map2.get(1319531906);
                                if (obj5 == null) {
                                    obj5 = ((Class) removeParam.initialize(69 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (50704 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (Process.myTid() >> 22) + 7789)).getMethod("b", cls, cls, cls, cls2);
                                    map2.put(1319531906, obj5);
                                }
                                jArr[i29] = ((Long) ((Method) obj5).invoke(null, objArr10)).longValue();
                                Object[] objArr11 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                                Object obj6 = map2.get(1724349229);
                                if (obj6 == null) {
                                    Class cls6 = (Class) removeParam.initialize(Color.blue(0) + 48, (char) (27781 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 2441 - TextUtils.getTrimmedLength(""));
                                    Object[] objArr12 = new Object[1];
                                    b((byte) 0, 0, (byte) 1, objArr12);
                                    obj6 = cls6.getMethod((String) objArr12[0], Object.class, Object.class);
                                    map2.put(1724349229, obj6);
                                }
                                ((Method) obj6).invoke(null, objArr11);
                            }
                            jArr2 = jArr;
                            i28 = 0;
                            cause = th.getCause();
                            if (cause != null) {
                                throw th;
                            }
                            throw cause;
                        }
                        long[] jArr3 = jArr2;
                        char[] cArr = new char[i26];
                        threeDS2ServiceInitializationCallback.initialize = 0;
                        while (true) {
                            int i32 = threeDS2ServiceInitializationCallback.initialize;
                            if (i32 >= i26) {
                                break;
                            }
                            cArr[i32] = (char) jArr3[i32];
                            Object[] objArr13 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                            Map map3 = removeParam.visaSchemeConfiguration;
                            Object obj7 = map3.get(1724349229);
                            if (obj7 == null) {
                                Class cls7 = (Class) removeParam.initialize(48 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27780), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2440);
                                Object[] objArr14 = new Object[1];
                                b((byte) 0, 0, (byte) 1, objArr14);
                                obj7 = cls7.getMethod((String) objArr14[0], Object.class, Object.class);
                                map3.put(1724349229, obj7);
                            }
                            ((Method) obj7).invoke(null, objArr13);
                            $11 = ($10 + 97) % 128;
                        }
                        String str3 = new String(cArr);
                        int i33 = $11 + 51;
                        $10 = i33 % 128;
                        if (i33 % 2 == 0) {
                            objArr2[0] = str3;
                        } else {
                            int i34 = 52 / 0;
                            objArr2[0] = str3;
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(byte b, int i26, byte b2, Object[] objArr2) {
                        int i27;
                        int i28;
                        int i29 = (i26 * 2) + 1;
                        int i30 = (b * 2) + 4;
                        int i31 = 100 - (b2 * 3);
                        byte[] bArr = $$a;
                        byte[] bArr2 = new byte[i29];
                        if (bArr == null) {
                            byte[] bArr3 = bArr;
                            int i32 = 0;
                            int i33 = i29;
                            i30++;
                            i31 = (-i31) + i33;
                            bArr = bArr3;
                            i27 = i32;
                            bArr2[i27] = (byte) i31;
                            i28 = i27 + 1;
                            if (i28 == i29) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            byte b3 = bArr[i30];
                            byte[] bArr4 = bArr;
                            i33 = i31;
                            i31 = b3;
                            i32 = i28;
                            bArr3 = bArr4;
                            i30++;
                            i31 = (-i31) + i33;
                            bArr = bArr3;
                            i27 = i32;
                            bArr2[i27] = (byte) i31;
                            i28 = i27 + 1;
                            if (i28 == i29) {
                            }
                        } else {
                            i27 = 0;
                            bArr2[i27] = (byte) i31;
                            i28 = i27 + 1;
                            if (i28 == i29) {
                            }
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{123, -14, -98, 14};
                        $$b = EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public findFragmentById get(nq nqVar, String str3, boolean z) {
                        if (nqVar.addParam(str3)) {
                            findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                            int i26 = getWarnings + 75;
                            get = i26 % 128;
                            if (i26 % 2 != 0) {
                                return findfragmentbyid;
                            }
                            throw null;
                        }
                        setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                        Object[] objArr2 = new Object[1];
                        a((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 34, Process.getGidForName("") + 1, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                        findFragmentById findfragmentbyid2 = (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str3, String.format(((String) objArr2[0]).intern(), str3))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                        int i27 = get + 5;
                        getWarnings = i27 % 128;
                        if (i27 % 2 == 0) {
                            return findfragmentbyid2;
                        }
                        throw null;
                    }
                };
                int i26 = ThreeDS2ServiceInstance;
                initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1((i26 & (-50)) | ((~i26) & 49), ~(-(-((i26 & 49) << 1))), 1, 128);
                return compareto8;
            case 18:
                final String str3 = (String) objArr[0];
                final String str4 = (String) objArr[1];
                compareTo compareto9 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.6
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static int ThreeDS2ServiceInitializationCallback;
                    private static char[] ThreeDS2ServiceInstance;
                    private static boolean get;
                    private static boolean getSDKInfo;
                    private static int getSDKVersion;
                    private static int initialize;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        getSDKVersion = 0;
                        ThreeDS2ServiceInitializationCallback = 1;
                        ThreeDS2ServiceInstance = new char[]{15062, 15013, 15028, 15025, 15033, 14986, 15078, 15011, 15097, 14987, 15009, 15037, 15024, 15060, 14984, 15034, 15039, 15052};
                        initialize = 993475334;
                        get = true;
                        getSDKInfo = true;
                    }

                    private static void a(String str5, int[] iArr, int i27, String str6, Object[] objArr2) {
                        char[] cArr;
                        Class cls;
                        int i28;
                        Object method;
                        String str7 = str6;
                        byte[] bArr = str7;
                        if (str7 != null) {
                            bArr = str7.getBytes("ISO-8859-1");
                        }
                        byte[] bArr2 = bArr;
                        char[] charArray = str5 != null ? str5.toCharArray() : str5;
                        onError onerror = new onError();
                        char[] cArr2 = ThreeDS2ServiceInstance;
                        Class cls2 = Integer.TYPE;
                        int i29 = 0;
                        if (cArr2 != null) {
                            int length = cArr2.length;
                            char[] cArr3 = new char[length];
                            int i30 = 0;
                            while (i30 < length) {
                                try {
                                    Object[] objArr3 = {Integer.valueOf(cArr2[i30])};
                                    Map map = removeParam.visaSchemeConfiguration;
                                    Object obj = map.get(-939298638);
                                    if (obj != null) {
                                        cArr = cArr2;
                                        i28 = i30;
                                        method = obj;
                                        cls = cls2;
                                    } else {
                                        cArr = cArr2;
                                        cls = cls2;
                                        int i31 = i29;
                                        Class cls3 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', i29, i29) + 73, (char) TextUtils.getCapsMode("", i29, i29), 1405 - Color.green(i31));
                                        Object[] objArr4 = new Object[1];
                                        i28 = i30;
                                        b(i31, i31, (short) 1, objArr4);
                                        method = cls3.getMethod((String) objArr4[i31], cls);
                                        map.put(-939298638, method);
                                    }
                                    cArr3[i28] = ((Character) ((Method) method).invoke(null, objArr3)).charValue();
                                    i30 = i28 + 1;
                                    cls2 = cls;
                                    cArr2 = cArr;
                                    i29 = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            cArr2 = cArr3;
                        }
                        Class cls4 = cls2;
                        Object[] objArr5 = {Integer.valueOf(initialize)};
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(-1598850155);
                        if (obj2 == null) {
                            Class cls5 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 74, (char) (ExpandableListView.getPackedPositionGroup(0L) + 7530), 2489 - TextUtils.getCapsMode("", 0, 0));
                            Object[] objArr6 = new Object[1];
                            b(0, 0, (short) 0, objArr6);
                            obj2 = cls5.getMethod((String) objArr6[0], cls4);
                            map2.put(-1598850155, obj2);
                        }
                        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr5)).intValue();
                        int i32 = 2;
                        if (getSDKInfo) {
                            $10 = ($11 + 117) % 128;
                            int length2 = bArr2.length;
                            onerror.ThreeDS2ServiceInstance = length2;
                            char[] cArr4 = new char[length2];
                            onerror.getWarnings = 0;
                            while (true) {
                                int i33 = onerror.getWarnings;
                                int i34 = onerror.ThreeDS2ServiceInstance;
                                if (i33 >= i34) {
                                    objArr2[0] = new String(cArr4);
                                    return;
                                }
                                cArr4[i33] = (char) (cArr2[bArr2[(i34 - 1) - i33] + i27] - intValue);
                                Object[] objArr7 = {onerror, onerror};
                                Map map3 = removeParam.visaSchemeConfiguration;
                                Object obj3 = map3.get(73542081);
                                if (obj3 == null) {
                                    obj3 = ((Class) removeParam.initialize((ViewConfiguration.getScrollBarSize() >> 8) + 48, (char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 11441)).getMethod("k", Object.class, Object.class);
                                    map3.put(73542081, obj3);
                                }
                                ((Method) obj3).invoke(null, objArr7);
                            }
                        } else if (get) {
                            int length3 = charArray.length;
                            onerror.ThreeDS2ServiceInstance = length3;
                            char[] cArr5 = new char[length3];
                            onerror.getWarnings = 0;
                            while (true) {
                                int i35 = onerror.getWarnings;
                                int i36 = onerror.ThreeDS2ServiceInstance;
                                if (i35 >= i36) {
                                    objArr2[0] = new String(cArr5);
                                    return;
                                }
                                cArr5[i35] = (char) (cArr2[charArray[(i36 - 1) - i35] - i27] - intValue);
                                Object[] objArr8 = new Object[i32];
                                objArr8[1] = onerror;
                                objArr8[0] = onerror;
                                Map map4 = removeParam.visaSchemeConfiguration;
                                Object obj4 = map4.get(73542081);
                                if (obj4 == null) {
                                    obj4 = ((Class) removeParam.initialize(48 - ExpandableListView.getPackedPositionType(0L), (char) ((Process.getThreadPriority(0) + 20) >> 6), 11442 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("k", Object.class, Object.class);
                                    map4.put(73542081, obj4);
                                }
                                ((Method) obj4).invoke(null, objArr8);
                                i32 = 2;
                            }
                        } else {
                            int length4 = iArr.length;
                            onerror.ThreeDS2ServiceInstance = length4;
                            char[] cArr6 = new char[length4];
                            onerror.getWarnings = 0;
                            $10 = ($11 + 87) % 128;
                            while (true) {
                                int i37 = onerror.getWarnings;
                                int i38 = onerror.ThreeDS2ServiceInstance;
                                if (i37 >= i38) {
                                    objArr2[0] = new String(cArr6);
                                    return;
                                } else {
                                    cArr6[i37] = (char) (cArr2[iArr[(i38 - 1) - i37] - i27] - intValue);
                                    onerror.getWarnings = i37 + 1;
                                }
                            }
                        }
                    }

                    private static void b(int i27, int i28, short s, Object[] objArr2) {
                        int i29 = (i28 * 3) + 4;
                        int i30 = i27 * 4;
                        int i31 = 109 - s;
                        byte[] bArr = $$a;
                        byte[] bArr2 = new byte[1 - i30];
                        int i32 = 0 - i30;
                        int i33 = -1;
                        if (bArr == null) {
                            i29++;
                            i31 = (-i31) + i32;
                            bArr = bArr;
                            i33 = -1;
                        }
                        while (true) {
                            int i34 = i33 + 1;
                            bArr2[i34] = (byte) i31;
                            if (i34 == i32) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            byte b = bArr[i29];
                            i29++;
                            i31 = (-b) + i31;
                            bArr = bArr;
                            i33 = i34;
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{69, 111, 44, 110};
                        $$b = 99;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public findFragmentById get(nq nqVar, String str5, boolean z) {
                        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 67) % 128;
                        String str6 = (String) oj.getWarnings(nqVar.initialize(str5), "");
                        if (!((Boolean) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{str6, str3, str4, Boolean.valueOf(z)}, 846007254, -846007250, (int) System.currentTimeMillis())).booleanValue()) {
                            return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                        }
                        setTextAlignment settextalignment = setTextAlignment.Transaction;
                        Object[] objArr2 = new Object[1];
                        a(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, "\u008b\u008a\u0089\u0088\u0087\u0092\u0087\u0085\u0091\u008d\u0082\u008e\u0087\u0090\u0085\u008f\u0083\u0085\u008a\u0085\u008e\u0087\u008d\u008c\u0087\u008a\u008c\u0087\u008b\u008a\u0089\u0088\u0087\u0083\u0085\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
                        findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str5, String.format(((String) objArr2[0]).intern(), str5, str6))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                        getSDKVersion = (ThreeDS2ServiceInitializationCallback + 121) % 128;
                        return findfragmentbyid;
                    }
                };
                int i27 = ThreeDS2ServiceInstance;
                int i28 = i27 & 107;
                int i29 = (i27 ^ 107) | i28;
                initialize = ((i28 ^ i29) + ((i29 & i28) << 1)) % 128;
                return compareto9;
            case 19:
                return addParam(objArr);
            case 20:
                return ConfigParameters(objArr);
            case 21:
                final String str5 = (String) objArr[0];
                compareTo compareto10 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.15
                    private static int ThreeDS2ServiceInstance = 0;
                    private static int get = 1;

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public findFragmentById get(nq nqVar, String str6, boolean z) {
                        findFragmentById findfragmentbyid;
                        int i30;
                        int i31 = get;
                        int i32 = i31 | 21;
                        int i33 = i32 << 1;
                        int i34 = -((~(i31 & 21)) & i32);
                        int i35 = (i33 & i34) + (i34 | i33);
                        ThreeDS2ServiceInstance = i35 % 128;
                        if (i35 % 2 != 0) {
                            throw null;
                        }
                        if (z && oj.ThreeDS2ServiceInstance(str5)) {
                            int i36 = get;
                            int i37 = i36 & 1;
                            int i38 = -(-((i36 ^ 1) | i37));
                            ThreeDS2ServiceInstance = ((i37 ^ i38) + ((i38 & i37) << 1)) % 128;
                            findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                            int i39 = ThreeDS2ServiceInstance;
                            int i40 = i39 & 19;
                            i30 = SVG$Unit$EnumUnboxingLocalUtility.m$1(i40, ~(-(-((i39 ^ 19) | i40))), 1, 128);
                        } else {
                            findfragmentbyid = ((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get(nqVar, str6, z);
                            int i41 = ThreeDS2ServiceInstance;
                            int i42 = i41 & 21;
                            i30 = (((i41 | 21) & (~i42)) + (i42 << 1)) % 128;
                        }
                        get = i30;
                        return findfragmentbyid;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public nq getWarnings(nq nqVar, String str6, boolean z) {
                        int i30 = ThreeDS2ServiceInstance;
                        int i31 = i30 ^ 61;
                        int i32 = -(-((i30 & 61) << 1));
                        int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                        get = i33 % 128;
                        if (i33 % 2 == 0) {
                            throw null;
                        }
                        if (z) {
                            get = ((i30 & 103) + (i30 | 103)) % 128;
                            if (oj.initialize(str5)) {
                                int i34 = ThreeDS2ServiceInstance;
                                int i35 = i34 ^ 37;
                                int i36 = (i34 & 37) << 1;
                                get = ((i35 ^ i36) + ((i36 & i35) << 1)) % 128;
                                if (oj.get(nqVar.initialize(str6))) {
                                    int i37 = ThreeDS2ServiceInstance;
                                    get = ((i37 & 29) + (i37 | 29)) % 128;
                                    nqVar.ThreeDS2Service(str6, str5);
                                    int i38 = get;
                                    int i39 = (i38 & (-108)) | ((~i38) & 107);
                                    int i40 = (i38 & 107) << 1;
                                    ThreeDS2ServiceInstance = (((i39 | i40) << 1) - (i40 ^ i39)) % 128;
                                }
                            }
                        }
                        int i41 = get;
                        ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1((i41 & (-18)) | ((~i41) & 17), ~((i41 & 17) << 1), 1, 128);
                        return nqVar;
                    }
                };
                int i30 = initialize;
                int i31 = i30 & 53;
                int i32 = -(-(i30 | 53));
                ThreeDS2ServiceInstance = ((i31 ^ i32) + ((i32 & i31) << 1)) % 128;
                return compareto10;
            case 22:
                return getParamValue(objArr);
            case 23:
                final int intValue = ((Number) objArr[0]).intValue();
                compareTo compareto11 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.17
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static char ThreeDS2Service = 29316;
                    private static char ThreeDS2ServiceInstance = 39049;
                    private static int cleanup = 0;
                    private static char get = 37814;
                    private static int getSDKVersion = 1;
                    private static char getWarnings = 4899;

                    private static void a(String str6, int i33, Object[] objArr2) {
                        char[] cArr;
                        char[] charArray = str6 != null ? str6.toCharArray() : str6;
                        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
                        char[] cArr2 = new char[charArray.length];
                        int i34 = 0;
                        configurationBuilder.ThreeDS2ServiceInstance = 0;
                        int i35 = 2;
                        char[] cArr3 = new char[2];
                        while (true) {
                            int i36 = configurationBuilder.ThreeDS2ServiceInstance;
                            if (i36 >= charArray.length) {
                                objArr2[0] = new String(cArr2, 0, i33);
                                return;
                            }
                            int i37 = ($10 + 91) % 128;
                            $11 = i37;
                            cArr3[i34] = charArray[i36];
                            char c = 1;
                            cArr3[1] = charArray[i36 + 1];
                            $10 = (i37 + 19) % 128;
                            int i38 = 58224;
                            int i39 = i34;
                            while (i39 < 16) {
                                char c2 = cArr3[c];
                                char c3 = cArr3[i34];
                                char c4 = c;
                                int i40 = i35;
                                char[] cArr4 = cArr3;
                                int i41 = (c3 + i38) ^ ((c3 << 4) + ((char) (ThreeDS2ServiceInstance ^ (-1730380012335540218L))));
                                int i42 = c3 >>> 5;
                                try {
                                    Object[] objArr3 = new Object[4];
                                    objArr3[3] = Integer.valueOf(ThreeDS2Service);
                                    objArr3[i40] = Integer.valueOf(i42);
                                    objArr3[c4] = Integer.valueOf(i41);
                                    objArr3[i34] = Integer.valueOf(c2);
                                    Map map = removeParam.visaSchemeConfiguration;
                                    Object obj = map.get(936379577);
                                    Class cls = Integer.TYPE;
                                    if (obj != null) {
                                        cArr = charArray;
                                    } else {
                                        cArr = charArray;
                                        obj = ((Class) removeParam.initialize(67 - View.MeasureSpec.getSize(i34), (char) (62396 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Gravity.getAbsoluteGravity(i34, i34) + 5352)).getMethod("C", cls, cls, cls, cls);
                                        map.put(936379577, obj);
                                    }
                                    char charValue = ((Character) ((Method) obj).invoke(null, objArr3)).charValue();
                                    cArr4[c4] = charValue;
                                    char c5 = cArr4[i34];
                                    int i43 = i34;
                                    int i44 = i38;
                                    int i45 = (charValue + i38) ^ ((charValue << 4) + ((char) (getWarnings ^ (-1730380012335540218L))));
                                    int i46 = charValue >>> 5;
                                    Object[] objArr4 = new Object[4];
                                    objArr4[3] = Integer.valueOf(get);
                                    objArr4[i40] = Integer.valueOf(i46);
                                    objArr4[c4] = Integer.valueOf(i45);
                                    objArr4[i43] = Integer.valueOf(c5);
                                    Object obj2 = map.get(936379577);
                                    if (obj2 == null) {
                                        obj2 = ((Class) removeParam.initialize(TextUtils.getCapsMode("", i43, i43) + 67, (char) (62395 - MotionEvent.axisFromString("")), MotionEvent.axisFromString("") + 5353)).getMethod("C", cls, cls, cls, cls);
                                        map.put(936379577, obj2);
                                    }
                                    cArr4[0] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                                    i38 = i44 - 40503;
                                    i39++;
                                    c = c4;
                                    i35 = i40;
                                    cArr3 = cArr4;
                                    charArray = cArr;
                                    i34 = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            char[] cArr5 = charArray;
                            int i47 = i35;
                            char[] cArr6 = cArr3;
                            char c6 = c;
                            int i48 = configurationBuilder.ThreeDS2ServiceInstance;
                            cArr2[i48] = cArr6[0];
                            cArr2[i48 + 1] = cArr6[c6];
                            Object[] objArr5 = new Object[i47];
                            objArr5[c6] = configurationBuilder;
                            objArr5[0] = configurationBuilder;
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj3 = map2.get(108358357);
                            if (obj3 == null) {
                                obj3 = ((Class) removeParam.initialize(TextUtils.indexOf("", "") + 54, (char) (39910 - Color.blue(0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 7059)).getMethod("B", Object.class, Object.class);
                                map2.put(108358357, obj3);
                            }
                            ((Method) obj3).invoke(null, objArr5);
                            i35 = i47;
                            cArr3 = cArr6;
                            charArray = cArr5;
                            i34 = 0;
                        }
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public findFragmentById get(nq nqVar, String str6, boolean z) {
                        cleanup = (getSDKVersion + 119) % 128;
                        String str7 = (String) oj.getWarnings(nqVar.initialize(str6), "");
                        int ThreeDS2ServiceInstance2 = oj.ThreeDS2ServiceInstance(str7);
                        if (str7.length() == intValue) {
                            findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                            getSDKVersion = (cleanup + 103) % 128;
                            return findfragmentbyid;
                        }
                        setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                        Object[] objArr2 = new Object[1];
                        a("⟓픷崂䊯ꨚ냪惐豪蚔헼곓폁䢓ᯒ椴\ueaf6瀈骽婭끃\uf674Ρᓩ㗒䖌Ꝟ肫櫈䨋犊ﰜ쾥╓罆\ud942쮒薧鴸瞀挛곓폁䢓ᯒ夶ㆪ瑛ꠊ져⢟７\ue2f4坲蝢粃럖쫰⛾껹귞", 60 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
                        return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str6, String.format(((String) objArr2[0]).intern(), str6, Integer.valueOf(intValue), Integer.valueOf(ThreeDS2ServiceInstance2)))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                    }
                };
                int i33 = initialize;
                int i34 = i33 & 13;
                ThreeDS2ServiceInstance = (i34 + ((i33 ^ 13) | i34)) % 128;
                return compareto11;
            case 24:
                return onError(objArr);
            case 25:
                compareTo compareto12 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.8
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static boolean ThreeDS2Service;
                    private static int ThreeDS2ServiceInitializationCallback;
                    private static int ThreeDS2ServiceInstance;
                    private static boolean get;
                    private static int getWarnings;
                    private static char[] initialize;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        ThreeDS2ServiceInstance = 0;
                        ThreeDS2ServiceInitializationCallback = 1;
                        initialize = new char[]{15095, 15046, 15061, 15058, 15066, 15019, 15111, 15052, 15130, 15060, 15042, 15070, 15057, 15056, 15017, 15059, 15067, 15050, 15093, 15091, 15121, 15044, 15085};
                        getWarnings = 993475367;
                        ThreeDS2Service = true;
                        get = true;
                    }

                    private static void a(String str6, int[] iArr, int i35, String str7, Object[] objArr2) {
                        long j;
                        char[] cArr;
                        Class cls;
                        Object method;
                        String str8 = str7;
                        $11 = ($10 + 115) % 128;
                        byte[] bArr = str8;
                        if (str8 != null) {
                            bArr = str8.getBytes("ISO-8859-1");
                        }
                        byte[] bArr2 = bArr;
                        char[] charArray = str6 != null ? str6.toCharArray() : str6;
                        onError onerror = new onError();
                        char[] cArr2 = initialize;
                        Class cls2 = Integer.TYPE;
                        short s = 0;
                        if (cArr2 != null) {
                            int length = cArr2.length;
                            char[] cArr3 = new char[length];
                            int i36 = 0;
                            while (i36 < length) {
                                try {
                                    Object[] objArr3 = {Integer.valueOf(cArr2[i36])};
                                    Map map = removeParam.visaSchemeConfiguration;
                                    Object obj = map.get(-939298638);
                                    if (obj != null) {
                                        cArr = cArr2;
                                        cls = cls2;
                                        method = obj;
                                    } else {
                                        cArr = cArr2;
                                        short s2 = s;
                                        cls = cls2;
                                        Class cls3 = (Class) removeParam.initialize(71 - TextUtils.indexOf((CharSequence) "", '0', (int) s), (char) View.MeasureSpec.getSize(s2), 1405 - TextUtils.indexOf("", ""));
                                        Object[] objArr4 = new Object[1];
                                        b(s2, s2, s2, objArr4);
                                        method = cls3.getMethod((String) objArr4[s2], cls);
                                        map.put(-939298638, method);
                                    }
                                    cArr3[i36] = ((Character) ((Method) method).invoke(null, objArr3)).charValue();
                                    i36++;
                                    cArr2 = cArr;
                                    cls2 = cls;
                                    s = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            cArr2 = cArr3;
                        }
                        Class cls4 = cls2;
                        Object[] objArr5 = {Integer.valueOf(getWarnings)};
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(-1598850155);
                        if (obj2 != null) {
                            j = 0;
                        } else {
                            Class cls5 = (Class) removeParam.initialize(72 - ExpandableListView.getPackedPositionChild(0L), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 7530), 2489 - Gravity.getAbsoluteGravity(0, 0));
                            byte b = (byte) ($$b & 7);
                            byte b2 = (byte) (b - 1);
                            j = 0;
                            Object[] objArr6 = new Object[1];
                            b(b, b2, b2, objArr6);
                            obj2 = cls5.getMethod((String) objArr6[0], cls4);
                            map2.put(-1598850155, obj2);
                        }
                        int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr5)).intValue();
                        if (get) {
                            int length2 = bArr2.length;
                            onerror.ThreeDS2ServiceInstance = length2;
                            char[] cArr4 = new char[length2];
                            onerror.getWarnings = 0;
                            while (true) {
                                int i37 = onerror.getWarnings;
                                int i38 = onerror.ThreeDS2ServiceInstance;
                                if (i37 >= i38) {
                                    objArr2[0] = new String(cArr4);
                                    return;
                                }
                                cArr4[i37] = (char) (cArr2[bArr2[(i38 - 1) - i37] + i35] - intValue2);
                                Object[] objArr7 = {onerror, onerror};
                                Map map3 = removeParam.visaSchemeConfiguration;
                                Object obj3 = map3.get(73542081);
                                if (obj3 == null) {
                                    obj3 = ((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0) + 49, (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), View.combineMeasuredStates(0, 0) + 11441)).getMethod("k", Object.class, Object.class);
                                    map3.put(73542081, obj3);
                                }
                                ((Method) obj3).invoke(null, objArr7);
                                $10 = ($11 + 101) % 128;
                            }
                        } else if (ThreeDS2Service) {
                            int length3 = charArray.length;
                            onerror.ThreeDS2ServiceInstance = length3;
                            char[] cArr5 = new char[length3];
                            onerror.getWarnings = 0;
                            while (true) {
                                int i39 = onerror.getWarnings;
                                int i40 = onerror.ThreeDS2ServiceInstance;
                                if (i39 >= i40) {
                                    objArr2[0] = new String(cArr5);
                                    return;
                                }
                                $10 = ($11 + 53) % 128;
                                cArr5[i39] = (char) (cArr2[charArray[(i40 - 1) - i39] - i35] - intValue2);
                                Object[] objArr8 = {onerror, onerror};
                                Map map4 = removeParam.visaSchemeConfiguration;
                                Object obj4 = map4.get(73542081);
                                if (obj4 == null) {
                                    obj4 = ((Class) removeParam.initialize(Color.argb(0, 0, 0, 0) + 48, (char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11441)).getMethod("k", Object.class, Object.class);
                                    map4.put(73542081, obj4);
                                }
                                ((Method) obj4).invoke(null, objArr8);
                                $10 = ($11 + 67) % 128;
                            }
                        } else {
                            int length4 = iArr.length;
                            onerror.ThreeDS2ServiceInstance = length4;
                            char[] cArr6 = new char[length4];
                            onerror.getWarnings = 0;
                            while (true) {
                                int i41 = onerror.getWarnings;
                                int i42 = onerror.ThreeDS2ServiceInstance;
                                if (i41 >= i42) {
                                    objArr2[0] = new String(cArr6);
                                    return;
                                } else {
                                    cArr6[i41] = (char) (cArr2[iArr[(i42 - 1) - i41] - i35] - intValue2);
                                    onerror.getWarnings = i41 + 1;
                                }
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(short s, int i35, int i36, Object[] objArr2) {
                        int i37;
                        int i38;
                        byte[] bArr = $$a;
                        int i39 = s + 108;
                        int i40 = 1 - (i36 * 4);
                        int i41 = (i35 * 2) + 4;
                        byte[] bArr2 = new byte[i40];
                        if (bArr == null) {
                            byte[] bArr3 = bArr;
                            i38 = 0;
                            int i42 = i41;
                            i39 += -i41;
                            i41 = i42 + 1;
                            bArr = bArr3;
                            i37 = i38;
                            i38 = i37 + 1;
                            bArr2[i37] = (byte) i39;
                            if (i38 == i40) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            byte b = bArr[i41];
                            byte[] bArr4 = bArr;
                            i42 = i41;
                            i41 = b;
                            bArr3 = bArr4;
                            i39 += -i41;
                            i41 = i42 + 1;
                            bArr = bArr3;
                            i37 = i38;
                            i38 = i37 + 1;
                            bArr2[i37] = (byte) i39;
                            if (i38 == i40) {
                            }
                        } else {
                            i37 = 0;
                            i38 = i37 + 1;
                            bArr2[i37] = (byte) i39;
                            if (i38 == i40) {
                            }
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{PnmConstants.PPM_TEXT_CODE, -88, -122, 15};
                        $$b = 97;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
                    public findFragmentById get(nq nqVar, String str6, boolean z) {
                        String str7 = (String) oj.getWarnings(nqVar.initialize(str6), "");
                        try {
                            new URL(str7);
                            findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                            ThreeDS2ServiceInstance = (ThreeDS2ServiceInitializationCallback + 83) % 128;
                            return findfragmentbyid;
                        } catch (MalformedURLException unused) {
                            setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                            Object[] objArr2 = new Object[1];
                            a(null, null, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u008b\u008a\u0089\u0088\u0087\u0097\u0091\u0085\u008f\u008c\u0085\u0096\u0085\u0093\u0087\u0095\u0094\u0093\u0092\u0087\u0091\u008c\u0090\u0082\u008f\u0087\u0082\u0087\u0086\u008e\u008d\u0087\u008a\u008c\u0087\u008b\u008a\u0089\u0088\u0087\u0083\u0085\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
                            return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str6, String.format(((String) objArr2[0]).intern(), str6, str7))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                        }
                    }
                };
                int i35 = initialize;
                int i36 = i35 & 75;
                ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i36, ~(-(-((i35 ^ 75) | i36))), 1, 128);
                return compareto12;
            default:
                return get(objArr);
        }
    }

    private static /* synthetic */ Object addParam(Object[] objArr) {
        final int intValue = ((Number) objArr[0]).intValue();
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.7
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static int ThreeDS2ServiceInstance;
            private static int get;
            private static char[] initialize;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                get = 0;
                ThreeDS2ServiceInstance = 1;
                initialize = new char[]{52941, 52922, 52873, 52873, 52875, 52873, 52886, 52886, 52887, 52905, 52901, 52898, 52918, 52874, 52900, 52908, 52874, 52873, 52872, 52885, 52884, 52910, 52896, 52884, 52885, 52878, 52877, 52878, 52878, 52878, 52905, 52939, 52956, 52923, 52886, 52918, 52898, 52876, 52886, 52885, 52895, 52884, 52878, 52915, 52949, 52901, 52898, 52918, 52874, 52909, 52939, 52946, 52912, 52887, 52894, 52887, 52876, 52927, 52949, 52901, 52898, 52918, 52874};
            }

            /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:
            
                if (r19[r5] == 1) goto L32;
             */
            /* JADX WARN: Removed duplicated region for block: B:44:0x01f1  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x01f4 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:10:0x0051, B:13:0x00bc, B:15:0x0074, B:36:0x0120, B:39:0x016f, B:42:0x01dd, B:45:0x0222, B:47:0x01f4, B:48:0x013c, B:52:0x0182, B:55:0x01c9, B:57:0x019d), top: B:9:0x0051 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(boolean z, int[] iArr, String str, Object[] objArr2) {
                byte[] bArr;
                int i;
                char c;
                long j;
                Object obj;
                Class<Object> cls;
                int i2;
                int i3;
                char[] cArr;
                int i4;
                Class<Object> cls2;
                Integer num;
                Object method;
                String str2 = str;
                Class<Object> cls3 = Object.class;
                Integer num2 = 102334785;
                byte[] bArr2 = str2;
                if (str2 != null) {
                    bArr2 = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr3 = bArr2;
                cleanup cleanupVar = new cleanup();
                int i5 = iArr[0];
                int i6 = iArr[1];
                int i7 = iArr[2];
                int i8 = iArr[3];
                char[] cArr2 = initialize;
                char c2 = '0';
                Class cls4 = Integer.TYPE;
                int i9 = 2;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    bArr = bArr3;
                    int i10 = 0;
                    while (i10 < length) {
                        try {
                            int i11 = i10;
                            Object[] objArr3 = {Integer.valueOf(cArr2[i10])};
                            char[] cArr4 = cArr3;
                            Map map = removeParam.visaSchemeConfiguration;
                            Object obj2 = map.get(-1866317650);
                            if (obj2 != null) {
                                cls2 = cls3;
                                num = num2;
                                i2 = length;
                                i4 = i8;
                                cArr = cArr2;
                                method = obj2;
                                i3 = i7;
                            } else {
                                i2 = length;
                                i3 = i7;
                                cArr = cArr2;
                                Class cls5 = (Class) removeParam.initialize(48 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 2295);
                                byte b = (byte) ($$b & 7);
                                byte b2 = (byte) (b - 1);
                                i4 = i8;
                                cls2 = cls3;
                                num = num2;
                                Object[] objArr4 = new Object[1];
                                b(b, b2, b2, objArr4);
                                method = cls5.getMethod((String) objArr4[0], cls4);
                                map.put(-1866317650, method);
                            }
                            cArr4[i11] = ((Character) ((Method) method).invoke(null, objArr3)).charValue();
                            i10 = i11 + 1;
                            cArr3 = cArr4;
                            i7 = i3;
                            length = i2;
                            cArr2 = cArr;
                            i8 = i4;
                            cls3 = cls2;
                            num2 = num;
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
                    bArr = bArr3;
                }
                Class<Object> cls6 = cls3;
                Integer num3 = num2;
                int i12 = i7;
                int i13 = i8;
                char[] cArr5 = new char[i6];
                System.arraycopy(cArr2, i5, cArr5, 0, i6);
                if (bArr != null) {
                    char[] cArr6 = new char[i6];
                    cleanupVar.get = 0;
                    char c3 = 0;
                    while (true) {
                        int i14 = cleanupVar.get;
                        if (i14 >= i6) {
                            break;
                        }
                        int i15 = $11 + 97;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            if (bArr[i14] == 0) {
                                c = 1;
                                char c4 = cArr5[i14];
                                Object[] objArr5 = new Object[i9];
                                objArr5[c] = Integer.valueOf(c3);
                                objArr5[0] = Integer.valueOf(c4);
                                Map map2 = removeParam.visaSchemeConfiguration;
                                Object obj3 = map2.get(715226994);
                                if (obj3 != null) {
                                    j = 0;
                                } else {
                                    j = 0;
                                    Class cls7 = (Class) removeParam.initialize(85 - Color.blue(0), (char) (View.getDefaultSize(0, 0) + 25857), 1725 - TextUtils.lastIndexOf("", c2));
                                    Object[] objArr6 = new Object[1];
                                    b((byte) 0, (byte) 0, (byte) 0, objArr6);
                                    obj3 = cls7.getMethod((String) objArr6[0], cls4, cls4);
                                    map2.put(715226994, obj3);
                                }
                                cArr6[i14] = ((Character) ((Method) obj3).invoke(null, objArr5)).charValue();
                                c3 = cArr6[cleanupVar.get];
                                Object[] objArr7 = {cleanupVar, cleanupVar};
                                Map map3 = removeParam.visaSchemeConfiguration;
                                Integer num4 = num3;
                                obj = map3.get(num4);
                                if (obj == null) {
                                    cls = cls6;
                                } else {
                                    cls = cls6;
                                    obj = ((Class) removeParam.initialize((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 73, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 9820)).getMethod("I", cls, cls);
                                    map3.put(num4, obj);
                                }
                                ((Method) obj).invoke(null, objArr7);
                                $11 = ($10 + 89) % 128;
                                num3 = num4;
                                cls6 = cls;
                                c2 = '0';
                                i9 = 2;
                            }
                            j = 0;
                            Object[] objArr8 = {Integer.valueOf(cArr5[i14]), Integer.valueOf(c3)};
                            Map map4 = removeParam.visaSchemeConfiguration;
                            Object obj4 = map4.get(549300883);
                            if (obj4 == null) {
                                obj4 = ((Class) removeParam.initialize(TextUtils.indexOf("", "") + 66, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32824), 447 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("D", cls4, cls4);
                                map4.put(549300883, obj4);
                            }
                            cArr6[i14] = ((Character) ((Method) obj4).invoke(null, objArr8)).charValue();
                            c3 = cArr6[cleanupVar.get];
                            Object[] objArr72 = {cleanupVar, cleanupVar};
                            Map map32 = removeParam.visaSchemeConfiguration;
                            Integer num42 = num3;
                            obj = map32.get(num42);
                            if (obj == null) {
                            }
                            ((Method) obj).invoke(null, objArr72);
                            $11 = ($10 + 89) % 128;
                            num3 = num42;
                            cls6 = cls;
                            c2 = '0';
                            i9 = 2;
                        } else {
                            c = 1;
                        }
                    }
                    cArr5 = cArr6;
                }
                if (i13 > 0) {
                    char[] cArr7 = new char[i6];
                    i = 0;
                    System.arraycopy(cArr5, 0, cArr7, 0, i6);
                    int i16 = i6 - i13;
                    System.arraycopy(cArr7, 0, cArr5, i16, i13);
                    System.arraycopy(cArr7, i13, cArr5, 0, i16);
                } else {
                    i = 0;
                }
                if (z) {
                    char[] cArr8 = new char[i6];
                    cleanupVar.get = i;
                    $11 = ($10 + 31) % 128;
                    while (true) {
                        int i17 = cleanupVar.get;
                        if (i17 >= i6) {
                            break;
                        }
                        cArr8[i17] = cArr5[(i6 - i17) - 1];
                        cleanupVar.get = i17 + 1;
                    }
                    cArr5 = cArr8;
                }
                if (i12 > 0) {
                    int i18 = $11 + 33;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    cleanupVar.get = 0;
                    while (true) {
                        int i20 = cleanupVar.get;
                        if (i20 >= i6) {
                            break;
                        }
                        cArr5[i20] = (char) (cArr5[i20] - iArr[2]);
                        cleanupVar.get = i20 + 1;
                    }
                }
                objArr2[0] = new String(cArr5);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0030). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(byte b, byte b2, byte b3, Object[] objArr2) {
                int i;
                int i2 = b3 * 3;
                byte[] bArr = $$a;
                int i3 = (b * 57) + 65;
                int i4 = 3 - (b2 * 3);
                byte[] bArr2 = new byte[1 - i2];
                int i5 = 0 - i2;
                if (bArr == null) {
                    int i6 = i4;
                    int i7 = i5;
                    i = 0;
                    int i8 = i4 + i7;
                    i4 = i6;
                    i3 = i8;
                    int i9 = i4 + 1;
                    bArr2[i] = (byte) i3;
                    if (i == i5) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    i++;
                    i7 = bArr[i9];
                    i4 = i3;
                    i6 = i9;
                    int i82 = i4 + i7;
                    i4 = i6;
                    i3 = i82;
                    int i92 = i4 + 1;
                    bArr2[i] = (byte) i3;
                    if (i == i5) {
                    }
                } else {
                    i = 0;
                    int i922 = i4 + 1;
                    bArr2[i] = (byte) i3;
                    if (i == i5) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{56, -50, 109, -4};
                $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public findFragmentById get(nq nqVar, String str, boolean z) {
                int i = get + 105;
                ThreeDS2ServiceInstance = i % 128;
                if (i % 2 == 0) {
                    ((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 550870365, -550870341, (int) System.currentTimeMillis())).get(nqVar, str, z);
                    oj.ThreeDS2ServiceInstance((String) oj.getWarnings(nqVar.initialize(str), ""));
                    throw null;
                }
                findFragmentById findfragmentbyid = ((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 550870365, -550870341, (int) System.currentTimeMillis())).get(nqVar, str, z);
                int ThreeDS2ServiceInstance2 = oj.ThreeDS2ServiceInstance((String) oj.getWarnings(nqVar.initialize(str), ""));
                if (ThreeDS2ServiceInstance2 > intValue) {
                    setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                    Object[] objArr2 = new Object[1];
                    a(false, new int[]{0, 63, 5, 0}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000", objArr2);
                    return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(((String) objArr2[0]).intern(), str, Integer.valueOf(intValue), Integer.valueOf(ThreeDS2ServiceInstance2)))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                }
                int i2 = ThreeDS2ServiceInstance + 25;
                get = i2 % 128;
                if (i2 % 2 == 0) {
                    return findfragmentbyid;
                }
                throw null;
            }
        };
        int i = ThreeDS2ServiceInstance + 91;
        initialize = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
        return compareto;
    }

    private static /* synthetic */ Object cleanup(Object[] objArr) {
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.11
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static short[] ThreeDS2Service;
            private static int ThreeDS2ServiceInitializationCallback;
            private static int ThreeDS2ServiceInstance;
            private static int createTransaction;
            private static byte[] get;
            private static int getWarnings;
            private static int initialize;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                createTransaction = 0;
                ThreeDS2ServiceInitializationCallback = 1;
                initialize = -748130187;
                getWarnings = -1686431662;
                ThreeDS2ServiceInstance = 1449276788;
                get = new byte[]{-90, -32, 21, 39, -29, 28, -32, -20, -19, 77, 100, -64, 68, -75, 104, 64, -123, 98, -113, -97, -84, -81, 124, 77, 115, -117, -109, -94, 62, -114, -95, -81, 58, -123, 96, -113, -125, 97, -125, 117, -105, -69, PnmConstants.PGM_TEXT_CODE, 117, 115, -123, 101, -40, PnmConstants.PBM_TEXT_CODE, -49, 34, -117, -113, -64, 35, -124, -57, 77, 100, -64, 68, -75, PnmConstants.PNM_SEPARATOR, -125, Byte.MAX_VALUE, -127, 118, -126, 97, -97, -97, -91, -1, 10, PnmConstants.PGM_RAW_CODE, 3, -1, -13, -92, 99, -106, -87, 99, 108, -20, -72, 28, -104, 105, -76, -100, 89, -66, 83, 67, 112, 115, -96, -111, -81, 87, 79, 126, -30, 82, 125, 115, -26, 89, PSSSigner.TRAILER_IMPLICIT, 83, 95, -67, 95, -87, 75, 103, -18, -87, -81, 89, -71, 4, -19, 19, -2, 87, 83, 28, -1, 88, 27, -111, -72, 28, -104, 105, -4, 95, -93, 93, -86, 94, -67, 67, 67};
            }

            /* JADX WARN: Code restructure failed: missing block: B:48:0x023c, code lost:
            
                if (r25 != false) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0250, code lost:
            
                r6 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x024e, code lost:
            
                r6 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x024c, code lost:
            
                if (r25 != false) goto L55;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr2) {
                long j;
                boolean z;
                boolean z2;
                long j2;
                int i4;
                int i5;
                boolean z3;
                boolean z4;
                int i6;
                byte[] bArr;
                Object method;
                getSDKVersion getsdkversion = new getSDKVersion();
                StringBuilder sb = new StringBuilder();
                byte b2 = 2;
                try {
                    int i7 = 1;
                    Object[] objArr3 = {Integer.valueOf(i3), Integer.valueOf(getWarnings)};
                    byte b3 = 0;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(981393365);
                    Class cls = Integer.TYPE;
                    if (obj != null) {
                        j = 0;
                    } else {
                        j = 0;
                        Class cls2 = (Class) removeParam.initialize(Color.red(0) + 62, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 655 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        Object[] objArr4 = new Object[1];
                        b((short) 0, (byte) 0, (byte) 0, objArr4);
                        obj = cls2.getMethod((String) objArr4[0], cls, cls);
                        map.put(981393365, obj);
                    }
                    int intValue = ((Integer) ((Method) obj).invoke(null, objArr3)).intValue();
                    if (intValue == -1) {
                        $10 = ($11 + 69) % 128;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        byte[] bArr2 = get;
                        if (bArr2 != null) {
                            j2 = 2786809877878216728L;
                            int length = bArr2.length;
                            byte[] bArr3 = new byte[length];
                            int i8 = 0;
                            while (i8 < length) {
                                byte b4 = b2;
                                int i9 = $10 + 119;
                                int i10 = i7;
                                $11 = i9 % 128;
                                if (i9 % 2 == 0) {
                                    Object[] objArr5 = {Integer.valueOf(bArr2[i8])};
                                    Map map2 = removeParam.visaSchemeConfiguration;
                                    Object obj2 = map2.get(-1684720202);
                                    if (obj2 != null) {
                                        i6 = i8;
                                        z4 = z;
                                        method = obj2;
                                        bArr = bArr2;
                                    } else {
                                        i6 = i8;
                                        bArr = bArr2;
                                        byte b5 = b3;
                                        Class cls3 = (Class) removeParam.initialize(58 - ImageFormat.getBitsPerPixel(b3), (char) (TextUtils.lastIndexOf("", '0', b3) + 1), 3162 - Color.blue((int) b5));
                                        Object[] objArr6 = new Object[i10];
                                        z4 = z;
                                        b(b5, b4, b5, objArr6);
                                        method = cls3.getMethod((String) objArr6[b5], cls);
                                        map2.put(-1684720202, method);
                                    }
                                    bArr3[i6] = ((Byte) ((Method) method).invoke(null, objArr5)).byteValue();
                                    bArr2 = bArr;
                                    i8 = i6;
                                } else {
                                    int i11 = i8;
                                    byte[] bArr4 = bArr2;
                                    z4 = z;
                                    Object[] objArr7 = {Integer.valueOf(bArr4[i11])};
                                    Map map3 = removeParam.visaSchemeConfiguration;
                                    Object obj3 = map3.get(-1684720202);
                                    if (obj3 == null) {
                                        Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 58, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3162);
                                        Object[] objArr8 = new Object[1];
                                        b((short) 0, (byte) 2, (byte) 0, objArr8);
                                        obj3 = cls4.getMethod((String) objArr8[0], cls);
                                        map3.put(-1684720202, obj3);
                                    }
                                    bArr3[i11] = ((Byte) ((Method) obj3).invoke(null, objArr7)).byteValue();
                                    i8 = i11 + 1;
                                    bArr2 = bArr4;
                                }
                                z = z4;
                                b2 = 2;
                                i7 = 1;
                                b3 = 0;
                            }
                            bArr2 = bArr3;
                        } else {
                            j2 = 2786809877878216728L;
                        }
                        z2 = z;
                        if (bArr2 != null) {
                            byte[] bArr5 = get;
                            Object[] objArr9 = {Integer.valueOf(i2), Integer.valueOf(initialize)};
                            Map map4 = removeParam.visaSchemeConfiguration;
                            Object obj4 = map4.get(981393365);
                            if (obj4 == null) {
                                Class cls5 = (Class) removeParam.initialize(TextUtils.indexOf("", "", 0, 0) + 62, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0) + 654);
                                Object[] objArr10 = new Object[1];
                                b((short) 0, (byte) 0, (byte) 0, objArr10);
                                obj4 = cls5.getMethod((String) objArr10[0], cls, cls);
                                map4.put(981393365, obj4);
                            }
                            intValue = (byte) (((byte) (bArr5[((Integer) ((Method) obj4).invoke(null, objArr9)).intValue()] ^ j2)) + ((int) (getWarnings ^ j2)));
                        } else {
                            intValue = (short) (((short) (ThreeDS2Service[i2 + ((int) (initialize ^ j2))] ^ j2)) + ((int) (getWarnings ^ j2)));
                        }
                    } else {
                        z2 = z;
                        j2 = 2786809877878216728L;
                    }
                    if (intValue > 0) {
                        int i12 = $10 + 23;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            i4 = ((i2 / intValue) >>> 3) / ((int) (initialize / j2));
                        } else {
                            i4 = ((i2 + intValue) - 2) + ((int) (initialize ^ j2));
                        }
                        getsdkversion.ThreeDS2ServiceInstance = i4 + i5;
                        Object[] objArr11 = {getsdkversion, Integer.valueOf(i), Integer.valueOf(ThreeDS2ServiceInstance), sb};
                        Map map5 = removeParam.visaSchemeConfiguration;
                        Object obj5 = map5.get(-1855485602);
                        if (obj5 == null) {
                            Class cls6 = (Class) removeParam.initialize(54 - View.getDefaultSize(0, 0), (char) (KeyEvent.getDeadChar(0, 0) + 13764), KeyEvent.getDeadChar(0, 0) + 2802);
                            Object[] objArr12 = new Object[1];
                            b((short) 0, (byte) 1, (byte) 0, objArr12);
                            obj5 = cls6.getMethod((String) objArr12[0], Object.class, cls, cls, Object.class);
                            map5.put(-1855485602, obj5);
                        }
                        ((StringBuilder) ((Method) obj5).invoke(null, objArr11)).append(getsdkversion.ThreeDS2Service);
                        getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                        byte[] bArr6 = get;
                        if (bArr6 != null) {
                            $10 = ($11 + 49) % 128;
                            int length2 = bArr6.length;
                            byte[] bArr7 = new byte[length2];
                            for (int i13 = 0; i13 < length2; i13++) {
                                bArr7[i13] = (byte) (bArr6[i13] ^ j2);
                            }
                            bArr6 = bArr7;
                        }
                        if (bArr6 != null) {
                            $10 = ($11 + 45) % 128;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        getsdkversion.initialize = 1;
                        while (getsdkversion.initialize < intValue) {
                            int i14 = getsdkversion.ThreeDS2ServiceInstance;
                            if (z3) {
                                byte[] bArr8 = get;
                                getsdkversion.ThreeDS2ServiceInstance = i14 - 1;
                                getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((byte) (((byte) (bArr8[i14] ^ j2)) + s)) ^ b));
                            } else {
                                short[] sArr = ThreeDS2Service;
                                getsdkversion.ThreeDS2ServiceInstance = i14 - 1;
                                getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[i14] ^ j2)) + s)) ^ b));
                            }
                            sb.append(getsdkversion.ThreeDS2Service);
                            getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                            getsdkversion.initialize++;
                        }
                    }
                    objArr2[0] = sb.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0031). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(short s, byte b, byte b2, Object[] objArr2) {
                int i;
                int i2 = 104 - b;
                int i3 = 3 - (b2 * 4);
                byte[] bArr = $$a;
                int i4 = s * 2;
                byte[] bArr2 = new byte[1 - i4];
                int i5 = 0 - i4;
                if (bArr == null) {
                    byte[] bArr3 = bArr;
                    int i6 = 0;
                    int i7 = i3;
                    i2 += i3;
                    i3 = i7;
                    bArr = bArr3;
                    i = i6;
                    int i8 = i3 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    byte b3 = bArr[i8];
                    i3 = i2;
                    i2 = b3;
                    i6 = i + 1;
                    bArr3 = bArr;
                    i7 = i8;
                    i2 += i3;
                    i3 = i7;
                    bArr = bArr3;
                    i = i6;
                    int i82 = i3 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                    }
                } else {
                    i = 0;
                    int i822 = i3 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{83, 79, -10, 64};
                $$b = 86;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public findFragmentById get(nq nqVar, String str, boolean z) {
                String str2 = (String) oj.getWarnings(oj.getWarnings(nqVar.initialize(str)), "");
                if (!z) {
                    ThreeDS2ServiceInitializationCallback = (createTransaction + 17) % 128;
                    Object[] objArr2 = new Object[1];
                    a(853988092 - (KeyEvent.getMaxKeyCode() >> 16), (byte) (View.MeasureSpec.getSize(0) - 8), (short) TextUtils.indexOf("", ""), (-1209231470) - TextUtils.lastIndexOf("", '0', 0, 0), (-75) - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                    if (!oj.ThreeDS2Service((CharSequence) str2, (CharSequence) ((String) objArr2[0]).intern())) {
                        setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                        Object[] objArr3 = new Object[1];
                        a(853988068 - View.combineMeasuredStates(0, 0), (byte) (TextUtils.lastIndexOf("", '0') - 105), (short) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1209231461, (-75) - View.MeasureSpec.getMode(0), objArr3);
                        return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(((String) objArr3[0]).intern(), str, str2))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                    }
                }
                if (z) {
                    createTransaction = (ThreeDS2ServiceInitializationCallback + 105) % 128;
                    Object[] objArr4 = new Object[1];
                    a(853988093 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((-24) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetAfter("", 0) - 1209231398, (-75) - TextUtils.indexOf("", "", 0), objArr4);
                    String intern = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    a(853988092 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((-8) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (short) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) - 1209231469, AndroidCharacter.getMirror('0') - '{', objArr5);
                    String intern2 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    a(853988085 - KeyEvent.normalizeMetaState(0), (byte) (123 - (ViewConfiguration.getTouchSlop() >> 8)), (short) View.getDefaultSize(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1209231392, (-75) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr6);
                    if (!oj.get(str2, intern, intern2, ((String) objArr6[0]).intern())) {
                        setTextAlignment settextalignment2 = setTextAlignment.getSDKReferenceNumber;
                        Object[] objArr7 = new Object[1];
                        a((ViewConfiguration.getTouchSlop() >> 8) + 853988068, (byte) (74 - View.MeasureSpec.getMode(0)), (short) View.MeasureSpec.getSize(0), (-1209231385) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-75) - View.MeasureSpec.getSize(0), objArr7);
                        return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment2, str, String.format(((String) objArr7[0]).intern(), str, str2))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                    }
                }
                return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
            }
        };
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 75;
        int i3 = (i ^ 75) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return compareto;
        }
        throw null;
    }

    private static /* synthetic */ Object createTransaction(Object[] objArr) {
        int i = initialize;
        no noVar = ThreeDS2Service;
        int i2 = i & 57;
        int i3 = -(-(i | 57));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0) {
            return noVar;
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        final String[] strArr = (String[]) objArr[0];
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.10
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static int ThreeDS2ServiceInitializationCallback;
            private static int ThreeDS2ServiceInstance;
            private static int createTransaction;
            private static boolean get;
            private static boolean getWarnings;
            private static char[] initialize;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                ThreeDS2ServiceInitializationCallback = 0;
                createTransaction = 1;
                initialize = new char[]{15110, 15125, 15076, 15073, 15081, 15098, 15190, 15123, 15145, 15099, 15121, 15085, 15072, 15079, 15103, 15086, 15083, 15078, 15082, 15096, 15074, 15097, 15136, 15157, 15164, 15138};
                ThreeDS2ServiceInstance = 993475446;
                getWarnings = true;
                get = true;
            }

            private static void a(String str, int[] iArr, int i, String str2, Object[] objArr2) {
                int length;
                char[] cArr;
                int i2;
                char[] cArr2;
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
                char[] cArr3 = initialize;
                Class cls2 = Integer.TYPE;
                if (cArr3 != null) {
                    int i4 = $11 + 107;
                    $10 = i4 % 128;
                    if (i4 % 2 != 0) {
                        length = cArr3.length;
                        cArr = new char[length];
                        i2 = 1;
                    } else {
                        length = cArr3.length;
                        cArr = new char[length];
                        i2 = 0;
                    }
                    while (i2 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[i2])};
                            Map map = removeParam.visaSchemeConfiguration;
                            Object obj = map.get(-939298638);
                            if (obj != null) {
                                cArr2 = cArr3;
                                method = obj;
                                cls = cls2;
                                i3 = i2;
                            } else {
                                cArr2 = cArr3;
                                cls = cls2;
                                Class cls3 = (Class) removeParam.initialize(Color.blue(0) + 72, (char) View.getDefaultSize(0, 0), 1405 - View.resolveSizeAndState(0, 0, 0));
                                Object[] objArr4 = new Object[1];
                                i3 = i2;
                                b((short) 1, 0, -1, objArr4);
                                method = cls3.getMethod((String) objArr4[0], cls);
                                map.put(-939298638, method);
                            }
                            cArr[i3] = ((Character) ((Method) method).invoke(null, objArr3)).charValue();
                            i2 = i3 + 1;
                            $11 = ($10 + 33) % 128;
                            cArr3 = cArr2;
                            cls2 = cls;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr;
                }
                Class cls4 = cls2;
                Object[] objArr5 = {Integer.valueOf(ThreeDS2ServiceInstance)};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(-1598850155);
                if (obj2 == null) {
                    Class cls5 = (Class) removeParam.initialize(72 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 7530), 2489 - Color.alpha(0));
                    Object[] objArr6 = new Object[1];
                    b((short) 0, 0, -1, objArr6);
                    obj2 = cls5.getMethod((String) objArr6[0], cls4);
                    map2.put(-1598850155, obj2);
                }
                int intValue = ((Integer) ((Method) obj2).invoke(null, objArr5)).intValue();
                if (get) {
                    int length2 = bArr2.length;
                    onerror.ThreeDS2ServiceInstance = length2;
                    char[] cArr4 = new char[length2];
                    onerror.getWarnings = 0;
                    while (true) {
                        int i5 = onerror.getWarnings;
                        int i6 = onerror.ThreeDS2ServiceInstance;
                        if (i5 >= i6) {
                            objArr2[0] = new String(cArr4);
                            return;
                        }
                        cArr4[i5] = (char) (cArr3[bArr2[(i6 - 1) - i5] + i] - intValue);
                        Object[] objArr7 = {onerror, onerror};
                        Map map3 = removeParam.visaSchemeConfiguration;
                        Object obj3 = map3.get(73542081);
                        if (obj3 == null) {
                            obj3 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (Process.myTid() >> 22), 11440 - TextUtils.lastIndexOf("", '0'))).getMethod("k", Object.class, Object.class);
                            map3.put(73542081, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr7);
                    }
                } else if (getWarnings) {
                    int length3 = charArray.length;
                    onerror.ThreeDS2ServiceInstance = length3;
                    char[] cArr5 = new char[length3];
                    onerror.getWarnings = 0;
                    while (true) {
                        int i7 = onerror.getWarnings;
                        int i8 = onerror.ThreeDS2ServiceInstance;
                        if (i7 >= i8) {
                            objArr2[0] = new String(cArr5);
                            return;
                        }
                        $10 = ($11 + 55) % 128;
                        cArr5[i7] = (char) (cArr3[charArray[(i8 - 1) - i7] - i] - intValue);
                        Object[] objArr8 = {onerror, onerror};
                        Map map4 = removeParam.visaSchemeConfiguration;
                        Object obj4 = map4.get(73542081);
                        if (obj4 == null) {
                            obj4 = ((Class) removeParam.initialize(48 - (KeyEvent.getMaxKeyCode() >> 16), (char) (1 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 11441 - Drawable.resolveOpacity(0, 0))).getMethod("k", Object.class, Object.class);
                            map4.put(73542081, obj4);
                        }
                        ((Method) obj4).invoke(null, objArr8);
                    }
                } else {
                    int length4 = iArr.length;
                    onerror.ThreeDS2ServiceInstance = length4;
                    char[] cArr6 = new char[length4];
                    onerror.getWarnings = 0;
                    while (true) {
                        int i9 = onerror.getWarnings;
                        int i10 = onerror.ThreeDS2ServiceInstance;
                        if (i9 >= i10) {
                            objArr2[0] = new String(cArr6);
                            return;
                        } else {
                            cArr6[i9] = (char) (cArr3[iArr[(i10 - 1) - i9] - i] - intValue);
                            onerror.getWarnings = i9 + 1;
                        }
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0027). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(short s, int i, int i2, Object[] objArr2) {
                int i3;
                byte[] bArr = $$a;
                int i4 = 109 - s;
                int i5 = i * 3;
                int i6 = i2 + 4;
                byte[] bArr2 = new byte[i5 + 1];
                if (bArr == null) {
                    int i7 = i4;
                    i4 = i5;
                    i3 = 0;
                    i4 += i7;
                    bArr2[i3] = (byte) i4;
                    if (i3 == i5) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    i6++;
                    i7 = bArr[i6];
                    i3++;
                    i4 += i7;
                    bArr2[i3] = (byte) i4;
                    if (i3 == i5) {
                    }
                } else {
                    i3 = 0;
                    bArr2[i3] = (byte) i4;
                    if (i3 == i5) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{63, -43, 36, 124};
                $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public findFragmentById get(nq nqVar, String str, boolean z) {
                createTransaction = (ThreeDS2ServiceInitializationCallback + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                String str2 = (String) oj.getWarnings(nqVar.initialize(str), "");
                if (ne.get(strArr, str2, z)) {
                    findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                    ThreeDS2ServiceInitializationCallback = (createTransaction + 3) % 128;
                    return findfragmentbyid;
                }
                setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                Object[] objArr2 = new Object[1];
                a(null, null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u008b\u008a\u0089\u0088\u0087\u0099\u0085\u0096\u0095\u0082\u0094\u0087\u0095\u0082\u0096\u0086\u0091\u0098\u0087\u0097\u008b\u008a\u0089\u0088\u0087\u0099\u008a\u0085\u0096\u0095\u0082\u0094\u0087\u0093\u0085\u0086\u0092\u0085\u0091\u0091\u0098\u0087\u0097\u008a\u0085\u0096\u0095\u0082\u0094\u0087\u0093\u0085\u0086\u0092\u0085\u0091\u0091\u0082\u0087\u008d\u008c\u0090\u0086\u008c\u008f\u0087\u0086\u008e\u008d\u0087\u008a\u008c\u0087\u008b\u008a\u0089\u0088\u0087\u0083\u0085\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
                String intern = ((String) objArr2[0]).intern();
                String[] strArr2 = strArr;
                Object[] objArr3 = new Object[1];
                a(null, null, 126 - TextUtils.lastIndexOf("", '0', 0), "\u009a", objArr3);
                return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(intern, str, oj.ThreeDS2Service(strArr2, ((String) objArr3[0]).intern()), str2))}}, 695740153, -695740153, (int) System.currentTimeMillis());
            }
        };
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        initialize = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return compareto;
    }

    private static /* synthetic */ Object getParamValue(Object[] objArr) {
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.24
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static short[] ThreeDS2Service;
            private static int ThreeDS2ServiceInstance;
            private static int cleanup;
            private static int createTransaction;
            private static int get;
            private static byte[] getWarnings;
            private static int initialize;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                cleanup = 0;
                createTransaction = 1;
                ThreeDS2ServiceInstance = -1307506175;
                initialize = -1686431720;
                get = -1842838884;
                getWarnings = new byte[]{-14, 86, -46, 35, -92, -25, -9, 21, 28, 26, -26, 11, 42, -22, -92, 21, 27, -19, -32, 31, 86, -89, 89, -76, 29, 25, 86, -75, 18, 81, -37, -14, 86, -46, 35, -74, 21, -23, 23, -32, 20, -9, 9, 9, 24};
            }

            private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr2) {
                boolean z;
                boolean z2;
                long j;
                int i4;
                byte[] bArr;
                boolean z3;
                Object method;
                getSDKVersion getsdkversion = new getSDKVersion();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr3 = {Integer.valueOf(i3), Integer.valueOf(initialize)};
                    int i5 = 0;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(981393365);
                    Class cls = Integer.TYPE;
                    if (obj == null) {
                        Class cls2 = (Class) removeParam.initialize(62 - View.MeasureSpec.getSize(0), (char) TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 655);
                        Object[] objArr4 = new Object[1];
                        b((short) 0, 0, (byte) 0, objArr4);
                        obj = cls2.getMethod((String) objArr4[0], cls, cls);
                        map.put(981393365, obj);
                    }
                    int intValue = ((Integer) ((Method) obj).invoke(null, objArr3)).intValue();
                    if (intValue == -1) {
                        $10 = ($11 + 93) % 128;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        byte[] bArr2 = getWarnings;
                        if (bArr2 != null) {
                            int length = bArr2.length;
                            j = 2786809877878216728L;
                            byte[] bArr3 = new byte[length];
                            $10 = ($11 + 47) % 128;
                            int i6 = 0;
                            while (i6 < length) {
                                Object[] objArr5 = {Integer.valueOf(bArr2[i6])};
                                Map map2 = removeParam.visaSchemeConfiguration;
                                Object obj2 = map2.get(-1684720202);
                                if (obj2 != null) {
                                    bArr = bArr2;
                                    method = obj2;
                                    z3 = z;
                                } else {
                                    bArr = bArr2;
                                    Class cls3 = (Class) removeParam.initialize(Color.rgb(i5, i5, i5) + 16777275, (char) View.combineMeasuredStates(i5, i5), 3162 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                    Object[] objArr6 = new Object[1];
                                    z3 = z;
                                    b((short) 0, 0, (byte) 2, objArr6);
                                    method = cls3.getMethod((String) objArr6[0], cls);
                                    map2.put(-1684720202, method);
                                }
                                bArr3[i6] = ((Byte) ((Method) method).invoke(null, objArr5)).byteValue();
                                i6++;
                                bArr2 = bArr;
                                z = z3;
                                i5 = 0;
                            }
                            bArr2 = bArr3;
                        } else {
                            j = 2786809877878216728L;
                        }
                        z2 = z;
                        if (bArr2 != null) {
                            $10 = ($11 + 35) % 128;
                            byte[] bArr4 = getWarnings;
                            Object[] objArr7 = {Integer.valueOf(i2), Integer.valueOf(ThreeDS2ServiceInstance)};
                            Map map3 = removeParam.visaSchemeConfiguration;
                            Object obj3 = map3.get(981393365);
                            if (obj3 == null) {
                                Class cls4 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionChild(0L) + 63, (char) Gravity.getAbsoluteGravity(0, 0), 655 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                Object[] objArr8 = new Object[1];
                                b((short) 0, 0, (byte) 0, objArr8);
                                obj3 = cls4.getMethod((String) objArr8[0], cls, cls);
                                map3.put(981393365, obj3);
                            }
                            intValue = (byte) (((byte) (bArr4[((Integer) ((Method) obj3).invoke(null, objArr7)).intValue()] ^ j)) + ((int) (initialize ^ j)));
                        } else {
                            intValue = (short) (((short) (ThreeDS2Service[i2 + ((int) (ThreeDS2ServiceInstance ^ j))] ^ j)) + ((int) (initialize ^ j)));
                        }
                    } else {
                        z2 = z;
                        j = 2786809877878216728L;
                    }
                    if (intValue > 0) {
                        int i7 = ((i2 + intValue) - 2) + ((int) (ThreeDS2ServiceInstance ^ j));
                        if (z2) {
                            $10 = ($11 + 119) % 128;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        getsdkversion.ThreeDS2ServiceInstance = i7 + i4;
                        Object[] objArr9 = {getsdkversion, Integer.valueOf(i), Integer.valueOf(get), sb};
                        Map map4 = removeParam.visaSchemeConfiguration;
                        Object obj4 = map4.get(-1855485602);
                        if (obj4 == null) {
                            Class cls5 = (Class) removeParam.initialize(54 - View.MeasureSpec.getMode(0), (char) (13764 - Color.argb(0, 0, 0, 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2802);
                            Object[] objArr10 = new Object[1];
                            b((short) 0, 0, (byte) 1, objArr10);
                            obj4 = cls5.getMethod((String) objArr10[0], Object.class, cls, cls, Object.class);
                            map4.put(-1855485602, obj4);
                        }
                        ((StringBuilder) ((Method) obj4).invoke(null, objArr9)).append(getsdkversion.ThreeDS2Service);
                        getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                        byte[] bArr5 = getWarnings;
                        if (bArr5 != null) {
                            int length2 = bArr5.length;
                            byte[] bArr6 = new byte[length2];
                            int i8 = 0;
                            while (i8 < length2) {
                                int i9 = $11 + 115;
                                $10 = i9 % 128;
                                if (i9 % 2 != 0) {
                                    bArr6[i8] = (byte) (bArr5[i8] & j);
                                    i8 %= 1;
                                } else {
                                    bArr6[i8] = (byte) (bArr5[i8] ^ j);
                                    i8++;
                                }
                            }
                            bArr5 = bArr6;
                        }
                        boolean z4 = bArr5 != null;
                        int i10 = 1;
                        while (true) {
                            getsdkversion.initialize = i10;
                            if (getsdkversion.initialize >= intValue) {
                                break;
                            }
                            if (z4) {
                                $10 = ($11 + 103) % 128;
                                byte[] bArr7 = getWarnings;
                                getsdkversion.ThreeDS2ServiceInstance = getsdkversion.ThreeDS2ServiceInstance - 1;
                                getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((byte) (((byte) (bArr7[r1] ^ j)) + s)) ^ b));
                            } else {
                                short[] sArr = ThreeDS2Service;
                                getsdkversion.ThreeDS2ServiceInstance = getsdkversion.ThreeDS2ServiceInstance - 1;
                                getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[r1] ^ j)) + s)) ^ b));
                                $10 = ($11 + 61) % 128;
                            }
                            sb.append(getsdkversion.ThreeDS2Service);
                            getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                            i10 = getsdkversion.initialize + 1;
                        }
                    }
                    objArr2[0] = sb.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(short s, int i, byte b, Object[] objArr2) {
                int i2;
                int i3 = 4 - (s * 4);
                int i4 = 104 - b;
                byte[] bArr = $$a;
                int i5 = i * 4;
                byte[] bArr2 = new byte[i5 + 1];
                if (bArr == null) {
                    int i6 = i5;
                    i2 = 0;
                    i4 += i6;
                    i3++;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i5) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    i2++;
                    i6 = bArr[i3];
                    i4 += i6;
                    i3++;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i5) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i5) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{PnmConstants.PNM_SEPARATOR, 84, 47, -66};
                $$b = 13;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public findFragmentById get(nq nqVar, String str, boolean z) {
                int i = createTransaction + 15;
                cleanup = i % 128;
                if (i % 2 != 0) {
                    om.getWarnings((String) oj.getWarnings(nqVar.initialize(str), ""));
                    throw null;
                }
                String str2 = (String) oj.getWarnings(nqVar.initialize(str), "");
                if (om.getWarnings(str2)) {
                    return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                }
                setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                Object[] objArr2 = new Object[1];
                a((-156473908) - KeyEvent.getDeadChar(0, 0), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), (short) View.resolveSize(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 694817305, (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 45, objArr2);
                findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(((String) objArr2[0]).intern(), str, str2))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                int i2 = createTransaction + 51;
                cleanup = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 72 / 0;
                }
                return findfragmentbyid;
            }
        };
        int i = initialize + 51;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            int i2 = 0 / 0;
        }
        return compareto;
    }

    private static /* synthetic */ Object getSDKInfo(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        boolean booleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 7;
        int i3 = -(-((i ^ 7) | i2));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        initialize = i4;
        if (!booleanValue) {
            ThreeDS2ServiceInstance = ((i4 ^ 1) + ((i4 & 1) << 1)) % 128;
            if (str.length() != str2.length()) {
                int i5 = initialize;
                int i6 = ((i5 & (-58)) | ((~i5) & 57)) + ((i5 & 57) << 1);
                ThreeDS2ServiceInstance = i6 % 128;
                if (i6 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
        }
        if (!om.getWarnings(str)) {
            int i7 = initialize + 67;
            ThreeDS2ServiceInstance = i7 % 128;
            if (i7 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        int i8 = initialize;
        int i9 = i8 & 19;
        ThreeDS2ServiceInstance = ((((i8 ^ 19) | i9) << 1) - ((i8 | 19) & (~i9))) % 128;
        boolean warnings = ok.getWarnings(Integer.valueOf(str2), Integer.valueOf(str3)).getWarnings(Integer.valueOf((int) Double.parseDouble(str)));
        int i10 = initialize + 15;
        ThreeDS2ServiceInstance = i10 % 128;
        if (i10 % 2 != 0) {
            return Boolean.valueOf(warnings);
        }
        int i11 = 8 / 0;
        return Boolean.valueOf(warnings);
    }

    private static /* synthetic */ Object getSDKVersion(Object[] objArr) {
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static long ThreeDS2ServiceInstance;
            private static int get;
            private static int getWarnings;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                getWarnings = 0;
                get = 1;
                ThreeDS2ServiceInstance = 6304534502166873297L;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0174  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(String str, int i, Object[] objArr2) {
                Throwable cause;
                int i2;
                int i3 = $11 + 63;
                $10 = i3 % 128;
                char c = 2;
                if (i3 % 2 != 0) {
                    throw null;
                }
                char[] charArray = str != null ? str.toCharArray() : str;
                addParam addparam = new addParam();
                addparam.initialize = i;
                int length = charArray.length;
                long[] jArr = new long[length];
                addparam.ThreeDS2Service = 0;
                $10 = ($11 + 29) % 128;
                while (true) {
                    int i4 = addparam.ThreeDS2Service;
                    if (i4 >= charArray.length) {
                        break;
                    }
                    char c2 = charArray[i4];
                    try {
                        Object[] objArr3 = new Object[3];
                        objArr3[c] = addparam;
                        objArr3[1] = addparam;
                        objArr3[0] = Integer.valueOf(c2);
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-983980093);
                        if (obj != null) {
                            i2 = 1;
                        } else {
                            i2 = 1;
                            obj = ((Class) removeParam.initialize(66 - (ViewConfiguration.getScrollBarSize() >> 8), (char) TextUtils.getOffsetBefore("", 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 12512)).getMethod("e", Integer.TYPE, Object.class, Object.class);
                            map.put(-983980093, obj);
                        }
                        jArr[i4] = ((Long) ((Method) obj).invoke(null, objArr3)).longValue() ^ (ThreeDS2ServiceInstance ^ 6009743645011411028L);
                        Object[] objArr4 = new Object[2];
                        objArr4[i2] = addparam;
                        objArr4[0] = addparam;
                        Object obj2 = map.get(-1840119381);
                        if (obj2 == null) {
                            Class cls = (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatDelay() >> 16) + 76, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 62098), 2103 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                            Object[] objArr5 = new Object[i2];
                            b(0, (short) 0, (short) 0, objArr5);
                            obj2 = cls.getMethod((String) objArr5[0], Object.class, Object.class);
                            map.put(-1840119381, obj2);
                        }
                        ((Method) obj2).invoke(null, objArr4);
                        $11 = ($10 + 21) % 128;
                        c = 2;
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
                char[] cArr = new char[length];
                addparam.ThreeDS2Service = 0;
                while (true) {
                    int i5 = addparam.ThreeDS2Service;
                    if (i5 >= charArray.length) {
                        objArr2[0] = new String(cArr);
                        return;
                    }
                    $11 = ($10 + 61) % 128;
                    cArr[i5] = (char) jArr[i5];
                    Object[] objArr6 = {addparam, addparam};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(-1840119381);
                    if (obj3 == null) {
                        Class cls2 = (Class) removeParam.initialize(77 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (62097 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Drawable.resolveOpacity(0, 0) + 2102);
                        Object[] objArr7 = new Object[1];
                        b(0, (short) 0, (short) 0, objArr7);
                        obj3 = cls2.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1840119381, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                    $10 = ($11 + 53) % 128;
                }
            }

            private static void b(int i, short s, short s2, Object[] objArr2) {
                int i2 = i * 4;
                int i3 = 99 - (s * 3);
                byte[] bArr = $$a;
                int i4 = (s2 * 4) + 4;
                byte[] bArr2 = new byte[1 - i2];
                int i5 = 0 - i2;
                int i6 = -1;
                if (bArr == null) {
                    i4++;
                    i3 = i5 + i3;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i3;
                    if (i6 == i5) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    } else {
                        byte b = bArr[i4];
                        i4++;
                        i3 += b;
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{4, 5, 20, -37};
                $$b = 79;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0090, code lost:
            
                return (com.netcetera.threeds.sdk.infrastructure.findFragmentById) com.netcetera.threeds.sdk.infrastructure.findFragmentById.initialize(new java.lang.Object[0], -2096046705, 2096046707, (int) java.lang.System.currentTimeMillis());
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
            
                if (r4.equals(((java.lang.String) r2[0]).intern()) == false) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
            
                if (r4.equals(((java.lang.String) r2[0]).intern()) == false) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
            
                r2 = new java.lang.Object[1];
                a("쓾믫", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 32531, r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x007a, code lost:
            
                if (r4.equals(((java.lang.String) r2[0]).intern()) == false) goto L14;
             */
            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public findFragmentById get(nq nqVar, String str, boolean z) {
                get = (getWarnings + 15) % 128;
                String str2 = (String) oj.getWarnings(nqVar.initialize(str), "");
                if (!oj.get(str2)) {
                    int i = getWarnings + 85;
                    get = i % 128;
                    if (i % 2 == 0) {
                        Object[] objArr2 = new Object[1];
                        a("쓞⅝", 58757 >>> Color.alpha(1), objArr2);
                    } else {
                        Object[] objArr3 = new Object[1];
                        a("쓞⅝", Color.alpha(0) + 58757, objArr3);
                    }
                }
                setTextAlignment settextalignment = setTextAlignment.getSDKEphemeralPublicKey;
                Object[] objArr4 = new Object[1];
                a("쓗ᱯ痪䵝ꛐ︼ힺ⼈Ý姲녲諒\ue250㮫ጲ璐䰐ꖈﺫ홃⾌ݍ墒끼覃\ue11d㩷Ꮀ歑䳄ꐢﶧ픀⺄؏弧냺衁\ue1d1㤸ኼ樋䎝ꓳﰱ헃ⵚڴ帡랣轋\ue08e㧨ᅲ櫚䉙", TextUtils.getCapsMode("", 0, 0) + 55439, objArr4);
                return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(((String) objArr4[0]).intern(), str))}}, 695740153, -695740153, (int) System.currentTimeMillis());
            }
        };
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 93;
        int i3 = (i ^ 93) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return compareto;
        }
        throw null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.9
            private static int $10 = 0;
            private static int $11 = 1;
            private static int ThreeDS2Service = 0;
            private static char ThreeDS2ServiceInstance = 9390;
            private static char get = 20315;
            private static int getSDKInfo = 1;
            private static char getWarnings = 11751;
            private static char initialize = 53003;

            private static void a(String str, int i, Object[] objArr2) {
                int i2;
                char[] charArray = str != null ? str.toCharArray() : str;
                ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
                char[] cArr = new char[charArray.length];
                int i3 = 0;
                configurationBuilder.ThreeDS2ServiceInstance = 0;
                int i4 = 2;
                char[] cArr2 = new char[2];
                while (true) {
                    int i5 = configurationBuilder.ThreeDS2ServiceInstance;
                    if (i5 >= charArray.length) {
                        int i6 = i3;
                        String str2 = new String(cArr, i6, i);
                        $11 = ($10 + 81) % 128;
                        objArr2[i6] = str2;
                        return;
                    }
                    cArr2[i3] = charArray[i5];
                    char c = 1;
                    cArr2[1] = charArray[i5 + 1];
                    int i7 = 58224;
                    int i8 = i3;
                    while (i8 < 16) {
                        char c2 = cArr2[c];
                        char c3 = cArr2[i3];
                        char c4 = c;
                        int i9 = (c3 + i7) ^ ((c3 << 4) + ((char) (initialize ^ (-1730380012335540218L))));
                        int i10 = c3 >>> 5;
                        int i11 = i4;
                        try {
                            Object[] objArr3 = new Object[4];
                            objArr3[3] = Integer.valueOf(get);
                            objArr3[i11] = Integer.valueOf(i10);
                            objArr3[c4] = Integer.valueOf(i9);
                            objArr3[i3] = Integer.valueOf(c2);
                            Map map = removeParam.visaSchemeConfiguration;
                            Object obj = map.get(936379577);
                            Class cls = Integer.TYPE;
                            if (obj != null) {
                                i2 = i3;
                            } else {
                                i2 = i3;
                                obj = ((Class) removeParam.initialize(66 - Process.getGidForName(""), (char) (62396 - View.MeasureSpec.makeMeasureSpec(i3, i3)), 5352 - TextUtils.getTrimmedLength(""))).getMethod("C", cls, cls, cls, cls);
                                map.put(936379577, obj);
                            }
                            char charValue = ((Character) ((Method) obj).invoke(null, objArr3)).charValue();
                            cArr2[c4] = charValue;
                            char c5 = cArr2[i2];
                            char[] cArr3 = charArray;
                            int i12 = (charValue + i7) ^ ((charValue << 4) + ((char) (ThreeDS2ServiceInstance ^ (-1730380012335540218L))));
                            int i13 = charValue >>> 5;
                            Object[] objArr4 = new Object[4];
                            objArr4[3] = Integer.valueOf(getWarnings);
                            objArr4[i11] = Integer.valueOf(i13);
                            objArr4[c4] = Integer.valueOf(i12);
                            objArr4[i2] = Integer.valueOf(c5);
                            Object obj2 = map.get(936379577);
                            if (obj2 == null) {
                                obj2 = ((Class) removeParam.initialize(68 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (62396 - Color.blue(i2)), View.MeasureSpec.getMode(i2) + 5352)).getMethod("C", cls, cls, cls, cls);
                                map.put(936379577, obj2);
                            }
                            cArr2[i2] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                            i7 -= 40503;
                            i8++;
                            $10 = ($11 + 61) % 128;
                            c = c4;
                            i4 = i11;
                            i3 = i2;
                            charArray = cArr3;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr4 = charArray;
                    int i14 = i3;
                    int i15 = i4;
                    char c6 = c;
                    int i16 = configurationBuilder.ThreeDS2ServiceInstance;
                    cArr[i16] = cArr2[i14];
                    cArr[i16 + 1] = cArr2[c6];
                    Object[] objArr5 = new Object[i15];
                    objArr5[c6] = configurationBuilder;
                    objArr5[i14] = configurationBuilder;
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(108358357);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(53 - Process.getGidForName(""), (char) (39910 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7058)).getMethod("B", Object.class, Object.class);
                        map2.put(108358357, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                    i4 = i15;
                    i3 = i14;
                    charArray = cArr4;
                }
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public findFragmentById get(nq nqVar, String str, boolean z) {
                String str2 = (String) oj.getWarnings(nqVar.initialize(str), "");
                Object[] objArr2 = new Object[1];
                a("ＺȖ", 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
                String intern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                a("\uf60d爃", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr3);
                String intern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                a("⼱雋", -ImageFormat.getBitsPerPixel(0), objArr4);
                String intern3 = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                a("Όꉶ", 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr5);
                String intern4 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                a("ᡚ栂", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr6);
                for (String str3 : Arrays.asList(intern, intern2, intern3, intern4, ((String) objArr6[0]).intern())) {
                    if (oj.ThreeDS2ServiceInstance(str2, str3)) {
                        if (!z) {
                            setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                            Object[] objArr7 = new Object[1];
                            a("ปᵱ稯騻嫢\ud957᠀㾬멷ꎇ䫵\uedac뒡쀍䫵\uedac餼輻\u18fc㡄ⴾ⹇㼘柢⩥\udd68ᕡ¦単牁閷眜餼輻\ud83e틳嚈결ปᵱ稯騻", 41 - TextUtils.lastIndexOf("", '0', 0, 0), objArr7);
                            findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(((String) objArr7[0]).intern(), str, str3))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                            ThreeDS2Service = (getSDKInfo + 39) % 128;
                            return findfragmentbyid;
                        }
                        no noVar = (no) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 1464134729, -1464134714, (int) System.currentTimeMillis());
                        Object[] objArr8 = new Object[1];
                        a("ปᵱ稯騻嫢\ud957᠀㾬멷ꎇ䫵\uedac뒡쀍䫵\uedac餼輻\u18fc㡄ⴾ⹇㼘柢⩥\udd68ᕡ¦単牁閷眜餼輻\ud83e틳嚈결ปᵱ稯騻", (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 42, objArr8);
                        noVar.initialize(String.format(((String) objArr8[0]).intern(), str, str3));
                    }
                }
                try {
                    Base64.decode(str2.getBytes(Charset.defaultCharset()), 8);
                    int i = ThreeDS2Service + 69;
                    getSDKInfo = i % 128;
                    if (i % 2 != 0) {
                        return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                    }
                    throw null;
                } catch (IllegalArgumentException unused) {
                    setTextAlignment settextalignment2 = setTextAlignment.getSDKReferenceNumber;
                    Object[] objArr9 = new Object[1];
                    a("ෳ鷯䃉짚벯䷩揮๊竇帲餼輻\ud83e틳嚈결톕ꠅ\uefca\uf897\uf661缊Ʀ蔋ᱸ箚\ue1bc鸞ᄳ峛돟螚䜹ⳣ酩㏠䚶੯酩㏠勦뗲", TextUtils.indexOf((CharSequence) "", '0') + 42, objArr9);
                    return (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment2, str, ((String) objArr9[0]).intern())}}, 695740153, -695740153, (int) System.currentTimeMillis());
                }
            }
        };
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 125;
        int i3 = (i2 - (~(-(-((i ^ 125) | i2))))) - 1;
        initialize = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 14 / 0;
        }
        return compareto;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        bool.booleanValue();
        int i = initialize;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        ThreeDS2ServiceInstance = i2 % 128;
        Object[] objArr2 = {str, str2, str3, bool};
        if (i2 % 2 == 0) {
            ((Boolean) ThreeDS2ServiceInstance(objArr2, -1658579007, 1658579019, (int) System.currentTimeMillis())).booleanValue();
            throw null;
        }
        boolean booleanValue = ((Boolean) ThreeDS2ServiceInstance(objArr2, -1658579007, 1658579019, (int) System.currentTimeMillis())).booleanValue();
        initialize = (ThreeDS2ServiceInstance + 101) % 128;
        return Boolean.valueOf(booleanValue);
    }

    private static /* synthetic */ Object onError(Object[] objArr) {
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.13
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static char ThreeDS2Service;
            private static int ThreeDS2ServiceInstance;
            private static int getWarnings;
            private static char[] initialize;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                getWarnings = 0;
                ThreeDS2ServiceInstance = 1;
                initialize = new char[]{37978, 37889, 37898, 37895, 37911, 37983, 37902, 37891, 37927, 37897, 37921, 37915, 37896, 37907, 37930, 37919};
                ThreeDS2Service = (char) 41444;
            }

            private static void a(byte b, String str, int i, Object[] objArr2) {
                char[] cArr;
                int i2;
                long j;
                char c;
                float f;
                char[] cArr2;
                char[] cArr3;
                int i3;
                Object method;
                if (str != null) {
                    cArr = str.toCharArray();
                    $10 = ($11 + 45) % 128;
                } else {
                    cArr = str;
                }
                char[] cArr4 = cArr;
                getParamValue getparamvalue = new getParamValue();
                char[] cArr5 = initialize;
                Class cls = Integer.TYPE;
                int i4 = 0;
                if (cArr5 != null) {
                    int length = cArr5.length;
                    char[] cArr6 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = $11 + 37;
                        $10 = i6 % 128;
                        if (i6 % 2 != 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr5[i5])};
                                Map map = removeParam.visaSchemeConfiguration;
                                Object obj = map.get(-78420608);
                                if (obj != null) {
                                    cArr2 = cArr4;
                                    cArr3 = cArr5;
                                    i3 = i4;
                                    method = obj;
                                } else {
                                    i3 = i4;
                                    Class cls2 = (Class) removeParam.initialize(TextUtils.getCapsMode("", i4, i4) + 94, (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.alpha(i3) + 1559);
                                    byte b2 = (byte) ($$b & 7);
                                    byte b3 = (byte) (b2 - 1);
                                    cArr2 = cArr4;
                                    cArr3 = cArr5;
                                    Object[] objArr4 = new Object[1];
                                    b(b2, b3, (byte) (b3 - 1), objArr4);
                                    method = cls2.getMethod((String) objArr4[i3], cls);
                                    map.put(-78420608, method);
                                }
                                cArr6[i5] = ((Character) ((Method) method).invoke(null, objArr3)).charValue();
                                i5 /= 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            cArr2 = cArr4;
                            cArr3 = cArr5;
                            i3 = i4;
                            Object[] objArr5 = {Integer.valueOf(cArr3[i5])};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj2 = map2.get(-78420608);
                            if (obj2 == null) {
                                Class cls3 = (Class) removeParam.initialize((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 93, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1559);
                                byte b4 = (byte) ($$b & 7);
                                byte b5 = (byte) (b4 - 1);
                                Object[] objArr6 = new Object[1];
                                b(b4, b5, (byte) (b5 - 1), objArr6);
                                obj2 = cls3.getMethod((String) objArr6[i3], cls);
                                map2.put(-78420608, obj2);
                            }
                            cArr6[i5] = ((Character) ((Method) obj2).invoke(null, objArr5)).charValue();
                            i5++;
                        }
                        $11 = ($10 + 63) % 128;
                        i4 = i3;
                        cArr4 = cArr2;
                        cArr5 = cArr3;
                    }
                    cArr5 = cArr6;
                }
                char[] cArr7 = cArr4;
                int i7 = i4;
                float f2 = RecyclerView.DECELERATION_RATE;
                Object[] objArr7 = {Integer.valueOf(ThreeDS2Service)};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(-78420608);
                long j2 = 0;
                if (obj3 == null) {
                    Class cls4 = (Class) removeParam.initialize(94 - ExpandableListView.getPackedPositionType(0L), (char) (TextUtils.lastIndexOf("", '0', i7) + 1), 1559 - View.combineMeasuredStates(i7, i7));
                    byte b6 = (byte) ($$b & 7);
                    byte b7 = (byte) (b6 - 1);
                    Object[] objArr8 = new Object[1];
                    b(b6, b7, (byte) (b7 - 1), objArr8);
                    obj3 = cls4.getMethod((String) objArr8[0], cls);
                    map3.put(-78420608, obj3);
                }
                char charValue = ((Character) ((Method) obj3).invoke(null, objArr7)).charValue();
                char[] cArr8 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr8[i2] = (char) (cArr7[i2] - b);
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
                        char c2 = cArr7[i8];
                        getparamvalue.get = c2;
                        char c3 = cArr7[i8 + 1];
                        getparamvalue.initialize = c3;
                        if (c2 == c3) {
                            cArr8[i8] = (char) (c2 - b);
                            cArr8[i8 + 1] = (char) (c3 - b);
                            j = j2;
                            f = f2;
                        } else {
                            Object[] objArr9 = {getparamvalue, getparamvalue, Integer.valueOf(charValue), getparamvalue, getparamvalue, Integer.valueOf(charValue), getparamvalue, getparamvalue, Integer.valueOf(charValue), getparamvalue, getparamvalue, Integer.valueOf(charValue), getparamvalue};
                            Map map4 = removeParam.visaSchemeConfiguration;
                            j = j2;
                            Object obj4 = map4.get(-1395483366);
                            if (obj4 != null) {
                                c = 6;
                            } else {
                                c = 6;
                                Class cls5 = (Class) removeParam.initialize(TextUtils.indexOf("", "", 0, 0) + 48, (char) View.resolveSizeAndState(0, 0, 0), KeyEvent.normalizeMetaState(0) + 3221);
                                Object[] objArr10 = new Object[1];
                                b((short) 0, 0, (short) -1, objArr10);
                                String str2 = (String) objArr10[0];
                                Class cls6 = Integer.TYPE;
                                obj4 = cls5.getMethod(str2, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class);
                                map4.put(-1395483366, obj4);
                            }
                            int intValue = ((Integer) ((Method) obj4).invoke(null, objArr9)).intValue();
                            int i9 = getparamvalue.cleanup;
                            if (intValue == i9) {
                                Object[] objArr11 = new Object[11];
                                objArr11[10] = getparamvalue;
                                objArr11[9] = Integer.valueOf(charValue);
                                objArr11[8] = getparamvalue;
                                objArr11[7] = Integer.valueOf(charValue);
                                objArr11[c] = Integer.valueOf(charValue);
                                objArr11[5] = getparamvalue;
                                objArr11[4] = getparamvalue;
                                objArr11[3] = Integer.valueOf(charValue);
                                objArr11[2] = Integer.valueOf(charValue);
                                objArr11[1] = getparamvalue;
                                objArr11[0] = getparamvalue;
                                Object obj5 = map4.get(1507360409);
                                if (obj5 != null) {
                                    f = f2;
                                } else {
                                    f = f2;
                                    Class cls7 = (Class) removeParam.initialize(47 - TextUtils.indexOf("", "", 0), (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 25643), (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 11489);
                                    Class cls8 = Integer.TYPE;
                                    obj5 = cls7.getMethod("x", Object.class, Object.class, cls8, cls8, Object.class, Object.class, cls8, cls8, Object.class, cls8, Object.class);
                                    map4.put(1507360409, obj5);
                                }
                                int intValue2 = ((Integer) ((Method) obj5).invoke(null, objArr11)).intValue();
                                int i10 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                                int i11 = getparamvalue.getWarnings;
                                cArr8[i11] = cArr5[intValue2];
                                cArr8[i11 + 1] = cArr5[i10];
                            } else {
                                f = f2;
                                int i12 = getparamvalue.ThreeDS2Service;
                                int i13 = getparamvalue.ThreeDS2ServiceInstance;
                                if (i12 == i13) {
                                    $10 = ($11 + 121) % 128;
                                    int m = Thread$State$EnumUnboxingLocalUtility.m(getparamvalue.ThreeDS2ServiceInitializationCallback, charValue, 1, charValue);
                                    getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                                    int m2 = Thread$State$EnumUnboxingLocalUtility.m(i9, charValue, 1, charValue);
                                    getparamvalue.cleanup = m2;
                                    int i14 = (i13 * charValue) + m2;
                                    int i15 = getparamvalue.getWarnings;
                                    cArr8[i15] = cArr5[(i12 * charValue) + m];
                                    cArr8[i15 + 1] = cArr5[i14];
                                } else {
                                    int i16 = (i12 * charValue) + i9;
                                    int i17 = (i13 * charValue) + getparamvalue.ThreeDS2ServiceInitializationCallback;
                                    int i18 = getparamvalue.getWarnings;
                                    cArr8[i18] = cArr5[i16];
                                    cArr8[i18 + 1] = cArr5[i17];
                                }
                            }
                        }
                        getparamvalue.getWarnings += 2;
                        f2 = f;
                        j2 = j;
                    }
                }
                for (int i19 = 0; i19 < i; i19++) {
                    cArr8[i19] = (char) (cArr8[i19] ^ 13722);
                }
                objArr2[0] = new String(cArr8);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(short s, int i, short s2, Object[] objArr2) {
                int i2;
                int i3 = (s * 2) + 117;
                byte[] bArr = $$a;
                int i4 = s2 + 4;
                int i5 = i * 3;
                byte[] bArr2 = new byte[i5 + 1];
                if (bArr == null) {
                    byte[] bArr3 = bArr;
                    int i6 = 0;
                    int i7 = i4;
                    i3 = (-i3) + i4;
                    i4 = i7;
                    bArr = bArr3;
                    i2 = i6;
                    int i8 = i4 + 1;
                    bArr2[i2] = (byte) i3;
                    i6 = i2 + 1;
                    if (i2 == i5) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    byte b = bArr[i8];
                    i4 = i3;
                    i3 = b;
                    bArr3 = bArr;
                    i7 = i8;
                    i3 = (-i3) + i4;
                    i4 = i7;
                    bArr = bArr3;
                    i2 = i6;
                    int i82 = i4 + 1;
                    bArr2[i2] = (byte) i3;
                    i6 = i2 + 1;
                    if (i2 == i5) {
                    }
                } else {
                    i2 = 0;
                    int i822 = i4 + 1;
                    bArr2[i2] = (byte) i3;
                    i6 = i2 + 1;
                    if (i2 == i5) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{78, -119, -4, 27};
                $$b = EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
            
                if (r6.equals(((java.lang.String) r5[0]).intern()) != false) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x00a6, code lost:
            
                return (com.netcetera.threeds.sdk.infrastructure.findFragmentById) com.netcetera.threeds.sdk.infrastructure.findFragmentById.initialize(new java.lang.Object[0], -2096046705, 2096046707, (int) java.lang.System.currentTimeMillis());
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
            
                if (r6.equals(((java.lang.String) r5[0]).intern()) != false) goto L18;
             */
            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public findFragmentById get(nq nqVar, String str, boolean z) {
                int i = ThreeDS2ServiceInstance + 13;
                getWarnings = i % 128;
                if (i % 2 != 0) {
                    oj.get((String) oj.getWarnings(nqVar.initialize(str), ""));
                    throw null;
                }
                String str2 = (String) oj.getWarnings(nqVar.initialize(str), "");
                if (!oj.get(str2)) {
                    Object[] objArr2 = new Object[1];
                    a((byte) (TextUtils.getOffsetAfter("", 0) + 93), "\u000b\t", Color.red(0) + 2, objArr2);
                    if (!str2.equals(((String) objArr2[0]).intern())) {
                        int i2 = ThreeDS2ServiceInstance + 115;
                        getWarnings = i2 % 128;
                        if (i2 % 2 != 0) {
                            Object[] objArr3 = new Object[1];
                            a((byte) (TextUtils.indexOf("", "") + 120), "\u0002\u0000", 5 / View.MeasureSpec.getSize(0), objArr3);
                        } else {
                            Object[] objArr4 = new Object[1];
                            a((byte) (TextUtils.indexOf("", "") + 42), "\u0002\u0000", 2 - View.MeasureSpec.getSize(0), objArr4);
                        }
                    }
                }
                setTextAlignment settextalignment = setTextAlignment.getSDKReferenceNumber;
                Object[] objArr5 = new Object[1];
                a((byte) (77 - TextUtils.getOffsetBefore("", 0)), "\u000f\n\u000f\b\u0007\f\u0007\u000e\u0000\u0004\t\u0006\n\t\u0001\f\b\u0001\f\u0007\u0006\n㘰", 23 - (ViewConfiguration.getTapTimeout() >> 16), objArr5);
                findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(((String) objArr5[0]).intern(), str))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                int i3 = getWarnings + 31;
                ThreeDS2ServiceInstance = i3 % 128;
                if (i3 % 2 != 0) {
                    return findfragmentbyid;
                }
                throw null;
            }
        };
        int i = initialize;
        int i2 = (i ^ 13) + ((i & 13) << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return compareto;
        }
        throw null;
    }

    public static compareTo getSDKVersion() {
        return (compareTo) ThreeDS2ServiceInstance(new Object[0], 550870365, -550870341, (int) System.currentTimeMillis());
    }

    public static compareTo cleanup() {
        return (compareTo) ThreeDS2ServiceInstance(new Object[0], -637702868, 637702893, (int) System.currentTimeMillis());
    }

    public static compareTo get(String... strArr) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{strArr}, 1032208890, -1032208890, (int) System.currentTimeMillis());
    }

    public static compareTo ThreeDS2Service(String... strArr) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{strArr}, -1709207342, 1709207347, (int) System.currentTimeMillis());
    }

    public static compareTo get(String str) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{str}, 1725422414, -1725422412, (int) System.currentTimeMillis());
    }

    public static compareTo ThreeDS2Service(int i) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{Integer.valueOf(i)}, 605561253, -605561234, i);
    }

    public static compareTo get() {
        return (compareTo) ThreeDS2ServiceInstance(new Object[0], 948133992, -948133975, (int) System.currentTimeMillis());
    }

    public static compareTo getWarnings(String... strArr) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{strArr}, -645482314, 645482321, (int) System.currentTimeMillis());
    }

    public static compareTo ThreeDS2Service(setCacheColorHint.getWarnings getwarnings) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{getwarnings}, -1224432618, 1224432628, (int) System.currentTimeMillis());
    }

    public static compareTo getWarnings(Integer num) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{num}, 1099490190, -1099490187, (int) System.currentTimeMillis());
    }

    public static compareTo ThreeDS2Service(String str, String str2) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{str, str2}, 1455066804, -1455066795, (int) System.currentTimeMillis());
    }

    public static compareTo getWarnings(int i) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{Integer.valueOf(i)}, -710732177, 710732200, i);
    }

    public static compareTo ThreeDS2Service(Integer num, Integer num2) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{num, num2}, -735320945, 735320951, (int) System.currentTimeMillis());
    }

    public static compareTo getWarnings() {
        return (compareTo) ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
    }

    public static compareTo ThreeDS2Service() {
        return (compareTo) ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis());
    }

    public static compareTo ThreeDS2Service(int i, int i2) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, -270093239, 270093252, i);
    }

    public static compareTo ThreeDS2ServiceInitializationCallback() {
        return (compareTo) ThreeDS2ServiceInstance(new Object[0], -1045623270, 1045623284, (int) System.currentTimeMillis());
    }

    public static compareTo initialize(int i) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{Integer.valueOf(i)}, 1360902539, -1360902519, i);
    }

    public static compareTo initialize() {
        return (compareTo) ThreeDS2ServiceInstance(new Object[0], 2036384150, -2036384128, (int) System.currentTimeMillis());
    }

    public static compareTo initialize(Integer num) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{num}, 1618462802, -1618462791, (int) System.currentTimeMillis());
    }

    public static compareTo initialize(String str) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{str}, 998418748, -998418727, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        final Integer num = (Integer) objArr[0];
        compareTo compareto = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static long ThreeDS2Service;
            private static int getWarnings;
            private static int initialize;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                initialize = 0;
                getWarnings = 1;
                ThreeDS2Service = 3214100552352114175L;
            }

            private static void a(String str, int i, Object[] objArr2) {
                int i2 = $10 + 71;
                $11 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                char[] charArray = str != null ? str.toCharArray() : str;
                onCompleted oncompleted = new onCompleted();
                char[] initialize2 = onCompleted.initialize(ThreeDS2Service ^ (-2776494906517314268L), charArray, i);
                oncompleted.initialize = 4;
                $11 = ($10 + 71) % 128;
                while (true) {
                    int i3 = oncompleted.initialize;
                    if (i3 >= initialize2.length) {
                        objArr2[0] = new String(initialize2, 4, initialize2.length - 4);
                        return;
                    }
                    int i4 = i3 - 4;
                    oncompleted.ThreeDS2Service = i4;
                    try {
                        Object[] objArr3 = {Long.valueOf(initialize2[i3] ^ initialize2[i3 % 4]), Long.valueOf(i4), Long.valueOf(ThreeDS2Service)};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-1242395160);
                        if (obj == null) {
                            Class cls = (Class) removeParam.initialize(AndroidCharacter.getMirror('0'), (char) (27780 - ((Process.getThreadPriority(0) + 20) >> 6)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2440);
                            Object[] objArr4 = new Object[1];
                            b((byte) 0, (byte) 0, (short) 0, objArr4);
                            String str2 = (String) objArr4[0];
                            Class cls2 = Long.TYPE;
                            obj = cls.getMethod(str2, cls2, cls2, cls2);
                            map.put(-1242395160, obj);
                        }
                        initialize2[i3] = ((Character) ((Method) obj).invoke(null, objArr3)).charValue();
                        Object[] objArr5 = {oncompleted, oncompleted};
                        Object obj2 = map.get(1526822639);
                        if (obj2 == null) {
                            obj2 = ((Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 66, (char) View.MeasureSpec.getSize(0), View.combineMeasuredStates(0, 0) + 14235)).getMethod("s", Object.class, Object.class);
                            map.put(1526822639, obj2);
                        }
                        ((Method) obj2).invoke(null, objArr5);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(byte b, byte b2, short s, Object[] objArr2) {
                int i;
                int i2 = (b * 4) + 112;
                byte[] bArr = $$a;
                int i3 = 1 - (s * 4);
                int i4 = (b2 * 3) + 4;
                byte[] bArr2 = new byte[i3];
                if (bArr == null) {
                    int i5 = i3;
                    i = 0;
                    i4++;
                    i2 += i5;
                    bArr2[i] = (byte) i2;
                    i++;
                    if (i == i3) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    i5 = bArr[i4];
                    i4++;
                    i2 += i5;
                    bArr2[i] = (byte) i2;
                    i++;
                    if (i == i3) {
                    }
                } else {
                    i = 0;
                    bArr2[i] = (byte) i2;
                    i++;
                    if (i == i3) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{126, 35, -39, 100};
                $$b = 71;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public findFragmentById get(nq nqVar, String str, boolean z) {
                getWarnings = (initialize + 113) % 128;
                Integer ThreeDS2Service2 = nqVar.ThreeDS2Service(str);
                if (num.equals(ThreeDS2Service2)) {
                    return (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
                }
                setTextAlignment settextalignment = setTextAlignment.useBridgingExtension;
                Object[] objArr2 = new Object[1];
                a("縲䗷繢㲷⠗䕍㵳⫧紳䇕㧡ⶏ碘䉤㑢⅛琅亵㝭⒫珱䭜㎿㠹潚吠⸀㯋櫏僵⫥㼮榲嵗┽㋦攺妩ↁ㖔悛娳᱐ण屼暁Ἵ\u0cfe寠揩ᮁW均氲ᙑϳ制棐ዠݹ冮畑്ᩎ䴽燽ৎᶯ䣞牌ғᄣ䑽纕ܼᓜ䏏篠ϙ桥㼓ћ繐", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[]{new computeValue[]{new computeValue(settextalignment, str, String.format(((String) objArr2[0]).intern(), str, num, ThreeDS2Service2))}}, 695740153, -695740153, (int) System.currentTimeMillis());
                getWarnings = (initialize + 75) % 128;
                return findfragmentbyid;
            }
        };
        int i = initialize;
        int i2 = i & 69;
        int i3 = (i2 - (~((i ^ 69) | i2))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 != 0) {
            return compareto;
        }
        throw null;
    }

    public static compareTo ThreeDS2ServiceInstance() {
        return (compareTo) ThreeDS2ServiceInstance(new Object[0], 982291278, -982291277, (int) System.currentTimeMillis());
    }

    public static compareTo ThreeDS2ServiceInstance(String str, String str2) {
        return (compareTo) ThreeDS2ServiceInstance(new Object[]{str, str2}, 120740260, -120740242, (int) System.currentTimeMillis());
    }
}
