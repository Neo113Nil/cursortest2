package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.helpers.MessageFormatter;

/* loaded from: classes5.dex */
class nw implements no, Serializable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int get = 1141902488;
    private static int getWarnings = 0;
    private static int initialize = 1;
    private final Logger ThreeDS2ServiceInstance;

    public interface getWarnings {
        void get(String str);
    }

    public nw(Logger logger) {
        this.ThreeDS2ServiceInstance = logger;
    }

    private void ThreeDS2Service(getWarnings getwarnings, String str, Object... objArr) {
        try {
            if (oj.initialize(str)) {
                int i = getWarnings;
                initialize = (i + 39) % 128;
                if (objArr != null) {
                    int i2 = (i + 83) % 128;
                    initialize = i2;
                    if (objArr.length > 0) {
                        int i3 = i2 + 23;
                        getWarnings = i3 % 128;
                        if (i3 % 2 == 0) {
                            getwarnings.get(MessageFormatter.arrayFormat(str, objArr).getMessage());
                            return;
                        } else {
                            getwarnings.get(MessageFormatter.arrayFormat(str, objArr).getMessage());
                            throw null;
                        }
                    }
                }
            }
            getwarnings.get(str);
        } catch (Throwable unused) {
        }
    }

    private void ThreeDS2ServiceInstance(nq nqVar, String str) {
        getWarnings = (initialize + 119) % 128;
        if (nqVar.cleanup(str)) {
            getWarnings = (initialize + 55) % 128;
            nqVar.ThreeDS2Service(str, oj.ThreeDS2ServiceInstance('*', nqVar.initialize(str).length()));
        }
        int i = getWarnings + 101;
        initialize = i % 128;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015c  */
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
        $11 = ($10 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
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
                Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf(get)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    cArr = charArray;
                    method = obj;
                } else {
                    cArr = charArray;
                    Class cls = (Class) removeParam.initialize('s' - AndroidCharacter.getMirror('0'), (char) (TextUtils.lastIndexOf("", '0', 0) + 45770), 4879 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                }
                cArr2[i4] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getsdkinfo, getsdkinfo};
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59, (char) KeyEvent.keyCodeFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 12373)).getMethod("r", Object.class, Object.class);
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
        }
        if (z) {
            int i7 = $10;
            $11 = (i7 + 47) % 128;
            char[] cArr4 = new char[i2];
            getsdkinfo.getWarnings = 0;
            $11 = (i7 + 85) % 128;
            while (true) {
                int i8 = getsdkinfo.getWarnings;
                if (i8 >= i2) {
                    break;
                }
                cArr4[i8] = cArr2[(i2 - i8) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(58 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getPressedStateDuration() >> 16), Color.red(0) + 12373)).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private String get(String str) {
        initialize = (getWarnings + 115) % 128;
        try {
            nq ThreeDS2ServiceInstance = nq.ThreeDS2ServiceInstance(str);
            Object[] objArr = new Object[1];
            a(true, (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12, 18 - Color.red(0), "\ufffb\u000e\ufffb\uffde\uffff\u0001\b\uffff\u0006\u0006\ufffb\u0002�\u0013\f\u000e\b\uffdf", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 256, objArr);
            ThreeDS2ServiceInstance(ThreeDS2ServiceInstance, ((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a(false, 14 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 21, "\u0001\uffff\uffde\ufffb\u000e\ufffb\uffdf\b\u000e\f\u0013￮\u0011\t�\u0002\ufffb\u0006\u0006\uffff\b", 255 - ExpandableListView.getPackedPositionChild(0L), objArr2);
            ThreeDS2ServiceInstance(ThreeDS2ServiceInstance, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(true, View.resolveSizeAndState(0, 0, 0) + 3, (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 22, "\u0000\u0007\u0002\u0018\u0011\u0013\r￤\u0000\u0013\u0000￣￫￬\ufff3\uffe7\u0004\u0006\r\u0004\u000b\u000b", 251 - View.getDefaultSize(0, 0), objArr3);
            ThreeDS2ServiceInstance(ThreeDS2ServiceInstance, ((String) objArr3[0]).intern());
            String nqVar = ThreeDS2ServiceInstance.toString();
            initialize = (getWarnings + 73) % 128;
            return nqVar;
        } catch (setScrollCaptureCallback unused) {
            return str;
        }
    }

    private void initialize(String str, getWarnings getwarnings) {
        int i = initialize + 79;
        getWarnings = i % 128;
        try {
            if (i % 2 != 0) {
                oj.initialize(str);
                throw null;
            }
            if (oj.initialize(str)) {
                if (str.length() > 3584) {
                    getwarnings.get(str.substring(0, 3584));
                    initialize(str.substring(3584), getwarnings);
                } else {
                    getwarnings.get(str);
                }
            }
            getWarnings = (initialize + 9) % 128;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r12 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r2 = r12.get(-1743261197);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        r1 = ((java.lang.reflect.Method) r2).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        r11 = new java.lang.Object[]{get(r11)};
        r2 = r12.get(1699547932);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        r11 = ((java.lang.reflect.Method) r2).invoke(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        r9 = new java.lang.Object[1];
        a(false, (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 7, 15 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), "\uffd9￫\uffe7￮\uffe7￬\uffe7￫\ufffa'\u001d+(\"\u001d", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, r9);
        r0 = ((java.lang.String) r9[0]).intern().getBytes(java.nio.charset.StandardCharsets.UTF_8);
        r9 = new java.lang.Object[1];
        a(false, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 4, android.view.View.resolveSizeAndState(0, 0, 0) + 5, "-￨\uffdf-\uffdf", 224 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), r9);
        initialize(java.lang.String.format(((java.lang.String) r9[0]).intern(), r11, com.netcetera.threeds.sdk.infrastructure.op.initialize(r0)), com.netcetera.threeds.sdk.infrastructure.oa.initialize);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        r2 = ((java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, (char) (33148 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), (android.view.ViewConfiguration.getScrollFriction() > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.view.ViewConfiguration.getScrollFriction() == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11583)).getMethod("ThreeDS2ServiceInstance", java.lang.String.class);
        r12.put(1699547932, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        r2 = ((java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(49 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (char) (33149 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1))), android.graphics.Color.blue(0) + 11584)).getDeclaredMethod("initialize", null);
        r12.put(-1743261197, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0112, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0113, code lost:
    
        r11 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0118, code lost:
    
        if (r11 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011a, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0029, code lost:
    
        if (r12.getWarnings() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r12.getWarnings() != false) goto L30;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.no
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getWarnings(String str, nh nhVar) {
        int i = getWarnings + 37;
        initialize = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
        int i3 = initialize + 115;
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.no
    public void ThreeDS2ServiceInstance(String str) {
        Logger logger = this.ThreeDS2ServiceInstance;
        Objects.requireNonNull(logger);
        initialize(str, new oc(logger));
        int i = initialize + 81;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.no
    public void ThreeDS2ServiceInstance(String str, Object... objArr) {
        ThreeDS2Service(new nz(this), str, objArr);
        initialize = (getWarnings + 93) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.no
    public void initialize(String str) {
        Logger logger = this.ThreeDS2ServiceInstance;
        Objects.requireNonNull(logger);
        initialize(str, new nv(logger));
        int i = initialize + 121;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ void ThreeDS2Service(String str) {
        initialize = (getWarnings + 21) % 128;
        Object[] objArr = new Object[1];
        a(true, 13 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getTrimmedLength("") + 23, "\ufff8\uffff\ufffa\ufff6\ufffb￼\u000b\u0007\u0010\t\ufffa\u0005￼\ufffe\u0006\u0003\ufff6￼\ufffe\u0005￼\u0003\u0003", 259 - TextUtils.getOffsetAfter("", 0), objArr);
        Log.d(((String) objArr[0]).intern(), str);
        initialize = (getWarnings + 19) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.no
    public void ThreeDS2Service(String str, Object... objArr) {
        ThreeDS2Service(new ob(this), str, objArr);
        int i = initialize + 15;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            int i2 = 44 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object getWarnings(Object[] objArr) {
        String str = (String) objArr[0];
        getWarnings = (initialize + 11) % 128;
        ThreeDS2Service(str);
        int i = getWarnings + 51;
        initialize = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }
}
