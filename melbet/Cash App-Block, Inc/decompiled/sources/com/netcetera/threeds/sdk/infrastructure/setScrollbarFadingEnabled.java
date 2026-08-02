package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.ButtonCustomization;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setScrollbarFadingEnabled implements RuntimeErrorEvent {
    private static int $10 = 0;
    private static int $11 = 1;
    static final String ThreeDS2Service;
    private static int ThreeDS2ServiceInstance = 0;
    static final String get;
    private static int getSDKInfo = 0;
    private static int getSDKVersion = 1;
    static final String getWarnings;
    static final String initialize;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setScrollbarFadingEnabled$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        private static int ThreeDS2ServiceInstance = 0;
        private static int get = 1;
        static final /* synthetic */ int[] getWarnings;

        static {
            int[] iArr = new int[ButtonCustomization.ThreeDS2Service.values().length];
            getWarnings = iArr;
            try {
                iArr[ButtonCustomization.ThreeDS2Service.initialize.ordinal()] = 1;
                ThreeDS2ServiceInstance = (get + 47) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getWarnings[ButtonCustomization.ThreeDS2Service.getWarnings.ordinal()] = 2;
                int i = ThreeDS2ServiceInstance;
                int i2 = (i & (-110)) | ((~i) & 109);
                int i3 = -(-((i & 109) << 1));
                get = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i4 = get;
            int i5 = (i4 ^ 17) + ((i4 & 17) << 1);
            ThreeDS2ServiceInstance = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 20 / 0;
            }
        }
    }

    static {
        get();
        Object[] objArr = new Object[1];
        a(false, (KeyEvent.getMaxKeyCode() >> 16) + 1, (ViewConfiguration.getJumpTapTimeout() >> 16) + 2, "\u0002\ufffe", 167 - (Process.myPid() >> 22), objArr);
        getWarnings = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(true, 1 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, "￼\ufff9\u0006\b", (ViewConfiguration.getScrollDefaultDelay() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, objArr2);
        initialize = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(true, -ImageFormat.getBitsPerPixel(0), 2 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0000\u0000", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 150, objArr3);
        ThreeDS2Service = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(true, 1 - (ViewConfiguration.getTouchSlop() >> 8), 2 - View.MeasureSpec.getSize(0), "\ufff7\t", TextUtils.indexOf((CharSequence) "", '0') + EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, objArr4);
        get = ((String) objArr4[0]).intern();
        getSDKInfo = (getSDKVersion + 23) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        char[] cArr2;
        Object method;
        if (str != null) {
            $10 = ($11 + 115) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr4 = new char[i2];
        getsdkinfo.getWarnings = 0;
        $11 = ($10 + 11) % 128;
        while (true) {
            int i4 = getsdkinfo.getWarnings;
            if (i4 >= i2) {
                break;
            }
            char c = cArr3[i4];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr4[i4] = c2;
            try {
                Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf(ThreeDS2ServiceInstance)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    cArr2 = cArr3;
                    method = obj;
                } else {
                    cArr2 = cArr3;
                    Class cls = (Class) removeParam.initialize(67 - TextUtils.indexOf("", ""), (char) (45770 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 4879);
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                }
                cArr4[i4] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getsdkinfo, getsdkinfo};
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(59 - (KeyEvent.getMaxKeyCode() >> 16), (char) TextUtils.indexOf("", ""), View.MeasureSpec.getMode(0) + 12373)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                cArr3 = cArr2;
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
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr4, 0, cArr5, 0, i2);
            int i5 = getsdkinfo.get;
            System.arraycopy(cArr5, 0, cArr4, i2 - i5, i5);
            int i6 = getsdkinfo.get;
            System.arraycopy(cArr5, i6, cArr4, 0, i2 - i6);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            getsdkinfo.getWarnings = 0;
            while (true) {
                int i7 = getsdkinfo.getWarnings;
                if (i7 >= i2) {
                    break;
                }
                $11 = ($10 + 79) % 128;
                cArr6[i7] = cArr4[(i2 - i7) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 59, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 12372 - Process.getGidForName(""))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                $11 = ($10 + 87) % 128;
            }
            cArr4 = cArr6;
        }
        String str2 = new String(cArr4);
        $11 = ($10 + 109) % 128;
        objArr[0] = str2;
    }

    private void get(nq nqVar, List<com.netcetera.threeds.sdk.api.security.Warning> list) {
        if (list != null) {
            getSDKVersion = (getSDKInfo + 117) % 128;
            if (!list.isEmpty()) {
                ns ThreeDS2Service2 = ns.ThreeDS2Service();
                Iterator<com.netcetera.threeds.sdk.api.security.Warning> it = list.iterator();
                while (it.hasNext()) {
                    ThreeDS2Service2.initialize(it.next().getId());
                }
                Object[] objArr = new Object[1];
                a(false, (Process.myTid() >> 22) + 1, View.combineMeasuredStates(0, 0) + 2, "\u0002\ufffe", Process.getGidForName("") + EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, objArr);
                nqVar.ThreeDS2Service(((String) objArr[0]).intern(), ThreeDS2Service2);
                return;
            }
        }
        int i = getSDKInfo + 65;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.RuntimeErrorEvent
    public String ThreeDS2Service(CompletionEvent completionEvent) {
        getSDKVersion = (getSDKInfo + 71) % 128;
        nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
        getErrorMessage ThreeDS2ServiceInstance3 = completionEvent.ThreeDS2ServiceInstance();
        List<com.netcetera.threeds.sdk.api.security.Warning> initialize2 = completionEvent.initialize();
        Object[] objArr = new Object[1];
        a(true, 1 - TextUtils.getOffsetBefore("", 0), Gravity.getAbsoluteGravity(0, 0) + 2, "\ufff7\t", (ViewConfiguration.getKeyRepeatDelay() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), completionEvent.get().get());
        Object[] objArr2 = new Object[1];
        a(true, Color.green(0) + 1, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2, "\u0000\u0000", (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 150, objArr2);
        ThreeDS2Service(ThreeDS2ServiceInstance2, ((String) objArr2[0]).intern(), ThreeDS2ServiceInstance3.initialize());
        Object[] objArr3 = new Object[1];
        a(true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, Drawable.resolveOpacity(0, 0) + 4, "￼\ufff9\u0006\b", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 153, objArr3);
        ThreeDS2Service(ThreeDS2ServiceInstance2, ((String) objArr3[0]).intern(), ThreeDS2ServiceInstance3.ThreeDS2ServiceInstance());
        get(ThreeDS2ServiceInstance2, initialize2);
        String nqVar = ThreeDS2ServiceInstance2.toString();
        getSDKVersion = (getSDKInfo + 63) % 128;
        return nqVar;
    }

    public static void get() {
        ThreeDS2ServiceInstance = 1141902416;
    }

    private void ThreeDS2Service(nq nqVar, String str, Map<String, ButtonCustomization> map) {
        int i = getSDKVersion + 1;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            if (map == null || map.isEmpty()) {
                return;
            }
            nq sDKVersion = nqVar.getSDKVersion(str);
            getSDKInfo = (getSDKVersion + 119) % 128;
            for (Map.Entry<String, ButtonCustomization> entry : map.entrySet()) {
                getSDKInfo = (getSDKVersion + 107) % 128;
                ButtonCustomization value = entry.getValue();
                String key = entry.getKey();
                int i2 = AnonymousClass5.getWarnings[value.cleanup().ordinal()];
                if (i2 == 1) {
                    sDKVersion.ThreeDS2Service(key, value.initialize().get(0));
                    getSDKVersion = (getSDKInfo + 45) % 128;
                } else if (i2 == 2) {
                    sDKVersion.ThreeDS2Service(key, ns.initialize(value.initialize()));
                }
            }
            nqVar.initialize(str, sDKVersion);
            return;
        }
        throw null;
    }
}
