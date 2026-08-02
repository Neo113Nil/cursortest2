package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class ke implements jt {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String ThreeDS2ServiceInstance;
    private static int get = 1;
    private static int getWarnings;
    private static int initialize;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a(true, (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, "\ufff4\u0003\u0002\u0003\u0002\u0003\u0002", 145 - ExpandableListView.getPackedPositionChild(0L), objArr);
        ThreeDS2ServiceInstance = ((String) objArr[0]).intern();
        int i = get + 77;
        initialize = i % 128;
        if (i % 2 != 0) {
            int i2 = 86 / 0;
        }
    }

    public static void ThreeDS2ServiceInstance() {
        getWarnings = 1141902433;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        int i4;
        char[] cArr;
        Throwable cause;
        int i5;
        $11 = ($10 + 89) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr2 = new char[i2];
        int i6 = 0;
        getsdkinfo.getWarnings = 0;
        $10 = ($11 + 39) % 128;
        while (true) {
            int i7 = getsdkinfo.getWarnings;
            if (i7 >= i2) {
                break;
            }
            char c = charArray[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr2[i7] = c2;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getWarnings);
                objArr2[i6] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i6;
                } else {
                    i5 = i6;
                    Class cls = (Class) removeParam.initialize(View.resolveSizeAndState(i6, i6, i6) + 67, (char) (45769 - Color.red(i5)), 4879 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    Class cls2 = Integer.TYPE;
                    Method method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                    obj = method;
                }
                cArr2[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(((Process.getThreadPriority(i5) + 20) >> 6) + 59, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetAfter("", i5) + 12373)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i6 = 0;
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
        if (i > 0) {
            getsdkinfo.get = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            int i8 = getsdkinfo.get;
            System.arraycopy(cArr3, 0, cArr2, i2 - i8, i8);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr3, i9, cArr2, 0, i2 - i9);
        }
        if (z) {
            int i10 = $11 + 91;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr = new char[i2];
                i4 = 0;
            } else {
                i4 = 0;
                cArr = new char[i2];
            }
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i11 = getsdkinfo.getWarnings;
                if (i11 >= i2) {
                    break;
                }
                int i12 = $11 + 9;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr[i11] = cArr2[(i2 % i11) >>> 1];
                    Object[] objArr4 = {getsdkinfo, getsdkinfo};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(1981656970);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), 12373 - TextUtils.indexOf("", ""))).getMethod("r", Object.class, Object.class);
                        map2.put(1981656970, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr4);
                } else {
                    cArr[i11] = cArr2[(i2 - i11) - 1];
                    Object[] objArr5 = {getsdkinfo, getsdkinfo};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map3.get(1981656970);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(59 - KeyEvent.getDeadChar(0, 0), (char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12373)).getMethod("r", Object.class, Object.class);
                        map3.put(1981656970, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr;
        }
        String str2 = new String(cArr2);
        $11 = ($10 + 95) % 128;
        objArr[0] = str2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jt
    public String get() {
        Object obj;
        int i = initialize + 37;
        get = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            a(true, 1 >>> (Process.myPid() - 39), 121 - ExpandableListView.getPackedPositionGroup(1L), "\ufff4\u0003\u0002\u0003\u0002\u0003\u0002", View.getDefaultSize(0, 1) * 15459, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(true, (Process.myPid() >> 22) + 1, ExpandableListView.getPackedPositionGroup(0L) + 7, "\ufff4\u0003\u0002\u0003\u0002\u0003\u0002", 146 - View.getDefaultSize(0, 0), objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        get = (initialize + 109) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jt
    public String getWarnings() {
        initialize = (get + 37) % 128;
        Object[] objArr = new Object[1];
        a(true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 7 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\ufff4\u0003\u0002\u0003\u0002\u0003\u0002", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 147, objArr);
        String intern = ((String) objArr[0]).intern();
        initialize = (get + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return intern;
    }
}
