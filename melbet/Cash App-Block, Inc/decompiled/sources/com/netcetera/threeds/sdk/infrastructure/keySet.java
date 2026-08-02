package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class keySet implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ConfigParameters;
    public static final keySet ThreeDS2Service;
    public static final keySet ThreeDS2ServiceInstance;
    private static int addParam;
    public static final keySet cleanup;
    public static final keySet createTransaction;
    public static final keySet get;
    private static long getParamValue;
    public static final keySet getSDKInfo;
    public static final keySet getSDKVersion;
    public static final keySet getWarnings;
    public static final keySet initialize;
    private static final /* synthetic */ keySet[] onCompleted;
    private static int onError;
    private String ThreeDS2ServiceInitializationCallback;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        addParam = 0;
        onError = 1;
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        a(View.getDefaultSize(0, 0) + 1, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(1 - ((Process.getThreadPriority(0) + 20) >> 6), Process.myPid() >> 22, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        ThreeDS2ServiceInstance = new keySet(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(-TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getTapTimeout() >> 16) + 1, (char) (Color.rgb(0, 0, 0) + 16777216), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, (ViewConfiguration.getTapTimeout() >> 16) + 1, (char) (1 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr4);
        initialize = new keySet(intern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(1 - KeyEvent.getDeadChar(0, 0), 2 - KeyEvent.normalizeMetaState(0), (char) (7866 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(1 - TextUtils.getOffsetAfter("", 0), (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2, (char) (7865 - TextUtils.getOffsetAfter("", 0)), objArr6);
        getWarnings = new keySet(intern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, 3 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 48584), objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, (Process.myTid() >> 22) + 3, (char) (Color.alpha(0) + 48584), objArr8);
        ThreeDS2Service = new keySet(intern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        a(-ExpandableListView.getPackedPositionChild(0L), 3 - MotionEvent.axisFromString(""), (char) (37079 - Process.getGidForName("")), objArr9);
        String intern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a((-16777215) - Color.rgb(0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 4, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37080), objArr10);
        get = new keySet(intern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        a(1 - TextUtils.getTrimmedLength(""), TextUtils.getCapsMode("", 0, 0) + 5, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 9603), objArr11);
        String intern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Process.getGidForName("") + 6, (char) (ImageFormat.getBitsPerPixel(0) + 9604), objArr12);
        getSDKInfo = new keySet(intern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        a(-MotionEvent.axisFromString(""), 5 - MotionEvent.axisFromString(""), (char) (2661 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr13);
        String intern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a(-TextUtils.indexOf((CharSequence) "", '0'), Color.argb(0, 0, 0, 0) + 6, (char) (2661 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr14);
        cleanup = new keySet(intern7, 6, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        a(-TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 7, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 50580), objArr15);
        String intern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a(1 - View.resolveSize(0, 0), 7 - TextUtils.indexOf("", "", 0), (char) (50581 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr16);
        createTransaction = new keySet(intern8, 7, ((String) objArr16[0]).intern());
        Object[] objArr17 = new Object[1];
        a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, Color.alpha(0) + 8, (char) (41564 - (ViewConfiguration.getTouchSlop() >> 8)), objArr17);
        String intern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        a((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1, (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 8, (char) (41564 - TextUtils.getTrimmedLength("")), objArr18);
        getSDKVersion = new keySet(intern9, 8, ((String) objArr18[0]).intern());
        onCompleted = initialize();
        addParam = (onError + 97) % 128;
    }

    private keySet(String str, int i, String str2) {
        this.ThreeDS2ServiceInitializationCallback = str2;
    }

    public static void ThreeDS2Service() {
        ConfigParameters = new char[]{35169, 35190, 38868, 13489, 6563, 44287, 33551, 19684, 11063};
        getParamValue = 3348401035984694735L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a2  */
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
        while (true) {
            int i4 = threeDS2ServiceInitializationCallback.initialize;
            if (i4 >= i) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(ConfigParameters[i2 + i4])};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-54653524);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    i3 = 2;
                } else {
                    i3 = 2;
                    Class cls2 = (Class) removeParam.initialize(47 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf("", "", 0, 0) + 3221);
                    Object[] objArr3 = new Object[1];
                    b((byte) 0, 0, (short) 0, objArr3);
                    Method method = cls2.getMethod((String) objArr3[0], cls);
                    map.put(-54653524, method);
                    obj = method;
                }
                Long l = (Long) ((Method) obj).invoke(null, objArr2);
                l.longValue();
                long j = threeDS2ServiceInitializationCallback.initialize;
                long j2 = getParamValue;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c);
                objArr4[i3] = Long.valueOf(j2);
                objArr4[1] = Long.valueOf(j);
                objArr4[0] = l;
                Object obj2 = map.get(1319531906);
                if (obj2 == null) {
                    Class cls3 = (Class) removeParam.initialize((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 68, (char) (ImageFormat.getBitsPerPixel(0) + 50705), KeyEvent.getDeadChar(0, 0) + 7789);
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
                    Class cls5 = (Class) removeParam.initialize(48 - Color.blue(0), (char) (Drawable.resolveOpacity(0, 0) + 27780), 2441 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    Object[] objArr6 = new Object[1];
                    b((byte) 0, 1, (short) 0, objArr6);
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
            $11 = ($10 + 113) % 128;
            cArr[i5] = (char) jArr[i5];
            Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(1724349229);
            if (obj4 != null) {
                c2 = c3;
            } else {
                c2 = c3;
                Class cls6 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionGroup(0L) + 48, (char) (27779 - TextUtils.lastIndexOf("", c2, 0)), TextUtils.lastIndexOf("", c2, 0) + 2442);
                Object[] objArr8 = new Object[1];
                b((byte) 0, 1, (short) 0, objArr8);
                obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1724349229, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
            $10 = ($11 + 97) % 128;
            c3 = c2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 3 - (b * 2);
        int i6 = 100 - (i * 3);
        byte[] bArr = $$a;
        int i7 = 1 - (s * 4);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            i2 = i5;
            int i8 = i7;
            i4 = 0;
            i5 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i8 = bArr[i2];
            i5 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i2 = i5;
            i5 = i6;
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{44, -19, 115, -81};
        $$b = 192;
    }

    private static /* synthetic */ keySet[] initialize() {
        int i = (onError + 75) % 128;
        addParam = i;
        keySet[] keysetArr = {ThreeDS2ServiceInstance, initialize, getWarnings, ThreeDS2Service, get, getSDKInfo, cleanup, createTransaction, getSDKVersion};
        int i2 = i + 95;
        onError = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
        return keysetArr;
    }

    public static keySet valueOf(String str) {
        addParam = (onError + 13) % 128;
        keySet keyset = (keySet) Enum.valueOf(keySet.class, str);
        onError = (addParam + 97) % 128;
        return keyset;
    }

    public static keySet[] values() {
        onError = (addParam + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        keySet[] keysetArr = (keySet[]) onCompleted.clone();
        int i = onError + 19;
        addParam = i % 128;
        if (i % 2 == 0) {
            return keysetArr;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = onError;
        int i2 = i + 17;
        addParam = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2ServiceInitializationCallback;
        if (i3 != 0) {
            throw null;
        }
        int i4 = i + 77;
        addParam = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return str;
    }
}
