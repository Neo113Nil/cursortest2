package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

/* loaded from: classes5.dex */
public class ig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ThreeDS2Service;
    private static final String ThreeDS2ServiceInstance;
    private static int cleanup;
    private static char[] get;
    private static int getSDKInfo;
    private final Map<String, String> getWarnings;
    private final no initialize = (no) nu.initialize(new Object[]{ig.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        cleanup = 0;
        getSDKInfo = 1;
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        a(18 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), TextUtils.getOffsetAfter("", 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr);
        ThreeDS2ServiceInstance = ((String) objArr[0]).intern();
        int i = cleanup + 21;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ig(Map<String, String> map) {
        this.getWarnings = map;
    }

    public static void ThreeDS2Service() {
        get = new char[]{35144, 48626, 57380, 5993, 23469, 36576, 46365, 63592, 11440, 21456, 34351, 52585, 61864, 9465, 27439, 40570, 49851, 35185, 48617, 57392, 5988, 23464, 36586, 46374, 63521, 11401, 21471, 34414, 52588, 61864, 9455, 27448, 40556, 49851, 2532, 15478, 25459, 38843, 56033, 319, 13424, 30884, 44965, 53886, 6456, 19887, 28853, 42874, 59996, 7840, 17860, 34826, 48976, 58240, 5830, 23814, 32769, 46214, 64477, 11777, 21824, 39372, 52463, 62223, 9823, 27265, 37332, 50195, 2929, 16277, 25287, 43283, 56337, 131, 14298, 31244, 41300, 54685, 6359, 20243, 29251, 42649, 60723, 4207, 17578, 35818};
        ThreeDS2Service = -7242909798426952313L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x02b2, code lost:
    
        r1[r2] = (char) r27[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02b8, code lost:
    
        r0 = new java.lang.Object[]{r4, r4};
        r1 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r2 = r1.get(1724349229);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02c7, code lost:
    
        if (r2 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x030a, code lost:
    
        ((java.lang.reflect.Method) r2).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0310, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02ca, code lost:
    
        r2 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(47 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 27780), android.view.MotionEvent.axisFromString("") + 2442);
        r4 = com.netcetera.threeds.sdk.infrastructure.ig.$$a[0];
        r5 = (byte) (r4 - 1);
        r8 = new java.lang.Object[1];
        b(r5, (byte) (-r5), r4, r8);
        r2 = r2.getMethod((java.lang.String) r8[0], java.lang.Object.class, java.lang.Object.class);
        r1.put(1724349229, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        long[] jArr;
        int i3;
        int i4;
        Class cls;
        Object method;
        int i5 = i;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i5];
        int i6 = 0;
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i7 = threeDS2ServiceInitializationCallback.initialize;
            if (i7 >= i5) {
                break;
            }
            int i8 = $10 + 43;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            if (i9 == 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(get[i2 - i7])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-54653524);
                    if (obj != null) {
                        jArr = jArr2;
                        i3 = i6;
                        i4 = i7;
                        cls = Object.class;
                        method = obj;
                    } else {
                        i3 = i6;
                        jArr = jArr2;
                        Class cls4 = (Class) removeParam.initialize(View.resolveSizeAndState(i6, i6, i6) + 48, (char) Color.blue(i3), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3220);
                        byte b = $$a[i3];
                        byte b2 = (byte) (b - 1);
                        byte b3 = b;
                        i4 = i7;
                        cls = Object.class;
                        Object[] objArr3 = new Object[1];
                        b(b2, b3, b3, objArr3);
                        method = cls4.getMethod((String) objArr3[i3], cls3);
                        map.put(-54653524, method);
                    }
                    Long l = (Long) ((Method) method).invoke(null, objArr2);
                    l.longValue();
                    long j = threeDS2ServiceInitializationCallback.initialize;
                    long j2 = ThreeDS2Service;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(c);
                    objArr4[2] = Long.valueOf(j2);
                    objArr4[1] = Long.valueOf(j);
                    objArr4[i3] = l;
                    Object obj2 = map.get(1319531906);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 69, (char) (50704 - TextUtils.getOffsetAfter("", i3)), (ViewConfiguration.getPressedStateDuration() >> 16) + 7789)).getMethod("b", cls2, cls2, cls2, cls3);
                        map.put(1319531906, obj2);
                    }
                    jArr[i4] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls5 = (Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (27779 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getTouchSlop() >> 8) + 2441);
                        byte b4 = $$a[0];
                        byte b5 = (byte) (b4 - 1);
                        Object[] objArr6 = new Object[1];
                        b(b5, (byte) (-b5), b4, objArr6);
                        Class cls6 = cls;
                        obj3 = cls5.getMethod((String) objArr6[0], cls6, cls6);
                        map.put(1724349229, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                jArr = jArr2;
                Object[] objArr7 = {Integer.valueOf(get[i2 + i7])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(-54653524);
                if (obj4 == null) {
                    Class cls7 = (Class) removeParam.initialize(Color.blue(0) + 48, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 3221 - View.MeasureSpec.getSize(0));
                    byte b6 = $$a[0];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    Object[] objArr8 = new Object[1];
                    b(b7, b8, b8, objArr8);
                    obj4 = cls7.getMethod((String) objArr8[0], cls3);
                    map2.put(-54653524, obj4);
                }
                Long l2 = (Long) ((Method) obj4).invoke(null, objArr7);
                l2.longValue();
                Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(ThreeDS2Service), Integer.valueOf(c)};
                Object obj5 = map2.get(1319531906);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 69, (char) (KeyEvent.getDeadChar(0, 0) + 50704), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7789)).getMethod("b", cls2, cls2, cls2, cls3);
                    map2.put(1319531906, obj5);
                }
                jArr[i7] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj6 = map2.get(1724349229);
                if (obj6 == null) {
                    Class cls8 = (Class) removeParam.initialize((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 27780), 2442 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b9 = $$a[0];
                    byte b10 = (byte) (b9 - 1);
                    Object[] objArr11 = new Object[1];
                    b(b10, (byte) (-b10), b9, objArr11);
                    obj6 = cls8.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1724349229, obj6);
                }
                ((Method) obj6).invoke(null, objArr10);
            }
            i5 = i;
            jArr2 = jArr;
            i6 = 0;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        long[] jArr3 = jArr2;
        char[] cArr = new char[i5];
        threeDS2ServiceInitializationCallback.initialize = 0;
        $10 = ($11 + 71) % 128;
        while (true) {
            int i10 = threeDS2ServiceInitializationCallback.initialize;
            if (i10 >= i5) {
                String str = new String(cArr);
                $10 = ($11 + 125) % 128;
                objArr[0] = str;
                return;
            }
            int i11 = $11 + 69;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                break;
            }
            cArr[i10] = (char) jArr3[i10];
            Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj7 = map3.get(1724349229);
            if (obj7 == null) {
                Class cls9 = (Class) removeParam.initialize(47 - ImageFormat.getBitsPerPixel(0), (char) ((Process.myPid() >> 22) + 27780), View.MeasureSpec.getMode(0) + 2441);
                byte b11 = $$a[0];
                byte b12 = (byte) (b11 - 1);
                Object[] objArr13 = new Object[1];
                b(b12, (byte) (-b12), b11, objArr13);
                obj7 = cls9.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1724349229, obj7);
            }
            ((Method) obj7).invoke(null, objArr12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, Object[] objArr) {
        int i3;
        int i4 = i2 * 3;
        int i5 = i + 4;
        int i6 = 100 - (s * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i5;
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i4;
            int i10 = i5 + i9;
            int i11 = i7;
            i6 = i10;
            i5 = i11;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i5 + 1;
            int i13 = i6;
            i7 = i12;
            i5 = bArr[i12];
            i8 = i3 + 1;
            bArr3 = bArr;
            i9 = i13;
            int i102 = i5 + i9;
            int i112 = i7;
            i6 = i102;
            i5 = i112;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{0, -50, 44, -33};
        $$b = 151;
    }

    public String getWarnings() {
        cleanup = (getSDKInfo + 17) % 128;
        Map<String, String> map = this.getWarnings;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, ViewConfiguration.getFadingEdgeLength() >> 16, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        String str = map.get(((String) objArr[0]).intern());
        if (oj.get(str)) {
            getSDKInfo = (cleanup + 81) % 128;
            return null;
        }
        try {
            InetAddress.getByName(str);
            return str;
        } catch (SecurityException | UnknownHostException unused) {
            no noVar = this.initialize;
            Object[] objArr2 = new Object[1];
            a(KeyEvent.getDeadChar(0, 0) + 69, View.resolveSizeAndState(0, 0, 0) + 17, (char) TextUtils.getTrimmedLength(""), objArr2);
            noVar.initialize(String.format(((String) objArr2[0]).intern(), str));
            return null;
        }
    }
}
