package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class setOutlineAmbientShadowColor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean ThreeDS2Service;
    private static boolean ThreeDS2ServiceInstance;
    private static int createTransaction;
    private static char[] get;
    private static int getSDKVersion;
    private static int getWarnings;
    private static final String initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        createTransaction = 0;
        getSDKVersion = 1;
        getWarnings();
        Object[] objArr = new Object[1];
        a(null, null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0083\u0081\u0082\u0084\u0082\u008f\u008e\u0081\u008e\u008d\u0088\u008c\u008b\u008a\u0085\u0088\u0082\u0086\u0085\u0089\u0082\u0087\u0088\u0087\u0082\u0084\u0086\u0085\u0081\u0084\u0083\u0082\u0081", objArr);
        initialize = ((String) objArr[0]).intern();
        getSDKVersion = (createTransaction + 99) % 128;
    }

    private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
        Class cls;
        int i2;
        long j;
        int length;
        char[] cArr;
        int i3;
        char[] cArr2;
        Class cls2;
        int i4;
        int i5;
        Object method;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            byte[] bytes = str3.getBytes("ISO-8859-1");
            $11 = ($10 + 17) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        onError onerror = new onError();
        char[] cArr3 = get;
        Class cls3 = Integer.TYPE;
        if (cArr3 != null) {
            i2 = 2;
            int i6 = $10 + 59;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        cArr2 = cArr3;
                        i4 = i3;
                        i5 = length;
                        method = obj;
                        cls2 = cls3;
                    } else {
                        cArr2 = cArr3;
                        cls2 = cls3;
                        i4 = i3;
                        i5 = length;
                        Class cls4 = (Class) removeParam.initialize(Process.getGidForName("") + 73, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 1406);
                        Object[] objArr3 = new Object[1];
                        b((short) 0, (short) -1, 0, objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls2);
                        map.put(-939298638, method);
                    }
                    cArr[i4] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i3 = i4 + 1;
                    cls3 = cls2;
                    cArr3 = cArr2;
                    length = i5;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cls = cls3;
            $10 = ($11 + 71) % 128;
            cArr3 = cArr;
        } else {
            cls = cls3;
            i2 = 2;
        }
        Object[] objArr4 = {Integer.valueOf(getWarnings)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize(Process.getGidForName("") + 74, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7530), 2489 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            Object[] objArr5 = new Object[1];
            b((short) 0, (short) -1, 1, objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        long j2 = 0;
        if (ThreeDS2Service) {
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr4 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i7 = onerror.getWarnings;
                int i8 = onerror.ThreeDS2ServiceInstance;
                if (i7 >= i8) {
                    String str4 = new String(cArr4);
                    $10 = ($11 + 115) % 128;
                    objArr[0] = str4;
                    return;
                }
                int i9 = $10 + 13;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr4[i7] = (char) (cArr3[bArr2[(i8 % 1) / i7] % i] >>> intValue);
                    Object[] objArr6 = new Object[i2];
                    objArr6[1] = onerror;
                    objArr6[0] = onerror;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(73542081);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(48 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString("")), 11441 - (Process.myTid() >> 22))).getMethod("k", Object.class, Object.class);
                        map3.put(73542081, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                } else {
                    cArr4[i7] = (char) (cArr3[bArr2[(i8 - 1) - i7] + i] - intValue);
                    Object[] objArr7 = {onerror, onerror};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(73542081);
                    if (obj4 != null) {
                        j = j2;
                    } else {
                        j = j2;
                        obj4 = ((Class) removeParam.initialize(Color.alpha(0) + 48, (char) ((-1) - MotionEvent.axisFromString("")), 11441 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("k", Object.class, Object.class);
                        map4.put(73542081, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr7);
                    j2 = j;
                }
                i2 = 2;
            }
        } else if (ThreeDS2ServiceInstance) {
            int length3 = charArray.length;
            onerror.ThreeDS2ServiceInstance = length3;
            char[] cArr5 = new char[length3];
            onerror.getWarnings = 0;
            while (true) {
                int i10 = onerror.getWarnings;
                int i11 = onerror.ThreeDS2ServiceInstance;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                $11 = ($10 + 87) % 128;
                cArr5[i10] = (char) (cArr3[charArray[(i11 - 1) - i10] - i] - intValue);
                Object[] objArr8 = {onerror, onerror};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(73542081);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(49 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), 11441 - ExpandableListView.getPackedPositionType(0L))).getMethod("k", Object.class, Object.class);
                    map5.put(73542081, obj5);
                }
                ((Method) obj5).invoke(null, objArr8);
            }
        } else {
            int length4 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length4;
            char[] cArr6 = new char[length4];
            onerror.getWarnings = 0;
            while (true) {
                int i12 = onerror.getWarnings;
                int i13 = onerror.ThreeDS2ServiceInstance;
                if (i12 >= i13) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i12] = (char) (cArr3[iArr[(i13 - 1) - i12] - i] - intValue);
                    onerror.getWarnings = i12 + 1;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s * 2;
        int i4 = i + 108;
        int i5 = s2 + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i5;
            int i9 = i5 + (-i6);
            int i10 = i8;
            i4 = i9;
            i5 = i10;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i5 + 1;
            i6 = bArr[i11];
            int i12 = i4;
            i8 = i11;
            i5 = i12;
            int i92 = i5 + (-i6);
            int i102 = i8;
            i4 = i92;
            i5 = i102;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    private Set<String> get() {
        HashSet hashSet = new HashSet();
        hideProgress[] values = hideProgress.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            int i2 = getSDKVersion + 55;
            createTransaction = i2 % 128;
            if (i2 % 2 != 0) {
                hashSet.add(values[i].ThreeDS2ServiceInstance());
                i += 29;
            } else {
                hashSet.add(values[i].ThreeDS2ServiceInstance());
                i++;
            }
        }
        return hashSet;
    }

    public static void getWarnings() {
        get = new char[]{15251, 15232, 15250, 15249, 15236, 15234, 15233, 15246, 15255, 15263, 15239, 15262, 15261, 15244, 15256, 15321};
        getWarnings = 993475565;
        ThreeDS2ServiceInstance = true;
        ThreeDS2Service = true;
    }

    public static void init$0() {
        $$a = new byte[]{PnmConstants.PNM_SEPARATOR, 14, -29, 88};
        $$b = 185;
    }

    public Set<String> ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters) {
        Object[] objArr = new Object[1];
        a(null, null, (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 127, "\u0083\u0081\u0082\u0084\u0082\u008f\u008e\u0081\u008e\u008d\u0088\u008c\u008b\u008a\u0085\u0088\u0082\u0086\u0085\u0089\u0082\u0087\u0088\u0087\u0082\u0084\u0086\u0085\u0081\u0084\u0083\u0082\u0081", objArr);
        String paramValue = configParameters.getParamValue(null, ((String) objArr[0]).intern());
        HashSet hashSet = new HashSet();
        if (paramValue == null) {
            return hashSet;
        }
        Object[] objArr2 = new Object[1];
        a(null, null, 175 - AndroidCharacter.getMirror('0'), "\u0090", objArr2);
        hashSet.addAll(Arrays.asList(paramValue.split(((String) objArr2[0]).intern())));
        HashSet hashSet2 = new HashSet(get());
        Iterator it = hashSet.iterator();
        createTransaction = (getSDKVersion + 107) % 128;
        while (it.hasNext()) {
            getSDKVersion = (createTransaction + 21) % 128;
            String str = (String) it.next();
            if (!hashSet2.contains(str)) {
                throw setTextAlignment.removeParam.initialize(str);
            }
        }
        return hashSet;
    }
}
