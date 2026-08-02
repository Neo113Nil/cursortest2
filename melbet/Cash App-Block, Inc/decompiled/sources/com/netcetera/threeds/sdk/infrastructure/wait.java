package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class wait implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final wait ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static final /* synthetic */ wait[] ThreeDS2ServiceInstance;
    private static int cleanup;
    private static int createTransaction;
    private static char[] get;
    private static boolean getSDKInfo;
    private static boolean getSDKVersion;
    public static final wait initialize;
    private String getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInitializationCallback = 0;
        cleanup = 1;
        initialize();
        Object[] objArr = new Object[1];
        a(null, null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0081", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0081", objArr2);
        ThreeDS2Service = new wait(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0082", objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0082", objArr4);
        initialize = new wait(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2ServiceInstance = ThreeDS2ServiceInstance();
        cleanup = (ThreeDS2ServiceInitializationCallback + 95) % 128;
    }

    private wait(String str, int i, String str2) {
        this.getWarnings = str2;
    }

    private static /* synthetic */ wait[] ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInitializationCallback + 39;
        cleanup = i % 128;
        return i % 2 == 0 ? new wait[]{ThreeDS2Service, initialize} : new wait[]{ThreeDS2Service, initialize};
    }

    private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        int i2;
        char[] cArr4;
        char[] cArr5;
        Object method;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i3 = $10 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr6 = cArr;
        onError onerror = new onError();
        char[] cArr7 = get;
        Class cls = Integer.TYPE;
        char c = '0';
        if (cArr7 != null) {
            int length = cArr7.length;
            char[] cArr8 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr7[i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        i2 = i4;
                        cArr5 = cArr7;
                        method = obj;
                        cArr4 = cArr8;
                    } else {
                        i2 = i4;
                        cArr4 = cArr8;
                        cArr5 = cArr7;
                        Class cls2 = (Class) removeParam.initialize(71 - ImageFormat.getBitsPerPixel(0), (char) ((-1) - TextUtils.indexOf("", c)), View.getDefaultSize(0, 0) + 1405);
                        Object[] objArr3 = new Object[1];
                        b(0, (byte) 0, (short) 0, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-939298638, method);
                    }
                    cArr4[i2] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i4 = i2 + 1;
                    cArr8 = cArr4;
                    cArr7 = cArr5;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr7 = cArr8;
        }
        Object[] objArr4 = {Integer.valueOf(createTransaction)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 != null) {
            cArr2 = cArr7;
        } else {
            Class cls3 = (Class) removeParam.initialize(73 - (Process.myTid() >> 22), (char) (7530 - Drawable.resolveOpacity(0, 0)), 2488 - TextUtils.indexOf((CharSequence) "", '0'));
            byte b = (byte) ($$b & 7);
            byte b2 = (byte) (b - 1);
            cArr2 = cArr7;
            Object[] objArr5 = new Object[1];
            b(b, b2, b2, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        if (!getSDKInfo) {
            if (!getSDKVersion) {
                int length2 = iArr.length;
                onerror.ThreeDS2ServiceInstance = length2;
                char[] cArr9 = new char[length2];
                onerror.getWarnings = 0;
                $11 = ($10 + 65) % 128;
                while (true) {
                    int i5 = onerror.getWarnings;
                    int i6 = onerror.ThreeDS2ServiceInstance;
                    if (i5 >= i6) {
                        break;
                    }
                    cArr9[i5] = (char) (cArr2[iArr[(i6 - 1) - i5] - i] - intValue);
                    onerror.getWarnings = i5 + 1;
                }
                String str4 = new String(cArr9);
                int i7 = $10 + 7;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str4;
                return;
            }
            int i8 = $10 + 109;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int length3 = cArr6.length;
                onerror.ThreeDS2ServiceInstance = length3;
                cArr3 = new char[length3];
                onerror.getWarnings = 1;
            } else {
                int length4 = cArr6.length;
                onerror.ThreeDS2ServiceInstance = length4;
                cArr3 = new char[length4];
                onerror.getWarnings = 0;
            }
            while (true) {
                int i9 = onerror.getWarnings;
                int i10 = onerror.ThreeDS2ServiceInstance;
                if (i9 >= i10) {
                    break;
                }
                cArr3[i9] = (char) (cArr2[cArr6[(i10 - 1) - i9] - i] - intValue);
                Object[] objArr6 = {onerror, onerror};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(73542081);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(48 - KeyEvent.keyCodeFromString(""), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 11441 - KeyEvent.keyCodeFromString(""))).getMethod("k", Object.class, Object.class);
                    map3.put(73542081, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
            }
            String str5 = new String(cArr3);
            int i11 = $10 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                objArr[0] = str5;
                return;
            } else {
                int i12 = 48 / 0;
                objArr[0] = str5;
                return;
            }
        }
        $10 = ($11 + 3) % 128;
        int length5 = bArr2.length;
        onerror.ThreeDS2ServiceInstance = length5;
        char[] cArr10 = new char[length5];
        onerror.getWarnings = 0;
        while (true) {
            int i13 = onerror.getWarnings;
            int i14 = onerror.ThreeDS2ServiceInstance;
            if (i13 >= i14) {
                objArr[0] = new String(cArr10);
                return;
            }
            cArr10[i13] = (char) (cArr2[bArr2[(i14 - 1) - i13] + i] - intValue);
            Object[] objArr7 = {onerror, onerror};
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj4 = map4.get(73542081);
            if (obj4 == null) {
                obj4 = ((Class) removeParam.initialize(48 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 11441 - Color.argb(0, 0, 0, 0))).getMethod("k", Object.class, Object.class);
                map4.put(73542081, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = i + 108;
        int i5 = 4 - (b * 4);
        int i6 = (s * 4) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i5++;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i5++;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{64, 120, -87, 124};
        $$b = 17;
    }

    public static void initialize() {
        get = new char[]{15034, 15021};
        createTransaction = 993475347;
        getSDKVersion = true;
        getSDKInfo = true;
    }

    public static wait valueOf(String str) {
        int i = ThreeDS2ServiceInitializationCallback + 53;
        cleanup = i % 128;
        int i2 = i % 2;
        wait waitVar = (wait) Enum.valueOf(wait.class, str);
        if (i2 == 0) {
            int i3 = 33 / 0;
        }
        cleanup = (ThreeDS2ServiceInitializationCallback + 87) % 128;
        return waitVar;
    }

    public static wait[] values() {
        int i = cleanup + 47;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            ThreeDS2ServiceInstance.clone();
            throw null;
        }
        wait[] waitVarArr = (wait[]) ThreeDS2ServiceInstance.clone();
        int i2 = cleanup + 115;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return waitVarArr;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = ThreeDS2ServiceInitializationCallback + 53;
        cleanup = i % 128;
        int i2 = i % 2;
        String str = this.getWarnings;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }
}
