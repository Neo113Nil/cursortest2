package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class ba extends aw implements containsValue, elements {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int cleanup;
    private static char[] getSDKInfo;
    private static int getSDKVersion;
    private static final String getWarnings;
    private boolean ThreeDS2Service;
    private String ThreeDS2ServiceInitializationCallback;
    private boolean ThreeDS2ServiceInstance;
    private boolean get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKVersion = 0;
        cleanup = 1;
        ThreeDS2ServiceInitializationCallback();
        Object[] objArr = new Object[1];
        c(true, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{0, 25, 0, 9}, objArr);
        getWarnings = ((String) objArr[0]).intern();
        int i = getSDKVersion + 75;
        cleanup = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
    }

    public ba(Context context, au auVar) {
        super(context, auVar);
        this.ThreeDS2Service = false;
        this.get = false;
        this.ThreeDS2ServiceInstance = false;
    }

    public static void ThreeDS2ServiceInitializationCallback() {
        getSDKInfo = new char[]{52951, 52877, 52868, 52921, 52920, 52871, 52875, 52887, 52873, 52876, 52877, 52877, 52924, 52925, 52865, 52864, 52873, 52875, 52873, 52873, 52865, 52867, 52917, 52916, 52875};
    }

    private static void c(boolean z, String str, int[] iArr, Object[] objArr) {
        byte[] bArr;
        int i;
        long j;
        Class<Object> cls;
        char[] cArr;
        int i2;
        Class<Object> cls2;
        int i3;
        char[] cArr2;
        Object method;
        String str2 = str;
        Class<Object> cls3 = Object.class;
        $11 = ($10 + 87) % 128;
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
        char[] cArr3 = getSDKInfo;
        Class cls4 = Integer.TYPE;
        if (cArr3 != null) {
            int i8 = -1;
            int length = cArr3.length;
            char c = '0';
            char[] cArr4 = new char[length];
            bArr = bArr3;
            int i9 = 0;
            while (i9 < length) {
                try {
                    int i10 = i9;
                    Object[] objArr2 = {Integer.valueOf(cArr3[i9])};
                    int i11 = length;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cls2 = cls3;
                        cArr = cArr4;
                        i2 = i6;
                        i3 = i7;
                        method = obj;
                        cArr2 = cArr3;
                    } else {
                        cArr = cArr4;
                        i2 = i6;
                        cls2 = cls3;
                        i3 = i7;
                        cArr2 = cArr3;
                        Class cls5 = (Class) removeParam.initialize((ViewConfiguration.getEdgeSlop() >> 16) + 48, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 2294 - TextUtils.indexOf("", c, 0, 0));
                        Object[] objArr3 = new Object[1];
                        f((short) 0, i8, (byte) 1, objArr3);
                        method = cls5.getMethod((String) objArr3[0], cls4);
                        map.put(-1866317650, method);
                    }
                    cArr[i10] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i9 = i10 + 1;
                    length = i11;
                    cArr3 = cArr2;
                    cArr4 = cArr;
                    i6 = i2;
                    i7 = i3;
                    cls3 = cls2;
                    i8 = -1;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        } else {
            bArr = bArr3;
        }
        Class<Object> cls6 = cls3;
        int i12 = i6;
        int i13 = i7;
        char[] cArr5 = new char[i5];
        System.arraycopy(cArr3, i4, cArr5, 0, i5);
        if (bArr != null) {
            char[] cArr6 = new char[i5];
            cleanupVar.get = 0;
            char c2 = 0;
            while (true) {
                int i14 = cleanupVar.get;
                if (i14 >= i5) {
                    break;
                }
                $11 = ($10 + 11) % 128;
                if (bArr[i14] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr5[i14]), Integer.valueOf(c2)};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 != null) {
                        j = -1;
                    } else {
                        j = -1;
                        Class cls7 = (Class) removeParam.initialize(85 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (25857 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1726);
                        Object[] objArr5 = new Object[1];
                        f((short) 0, -1, (byte) 0, objArr5);
                        obj2 = cls7.getMethod((String) objArr5[0], cls4, cls4);
                        map2.put(715226994, obj2);
                    }
                    cArr6[i14] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    j = -1;
                    Object[] objArr6 = {Integer.valueOf(cArr5[i14]), Integer.valueOf(c2)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 66, (char) (32826 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 447 - Color.argb(0, 0, 0, 0))).getMethod("D", cls4, cls4);
                        map3.put(549300883, obj3);
                    }
                    cArr6[i14] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr6[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(102334785);
                if (obj4 != null) {
                    cls = cls6;
                } else {
                    cls = cls6;
                    obj4 = ((Class) removeParam.initialize(73 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1)) - 1), 9820 - Color.alpha(0))).getMethod("I", cls, cls);
                    map4.put(102334785, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                cls6 = cls;
            }
            cArr5 = cArr6;
        }
        if (i13 > 0) {
            char[] cArr7 = new char[i5];
            i = 0;
            System.arraycopy(cArr5, 0, cArr7, 0, i5);
            int i15 = i5 - i13;
            System.arraycopy(cArr7, 0, cArr5, i15, i13);
            System.arraycopy(cArr7, i13, cArr5, 0, i15);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr8 = new char[i5];
            cleanupVar.get = i;
            while (true) {
                int i16 = cleanupVar.get;
                if (i16 >= i5) {
                    break;
                }
                cArr8[i16] = cArr5[(i5 - i16) - 1];
                cleanupVar.get = i16 + 1;
            }
            $10 = ($11 + 125) % 128;
            cArr5 = cArr8;
        }
        if (i12 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i17 = cleanupVar.get;
                if (i17 >= i5) {
                    break;
                }
                cArr5[i17] = (char) (cArr5[i17] - iArr[2]);
                cleanupVar.get = i17 + 1;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(short s, int i, byte b, Object[] objArr) {
        int i2;
        int i3 = (b * 57) + 65;
        int i4 = s * 3;
        byte[] bArr = $$g;
        int i5 = i + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i3 += -i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5++;
            i2++;
            i7 = bArr[i5];
            i3 += -i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static void init$0() {
        $$g = new byte[]{78, -119, -4, 27};
        $$h = 58;
    }

    public static ba initialize(Context context) {
        ba baVar = new ba(context, new au());
        cleanup = (getSDKVersion + 33) % 128;
        return baVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.aw, com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        getSDKVersion = (cleanup + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        super.ThreeDS2Service(setscroller);
        this.ThreeDS2ServiceInitializationCallback = get().get(setscroller.onError());
        getSDKVersion = (cleanup + 107) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        cleanup = (getSDKVersion + 67) % 128;
        Object[] objArr = new Object[1];
        c(true, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{0, 25, 0, 9}, objArr);
        this.ThreeDS2ServiceInstance = erVar.getWarnings(((String) objArr[0]).intern(), false).booleanValue();
        int i = cleanup + 51;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.elements
    public void getWarnings(keys keysVar) {
        if (this.ThreeDS2Service) {
            this.ThreeDS2ServiceInstance = true;
            getSDKVersion = (cleanup + 79) % 128;
        }
        if (this.get || oj.getWarnings((CharSequence) this.ThreeDS2ServiceInitializationCallback)) {
            return;
        }
        getSDKVersion = (cleanup + 43) % 128;
        if (this.ThreeDS2ServiceInstance) {
            ThreeDS2ServiceInstance(this.ThreeDS2ServiceInitializationCallback);
            this.get = true;
            cleanup = (getSDKVersion + 45) % 128;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(eq eqVar) {
        getSDKVersion = (cleanup + 59) % 128;
        Object[] objArr = new Object[1];
        c(true, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{0, 25, 0, 9}, objArr);
        eqVar.get(((String) objArr[0]).intern(), this.ThreeDS2ServiceInstance);
        int i = getSDKVersion + 115;
        cleanup = i % 128;
        if (i % 2 == 0) {
            int i2 = 94 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.elements
    public void getWarnings() {
        int i = cleanup + 65;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            this.ThreeDS2Service = true;
        } else {
            this.ThreeDS2Service = true;
        }
    }
}
