package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Map;

/* loaded from: classes5.dex */
public class qv {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInstance;
    private static char[] get;
    private static int getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getWarnings = 0;
        ThreeDS2ServiceInstance = 1;
        get = new char[]{52910, 52862, 52848};
    }

    public static void ThreeDS2Service(byte[] bArr, String str) {
        int i = (ThreeDS2ServiceInstance + 93) % 128;
        getWarnings = i;
        if (bArr != null) {
            throw new rn(Recorder$$ExternalSyntheticOutline2.m("An explicit content encryption key cannot be used with ", str));
        }
        ThreeDS2ServiceInstance = (i + 3) % 128;
    }

    public static void ThreeDS2ServiceInstance(Key key, String str, int i) {
        getWarnings = (ThreeDS2ServiceInstance + 67) % 128;
        initialize(key);
        String algorithm = key.getAlgorithm();
        Object[] objArr = new Object[1];
        a(false, new int[]{0, 3, 77, 2}, "\u0000\u0000\u0000", objArr);
        if (!((String) objArr[0]).intern().equals(algorithm)) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Invalid key for JWE ", str, ", expected an ");
            Object[] objArr2 = new Object[1];
            a(false, new int[]{0, 3, 77, 2}, "\u0000\u0000\u0000", objArr2);
            m3m.append(((String) objArr2[0]).intern());
            m3m.append(" key but an ");
            m3m.append(algorithm);
            m3m.append(" key was provided.");
            throw new rn(m3m.toString());
        }
        if (key.getEncoded() != null) {
            getWarnings = (ThreeDS2ServiceInstance + 17) % 128;
            int length = key.getEncoded().length;
            if (length != i) {
                StringBuilder m3m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Invalid key for JWE ", str, ", expected a ");
                m3m2.append(rf.get(i));
                m3m2.append(" bit key but a ");
                m3m2.append(rf.get(length));
                m3m2.append(" bit key was provided.");
                throw new rn(m3m2.toString());
            }
        }
        int i2 = ThreeDS2ServiceInstance + 77;
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        byte[] bArr;
        int i;
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        int length;
        char[] cArr4;
        int i2;
        char[] cArr5;
        int i3;
        char[] cArr6;
        int i4;
        Object method;
        String str2 = str;
        byte[] bArr2 = str2;
        if (str2 != null) {
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        cleanup cleanupVar = new cleanup();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr7 = get;
        Class cls = Integer.TYPE;
        int i9 = 2;
        byte b = -1;
        if (cArr7 != null) {
            int i10 = $10 + 99;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = cArr7.length;
                cArr4 = new char[length];
                bArr = bArr3;
                i2 = 1;
            } else {
                length = cArr7.length;
                cArr4 = new char[length];
                bArr = bArr3;
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    int i11 = i2;
                    Object[] objArr2 = {Integer.valueOf(cArr7[i2])};
                    int i12 = length;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cArr5 = cArr4;
                        method = obj;
                        i3 = i7;
                        i4 = i8;
                        cArr6 = cArr7;
                    } else {
                        cArr5 = cArr4;
                        i3 = i7;
                        cArr6 = cArr7;
                        Class cls2 = (Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getTouchSlop() >> 8) + 2295);
                        Object[] objArr3 = new Object[1];
                        i4 = i8;
                        b((byte) 0, b, 0, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-1866317650, method);
                    }
                    cArr5[i11] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i2 = i11 + 1;
                    length = i12;
                    cArr4 = cArr5;
                    cArr7 = cArr6;
                    i7 = i3;
                    i8 = i4;
                    b = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr7 = cArr4;
        } else {
            bArr = bArr3;
        }
        int i13 = i7;
        int i14 = i8;
        char[] cArr8 = new char[i6];
        System.arraycopy(cArr7, i5, cArr8, 0, i6);
        if (bArr != null) {
            char[] cArr9 = new char[i6];
            cleanupVar.get = 0;
            $10 = ($11 + 5) % 128;
            char c = 0;
            while (true) {
                int i15 = cleanupVar.get;
                if (i15 >= i6) {
                    break;
                }
                if (bArr[i15] == 1) {
                    char c2 = cArr8[i15];
                    Object[] objArr4 = new Object[i9];
                    objArr4[1] = Integer.valueOf(c);
                    objArr4[0] = Integer.valueOf(c2);
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 != null) {
                        cArr2 = cArr8;
                        cArr3 = cArr9;
                    } else {
                        cArr2 = cArr8;
                        Class cls3 = (Class) removeParam.initialize(85 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 25857), 1726 - TextUtils.getCapsMode("", 0, 0));
                        Object[] objArr5 = new Object[1];
                        cArr3 = cArr9;
                        b((byte) 0, (byte) -1, 1, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls, cls);
                        map2.put(715226994, obj2);
                    }
                    cArr3[i15] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    cArr2 = cArr8;
                    cArr3 = cArr9;
                    Object[] objArr6 = {Integer.valueOf(cArr2[i15]), Integer.valueOf(c)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(66 - TextUtils.getTrimmedLength(""), (char) (32825 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 447)).getMethod("D", cls, cls);
                        map3.put(549300883, obj3);
                    }
                    cArr3[i15] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr3[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(102334785);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(TextUtils.getCapsMode("", 0, 0) + 74, (char) KeyEvent.keyCodeFromString(""), 9820 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("I", Object.class, Object.class);
                    map4.put(102334785, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                cArr8 = cArr2;
                cArr9 = cArr3;
                i9 = 2;
            }
            cArr8 = cArr9;
        }
        if (i14 > 0) {
            char[] cArr10 = new char[i6];
            System.arraycopy(cArr8, 0, cArr10, 0, i6);
            int i16 = i6 - i14;
            System.arraycopy(cArr10, 0, cArr8, i16, i14);
            System.arraycopy(cArr10, i14, cArr8, 0, i16);
        }
        if (z) {
            int i17 = $10 + 13;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr = new char[i6];
                i = 1;
                cleanupVar.get = 1;
            } else {
                i = 1;
                cArr = new char[i6];
                cleanupVar.get = 0;
            }
            while (true) {
                int i18 = cleanupVar.get;
                if (i18 >= i6) {
                    break;
                }
                cArr[i18] = cArr8[(i6 - i18) - i];
                cleanupVar.get = i18 + 1;
            }
            $11 = ($10 + 59) % 128;
            cArr8 = cArr;
        }
        if (i13 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i19 = cleanupVar.get;
                if (i19 >= i6) {
                    break;
                }
                cArr8[i19] = (char) (cArr8[i19] - iArr[2]);
                cleanupVar.get = i19 + 1;
                $10 = ($11 + 15) % 128;
            }
        }
        objArr[0] = new String(cArr8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 122 - (i * 57);
        byte[] bArr = $$a;
        int i5 = b2 + 4;
        int i6 = 1 - (b * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i5;
            int i9 = i5 + (-i7);
            int i10 = i8;
            i4 = i9;
            i5 = i10;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i5 + 1;
            i7 = bArr[i11];
            int i12 = i4;
            i8 = i11;
            i5 = i12;
            int i92 = i5 + (-i7);
            int i102 = i8;
            i4 = i92;
            i5 = i102;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.qv.ThreeDS2ServiceInstance = (r0 + 45) % 128;
        r3 = ((java.security.interfaces.RSAKey) r3).getModulus().bitLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r3 < 2048) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        throw new com.netcetera.threeds.sdk.infrastructure.rn(defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0.m(r3, "An RSA key of size 2048 bits or larger MUST be used with the all JOSE RSA algorithms (given key was only ", " bits)."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0013, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        throw new com.netcetera.threeds.sdk.infrastructure.rn("The RSA key must not be null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if ((r3 instanceof java.security.interfaces.RSAKey) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void get(Key key) {
        int i = getWarnings;
        int i2 = i + 53;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
    }

    public static void init$0() {
        $$a = new byte[]{47, -124, 44, 16};
        $$b = 82;
    }

    public static void initialize(Key key) {
        int i = ThreeDS2ServiceInstance + 59;
        int i2 = i % 128;
        getWarnings = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (key == null) {
            throw new rn("The key must not be null.");
        }
        ThreeDS2ServiceInstance = (i2 + 107) % 128;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        Key key = (Key) objArr[0];
        Class cls = (Class) objArr[1];
        int i = getWarnings + 119;
        ThreeDS2ServiceInstance = i % 128;
        try {
            if (i % 2 != 0) {
                initialize(key);
                return (Key) cls.cast(key);
            }
            initialize(key);
            throw null;
        } catch (ClassCastException e) {
            throw new rn("Invalid key " + e);
        }
    }

    public static <K extends Key> K ThreeDS2ServiceInstance(Key key, Class<K> cls) {
        return (K) ThreeDS2Service(new Object[]{key, cls}, -486368173, 486368173, (int) System.currentTimeMillis());
    }
}
