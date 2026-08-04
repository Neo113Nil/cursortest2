package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b6 implements i6 {
    public static final int[] j = new int[0];
    public static final Unsafe k = t6.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final p4 e;
    public final int[] f;
    public final int g;
    public final int h;
    public final e5 i;

    public b6(int[] iArr, Object[] objArr, int i, int i2, p4 p4Var, int[] iArr2, int i3, int i4, e5 e5Var, e5 e5Var2) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = e5Var;
        this.e = p4Var;
    }

    public static int F(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof g5) {
            return ((g5) obj).e();
        }
        return true;
    }

    public static int k(long j2, Object obj) {
        return ((Integer) t6.j(j2, obj)).intValue();
    }

    public static long l(long j2, Object obj) {
        return ((Long) t6.j(j2, obj)).longValue();
    }

    public static final int s(byte[] bArr, int i, int i2, w6 w6Var, Class cls, s4 s4Var) throws p5 {
        w6 w6Var2 = w6.i;
        switch (w6Var.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = i + 8;
                s4Var.c = Double.valueOf(Double.longBitsToDouble(d5.i0(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                s4Var.c = Float.valueOf(Float.intBitsToFloat(d5.h0(i, bArr)));
                return i4;
            case 2:
            case 3:
                int iG0 = d5.g0(bArr, i, s4Var);
                s4Var.c = Long.valueOf(s4Var.b);
                return iG0;
            case 4:
            case 12:
            case 13:
                int iD0 = d5.d0(bArr, i, s4Var);
                s4Var.c = Integer.valueOf(s4Var.a);
                return iD0;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
            case 15:
                int i5 = i + 8;
                s4Var.c = Long.valueOf(d5.i0(i, bArr));
                return i5;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
            case 14:
                int i6 = i + 4;
                s4Var.c = Integer.valueOf(d5.h0(i, bArr));
                return i6;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                int iG1 = d5.g0(bArr, i, s4Var);
                s4Var.c = Boolean.valueOf(s4Var.b != 0);
                return iG1;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return d5.j0(bArr, i, s4Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                i6 i6VarA = f6.c.a(cls);
                g5 g5VarA = i6VarA.a();
                int iL0 = d5.l0(g5VarA, i6VarA, bArr, i, i2, s4Var);
                i6VarA.b(g5VarA);
                s4Var.c = g5VarA;
                return iL0;
            case RequestError.STOP_TRACKING /* 11 */:
                return d5.k0(bArr, i, s4Var);
            case 16:
                int iD1 = d5.d0(bArr, i, s4Var);
                s4Var.c = Integer.valueOf(com.gamericefishpro.space.wa.b.V(s4Var.a));
                return iD1;
            case 17:
                int iG2 = d5.g0(bArr, i, s4Var);
                s4Var.c = Long.valueOf(com.gamericefishpro.space.wa.b.W(s4Var.b));
                return iG2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0274  */
    /* JADX WARN: Code duplicated, block: B:126:0x0277  */
    /* JADX WARN: Code duplicated, block: B:129:0x0290  */
    /* JADX WARN: Code duplicated, block: B:130:0x0293  */
    /* JADX WARN: Code duplicated, block: B:171:0x035d  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b5  */
    public static b6 u(h6 h6Var, e5 e5Var, e5 e5Var2) {
        int i;
        int iCharAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Field fieldV;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldV2;
        int i28;
        Object obj2;
        Field fieldV3;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        if (!(h6Var instanceof h6)) {
            h6Var.getClass();
            throw new ClassCastException();
        }
        String str = h6Var.b;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i36 = iCharAt2 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                cCharAt13 = str.charAt(i35);
                if (cCharAt13 < 55296) {
                    break;
                }
                i36 |= (cCharAt13 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt13 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            i6 = 0;
            iCharAt = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            iArr = j;
            i2 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt8 = str.charAt(i38);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt3 = i39 | (cCharAt8 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt7 = str.charAt(i41);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt4 = i42 | (cCharAt7 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt6 = str.charAt(i44);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt5 = i45 | (cCharAt6 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt5 = str.charAt(i47);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt6 = i48 | (cCharAt5 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt4 = str.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt4 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt3 = str.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt7 = i54 | (cCharAt3 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int iCharAt8 = str.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    cCharAt2 = str.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                iCharAt8 = i57 | (cCharAt2 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int iCharAt9 = str.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    cCharAt = str.charAt(i59);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                iCharAt9 = i60 | (cCharAt << i61);
                i59 = i8;
            }
            int i62 = iCharAt3 + iCharAt3 + iCharAt4;
            i2 = iCharAt3;
            i35 = i59;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i63 = iCharAt7;
            i3 = iCharAt5;
            i4 = i63;
            i5 = iCharAt6;
            i6 = i62;
            i7 = iCharAt9;
        }
        Unsafe unsafe = k;
        Object[] objArr2 = h6Var.c;
        Class<?> cls = h6Var.a.getClass();
        int i64 = i7 + i4;
        int i65 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i65];
        int i66 = i64;
        int i67 = i7;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int iCharAt10 = str.charAt(i35);
            if (iCharAt10 >= i33) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i31 = i72 + 1;
                    cCharAt12 = str.charAt(i72);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i31;
                    length = i16;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i70;
            }
            int i74 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i75 = iCharAt11 & 8191;
                int i76 = 13;
                while (true) {
                    i30 = i74 + 1;
                    cCharAt11 = str.charAt(i74);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i74 = i30;
                    c = 55296;
                }
                iCharAt11 = i75 | (cCharAt11 << i76);
                i74 = i30;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i77 = iCharAt11 & 255;
            int i78 = iCharAt10;
            int i79 = iCharAt11 & 2048;
            if (i77 >= 51) {
                int i80 = i74 + 1;
                int iCharAt12 = str.charAt(i74);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i81 = iCharAt12 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i29 = i82 + 1;
                        cCharAt10 = str.charAt(i82);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i81 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i82 = i29;
                        c2 = 55296;
                    }
                    iCharAt12 = i81 | (cCharAt10 << i83);
                    i24 = i29;
                } else {
                    i24 = i80;
                }
                int i84 = i24;
                int i85 = i77 - 51;
                int i86 = iCharAt12;
                if (i85 == 9 || i85 == 17) {
                    i25 = i6 + 1;
                    int i87 = i69 / 3;
                    objArr3[i87 + i87 + 1] = objArr4[i6];
                } else {
                    if (i85 != 12) {
                        i26 = i79;
                    } else if (h6Var.a() == 1 || i79 != 0) {
                        i25 = i6 + 1;
                        int i88 = i69 / 3;
                        objArr3[i88 + i88 + 1] = objArr4[i6];
                    } else {
                        i26 = 0;
                    }
                    i27 = i86 + i86;
                    i79 = i26;
                    obj = objArr4[i27];
                    if (obj instanceof Field) {
                        fieldV2 = (Field) obj;
                    } else {
                        fieldV2 = v(cls, (String) obj);
                        objArr4[i27] = fieldV2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldV2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldV3 = (Field) obj2;
                    } else {
                        fieldV3 = v(cls, (String) obj2);
                        objArr4[i28] = fieldV3;
                    }
                    i19 = i84;
                    i22 = iObjectFieldOffset3;
                    i18 = 55296;
                    objArr = objArr3;
                    i2 = i2;
                    cls = cls;
                    i21 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV3);
                }
                i6 = i25;
                i26 = i79;
                i27 = i86 + i86;
                i79 = i26;
                obj = objArr4[i27];
                if (obj instanceof Field) {
                    fieldV2 = (Field) obj;
                } else {
                    fieldV2 = v(cls, (String) obj);
                    objArr4[i27] = fieldV2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldV2);
                i28 = i27 + 1;
                obj2 = objArr4[i28];
                if (obj2 instanceof Field) {
                    fieldV3 = (Field) obj2;
                } else {
                    fieldV3 = v(cls, (String) obj2);
                    objArr4[i28] = fieldV3;
                }
                i19 = i84;
                i22 = iObjectFieldOffset4;
                i18 = 55296;
                objArr = objArr3;
                i2 = i2;
                cls = cls;
                i21 = 0;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV3);
            } else {
                int i89 = i6 + 1;
                Field fieldV4 = v(cls, (String) objArr4[i6]);
                objArr = objArr3;
                if (i77 == 9 || i77 == 17) {
                    int i90 = i69 / 3;
                    objArr[i90 + i90 + 1] = fieldV4.getType();
                } else {
                    if (i77 != 27) {
                        if (i77 == 49) {
                            i6 += 2;
                            i23 = 1;
                        } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                            i2 = i2;
                            if (h6Var.a() == 1 || i79 != 0) {
                                i6 += 2;
                                int i91 = i69 / 3;
                                objArr[i91 + i91 + 1] = objArr4[i89];
                                cls = cls;
                            } else {
                                cls = cls;
                                i6 = i89;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i92 = i6 + 2;
                            i67++;
                            iArr[i67] = i69;
                            int i93 = i69 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArr4[i89];
                            if (i79 != 0) {
                                i6 += 3;
                                objArr[i94 + 1] = objArr4[i92];
                            } else {
                                i6 = i92;
                                i79 = 0;
                            }
                            i2 = i2;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i77 > 17) {
                            i18 = 55296;
                            i19 = i74;
                            i20 = 0;
                        } else {
                            int i95 = i74 + 1;
                            int iCharAt13 = str.charAt(i74);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i19 = i95 + 1;
                                    cCharAt9 = str.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i19;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                            } else {
                                i19 = i95;
                            }
                            int i98 = (iCharAt13 / 32) + i2 + i2;
                            Object obj3 = objArr4[i98];
                            if (obj3 instanceof Field) {
                                fieldV = (Field) obj3;
                            } else {
                                fieldV = v(cls, (String) obj3);
                                objArr4[i98] = fieldV;
                            }
                            i20 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV);
                            i18 = 55296;
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = iObjectFieldOffset;
                            i66++;
                        }
                        i21 = i20;
                        i22 = iObjectFieldOffset;
                    } else {
                        i23 = 1;
                        i6 += 2;
                    }
                    int i99 = i69 / 3;
                    objArr[i99 + i99 + i23] = objArr4[i89];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i18 = 55296;
                        i19 = i74;
                        i20 = 0;
                    } else {
                        i18 = 55296;
                        i19 = i74;
                        i20 = 0;
                    }
                    if (i77 >= 18) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                    i21 = i20;
                    i22 = iObjectFieldOffset;
                }
                cls = cls;
                i6 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i18 = 55296;
                    i19 = i74;
                    i20 = 0;
                } else {
                    i18 = 55296;
                    i19 = i74;
                    i20 = 0;
                }
                if (i77 >= 18) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
                i21 = i20;
                i22 = iObjectFieldOffset;
            }
            int i100 = i79;
            int i101 = i69 + 1;
            iArr2[i69] = i78;
            int i102 = i69 + 2;
            String str2 = str;
            iArr2[i101] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i100 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | i22;
            i69 += 3;
            iArr2[i102] = (i21 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr2 = objArr4;
            i33 = i18;
            length = i16;
            objArr3 = objArr;
            i2 = i2;
            i35 = i19;
            str = str2;
        }
        return new b6(iArr2, objArr3, i3, i5, h6Var.a, iArr, i7, i64, e5Var, e5Var2);
    }

    public static Field v(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(com.gamericefishpro.space.t0.y0.j(sb, " not found. Known fields are ", string), e);
        }
    }

    public final Object A(int i, Object obj) {
        i6 i6VarY = y(i);
        int iE = E(i) & 1048575;
        if (!o(i, obj)) {
            return i6VarY.a();
        }
        Object object = k.getObject(obj, iE);
        if (j(object)) {
            return object;
        }
        g5 g5VarA = i6VarY.a();
        if (object != null) {
            i6VarY.d(g5VarA, object);
        }
        return g5VarA;
    }

    public final void B(int i, Object obj, Object obj2) {
        k.putObject(obj, E(i) & 1048575, obj2);
        p(i, obj);
    }

    public final Object C(int i, int i2, Object obj) {
        i6 i6VarY = y(i2);
        if (!q(i, i2, obj)) {
            return i6VarY.a();
        }
        Object object = k.getObject(obj, E(i2) & 1048575);
        if (j(object)) {
            return object;
        }
        g5 g5VarA = i6VarY.a();
        if (object != null) {
            i6VarY.d(g5VarA, object);
        }
        return g5VarA;
    }

    public final void D(int i, int i2, Object obj, Object obj2) {
        k.putObject(obj, E(i2) & 1048575, obj2);
        t6.g(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int E(int i) {
        return this.a[i + 1];
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final g5 a() {
        return (g5) ((g5) this.e).o(4);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // com.gamericefishpro.space.i9.i6
    public final void b(Object obj) {
        if (!j(obj)) {
            return;
        }
        if (obj instanceof g5) {
            g5 g5Var = (g5) obj;
            g5Var.j();
            g5Var.zza = 0;
            g5Var.f();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.i.getClass();
                o6 o6Var = ((g5) obj).zzc;
                if (o6Var.e) {
                    o6Var.e = false;
                    return;
                }
                return;
            }
            int iE = E(i);
            int i2 = 1048575 & iE;
            int iF = F(iE);
            long j2 = i2;
            if (iF != 9) {
                if (iF != 60 && iF != 68) {
                    switch (iF) {
                        case 17:
                            if (o(i, obj)) {
                                y(i).b(k.getObject(obj, j2));
                            }
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
                        case RequestError.NETWORK_FAILURE /* 40 */:
                        case RequestError.NO_DEV_KEY /* 41 */:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            q4 q4Var = (q4) ((m5) t6.j(j2, obj));
                            if (q4Var.d) {
                                q4Var.d = false;
                            }
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            Unsafe unsafe = k;
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((x5) object).d = false;
                                unsafe.putObject(obj, j2, object);
                            }
                            break;
                    }
                } else if (q(iArr[i], i, obj)) {
                    y(i).b(k.getObject(obj, j2));
                }
            } else if (o(i, obj)) {
                y(i).b(k.getObject(obj, j2));
            }
            i += 3;
        }
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final boolean c(g5 g5Var, g5 g5Var2) {
        boolean zA;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iE = E(i);
                long j2 = iE & 1048575;
                switch (F(iE)) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (m(g5Var, g5Var2, i)) {
                            s6 s6Var = t6.c;
                            if (Double.doubleToLongBits(s6Var.f(j2, g5Var)) == Double.doubleToLongBits(s6Var.f(j2, g5Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (m(g5Var, g5Var2, i)) {
                            s6 s6Var2 = t6.c;
                            if (Float.floatToIntBits(s6Var2.d(j2, g5Var)) == Float.floatToIntBits(s6Var2.d(j2, g5Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (m(g5Var, g5Var2, i) && t6.h(j2, g5Var) == t6.h(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (m(g5Var, g5Var2, i) && t6.h(j2, g5Var) == t6.h(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (m(g5Var, g5Var2, i) && t6.f(j2, g5Var) == t6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        if (m(g5Var, g5Var2, i) && t6.h(j2, g5Var) == t6.h(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (m(g5Var, g5Var2, i) && t6.f(j2, g5Var) == t6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (m(g5Var, g5Var2, i)) {
                            s6 s6Var3 = t6.c;
                            if (s6Var3.b(j2, g5Var) == s6Var3.b(j2, g5Var2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (m(g5Var, g5Var2, i) && j6.a(t6.j(j2, g5Var), t6.j(j2, g5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (m(g5Var, g5Var2, i) && j6.a(t6.j(j2, g5Var), t6.j(j2, g5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (m(g5Var, g5Var2, i) && j6.a(t6.j(j2, g5Var), t6.j(j2, g5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (m(g5Var, g5Var2, i) && t6.f(j2, g5Var) == t6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (m(g5Var, g5Var2, i) && t6.f(j2, g5Var) == t6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (m(g5Var, g5Var2, i) && t6.f(j2, g5Var) == t6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (m(g5Var, g5Var2, i) && t6.h(j2, g5Var) == t6.h(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (m(g5Var, g5Var2, i) && t6.f(j2, g5Var) == t6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (m(g5Var, g5Var2, i) && t6.h(j2, g5Var) == t6.h(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (m(g5Var, g5Var2, i) && j6.a(t6.j(j2, g5Var), t6.j(j2, g5Var2))) {
                            continue;
                            i += 3;
                        }
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
                    case RequestError.NETWORK_FAILURE /* 40 */:
                    case RequestError.NO_DEV_KEY /* 41 */:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zA = j6.a(t6.j(j2, g5Var), t6.j(j2, g5Var2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        zA = j6.a(t6.j(j2, g5Var), t6.j(j2, g5Var2));
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
                        long j3 = iArr[i + 2] & 1048575;
                        if (t6.f(j3, g5Var) == t6.f(j3, g5Var2) && j6.a(t6.j(j2, g5Var), t6.j(j2, g5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zA) {
                    i += 3;
                }
            } else if (g5Var.zzc.equals(g5Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.gamericefishpro.space.i9.i6
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!j(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                j6.b(obj, obj2);
                return;
            }
            int iE = E(i);
            int i2 = iE & 1048575;
            int iF = F(iE);
            int i3 = iArr[i];
            long j2 = i2;
            switch (iF) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (!o(i, obj2)) {
                        obj3 = obj;
                    } else {
                        s6 s6Var = t6.c;
                        obj3 = obj;
                        s6Var.g(obj3, j2, s6Var.f(j2, obj2));
                        p(i, obj3);
                    }
                    break;
                case 1:
                    if (o(i, obj2)) {
                        s6 s6Var2 = t6.c;
                        s6Var2.e(obj, j2, s6Var2.d(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(i, obj2)) {
                        t6.i(obj, j2, t6.h(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(i, obj2)) {
                        t6.i(obj, j2, t6.h(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(i, obj2)) {
                        t6.g(obj, j2, t6.f(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    if (o(i, obj2)) {
                        t6.i(obj, j2, t6.h(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (o(i, obj2)) {
                        t6.g(obj, j2, t6.f(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (o(i, obj2)) {
                        s6 s6Var3 = t6.c;
                        s6Var3.c(obj, j2, s6Var3.b(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (o(i, obj2)) {
                        t6.k(j2, obj, t6.j(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (o(i, obj2)) {
                        t6.k(j2, obj, t6.j(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (o(i, obj2)) {
                        t6.g(obj, j2, t6.f(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (o(i, obj2)) {
                        t6.g(obj, j2, t6.f(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (o(i, obj2)) {
                        t6.g(obj, j2, t6.f(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (o(i, obj2)) {
                        t6.i(obj, j2, t6.h(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (o(i, obj2)) {
                        t6.g(obj, j2, t6.f(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (o(i, obj2)) {
                        t6.i(obj, j2, t6.h(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    w(i, obj, obj2);
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
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    m5 m5VarJ = (m5) t6.j(j2, obj);
                    m5 m5Var = (m5) t6.j(j2, obj2);
                    int size = m5VarJ.size();
                    int size2 = m5Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((q4) m5VarJ).d) {
                            m5VarJ = m5VarJ.j(size2 + size);
                        }
                        m5VarJ.addAll(m5Var);
                    }
                    if (size > 0) {
                        m5Var = m5VarJ;
                    }
                    t6.k(j2, obj, m5Var);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    e5 e5Var = j6.a;
                    t6.k(j2, obj, e5.c(t6.j(j2, obj), t6.j(j2, obj2)));
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
                    if (q(i3, i, obj2)) {
                        t6.k(j2, obj, t6.j(j2, obj2));
                        t6.g(obj, iArr[i + 2] & 1048575, i3);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i3, i, obj2)) {
                        t6.k(j2, obj, t6.j(j2, obj2));
                        t6.g(obj, iArr[i + 2] & 1048575, i3);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    x(i, obj, obj2);
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

    @Override // com.gamericefishpro.space.i9.i6
    public final void e(Object obj, v5 v5Var) throws y4 {
        int i;
        Unsafe unsafe = k;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                ((g5) obj).zzc.b(v5Var);
                return;
            }
            int iE = E(i3);
            int iF = F(iE);
            int i6 = iArr[i3];
            if (iF <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j2 = iE & i2;
            switch (iF) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).W(i6, Double.doubleToRawLongBits(t6.c.f(j2, obj)));
                    }
                    break;
                case 1:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).U(i6, Float.floatToRawIntBits(t6.c.d(j2, obj)));
                    }
                    break;
                case 2:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).V(i6, unsafe.getLong(obj, j2));
                    }
                    break;
                case 3:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).V(i6, unsafe.getLong(obj, j2));
                    }
                    break;
                case 4:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).S(i6, unsafe.getInt(obj, j2));
                    }
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).W(i6, unsafe.getLong(obj, j2));
                    }
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).U(i6, unsafe.getInt(obj, j2));
                    }
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(obj, i3, i5, i4, i)) {
                        boolean zB = t6.c.b(j2, obj);
                        x4 x4Var = (x4) v5Var.d;
                        x4Var.a0(i6 << 3);
                        x4Var.Y(zB ? (byte) 1 : (byte) 0);
                    }
                    break;
                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(obj, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            x4 x4Var2 = (x4) v5Var.d;
                            x4Var2.a0((i6 << 3) | 2);
                            x4Var2.f0((String) object);
                        } else {
                            x4 x4Var3 = (x4) v5Var.d;
                            x4Var3.a0((i6 << 3) | 2);
                            x4Var3.X((w4) object);
                        }
                    }
                    break;
                case 9:
                    if (n(obj, i3, i5, i4, i)) {
                        v5Var.d(i6, unsafe.getObject(obj, j2), y(i3));
                    }
                    break;
                case 10:
                    if (n(obj, i3, i5, i4, i)) {
                        w4 w4Var = (w4) unsafe.getObject(obj, j2);
                        x4 x4Var4 = (x4) v5Var.d;
                        x4Var4.a0((i6 << 3) | 2);
                        x4Var4.X(w4Var);
                    }
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).T(i6, unsafe.getInt(obj, j2));
                    }
                    break;
                case 12:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).S(i6, unsafe.getInt(obj, j2));
                    }
                    break;
                case 13:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).U(i6, unsafe.getInt(obj, j2));
                    }
                    break;
                case 14:
                    if (n(obj, i3, i5, i4, i)) {
                        ((x4) v5Var.d).W(i6, unsafe.getLong(obj, j2));
                    }
                    break;
                case 15:
                    if (n(obj, i3, i5, i4, i)) {
                        int i9 = unsafe.getInt(obj, j2);
                        ((x4) v5Var.d).T(i6, (i9 >> 31) ^ (i9 + i9));
                    }
                    break;
                case 16:
                    if (n(obj, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        ((x4) v5Var.d).V(i6, (j3 >> 63) ^ (j3 + j3));
                    }
                    break;
                case 17:
                    if (n(obj, i3, i5, i4, i)) {
                        v5Var.e(i6, unsafe.getObject(obj, j2), y(i3));
                    }
                    break;
                case 18:
                    j6.c(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 19:
                    j6.d(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 20:
                    j6.e(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 21:
                    j6.f(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 22:
                    j6.j(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 23:
                    j6.h(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 24:
                    j6.m(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 25:
                    j6.p(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 26:
                    int i10 = iArr[i3];
                    List list = (List) unsafe.getObject(obj, j2);
                    e5 e5Var = j6.a;
                    if (list != null && !list.isEmpty()) {
                        v5Var.getClass();
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            x4 x4Var5 = (x4) v5Var.d;
                            String str = (String) list.get(i11);
                            x4Var5.a0((i10 << 3) | 2);
                            x4Var5.f0(str);
                        }
                    }
                    break;
                case 27:
                    int i12 = iArr[i3];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    i6 i6VarY = y(i3);
                    e5 e5Var2 = j6.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            v5Var.d(i12, list2.get(i13), i6VarY);
                        }
                    }
                    break;
                case 28:
                    int i14 = iArr[i3];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    e5 e5Var3 = j6.a;
                    if (list3 != null && !list3.isEmpty()) {
                        v5Var.getClass();
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            x4 x4Var6 = (x4) v5Var.d;
                            w4 w4Var2 = (w4) list3.get(i15);
                            x4Var6.a0((i14 << 3) | 2);
                            x4Var6.X(w4Var2);
                        }
                    }
                    break;
                case 29:
                    j6.k(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 30:
                    j6.o(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 31:
                    j6.n(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 32:
                    j6.i(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 33:
                    j6.l(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 34:
                    j6.g(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, false);
                    break;
                case 35:
                    j6.c(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 36:
                    j6.d(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 37:
                    j6.e(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 38:
                    j6.f(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 39:
                    j6.j(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    j6.h(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    j6.m(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 42:
                    j6.p(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 43:
                    j6.k(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 44:
                    j6.o(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 45:
                    j6.n(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 46:
                    j6.i(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 47:
                    j6.l(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 48:
                    j6.g(iArr[i3], (List) unsafe.getObject(obj, j2), v5Var, true);
                    break;
                case 49:
                    int i16 = iArr[i3];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    i6 i6VarY2 = y(i3);
                    e5 e5Var4 = j6.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            v5Var.e(i16, list4.get(i17), i6VarY2);
                        }
                    }
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        int i18 = i3 / 3;
                        t tVar = ((w5) this.b[i18 + i18]).a;
                        v5Var.getClass();
                        for (Map.Entry entry : ((x5) object2).entrySet()) {
                            x4 x4Var7 = (x4) v5Var.d;
                            x4Var7.R(i6, 2);
                            x4Var7.a0(w5.b(tVar, entry.getKey(), entry.getValue()));
                            w5.a(x4Var7, tVar, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case 51:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).W(i6, Double.doubleToRawLongBits(((Double) t6.j(j2, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).U(i6, Float.floatToRawIntBits(((Float) t6.j(j2, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).V(i6, l(j2, obj));
                    }
                    break;
                case 54:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).V(i6, l(j2, obj));
                    }
                    break;
                case 55:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).S(i6, k(j2, obj));
                    }
                    break;
                case 56:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).W(i6, l(j2, obj));
                    }
                    break;
                case 57:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).U(i6, k(j2, obj));
                    }
                    break;
                case 58:
                    if (q(i6, i3, obj)) {
                        boolean zBooleanValue = ((Boolean) t6.j(j2, obj)).booleanValue();
                        x4 x4Var8 = (x4) v5Var.d;
                        x4Var8.a0(i6 << 3);
                        x4Var8.Y(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (q(i6, i3, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            x4 x4Var9 = (x4) v5Var.d;
                            x4Var9.a0((i6 << 3) | 2);
                            x4Var9.f0((String) object3);
                        } else {
                            x4 x4Var10 = (x4) v5Var.d;
                            x4Var10.a0((i6 << 3) | 2);
                            x4Var10.X((w4) object3);
                        }
                    }
                    break;
                case 60:
                    if (q(i6, i3, obj)) {
                        v5Var.d(i6, unsafe.getObject(obj, j2), y(i3));
                    }
                    break;
                case 61:
                    if (q(i6, i3, obj)) {
                        w4 w4Var3 = (w4) unsafe.getObject(obj, j2);
                        x4 x4Var11 = (x4) v5Var.d;
                        x4Var11.a0((i6 << 3) | 2);
                        x4Var11.X(w4Var3);
                    }
                    break;
                case 62:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).T(i6, k(j2, obj));
                    }
                    break;
                case 63:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).S(i6, k(j2, obj));
                    }
                    break;
                case 64:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).U(i6, k(j2, obj));
                    }
                    break;
                case 65:
                    if (q(i6, i3, obj)) {
                        ((x4) v5Var.d).W(i6, l(j2, obj));
                    }
                    break;
                case 66:
                    if (q(i6, i3, obj)) {
                        int iK = k(j2, obj);
                        ((x4) v5Var.d).T(i6, (iK >> 31) ^ (iK + iK));
                    }
                    break;
                case 67:
                    if (q(i6, i3, obj)) {
                        long jL = l(j2, obj);
                        ((x4) v5Var.d).V(i6, (jL >> 63) ^ (jL + jL));
                    }
                    break;
                case 68:
                    if (q(i6, i3, obj)) {
                        v5Var.e(i6, unsafe.getObject(obj, j2), y(i3));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final void f(Object obj, byte[] bArr, int i, int i2, s4 s4Var) {
        t(obj, bArr, i, i2, 0, s4Var);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.gamericefishpro.space.i9.i6
    public final int g(g5 g5Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                return g5Var.zzc.hashCode() + (i6 * 53);
            }
            int iE = E(i5);
            int i7 = 1048575 & iE;
            int iF = F(iE);
            int i8 = iArr[i5];
            long j2 = i7;
            int i9 = 1237;
            int iHashCode = 37;
            switch (iF) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(t6.c.f(j2, g5Var));
                    Charset charset = n5.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(t6.c.d(j2, g5Var));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = t6.h(j2, g5Var);
                    Charset charset2 = n5.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = t6.h(j2, g5Var);
                    Charset charset3 = n5.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = t6.f(j2, g5Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    i = i6 * 53;
                    jDoubleToLongBits = t6.h(j2, g5Var);
                    Charset charset4 = n5.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = t6.f(j2, g5Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    i3 = i6 * 53;
                    boolean zB = t6.c.b(j2, g5Var);
                    Charset charset5 = n5.a;
                    if (zB) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) t6.j(j2, g5Var)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objJ = t6.j(j2, g5Var);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = t6.j(j2, g5Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = t6.f(j2, g5Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iFloatToIntBits = t6.f(j2, g5Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = t6.f(j2, g5Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = t6.h(j2, g5Var);
                    Charset charset6 = n5.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = t6.f(j2, g5Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = t6.h(j2, g5Var);
                    Charset charset7 = n5.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objJ2 = t6.j(j2, g5Var);
                    if (objJ2 != null) {
                        iHashCode = objJ2.hashCode();
                    }
                    i6 = i4 + iHashCode;
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
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i6 * 53;
                    iFloatToIntBits = t6.j(j2, g5Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = t6.j(j2, g5Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (q(i8, i5, g5Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) t6.j(j2, g5Var)).doubleValue());
                        Charset charset8 = n5.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) t6.j(j2, g5Var)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (q(i8, i5, g5Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = l(j2, g5Var);
                        Charset charset9 = n5.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (q(i8, i5, g5Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = l(j2, g5Var);
                        Charset charset10 = n5.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = k(j2, g5Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (q(i8, i5, g5Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = l(j2, g5Var);
                        Charset charset11 = n5.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = k(j2, g5Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (q(i8, i5, g5Var)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) t6.j(j2, g5Var)).booleanValue();
                        Charset charset12 = n5.a;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) t6.j(j2, g5Var)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = t6.j(j2, g5Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = t6.j(j2, g5Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = k(j2, g5Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = k(j2, g5Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 64:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = k(j2, g5Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (q(i8, i5, g5Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = l(j2, g5Var);
                        Charset charset13 = n5.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = k(j2, g5Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (q(i8, i5, g5Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = l(j2, g5Var);
                        Charset charset14 = n5.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (q(i8, i5, g5Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = t6.j(j2, g5Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0491  */
    /* JADX WARN: Code duplicated, block: B:218:0x057f  */
    /* JADX WARN: Code duplicated, block: B:221:0x058d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5  */
    @Override // com.gamericefishpro.space.i9.i6
    public final int h(p4 p4Var) {
        int i;
        int iG0;
        int iP;
        int iG1;
        int iD;
        int iG2;
        int iB;
        int i2;
        int iG3;
        int iY;
        int i3;
        int iB2;
        int iG4;
        int size;
        int iR;
        int iG5;
        int iG6;
        int iG7;
        int size2;
        int iG8;
        int iB3;
        int iG9;
        int iP2;
        int iG10;
        int iD2;
        int iK;
        int iG11;
        Unsafe unsafe = k;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iC = 0;
        while (true) {
            int[] iArr = this.a;
            if (i6 >= iArr.length) {
                return ((g5) p4Var).zzc.c() + iC;
            }
            int iE = E(i6);
            int iF = F(iE);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & i4;
            if (iF <= 17) {
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(p4Var, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iE & i4;
            if (iF >= c5.e.d) {
                c5.i.getClass();
            }
            long j2 = i11;
            switch (iF) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (n(p4Var, i6, i5, i7, i)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 8, iC);
                    }
                    break;
                case 1:
                    if (n(p4Var, i6, i5, i7, i)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 4, iC);
                    }
                    break;
                case 2:
                    if (n(p4Var, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(p4Var, j2);
                        iG0 = x4.g0(i8 << 3);
                        iP = x4.P(j3);
                        iY = iP + iG0;
                        iC += iY;
                    }
                    break;
                case 3:
                    if (n(p4Var, i6, i5, i7, i)) {
                        long j4 = unsafe.getLong(p4Var, j2);
                        iG0 = x4.g0(i8 << 3);
                        iP = x4.P(j4);
                        iY = iP + iG0;
                        iC += iY;
                    }
                    break;
                case 4:
                    if (n(p4Var, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(p4Var, j2);
                        iG0 = x4.g0(i8 << 3);
                        iP = x4.P(j5);
                        iY = iP + iG0;
                        iC += iY;
                    }
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    if (n(p4Var, i6, i5, i7, i)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 8, iC);
                    }
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(p4Var, i6, i5, i7, i)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 4, iC);
                    }
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(p4Var, i6, i5, i7, i)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 1, iC);
                    }
                    break;
                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(p4Var, i6, i5, i7, i)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(p4Var, j2);
                        if (object instanceof w4) {
                            iG1 = x4.g0(i12);
                            iD = ((w4) object).d();
                            iC = com.gamericefishpro.space.m5.a.d(iD, iD, iG1, iC);
                        } else {
                            iG0 = x4.g0(i12);
                            iP = x4.Q((String) object);
                            iY = iP + iG0;
                            iC += iY;
                        }
                    }
                    break;
                case 9:
                    if (n(p4Var, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(p4Var, j2);
                        i6 i6VarY = y(i6);
                        e5 e5Var = j6.a;
                        iG2 = x4.g0(i8 << 3);
                        iB = ((p4) object2).b(i6VarY);
                        iC = com.gamericefishpro.space.m5.a.d(iB, iB, iG2, iC);
                    }
                    break;
                case 10:
                    if (n(p4Var, i6, i5, i7, i)) {
                        w4 w4Var = (w4) unsafe.getObject(p4Var, j2);
                        iG1 = x4.g0(i8 << 3);
                        iD = w4Var.d();
                        iC = com.gamericefishpro.space.m5.a.d(iD, iD, iG1, iC);
                    }
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (n(p4Var, i6, i5, i7, i)) {
                        i2 = unsafe.getInt(p4Var, j2);
                        iG3 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.c(i2, iG3, iC);
                    }
                    break;
                case 12:
                    if (n(p4Var, i6, i5, i7, i)) {
                        long j6 = unsafe.getInt(p4Var, j2);
                        iG0 = x4.g0(i8 << 3);
                        iP = x4.P(j6);
                        iY = iP + iG0;
                        iC += iY;
                    }
                    break;
                case 13:
                    if (n(p4Var, i6, i5, i7, i)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 4, iC);
                    }
                    break;
                case 14:
                    if (n(p4Var, i6, i5, i7, i)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 8, iC);
                    }
                    break;
                case 15:
                    if (n(p4Var, i6, i5, i7, i)) {
                        int i13 = unsafe.getInt(p4Var, j2);
                        iG3 = x4.g0(i8 << 3);
                        i2 = (i13 >> 31) ^ (i13 + i13);
                        iC = com.gamericefishpro.space.m5.a.c(i2, iG3, iC);
                    }
                    break;
                case 16:
                    if (n(p4Var, i6, i5, i7, i)) {
                        long j7 = unsafe.getLong(p4Var, j2);
                        iG0 = x4.g0(i8 << 3);
                        iP = x4.P((j7 >> 63) ^ (j7 + j7));
                        iY = iP + iG0;
                        iC += iY;
                    }
                    break;
                case 17:
                    if (n(p4Var, i6, i5, i7, i)) {
                        p4 p4Var2 = (p4) unsafe.getObject(p4Var, j2);
                        i6 i6VarY2 = y(i6);
                        int iG12 = x4.g0(i8 << 3);
                        i3 = iG12 + iG12;
                        iB2 = p4Var2.b(i6VarY2);
                        iY = iB2 + i3;
                        iC += iY;
                    }
                    break;
                case 18:
                    iY = j6.y(i8, (List) unsafe.getObject(p4Var, j2));
                    iC += iY;
                    break;
                case 19:
                    iY = j6.x(i8, (List) unsafe.getObject(p4Var, j2));
                    iC += iY;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var2 = j6.a;
                    if (list.size() == 0) {
                        iG4 = 0;
                    } else {
                        iG4 = (x4.g0(i8 << 3) * list.size()) + j6.q(list);
                    }
                    iC += iG4;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var3 = j6.a;
                    size = list2.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iR = j6.r(list2);
                        iG5 = x4.g0(i8 << 3);
                        iG6 = (iG5 * size) + iR;
                    }
                    iC += iG6;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var4 = j6.a;
                    size = list3.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iR = j6.u(list3);
                        iG5 = x4.g0(i8 << 3);
                        iG6 = (iG5 * size) + iR;
                    }
                    iC += iG6;
                    break;
                case 23:
                    iY = j6.y(i8, (List) unsafe.getObject(p4Var, j2));
                    iC += iY;
                    break;
                case 24:
                    iY = j6.x(i8, (List) unsafe.getObject(p4Var, j2));
                    iC += iY;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var5 = j6.a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iG4 = 0;
                    } else {
                        iG4 = (x4.g0(i8 << 3) + 1) * size3;
                    }
                    iC += iG4;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var6 = j6.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iG6 = 0;
                    } else {
                        iG6 = x4.g0(i8 << 3) * size4;
                        for (int i14 = 0; i14 < size4; i14++) {
                            Object obj = list5.get(i14);
                            if (obj instanceof w4) {
                                int iD3 = ((w4) obj).d();
                                iG6 = com.gamericefishpro.space.m5.a.c(iD3, iD3, iG6);
                            } else {
                                iG6 = x4.Q((String) obj) + iG6;
                            }
                        }
                    }
                    iC += iG6;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(p4Var, j2);
                    i6 i6VarY3 = y(i6);
                    e5 e5Var7 = j6.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iG7 = 0;
                    } else {
                        iG7 = x4.g0(i8 << 3) * size5;
                        for (int i15 = 0; i15 < size5; i15++) {
                            int iB4 = ((p4) list6.get(i15)).b(i6VarY3);
                            iG7 = com.gamericefishpro.space.m5.a.c(iB4, iB4, iG7);
                        }
                    }
                    iC += iG7;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var8 = j6.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iG6 = 0;
                    } else {
                        iG6 = x4.g0(i8 << 3) * size6;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int iD4 = ((w4) list7.get(i16)).d();
                            iG6 = com.gamericefishpro.space.m5.a.c(iD4, iD4, iG6);
                        }
                    }
                    iC += iG6;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var9 = j6.a;
                    size = list8.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iR = j6.v(list8);
                        iG5 = x4.g0(i8 << 3);
                        iG6 = (iG5 * size) + iR;
                    }
                    iC += iG6;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var10 = j6.a;
                    size = list9.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iR = j6.t(list9);
                        iG5 = x4.g0(i8 << 3);
                        iG6 = (iG5 * size) + iR;
                    }
                    iC += iG6;
                    break;
                case 31:
                    iY = j6.x(i8, (List) unsafe.getObject(p4Var, j2));
                    iC += iY;
                    break;
                case 32:
                    iY = j6.y(i8, (List) unsafe.getObject(p4Var, j2));
                    iC += iY;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var11 = j6.a;
                    size = list10.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iR = j6.w(list10);
                        iG5 = x4.g0(i8 << 3);
                        iG6 = (iG5 * size) + iR;
                    }
                    iC += iG6;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var12 = j6.a;
                    size = list11.size();
                    if (size == 0) {
                        iG6 = 0;
                    } else {
                        iR = j6.s(list11);
                        iG5 = x4.g0(i8 << 3);
                        iG6 = (iG5 * size) + iR;
                    }
                    iC += iG6;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var13 = j6.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var14 = j6.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 37:
                    size2 = j6.q((List) unsafe.getObject(p4Var, j2));
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 38:
                    size2 = j6.r((List) unsafe.getObject(p4Var, j2));
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 39:
                    size2 = j6.u((List) unsafe.getObject(p4Var, j2));
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    List list14 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var15 = j6.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    List list15 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var16 = j6.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var17 = j6.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 43:
                    size2 = j6.v((List) unsafe.getObject(p4Var, j2));
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 44:
                    size2 = j6.t((List) unsafe.getObject(p4Var, j2));
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var18 = j6.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(p4Var, j2);
                    e5 e5Var19 = j6.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 47:
                    size2 = j6.w((List) unsafe.getObject(p4Var, j2));
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 48:
                    size2 = j6.s((List) unsafe.getObject(p4Var, j2));
                    if (size2 > 0) {
                        iG8 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.d(size2, iG8, size2, iC);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(p4Var, j2);
                    i6 i6VarY4 = y(i6);
                    e5 e5Var20 = j6.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iB3 = 0;
                    } else {
                        iB3 = 0;
                        for (int i17 = 0; i17 < size7; i17++) {
                            p4 p4Var3 = (p4) list19.get(i17);
                            int iG13 = x4.g0(i8 << 3);
                            iB3 += p4Var3.b(i6VarY4) + iG13 + iG13;
                        }
                    }
                    iC += iB3;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    int i18 = i6 / 3;
                    x5 x5Var = (x5) unsafe.getObject(p4Var, j2);
                    w5 w5Var = (w5) this.b[i18 + i18];
                    if (x5Var.isEmpty()) {
                        iG6 = 0;
                    } else {
                        iG6 = 0;
                        for (Map.Entry entry : x5Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            t tVar = w5Var.a;
                            int iG14 = x4.g0(i8 << 3);
                            int iB5 = w5.b(tVar, key, value);
                            iG6 = com.gamericefishpro.space.m5.a.d(iB5, iB5, iG14, iG6);
                        }
                    }
                    iC += iG6;
                    break;
                case 51:
                    if (q(i8, i6, p4Var)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 8, iC);
                    }
                    break;
                case 52:
                    if (q(i8, i6, p4Var)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 4, iC);
                    }
                    break;
                case 53:
                    if (q(i8, i6, p4Var)) {
                        long jL = l(j2, p4Var);
                        iG9 = x4.g0(i8 << 3);
                        iP2 = x4.P(jL);
                        iC += iP2 + iG9;
                    }
                    break;
                case 54:
                    if (q(i8, i6, p4Var)) {
                        long jL2 = l(j2, p4Var);
                        iG9 = x4.g0(i8 << 3);
                        iP2 = x4.P(jL2);
                        iC += iP2 + iG9;
                    }
                    break;
                case 55:
                    if (q(i8, i6, p4Var)) {
                        long jK = k(j2, p4Var);
                        iG9 = x4.g0(i8 << 3);
                        iP2 = x4.P(jK);
                        iC += iP2 + iG9;
                    }
                    break;
                case 56:
                    if (q(i8, i6, p4Var)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 8, iC);
                    }
                    break;
                case 57:
                    if (q(i8, i6, p4Var)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 4, iC);
                    }
                    break;
                case 58:
                    if (q(i8, i6, p4Var)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 1, iC);
                    }
                    break;
                case 59:
                    if (q(i8, i6, p4Var)) {
                        int i19 = i8 << 3;
                        Object object3 = unsafe.getObject(p4Var, j2);
                        if (object3 instanceof w4) {
                            iG10 = x4.g0(i19);
                            iD2 = ((w4) object3).d();
                            iC = com.gamericefishpro.space.m5.a.d(iD2, iD2, iG10, iC);
                        } else {
                            iG9 = x4.g0(i19);
                            iP2 = x4.Q((String) object3);
                            iC += iP2 + iG9;
                        }
                    }
                    break;
                case 60:
                    if (q(i8, i6, p4Var)) {
                        Object object4 = unsafe.getObject(p4Var, j2);
                        i6 i6VarY5 = y(i6);
                        e5 e5Var21 = j6.a;
                        iG2 = x4.g0(i8 << 3);
                        iB = ((p4) object4).b(i6VarY5);
                        iC = com.gamericefishpro.space.m5.a.d(iB, iB, iG2, iC);
                    }
                    break;
                case 61:
                    if (q(i8, i6, p4Var)) {
                        w4 w4Var2 = (w4) unsafe.getObject(p4Var, j2);
                        iG10 = x4.g0(i8 << 3);
                        iD2 = w4Var2.d();
                        iC = com.gamericefishpro.space.m5.a.d(iD2, iD2, iG10, iC);
                    }
                    break;
                case 62:
                    if (q(i8, i6, p4Var)) {
                        iK = k(j2, p4Var);
                        iG11 = x4.g0(i8 << 3);
                        iC = com.gamericefishpro.space.m5.a.c(iK, iG11, iC);
                    }
                    break;
                case 63:
                    if (q(i8, i6, p4Var)) {
                        long jK2 = k(j2, p4Var);
                        iG9 = x4.g0(i8 << 3);
                        iP2 = x4.P(jK2);
                        iC += iP2 + iG9;
                    }
                    break;
                case 64:
                    if (q(i8, i6, p4Var)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 4, iC);
                    }
                    break;
                case 65:
                    if (q(i8, i6, p4Var)) {
                        iC = com.gamericefishpro.space.m5.a.c(i8 << 3, 8, iC);
                    }
                    break;
                case 66:
                    if (q(i8, i6, p4Var)) {
                        int iK2 = k(j2, p4Var);
                        iG11 = x4.g0(i8 << 3);
                        iK = (iK2 >> 31) ^ (iK2 + iK2);
                        iC = com.gamericefishpro.space.m5.a.c(iK, iG11, iC);
                    }
                    break;
                case 67:
                    if (q(i8, i6, p4Var)) {
                        long jL3 = l(j2, p4Var);
                        iG9 = x4.g0(i8 << 3);
                        iP2 = x4.P((jL3 >> 63) ^ (jL3 + jL3));
                        iC += iP2 + iG9;
                    }
                    break;
                case 68:
                    if (q(i8, i6, p4Var)) {
                        p4 p4Var4 = (p4) unsafe.getObject(p4Var, j2);
                        i6 i6VarY6 = y(i6);
                        int iG15 = x4.g0(i8 << 3);
                        i3 = iG15 + iG15;
                        iB2 = p4Var4.b(i6VarY6);
                        iY = iB2 + i3;
                        iC += iY;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final boolean i(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.g) {
            int i6 = this.f[i4];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iE = E(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = k.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iE) == 0 || n(obj, i6, i, i2, i10)) {
                int iF = F(iE);
                if (iF != 9 && iF != 17) {
                    if (iF != 27) {
                        if (iF == 60 || iF == 68) {
                            if (!q(i7, i6, obj) || y(i6).i(t6.j(iE & 1048575, obj))) {
                                i4++;
                                i5 = i;
                                i3 = i2;
                            }
                        } else if (iF != 49) {
                            if (iF != 50) {
                                continue;
                            } else {
                                x5 x5Var = (x5) t6.j(iE & 1048575, obj);
                                if (x5Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i12 = i6 / 3;
                                    if (((w6) ((w5) this.b[i12 + i12]).a.b).d == x6.B) {
                                        i6 i6VarA = null;
                                        for (Object obj2 : x5Var.values()) {
                                            if (i6VarA == null) {
                                                i6VarA = f6.c.a(obj2.getClass());
                                            }
                                            if (!i6VarA.i(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i4++;
                            i5 = i;
                            i3 = i2;
                        }
                    }
                    List list = (List) t6.j(iE & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        i6 i6VarY = y(i6);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (i6VarY.i(list.get(i13))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!n(obj, i6, i, i2, i10) || y(i6).i(t6.j(iE & 1048575, obj))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean m(g5 g5Var, g5 g5Var2, int i) {
        return o(i, g5Var) == o(i, g5Var2);
    }

    public final boolean n(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return o(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 == 1048575) {
            int iE = E(i);
            long j3 = iE & 1048575;
            switch (F(iE)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (Double.doubleToRawLongBits(t6.c.f(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(t6.c.d(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (t6.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (t6.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (t6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    if (t6.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (t6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    return t6.c.b(j3, obj);
                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                    Object objJ = t6.j(j3, obj);
                    if (objJ instanceof String) {
                        if (((String) objJ).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objJ instanceof w4)) {
                            throw new IllegalArgumentException();
                        }
                        if (w4.i.equals(objJ)) {
                            return false;
                        }
                    }
                case 9:
                    if (t6.j(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (w4.i.equals(t6.j(j3, obj))) {
                        return false;
                    }
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (t6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (t6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (t6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (t6.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (t6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (t6.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (t6.j(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & t6.f(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void p(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        t6.g(obj, j2, (1 << (i2 >>> 20)) | t6.f(j2, obj));
    }

    public final boolean q(int i, int i2, Object obj) {
        return t6.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final int r(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 44101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int t(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.gamericefishpro.space.i9.s4 r45) {
        /*
            Method dump skipped, instruction units count: 4410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.i9.b6.t(java.lang.Object, byte[], int, int, int, com.gamericefishpro.space.i9.s4):int");
    }

    public final void w(int i, Object obj, Object obj2) {
        if (o(i, obj2)) {
            int iE = E(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = iE;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i2 = this.a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            i6 i6VarY = y(i);
            if (!o(i, obj)) {
                if (j(object)) {
                    g5 g5VarA = i6VarY.a();
                    i6VarY.d(g5VarA, object);
                    unsafe.putObject(obj, j2, g5VarA);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                p(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!j(object2)) {
                g5 g5VarA2 = i6VarY.a();
                i6VarY.d(g5VarA2, object2);
                unsafe.putObject(obj, j2, g5VarA2);
                object2 = g5VarA2;
            }
            i6VarY.d(object2, object);
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            int iE = E(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = iE;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            i6 i6VarY = y(i);
            if (!q(i2, i, obj)) {
                if (j(object)) {
                    g5 g5VarA = i6VarY.a();
                    i6VarY.d(g5VarA, object);
                    unsafe.putObject(obj, j2, g5VarA);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                t6.g(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!j(object2)) {
                g5 g5VarA2 = i6VarY.a();
                i6VarY.d(g5VarA2, object2);
                unsafe.putObject(obj, j2, g5VarA2);
                object2 = g5VarA2;
            }
            i6VarY.d(object2, object);
        }
    }

    public final i6 y(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        i6 i6Var = (i6) objArr[i3];
        if (i6Var != null) {
            return i6Var;
        }
        i6 i6VarA = f6.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = i6VarA;
        return i6VarA;
    }

    public final j5 z(int i) {
        int i2 = i / 3;
        return (j5) this.b[i2 + i2 + 1];
    }
}
