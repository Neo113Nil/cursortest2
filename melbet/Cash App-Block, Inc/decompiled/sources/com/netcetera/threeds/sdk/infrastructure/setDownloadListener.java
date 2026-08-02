package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setMapTrackballToArrowKeys;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public class setDownloadListener implements setFindListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static boolean ThreeDS2ServiceInitializationCallback;
    private static int cleanup;
    private static int get;
    private static int getSDKVersion;
    private static boolean initialize;
    private final String ThreeDS2ServiceInstance;
    private final SSLSocketFactory getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        cleanup = 0;
        getSDKVersion = 1;
        ThreeDS2Service = new char[]{15075, 15071, 15064, 15058, 15041, 15129, 15090, 15061, 15070, 15083, 15118, 15043, 15046, 15053, 15068, 15059, 15081, 15057, 15040, 15126, 15085, 15098, 15047, 15094, 15100, 15069, 15077, 15074, 15089, 15102, 15103, 15091, 15079, 15073};
        get = 993475374;
        initialize = true;
        ThreeDS2ServiceInitializationCallback = true;
    }

    public setDownloadListener(SSLSocketFactory sSLSocketFactory, String str) {
        this.getWarnings = sSLSocketFactory;
        this.ThreeDS2ServiceInstance = str;
    }

    private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
        int i2;
        long j;
        char[] cArr;
        int i3;
        char[] cArr2;
        int i4;
        char[] cArr3;
        Class cls;
        int i5;
        int i6;
        Object method;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        onError onerror = new onError();
        char[] cArr4 = ThreeDS2Service;
        Class cls2 = Integer.TYPE;
        int i7 = 0;
        if (cArr4 != null) {
            j = 0;
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i8 = 0;
            i2 = 2;
            while (i8 < length) {
                int i9 = $11 + 95;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr4[i8])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-939298638);
                        if (obj != null) {
                            cArr2 = cArr4;
                            cArr3 = cArr5;
                            cls = cls2;
                            i6 = i8;
                            i5 = i7;
                            method = obj;
                            i4 = length;
                        } else {
                            cArr2 = cArr4;
                            i4 = length;
                            i5 = i7;
                            Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getTouchSlop() >> 8) + 72, (char) TextUtils.getCapsMode("", i7, i7), (ExpandableListView.getPackedPositionForChild(i7, i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i7) == 0L ? 0 : -1)) + 1406);
                            byte b = (byte) ($$b - 3);
                            byte b2 = (byte) (b - 1);
                            cArr3 = cArr5;
                            cls = cls2;
                            i6 = i8;
                            Object[] objArr3 = new Object[1];
                            b(b, b2, b2, objArr3);
                            method = cls3.getMethod((String) objArr3[i5], cls);
                            map.put(-939298638, method);
                        }
                        cArr3[i6] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i8 = i6 - 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    cArr2 = cArr4;
                    i4 = length;
                    cArr3 = cArr5;
                    cls = cls2;
                    int i10 = i8;
                    i5 = i7;
                    Object[] objArr4 = {Integer.valueOf(cArr2[i10])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-939298638);
                    if (obj2 == null) {
                        Class cls4 = (Class) removeParam.initialize(((Process.getThreadPriority(i5) + 20) >> 6) + 72, (char) ((Process.getThreadPriority(i5) + 20) >> 6), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1405);
                        byte b3 = (byte) ($$b - 3);
                        byte b4 = (byte) (b3 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b3, b4, b4, objArr5);
                        obj2 = cls4.getMethod((String) objArr5[i5], cls);
                        map2.put(-939298638, obj2);
                    }
                    cArr3[i10] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    i8 = i10 + 1;
                }
                length = i4;
                cArr4 = cArr2;
                cArr5 = cArr3;
                cls2 = cls;
                i7 = i5;
            }
            cArr4 = cArr5;
        } else {
            i2 = 2;
            j = 0;
        }
        Class cls5 = cls2;
        int i11 = i7;
        Object[] objArr6 = {Integer.valueOf(get)};
        Map map3 = removeParam.visaSchemeConfiguration;
        Object obj3 = map3.get(-1598850155);
        if (obj3 == null) {
            Class cls6 = (Class) removeParam.initialize(72 - (ExpandableListView.getPackedPositionForChild(i11, i11) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i11, i11) == j ? 0 : -1)), (char) (Color.alpha(i11) + 7530), 2490 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
            byte b5 = (byte) ($$b - 4);
            byte b6 = b5;
            Object[] objArr7 = new Object[1];
            b(b5, b6, b6, objArr7);
            obj3 = cls6.getMethod((String) objArr7[0], cls5);
            map3.put(-1598850155, obj3);
        }
        int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
        if (ThreeDS2ServiceInitializationCallback) {
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr6 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i12 = onerror.getWarnings;
                int i13 = onerror.ThreeDS2ServiceInstance;
                if (i12 >= i13) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                $10 = ($11 + 93) % 128;
                cArr6[i12] = (char) (cArr4[bArr2[(i13 - 1) - i12] + i] - intValue);
                Object[] objArr8 = new Object[i2];
                objArr8[1] = onerror;
                objArr8[0] = onerror;
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(73542081);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(KeyEvent.keyCodeFromString("") + 48, (char) TextUtils.indexOf("", ""), TextUtils.lastIndexOf("", '0', 0) + 11442)).getMethod("k", Object.class, Object.class);
                    map4.put(73542081, obj4);
                }
                ((Method) obj4).invoke(null, objArr8);
                $10 = ($11 + 73) % 128;
                i2 = 2;
            }
        } else if (initialize) {
            int i14 = $11 + 13;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                int length3 = charArray.length;
                onerror.ThreeDS2ServiceInstance = length3;
                cArr = new char[length3];
                i3 = 1;
            } else {
                int length4 = charArray.length;
                onerror.ThreeDS2ServiceInstance = length4;
                cArr = new char[length4];
                i3 = 0;
            }
            onerror.getWarnings = i3;
            while (true) {
                int i15 = onerror.getWarnings;
                int i16 = onerror.ThreeDS2ServiceInstance;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i15] = (char) (cArr4[charArray[(i16 - 1) - i15] - i] - intValue);
                Object[] objArr9 = {onerror, onerror};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(73542081);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11441)).getMethod("k", Object.class, Object.class);
                    map5.put(73542081, obj5);
                }
                ((Method) obj5).invoke(null, objArr9);
            }
        } else {
            int length5 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length5;
            char[] cArr7 = new char[length5];
            onerror.getWarnings = 0;
            while (true) {
                int i17 = onerror.getWarnings;
                int i18 = onerror.ThreeDS2ServiceInstance;
                if (i17 >= i18) {
                    String str4 = new String(cArr7);
                    $11 = ($10 + 29) % 128;
                    objArr[0] = str4;
                    return;
                }
                cArr7[i17] = (char) (cArr4[iArr[(i18 - 1) - i17] - i] - intValue);
                onerror.getWarnings = i17 + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, Object[] objArr) {
        int i2;
        int i3 = 109 - b;
        int i4 = s * 4;
        int i5 = 4 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i5;
            int i8 = i4;
            i3 = (-i3) + i8;
            i5 = i7 + 1;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i5];
            int i9 = i5;
            i8 = i3;
            i3 = b2;
            bArr3 = bArr;
            i7 = i9;
            i3 = (-i3) + i8;
            i5 = i7 + 1;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{98, 4, -35, -97};
        $$b = 4;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFindListener
    public setInitialScale ThreeDS2ServiceInstance(String str, String str2, String str3, String str4) {
        Object obj;
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[1];
        a(null, null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, "\u0085\u0089\u0088\u0087\u0086\u0084\u0083\u0085\u0084\u0083\u0082\u0081", objArr);
        String intern = ((String) objArr[0]).intern();
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str3);
        Object[] objArr2 = new Object[1];
        a(null, null, TextUtils.getOffsetBefore("", 0) + 127, "\u0094\u0086\u0093\u0084\u0092\u0091\u0084\u0085\u0090\u008f\u008e\u008d\u008c\u008b\u008a", objArr2);
        m.append(((String) objArr2[0]).intern());
        hashMap.put(intern, m.toString());
        Object[] objArr3 = new Object[1];
        a(null, null, 127 - ExpandableListView.getPackedPositionGroup(0L), "\u0084\u0089\u0085\u008c\u008c\u0095", objArr3);
        hashMap.put(((String) objArr3[0]).intern(), str3);
        Object[] objArr4 = new Object[1];
        a(null, null, Color.argb(0, 0, 0, 0) + 127, "\u008d\u0084\u0097\u0083\u0085\u0096\u0086\u0084\u0083\u0085\u0084\u0083\u0082\u0081", objArr4);
        hashMap.put(((String) objArr4[0]).intern(), String.valueOf(oj.ThreeDS2ServiceInstance(str2)));
        Object[] objArr5 = new Object[1];
        a(null, null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), "\u009c\u009b\u0086\u0084\u0090\u0085\u0092\u009a\u0085\u0099\u0086\u0098", objArr5);
        hashMap.put(((String) objArr5[0]).intern(), this.ThreeDS2ServiceInstance);
        if (oj.initialize(str4)) {
            int i = getSDKVersion + 73;
            cleanup = i % 128;
            if (i % 2 != 0) {
                Object[] objArr6 = new Object[1];
                a(null, null, (-16777089) % Color.rgb(1, 0, 0), "\u0084\u0083\u0085\u0097\u0095\u0086\u008f\u0085\u0090\u009d", objArr6);
                obj = objArr6[0];
            } else {
                Object[] objArr7 = new Object[1];
                a(null, null, (-16777089) - Color.rgb(0, 0, 0), "\u0084\u0083\u0085\u0097\u0095\u0086\u008f\u0085\u0090\u009d", objArr7);
                obj = objArr7[0];
            }
            hashMap.put(((String) obj).intern(), str4);
            cleanup = (getSDKVersion + 87) % 128;
        }
        Object[] objArr8 = new Object[1];
        a(null, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0087 \u009f\u009e", objArr8);
        return new setAdapter(new setMapTrackballToArrowKeys.getWarnings(str, ((String) objArr8[0]).intern()).getWarnings(str2).ThreeDS2ServiceInstance(hashMap).ThreeDS2ServiceInstance(), this.getWarnings);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFindListener
    public setInitialScale getWarnings(String str, String str2, String str3) {
        getSDKVersion = (cleanup + 93) % 128;
        setInitialScale ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(str, str2, str3, null);
        int i = getSDKVersion + 101;
        cleanup = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFindListener
    public setInitialScale initialize(String str, boolean z) {
        Object[] objArr = new Object[1];
        a(null, null, 127 - View.MeasureSpec.getSize(0), "\u0087¢¡", objArr);
        setDataDirectorySuffix setdatadirectorysuffix = new setDataDirectorySuffix(new setMapTrackballToArrowKeys.getWarnings(str, ((String) objArr[0]).intern()).ThreeDS2ServiceInstance(), this.getWarnings, z);
        cleanup = (getSDKVersion + 9) % 128;
        return setdatadirectorysuffix;
    }
}
