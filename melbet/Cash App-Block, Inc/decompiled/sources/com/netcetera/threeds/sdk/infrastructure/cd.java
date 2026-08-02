package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
class cd extends bt<FrameLayout> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2ServiceInstance = 0;
    private static int cleanup = 1;
    private static int createTransaction;
    private static final String get;
    final cf ThreeDS2Service;
    private int getWarnings = -1;
    private final du initialize;

    static {
        ThreeDS2ServiceInitializationCallback();
        Object[] objArr = new Object[1];
        a(false, ((Process.getThreadPriority(0) + 20) >> 6) + 15, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27, "\u000b\n\u000f\u0001￤�\u000f\u0004\uffdf\u000b\u0000\u0001\uffe7\u0001\u0015\uffdf\u0004�\b\b\u0001\n\u0003\u0001￮\u0001\u000f\f", 124 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        get = ((String) objArr[0]).intern();
        createTransaction = (cleanup + 9) % 128;
    }

    public cd(cf cfVar, du duVar) {
        this.ThreeDS2Service = cfVar;
        this.initialize = duVar;
    }

    public static void ThreeDS2ServiceInitializationCallback() {
        ThreeDS2ServiceInstance = 1141902362;
    }

    public static cd ThreeDS2ServiceInstance(ce ceVar, com.netcetera.threeds.sdk.api.ui.ProgressView progressView, ju juVar, fx fxVar) {
        Object initialize;
        initialize = du.initialize(new Object[]{progressView});
        cd cdVar = new cd((cf) cf.get(new Object[]{ceVar, juVar, fxVar}, -689632726, 689632726, (int) System.currentTimeMillis()), (du) initialize);
        int i = createTransaction + 17;
        cleanup = i % 128;
        if (i % 2 != 0) {
            return cdVar;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        char[] cArr2;
        Object method;
        int i4 = $11 + 111;
        $10 = i4 % 128;
        int i5 = 2;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 73) % 128;
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr4 = new char[i2];
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i6 = getsdkinfo.getWarnings;
            if (i6 >= i2) {
                break;
            }
            $11 = ($10 + 79) % 128;
            char c = cArr3[i6];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr4[i6] = c2;
            try {
                Object[] objArr2 = new Object[i5];
                objArr2[1] = Integer.valueOf(ThreeDS2ServiceInstance);
                objArr2[0] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    cArr2 = cArr3;
                    method = obj;
                } else {
                    cArr2 = cArr3;
                    Class cls = (Class) removeParam.initialize(((Process.getThreadPriority(0) + 20) >> 6) + 67, (char) (45769 - KeyEvent.keyCodeFromString("")), 4879 - View.resolveSizeAndState(0, 0, 0));
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                }
                cArr4[i6] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getsdkinfo, getsdkinfo};
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0') + 60, (char) (ViewConfiguration.getEdgeSlop() >> 16), 12373 - View.combineMeasuredStates(0, 0))).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                cArr3 = cArr2;
                i5 = 2;
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
            int i7 = getsdkinfo.get;
            System.arraycopy(cArr5, 0, cArr4, i2 - i7, i7);
            int i8 = getsdkinfo.get;
            System.arraycopy(cArr5, i8, cArr4, 0, i2 - i8);
        }
        if (z) {
            int i9 = $10 + 31;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr6 = new char[i2];
            getsdkinfo.getWarnings = 0;
            while (true) {
                int i11 = getsdkinfo.getWarnings;
                if (i11 >= i2) {
                    break;
                }
                cArr6[i11] = cArr4[(i2 - i11) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(59 - TextUtils.indexOf("", "", 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12373)).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr4 = cArr6;
        }
        objArr[0] = new String(cArr4);
    }

    public void ThreeDS2Service(er erVar) {
        cleanup = (createTransaction + 25) % 128;
        Object[] objArr = new Object[1];
        a(false, 15 - (ViewConfiguration.getPressedStateDuration() >> 16), Color.blue(0) + 28, "\u000b\n\u000f\u0001￤�\u000f\u0004\uffdf\u000b\u0000\u0001\uffe7\u0001\u0015\uffdf\u0004�\b\b\u0001\n\u0003\u0001￮\u0001\u000f\f", 124 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        int intValue = erVar.ThreeDS2Service(((String) objArr[0]).intern(), -1).intValue();
        int i = this.getWarnings;
        if (intValue == i) {
            int i2 = cleanup;
            createTransaction = (i2 + 45) % 128;
            if (i != -1) {
                createTransaction = (i2 + 83) % 128;
                this.ThreeDS2Service.ThreeDS2ServiceInstance(erVar);
            }
        }
    }

    public FrameLayout bf_(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        frameLayout.addView(this.ThreeDS2Service.get(context));
        frameLayout.addView(this.initialize.get(context));
        createTransaction = (cleanup + 11) % 128;
        return frameLayout;
    }

    public void bg_(setScroller setscroller, FrameLayout frameLayout) {
        int i = createTransaction + 9;
        cleanup = i % 128;
        int i2 = i % 2;
        cf cfVar = this.ThreeDS2Service;
        if (i2 != 0) {
            cfVar.getWarnings(setscroller);
            this.getWarnings = ((Integer) og.ThreeDS2Service(setscroller.cleanup(), -1)).intValue();
        } else {
            cfVar.getWarnings(setscroller);
            this.getWarnings = ((Integer) og.ThreeDS2Service(setscroller.cleanup(), -1)).intValue();
            throw null;
        }
    }

    public void get() {
        cleanup = (createTransaction + 47) % 128;
        this.initialize.getWarnings();
        int i = cleanup + 17;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public void getSDKInfo() {
        int i = cleanup + 45;
        createTransaction = i % 128;
        int i2 = i % 2;
        cf cfVar = this.ThreeDS2Service;
        if (i2 != 0) {
            cfVar.get();
            throw null;
        }
        cfVar.get();
        cleanup = (createTransaction + 117) % 128;
    }

    public void getWarnings(eq eqVar) {
        createTransaction = (cleanup + 39) % 128;
        Object[] objArr = new Object[1];
        a(false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, (-16777188) - Color.rgb(0, 0, 0), "\u000b\n\u000f\u0001￤�\u000f\u0004\uffdf\u000b\u0000\u0001\uffe7\u0001\u0015\uffdf\u0004�\b\b\u0001\n\u0003\u0001￮\u0001\u000f\f", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, objArr);
        eqVar.get(((String) objArr[0]).intern(), this.getWarnings);
        this.ThreeDS2Service.initialize(eqVar);
        cleanup = (createTransaction + 57) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public /* synthetic */ View initialize(Context context) {
        cleanup = (createTransaction + 111) % 128;
        FrameLayout bf_ = bf_(context);
        createTransaction = (cleanup + 31) % 128;
        return bf_;
    }

    public void ThreeDS2ServiceInstance(compute computeVar) {
        int i = cleanup + 37;
        createTransaction = i % 128;
        int i2 = i % 2;
        cf cfVar = this.ThreeDS2Service;
        if (i2 == 0) {
            cfVar.ThreeDS2ServiceInstance(computeVar);
            int i3 = cleanup + 11;
            createTransaction = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        cfVar.ThreeDS2ServiceInstance(computeVar);
        throw null;
    }

    public void getWarnings() {
        cleanup = (createTransaction + 55) % 128;
        this.initialize.get();
        int i = createTransaction + 7;
        cleanup = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public void getWarnings(keys keysVar) {
        int i = createTransaction + 59;
        cleanup = i % 128;
        int i2 = i % 2;
        cf cfVar = this.ThreeDS2Service;
        if (i2 != 0) {
            cfVar.ThreeDS2ServiceInstance(keysVar);
        } else {
            cfVar.ThreeDS2ServiceInstance(keysVar);
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bt
    public /* synthetic */ void getWarnings(setScroller setscroller, FrameLayout frameLayout) {
        int i = createTransaction + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        cleanup = i % 128;
        int i2 = i % 2;
        bg_(setscroller, frameLayout);
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public void ThreeDS2Service() {
        int i = cleanup + 121;
        createTransaction = i % 128;
        int i2 = i % 2;
        cf cfVar = this.ThreeDS2Service;
        if (i2 == 0) {
            cfVar.initialize();
            this.initialize.initialize();
            cleanup = (createTransaction + 3) % 128;
        } else {
            cfVar.initialize();
            this.initialize.initialize();
            throw null;
        }
    }
}
