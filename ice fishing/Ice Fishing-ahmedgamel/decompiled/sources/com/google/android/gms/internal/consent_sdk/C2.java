package com.google.android.gms.internal.consent_sdk;

import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.p;
import com.google.android.gms.internal.ads.Wv;
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
    public static final int[] f36263g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public static final Unsafe f36264h = T2.h();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f36265a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f36266b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4330c2 f36267c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f36268d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36269e;

    /* renamed from: f, reason: collision with root package name */
    public final O2 f36270f;

    public C2(int[] iArr, Object[] objArr, AbstractC4330c2 abstractC4330c2, int[] iArr2, int i, O2 o22, J1 j12) {
        this.f36265a = iArr;
        this.f36266b = objArr;
        this.f36268d = iArr2;
        this.f36269e = i;
        this.f36270f = o22;
        this.f36267c = abstractC4330c2;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC4378o2) {
            return ((AbstractC4378o2) obj).e();
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
        int i6;
        int[] iArr;
        int i9;
        int i10;
        char charAt3;
        int i11;
        char charAt4;
        int i12;
        char charAt5;
        int i13;
        char charAt6;
        int i14;
        int i15;
        int i16;
        char charAt7;
        int i17;
        char charAt8;
        int i18;
        int i19;
        Object[] objArr;
        int i20;
        int i21;
        int i22;
        int objectFieldOffset;
        String str;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Field q8;
        int i29;
        char charAt9;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field q9;
        Object obj2;
        Field q10;
        int i34;
        char charAt10;
        int i35;
        char charAt11;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        if (!(h22 instanceof H2)) {
            h22.getClass();
            throw new ClassCastException();
        }
        String str2 = h22.f36295b;
        int length = str2.length();
        char c9 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i = i38 + 1;
                if (str2.charAt(i38) < 55296) {
                    break;
                }
                i38 = i;
            }
        } else {
            i = 1;
        }
        int i39 = i + 1;
        int charAt14 = str2.charAt(i);
        if (charAt14 >= 55296) {
            int i40 = charAt14 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                charAt13 = str2.charAt(i39);
                if (charAt13 < 55296) {
                    break;
                }
                i40 |= (charAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            charAt14 = i40 | (charAt13 << i41);
            i39 = i37;
        }
        if (charAt14 == 0) {
            charAt = 0;
            charAt2 = 0;
            i4 = 0;
            i9 = 0;
            iArr = f36263g;
            i6 = 0;
        } else {
            int i42 = i39 + 1;
            int charAt15 = str2.charAt(i39);
            if (charAt15 >= 55296) {
                int i43 = charAt15 & 8191;
                int i44 = 13;
                while (true) {
                    i17 = i42 + 1;
                    charAt8 = str2.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i17;
                }
                charAt15 = i43 | (charAt8 << i44);
                i42 = i17;
            }
            int i45 = i42 + 1;
            int charAt16 = str2.charAt(i42);
            if (charAt16 >= 55296) {
                int i46 = charAt16 & 8191;
                int i47 = 13;
                while (true) {
                    i16 = i45 + 1;
                    charAt7 = str2.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i16;
                }
                charAt16 = i46 | (charAt7 << i47);
                i45 = i16;
            }
            int i48 = i45 + 1;
            if (str2.charAt(i45) >= 55296) {
                while (true) {
                    i15 = i48 + 1;
                    if (str2.charAt(i48) < 55296) {
                        break;
                    }
                    i48 = i15;
                }
                i48 = i15;
            }
            int i49 = i48 + 1;
            if (str2.charAt(i48) >= 55296) {
                while (true) {
                    i14 = i49 + 1;
                    if (str2.charAt(i49) < 55296) {
                        break;
                    }
                    i49 = i14;
                }
                i49 = i14;
            }
            int i50 = i49 + 1;
            charAt = str2.charAt(i49);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i13 = i50 + 1;
                    charAt6 = str2.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i13;
                }
                charAt = i51 | (charAt6 << i52);
                i50 = i13;
            }
            int i53 = i50 + 1;
            charAt2 = str2.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i12 = i53 + 1;
                    charAt5 = str2.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i12;
                }
                charAt2 = i54 | (charAt5 << i55);
                i53 = i12;
            }
            int i56 = i53 + 1;
            int charAt17 = str2.charAt(i53);
            if (charAt17 >= 55296) {
                int i57 = charAt17 & 8191;
                int i58 = 13;
                while (true) {
                    i11 = i56 + 1;
                    charAt4 = str2.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i11;
                }
                charAt17 = i57 | (charAt4 << i58);
                i56 = i11;
            }
            int i59 = i56 + 1;
            int charAt18 = str2.charAt(i56);
            if (charAt18 >= 55296) {
                int i60 = charAt18 & 8191;
                int i61 = 13;
                while (true) {
                    i10 = i59 + 1;
                    charAt3 = str2.charAt(i59);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i60 |= (charAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i10;
                }
                charAt18 = i60 | (charAt3 << i61);
                i59 = i10;
            }
            int i62 = charAt18 + charAt2 + charAt17;
            i4 = charAt15 + charAt15 + charAt16;
            i6 = charAt15;
            i39 = i59;
            iArr = new int[i62];
            i9 = charAt18;
        }
        Unsafe unsafe = f36264h;
        Class<?> cls = h22.f36294a.getClass();
        int i63 = charAt2 + i9;
        int i64 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr2 = new Object[i64];
        int i65 = i9;
        int i66 = 0;
        int i67 = 0;
        while (i39 < length) {
            int i68 = i39 + 1;
            int charAt19 = str2.charAt(i39);
            if (charAt19 >= c9) {
                int i69 = charAt19 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i36 = i70 + 1;
                    charAt12 = str2.charAt(i70);
                    if (charAt12 < c9) {
                        break;
                    }
                    i69 |= (charAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i36;
                }
                charAt19 = i69 | (charAt12 << i71);
                i18 = i36;
            } else {
                i18 = i68;
            }
            int i72 = i18 + 1;
            int charAt20 = str2.charAt(i18);
            if (charAt20 >= c9) {
                int i73 = charAt20 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i35 = i74 + 1;
                    charAt11 = str2.charAt(i74);
                    if (charAt11 < c9) {
                        break;
                    }
                    i73 |= (charAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i35;
                }
                charAt20 = i73 | (charAt11 << i75);
                i19 = i35;
            } else {
                i19 = i72;
            }
            if ((charAt20 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i76 = charAt20 & com.anythink.basead.exoplayer.k.p.f9259b;
            int i77 = length;
            int i78 = charAt20 & 2048;
            Object[] objArr3 = h22.f36296c;
            if (i76 >= 51) {
                int i79 = i19 + 1;
                int charAt21 = str2.charAt(i19);
                char c10 = 55296;
                if (charAt21 >= 55296) {
                    int i80 = charAt21 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i34 = i81 + 1;
                        charAt10 = str2.charAt(i81);
                        if (charAt10 < c10) {
                            break;
                        }
                        i80 |= (charAt10 & 8191) << i82;
                        i82 += 13;
                        i81 = i34;
                        c10 = 55296;
                    }
                    charAt21 = i80 | (charAt10 << i82);
                    i31 = i34;
                } else {
                    i31 = i79;
                }
                int i83 = i31;
                int i84 = i76 - 51;
                objArr = objArr2;
                if (i84 == 9 || i84 == 17) {
                    i32 = i4 + 1;
                    int i85 = i67 / 3;
                    objArr[i85 + i85 + 1] = objArr3[i4];
                } else {
                    if (i84 == 12) {
                        if (h22.a() == 1 || i78 != 0) {
                            i32 = i4 + 1;
                            int i86 = i67 / 3;
                            objArr[i86 + i86 + 1] = objArr3[i4];
                        } else {
                            i33 = 0;
                            int i87 = charAt21 + charAt21;
                            obj = objArr3[i87];
                            int i88 = i33;
                            if (obj instanceof Field) {
                                q9 = (Field) obj;
                            } else {
                                q9 = q(cls, (String) obj);
                                objArr3[i87] = q9;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(q9);
                            int i89 = i87 + 1;
                            obj2 = objArr3[i89];
                            if (obj2 instanceof Field) {
                                q10 = (Field) obj2;
                            } else {
                                q10 = q(cls, (String) obj2);
                                objArr3[i89] = q10;
                            }
                            str = str2;
                            i27 = (int) unsafe.objectFieldOffset(q10);
                            i28 = i88;
                            i25 = i83;
                            objectFieldOffset = objectFieldOffset2;
                            i20 = charAt19;
                            i26 = 0;
                        }
                    }
                    i33 = i78;
                    int i872 = charAt21 + charAt21;
                    obj = objArr3[i872];
                    int i882 = i33;
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(q9);
                    int i892 = i872 + 1;
                    obj2 = objArr3[i892];
                    if (obj2 instanceof Field) {
                    }
                    str = str2;
                    i27 = (int) unsafe.objectFieldOffset(q10);
                    i28 = i882;
                    i25 = i83;
                    objectFieldOffset = objectFieldOffset22;
                    i20 = charAt19;
                    i26 = 0;
                }
                i4 = i32;
                i33 = i78;
                int i8722 = charAt21 + charAt21;
                obj = objArr3[i8722];
                int i8822 = i33;
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(q9);
                int i8922 = i8722 + 1;
                obj2 = objArr3[i8922];
                if (obj2 instanceof Field) {
                }
                str = str2;
                i27 = (int) unsafe.objectFieldOffset(q10);
                i28 = i8822;
                i25 = i83;
                objectFieldOffset = objectFieldOffset222;
                i20 = charAt19;
                i26 = 0;
            } else {
                objArr = objArr2;
                int i90 = i4 + 1;
                Field q11 = q(cls, (String) objArr3[i4]);
                if (i76 == 9 || i76 == 17) {
                    i20 = charAt19;
                    int i91 = i67 / 3;
                    objArr[i91 + i91 + 1] = q11.getType();
                } else {
                    if (i76 == 27) {
                        i20 = charAt19;
                        i30 = 1;
                        i4 += 2;
                    } else if (i76 == 49) {
                        i4 += 2;
                        i20 = charAt19;
                        i30 = 1;
                    } else {
                        if (i76 == 12 || i76 == 30 || i76 == 44) {
                            i20 = charAt19;
                            if (h22.a() == 1 || i78 != 0) {
                                i4 += 2;
                                int i92 = i67 / 3;
                                objArr[i92 + i92 + 1] = objArr3[i90];
                                i21 = i19;
                                i22 = i78;
                            } else {
                                i21 = i19;
                                i4 = i90;
                                i22 = 0;
                            }
                        } else if (i76 == 50) {
                            int i93 = i4 + 2;
                            int i94 = i65 + 1;
                            iArr[i65] = i67;
                            int i95 = i67 / 3;
                            int i96 = i95 + i95;
                            objArr[i96] = objArr3[i90];
                            if (i78 != 0) {
                                i4 += 3;
                                objArr[i96 + 1] = objArr3[i93];
                                i21 = i19;
                                i22 = i78;
                                i65 = i94;
                            } else {
                                i4 = i93;
                                i21 = i19;
                                i65 = i94;
                                i22 = 0;
                            }
                            i20 = charAt19;
                        } else {
                            i20 = charAt19;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(q11);
                        if ((charAt20 & 4096) != 0 || i76 > 17) {
                            str = str2;
                            int i97 = i21;
                            i23 = i22;
                            i24 = 1048575;
                            i25 = i97;
                            i26 = 0;
                        } else {
                            i25 = i21 + 1;
                            int charAt22 = str2.charAt(i21);
                            i23 = i22;
                            if (charAt22 >= 55296) {
                                int i98 = charAt22 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i29 = i25 + 1;
                                    charAt9 = str2.charAt(i25);
                                    if (charAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (charAt9 & 8191) << i99;
                                    i99 += 13;
                                    i25 = i29;
                                }
                                charAt22 = i98 | (charAt9 << i99);
                                i25 = i29;
                            }
                            int i100 = (charAt22 / 32) + i6 + i6;
                            Object obj3 = objArr3[i100];
                            str = str2;
                            if (obj3 instanceof Field) {
                                q8 = (Field) obj3;
                            } else {
                                q8 = q(cls, (String) obj3);
                                objArr3[i100] = q8;
                            }
                            i26 = charAt22 % 32;
                            i24 = (int) unsafe.objectFieldOffset(q8);
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i63] = objectFieldOffset;
                            i63++;
                        }
                        i27 = i24;
                        i28 = i23;
                    }
                    int i101 = i67 / 3;
                    objArr[i101 + i101 + i30] = objArr3[i90];
                    i21 = i19;
                    i22 = i78;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(q11);
                    if ((charAt20 & 4096) != 0) {
                    }
                    str = str2;
                    int i972 = i21;
                    i23 = i22;
                    i24 = 1048575;
                    i25 = i972;
                    i26 = 0;
                    if (i76 >= 18) {
                        iArr[i63] = objectFieldOffset;
                        i63++;
                    }
                    i27 = i24;
                    i28 = i23;
                }
                i21 = i19;
                i22 = i78;
                i4 = i90;
                objectFieldOffset = (int) unsafe.objectFieldOffset(q11);
                if ((charAt20 & 4096) != 0) {
                }
                str = str2;
                int i9722 = i21;
                i23 = i22;
                i24 = 1048575;
                i25 = i9722;
                i26 = 0;
                if (i76 >= 18) {
                }
                i27 = i24;
                i28 = i23;
            }
            int i102 = i67 + 1;
            iArr2[i67] = i20;
            int i103 = i67 + 2;
            int i104 = i27;
            iArr2[i102] = ((charAt20 & 512) != 0 ? 536870912 : 0) | ((charAt20 & 256) != 0 ? 268435456 : 0) | (i28 != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | objectFieldOffset;
            i67 += 3;
            iArr2[i103] = (i26 << 20) | i104;
            i39 = i25;
            length = i77;
            str2 = str;
            objArr2 = objArr;
            c9 = 55296;
        }
        return new C2(iArr2, objArr2, h22.f36294a, iArr, i9, o22, j12);
    }

    public static int l(long j6, Object obj) {
        return ((Integer) T2.g(j6, obj)).intValue();
    }

    public static int m(int i) {
        return (i >>> 20) & com.anythink.basead.exoplayer.k.p.f9259b;
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
        if (obj instanceof AbstractC4378o2) {
            AbstractC4378o2 abstractC4378o2 = (AbstractC4378o2) obj;
            abstractC4378o2.d();
            abstractC4378o2.zza = 0;
            abstractC4378o2.k();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f36265a;
            if (i >= iArr.length) {
                this.f36270f.getClass();
                N2 n22 = ((AbstractC4378o2) obj).zzc;
                if (n22.f36351d) {
                    n22.f36351d = false;
                    return;
                }
                return;
            }
            int n9 = n(i);
            int i4 = 1048575 & n9;
            int m9 = m(n9);
            long j6 = i4;
            if (m9 != 9) {
                if (m9 != 60 && m9 != 68) {
                    switch (m9) {
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
                            AbstractC4334d2 abstractC4334d2 = (AbstractC4334d2) ((InterfaceC4389r2) T2.g(j6, obj));
                            if (!abstractC4334d2.f36433n) {
                                break;
                            } else {
                                abstractC4334d2.f36433n = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = f36264h;
                            Object object = unsafe.getObject(obj, j6);
                            if (object == null) {
                                break;
                            } else {
                                ((C4417y2) object).f36566n = false;
                                unsafe.putObject(obj, j6, object);
                                break;
                            }
                    }
                } else if (j(iArr[i], i, obj)) {
                    p(i).a(f36264h.getObject(obj, j6));
                }
                i += 3;
            }
            if (v(i, obj)) {
                p(i).a(f36264h.getObject(obj, j6));
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
    public final int b(AbstractC4378o2 abstractC4378o2) {
        int i;
        long doubleToLongBits;
        int i4;
        int floatToIntBits;
        int i6;
        int i9;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f36265a;
            if (i10 >= iArr.length) {
                abstractC4378o2.zzc.getClass();
                return (i11 * 53) + 506991;
            }
            int n9 = n(i10);
            int i12 = 1048575 & n9;
            int m9 = m(n9);
            int i13 = iArr[i10];
            long j6 = i12;
            int i14 = 1237;
            int i15 = 37;
            switch (m9) {
                case 0:
                    i = i11 * 53;
                    doubleToLongBits = Double.doubleToLongBits(T2.f36386c.a(j6, abstractC4378o2));
                    Charset charset = AbstractC4393s2.f36513a;
                    i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i4 = i11 * 53;
                    floatToIntBits = Float.floatToIntBits(T2.f36386c.b(j6, abstractC4378o2));
                    i11 = floatToIntBits + i4;
                    break;
                case 2:
                    i = i11 * 53;
                    doubleToLongBits = T2.e(j6, abstractC4378o2);
                    Charset charset2 = AbstractC4393s2.f36513a;
                    i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i11 * 53;
                    doubleToLongBits = T2.e(j6, abstractC4378o2);
                    Charset charset3 = AbstractC4393s2.f36513a;
                    i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i4 = i11 * 53;
                    floatToIntBits = T2.d(j6, abstractC4378o2);
                    i11 = floatToIntBits + i4;
                    break;
                case 5:
                    i = i11 * 53;
                    doubleToLongBits = T2.e(j6, abstractC4378o2);
                    Charset charset4 = AbstractC4393s2.f36513a;
                    i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i4 = i11 * 53;
                    floatToIntBits = T2.d(j6, abstractC4378o2);
                    i11 = floatToIntBits + i4;
                    break;
                case 7:
                    i6 = i11 * 53;
                    boolean g9 = T2.f36386c.g(j6, abstractC4378o2);
                    Charset charset5 = AbstractC4393s2.f36513a;
                    break;
                case 8:
                    i4 = i11 * 53;
                    floatToIntBits = ((String) T2.g(j6, abstractC4378o2)).hashCode();
                    i11 = floatToIntBits + i4;
                    break;
                case 9:
                    i9 = i11 * 53;
                    Object g10 = T2.g(j6, abstractC4378o2);
                    if (g10 != null) {
                        i15 = g10.hashCode();
                    }
                    i11 = i9 + i15;
                    break;
                case 10:
                    i4 = i11 * 53;
                    floatToIntBits = T2.g(j6, abstractC4378o2).hashCode();
                    i11 = floatToIntBits + i4;
                    break;
                case 11:
                    i4 = i11 * 53;
                    floatToIntBits = T2.d(j6, abstractC4378o2);
                    i11 = floatToIntBits + i4;
                    break;
                case 12:
                    i4 = i11 * 53;
                    floatToIntBits = T2.d(j6, abstractC4378o2);
                    i11 = floatToIntBits + i4;
                    break;
                case 13:
                    i4 = i11 * 53;
                    floatToIntBits = T2.d(j6, abstractC4378o2);
                    i11 = floatToIntBits + i4;
                    break;
                case 14:
                    i = i11 * 53;
                    doubleToLongBits = T2.e(j6, abstractC4378o2);
                    Charset charset6 = AbstractC4393s2.f36513a;
                    i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i4 = i11 * 53;
                    floatToIntBits = T2.d(j6, abstractC4378o2);
                    i11 = floatToIntBits + i4;
                    break;
                case 16:
                    i = i11 * 53;
                    doubleToLongBits = T2.e(j6, abstractC4378o2);
                    Charset charset7 = AbstractC4393s2.f36513a;
                    i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i9 = i11 * 53;
                    Object g11 = T2.g(j6, abstractC4378o2);
                    if (g11 != null) {
                        i15 = g11.hashCode();
                    }
                    i11 = i9 + i15;
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
                    i4 = i11 * 53;
                    floatToIntBits = T2.g(j6, abstractC4378o2).hashCode();
                    i11 = floatToIntBits + i4;
                    break;
                case 50:
                    i4 = i11 * 53;
                    floatToIntBits = T2.g(j6, abstractC4378o2).hashCode();
                    i11 = floatToIntBits + i4;
                    break;
                case 51:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i = i11 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) T2.g(j6, abstractC4378o2)).doubleValue());
                        Charset charset8 = AbstractC4393s2.f36513a;
                        i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) T2.g(j6, abstractC4378o2)).floatValue());
                        i11 = floatToIntBits + i4;
                        break;
                    }
                case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i = i11 * 53;
                        doubleToLongBits = o(j6, abstractC4378o2);
                        Charset charset9 = AbstractC4393s2.f36513a;
                        i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i = i11 * 53;
                        doubleToLongBits = o(j6, abstractC4378o2);
                        Charset charset10 = AbstractC4393s2.f36513a;
                        i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = l(j6, abstractC4378o2);
                        i11 = floatToIntBits + i4;
                        break;
                    }
                case p.a.f20466e /* 56 */:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i = i11 * 53;
                        doubleToLongBits = o(j6, abstractC4378o2);
                        Charset charset11 = AbstractC4393s2.f36513a;
                        i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = l(j6, abstractC4378o2);
                        i11 = floatToIntBits + i4;
                        break;
                    }
                case 58:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        boolean booleanValue = ((Boolean) T2.g(j6, abstractC4378o2)).booleanValue();
                        Charset charset12 = AbstractC4393s2.f36513a;
                        break;
                    }
                case j.v.f13377n /* 59 */:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = ((String) T2.g(j6, abstractC4378o2)).hashCode();
                        i11 = floatToIntBits + i4;
                        break;
                    }
                case 60:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = T2.g(j6, abstractC4378o2).hashCode();
                        i11 = floatToIntBits + i4;
                        break;
                    }
                case 61:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = T2.g(j6, abstractC4378o2).hashCode();
                        i11 = floatToIntBits + i4;
                        break;
                    }
                case 62:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = l(j6, abstractC4378o2);
                        i11 = floatToIntBits + i4;
                        break;
                    }
                case 63:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = l(j6, abstractC4378o2);
                        i11 = floatToIntBits + i4;
                        break;
                    }
                case 64:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = l(j6, abstractC4378o2);
                        i11 = floatToIntBits + i4;
                        break;
                    }
                case j.v.f13362G /* 65 */:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i = i11 * 53;
                        doubleToLongBits = o(j6, abstractC4378o2);
                        Charset charset13 = AbstractC4393s2.f36513a;
                        i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = l(j6, abstractC4378o2);
                        i11 = floatToIntBits + i4;
                        break;
                    }
                case j.v.f13368d /* 67 */:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i = i11 * 53;
                        doubleToLongBits = o(j6, abstractC4378o2);
                        Charset charset14 = AbstractC4393s2.f36513a;
                        i11 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!j(i13, i10, abstractC4378o2)) {
                        break;
                    } else {
                        i4 = i11 * 53;
                        floatToIntBits = T2.g(j6, abstractC4378o2).hashCode();
                        i11 = floatToIntBits + i4;
                        break;
                    }
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean c(AbstractC4378o2 abstractC4378o2, AbstractC4378o2 abstractC4378o22) {
        boolean e9;
        int i = 0;
        while (true) {
            int[] iArr = this.f36265a;
            if (i < iArr.length) {
                int n9 = n(i);
                long j6 = n9 & 1048575;
                switch (m(n9)) {
                    case 0:
                        if (!u(abstractC4378o2, abstractC4378o22, i)) {
                            break;
                        } else {
                            S2 s22 = T2.f36386c;
                            if (Double.doubleToLongBits(s22.a(j6, abstractC4378o2)) != Double.doubleToLongBits(s22.a(j6, abstractC4378o22))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!u(abstractC4378o2, abstractC4378o22, i)) {
                            break;
                        } else {
                            S2 s23 = T2.f36386c;
                            if (Float.floatToIntBits(s23.b(j6, abstractC4378o2)) != Float.floatToIntBits(s23.b(j6, abstractC4378o22))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.e(j6, abstractC4378o2) == T2.e(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.e(j6, abstractC4378o2) == T2.e(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.d(j6, abstractC4378o2) == T2.d(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.e(j6, abstractC4378o2) == T2.e(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.d(j6, abstractC4378o2) == T2.d(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!u(abstractC4378o2, abstractC4378o22, i)) {
                            break;
                        } else {
                            S2 s24 = T2.f36386c;
                            if (s24.g(j6, abstractC4378o2) != s24.g(j6, abstractC4378o22)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (u(abstractC4378o2, abstractC4378o22, i) && J2.e(T2.g(j6, abstractC4378o2), T2.g(j6, abstractC4378o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (u(abstractC4378o2, abstractC4378o22, i) && J2.e(T2.g(j6, abstractC4378o2), T2.g(j6, abstractC4378o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (u(abstractC4378o2, abstractC4378o22, i) && J2.e(T2.g(j6, abstractC4378o2), T2.g(j6, abstractC4378o22))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.d(j6, abstractC4378o2) == T2.d(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.d(j6, abstractC4378o2) == T2.d(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.d(j6, abstractC4378o2) == T2.d(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.e(j6, abstractC4378o2) == T2.e(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.d(j6, abstractC4378o2) == T2.d(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (u(abstractC4378o2, abstractC4378o22, i) && T2.e(j6, abstractC4378o2) == T2.e(j6, abstractC4378o22)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (u(abstractC4378o2, abstractC4378o22, i) && J2.e(T2.g(j6, abstractC4378o2), T2.g(j6, abstractC4378o22))) {
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
                        e9 = J2.e(T2.g(j6, abstractC4378o2), T2.g(j6, abstractC4378o22));
                        break;
                    case 50:
                        e9 = J2.e(T2.g(j6, abstractC4378o2), T2.g(j6, abstractC4378o22));
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
                        if (T2.d(j9, abstractC4378o2) == T2.d(j9, abstractC4378o22) && J2.e(T2.g(j6, abstractC4378o2), T2.g(j6, abstractC4378o22))) {
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
            } else if (abstractC4378o2.zzc.equals(abstractC4378o22.zzc)) {
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
    public final void d(Object obj, C4409w2 c4409w2) {
        boolean z6;
        int[] iArr;
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        Iterator it;
        ?? r42;
        int d9;
        int i15;
        int i16;
        W2 w22;
        int i17;
        ?? j6;
        int d10;
        int i18;
        C2 c22 = this;
        int i19 = 2;
        int i20 = 3;
        Unsafe unsafe = f36264h;
        int i21 = 1048575;
        int i22 = 1048575;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            int[] iArr2 = c22.f36265a;
            if (i23 >= iArr2.length) {
                N2 n22 = ((AbstractC4378o2) obj).zzc;
                return;
            }
            int n9 = c22.n(i23);
            int m9 = m(n9);
            int i25 = iArr2[i23];
            if (m9 <= 17) {
                int i26 = iArr2[i23 + 2];
                z6 = true;
                int i27 = i26 & i21;
                if (i27 != i22) {
                    i24 = i27 == i21 ? 0 : unsafe.getInt(obj, i27);
                    i22 = i27;
                }
                iArr = iArr2;
                i = 1 << (i26 >>> 20);
            } else {
                z6 = true;
                iArr = iArr2;
                i = 0;
            }
            long j9 = n9 & i21;
            int i28 = i19;
            switch (m9) {
                case 0:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).t(i25, Double.doubleToRawLongBits(T2.f36386c.a(j9, obj)));
                    }
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 1:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).r(i25, Float.floatToRawIntBits(T2.f36386c.b(j9, obj)));
                    }
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 2:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).B(i25, unsafe.getLong(obj, j9));
                    }
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 3:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).B(i25, unsafe.getLong(obj, j9));
                    }
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 4:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).v(i25, unsafe.getInt(obj, j9));
                    }
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 5:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).t(i25, unsafe.getLong(obj, j9));
                    }
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 6:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).r(i25, unsafe.getInt(obj, j9));
                    }
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 7:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        byte g9 = T2.f36386c.g(j9, obj);
                        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
                        c4354i2.l(11);
                        c4354i2.o(i25 << 3);
                        int i29 = c4354i2.f36460e;
                        c4354i2.f36458c[i29] = g9;
                        c4354i2.f36460e = i29 + 1;
                        i13 = 3;
                        i23 += 3;
                        c22 = this;
                        i19 = i28;
                        i20 = i13;
                        i21 = 1048575;
                    }
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 8:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        Object object = unsafe.getObject(obj, j9);
                        if (object instanceof String) {
                            C4354i2 c4354i22 = (C4354i2) c4409w2.f36550u;
                            i28 = 2;
                            c4354i22.A((i25 << 3) | 2);
                            c4354i22.x((String) object);
                        } else {
                            i28 = 2;
                            C4354i2 c4354i23 = (C4354i2) c4409w2.f36550u;
                            c4354i23.A((i25 << 3) | 2);
                            c4354i23.q((C4350h2) object);
                        }
                    } else {
                        i28 = 2;
                    }
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 9:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        c4409w2.c(i25, unsafe.getObject(obj, j9), c22.p(i23));
                    }
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 10:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        C4350h2 c4350h2 = (C4350h2) unsafe.getObject(obj, j9);
                        C4354i2 c4354i24 = (C4354i2) c4409w2.f36550u;
                        c4354i24.A((i25 << 3) | 2);
                        c4354i24.q(c4350h2);
                    }
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 11:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).z(i25, unsafe.getInt(obj, j9));
                    }
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 12:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).v(i25, unsafe.getInt(obj, j9));
                    }
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 13:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).r(i25, unsafe.getInt(obj, j9));
                    }
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 14:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        ((C4354i2) c4409w2.f36550u).t(i25, unsafe.getLong(obj, j9));
                    }
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 15:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        int i30 = unsafe.getInt(obj, j9);
                        ((C4354i2) c4409w2.f36550u).z(i25, (i30 >> 31) ^ (i30 + i30));
                    }
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 16:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        long j10 = unsafe.getLong(obj, j9);
                        ((C4354i2) c4409w2.f36550u).B(i25, (j10 >> 63) ^ (j10 + j10));
                    }
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 17:
                    if (c22.w(obj, i23, i22, i24, i)) {
                        Object object2 = unsafe.getObject(obj, j9);
                        I2 p9 = c22.p(i23);
                        c4409w2.getClass();
                        C4354i2 c4354i25 = (C4354i2) c4409w2.f36550u;
                        c4354i25.y(i25, 3);
                        p9.d((AbstractC4330c2) object2, c4409w2);
                        c4354i25.y(i25, 4);
                    }
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 18:
                    i4 = i22;
                    i6 = i24;
                    J2.q(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 19:
                    i4 = i22;
                    i6 = i24;
                    J2.u(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 20:
                    i4 = i22;
                    i6 = i24;
                    J2.w(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 21:
                    i4 = i22;
                    i6 = i24;
                    J2.d(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 22:
                    i4 = i22;
                    i6 = i24;
                    J2.v(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 23:
                    i4 = i22;
                    i6 = i24;
                    J2.t(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 24:
                    i4 = i22;
                    i6 = i24;
                    J2.s(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 25:
                    i4 = i22;
                    i6 = i24;
                    J2.p(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 26:
                    i9 = i22;
                    i10 = i24;
                    int i31 = iArr[i23];
                    List list = (List) unsafe.getObject(obj, j9);
                    O2 o22 = J2.f36323a;
                    if (list != null && !list.isEmpty()) {
                        c4409w2.getClass();
                        for (int i32 = 0; i32 < list.size(); i32++) {
                            String str = (String) list.get(i32);
                            C4354i2 c4354i26 = (C4354i2) c4409w2.f36550u;
                            c4354i26.A((i31 << 3) | 2);
                            c4354i26.x(str);
                        }
                    }
                    i24 = i10;
                    i22 = i9;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                    break;
                case 27:
                    i9 = i22;
                    i10 = i24;
                    int i33 = iArr[i23];
                    List list2 = (List) unsafe.getObject(obj, j9);
                    I2 p10 = c22.p(i23);
                    O2 o23 = J2.f36323a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i34 = 0; i34 < list2.size(); i34++) {
                            c4409w2.c(i33, list2.get(i34), p10);
                        }
                    }
                    i24 = i10;
                    i22 = i9;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                    break;
                case 28:
                    i9 = i22;
                    i10 = i24;
                    int i35 = iArr[i23];
                    List list3 = (List) unsafe.getObject(obj, j9);
                    O2 o24 = J2.f36323a;
                    if (list3 != null && !list3.isEmpty()) {
                        c4409w2.getClass();
                        for (int i36 = 0; i36 < list3.size(); i36++) {
                            C4350h2 c4350h22 = (C4350h2) list3.get(i36);
                            C4354i2 c4354i27 = (C4354i2) c4409w2.f36550u;
                            c4354i27.A((i35 << 3) | 2);
                            c4354i27.q(c4350h22);
                        }
                    }
                    i24 = i10;
                    i22 = i9;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                    break;
                case 29:
                    i4 = i22;
                    i6 = i24;
                    z9 = false;
                    J2.c(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 30:
                    i4 = i22;
                    i6 = i24;
                    z9 = false;
                    J2.r(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 31:
                    i4 = i22;
                    i6 = i24;
                    z9 = false;
                    J2.x(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 32:
                    i4 = i22;
                    i6 = i24;
                    z9 = false;
                    J2.y(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 33:
                    i4 = i22;
                    i6 = i24;
                    z9 = false;
                    J2.a(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 34:
                    i4 = i22;
                    i6 = i24;
                    z9 = false;
                    J2.b(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, false);
                    i24 = i6;
                    i22 = i4;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 35:
                    i11 = i22;
                    i12 = i24;
                    J2.q(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 36:
                    i11 = i22;
                    i12 = i24;
                    J2.u(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 37:
                    i11 = i22;
                    i12 = i24;
                    J2.w(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case com.anythink.basead.b.b.j.f6592M /* 38 */:
                    i11 = i22;
                    i12 = i24;
                    J2.d(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 39:
                    i11 = i22;
                    i12 = i24;
                    J2.v(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case com.anythink.basead.b.b.j.f6594O /* 40 */:
                    i11 = i22;
                    i12 = i24;
                    J2.t(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 41:
                    i11 = i22;
                    i12 = i24;
                    J2.s(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 42:
                    i11 = i22;
                    i12 = i24;
                    J2.p(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case com.anythink.basead.b.b.j.f6597R /* 43 */:
                    i11 = i22;
                    i12 = i24;
                    J2.c(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case com.anythink.basead.b.b.j.f6598S /* 44 */:
                    i11 = i22;
                    i12 = i24;
                    J2.r(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case com.anythink.basead.b.b.j.f6599T /* 45 */:
                    i11 = i22;
                    i12 = i24;
                    J2.x(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 46:
                    i11 = i22;
                    i12 = i24;
                    J2.y(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 47:
                    i11 = i22;
                    i12 = i24;
                    J2.a(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case com.anythink.basead.b.b.j.f6602W /* 48 */:
                    i11 = i22;
                    i12 = i24;
                    J2.b(iArr[i23], (List) unsafe.getObject(obj, j9), c4409w2, z6);
                    i24 = i12;
                    i22 = i11;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case com.anythink.basead.b.b.j.f6603X /* 49 */:
                    i9 = i22;
                    i10 = i24;
                    int i37 = iArr[i23];
                    List list4 = (List) unsafe.getObject(obj, j9);
                    I2 p11 = c22.p(i23);
                    O2 o25 = J2.f36323a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i38 = 0; i38 < list4.size(); i38++) {
                            Object obj2 = list4.get(i38);
                            c4409w2.getClass();
                            C4354i2 c4354i28 = (C4354i2) c4409w2.f36550u;
                            c4354i28.y(i37, 3);
                            p11.d((AbstractC4330c2) obj2, c4409w2);
                            c4354i28.y(i37, 4);
                        }
                    }
                    i24 = i10;
                    i22 = i9;
                    i28 = 2;
                    i13 = 3;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j9);
                    if (object3 != null) {
                        int i39 = i23 / 3;
                        C4367m c4367m = ((C4413x2) c22.f36266b[i39 + i39]).f36562a;
                        c4409w2.getClass();
                        Iterator it2 = ((C4417y2) object3).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            C4354i2 c4354i29 = (C4354i2) c4409w2.f36550u;
                            c4354i29.y(i25, i28);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int i40 = C4366l2.f36482c;
                            int i41 = C4354i2.i(8);
                            W2 w23 = W2.f36399x;
                            W2 w24 = (W2) c4367m.f36485n;
                            if (w24 == w23) {
                                i41 += i41;
                            }
                            X2 x22 = X2.f36406n;
                            int i42 = i22;
                            switch (w24.ordinal()) {
                                case 0:
                                    i14 = i24;
                                    it = it2;
                                    ((Double) key).getClass();
                                    r42 = 8;
                                    int i43 = r42 + i41;
                                    int i44 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                        i44 += i44;
                                    }
                                    switch (w22.ordinal()) {
                                        case 0:
                                            i17 = i43;
                                            ((Double) value).getClass();
                                            j6 = 8;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key2);
                                            C4366l2.b(c4354i29, w22, 2, value2);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 1:
                                            i17 = i43;
                                            ((Float) value).getClass();
                                            j6 = 4;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key22 = entry.getKey();
                                            Object value22 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key22);
                                            C4366l2.b(c4354i29, w22, 2, value22);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 2:
                                            i17 = i43;
                                            j6 = C4354i2.j(((Long) value).longValue());
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key222 = entry.getKey();
                                            Object value222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key222);
                                            C4366l2.b(c4354i29, w22, 2, value222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 3:
                                            i17 = i43;
                                            j6 = C4354i2.j(((Long) value).longValue());
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key2222 = entry.getKey();
                                            Object value2222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key2222);
                                            C4366l2.b(c4354i29, w22, 2, value2222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 4:
                                            i17 = i43;
                                            j6 = C4354i2.j(((Integer) value).intValue());
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key22222 = entry.getKey();
                                            Object value22222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key22222);
                                            C4366l2.b(c4354i29, w22, 2, value22222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 5:
                                            i17 = i43;
                                            ((Long) value).getClass();
                                            j6 = 8;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key222222 = entry.getKey();
                                            Object value222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key222222);
                                            C4366l2.b(c4354i29, w22, 2, value222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 6:
                                            i17 = i43;
                                            ((Integer) value).getClass();
                                            j6 = 4;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key2222222 = entry.getKey();
                                            Object value2222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key2222222);
                                            C4366l2.b(c4354i29, w22, 2, value2222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 7:
                                            i17 = i43;
                                            ((Boolean) value).getClass();
                                            j6 = z6;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key22222222 = entry.getKey();
                                            Object value22222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key22222222);
                                            C4366l2.b(c4354i29, w22, 2, value22222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 8:
                                            i17 = i43;
                                            if (value instanceof C4350h2) {
                                                d10 = ((C4350h2) value).d();
                                                i18 = C4354i2.i(d10);
                                                j6 = d10 + i18;
                                                c4354i29.A(j6 + i44 + i17);
                                                Object key222222222 = entry.getKey();
                                                Object value222222222 = entry.getValue();
                                                C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key222222222);
                                                C4366l2.b(c4354i29, w22, 2, value222222222);
                                                i28 = 2;
                                                i24 = i14;
                                                i22 = i42;
                                                it2 = it;
                                                i20 = 3;
                                                z6 = true;
                                            } else {
                                                j6 = C4354i2.h((String) value);
                                                c4354i29.A(j6 + i44 + i17);
                                                Object key2222222222 = entry.getKey();
                                                Object value2222222222 = entry.getValue();
                                                C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key2222222222);
                                                C4366l2.b(c4354i29, w22, 2, value2222222222);
                                                i28 = 2;
                                                i24 = i14;
                                                i22 = i42;
                                                it2 = it;
                                                i20 = 3;
                                                z6 = true;
                                            }
                                        case 9:
                                            i17 = i43;
                                            j6 = ((AbstractC4330c2) value).c();
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key22222222222 = entry.getKey();
                                            Object value22222222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key22222222222);
                                            C4366l2.b(c4354i29, w22, 2, value22222222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 10:
                                            i17 = i43;
                                            d10 = ((AbstractC4330c2) value).c();
                                            i18 = C4354i2.i(d10);
                                            j6 = d10 + i18;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key222222222222 = entry.getKey();
                                            Object value222222222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key222222222222);
                                            C4366l2.b(c4354i29, w22, 2, value222222222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 11:
                                            i17 = i43;
                                            if (value instanceof C4350h2) {
                                                d10 = ((C4350h2) value).d();
                                                i18 = C4354i2.i(d10);
                                            } else {
                                                d10 = ((byte[]) value).length;
                                                i18 = C4354i2.i(d10);
                                            }
                                            j6 = d10 + i18;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key2222222222222 = entry.getKey();
                                            Object value2222222222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key2222222222222);
                                            C4366l2.b(c4354i29, w22, 2, value2222222222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 12:
                                            i17 = i43;
                                            j6 = C4354i2.i(((Integer) value).intValue());
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key22222222222222 = entry.getKey();
                                            Object value22222222222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key22222222222222);
                                            C4366l2.b(c4354i29, w22, 2, value22222222222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 13:
                                            i17 = i43;
                                            j6 = C4354i2.j(((Integer) value).intValue());
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key222222222222222 = entry.getKey();
                                            Object value222222222222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key222222222222222);
                                            C4366l2.b(c4354i29, w22, 2, value222222222222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 14:
                                            ((Integer) value).getClass();
                                            i17 = i43;
                                            j6 = 4;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key2222222222222222 = entry.getKey();
                                            Object value2222222222222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key2222222222222222);
                                            C4366l2.b(c4354i29, w22, 2, value2222222222222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 15:
                                            ((Long) value).getClass();
                                            i17 = i43;
                                            j6 = 8;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key22222222222222222 = entry.getKey();
                                            Object value22222222222222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key22222222222222222);
                                            C4366l2.b(c4354i29, w22, 2, value22222222222222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            j6 = C4354i2.i((intValue >> 31) ^ (intValue + intValue));
                                            i17 = i43;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key222222222222222222 = entry.getKey();
                                            Object value222222222222222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key222222222222222222);
                                            C4366l2.b(c4354i29, w22, 2, value222222222222222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            j6 = C4354i2.j((longValue + longValue) ^ (longValue >> 63));
                                            i17 = i43;
                                            c4354i29.A(j6 + i44 + i17);
                                            Object key2222222222222222222 = entry.getKey();
                                            Object value2222222222222222222 = entry.getValue();
                                            C4366l2.b(c4354i29, w24, z6 ? 1 : 0, key2222222222222222222);
                                            C4366l2.b(c4354i29, w22, 2, value2222222222222222222);
                                            i28 = 2;
                                            i24 = i14;
                                            i22 = i42;
                                            it2 = it;
                                            i20 = 3;
                                            z6 = true;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    i14 = i24;
                                    it = it2;
                                    ((Float) key).getClass();
                                    r42 = 4;
                                    int i432 = r42 + i41;
                                    int i442 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 2:
                                    i14 = i24;
                                    it = it2;
                                    r42 = C4354i2.j(((Long) key).longValue());
                                    int i4322 = r42 + i41;
                                    int i4422 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 3:
                                    i14 = i24;
                                    it = it2;
                                    r42 = C4354i2.j(((Long) key).longValue());
                                    int i43222 = r42 + i41;
                                    int i44222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 4:
                                    i14 = i24;
                                    it = it2;
                                    r42 = C4354i2.j(((Integer) key).intValue());
                                    int i432222 = r42 + i41;
                                    int i442222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 5:
                                    i14 = i24;
                                    it = it2;
                                    ((Long) key).getClass();
                                    r42 = 8;
                                    int i4322222 = r42 + i41;
                                    int i4422222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 6:
                                    i14 = i24;
                                    it = it2;
                                    ((Integer) key).getClass();
                                    r42 = 4;
                                    int i43222222 = r42 + i41;
                                    int i44222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 7:
                                    i14 = i24;
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    r42 = z6;
                                    int i432222222 = r42 + i41;
                                    int i442222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 8:
                                    i14 = i24;
                                    it = it2;
                                    if (key instanceof C4350h2) {
                                        d9 = ((C4350h2) key).d();
                                        i15 = C4354i2.i(d9);
                                        r42 = d9 + i15;
                                        int i4322222222 = r42 + i41;
                                        int i4422222222 = C4354i2.i(16);
                                        w22 = (W2) c4367m.f36486u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    } else {
                                        r42 = C4354i2.h((String) key);
                                        int i43222222222 = r42 + i41;
                                        int i44222222222 = C4354i2.i(16);
                                        w22 = (W2) c4367m.f36486u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    }
                                case 9:
                                    i14 = i24;
                                    it = it2;
                                    r42 = ((AbstractC4330c2) key).c();
                                    int i432222222222 = r42 + i41;
                                    int i442222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 10:
                                    i14 = i24;
                                    it = it2;
                                    d9 = ((AbstractC4330c2) key).c();
                                    i15 = C4354i2.i(d9);
                                    r42 = d9 + i15;
                                    int i4322222222222 = r42 + i41;
                                    int i4422222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 11:
                                    i14 = i24;
                                    it = it2;
                                    if (key instanceof C4350h2) {
                                        d9 = ((C4350h2) key).d();
                                        i15 = C4354i2.i(d9);
                                    } else {
                                        d9 = ((byte[]) key).length;
                                        i15 = C4354i2.i(d9);
                                    }
                                    r42 = d9 + i15;
                                    int i43222222222222 = r42 + i41;
                                    int i44222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 12:
                                    i14 = i24;
                                    it = it2;
                                    r42 = C4354i2.i(((Integer) key).intValue());
                                    int i432222222222222 = r42 + i41;
                                    int i442222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 13:
                                    i14 = i24;
                                    it = it2;
                                    r42 = C4354i2.j(((Integer) key).intValue());
                                    int i4322222222222222 = r42 + i41;
                                    int i4422222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    i14 = i24;
                                    it = it2;
                                    r42 = 4;
                                    int i43222222222222222 = r42 + i41;
                                    int i44222222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    i14 = i24;
                                    it = it2;
                                    r42 = 8;
                                    int i432222222222222222 = r42 + i41;
                                    int i442222222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    i16 = C4354i2.i((intValue2 + intValue2) ^ (intValue2 >> 31));
                                    i14 = i24;
                                    it = it2;
                                    r42 = i16;
                                    int i4322222222222222222 = r42 + i41;
                                    int i4422222222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    i16 = C4354i2.j((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    i14 = i24;
                                    it = it2;
                                    r42 = i16;
                                    int i43222222222222222222 = r42 + i41;
                                    int i44222222222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i13 = i20;
                    i28 = 2;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 51:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).t(i25, Double.doubleToRawLongBits(((Double) T2.g(j9, obj)).doubleValue()));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 52:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).r(i25, Float.floatToRawIntBits(((Float) T2.g(j9, obj)).floatValue()));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).B(i25, o(j9, obj));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 54:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).B(i25, o(j9, obj));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 55:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).v(i25, l(j9, obj));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case p.a.f20466e /* 56 */:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).t(i25, o(j9, obj));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 57:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).r(i25, l(j9, obj));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 58:
                    if (c22.j(i25, i23, obj)) {
                        byte booleanValue = ((Boolean) T2.g(j9, obj)).booleanValue();
                        C4354i2 c4354i210 = (C4354i2) c4409w2.f36550u;
                        c4354i210.l(11);
                        c4354i210.o(i25 << 3);
                        int i45 = c4354i210.f36460e;
                        c4354i210.f36458c[i45] = booleanValue;
                        c4354i210.f36460e = i45 + 1;
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case j.v.f13377n /* 59 */:
                    if (c22.j(i25, i23, obj)) {
                        Object object4 = unsafe.getObject(obj, j9);
                        if (object4 instanceof String) {
                            C4354i2 c4354i211 = (C4354i2) c4409w2.f36550u;
                            c4354i211.A((i25 << 3) | 2);
                            c4354i211.x((String) object4);
                        } else {
                            C4354i2 c4354i212 = (C4354i2) c4409w2.f36550u;
                            c4354i212.A((i25 << 3) | 2);
                            c4354i212.q((C4350h2) object4);
                        }
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 60:
                    if (c22.j(i25, i23, obj)) {
                        c4409w2.c(i25, unsafe.getObject(obj, j9), c22.p(i23));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 61:
                    if (c22.j(i25, i23, obj)) {
                        C4350h2 c4350h23 = (C4350h2) unsafe.getObject(obj, j9);
                        C4354i2 c4354i213 = (C4354i2) c4409w2.f36550u;
                        c4354i213.A((i25 << 3) | 2);
                        c4354i213.q(c4350h23);
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 62:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).z(i25, l(j9, obj));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 63:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).v(i25, l(j9, obj));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 64:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).r(i25, l(j9, obj));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case j.v.f13362G /* 65 */:
                    if (c22.j(i25, i23, obj)) {
                        ((C4354i2) c4409w2.f36550u).t(i25, o(j9, obj));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 66:
                    if (c22.j(i25, i23, obj)) {
                        int l9 = l(j9, obj);
                        ((C4354i2) c4409w2.f36550u).z(i25, (l9 >> 31) ^ (l9 + l9));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case j.v.f13368d /* 67 */:
                    if (c22.j(i25, i23, obj)) {
                        long o4 = o(j9, obj);
                        ((C4354i2) c4409w2.f36550u).B(i25, (o4 >> 63) ^ (o4 + o4));
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                case 68:
                    if (c22.j(i25, i23, obj)) {
                        Object object5 = unsafe.getObject(obj, j9);
                        I2 p12 = c22.p(i23);
                        c4409w2.getClass();
                        C4354i2 c4354i214 = (C4354i2) c4409w2.f36550u;
                        c4354i214.y(i25, i20);
                        p12.d((AbstractC4330c2) object5, c4409w2);
                        c4354i214.y(i25, 4);
                    }
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
                default:
                    i13 = i20;
                    i23 += 3;
                    c22 = this;
                    i19 = i28;
                    i20 = i13;
                    i21 = 1048575;
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
            int[] iArr = this.f36265a;
            if (i >= iArr.length) {
                J2.o(obj, obj2);
                return;
            }
            int n9 = n(i);
            int i4 = n9 & 1048575;
            int m9 = m(n9);
            int i6 = iArr[i];
            long j6 = i4;
            switch (m9) {
                case 0:
                    if (v(i, obj2)) {
                        S2 s22 = T2.f36386c;
                        obj3 = obj;
                        s22.e(obj3, j6, s22.a(j6, obj2));
                        t(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (v(i, obj2)) {
                        S2 s23 = T2.f36386c;
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
                        S2 s24 = T2.f36386c;
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
                    InterfaceC4389r2 interfaceC4389r2 = (InterfaceC4389r2) T2.g(j6, obj);
                    InterfaceC4389r2 interfaceC4389r22 = (InterfaceC4389r2) T2.g(j6, obj2);
                    int size = interfaceC4389r2.size();
                    int size2 = interfaceC4389r22.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC4334d2) interfaceC4389r2).f36433n) {
                            interfaceC4389r2 = interfaceC4389r2.b(size2 + size);
                        }
                        interfaceC4389r2.addAll(interfaceC4389r22);
                    }
                    if (size > 0) {
                        interfaceC4389r22 = interfaceC4389r2;
                    }
                    T2.k(j6, obj, interfaceC4389r22);
                    obj3 = obj;
                    break;
                case 50:
                    O2 o22 = J2.f36323a;
                    C4417y2 c4417y2 = (C4417y2) T2.g(j6, obj);
                    C4417y2 c4417y22 = (C4417y2) T2.g(j6, obj2);
                    if (!c4417y22.isEmpty()) {
                        if (!c4417y2.f36566n) {
                            if (c4417y2.isEmpty()) {
                                c4417y2 = new C4417y2();
                            } else {
                                C4417y2 c4417y23 = new C4417y2(c4417y2);
                                c4417y23.f36566n = true;
                                c4417y2 = c4417y23;
                            }
                        }
                        c4417y2.h();
                        if (!c4417y22.isEmpty()) {
                            c4417y2.putAll(c4417y22);
                        }
                    }
                    T2.k(j6, obj, c4417y2);
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
                    if (j(i6, i, obj2)) {
                        T2.k(j6, obj, T2.g(j6, obj2));
                        T2.i(i6, iArr[i + 2] & 1048575, obj);
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
                case j.v.f13362G /* 65 */:
                case 66:
                case j.v.f13368d /* 67 */:
                    if (j(i6, i, obj2)) {
                        T2.k(j6, obj, T2.g(j6, obj2));
                        T2.i(i6, iArr[i + 2] & 1048575, obj);
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
    public final int f(AbstractC4378o2 abstractC4378o2) {
        int i;
        int i4;
        int i6;
        int j6;
        int i9;
        int i10;
        int i11;
        int h3;
        int i12;
        int i13;
        int h9;
        int i14;
        int i15;
        int i16;
        int i17;
        int size;
        int n9;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Iterator it;
        int j9;
        int d9;
        int i24;
        int i25;
        W2 w22;
        int j10;
        int d10;
        int i26;
        int i27;
        int j11;
        C2 c22 = this;
        AbstractC4378o2 abstractC4378o22 = abstractC4378o2;
        int i28 = 1;
        Unsafe unsafe = f36264h;
        int i29 = 1048575;
        int i30 = 1048575;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            int[] iArr = c22.f36265a;
            if (i31 >= iArr.length) {
                N2 n22 = abstractC4378o22.zzc;
                int i34 = n22.f36350c;
                if (i34 == -1) {
                    n22.f36350c = 0;
                    i = 0;
                } else {
                    i = i34;
                }
                return i + i33;
            }
            int n10 = c22.n(i31);
            int m9 = m(n10);
            int i35 = iArr[i31];
            int i36 = iArr[i31 + 2];
            int i37 = i36 & i29;
            if (m9 <= 17) {
                if (i37 != i30) {
                    i32 = i37 == i29 ? 0 : unsafe.getInt(abstractC4378o22, i37);
                    i30 = i37;
                }
                i4 = i28 << (i36 >>> 20);
            } else {
                i4 = 0;
            }
            int i38 = n10 & i29;
            if (m9 >= EnumC4370m2.f36487u.f36491n) {
                EnumC4370m2.f36488v.getClass();
            }
            long j12 = i38;
            int i39 = 8;
            int i40 = 4;
            switch (m9) {
                case 0:
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        i33 = Wv.o(i35 << 3, 8, i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 1:
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        i33 = Wv.o(i35 << 3, 4, i33);
                    }
                    abstractC4378o22 = abstractC4378o2;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 2:
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        long j13 = unsafe.getLong(abstractC4378o22, j12);
                        i6 = C4354i2.i(i35 << 3);
                        j6 = C4354i2.j(j13);
                        i9 = j6 + i6;
                        i33 += i9;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    } else {
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                case 3:
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        long j14 = unsafe.getLong(abstractC4378o22, j12);
                        i6 = C4354i2.i(i35 << 3);
                        j6 = C4354i2.j(j14);
                        i9 = j6 + i6;
                        i33 += i9;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    } else {
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                case 4:
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        long j15 = unsafe.getInt(abstractC4378o22, j12);
                        i6 = C4354i2.i(i35 << 3);
                        j6 = C4354i2.j(j15);
                        i9 = j6 + i6;
                        i33 += i9;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    } else {
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                case 5:
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        i33 = Wv.o(i35 << 3, 8, i33);
                    }
                    abstractC4378o22 = abstractC4378o2;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 6:
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        i33 = Wv.o(i35 << 3, 4, i33);
                    }
                    abstractC4378o22 = abstractC4378o2;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 7:
                    int i41 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        i28 = i41;
                        i33 = Wv.o(i35 << 3, i28, i33);
                    } else {
                        i28 = i41;
                    }
                    abstractC4378o22 = abstractC4378o2;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 8:
                    i10 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        int i42 = i35 << 3;
                        Object object = unsafe.getObject(abstractC4378o22, j12);
                        if (object instanceof C4350h2) {
                            int i43 = C4354i2.i(i42);
                            int d11 = ((C4350h2) object).d();
                            i33 = Wv.p(d11, d11, i43, i33);
                        } else {
                            i11 = C4354i2.i(i42);
                            h3 = C4354i2.h((String) object);
                            i12 = h3 + i11;
                            i33 += i12;
                        }
                    }
                    i28 = i10;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 9:
                    i10 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        Object object2 = unsafe.getObject(abstractC4378o22, j12);
                        I2 p9 = c22.p(i31);
                        O2 o22 = J2.f36323a;
                        int i44 = C4354i2.i(i35 << 3);
                        int b9 = ((AbstractC4330c2) object2).b(p9);
                        i33 = Wv.p(b9, b9, i44, i33);
                    }
                    i28 = i10;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 10:
                    i10 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        C4350h2 c4350h2 = (C4350h2) unsafe.getObject(abstractC4378o22, j12);
                        int i45 = C4354i2.i(i35 << 3);
                        int d12 = c4350h2.d();
                        i33 = Wv.p(d12, d12, i45, i33);
                    }
                    i28 = i10;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 11:
                    i10 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        i33 = Wv.o(unsafe.getInt(abstractC4378o22, j12), C4354i2.i(i35 << 3), i33);
                    }
                    i28 = i10;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 12:
                    i10 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        long j16 = unsafe.getInt(abstractC4378o22, j12);
                        i11 = C4354i2.i(i35 << 3);
                        h3 = C4354i2.j(j16);
                        i12 = h3 + i11;
                        i33 += i12;
                    }
                    i28 = i10;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 13:
                    i10 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        i33 = Wv.o(i35 << 3, 4, i33);
                    }
                    abstractC4378o22 = abstractC4378o2;
                    i28 = i10;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 14:
                    i10 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        i33 = Wv.o(i35 << 3, 8, i33);
                    }
                    abstractC4378o22 = abstractC4378o2;
                    i28 = i10;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 15:
                    i10 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        int i46 = unsafe.getInt(abstractC4378o22, j12);
                        i33 = Wv.o((i46 >> 31) ^ (i46 + i46), C4354i2.i(i35 << 3), i33);
                    }
                    i28 = i10;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 16:
                    i10 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        long j17 = unsafe.getLong(abstractC4378o22, j12);
                        i11 = C4354i2.i(i35 << 3);
                        h3 = C4354i2.j((j17 >> 63) ^ (j17 + j17));
                        i12 = h3 + i11;
                        i33 += i12;
                    }
                    i28 = i10;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 17:
                    i10 = i28;
                    if (c22.w(abstractC4378o22, i31, i30, i32, i4)) {
                        AbstractC4330c2 abstractC4330c2 = (AbstractC4330c2) unsafe.getObject(abstractC4378o22, j12);
                        I2 p10 = c22.p(i31);
                        O2 o23 = J2.f36323a;
                        int i47 = C4354i2.i(i35 << 3);
                        i12 = abstractC4330c2.b(p10) + i47 + i47;
                        i33 += i12;
                    }
                    i28 = i10;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 18:
                    i13 = i30;
                    h9 = J2.h(i35, (List) unsafe.getObject(abstractC4378o22, j12));
                    i33 += h9;
                    i30 = i13;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 19:
                    i13 = i30;
                    h9 = J2.g(i35, (List) unsafe.getObject(abstractC4378o22, j12));
                    i33 += h9;
                    i30 = i13;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 20:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o24 = J2.f36323a;
                    if (list.size() != 0) {
                        i17 = (C4354i2.i(i35 << 3) * list.size()) + J2.j(list);
                        i33 += i17;
                        i28 = i16;
                        i30 = i14;
                        i32 = i15;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                    i17 = 0;
                    i33 += i17;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 21:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list2 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o25 = J2.f36323a;
                    size = list2.size();
                    if (size != 0) {
                        n9 = J2.n(list2);
                        i18 = C4354i2.i(i35 << 3);
                        i19 = (i18 * size) + n9;
                        i33 += i19;
                        i28 = i16;
                        i30 = i14;
                        i32 = i15;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                    i19 = 0;
                    i33 += i19;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 22:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list3 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o26 = J2.f36323a;
                    size = list3.size();
                    if (size != 0) {
                        n9 = J2.i(list3);
                        i18 = C4354i2.i(i35 << 3);
                        i19 = (i18 * size) + n9;
                        i33 += i19;
                        i28 = i16;
                        i30 = i14;
                        i32 = i15;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                    i19 = 0;
                    i33 += i19;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 23:
                    i13 = i30;
                    h9 = J2.h(i35, (List) unsafe.getObject(abstractC4378o22, j12));
                    i33 += h9;
                    i30 = i13;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 24:
                    i13 = i30;
                    h9 = J2.g(i35, (List) unsafe.getObject(abstractC4378o22, j12));
                    i33 += h9;
                    i30 = i13;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 25:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list4 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o27 = J2.f36323a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        i17 = (C4354i2.i(i35 << 3) + 1) * size2;
                        i33 += i17;
                        i28 = i16;
                        i30 = i14;
                        i32 = i15;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                    i17 = 0;
                    i33 += i17;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 26:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list5 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o28 = J2.f36323a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        i19 = C4354i2.i(i35 << 3) * size3;
                        for (int i48 = 0; i48 < size3; i48++) {
                            Object obj = list5.get(i48);
                            if (obj instanceof C4350h2) {
                                int d13 = ((C4350h2) obj).d();
                                i19 = Wv.o(d13, d13, i19);
                            } else {
                                i19 = C4354i2.h((String) obj) + i19;
                            }
                        }
                        i33 += i19;
                        i28 = i16;
                        i30 = i14;
                        i32 = i15;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                    i19 = 0;
                    i33 += i19;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 27:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list6 = (List) unsafe.getObject(abstractC4378o22, j12);
                    I2 p11 = c22.p(i31);
                    O2 o29 = J2.f36323a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        i20 = 0;
                    } else {
                        i20 = C4354i2.i(i35 << 3) * size4;
                        for (int i49 = 0; i49 < size4; i49++) {
                            int b10 = ((AbstractC4330c2) list6.get(i49)).b(p11);
                            i20 = Wv.o(b10, b10, i20);
                        }
                    }
                    i33 += i20;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 28:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list7 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o210 = J2.f36323a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        i19 = C4354i2.i(i35 << 3) * size5;
                        for (int i50 = 0; i50 < list7.size(); i50++) {
                            int d14 = ((C4350h2) list7.get(i50)).d();
                            i19 = Wv.o(d14, d14, i19);
                        }
                        i33 += i19;
                        i28 = i16;
                        i30 = i14;
                        i32 = i15;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                    i19 = 0;
                    i33 += i19;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 29:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list8 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o211 = J2.f36323a;
                    size = list8.size();
                    if (size != 0) {
                        n9 = J2.m(list8);
                        i18 = C4354i2.i(i35 << 3);
                        i19 = (i18 * size) + n9;
                        i33 += i19;
                        i28 = i16;
                        i30 = i14;
                        i32 = i15;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                    i19 = 0;
                    i33 += i19;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 30:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list9 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o212 = J2.f36323a;
                    size = list9.size();
                    if (size != 0) {
                        n9 = J2.f(list9);
                        i18 = C4354i2.i(i35 << 3);
                        i19 = (i18 * size) + n9;
                        i33 += i19;
                        i28 = i16;
                        i30 = i14;
                        i32 = i15;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                    i19 = 0;
                    i33 += i19;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 31:
                    i13 = i30;
                    h9 = J2.g(i35, (List) unsafe.getObject(abstractC4378o22, j12));
                    i33 += h9;
                    i30 = i13;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 32:
                    i13 = i30;
                    h9 = J2.h(i35, (List) unsafe.getObject(abstractC4378o22, j12));
                    i33 += h9;
                    i30 = i13;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 33:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list10 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o213 = J2.f36323a;
                    size = list10.size();
                    if (size != 0) {
                        n9 = J2.k(list10);
                        i18 = C4354i2.i(i35 << 3);
                        i19 = (i18 * size) + n9;
                        i33 += i19;
                        i28 = i16;
                        i30 = i14;
                        i32 = i15;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                    i19 = 0;
                    i33 += i19;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 34:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list11 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o214 = J2.f36323a;
                    size = list11.size();
                    if (size != 0) {
                        n9 = J2.l(list11);
                        i18 = C4354i2.i(i35 << 3);
                        i19 = (i18 * size) + n9;
                        i33 += i19;
                        i28 = i16;
                        i30 = i14;
                        i32 = i15;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                    i19 = 0;
                    i33 += i19;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 35:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list12 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o215 = J2.f36323a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i33 = Wv.p(size6, C4354i2.i(i35 << 3), size6, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 36:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list13 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o216 = J2.f36323a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i33 = Wv.p(size7, C4354i2.i(i35 << 3), size7, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 37:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    int j18 = J2.j((List) unsafe.getObject(abstractC4378o22, j12));
                    if (j18 > 0) {
                        i33 = Wv.p(j18, C4354i2.i(i35 << 3), j18, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f6592M /* 38 */:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    int n11 = J2.n((List) unsafe.getObject(abstractC4378o22, j12));
                    if (n11 > 0) {
                        i33 = Wv.p(n11, C4354i2.i(i35 << 3), n11, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 39:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    int i51 = J2.i((List) unsafe.getObject(abstractC4378o22, j12));
                    if (i51 > 0) {
                        i33 = Wv.p(i51, C4354i2.i(i35 << 3), i51, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f6594O /* 40 */:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list14 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o217 = J2.f36323a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i33 = Wv.p(size8, C4354i2.i(i35 << 3), size8, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 41:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list15 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o218 = J2.f36323a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i33 = Wv.p(size9, C4354i2.i(i35 << 3), size9, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 42:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list16 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o219 = J2.f36323a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i33 = Wv.p(size10, C4354i2.i(i35 << 3), size10, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f6597R /* 43 */:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    int m10 = J2.m((List) unsafe.getObject(abstractC4378o22, j12));
                    if (m10 > 0) {
                        i33 = Wv.p(m10, C4354i2.i(i35 << 3), m10, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f6598S /* 44 */:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    int f2 = J2.f((List) unsafe.getObject(abstractC4378o22, j12));
                    if (f2 > 0) {
                        i33 = Wv.p(f2, C4354i2.i(i35 << 3), f2, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f6599T /* 45 */:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list17 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o220 = J2.f36323a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i33 = Wv.p(size11, C4354i2.i(i35 << 3), size11, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 46:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list18 = (List) unsafe.getObject(abstractC4378o22, j12);
                    O2 o221 = J2.f36323a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i33 = Wv.p(size12, C4354i2.i(i35 << 3), size12, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 47:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    int k9 = J2.k((List) unsafe.getObject(abstractC4378o22, j12));
                    if (k9 > 0) {
                        i33 = Wv.p(k9, C4354i2.i(i35 << 3), k9, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f6602W /* 48 */:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    int l9 = J2.l((List) unsafe.getObject(abstractC4378o22, j12));
                    if (l9 > 0) {
                        i33 = Wv.p(l9, C4354i2.i(i35 << 3), l9, i33);
                    }
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case com.anythink.basead.b.b.j.f6603X /* 49 */:
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    List list19 = (List) unsafe.getObject(abstractC4378o22, j12);
                    I2 p12 = c22.p(i31);
                    O2 o222 = J2.f36323a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i21 = 0;
                    } else {
                        i21 = 0;
                        for (int i52 = 0; i52 < size13; i52++) {
                            AbstractC4330c2 abstractC4330c22 = (AbstractC4330c2) list19.get(i52);
                            int i53 = C4354i2.i(i35 << 3);
                            i21 += abstractC4330c22.b(p12) + i53 + i53;
                        }
                    }
                    i33 += i21;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 50:
                    int i54 = i31 / 3;
                    C4417y2 c4417y2 = (C4417y2) unsafe.getObject(abstractC4378o22, j12);
                    C4413x2 c4413x2 = (C4413x2) c22.f36266b[i54 + i54];
                    if (c4417y2.isEmpty()) {
                        i22 = 0;
                    } else {
                        Iterator it2 = c4417y2.entrySet().iterator();
                        i22 = 0;
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c4413x2.getClass();
                            int i55 = i28;
                            int i56 = C4354i2.i(i35 << 3);
                            int i57 = i40;
                            C4367m c4367m = c4413x2.f36562a;
                            int i58 = C4366l2.f36482c;
                            int i59 = C4354i2.i(i39);
                            int i60 = i39;
                            W2 w23 = W2.f36399x;
                            int i61 = i30;
                            W2 w24 = (W2) c4367m.f36485n;
                            if (w24 == w23) {
                                i59 += i59;
                            }
                            X2 x22 = X2.f36406n;
                            switch (w24.ordinal()) {
                                case 0:
                                    i23 = i32;
                                    it = it2;
                                    ((Double) key).getClass();
                                    j9 = i60;
                                    int i62 = j9 + i59;
                                    int i63 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                        i63 += i63;
                                    }
                                    switch (w22.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            j10 = i60;
                                            int i64 = j10 + i63 + i62;
                                            i22 = Wv.p(i64, i64, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 1:
                                            ((Float) value).getClass();
                                            j10 = i57;
                                            int i642 = j10 + i63 + i62;
                                            i22 = Wv.p(i642, i642, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 2:
                                            j10 = C4354i2.j(((Long) value).longValue());
                                            int i6422 = j10 + i63 + i62;
                                            i22 = Wv.p(i6422, i6422, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 3:
                                            j10 = C4354i2.j(((Long) value).longValue());
                                            int i64222 = j10 + i63 + i62;
                                            i22 = Wv.p(i64222, i64222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 4:
                                            j10 = C4354i2.j(((Integer) value).intValue());
                                            int i642222 = j10 + i63 + i62;
                                            i22 = Wv.p(i642222, i642222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 5:
                                            ((Long) value).getClass();
                                            j10 = i60;
                                            int i6422222 = j10 + i63 + i62;
                                            i22 = Wv.p(i6422222, i6422222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 6:
                                            ((Integer) value).getClass();
                                            j10 = i57;
                                            int i64222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i64222222, i64222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            j10 = i55;
                                            int i642222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i642222222, i642222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 8:
                                            if (value instanceof C4350h2) {
                                                d10 = ((C4350h2) value).d();
                                                i26 = C4354i2.i(d10);
                                                j10 = d10 + i26;
                                                int i6422222222 = j10 + i63 + i62;
                                                i22 = Wv.p(i6422222222, i6422222222, i56, i22);
                                                i40 = i57;
                                                i28 = i55;
                                                i39 = i60;
                                                i30 = i61;
                                                i32 = i23;
                                                it2 = it;
                                            } else {
                                                j10 = C4354i2.h((String) value);
                                                int i64222222222 = j10 + i63 + i62;
                                                i22 = Wv.p(i64222222222, i64222222222, i56, i22);
                                                i40 = i57;
                                                i28 = i55;
                                                i39 = i60;
                                                i30 = i61;
                                                i32 = i23;
                                                it2 = it;
                                            }
                                        case 9:
                                            j10 = ((AbstractC4330c2) value).c();
                                            int i642222222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i642222222222, i642222222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 10:
                                            d10 = ((AbstractC4330c2) value).c();
                                            i26 = C4354i2.i(d10);
                                            j10 = d10 + i26;
                                            int i6422222222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i6422222222222, i6422222222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 11:
                                            if (value instanceof C4350h2) {
                                                d10 = ((C4350h2) value).d();
                                                i26 = C4354i2.i(d10);
                                            } else {
                                                d10 = ((byte[]) value).length;
                                                i26 = C4354i2.i(d10);
                                            }
                                            j10 = d10 + i26;
                                            int i64222222222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i64222222222222, i64222222222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 12:
                                            j10 = C4354i2.i(((Integer) value).intValue());
                                            int i642222222222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i642222222222222, i642222222222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 13:
                                            j10 = C4354i2.j(((Integer) value).intValue());
                                            int i6422222222222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i6422222222222222, i6422222222222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 14:
                                            ((Integer) value).getClass();
                                            j10 = i57;
                                            int i64222222222222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i64222222222222222, i64222222222222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 15:
                                            ((Long) value).getClass();
                                            j10 = i60;
                                            int i642222222222222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i642222222222222222, i642222222222222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            j10 = C4354i2.i((intValue >> 31) ^ (intValue + intValue));
                                            int i6422222222222222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i6422222222222222222, i6422222222222222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            j10 = C4354i2.j((longValue + longValue) ^ (longValue >> 63));
                                            int i64222222222222222222 = j10 + i63 + i62;
                                            i22 = Wv.p(i64222222222222222222, i64222222222222222222, i56, i22);
                                            i40 = i57;
                                            i28 = i55;
                                            i39 = i60;
                                            i30 = i61;
                                            i32 = i23;
                                            it2 = it;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    i23 = i32;
                                    it = it2;
                                    ((Float) key).getClass();
                                    j9 = i57;
                                    int i622 = j9 + i59;
                                    int i632 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 2:
                                    i23 = i32;
                                    it = it2;
                                    j9 = C4354i2.j(((Long) key).longValue());
                                    int i6222 = j9 + i59;
                                    int i6322 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 3:
                                    i23 = i32;
                                    it = it2;
                                    j9 = C4354i2.j(((Long) key).longValue());
                                    int i62222 = j9 + i59;
                                    int i63222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 4:
                                    i23 = i32;
                                    it = it2;
                                    j9 = C4354i2.j(((Integer) key).intValue());
                                    int i622222 = j9 + i59;
                                    int i632222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 5:
                                    i23 = i32;
                                    it = it2;
                                    ((Long) key).getClass();
                                    j9 = i60;
                                    int i6222222 = j9 + i59;
                                    int i6322222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 6:
                                    i23 = i32;
                                    it = it2;
                                    ((Integer) key).getClass();
                                    j9 = i57;
                                    int i62222222 = j9 + i59;
                                    int i63222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 7:
                                    i23 = i32;
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    j9 = i55;
                                    int i622222222 = j9 + i59;
                                    int i632222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 8:
                                    i23 = i32;
                                    it = it2;
                                    if (key instanceof C4350h2) {
                                        d9 = ((C4350h2) key).d();
                                        i24 = C4354i2.i(d9);
                                        j9 = d9 + i24;
                                        int i6222222222 = j9 + i59;
                                        int i6322222222 = C4354i2.i(16);
                                        w22 = (W2) c4367m.f36486u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    } else {
                                        j9 = C4354i2.h((String) key);
                                        int i62222222222 = j9 + i59;
                                        int i63222222222 = C4354i2.i(16);
                                        w22 = (W2) c4367m.f36486u;
                                        if (w22 == w23) {
                                        }
                                        switch (w22.ordinal()) {
                                        }
                                    }
                                case 9:
                                    i23 = i32;
                                    it = it2;
                                    j9 = ((AbstractC4330c2) key).c();
                                    int i622222222222 = j9 + i59;
                                    int i632222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 10:
                                    i23 = i32;
                                    it = it2;
                                    d9 = ((AbstractC4330c2) key).c();
                                    i24 = C4354i2.i(d9);
                                    j9 = d9 + i24;
                                    int i6222222222222 = j9 + i59;
                                    int i6322222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 11:
                                    i23 = i32;
                                    it = it2;
                                    if (key instanceof C4350h2) {
                                        d9 = ((C4350h2) key).d();
                                        i24 = C4354i2.i(d9);
                                    } else {
                                        d9 = ((byte[]) key).length;
                                        i24 = C4354i2.i(d9);
                                    }
                                    j9 = d9 + i24;
                                    int i62222222222222 = j9 + i59;
                                    int i63222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 12:
                                    i23 = i32;
                                    it = it2;
                                    j9 = C4354i2.i(((Integer) key).intValue());
                                    int i622222222222222 = j9 + i59;
                                    int i632222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 13:
                                    i23 = i32;
                                    it = it2;
                                    j9 = C4354i2.j(((Integer) key).intValue());
                                    int i6222222222222222 = j9 + i59;
                                    int i6322222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    i23 = i32;
                                    it = it2;
                                    j9 = i57;
                                    int i62222222222222222 = j9 + i59;
                                    int i63222222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    i23 = i32;
                                    it = it2;
                                    j9 = i60;
                                    int i622222222222222222 = j9 + i59;
                                    int i632222222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    i25 = C4354i2.i((intValue2 + intValue2) ^ (intValue2 >> 31));
                                    i23 = i32;
                                    it = it2;
                                    j9 = i25;
                                    int i6222222222222222222 = j9 + i59;
                                    int i6322222222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    i25 = C4354i2.j((longValue2 + longValue2) ^ (longValue2 >> 63));
                                    i23 = i32;
                                    it = it2;
                                    j9 = i25;
                                    int i62222222222222222222 = j9 + i59;
                                    int i63222222222222222222 = C4354i2.i(16);
                                    w22 = (W2) c4367m.f36486u;
                                    if (w22 == w23) {
                                    }
                                    switch (w22.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i14 = i30;
                    i15 = i32;
                    i16 = i28;
                    i33 += i22;
                    i28 = i16;
                    i30 = i14;
                    i32 = i15;
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 51:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        i33 = Wv.o(i35 << 3, 8, i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 52:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        i33 = Wv.o(i35 << 3, 4, i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        long o4 = o(j12, abstractC4378o22);
                        i27 = C4354i2.i(i35 << 3);
                        j11 = C4354i2.j(o4);
                        i33 += j11 + i27;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    } else {
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                case 54:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        long o6 = o(j12, abstractC4378o22);
                        i27 = C4354i2.i(i35 << 3);
                        j11 = C4354i2.j(o6);
                        i33 += j11 + i27;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    } else {
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                case 55:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        long l10 = l(j12, abstractC4378o22);
                        i27 = C4354i2.i(i35 << 3);
                        j11 = C4354i2.j(l10);
                        i33 += j11 + i27;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    } else {
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                case p.a.f20466e /* 56 */:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        i33 = Wv.o(i35 << 3, 8, i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 57:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        i33 = Wv.o(i35 << 3, 4, i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 58:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        i33 = Wv.o(i35 << 3, i28, i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case j.v.f13377n /* 59 */:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        int i65 = i35 << 3;
                        Object object3 = unsafe.getObject(abstractC4378o22, j12);
                        if (object3 instanceof C4350h2) {
                            int i66 = C4354i2.i(i65);
                            int d15 = ((C4350h2) object3).d();
                            i33 = Wv.p(d15, d15, i66, i33);
                        } else {
                            i27 = C4354i2.i(i65);
                            j11 = C4354i2.h((String) object3);
                            i33 += j11 + i27;
                        }
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 60:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        Object object4 = unsafe.getObject(abstractC4378o22, j12);
                        I2 p13 = c22.p(i31);
                        O2 o223 = J2.f36323a;
                        int i67 = C4354i2.i(i35 << 3);
                        int b11 = ((AbstractC4330c2) object4).b(p13);
                        i33 = Wv.p(b11, b11, i67, i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 61:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        C4350h2 c4350h22 = (C4350h2) unsafe.getObject(abstractC4378o22, j12);
                        int i68 = C4354i2.i(i35 << 3);
                        int d16 = c4350h22.d();
                        i33 = Wv.p(d16, d16, i68, i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 62:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        i33 = Wv.o(l(j12, abstractC4378o22), C4354i2.i(i35 << 3), i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 63:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        long l11 = l(j12, abstractC4378o22);
                        i27 = C4354i2.i(i35 << 3);
                        j11 = C4354i2.j(l11);
                        i33 += j11 + i27;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    } else {
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                case 64:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        i33 = Wv.o(i35 << 3, 4, i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case j.v.f13362G /* 65 */:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        i33 = Wv.o(i35 << 3, 8, i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case 66:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        int l12 = l(j12, abstractC4378o22);
                        i33 = Wv.o((l12 >> 31) ^ (l12 + l12), C4354i2.i(i35 << 3), i33);
                    }
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
                case j.v.f13368d /* 67 */:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        long o9 = o(j12, abstractC4378o22);
                        i27 = C4354i2.i(i35 << 3);
                        j11 = C4354i2.j((o9 >> 63) ^ (o9 + o9));
                        i33 += j11 + i27;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    } else {
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                case 68:
                    if (c22.j(i35, i31, abstractC4378o22)) {
                        AbstractC4330c2 abstractC4330c23 = (AbstractC4330c2) unsafe.getObject(abstractC4378o22, j12);
                        I2 p14 = c22.p(i31);
                        O2 o224 = J2.f36323a;
                        int i69 = C4354i2.i(i35 << 3);
                        i9 = abstractC4330c23.b(p14) + i69 + i69;
                        i33 += i9;
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    } else {
                        i31 += 3;
                        i29 = 1048575;
                        c22 = this;
                    }
                default:
                    i31 += 3;
                    i29 = 1048575;
                    c22 = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean g(Object obj) {
        int i;
        int i4;
        int i6;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.f36269e) {
            int i12 = this.f36268d[i10];
            int[] iArr = this.f36265a;
            int i13 = iArr[i12];
            int n9 = n(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i11) {
                if (i15 != 1048575) {
                    i9 = f36264h.getInt(obj, i15);
                }
                i4 = i12;
                i6 = i9;
                i = i15;
            } else {
                int i17 = i9;
                i = i11;
                i4 = i12;
                i6 = i17;
            }
            if ((268435456 & n9) == 0 || w(obj, i4, i, i6, i16)) {
                int m9 = m(n9);
                if (m9 == 9 || m9 == 17) {
                    if (w(obj, i4, i, i6, i16) && !p(i4).g(T2.g(n9 & 1048575, obj))) {
                    }
                    i10++;
                    i11 = i;
                    i9 = i6;
                } else {
                    if (m9 != 27) {
                        if (m9 == 60 || m9 == 68) {
                            if (j(i13, i4, obj) && !p(i4).g(T2.g(n9 & 1048575, obj))) {
                            }
                            i10++;
                            i11 = i;
                            i9 = i6;
                        } else if (m9 != 49) {
                            if (m9 != 50) {
                                continue;
                            } else {
                                C4417y2 c4417y2 = (C4417y2) T2.g(n9 & 1048575, obj);
                                if (c4417y2.isEmpty()) {
                                    continue;
                                } else {
                                    int i18 = i4 / 3;
                                    if (((W2) ((C4413x2) this.f36266b[i18 + i18]).f36562a.f36486u).f36401n == X2.f36404B) {
                                        I2 i22 = null;
                                        for (Object obj2 : c4417y2.values()) {
                                            if (i22 == null) {
                                                i22 = F2.f36283c.a(obj2.getClass());
                                            }
                                            if (!i22.g(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i10++;
                            i11 = i;
                            i9 = i6;
                        }
                    }
                    List list = (List) T2.g(n9 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        I2 p9 = p(i4);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (p9.g(list.get(i19))) {
                            }
                        }
                    }
                    i10++;
                    i11 = i;
                    i9 = i6;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final AbstractC4378o2 i() {
        return (AbstractC4378o2) ((AbstractC4378o2) this.f36267c).f(4);
    }

    public final boolean j(int i, int i4, Object obj) {
        return T2.d((long) (this.f36265a[i4 + 2] & 1048575), obj) == i;
    }

    public final int n(int i) {
        return this.f36265a[i + 1];
    }

    public final I2 p(int i) {
        int i4 = i / 3;
        int i6 = i4 + i4;
        Object[] objArr = this.f36266b;
        I2 i22 = (I2) objArr[i6];
        if (i22 != null) {
            return i22;
        }
        I2 a9 = F2.f36283c.a((Class) objArr[i6 + 1]);
        objArr[i6] = a9;
        return a9;
    }

    public final void r(int i, Object obj, Object obj2) {
        if (v(i, obj2)) {
            int n9 = n(i) & 1048575;
            Unsafe unsafe = f36264h;
            long j6 = n9;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f36265a[i] + " is present but null: " + obj2.toString());
            }
            I2 p9 = p(i);
            if (!v(i, obj)) {
                if (h(object)) {
                    AbstractC4378o2 i4 = p9.i();
                    p9.e(i4, object);
                    unsafe.putObject(obj, j6, i4);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!h(object2)) {
                AbstractC4378o2 i6 = p9.i();
                p9.e(i6, object2);
                unsafe.putObject(obj, j6, i6);
                object2 = i6;
            }
            p9.e(object2, object);
        }
    }

    public final void s(int i, Object obj, Object obj2) {
        int[] iArr = this.f36265a;
        int i4 = iArr[i];
        if (j(i4, i, obj2)) {
            int n9 = n(i) & 1048575;
            Unsafe unsafe = f36264h;
            long j6 = n9;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            I2 p9 = p(i);
            if (!j(i4, i, obj)) {
                if (h(object)) {
                    AbstractC4378o2 i6 = p9.i();
                    p9.e(i6, object);
                    unsafe.putObject(obj, j6, i6);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                T2.i(i4, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!h(object2)) {
                AbstractC4378o2 i9 = p9.i();
                p9.e(i9, object2);
                unsafe.putObject(obj, j6, i9);
                object2 = i9;
            }
            p9.e(object2, object);
        }
    }

    public final void t(int i, Object obj) {
        int i4 = this.f36265a[i + 2];
        long j6 = 1048575 & i4;
        if (j6 == 1048575) {
            return;
        }
        T2.i((1 << (i4 >>> 20)) | T2.d(j6, obj), j6, obj);
    }

    public final boolean u(AbstractC4378o2 abstractC4378o2, AbstractC4378o2 abstractC4378o22, int i) {
        return v(i, abstractC4378o2) == v(i, abstractC4378o22);
    }

    public final boolean v(int i, Object obj) {
        int i4 = this.f36265a[i + 2];
        long j6 = i4 & 1048575;
        if (j6 == 1048575) {
            int n9 = n(i);
            long j9 = n9 & 1048575;
            switch (m(n9)) {
                case 0:
                    if (Double.doubleToRawLongBits(T2.f36386c.a(j9, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(T2.f36386c.b(j9, obj)) == 0) {
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
                    return T2.f36386c.g(j9, obj);
                case 8:
                    Object g9 = T2.g(j9, obj);
                    if (g9 instanceof String) {
                        if (((String) g9).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(g9 instanceof C4350h2)) {
                            throw new IllegalArgumentException();
                        }
                        if (C4350h2.f36450v.equals(g9)) {
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
                    if (C4350h2.f36450v.equals(T2.g(j9, obj))) {
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
        } else if (((1 << (i4 >>> 20)) & T2.d(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean w(Object obj, int i, int i4, int i6, int i9) {
        return i4 == 1048575 ? v(i, obj) : (i6 & i9) != 0;
    }
}
