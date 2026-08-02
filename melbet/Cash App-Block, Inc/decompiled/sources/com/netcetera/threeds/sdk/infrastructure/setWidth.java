package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setWidth extends setMaxEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static boolean ThreeDS2ServiceInstance;
    private static char createTransaction;
    private static int get;
    private static int getSDKInfo;
    private static int getSDKVersion;
    private static boolean getWarnings;
    private static long initialize;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ThreeDS2ServiceInitializationCallback = 0;
        getSDKInfo = 1;
        ThreeDS2Service = new char[]{15142, 15161, 15136, 15165, 15140, 15155, 15162, 15187, 15154, 15172, 15157, 15159, 15112, 15173, 15189, 15114, 15190, 15191, 15152, 15156, 15158, 15168, 15153, 15188, 15197, 15143, 15174, 15160, 15141, 15167, 15115, 15113, 15219, 15220, 15217, 15145, 15185, 15166, 15196, 15164, 15192, 15163, 15176, 15175};
        get = 993475457;
        getWarnings = true;
        ThreeDS2ServiceInstance = true;
        initialize = -8880716800597159563L;
        getSDKVersion = 898634101;
        createTransaction = (char) 60963;
    }

    private static void d(String str, int[] iArr, int i, String str2, Object[] objArr) {
        char[] cArr;
        int length;
        char[] cArr2;
        int i2;
        int i3;
        char[] cArr3;
        Class cls;
        Object method;
        String str3 = str2;
        int i4 = $10 + 91;
        $11 = i4 % 128;
        byte[] bArr = str3;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 115) % 128;
        } else {
            cArr = str;
        }
        char[] cArr4 = cArr;
        onError onerror = new onError();
        char[] cArr5 = ThreeDS2Service;
        Class cls2 = Integer.TYPE;
        if (cArr5 != null) {
            int i5 = $11 + 5;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr5.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr5.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            int i6 = i2;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr5[i6])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        i3 = i6;
                        cArr3 = cArr5;
                        method = obj;
                        cls = cls2;
                    } else {
                        i3 = i6;
                        cArr3 = cArr5;
                        cls = cls2;
                        Class cls3 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionChild(0L) + 73, (char) ((-16777216) - Color.rgb(0, 0, 0)), TextUtils.getCapsMode("", 0, 0) + 1405);
                        Object[] objArr3 = new Object[1];
                        g(1, 0, 0, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-939298638, method);
                    }
                    cArr2[i3] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i6 = i3 + 1;
                    cArr5 = cArr3;
                    cls2 = cls;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr5 = cArr2;
        }
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(get)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 73, (char) (TextUtils.getCapsMode("", 0, 0) + 7530), (ViewConfiguration.getLongPressTimeout() >> 16) + 2489);
            Object[] objArr5 = new Object[1];
            g(0, 0, 0, objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        if (ThreeDS2ServiceInstance) {
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr6 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i7 = onerror.getWarnings;
                int i8 = onerror.ThreeDS2ServiceInstance;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                cArr6[i7] = (char) (cArr5[bArr2[(i8 - 1) - i7] + i] - intValue);
                Object[] objArr6 = {onerror, onerror};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(73542081);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(48 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 11441 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("k", Object.class, Object.class);
                    map3.put(73542081, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
            }
        } else if (getWarnings) {
            int length3 = cArr4.length;
            onerror.ThreeDS2ServiceInstance = length3;
            char[] cArr7 = new char[length3];
            onerror.getWarnings = 0;
            while (true) {
                int i9 = onerror.getWarnings;
                int i10 = onerror.ThreeDS2ServiceInstance;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr7);
                    return;
                }
                cArr7[i9] = (char) (cArr5[cArr4[(i10 - 1) - i9] - i] - intValue);
                Object[] objArr7 = {onerror, onerror};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(73542081);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 48, (char) (Process.getGidForName("") + 1), TextUtils.getTrimmedLength("") + 11441)).getMethod("k", Object.class, Object.class);
                    map4.put(73542081, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
            }
        } else {
            int length4 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length4;
            char[] cArr8 = new char[length4];
            onerror.getWarnings = 0;
            while (true) {
                int i11 = onerror.getWarnings;
                int i12 = onerror.ThreeDS2ServiceInstance;
                if (i11 >= i12) {
                    objArr[0] = new String(cArr8);
                    return;
                } else {
                    cArr8[i11] = (char) (cArr5[iArr[(i12 - 1) - i11] - i] - intValue);
                    onerror.getWarnings = i11 + 1;
                    $10 = ($11 + 39) % 128;
                }
            }
        }
    }

    private static void e(int i, String str, String str2, String str3, char c, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        int i2;
        int i3;
        char[] cArr4;
        int i4;
        Integer num;
        Integer num2;
        Integer num3 = 246986610;
        Integer num4 = -258783473;
        if (str3 != null) {
            cArr = str3.toCharArray();
            $11 = ($10 + 43) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr5 = cArr;
        int i5 = 1;
        if (str2 != null) {
            cArr2 = str2.toCharArray();
            $11 = ($10 + 1) % 128;
        } else {
            cArr2 = str2;
        }
        char[] cArr6 = cArr2;
        if (str != null) {
            $10 = ($11 + 83) % 128;
            cArr3 = str.toCharArray();
        } else {
            cArr3 = str;
        }
        char[] cArr7 = cArr3;
        ConfigParameters configParameters = new ConfigParameters();
        int length = cArr6.length;
        char[] cArr8 = new char[length];
        int length2 = cArr5.length;
        char[] cArr9 = new char[length2];
        int i6 = 0;
        System.arraycopy(cArr6, 0, cArr8, 0, length);
        System.arraycopy(cArr5, 0, cArr9, 0, length2);
        cArr8[0] = (char) (cArr8[0] ^ c);
        int i7 = 2;
        cArr9[2] = (char) (cArr9[2] + ((char) i));
        int length3 = cArr7.length;
        char[] cArr10 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            $11 = ($10 + i5) % 128;
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num4);
                int i8 = i5;
                if (obj != null) {
                    i2 = i7;
                    i3 = length3;
                    cArr4 = cArr7;
                } else {
                    i2 = i7;
                    i3 = length3;
                    cArr4 = cArr7;
                    Method method = ((Class) removeParam.initialize(58 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((Process.getThreadPriority(i6) + 20) >> 6), 6414 - View.getDefaultSize(i6, i6))).getMethod("j", Object.class);
                    map.put(num4, method);
                    obj = method;
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num3);
                if (obj2 != null) {
                    i4 = i6;
                } else {
                    i4 = i6;
                    obj2 = ((Class) removeParam.initialize(63 - TextUtils.indexOf("", "", i6, i6), (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11344), 8576 - Process.getGidForName(""))).getMethod("i", Object.class);
                    map.put(num3, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i9 = cArr8[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i2] = Integer.valueOf(cArr9[intValue]);
                objArr4[i8] = Integer.valueOf(i9);
                objArr4[i4] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 != null) {
                    num = num3;
                    num2 = num4;
                } else {
                    num = num3;
                    num2 = num4;
                    obj3 = ((Class) removeParam.initialize(74 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 9820 - ExpandableListView.getPackedPositionGroup(0L))).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i10 = cArr8[intValue2] * 32718;
                char c2 = cArr9[intValue];
                i7 = i2;
                Object[] objArr5 = new Object[i7];
                objArr5[i8] = Integer.valueOf(c2);
                objArr5[i4] = Integer.valueOf(i10);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize((ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1)) + 48, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 63350), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11535)).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr9[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr8[intValue2] = configParameters.get;
                int i11 = configParameters.initialize;
                cArr10[i11] = (char) ((((r2 ^ cArr4[i11]) ^ (initialize ^ (-8880716800597159563L))) ^ ((int) (getSDKVersion ^ (-8880716800597159563L)))) ^ ((char) (createTransaction ^ (-8880716800597159563L))));
                configParameters.initialize = i11 + 1;
                length3 = i3;
                cArr7 = cArr4;
                i5 = i8;
                num4 = num2;
                i6 = i4;
                num3 = num;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[i6] = new String(cArr10);
    }

    private static void f(short s, int i, byte b, Object[] objArr) {
        int i2 = (b * 2) + 84;
        int i3 = i * 2;
        int i4 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 23];
        int i5 = i3 + 22;
        int i6 = -1;
        if (bArr == null) {
            i2 = i4 + i5 + 2;
            i4 = i4;
        }
        while (true) {
            int i7 = i4 + 1;
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i2 + bArr[i7] + 2;
                i4 = i7;
            }
        }
    }

    private static void g(int i, int i2, int i3, Object[] objArr) {
        byte[] bArr = $$g;
        int i4 = (i3 * 2) + 4;
        int i5 = 109 - i;
        int i6 = i2 * 4;
        byte[] bArr2 = new byte[i6 + 1];
        int i7 = -1;
        if (bArr == null) {
            i5 = i6 + i5;
            i4++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5 += bArr[i4];
                i4++;
            }
        }
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int[], java.lang.String] */
    public static java.lang.Object[] get(android.content.Context r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setWidth.get(android.content.Context, int, int):java.lang.Object[]");
    }

    public static void init$0() {
        $$a = new byte[]{19, 45, 11, 4, 18, 8, -15, -2, -35, 13, -35, 31, 16, 11, 2, -15, -8, 0, -30, 35, 3, -1, -21, 11, -13, 0};
        $$b = 81;
    }

    public static void init$1() {
        $$g = new byte[]{102, -52, -46, 35};
        $$h = EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMaxEms
    public void getWarnings(nq nqVar, setMinEms setminems) {
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 71) % 128;
        Object[] objArr = new Object[1];
        d(null, null, View.combineMeasuredStates(0, 0) + 127, "\u008d\u008c\u008b\u0086\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr);
        nqVar.ThreeDS2Service(((String) objArr[0]).intern(), ThreeDS2Service((setWidth) setminems.ThreeDS2ServiceInitializationCallback()));
        Object[] objArr2 = new Object[1];
        d(null, null, (KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0089\u0090\u008f\u008d\u008c\u008b\u0086\u008a\u0083\u008b\u0083\u008e\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr2);
        nqVar.ThreeDS2Service(((String) objArr2[0]).intern(), setminems.ThreeDS2ServiceInstance());
        Object[] objArr3 = new Object[1];
        d(null, null, 127 - (Process.myPid() >> 22), "\u0099\u0092\u0098\u0097\u0097\u0096\u008c\u0089\u008b\u0095\u0085\u0094\u0093\u0085\u0092\u0091\u008e\u0085\u0085\u008c\u0082\u008b", objArr3);
        nqVar.ThreeDS2Service(((String) objArr3[0]).intern(), setminems.restrictedParameters());
        Object[] objArr4 = new Object[1];
        d(null, null, 127 - Color.green(0), "\u0085\u0094\u0086\u009c\u008b\u0086\u0089\u009b\u009a\u0089\u0089", objArr4);
        nqVar.ThreeDS2Service(((String) objArr4[0]).intern(), setminems.getParamValue());
        Object[] objArr5 = new Object[1];
        d(null, null, (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, "\u0095\u0094\u008b\u0083\u008b\u0091\u0097\u0097\u0096\u009a\u0089\u0089", objArr5);
        nqVar.ThreeDS2Service(((String) objArr5[0]).intern(), setminems.amexConfiguration());
        nqVar.getWarnings(getClass.getSDKInfo, setminems.ConfigurationBuilder());
        Object[] objArr6 = new Object[1];
        e(Color.rgb(0, 0, 0) + 16777216, "㮏ﺿᰝ䁊蛀躝莎Ἅᓃ徕ῲ\udd33᪙肓웬龍隍묎", "㑑蹉鋰ভ", "\u0000\u0000\u0000\u0000", (char) (44435 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr6);
        nqVar.ThreeDS2Service(((String) objArr6[0]).intern(), ThreeDS2Service((setWidth) setminems.onCompleted()));
        Object[] objArr7 = new Object[1];
        e(View.resolveSizeAndState(0, 0, 0), "⫠褞१\udf70⡞듦蒧겥ᥚ･һ亙柛\u2fdf\ud850\u1316蟕틶䌺䳃\ue938ỽ", "ଲ\uf184抒勥", "\u0000\u0000\u0000\u0000", (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr7);
        nqVar.ThreeDS2Service(((String) objArr7[0]).intern(), ThreeDS2Service((setWidth) setminems.onError()));
        Object[] objArr8 = new Object[1];
        d(null, null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0085\u009d\u0089\u009b\u009d\u009d\u0096\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr8);
        nqVar.ThreeDS2Service(((String) objArr8[0]).intern(), ThreeDS2Service((setWidth) setminems.build()));
        Object[] objArr9 = new Object[1];
        e((Process.getThreadPriority(0) + 20) >> 6, "鳵✈헒⡋㚮\u1976㡹\ue27c᷅ⵀ㽹奄", "䣹䛡\u2e6aᦍ", "\u0000\u0000\u0000\u0000", (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr9);
        nqVar.ThreeDS2Service(((String) objArr9[0]).intern(), setminems.mastercardSchemeConfiguration());
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 49) % 128;
    }
}
