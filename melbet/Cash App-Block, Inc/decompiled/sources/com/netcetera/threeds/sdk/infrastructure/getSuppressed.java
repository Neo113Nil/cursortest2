package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class getSuppressed implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final getSuppressed ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    public static final getSuppressed ThreeDS2ServiceInstance;
    private static char cleanup;
    private static final /* synthetic */ getSuppressed[] createTransaction;
    private static int getSDKInfo;
    private static char[] getSDKVersion;
    public static final getSuppressed getWarnings;
    public static final getSuppressed initialize;
    private String get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInitializationCallback = 0;
        getSDKInfo = 1;
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a((byte) (ExpandableListView.getPackedPositionChild(0L) + 19), "\u000b\u0002\u000f\u0005\u0004\u0003\t\u0007\b\u0003㗣", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((byte) (TextUtils.indexOf("", "", 0, 0) + 8), "㗡", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
        getWarnings = new getSuppressed(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((byte) (98 - View.combineMeasuredStates(0, 0)), "\u000b\u0002\u000f\u0005\u0004\u0003\t\u0007\u000f\u000b\u0001\r\u0005\u000f", 14 - TextUtils.getOffsetAfter("", 0), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((byte) ((-16777203) - Color.rgb(0, 0, 0)), "㗖", 1 - TextUtils.getOffsetAfter("", 0), objArr4);
        initialize = new getSuppressed(intern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a((byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 52), "\u0003\b", ((Process.getThreadPriority(0) + 20) >> 6) + 2, objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a((byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 125), "㙛", 1 - Color.red(0), objArr6);
        ThreeDS2Service = new getSuppressed(intern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a((byte) (23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), "\u0002\u0003㗠", Process.getGidForName("") + 4, objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a((byte) (19 - KeyEvent.getDeadChar(0, 0)), "㗮", 1 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr8);
        ThreeDS2ServiceInstance = new getSuppressed(intern4, 3, ((String) objArr8[0]).intern());
        createTransaction = get();
        int i = getSDKInfo + 33;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 44 / 0;
        }
    }

    private getSuppressed(String str, int i, String str2) {
        this.get = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        getSDKVersion = new char[]{37950, 37947, 37945, 37938, 37888, 37925, 37891, 37951, 37892, 37932, 37934, 37929, 37889, 37928, 37890, 37937};
        cleanup = (char) 41444;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        Object method;
        char[] cArr2;
        char[] cArr3;
        Object method2;
        char[] charArray = str != null ? str.toCharArray() : str;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr4 = getSDKVersion;
        Class cls = Integer.TYPE;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        cArr2 = charArray;
                        cArr3 = cArr4;
                        method2 = obj;
                    } else {
                        cArr2 = charArray;
                        cArr3 = cArr4;
                        Class cls2 = (Class) removeParam.initialize(94 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1560);
                        Object[] objArr3 = new Object[1];
                        b(0, (byte) 0, (short) 1, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method2);
                    }
                    cArr5[i4] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i4++;
                    cArr4 = cArr3;
                    charArray = cArr2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = charArray;
            $10 = ($11 + 25) % 128;
            cArr4 = cArr5;
        } else {
            cArr = charArray;
        }
        Object[] objArr4 = {Integer.valueOf(cleanup)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        char c4 = '\b';
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getTapTimeout() >> 16) + 94, (char) (ViewConfiguration.getTouchSlop() >> 8), 1559 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            Object[] objArr5 = new Object[1];
            b(0, (byte) 0, (short) 1, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr6 = new char[i];
        int i5 = 2;
        if (i % 2 != 0) {
            int i6 = $10 + 117;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                i2 = i + 89;
                cArr6[i2] = (char) (cArr[i2] >> b);
            } else {
                i2 = i - 1;
                cArr6[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = 0;
            while (true) {
                int i7 = getparamvalue.getWarnings;
                if (i7 >= i2) {
                    break;
                }
                char c5 = cArr[i7];
                getparamvalue.get = c5;
                char c6 = cArr[i7 + 1];
                getparamvalue.initialize = c6;
                if (c5 == c6) {
                    int i8 = $11 + 57;
                    $10 = i8 % 128;
                    if (i8 % i5 != 0) {
                        cArr6[i7] = (char) (c5 - b);
                        cArr6[i7] = (char) (c6 * b);
                    } else {
                        cArr6[i7] = (char) (c5 - b);
                        cArr6[i7 + 1] = (char) (c6 - b);
                    }
                    i3 = i5;
                    c = c4;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = getparamvalue;
                    objArr6[11] = Integer.valueOf(charValue);
                    objArr6[10] = getparamvalue;
                    objArr6[9] = getparamvalue;
                    objArr6[c4] = Integer.valueOf(charValue);
                    objArr6[7] = getparamvalue;
                    objArr6[6] = getparamvalue;
                    objArr6[5] = Integer.valueOf(charValue);
                    objArr6[4] = getparamvalue;
                    objArr6[3] = getparamvalue;
                    objArr6[i5] = Integer.valueOf(charValue);
                    objArr6[1] = getparamvalue;
                    objArr6[0] = getparamvalue;
                    i3 = i5;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1395483366);
                    if (obj3 != null) {
                        c = c4;
                        c3 = '\t';
                        method = obj3;
                        c2 = '\n';
                    } else {
                        c = c4;
                        c2 = '\n';
                        c3 = '\t';
                        Class cls4 = (Class) removeParam.initialize(47 - MotionEvent.axisFromString(""), (char) TextUtils.indexOf("", ""), TextUtils.getTrimmedLength("") + 3221);
                        Object[] objArr7 = new Object[1];
                        b(0, (byte) 0, (short) 0, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(-1395483366, method);
                    }
                    int intValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i9 = getparamvalue.cleanup;
                    if (intValue == i9) {
                        Object[] objArr8 = new Object[11];
                        objArr8[c2] = getparamvalue;
                        objArr8[c3] = Integer.valueOf(charValue);
                        objArr8[c] = getparamvalue;
                        objArr8[7] = Integer.valueOf(charValue);
                        objArr8[6] = Integer.valueOf(charValue);
                        objArr8[5] = getparamvalue;
                        objArr8[4] = getparamvalue;
                        objArr8[3] = Integer.valueOf(charValue);
                        objArr8[i3] = Integer.valueOf(charValue);
                        objArr8[1] = getparamvalue;
                        objArr8[0] = getparamvalue;
                        Object obj4 = map3.get(1507360409);
                        if (obj4 == null) {
                            Class cls6 = (Class) removeParam.initialize((-16777169) - Color.rgb(0, 0, 0), (char) (View.combineMeasuredStates(0, 0) + 25644), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11489);
                            Class cls7 = Integer.TYPE;
                            obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(1507360409, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                        int i10 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i11 = getparamvalue.getWarnings;
                        cArr6[i11] = cArr4[intValue2];
                        cArr6[i11 + 1] = cArr4[i10];
                        $11 = ($10 + 91) % 128;
                    } else {
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
                            cArr6[i16] = cArr4[(i12 * charValue) + m];
                            cArr6[i16 + 1] = cArr4[i15];
                        } else {
                            int i17 = (i12 * charValue) + i9;
                            int i18 = getparamvalue.getWarnings;
                            cArr6[i18] = cArr4[i17];
                            cArr6[i18 + 1] = cArr4[(i13 * charValue) + i14];
                        }
                        getparamvalue.getWarnings += 2;
                        i5 = i3;
                        c4 = c;
                    }
                }
                getparamvalue.getWarnings += 2;
                i5 = i3;
                c4 = c;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr6[i19] = (char) (cArr6[i19] ^ 13722);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (b * 4) + 4;
        int i4 = i * 4;
        int i5 = (s * 2) + 117;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i4;
            int i9 = i6 + 1;
            i5 = (-i3) + i8;
            i3 = i9;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i5;
            i6 = i3;
            i3 = bArr[i3];
            bArr3 = bArr;
            i8 = i10;
            int i92 = i6 + 1;
            i5 = (-i3) + i8;
            i3 = i92;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    private static /* synthetic */ getSuppressed[] get() {
        getSuppressed[] getsuppressedArr;
        int i = ThreeDS2ServiceInitializationCallback + 95;
        int i2 = i % 128;
        getSDKInfo = i2;
        if (i % 2 == 0) {
            getsuppressedArr = new getSuppressed[4];
            getsuppressedArr[0] = getWarnings;
            getsuppressedArr[1] = initialize;
            getsuppressedArr[5] = ThreeDS2Service;
            getsuppressedArr[5] = ThreeDS2ServiceInstance;
        } else {
            getsuppressedArr = new getSuppressed[]{getWarnings, initialize, ThreeDS2Service, ThreeDS2ServiceInstance};
        }
        ThreeDS2ServiceInitializationCallback = (i2 + 61) % 128;
        return getsuppressedArr;
    }

    public static void init$0() {
        $$a = new byte[]{67, -54, Byte.MAX_VALUE, PnmConstants.PPM_TEXT_CODE};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
    }

    public static getSuppressed valueOf(String str) {
        int i = ThreeDS2ServiceInitializationCallback + 31;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return (getSuppressed) Enum.valueOf(getSuppressed.class, str);
        }
        Enum.valueOf(getSuppressed.class, str);
        throw null;
    }

    public static getSuppressed[] values() {
        int i = getSDKInfo + 27;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            createTransaction.clone();
            throw null;
        }
        getSuppressed[] getsuppressedArr = (getSuppressed[]) createTransaction.clone();
        int i2 = ThreeDS2ServiceInitializationCallback + 113;
        getSDKInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return getsuppressedArr;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = getSDKInfo;
        String str = this.get;
        ThreeDS2ServiceInitializationCallback = (i + 121) % 128;
        return str;
    }
}
