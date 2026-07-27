package com.google.android.gms.internal.consent_sdk;

import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.p;
import com.google.android.gms.internal.ads.CL;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class C2 implements I2 {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f35657g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public static final Unsafe f35658h = T2.h();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f35659a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f35660b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4320c2 f35661c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f35662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35663e;

    /* renamed from: f, reason: collision with root package name */
    public final O2 f35664f;

    public C2(int[] iArr, Object[] objArr, AbstractC4320c2 abstractC4320c2, int[] iArr2, int i, O2 o22, J1 j12) {
        this.f35659a = iArr;
        this.f35660b = objArr;
        this.f35662d = iArr2;
        this.f35663e = i;
        this.f35664f = o22;
        this.f35661c = abstractC4320c2;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC4368o2) {
            return ((AbstractC4368o2) obj).e();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2 k(H2 h22, O2 o22, J1 j12) {
        int i;
        int charAt;
        int charAt2;
        int i4;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        char charAt3;
        int i12;
        char charAt4;
        int i13;
        char charAt5;
        int i14;
        char charAt6;
        int i15;
        int i16;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        int i20;
        Object[] objArr;
        int i21;
        int i22;
        int i23;
        int objectFieldOffset;
        String str;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Field q6;
        int i30;
        char charAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field q9;
        Object obj2;
        Field q10;
        int i35;
        char charAt10;
        int i36;
        char charAt11;
        int i37;
        char charAt12;
        int i38;
        char charAt13;
        if (!(h22 instanceof H2)) {
            h22.getClass();
            throw new ClassCastException();
        }
        String str2 = h22.f35689b;
        int length = str2.length();
        char c4 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i = i39 + 1;
                if (str2.charAt(i39) < 55296) {
                    break;
                }
                i39 = i;
            }
        } else {
            i = 1;
        }
        int i40 = i + 1;
        int charAt14 = str2.charAt(i);
        if (charAt14 >= 55296) {
            int i41 = charAt14 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                charAt13 = str2.charAt(i40);
                if (charAt13 < 55296) {
                    break;
                }
                i41 |= (charAt13 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            charAt14 = i41 | (charAt13 << i42);
            i40 = i38;
        }
        if (charAt14 == 0) {
            charAt = 0;
            charAt2 = 0;
            i4 = 0;
            i10 = 0;
            iArr = f35657g;
            i9 = 0;
        } else {
            int i43 = i40 + 1;
            int charAt15 = str2.charAt(i40);
            if (charAt15 >= 55296) {
                int i44 = charAt15 & 8191;
                int i45 = 13;
                while (true) {
                    i18 = i43 + 1;
                    charAt8 = str2.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i18;
                }
                charAt15 = i44 | (charAt8 << i45);
                i43 = i18;
            }
            int i46 = i43 + 1;
            int charAt16 = str2.charAt(i43);
            if (charAt16 >= 55296) {
                int i47 = charAt16 & 8191;
                int i48 = 13;
                while (true) {
                    i17 = i46 + 1;
                    charAt7 = str2.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i17;
                }
                charAt16 = i47 | (charAt7 << i48);
                i46 = i17;
            }
            int i49 = i46 + 1;
            if (str2.charAt(i46) >= 55296) {
                while (true) {
                    i16 = i49 + 1;
                    if (str2.charAt(i49) < 55296) {
                        break;
                    }
                    i49 = i16;
                }
                i49 = i16;
            }
            int i50 = i49 + 1;
            if (str2.charAt(i49) >= 55296) {
                while (true) {
                    i15 = i50 + 1;
                    if (str2.charAt(i50) < 55296) {
                        break;
                    }
                    i50 = i15;
                }
                i50 = i15;
            }
            int i51 = i50 + 1;
            charAt = str2.charAt(i50);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i14 = i51 + 1;
                    charAt6 = str2.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i14;
                }
                charAt = i52 | (charAt6 << i53);
                i51 = i14;
            }
            int i54 = i51 + 1;
            charAt2 = str2.charAt(i51);
            if (charAt2 >= 55296) {
                int i55 = charAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i13 = i54 + 1;
                    charAt5 = str2.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i13;
                }
                charAt2 = i55 | (charAt5 << i56);
                i54 = i13;
            }
            int i57 = i54 + 1;
            int charAt17 = str2.charAt(i54);
            if (charAt17 >= 55296) {
                int i58 = charAt17 & 8191;
                int i59 = 13;
                while (true) {
                    i12 = i57 + 1;
                    charAt4 = str2.charAt(i57);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i12;
                }
                charAt17 = i58 | (charAt4 << i59);
                i57 = i12;
            }
            int i60 = i57 + 1;
            int charAt18 = str2.charAt(i57);
            if (charAt18 >= 55296) {
                int i61 = charAt18 & 8191;
                int i62 = 13;
                while (true) {
                    i11 = i60 + 1;
                    charAt3 = str2.charAt(i60);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i61 |= (charAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i11;
                }
                charAt18 = i61 | (charAt3 << i62);
                i60 = i11;
            }
            int i63 = charAt18 + charAt2 + charAt17;
            i4 = charAt15 + charAt15 + charAt16;
            i9 = charAt15;
            i40 = i60;
            iArr = new int[i63];
            i10 = charAt18;
        }
        Unsafe unsafe = f35658h;
        Class<?> cls = h22.f35688a.getClass();
        int i64 = charAt2 + i10;
        int i65 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr2 = new Object[i65];
        int i66 = i10;
        int i67 = 0;
        int i68 = 0;
        while (i40 < length) {
            int i69 = i40 + 1;
            int charAt19 = str2.charAt(i40);
            if (charAt19 >= c4) {
                int i70 = charAt19 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i37 = i71 + 1;
                    charAt12 = str2.charAt(i71);
                    if (charAt12 < c4) {
                        break;
                    }
                    i70 |= (charAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i37;
                }
                charAt19 = i70 | (charAt12 << i72);
                i19 = i37;
            } else {
                i19 = i69;
            }
            int i73 = i19 + 1;
            int charAt20 = str2.charAt(i19);
            if (charAt20 >= c4) {
                int i74 = charAt20 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i36 = i75 + 1;
                    charAt11 = str2.charAt(i75);
                    if (charAt11 < c4) {
                        break;
                    }
                    i74 |= (charAt11 & 8191) << i76;
                    i76 += 13;
                    i75 = i36;
                }
                charAt20 = i74 | (charAt11 << i76);
                i20 = i36;
            } else {
                i20 = i73;
            }
            if ((charAt20 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i77 = charAt20 & com.anythink.basead.exoplayer.k.p.f8630b;
            int i78 = length;
            int i79 = charAt20 & 2048;
            Object[] objArr3 = h22.f35690c;
            if (i77 >= 51) {
                int i80 = i20 + 1;
                int charAt21 = str2.charAt(i20);
                char c9 = 55296;
                if (charAt21 >= 55296) {
                    int i81 = charAt21 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i35 = i82 + 1;
                        charAt10 = str2.charAt(i82);
                        if (charAt10 < c9) {
                            break;
                        }
                        i81 |= (charAt10 & 8191) << i83;
                        i83 += 13;
                        i82 = i35;
                        c9 = 55296;
                    }
                    charAt21 = i81 | (charAt10 << i83);
                    i32 = i35;
                } else {
                    i32 = i80;
                }
                int i84 = i32;
                int i85 = i77 - 51;
                objArr = objArr2;
                if (i85 == 9 || i85 == 17) {
                    i33 = i4 + 1;
                    int i86 = i68 / 3;
                    objArr[i86 + i86 + 1] = objArr3[i4];
                } else {
                    if (i85 == 12) {
                        if (h22.a() == 1 || i79 != 0) {
                            i33 = i4 + 1;
                            int i87 = i68 / 3;
                            objArr[i87 + i87 + 1] = objArr3[i4];
                        } else {
                            i34 = 0;
                            int i88 = charAt21 + charAt21;
                            obj = objArr3[i88];
                            int i89 = i34;
                            if (obj instanceof Field) {
                                q9 = (Field) obj;
                            } else {
                                q9 = q(cls, (String) obj);
                                objArr3[i88] = q9;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(q9);
                            int i90 = i88 + 1;
                            obj2 = objArr3[i90];
                            if (obj2 instanceof Field) {
                                q10 = (Field) obj2;
                            } else {
                                q10 = q(cls, (String) obj2);
                                objArr3[i90] = q10;
                            }
                            str = str2;
                            i28 = (int) unsafe.objectFieldOffset(q10);
                            i29 = i89;
                            i26 = i84;
                            objectFieldOffset = objectFieldOffset2;
                            i21 = charAt19;
                            i27 = 0;
                        }
                    }
                    i34 = i79;
                    int i882 = charAt21 + charAt21;
                    obj = objArr3[i882];
                    int i892 = i34;
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(q9);
                    int i902 = i882 + 1;
                    obj2 = objArr3[i902];
                    if (obj2 instanceof Field) {
                    }
                    str = str2;
                    i28 = (int) unsafe.objectFieldOffset(q10);
                    i29 = i892;
                    i26 = i84;
                    objectFieldOffset = objectFieldOffset22;
                    i21 = charAt19;
                    i27 = 0;
                }
                i4 = i33;
                i34 = i79;
                int i8822 = charAt21 + charAt21;
                obj = objArr3[i8822];
                int i8922 = i34;
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(q9);
                int i9022 = i8822 + 1;
                obj2 = objArr3[i9022];
                if (obj2 instanceof Field) {
                }
                str = str2;
                i28 = (int) unsafe.objectFieldOffset(q10);
                i29 = i8922;
                i26 = i84;
                objectFieldOffset = objectFieldOffset222;
                i21 = charAt19;
                i27 = 0;
            } else {
                objArr = objArr2;
                int i91 = i4 + 1;
                Field q11 = q(cls, (String) objArr3[i4]);
                if (i77 == 9 || i77 == 17) {
                    i21 = charAt19;
                    int i92 = i68 / 3;
                    objArr[i92 + i92 + 1] = q11.getType();
                } else {
                    if (i77 == 27) {
                        i21 = charAt19;
                        i31 = 1;
                        i4 += 2;
                    } else if (i77 == 49) {
                        i4 += 2;
                        i21 = charAt19;
                        i31 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            i21 = charAt19;
                            if (h22.a() == 1 || i79 != 0) {
                                i4 += 2;
                                int i93 = i68 / 3;
                                objArr[i93 + i93 + 1] = objArr3[i91];
                                i22 = i20;
                                i23 = i79;
                            } else {
                                i22 = i20;
                                i4 = i91;
                                i23 = 0;
                            }
                        } else if (i77 == 50) {
                            int i94 = i4 + 2;
                            int i95 = i66 + 1;
                            iArr[i66] = i68;
                            int i96 = i68 / 3;
                            int i97 = i96 + i96;
                            objArr[i97] = objArr3[i91];
                            if (i79 != 0) {
                                i4 += 3;
                                objArr[i97 + 1] = objArr3[i94];
                                i22 = i20;
                                i23 = i79;
                                i66 = i95;
                            } else {
                                i4 = i94;
                                i22 = i20;
                                i66 = i95;
                                i23 = 0;
                            }
                            i21 = charAt19;
                        } else {
                            i21 = charAt19;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(q11);
                        if ((charAt20 & 4096) != 0 || i77 > 17) {
                            str = str2;
                            int i98 = i22;
                            i24 = i23;
                            i25 = 1048575;
                            i26 = i98;
                            i27 = 0;
                        } else {
                            i26 = i22 + 1;
                            int charAt22 = str2.charAt(i22);
                            i24 = i23;
                            if (charAt22 >= 55296) {
                                int i99 = charAt22 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i30 = i26 + 1;
                                    charAt9 = str2.charAt(i26);
                                    if (charAt9 < 55296) {
                                        break;
                                    }
                                    i99 |= (charAt9 & 8191) << i100;
                                    i100 += 13;
                                    i26 = i30;
                                }
                                charAt22 = i99 | (charAt9 << i100);
                                i26 = i30;
                            }
                            int i101 = (charAt22 / 32) + i9 + i9;
                            Object obj3 = objArr3[i101];
                            str = str2;
                            if (obj3 instanceof Field) {
                                q6 = (Field) obj3;
                            } else {
                                q6 = q(cls, (String) obj3);
                                objArr3[i101] = q6;
                            }
                            i27 = charAt22 % 32;
                            i25 = (int) unsafe.objectFieldOffset(q6);
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i64] = objectFieldOffset;
                            i64++;
                        }
                        i28 = i25;
                        i29 = i24;
                    }
                    int i102 = i68 / 3;
                    objArr[i102 + i102 + i31] = objArr3[i91];
                    i22 = i20;
                    i23 = i79;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(q11);
                    if ((charAt20 & 4096) != 0) {
                    }
                    str = str2;
                    int i982 = i22;
                    i24 = i23;
                    i25 = 1048575;
                    i26 = i982;
                    i27 = 0;
                    if (i77 >= 18) {
                        iArr[i64] = objectFieldOffset;
                        i64++;
                    }
                    i28 = i25;
                    i29 = i24;
                }
                i22 = i20;
                i23 = i79;
                i4 = i91;
                objectFieldOffset = (int) unsafe.objectFieldOffset(q11);
                if ((charAt20 & 4096) != 0) {
                }
                str = str2;
                int i9822 = i22;
                i24 = i23;
                i25 = 1048575;
                i26 = i9822;
                i27 = 0;
                if (i77 >= 18) {
                }
                i28 = i25;
                i29 = i24;
            }
            int i103 = i68 + 1;
            iArr2[i68] = i21;
            int i104 = i68 + 2;
            int i105 = i28;
            iArr2[i103] = ((charAt20 & 512) != 0 ? 536870912 : 0) | ((charAt20 & 256) != 0 ? 268435456 : 0) | (i29 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | objectFieldOffset;
            i68 += 3;
            iArr2[i104] = (i27 << 20) | i105;
            i40 = i26;
            length = i78;
            str2 = str;
            objArr2 = objArr;
            c4 = 55296;
        }
        return new C2(iArr2, objArr2, h22.f35688a, iArr, i10, o22, j12);
    }

    public static int l(long j9, Object obj) {
        return ((Integer) T2.g(j9, obj)).intValue();
    }

    public static int m(int i) {
        return (i >>> 20) & com.anythink.basead.exoplayer.k.p.f8630b;
    }

    public static long o(long j9, Object obj) {
        return ((Long) T2.g(j9, obj)).longValue();
    }

    public static Field q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e6) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e6);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof AbstractC4368o2) {
            AbstractC4368o2 abstractC4368o2 = (AbstractC4368o2) obj;
            abstractC4368o2.d();
            abstractC4368o2.zza = 0;
            abstractC4368o2.k();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f35659a;
            if (i >= iArr.length) {
                this.f35664f.getClass();
                N2 n22 = ((AbstractC4368o2) obj).zzc;
                if (n22.f35745d) {
                    n22.f35745d = false;
                    return;
                }
                return;
            }
            int n9 = n(i);
            int i4 = 1048575 & n9;
            int m8 = m(n9);
            long j9 = i4;
            if (m8 != 9) {
                if (m8 != 60 && m8 != 68) {
                    switch (m8) {
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
                            AbstractC4324d2 abstractC4324d2 = (AbstractC4324d2) ((InterfaceC4379r2) T2.g(j9, obj));
                            if (!abstractC4324d2.f35827n) {
                                break;
                            } else {
                                abstractC4324d2.f35827n = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = f35658h;
                            Object object = unsafe.getObject(obj, j9);
                            if (object == null) {
                                break;
                            } else {
                                ((C4407y2) object).f35960n = false;
                                unsafe.putObject(obj, j9, object);
                                break;
                            }
                    }
                } else if (j(iArr[i], i, obj)) {
                    p(i).a(f35658h.getObject(obj, j9));
                }
                i += 3;
            }
            if (v(i, obj)) {
                p(i).a(f35658h.getObject(obj, j9));
            }
            i += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    @Override // com.google.android.gms.internal.consent_sdk.I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(AbstractC4368o2 abstractC4368o2) {
        int i;
        long doubleToLongBits;
        int i4;
        int floatToIntBits;
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f35659a;
            if (i11 >= iArr.length) {
                abstractC4368o2.zzc.getClass();
                return (i12 * 53) + 506991;
            }
            int n9 = n(i11);
            int i13 = 1048575 & n9;
            int m8 = m(n9);
            int i14 = iArr[i11];
            long j9 = i13;
            int i15 = 1237;
            int i16 = 37;
            switch (m8) {
                case 0:
                    i = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(T2.f35780c.a(j9, abstractC4368o2));
                    Charset charset = AbstractC4383s2.f35907a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i4 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(T2.f35780c.b(j9, abstractC4368o2));
                    i12 = floatToIntBits + i4;
                    break;
                case 2:
                    i = i12 * 53;
                    doubleToLongBits = T2.e(j9, abstractC4368o2);
                    Charset charset2 = AbstractC4383s2.f35907a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i12 * 53;
                    doubleToLongBits = T2.e(j9, abstractC4368o2);
                    Charset charset3 = AbstractC4383s2.f35907a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i4 = i12 * 53;
                    floatToIntBits = T2.d(j9, abstractC4368o2);
                    i12 = floatToIntBits + i4;
                    break;
                case 5:
                    i = i12 * 53;
                    doubleToLongBits = T2.e(j9, abstractC4368o2);
                    Charset charset4 = AbstractC4383s2.f35907a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i4 = i12 * 53;
                    floatToIntBits = T2.d(j9, abstractC4368o2);
                    i12 = floatToIntBits + i4;
                    break;
                case 7:
                    i9 = i12 * 53;
                    boolean g9 = T2.f35780c.g(j9, abstractC4368o2);
                    Charset charset5 = AbstractC4383s2.f35907a;
                    break;
                case 8:
                    i4 = i12 * 53;
                    floatToIntBits = ((String) T2.g(j9, abstractC4368o2)).hashCode();
                    i12 = floatToIntBits + i4;
                    break;
                case 9:
                    i10 = i12 * 53;
                    Object g10 = T2.g(j9, abstractC4368o2);
                    if (g10 != null) {
                        i16 = g10.hashCode();
                    }
                    i12 = i10 + i16;
                    break;
                case 10:
                    i4 = i12 * 53;
                    floatToIntBits = T2.g(j9, abstractC4368o2).hashCode();
                    i12 = floatToIntBits + i4;
                    break;
                case 11:
                    i4 = i12 * 53;
                    floatToIntBits = T2.d(j9, abstractC4368o2);
                    i12 = floatToIntBits + i4;
                    break;
                case 12:
                    i4 = i12 * 53;
                    floatToIntBits = T2.d(j9, abstractC4368o2);
                    i12 = floatToIntBits + i4;
                    break;
                case 13:
                    i4 = i12 * 53;
                    floatToIntBits = T2.d(j9, abstractC4368o2);
                    i12 = floatToIntBits + i4;
                    break;
                case 14:
                    i = i12 * 53;
                    doubleToLongBits = T2.e(j9, abstractC4368o2);
                    Charset charset6 = AbstractC4383s2.f35907a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i4 = i12 * 53;
                    floatToIntBits = T2.d(j9, abstractC4368o2);
                    i12 = floatToIntBits + i4;
                    break;
                case 16:
                    i = i12 * 53;
                    doubleToLongBits = T2.e(j9, abstractC4368o2);
                    Charset charset7 = AbstractC4383s2.f35907a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i10 = i12 * 53;
                    Object g11 = T2.g(j9, abstractC4368o2);
                    if (g11 != null) {
                        i16 = g11.hashCode();
                    }
                    i12 = i10 + i16;
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
                    i4 = i12 * 53;
                    floatToIntBits = T2.g(j9, abstractC4368o2).hashCode();
                    i12 = floatToIntBits + i4;
                    break;
                case 50:
                    i4 = i12 * 53;
                    floatToIntBits = T2.g(j9, abstractC4368o2).hashCode();
                    i12 = floatToIntBits + i4;
                    break;
                case 51:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) T2.g(j9, abstractC4368o2)).doubleValue());
                        Charset charset8 = AbstractC4383s2.f35907a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) T2.g(j9, abstractC4368o2)).floatValue());
                        i12 = floatToIntBits + i4;
                        break;
                    }
                case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = o(j9, abstractC4368o2);
                        Charset charset9 = AbstractC4383s2.f35907a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = o(j9, abstractC4368o2);
                        Charset charset10 = AbstractC4383s2.f35907a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = l(j9, abstractC4368o2);
                        i12 = floatToIntBits + i4;
                        break;
                    }
                case p.a.f19837e /* 56 */:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = o(j9, abstractC4368o2);
                        Charset charset11 = AbstractC4383s2.f35907a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = l(j9, abstractC4368o2);
                        i12 = floatToIntBits + i4;
                        break;
                    }
                case 58:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i9 = i12 * 53;
                        boolean booleanValue = ((Boolean) T2.g(j9, abstractC4368o2)).booleanValue();
                        Charset charset12 = AbstractC4383s2.f35907a;
                        break;
                    }
                case j.v.f12748n /* 59 */:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = ((String) T2.g(j9, abstractC4368o2)).hashCode();
                        i12 = floatToIntBits + i4;
                        break;
                    }
                case 60:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = T2.g(j9, abstractC4368o2).hashCode();
                        i12 = floatToIntBits + i4;
                        break;
                    }
                case 61:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = T2.g(j9, abstractC4368o2).hashCode();
                        i12 = floatToIntBits + i4;
                        break;
                    }
                case 62:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = l(j9, abstractC4368o2);
                        i12 = floatToIntBits + i4;
                        break;
                    }
                case 63:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = l(j9, abstractC4368o2);
                        i12 = floatToIntBits + i4;
                        break;
                    }
                case 64:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = l(j9, abstractC4368o2);
                        i12 = floatToIntBits + i4;
                        break;
                    }
                case j.v.f12733G /* 65 */:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = o(j9, abstractC4368o2);
                        Charset charset13 = AbstractC4383s2.f35907a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = l(j9, abstractC4368o2);
                        i12 = floatToIntBits + i4;
                        break;
                    }
                case j.v.f12739d /* 67 */:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = o(j9, abstractC4368o2);
                        Charset charset14 = AbstractC4383s2.f35907a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!j(i14, i11, abstractC4368o2)) {
                        break;
                    } else {
                        i4 = i12 * 53;
                        floatToIntBits = T2.g(j9, abstractC4368o2).hashCode();
                        i12 = floatToIntBits + i4;
                        break;
                    }
            }
            i11 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean c(AbstractC4368o2 abstractC4368o2, AbstractC4368o2 abstractC4368o22) {
        boolean e6;
        int i = 0;
        while (true) {
            int[] iArr = this.f35659a;
            if (i < iArr.length) {
                int n9 = n(i);
                long j9 = n9 & 1048575;
                switch (m(n9)) {
                    case 0:
                        if (!u(abstractC4368o2, abstractC4368o22, i)) {
                            break;
                        } else {
                            S2 s22 = T2.f35780c;
                            if (Double.doubleToLongBits(s22.a(j9, abstractC4368o2)) != Double.doubleToLongBits(s22.a(j9, abstractC4368o22))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!u(abstractC4368o2, abstractC4368o22, i)) {
                            break;
                        } else {
                            S2 s23 = T2.f35780c;
                            if (Float.floatToIntBits(s23.b(j9, abstractC4368o2)) != Float.floatToIntBits(s23.b(j9, abstractC4368o22))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.e(j9, abstractC4368o2) == T2.e(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.e(j9, abstractC4368o2) == T2.e(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.d(j9, abstractC4368o2) == T2.d(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.e(j9, abstractC4368o2) == T2.e(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.d(j9, abstractC4368o2) == T2.d(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!u(abstractC4368o2, abstractC4368o22, i)) {
                            break;
                        } else {
                            S2 s24 = T2.f35780c;
                            if (s24.g(j9, abstractC4368o2) != s24.g(j9, abstractC4368o22)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (u(abstractC4368o2, abstractC4368o22, i) && J2.e(T2.g(j9, abstractC4368o2), T2.g(j9, abstractC4368o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (u(abstractC4368o2, abstractC4368o22, i) && J2.e(T2.g(j9, abstractC4368o2), T2.g(j9, abstractC4368o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (u(abstractC4368o2, abstractC4368o22, i) && J2.e(T2.g(j9, abstractC4368o2), T2.g(j9, abstractC4368o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.d(j9, abstractC4368o2) == T2.d(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.d(j9, abstractC4368o2) == T2.d(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.d(j9, abstractC4368o2) == T2.d(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.e(j9, abstractC4368o2) == T2.e(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.d(j9, abstractC4368o2) == T2.d(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (u(abstractC4368o2, abstractC4368o22, i) && T2.e(j9, abstractC4368o2) == T2.e(j9, abstractC4368o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (u(abstractC4368o2, abstractC4368o22, i) && J2.e(T2.g(j9, abstractC4368o2), T2.g(j9, abstractC4368o22))) {
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
                        e6 = J2.e(T2.g(j9, abstractC4368o2), T2.g(j9, abstractC4368o22));
                        break;
                    case 50:
                        e6 = J2.e(T2.g(j9, abstractC4368o2), T2.g(j9, abstractC4368o22));
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
                        if (T2.d(j10, abstractC4368o2) == T2.d(j10, abstractC4368o22) && J2.e(T2.g(j9, abstractC4368o2), T2.g(j9, abstractC4368o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (e6) {
                    i += 3;
                }
            } else if (abstractC4368o2.zzc.equals(abstractC4368o22.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03cd  */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47, types: [int] */
    /* JADX WARN: Type inference failed for: r3v50, types: [int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v53, types: [int] */
    /* JADX WARN: Type inference failed for: r3v55, types: [int] */
    /* JADX WARN: Type inference failed for: r3v58, types: [int] */
    /* JADX WARN: Type inference failed for: r3v63, types: [int] */
    /* JADX WARN: Type inference failed for: r3v66, types: [int] */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v73, types: [int] */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v116 */
    /* JADX WARN: Type inference failed for: r4v117 */
    /* JADX WARN: Type inference failed for: r4v118 */
    /* JADX WARN: Type inference failed for: r4v119 */
    /* JADX WARN: Type inference failed for: r4v120 */
    /* JADX WARN: Type inference failed for: r4v121 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX WARN: Type inference failed for: r4v98 */
    /* JADX WARN: Type inference failed for: r4v99, types: [int] */
    @Override // com.google.android.gms.internal.consent_sdk.I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, C4399w2 c4399w2) {
        boolean z8;
        int[] iArr;
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        boolean z9;
        int i12;
        int i13;
        int i14;
        int i15;
        Iterator it;
        ?? r42;
        int d2;
        int i16;
        int i17;
        W2 w22;
        int i18;
        ?? j9;
        int d3;
        int i19;
        C2 c22 = this;
        int i20 = 2;
        int i21 = 3;
        Unsafe unsafe = f35658h;
        int i22 = 1048575;
        int i23 = 1048575;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            int[] iArr2 = c22.f35659a;
            if (i24 >= iArr2.length) {
                N2 n22 = ((AbstractC4368o2) obj).zzc;
                return;
            }
            int n9 = c22.n(i24);
            int m8 = m(n9);
            int i26 = iArr2[i24];
            if (m8 <= 17) {
                int i27 = iArr2[i24 + 2];
                z8 = true;
                int i28 = i27 & i22;
                if (i28 != i23) {
                    i25 = i28 == i22 ? 0 : unsafe.getInt(obj, i28);
                    i23 = i28;
                }
                iArr = iArr2;
                i = 1 << (i27 >>> 20);
            } else {
                z8 = true;
                iArr = iArr2;
                i = 0;
            }
            long j10 = n9 & i22;
            int i29 = i20;
            switch (m8) {
                case 0:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).t(i26, Double.doubleToRawLongBits(T2.f35780c.a(j10, obj)));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 1:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).r(i26, Float.floatToRawIntBits(T2.f35780c.b(j10, obj)));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 2:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).B(i26, unsafe.getLong(obj, j10));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 3:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).B(i26, unsafe.getLong(obj, j10));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 4:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).v(i26, unsafe.getInt(obj, j10));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 5:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).t(i26, unsafe.getLong(obj, j10));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 6:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).r(i26, unsafe.getInt(obj, j10));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 7:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        byte g9 = T2.f35780c.g(j10, obj);
                        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
                        c4344i2.l(11);
                        c4344i2.o(i26 << 3);
                        int i30 = c4344i2.f35854e;
                        c4344i2.f35852c[i30] = g9;
                        c4344i2.f35854e = i30 + 1;
                        i14 = 3;
                        i24 += 3;
                        c22 = this;
                        i20 = i29;
                        i21 = i14;
                        i22 = 1048575;
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 8:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            C4344i2 c4344i22 = (C4344i2) c4399w2.f35944u;
                            i29 = 2;
                            c4344i22.A((i26 << 3) | 2);
                            c4344i22.x((String) object);
                        } else {
                            i29 = 2;
                            C4344i2 c4344i23 = (C4344i2) c4399w2.f35944u;
                            c4344i23.A((i26 << 3) | 2);
                            c4344i23.q((C4340h2) object);
                        }
                    } else {
                        i29 = 2;
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 9:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        c4399w2.f(i26, unsafe.getObject(obj, j10), c22.p(i24));
                    }
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 10:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        C4340h2 c4340h2 = (C4340h2) unsafe.getObject(obj, j10);
                        C4344i2 c4344i24 = (C4344i2) c4399w2.f35944u;
                        c4344i24.A((i26 << 3) | 2);
                        c4344i24.q(c4340h2);
                    }
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 11:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).z(i26, unsafe.getInt(obj, j10));
                    }
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 12:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).v(i26, unsafe.getInt(obj, j10));
                    }
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 13:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).r(i26, unsafe.getInt(obj, j10));
                    }
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 14:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4344i2) c4399w2.f35944u).t(i26, unsafe.getLong(obj, j10));
                    }
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 15:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        int i31 = unsafe.getInt(obj, j10);
                        ((C4344i2) c4399w2.f35944u).z(i26, (i31 >> 31) ^ (i31 + i31));
                    }
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 16:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((C4344i2) c4399w2.f35944u).B(i26, (j11 >> 63) ^ (j11 + j11));
                    }
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 17:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        I2 p6 = c22.p(i24);
                        c4399w2.getClass();
                        C4344i2 c4344i25 = (C4344i2) c4399w2.f35944u;
                        c4344i25.y(i26, 3);
                        p6.d((AbstractC4320c2) object2, c4399w2);
                        c4344i25.y(i26, 4);
                    }
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 18:
                    i4 = i23;
                    i9 = i25;
                    J2.q(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 19:
                    i4 = i23;
                    i9 = i25;
                    J2.u(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 20:
                    i4 = i23;
                    i9 = i25;
                    J2.w(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 21:
                    i4 = i23;
                    i9 = i25;
                    J2.d(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 22:
                    i4 = i23;
                    i9 = i25;
                    J2.v(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 23:
                    i4 = i23;
                    i9 = i25;
                    J2.t(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 24:
                    i4 = i23;
                    i9 = i25;
                    J2.s(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 25:
                    i4 = i23;
                    i9 = i25;
                    J2.p(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 26:
                    i10 = i23;
                    i11 = i25;
                    int i32 = iArr[i24];
                    List list = (List) unsafe.getObject(obj, j10);
                    O2 o22 = J2.f35717a;
                    if (list != null && !list.isEmpty()) {
                        c4399w2.getClass();
                        for (int i33 = 0; i33 < list.size(); i33++) {
                            String str = (String) list.get(i33);
                            C4344i2 c4344i26 = (C4344i2) c4399w2.f35944u;
                            c4344i26.A((i32 << 3) | 2);
                            c4344i26.x(str);
                        }
                    }
                    i25 = i11;
                    i23 = i10;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                    break;
                case 27:
                    i10 = i23;
                    i11 = i25;
                    int i34 = iArr[i24];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    I2 p9 = c22.p(i24);
                    O2 o23 = J2.f35717a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i35 = 0; i35 < list2.size(); i35++) {
                            c4399w2.f(i34, list2.get(i35), p9);
                        }
                    }
                    i25 = i11;
                    i23 = i10;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                    break;
                case 28:
                    i10 = i23;
                    i11 = i25;
                    int i36 = iArr[i24];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    O2 o24 = J2.f35717a;
                    if (list3 != null && !list3.isEmpty()) {
                        c4399w2.getClass();
                        for (int i37 = 0; i37 < list3.size(); i37++) {
                            C4340h2 c4340h22 = (C4340h2) list3.get(i37);
                            C4344i2 c4344i27 = (C4344i2) c4399w2.f35944u;
                            c4344i27.A((i36 << 3) | 2);
                            c4344i27.q(c4340h22);
                        }
                    }
                    i25 = i11;
                    i23 = i10;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                    break;
                case 29:
                    i4 = i23;
                    i9 = i25;
                    z9 = false;
                    J2.c(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 30:
                    i4 = i23;
                    i9 = i25;
                    z9 = false;
                    J2.r(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 31:
                    i4 = i23;
                    i9 = i25;
                    z9 = false;
                    J2.x(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 32:
                    i4 = i23;
                    i9 = i25;
                    z9 = false;
                    J2.y(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 33:
                    i4 = i23;
                    i9 = i25;
                    z9 = false;
                    J2.a(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 34:
                    i4 = i23;
                    i9 = i25;
                    z9 = false;
                    J2.b(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, false);
                    i25 = i9;
                    i23 = i4;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 35:
                    i12 = i23;
                    i13 = i25;
                    J2.q(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 36:
                    i12 = i23;
                    i13 = i25;
                    J2.u(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 37:
                    i12 = i23;
                    i13 = i25;
                    J2.w(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5963M /* 38 */:
                    i12 = i23;
                    i13 = i25;
                    J2.d(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 39:
                    i12 = i23;
                    i13 = i25;
                    J2.v(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5965O /* 40 */:
                    i12 = i23;
                    i13 = i25;
                    J2.t(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 41:
                    i12 = i23;
                    i13 = i25;
                    J2.s(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 42:
                    i12 = i23;
                    i13 = i25;
                    J2.p(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5968R /* 43 */:
                    i12 = i23;
                    i13 = i25;
                    J2.c(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5969S /* 44 */:
                    i12 = i23;
                    i13 = i25;
                    J2.r(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5970T /* 45 */:
                    i12 = i23;
                    i13 = i25;
                    J2.x(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 46:
                    i12 = i23;
                    i13 = i25;
                    J2.y(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 47:
                    i12 = i23;
                    i13 = i25;
                    J2.a(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5973W /* 48 */:
                    i12 = i23;
                    i13 = i25;
                    J2.b(iArr[i24], (List) unsafe.getObject(obj, j10), c4399w2, z8);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5974X /* 49 */:
                    i10 = i23;
                    i11 = i25;
                    int i38 = iArr[i24];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    I2 p10 = c22.p(i24);
                    O2 o25 = J2.f35717a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i39 = 0; i39 < list4.size(); i39++) {
                            Object obj2 = list4.get(i39);
                            c4399w2.getClass();
                            C4344i2 c4344i28 = (C4344i2) c4399w2.f35944u;
                            c4344i28.y(i38, 3);
                            p10.d((AbstractC4320c2) obj2, c4399w2);
                            c4344i28.y(i38, 4);
                        }
                    }
                    i25 = i11;
                    i23 = i10;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j10);
                    if (object3 != null) {
                        int i40 = i24 / 3;
                        C4357m c4357m = ((C4403x2) c22.f35660b[i40 + i40]).f35956a;
                        c4399w2.getClass();
                        Iterator it2 = ((C4407y2) object3).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            C4344i2 c4344i29 = (C4344i2) c4399w2.f35944u;
                            c4344i29.y(i26, i29);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int i41 = C4356l2.f35876c;
                            int i42 = C4344i2.i(8);
                            W2 w23 = W2.f35793x;
                            W2 w24 = (W2) c4357m.f35879n;
                            if (w24 == w23) {
                                i42 += i42;
                            }
                            X2 x22 = X2.f35800n;
                            int i43 = i23;
                            switch (w24.ordinal()) {
                                case 0:
                                    i15 = i25;
                                    it = it2;
                                    ((Double) key).getClass();
                                    r42 = 8;
                                    int i44 = r42 + i42;
                                    int i45 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                        i45 += i45;
                                    }
                                    switch (w22.ordinal()) {
                                        case 0:
                                            i18 = i44;
                                            ((Double) value).getClass();
                                            j9 = 8;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key2);
                                            C4356l2.b(c4344i29, w22, 2, value2);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 1:
                                            i18 = i44;
                                            ((Float) value).getClass();
                                            j9 = 4;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key22 = entry.getKey();
                                            Object value22 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key22);
                                            C4356l2.b(c4344i29, w22, 2, value22);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 2:
                                            i18 = i44;
                                            j9 = C4344i2.j(((Long) value).longValue());
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key222 = entry.getKey();
                                            Object value222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key222);
                                            C4356l2.b(c4344i29, w22, 2, value222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 3:
                                            i18 = i44;
                                            j9 = C4344i2.j(((Long) value).longValue());
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key2222 = entry.getKey();
                                            Object value2222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key2222);
                                            C4356l2.b(c4344i29, w22, 2, value2222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 4:
                                            i18 = i44;
                                            j9 = C4344i2.j(((Integer) value).intValue());
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key22222 = entry.getKey();
                                            Object value22222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key22222);
                                            C4356l2.b(c4344i29, w22, 2, value22222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 5:
                                            i18 = i44;
                                            ((Long) value).getClass();
                                            j9 = 8;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key222222 = entry.getKey();
                                            Object value222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key222222);
                                            C4356l2.b(c4344i29, w22, 2, value222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 6:
                                            i18 = i44;
                                            ((Integer) value).getClass();
                                            j9 = 4;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key2222222 = entry.getKey();
                                            Object value2222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key2222222);
                                            C4356l2.b(c4344i29, w22, 2, value2222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 7:
                                            i18 = i44;
                                            ((Boolean) value).getClass();
                                            j9 = z8;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key22222222 = entry.getKey();
                                            Object value22222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key22222222);
                                            C4356l2.b(c4344i29, w22, 2, value22222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 8:
                                            i18 = i44;
                                            if (value instanceof C4340h2) {
                                                d3 = ((C4340h2) value).d();
                                                i19 = C4344i2.i(d3);
                                                j9 = d3 + i19;
                                                c4344i29.A(j9 + i45 + i18);
                                                Object key222222222 = entry.getKey();
                                                Object value222222222 = entry.getValue();
                                                C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key222222222);
                                                C4356l2.b(c4344i29, w22, 2, value222222222);
                                                i29 = 2;
                                                i25 = i15;
                                                i23 = i43;
                                                it2 = it;
                                                i21 = 3;
                                                z8 = true;
                                            } else {
                                                j9 = C4344i2.h((String) value);
                                                c4344i29.A(j9 + i45 + i18);
                                                Object key2222222222 = entry.getKey();
                                                Object value2222222222 = entry.getValue();
                                                C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key2222222222);
                                                C4356l2.b(c4344i29, w22, 2, value2222222222);
                                                i29 = 2;
                                                i25 = i15;
                                                i23 = i43;
                                                it2 = it;
                                                i21 = 3;
                                                z8 = true;
                                            }
                                        case 9:
                                            i18 = i44;
                                            j9 = ((AbstractC4320c2) value).c();
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key22222222222 = entry.getKey();
                                            Object value22222222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key22222222222);
                                            C4356l2.b(c4344i29, w22, 2, value22222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 10:
                                            i18 = i44;
                                            d3 = ((AbstractC4320c2) value).c();
                                            i19 = C4344i2.i(d3);
                                            j9 = d3 + i19;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key222222222222 = entry.getKey();
                                            Object value222222222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key222222222222);
                                            C4356l2.b(c4344i29, w22, 2, value222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 11:
                                            i18 = i44;
                                            if (value instanceof C4340h2) {
                                                d3 = ((C4340h2) value).d();
                                                i19 = C4344i2.i(d3);
                                            } else {
                                                d3 = ((byte[]) value).length;
                                                i19 = C4344i2.i(d3);
                                            }
                                            j9 = d3 + i19;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key2222222222222 = entry.getKey();
                                            Object value2222222222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key2222222222222);
                                            C4356l2.b(c4344i29, w22, 2, value2222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 12:
                                            i18 = i44;
                                            j9 = C4344i2.i(((Integer) value).intValue());
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key22222222222222 = entry.getKey();
                                            Object value22222222222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key22222222222222);
                                            C4356l2.b(c4344i29, w22, 2, value22222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 13:
                                            i18 = i44;
                                            j9 = C4344i2.j(((Integer) value).intValue());
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key222222222222222 = entry.getKey();
                                            Object value222222222222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key222222222222222);
                                            C4356l2.b(c4344i29, w22, 2, value222222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 14:
                                            ((Integer) value).getClass();
                                            i18 = i44;
                                            j9 = 4;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key2222222222222222 = entry.getKey();
                                            Object value2222222222222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key2222222222222222);
                                            C4356l2.b(c4344i29, w22, 2, value2222222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 15:
                                            ((Long) value).getClass();
                                            i18 = i44;
                                            j9 = 8;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key22222222222222222 = entry.getKey();
                                            Object value22222222222222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key22222222222222222);
                                            C4356l2.b(c4344i29, w22, 2, value22222222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            j9 = C4344i2.i((intValue >> 31) ^ (intValue + intValue));
                                            i18 = i44;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key222222222222222222 = entry.getKey();
                                            Object value222222222222222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key222222222222222222);
                                            C4356l2.b(c4344i29, w22, 2, value222222222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            j9 = C4344i2.j((longValue + longValue) ^ (longValue >> 63));
                                            i18 = i44;
                                            c4344i29.A(j9 + i45 + i18);
                                            Object key2222222222222222222 = entry.getKey();
                                            Object value2222222222222222222 = entry.getValue();
                                            C4356l2.b(c4344i29, w24, z8 ? 1 : 0, key2222222222222222222);
                                            C4356l2.b(c4344i29, w22, 2, value2222222222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z8 = true;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    i15 = i25;
                                    it = it2;
                                    ((Float) key).getClass();
                                    r42 = 4;
                                    int i442 = r42 + i42;
                                    int i452 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 2:
                                    i15 = i25;
                                    it = it2;
                                    r42 = C4344i2.j(((Long) key).longValue());
                                    int i4422 = r42 + i42;
                                    int i4522 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 3:
                                    i15 = i25;
                                    it = it2;
                                    r42 = C4344i2.j(((Long) key).longValue());
                                    int i44222 = r42 + i42;
                                    int i45222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 4:
                                    i15 = i25;
                                    it = it2;
                                    r42 = C4344i2.j(((Integer) key).intValue());
                                    int i442222 = r42 + i42;
                                    int i452222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 5:
                                    i15 = i25;
                                    it = it2;
                                    ((Long) key).getClass();
                                    r42 = 8;
                                    int i4422222 = r42 + i42;
                                    int i4522222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 6:
                                    i15 = i25;
                                    it = it2;
                                    ((Integer) key).getClass();
                                    r42 = 4;
                                    int i44222222 = r42 + i42;
                                    int i45222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 7:
                                    i15 = i25;
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    r42 = z8;
                                    int i442222222 = r42 + i42;
                                    int i452222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 8:
                                    i15 = i25;
                                    it = it2;
                                    if (key instanceof C4340h2) {
                                        d2 = ((C4340h2) key).d();
                                        i16 = C4344i2.i(d2);
                                        r42 = d2 + i16;
                                        int i4422222222 = r42 + i42;
                                        int i4522222222 = C4344i2.i(16);
                                        w22 = (W2) c4357m.f35880u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    } else {
                                        r42 = C4344i2.h((String) key);
                                        int i44222222222 = r42 + i42;
                                        int i45222222222 = C4344i2.i(16);
                                        w22 = (W2) c4357m.f35880u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    }
                                case 9:
                                    i15 = i25;
                                    it = it2;
                                    r42 = ((AbstractC4320c2) key).c();
                                    int i442222222222 = r42 + i42;
                                    int i452222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 10:
                                    i15 = i25;
                                    it = it2;
                                    d2 = ((AbstractC4320c2) key).c();
                                    i16 = C4344i2.i(d2);
                                    r42 = d2 + i16;
                                    int i4422222222222 = r42 + i42;
                                    int i4522222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 11:
                                    i15 = i25;
                                    it = it2;
                                    if (key instanceof C4340h2) {
                                        d2 = ((C4340h2) key).d();
                                        i16 = C4344i2.i(d2);
                                    } else {
                                        d2 = ((byte[]) key).length;
                                        i16 = C4344i2.i(d2);
                                    }
                                    r42 = d2 + i16;
                                    int i44222222222222 = r42 + i42;
                                    int i45222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 12:
                                    i15 = i25;
                                    it = it2;
                                    r42 = C4344i2.i(((Integer) key).intValue());
                                    int i442222222222222 = r42 + i42;
                                    int i452222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 13:
                                    i15 = i25;
                                    it = it2;
                                    r42 = C4344i2.j(((Integer) key).intValue());
                                    int i4422222222222222 = r42 + i42;
                                    int i4522222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    i15 = i25;
                                    it = it2;
                                    r42 = 4;
                                    int i44222222222222222 = r42 + i42;
                                    int i45222222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    i15 = i25;
                                    it = it2;
                                    r42 = 8;
                                    int i442222222222222222 = r42 + i42;
                                    int i452222222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    i17 = C4344i2.i((intValue2 + intValue2) ^ (intValue2 >> 31));
                                    i15 = i25;
                                    it = it2;
                                    r42 = i17;
                                    int i4422222222222222222 = r42 + i42;
                                    int i4522222222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    i17 = C4344i2.j((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    i15 = i25;
                                    it = it2;
                                    r42 = i17;
                                    int i44222222222222222222 = r42 + i42;
                                    int i45222222222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i14 = i21;
                    i29 = 2;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 51:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).t(i26, Double.doubleToRawLongBits(((Double) T2.g(j10, obj)).doubleValue()));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 52:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).r(i26, Float.floatToRawIntBits(((Float) T2.g(j10, obj)).floatValue()));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).B(i26, o(j10, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 54:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).B(i26, o(j10, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 55:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).v(i26, l(j10, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case p.a.f19837e /* 56 */:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).t(i26, o(j10, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 57:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).r(i26, l(j10, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 58:
                    if (c22.j(i26, i24, obj)) {
                        byte booleanValue = ((Boolean) T2.g(j10, obj)).booleanValue();
                        C4344i2 c4344i210 = (C4344i2) c4399w2.f35944u;
                        c4344i210.l(11);
                        c4344i210.o(i26 << 3);
                        int i46 = c4344i210.f35854e;
                        c4344i210.f35852c[i46] = booleanValue;
                        c4344i210.f35854e = i46 + 1;
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case j.v.f12748n /* 59 */:
                    if (c22.j(i26, i24, obj)) {
                        Object object4 = unsafe.getObject(obj, j10);
                        if (object4 instanceof String) {
                            C4344i2 c4344i211 = (C4344i2) c4399w2.f35944u;
                            c4344i211.A((i26 << 3) | 2);
                            c4344i211.x((String) object4);
                        } else {
                            C4344i2 c4344i212 = (C4344i2) c4399w2.f35944u;
                            c4344i212.A((i26 << 3) | 2);
                            c4344i212.q((C4340h2) object4);
                        }
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 60:
                    if (c22.j(i26, i24, obj)) {
                        c4399w2.f(i26, unsafe.getObject(obj, j10), c22.p(i24));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 61:
                    if (c22.j(i26, i24, obj)) {
                        C4340h2 c4340h23 = (C4340h2) unsafe.getObject(obj, j10);
                        C4344i2 c4344i213 = (C4344i2) c4399w2.f35944u;
                        c4344i213.A((i26 << 3) | 2);
                        c4344i213.q(c4340h23);
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 62:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).z(i26, l(j10, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 63:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).v(i26, l(j10, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 64:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).r(i26, l(j10, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case j.v.f12733G /* 65 */:
                    if (c22.j(i26, i24, obj)) {
                        ((C4344i2) c4399w2.f35944u).t(i26, o(j10, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 66:
                    if (c22.j(i26, i24, obj)) {
                        int l9 = l(j10, obj);
                        ((C4344i2) c4399w2.f35944u).z(i26, (l9 >> 31) ^ (l9 + l9));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case j.v.f12739d /* 67 */:
                    if (c22.j(i26, i24, obj)) {
                        long o9 = o(j10, obj);
                        ((C4344i2) c4399w2.f35944u).B(i26, (o9 >> 63) ^ (o9 + o9));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 68:
                    if (c22.j(i26, i24, obj)) {
                        Object object5 = unsafe.getObject(obj, j10);
                        I2 p11 = c22.p(i24);
                        c4399w2.getClass();
                        C4344i2 c4344i214 = (C4344i2) c4399w2.f35944u;
                        c4344i214.y(i26, i21);
                        p11.d((AbstractC4320c2) object5, c4399w2);
                        c4344i214.y(i26, 4);
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                default:
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void e(Object obj, Object obj2) {
        Object obj3;
        if (!h(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f35659a;
            if (i >= iArr.length) {
                J2.o(obj, obj2);
                return;
            }
            int n9 = n(i);
            int i4 = n9 & 1048575;
            int m8 = m(n9);
            int i9 = iArr[i];
            long j9 = i4;
            switch (m8) {
                case 0:
                    if (v(i, obj2)) {
                        S2 s22 = T2.f35780c;
                        obj3 = obj;
                        s22.e(obj3, j9, s22.a(j9, obj2));
                        t(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (v(i, obj2)) {
                        S2 s23 = T2.f35780c;
                        s23.f(obj, j9, s23.b(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (v(i, obj2)) {
                        T2.j(obj, j9, T2.e(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (v(i, obj2)) {
                        T2.j(obj, j9, T2.e(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (v(i, obj2)) {
                        T2.j(obj, j9, T2.e(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (v(i, obj2)) {
                        S2 s24 = T2.f35780c;
                        s24.c(obj, j9, s24.g(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (v(i, obj2)) {
                        T2.k(j9, obj, T2.g(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    r(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (v(i, obj2)) {
                        T2.k(j9, obj, T2.g(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (v(i, obj2)) {
                        T2.j(obj, j9, T2.e(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j9, obj2), j9, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (v(i, obj2)) {
                        T2.j(obj, j9, T2.e(j9, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    r(i, obj, obj2);
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
                    InterfaceC4379r2 interfaceC4379r2 = (InterfaceC4379r2) T2.g(j9, obj);
                    InterfaceC4379r2 interfaceC4379r22 = (InterfaceC4379r2) T2.g(j9, obj2);
                    int size = interfaceC4379r2.size();
                    int size2 = interfaceC4379r22.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC4324d2) interfaceC4379r2).f35827n) {
                            interfaceC4379r2 = interfaceC4379r2.b(size2 + size);
                        }
                        interfaceC4379r2.addAll(interfaceC4379r22);
                    }
                    if (size > 0) {
                        interfaceC4379r22 = interfaceC4379r2;
                    }
                    T2.k(j9, obj, interfaceC4379r22);
                    obj3 = obj;
                    break;
                case 50:
                    O2 o22 = J2.f35717a;
                    C4407y2 c4407y2 = (C4407y2) T2.g(j9, obj);
                    C4407y2 c4407y22 = (C4407y2) T2.g(j9, obj2);
                    if (!c4407y22.isEmpty()) {
                        if (!c4407y2.f35960n) {
                            if (c4407y2.isEmpty()) {
                                c4407y2 = new C4407y2();
                            } else {
                                C4407y2 c4407y23 = new C4407y2(c4407y2);
                                c4407y23.f35960n = true;
                                c4407y2 = c4407y23;
                            }
                        }
                        c4407y2.h();
                        if (!c4407y22.isEmpty()) {
                            c4407y2.putAll(c4407y22);
                        }
                    }
                    T2.k(j9, obj, c4407y2);
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
                    if (j(i9, i, obj2)) {
                        T2.k(j9, obj, T2.g(j9, obj2));
                        T2.i(i9, iArr[i + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case j.v.f12733G /* 65 */:
                case 66:
                case j.v.f12739d /* 67 */:
                    if (j(i9, i, obj2)) {
                        T2.k(j9, obj, T2.g(j9, obj2));
                        T2.i(i9, iArr[i + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    s(i, obj, obj2);
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

    /* JADX WARN: Removed duplicated region for block: B:128:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0388 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(AbstractC4368o2 abstractC4368o2) {
        int i;
        int i4;
        int i9;
        int j9;
        int i10;
        int i11;
        int i12;
        int h9;
        int i13;
        int i14;
        int h10;
        int i15;
        int i16;
        int i17;
        int i18;
        int size;
        int n9;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Iterator it;
        int j10;
        int d2;
        int i25;
        int i26;
        W2 w22;
        int j11;
        int d3;
        int i27;
        int i28;
        int j12;
        C2 c22 = this;
        AbstractC4368o2 abstractC4368o22 = abstractC4368o2;
        int i29 = 1;
        Unsafe unsafe = f35658h;
        int i30 = 1048575;
        int i31 = 1048575;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (true) {
            int[] iArr = c22.f35659a;
            if (i32 >= iArr.length) {
                N2 n22 = abstractC4368o22.zzc;
                int i35 = n22.f35744c;
                if (i35 == -1) {
                    n22.f35744c = 0;
                    i = 0;
                } else {
                    i = i35;
                }
                return i + i34;
            }
            int n10 = c22.n(i32);
            int m8 = m(n10);
            int i36 = iArr[i32];
            int i37 = iArr[i32 + 2];
            int i38 = i37 & i30;
            if (m8 <= 17) {
                if (i38 != i31) {
                    i33 = i38 == i30 ? 0 : unsafe.getInt(abstractC4368o22, i38);
                    i31 = i38;
                }
                i4 = i29 << (i37 >>> 20);
            } else {
                i4 = 0;
            }
            int i39 = n10 & i30;
            if (m8 >= EnumC4360m2.f35881u.f35885n) {
                EnumC4360m2.f35882v.getClass();
            }
            long j13 = i39;
            int i40 = 8;
            int i41 = 4;
            switch (m8) {
                case 0:
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        i34 = CL.c(i36 << 3, 8, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 1:
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        i34 = CL.c(i36 << 3, 4, i34);
                    }
                    abstractC4368o22 = abstractC4368o2;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 2:
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        long j14 = unsafe.getLong(abstractC4368o22, j13);
                        i9 = C4344i2.i(i36 << 3);
                        j9 = C4344i2.j(j14);
                        i10 = j9 + i9;
                        i34 += i10;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 3:
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        long j15 = unsafe.getLong(abstractC4368o22, j13);
                        i9 = C4344i2.i(i36 << 3);
                        j9 = C4344i2.j(j15);
                        i10 = j9 + i9;
                        i34 += i10;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 4:
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        long j16 = unsafe.getInt(abstractC4368o22, j13);
                        i9 = C4344i2.i(i36 << 3);
                        j9 = C4344i2.j(j16);
                        i10 = j9 + i9;
                        i34 += i10;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 5:
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        i34 = CL.c(i36 << 3, 8, i34);
                    }
                    abstractC4368o22 = abstractC4368o2;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 6:
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        i34 = CL.c(i36 << 3, 4, i34);
                    }
                    abstractC4368o22 = abstractC4368o2;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 7:
                    int i42 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        i29 = i42;
                        i34 = CL.c(i36 << 3, i29, i34);
                    } else {
                        i29 = i42;
                    }
                    abstractC4368o22 = abstractC4368o2;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 8:
                    i11 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        int i43 = i36 << 3;
                        Object object = unsafe.getObject(abstractC4368o22, j13);
                        if (object instanceof C4340h2) {
                            int i44 = C4344i2.i(i43);
                            int d9 = ((C4340h2) object).d();
                            i34 = CL.w(d9, d9, i44, i34);
                        } else {
                            i12 = C4344i2.i(i43);
                            h9 = C4344i2.h((String) object);
                            i13 = h9 + i12;
                            i34 += i13;
                        }
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 9:
                    i11 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        Object object2 = unsafe.getObject(abstractC4368o22, j13);
                        I2 p6 = c22.p(i32);
                        O2 o22 = J2.f35717a;
                        int i45 = C4344i2.i(i36 << 3);
                        int b9 = ((AbstractC4320c2) object2).b(p6);
                        i34 = CL.w(b9, b9, i45, i34);
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 10:
                    i11 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        C4340h2 c4340h2 = (C4340h2) unsafe.getObject(abstractC4368o22, j13);
                        int i46 = C4344i2.i(i36 << 3);
                        int d10 = c4340h2.d();
                        i34 = CL.w(d10, d10, i46, i34);
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 11:
                    i11 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        i34 = CL.c(unsafe.getInt(abstractC4368o22, j13), C4344i2.i(i36 << 3), i34);
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 12:
                    i11 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        long j17 = unsafe.getInt(abstractC4368o22, j13);
                        i12 = C4344i2.i(i36 << 3);
                        h9 = C4344i2.j(j17);
                        i13 = h9 + i12;
                        i34 += i13;
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 13:
                    i11 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        i34 = CL.c(i36 << 3, 4, i34);
                    }
                    abstractC4368o22 = abstractC4368o2;
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 14:
                    i11 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        i34 = CL.c(i36 << 3, 8, i34);
                    }
                    abstractC4368o22 = abstractC4368o2;
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 15:
                    i11 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        int i47 = unsafe.getInt(abstractC4368o22, j13);
                        i34 = CL.c((i47 >> 31) ^ (i47 + i47), C4344i2.i(i36 << 3), i34);
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 16:
                    i11 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        long j18 = unsafe.getLong(abstractC4368o22, j13);
                        i12 = C4344i2.i(i36 << 3);
                        h9 = C4344i2.j((j18 >> 63) ^ (j18 + j18));
                        i13 = h9 + i12;
                        i34 += i13;
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 17:
                    i11 = i29;
                    if (c22.w(abstractC4368o22, i32, i31, i33, i4)) {
                        AbstractC4320c2 abstractC4320c2 = (AbstractC4320c2) unsafe.getObject(abstractC4368o22, j13);
                        I2 p9 = c22.p(i32);
                        O2 o23 = J2.f35717a;
                        int i48 = C4344i2.i(i36 << 3);
                        i13 = abstractC4320c2.b(p9) + i48 + i48;
                        i34 += i13;
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 18:
                    i14 = i31;
                    h10 = J2.h(i36, (List) unsafe.getObject(abstractC4368o22, j13));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 19:
                    i14 = i31;
                    h10 = J2.g(i36, (List) unsafe.getObject(abstractC4368o22, j13));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 20:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o24 = J2.f35717a;
                    if (list.size() != 0) {
                        i18 = (C4344i2.i(i36 << 3) * list.size()) + J2.j(list);
                        i34 += i18;
                        i29 = i17;
                        i31 = i15;
                        i33 = i16;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                    i18 = 0;
                    i34 += i18;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 21:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list2 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o25 = J2.f35717a;
                    size = list2.size();
                    if (size != 0) {
                        n9 = J2.n(list2);
                        i19 = C4344i2.i(i36 << 3);
                        i20 = (i19 * size) + n9;
                        i34 += i20;
                        i29 = i17;
                        i31 = i15;
                        i33 = i16;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                    i20 = 0;
                    i34 += i20;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 22:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list3 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o26 = J2.f35717a;
                    size = list3.size();
                    if (size != 0) {
                        n9 = J2.i(list3);
                        i19 = C4344i2.i(i36 << 3);
                        i20 = (i19 * size) + n9;
                        i34 += i20;
                        i29 = i17;
                        i31 = i15;
                        i33 = i16;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                    i20 = 0;
                    i34 += i20;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 23:
                    i14 = i31;
                    h10 = J2.h(i36, (List) unsafe.getObject(abstractC4368o22, j13));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 24:
                    i14 = i31;
                    h10 = J2.g(i36, (List) unsafe.getObject(abstractC4368o22, j13));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 25:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list4 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o27 = J2.f35717a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        i18 = (C4344i2.i(i36 << 3) + 1) * size2;
                        i34 += i18;
                        i29 = i17;
                        i31 = i15;
                        i33 = i16;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                    i18 = 0;
                    i34 += i18;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 26:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list5 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o28 = J2.f35717a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        i20 = C4344i2.i(i36 << 3) * size3;
                        for (int i49 = 0; i49 < size3; i49++) {
                            Object obj = list5.get(i49);
                            if (obj instanceof C4340h2) {
                                int d11 = ((C4340h2) obj).d();
                                i20 = CL.c(d11, d11, i20);
                            } else {
                                i20 = C4344i2.h((String) obj) + i20;
                            }
                        }
                        i34 += i20;
                        i29 = i17;
                        i31 = i15;
                        i33 = i16;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                    i20 = 0;
                    i34 += i20;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 27:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list6 = (List) unsafe.getObject(abstractC4368o22, j13);
                    I2 p10 = c22.p(i32);
                    O2 o29 = J2.f35717a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        i21 = 0;
                    } else {
                        i21 = C4344i2.i(i36 << 3) * size4;
                        for (int i50 = 0; i50 < size4; i50++) {
                            int b10 = ((AbstractC4320c2) list6.get(i50)).b(p10);
                            i21 = CL.c(b10, b10, i21);
                        }
                    }
                    i34 += i21;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 28:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list7 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o210 = J2.f35717a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        i20 = C4344i2.i(i36 << 3) * size5;
                        for (int i51 = 0; i51 < list7.size(); i51++) {
                            int d12 = ((C4340h2) list7.get(i51)).d();
                            i20 = CL.c(d12, d12, i20);
                        }
                        i34 += i20;
                        i29 = i17;
                        i31 = i15;
                        i33 = i16;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                    i20 = 0;
                    i34 += i20;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 29:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list8 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o211 = J2.f35717a;
                    size = list8.size();
                    if (size != 0) {
                        n9 = J2.m(list8);
                        i19 = C4344i2.i(i36 << 3);
                        i20 = (i19 * size) + n9;
                        i34 += i20;
                        i29 = i17;
                        i31 = i15;
                        i33 = i16;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                    i20 = 0;
                    i34 += i20;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 30:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list9 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o212 = J2.f35717a;
                    size = list9.size();
                    if (size != 0) {
                        n9 = J2.f(list9);
                        i19 = C4344i2.i(i36 << 3);
                        i20 = (i19 * size) + n9;
                        i34 += i20;
                        i29 = i17;
                        i31 = i15;
                        i33 = i16;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                    i20 = 0;
                    i34 += i20;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 31:
                    i14 = i31;
                    h10 = J2.g(i36, (List) unsafe.getObject(abstractC4368o22, j13));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 32:
                    i14 = i31;
                    h10 = J2.h(i36, (List) unsafe.getObject(abstractC4368o22, j13));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 33:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list10 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o213 = J2.f35717a;
                    size = list10.size();
                    if (size != 0) {
                        n9 = J2.k(list10);
                        i19 = C4344i2.i(i36 << 3);
                        i20 = (i19 * size) + n9;
                        i34 += i20;
                        i29 = i17;
                        i31 = i15;
                        i33 = i16;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                    i20 = 0;
                    i34 += i20;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 34:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list11 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o214 = J2.f35717a;
                    size = list11.size();
                    if (size != 0) {
                        n9 = J2.l(list11);
                        i19 = C4344i2.i(i36 << 3);
                        i20 = (i19 * size) + n9;
                        i34 += i20;
                        i29 = i17;
                        i31 = i15;
                        i33 = i16;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                    i20 = 0;
                    i34 += i20;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 35:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list12 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o215 = J2.f35717a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i34 = CL.w(size6, C4344i2.i(i36 << 3), size6, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 36:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list13 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o216 = J2.f35717a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i34 = CL.w(size7, C4344i2.i(i36 << 3), size7, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 37:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int j19 = J2.j((List) unsafe.getObject(abstractC4368o22, j13));
                    if (j19 > 0) {
                        i34 = CL.w(j19, C4344i2.i(i36 << 3), j19, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5963M /* 38 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int n11 = J2.n((List) unsafe.getObject(abstractC4368o22, j13));
                    if (n11 > 0) {
                        i34 = CL.w(n11, C4344i2.i(i36 << 3), n11, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 39:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int i52 = J2.i((List) unsafe.getObject(abstractC4368o22, j13));
                    if (i52 > 0) {
                        i34 = CL.w(i52, C4344i2.i(i36 << 3), i52, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5965O /* 40 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list14 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o217 = J2.f35717a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i34 = CL.w(size8, C4344i2.i(i36 << 3), size8, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 41:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list15 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o218 = J2.f35717a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i34 = CL.w(size9, C4344i2.i(i36 << 3), size9, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 42:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list16 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o219 = J2.f35717a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i34 = CL.w(size10, C4344i2.i(i36 << 3), size10, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5968R /* 43 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int m9 = J2.m((List) unsafe.getObject(abstractC4368o22, j13));
                    if (m9 > 0) {
                        i34 = CL.w(m9, C4344i2.i(i36 << 3), m9, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5969S /* 44 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int f6 = J2.f((List) unsafe.getObject(abstractC4368o22, j13));
                    if (f6 > 0) {
                        i34 = CL.w(f6, C4344i2.i(i36 << 3), f6, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5970T /* 45 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list17 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o220 = J2.f35717a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i34 = CL.w(size11, C4344i2.i(i36 << 3), size11, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 46:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list18 = (List) unsafe.getObject(abstractC4368o22, j13);
                    O2 o221 = J2.f35717a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i34 = CL.w(size12, C4344i2.i(i36 << 3), size12, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 47:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int k6 = J2.k((List) unsafe.getObject(abstractC4368o22, j13));
                    if (k6 > 0) {
                        i34 = CL.w(k6, C4344i2.i(i36 << 3), k6, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5973W /* 48 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int l9 = J2.l((List) unsafe.getObject(abstractC4368o22, j13));
                    if (l9 > 0) {
                        i34 = CL.w(l9, C4344i2.i(i36 << 3), l9, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5974X /* 49 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list19 = (List) unsafe.getObject(abstractC4368o22, j13);
                    I2 p11 = c22.p(i32);
                    O2 o222 = J2.f35717a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i22 = 0;
                    } else {
                        i22 = 0;
                        for (int i53 = 0; i53 < size13; i53++) {
                            AbstractC4320c2 abstractC4320c22 = (AbstractC4320c2) list19.get(i53);
                            int i54 = C4344i2.i(i36 << 3);
                            i22 += abstractC4320c22.b(p11) + i54 + i54;
                        }
                    }
                    i34 += i22;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 50:
                    int i55 = i32 / 3;
                    C4407y2 c4407y2 = (C4407y2) unsafe.getObject(abstractC4368o22, j13);
                    C4403x2 c4403x2 = (C4403x2) c22.f35660b[i55 + i55];
                    if (c4407y2.isEmpty()) {
                        i23 = 0;
                    } else {
                        Iterator it2 = c4407y2.entrySet().iterator();
                        i23 = 0;
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c4403x2.getClass();
                            int i56 = i29;
                            int i57 = C4344i2.i(i36 << 3);
                            int i58 = i41;
                            C4357m c4357m = c4403x2.f35956a;
                            int i59 = C4356l2.f35876c;
                            int i60 = C4344i2.i(i40);
                            int i61 = i40;
                            W2 w23 = W2.f35793x;
                            int i62 = i31;
                            W2 w24 = (W2) c4357m.f35879n;
                            if (w24 == w23) {
                                i60 += i60;
                            }
                            X2 x22 = X2.f35800n;
                            switch (w24.ordinal()) {
                                case 0:
                                    i24 = i33;
                                    it = it2;
                                    ((Double) key).getClass();
                                    j10 = i61;
                                    int i63 = j10 + i60;
                                    int i64 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                        i64 += i64;
                                    }
                                    switch (w22.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            j11 = i61;
                                            int i65 = j11 + i64 + i63;
                                            i23 = CL.w(i65, i65, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 1:
                                            ((Float) value).getClass();
                                            j11 = i58;
                                            int i652 = j11 + i64 + i63;
                                            i23 = CL.w(i652, i652, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 2:
                                            j11 = C4344i2.j(((Long) value).longValue());
                                            int i6522 = j11 + i64 + i63;
                                            i23 = CL.w(i6522, i6522, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 3:
                                            j11 = C4344i2.j(((Long) value).longValue());
                                            int i65222 = j11 + i64 + i63;
                                            i23 = CL.w(i65222, i65222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 4:
                                            j11 = C4344i2.j(((Integer) value).intValue());
                                            int i652222 = j11 + i64 + i63;
                                            i23 = CL.w(i652222, i652222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 5:
                                            ((Long) value).getClass();
                                            j11 = i61;
                                            int i6522222 = j11 + i64 + i63;
                                            i23 = CL.w(i6522222, i6522222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 6:
                                            ((Integer) value).getClass();
                                            j11 = i58;
                                            int i65222222 = j11 + i64 + i63;
                                            i23 = CL.w(i65222222, i65222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            j11 = i56;
                                            int i652222222 = j11 + i64 + i63;
                                            i23 = CL.w(i652222222, i652222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 8:
                                            if (value instanceof C4340h2) {
                                                d3 = ((C4340h2) value).d();
                                                i27 = C4344i2.i(d3);
                                                j11 = d3 + i27;
                                                int i6522222222 = j11 + i64 + i63;
                                                i23 = CL.w(i6522222222, i6522222222, i57, i23);
                                                i41 = i58;
                                                i29 = i56;
                                                i40 = i61;
                                                i31 = i62;
                                                i33 = i24;
                                                it2 = it;
                                            } else {
                                                j11 = C4344i2.h((String) value);
                                                int i65222222222 = j11 + i64 + i63;
                                                i23 = CL.w(i65222222222, i65222222222, i57, i23);
                                                i41 = i58;
                                                i29 = i56;
                                                i40 = i61;
                                                i31 = i62;
                                                i33 = i24;
                                                it2 = it;
                                            }
                                        case 9:
                                            j11 = ((AbstractC4320c2) value).c();
                                            int i652222222222 = j11 + i64 + i63;
                                            i23 = CL.w(i652222222222, i652222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 10:
                                            d3 = ((AbstractC4320c2) value).c();
                                            i27 = C4344i2.i(d3);
                                            j11 = d3 + i27;
                                            int i6522222222222 = j11 + i64 + i63;
                                            i23 = CL.w(i6522222222222, i6522222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 11:
                                            if (value instanceof C4340h2) {
                                                d3 = ((C4340h2) value).d();
                                                i27 = C4344i2.i(d3);
                                            } else {
                                                d3 = ((byte[]) value).length;
                                                i27 = C4344i2.i(d3);
                                            }
                                            j11 = d3 + i27;
                                            int i65222222222222 = j11 + i64 + i63;
                                            i23 = CL.w(i65222222222222, i65222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 12:
                                            j11 = C4344i2.i(((Integer) value).intValue());
                                            int i652222222222222 = j11 + i64 + i63;
                                            i23 = CL.w(i652222222222222, i652222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 13:
                                            j11 = C4344i2.j(((Integer) value).intValue());
                                            int i6522222222222222 = j11 + i64 + i63;
                                            i23 = CL.w(i6522222222222222, i6522222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 14:
                                            ((Integer) value).getClass();
                                            j11 = i58;
                                            int i65222222222222222 = j11 + i64 + i63;
                                            i23 = CL.w(i65222222222222222, i65222222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 15:
                                            ((Long) value).getClass();
                                            j11 = i61;
                                            int i652222222222222222 = j11 + i64 + i63;
                                            i23 = CL.w(i652222222222222222, i652222222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            j11 = C4344i2.i((intValue >> 31) ^ (intValue + intValue));
                                            int i6522222222222222222 = j11 + i64 + i63;
                                            i23 = CL.w(i6522222222222222222, i6522222222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            j11 = C4344i2.j((longValue + longValue) ^ (longValue >> 63));
                                            int i65222222222222222222 = j11 + i64 + i63;
                                            i23 = CL.w(i65222222222222222222, i65222222222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    i24 = i33;
                                    it = it2;
                                    ((Float) key).getClass();
                                    j10 = i58;
                                    int i632 = j10 + i60;
                                    int i642 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 2:
                                    i24 = i33;
                                    it = it2;
                                    j10 = C4344i2.j(((Long) key).longValue());
                                    int i6322 = j10 + i60;
                                    int i6422 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 3:
                                    i24 = i33;
                                    it = it2;
                                    j10 = C4344i2.j(((Long) key).longValue());
                                    int i63222 = j10 + i60;
                                    int i64222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 4:
                                    i24 = i33;
                                    it = it2;
                                    j10 = C4344i2.j(((Integer) key).intValue());
                                    int i632222 = j10 + i60;
                                    int i642222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 5:
                                    i24 = i33;
                                    it = it2;
                                    ((Long) key).getClass();
                                    j10 = i61;
                                    int i6322222 = j10 + i60;
                                    int i6422222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 6:
                                    i24 = i33;
                                    it = it2;
                                    ((Integer) key).getClass();
                                    j10 = i58;
                                    int i63222222 = j10 + i60;
                                    int i64222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 7:
                                    i24 = i33;
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    j10 = i56;
                                    int i632222222 = j10 + i60;
                                    int i642222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 8:
                                    i24 = i33;
                                    it = it2;
                                    if (key instanceof C4340h2) {
                                        d2 = ((C4340h2) key).d();
                                        i25 = C4344i2.i(d2);
                                        j10 = d2 + i25;
                                        int i6322222222 = j10 + i60;
                                        int i6422222222 = C4344i2.i(16);
                                        w22 = (W2) c4357m.f35880u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    } else {
                                        j10 = C4344i2.h((String) key);
                                        int i63222222222 = j10 + i60;
                                        int i64222222222 = C4344i2.i(16);
                                        w22 = (W2) c4357m.f35880u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    }
                                case 9:
                                    i24 = i33;
                                    it = it2;
                                    j10 = ((AbstractC4320c2) key).c();
                                    int i632222222222 = j10 + i60;
                                    int i642222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 10:
                                    i24 = i33;
                                    it = it2;
                                    d2 = ((AbstractC4320c2) key).c();
                                    i25 = C4344i2.i(d2);
                                    j10 = d2 + i25;
                                    int i6322222222222 = j10 + i60;
                                    int i6422222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 11:
                                    i24 = i33;
                                    it = it2;
                                    if (key instanceof C4340h2) {
                                        d2 = ((C4340h2) key).d();
                                        i25 = C4344i2.i(d2);
                                    } else {
                                        d2 = ((byte[]) key).length;
                                        i25 = C4344i2.i(d2);
                                    }
                                    j10 = d2 + i25;
                                    int i63222222222222 = j10 + i60;
                                    int i64222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 12:
                                    i24 = i33;
                                    it = it2;
                                    j10 = C4344i2.i(((Integer) key).intValue());
                                    int i632222222222222 = j10 + i60;
                                    int i642222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 13:
                                    i24 = i33;
                                    it = it2;
                                    j10 = C4344i2.j(((Integer) key).intValue());
                                    int i6322222222222222 = j10 + i60;
                                    int i6422222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    i24 = i33;
                                    it = it2;
                                    j10 = i58;
                                    int i63222222222222222 = j10 + i60;
                                    int i64222222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    i24 = i33;
                                    it = it2;
                                    j10 = i61;
                                    int i632222222222222222 = j10 + i60;
                                    int i642222222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    i26 = C4344i2.i((intValue2 + intValue2) ^ (intValue2 >> 31));
                                    i24 = i33;
                                    it = it2;
                                    j10 = i26;
                                    int i6322222222222222222 = j10 + i60;
                                    int i6422222222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    i26 = C4344i2.j((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    i24 = i33;
                                    it = it2;
                                    j10 = i26;
                                    int i63222222222222222222 = j10 + i60;
                                    int i64222222222222222222 = C4344i2.i(16);
                                    w22 = (W2) c4357m.f35880u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    i34 += i23;
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 51:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        i34 = CL.c(i36 << 3, 8, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 52:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        i34 = CL.c(i36 << 3, 4, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        long o9 = o(j13, abstractC4368o22);
                        i28 = C4344i2.i(i36 << 3);
                        j12 = C4344i2.j(o9);
                        i34 += j12 + i28;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 54:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        long o10 = o(j13, abstractC4368o22);
                        i28 = C4344i2.i(i36 << 3);
                        j12 = C4344i2.j(o10);
                        i34 += j12 + i28;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 55:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        long l10 = l(j13, abstractC4368o22);
                        i28 = C4344i2.i(i36 << 3);
                        j12 = C4344i2.j(l10);
                        i34 += j12 + i28;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case p.a.f19837e /* 56 */:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        i34 = CL.c(i36 << 3, 8, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 57:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        i34 = CL.c(i36 << 3, 4, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 58:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        i34 = CL.c(i36 << 3, i29, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case j.v.f12748n /* 59 */:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        int i66 = i36 << 3;
                        Object object3 = unsafe.getObject(abstractC4368o22, j13);
                        if (object3 instanceof C4340h2) {
                            int i67 = C4344i2.i(i66);
                            int d13 = ((C4340h2) object3).d();
                            i34 = CL.w(d13, d13, i67, i34);
                        } else {
                            i28 = C4344i2.i(i66);
                            j12 = C4344i2.h((String) object3);
                            i34 += j12 + i28;
                        }
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 60:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        Object object4 = unsafe.getObject(abstractC4368o22, j13);
                        I2 p12 = c22.p(i32);
                        O2 o223 = J2.f35717a;
                        int i68 = C4344i2.i(i36 << 3);
                        int b11 = ((AbstractC4320c2) object4).b(p12);
                        i34 = CL.w(b11, b11, i68, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 61:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        C4340h2 c4340h22 = (C4340h2) unsafe.getObject(abstractC4368o22, j13);
                        int i69 = C4344i2.i(i36 << 3);
                        int d14 = c4340h22.d();
                        i34 = CL.w(d14, d14, i69, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 62:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        i34 = CL.c(l(j13, abstractC4368o22), C4344i2.i(i36 << 3), i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 63:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        long l11 = l(j13, abstractC4368o22);
                        i28 = C4344i2.i(i36 << 3);
                        j12 = C4344i2.j(l11);
                        i34 += j12 + i28;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 64:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        i34 = CL.c(i36 << 3, 4, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case j.v.f12733G /* 65 */:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        i34 = CL.c(i36 << 3, 8, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 66:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        int l12 = l(j13, abstractC4368o22);
                        i34 = CL.c((l12 >> 31) ^ (l12 + l12), C4344i2.i(i36 << 3), i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case j.v.f12739d /* 67 */:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        long o11 = o(j13, abstractC4368o22);
                        i28 = C4344i2.i(i36 << 3);
                        j12 = C4344i2.j((o11 >> 63) ^ (o11 + o11));
                        i34 += j12 + i28;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 68:
                    if (c22.j(i36, i32, abstractC4368o22)) {
                        AbstractC4320c2 abstractC4320c23 = (AbstractC4320c2) unsafe.getObject(abstractC4368o22, j13);
                        I2 p13 = c22.p(i32);
                        O2 o224 = J2.f35717a;
                        int i70 = C4344i2.i(i36 << 3);
                        i10 = abstractC4320c23.b(p13) + i70 + i70;
                        i34 += i10;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                default:
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean g(Object obj) {
        int i;
        int i4;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < this.f35663e) {
            int i13 = this.f35662d[i11];
            int[] iArr = this.f35659a;
            int i14 = iArr[i13];
            int n9 = n(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i10 = f35658h.getInt(obj, i16);
                }
                i4 = i13;
                i9 = i10;
                i = i16;
            } else {
                int i18 = i10;
                i = i12;
                i4 = i13;
                i9 = i18;
            }
            if ((268435456 & n9) == 0 || w(obj, i4, i, i9, i17)) {
                int m8 = m(n9);
                if (m8 == 9 || m8 == 17) {
                    if (w(obj, i4, i, i9, i17) && !p(i4).g(T2.g(n9 & 1048575, obj))) {
                    }
                    i11++;
                    i12 = i;
                    i10 = i9;
                } else {
                    if (m8 != 27) {
                        if (m8 == 60 || m8 == 68) {
                            if (j(i14, i4, obj) && !p(i4).g(T2.g(n9 & 1048575, obj))) {
                            }
                            i11++;
                            i12 = i;
                            i10 = i9;
                        } else if (m8 != 49) {
                            if (m8 != 50) {
                                continue;
                            } else {
                                C4407y2 c4407y2 = (C4407y2) T2.g(n9 & 1048575, obj);
                                if (c4407y2.isEmpty()) {
                                    continue;
                                } else {
                                    int i19 = i4 / 3;
                                    if (((W2) ((C4403x2) this.f35660b[i19 + i19]).f35956a.f35880u).f35795n == X2.f35798B) {
                                        I2 i22 = null;
                                        for (Object obj2 : c4407y2.values()) {
                                            if (i22 == null) {
                                                i22 = F2.f35677c.a(obj2.getClass());
                                            }
                                            if (!i22.g(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i11++;
                            i12 = i;
                            i10 = i9;
                        }
                    }
                    List list = (List) T2.g(n9 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        I2 p6 = p(i4);
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            if (p6.g(list.get(i20))) {
                            }
                        }
                    }
                    i11++;
                    i12 = i;
                    i10 = i9;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final AbstractC4368o2 i() {
        return (AbstractC4368o2) ((AbstractC4368o2) this.f35661c).f(4);
    }

    public final boolean j(int i, int i4, Object obj) {
        return T2.d((long) (this.f35659a[i4 + 2] & 1048575), obj) == i;
    }

    public final int n(int i) {
        return this.f35659a[i + 1];
    }

    public final I2 p(int i) {
        int i4 = i / 3;
        int i9 = i4 + i4;
        Object[] objArr = this.f35660b;
        I2 i22 = (I2) objArr[i9];
        if (i22 != null) {
            return i22;
        }
        I2 a9 = F2.f35677c.a((Class) objArr[i9 + 1]);
        objArr[i9] = a9;
        return a9;
    }

    public final void r(int i, Object obj, Object obj2) {
        if (v(i, obj2)) {
            int n9 = n(i) & 1048575;
            Unsafe unsafe = f35658h;
            long j9 = n9;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f35659a[i] + " is present but null: " + obj2.toString());
            }
            I2 p6 = p(i);
            if (!v(i, obj)) {
                if (h(object)) {
                    AbstractC4368o2 i4 = p6.i();
                    p6.e(i4, object);
                    unsafe.putObject(obj, j9, i4);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!h(object2)) {
                AbstractC4368o2 i9 = p6.i();
                p6.e(i9, object2);
                unsafe.putObject(obj, j9, i9);
                object2 = i9;
            }
            p6.e(object2, object);
        }
    }

    public final void s(int i, Object obj, Object obj2) {
        int[] iArr = this.f35659a;
        int i4 = iArr[i];
        if (j(i4, i, obj2)) {
            int n9 = n(i) & 1048575;
            Unsafe unsafe = f35658h;
            long j9 = n9;
            Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            I2 p6 = p(i);
            if (!j(i4, i, obj)) {
                if (h(object)) {
                    AbstractC4368o2 i9 = p6.i();
                    p6.e(i9, object);
                    unsafe.putObject(obj, j9, i9);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                T2.i(i4, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j9);
            if (!h(object2)) {
                AbstractC4368o2 i10 = p6.i();
                p6.e(i10, object2);
                unsafe.putObject(obj, j9, i10);
                object2 = i10;
            }
            p6.e(object2, object);
        }
    }

    public final void t(int i, Object obj) {
        int i4 = this.f35659a[i + 2];
        long j9 = 1048575 & i4;
        if (j9 == 1048575) {
            return;
        }
        T2.i((1 << (i4 >>> 20)) | T2.d(j9, obj), j9, obj);
    }

    public final boolean u(AbstractC4368o2 abstractC4368o2, AbstractC4368o2 abstractC4368o22, int i) {
        return v(i, abstractC4368o2) == v(i, abstractC4368o22);
    }

    public final boolean v(int i, Object obj) {
        int i4 = this.f35659a[i + 2];
        long j9 = i4 & 1048575;
        if (j9 == 1048575) {
            int n9 = n(i);
            long j10 = n9 & 1048575;
            switch (m(n9)) {
                case 0:
                    if (Double.doubleToRawLongBits(T2.f35780c.a(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(T2.f35780c.b(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (T2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (T2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (T2.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (T2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (T2.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return T2.f35780c.g(j10, obj);
                case 8:
                    Object g9 = T2.g(j10, obj);
                    if (g9 instanceof String) {
                        if (((String) g9).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(g9 instanceof C4340h2)) {
                            throw new IllegalArgumentException();
                        }
                        if (C4340h2.f35844v.equals(g9)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (T2.g(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (C4340h2.f35844v.equals(T2.g(j10, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (T2.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (T2.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (T2.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (T2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (T2.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (T2.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (T2.g(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i4 >>> 20)) & T2.d(j9, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean w(Object obj, int i, int i4, int i9, int i10) {
        return i4 == 1048575 ? v(i, obj) : (i9 & i10) != 0;
    }
}
