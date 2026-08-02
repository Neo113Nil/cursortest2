package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
class setNavigationContentDescription implements setSubtitle<setImeHintLocales, nq> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1141902442;

    /* JADX WARN: Removed duplicated region for block: B:24:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        char[] cArr;
        int i4;
        Throwable cause;
        int i5;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 33) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr3 = new char[i2];
        int i6 = 0;
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i7 = getsdkinfo.getWarnings;
            if (i7 >= i2) {
                break;
            }
            char c = cArr2[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr3[i7] = c2;
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
                    Class cls = (Class) removeParam.initialize(66 - ImageFormat.getBitsPerPixel(i6), (char) (View.MeasureSpec.makeMeasureSpec(i6, i6) + 45769), 4880 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    Class cls2 = Integer.TYPE;
                    obj = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, obj);
                }
                cArr3[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(59 - (KeyEvent.getMaxKeyCode() >> 16), (char) ExpandableListView.getPackedPositionType(0L), TextUtils.getTrimmedLength("") + 12373)).getMethod("r", Object.class, Object.class);
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
        if (i > 0) {
            $10 = ($11 + 1) % 128;
            getsdkinfo.get = i;
            char[] cArr4 = new char[i2];
            i4 = i8;
            System.arraycopy(cArr3, i4, cArr4, i4, i2);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr4, i4, cArr3, i2 - i9, i9);
            int i10 = getsdkinfo.get;
            System.arraycopy(cArr4, i10, cArr3, i4, i2 - i10);
        } else {
            i4 = i8;
        }
        if (z) {
            $11 = ($10 + 105) % 128;
            char[] cArr5 = new char[i2];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i11 = getsdkinfo.getWarnings;
                if (i11 >= i2) {
                    break;
                }
                $11 = ($10 + 69) % 128;
                cArr5[i11] = cArr3[(i2 - i11) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58, (char) ((-1) - MotionEvent.axisFromString("")), 12373 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitle
    public /* synthetic */ setImeHintLocales ThreeDS2ServiceInstance(nq nqVar) {
        int i = ThreeDS2Service + 121;
        ThreeDS2ServiceInstance = i % 128;
        nq nqVar2 = nqVar;
        if (i % 2 != 0) {
            initialize(nqVar2);
            throw null;
        }
        setImeHintLocales initialize2 = initialize(nqVar2);
        int i2 = ThreeDS2ServiceInstance + 41;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return initialize2;
        }
        throw null;
    }

    public setImeHintLocales initialize(nq nqVar) {
        Object[] objArr = new Object[1];
        a(true, (ViewConfiguration.getTapTimeout() >> 16) + 28, 30 - View.MeasureSpec.getMode(0), "\u0013￮\ufffe\f\ufffb\t￼\u0013\uffff￥\u0013\f\u000e\b\uffdf\ufffb\u000e\ufffb\uffde\uffff\u0001\b\uffff\u0006\u0006\ufffb\u0002�\uffff\n", 205 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        fillInStackTrace fillinstacktrace = (fillInStackTrace) nqVar.ThreeDS2Service(((String) objArr[0]).intern(), fillInStackTrace.class);
        Object[] objArr2 = new Object[1];
        a(false, View.resolveSize(0, 0) + 8, 26 - KeyEvent.getDeadChar(0, 0), "ￛ\u000f\u000e\t\u0000\u0003\u0006\u0006�\u0002\ufffb\u0006\u0006\uffff\b\u0001\uffff\uffde\ufffb\u000e\ufffb\uffdf\b\u000e\f\u0013", TextUtils.lastIndexOf("", '0', 0, 0) + EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE, objArr2);
        notifyAll notifyall = (notifyAll) nqVar.ThreeDS2Service(((String) objArr2[0]).intern(), notifyAll.class);
        Object[] objArr3 = new Object[1];
        a(false, 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 31, "\b\u000e\f\u0013ￛ\u000f\u000e\t\u0000\u0003\u0006\u0006￮\u0013\n\uffff�\u0002\ufffb\u0006\u0006\uffff\b\u0001\uffff\uffde\ufffb\u000e\ufffb\uffdf", 207 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        setStackTrace setstacktrace = (setStackTrace) nqVar.ThreeDS2Service(((String) objArr3[0]).intern(), setStackTrace.class);
        Object[] objArr4 = new Object[1];
        a(false, 5 - TextUtils.lastIndexOf("", '0'), TextUtils.getOffsetAfter("", 0) + 27, "\u0002\u000f\u0003￨￼\u0013\ufffe\u0003￼\u0007\u0007\u0000\t\u0002\u0000\uffdf￼\u000f￼￠\t\u000f\r\u0014\uffe7\u0000\t", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, objArr4);
        Integer ThreeDS2Service2 = nqVar.ThreeDS2Service(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(false, ImageFormat.getBitsPerPixel(0) + 16, (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, "\u0001￠�\u0010�￡\n\u0010\u000e\u0015￨�\ufffe\u0001\b\uffff\u0004�\b\b\u0001\n\u0003", 204 - (ViewConfiguration.getTouchSlop() >> 8), objArr5);
        String initialize2 = nqVar.initialize(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        a(true, KeyEvent.keyCodeFromString("") + 20, (Process.myTid() >> 22) + 25, "\ufffb\uffe7\u0013\f\u000e\b\uffdf\ufffb\u000e\ufffb\uffde\uffff\u0001\b\uffff\u0006\u0006\ufffb\u0002�\u0001\b\u0003\u0005\r", TextUtils.lastIndexOf("", '0', 0) + EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE, objArr6);
        printStackTrace printstacktrace = (printStackTrace) nqVar.ThreeDS2Service(((String) objArr6[0]).intern(), printStackTrace.class);
        Object[] objArr7 = new Object[1];
        a(true, (KeyEvent.getMaxKeyCode() >> 16) + 19, Color.green(0) + 24, "￮\u0013\f\u000e\b\uffdf\ufffb\u000e\ufffb\uffde\uffff\u0001\b\uffff\u0006\u0006\ufffb\u0002�\uffff\u0006\u0001\u0001\t", 207 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr7);
        setImeHintLocales setimehintlocales = new setImeHintLocales(fillinstacktrace, notifyall, setstacktrace, ThreeDS2Service2, initialize2, printstacktrace, (getStackTrace) nqVar.ThreeDS2Service(((String) objArr7[0]).intern(), getStackTrace.class));
        int i = ThreeDS2ServiceInstance + 119;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            int i2 = 19 / 0;
        }
        return setimehintlocales;
    }
}
