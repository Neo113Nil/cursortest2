package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class jm implements com.netcetera.threeds.sdk.api.ui.ProgressView {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean ThreeDS2ServiceInitializationCallback;
    private static boolean cleanup;
    private static int createTransaction;
    private static char[] get;
    private static int getSDKInfo;
    private static int getSDKVersion;
    private final no ThreeDS2Service = (no) nu.initialize(new Object[]{jm.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final ji ThreeDS2ServiceInstance;
    private final mj<Activity> getWarnings;
    private jl initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        createTransaction = 0;
        getSDKVersion = 1;
        get = new char[]{15177, 15151, 15146, 15186, 15196, 15150, 15171, 15184, 15138, 15257, 15147, 15149, 15192, 15189, 15143, 15197, 15211, 15216, 15199, 15136, 15198, 15181, 15262, 15249, 15224, 15139, 15248};
        getSDKInfo = 993475513;
        cleanup = true;
        ThreeDS2ServiceInitializationCallback = true;
    }

    public jm(ji jiVar, mj<Activity> mjVar) {
        this.ThreeDS2ServiceInstance = jiVar;
        this.getWarnings = mjVar;
    }

    public static jm ThreeDS2Service(jj jjVar, ju juVar) {
        jm jmVar = new jm(new ji(jjVar, juVar), mf.initialize());
        int i = getSDKVersion + 9;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            return jmVar;
        }
        throw null;
    }

    private boolean ThreeDS2ServiceInstance() {
        int i = getSDKVersion + 121;
        createTransaction = i % 128;
        int i2 = i % 2;
        jl jlVar = this.initialize;
        if (i2 != 0) {
            throw null;
        }
        if (jlVar != null) {
            return true;
        }
        no noVar = this.ThreeDS2Service;
        Object[] objArr = new Object[1];
        a(null, null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u009b\u0094\u008c\u0088\u009a\u0088\u008c\u0095\u0099\u0098\u0089\u0085\u0088\u0087\u0086\u0086\u0085\u0082\u0084\u0083\u0082\u0081\u008c\u0085\u0084\u0097\u008b\u0083\u0088\u008c\u0095\u008d\u0086\u008b\u008d\u0082\u0096\u008a\u0084\u008b\u0088\u008e\u008e\u008d\u0095\u008a\u0094\u0093\u008a\u0085\u008f\u0088\u008e\u008d\u0088\u008c\u0088\u008b\u0092\u008a\u0091\u0090\u0085\u008f\u0088\u008e\u008d\u0088\u008c\u0088\u008b\u0088\u008a\u008c\u0083\u008b\u008a\u0089\u0085\u0088\u0087\u0086\u0086\u0085\u0082\u0084\u0083\u0082\u0081", objArr);
        noVar.initialize(((String) objArr[0]).intern());
        getSDKVersion = (createTransaction + 105) % 128;
        return false;
    }

    private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
        long j;
        int i2;
        char[] cArr;
        Class cls;
        char[] cArr2;
        Object method;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        onError onerror = new onError();
        char[] cArr3 = get;
        Class cls2 = Integer.TYPE;
        if (cArr3 != null) {
            $11 = ($10 + 25) % 128;
            int length = cArr3.length;
            j = 0;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        cArr = cArr3;
                        method = obj;
                        cls = cls2;
                        cArr2 = cArr4;
                    } else {
                        cArr = cArr3;
                        Class cls3 = (Class) removeParam.initialize(72 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionType(0L) + 1405);
                        Object[] objArr3 = new Object[1];
                        cls = cls2;
                        cArr2 = cArr4;
                        b((short) 0, -1, 1, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-939298638, method);
                    }
                    cArr2[i3] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i3++;
                    cArr3 = cArr;
                    cls2 = cls;
                    cArr4 = cArr2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        } else {
            j = 0;
        }
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(getSDKInfo)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize(73 - ExpandableListView.getPackedPositionGroup(j), (char) (7529 - ((byte) KeyEvent.getModifierMetaStateMask())), Color.argb(0, 0, 0, 0) + 2489);
            Object[] objArr5 = new Object[1];
            b((short) 0, -1, 0, objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        if (ThreeDS2ServiceInitializationCallback) {
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr5 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i4 = onerror.getWarnings;
                int i5 = onerror.ThreeDS2ServiceInstance;
                if (i4 >= i5) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                $11 = ($10 + 97) % 128;
                cArr5[i4] = (char) (cArr3[bArr2[(i5 - 1) - i4] + i] - intValue);
                Object[] objArr6 = {onerror, onerror};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(73542081);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(Gravity.getAbsoluteGravity(0, 0) + 48, (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11441)).getMethod("k", Object.class, Object.class);
                    map3.put(73542081, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
            }
        } else if (cleanup) {
            $10 = ($11 + 9) % 128;
            int length3 = charArray.length;
            onerror.ThreeDS2ServiceInstance = length3;
            char[] cArr6 = new char[length3];
            onerror.getWarnings = 0;
            while (true) {
                int i6 = onerror.getWarnings;
                int i7 = onerror.ThreeDS2ServiceInstance;
                if (i6 >= i7) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                cArr6[i6] = (char) (cArr3[charArray[(i7 - 1) - i6] - i] - intValue);
                Object[] objArr7 = {onerror, onerror};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(73542081);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize((ViewConfiguration.getEdgeSlop() >> 16) + 48, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), View.resolveSize(0, 0) + 11441)).getMethod("k", Object.class, Object.class);
                    map4.put(73542081, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
            }
        } else {
            int length4 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length4;
            char[] cArr7 = new char[length4];
            onerror.getWarnings = 0;
            while (true) {
                int i8 = onerror.getWarnings;
                int i9 = onerror.ThreeDS2ServiceInstance;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr7);
                    return;
                }
                int i10 = $10 + 21;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr7[i8] = (char) (cArr3[iArr[i9 * i8] << i] + intValue);
                    i2 = i8 >>> 1;
                } else {
                    cArr7[i8] = (char) (cArr3[iArr[(i9 - 1) - i8] - i] - intValue);
                    i2 = i8 + 1;
                }
                onerror.getWarnings = i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = i + 4;
        byte[] bArr = $$a;
        int i6 = 109 - i2;
        int i7 = (s * 3) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i6 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5++;
            i8 = bArr[i5];
            i6 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{60, 72, -26, PnmConstants.PAM_RAW_CODE};
        $$b = 48;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        getWarnings();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        if (r1.getWarnings(r3) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void get(Activity activity) {
        int i = getSDKVersion + 59;
        createTransaction = i % 128;
        int i2 = i % 2;
        mj<Activity> mjVar = this.getWarnings;
        if (i2 != 0) {
            boolean warnings = mjVar.getWarnings(activity);
            int i3 = 32 / 0;
        }
        if (this.initialize == null) {
            jl initialize = this.ThreeDS2ServiceInstance.initialize();
            this.initialize = initialize;
            this.getWarnings.ThreeDS2ServiceInstance(activity, initialize);
        }
        int i4 = createTransaction + 23;
        getSDKVersion = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
    }

    public void getWarnings() {
        if (ThreeDS2ServiceInstance()) {
            getSDKVersion = (createTransaction + 3) % 128;
            this.initialize.get();
            this.initialize = null;
            createTransaction = (getSDKVersion + 55) % 128;
        }
    }

    @Override // com.netcetera.threeds.sdk.api.ui.ProgressView
    public void hideProgress() {
        getSDKVersion = (createTransaction + 19) % 128;
        if (ThreeDS2ServiceInstance()) {
            this.initialize.hideProgress();
            createTransaction = (getSDKVersion + 87) % 128;
        }
    }

    @Override // com.netcetera.threeds.sdk.api.ui.ProgressView
    public boolean isProgressShown() {
        int i = createTransaction + 85;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            ThreeDS2ServiceInstance();
            throw null;
        }
        if (!ThreeDS2ServiceInstance()) {
            createTransaction = (getSDKVersion + 111) % 128;
            return false;
        }
        int i2 = getSDKVersion + 27;
        createTransaction = i2 % 128;
        int i3 = i2 % 2;
        jl jlVar = this.initialize;
        if (i3 == 0) {
            return jlVar.isProgressShown();
        }
        jlVar.isProgressShown();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.ui.ProgressView
    public void showProgress() {
        getSDKVersion = (createTransaction + 51) % 128;
        if (ThreeDS2ServiceInstance()) {
            createTransaction = (getSDKVersion + 97) % 128;
            this.initialize.showProgress();
            createTransaction = (getSDKVersion + 77) % 128;
        }
    }
}
