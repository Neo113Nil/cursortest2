package com.netcetera.threeds.sdk.api.transaction;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.ThreeDS2ServiceInitializationCallback;
import com.netcetera.threeds.sdk.infrastructure.ng;
import com.netcetera.threeds.sdk.infrastructure.removeParam;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ThreeDS2ServiceInitializationCallback;
    private static int createTransaction;
    private static char[] getSDKInfo;
    private static int getSDKVersion;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String cleanup;
    private final String get;
    private final String getWarnings;
    private final String initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        createTransaction = 0;
        getSDKVersion = 1;
        getSDKInfo = new char[]{35898, 23032, 10160, 3450, 56094, 41154, 36494, 21639, 8802, 2111, 54720, 41872, 35136, 22395};
        ThreeDS2ServiceInitializationCallback = 2903899830026722546L;
    }

    public AuthenticationRequestParameters(String str, String str2, String str3, String str4, String str5, String str6) {
        this.cleanup = ng.get(str, "sdkTransactionID");
        this.ThreeDS2ServiceInstance = ng.get(str2, "deviceData");
        this.initialize = ng.get(str3, "sdkEphemeralPublicKey");
        this.get = ng.get(str4, "sdkAppID");
        this.ThreeDS2Service = ng.get(str5, "sdkReferenceNumber");
        Object[] objArr = new Object[1];
        a(14 - TextUtils.indexOf("", ""), View.MeasureSpec.getMode(0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1392), objArr);
        this.getWarnings = ng.get(str6, ((String) objArr[0]).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        long[] jArr;
        int i3;
        Object method;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i4 = threeDS2ServiceInitializationCallback.initialize;
            if (i4 >= i) {
                break;
            }
            int i5 = $11 + 85;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i6 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(getSDKInfo[i2 << i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-54653524);
                    if (obj != null) {
                        jArr = jArr2;
                        method = obj;
                        i3 = i4;
                    } else {
                        jArr = jArr2;
                        i3 = i4;
                        Class cls3 = (Class) removeParam.initialize(48 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 1), 3221 - TextUtils.indexOf("", "", 0));
                        Object[] objArr3 = new Object[1];
                        b(0, 1, (byte) 0, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls2);
                        map.put(-54653524, method);
                    }
                    Long l = (Long) ((Method) method).invoke(null, objArr2);
                    l.longValue();
                    Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(ThreeDS2ServiceInitializationCallback), Integer.valueOf(c)};
                    Object obj2 = map.get(1319531906);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize((ViewConfiguration.getWindowTouchSlop() >> 8) + 69, (char) (50704 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7789)).getMethod("b", cls, cls, cls, cls2);
                        map.put(1319531906, obj2);
                    }
                    jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27781), 2442 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                        Object[] objArr6 = new Object[1];
                        b(0, 0, (byte) 0, objArr6);
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
                Object[] objArr7 = {Integer.valueOf(getSDKInfo[i2 + i4])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(-54653524);
                if (obj4 == null) {
                    Class cls5 = (Class) removeParam.initialize(Drawable.resolveOpacity(0, 0) + 48, (char) View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 3221);
                    Object[] objArr8 = new Object[1];
                    b(0, 1, (byte) 0, objArr8);
                    obj4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(-54653524, obj4);
                }
                Long l2 = (Long) ((Method) obj4).invoke(null, objArr7);
                l2.longValue();
                Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(ThreeDS2ServiceInitializationCallback), Integer.valueOf(c)};
                Object obj5 = map2.get(1319531906);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(ExpandableListView.getPackedPositionGroup(0L) + 69, (char) (Color.blue(0) + 50704), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7788)).getMethod("b", cls, cls, cls, cls2);
                    map2.put(1319531906, obj5);
                }
                jArr[i4] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj6 = map2.get(1724349229);
                if (obj6 == null) {
                    Class cls6 = (Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (27780 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 2441 - TextUtils.getOffsetBefore("", 0));
                    Object[] objArr11 = new Object[1];
                    b(0, 0, (byte) 0, objArr11);
                    obj6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1724349229, obj6);
                }
                ((Method) obj6).invoke(null, objArr10);
            }
            $11 = ($10 + 85) % 128;
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
        while (true) {
            int i7 = threeDS2ServiceInitializationCallback.initialize;
            if (i7 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            $11 = ($10 + 117) % 128;
            cArr[i7] = (char) jArr3[i7];
            Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj7 = map3.get(1724349229);
            if (obj7 == null) {
                Class cls7 = (Class) removeParam.initialize(View.combineMeasuredStates(0, 0) + 48, (char) (27780 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Color.argb(0, 0, 0, 0) + 2441);
                Object[] objArr13 = new Object[1];
                b(0, 0, (byte) 0, objArr13);
                obj7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1724349229, obj7);
            }
            ((Method) obj7).invoke(null, objArr12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i2 * 3) + 97;
        int i6 = 3 - (b * 4);
        byte[] bArr = $$a;
        int i7 = 1 - (i * 4);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i6;
            i5 += i6;
            i6 = i9;
            bArr = bArr3;
            i3 = i8;
            int i10 = i6 + 1;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i10];
            byte[] bArr4 = bArr;
            i9 = i10;
            i6 = b2;
            i8 = i4;
            bArr3 = bArr4;
            i5 += i6;
            i6 = i9;
            bArr = bArr3;
            i3 = i8;
            int i102 = i6 + 1;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            int i1022 = i6 + 1;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i7) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{87, -47, -17, 35};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
    }

    public String getDeviceData() {
        int i = (createTransaction + 63) % 128;
        getSDKVersion = i;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = i + 111;
        createTransaction = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
        return str;
    }

    public String getMessageVersion() {
        int i = getSDKVersion + 5;
        createTransaction = i % 128;
        int i2 = i % 2;
        String str = this.getWarnings;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    public String getSDKAppID() {
        int i = createTransaction + 15;
        int i2 = i % 128;
        getSDKVersion = i2;
        int i3 = i % 2;
        String str = this.get;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i2 + 27;
        createTransaction = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getSDKEphemeralPublicKey() {
        int i = (getSDKVersion + 29) % 128;
        createTransaction = i;
        String str = this.initialize;
        int i2 = i + 25;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getSDKReferenceNumber() {
        int i = (getSDKVersion + 19) % 128;
        createTransaction = i;
        String str = this.ThreeDS2Service;
        getSDKVersion = (i + 75) % 128;
        return str;
    }

    public String getSDKTransactionID() {
        int i = (getSDKVersion + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        createTransaction = i;
        String str = this.cleanup;
        int i2 = i + 13;
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
        return str;
    }
}
