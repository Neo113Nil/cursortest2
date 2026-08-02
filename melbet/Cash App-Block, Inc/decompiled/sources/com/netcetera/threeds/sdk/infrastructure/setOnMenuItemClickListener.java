package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
class setOnMenuItemClickListener implements setSubtitle<setPopupTheme, nq> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static int get;
    private static int getSDKInfo;
    private static boolean getWarnings;
    private static boolean initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        getSDKInfo = 1;
        ThreeDS2Service = new char[]{15158, 15166, 15167, 15154, 15118, 15155, 15164, 15107, 15119, 15113, 15162, 15187};
        get = 993475483;
        initialize = true;
        getWarnings = true;
    }

    private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
        int i2;
        char[] cArr;
        Class cls;
        Object method;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            byte[] bytes = str3.getBytes("ISO-8859-1");
            $10 = ($11 + 5) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        onError onerror = new onError();
        char[] cArr2 = ThreeDS2Service;
        Class cls2 = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            $10 = ($11 + 109) % 128;
            int i3 = 0;
            while (i3 < length) {
                $10 = ($11 + 81) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        cArr = cArr2;
                        method = obj;
                        cls = cls2;
                    } else {
                        cArr = cArr2;
                        cls = cls2;
                        Class cls3 = (Class) removeParam.initialize(72 - View.MeasureSpec.getMode(0), (char) TextUtils.indexOf("", ""), 1405 - KeyEvent.normalizeMetaState(0));
                        Object[] objArr3 = new Object[1];
                        b(0, (short) 0, 0, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-939298638, method);
                    }
                    cArr3[i3] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i3++;
                    cArr2 = cArr;
                    cls2 = cls;
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
        Object[] objArr4 = {Integer.valueOf(get)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 73, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7530), 2488 - TextUtils.indexOf((CharSequence) "", '0', 0));
            Object[] objArr5 = new Object[1];
            b(0, (short) 1, 0, objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        if (getWarnings) {
            $11 = ($10 + 45) % 128;
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr4 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i4 = onerror.getWarnings;
                int i5 = onerror.ThreeDS2ServiceInstance;
                if (i4 >= i5) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                $11 = ($10 + 125) % 128;
                cArr4[i4] = (char) (cArr2[bArr2[(i5 - 1) - i4] + i] - intValue);
                Object[] objArr6 = {onerror, onerror};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(73542081);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) TextUtils.indexOf("", ""), (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11441)).getMethod("k", Object.class, Object.class);
                    map3.put(73542081, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
                $11 = ($10 + 17) % 128;
            }
        } else if (initialize) {
            int length3 = charArray.length;
            onerror.ThreeDS2ServiceInstance = length3;
            char[] cArr5 = new char[length3];
            onerror.getWarnings = 0;
            while (true) {
                int i6 = onerror.getWarnings;
                int i7 = onerror.ThreeDS2ServiceInstance;
                if (i6 >= i7) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i6] = (char) (cArr2[charArray[(i7 - 1) - i6] - i] - intValue);
                Object[] objArr7 = {onerror, onerror};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(73542081);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(47 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.indexOf("", ""), Color.blue(0) + 11441)).getMethod("k", Object.class, Object.class);
                    map4.put(73542081, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
            }
        } else {
            int length4 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length4;
            char[] cArr6 = new char[length4];
            onerror.getWarnings = 0;
            while (true) {
                int i8 = onerror.getWarnings;
                int i9 = onerror.ThreeDS2ServiceInstance;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i10 = $11 + 23;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr6[i8] = (char) (cArr2[iArr[(i9 << 1) >>> i8] >>> i] + intValue);
                    i2 = i8 / 0;
                } else {
                    cArr6[i8] = (char) (cArr2[iArr[(i9 - 1) - i8] - i] - intValue);
                    i2 = i8 + 1;
                }
                onerror.getWarnings = i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i2 * 3) + 4;
        int i6 = (i * 2) + 1;
        int i7 = s + 108;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i7 = i6;
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i5;
            i7 += i5;
            i5 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i5];
            byte[] bArr4 = bArr;
            i9 = i5;
            i5 = b;
            i8 = i4;
            bArr3 = bArr4;
            i7 += i5;
            i5 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{11, 115, 115, -11};
        $$b = 56;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitle
    public /* synthetic */ setPopupTheme ThreeDS2ServiceInstance(nq nqVar) {
        int i = getSDKInfo + 45;
        ThreeDS2ServiceInstance = i % 128;
        nq nqVar2 = nqVar;
        if (i % 2 == 0) {
            return getWarnings(nqVar2);
        }
        getWarnings(nqVar2);
        throw null;
    }

    public setPopupTheme getWarnings(nq nqVar) {
        ThreeDS2ServiceInstance = (getSDKInfo + 101) % 128;
        Object[] objArr = new Object[1];
        a(null, null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0081\u0085\u0084\u0083\u0082\u0081", objArr);
        String initialize2 = nqVar.initialize(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(null, null, 127 - View.resolveSize(0, 0), "\u0086\u0087\u0084\u0086", objArr2);
        String initialize3 = nqVar.initialize(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(null, null, 127 - (ViewConfiguration.getTouchSlop() >> 8), "\u0086\u0087\u0084\u008c\u008b\u008a\u0089\u0088\u0082", objArr3);
        setPopupTheme setpopuptheme = (setPopupTheme) setLogoDescription.ThreeDS2Service(new Object[]{initialize2, initialize3, nqVar.initialize(((String) objArr3[0]).intern())}, 1932196761, -1932196760, (int) System.currentTimeMillis());
        ThreeDS2ServiceInstance = (getSDKInfo + 47) % 128;
        return setpopuptheme;
    }
}
