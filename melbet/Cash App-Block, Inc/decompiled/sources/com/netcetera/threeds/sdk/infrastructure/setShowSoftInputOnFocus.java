package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setShowSoftInputOnFocus extends setHighlightColor {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 1141902432;
    private static int getWarnings = 0;
    private static int initialize = 1;

    public setShowSoftInputOnFocus(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, String str, boolean z, int i2, int i3, Object[] objArr) {
        char[] cArr;
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 119) % 128;
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr4 = new char[i];
        int i6 = 0;
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i7 = getsdkinfo.getWarnings;
            if (i7 >= i) {
                break;
            }
            $10 = ($11 + 59) % 128;
            char c = cArr3[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i2 + c);
            cArr4[i7] = c2;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(ThreeDS2Service);
                objArr2[i6] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i6;
                } else {
                    i5 = i6;
                    Class cls = (Class) removeParam.initialize(67 - View.resolveSizeAndState(i6, i6, i6), (char) (45769 - (ViewConfiguration.getPressedStateDuration() >> 16)), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 4878);
                    Class cls2 = Integer.TYPE;
                    Method method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                    obj = method;
                }
                cArr4[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    int i8 = i5;
                    obj2 = ((Class) removeParam.initialize(View.getDefaultSize(i8, i8) + 59, (char) ((-1) - TextUtils.lastIndexOf("", '0', i8)), 12372 - MotionEvent.axisFromString(""))).getMethod("r", Object.class, Object.class);
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
        if (i3 > 0) {
            getsdkinfo.get = i3;
            char[] cArr5 = new char[i];
            System.arraycopy(cArr4, 0, cArr5, 0, i);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr5, 0, cArr4, i - i9, i9);
            int i10 = getsdkinfo.get;
            System.arraycopy(cArr5, i10, cArr4, 0, i - i10);
        }
        if (z) {
            int i11 = $11 + 43;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr2 = new char[i];
                i4 = 1;
                getsdkinfo.getWarnings = 1;
            } else {
                i4 = 1;
                cArr2 = new char[i];
                getsdkinfo.getWarnings = 0;
            }
            while (true) {
                int i12 = getsdkinfo.getWarnings;
                if (i12 >= i) {
                    break;
                }
                cArr2[i12] = cArr4[(i - i12) - i4];
                Object[] objArr4 = new Object[2];
                objArr4[i4] = getsdkinfo;
                objArr4[0] = getsdkinfo;
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(59 - TextUtils.getOffsetAfter("", 0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12373)).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr4 = cArr2;
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setHighlightColor
    public void t_(Context context, Intent intent) {
        Object obj;
        int i = getWarnings + 15;
        initialize = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            c((ViewConfiguration.getDoubleTapTimeout() * 28) + 21, "ￒ\u0007\u0005\u0018\t\u000b\u0013\u0016\u001dￒ￦\ufff6\ufff3\ufffb\ufff7￥￦\ufff0￩\u0005\u0012\b\u0016\u0013\r\bￒ\r\u0012\u0018\t\u0012\u0018", true, 26328 >> (ViewConfiguration.getMinimumFlingVelocity() - 17), 94 >>> (ViewConfiguration.getPressedStateDuration() >> 44), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            c(33 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "ￒ\u0007\u0005\u0018\t\u000b\u0013\u0016\u001dￒ￦\ufff6\ufff3\ufffb\ufff7￥￦\ufff0￩\u0005\u0012\b\u0016\u0013\r\bￒ\r\u0012\u0018\t\u0012\u0018", false, 190 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 19 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
            obj = objArr2[0];
        }
        intent.addCategory(((String) obj).intern());
        intent.setFlags(268436992);
        int i2 = initialize + 105;
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
    }
}
