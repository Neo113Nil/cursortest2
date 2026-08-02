package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class getVersion implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    public static final getVersion get;
    private static int getSDKVersion;
    private static final /* synthetic */ getVersion[] getWarnings;
    public static final getVersion initialize;
    private final String ThreeDS2ServiceInstance;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInitializationCallback = 0;
        getSDKVersion = 1;
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        a(false, new int[]{0, 3, 0, 1}, "\u0001\u0000\u0000", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(false, new int[]{3, 1, 0, 0}, "\u0001", objArr2);
        initialize = new getVersion(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(true, new int[]{4, 2, 0, 0}, "\u0001\u0001", objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(true, new int[]{6, 1, 0, 1}, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, objArr4);
        get = new getVersion(intern2, 1, ((String) objArr4[0]).intern());
        getWarnings = get();
        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 67) % 128;
    }

    private getVersion(String str, int i, String str2) {
        this.ThreeDS2ServiceInstance = str2;
    }

    public static void ThreeDS2Service() {
        ThreeDS2Service = new char[]{52942, 52913, 52904, 52939, 52928, 52905, 52928};
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        byte[] bArr;
        int i;
        char[] cArr;
        char[] cArr2;
        int i2;
        int length;
        char[] cArr3;
        char[] cArr4;
        int i3;
        char[] cArr5;
        Object method;
        String str2 = str;
        byte[] bArr2 = str2;
        if (str2 != null) {
            $10 = ($11 + 95) % 128;
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        cleanup cleanupVar = new cleanup();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr6 = ThreeDS2Service;
        char c = '0';
        Class cls = Integer.TYPE;
        int i8 = 2;
        if (cArr6 != null) {
            int i9 = $11 + 91;
            int i10 = 0;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr6.length;
                cArr3 = new char[length];
            } else {
                length = cArr6.length;
                cArr3 = new char[length];
            }
            bArr = bArr3;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11;
                int i13 = $10 + 85;
                int i14 = length;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr6[i12])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-1866317650);
                        if (obj != null) {
                            cArr4 = cArr3;
                            cArr5 = cArr6;
                            method = obj;
                            i3 = i6;
                        } else {
                            cArr4 = cArr3;
                            i3 = i6;
                            int i15 = i10;
                            cArr5 = cArr6;
                            Class cls2 = (Class) removeParam.initialize(ImageFormat.getBitsPerPixel(i10) + 49, (char) ((-16777216) - Color.rgb(i15, i15, i15)), MotionEvent.axisFromString("") + 2296);
                            Object[] objArr3 = new Object[1];
                            b(0, (byte) 0, 0, objArr3);
                            method = cls2.getMethod((String) objArr3[0], cls);
                            map.put(-1866317650, method);
                        }
                        cArr4[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i11 = i12 - 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    cArr4 = cArr3;
                    i3 = i6;
                    cArr5 = cArr6;
                    Object[] objArr4 = {Integer.valueOf(cArr5[i12])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-1866317650);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize(48 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 2295);
                        Object[] objArr5 = new Object[1];
                        b(0, (byte) 0, 0, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-1866317650, obj2);
                    }
                    cArr4[i12] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    i11 = i12 + 1;
                }
                length = i14;
                i6 = i3;
                cArr3 = cArr4;
                cArr6 = cArr5;
                i10 = 0;
            }
            cArr6 = cArr3;
        } else {
            bArr = bArr3;
        }
        int i16 = i6;
        char[] cArr7 = new char[i5];
        System.arraycopy(cArr6, i4, cArr7, 0, i5);
        if (bArr != null) {
            char[] cArr8 = new char[i5];
            cleanupVar.get = 0;
            char c2 = 0;
            while (true) {
                int i17 = cleanupVar.get;
                if (i17 >= i5) {
                    break;
                }
                if (bArr[i17] == 1) {
                    char c3 = cArr7[i17];
                    Object[] objArr6 = new Object[i8];
                    objArr6[1] = Integer.valueOf(c2);
                    objArr6[0] = Integer.valueOf(c3);
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(715226994);
                    if (obj3 != null) {
                        cArr = cArr7;
                        cArr2 = cArr8;
                        i2 = i17;
                    } else {
                        cArr = cArr7;
                        cArr2 = cArr8;
                        i2 = i17;
                        Class cls4 = (Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 85, (char) (25858 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), TextUtils.lastIndexOf("", c, 0) + 1727);
                        Object[] objArr7 = new Object[1];
                        b(0, (byte) 1, 0, objArr7);
                        obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                        map3.put(715226994, obj3);
                    }
                    cArr2[i2] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    cArr = cArr7;
                    cArr2 = cArr8;
                    Object[] objArr8 = {Integer.valueOf(cArr[i17]), Integer.valueOf(c2)};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(549300883);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(66 - Drawable.resolveOpacity(0, 0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 32825), 447 - Gravity.getAbsoluteGravity(0, 0))).getMethod("D", cls, cls);
                        map4.put(549300883, obj4);
                    }
                    cArr2[i17] = ((Character) ((Method) obj4).invoke(null, objArr8)).charValue();
                }
                c2 = cArr2[cleanupVar.get];
                Object[] objArr9 = {cleanupVar, cleanupVar};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(102334785);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(Color.alpha(0) + 74, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 9820 - TextUtils.indexOf("", "", 0))).getMethod("I", Object.class, Object.class);
                    map5.put(102334785, obj5);
                }
                ((Method) obj5).invoke(null, objArr9);
                cArr7 = cArr;
                cArr8 = cArr2;
                c = '0';
                i8 = 2;
            }
            cArr7 = cArr8;
        }
        if (i7 > 0) {
            char[] cArr9 = new char[i5];
            i = 0;
            System.arraycopy(cArr7, 0, cArr9, 0, i5);
            int i18 = i5 - i7;
            System.arraycopy(cArr9, 0, cArr7, i18, i7);
            System.arraycopy(cArr9, i7, cArr7, 0, i18);
            $10 = ($11 + 39) % 128;
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr10 = new char[i5];
            cleanupVar.get = i;
            while (true) {
                int i19 = cleanupVar.get;
                if (i19 >= i5) {
                    break;
                }
                cArr10[i19] = cArr7[(i5 - i19) - 1];
                cleanupVar.get = i19 + 1;
            }
            cArr7 = cArr10;
        }
        if (i16 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i20 = cleanupVar.get;
                if (i20 >= i5) {
                    break;
                }
                cArr7[i20] = (char) (cArr7[i20] - iArr[2]);
                cleanupVar.get = i20 + 1;
            }
        }
        objArr[0] = new String(cArr7);
    }

    private static void b(int i, byte b, int i2, Object[] objArr) {
        int i3 = 3 - (i * 3);
        byte[] bArr = $$a;
        int i4 = i2 * 2;
        int i5 = 122 - (b * 57);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 = i3 + i5;
            i3 = i3;
            bArr = bArr;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            int i9 = i3 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte[] bArr3 = bArr;
            i5 = bArr[i9] + i5;
            i3 = i9;
            bArr = bArr3;
            i7 = i8;
        }
    }

    private static /* synthetic */ getVersion[] get() {
        int i = (ThreeDS2ServiceInitializationCallback + 121) % 128;
        getSDKVersion = i;
        getVersion[] getversionArr = {initialize, get};
        ThreeDS2ServiceInitializationCallback = (i + 87) % 128;
        return getversionArr;
    }

    public static void init$0() {
        $$a = new byte[]{114, -127, 75, 42};
        $$b = 19;
    }

    public static getVersion valueOf(String str) {
        getSDKVersion = (ThreeDS2ServiceInitializationCallback + 125) % 128;
        getVersion getversion = (getVersion) Enum.valueOf(getVersion.class, str);
        getSDKVersion = (ThreeDS2ServiceInitializationCallback + 97) % 128;
        return getversion;
    }

    public static getVersion[] values() {
        getSDKVersion = (ThreeDS2ServiceInitializationCallback + 31) % 128;
        getVersion[] getversionArr = (getVersion[]) getWarnings.clone();
        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 17) % 128;
        return getversionArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = getSDKVersion;
        int i2 = i + 95;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            throw null;
        }
        ThreeDS2ServiceInitializationCallback = (i + 91) % 128;
        return str;
    }
}
