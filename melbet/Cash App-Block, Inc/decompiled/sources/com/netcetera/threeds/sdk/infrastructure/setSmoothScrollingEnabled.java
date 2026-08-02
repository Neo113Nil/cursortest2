package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setSmoothScrollingEnabled {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int cleanup;
    private final String ThreeDS2Service;
    private final List<setProgress> ThreeDS2ServiceInstance;
    private final String get;
    private final String getWarnings;
    private final String initialize;

    public setSmoothScrollingEnabled(String str, String str2, String str3, String str4, List<setProgress> list) {
        this.getWarnings = str;
        this.ThreeDS2Service = str2;
        this.initialize = str3;
        this.get = str4;
        this.ThreeDS2ServiceInstance = list;
    }

    public List<setProgress> ThreeDS2Service() {
        int i = cleanup;
        int i2 = ((i ^ 1) + ((i & 1) << 1)) % 128;
        ThreeDS2ServiceInitializationCallback = i2;
        List<setProgress> list = this.ThreeDS2ServiceInstance;
        cleanup = (i2 + 125) % 128;
        return list;
    }

    public String ThreeDS2ServiceInstance() {
        int i = (cleanup + 111) % 128;
        ThreeDS2ServiceInitializationCallback = i;
        String str = this.getWarnings;
        int i2 = ((i ^ 37) | (i & 37)) << 1;
        int i3 = -(((~i) & 37) | (i & (-38)));
        int i4 = (i2 & i3) + (i3 | i2);
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String get() {
        int i = cleanup;
        int i2 = ((i & 10) + (i | 10)) - 1;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.get;
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return str;
    }

    public String getWarnings() {
        int i = cleanup;
        int m = Thread$State$EnumUnboxingLocalUtility.m(i & 50, i | 50, 1, 128);
        ThreeDS2ServiceInitializationCallback = m;
        String str = this.ThreeDS2Service;
        int i2 = m & 71;
        int i3 = -(-(m | 71));
        int i4 = (i2 & i3) + (i3 | i2);
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String initialize() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i ^ 105;
        int i3 = (i & 105) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        cleanup = i4 % 128;
        int i5 = i4 % 2;
        String str = this.initialize;
        if (i5 != 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public static class ThreeDS2Service {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int cleanup;
        private static long createTransaction;
        private static char[] getSDKInfo;
        private static int getSDKVersion;
        private final String ThreeDS2Service;
        private final String ThreeDS2ServiceInstance;
        private final List<setProgress> get = new ArrayList();
        private String getWarnings;
        private final String initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            cleanup = 0;
            getSDKVersion = 1;
            getSDKInfo = new char[]{35193, 11302, 50108, 31002, 7319, 45665, 27132};
            createTransaction = -3332686972117111736L;
        }

        public ThreeDS2Service(String str, String str2) {
            this.ThreeDS2ServiceInstance = str;
            this.ThreeDS2Service = str2;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr);
            this.initialize = ((String) objArr[0]).intern();
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0220  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char c, Object[] objArr) {
            Throwable cause;
            float f;
            long[] jArr;
            Object method;
            ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
            long[] jArr2 = new long[i];
            int i3 = 0;
            threeDS2ServiceInitializationCallback.initialize = 0;
            while (true) {
                int i4 = threeDS2ServiceInitializationCallback.initialize;
                if (i4 >= i) {
                    break;
                }
                $11 = ($10 + 17) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(getSDKInfo[i2 + i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-54653524);
                    Class cls = Integer.TYPE;
                    if (obj != null) {
                        jArr = jArr2;
                        method = obj;
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                        Class cls2 = (Class) removeParam.initialize(48 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)), (char) (TypedValue.complexToFraction(i3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(i3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 3221 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        Object[] objArr3 = new Object[1];
                        jArr = jArr2;
                        b((byte) -1, (short) 1, (short) 0, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-54653524, method);
                    }
                    Long l = (Long) ((Method) method).invoke(null, objArr2);
                    l.longValue();
                    Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(createTransaction), Integer.valueOf(c)};
                    Object obj2 = map.get(1319531906);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 70, (char) (50704 - KeyEvent.keyCodeFromString("")), 7790 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)));
                        Class cls4 = Long.TYPE;
                        obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                        map.put(1319531906, obj2);
                    }
                    jArr[i4] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls5 = (Class) removeParam.initialize(Gravity.getAbsoluteGravity(0, 0) + 48, (char) (27780 - ((Process.getThreadPriority(0) + 20) >> 6)), 2441 - (KeyEvent.getMaxKeyCode() >> 16));
                        Object[] objArr6 = new Object[1];
                        b((byte) -1, (short) 0, (short) 0, objArr6);
                        obj3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1724349229, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                    jArr2 = jArr;
                    i3 = 0;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            long[] jArr3 = jArr2;
            char[] cArr = new char[i];
            threeDS2ServiceInitializationCallback.initialize = 0;
            while (true) {
                int i5 = threeDS2ServiceInitializationCallback.initialize;
                if (i5 >= i) {
                    objArr[0] = new String(cArr);
                    return;
                }
                int i6 = $11 + 57;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr[i5] = (char) jArr3[i5];
                    Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map2.get(1724349229);
                    if (obj4 == null) {
                        Class cls6 = (Class) removeParam.initialize(Color.blue(0) + 48, (char) (27780 - TextUtils.getCapsMode("", 0, 0)), 2441 - Color.alpha(0));
                        Object[] objArr8 = new Object[1];
                        b((byte) -1, (short) 0, (short) 0, objArr8);
                        obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                        map2.put(1724349229, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr7);
                    int i7 = 31 / 0;
                } else {
                    cArr[i5] = (char) jArr3[i5];
                    Object[] objArr9 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj5 = map3.get(1724349229);
                    if (obj5 == null) {
                        Class cls7 = (Class) removeParam.initialize(48 - ExpandableListView.getPackedPositionGroup(0L), (char) (View.getDefaultSize(0, 0) + 27780), 2441 - View.resolveSizeAndState(0, 0, 0));
                        Object[] objArr10 = new Object[1];
                        b((byte) -1, (short) 0, (short) 0, objArr10);
                        obj5 = cls7.getMethod((String) objArr10[0], Object.class, Object.class);
                        map3.put(1724349229, obj5);
                    }
                    ((Method) obj5).invoke(null, objArr9);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, short s, short s2, Object[] objArr) {
            int i;
            int i2 = s2 * 3;
            int i3 = (s * 3) + 97;
            int i4 = b + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i2 + 1];
            if (bArr == null) {
                int i5 = i4;
                int i6 = i2;
                i = 0;
                int i7 = i5;
                i3 = i4 + (-i6);
                i4 = i7;
                int i8 = i4 + 1;
                bArr2[i] = (byte) i3;
                if (i == i2) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i++;
                i6 = bArr[i8];
                int i9 = i3;
                i5 = i8;
                i4 = i9;
                int i72 = i5;
                i3 = i4 + (-i6);
                i4 = i72;
                int i82 = i4 + 1;
                bArr2[i] = (byte) i3;
                if (i == i2) {
                }
            } else {
                i = 0;
                int i822 = i4 + 1;
                bArr2[i] = (byte) i3;
                if (i == i2) {
                }
            }
        }

        public static void get(long j, long j2) {
            getSDKVersion = (cleanup + 81) % 128;
            try {
                Object[] objArr = {((Class) removeParam.initialize(78 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (10195 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.indexOf("", "") + 7935)).getField("ThreeDS2Service").get(null), Boolean.TRUE};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1643948346);
                if (obj == null) {
                    obj = ((Class) removeParam.initialize(78 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (59653 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.indexOf("", "") + 7711)).getMethod("get", (Class) removeParam.initialize(78 - Color.red(0), (char) (10196 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 7935 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Boolean.TYPE);
                    map.put(-1643948346, obj);
                }
                ((Method) obj).invoke(null, objArr);
                int i = getSDKVersion + 5;
                cleanup = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public static void init$0() {
            $$a = new byte[]{42, 85, -21, -56};
            $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE;
        }

        public ThreeDS2Service ThreeDS2Service(String str) {
            int i = cleanup;
            this.getWarnings = str;
            int i2 = i + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getSDKVersion = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 80 / 0;
            }
            return this;
        }

        public setSmoothScrollingEnabled getWarnings() {
            setSmoothScrollingEnabled setsmoothscrollingenabled = new setSmoothScrollingEnabled((String) oj.getWarnings(this.ThreeDS2ServiceInstance, ""), (String) oj.getWarnings(this.ThreeDS2Service, ""), (String) oj.getWarnings(this.initialize, ""), (String) oj.getWarnings(this.getWarnings, ""), this.get);
            int i = getSDKVersion + 21;
            cleanup = i % 128;
            if (i % 2 == 0) {
                return setsmoothscrollingenabled;
            }
            throw null;
        }

        public ThreeDS2Service initialize(List<setProgress> list) {
            cleanup = (getSDKVersion + 9) % 128;
            this.get.addAll(list);
            int i = getSDKVersion + 25;
            cleanup = i % 128;
            if (i % 2 != 0) {
                int i2 = 12 / 0;
            }
            return this;
        }

        public ThreeDS2Service getWarnings(setProgress setprogress) {
            cleanup = (getSDKVersion + 47) % 128;
            this.get.add(setprogress);
            int i = getSDKVersion + 119;
            cleanup = i % 128;
            if (i % 2 == 0) {
                return this;
            }
            throw null;
        }
    }
}
