package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* loaded from: classes5.dex */
public class nb {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static byte[] ThreeDS2ServiceInstance;
    private static int get;
    private static int getSDKInfo;
    private static short[] getSDKVersion;
    private static int getWarnings;
    private final Object initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInitializationCallback = 0;
        getSDKInfo = 1;
        get = 518912037;
        getWarnings = -1686431708;
        ThreeDS2Service = -383320175;
        ThreeDS2ServiceInstance = new byte[]{-20, -22, -3, 24, 24, 24};
    }

    public nb(Object obj) {
        this.initialize = obj;
    }

    private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        byte[] bArr;
        int i8;
        Object method;
        getSDKVersion getsdkversion = new getSDKVersion();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getWarnings)};
            short s2 = 0;
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(981393365);
            Class cls = Integer.TYPE;
            if (obj == null) {
                Class cls2 = (Class) removeParam.initialize(63 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), View.MeasureSpec.getMode(0) + 654);
                Object[] objArr3 = new Object[1];
                b((short) 0, (short) 0, -1, objArr3);
                obj = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(981393365, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $10 = ($11 + 31) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr2 = ThreeDS2ServiceInstance;
                if (bArr2 != null) {
                    j = 2786809877878216728L;
                    int length = bArr2.length;
                    byte[] bArr3 = new byte[length];
                    $11 = ($10 + 101) % 128;
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr4 = {Integer.valueOf(bArr2[i9])};
                        short s3 = s2;
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(-1684720202);
                        if (obj2 != null) {
                            i7 = i9;
                            bArr = bArr2;
                            i8 = i4;
                            method = obj2;
                        } else {
                            i7 = i9;
                            Class cls3 = (Class) removeParam.initialize(60 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), 3161 - ImageFormat.getBitsPerPixel(s3));
                            Object[] objArr5 = new Object[1];
                            bArr = bArr2;
                            i8 = i4;
                            b(s3, (short) 2, -1, objArr5);
                            method = cls3.getMethod((String) objArr5[s3], cls);
                            map2.put(-1684720202, method);
                        }
                        bArr3[i7] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i9 = i7 + 1;
                        bArr2 = bArr;
                        i4 = i8;
                        s2 = 0;
                    }
                    bArr2 = bArr3;
                } else {
                    j = 2786809877878216728L;
                }
                i5 = i4;
                if (bArr2 != null) {
                    byte[] bArr4 = ThreeDS2ServiceInstance;
                    Object[] objArr6 = {Integer.valueOf(i2), Integer.valueOf(get)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(981393365);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize(MotionEvent.axisFromString("") + 63, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 655 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        Object[] objArr7 = new Object[1];
                        b((short) 0, (short) 0, -1, objArr7);
                        obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                        map3.put(981393365, obj3);
                    }
                    intValue = (byte) (((byte) (bArr4[((Integer) ((Method) obj3).invoke(null, objArr6)).intValue()] ^ j)) + ((int) (getWarnings ^ j)));
                    $10 = ($11 + 43) % 128;
                } else {
                    intValue = (short) (((short) (getSDKVersion[i2 + ((int) (get ^ j))] ^ j)) + ((int) (getWarnings ^ j)));
                }
            } else {
                i5 = i4;
                j = 2786809877878216728L;
            }
            if (intValue > 0) {
                getsdkversion.ThreeDS2ServiceInstance = ((i2 + intValue) - 2) + ((int) (get ^ j)) + i5;
                Object[] objArr8 = {getsdkversion, Integer.valueOf(i), Integer.valueOf(ThreeDS2Service), sb};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(-1855485602);
                if (obj4 == null) {
                    Class cls5 = (Class) removeParam.initialize(54 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (View.MeasureSpec.getSize(0) + 13764), 2802 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                    Object[] objArr9 = new Object[1];
                    b((short) 0, (short) 1, -1, objArr9);
                    obj4 = cls5.getMethod((String) objArr9[0], Object.class, cls, cls, Object.class);
                    map4.put(-1855485602, obj4);
                }
                ((StringBuilder) ((Method) obj4).invoke(null, objArr8)).append(getsdkversion.ThreeDS2Service);
                getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                byte[] bArr5 = ThreeDS2ServiceInstance;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        bArr6[i10] = (byte) (bArr5[i10] ^ j);
                    }
                    bArr5 = bArr6;
                }
                boolean z = bArr5 != null;
                int i11 = 1;
                while (true) {
                    getsdkversion.initialize = i11;
                    if (getsdkversion.initialize >= intValue) {
                        break;
                    }
                    int i12 = $10;
                    int i13 = i12 + 35;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    if (z) {
                        int i14 = i12 + 29;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        int i16 = getsdkversion.ThreeDS2ServiceInstance;
                        if (i15 == 0) {
                            byte[] bArr7 = ThreeDS2ServiceInstance;
                            getsdkversion.ThreeDS2ServiceInstance = i16 << 1;
                            i6 = getsdkversion.getWarnings % (((byte) (((byte) (bArr7[i16] - j)) >> s)) ^ b);
                        } else {
                            byte[] bArr8 = ThreeDS2ServiceInstance;
                            getsdkversion.ThreeDS2ServiceInstance = i16 - 1;
                            i6 = getsdkversion.getWarnings + (((byte) (((byte) (bArr8[i16] ^ j)) + s)) ^ b);
                        }
                        getsdkversion.ThreeDS2Service = (char) i6;
                    } else {
                        short[] sArr = getSDKVersion;
                        getsdkversion.ThreeDS2ServiceInstance = getsdkversion.ThreeDS2ServiceInstance - 1;
                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[r1] ^ j)) + s)) ^ b));
                    }
                    sb.append(getsdkversion.ThreeDS2Service);
                    getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                    i11 = getsdkversion.initialize + 1;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void b(short s, short s2, int i, Object[] objArr) {
        int i2 = 104 - s2;
        byte[] bArr = $$a;
        int i3 = s * 3;
        int i4 = i + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += i4;
            i4 = i4;
            bArr = bArr;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i4 + 1;
            byte[] bArr3 = bArr;
            i2 += bArr[i7];
            i4 = i7;
            bArr = bArr3;
            i5 = i6;
        }
    }

    public static void init$0() {
        $$a = new byte[]{125, 106, 120, 99};
        $$b = 32;
    }

    public String ThreeDS2ServiceInstance(String str) {
        try {
            Object obj = this.initialize;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getScrollDefaultDelay() >> 16) - 1918756668, (byte) (5 - KeyEvent.getDeadChar(0, 0)), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2053709763 - View.MeasureSpec.getMode(0), (-57) - View.getDefaultSize(0, 0), objArr);
            try {
                Object[] objArr2 = {((String) objArr[0]).intern()};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj2 = map.get(-503495366);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 66, (char) ((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 45769), TextUtils.indexOf("", "") + 4879)).getMethod("createTransaction", String.class);
                    map.put(-503495366, obj2);
                }
                MessageDigest messageDigest = (MessageDigest) ((Method) obj2).invoke(obj, objArr2);
                messageDigest.update(str.getBytes(StandardCharsets.UTF_8), 0, str.length());
                byte[] digest = messageDigest.digest();
                BigInteger bigInteger = new BigInteger(1, digest);
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[1];
                a(TextUtils.lastIndexOf("", '0', 0) - 1918756707, (byte) ((-18) - (ViewConfiguration.getTapTimeout() >> 16)), (short) (Process.myTid() >> 22), 2053709765 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getMode(0) - 58, objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(digest.length << 1);
                Object[] objArr4 = new Object[1];
                a((-1918756625) - View.MeasureSpec.getMode(0), (byte) ((-74) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (short) TextUtils.getCapsMode("", 0, 0), 2053709766 - (KeyEvent.getMaxKeyCode() >> 16), Drawable.resolveOpacity(0, 0) - 59, objArr4);
                sb.append(((String) objArr4[0]).intern());
                String format2 = String.format(sb.toString(), bigInteger);
                int i = getSDKInfo + 121;
                ThreeDS2ServiceInitializationCallback = i % 128;
                if (i % 2 == 0) {
                    return format2;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
