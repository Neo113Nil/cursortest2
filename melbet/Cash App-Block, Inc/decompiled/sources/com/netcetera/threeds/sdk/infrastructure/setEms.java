package com.netcetera.threeds.sdk.infrastructure;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setEms extends setMaxEms {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 1141902444;
    private static int get = 0;
    private static int getWarnings = 1;

    /* JADX WARN: Removed duplicated region for block: B:24:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, boolean z, int i2, int i3, String str, Object[] objArr) {
        int i4;
        Throwable cause;
        int i5;
        $10 = ($11 + 73) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr = new char[i];
        int i6 = 0;
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i7 = getsdkinfo.getWarnings;
            if (i7 >= i) {
                break;
            }
            char c = charArray[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr[i7] = c2;
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
                    Class cls = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', i6, i6) + 68, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45769), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4879);
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
                    obj2 = ((Class) removeParam.initialize(59 - View.MeasureSpec.getSize(i5), (char) (ExpandableListView.getPackedPositionForGroup(i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == 0L ? 0 : -1)), 12372 - ExpandableListView.getPackedPositionChild(0L))).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i6 = i5;
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
        int i8 = i6;
        if (i2 > 0) {
            $10 = ($11 + 121) % 128;
            getsdkinfo.get = i2;
            char[] cArr2 = new char[i];
            i4 = i8;
            System.arraycopy(cArr, i4, cArr2, i4, i);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr2, i4, cArr, i - i9, i9);
            int i10 = getsdkinfo.get;
            System.arraycopy(cArr2, i10, cArr, i4, i - i10);
        } else {
            i4 = i8;
        }
        if (z) {
            char[] cArr3 = new char[i];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i11 = getsdkinfo.getWarnings;
                if (i11 >= i) {
                    break;
                }
                cArr3[i11] = cArr[(i - i11) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(View.resolveSize(0, 0) + 59, (char) View.resolveSizeAndState(0, 0, 0), 12374 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMaxEms
    public void getWarnings(nq nqVar, setMinEms setminems) {
        Object obj;
        int i = getWarnings + 15;
        get = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            d(TextUtils.indexOf((CharSequence) "", '9', 1) + 121, true, 91 << KeyEvent.getDeadChar(0, 1), 4791 - TextUtils.lastIndexOf("", 'a'), "\u0005\u000b\u0000\u0005\f￼\u0006\u0006\ufff9ￚ\u0006", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            d(TextUtils.indexOf((CharSequence) "", '0', 0) + 12, false, 6 - KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0') + EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, "\u0005\u000b\u0000\u0005\f￼\u0006\u0006\ufff9ￚ\u0006", objArr2);
            obj = objArr2[0];
        }
        nqVar.getWarnings(((String) obj).intern(), setminems.ConfigParameters());
        int i2 = get + 95;
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
