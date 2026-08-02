package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class kd implements jo {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInitializationCallback;
    private static long ThreeDS2ServiceInstance;
    private static char[] get;
    private static int getWarnings;
    private final String ThreeDS2Service;
    private final String initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getWarnings = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        get = new char[]{35099, 44428, 49398, 59358, 6658, 12656, 21594, 35311, 44330, 49232, 59262, 6820, 12754, 21752, 35099, 44510, 49316, 59274, 6736, 12582, 21516, 35026, 44984, 35099, 44510, 49316, 59276, 6660, 12656, 21594, 35099, 44424, 49394, 59356, 6662, 12656, 21594, 35147, 44431, 49402, 59337, 6733, 12645, 21593, 34960, 45025, 49880};
        ThreeDS2ServiceInstance = 5705546201743273454L;
    }

    public kd(String str, String str2) {
        this.initialize = str;
        this.ThreeDS2Service = str2;
    }

    public static jo ThreeDS2ServiceInitializationCallback() {
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0) + 7, (-1) - TextUtils.lastIndexOf("", '0'), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, 7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE), objArr2);
        kd kdVar = new kd(intern, ((String) objArr2[0]).intern());
        getWarnings = (ThreeDS2ServiceInitializationCallback + 107) % 128;
        return kdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0149, code lost:
    
        r1[r2] = (char) r5[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014f, code lost:
    
        r0 = new java.lang.Object[]{r4, r4};
        r1 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r2 = r1.get(1724349229);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015c, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018f, code lost:
    
        ((java.lang.reflect.Method) r2).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0195, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015f, code lost:
    
        r2 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 48, (char) (27780 - android.text.TextUtils.indexOf("", "")), 2441 - android.graphics.Color.alpha(0));
        r4 = new java.lang.Object[1];
        b(0, (byte) 0, 0, r4);
        r2 = r2.getMethod((java.lang.String) r4[0], java.lang.Object.class, java.lang.Object.class);
        r1.put(1724349229, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        char c2;
        Throwable cause;
        int i3;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr = new long[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        $10 = ($11 + 103) % 128;
        while (true) {
            int i4 = threeDS2ServiceInitializationCallback.initialize;
            if (i4 >= i) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(get[i2 + i4])};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-54653524);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    i3 = 2;
                } else {
                    i3 = 2;
                    Class cls2 = (Class) removeParam.initialize(View.MeasureSpec.getMode(0) + 48, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.alpha(0) + 3221);
                    Object[] objArr3 = new Object[1];
                    b((short) 1, (byte) 0, 0, objArr3);
                    obj = cls2.getMethod((String) objArr3[0], cls);
                    map.put(-54653524, obj);
                }
                Long l = (Long) ((Method) obj).invoke(null, objArr2);
                l.longValue();
                long j = threeDS2ServiceInitializationCallback.initialize;
                long j2 = ThreeDS2ServiceInstance;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c);
                objArr4[i3] = Long.valueOf(j2);
                objArr4[1] = Long.valueOf(j);
                objArr4[0] = l;
                Object obj2 = map.get(1319531906);
                if (obj2 == null) {
                    Class cls3 = (Class) removeParam.initialize(69 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (Gravity.getAbsoluteGravity(0, 0) + 50704), 7789 - (ViewConfiguration.getWindowTouchSlop() >> 8));
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
                    Class cls5 = (Class) removeParam.initialize(Color.argb(0, 0, 0, 0) + 48, (char) (27780 - Color.red(0)), ExpandableListView.getPackedPositionChild(0L) + 2442);
                    Object[] objArr6 = new Object[1];
                    b((short) 0, (byte) 0, 0, objArr6);
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
        char c3 = '0';
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i5 = threeDS2ServiceInitializationCallback.initialize;
            if (i5 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            int i6 = $11 + 119;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                break;
            }
            cArr[i5] = (char) jArr[i5];
            Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(1724349229);
            if (obj4 != null) {
                c2 = c3;
            } else {
                c2 = c3;
                Class cls6 = (Class) removeParam.initialize(49 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0, 0) + 27780), 2440 - TextUtils.indexOf("", c2));
                Object[] objArr8 = new Object[1];
                b((short) 0, (byte) 0, 0, objArr8);
                obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1724349229, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
            c3 = c2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        ?? r6 = 4 - (b * 2);
        int i4 = (s * 3) + 97;
        int i5 = i * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            byte b2 = r6;
            int i7 = 0;
            int i8 = r6;
            i4 += b2;
            i2 = i7;
            i3 = i8 + 1;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            b2 = bArr[i3];
            i8 = i3;
            i4 += b2;
            i2 = i7;
            i3 = i8 + 1;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3 = r6;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static jo cleanup() {
        return (jo) get(new Object[0], 1626606383, -1626606383, (int) System.currentTimeMillis());
    }

    public static jo createTransaction() {
        int i = getWarnings + 113;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            return onError();
        }
        int i2 = 33 / 0;
        return onError();
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) + 9, (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
        String intern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(7 - KeyEvent.keyCodeFromString(""), 8 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionGroup(0L) + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE), objArr3);
        kd kdVar = new kd(intern, ((String) objArr3[0]).intern());
        ThreeDS2ServiceInitializationCallback = (getWarnings + 115) % 128;
        return kdVar;
    }

    public static jo getParamValue() {
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getEdgeSlop() >> 16) + 7, 1 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, 7 - Color.alpha(0), (char) (Color.blue(0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE), objArr2);
        kd kdVar = new kd(intern, ((String) objArr2[0]).intern());
        int i = ThreeDS2ServiceInitializationCallback + 111;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            return kdVar;
        }
        throw null;
    }

    public static jo getSDKInfo() {
        getWarnings = (ThreeDS2ServiceInitializationCallback + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        jo onError = onError();
        getWarnings = (ThreeDS2ServiceInitializationCallback + 125) % 128;
        return onError;
    }

    public static jo getSDKVersion() {
        getWarnings = (ThreeDS2ServiceInitializationCallback + 79) % 128;
        jo onError = onError();
        ThreeDS2ServiceInitializationCallback = (getWarnings + 31) % 128;
        return onError;
    }

    public static void init$0() {
        $$a = new byte[]{102, 38, -14, -96};
        $$b = 28;
    }

    public static jo onCompleted() {
        getWarnings = (ThreeDS2ServiceInitializationCallback + 33) % 128;
        jo onError = onError();
        getWarnings = (ThreeDS2ServiceInitializationCallback + 107) % 128;
        return onError;
    }

    public static jo onError() {
        Object[] objArr = new Object[1];
        a(7 - View.getDefaultSize(0, 0), 22 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 7, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, (char) View.resolveSizeAndState(0, 0, 0), objArr2);
        kd kdVar = new kd(intern, ((String) objArr2[0]).intern());
        getWarnings = (ThreeDS2ServiceInitializationCallback + 125) % 128;
        return kdVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jo
    public String ThreeDS2Service() {
        int i = getWarnings;
        int i2 = i + 61;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.initialize;
        if (i3 == 0) {
            throw null;
        }
        ThreeDS2ServiceInitializationCallback = (i + 3) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInitializationCallback + 61;
        int i2 = i % 128;
        getWarnings = i2;
        int i3 = i % 2 != 0 ? 72 : 16;
        int i4 = i2 + 99;
        ThreeDS2ServiceInitializationCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return i3;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jo
    public int getWarnings() {
        int i = (ThreeDS2ServiceInitializationCallback + 81) % 128;
        getWarnings = i;
        int i2 = i + 87;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return 4;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        getWarnings = (ThreeDS2ServiceInitializationCallback + 121) % 128;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, (char) KeyEvent.normalizeMetaState(0), objArr);
        String intern = ((String) objArr[0]).intern();
        ThreeDS2ServiceInitializationCallback = (getWarnings + 51) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = ThreeDS2ServiceInitializationCallback + 3;
        getWarnings = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2Service;
        if (i2 != 0) {
            int i3 = 52 / 0;
        }
        return str;
    }
}
