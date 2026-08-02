package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public class setOrientation {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInstance;
    private static char[] get;
    private static int getWarnings;
    private final String initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getWarnings = 0;
        ThreeDS2ServiceInstance = 1;
        get = new char[]{52931, 52907, 52911, 52951, 52901, 52865, 52875, 52887, 52876, 52878, 52912, 52951, 52910, 52907, 52933, 52910, 52907, 52907, 52907, 52933, 52936, 52914, 52924, 52907, 52852, 52888, 52925, 52872, 52849, 52841, 52841, 52852, 52851, 52853, 52842, 52853, 52853, 52894, 52912, 52866, 52855, 52855, 52893, 52930, 52922, 52886, 52887, 52877, 52876, 52869, 52922, 52876, 52885, 52873, 52875, 52873, 52875, 52874, 52886, 52887, 52877, 52876, 52905, 52944, 52876, 52877, 52887, 52886, 52922, 52946, 52907, 52882, 52878, 52878, 52877, 52866, 52925, 52945, 52901, 52876, 52878, 52869, 52878, 52864, 52877, 52868, 52958, 52990, 52951, 52950, 52950, 52951, 52951, 52951, 52958, 52907, 52933, 52905, 52905, 52910, 52907, 52907, 52907, 52933, 52905, 52905, 52910, 52907, 52933, 52946, 52896, 52908, 52958, 52905, 52905, 52910, 52907, 52933};
    }

    public setOrientation(String str) {
        this.initialize = str;
    }

    public static setOrientation ThreeDS2ServiceInstance(Context context) {
        ThreeDS2ServiceInstance = (getWarnings + 27) % 128;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        int i = Build.VERSION.SDK_INT;
        Object[] objArr = new Object[1];
        a(true, new int[]{0, 20, 0, 17}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001", objArr);
        String format2 = String.format(((String) objArr[0]).intern(), str, str2, Integer.valueOf(i));
        String packageName = context.getPackageName();
        Object[] objArr2 = new Object[1];
        a(true, new int[]{20, 3, 29, 0}, "\u0000\u0000\u0001", objArr2);
        String intern = ((String) objArr2[0]).intern();
        try {
            intern = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            ThreeDS2ServiceInstance = (getWarnings + 47) % 128;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr3 = new Object[1];
        a(true, new int[]{23, 20, 37, 0}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(false, new int[]{43, 20, 0, 13}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", objArr4);
        if (((Boolean) mx.ThreeDS2Service(new Object[]{((String) objArr4[0]).intern()}, -327252871, 327252871, (int) System.currentTimeMillis())).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            a(true, new int[]{63, 24, 0, 6}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb.append(KotlinVersion.CURRENT);
            intern2 = sb.toString();
        }
        Object[] objArr6 = new Object[1];
        a(false, new int[]{87, 7, 0, 7}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000", objArr6);
        String intern3 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a(true, new int[]{94, 24, 0, 7}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", objArr7);
        return new setOrientation(String.format(((String) objArr7[0]).intern(), format2, packageName, intern, intern3, intern2));
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        byte[] bArr;
        int i;
        char[] cArr;
        char[] cArr2;
        float f;
        Object method;
        int length;
        char[] cArr3;
        int i2;
        char[] cArr4;
        char[] cArr5;
        int i3;
        Object method2;
        String str2 = str;
        $10 = ($11 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        byte[] bArr2 = str2;
        if (str2 != null) {
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        cleanup cleanupVar = new cleanup();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr6 = get;
        int i8 = 2;
        byte b = 0;
        Class cls = Integer.TYPE;
        if (cArr6 != null) {
            char c = '0';
            int i9 = $10 + 75;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = cArr6.length;
                cArr3 = new char[length];
            } else {
                length = cArr6.length;
                cArr3 = new char[length];
            }
            bArr = bArr3;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                int i12 = $10 + 93;
                int i13 = length;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr6[i11])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-1866317650);
                        if (obj != null) {
                            i2 = i6;
                            i3 = i7;
                            cArr4 = cArr6;
                            method2 = obj;
                            cArr5 = cArr3;
                        } else {
                            i2 = i6;
                            cArr4 = cArr6;
                            cArr5 = cArr3;
                            Class cls2 = (Class) removeParam.initialize(ImageFormat.getBitsPerPixel(b) + 49, (char) ((Process.getThreadPriority(b) + 20) >> 6), 2343 - AndroidCharacter.getMirror(c));
                            Object[] objArr3 = new Object[1];
                            i3 = i7;
                            byte b2 = b;
                            b(b2, b2, -1, objArr3);
                            method2 = cls2.getMethod((String) objArr3[b2], cls);
                            map.put(-1866317650, method2);
                        }
                        cArr5[i11] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                        i10 = i11 + 1;
                        length = i13;
                        cArr3 = cArr5;
                        i6 = i2;
                        cArr6 = cArr4;
                        i7 = i3;
                        b = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i14 = i6;
                    int i15 = i7;
                    char[] cArr7 = cArr6;
                    char[] cArr8 = cArr3;
                    Object[] objArr4 = {Integer.valueOf(cArr7[i11])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-1866317650);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize(47 - TextUtils.lastIndexOf("", c), (char) (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.keyCodeFromString("") + 2295);
                        Object[] objArr5 = new Object[1];
                        b((byte) 0, (short) 0, -1, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-1866317650, obj2);
                    }
                    cArr8[i11] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    i10 = i11 + 1;
                    length = i13;
                    cArr3 = cArr8;
                    i6 = i14;
                    cArr6 = cArr7;
                    i7 = i15;
                    b = 0;
                    c = '0';
                }
            }
            cArr6 = cArr3;
        } else {
            bArr = bArr3;
        }
        int i16 = i6;
        int i17 = i7;
        char[] cArr9 = new char[i5];
        System.arraycopy(cArr6, i4, cArr9, 0, i5);
        if (bArr != null) {
            char[] cArr10 = new char[i5];
            cleanupVar.get = 0;
            $11 = ($10 + 37) % 128;
            char c2 = 0;
            while (true) {
                int i18 = cleanupVar.get;
                if (i18 >= i5) {
                    break;
                }
                if (bArr[i18] == 1) {
                    char c3 = cArr9[i18];
                    Object[] objArr6 = new Object[i8];
                    objArr6[1] = Integer.valueOf(c2);
                    objArr6[0] = Integer.valueOf(c3);
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(715226994);
                    if (obj3 != null) {
                        cArr = cArr9;
                        cArr2 = cArr10;
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                        Class cls4 = (Class) removeParam.initialize(AndroidCharacter.getMirror('0') + '%', (char) (Color.rgb(0, 0, 0) + 16803073), (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1726);
                        Object[] objArr7 = new Object[1];
                        cArr = cArr9;
                        cArr2 = cArr10;
                        b((byte) 1, (short) 0, -1, objArr7);
                        obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                        map3.put(715226994, obj3);
                    }
                    cArr2[i18] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    cArr = cArr9;
                    cArr2 = cArr10;
                    f = 0.0f;
                    Object[] objArr8 = {Integer.valueOf(cArr[i18]), Integer.valueOf(c2)};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(549300883);
                    if (obj4 != null) {
                        method = obj4;
                    } else {
                        method = ((Class) removeParam.initialize('r' - AndroidCharacter.getMirror('0'), (char) (32825 - Color.alpha(0)), 446 - TextUtils.lastIndexOf("", '0', 0))).getMethod("D", cls, cls);
                        map4.put(549300883, method);
                    }
                    cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr8)).charValue();
                }
                char c4 = cArr2[cleanupVar.get];
                Object[] objArr9 = {cleanupVar, cleanupVar};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(102334785);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 73, (char) (1 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1))), 9820 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("I", Object.class, Object.class);
                    map5.put(102334785, obj5);
                }
                ((Method) obj5).invoke(null, objArr9);
                $11 = ($10 + 95) % 128;
                c2 = c4;
                cArr10 = cArr2;
                cArr9 = cArr;
                i8 = 2;
            }
            cArr9 = cArr10;
        }
        if (i17 > 0) {
            char[] cArr11 = new char[i5];
            i = 0;
            System.arraycopy(cArr9, 0, cArr11, 0, i5);
            int i19 = i5 - i17;
            System.arraycopy(cArr11, 0, cArr9, i19, i17);
            System.arraycopy(cArr11, i17, cArr9, 0, i19);
            $11 = ($10 + 37) % 128;
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr12 = new char[i5];
            cleanupVar.get = i;
            while (true) {
                int i20 = cleanupVar.get;
                if (i20 >= i5) {
                    break;
                }
                cArr12[i20] = cArr9[(i5 - i20) - 1];
                cleanupVar.get = i20 + 1;
            }
            cArr9 = cArr12;
        }
        if (i16 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i21 = cleanupVar.get;
                if (i21 >= i5) {
                    break;
                }
                cArr9[i21] = (char) (cArr9[i21] - iArr[2]);
                cleanupVar.get = i21 + 1;
            }
        }
        objArr[0] = new String(cArr9);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 122 - (b * 57);
        int i5 = i + 4;
        int i6 = (s * 4) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += i7;
            i2 = i3;
            i5++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i4 += i7;
            i2 = i3;
            i5++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i5++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{114, -127, 75, 42};
        $$b = 26;
    }

    public String ThreeDS2Service() {
        int i = getWarnings;
        String str = this.initialize;
        ThreeDS2ServiceInstance = (i + 79) % 128;
        return str;
    }
}
