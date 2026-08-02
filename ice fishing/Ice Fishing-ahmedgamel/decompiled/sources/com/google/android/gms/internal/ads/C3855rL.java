package com.google.android.gms.internal.ads;

import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.p;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.rL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3855rL implements DL {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f34329k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f34330l = PL.h();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f34331a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f34332b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34333c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34334d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC4286zK f34335e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34336f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f34337g;

    /* renamed from: h, reason: collision with root package name */
    public final int f34338h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final V2 f34339j;

    public C3855rL(int[] iArr, Object[] objArr, int i, int i4, AbstractC4286zK abstractC4286zK, int[] iArr2, int i6, int i9, V2 v22, XJ xj) {
        this.f34331a = iArr;
        this.f34332b = objArr;
        this.f34333c = i;
        this.f34334d = i4;
        this.f34336f = abstractC4286zK instanceof VK;
        this.f34337g = iArr2;
        this.f34338h = i6;
        this.i = i9;
        this.f34339j = v22;
        this.f34335e = abstractC4286zK;
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
            AbstractC5128c.h(sb, "Field ", str, " for ", name);
            throw new RuntimeException(Wv.i(sb, " not found. Known fields are ", arrays), e9);
        }
    }

    public static int l(int i) {
        return (i >>> 20) & com.anythink.basead.exoplayer.k.p.f9259b;
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

    public static final int x(byte[] bArr, int i, int i4, SL sl, Class cls, CK ck) {
        SL sl2 = SL.f28185v;
        switch (sl.ordinal()) {
            case 0:
                int i6 = i + 8;
                ck.f24863c = Double.valueOf(Double.longBitsToDouble(C2944aN.r(i, bArr)));
                return i6;
            case 1:
                int i9 = i + 4;
                ck.f24863c = Float.valueOf(Float.intBitsToFloat(C2944aN.o(i, bArr)));
                return i9;
            case 2:
            case 3:
                int m9 = C2944aN.m(bArr, i, ck);
                ck.f24863c = Long.valueOf(ck.f24862b);
                return m9;
            case 4:
            case 12:
            case 13:
                int a9 = C2944aN.a(bArr, i, ck);
                ck.f24863c = Integer.valueOf(ck.f24861a);
                return a9;
            case 5:
            case 15:
                int i10 = i + 8;
                ck.f24863c = Long.valueOf(C2944aN.r(i, bArr));
                return i10;
            case 6:
            case 14:
                int i11 = i + 4;
                ck.f24863c = Integer.valueOf(C2944aN.o(i, bArr));
                return i11;
            case 7:
                int m10 = C2944aN.m(bArr, i, ck);
                ck.f24863c = Boolean.valueOf(ck.f24862b != 0);
                return m10;
            case 8:
                return C2944aN.s(bArr, i, ck);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                DL a10 = C4179xL.f35771c.a(cls);
                VK c9 = a10.c();
                int u6 = C2944aN.u(c9, a10, bArr, i, i4, ck);
                a10.g(c9);
                ck.f24863c = c9;
                return u6;
            case 11:
                return C2944aN.t(bArr, i, ck);
            case 16:
                int a11 = C2944aN.a(bArr, i, ck);
                ck.f24863c = Integer.valueOf(W7.b.h(ck.f24861a));
                return a11;
            case 17:
                int m11 = C2944aN.m(bArr, i, ck);
                ck.f24863c = Long.valueOf(W7.b.i(ck.f24862b));
                return m11;
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
    public static C3855rL z(C4287zL c4287zL, V2 v22, XJ xj) {
        int i;
        int charAt;
        int i4;
        int i6;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char charAt2;
        int i14;
        int i15;
        char charAt3;
        int i16;
        char charAt4;
        int i17;
        char charAt5;
        int i18;
        char charAt6;
        int i19;
        char charAt7;
        int i20;
        char charAt8;
        int i21;
        int i22;
        int i23;
        Object[] objArr;
        int i24;
        int i25;
        int i26;
        int objectFieldOffset;
        int i27;
        String str;
        char c9;
        int i28;
        int i29;
        int i30;
        Field A9;
        int i31;
        char charAt9;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field A10;
        Object obj2;
        Field A11;
        int i38;
        char charAt10;
        int i39;
        int i40;
        char charAt11;
        int i41;
        char charAt12;
        int i42;
        char charAt13;
        if (!(c4287zL instanceof C4287zL)) {
            c4287zL.getClass();
            throw new ClassCastException();
        }
        String str2 = c4287zL.f36099b;
        int length = str2.length();
        char c10 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i = i43 + 1;
                if (str2.charAt(i43) < 55296) {
                    break;
                }
                i43 = i;
            }
        } else {
            i = 1;
        }
        int i44 = i + 1;
        int charAt14 = str2.charAt(i);
        if (charAt14 >= 55296) {
            int i45 = charAt14 & 8191;
            int i46 = 13;
            while (true) {
                i42 = i44 + 1;
                charAt13 = str2.charAt(i44);
                if (charAt13 < 55296) {
                    break;
                }
                i45 |= (charAt13 & 8191) << i46;
                i46 += 13;
                i44 = i42;
            }
            charAt14 = i45 | (charAt13 << i46);
            i44 = i42;
        }
        if (charAt14 == 0) {
            i6 = 0;
            i11 = 0;
            charAt = 0;
            i4 = 0;
            i10 = 0;
            i12 = 0;
            iArr = f34329k;
            i9 = 0;
        } else {
            int i47 = i44 + 1;
            int charAt15 = str2.charAt(i44);
            if (charAt15 >= 55296) {
                int i48 = charAt15 & 8191;
                int i49 = 13;
                while (true) {
                    i20 = i47 + 1;
                    charAt8 = str2.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i20;
                }
                charAt15 = i48 | (charAt8 << i49);
                i47 = i20;
            }
            int i50 = i47 + 1;
            int charAt16 = str2.charAt(i47);
            if (charAt16 >= 55296) {
                int i51 = charAt16 & 8191;
                int i52 = 13;
                while (true) {
                    i19 = i50 + 1;
                    charAt7 = str2.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i19;
                }
                charAt16 = i51 | (charAt7 << i52);
                i50 = i19;
            }
            int i53 = i50 + 1;
            int charAt17 = str2.charAt(i50);
            if (charAt17 >= 55296) {
                int i54 = charAt17 & 8191;
                int i55 = 13;
                while (true) {
                    i18 = i53 + 1;
                    charAt6 = str2.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i18;
                }
                charAt17 = i54 | (charAt6 << i55);
                i53 = i18;
            }
            int i56 = i53 + 1;
            int charAt18 = str2.charAt(i53);
            if (charAt18 >= 55296) {
                int i57 = charAt18 & 8191;
                int i58 = 13;
                while (true) {
                    i17 = i56 + 1;
                    charAt5 = str2.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i17;
                }
                charAt18 = i57 | (charAt5 << i58);
                i56 = i17;
            }
            int i59 = i56 + 1;
            charAt = str2.charAt(i56);
            if (charAt >= 55296) {
                int i60 = charAt & 8191;
                int i61 = 13;
                while (true) {
                    i16 = i59 + 1;
                    charAt4 = str2.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i16;
                }
                charAt = i60 | (charAt4 << i61);
                i59 = i16;
            }
            int i62 = i59 + 1;
            int charAt19 = str2.charAt(i59);
            if (charAt19 >= 55296) {
                int i63 = charAt19 & 8191;
                int i64 = 13;
                while (true) {
                    i15 = i62 + 1;
                    charAt3 = str2.charAt(i62);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i15;
                }
                charAt19 = i63 | (charAt3 << i64);
                i62 = i15;
            }
            int i65 = i62 + 1;
            if (str2.charAt(i62) >= 55296) {
                while (true) {
                    i14 = i65 + 1;
                    if (str2.charAt(i65) < 55296) {
                        break;
                    }
                    i65 = i14;
                }
                i65 = i14;
            }
            int i66 = i65 + 1;
            int charAt20 = str2.charAt(i65);
            if (charAt20 >= 55296) {
                int i67 = charAt20 & 8191;
                int i68 = 13;
                while (true) {
                    i13 = i66 + 1;
                    charAt2 = str2.charAt(i66);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i67 |= (charAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i13;
                }
                charAt20 = i67 | (charAt2 << i68);
                i66 = i13;
            }
            int i69 = charAt15 + charAt15 + charAt16;
            int[] iArr2 = new int[charAt20 + charAt19 + charAt15];
            int i70 = charAt19;
            i4 = charAt17;
            i6 = i70;
            iArr = iArr2;
            i9 = charAt15;
            i44 = i66;
            i10 = charAt18;
            i11 = i69;
            i12 = charAt20;
        }
        Unsafe unsafe = f34330l;
        Class<?> cls = c4287zL.f36098a.getClass();
        int i71 = i12 + i6;
        int i72 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[i72];
        int i73 = i71;
        int i74 = i12;
        int i75 = 0;
        int i76 = 0;
        while (i44 < length) {
            int i77 = i44 + 1;
            int charAt21 = str2.charAt(i44);
            if (charAt21 >= c10) {
                int i78 = charAt21 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i41 = i79 + 1;
                    charAt12 = str2.charAt(i79);
                    if (charAt12 < c10) {
                        break;
                    }
                    i78 |= (charAt12 & 8191) << i80;
                    i80 += 13;
                    i79 = i41;
                }
                charAt21 = i78 | (charAt12 << i80);
                i21 = i41;
            } else {
                i21 = i77;
            }
            int i81 = i21 + 1;
            int charAt22 = str2.charAt(i21);
            if (charAt22 >= c10) {
                int i82 = charAt22 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i40 = i83 + 1;
                    charAt11 = str2.charAt(i83);
                    i22 = length;
                    if (charAt11 < 55296) {
                        break;
                    }
                    i82 |= (charAt11 & 8191) << i84;
                    i84 += 13;
                    i83 = i40;
                    length = i22;
                }
                charAt22 = i82 | (charAt11 << i84);
                i23 = i40;
            } else {
                i22 = length;
                i23 = i81;
            }
            if ((charAt22 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i85 = charAt22 & com.anythink.basead.exoplayer.k.p.f9259b;
            int i86 = charAt21;
            int i87 = charAt22 & 2048;
            Object[] objArr3 = c4287zL.f36100c;
            if (i85 >= 51) {
                int i88 = i23 + 1;
                int charAt23 = str2.charAt(i23);
                if (charAt23 >= 55296) {
                    int i89 = charAt23 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i38 = i90 + 1;
                        charAt10 = str2.charAt(i90);
                        i39 = i89;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i89 = i39 | ((charAt10 & 8191) << i91);
                        i91 += 13;
                        i90 = i38;
                    }
                    charAt23 = i39 | (charAt10 << i91);
                    i35 = i38;
                } else {
                    i35 = i88;
                }
                int i92 = charAt23;
                int i93 = i85 - 51;
                i28 = i35;
                if (i93 == 9 || i93 == 17) {
                    i36 = i11 + 1;
                    int i94 = i76 / 3;
                    objArr2[i94 + i94 + 1] = objArr3[i11];
                } else {
                    if (i93 == 12) {
                        if (c4287zL.a() == 1 || i87 != 0) {
                            i36 = i11 + 1;
                            int i95 = i76 / 3;
                            objArr2[i95 + i95 + 1] = objArr3[i11];
                        } else {
                            i37 = 0;
                            int i96 = i92 + i92;
                            obj = objArr3[i96];
                            int i97 = i37;
                            if (obj instanceof Field) {
                                A10 = (Field) obj;
                            } else {
                                A10 = A(cls, (String) obj);
                                objArr3[i96] = A10;
                                iArr[i73] = i76;
                                i73++;
                            }
                            int i98 = i9;
                            objArr = objArr2;
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(A10);
                            int i99 = i96 + 1;
                            obj2 = objArr3[i99];
                            if (obj2 instanceof Field) {
                                A11 = (Field) obj2;
                            } else {
                                A11 = A(cls, (String) obj2);
                                objArr3[i99] = A11;
                            }
                            i24 = i98;
                            i26 = i97;
                            str = str2;
                            i25 = i11;
                            i30 = 0;
                            c9 = 55296;
                            i27 = (int) unsafe.objectFieldOffset(A11);
                            i29 = objectFieldOffset2;
                        }
                    }
                    i37 = i87;
                    int i962 = i92 + i92;
                    obj = objArr3[i962];
                    int i972 = i37;
                    if (obj instanceof Field) {
                    }
                    int i982 = i9;
                    objArr = objArr2;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(A10);
                    int i992 = i962 + 1;
                    obj2 = objArr3[i992];
                    if (obj2 instanceof Field) {
                    }
                    i24 = i982;
                    i26 = i972;
                    str = str2;
                    i25 = i11;
                    i30 = 0;
                    c9 = 55296;
                    i27 = (int) unsafe.objectFieldOffset(A11);
                    i29 = objectFieldOffset22;
                }
                i11 = i36;
                i37 = i87;
                int i9622 = i92 + i92;
                obj = objArr3[i9622];
                int i9722 = i37;
                if (obj instanceof Field) {
                }
                int i9822 = i9;
                objArr = objArr2;
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(A10);
                int i9922 = i9622 + 1;
                obj2 = objArr3[i9922];
                if (obj2 instanceof Field) {
                }
                i24 = i9822;
                i26 = i9722;
                str = str2;
                i25 = i11;
                i30 = 0;
                c9 = 55296;
                i27 = (int) unsafe.objectFieldOffset(A11);
                i29 = objectFieldOffset222;
            } else {
                int i100 = i9;
                objArr = objArr2;
                int i101 = i11 + 1;
                Field A12 = A(cls, (String) objArr3[i11]);
                i24 = i100;
                if (i85 == 9 || i85 == 17) {
                    i25 = i101;
                    int i102 = i76 / 3;
                    objArr[i102 + i102 + 1] = A12.getType();
                } else {
                    if (i85 == 27) {
                        i32 = i101;
                        i33 = 1;
                        i34 = i11 + 2;
                    } else if (i85 == 49) {
                        i34 = i11 + 2;
                        i32 = i101;
                        i33 = 1;
                    } else {
                        if (i85 == 12 || i85 == 30 || i85 == 44) {
                            i25 = i101;
                            if (c4287zL.a() == 1 || i87 != 0) {
                                i34 = i11 + 2;
                                int i103 = i76 / 3;
                                objArr[i103 + i103 + 1] = objArr3[i25];
                                i25 = i34;
                            }
                        } else if (i85 == 50) {
                            int i104 = i11 + 2;
                            int i105 = i74 + 1;
                            iArr[i74] = i76;
                            int i106 = i76 / 3;
                            int i107 = i106 + i106;
                            objArr[i107] = objArr3[i101];
                            if (i87 != 0) {
                                objArr[i107 + 1] = objArr3[i104];
                                i26 = i87;
                                i74 = i105;
                                i25 = i11 + 3;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(A12);
                                i27 = 1048575;
                                if ((charAt22 & 4096) != 0 || i85 > 17) {
                                    str = str2;
                                    c9 = 55296;
                                    i28 = i23;
                                    i29 = objectFieldOffset;
                                    i30 = 0;
                                } else {
                                    int i108 = i23 + 1;
                                    int charAt24 = str2.charAt(i23);
                                    if (charAt24 >= 55296) {
                                        int i109 = charAt24 & 8191;
                                        int i110 = 13;
                                        while (true) {
                                            i31 = i108 + 1;
                                            charAt9 = str2.charAt(i108);
                                            if (charAt9 < 55296) {
                                                break;
                                            }
                                            i109 |= (charAt9 & 8191) << i110;
                                            i110 += 13;
                                            i108 = i31;
                                        }
                                        charAt24 = i109 | (charAt9 << i110);
                                        i108 = i31;
                                    }
                                    int i111 = (charAt24 / 32) + i24 + i24;
                                    Object obj3 = objArr3[i111];
                                    str = str2;
                                    if (obj3 instanceof Field) {
                                        A9 = (Field) obj3;
                                    } else {
                                        A9 = A(cls, (String) obj3);
                                        objArr3[i111] = A9;
                                    }
                                    i30 = charAt24 % 32;
                                    i27 = (int) unsafe.objectFieldOffset(A9);
                                    i29 = objectFieldOffset;
                                    i28 = i108;
                                    c9 = 55296;
                                }
                            } else {
                                i74 = i105;
                                i25 = i104;
                            }
                        } else {
                            i25 = i101;
                        }
                        i26 = 0;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(A12);
                        i27 = 1048575;
                        if ((charAt22 & 4096) != 0) {
                        }
                        str = str2;
                        c9 = 55296;
                        i28 = i23;
                        i29 = objectFieldOffset;
                        i30 = 0;
                    }
                    int i112 = i76 / 3;
                    objArr[i112 + i112 + i33] = objArr3[i32];
                    i25 = i34;
                }
                i26 = i87;
                objectFieldOffset = (int) unsafe.objectFieldOffset(A12);
                i27 = 1048575;
                if ((charAt22 & 4096) != 0) {
                }
                str = str2;
                c9 = 55296;
                i28 = i23;
                i29 = objectFieldOffset;
                i30 = 0;
            }
            int i113 = i76 + 1;
            iArr3[i76] = i86;
            int i114 = i76 + 2;
            int i115 = i30;
            iArr3[i113] = ((charAt22 & 512) != 0 ? 536870912 : 0) | ((charAt22 & 256) != 0 ? 268435456 : 0) | (i26 != 0 ? Integer.MIN_VALUE : 0) | (i85 << 20) | i29;
            i76 += 3;
            iArr3[i114] = (i115 << 20) | i27;
            c10 = c9;
            length = i22;
            i9 = i24;
            i11 = i25;
            str2 = str;
            i44 = i28;
            objArr2 = objArr;
        }
        return new C3855rL(iArr3, objArr2, i4, i10, c4287zL.f36098a, iArr, i12, i71, v22, xj);
    }

    public final void B(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            int k9 = k(i) & 1048575;
            Unsafe unsafe = f34330l;
            long j6 = k9;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i4 = this.f34331a[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(Wv.b(i4, 38) + obj3.length());
                sb.append("Source subfield ");
                sb.append(i4);
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
        int[] iArr = this.f34331a;
        int i4 = iArr[i];
        if (u(i4, i, obj2)) {
            int k9 = k(i) & 1048575;
            Unsafe unsafe = f34330l;
            long j6 = k9;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i6 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(Wv.b(i6, 38) + obj3.length());
                sb.append("Source subfield ");
                sb.append(i6);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            DL D8 = D(i);
            if (!u(i4, i, obj)) {
                if (m(object)) {
                    VK c9 = D8.c();
                    D8.d(c9, object);
                    unsafe.putObject(obj, j6, c9);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                v(i4, i, obj);
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
        int i4 = i / 3;
        int i6 = i4 + i4;
        Object[] objArr = this.f34332b;
        DL dl = (DL) objArr[i6];
        if (dl != null) {
            return dl;
        }
        DL a9 = C4179xL.f35771c.a((Class) objArr[i6 + 1]);
        objArr[i6] = a9;
        return a9;
    }

    public final Object E(int i) {
        int i4 = i / 3;
        return this.f34332b[i4 + i4];
    }

    public final YK F(int i) {
        int i4 = i / 3;
        return (YK) this.f34332b[i4 + i4 + 1];
    }

    public final Object G(int i, Object obj) {
        DL D8 = D(i);
        int k9 = k(i) & 1048575;
        if (!s(i, obj)) {
            return D8.c();
        }
        Object object = f34330l.getObject(obj, k9);
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
        f34330l.putObject(obj, k(i) & 1048575, obj2);
        t(i, obj);
    }

    public final Object I(int i, int i4, Object obj) {
        DL D8 = D(i4);
        if (!u(i, i4, obj)) {
            return D8.c();
        }
        Object object = f34330l.getObject(obj, k(i4) & 1048575);
        if (m(object)) {
            return object;
        }
        VK c9 = D8.c();
        if (object != null) {
            D8.d(c9, object);
        }
        return c9;
    }

    public final void J(int i, int i4, Object obj, Object obj2) {
        f34330l.putObject(obj, k(i4) & 1048575, obj2);
        v(i, i4, obj);
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
        int g9;
        int S8;
        SL sl;
        int T9;
        int g10;
        int S9;
        int i4 = this.f34331a[i];
        Object f2 = PL.f(k(i) & 1048575, obj);
        if (f2 == null || (F8 = F(i)) == null) {
            return obj2;
        }
        C4297ze c4297ze = ((C3586mL) E(i)).f32723a;
        Iterator it = ((C3640nL) f2).entrySet().iterator();
        Object obj4 = obj2;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!F8.a(((Integer) entry.getValue()).intValue())) {
                if (obj4 == null) {
                    obj4 = V2.A(obj3);
                }
                Object key = entry.getKey();
                Object value = entry.getValue();
                SL sl2 = (SL) c4297ze.f36133u;
                int i6 = QK.f27807c;
                int S10 = OK.S(8);
                SL sl3 = SL.f28186w;
                if (sl2 == sl3) {
                    S10 += S10;
                }
                TL tl = TL.f28508n;
                switch (sl2.ordinal()) {
                    case 0:
                        c9 = '?';
                        ((Double) key).getClass();
                        T8 = 8;
                        int i9 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S11 = OK.S(16);
                        if (sl == sl3) {
                            S11 += S11;
                        }
                        switch (sl.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                T9 = 8;
                                int i10 = T9 + S11 + i9;
                                HK hk = JK.f26428u;
                                byte[] bArr = new byte[i10];
                                MK mk = new MK(bArr, i10);
                                try {
                                    C3586mL.a(mk, c4297ze, entry.getKey(), entry.getValue());
                                    mk.k0();
                                    ((LL) obj4).d((i4 << 3) | 2, new HK(bArr));
                                    it.remove();
                                    break;
                                } catch (IOException e9) {
                                    throw new RuntimeException(e9);
                                }
                            case 1:
                                ((Float) value).getClass();
                                T9 = 4;
                                int i102 = T9 + S11 + i9;
                                HK hk2 = JK.f26428u;
                                byte[] bArr2 = new byte[i102];
                                MK mk2 = new MK(bArr2, i102);
                                C3586mL.a(mk2, c4297ze, entry.getKey(), entry.getValue());
                                mk2.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr2));
                                it.remove();
                                break;
                            case 2:
                                T9 = OK.T(((Long) value).longValue());
                                int i1022 = T9 + S11 + i9;
                                HK hk22 = JK.f26428u;
                                byte[] bArr22 = new byte[i1022];
                                MK mk22 = new MK(bArr22, i1022);
                                C3586mL.a(mk22, c4297ze, entry.getKey(), entry.getValue());
                                mk22.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr22));
                                it.remove();
                                break;
                            case 3:
                                T9 = OK.T(((Long) value).longValue());
                                int i10222 = T9 + S11 + i9;
                                HK hk222 = JK.f26428u;
                                byte[] bArr222 = new byte[i10222];
                                MK mk222 = new MK(bArr222, i10222);
                                C3586mL.a(mk222, c4297ze, entry.getKey(), entry.getValue());
                                mk222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr222));
                                it.remove();
                                break;
                            case 4:
                                T9 = OK.T(((Integer) value).intValue());
                                int i102222 = T9 + S11 + i9;
                                HK hk2222 = JK.f26428u;
                                byte[] bArr2222 = new byte[i102222];
                                MK mk2222 = new MK(bArr2222, i102222);
                                C3586mL.a(mk2222, c4297ze, entry.getKey(), entry.getValue());
                                mk2222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr2222));
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                T9 = 8;
                                int i1022222 = T9 + S11 + i9;
                                HK hk22222 = JK.f26428u;
                                byte[] bArr22222 = new byte[i1022222];
                                MK mk22222 = new MK(bArr22222, i1022222);
                                C3586mL.a(mk22222, c4297ze, entry.getKey(), entry.getValue());
                                mk22222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr22222));
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                T9 = 4;
                                int i10222222 = T9 + S11 + i9;
                                HK hk222222 = JK.f26428u;
                                byte[] bArr222222 = new byte[i10222222];
                                MK mk222222 = new MK(bArr222222, i10222222);
                                C3586mL.a(mk222222, c4297ze, entry.getKey(), entry.getValue());
                                mk222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr222222));
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                T9 = 1;
                                int i102222222 = T9 + S11 + i9;
                                HK hk2222222 = JK.f26428u;
                                byte[] bArr2222222 = new byte[i102222222];
                                MK mk2222222 = new MK(bArr2222222, i102222222);
                                C3586mL.a(mk2222222, c4297ze, entry.getKey(), entry.getValue());
                                mk2222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr2222222));
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof JK) {
                                    g10 = ((JK) value).f();
                                    S9 = OK.S(g10);
                                } else {
                                    int i11 = RL.f27953a;
                                    g10 = QC.g((String) value);
                                    S9 = OK.S(g10);
                                }
                                T9 = S9 + g10;
                                int i1022222222 = T9 + S11 + i9;
                                HK hk22222222 = JK.f26428u;
                                byte[] bArr22222222 = new byte[i1022222222];
                                MK mk22222222 = new MK(bArr22222222, i1022222222);
                                C3586mL.a(mk22222222, c4297ze, entry.getKey(), entry.getValue());
                                mk22222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr22222222));
                                it.remove();
                                break;
                            case 9:
                                T9 = ((VK) ((AbstractC4286zK) value)).d(null);
                                int i10222222222 = T9 + S11 + i9;
                                HK hk222222222 = JK.f26428u;
                                byte[] bArr222222222 = new byte[i10222222222];
                                MK mk222222222 = new MK(bArr222222222, i10222222222);
                                C3586mL.a(mk222222222, c4297ze, entry.getKey(), entry.getValue());
                                mk222222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr222222222));
                                it.remove();
                                break;
                            case 10:
                                if (!(value instanceof AbstractC3210fL)) {
                                    g10 = ((VK) ((AbstractC4286zK) value)).d(null);
                                    S9 = OK.S(g10);
                                    T9 = S9 + g10;
                                    int i102222222222 = T9 + S11 + i9;
                                    HK hk2222222222 = JK.f26428u;
                                    byte[] bArr2222222222 = new byte[i102222222222];
                                    MK mk2222222222 = new MK(bArr2222222222, i102222222222);
                                    C3586mL.a(mk2222222222, c4297ze, entry.getKey(), entry.getValue());
                                    mk2222222222.k0();
                                    ((LL) obj4).d((i4 << 3) | 2, new HK(bArr2222222222));
                                    it.remove();
                                    break;
                                } else {
                                    ((AbstractC3210fL) value).getClass();
                                    throw null;
                                }
                            case 11:
                                if (value instanceof JK) {
                                    g10 = ((JK) value).f();
                                    S9 = OK.S(g10);
                                } else {
                                    g10 = ((byte[]) value).length;
                                    S9 = OK.S(g10);
                                }
                                T9 = S9 + g10;
                                int i1022222222222 = T9 + S11 + i9;
                                HK hk22222222222 = JK.f26428u;
                                byte[] bArr22222222222 = new byte[i1022222222222];
                                MK mk22222222222 = new MK(bArr22222222222, i1022222222222);
                                C3586mL.a(mk22222222222, c4297ze, entry.getKey(), entry.getValue());
                                mk22222222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr22222222222));
                                it.remove();
                                break;
                            case 12:
                                T9 = OK.S(((Integer) value).intValue());
                                int i10222222222222 = T9 + S11 + i9;
                                HK hk222222222222 = JK.f26428u;
                                byte[] bArr222222222222 = new byte[i10222222222222];
                                MK mk222222222222 = new MK(bArr222222222222, i10222222222222);
                                C3586mL.a(mk222222222222, c4297ze, entry.getKey(), entry.getValue());
                                mk222222222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr222222222222));
                                it.remove();
                                break;
                            case 13:
                                T9 = value instanceof XK ? OK.T(((XK) value).c()) : OK.T(((Integer) value).intValue());
                                int i102222222222222 = T9 + S11 + i9;
                                HK hk2222222222222 = JK.f26428u;
                                byte[] bArr2222222222222 = new byte[i102222222222222];
                                MK mk2222222222222 = new MK(bArr2222222222222, i102222222222222);
                                C3586mL.a(mk2222222222222, c4297ze, entry.getKey(), entry.getValue());
                                mk2222222222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr2222222222222));
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                T9 = 4;
                                int i1022222222222222 = T9 + S11 + i9;
                                HK hk22222222222222 = JK.f26428u;
                                byte[] bArr22222222222222 = new byte[i1022222222222222];
                                MK mk22222222222222 = new MK(bArr22222222222222, i1022222222222222);
                                C3586mL.a(mk22222222222222, c4297ze, entry.getKey(), entry.getValue());
                                mk22222222222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr22222222222222));
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                T9 = 8;
                                int i10222222222222222 = T9 + S11 + i9;
                                HK hk222222222222222 = JK.f26428u;
                                byte[] bArr222222222222222 = new byte[i10222222222222222];
                                MK mk222222222222222 = new MK(bArr222222222222222, i10222222222222222);
                                C3586mL.a(mk222222222222222, c4297ze, entry.getKey(), entry.getValue());
                                mk222222222222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr222222222222222));
                                it.remove();
                                break;
                            case 16:
                                int intValue = ((Integer) value).intValue();
                                T9 = OK.S((intValue >> 31) ^ (intValue + intValue));
                                int i102222222222222222 = T9 + S11 + i9;
                                HK hk2222222222222222 = JK.f26428u;
                                byte[] bArr2222222222222222 = new byte[i102222222222222222];
                                MK mk2222222222222222 = new MK(bArr2222222222222222, i102222222222222222);
                                C3586mL.a(mk2222222222222222, c4297ze, entry.getKey(), entry.getValue());
                                mk2222222222222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr2222222222222222));
                                it.remove();
                                break;
                            case 17:
                                long longValue = ((Long) value).longValue();
                                T9 = OK.T((longValue >> c9) ^ (longValue + longValue));
                                int i1022222222222222222 = T9 + S11 + i9;
                                HK hk22222222222222222 = JK.f26428u;
                                byte[] bArr22222222222222222 = new byte[i1022222222222222222];
                                MK mk22222222222222222 = new MK(bArr22222222222222222, i1022222222222222222);
                                C3586mL.a(mk22222222222222222, c4297ze, entry.getKey(), entry.getValue());
                                mk22222222222222222.k0();
                                ((LL) obj4).d((i4 << 3) | 2, new HK(bArr22222222222222222));
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    case 1:
                        c9 = '?';
                        ((Float) key).getClass();
                        T8 = 4;
                        int i92 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S112 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 2:
                        c9 = '?';
                        T8 = OK.T(((Long) key).longValue());
                        int i922 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S1122 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 3:
                        c9 = '?';
                        T8 = OK.T(((Long) key).longValue());
                        int i9222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S11222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 4:
                        c9 = '?';
                        T8 = OK.T(((Integer) key).intValue());
                        int i92222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S112222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 5:
                        c9 = '?';
                        ((Long) key).getClass();
                        T8 = 8;
                        int i922222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S1122222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 6:
                        c9 = '?';
                        ((Integer) key).getClass();
                        T8 = 4;
                        int i9222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S11222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 7:
                        c9 = '?';
                        ((Boolean) key).getClass();
                        T8 = 1;
                        int i92222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S112222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 8:
                        c9 = '?';
                        if (key instanceof JK) {
                            g9 = ((JK) key).f();
                            S8 = OK.S(g9);
                        } else {
                            int i12 = RL.f27953a;
                            g9 = QC.g((String) key);
                            S8 = OK.S(g9);
                        }
                        T8 = g9 + S8;
                        int i922222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S1122222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 9:
                        c9 = '?';
                        T8 = ((VK) ((AbstractC4286zK) key)).d(null);
                        int i9222222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S11222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 10:
                        c9 = '?';
                        if (key instanceof AbstractC3210fL) {
                            ((AbstractC3210fL) key).getClass();
                            throw null;
                        }
                        g9 = ((VK) ((AbstractC4286zK) key)).d(null);
                        S8 = OK.S(g9);
                        T8 = g9 + S8;
                        int i92222222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S112222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 11:
                        c9 = '?';
                        if (key instanceof JK) {
                            g9 = ((JK) key).f();
                            S8 = OK.S(g9);
                        } else {
                            g9 = ((byte[]) key).length;
                            S8 = OK.S(g9);
                        }
                        T8 = g9 + S8;
                        int i922222222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S1122222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 12:
                        c9 = '?';
                        T8 = OK.S(((Integer) key).intValue());
                        int i9222222222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
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
                        int i92222222222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S112222222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 14:
                        ((Integer) key).getClass();
                        c9 = '?';
                        T8 = 4;
                        int i922222222222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S1122222222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 15:
                        ((Long) key).getClass();
                        c9 = '?';
                        T8 = 8;
                        int i9222222222222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S11222222222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 16:
                        int intValue2 = ((Integer) key).intValue();
                        T8 = OK.S((intValue2 >> 31) ^ (intValue2 + intValue2));
                        c9 = '?';
                        int i92222222222222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
                        int S112222222222222222 = OK.S(16);
                        if (sl == sl3) {
                        }
                        switch (sl.ordinal()) {
                        }
                    case 17:
                        long longValue2 = ((Long) key).longValue();
                        T8 = OK.T((longValue2 + longValue2) ^ (longValue2 >> 63));
                        c9 = '?';
                        int i922222222222222222 = T8 + S10;
                        sl = (SL) c4297ze.f36134v;
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

    public final void L(int i, C4265z c4265z, Object obj) {
        long j6 = i & 1048575;
        if ((536870912 & i) != 0) {
            c4265z.u(2);
            PL.g(j6, obj, ((W7.b) c4265z.f36044w).w());
        } else if (!this.f34336f) {
            PL.g(j6, obj, c4265z.D());
        } else {
            c4265z.u(2);
            PL.g(j6, obj, ((W7.b) c4265z.f36044w).v());
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
    public final void a(Object obj, C4201xq c4201xq) {
        int[] iArr;
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z6;
        int i15;
        int i16;
        Iterator it;
        int T8;
        int g9;
        int S8;
        int d9;
        int S9;
        SL sl;
        int T9;
        int g10;
        int S10;
        C3855rL c3855rL = this;
        int i17 = 3;
        int i18 = 2;
        Unsafe unsafe = f34330l;
        int i19 = 1048575;
        int i20 = 1048575;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            int[] iArr2 = c3855rL.f34331a;
            if (i21 >= iArr2.length) {
                ((VK) obj).zzt.b(c4201xq);
                return;
            }
            int k9 = c3855rL.k(i21);
            int l9 = l(k9);
            int i23 = iArr2[i21];
            if (l9 <= 17) {
                int i24 = iArr2[i21 + 2];
                int i25 = i24 & i19;
                if (i25 != i20) {
                    i22 = i25 == i19 ? 0 : unsafe.getInt(obj, i25);
                    i20 = i25;
                }
                iArr = iArr2;
                i = 1 << (i24 >>> 20);
            } else {
                iArr = iArr2;
                i = 0;
            }
            long j6 = k9 & i19;
            switch (l9) {
                case 0:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).t1(i23, Double.doubleToRawLongBits(PL.f27544c.o1(j6, obj)));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 1:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).p1(i23, Float.floatToRawIntBits(PL.f27544c.a0(j6, obj)));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 2:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).q1(i23, unsafe.getLong(obj, j6));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 3:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).q1(i23, unsafe.getLong(obj, j6));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 4:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).b0(i23, unsafe.getInt(obj, j6));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 5:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).t1(i23, unsafe.getLong(obj, j6));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 6:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).p1(i23, unsafe.getInt(obj, j6));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 7:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).v1(i23, PL.f27544c.W(j6, obj));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 8:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        Object object = unsafe.getObject(obj, j6);
                        if (object instanceof String) {
                            ((OK) c4201xq.f35841u).x1(i23, (String) object);
                        } else {
                            ((OK) c4201xq.f35841u).y1(i23, (JK) object);
                        }
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 9:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        c4201xq.h(i23, unsafe.getObject(obj, j6), c3855rL.D(i21));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 10:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).y1(i23, (JK) unsafe.getObject(obj, j6));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 11:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).e0(i23, unsafe.getInt(obj, j6));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 12:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).b0(i23, unsafe.getInt(obj, j6));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 13:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).p1(i23, unsafe.getInt(obj, j6));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 14:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        ((OK) c4201xq.f35841u).t1(i23, unsafe.getLong(obj, j6));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 15:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        int i26 = unsafe.getInt(obj, j6);
                        ((OK) c4201xq.f35841u).e0(i23, (i26 >> 31) ^ (i26 + i26));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 16:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        long j9 = unsafe.getLong(obj, j6);
                        ((OK) c4201xq.f35841u).q1(i23, (j9 >> 63) ^ (j9 + j9));
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 17:
                    if (c3855rL.r(obj, i21, i20, i22, i)) {
                        Object object2 = unsafe.getObject(obj, j6);
                        DL D8 = c3855rL.D(i21);
                        c4201xq.getClass();
                        OK ok = (OK) c4201xq.f35841u;
                        ok.Y(i23, 3);
                        D8.a((AbstractC4286zK) object2, c4201xq);
                        ok.Y(i23, 4);
                    }
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 18:
                    i4 = i20;
                    i6 = i22;
                    EL.g(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i4;
                    i22 = i6;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 19:
                    i4 = i20;
                    i6 = i22;
                    EL.h(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i4;
                    i22 = i6;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 20:
                    i4 = i20;
                    i6 = i22;
                    EL.i(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i4;
                    i22 = i6;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 21:
                    i4 = i20;
                    i6 = i22;
                    EL.j(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i4;
                    i22 = i6;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 22:
                    i4 = i20;
                    i6 = i22;
                    EL.n(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i4;
                    i22 = i6;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 23:
                    i4 = i20;
                    i6 = i22;
                    EL.l(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i4;
                    i22 = i6;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 24:
                    i4 = i20;
                    i6 = i22;
                    EL.q(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i4;
                    i22 = i6;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 25:
                    i4 = i20;
                    i6 = i22;
                    EL.t(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i4;
                    i22 = i6;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 26:
                    i9 = i20;
                    i10 = i22;
                    int i27 = iArr[i21];
                    List list = (List) unsafe.getObject(obj, j6);
                    V2 v22 = EL.f25343a;
                    if (list != null && !list.isEmpty()) {
                        c4201xq.getClass();
                        for (int i28 = 0; i28 < list.size(); i28++) {
                            ((OK) c4201xq.f35841u).x1(i27, (String) list.get(i28));
                        }
                    }
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                    break;
                case 27:
                    i11 = i20;
                    i12 = i22;
                    int i29 = iArr[i21];
                    List list2 = (List) unsafe.getObject(obj, j6);
                    DL D9 = c3855rL.D(i21);
                    V2 v23 = EL.f25343a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i30 = 0; i30 < list2.size(); i30++) {
                            c4201xq.h(i29, list2.get(i30), D9);
                        }
                    }
                    i20 = i11;
                    i22 = i12;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                    break;
                case 28:
                    i11 = i20;
                    i12 = i22;
                    int i31 = iArr[i21];
                    List list3 = (List) unsafe.getObject(obj, j6);
                    V2 v24 = EL.f25343a;
                    if (list3 != null && !list3.isEmpty()) {
                        c4201xq.getClass();
                        for (int i32 = 0; i32 < list3.size(); i32++) {
                            ((OK) c4201xq.f35841u).y1(i31, (JK) list3.get(i32));
                        }
                    }
                    i20 = i11;
                    i22 = i12;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                    break;
                case 29:
                    i13 = i20;
                    i14 = i22;
                    z6 = false;
                    EL.o(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i13;
                    i22 = i14;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 30:
                    i13 = i20;
                    i14 = i22;
                    z6 = false;
                    EL.s(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i13;
                    i22 = i14;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 31:
                    i13 = i20;
                    i14 = i22;
                    z6 = false;
                    EL.r(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i13;
                    i22 = i14;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 32:
                    i13 = i20;
                    i14 = i22;
                    z6 = false;
                    EL.m(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i13;
                    i22 = i14;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 33:
                    i13 = i20;
                    i14 = i22;
                    z6 = false;
                    EL.p(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i13;
                    i22 = i14;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 34:
                    i13 = i20;
                    i14 = i22;
                    z6 = false;
                    EL.k(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, false);
                    i20 = i13;
                    i22 = i14;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 35:
                    i9 = i20;
                    i10 = i22;
                    EL.g(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 36:
                    i9 = i20;
                    i10 = i22;
                    EL.h(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 37:
                    i9 = i20;
                    i10 = i22;
                    EL.i(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case com.anythink.basead.b.b.j.f6592M /* 38 */:
                    i9 = i20;
                    i10 = i22;
                    EL.j(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 39:
                    i9 = i20;
                    i10 = i22;
                    EL.n(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case com.anythink.basead.b.b.j.f6594O /* 40 */:
                    i9 = i20;
                    i10 = i22;
                    EL.l(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 41:
                    i9 = i20;
                    i10 = i22;
                    EL.q(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 42:
                    i9 = i20;
                    i10 = i22;
                    EL.t(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case com.anythink.basead.b.b.j.f6597R /* 43 */:
                    i9 = i20;
                    i10 = i22;
                    EL.o(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case com.anythink.basead.b.b.j.f6598S /* 44 */:
                    i9 = i20;
                    i10 = i22;
                    EL.s(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case com.anythink.basead.b.b.j.f6599T /* 45 */:
                    i9 = i20;
                    i10 = i22;
                    EL.r(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 46:
                    i9 = i20;
                    i10 = i22;
                    EL.m(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 47:
                    i9 = i20;
                    i10 = i22;
                    EL.p(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case com.anythink.basead.b.b.j.f6602W /* 48 */:
                    i9 = i20;
                    i10 = i22;
                    EL.k(iArr[i21], (List) unsafe.getObject(obj, j6), c4201xq, true);
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case com.anythink.basead.b.b.j.f6603X /* 49 */:
                    i9 = i20;
                    i10 = i22;
                    int i33 = iArr[i21];
                    List list4 = (List) unsafe.getObject(obj, j6);
                    DL D10 = c3855rL.D(i21);
                    V2 v25 = EL.f25343a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i34 = 0; i34 < list4.size(); i34++) {
                            Object obj2 = list4.get(i34);
                            c4201xq.getClass();
                            OK ok2 = (OK) c4201xq.f35841u;
                            ok2.Y(i33, 3);
                            D10.a((AbstractC4286zK) obj2, c4201xq);
                            ok2.Y(i33, 4);
                        }
                    }
                    i20 = i9;
                    i22 = i10;
                    i15 = 3;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j6);
                    if (object3 != null) {
                        C4297ze c4297ze = ((C3586mL) c3855rL.E(i21)).f32723a;
                        c4201xq.getClass();
                        Iterator it2 = ((C3640nL) object3).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            OK ok3 = (OK) c4201xq.f35841u;
                            ok3.Y(i23, i18);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            SL sl2 = (SL) c4297ze.f36133u;
                            int i35 = QK.f27807c;
                            int S11 = OK.S(8);
                            SL sl3 = SL.f28186w;
                            if (sl2 == sl3) {
                                S11 += S11;
                            }
                            TL tl = TL.f28508n;
                            int i36 = i20;
                            switch (sl2.ordinal()) {
                                case 0:
                                    i16 = i22;
                                    it = it2;
                                    ((Double) key).getClass();
                                    T8 = 8;
                                    int i37 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S12 = OK.S(16);
                                    if (sl == sl3) {
                                        S12 += S12;
                                    }
                                    switch (sl.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            T9 = 8;
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 1:
                                            ((Float) value).getClass();
                                            T9 = 4;
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 2:
                                            T9 = OK.T(((Long) value).longValue());
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 3:
                                            T9 = OK.T(((Long) value).longValue());
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 4:
                                            T9 = OK.T(((Integer) value).intValue());
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 5:
                                            ((Long) value).getClass();
                                            T9 = 8;
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 6:
                                            ((Integer) value).getClass();
                                            T9 = 4;
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            T9 = 1;
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 8:
                                            if (value instanceof JK) {
                                                g10 = ((JK) value).f();
                                                S10 = OK.S(g10);
                                            } else {
                                                int i38 = RL.f27953a;
                                                g10 = QC.g((String) value);
                                                S10 = OK.S(g10);
                                            }
                                            T9 = g10 + S10;
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 9:
                                            T9 = ((VK) ((AbstractC4286zK) value)).d(null);
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 10:
                                            if (value instanceof AbstractC3210fL) {
                                                ((AbstractC3210fL) value).getClass();
                                                throw null;
                                            }
                                            g10 = ((VK) ((AbstractC4286zK) value)).d(null);
                                            S10 = OK.S(g10);
                                            T9 = g10 + S10;
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 11:
                                            if (value instanceof JK) {
                                                g10 = ((JK) value).f();
                                                S10 = OK.S(g10);
                                            } else {
                                                g10 = ((byte[]) value).length;
                                                S10 = OK.S(g10);
                                            }
                                            T9 = g10 + S10;
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 12:
                                            T9 = OK.S(((Integer) value).intValue());
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 13:
                                            T9 = value instanceof XK ? OK.T(((XK) value).c()) : OK.T(((Integer) value).intValue());
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 14:
                                            ((Integer) value).getClass();
                                            T9 = 4;
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 15:
                                            ((Long) value).getClass();
                                            T9 = 8;
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            T9 = OK.S((intValue >> 31) ^ (intValue + intValue));
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            T9 = OK.T((longValue + longValue) ^ (longValue >> 63));
                                            ok3.J1(T9 + S12 + i37);
                                            C3586mL.a(ok3, c4297ze, entry.getKey(), entry.getValue());
                                            i20 = i36;
                                            i22 = i16;
                                            it2 = it;
                                            i17 = 3;
                                            i18 = 2;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    i16 = i22;
                                    it = it2;
                                    ((Float) key).getClass();
                                    T8 = 4;
                                    int i372 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S122 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 2:
                                    i16 = i22;
                                    it = it2;
                                    T8 = OK.T(((Long) key).longValue());
                                    int i3722 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S1222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 3:
                                    i16 = i22;
                                    it = it2;
                                    T8 = OK.T(((Long) key).longValue());
                                    int i37222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S12222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 4:
                                    i16 = i22;
                                    it = it2;
                                    T8 = OK.T(((Integer) key).intValue());
                                    int i372222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S122222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 5:
                                    i16 = i22;
                                    it = it2;
                                    ((Long) key).getClass();
                                    T8 = 8;
                                    int i3722222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S1222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 6:
                                    i16 = i22;
                                    it = it2;
                                    ((Integer) key).getClass();
                                    T8 = 4;
                                    int i37222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S12222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 7:
                                    i16 = i22;
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    T8 = 1;
                                    int i372222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S122222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 8:
                                    i16 = i22;
                                    it = it2;
                                    if (key instanceof JK) {
                                        g9 = ((JK) key).f();
                                        S8 = OK.S(g9);
                                    } else {
                                        int i39 = RL.f27953a;
                                        g9 = QC.g((String) key);
                                        S8 = OK.S(g9);
                                    }
                                    T8 = g9 + S8;
                                    int i3722222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S1222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 9:
                                    i16 = i22;
                                    it = it2;
                                    d9 = ((VK) ((AbstractC4286zK) key)).d(null);
                                    T8 = d9;
                                    int i37222222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S12222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 10:
                                    i16 = i22;
                                    it = it2;
                                    if (key instanceof AbstractC3210fL) {
                                        ((AbstractC3210fL) key).getClass();
                                        throw null;
                                    }
                                    int d10 = ((VK) ((AbstractC4286zK) key)).d(null);
                                    d9 = d10 + OK.S(d10);
                                    T8 = d9;
                                    int i372222222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S122222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 11:
                                    i16 = i22;
                                    it = it2;
                                    if (key instanceof JK) {
                                        g9 = ((JK) key).f();
                                        S8 = OK.S(g9);
                                    } else {
                                        g9 = ((byte[]) key).length;
                                        S8 = OK.S(g9);
                                    }
                                    T8 = g9 + S8;
                                    int i3722222222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S1222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 12:
                                    i16 = i22;
                                    it = it2;
                                    T8 = OK.S(((Integer) key).intValue());
                                    int i37222222222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S12222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 13:
                                    if (key instanceof XK) {
                                        i16 = i22;
                                        it = it2;
                                        T8 = OK.T(((XK) key).c());
                                    } else {
                                        i16 = i22;
                                        it = it2;
                                        T8 = OK.T(((Integer) key).intValue());
                                    }
                                    int i372222222222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S122222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    i16 = i22;
                                    it = it2;
                                    T8 = 4;
                                    int i3722222222222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S1222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    i16 = i22;
                                    it = it2;
                                    T8 = 8;
                                    int i37222222222222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S12222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    S9 = OK.S((intValue2 >> 31) ^ (intValue2 + intValue2));
                                    i16 = i22;
                                    it = it2;
                                    T8 = S9;
                                    int i372222222222222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
                                    int S122222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    S9 = OK.T((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    i16 = i22;
                                    it = it2;
                                    T8 = S9;
                                    int i3722222222222222222 = T8 + S11;
                                    sl = (SL) c4297ze.f36134v;
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
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 51:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).t1(i23, Double.doubleToRawLongBits(((Double) PL.f(j6, obj)).doubleValue()));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 52:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).p1(i23, Float.floatToRawIntBits(((Float) PL.f(j6, obj)).floatValue()));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).q1(i23, p(j6, obj));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 54:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).q1(i23, p(j6, obj));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 55:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).b0(i23, o(j6, obj));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case p.a.f20466e /* 56 */:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).t1(i23, p(j6, obj));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 57:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).p1(i23, o(j6, obj));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 58:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).v1(i23, ((Boolean) PL.f(j6, obj)).booleanValue());
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case j.v.f13377n /* 59 */:
                    if (c3855rL.u(i23, i21, obj)) {
                        Object object4 = unsafe.getObject(obj, j6);
                        if (object4 instanceof String) {
                            ((OK) c4201xq.f35841u).x1(i23, (String) object4);
                        } else {
                            ((OK) c4201xq.f35841u).y1(i23, (JK) object4);
                        }
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 60:
                    if (c3855rL.u(i23, i21, obj)) {
                        c4201xq.h(i23, unsafe.getObject(obj, j6), c3855rL.D(i21));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 61:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).y1(i23, (JK) unsafe.getObject(obj, j6));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 62:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).e0(i23, o(j6, obj));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 63:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).b0(i23, o(j6, obj));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 64:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).p1(i23, o(j6, obj));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case j.v.f13362G /* 65 */:
                    if (c3855rL.u(i23, i21, obj)) {
                        ((OK) c4201xq.f35841u).t1(i23, p(j6, obj));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 66:
                    if (c3855rL.u(i23, i21, obj)) {
                        int o4 = o(j6, obj);
                        ((OK) c4201xq.f35841u).e0(i23, (o4 >> 31) ^ (o4 + o4));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case j.v.f13368d /* 67 */:
                    if (c3855rL.u(i23, i21, obj)) {
                        long p9 = p(j6, obj);
                        ((OK) c4201xq.f35841u).q1(i23, (p9 >> 63) ^ (p9 + p9));
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                case 68:
                    if (c3855rL.u(i23, i21, obj)) {
                        Object object5 = unsafe.getObject(obj, j6);
                        DL D11 = c3855rL.D(i21);
                        c4201xq.getClass();
                        OK ok4 = (OK) c4201xq.f35841u;
                        ok4.Y(i23, i17);
                        D11.a((AbstractC4286zK) object5, c4201xq);
                        ok4.Y(i23, 4);
                    }
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
                default:
                    i15 = i17;
                    i21 += 3;
                    c3855rL = this;
                    i17 = i15;
                    i18 = 2;
                    i19 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void b(Object obj, C4265z c4265z, PK pk) {
        int l9;
        W7.b bVar;
        int[] iArr = this.f34337g;
        int i = this.i;
        int i4 = this.f34338h;
        pk.getClass();
        n(obj);
        Object obj2 = null;
        while (true) {
            try {
                int B3 = c4265z.B();
                int w3 = (B3 < this.f34333c || B3 > this.f34334d) ? -1 : w(B3, 0);
                V2 v22 = this.f34339j;
                if (w3 >= 0) {
                    int k9 = k(w3);
                    try {
                        l9 = l(k9);
                        bVar = (W7.b) c4265z.f36044w;
                    } catch (C3264gL unused) {
                        if (obj2 == null) {
                            obj2 = V2.A(obj);
                        }
                        v22.getClass();
                        if (!V2.y(0, c4265z, obj2)) {
                            while (i4 < i) {
                                obj2 = K(iArr[i4], obj, obj2, obj);
                                i4++;
                            }
                        }
                    }
                    switch (l9) {
                        case 0:
                            c4265z.u(1);
                            PL.f27544c.s1(obj, k9 & 1048575, bVar.n());
                            t(w3, obj);
                            continue;
                        case 1:
                            c4265z.u(5);
                            PL.f27544c.f0(obj, k9 & 1048575, bVar.o());
                            t(w3, obj);
                            continue;
                        case 2:
                            c4265z.u(0);
                            PL.e(obj, k9 & 1048575, bVar.q());
                            t(w3, obj);
                            continue;
                        case 3:
                            c4265z.u(0);
                            PL.e(obj, k9 & 1048575, bVar.p());
                            t(w3, obj);
                            continue;
                        case 4:
                            c4265z.u(0);
                            PL.c(bVar.r(), k9 & 1048575, obj);
                            t(w3, obj);
                            continue;
                        case 5:
                            c4265z.u(1);
                            PL.e(obj, k9 & 1048575, bVar.s());
                            t(w3, obj);
                            continue;
                        case 6:
                            c4265z.u(5);
                            PL.c(bVar.t(), k9 & 1048575, obj);
                            t(w3, obj);
                            continue;
                        case 7:
                            c4265z.u(0);
                            PL.f27544c.Z(obj, k9 & 1048575, bVar.u());
                            t(w3, obj);
                            continue;
                        case 8:
                            L(k9, c4265z, obj);
                            t(w3, obj);
                            continue;
                        case 9:
                            AbstractC4286zK abstractC4286zK = (AbstractC4286zK) G(w3, obj);
                            DL D8 = D(w3);
                            c4265z.u(2);
                            c4265z.v(abstractC4286zK, D8, pk);
                            H(w3, obj, abstractC4286zK);
                            continue;
                        case 10:
                            PL.g(k9 & 1048575, obj, c4265z.D());
                            t(w3, obj);
                            continue;
                        case 11:
                            c4265z.u(0);
                            PL.c(bVar.y(), k9 & 1048575, obj);
                            t(w3, obj);
                            continue;
                        case 12:
                            c4265z.u(0);
                            int z6 = bVar.z();
                            YK F8 = F(w3);
                            if (F8 != null && !F8.a(z6)) {
                                obj2 = EL.f(B3, z6, obj, obj2);
                            }
                            PL.c(z6, k9 & 1048575, obj);
                            t(w3, obj);
                            continue;
                            break;
                        case 13:
                            c4265z.u(5);
                            PL.c(bVar.A(), k9 & 1048575, obj);
                            t(w3, obj);
                            continue;
                        case 14:
                            c4265z.u(1);
                            PL.e(obj, k9 & 1048575, bVar.B());
                            t(w3, obj);
                            continue;
                        case 15:
                            c4265z.u(0);
                            PL.c(bVar.C(), k9 & 1048575, obj);
                            t(w3, obj);
                            continue;
                        case 16:
                            c4265z.u(0);
                            PL.e(obj, k9 & 1048575, bVar.D());
                            t(w3, obj);
                            continue;
                        case 17:
                            AbstractC4286zK abstractC4286zK2 = (AbstractC4286zK) G(w3, obj);
                            DL D9 = D(w3);
                            c4265z.u(3);
                            c4265z.w(abstractC4286zK2, D9, pk);
                            H(w3, obj, abstractC4286zK2);
                            continue;
                        case 18:
                            c4265z.E(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 19:
                            c4265z.F(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 20:
                            c4265z.a(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 21:
                            c4265z.G(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 22:
                            c4265z.b(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 23:
                            c4265z.d(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 24:
                            c4265z.e(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 25:
                            c4265z.f(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 26:
                            if ((536870912 & k9) != 0) {
                                c4265z.g(XJ.b(k9 & 1048575, obj), true);
                            } else {
                                c4265z.g(XJ.b(k9 & 1048575, obj), false);
                                continue;
                            }
                        case 27:
                            c4265z.h(XJ.b(k9 & 1048575, obj), D(w3), pk);
                            continue;
                        case 28:
                            c4265z.j(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 29:
                            c4265z.k(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 30:
                            InterfaceC3049cL b9 = XJ.b(k9 & 1048575, obj);
                            c4265z.l(b9);
                            obj2 = EL.e(obj, B3, b9, F(w3), obj2);
                            continue;
                        case 31:
                            c4265z.m(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 32:
                            c4265z.n(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 33:
                            c4265z.r(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 34:
                            c4265z.s(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 35:
                            c4265z.E(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 36:
                            c4265z.F(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 37:
                            c4265z.a(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f6592M /* 38 */:
                            c4265z.G(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 39:
                            c4265z.b(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f6594O /* 40 */:
                            c4265z.d(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 41:
                            c4265z.e(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 42:
                            c4265z.f(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f6597R /* 43 */:
                            c4265z.k(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f6598S /* 44 */:
                            InterfaceC3049cL b10 = XJ.b(k9 & 1048575, obj);
                            c4265z.l(b10);
                            obj2 = EL.e(obj, B3, b10, F(w3), obj2);
                            continue;
                        case com.anythink.basead.b.b.j.f6599T /* 45 */:
                            c4265z.m(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 46:
                            c4265z.n(XJ.b(k9 & 1048575, obj));
                            continue;
                        case 47:
                            c4265z.r(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f6602W /* 48 */:
                            c4265z.s(XJ.b(k9 & 1048575, obj));
                            continue;
                        case com.anythink.basead.b.b.j.f6603X /* 49 */:
                            c4265z.i(XJ.b(k9 & 1048575, obj), D(w3), pk);
                            continue;
                        case 50:
                            Object E8 = E(w3);
                            long k10 = k(w3) & 1048575;
                            Object f2 = PL.f(k10, obj);
                            if (f2 == null) {
                                f2 = C3640nL.f33499u.h();
                                PL.g(k10, obj, f2);
                            } else if (!((C3640nL) f2).f33500n) {
                                Object h3 = C3640nL.f33499u.h();
                                XJ.g(h3, f2);
                                PL.g(k10, obj, h3);
                                f2 = h3;
                            }
                            c4265z.t((C3640nL) f2, ((C3586mL) E8).b(), pk);
                            continue;
                        case 51:
                            c4265z.u(1);
                            PL.g(k9 & 1048575, obj, Double.valueOf(bVar.n()));
                            v(B3, w3, obj);
                            continue;
                        case 52:
                            c4265z.u(5);
                            PL.g(k9 & 1048575, obj, Float.valueOf(bVar.o()));
                            v(B3, w3, obj);
                            continue;
                        case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                            c4265z.u(0);
                            PL.g(k9 & 1048575, obj, Long.valueOf(bVar.q()));
                            v(B3, w3, obj);
                            continue;
                        case 54:
                            c4265z.u(0);
                            PL.g(k9 & 1048575, obj, Long.valueOf(bVar.p()));
                            v(B3, w3, obj);
                            continue;
                        case 55:
                            c4265z.u(0);
                            PL.g(k9 & 1048575, obj, Integer.valueOf(bVar.r()));
                            v(B3, w3, obj);
                            continue;
                        case p.a.f20466e /* 56 */:
                            c4265z.u(1);
                            PL.g(k9 & 1048575, obj, Long.valueOf(bVar.s()));
                            v(B3, w3, obj);
                            continue;
                        case 57:
                            c4265z.u(5);
                            PL.g(k9 & 1048575, obj, Integer.valueOf(bVar.t()));
                            v(B3, w3, obj);
                            continue;
                        case 58:
                            c4265z.u(0);
                            PL.g(k9 & 1048575, obj, Boolean.valueOf(bVar.u()));
                            v(B3, w3, obj);
                            continue;
                        case j.v.f13377n /* 59 */:
                            L(k9, c4265z, obj);
                            v(B3, w3, obj);
                            continue;
                        case 60:
                            AbstractC4286zK abstractC4286zK3 = (AbstractC4286zK) I(B3, w3, obj);
                            DL D10 = D(w3);
                            c4265z.u(2);
                            c4265z.v(abstractC4286zK3, D10, pk);
                            J(B3, w3, obj, abstractC4286zK3);
                            continue;
                        case 61:
                            PL.g(k9 & 1048575, obj, c4265z.D());
                            v(B3, w3, obj);
                            continue;
                        case 62:
                            c4265z.u(0);
                            PL.g(k9 & 1048575, obj, Integer.valueOf(bVar.y()));
                            v(B3, w3, obj);
                            continue;
                        case 63:
                            c4265z.u(0);
                            int z9 = bVar.z();
                            YK F9 = F(w3);
                            if (F9 != null && !F9.a(z9)) {
                                obj2 = EL.f(B3, z9, obj, obj2);
                            }
                            PL.g(k9 & 1048575, obj, Integer.valueOf(z9));
                            v(B3, w3, obj);
                            continue;
                            break;
                        case 64:
                            c4265z.u(5);
                            PL.g(k9 & 1048575, obj, Integer.valueOf(bVar.A()));
                            v(B3, w3, obj);
                            continue;
                        case j.v.f13362G /* 65 */:
                            c4265z.u(1);
                            PL.g(k9 & 1048575, obj, Long.valueOf(bVar.B()));
                            v(B3, w3, obj);
                            continue;
                        case 66:
                            c4265z.u(0);
                            PL.g(k9 & 1048575, obj, Integer.valueOf(bVar.C()));
                            v(B3, w3, obj);
                            continue;
                        case j.v.f13368d /* 67 */:
                            c4265z.u(0);
                            PL.g(k9 & 1048575, obj, Long.valueOf(bVar.D()));
                            v(B3, w3, obj);
                            continue;
                        case 68:
                            AbstractC4286zK abstractC4286zK4 = (AbstractC4286zK) I(B3, w3, obj);
                            DL D11 = D(w3);
                            c4265z.u(3);
                            c4265z.w(abstractC4286zK4, D11, pk);
                            J(B3, w3, obj, abstractC4286zK4);
                            continue;
                        default:
                            if (obj2 == null) {
                                obj2 = V2.A(obj);
                            }
                            v22.getClass();
                            if (!V2.y(0, c4265z, obj2)) {
                                while (i4 < i) {
                                    obj2 = K(iArr[i4], obj, obj2, obj);
                                    i4++;
                                }
                                break;
                            }
                    }
                } else if (B3 == Integer.MAX_VALUE) {
                    while (i4 < i) {
                        obj2 = K(iArr[i4], obj, obj2, obj);
                        i4++;
                    }
                } else {
                    if (obj2 == null) {
                        obj2 = V2.A(obj);
                    }
                    v22.getClass();
                    if (!V2.y(0, c4265z, obj2)) {
                        while (i4 < i) {
                            obj2 = K(iArr[i4], obj, obj2, obj);
                            i4++;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i4 < i) {
                    obj2 = K(iArr[i4], obj, obj2, obj);
                    i4++;
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
        return ((VK) this.f34335e).p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.DL
    public final void d(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f34331a;
            if (i >= iArr.length) {
                EL.d(obj, obj2);
                return;
            }
            int k9 = k(i);
            int i4 = 1048575 & k9;
            int l9 = l(k9);
            int i6 = iArr[i];
            long j6 = i4;
            switch (l9) {
                case 0:
                    if (s(i, obj2)) {
                        OK ok = PL.f27544c;
                        obj3 = obj;
                        ok.s1(obj3, j6, ok.o1(j6, obj2));
                        t(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (s(i, obj2)) {
                        OK ok2 = PL.f27544c;
                        ok2.f0(obj, j6, ok2.a0(j6, obj2));
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
                        OK ok3 = PL.f27544c;
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
                case com.anythink.basead.b.b.j.f6592M /* 38 */:
                case 39:
                case com.anythink.basead.b.b.j.f6594O /* 40 */:
                case 41:
                case 42:
                case com.anythink.basead.b.b.j.f6597R /* 43 */:
                case com.anythink.basead.b.b.j.f6598S /* 44 */:
                case com.anythink.basead.b.b.j.f6599T /* 45 */:
                case 46:
                case 47:
                case com.anythink.basead.b.b.j.f6602W /* 48 */:
                case com.anythink.basead.b.b.j.f6603X /* 49 */:
                    InterfaceC3049cL interfaceC3049cL = (InterfaceC3049cL) PL.f(j6, obj);
                    InterfaceC3049cL interfaceC3049cL2 = (InterfaceC3049cL) PL.f(j6, obj2);
                    int size = interfaceC3049cL.size();
                    int size2 = interfaceC3049cL2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AK) interfaceC3049cL).f24443n) {
                            interfaceC3049cL = interfaceC3049cL.D(size2 + size);
                        }
                        interfaceC3049cL.addAll(interfaceC3049cL2);
                    }
                    if (size > 0) {
                        interfaceC3049cL2 = interfaceC3049cL;
                    }
                    PL.g(j6, obj, interfaceC3049cL2);
                    obj3 = obj;
                    break;
                case 50:
                    V2 v22 = EL.f25343a;
                    PL.g(j6, obj, XJ.g(PL.f(j6, obj), PL.f(j6, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                case 54:
                case 55:
                case p.a.f20466e /* 56 */:
                case 57:
                case 58:
                case j.v.f13377n /* 59 */:
                    if (u(i6, i, obj2)) {
                        PL.g(j6, obj, PL.f(j6, obj2));
                        v(i6, i, obj);
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
                case j.v.f13362G /* 65 */:
                case 66:
                case j.v.f13368d /* 67 */:
                    if (u(i6, i, obj2)) {
                        PL.g(j6, obj, PL.f(j6, obj2));
                        v(i6, i, obj);
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
        int i4;
        int i6 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (i6 < this.f34338h) {
            int i11 = this.f34337g[i6];
            int k9 = k(i11);
            int[] iArr = this.f34331a;
            int i12 = iArr[i11 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i10) {
                if (i13 != 1048575) {
                    i9 = f34330l.getInt(obj, i13);
                }
                i4 = i9;
                i = i13;
            } else {
                i = i10;
                i4 = i9;
            }
            Object obj2 = obj;
            if ((268435456 & k9) == 0 || r(obj2, i11, i, i4, i14)) {
                int l9 = l(k9);
                if (l9 == 9 || l9 == 17) {
                    if (r(obj2, i11, i, i4, i14) && !D(i11).e(PL.f(k9 & 1048575, obj2))) {
                    }
                    i6++;
                    obj = obj2;
                    i10 = i;
                    i9 = i4;
                } else {
                    if (l9 != 27) {
                        if (l9 == 60 || l9 == 68) {
                            if (u(iArr[i11], i11, obj2) && !D(i11).e(PL.f(k9 & 1048575, obj2))) {
                            }
                            i6++;
                            obj = obj2;
                            i10 = i;
                            i9 = i4;
                        } else if (l9 != 49) {
                            if (l9 != 50) {
                                continue;
                            } else {
                                C3640nL c3640nL = (C3640nL) PL.f(k9 & 1048575, obj2);
                                if (!c3640nL.isEmpty() && ((SL) ((C3586mL) E(i11)).f32723a.f36134v).f28189n == TL.f28506B) {
                                    DL dl = null;
                                    for (Object obj3 : c3640nL.values()) {
                                        if (dl == null) {
                                            dl = C4179xL.f35771c.a(obj3.getClass());
                                        }
                                        if (!dl.e(obj3)) {
                                        }
                                    }
                                }
                            }
                            i6++;
                            obj = obj2;
                            i10 = i;
                            i9 = i4;
                        }
                    }
                    List list = (List) PL.f(k9 & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        DL D8 = D(i11);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            if (D8.e(list.get(i15))) {
                            }
                        }
                    }
                    i6++;
                    obj = obj2;
                    i10 = i;
                    i9 = i4;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void f(Object obj, byte[] bArr, int i, int i4, CK ck) {
        y(obj, bArr, i, i4, 0, ck);
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
            int[] iArr = this.f34331a;
            if (i >= iArr.length) {
                LL ll = ((VK) obj).zzt;
                if (ll.f26911e) {
                    ll.f26911e = false;
                    return;
                }
                return;
            }
            int k9 = k(i);
            int i4 = 1048575 & k9;
            int l9 = l(k9);
            long j6 = i4;
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
                        case com.anythink.basead.b.b.j.f6592M /* 38 */:
                        case 39:
                        case com.anythink.basead.b.b.j.f6594O /* 40 */:
                        case 41:
                        case 42:
                        case com.anythink.basead.b.b.j.f6597R /* 43 */:
                        case com.anythink.basead.b.b.j.f6598S /* 44 */:
                        case com.anythink.basead.b.b.j.f6599T /* 45 */:
                        case 46:
                        case 47:
                        case com.anythink.basead.b.b.j.f6602W /* 48 */:
                        case com.anythink.basead.b.b.j.f6603X /* 49 */:
                            AK ak = (AK) ((InterfaceC3049cL) PL.f(j6, obj));
                            if (!ak.f24443n) {
                                break;
                            } else {
                                ak.f24443n = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = f34330l;
                            Object object = unsafe.getObject(obj, j6);
                            if (object == null) {
                                break;
                            } else {
                                ((C3640nL) object).f33500n = false;
                                unsafe.putObject(obj, j6, object);
                                break;
                            }
                    }
                } else if (u(iArr[i], i, obj)) {
                    D(i).g(f34330l.getObject(obj, j6));
                }
                i += 3;
            }
            if (s(i, obj)) {
                D(i).g(f34330l.getObject(obj, j6));
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
            int[] iArr = this.f34331a;
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
                                OK ok = PL.f27544c;
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
                                OK ok2 = PL.f27544c;
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
                                OK ok3 = PL.f27544c;
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
                        case com.anythink.basead.b.b.j.f6592M /* 38 */:
                        case 39:
                        case com.anythink.basead.b.b.j.f6594O /* 40 */:
                        case 41:
                        case 42:
                        case com.anythink.basead.b.b.j.f6597R /* 43 */:
                        case com.anythink.basead.b.b.j.f6598S /* 44 */:
                        case com.anythink.basead.b.b.j.f6599T /* 45 */:
                        case 46:
                        case 47:
                        case com.anythink.basead.b.b.j.f6602W /* 48 */:
                        case com.anythink.basead.b.b.j.f6603X /* 49 */:
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
                        case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                        case 54:
                        case 55:
                        case p.a.f20466e /* 56 */:
                        case 57:
                        case 58:
                        case j.v.f13377n /* 59 */:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case j.v.f13362G /* 65 */:
                        case 66:
                        case j.v.f13368d /* 67 */:
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
                int i4 = this.i;
                while (true) {
                    int[] iArr2 = this.f34337g;
                    if (i4 < iArr2.length) {
                        int i6 = iArr2[i4];
                        long j10 = iArr[i6 + 2] & 1048575;
                        if (PL.b(j10, vk) == PL.b(j10, vk2)) {
                            if (!u(0, i6, vk)) {
                                long k10 = k(i6) & 1048575;
                                if (!EL.c(PL.f(k10, vk), PL.f(k10, vk2))) {
                                }
                            }
                            i4++;
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
        int i4;
        int S8;
        int T8;
        int S9;
        int T9;
        int i6;
        int i9;
        int b9;
        int i10;
        int i11;
        int S10;
        int size;
        int v9;
        int S11;
        int S12;
        int S13;
        int i12;
        Iterator it;
        C3586mL c3586mL;
        int T10;
        int g9;
        int S14;
        int d9;
        int S15;
        SL sl;
        int T11;
        int g10;
        int S16;
        int length;
        int S17;
        int S18;
        int T12;
        C3855rL c3855rL = this;
        VK vk2 = vk;
        int i13 = 1;
        Unsafe unsafe = f34330l;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = c3855rL.f34331a;
            if (i16 >= iArr.length) {
                return vk2.zzt.c() + i18;
            }
            int k9 = c3855rL.k(i16);
            int l9 = l(k9);
            int i19 = iArr[i16];
            int i20 = iArr[i16 + 2];
            int i21 = i20 & i14;
            if (l9 <= 17) {
                if (i21 != i15) {
                    i17 = i21 == i14 ? 0 : unsafe.getInt(vk2, i21);
                    i15 = i21;
                }
                i = i13 << (i20 >>> 20);
            } else {
                i = 0;
            }
            int i22 = k9 & i14;
            if (l9 >= RK.f27948u.f27952n) {
                RK.f27949v.getClass();
            }
            long j6 = i22;
            int i23 = 8;
            int i24 = 4;
            switch (l9) {
                case 0:
                    i4 = 1;
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        i18 = Wv.c(i19 << 3, 8, i18);
                    }
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 1:
                    i4 = 1;
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        i18 = Wv.c(i19 << 3, 4, i18);
                    }
                    vk2 = vk;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 2:
                    i4 = 1;
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        long j9 = unsafe.getLong(vk2, j6);
                        S8 = OK.S(i19 << 3);
                        T8 = OK.T(j9);
                        i18 += T8 + S8;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    } else {
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                case 3:
                    i4 = 1;
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        long j10 = unsafe.getLong(vk2, j6);
                        S8 = OK.S(i19 << 3);
                        T8 = OK.T(j10);
                        i18 += T8 + S8;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    } else {
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                case 4:
                    i4 = 1;
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        long j11 = unsafe.getInt(vk2, j6);
                        S8 = OK.S(i19 << 3);
                        T8 = OK.T(j11);
                        i18 += T8 + S8;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    } else {
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                case 5:
                    i4 = 1;
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        i18 = Wv.c(i19 << 3, 8, i18);
                    }
                    vk2 = vk;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 6:
                    i4 = 1;
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        i18 = Wv.c(i19 << 3, 4, i18);
                    }
                    vk2 = vk;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 7:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        i4 = 1;
                        i18 = Wv.c(i19 << 3, 1, i18);
                    } else {
                        i4 = 1;
                    }
                    vk2 = vk;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 8:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        int i25 = i19 << 3;
                        Object object = unsafe.getObject(vk2, j6);
                        if (object instanceof JK) {
                            int S19 = OK.S(i25);
                            int f2 = ((JK) object).f();
                            i18 = Wv.d(f2, f2, S19, i18);
                        } else {
                            int S20 = OK.S(i25);
                            int i26 = RL.f27953a;
                            int g11 = QC.g((String) object);
                            i18 = Wv.d(g11, g11, S20, i18);
                        }
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 9:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        Object object2 = unsafe.getObject(vk2, j6);
                        DL D8 = c3855rL.D(i16);
                        V2 v22 = EL.f25343a;
                        int S21 = OK.S(i19 << 3);
                        int d10 = ((AbstractC4286zK) object2).d(D8);
                        i18 = Wv.d(d10, d10, S21, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 10:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        JK jk = (JK) unsafe.getObject(vk2, j6);
                        int S22 = OK.S(i19 << 3);
                        int f9 = jk.f();
                        i18 = Wv.d(f9, f9, S22, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 11:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        i18 = Wv.c(unsafe.getInt(vk2, j6), OK.S(i19 << 3), i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 12:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        long j12 = unsafe.getInt(vk2, j6);
                        S9 = OK.S(i19 << 3);
                        T9 = OK.T(j12);
                        i6 = T9 + S9;
                        i18 += i6;
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 13:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        i18 = Wv.c(i19 << 3, 4, i18);
                    }
                    vk2 = vk;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 14:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        i18 = Wv.c(i19 << 3, 8, i18);
                    }
                    vk2 = vk;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 15:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        int i27 = unsafe.getInt(vk2, j6);
                        i18 = Wv.c((i27 >> 31) ^ (i27 + i27), OK.S(i19 << 3), i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 16:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        long j13 = unsafe.getLong(vk2, j6);
                        S9 = OK.S(i19 << 3);
                        T9 = OK.T((j13 >> 63) ^ (j13 + j13));
                        i6 = T9 + S9;
                        i18 += i6;
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 17:
                    if (c3855rL.r(vk2, i16, i15, i17, i)) {
                        AbstractC4286zK abstractC4286zK = (AbstractC4286zK) unsafe.getObject(vk2, j6);
                        DL D9 = c3855rL.D(i16);
                        V2 v23 = EL.f25343a;
                        int S23 = OK.S(i19 << 3);
                        i6 = abstractC4286zK.d(D9) + S23 + S23;
                        i18 += i6;
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 18:
                    i9 = i15;
                    b9 = EL.b(i19, (List) unsafe.getObject(vk2, j6));
                    i18 += b9;
                    i15 = i9;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 19:
                    i9 = i15;
                    b9 = EL.a(i19, (List) unsafe.getObject(vk2, j6));
                    i18 += b9;
                    i15 = i9;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 20:
                    i10 = i15;
                    i11 = i17;
                    List list = (List) unsafe.getObject(vk2, j6);
                    V2 v24 = EL.f25343a;
                    if (list.size() != 0) {
                        S10 = (OK.S(i19 << 3) * list.size()) + EL.u(list);
                        i18 += S10;
                        i15 = i10;
                        i17 = i11;
                        i4 = 1;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                    S10 = 0;
                    i18 += S10;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 21:
                    i10 = i15;
                    i11 = i17;
                    List list2 = (List) unsafe.getObject(vk2, j6);
                    V2 v25 = EL.f25343a;
                    size = list2.size();
                    if (size != 0) {
                        v9 = EL.v(list2);
                        S11 = OK.S(i19 << 3);
                        S12 = (S11 * size) + v9;
                        i18 += S12;
                        i15 = i10;
                        i17 = i11;
                        i4 = 1;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                    S12 = 0;
                    i18 += S12;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 22:
                    i10 = i15;
                    i11 = i17;
                    List list3 = (List) unsafe.getObject(vk2, j6);
                    V2 v26 = EL.f25343a;
                    size = list3.size();
                    if (size != 0) {
                        v9 = EL.y(list3);
                        S11 = OK.S(i19 << 3);
                        S12 = (S11 * size) + v9;
                        i18 += S12;
                        i15 = i10;
                        i17 = i11;
                        i4 = 1;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                    S12 = 0;
                    i18 += S12;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 23:
                    i9 = i15;
                    b9 = EL.b(i19, (List) unsafe.getObject(vk2, j6));
                    i18 += b9;
                    i15 = i9;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 24:
                    i9 = i15;
                    b9 = EL.a(i19, (List) unsafe.getObject(vk2, j6));
                    i18 += b9;
                    i15 = i9;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 25:
                    i10 = i15;
                    i11 = i17;
                    List list4 = (List) unsafe.getObject(vk2, j6);
                    V2 v27 = EL.f25343a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        S10 = (OK.S(i19 << 3) + 1) * size2;
                        i18 += S10;
                        i15 = i10;
                        i17 = i11;
                        i4 = 1;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                    S10 = 0;
                    i18 += S10;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 26:
                    i10 = i15;
                    i11 = i17;
                    List list5 = (List) unsafe.getObject(vk2, j6);
                    V2 v28 = EL.f25343a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        S12 = OK.S(i19 << 3) * size3;
                        for (int i28 = 0; i28 < size3; i28++) {
                            Object obj = list5.get(i28);
                            if (obj instanceof JK) {
                                int f10 = ((JK) obj).f();
                                S12 = Wv.c(f10, f10, S12);
                            } else {
                                int i29 = RL.f27953a;
                                int g12 = QC.g((String) obj);
                                S12 = Wv.c(g12, g12, S12);
                            }
                        }
                        i18 += S12;
                        i15 = i10;
                        i17 = i11;
                        i4 = 1;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                    S12 = 0;
                    i18 += S12;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 27:
                    i10 = i15;
                    i11 = i17;
                    List list6 = (List) unsafe.getObject(vk2, j6);
                    DL D10 = c3855rL.D(i16);
                    V2 v29 = EL.f25343a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        S13 = 0;
                    } else {
                        S13 = OK.S(i19 << 3) * size4;
                        for (int i30 = 0; i30 < size4; i30++) {
                            int d11 = ((AbstractC4286zK) list6.get(i30)).d(D10);
                            S13 = Wv.c(d11, d11, S13);
                        }
                    }
                    i18 += S13;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 28:
                    i10 = i15;
                    i11 = i17;
                    List list7 = (List) unsafe.getObject(vk2, j6);
                    V2 v210 = EL.f25343a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        S12 = OK.S(i19 << 3) * size5;
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int f11 = ((JK) list7.get(i31)).f();
                            S12 = Wv.c(f11, f11, S12);
                        }
                        i18 += S12;
                        i15 = i10;
                        i17 = i11;
                        i4 = 1;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                    S12 = 0;
                    i18 += S12;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 29:
                    i10 = i15;
                    i11 = i17;
                    List list8 = (List) unsafe.getObject(vk2, j6);
                    V2 v211 = EL.f25343a;
                    size = list8.size();
                    if (size != 0) {
                        v9 = EL.z(list8);
                        S11 = OK.S(i19 << 3);
                        S12 = (S11 * size) + v9;
                        i18 += S12;
                        i15 = i10;
                        i17 = i11;
                        i4 = 1;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                    S12 = 0;
                    i18 += S12;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 30:
                    i10 = i15;
                    i11 = i17;
                    List list9 = (List) unsafe.getObject(vk2, j6);
                    V2 v212 = EL.f25343a;
                    size = list9.size();
                    if (size != 0) {
                        v9 = EL.x(list9);
                        S11 = OK.S(i19 << 3);
                        S12 = (S11 * size) + v9;
                        i18 += S12;
                        i15 = i10;
                        i17 = i11;
                        i4 = 1;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                    S12 = 0;
                    i18 += S12;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 31:
                    i9 = i15;
                    b9 = EL.a(i19, (List) unsafe.getObject(vk2, j6));
                    i18 += b9;
                    i15 = i9;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 32:
                    i9 = i15;
                    b9 = EL.b(i19, (List) unsafe.getObject(vk2, j6));
                    i18 += b9;
                    i15 = i9;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 33:
                    i10 = i15;
                    i11 = i17;
                    List list10 = (List) unsafe.getObject(vk2, j6);
                    V2 v213 = EL.f25343a;
                    size = list10.size();
                    if (size != 0) {
                        v9 = EL.A(list10);
                        S11 = OK.S(i19 << 3);
                        S12 = (S11 * size) + v9;
                        i18 += S12;
                        i15 = i10;
                        i17 = i11;
                        i4 = 1;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                    S12 = 0;
                    i18 += S12;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 34:
                    i10 = i15;
                    i11 = i17;
                    List list11 = (List) unsafe.getObject(vk2, j6);
                    V2 v214 = EL.f25343a;
                    size = list11.size();
                    if (size != 0) {
                        v9 = EL.w(list11);
                        S11 = OK.S(i19 << 3);
                        S12 = (S11 * size) + v9;
                        i18 += S12;
                        i15 = i10;
                        i17 = i11;
                        i4 = 1;
                        i16 += 3;
                        i14 = 1048575;
                        c3855rL = this;
                        i13 = i4;
                    }
                    S12 = 0;
                    i18 += S12;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 35:
                    i10 = i15;
                    i11 = i17;
                    List list12 = (List) unsafe.getObject(vk2, j6);
                    V2 v215 = EL.f25343a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i18 = Wv.d(size6, OK.S(i19 << 3), size6, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 36:
                    i10 = i15;
                    i11 = i17;
                    List list13 = (List) unsafe.getObject(vk2, j6);
                    V2 v216 = EL.f25343a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i18 = Wv.d(size7, OK.S(i19 << 3), size7, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 37:
                    i10 = i15;
                    i11 = i17;
                    int u6 = EL.u((List) unsafe.getObject(vk2, j6));
                    if (u6 > 0) {
                        i18 = Wv.d(u6, OK.S(i19 << 3), u6, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case com.anythink.basead.b.b.j.f6592M /* 38 */:
                    i10 = i15;
                    i11 = i17;
                    int v10 = EL.v((List) unsafe.getObject(vk2, j6));
                    if (v10 > 0) {
                        i18 = Wv.d(v10, OK.S(i19 << 3), v10, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 39:
                    i10 = i15;
                    i11 = i17;
                    int y7 = EL.y((List) unsafe.getObject(vk2, j6));
                    if (y7 > 0) {
                        i18 = Wv.d(y7, OK.S(i19 << 3), y7, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case com.anythink.basead.b.b.j.f6594O /* 40 */:
                    i10 = i15;
                    i11 = i17;
                    List list14 = (List) unsafe.getObject(vk2, j6);
                    V2 v217 = EL.f25343a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i18 = Wv.d(size8, OK.S(i19 << 3), size8, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 41:
                    i10 = i15;
                    i11 = i17;
                    List list15 = (List) unsafe.getObject(vk2, j6);
                    V2 v218 = EL.f25343a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i18 = Wv.d(size9, OK.S(i19 << 3), size9, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 42:
                    i10 = i15;
                    i11 = i17;
                    List list16 = (List) unsafe.getObject(vk2, j6);
                    V2 v219 = EL.f25343a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i18 = Wv.d(size10, OK.S(i19 << 3), size10, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case com.anythink.basead.b.b.j.f6597R /* 43 */:
                    i10 = i15;
                    i11 = i17;
                    int z6 = EL.z((List) unsafe.getObject(vk2, j6));
                    if (z6 > 0) {
                        i18 = Wv.d(z6, OK.S(i19 << 3), z6, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case com.anythink.basead.b.b.j.f6598S /* 44 */:
                    i10 = i15;
                    i11 = i17;
                    int x9 = EL.x((List) unsafe.getObject(vk2, j6));
                    if (x9 > 0) {
                        i18 = Wv.d(x9, OK.S(i19 << 3), x9, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case com.anythink.basead.b.b.j.f6599T /* 45 */:
                    i10 = i15;
                    i11 = i17;
                    List list17 = (List) unsafe.getObject(vk2, j6);
                    V2 v220 = EL.f25343a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i18 = Wv.d(size11, OK.S(i19 << 3), size11, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 46:
                    i10 = i15;
                    i11 = i17;
                    List list18 = (List) unsafe.getObject(vk2, j6);
                    V2 v221 = EL.f25343a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i18 = Wv.d(size12, OK.S(i19 << 3), size12, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 47:
                    i10 = i15;
                    i11 = i17;
                    int A9 = EL.A((List) unsafe.getObject(vk2, j6));
                    if (A9 > 0) {
                        i18 = Wv.d(A9, OK.S(i19 << 3), A9, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case com.anythink.basead.b.b.j.f6602W /* 48 */:
                    i10 = i15;
                    i11 = i17;
                    int w3 = EL.w((List) unsafe.getObject(vk2, j6));
                    if (w3 > 0) {
                        i18 = Wv.d(w3, OK.S(i19 << 3), w3, i18);
                    }
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case com.anythink.basead.b.b.j.f6603X /* 49 */:
                    i10 = i15;
                    i11 = i17;
                    List list19 = (List) unsafe.getObject(vk2, j6);
                    DL D11 = c3855rL.D(i16);
                    V2 v222 = EL.f25343a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i32 = 0; i32 < size13; i32++) {
                            AbstractC4286zK abstractC4286zK2 = (AbstractC4286zK) list19.get(i32);
                            int S24 = OK.S(i19 << 3);
                            i12 += abstractC4286zK2.d(D11) + S24 + S24;
                        }
                    }
                    i18 += i12;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 50:
                    C3640nL c3640nL = (C3640nL) unsafe.getObject(vk2, j6);
                    C3586mL c3586mL2 = (C3586mL) c3855rL.E(i16);
                    if (c3640nL.isEmpty()) {
                        i12 = 0;
                    } else {
                        Iterator it2 = c3640nL.entrySet().iterator();
                        i12 = 0;
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c3586mL2.getClass();
                            int S25 = OK.S(i19 << 3);
                            int i33 = i24;
                            C4297ze c4297ze = c3586mL2.f32723a;
                            int i34 = i23;
                            SL sl2 = (SL) c4297ze.f36133u;
                            int i35 = QK.f27807c;
                            int S26 = OK.S(i34);
                            int i36 = i15;
                            SL sl3 = SL.f28186w;
                            if (sl2 == sl3) {
                                S26 += S26;
                            }
                            TL tl = TL.f28508n;
                            int i37 = i17;
                            switch (sl2.ordinal()) {
                                case 0:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    ((Double) key).getClass();
                                    T10 = i34;
                                    int i38 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S27 = OK.S(16);
                                    if (sl == sl3) {
                                        S27 += S27;
                                    }
                                    switch (sl.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            T11 = i34;
                                            int i39 = T11 + S27 + i38;
                                            i12 = Wv.d(i39, i39, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 1:
                                            ((Float) value).getClass();
                                            T11 = i33;
                                            int i392 = T11 + S27 + i38;
                                            i12 = Wv.d(i392, i392, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 2:
                                            T11 = OK.T(((Long) value).longValue());
                                            int i3922 = T11 + S27 + i38;
                                            i12 = Wv.d(i3922, i3922, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 3:
                                            T11 = OK.T(((Long) value).longValue());
                                            int i39222 = T11 + S27 + i38;
                                            i12 = Wv.d(i39222, i39222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 4:
                                            T11 = OK.T(((Integer) value).intValue());
                                            int i392222 = T11 + S27 + i38;
                                            i12 = Wv.d(i392222, i392222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 5:
                                            ((Long) value).getClass();
                                            T11 = i34;
                                            int i3922222 = T11 + S27 + i38;
                                            i12 = Wv.d(i3922222, i3922222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 6:
                                            ((Integer) value).getClass();
                                            T11 = i33;
                                            int i39222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i39222222, i39222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            T11 = 1;
                                            int i392222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i392222222, i392222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 8:
                                            if (value instanceof JK) {
                                                g10 = ((JK) value).f();
                                                S16 = OK.S(g10);
                                            } else {
                                                int i40 = RL.f27953a;
                                                g10 = QC.g((String) value);
                                                S16 = OK.S(g10);
                                            }
                                            T11 = g10 + S16;
                                            int i3922222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i3922222222, i3922222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 9:
                                            T11 = ((VK) ((AbstractC4286zK) value)).d(null);
                                            int i39222222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i39222222222, i39222222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 10:
                                            if (value instanceof AbstractC3210fL) {
                                                ((AbstractC3210fL) value).getClass();
                                                throw null;
                                            }
                                            g10 = ((VK) ((AbstractC4286zK) value)).d(null);
                                            S16 = OK.S(g10);
                                            T11 = g10 + S16;
                                            int i392222222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i392222222222, i392222222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
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
                                            int i3922222222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i3922222222222, i3922222222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 12:
                                            T11 = OK.S(((Integer) value).intValue());
                                            int i39222222222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i39222222222222, i39222222222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 13:
                                            T11 = value instanceof XK ? OK.T(((XK) value).c()) : OK.T(((Integer) value).intValue());
                                            int i392222222222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i392222222222222, i392222222222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 14:
                                            ((Integer) value).getClass();
                                            T11 = i33;
                                            int i3922222222222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i3922222222222222, i3922222222222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 15:
                                            ((Long) value).getClass();
                                            T11 = i34;
                                            int i39222222222222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i39222222222222222, i39222222222222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            T11 = OK.S((intValue >> 31) ^ (intValue + intValue));
                                            int i392222222222222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i392222222222222222, i392222222222222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            T11 = OK.T((longValue >> 63) ^ (longValue + longValue));
                                            int i3922222222222222222 = T11 + S27 + i38;
                                            i12 = Wv.d(i3922222222222222222, i3922222222222222222, S25, i12);
                                            i24 = i33;
                                            i23 = i34;
                                            i15 = i36;
                                            i17 = i37;
                                            c3586mL2 = c3586mL;
                                            it2 = it;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    ((Float) key).getClass();
                                    T10 = i33;
                                    int i382 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S272 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 2:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    T10 = OK.T(((Long) key).longValue());
                                    int i3822 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S2722 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 3:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    T10 = OK.T(((Long) key).longValue());
                                    int i38222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S27222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 4:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    T10 = OK.T(((Integer) key).intValue());
                                    int i382222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S272222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 5:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    ((Long) key).getClass();
                                    T10 = i34;
                                    int i3822222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S2722222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 6:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    ((Integer) key).getClass();
                                    T10 = i33;
                                    int i38222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S27222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 7:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    ((Boolean) key).getClass();
                                    T10 = 1;
                                    int i382222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S272222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 8:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    if (key instanceof JK) {
                                        g9 = ((JK) key).f();
                                        S14 = OK.S(g9);
                                    } else {
                                        int i41 = RL.f27953a;
                                        g9 = QC.g((String) key);
                                        S14 = OK.S(g9);
                                    }
                                    T10 = g9 + S14;
                                    int i3822222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S2722222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 9:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    d9 = ((VK) ((AbstractC4286zK) key)).d(null);
                                    T10 = d9;
                                    int i38222222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S27222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 10:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    if (key instanceof AbstractC3210fL) {
                                        ((AbstractC3210fL) key).getClass();
                                        throw null;
                                    }
                                    int d12 = ((VK) ((AbstractC4286zK) key)).d(null);
                                    d9 = d12 + OK.S(d12);
                                    T10 = d9;
                                    int i382222222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S272222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 11:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    if (key instanceof JK) {
                                        g9 = ((JK) key).f();
                                        S14 = OK.S(g9);
                                    } else {
                                        g9 = ((byte[]) key).length;
                                        S14 = OK.S(g9);
                                    }
                                    T10 = g9 + S14;
                                    int i3822222222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S2722222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 12:
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    T10 = OK.S(((Integer) key).intValue());
                                    int i38222222222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S27222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 13:
                                    if (key instanceof XK) {
                                        it = it2;
                                        c3586mL = c3586mL2;
                                        T10 = OK.T(((XK) key).c());
                                    } else {
                                        it = it2;
                                        c3586mL = c3586mL2;
                                        T10 = OK.T(((Integer) key).intValue());
                                    }
                                    int i382222222222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S272222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    T10 = i33;
                                    int i3822222222222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S2722222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    T10 = i34;
                                    int i38222222222222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S27222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    S15 = OK.S((intValue2 >> 31) ^ (intValue2 + intValue2));
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    T10 = S15;
                                    int i382222222222222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
                                    int S272222222222222222 = OK.S(16);
                                    if (sl == sl3) {
                                    }
                                    switch (sl.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    S15 = OK.T((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    it = it2;
                                    c3586mL = c3586mL2;
                                    T10 = S15;
                                    int i3822222222222222222 = T10 + S26;
                                    sl = (SL) c4297ze.f36134v;
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
                    i10 = i15;
                    i11 = i17;
                    i18 += i12;
                    i15 = i10;
                    i17 = i11;
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 51:
                    if (c3855rL.u(i19, i16, vk2)) {
                        i18 = Wv.c(i19 << 3, 8, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 52:
                    if (c3855rL.u(i19, i16, vk2)) {
                        i18 = Wv.c(i19 << 3, 4, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                    if (c3855rL.u(i19, i16, vk2)) {
                        long p9 = p(j6, vk2);
                        S18 = OK.S(i19 << 3);
                        T12 = OK.T(p9);
                        i18 += T12 + S18;
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 54:
                    if (c3855rL.u(i19, i16, vk2)) {
                        long p10 = p(j6, vk2);
                        S18 = OK.S(i19 << 3);
                        T12 = OK.T(p10);
                        i18 += T12 + S18;
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 55:
                    if (c3855rL.u(i19, i16, vk2)) {
                        long o4 = o(j6, vk2);
                        S18 = OK.S(i19 << 3);
                        T12 = OK.T(o4);
                        i18 += T12 + S18;
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case p.a.f20466e /* 56 */:
                    if (c3855rL.u(i19, i16, vk2)) {
                        i18 = Wv.c(i19 << 3, 8, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 57:
                    if (c3855rL.u(i19, i16, vk2)) {
                        i18 = Wv.c(i19 << 3, 4, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 58:
                    if (c3855rL.u(i19, i16, vk2)) {
                        i18 = Wv.c(i19 << 3, 1, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case j.v.f13377n /* 59 */:
                    if (c3855rL.u(i19, i16, vk2)) {
                        int i42 = i19 << 3;
                        Object object3 = unsafe.getObject(vk2, j6);
                        if (object3 instanceof JK) {
                            int S28 = OK.S(i42);
                            int f12 = ((JK) object3).f();
                            i18 = Wv.d(f12, f12, S28, i18);
                        } else {
                            int S29 = OK.S(i42);
                            int i43 = RL.f27953a;
                            int g13 = QC.g((String) object3);
                            i18 = Wv.d(g13, g13, S29, i18);
                        }
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 60:
                    if (c3855rL.u(i19, i16, vk2)) {
                        Object object4 = unsafe.getObject(vk2, j6);
                        DL D12 = c3855rL.D(i16);
                        V2 v223 = EL.f25343a;
                        int S30 = OK.S(i19 << 3);
                        int d13 = ((AbstractC4286zK) object4).d(D12);
                        i18 = Wv.d(d13, d13, S30, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 61:
                    if (c3855rL.u(i19, i16, vk2)) {
                        JK jk2 = (JK) unsafe.getObject(vk2, j6);
                        int S31 = OK.S(i19 << 3);
                        int f13 = jk2.f();
                        i18 = Wv.d(f13, f13, S31, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 62:
                    if (c3855rL.u(i19, i16, vk2)) {
                        i18 = Wv.c(o(j6, vk2), OK.S(i19 << 3), i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 63:
                    if (c3855rL.u(i19, i16, vk2)) {
                        long o6 = o(j6, vk2);
                        S18 = OK.S(i19 << 3);
                        T12 = OK.T(o6);
                        i18 += T12 + S18;
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 64:
                    if (c3855rL.u(i19, i16, vk2)) {
                        i18 = Wv.c(i19 << 3, 4, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case j.v.f13362G /* 65 */:
                    if (c3855rL.u(i19, i16, vk2)) {
                        i18 = Wv.c(i19 << 3, 8, i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 66:
                    if (c3855rL.u(i19, i16, vk2)) {
                        int o9 = o(j6, vk2);
                        i18 = Wv.c((o9 >> 31) ^ (o9 + o9), OK.S(i19 << 3), i18);
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case j.v.f13368d /* 67 */:
                    if (c3855rL.u(i19, i16, vk2)) {
                        long p11 = p(j6, vk2);
                        S18 = OK.S(i19 << 3);
                        T12 = OK.T((p11 >> 63) ^ (p11 + p11));
                        i18 += T12 + S18;
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                case 68:
                    if (c3855rL.u(i19, i16, vk2)) {
                        AbstractC4286zK abstractC4286zK3 = (AbstractC4286zK) unsafe.getObject(vk2, j6);
                        DL D13 = c3855rL.D(i16);
                        V2 v224 = EL.f25343a;
                        int S32 = OK.S(i19 << 3);
                        i18 += abstractC4286zK3.d(D13) + S32 + S32;
                    }
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
                default:
                    i4 = 1;
                    i16 += 3;
                    i14 = 1048575;
                    c3855rL = this;
                    i13 = i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final int j(VK vk) {
        int i;
        long doubleToLongBits;
        int i4;
        int floatToIntBits;
        int i6;
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f34331a.length; i11 += 3) {
            int k9 = k(i11);
            int l9 = l(k9);
            if (l9 <= 50 || l9 >= 69) {
                long j6 = k9 & 1048575;
                int i12 = 37;
                switch (l9) {
                    case 0:
                        i = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(PL.f27544c.o1(j6, vk));
                        byte[] bArr = AbstractC3103dL.f30518a;
                        i6 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + i6;
                        break;
                    case 1:
                        i4 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(PL.f27544c.a0(j6, vk));
                        i10 = i4 + floatToIntBits;
                        break;
                    case 2:
                        i = i10 * 53;
                        doubleToLongBits = PL.d(j6, vk);
                        byte[] bArr2 = AbstractC3103dL.f30518a;
                        i6 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + i6;
                        break;
                    case 3:
                        i = i10 * 53;
                        doubleToLongBits = PL.d(j6, vk);
                        byte[] bArr3 = AbstractC3103dL.f30518a;
                        i6 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + i6;
                        break;
                    case 4:
                        i4 = i10 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i10 = i4 + floatToIntBits;
                        break;
                    case 5:
                        i = i10 * 53;
                        doubleToLongBits = PL.d(j6, vk);
                        byte[] bArr4 = AbstractC3103dL.f30518a;
                        i6 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + i6;
                        break;
                    case 6:
                        i4 = i10 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i10 = i4 + floatToIntBits;
                        break;
                    case 7:
                        i = i10 * 53;
                        boolean W3 = PL.f27544c.W(j6, vk);
                        byte[] bArr5 = AbstractC3103dL.f30518a;
                        i6 = W3 ? 1231 : 1237;
                        i10 = i + i6;
                        break;
                    case 8:
                        i4 = i10 * 53;
                        floatToIntBits = ((String) PL.f(j6, vk)).hashCode();
                        i10 = i4 + floatToIntBits;
                        break;
                    case 9:
                        i9 = i10 * 53;
                        Object f2 = PL.f(j6, vk);
                        if (f2 != null) {
                            i12 = f2.hashCode();
                        }
                        i10 = i9 + i12;
                        break;
                    case 10:
                        i4 = i10 * 53;
                        floatToIntBits = PL.f(j6, vk).hashCode();
                        i10 = i4 + floatToIntBits;
                        break;
                    case 11:
                        i4 = i10 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i10 = i4 + floatToIntBits;
                        break;
                    case 12:
                        i4 = i10 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i10 = i4 + floatToIntBits;
                        break;
                    case 13:
                        i4 = i10 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i10 = i4 + floatToIntBits;
                        break;
                    case 14:
                        i = i10 * 53;
                        doubleToLongBits = PL.d(j6, vk);
                        byte[] bArr6 = AbstractC3103dL.f30518a;
                        i6 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + i6;
                        break;
                    case 15:
                        i4 = i10 * 53;
                        floatToIntBits = PL.b(j6, vk);
                        i10 = i4 + floatToIntBits;
                        break;
                    case 16:
                        i = i10 * 53;
                        doubleToLongBits = PL.d(j6, vk);
                        byte[] bArr7 = AbstractC3103dL.f30518a;
                        i6 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i + i6;
                        break;
                    case 17:
                        i9 = i10 * 53;
                        Object f9 = PL.f(j6, vk);
                        if (f9 != null) {
                            i12 = f9.hashCode();
                        }
                        i10 = i9 + i12;
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
                    case com.anythink.basead.b.b.j.f6592M /* 38 */:
                    case 39:
                    case com.anythink.basead.b.b.j.f6594O /* 40 */:
                    case 41:
                    case 42:
                    case com.anythink.basead.b.b.j.f6597R /* 43 */:
                    case com.anythink.basead.b.b.j.f6598S /* 44 */:
                    case com.anythink.basead.b.b.j.f6599T /* 45 */:
                    case 46:
                    case 47:
                    case com.anythink.basead.b.b.j.f6602W /* 48 */:
                    case com.anythink.basead.b.b.j.f6603X /* 49 */:
                        i4 = i10 * 53;
                        floatToIntBits = PL.f(j6, vk).hashCode();
                        i10 = i4 + floatToIntBits;
                        break;
                    case 50:
                        i4 = i10 * 53;
                        floatToIntBits = PL.f(j6, vk).hashCode();
                        i10 = i4 + floatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.i;
        while (true) {
            int[] iArr = this.f34337g;
            if (i13 >= iArr.length) {
                return vk.zzt.hashCode() + (i10 * 53);
            }
            if (!u(0, iArr[i13], vk)) {
                i10 = PL.f(k(r3) & 1048575, vk).hashCode() + (i10 * 53);
            }
            i13++;
        }
    }

    public final int k(int i) {
        return this.f34331a[i + 1];
    }

    public final boolean q(VK vk, VK vk2, int i) {
        return s(i, vk) == s(i, vk2);
    }

    public final boolean r(Object obj, int i, int i4, int i6, int i9) {
        return i4 == 1048575 ? s(i, obj) : (i6 & i9) != 0;
    }

    public final boolean s(int i, Object obj) {
        int i4 = this.f34331a[i + 2];
        long j6 = i4 & 1048575;
        if (j6 == 1048575) {
            int k9 = k(i);
            long j9 = k9 & 1048575;
            switch (l(k9)) {
                case 0:
                    if (Double.doubleToRawLongBits(PL.f27544c.o1(j9, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(PL.f27544c.a0(j9, obj)) == 0) {
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
                    return PL.f27544c.W(j9, obj);
                case 8:
                    Object f2 = PL.f(j9, obj);
                    if (f2 instanceof String) {
                        if (((String) f2).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(f2 instanceof JK)) {
                            throw new IllegalArgumentException();
                        }
                        if (JK.f26428u.equals(f2)) {
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
                    if (JK.f26428u.equals(PL.f(j9, obj))) {
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
        } else if (((1 << (i4 >>> 20)) & PL.b(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void t(int i, Object obj) {
        int i4 = this.f34331a[i + 2];
        long j6 = 1048575 & i4;
        if (j6 == 1048575) {
            return;
        }
        PL.c((1 << (i4 >>> 20)) | PL.b(j6, obj), j6, obj);
    }

    public final boolean u(int i, int i4, Object obj) {
        return PL.b((long) (this.f34331a[i4 + 2] & 1048575), obj) == i;
    }

    public final void v(int i, int i4, Object obj) {
        PL.c(i, this.f34331a[i4 + 2] & 1048575, obj);
    }

    public final int w(int i, int i4) {
        int[] iArr = this.f34331a;
        int length = (iArr.length / 3) - 1;
        while (i4 <= length) {
            int i6 = (length + i4) >>> 1;
            int i9 = i6 * 3;
            int i10 = iArr[i9];
            if (i == i10) {
                return i9;
            }
            if (i < i10) {
                length = i6 - 1;
            } else {
                i4 = i6 + 1;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3855rL.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.CK):int");
    }
}
