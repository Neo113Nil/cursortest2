package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class my {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final String ThreeDS2Service;
    private static char[] ThreeDS2ServiceInstance;
    private static int createTransaction;
    public static final String get;
    public static final String getWarnings;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        createTransaction = 1;
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        a(false, new int[]{0, 9, 109, 1}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", objArr);
        get = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(true, new int[]{9, 7, 17, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001", objArr2);
        ThreeDS2Service = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(true, new int[]{16, 7, 89, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001", objArr3);
        getWarnings = ((String) objArr3[0]).intern();
        createTransaction = (initialize + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if ((1.0d - (((android.graphics.Color.blue(r14) * 0.114d) + ((android.graphics.Color.green(r14) * 0.587d) + (android.graphics.Color.red(r14) * 0.299d))) / 255.0d)) >= 0.5d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if ((((((android.graphics.Color.red(r14) * 0.299d) % (android.graphics.Color.green(r14) + 0.587d)) - (android.graphics.Color.blue(r14) + 0.114d)) % 255.0d) + 0.0d) >= 0.5d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005e, code lost:
    
        r14 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean ThreeDS2Service(int i) {
        boolean z;
        int i2 = createTransaction + 107;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
        }
        int i3 = initialize + 55;
        createTransaction = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
        return z;
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        int i;
        int i2;
        long j;
        Class<Object> cls;
        char[] cArr;
        int i3;
        int i4;
        char[] cArr2;
        Class<Object> cls2;
        int i5;
        Object method;
        String str2 = str;
        Class<Object> cls3 = Object.class;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        cleanup cleanupVar = new cleanup();
        int i6 = 0;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr3 = ThreeDS2ServiceInstance;
        Class cls4 = Integer.TYPE;
        if (cArr3 != null) {
            int length = cArr3.length;
            int i11 = 1;
            char[] cArr4 = new char[length];
            while (i6 < length) {
                try {
                    byte[] bArr3 = bArr2;
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    int i12 = i6;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cls2 = cls3;
                        cArr = cArr4;
                        i4 = i9;
                        i5 = i10;
                        cArr2 = cArr3;
                        method = obj;
                        i3 = length;
                    } else {
                        cArr = cArr4;
                        i3 = length;
                        i4 = i9;
                        cArr2 = cArr3;
                        Class cls5 = (Class) removeParam.initialize(48 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 2295 - View.getDefaultSize(0, 0));
                        byte b = (byte) ($$b & 1);
                        byte b2 = (byte) (b - 1);
                        cls2 = cls3;
                        i5 = i10;
                        Object[] objArr3 = new Object[i11];
                        b(b, b2, b2, objArr3);
                        method = cls5.getMethod((String) objArr3[0], cls4);
                        map.put(-1866317650, method);
                    }
                    cArr[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i6 = i12 + 1;
                    bArr2 = bArr3;
                    length = i3;
                    cArr4 = cArr;
                    cArr3 = cArr2;
                    i9 = i4;
                    i10 = i5;
                    cls3 = cls2;
                    i11 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        byte[] bArr4 = bArr2;
        Class<Object> cls6 = cls3;
        int i13 = i9;
        int i14 = i10;
        char[] cArr5 = new char[i8];
        System.arraycopy(cArr3, i7, cArr5, 0, i8);
        if (bArr4 != null) {
            char[] cArr6 = new char[i8];
            cleanupVar.get = 0;
            char c = 0;
            while (true) {
                int i15 = cleanupVar.get;
                if (i15 >= i8) {
                    break;
                }
                $11 = ($10 + 17) % 128;
                if (bArr4[i15] == 1) {
                    j = 0;
                    Object[] objArr4 = {Integer.valueOf(cArr5[i15]), Integer.valueOf(c)};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 == null) {
                        Class cls7 = (Class) removeParam.initialize(86 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (Color.blue(0) + 25857), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1726);
                        Object[] objArr5 = new Object[1];
                        b((byte) 0, 0, (byte) 0, objArr5);
                        obj2 = cls7.getMethod((String) objArr5[0], cls4, cls4);
                        map2.put(715226994, obj2);
                    }
                    cArr6[i15] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    j = 0;
                    Object[] objArr6 = {Integer.valueOf(cArr5[i15]), Integer.valueOf(c)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(66 - ExpandableListView.getPackedPositionGroup(0L), (char) (ExpandableListView.getPackedPositionType(0L) + 32825), KeyEvent.normalizeMetaState(0) + 447)).getMethod("D", cls4, cls4);
                        map3.put(549300883, obj3);
                    }
                    cArr6[i15] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr6[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(102334785);
                if (obj4 != null) {
                    cls = cls6;
                } else {
                    cls = cls6;
                    obj4 = ((Class) removeParam.initialize(75 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 9819)).getMethod("I", cls, cls);
                    map4.put(102334785, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                cls6 = cls;
            }
            cArr5 = cArr6;
        }
        if (i14 > 0) {
            char[] cArr7 = new char[i8];
            i = 0;
            System.arraycopy(cArr5, 0, cArr7, 0, i8);
            int i16 = i8 - i14;
            System.arraycopy(cArr7, 0, cArr5, i16, i14);
            System.arraycopy(cArr7, i14, cArr5, 0, i16);
            $10 = ($11 + 115) % 128;
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr8 = new char[i8];
            cleanupVar.get = i;
            while (true) {
                int i17 = cleanupVar.get;
                if (i17 >= i8) {
                    break;
                }
                int i18 = $10 + 113;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr8[i17] = cArr5[(i8 >> i17) / 0];
                    i2 = i17 / 0;
                } else {
                    cArr8[i17] = cArr5[(i8 - i17) - 1];
                    i2 = i17 + 1;
                }
                cleanupVar.get = i2;
            }
            cArr5 = cArr8;
        }
        if (i13 > 0) {
            int i19 = $11 + 65;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                cleanupVar.get = 1;
            } else {
                cleanupVar.get = 0;
            }
            while (true) {
                int i20 = cleanupVar.get;
                if (i20 >= i8) {
                    break;
                }
                cArr5[i20] = (char) (cArr5[i20] - iArr[2]);
                cleanupVar.get = i20 + 1;
                $11 = ($10 + 125) % 128;
            }
        }
        objArr[0] = new String(cArr5);
    }

    private static void b(byte b, int i, byte b2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (b * 57) + 65;
        int i3 = i * 4;
        int i4 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i2 = i5 + i2;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i7 = bArr[i4];
                i4++;
                i2 += i7;
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{38, 77, -115, 102};
        $$b = 151;
    }

    public static int ThreeDS2Service(int i, String str) {
        createTransaction = (initialize + 119) % 128;
        int parseLong = (int) Long.parseLong(str.substring(1), 16);
        int argb = Color.argb(i, (parseLong >> 16) & 255, (parseLong >> 8) & 255, parseLong & 255);
        int i2 = createTransaction + 89;
        initialize = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return argb;
    }

    public static void ThreeDS2Service() {
        ThreeDS2ServiceInstance = new char[]{52905, 52849, 52849, 52858, 52858, 52858, 52858, 52858, 52858, 52956, 52880, 52880, 52880, 52880, 52880, 52914, 52899, 52846, 52846, 52846, 52846, 52846, 52837};
    }
}
