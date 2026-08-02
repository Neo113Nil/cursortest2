package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
class setMinLines implements setHyphenationFrequency, Runnable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInitializationCallback;
    private static int[] cleanup;
    private static int getSDKVersion;
    private setLineBreakWordStyle ThreeDS2Service;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{setMinLines.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private setHorizontallyScrolling get;
    private long getWarnings;
    private Handler initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKVersion = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        cleanup = new int[]{1215127569, 741745228, 1026881103, -759405176, 74321601, 1840045550, 848038572, -2049966977, 2133826599, 1118126031, -445842609, 888615410, 26359105, -668758204, -1868354933, 1718847549, -279874920, 357841198};
    }

    public setMinLines(setLineBreakWordStyle setlinebreakwordstyle, setHorizontallyScrolling sethorizontallyscrolling, Handler handler, long j) {
        this.ThreeDS2Service = setlinebreakwordstyle;
        this.initialize = handler;
        this.getWarnings = j;
        this.get = sethorizontallyscrolling;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2;
        int i3;
        int length;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        int length2;
        int[] iArr4;
        int i6;
        int i7;
        char[] cArr;
        Object method;
        createTransaction createtransaction = new createTransaction();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr5 = cleanup;
        Class cls = Integer.TYPE;
        int i8 = 0;
        if (iArr5 != null) {
            int i9 = $11 + 1;
            i2 = 2;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length2 = iArr5.length;
                iArr4 = new int[length2];
                i6 = 1;
            } else {
                length2 = iArr5.length;
                iArr4 = new int[length2];
                i6 = 0;
            }
            while (i6 < length2) {
                $10 = ($11 + 15) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr5[i6])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(2095751688);
                    if (obj != null) {
                        i7 = i6;
                        method = obj;
                        cArr = cArr2;
                    } else {
                        i7 = i6;
                        cArr = cArr2;
                        Class cls2 = (Class) removeParam.initialize(AndroidCharacter.getMirror('0') + 16, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1197 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        Object[] objArr3 = new Object[1];
                        b(0, (byte) 0, 0, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2095751688, method);
                    }
                    iArr4[i7] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    i6 = i7 + 1;
                    cArr2 = cArr;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr5 = iArr4;
        } else {
            i2 = 2;
        }
        char[] cArr4 = cArr2;
        int i10 = 16;
        int length3 = iArr5.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = cleanup;
        if (iArr7 != null) {
            int i11 = $11 + 67;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i4 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i4 = 0;
            }
            while (i4 < length) {
                Object[] objArr4 = {Integer.valueOf(iArr7[i4])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(2095751688);
                if (obj2 != null) {
                    iArr3 = iArr7;
                    i5 = length;
                } else {
                    iArr3 = iArr7;
                    i5 = length;
                    Class cls3 = (Class) removeParam.initialize(Color.argb(i8, i8, i8, i8) + 64, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1197 - (Process.myTid() >> 22));
                    Object[] objArr5 = new Object[1];
                    b(0, (byte) 0, 0, objArr5);
                    Method method2 = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2095751688, method2);
                    obj2 = method2;
                }
                iArr2[i4] = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                i4++;
                iArr7 = iArr3;
                length = i5;
                i8 = 0;
            }
            iArr7 = iArr2;
        }
        int i12 = i8;
        System.arraycopy(iArr7, i12, iArr6, i12, length3);
        createtransaction.initialize = i12;
        while (true) {
            int i13 = createtransaction.initialize;
            if (i13 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            int i14 = iArr[i13];
            char c = (char) (i14 >> 16);
            cArr4[i12] = c;
            char c2 = (char) i14;
            cArr4[1] = c2;
            char c3 = (char) (iArr[i13 + 1] >> 16);
            cArr4[i2] = c3;
            char c4 = (char) iArr[i13 + 1];
            cArr4[3] = c4;
            createtransaction.getWarnings = (c << 16) + c2;
            createtransaction.get = (c3 << 16) + c4;
            createTransaction.ThreeDS2ServiceInstance(iArr6);
            int i15 = 0;
            while (true) {
                i3 = createtransaction.getWarnings;
                if (i15 >= i10) {
                    break;
                }
                int i16 = i3 ^ iArr6[i15];
                createtransaction.getWarnings = i16;
                int ThreeDS2Service = createTransaction.ThreeDS2Service(i16);
                Object[] objArr6 = new Object[4];
                objArr6[3] = createtransaction;
                objArr6[i2] = createtransaction;
                objArr6[1] = Integer.valueOf(ThreeDS2Service);
                objArr6[0] = createtransaction;
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(-411264147);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(50 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), 13121 - ExpandableListView.getPackedPositionGroup(0L))).getMethod("y", Object.class, cls, Object.class, Object.class);
                    map3.put(-411264147, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                createtransaction.getWarnings = createtransaction.get;
                createtransaction.get = intValue;
                i15++;
                i10 = 16;
            }
            int i17 = createtransaction.get;
            createtransaction.getWarnings = i17;
            createtransaction.get = i3;
            i10 = 16;
            int i18 = i3 ^ iArr6[16];
            createtransaction.get = i18;
            int i19 = i17 ^ iArr6[17];
            createtransaction.getWarnings = i19;
            cArr4[0] = (char) (i19 >>> 16);
            cArr4[1] = (char) i19;
            cArr4[i2] = (char) (i18 >>> 16);
            cArr4[3] = (char) i18;
            createTransaction.ThreeDS2ServiceInstance(iArr6);
            int i20 = createtransaction.initialize;
            cArr3[i20 * 2] = cArr4[0];
            cArr3[(i20 * 2) + 1] = cArr4[1];
            cArr3[(i20 * 2) + 2] = cArr4[i2];
            cArr3[(i20 * 2) + 3] = cArr4[3];
            int i21 = i2;
            Object[] objArr7 = new Object[i21];
            objArr7[1] = createtransaction;
            objArr7[0] = createtransaction;
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj4 = map4.get(-1870831722);
            if (obj4 == null) {
                Class cls4 = (Class) removeParam.initialize(Color.alpha(0) + 99, (char) (ImageFormat.getBitsPerPixel(0) + 1), 1880 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                Object[] objArr8 = new Object[1];
                b(0, (byte) 0, 1, objArr8);
                obj4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-1870831722, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
            $11 = ($10 + 61) % 128;
            i2 = i21;
            i12 = 0;
        }
    }

    private static void b(int i, byte b, int i2, Object[] objArr) {
        int i3 = (b * 4) + 4;
        int i4 = (i2 * 5) + 113;
        byte[] bArr = $$a;
        int i5 = i * 3;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 += -i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i3];
                i3++;
                i4 += -b2;
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{30, -90, 56, -42};
        $$b = 84;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setHyphenationFrequency
    public void ThreeDS2Service() {
        int i = ThreeDS2ServiceInitializationCallback + 3;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        setHorizontallyScrolling sethorizontallyscrolling = this.get;
        if (i2 != 0) {
            sethorizontallyscrolling.get();
            throw null;
        }
        if (sethorizontallyscrolling.get()) {
            this.get.ThreeDS2Service();
            this.initialize.removeCallbacks(this);
            ThreeDS2ServiceInitializationCallback = (getSDKVersion + 97) % 128;
            return;
        }
        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 9) % 128;
        no noVar = this.ThreeDS2ServiceInstance;
        Object[] objArr = new Object[1];
        a(new int[]{-1818968325, 431678789, -1404939923, -1781199555, 4105748, 1124127354, 1721887490, 914802957, -134807054, -1555967943, -1148449086, 1268739192, -602506465, -1708238186, -1394643542, -211963500, 596430236, 506571804}, 34 - View.resolveSizeAndState(0, 0, 0), objArr);
        noVar.initialize(((String) objArr[0]).intern());
        int i3 = getSDKVersion + 49;
        ThreeDS2ServiceInitializationCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setHyphenationFrequency
    public void getWarnings() {
        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 11) % 128;
        if (this.get.get()) {
            ThreeDS2ServiceInitializationCallback = (getSDKVersion + 23) % 128;
            no noVar = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            a(new int[]{-1818968325, 431678789, -1404939923, -1781199555, 4105748, 1124127354, 1721887490, 914802957, -134807054, -1555967943, 1401816452, -1384955623, -1366852604, -1335274744, -1836407081, -2117272781, -1394643542, -211963500, 596430236, 506571804}, (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 37, objArr);
            noVar.initialize(((String) objArr[0]).intern());
            return;
        }
        this.get.getWarnings();
        this.initialize.postDelayed(this, this.getWarnings);
        int i = ThreeDS2ServiceInitializationCallback + 31;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = ThreeDS2ServiceInitializationCallback + 39;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        setHorizontallyScrolling sethorizontallyscrolling = this.get;
        if (i2 != 0) {
            sethorizontallyscrolling.get();
            throw null;
        }
        if (sethorizontallyscrolling.get()) {
            this.ThreeDS2Service.getWarnings();
            this.get.ThreeDS2Service();
            getSDKVersion = (ThreeDS2ServiceInitializationCallback + 113) % 128;
        }
    }
}
