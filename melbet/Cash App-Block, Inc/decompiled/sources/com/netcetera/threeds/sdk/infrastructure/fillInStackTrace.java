package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class fillInStackTrace implements notify {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2ServiceInstance = 0;
    private static int cleanup = 1;
    private static int createTransaction;
    public static final fillInStackTrace get;
    public static final fillInStackTrace getWarnings;
    private static final /* synthetic */ fillInStackTrace[] initialize;
    private final String ThreeDS2Service;

    static {
        get();
        Object[] objArr = new Object[1];
        a(false, 3 - TextUtils.indexOf("", "", 0, 0), 7 - TextUtils.getTrimmedLength(""), "\u0007\ufffe\ufff8\u0003\n\u0002\ufffa", 155 - View.combineMeasuredStates(0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(true, View.MeasureSpec.makeMeasureSpec(0, 0) + 1, 2 - View.resolveSize(0, 0), "\u0000\u0001", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 128, objArr2);
        get = new fillInStackTrace(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(true, 12 - TextUtils.indexOf((CharSequence) "", '0', 0), 13 - Color.green(0), "\ufff8\ufffe\u0007\ufffa\u0002\n\u0003\u0014\ufff6�\u0005\u0001\ufff6", 155 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(true, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, Color.argb(0, 0, 0, 0) + 2, "\uffff\u0001", 129 - View.combineMeasuredStates(0, 0), objArr4);
        getWarnings = new fillInStackTrace(intern2, 1, ((String) objArr4[0]).intern());
        initialize = ThreeDS2Service();
        int i = cleanup + 31;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private fillInStackTrace(String str, int i, String str2) {
        this.ThreeDS2Service = str2;
    }

    private static /* synthetic */ fillInStackTrace[] ThreeDS2Service() {
        int i = (cleanup + 19) % 128;
        createTransaction = i;
        fillInStackTrace[] fillinstacktraceArr = {get, getWarnings};
        int i2 = i + 7;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
        return fillinstacktraceArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        char[] cArr;
        int i4;
        Throwable cause;
        int i5;
        int i6 = 2;
        int i7 = 0;
        if (str != null) {
            int i8 = $10 + 29;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr = str.toCharArray();
                int i9 = 62 / 0;
            } else {
                cArr = str.toCharArray();
            }
            $10 = ($11 + 5) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr3 = new char[i2];
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i10 = getsdkinfo.getWarnings;
            if (i10 >= i2) {
                break;
            }
            $10 = ($11 + 115) % 128;
            char c = cArr2[i10];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr3[i10] = c2;
            try {
                Object[] objArr2 = new Object[i6];
                objArr2[1] = Integer.valueOf(ThreeDS2ServiceInstance);
                objArr2[i7] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i7;
                } else {
                    i5 = i7;
                    Class cls = (Class) removeParam.initialize(67 - (ExpandableListView.getPackedPositionForGroup(i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i7) == 0L ? 0 : -1)), (char) (45770 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 4880 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
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
                    obj2 = ((Class) removeParam.initialize(60 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) Color.blue(i5), KeyEvent.normalizeMetaState(i5) + 12373)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i7 = i5;
                i6 = 2;
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
        int i11 = i7;
        if (i > 0) {
            getsdkinfo.get = i;
            char[] cArr4 = new char[i2];
            i4 = i11;
            System.arraycopy(cArr3, i4, cArr4, i4, i2);
            int i12 = getsdkinfo.get;
            System.arraycopy(cArr4, i4, cArr3, i2 - i12, i12);
            int i13 = getsdkinfo.get;
            System.arraycopy(cArr4, i13, cArr3, i4, i2 - i13);
        } else {
            i4 = i11;
        }
        if (z) {
            char[] cArr5 = new char[i2];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i14 = getsdkinfo.getWarnings;
                if (i14 >= i2) {
                    break;
                }
                cArr5[i14] = cArr3[(i2 - i14) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(60 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 12374 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    public static void get() {
        ThreeDS2ServiceInstance = 1141902418;
    }

    public static fillInStackTrace valueOf(String str) {
        cleanup = (createTransaction + 13) % 128;
        fillInStackTrace fillinstacktrace = (fillInStackTrace) Enum.valueOf(fillInStackTrace.class, str);
        int i = createTransaction + 93;
        cleanup = i % 128;
        if (i % 2 == 0) {
            int i2 = 89 / 0;
        }
        return fillinstacktrace;
    }

    public static fillInStackTrace[] values() {
        int i = cleanup + 1;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            return (fillInStackTrace[]) initialize.clone();
        }
        initialize.clone();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = cleanup + 11;
        createTransaction = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2Service;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }
}
