package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setTitle;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class setNavigationIcon extends setSubtitleTextColor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInstance;
    private static char[] getWarnings;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        ThreeDS2ServiceInstance = 1;
        getWarnings = new char[]{52841, 53243, 53189, 53191, 53243, 53241, 53189, 53184, 53189, 53240, 53241, 53227, 53224, 53241, 53241, 53234, 53239, 53189, 53197, 53198};
    }

    private setNavigationIcon(setSubtitle<setPopupTheme, nq> setsubtitle, jh jhVar, setCollapseIcon setcollapseicon, setTitleTextAppearance settitletextappearance) {
        super(setsubtitle, jhVar, setcollapseicon, settitletextappearance);
    }

    private static void d(boolean z, String str, int[] iArr, Object[] objArr) {
        int i;
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        char c;
        Object method;
        char[] cArr4;
        int i2;
        int i3;
        char[] cArr5;
        Object method2;
        String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        cleanup cleanupVar = new cleanup();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr6 = getWarnings;
        char c2 = '0';
        Class cls = Integer.TYPE;
        if (cArr6 != null) {
            int length = cArr6.length;
            char[] cArr7 = new char[length];
            while (i4 < length) {
                try {
                    byte[] bArr3 = bArr2;
                    Object[] objArr2 = {Integer.valueOf(cArr6[i4])};
                    int i9 = i4;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cArr4 = cArr7;
                        i3 = length;
                        cArr5 = cArr6;
                        method2 = obj;
                        i2 = i7;
                    } else {
                        cArr4 = cArr7;
                        i2 = i7;
                        i3 = length;
                        Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getEdgeSlop() >> 16) + 48, (char) Drawable.resolveOpacity(0, 0), View.MeasureSpec.getMode(0) + 2295);
                        Object[] objArr3 = new Object[1];
                        cArr5 = cArr6;
                        e((short) 0, (short) 0, (byte) -1, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-1866317650, method2);
                    }
                    cArr4[i9] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i4 = i9 + 1;
                    bArr2 = bArr3;
                    i7 = i2;
                    cArr7 = cArr4;
                    length = i3;
                    cArr6 = cArr5;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr6 = cArr7;
        }
        byte[] bArr4 = bArr2;
        int i10 = i7;
        char[] cArr8 = new char[i6];
        System.arraycopy(cArr6, i5, cArr8, 0, i6);
        if (bArr4 != null) {
            $10 = ($11 + 85) % 128;
            char[] cArr9 = new char[i6];
            cleanupVar.get = 0;
            char c3 = 0;
            while (true) {
                int i11 = cleanupVar.get;
                if (i11 >= i6) {
                    break;
                }
                if (bArr4[i11] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr8[i11]), Integer.valueOf(c3)};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 != null) {
                        cArr2 = cArr8;
                        cArr3 = cArr9;
                    } else {
                        Class cls3 = (Class) removeParam.initialize(85 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 25856), 1725 - MotionEvent.axisFromString(""));
                        Object[] objArr5 = new Object[1];
                        cArr2 = cArr8;
                        cArr3 = cArr9;
                        e((short) 0, (short) 1, (byte) -1, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls, cls);
                        map2.put(715226994, obj2);
                    }
                    cArr3[i11] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    $10 = ($11 + 103) % 128;
                    c = c2;
                } else {
                    cArr2 = cArr8;
                    cArr3 = cArr9;
                    Object[] objArr6 = {Integer.valueOf(cArr2[i11]), Integer.valueOf(c3)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 != null) {
                        method = obj3;
                        c = c2;
                    } else {
                        c = c2;
                        method = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", c, 0, 0) + 67, (char) (32825 - Drawable.resolveOpacity(0, 0)), (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 447)).getMethod("D", cls, cls);
                        map3.put(549300883, method);
                    }
                    cArr3[i11] = ((Character) ((Method) method).invoke(null, objArr6)).charValue();
                }
                char c4 = cArr3[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(102334785);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(73 - ImageFormat.getBitsPerPixel(0), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 9820 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("I", Object.class, Object.class);
                    map4.put(102334785, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                c2 = c;
                cArr9 = cArr3;
                c3 = c4;
                cArr8 = cArr2;
            }
            cArr8 = cArr9;
        }
        if (i8 > 0) {
            $10 = ($11 + 113) % 128;
            char[] cArr10 = new char[i6];
            System.arraycopy(cArr8, 0, cArr10, 0, i6);
            int i12 = i6 - i8;
            System.arraycopy(cArr10, 0, cArr8, i12, i8);
            System.arraycopy(cArr10, i8, cArr8, 0, i12);
        }
        if (z) {
            int i13 = $10 + 49;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr = new char[i6];
                i = 0;
            } else {
                i = 0;
                cArr = new char[i6];
            }
            cleanupVar.get = i;
            while (true) {
                int i14 = cleanupVar.get;
                if (i14 >= i6) {
                    break;
                }
                cArr[i14] = cArr8[(i6 - i14) - 1];
                cleanupVar.get = i14 + 1;
            }
            cArr8 = cArr;
        }
        if (i10 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i15 = cleanupVar.get;
                if (i15 >= i6) {
                    break;
                }
                int i16 = $11 + 79;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr8[i15] = (char) (cArr8[i15] - iArr[3]);
                } else {
                    cArr8[i15] = (char) (cArr8[i15] - iArr[2]);
                    i15++;
                }
                cleanupVar.get = i15;
            }
        }
        objArr[0] = new String(cArr8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(short s, short s2, byte b, Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = b + 4;
        int i3 = 122 - (s2 * 57);
        int i4 = s * 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i3 += -i5;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i++;
            i5 = bArr[i2];
            i3 += -i5;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{106, -113, 65, 83};
        $$b = EnumC0170g.SDK_ASSET_ICON_PIN_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public void initialize(nq nqVar, setTitle.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        Object obj;
        int i = initialize + 97;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            d(false, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{0, 20, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 19}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            d(false, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{0, 20, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 19}, objArr2);
            obj = objArr2[0];
        }
        threeDS2ServiceInstance.amexConfiguration(nqVar.initialize(((String) obj).intern()));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public put initialize() {
        int i = ThreeDS2ServiceInstance + 69;
        initialize = i % 128;
        if (i % 2 == 0) {
            return put.get;
        }
        int i2 = 71 / 0;
        return put.get;
    }

    public static setSubtitleTextColor initialize(jh jhVar) {
        setNavigationIcon setnavigationicon = new setNavigationIcon(new setOnMenuItemClickListener(), jhVar, new setCollapseIcon(), new setTitleTextAppearance());
        ThreeDS2ServiceInstance = (initialize + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return setnavigationicon;
    }
}
