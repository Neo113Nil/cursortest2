package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class kf implements jr {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private static int initialize = 1141902382;

    /* JADX WARN: Removed duplicated region for block: B:24:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        int i4;
        Throwable cause;
        int i5;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr = new char[i2];
        int i6 = 0;
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i7 = getsdkinfo.getWarnings;
            if (i7 >= i2) {
                break;
            }
            char c = charArray[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr[i7] = c2;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(initialize);
                objArr2[i6] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i6;
                } else {
                    i5 = i6;
                    Class cls = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 68, (char) (45769 - (TypedValue.complexToFraction(i6, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(i6, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), 4879 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    Class cls2 = Integer.TYPE;
                    obj = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, obj);
                }
                cArr[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    int i8 = i5;
                    obj2 = ((Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 59, (char) View.resolveSize(i8, i8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12373)).getMethod("r", Object.class, Object.class);
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
            $10 = ($11 + 95) % 128;
            getsdkinfo.get = i;
            char[] cArr2 = new char[i2];
            i4 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr2, 0, cArr, i2 - i9, i9);
            int i10 = getsdkinfo.get;
            System.arraycopy(cArr2, i10, cArr, 0, i2 - i10);
        } else {
            i4 = 0;
        }
        if (z) {
            $11 = ($10 + 113) % 128;
            char[] cArr3 = new char[i2];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i11 = getsdkinfo.getWarnings;
                if (i11 >= i2) {
                    break;
                }
                int i12 = $11 + 75;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr3[i11] = cArr[i2 * i11];
                    Object[] objArr4 = {getsdkinfo, getsdkinfo};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(1981656970);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize((ViewConfiguration.getDoubleTapTimeout() >> 16) + 59, (char) View.getDefaultSize(0, 0), 12373 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("r", Object.class, Object.class);
                        map2.put(1981656970, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr4);
                } else {
                    cArr3[i11] = cArr[(i2 - i11) - 1];
                    Object[] objArr5 = {getsdkinfo, getsdkinfo};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map3.get(1981656970);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize((ViewConfiguration.getEdgeSlop() >> 16) + 59, (char) (Color.rgb(0, 0, 0) + 16777216), 12373 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("r", Object.class, Object.class);
                        map3.put(1981656970, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr5);
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jr
    public String ThreeDS2Service() {
        Object obj;
        int i = ThreeDS2Service + 87;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            a(false, 2 << KeyEvent.normalizeMetaState(1), (ViewConfiguration.getEdgeSlop() + 55) * 7, "\u0002\u0002\u0002\ufff5\u0002\u0002\u0002", 78 >>> TextUtils.indexOf((CharSequence) "", 'M', 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(false, KeyEvent.normalizeMetaState(0) + 3, 7 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0002\u0002\u0002\ufff5\u0002\u0002\u0002", 89 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        ThreeDS2ServiceInstance = (ThreeDS2Service + 53) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service + 13;
        int i2 = i % 128;
        ThreeDS2ServiceInstance = i2;
        int i3 = i % 2 == 0 ? 32 : 16;
        int i4 = i2 + 71;
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        ThreeDS2ServiceInstance = (ThreeDS2Service + 11) % 128;
        Object[] objArr = new Object[1];
        a(false, 3 - Color.argb(0, 0, 0, 0), 7 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0002\u0002\u0002\ufff5\u0002\u0002\u0002", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 89, objArr);
        String intern = ((String) objArr[0]).intern();
        ThreeDS2Service = (ThreeDS2ServiceInstance + 25) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jr
    public int getWarnings() {
        int i = (ThreeDS2ServiceInstance + 61) % 128;
        ThreeDS2Service = i;
        ThreeDS2ServiceInstance = (i + 5) % 128;
        return 24;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        ThreeDS2ServiceInstance = (ThreeDS2Service + 23) % 128;
        Object[] objArr = new Object[1];
        a(false, 5 - View.MeasureSpec.makeMeasureSpec(0, 0), Color.green(0) + 10, "\u000e\u0000\r\u0004\u0001\u000e￼\t\u000e\uffc8", 145 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        String intern = ((String) objArr[0]).intern();
        int i = ThreeDS2Service + 97;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            return intern;
        }
        throw null;
    }
}
