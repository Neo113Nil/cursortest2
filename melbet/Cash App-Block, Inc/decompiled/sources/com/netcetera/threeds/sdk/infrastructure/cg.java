package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class cg implements compute, forEach {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInitializationCallback;
    private static int getSDKInfo;
    private static char[] getSDKVersion;
    private final Handler ThreeDS2Service;
    private long ThreeDS2ServiceInstance;
    private final merge get;
    private final no getWarnings = (no) nu.initialize(new Object[]{cg.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private getOrDefault initialize;

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getSDKInfo = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        getSDKVersion = new char[]{52897, 52862, 52812, 52823, 52809, 52813, 52847, 52840, 52820, 52822, 52830, 52817, 52822, 52823, 52846, 52832, 52812, 52813, 52811, 52821, 52809, 52808, 52823, 52811, 52841, 52875, 52832, 52812, 52813, 52811, 52821, 52809, 52808, 52823, 52811, 52847, 52854, 52818, 52810, 52819, 52854, 52845, 52819, 52840, 52847, 52811, 52819, 52817, 52822, 52819, 52830, 52821, 52813, 52840, 52897, 52853, 52851, 52849, 52860, 52848, 52854, 52883, 52894, 52859, 52892, 52876, 52854, 52806, 52857, 52848, 52851, 52836, 52837, 52863, 52851, 52853, 52949, 52878, 52876, 52873, 52887, 52865, 52868, 52924, 52924, 52867, 52875, 52886, 52879, 52865, 52879, 52951, 52896, 52906, 52865, 52864, 52877, 52909, 52903, 52865, 52881, 52884, 52875, 52878, 52876, 52866, 52876, 52871, 52788, 52748, 52751, 52789, 52793, 52755, 52747, 52747, 52744, 52736, 52741, 52739, 52738, 52741, 52736};
    }

    public cg(merge mergeVar, getOrDefault getordefault, Handler handler) {
        this.get = mergeVar;
        this.initialize = getordefault;
        this.ThreeDS2Service = handler;
        getordefault.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
    
        if (r20[r8] == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0035, code lost:
    
        r0 = r0.getBytes("ISO-8859-1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0033, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0265 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:13:0x006d, B:16:0x00c2, B:20:0x0088, B:28:0x00df, B:31:0x0121, B:34:0x00f0, B:49:0x0184, B:52:0x01de, B:55:0x0252, B:58:0x0290, B:60:0x0265, B:61:0x01a2, B:65:0x01f3, B:68:0x023e, B:70:0x0210), top: B:12:0x006d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        int i;
        boolean z2;
        char[] cArr;
        char[] cArr2;
        char c;
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        Object obj4;
        char[] cArr3;
        int i3;
        char[] cArr4;
        Object obj5;
        int i4;
        Object method;
        String str2 = str;
        int i5 = $10 + 45;
        $11 = i5 % 128;
        int i6 = 0;
        byte[] bArr = str2;
        if (i5 % 2 == 0) {
            int i7 = 9 / 0;
            bArr = str2;
        }
        byte[] bArr2 = bArr;
        cleanup cleanupVar = new cleanup();
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        char[] cArr5 = getSDKVersion;
        Class cls = Integer.TYPE;
        int i12 = 2;
        char c2 = '0';
        if (cArr5 != null) {
            int length = cArr5.length;
            char[] cArr6 = new char[length];
            while (i6 < length) {
                byte[] bArr3 = bArr2;
                int i13 = $10 + 15;
                int i14 = length;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr5[i6])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj6 = map.get(-1866317650);
                        if (obj6 != null) {
                            i4 = i6;
                            cArr3 = cArr6;
                            i3 = i10;
                            method = obj6;
                            cArr4 = cArr5;
                        } else {
                            i4 = i6;
                            cArr3 = cArr6;
                            i3 = i10;
                            Class cls2 = (Class) removeParam.initialize(View.resolveSizeAndState(0, 0, 0) + 48, (char) View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2295);
                            Object[] objArr3 = new Object[1];
                            cArr4 = cArr5;
                            d((short) 0, 0, 1, objArr3);
                            method = cls2.getMethod((String) objArr3[0], cls);
                            map.put(-1866317650, method);
                        }
                        cArr3[i4] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i6 = i4 << 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i15 = i6;
                    cArr3 = cArr6;
                    i3 = i10;
                    cArr4 = cArr5;
                    Object[] objArr4 = {Integer.valueOf(cArr4[i15])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj7 = map2.get(-1866317650);
                    if (obj7 != null) {
                        obj5 = obj7;
                    } else {
                        Class cls3 = (Class) removeParam.initialize(48 - (ViewConfiguration.getTapTimeout() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), View.resolveSizeAndState(0, 0, 0) + 2295);
                        Object[] objArr5 = new Object[1];
                        d((short) 0, 0, 1, objArr5);
                        Method method2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-1866317650, method2);
                        obj5 = method2;
                    }
                    cArr3[i15] = ((Character) ((Method) obj5).invoke(null, objArr4)).charValue();
                    i6 = i15 + 1;
                }
                length = i14;
                bArr2 = bArr3;
                cArr5 = cArr4;
                cArr6 = cArr3;
                i10 = i3;
            }
            cArr5 = cArr6;
        }
        byte[] bArr4 = bArr2;
        int i16 = i10;
        char[] cArr7 = new char[i9];
        System.arraycopy(cArr5, i8, cArr7, 0, i9);
        if (bArr4 != null) {
            char[] cArr8 = new char[i9];
            cleanupVar.get = 0;
            char c3 = 0;
            while (true) {
                int i17 = cleanupVar.get;
                if (i17 >= i9) {
                    break;
                }
                int i18 = $11 + 1;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    if (bArr4[i17] == 0) {
                        z2 = true;
                        char c4 = cArr7[i17];
                        boolean z3 = z2;
                        Object[] objArr6 = new Object[i12];
                        objArr6[z3 ? 1 : 0] = Integer.valueOf(c3);
                        objArr6[0] = Integer.valueOf(c4);
                        Map map3 = removeParam.visaSchemeConfiguration;
                        Object obj8 = map3.get(715226994);
                        if (obj8 != null) {
                            cArr = cArr7;
                            cArr2 = cArr8;
                            i2 = i17;
                            obj4 = obj8;
                        } else {
                            cArr = cArr7;
                            cArr2 = cArr8;
                            i2 = i17;
                            Class cls4 = (Class) removeParam.initialize(Color.rgb(0, 0, 0) + 16777301, (char) (25857 - (Process.myPid() >> 22)), TextUtils.lastIndexOf("", c2, 0) + 1727);
                            Object[] objArr7 = new Object[1];
                            d((short) 0, 0, 0, objArr7);
                            Method method3 = cls4.getMethod((String) objArr7[0], cls, cls);
                            map3.put(715226994, method3);
                            obj4 = method3;
                        }
                        cArr2[i2] = ((Character) ((Method) obj4).invoke(null, objArr6)).charValue();
                        c = '0';
                        c3 = cArr2[cleanupVar.get];
                        Object[] objArr8 = {cleanupVar, cleanupVar};
                        Map map4 = removeParam.visaSchemeConfiguration;
                        obj2 = map4.get(102334785);
                        if (obj2 == null) {
                            obj3 = obj2;
                        } else {
                            Method method4 = ((Class) removeParam.initialize(ImageFormat.getBitsPerPixel(0) + 75, (char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 9819)).getMethod("I", Object.class, Object.class);
                            map4.put(102334785, method4);
                            obj3 = method4;
                        }
                        ((Method) obj3).invoke(null, objArr8);
                        c2 = c;
                        cArr7 = cArr;
                        cArr8 = cArr2;
                        i12 = 2;
                    }
                    cArr = cArr7;
                    cArr2 = cArr8;
                    Object[] objArr9 = {Integer.valueOf(cArr[i17]), Integer.valueOf(c3)};
                    Map map5 = removeParam.visaSchemeConfiguration;
                    Object obj9 = map5.get(549300883);
                    if (obj9 != null) {
                        c = '0';
                        obj = obj9;
                    } else {
                        c = '0';
                        Method method5 = ((Class) removeParam.initialize(66 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 32825), AndroidCharacter.getMirror('0') + 399)).getMethod("D", cls, cls);
                        map5.put(549300883, method5);
                        obj = method5;
                    }
                    cArr2[i17] = ((Character) ((Method) obj).invoke(null, objArr9)).charValue();
                    c3 = cArr2[cleanupVar.get];
                    Object[] objArr82 = {cleanupVar, cleanupVar};
                    Map map42 = removeParam.visaSchemeConfiguration;
                    obj2 = map42.get(102334785);
                    if (obj2 == null) {
                    }
                    ((Method) obj3).invoke(null, objArr82);
                    c2 = c;
                    cArr7 = cArr;
                    cArr8 = cArr2;
                    i12 = 2;
                } else {
                    z2 = true;
                }
            }
            cArr7 = cArr8;
        }
        if (i11 > 0) {
            $11 = ($10 + 15) % 128;
            char[] cArr9 = new char[i9];
            i = 0;
            System.arraycopy(cArr7, 0, cArr9, 0, i9);
            int i19 = i9 - i11;
            System.arraycopy(cArr9, 0, cArr7, i19, i11);
            System.arraycopy(cArr9, i11, cArr7, 0, i19);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr10 = new char[i9];
            cleanupVar.get = i;
            while (true) {
                int i20 = cleanupVar.get;
                if (i20 >= i9) {
                    break;
                }
                cArr10[i20] = cArr7[(i9 - i20) - 1];
                cleanupVar.get = i20 + 1;
            }
            cArr7 = cArr10;
        }
        if (i16 > 0) {
            cleanupVar.get = 0;
            $10 = ($11 + 85) % 128;
            while (true) {
                int i21 = cleanupVar.get;
                if (i21 >= i9) {
                    break;
                }
                $10 = ($11 + 51) % 128;
                cArr7[i21] = (char) (cArr7[i21] - iArr[2]);
                cleanupVar.get = i21 + 1;
            }
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        int i2 = 103 - (b * 19);
        byte[] bArr = $$a;
        int i3 = b3 * 4;
        int i4 = 14 - (b2 * 10);
        byte[] bArr2 = new byte[i3 + 11];
        int i5 = i3 + 10;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            i2 += i4;
            i4 = i7 + 1;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b4 = bArr[i4];
            int i8 = i4;
            i4 = i2;
            i2 = b4;
            bArr3 = bArr;
            i7 = i8;
            i2 += i4;
            i4 = i7 + 1;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i5) {
            }
        }
    }

    private static void c(byte b, int i, int i2, Object[] objArr) {
        int i3 = i2 * 43;
        byte[] bArr = $$d;
        int i4 = (i * 6) + 99;
        int i5 = (b * PnmConstants.PBM_RAW_CODE) + 4;
        byte[] bArr2 = new byte[i3 + 10];
        int i6 = i3 + 9;
        int i7 = -1;
        if (bArr == null) {
            i4 += i6;
            i5++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 += bArr[i5];
                i5++;
            }
        }
    }

    private static void d(short s, int i, int i2, Object[] objArr) {
        int i3 = (i2 * 57) + 65;
        byte[] bArr = $$g;
        int i4 = i * 3;
        int i5 = 3 - (s * 3);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i4;
            i5 = i5;
        }
        while (true) {
            i6++;
            int i7 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 += bArr[i7];
                i5 = i7;
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{67, -54, Byte.MAX_VALUE, PnmConstants.PPM_TEXT_CODE, -2, 15, -29, 10, 17, -4, -5, 5, -7, 12, 20, 10, -13, 0, -33, 15, -33, 33, 18, 13, 4, -13, -6, 2};
        $$b = 18;
    }

    public static void init$1() {
        $$d = new byte[]{116, 115, -26, -112, 12, -2, -63, 64, -9, 15, -17, 2, 15, -15, 13, -17, -51, 70, -12, 10, -13, 0, -1, 15, -69, 69, -15, 7, -61, 59, 5, -8, 12, -17, 18, 1, -2, 3, -18, 17, 1, -3, -13, -55, 69, -14, 15, -47, 39, -7, 17, -21, 19, -11, 6, -1, 5, -5, 11, -11, -8, 11, -3, 17, -21};
        $$e = 118;
    }

    public static void init$2() {
        $$g = new byte[]{38, 77, -115, 102};
        $$h = 39;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0302  */
    @Override // com.netcetera.threeds.sdk.infrastructure.compute
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ThreeDS2Service(replace replaceVar) {
        byte[] bArr;
        int i;
        int i2;
        Object[] ThreeDS2ServiceInstance$62a34fac;
        char c;
        int i3;
        int i4;
        Class cls = (Class) removeParam.initialize(64 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 1197 - View.getDefaultSize(0, 0));
        byte[] bArr2 = $$a;
        byte b = bArr2[17];
        byte b2 = b;
        Object[] objArr = new Object[1];
        b(b2, (byte) (b2 + 1), b, objArr);
        long j = cls.getField((String) objArr[0]).getLong(null);
        Class cls2 = Integer.TYPE;
        try {
            try {
                if (j != -1) {
                    long j2 = j + 1860;
                    i = 54;
                    i2 = 22;
                    Object[] objArr2 = new Object[1];
                    a(false, new int[]{54, 22, 43, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", objArr2);
                    Class<?> cls3 = Class.forName(((String) objArr2[0]).intern());
                    bArr = bArr2;
                    Object[] objArr3 = new Object[1];
                    a(true, new int[]{76, 15, 0, 15}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", objArr3);
                    if (j2 >= ((Long) cls3.getDeclaredMethod(((String) objArr3[0]).intern(), null).invoke(null, null)).longValue()) {
                        Class cls4 = (Class) removeParam.initialize(64 - KeyEvent.keyCodeFromString(""), (char) KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1196);
                        byte b3 = (byte) (bArr[27] - 1);
                        byte b4 = bArr[17];
                        Object[] objArr4 = new Object[1];
                        b(b3, b4, (byte) (b4 + 1), objArr4);
                        Object[] objArr5 = {cls4.getField((String) objArr4[0]).get(null), -1826038670, 0};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-185248135);
                        if (obj == null) {
                            obj = ((Class) removeParam.initialize(54 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 4275)).getMethod("ThreeDS2ServiceInstance", Object[].class, cls2, cls2);
                            map.put(-185248135, obj);
                        }
                        ThreeDS2ServiceInstance$62a34fac = (Object[]) ((Method) obj).invoke(null, objArr5);
                        c = 1;
                        i3 = ((int[]) ThreeDS2ServiceInstance$62a34fac[c])[0];
                        if (((int[]) ThreeDS2ServiceInstance$62a34fac[0])[0] != i3) {
                            ThreeDS2ServiceInitializationCallback = (getSDKInfo + 19) % 128;
                            Object[] objArr6 = {ThreeDS2ServiceInstance$62a34fac, Integer.valueOf(((int[]) ThreeDS2ServiceInstance$62a34fac[3])[0]), 0};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj2 = map2.get(-185248135);
                            if (obj2 == null) {
                                obj2 = ((Class) removeParam.initialize(54 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) Color.alpha(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4275)).getMethod("ThreeDS2ServiceInstance", Object[].class, cls2, cls2);
                                map2.put(-185248135, obj2);
                            }
                            ((Method) obj2).invoke(null, objArr6);
                            i4 = getSDKInfo + 11;
                        } else {
                            new ArrayList().add((String) ThreeDS2ServiceInstance$62a34fac[2]);
                            try {
                                Object[] objArr7 = {Long.valueOf((i3 ^ r4) ^ (-1383251585554972672L)), -322063359L};
                                byte[] bArr3 = $$d;
                                byte b5 = bArr3[21];
                                Object[] objArr8 = new Object[1];
                                c(b5, b5, bArr3[35], objArr8);
                                Class<?> cls5 = Class.forName((String) objArr8[0]);
                                byte b6 = bArr3[35];
                                Object[] objArr9 = new Object[1];
                                c(b6, b6, bArr3[21], objArr9);
                                String str = (String) objArr9[0];
                                Class cls6 = Long.TYPE;
                                cls5.getMethod(str, cls6, cls6).invoke(null, objArr7);
                                Object[] objArr10 = {ThreeDS2ServiceInstance$62a34fac, Integer.valueOf(((int[]) ThreeDS2ServiceInstance$62a34fac[3])[0]), 0};
                                Map map3 = removeParam.visaSchemeConfiguration;
                                Object obj3 = map3.get(-185248135);
                                if (obj3 == null) {
                                    obj3 = ((Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 54, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 4275 - ExpandableListView.getPackedPositionGroup(0L))).getMethod("ThreeDS2ServiceInstance", Object[].class, cls2, cls2);
                                    map3.put(-185248135, obj3);
                                }
                                ((Method) obj3).invoke(null, objArr10);
                                i4 = getSDKInfo + 109;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        ThreeDS2ServiceInitializationCallback = i4 % 128;
                        this.get.getWarnings(replaceVar);
                        return;
                    }
                } else {
                    bArr = bArr2;
                    i = 54;
                    i2 = 22;
                }
                Object[] objArr11 = new Object[1];
                a(false, new int[]{i, i2, 43, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", objArr11);
                Class<?> cls7 = Class.forName(((String) objArr11[0]).intern());
                Object[] objArr12 = new Object[1];
                a(true, new int[]{76, 15, 0, 15}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", objArr12);
                Long l = (Long) cls7.getDeclaredMethod(((String) objArr12[0]).intern(), null).invoke(null, null);
                l.longValue();
                Class cls8 = (Class) removeParam.initialize(64 - (Process.myTid() >> 22), (char) Color.red(0), 1196 - ImageFormat.getBitsPerPixel(0));
                byte b7 = bArr[17];
                byte b8 = b7;
                c = 1;
                Object[] objArr13 = new Object[1];
                b(b8, (byte) (b8 + 1), b7, objArr13);
                cls8.getField((String) objArr13[0]).set(null, l);
                i3 = ((int[]) ThreeDS2ServiceInstance$62a34fac[c])[0];
                if (((int[]) ThreeDS2ServiceInstance$62a34fac[0])[0] != i3) {
                }
                ThreeDS2ServiceInitializationCallback = i4 % 128;
                this.get.getWarnings(replaceVar);
                return;
            } catch (Exception unused) {
                JWK$$ExternalSyntheticBUOutline0.m2174m$1();
                return;
            }
            Object[] objArr14 = new Object[1];
            a(false, new int[]{91, 16, 0, 13}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", objArr14);
            Class<?> cls9 = Class.forName(((String) objArr14[0]).intern());
            Object[] objArr15 = new Object[1];
            a(true, new int[]{107, 16, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 13}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", objArr15);
            int intValue = ((Integer) cls9.getMethod(((String) objArr15[0]).intern(), Object.class).invoke(null, this)).intValue();
            Object[] objArr16 = {-983745858};
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj4 = map4.get(1646297537);
            if (obj4 == null) {
                obj4 = ((Class) removeParam.initialize(Drawable.resolveOpacity(0, 0) + 60, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Process.myTid() >> 22) + 1137)).getDeclaredConstructor(cls2);
                map4.put(1646297537, obj4);
            }
            ThreeDS2ServiceInstance$62a34fac = nt.ThreeDS2ServiceInstance$62a34fac(intValue, 32, ((Constructor) obj4).newInstance(objArr16), -1826038670);
            Class cls10 = (Class) removeParam.initialize(63 - MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (Process.myTid() >> 22) + 1197);
            byte b9 = (byte) (bArr[27] - 1);
            byte b10 = bArr[17];
            Object[] objArr17 = new Object[1];
            b(b9, b10, (byte) (b10 + 1), objArr17);
            cls10.getField((String) objArr17[0]).set(null, ThreeDS2ServiceInstance$62a34fac);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 long, still in use, count: 2, list:
          (r4v4 long) from 0x004d: PHI (r4v2 long) = (r4v1 long), (r4v4 long) binds: [B:17:0x0028, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]
          (r4v4 long) from 0x001a: CMP_L (r4v4 long), (1000 long) A[WRAPPED]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // com.netcetera.threeds.sdk.infrastructure.forEach
    public void ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setScroller r9) {
        /*
            r8 = this;
            com.netcetera.threeds.sdk.infrastructure.getOrDefault r0 = r8.initialize
            r1 = 0
            if (r0 == 0) goto L59
            int r0 = com.netcetera.threeds.sdk.infrastructure.cg.getSDKInfo
            int r0 = r0 + 57
            int r2 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.cg.ThreeDS2ServiceInitializationCallback = r2
            int r0 = r0 % 2
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L1f
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.ThreeDS2ServiceInstance
            long r4 = r4 + r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L4d
            goto L2a
        L1f:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.ThreeDS2ServiceInstance
            long r4 = r4 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L4d
        L2a:
            int r0 = com.netcetera.threeds.sdk.infrastructure.cg.getSDKInfo
            int r0 = r0 + 81
            int r2 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.cg.ThreeDS2ServiceInitializationCallback = r2
            int r0 = r0 % 2
            com.netcetera.threeds.sdk.infrastructure.getOrDefault r2 = r8.initialize
            if (r0 != 0) goto L44
            r2.ThreeDS2ServiceInstance(r9)
            com.netcetera.threeds.sdk.infrastructure.getOrDefault r8 = r8.initialize
            r8.initialize()
            r8 = 56
            int r8 = r8 / r1
            return
        L44:
            r2.ThreeDS2ServiceInstance(r9)
            com.netcetera.threeds.sdk.infrastructure.getOrDefault r8 = r8.initialize
            r8.initialize()
            return
        L4d:
            android.os.Handler r0 = r8.ThreeDS2Service
            com.netcetera.threeds.sdk.infrastructure.ch r1 = new com.netcetera.threeds.sdk.infrastructure.ch
            r1.<init>(r8, r9)
            long r2 = r2 - r4
            r0.postDelayed(r1, r2)
            return
        L59:
            com.netcetera.threeds.sdk.infrastructure.no r8 = r8.getWarnings
            r9 = 54
            r0 = 70
            int[] r9 = new int[]{r1, r9, r0, r1}
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000"
            a(r1, r9, r2, r0)
            r9 = r0[r1]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.intern()
            r8.initialize(r9)
            int r8 = com.netcetera.threeds.sdk.infrastructure.cg.ThreeDS2ServiceInitializationCallback
            int r8 = r8 + 83
            int r8 = r8 % 128
            com.netcetera.threeds.sdk.infrastructure.cg.getSDKInfo = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.cg.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setScroller):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.forEach
    public void getWarnings() {
        getOrDefault getordefault = this.initialize;
        if (getordefault != null) {
            getordefault.getWarnings();
            this.initialize = null;
            getSDKInfo = (ThreeDS2ServiceInitializationCallback + 65) % 128;
        }
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 33) % 128;
    }

    private /* synthetic */ void getWarnings(setScroller setscroller) {
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 55) % 128;
        ThreeDS2ServiceInstance(setscroller);
        int i = getSDKInfo + 61;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r2.initialize.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r2.initialize != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2.initialize != null) goto L9;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.forEach
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ThreeDS2Service() {
        int i = ThreeDS2ServiceInitializationCallback + 45;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            this.ThreeDS2ServiceInstance = System.currentTimeMillis();
            int i2 = 68 / 0;
        } else {
            this.ThreeDS2ServiceInstance = System.currentTimeMillis();
        }
        int i3 = getSDKInfo + 43;
        ThreeDS2ServiceInitializationCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void ThreeDS2Service(cg cgVar, setScroller setscroller) {
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 71) % 128;
        cgVar.getWarnings(setscroller);
        int i = getSDKInfo + 119;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
    }
}
