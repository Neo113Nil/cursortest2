package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes5.dex */
public final class nm {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        ThreeDS2ServiceInstance = 1;
        ThreeDS2Service = new char[]{52884, 52836, 53217};
    }

    @SafeVarargs
    public static <T> String ThreeDS2Service(T... tArr) {
        StringBuilder sb = new StringBuilder();
        int length = tArr.length;
        ThreeDS2ServiceInstance = (initialize + 43) % 128;
        int i = 0;
        while (i < length) {
            sb.append(tArr[i]);
            Object[] objArr = new Object[1];
            a(false, new int[]{1, 2, EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 0}, "\u0000\u0000", objArr);
            sb.append(((String) objArr[0]).intern());
            i++;
            initialize = (ThreeDS2ServiceInstance + 35) % 128;
        }
        return sb.substring(0, sb.length() - 2);
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        float f;
        int i;
        float f2;
        char[] cArr;
        int length;
        char[] cArr2;
        int i2;
        int i3;
        char[] cArr3;
        int i4;
        char[] cArr4;
        Object method;
        String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            int i5 = $10 + 1;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str2.getBytes("ISO-8859-1");
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        cleanup cleanupVar = new cleanup();
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr5 = ThreeDS2Service;
        int i10 = 2;
        char c = '0';
        Class cls = Integer.TYPE;
        if (cArr5 != null) {
            int i11 = $10;
            f = RecyclerView.DECELERATION_RATE;
            int i12 = i11 + 19;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = cArr5.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr5.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            int i13 = i2;
            while (i13 < length) {
                try {
                    byte[] bArr3 = bArr2;
                    Object[] objArr2 = {Integer.valueOf(cArr5[i13])};
                    int i14 = length;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        i3 = i13;
                        cArr3 = cArr2;
                        i4 = i8;
                        method = obj;
                        cArr4 = cArr5;
                    } else {
                        i3 = i13;
                        cArr3 = cArr2;
                        i4 = i8;
                        Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getWindowTouchSlop() >> 8) + 48, (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 2296 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                        Object[] objArr3 = new Object[1];
                        cArr4 = cArr5;
                        b((short) 0, (byte) 0, (byte) 1, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-1866317650, method);
                    }
                    cArr3[i3] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13 = i3 + 1;
                    length = i14;
                    bArr2 = bArr3;
                    cArr5 = cArr4;
                    cArr2 = cArr3;
                    i8 = i4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr5 = cArr2;
        } else {
            f = RecyclerView.DECELERATION_RATE;
        }
        byte[] bArr4 = bArr2;
        int i15 = i8;
        char[] cArr6 = new char[i7];
        System.arraycopy(cArr5, i6, cArr6, 0, i7);
        if (bArr4 != null) {
            char[] cArr7 = new char[i7];
            cleanupVar.get = 0;
            char c2 = 0;
            while (true) {
                int i16 = cleanupVar.get;
                if (i16 >= i7) {
                    break;
                }
                if (bArr4[i16] == 1) {
                    char c3 = cArr6[i16];
                    Object[] objArr4 = new Object[i10];
                    objArr4[1] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c3);
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 != null) {
                        f2 = f;
                    } else {
                        float f3 = f;
                        f2 = f3;
                        Class cls3 = (Class) removeParam.initialize(85 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25857), 1726 - (PointF.length(f3, f3) > f2 ? 1 : (PointF.length(f3, f3) == f2 ? 0 : -1)));
                        Object[] objArr5 = new Object[1];
                        b((short) 0, (byte) 0, (byte) 0, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls, cls);
                        map2.put(715226994, obj2);
                    }
                    cArr7[i16] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    cArr = cArr6;
                } else {
                    f2 = f;
                    Object[] objArr6 = {Integer.valueOf(cArr6[i16]), Integer.valueOf(c2)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 != null) {
                        cArr = cArr6;
                    } else {
                        cArr = cArr6;
                        obj3 = ((Class) removeParam.initialize(Color.rgb(0, 0, 0) + 16777282, (char) (TextUtils.indexOf("", c) + 32826), View.combineMeasuredStates(0, 0) + 447)).getMethod("D", cls, cls);
                        map3.put(549300883, obj3);
                    }
                    cArr7[i16] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr7[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(102334785);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(74 - View.resolveSize(0, 0), (char) (Process.myTid() >> 22), 9820 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("I", Object.class, Object.class);
                    map4.put(102334785, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                cArr6 = cArr;
                f = f2;
                c = '0';
                i10 = 2;
            }
            cArr6 = cArr7;
        }
        if (i9 > 0) {
            char[] cArr8 = new char[i7];
            i = 0;
            System.arraycopy(cArr6, 0, cArr8, 0, i7);
            int i17 = i7 - i9;
            System.arraycopy(cArr8, 0, cArr6, i17, i9);
            System.arraycopy(cArr8, i9, cArr6, 0, i17);
        } else {
            i = 0;
        }
        if (z) {
            $10 = ($11 + 95) % 128;
            char[] cArr9 = new char[i7];
            cleanupVar.get = i;
            while (true) {
                int i18 = cleanupVar.get;
                if (i18 >= i7) {
                    break;
                }
                cArr9[i18] = cArr6[(i7 - i18) - 1];
                cleanupVar.get = i18 + 1;
            }
            cArr6 = cArr9;
        }
        if (i15 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i19 = cleanupVar.get;
                if (i19 >= i7) {
                    break;
                }
                cArr6[i19] = (char) (cArr6[i19] - iArr[2]);
                cleanupVar.get = i19 + 1;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, Object[] objArr) {
        int i;
        int i2;
        int i3 = (b2 * 57) + 65;
        byte[] bArr = $$a;
        int i4 = 1 - (s * 4);
        int i5 = (b * 2) + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            i2 = 0;
            int i8 = i7 + 1;
            i3 = i5 + i6;
            i5 = i8;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            int i9 = i3;
            i7 = i5;
            i5 = i9;
            int i82 = i7 + 1;
            i3 = i5 + i6;
            i5 = i82;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    @SafeVarargs
    public static <T> String get(T... tArr) {
        StringBuilder sb = new StringBuilder();
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            initialize = (ThreeDS2ServiceInstance + 59) % 128;
            sb.append(tArr[i]);
            Object[] objArr = new Object[1];
            a(false, new int[]{0, 1, EnumC0170g.SDK_ASSET_ICON_ARROW_UP_VALUE, 0}, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, objArr);
            sb.append(((String) objArr[0]).intern());
            i++;
            ThreeDS2ServiceInstance = (initialize + 19) % 128;
        }
        String substring = sb.substring(0, sb.length() - 1);
        initialize = (ThreeDS2ServiceInstance + 7) % 128;
        return substring;
    }

    public static void init$0() {
        $$a = new byte[]{66, PnmConstants.PPM_TEXT_CODE, -14, 106};
        $$b = 87;
    }
}
