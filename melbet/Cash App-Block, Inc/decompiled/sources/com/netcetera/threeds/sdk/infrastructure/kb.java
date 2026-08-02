package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class kb {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int get;
    private static char[] initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        get = 0;
        ThreeDS2Service = 1;
        initialize = new char[]{52868, 52768, 52770, 52768, 52772, 52769, 52781, 52771, 52768, 52781, 52779, 52778, 52818, 52808, 52831, 52852, 52859, 52772, 52807, 52860, 52773, 52768, 52769, 52775, 52861, 52806, 52772, 52825, 52826, 52860, 52860, 52770, 52772, 52827, 52771, 52772, 52861, 52807, 52781, 52804, 52860, 52826, 52774, 52772, 52825, 52811, 52852};
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        byte[] bArr;
        int i;
        int i2;
        char[] cArr;
        Class<Object> cls;
        int length;
        char[] cArr2;
        int i3;
        char[] cArr3;
        int i4;
        char[] cArr4;
        Class<Object> cls2;
        int i5;
        Object method;
        String str2 = str;
        Class<Object> cls3 = Object.class;
        byte[] bArr2 = str2;
        if (str2 != null) {
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        cleanup cleanupVar = new cleanup();
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr5 = initialize;
        int i10 = 2;
        char c = '0';
        Class cls4 = Integer.TYPE;
        if (cArr5 != null) {
            int i11 = $11 + 43;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                length = cArr5.length;
                cArr2 = new char[length];
                bArr = bArr3;
                i3 = 1;
            } else {
                length = cArr5.length;
                cArr2 = new char[length];
                bArr = bArr3;
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    int i12 = i3;
                    Object[] objArr2 = {Integer.valueOf(cArr5[i3])};
                    int i13 = length;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cls2 = cls3;
                        cArr3 = cArr2;
                        i4 = i8;
                        cArr4 = cArr5;
                        method = obj;
                        i5 = i9;
                    } else {
                        cArr3 = cArr2;
                        i4 = i8;
                        cArr4 = cArr5;
                        Class cls5 = (Class) removeParam.initialize(48 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2295 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        Object[] objArr3 = new Object[1];
                        cls2 = cls3;
                        i5 = i9;
                        b((short) 1, 0, (byte) -1, objArr3);
                        method = cls5.getMethod((String) objArr3[0], cls4);
                        map.put(-1866317650, method);
                    }
                    cArr3[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i3 = i12 + 1;
                    length = i13;
                    i9 = i5;
                    cArr2 = cArr3;
                    i8 = i4;
                    cArr5 = cArr4;
                    cls3 = cls2;
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
            bArr = bArr3;
        }
        Class<Object> cls6 = cls3;
        int i14 = i8;
        int i15 = i9;
        char[] cArr6 = new char[i7];
        System.arraycopy(cArr5, i6, cArr6, 0, i7);
        if (bArr != null) {
            char[] cArr7 = new char[i7];
            cleanupVar.get = 0;
            char c2 = 0;
            while (true) {
                int i16 = cleanupVar.get;
                if (i16 >= i7) {
                    break;
                }
                if (bArr[i16] == 1) {
                    $10 = ($11 + 83) % 128;
                    char c3 = cArr6[i16];
                    Object[] objArr4 = new Object[i10];
                    objArr4[1] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c3);
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 == null) {
                        Class cls7 = (Class) removeParam.initialize(85 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (25857 - Color.alpha(0)), 1726 - View.resolveSizeAndState(0, 0, 0));
                        Object[] objArr5 = new Object[1];
                        b((short) 0, 0, (byte) -1, objArr5);
                        obj2 = cls7.getMethod((String) objArr5[0], cls4, cls4);
                        map2.put(715226994, obj2);
                    }
                    cArr7[i16] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    Object[] objArr6 = {Integer.valueOf(cArr6[i16]), Integer.valueOf(c2)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(65 - TextUtils.indexOf("", c), (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 32824), 447 - TextUtils.getOffsetAfter("", 0))).getMethod("D", cls4, cls4);
                        map3.put(549300883, obj3);
                    }
                    cArr7[i16] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr7[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(102334785);
                if (obj4 != null) {
                    cls = cls6;
                } else {
                    cls = cls6;
                    obj4 = ((Class) removeParam.initialize(74 - ((Process.getThreadPriority(0) + 20) >> 6), (char) KeyEvent.getDeadChar(0, 0), 9820 - View.MeasureSpec.getSize(0))).getMethod("I", cls, cls);
                    map4.put(102334785, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                cls6 = cls;
                i10 = 2;
                c = '0';
            }
            cArr6 = cArr7;
        }
        if (i15 > 0) {
            char[] cArr8 = new char[i7];
            System.arraycopy(cArr6, 0, cArr8, 0, i7);
            int i17 = i7 - i15;
            System.arraycopy(cArr8, 0, cArr6, i17, i15);
            System.arraycopy(cArr8, i15, cArr6, 0, i17);
        }
        if (z) {
            int i18 = $10 + 9;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr = new char[i7];
                i2 = 1;
                cleanupVar.get = 1;
            } else {
                i2 = 1;
                cArr = new char[i7];
                cleanupVar.get = 0;
            }
            while (true) {
                int i19 = cleanupVar.get;
                if (i19 >= i7) {
                    break;
                }
                cArr[i19] = cArr6[(i7 - i19) - i2];
                cleanupVar.get = i19 + 1;
                $10 = ($11 + 53) % 128;
            }
            cArr6 = cArr;
        }
        if (i14 > 0) {
            int i20 = ($11 + 75) % 128;
            $10 = i20;
            cleanupVar.get = 0;
            $11 = (i20 + 89) % 128;
            while (true) {
                int i21 = cleanupVar.get;
                if (i21 >= i7) {
                    break;
                }
                int i22 = $10 + 85;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr6[i21] = (char) (cArr6[i21] << iArr[4]);
                    i = i21 >> 1;
                } else {
                    cArr6[i21] = (char) (cArr6[i21] - iArr[2]);
                    i = i21 + 1;
                }
                cleanupVar.get = i;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, Object[] objArr) {
        int i2;
        int i3;
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = (s * 57) + 65;
        int i6 = 1 - (i * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i5 = i6;
            i3 = 0;
            i5 += i7;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i5 += i7;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    private <T> T getWarnings(T t) {
        int i = ThreeDS2Service + 113;
        get = i % 128;
        try {
            if (i % 2 == 0) {
                return (T) nf.initialize(new Object[]{t}, -2036394939, 2036394939, (int) System.currentTimeMillis());
            }
            nf.initialize(new Object[]{t}, -2036394939, 2036394939, (int) System.currentTimeMillis());
            throw null;
        } catch (setScrollCaptureCallback e) {
            setScrollCaptureCallback.initialize initializeVar = (setScrollCaptureCallback.initialize) setScrollCaptureCallback.getWarnings(new Object[]{e.getWarnings()}, -1667499669, 1667499669, (int) System.currentTimeMillis());
            Object[] objArr = new Object[1];
            a(true, new int[]{0, 47, 89, 46}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", objArr);
            throw initializeVar.ThreeDS2Service(((String) objArr[0]).intern()).ThreeDS2Service(e).ThreeDS2ServiceInstance();
        }
    }

    public static void init$0() {
        $$a = new byte[]{PnmConstants.PPM_RAW_CODE, 9, 122, 120};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
    }

    public Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.ui.logic.UiCustomization> ThreeDS2ServiceInstance(Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.ui.logic.UiCustomization> map) {
        ThreeDS2Service = (get + 51) % 128;
        if (map == null || map.isEmpty()) {
            return new HashMap<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.ui.logic.UiCustomization>() { // from class: com.netcetera.threeds.sdk.infrastructure.kb.5
                {
                    put(UiCustomization.UiCustomizationType.DEFAULT, new com.netcetera.threeds.sdk.api.ui.logic.UiCustomization());
                    put(UiCustomization.UiCustomizationType.DARK, new com.netcetera.threeds.sdk.api.ui.logic.UiCustomization());
                }
            };
        }
        UiCustomization.UiCustomizationType uiCustomizationType = UiCustomization.UiCustomizationType.DEFAULT;
        if (!map.containsKey(uiCustomizationType)) {
            map.put(uiCustomizationType, new com.netcetera.threeds.sdk.api.ui.logic.UiCustomization());
        }
        UiCustomization.UiCustomizationType uiCustomizationType2 = UiCustomization.UiCustomizationType.DARK;
        if (!map.containsKey(uiCustomizationType2)) {
            map.put(uiCustomizationType2, new com.netcetera.threeds.sdk.api.ui.logic.UiCustomization());
        }
        UiCustomization.UiCustomizationType uiCustomizationType3 = UiCustomization.UiCustomizationType.MONOCHROME;
        if (!map.containsKey(uiCustomizationType3)) {
            map.put(uiCustomizationType3, new com.netcetera.threeds.sdk.api.ui.logic.UiCustomization());
            get = (ThreeDS2Service + 77) % 128;
        }
        return (Map) getWarnings(map);
    }

    public com.netcetera.threeds.sdk.api.ui.logic.UiCustomization initialize(com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization) {
        com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization2 = (com.netcetera.threeds.sdk.api.ui.logic.UiCustomization) og.ThreeDS2Service((com.netcetera.threeds.sdk.api.ui.logic.UiCustomization) getWarnings(uiCustomization), new com.netcetera.threeds.sdk.api.ui.logic.UiCustomization());
        int i = ThreeDS2Service + 29;
        get = i % 128;
        if (i % 2 == 0) {
            return uiCustomization2;
        }
        throw null;
    }
}
