package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class replaceAll implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ replaceAll[] ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static char[] ThreeDS2ServiceInstance;
    private static int cleanup;
    private static char createTransaction;
    public static final replaceAll get;
    public static final replaceAll initialize;
    private final String getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        cleanup = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        a((byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 26), "㗝", 1 - TextUtils.getCapsMode("", 0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((byte) (26 - KeyEvent.normalizeMetaState(0)), "㗝", 1 - View.getDefaultSize(0, 0), objArr2);
        initialize = new replaceAll(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33), "㗵", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((byte) (33 - TextUtils.getOffsetAfter("", 0)), "㗵", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
        get = new replaceAll(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2Service = get();
        ThreeDS2ServiceInitializationCallback = (cleanup + 25) % 128;
    }

    private replaceAll(String str, int i, String str2) {
        this.getWarnings = str2;
    }

    public static void ThreeDS2Service() {
        ThreeDS2ServiceInstance = new char[]{41442, 41441, 37923, 37940};
        createTransaction = (char) 41442;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        char c;
        int i2;
        char c2;
        char c3;
        Object method;
        char c4;
        char c5;
        char[] cArr;
        int i3;
        char[] cArr2;
        Class cls;
        int i4;
        Object method2;
        $11 = ($10 + 121) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr3 = ThreeDS2ServiceInstance;
        Class cls2 = Integer.TYPE;
        char c6 = '0';
        int i5 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            c = 5;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        cArr = charArray;
                        method2 = obj;
                        cArr2 = cArr3;
                        cls = cls2;
                        c5 = c6;
                        i4 = i6;
                        i3 = i5;
                    } else {
                        c5 = c6;
                        cArr = charArray;
                        i3 = i5;
                        Class cls3 = (Class) removeParam.initialize(93 - TextUtils.indexOf("", c6, i5), (char) View.resolveSizeAndState(i5, i5, i5), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1559);
                        byte b2 = (byte) ($$b & 5);
                        byte b3 = (byte) (b2 - 1);
                        cArr2 = cArr3;
                        cls = cls2;
                        i4 = i6;
                        Object[] objArr3 = new Object[1];
                        b(b2, b3, b3, objArr3);
                        method2 = cls3.getMethod((String) objArr3[i3], cls);
                        map.put(-78420608, method2);
                    }
                    cArr4[i4] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i6 = i4 + 1;
                    charArray = cArr;
                    c6 = c5;
                    cArr3 = cArr2;
                    i5 = i3;
                    cls2 = cls;
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
            c = 5;
        }
        char[] cArr5 = charArray;
        Class cls4 = cls2;
        char c7 = c6;
        int i7 = i5;
        Object[] objArr4 = {Integer.valueOf(createTransaction)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize(94 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) Color.red(i7), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1559);
            byte b4 = (byte) ($$b & 5);
            byte b5 = (byte) (b4 - 1);
            Object[] objArr5 = new Object[1];
            b(b4, b5, b5, objArr5);
            obj2 = cls5.getMethod((String) objArr5[i7], cls4);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr6[i2] = (char) (cArr5[i2] - b);
            $11 = ($10 + 71) % 128;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = i7;
            while (true) {
                int i8 = getparamvalue.getWarnings;
                if (i8 >= i2) {
                    break;
                }
                $10 = ($11 + 7) % 128;
                char c8 = cArr5[i8];
                getparamvalue.get = c8;
                char c9 = cArr5[i8 + 1];
                getparamvalue.initialize = c9;
                if (c8 == c9) {
                    cArr6[i8] = (char) (c8 - b);
                    cArr6[i8 + 1] = (char) (c9 - b);
                    c4 = c7;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = getparamvalue;
                    objArr6[11] = Integer.valueOf(charValue);
                    objArr6[10] = getparamvalue;
                    objArr6[9] = getparamvalue;
                    objArr6[8] = Integer.valueOf(charValue);
                    objArr6[7] = getparamvalue;
                    objArr6[6] = getparamvalue;
                    objArr6[c] = Integer.valueOf(charValue);
                    objArr6[4] = getparamvalue;
                    objArr6[3] = getparamvalue;
                    objArr6[2] = Integer.valueOf(charValue);
                    objArr6[1] = getparamvalue;
                    objArr6[0] = getparamvalue;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1395483366);
                    if (obj3 != null) {
                        c2 = 2;
                        c3 = '\t';
                        method = obj3;
                    } else {
                        c2 = 2;
                        c3 = '\t';
                        Class cls6 = (Class) removeParam.initialize(48 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Color.alpha(0), 3220 - ExpandableListView.getPackedPositionChild(0L));
                        Object[] objArr7 = new Object[1];
                        b((byte) 0, 0, (short) 0, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls7 = Integer.TYPE;
                        method = cls6.getMethod(str2, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                        map3.put(-1395483366, method);
                    }
                    int intValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i9 = getparamvalue.cleanup;
                    if (intValue == i9) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = getparamvalue;
                        objArr8[c3] = Integer.valueOf(charValue);
                        objArr8[8] = getparamvalue;
                        objArr8[7] = Integer.valueOf(charValue);
                        objArr8[6] = Integer.valueOf(charValue);
                        objArr8[c] = getparamvalue;
                        objArr8[4] = getparamvalue;
                        objArr8[3] = Integer.valueOf(charValue);
                        objArr8[c2] = Integer.valueOf(charValue);
                        objArr8[1] = getparamvalue;
                        objArr8[0] = getparamvalue;
                        Object obj4 = map3.get(1507360409);
                        if (obj4 != null) {
                            c4 = c7;
                        } else {
                            c4 = c7;
                            Class cls8 = (Class) removeParam.initialize(KeyEvent.normalizeMetaState(0) + 47, (char) (TextUtils.lastIndexOf("", c4, 0, 0) + 25645), TextUtils.indexOf("", "") + 11489);
                            Class cls9 = Integer.TYPE;
                            obj4 = cls8.getMethod("x", Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                            map3.put(1507360409, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                        int i10 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i11 = getparamvalue.getWarnings;
                        cArr6[i11] = cArr3[intValue2];
                        cArr6[i11 + 1] = cArr3[i10];
                    } else {
                        c4 = c7;
                        int i12 = getparamvalue.ThreeDS2Service;
                        int i13 = getparamvalue.ThreeDS2ServiceInstance;
                        int i14 = getparamvalue.ThreeDS2ServiceInitializationCallback;
                        if (i12 == i13) {
                            int m = Thread$State$EnumUnboxingLocalUtility.m(i14, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i9, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i15 = (i13 * charValue) + m2;
                            int i16 = getparamvalue.getWarnings;
                            cArr6[i16] = cArr3[(i12 * charValue) + m];
                            cArr6[i16 + 1] = cArr3[i15];
                        } else {
                            int i17 = (i12 * charValue) + i9;
                            int i18 = getparamvalue.getWarnings;
                            cArr6[i18] = cArr3[i17];
                            cArr6[i18 + 1] = cArr3[(i13 * charValue) + i14];
                        }
                        getparamvalue.getWarnings += 2;
                        $11 = ($10 + 107) % 128;
                        c7 = c4;
                    }
                }
                getparamvalue.getWarnings += 2;
                $11 = ($10 + 107) % 128;
                c7 = c4;
            }
        }
        $10 = ($11 + 61) % 128;
        for (int i19 = 0; i19 < i; i19++) {
            cArr6[i19] = (char) (cArr6[i19] ^ 13722);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 1 - (i * 2);
        int i5 = 3 - (s * 2);
        int i6 = (b * 2) + 117;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i3 = 0;
            int i7 = i5;
            i6 += -i5;
            i5 = i7;
            bArr = bArr3;
            i2 = i3;
            int i8 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i5 = b2;
            bArr3 = bArr4;
            i6 += -i5;
            i5 = i7;
            bArr = bArr3;
            i2 = i3;
            int i82 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i822 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    private static /* synthetic */ replaceAll[] get() {
        int i = ThreeDS2ServiceInitializationCallback + 17;
        cleanup = i % 128;
        if (i % 2 == 0) {
            return new replaceAll[]{initialize, get};
        }
        replaceAll[] replaceallArr = new replaceAll[4];
        replaceallArr[1] = initialize;
        replaceallArr[0] = get;
        return replaceallArr;
    }

    public static void init$0() {
        $$a = new byte[]{PnmConstants.PAM_RAW_CODE, -74, 61, -103};
        $$b = 59;
    }

    public static replaceAll valueOf(String str) {
        cleanup = (ThreeDS2ServiceInitializationCallback + 83) % 128;
        replaceAll replaceall = (replaceAll) Enum.valueOf(replaceAll.class, str);
        int i = cleanup + 55;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            return replaceall;
        }
        throw null;
    }

    public static replaceAll[] values() {
        ThreeDS2ServiceInitializationCallback = (cleanup + 23) % 128;
        replaceAll[] replaceallArr = (replaceAll[]) ThreeDS2Service.clone();
        ThreeDS2ServiceInitializationCallback = (cleanup + 21) % 128;
        return replaceallArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = ThreeDS2ServiceInitializationCallback + 51;
        int i2 = i % 128;
        cleanup = i2;
        int i3 = i % 2;
        String str = this.getWarnings;
        if (i3 != 0) {
            throw null;
        }
        ThreeDS2ServiceInitializationCallback = (i2 + 87) % 128;
        return str;
    }
}
