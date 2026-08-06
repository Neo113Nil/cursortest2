package defpackage;

import com.combinations.level.experts.core.domain.model.Side;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vd0 implements nx0 {
    public final int[] AvO7iQsrTN;
    public final mc1 E7jCp8Ls;
    public final boolean EljAMC1QTz;
    public final int[] GWasM1elztuh;
    public final oj0 JFJ3QoxA;
    public final WRKkgoJXwDn OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final oc0 XnEVoBF0td1l;
    public final Object[] Yi7zF1RB1;
    public final int encWxUiV2;
    public final int mOu10nynGul;
    public final va0 rQPn8YBR;
    public final int xqGvceK5x;
    public static final int[] uFEq9NpZ = new int[0];
    public static final Unsafe iwATDS1i01k = wc1.mOu10nynGul();

    public vd0(int[] iArr, Object[] objArr, int i, int i2, WRKkgoJXwDn wRKkgoJXwDn, int[] iArr2, int i3, int i4, oj0 oj0Var, va0 va0Var, mc1 mc1Var, ar arVar, oc0 oc0Var) {
        this.GWasM1elztuh = iArr;
        this.Yi7zF1RB1 = objArr;
        this.X1lG3V04pd = i;
        this.xqGvceK5x = i2;
        this.EljAMC1QTz = wRKkgoJXwDn instanceof ay;
        this.AvO7iQsrTN = iArr2;
        this.encWxUiV2 = i3;
        this.mOu10nynGul = i4;
        this.JFJ3QoxA = oj0Var;
        this.rQPn8YBR = va0Var;
        this.E7jCp8Ls = mc1Var;
        this.OOA6hdeuvCS = wRKkgoJXwDn;
        this.XnEVoBF0td1l = oc0Var;
    }

    public static Field AEn1Rrio(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int DmJncFq5(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean WIEu4Ya2g8(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ay) {
            return ((ay) obj).AvO7iQsrTN();
        }
        return true;
    }

    public static int WRKkgoJXwDn(long j, Object obj) {
        return ((Integer) wc1.X1lG3V04pd.encWxUiV2(j, obj)).intValue();
    }

    public static long WdrkLMV3xh(int i) {
        return i & 1048575;
    }

    public static long arNh8D4Z5gB(long j, Object obj) {
        return ((Long) wc1.X1lG3V04pd.encWxUiV2(j, obj)).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vd0 lv06NcmrQ(us0 us0Var, oj0 oj0Var, va0 va0Var, mc1 mc1Var, ar arVar, oc0 oc0Var) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        Class<?> cls;
        int i19;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field AEn1Rrio;
        char charAt10;
        int i25;
        int i26;
        Object obj;
        Field AEn1Rrio2;
        Object obj2;
        Field AEn1Rrio3;
        int i27;
        char charAt11;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        String str = us0Var.Yi7zF1RB1;
        int length = str.length();
        int i31 = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i34 = charAt15 & 8191;
            int i35 = 13;
            while (true) {
                i30 = i33 + 1;
                charAt14 = str.charAt(i33);
                if (charAt14 < 55296) {
                    break;
                }
                i34 |= (charAt14 & 8191) << i35;
                i35 += 13;
                i33 = i30;
            }
            charAt15 = i34 | (charAt14 << i35);
            i33 = i30;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = uFEq9NpZ;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt16 = str.charAt(i33);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    charAt9 = str.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                charAt16 = i37 | (charAt9 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int charAt17 = str.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    charAt8 = str.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                charAt17 = i40 | (charAt8 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int charAt18 = str.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    charAt7 = str.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                charAt18 = i43 | (charAt7 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int charAt19 = str.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    charAt6 = str.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                charAt19 = i46 | (charAt6 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            charAt = str.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    charAt5 = str.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                charAt = i49 | (charAt5 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int charAt20 = str.charAt(i48);
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    charAt4 = str.charAt(i51);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                charAt20 = i52 | (charAt4 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int charAt21 = str.charAt(i51);
            if (charAt21 >= 55296) {
                int i55 = charAt21 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    charAt3 = str.charAt(i54);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i55 |= (charAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                charAt21 = i55 | (charAt3 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int charAt22 = str.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    charAt2 = str.charAt(i57);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i58 |= (charAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                charAt22 = i58 | (charAt2 << i59);
                i57 = i8;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i60 = (charAt16 * 2) + charAt17;
            int i61 = charAt20;
            i2 = charAt18;
            i3 = i61;
            i4 = charAt16;
            i33 = i57;
            iArr = iArr2;
            i5 = charAt19;
            i6 = i60;
            i7 = charAt22;
        }
        Unsafe unsafe = iwATDS1i01k;
        Object[] objArr = us0Var.X1lG3V04pd;
        Class<?> cls2 = us0Var.GWasM1elztuh.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i62 = i7 + i3;
        int i63 = i62;
        int i64 = i7;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int charAt23 = str.charAt(i33);
            if (charAt23 >= i31) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i29 = i69 + 1;
                    charAt13 = str.charAt(i69);
                    i16 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i68 |= (charAt13 & 8191) << i70;
                    i70 += 13;
                    i69 = i29;
                    length = i16;
                }
                charAt23 = i68 | (charAt13 << i70);
                i17 = i29;
            } else {
                i16 = length;
                i17 = i67;
            }
            int i71 = i17 + 1;
            int charAt24 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i72 = charAt24 & 8191;
                int i73 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt12 = str.charAt(i71);
                    if (charAt12 < c) {
                        break;
                    }
                    i72 |= (charAt12 & 8191) << i73;
                    i73 += 13;
                    i71 = i28;
                    c = 55296;
                }
                charAt24 = i72 | (charAt12 << i73);
                i71 = i28;
            }
            int i74 = charAt24 & 255;
            int i75 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int[] iArr4 = iArr3;
            if (i74 >= 51) {
                int i76 = i71 + 1;
                int charAt25 = str.charAt(i71);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i77 = charAt25 & 8191;
                    int i78 = 13;
                    while (true) {
                        i27 = i76 + 1;
                        charAt11 = str.charAt(i76);
                        if (charAt11 < c2) {
                            break;
                        }
                        i77 |= (charAt11 & 8191) << i78;
                        i78 += 13;
                        i76 = i27;
                        c2 = 55296;
                    }
                    charAt25 = i77 | (charAt11 << i78);
                    i76 = i27;
                }
                int i79 = i74 - 51;
                int i80 = i76;
                if (i79 == 9 || i79 == 17) {
                    i26 = i6 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i79 == 12) {
                        int GWasM1elztuh = us0Var.GWasM1elztuh();
                        if (GWasM1elztuh == 0) {
                            throw null;
                        }
                        if ((GWasM1elztuh == 1) || (charAt24 & 2048) != 0) {
                            i26 = i6 + 1;
                            objArr2[((i66 / 3) * 2) + 1] = objArr3[i6];
                        }
                    }
                    int i81 = charAt25 * 2;
                    obj = objArr3[i81];
                    if (obj instanceof Field) {
                        AEn1Rrio2 = AEn1Rrio(cls2, (String) obj);
                        objArr3[i81] = AEn1Rrio2;
                    } else {
                        AEn1Rrio2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(AEn1Rrio2);
                    int i82 = i81 + 1;
                    obj2 = objArr3[i82];
                    if (obj2 instanceof Field) {
                        AEn1Rrio3 = AEn1Rrio(cls2, (String) obj2);
                        objArr3[i82] = AEn1Rrio3;
                    } else {
                        AEn1Rrio3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(AEn1Rrio3);
                    int i83 = i4;
                    i20 = objectFieldOffset3;
                    i24 = objectFieldOffset2;
                    i18 = i83;
                    i23 = i6;
                    i21 = i80;
                    i22 = 0;
                    cls = cls2;
                }
                i6 = i26;
                int i812 = charAt25 * 2;
                obj = objArr3[i812];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(AEn1Rrio2);
                int i822 = i812 + 1;
                obj2 = objArr3[i822];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(AEn1Rrio3);
                int i832 = i4;
                i20 = objectFieldOffset32;
                i24 = objectFieldOffset22;
                i18 = i832;
                i23 = i6;
                i21 = i80;
                i22 = 0;
                cls = cls2;
            } else {
                int i84 = i6 + 1;
                Field AEn1Rrio4 = AEn1Rrio(cls2, (String) objArr3[i6]);
                if (i74 == 9 || i74 == 17) {
                    i18 = i4;
                    objArr2[((i66 / 3) * 2) + 1] = AEn1Rrio4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = i4;
                        i25 = i6 + 2;
                        objArr2[((i66 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = i4;
                        if (us0Var.GWasM1elztuh() == 1 || (charAt24 & 2048) != 0) {
                            i25 = i6 + 2;
                            objArr2[((i66 / 3) * 2) + 1] = objArr3[i84];
                        }
                    } else if (i74 == 50) {
                        int i85 = i64 + 1;
                        iArr[i64] = i66;
                        int i86 = (i66 / 3) * 2;
                        int i87 = i6 + 2;
                        objArr2[i86] = objArr3[i84];
                        if ((charAt24 & 2048) != 0) {
                            i19 = i6 + 3;
                            objArr2[i86 + 1] = objArr3[i87];
                            i18 = i4;
                            cls = cls2;
                            i64 = i85;
                        } else {
                            cls = cls2;
                            i19 = i87;
                            i64 = i85;
                            i18 = i4;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(AEn1Rrio4);
                        if ((charAt24 & 4096) != 0 || i74 > 17) {
                            i20 = 1048575;
                            i21 = i71;
                            i22 = 0;
                        } else {
                            int i88 = i71 + 1;
                            int charAt26 = str.charAt(i71);
                            if (charAt26 >= 55296) {
                                int i89 = charAt26 & 8191;
                                int i90 = 13;
                                while (true) {
                                    i21 = i88 + 1;
                                    charAt10 = str.charAt(i88);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i89 |= (charAt10 & 8191) << i90;
                                    i90 += 13;
                                    i88 = i21;
                                }
                                charAt26 = i89 | (charAt10 << i90);
                            } else {
                                i21 = i88;
                            }
                            int i91 = (charAt26 / 32) + (i18 * 2);
                            Object obj3 = objArr3[i91];
                            if (obj3 instanceof Field) {
                                AEn1Rrio = (Field) obj3;
                            } else {
                                AEn1Rrio = AEn1Rrio(cls, (String) obj3);
                                objArr3[i91] = AEn1Rrio;
                            }
                            i20 = (int) unsafe.objectFieldOffset(AEn1Rrio);
                            i22 = charAt26 % 32;
                        }
                        if (i74 >= 18 || i74 > 49) {
                            i23 = i19;
                            i24 = objectFieldOffset;
                        } else {
                            iArr[i63] = objectFieldOffset;
                            i23 = i19;
                            i24 = objectFieldOffset;
                            i63++;
                        }
                    } else {
                        i18 = i4;
                    }
                    i19 = i25;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(AEn1Rrio4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i20 = 1048575;
                    i21 = i71;
                    i22 = 0;
                    if (i74 >= 18) {
                    }
                    i23 = i19;
                    i24 = objectFieldOffset;
                }
                cls = cls2;
                i19 = i84;
                objectFieldOffset = (int) unsafe.objectFieldOffset(AEn1Rrio4);
                if ((charAt24 & 4096) != 0) {
                }
                i20 = 1048575;
                i21 = i71;
                i22 = 0;
                if (i74 >= 18) {
                }
                i23 = i19;
                i24 = objectFieldOffset;
            }
            int i92 = i66 + 1;
            iArr4[i66] = i75;
            int i93 = i66 + 2;
            String str2 = str;
            iArr4[i92] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i24;
            i66 += 3;
            iArr4[i93] = (i22 << 20) | i20;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i16;
            i4 = i18;
            i33 = i21;
            i31 = 55296;
            i6 = i23;
            iArr3 = iArr4;
        }
        return new vd0(iArr3, objArr2, i2, i5, us0Var.GWasM1elztuh, iArr, i7, i62, oj0Var, va0Var, mc1Var, arVar, oc0Var);
    }

    public final void A1EKNP6CxJ(Object obj, int i, WRKkgoJXwDn wRKkgoJXwDn) {
        iwATDS1i01k.putObject(obj, HFYAaqMd6(i) & 1048575, wRKkgoJXwDn);
        YZjbz8VdP5(i, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (defpackage.ox0.E7jCp8Ls(r5.encWxUiV2(r7, r12), r5.encWxUiV2(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.AvO7iQsrTN(r7, r12) == r5.AvO7iQsrTN(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.EljAMC1QTz(r7, r12) == r5.EljAMC1QTz(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.AvO7iQsrTN(r7, r12) == r5.AvO7iQsrTN(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.EljAMC1QTz(r7, r12) == r5.EljAMC1QTz(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.EljAMC1QTz(r7, r12) == r5.EljAMC1QTz(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.EljAMC1QTz(r7, r12) == r5.EljAMC1QTz(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (defpackage.ox0.E7jCp8Ls(r5.encWxUiV2(r7, r12), r5.encWxUiV2(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (defpackage.ox0.E7jCp8Ls(r5.encWxUiV2(r7, r12), r5.encWxUiV2(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (defpackage.ox0.E7jCp8Ls(r5.encWxUiV2(r7, r12), r5.encWxUiV2(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.X1lG3V04pd(r7, r12) == r5.X1lG3V04pd(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.EljAMC1QTz(r7, r12) == r5.EljAMC1QTz(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.AvO7iQsrTN(r7, r12) == r5.AvO7iQsrTN(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.EljAMC1QTz(r7, r12) == r5.EljAMC1QTz(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.AvO7iQsrTN(r7, r12) == r5.AvO7iQsrTN(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.AvO7iQsrTN(r7, r12) == r5.AvO7iQsrTN(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.OOA6hdeuvCS(r7, r12)) == java.lang.Float.floatToIntBits(r5.OOA6hdeuvCS(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.xqGvceK5x(r7, r12)) == java.lang.Double.doubleToLongBits(r5.xqGvceK5x(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (defpackage.ox0.E7jCp8Ls(r9.encWxUiV2(r7, r12), r9.encWxUiV2(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.nx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AvO7iQsrTN(ay ayVar, ay ayVar2) {
        int[] iArr = this.GWasM1elztuh;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int HFYAaqMd6 = HFYAaqMd6(i);
                long j = HFYAaqMd6 & 1048575;
                switch (DmJncFq5(HFYAaqMd6)) {
                    case 0:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var2 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var3 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var4 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var5 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var6 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var7 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var8 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var9 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var10 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var11 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var12 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var13 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var14 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var15 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case Side.ALL /* 15 */:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var16 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var17 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (JFJ3QoxA(ayVar, ayVar2, i)) {
                            vc1 vc1Var18 = wc1.X1lG3V04pd;
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        vc1 vc1Var19 = wc1.X1lG3V04pd;
                        z = ox0.E7jCp8Ls(vc1Var19.encWxUiV2(j, ayVar), vc1Var19.encWxUiV2(j, ayVar2));
                        break;
                    case 50:
                        vc1 vc1Var20 = wc1.X1lG3V04pd;
                        z = ox0.E7jCp8Ls(vc1Var20.encWxUiV2(j, ayVar), vc1Var20.encWxUiV2(j, ayVar2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        vc1 vc1Var21 = wc1.X1lG3V04pd;
                        if (vc1Var21.EljAMC1QTz(j2, ayVar) == vc1Var21.EljAMC1QTz(j2, ayVar2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.E7jCp8Ls.getClass();
                if (ayVar.unknownFields.equals(ayVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void E7jCp8Ls(int i) {
        if (this.Yi7zF1RB1[((i / 3) * 2) + 1] == null) {
            return;
        }
        o4.YmKjaVtbfp5Z();
    }

    public final void EXrPz3p7hFb(int i, nb nbVar, Object obj) {
        if ((536870912 & i) != 0) {
            nbVar.WRKkgoJXwDn(2);
            wc1.iwATDS1i01k(obj, i & 1048575, ((mb) nbVar.xqGvceK5x).WRKkgoJXwDn());
        } else if (!this.EljAMC1QTz) {
            wc1.iwATDS1i01k(obj, i & 1048575, nbVar.AvO7iQsrTN());
        } else {
            nbVar.WRKkgoJXwDn(2);
            wc1.iwATDS1i01k(obj, i & 1048575, ((mb) nbVar.xqGvceK5x).WdrkLMV3xh());
        }
    }

    @Override // defpackage.nx0
    public final void EljAMC1QTz(Object obj, j6IIN2O8eOU j6iin2o8eou) {
        j6iin2o8eou.getClass();
        rezfBrjOrqK(obj, j6iin2o8eou);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // defpackage.nx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int GWasM1elztuh(ay ayVar) {
        int i;
        int Yi7zF1RB1;
        int i2;
        int[] iArr = this.GWasM1elztuh;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int HFYAaqMd6 = HFYAaqMd6(i4);
            int i5 = iArr[i4];
            long j = 1048575 & HFYAaqMd6;
            int i6 = 1237;
            int i7 = 37;
            switch (DmJncFq5(HFYAaqMd6)) {
                case 0:
                    i = i3 * 53;
                    Yi7zF1RB1 = i30.Yi7zF1RB1(Double.doubleToLongBits(wc1.X1lG3V04pd.xqGvceK5x(j, ayVar)));
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 1:
                    i = i3 * 53;
                    Yi7zF1RB1 = Float.floatToIntBits(wc1.X1lG3V04pd.OOA6hdeuvCS(j, ayVar));
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 2:
                    i = i3 * 53;
                    Yi7zF1RB1 = i30.Yi7zF1RB1(wc1.X1lG3V04pd.AvO7iQsrTN(j, ayVar));
                    i3 = Yi7zF1RB1 + i;
                    break;
                case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                    i = i3 * 53;
                    Yi7zF1RB1 = i30.Yi7zF1RB1(wc1.X1lG3V04pd.AvO7iQsrTN(j, ayVar));
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 4:
                    i = i3 * 53;
                    Yi7zF1RB1 = wc1.X1lG3V04pd.EljAMC1QTz(j, ayVar);
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 5:
                    i = i3 * 53;
                    Yi7zF1RB1 = i30.Yi7zF1RB1(wc1.X1lG3V04pd.AvO7iQsrTN(j, ayVar));
                    i3 = Yi7zF1RB1 + i;
                    break;
                case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = i3 * 53;
                    Yi7zF1RB1 = wc1.X1lG3V04pd.EljAMC1QTz(j, ayVar);
                    i3 = Yi7zF1RB1 + i;
                    break;
                case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = i3 * 53;
                    boolean X1lG3V04pd = wc1.X1lG3V04pd.X1lG3V04pd(j, ayVar);
                    Charset charset = i30.GWasM1elztuh;
                    break;
                case 8:
                    i = i3 * 53;
                    Yi7zF1RB1 = ((String) wc1.X1lG3V04pd.encWxUiV2(j, ayVar)).hashCode();
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 9:
                    Object encWxUiV2 = wc1.X1lG3V04pd.encWxUiV2(j, ayVar);
                    if (encWxUiV2 != null) {
                        i7 = encWxUiV2.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    Yi7zF1RB1 = wc1.X1lG3V04pd.encWxUiV2(j, ayVar).hashCode();
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 11:
                    i = i3 * 53;
                    Yi7zF1RB1 = wc1.X1lG3V04pd.EljAMC1QTz(j, ayVar);
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 12:
                    i = i3 * 53;
                    Yi7zF1RB1 = wc1.X1lG3V04pd.EljAMC1QTz(j, ayVar);
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 13:
                    i = i3 * 53;
                    Yi7zF1RB1 = wc1.X1lG3V04pd.EljAMC1QTz(j, ayVar);
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 14:
                    i = i3 * 53;
                    Yi7zF1RB1 = i30.Yi7zF1RB1(wc1.X1lG3V04pd.AvO7iQsrTN(j, ayVar));
                    i3 = Yi7zF1RB1 + i;
                    break;
                case Side.ALL /* 15 */:
                    i = i3 * 53;
                    Yi7zF1RB1 = wc1.X1lG3V04pd.EljAMC1QTz(j, ayVar);
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 16:
                    i = i3 * 53;
                    Yi7zF1RB1 = i30.Yi7zF1RB1(wc1.X1lG3V04pd.AvO7iQsrTN(j, ayVar));
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 17:
                    Object encWxUiV22 = wc1.X1lG3V04pd.encWxUiV2(j, ayVar);
                    if (encWxUiV22 != null) {
                        i7 = encWxUiV22.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    Yi7zF1RB1 = wc1.X1lG3V04pd.encWxUiV2(j, ayVar).hashCode();
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 50:
                    i = i3 * 53;
                    Yi7zF1RB1 = wc1.X1lG3V04pd.encWxUiV2(j, ayVar).hashCode();
                    i3 = Yi7zF1RB1 + i;
                    break;
                case 51:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = i30.Yi7zF1RB1(Double.doubleToLongBits(((Double) wc1.X1lG3V04pd.encWxUiV2(j, ayVar)).doubleValue()));
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = Float.floatToIntBits(((Float) wc1.X1lG3V04pd.encWxUiV2(j, ayVar)).floatValue());
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = i30.Yi7zF1RB1(arNh8D4Z5gB(j, ayVar));
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = i30.Yi7zF1RB1(arNh8D4Z5gB(j, ayVar));
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = WRKkgoJXwDn(j, ayVar);
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = i30.Yi7zF1RB1(arNh8D4Z5gB(j, ayVar));
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = WRKkgoJXwDn(j, ayVar);
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) wc1.X1lG3V04pd.encWxUiV2(j, ayVar)).booleanValue();
                        Charset charset2 = i30.GWasM1elztuh;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = ((String) wc1.X1lG3V04pd.encWxUiV2(j, ayVar)).hashCode();
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = wc1.X1lG3V04pd.encWxUiV2(j, ayVar).hashCode();
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = wc1.X1lG3V04pd.encWxUiV2(j, ayVar).hashCode();
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = WRKkgoJXwDn(j, ayVar);
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = WRKkgoJXwDn(j, ayVar);
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = WRKkgoJXwDn(j, ayVar);
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = i30.Yi7zF1RB1(arNh8D4Z5gB(j, ayVar));
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = WRKkgoJXwDn(j, ayVar);
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = i30.Yi7zF1RB1(arNh8D4Z5gB(j, ayVar));
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (YmKjaVtbfp5Z(i5, i4, ayVar)) {
                        i = i3 * 53;
                        Yi7zF1RB1 = wc1.X1lG3V04pd.encWxUiV2(j, ayVar).hashCode();
                        i3 = Yi7zF1RB1 + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.E7jCp8Ls.getClass();
        return ayVar.unknownFields.hashCode() + (i3 * 53);
    }

    public final int HFYAaqMd6(int i) {
        return this.GWasM1elztuh[i + 1];
    }

    public final boolean JFJ3QoxA(ay ayVar, ay ayVar2, int i) {
        return uFEq9NpZ(i, ayVar) == uFEq9NpZ(i, ayVar2);
    }

    public final void M3K9sHhK(Object obj, long j, nb nbVar, nx0 nx0Var, zq zqVar) {
        int arNh8D4Z5gB;
        this.rQPn8YBR.getClass();
        h30 GWasM1elztuh = va0.GWasM1elztuh(j, obj);
        mb mbVar = (mb) nbVar.xqGvceK5x;
        int i = nbVar.GWasM1elztuh;
        if ((i & 7) != 3) {
            throw w30.Yi7zF1RB1();
        }
        do {
            ay mOu10nynGul = nx0Var.mOu10nynGul();
            nbVar.xqGvceK5x(mOu10nynGul, nx0Var, zqVar);
            nx0Var.X1lG3V04pd(mOu10nynGul);
            ((os0) GWasM1elztuh).add(mOu10nynGul);
            if (mbVar.xqGvceK5x() || nbVar.X1lG3V04pd != 0) {
                return;
            } else {
                arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
            }
        } while (arNh8D4Z5gB == i);
        nbVar.X1lG3V04pd = arNh8D4Z5gB;
    }

    public final void MZhzXH72(Object obj, int i, int i2, WRKkgoJXwDn wRKkgoJXwDn) {
        iwATDS1i01k.putObject(obj, HFYAaqMd6(i2) & 1048575, wRKkgoJXwDn);
        eUH21U3apd(i, i2, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r10.mOu10nynGul(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Mjvvu5DE(Object obj, int i, Object obj2, zq zqVar, nb nbVar) {
        long HFYAaqMd6 = HFYAaqMd6(i) & 1048575;
        Object encWxUiV2 = wc1.X1lG3V04pd.encWxUiV2(HFYAaqMd6, obj);
        oc0 oc0Var = this.XnEVoBF0td1l;
        if (encWxUiV2 == null) {
            oc0Var.getClass();
            encWxUiV2 = nc0.EljAMC1QTz.Yi7zF1RB1();
            wc1.iwATDS1i01k(obj, HFYAaqMd6, encWxUiV2);
        } else {
            oc0Var.getClass();
            if (!((nc0) encWxUiV2).OOA6hdeuvCS) {
                nc0 Yi7zF1RB1 = nc0.EljAMC1QTz.Yi7zF1RB1();
                oc0.GWasM1elztuh(Yi7zF1RB1, encWxUiV2);
                wc1.iwATDS1i01k(obj, HFYAaqMd6, Yi7zF1RB1);
                encWxUiV2 = Yi7zF1RB1;
            }
        }
        oc0Var.getClass();
        nc0 nc0Var = (nc0) encWxUiV2;
        f4 f4Var = ((mc0) obj2).GWasM1elztuh;
        nbVar.WRKkgoJXwDn(2);
        mb mbVar = (mb) nbVar.xqGvceK5x;
        int JFJ3QoxA = mbVar.JFJ3QoxA(mbVar.pog2g9KITJA());
        Object obj3 = f4Var.xqGvceK5x;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int GWasM1elztuh = nbVar.GWasM1elztuh();
                if (GWasM1elztuh == Integer.MAX_VALUE || mbVar.xqGvceK5x()) {
                    break;
                }
                if (GWasM1elztuh == 1) {
                    obj4 = nbVar.rQPn8YBR((yh1) f4Var.Yi7zF1RB1, null, null);
                } else if (GWasM1elztuh != 2) {
                    try {
                        if (!nbVar.arNh8D4Z5gB()) {
                            throw new w30("Unable to parse map entry.");
                        }
                    } catch (v30 unused) {
                        if (!nbVar.arNh8D4Z5gB()) {
                            throw new w30("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = nbVar.rQPn8YBR((yh1) f4Var.X1lG3V04pd, obj3.getClass(), zqVar);
                }
            } catch (Throwable th) {
                mbVar.mOu10nynGul(JFJ3QoxA);
                throw th;
            }
        }
    }

    @Override // defpackage.nx0
    public final boolean OOA6hdeuvCS(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.encWxUiV2) {
            int i7 = this.AvO7iQsrTN[i6];
            int[] iArr = this.GWasM1elztuh;
            int i8 = iArr[i7];
            int HFYAaqMd6 = HFYAaqMd6(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = iwATDS1i01k.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & HFYAaqMd6) == 0 || iwATDS1i01k(obj, i2, i, i3, i11)) {
                int DmJncFq5 = DmJncFq5(HFYAaqMd6);
                if (DmJncFq5 == 9 || DmJncFq5 == 17) {
                    if (iwATDS1i01k(obj, i2, i, i3, i11)) {
                        if (!XnEVoBF0td1l(i2).OOA6hdeuvCS(wc1.X1lG3V04pd.encWxUiV2(HFYAaqMd6 & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (DmJncFq5 != 27) {
                        if (DmJncFq5 == 60 || DmJncFq5 == 68) {
                            if (YmKjaVtbfp5Z(i8, i2, obj)) {
                                if (!XnEVoBF0td1l(i2).OOA6hdeuvCS(wc1.X1lG3V04pd.encWxUiV2(HFYAaqMd6 & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (DmJncFq5 != 49) {
                            if (DmJncFq5 != 50) {
                                continue;
                            } else {
                                Object encWxUiV2 = wc1.X1lG3V04pd.encWxUiV2(HFYAaqMd6 & 1048575, obj);
                                this.XnEVoBF0td1l.getClass();
                                nc0 nc0Var = (nc0) encWxUiV2;
                                if (nc0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((yh1) ((mc0) this.Yi7zF1RB1[(i2 / 3) * 2]).GWasM1elztuh.X1lG3V04pd).OOA6hdeuvCS != zh1.XnEVoBF0td1l) {
                                        continue;
                                    } else {
                                        nx0 nx0Var = null;
                                        for (Object obj2 : nc0Var.values()) {
                                            if (nx0Var == null) {
                                                nx0Var = ns0.X1lG3V04pd.GWasM1elztuh(obj2.getClass());
                                            }
                                            if (!nx0Var.OOA6hdeuvCS(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) wc1.X1lG3V04pd.encWxUiV2(HFYAaqMd6 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        nx0 XnEVoBF0td1l = XnEVoBF0td1l(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (XnEVoBF0td1l.OOA6hdeuvCS(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.nx0
    public final void X1lG3V04pd(Object obj) {
        if (WIEu4Ya2g8(obj)) {
            if (obj instanceof ay) {
                ay ayVar = (ay) obj;
                ayVar.rQPn8YBR(Integer.MAX_VALUE);
                ayVar.memoizedHashCode = 0;
                ayVar.encWxUiV2();
            }
            int[] iArr = this.GWasM1elztuh;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int HFYAaqMd6 = HFYAaqMd6(i);
                long j = 1048575 & HFYAaqMd6;
                int DmJncFq5 = DmJncFq5(HFYAaqMd6);
                if (DmJncFq5 != 9) {
                    if (DmJncFq5 != 60 && DmJncFq5 != 68) {
                        switch (DmJncFq5) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.rQPn8YBR.getClass();
                                os0 os0Var = (os0) ((h30) wc1.X1lG3V04pd.encWxUiV2(j, obj));
                                if (os0Var.OOA6hdeuvCS) {
                                    os0Var.OOA6hdeuvCS = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = iwATDS1i01k;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.XnEVoBF0td1l.getClass();
                                    ((nc0) object).OOA6hdeuvCS = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (YmKjaVtbfp5Z(iArr[i], i, obj)) {
                        XnEVoBF0td1l(i).X1lG3V04pd(iwATDS1i01k.getObject(obj, j));
                    }
                }
                if (uFEq9NpZ(i, obj)) {
                    XnEVoBF0td1l(i).X1lG3V04pd(iwATDS1i01k.getObject(obj, j));
                }
            }
            this.E7jCp8Ls.getClass();
            lc1 lc1Var = ((ay) obj).unknownFields;
            if (lc1Var.OOA6hdeuvCS) {
                lc1Var.OOA6hdeuvCS = false;
            }
        }
    }

    public final nx0 XnEVoBF0td1l(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.Yi7zF1RB1;
        nx0 nx0Var = (nx0) objArr[i2];
        if (nx0Var != null) {
            return nx0Var;
        }
        nx0 GWasM1elztuh = ns0.X1lG3V04pd.GWasM1elztuh((Class) objArr[i2 + 1]);
        objArr[i2] = GWasM1elztuh;
        return GWasM1elztuh;
    }

    public final Object Y6hRI1cF8(int i, Object obj) {
        nx0 XnEVoBF0td1l = XnEVoBF0td1l(i);
        long HFYAaqMd6 = HFYAaqMd6(i) & 1048575;
        if (!uFEq9NpZ(i, obj)) {
            return XnEVoBF0td1l.mOu10nynGul();
        }
        Object object = iwATDS1i01k.getObject(obj, HFYAaqMd6);
        if (WIEu4Ya2g8(object)) {
            return object;
        }
        ay mOu10nynGul = XnEVoBF0td1l.mOu10nynGul();
        if (object != null) {
            XnEVoBF0td1l.Yi7zF1RB1(mOu10nynGul, object);
        }
        return mOu10nynGul;
    }

    public final void YZjbz8VdP5(int i, Object obj) {
        int i2 = this.GWasM1elztuh[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        wc1.XnEVoBF0td1l(obj, j, (1 << (i2 >>> 20)) | wc1.X1lG3V04pd.EljAMC1QTz(j, obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.nx0
    public final void Yi7zF1RB1(Object obj, Object obj2) {
        Object obj3;
        if (!WIEu4Ya2g8(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.GWasM1elztuh;
            if (i >= iArr.length) {
                ox0.rQPn8YBR(this.E7jCp8Ls, obj, obj2);
                return;
            }
            int HFYAaqMd6 = HFYAaqMd6(i);
            long j = 1048575 & HFYAaqMd6;
            int i2 = iArr[i];
            switch (DmJncFq5(HFYAaqMd6)) {
                case 0:
                    if (uFEq9NpZ(i, obj2)) {
                        vc1 vc1Var = wc1.X1lG3V04pd;
                        obj3 = obj;
                        vc1Var.E7jCp8Ls(obj3, j, vc1Var.xqGvceK5x(j, obj2));
                        YZjbz8VdP5(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (uFEq9NpZ(i, obj2)) {
                        vc1 vc1Var2 = wc1.X1lG3V04pd;
                        vc1Var2.XnEVoBF0td1l(obj, j, vc1Var2.OOA6hdeuvCS(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.uFEq9NpZ(obj, j, wc1.X1lG3V04pd.AvO7iQsrTN(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.uFEq9NpZ(obj, j, wc1.X1lG3V04pd.AvO7iQsrTN(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.XnEVoBF0td1l(obj, j, wc1.X1lG3V04pd.EljAMC1QTz(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.uFEq9NpZ(obj, j, wc1.X1lG3V04pd.AvO7iQsrTN(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.XnEVoBF0td1l(obj, j, wc1.X1lG3V04pd.EljAMC1QTz(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (uFEq9NpZ(i, obj2)) {
                        vc1 vc1Var3 = wc1.X1lG3V04pd;
                        vc1Var3.JFJ3QoxA(obj, j, vc1Var3.X1lG3V04pd(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.iwATDS1i01k(obj, j, wc1.X1lG3V04pd.encWxUiV2(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    mE4lRynR(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.iwATDS1i01k(obj, j, wc1.X1lG3V04pd.encWxUiV2(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.XnEVoBF0td1l(obj, j, wc1.X1lG3V04pd.EljAMC1QTz(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.XnEVoBF0td1l(obj, j, wc1.X1lG3V04pd.EljAMC1QTz(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.XnEVoBF0td1l(obj, j, wc1.X1lG3V04pd.EljAMC1QTz(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.uFEq9NpZ(obj, j, wc1.X1lG3V04pd.AvO7iQsrTN(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case Side.ALL /* 15 */:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.XnEVoBF0td1l(obj, j, wc1.X1lG3V04pd.EljAMC1QTz(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (uFEq9NpZ(i, obj2)) {
                        wc1.uFEq9NpZ(obj, j, wc1.X1lG3V04pd.AvO7iQsrTN(j, obj2));
                        YZjbz8VdP5(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    mE4lRynR(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.rQPn8YBR.getClass();
                    vc1 vc1Var4 = wc1.X1lG3V04pd;
                    h30 h30Var = (h30) vc1Var4.encWxUiV2(j, obj);
                    h30 h30Var2 = (h30) vc1Var4.encWxUiV2(j, obj2);
                    int i3 = ((os0) h30Var).AvO7iQsrTN;
                    int i4 = ((os0) h30Var2).AvO7iQsrTN;
                    if (i3 > 0 && i4 > 0) {
                        if (!((os0) h30Var).OOA6hdeuvCS) {
                            h30Var = ((os0) h30Var).X1lG3V04pd(i4 + i3);
                        }
                        ((os0) h30Var).addAll(h30Var2);
                    }
                    if (i3 > 0) {
                        h30Var2 = h30Var;
                    }
                    wc1.iwATDS1i01k(obj, j, h30Var2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = ox0.GWasM1elztuh;
                    vc1 vc1Var5 = wc1.X1lG3V04pd;
                    Object encWxUiV2 = vc1Var5.encWxUiV2(j, obj);
                    Object encWxUiV22 = vc1Var5.encWxUiV2(j, obj2);
                    this.XnEVoBF0td1l.getClass();
                    wc1.iwATDS1i01k(obj, j, oc0.GWasM1elztuh(encWxUiV2, encWxUiV22));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (YmKjaVtbfp5Z(i2, i, obj2)) {
                        wc1.iwATDS1i01k(obj, j, wc1.X1lG3V04pd.encWxUiV2(j, obj2));
                        eUH21U3apd(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    jivtDDk9H(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (YmKjaVtbfp5Z(i2, i, obj2)) {
                        wc1.iwATDS1i01k(obj, j, wc1.X1lG3V04pd.encWxUiV2(j, obj2));
                        eUH21U3apd(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    jivtDDk9H(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    public final boolean YmKjaVtbfp5Z(int i, int i2, Object obj) {
        return wc1.X1lG3V04pd.EljAMC1QTz((long) (this.GWasM1elztuh[i2 + 2] & 1048575), obj) == i;
    }

    public final Object cilMamHF(int i, int i2, Object obj) {
        nx0 XnEVoBF0td1l = XnEVoBF0td1l(i2);
        if (!YmKjaVtbfp5Z(i, i2, obj)) {
            return XnEVoBF0td1l.mOu10nynGul();
        }
        Object object = iwATDS1i01k.getObject(obj, HFYAaqMd6(i2) & 1048575);
        if (WIEu4Ya2g8(object)) {
            return object;
        }
        ay mOu10nynGul = XnEVoBF0td1l.mOu10nynGul();
        if (object != null) {
            XnEVoBF0td1l.Yi7zF1RB1(mOu10nynGul, object);
        }
        return mOu10nynGul;
    }

    public final void eUH21U3apd(int i, int i2, Object obj) {
        wc1.XnEVoBF0td1l(obj, this.GWasM1elztuh[i2 + 2] & 1048575, i);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.nx0
    public final void encWxUiV2(java.lang.Object r19, defpackage.nb r20, defpackage.zq r21) {
        /*
            Method dump skipped, instructions count: 1936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd0.encWxUiV2(java.lang.Object, nb, zq):void");
    }

    public final boolean iwATDS1i01k(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? uFEq9NpZ(i, obj) : (i3 & i4) != 0;
    }

    public final void jivtDDk9H(int i, Object obj, Object obj2) {
        int[] iArr = this.GWasM1elztuh;
        int i2 = iArr[i];
        if (YmKjaVtbfp5Z(i2, i, obj2)) {
            long HFYAaqMd6 = HFYAaqMd6(i) & 1048575;
            Unsafe unsafe = iwATDS1i01k;
            Object object = unsafe.getObject(obj2, HFYAaqMd6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            nx0 XnEVoBF0td1l = XnEVoBF0td1l(i);
            if (!YmKjaVtbfp5Z(i2, i, obj)) {
                if (WIEu4Ya2g8(object)) {
                    ay mOu10nynGul = XnEVoBF0td1l.mOu10nynGul();
                    XnEVoBF0td1l.Yi7zF1RB1(mOu10nynGul, object);
                    unsafe.putObject(obj, HFYAaqMd6, mOu10nynGul);
                } else {
                    unsafe.putObject(obj, HFYAaqMd6, object);
                }
                eUH21U3apd(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, HFYAaqMd6);
            if (!WIEu4Ya2g8(object2)) {
                ay mOu10nynGul2 = XnEVoBF0td1l.mOu10nynGul();
                XnEVoBF0td1l.Yi7zF1RB1(mOu10nynGul2, object2);
                unsafe.putObject(obj, HFYAaqMd6, mOu10nynGul2);
                object2 = mOu10nynGul2;
            }
            XnEVoBF0td1l.Yi7zF1RB1(object2, object);
        }
    }

    public final void k8h8IjolWQ(Object obj, int i, nb nbVar, nx0 nx0Var, zq zqVar) {
        int arNh8D4Z5gB;
        this.rQPn8YBR.getClass();
        h30 GWasM1elztuh = va0.GWasM1elztuh(i & 1048575, obj);
        mb mbVar = (mb) nbVar.xqGvceK5x;
        int i2 = nbVar.GWasM1elztuh;
        if ((i2 & 7) != 2) {
            throw w30.Yi7zF1RB1();
        }
        do {
            ay mOu10nynGul = nx0Var.mOu10nynGul();
            nbVar.OOA6hdeuvCS(mOu10nynGul, nx0Var, zqVar);
            nx0Var.X1lG3V04pd(mOu10nynGul);
            ((os0) GWasM1elztuh).add(mOu10nynGul);
            if (mbVar.xqGvceK5x() || nbVar.X1lG3V04pd != 0) {
                return;
            } else {
                arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
            }
        } while (arNh8D4Z5gB == i2);
        nbVar.X1lG3V04pd = arNh8D4Z5gB;
    }

    public final void mE4lRynR(int i, Object obj, Object obj2) {
        if (uFEq9NpZ(i, obj2)) {
            long HFYAaqMd6 = HFYAaqMd6(i) & 1048575;
            Unsafe unsafe = iwATDS1i01k;
            Object object = unsafe.getObject(obj2, HFYAaqMd6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.GWasM1elztuh[i] + " is present but null: " + obj2);
            }
            nx0 XnEVoBF0td1l = XnEVoBF0td1l(i);
            if (!uFEq9NpZ(i, obj)) {
                if (WIEu4Ya2g8(object)) {
                    ay mOu10nynGul = XnEVoBF0td1l.mOu10nynGul();
                    XnEVoBF0td1l.Yi7zF1RB1(mOu10nynGul, object);
                    unsafe.putObject(obj, HFYAaqMd6, mOu10nynGul);
                } else {
                    unsafe.putObject(obj, HFYAaqMd6, object);
                }
                YZjbz8VdP5(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, HFYAaqMd6);
            if (!WIEu4Ya2g8(object2)) {
                ay mOu10nynGul2 = XnEVoBF0td1l.mOu10nynGul();
                XnEVoBF0td1l.Yi7zF1RB1(mOu10nynGul2, object2);
                unsafe.putObject(obj, HFYAaqMd6, mOu10nynGul2);
                object2 = mOu10nynGul2;
            }
            XnEVoBF0td1l.Yi7zF1RB1(object2, object);
        }
    }

    @Override // defpackage.nx0
    public final ay mOu10nynGul() {
        this.JFJ3QoxA.getClass();
        return ((ay) this.OOA6hdeuvCS).mOu10nynGul();
    }

    public final void ozMwhSAI(int i, nb nbVar, Object obj) {
        boolean z = (536870912 & i) != 0;
        va0 va0Var = this.rQPn8YBR;
        if (z) {
            va0Var.getClass();
            nbVar.Y6hRI1cF8(va0.GWasM1elztuh(i & 1048575, obj), true);
        } else {
            va0Var.getClass();
            nbVar.Y6hRI1cF8(va0.GWasM1elztuh(i & 1048575, obj), false);
        }
    }

    public final int pog2g9KITJA(int i) {
        if (i < this.X1lG3V04pd || i > this.xqGvceK5x) {
            return -1;
        }
        int[] iArr = this.GWasM1elztuh;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void rQPn8YBR(int i, Object obj, Object obj2) {
        int i2 = this.GWasM1elztuh[i];
        if (wc1.X1lG3V04pd.encWxUiV2(HFYAaqMd6(i) & 1048575, obj) == null) {
            return;
        }
        E7jCp8Ls(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void rezfBrjOrqK(Object obj, j6IIN2O8eOU j6iin2o8eou) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        vd0 vd0Var = this;
        int[] iArr = vd0Var.GWasM1elztuh;
        int length = iArr.length;
        Unsafe unsafe = iwATDS1i01k;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int HFYAaqMd6 = vd0Var.HFYAaqMd6(i7);
            int i9 = iArr[i7];
            int DmJncFq5 = DmJncFq5(HFYAaqMd6);
            if (DmJncFq5 <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = HFYAaqMd6;
                i2 = 1 << (i10 >>> 20);
            } else {
                i = HFYAaqMd6;
                i2 = 0;
            }
            long j = i & i5;
            switch (DmJncFq5) {
                case 0:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        double xqGvceK5x = wc1.X1lG3V04pd.xqGvceK5x(j, obj);
                        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
                        pbVar.getClass();
                        pbVar.jivtDDk9H(i9, Double.doubleToRawLongBits(xqGvceK5x));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        float OOA6hdeuvCS = wc1.X1lG3V04pd.OOA6hdeuvCS(j, obj);
                        pb pbVar2 = (pb) j6iin2o8eou.EljAMC1QTz;
                        pbVar2.getClass();
                        pbVar2.Mjvvu5DE(i9, Float.floatToRawIntBits(OOA6hdeuvCS));
                    }
                    vd0Var = this;
                    break;
                case 2:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).ozMwhSAI(i9, unsafe.getLong(obj, j));
                    }
                    vd0Var = this;
                    break;
                case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).ozMwhSAI(i9, unsafe.getLong(obj, j));
                    }
                    vd0Var = this;
                    break;
                case 4:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).cilMamHF(i9, unsafe.getInt(obj, j));
                    }
                    vd0Var = this;
                    break;
                case 5:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).jivtDDk9H(i9, unsafe.getLong(obj, j));
                    }
                    vd0Var = this;
                    break;
                case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).Mjvvu5DE(i9, unsafe.getInt(obj, j));
                    }
                    vd0Var = this;
                    break;
                case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).iwATDS1i01k(i9, wc1.X1lG3V04pd.X1lG3V04pd(j, obj));
                    }
                    vd0Var = this;
                    break;
                case 8:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((pb) j6iin2o8eou.EljAMC1QTz).arNh8D4Z5gB((String) object, i9);
                        } else {
                            ((pb) j6iin2o8eou.EljAMC1QTz).WIEu4Ya2g8(i9, (c9) object);
                        }
                    }
                    vd0Var = this;
                    break;
                case 9:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).WRKkgoJXwDn(i9, (WRKkgoJXwDn) unsafe.getObject(obj, j), vd0Var.XnEVoBF0td1l(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).WIEu4Ya2g8(i9, (c9) unsafe.getObject(obj, j));
                    }
                    vd0Var = this;
                    break;
                case 11:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).k8h8IjolWQ(i9, unsafe.getInt(obj, j));
                    }
                    vd0Var = this;
                    break;
                case 12:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).cilMamHF(i9, unsafe.getInt(obj, j));
                    }
                    vd0Var = this;
                    break;
                case 13:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).Mjvvu5DE(i9, unsafe.getInt(obj, j));
                    }
                    vd0Var = this;
                    break;
                case 14:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).jivtDDk9H(i9, unsafe.getLong(obj, j));
                    }
                    vd0Var = this;
                    break;
                case Side.ALL /* 15 */:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        int i12 = unsafe.getInt(obj, j);
                        ((pb) j6iin2o8eou.EljAMC1QTz).k8h8IjolWQ(i9, (i12 >> 31) ^ (i12 << 1));
                    }
                    vd0Var = this;
                    break;
                case 16:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((pb) j6iin2o8eou.EljAMC1QTz).ozMwhSAI(i9, (j2 >> 63) ^ (j2 << 1));
                    }
                    vd0Var = this;
                    break;
                case 17:
                    if (vd0Var.iwATDS1i01k(obj, i7, i6, i8, i2)) {
                        j6iin2o8eou.WRKkgoJXwDn(i9, unsafe.getObject(obj, j), vd0Var.XnEVoBF0td1l(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i3 = i6;
                    ox0.uFEq9NpZ(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 19:
                    i3 = i6;
                    ox0.Mjvvu5DE(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 20:
                    i3 = i6;
                    ox0.jivtDDk9H(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 21:
                    i3 = i6;
                    ox0.arNh8D4Z5gB(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 22:
                    i3 = i6;
                    ox0.mE4lRynR(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 23:
                    i3 = i6;
                    ox0.YmKjaVtbfp5Z(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 24:
                    i3 = i6;
                    ox0.WIEu4Ya2g8(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 25:
                    i3 = i6;
                    ox0.XnEVoBF0td1l(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 26:
                    i4 = i6;
                    int i13 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = ox0.GWasM1elztuh;
                    if (list != null && !list.isEmpty()) {
                        j6iin2o8eou.getClass();
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            ((pb) j6iin2o8eou.EljAMC1QTz).arNh8D4Z5gB((String) list.get(i14), i13);
                        }
                    }
                    i6 = i4;
                    break;
                case 27:
                    i4 = i6;
                    int i15 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    nx0 XnEVoBF0td1l = vd0Var.XnEVoBF0td1l(i7);
                    Class cls2 = ox0.GWasM1elztuh;
                    if (list2 != null && !list2.isEmpty()) {
                        j6iin2o8eou.getClass();
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            ((pb) j6iin2o8eou.EljAMC1QTz).WRKkgoJXwDn(i15, (WRKkgoJXwDn) list2.get(i16), XnEVoBF0td1l);
                        }
                    }
                    i6 = i4;
                    break;
                case 28:
                    i4 = i6;
                    int i17 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = ox0.GWasM1elztuh;
                    if (list3 != null && !list3.isEmpty()) {
                        j6iin2o8eou.getClass();
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            ((pb) j6iin2o8eou.EljAMC1QTz).WIEu4Ya2g8(i17, (c9) list3.get(i18));
                        }
                    }
                    i6 = i4;
                    break;
                case 29:
                    i3 = i6;
                    z = false;
                    ox0.WRKkgoJXwDn(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 30:
                    i3 = i6;
                    z = false;
                    ox0.iwATDS1i01k(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 31:
                    i3 = i6;
                    z = false;
                    ox0.Y6hRI1cF8(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 32:
                    i3 = i6;
                    z = false;
                    ox0.cilMamHF(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 33:
                    i3 = i6;
                    z = false;
                    ox0.lv06NcmrQ(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 34:
                    i3 = i6;
                    z = false;
                    ox0.WdrkLMV3xh(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, false);
                    i6 = i3;
                    break;
                case 35:
                    i4 = i6;
                    ox0.uFEq9NpZ(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 36:
                    i4 = i6;
                    ox0.Mjvvu5DE(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 37:
                    i4 = i6;
                    ox0.jivtDDk9H(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 38:
                    i4 = i6;
                    ox0.arNh8D4Z5gB(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 39:
                    i4 = i6;
                    ox0.mE4lRynR(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 40:
                    i4 = i6;
                    ox0.YmKjaVtbfp5Z(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 41:
                    i4 = i6;
                    ox0.WIEu4Ya2g8(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 42:
                    i4 = i6;
                    ox0.XnEVoBF0td1l(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 43:
                    i4 = i6;
                    ox0.WRKkgoJXwDn(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 44:
                    i4 = i6;
                    ox0.iwATDS1i01k(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 45:
                    i4 = i6;
                    ox0.Y6hRI1cF8(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 46:
                    i4 = i6;
                    ox0.cilMamHF(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 47:
                    i4 = i6;
                    ox0.lv06NcmrQ(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 48:
                    i4 = i6;
                    ox0.WdrkLMV3xh(iArr[i7], (List) unsafe.getObject(obj, j), j6iin2o8eou, true);
                    i6 = i4;
                    break;
                case 49:
                    i4 = i6;
                    int i19 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    nx0 XnEVoBF0td1l2 = vd0Var.XnEVoBF0td1l(i7);
                    Class cls4 = ox0.GWasM1elztuh;
                    if (list4 != null && !list4.isEmpty()) {
                        j6iin2o8eou.getClass();
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            j6iin2o8eou.WRKkgoJXwDn(i19, list4.get(i20), XnEVoBF0td1l2);
                        }
                    }
                    i6 = i4;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i21 = 2;
                        Object obj2 = vd0Var.Yi7zF1RB1[(i7 / 3) * 2];
                        vd0Var.XnEVoBF0td1l.getClass();
                        f4 f4Var = ((mc0) obj2).GWasM1elztuh;
                        pb pbVar3 = (pb) j6iin2o8eou.EljAMC1QTz;
                        pbVar3.getClass();
                        for (Map.Entry entry : ((nc0) object2).entrySet()) {
                            pbVar3.M3K9sHhK(i9, i21);
                            pbVar3.EXrPz3p7hFb(mc0.GWasM1elztuh(f4Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            jr.Yi7zF1RB1(pbVar3, (yh1) f4Var.Yi7zF1RB1, 1, key);
                            i21 = 2;
                            jr.Yi7zF1RB1(pbVar3, (yh1) f4Var.X1lG3V04pd, 2, value);
                            i6 = i6;
                        }
                    }
                    i4 = i6;
                    i6 = i4;
                    break;
                case 51:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        double doubleValue = ((Double) wc1.X1lG3V04pd.encWxUiV2(j, obj)).doubleValue();
                        pb pbVar4 = (pb) j6iin2o8eou.EljAMC1QTz;
                        pbVar4.getClass();
                        pbVar4.jivtDDk9H(i9, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case 52:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        float floatValue = ((Float) wc1.X1lG3V04pd.encWxUiV2(j, obj)).floatValue();
                        pb pbVar5 = (pb) j6iin2o8eou.EljAMC1QTz;
                        pbVar5.getClass();
                        pbVar5.Mjvvu5DE(i9, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).ozMwhSAI(i9, arNh8D4Z5gB(j, obj));
                    }
                    break;
                case 54:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).ozMwhSAI(i9, arNh8D4Z5gB(j, obj));
                    }
                    break;
                case 55:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).cilMamHF(i9, WRKkgoJXwDn(j, obj));
                    }
                    break;
                case 56:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).jivtDDk9H(i9, arNh8D4Z5gB(j, obj));
                    }
                    break;
                case 57:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).Mjvvu5DE(i9, WRKkgoJXwDn(j, obj));
                    }
                    break;
                case 58:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).iwATDS1i01k(i9, ((Boolean) wc1.X1lG3V04pd.encWxUiV2(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((pb) j6iin2o8eou.EljAMC1QTz).arNh8D4Z5gB((String) object3, i9);
                        } else {
                            ((pb) j6iin2o8eou.EljAMC1QTz).WIEu4Ya2g8(i9, (c9) object3);
                        }
                    }
                    break;
                case 60:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).WRKkgoJXwDn(i9, (WRKkgoJXwDn) unsafe.getObject(obj, j), vd0Var.XnEVoBF0td1l(i7));
                    }
                    break;
                case 61:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).WIEu4Ya2g8(i9, (c9) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).k8h8IjolWQ(i9, WRKkgoJXwDn(j, obj));
                    }
                    break;
                case 63:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).cilMamHF(i9, WRKkgoJXwDn(j, obj));
                    }
                    break;
                case 64:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).Mjvvu5DE(i9, WRKkgoJXwDn(j, obj));
                    }
                    break;
                case 65:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        ((pb) j6iin2o8eou.EljAMC1QTz).jivtDDk9H(i9, arNh8D4Z5gB(j, obj));
                    }
                    break;
                case 66:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        int WRKkgoJXwDn = WRKkgoJXwDn(j, obj);
                        ((pb) j6iin2o8eou.EljAMC1QTz).k8h8IjolWQ(i9, (WRKkgoJXwDn >> 31) ^ (WRKkgoJXwDn << 1));
                    }
                    break;
                case 67:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        long arNh8D4Z5gB = arNh8D4Z5gB(j, obj);
                        ((pb) j6iin2o8eou.EljAMC1QTz).ozMwhSAI(i9, (arNh8D4Z5gB << 1) ^ (arNh8D4Z5gB >> 63));
                    }
                    break;
                case 68:
                    if (vd0Var.YmKjaVtbfp5Z(i9, i7, obj)) {
                        j6iin2o8eou.WRKkgoJXwDn(i9, unsafe.getObject(obj, j), vd0Var.XnEVoBF0td1l(i7));
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        vd0Var.E7jCp8Ls.getClass();
        ((ay) obj).unknownFields.xqGvceK5x(j6iin2o8eou);
    }

    public final boolean uFEq9NpZ(int i, Object obj) {
        int i2 = this.GWasM1elztuh[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int HFYAaqMd6 = HFYAaqMd6(i);
            long j2 = HFYAaqMd6 & 1048575;
            switch (DmJncFq5(HFYAaqMd6)) {
                case 0:
                    if (Double.doubleToRawLongBits(wc1.X1lG3V04pd.xqGvceK5x(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(wc1.X1lG3V04pd.OOA6hdeuvCS(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (wc1.X1lG3V04pd.AvO7iQsrTN(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                    if (wc1.X1lG3V04pd.AvO7iQsrTN(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (wc1.X1lG3V04pd.EljAMC1QTz(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (wc1.X1lG3V04pd.AvO7iQsrTN(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (wc1.X1lG3V04pd.EljAMC1QTz(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                    return wc1.X1lG3V04pd.X1lG3V04pd(j2, obj);
                case 8:
                    Object encWxUiV2 = wc1.X1lG3V04pd.encWxUiV2(j2, obj);
                    if (encWxUiV2 instanceof String) {
                        return !((String) encWxUiV2).isEmpty();
                    }
                    if (encWxUiV2 instanceof c9) {
                        return !c9.AvO7iQsrTN.equals(encWxUiV2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (wc1.X1lG3V04pd.encWxUiV2(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !c9.AvO7iQsrTN.equals(wc1.X1lG3V04pd.encWxUiV2(j2, obj));
                case 11:
                    if (wc1.X1lG3V04pd.EljAMC1QTz(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (wc1.X1lG3V04pd.EljAMC1QTz(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (wc1.X1lG3V04pd.EljAMC1QTz(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (wc1.X1lG3V04pd.AvO7iQsrTN(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case Side.ALL /* 15 */:
                    if (wc1.X1lG3V04pd.EljAMC1QTz(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (wc1.X1lG3V04pd.AvO7iQsrTN(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (wc1.X1lG3V04pd.encWxUiV2(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & wc1.X1lG3V04pd.EljAMC1QTz(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.nx0
    public final int xqGvceK5x(ay ayVar) {
        int i;
        int encWxUiV2;
        int encWxUiV22;
        int encWxUiV23;
        int JFJ3QoxA;
        int encWxUiV24;
        int JFJ3QoxA2;
        int encWxUiV25;
        int encWxUiV26;
        int EljAMC1QTz;
        int encWxUiV27;
        int GWasM1elztuh;
        int X1lG3V04pd;
        int encWxUiV28;
        int size;
        int mOu10nynGul;
        int encWxUiV29;
        int encWxUiV210;
        int size2;
        int encWxUiV211;
        int mOu10nynGul2;
        int i2;
        int i3;
        int encWxUiV212;
        int mOu10nynGul3;
        vd0 vd0Var = this;
        ay ayVar2 = ayVar;
        Unsafe unsafe = iwATDS1i01k;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = vd0Var.GWasM1elztuh;
            if (i5 >= iArr.length) {
                vd0Var.E7jCp8Ls.getClass();
                return ayVar2.unknownFields.Yi7zF1RB1() + i7;
            }
            int HFYAaqMd6 = vd0Var.HFYAaqMd6(i5);
            int DmJncFq5 = DmJncFq5(HFYAaqMd6);
            int i8 = iArr[i5];
            int i9 = iArr[i5 + 2];
            int i10 = i9 & 1048575;
            if (DmJncFq5 <= 17) {
                if (i10 != i4) {
                    i6 = i10 == 1048575 ? 0 : unsafe.getInt(ayVar2, i10);
                    i4 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = HFYAaqMd6 & 1048575;
            if (DmJncFq5 >= kr.EljAMC1QTz.OOA6hdeuvCS) {
                int i11 = kr.AvO7iQsrTN.OOA6hdeuvCS;
            }
            switch (DmJncFq5) {
                case 0:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        encWxUiV2 = pb.encWxUiV2(i8);
                        X1lG3V04pd = encWxUiV2 + 8;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        encWxUiV22 = pb.encWxUiV2(i8);
                        encWxUiV26 = encWxUiV22 + 4;
                        i7 += encWxUiV26;
                    }
                    vd0Var = this;
                    ayVar2 = ayVar;
                    break;
                case 2:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(ayVar2, j);
                        encWxUiV23 = pb.encWxUiV2(i8);
                        JFJ3QoxA = pb.JFJ3QoxA(j2);
                        i7 += JFJ3QoxA + encWxUiV23;
                    }
                    vd0Var = this;
                    break;
                case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(ayVar2, j);
                        encWxUiV23 = pb.encWxUiV2(i8);
                        JFJ3QoxA = pb.JFJ3QoxA(j3);
                        i7 += JFJ3QoxA + encWxUiV23;
                    }
                    vd0Var = this;
                    break;
                case 4:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(ayVar2, j);
                        encWxUiV24 = pb.encWxUiV2(i8);
                        JFJ3QoxA2 = pb.JFJ3QoxA(i12);
                        EljAMC1QTz = JFJ3QoxA2 + encWxUiV24;
                        i7 += EljAMC1QTz;
                    }
                    vd0Var = this;
                    break;
                case 5:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        encWxUiV25 = pb.encWxUiV2(i8);
                        encWxUiV26 = encWxUiV25 + 8;
                        i7 += encWxUiV26;
                    }
                    vd0Var = this;
                    ayVar2 = ayVar;
                    break;
                case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        encWxUiV22 = pb.encWxUiV2(i8);
                        encWxUiV26 = encWxUiV22 + 4;
                        i7 += encWxUiV26;
                    }
                    vd0Var = this;
                    ayVar2 = ayVar;
                    break;
                case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        encWxUiV26 = pb.encWxUiV2(i8) + 1;
                        i7 += encWxUiV26;
                    }
                    vd0Var = this;
                    ayVar2 = ayVar;
                    break;
                case 8:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(ayVar2, j);
                        i7 = (object instanceof c9 ? pb.EljAMC1QTz(i8, (c9) object) : pb.AvO7iQsrTN((String) object) + pb.encWxUiV2(i8)) + i7;
                    }
                    vd0Var = this;
                    break;
                case 9:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        Object object2 = unsafe.getObject(ayVar2, j);
                        nx0 XnEVoBF0td1l = vd0Var.XnEVoBF0td1l(i5);
                        Class cls = ox0.GWasM1elztuh;
                        int encWxUiV213 = pb.encWxUiV2(i8);
                        int GWasM1elztuh2 = ((WRKkgoJXwDn) object2).GWasM1elztuh(XnEVoBF0td1l);
                        i7 += pb.mOu10nynGul(GWasM1elztuh2) + GWasM1elztuh2 + encWxUiV213;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        EljAMC1QTz = pb.EljAMC1QTz(i8, (c9) unsafe.getObject(ayVar2, j));
                        i7 += EljAMC1QTz;
                    }
                    vd0Var = this;
                    break;
                case 11:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        int i13 = unsafe.getInt(ayVar2, j);
                        encWxUiV24 = pb.encWxUiV2(i8);
                        JFJ3QoxA2 = pb.mOu10nynGul(i13);
                        EljAMC1QTz = JFJ3QoxA2 + encWxUiV24;
                        i7 += EljAMC1QTz;
                    }
                    vd0Var = this;
                    break;
                case 12:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        int i14 = unsafe.getInt(ayVar2, j);
                        encWxUiV24 = pb.encWxUiV2(i8);
                        JFJ3QoxA2 = pb.JFJ3QoxA(i14);
                        EljAMC1QTz = JFJ3QoxA2 + encWxUiV24;
                        i7 += EljAMC1QTz;
                    }
                    vd0Var = this;
                    break;
                case 13:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        encWxUiV22 = pb.encWxUiV2(i8);
                        encWxUiV26 = encWxUiV22 + 4;
                        i7 += encWxUiV26;
                    }
                    vd0Var = this;
                    ayVar2 = ayVar;
                    break;
                case 14:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        encWxUiV25 = pb.encWxUiV2(i8);
                        encWxUiV26 = encWxUiV25 + 8;
                        i7 += encWxUiV26;
                    }
                    vd0Var = this;
                    ayVar2 = ayVar;
                    break;
                case Side.ALL /* 15 */:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        int i15 = unsafe.getInt(ayVar2, j);
                        encWxUiV24 = pb.encWxUiV2(i8);
                        JFJ3QoxA2 = pb.mOu10nynGul((i15 >> 31) ^ (i15 << 1));
                        EljAMC1QTz = JFJ3QoxA2 + encWxUiV24;
                        i7 += EljAMC1QTz;
                    }
                    vd0Var = this;
                    break;
                case 16:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        long j4 = unsafe.getLong(ayVar2, j);
                        encWxUiV23 = pb.encWxUiV2(i8);
                        JFJ3QoxA = pb.JFJ3QoxA((j4 << 1) ^ (j4 >> 63));
                        i7 += JFJ3QoxA + encWxUiV23;
                    }
                    vd0Var = this;
                    break;
                case 17:
                    if (vd0Var.iwATDS1i01k(ayVar2, i5, i4, i6, i)) {
                        WRKkgoJXwDn wRKkgoJXwDn = (WRKkgoJXwDn) unsafe.getObject(ayVar2, j);
                        nx0 XnEVoBF0td1l2 = vd0Var.XnEVoBF0td1l(i5);
                        encWxUiV27 = pb.encWxUiV2(i8) * 2;
                        GWasM1elztuh = wRKkgoJXwDn.GWasM1elztuh(XnEVoBF0td1l2);
                        X1lG3V04pd = GWasM1elztuh + encWxUiV27;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    X1lG3V04pd = ox0.X1lG3V04pd(i8, (List) unsafe.getObject(ayVar2, j));
                    i7 += X1lG3V04pd;
                    break;
                case 19:
                    X1lG3V04pd = ox0.Yi7zF1RB1(i8, (List) unsafe.getObject(ayVar2, j));
                    i7 += X1lG3V04pd;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(ayVar2, j);
                    Class cls2 = ox0.GWasM1elztuh;
                    if (list.size() != 0) {
                        encWxUiV28 = (pb.encWxUiV2(i8) * list.size()) + ox0.OOA6hdeuvCS(list);
                        i7 += encWxUiV28;
                        break;
                    }
                    encWxUiV28 = 0;
                    i7 += encWxUiV28;
                case 21:
                    List list2 = (List) unsafe.getObject(ayVar2, j);
                    Class cls3 = ox0.GWasM1elztuh;
                    size = list2.size();
                    if (size != 0) {
                        mOu10nynGul = ox0.mOu10nynGul(list2);
                        encWxUiV29 = pb.encWxUiV2(i8);
                        encWxUiV28 = (encWxUiV29 * size) + mOu10nynGul;
                        i7 += encWxUiV28;
                        break;
                    }
                    encWxUiV28 = 0;
                    i7 += encWxUiV28;
                case 22:
                    List list3 = (List) unsafe.getObject(ayVar2, j);
                    Class cls4 = ox0.GWasM1elztuh;
                    size = list3.size();
                    if (size != 0) {
                        mOu10nynGul = ox0.xqGvceK5x(list3);
                        encWxUiV29 = pb.encWxUiV2(i8);
                        encWxUiV28 = (encWxUiV29 * size) + mOu10nynGul;
                        i7 += encWxUiV28;
                        break;
                    }
                    encWxUiV28 = 0;
                    i7 += encWxUiV28;
                case 23:
                    X1lG3V04pd = ox0.X1lG3V04pd(i8, (List) unsafe.getObject(ayVar2, j));
                    i7 += X1lG3V04pd;
                    break;
                case 24:
                    X1lG3V04pd = ox0.Yi7zF1RB1(i8, (List) unsafe.getObject(ayVar2, j));
                    i7 += X1lG3V04pd;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(ayVar2, j);
                    Class cls5 = ox0.GWasM1elztuh;
                    int size3 = list4.size();
                    i7 += size3 == 0 ? 0 : (pb.encWxUiV2(i8) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(ayVar2, j);
                    Class cls6 = ox0.GWasM1elztuh;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        encWxUiV28 = pb.encWxUiV2(i8) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof c9) {
                                int size5 = ((c9) obj).size();
                                encWxUiV28 = pb.mOu10nynGul(size5) + size5 + encWxUiV28;
                            } else {
                                encWxUiV28 = pb.AvO7iQsrTN((String) obj) + encWxUiV28;
                            }
                        }
                        i7 += encWxUiV28;
                        break;
                    }
                    encWxUiV28 = 0;
                    i7 += encWxUiV28;
                case 27:
                    List list6 = (List) unsafe.getObject(ayVar2, j);
                    nx0 XnEVoBF0td1l3 = vd0Var.XnEVoBF0td1l(i5);
                    Class cls7 = ox0.GWasM1elztuh;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        encWxUiV210 = pb.encWxUiV2(i8) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int GWasM1elztuh3 = ((WRKkgoJXwDn) list6.get(i17)).GWasM1elztuh(XnEVoBF0td1l3);
                            encWxUiV210 += pb.mOu10nynGul(GWasM1elztuh3) + GWasM1elztuh3;
                        }
                        i7 += encWxUiV210;
                        break;
                    }
                    encWxUiV210 = 0;
                    i7 += encWxUiV210;
                case 28:
                    List list7 = (List) unsafe.getObject(ayVar2, j);
                    Class cls8 = ox0.GWasM1elztuh;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        encWxUiV28 = pb.encWxUiV2(i8) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((c9) list7.get(i18)).size();
                            encWxUiV28 += pb.mOu10nynGul(size8) + size8;
                        }
                        i7 += encWxUiV28;
                        break;
                    }
                    encWxUiV28 = 0;
                    i7 += encWxUiV28;
                case 29:
                    List list8 = (List) unsafe.getObject(ayVar2, j);
                    Class cls9 = ox0.GWasM1elztuh;
                    size = list8.size();
                    if (size != 0) {
                        mOu10nynGul = ox0.encWxUiV2(list8);
                        encWxUiV29 = pb.encWxUiV2(i8);
                        encWxUiV28 = (encWxUiV29 * size) + mOu10nynGul;
                        i7 += encWxUiV28;
                        break;
                    }
                    encWxUiV28 = 0;
                    i7 += encWxUiV28;
                case 30:
                    List list9 = (List) unsafe.getObject(ayVar2, j);
                    Class cls10 = ox0.GWasM1elztuh;
                    size = list9.size();
                    if (size != 0) {
                        mOu10nynGul = ox0.GWasM1elztuh(list9);
                        encWxUiV29 = pb.encWxUiV2(i8);
                        encWxUiV28 = (encWxUiV29 * size) + mOu10nynGul;
                        i7 += encWxUiV28;
                        break;
                    }
                    encWxUiV28 = 0;
                    i7 += encWxUiV28;
                case 31:
                    X1lG3V04pd = ox0.Yi7zF1RB1(i8, (List) unsafe.getObject(ayVar2, j));
                    i7 += X1lG3V04pd;
                    break;
                case 32:
                    X1lG3V04pd = ox0.X1lG3V04pd(i8, (List) unsafe.getObject(ayVar2, j));
                    i7 += X1lG3V04pd;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(ayVar2, j);
                    Class cls11 = ox0.GWasM1elztuh;
                    size = list10.size();
                    if (size != 0) {
                        mOu10nynGul = ox0.EljAMC1QTz(list10);
                        encWxUiV29 = pb.encWxUiV2(i8);
                        encWxUiV28 = (encWxUiV29 * size) + mOu10nynGul;
                        i7 += encWxUiV28;
                        break;
                    }
                    encWxUiV28 = 0;
                    i7 += encWxUiV28;
                case 34:
                    List list11 = (List) unsafe.getObject(ayVar2, j);
                    Class cls12 = ox0.GWasM1elztuh;
                    size = list11.size();
                    if (size != 0) {
                        mOu10nynGul = ox0.AvO7iQsrTN(list11);
                        encWxUiV29 = pb.encWxUiV2(i8);
                        encWxUiV28 = (encWxUiV29 * size) + mOu10nynGul;
                        i7 += encWxUiV28;
                        break;
                    }
                    encWxUiV28 = 0;
                    i7 += encWxUiV28;
                case 35:
                    List list12 = (List) unsafe.getObject(ayVar2, j);
                    Class cls13 = ox0.GWasM1elztuh;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(ayVar2, j);
                    Class cls14 = ox0.GWasM1elztuh;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = ox0.OOA6hdeuvCS((List) unsafe.getObject(ayVar2, j));
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = ox0.mOu10nynGul((List) unsafe.getObject(ayVar2, j));
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = ox0.xqGvceK5x((List) unsafe.getObject(ayVar2, j));
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(ayVar2, j);
                    Class cls15 = ox0.GWasM1elztuh;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(ayVar2, j);
                    Class cls16 = ox0.GWasM1elztuh;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(ayVar2, j);
                    Class cls17 = ox0.GWasM1elztuh;
                    size2 = list16.size();
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = ox0.encWxUiV2((List) unsafe.getObject(ayVar2, j));
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = ox0.GWasM1elztuh((List) unsafe.getObject(ayVar2, j));
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(ayVar2, j);
                    Class cls18 = ox0.GWasM1elztuh;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(ayVar2, j);
                    Class cls19 = ox0.GWasM1elztuh;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = ox0.EljAMC1QTz((List) unsafe.getObject(ayVar2, j));
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = ox0.AvO7iQsrTN((List) unsafe.getObject(ayVar2, j));
                    if (size2 > 0) {
                        encWxUiV211 = pb.encWxUiV2(i8);
                        mOu10nynGul2 = pb.mOu10nynGul(size2);
                        i2 = mOu10nynGul2 + encWxUiV211;
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(ayVar2, j);
                    nx0 XnEVoBF0td1l4 = vd0Var.XnEVoBF0td1l(i5);
                    Class cls20 = ox0.GWasM1elztuh;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            i3 += ((WRKkgoJXwDn) list19.get(i19)).GWasM1elztuh(XnEVoBF0td1l4) + (pb.encWxUiV2(i8) * 2);
                        }
                    }
                    i7 += i3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(ayVar2, j);
                    Object obj2 = vd0Var.Yi7zF1RB1[(i5 / 3) * 2];
                    vd0Var.XnEVoBF0td1l.getClass();
                    nc0 nc0Var = (nc0) object3;
                    mc0 mc0Var = (mc0) obj2;
                    if (!nc0Var.isEmpty()) {
                        encWxUiV210 = 0;
                        for (Map.Entry entry : nc0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            mc0Var.getClass();
                            int encWxUiV214 = pb.encWxUiV2(i8);
                            int GWasM1elztuh4 = mc0.GWasM1elztuh(mc0Var.GWasM1elztuh, key, value);
                            encWxUiV210 += pb.mOu10nynGul(GWasM1elztuh4) + GWasM1elztuh4 + encWxUiV214;
                        }
                        i7 += encWxUiV210;
                        break;
                    }
                    encWxUiV210 = 0;
                    i7 += encWxUiV210;
                case 51:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        encWxUiV2 = pb.encWxUiV2(i8);
                        X1lG3V04pd = encWxUiV2 + 8;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        encWxUiV212 = pb.encWxUiV2(i8);
                        X1lG3V04pd = encWxUiV212 + 4;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        long arNh8D4Z5gB = arNh8D4Z5gB(j, ayVar2);
                        size2 = pb.encWxUiV2(i8);
                        i2 = pb.JFJ3QoxA(arNh8D4Z5gB);
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        long arNh8D4Z5gB2 = arNh8D4Z5gB(j, ayVar2);
                        size2 = pb.encWxUiV2(i8);
                        i2 = pb.JFJ3QoxA(arNh8D4Z5gB2);
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        int WRKkgoJXwDn = WRKkgoJXwDn(j, ayVar2);
                        encWxUiV27 = pb.encWxUiV2(i8);
                        GWasM1elztuh = pb.JFJ3QoxA(WRKkgoJXwDn);
                        X1lG3V04pd = GWasM1elztuh + encWxUiV27;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        encWxUiV2 = pb.encWxUiV2(i8);
                        X1lG3V04pd = encWxUiV2 + 8;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        encWxUiV212 = pb.encWxUiV2(i8);
                        X1lG3V04pd = encWxUiV212 + 4;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        X1lG3V04pd = pb.encWxUiV2(i8) + 1;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        Object object4 = unsafe.getObject(ayVar2, j);
                        i7 = (object4 instanceof c9 ? pb.EljAMC1QTz(i8, (c9) object4) : pb.AvO7iQsrTN((String) object4) + pb.encWxUiV2(i8)) + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        Object object5 = unsafe.getObject(ayVar2, j);
                        nx0 XnEVoBF0td1l5 = vd0Var.XnEVoBF0td1l(i5);
                        Class cls21 = ox0.GWasM1elztuh;
                        int encWxUiV215 = pb.encWxUiV2(i8);
                        int GWasM1elztuh5 = ((WRKkgoJXwDn) object5).GWasM1elztuh(XnEVoBF0td1l5);
                        mOu10nynGul3 = pb.mOu10nynGul(GWasM1elztuh5) + GWasM1elztuh5 + encWxUiV215;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        X1lG3V04pd = pb.EljAMC1QTz(i8, (c9) unsafe.getObject(ayVar2, j));
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        int WRKkgoJXwDn2 = WRKkgoJXwDn(j, ayVar2);
                        encWxUiV27 = pb.encWxUiV2(i8);
                        GWasM1elztuh = pb.mOu10nynGul(WRKkgoJXwDn2);
                        X1lG3V04pd = GWasM1elztuh + encWxUiV27;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        int WRKkgoJXwDn3 = WRKkgoJXwDn(j, ayVar2);
                        encWxUiV27 = pb.encWxUiV2(i8);
                        GWasM1elztuh = pb.JFJ3QoxA(WRKkgoJXwDn3);
                        X1lG3V04pd = GWasM1elztuh + encWxUiV27;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        encWxUiV212 = pb.encWxUiV2(i8);
                        X1lG3V04pd = encWxUiV212 + 4;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        encWxUiV2 = pb.encWxUiV2(i8);
                        X1lG3V04pd = encWxUiV2 + 8;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        int WRKkgoJXwDn4 = WRKkgoJXwDn(j, ayVar2);
                        encWxUiV27 = pb.encWxUiV2(i8);
                        GWasM1elztuh = pb.mOu10nynGul((WRKkgoJXwDn4 >> 31) ^ (WRKkgoJXwDn4 << 1));
                        X1lG3V04pd = GWasM1elztuh + encWxUiV27;
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        long arNh8D4Z5gB3 = arNh8D4Z5gB(j, ayVar2);
                        size2 = pb.encWxUiV2(i8);
                        i2 = pb.JFJ3QoxA((arNh8D4Z5gB3 << 1) ^ (arNh8D4Z5gB3 >> 63));
                        mOu10nynGul3 = i2 + size2;
                        i7 += mOu10nynGul3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (vd0Var.YmKjaVtbfp5Z(i8, i5, ayVar2)) {
                        X1lG3V04pd = ((WRKkgoJXwDn) unsafe.getObject(ayVar2, j)).GWasM1elztuh(vd0Var.XnEVoBF0td1l(i5)) + (pb.encWxUiV2(i8) * 2);
                        i7 += X1lG3V04pd;
                        break;
                    } else {
                        break;
                    }
            }
            i5 += 3;
        }
    }
}
