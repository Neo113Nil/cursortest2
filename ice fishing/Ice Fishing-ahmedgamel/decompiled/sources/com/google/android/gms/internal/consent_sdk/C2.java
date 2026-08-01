package com.google.android.gms.internal.consent_sdk;

import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.p;
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
    public static final int[] f35494g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public static final Unsafe f35495h = T2.h();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f35496a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f35497b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4307c2 f35498c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f35499d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35500e;

    /* renamed from: f, reason: collision with root package name */
    public final O2 f35501f;

    public C2(int[] iArr, Object[] objArr, AbstractC4307c2 abstractC4307c2, int[] iArr2, int i, O2 o22, J1 j12) {
        this.f35496a = iArr;
        this.f35497b = objArr;
        this.f35499d = iArr2;
        this.f35500e = i;
        this.f35501f = o22;
        this.f35498c = abstractC4307c2;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC4355o2) {
            return ((AbstractC4355o2) obj).e();
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
        int i6;
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
        Field q8;
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
        String str2 = h22.f35526b;
        int length = str2.length();
        char c9 = 55296;
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
            i6 = 0;
            i10 = 0;
            iArr = f35494g;
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
            i6 = charAt15 + charAt15 + charAt16;
            i9 = charAt15;
            i40 = i60;
            iArr = new int[i63];
            i10 = charAt18;
        }
        Unsafe unsafe = f35495h;
        Class<?> cls = h22.f35525a.getClass();
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
            if (charAt19 >= c9) {
                int i70 = charAt19 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i37 = i71 + 1;
                    charAt12 = str2.charAt(i71);
                    if (charAt12 < c9) {
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
            if (charAt20 >= c9) {
                int i74 = charAt20 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i36 = i75 + 1;
                    charAt11 = str2.charAt(i75);
                    if (charAt11 < c9) {
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
            int i77 = charAt20 & com.anythink.basead.exoplayer.k.p.f8473b;
            int i78 = length;
            int i79 = charAt20 & 2048;
            Object[] objArr3 = h22.f35527c;
            if (i77 >= 51) {
                int i80 = i20 + 1;
                int charAt21 = str2.charAt(i20);
                char c10 = 55296;
                if (charAt21 >= 55296) {
                    int i81 = charAt21 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i35 = i82 + 1;
                        charAt10 = str2.charAt(i82);
                        if (charAt10 < c10) {
                            break;
                        }
                        i81 |= (charAt10 & 8191) << i83;
                        i83 += 13;
                        i82 = i35;
                        c10 = 55296;
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
                    i33 = i6 + 1;
                    int i86 = i68 / 3;
                    objArr[i86 + i86 + 1] = objArr3[i6];
                } else {
                    if (i85 == 12) {
                        if (h22.a() == 1 || i79 != 0) {
                            i33 = i6 + 1;
                            int i87 = i68 / 3;
                            objArr[i87 + i87 + 1] = objArr3[i6];
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
                i6 = i33;
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
                int i91 = i6 + 1;
                Field q11 = q(cls, (String) objArr3[i6]);
                if (i77 == 9 || i77 == 17) {
                    i21 = charAt19;
                    int i92 = i68 / 3;
                    objArr[i92 + i92 + 1] = q11.getType();
                } else {
                    if (i77 == 27) {
                        i21 = charAt19;
                        i31 = 1;
                        i6 += 2;
                    } else if (i77 == 49) {
                        i6 += 2;
                        i21 = charAt19;
                        i31 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            i21 = charAt19;
                            if (h22.a() == 1 || i79 != 0) {
                                i6 += 2;
                                int i93 = i68 / 3;
                                objArr[i93 + i93 + 1] = objArr3[i91];
                                i22 = i20;
                                i23 = i79;
                            } else {
                                i22 = i20;
                                i6 = i91;
                                i23 = 0;
                            }
                        } else if (i77 == 50) {
                            int i94 = i6 + 2;
                            int i95 = i66 + 1;
                            iArr[i66] = i68;
                            int i96 = i68 / 3;
                            int i97 = i96 + i96;
                            objArr[i97] = objArr3[i91];
                            if (i79 != 0) {
                                i6 += 3;
                                objArr[i97 + 1] = objArr3[i94];
                                i22 = i20;
                                i23 = i79;
                                i66 = i95;
                            } else {
                                i6 = i94;
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
                                q8 = (Field) obj3;
                            } else {
                                q8 = q(cls, (String) obj3);
                                objArr3[i101] = q8;
                            }
                            i27 = charAt22 % 32;
                            i25 = (int) unsafe.objectFieldOffset(q8);
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
                i6 = i91;
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
            c9 = 55296;
        }
        return new C2(iArr2, objArr2, h22.f35525a, iArr, i10, o22, j12);
    }

    public static int l(long j6, Object obj) {
        return ((Integer) T2.g(j6, obj)).intValue();
    }

    public static int m(int i) {
        return (i >>> 20) & com.anythink.basead.exoplayer.k.p.f8473b;
    }

    public static long o(long j6, Object obj) {
        return ((Long) T2.g(j6, obj)).longValue();
    }

    public static Field q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e9) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e9);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof AbstractC4355o2) {
            AbstractC4355o2 abstractC4355o2 = (AbstractC4355o2) obj;
            abstractC4355o2.d();
            abstractC4355o2.zza = 0;
            abstractC4355o2.k();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f35496a;
            if (i >= iArr.length) {
                this.f35501f.getClass();
                N2 n22 = ((AbstractC4355o2) obj).zzc;
                if (n22.f35582d) {
                    n22.f35582d = false;
                    return;
                }
                return;
            }
            int n9 = n(i);
            int i6 = 1048575 & n9;
            int m4 = m(n9);
            long j6 = i6;
            if (m4 != 9) {
                if (m4 != 60 && m4 != 68) {
                    switch (m4) {
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
                            AbstractC4311d2 abstractC4311d2 = (AbstractC4311d2) ((InterfaceC4366r2) T2.g(j6, obj));
                            if (!abstractC4311d2.f35664n) {
                                break;
                            } else {
                                abstractC4311d2.f35664n = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = f35495h;
                            Object object = unsafe.getObject(obj, j6);
                            if (object == null) {
                                break;
                            } else {
                                ((C4394y2) object).f35797n = false;
                                unsafe.putObject(obj, j6, object);
                                break;
                            }
                    }
                } else if (j(iArr[i], i, obj)) {
                    p(i).a(f35495h.getObject(obj, j6));
                }
                i += 3;
            }
            if (v(i, obj)) {
                p(i).a(f35495h.getObject(obj, j6));
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
    public final int b(AbstractC4355o2 abstractC4355o2) {
        int i;
        long doubleToLongBits;
        int i6;
        int floatToIntBits;
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f35496a;
            if (i11 >= iArr.length) {
                abstractC4355o2.zzc.getClass();
                return (i12 * 53) + 506991;
            }
            int n9 = n(i11);
            int i13 = 1048575 & n9;
            int m4 = m(n9);
            int i14 = iArr[i11];
            long j6 = i13;
            int i15 = 1237;
            int i16 = 37;
            switch (m4) {
                case 0:
                    i = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(T2.f35617c.a(j6, abstractC4355o2));
                    Charset charset = AbstractC4370s2.f35744a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i6 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(T2.f35617c.b(j6, abstractC4355o2));
                    i12 = floatToIntBits + i6;
                    break;
                case 2:
                    i = i12 * 53;
                    doubleToLongBits = T2.e(j6, abstractC4355o2);
                    Charset charset2 = AbstractC4370s2.f35744a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i12 * 53;
                    doubleToLongBits = T2.e(j6, abstractC4355o2);
                    Charset charset3 = AbstractC4370s2.f35744a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i6 = i12 * 53;
                    floatToIntBits = T2.d(j6, abstractC4355o2);
                    i12 = floatToIntBits + i6;
                    break;
                case 5:
                    i = i12 * 53;
                    doubleToLongBits = T2.e(j6, abstractC4355o2);
                    Charset charset4 = AbstractC4370s2.f35744a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i6 = i12 * 53;
                    floatToIntBits = T2.d(j6, abstractC4355o2);
                    i12 = floatToIntBits + i6;
                    break;
                case 7:
                    i9 = i12 * 53;
                    boolean g4 = T2.f35617c.g(j6, abstractC4355o2);
                    Charset charset5 = AbstractC4370s2.f35744a;
                    break;
                case 8:
                    i6 = i12 * 53;
                    floatToIntBits = ((String) T2.g(j6, abstractC4355o2)).hashCode();
                    i12 = floatToIntBits + i6;
                    break;
                case 9:
                    i10 = i12 * 53;
                    Object g9 = T2.g(j6, abstractC4355o2);
                    if (g9 != null) {
                        i16 = g9.hashCode();
                    }
                    i12 = i10 + i16;
                    break;
                case 10:
                    i6 = i12 * 53;
                    floatToIntBits = T2.g(j6, abstractC4355o2).hashCode();
                    i12 = floatToIntBits + i6;
                    break;
                case 11:
                    i6 = i12 * 53;
                    floatToIntBits = T2.d(j6, abstractC4355o2);
                    i12 = floatToIntBits + i6;
                    break;
                case 12:
                    i6 = i12 * 53;
                    floatToIntBits = T2.d(j6, abstractC4355o2);
                    i12 = floatToIntBits + i6;
                    break;
                case 13:
                    i6 = i12 * 53;
                    floatToIntBits = T2.d(j6, abstractC4355o2);
                    i12 = floatToIntBits + i6;
                    break;
                case 14:
                    i = i12 * 53;
                    doubleToLongBits = T2.e(j6, abstractC4355o2);
                    Charset charset6 = AbstractC4370s2.f35744a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i6 = i12 * 53;
                    floatToIntBits = T2.d(j6, abstractC4355o2);
                    i12 = floatToIntBits + i6;
                    break;
                case 16:
                    i = i12 * 53;
                    doubleToLongBits = T2.e(j6, abstractC4355o2);
                    Charset charset7 = AbstractC4370s2.f35744a;
                    i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i10 = i12 * 53;
                    Object g10 = T2.g(j6, abstractC4355o2);
                    if (g10 != null) {
                        i16 = g10.hashCode();
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
                    i6 = i12 * 53;
                    floatToIntBits = T2.g(j6, abstractC4355o2).hashCode();
                    i12 = floatToIntBits + i6;
                    break;
                case 50:
                    i6 = i12 * 53;
                    floatToIntBits = T2.g(j6, abstractC4355o2).hashCode();
                    i12 = floatToIntBits + i6;
                    break;
                case 51:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) T2.g(j6, abstractC4355o2)).doubleValue());
                        Charset charset8 = AbstractC4370s2.f35744a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) T2.g(j6, abstractC4355o2)).floatValue());
                        i12 = floatToIntBits + i6;
                        break;
                    }
                case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = o(j6, abstractC4355o2);
                        Charset charset9 = AbstractC4370s2.f35744a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = o(j6, abstractC4355o2);
                        Charset charset10 = AbstractC4370s2.f35744a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = l(j6, abstractC4355o2);
                        i12 = floatToIntBits + i6;
                        break;
                    }
                case p.a.f19679e /* 56 */:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = o(j6, abstractC4355o2);
                        Charset charset11 = AbstractC4370s2.f35744a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = l(j6, abstractC4355o2);
                        i12 = floatToIntBits + i6;
                        break;
                    }
                case 58:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i9 = i12 * 53;
                        boolean booleanValue = ((Boolean) T2.g(j6, abstractC4355o2)).booleanValue();
                        Charset charset12 = AbstractC4370s2.f35744a;
                        break;
                    }
                case j.v.f12591n /* 59 */:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = ((String) T2.g(j6, abstractC4355o2)).hashCode();
                        i12 = floatToIntBits + i6;
                        break;
                    }
                case 60:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = T2.g(j6, abstractC4355o2).hashCode();
                        i12 = floatToIntBits + i6;
                        break;
                    }
                case 61:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = T2.g(j6, abstractC4355o2).hashCode();
                        i12 = floatToIntBits + i6;
                        break;
                    }
                case 62:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = l(j6, abstractC4355o2);
                        i12 = floatToIntBits + i6;
                        break;
                    }
                case 63:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = l(j6, abstractC4355o2);
                        i12 = floatToIntBits + i6;
                        break;
                    }
                case 64:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = l(j6, abstractC4355o2);
                        i12 = floatToIntBits + i6;
                        break;
                    }
                case j.v.f12576G /* 65 */:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = o(j6, abstractC4355o2);
                        Charset charset13 = AbstractC4370s2.f35744a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = l(j6, abstractC4355o2);
                        i12 = floatToIntBits + i6;
                        break;
                    }
                case j.v.f12582d /* 67 */:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i = i12 * 53;
                        doubleToLongBits = o(j6, abstractC4355o2);
                        Charset charset14 = AbstractC4370s2.f35744a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!j(i14, i11, abstractC4355o2)) {
                        break;
                    } else {
                        i6 = i12 * 53;
                        floatToIntBits = T2.g(j6, abstractC4355o2).hashCode();
                        i12 = floatToIntBits + i6;
                        break;
                    }
            }
            i11 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean c(AbstractC4355o2 abstractC4355o2, AbstractC4355o2 abstractC4355o22) {
        boolean e9;
        int i = 0;
        while (true) {
            int[] iArr = this.f35496a;
            if (i < iArr.length) {
                int n9 = n(i);
                long j6 = n9 & 1048575;
                switch (m(n9)) {
                    case 0:
                        if (!u(abstractC4355o2, abstractC4355o22, i)) {
                            break;
                        } else {
                            S2 s22 = T2.f35617c;
                            if (Double.doubleToLongBits(s22.a(j6, abstractC4355o2)) != Double.doubleToLongBits(s22.a(j6, abstractC4355o22))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!u(abstractC4355o2, abstractC4355o22, i)) {
                            break;
                        } else {
                            S2 s23 = T2.f35617c;
                            if (Float.floatToIntBits(s23.b(j6, abstractC4355o2)) != Float.floatToIntBits(s23.b(j6, abstractC4355o22))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.e(j6, abstractC4355o2) == T2.e(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.e(j6, abstractC4355o2) == T2.e(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.d(j6, abstractC4355o2) == T2.d(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.e(j6, abstractC4355o2) == T2.e(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.d(j6, abstractC4355o2) == T2.d(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!u(abstractC4355o2, abstractC4355o22, i)) {
                            break;
                        } else {
                            S2 s24 = T2.f35617c;
                            if (s24.g(j6, abstractC4355o2) != s24.g(j6, abstractC4355o22)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (u(abstractC4355o2, abstractC4355o22, i) && J2.e(T2.g(j6, abstractC4355o2), T2.g(j6, abstractC4355o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (u(abstractC4355o2, abstractC4355o22, i) && J2.e(T2.g(j6, abstractC4355o2), T2.g(j6, abstractC4355o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (u(abstractC4355o2, abstractC4355o22, i) && J2.e(T2.g(j6, abstractC4355o2), T2.g(j6, abstractC4355o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.d(j6, abstractC4355o2) == T2.d(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.d(j6, abstractC4355o2) == T2.d(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.d(j6, abstractC4355o2) == T2.d(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.e(j6, abstractC4355o2) == T2.e(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.d(j6, abstractC4355o2) == T2.d(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (u(abstractC4355o2, abstractC4355o22, i) && T2.e(j6, abstractC4355o2) == T2.e(j6, abstractC4355o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (u(abstractC4355o2, abstractC4355o22, i) && J2.e(T2.g(j6, abstractC4355o2), T2.g(j6, abstractC4355o22))) {
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
                        e9 = J2.e(T2.g(j6, abstractC4355o2), T2.g(j6, abstractC4355o22));
                        break;
                    case 50:
                        e9 = J2.e(T2.g(j6, abstractC4355o2), T2.g(j6, abstractC4355o22));
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
                        if (T2.d(j9, abstractC4355o2) == T2.d(j9, abstractC4355o22) && J2.e(T2.g(j6, abstractC4355o2), T2.g(j6, abstractC4355o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (e9) {
                    i += 3;
                }
            } else if (abstractC4355o2.zzc.equals(abstractC4355o22.zzc)) {
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
    public final void d(Object obj, C4386w2 c4386w2) {
        boolean z3;
        int[] iArr;
        int i;
        int i6;
        int i9;
        int i10;
        int i11;
        boolean z6;
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
        ?? j6;
        int d9;
        int i19;
        C2 c22 = this;
        int i20 = 2;
        int i21 = 3;
        Unsafe unsafe = f35495h;
        int i22 = 1048575;
        int i23 = 1048575;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            int[] iArr2 = c22.f35496a;
            if (i24 >= iArr2.length) {
                N2 n22 = ((AbstractC4355o2) obj).zzc;
                return;
            }
            int n9 = c22.n(i24);
            int m4 = m(n9);
            int i26 = iArr2[i24];
            if (m4 <= 17) {
                int i27 = iArr2[i24 + 2];
                z3 = true;
                int i28 = i27 & i22;
                if (i28 != i23) {
                    i25 = i28 == i22 ? 0 : unsafe.getInt(obj, i28);
                    i23 = i28;
                }
                iArr = iArr2;
                i = 1 << (i27 >>> 20);
            } else {
                z3 = true;
                iArr = iArr2;
                i = 0;
            }
            long j9 = n9 & i22;
            int i29 = i20;
            switch (m4) {
                case 0:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4331i2) c4386w2.f35781u).t(i26, Double.doubleToRawLongBits(T2.f35617c.a(j9, obj)));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 1:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4331i2) c4386w2.f35781u).r(i26, Float.floatToRawIntBits(T2.f35617c.b(j9, obj)));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 2:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4331i2) c4386w2.f35781u).B(i26, unsafe.getLong(obj, j9));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 3:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4331i2) c4386w2.f35781u).B(i26, unsafe.getLong(obj, j9));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 4:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4331i2) c4386w2.f35781u).v(i26, unsafe.getInt(obj, j9));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 5:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4331i2) c4386w2.f35781u).t(i26, unsafe.getLong(obj, j9));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 6:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        ((C4331i2) c4386w2.f35781u).r(i26, unsafe.getInt(obj, j9));
                    }
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 7:
                    if (c22.w(obj, i24, i23, i25, i)) {
                        byte g4 = T2.f35617c.g(j9, obj);
                        C4331i2 c4331i2 = (C4331i2) c4386w2.f35781u;
                        c4331i2.l(11);
                        c4331i2.o(i26 << 3);
                        int i30 = c4331i2.f35691e;
                        c4331i2.f35689c[i30] = g4;
                        c4331i2.f35691e = i30 + 1;
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
                        Object object = unsafe.getObject(obj, j9);
                        if (object instanceof String) {
                            C4331i2 c4331i22 = (C4331i2) c4386w2.f35781u;
                            i29 = 2;
                            c4331i22.A((i26 << 3) | 2);
                            c4331i22.x((String) object);
                        } else {
                            i29 = 2;
                            C4331i2 c4331i23 = (C4331i2) c4386w2.f35781u;
                            c4331i23.A((i26 << 3) | 2);
                            c4331i23.q((C4327h2) object);
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
                        c4386w2.c(i26, unsafe.getObject(obj, j9), c22.p(i24));
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
                        C4327h2 c4327h2 = (C4327h2) unsafe.getObject(obj, j9);
                        C4331i2 c4331i24 = (C4331i2) c4386w2.f35781u;
                        c4331i24.A((i26 << 3) | 2);
                        c4331i24.q(c4327h2);
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
                        ((C4331i2) c4386w2.f35781u).z(i26, unsafe.getInt(obj, j9));
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
                        ((C4331i2) c4386w2.f35781u).v(i26, unsafe.getInt(obj, j9));
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
                        ((C4331i2) c4386w2.f35781u).r(i26, unsafe.getInt(obj, j9));
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
                        ((C4331i2) c4386w2.f35781u).t(i26, unsafe.getLong(obj, j9));
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
                        int i31 = unsafe.getInt(obj, j9);
                        ((C4331i2) c4386w2.f35781u).z(i26, (i31 >> 31) ^ (i31 + i31));
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
                        long j10 = unsafe.getLong(obj, j9);
                        ((C4331i2) c4386w2.f35781u).B(i26, (j10 >> 63) ^ (j10 + j10));
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
                        Object object2 = unsafe.getObject(obj, j9);
                        I2 p9 = c22.p(i24);
                        c4386w2.getClass();
                        C4331i2 c4331i25 = (C4331i2) c4386w2.f35781u;
                        c4331i25.y(i26, 3);
                        p9.d((AbstractC4307c2) object2, c4386w2);
                        c4331i25.y(i26, 4);
                    }
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 18:
                    i6 = i23;
                    i9 = i25;
                    J2.q(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 19:
                    i6 = i23;
                    i9 = i25;
                    J2.u(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 20:
                    i6 = i23;
                    i9 = i25;
                    J2.w(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 21:
                    i6 = i23;
                    i9 = i25;
                    J2.d(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 22:
                    i6 = i23;
                    i9 = i25;
                    J2.v(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 23:
                    i6 = i23;
                    i9 = i25;
                    J2.t(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 24:
                    i6 = i23;
                    i9 = i25;
                    J2.s(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 25:
                    i6 = i23;
                    i9 = i25;
                    J2.p(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
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
                    List list = (List) unsafe.getObject(obj, j9);
                    O2 o22 = J2.f35554a;
                    if (list != null && !list.isEmpty()) {
                        c4386w2.getClass();
                        for (int i33 = 0; i33 < list.size(); i33++) {
                            String str = (String) list.get(i33);
                            C4331i2 c4331i26 = (C4331i2) c4386w2.f35781u;
                            c4331i26.A((i32 << 3) | 2);
                            c4331i26.x(str);
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
                    List list2 = (List) unsafe.getObject(obj, j9);
                    I2 p10 = c22.p(i24);
                    O2 o23 = J2.f35554a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i35 = 0; i35 < list2.size(); i35++) {
                            c4386w2.c(i34, list2.get(i35), p10);
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
                    List list3 = (List) unsafe.getObject(obj, j9);
                    O2 o24 = J2.f35554a;
                    if (list3 != null && !list3.isEmpty()) {
                        c4386w2.getClass();
                        for (int i37 = 0; i37 < list3.size(); i37++) {
                            C4327h2 c4327h22 = (C4327h2) list3.get(i37);
                            C4331i2 c4331i27 = (C4331i2) c4386w2.f35781u;
                            c4331i27.A((i36 << 3) | 2);
                            c4331i27.q(c4327h22);
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
                    i6 = i23;
                    i9 = i25;
                    z6 = false;
                    J2.c(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 30:
                    i6 = i23;
                    i9 = i25;
                    z6 = false;
                    J2.r(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 31:
                    i6 = i23;
                    i9 = i25;
                    z6 = false;
                    J2.x(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 32:
                    i6 = i23;
                    i9 = i25;
                    z6 = false;
                    J2.y(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 33:
                    i6 = i23;
                    i9 = i25;
                    z6 = false;
                    J2.a(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 34:
                    i6 = i23;
                    i9 = i25;
                    z6 = false;
                    J2.b(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, false);
                    i25 = i9;
                    i23 = i6;
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
                    J2.q(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
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
                    J2.u(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
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
                    J2.w(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5806M /* 38 */:
                    i12 = i23;
                    i13 = i25;
                    J2.d(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
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
                    J2.v(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5808O /* 40 */:
                    i12 = i23;
                    i13 = i25;
                    J2.t(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
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
                    J2.s(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
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
                    J2.p(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5811R /* 43 */:
                    i12 = i23;
                    i13 = i25;
                    J2.c(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5812S /* 44 */:
                    i12 = i23;
                    i13 = i25;
                    J2.r(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5813T /* 45 */:
                    i12 = i23;
                    i13 = i25;
                    J2.x(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
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
                    J2.y(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
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
                    J2.a(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5816W /* 48 */:
                    i12 = i23;
                    i13 = i25;
                    J2.b(iArr[i24], (List) unsafe.getObject(obj, j9), c4386w2, z3);
                    i25 = i13;
                    i23 = i12;
                    i29 = 2;
                    i14 = 3;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.basead.b.b.j.f5817X /* 49 */:
                    i10 = i23;
                    i11 = i25;
                    int i38 = iArr[i24];
                    List list4 = (List) unsafe.getObject(obj, j9);
                    I2 p11 = c22.p(i24);
                    O2 o25 = J2.f35554a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i39 = 0; i39 < list4.size(); i39++) {
                            Object obj2 = list4.get(i39);
                            c4386w2.getClass();
                            C4331i2 c4331i28 = (C4331i2) c4386w2.f35781u;
                            c4331i28.y(i38, 3);
                            p11.d((AbstractC4307c2) obj2, c4386w2);
                            c4331i28.y(i38, 4);
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
                    Object object3 = unsafe.getObject(obj, j9);
                    if (object3 != null) {
                        int i40 = i24 / 3;
                        C4344m c4344m = ((C4390x2) c22.f35497b[i40 + i40]).f35793a;
                        c4386w2.getClass();
                        Iterator it2 = ((C4394y2) object3).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            C4331i2 c4331i29 = (C4331i2) c4386w2.f35781u;
                            c4331i29.y(i26, i29);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int i41 = C4343l2.f35713c;
                            int i42 = C4331i2.i(8);
                            W2 w23 = W2.f35630x;
                            W2 w24 = (W2) c4344m.f35716n;
                            if (w24 == w23) {
                                i42 += i42;
                            }
                            X2 x22 = X2.f35637n;
                            int i43 = i23;
                            switch (w24.ordinal()) {
                                case 0:
                                    i15 = i25;
                                    it = it2;
                                    ((Double) key).getClass();
                                    r42 = 8;
                                    int i44 = r42 + i42;
                                    int i45 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                        i45 += i45;
                                    }
                                    switch (w22.ordinal()) {
                                        case 0:
                                            i18 = i44;
                                            ((Double) value).getClass();
                                            j6 = 8;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key2);
                                            C4343l2.b(c4331i29, w22, 2, value2);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 1:
                                            i18 = i44;
                                            ((Float) value).getClass();
                                            j6 = 4;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key22 = entry.getKey();
                                            Object value22 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key22);
                                            C4343l2.b(c4331i29, w22, 2, value22);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 2:
                                            i18 = i44;
                                            j6 = C4331i2.j(((Long) value).longValue());
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key222 = entry.getKey();
                                            Object value222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key222);
                                            C4343l2.b(c4331i29, w22, 2, value222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 3:
                                            i18 = i44;
                                            j6 = C4331i2.j(((Long) value).longValue());
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key2222 = entry.getKey();
                                            Object value2222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key2222);
                                            C4343l2.b(c4331i29, w22, 2, value2222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 4:
                                            i18 = i44;
                                            j6 = C4331i2.j(((Integer) value).intValue());
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key22222 = entry.getKey();
                                            Object value22222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key22222);
                                            C4343l2.b(c4331i29, w22, 2, value22222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 5:
                                            i18 = i44;
                                            ((Long) value).getClass();
                                            j6 = 8;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key222222 = entry.getKey();
                                            Object value222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key222222);
                                            C4343l2.b(c4331i29, w22, 2, value222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 6:
                                            i18 = i44;
                                            ((Integer) value).getClass();
                                            j6 = 4;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key2222222 = entry.getKey();
                                            Object value2222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key2222222);
                                            C4343l2.b(c4331i29, w22, 2, value2222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 7:
                                            i18 = i44;
                                            ((Boolean) value).getClass();
                                            j6 = z3;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key22222222 = entry.getKey();
                                            Object value22222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key22222222);
                                            C4343l2.b(c4331i29, w22, 2, value22222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 8:
                                            i18 = i44;
                                            if (value instanceof C4327h2) {
                                                d9 = ((C4327h2) value).d();
                                                i19 = C4331i2.i(d9);
                                                j6 = d9 + i19;
                                                c4331i29.A(j6 + i45 + i18);
                                                Object key222222222 = entry.getKey();
                                                Object value222222222 = entry.getValue();
                                                C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key222222222);
                                                C4343l2.b(c4331i29, w22, 2, value222222222);
                                                i29 = 2;
                                                i25 = i15;
                                                i23 = i43;
                                                it2 = it;
                                                i21 = 3;
                                                z3 = true;
                                            } else {
                                                j6 = C4331i2.h((String) value);
                                                c4331i29.A(j6 + i45 + i18);
                                                Object key2222222222 = entry.getKey();
                                                Object value2222222222 = entry.getValue();
                                                C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key2222222222);
                                                C4343l2.b(c4331i29, w22, 2, value2222222222);
                                                i29 = 2;
                                                i25 = i15;
                                                i23 = i43;
                                                it2 = it;
                                                i21 = 3;
                                                z3 = true;
                                            }
                                        case 9:
                                            i18 = i44;
                                            j6 = ((AbstractC4307c2) value).c();
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key22222222222 = entry.getKey();
                                            Object value22222222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key22222222222);
                                            C4343l2.b(c4331i29, w22, 2, value22222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 10:
                                            i18 = i44;
                                            d9 = ((AbstractC4307c2) value).c();
                                            i19 = C4331i2.i(d9);
                                            j6 = d9 + i19;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key222222222222 = entry.getKey();
                                            Object value222222222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key222222222222);
                                            C4343l2.b(c4331i29, w22, 2, value222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 11:
                                            i18 = i44;
                                            if (value instanceof C4327h2) {
                                                d9 = ((C4327h2) value).d();
                                                i19 = C4331i2.i(d9);
                                            } else {
                                                d9 = ((byte[]) value).length;
                                                i19 = C4331i2.i(d9);
                                            }
                                            j6 = d9 + i19;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key2222222222222 = entry.getKey();
                                            Object value2222222222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key2222222222222);
                                            C4343l2.b(c4331i29, w22, 2, value2222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 12:
                                            i18 = i44;
                                            j6 = C4331i2.i(((Integer) value).intValue());
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key22222222222222 = entry.getKey();
                                            Object value22222222222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key22222222222222);
                                            C4343l2.b(c4331i29, w22, 2, value22222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 13:
                                            i18 = i44;
                                            j6 = C4331i2.j(((Integer) value).intValue());
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key222222222222222 = entry.getKey();
                                            Object value222222222222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key222222222222222);
                                            C4343l2.b(c4331i29, w22, 2, value222222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 14:
                                            ((Integer) value).getClass();
                                            i18 = i44;
                                            j6 = 4;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key2222222222222222 = entry.getKey();
                                            Object value2222222222222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key2222222222222222);
                                            C4343l2.b(c4331i29, w22, 2, value2222222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 15:
                                            ((Long) value).getClass();
                                            i18 = i44;
                                            j6 = 8;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key22222222222222222 = entry.getKey();
                                            Object value22222222222222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key22222222222222222);
                                            C4343l2.b(c4331i29, w22, 2, value22222222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            j6 = C4331i2.i((intValue >> 31) ^ (intValue + intValue));
                                            i18 = i44;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key222222222222222222 = entry.getKey();
                                            Object value222222222222222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key222222222222222222);
                                            C4343l2.b(c4331i29, w22, 2, value222222222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            j6 = C4331i2.j((longValue + longValue) ^ (longValue >> 63));
                                            i18 = i44;
                                            c4331i29.A(j6 + i45 + i18);
                                            Object key2222222222222222222 = entry.getKey();
                                            Object value2222222222222222222 = entry.getValue();
                                            C4343l2.b(c4331i29, w24, z3 ? 1 : 0, key2222222222222222222);
                                            C4343l2.b(c4331i29, w22, 2, value2222222222222222222);
                                            i29 = 2;
                                            i25 = i15;
                                            i23 = i43;
                                            it2 = it;
                                            i21 = 3;
                                            z3 = true;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    i15 = i25;
                                    it = it2;
                                    ((Float) key).getClass();
                                    r42 = 4;
                                    int i442 = r42 + i42;
                                    int i452 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 2:
                                    i15 = i25;
                                    it = it2;
                                    r42 = C4331i2.j(((Long) key).longValue());
                                    int i4422 = r42 + i42;
                                    int i4522 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 3:
                                    i15 = i25;
                                    it = it2;
                                    r42 = C4331i2.j(((Long) key).longValue());
                                    int i44222 = r42 + i42;
                                    int i45222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 4:
                                    i15 = i25;
                                    it = it2;
                                    r42 = C4331i2.j(((Integer) key).intValue());
                                    int i442222 = r42 + i42;
                                    int i452222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
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
                                    int i4522222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
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
                                    int i45222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 7:
                                    i15 = i25;
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    r42 = z3;
                                    int i442222222 = r42 + i42;
                                    int i452222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 8:
                                    i15 = i25;
                                    it = it2;
                                    if (key instanceof C4327h2) {
                                        d2 = ((C4327h2) key).d();
                                        i16 = C4331i2.i(d2);
                                        r42 = d2 + i16;
                                        int i4422222222 = r42 + i42;
                                        int i4522222222 = C4331i2.i(16);
                                        w22 = (W2) c4344m.f35717u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    } else {
                                        r42 = C4331i2.h((String) key);
                                        int i44222222222 = r42 + i42;
                                        int i45222222222 = C4331i2.i(16);
                                        w22 = (W2) c4344m.f35717u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    }
                                case 9:
                                    i15 = i25;
                                    it = it2;
                                    r42 = ((AbstractC4307c2) key).c();
                                    int i442222222222 = r42 + i42;
                                    int i452222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 10:
                                    i15 = i25;
                                    it = it2;
                                    d2 = ((AbstractC4307c2) key).c();
                                    i16 = C4331i2.i(d2);
                                    r42 = d2 + i16;
                                    int i4422222222222 = r42 + i42;
                                    int i4522222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 11:
                                    i15 = i25;
                                    it = it2;
                                    if (key instanceof C4327h2) {
                                        d2 = ((C4327h2) key).d();
                                        i16 = C4331i2.i(d2);
                                    } else {
                                        d2 = ((byte[]) key).length;
                                        i16 = C4331i2.i(d2);
                                    }
                                    r42 = d2 + i16;
                                    int i44222222222222 = r42 + i42;
                                    int i45222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 12:
                                    i15 = i25;
                                    it = it2;
                                    r42 = C4331i2.i(((Integer) key).intValue());
                                    int i442222222222222 = r42 + i42;
                                    int i452222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 13:
                                    i15 = i25;
                                    it = it2;
                                    r42 = C4331i2.j(((Integer) key).intValue());
                                    int i4422222222222222 = r42 + i42;
                                    int i4522222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
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
                                    int i45222222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
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
                                    int i452222222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    i17 = C4331i2.i((intValue2 + intValue2) ^ (intValue2 >> 31));
                                    i15 = i25;
                                    it = it2;
                                    r42 = i17;
                                    int i4422222222222222222 = r42 + i42;
                                    int i4522222222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    i17 = C4331i2.j((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    i15 = i25;
                                    it = it2;
                                    r42 = i17;
                                    int i44222222222222222222 = r42 + i42;
                                    int i45222222222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
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
                        ((C4331i2) c4386w2.f35781u).t(i26, Double.doubleToRawLongBits(((Double) T2.g(j9, obj)).doubleValue()));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 52:
                    if (c22.j(i26, i24, obj)) {
                        ((C4331i2) c4386w2.f35781u).r(i26, Float.floatToRawIntBits(((Float) T2.g(j9, obj)).floatValue()));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                    if (c22.j(i26, i24, obj)) {
                        ((C4331i2) c4386w2.f35781u).B(i26, o(j9, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 54:
                    if (c22.j(i26, i24, obj)) {
                        ((C4331i2) c4386w2.f35781u).B(i26, o(j9, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 55:
                    if (c22.j(i26, i24, obj)) {
                        ((C4331i2) c4386w2.f35781u).v(i26, l(j9, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case p.a.f19679e /* 56 */:
                    if (c22.j(i26, i24, obj)) {
                        ((C4331i2) c4386w2.f35781u).t(i26, o(j9, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 57:
                    if (c22.j(i26, i24, obj)) {
                        ((C4331i2) c4386w2.f35781u).r(i26, l(j9, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 58:
                    if (c22.j(i26, i24, obj)) {
                        byte booleanValue = ((Boolean) T2.g(j9, obj)).booleanValue();
                        C4331i2 c4331i210 = (C4331i2) c4386w2.f35781u;
                        c4331i210.l(11);
                        c4331i210.o(i26 << 3);
                        int i46 = c4331i210.f35691e;
                        c4331i210.f35689c[i46] = booleanValue;
                        c4331i210.f35691e = i46 + 1;
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case j.v.f12591n /* 59 */:
                    if (c22.j(i26, i24, obj)) {
                        Object object4 = unsafe.getObject(obj, j9);
                        if (object4 instanceof String) {
                            C4331i2 c4331i211 = (C4331i2) c4386w2.f35781u;
                            c4331i211.A((i26 << 3) | 2);
                            c4331i211.x((String) object4);
                        } else {
                            C4331i2 c4331i212 = (C4331i2) c4386w2.f35781u;
                            c4331i212.A((i26 << 3) | 2);
                            c4331i212.q((C4327h2) object4);
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
                        c4386w2.c(i26, unsafe.getObject(obj, j9), c22.p(i24));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 61:
                    if (c22.j(i26, i24, obj)) {
                        C4327h2 c4327h23 = (C4327h2) unsafe.getObject(obj, j9);
                        C4331i2 c4331i213 = (C4331i2) c4386w2.f35781u;
                        c4331i213.A((i26 << 3) | 2);
                        c4331i213.q(c4327h23);
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 62:
                    if (c22.j(i26, i24, obj)) {
                        ((C4331i2) c4386w2.f35781u).z(i26, l(j9, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 63:
                    if (c22.j(i26, i24, obj)) {
                        ((C4331i2) c4386w2.f35781u).v(i26, l(j9, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 64:
                    if (c22.j(i26, i24, obj)) {
                        ((C4331i2) c4386w2.f35781u).r(i26, l(j9, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case j.v.f12576G /* 65 */:
                    if (c22.j(i26, i24, obj)) {
                        ((C4331i2) c4386w2.f35781u).t(i26, o(j9, obj));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 66:
                    if (c22.j(i26, i24, obj)) {
                        int l9 = l(j9, obj);
                        ((C4331i2) c4386w2.f35781u).z(i26, (l9 >> 31) ^ (l9 + l9));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case j.v.f12582d /* 67 */:
                    if (c22.j(i26, i24, obj)) {
                        long o6 = o(j9, obj);
                        ((C4331i2) c4386w2.f35781u).B(i26, (o6 >> 63) ^ (o6 + o6));
                    }
                    i14 = i21;
                    i24 += 3;
                    c22 = this;
                    i20 = i29;
                    i21 = i14;
                    i22 = 1048575;
                case 68:
                    if (c22.j(i26, i24, obj)) {
                        Object object5 = unsafe.getObject(obj, j9);
                        I2 p12 = c22.p(i24);
                        c4386w2.getClass();
                        C4331i2 c4331i214 = (C4331i2) c4386w2.f35781u;
                        c4331i214.y(i26, i21);
                        p12.d((AbstractC4307c2) object5, c4386w2);
                        c4331i214.y(i26, 4);
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
            int[] iArr = this.f35496a;
            if (i >= iArr.length) {
                J2.o(obj, obj2);
                return;
            }
            int n9 = n(i);
            int i6 = n9 & 1048575;
            int m4 = m(n9);
            int i9 = iArr[i];
            long j6 = i6;
            switch (m4) {
                case 0:
                    if (v(i, obj2)) {
                        S2 s22 = T2.f35617c;
                        obj3 = obj;
                        s22.e(obj3, j6, s22.a(j6, obj2));
                        t(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (v(i, obj2)) {
                        S2 s23 = T2.f35617c;
                        s23.f(obj, j6, s23.b(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (v(i, obj2)) {
                        T2.j(obj, j6, T2.e(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (v(i, obj2)) {
                        T2.j(obj, j6, T2.e(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (v(i, obj2)) {
                        T2.j(obj, j6, T2.e(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (v(i, obj2)) {
                        S2 s24 = T2.f35617c;
                        s24.c(obj, j6, s24.g(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (v(i, obj2)) {
                        T2.k(j6, obj, T2.g(j6, obj2));
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
                        T2.k(j6, obj, T2.g(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (v(i, obj2)) {
                        T2.j(obj, j6, T2.e(j6, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (v(i, obj2)) {
                        T2.i(T2.d(j6, obj2), j6, obj);
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (v(i, obj2)) {
                        T2.j(obj, j6, T2.e(j6, obj2));
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
                    InterfaceC4366r2 interfaceC4366r2 = (InterfaceC4366r2) T2.g(j6, obj);
                    InterfaceC4366r2 interfaceC4366r22 = (InterfaceC4366r2) T2.g(j6, obj2);
                    int size = interfaceC4366r2.size();
                    int size2 = interfaceC4366r22.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC4311d2) interfaceC4366r2).f35664n) {
                            interfaceC4366r2 = interfaceC4366r2.b(size2 + size);
                        }
                        interfaceC4366r2.addAll(interfaceC4366r22);
                    }
                    if (size > 0) {
                        interfaceC4366r22 = interfaceC4366r2;
                    }
                    T2.k(j6, obj, interfaceC4366r22);
                    obj3 = obj;
                    break;
                case 50:
                    O2 o22 = J2.f35554a;
                    C4394y2 c4394y2 = (C4394y2) T2.g(j6, obj);
                    C4394y2 c4394y22 = (C4394y2) T2.g(j6, obj2);
                    if (!c4394y22.isEmpty()) {
                        if (!c4394y2.f35797n) {
                            if (c4394y2.isEmpty()) {
                                c4394y2 = new C4394y2();
                            } else {
                                C4394y2 c4394y23 = new C4394y2(c4394y2);
                                c4394y23.f35797n = true;
                                c4394y2 = c4394y23;
                            }
                        }
                        c4394y2.h();
                        if (!c4394y22.isEmpty()) {
                            c4394y2.putAll(c4394y22);
                        }
                    }
                    T2.k(j6, obj, c4394y2);
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
                    if (j(i9, i, obj2)) {
                        T2.k(j6, obj, T2.g(j6, obj2));
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
                case j.v.f12576G /* 65 */:
                case 66:
                case j.v.f12582d /* 67 */:
                    if (j(i9, i, obj2)) {
                        T2.k(j6, obj, T2.g(j6, obj2));
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
    public final int f(AbstractC4355o2 abstractC4355o2) {
        int i;
        int i6;
        int i9;
        int j6;
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
        int j9;
        int d2;
        int i25;
        int i26;
        W2 w22;
        int j10;
        int d9;
        int i27;
        int i28;
        int j11;
        C2 c22 = this;
        AbstractC4355o2 abstractC4355o22 = abstractC4355o2;
        int i29 = 1;
        Unsafe unsafe = f35495h;
        int i30 = 1048575;
        int i31 = 1048575;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (true) {
            int[] iArr = c22.f35496a;
            if (i32 >= iArr.length) {
                N2 n22 = abstractC4355o22.zzc;
                int i35 = n22.f35581c;
                if (i35 == -1) {
                    n22.f35581c = 0;
                    i = 0;
                } else {
                    i = i35;
                }
                return i + i34;
            }
            int n10 = c22.n(i32);
            int m4 = m(n10);
            int i36 = iArr[i32];
            int i37 = iArr[i32 + 2];
            int i38 = i37 & i30;
            if (m4 <= 17) {
                if (i38 != i31) {
                    i33 = i38 == i30 ? 0 : unsafe.getInt(abstractC4355o22, i38);
                    i31 = i38;
                }
                i6 = i29 << (i37 >>> 20);
            } else {
                i6 = 0;
            }
            int i39 = n10 & i30;
            if (m4 >= EnumC4347m2.f35718u.f35722n) {
                EnumC4347m2.f35719v.getClass();
            }
            long j12 = i39;
            int i40 = 8;
            int i41 = 4;
            switch (m4) {
                case 0:
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 8, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 1:
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 4, i34);
                    }
                    abstractC4355o22 = abstractC4355o2;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 2:
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        long j13 = unsafe.getLong(abstractC4355o22, j12);
                        i9 = C4331i2.i(i36 << 3);
                        j6 = C4331i2.j(j13);
                        i10 = j6 + i9;
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
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        long j14 = unsafe.getLong(abstractC4355o22, j12);
                        i9 = C4331i2.i(i36 << 3);
                        j6 = C4331i2.j(j14);
                        i10 = j6 + i9;
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
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        long j15 = unsafe.getInt(abstractC4355o22, j12);
                        i9 = C4331i2.i(i36 << 3);
                        j6 = C4331i2.j(j15);
                        i10 = j6 + i9;
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
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 8, i34);
                    }
                    abstractC4355o22 = abstractC4355o2;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 6:
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 4, i34);
                    }
                    abstractC4355o22 = abstractC4355o2;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 7:
                    int i42 = i29;
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        i29 = i42;
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, i29, i34);
                    } else {
                        i29 = i42;
                    }
                    abstractC4355o22 = abstractC4355o2;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 8:
                    i11 = i29;
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        int i43 = i36 << 3;
                        Object object = unsafe.getObject(abstractC4355o22, j12);
                        if (object instanceof C4327h2) {
                            int i44 = C4331i2.i(i43);
                            int d10 = ((C4327h2) object).d();
                            i34 = com.anythink.basead.exoplayer.f.f.z(d10, d10, i44, i34);
                        } else {
                            i12 = C4331i2.i(i43);
                            h9 = C4331i2.h((String) object);
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
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        Object object2 = unsafe.getObject(abstractC4355o22, j12);
                        I2 p9 = c22.p(i32);
                        O2 o22 = J2.f35554a;
                        int i45 = C4331i2.i(i36 << 3);
                        int b9 = ((AbstractC4307c2) object2).b(p9);
                        i34 = com.anythink.basead.exoplayer.f.f.z(b9, b9, i45, i34);
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 10:
                    i11 = i29;
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        C4327h2 c4327h2 = (C4327h2) unsafe.getObject(abstractC4355o22, j12);
                        int i46 = C4331i2.i(i36 << 3);
                        int d11 = c4327h2.d();
                        i34 = com.anythink.basead.exoplayer.f.f.z(d11, d11, i46, i34);
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 11:
                    i11 = i29;
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(unsafe.getInt(abstractC4355o22, j12), C4331i2.i(i36 << 3), i34);
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 12:
                    i11 = i29;
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        long j16 = unsafe.getInt(abstractC4355o22, j12);
                        i12 = C4331i2.i(i36 << 3);
                        h9 = C4331i2.j(j16);
                        i13 = h9 + i12;
                        i34 += i13;
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 13:
                    i11 = i29;
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 4, i34);
                    }
                    abstractC4355o22 = abstractC4355o2;
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 14:
                    i11 = i29;
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 8, i34);
                    }
                    abstractC4355o22 = abstractC4355o2;
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 15:
                    i11 = i29;
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        int i47 = unsafe.getInt(abstractC4355o22, j12);
                        i34 = com.anythink.basead.exoplayer.f.f.w((i47 >> 31) ^ (i47 + i47), C4331i2.i(i36 << 3), i34);
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 16:
                    i11 = i29;
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        long j17 = unsafe.getLong(abstractC4355o22, j12);
                        i12 = C4331i2.i(i36 << 3);
                        h9 = C4331i2.j((j17 >> 63) ^ (j17 + j17));
                        i13 = h9 + i12;
                        i34 += i13;
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 17:
                    i11 = i29;
                    if (c22.w(abstractC4355o22, i32, i31, i33, i6)) {
                        AbstractC4307c2 abstractC4307c2 = (AbstractC4307c2) unsafe.getObject(abstractC4355o22, j12);
                        I2 p10 = c22.p(i32);
                        O2 o23 = J2.f35554a;
                        int i48 = C4331i2.i(i36 << 3);
                        i13 = abstractC4307c2.b(p10) + i48 + i48;
                        i34 += i13;
                    }
                    i29 = i11;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 18:
                    i14 = i31;
                    h10 = J2.h(i36, (List) unsafe.getObject(abstractC4355o22, j12));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 19:
                    i14 = i31;
                    h10 = J2.g(i36, (List) unsafe.getObject(abstractC4355o22, j12));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 20:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o24 = J2.f35554a;
                    if (list.size() != 0) {
                        i18 = (C4331i2.i(i36 << 3) * list.size()) + J2.j(list);
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
                    List list2 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o25 = J2.f35554a;
                    size = list2.size();
                    if (size != 0) {
                        n9 = J2.n(list2);
                        i19 = C4331i2.i(i36 << 3);
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
                    List list3 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o26 = J2.f35554a;
                    size = list3.size();
                    if (size != 0) {
                        n9 = J2.i(list3);
                        i19 = C4331i2.i(i36 << 3);
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
                    h10 = J2.h(i36, (List) unsafe.getObject(abstractC4355o22, j12));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 24:
                    i14 = i31;
                    h10 = J2.g(i36, (List) unsafe.getObject(abstractC4355o22, j12));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 25:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list4 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o27 = J2.f35554a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        i18 = (C4331i2.i(i36 << 3) + 1) * size2;
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
                    List list5 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o28 = J2.f35554a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        i20 = C4331i2.i(i36 << 3) * size3;
                        for (int i49 = 0; i49 < size3; i49++) {
                            Object obj = list5.get(i49);
                            if (obj instanceof C4327h2) {
                                int d12 = ((C4327h2) obj).d();
                                i20 = com.anythink.basead.exoplayer.f.f.w(d12, d12, i20);
                            } else {
                                i20 = C4331i2.h((String) obj) + i20;
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
                    List list6 = (List) unsafe.getObject(abstractC4355o22, j12);
                    I2 p11 = c22.p(i32);
                    O2 o29 = J2.f35554a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        i21 = 0;
                    } else {
                        i21 = C4331i2.i(i36 << 3) * size4;
                        for (int i50 = 0; i50 < size4; i50++) {
                            int b10 = ((AbstractC4307c2) list6.get(i50)).b(p11);
                            i21 = com.anythink.basead.exoplayer.f.f.w(b10, b10, i21);
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
                    List list7 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o210 = J2.f35554a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        i20 = C4331i2.i(i36 << 3) * size5;
                        for (int i51 = 0; i51 < list7.size(); i51++) {
                            int d13 = ((C4327h2) list7.get(i51)).d();
                            i20 = com.anythink.basead.exoplayer.f.f.w(d13, d13, i20);
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
                    List list8 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o211 = J2.f35554a;
                    size = list8.size();
                    if (size != 0) {
                        n9 = J2.m(list8);
                        i19 = C4331i2.i(i36 << 3);
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
                    List list9 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o212 = J2.f35554a;
                    size = list9.size();
                    if (size != 0) {
                        n9 = J2.f(list9);
                        i19 = C4331i2.i(i36 << 3);
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
                    h10 = J2.g(i36, (List) unsafe.getObject(abstractC4355o22, j12));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 32:
                    i14 = i31;
                    h10 = J2.h(i36, (List) unsafe.getObject(abstractC4355o22, j12));
                    i34 += h10;
                    i31 = i14;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 33:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list10 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o213 = J2.f35554a;
                    size = list10.size();
                    if (size != 0) {
                        n9 = J2.k(list10);
                        i19 = C4331i2.i(i36 << 3);
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
                    List list11 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o214 = J2.f35554a;
                    size = list11.size();
                    if (size != 0) {
                        n9 = J2.l(list11);
                        i19 = C4331i2.i(i36 << 3);
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
                    List list12 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o215 = J2.f35554a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(size6, C4331i2.i(i36 << 3), size6, i34);
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
                    List list13 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o216 = J2.f35554a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(size7, C4331i2.i(i36 << 3), size7, i34);
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
                    int j18 = J2.j((List) unsafe.getObject(abstractC4355o22, j12));
                    if (j18 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(j18, C4331i2.i(i36 << 3), j18, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5806M /* 38 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int n11 = J2.n((List) unsafe.getObject(abstractC4355o22, j12));
                    if (n11 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(n11, C4331i2.i(i36 << 3), n11, i34);
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
                    int i52 = J2.i((List) unsafe.getObject(abstractC4355o22, j12));
                    if (i52 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(i52, C4331i2.i(i36 << 3), i52, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5808O /* 40 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list14 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o217 = J2.f35554a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(size8, C4331i2.i(i36 << 3), size8, i34);
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
                    List list15 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o218 = J2.f35554a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(size9, C4331i2.i(i36 << 3), size9, i34);
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
                    List list16 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o219 = J2.f35554a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(size10, C4331i2.i(i36 << 3), size10, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5811R /* 43 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int m9 = J2.m((List) unsafe.getObject(abstractC4355o22, j12));
                    if (m9 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(m9, C4331i2.i(i36 << 3), m9, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5812S /* 44 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int f3 = J2.f((List) unsafe.getObject(abstractC4355o22, j12));
                    if (f3 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(f3, C4331i2.i(i36 << 3), f3, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5813T /* 45 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list17 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o220 = J2.f35554a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(size11, C4331i2.i(i36 << 3), size11, i34);
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
                    List list18 = (List) unsafe.getObject(abstractC4355o22, j12);
                    O2 o221 = J2.f35554a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(size12, C4331i2.i(i36 << 3), size12, i34);
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
                    int k9 = J2.k((List) unsafe.getObject(abstractC4355o22, j12));
                    if (k9 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(k9, C4331i2.i(i36 << 3), k9, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5816W /* 48 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    int l9 = J2.l((List) unsafe.getObject(abstractC4355o22, j12));
                    if (l9 > 0) {
                        i34 = com.anythink.basead.exoplayer.f.f.z(l9, C4331i2.i(i36 << 3), l9, i34);
                    }
                    i29 = i17;
                    i31 = i15;
                    i33 = i16;
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f5817X /* 49 */:
                    i15 = i31;
                    i16 = i33;
                    i17 = i29;
                    List list19 = (List) unsafe.getObject(abstractC4355o22, j12);
                    I2 p12 = c22.p(i32);
                    O2 o222 = J2.f35554a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i22 = 0;
                    } else {
                        i22 = 0;
                        for (int i53 = 0; i53 < size13; i53++) {
                            AbstractC4307c2 abstractC4307c22 = (AbstractC4307c2) list19.get(i53);
                            int i54 = C4331i2.i(i36 << 3);
                            i22 += abstractC4307c22.b(p12) + i54 + i54;
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
                    C4394y2 c4394y2 = (C4394y2) unsafe.getObject(abstractC4355o22, j12);
                    C4390x2 c4390x2 = (C4390x2) c22.f35497b[i55 + i55];
                    if (c4394y2.isEmpty()) {
                        i23 = 0;
                    } else {
                        Iterator it2 = c4394y2.entrySet().iterator();
                        i23 = 0;
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c4390x2.getClass();
                            int i56 = i29;
                            int i57 = C4331i2.i(i36 << 3);
                            int i58 = i41;
                            C4344m c4344m = c4390x2.f35793a;
                            int i59 = C4343l2.f35713c;
                            int i60 = C4331i2.i(i40);
                            int i61 = i40;
                            W2 w23 = W2.f35630x;
                            int i62 = i31;
                            W2 w24 = (W2) c4344m.f35716n;
                            if (w24 == w23) {
                                i60 += i60;
                            }
                            X2 x22 = X2.f35637n;
                            switch (w24.ordinal()) {
                                case 0:
                                    i24 = i33;
                                    it = it2;
                                    ((Double) key).getClass();
                                    j9 = i61;
                                    int i63 = j9 + i60;
                                    int i64 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                        i64 += i64;
                                    }
                                    switch (w22.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            j10 = i61;
                                            int i65 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i65, i65, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 1:
                                            ((Float) value).getClass();
                                            j10 = i58;
                                            int i652 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i652, i652, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 2:
                                            j10 = C4331i2.j(((Long) value).longValue());
                                            int i6522 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i6522, i6522, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 3:
                                            j10 = C4331i2.j(((Long) value).longValue());
                                            int i65222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i65222, i65222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 4:
                                            j10 = C4331i2.j(((Integer) value).intValue());
                                            int i652222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i652222, i652222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 5:
                                            ((Long) value).getClass();
                                            j10 = i61;
                                            int i6522222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i6522222, i6522222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 6:
                                            ((Integer) value).getClass();
                                            j10 = i58;
                                            int i65222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i65222222, i65222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            j10 = i56;
                                            int i652222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i652222222, i652222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 8:
                                            if (value instanceof C4327h2) {
                                                d9 = ((C4327h2) value).d();
                                                i27 = C4331i2.i(d9);
                                                j10 = d9 + i27;
                                                int i6522222222 = j10 + i64 + i63;
                                                i23 = com.anythink.basead.exoplayer.f.f.z(i6522222222, i6522222222, i57, i23);
                                                i41 = i58;
                                                i29 = i56;
                                                i40 = i61;
                                                i31 = i62;
                                                i33 = i24;
                                                it2 = it;
                                            } else {
                                                j10 = C4331i2.h((String) value);
                                                int i65222222222 = j10 + i64 + i63;
                                                i23 = com.anythink.basead.exoplayer.f.f.z(i65222222222, i65222222222, i57, i23);
                                                i41 = i58;
                                                i29 = i56;
                                                i40 = i61;
                                                i31 = i62;
                                                i33 = i24;
                                                it2 = it;
                                            }
                                        case 9:
                                            j10 = ((AbstractC4307c2) value).c();
                                            int i652222222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i652222222222, i652222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 10:
                                            d9 = ((AbstractC4307c2) value).c();
                                            i27 = C4331i2.i(d9);
                                            j10 = d9 + i27;
                                            int i6522222222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i6522222222222, i6522222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 11:
                                            if (value instanceof C4327h2) {
                                                d9 = ((C4327h2) value).d();
                                                i27 = C4331i2.i(d9);
                                            } else {
                                                d9 = ((byte[]) value).length;
                                                i27 = C4331i2.i(d9);
                                            }
                                            j10 = d9 + i27;
                                            int i65222222222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i65222222222222, i65222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 12:
                                            j10 = C4331i2.i(((Integer) value).intValue());
                                            int i652222222222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i652222222222222, i652222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 13:
                                            j10 = C4331i2.j(((Integer) value).intValue());
                                            int i6522222222222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i6522222222222222, i6522222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 14:
                                            ((Integer) value).getClass();
                                            j10 = i58;
                                            int i65222222222222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i65222222222222222, i65222222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 15:
                                            ((Long) value).getClass();
                                            j10 = i61;
                                            int i652222222222222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i652222222222222222, i652222222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            j10 = C4331i2.i((intValue >> 31) ^ (intValue + intValue));
                                            int i6522222222222222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i6522222222222222222, i6522222222222222222, i57, i23);
                                            i41 = i58;
                                            i29 = i56;
                                            i40 = i61;
                                            i31 = i62;
                                            i33 = i24;
                                            it2 = it;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            j10 = C4331i2.j((longValue + longValue) ^ (longValue >> 63));
                                            int i65222222222222222222 = j10 + i64 + i63;
                                            i23 = com.anythink.basead.exoplayer.f.f.z(i65222222222222222222, i65222222222222222222, i57, i23);
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
                                    j9 = i58;
                                    int i632 = j9 + i60;
                                    int i642 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 2:
                                    i24 = i33;
                                    it = it2;
                                    j9 = C4331i2.j(((Long) key).longValue());
                                    int i6322 = j9 + i60;
                                    int i6422 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 3:
                                    i24 = i33;
                                    it = it2;
                                    j9 = C4331i2.j(((Long) key).longValue());
                                    int i63222 = j9 + i60;
                                    int i64222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 4:
                                    i24 = i33;
                                    it = it2;
                                    j9 = C4331i2.j(((Integer) key).intValue());
                                    int i632222 = j9 + i60;
                                    int i642222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 5:
                                    i24 = i33;
                                    it = it2;
                                    ((Long) key).getClass();
                                    j9 = i61;
                                    int i6322222 = j9 + i60;
                                    int i6422222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 6:
                                    i24 = i33;
                                    it = it2;
                                    ((Integer) key).getClass();
                                    j9 = i58;
                                    int i63222222 = j9 + i60;
                                    int i64222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 7:
                                    i24 = i33;
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    j9 = i56;
                                    int i632222222 = j9 + i60;
                                    int i642222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 8:
                                    i24 = i33;
                                    it = it2;
                                    if (key instanceof C4327h2) {
                                        d2 = ((C4327h2) key).d();
                                        i25 = C4331i2.i(d2);
                                        j9 = d2 + i25;
                                        int i6322222222 = j9 + i60;
                                        int i6422222222 = C4331i2.i(16);
                                        w22 = (W2) c4344m.f35717u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    } else {
                                        j9 = C4331i2.h((String) key);
                                        int i63222222222 = j9 + i60;
                                        int i64222222222 = C4331i2.i(16);
                                        w22 = (W2) c4344m.f35717u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    }
                                case 9:
                                    i24 = i33;
                                    it = it2;
                                    j9 = ((AbstractC4307c2) key).c();
                                    int i632222222222 = j9 + i60;
                                    int i642222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 10:
                                    i24 = i33;
                                    it = it2;
                                    d2 = ((AbstractC4307c2) key).c();
                                    i25 = C4331i2.i(d2);
                                    j9 = d2 + i25;
                                    int i6322222222222 = j9 + i60;
                                    int i6422222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 11:
                                    i24 = i33;
                                    it = it2;
                                    if (key instanceof C4327h2) {
                                        d2 = ((C4327h2) key).d();
                                        i25 = C4331i2.i(d2);
                                    } else {
                                        d2 = ((byte[]) key).length;
                                        i25 = C4331i2.i(d2);
                                    }
                                    j9 = d2 + i25;
                                    int i63222222222222 = j9 + i60;
                                    int i64222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 12:
                                    i24 = i33;
                                    it = it2;
                                    j9 = C4331i2.i(((Integer) key).intValue());
                                    int i632222222222222 = j9 + i60;
                                    int i642222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 13:
                                    i24 = i33;
                                    it = it2;
                                    j9 = C4331i2.j(((Integer) key).intValue());
                                    int i6322222222222222 = j9 + i60;
                                    int i6422222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    i24 = i33;
                                    it = it2;
                                    j9 = i58;
                                    int i63222222222222222 = j9 + i60;
                                    int i64222222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    i24 = i33;
                                    it = it2;
                                    j9 = i61;
                                    int i632222222222222222 = j9 + i60;
                                    int i642222222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    i26 = C4331i2.i((intValue2 + intValue2) ^ (intValue2 >> 31));
                                    i24 = i33;
                                    it = it2;
                                    j9 = i26;
                                    int i6322222222222222222 = j9 + i60;
                                    int i6422222222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    i26 = C4331i2.j((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    i24 = i33;
                                    it = it2;
                                    j9 = i26;
                                    int i63222222222222222222 = j9 + i60;
                                    int i64222222222222222222 = C4331i2.i(16);
                                    w22 = (W2) c4344m.f35717u;
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
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 8, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 52:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 4, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        long o6 = o(j12, abstractC4355o22);
                        i28 = C4331i2.i(i36 << 3);
                        j11 = C4331i2.j(o6);
                        i34 += j11 + i28;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 54:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        long o9 = o(j12, abstractC4355o22);
                        i28 = C4331i2.i(i36 << 3);
                        j11 = C4331i2.j(o9);
                        i34 += j11 + i28;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 55:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        long l10 = l(j12, abstractC4355o22);
                        i28 = C4331i2.i(i36 << 3);
                        j11 = C4331i2.j(l10);
                        i34 += j11 + i28;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case p.a.f19679e /* 56 */:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 8, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 57:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 4, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 58:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, i29, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case j.v.f12591n /* 59 */:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        int i66 = i36 << 3;
                        Object object3 = unsafe.getObject(abstractC4355o22, j12);
                        if (object3 instanceof C4327h2) {
                            int i67 = C4331i2.i(i66);
                            int d14 = ((C4327h2) object3).d();
                            i34 = com.anythink.basead.exoplayer.f.f.z(d14, d14, i67, i34);
                        } else {
                            i28 = C4331i2.i(i66);
                            j11 = C4331i2.h((String) object3);
                            i34 += j11 + i28;
                        }
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 60:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        Object object4 = unsafe.getObject(abstractC4355o22, j12);
                        I2 p13 = c22.p(i32);
                        O2 o223 = J2.f35554a;
                        int i68 = C4331i2.i(i36 << 3);
                        int b11 = ((AbstractC4307c2) object4).b(p13);
                        i34 = com.anythink.basead.exoplayer.f.f.z(b11, b11, i68, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 61:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        C4327h2 c4327h22 = (C4327h2) unsafe.getObject(abstractC4355o22, j12);
                        int i69 = C4331i2.i(i36 << 3);
                        int d15 = c4327h22.d();
                        i34 = com.anythink.basead.exoplayer.f.f.z(d15, d15, i69, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 62:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(l(j12, abstractC4355o22), C4331i2.i(i36 << 3), i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 63:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        long l11 = l(j12, abstractC4355o22);
                        i28 = C4331i2.i(i36 << 3);
                        j11 = C4331i2.j(l11);
                        i34 += j11 + i28;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 64:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 4, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case j.v.f12576G /* 65 */:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        i34 = com.anythink.basead.exoplayer.f.f.w(i36 << 3, 8, i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case 66:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        int l12 = l(j12, abstractC4355o22);
                        i34 = com.anythink.basead.exoplayer.f.f.w((l12 >> 31) ^ (l12 + l12), C4331i2.i(i36 << 3), i34);
                    }
                    i32 += 3;
                    i30 = 1048575;
                    c22 = this;
                case j.v.f12582d /* 67 */:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        long o10 = o(j12, abstractC4355o22);
                        i28 = C4331i2.i(i36 << 3);
                        j11 = C4331i2.j((o10 >> 63) ^ (o10 + o10));
                        i34 += j11 + i28;
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    } else {
                        i32 += 3;
                        i30 = 1048575;
                        c22 = this;
                    }
                case 68:
                    if (c22.j(i36, i32, abstractC4355o22)) {
                        AbstractC4307c2 abstractC4307c23 = (AbstractC4307c2) unsafe.getObject(abstractC4355o22, j12);
                        I2 p14 = c22.p(i32);
                        O2 o224 = J2.f35554a;
                        int i70 = C4331i2.i(i36 << 3);
                        i10 = abstractC4307c23.b(p14) + i70 + i70;
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
        int i6;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < this.f35500e) {
            int i13 = this.f35499d[i11];
            int[] iArr = this.f35496a;
            int i14 = iArr[i13];
            int n9 = n(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i10 = f35495h.getInt(obj, i16);
                }
                i6 = i13;
                i9 = i10;
                i = i16;
            } else {
                int i18 = i10;
                i = i12;
                i6 = i13;
                i9 = i18;
            }
            if ((268435456 & n9) == 0 || w(obj, i6, i, i9, i17)) {
                int m4 = m(n9);
                if (m4 == 9 || m4 == 17) {
                    if (w(obj, i6, i, i9, i17) && !p(i6).g(T2.g(n9 & 1048575, obj))) {
                    }
                    i11++;
                    i12 = i;
                    i10 = i9;
                } else {
                    if (m4 != 27) {
                        if (m4 == 60 || m4 == 68) {
                            if (j(i14, i6, obj) && !p(i6).g(T2.g(n9 & 1048575, obj))) {
                            }
                            i11++;
                            i12 = i;
                            i10 = i9;
                        } else if (m4 != 49) {
                            if (m4 != 50) {
                                continue;
                            } else {
                                C4394y2 c4394y2 = (C4394y2) T2.g(n9 & 1048575, obj);
                                if (c4394y2.isEmpty()) {
                                    continue;
                                } else {
                                    int i19 = i6 / 3;
                                    if (((W2) ((C4390x2) this.f35497b[i19 + i19]).f35793a.f35717u).f35632n == X2.f35635B) {
                                        I2 i22 = null;
                                        for (Object obj2 : c4394y2.values()) {
                                            if (i22 == null) {
                                                i22 = F2.f35514c.a(obj2.getClass());
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
                        I2 p9 = p(i6);
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            if (p9.g(list.get(i20))) {
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
    public final AbstractC4355o2 i() {
        return (AbstractC4355o2) ((AbstractC4355o2) this.f35498c).f(4);
    }

    public final boolean j(int i, int i6, Object obj) {
        return T2.d((long) (this.f35496a[i6 + 2] & 1048575), obj) == i;
    }

    public final int n(int i) {
        return this.f35496a[i + 1];
    }

    public final I2 p(int i) {
        int i6 = i / 3;
        int i9 = i6 + i6;
        Object[] objArr = this.f35497b;
        I2 i22 = (I2) objArr[i9];
        if (i22 != null) {
            return i22;
        }
        I2 a9 = F2.f35514c.a((Class) objArr[i9 + 1]);
        objArr[i9] = a9;
        return a9;
    }

    public final void r(int i, Object obj, Object obj2) {
        if (v(i, obj2)) {
            int n9 = n(i) & 1048575;
            Unsafe unsafe = f35495h;
            long j6 = n9;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f35496a[i] + " is present but null: " + obj2.toString());
            }
            I2 p9 = p(i);
            if (!v(i, obj)) {
                if (h(object)) {
                    AbstractC4355o2 i6 = p9.i();
                    p9.e(i6, object);
                    unsafe.putObject(obj, j6, i6);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!h(object2)) {
                AbstractC4355o2 i9 = p9.i();
                p9.e(i9, object2);
                unsafe.putObject(obj, j6, i9);
                object2 = i9;
            }
            p9.e(object2, object);
        }
    }

    public final void s(int i, Object obj, Object obj2) {
        int[] iArr = this.f35496a;
        int i6 = iArr[i];
        if (j(i6, i, obj2)) {
            int n9 = n(i) & 1048575;
            Unsafe unsafe = f35495h;
            long j6 = n9;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            I2 p9 = p(i);
            if (!j(i6, i, obj)) {
                if (h(object)) {
                    AbstractC4355o2 i9 = p9.i();
                    p9.e(i9, object);
                    unsafe.putObject(obj, j6, i9);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                T2.i(i6, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!h(object2)) {
                AbstractC4355o2 i10 = p9.i();
                p9.e(i10, object2);
                unsafe.putObject(obj, j6, i10);
                object2 = i10;
            }
            p9.e(object2, object);
        }
    }

    public final void t(int i, Object obj) {
        int i6 = this.f35496a[i + 2];
        long j6 = 1048575 & i6;
        if (j6 == 1048575) {
            return;
        }
        T2.i((1 << (i6 >>> 20)) | T2.d(j6, obj), j6, obj);
    }

    public final boolean u(AbstractC4355o2 abstractC4355o2, AbstractC4355o2 abstractC4355o22, int i) {
        return v(i, abstractC4355o2) == v(i, abstractC4355o22);
    }

    public final boolean v(int i, Object obj) {
        int i6 = this.f35496a[i + 2];
        long j6 = i6 & 1048575;
        if (j6 == 1048575) {
            int n9 = n(i);
            long j9 = n9 & 1048575;
            switch (m(n9)) {
                case 0:
                    if (Double.doubleToRawLongBits(T2.f35617c.a(j9, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(T2.f35617c.b(j9, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (T2.e(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (T2.e(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (T2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (T2.e(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (T2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return T2.f35617c.g(j9, obj);
                case 8:
                    Object g4 = T2.g(j9, obj);
                    if (g4 instanceof String) {
                        if (((String) g4).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(g4 instanceof C4327h2)) {
                            throw new IllegalArgumentException();
                        }
                        if (C4327h2.f35681v.equals(g4)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (T2.g(j9, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (C4327h2.f35681v.equals(T2.g(j9, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (T2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (T2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (T2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (T2.e(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (T2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (T2.e(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (T2.g(j9, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i6 >>> 20)) & T2.d(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean w(Object obj, int i, int i6, int i9, int i10) {
        return i6 == 1048575 ? v(i, obj) : (i9 & i10) != 0;
    }
}
