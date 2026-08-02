package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: classes5.dex */
public class setLayoutAnimation implements setOnCapturedPointerListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static long get;
    private static int initialize;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setLayoutAnimation$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        private static int ThreeDS2Service = 1;
        static final /* synthetic */ int[] get;
        private static int getWarnings;

        static {
            int[] iArr = new int[setTransitionName.values().length];
            get = iArr;
            try {
                iArr[setTransitionName.getWarnings.ordinal()] = 1;
                int i = getWarnings;
                int i2 = i | 67;
                int i3 = i2 << 1;
                int i4 = -((~(i & 67)) & i2);
                ThreeDS2Service = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                get[setTransitionName.initialize.ordinal()] = 2;
                int i5 = ThreeDS2Service;
                getWarnings = (((i5 & (-18)) | ((~i5) & 17)) + ((i5 & 17) << 1)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i6 = ThreeDS2Service;
            int i7 = i6 ^ 35;
            int i8 = ((((i6 & 35) | i7) << 1) - (~(-i7))) - 1;
            getWarnings = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 94 / 0;
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        ThreeDS2ServiceInstance = 1;
        ThreeDS2Service = new char[]{35096, 61116, 18120, 48649, 5715, 36751, 59294, 24348, 46943, 11413, 34007, 64585, 21524, 52654, 4888, 59680, 36560, 9877, 56927, 30238, 61400, 34705, 16210, 55056, 19613, 58523, 40013, 13322, 44502, 17800, 64795, 38155, 2758, 41605, 23122, 61970, 27603, 903, 47943, 21314, 51341, 24747, 6237, 45082, 10694, 49560, 30987, 4407, 46842, 11954, 50802, 32362, 6065, 36745};
        get = -7348545771932487943L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        int i3;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr = new long[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i4 = threeDS2ServiceInitializationCallback.initialize;
            if (i4 >= i) {
                break;
            }
            $11 = ($10 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(ThreeDS2Service[i2 + i4])};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-54653524);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    i3 = 2;
                } else {
                    i3 = 2;
                    Class cls2 = (Class) removeParam.initialize(ImageFormat.getBitsPerPixel(0) + 49, (char) View.combineMeasuredStates(0, 0), View.resolveSizeAndState(0, 0, 0) + 3221);
                    Object[] objArr3 = new Object[1];
                    b(0, (byte) 1, (byte) 0, objArr3);
                    obj = cls2.getMethod((String) objArr3[0], cls);
                    map.put(-54653524, obj);
                }
                Long l = (Long) ((Method) obj).invoke(null, objArr2);
                l.longValue();
                long j = threeDS2ServiceInitializationCallback.initialize;
                long j2 = get;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c);
                objArr4[i3] = Long.valueOf(j2);
                objArr4[1] = Long.valueOf(j);
                objArr4[0] = l;
                Object obj2 = map.get(1319531906);
                if (obj2 == null) {
                    Class cls3 = (Class) removeParam.initialize((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 68, (char) (View.resolveSize(0, 0) + 50704), (ViewConfiguration.getFadingEdgeLength() >> 16) + 7789);
                    Class cls4 = Long.TYPE;
                    obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                    map.put(1319531906, obj2);
                }
                jArr[i4] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i3];
                objArr5[1] = threeDS2ServiceInitializationCallback;
                objArr5[0] = threeDS2ServiceInitializationCallback;
                Object obj3 = map.get(1724349229);
                if (obj3 == null) {
                    Class cls5 = (Class) removeParam.initialize(48 - Gravity.getAbsoluteGravity(0, 0), (char) (View.MeasureSpec.getSize(0) + 27780), 2441 - View.combineMeasuredStates(0, 0));
                    Object[] objArr6 = new Object[1];
                    b(0, (byte) 0, (byte) 0, objArr6);
                    obj3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1724349229, obj3);
                }
                ((Method) obj3).invoke(null, objArr5);
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
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        $10 = ($11 + 67) % 128;
        while (true) {
            int i5 = threeDS2ServiceInitializationCallback.initialize;
            if (i5 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            $10 = ($11 + 33) % 128;
            cArr[i5] = (char) jArr[i5];
            Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(1724349229);
            if (obj4 == null) {
                Class cls6 = (Class) removeParam.initialize((ViewConfiguration.getTouchSlop() >> 8) + 48, (char) (27779 - MotionEvent.axisFromString("")), 2441 - (Process.myPid() >> 22));
                Object[] objArr8 = new Object[1];
                b(0, (byte) 0, (byte) 0, objArr8);
                obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1724349229, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3 = (b * 3) + 97;
        int i4 = 4 - (b2 * 2);
        int i5 = i * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i3 = i5;
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            i3 += i4;
            i4 = i7 + 1;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i4];
            byte[] bArr4 = bArr;
            i7 = i4;
            i4 = b3;
            i6 = i2 + 1;
            bArr3 = bArr4;
            i3 += i4;
            i4 = i7 + 1;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{14, -39, PSSSigner.TRAILER_IMPLICIT, -42};
        $$b = 82;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setOnCapturedPointerListener
    public String ThreeDS2ServiceInstance(setScrollCaptureCallback setscrollcapturecallback) {
        int i = ThreeDS2ServiceInstance + 91;
        initialize = i % 128;
        if (i % 2 != 0) {
            int i2 = AnonymousClass4.get[setscrollcapturecallback.getWarnings().initialize().ordinal()];
            throw null;
        }
        if (AnonymousClass4.get[setscrollcapturecallback.getWarnings().initialize().ordinal()] == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(setscrollcapturecallback.getMessage());
            Object[] objArr = new Object[1];
            a(13 - ExpandableListView.getPackedPositionChild(0L), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(setscrollcapturecallback.getWarnings().ThreeDS2Service());
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getLongPressTimeout() >> 16) + 1, 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 39549), objArr2);
            sb.append(((String) objArr2[0]).intern());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a(39 - View.getDefaultSize(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, (char) ((TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 24652), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append(setscrollcapturecallback.getWarnings().ThreeDS2Service());
        Object[] objArr4 = new Object[1];
        a(-TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.lastIndexOf("", '0') + 15, (char) (39549 - Color.alpha(0)), objArr4);
        sb2.append(((String) objArr4[0]).intern());
        String sb3 = sb2.toString();
        ThreeDS2ServiceInstance = (initialize + 95) % 128;
        return sb3;
    }
}
