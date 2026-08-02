package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class getStackTrace implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getStackTrace[] ThreeDS2Service;
    public static final getStackTrace ThreeDS2ServiceInstance;
    private static int cleanup;
    private static int getSDKInfo;
    private static long getWarnings;
    public static final getStackTrace initialize;
    private final String get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        cleanup = 0;
        getSDKInfo = 1;
        initialize();
        Object[] objArr = new Object[1];
        a("\ude07䁴ܮ\ude5e휦", (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\ude07䁴ܮ\ude5e휦", ViewConfiguration.getTapTimeout() >> 16, objArr2);
        ThreeDS2ServiceInstance = new getStackTrace(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("椏\ue577ꗢ楁\ud95d", ViewConfiguration.getEdgeSlop() >> 16, objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("椏\ue577ꗢ楁\ud95d", ViewConfiguration.getJumpTapTimeout() >> 16, objArr4);
        initialize = new getStackTrace(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2Service = ThreeDS2Service();
        cleanup = (getSDKInfo + 25) % 128;
    }

    private getStackTrace(String str, int i, String str2) {
        this.get = str2;
    }

    private static /* synthetic */ getStackTrace[] ThreeDS2Service() {
        getStackTrace[] getstacktraceArr;
        int i = cleanup;
        int i2 = i + 79;
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            getstacktraceArr = new getStackTrace[4];
            getstacktraceArr[0] = ThreeDS2ServiceInstance;
            getstacktraceArr[1] = initialize;
        } else {
            getstacktraceArr = new getStackTrace[]{ThreeDS2ServiceInstance, initialize};
        }
        getSDKInfo = (i + 11) % 128;
        return getstacktraceArr;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        long j;
        if (str != null) {
            $10 = ($11 + 27) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize2 = onCompleted.initialize(getWarnings ^ (-2776494906517314268L), cArr, i);
        oncompleted.initialize = 4;
        while (true) {
            int i2 = oncompleted.initialize;
            if (i2 >= initialize2.length) {
                objArr[0] = new String(initialize2, 4, initialize2.length - 4);
                return;
            }
            int i3 = i2 - 4;
            oncompleted.ThreeDS2Service = i3;
            try {
                Object[] objArr2 = {Long.valueOf(initialize2[i2] ^ initialize2[i2 % 4]), Long.valueOf(i3), Long.valueOf(getWarnings)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj != null) {
                    j = 0;
                } else {
                    j = 0;
                    Class cls = (Class) removeParam.initialize(49 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (27780 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2441);
                    Object[] objArr3 = new Object[1];
                    b((byte) 0, (byte) 0, (short) 0, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize2[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(TextUtils.getOffsetBefore("", 0) + 66, (char) (1 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1))), 14235 - TextUtils.getOffsetAfter("", 0))).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
                $10 = ($11 + 51) % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private static void b(byte b, byte b2, short s, Object[] objArr) {
        int i = 3 - (s * 2);
        int i2 = 112 - (b2 * 4);
        int i3 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 += -i3;
        }
        while (true) {
            i4++;
            i++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 += -bArr[i];
        }
    }

    public static void init$0() {
        $$a = new byte[]{98, 4, -35, -97};
        $$b = EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE;
    }

    public static void initialize() {
        getWarnings = 1642684083588485388L;
    }

    public static getStackTrace valueOf(String str) {
        int i = cleanup + 105;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            Enum.valueOf(getStackTrace.class, str);
            throw null;
        }
        getStackTrace getstacktrace = (getStackTrace) Enum.valueOf(getStackTrace.class, str);
        int i2 = cleanup + 17;
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
        }
        return getstacktrace;
    }

    public static getStackTrace[] values() {
        getSDKInfo = (cleanup + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getStackTrace[] getstacktraceArr = (getStackTrace[]) ThreeDS2Service.clone();
        int i = getSDKInfo + 89;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 77 / 0;
        }
        return getstacktraceArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = (getSDKInfo + 13) % 128;
        cleanup = i;
        String str = this.get;
        int i2 = i + 3;
        getSDKInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
