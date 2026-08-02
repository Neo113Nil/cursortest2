package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class al extends setProperty {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInstance;
    private static int get;
    private static char[] getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        get = 0;
        ThreeDS2ServiceInstance = 1;
        getWarnings = new char[]{52950, 52865, 52872, 52874, 52915, 52921, 52872, 52927, 52927, 52875, 52877, 52877, 52868, 52921, 52920, 52867, 52886, 52878, 52878, 52873, 52872, 52873, 52873, 52926, 52914, 52877, 52876, 52865, 52878, 52876, 52914, 52916, 52919, 52805, 52861, 52863, 52850, 52852, 52849, 52849, 52848, 52855, 52840, 52849, 52848, 52853, 52850, 52848, 52854, 52843, 52841, 52855, 52853, 52860, 52862, 52855, 52842, 52855, 52860, 52849, 52841, 52853, 52849, 52850, 52851, 52863, 52853, 52855, 52854};
    }

    public al(Context context, jr jrVar) {
        super(context, jrVar);
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        byte[] bArr;
        int i;
        byte b;
        char[] cArr;
        char c;
        Class<Object> cls;
        int length;
        char[] cArr2;
        int i2;
        char[] cArr3;
        Class<Object> cls2;
        int i3;
        char[] cArr4;
        Integer num;
        Object method;
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
        char[] cArr5 = getWarnings;
        int i8 = 2;
        Class cls4 = Integer.TYPE;
        int i9 = 1;
        if (cArr5 != null) {
            int i10 = $11 + 51;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                length = cArr5.length;
                cArr2 = new char[length];
            } else {
                length = cArr5.length;
                cArr2 = new char[length];
            }
            bArr = bArr3;
            int i11 = 0;
            while (i11 < length) {
                try {
                    int i12 = i11;
                    Object[] objArr2 = {Integer.valueOf(cArr5[i11])};
                    int i13 = length;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cls2 = cls3;
                        num = num2;
                        i2 = i6;
                        i3 = i7;
                        cArr3 = cArr5;
                        method = obj;
                        cArr4 = cArr2;
                    } else {
                        i2 = i6;
                        cArr3 = cArr5;
                        cls2 = cls3;
                        i3 = i7;
                        cArr4 = cArr2;
                        Class cls5 = (Class) removeParam.initialize(49 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 2296);
                        byte b2 = (byte) ($$b & 1);
                        byte b3 = (byte) (b2 - 1);
                        num = num2;
                        Object[] objArr3 = new Object[i9];
                        b(b2, b3, b3, objArr3);
                        method = cls5.getMethod((String) objArr3[0], cls4);
                        map.put(-1866317650, method);
                    }
                    cArr4[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i11 = i12 + 1;
                    length = i13;
                    cArr2 = cArr4;
                    i6 = i2;
                    cArr5 = cArr3;
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
            cArr5 = cArr2;
        } else {
            bArr = bArr3;
        }
        Class<Object> cls6 = cls3;
        Integer num3 = num2;
        int i14 = i6;
        int i15 = i7;
        char[] cArr6 = new char[i5];
        System.arraycopy(cArr5, i4, cArr6, 0, i5);
        if (bArr != null) {
            int i16 = $10 + 85;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr = new char[i5];
                b = 1;
                cleanupVar.get = 1;
                c = 1;
            } else {
                b = 1;
                cArr = new char[i5];
                cleanupVar.get = 0;
                c = 0;
            }
            while (true) {
                int i17 = cleanupVar.get;
                if (i17 >= i5) {
                    break;
                }
                if (bArr[i17] == b) {
                    int i18 = $10 + 89;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        char c2 = cArr6[i17];
                        Object[] objArr4 = new Object[i8];
                        objArr4[1] = Integer.valueOf(c);
                        objArr4[0] = Integer.valueOf(c2);
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(715226994);
                        if (obj2 == null) {
                            Class cls7 = (Class) removeParam.initialize(TextUtils.getTrimmedLength("") + 85, (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 25856), 1726 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            Object[] objArr5 = new Object[1];
                            b(0, 0, 0, objArr5);
                            obj2 = cls7.getMethod((String) objArr5[0], cls4, cls4);
                            map2.put(715226994, obj2);
                        }
                        cArr[i17] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                        int i19 = 47 / 0;
                    } else {
                        Object[] objArr6 = {Integer.valueOf(cArr6[i17]), Integer.valueOf(c)};
                        Map map3 = removeParam.visaSchemeConfiguration;
                        Object obj3 = map3.get(715226994);
                        if (obj3 == null) {
                            Class cls8 = (Class) removeParam.initialize(85 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 25858), Color.green(0) + 1726);
                            Object[] objArr7 = new Object[1];
                            b(0, 0, 0, objArr7);
                            obj3 = cls8.getMethod((String) objArr7[0], cls4, cls4);
                            map3.put(715226994, obj3);
                        }
                        cArr[i17] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                    }
                } else {
                    Object[] objArr8 = {Integer.valueOf(cArr6[i17]), Integer.valueOf(c)};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(549300883);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(66 - TextUtils.getTrimmedLength(""), (char) (32825 - ExpandableListView.getPackedPositionType(0L)), 446 - MotionEvent.axisFromString(""))).getMethod("D", cls4, cls4);
                        map4.put(549300883, obj4);
                    }
                    cArr[i17] = ((Character) ((Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr[cleanupVar.get];
                Object[] objArr9 = {cleanupVar, cleanupVar};
                Map map5 = removeParam.visaSchemeConfiguration;
                Integer num4 = num3;
                Object obj5 = map5.get(num4);
                if (obj5 != null) {
                    cls = cls6;
                } else {
                    cls = cls6;
                    obj5 = ((Class) removeParam.initialize((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 74, (char) (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 9820)).getMethod("I", cls, cls);
                    map5.put(num4, obj5);
                }
                ((Method) obj5).invoke(null, objArr9);
                num3 = num4;
                cls6 = cls;
                i8 = 2;
                b = 1;
            }
            cArr6 = cArr;
        }
        if (i15 > 0) {
            $11 = ($10 + 35) % 128;
            char[] cArr7 = new char[i5];
            i = 0;
            System.arraycopy(cArr6, 0, cArr7, 0, i5);
            int i20 = i5 - i15;
            System.arraycopy(cArr7, 0, cArr6, i20, i15);
            System.arraycopy(cArr7, i15, cArr6, 0, i20);
        } else {
            i = 0;
        }
        if (z) {
            $10 = ($11 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            char[] cArr8 = new char[i5];
            cleanupVar.get = i;
            while (true) {
                int i21 = cleanupVar.get;
                if (i21 >= i5) {
                    break;
                }
                cArr8[i21] = cArr6[(i5 - i21) - 1];
                cleanupVar.get = i21 + 1;
            }
            cArr6 = cArr8;
        }
        if (i14 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i22 = cleanupVar.get;
                if (i22 >= i5) {
                    break;
                }
                cArr6[i22] = (char) (cArr6[i22] - iArr[2]);
                cleanupVar.get = i22 + 1;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr = $$a;
        int i8 = 4 - (i2 * 4);
        int i9 = (i * 57) + 65;
        int i10 = (i3 * 2) + 1;
        byte[] bArr2 = new byte[i10];
        if (bArr == null) {
            int i11 = i8;
            int i12 = i10;
            i7 = 0;
            int i13 = i8 + 1;
            i4 = i11 + i12;
            i5 = i13;
            i6 = i7;
            i7 = i6 + 1;
            bArr2[i6] = (byte) i4;
            if (i7 == i10) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i12 = bArr[i5];
            int i14 = i4;
            i8 = i5;
            i11 = i14;
            int i132 = i8 + 1;
            i4 = i11 + i12;
            i5 = i132;
            i6 = i7;
            i7 = i6 + 1;
            bArr2[i6] = (byte) i4;
            if (i7 == i10) {
            }
        } else {
            i4 = i9;
            i5 = i8;
            i6 = 0;
            i7 = i6 + 1;
            bArr2[i6] = (byte) i4;
            if (i7 == i10) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{102, 93, -70, 15};
        $$b = EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.writeReplace
    public /* bridge */ /* synthetic */ void ThreeDS2Service(setScroller setscroller) {
        int i = get + 33;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        super.ThreeDS2Service(setscroller);
        if (i2 == 0) {
            int i3 = 11 / 0;
        }
        ThreeDS2ServiceInstance = (get + 37) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public void aX_(CheckBox checkBox) {
        ThreeDS2ServiceInstance = (get + 47) % 128;
        Object[] objArr = new Object[1];
        a(true, new int[]{32, 37, 44, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr);
        getWarnings(checkBox, ((String) objArr[0]).intern());
        int i = get + 89;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public String get() {
        get = (ThreeDS2ServiceInstance + 105) % 128;
        Object[] objArr = new Object[1];
        a(true, new int[]{0, 32, 0, 5}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr);
        String intern = ((String) objArr[0]).intern();
        get = (ThreeDS2ServiceInstance + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.containsValue
    public /* bridge */ /* synthetic */ void getWarnings(er erVar) {
        int i = get + 111;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        super.getWarnings(erVar);
        if (i2 == 0) {
            int i3 = 19 / 0;
        }
        ThreeDS2ServiceInstance = (get + 111) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public replace ThreeDS2Service(replace replaceVar) {
        cl clVar = new cl(replaceVar, getVersion.initialize);
        int i = ThreeDS2ServiceInstance + 37;
        get = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
        return clVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.containsValue
    public /* bridge */ /* synthetic */ void getWarnings(eq eqVar) {
        get = (ThreeDS2ServiceInstance + 113) % 128;
        super.getWarnings(eqVar);
        ThreeDS2ServiceInstance = (get + 45) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.computeIfPresent
    public /* synthetic */ replace getWarnings(replace replaceVar) {
        int i = get + 91;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            return super.getWarnings(replaceVar);
        }
        super.getWarnings(replaceVar);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public String getWarnings(setScroller setscroller) {
        int i = get + 31;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            return setscroller.getSchemeEncryptionPublicKey();
        }
        String schemeEncryptionPublicKey = setscroller.getSchemeEncryptionPublicKey();
        int i2 = 42 / 0;
        return schemeEncryptionPublicKey;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public replace get(replace replaceVar) {
        cl clVar = new cl(replaceVar, getVersion.get);
        ThreeDS2ServiceInstance = (get + 61) % 128;
        return clVar;
    }
}
