package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setLineSpacing extends setMaxEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2ServiceInstance;
    private static int get;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        get = 1;
        ThreeDS2ServiceInstance = new char[]{52944, 52886, 52873, 52876, 52886, 52874, 52877, 52872, 52879, 52917, 52926, 52955, 52882, 52884, 52886, 52926, 52925, 52921, 52926, 52865, 52877, 52878, 52879, 52875, 52865, 52867, 52866, 52958, 52884, 52886, 52887, 52926, 52927, 52887, 52869, 52916, 52904, 52871, 52873, 52874, 52876, 52866, 52915, 52908, 52917, 52924, 52876, 52884, 52874, 52877, 52790, 52786, 52784, 52790, 52799, 52742, 52793, 52795, 52797, 52773, 52827, 52788, 52788, 52828, 52825, 52788, 52787, 52784, 52795, 52784};
    }

    private static void d(boolean z, String str, int[] iArr, Object[] objArr) {
        byte[] bArr;
        int i;
        char[] cArr;
        char c;
        Object method;
        Class<Object> cls;
        char[] cArr2;
        int i2;
        char[] cArr3;
        int i3;
        Class<Object> cls2;
        Integer num;
        Object method2;
        String str2 = str;
        Class<Object> cls3 = Object.class;
        Integer num2 = 102334785;
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
        char[] cArr4 = ThreeDS2ServiceInstance;
        int i8 = 2;
        char c2 = '0';
        Class cls4 = Integer.TYPE;
        if (cArr4 != null) {
            int length = cArr4.length;
            int i9 = 1;
            char[] cArr5 = new char[length];
            bArr = bArr3;
            int i10 = 0;
            while (i10 < length) {
                try {
                    int i11 = i10;
                    Object[] objArr2 = {Integer.valueOf(cArr4[i10])};
                    int i12 = length;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cls2 = cls3;
                        num = num2;
                        cArr2 = cArr5;
                        i2 = i6;
                        i3 = i7;
                        method2 = obj;
                        cArr3 = cArr4;
                    } else {
                        cArr2 = cArr5;
                        i2 = i6;
                        cArr3 = cArr4;
                        Class cls5 = (Class) removeParam.initialize((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 48, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2294);
                        byte b = (byte) ($$b & 3);
                        byte b2 = (byte) (b - 1);
                        i3 = i7;
                        cls2 = cls3;
                        num = num2;
                        Object[] objArr3 = new Object[i9];
                        e(b, b2, (byte) (b2 - 1), objArr3);
                        method2 = cls5.getMethod((String) objArr3[0], cls4);
                        map.put(-1866317650, method2);
                    }
                    cArr2[i11] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i10 = i11 + 1;
                    length = i12;
                    cArr4 = cArr3;
                    cArr5 = cArr2;
                    i6 = i2;
                    i7 = i3;
                    cls3 = cls2;
                    num2 = num;
                    i9 = 1;
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
        int i13 = i6;
        int i14 = i7;
        char[] cArr6 = new char[i5];
        System.arraycopy(cArr4, i4, cArr6, 0, i5);
        if (bArr != null) {
            int i15 = $10 + 17;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                cArr = new char[i5];
                c = 0;
                cleanupVar.get = 0;
            } else {
                cArr = new char[i5];
                cleanupVar.get = 0;
                c = 0;
            }
            while (true) {
                int i16 = cleanupVar.get;
                if (i16 >= i5) {
                    break;
                }
                if (bArr[i16] == 1) {
                    $11 = ($10 + 13) % 128;
                    char c3 = cArr6[i16];
                    Object[] objArr4 = new Object[i8];
                    objArr4[1] = Integer.valueOf(c);
                    objArr4[0] = Integer.valueOf(c3);
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 == null) {
                        Class cls7 = (Class) removeParam.initialize(86 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 25857), 1726 - Color.green(0));
                        Object[] objArr5 = new Object[1];
                        e((short) 0, (short) 0, -1, objArr5);
                        obj2 = cls7.getMethod((String) objArr5[0], cls4, cls4);
                        map2.put(715226994, obj2);
                    }
                    cArr[i16] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    Object[] objArr6 = {Integer.valueOf(cArr6[i16]), Integer.valueOf(c)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 != null) {
                        method = obj3;
                    } else {
                        method = ((Class) removeParam.initialize(65 - TextUtils.indexOf("", c2, 0, 0), (char) (Color.alpha(0) + 32825), TextUtils.indexOf("", "", 0, 0) + 447)).getMethod("D", cls4, cls4);
                        map3.put(549300883, method);
                    }
                    cArr[i16] = ((Character) ((Method) method).invoke(null, objArr6)).charValue();
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
                    obj4 = ((Class) removeParam.initialize((ViewConfiguration.getTapTimeout() >> 16) + 74, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Process.myTid() >> 22) + 9820)).getMethod("I", cls, cls);
                    map4.put(num4, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                num3 = num4;
                cls6 = cls;
                i8 = 2;
                c2 = '0';
            }
            cArr6 = cArr;
        }
        if (i14 > 0) {
            char[] cArr7 = new char[i5];
            i = 0;
            System.arraycopy(cArr6, 0, cArr7, 0, i5);
            int i17 = i5 - i14;
            System.arraycopy(cArr7, 0, cArr6, i17, i14);
            System.arraycopy(cArr7, i14, cArr6, 0, i17);
            $10 = ($11 + 43) % 128;
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr8 = new char[i5];
            cleanupVar.get = i;
            while (true) {
                int i18 = cleanupVar.get;
                if (i18 >= i5) {
                    break;
                }
                cArr8[i18] = cArr6[(i5 - i18) - 1];
                cleanupVar.get = i18 + 1;
            }
            cArr6 = cArr8;
        }
        if (i13 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i19 = cleanupVar.get;
                if (i19 >= i5) {
                    break;
                }
                cArr6[i19] = (char) (cArr6[i19] - iArr[2]);
                cleanupVar.get = i19 + 1;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(short s, short s2, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 4;
        int i5 = (s * 57) + 65;
        int i6 = 1 - (s2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i5 = i6;
            byte[] bArr3 = bArr;
            i3 = 0;
            int i7 = i4;
            i5 += -i4;
            i4 = i7;
            bArr = bArr3;
            i2 = i3;
            int i8 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i4 = b;
            bArr3 = bArr4;
            i5 += -i4;
            i4 = i7;
            bArr = bArr3;
            i2 = i3;
            int i82 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i822 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{19, 45, 11, 4};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMaxEms
    public void getWarnings(nq nqVar, setMinEms setminems) {
        get = (initialize + 63) % 128;
        Object[] objArr = new Object[1];
        d(false, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{0, 11, 0, 6}, objArr);
        nqVar.getWarnings(((String) objArr[0]).intern(), setminems.ConfigParameters());
        Object[] objArr2 = new Object[1];
        d(true, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{11, 16, 0, 0}, objArr2);
        nqVar.ThreeDS2Service(((String) objArr2[0]).intern(), ThreeDS2Service((setLineSpacing) setminems.ThreeDS2ServiceInitializationCallback()));
        Object[] objArr3 = new Object[1];
        d(false, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000", new int[]{27, 22, 0, 10}, objArr3);
        nqVar.ThreeDS2Service(((String) objArr3[0]).intern(), setminems.restrictedParameters());
        Object[] objArr4 = new Object[1];
        d(true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{49, 21, 105, 6}, objArr4);
        nqVar.ThreeDS2Service(((String) objArr4[0]).intern(), ThreeDS2Service((setLineSpacing) setminems.addParam()));
        get = (initialize + 117) % 128;
    }
}
