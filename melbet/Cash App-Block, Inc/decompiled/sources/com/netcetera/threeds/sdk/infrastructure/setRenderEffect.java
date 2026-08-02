package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setRenderEffect implements setDuplicateParentStateEnabled<initialize> {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getWarnings = 1;
    private final initialize get;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ThreeDS2Service {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        public static final ThreeDS2Service ThreeDS2Service;
        private static int ThreeDS2ServiceInitializationCallback;
        public static final ThreeDS2Service ThreeDS2ServiceInstance;
        private static int cleanup;
        private static long createTransaction;
        public static final ThreeDS2Service get;
        private static char[] getWarnings;
        private static final /* synthetic */ ThreeDS2Service[] initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            cleanup = 0;
            ThreeDS2ServiceInitializationCallback = 1;
            get();
            Object[] objArr = new Object[1];
            a(Color.blue(0) + 11, 1 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (22377 - TextUtils.indexOf("", "", 0)), objArr);
            get = new ThreeDS2Service(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(12 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63938), objArr2);
            ThreeDS2Service = new ThreeDS2Service(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            a(TextUtils.getCapsMode("", 0, 0) + 6, 23 - View.MeasureSpec.getMode(0), (char) (42918 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr3);
            ThreeDS2ServiceInstance = new ThreeDS2Service(((String) objArr3[0]).intern(), 2);
            initialize = ThreeDS2ServiceInstance();
            int i = cleanup + 27;
            ThreeDS2ServiceInitializationCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 7 / 0;
            }
        }

        private ThreeDS2Service(String str, int i) {
        }

        private static /* synthetic */ ThreeDS2Service[] ThreeDS2ServiceInstance() {
            int i = (cleanup + 37) % 128;
            ThreeDS2ServiceInitializationCallback = i;
            ThreeDS2Service[] threeDS2ServiceArr = {get, ThreeDS2Service, ThreeDS2ServiceInstance};
            cleanup = (i + 91) % 128;
            return threeDS2ServiceArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x02d5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x02d6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char c, Object[] objArr) {
            Throwable cause;
            long[] jArr;
            Object method;
            ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
            long[] jArr2 = new long[i];
            threeDS2ServiceInitializationCallback.initialize = 0;
            while (true) {
                int i3 = threeDS2ServiceInitializationCallback.initialize;
                if (i3 >= i) {
                    break;
                }
                int i4 = $11 + 121;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                Class cls = Long.TYPE;
                Class cls2 = Integer.TYPE;
                if (i5 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(getWarnings[i2 << i3])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-54653524);
                        if (obj != null) {
                            jArr = jArr2;
                            method = obj;
                        } else {
                            jArr = jArr2;
                            Class cls3 = (Class) removeParam.initialize(49 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3220);
                            Object[] objArr3 = new Object[1];
                            b((byte) 0, 0, (short) 0, objArr3);
                            method = cls3.getMethod((String) objArr3[0], cls2);
                            map.put(-54653524, method);
                        }
                        Long l = (Long) ((Method) method).invoke(null, objArr2);
                        l.longValue();
                        Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(createTransaction), Integer.valueOf(c)};
                        Object obj2 = map.get(1319531906);
                        if (obj2 == null) {
                            obj2 = ((Class) removeParam.initialize(69 - TextUtils.getOffsetBefore("", 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 50705), 7789 - Color.red(0))).getMethod("b", cls, cls, cls, cls2);
                            map.put(1319531906, obj2);
                        }
                        jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                        Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                        Object obj3 = map.get(1724349229);
                        if (obj3 == null) {
                            Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 48, (char) (27780 - Gravity.getAbsoluteGravity(0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2440);
                            Object[] objArr6 = new Object[1];
                            b((byte) 0, 1, (short) 0, objArr6);
                            obj3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
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
                    Object[] objArr7 = {Integer.valueOf(getWarnings[i2 + i3])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map2.get(-54653524);
                    if (obj4 == null) {
                        Class cls5 = (Class) removeParam.initialize((ViewConfiguration.getTapTimeout() >> 16) + 48, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getScrollBarSize() >> 8) + 3221);
                        Object[] objArr8 = new Object[1];
                        b((byte) 0, 0, (short) 0, objArr8);
                        obj4 = cls5.getMethod((String) objArr8[0], cls2);
                        map2.put(-54653524, obj4);
                    }
                    Long l2 = (Long) ((Method) obj4).invoke(null, objArr7);
                    l2.longValue();
                    Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(createTransaction), Integer.valueOf(c)};
                    Object obj5 = map2.get(1319531906);
                    if (obj5 == null) {
                        obj5 = ((Class) removeParam.initialize(69 - (ViewConfiguration.getTapTimeout() >> 16), (char) (50703 - Process.getGidForName("")), 7789 - View.MeasureSpec.getSize(0))).getMethod("b", cls, cls, cls, cls2);
                        map2.put(1319531906, obj5);
                    }
                    jArr[i3] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                    Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj6 = map2.get(1724349229);
                    if (obj6 == null) {
                        Class cls6 = (Class) removeParam.initialize(48 - ExpandableListView.getPackedPositionType(0L), (char) (27780 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 2441 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        Object[] objArr11 = new Object[1];
                        b((byte) 0, 1, (short) 0, objArr11);
                        obj6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                        map2.put(1724349229, obj6);
                    }
                    ((Method) obj6).invoke(null, objArr10);
                }
                jArr2 = jArr;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            long[] jArr3 = jArr2;
            char[] cArr = new char[i];
            threeDS2ServiceInitializationCallback.initialize = 0;
            $11 = ($10 + 105) % 128;
            while (true) {
                int i6 = threeDS2ServiceInitializationCallback.initialize;
                if (i6 >= i) {
                    objArr[0] = new String(cArr);
                    return;
                }
                $10 = ($11 + 53) % 128;
                cArr[i6] = (char) jArr3[i6];
                Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj7 = map3.get(1724349229);
                if (obj7 == null) {
                    Class cls7 = (Class) removeParam.initialize(48 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 27780), Color.alpha(0) + 2441);
                    Object[] objArr13 = new Object[1];
                    b((byte) 0, 1, (short) 0, objArr13);
                    obj7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                    map3.put(1724349229, obj7);
                }
                ((Method) obj7).invoke(null, objArr12);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, int i, short s, Object[] objArr) {
            int i2;
            int i3;
            int i4 = 100 - (i * 3);
            byte[] bArr = $$a;
            int i5 = 4 - (b * 4);
            int i6 = 1 - (s * 2);
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i7 = i6;
                i3 = 0;
                i5++;
                i4 += i7;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i7 = bArr[i5];
                i5++;
                i4 += i7;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                }
            } else {
                i2 = 0;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                }
            }
        }

        public static void get() {
            getWarnings = new char[]{56835, 24299, 57340, 23779, 56824, 23288, 56296, 22765, 55798, 22255, 55267, 28841, 61505, 29014, 62025, 29522, 62546, 30018, 63047, 30556, 63577, 31071, 64066, 11998, 44578, 12082, 44071, 11565, 43568};
            createTransaction = -770184178907543097L;
        }

        public static void init$0() {
            $$a = new byte[]{98, 4, -35, -97};
            $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
        }

        public static ThreeDS2Service valueOf(String str) {
            ThreeDS2ServiceInitializationCallback = (cleanup + 31) % 128;
            ThreeDS2Service threeDS2Service = (ThreeDS2Service) Enum.valueOf(ThreeDS2Service.class, str);
            cleanup = (ThreeDS2ServiceInitializationCallback + 121) % 128;
            return threeDS2Service;
        }

        public static ThreeDS2Service[] values() {
            int i = ThreeDS2ServiceInitializationCallback + 71;
            cleanup = i % 128;
            if (i % 2 == 0) {
                return (ThreeDS2Service[]) initialize.clone();
            }
            initialize.clone();
            throw null;
        }
    }

    private setRenderEffect(initialize initializeVar) {
        this.get = initializeVar;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        setRenderEffect setrendereffect = new setRenderEffect((initialize) initialize.get(new Object[]{(String) objArr[0]}, 1696510884, -1696510878, (int) System.currentTimeMillis()));
        int i = getWarnings;
        int i2 = i ^ 69;
        int i3 = ((i & 69) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return setrendereffect;
    }

    public static setRenderEffect get() {
        return (setRenderEffect) initialize(new Object[0], 1772295054, -1772295054, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        int intValue = ((Number) objArr[0]).intValue();
        setRenderEffect setrendereffect = new setRenderEffect((initialize) initialize.get(new Object[]{Integer.valueOf(intValue)}, 1605539597, -1605539595, intValue));
        int i = getWarnings;
        int i2 = ((i | 93) << 1) - (i ^ 93);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return setrendereffect;
        }
        throw null;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i4 | i2);
        int i6 = ~i2;
        int i7 = ((i3 | i5 | (~(i6 | i))) * 614) + (i2 * (-613)) + (i * 615);
        int i8 = ~i3;
        int i9 = (((~(i | i8 | i2)) | (~(i4 | i6 | i8))) * 614) + (((~(i4 | i8)) | i5 | (~(i8 | i2))) * (-1228)) + i7;
        if (i9 == 1) {
            return ThreeDS2Service(objArr);
        }
        if (i9 == 2) {
            return getWarnings(objArr);
        }
        setRenderEffect setrendereffect = new setRenderEffect((initialize) initialize.get(new Object[0], -225457632, 225457637, (int) System.currentTimeMillis()));
        ThreeDS2ServiceInstance = (getWarnings + 17) % 128;
        return setrendereffect;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDuplicateParentStateEnabled
    public boolean ThreeDS2ServiceInstance() {
        boolean z;
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i ^ 1) | (i & 1)) << 1;
        int i3 = -(((~i) & 1) | (i & (-2)));
        int i4 = (i2 & i3) + (i3 | i2);
        getWarnings = i4 % 128;
        if (i4 % 2 == 0) {
            ThreeDS2Service();
            throw null;
        }
        if (ThreeDS2Service()) {
            int i5 = getWarnings;
            int i6 = i5 | 97;
            ThreeDS2ServiceInstance = ((i6 << 1) - ((~(i5 & 97)) & i6)) % 128;
            z = false;
        } else {
            int i7 = getWarnings;
            int i8 = i7 & 11;
            int i9 = ((i7 ^ 11) | i8) << 1;
            int i10 = -((i7 | 11) & (~i8));
            ThreeDS2ServiceInstance = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
            z = true;
        }
        int i11 = getWarnings;
        ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m(i11 ^ EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, (i11 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) << 1, -1, 128);
        return z;
    }

    public static class initialize {
        private static int getWarnings = 1;
        private static int initialize;
        private final Integer ThreeDS2Service;
        private final String ThreeDS2ServiceInstance;
        private final ThreeDS2Service get;

        private initialize(ThreeDS2Service threeDS2Service, String str, Integer num) {
            this.ThreeDS2ServiceInstance = str;
            this.get = threeDS2Service;
            this.ThreeDS2Service = num;
        }

        private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
            int i = getWarnings + 37;
            initialize = i % 128;
            if (i % 2 == 0) {
                return (initialize) get(new Object[0], 1908138875, -1908138871, (int) System.currentTimeMillis());
            }
            throw null;
        }

        private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
            initialize initializeVar = (initialize) objArr[0];
            int i = getWarnings;
            initialize = Thread$State$EnumUnboxingLocalUtility.m(i & EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, i | EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 1, 128);
            Boolean bool = (Boolean) get(new Object[]{initializeVar}, -1846315688, 1846315695, System.identityHashCode(initializeVar));
            bool.booleanValue();
            int i2 = getWarnings;
            int i3 = i2 | 89;
            int i4 = (i3 << 1) - ((~(i2 & 89)) & i3);
            initialize = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
            return bool;
        }

        public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i;
            int i5 = ~i2;
            int i6 = ~(i4 | i5);
            int i7 = ~i3;
            int i8 = (~(i4 | i7)) | i6 | (~(i5 | i7));
            int i9 = i | i2;
            int i10 = ((i8 | (~(i9 | i3))) * (-84)) + (i2 * 85) + (i * 85);
            int i11 = i | (~(i3 | i5));
            int i12 = ~(i2 | i7);
            switch (((i12 | (~i9)) * 84) + ((i11 | i12) * (-84)) + i10) {
                case 1:
                    return getWarnings(objArr);
                case 2:
                    int intValue = ((Number) objArr[0]).intValue();
                    int i13 = initialize;
                    getWarnings = Thread$State$EnumUnboxingLocalUtility.m(i13 ^ 72, (i13 & 72) << 1, 1, 128);
                    initialize initializeVar = (initialize) get(new Object[]{Integer.valueOf(intValue)}, 1081878859, -1081878859, intValue);
                    int i14 = initialize;
                    getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1((i14 & (-96)) | ((~i14) & 95), ~(-(-((i14 & 95) << 1))), 1, 128);
                    return initializeVar;
                case 3:
                    return ThreeDS2ServiceInstance(objArr);
                case 4:
                    return initialize(objArr);
                case 5:
                    return ThreeDS2Service(objArr);
                case 6:
                    String str = (String) objArr[0];
                    int i15 = initialize;
                    int i16 = i15 & 115;
                    getWarnings = (i16 + ((i15 ^ 115) | i16)) % 128;
                    initialize initializeVar2 = (initialize) get(new Object[]{str}, 2086870542, -2086870541, (int) System.currentTimeMillis());
                    int i17 = getWarnings;
                    int i18 = (i17 & (-102)) | ((~i17) & 101);
                    int i19 = -(-((i17 & 101) << 1));
                    initialize = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
                    return initializeVar2;
                case 7:
                    return getSDKVersion(objArr);
                default:
                    return get(objArr);
            }
        }

        private static /* synthetic */ Object getSDKVersion(Object[] objArr) {
            boolean z = false;
            initialize initializeVar = (initialize) objArr[0];
            int i = getWarnings;
            int i2 = i & 83;
            int i3 = (i ^ 83) | i2;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            initialize = i4 % 128;
            if (i4 % 2 != 0) {
                ThreeDS2Service threeDS2Service = initializeVar.get;
                ThreeDS2Service threeDS2Service2 = ThreeDS2Service.get;
                throw null;
            }
            if (initializeVar.get != ThreeDS2Service.ThreeDS2ServiceInstance) {
                initialize = (getWarnings + 103) % 128;
                z = true;
            } else {
                int i5 = initialize;
                int i6 = i5 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                int i7 = -(-((i5 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1));
                getWarnings = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
            }
            int identityHashCode = System.identityHashCode(initializeVar);
            int i8 = ~identityHashCode;
            int i9 = (-1086359269) & i8;
            int i10 = ((-1086359269) | i8) & (~i9);
            int i11 = ~((i10 & i9) | (i10 ^ i9));
            int i12 = ((-878859) & i8) | (878858 & identityHashCode);
            int i13 = (-878859) & identityHashCode;
            int i14 = (i13 & i12) | (i12 ^ i13);
            int i15 = (i14 | (~i14)) & (~i14);
            int i16 = ((~i15) & i11) | ((~i11) & i15);
            int i17 = i11 & i15;
            int i18 = (i17 & i16) | (i16 ^ i17);
            int i19 = (2110783486 & i8) | ((-2110783487) & identityHashCode);
            int i20 = 2110783486 & identityHashCode;
            int i21 = ~((i20 & i19) | (i19 ^ i20));
            int i22 = -(-(((i18 & i21) | (i18 ^ i21)) * 765));
            int i23 = 741304342 & i22;
            int i24 = ((741304342 ^ i22) | i23) << 1;
            int i25 = -((i22 | 741304342) & (~i23));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            int i27 = i8 | identityHashCode;
            int i28 = (~identityHashCode) & i27;
            int i29 = (-1087238127) ^ i28;
            int i30 = i28 & (-1087238127);
            int i31 = ~((i30 & i29) | (i29 ^ i30));
            int i32 = ((i31 & 1086359268) | (1086359268 ^ i31)) * 1530;
            int i33 = ((((~i32) & i26) | ((~i26) & i32)) - (~(-(-((i32 & i26) << 1))))) - 1;
            int i34 = ((-1087238127) ^ identityHashCode) | ((-1087238127) & identityHashCode);
            int i35 = (i34 | (~i34)) & (~i34);
            int i36 = (~identityHashCode) & i27;
            int i37 = (i36 & 1024424218) | ((~i36) & 1024424218) | ((-1024424219) & i36);
            int i38 = i37 ^ 1087238126;
            int i39 = i37 & 1087238126;
            int i40 = ~((i39 & i38) | (i38 ^ i39));
            int i41 = i35 & i40;
            int i42 = (i40 | i35) & (~i41);
            int i43 = -(~(((i42 & i41) | (i42 ^ i41)) * 765));
            int i44 = ((i33 & i43) + (i43 | i33)) - 1;
            int i45 = ~System.identityHashCode(initializeVar);
            int i46 = (1210694841 & i45) | ((~i45) & (-1210694842));
            int i47 = i45 & (-1210694842);
            int i48 = ~((i46 & i47) | (i46 ^ i47));
            int i49 = i48 & 1076435001;
            int i50 = (i48 | 1076435001) & (~i49);
            int i51 = -(-(((i50 & i49) | (i50 ^ i49)) * (-160)));
            int i52 = ((~i51) & 401620904) | ((-401620905) & i51);
            int i53 = (i51 & 401620904) << 1;
            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
            int i55 = (-743761027) ^ i45;
            int i56 = i45 & (-743761027);
            int i57 = (i56 & i55) | (i55 ^ i56);
            int i58 = (i57 | (~i57)) & (~i57);
            int i59 = (-1210694842) & i58;
            int i60 = (i58 | (-1210694842)) & (~i59);
            int i61 = -(~(-(-(((i60 & i59) | (i60 ^ i59)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE))));
            if (i44 > ((i54 ^ i61) + ((i61 & i54) << 1)) - 1) {
                return Boolean.valueOf(z);
            }
            throw null;
        }

        private static /* synthetic */ Object getWarnings(Object[] objArr) {
            initialize initializeVar = new initialize(ThreeDS2Service.ThreeDS2Service, (String) objArr[0], null);
            int i = initialize;
            int i2 = i & 75;
            int i3 = i | 75;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            getWarnings = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 87 / 0;
            }
            return initializeVar;
        }

        public String initialize() {
            int i = getWarnings;
            int i2 = ((-2) - (((i & 96) + (i | 96)) ^ (-1))) % 128;
            initialize = i2;
            String str = this.ThreeDS2ServiceInstance;
            int i3 = i2 & 25;
            int i4 = (i2 ^ 25) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            getWarnings = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
            }
            return str;
        }

        private static /* synthetic */ Object initialize(Object[] objArr) {
            initialize initializeVar = new initialize(ThreeDS2Service.ThreeDS2ServiceInstance, null, null);
            int i = getWarnings;
            int i2 = ((i & 64) + (i | 64)) - 1;
            initialize = i2 % 128;
            if (i2 % 2 == 0) {
                return initializeVar;
            }
            throw null;
        }

        public ThreeDS2Service ThreeDS2Service() {
            int i = initialize;
            ThreeDS2Service threeDS2Service = this.get;
            int i2 = i ^ 61;
            getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i & 61) | i2) << 1, ~(-i2), 1, 128);
            return threeDS2Service;
        }

        public Integer ThreeDS2ServiceInstance() {
            int i = initialize;
            Integer num = this.ThreeDS2Service;
            int i2 = i + 61;
            getWarnings = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 48 / 0;
            }
            return num;
        }

        private static /* synthetic */ Object get(Object[] objArr) {
            initialize initializeVar = new initialize(ThreeDS2Service.get, null, Integer.valueOf(((Number) objArr[0]).intValue()));
            int i = initialize;
            int i2 = (i ^ 15) + ((i & 15) << 1);
            getWarnings = i2 % 128;
            if (i2 % 2 != 0) {
                return initializeVar;
            }
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDuplicateParentStateEnabled
    public boolean ThreeDS2Service() {
        ThreeDS2ServiceInstance = (getWarnings + 43) % 128;
        boolean booleanValue = ((Boolean) initialize.get(new Object[]{this.get}, -121828467, 121828470, (int) System.currentTimeMillis())).booleanValue();
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 15;
        int i3 = i2 + ((i ^ 15) | i2);
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            return booleanValue;
        }
        throw null;
    }

    public initialize initialize() {
        int i = getWarnings;
        int i2 = ((-2) - ((((i | 14) << 1) - (i ^ 14)) ^ (-1))) % 128;
        ThreeDS2ServiceInstance = i2;
        initialize initializeVar = this.get;
        int i3 = i2 + 92;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            return initializeVar;
        }
        throw null;
    }

    public static setRenderEffect initialize(String str) {
        return (setRenderEffect) initialize(new Object[]{str}, 1470041373, -1470041372, (int) System.currentTimeMillis());
    }

    public static setRenderEffect ThreeDS2ServiceInstance(int i) {
        return (setRenderEffect) initialize(new Object[]{Integer.valueOf(i)}, 1831759760, -1831759758, i);
    }
}
