package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setMaxLines {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final String ThreeDS2Service;
    private static boolean ThreeDS2ServiceInitializationCallback;
    private static int ThreeDS2ServiceInstance;
    private static int cleanup;
    private static boolean createTransaction;
    private static int getSDKVersion;
    private static char[] initialize;
    private final String get;
    private final no getWarnings = (no) nu.initialize(new Object[]{setMaxLines.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        cleanup = 0;
        getSDKVersion = 1;
        get();
        Object[] objArr = new Object[1];
        a(null, null, (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, "\u0087\u009e\u008c\u0094\u0093\u0086\u0085", objArr);
        ThreeDS2Service = ((String) objArr[0]).intern();
        int i = getSDKVersion + 73;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    public setMaxLines(String str) {
        this.get = str;
    }

    private boolean ThreeDS2ServiceInstance(String str, String str2, boolean z) {
        boolean z2 = false;
        if ((!z || !oj.ThreeDS2Service(str, str2)) && oj.initialize((CharSequence) str, (CharSequence) str2)) {
            int i = getSDKVersion + 67;
            cleanup = i % 128;
            z2 = i % 2 == 0;
        }
        cleanup = (getSDKVersion + 27) % 128;
        return z2;
    }

    private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
        int length;
        char[] cArr;
        char[] cArr2;
        Class cls;
        Object method;
        String str3 = str2;
        $10 = ($11 + 21) % 128;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        onError onerror = new onError();
        char[] cArr3 = initialize;
        Class cls2 = Integer.TYPE;
        if (cArr3 != null) {
            int i2 = $11 + 79;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        cArr2 = cArr3;
                        method = obj;
                        cls = cls2;
                    } else {
                        cArr2 = cArr3;
                        cls = cls2;
                        Class cls3 = (Class) removeParam.initialize(72 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), View.getDefaultSize(0, 0) + 1405);
                        Object[] objArr3 = new Object[1];
                        b(0, 0, -1, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-939298638, method);
                    }
                    cArr[i3] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i3++;
                    cls2 = cls;
                    cArr3 = cArr2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(ThreeDS2ServiceInstance)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize(View.MeasureSpec.getSize(0) + 73, (char) (7530 - (ViewConfiguration.getLongPressTimeout() >> 16)), 2489 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            byte b = (byte) ($$b & 5);
            byte b2 = (byte) (b - 1);
            Object[] objArr5 = new Object[1];
            b(b, b2, (byte) (b2 - 1), objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        if (createTransaction) {
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr4 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i4 = onerror.getWarnings;
                int i5 = onerror.ThreeDS2ServiceInstance;
                if (i4 >= i5) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i4] = (char) (cArr3[bArr2[(i5 - 1) - i4] + i] - intValue);
                Object[] objArr6 = {onerror, onerror};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(73542081);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(48 - (Process.myPid() >> 22), (char) (Process.getGidForName("") + 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11440)).getMethod("k", Object.class, Object.class);
                    map3.put(73542081, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
            }
        } else if (ThreeDS2ServiceInitializationCallback) {
            int length3 = charArray.length;
            onerror.ThreeDS2ServiceInstance = length3;
            char[] cArr5 = new char[length3];
            onerror.getWarnings = 0;
            while (true) {
                int i6 = onerror.getWarnings;
                int i7 = onerror.ThreeDS2ServiceInstance;
                if (i6 >= i7) {
                    String str4 = new String(cArr5);
                    $10 = ($11 + 19) % 128;
                    objArr[0] = str4;
                    return;
                }
                cArr5[i6] = (char) (cArr3[charArray[(i7 - 1) - i6] - i] - intValue);
                Object[] objArr7 = {onerror, onerror};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(73542081);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 49, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 11441 - Color.argb(0, 0, 0, 0))).getMethod("k", Object.class, Object.class);
                    map4.put(73542081, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
            }
        } else {
            int length4 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length4;
            char[] cArr6 = new char[length4];
            onerror.getWarnings = 0;
            while (true) {
                int i8 = onerror.getWarnings;
                int i9 = onerror.ThreeDS2ServiceInstance;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i8] = (char) (cArr3[iArr[(i9 - 1) - i8] - i] - intValue);
                    onerror.getWarnings = i8 + 1;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = i + 108;
        int i6 = i2 * 2;
        int i7 = i3 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i8 = 0 - i6;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i9 = 0;
            int i10 = i7;
            i5 += i7;
            i7 = i10;
            bArr = bArr3;
            i4 = i9;
            int i11 = i7 + 1;
            bArr2[i4] = (byte) i5;
            i9 = i4 + 1;
            if (i4 == i8) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i11];
            byte[] bArr4 = bArr;
            i10 = i11;
            i7 = b;
            bArr3 = bArr4;
            i5 += i7;
            i7 = i10;
            bArr = bArr3;
            i4 = i9;
            int i112 = i7 + 1;
            bArr2[i4] = (byte) i5;
            i9 = i4 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            int i1122 = i7 + 1;
            bArr2[i4] = (byte) i5;
            i9 = i4 + 1;
            if (i4 == i8) {
            }
        }
    }

    public static void get() {
        initialize = new char[]{15239, 15211, 15254, 15315, 15207, 15201, 15287, 15232, 15233, 15202, 15206, 15200, 15212, 15282, 15203, 15238, 15247, 15204, 15250, 15213, 15279, 15248, 15253, 15214, 15210, 15252, 15255, 15277, 15215, 15242};
        ThreeDS2ServiceInstance = 993475571;
        ThreeDS2ServiceInitializationCallback = true;
        createTransaction = true;
    }

    public static void init$0() {
        $$a = new byte[]{58, -96, 36, -125};
        $$b = 51;
    }

    public boolean v_(Uri uri) {
        int i = getSDKVersion + 79;
        cleanup = i % 128;
        int i2 = i % 2;
        String str = this.get;
        if (i2 != 0) {
            oj.get(str);
            throw null;
        }
        boolean z = oj.get(str);
        boolean z2 = false;
        if (z) {
            AudioTrack.getMinVolume();
            cleanup = (getSDKVersion + 77) % 128;
            return false;
        }
        if (uri == null) {
            TypedValue.complexToFloat(0);
            return false;
        }
        Uri parse = Uri.parse(this.get);
        if (ThreeDS2ServiceInstance(parse.getScheme(), uri.getScheme(), true) && ThreeDS2ServiceInstance(parse.getAuthority(), uri.getAuthority(), true)) {
            cleanup = (getSDKVersion + 115) % 128;
            if (ThreeDS2ServiceInstance(parse.getPath(), uri.getPath(), false)) {
                cleanup = (getSDKVersion + 23) % 128;
                Object[] objArr = new Object[1];
                a(null, null, View.resolveSizeAndState(0, 0, 0) + 127, "\u0087\u009e\u008c\u0094\u0093\u0086\u0085", objArr);
                String queryParameter = parse.getQueryParameter(((String) objArr[0]).intern());
                Object[] objArr2 = new Object[1];
                a(null, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0087\u009e\u008c\u0094\u0093\u0086\u0085", objArr2);
                if (ThreeDS2ServiceInstance(queryParameter, uri.getQueryParameter(((String) objArr2[0]).intern()), true)) {
                    getSDKVersion = (cleanup + 41) % 128;
                    z2 = true;
                    getSDKVersion = (cleanup + 59) % 128;
                    return z2;
                }
            }
        }
        getSDKVersion = (cleanup + 69) % 128;
        getSDKVersion = (cleanup + 59) % 128;
        return z2;
    }
}
