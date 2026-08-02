package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ne {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInstance;
    private static char[] get;
    private static int getWarnings;
    private static long initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getWarnings = 0;
        ThreeDS2ServiceInstance = 1;
        get = new char[]{59282};
        initialize = 1086800555677259985L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        char c2;
        Throwable cause;
        int i3;
        Object method;
        long j;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr = new long[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        $11 = ($10 + 17) % 128;
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
                    method = obj;
                    i3 = 2;
                } else {
                    i3 = 2;
                    Class cls2 = (Class) removeParam.initialize((Process.myTid() >> 22) + 48, (char) View.getDefaultSize(0, 0), 3221 - (KeyEvent.getMaxKeyCode() >> 16));
                    Object[] objArr3 = new Object[1];
                    b(0, 0, 0, objArr3);
                    method = cls2.getMethod((String) objArr3[0], cls);
                    map.put(-54653524, method);
                }
                Long l = (Long) ((Method) method).invoke(null, objArr2);
                l.longValue();
                long j2 = threeDS2ServiceInitializationCallback.initialize;
                long j3 = initialize;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c);
                objArr4[i3] = Long.valueOf(j3);
                objArr4[1] = Long.valueOf(j2);
                objArr4[0] = l;
                Object obj2 = map.get(1319531906);
                if (obj2 != null) {
                    j = 0;
                } else {
                    j = 0;
                    Class cls3 = (Class) removeParam.initialize(69 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 50703), 7789 - Color.alpha(0));
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
                    Class cls5 = (Class) removeParam.initialize(48 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (27780 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), 2442 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)));
                    Object[] objArr6 = new Object[1];
                    b(0, 0, 1, objArr6);
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
        $11 = ($10 + 75) % 128;
        while (true) {
            int i5 = threeDS2ServiceInitializationCallback.initialize;
            if (i5 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            $11 = ($10 + 77) % 128;
            cArr[i5] = (char) jArr[i5];
            Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(1724349229);
            if (obj4 != null) {
                c2 = c3;
            } else {
                c2 = c3;
                Class cls6 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", c2, 0) + 49, (char) ((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 27779), ImageFormat.getBitsPerPixel(0) + 2442);
                Object[] objArr8 = new Object[1];
                b(0, 0, 1, objArr8);
                obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1724349229, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
            c3 = c2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        int i6 = 1 - (i2 * 3);
        byte[] bArr = $$a;
        int i7 = 100 - (i3 * 3);
        int i8 = 4 - (i * 3);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i9 = i7;
            i5 = 0;
            int i10 = i8;
            int i11 = i10 + 1;
            i7 = i8 + (-i9);
            i8 = i11;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i5 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i9 = bArr[i8];
            int i12 = i7;
            i10 = i8;
            i8 = i12;
            int i112 = i10 + 1;
            i7 = i8 + (-i9);
            i8 = i112;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i5 == i6) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i5 == i6) {
            }
        }
    }

    public static boolean get(String[] strArr, String str, boolean z) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            if (z) {
                getWarnings = (ThreeDS2ServiceInstance + 47) % 128;
                if (getWarnings(str, str2)) {
                    int i2 = getWarnings + 45;
                    ThreeDS2ServiceInstance = i2 % 128;
                    return i2 % 2 != 0;
                }
            }
            if (oj.initialize((CharSequence) str, (CharSequence) str2)) {
                return true;
            }
            i++;
            getWarnings = (ThreeDS2ServiceInstance + 27) % 128;
        }
        return false;
    }

    public static boolean getWarnings(String str, String str2) {
        getWarnings = (ThreeDS2ServiceInstance + 67) % 128;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, ViewConfiguration.getTapTimeout() >> 16, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 28314), objArr);
        String ThreeDS2Service = oj.ThreeDS2Service(str, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 1, ViewConfiguration.getEdgeSlop() >> 16, (char) (ExpandableListView.getPackedPositionChild(0L) + 28315), objArr2);
        boolean initialize2 = oj.initialize((CharSequence) ThreeDS2Service, (CharSequence) oj.ThreeDS2Service(str2, ((String) objArr2[0]).intern()));
        int i = ThreeDS2ServiceInstance + 83;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            int i2 = 28 / 0;
        }
        return initialize2;
    }

    public static void init$0() {
        $$a = new byte[]{114, 64, -72, -72};
        $$b = 21;
    }
}
