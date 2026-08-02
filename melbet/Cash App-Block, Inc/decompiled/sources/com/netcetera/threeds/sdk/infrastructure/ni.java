package com.netcetera.threeds.sdk.infrastructure;

import android.app.Dialog;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public class ni {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 1141902427;
    private static int get = 0;
    private static int initialize = 1;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{ni.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final mw getWarnings;

    public ni(mw mwVar) {
        this.getWarnings = mwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        Throwable cause;
        char[] cArr;
        $11 = ($10 + 25) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr2 = new char[i2];
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i4 = getsdkinfo.getWarnings;
            if (i4 >= i2) {
                break;
            }
            char c = charArray[i4];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr2[i4] = c2;
            try {
                Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf(ThreeDS2Service)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    cArr = charArray;
                } else {
                    cArr = charArray;
                    Class cls = (Class) removeParam.initialize(67 - Color.red(0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45769), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4880);
                    Class cls2 = Integer.TYPE;
                    Method method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                    obj = method;
                }
                cArr2[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getsdkinfo, getsdkinfo};
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(59 - ExpandableListView.getPackedPositionType(0L), (char) KeyEvent.getDeadChar(0, 0), 12373 - View.resolveSizeAndState(0, 0, 0))).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
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
            getsdkinfo.get = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            int i5 = getsdkinfo.get;
            System.arraycopy(cArr3, 0, cArr2, i2 - i5, i5);
            int i6 = getsdkinfo.get;
            System.arraycopy(cArr3, i6, cArr2, 0, i2 - i6);
            $10 = ($11 + 25) % 128;
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
                    obj3 = ((Class) removeParam.initialize(58 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 12374)).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str2 = new String(cArr2);
        int i8 = $11 + 103;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str2;
        } else {
            int i9 = 63 / 0;
            objArr[0] = str2;
        }
    }

    public static ni initialize() {
        ni niVar = new ni(new mw());
        get = (initialize + 45) % 128;
        return niVar;
    }

    public void bU_(Dialog dialog) {
        if (!this.getWarnings.ThreeDS2ServiceInstance()) {
            int i = initialize + 37;
            get = i % 128;
            try {
                if (i % 2 != 0) {
                    dialog.getWindow().setFlags(29044, 400);
                } else {
                    dialog.getWindow().setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
                }
            } catch (NullPointerException e) {
                no noVar = this.ThreeDS2ServiceInstance;
                Object[] objArr = new Object[1];
                a(true, KeyEvent.keyCodeFromString("") + 22, 29 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0006\u0013\u0004\u0014\uffc1\u0006\r\u0003\u0002\u0014\n\u0005\uffc1\u0010\u0015\uffc1\u0005\u0006\r\n\u0002\uffe7ￏ\u0015\u0010\t\u0014\u000f\u0006", Color.red(0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, objArr);
                noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), e);
            }
        }
        initialize = (get + 67) % 128;
    }
}
