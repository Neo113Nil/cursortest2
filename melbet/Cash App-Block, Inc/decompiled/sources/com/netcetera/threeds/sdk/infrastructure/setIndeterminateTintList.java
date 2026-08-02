package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setIndeterminateTintList implements setIndeterminateTintMode {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 0;
    private static final String ThreeDS2ServiceInstance;
    private static int cleanup = 1;
    private static int get;
    private final Object getWarnings;
    private final setProgressTintBlendMode initialize;

    static {
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        a(true, 5 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 41 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0005\u0005\ufffa\u0001￼\u0012\ufffe\u0004\ufff8\f\ufffe￼\u0007\ufffe\u000b\ufffe\uffff\ufffe\u000b\t\ufff8�\ufffe\u000b\ufffa\u0001\f\ufff8ￋ\u000f\ufff8\f\u0000\b\u0005\ufff8\ufffe\u0000\u0007\ufffe", (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, objArr);
        ThreeDS2ServiceInstance = ((String) objArr[0]).intern();
        get = (cleanup + 103) % 128;
    }

    public setIndeterminateTintList(Object obj, setProgressTintBlendMode setprogresstintblendmode) {
        this.getWarnings = obj;
        this.initialize = setprogresstintblendmode;
    }

    public static void ThreeDS2Service() {
        ThreeDS2Service = 1141902497;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        int i4;
        char c;
        Throwable cause;
        char c2;
        int i5;
        Object method;
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
            char c3 = charArray[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c3;
            char c4 = (char) (i3 + c3);
            cArr[i7] = c4;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(ThreeDS2Service);
                objArr2[i6] = Integer.valueOf(c4);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i6;
                    c2 = '0';
                    method = obj;
                } else {
                    c2 = '0';
                    i5 = i6;
                    Class cls = (Class) removeParam.initialize(AndroidCharacter.getMirror('0') + 19, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 45768), ExpandableListView.getPackedPositionType(0L) + 4879);
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                }
                cArr[i7] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    int i8 = i5;
                    obj2 = ((Class) removeParam.initialize(59 - Gravity.getAbsoluteGravity(i8, i8), (char) ('0' - AndroidCharacter.getMirror(c2)), (TypedValue.complexToFloat(i8) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(i8) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12373)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                $11 = ($10 + 107) % 128;
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
        char c5 = '0';
        if (i > 0) {
            $11 = ($10 + 27) % 128;
            getsdkinfo.get = i;
            char[] cArr2 = new char[i2];
            i4 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr2, 0, cArr, i2 - i9, i9);
            int i10 = getsdkinfo.get;
            System.arraycopy(cArr2, i10, cArr, 0, i2 - i10);
        } else {
            i4 = 0;
        }
        if (z) {
            char[] cArr3 = new char[i2];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i11 = getsdkinfo.getWarnings;
                if (i11 >= i2) {
                    break;
                }
                int i12 = $11 + 85;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr3[i11] = cArr[(i2 * i11) + 1];
                    Object[] objArr4 = {getsdkinfo, getsdkinfo};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(1981656970);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(((Process.getThreadPriority(0) + 20) >> 6) + 59, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.getDeadChar(0, 0) + 12373)).getMethod("r", Object.class, Object.class);
                        map2.put(1981656970, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr4);
                } else {
                    cArr3[i11] = cArr[(i2 - i11) - 1];
                    Object[] objArr5 = {getsdkinfo, getsdkinfo};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map3.get(1981656970);
                    if (obj4 != null) {
                        c = c5;
                    } else {
                        c = c5;
                        obj4 = ((Class) removeParam.initialize(Color.blue(0) + 59, (char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", c, 0) + 12374)).getMethod("r", Object.class, Object.class);
                        map3.put(1981656970, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr5);
                    c5 = c;
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    public static setIndeterminateTintMode get(Context context) {
        try {
            Object[] objArr = {context};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1029982151);
            if (obj == null) {
                obj = ((Class) removeParam.initialize((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49, (char) KeyEvent.keyCodeFromString(""), 11729 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("ThreeDS2ServiceInstance", Context.class);
                map.put(-1029982151, obj);
            }
            setIndeterminateTintList setindeterminatetintlist = new setIndeterminateTintList(((Method) obj).invoke(null, objArr), new setProgressBackgroundTintMode());
            int i = cleanup + 77;
            get = i % 128;
            if (i % 2 == 0) {
                return setindeterminatetintlist;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode
    public List<setProgressBackgroundTintList> ThreeDS2ServiceInstance() {
        get = (cleanup + 53) % 128;
        Object obj = this.getWarnings;
        Object[] objArr = new Object[1];
        a(true, TextUtils.getCapsMode("", 0, 0) + 5, (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 39, "\u0005\u0005\ufffa\u0001￼\u0012\ufffe\u0004\ufff8\f\ufffe￼\u0007\ufffe\u000b\ufffe\uffff\ufffe\u000b\t\ufff8�\ufffe\u000b\ufffa\u0001\f\ufff8ￋ\u000f\ufff8\f\u0000\b\u0005\ufff8\ufffe\u0000\u0007\ufffe", 266 - View.MeasureSpec.getMode(0), objArr);
        try {
            Object[] objArr2 = {((String) objArr[0]).intern(), ""};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj2 = map.get(861263582);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(48 - TextUtils.getOffsetAfter("", 0), (char) (37870 - ExpandableListView.getPackedPositionGroup(0L)), 11680 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("get", String.class, String.class);
                map.put(861263582, obj2);
            }
            List<setProgressBackgroundTintList> initialize = this.initialize.initialize((String) ((Method) obj2).invoke(obj, objArr2));
            int i = get + 103;
            cleanup = i % 128;
            if (i % 2 == 0) {
                int i2 = 17 / 0;
            }
            return initialize;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode
    public void getWarnings(List<setProgressBackgroundTintList> list) {
        HashSet hashSet = new HashSet(ThreeDS2ServiceInstance());
        Iterator<setProgressBackgroundTintList> it = list.iterator();
        get = (cleanup + 33) % 128;
        while (it.hasNext()) {
            get = (cleanup + 33) % 128;
            hashSet.remove(it.next());
        }
        String str = this.initialize.get(new ArrayList(hashSet));
        Object obj = this.getWarnings;
        Object[] objArr = new Object[1];
        a(true, TextUtils.indexOf("", "") + 5, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39, "\u0005\u0005\ufffa\u0001￼\u0012\ufffe\u0004\ufff8\f\ufffe￼\u0007\ufffe\u000b\ufffe\uffff\ufffe\u000b\t\ufff8�\ufffe\u000b\ufffa\u0001\f\ufff8ￋ\u000f\ufff8\f\u0000\b\u0005\ufff8\ufffe\u0000\u0007\ufffe", 266 - Drawable.resolveOpacity(0, 0), objArr);
        try {
            Object[] objArr2 = {((String) objArr[0]).intern(), str};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj2 = map.get(-1392497171);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(48 - TextUtils.getOffsetAfter("", 0), (char) (37870 - View.combineMeasuredStates(0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11679)).getMethod("ThreeDS2ServiceInstance", String.class, String.class);
                map.put(-1392497171, obj2);
            }
            ((Method) obj2).invoke(obj, objArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode
    public void initialize(List<setProgressBackgroundTintList> list) {
        HashSet hashSet = new HashSet(ThreeDS2ServiceInstance());
        hashSet.addAll(list);
        String str = this.initialize.get(new ArrayList(hashSet));
        Object obj = this.getWarnings;
        Object[] objArr = new Object[1];
        a(true, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 5, TextUtils.lastIndexOf("", '0', 0) + 41, "\u0005\u0005\ufffa\u0001￼\u0012\ufffe\u0004\ufff8\f\ufffe￼\u0007\ufffe\u000b\ufffe\uffff\ufffe\u000b\t\ufff8�\ufffe\u000b\ufffa\u0001\f\ufff8ￋ\u000f\ufff8\f\u0000\b\u0005\ufff8\ufffe\u0000\u0007\ufffe", 266 - TextUtils.getTrimmedLength(""), objArr);
        try {
            Object[] objArr2 = {((String) objArr[0]).intern(), str};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj2 = map.get(-1392497171);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (37870 - ExpandableListView.getPackedPositionType(0L)), 11679 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getMethod("ThreeDS2ServiceInstance", String.class, String.class);
                map.put(-1392497171, obj2);
            }
            ((Method) obj2).invoke(obj, objArr2);
            cleanup = (get + 15) % 128;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
