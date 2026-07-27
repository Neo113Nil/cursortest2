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
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class DL implements OL {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f24425k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f24426l = AbstractC3036cM.n();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f24427a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f24428b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24429c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24430d;

    /* renamed from: e, reason: collision with root package name */
    public final IK f24431e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24432f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f24433g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24434h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final T2 f24435j;

    public DL(int[] iArr, Object[] objArr, int i, int i4, IK ik, int[] iArr2, int i9, int i10, T2 t22, C3307hK c3307hK) {
        this.f24427a = iArr;
        this.f24428b = objArr;
        this.f24429c = i;
        this.f24430d = i4;
        this.f24432f = ik instanceof AbstractC3199fL;
        this.f24433g = iArr2;
        this.f24434h = i9;
        this.i = i10;
        this.f24435j = t22;
        this.f24431e = ik;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e6) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            AbstractC5051n.j(sb, "Field ", str, " for ", name);
            throw new RuntimeException(AbstractC5051n.g(sb, " not found. Known fields are ", arrays), e6);
        }
    }

    public static int l(int i) {
        return (i >>> 20) & com.anythink.basead.exoplayer.k.p.f8630b;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC3199fL) {
            return ((AbstractC3199fL) obj).h();
        }
        return true;
    }

    public static void n(Object obj) {
        if (!m(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static int o(long j9, Object obj) {
        return ((Integer) AbstractC3036cM.j(j9, obj)).intValue();
    }

    public static long p(long j9, Object obj) {
        return ((Long) AbstractC3036cM.j(j9, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i, int i4, EnumC3200fM enumC3200fM, Class cls, LK lk) {
        EnumC3200fM enumC3200fM2 = EnumC3200fM.f30691v;
        switch (enumC3200fM.ordinal()) {
            case 0:
                int i9 = i + 8;
                lk.f26143c = Double.valueOf(Double.longBitsToDouble(C3686oN.q(i, bArr)));
                return i9;
            case 1:
                int i10 = i + 4;
                lk.f26143c = Float.valueOf(Float.intBitsToFloat(C3686oN.o(i, bArr)));
                return i10;
            case 2:
            case 3:
                int k6 = C3686oN.k(bArr, i, lk);
                lk.f26143c = Long.valueOf(lk.f26142b);
                return k6;
            case 4:
            case 12:
            case 13:
                int b9 = C3686oN.b(bArr, i, lk);
                lk.f26143c = Integer.valueOf(lk.f26141a);
                return b9;
            case 5:
            case 15:
                int i11 = i + 8;
                lk.f26143c = Long.valueOf(C3686oN.q(i, bArr));
                return i11;
            case 6:
            case 14:
                int i12 = i + 4;
                lk.f26143c = Integer.valueOf(C3686oN.o(i, bArr));
                return i12;
            case 7:
                int k9 = C3686oN.k(bArr, i, lk);
                lk.f26143c = Boolean.valueOf(lk.f26142b != 0);
                return k9;
            case 8:
                return C3686oN.r(bArr, i, lk);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                OL a9 = IL.f25547c.a(cls);
                AbstractC3199fL a10 = a9.a();
                int x3 = C3686oN.x(a10, a9, bArr, i, i4, lk);
                a9.h(a10);
                lk.f26143c = a10;
                return x3;
            case 11:
                return C3686oN.t(bArr, i, lk);
            case 16:
                int b10 = C3686oN.b(bArr, i, lk);
                lk.f26143c = Integer.valueOf(S7.b.h(lk.f26141a));
                return b10;
            case 17:
                int k10 = C3686oN.k(bArr, i, lk);
                lk.f26143c = Long.valueOf(S7.b.i(lk.f26142b));
                return k10;
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
    public static DL z(KL kl, T2 t22, C3307hK c3307hK) {
        int i;
        int charAt;
        int i4;
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
        char c4;
        int i29;
        int i30;
        int i31;
        Field A8;
        int i32;
        char charAt9;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        Object obj;
        Field A9;
        Object obj2;
        Field A10;
        int i39;
        char charAt10;
        int i40;
        int i41;
        char charAt11;
        int i42;
        char charAt12;
        int i43;
        char charAt13;
        if (!(kl instanceof KL)) {
            kl.getClass();
            throw new ClassCastException();
        }
        String str2 = kl.f25954b;
        int length = str2.length();
        char c9 = 55296;
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
            i4 = 0;
            i11 = 0;
            i13 = 0;
            iArr = f24425k;
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
            i4 = charAt17;
            i9 = i71;
            iArr = iArr2;
            i10 = charAt15;
            i45 = i67;
            i11 = charAt18;
            i12 = i70;
            i13 = charAt20;
        }
        Unsafe unsafe = f24426l;
        Class<?> cls = kl.f25953a.getClass();
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
            if (charAt21 >= c9) {
                int i79 = charAt21 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i42 = i80 + 1;
                    charAt12 = str2.charAt(i80);
                    if (charAt12 < c9) {
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
            if (charAt22 >= c9) {
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
            int i86 = charAt22 & com.anythink.basead.exoplayer.k.p.f8630b;
            int i87 = charAt21;
            int i88 = charAt22 & 2048;
            Object[] objArr3 = kl.f25955c;
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
                        if (kl.a() == 1 || i88 != 0) {
                            i37 = i12 + 1;
                            int i96 = i77 / 3;
                            objArr2[i96 + i96 + 1] = objArr3[i12];
                        } else {
                            i38 = 0;
                            int i97 = i93 + i93;
                            obj = objArr3[i97];
                            int i98 = i38;
                            if (obj instanceof Field) {
                                A9 = (Field) obj;
                            } else {
                                A9 = A(cls, (String) obj);
                                objArr3[i97] = A9;
                                iArr[i74] = i77;
                                i74++;
                            }
                            int i99 = i10;
                            objArr = objArr2;
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(A9);
                            int i100 = i97 + 1;
                            obj2 = objArr3[i100];
                            if (obj2 instanceof Field) {
                                A10 = (Field) obj2;
                            } else {
                                A10 = A(cls, (String) obj2);
                                objArr3[i100] = A10;
                            }
                            i25 = i99;
                            i27 = i98;
                            str = str2;
                            i26 = i12;
                            i31 = 0;
                            c4 = 55296;
                            i28 = (int) unsafe.objectFieldOffset(A10);
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
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(A9);
                    int i1002 = i972 + 1;
                    obj2 = objArr3[i1002];
                    if (obj2 instanceof Field) {
                    }
                    i25 = i992;
                    i27 = i982;
                    str = str2;
                    i26 = i12;
                    i31 = 0;
                    c4 = 55296;
                    i28 = (int) unsafe.objectFieldOffset(A10);
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
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(A9);
                int i10022 = i9722 + 1;
                obj2 = objArr3[i10022];
                if (obj2 instanceof Field) {
                }
                i25 = i9922;
                i27 = i9822;
                str = str2;
                i26 = i12;
                i31 = 0;
                c4 = 55296;
                i28 = (int) unsafe.objectFieldOffset(A10);
                i30 = objectFieldOffset222;
            } else {
                int i101 = i10;
                objArr = objArr2;
                int i102 = i12 + 1;
                Field A11 = A(cls, (String) objArr3[i12]);
                i25 = i101;
                if (i86 == 9 || i86 == 17) {
                    i26 = i102;
                    int i103 = i77 / 3;
                    objArr[i103 + i103 + 1] = A11.getType();
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
                            if (kl.a() == 1 || i88 != 0) {
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
                                objectFieldOffset = (int) unsafe.objectFieldOffset(A11);
                                i28 = 1048575;
                                if ((charAt22 & 4096) != 0 || i86 > 17) {
                                    str = str2;
                                    c4 = 55296;
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
                                        A8 = (Field) obj3;
                                    } else {
                                        A8 = A(cls, (String) obj3);
                                        objArr3[i112] = A8;
                                    }
                                    i31 = charAt24 % 32;
                                    i28 = (int) unsafe.objectFieldOffset(A8);
                                    i30 = objectFieldOffset;
                                    i29 = i109;
                                    c4 = 55296;
                                }
                            } else {
                                i75 = i106;
                                i26 = i105;
                            }
                        } else {
                            i26 = i102;
                        }
                        i27 = 0;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(A11);
                        i28 = 1048575;
                        if ((charAt22 & 4096) != 0) {
                        }
                        str = str2;
                        c4 = 55296;
                        i29 = i24;
                        i30 = objectFieldOffset;
                        i31 = 0;
                    }
                    int i113 = i77 / 3;
                    objArr[i113 + i113 + i34] = objArr3[i33];
                    i26 = i35;
                }
                i27 = i88;
                objectFieldOffset = (int) unsafe.objectFieldOffset(A11);
                i28 = 1048575;
                if ((charAt22 & 4096) != 0) {
                }
                str = str2;
                c4 = 55296;
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
            c9 = c4;
            length = i23;
            i10 = i25;
            i12 = i26;
            str2 = str;
            i45 = i29;
            objArr2 = objArr;
        }
        return new DL(iArr3, objArr2, i4, i11, kl.f25953a, iArr, i13, i72, t22, c3307hK);
    }

    public final void B(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            int k6 = k(i) & 1048575;
            Unsafe unsafe = f24426l;
            long j9 = k6;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                int i4 = this.f24427a[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(CL.b(i4, 38) + obj3.length());
                sb.append("Source subfield ");
                sb.append(i4);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            OL D8 = D(i);
            if (!s(i, obj)) {
                if (m(object)) {
                    AbstractC3199fL a9 = D8.a();
                    D8.e(a9, object);
                    unsafe.putObject(obj, j9, a9);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!m(object2)) {
                AbstractC3199fL a10 = D8.a();
                D8.e(a10, object2);
                unsafe.putObject(obj, j9, a10);
                object2 = a10;
            }
            D8.e(object2, object);
        }
    }

    public final void C(int i, Object obj, Object obj2) {
        int[] iArr = this.f24427a;
        int i4 = iArr[i];
        if (u(i4, i, obj2)) {
            int k6 = k(i) & 1048575;
            Unsafe unsafe = f24426l;
            long j9 = k6;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                int i9 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(CL.b(i9, 38) + obj3.length());
                sb.append("Source subfield ");
                sb.append(i9);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            OL D8 = D(i);
            if (!u(i4, i, obj)) {
                if (m(object)) {
                    AbstractC3199fL a9 = D8.a();
                    D8.e(a9, object);
                    unsafe.putObject(obj, j9, a9);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                v(i4, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!m(object2)) {
                AbstractC3199fL a10 = D8.a();
                D8.e(a10, object2);
                unsafe.putObject(obj, j9, a10);
                object2 = a10;
            }
            D8.e(object2, object);
        }
    }

    public final OL D(int i) {
        int i4 = i / 3;
        int i9 = i4 + i4;
        Object[] objArr = this.f24428b;
        OL ol = (OL) objArr[i9];
        if (ol != null) {
            return ol;
        }
        OL a9 = IL.f25547c.a((Class) objArr[i9 + 1]);
        objArr[i9] = a9;
        return a9;
    }

    public final Object E(int i) {
        int i4 = i / 3;
        return this.f24428b[i4 + i4];
    }

    public final InterfaceC3362iL F(int i) {
        int i4 = i / 3;
        return (InterfaceC3362iL) this.f24428b[i4 + i4 + 1];
    }

    public final Object G(int i, Object obj) {
        OL D8 = D(i);
        int k6 = k(i) & 1048575;
        if (!s(i, obj)) {
            return D8.a();
        }
        Object object = f24426l.getObject(obj, k6);
        if (m(object)) {
            return object;
        }
        AbstractC3199fL a9 = D8.a();
        if (object != null) {
            D8.e(a9, object);
        }
        return a9;
    }

    public final void H(int i, Object obj, Object obj2) {
        f24426l.putObject(obj, k(i) & 1048575, obj2);
        t(i, obj);
    }

    public final Object I(int i, int i4, Object obj) {
        OL D8 = D(i4);
        if (!u(i, i4, obj)) {
            return D8.a();
        }
        Object object = f24426l.getObject(obj, k(i4) & 1048575);
        if (m(object)) {
            return object;
        }
        AbstractC3199fL a9 = D8.a();
        if (object != null) {
            D8.e(a9, object);
        }
        return a9;
    }

    public final void J(int i, int i4, Object obj, Object obj2) {
        f24426l.putObject(obj, k(i4) & 1048575, obj2);
        v(i, i4, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(Object obj, int i, Object obj2, T2 t22, Object obj3) {
        InterfaceC3362iL F8;
        char c4;
        int k6;
        int b9;
        int j9;
        EnumC3200fM enumC3200fM;
        int k9;
        int b10;
        int j10;
        int i4 = this.f24427a[i];
        Object j11 = AbstractC3036cM.j(k(i) & 1048575, obj);
        if (j11 == null || (F8 = F(i)) == null) {
            return obj2;
        }
        C4017ue c4017ue = ((C4115wL) E(i)).f34975a;
        Iterator it = ((C4169xL) j11).entrySet().iterator();
        Object obj4 = obj2;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!F8.a(((Integer) entry.getValue()).intValue())) {
                if (obj4 == null) {
                    t22.getClass();
                    obj4 = T2.B(obj3);
                }
                Object key = entry.getKey();
                Object value = entry.getValue();
                EnumC3200fM enumC3200fM2 = (EnumC3200fM) c4017ue.f34630u;
                int i9 = C2926aL.f29199c;
                int j12 = XK.j(8);
                EnumC3200fM enumC3200fM3 = EnumC3200fM.f30692w;
                if (enumC3200fM2 == enumC3200fM3) {
                    j12 += j12;
                }
                EnumC3255gM enumC3255gM = EnumC3255gM.f30995n;
                switch (enumC3200fM2.ordinal()) {
                    case 0:
                        c4 = '?';
                        ((Double) key).getClass();
                        k6 = 8;
                        int i10 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j13 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                            j13 += j13;
                        }
                        switch (enumC3200fM.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                k9 = 8;
                                int i11 = k9 + j13 + i10;
                                QK qk = SK.f27529u;
                                byte[] bArr = new byte[i11];
                                VK vk = new VK(bArr, i11);
                                try {
                                    C4115wL.a(vk, c4017ue, entry.getKey(), entry.getValue());
                                    vk.l();
                                    QK qk2 = new QK(bArr);
                                    t22.getClass();
                                    ((XL) obj4).d((i4 << 3) | 2, qk2);
                                    it.remove();
                                    break;
                                } catch (IOException e6) {
                                    throw new RuntimeException(e6);
                                }
                            case 1:
                                ((Float) value).getClass();
                                k9 = 4;
                                int i112 = k9 + j13 + i10;
                                QK qk3 = SK.f27529u;
                                byte[] bArr2 = new byte[i112];
                                VK vk2 = new VK(bArr2, i112);
                                C4115wL.a(vk2, c4017ue, entry.getKey(), entry.getValue());
                                vk2.l();
                                QK qk22 = new QK(bArr2);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk22);
                                it.remove();
                                break;
                            case 2:
                                k9 = XK.k(((Long) value).longValue());
                                int i1122 = k9 + j13 + i10;
                                QK qk32 = SK.f27529u;
                                byte[] bArr22 = new byte[i1122];
                                VK vk22 = new VK(bArr22, i1122);
                                C4115wL.a(vk22, c4017ue, entry.getKey(), entry.getValue());
                                vk22.l();
                                QK qk222 = new QK(bArr22);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk222);
                                it.remove();
                                break;
                            case 3:
                                k9 = XK.k(((Long) value).longValue());
                                int i11222 = k9 + j13 + i10;
                                QK qk322 = SK.f27529u;
                                byte[] bArr222 = new byte[i11222];
                                VK vk222 = new VK(bArr222, i11222);
                                C4115wL.a(vk222, c4017ue, entry.getKey(), entry.getValue());
                                vk222.l();
                                QK qk2222 = new QK(bArr222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk2222);
                                it.remove();
                                break;
                            case 4:
                                k9 = XK.k(((Integer) value).intValue());
                                int i112222 = k9 + j13 + i10;
                                QK qk3222 = SK.f27529u;
                                byte[] bArr2222 = new byte[i112222];
                                VK vk2222 = new VK(bArr2222, i112222);
                                C4115wL.a(vk2222, c4017ue, entry.getKey(), entry.getValue());
                                vk2222.l();
                                QK qk22222 = new QK(bArr2222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk22222);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                k9 = 8;
                                int i1122222 = k9 + j13 + i10;
                                QK qk32222 = SK.f27529u;
                                byte[] bArr22222 = new byte[i1122222];
                                VK vk22222 = new VK(bArr22222, i1122222);
                                C4115wL.a(vk22222, c4017ue, entry.getKey(), entry.getValue());
                                vk22222.l();
                                QK qk222222 = new QK(bArr22222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk222222);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                k9 = 4;
                                int i11222222 = k9 + j13 + i10;
                                QK qk322222 = SK.f27529u;
                                byte[] bArr222222 = new byte[i11222222];
                                VK vk222222 = new VK(bArr222222, i11222222);
                                C4115wL.a(vk222222, c4017ue, entry.getKey(), entry.getValue());
                                vk222222.l();
                                QK qk2222222 = new QK(bArr222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk2222222);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                k9 = 1;
                                int i112222222 = k9 + j13 + i10;
                                QK qk3222222 = SK.f27529u;
                                byte[] bArr2222222 = new byte[i112222222];
                                VK vk2222222 = new VK(bArr2222222, i112222222);
                                C4115wL.a(vk2222222, c4017ue, entry.getKey(), entry.getValue());
                                vk2222222.l();
                                QK qk22222222 = new QK(bArr2222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk22222222);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof SK) {
                                    b10 = ((SK) value).f();
                                    j10 = XK.j(b10);
                                } else {
                                    b10 = AbstractC3145eM.b((String) value);
                                    j10 = XK.j(b10);
                                }
                                k9 = j10 + b10;
                                int i1122222222 = k9 + j13 + i10;
                                QK qk32222222 = SK.f27529u;
                                byte[] bArr22222222 = new byte[i1122222222];
                                VK vk22222222 = new VK(bArr22222222, i1122222222);
                                C4115wL.a(vk22222222, c4017ue, entry.getKey(), entry.getValue());
                                vk22222222.l();
                                QK qk222222222 = new QK(bArr22222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk222222222);
                                it.remove();
                                break;
                            case 9:
                                k9 = ((AbstractC3199fL) ((IK) value)).d(null);
                                int i11222222222 = k9 + j13 + i10;
                                QK qk322222222 = SK.f27529u;
                                byte[] bArr222222222 = new byte[i11222222222];
                                VK vk222222222 = new VK(bArr222222222, i11222222222);
                                C4115wL.a(vk222222222, c4017ue, entry.getKey(), entry.getValue());
                                vk222222222.l();
                                QK qk2222222222 = new QK(bArr222222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk2222222222);
                                it.remove();
                                break;
                            case 10:
                                if (!(value instanceof AbstractC3738pL)) {
                                    b10 = ((AbstractC3199fL) ((IK) value)).d(null);
                                    j10 = XK.j(b10);
                                    k9 = j10 + b10;
                                    int i112222222222 = k9 + j13 + i10;
                                    QK qk3222222222 = SK.f27529u;
                                    byte[] bArr2222222222 = new byte[i112222222222];
                                    VK vk2222222222 = new VK(bArr2222222222, i112222222222);
                                    C4115wL.a(vk2222222222, c4017ue, entry.getKey(), entry.getValue());
                                    vk2222222222.l();
                                    QK qk22222222222 = new QK(bArr2222222222);
                                    t22.getClass();
                                    ((XL) obj4).d((i4 << 3) | 2, qk22222222222);
                                    it.remove();
                                    break;
                                } else {
                                    ((AbstractC3738pL) value).getClass();
                                    throw null;
                                }
                            case 11:
                                if (value instanceof SK) {
                                    b10 = ((SK) value).f();
                                    j10 = XK.j(b10);
                                } else {
                                    b10 = ((byte[]) value).length;
                                    j10 = XK.j(b10);
                                }
                                k9 = j10 + b10;
                                int i1122222222222 = k9 + j13 + i10;
                                QK qk32222222222 = SK.f27529u;
                                byte[] bArr22222222222 = new byte[i1122222222222];
                                VK vk22222222222 = new VK(bArr22222222222, i1122222222222);
                                C4115wL.a(vk22222222222, c4017ue, entry.getKey(), entry.getValue());
                                vk22222222222.l();
                                QK qk222222222222 = new QK(bArr22222222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk222222222222);
                                it.remove();
                                break;
                            case 12:
                                k9 = XK.j(((Integer) value).intValue());
                                int i11222222222222 = k9 + j13 + i10;
                                QK qk322222222222 = SK.f27529u;
                                byte[] bArr222222222222 = new byte[i11222222222222];
                                VK vk222222222222 = new VK(bArr222222222222, i11222222222222);
                                C4115wL.a(vk222222222222, c4017ue, entry.getKey(), entry.getValue());
                                vk222222222222.l();
                                QK qk2222222222222 = new QK(bArr222222222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk2222222222222);
                                it.remove();
                                break;
                            case 13:
                                k9 = value instanceof InterfaceC3308hL ? XK.k(((InterfaceC3308hL) value).a()) : XK.k(((Integer) value).intValue());
                                int i112222222222222 = k9 + j13 + i10;
                                QK qk3222222222222 = SK.f27529u;
                                byte[] bArr2222222222222 = new byte[i112222222222222];
                                VK vk2222222222222 = new VK(bArr2222222222222, i112222222222222);
                                C4115wL.a(vk2222222222222, c4017ue, entry.getKey(), entry.getValue());
                                vk2222222222222.l();
                                QK qk22222222222222 = new QK(bArr2222222222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk22222222222222);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                k9 = 4;
                                int i1122222222222222 = k9 + j13 + i10;
                                QK qk32222222222222 = SK.f27529u;
                                byte[] bArr22222222222222 = new byte[i1122222222222222];
                                VK vk22222222222222 = new VK(bArr22222222222222, i1122222222222222);
                                C4115wL.a(vk22222222222222, c4017ue, entry.getKey(), entry.getValue());
                                vk22222222222222.l();
                                QK qk222222222222222 = new QK(bArr22222222222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk222222222222222);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                k9 = 8;
                                int i11222222222222222 = k9 + j13 + i10;
                                QK qk322222222222222 = SK.f27529u;
                                byte[] bArr222222222222222 = new byte[i11222222222222222];
                                VK vk222222222222222 = new VK(bArr222222222222222, i11222222222222222);
                                C4115wL.a(vk222222222222222, c4017ue, entry.getKey(), entry.getValue());
                                vk222222222222222.l();
                                QK qk2222222222222222 = new QK(bArr222222222222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk2222222222222222);
                                it.remove();
                                break;
                            case 16:
                                int intValue = ((Integer) value).intValue();
                                k9 = XK.j((intValue >> 31) ^ (intValue + intValue));
                                int i112222222222222222 = k9 + j13 + i10;
                                QK qk3222222222222222 = SK.f27529u;
                                byte[] bArr2222222222222222 = new byte[i112222222222222222];
                                VK vk2222222222222222 = new VK(bArr2222222222222222, i112222222222222222);
                                C4115wL.a(vk2222222222222222, c4017ue, entry.getKey(), entry.getValue());
                                vk2222222222222222.l();
                                QK qk22222222222222222 = new QK(bArr2222222222222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk22222222222222222);
                                it.remove();
                                break;
                            case 17:
                                long longValue = ((Long) value).longValue();
                                k9 = XK.k((longValue >> c4) ^ (longValue + longValue));
                                int i1122222222222222222 = k9 + j13 + i10;
                                QK qk32222222222222222 = SK.f27529u;
                                byte[] bArr22222222222222222 = new byte[i1122222222222222222];
                                VK vk22222222222222222 = new VK(bArr22222222222222222, i1122222222222222222);
                                C4115wL.a(vk22222222222222222, c4017ue, entry.getKey(), entry.getValue());
                                vk22222222222222222.l();
                                QK qk222222222222222222 = new QK(bArr22222222222222222);
                                t22.getClass();
                                ((XL) obj4).d((i4 << 3) | 2, qk222222222222222222);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    case 1:
                        c4 = '?';
                        ((Float) key).getClass();
                        k6 = 4;
                        int i102 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j132 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 2:
                        c4 = '?';
                        k6 = XK.k(((Long) key).longValue());
                        int i1022 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j1322 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 3:
                        c4 = '?';
                        k6 = XK.k(((Long) key).longValue());
                        int i10222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j13222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 4:
                        c4 = '?';
                        k6 = XK.k(((Integer) key).intValue());
                        int i102222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j132222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 5:
                        c4 = '?';
                        ((Long) key).getClass();
                        k6 = 8;
                        int i1022222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j1322222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 6:
                        c4 = '?';
                        ((Integer) key).getClass();
                        k6 = 4;
                        int i10222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j13222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 7:
                        c4 = '?';
                        ((Boolean) key).getClass();
                        k6 = 1;
                        int i102222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j132222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 8:
                        c4 = '?';
                        if (key instanceof SK) {
                            b9 = ((SK) key).f();
                            j9 = XK.j(b9);
                        } else {
                            b9 = AbstractC3145eM.b((String) key);
                            j9 = XK.j(b9);
                        }
                        k6 = b9 + j9;
                        int i1022222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j1322222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 9:
                        c4 = '?';
                        k6 = ((AbstractC3199fL) ((IK) key)).d(null);
                        int i10222222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j13222222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 10:
                        c4 = '?';
                        if (key instanceof AbstractC3738pL) {
                            ((AbstractC3738pL) key).getClass();
                            throw null;
                        }
                        b9 = ((AbstractC3199fL) ((IK) key)).d(null);
                        j9 = XK.j(b9);
                        k6 = b9 + j9;
                        int i102222222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j132222222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 11:
                        c4 = '?';
                        if (key instanceof SK) {
                            b9 = ((SK) key).f();
                            j9 = XK.j(b9);
                        } else {
                            b9 = ((byte[]) key).length;
                            j9 = XK.j(b9);
                        }
                        k6 = b9 + j9;
                        int i1022222222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j1322222222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 12:
                        c4 = '?';
                        k6 = XK.j(((Integer) key).intValue());
                        int i10222222222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j13222222222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 13:
                        if (key instanceof InterfaceC3308hL) {
                            c4 = '?';
                            k6 = XK.k(((InterfaceC3308hL) key).a());
                        } else {
                            c4 = '?';
                            k6 = XK.k(((Integer) key).intValue());
                        }
                        int i102222222222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j132222222222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 14:
                        ((Integer) key).getClass();
                        c4 = '?';
                        k6 = 4;
                        int i1022222222222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j1322222222222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 15:
                        ((Long) key).getClass();
                        c4 = '?';
                        k6 = 8;
                        int i10222222222222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j13222222222222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 16:
                        int intValue2 = ((Integer) key).intValue();
                        k6 = XK.j((intValue2 >> 31) ^ (intValue2 + intValue2));
                        c4 = '?';
                        int i102222222222222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j132222222222222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    case 17:
                        long longValue2 = ((Long) key).longValue();
                        k6 = XK.k((longValue2 + longValue2) ^ (longValue2 >> 63));
                        c4 = '?';
                        int i1022222222222222222 = k6 + j12;
                        enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                        int j1322222222222222222 = XK.j(16);
                        if (enumC3200fM == enumC3200fM3) {
                        }
                        switch (enumC3200fM.ordinal()) {
                        }
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
        return obj4;
    }

    public final void L(int i, C4201y c4201y, Object obj) {
        long j9 = i & 1048575;
        if ((536870912 & i) != 0) {
            c4201y.u(2);
            AbstractC3036cM.k(j9, obj, ((S7.b) c4201y.f35295w).w());
        } else if (!this.f24432f) {
            AbstractC3036cM.k(j9, obj, c4201y.D());
        } else {
            c4201y.u(2);
            AbstractC3036cM.k(j9, obj, ((S7.b) c4201y.f35295w).v());
        }
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final AbstractC3199fL a() {
        return ((AbstractC3199fL) this.f24431e).p();
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final int b(AbstractC3199fL abstractC3199fL) {
        int i;
        long doubleToLongBits;
        int i4;
        int floatToIntBits;
        int i9;
        int i10;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f24427a.length; i12 += 3) {
            int k6 = k(i12);
            int l9 = l(k6);
            if (l9 <= 50 || l9 >= 69) {
                long j9 = k6 & 1048575;
                int i13 = 37;
                switch (l9) {
                    case 0:
                        i = i11 * 53;
                        doubleToLongBits = Double.doubleToLongBits(AbstractC3036cM.f29698c.a0(j9, abstractC3199fL));
                        byte[] bArr = AbstractC3684oL.f33136a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 1:
                        i4 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(AbstractC3036cM.f29698c.X(j9, abstractC3199fL));
                        i11 = i4 + floatToIntBits;
                        break;
                    case 2:
                        i = i11 * 53;
                        doubleToLongBits = AbstractC3036cM.h(j9, abstractC3199fL);
                        byte[] bArr2 = AbstractC3684oL.f33136a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 3:
                        i = i11 * 53;
                        doubleToLongBits = AbstractC3036cM.h(j9, abstractC3199fL);
                        byte[] bArr3 = AbstractC3684oL.f33136a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 4:
                        i4 = i11 * 53;
                        floatToIntBits = AbstractC3036cM.f(j9, abstractC3199fL);
                        i11 = i4 + floatToIntBits;
                        break;
                    case 5:
                        i = i11 * 53;
                        doubleToLongBits = AbstractC3036cM.h(j9, abstractC3199fL);
                        byte[] bArr4 = AbstractC3684oL.f33136a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 6:
                        i4 = i11 * 53;
                        floatToIntBits = AbstractC3036cM.f(j9, abstractC3199fL);
                        i11 = i4 + floatToIntBits;
                        break;
                    case 7:
                        i = i11 * 53;
                        boolean R8 = AbstractC3036cM.f29698c.R(j9, abstractC3199fL);
                        byte[] bArr5 = AbstractC3684oL.f33136a;
                        i9 = R8 ? 1231 : 1237;
                        i11 = i + i9;
                        break;
                    case 8:
                        i4 = i11 * 53;
                        floatToIntBits = ((String) AbstractC3036cM.j(j9, abstractC3199fL)).hashCode();
                        i11 = i4 + floatToIntBits;
                        break;
                    case 9:
                        i10 = i11 * 53;
                        Object j10 = AbstractC3036cM.j(j9, abstractC3199fL);
                        if (j10 != null) {
                            i13 = j10.hashCode();
                        }
                        i11 = i10 + i13;
                        break;
                    case 10:
                        i4 = i11 * 53;
                        floatToIntBits = AbstractC3036cM.j(j9, abstractC3199fL).hashCode();
                        i11 = i4 + floatToIntBits;
                        break;
                    case 11:
                        i4 = i11 * 53;
                        floatToIntBits = AbstractC3036cM.f(j9, abstractC3199fL);
                        i11 = i4 + floatToIntBits;
                        break;
                    case 12:
                        i4 = i11 * 53;
                        floatToIntBits = AbstractC3036cM.f(j9, abstractC3199fL);
                        i11 = i4 + floatToIntBits;
                        break;
                    case 13:
                        i4 = i11 * 53;
                        floatToIntBits = AbstractC3036cM.f(j9, abstractC3199fL);
                        i11 = i4 + floatToIntBits;
                        break;
                    case 14:
                        i = i11 * 53;
                        doubleToLongBits = AbstractC3036cM.h(j9, abstractC3199fL);
                        byte[] bArr6 = AbstractC3684oL.f33136a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 15:
                        i4 = i11 * 53;
                        floatToIntBits = AbstractC3036cM.f(j9, abstractC3199fL);
                        i11 = i4 + floatToIntBits;
                        break;
                    case 16:
                        i = i11 * 53;
                        doubleToLongBits = AbstractC3036cM.h(j9, abstractC3199fL);
                        byte[] bArr7 = AbstractC3684oL.f33136a;
                        i9 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i + i9;
                        break;
                    case 17:
                        i10 = i11 * 53;
                        Object j11 = AbstractC3036cM.j(j9, abstractC3199fL);
                        if (j11 != null) {
                            i13 = j11.hashCode();
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
                    case com.anythink.basead.b.b.j.f5963M /* 38 */:
                    case 39:
                    case com.anythink.basead.b.b.j.f5965O /* 40 */:
                    case 41:
                    case 42:
                    case com.anythink.basead.b.b.j.f5968R /* 43 */:
                    case com.anythink.basead.b.b.j.f5969S /* 44 */:
                    case com.anythink.basead.b.b.j.f5970T /* 45 */:
                    case 46:
                    case 47:
                    case com.anythink.basead.b.b.j.f5973W /* 48 */:
                    case com.anythink.basead.b.b.j.f5974X /* 49 */:
                        i4 = i11 * 53;
                        floatToIntBits = AbstractC3036cM.j(j9, abstractC3199fL).hashCode();
                        i11 = i4 + floatToIntBits;
                        break;
                    case 50:
                        i4 = i11 * 53;
                        floatToIntBits = AbstractC3036cM.j(j9, abstractC3199fL).hashCode();
                        i11 = i4 + floatToIntBits;
                        break;
                }
            }
        }
        int i14 = this.i;
        while (true) {
            int[] iArr = this.f24433g;
            if (i14 >= iArr.length) {
                return abstractC3199fL.zzt.hashCode() + (i11 * 53);
            }
            if (!u(0, iArr[i14], abstractC3199fL)) {
                i11 = AbstractC3036cM.j(k(r3) & 1048575, abstractC3199fL).hashCode() + (i11 * 53);
            }
            i14++;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r2v1 java.lang.Object), method size: 2310
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.OL
    public final void c(java.lang.Object r22, com.google.android.gms.internal.ads.C4201y r23, com.google.android.gms.internal.ads.YK r24) {
        /*
            Method dump skipped, instructions count: 2310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DL.c(java.lang.Object, com.google.android.gms.internal.ads.y, com.google.android.gms.internal.ads.YK):void");
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final void d(Object obj, byte[] bArr, int i, int i4, LK lk) {
        y(obj, bArr, i, i4, 0, lk);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.OL
    public final void e(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f24427a;
            if (i >= iArr.length) {
                PL.d(obj, obj2);
                return;
            }
            int k6 = k(i);
            int i4 = 1048575 & k6;
            int l9 = l(k6);
            int i9 = iArr[i];
            long j9 = i4;
            switch (l9) {
                case 0:
                    if (s(i, obj2)) {
                        AbstractC2982bM abstractC2982bM = AbstractC3036cM.f29698c;
                        obj3 = obj;
                        abstractC2982bM.k1(obj3, j9, abstractC2982bM.a0(j9, obj2));
                        t(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (s(i, obj2)) {
                        AbstractC2982bM abstractC2982bM2 = AbstractC3036cM.f29698c;
                        abstractC2982bM2.Y(obj, j9, abstractC2982bM2.X(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i, obj2)) {
                        AbstractC3036cM.i(obj, j9, AbstractC3036cM.h(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i, obj2)) {
                        AbstractC3036cM.i(obj, j9, AbstractC3036cM.h(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i, obj2)) {
                        AbstractC3036cM.g(AbstractC3036cM.f(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i, obj2)) {
                        AbstractC3036cM.i(obj, j9, AbstractC3036cM.h(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i, obj2)) {
                        AbstractC3036cM.g(AbstractC3036cM.f(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i, obj2)) {
                        AbstractC2982bM abstractC2982bM3 = AbstractC3036cM.f29698c;
                        abstractC2982bM3.W(obj, j9, abstractC2982bM3.R(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i, obj2)) {
                        AbstractC3036cM.k(j9, obj, AbstractC3036cM.j(j9, obj2));
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
                        AbstractC3036cM.k(j9, obj, AbstractC3036cM.j(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (s(i, obj2)) {
                        AbstractC3036cM.g(AbstractC3036cM.f(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i, obj2)) {
                        AbstractC3036cM.g(AbstractC3036cM.f(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i, obj2)) {
                        AbstractC3036cM.g(AbstractC3036cM.f(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i, obj2)) {
                        AbstractC3036cM.i(obj, j9, AbstractC3036cM.h(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i, obj2)) {
                        AbstractC3036cM.g(AbstractC3036cM.f(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i, obj2)) {
                        AbstractC3036cM.i(obj, j9, AbstractC3036cM.h(j9, obj2));
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
                case com.anythink.basead.b.b.j.f5963M /* 38 */:
                case 39:
                case com.anythink.basead.b.b.j.f5965O /* 40 */:
                case 41:
                case 42:
                case com.anythink.basead.b.b.j.f5968R /* 43 */:
                case com.anythink.basead.b.b.j.f5969S /* 44 */:
                case com.anythink.basead.b.b.j.f5970T /* 45 */:
                case 46:
                case 47:
                case com.anythink.basead.b.b.j.f5973W /* 48 */:
                case com.anythink.basead.b.b.j.f5974X /* 49 */:
                    InterfaceC3630nL interfaceC3630nL = (InterfaceC3630nL) AbstractC3036cM.j(j9, obj);
                    InterfaceC3630nL interfaceC3630nL2 = (InterfaceC3630nL) AbstractC3036cM.j(j9, obj2);
                    int size = interfaceC3630nL.size();
                    int size2 = interfaceC3630nL2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((JK) interfaceC3630nL).f25759n) {
                            interfaceC3630nL = interfaceC3630nL.A(size2 + size);
                        }
                        interfaceC3630nL.addAll(interfaceC3630nL2);
                    }
                    if (size > 0) {
                        interfaceC3630nL2 = interfaceC3630nL;
                    }
                    AbstractC3036cM.k(j9, obj, interfaceC3630nL2);
                    obj3 = obj;
                    break;
                case 50:
                    T2 t22 = PL.f26905a;
                    AbstractC3036cM.k(j9, obj, C3307hK.g(AbstractC3036cM.j(j9, obj), AbstractC3036cM.j(j9, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                case 54:
                case 55:
                case p.a.f19837e /* 56 */:
                case 57:
                case 58:
                case j.v.f12748n /* 59 */:
                    if (u(i9, i, obj2)) {
                        AbstractC3036cM.k(j9, obj, AbstractC3036cM.j(j9, obj2));
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
                case j.v.f12733G /* 65 */:
                case 66:
                case j.v.f12739d /* 67 */:
                    if (u(i9, i, obj2)) {
                        AbstractC3036cM.k(j9, obj, AbstractC3036cM.j(j9, obj2));
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

    @Override // com.google.android.gms.internal.ads.OL
    public final boolean f(Object obj) {
        int i;
        int i4;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i9 < this.f24434h) {
            int i12 = this.f24433g[i9];
            int k6 = k(i12);
            int[] iArr = this.f24427a;
            int i13 = iArr[i12 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i11) {
                if (i14 != 1048575) {
                    i10 = f24426l.getInt(obj, i14);
                }
                i4 = i10;
                i = i14;
            } else {
                i = i11;
                i4 = i10;
            }
            Object obj2 = obj;
            if ((268435456 & k6) == 0 || r(obj2, i12, i, i4, i15)) {
                int l9 = l(k6);
                if (l9 == 9 || l9 == 17) {
                    if (r(obj2, i12, i, i4, i15) && !D(i12).f(AbstractC3036cM.j(k6 & 1048575, obj2))) {
                    }
                    i9++;
                    obj = obj2;
                    i11 = i;
                    i10 = i4;
                } else {
                    if (l9 != 27) {
                        if (l9 == 60 || l9 == 68) {
                            if (u(iArr[i12], i12, obj2) && !D(i12).f(AbstractC3036cM.j(k6 & 1048575, obj2))) {
                            }
                            i9++;
                            obj = obj2;
                            i11 = i;
                            i10 = i4;
                        } else if (l9 != 49) {
                            if (l9 != 50) {
                                continue;
                            } else {
                                C4169xL c4169xL = (C4169xL) AbstractC3036cM.j(k6 & 1048575, obj2);
                                if (!c4169xL.isEmpty() && ((EnumC3200fM) ((C4115wL) E(i12)).f34975a.f34631v).f30695n == EnumC3255gM.f30993B) {
                                    OL ol = null;
                                    for (Object obj3 : c4169xL.values()) {
                                        if (ol == null) {
                                            ol = IL.f25547c.a(obj3.getClass());
                                        }
                                        if (!ol.f(obj3)) {
                                        }
                                    }
                                }
                            }
                            i9++;
                            obj = obj2;
                            i11 = i;
                            i10 = i4;
                        }
                    }
                    List list = (List) AbstractC3036cM.j(k6 & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        OL D8 = D(i12);
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            if (D8.f(list.get(i16))) {
                            }
                        }
                    }
                    i9++;
                    obj = obj2;
                    i11 = i;
                    i10 = i4;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.OL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(AbstractC3199fL abstractC3199fL, AbstractC3199fL abstractC3199fL2) {
        boolean c4;
        int i = 0;
        while (true) {
            int[] iArr = this.f24427a;
            if (i < iArr.length) {
                int k6 = k(i);
                int l9 = l(k6);
                if (l9 <= 50 || l9 >= 69) {
                    long j9 = k6 & 1048575;
                    switch (l9) {
                        case 0:
                            if (!q(abstractC3199fL, abstractC3199fL2, i)) {
                                break;
                            } else {
                                AbstractC2982bM abstractC2982bM = AbstractC3036cM.f29698c;
                                if (Double.doubleToLongBits(abstractC2982bM.a0(j9, abstractC3199fL)) != Double.doubleToLongBits(abstractC2982bM.a0(j9, abstractC3199fL2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 1:
                            if (!q(abstractC3199fL, abstractC3199fL2, i)) {
                                break;
                            } else {
                                AbstractC2982bM abstractC2982bM2 = AbstractC3036cM.f29698c;
                                if (Float.floatToIntBits(abstractC2982bM2.X(j9, abstractC3199fL)) != Float.floatToIntBits(abstractC2982bM2.X(j9, abstractC3199fL2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 2:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.h(j9, abstractC3199fL) == AbstractC3036cM.h(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 3:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.h(j9, abstractC3199fL) == AbstractC3036cM.h(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 4:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.f(j9, abstractC3199fL) == AbstractC3036cM.f(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 5:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.h(j9, abstractC3199fL) == AbstractC3036cM.h(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 6:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.f(j9, abstractC3199fL) == AbstractC3036cM.f(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 7:
                            if (!q(abstractC3199fL, abstractC3199fL2, i)) {
                                break;
                            } else {
                                AbstractC2982bM abstractC2982bM3 = AbstractC3036cM.f29698c;
                                if (abstractC2982bM3.R(j9, abstractC3199fL) != abstractC2982bM3.R(j9, abstractC3199fL2)) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 8:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && PL.c(AbstractC3036cM.j(j9, abstractC3199fL), AbstractC3036cM.j(j9, abstractC3199fL2))) {
                                break;
                            }
                            break;
                        case 9:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && PL.c(AbstractC3036cM.j(j9, abstractC3199fL), AbstractC3036cM.j(j9, abstractC3199fL2))) {
                                break;
                            }
                            break;
                        case 10:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && PL.c(AbstractC3036cM.j(j9, abstractC3199fL), AbstractC3036cM.j(j9, abstractC3199fL2))) {
                                break;
                            }
                            break;
                        case 11:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.f(j9, abstractC3199fL) == AbstractC3036cM.f(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 12:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.f(j9, abstractC3199fL) == AbstractC3036cM.f(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 13:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.f(j9, abstractC3199fL) == AbstractC3036cM.f(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 14:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.h(j9, abstractC3199fL) == AbstractC3036cM.h(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 15:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.f(j9, abstractC3199fL) == AbstractC3036cM.f(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 16:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && AbstractC3036cM.h(j9, abstractC3199fL) == AbstractC3036cM.h(j9, abstractC3199fL2)) {
                                break;
                            }
                            break;
                        case 17:
                            if (q(abstractC3199fL, abstractC3199fL2, i) && PL.c(AbstractC3036cM.j(j9, abstractC3199fL), AbstractC3036cM.j(j9, abstractC3199fL2))) {
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
                        case com.anythink.basead.b.b.j.f5963M /* 38 */:
                        case 39:
                        case com.anythink.basead.b.b.j.f5965O /* 40 */:
                        case 41:
                        case 42:
                        case com.anythink.basead.b.b.j.f5968R /* 43 */:
                        case com.anythink.basead.b.b.j.f5969S /* 44 */:
                        case com.anythink.basead.b.b.j.f5970T /* 45 */:
                        case 46:
                        case 47:
                        case com.anythink.basead.b.b.j.f5973W /* 48 */:
                        case com.anythink.basead.b.b.j.f5974X /* 49 */:
                            c4 = PL.c(AbstractC3036cM.j(j9, abstractC3199fL), AbstractC3036cM.j(j9, abstractC3199fL2));
                            if (!c4) {
                                break;
                            } else {
                                break;
                            }
                        case 50:
                            c4 = PL.c(AbstractC3036cM.j(j9, abstractC3199fL), AbstractC3036cM.j(j9, abstractC3199fL2));
                            if (!c4) {
                            }
                            break;
                        case 51:
                        case 52:
                        case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                        case 54:
                        case 55:
                        case p.a.f19837e /* 56 */:
                        case 57:
                        case 58:
                        case j.v.f12748n /* 59 */:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case j.v.f12733G /* 65 */:
                        case 66:
                        case j.v.f12739d /* 67 */:
                        case 68:
                            long j10 = iArr[i + 2] & 1048575;
                            if (AbstractC3036cM.f(j10, abstractC3199fL) == AbstractC3036cM.f(j10, abstractC3199fL2) && PL.c(AbstractC3036cM.j(j9, abstractC3199fL), AbstractC3036cM.j(j9, abstractC3199fL2))) {
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
                    int[] iArr2 = this.f24433g;
                    if (i4 < iArr2.length) {
                        int i9 = iArr2[i4];
                        long j11 = iArr[i9 + 2] & 1048575;
                        if (AbstractC3036cM.f(j11, abstractC3199fL) == AbstractC3036cM.f(j11, abstractC3199fL2)) {
                            if (!u(0, i9, abstractC3199fL)) {
                                long k9 = k(i9) & 1048575;
                                if (!PL.c(AbstractC3036cM.j(k9, abstractC3199fL), AbstractC3036cM.j(k9, abstractC3199fL2))) {
                                }
                            }
                            i4++;
                        }
                    } else if (abstractC3199fL.zzt.equals(abstractC3199fL2.zzt)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final void h(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof AbstractC3199fL) {
            AbstractC3199fL abstractC3199fL = (AbstractC3199fL) obj;
            abstractC3199fL.g(Integer.MAX_VALUE);
            abstractC3199fL.zzq = 0;
            abstractC3199fL.i();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f24427a;
            if (i >= iArr.length) {
                this.f24435j.getClass();
                XL xl = ((AbstractC3199fL) obj).zzt;
                if (xl.f28638e) {
                    xl.f28638e = false;
                    return;
                }
                return;
            }
            int k6 = k(i);
            int i4 = 1048575 & k6;
            int l9 = l(k6);
            long j9 = i4;
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
                        case com.anythink.basead.b.b.j.f5963M /* 38 */:
                        case 39:
                        case com.anythink.basead.b.b.j.f5965O /* 40 */:
                        case 41:
                        case 42:
                        case com.anythink.basead.b.b.j.f5968R /* 43 */:
                        case com.anythink.basead.b.b.j.f5969S /* 44 */:
                        case com.anythink.basead.b.b.j.f5970T /* 45 */:
                        case 46:
                        case 47:
                        case com.anythink.basead.b.b.j.f5973W /* 48 */:
                        case com.anythink.basead.b.b.j.f5974X /* 49 */:
                            JK jk = (JK) ((InterfaceC3630nL) AbstractC3036cM.j(j9, obj));
                            if (!jk.f25759n) {
                                break;
                            } else {
                                jk.f25759n = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = f24426l;
                            Object object = unsafe.getObject(obj, j9);
                            if (object == null) {
                                break;
                            } else {
                                ((C4169xL) object).f35142n = false;
                                unsafe.putObject(obj, j9, object);
                                break;
                            }
                    }
                } else if (u(iArr[i], i, obj)) {
                    D(i).h(f24426l.getObject(obj, j9));
                }
                i += 3;
            }
            if (s(i, obj)) {
                D(i).h(f24426l.getObject(obj, j9));
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b3  */
    @Override // com.google.android.gms.internal.ads.OL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(AbstractC3199fL abstractC3199fL) {
        int i;
        int i4;
        int j9;
        int k6;
        int j10;
        int k9;
        int i9;
        int i10;
        int b9;
        int i11;
        int i12;
        int j11;
        int size;
        int u7;
        int j12;
        int j13;
        int j14;
        int i13;
        Iterator it;
        C4115wL c4115wL;
        int k10;
        int b10;
        int j15;
        int d2;
        int j16;
        EnumC3200fM enumC3200fM;
        int k11;
        int b11;
        int j17;
        int length;
        int j18;
        int j19;
        int k12;
        DL dl = this;
        AbstractC3199fL abstractC3199fL2 = abstractC3199fL;
        int i14 = 1;
        Unsafe unsafe = f24426l;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int[] iArr = dl.f24427a;
            if (i17 >= iArr.length) {
                return abstractC3199fL2.zzt.c() + i19;
            }
            int k13 = dl.k(i17);
            int l9 = l(k13);
            int i20 = iArr[i17];
            int i21 = iArr[i17 + 2];
            int i22 = i21 & i15;
            if (l9 <= 17) {
                if (i22 != i16) {
                    i18 = i22 == i15 ? 0 : unsafe.getInt(abstractC3199fL2, i22);
                    i16 = i22;
                }
                i = i14 << (i21 >>> 20);
            } else {
                i = 0;
            }
            int i23 = k13 & i15;
            if (l9 >= EnumC2981bL.f29477u.f29481n) {
                EnumC2981bL.f29478v.getClass();
            }
            long j20 = i23;
            int i24 = 8;
            int i25 = 4;
            switch (l9) {
                case 0:
                    i4 = 1;
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 8, i19);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 1:
                    i4 = 1;
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 4, i19);
                    }
                    abstractC3199fL2 = abstractC3199fL;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 2:
                    i4 = 1;
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        long j21 = unsafe.getLong(abstractC3199fL2, j20);
                        j9 = XK.j(i20 << 3);
                        k6 = XK.k(j21);
                        i19 += k6 + j9;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    } else {
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                case 3:
                    i4 = 1;
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        long j22 = unsafe.getLong(abstractC3199fL2, j20);
                        j9 = XK.j(i20 << 3);
                        k6 = XK.k(j22);
                        i19 += k6 + j9;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    } else {
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                case 4:
                    i4 = 1;
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        long j23 = unsafe.getInt(abstractC3199fL2, j20);
                        j9 = XK.j(i20 << 3);
                        k6 = XK.k(j23);
                        i19 += k6 + j9;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    } else {
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                case 5:
                    i4 = 1;
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 8, i19);
                    }
                    abstractC3199fL2 = abstractC3199fL;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 6:
                    i4 = 1;
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 4, i19);
                    }
                    abstractC3199fL2 = abstractC3199fL;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 7:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        i4 = 1;
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 1, i19);
                    } else {
                        i4 = 1;
                    }
                    abstractC3199fL2 = abstractC3199fL;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 8:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        int i26 = i20 << 3;
                        Object object = unsafe.getObject(abstractC3199fL2, j20);
                        if (object instanceof SK) {
                            int j24 = XK.j(i26);
                            int f6 = ((SK) object).f();
                            i19 = CL.d(f6, f6, j24, i19);
                        } else {
                            int j25 = XK.j(i26);
                            int b12 = AbstractC3145eM.b((String) object);
                            i19 = CL.d(b12, b12, j25, i19);
                        }
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 9:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        Object object2 = unsafe.getObject(abstractC3199fL2, j20);
                        OL D8 = dl.D(i17);
                        T2 t22 = PL.f26905a;
                        int j26 = XK.j(i20 << 3);
                        int d3 = ((IK) object2).d(D8);
                        i19 = CL.d(d3, d3, j26, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 10:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        SK sk = (SK) unsafe.getObject(abstractC3199fL2, j20);
                        int j27 = XK.j(i20 << 3);
                        int f9 = sk.f();
                        i19 = CL.d(f9, f9, j27, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 11:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.b.c.i.f(unsafe.getInt(abstractC3199fL2, j20), XK.j(i20 << 3), i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 12:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        long j28 = unsafe.getInt(abstractC3199fL2, j20);
                        j10 = XK.j(i20 << 3);
                        k9 = XK.k(j28);
                        i9 = k9 + j10;
                        i19 += i9;
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 13:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 4, i19);
                    }
                    abstractC3199fL2 = abstractC3199fL;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 14:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 8, i19);
                    }
                    abstractC3199fL2 = abstractC3199fL;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 15:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        int i27 = unsafe.getInt(abstractC3199fL2, j20);
                        i19 = com.anythink.basead.b.c.i.f((i27 >> 31) ^ (i27 + i27), XK.j(i20 << 3), i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 16:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        long j29 = unsafe.getLong(abstractC3199fL2, j20);
                        j10 = XK.j(i20 << 3);
                        k9 = XK.k((j29 >> 63) ^ (j29 + j29));
                        i9 = k9 + j10;
                        i19 += i9;
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 17:
                    if (dl.r(abstractC3199fL2, i17, i16, i18, i)) {
                        IK ik = (IK) unsafe.getObject(abstractC3199fL2, j20);
                        OL D9 = dl.D(i17);
                        T2 t23 = PL.f26905a;
                        int j30 = XK.j(i20 << 3);
                        i9 = ik.d(D9) + j30 + j30;
                        i19 += i9;
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 18:
                    i10 = i16;
                    b9 = PL.b(i20, (List) unsafe.getObject(abstractC3199fL2, j20));
                    i19 += b9;
                    i16 = i10;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 19:
                    i10 = i16;
                    b9 = PL.a(i20, (List) unsafe.getObject(abstractC3199fL2, j20));
                    i19 += b9;
                    i16 = i10;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 20:
                    i11 = i16;
                    i12 = i18;
                    List list = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t24 = PL.f26905a;
                    if (list.size() != 0) {
                        j11 = (XK.j(i20 << 3) * list.size()) + PL.t(list);
                        i19 += j11;
                        i16 = i11;
                        i18 = i12;
                        i4 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                    j11 = 0;
                    i19 += j11;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 21:
                    i11 = i16;
                    i12 = i18;
                    List list2 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t25 = PL.f26905a;
                    size = list2.size();
                    if (size != 0) {
                        u7 = PL.u(list2);
                        j12 = XK.j(i20 << 3);
                        j13 = (j12 * size) + u7;
                        i19 += j13;
                        i16 = i11;
                        i18 = i12;
                        i4 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                    j13 = 0;
                    i19 += j13;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 22:
                    i11 = i16;
                    i12 = i18;
                    List list3 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t26 = PL.f26905a;
                    size = list3.size();
                    if (size != 0) {
                        u7 = PL.x(list3);
                        j12 = XK.j(i20 << 3);
                        j13 = (j12 * size) + u7;
                        i19 += j13;
                        i16 = i11;
                        i18 = i12;
                        i4 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                    j13 = 0;
                    i19 += j13;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 23:
                    i10 = i16;
                    b9 = PL.b(i20, (List) unsafe.getObject(abstractC3199fL2, j20));
                    i19 += b9;
                    i16 = i10;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 24:
                    i10 = i16;
                    b9 = PL.a(i20, (List) unsafe.getObject(abstractC3199fL2, j20));
                    i19 += b9;
                    i16 = i10;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 25:
                    i11 = i16;
                    i12 = i18;
                    List list4 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t27 = PL.f26905a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        j11 = (XK.j(i20 << 3) + 1) * size2;
                        i19 += j11;
                        i16 = i11;
                        i18 = i12;
                        i4 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                    j11 = 0;
                    i19 += j11;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 26:
                    i11 = i16;
                    i12 = i18;
                    List list5 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t28 = PL.f26905a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        j13 = XK.j(i20 << 3) * size3;
                        for (int i28 = 0; i28 < size3; i28++) {
                            Object obj = list5.get(i28);
                            if (obj instanceof SK) {
                                int f10 = ((SK) obj).f();
                                j13 = com.anythink.basead.b.c.i.f(f10, f10, j13);
                            } else {
                                int b13 = AbstractC3145eM.b((String) obj);
                                j13 = com.anythink.basead.b.c.i.f(b13, b13, j13);
                            }
                        }
                        i19 += j13;
                        i16 = i11;
                        i18 = i12;
                        i4 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                    j13 = 0;
                    i19 += j13;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 27:
                    i11 = i16;
                    i12 = i18;
                    List list6 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    OL D10 = dl.D(i17);
                    T2 t29 = PL.f26905a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        j14 = 0;
                    } else {
                        j14 = XK.j(i20 << 3) * size4;
                        for (int i29 = 0; i29 < size4; i29++) {
                            int d9 = ((IK) list6.get(i29)).d(D10);
                            j14 = com.anythink.basead.b.c.i.f(d9, d9, j14);
                        }
                    }
                    i19 += j14;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 28:
                    i11 = i16;
                    i12 = i18;
                    List list7 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t210 = PL.f26905a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        j13 = XK.j(i20 << 3) * size5;
                        for (int i30 = 0; i30 < list7.size(); i30++) {
                            int f11 = ((SK) list7.get(i30)).f();
                            j13 = com.anythink.basead.b.c.i.f(f11, f11, j13);
                        }
                        i19 += j13;
                        i16 = i11;
                        i18 = i12;
                        i4 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                    j13 = 0;
                    i19 += j13;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 29:
                    i11 = i16;
                    i12 = i18;
                    List list8 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t211 = PL.f26905a;
                    size = list8.size();
                    if (size != 0) {
                        u7 = PL.y(list8);
                        j12 = XK.j(i20 << 3);
                        j13 = (j12 * size) + u7;
                        i19 += j13;
                        i16 = i11;
                        i18 = i12;
                        i4 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                    j13 = 0;
                    i19 += j13;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 30:
                    i11 = i16;
                    i12 = i18;
                    List list9 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t212 = PL.f26905a;
                    size = list9.size();
                    if (size != 0) {
                        u7 = PL.w(list9);
                        j12 = XK.j(i20 << 3);
                        j13 = (j12 * size) + u7;
                        i19 += j13;
                        i16 = i11;
                        i18 = i12;
                        i4 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                    j13 = 0;
                    i19 += j13;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 31:
                    i10 = i16;
                    b9 = PL.a(i20, (List) unsafe.getObject(abstractC3199fL2, j20));
                    i19 += b9;
                    i16 = i10;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 32:
                    i10 = i16;
                    b9 = PL.b(i20, (List) unsafe.getObject(abstractC3199fL2, j20));
                    i19 += b9;
                    i16 = i10;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 33:
                    i11 = i16;
                    i12 = i18;
                    List list10 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t213 = PL.f26905a;
                    size = list10.size();
                    if (size != 0) {
                        u7 = PL.z(list10);
                        j12 = XK.j(i20 << 3);
                        j13 = (j12 * size) + u7;
                        i19 += j13;
                        i16 = i11;
                        i18 = i12;
                        i4 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                    j13 = 0;
                    i19 += j13;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 34:
                    i11 = i16;
                    i12 = i18;
                    List list11 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t214 = PL.f26905a;
                    size = list11.size();
                    if (size != 0) {
                        u7 = PL.v(list11);
                        j12 = XK.j(i20 << 3);
                        j13 = (j12 * size) + u7;
                        i19 += j13;
                        i16 = i11;
                        i18 = i12;
                        i4 = 1;
                        i17 += 3;
                        i15 = 1048575;
                        dl = this;
                        i14 = i4;
                    }
                    j13 = 0;
                    i19 += j13;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 35:
                    i11 = i16;
                    i12 = i18;
                    List list12 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t215 = PL.f26905a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i19 = CL.d(size6, XK.j(i20 << 3), size6, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 36:
                    i11 = i16;
                    i12 = i18;
                    List list13 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t216 = PL.f26905a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i19 = CL.d(size7, XK.j(i20 << 3), size7, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 37:
                    i11 = i16;
                    i12 = i18;
                    int t9 = PL.t((List) unsafe.getObject(abstractC3199fL2, j20));
                    if (t9 > 0) {
                        i19 = CL.d(t9, XK.j(i20 << 3), t9, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case com.anythink.basead.b.b.j.f5963M /* 38 */:
                    i11 = i16;
                    i12 = i18;
                    int u9 = PL.u((List) unsafe.getObject(abstractC3199fL2, j20));
                    if (u9 > 0) {
                        i19 = CL.d(u9, XK.j(i20 << 3), u9, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 39:
                    i11 = i16;
                    i12 = i18;
                    int x3 = PL.x((List) unsafe.getObject(abstractC3199fL2, j20));
                    if (x3 > 0) {
                        i19 = CL.d(x3, XK.j(i20 << 3), x3, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case com.anythink.basead.b.b.j.f5965O /* 40 */:
                    i11 = i16;
                    i12 = i18;
                    List list14 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t217 = PL.f26905a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i19 = CL.d(size8, XK.j(i20 << 3), size8, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 41:
                    i11 = i16;
                    i12 = i18;
                    List list15 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t218 = PL.f26905a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i19 = CL.d(size9, XK.j(i20 << 3), size9, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 42:
                    i11 = i16;
                    i12 = i18;
                    List list16 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t219 = PL.f26905a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i19 = CL.d(size10, XK.j(i20 << 3), size10, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case com.anythink.basead.b.b.j.f5968R /* 43 */:
                    i11 = i16;
                    i12 = i18;
                    int y6 = PL.y((List) unsafe.getObject(abstractC3199fL2, j20));
                    if (y6 > 0) {
                        i19 = CL.d(y6, XK.j(i20 << 3), y6, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case com.anythink.basead.b.b.j.f5969S /* 44 */:
                    i11 = i16;
                    i12 = i18;
                    int w9 = PL.w((List) unsafe.getObject(abstractC3199fL2, j20));
                    if (w9 > 0) {
                        i19 = CL.d(w9, XK.j(i20 << 3), w9, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case com.anythink.basead.b.b.j.f5970T /* 45 */:
                    i11 = i16;
                    i12 = i18;
                    List list17 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t220 = PL.f26905a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i19 = CL.d(size11, XK.j(i20 << 3), size11, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 46:
                    i11 = i16;
                    i12 = i18;
                    List list18 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    T2 t221 = PL.f26905a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i19 = CL.d(size12, XK.j(i20 << 3), size12, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 47:
                    i11 = i16;
                    i12 = i18;
                    int z8 = PL.z((List) unsafe.getObject(abstractC3199fL2, j20));
                    if (z8 > 0) {
                        i19 = CL.d(z8, XK.j(i20 << 3), z8, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case com.anythink.basead.b.b.j.f5973W /* 48 */:
                    i11 = i16;
                    i12 = i18;
                    int v6 = PL.v((List) unsafe.getObject(abstractC3199fL2, j20));
                    if (v6 > 0) {
                        i19 = CL.d(v6, XK.j(i20 << 3), v6, i19);
                    }
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case com.anythink.basead.b.b.j.f5974X /* 49 */:
                    i11 = i16;
                    i12 = i18;
                    List list19 = (List) unsafe.getObject(abstractC3199fL2, j20);
                    OL D11 = dl.D(i17);
                    T2 t222 = PL.f26905a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        for (int i31 = 0; i31 < size13; i31++) {
                            IK ik2 = (IK) list19.get(i31);
                            int j31 = XK.j(i20 << 3);
                            i13 += ik2.d(D11) + j31 + j31;
                        }
                    }
                    i19 += i13;
                    i16 = i11;
                    i18 = i12;
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 50:
                    C4169xL c4169xL = (C4169xL) unsafe.getObject(abstractC3199fL2, j20);
                    C4115wL c4115wL2 = (C4115wL) dl.E(i17);
                    if (c4169xL.isEmpty()) {
                        i13 = 0;
                    } else {
                        Iterator it2 = c4169xL.entrySet().iterator();
                        i13 = 0;
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c4115wL2.getClass();
                            int j32 = XK.j(i20 << 3);
                            int i32 = i25;
                            C4017ue c4017ue = c4115wL2.f34975a;
                            int i33 = i24;
                            EnumC3200fM enumC3200fM2 = (EnumC3200fM) c4017ue.f34630u;
                            int i34 = C2926aL.f29199c;
                            int j33 = XK.j(i33);
                            int i35 = i16;
                            EnumC3200fM enumC3200fM3 = EnumC3200fM.f30692w;
                            if (enumC3200fM2 == enumC3200fM3) {
                                j33 += j33;
                            }
                            EnumC3255gM enumC3255gM = EnumC3255gM.f30995n;
                            int i36 = i18;
                            switch (enumC3200fM2.ordinal()) {
                                case 0:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    ((Double) key).getClass();
                                    k10 = i33;
                                    int i37 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j34 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                        j34 += j34;
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            k11 = i33;
                                            int i38 = k11 + j34 + i37;
                                            i13 = CL.d(i38, i38, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 1:
                                            ((Float) value).getClass();
                                            k11 = i32;
                                            int i382 = k11 + j34 + i37;
                                            i13 = CL.d(i382, i382, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 2:
                                            k11 = XK.k(((Long) value).longValue());
                                            int i3822 = k11 + j34 + i37;
                                            i13 = CL.d(i3822, i3822, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 3:
                                            k11 = XK.k(((Long) value).longValue());
                                            int i38222 = k11 + j34 + i37;
                                            i13 = CL.d(i38222, i38222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 4:
                                            k11 = XK.k(((Integer) value).intValue());
                                            int i382222 = k11 + j34 + i37;
                                            i13 = CL.d(i382222, i382222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 5:
                                            ((Long) value).getClass();
                                            k11 = i33;
                                            int i3822222 = k11 + j34 + i37;
                                            i13 = CL.d(i3822222, i3822222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 6:
                                            ((Integer) value).getClass();
                                            k11 = i32;
                                            int i38222222 = k11 + j34 + i37;
                                            i13 = CL.d(i38222222, i38222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            k11 = 1;
                                            int i382222222 = k11 + j34 + i37;
                                            i13 = CL.d(i382222222, i382222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 8:
                                            if (value instanceof SK) {
                                                b11 = ((SK) value).f();
                                                j17 = XK.j(b11);
                                            } else {
                                                b11 = AbstractC3145eM.b((String) value);
                                                j17 = XK.j(b11);
                                            }
                                            k11 = b11 + j17;
                                            int i3822222222 = k11 + j34 + i37;
                                            i13 = CL.d(i3822222222, i3822222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 9:
                                            k11 = ((AbstractC3199fL) ((IK) value)).d(null);
                                            int i38222222222 = k11 + j34 + i37;
                                            i13 = CL.d(i38222222222, i38222222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 10:
                                            if (value instanceof AbstractC3738pL) {
                                                ((AbstractC3738pL) value).getClass();
                                                throw null;
                                            }
                                            b11 = ((AbstractC3199fL) ((IK) value)).d(null);
                                            j17 = XK.j(b11);
                                            k11 = b11 + j17;
                                            int i382222222222 = k11 + j34 + i37;
                                            i13 = CL.d(i382222222222, i382222222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 11:
                                            if (value instanceof SK) {
                                                length = ((SK) value).f();
                                                j18 = XK.j(length);
                                            } else {
                                                length = ((byte[]) value).length;
                                                j18 = XK.j(length);
                                            }
                                            k11 = length + j18;
                                            int i3822222222222 = k11 + j34 + i37;
                                            i13 = CL.d(i3822222222222, i3822222222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 12:
                                            k11 = XK.j(((Integer) value).intValue());
                                            int i38222222222222 = k11 + j34 + i37;
                                            i13 = CL.d(i38222222222222, i38222222222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 13:
                                            k11 = value instanceof InterfaceC3308hL ? XK.k(((InterfaceC3308hL) value).a()) : XK.k(((Integer) value).intValue());
                                            int i382222222222222 = k11 + j34 + i37;
                                            i13 = CL.d(i382222222222222, i382222222222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 14:
                                            ((Integer) value).getClass();
                                            k11 = i32;
                                            int i3822222222222222 = k11 + j34 + i37;
                                            i13 = CL.d(i3822222222222222, i3822222222222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 15:
                                            ((Long) value).getClass();
                                            k11 = i33;
                                            int i38222222222222222 = k11 + j34 + i37;
                                            i13 = CL.d(i38222222222222222, i38222222222222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            k11 = XK.j((intValue >> 31) ^ (intValue + intValue));
                                            int i382222222222222222 = k11 + j34 + i37;
                                            i13 = CL.d(i382222222222222222, i382222222222222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            k11 = XK.k((longValue >> 63) ^ (longValue + longValue));
                                            int i3822222222222222222 = k11 + j34 + i37;
                                            i13 = CL.d(i3822222222222222222, i3822222222222222222, j32, i13);
                                            i25 = i32;
                                            i24 = i33;
                                            i16 = i35;
                                            i18 = i36;
                                            c4115wL2 = c4115wL;
                                            it2 = it;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    ((Float) key).getClass();
                                    k10 = i32;
                                    int i372 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j342 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 2:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    k10 = XK.k(((Long) key).longValue());
                                    int i3722 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j3422 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 3:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    k10 = XK.k(((Long) key).longValue());
                                    int i37222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j34222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 4:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    k10 = XK.k(((Integer) key).intValue());
                                    int i372222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j342222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 5:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    ((Long) key).getClass();
                                    k10 = i33;
                                    int i3722222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j3422222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 6:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    ((Integer) key).getClass();
                                    k10 = i32;
                                    int i37222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j34222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 7:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    ((Boolean) key).getClass();
                                    k10 = 1;
                                    int i372222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j342222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 8:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    if (key instanceof SK) {
                                        b10 = ((SK) key).f();
                                        j15 = XK.j(b10);
                                    } else {
                                        b10 = AbstractC3145eM.b((String) key);
                                        j15 = XK.j(b10);
                                    }
                                    k10 = b10 + j15;
                                    int i3722222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j3422222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 9:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    d2 = ((AbstractC3199fL) ((IK) key)).d(null);
                                    k10 = d2;
                                    int i37222222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j34222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 10:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    if (key instanceof AbstractC3738pL) {
                                        ((AbstractC3738pL) key).getClass();
                                        throw null;
                                    }
                                    int d10 = ((AbstractC3199fL) ((IK) key)).d(null);
                                    d2 = d10 + XK.j(d10);
                                    k10 = d2;
                                    int i372222222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j342222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 11:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    if (key instanceof SK) {
                                        b10 = ((SK) key).f();
                                        j15 = XK.j(b10);
                                    } else {
                                        b10 = ((byte[]) key).length;
                                        j15 = XK.j(b10);
                                    }
                                    k10 = b10 + j15;
                                    int i3722222222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j3422222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 12:
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    k10 = XK.j(((Integer) key).intValue());
                                    int i37222222222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j34222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 13:
                                    if (key instanceof InterfaceC3308hL) {
                                        it = it2;
                                        c4115wL = c4115wL2;
                                        k10 = XK.k(((InterfaceC3308hL) key).a());
                                    } else {
                                        it = it2;
                                        c4115wL = c4115wL2;
                                        k10 = XK.k(((Integer) key).intValue());
                                    }
                                    int i372222222222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j342222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    k10 = i32;
                                    int i3722222222222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j3422222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    k10 = i33;
                                    int i37222222222222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j34222222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    j16 = XK.j((intValue2 >> 31) ^ (intValue2 + intValue2));
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    k10 = j16;
                                    int i372222222222222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j342222222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    j16 = XK.k((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    it = it2;
                                    c4115wL = c4115wL2;
                                    k10 = j16;
                                    int i3722222222222222222 = k10 + j33;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j3422222222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
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
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 51:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 8, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 52:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 4, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        long p6 = p(j20, abstractC3199fL2);
                        j19 = XK.j(i20 << 3);
                        k12 = XK.k(p6);
                        i19 += k12 + j19;
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 54:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        long p9 = p(j20, abstractC3199fL2);
                        j19 = XK.j(i20 << 3);
                        k12 = XK.k(p9);
                        i19 += k12 + j19;
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 55:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        long o9 = o(j20, abstractC3199fL2);
                        j19 = XK.j(i20 << 3);
                        k12 = XK.k(o9);
                        i19 += k12 + j19;
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case p.a.f19837e /* 56 */:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 8, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 57:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 4, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 58:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 1, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case j.v.f12748n /* 59 */:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        int i39 = i20 << 3;
                        Object object3 = unsafe.getObject(abstractC3199fL2, j20);
                        if (object3 instanceof SK) {
                            int j35 = XK.j(i39);
                            int f12 = ((SK) object3).f();
                            i19 = CL.d(f12, f12, j35, i19);
                        } else {
                            int j36 = XK.j(i39);
                            int b14 = AbstractC3145eM.b((String) object3);
                            i19 = CL.d(b14, b14, j36, i19);
                        }
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 60:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        Object object4 = unsafe.getObject(abstractC3199fL2, j20);
                        OL D12 = dl.D(i17);
                        T2 t223 = PL.f26905a;
                        int j37 = XK.j(i20 << 3);
                        int d11 = ((IK) object4).d(D12);
                        i19 = CL.d(d11, d11, j37, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 61:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        SK sk2 = (SK) unsafe.getObject(abstractC3199fL2, j20);
                        int j38 = XK.j(i20 << 3);
                        int f13 = sk2.f();
                        i19 = CL.d(f13, f13, j38, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 62:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        i19 = com.anythink.basead.b.c.i.f(o(j20, abstractC3199fL2), XK.j(i20 << 3), i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 63:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        long o10 = o(j20, abstractC3199fL2);
                        j19 = XK.j(i20 << 3);
                        k12 = XK.k(o10);
                        i19 += k12 + j19;
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 64:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 4, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case j.v.f12733G /* 65 */:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        i19 = com.anythink.basead.b.c.i.f(i20 << 3, 8, i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 66:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        int o11 = o(j20, abstractC3199fL2);
                        i19 = com.anythink.basead.b.c.i.f((o11 >> 31) ^ (o11 + o11), XK.j(i20 << 3), i19);
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case j.v.f12739d /* 67 */:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        long p10 = p(j20, abstractC3199fL2);
                        j19 = XK.j(i20 << 3);
                        k12 = XK.k((p10 >> 63) ^ (p10 + p10));
                        i19 += k12 + j19;
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                case 68:
                    if (dl.u(i20, i17, abstractC3199fL2)) {
                        IK ik3 = (IK) unsafe.getObject(abstractC3199fL2, j20);
                        OL D13 = dl.D(i17);
                        T2 t224 = PL.f26905a;
                        int j39 = XK.j(i20 << 3);
                        i19 += ik3.d(D13) + j39 + j39;
                    }
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
                default:
                    i4 = 1;
                    i17 += 3;
                    i15 = 1048575;
                    dl = this;
                    i14 = i4;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c8  */
    @Override // com.google.android.gms.internal.ads.OL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Object obj, C2478Aq c2478Aq) {
        int[] iArr;
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z8;
        int i16;
        int i17;
        Iterator it;
        int k6;
        int b9;
        int j9;
        int d2;
        int j10;
        EnumC3200fM enumC3200fM;
        int k9;
        int b10;
        int j11;
        DL dl = this;
        int i18 = 3;
        int i19 = 2;
        Unsafe unsafe = f24426l;
        int i20 = 1048575;
        int i21 = 1048575;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            int[] iArr2 = dl.f24427a;
            if (i22 >= iArr2.length) {
                ((AbstractC3199fL) obj).zzt.b(c2478Aq);
                return;
            }
            int k10 = dl.k(i22);
            int l9 = l(k10);
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
            long j12 = k10 & i20;
            switch (l9) {
                case 0:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).r(i24, Double.doubleToRawLongBits(AbstractC3036cM.f29698c.a0(j12, obj)));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 1:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).p(i24, Float.floatToRawIntBits(AbstractC3036cM.f29698c.X(j12, obj)));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 2:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).q(i24, unsafe.getLong(obj, j12));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 3:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).q(i24, unsafe.getLong(obj, j12));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 4:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).n(i24, unsafe.getInt(obj, j12));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 5:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).r(i24, unsafe.getLong(obj, j12));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 6:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).p(i24, unsafe.getInt(obj, j12));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 7:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).s(i24, AbstractC3036cM.f29698c.R(j12, obj));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 8:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        Object object = unsafe.getObject(obj, j12);
                        if (object instanceof String) {
                            ((XK) c2478Aq.f23905u).t(i24, (String) object);
                        } else {
                            ((XK) c2478Aq.f23905u).u(i24, (SK) object);
                        }
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 9:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        c2478Aq.e(i24, unsafe.getObject(obj, j12), dl.D(i22));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 10:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).u(i24, (SK) unsafe.getObject(obj, j12));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 11:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).o(i24, unsafe.getInt(obj, j12));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 12:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).n(i24, unsafe.getInt(obj, j12));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 13:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).p(i24, unsafe.getInt(obj, j12));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 14:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        ((XK) c2478Aq.f23905u).r(i24, unsafe.getLong(obj, j12));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 15:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        int i27 = unsafe.getInt(obj, j12);
                        ((XK) c2478Aq.f23905u).o(i24, (i27 >> 31) ^ (i27 + i27));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 16:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        long j13 = unsafe.getLong(obj, j12);
                        ((XK) c2478Aq.f23905u).q(i24, (j13 >> 63) ^ (j13 + j13));
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 17:
                    if (dl.r(obj, i22, i21, i23, i)) {
                        Object object2 = unsafe.getObject(obj, j12);
                        OL D8 = dl.D(i22);
                        c2478Aq.getClass();
                        XK xk = (XK) c2478Aq.f23905u;
                        xk.m(i24, 3);
                        D8.j((IK) object2, c2478Aq);
                        xk.m(i24, 4);
                    }
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 18:
                    i4 = i21;
                    i9 = i23;
                    PL.f(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i4;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 19:
                    i4 = i21;
                    i9 = i23;
                    PL.g(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i4;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 20:
                    i4 = i21;
                    i9 = i23;
                    PL.h(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i4;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 21:
                    i4 = i21;
                    i9 = i23;
                    PL.i(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i4;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 22:
                    i4 = i21;
                    i9 = i23;
                    PL.m(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i4;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 23:
                    i4 = i21;
                    i9 = i23;
                    PL.k(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i4;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 24:
                    i4 = i21;
                    i9 = i23;
                    PL.p(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i4;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 25:
                    i4 = i21;
                    i9 = i23;
                    PL.s(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i4;
                    i23 = i9;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 26:
                    i10 = i21;
                    i11 = i23;
                    int i28 = iArr[i22];
                    List list = (List) unsafe.getObject(obj, j12);
                    T2 t22 = PL.f26905a;
                    if (list != null && !list.isEmpty()) {
                        c2478Aq.getClass();
                        for (int i29 = 0; i29 < list.size(); i29++) {
                            ((XK) c2478Aq.f23905u).t(i28, (String) list.get(i29));
                        }
                    }
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                    break;
                case 27:
                    i12 = i21;
                    i13 = i23;
                    int i30 = iArr[i22];
                    List list2 = (List) unsafe.getObject(obj, j12);
                    OL D9 = dl.D(i22);
                    T2 t23 = PL.f26905a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i31 = 0; i31 < list2.size(); i31++) {
                            c2478Aq.e(i30, list2.get(i31), D9);
                        }
                    }
                    i21 = i12;
                    i23 = i13;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                    break;
                case 28:
                    i12 = i21;
                    i13 = i23;
                    int i32 = iArr[i22];
                    List list3 = (List) unsafe.getObject(obj, j12);
                    T2 t24 = PL.f26905a;
                    if (list3 != null && !list3.isEmpty()) {
                        c2478Aq.getClass();
                        for (int i33 = 0; i33 < list3.size(); i33++) {
                            ((XK) c2478Aq.f23905u).u(i32, (SK) list3.get(i33));
                        }
                    }
                    i21 = i12;
                    i23 = i13;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                    break;
                case 29:
                    i14 = i21;
                    i15 = i23;
                    z8 = false;
                    PL.n(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 30:
                    i14 = i21;
                    i15 = i23;
                    z8 = false;
                    PL.r(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 31:
                    i14 = i21;
                    i15 = i23;
                    z8 = false;
                    PL.q(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 32:
                    i14 = i21;
                    i15 = i23;
                    z8 = false;
                    PL.l(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 33:
                    i14 = i21;
                    i15 = i23;
                    z8 = false;
                    PL.o(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 34:
                    i14 = i21;
                    i15 = i23;
                    z8 = false;
                    PL.j(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, false);
                    i21 = i14;
                    i23 = i15;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 35:
                    i10 = i21;
                    i11 = i23;
                    PL.f(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 36:
                    i10 = i21;
                    i11 = i23;
                    PL.g(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 37:
                    i10 = i21;
                    i11 = i23;
                    PL.h(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5963M /* 38 */:
                    i10 = i21;
                    i11 = i23;
                    PL.i(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 39:
                    i10 = i21;
                    i11 = i23;
                    PL.m(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5965O /* 40 */:
                    i10 = i21;
                    i11 = i23;
                    PL.k(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 41:
                    i10 = i21;
                    i11 = i23;
                    PL.p(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 42:
                    i10 = i21;
                    i11 = i23;
                    PL.s(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5968R /* 43 */:
                    i10 = i21;
                    i11 = i23;
                    PL.n(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5969S /* 44 */:
                    i10 = i21;
                    i11 = i23;
                    PL.r(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5970T /* 45 */:
                    i10 = i21;
                    i11 = i23;
                    PL.q(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 46:
                    i10 = i21;
                    i11 = i23;
                    PL.l(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 47:
                    i10 = i21;
                    i11 = i23;
                    PL.o(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5973W /* 48 */:
                    i10 = i21;
                    i11 = i23;
                    PL.j(iArr[i22], (List) unsafe.getObject(obj, j12), c2478Aq, true);
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.basead.b.b.j.f5974X /* 49 */:
                    i10 = i21;
                    i11 = i23;
                    int i34 = iArr[i22];
                    List list4 = (List) unsafe.getObject(obj, j12);
                    OL D10 = dl.D(i22);
                    T2 t25 = PL.f26905a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i35 = 0; i35 < list4.size(); i35++) {
                            Object obj2 = list4.get(i35);
                            c2478Aq.getClass();
                            XK xk2 = (XK) c2478Aq.f23905u;
                            xk2.m(i34, 3);
                            D10.j((IK) obj2, c2478Aq);
                            xk2.m(i34, 4);
                        }
                    }
                    i21 = i10;
                    i23 = i11;
                    i16 = 3;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j12);
                    if (object3 != null) {
                        C4017ue c4017ue = ((C4115wL) dl.E(i22)).f34975a;
                        c2478Aq.getClass();
                        Iterator it2 = ((C4169xL) object3).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            XK xk3 = (XK) c2478Aq.f23905u;
                            xk3.m(i24, i19);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            EnumC3200fM enumC3200fM2 = (EnumC3200fM) c4017ue.f34630u;
                            int i36 = C2926aL.f29199c;
                            int j14 = XK.j(8);
                            EnumC3200fM enumC3200fM3 = EnumC3200fM.f30692w;
                            if (enumC3200fM2 == enumC3200fM3) {
                                j14 += j14;
                            }
                            EnumC3255gM enumC3255gM = EnumC3255gM.f30995n;
                            int i37 = i21;
                            switch (enumC3200fM2.ordinal()) {
                                case 0:
                                    i17 = i23;
                                    it = it2;
                                    ((Double) key).getClass();
                                    k6 = 8;
                                    int i38 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j15 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                        j15 += j15;
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            k9 = 8;
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 1:
                                            ((Float) value).getClass();
                                            k9 = 4;
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 2:
                                            k9 = XK.k(((Long) value).longValue());
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 3:
                                            k9 = XK.k(((Long) value).longValue());
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 4:
                                            k9 = XK.k(((Integer) value).intValue());
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 5:
                                            ((Long) value).getClass();
                                            k9 = 8;
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 6:
                                            ((Integer) value).getClass();
                                            k9 = 4;
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            k9 = 1;
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 8:
                                            if (value instanceof SK) {
                                                b10 = ((SK) value).f();
                                                j11 = XK.j(b10);
                                            } else {
                                                b10 = AbstractC3145eM.b((String) value);
                                                j11 = XK.j(b10);
                                            }
                                            k9 = b10 + j11;
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 9:
                                            k9 = ((AbstractC3199fL) ((IK) value)).d(null);
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 10:
                                            if (value instanceof AbstractC3738pL) {
                                                ((AbstractC3738pL) value).getClass();
                                                throw null;
                                            }
                                            b10 = ((AbstractC3199fL) ((IK) value)).d(null);
                                            j11 = XK.j(b10);
                                            k9 = b10 + j11;
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 11:
                                            if (value instanceof SK) {
                                                b10 = ((SK) value).f();
                                                j11 = XK.j(b10);
                                            } else {
                                                b10 = ((byte[]) value).length;
                                                j11 = XK.j(b10);
                                            }
                                            k9 = b10 + j11;
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 12:
                                            k9 = XK.j(((Integer) value).intValue());
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 13:
                                            k9 = value instanceof InterfaceC3308hL ? XK.k(((InterfaceC3308hL) value).a()) : XK.k(((Integer) value).intValue());
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 14:
                                            ((Integer) value).getClass();
                                            k9 = 4;
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 15:
                                            ((Long) value).getClass();
                                            k9 = 8;
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            k9 = XK.j((intValue >> 31) ^ (intValue + intValue));
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
                                            i21 = i37;
                                            i23 = i17;
                                            it2 = it;
                                            i18 = 3;
                                            i19 = 2;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            k9 = XK.k((longValue + longValue) ^ (longValue >> 63));
                                            xk3.A(k9 + j15 + i38);
                                            C4115wL.a(xk3, c4017ue, entry.getKey(), entry.getValue());
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
                                    k6 = 4;
                                    int i382 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j152 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 2:
                                    i17 = i23;
                                    it = it2;
                                    k6 = XK.k(((Long) key).longValue());
                                    int i3822 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j1522 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 3:
                                    i17 = i23;
                                    it = it2;
                                    k6 = XK.k(((Long) key).longValue());
                                    int i38222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j15222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 4:
                                    i17 = i23;
                                    it = it2;
                                    k6 = XK.k(((Integer) key).intValue());
                                    int i382222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j152222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 5:
                                    i17 = i23;
                                    it = it2;
                                    ((Long) key).getClass();
                                    k6 = 8;
                                    int i3822222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j1522222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 6:
                                    i17 = i23;
                                    it = it2;
                                    ((Integer) key).getClass();
                                    k6 = 4;
                                    int i38222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j15222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 7:
                                    i17 = i23;
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    k6 = 1;
                                    int i382222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j152222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 8:
                                    i17 = i23;
                                    it = it2;
                                    if (key instanceof SK) {
                                        b9 = ((SK) key).f();
                                        j9 = XK.j(b9);
                                    } else {
                                        b9 = AbstractC3145eM.b((String) key);
                                        j9 = XK.j(b9);
                                    }
                                    k6 = b9 + j9;
                                    int i3822222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j1522222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 9:
                                    i17 = i23;
                                    it = it2;
                                    d2 = ((AbstractC3199fL) ((IK) key)).d(null);
                                    k6 = d2;
                                    int i38222222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j15222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 10:
                                    i17 = i23;
                                    it = it2;
                                    if (key instanceof AbstractC3738pL) {
                                        ((AbstractC3738pL) key).getClass();
                                        throw null;
                                    }
                                    int d3 = ((AbstractC3199fL) ((IK) key)).d(null);
                                    d2 = d3 + XK.j(d3);
                                    k6 = d2;
                                    int i382222222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j152222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 11:
                                    i17 = i23;
                                    it = it2;
                                    if (key instanceof SK) {
                                        b9 = ((SK) key).f();
                                        j9 = XK.j(b9);
                                    } else {
                                        b9 = ((byte[]) key).length;
                                        j9 = XK.j(b9);
                                    }
                                    k6 = b9 + j9;
                                    int i3822222222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j1522222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 12:
                                    i17 = i23;
                                    it = it2;
                                    k6 = XK.j(((Integer) key).intValue());
                                    int i38222222222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j15222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 13:
                                    if (key instanceof InterfaceC3308hL) {
                                        i17 = i23;
                                        it = it2;
                                        k6 = XK.k(((InterfaceC3308hL) key).a());
                                    } else {
                                        i17 = i23;
                                        it = it2;
                                        k6 = XK.k(((Integer) key).intValue());
                                    }
                                    int i382222222222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j152222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    i17 = i23;
                                    it = it2;
                                    k6 = 4;
                                    int i3822222222222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j1522222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    i17 = i23;
                                    it = it2;
                                    k6 = 8;
                                    int i38222222222222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j15222222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    j10 = XK.j((intValue2 >> 31) ^ (intValue2 + intValue2));
                                    i17 = i23;
                                    it = it2;
                                    k6 = j10;
                                    int i382222222222222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j152222222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    j10 = XK.k((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    i17 = i23;
                                    it = it2;
                                    k6 = j10;
                                    int i3822222222222222222 = k6 + j14;
                                    enumC3200fM = (EnumC3200fM) c4017ue.f34631v;
                                    int j1522222222222222222 = XK.j(16);
                                    if (enumC3200fM == enumC3200fM3) {
                                    }
                                    switch (enumC3200fM.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 51:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).r(i24, Double.doubleToRawLongBits(((Double) AbstractC3036cM.j(j12, obj)).doubleValue()));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 52:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).p(i24, Float.floatToRawIntBits(((Float) AbstractC3036cM.j(j12, obj)).floatValue()));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).q(i24, p(j12, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 54:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).q(i24, p(j12, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 55:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).n(i24, o(j12, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case p.a.f19837e /* 56 */:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).r(i24, p(j12, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 57:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).p(i24, o(j12, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 58:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).s(i24, ((Boolean) AbstractC3036cM.j(j12, obj)).booleanValue());
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case j.v.f12748n /* 59 */:
                    if (dl.u(i24, i22, obj)) {
                        Object object4 = unsafe.getObject(obj, j12);
                        if (object4 instanceof String) {
                            ((XK) c2478Aq.f23905u).t(i24, (String) object4);
                        } else {
                            ((XK) c2478Aq.f23905u).u(i24, (SK) object4);
                        }
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 60:
                    if (dl.u(i24, i22, obj)) {
                        c2478Aq.e(i24, unsafe.getObject(obj, j12), dl.D(i22));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 61:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).u(i24, (SK) unsafe.getObject(obj, j12));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 62:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).o(i24, o(j12, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 63:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).n(i24, o(j12, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 64:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).p(i24, o(j12, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case j.v.f12733G /* 65 */:
                    if (dl.u(i24, i22, obj)) {
                        ((XK) c2478Aq.f23905u).r(i24, p(j12, obj));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 66:
                    if (dl.u(i24, i22, obj)) {
                        int o9 = o(j12, obj);
                        ((XK) c2478Aq.f23905u).o(i24, (o9 >> 31) ^ (o9 + o9));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case j.v.f12739d /* 67 */:
                    if (dl.u(i24, i22, obj)) {
                        long p6 = p(j12, obj);
                        ((XK) c2478Aq.f23905u).q(i24, (p6 >> 63) ^ (p6 + p6));
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                case 68:
                    if (dl.u(i24, i22, obj)) {
                        Object object5 = unsafe.getObject(obj, j12);
                        OL D11 = dl.D(i22);
                        c2478Aq.getClass();
                        XK xk4 = (XK) c2478Aq.f23905u;
                        xk4.m(i24, i18);
                        D11.j((IK) object5, c2478Aq);
                        xk4.m(i24, 4);
                    }
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
                default:
                    i16 = i18;
                    i22 += 3;
                    dl = this;
                    i18 = i16;
                    i19 = 2;
                    i20 = 1048575;
            }
        }
    }

    public final int k(int i) {
        return this.f24427a[i + 1];
    }

    public final boolean q(AbstractC3199fL abstractC3199fL, AbstractC3199fL abstractC3199fL2, int i) {
        return s(i, abstractC3199fL) == s(i, abstractC3199fL2);
    }

    public final boolean r(Object obj, int i, int i4, int i9, int i10) {
        return i4 == 1048575 ? s(i, obj) : (i9 & i10) != 0;
    }

    public final boolean s(int i, Object obj) {
        int i4 = this.f24427a[i + 2];
        long j9 = i4 & 1048575;
        if (j9 == 1048575) {
            int k6 = k(i);
            long j10 = k6 & 1048575;
            switch (l(k6)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC3036cM.f29698c.a0(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC3036cM.f29698c.X(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC3036cM.h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC3036cM.h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC3036cM.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC3036cM.h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC3036cM.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC3036cM.f29698c.R(j10, obj);
                case 8:
                    Object j11 = AbstractC3036cM.j(j10, obj);
                    if (j11 instanceof String) {
                        if (((String) j11).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(j11 instanceof SK)) {
                            throw new IllegalArgumentException();
                        }
                        if (SK.f27529u.equals(j11)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (AbstractC3036cM.j(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (SK.f27529u.equals(AbstractC3036cM.j(j10, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (AbstractC3036cM.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC3036cM.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC3036cM.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC3036cM.h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC3036cM.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC3036cM.h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (AbstractC3036cM.j(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i4 >>> 20)) & AbstractC3036cM.f(j9, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void t(int i, Object obj) {
        int i4 = this.f24427a[i + 2];
        long j9 = 1048575 & i4;
        if (j9 == 1048575) {
            return;
        }
        AbstractC3036cM.g((1 << (i4 >>> 20)) | AbstractC3036cM.f(j9, obj), j9, obj);
    }

    public final boolean u(int i, int i4, Object obj) {
        return AbstractC3036cM.f((long) (this.f24427a[i4 + 2] & 1048575), obj) == i;
    }

    public final void v(int i, int i4, Object obj) {
        AbstractC3036cM.g(i, this.f24427a[i4 + 2] & 1048575, obj);
    }

    public final int w(int i, int i4) {
        int[] iArr = this.f24427a;
        int length = (iArr.length / 3) - 1;
        while (i4 <= length) {
            int i9 = (length + i4) >>> 1;
            int i10 = i9 * 3;
            int i11 = iArr[i10];
            if (i == i11) {
                return i10;
            }
            if (i < i11) {
                length = i9 - 1;
            } else {
                i4 = i9 + 1;
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
    public final int y(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.ads.LK r42) {
        /*
            Method dump skipped, instructions count: 3856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DL.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.LK):int");
    }
}
