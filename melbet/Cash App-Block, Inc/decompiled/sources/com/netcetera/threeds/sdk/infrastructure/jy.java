package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class jy implements jo {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static int ThreeDS2ServiceInstance;
    private static char[] initialize;
    private final String get;
    private final String getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        initialize = new char[]{37907, 37954, 37964, 37962, 37918, 37975, 37908, 37967, 37896, 37897, 37977, 37916, 37965, 37955, 37919, 37915};
        ThreeDS2Service = (char) 41444;
    }

    public jy(String str, String str2) {
        this.getWarnings = str;
        this.get = str2;
    }

    public static jo ConfigParameters() {
        Object[] objArr = new Object[1];
        a((byte) (Color.argb(0, 0, 0, 0) + 69), "\u000e\u0006\u000e\r\u0005\u0003㗲", Color.green(0) + 7, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 118), "\u000b\b㙲㙲㙲㙲㙲", Color.argb(0, 0, 0, 0) + 7, objArr2);
        jy jyVar = new jy(intern, ((String) objArr2[0]).intern());
        ThreeDS2ServiceInstance = (ThreeDS2ServiceInitializationCallback + 53) % 128;
        return jyVar;
    }

    public static jo ThreeDS2ServiceInitializationCallback() {
        int i = ThreeDS2ServiceInitializationCallback + 67;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return onError();
        }
        onError();
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        int i = ThreeDS2ServiceInstance + 101;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            onError();
            throw null;
        }
        jo onError = onError();
        ThreeDS2ServiceInstance = (ThreeDS2ServiceInitializationCallback + 41) % 128;
        return onError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0127, code lost:
    
        if (r12 == r13) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        r9 = new java.lang.Object[13];
        r9[12] = r4;
        r9[11] = java.lang.Integer.valueOf(r2);
        r9[10] = r4;
        r9[9] = r4;
        r9[8] = java.lang.Integer.valueOf(r2);
        r9[7] = r4;
        r9[r11] = r4;
        r9[5] = java.lang.Integer.valueOf(r2);
        r9[4] = r4;
        r9[3] = r4;
        r9[r10] = java.lang.Integer.valueOf(r2);
        r9[1] = r4;
        r9[0] = r4;
        r22 = r10;
        r10 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r23 = r10.get(-1395483366);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0199, code lost:
    
        if (r23 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x019b, code lost:
    
        r24 = r11;
        r25 = '\n';
        r26 = 7;
        r11 = r23;
        r23 = '\t';
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
    
        r9 = ((java.lang.Integer) ((java.lang.reflect.Method) r11).invoke(null, r9)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x020a, code lost:
    
        r11 = r4.cleanup;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x020c, code lost:
    
        if (r9 != r11) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020e, code lost:
    
        r9 = new java.lang.Object[11];
        r9[r25] = r4;
        r9[r23] = java.lang.Integer.valueOf(r2);
        r9[8] = r4;
        r9[r26] = java.lang.Integer.valueOf(r2);
        r9[r24] = java.lang.Integer.valueOf(r2);
        r9[5] = r4;
        r9[4] = r4;
        r9[3] = java.lang.Integer.valueOf(r2);
        r9[r22] = java.lang.Integer.valueOf(r2);
        r9[1] = r4;
        r9[0] = r4;
        r12 = r10.get(1507360409);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0249, code lost:
    
        if (r12 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028f, code lost:
    
        r9 = ((java.lang.Integer) ((java.lang.reflect.Method) r12).invoke(null, r9)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x029c, code lost:
    
        r11 = (r4.ThreeDS2ServiceInstance * r2) + r4.cleanup;
        r12 = r4.getWarnings;
        r6[r12] = r5[r9];
        r6[r12 + 1] = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x024c, code lost:
    
        r12 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(46 - android.os.Process.getGidForName(""), (char) (25644 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 11489);
        r27 = java.lang.Integer.TYPE;
        r12 = r12.getMethod("x", java.lang.Object.class, java.lang.Object.class, r27, r27, java.lang.Object.class, java.lang.Object.class, r27, r27, java.lang.Object.class, r27, java.lang.Object.class);
        r10.put(1507360409, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02b2, code lost:
    
        r9 = r4.ThreeDS2Service;
        r12 = r4.ThreeDS2ServiceInstance;
        r13 = r4.ThreeDS2ServiceInitializationCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02b9, code lost:
    
        if (r9 != r12) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02bb, code lost:
    
        r13 = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r13, r2, 1, r2);
        r4.ThreeDS2ServiceInitializationCallback = r13;
        r11 = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r11, r2, 1, r2);
        r4.cleanup = r11;
        r12 = (r12 * r2) + r11;
        r11 = r4.getWarnings;
        r6[r11] = r5[(r9 * r2) + r13];
        r6[r11 + 1] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02d8, code lost:
    
        r9 = (r9 * r2) + r11;
        r11 = r4.getWarnings;
        r6[r11] = r5[r9];
        r6[r11 + 1] = r5[(r12 * r2) + r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a6, code lost:
    
        r24 = r11;
        r25 = '\n';
        r23 = '\t';
        r11 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(48 - (android.os.Process.myPid() >> 22), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) - 1), android.view.MotionEvent.axisFromString("") + 3222);
        r14 = new java.lang.Object[1];
        r26 = 7;
        b(0, 1, 0, r14);
        r12 = (java.lang.String) r14[0];
        r29 = java.lang.Integer.TYPE;
        r11 = r11.getMethod(r12, java.lang.Object.class, java.lang.Object.class, r29, java.lang.Object.class, java.lang.Object.class, r29, java.lang.Object.class, java.lang.Object.class, r29, java.lang.Object.class, java.lang.Object.class, r29, java.lang.Object.class);
        r10.put(-1395483366, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0136, code lost:
    
        r6[r9] = (char) (r4.get - r40);
        r6[r9 + 1] = (char) (r4.initialize - r40);
        r22 = r10;
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        if (r12 == r13) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, String str, int i, Object[] objArr) {
        int i2;
        int i3;
        char c;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr = initialize;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls2 = (Class) removeParam.initialize(94 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (Process.getGidForName("") + 1), 1559 - View.MeasureSpec.getSize(0));
                        Object[] objArr3 = new Object[1];
                        b(0, 0, 0, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method);
                    }
                    cArr2[i4] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 33) % 128;
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(ThreeDS2Service)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        char c2 = 6;
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize(((Process.getThreadPriority(0) + 20) >> 6) + 94, (char) View.resolveSize(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1559);
            Object[] objArr5 = new Object[1];
            b(0, 0, 0, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = $11 + 115;
            $10 = i5 % 128;
            int i6 = 2;
            getparamvalue.getWarnings = i5 % 2 == 0 ? 0 : 1;
            while (true) {
                int i7 = getparamvalue.getWarnings;
                if (i7 >= i2) {
                    break;
                }
                int i8 = $10 + 35;
                $11 = i8 % 128;
                if (i8 % i6 == 0) {
                    char c3 = charArray[i7];
                    getparamvalue.get = c3;
                    char c4 = charArray[i7 << 1];
                    getparamvalue.initialize = c4;
                } else {
                    char c5 = charArray[i7];
                    getparamvalue.get = c5;
                    char c6 = charArray[i7 + 1];
                    getparamvalue.initialize = c6;
                }
                getparamvalue.getWarnings += 2;
                i6 = i3;
                c2 = c;
            }
        }
        for (int i9 = 0; i9 < i; i9++) {
            cArr3[i9] = (char) (cArr3[i9] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = 3 - (i3 * 4);
        int i6 = 119 - (i2 * 2);
        int i7 = i * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7 + 1];
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i6 += -i8;
            i4 = i9;
            i5++;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i6 += -i8;
            i4 = i9;
            i5++;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i7) {
            }
        } else {
            i4 = 0;
            i5++;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i7) {
            }
        }
    }

    public static jo cleanup() {
        ThreeDS2ServiceInitializationCallback = (ThreeDS2ServiceInstance + 47) % 128;
        jo onError = onError();
        ThreeDS2ServiceInstance = (ThreeDS2ServiceInitializationCallback + 59) % 128;
        return onError;
    }

    public static jo createTransaction() {
        Object[] objArr = new Object[1];
        a((byte) (Color.alpha(0) + 69), "\u000e\u0006\u000e\r\u0005\u0003㗲", 6 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((byte) (118 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u000b\b㙲㙲㙲㙲㙲", View.MeasureSpec.getMode(0) + 7, objArr2);
        jy jyVar = new jy(intern, ((String) objArr2[0]).intern());
        int i = ThreeDS2ServiceInstance + 69;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 44 / 0;
        }
        return jyVar;
    }

    public static jo getParamValue() {
        return (jo) get(new Object[0], 464217402, -464217402, (int) System.currentTimeMillis());
    }

    public static jo getSDKInfo() {
        Object[] objArr = new Object[1];
        a((byte) (8 - Color.red(0)), "\u000b\u0002㖲㖲㖲㖲㖲㖲㖲", Color.argb(0, 0, 0, 0) + 9, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((byte) (118 - ExpandableListView.getPackedPositionType(0L)), "\u000b\b㙲㙲㙲㙲㙲", 6 - ImageFormat.getBitsPerPixel(0), objArr2);
        jy jyVar = new jy(intern, ((String) objArr2[0]).intern());
        int i = ThreeDS2ServiceInstance + 23;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            return jyVar;
        }
        throw null;
    }

    public static jo getSDKVersion() {
        int i = ThreeDS2ServiceInstance + 105;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            return onError();
        }
        int i2 = 93 / 0;
        return onError();
    }

    public static void init$0() {
        $$a = new byte[]{PnmConstants.PPM_TEXT_CODE, -88, -122, 15};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE;
    }

    public static jo onError() {
        Object[] objArr = new Object[1];
        a((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20), "\u000b\u0002\u0000\u0003\u0007\b㘑", 6 - ImageFormat.getBitsPerPixel(0), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 118), "\u000b\b㙲㙲㙲㙲㙲", 7 - View.resolveSize(0, 0), objArr2);
        jy jyVar = new jy(intern, ((String) objArr2[0]).intern());
        ThreeDS2ServiceInitializationCallback = (ThreeDS2ServiceInstance + 13) % 128;
        return jyVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jo
    public String ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance;
        String str = this.getWarnings;
        ThreeDS2ServiceInitializationCallback = (i + 29) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = ThreeDS2ServiceInitializationCallback + 111;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        String str = this.get;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jo
    public int getWarnings() {
        int i = ThreeDS2ServiceInstance + 51;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            return 4;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        ThreeDS2ServiceInstance = (ThreeDS2ServiceInitializationCallback + 73) % 128;
        Object[] objArr = new Object[1];
        a((byte) (53 - View.resolveSize(0, 0)), "\u000b\r\u0005\n\t\r\f\n\u0003\b", 10 - TextUtils.getTrimmedLength(""), objArr);
        String intern = ((String) objArr[0]).intern();
        int i = ThreeDS2ServiceInstance + 89;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            return intern;
        }
        throw null;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2ServiceInstance(objArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance + 67;
        int i2 = i % 128;
        ThreeDS2ServiceInitializationCallback = i2;
        int i3 = i % 2 == 0 ? 38 : 16;
        ThreeDS2ServiceInstance = (i2 + 3) % 128;
        return i3;
    }
}
