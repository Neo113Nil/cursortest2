package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class loadFromXML<T extends View> implements writeReplace<T> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInstance;
    private static char[] get;
    private static int getSDKVersion;
    private final Context ThreeDS2Service;
    private T getWarnings;
    protected final no initialize = (no) nu.initialize(new Object[]{loadFromXML.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        getSDKVersion = 1;
        get = new char[]{52893, 52758, 52937, 52879, 52907, 52903, 52954, 52928, 52917, 52873, 52864, 52920, 52956, 52901, 52867, 52867, 52865, 52872, 52885, 52887, 52886, 52911, 52896, 52886, 52909, 52953, 52879, 52907, 52903, 52954, 52909, 52875, 52875, 52910, 52896, 52886, 52909, 52901, 52879, 52864, 52870, 52864, 52870};
    }

    public loadFromXML(Context context) {
        this.ThreeDS2Service = context;
    }

    private static void d(boolean z, String str, int[] iArr, Object[] objArr) {
        byte[] bArr;
        int i;
        char[] cArr;
        Class<Object> cls;
        int i2;
        int i3;
        int i4;
        char[] cArr2;
        Class<Object> cls2;
        Integer num;
        Object method;
        String str2 = str;
        Class<Object> cls3 = Object.class;
        Integer num2 = 102334785;
        int i5 = ($10 + 11) % 128;
        $11 = i5;
        byte[] bArr2 = str2;
        if (str2 != null) {
            int i6 = i5 + 115;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str2.getBytes("ISO-8859-1");
                throw null;
            }
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        cleanup cleanupVar = new cleanup();
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr3 = get;
        Class cls4 = Integer.TYPE;
        if (cArr3 != null) {
            int i11 = 1;
            int length = cArr3.length;
            int i12 = 0;
            char[] cArr4 = new char[length];
            bArr = bArr3;
            int i13 = 0;
            while (i13 < length) {
                try {
                    int i14 = i13;
                    Object[] objArr2 = {Integer.valueOf(cArr3[i13])};
                    char[] cArr5 = cArr4;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cls2 = cls3;
                        num = num2;
                        i2 = length;
                        i3 = i9;
                        i4 = i10;
                        method = obj;
                        cArr2 = cArr3;
                    } else {
                        i2 = length;
                        i3 = i9;
                        i4 = i10;
                        cArr2 = cArr3;
                        Class cls5 = (Class) removeParam.initialize(View.MeasureSpec.getSize(i12) + 48, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2295 - TextUtils.indexOf("", "", i12));
                        byte b = $$d[i11];
                        byte b2 = (byte) (b - 1);
                        byte b3 = b;
                        cls2 = cls3;
                        num = num2;
                        Object[] objArr3 = new Object[i11];
                        e(b2, b3, (byte) (b3 - 1), objArr3);
                        method = cls5.getMethod((String) objArr3[0], cls4);
                        map.put(-1866317650, method);
                    }
                    cArr5[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13 = i14 + 1;
                    cArr4 = cArr5;
                    cArr3 = cArr2;
                    length = i2;
                    i9 = i3;
                    i10 = i4;
                    cls3 = cls2;
                    num2 = num;
                    i11 = 1;
                    i12 = 0;
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
        Integer num3 = num2;
        int i15 = i9;
        int i16 = i10;
        char[] cArr6 = new char[i8];
        System.arraycopy(cArr3, i7, cArr6, 0, i8);
        if (bArr != null) {
            char[] cArr7 = new char[i8];
            cleanupVar.get = 0;
            char c = 0;
            while (true) {
                int i17 = cleanupVar.get;
                if (i17 >= i8) {
                    break;
                }
                if (bArr[i17] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr6[i17]), Integer.valueOf(c)};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 != null) {
                        cArr = cArr6;
                    } else {
                        Class cls7 = (Class) removeParam.initialize(85 - Color.blue(0), (char) (TextUtils.getOffsetBefore("", 0) + 25857), (-16775490) - Color.rgb(0, 0, 0));
                        byte b4 = (byte) ($$d[1] - 1);
                        byte b5 = b4;
                        cArr = cArr6;
                        Object[] objArr5 = new Object[1];
                        e(b4, b5, b5, objArr5);
                        obj2 = cls7.getMethod((String) objArr5[0], cls4, cls4);
                        map2.put(715226994, obj2);
                    }
                    cArr7[i17] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    cArr = cArr6;
                    Object[] objArr6 = {Integer.valueOf(cArr[i17]), Integer.valueOf(c)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(View.MeasureSpec.getSize(0) + 66, (char) (32825 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 447 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("D", cls4, cls4);
                        map3.put(549300883, obj3);
                    }
                    cArr7[i17] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr7[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Integer num4 = num3;
                Object obj4 = map4.get(num4);
                if (obj4 != null) {
                    cls = cls6;
                } else {
                    cls = cls6;
                    obj4 = ((Class) removeParam.initialize(74 - TextUtils.getCapsMode("", 0, 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 9820 - (Process.myTid() >> 22))).getMethod("I", cls, cls);
                    map4.put(num4, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                $11 = ($10 + 65) % 128;
                num3 = num4;
                cls6 = cls;
                cArr6 = cArr;
            }
            cArr6 = cArr7;
        }
        if (i16 > 0) {
            char[] cArr8 = new char[i8];
            i = 0;
            System.arraycopy(cArr6, 0, cArr8, 0, i8);
            int i18 = i8 - i16;
            System.arraycopy(cArr8, 0, cArr6, i18, i16);
            System.arraycopy(cArr8, i16, cArr6, 0, i18);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr9 = new char[i8];
            cleanupVar.get = i;
            while (true) {
                int i19 = cleanupVar.get;
                if (i19 >= i8) {
                    break;
                }
                $10 = ($11 + 83) % 128;
                cArr9[i19] = cArr6[(i8 - i19) - 1];
                cleanupVar.get = i19 + 1;
            }
            cArr6 = cArr9;
        }
        if (i15 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i20 = cleanupVar.get;
                if (i20 >= i8) {
                    break;
                }
                cArr6[i20] = (char) (cArr6[i20] - iArr[2]);
                cleanupVar.get = i20 + 1;
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
    private static void e(int i, short s, int i2, Object[] objArr) {
        int i3;
        byte[] bArr = $$d;
        int i4 = (s * 57) + 65;
        int i5 = (i * 4) + 4;
        int i6 = i2 * 4;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4 = i5;
            i5++;
            i4 += i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i5++;
            i4 += i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$d = new byte[]{6, 1, 30, -98};
        $$e = 131;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public T ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance + 89;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            initialize();
            throw null;
        }
        initialize();
        T t = this.getWarnings;
        int i2 = getSDKVersion + 69;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return t;
        }
        throw null;
    }

    public abstract T ThreeDS2ServiceInstance(Context context);

    public void getWarnings(View view, String str) {
        Resources resources;
        String intern;
        String packageName;
        int i = getSDKVersion + 113;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        Context context = this.ThreeDS2Service;
        try {
            if (i2 != 0) {
                resources = context.getResources();
                Object[] objArr = new Object[1];
                d(false, "\u0000\u0001", new int[]{0, 2, EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 0}, objArr);
                intern = ((String) objArr[0]).intern();
                packageName = this.ThreeDS2Service.getPackageName();
            } else {
                resources = context.getResources();
                Object[] objArr2 = new Object[1];
                d(false, "\u0000\u0001", new int[]{0, 2, EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 0}, objArr2);
                intern = ((String) objArr2[0]).intern();
                packageName = this.ThreeDS2Service.getPackageName();
            }
            view.setId(resources.getIdentifier(str, intern, packageName));
        } catch (Throwable th) {
            no noVar = this.initialize;
            Object[] objArr3 = new Object[1];
            d(true, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{2, 41, 0, 0}, objArr3);
            noVar.initialize(String.format(((String) objArr3[0]).intern(), str, th.getMessage()));
        }
        ThreeDS2ServiceInstance = (getSDKVersion + 115) % 128;
    }

    public final void initialize() {
        if (this.getWarnings == null) {
            ThreeDS2ServiceInstance = (getSDKVersion + 87) % 128;
            this.getWarnings = ThreeDS2ServiceInstance(this.ThreeDS2Service);
            ThreeDS2ServiceInstance = (getSDKVersion + 63) % 128;
        }
    }
}
