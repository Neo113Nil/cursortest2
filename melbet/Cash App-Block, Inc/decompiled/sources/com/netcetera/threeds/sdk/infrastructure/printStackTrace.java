package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class printStackTrace implements notify {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ printStackTrace[] ThreeDS2Service;
    public static final printStackTrace ThreeDS2ServiceInstance;
    public static final printStackTrace get;
    private static int getSDKInfo = 0;
    private static int getSDKVersion = 1;
    private static int initialize;
    private final String getWarnings;

    static {
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        a(false, (Process.myPid() >> 22) + 1, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, AndroidCharacter.getMirror('0') + 220, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1 - ExpandableListView.getPackedPositionGroup(0L), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 268 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
        get = new printStackTrace(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(false, KeyEvent.getDeadChar(0, 0) + 1, 1 - TextUtils.indexOf("", "", 0, 0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + EnumC0170g.SDK_ASSET_HEADER_BOLT_VALUE, objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(false, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 257 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr4);
        ThreeDS2ServiceInstance = new printStackTrace(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2Service = ThreeDS2ServiceInstance();
        getSDKInfo = (getSDKVersion + 87) % 128;
    }

    private printStackTrace(String str, int i, String str2) {
        this.getWarnings = str2;
    }

    public static void ThreeDS2Service() {
        initialize = 1141902513;
    }

    private static /* synthetic */ printStackTrace[] ThreeDS2ServiceInstance() {
        int i = (getSDKInfo + 111) % 128;
        getSDKVersion = i;
        printStackTrace[] printstacktraceArr = {get, ThreeDS2ServiceInstance};
        int i2 = i + 105;
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            return printstacktraceArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        char[] cArr;
        int i4;
        Throwable cause;
        int i5;
        int i6 = $10;
        int i7 = i6 + 51;
        $11 = i7 % 128;
        int i8 = 2;
        if (i7 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            $11 = (i6 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr3 = new char[i2];
        int i9 = 0;
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i10 = getsdkinfo.getWarnings;
            if (i10 >= i2) {
                break;
            }
            char c = cArr2[i10];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr3[i10] = c2;
            try {
                Object[] objArr2 = new Object[i8];
                objArr2[1] = Integer.valueOf(initialize);
                objArr2[i9] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i9;
                } else {
                    i5 = i9;
                    Class cls = (Class) removeParam.initialize(Process.getGidForName("") + 68, (char) (45769 - View.resolveSize(i9, i9)), 4879 - Color.green(i5));
                    Class cls2 = Integer.TYPE;
                    obj = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, obj);
                }
                cArr3[i10] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    int i11 = i5;
                    obj2 = ((Class) removeParam.initialize(59 - (TypedValue.complexToFloat(i5) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(i5) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) Color.green(i5), 12373 - View.getDefaultSize(i11, i11))).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i8 = 2;
                i9 = 0;
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
            $10 = ($11 + 25) % 128;
            getsdkinfo.get = i;
            char[] cArr4 = new char[i2];
            i4 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            int i12 = getsdkinfo.get;
            System.arraycopy(cArr4, 0, cArr3, i2 - i12, i12);
            int i13 = getsdkinfo.get;
            System.arraycopy(cArr4, i13, cArr3, 0, i2 - i13);
        } else {
            i4 = 0;
        }
        if (z) {
            char[] cArr5 = new char[i2];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i14 = getsdkinfo.getWarnings;
                if (i14 >= i2) {
                    break;
                }
                $11 = ($10 + 101) % 128;
                cArr5[i14] = cArr3[(i2 - i14) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(60 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 12373 - (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr3 = cArr5;
        }
        String str2 = new String(cArr3);
        int i15 = $10 + 59;
        $11 = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    public static printStackTrace valueOf(String str) {
        int i = getSDKVersion + 17;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        printStackTrace printstacktrace = (printStackTrace) Enum.valueOf(printStackTrace.class, str);
        if (i2 != 0) {
            int i3 = 99 / 0;
        }
        getSDKVersion = (getSDKInfo + 51) % 128;
        return printstacktrace;
    }

    public static printStackTrace[] values() {
        getSDKVersion = (getSDKInfo + 45) % 128;
        printStackTrace[] printstacktraceArr = (printStackTrace[]) ThreeDS2Service.clone();
        getSDKVersion = (getSDKInfo + 63) % 128;
        return printstacktraceArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = getSDKVersion + 33;
        int i2 = i % 128;
        getSDKInfo = i2;
        int i3 = i % 2;
        String str = this.getWarnings;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        getSDKVersion = (i2 + 15) % 128;
        return str;
    }
}
