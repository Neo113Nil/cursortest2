package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class ng {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static char[] get;
    private static int getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getWarnings = 0;
        ThreeDS2Service = 1;
        get = new char[]{52914, 52814, 52809, 52818, 52818, 52831, 52854, 52847, 52813, 52846, 52841, 52831, 52816, 52820, 52851, 52873, 52902, 52834, 52834, 52833, 52833, 52833, 52841, 52801, 52801, 52808, 52815, 52925, 52856, 52859, 52925, 52809, 52814, 52815, 52815, 52860, 52858, 52925, 52879, 52820, 52809, 52813, 52800, 52856, 52925, 52811, 52814, 52925, 52983, 52897, 52886, 52883, 52884, 52909, 52902, 52868, 52901, 52900, 52875, 52876, 52868, 52877, 52875, 52876, 52910, 52909, 52873, 52867, 52864, 52896, 52943, 52983, 52909, 52884, 52883, 52886, 52897, 52928, 52905, 52887, 52876, 52920, 52954, 52896, 52886, 52909, 52910, 52872, 52865, 52876, 52884, 52876, 52901, 52910, 52887, 52896, 52910, 52876, 52865, 52875, 52878, 52865, 52897, 52901, 52868, 52936, 52903, 52930, 52902, 52905, 52944, 52958, 52916, 52896, 52910, 52908, 52937, 52948, 52908, 52875, 52927, 52950, 52949, 52925, 52891, 52876, 52905, 52944, 52958, 52916, 52896, 52910, 52908, 52937, 52948, 52908, 52875, 52912, 52927, 52916, 52929, 52976, 57026, 57036, 52958, 52958, 52958, 52958, 52958, 52937, 57080, 57081, 52938, 52904, 52879, 52873, 52873, 52864, 52875, 52921, 52949, 52928, 52918, 52877, 52864, 52872, 52887, 52877, 52900, 52907, 52873, 52865, 52899, 52896, 52876, 52899, 52901, 52868, 52902, 52909, 52884, 52883, 52886, 52897, 52901, 52833, 52843, 52846, 52833, 52865, 52869, 52836, 52870, 52877, 52852, 52851, 52854, 52865, 52903, 52864, 52854, 52877, 52865, 52833, 52844, 52852, 52844, 52869, 52878, 52855, 52864, 52878, 52953};
    }

    public static <T> void ThreeDS2Service(T t, String str) {
        int i = getWarnings + 53;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            initialize(new Object[]{str}, 1524941013, -1524941013, (int) System.currentTimeMillis());
            throw null;
        }
        initialize(new Object[]{str}, 1524941013, -1524941013, (int) System.currentTimeMillis());
        if (t != null) {
            ThreeDS2Service = (getWarnings + 111) % 128;
            return;
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
        Object[] objArr = new Object[1];
        a(false, new int[]{0, 16, 71, 15}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000", objArr);
        JWK$$ExternalSyntheticBUOutline0.m(m, (Object) ((String) objArr[0]).intern());
    }

    public static void ThreeDS2ServiceInstance(int i, int i2, String str) {
        getWarnings = (ThreeDS2Service + 51) % 128;
        initialize(new Object[]{str}, 1524941013, -1524941013, (int) System.currentTimeMillis());
        if (i >= i2) {
            int i3 = ThreeDS2Service + 57;
            getWarnings = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 52 / 0;
                return;
            }
            return;
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
        Object[] objArr = new Object[1];
        a(true, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 28, 32, 14}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000", objArr);
        m.append(((String) objArr[0]).intern());
        m.append(i2);
        Object[] objArr2 = new Object[1];
        a(true, new int[]{EnumC0170g.SDK_ASSET_ICON_OVERRIDE_VALUE, 1, 79, 1}, "\u0001", objArr2);
        JWK$$ExternalSyntheticBUOutline0.m(m, (Object) ((String) objArr2[0]).intern());
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        byte[] bArr;
        int i;
        char[] cArr;
        char c;
        char[] cArr2;
        Class<Object> cls;
        int i2;
        int i3;
        int i4;
        char[] cArr3;
        Class<Object> cls2;
        Integer num;
        Object method;
        String str2 = str;
        Class<Object> cls3 = Object.class;
        Integer num2 = 102334785;
        int i5 = ($11 + 29) % 128;
        $10 = i5;
        byte[] bArr2 = str2;
        if (str2 != null) {
            int i6 = i5 + 95;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                str2.getBytes("ISO-8859-1");
                throw null;
            }
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        cleanup cleanupVar = new cleanup();
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr4 = get;
        int i11 = 2;
        Class cls4 = Integer.TYPE;
        if (cArr4 != null) {
            int i12 = 1;
            $11 = ($10 + 77) % 128;
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            bArr = bArr3;
            int i13 = 0;
            while (i13 < length) {
                try {
                    int i14 = i13;
                    Object[] objArr2 = {Integer.valueOf(cArr4[i13])};
                    char[] cArr6 = cArr5;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cls2 = cls3;
                        num = num2;
                        i2 = length;
                        i3 = i9;
                        i4 = i10;
                        method = obj;
                        cArr3 = cArr4;
                    } else {
                        i2 = length;
                        i3 = i9;
                        i4 = i10;
                        cArr3 = cArr4;
                        Class cls5 = (Class) removeParam.initialize(49 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0) + 2295);
                        byte b = $$a[0];
                        byte b2 = b;
                        cls2 = cls3;
                        num = num2;
                        Object[] objArr3 = new Object[i12];
                        b(b, b2, b2, objArr3);
                        method = cls5.getMethod((String) objArr3[0], cls4);
                        map.put(-1866317650, method);
                    }
                    cArr6[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13 = i14 + 1;
                    cArr5 = cArr6;
                    cArr4 = cArr3;
                    length = i2;
                    i9 = i3;
                    i10 = i4;
                    cls3 = cls2;
                    num2 = num;
                    i12 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        } else {
            bArr = bArr3;
        }
        Class<Object> cls6 = cls3;
        Integer num3 = num2;
        int i15 = i9;
        int i16 = i10;
        char[] cArr7 = new char[i8];
        System.arraycopy(cArr4, i7, cArr7, 0, i8);
        if (bArr != null) {
            int i17 = $10 + 83;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr = new char[i8];
                cleanupVar.get = 0;
                c = 1;
            } else {
                cArr = new char[i8];
                cleanupVar.get = 0;
                c = 0;
            }
            while (true) {
                int i18 = cleanupVar.get;
                if (i18 >= i8) {
                    break;
                }
                if (bArr[i18] == 1) {
                    char c2 = cArr7[i18];
                    Object[] objArr4 = new Object[i11];
                    objArr4[1] = Integer.valueOf(c);
                    objArr4[0] = Integer.valueOf(c2);
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 != null) {
                        cArr2 = cArr7;
                    } else {
                        Class cls7 = (Class) removeParam.initialize((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 85, (char) (KeyEvent.keyCodeFromString("") + 25857), TextUtils.indexOf("", "", 0, 0) + 1726);
                        byte b3 = $$a[0];
                        byte b4 = b3;
                        cArr2 = cArr7;
                        Object[] objArr5 = new Object[1];
                        b(b4, (byte) (b4 + 1), b3, objArr5);
                        obj2 = cls7.getMethod((String) objArr5[0], cls4, cls4);
                        map2.put(715226994, obj2);
                    }
                    cArr[i18] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    cArr2 = cArr7;
                    Object[] objArr6 = {Integer.valueOf(cArr2[i18]), Integer.valueOf(c)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 67, (char) (32826 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 447 - TextUtils.indexOf("", ""))).getMethod("D", cls4, cls4);
                        map3.put(549300883, obj3);
                    }
                    cArr[i18] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Integer num4 = num3;
                Object obj4 = map4.get(num4);
                if (obj4 != null) {
                    cls = cls6;
                } else {
                    cls = cls6;
                    obj4 = ((Class) removeParam.initialize((KeyEvent.getMaxKeyCode() >> 16) + 74, (char) (Process.getGidForName("") + 1), KeyEvent.keyCodeFromString("") + 9820)).getMethod("I", cls, cls);
                    map4.put(num4, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                num3 = num4;
                cls6 = cls;
                cArr7 = cArr2;
                i11 = 2;
            }
            cArr7 = cArr;
        }
        if (i16 > 0) {
            char[] cArr8 = new char[i8];
            i = 0;
            System.arraycopy(cArr7, 0, cArr8, 0, i8);
            int i19 = i8 - i16;
            System.arraycopy(cArr8, 0, cArr7, i19, i16);
            System.arraycopy(cArr8, i16, cArr7, 0, i19);
        } else {
            i = 0;
        }
        if (z) {
            $10 = ($11 + 75) % 128;
            char[] cArr9 = new char[i8];
            cleanupVar.get = i;
            while (true) {
                int i20 = cleanupVar.get;
                if (i20 >= i8) {
                    break;
                }
                cArr9[i20] = cArr7[(i8 - i20) - 1];
                cleanupVar.get = i20 + 1;
            }
            cArr7 = cArr9;
        }
        if (i15 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i21 = cleanupVar.get;
                if (i21 >= i8) {
                    break;
                }
                cArr7[i21] = (char) (cArr7[i21] - iArr[2]);
                cleanupVar.get = i21 + 1;
            }
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 3 - (s * 3);
        int i5 = (i * 2) + 1;
        byte[] bArr = $$a;
        int i6 = 122 - (b * 57);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i6 = i5;
            i3 = 0;
            i6 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i6 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
            }
        }
    }

    public static <T> void get(List<T> list, String str) {
        int i = ThreeDS2Service + 1;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            initialize(new Object[]{str}, 1524941013, -1524941013, (int) System.currentTimeMillis());
            throw null;
        }
        initialize(new Object[]{str}, 1524941013, -1524941013, (int) System.currentTimeMillis());
        if (list == null) {
            StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
            Object[] objArr = new Object[1];
            a(false, new int[]{0, 16, 71, 15}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000", objArr);
            JWK$$ExternalSyntheticBUOutline0.m(m, (Object) ((String) objArr[0]).intern());
            return;
        }
        getWarnings = (ThreeDS2Service + 87) % 128;
        for (T t : list) {
            StringBuilder m2 = Boxes$$ExternalSyntheticOutline1.m(str);
            Object[] objArr2 = new Object[1];
            a(false, new int[]{16, 7, 29, 0}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000", objArr2);
            m2.append(((String) objArr2[0]).intern());
            ThreeDS2Service(t, m2.toString());
        }
    }

    public static void init$0() {
        $$a = new byte[]{0, -80, 7, 56};
        $$b = 105;
    }

    public static void initialize(String str, String str2) {
        ThreeDS2Service = (getWarnings + 27) % 128;
        get(str, str2);
        Object[] objArr = new Object[1];
        a(false, new int[]{105, 36, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001", objArr);
        if (!Pattern.compile(((String) objArr[0]).intern()).matcher(str).matches()) {
            StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str2);
            Object[] objArr2 = new Object[1];
            a(true, new int[]{EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 43, 0, 0}, "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", objArr2);
            JWK$$ExternalSyntheticBUOutline0.m(m, (Object) ((String) objArr2[0]).intern());
            return;
        }
        int i = ThreeDS2Service + 91;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }

    public static void initialize(int i, String str) {
        getWarnings = (ThreeDS2Service + 101) % 128;
        initialize(new Object[]{str}, 1524941013, -1524941013, (int) System.currentTimeMillis());
        if (i > 0) {
            ThreeDS2Service = (getWarnings + 79) % 128;
            return;
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
        Object[] objArr = new Object[1];
        a(false, new int[]{48, 23, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000", objArr);
        JWK$$ExternalSyntheticBUOutline0.m(m, (Object) ((String) objArr[0]).intern());
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }

    public static void ThreeDS2ServiceInstance(int i, String str) {
        ThreeDS2Service = (getWarnings + 45) % 128;
        initialize(new Object[]{str}, 1524941013, -1524941013, (int) System.currentTimeMillis());
        if (i >= 0) {
            getWarnings = (ThreeDS2Service + 95) % 128;
            return;
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
        Object[] objArr = new Object[1];
        a(true, new int[]{71, 34, 0, 6}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", objArr);
        JWK$$ExternalSyntheticBUOutline0.m(m, (Object) ((String) objArr[0]).intern());
    }

    public static String get(String str, String str2) {
        getWarnings = (ThreeDS2Service + 35) % 128;
        initialize(new Object[]{str2}, 1524941013, -1524941013, (int) System.currentTimeMillis());
        if (!oj.getWarnings((CharSequence) str)) {
            int i = ThreeDS2Service + 115;
            getWarnings = i % 128;
            if (i % 2 == 0) {
                return str;
            }
            throw null;
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str2);
        Object[] objArr = new Object[1];
        a(true, new int[]{23, 25, 58, 15}, null, objArr);
        JWK$$ExternalSyntheticBUOutline0.m(m, (Object) ((String) objArr[0]).intern());
        return null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        String str = (String) objArr[0];
        int i = ThreeDS2Service + 93;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            if (str == null || str.isEmpty()) {
                throw setTextAlignment.initialize.initialize(new Object[0]);
            }
            int i2 = ThreeDS2Service + 109;
            getWarnings = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 51 / 0;
            }
            return null;
        }
        throw null;
    }
}
