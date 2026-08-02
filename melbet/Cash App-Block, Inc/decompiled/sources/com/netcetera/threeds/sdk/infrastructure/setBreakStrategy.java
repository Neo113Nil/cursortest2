package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class setBreakStrategy {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final Set<String> ThreeDS2ServiceInstance;
    private static int createTransaction;
    private static int getSDKInfo;
    private static int[] getSDKVersion;
    private final Object ThreeDS2Service;
    private final Object cleanup;
    private final setTextMetricsParams get;
    private final setLineBreakStyle getWarnings;
    private final no initialize = (no) nu.initialize(new Object[]{setBreakStrategy.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        createTransaction = 0;
        getSDKInfo = 1;
        get();
        Object[] objArr = new Object[1];
        a(new int[]{1387525515, 1923393963, -562716493, 567120089}, ((byte) KeyEvent.getModifierMetaStateMask()) + 6, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{1292370382, -944422845, -562716493, 567120089}, (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 4, objArr2);
        ThreeDS2ServiceInstance = new HashSet(Arrays.asList(intern, ((String) objArr2[0]).intern()));
        createTransaction = (getSDKInfo + 111) % 128;
    }

    public setBreakStrategy(Object obj, setTextMetricsParams settextmetricsparams, setLineBreakStyle setlinebreakstyle, Object obj2) {
        this.ThreeDS2Service = obj;
        this.get = settextmetricsparams;
        this.getWarnings = setlinebreakstyle;
        this.cleanup = obj2;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int[] iArr3;
        int i4;
        char[] cArr;
        int[] iArr4;
        int i5;
        Object method;
        int i6;
        char[] cArr2;
        Object method2;
        createTransaction createtransaction = new createTransaction();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr5 = getSDKVersion;
        Class cls = Integer.TYPE;
        short s = 0;
        if (iArr5 != null) {
            $10 = ($11 + 107) % 128;
            int length2 = iArr5.length;
            i2 = 2;
            int[] iArr6 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr5[i7])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(2095751688);
                    if (obj != null) {
                        i6 = i7;
                        cArr2 = cArr3;
                        method2 = obj;
                    } else {
                        short s2 = s;
                        i6 = i7;
                        Class cls2 = (Class) removeParam.initialize(64 - View.MeasureSpec.getSize(s), (char) (ExpandableListView.getPackedPositionForGroup(s2) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(s2) == 0L ? 0 : -1)), 1245 - AndroidCharacter.getMirror('0'));
                        Object[] objArr3 = new Object[1];
                        cArr2 = cArr3;
                        b(s2, 1, s2, objArr3);
                        method2 = cls2.getMethod((String) objArr3[s2], cls);
                        map.put(2095751688, method2);
                    }
                    iArr6[i6] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i7 = i6 + 1;
                    cArr3 = cArr2;
                    s = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr5 = iArr6;
        } else {
            i2 = 2;
        }
        char[] cArr5 = cArr3;
        char c = '0';
        int length3 = iArr5.length;
        int[] iArr7 = new int[length3];
        int[] iArr8 = getSDKVersion;
        if (iArr8 != null) {
            int i8 = $11 + 119;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr8.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr8.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                Object[] objArr4 = {Integer.valueOf(iArr8[i3])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(2095751688);
                if (obj2 != null) {
                    cArr = cArr4;
                    iArr3 = iArr8;
                    i4 = length;
                    i5 = i3;
                    method = obj2;
                    iArr4 = iArr2;
                } else {
                    iArr3 = iArr8;
                    i4 = length;
                    cArr = cArr4;
                    iArr4 = iArr2;
                    i5 = i3;
                    Class cls3 = (Class) removeParam.initialize(64 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf("", c, 0) + 1198);
                    Object[] objArr5 = new Object[1];
                    b((short) 0, 1, (short) 0, objArr5);
                    method = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2095751688, method);
                }
                iArr4[i5] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                i3 = i5 + 1;
                iArr2 = iArr4;
                iArr8 = iArr3;
                length = i4;
                cArr4 = cArr;
                c = '0';
            }
            iArr8 = iArr2;
        }
        char[] cArr6 = cArr4;
        int i9 = 16;
        System.arraycopy(iArr8, 0, iArr7, 0, length3);
        createtransaction.initialize = 0;
        while (true) {
            int i10 = createtransaction.initialize;
            if (i10 >= iArr.length) {
                objArr[0] = new String(cArr6, 0, i);
                return;
            }
            $10 = ($11 + 95) % 128;
            int i11 = iArr[i10];
            char c2 = (char) (i11 >> 16);
            cArr5[0] = c2;
            char c3 = (char) i11;
            cArr5[1] = c3;
            char c4 = (char) (iArr[i10 + 1] >> 16);
            cArr5[i2] = c4;
            char c5 = (char) iArr[i10 + 1];
            cArr5[3] = c5;
            createtransaction.getWarnings = (c2 << 16) + c3;
            createtransaction.get = (c4 << 16) + c5;
            createTransaction.ThreeDS2ServiceInstance(iArr7);
            int i12 = 0;
            while (i12 < i9) {
                $10 = ($11 + 5) % 128;
                int i13 = createtransaction.getWarnings ^ iArr7[i12];
                createtransaction.getWarnings = i13;
                int ThreeDS2Service = createTransaction.ThreeDS2Service(i13);
                Object[] objArr6 = new Object[4];
                objArr6[3] = createtransaction;
                objArr6[i2] = createtransaction;
                objArr6[1] = Integer.valueOf(ThreeDS2Service);
                objArr6[0] = createtransaction;
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(-411264147);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(49 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ImageFormat.getBitsPerPixel(0) + 1), 13120 - TextUtils.lastIndexOf("", '0'))).getMethod("y", Object.class, cls, Object.class, Object.class);
                    map3.put(-411264147, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                createtransaction.getWarnings = createtransaction.get;
                createtransaction.get = intValue;
                i12++;
                i9 = 16;
            }
            int i14 = createtransaction.getWarnings;
            int i15 = createtransaction.get;
            createtransaction.getWarnings = i15;
            createtransaction.get = i14;
            int i16 = i14 ^ iArr7[16];
            createtransaction.get = i16;
            int i17 = i15 ^ iArr7[17];
            createtransaction.getWarnings = i17;
            cArr5[0] = (char) (i17 >>> 16);
            cArr5[1] = (char) i17;
            cArr5[i2] = (char) (i16 >>> 16);
            cArr5[3] = (char) i16;
            createTransaction.ThreeDS2ServiceInstance(iArr7);
            int i18 = createtransaction.initialize;
            cArr6[i18 * 2] = cArr5[0];
            cArr6[(i18 * 2) + 1] = cArr5[1];
            cArr6[(i18 * 2) + 2] = cArr5[i2];
            cArr6[(i18 * 2) + 3] = cArr5[3];
            int i19 = i2;
            Object[] objArr7 = new Object[i19];
            objArr7[1] = createtransaction;
            objArr7[0] = createtransaction;
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj4 = map4.get(-1870831722);
            if (obj4 != null) {
                i9 = 16;
            } else {
                i9 = 16;
                Class cls4 = (Class) removeParam.initialize(99 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1880 - Color.alpha(0));
                Object[] objArr8 = new Object[1];
                b((short) 0, 0, (short) 0, objArr8);
                obj4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-1870831722, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
            i2 = i19;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, short s2, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s * 2;
        int i4 = 118 - (i * 5);
        int i5 = 3 - (s2 * 3);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += -i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i5];
            i4 += -i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public static void get() {
        getSDKVersion = new int[]{389742221, 709146569, 536908908, -1370620324, -1885006019, 1079794011, 863660241, 540087999, 138979534, 2016621294, 277854326, 1953109660, -46505798, -1751087882, 368350407, -1960833138, -844196187, -444667443};
    }

    public static setBreakStrategy getWarnings$4f6930a6(Object obj) {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj2 = map.get(-232396364);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(67 - TextUtils.indexOf("", "", 0, 0), (char) (45769 - TextUtils.getOffsetBefore("", 0)), 4879 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getDeclaredConstructor(null);
                map.put(-232396364, obj2);
            }
            Object newInstance = ((Constructor) obj2).newInstance(null);
            setBreakStrategy setbreakstrategy = new setBreakStrategy(obj, new setTextMetricsParams(newInstance), new setLineBreakStyle(), newInstance);
            int i = createTransaction + 117;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                return setbreakstrategy;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        $$a = new byte[]{5, 76, 58, -94};
        $$b = EnumC0170g.SDK_ASSET_ICON_SUBMIT_VALUE;
    }

    public setLocalePreferredLineHeightForMinimumUsed ThreeDS2Service(String str) {
        ViewConfiguration.getTouchSlop();
        try {
            Object obj = this.cleanup;
            try {
                Map map = removeParam.visaSchemeConfiguration;
                Object obj2 = map.get(-204033198);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(67 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45769), 4878 - ((byte) KeyEvent.getModifierMetaStateMask()))).getMethod("initialize", null);
                    map.put(-204033198, obj2);
                }
                qs qsVar = (qs) ((Method) obj2).invoke(obj, null);
                qsVar.get(str);
                Color.blue(0);
                List<X509Certificate> ThreeDS2Service = this.getWarnings.ThreeDS2Service(qsVar.onCompleted());
                Object obj3 = this.ThreeDS2Service;
                try {
                    Object[] objArr = {ThreeDS2Service};
                    Object obj4 = map.get(-949968530);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(63 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), View.combineMeasuredStates(0, 0) + 4571)).getMethod("initialize", List.class);
                        map.put(-949968530, obj4);
                    }
                    ((Method) obj4).invoke(obj3, objArr);
                    SystemClock.elapsedRealtimeNanos();
                    qu quVar = qsVar.get();
                    if (!ThreeDS2ServiceInstance.contains(quVar.ThreeDS2ServiceInstance())) {
                        getSDKInfo = (createTransaction + 31) % 128;
                        throw setTextAlignment.getLicenseExpiryDate.initialize(quVar.ThreeDS2ServiceInstance());
                    }
                    qsVar.ThreeDS2ServiceInstance(ThreeDS2Service.get(0).getPublicKey());
                    boolean warnings = qsVar.getWarnings();
                    TextUtils.lastIndexOf("", '0', 0, 0);
                    if (!warnings) {
                        createTransaction = (getSDKInfo + 39) % 128;
                        throw setTextAlignment.SDKInfo.initialize(new Object[0]);
                    }
                    setLocalePreferredLineHeightForMinimumUsed ThreeDS2ServiceInstance2 = this.get.ThreeDS2ServiceInstance(qsVar.ThreeDS2ServiceInstance());
                    int i = createTransaction + 63;
                    getSDKInfo = i % 128;
                    if (i % 2 != 0) {
                        return ThreeDS2ServiceInstance2;
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (ro e) {
            throw setTextAlignment.SchemeInfo.initialize(e);
        }
    }
}
