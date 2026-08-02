package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class br extends setProperty {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int get;
    private static char[] getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2Service = 0;
        get = 1;
        getWarnings = new char[]{52877, 52839, 52875, 52844, 52834, 52891, 52834, 52833, 52832, 52835, 52833, 52925, 52889, 52834, 52839, 52844, 52845, 52839, 52836, 52891, 52844, 52839, 52888, 52873, 52855, 52891, 52869, 52891, 52844, 52895, 52844, 52878, 52786, 52787, 52785, 52795, 52799, 52798, 52797, 52785, 52789, 52797, 52792, 52787, 52796, 52792, 52799, 52793, 52795, 52799, 52797, 52793, 52740, 52793, 52796, 52797, 52788, 52787, 52796, 52797, 52797, 52784, 52798, 52795, 52793, 52737};
    }

    public br(Context context, jr jrVar) {
        super(context, jrVar);
    }

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
        $10 = ($11 + 47) % 128;
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
        char[] cArr6 = getWarnings;
        Class cls = Integer.TYPE;
        int i7 = 2;
        int i8 = 0;
        if (cArr6 != null) {
            int i9 = $11 + 93;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr6.length;
                cArr3 = new char[length];
            } else {
                length = cArr6.length;
                cArr3 = new char[length];
            }
            bArr = bArr3;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                int i12 = $10 + 81;
                int i13 = length;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr6[i11])};
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
                            Class cls2 = (Class) removeParam.initialize(48 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2294 - ImageFormat.getBitsPerPixel(i8));
                            Object[] objArr3 = new Object[1];
                            int i14 = i8;
                            b(i14, i14, i14, objArr3);
                            method = cls2.getMethod((String) objArr3[i14], cls);
                            map.put(-1866317650, method);
                        }
                        cArr4[i11] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
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
                    Object[] objArr4 = {Integer.valueOf(cArr5[i11])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-1866317650);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize(TextUtils.indexOf("", "", 0, 0) + 48, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2295);
                        Object[] objArr5 = new Object[1];
                        b(0, 0, 0, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-1866317650, obj2);
                    }
                    cArr4[i11] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                }
                i10 = i11 + 1;
                length = i13;
                cArr6 = cArr5;
                cArr3 = cArr4;
                i5 = i2;
                i8 = 0;
            }
            cArr6 = cArr3;
        } else {
            bArr = bArr3;
        }
        int i15 = i5;
        char[] cArr7 = new char[i4];
        System.arraycopy(cArr6, i3, cArr7, 0, i4);
        if (bArr != null) {
            $10 = ($11 + 19) % 128;
            char[] cArr8 = new char[i4];
            cleanupVar.get = 0;
            char c = 0;
            while (true) {
                int i16 = cleanupVar.get;
                if (i16 >= i4) {
                    break;
                }
                if (bArr[i16] == 1) {
                    char c2 = cArr7[i16];
                    Object[] objArr6 = new Object[i7];
                    objArr6[1] = Integer.valueOf(c);
                    objArr6[0] = Integer.valueOf(c2);
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(715226994);
                    if (obj3 != null) {
                        cArr = cArr7;
                        cArr2 = cArr8;
                    } else {
                        cArr = cArr7;
                        cArr2 = cArr8;
                        Class cls4 = (Class) removeParam.initialize(View.resolveSize(0, 0) + 85, (char) (25857 - KeyEvent.normalizeMetaState(0)), 1726 - TextUtils.getOffsetBefore("", 0));
                        Object[] objArr7 = new Object[1];
                        b(0, 1, 0, objArr7);
                        obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                        map3.put(715226994, obj3);
                    }
                    cArr2[i16] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    cArr = cArr7;
                    cArr2 = cArr8;
                    Object[] objArr8 = {Integer.valueOf(cArr[i16]), Integer.valueOf(c)};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(549300883);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(66 - TextUtils.indexOf("", ""), (char) (32825 - ExpandableListView.getPackedPositionType(0L)), 447 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("D", cls, cls);
                        map4.put(549300883, obj4);
                    }
                    cArr2[i16] = ((Character) ((Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr2[cleanupVar.get];
                Object[] objArr9 = {cleanupVar, cleanupVar};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(102334785);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(74 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 9820)).getMethod("I", Object.class, Object.class);
                    map5.put(102334785, obj5);
                }
                ((Method) obj5).invoke(null, objArr9);
                cArr7 = cArr;
                cArr8 = cArr2;
                i7 = 2;
            }
            cArr7 = cArr8;
        }
        if (i6 > 0) {
            char[] cArr9 = new char[i4];
            i = 0;
            System.arraycopy(cArr7, 0, cArr9, 0, i4);
            int i17 = i4 - i6;
            System.arraycopy(cArr9, 0, cArr7, i17, i6);
            System.arraycopy(cArr9, i6, cArr7, 0, i17);
        } else {
            i = 0;
        }
        if (z) {
            $10 = ($11 + 41) % 128;
            char[] cArr10 = new char[i4];
            cleanupVar.get = i;
            while (true) {
                int i18 = cleanupVar.get;
                if (i18 >= i4) {
                    break;
                }
                cArr10[i18] = cArr7[(i4 - i18) - 1];
                cleanupVar.get = i18 + 1;
            }
            cArr7 = cArr10;
        }
        if (i15 > 0) {
            $10 = ($11 + 53) % 128;
            cleanupVar.get = 0;
            while (true) {
                int i19 = cleanupVar.get;
                if (i19 >= i4) {
                    break;
                }
                int i20 = $11 + 93;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr7[i19] = (char) (cArr7[i19] + iArr[4]);
                } else {
                    cArr7[i19] = (char) (cArr7[i19] - iArr[2]);
                    i19++;
                }
                cleanupVar.get = i19;
            }
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = i * 2;
        byte[] bArr = $$a;
        int i6 = (i3 * 3) + 4;
        int i7 = 122 - (i2 * 57);
        byte[] bArr2 = new byte[1 - i5];
        int i8 = 0 - i5;
        if (bArr == null) {
            int i9 = i8;
            i4 = 0;
            i6++;
            i7 += -i9;
            bArr2[i4] = (byte) i7;
            if (i4 == i8) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i9 = bArr[i6];
            i4++;
            i6++;
            i7 += -i9;
            bArr2[i4] = (byte) i7;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i7;
            if (i4 == i8) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{126, 35, -39, 100};
        $$b = 24;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.writeReplace
    public /* bridge */ /* synthetic */ void ThreeDS2Service(setScroller setscroller) {
        ThreeDS2Service = (get + 37) % 128;
        super.ThreeDS2Service(setscroller);
        int i = ThreeDS2Service + 107;
        get = i % 128;
        if (i % 2 == 0) {
            int i2 = 42 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public void aX_(CheckBox checkBox) {
        Object obj;
        int i = ThreeDS2Service + 27;
        get = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            a(true, new int[]{31, 35, 112, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(false, new int[]{31, 35, 112, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", objArr2);
            obj = objArr2[0];
        }
        getWarnings(checkBox, ((String) obj).intern());
        get = (ThreeDS2Service + 61) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public String get() {
        get = (ThreeDS2Service + 109) % 128;
        Object[] objArr = new Object[1];
        a(true, new int[]{0, 31, 23, 24}, null, objArr);
        String intern = ((String) objArr[0]).intern();
        get = (ThreeDS2Service + 91) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.containsValue
    public /* bridge */ /* synthetic */ void getWarnings(eq eqVar) {
        int i = get + 103;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        super.getWarnings(eqVar);
        if (i2 != 0) {
            int i3 = 1 / 0;
        }
        int i4 = ThreeDS2Service + 109;
        get = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public replace ThreeDS2Service(replace replaceVar) {
        en enVar = new en(replaceVar, replaceAll.initialize);
        int i = ThreeDS2Service + 39;
        get = i % 128;
        if (i % 2 != 0) {
            return enVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.computeIfPresent
    public /* synthetic */ replace getWarnings(replace replaceVar) {
        int i = get + 15;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return super.getWarnings(replaceVar);
        }
        super.getWarnings(replaceVar);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty, com.netcetera.threeds.sdk.infrastructure.containsValue
    public /* synthetic */ void getWarnings(er erVar) {
        int i = get + 115;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        super.getWarnings(erVar);
        if (i2 != 0) {
            throw null;
        }
        ThreeDS2Service = (get + 117) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public String getWarnings(setScroller setscroller) {
        get = (ThreeDS2Service + 27) % 128;
        String jcbConfiguration = setscroller.jcbConfiguration();
        int i = ThreeDS2Service + 93;
        get = i % 128;
        if (i % 2 != 0) {
            return jcbConfiguration;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public replace get(replace replaceVar) {
        en enVar = new en(replaceVar, replaceAll.get);
        ThreeDS2Service = (get + 103) % 128;
        return enVar;
    }
}
