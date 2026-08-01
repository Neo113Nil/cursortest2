package com.google.android.gms.internal.ads;

import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.p;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.rL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3832rL implements DL {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f33561k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f33562l = PL.h();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f33563a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f33564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33565c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33566d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC4263zK f33567e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33568f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f33569g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33570h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final V2 f33571j;

    public C3832rL(int[] iArr, Object[] objArr, int i, int i6, AbstractC4263zK abstractC4263zK, int[] iArr2, int i9, int i10, V2 v22, XJ xj) {
        this.f33563a = iArr;
        this.f33564b = objArr;
        this.f33565c = i;
        this.f33566d = i6;
        this.f33568f = abstractC4263zK instanceof VK;
        this.f33569g = iArr2;
        this.f33570h = i9;
        this.i = i10;
        this.f33571j = v22;
        this.f33567e = abstractC4263zK;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e9) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            u1.h.i(sb, "Field ", str, " for ", name);
            throw new RuntimeException(u1.h.g(sb, " not found. Known fields are ", arrays), e9);
        }
    }

    public static int l(int i) {
        return (i >>> 20) & com.anythink.basead.exoplayer.k.p.f8473b;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof VK) {
            return ((VK) obj).h();
        }
        return true;
    }

    public static void n(Object obj) {
        if (!m(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static int o(long j6, Object obj) {
        return ((Integer) PL.f(j6, obj)).intValue();
    }

    public static long p(long j6, Object obj) {
        return ((Long) PL.f(j6, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i, int i6, SL sl, Class cls, CK ck) {
        SL sl2 = SL.f27472v;
        switch (sl.ordinal()) {
            case 0:
                int i9 = i + 8;
                ck.f24100c = Double.valueOf(Double.longBitsToDouble(C2921aN.r(i, bArr)));
                return i9;
            case 1:
                int i10 = i + 4;
                ck.f24100c = Float.valueOf(Float.intBitsToFloat(C2921aN.o(i, bArr)));
                return i10;
            case 2:
            case 3:
                int m4 = C2921aN.m(bArr, i, ck);
                ck.f24100c = Long.valueOf(ck.f24099b);
                return m4;
            case 4:
            case 12:
            case 13:
                int a9 = C2921aN.a(bArr, i, ck);
                ck.f24100c = Integer.valueOf(ck.f24098a);
                return a9;
            case 5:
            case 15:
                int i11 = i + 8;
                ck.f24100c = Long.valueOf(C2921aN.r(i, bArr));
                return i11;
            case 6:
            case 14:
                int i12 = i + 4;
                ck.f24100c = Integer.valueOf(C2921aN.o(i, bArr));
                return i12;
            case 7:
                int m9 = C2921aN.m(bArr, i, ck);
                ck.f24100c = Boolean.valueOf(ck.f24099b != 0);
                return m9;
            case 8:
                return C2921aN.s(bArr, i, ck);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                DL a10 = C4156xL.f34990c.a(cls);
                VK c9 = a10.c();
                int u3 = C2921aN.u(c9, a10, bArr, i, i6, ck);
                a10.g(c9);
                ck.f24100c = c9;
                return u3;
            case 11:
                return C2921aN.t(bArr, i, ck);
            case 16:
                int a11 = C2921aN.a(bArr, i, ck);
                ck.f24100c = Integer.valueOf(W7.b.h(ck.f24098a));
                return a11;
            case 17:
                int m10 = C2921aN.m(bArr, i, ck);
                ck.f24100c = Long.valueOf(W7.b.i(ck.f24099b));
                return m10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3832rL z(C4264zL c4264zL, V2 v22, XJ xj) {
        int i;
        int charAt;
        int i6;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt2;
        int i15;
        int i16;
        char charAt3;
        int i17;
        char charAt4;
        int i18;
        char charAt5;
        int i19;
        char charAt6;
        int i20;
        char charAt7;
        int i21;
        char charAt8;
        int i22;
        int i23;
        int i24;
        Object[] objArr;
        int i25;
        int i26;
        int i27;
        int objectFieldOffset;
        int i28;
        String str;
        char c9;
        int i29;
        int i30;
        int i31;
        Field A9;
        int i32;
        char charAt9;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        Object obj;
        Field A10;
        Object obj2;
        Field A11;
        int i39;
        char charAt10;
        int i40;
        int i41;
        char charAt11;
        int i42;
        char charAt12;
        int i43;
        char charAt13;
        if (!(c4264zL instanceof C4264zL)) {
            c4264zL.getClass();
            throw new ClassCastException();
        }
        String str2 = c4264zL.f35315b;
        int length = str2.length();
        char c10 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i44 = 1;
            while (true) {
                i = i44 + 1;
                if (str2.charAt(i44) < 55296) {
                    break;
                }
                i44 = i;
            }
        } else {
            i = 1;
        }
        int i45 = i + 1;
        int charAt14 = str2.charAt(i);
        if (charAt14 >= 55296) {
            int i46 = charAt14 & 8191;
            int i47 = 13;
            while (true) {
                i43 = i45 + 1;
                charAt13 = str2.charAt(i45);
                if (charAt13 < 55296) {
                    break;
                }
                i46 |= (charAt13 & 8191) << i47;
                i47 += 13;
                i45 = i43;
            }
            charAt14 = i46 | (charAt13 << i47);
            i45 = i43;
        }
        if (charAt14 == 0) {
            i9 = 0;
            i12 = 0;
            charAt = 0;
            i6 = 0;
            i11 = 0;
            i13 = 0;
            iArr = f33561k;
            i10 = 0;
        } else {
            int i48 = i45 + 1;
            int charAt15 = str2.charAt(i45);
            if (charAt15 >= 55296) {
                int i49 = charAt15 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    charAt8 = str2.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                charAt15 = i49 | (charAt8 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            int charAt16 = str2.charAt(i48);
            if (charAt16 >= 55296) {
                int i52 = charAt16 & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    charAt7 = str2.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                charAt16 = i52 | (charAt7 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            int charAt17 = str2.charAt(i51);
            if (charAt17 >= 55296) {
                int i55 = charAt17 & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    charAt6 = str2.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                charAt17 = i55 | (charAt6 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            int charAt18 = str2.charAt(i54);
            if (charAt18 >= 55296) {
                int i58 = charAt18 & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    charAt5 = str2.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                charAt18 = i58 | (charAt5 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            charAt = str2.charAt(i57);
            if (charAt >= 55296) {
                int i61 = charAt & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    charAt4 = str2.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                charAt = i61 | (charAt4 << i62);
                i60 = i17;
            }
            int i63 = i60 + 1;
            int charAt19 = str2.charAt(i60);
            if (charAt19 >= 55296) {
                int i64 = charAt19 & 8191;
                int i65 = 13;
                while (true) {
                    i16 = i63 + 1;
                    charAt3 = str2.charAt(i63);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i16;
                }
                charAt19 = i64 | (charAt3 << i65);
                i63 = i16;
            }
            int i66 = i63 + 1;
            if (str2.charAt(i63) >= 55296) {
                while (true) {
                    i15 = i66 + 1;
                    if (str2.charAt(i66) < 55296) {
                        break;
                    }
                    i66 = i15;
                }
                i66 = i15;
            }
            int i67 = i66 + 1;
            int charAt20 = str2.charAt(i66);
            if (charAt20 >= 55296) {
                int i68 = charAt20 & 8191;
                int i69 = 13;
                while (true) {
                    i14 = i67 + 1;
                    charAt2 = str2.charAt(i67);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i68 |= (charAt2 & 8191) << i69;
                    i69 += 13;
                    i67 = i14;
                }
                charAt20 = i68 | (charAt2 << i69);
                i67 = i14;
            }
            int i70 = charAt15 + charAt15 + charAt16;
            int[] iArr2 = new int[charAt20 + charAt19 + charAt15];
            int i71 = charAt19;
            i6 = charAt17;
            i9 = i71;
            iArr = iArr2;
            i10 = charAt15;
            i45 = i67;
            i11 = charAt18;
            i12 = i70;
            i13 = charAt20;
        }
        Unsafe unsafe = f33562l;
        Class<?> cls = c4264zL.f35314a.getClass();
        int i72 = i13 + i9;
        int i73 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[i73];
        int i74 = i72;
        int i75 = i13;
        int i76 = 0;
        int i77 = 0;
        while (i45 < length) {
            int i78 = i45 + 1;
            int charAt21 = str2.charAt(i45);
            if (charAt21 >= c10) {
                int i79 = charAt21 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i42 = i80 + 1;
                    charAt12 = str2.charAt(i80);
                    if (charAt12 < c10) {
                        break;
                    }
                    i79 |= (charAt12 & 8191) << i81;
                    i81 += 13;
                    i80 = i42;
                }
                charAt21 = i79 | (charAt12 << i81);
                i22 = i42;
            } else {
                i22 = i78;
            }
            int i82 = i22 + 1;
            int charAt22 = str2.charAt(i22);
            if (charAt22 >= c10) {
                int i83 = charAt22 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i41 = i84 + 1;
                    charAt11 = str2.charAt(i84);
                    i23 = length;
                    if (charAt11 < 55296) {
                        break;
                    }
                    i83 |= (charAt11 & 8191) << i85;
                    i85 += 13;
                    i84 = i41;
                    length = i23;
                }
                charAt22 = i83 | (charAt11 << i85);
                i24 = i41;
            } else {
                i23 = length;
                i24 = i82;
            }
            if ((charAt22 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i86 = charAt22 & com.anythink.basead.exoplayer.k.p.f8473b;
            int i87 = charAt21;
            int i88 = charAt22 & 2048;
            Object[] objArr3 = c4264zL.f35316c;
            if (i86 >= 51) {
                int i89 = i24 + 1;
                int charAt23 = str2.charAt(i24);
                if (charAt23 >= 55296) {
                    int i90 = charAt23 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i39 = i91 + 1;
                        charAt10 = str2.charAt(i91);
                        i40 = i90;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i90 = i40 | ((charAt10 & 8191) << i92);
                        i92 += 13;
                        i91 = i39;
                    }
                    charAt23 = i40 | (charAt10 << i92);
                    i36 = i39;
                } else {
                    i36 = i89;
                }
                int i93 = charAt23;
                int i94 = i86 - 51;
                i29 = i36;
                if (i94 == 9 || i94 == 17) {
                    i37 = i12 + 1;
                    int i95 = i77 / 3;
                    objArr2[i95 + i95 + 1] = objArr3[i12];
                } else {
                    if (i94 == 12) {
                        if (c4264zL.a() == 1 || i88 != 0) {
                            i37 = i12 + 1;
                            int i96 = i77 / 3;
                            objArr2[i96 + i96 + 1] = objArr3[i12];
                        } else {
                            i38 = 0;
                            int i97 = i93 + i93;
                            obj = objArr3[i97];
                            int i98 = i38;
                            if (obj instanceof Field) {
                                A10 = (Field) obj;
                            } else {
                                A10 = A(cls, (String) obj);
                                objArr3[i97] = A10;
                                iArr[i74] = i77;
                                i74++;
                            }
                            int i99 = i10;
                            objArr = objArr2;
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(A10);
                            int i100 = i97 + 1;
                            obj2 = objArr3[i100];
                            if (obj2 instanceof Field) {
                                A11 = (Field) obj2;
                            } else {
                                A11 = A(cls, (String) obj2);
                                objArr3[i100] = A11;
                            }
                            i25 = i99;
                            i27 = i98;
                            str = str2;
                            i26 = i12;
                            i31 = 0;
                            c9 = 55296;
                            i28 = (int) unsafe.objectFieldOffset(A11);
                            i30 = objectFieldOffset2;
                        }
                    }
                    i38 = i88;
                    int i972 = i93 + i93;
                    obj = objArr3[i972];
                    int i982 = i38;
                    if (obj instanceof Field) {
                    }
                    int i992 = i10;
                    objArr = objArr2;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(A10);
                    int i1002 = i972 + 1;
                    obj2 = objArr3[i1002];
                    if (obj2 instanceof Field) {
                    }
                    i25 = i992;
                    i27 = i982;
                    str = str2;
                    i26 = i12;
                    i31 = 0;
                    c9 = 55296;
                    i28 = (int) unsafe.objectFieldOffset(A11);
                    i30 = objectFieldOffset22;
                }
                i12 = i37;
                i38 = i88;
                int i9722 = i93 + i93;
                obj = objArr3[i9722];
                int i9822 = i38;
                if (obj instanceof Field) {
                }
                int i9922 = i10;
                objArr = objArr2;
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(A10);
                int i10022 = i9722 + 1;
                obj2 = objArr3[i10022];
                if (obj2 instanceof Field) {
                }
                i25 = i9922;
                i27 = i9822;
                str = str2;
                i26 = i12;
                i31 = 0;
                c9 = 55296;
                i28 = (int) unsafe.objectFieldOffset(A11);
                i30 = objectFieldOffset222;
            } else {
                int i101 = i10;
                objArr = objArr2;
                int i102 = i12 + 1;
                Field A12 = A(cls, (String) objArr3[i12]);
                i25 = i101;
                if (i86 == 9 || i86 == 17) {
                    i26 = i102;
                    int i103 = i77 / 3;
                    objArr[i103 + i103 + 1] = A12.getType();
                } else {
                    if (i86 == 27) {
                        i33 = i102;
                        i34 = 1;
                        i35 = i12 + 2;
                    } else if (i86 == 49) {
                        i35 = i12 + 2;
                        i33 = i102;
                        i34 = 1;
                    } else {
                        if (i86 == 12 || i86 == 30 || i86 == 44) {
                            i26 = i102;
                            if (c4264zL.a() == 1 || i88 != 0) {
                                i35 = i12 + 2;
                                int i104 = i77 / 3;
                                objArr[i104 + i104 + 1] = objArr3[i26];
                                i26 = i35;
                            }
                        } else if (i86 == 50) {
                            int i105 = i12 + 2;
                            int i106 = i75 + 1;
                            iArr[i75] = i77;
                            int i107 = i77 / 3;
                            int i108 = i107 + i107;
                            objArr[i108] = objArr3[i102];
                            if (i88 != 0) {
                                objArr[i108 + 1] = objArr3[i105];
                                i27 = i88;
                                i75 = i106;
                                i26 = i12 + 3;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(A12);
                                i28 = 1048575;
                                if ((charAt22 & 4096) != 0 || i86 > 17) {
                                    str = str2;
                                    c9 = 55296;
                                    i29 = i24;
                                    i30 = objectFieldOffset;
                                    i31 = 0;
                                } else {
                                    int i109 = i24 + 1;
                                    int charAt24 = str2.charAt(i24);
                                    if (charAt24 >= 55296) {
                                        int i110 = charAt24 & 8191;
                                        int i111 = 13;
                                        while (true) {
                                            i32 = i109 + 1;
                                            charAt9 = str2.charAt(i109);
                                            if (charAt9 < 55296) {
                                                break;
                                            }
                                            i110 |= (charAt9 & 8191) << i111;
                                            i111 += 13;
                                            i109 = i32;
                                        }
                                        charAt24 = i110 | (charAt9 << i111);
                                        i109 = i32;
                                    }
                                    int i112 = (charAt24 / 32) + i25 + i25;
                                    Object obj3 = objArr3[i112];
                                    str = str2;
                                    if (obj3 instanceof Field) {
                                        A9 = (Field) obj3;
                                    } else {
                                        A9 = A(cls, (String) obj3);
                                        objArr3[i112] = A9;
                                    }
                                    i31 = charAt24 % 32;
                                    i28 = (int) unsafe.objectFieldOffset(A9);
                                    i30 = objectFieldOffset;
                                    i29 = i109;
                                    c9 = 55296;
                                }
                            } else {
                                i75 = i106;
                                i26 = i105;
                            }
                        } else {
                            i26 = i102;
                        }
                        i27 = 0;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(A12);
                        i28 = 1048575;
                        if ((charAt22 & 4096) != 0) {
                        }
                        str = str2;
                        c9 = 55296;
                        i29 = i24;
                        i30 = objectFieldOffset;
                        i31 = 0;
                    }
                    int i113 = i77 / 3;
                    objArr[i113 + i113 + i34] = objArr3[i33];
                    i26 = i35;
                }
                i27 = i88;
                objectFieldOffset = (int) unsafe.objectFieldOffset(A12);
                i28 = 1048575;
                if ((charAt22 & 4096) != 0) {
                }
                str = str2;
                c9 = 55296;
                i29 = i24;
                i30 = objectFieldOffset;
                i31 = 0;
            }
            int i114 = i77 + 1;
            iArr3[i77] = i87;
            int i115 = i77 + 2;
            int i116 = i31;
            iArr3[i114] = ((charAt22 & 512) != 0 ? 536870912 : 0) | ((charAt22 & 256) != 0 ? 268435456 : 0) | (i27 != 0 ? Integer.MIN_VALUE : 0) | (i86 << 20) | i30;
            i77 += 3;
            iArr3[i115] = (i116 << 20) | i28;
            c10 = c9;
            length = i23;
            i10 = i25;
            i12 = i26;
            str2 = str;
            i45 = i29;
            objArr2 = objArr;
        }
        return new C3832rL(iArr3, objArr2, i6, i11, c4264zL.f35314a, iArr, i13, i72, v22, xj);
    }

    public final void B(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            int k9 = k(i) & 1048575;
            Unsafe unsafe = f33562l;
            long j6 = k9;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i6 = this.f33563a[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(AbstractC4404f.b(i6, 38) + obj3.length());
                sb.append("Source subfield ");
                sb.append(i6);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            DL D8 = D(i);
            if (!s(i, obj)) {
                if (m(object)) {
                    VK c9 = D8.c();
                    D8.d(c9, object);
                    unsafe.putObject(obj, j6, c9);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!m(object2)) {
                VK c10 = D8.c();
                D8.d(c10, object2);
                unsafe.putObject(obj, j6, c10);
                object2 = c10;
            }
            D8.d(object2, object);
        }
    }

    public final void C(int i, Object obj, Object obj2) {
        int[] iArr = this.f33563a;
        int i6 = iArr[i];
        if (u(i6, i, obj2)) {
            int k9 = k(i) & 1048575;
            Unsafe unsafe = f33562l;
            long j6 = k9;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i9 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(AbstractC4404f.b(i9, 38) + obj3.length());
                sb.append("Source subfield ");
                sb.append(i9);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            DL D8 = D(i);
            if (!u(i6, i, obj)) {
                if (m(object)) {
                    VK c9 = D8.c();
                    D8.d(c9, object);
                    unsafe.putObject(obj, j6, c9);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                v(i6, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!m(object2)) {
                VK c10 = D8.c();
                D8.d(c10, object2);
                unsafe.putObject(obj, j6, c10);
                object2 = c10;
            }
            D8.d(object2, object);
        }
    }

    public final DL D(int i) {
        int i6 = i / 3;
        int i9 = i6 + i6;
        Object[] objArr = this.f33564b;
        DL dl = (DL) objArr[i9];
        if (dl != null) {
            return dl;
        }
        DL a9 = C4156xL.f34990c.a((Class) objArr[i9 + 1]);
        objArr[i9] = a9;
        return a9;
    }

    public final Object E(int i) {
        int i6 = i / 3;
        return this.f33564b[i6 + i6];
    }

    public final YK F(int i) {
        int i6 = i / 3;
        return (YK) this.f33564b[i6 + i6 + 1];
    }

    public final Object G(int i, Object obj) {
        DL D8 = D(i);
        int k9 = k(i) & 1048575;
        if (!s(i, obj)) {
            return D8.c();
        }
        Object object = f33562l.getObject(obj, k9);
        if (m(object)) {
            return object;
        }
        VK c9 = D8.c();
        if (object != null) {
            D8.d(c9, object);
        }
        return c9;
    }

    public final void H(int i, Object obj, Object obj2) {
        f33562l.putObject(obj, k(i) & 1048575, obj2);
        t(i, obj);
    }

    public final Object I(int i, int i6, Object obj) {
        DL D8 = D(i6);
        if (!u(i, i6, obj)) {
            return D8.c();
        }
        Object object = f33562l.getObject(obj, k(i6) & 1048575);
        if (m(object)) {
            return object;
        }
        VK c9 = D8.c();
        if (object != null) {
            D8.d(c9, object);
        }
        return c9;
    }

    public final void J(int i, int i6, Object obj, Object obj2) {
        f33562l.putObject(obj, k(i6) & 1048575, obj2);
        v(i, i6, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(int i, Object obj, Object obj2, Object obj3) {
        YK F8;
        char c9;
        int T8;
        int g4;
        int S8;
        SL sl;
        int T9;
        int g9;
        int S9;
        int i6 = this.f33563a[i];
        Object f3 = PL.f(k(i) & 1048575, obj);
        if (f3 == null || (F8 = F(i)) == null) {
            return obj2;
        }
        C4274ze c4274ze = ((C3563mL) E(i)).f31943a;
        Iterator it = ((C3617nL) f3).entrySet().iterator();
        Object obj4 = obj2;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!F8.a(((Integer) entry.getValue()).intValue())) {
                if (obj4 == null) {
                    obj4 = V2.A(obj3);
                }
                Object key = entry.getKey();
                Object value = entry.getValue();
                SL sl2 = (SL) c4274ze.f35360u;
                int i9 = QK.f27020c;
                int S10 = OK.S(8);
                SL sl3 = SL.f27473w;
                if (sl2 == sl3) {
                    S10 += S10;
                }
                TL tl = TL.f27725n;
                switch (sl2.ordinal()) {
                    case 0:
                        c9 = '?';
                        ((Double) key).getClass();
                        T8 = 8;
                        int i10 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S11 = OK.S(16);
                        if (sl == sl3) {
                            S11 += S11;
                        }
                        switch (sl.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                T9 = 8;
                                int i11 = T9 + S11 + i10;
                                HK hk = JK.f25675u;
                                byte[] bArr = new byte[i11];
                                MK mk = new MK(bArr, i11);
                                try {
                                    C3563mL.a(mk, c4274ze, entry.getKey(), entry.getValue());
                                    mk.k0();
                                    ((LL) obj4).d((i6 << 3) | 2, new HK(bArr));
                                    it.remove();
                                    break;
                                } catch (IOException e9) {
                                    throw new RuntimeException(e9);
                                }
                            case 1:
                                ((Float) value).getClass();
                                T9 = 4;
                                int i112 = T9 + S11 + i10;
                                HK hk2 = JK.f25675u;
                                byte[] bArr2 = new byte[i112];
                                MK mk2 = new MK(bArr2, i112);
                                C3563mL.a(mk2, c4274ze, entry.getKey(), entry.getValue());
                                mk2.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr2));
                                it.remove();
                                break;
                            case 2:
                                T9 = OK.T(((Long) value).longValue());
                                int i1122 = T9 + S11 + i10;
                                HK hk22 = JK.f25675u;
                                byte[] bArr22 = new byte[i1122];
                                MK mk22 = new MK(bArr22, i1122);
                                C3563mL.a(mk22, c4274ze, entry.getKey(), entry.getValue());
                                mk22.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr22));
                                it.remove();
                                break;
                            case 3:
                                T9 = OK.T(((Long) value).longValue());
                                int i11222 = T9 + S11 + i10;
                                HK hk222 = JK.f25675u;
                                byte[] bArr222 = new byte[i11222];
                                MK mk222 = new MK(bArr222, i11222);
                                C3563mL.a(mk222, c4274ze, entry.getKey(), entry.getValue());
                                mk222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr222));
                                it.remove();
                                break;
                            case 4:
                                T9 = OK.T(((Integer) value).intValue());
                                int i112222 = T9 + S11 + i10;
                                HK hk2222 = JK.f25675u;
                                byte[] bArr2222 = new byte[i112222];
                                MK mk2222 = new MK(bArr2222, i112222);
                                C3563mL.a(mk2222, c4274ze, entry.getKey(), entry.getValue());
                                mk2222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr2222));
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                T9 = 8;
                                int i1122222 = T9 + S11 + i10;
                                HK hk22222 = JK.f25675u;
                                byte[] bArr22222 = new byte[i1122222];
                                MK mk22222 = new MK(bArr22222, i1122222);
                                C3563mL.a(mk22222, c4274ze, entry.getKey(), entry.getValue());
                                mk22222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr22222));
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                T9 = 4;
                                int i11222222 = T9 + S11 + i10;
                                HK hk222222 = JK.f25675u;
                                byte[] bArr222222 = new byte[i11222222];
                                MK mk222222 = new MK(bArr222222, i11222222);
                                C3563mL.a(mk222222, c4274ze, entry.getKey(), entry.getValue());
                                mk222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr222222));
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                T9 = 1;
                                int i112222222 = T9 + S11 + i10;
                                HK hk2222222 = JK.f25675u;
                                byte[] bArr2222222 = new byte[i112222222];
                                MK mk2222222 = new MK(bArr2222222, i112222222);
                                C3563mL.a(mk2222222, c4274ze, entry.getKey(), entry.getValue());
                                mk2222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr2222222));
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof JK) {
                                    g9 = ((JK) value).f();
                                    S9 = OK.S(g9);
                                } else {
                                    int i12 = RL.f27197a;
                                    g9 = QC.g((String) value);
                                    S9 = OK.S(g9);
                                }
                                T9 = S9 + g9;
                                int i1122222222 = T9 + S11 + i10;
                                HK hk22222222 = JK.f25675u;
                                byte[] bArr22222222 = new byte[i1122222222];
                                MK mk22222222 = new MK(bArr22222222, i1122222222);
                                C3563mL.a(mk22222222, c4274ze, entry.getKey(), entry.getValue());
                                mk22222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr22222222));
                                it.remove();
                                break;
                            case 9:
                                T9 = ((VK) ((AbstractC4263zK) value)).d(null);
                                int i11222222222 = T9 + S11 + i10;
                                HK hk222222222 = JK.f25675u;
                                byte[] bArr222222222 = new byte[i11222222222];
                                MK mk222222222 = new MK(bArr222222222, i11222222222);
                                C3563mL.a(mk222222222, c4274ze, entry.getKey(), entry.getValue());
                                mk222222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr222222222));
                                it.remove();
                                break;
                            case 10:
                                if (!(value instanceof AbstractC3187fL)) {
                                    g9 = ((VK) ((AbstractC4263zK) value)).d(null);
                                    S9 = OK.S(g9);
                                    T9 = S9 + g9;
                                    int i112222222222 = T9 + S11 + i10;
                                    HK hk2222222222 = JK.f25675u;
                                    byte[] bArr2222222222 = new byte[i112222222222];
                                    MK mk2222222222 = new MK(bArr2222222222, i112222222222);
                                    C3563mL.a(mk2222222222, c4274ze, entry.getKey(), entry.getValue());
                                    mk2222222222.k0();
                                    ((LL) obj4).d((i6 << 3) | 2, new HK(bArr2222222222));
                                    it.remove();
                                    break;
                                } else {
                                    ((AbstractC3187fL) value).getClass();
                                    throw null;
                                }
                            case 11:
                                if (value instanceof JK) {
                                    g9 = ((JK) value).f();
                                    S9 = OK.S(g9);
                                } else {
                                    g9 = ((byte[]) value).length;
                                    S9 = OK.S(g9);
                                }
                                T9 = S9 + g9;
                                int i1122222222222 = T9 + S11 + i10;
                                HK hk22222222222 = JK.f25675u;
                                byte[] bArr22222222222 = new byte[i1122222222222];
                                MK mk22222222222 = new MK(bArr22222222222, i1122222222222);
                                C3563mL.a(mk22222222222, c4274ze, entry.getKey(), entry.getValue());
                                mk22222222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr22222222222));
                                it.remove();
                                break;
                            case 12:
                                T9 = OK.S(((Integer) value).intValue());
                                int i11222222222222 = T9 + S11 + i10;
                                HK hk222222222222 = JK.f25675u;
                                byte[] bArr222222222222 = new byte[i11222222222222];
                                MK mk222222222222 = new MK(bArr222222222222, i11222222222222);
                                C3563mL.a(mk222222222222, c4274ze, entry.getKey(), entry.getValue());
                                mk222222222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr222222222222));
                                it.remove();
                                break;
                            case 13:
                                T9 = value instanceof XK ? OK.T(((XK) value).c()) : OK.T(((Integer) value).intValue());
                                int i112222222222222 = T9 + S11 + i10;
                                HK hk2222222222222 = JK.f25675u;
                                byte[] bArr2222222222222 = new byte[i112222222222222];
                                MK mk2222222222222 = new MK(bArr2222222222222, i112222222222222);
                                C3563mL.a(mk2222222222222, c4274ze, entry.getKey(), entry.getValue());
                                mk2222222222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr2222222222222));
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                T9 = 4;
                                int i1122222222222222 = T9 + S11 + i10;
                                HK hk22222222222222 = JK.f25675u;
                                byte[] bArr22222222222222 = new byte[i1122222222222222];
                                MK mk22222222222222 = new MK(bArr22222222222222, i1122222222222222);
                                C3563mL.a(mk22222222222222, c4274ze, entry.getKey(), entry.getValue());
                                mk22222222222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr22222222222222));
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                T9 = 8;
                                int i11222222222222222 = T9 + S11 + i10;
                                HK hk222222222222222 = JK.f25675u;
                                byte[] bArr222222222222222 = new byte[i11222222222222222];
                                MK mk222222222222222 = new MK(bArr222222222222222, i11222222222222222);
                                C3563mL.a(mk222222222222222, c4274ze, entry.getKey(), entry.getValue());
                                mk222222222222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr222222222222222));
                                it.remove();
                                break;
                            case 16:
                                int intValue = ((Integer) value).intValue();
                                T9 = OK.S((intValue >> 31) ^ (intValue + intValue));
                                int i112222222222222222 = T9 + S11 + i10;
                                HK hk2222222222222222 = JK.f25675u;
                                byte[] bArr2222222222222222 = new byte[i112222222222222222];
                                MK mk2222222222222222 = new MK(bArr2222222222222222, i112222222222222222);
                                C3563mL.a(mk2222222222222222, c4274ze, entry.getKey(), entry.getValue());
                                mk2222222222222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr2222222222222222));
                                it.remove();
                                break;
                            case 17:
                                long longValue = ((Long) value).longValue();
                                T9 = OK.T((longValue >> c9) ^ (longValue + longValue));
                                int i1122222222222222222 = T9 + S11 + i10;
                                HK hk22222222222222222 = JK.f25675u;
                                byte[] bArr22222222222222222 = new byte[i1122222222222222222];
                                MK mk22222222222222222 = new MK(bArr22222222222222222, i1122222222222222222);
                                C3563mL.a(mk22222222222222222, c4274ze, entry.getKey(), entry.getValue());
                                mk22222222222222222.k0();
                                ((LL) obj4).d((i6 << 3) | 2, new HK(bArr22222222222222222));
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    case 1:
                        c9 = '?';
                        ((Float) key).getClass();
                        T8 = 4;
                        int i102 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S112 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 2:
                        c9 = '?';
                        T8 = OK.T(((Long) key).longValue());
                        int i1022 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S1122 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 3:
                        c9 = '?';
                        T8 = OK.T(((Long) key).longValue());
                        int i10222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S11222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 4:
                        c9 = '?';
                        T8 = OK.T(((Integer) key).intValue());
                        int i102222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S112222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 5:
                        c9 = '?';
                        ((Long) key).getClass();
                        T8 = 8;
                        int i1022222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S1122222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 6:
                        c9 = '?';
                        ((Integer) key).getClass();
                        T8 = 4;
                        int i10222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S11222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 7:
                        c9 = '?';
                        ((Boolean) key).getClass();
                        T8 = 1;
                        int i102222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S112222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 8:
                        c9 = '?';
                        if (key instanceof JK) {
                            g4 = ((JK) key).f();
                            S8 = OK.S(g4);
                        } else {
                            int i13 = RL.f27197a;
                            g4 = QC.g((String) key);
                            S8 = OK.S(g4);
                        }
                        T8 = g4 + S8;
                        int i1022222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S1122222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 9:
                        c9 = '?';
                        T8 = ((VK) ((AbstractC4263zK) key)).d(null);
                        int i10222222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S11222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 10:
                        c9 = '?';
                        if (key instanceof AbstractC3187fL) {
                            ((AbstractC3187fL) key).getClass();
                            throw null;
                        }
                        g4 = ((VK) ((AbstractC4263zK) key)).d(null);
                        S8 = OK.S(g4);
                        T8 = g4 + S8;
                        int i102222222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S112222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 11:
                        c9 = '?';
                        if (key instanceof JK) {
                            g4 = ((JK) key).f();
                            S8 = OK.S(g4);
                        } else {
                            g4 = ((byte[]) key).length;
                            S8 = OK.S(g4);
                        }
                        T8 = g4 + S8;
                        int i1022222222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S1122222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 12:
                        c9 = '?';
                        T8 = OK.S(((Integer) key).intValue());
                        int i10222222222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S11222222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 13:
                        if (key instanceof XK) {
                            c9 = '?';
                            T8 = OK.T(((XK) key).c());
                        } else {
                            c9 = '?';
                            T8 = OK.T(((Integer) key).intValue());
                        }
                        int i102222222222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S112222222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 14:
                        ((Integer) key).getClass();
                        c9 = '?';
                        T8 = 4;
                        int i1022222222222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S1122222222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 15:
                        ((Long) key).getClass();
                        c9 = '?';
                        T8 = 8;
                        int i10222222222222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S11222222222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 16:
                        int intValue2 = ((Integer) key).intValue();
                        T8 = OK.S((intValue2 >> 31) ^ (intValue2 + intValue2));
                        c9 = '?';
                        int i102222222222222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S112222222222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 17:
                        long longValue2 = ((Long) key).longValue();
                        T8 = OK.T((longValue2 + longValue2) ^ (longValue2 >> 63));
                        c9 = '?';
                        int i1022222222222222222 = T8 + S10;
                        sl = (SL) c4274ze.f35361v;
                        int S1122222222222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
        return obj4;
    }

    public final void L(int i, C4242z c4242z, Object obj) {
        long j6 = i & 1048575;
        if ((536870912 & i) != 0) {
            c4242z.u(2);
            PL.g(j6, obj, ((W7.b) c4242z.f35260w).w());
        } else if (!this.f33568f) {
            PL.g(j6, obj, c4242z.D());
        } else {
            c4242z.u(2);
            PL.g(j6, obj, ((W7.b) c4242z.f35260w).v());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ca  */
    @Override // com.google.android.gms.internal.ads.DL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, C4178xq c4178xq) {
        int[] iArr;
        int i;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        Iterator it;
        int T8;
        int g4;
        int S8;
        int d2;
        int S9;
        SL sl;
        int T9;
        int g9;
        int S10;
        C3832rL c3832rL = this;
        int i18 = 3;
        int i19 = 2;
        Unsafe unsafe = f33562l;
        int i20 = 1048575;
        int i21 = 1048575;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            int[] iArr2 = c3832rL.f33563a;
            if (i22 >= iArr2.length) {
                ((VK) obj).zzt.b(c4178xq);
                return;
            }
            int k9 = c3832rL.k(i22);
            int l9 = l(k9);
            int i24 = iArr2[i22];
            if (l9 <= 17) {
                int i25 = iArr2[i22 + 2];
                int i26 = i25 & i20;
                if (i26 != i21) {
                    i23 = i26 == i20 ? 0 : unsafe.getInt(obj, i26);
                    i21 = i26;
                }
                iArr = iArr2;
                i = 1 << (i25 >>> 20);
            } else {
                iArr = iArr2;
                i = 0;
            }
            long j6 = k9 & i20;
            switch (l9) {
                case 0:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).s1(i24, Double.doubleToRawLongBits(PL.f26761c.o1(j6, obj)));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 1:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).p1(i24, Float.floatToRawIntBits(PL.f26761c.a0(j6, obj)));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 2:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).q1(i24, unsafe.getLong(obj, j6));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 3:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).q1(i24, unsafe.getLong(obj, j6));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 4:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).b0(i24, unsafe.getInt(obj, j6));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 5:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).s1(i24, unsafe.getLong(obj, j6));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 6:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).p1(i24, unsafe.getInt(obj, j6));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 7:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).v1(i24, PL.f26761c.W(j6, obj));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 8:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        Object object = unsafe.getObject(obj, j6);
                        if (object instanceof String) {
                            ((OK) c4178xq.f35055u).x1(i24, (String) object);
                        } else {
                            ((OK) c4178xq.f35055u).y1(i24, (JK) object);
                        }
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 9:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        c4178xq.e(i24, unsafe.getObject(obj, j6), c3832rL.D(i22));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 10:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).y1(i24, (JK) unsafe.getObject(obj, j6));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 11:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).e0(i24, unsafe.getInt(obj, j6));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 12:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).b0(i24, unsafe.getInt(obj, j6));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 13:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).p1(i24, unsafe.getInt(obj, j6));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 14:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        ((OK) c4178xq.f35055u).s1(i24, unsafe.getLong(obj, j6));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 15:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        int i27 = unsafe.getInt(obj, j6);
                        ((OK) c4178xq.f35055u).e0(i24, (i27 >> 31) ^ (i27 + i27));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 16:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        long j9 = unsafe.getLong(obj, j6);
                        ((OK) c4178xq.f35055u).q1(i24, (j9 >> 63) ^ (j9 + j9));
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 17:
                    if (c3832rL.r(obj, i22, i21, i23, i)) {
                        Object object2 = unsafe.getObject(obj, j6);
                        DL D8 = c3832rL.D(i22);
                        c4178xq.getClass();
                        OK ok = (OK) c4178xq.f35055u;
                        ok.Y(i24, 3);
                        D8.a((AbstractC4263zK) object2, c4178xq);
                        ok.Y(i24, 4);
                    }
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 18:
                    i6 = i21;
                    i9 = i23;
                    EL.g(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i6;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 19:
                    i6 = i21;
                    i9 = i23;
                    EL.h(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i6;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 20:
                    i6 = i21;
                    i9 = i23;
                    EL.i(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i6;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 21:
                    i6 = i21;
                    i9 = i23;
                    EL.j(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i6;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 22:
                    i6 = i21;
                    i9 = i23;
                    EL.n(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i6;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 23:
                    i6 = i21;
                    i9 = i23;
                    EL.l(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i6;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 24:
                    i6 = i21;
                    i9 = i23;
                    EL.q(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i6;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 25:
                    i6 = i21;
                    i9 = i23;
                    EL.t(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i6;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 26:
                    i10 = i21;
                    i11 = i23;
                    int i28 = iArr[i22];
                    List list = (List) unsafe.getObject(obj, j6);
                    V2 v22 = EL.f24582a;
                    if (list != null && !list.isEmpty()) {
                        c4178xq.getClass();
                        for (int i29 = 0; i29 < list.size(); i29++) {
                            ((OK) c4178xq.f35055u).x1(i28, (String) list.get(i29));
                        }
                    }
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                    break;
                case 27:
                    i12 = i21;
                    i13 = i23;
                    int i30 = iArr[i22];
                    List list2 = (List) unsafe.getObject(obj, j6);
                    DL D9 = c3832rL.D(i22);
                    V2 v23 = EL.f24582a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i31 = 0; i31 < list2.size(); i31++) {
                            c4178xq.e(i30, list2.get(i31), D9);
                        }
                    }
                    i21 = i12;
                    i23 = i13;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                    break;
                case 28:
                    i12 = i21;
                    i13 = i23;
                    int i32 = iArr[i22];
                    List list3 = (List) unsafe.getObject(obj, j6);
                    V2 v24 = EL.f24582a;
                    if (list3 != null && !list3.isEmpty()) {
                        c4178xq.getClass();
                        for (int i33 = 0; i33 < list3.size(); i33++) {
                            ((OK) c4178xq.f35055u).y1(i32, (JK) list3.get(i33));
                        }
                    }
                    i21 = i12;
                    i23 = i13;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                    break;
                case 29:
                    i14 = i21;
                    i15 = i23;
                    z3 = false;
                    EL.o(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 30:
                    i14 = i21;
                    i15 = i23;
                    z3 = false;
                    EL.s(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 31:
                    i14 = i21;
                    i15 = i23;
                    z3 = false;
                    EL.r(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 32:
                    i14 = i21;
                    i15 = i23;
                    z3 = false;
                    EL.m(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 33:
                    i14 = i21;
                    i15 = i23;
                    z3 = false;
                    EL.p(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 34:
                    i14 = i21;
                    i15 = i23;
                    z3 = false;
                    EL.k(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 35:
                    i10 = i21;
                    i11 = i23;
                    EL.g(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 36:
                    i10 = i21;
                    i11 = i23;
                    EL.h(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 37:
                    i10 = i21;
                    i11 = i23;
                    EL.i(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5806M /* 38 */:
                    i10 = i21;
                    i11 = i23;
                    EL.j(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 39:
                    i10 = i21;
                    i11 = i23;
                    EL.n(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5808O /* 40 */:
                    i10 = i21;
                    i11 = i23;
                    EL.l(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 41:
                    i10 = i21;
                    i11 = i23;
                    EL.q(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 42:
                    i10 = i21;
                    i11 = i23;
                    EL.t(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5811R /* 43 */:
                    i10 = i21;
                    i11 = i23;
                    EL.o(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5812S /* 44 */:
                    i10 = i21;
                    i11 = i23;
                    EL.s(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5813T /* 45 */:
                    i10 = i21;
                    i11 = i23;
                    EL.r(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 46:
                    i10 = i21;
                    i11 = i23;
                    EL.m(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 47:
                    i10 = i21;
                    i11 = i23;
                    EL.p(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5816W /* 48 */:
                    i10 = i21;
                    i11 = i23;
                    EL.k(iArr[i22], (List) unsafe.getObject(obj, j6), c4178xq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5817X /* 49 */:
                    i10 = i21;
                    i11 = i23;
                    int i34 = iArr[i22];
                    List list4 = (List) unsafe.getObject(obj, j6);
                    DL D10 = c3832rL.D(i22);
                    V2 v25 = EL.f24582a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i35 = 0; i35 < list4.size(); i35++) {
                            Object obj2 = list4.get(i35);
                            c4178xq.getClass();
                            OK ok2 = (OK) c4178xq.f35055u;
                            ok2.Y(i34, 3);
                            D10.a((AbstractC4263zK) obj2, c4178xq);
                            ok2.Y(i34, 4);
                        }
                    }
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j6);
                    if (object3 != null) {
                        C4274ze c4274ze = ((C3563mL) c3832rL.E(i22)).f31943a;
                        c4178xq.getClass();
                        Iterator it2 = ((C3617nL) object3).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            OK ok3 = (OK) c4178xq.f35055u;
                            ok3.Y(i24, i19);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            SL sl2 = (SL) c4274ze.f35360u;
                            int i36 = QK.f27020c;
                            int S11 = OK.S(8);
                            SL sl3 = SL.f27473w;
                            if (sl2 == sl3) {
                                S11 += S11;
                            }
                            TL tl = TL.f27725n;
                            int i37 = i21;
                            switch (sl2.ordinal()) {
                                case 0:
                                    i17 = i23;
                                    it = it2;
                                    ((Double) key).getClass();
                                    T8 = 8;
                                    int i38 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S12 = OK.S(16);
                                    if (sl == sl3) {
                                        S12 += S12;
                                    }
                                    switch (sl.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            T9 = 8;
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 1:
                                            ((Float) value).getClass();
                                            T9 = 4;
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 2:
                                            T9 = OK.T(((Long) value).longValue());
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 3:
                                            T9 = OK.T(((Long) value).longValue());
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 4:
                                            T9 = OK.T(((Integer) value).intValue());
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 5:
                                            ((Long) value).getClass();
                                            T9 = 8;
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 6:
                                            ((Integer) value).getClass();
                                            T9 = 4;
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            T9 = 1;
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 8:
                                            if (value instanceof JK) {
                                                g9 = ((JK) value).f();
                                                S10 = OK.S(g9);
                                            } else {
                                                int i39 = RL.f27197a;
                                                g9 = QC.g((String) value);
                                                S10 = OK.S(g9);
                                            }
                                            T9 = g9 + S10;
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 9:
                                            T9 = ((VK) ((AbstractC4263zK) value)).d(null);
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 10:
                                            if (value instanceof AbstractC3187fL) {
                                                ((AbstractC3187fL) value).getClass();
                                                throw null;
                                            }
                                            g9 = ((VK) ((AbstractC4263zK) value)).d(null);
                                            S10 = OK.S(g9);
                                            T9 = g9 + S10;
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 11:
                                            if (value instanceof JK) {
                                                g9 = ((JK) value).f();
                                                S10 = OK.S(g9);
                                            } else {
                                                g9 = ((byte[]) value).length;
                                                S10 = OK.S(g9);
                                            }
                                            T9 = g9 + S10;
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 12:
                                            T9 = OK.S(((Integer) value).intValue());
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 13:
                                            T9 = value instanceof XK ? OK.T(((XK) value).c()) : OK.T(((Integer) value).intValue());
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 14:
                                            ((Integer) value).getClass();
                                            T9 = 4;
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 15:
                                            ((Long) value).getClass();
                                            T9 = 8;
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            T9 = OK.S((intValue >> 31) ^ (intValue + intValue));
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            T9 = OK.T((longValue + longValue) ^ (longValue >> 63));
                                            ok3.I1(T9 + S12 + i38);
                                            C3563mL.a(ok3, c4274ze, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    i17 = i23;
                                    it = it2;
                                    ((Float) key).getClass();
                                    T8 = 4;
                                    int i382 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S122 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 2:
                                    i17 = i23;
                                    it = it2;
                                    T8 = OK.T(((Long) key).longValue());
                                    int i3822 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S1222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 3:
                                    i17 = i23;
                                    it = it2;
                                    T8 = OK.T(((Long) key).longValue());
                                    int i38222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S12222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 4:
                                    i17 = i23;
                                    it = it2;
                                    T8 = OK.T(((Integer) key).intValue());
                                    int i382222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S122222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 5:
                                    i17 = i23;
                                    it = it2;
                                    ((Long) key).getClass();
                                    T8 = 8;
                                    int i3822222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S1222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 6:
                                    i17 = i23;
                                    it = it2;
                                    ((Integer) key).getClass();
                                    T8 = 4;
                                    int i38222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S12222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 7:
                                    i17 = i23;
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    T8 = 1;
                                    int i382222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S122222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 8:
                                    i17 = i23;
                                    it = it2;
                                    if (key instanceof JK) {
                                        g4 = ((JK) key).f();
                                        S8 = OK.S(g4);
                                    } else {
                                        int i40 = RL.f27197a;
                                        g4 = QC.g((String) key);
                                        S8 = OK.S(g4);
                                    }
                                    T8 = g4 + S8;
                                    int i3822222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S1222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 9:
                                    i17 = i23;
                                    it = it2;
                                    d2 = ((VK) ((AbstractC4263zK) key)).d(null);
                                    T8 = d2;
                                    int i38222222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S12222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 10:
                                    i17 = i23;
                                    it = it2;
                                    if (key instanceof AbstractC3187fL) {
                                        ((AbstractC3187fL) key).getClass();
                                        throw null;
                                    }
                                    int d9 = ((VK) ((AbstractC4263zK) key)).d(null);
                                    d2 = d9 + OK.S(d9);
                                    T8 = d2;
                                    int i382222222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S122222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 11:
                                    i17 = i23;
                                    it = it2;
                                    if (key instanceof JK) {
                                        g4 = ((JK) key).f();
                                        S8 = OK.S(g4);
                                    } else {
                                        g4 = ((byte[]) key).length;
                                        S8 = OK.S(g4);
                                    }
                                    T8 = g4 + S8;
                                    int i3822222222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S1222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 12:
                                    i17 = i23;
                                    it = it2;
                                    T8 = OK.S(((Integer) key).intValue());
                                    int i38222222222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S12222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 13:
                                    if (key instanceof XK) {
                                        i17 = i23;
                                        it = it2;
                                        T8 = OK.T(((XK) key).c());
                                    } else {
                                        i17 = i23;
                                        it = it2;
                                        T8 = OK.T(((Integer) key).intValue());
                                    }
                                    int i382222222222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S122222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    i17 = i23;
                                    it = it2;
                                    T8 = 4;
                                    int i3822222222222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S1222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    i17 = i23;
                                    it = it2;
                                    T8 = 8;
                                    int i38222222222222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S12222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    S9 = OK.S((intValue2 >> 31) ^ (intValue2 + intValue2));
                                    i17 = i23;
                                    it = it2;
                                    T8 = S9;
                                    int i382222222222222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S122222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    S9 = OK.T((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    i17 = i23;
                                    it = it2;
                                    T8 = S9;
                                    int i3822222222222222222 = T8 + S11;
                                    sl = (SL) c4274ze.f35361v;
                                    int S1222222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 51:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).s1(i24, Double.doubleToRawLongBits(((Double) PL.f(j6, obj)).doubleValue()));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 52:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).p1(i24, Float.floatToRawIntBits(((Float) PL.f(j6, obj)).floatValue()));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).q1(i24, p(j6, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 54:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).q1(i24, p(j6, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 55:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).b0(i24, o(j6, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case p.a.f19679e /* 56 */:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).s1(i24, p(j6, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 57:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).p1(i24, o(j6, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 58:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).v1(i24, ((Boolean) PL.f(j6, obj)).booleanValue());
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case j.v.f12591n /* 59 */:
                    if (c3832rL.u(i24, i22, obj)) {
                        Object object4 = unsafe.getObject(obj, j6);
                        if (object4 instanceof String) {
                            ((OK) c4178xq.f35055u).x1(i24, (String) object4);
                        } else {
                            ((OK) c4178xq.f35055u).y1(i24, (JK) object4);
                        }
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 60:
                    if (c3832rL.u(i24, i22, obj)) {
                        c4178xq.e(i24, unsafe.getObject(obj, j6), c3832rL.D(i22));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 61:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).y1(i24, (JK) unsafe.getObject(obj, j6));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 62:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).e0(i24, o(j6, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 63:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).b0(i24, o(j6, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 64:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).p1(i24, o(j6, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case j.v.f12576G /* 65 */:
                    if (c3832rL.u(i24, i22, obj)) {
                        ((OK) c4178xq.f35055u).s1(i24, p(j6, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 66:
                    if (c3832rL.u(i24, i22, obj)) {
                        int o6 = o(j6, obj);
                        ((OK) c4178xq.f35055u).e0(i24, (o6 >> 31) ^ (o6 + o6));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case j.v.f12582d /* 67 */:
                    if (c3832rL.u(i24, i22, obj)) {
                        long p9 = p(j6, obj);
                        ((OK) c4178xq.f35055u).q1(i24, (p9 >> 63) ^ (p9 + p9));
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 68:
                    if (c3832rL.u(i24, i22, obj)) {
                        Object object5 = unsafe.getObject(obj, j6);
                        DL D11 = c3832rL.D(i22);
                        c4178xq.getClass();
                        OK ok4 = (OK) c4178xq.f35055u;
                        ok4.Y(i24, i18);
                        D11.a((AbstractC4263zK) object5, c4178xq);
                        ok4.Y(i24, 4);
                    }
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                default:
                    i16 = i18;
                    i22 += 3;
                    c3832rL = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void b(Object obj, C4242z c4242z, PK pk) {
        int l9;
        W7.b bVar;
        int[] iArr = this.f33569g;
        int i = this.i;
        int i6 = this.f33570h;
        pk.getClass();
        n(obj);
        Object obj2 = null;
        while (true) {
            try {
                int B9 = c4242z.B();
                int w6 = (B9 < this.f33565c || B9 > this.f33566d) ? -1 : w(B9, 0);
                V2 v22 = this.f33571j;
                if (w6 >= 0) {
                    int k9 = k(w6);
                    try {
                        l9 = l(k9);
                        bVar = (W7.b) c4242z.f35260w;
                    } catch (C3241gL unused) {
                        if (obj2 == null) {
                            obj2 = V2.A(obj);
                        }
                        v22.getClass();
                        if (!V2.y(0, c4242z, obj2)) {
                            while (i6 < i) {
                                obj2 = K(iArr[i6], obj, obj2, obj);
                                i6++;
                            }
                        }
                    }
                    switch (l9) {
                        case 0:
                            c4242z.u(1);
                            PL.f26761c.r1(obj, k9 & 1048575, bVar.m());
                            t(w6, obj);
                            continue;
                        case 1:
                            c4242z.u(5);
                            PL.f26761c.n1(obj, k9 & 1048575, bVar.n());
                            t(w6, obj);
                            continue;
                        case 2:
                            c4242z.u(0);
                            PL.e(obj, k9 & 1048575, bVar.q());
                            t(w6, obj);
                            continue;
                        case 3:
                            c4242z.u(0);
                            PL.e(obj, k9 & 1048575, bVar.o());
                            t(w6, obj);
                            continue;
                        case 4:
                            c4242z.u(0);
                            PL.c(bVar.r(), k9 & 1048575, obj);
                            t(w6, obj);
                            continue;
                        case 5:
                            c4242z.u(1);
                            PL.e(obj, k9 & 1048575, bVar.s());
                            t(w6, obj);
                            continue;
                        case 6:
                            c4242z.u(5);
                            PL.c(bVar.t(), k9 & 1048575, obj);
                            t(w6, obj);
                            continue;
                        case 7:
                            c4242z.u(0);
                            PL.f26761c.Z(obj, k9 & 1048575, bVar.u());
                            t(w6, obj);
                            continue;
                        case 8:
                            L(k9, c4242z, obj);
                            t(w6, obj);
                            continue;
                        case 9:
                            AbstractC4263zK abstractC4263zK = (AbstractC4263zK) G(w6, obj);
                            DL D8 = D(w6);
                            c4242z.u(2);
                            c4242z.v(abstractC4263zK, D8, pk);
                            H(w6, obj, abstractC4263zK);
                            continue;
                        case 10:
                            PL.g(k9 & 1048575, obj, c4242z.D());
                            t(w6, obj);
                            continue;
                        case 11:
                            c4242z.u(0);
                            PL.c(bVar.y(), k9 & 1048575, obj);
                            t(w6, obj);
                            continue;
                        case 12:
                            c4242z.u(0);
                            int z3 = bVar.z();
                            YK F8 = F(w6);
                            if (F8 != null && !F8.a(z3)) {
                                obj2 = EL.f(B9, z3, obj, obj2);
                            }
                            PL.c(z3, k9 & 1048575, obj);
                            t(w6, obj);
                            continue;
                            break;
                        case 13:
                            c4242z.u(5);
                            PL.c(bVar.A(), k9 & 1048575, obj);
                            t(w6, obj);
                            continue;
                        case 14:
                            c4242z.u(1);
                            PL.e(obj, k9 & 1048575, bVar.B());
                            t(w6, obj);
                            continue;
                        case 15:
                            c4242z.u(0);
                            PL.c(bVar.C(), k9 & 1048575, obj);
                            t(w6, obj);
                            continue;
                        case 16:
                            c4242z.u(0);
                            PL.e(obj, k9 & 1048575, bVar.D());
                            t(w6, obj);
                            continue;
                        case 17:
                            AbstractC4263zK abstractC4263zK2 = (AbstractC4263zK) G(w6, obj);
                            DL D9 = D(w6);
                            c4242z.u(3);
                            c4242z.w(abstractC4263zK2, D9, pk);
                            H(w6, obj, abstractC4263zK2);
                            continue;
                        case 18:
                            c4242z.E(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 19:
                            c4242z.F(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 20:
                            c4242z.a(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 21:
                            c4242z.G(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 22:
                            c4242z.b(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 23:
                            c4242z.d(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 24:
                            c4242z.e(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 25:
                            c4242z.f(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 26:
                            if ((536870912 & k9) != 0) {
                                c4242z.g(XJ.b(k9 & 1048575, obj), true);
                            } else {
                                c4242z.g(XJ.b(k9 & 1048575, obj), false);
                                continue;
                            }
                        case 27:
                            c4242z.h(XJ.b(k9 & 1048575, obj), D(w6), pk);
                            continue;
                        case 28:
                            c4242z.j(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 29:
                            c4242z.k(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 30:
                            InterfaceC3026cL b9 = XJ.b(k9 & 1048575, obj);
                            c4242z.l(b9);
                            obj2 = EL.e(obj, B9, b9, F(w6), obj2);
                            continue;
                        case 31:
                            c4242z.m(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 32:
                            c4242z.n(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 33:
                            c4242z.r(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 34:
                            c4242z.s(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 35:
                            c4242z.E(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 36:
                            c4242z.F(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 37:
                            c4242z.a(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f5806M /* 38 */:
                            c4242z.G(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 39:
                            c4242z.b(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f5808O /* 40 */:
                            c4242z.d(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 41:
                            c4242z.e(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 42:
                            c4242z.f(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f5811R /* 43 */:
                            c4242z.k(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f5812S /* 44 */:
                            InterfaceC3026cL b10 = XJ.b(k9 & 1048575, obj);
                            c4242z.l(b10);
                            obj2 = EL.e(obj, B9, b10, F(w6), obj2);
                            continue;
                        case com.anythink.basead.b.b.j.f5813T /* 45 */:
                            c4242z.m(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 46:
                            c4242z.n(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 47:
                            c4242z.r(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f5816W /* 48 */:
                            c4242z.s(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f5817X /* 49 */:
                            c4242z.i(XJ.b(k9 & 1048575, obj), D(w6), pk);
                            continue;
                        case 50:
                            Object E8 = E(w6);
                            long k10 = k(w6) & 1048575;
                            Object f3 = PL.f(k10, obj);
                            if (f3 == null) {
                                f3 = C3617nL.f32721u.h();
                                PL.g(k10, obj, f3);
                            } else if (!((C3617nL) f3).f32722n) {
                                Object h9 = C3617nL.f32721u.h();
                                XJ.g(h9, f3);
                                PL.g(k10, obj, h9);
                                f3 = h9;
                            }
                            c4242z.t((C3617nL) f3, ((C3563mL) E8).b(), pk);
                            continue;
                        case 51:
                            c4242z.u(1);
                            PL.g(k9 & 1048575, obj, Double.valueOf(bVar.m()));
                            v(B9, w6, obj);
                            continue;
                        case 52:
                            c4242z.u(5);
                            PL.g(k9 & 1048575, obj, Float.valueOf(bVar.n()));
                            v(B9, w6, obj);
                            continue;
                        case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                            c4242z.u(0);
                            PL.g(k9 & 1048575, obj, Long.valueOf(bVar.q()));
                            v(B9, w6, obj);
                            continue;
                        case 54:
                            c4242z.u(0);
                            PL.g(k9 & 1048575, obj, Long.valueOf(bVar.o()));
                            v(B9, w6, obj);
                            continue;
                        case 55:
                            c4242z.u(0);
                            PL.g(k9 & 1048575, obj, Integer.valueOf(bVar.r()));
                            v(B9, w6, obj);
                            continue;
                        case p.a.f19679e /* 56 */:
                            c4242z.u(1);
                            PL.g(k9 & 1048575, obj, Long.valueOf(bVar.s()));
                            v(B9, w6, obj);
                            continue;
                        case 57:
                            c4242z.u(5);
                            PL.g(k9 & 1048575, obj, Integer.valueOf(bVar.t()));
                            v(B9, w6, obj);
                            continue;
                        case 58:
                            c4242z.u(0);
                            PL.g(k9 & 1048575, obj, Boolean.valueOf(bVar.u()));
                            v(B9, w6, obj);
                            continue;
                        case j.v.f12591n /* 59 */:
                            L(k9, c4242z, obj);
                            v(B9, w6, obj);
                            continue;
                        case 60:
                            AbstractC4263zK abstractC4263zK3 = (AbstractC4263zK) I(B9, w6, obj);
                            DL D10 = D(w6);
                            c4242z.u(2);
                            c4242z.v(abstractC4263zK3, D10, pk);
                            J(B9, w6, obj, abstractC4263zK3);
                            continue;
                        case 61:
                            PL.g(k9 & 1048575, obj, c4242z.D());
                            v(B9, w6, obj);
                            continue;
                        case 62:
                            c4242z.u(0);
                            PL.g(k9 & 1048575, obj, Integer.valueOf(bVar.y()));
                            v(B9, w6, obj);
                            continue;
                        case 63:
                            c4242z.u(0);
                            int z6 = bVar.z();
                            YK F9 = F(w6);
                            if (F9 != null && !F9.a(z6)) {
                                obj2 = EL.f(B9, z6, obj, obj2);
                            }
                            PL.g(k9 & 1048575, obj, Integer.valueOf(z6));
                            v(B9, w6, obj);
                            continue;
                            break;
                        case 64:
                            c4242z.u(5);
                            PL.g(k9 & 1048575, obj, Integer.valueOf(bVar.A()));
                            v(B9, w6, obj);
                            continue;
                        case j.v.f12576G /* 65 */:
                            c4242z.u(1);
                            PL.g(k9 & 1048575, obj, Long.valueOf(bVar.B()));
                            v(B9, w6, obj);
                            continue;
                        case 66:
                            c4242z.u(0);
                            PL.g(k9 & 1048575, obj, Integer.valueOf(bVar.C()));
                            v(B9, w6, obj);
                            continue;
                        case j.v.f12582d /* 67 */:
                            c4242z.u(0);
                            PL.g(k9 & 1048575, obj, Long.valueOf(bVar.D()));
                            v(B9, w6, obj);
                            continue;
                        case 68:
                            AbstractC4263zK abstractC4263zK4 = (AbstractC4263zK) I(B9, w6, obj);
                            DL D11 = D(w6);
                            c4242z.u(3);
                            c4242z.w(abstractC4263zK4, D11, pk);
                            J(B9, w6, obj, abstractC4263zK4);
                            continue;
                        default:
                            if (obj2 == null) {
                                obj2 = V2.A(obj);
                            }
                            v22.getClass();
                            if (!V2.y(0, c4242z, obj2)) {
                                while (i6 < i) {
                                    obj2 = K(iArr[i6], obj, obj2, obj);
                                    i6++;
                                }
                                break;
                            }
                    }
                } else if (B9 == Integer.MAX_VALUE) {
                    while (i6 < i) {
                        obj2 = K(iArr[i6], obj, obj2, obj);
                        i6++;
                    }
                } else {
                    if (obj2 == null) {
                        obj2 = V2.A(obj);
                    }
                    v22.getClass();
                    if (!V2.y(0, c4242z, obj2)) {
                        while (i6 < i) {
                            obj2 = K(iArr[i6], obj, obj2, obj);
                            i6++;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i6 < i) {
                    obj2 = K(iArr[i6], obj, obj2, obj);
                    i6++;
                }
                if (obj2 != null) {
                    ((VK) obj).zzt = (LL) obj2;
                }
                throw th;
            }
        }
        if (obj2 != null) {
            ((VK) obj).zzt = (LL) obj2;
        }
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final VK c() {
        return ((VK) this.f33567e).p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.DL
    public final void d(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f33563a;
            if (i >= iArr.length) {
                EL.d(obj, obj2);
                return;
            }
            int k9 = k(i);
            int i6 = 1048575 & k9;
            int l9 = l(k9);
            int i9 = iArr[i];
            long j6 = i6;
            switch (l9) {
                case 0:
                    if (s(i, obj2)) {
                        OK ok = PL.f26761c;
                        obj3 = obj;
                        ok.r1(obj3, j6, ok.o1(j6, obj2));
                        t(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (s(i, obj2)) {
                        OK ok2 = PL.f26761c;
                        ok2.n1(obj, j6, ok2.a0(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i, obj2)) {
                        PL.e(obj, j6, PL.d(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i, obj2)) {
                        PL.e(obj, j6, PL.d(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i, obj2)) {
                        PL.c(PL.b(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i, obj2)) {
                        PL.e(obj, j6, PL.d(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i, obj2)) {
                        PL.c(PL.b(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i, obj2)) {
                        OK ok3 = PL.f26761c;
                        ok3.Z(obj, j6, ok3.W(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i, obj2)) {
                        PL.g(j6, obj, PL.f(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    B(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i, obj2)) {
                        PL.g(j6, obj, PL.f(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (s(i, obj2)) {
                        PL.c(PL.b(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i, obj2)) {
                        PL.c(PL.b(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i, obj2)) {
                        PL.c(PL.b(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i, obj2)) {
                        PL.e(obj, j6, PL.d(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i, obj2)) {
                        PL.c(PL.b(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i, obj2)) {
                        PL.e(obj, j6, PL.d(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    B(i, obj, obj2);
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
                case com.anythink.basead.b.b.j.f5806M /* 38 */:
                case 39:
                case com.anythink.basead.b.b.j.f5808O /* 40 */:
                case 41:
                case 42:
                case com.anythink.basead.b.b.j.f5811R /* 43 */:
                case com.anythink.basead.b.b.j.f5812S /* 44 */:
                case com.anythink.basead.b.b.j.f5813T /* 45 */:
                case 46:
                case 47:
                case com.anythink.basead.b.b.j.f5816W /* 48 */:
                case com.anythink.basead.b.b.j.f5817X /* 49 */:
                    InterfaceC3026cL interfaceC3026cL = (InterfaceC3026cL) PL.f(j6, obj);
                    InterfaceC3026cL interfaceC3026cL2 = (InterfaceC3026cL) PL.f(j6, obj2);
                    int size = interfaceC3026cL.size();
                    int size2 = interfaceC3026cL2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AK) interfaceC3026cL).f23663n) {
                            interfaceC3026cL = interfaceC3026cL.D(size2 + size);
                        }
                        interfaceC3026cL.addAll(interfaceC3026cL2);
                    }
                    if (size > 0) {
                        interfaceC3026cL2 = interfaceC3026cL;
                    }
                    PL.g(j6, obj, interfaceC3026cL2);
                    obj3 = obj;
                    break;
                case 50:
                    V2 v22 = EL.f24582a;
                    PL.g(j6, obj, XJ.g(PL.f(j6, obj), PL.f(j6, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                case 54:
                case 55:
                case p.a.f19679e /* 56 */:
                case 57:
                case 58:
                case j.v.f12591n /* 59 */:
                    if (u(i9, i, obj2)) {
                        PL.g(j6, obj, PL.f(j6, obj2));
                        v(i9, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    C(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case j.v.f12576G /* 65 */:
                case 66:
                case j.v.f12582d /* 67 */:
                    if (u(i9, i, obj2)) {
                        PL.g(j6, obj, PL.f(j6, obj2));
                        v(i9, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    C(i, obj, obj2);
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

    @Override // com.google.android.gms.internal.ads.DL
    public final boolean e(Object obj) {
        int i;
        int i6;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i9 < this.f33570h) {
            int i12 = this.f33569g[i9];
            int k9 = k(i12);
            int[] iArr = this.f33563a;
            int i13 = iArr[i12 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i11) {
                if (i14 != 1048575) {
                    i10 = f33562l.getInt(obj, i14);
                }
                i6 = i10;
                i = i14;
            } else {
                i = i11;
                i6 = i10;
            }
            Object obj2 = obj;
            if ((268435456 & k9) == 0 || r(obj2, i12, i, i6, i15)) {
                int l9 = l(k9);
                if (l9 == 9 || l9 == 17) {
                    if (r(obj2, i12, i, i6, i15) && !D(i12).e(PL.f(k9 & 1048575, obj2))) {
                    }
                    i9++;
                    obj = obj2;
                    i11 = i;
                    i10 = i6;
                } else {
                    if (l9 != 27) {
                        if (l9 == 60 || l9 == 68) {
                            if (u(iArr[i12], i12, obj2) && !D(i12).e(PL.f(k9 & 1048575, obj2))) {
                            }
                            i9++;
                            obj = obj2;
                            i11 = i;
                            i10 = i6;
                        } else if (l9 != 49) {
                            if (l9 != 50) {
                                continue;
                            } else {
                                C3617nL c3617nL = (C3617nL) PL.f(k9 & 1048575, obj2);
                                if (!c3617nL.isEmpty() && ((SL) ((C3563mL) E(i12)).f31943a.f35361v).f27476n == TL.f27723B) {
                                    DL dl = null;
                                    for (Object obj3 : c3617nL.values()) {
                                        if (dl == null) {
                                            dl = C4156xL.f34990c.a(obj3.getClass());
                                        }
                                        if (!dl.e(obj3)) {
                                        }
                                    }
                                }
                            }
                            i9++;
                            obj = obj2;
                            i11 = i;
                            i10 = i6;
                        }
                    }
                    List list = (List) PL.f(k9 & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        DL D8 = D(i12);
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            if (D8.e(list.get(i16))) {
                            }
                        }
                    }
                    i9++;
                    obj = obj2;
                    i11 = i;
                    i10 = i6;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void f(Object obj, byte[] bArr, int i, int i6, CK ck) {
        y(obj, bArr, i, i6, 0, ck);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void g(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof VK) {
            VK vk = (VK) obj;
            vk.g(Integer.MAX_VALUE);
            vk.zzq = 0;
            vk.i();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f33563a;
            if (i >= iArr.length) {
                LL ll = ((VK) obj).zzt;
                if (ll.f26111e) {
                    ll.f26111e = false;
                    return;
                }
                return;
            }
            int k9 = k(i);
            int i6 = 1048575 & k9;
            int l9 = l(k9);
            long j6 = i6;
            if (l9 != 9) {
                if (l9 != 60 && l9 != 68) {
                    switch (l9) {
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
                        case com.anythink.basead.b.b.j.f5806M /* 38 */:
                        case 39:
                        case com.anythink.basead.b.b.j.f5808O /* 40 */:
                        case 41:
                        case 42:
                        case com.anythink.basead.b.b.j.f5811R /* 43 */:
                        case com.anythink.basead.b.b.j.f5812S /* 44 */:
                        case com.anythink.basead.b.b.j.f5813T /* 45 */:
                        case 46:
                        case 47:
                        case com.anythink.basead.b.b.j.f5816W /* 48 */:
                        case com.anythink.basead.b.b.j.f5817X /* 49 */:
                            AK ak = (AK) ((InterfaceC3026cL) PL.f(j6, obj));
                            if (!ak.f23663n) {
                                break;
                            } else {
                                ak.f23663n = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = f33562l;
                            Object object = unsafe.getObject(obj, j6);
                            if (object == null) {
                                break;
                            } else {
                                ((C3617nL) object).f32722n = false;
                                unsafe.putObject(obj, j6, object);
                                break;
                            }
                    }
                } else if (u(iArr[i], i, obj)) {
                    D(i).g(f33562l.getObject(obj, j6));
                }
                i += 3;
            }
            if (s(i, obj)) {
                D(i).g(f33562l.getObject(obj, j6));
            }
            i += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.DL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(VK vk, VK vk2) {
        boolean c9;
        int i = 0;
        while (true) {
            int[] iArr = this.f33563a;
            if (i < iArr.length) {
                int k9 = k(i);
                int l9 = l(k9);
                if (l9 <= 50 || l9 >= 69) {
                    long j6 = k9 & 1048575;
                    switch (l9) {
                        case 0:
                            if (!q(vk, vk2, i)) {
                                break;
                            } else {
                                OK ok = PL.f26761c;
                                if (Double.doubleToLongBits(ok.o1(j6, vk)) != Double.doubleToLongBits(ok.o1(j6, vk2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 1:
                            if (!q(vk, vk2, i)) {
                                break;
                            } else {
                                OK ok2 = PL.f26761c;
                                if (Float.floatToIntBits(ok2.a0(j6, vk)) != Float.floatToIntBits(ok2.a0(j6, vk2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 2:
                            if (q(vk, vk2, i) && PL.d(j6, vk) == PL.d(j6, vk2)) {
                                break;
                            }
                            break;
                        case 3:
                            if (q(vk, vk2, i) && PL.d(j6, vk) == PL.d(j6, vk2)) {
                                break;
                            }
                            break;
                        case 4:
                            if (q(vk, vk2, i) && PL.b(j6, vk) == PL.b(j6, vk2)) {
                                break;
                            }
                            break;
                        case 5:
                            if (q(vk, vk2, i) && PL.d(j6, vk) == PL.d(j6, vk2)) {
                                break;
                            }
                            break;
                        case 6:
                            if (q(vk, vk2, i) && PL.b(j6, vk) == PL.b(j6, vk2)) {
                                break;
                            }
                            break;
                        case 7:
                            if (!q(vk, vk2, i)) {
                                break;
                            } else {
                                OK ok3 = PL.f26761c;
                                if (ok3.W(j6, vk) != ok3.W(j6, vk2)) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 8:
                            if (q(vk, vk2, i) && EL.c(PL.f(j6, vk), PL.f(j6, vk2))) {
                                break;
                            }
                            break;
                        case 9:
                            if (q(vk, vk2, i) && EL.c(PL.f(j6, vk), PL.f(j6, vk2))) {
                                break;
                            }
                            break;
                        case 10:
                            if (q(vk, vk2, i) && EL.c(PL.f(j6, vk), PL.f(j6, vk2))) {
                                break;
                            }
                            break;
                        case 11:
                            if (q(vk, vk2, i) && PL.b(j6, vk) == PL.b(j6, vk2)) {
                                break;
                            }
                            break;
                        case 12:
                            if (q(vk, vk2, i) && PL.b(j6, vk) == PL.b(j6, vk2)) {
                                break;
                            }
                            break;
                        case 13:
                            if (q(vk, vk2, i) && PL.b(j6, vk) == PL.b(j6, vk2)) {
                                break;
                            }
                            break;
                        case 14:
                            if (q(vk, vk2, i) && PL.d(j6, vk) == PL.d(j6, vk2)) {
                                break;
                            }
                            break;
                        case 15:
                            if (q(vk, vk2, i) && PL.b(j6, vk) == PL.b(j6, vk2)) {
                                break;
                            }
                            break;
                        case 16:
                            if (q(vk, vk2, i) && PL.d(j6, vk) == PL.d(j6, vk2)) {
                                break;
                            }
                            break;
                        case 17:
                            if (q(vk, vk2, i) && EL.c(PL.f(j6, vk), PL.f(j6, vk2))) {
                                break;
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
                        case com.anythink.basead.b.b.j.f5806M /* 38 */:
                        case 39:
                        case com.anythink.basead.b.b.j.f5808O /* 40 */:
                        case 41:
                        case 42:
                        case com.anythink.basead.b.b.j.f5811R /* 43 */:
                        case com.anythink.basead.b.b.j.f5812S /* 44 */:
                        case com.anythink.basead.b.b.j.f5813T /* 45 */:
                        case 46:
                        case 47:
                        case com.anythink.basead.b.b.j.f5816W /* 48 */:
                        case com.anythink.basead.b.b.j.f5817X /* 49 */:
                            c9 = EL.c(PL.f(j6, vk), PL.f(j6, vk2));
                            if (!c9) {
                                break;
                            } else {
                                break;
                            }
                        case 50:
                            c9 = EL.c(PL.f(j6, vk), PL.f(j6, vk2));
                            if (!c9) {
                            }
                            break;
                        case 51:
                        case 52:
                        case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                        case 54:
                        case 55:
                        case p.a.f19679e /* 56 */:
                        case 57:
                        case 58:
                        case j.v.f12591n /* 59 */:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case j.v.f12576G /* 65 */:
                        case 66:
                        case j.v.f12582d /* 67 */:
                        case 68:
                            long j9 = iArr[i + 2] & 1048575;
                            if (PL.b(j9, vk) == PL.b(j9, vk2) && EL.c(PL.f(j6, vk), PL.f(j6, vk2))) {
                                break;
                            }
                            break;
                    }
                    return false;
                }
                i += 3;
            } else {
                int i6 = this.i;
                while (true) {
                    int[] iArr2 = this.f33569g;
                    if (i6 < iArr2.length) {
                        int i9 = iArr2[i6];
                        long j10 = iArr[i9 + 2] & 1048575;
                        if (PL.b(j10, vk) == PL.b(j10, vk2)) {
                            if (!u(0, i9, vk)) {
                                long k10 = k(i9) & 1048575;
                                if (!EL.c(PL.f(k10, vk), PL.f(k10, vk2))) {
                                }
                            }
                            i6++;
                        }
                    } else if (vk.zzt.equals(vk2.zzt)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b7  */
    @Override // com.google.android.gms.internal.ads.DL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(VK vk) {
        int i;
        int i6;
        int S8;
        int T8;
        int S9;
        int T9;
        int i9;
        int i10;
        int b9;
        int i11;
        int i12;
        int S10;
        int size;
        int v9;
        int S11;
        int S12;
        int S13;
        int i13;
        Iterator it;
        C3563mL c3563mL;
        int T10;
        int g4;
        int S14;
        int d2;
        int S15;
        SL sl;
        int T11;
        int g9;
        int S16;
        int length;
        int S17;
        int S18;
        int T12;
        C3832rL c3832rL = this;
        VK vk2 = vk;
        int i14 = 1;
        Unsafe unsafe = f33562l;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int[] iArr = c3832rL.f33563a;
            if (i17 >= iArr.length) {
                return vk2.zzt.c() + i19;
            }
            int k9 = c3832rL.k(i17);
            int l9 = l(k9);
            int i20 = iArr[i17];
            int i21 = iArr[i17 + 2];
            int i22 = i21 & i15;
            if (l9 <= 17) {
                if (i22 != i16) {
                    i18 = i22 == i15 ? 0 : unsafe.getInt(vk2, i22);
                    i16 = i22;
                }
                i = i14 << (i21 >>> 20);
            } else {
                i = 0;
            }
            int i23 = k9 & i15;
            if (l9 >= RK.f27192u.f27196n) {
                RK.f27193v.getClass();
            }
            long j6 = i23;
            int i24 = 8;
            int i25 = 4;
            switch (l9) {
                case 0:
                    i6 = 1;
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 8, i19);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 1:
                    i6 = 1;
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 4, i19);
                    }
                    vk2 = vk;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 2:
                    i6 = 1;
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        long j9 = unsafe.getLong(vk2, j6);
                        S8 = OK.S(i20 << 3);
                        T8 = OK.T(j9);
                        i19 += T8 + S8;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    } else {
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                case 3:
                    i6 = 1;
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        long j10 = unsafe.getLong(vk2, j6);
                        S8 = OK.S(i20 << 3);
                        T8 = OK.T(j10);
                        i19 += T8 + S8;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    } else {
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                case 4:
                    i6 = 1;
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        long j11 = unsafe.getInt(vk2, j6);
                        S8 = OK.S(i20 << 3);
                        T8 = OK.T(j11);
                        i19 += T8 + S8;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    } else {
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                case 5:
                    i6 = 1;
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 8, i19);
                    }
                    vk2 = vk;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 6:
                    i6 = 1;
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 4, i19);
                    }
                    vk2 = vk;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 7:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        i6 = 1;
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 1, i19);
                    } else {
                        i6 = 1;
                    }
                    vk2 = vk;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 8:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        int i26 = i20 << 3;
                        Object object = unsafe.getObject(vk2, j6);
                        if (object instanceof JK) {
                            int S19 = OK.S(i26);
                            int f3 = ((JK) object).f();
                            i19 = com.anythink.basead.exoplayer.f.f.x(f3, f3, S19, i19);
                        } else {
                            int S20 = OK.S(i26);
                            int i27 = RL.f27197a;
                            int g10 = QC.g((String) object);
                            i19 = com.anythink.basead.exoplayer.f.f.x(g10, g10, S20, i19);
                        }
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 9:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        Object object2 = unsafe.getObject(vk2, j6);
                        DL D8 = c3832rL.D(i17);
                        V2 v22 = EL.f24582a;
                        int S21 = OK.S(i20 << 3);
                        int d9 = ((AbstractC4263zK) object2).d(D8);
                        i19 = com.anythink.basead.exoplayer.f.f.x(d9, d9, S21, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 10:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        JK jk = (JK) unsafe.getObject(vk2, j6);
                        int S22 = OK.S(i20 << 3);
                        int f9 = jk.f();
                        i19 = com.anythink.basead.exoplayer.f.f.x(f9, f9, S22, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 11:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(unsafe.getInt(vk2, j6), OK.S(i20 << 3), i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 12:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        long j12 = unsafe.getInt(vk2, j6);
                        S9 = OK.S(i20 << 3);
                        T9 = OK.T(j12);
                        i9 = T9 + S9;
                        i19 += i9;
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 13:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 4, i19);
                    }
                    vk2 = vk;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 14:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 8, i19);
                    }
                    vk2 = vk;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 15:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        int i28 = unsafe.getInt(vk2, j6);
                        i19 = com.anythink.basead.exoplayer.f.f.f((i28 >> 31) ^ (i28 + i28), OK.S(i20 << 3), i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 16:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        long j13 = unsafe.getLong(vk2, j6);
                        S9 = OK.S(i20 << 3);
                        T9 = OK.T((j13 >> 63) ^ (j13 + j13));
                        i9 = T9 + S9;
                        i19 += i9;
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 17:
                    if (c3832rL.r(vk2, i17, i16, i18, i)) {
                        AbstractC4263zK abstractC4263zK = (AbstractC4263zK) unsafe.getObject(vk2, j6);
                        DL D9 = c3832rL.D(i17);
                        V2 v23 = EL.f24582a;
                        int S23 = OK.S(i20 << 3);
                        i9 = abstractC4263zK.d(D9) + S23 + S23;
                        i19 += i9;
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 18:
                    i10 = i16;
                    b9 = EL.b(i20, (List) unsafe.getObject(vk2, j6));
                    i19 += b9;
                    i16 = i10;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 19:
                    i10 = i16;
                    b9 = EL.a(i20, (List) unsafe.getObject(vk2, j6));
                    i19 += b9;
                    i16 = i10;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 20:
                    i11 = i16;
                    i12 = i18;
                    List list = (List) unsafe.getObject(vk2, j6);
                    V2 v24 = EL.f24582a;
                    if (list.size() != 0) {
                        S10 = (OK.S(i20 << 3) * list.size()) + EL.u(list);
                        i19 += S10;
                        i16 = i11;
                        i18 = i12;
                        i6 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                    S10 = 0;
                    i19 += S10;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 21:
                    i11 = i16;
                    i12 = i18;
                    List list2 = (List) unsafe.getObject(vk2, j6);
                    V2 v25 = EL.f24582a;
                    size = list2.size();
                    if (size != 0) {
                        v9 = EL.v(list2);
                        S11 = OK.S(i20 << 3);
                        S12 = (S11 * size) + v9;
                        i19 += S12;
                        i16 = i11;
                        i18 = i12;
                        i6 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                    S12 = 0;
                    i19 += S12;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 22:
                    i11 = i16;
                    i12 = i18;
                    List list3 = (List) unsafe.getObject(vk2, j6);
                    V2 v26 = EL.f24582a;
                    size = list3.size();
                    if (size != 0) {
                        v9 = EL.y(list3);
                        S11 = OK.S(i20 << 3);
                        S12 = (S11 * size) + v9;
                        i19 += S12;
                        i16 = i11;
                        i18 = i12;
                        i6 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                    S12 = 0;
                    i19 += S12;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 23:
                    i10 = i16;
                    b9 = EL.b(i20, (List) unsafe.getObject(vk2, j6));
                    i19 += b9;
                    i16 = i10;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 24:
                    i10 = i16;
                    b9 = EL.a(i20, (List) unsafe.getObject(vk2, j6));
                    i19 += b9;
                    i16 = i10;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 25:
                    i11 = i16;
                    i12 = i18;
                    List list4 = (List) unsafe.getObject(vk2, j6);
                    V2 v27 = EL.f24582a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        S10 = (OK.S(i20 << 3) + 1) * size2;
                        i19 += S10;
                        i16 = i11;
                        i18 = i12;
                        i6 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                    S10 = 0;
                    i19 += S10;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 26:
                    i11 = i16;
                    i12 = i18;
                    List list5 = (List) unsafe.getObject(vk2, j6);
                    V2 v28 = EL.f24582a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        S12 = OK.S(i20 << 3) * size3;
                        for (int i29 = 0; i29 < size3; i29++) {
                            Object obj = list5.get(i29);
                            if (obj instanceof JK) {
                                int f10 = ((JK) obj).f();
                                S12 = com.anythink.basead.exoplayer.f.f.f(f10, f10, S12);
                            } else {
                                int i30 = RL.f27197a;
                                int g11 = QC.g((String) obj);
                                S12 = com.anythink.basead.exoplayer.f.f.f(g11, g11, S12);
                            }
                        }
                        i19 += S12;
                        i16 = i11;
                        i18 = i12;
                        i6 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                    S12 = 0;
                    i19 += S12;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 27:
                    i11 = i16;
                    i12 = i18;
                    List list6 = (List) unsafe.getObject(vk2, j6);
                    DL D10 = c3832rL.D(i17);
                    V2 v29 = EL.f24582a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        S13 = 0;
                    } else {
                        S13 = OK.S(i20 << 3) * size4;
                        for (int i31 = 0; i31 < size4; i31++) {
                            int d10 = ((AbstractC4263zK) list6.get(i31)).d(D10);
                            S13 = com.anythink.basead.exoplayer.f.f.f(d10, d10, S13);
                        }
                    }
                    i19 += S13;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 28:
                    i11 = i16;
                    i12 = i18;
                    List list7 = (List) unsafe.getObject(vk2, j6);
                    V2 v210 = EL.f24582a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        S12 = OK.S(i20 << 3) * size5;
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int f11 = ((JK) list7.get(i32)).f();
                            S12 = com.anythink.basead.exoplayer.f.f.f(f11, f11, S12);
                        }
                        i19 += S12;
                        i16 = i11;
                        i18 = i12;
                        i6 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                    S12 = 0;
                    i19 += S12;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 29:
                    i11 = i16;
                    i12 = i18;
                    List list8 = (List) unsafe.getObject(vk2, j6);
                    V2 v211 = EL.f24582a;
                    size = list8.size();
                    if (size != 0) {
                        v9 = EL.z(list8);
                        S11 = OK.S(i20 << 3);
                        S12 = (S11 * size) + v9;
                        i19 += S12;
                        i16 = i11;
                        i18 = i12;
                        i6 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                    S12 = 0;
                    i19 += S12;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 30:
                    i11 = i16;
                    i12 = i18;
                    List list9 = (List) unsafe.getObject(vk2, j6);
                    V2 v212 = EL.f24582a;
                    size = list9.size();
                    if (size != 0) {
                        v9 = EL.x(list9);
                        S11 = OK.S(i20 << 3);
                        S12 = (S11 * size) + v9;
                        i19 += S12;
                        i16 = i11;
                        i18 = i12;
                        i6 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                    S12 = 0;
                    i19 += S12;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 31:
                    i10 = i16;
                    b9 = EL.a(i20, (List) unsafe.getObject(vk2, j6));
                    i19 += b9;
                    i16 = i10;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 32:
                    i10 = i16;
                    b9 = EL.b(i20, (List) unsafe.getObject(vk2, j6));
                    i19 += b9;
                    i16 = i10;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 33:
                    i11 = i16;
                    i12 = i18;
                    List list10 = (List) unsafe.getObject(vk2, j6);
                    V2 v213 = EL.f24582a;
                    size = list10.size();
                    if (size != 0) {
                        v9 = EL.A(list10);
                        S11 = OK.S(i20 << 3);
                        S12 = (S11 * size) + v9;
                        i19 += S12;
                        i16 = i11;
                        i18 = i12;
                        i6 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                    S12 = 0;
                    i19 += S12;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 34:
                    i11 = i16;
                    i12 = i18;
                    List list11 = (List) unsafe.getObject(vk2, j6);
                    V2 v214 = EL.f24582a;
                    size = list11.size();
                    if (size != 0) {
                        v9 = EL.w(list11);
                        S11 = OK.S(i20 << 3);
                        S12 = (S11 * size) + v9;
                        i19 += S12;
                        i16 = i11;
                        i18 = i12;
                        i6 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        c3832rL = this;
                        i14 = i6;
                    }
                    S12 = 0;
                    i19 += S12;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 35:
                    i11 = i16;
                    i12 = i18;
                    List list12 = (List) unsafe.getObject(vk2, j6);
                    V2 v215 = EL.f24582a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(size6, OK.S(i20 << 3), size6, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 36:
                    i11 = i16;
                    i12 = i18;
                    List list13 = (List) unsafe.getObject(vk2, j6);
                    V2 v216 = EL.f24582a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(size7, OK.S(i20 << 3), size7, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 37:
                    i11 = i16;
                    i12 = i18;
                    int u3 = EL.u((List) unsafe.getObject(vk2, j6));
                    if (u3 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(u3, OK.S(i20 << 3), u3, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case com.anythink.basead.b.b.j.f5806M /* 38 */:
                    i11 = i16;
                    i12 = i18;
                    int v10 = EL.v((List) unsafe.getObject(vk2, j6));
                    if (v10 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(v10, OK.S(i20 << 3), v10, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 39:
                    i11 = i16;
                    i12 = i18;
                    int y7 = EL.y((List) unsafe.getObject(vk2, j6));
                    if (y7 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(y7, OK.S(i20 << 3), y7, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case com.anythink.basead.b.b.j.f5808O /* 40 */:
                    i11 = i16;
                    i12 = i18;
                    List list14 = (List) unsafe.getObject(vk2, j6);
                    V2 v217 = EL.f24582a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(size8, OK.S(i20 << 3), size8, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 41:
                    i11 = i16;
                    i12 = i18;
                    List list15 = (List) unsafe.getObject(vk2, j6);
                    V2 v218 = EL.f24582a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(size9, OK.S(i20 << 3), size9, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 42:
                    i11 = i16;
                    i12 = i18;
                    List list16 = (List) unsafe.getObject(vk2, j6);
                    V2 v219 = EL.f24582a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(size10, OK.S(i20 << 3), size10, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case com.anythink.basead.b.b.j.f5811R /* 43 */:
                    i11 = i16;
                    i12 = i18;
                    int z3 = EL.z((List) unsafe.getObject(vk2, j6));
                    if (z3 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(z3, OK.S(i20 << 3), z3, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case com.anythink.basead.b.b.j.f5812S /* 44 */:
                    i11 = i16;
                    i12 = i18;
                    int x9 = EL.x((List) unsafe.getObject(vk2, j6));
                    if (x9 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(x9, OK.S(i20 << 3), x9, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case com.anythink.basead.b.b.j.f5813T /* 45 */:
                    i11 = i16;
                    i12 = i18;
                    List list17 = (List) unsafe.getObject(vk2, j6);
                    V2 v220 = EL.f24582a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(size11, OK.S(i20 << 3), size11, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 46:
                    i11 = i16;
                    i12 = i18;
                    List list18 = (List) unsafe.getObject(vk2, j6);
                    V2 v221 = EL.f24582a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(size12, OK.S(i20 << 3), size12, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 47:
                    i11 = i16;
                    i12 = i18;
                    int A9 = EL.A((List) unsafe.getObject(vk2, j6));
                    if (A9 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(A9, OK.S(i20 << 3), A9, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case com.anythink.basead.b.b.j.f5816W /* 48 */:
                    i11 = i16;
                    i12 = i18;
                    int w6 = EL.w((List) unsafe.getObject(vk2, j6));
                    if (w6 > 0) {
                        i19 = com.anythink.basead.exoplayer.f.f.x(w6, OK.S(i20 << 3), w6, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case com.anythink.basead.b.b.j.f5817X /* 49 */:
                    i11 = i16;
                    i12 = i18;
                    List list19 = (List) unsafe.getObject(vk2, j6);
                    DL D11 = c3832rL.D(i17);
                    V2 v222 = EL.f24582a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        for (int i33 = 0; i33 < size13; i33++) {
                            AbstractC4263zK abstractC4263zK2 = (AbstractC4263zK) list19.get(i33);
                            int S24 = OK.S(i20 << 3);
                            i13 += abstractC4263zK2.d(D11) + S24 + S24;
                        }
                    }
                    i19 += i13;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 50:
                    C3617nL c3617nL = (C3617nL) unsafe.getObject(vk2, j6);
                    C3563mL c3563mL2 = (C3563mL) c3832rL.E(i17);
                    if (c3617nL.isEmpty()) {
                        i13 = 0;
                    } else {
                        Iterator it2 = c3617nL.entrySet().iterator();
                        i13 = 0;
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c3563mL2.getClass();
                            int S25 = OK.S(i20 << 3);
                            int i34 = i25;
                            C4274ze c4274ze = c3563mL2.f31943a;
                            int i35 = i24;
                            SL sl2 = (SL) c4274ze.f35360u;
                            int i36 = QK.f27020c;
                            int S26 = OK.S(i35);
                            int i37 = i16;
                            SL sl3 = SL.f27473w;
                            if (sl2 == sl3) {
                                S26 += S26;
                            }
                            TL tl = TL.f27725n;
                            int i38 = i18;
                            switch (sl2.ordinal()) {
                                case 0:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    ((Double) key).getClass();
                                    T10 = i35;
                                    int i39 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S27 = OK.S(16);
                                    if (sl == sl3) {
                                        S27 += S27;
                                    }
                                    switch (sl.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            T11 = i35;
                                            int i40 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i40, i40, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 1:
                                            ((Float) value).getClass();
                                            T11 = i34;
                                            int i402 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i402, i402, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 2:
                                            T11 = OK.T(((Long) value).longValue());
                                            int i4022 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i4022, i4022, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 3:
                                            T11 = OK.T(((Long) value).longValue());
                                            int i40222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i40222, i40222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 4:
                                            T11 = OK.T(((Integer) value).intValue());
                                            int i402222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i402222, i402222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 5:
                                            ((Long) value).getClass();
                                            T11 = i35;
                                            int i4022222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i4022222, i4022222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 6:
                                            ((Integer) value).getClass();
                                            T11 = i34;
                                            int i40222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i40222222, i40222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            T11 = 1;
                                            int i402222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i402222222, i402222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 8:
                                            if (value instanceof JK) {
                                                g9 = ((JK) value).f();
                                                S16 = OK.S(g9);
                                            } else {
                                                int i41 = RL.f27197a;
                                                g9 = QC.g((String) value);
                                                S16 = OK.S(g9);
                                            }
                                            T11 = g9 + S16;
                                            int i4022222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i4022222222, i4022222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 9:
                                            T11 = ((VK) ((AbstractC4263zK) value)).d(null);
                                            int i40222222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i40222222222, i40222222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 10:
                                            if (value instanceof AbstractC3187fL) {
                                                ((AbstractC3187fL) value).getClass();
                                                throw null;
                                            }
                                            g9 = ((VK) ((AbstractC4263zK) value)).d(null);
                                            S16 = OK.S(g9);
                                            T11 = g9 + S16;
                                            int i402222222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i402222222222, i402222222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 11:
                                            if (value instanceof JK) {
                                                length = ((JK) value).f();
                                                S17 = OK.S(length);
                                            } else {
                                                length = ((byte[]) value).length;
                                                S17 = OK.S(length);
                                            }
                                            T11 = length + S17;
                                            int i4022222222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i4022222222222, i4022222222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 12:
                                            T11 = OK.S(((Integer) value).intValue());
                                            int i40222222222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i40222222222222, i40222222222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 13:
                                            T11 = value instanceof XK ? OK.T(((XK) value).c()) : OK.T(((Integer) value).intValue());
                                            int i402222222222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i402222222222222, i402222222222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 14:
                                            ((Integer) value).getClass();
                                            T11 = i34;
                                            int i4022222222222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i4022222222222222, i4022222222222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 15:
                                            ((Long) value).getClass();
                                            T11 = i35;
                                            int i40222222222222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i40222222222222222, i40222222222222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            T11 = OK.S((intValue >> 31) ^ (intValue + intValue));
                                            int i402222222222222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i402222222222222222, i402222222222222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            T11 = OK.T((longValue >> 63) ^ (longValue + longValue));
                                            int i4022222222222222222 = T11 + S27 + i39;
                                            i13 = com.anythink.basead.exoplayer.f.f.x(i4022222222222222222, i4022222222222222222, S25, i13);
                                            i25 = i34;
                                            i24 = i35;
                                            i16 = i37;
                                            i18 = i38;
                                            c3563mL2 = c3563mL;
                                            it2 = it;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    ((Float) key).getClass();
                                    T10 = i34;
                                    int i392 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S272 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 2:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    T10 = OK.T(((Long) key).longValue());
                                    int i3922 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S2722 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 3:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    T10 = OK.T(((Long) key).longValue());
                                    int i39222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S27222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 4:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    T10 = OK.T(((Integer) key).intValue());
                                    int i392222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S272222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 5:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    ((Long) key).getClass();
                                    T10 = i35;
                                    int i3922222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S2722222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 6:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    ((Integer) key).getClass();
                                    T10 = i34;
                                    int i39222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S27222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 7:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    ((Boolean) key).getClass();
                                    T10 = 1;
                                    int i392222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S272222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 8:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    if (key instanceof JK) {
                                        g4 = ((JK) key).f();
                                        S14 = OK.S(g4);
                                    } else {
                                        int i42 = RL.f27197a;
                                        g4 = QC.g((String) key);
                                        S14 = OK.S(g4);
                                    }
                                    T10 = g4 + S14;
                                    int i3922222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S2722222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 9:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    d2 = ((VK) ((AbstractC4263zK) key)).d(null);
                                    T10 = d2;
                                    int i39222222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S27222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 10:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    if (key instanceof AbstractC3187fL) {
                                        ((AbstractC3187fL) key).getClass();
                                        throw null;
                                    }
                                    int d11 = ((VK) ((AbstractC4263zK) key)).d(null);
                                    d2 = d11 + OK.S(d11);
                                    T10 = d2;
                                    int i392222222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S272222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 11:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    if (key instanceof JK) {
                                        g4 = ((JK) key).f();
                                        S14 = OK.S(g4);
                                    } else {
                                        g4 = ((byte[]) key).length;
                                        S14 = OK.S(g4);
                                    }
                                    T10 = g4 + S14;
                                    int i3922222222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S2722222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 12:
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    T10 = OK.S(((Integer) key).intValue());
                                    int i39222222222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S27222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 13:
                                    if (key instanceof XK) {
                                        it = it2;
                                        c3563mL = c3563mL2;
                                        T10 = OK.T(((XK) key).c());
                                    } else {
                                        it = it2;
                                        c3563mL = c3563mL2;
                                        T10 = OK.T(((Integer) key).intValue());
                                    }
                                    int i392222222222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S272222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    T10 = i34;
                                    int i3922222222222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S2722222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    T10 = i35;
                                    int i39222222222222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S27222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    S15 = OK.S((intValue2 >> 31) ^ (intValue2 + intValue2));
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    T10 = S15;
                                    int i392222222222222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S272222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    S15 = OK.T((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    it = it2;
                                    c3563mL = c3563mL2;
                                    T10 = S15;
                                    int i3922222222222222222 = T10 + S26;
                                    sl = (SL) c4274ze.f35361v;
                                    int S2722222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i11 = i16;
                    i12 = i18;
                    i19 += i13;
                    i16 = i11;
                    i18 = i12;
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 51:
                    if (c3832rL.u(i20, i17, vk2)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 8, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 52:
                    if (c3832rL.u(i20, i17, vk2)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 4, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                    if (c3832rL.u(i20, i17, vk2)) {
                        long p9 = p(j6, vk2);
                        S18 = OK.S(i20 << 3);
                        T12 = OK.T(p9);
                        i19 += T12 + S18;
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 54:
                    if (c3832rL.u(i20, i17, vk2)) {
                        long p10 = p(j6, vk2);
                        S18 = OK.S(i20 << 3);
                        T12 = OK.T(p10);
                        i19 += T12 + S18;
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 55:
                    if (c3832rL.u(i20, i17, vk2)) {
                        long o6 = o(j6, vk2);
                        S18 = OK.S(i20 << 3);
                        T12 = OK.T(o6);
                        i19 += T12 + S18;
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case p.a.f19679e /* 56 */:
                    if (c3832rL.u(i20, i17, vk2)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 8, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 57:
                    if (c3832rL.u(i20, i17, vk2)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 4, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 58:
                    if (c3832rL.u(i20, i17, vk2)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 1, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case j.v.f12591n /* 59 */:
                    if (c3832rL.u(i20, i17, vk2)) {
                        int i43 = i20 << 3;
                        Object object3 = unsafe.getObject(vk2, j6);
                        if (object3 instanceof JK) {
                            int S28 = OK.S(i43);
                            int f12 = ((JK) object3).f();
                            i19 = com.anythink.basead.exoplayer.f.f.x(f12, f12, S28, i19);
                        } else {
                            int S29 = OK.S(i43);
                            int i44 = RL.f27197a;
                            int g12 = QC.g((String) object3);
                            i19 = com.anythink.basead.exoplayer.f.f.x(g12, g12, S29, i19);
                        }
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 60:
                    if (c3832rL.u(i20, i17, vk2)) {
                        Object object4 = unsafe.getObject(vk2, j6);
                        DL D12 = c3832rL.D(i17);
                        V2 v223 = EL.f24582a;
                        int S30 = OK.S(i20 << 3);
                        int d12 = ((AbstractC4263zK) object4).d(D12);
                        i19 = com.anythink.basead.exoplayer.f.f.x(d12, d12, S30, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 61:
                    if (c3832rL.u(i20, i17, vk2)) {
                        JK jk2 = (JK) unsafe.getObject(vk2, j6);
                        int S31 = OK.S(i20 << 3);
                        int f13 = jk2.f();
                        i19 = com.anythink.basead.exoplayer.f.f.x(f13, f13, S31, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 62:
                    if (c3832rL.u(i20, i17, vk2)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(o(j6, vk2), OK.S(i20 << 3), i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 63:
                    if (c3832rL.u(i20, i17, vk2)) {
                        long o9 = o(j6, vk2);
                        S18 = OK.S(i20 << 3);
                        T12 = OK.T(o9);
                        i19 += T12 + S18;
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 64:
                    if (c3832rL.u(i20, i17, vk2)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 4, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case j.v.f12576G /* 65 */:
                    if (c3832rL.u(i20, i17, vk2)) {
                        i19 = com.anythink.basead.exoplayer.f.f.f(i20 << 3, 8, i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 66:
                    if (c3832rL.u(i20, i17, vk2)) {
                        int o10 = o(j6, vk2);
                        i19 = com.anythink.basead.exoplayer.f.f.f((o10 >> 31) ^ (o10 + o10), OK.S(i20 << 3), i19);
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case j.v.f12582d /* 67 */:
                    if (c3832rL.u(i20, i17, vk2)) {
                        long p11 = p(j6, vk2);
                        S18 = OK.S(i20 << 3);
                        T12 = OK.T((p11 >> 63) ^ (p11 + p11));
                        i19 += T12 + S18;
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                case 68:
                    if (c3832rL.u(i20, i17, vk2)) {
                        AbstractC4263zK abstractC4263zK3 = (AbstractC4263zK) unsafe.getObject(vk2, j6);
                        DL D13 = c3832rL.D(i17);
                        V2 v224 = EL.f24582a;
                        int S32 = OK.S(i20 << 3);
                        i19 += abstractC4263zK3.d(D13) + S32 + S32;
                    }
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
                default:
                    i6 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    c3832rL = this;
                    i14 = i6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final int j(VK vk) {
        int i;
        long doubleToLongBits;
        int i6;
        int floatToIntBits;
        int i9;
        int i10;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f33563a.length; i12 += 3) {
            int k9 = k(i12);
            int l9 = l(k9);
            if (l9 <= 50 || l9 >= 69) {
                long j6 = k9 & 1048575;
                int i13 = 37;
                switch (l9) {
                    case 0:
                        i = i11 * 53;
                        doubleToLongBits = Double.doubleToLongBits(PL.f26761c.o1(j6, vk));
                        byte[] bArr = AbstractC3080dL.f29746a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 1:
                        i6 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(PL.f26761c.a0(j6, vk));
                        i11 = i6 + floatToIntBits;
                        break;
                    case 2:
                        i = i11 * 53;
                        doubleToLongBits = PL.d(j6, vk);
                        byte[] bArr2 = AbstractC3080dL.f29746a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 3:
                        i = i11 * 53;
                        doubleToLongBits = PL.d(j6, vk);
                        byte[] bArr3 = AbstractC3080dL.f29746a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 4:
                        i6 = i11 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i11 = i6 + floatToIntBits;
                        break;
                    case 5:
                        i = i11 * 53;
                        doubleToLongBits = PL.d(j6, vk);
                        byte[] bArr4 = AbstractC3080dL.f29746a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 6:
                        i6 = i11 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i11 = i6 + floatToIntBits;
                        break;
                    case 7:
                        i = i11 * 53;
                        boolean W8 = PL.f26761c.W(j6, vk);
                        byte[] bArr5 = AbstractC3080dL.f29746a;
                        i9 = W8 ? 1231 : 1237;
                        i11 = i + i9;
                        break;
                    case 8:
                        i6 = i11 * 53;
                        floatToIntBits = ((String) PL.f(j6, vk)).hashCode();
                        i11 = i6 + floatToIntBits;
                        break;
                    case 9:
                        i10 = i11 * 53;
                        Object f3 = PL.f(j6, vk);
                        if (f3 != null) {
                            i13 = f3.hashCode();
                        }
                        i11 = i10 + i13;
                        break;
                    case 10:
                        i6 = i11 * 53;
                        floatToIntBits = PL.f(j6, vk).hashCode();
                        i11 = i6 + floatToIntBits;
                        break;
                    case 11:
                        i6 = i11 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i11 = i6 + floatToIntBits;
                        break;
                    case 12:
                        i6 = i11 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i11 = i6 + floatToIntBits;
                        break;
                    case 13:
                        i6 = i11 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i11 = i6 + floatToIntBits;
                        break;
                    case 14:
                        i = i11 * 53;
                        doubleToLongBits = PL.d(j6, vk);
                        byte[] bArr6 = AbstractC3080dL.f29746a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 15:
                        i6 = i11 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i11 = i6 + floatToIntBits;
                        break;
                    case 16:
                        i = i11 * 53;
                        doubleToLongBits = PL.d(j6, vk);
                        byte[] bArr7 = AbstractC3080dL.f29746a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 17:
                        i10 = i11 * 53;
                        Object f9 = PL.f(j6, vk);
                        if (f9 != null) {
                            i13 = f9.hashCode();
                        }
                        i11 = i10 + i13;
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
                    case com.anythink.basead.b.b.j.f5806M /* 38 */:
                    case 39:
                    case com.anythink.basead.b.b.j.f5808O /* 40 */:
                    case 41:
                    case 42:
                    case com.anythink.basead.b.b.j.f5811R /* 43 */:
                    case com.anythink.basead.b.b.j.f5812S /* 44 */:
                    case com.anythink.basead.b.b.j.f5813T /* 45 */:
                    case 46:
                    case 47:
                    case com.anythink.basead.b.b.j.f5816W /* 48 */:
                    case com.anythink.basead.b.b.j.f5817X /* 49 */:
                        i6 = i11 * 53;
                        floatToIntBits = PL.f(j6, vk).hashCode();
                        i11 = i6 + floatToIntBits;
                        break;
                    case 50:
                        i6 = i11 * 53;
                        floatToIntBits = PL.f(j6, vk).hashCode();
                        i11 = i6 + floatToIntBits;
                        break;
                }
            }
        }
        int i14 = this.i;
        while (true) {
            int[] iArr = this.f33569g;
            if (i14 >= iArr.length) {
                return vk.zzt.hashCode() + (i11 * 53);
            }
            if (!u(0, iArr[i14], vk)) {
                i11 = PL.f(k(r3) & 1048575, vk).hashCode() + (i11 * 53);
            }
            i14++;
        }
    }

    public final int k(int i) {
        return this.f33563a[i + 1];
    }

    public final boolean q(VK vk, VK vk2, int i) {
        return s(i, vk) == s(i, vk2);
    }

    public final boolean r(Object obj, int i, int i6, int i9, int i10) {
        return i6 == 1048575 ? s(i, obj) : (i9 & i10) != 0;
    }

    public final boolean s(int i, Object obj) {
        int i6 = this.f33563a[i + 2];
        long j6 = i6 & 1048575;
        if (j6 == 1048575) {
            int k9 = k(i);
            long j9 = k9 & 1048575;
            switch (l(k9)) {
                case 0:
                    if (Double.doubleToRawLongBits(PL.f26761c.o1(j9, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(PL.f26761c.a0(j9, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (PL.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (PL.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (PL.b(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (PL.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (PL.b(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return PL.f26761c.W(j9, obj);
                case 8:
                    Object f3 = PL.f(j9, obj);
                    if (f3 instanceof String) {
                        if (((String) f3).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(f3 instanceof JK)) {
                            throw new IllegalArgumentException();
                        }
                        if (JK.f25675u.equals(f3)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (PL.f(j9, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (JK.f25675u.equals(PL.f(j9, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (PL.b(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (PL.b(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (PL.b(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (PL.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (PL.b(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (PL.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (PL.f(j9, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i6 >>> 20)) & PL.b(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void t(int i, Object obj) {
        int i6 = this.f33563a[i + 2];
        long j6 = 1048575 & i6;
        if (j6 == 1048575) {
            return;
        }
        PL.c((1 << (i6 >>> 20)) | PL.b(j6, obj), j6, obj);
    }

    public final boolean u(int i, int i6, Object obj) {
        return PL.b((long) (this.f33563a[i6 + 2] & 1048575), obj) == i;
    }

    public final void v(int i, int i6, Object obj) {
        PL.c(i, this.f33563a[i6 + 2] & 1048575, obj);
    }

    public final int w(int i, int i6) {
        int[] iArr = this.f33563a;
        int length = (iArr.length / 3) - 1;
        while (i6 <= length) {
            int i9 = (length + i6) >>> 1;
            int i10 = i9 * 3;
            int i11 = iArr[i10];
            if (i == i11) {
                return i10;
            }
            if (i < i11) {
                length = i9 - 1;
            } else {
                i6 = i9 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int y(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.ads.CK r42) {
        /*
            Method dump skipped, instructions count: 3892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3832rL.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.CK):int");
    }
}
