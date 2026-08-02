package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CheckBox;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class bp extends setProperty {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static int get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        get = 0;
        ThreeDS2ServiceInstance = 1;
        ThreeDS2Service = new char[]{52911, 52836, 52836, 52848, 52850, 52850, 52841, 52846, 52845, 52840, 52859, 52851, 52851, 52862, 52861, 52862, 52862, 52835, 52833, 52857, 52862, 52834, 52844, 52857, 52856, 52857, 52841, 52854, 52840, 53191, 53247, 53233, 53236, 53238, 53235, 53235, 53234, 53225, 53236, 53242, 53247, 53235, 53224, 53236, 53242, 53241, 53242, 53242, 53236, 53225, 53246, 53235, 53227, 53239, 53235, 53236, 53237, 53233, 53239, 53225, 53224};
    }

    public bp(Context context, jr jrVar) {
        super(context, jrVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        r0 = r0[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017c, code lost:
    
        r1 = new java.lang.Object[r31];
        r1[1] = java.lang.Integer.valueOf(r7);
        r1[0] = java.lang.Integer.valueOf(r0);
        r0 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r2 = r0.get(715226994);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0194, code lost:
    
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d7, code lost:
    
        r5[r8] = ((java.lang.Character) ((java.lang.reflect.Method) r2).invoke(null, r1)).charValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0197, code lost:
    
        r2 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 85, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 25857), (-16775490) - android.graphics.Color.rgb(0, 0, 0));
        r6 = new java.lang.Object[1];
        b(0, 0, (byte) 1, r6);
        r2 = r2.getMethod((java.lang.String) r6[0], r15, r15);
        r0.put(715226994, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        byte[] bArr;
        int i;
        char[] cArr;
        char[] cArr2;
        int length;
        char[] cArr3;
        char[] cArr4;
        int i2;
        char[] cArr5;
        Object method;
        String str2 = str;
        $10 = ($11 + 105) % 128;
        byte[] bArr2 = str2;
        if (str2 != null) {
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        cleanup cleanupVar = new cleanup();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr6 = ThreeDS2Service;
        int i7 = 2;
        char c = '0';
        Class cls = Integer.TYPE;
        if (cArr6 != null) {
            int i8 = $10 + 33;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr6.length;
                cArr3 = new char[length];
            } else {
                length = cArr6.length;
                cArr3 = new char[length];
            }
            bArr = bArr3;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                int i11 = $11 + 29;
                int i12 = length;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr6[i10])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-1866317650);
                        if (obj != null) {
                            cArr4 = cArr3;
                            i2 = i5;
                            method = obj;
                            cArr5 = cArr6;
                        } else {
                            cArr4 = cArr3;
                            i2 = i5;
                            cArr5 = cArr6;
                            Class cls2 = (Class) removeParam.initialize(48 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), 2294 - ((byte) KeyEvent.getModifierMetaStateMask()));
                            Object[] objArr3 = new Object[1];
                            b(0, 0, (byte) 0, objArr3);
                            method = cls2.getMethod((String) objArr3[0], cls);
                            map.put(-1866317650, method);
                        }
                        cArr4[i10] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i9 = i10;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    cArr4 = cArr3;
                    i2 = i5;
                    cArr5 = cArr6;
                    Object[] objArr4 = {Integer.valueOf(cArr5[i10])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-1866317650);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize((Process.myPid() >> 22) + 48, (char) ((-1) - TextUtils.indexOf("", c, 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2295);
                        Object[] objArr5 = new Object[1];
                        b(0, 0, (byte) 0, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-1866317650, obj2);
                    }
                    cArr4[i10] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    i9 = i10 + 1;
                }
                length = i12;
                cArr6 = cArr5;
                cArr3 = cArr4;
                i5 = i2;
                c = '0';
            }
            cArr6 = cArr3;
        } else {
            bArr = bArr3;
        }
        int i13 = i5;
        char[] cArr7 = new char[i4];
        System.arraycopy(cArr6, i3, cArr7, 0, i4);
        if (bArr != null) {
            char[] cArr8 = new char[i4];
            cleanupVar.get = 0;
            char c2 = 0;
            while (true) {
                int i14 = cleanupVar.get;
                if (i14 >= i4) {
                    cArr7 = cArr8;
                    break;
                }
                if (bArr[i14] == 1) {
                    int i15 = $10 + 51;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        break;
                    }
                    Object[] objArr6 = {Integer.valueOf(cArr7[i14]), Integer.valueOf(c2)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(715226994);
                    if (obj3 != null) {
                        cArr = cArr7;
                        cArr2 = cArr8;
                    } else {
                        cArr = cArr7;
                        cArr2 = cArr8;
                        Class cls4 = (Class) removeParam.initialize(85 - TextUtils.getTrimmedLength(""), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 25858), 1727 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        Object[] objArr7 = new Object[1];
                        b(0, 0, (byte) 1, objArr7);
                        obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                        map3.put(715226994, obj3);
                    }
                    cArr2[i14] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    cArr = cArr7;
                    cArr2 = cArr8;
                    Object[] objArr8 = {Integer.valueOf(cArr[i14]), Integer.valueOf(c2)};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(549300883);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(View.resolveSizeAndState(0, 0, 0) + 66, (char) (32825 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 447)).getMethod("D", cls, cls);
                        map4.put(549300883, obj4);
                    }
                    cArr2[i14] = ((Character) ((Method) obj4).invoke(null, objArr8)).charValue();
                }
                c2 = cArr2[cleanupVar.get];
                Object[] objArr9 = {cleanupVar, cleanupVar};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(102334785);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(TextUtils.getOffsetBefore("", 0) + 74, (char) (ViewConfiguration.getTouchSlop() >> 8), 9820 - TextUtils.getOffsetAfter("", 0))).getMethod("I", Object.class, Object.class);
                    map5.put(102334785, obj5);
                }
                ((Method) obj5).invoke(null, objArr9);
                cArr8 = cArr2;
                cArr7 = cArr;
                i7 = 2;
            }
        }
        if (i6 > 0) {
            char[] cArr9 = new char[i4];
            i = 0;
            System.arraycopy(cArr7, 0, cArr9, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr9, 0, cArr7, i16, i6);
            System.arraycopy(cArr9, i6, cArr7, 0, i16);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr10 = new char[i4];
            cleanupVar.get = i;
            while (true) {
                int i17 = cleanupVar.get;
                if (i17 >= i4) {
                    break;
                }
                cArr10[i17] = cArr7[(i4 - i17) - 1];
                cleanupVar.get = i17 + 1;
            }
            cArr7 = cArr10;
        }
        if (i13 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i18 = cleanupVar.get;
                if (i18 >= i4) {
                    break;
                }
                cArr7[i18] = (char) (cArr7[i18] - iArr[2]);
                cleanupVar.get = i18 + 1;
            }
        }
        String str3 = new String(cArr7);
        $11 = ($10 + 25) % 128;
        objArr[0] = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 3 - (i * 4);
        int i5 = 122 - (b * 57);
        int i6 = i2 * 2;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i6;
            int i10 = (-i4) + i9;
            int i11 = i7;
            i5 = i10;
            i4 = i11;
            bArr = bArr3;
            i3 = i8;
            int i12 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i13 = i5;
            i7 = i12;
            i4 = bArr[i12];
            bArr3 = bArr;
            i9 = i13;
            int i102 = (-i4) + i9;
            int i112 = i7;
            i5 = i102;
            i4 = i112;
            bArr = bArr3;
            i3 = i8;
            int i122 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            int i1222 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{78, -37, -92, -118};
        $$b = 51;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.writeReplace
    public /* bridge */ /* synthetic */ void ThreeDS2Service(setScroller setscroller) {
        int i = get + 105;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        super.ThreeDS2Service(setscroller);
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public void aX_(CheckBox checkBox) {
        Object obj;
        int i = ThreeDS2ServiceInstance + 97;
        get = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            a(false, new int[]{28, 33, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(true, new int[]{28, 33, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr2);
            obj = objArr2[0];
        }
        getWarnings(checkBox, ((String) obj).intern());
        ThreeDS2ServiceInstance = (get + 65) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public String get() {
        Object obj;
        int i = ThreeDS2ServiceInstance + 99;
        get = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            a(false, new int[]{0, 28, 43, 27}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(true, new int[]{0, 28, 43, 27}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public String getWarnings(setScroller setscroller) {
        ThreeDS2ServiceInstance = (get + 93) % 128;
        String schemeId = setscroller.getSchemeId();
        int i = ThreeDS2ServiceInstance + 57;
        get = i % 128;
        if (i % 2 == 0) {
            return schemeId;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public replace ThreeDS2Service(replace replaceVar) {
        eo eoVar = new eo(replaceVar, putIfAbsent.initialize);
        get = (ThreeDS2ServiceInstance + 31) % 128;
        return eoVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.containsValue
    public /* bridge */ /* synthetic */ void getWarnings(eq eqVar) {
        get = (ThreeDS2ServiceInstance + 5) % 128;
        super.getWarnings(eqVar);
        get = (ThreeDS2ServiceInstance + 111) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.containsValue
    public /* synthetic */ void getWarnings(er erVar) {
        int i = ThreeDS2ServiceInstance + 87;
        get = i % 128;
        int i2 = i % 2;
        super.getWarnings(erVar);
        if (i2 != 0) {
            throw null;
        }
        ThreeDS2ServiceInstance = (get + 47) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.computeIfPresent
    public /* bridge */ /* synthetic */ replace getWarnings(replace replaceVar) {
        ThreeDS2ServiceInstance = (get + 69) % 128;
        replace warnings = super.getWarnings(replaceVar);
        ThreeDS2ServiceInstance = (get + 45) % 128;
        return warnings;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public replace get(replace replaceVar) {
        eo eoVar = new eo(replaceVar, putIfAbsent.getWarnings);
        ThreeDS2ServiceInstance = (get + 19) % 128;
        return eoVar;
    }
}
