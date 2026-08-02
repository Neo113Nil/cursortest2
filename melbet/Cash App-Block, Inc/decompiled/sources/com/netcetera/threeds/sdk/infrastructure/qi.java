package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.qh;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public class qi extends qh {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int ThreeDS2ServiceInstance = 1141902368;
    private static int initialize;
    private byte[] get;

    public qi(Map<String, Object> map) {
        super(map);
        this.get = new oq().getWarnings(qh.getWarnings(map, "k"));
        Object[] objArr = new Object[1];
        a(false, 1 - View.getDefaultSize(0, 0), 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u000b\ufff9�", View.MeasureSpec.makeMeasureSpec(0, 0) + 106, objArr);
        this.getWarnings = new SecretKeySpec(this.get, ((String) objArr[0]).intern());
        ThreeDS2Service("k");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0171  */
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
            $10 = ($11 + 47) % 128;
            char c = charArray[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr[i7] = c2;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(ThreeDS2ServiceInstance);
                objArr2[i6] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i6;
                } else {
                    i5 = i6;
                    Class cls = (Class) removeParam.initialize((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 66, (char) (45769 - Gravity.getAbsoluteGravity(i6, i6)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4879);
                    Class cls2 = Integer.TYPE;
                    Method method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                    obj = method;
                }
                cArr[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(58 - TextUtils.indexOf((CharSequence) "", '0'), (char) ExpandableListView.getPackedPositionGroup(0L), 12373 - TextUtils.getOffsetAfter("", i5))).getMethod("r", Object.class, Object.class);
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
            $10 = ($11 + 107) % 128;
            getsdkinfo.get = i;
            char[] cArr2 = new char[i2];
            i4 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            int i8 = getsdkinfo.get;
            System.arraycopy(cArr2, 0, cArr, i2 - i8, i8);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr2, i9, cArr, 0, i2 - i9);
            $10 = ($11 + 7) % 128;
        } else {
            i4 = 0;
        }
        if (z) {
            char[] cArr3 = new char[i2];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i10 = getsdkinfo.getWarnings;
                if (i10 >= i2) {
                    break;
                }
                $10 = ($11 + 71) % 128;
                cArr3[i10] = cArr[(i2 - i10) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(59 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), 12373 - (Process.myPid() >> 22))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qh
    public String ThreeDS2Service() {
        int i = (ThreeDS2ServiceInitializationCallback + 73) % 128;
        initialize = i;
        ThreeDS2ServiceInitializationCallback = (i + 13) % 128;
        return "oct";
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qh
    public void get(Map<String, Object> map, qh.initialize initializeVar) {
        initialize = (ThreeDS2ServiceInitializationCallback + 77) % 128;
        if (qh.initialize.INCLUDE_SYMMETRIC.compareTo(initializeVar) >= 0) {
            map.put("k", get());
        }
        int i = ThreeDS2ServiceInitializationCallback + 79;
        initialize = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private String get() {
        ThreeDS2ServiceInitializationCallback = (initialize + 27) % 128;
        String str = oq.get(this.get);
        ThreeDS2ServiceInitializationCallback = (initialize + 95) % 128;
        return str;
    }

    public qi(Key key) {
        super(key);
        this.get = key.getEncoded();
    }
}
