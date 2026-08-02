package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class jx implements jw {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static char[] ThreeDS2ServiceInstance;
    private static boolean get;
    private static boolean getWarnings;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2Service = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        ThreeDS2ServiceInstance = new char[]{15210, 15151, 15162, 15188, 15143, 15200, 15144, 15163, 15148, 15194, 15146, 15160, 15253, 15178, 15149, 15138, 15142, 15161, 15137, 15205};
        initialize = 993475509;
        getWarnings = true;
        get = true;
    }

    private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
        char[] cArr;
        Class cls;
        Object method;
        String str3 = str2;
        int i2 = ($11 + 117) % 128;
        $10 = i2;
        byte[] bArr = str3;
        if (str3 != null) {
            int i3 = i2 + 45;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str3.getBytes("ISO-8859-1");
                throw null;
            }
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        onError onerror = new onError();
        char[] cArr2 = ThreeDS2ServiceInstance;
        Class cls2 = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        cArr = cArr2;
                        method = obj;
                        cls = cls2;
                    } else {
                        cArr = cArr2;
                        cls = cls2;
                        Class cls3 = (Class) removeParam.initialize(((Process.getThreadPriority(0) + 20) >> 6) + 72, (char) (ViewConfiguration.getScrollBarSize() >> 8), 1405 - View.resolveSize(0, 0));
                        Object[] objArr3 = new Object[1];
                        b((short) 1, (byte) 0, (byte) 0, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-939298638, method);
                    }
                    cArr3[i4] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i4++;
                    cArr2 = cArr;
                    cls2 = cls;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(initialize)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize(KeyEvent.getDeadChar(0, 0) + 73, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 7531), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2490);
            Object[] objArr5 = new Object[1];
            b((short) 0, (byte) 0, (byte) 0, objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        if (get) {
            $11 = ($10 + 31) % 128;
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr4 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i5 = onerror.getWarnings;
                int i6 = onerror.ThreeDS2ServiceInstance;
                if (i5 >= i6) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i5] = (char) (cArr2[bArr2[(i6 - 1) - i5] + i] - intValue);
                Object[] objArr6 = {onerror, onerror};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(73542081);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(48 - Color.argb(0, 0, 0, 0), (char) (Process.myPid() >> 22), 11441 - TextUtils.indexOf("", "", 0))).getMethod("k", Object.class, Object.class);
                    map3.put(73542081, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
            }
        } else {
            if (!getWarnings) {
                int length3 = iArr.length;
                onerror.ThreeDS2ServiceInstance = length3;
                char[] cArr5 = new char[length3];
                onerror.getWarnings = 0;
                while (true) {
                    int i7 = onerror.getWarnings;
                    int i8 = onerror.ThreeDS2ServiceInstance;
                    if (i7 >= i8) {
                        break;
                    }
                    cArr5[i7] = (char) (cArr2[iArr[(i8 - 1) - i7] - i] - intValue);
                    onerror.getWarnings = i7 + 1;
                }
                String str4 = new String(cArr5);
                int i9 = $10 + 65;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str4;
                return;
            }
            int length4 = charArray.length;
            onerror.ThreeDS2ServiceInstance = length4;
            char[] cArr6 = new char[length4];
            onerror.getWarnings = 0;
            while (true) {
                int i10 = onerror.getWarnings;
                int i11 = onerror.ThreeDS2ServiceInstance;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                cArr6[i10] = (char) (cArr2[charArray[(i11 - 1) - i10] - i] - intValue);
                Object[] objArr7 = {onerror, onerror};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(73542081);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(48 - Color.argb(0, 0, 0, 0), (char) Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 11442)).getMethod("k", Object.class, Object.class);
                    map4.put(73542081, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, Object[] objArr) {
        int i;
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 1 - (b2 * 3);
        int i5 = (b * 4) + 4;
        int i6 = 109 - s;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i4;
            i3 = 0;
            int i9 = i5 + 1;
            i = i7 + i8;
            i2 = i9;
            bArr2[i3] = (byte) i;
            i3++;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i2];
            int i10 = i;
            i5 = i2;
            i7 = i10;
            int i92 = i5 + 1;
            i = i7 + i8;
            i2 = i92;
            bArr2[i3] = (byte) i;
            i3++;
            if (i3 == i4) {
            }
        } else {
            i = i6;
            i2 = i5;
            i3 = 0;
            bArr2[i3] = (byte) i;
            i3++;
            if (i3 == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{60, 72, -26, PnmConstants.PAM_RAW_CODE};
        $$b = EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String ThreeDS2Service() {
        Object obj;
        int i = ThreeDS2Service + 77;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            a(null, null, 65 - Color.green(1), "\u0093\u0087\u008b\u0085\u0084\u008e", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(null, null, 127 - Color.green(0), "\u0093\u0087\u008b\u0085\u0084\u008e", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service + 7;
        ThreeDS2ServiceInitializationCallback = i % 128;
        return i % 2 == 0 ? 104 : 18;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 25) % 128;
        Object[] objArr = new Object[1];
        a(null, null, 127 - View.MeasureSpec.getSize(0), "\u0082\u0082\u0082\u0082\u0082\u0082\u0081", objArr);
        String intern = ((String) objArr[0]).intern();
        ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 69) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String getSDKInfo() {
        ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 119) % 128;
        Object[] objArr = new Object[1];
        a(null, null, TextUtils.getTrimmedLength("") + 127, "\u0094\u0094\u0094\u0094\u0094\u0094\u0081", objArr);
        String intern = ((String) objArr[0]).intern();
        ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 13) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String getWarnings() {
        Object obj;
        int i = ThreeDS2ServiceInitializationCallback + 35;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            a(null, null, 77 << (ViewConfiguration.getKeyRepeatTimeout() / 20), "\u0092\u008c\u0091\u0090\u008b\u0087\u008f\u008e\u008d\u0087\u0088\u008c\u008b\u0087\u008a", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0092\u008c\u0091\u0090\u008b\u0087\u008f\u008e\u008d\u0087\u0088\u008c\u008b\u0087\u008a", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        Object obj;
        int i = ThreeDS2Service + 97;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            a(null, null, 24 >> ExpandableListView.getPackedPositionType(0L), "\u0082\u0089\u0088\u0087\u0083\u0086\u0083\u0085\u0084\u0083", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(null, null, ExpandableListView.getPackedPositionType(0L) + 127, "\u0082\u0089\u0088\u0087\u0083\u0086\u0083\u0085\u0084\u0083", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
