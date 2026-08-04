package com.gamericefishpro.space.q4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements t0 {
    public static final int[] n = new int[0];
    public static final Unsafe o = e1.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final m0 j;
    public final z k;
    public final z0 l;
    public final g0 m;

    public k0(int[] iArr, Object[] objArr, int i, int i2, a aVar, int[] iArr2, int i3, int i4, m0 m0Var, z zVar, z0 z0Var, l lVar, g0 g0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = aVar instanceof s;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = m0Var;
        this.k = zVar;
        this.l = z0Var;
        this.e = aVar;
        this.m = g0Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbL = com.gamericefishpro.space.m5.a.l("Field ", str, " for ");
            sbL.append(cls.getName());
            sbL.append(" not found. Known fields are ");
            sbL.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbL.toString());
        }
    }

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof s) {
            return ((s) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0334  */
    /* JADX WARN: Code duplicated, block: B:177:0x037e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:183:0x0398  */
    public static k0 w(s0 s0Var, m0 m0Var, z zVar, z0 z0Var, l lVar, g0 g0Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
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
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int i22;
        int i23;
        Field fieldF;
        char cCharAt9;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldF2;
        int i27;
        Object obj2;
        Field fieldF3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        String str = s0Var.b;
        int length = str.length();
        int i32 = 55296;
        if (str.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i35 = iCharAt2 & 8191;
            int i36 = 13;
            while (true) {
                i31 = i34 + 1;
                cCharAt13 = str.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i31;
            }
            iCharAt2 = i35 | (cCharAt13 << i36);
            i34 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt3 = str.charAt(i34);
            if (iCharAt3 >= 55296) {
                int i38 = iCharAt3 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    cCharAt8 = str.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                iCharAt3 = i38 | (cCharAt8 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int iCharAt4 = str.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt7 = str.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt4 = i41 | (cCharAt7 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int iCharAt5 = str.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt6 = str.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt5 = i44 | (cCharAt6 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int iCharAt6 = str.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt5 = str.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt6 = i47 | (cCharAt5 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            iCharAt = str.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt4 = str.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt = i50 | (cCharAt4 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int iCharAt7 = str.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt3 = str.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt7 = i53 | (cCharAt3 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int iCharAt8 = str.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt2 = str.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt8 = i56 | (cCharAt2 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int iCharAt9 = str.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    cCharAt = str.charAt(i58);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                iCharAt9 = i59 | (cCharAt << i60);
                i58 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = (iCharAt3 * 2) + iCharAt4;
            int i62 = iCharAt7;
            i2 = iCharAt5;
            i3 = i62;
            i4 = iCharAt3;
            i34 = i58;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i61;
            i7 = iCharAt9;
        }
        Unsafe unsafe = o;
        Object[] objArr = s0Var.c;
        Class<?> cls = s0Var.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i63 = i7 + i3;
        int i64 = i63;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int iCharAt10 = str.charAt(i34);
            if (iCharAt10 >= i32) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                    length = i16;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i17 = i30;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i73 = iCharAt11 & 8191;
                int i74 = 13;
                while (true) {
                    i29 = i72 + 1;
                    cCharAt11 = str.charAt(i72);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i72 = i29;
                    c = 55296;
                }
                iCharAt11 = i73 | (cCharAt11 << i74);
                i72 = i29;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int[] iArr4 = iArr3;
            if (i75 >= 51) {
                int i77 = i72 + 1;
                int iCharAt12 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = 13;
                    while (true) {
                        i28 = i77 + 1;
                        cCharAt10 = str.charAt(i77);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i79;
                        i79 += 13;
                        i77 = i28;
                        c2 = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i79);
                    i77 = i28;
                }
                int i80 = i75 - 51;
                int i81 = i77;
                if (i80 == 9 || i80 == 17) {
                    i25 = i6 + 1;
                    objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i80 == 12 && (com.gamericefishpro.space.i3.e.a(s0Var.a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i25 = i6 + 1;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                    }
                    i26 = iCharAt12 * 2;
                    obj = objArr3[i26];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F(cls, (String) obj);
                        objArr3[i26] = fieldF2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                    i27 = i26 + 1;
                    obj2 = objArr3[i27];
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F(cls, (String) obj2);
                        objArr3[i27] = fieldF3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF3);
                    int i82 = i4;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i23 = iObjectFieldOffset3;
                    i18 = i82;
                    i22 = i6;
                    i20 = i81;
                    i21 = 0;
                    cls = cls;
                }
                i6 = i25;
                i26 = iCharAt12 * 2;
                obj = objArr3[i26];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr3[i26] = fieldF2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldF2);
                i27 = i26 + 1;
                obj2 = objArr3[i27];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr3[i27] = fieldF3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldF3);
                int i83 = i4;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i23 = iObjectFieldOffset5;
                i18 = i83;
                i22 = i6;
                i20 = i81;
                i21 = 0;
                cls = cls;
            } else {
                int i84 = i6 + 1;
                Field fieldF4 = F(cls, (String) objArr3[i6]);
                if (i75 == 9 || i75 == 17) {
                    i18 = i4;
                    objArr2[((i67 / 3) * 2) + 1] = fieldF4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i18 = i4;
                        i24 = i6 + 2;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i18 = i4;
                        if (s0Var.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i24 = i6 + 2;
                            objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        } else {
                            int i85 = i72 + 1;
                            int iCharAt13 = str.charAt(i72);
                            if (iCharAt13 >= 55296) {
                                int i86 = iCharAt13 & 8191;
                                int i87 = 13;
                                while (true) {
                                    i20 = i85 + 1;
                                    cCharAt9 = str.charAt(i85);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i86 |= (cCharAt9 & 8191) << i87;
                                    i87 += 13;
                                    i85 = i20;
                                }
                                iCharAt13 = i86 | (cCharAt9 << i87);
                            } else {
                                i20 = i85;
                            }
                            int i88 = (iCharAt13 / 32) + (i18 * 2);
                            Object obj3 = objArr3[i88];
                            if (obj3 instanceof Field) {
                                fieldF = (Field) obj3;
                            } else {
                                fieldF = F(cls, (String) obj3);
                                objArr3[i88] = fieldF;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                            i21 = iCharAt13 % 32;
                        }
                        if (i75 >= 18 || i75 > 49) {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        } else {
                            iArr[i64] = iObjectFieldOffset;
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                            i64++;
                        }
                    } else {
                        if (i75 == 50) {
                            int i89 = i65 + 1;
                            iArr[i65] = i67;
                            int i90 = (i67 / 3) * 2;
                            int i91 = i6 + 2;
                            objArr2[i90] = objArr3[i84];
                            if ((iCharAt11 & 2048) != 0) {
                                i19 = i6 + 3;
                                objArr2[i90 + 1] = objArr3[i91];
                                i18 = i4;
                                i65 = i89;
                            } else {
                                i19 = i91;
                                i65 = i89;
                                i18 = i4;
                            }
                        } else {
                            i18 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        }
                        if (i75 >= 18) {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        } else {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        }
                    }
                    i19 = i24;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i72;
                        i21 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i72;
                        i21 = 0;
                    }
                    if (i75 >= 18) {
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    } else {
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    }
                }
                i19 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i72;
                    i21 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i72;
                    i21 = 0;
                }
                if (i75 >= 18) {
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                } else {
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                }
            }
            int i92 = i67 + 1;
            iArr4[i67] = i76;
            int i93 = i67 + 2;
            String str2 = str;
            iArr4[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i23;
            i67 += 3;
            iArr4[i93] = (i21 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr = objArr3;
            str = str2;
            length = i16;
            i4 = i18;
            i34 = i20;
            i32 = 55296;
            i6 = i22;
            iArr3 = iArr4;
        }
        return new k0(iArr3, objArr2, i2, i5, s0Var.a, iArr, i7, i63, m0Var, zVar, z0Var, lVar, g0Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) e1.c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) e1.c.h(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i >= this.c && i <= this.d) {
            int[] iArr = this.a;
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
        }
        return -1;
    }

    public final void B(Object obj, long j, com.gamericefishpro.space.d4.z zVar, t0 t0Var, k kVar) throws v {
        int iZ;
        this.k.getClass();
        t tVarA = z.a(j, obj);
        com.gamericefishpro.space.d4.o0 o0Var = (com.gamericefishpro.space.d4.o0) zVar.d;
        int i = zVar.a;
        if ((i & 7) != 3) {
            throw w.b();
        }
        do {
            s sVarH = t0Var.h();
            zVar.e(sVarH, t0Var, kVar);
            t0Var.c(sVarH);
            ((r0) tVarA).add(sVarH);
            if (o0Var.c() || zVar.c != 0) {
                return;
            } else {
                iZ = o0Var.z();
            }
        } while (iZ == i);
        zVar.c = iZ;
    }

    public final void C(Object obj, int i, com.gamericefishpro.space.d4.z zVar, t0 t0Var, k kVar) throws w {
        int iZ;
        this.k.getClass();
        t tVarA = z.a(i & 1048575, obj);
        com.gamericefishpro.space.d4.o0 o0Var = (com.gamericefishpro.space.d4.o0) zVar.d;
        int i2 = zVar.a;
        if ((i2 & 7) != 2) {
            throw w.b();
        }
        do {
            s sVarH = t0Var.h();
            zVar.f(sVarH, t0Var, kVar);
            t0Var.c(sVarH);
            ((r0) tVarA).add(sVarH);
            if (o0Var.c() || zVar.c != 0) {
                return;
            } else {
                iZ = o0Var.z();
            }
        } while (iZ == i2);
        zVar.c = iZ;
    }

    public final void D(int i, com.gamericefishpro.space.d4.z zVar, Object obj) throws v {
        if ((536870912 & i) != 0) {
            zVar.z(2);
            e1.o(i & 1048575, obj, ((com.gamericefishpro.space.d4.o0) zVar.d).y());
        } else if (!this.f) {
            e1.o(i & 1048575, obj, zVar.h());
        } else {
            zVar.z(2);
            e1.o(i & 1048575, obj, ((com.gamericefishpro.space.d4.o0) zVar.d).x());
        }
    }

    public final void E(int i, com.gamericefishpro.space.d4.z zVar, Object obj) throws v {
        int i2 = 536870912 & i;
        z zVar2 = this.k;
        if (i2 != 0) {
            zVar2.getClass();
            zVar.v(z.a(i & 1048575, obj), true);
        } else {
            zVar2.getClass();
            zVar.v(z.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        e1.m(obj, j, (1 << (i2 >>> 20)) | e1.c.f(j, obj));
    }

    public final void H(int i, int i2, Object obj) {
        e1.m(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final void I(Object obj, int i, a aVar) {
        o.putObject(obj, L(i) & 1048575, aVar);
        G(i, obj);
    }

    public final void J(Object obj, int i, int i2, a aVar) {
        o.putObject(obj, L(i2) & 1048575, aVar);
        H(i, i2, obj);
    }

    public final int L(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:118:0x0337  */
    /* JADX WARN: Code duplicated, block: B:123:0x0346  */
    /* JADX WARN: Code duplicated, block: B:124:0x0358  */
    /* JADX WARN: Code duplicated, block: B:125:0x0369  */
    /* JADX WARN: Code duplicated, block: B:127:0x0372  */
    /* JADX WARN: Code duplicated, block: B:129:0x037b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0388  */
    /* JADX WARN: Code duplicated, block: B:131:0x0394  */
    /* JADX WARN: Code duplicated, block: B:133:0x0398  */
    /* JADX WARN: Code duplicated, block: B:135:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:137:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:138:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:141:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:142:0x03db  */
    /* JADX WARN: Code duplicated, block: B:143:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:145:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:146:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:147:0x0407  */
    /* JADX WARN: Code duplicated, block: B:148:0x0412  */
    /* JADX WARN: Code duplicated, block: B:149:0x0419  */
    /* JADX WARN: Code duplicated, block: B:279:0x0340 A[SYNTHETIC] */
    public final void M(Object obj, c0 c0Var) throws IOException {
        int i;
        c0 c0Var2;
        int i2;
        int i3;
        boolean z;
        int iB0;
        int size;
        int iA0;
        int iA;
        int iA1;
        int i4;
        int iZ0;
        int iB1;
        int size2;
        int iA2;
        k0 k0Var = this;
        c0 c0Var3 = c0Var;
        int[] iArr = k0Var.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int iL = k0Var.L(i7);
            int i9 = iArr[i7];
            int iK = K(iL);
            int i10 = 1;
            if (iK <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i5;
                if (i12 != i6) {
                    i8 = i12 == i5 ? 0 : unsafe.getInt(obj, i12);
                    i6 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            long j = iL & i5;
            switch (iK) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        double d = e1.c.d(j, obj);
                        i iVar = (i) c0Var2.a;
                        iVar.getClass();
                        iVar.L0(i9, Double.doubleToRawLongBits(d));
                    }
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 1:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        float fE = e1.c.e(j, obj);
                        i iVar2 = (i) c0Var2.a;
                        iVar2.getClass();
                        iVar2.J0(i9, Float.floatToRawIntBits(fE));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 2:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).V0(i9, unsafe.getLong(obj, j));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 3:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).V0(i9, unsafe.getLong(obj, j));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 4:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).N0(i9, unsafe.getInt(obj, j));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).L0(i9, unsafe.getLong(obj, j));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).J0(i9, unsafe.getInt(obj, j));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).G0(i9, e1.c.c(j, obj));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((i) c0Var2.a).Q0(i9, (String) object);
                        } else {
                            ((i) c0Var2.a).H0(i9, (f) object);
                        }
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 9:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).P0(i9, (a) unsafe.getObject(obj, j), k0Var.m(i7));
                    }
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 10:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).H0(i9, (f) unsafe.getObject(obj, j));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).T0(i9, unsafe.getInt(obj, j));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 12:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).N0(i9, unsafe.getInt(obj, j));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 13:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).J0(i9, unsafe.getInt(obj, j));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 14:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        ((i) c0Var2.a).L0(i9, unsafe.getLong(obj, j));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 15:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        int i13 = unsafe.getInt(obj, j);
                        ((i) c0Var2.a).T0(i9, (i13 >> 31) ^ (i13 << 1));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 16:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((i) c0Var2.a).V0(i9, (j2 >> 63) ^ (j2 << 1));
                    }
                    k0Var = this;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 17:
                    c0Var2 = c0Var3;
                    if (k0Var.o(obj, i7, i6, i8, i)) {
                        c0Var2.a(i9, unsafe.getObject(obj, j), k0Var.m(i7));
                    }
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 18:
                    i6 = i6;
                    i8 = i8;
                    c0Var2 = c0Var3;
                    u0.n(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 19:
                    i6 = i6;
                    i8 = i8;
                    c0Var2 = c0Var3;
                    u0.r(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 20:
                    i6 = i6;
                    i8 = i8;
                    c0Var2 = c0Var3;
                    u0.t(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 21:
                    i6 = i6;
                    i8 = i8;
                    c0Var2 = c0Var3;
                    u0.z(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 22:
                    i6 = i6;
                    i8 = i8;
                    c0Var2 = c0Var3;
                    u0.s(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 23:
                    i6 = i6;
                    i8 = i8;
                    c0Var2 = c0Var3;
                    u0.q(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 24:
                    i6 = i6;
                    i8 = i8;
                    c0Var2 = c0Var3;
                    u0.p(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 25:
                    i6 = i6;
                    i8 = i8;
                    c0Var2 = c0Var3;
                    u0.m(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 26:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    int i14 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = u0.a;
                    if (list != null && !list.isEmpty()) {
                        c0Var2.getClass();
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            ((i) c0Var2.a).Q0(i14, (String) list.get(i15));
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 27:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    int i16 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    t0 t0VarM = k0Var.m(i7);
                    Class cls2 = u0.a;
                    if (list2 != null && !list2.isEmpty()) {
                        c0Var2.getClass();
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            ((i) c0Var2.a).P0(i16, (a) list2.get(i17), t0VarM);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 28:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    int i18 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = u0.a;
                    if (list3 != null && !list3.isEmpty()) {
                        c0Var2.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((i) c0Var2.a).H0(i18, (f) list3.get(i19));
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 29:
                    c0Var2 = c0Var3;
                    z = false;
                    u0.y(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 30:
                    c0Var2 = c0Var3;
                    z = false;
                    u0.o(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 31:
                    c0Var2 = c0Var3;
                    z = false;
                    u0.u(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 32:
                    c0Var2 = c0Var3;
                    z = false;
                    u0.v(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 33:
                    c0Var2 = c0Var3;
                    z = false;
                    u0.w(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 34:
                    c0Var2 = c0Var3;
                    z = false;
                    u0.x(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 35:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.n(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 36:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.r(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 37:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.t(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 38:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.z(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 39:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.s(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.q(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.p(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 42:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.m(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 43:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.y(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 44:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.o(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 45:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.u(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 46:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.v(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 47:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.w(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 48:
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var3;
                    u0.x(iArr[i7], (List) unsafe.getObject(obj, j), c0Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 49:
                    i2 = i6;
                    i3 = i8;
                    int i20 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    t0 t0VarM2 = k0Var.m(i7);
                    Class cls4 = u0.a;
                    if (list4 != null && !list4.isEmpty()) {
                        c0Var.getClass();
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            c0Var.a(i20, list4.get(i21), t0VarM2);
                        }
                    }
                    c0Var2 = c0Var;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i22 = 2;
                        Object obj2 = k0Var.b[(i7 / 3) * 2];
                        k0Var.m.getClass();
                        d0 d0Var = ((e0) obj2).a;
                        m1 m1Var = d0Var.b;
                        m1 m1Var2 = d0Var.a;
                        i iVar3 = (i) c0Var3.a;
                        iVar3.getClass();
                        Iterator it = ((f0) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            iVar3.S0(i9, i22);
                            int i23 = i22;
                            Object key = entry.getKey();
                            int i24 = i10;
                            Object value = entry.getValue();
                            int i25 = n.c;
                            int iZ1 = i.z0(i24);
                            int i26 = i6;
                            j1 j1Var = m1.v;
                            if (m1Var2 == j1Var) {
                                iZ1 *= 2;
                            }
                            int i27 = i8;
                            Iterator it2 = it;
                            switch (m1Var2.ordinal()) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    ((Double) key).getClass();
                                    iB0 = 8;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key2);
                                            n.b(iVar3, m1Var, i23, value2);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key3);
                                            n.b(iVar3, m1Var, i23, value3);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key4);
                                            n.b(iVar3, m1Var, i23, value4);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key5);
                                            n.b(iVar3, m1Var, i23, value5);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key6);
                                            n.b(iVar3, m1Var, i23, value6);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key7);
                                            n.b(iVar3, m1Var, i23, value7);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key8);
                                            n.b(iVar3, m1Var, i23, value8);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key9);
                                            n.b(iVar3, m1Var, i23, value9);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key10);
                                            n.b(iVar3, m1Var, i23, value10);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11);
                                            n.b(iVar3, m1Var, i23, value11);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key12);
                                            n.b(iVar3, m1Var, i23, value12);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key13);
                                            n.b(iVar3, m1Var, i23, value13);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key14);
                                            n.b(iVar3, m1Var, i23, value14);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key15);
                                            n.b(iVar3, m1Var, i23, value15);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key16);
                                            n.b(iVar3, m1Var, i23, value16);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key17);
                                            n.b(iVar3, m1Var, i23, value17);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue >> 31) ^ (iIntValue << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key18);
                                            n.b(iVar3, m1Var, i23, value18);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue << i24) ^ (jLongValue >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key19);
                                            n.b(iVar3, m1Var, i23, value19);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iB0 = 4;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key110);
                                            n.b(iVar3, m1Var, i23, value110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111);
                                            n.b(iVar3, m1Var, i23, value111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key112);
                                            n.b(iVar3, m1Var, i23, value112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key113);
                                            n.b(iVar3, m1Var, i23, value113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key114);
                                            n.b(iVar3, m1Var, i23, value114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key115);
                                            n.b(iVar3, m1Var, i23, value115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key116);
                                            n.b(iVar3, m1Var, i23, value116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key117);
                                            n.b(iVar3, m1Var, i23, value117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key118);
                                            n.b(iVar3, m1Var, i23, value118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key119);
                                            n.b(iVar3, m1Var, i23, value119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1110);
                                            n.b(iVar3, m1Var, i23, value1110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111);
                                            n.b(iVar3, m1Var, i23, value1111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1112);
                                            n.b(iVar3, m1Var, i23, value1112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1113);
                                            n.b(iVar3, m1Var, i23, value1113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1114);
                                            n.b(iVar3, m1Var, i23, value1114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1115);
                                            n.b(iVar3, m1Var, i23, value1115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1116);
                                            n.b(iVar3, m1Var, i23, value1116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue2 << i24) ^ (jLongValue2 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1117);
                                            n.b(iVar3, m1Var, i23, value1117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    iB0 = i.B0(((Long) key).longValue());
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1118);
                                            n.b(iVar3, m1Var, i23, value1118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1119);
                                            n.b(iVar3, m1Var, i23, value1119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11110);
                                            n.b(iVar3, m1Var, i23, value11110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111);
                                            n.b(iVar3, m1Var, i23, value11111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11112);
                                            n.b(iVar3, m1Var, i23, value11112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11113);
                                            n.b(iVar3, m1Var, i23, value11113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11114);
                                            n.b(iVar3, m1Var, i23, value11114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11115);
                                            n.b(iVar3, m1Var, i23, value11115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11116);
                                            n.b(iVar3, m1Var, i23, value11116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11117);
                                            n.b(iVar3, m1Var, i23, value11117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11118);
                                            n.b(iVar3, m1Var, i23, value11118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11119);
                                            n.b(iVar3, m1Var, i23, value11119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111110);
                                            n.b(iVar3, m1Var, i23, value111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111);
                                            n.b(iVar3, m1Var, i23, value111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111112);
                                            n.b(iVar3, m1Var, i23, value111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111113);
                                            n.b(iVar3, m1Var, i23, value111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111114);
                                            n.b(iVar3, m1Var, i23, value111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue3 << i24) ^ (jLongValue3 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111115);
                                            n.b(iVar3, m1Var, i23, value111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    iB0 = i.B0(((Long) key).longValue());
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111116);
                                            n.b(iVar3, m1Var, i23, value111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111117);
                                            n.b(iVar3, m1Var, i23, value111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111118);
                                            n.b(iVar3, m1Var, i23, value111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111119);
                                            n.b(iVar3, m1Var, i23, value111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111110);
                                            n.b(iVar3, m1Var, i23, value1111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111);
                                            n.b(iVar3, m1Var, i23, value1111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111112);
                                            n.b(iVar3, m1Var, i23, value1111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111113);
                                            n.b(iVar3, m1Var, i23, value1111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111114);
                                            n.b(iVar3, m1Var, i23, value1111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111115);
                                            n.b(iVar3, m1Var, i23, value1111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111116);
                                            n.b(iVar3, m1Var, i23, value1111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111117);
                                            n.b(iVar3, m1Var, i23, value1111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111118);
                                            n.b(iVar3, m1Var, i23, value1111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111119);
                                            n.b(iVar3, m1Var, i23, value1111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111110);
                                            n.b(iVar3, m1Var, i23, value11111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111);
                                            n.b(iVar3, m1Var, i23, value11111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111112);
                                            n.b(iVar3, m1Var, i23, value11111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue4 << i24) ^ (jLongValue4 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111113);
                                            n.b(iVar3, m1Var, i23, value11111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    iB0 = i.B0(((Integer) key).intValue());
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111114);
                                            n.b(iVar3, m1Var, i23, value11111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111115);
                                            n.b(iVar3, m1Var, i23, value11111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111116);
                                            n.b(iVar3, m1Var, i23, value11111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111117);
                                            n.b(iVar3, m1Var, i23, value11111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111118);
                                            n.b(iVar3, m1Var, i23, value11111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111119);
                                            n.b(iVar3, m1Var, i23, value11111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111110);
                                            n.b(iVar3, m1Var, i23, value111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111);
                                            n.b(iVar3, m1Var, i23, value111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111112);
                                            n.b(iVar3, m1Var, i23, value111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111113);
                                            n.b(iVar3, m1Var, i23, value111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111114);
                                            n.b(iVar3, m1Var, i23, value111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111115);
                                            n.b(iVar3, m1Var, i23, value111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111116);
                                            n.b(iVar3, m1Var, i23, value111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111117);
                                            n.b(iVar3, m1Var, i23, value111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111118);
                                            n.b(iVar3, m1Var, i23, value111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111119);
                                            n.b(iVar3, m1Var, i23, value111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111110);
                                            n.b(iVar3, m1Var, i23, value1111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue5 << i24) ^ (jLongValue5 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111);
                                            n.b(iVar3, m1Var, i23, value1111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                    ((Long) key).getClass();
                                    iB0 = 8;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111112);
                                            n.b(iVar3, m1Var, i23, value1111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111113);
                                            n.b(iVar3, m1Var, i23, value1111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111114);
                                            n.b(iVar3, m1Var, i23, value1111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111115);
                                            n.b(iVar3, m1Var, i23, value1111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111116);
                                            n.b(iVar3, m1Var, i23, value1111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111117);
                                            n.b(iVar3, m1Var, i23, value1111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111118);
                                            n.b(iVar3, m1Var, i23, value1111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111119);
                                            n.b(iVar3, m1Var, i23, value1111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111110);
                                            n.b(iVar3, m1Var, i23, value11111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111);
                                            n.b(iVar3, m1Var, i23, value11111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111112);
                                            n.b(iVar3, m1Var, i23, value11111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111113);
                                            n.b(iVar3, m1Var, i23, value11111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111114);
                                            n.b(iVar3, m1Var, i23, value11111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111115);
                                            n.b(iVar3, m1Var, i23, value11111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111116);
                                            n.b(iVar3, m1Var, i23, value11111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111117);
                                            n.b(iVar3, m1Var, i23, value11111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111118);
                                            n.b(iVar3, m1Var, i23, value11111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue6 << i24) ^ (jLongValue6 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111119);
                                            n.b(iVar3, m1Var, i23, value11111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                    ((Integer) key).getClass();
                                    iB0 = 4;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111110);
                                            n.b(iVar3, m1Var, i23, value111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111);
                                            n.b(iVar3, m1Var, i23, value111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111112);
                                            n.b(iVar3, m1Var, i23, value111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111113);
                                            n.b(iVar3, m1Var, i23, value111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111114);
                                            n.b(iVar3, m1Var, i23, value111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111115);
                                            n.b(iVar3, m1Var, i23, value111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111116);
                                            n.b(iVar3, m1Var, i23, value111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111117);
                                            n.b(iVar3, m1Var, i23, value111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111118);
                                            n.b(iVar3, m1Var, i23, value111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111119);
                                            n.b(iVar3, m1Var, i23, value111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111110);
                                            n.b(iVar3, m1Var, i23, value1111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111);
                                            n.b(iVar3, m1Var, i23, value1111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111112);
                                            n.b(iVar3, m1Var, i23, value1111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111113);
                                            n.b(iVar3, m1Var, i23, value1111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111114);
                                            n.b(iVar3, m1Var, i23, value1111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111115);
                                            n.b(iVar3, m1Var, i23, value1111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111116);
                                            n.b(iVar3, m1Var, i23, value1111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue7 << i24) ^ (jLongValue7 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111117);
                                            n.b(iVar3, m1Var, i23, value1111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                    ((Boolean) key).getClass();
                                    iB0 = i24;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111118);
                                            n.b(iVar3, m1Var, i23, value1111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111119);
                                            n.b(iVar3, m1Var, i23, value1111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111110);
                                            n.b(iVar3, m1Var, i23, value11111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111);
                                            n.b(iVar3, m1Var, i23, value11111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111112);
                                            n.b(iVar3, m1Var, i23, value11111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111113);
                                            n.b(iVar3, m1Var, i23, value11111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111114);
                                            n.b(iVar3, m1Var, i23, value11111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111115);
                                            n.b(iVar3, m1Var, i23, value11111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111116);
                                            n.b(iVar3, m1Var, i23, value11111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111117);
                                            n.b(iVar3, m1Var, i23, value11111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111118);
                                            n.b(iVar3, m1Var, i23, value11111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111119);
                                            n.b(iVar3, m1Var, i23, value11111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111110);
                                            n.b(iVar3, m1Var, i23, value111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111);
                                            n.b(iVar3, m1Var, i23, value111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111112);
                                            n.b(iVar3, m1Var, i23, value111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111113);
                                            n.b(iVar3, m1Var, i23, value111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111114);
                                            n.b(iVar3, m1Var, i23, value111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue8 << i24) ^ (jLongValue8 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111115);
                                            n.b(iVar3, m1Var, i23, value111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                    if (key instanceof f) {
                                        size = ((f) key).size();
                                        iA0 = i.A0(size);
                                        iB0 = size + iA0;
                                    } else {
                                        iB0 = i.y0((String) key);
                                    }
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111116);
                                            n.b(iVar3, m1Var, i23, value111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111117);
                                            n.b(iVar3, m1Var, i23, value111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111118);
                                            n.b(iVar3, m1Var, i23, value111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111119);
                                            n.b(iVar3, m1Var, i23, value111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111110);
                                            n.b(iVar3, m1Var, i23, value1111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111);
                                            n.b(iVar3, m1Var, i23, value1111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111112);
                                            n.b(iVar3, m1Var, i23, value1111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111113);
                                            n.b(iVar3, m1Var, i23, value1111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111114);
                                            n.b(iVar3, m1Var, i23, value1111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111115);
                                            n.b(iVar3, m1Var, i23, value1111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111116);
                                            n.b(iVar3, m1Var, i23, value1111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111117);
                                            n.b(iVar3, m1Var, i23, value1111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111118);
                                            n.b(iVar3, m1Var, i23, value1111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111119);
                                            n.b(iVar3, m1Var, i23, value1111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111110);
                                            n.b(iVar3, m1Var, i23, value11111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111);
                                            n.b(iVar3, m1Var, i23, value11111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111112);
                                            n.b(iVar3, m1Var, i23, value11111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue9 << i24) ^ (jLongValue9 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111113);
                                            n.b(iVar3, m1Var, i23, value11111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    iA = ((s) ((a) key)).a(null);
                                    iB0 = iA;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111114);
                                            n.b(iVar3, m1Var, i23, value11111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111115);
                                            n.b(iVar3, m1Var, i23, value11111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111116);
                                            n.b(iVar3, m1Var, i23, value11111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111117);
                                            n.b(iVar3, m1Var, i23, value11111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111118);
                                            n.b(iVar3, m1Var, i23, value11111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111119);
                                            n.b(iVar3, m1Var, i23, value11111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111110);
                                            n.b(iVar3, m1Var, i23, value111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111);
                                            n.b(iVar3, m1Var, i23, value111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111112);
                                            n.b(iVar3, m1Var, i23, value111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111113);
                                            n.b(iVar3, m1Var, i23, value111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111114);
                                            n.b(iVar3, m1Var, i23, value111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111115);
                                            n.b(iVar3, m1Var, i23, value111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111116);
                                            n.b(iVar3, m1Var, i23, value111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111117);
                                            n.b(iVar3, m1Var, i23, value111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111118);
                                            n.b(iVar3, m1Var, i23, value111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111119);
                                            n.b(iVar3, m1Var, i23, value111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111110);
                                            n.b(iVar3, m1Var, i23, value1111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue10 << i24) ^ (jLongValue10 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    int iA3 = ((s) ((a) key)).a(null);
                                    iA = iA3 + i.A0(iA3);
                                    iB0 = iA;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111112);
                                            n.b(iVar3, m1Var, i23, value1111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111113);
                                            n.b(iVar3, m1Var, i23, value1111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111114);
                                            n.b(iVar3, m1Var, i23, value1111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111115);
                                            n.b(iVar3, m1Var, i23, value1111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111116);
                                            n.b(iVar3, m1Var, i23, value1111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111117);
                                            n.b(iVar3, m1Var, i23, value1111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111118);
                                            n.b(iVar3, m1Var, i23, value1111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111119);
                                            n.b(iVar3, m1Var, i23, value1111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111110);
                                            n.b(iVar3, m1Var, i23, value11111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111112);
                                            n.b(iVar3, m1Var, i23, value11111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111113);
                                            n.b(iVar3, m1Var, i23, value11111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111114);
                                            n.b(iVar3, m1Var, i23, value11111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111115);
                                            n.b(iVar3, m1Var, i23, value11111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111116);
                                            n.b(iVar3, m1Var, i23, value11111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111117);
                                            n.b(iVar3, m1Var, i23, value11111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111118);
                                            n.b(iVar3, m1Var, i23, value11111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue11 << i24) ^ (jLongValue11 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111119);
                                            n.b(iVar3, m1Var, i23, value11111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case RequestError.STOP_TRACKING /* 11 */:
                                    if (key instanceof f) {
                                        size = ((f) key).size();
                                        iA0 = i.A0(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        iA0 = i.A0(size);
                                    }
                                    iB0 = size + iA0;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue12 << i24) ^ (jLongValue12 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    iB0 = i.A0(((Integer) key).intValue());
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue13 << i24) ^ (jLongValue13 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    iB0 = i.B0(((Integer) key).intValue());
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue14 << i24) ^ (jLongValue14 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iB0 = 4;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue15 << i24) ^ (jLongValue15 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iB0 = 8;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue16 << i24) ^ (jLongValue16 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iA1 = i.A0((iIntValue17 << 1) ^ (iIntValue17 >> 31));
                                    iB0 = iA1;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue17 << i24) ^ (jLongValue17 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iA1 = i.B0((jLongValue18 << i24) ^ (jLongValue18 >> 63));
                                    iB0 = iA1;
                                    i4 = iB0 + iZ1;
                                    iZ0 = i.z0(i23);
                                    if (m1Var == j1Var) {
                                        iZ0 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key1111111111111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value1111111111111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 2:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 3:
                                            iB1 = i.B0(((Long) value).longValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 4:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB1 = i24;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = i.y0((String) value);
                                            }
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111116);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111116);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((s) ((a) value)).a(null);
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111117);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111117);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 10:
                                            size2 = ((s) ((a) value)).a(null);
                                            iA2 = i.A0(size2);
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111118);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111118);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size2 = ((f) value).size();
                                                iA2 = i.A0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = i.A0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key11111111111111111111111111111119);
                                            n.b(iVar3, m1Var, i23, value11111111111111111111111111111119);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 12:
                                            iB1 = i.A0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111111110);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111111110);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 13:
                                            iB1 = i.B0(((Integer) value).intValue());
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111111111);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111111111);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111111112);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111111112);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111111113);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111111113);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iB1 = i.A0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111111114);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111111114);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iB1 = i.B0((jLongValue19 << i24) ^ (jLongValue19 >> 63));
                                            iVar3.U0(iB1 + iZ0 + i4);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            n.b(iVar3, m1Var2, i24, key111111111111111111111111111111115);
                                            n.b(iVar3, m1Var, i23, value111111111111111111111111111111115);
                                            i22 = i23;
                                            i6 = i26;
                                            i8 = i27;
                                            it = it2;
                                            i10 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i2 = i6;
                    i3 = i8;
                    c0Var2 = c0Var;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 51:
                    if (k0Var.q(i9, i7, obj)) {
                        double dDoubleValue = ((Double) e1.c.h(j, obj)).doubleValue();
                        i iVar4 = (i) c0Var3.a;
                        iVar4.getClass();
                        iVar4.L0(i9, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 52:
                    if (k0Var.q(i9, i7, obj)) {
                        float fFloatValue = ((Float) e1.c.h(j, obj)).floatValue();
                        i iVar5 = (i) c0Var3.a;
                        iVar5.getClass();
                        iVar5.J0(i9, Float.floatToRawIntBits(fFloatValue));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 53:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).V0(i9, z(j, obj));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 54:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).V0(i9, z(j, obj));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 55:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).N0(i9, y(j, obj));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 56:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).L0(i9, z(j, obj));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 57:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).J0(i9, y(j, obj));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 58:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).G0(i9, ((Boolean) e1.c.h(j, obj)).booleanValue());
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 59:
                    if (k0Var.q(i9, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((i) c0Var3.a).Q0(i9, (String) object3);
                        } else {
                            ((i) c0Var3.a).H0(i9, (f) object3);
                        }
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 60:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).P0(i9, (a) unsafe.getObject(obj, j), k0Var.m(i7));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 61:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).H0(i9, (f) unsafe.getObject(obj, j));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 62:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).T0(i9, y(j, obj));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 63:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).N0(i9, y(j, obj));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 64:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).J0(i9, y(j, obj));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 65:
                    if (k0Var.q(i9, i7, obj)) {
                        ((i) c0Var3.a).L0(i9, z(j, obj));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 66:
                    if (k0Var.q(i9, i7, obj)) {
                        int iY = y(j, obj);
                        ((i) c0Var3.a).T0(i9, (iY >> 31) ^ (iY << 1));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 67:
                    if (k0Var.q(i9, i7, obj)) {
                        long jZ = z(j, obj);
                        ((i) c0Var3.a).V0(i9, (jZ << 1) ^ (jZ >> 63));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                case 68:
                    if (k0Var.q(i9, i7, obj)) {
                        c0Var3.a(i9, unsafe.getObject(obj, j), k0Var.m(i7));
                    }
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
                default:
                    c0Var2 = c0Var3;
                    i7 += 3;
                    c0Var3 = c0Var2;
                    i5 = 1048575;
                    break;
            }
        }
        k0Var.l.getClass();
        ((s) obj).unknownFields.d(c0Var3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // com.gamericefishpro.space.q4.t0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                u0.k(this.l, obj, obj2);
                return;
            }
            int iL = L(i);
            long j = 1048575 & iL;
            int i2 = iArr[i];
            switch (K(iL)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (!n(i, obj2)) {
                        obj3 = obj;
                    } else {
                        d1 d1Var = e1.c;
                        obj3 = obj;
                        d1Var.l(obj3, j, d1Var.d(j, obj2));
                        G(i, obj3);
                    }
                    break;
                case 1:
                    if (n(i, obj2)) {
                        d1 d1Var2 = e1.c;
                        d1Var2.m(obj, j, d1Var2.e(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        e1.n(obj, j, e1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        e1.n(obj, j, e1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        e1.m(obj, j, e1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    if (n(i, obj2)) {
                        e1.n(obj, j, e1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(i, obj2)) {
                        e1.m(obj, j, e1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i, obj2)) {
                        d1 d1Var3 = e1.c;
                        d1Var3.j(obj, j, d1Var3.c(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(i, obj2)) {
                        e1.o(j, obj, e1.c.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        e1.o(j, obj, e1.c.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (n(i, obj2)) {
                        e1.m(obj, j, e1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        e1.m(obj, j, e1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        e1.m(obj, j, e1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        e1.n(obj, j, e1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        e1.m(obj, j, e1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        e1.n(obj, j, e1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
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
                    this.k.getClass();
                    d1 d1Var4 = e1.c;
                    t tVarD = (t) d1Var4.h(j, obj);
                    t tVar = (t) d1Var4.h(j, obj2);
                    r0 r0Var = (r0) tVarD;
                    int i3 = r0Var.i;
                    int i4 = ((r0) tVar).i;
                    if (i3 > 0 && i4 > 0) {
                        if (!((b) tVarD).d) {
                            tVarD = r0Var.d(i4 + i3);
                        }
                        ((b) tVarD).addAll(tVar);
                    }
                    if (i3 > 0) {
                        tVar = tVarD;
                    }
                    e1.o(j, obj, tVar);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = u0.a;
                    d1 d1Var5 = e1.c;
                    Object objH = d1Var5.h(j, obj);
                    Object objH2 = d1Var5.h(j, obj2);
                    this.m.getClass();
                    e1.o(j, obj, g0.a(objH, objH2));
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
                    if (q(i2, i, obj2)) {
                        e1.o(j, obj, e1.c.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, obj2)) {
                        e1.o(j, obj, e1.c.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.gamericefishpro.space.q4.t0
    public final boolean b(s sVar, s sVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iL = L(i);
                long j = iL & 1048575;
                switch (K(iL)) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var = e1.c;
                            if (Double.doubleToLongBits(d1Var.d(j, sVar)) != Double.doubleToLongBits(d1Var.d(j, sVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var2 = e1.c;
                            if (Float.floatToIntBits(d1Var2.e(j, sVar)) != Float.floatToIntBits(d1Var2.e(j, sVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var3 = e1.c;
                            if (d1Var3.g(j, sVar) != d1Var3.g(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var4 = e1.c;
                            if (d1Var4.g(j, sVar) != d1Var4.g(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var5 = e1.c;
                            if (d1Var5.f(j, sVar) != d1Var5.f(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var6 = e1.c;
                            if (d1Var6.g(j, sVar) != d1Var6.g(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var7 = e1.c;
                            if (d1Var7.f(j, sVar) != d1Var7.f(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var8 = e1.c;
                            if (d1Var8.c(j, sVar) != d1Var8.c(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var9 = e1.c;
                            if (!u0.l(d1Var9.h(j, sVar), d1Var9.h(j, sVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var10 = e1.c;
                            if (!u0.l(d1Var10.h(j, sVar), d1Var10.h(j, sVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var11 = e1.c;
                            if (!u0.l(d1Var11.h(j, sVar), d1Var11.h(j, sVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var12 = e1.c;
                            if (d1Var12.f(j, sVar) != d1Var12.f(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var13 = e1.c;
                            if (d1Var13.f(j, sVar) != d1Var13.f(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var14 = e1.c;
                            if (d1Var14.f(j, sVar) != d1Var14.f(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var15 = e1.c;
                            if (d1Var15.g(j, sVar) != d1Var15.g(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var16 = e1.c;
                            if (d1Var16.f(j, sVar) != d1Var16.f(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var17 = e1.c;
                            if (d1Var17.g(j, sVar) != d1Var17.g(j, sVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(sVar, sVar2, i)) {
                            zL = false;
                        } else {
                            d1 d1Var18 = e1.c;
                            if (!u0.l(d1Var18.h(j, sVar), d1Var18.h(j, sVar2))) {
                                zL = false;
                            }
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
                        d1 d1Var19 = e1.c;
                        zL = u0.l(d1Var19.h(j, sVar), d1Var19.h(j, sVar2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        d1 d1Var20 = e1.c;
                        zL = u0.l(d1Var20.h(j, sVar), d1Var20.h(j, sVar2));
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
                        d1 d1Var21 = e1.c;
                        if (d1Var21.f(j2, sVar) != d1Var21.f(j2, sVar2) || !u0.l(d1Var21.h(j, sVar), d1Var21.h(j, sVar2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (sVar.unknownFields.equals(sVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // com.gamericefishpro.space.q4.t0
    public final void c(Object obj) {
        if (p(obj)) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                sVar.k(Integer.MAX_VALUE);
                sVar.memoizedHashCode = 0;
                sVar.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iL = L(i);
                long j = 1048575 & iL;
                int iK = K(iL);
                if (iK != 9) {
                    if (iK != 60 && iK != 68) {
                        switch (iK) {
                            case 17:
                                if (n(i, obj)) {
                                    m(i).c(o.getObject(obj, j));
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
                                this.k.getClass();
                                b bVar = (b) ((t) e1.c.h(j, obj));
                                if (bVar.d) {
                                    bVar.d = false;
                                }
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((f0) object).d = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).c(o.getObject(obj, j));
                    }
                } else if (n(i, obj)) {
                    m(i).c(o.getObject(obj, j));
                }
            }
            this.l.getClass();
            y0 y0Var = ((s) obj).unknownFields;
            if (y0Var.e) {
                y0Var.e = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x031d  */
    /* JADX WARN: Code duplicated, block: B:133:0x032c  */
    /* JADX WARN: Code duplicated, block: B:134:0x033d  */
    /* JADX WARN: Code duplicated, block: B:135:0x034e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0357  */
    /* JADX WARN: Code duplicated, block: B:139:0x0360  */
    /* JADX WARN: Code duplicated, block: B:140:0x036d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0379  */
    /* JADX WARN: Code duplicated, block: B:143:0x037d  */
    /* JADX WARN: Code duplicated, block: B:145:0x038a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0392  */
    /* JADX WARN: Code duplicated, block: B:147:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:148:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:153:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:159:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:215:0x05ed A[PHI: r23 r24
      0x05ed: PHI (r23v19 int) = 
      (r23v2 int)
      (r23v3 int)
      (r23v4 int)
      (r23v8 int)
      (r23v10 int)
      (r23v11 int)
      (r23v12 int)
      (r23v16 int)
      (r23v20 int)
     binds: [B:274:0x07a4, B:270:0x0786, B:266:0x0768, B:249:0x06eb, B:235:0x0682, B:231:0x0666, B:227:0x064a, B:220:0x060c, B:214:0x05eb] A[DONT_GENERATE, DONT_INLINE]
      0x05ed: PHI (r24v18 int) = 
      (r24v2 int)
      (r24v3 int)
      (r24v4 int)
      (r24v8 int)
      (r24v10 int)
      (r24v11 int)
      (r24v12 int)
      (r24v15 int)
      (r24v19 int)
     binds: [B:274:0x07a4, B:270:0x0786, B:266:0x0768, B:249:0x06eb, B:235:0x0682, B:231:0x0666, B:227:0x064a, B:220:0x060c, B:214:0x05eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:350:0x0326 A[SYNTHETIC] */
    @Override // com.gamericefishpro.space.q4.t0
    public final int d(s sVar) {
        int i;
        int iZ0;
        int iZ1;
        int iZ2;
        int iB0;
        int iZ3;
        int iB1;
        int iZ4;
        int iZ5;
        int iX0;
        int iA;
        int iC;
        int i2;
        int i3;
        int iZ6;
        int size;
        int i4;
        int iZ7;
        int iZ8;
        int size2;
        int iZ9;
        int iA0;
        int iA2;
        int iA1;
        int iB2;
        int size3;
        int iA3;
        int i5;
        m1 m1Var;
        int iZ10;
        int iB3;
        int size4;
        int iA4;
        int iZ11;
        int iZ12;
        int iB4;
        int iZ13;
        int iB5;
        int iA5;
        k0 k0Var = this;
        s sVar2 = sVar;
        Unsafe unsafe = o;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int iX1 = 0;
        while (true) {
            int[] iArr = k0Var.a;
            if (i8 >= iArr.length) {
                k0Var.l.getClass();
                return sVar2.unknownFields.b() + iX1;
            }
            int iL = k0Var.L(i8);
            int iK = K(iL);
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & i6;
            int i13 = 1;
            if (iK <= 17) {
                if (i12 != i7) {
                    i9 = i12 == i6 ? 0 : unsafe.getInt(sVar2, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            long j = iL & i6;
            if (iK >= o.e.d) {
                int i14 = o.i.d;
            }
            char c = '?';
            switch (iK) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        iZ0 = i.z0(i10);
                        iA = iZ0 + 8;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 1:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        iZ1 = i.z0(i10);
                        iZ5 = iZ1 + 4;
                        iX1 += iZ5;
                    }
                    k0Var = this;
                    sVar2 = sVar;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 2:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        long j2 = unsafe.getLong(sVar2, j);
                        iZ2 = i.z0(i10);
                        iB0 = i.B0(j2);
                        iX1 += iB0 + iZ2;
                    }
                    k0Var = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 3:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        long j3 = unsafe.getLong(sVar2, j);
                        iZ2 = i.z0(i10);
                        iB0 = i.B0(j3);
                        iX1 += iB0 + iZ2;
                    }
                    k0Var = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 4:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        int i15 = unsafe.getInt(sVar2, j);
                        iZ3 = i.z0(i10);
                        iB1 = i.B0(i15);
                        iX0 = iB1 + iZ3;
                        iX1 += iX0;
                    }
                    k0Var = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        iZ4 = i.z0(i10);
                        iZ5 = iZ4 + 8;
                        iX1 += iZ5;
                    }
                    k0Var = this;
                    sVar2 = sVar;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        iZ1 = i.z0(i10);
                        iZ5 = iZ1 + 4;
                        iX1 += iZ5;
                    }
                    k0Var = this;
                    sVar2 = sVar;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        iZ5 = i.z0(i10) + 1;
                        iX1 += iZ5;
                    }
                    k0Var = this;
                    sVar2 = sVar;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        Object object = unsafe.getObject(sVar2, j);
                        iX1 = (object instanceof f ? i.x0(i10, (f) object) : i.y0((String) object) + i.z0(i10)) + iX1;
                    }
                    k0Var = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 9:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        Object object2 = unsafe.getObject(sVar2, j);
                        t0 t0VarM = k0Var.m(i8);
                        Class cls = u0.a;
                        int iZ14 = i.z0(i10);
                        int iA6 = ((a) object2).a(t0VarM);
                        iX1 += i.A0(iA6) + iA6 + iZ14;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 10:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        iX0 = i.x0(i10, (f) unsafe.getObject(sVar2, j));
                        iX1 += iX0;
                    }
                    k0Var = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        int i16 = unsafe.getInt(sVar2, j);
                        iZ3 = i.z0(i10);
                        iB1 = i.A0(i16);
                        iX0 = iB1 + iZ3;
                        iX1 += iX0;
                    }
                    k0Var = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 12:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        int i17 = unsafe.getInt(sVar2, j);
                        iZ3 = i.z0(i10);
                        iB1 = i.B0(i17);
                        iX0 = iB1 + iZ3;
                        iX1 += iX0;
                    }
                    k0Var = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 13:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        iZ1 = i.z0(i10);
                        iZ5 = iZ1 + 4;
                        iX1 += iZ5;
                    }
                    k0Var = this;
                    sVar2 = sVar;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 14:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        iZ4 = i.z0(i10);
                        iZ5 = iZ4 + 8;
                        iX1 += iZ5;
                    }
                    k0Var = this;
                    sVar2 = sVar;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 15:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        int i18 = unsafe.getInt(sVar2, j);
                        iZ3 = i.z0(i10);
                        iB1 = i.A0((i18 >> 31) ^ (i18 << 1));
                        iX0 = iB1 + iZ3;
                        iX1 += iX0;
                    }
                    k0Var = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 16:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        long j4 = unsafe.getLong(sVar2, j);
                        iZ2 = i.z0(i10);
                        iB0 = i.B0((j4 >> 63) ^ (j4 << 1));
                        iX1 += iB0 + iZ2;
                    }
                    k0Var = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 17:
                    if (k0Var.o(sVar2, i8, i7, i9, i)) {
                        iA = ((a) unsafe.getObject(sVar2, j)).a(k0Var.m(i8)) + (i.z0(i10) * 2);
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 18:
                    iC = u0.c(i10, (List) unsafe.getObject(sVar2, j));
                    iX1 += iC;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 19:
                    iC = u0.b(i10, (List) unsafe.getObject(sVar2, j));
                    iX1 += iC;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 20:
                    i2 = i7;
                    i3 = i9;
                    List list = (List) unsafe.getObject(sVar2, j);
                    Class cls2 = u0.a;
                    if (list.size() == 0) {
                        iZ6 = 0;
                    } else {
                        iZ6 = (i.z0(i10) * list.size()) + u0.e(list);
                    }
                    iX1 += iZ6;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 21:
                    i2 = i7;
                    i3 = i9;
                    List list2 = (List) unsafe.getObject(sVar2, j);
                    Class cls3 = u0.a;
                    size = list2.size();
                    if (size == 0) {
                        iZ6 = 0;
                    } else {
                        i4 = u0.i(list2);
                        iZ7 = i.z0(i10);
                        iZ6 = (iZ7 * size) + i4;
                    }
                    iX1 += iZ6;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 22:
                    i2 = i7;
                    i3 = i9;
                    List list3 = (List) unsafe.getObject(sVar2, j);
                    Class cls4 = u0.a;
                    size = list3.size();
                    if (size == 0) {
                        iZ6 = 0;
                    } else {
                        i4 = u0.d(list3);
                        iZ7 = i.z0(i10);
                        iZ6 = (iZ7 * size) + i4;
                    }
                    iX1 += iZ6;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 23:
                    iC = u0.c(i10, (List) unsafe.getObject(sVar2, j));
                    iX1 += iC;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 24:
                    iC = u0.b(i10, (List) unsafe.getObject(sVar2, j));
                    iX1 += iC;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 25:
                    i2 = i7;
                    i3 = i9;
                    List list4 = (List) unsafe.getObject(sVar2, j);
                    Class cls5 = u0.a;
                    int size5 = list4.size();
                    iX1 += size5 == 0 ? 0 : (i.z0(i10) + 1) * size5;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 26:
                    i2 = i7;
                    i3 = i9;
                    List list5 = (List) unsafe.getObject(sVar2, j);
                    Class cls6 = u0.a;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        iZ6 = 0;
                    } else {
                        iZ6 = i.z0(i10) * size6;
                        for (int i19 = 0; i19 < size6; i19++) {
                            Object obj = list5.get(i19);
                            if (obj instanceof f) {
                                int size7 = ((f) obj).size();
                                iZ6 = i.A0(size7) + size7 + iZ6;
                            } else {
                                iZ6 = i.y0((String) obj) + iZ6;
                            }
                        }
                    }
                    iX1 += iZ6;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 27:
                    i2 = i7;
                    i3 = i9;
                    List list6 = (List) unsafe.getObject(sVar2, j);
                    t0 t0VarM2 = k0Var.m(i8);
                    Class cls7 = u0.a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iZ8 = 0;
                    } else {
                        iZ8 = i.z0(i10) * size8;
                        for (int i20 = 0; i20 < size8; i20++) {
                            int iA7 = ((a) list6.get(i20)).a(t0VarM2);
                            iZ8 += i.A0(iA7) + iA7;
                        }
                    }
                    iX1 += iZ8;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 28:
                    i2 = i7;
                    i3 = i9;
                    List list7 = (List) unsafe.getObject(sVar2, j);
                    Class cls8 = u0.a;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iZ6 = 0;
                    } else {
                        iZ6 = i.z0(i10) * size9;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int size10 = ((f) list7.get(i21)).size();
                            iZ6 += i.A0(size10) + size10;
                        }
                    }
                    iX1 += iZ6;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 29:
                    i2 = i7;
                    i3 = i9;
                    List list8 = (List) unsafe.getObject(sVar2, j);
                    Class cls9 = u0.a;
                    size = list8.size();
                    if (size == 0) {
                        iZ6 = 0;
                    } else {
                        i4 = u0.h(list8);
                        iZ7 = i.z0(i10);
                        iZ6 = (iZ7 * size) + i4;
                    }
                    iX1 += iZ6;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 30:
                    i2 = i7;
                    i3 = i9;
                    List list9 = (List) unsafe.getObject(sVar2, j);
                    Class cls10 = u0.a;
                    size = list9.size();
                    if (size == 0) {
                        iZ6 = 0;
                    } else {
                        i4 = u0.a(list9);
                        iZ7 = i.z0(i10);
                        iZ6 = (iZ7 * size) + i4;
                    }
                    iX1 += iZ6;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 31:
                    iC = u0.b(i10, (List) unsafe.getObject(sVar2, j));
                    iX1 += iC;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 32:
                    iC = u0.c(i10, (List) unsafe.getObject(sVar2, j));
                    iX1 += iC;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 33:
                    i2 = i7;
                    i3 = i9;
                    List list10 = (List) unsafe.getObject(sVar2, j);
                    Class cls11 = u0.a;
                    size = list10.size();
                    if (size == 0) {
                        iZ6 = 0;
                    } else {
                        i4 = u0.f(list10);
                        iZ7 = i.z0(i10);
                        iZ6 = (iZ7 * size) + i4;
                    }
                    iX1 += iZ6;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 34:
                    i2 = i7;
                    i3 = i9;
                    List list11 = (List) unsafe.getObject(sVar2, j);
                    Class cls12 = u0.a;
                    size = list11.size();
                    if (size == 0) {
                        iZ6 = 0;
                    } else {
                        i4 = u0.g(list11);
                        iZ7 = i.z0(i10);
                        iZ6 = (iZ7 * size) + i4;
                    }
                    iX1 += iZ6;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 35:
                    i2 = i7;
                    i3 = i9;
                    List list12 = (List) unsafe.getObject(sVar2, j);
                    Class cls13 = u0.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 36:
                    i2 = i7;
                    i3 = i9;
                    List list13 = (List) unsafe.getObject(sVar2, j);
                    Class cls14 = u0.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 37:
                    i2 = i7;
                    i3 = i9;
                    size2 = u0.e((List) unsafe.getObject(sVar2, j));
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 38:
                    i2 = i7;
                    i3 = i9;
                    size2 = u0.i((List) unsafe.getObject(sVar2, j));
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 39:
                    i2 = i7;
                    i3 = i9;
                    size2 = u0.d((List) unsafe.getObject(sVar2, j));
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    i2 = i7;
                    i3 = i9;
                    List list14 = (List) unsafe.getObject(sVar2, j);
                    Class cls15 = u0.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i2 = i7;
                    i3 = i9;
                    List list15 = (List) unsafe.getObject(sVar2, j);
                    Class cls16 = u0.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 42:
                    i2 = i7;
                    i3 = i9;
                    List list16 = (List) unsafe.getObject(sVar2, j);
                    Class cls17 = u0.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 43:
                    i2 = i7;
                    i3 = i9;
                    size2 = u0.h((List) unsafe.getObject(sVar2, j));
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 44:
                    i2 = i7;
                    i3 = i9;
                    size2 = u0.a((List) unsafe.getObject(sVar2, j));
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 45:
                    i2 = i7;
                    i3 = i9;
                    List list17 = (List) unsafe.getObject(sVar2, j);
                    Class cls18 = u0.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 46:
                    i2 = i7;
                    i3 = i9;
                    List list18 = (List) unsafe.getObject(sVar2, j);
                    Class cls19 = u0.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 47:
                    i2 = i7;
                    i3 = i9;
                    size2 = u0.f((List) unsafe.getObject(sVar2, j));
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 48:
                    i2 = i7;
                    i3 = i9;
                    size2 = u0.g((List) unsafe.getObject(sVar2, j));
                    if (size2 > 0) {
                        iZ9 = i.z0(i10);
                        iA0 = i.A0(size2);
                        iX1 += iA0 + iZ9 + size2;
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 49:
                    i2 = i7;
                    i3 = i9;
                    List list19 = (List) unsafe.getObject(sVar2, j);
                    t0 t0VarM3 = k0Var.m(i8);
                    Class cls20 = u0.a;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i22 = 0; i22 < size11; i22++) {
                            iA2 += ((a) list19.get(i22)).a(t0VarM3) + (i.z0(i10) * 2);
                        }
                    }
                    iX1 += iA2;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(sVar2, j);
                    Object obj2 = k0Var.b[(i8 / 3) * 2];
                    k0Var.m.getClass();
                    f0 f0Var = (f0) object3;
                    e0 e0Var = (e0) obj2;
                    if (f0Var.isEmpty()) {
                        iA1 = 0;
                    } else {
                        Iterator it = f0Var.entrySet().iterator();
                        iA1 = 0;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            e0Var.getClass();
                            int iZ15 = i.z0(i10);
                            d0 d0Var = e0Var.a;
                            char c2 = c;
                            m1 m1Var2 = d0Var.a;
                            int i23 = n.c;
                            int iZ16 = i.z0(i13);
                            int i24 = i13;
                            j1 j1Var = m1.v;
                            if (m1Var2 == j1Var) {
                                iZ16 *= 2;
                            }
                            int i25 = i7;
                            int i26 = i9;
                            switch (m1Var2.ordinal()) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    ((Double) key).getClass();
                                    iB2 = 8;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i27 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i27) + i27 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i28 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i28) + i28 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i29 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i29) + i29 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i210 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i210) + i210 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211) + i211 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i212 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i212) + i212 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i213 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i213) + i213 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i214 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i214) + i214 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i215 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i215) + i215 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i216 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i216) + i216 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i217 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i217) + i217 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i218 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i218) + i218 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i219 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i219) + i219 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2110) + i2110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111) + i2111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2112) + i2112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue >> 31) ^ (iIntValue << 1));
                                            int i2113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2113) + i2113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue >> c2) ^ (jLongValue << i24));
                                            int i2114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2114) + i2114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iB2 = 4;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i2115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2115) + i2115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i2116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2116) + i2116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2117) + i2117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2118) + i2118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2119) + i2119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i21110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21110) + i21110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111) + i21111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i21112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21112) + i21112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i21113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21113) + i21113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i21114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21114) + i21114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i21115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21115) + i21115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i21116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21116) + i21116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i21117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21117) + i21117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i21118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21118) + i21118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21119) + i21119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211110) + i211110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            int i211111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111) + i211111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue2 >> c2) ^ (jLongValue2 << i24));
                                            int i211112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211112) + i211112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    it = it;
                                    iB2 = i.B0(((Long) key).longValue());
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i211113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211113) + i211113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i211114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211114) + i211114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211115) + i211115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211116) + i211116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211117) + i211117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211118) + i211118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i211119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211119) + i211119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i2111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111110) + i2111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i2111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111) + i2111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i2111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111112) + i2111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i2111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111113) + i2111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i2111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111114) + i2111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i2111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111115) + i2111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111116) + i2111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111117) + i2111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111118) + i2111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            int i2111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111119) + i2111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue3 >> c2) ^ (jLongValue3 << i24));
                                            int i21111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111110) + i21111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    it = it;
                                    iB2 = i.B0(((Long) key).longValue());
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i21111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111) + i21111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i21111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111112) + i21111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i21111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111113) + i21111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i21111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111114) + i21111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i21111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111115) + i21111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i21111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111116) + i21111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111117) + i21111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i21111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111118) + i21111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i21111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111119) + i21111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i211111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111110) + i211111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i211111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111) + i211111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i211111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111112) + i211111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i211111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111113) + i211111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111114) + i211111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i211111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111115) + i211111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111116) + i211111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            int i211111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111117) + i211111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue4 >> c2) ^ (jLongValue4 << i24));
                                            int i211111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111118) + i211111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    it = it;
                                    iB2 = i.B0(((Integer) key).intValue());
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i211111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111119) + i211111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i2111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111110) + i2111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111) + i2111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111112) + i2111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111113) + i2111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111114) + i2111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111115) + i2111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i2111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111116) + i2111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i2111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111117) + i2111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i2111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111118) + i2111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i2111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111119) + i2111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i21111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111110) + i21111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i21111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111) + i21111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i21111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111112) + i21111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111113) + i21111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i21111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111114) + i21111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            int i21111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111115) + i21111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue5 >> c2) ^ (jLongValue5 << i24));
                                            int i21111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111116) + i21111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                    ((Long) key).getClass();
                                    iB2 = 8;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i21111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111117) + i21111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i21111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111118) + i21111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i21111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111119) + i21111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111110) + i211111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111) + i211111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111112) + i211111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i211111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111113) + i211111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i211111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111114) + i211111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i211111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111115) + i211111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i211111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111116) + i211111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i211111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111117) + i211111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i211111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111118) + i211111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i211111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111119) + i211111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111110) + i2111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111) + i2111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111112) + i2111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            int i2111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111113) + i2111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue6 >> c2) ^ (jLongValue6 << i24));
                                            int i2111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111114) + i2111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                    ((Integer) key).getClass();
                                    iB2 = 4;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i2111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111115) + i2111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i2111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111116) + i2111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111117) + i2111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111118) + i2111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111119) + i2111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i21111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111110) + i21111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111) + i21111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i21111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111112) + i21111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i21111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111113) + i21111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i21111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111114) + i21111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i21111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111115) + i21111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i21111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111116) + i21111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i21111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111117) + i21111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i21111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111118) + i21111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111119) + i21111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111110) + i211111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            int i211111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111) + i211111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue7 >> c2) ^ (jLongValue7 << i24));
                                            int i211111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111112) + i211111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                    it = it;
                                    ((Boolean) key).getClass();
                                    iB2 = i24;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i211111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111113) + i211111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i211111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111114) + i211111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111115) + i211111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111116) + i211111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111117) + i211111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111118) + i211111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i211111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111119) + i211111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i2111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111110) + i2111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i2111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111) + i2111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i2111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111112) + i2111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i2111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111113) + i2111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i2111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111114) + i2111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i2111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111115) + i2111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111116) + i2111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111117) + i2111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111118) + i2111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            int i2111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111119) + i2111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue8 >> c2) ^ (jLongValue8 << i24));
                                            int i21111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111110) + i21111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                    it = it;
                                    if (key instanceof f) {
                                        size3 = ((f) key).size();
                                        iA3 = i.A0(size3);
                                        iB2 = iA3 + size3;
                                    } else {
                                        iB2 = i.y0((String) key);
                                    }
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i21111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111) + i21111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111112) + i21111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i21111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111113) + i21111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i21111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111114) + i21111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i21111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111115) + i21111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i21111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111116) + i21111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111117) + i21111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i21111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111118) + i21111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i21111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111119) + i21111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i211111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111110) + i211111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i211111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111) + i211111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i211111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111112) + i211111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i211111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111113) + i211111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111114) + i211111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i211111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111115) + i211111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111116) + i211111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            int i211111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111117) + i211111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue9 >> c2) ^ (jLongValue9 << i24));
                                            int i211111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111118) + i211111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    it = it;
                                    iB2 = ((s) ((a) key)).a(null);
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111119) + i211111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111110) + i2111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111) + i2111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111112) + i2111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111113) + i2111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111114) + i2111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111115) + i2111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i2111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111116) + i2111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i2111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111117) + i2111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i2111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111118) + i2111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i2111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111119) + i2111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i21111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111110) + i21111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i21111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111) + i21111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i21111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111112) + i21111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111113) + i21111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i21111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111114) + i21111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            int i21111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111115) + i21111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue10 >> c2) ^ (jLongValue10 << i24));
                                            int i21111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111116) + i21111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    it = it;
                                    int iA8 = ((s) ((a) key)).a(null);
                                    iB2 = i.A0(iA8) + iA8;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i21111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111117) + i21111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111118) + i21111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i21111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111119) + i21111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111110) + i211111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111) + i211111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111112) + i211111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i211111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111113) + i211111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i211111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111114) + i211111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i211111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111115) + i211111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i211111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111116) + i211111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i211111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111117) + i211111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i211111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111118) + i211111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i211111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111119) + i211111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111110) + i2111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111) + i2111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111112) + i2111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            int i2111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111113) + i2111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue11 >> c2) ^ (jLongValue11 << i24));
                                            int i2111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111114) + i2111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case RequestError.STOP_TRACKING /* 11 */:
                                    it = it;
                                    if (key instanceof f) {
                                        size3 = ((f) key).size();
                                        iA3 = i.A0(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        iA3 = i.A0(size3);
                                    }
                                    iB2 = iA3 + size3;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i2111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111115) + i2111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111116) + i2111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111117) + i2111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111118) + i2111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111119) + i2111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i21111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111110) + i21111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111) + i21111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i21111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111112) + i21111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i21111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111113) + i21111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i21111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111114) + i21111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i21111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111115) + i21111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i21111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111116) + i21111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i21111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111117) + i21111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i21111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111118) + i21111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111119) + i21111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111110) + i211111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            int i211111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111) + i211111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue12 >> c2) ^ (jLongValue12 << i24));
                                            int i211111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111112) + i211111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    it = it;
                                    iB2 = i.A0(((Integer) key).intValue());
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111113) + i211111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i211111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111114) + i211111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111115) + i211111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111116) + i211111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111117) + i211111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111118) + i211111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i211111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111119) + i211111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i2111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111110) + i2111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i2111111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111) + i2111111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i2111111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111112) + i2111111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i2111111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111113) + i2111111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i2111111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111114) + i2111111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i2111111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111115) + i2111111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111116) + i2111111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111117) + i2111111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2111111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111118) + i2111111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            int i2111111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111119) + i2111111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue13 >> c2) ^ (jLongValue13 << i24));
                                            int i21111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111110) + i21111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    it = it;
                                    iB2 = i.B0(((Integer) key).intValue());
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i21111111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111) + i21111111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111112) + i21111111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i21111111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111113) + i21111111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i21111111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111114) + i21111111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i21111111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111115) + i21111111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i21111111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111116) + i21111111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111117) + i21111111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i21111111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111118) + i21111111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i21111111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111119) + i21111111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i211111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111110) + i211111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i211111111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111) + i211111111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i211111111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111112) + i211111111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i211111111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111113) + i211111111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211111111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111114) + i211111111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i211111111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111115) + i211111111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111116) + i211111111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            int i211111111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111117) + i211111111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue14 >> c2) ^ (jLongValue14 << i24));
                                            int i211111111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111118) + i211111111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iB2 = 4;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111119) + i211111111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111110) + i2111111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111) + i2111111111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111112) + i2111111111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111113) + i2111111111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2111111111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111114) + i2111111111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111115) + i2111111111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i2111111111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111116) + i2111111111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i2111111111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111117) + i2111111111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i2111111111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111118) + i2111111111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i2111111111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111119) + i2111111111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i21111111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111110) + i21111111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i21111111111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111) + i21111111111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i21111111111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111112) + i21111111111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111113) + i21111111111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i21111111111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111114) + i21111111111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            int i21111111111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111115) + i21111111111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue15 >> c2) ^ (jLongValue15 << i24));
                                            int i21111111111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111116) + i21111111111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iB2 = 8;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i21111111111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111117) + i21111111111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111118) + i21111111111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i21111111111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111119) + i21111111111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211111111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111110) + i211111111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211111111111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111) + i211111111111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111112) + i211111111111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i211111111111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111113) + i211111111111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i211111111111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111114) + i211111111111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i211111111111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111115) + i211111111111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i211111111111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111116) + i211111111111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i211111111111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111117) + i211111111111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i211111111111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111118) + i211111111111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i211111111111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111119) + i211111111111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111110) + i2111111111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111) + i2111111111111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2111111111111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111112) + i2111111111111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            int i2111111111111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111113) + i2111111111111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue16 >> c2) ^ (jLongValue16 << i24));
                                            int i2111111111111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111114) + i2111111111111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iB2 = i.A0((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                    it = it;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i2111111111111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111115) + i2111111111111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111116) + i2111111111111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111117) + i2111111111111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i2111111111111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111118) + i2111111111111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111119) + i2111111111111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i21111111111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111110) + i21111111111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111111) + i21111111111111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i21111111111111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111112) + i21111111111111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i21111111111111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111113) + i21111111111111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i21111111111111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111114) + i21111111111111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i21111111111111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111115) + i21111111111111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i21111111111111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111116) + i21111111111111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i21111111111111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111117) + i21111111111111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i21111111111111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111118) + i21111111111111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i21111111111111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111119) + i21111111111111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111110) + i211111111111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            int i211111111111111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111111) + i211111111111111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue17 >> c2) ^ (jLongValue17 << i24));
                                            int i211111111111111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111112) + i211111111111111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iB2 = i.B0((jLongValue18 << i24) ^ (jLongValue18 >> c2));
                                    it = it;
                                    i5 = iB2 + iZ16;
                                    m1Var = d0Var.b;
                                    iZ10 = i.z0(2);
                                    if (m1Var == j1Var) {
                                        iZ10 *= 2;
                                    }
                                    switch (m1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111113) + i211111111111111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i211111111111111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111114) + i211111111111111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211111111111111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111115) + i211111111111111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iB3 = i.B0(((Long) value).longValue());
                                            int i211111111111111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111116) + i211111111111111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i211111111111111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111117) + i211111111111111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i211111111111111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111118) + i211111111111111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i211111111111111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i211111111111111111111111111111119) + i211111111111111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iB3 = i24;
                                            int i2111111111111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111110) + i2111111111111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = i.y0((String) value);
                                            }
                                            int i2111111111111111111111111111111111 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111111) + i2111111111111111111111111111111111 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iB3 = ((s) ((a) value)).a(null);
                                            int i2111111111111111111111111111111112 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111112) + i2111111111111111111111111111111112 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            size4 = ((s) ((a) value)).a(null);
                                            iA4 = i.A0(size4);
                                            iB3 = size4 + iA4;
                                            int i2111111111111111111111111111111113 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111113) + i2111111111111111111111111111111113 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof f) {
                                                size4 = ((f) value).size();
                                                iA4 = i.A0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = i.A0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i2111111111111111111111111111111114 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111114) + i2111111111111111111111111111111114 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            iB3 = i.A0(((Integer) value).intValue());
                                            int i2111111111111111111111111111111115 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111115) + i2111111111111111111111111111111115 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iB3 = i.B0(((Integer) value).intValue());
                                            int i2111111111111111111111111111111116 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111116) + i2111111111111111111111111111111116 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i2111111111111111111111111111111117 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111117) + i2111111111111111111111111111111117 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i2111111111111111111111111111111118 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111118) + i2111111111111111111111111111111118 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iB3 = i.A0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            int i2111111111111111111111111111111119 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i2111111111111111111111111111111119) + i2111111111111111111111111111111119 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iB3 = i.B0((jLongValue19 >> c2) ^ (jLongValue19 << i24));
                                            int i21111111111111111111111111111111110 = iB3 + iZ10 + i5;
                                            iA1 += i.A0(i21111111111111111111111111111111110) + i21111111111111111111111111111111110 + iZ15;
                                            it = it;
                                            c = c2;
                                            i13 = i24;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i2 = i7;
                    i3 = i9;
                    iX1 += iA1;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 51:
                    if (k0Var.q(i10, i8, sVar2)) {
                        iZ0 = i.z0(i10);
                        iA = iZ0 + 8;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 52:
                    if (k0Var.q(i10, i8, sVar2)) {
                        iZ11 = i.z0(i10);
                        iA = iZ11 + 4;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 53:
                    if (k0Var.q(i10, i8, sVar2)) {
                        long jZ = z(j, sVar2);
                        iZ12 = i.z0(i10);
                        iB4 = i.B0(jZ);
                        iA5 = iB4 + iZ12;
                        iX1 += iA5;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 54:
                    if (k0Var.q(i10, i8, sVar2)) {
                        long jZ2 = z(j, sVar2);
                        iZ12 = i.z0(i10);
                        iB4 = i.B0(jZ2);
                        iA5 = iB4 + iZ12;
                        iX1 += iA5;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 55:
                    if (k0Var.q(i10, i8, sVar2)) {
                        int iY = y(j, sVar2);
                        iZ13 = i.z0(i10);
                        iB5 = i.B0(iY);
                        iA = iB5 + iZ13;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 56:
                    if (k0Var.q(i10, i8, sVar2)) {
                        iZ0 = i.z0(i10);
                        iA = iZ0 + 8;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 57:
                    if (k0Var.q(i10, i8, sVar2)) {
                        iZ11 = i.z0(i10);
                        iA = iZ11 + 4;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 58:
                    if (k0Var.q(i10, i8, sVar2)) {
                        iA = i.z0(i10) + 1;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 59:
                    if (k0Var.q(i10, i8, sVar2)) {
                        Object object4 = unsafe.getObject(sVar2, j);
                        iX1 = (object4 instanceof f ? i.x0(i10, (f) object4) : i.y0((String) object4) + i.z0(i10)) + iX1;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 60:
                    if (k0Var.q(i10, i8, sVar2)) {
                        Object object5 = unsafe.getObject(sVar2, j);
                        t0 t0VarM4 = k0Var.m(i8);
                        Class cls21 = u0.a;
                        int iZ17 = i.z0(i10);
                        int iA9 = ((a) object5).a(t0VarM4);
                        iA5 = i.A0(iA9) + iA9 + iZ17;
                        iX1 += iA5;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 61:
                    if (k0Var.q(i10, i8, sVar2)) {
                        iA = i.x0(i10, (f) unsafe.getObject(sVar2, j));
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 62:
                    if (k0Var.q(i10, i8, sVar2)) {
                        int iY2 = y(j, sVar2);
                        iZ13 = i.z0(i10);
                        iB5 = i.A0(iY2);
                        iA = iB5 + iZ13;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 63:
                    if (k0Var.q(i10, i8, sVar2)) {
                        int iY3 = y(j, sVar2);
                        iZ13 = i.z0(i10);
                        iB5 = i.B0(iY3);
                        iA = iB5 + iZ13;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 64:
                    if (k0Var.q(i10, i8, sVar2)) {
                        iZ11 = i.z0(i10);
                        iA = iZ11 + 4;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 65:
                    if (k0Var.q(i10, i8, sVar2)) {
                        iZ0 = i.z0(i10);
                        iA = iZ0 + 8;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 66:
                    if (k0Var.q(i10, i8, sVar2)) {
                        int iY4 = y(j, sVar2);
                        iZ13 = i.z0(i10);
                        iB5 = i.A0((iY4 >> 31) ^ (iY4 << 1));
                        iA = iB5 + iZ13;
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 67:
                    if (k0Var.q(i10, i8, sVar2)) {
                        long jZ3 = z(j, sVar2);
                        iZ12 = i.z0(i10);
                        iB4 = i.B0((jZ3 << 1) ^ (jZ3 >> 63));
                        iA5 = iB4 + iZ12;
                        iX1 += iA5;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 68:
                    if (k0Var.q(i10, i8, sVar2)) {
                        iA = ((a) unsafe.getObject(sVar2, j)).a(k0Var.m(i8)) + (i.z0(i10) * 2);
                        iX1 += iA;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                default:
                    i8 += 3;
                    i6 = 1048575;
                    break;
            }
        }
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final boolean e(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.h) {
            int i6 = this.g[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iL = L(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iL) == 0 || o(obj, i6, i, i2, i10)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (o(obj, i6, i, i2, i10)) {
                        if (!m(i6).e(e1.c.h(iL & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (q(i7, i6, obj)) {
                                if (!m(i6).e(e1.c.h(iL & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = e1.c.h(iL & 1048575, obj);
                                this.m.getClass();
                                f0 f0Var = (f0) objH;
                                if (f0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((e0) this.b[(i6 / 3) * 2]).a.b.d != n1.B) {
                                        continue;
                                    } else {
                                        t0 t0VarA = null;
                                        for (Object obj2 : f0Var.values()) {
                                            if (t0VarA == null) {
                                                t0VarA = q0.c.a(obj2.getClass());
                                            }
                                            if (!t0VarA.e(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) e1.c.h(iL & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        t0 t0VarM = m(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (t0VarM.e(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.gamericefishpro.space.q4.t0
    public final int f(s sVar) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iL = L(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iL;
            int i6 = 1237;
            int iHashCode = 37;
            switch (K(iL)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i = i3 * 53;
                    iB = u.b(Double.doubleToLongBits(e1.c.d(j, sVar)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(e1.c.e(j, sVar));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = u.b(e1.c.g(j, sVar));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = u.b(e1.c.g(j, sVar));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = e1.c.f(j, sVar);
                    i3 = iB + i;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    i = i3 * 53;
                    iB = u.b(e1.c.g(j, sVar));
                    i3 = iB + i;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = i3 * 53;
                    iB = e1.c.f(j, sVar);
                    i3 = iB + i;
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = i3 * 53;
                    boolean zC = e1.c.c(j, sVar);
                    Charset charset = u.a;
                    if (zC) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                    i = i3 * 53;
                    iB = ((String) e1.c.h(j, sVar)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objH = e1.c.h(j, sVar);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = e1.c.h(j, sVar).hashCode();
                    i3 = iB + i;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    i = i3 * 53;
                    iB = e1.c.f(j, sVar);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = e1.c.f(j, sVar);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = e1.c.f(j, sVar);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = u.b(e1.c.g(j, sVar));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = e1.c.f(j, sVar);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = u.b(e1.c.g(j, sVar));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objH2 = e1.c.h(j, sVar);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
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
                    i = i3 * 53;
                    iB = e1.c.h(j, sVar).hashCode();
                    i3 = iB + i;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i = i3 * 53;
                    iB = e1.c.h(j, sVar).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = u.b(Double.doubleToLongBits(((Double) e1.c.h(j, sVar)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) e1.c.h(j, sVar)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = u.b(z(j, sVar));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = u.b(z(j, sVar));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = y(j, sVar);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = u.b(z(j, sVar));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = y(j, sVar);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (q(i5, i4, sVar)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) e1.c.h(j, sVar)).booleanValue();
                        Charset charset2 = u.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = ((String) e1.c.h(j, sVar)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = e1.c.h(j, sVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = e1.c.h(j, sVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = y(j, sVar);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = y(j, sVar);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = y(j, sVar);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = u.b(z(j, sVar));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = y(j, sVar);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = u.b(z(j, sVar));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (q(i5, i4, sVar)) {
                        i = i3 * 53;
                        iB = e1.c.h(j, sVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        this.l.getClass();
        return sVar.unknownFields.hashCode() + (i3 * 53);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.gamericefishpro.space.q4.t0
    public final void g(java.lang.Object r19, com.gamericefishpro.space.d4.z r20, com.gamericefishpro.space.q4.k r21) {
        /*
            Method dump skipped, instruction units count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.q4.k0.g(java.lang.Object, com.gamericefishpro.space.d4.z, com.gamericefishpro.space.q4.k):void");
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final s h() {
        this.j.getClass();
        return ((s) this.e).i();
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final void i(Object obj, c0 c0Var) throws IOException {
        c0Var.getClass();
        M(obj, c0Var);
    }

    public final boolean j(s sVar, s sVar2, int i) {
        return n(i, sVar) == n(i, sVar2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (e1.c.h(L(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final t0 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        t0 t0Var = (t0) objArr[i2];
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0VarA = q0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = t0VarA;
        return t0VarA;
    }

    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iL = L(i);
            long j2 = iL & 1048575;
            switch (K(iL)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (Double.doubleToRawLongBits(e1.c.d(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(e1.c.e(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (e1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (e1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (e1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    if (e1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (e1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    return e1.c.c(j2, obj);
                case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                    Object objH = e1.c.h(j2, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof f) {
                        return !f.i.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (e1.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !f.i.equals(e1.c.h(j2, obj));
                case RequestError.STOP_TRACKING /* 11 */:
                    if (e1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (e1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (e1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (e1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (e1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (e1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (e1.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & e1.c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return e1.c.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void r(Object obj, int i, Object obj2, k kVar, com.gamericefishpro.space.d4.z zVar) throws v {
        long jL = L(i) & 1048575;
        Object objH = e1.c.h(jL, obj);
        g0 g0Var = this.m;
        if (objH == null) {
            g0Var.getClass();
            objH = f0.e.b();
            e1.o(jL, obj, objH);
        } else {
            g0Var.getClass();
            if (!((f0) objH).d) {
                f0 f0VarB = f0.e.b();
                g0.a(f0VarB, objH);
                e1.o(jL, obj, f0VarB);
                objH = f0VarB;
            }
        }
        g0Var.getClass();
        f0 f0Var = (f0) objH;
        d0 d0Var = ((e0) obj2).a;
        zVar.z(2);
        com.gamericefishpro.space.d4.o0 o0Var = (com.gamericefishpro.space.d4.o0) zVar.d;
        int i2 = o0Var.i(o0Var.A());
        Object obj3 = d0Var.c;
        Object objL = "";
        Object objL2 = obj3;
        while (true) {
            try {
                int iB = zVar.b();
                if (iB == Integer.MAX_VALUE || o0Var.c()) {
                    break;
                }
                if (iB == 1) {
                    objL = zVar.l(d0Var.a, null, null);
                } else if (iB != 2) {
                    try {
                        if (!zVar.A()) {
                            throw new w("Unable to parse map entry.");
                        }
                    } catch (v unused) {
                        if (!zVar.A()) {
                            throw new w("Unable to parse map entry.");
                        }
                    }
                } else {
                    objL2 = zVar.l(d0Var.b, obj3.getClass(), kVar);
                }
            } catch (Throwable th) {
                o0Var.h(i2);
                throw th;
            }
        }
        f0Var.put(objL, objL2);
        o0Var.h(i2);
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long jL = L(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            t0 t0VarM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    s sVarH = t0VarM.h();
                    t0VarM.a(sVarH, object);
                    unsafe.putObject(obj, jL, sVarH);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                s sVarH2 = t0VarM.h();
                t0VarM.a(sVarH2, object2);
                unsafe.putObject(obj, jL, sVarH2);
                object2 = sVarH2;
            }
            t0VarM.a(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long jL = L(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            t0 t0VarM = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    s sVarH = t0VarM.h();
                    t0VarM.a(sVarH, object);
                    unsafe.putObject(obj, jL, sVarH);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                s sVarH2 = t0VarM.h();
                t0VarM.a(sVarH2, object2);
                unsafe.putObject(obj, jL, sVarH2);
                object2 = sVarH2;
            }
            t0VarM.a(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        t0 t0VarM = m(i);
        long jL = L(i) & 1048575;
        if (!n(i, obj)) {
            return t0VarM.h();
        }
        Object object = o.getObject(obj, jL);
        if (p(object)) {
            return object;
        }
        s sVarH = t0VarM.h();
        if (object != null) {
            t0VarM.a(sVarH, object);
        }
        return sVarH;
    }

    public final Object v(int i, int i2, Object obj) {
        t0 t0VarM = m(i2);
        if (!q(i, i2, obj)) {
            return t0VarM.h();
        }
        Object object = o.getObject(obj, L(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        s sVarH = t0VarM.h();
        if (object != null) {
            t0VarM.a(sVarH, object);
        }
        return sVarH;
    }
}
