package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
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
class setSelectionAfterHeaderView {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static final String ThreeDS2ServiceInstance;
    private static int getWarnings;
    private static int initialize;
    private final Object get;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a(true, (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 10, (ViewConfiguration.getTapTimeout() >> 16) + 25, "\ufffe\u0007\ufffa\u0005\ufff4\u0001\ufff6\ufffe\u0007\t\u000e\ufffa\u0000\ufff4\b\t\u0005\u0002\ufffa\t\t\ufff6\ufff4\ufff9\u0004", 188 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        ThreeDS2Service = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(true, 14 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 26, "\n\ufff5\ufffa\u0005\uffff\b\ufffb\u0006\ufff5\u0002\ufff7\uffff\b\n\u000f\ufffb\u0001\ufff5\u0006\u0003\ufff7\n\t\ufffb\u0003\uffff", 187 - Color.green(0), objArr2);
        ThreeDS2ServiceInstance = ((String) objArr2[0]).intern();
        initialize = (ThreeDS2ServiceInitializationCallback + 49) % 128;
    }

    public setSelectionAfterHeaderView(Object obj) {
        this.get = obj;
    }

    public static void ThreeDS2ServiceInstance() {
        getWarnings = 1141902419;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        Throwable cause;
        char[] cArr;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr2 = new char[i2];
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i4 = getsdkinfo.getWarnings;
            if (i4 >= i2) {
                break;
            }
            $10 = ($11 + 19) % 128;
            char c = charArray[i4];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr2[i4] = c2;
            try {
                Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf(getWarnings)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    cArr = charArray;
                    method = obj;
                } else {
                    cArr = charArray;
                    Class cls = (Class) removeParam.initialize(ExpandableListView.getPackedPositionChild(0L) + 68, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 45769), View.getDefaultSize(0, 0) + 4879);
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                }
                cArr2[i4] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getsdkinfo, getsdkinfo};
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(TextUtils.getTrimmedLength("") + 59, (char) TextUtils.indexOf("", ""), View.MeasureSpec.getSize(0) + 12373)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                $10 = ($11 + 49) % 128;
                charArray = cArr;
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
            $11 = ($10 + 61) % 128;
            getsdkinfo.get = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            int i5 = getsdkinfo.get;
            System.arraycopy(cArr3, 0, cArr2, i2 - i5, i5);
            int i6 = getsdkinfo.get;
            System.arraycopy(cArr3, i6, cArr2, 0, i2 - i6);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            getsdkinfo.getWarnings = 0;
            while (true) {
                int i7 = getsdkinfo.getWarnings;
                if (i7 >= i2) {
                    break;
                }
                cArr4[i7] = cArr2[(i2 - i7) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize((Process.myPid() >> 22) + 59, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 12373 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static setSelectionAfterHeaderView initialize(Context context) {
        try {
            Object[] objArr = {context};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1029982151);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(50 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), 11728 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("ThreeDS2ServiceInstance", Context.class);
                map.put(-1029982151, obj);
            }
            setSelectionAfterHeaderView setselectionafterheaderview = new setSelectionAfterHeaderView(((Method) obj).invoke(null, objArr));
            ThreeDS2ServiceInitializationCallback = (initialize + 97) % 128;
            return setselectionafterheaderview;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean ThreeDS2Service() {
        char c;
        int i;
        long j;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = this.get;
        Object[] objArr = new Object[1];
        a(true, (ViewConfiguration.getTapTimeout() >> 16) + 14, ExpandableListView.getPackedPositionType(0L) + 26, "\n\ufff5\ufffa\u0005\uffff\b\ufffb\u0006\ufff5\u0002\ufff7\uffff\b\n\u000f\ufffb\u0001\ufff5\u0006\u0003\ufff7\n\t\ufffb\u0003\uffff", 187 - TextUtils.getOffsetAfter("", 0), objArr);
        try {
            Object[] objArr2 = {((String) objArr[0]).intern(), 0L};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj2 = map.get(481728586);
            Class cls = Long.TYPE;
            if (obj2 != null) {
                i = 0;
                c = '0';
            } else {
                c = '0';
                i = 0;
                obj2 = ((Class) removeParam.initialize(KeyEvent.keyCodeFromString("") + 48, (char) (View.getDefaultSize(0, 0) + 37870), 11680 - Color.red(0))).getMethod("initialize", String.class, cls);
                map.put(481728586, obj2);
            }
            long longValue = ((Long) ((Method) obj2).invoke(obj, objArr2)).longValue();
            Object obj3 = this.get;
            Object[] objArr3 = new Object[1];
            a(true, 10 - (Process.myPid() >> 22), TextUtils.indexOf("", "") + 25, "\ufffe\u0007\ufffa\u0005\ufff4\u0001\ufff6\ufffe\u0007\t\u000e\ufffa\u0000\ufff4\b\t\u0005\u0002\ufffa\t\t\ufff6\ufff4\ufff9\u0004", TextUtils.indexOf("", "") + 188, objArr3);
            String intern = ((String) objArr3[i]).intern();
            Object[] objArr4 = new Object[2];
            objArr4[1] = Integer.valueOf(i);
            objArr4[i] = intern;
            Object obj4 = map.get(481728555);
            Class cls2 = Integer.TYPE;
            if (obj4 != null) {
                j = currentTimeMillis;
                j2 = longValue;
            } else {
                int i2 = i;
                j = currentTimeMillis;
                j2 = longValue;
                obj4 = ((Class) removeParam.initialize(View.resolveSize(i2, i2) + 48, (char) (37871 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", c, 0, 0) + 11681)).getMethod("initialize", String.class, cls2);
                map.put(481728555, obj4);
            }
            int intValue = ((Integer) ((Method) obj4).invoke(obj3, objArr4)).intValue() + 1;
            Object obj5 = this.get;
            Object[] objArr5 = new Object[1];
            a(true, TextUtils.indexOf((CharSequence) "", '0') + 11, 25 - TextUtils.getTrimmedLength(""), "\ufffe\u0007\ufffa\u0005\ufff4\u0001\ufff6\ufffe\u0007\t\u000e\ufffa\u0000\ufff4\b\t\u0005\u0002\ufffa\t\t\ufff6\ufff4\ufff9\u0004", 188 - Color.argb(0, 0, 0, 0), objArr5);
            Object[] objArr6 = {((String) objArr5[0]).intern(), Integer.valueOf(intValue)};
            Object obj6 = map.get(764034441);
            if (obj6 == null) {
                obj6 = ((Class) removeParam.initialize(Process.getGidForName("") + 49, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37869), View.getDefaultSize(0, 0) + 11680)).getMethod("get", String.class, cls2);
                map.put(764034441, obj6);
            }
            ((Method) obj6).invoke(obj5, objArr6);
            if (j2 != 0) {
                if (j - j2 < 604800000) {
                    return true;
                }
                int i3 = (initialize + 45) % 128;
                ThreeDS2ServiceInitializationCallback = i3;
                if (intValue <= 10) {
                    return true;
                }
                initialize = (i3 + 93) % 128;
                return false;
            }
            Object obj7 = this.get;
            Object[] objArr7 = new Object[1];
            a(true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, View.resolveSizeAndState(0, 0, 0) + 26, "\n\ufff5\ufffa\u0005\uffff\b\ufffb\u0006\ufff5\u0002\ufff7\uffff\b\n\u000f\ufffb\u0001\ufff5\u0006\u0003\ufff7\n\t\ufffb\u0003\uffff", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 188, objArr7);
            Object[] objArr8 = {((String) objArr7[0]).intern(), Long.valueOf(j)};
            Object obj8 = map.get(-672546546);
            if (obj8 == null) {
                obj8 = ((Class) removeParam.initialize(Process.getGidForName("") + 49, (char) (37870 - TextUtils.indexOf("", "")), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11680)).getMethod("ThreeDS2Service", String.class, cls);
                map.put(-672546546, obj8);
            }
            ((Method) obj8).invoke(obj7, objArr8);
            return true;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
