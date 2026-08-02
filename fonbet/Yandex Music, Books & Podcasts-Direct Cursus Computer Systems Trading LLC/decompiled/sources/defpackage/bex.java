package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class bex implements iex {
    public static final int[] j = new int[0];
    public static final Unsafe k = xex.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final lax e;
    public final int[] f;
    public final int g;
    public final int h;
    public final itk i;

    public bex(int[] iArr, Object[] objArr, int i, int i2, lax laxVar, int[] iArr2, int i3, int i4, itk itkVar, jwl jwlVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = itkVar;
        this.e = laxVar;
    }

    public static Field E(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder m = f1d.m("Field ", str, " for ", name, " not found. Known fields are ");
            m.append(arrays);
            throw new RuntimeException(m.toString());
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof mcx) {
            return ((mcx) obj).c();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bex u(hex hexVar, itk itkVar, jwl jwlVar) {
        int i;
        int charAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
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
        Object[] objArr;
        int i18;
        Class<?> cls;
        int objectFieldOffset;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field E;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field E2;
        Object obj2;
        Field E3;
        int i29;
        char charAt11;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        if (!(hexVar instanceof hex)) {
            hexVar.getClass();
            l1j.f();
            return null;
        }
        String str = hexVar.b;
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
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i36 = charAt15 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                charAt14 = str.charAt(i35);
                if (charAt14 < 55296) {
                    break;
                }
                i36 |= (charAt14 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            charAt15 = i36 | (charAt14 << i37);
            i35 = i32;
        }
        if (charAt15 == 0) {
            i4 = 0;
            i6 = 0;
            charAt = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            iArr = j;
            i2 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt16 = str.charAt(i35);
            if (charAt16 >= 55296) {
                int i39 = charAt16 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    charAt9 = str.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i39 |= (charAt9 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                charAt16 = i39 | (charAt9 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int charAt17 = str.charAt(i38);
            if (charAt17 >= 55296) {
                int i42 = charAt17 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt8 = str.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt17 = i42 | (charAt8 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt18 = str.charAt(i41);
            if (charAt18 >= 55296) {
                int i45 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt7 = str.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt18 = i45 | (charAt7 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int charAt19 = str.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt6 = str.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt19 = i48 | (charAt6 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            charAt = str.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt5 = str.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt = i51 | (charAt5 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt20 = str.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt4 = str.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt20 = i54 | (charAt4 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int charAt21 = str.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt3 = str.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt21 = i57 | (charAt3 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt22 = str.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    charAt2 = str.charAt(i59);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i60 |= (charAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                charAt22 = i60 | (charAt2 << i61);
                i59 = i8;
            }
            int i62 = charAt16 + charAt16 + charAt17;
            i2 = charAt16;
            i35 = i59;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i63 = charAt20;
            i3 = charAt18;
            i4 = i63;
            i5 = charAt19;
            i6 = i62;
            i7 = charAt22;
        }
        Unsafe unsafe = k;
        Object[] objArr2 = hexVar.c;
        Class<?> cls2 = hexVar.a.getClass();
        int i64 = i7 + i4;
        int i65 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i65];
        int i66 = i64;
        int i67 = i7;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int charAt23 = str.charAt(i35);
            if (charAt23 >= i33) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i31 = i72 + 1;
                    charAt13 = str.charAt(i72);
                    i16 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i31;
                    length = i16;
                }
                charAt23 = i71 | (charAt13 << i73);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i70;
            }
            int i74 = i17 + 1;
            int charAt24 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i75 = charAt24 & 8191;
                int i76 = 13;
                while (true) {
                    i30 = i74 + 1;
                    charAt12 = str.charAt(i74);
                    if (charAt12 < c) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i76;
                    i76 += 13;
                    i74 = i30;
                    c = 55296;
                }
                charAt24 = i75 | (charAt12 << i76);
                i74 = i30;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i77 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i78 = charAt23;
            int i79 = charAt24 & 2048;
            if (i77 >= 51) {
                int i80 = i74 + 1;
                int charAt25 = str.charAt(i74);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i29 = i82 + 1;
                        charAt11 = str.charAt(i82);
                        if (charAt11 < c2) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i83;
                        i83 += 13;
                        i82 = i29;
                        c2 = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i83);
                    i26 = i29;
                } else {
                    i26 = i80;
                }
                int i84 = i26;
                int i85 = i77 - 51;
                int i86 = charAt25;
                if (i85 == 9 || i85 == 17) {
                    i27 = i6 + 1;
                    int i87 = i69 / 3;
                    objArr3[i87 + i87 + 1] = objArr4[i6];
                } else {
                    if (i85 == 12) {
                        if (hexVar.a() == 1 || i79 != 0) {
                            i27 = i6 + 1;
                            int i88 = i69 / 3;
                            objArr3[i88 + i88 + 1] = objArr4[i6];
                        } else {
                            i28 = 0;
                            int i89 = i86 + i86;
                            i79 = i28;
                            obj = objArr4[i89];
                            if (obj instanceof Field) {
                                E2 = (Field) obj;
                            } else {
                                E2 = E((String) obj, cls2);
                                objArr4[i89] = E2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(E2);
                            int i90 = i89 + 1;
                            obj2 = objArr4[i90];
                            if (obj2 instanceof Field) {
                                E3 = (Field) obj2;
                            } else {
                                E3 = E((String) obj2, cls2);
                                objArr4[i90] = E3;
                            }
                            i21 = i84;
                            i24 = objectFieldOffset2;
                            i20 = 55296;
                            objArr = objArr3;
                            i18 = i2;
                            cls = cls2;
                            i23 = 0;
                            i19 = (int) unsafe.objectFieldOffset(E3);
                        }
                    }
                    i28 = i79;
                    int i892 = i86 + i86;
                    i79 = i28;
                    obj = objArr4[i892];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(E2);
                    int i902 = i892 + 1;
                    obj2 = objArr4[i902];
                    if (obj2 instanceof Field) {
                    }
                    i21 = i84;
                    i24 = objectFieldOffset22;
                    i20 = 55296;
                    objArr = objArr3;
                    i18 = i2;
                    cls = cls2;
                    i23 = 0;
                    i19 = (int) unsafe.objectFieldOffset(E3);
                }
                i6 = i27;
                i28 = i79;
                int i8922 = i86 + i86;
                i79 = i28;
                obj = objArr4[i8922];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(E2);
                int i9022 = i8922 + 1;
                obj2 = objArr4[i9022];
                if (obj2 instanceof Field) {
                }
                i21 = i84;
                i24 = objectFieldOffset222;
                i20 = 55296;
                objArr = objArr3;
                i18 = i2;
                cls = cls2;
                i23 = 0;
                i19 = (int) unsafe.objectFieldOffset(E3);
            } else {
                int i91 = i6 + 1;
                Field E4 = E((String) objArr4[i6], cls2);
                objArr = objArr3;
                if (i77 == 9 || i77 == 17) {
                    i18 = i2;
                    int i92 = i69 / 3;
                    objArr[i92 + i92 + 1] = E4.getType();
                } else {
                    if (i77 == 27) {
                        i18 = i2;
                        i25 = 1;
                        i6 += 2;
                    } else if (i77 == 49) {
                        i6 += 2;
                        i18 = i2;
                        i25 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            i18 = i2;
                            if (hexVar.a() == 1 || i79 != 0) {
                                i6 += 2;
                                int i93 = i69 / 3;
                                objArr[i93 + i93 + 1] = objArr4[i91];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i6 = i91;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i94 = i6 + 2;
                            int i95 = i67 + 1;
                            iArr[i67] = i69;
                            int i96 = i69 / 3;
                            int i97 = i96 + i96;
                            objArr[i97] = objArr4[i91];
                            if (i79 != 0) {
                                i6 += 3;
                                objArr[i97 + 1] = objArr4[i94];
                                cls = cls2;
                                i67 = i95;
                            } else {
                                i6 = i94;
                                cls = cls2;
                                i67 = i95;
                                i79 = 0;
                            }
                            i18 = i2;
                        } else {
                            i18 = i2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
                        i19 = 1048575;
                        if ((charAt24 & 4096) != 0 || i77 > 17) {
                            i20 = 55296;
                            i21 = i74;
                            i22 = 0;
                        } else {
                            int i98 = i74 + 1;
                            int charAt26 = str.charAt(i74);
                            if (charAt26 >= 55296) {
                                int i99 = charAt26 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i21 = i98 + 1;
                                    charAt10 = str.charAt(i98);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i99 |= (charAt10 & 8191) << i100;
                                    i100 += 13;
                                    i98 = i21;
                                }
                                charAt26 = i99 | (charAt10 << i100);
                            } else {
                                i21 = i98;
                            }
                            int i101 = (charAt26 / 32) + i18 + i18;
                            Object obj3 = objArr4[i101];
                            if (obj3 instanceof Field) {
                                E = (Field) obj3;
                            } else {
                                E = E((String) obj3, cls);
                                objArr4[i101] = E;
                            }
                            i22 = charAt26 % 32;
                            i19 = (int) unsafe.objectFieldOffset(E);
                            i20 = 55296;
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = objectFieldOffset;
                            i66++;
                        }
                        i23 = i22;
                        i24 = objectFieldOffset;
                    }
                    int i102 = i69 / 3;
                    objArr[i102 + i102 + i25] = objArr4[i91];
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
                    i19 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i20 = 55296;
                    i21 = i74;
                    i22 = 0;
                    if (i77 >= 18) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i23 = i22;
                    i24 = objectFieldOffset;
                }
                cls = cls2;
                i6 = i91;
                objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
                i19 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i20 = 55296;
                i21 = i74;
                i22 = 0;
                if (i77 >= 18) {
                }
                i23 = i22;
                i24 = objectFieldOffset;
            }
            int i103 = i79;
            int i104 = i69 + 1;
            iArr2[i69] = i78;
            int i105 = i69 + 2;
            String str2 = str;
            iArr2[i104] = ((charAt24 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i103 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | i24;
            i69 += 3;
            iArr2[i105] = (i23 << 20) | i19;
            cls2 = cls;
            objArr2 = objArr4;
            i33 = i20;
            length = i16;
            objArr3 = objArr;
            i2 = i18;
            i35 = i21;
            str = str2;
        }
        return new bex(iArr2, objArr3, i3, i5, hexVar.a, iArr, i7, i64, itkVar, jwlVar);
    }

    public static int v(long j2, Object obj) {
        return ((Integer) xex.h(j2, obj)).intValue();
    }

    public static int x(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long z(long j2, Object obj) {
        return ((Long) xex.h(j2, obj)).longValue();
    }

    public final jax A(int i) {
        int i2 = i / 3;
        return (jax) this.b[i2 + i2 + 1];
    }

    public final iex B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        iex iexVar = (iex) objArr[i3];
        if (iexVar != null) {
            return iexVar;
        }
        iex a = fex.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object C(int i, Object obj) {
        iex B = B(i);
        int y = y(i) & 1048575;
        if (!p(i, obj)) {
            return B.g();
        }
        Object object = k.getObject(obj, y);
        if (r(object)) {
            return object;
        }
        mcx g = B.g();
        if (object != null) {
            B.c(g, object);
        }
        return g;
    }

    public final Object D(int i, int i2, Object obj) {
        iex B = B(i2);
        if (!s(i, i2, obj)) {
            return B.g();
        }
        Object object = k.getObject(obj, y(i2) & 1048575);
        if (r(object)) {
            return object;
        }
        mcx g = B.g();
        if (object != null) {
            B.c(g, object);
        }
        return g;
    }

    @Override // defpackage.iex
    public final void a(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof mcx) {
            mcx mcxVar = (mcx) obj;
            mcxVar.l();
            mcxVar.zza = 0;
            mcxVar.j();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.i.getClass();
                sex sexVar = ((mcx) obj).zzc;
                if (sexVar.e) {
                    sexVar.e = false;
                    return;
                }
                return;
            }
            int y = y(i);
            int i2 = 1048575 & y;
            int x = x(y);
            long j2 = i2;
            if (x != 9) {
                if (x != 60 && x != 68) {
                    switch (x) {
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
                        case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                        case 29:
                        case 30:
                        case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                        case 32:
                        case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                        case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                        case 35:
                        case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                        case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                        case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                        case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                        case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                        case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                        case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                            oax oaxVar = (oax) ((ucx) xex.h(j2, obj));
                            if (!oaxVar.a) {
                                break;
                            } else {
                                oaxVar.a = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = k;
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((vdx) object).a = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (s(iArr[i], i, obj)) {
                    B(i).a(k.getObject(obj, j2));
                }
                i += 3;
            }
            if (p(i, obj)) {
                B(i).a(k.getObject(obj, j2));
            }
            i += 3;
        }
    }

    @Override // defpackage.iex
    public final void b(Object obj, gao gaoVar) {
        int i;
        int i2;
        bex bexVar = this;
        Unsafe unsafe = k;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = bexVar.a;
            if (i4 >= iArr.length) {
                ((mcx) obj).zzc.d(gaoVar);
                return;
            }
            int y = bexVar.y(i4);
            int x = x(y);
            int i7 = iArr[i4];
            if (x <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i3;
                if (i9 != i6) {
                    i5 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j2 = y & i3;
            switch (x) {
                case 0:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).f(i7, Double.doubleToRawLongBits(xex.c.a(j2, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).d(i7, Float.floatToRawIntBits(xex.c.b(j2, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).n(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).n(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).h(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).f(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).d(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        byte g = xex.c.g(j2, obj);
                        kbx kbxVar = (kbx) gaoVar.a;
                        kbxVar.m(i7 << 3);
                        int i10 = kbxVar.d;
                        try {
                            int i11 = i10 + 1;
                            try {
                                kbxVar.b[i10] = g;
                                kbxVar.d = i11;
                                break;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                                i10 = i11;
                                throw new pg5(i10, kbxVar.c, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((kbx) gaoVar.a).j(i7, (String) object);
                            break;
                        } else {
                            ((kbx) gaoVar.a).c(i7, (gbx) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        gaoVar.Q(i7, unsafe.getObject(obj, j2), bexVar.B(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).c(i7, (gbx) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).l(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).h(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).d(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        ((kbx) gaoVar.a).f(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        int i12 = unsafe.getInt(obj, j2);
                        ((kbx) gaoVar.a).l(i7, (i12 >> 31) ^ (i12 + i12));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        ((kbx) gaoVar.a).n(i7, (j3 >> 63) ^ (j3 + j3));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (bexVar.q(obj, i4, i6, i5, i)) {
                        gaoVar.P(i7, unsafe.getObject(obj, j2), bexVar.B(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    jex.r(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 19:
                    jex.v(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 20:
                    jex.x(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 21:
                    jex.d(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 22:
                    jex.w(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 23:
                    jex.u(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 24:
                    jex.t(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 25:
                    jex.q(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 26:
                    int i13 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    itk itkVar = jex.a;
                    if (list != null && !list.isEmpty()) {
                        kbx kbxVar2 = (kbx) gaoVar.a;
                        if (list instanceof ldx) {
                            ldx ldxVar = (ldx) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object l = ldxVar.l();
                                if (l instanceof String) {
                                    kbxVar2.j(i13, (String) l);
                                } else {
                                    kbxVar2.c(i13, (gbx) l);
                                }
                            }
                            break;
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                kbxVar2.j(i13, (String) list.get(i15));
                            }
                            break;
                        }
                    }
                    break;
                case 27:
                    int i16 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    iex B = bexVar.B(i4);
                    itk itkVar2 = jex.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            gaoVar.Q(i16, list2.get(i17), B);
                        }
                        break;
                    }
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    int i18 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    itk itkVar3 = jex.a;
                    if (list3 != null && !list3.isEmpty()) {
                        gaoVar.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((kbx) gaoVar.a).c(i18, (gbx) list3.get(i19));
                        }
                        break;
                    }
                    break;
                case 29:
                    jex.c(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 30:
                    jex.s(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    jex.y(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 32:
                    jex.z(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    jex.a(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    jex.b(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, false);
                    break;
                case 35:
                    jex.r(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    jex.v(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case 37:
                    jex.x(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case 38:
                    jex.d(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case 39:
                    jex.w(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case 40:
                    jex.u(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case 41:
                    jex.t(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case 42:
                    jex.q(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    jex.c(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    jex.s(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    jex.y(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    jex.z(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    jex.a(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    jex.b(iArr[i4], (List) unsafe.getObject(obj, j2), gaoVar, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    int i20 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    iex B2 = bexVar.B(i4);
                    itk itkVar4 = jex.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            gaoVar.P(i20, list4.get(i21), B2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        int i22 = i4 / 3;
                        throw ouj.g(bexVar.b[i22 + i22]);
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).f(i7, Double.doubleToRawLongBits(((Double) xex.h(j2, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).d(i7, Float.floatToRawIntBits(((Float) xex.h(j2, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).n(i7, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).n(i7, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).h(i7, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).f(i7, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).d(i7, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (bexVar.s(i7, i4, obj)) {
                        byte booleanValue = ((Boolean) xex.h(j2, obj)).booleanValue();
                        kbx kbxVar3 = (kbx) gaoVar.a;
                        kbxVar3.m(i7 << 3);
                        int i23 = kbxVar3.d;
                        try {
                            i2 = i23 + 1;
                        } catch (IndexOutOfBoundsException e3) {
                            e = e3;
                        }
                        try {
                            kbxVar3.b[i23] = booleanValue;
                            kbxVar3.d = i2;
                            break;
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                            i23 = i2;
                            throw new pg5(i23, kbxVar3.c, 1, e);
                        }
                    } else {
                        continue;
                    }
                case 59:
                    if (bexVar.s(i7, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof String) {
                            ((kbx) gaoVar.a).j(i7, (String) object2);
                            break;
                        } else {
                            ((kbx) gaoVar.a).c(i7, (gbx) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (bexVar.s(i7, i4, obj)) {
                        gaoVar.Q(i7, unsafe.getObject(obj, j2), bexVar.B(i4));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).c(i7, (gbx) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).l(i7, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).h(i7, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).d(i7, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (bexVar.s(i7, i4, obj)) {
                        ((kbx) gaoVar.a).f(i7, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (bexVar.s(i7, i4, obj)) {
                        int v = v(j2, obj);
                        ((kbx) gaoVar.a).l(i7, (v >> 31) ^ (v + v));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (bexVar.s(i7, i4, obj)) {
                        long z = z(j2, obj);
                        ((kbx) gaoVar.a).n(i7, (z >> 63) ^ (z + z));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (bexVar.s(i7, i4, obj)) {
                        gaoVar.P(i7, unsafe.getObject(obj, j2), bexVar.B(i4));
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
            bexVar = this;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.iex
    public final void c(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            xq0.x("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                jex.p(obj, obj2);
                return;
            }
            int y = y(i);
            int i2 = y & 1048575;
            int x = x(y);
            int i3 = iArr[i];
            long j2 = i2;
            switch (x) {
                case 0:
                    if (p(i, obj2)) {
                        wex wexVar = xex.c;
                        obj3 = obj;
                        wexVar.e(obj3, j2, wexVar.a(j2, obj2));
                        l(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (p(i, obj2)) {
                        wex wexVar2 = xex.c;
                        wexVar2.f(obj, j2, wexVar2.b(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i, obj2)) {
                        xex.k(obj, j2, xex.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i, obj2)) {
                        xex.k(obj, j2, xex.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i, obj2)) {
                        xex.j(j2, obj, xex.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i, obj2)) {
                        xex.k(obj, j2, xex.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i, obj2)) {
                        xex.j(j2, obj, xex.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i, obj2)) {
                        wex wexVar3 = xex.c;
                        wexVar3.c(obj, j2, wexVar3.g(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i, obj2)) {
                        xex.l(j2, obj, xex.h(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    j(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i, obj2)) {
                        xex.l(j2, obj, xex.h(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i, obj2)) {
                        xex.j(j2, obj, xex.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i, obj2)) {
                        xex.j(j2, obj, xex.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i, obj2)) {
                        xex.j(j2, obj, xex.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i, obj2)) {
                        xex.k(obj, j2, xex.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i, obj2)) {
                        xex.j(j2, obj, xex.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i, obj2)) {
                        xex.k(obj, j2, xex.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    j(i, obj, obj2);
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
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                case 29:
                case 30:
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                case 32:
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                case 35:
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    ucx ucxVar = (ucx) xex.h(j2, obj);
                    ucx ucxVar2 = (ucx) xex.h(j2, obj2);
                    int size = ucxVar.size();
                    int size2 = ucxVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((oax) ucxVar).a) {
                            ucxVar = ucxVar.c(size2 + size);
                        }
                        ucxVar.addAll(ucxVar2);
                    }
                    if (size > 0) {
                        ucxVar2 = ucxVar;
                    }
                    xex.l(j2, obj, ucxVar2);
                    obj3 = obj;
                    break;
                case 50:
                    itk itkVar = jex.a;
                    xex.l(j2, obj, zfm.d(xex.h(j2, obj), xex.h(j2, obj2)));
                    obj3 = obj;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                case 58:
                case 59:
                    if (s(i3, i, obj2)) {
                        xex.l(j2, obj, xex.h(j2, obj2));
                        xex.j(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    k(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case SQLiteDatabase.OPEN_URI /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (s(i3, i, obj2)) {
                        xex.l(j2, obj, xex.h(j2, obj2));
                        xex.j(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    k(i, obj, obj2);
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

    @Override // defpackage.iex
    public final boolean d(mcx mcxVar, mcx mcxVar2) {
        boolean e;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int y = y(i);
                long j2 = y & 1048575;
                switch (x(y)) {
                    case 0:
                        if (!o(mcxVar, mcxVar2, i)) {
                            break;
                        } else {
                            wex wexVar = xex.c;
                            if (Double.doubleToLongBits(wexVar.a(j2, mcxVar)) != Double.doubleToLongBits(wexVar.a(j2, mcxVar2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!o(mcxVar, mcxVar2, i)) {
                            break;
                        } else {
                            wex wexVar2 = xex.c;
                            if (Float.floatToIntBits(wexVar2.b(j2, mcxVar)) != Float.floatToIntBits(wexVar2.b(j2, mcxVar2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (o(mcxVar, mcxVar2, i) && xex.f(j2, mcxVar) == xex.f(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (o(mcxVar, mcxVar2, i) && xex.f(j2, mcxVar) == xex.f(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (o(mcxVar, mcxVar2, i) && xex.e(j2, mcxVar) == xex.e(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (o(mcxVar, mcxVar2, i) && xex.f(j2, mcxVar) == xex.f(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (o(mcxVar, mcxVar2, i) && xex.e(j2, mcxVar) == xex.e(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!o(mcxVar, mcxVar2, i)) {
                            break;
                        } else {
                            wex wexVar3 = xex.c;
                            if (wexVar3.g(j2, mcxVar) != wexVar3.g(j2, mcxVar2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (o(mcxVar, mcxVar2, i) && jex.e(xex.h(j2, mcxVar), xex.h(j2, mcxVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (o(mcxVar, mcxVar2, i) && jex.e(xex.h(j2, mcxVar), xex.h(j2, mcxVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (o(mcxVar, mcxVar2, i) && jex.e(xex.h(j2, mcxVar), xex.h(j2, mcxVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (o(mcxVar, mcxVar2, i) && xex.e(j2, mcxVar) == xex.e(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (o(mcxVar, mcxVar2, i) && xex.e(j2, mcxVar) == xex.e(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (o(mcxVar, mcxVar2, i) && xex.e(j2, mcxVar) == xex.e(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (o(mcxVar, mcxVar2, i) && xex.f(j2, mcxVar) == xex.f(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (o(mcxVar, mcxVar2, i) && xex.e(j2, mcxVar) == xex.e(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (o(mcxVar, mcxVar2, i) && xex.f(j2, mcxVar) == xex.f(j2, mcxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (o(mcxVar, mcxVar2, i) && jex.e(xex.h(j2, mcxVar), xex.h(j2, mcxVar2))) {
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
                    case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    case 29:
                    case 30:
                    case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    case 32:
                    case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    case 35:
                    case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                        e = jex.e(xex.h(j2, mcxVar), xex.h(j2, mcxVar2));
                        break;
                    case 50:
                        e = jex.e(xex.h(j2, mcxVar), xex.h(j2, mcxVar2));
                        break;
                    case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    case 58:
                    case 59:
                    case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    case 61:
                    case 62:
                    case 63:
                    case SQLiteDatabase.OPEN_URI /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j3 = iArr[i + 2] & 1048575;
                        if (xex.e(j3, mcxVar) == xex.e(j3, mcxVar2) && jex.e(xex.h(j2, mcxVar), xex.h(j2, mcxVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (e) {
                    i += 3;
                }
            } else if (mcxVar.zzc.equals(mcxVar2.zzc)) {
                return true;
            }
        }
        return false;
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
    @Override // defpackage.iex
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(mcx mcxVar) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                return mcxVar.zzc.hashCode() + (i6 * 53);
            }
            int y = y(i5);
            int i7 = 1048575 & y;
            int x = x(y);
            int i8 = iArr[i5];
            long j2 = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (x) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(xex.c.a(j2, mcxVar));
                    Charset charset = xcx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(xex.c.b(j2, mcxVar));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = xex.f(j2, mcxVar);
                    Charset charset2 = xcx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = xex.f(j2, mcxVar);
                    Charset charset3 = xcx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = xex.e(j2, mcxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = xex.f(j2, mcxVar);
                    Charset charset4 = xcx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = xex.e(j2, mcxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean g = xex.c.g(j2, mcxVar);
                    Charset charset5 = xcx.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) xex.h(j2, mcxVar)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object h = xex.h(j2, mcxVar);
                    if (h != null) {
                        i10 = h.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = xex.h(j2, mcxVar).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = xex.e(j2, mcxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = xex.e(j2, mcxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = xex.e(j2, mcxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = xex.f(j2, mcxVar);
                    Charset charset6 = xcx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = xex.e(j2, mcxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = xex.f(j2, mcxVar);
                    Charset charset7 = xcx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object h2 = xex.h(j2, mcxVar);
                    if (h2 != null) {
                        i10 = h2.hashCode();
                    }
                    i6 = i4 + i10;
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
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                case 29:
                case 30:
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                case 32:
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                case 35:
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    i2 = i6 * 53;
                    floatToIntBits = xex.h(j2, mcxVar).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = xex.h(j2, mcxVar).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) xex.h(j2, mcxVar)).doubleValue());
                        Charset charset8 = xcx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) xex.h(j2, mcxVar)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j2, mcxVar);
                        Charset charset9 = xcx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j2, mcxVar);
                        Charset charset10 = xcx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, mcxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j2, mcxVar);
                        Charset charset11 = xcx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, mcxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 58:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) xex.h(j2, mcxVar)).booleanValue();
                        Charset charset12 = xcx.a;
                        break;
                    }
                case 59:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) xex.h(j2, mcxVar)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = xex.h(j2, mcxVar).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = xex.h(j2, mcxVar).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, mcxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 63:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, mcxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, mcxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j2, mcxVar);
                        Charset charset13 = xcx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, mcxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 67:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j2, mcxVar);
                        Charset charset14 = xcx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!s(i8, i5, mcxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = xex.h(j2, mcxVar).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    @Override // defpackage.iex
    public final boolean f(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.g) {
            int i7 = this.f[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int y = y(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = k.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & y) == 0 || q(obj, i2, i, i3, i11)) {
                int x = x(y);
                if (x == 9 || x == 17) {
                    if (q(obj, i2, i, i3, i11) && !B(i2).f(xex.h(y & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (x != 27) {
                        if (x == 60 || x == 68) {
                            if (s(i8, i2, obj) && !B(i2).f(xex.h(y & 1048575, obj))) {
                            }
                        } else if (x != 49) {
                            if (x == 50 && !((vdx) xex.h(y & 1048575, obj)).isEmpty()) {
                                int i13 = i2 / 3;
                                throw ouj.g(this.b[i13 + i13]);
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) xex.h(y & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        iex B = B(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (B.f(list.get(i14))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.iex
    public final mcx g() {
        return (mcx) ((mcx) this.e).d(4);
    }

    @Override // defpackage.iex
    public final int h(lax laxVar) {
        int i;
        int q;
        int a;
        int q2;
        int n;
        int q3;
        int a2;
        int i2;
        int q4;
        int i3;
        int i4;
        int a3;
        int q5;
        int size;
        int n2;
        int q6;
        int q7;
        int q8;
        int size2;
        int q9;
        int i5;
        int q10;
        int a4;
        int q11;
        int n3;
        int v;
        int q12;
        bex bexVar = this;
        lax laxVar2 = laxVar;
        Unsafe unsafe = k;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = bexVar.a;
            if (i8 >= iArr.length) {
                return ((mcx) laxVar).zzc.a() + i10;
            }
            int y = bexVar.y(i8);
            int x = x(y);
            int i11 = iArr[i8];
            int i12 = iArr[i8 + 2];
            int i13 = i12 & i6;
            if (x <= 17) {
                if (i13 != i7) {
                    i9 = i13 == i6 ? 0 : unsafe.getInt(laxVar2, i13);
                    i7 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            int i14 = y & i6;
            if (x >= zbx.b.a) {
                zbx.c.getClass();
            }
            long j2 = i14;
            switch (x) {
                case 0:
                    if (!bexVar.q(laxVar2, i8, i7, i9, i)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 8, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 1:
                    if (!bexVar.q(laxVar2, i8, i7, i9, i)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 4, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 2:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        long j3 = unsafe.getLong(laxVar2, j2);
                        q = kbx.q(i11 << 3);
                        a = kbx.a(j3);
                        i3 = a + q;
                        i10 += i3;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 3:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        long j4 = unsafe.getLong(laxVar2, j2);
                        q = kbx.q(i11 << 3);
                        a = kbx.a(j4);
                        i3 = a + q;
                        i10 += i3;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 4:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        long j5 = unsafe.getInt(laxVar2, j2);
                        q = kbx.q(i11 << 3);
                        a = kbx.a(j5);
                        i3 = a + q;
                        i10 += i3;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 5:
                    if (!bexVar.q(laxVar2, i8, i7, i9, i)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 8, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 6:
                    if (!bexVar.q(laxVar2, i8, i7, i9, i)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 4, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 7:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        i10 = v3w.a(i11 << 3, 1, i10);
                    }
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 8:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        int i15 = i11 << 3;
                        Object object = unsafe.getObject(laxVar2, j2);
                        if (object instanceof gbx) {
                            q2 = kbx.q(i15);
                            n = ((gbx) object).n();
                            i10 = v3w.b(n, n, q2, i10);
                            i8 += 3;
                            bexVar = this;
                            laxVar2 = laxVar;
                            i6 = 1048575;
                        } else {
                            q = kbx.q(i15);
                            a = kbx.p((String) object);
                            i3 = a + q;
                            i10 += i3;
                            i8 += 3;
                            bexVar = this;
                            laxVar2 = laxVar;
                            i6 = 1048575;
                        }
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 9:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        Object object2 = unsafe.getObject(laxVar2, j2);
                        iex B = bexVar.B(i8);
                        itk itkVar = jex.a;
                        q3 = kbx.q(i11 << 3);
                        a2 = ((lax) object2).a(B);
                        i10 = v3w.b(a2, a2, q3, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 10:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        gbx gbxVar = (gbx) unsafe.getObject(laxVar2, j2);
                        q2 = kbx.q(i11 << 3);
                        n = gbxVar.n();
                        i10 = v3w.b(n, n, q2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 11:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        i2 = unsafe.getInt(laxVar2, j2);
                        q4 = kbx.q(i11 << 3);
                        i10 = v3w.a(i2, q4, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 12:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        long j6 = unsafe.getInt(laxVar2, j2);
                        q = kbx.q(i11 << 3);
                        a = kbx.a(j6);
                        i3 = a + q;
                        i10 += i3;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 13:
                    if (!bexVar.q(laxVar2, i8, i7, i9, i)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 4, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 14:
                    if (!bexVar.q(laxVar2, i8, i7, i9, i)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 8, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 15:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        int i16 = unsafe.getInt(laxVar2, j2);
                        q4 = kbx.q(i11 << 3);
                        i2 = (i16 >> 31) ^ (i16 + i16);
                        i10 = v3w.a(i2, q4, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 16:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        long j7 = unsafe.getLong(laxVar2, j2);
                        q = kbx.q(i11 << 3);
                        a = kbx.a((j7 >> 63) ^ (j7 + j7));
                        i3 = a + q;
                        i10 += i3;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 17:
                    if (bexVar.q(laxVar2, i8, i7, i9, i)) {
                        lax laxVar3 = (lax) unsafe.getObject(laxVar2, j2);
                        iex B2 = bexVar.B(i8);
                        int q13 = kbx.q(i11 << 3);
                        i4 = q13 + q13;
                        a3 = laxVar3.a(B2);
                        i3 = a3 + i4;
                        i10 += i3;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 18:
                    i3 = jex.h((List) unsafe.getObject(laxVar2, j2), i11);
                    i10 += i3;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 19:
                    i3 = jex.g((List) unsafe.getObject(laxVar2, j2), i11);
                    i10 += i3;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar2 = jex.a;
                    if (list.size() != 0) {
                        q5 = (kbx.q(i11 << 3) * list.size()) + jex.j(list);
                        i10 += q5;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    q5 = 0;
                    i10 += q5;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar3 = jex.a;
                    size = list2.size();
                    if (size != 0) {
                        n2 = jex.n(list2);
                        q6 = kbx.q(i11 << 3);
                        q7 = (q6 * size) + n2;
                        i10 += q7;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar4 = jex.a;
                    size = list3.size();
                    if (size != 0) {
                        n2 = jex.i(list3);
                        q6 = kbx.q(i11 << 3);
                        q7 = (q6 * size) + n2;
                        i10 += q7;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 23:
                    i3 = jex.h((List) unsafe.getObject(laxVar2, j2), i11);
                    i10 += i3;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 24:
                    i3 = jex.g((List) unsafe.getObject(laxVar2, j2), i11);
                    i10 += i3;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar5 = jex.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        q5 = (kbx.q(i11 << 3) + 1) * size3;
                        i10 += q5;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    q5 = 0;
                    i10 += q5;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar6 = jex.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        q7 = kbx.q(i11 << 3) * size4;
                        if (list5 instanceof ldx) {
                            ldx ldxVar = (ldx) list5;
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object l = ldxVar.l();
                                if (l instanceof gbx) {
                                    int n4 = ((gbx) l).n();
                                    q7 = v3w.a(n4, n4, q7);
                                } else {
                                    q7 = kbx.p((String) l) + q7;
                                }
                            }
                        } else {
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object obj = list5.get(i18);
                                if (obj instanceof gbx) {
                                    int n5 = ((gbx) obj).n();
                                    q7 = v3w.a(n5, n5, q7);
                                } else {
                                    q7 = kbx.p((String) obj) + q7;
                                }
                            }
                        }
                        i10 += q7;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(laxVar2, j2);
                    iex B3 = bexVar.B(i8);
                    itk itkVar7 = jex.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        q8 = 0;
                    } else {
                        q8 = kbx.q(i11 << 3) * size5;
                        for (int i19 = 0; i19 < size5; i19++) {
                            int a5 = ((lax) list6.get(i19)).a(B3);
                            q8 = v3w.a(a5, a5, q8);
                        }
                    }
                    i10 += q8;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    List list7 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar8 = jex.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        q7 = kbx.q(i11 << 3) * size6;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            int n6 = ((gbx) list7.get(i20)).n();
                            q7 = v3w.a(n6, n6, q7);
                        }
                        i10 += q7;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar9 = jex.a;
                    size = list8.size();
                    if (size != 0) {
                        n2 = jex.m(list8);
                        q6 = kbx.q(i11 << 3);
                        q7 = (q6 * size) + n2;
                        i10 += q7;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar10 = jex.a;
                    size = list9.size();
                    if (size != 0) {
                        n2 = jex.f(list9);
                        q6 = kbx.q(i11 << 3);
                        q7 = (q6 * size) + n2;
                        i10 += q7;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    i3 = jex.g((List) unsafe.getObject(laxVar2, j2), i11);
                    i10 += i3;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 32:
                    i3 = jex.h((List) unsafe.getObject(laxVar2, j2), i11);
                    i10 += i3;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    List list10 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar11 = jex.a;
                    size = list10.size();
                    if (size != 0) {
                        n2 = jex.k(list10);
                        q6 = kbx.q(i11 << 3);
                        q7 = (q6 * size) + n2;
                        i10 += q7;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar12 = jex.a;
                    size = list11.size();
                    if (size != 0) {
                        n2 = jex.l(list11);
                        q6 = kbx.q(i11 << 3);
                        q7 = (q6 * size) + n2;
                        i10 += q7;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar13 = jex.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar14 = jex.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 37:
                    size2 = jex.j((List) unsafe.getObject(laxVar2, j2));
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 38:
                    size2 = jex.n((List) unsafe.getObject(laxVar2, j2));
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 39:
                    size2 = jex.i((List) unsafe.getObject(laxVar2, j2));
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar15 = jex.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar16 = jex.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar17 = jex.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    size2 = jex.m((List) unsafe.getObject(laxVar2, j2));
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    size2 = jex.f((List) unsafe.getObject(laxVar2, j2));
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar18 = jex.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    List list18 = (List) unsafe.getObject(laxVar2, j2);
                    itk itkVar19 = jex.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    size2 = jex.k((List) unsafe.getObject(laxVar2, j2));
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    size2 = jex.l((List) unsafe.getObject(laxVar2, j2));
                    if (size2 > 0) {
                        q9 = kbx.q(i11 << 3);
                        i10 = v3w.b(size2, q9, size2, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    List list19 = (List) unsafe.getObject(laxVar2, j2);
                    iex B4 = bexVar.B(i8);
                    itk itkVar20 = jex.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i21 = 0; i21 < size7; i21++) {
                            lax laxVar4 = (lax) list19.get(i21);
                            int q14 = kbx.q(i11 << 3);
                            i5 += laxVar4.a(B4) + q14 + q14;
                        }
                    }
                    i10 += i5;
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(laxVar2, j2);
                    int i22 = i8 / 3;
                    vdx vdxVar = (vdx) object3;
                    if (bexVar.b[i22 + i22] != null) {
                        l1j.f();
                        return 0;
                    }
                    if (vdxVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = vdxVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (!bexVar.s(i11, i8, laxVar2)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 8, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (!bexVar.s(i11, i8, laxVar2)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 4, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        long z = z(j2, laxVar2);
                        q10 = kbx.q(i11 << 3);
                        a4 = kbx.a(z);
                        i10 += a4 + q10;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        long z2 = z(j2, laxVar2);
                        q10 = kbx.q(i11 << 3);
                        a4 = kbx.a(z2);
                        i10 += a4 + q10;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        long v2 = v(j2, laxVar2);
                        q10 = kbx.q(i11 << 3);
                        a4 = kbx.a(v2);
                        i10 += a4 + q10;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (!bexVar.s(i11, i8, laxVar2)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 8, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (!bexVar.s(i11, i8, laxVar2)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 4, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 58:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        i10 = v3w.a(i11 << 3, 1, i10);
                    }
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 59:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        int i23 = i11 << 3;
                        Object object4 = unsafe.getObject(laxVar2, j2);
                        if (object4 instanceof gbx) {
                            q11 = kbx.q(i23);
                            n3 = ((gbx) object4).n();
                            i10 = v3w.b(n3, n3, q11, i10);
                            i8 += 3;
                            bexVar = this;
                            laxVar2 = laxVar;
                            i6 = 1048575;
                        } else {
                            q10 = kbx.q(i23);
                            a4 = kbx.p((String) object4);
                            i10 += a4 + q10;
                            i8 += 3;
                            bexVar = this;
                            laxVar2 = laxVar;
                            i6 = 1048575;
                        }
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        Object object5 = unsafe.getObject(laxVar2, j2);
                        iex B5 = bexVar.B(i8);
                        itk itkVar21 = jex.a;
                        q3 = kbx.q(i11 << 3);
                        a2 = ((lax) object5).a(B5);
                        i10 = v3w.b(a2, a2, q3, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 61:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        gbx gbxVar2 = (gbx) unsafe.getObject(laxVar2, j2);
                        q11 = kbx.q(i11 << 3);
                        n3 = gbxVar2.n();
                        i10 = v3w.b(n3, n3, q11, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 62:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        v = v(j2, laxVar2);
                        q12 = kbx.q(i11 << 3);
                        i10 = v3w.a(v, q12, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 63:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        long v3 = v(j2, laxVar2);
                        q10 = kbx.q(i11 << 3);
                        a4 = kbx.a(v3);
                        i10 += a4 + q10;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (!bexVar.s(i11, i8, laxVar2)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 4, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 65:
                    if (!bexVar.s(i11, i8, laxVar2)) {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                    i10 = v3w.a(i11 << 3, 8, i10);
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
                case 66:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        int v4 = v(j2, laxVar2);
                        q12 = kbx.q(i11 << 3);
                        v = (v4 >> 31) ^ (v4 + v4);
                        i10 = v3w.a(v, q12, i10);
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 67:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        long z3 = z(j2, laxVar2);
                        q10 = kbx.q(i11 << 3);
                        a4 = kbx.a((z3 >> 63) ^ (z3 + z3));
                        i10 += a4 + q10;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                case 68:
                    if (bexVar.s(i11, i8, laxVar2)) {
                        lax laxVar5 = (lax) unsafe.getObject(laxVar2, j2);
                        iex B6 = bexVar.B(i8);
                        int q15 = kbx.q(i11 << 3);
                        i4 = q15 + q15;
                        a3 = laxVar5.a(B6);
                        i3 = a3 + i4;
                        i10 += i3;
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        bexVar = this;
                        laxVar2 = laxVar;
                        i6 = 1048575;
                    }
                default:
                    i8 += 3;
                    bexVar = this;
                    laxVar2 = laxVar;
                    i6 = 1048575;
            }
        }
    }

    @Override // defpackage.iex
    public final void i(Object obj, byte[] bArr, int i, int i2, vx0 vx0Var) {
        t(obj, bArr, i, i2, 0, vx0Var);
    }

    public final void j(int i, Object obj, Object obj2) {
        if (p(i, obj2)) {
            int y = y(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = y;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                xq0.q(hrg.p("Source subfield ", this.a[i], " is present but null: ", obj2.toString()));
                return;
            }
            iex B = B(i);
            if (!p(i, obj)) {
                if (r(object)) {
                    mcx g = B.g();
                    B.c(g, object);
                    unsafe.putObject(obj, j2, g);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                l(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                mcx g2 = B.g();
                B.c(g2, object2);
                unsafe.putObject(obj, j2, g2);
                object2 = g2;
            }
            B.c(object2, object);
        }
    }

    public final void k(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (s(i2, i, obj2)) {
            int y = y(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = y;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                xq0.q(hrg.p("Source subfield ", iArr[i], " is present but null: ", obj2.toString()));
                return;
            }
            iex B = B(i);
            if (!s(i2, i, obj)) {
                if (r(object)) {
                    mcx g = B.g();
                    B.c(g, object);
                    unsafe.putObject(obj, j2, g);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                xex.j(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                mcx g2 = B.g();
                B.c(g2, object2);
                unsafe.putObject(obj, j2, g2);
                object2 = g2;
            }
            B.c(object2, object);
        }
    }

    public final void l(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        xex.j(j2, obj, (1 << (i2 >>> 20)) | xex.e(j2, obj));
    }

    public final void m(int i, Object obj, Object obj2) {
        k.putObject(obj, y(i) & 1048575, obj2);
        l(i, obj);
    }

    public final void n(int i, Object obj, Object obj2, int i2) {
        k.putObject(obj, y(i2) & 1048575, obj2);
        xex.j(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final boolean o(mcx mcxVar, mcx mcxVar2, int i) {
        return p(i, mcxVar) == p(i, mcxVar2);
    }

    public final boolean p(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 == 1048575) {
            int y = y(i);
            long j3 = y & 1048575;
            switch (x(y)) {
                case 0:
                    if (Double.doubleToRawLongBits(xex.c.a(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(xex.c.b(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (xex.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (xex.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (xex.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (xex.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (xex.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return xex.c.g(j3, obj);
                case 8:
                    Object h = xex.h(j3, obj);
                    if (h instanceof String) {
                        if (((String) h).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h instanceof gbx)) {
                            e7o.e();
                            return false;
                        }
                        if (gbx.c.equals(h)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (xex.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (gbx.c.equals(xex.h(j3, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (xex.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (xex.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (xex.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (xex.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (xex.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (xex.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (xex.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    e7o.e();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & xex.e(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? p(i, obj) : (i3 & i4) != 0;
    }

    public final boolean s(int i, int i2, Object obj) {
        return xex.e((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x045b, code lost:
    
        r8 = r10;
        r7 = r11;
        r9 = r12;
        r3 = r13;
        r6 = r15;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04d9, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02fd, code lost:
    
        defpackage.tiu.i("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0302, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0367, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x02a6, code lost:
    
        defpackage.tiu.i("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02ab, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0dcf, code lost:
    
        r1 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0e0f, code lost:
    
        if (r1 == 1048575) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0e11, code lost:
    
        r27.putInt(r9, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0e17, code lost:
    
        r1 = r37.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0569, code lost:
    
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0e1d, code lost:
    
        if (r1 >= r37.h) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e1f, code lost:
    
        r2 = r37.f[r1];
        r3 = r21[r2];
        r3 = defpackage.xex.h(y(r2) & 1048575, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0e33, code lost:
    
        if (r3 != null) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0e3a, code lost:
    
        if (A(r2) != null) goto L760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0e3f, code lost:
    
        r3 = (defpackage.vdx) r3;
        r2 = r2 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0e4a, code lost:
    
        throw defpackage.ouj.g(r17[r2 + r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e3c, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0e4d, code lost:
    
        if (r0 != 0) goto L649;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0e4f, code lost:
    
        if (r4 != r5) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0e52, code lost:
    
        defpackage.tiu.i("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0e57, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e5e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0e5a, code lost:
    
        if (r4 > r5) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0e5c, code lost:
    
        if (r15 != r0) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e5f, code lost:
    
        defpackage.tiu.i("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0e62, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e2, code lost:
    
        r5 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e4, code lost:
    
        r3 = r9;
        r8 = r10;
        r7 = r11;
        r9 = r12;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0155, code lost:
    
        r3 = r2;
        r2 = r1;
        r1 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0db0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0dc1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0dca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0b0d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0ddc  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(Object obj, byte[] bArr, int i, int i2, int i3, vx0 vx0Var) {
        int i4;
        Unsafe unsafe;
        int i5;
        int[] iArr;
        Object[] objArr;
        Object obj2;
        int w;
        sex sexVar;
        vx0 vx0Var2;
        int i6;
        int i7;
        byte[] bArr2;
        sex sexVar2;
        vx0 vx0Var3;
        sex sexVar3;
        int i8;
        int i9;
        sex sexVar4;
        int i10;
        vx0 vx0Var4;
        int h0;
        byte[] bArr3;
        int i11;
        int i12;
        vx0 vx0Var5;
        int f0;
        int i13;
        int i14;
        vx0 vx0Var6;
        int i15;
        byte[] bArr4;
        vx0 vx0Var7;
        int i16;
        int i17;
        int e0;
        int i18;
        int j0;
        ucx ucxVar;
        int i19;
        byte[] bArr5;
        vx0 vx0Var8;
        int i20;
        int h02;
        vdx vdxVar;
        int i21;
        int i22;
        int i23;
        vx0 vx0Var9;
        int i24;
        Unsafe unsafe2;
        Object obj3;
        int i25;
        byte[] bArr6;
        vx0 vx0Var10;
        int i26;
        int i27;
        int h03;
        int i28;
        byte b;
        int i29;
        Unsafe unsafe3;
        vx0 vx0Var11;
        Object obj4;
        Unsafe unsafe4;
        byte[] bArr7;
        vx0 vx0Var12;
        bex bexVar = this;
        Object obj5 = obj;
        byte[] bArr8 = bArr;
        int i30 = i2;
        vx0 vx0Var13 = vx0Var;
        if (!r(obj5)) {
            xq0.x("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        Unsafe unsafe5 = k;
        int i31 = i;
        int i32 = -1;
        int i33 = 0;
        int i34 = 1048575;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            int i37 = 1048575;
            while (true) {
                Object[] objArr2 = bexVar.b;
                int[] iArr2 = bexVar.a;
                if (i31 < i30) {
                    int i38 = i31 + 1;
                    int i39 = bArr8[i31];
                    if (i39 < 0) {
                        i38 = fxf.i0(i39, bArr8, i38, vx0Var13);
                        i39 = vx0Var13.a;
                    }
                    int i40 = i38;
                    i36 = i39;
                    int i41 = i36 >>> 3;
                    int i42 = bexVar.d;
                    int i43 = bexVar.c;
                    if (i41 > i32) {
                        int i44 = i33 / 3;
                        if (i41 >= i43 && i41 <= i42) {
                            w = bexVar.w(i41, i44);
                            sexVar = sex.f;
                            if (w == -1) {
                                int i45 = i36 & 7;
                                int i46 = iArr2[w + 1];
                                int x = x(i46);
                                iArr = iArr2;
                                objArr = objArr2;
                                long j2 = i46 & i37;
                                if (x > 17) {
                                    Unsafe unsafe6 = unsafe5;
                                    Object obj6 = obj5;
                                    i7 = w;
                                    i5 = i34;
                                    if (x != 27) {
                                        obj2 = obj6;
                                        i36 = i36;
                                        if (x > 49) {
                                            bArr2 = bArr;
                                            vx0Var3 = vx0Var;
                                            sexVar3 = sexVar;
                                            i9 = i35;
                                            i8 = i40;
                                            unsafe = unsafe6;
                                            if (x != 50) {
                                                Unsafe unsafe7 = k;
                                                long j3 = iArr[i7 + 2] & 1048575;
                                                switch (x) {
                                                    case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                                                        vx0Var2 = vx0Var;
                                                        i21 = i7;
                                                        i22 = i8;
                                                        sexVar = sexVar3;
                                                        if (i45 == 1) {
                                                            i23 = i22 + 8;
                                                            unsafe7.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(fxf.n0(i22, bArr2))));
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            if (i23 != i22) {
                                                                i4 = i3;
                                                                i6 = i23;
                                                                i35 = i9;
                                                                i7 = i21;
                                                                break;
                                                            } else {
                                                                bexVar = this;
                                                                vx0Var13 = vx0Var2;
                                                                i31 = i23;
                                                                obj5 = obj2;
                                                                i32 = i41;
                                                                bArr8 = bArr2;
                                                                i35 = i9;
                                                                i33 = i21;
                                                                unsafe5 = unsafe;
                                                                i34 = i5;
                                                                i37 = 1048575;
                                                                i30 = i2;
                                                            }
                                                        }
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                    case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                                                        vx0Var2 = vx0Var;
                                                        i21 = i7;
                                                        i22 = i8;
                                                        sexVar = sexVar3;
                                                        if (i45 == 5) {
                                                            i23 = i22 + 4;
                                                            unsafe7.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(fxf.d0(i22, bArr2))));
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                    case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                                                    case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                                                        vx0Var2 = vx0Var;
                                                        i21 = i7;
                                                        i22 = i8;
                                                        sexVar = sexVar3;
                                                        if (i45 == 0) {
                                                            i23 = fxf.k0(bArr2, i22, vx0Var2);
                                                            unsafe7.putObject(obj2, j2, Long.valueOf(vx0Var2.b));
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                    case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                                                    case 62:
                                                        vx0Var2 = vx0Var;
                                                        i21 = i7;
                                                        i22 = i8;
                                                        sexVar = sexVar3;
                                                        if (i45 == 0) {
                                                            i23 = fxf.h0(bArr2, i22, vx0Var2);
                                                            unsafe7.putObject(obj2, j2, Integer.valueOf(vx0Var2.a));
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                    case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                                                    case 65:
                                                        vx0Var2 = vx0Var;
                                                        i21 = i7;
                                                        i22 = i8;
                                                        sexVar = sexVar3;
                                                        if (i45 == 1) {
                                                            i23 = i22 + 8;
                                                            unsafe7.putObject(obj2, j2, Long.valueOf(fxf.n0(i22, bArr2)));
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                    case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                                                    case SQLiteDatabase.OPEN_URI /* 64 */:
                                                        vx0Var2 = vx0Var;
                                                        i21 = i7;
                                                        i22 = i8;
                                                        sexVar = sexVar3;
                                                        if (i45 == 5) {
                                                            i23 = i22 + 4;
                                                            unsafe7.putObject(obj2, j2, Integer.valueOf(fxf.d0(i22, bArr2)));
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                    case 58:
                                                        vx0Var2 = vx0Var;
                                                        i21 = i7;
                                                        i22 = i8;
                                                        sexVar = sexVar3;
                                                        if (i45 == 0) {
                                                            i23 = fxf.k0(bArr2, i22, vx0Var2);
                                                            unsafe7.putObject(obj2, j2, Boolean.valueOf(vx0Var2.b != 0));
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                    case 59:
                                                        i21 = i7;
                                                        vx0Var2 = vx0Var;
                                                        i22 = i8;
                                                        sexVar = sexVar3;
                                                        if (i45 == 2) {
                                                            i23 = fxf.h0(bArr2, i22, vx0Var2);
                                                            int i47 = vx0Var2.a;
                                                            if (i47 == 0) {
                                                                unsafe7.putObject(obj2, j2, "");
                                                            } else {
                                                                int i48 = i23 + i47;
                                                                if ((i46 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 && !zex.d(bArr2, i23, i48)) {
                                                                    tiu.i("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                unsafe7.putObject(obj2, j2, new String(bArr2, i23, i47, xcx.a));
                                                                i23 = i48;
                                                            }
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                    case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                                                        sexVar = sexVar3;
                                                        if (i45 == 2) {
                                                            Object D = D(i41, i7, obj2);
                                                            int m0 = fxf.m0(D, B(i7), bArr2, i8, i2, vx0Var);
                                                            n(i41, obj2, D, i7);
                                                            i23 = m0;
                                                            i21 = i7;
                                                            i22 = i8;
                                                            vx0Var2 = vx0Var;
                                                            if (i23 != i22) {
                                                            }
                                                        } else {
                                                            i21 = i7;
                                                            i22 = i8;
                                                            vx0Var2 = vx0Var;
                                                            i23 = i22;
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        break;
                                                    case 61:
                                                        vx0Var9 = vx0Var;
                                                        i24 = i8;
                                                        sexVar = sexVar3;
                                                        if (i45 == 2) {
                                                            i23 = fxf.c0(bArr2, i24, vx0Var9);
                                                            unsafe7.putObject(obj2, j2, vx0Var9.c);
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            i21 = i7;
                                                            i22 = i24;
                                                            vx0Var2 = vx0Var9;
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        i21 = i7;
                                                        i22 = i24;
                                                        vx0Var2 = vx0Var9;
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                    case 63:
                                                        vx0Var9 = vx0Var;
                                                        i24 = i8;
                                                        if (i45 == 0) {
                                                            i23 = fxf.h0(bArr2, i24, vx0Var9);
                                                            int i49 = vx0Var9.a;
                                                            jax A = A(i7);
                                                            if (A == null || A.a(i49)) {
                                                                sexVar = sexVar3;
                                                                unsafe7.putObject(obj2, j2, Integer.valueOf(i49));
                                                                unsafe7.putInt(obj2, j3, i41);
                                                            } else {
                                                                mcx mcxVar = (mcx) obj2;
                                                                sex sexVar5 = mcxVar.zzc;
                                                                sexVar = sexVar3;
                                                                if (sexVar5 == sexVar) {
                                                                    sexVar5 = sex.b();
                                                                    mcxVar.zzc = sexVar5;
                                                                }
                                                                sexVar5.c(i36, Long.valueOf(i49));
                                                            }
                                                            i21 = i7;
                                                            i22 = i24;
                                                            vx0Var2 = vx0Var9;
                                                            if (i23 != i22) {
                                                            }
                                                        } else {
                                                            sexVar = sexVar3;
                                                            i21 = i7;
                                                            i22 = i24;
                                                            vx0Var2 = vx0Var9;
                                                            i23 = i22;
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        break;
                                                    case 66:
                                                        vx0Var9 = vx0Var;
                                                        i24 = i8;
                                                        if (i45 == 0) {
                                                            i23 = fxf.h0(bArr2, i24, vx0Var9);
                                                            int i50 = vx0Var9.a;
                                                            unsafe7.putObject(obj2, j2, Integer.valueOf((i50 >>> 1) ^ (-(i50 & 1))));
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            i21 = i7;
                                                            sexVar = sexVar3;
                                                            i22 = i24;
                                                            vx0Var2 = vx0Var9;
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        i21 = i7;
                                                        sexVar = sexVar3;
                                                        i22 = i24;
                                                        vx0Var2 = vx0Var9;
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                    case 67:
                                                        vx0Var9 = vx0Var;
                                                        i24 = i8;
                                                        if (i45 == 0) {
                                                            i23 = fxf.k0(bArr2, i24, vx0Var9);
                                                            long j4 = vx0Var9.b;
                                                            unsafe7.putObject(obj2, j2, Long.valueOf((j4 >>> 1) ^ (-(j4 & 1))));
                                                            unsafe7.putInt(obj2, j3, i41);
                                                            i21 = i7;
                                                            sexVar = sexVar3;
                                                            i22 = i24;
                                                            vx0Var2 = vx0Var9;
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        i21 = i7;
                                                        sexVar = sexVar3;
                                                        i22 = i24;
                                                        vx0Var2 = vx0Var9;
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                    case 68:
                                                        if (i45 == 3) {
                                                            Object D2 = D(i41, i7, obj2);
                                                            i24 = i8;
                                                            int l0 = fxf.l0(D2, B(i7), bArr2, i24, i2, (i36 & (-8)) | 4, vx0Var);
                                                            vx0Var9 = vx0Var;
                                                            n(i41, obj2, D2, i7);
                                                            i23 = l0;
                                                            i21 = i7;
                                                            sexVar = sexVar3;
                                                            i22 = i24;
                                                            vx0Var2 = vx0Var9;
                                                            if (i23 != i22) {
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        vx0Var2 = vx0Var;
                                                        i21 = i7;
                                                        i22 = i8;
                                                        sexVar = sexVar3;
                                                        i23 = i22;
                                                        if (i23 != i22) {
                                                        }
                                                        break;
                                                }
                                            } else {
                                                if (i45 == 2) {
                                                    Unsafe unsafe8 = k;
                                                    int i51 = i7 / 3;
                                                    Object obj7 = objArr[i51 + i51];
                                                    Object object = unsafe8.getObject(obj2, j2);
                                                    if (!((vdx) object).a) {
                                                        vdx vdxVar2 = vdx.b;
                                                        if (vdxVar2.isEmpty()) {
                                                            vdxVar = new vdx();
                                                        } else {
                                                            vdx vdxVar3 = new vdx(vdxVar2);
                                                            vdxVar3.a = true;
                                                            vdxVar = vdxVar3;
                                                        }
                                                        zfm.d(vdxVar, object);
                                                        unsafe8.putObject(obj2, j2, vdxVar);
                                                    }
                                                    throw ouj.g(obj7);
                                                }
                                                i4 = i3;
                                                vx0Var2 = vx0Var3;
                                                i6 = i8;
                                                i35 = i9;
                                                sexVar = sexVar3;
                                            }
                                        } else {
                                            int i52 = i35;
                                            long j5 = i46;
                                            Unsafe unsafe9 = k;
                                            ucx ucxVar2 = (ucx) unsafe9.getObject(obj2, j2);
                                            if (!((oax) ucxVar2).a) {
                                                int size = ucxVar2.size();
                                                ucxVar2 = ucxVar2.c(size + size);
                                                unsafe9.putObject(obj2, j2, ucxVar2);
                                            }
                                            ucx ucxVar3 = ucxVar2;
                                            String str = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                            Object obj8 = null;
                                            switch (x) {
                                                case 18:
                                                case 35:
                                                    sexVar4 = sexVar;
                                                    i10 = i40;
                                                    bArr2 = bArr;
                                                    vx0Var4 = vx0Var;
                                                    unsafe = unsafe6;
                                                    if (i45 != 2) {
                                                        if (i45 == 1) {
                                                            if (ucxVar3 != null) {
                                                                l1j.f();
                                                                return 0;
                                                            }
                                                            Double.longBitsToDouble(fxf.n0(i10, bArr2));
                                                            throw null;
                                                        }
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                            i4 = i3;
                                                            i6 = i31;
                                                            i35 = i52;
                                                            sexVar = sexVar4;
                                                            vx0Var2 = vx0Var4;
                                                            break;
                                                        } else {
                                                            bexVar = this;
                                                            i30 = i2;
                                                            vx0Var13 = vx0Var4;
                                                            obj5 = obj2;
                                                            i33 = i7;
                                                            i32 = i41;
                                                            bArr8 = bArr2;
                                                            i35 = i52;
                                                            unsafe5 = unsafe;
                                                            break;
                                                        }
                                                    } else {
                                                        if (ucxVar3 != null) {
                                                            l1j.f();
                                                            return 0;
                                                        }
                                                        if (fxf.h0(bArr2, i10, vx0Var4) + vx0Var4.a <= bArr2.length) {
                                                            throw null;
                                                        }
                                                        tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                case 19:
                                                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                                                    sexVar4 = sexVar;
                                                    i10 = i40;
                                                    bArr2 = bArr;
                                                    vx0Var4 = vx0Var;
                                                    unsafe = unsafe6;
                                                    if (i45 == 2) {
                                                        if (ucxVar3 != null) {
                                                            l1j.f();
                                                            return 0;
                                                        }
                                                        if (fxf.h0(bArr2, i10, vx0Var4) + vx0Var4.a <= bArr2.length) {
                                                            throw null;
                                                        }
                                                        tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i45 == 5) {
                                                        if (ucxVar3 != null) {
                                                            l1j.f();
                                                            return 0;
                                                        }
                                                        Float.intBitsToFloat(fxf.d0(i10, bArr2));
                                                        throw null;
                                                    }
                                                    i31 = i10;
                                                    if (i31 == i10) {
                                                    }
                                                    break;
                                                case 20:
                                                case 21:
                                                case 37:
                                                case 38:
                                                    sexVar4 = sexVar;
                                                    i10 = i40;
                                                    bArr2 = bArr;
                                                    vx0Var4 = vx0Var;
                                                    unsafe = unsafe6;
                                                    if (i45 != 2) {
                                                        if (i45 == 0) {
                                                            if (ucxVar3 != null) {
                                                                l1j.f();
                                                                return 0;
                                                            }
                                                            fxf.k0(bArr2, i10, vx0Var4);
                                                            throw null;
                                                        }
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                        }
                                                    } else {
                                                        if (ucxVar3 != null) {
                                                            l1j.f();
                                                            return 0;
                                                        }
                                                        h0 = fxf.h0(bArr2, i10, vx0Var4);
                                                        int i53 = vx0Var4.a + h0;
                                                        if (h0 < i53) {
                                                            fxf.k0(bArr2, h0, vx0Var4);
                                                            throw null;
                                                        }
                                                        if (h0 != i53) {
                                                            tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                        i31 = h0;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    break;
                                                case 22:
                                                case 29:
                                                case 39:
                                                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                                                    bArr3 = bArr;
                                                    sexVar4 = sexVar;
                                                    i11 = i36;
                                                    i12 = i40;
                                                    vx0Var5 = vx0Var;
                                                    unsafe = unsafe6;
                                                    if (i45 == 2) {
                                                        f0 = fxf.f0(bArr3, i12, ucxVar3, vx0Var5);
                                                        i36 = i11;
                                                        i10 = i12;
                                                        vx0Var4 = vx0Var5;
                                                        i31 = f0;
                                                        bArr2 = bArr3;
                                                        if (i31 == i10) {
                                                        }
                                                    } else if (i45 == 0) {
                                                        h0 = fxf.j0(i11, bArr3, i12, i2, ucxVar3, vx0Var5);
                                                        i36 = i11;
                                                        bArr2 = bArr3;
                                                        i10 = i12;
                                                        vx0Var4 = vx0Var5;
                                                        i31 = h0;
                                                        if (i31 == i10) {
                                                        }
                                                    } else {
                                                        i36 = i11;
                                                        i10 = i12;
                                                        vx0Var4 = vx0Var5;
                                                        bArr2 = bArr3;
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    break;
                                                case 23:
                                                case 32:
                                                case 40:
                                                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                                                    bArr3 = bArr;
                                                    sexVar4 = sexVar;
                                                    i13 = i36;
                                                    i14 = i40;
                                                    vx0Var6 = vx0Var;
                                                    unsafe = unsafe6;
                                                    if (i45 == 2) {
                                                        if (ucxVar3 != null) {
                                                            l1j.f();
                                                            return 0;
                                                        }
                                                        if (fxf.h0(bArr3, i14, vx0Var6) + vx0Var6.a <= bArr3.length) {
                                                            throw null;
                                                        }
                                                        tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i45 == 1) {
                                                        if (ucxVar3 != null) {
                                                            l1j.f();
                                                            return 0;
                                                        }
                                                        fxf.n0(i14, bArr3);
                                                        throw null;
                                                    }
                                                    i36 = i13;
                                                    i10 = i14;
                                                    vx0Var4 = vx0Var6;
                                                    bArr2 = bArr3;
                                                    i31 = i10;
                                                    if (i31 == i10) {
                                                    }
                                                    break;
                                                case 24:
                                                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                                                case 41:
                                                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                                                    bArr3 = bArr;
                                                    sexVar4 = sexVar;
                                                    i11 = i36;
                                                    i12 = i40;
                                                    vx0Var5 = vx0Var;
                                                    unsafe = unsafe6;
                                                    if (i45 == 2) {
                                                        ncx ncxVar = (ncx) ucxVar3;
                                                        int h04 = fxf.h0(bArr3, i12, vx0Var5);
                                                        int i54 = vx0Var5.a;
                                                        int i55 = h04 + i54;
                                                        if (i55 > bArr3.length) {
                                                            tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                        int i56 = (i54 / 4) + ncxVar.c;
                                                        int length = ncxVar.b.length;
                                                        if (i56 <= length) {
                                                            i15 = h04;
                                                        } else if (length != 0) {
                                                            while (length < i56) {
                                                                length = v3w.c(length, 3, 2, 1, 10);
                                                                h04 = h04;
                                                            }
                                                            i15 = h04;
                                                            ncxVar.b = Arrays.copyOf(ncxVar.b, length);
                                                        } else {
                                                            i15 = h04;
                                                            ncxVar.b = new int[Math.max(i56, 10)];
                                                        }
                                                        int i57 = i15;
                                                        while (i57 < i55) {
                                                            ncxVar.m(fxf.d0(i57, bArr3));
                                                            i57 += 4;
                                                        }
                                                        if (i57 != i55) {
                                                            tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                        i36 = i11;
                                                        i10 = i12;
                                                        vx0Var4 = vx0Var5;
                                                        i31 = i57;
                                                        bArr2 = bArr3;
                                                        if (i31 == i10) {
                                                        }
                                                    } else if (i45 == 5) {
                                                        f0 = i12 + 4;
                                                        ncx ncxVar2 = (ncx) ucxVar3;
                                                        ncxVar2.m(fxf.d0(i12, bArr3));
                                                        while (f0 < i2) {
                                                            int h05 = fxf.h0(bArr3, f0, vx0Var5);
                                                            if (i11 == vx0Var5.a) {
                                                                ncxVar2.m(fxf.d0(h05, bArr3));
                                                                f0 = h05 + 4;
                                                            } else {
                                                                i36 = i11;
                                                                i10 = i12;
                                                                vx0Var4 = vx0Var5;
                                                                i31 = f0;
                                                                bArr2 = bArr3;
                                                                if (i31 == i10) {
                                                                }
                                                            }
                                                        }
                                                        i36 = i11;
                                                        i10 = i12;
                                                        vx0Var4 = vx0Var5;
                                                        i31 = f0;
                                                        bArr2 = bArr3;
                                                        if (i31 == i10) {
                                                        }
                                                    } else {
                                                        i36 = i11;
                                                        i10 = i12;
                                                        vx0Var4 = vx0Var5;
                                                        bArr2 = bArr3;
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    break;
                                                case 25:
                                                case 42:
                                                    bArr3 = bArr;
                                                    sexVar4 = sexVar;
                                                    i13 = i36;
                                                    i14 = i40;
                                                    vx0Var6 = vx0Var;
                                                    unsafe = unsafe6;
                                                    if (i45 != 2) {
                                                        if (i45 == 0) {
                                                            if (ucxVar3 != null) {
                                                                l1j.f();
                                                                return 0;
                                                            }
                                                            fxf.k0(bArr3, i14, vx0Var6);
                                                            throw null;
                                                        }
                                                        i36 = i13;
                                                        i10 = i14;
                                                        vx0Var4 = vx0Var6;
                                                        bArr2 = bArr3;
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                        }
                                                    } else {
                                                        if (ucxVar3 != null) {
                                                            l1j.f();
                                                            return 0;
                                                        }
                                                        f0 = fxf.h0(bArr3, i14, vx0Var6);
                                                        int i58 = vx0Var6.a + f0;
                                                        if (f0 < i58) {
                                                            fxf.k0(bArr3, f0, vx0Var6);
                                                            throw null;
                                                        }
                                                        if (f0 != i58) {
                                                            tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                        i36 = i13;
                                                        i10 = i14;
                                                        vx0Var4 = vx0Var6;
                                                        i31 = f0;
                                                        bArr2 = bArr3;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    break;
                                                case 26:
                                                    bArr3 = bArr;
                                                    sexVar4 = sexVar;
                                                    i13 = i36;
                                                    i14 = i40;
                                                    vx0Var6 = vx0Var;
                                                    unsafe = unsafe6;
                                                    if (i45 == 2) {
                                                        if ((j5 & 536870912) == 0) {
                                                            f0 = fxf.h0(bArr3, i14, vx0Var6);
                                                            int i59 = vx0Var6.a;
                                                            if (i59 < 0) {
                                                                tiu.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                return 0;
                                                            }
                                                            if (i59 == 0) {
                                                                ucxVar3.add("");
                                                            } else {
                                                                ucxVar3.add(new String(bArr3, f0, i59, xcx.a));
                                                                f0 += i59;
                                                            }
                                                            while (f0 < i2) {
                                                                int h06 = fxf.h0(bArr3, f0, vx0Var6);
                                                                if (i13 == vx0Var6.a) {
                                                                    f0 = fxf.h0(bArr3, h06, vx0Var6);
                                                                    int i60 = vx0Var6.a;
                                                                    if (i60 < 0) {
                                                                        tiu.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                        return 0;
                                                                    }
                                                                    if (i60 == 0) {
                                                                        ucxVar3.add("");
                                                                    } else {
                                                                        ucxVar3.add(new String(bArr3, f0, i60, xcx.a));
                                                                        f0 += i60;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            f0 = fxf.h0(bArr3, i14, vx0Var6);
                                                            int i61 = vx0Var6.a;
                                                            if (i61 < 0) {
                                                                tiu.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                return 0;
                                                            }
                                                            if (i61 == 0) {
                                                                ucxVar3.add("");
                                                            } else {
                                                                int i62 = f0 + i61;
                                                                if (!zex.d(bArr3, f0, i62)) {
                                                                    tiu.i("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                ucxVar3.add(new String(bArr3, f0, i61, xcx.a));
                                                                f0 = i62;
                                                            }
                                                            while (f0 < i2) {
                                                                int h07 = fxf.h0(bArr3, f0, vx0Var6);
                                                                if (i13 == vx0Var6.a) {
                                                                    f0 = fxf.h0(bArr3, h07, vx0Var6);
                                                                    int i63 = vx0Var6.a;
                                                                    if (i63 < 0) {
                                                                        tiu.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                        return 0;
                                                                    }
                                                                    if (i63 == 0) {
                                                                        ucxVar3.add("");
                                                                    } else {
                                                                        int i64 = f0 + i63;
                                                                        if (!zex.d(bArr3, f0, i64)) {
                                                                            tiu.i("Protocol message had invalid UTF-8.");
                                                                            return 0;
                                                                        }
                                                                        ucxVar3.add(new String(bArr3, f0, i63, xcx.a));
                                                                        f0 = i64;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i36 = i13;
                                                        i10 = i14;
                                                        vx0Var4 = vx0Var6;
                                                        i31 = f0;
                                                        bArr2 = bArr3;
                                                        if (i31 == i10) {
                                                        }
                                                    } else {
                                                        i36 = i13;
                                                        i10 = i14;
                                                        vx0Var4 = vx0Var6;
                                                        bArr2 = bArr3;
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    break;
                                                case 27:
                                                    bArr4 = bArr;
                                                    vx0Var7 = vx0Var;
                                                    sexVar4 = sexVar;
                                                    i16 = i36;
                                                    i17 = i40;
                                                    unsafe = unsafe6;
                                                    if (i45 == 2) {
                                                        i36 = i16;
                                                        e0 = fxf.e0(B(i7), i36, bArr4, i17, i2, ucxVar3, vx0Var7);
                                                        bArr2 = bArr4;
                                                        i10 = i17;
                                                        vx0Var4 = vx0Var7;
                                                        i31 = e0;
                                                        if (i31 == i10) {
                                                        }
                                                    } else {
                                                        i36 = i16;
                                                        bArr2 = bArr4;
                                                        i10 = i17;
                                                        vx0Var4 = vx0Var7;
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    break;
                                                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                                    bArr4 = bArr;
                                                    vx0Var7 = vx0Var;
                                                    sexVar4 = sexVar;
                                                    i16 = i36;
                                                    i17 = i40;
                                                    unsafe = unsafe6;
                                                    if (i45 == 2) {
                                                        e0 = fxf.h0(bArr4, i17, vx0Var7);
                                                        int i65 = vx0Var7.a;
                                                        if (i65 < 0) {
                                                            tiu.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i65 > bArr4.length - e0) {
                                                            tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                        if (i65 == 0) {
                                                            ucxVar3.add(gbx.c);
                                                        } else {
                                                            ucxVar3.add(gbx.q(bArr4, e0, i65));
                                                            e0 += i65;
                                                        }
                                                        while (e0 < i2) {
                                                            int h08 = fxf.h0(bArr4, e0, vx0Var7);
                                                            if (i16 == vx0Var7.a) {
                                                                e0 = fxf.h0(bArr4, h08, vx0Var7);
                                                                int i66 = vx0Var7.a;
                                                                if (i66 < 0) {
                                                                    tiu.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                    return 0;
                                                                }
                                                                if (i66 > bArr4.length - e0) {
                                                                    tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                    return 0;
                                                                }
                                                                if (i66 == 0) {
                                                                    ucxVar3.add(gbx.c);
                                                                } else {
                                                                    ucxVar3.add(gbx.q(bArr4, e0, i66));
                                                                    e0 += i66;
                                                                }
                                                            } else {
                                                                i36 = i16;
                                                                bArr2 = bArr4;
                                                                i10 = i17;
                                                                vx0Var4 = vx0Var7;
                                                                i31 = e0;
                                                                if (i31 == i10) {
                                                                }
                                                            }
                                                        }
                                                        i36 = i16;
                                                        bArr2 = bArr4;
                                                        i10 = i17;
                                                        vx0Var4 = vx0Var7;
                                                        i31 = e0;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    i36 = i16;
                                                    bArr2 = bArr4;
                                                    i10 = i17;
                                                    vx0Var4 = vx0Var7;
                                                    i31 = i10;
                                                    if (i31 == i10) {
                                                    }
                                                    break;
                                                case 30:
                                                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                                                    bArr4 = bArr;
                                                    vx0Var7 = vx0Var;
                                                    i17 = i40;
                                                    if (i45 == 2) {
                                                        j0 = fxf.f0(bArr4, i17, ucxVar3, vx0Var7);
                                                        ucxVar = ucxVar3;
                                                        i18 = i36;
                                                    } else if (i45 == 0) {
                                                        i18 = i36;
                                                        j0 = fxf.j0(i18, bArr4, i17, i2, ucxVar3, vx0Var7);
                                                        bArr4 = bArr4;
                                                        ucxVar = ucxVar3;
                                                        i17 = i17;
                                                    } else {
                                                        sexVar4 = sexVar;
                                                        unsafe = unsafe6;
                                                        bArr2 = bArr4;
                                                        i10 = i17;
                                                        vx0Var4 = vx0Var7;
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    jax A2 = bexVar.A(i7);
                                                    itk itkVar = jex.a;
                                                    if (A2 == null) {
                                                        i19 = j0;
                                                        sexVar4 = sexVar;
                                                        unsafe = unsafe6;
                                                    } else if (ucxVar != null) {
                                                        int size2 = ucxVar.size();
                                                        i19 = j0;
                                                        unsafe = unsafe6;
                                                        int i67 = 0;
                                                        int i68 = 0;
                                                        while (i67 < size2) {
                                                            sex sexVar6 = sexVar;
                                                            Integer num = (Integer) ucxVar.get(i67);
                                                            int intValue = num.intValue();
                                                            if (A2.a(intValue)) {
                                                                if (i67 != i68) {
                                                                    ucxVar.set(i68, num);
                                                                }
                                                                i68++;
                                                            } else {
                                                                obj8 = jex.o(i41, obj2, obj8, intValue);
                                                            }
                                                            i67++;
                                                            sexVar = sexVar6;
                                                        }
                                                        sexVar4 = sexVar;
                                                        if (i68 != size2) {
                                                            ucxVar.subList(i68, size2).clear();
                                                        }
                                                    } else {
                                                        i19 = j0;
                                                        sexVar4 = sexVar;
                                                        unsafe = unsafe6;
                                                        Iterator it = ucxVar.iterator();
                                                        while (it.hasNext()) {
                                                            int intValue2 = ((Integer) it.next()).intValue();
                                                            if (!A2.a(intValue2)) {
                                                                obj8 = jex.o(i41, obj2, obj8, intValue2);
                                                                it.remove();
                                                            }
                                                        }
                                                    }
                                                    i36 = i18;
                                                    bArr2 = bArr4;
                                                    i10 = i17;
                                                    vx0Var4 = vx0Var7;
                                                    i31 = i19;
                                                    if (i31 == i10) {
                                                    }
                                                    break;
                                                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                                                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                                                    bArr5 = bArr;
                                                    vx0Var8 = vx0Var;
                                                    i20 = i40;
                                                    if (i45 == 2) {
                                                        ncx ncxVar3 = (ncx) ucxVar3;
                                                        h02 = fxf.h0(bArr5, i20, vx0Var8);
                                                        int i69 = vx0Var8.a + h02;
                                                        while (h02 < i69) {
                                                            h02 = fxf.h0(bArr5, h02, vx0Var8);
                                                            int i70 = vx0Var8.a;
                                                            ncxVar3.m((-(i70 & 1)) ^ (i70 >>> 1));
                                                            str = str;
                                                        }
                                                        String str2 = str;
                                                        if (h02 != i69) {
                                                            tiu.i(str2);
                                                            return 0;
                                                        }
                                                        bArr2 = bArr5;
                                                        vx0Var4 = vx0Var8;
                                                        sexVar4 = sexVar;
                                                        unsafe = unsafe6;
                                                        i10 = i20;
                                                        i31 = h02;
                                                        if (i31 == i10) {
                                                        }
                                                    } else if (i45 == 0) {
                                                        ncx ncxVar4 = (ncx) ucxVar3;
                                                        int h09 = fxf.h0(bArr5, i20, vx0Var8);
                                                        int i71 = vx0Var8.a;
                                                        ncxVar4.m((i71 >>> 1) ^ (-(i71 & 1)));
                                                        while (h09 < i2) {
                                                            int h010 = fxf.h0(bArr5, h09, vx0Var8);
                                                            if (i36 == vx0Var8.a) {
                                                                h09 = fxf.h0(bArr5, h010, vx0Var8);
                                                                int i72 = vx0Var8.a;
                                                                ncxVar4.m((i72 >>> 1) ^ (-(i72 & 1)));
                                                            } else {
                                                                bArr2 = bArr5;
                                                                sexVar4 = sexVar;
                                                                unsafe = unsafe6;
                                                                i10 = i20;
                                                                i31 = h09;
                                                                vx0Var4 = vx0Var8;
                                                                if (i31 == i10) {
                                                                }
                                                            }
                                                        }
                                                        bArr2 = bArr5;
                                                        sexVar4 = sexVar;
                                                        unsafe = unsafe6;
                                                        i10 = i20;
                                                        i31 = h09;
                                                        vx0Var4 = vx0Var8;
                                                        if (i31 == i10) {
                                                        }
                                                    } else {
                                                        bArr2 = bArr5;
                                                        vx0Var4 = vx0Var8;
                                                        sexVar4 = sexVar;
                                                        unsafe = unsafe6;
                                                        i10 = i20;
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    break;
                                                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                                                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                                                    bArr5 = bArr;
                                                    vx0Var8 = vx0Var;
                                                    i20 = i40;
                                                    if (i45 == 2) {
                                                        if (ucxVar3 != null) {
                                                            l1j.f();
                                                            return 0;
                                                        }
                                                        h02 = fxf.h0(bArr5, i20, vx0Var8);
                                                        int i73 = vx0Var8.a + h02;
                                                        if (h02 < i73) {
                                                            fxf.k0(bArr5, h02, vx0Var8);
                                                            throw null;
                                                        }
                                                        if (h02 != i73) {
                                                            tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                        bArr2 = bArr5;
                                                        vx0Var4 = vx0Var8;
                                                        sexVar4 = sexVar;
                                                        unsafe = unsafe6;
                                                        i10 = i20;
                                                        i31 = h02;
                                                        if (i31 == i10) {
                                                        }
                                                    } else {
                                                        if (i45 == 0) {
                                                            if (ucxVar3 != null) {
                                                                l1j.f();
                                                                return 0;
                                                            }
                                                            fxf.k0(bArr5, i20, vx0Var8);
                                                            throw null;
                                                        }
                                                        bArr2 = bArr5;
                                                        vx0Var4 = vx0Var8;
                                                        sexVar4 = sexVar;
                                                        unsafe = unsafe6;
                                                        i10 = i20;
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (i45 == 3) {
                                                        int i74 = (i36 & (-8)) | 4;
                                                        iex B = bexVar.B(i7);
                                                        mcx g = B.g();
                                                        int i75 = i40;
                                                        int l02 = fxf.l0(g, B, bArr, i75, i2, i74, vx0Var);
                                                        int i76 = i74;
                                                        vx0 vx0Var14 = vx0Var;
                                                        B.a(g);
                                                        vx0Var14.c = g;
                                                        ucxVar3.add(g);
                                                        while (true) {
                                                            if (l02 < i2) {
                                                                int i77 = i75;
                                                                int h011 = fxf.h0(bArr, l02, vx0Var14);
                                                                if (i36 == vx0Var14.a) {
                                                                    int i78 = i76;
                                                                    mcx g2 = B.g();
                                                                    l02 = fxf.l0(g2, B, bArr, h011, i2, i78, vx0Var);
                                                                    i76 = i78;
                                                                    vx0Var14 = vx0Var;
                                                                    B.a(g2);
                                                                    vx0Var14.c = g2;
                                                                    ucxVar3.add(g2);
                                                                    i75 = i77;
                                                                } else {
                                                                    i75 = i77;
                                                                }
                                                            }
                                                        }
                                                        bArr2 = bArr;
                                                        vx0Var4 = vx0Var14;
                                                        sexVar4 = sexVar;
                                                        unsafe = unsafe6;
                                                        i10 = i75;
                                                        i31 = l02;
                                                        if (i31 == i10) {
                                                        }
                                                    } else {
                                                        bArr2 = bArr;
                                                        vx0Var4 = vx0Var;
                                                        sexVar4 = sexVar;
                                                        i10 = i40;
                                                        unsafe = unsafe6;
                                                        i31 = i10;
                                                        if (i31 == i10) {
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    } else if (i45 == 2) {
                                        ucx ucxVar4 = (ucx) unsafe6.getObject(obj6, j2);
                                        if (!((oax) ucxVar4).a) {
                                            int size3 = ucxVar4.size();
                                            ucxVar4 = ucxVar4.c(size3 == 0 ? 10 : size3 + size3);
                                            unsafe6.putObject(obj6, j2, ucxVar4);
                                        }
                                        bArr8 = bArr;
                                        i30 = i2;
                                        i31 = fxf.e0(bexVar.B(i7), i36, bArr8, i40, i30, ucxVar4, vx0Var);
                                        i36 = i36;
                                        vx0Var13 = vx0Var;
                                        obj5 = obj;
                                        i33 = i7;
                                        i32 = i41;
                                        unsafe5 = unsafe6;
                                    } else {
                                        obj2 = obj6;
                                        bArr2 = bArr;
                                        vx0Var3 = vx0Var;
                                        sexVar3 = sexVar;
                                        i36 = i36;
                                        i8 = i40;
                                        unsafe = unsafe6;
                                        i9 = i35;
                                        i4 = i3;
                                        vx0Var2 = vx0Var3;
                                        i6 = i8;
                                        i35 = i9;
                                        sexVar = sexVar3;
                                    }
                                } else {
                                    int i79 = iArr[w + 2];
                                    int i80 = 1 << (i79 >>> 20);
                                    int i81 = i79 & i37;
                                    if (i81 != i34) {
                                        int i82 = i37;
                                        if (i34 != i82) {
                                            unsafe5.putInt(obj5, i34, i35);
                                        }
                                        i35 = i81 == i82 ? 0 : unsafe5.getInt(obj5, i81);
                                    } else {
                                        i81 = i34;
                                    }
                                    switch (x) {
                                        case 0:
                                            bArr2 = bArr;
                                            unsafe3 = unsafe5;
                                            i7 = w;
                                            i25 = i35;
                                            i6 = i40;
                                            i26 = i36;
                                            vx0Var11 = vx0Var;
                                            if (i45 == 1) {
                                                i35 = i25 | i80;
                                                xex.c.e(obj5, j2, Double.longBitsToDouble(fxf.n0(i6, bArr2)));
                                                i30 = i2;
                                                i31 = i6 + 8;
                                                break;
                                            }
                                            obj4 = obj5;
                                            i4 = i3;
                                            unsafe = unsafe3;
                                            i5 = i81;
                                            vx0Var2 = vx0Var11;
                                            i36 = i26;
                                            i35 = i25;
                                            obj2 = obj4;
                                            break;
                                        case 1:
                                            bArr2 = bArr;
                                            unsafe3 = unsafe5;
                                            i7 = w;
                                            i25 = i35;
                                            i6 = i40;
                                            i26 = i36;
                                            vx0Var11 = vx0Var;
                                            if (i45 == 5) {
                                                i31 = i6 + 4;
                                                i35 = i25 | i80;
                                                xex.c.f(obj5, j2, Float.intBitsToFloat(fxf.d0(i6, bArr2)));
                                                i30 = i2;
                                                break;
                                            }
                                            obj4 = obj5;
                                            i4 = i3;
                                            unsafe = unsafe3;
                                            i5 = i81;
                                            vx0Var2 = vx0Var11;
                                            i36 = i26;
                                            i35 = i25;
                                            obj2 = obj4;
                                            break;
                                        case 2:
                                        case 3:
                                            bArr2 = bArr;
                                            i7 = w;
                                            i25 = i35;
                                            i6 = i40;
                                            i26 = i36;
                                            vx0Var11 = vx0Var;
                                            if (i45 == 0) {
                                                i35 = i25 | i80;
                                                int k0 = fxf.k0(bArr2, i6, vx0Var11);
                                                unsafe5.putLong(obj5, j2, vx0Var11.b);
                                                i30 = i2;
                                                i31 = k0;
                                                break;
                                            }
                                            unsafe3 = unsafe5;
                                            obj4 = obj5;
                                            i4 = i3;
                                            unsafe = unsafe3;
                                            i5 = i81;
                                            vx0Var2 = vx0Var11;
                                            i36 = i26;
                                            i35 = i25;
                                            obj2 = obj4;
                                            break;
                                        case 4:
                                        case 11:
                                            bArr2 = bArr;
                                            i7 = w;
                                            i25 = i35;
                                            i6 = i40;
                                            i26 = i36;
                                            vx0Var11 = vx0Var;
                                            if (i45 == 0) {
                                                i35 = i25 | i80;
                                                i31 = fxf.h0(bArr2, i6, vx0Var11);
                                                unsafe5.putInt(obj5, j2, vx0Var11.a);
                                                i30 = i2;
                                                break;
                                            }
                                            unsafe3 = unsafe5;
                                            obj4 = obj5;
                                            i4 = i3;
                                            unsafe = unsafe3;
                                            i5 = i81;
                                            vx0Var2 = vx0Var11;
                                            i36 = i26;
                                            i35 = i25;
                                            obj2 = obj4;
                                            break;
                                        case 5:
                                        case 14:
                                            Unsafe unsafe10 = unsafe5;
                                            Object obj9 = obj5;
                                            i7 = w;
                                            i25 = i35;
                                            i6 = i40;
                                            i26 = i36;
                                            if (i45 != 1) {
                                                bArr2 = bArr;
                                                vx0Var11 = vx0Var;
                                                unsafe3 = unsafe10;
                                                obj4 = obj9;
                                                i4 = i3;
                                                unsafe = unsafe3;
                                                i5 = i81;
                                                vx0Var2 = vx0Var11;
                                                i36 = i26;
                                                i35 = i25;
                                                obj2 = obj4;
                                                break;
                                            } else {
                                                bArr2 = bArr;
                                                unsafe5 = unsafe10;
                                                vx0Var11 = vx0Var;
                                                obj5 = obj9;
                                                unsafe5.putLong(obj5, j2, fxf.n0(i6, bArr));
                                                i30 = i2;
                                                i31 = i6 + 8;
                                                i35 = i25 | i80;
                                                break;
                                            }
                                        case 6:
                                        case 13:
                                            unsafe2 = unsafe5;
                                            obj3 = obj5;
                                            i7 = w;
                                            i25 = i35;
                                            i6 = i40;
                                            bArr6 = bArr;
                                            vx0Var10 = vx0Var;
                                            i26 = i36;
                                            if (i45 != 5) {
                                                Unsafe unsafe11 = unsafe2;
                                                bArr2 = bArr6;
                                                obj4 = obj3;
                                                unsafe3 = unsafe11;
                                                vx0Var11 = vx0Var10;
                                                i4 = i3;
                                                unsafe = unsafe3;
                                                i5 = i81;
                                                vx0Var2 = vx0Var11;
                                                i36 = i26;
                                                i35 = i25;
                                                obj2 = obj4;
                                                break;
                                            } else {
                                                i31 = i6 + 4;
                                                i27 = i25 | i80;
                                                unsafe2.putInt(obj3, j2, fxf.d0(i6, bArr6));
                                                bArr8 = bArr6;
                                                vx0Var13 = vx0Var10;
                                                i35 = i27;
                                                obj5 = obj3;
                                                i33 = i7;
                                                i32 = i41;
                                                i34 = i81;
                                                unsafe5 = unsafe2;
                                                i36 = i26;
                                                i37 = 1048575;
                                                i30 = i2;
                                            }
                                        case 7:
                                            unsafe2 = unsafe5;
                                            obj3 = obj5;
                                            i7 = w;
                                            i25 = i35;
                                            i6 = i40;
                                            bArr6 = bArr;
                                            vx0Var10 = vx0Var;
                                            i26 = i36;
                                            if (i45 != 0) {
                                                Unsafe unsafe112 = unsafe2;
                                                bArr2 = bArr6;
                                                obj4 = obj3;
                                                unsafe3 = unsafe112;
                                                vx0Var11 = vx0Var10;
                                                i4 = i3;
                                                unsafe = unsafe3;
                                                i5 = i81;
                                                vx0Var2 = vx0Var11;
                                                i36 = i26;
                                                i35 = i25;
                                                obj2 = obj4;
                                                break;
                                            } else {
                                                int i83 = i25 | i80;
                                                int k02 = fxf.k0(bArr6, i6, vx0Var10);
                                                xex.c.c(obj3, j2, vx0Var10.b != 0);
                                                i30 = i2;
                                                vx0Var13 = vx0Var10;
                                                i35 = i83;
                                                obj5 = obj3;
                                                i33 = i7;
                                                i32 = i41;
                                                i34 = i81;
                                                i36 = i26;
                                                i37 = 1048575;
                                                i31 = k02;
                                                bArr8 = bArr6;
                                                unsafe5 = unsafe2;
                                            }
                                        case 8:
                                            unsafe2 = unsafe5;
                                            obj3 = obj5;
                                            i7 = w;
                                            i25 = i35;
                                            i6 = i40;
                                            bArr6 = bArr;
                                            vx0Var10 = vx0Var;
                                            i26 = i36;
                                            if (i45 != 2) {
                                                Unsafe unsafe1122 = unsafe2;
                                                bArr2 = bArr6;
                                                obj4 = obj3;
                                                unsafe3 = unsafe1122;
                                                vx0Var11 = vx0Var10;
                                                i4 = i3;
                                                unsafe = unsafe3;
                                                i5 = i81;
                                                vx0Var2 = vx0Var11;
                                                i36 = i26;
                                                i35 = i25;
                                                obj2 = obj4;
                                                break;
                                            } else {
                                                if ((i46 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                                                    int i84 = i25 | i80;
                                                    h03 = fxf.h0(bArr6, i6, vx0Var10);
                                                    int i85 = vx0Var10.a;
                                                    if (i85 < 0) {
                                                        tiu.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i85 == 0) {
                                                        vx0Var10.c = "";
                                                        i28 = i84;
                                                    } else {
                                                        int i86 = zex.a;
                                                        int length2 = bArr6.length;
                                                        if ((((length2 - h03) - i85) | h03 | i85) < 0) {
                                                            wvs.j("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length2), Integer.valueOf(h03), Integer.valueOf(i85)});
                                                            return 0;
                                                        }
                                                        int i87 = h03 + i85;
                                                        char[] cArr = new char[i85];
                                                        int i88 = 0;
                                                        while (h03 < i87) {
                                                            byte b2 = bArr6[h03];
                                                            if (b2 >= 0) {
                                                                h03++;
                                                                cArr[i88] = (char) b2;
                                                                i88++;
                                                            } else {
                                                                while (h03 < i87) {
                                                                    int i89 = h03 + 1;
                                                                    int i90 = h03;
                                                                    byte b3 = bArr6[i90];
                                                                    if (b3 >= 0) {
                                                                        int i91 = i88 + 1;
                                                                        cArr[i88] = (char) b3;
                                                                        h03 = i89;
                                                                        while (true) {
                                                                            i88 = i91;
                                                                            if (h03 < i87 && (b = bArr6[h03]) >= 0) {
                                                                                h03++;
                                                                                i91 = i88 + 1;
                                                                                cArr[i88] = (char) b;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        int i92 = i84;
                                                                        if (b3 >= -32) {
                                                                            if (b3 >= -16) {
                                                                                i29 = i87;
                                                                                if (i89 >= i29 - 2) {
                                                                                    tiu.i("Protocol message had invalid UTF-8.");
                                                                                    return 0;
                                                                                }
                                                                                byte b4 = bArr6[i89];
                                                                                int i93 = i90 + 3;
                                                                                byte b5 = bArr6[i90 + 2];
                                                                                int i94 = i90 + 4;
                                                                                byte b6 = bArr6[i93];
                                                                                if (cb0.J(b4)) {
                                                                                    break;
                                                                                } else if ((((b4 + 112) + (b3 << 28)) >> 30) == 0 && !cb0.J(b5) && !cb0.J(b6)) {
                                                                                    int i95 = ((b3 & 7) << 18) | ((b4 & 63) << 12) | ((b5 & 63) << 6) | (b6 & 63);
                                                                                    cArr[i88] = (char) ((i95 >>> 10) + 55232);
                                                                                    cArr[i88 + 1] = (char) ((i95 & 1023) + 56320);
                                                                                    i88 += 2;
                                                                                    i84 = i92;
                                                                                    h03 = i94;
                                                                                }
                                                                            } else {
                                                                                if (i89 >= i87 - 1) {
                                                                                    tiu.i("Protocol message had invalid UTF-8.");
                                                                                    return 0;
                                                                                }
                                                                                int i96 = i88 + 1;
                                                                                int i97 = i90 + 2;
                                                                                byte b7 = bArr6[i89];
                                                                                int i98 = i90 + 3;
                                                                                byte b8 = bArr6[i97];
                                                                                if (!cb0.J(b7)) {
                                                                                    i29 = i87;
                                                                                    if (b3 == -32) {
                                                                                        if (b7 < -96) {
                                                                                            break;
                                                                                        } else {
                                                                                            b3 = -32;
                                                                                        }
                                                                                    }
                                                                                    if (b3 == -19) {
                                                                                        if (b7 >= -96) {
                                                                                            break;
                                                                                        } else {
                                                                                            b3 = -19;
                                                                                        }
                                                                                    }
                                                                                    if (cb0.J(b8)) {
                                                                                        break;
                                                                                    } else {
                                                                                        cArr[i88] = (char) (((b3 & 15) << 12) | ((b7 & 63) << 6) | (b8 & 63));
                                                                                        i84 = i92;
                                                                                        h03 = i98;
                                                                                        i88 = i96;
                                                                                    }
                                                                                } else {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            i87 = i29;
                                                                        } else {
                                                                            if (i89 >= i87) {
                                                                                tiu.i("Protocol message had invalid UTF-8.");
                                                                                return 0;
                                                                            }
                                                                            int i99 = i88 + 1;
                                                                            int i100 = i90 + 2;
                                                                            byte b9 = bArr6[i89];
                                                                            if (b3 >= -62 && !cb0.J(b9)) {
                                                                                cArr[i88] = (char) (((b3 & 31) << 6) | (b9 & 63));
                                                                                i84 = i92;
                                                                                h03 = i100;
                                                                                i88 = i99;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i28 = i84;
                                                                vx0Var10.c = new String(cArr, 0, i88);
                                                                h03 = i87;
                                                            }
                                                        }
                                                        while (h03 < i87) {
                                                        }
                                                        i28 = i84;
                                                        vx0Var10.c = new String(cArr, 0, i88);
                                                        h03 = i87;
                                                    }
                                                    i27 = i28;
                                                } else {
                                                    h03 = fxf.h0(bArr6, i6, vx0Var10);
                                                    int i101 = vx0Var10.a;
                                                    if (i101 < 0) {
                                                        tiu.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    i27 = i25 | i80;
                                                    if (i101 == 0) {
                                                        vx0Var10.c = "";
                                                    } else {
                                                        vx0Var10.c = new String(bArr6, h03, i101, xcx.a);
                                                        h03 += i101;
                                                    }
                                                }
                                                i31 = h03;
                                                unsafe2.putObject(obj3, j2, vx0Var10.c);
                                                bArr8 = bArr6;
                                                vx0Var13 = vx0Var10;
                                                i35 = i27;
                                                obj5 = obj3;
                                                i33 = i7;
                                                i32 = i41;
                                                i34 = i81;
                                                unsafe5 = unsafe2;
                                                i36 = i26;
                                                i37 = 1048575;
                                                i30 = i2;
                                            }
                                            break;
                                        case 9:
                                            Object obj10 = obj5;
                                            Unsafe unsafe12 = unsafe5;
                                            i7 = w;
                                            i6 = i40;
                                            if (i45 != 2) {
                                                vx0Var10 = vx0Var;
                                                bArr2 = bArr;
                                                obj4 = obj10;
                                                unsafe3 = unsafe12;
                                                i25 = i35;
                                                i26 = i36;
                                                vx0Var11 = vx0Var10;
                                                i4 = i3;
                                                unsafe = unsafe3;
                                                i5 = i81;
                                                vx0Var2 = vx0Var11;
                                                i36 = i26;
                                                i35 = i25;
                                                obj2 = obj4;
                                                break;
                                            } else {
                                                i35 |= i80;
                                                Object C = bexVar.C(i7, obj10);
                                                vx0Var13 = vx0Var;
                                                i30 = i2;
                                                i31 = fxf.m0(C, bexVar.B(i7), bArr, i6, i30, vx0Var13);
                                                bexVar.m(i7, obj10, C);
                                                bArr8 = bArr;
                                                obj5 = obj10;
                                                i33 = i7;
                                                i32 = i41;
                                                i34 = i81;
                                                unsafe5 = unsafe12;
                                                break;
                                            }
                                        case 10:
                                            Object obj11 = obj5;
                                            unsafe4 = unsafe5;
                                            obj4 = obj11;
                                            bArr7 = bArr;
                                            vx0Var12 = vx0Var;
                                            i7 = w;
                                            i6 = i40;
                                            if (i45 == 2) {
                                                i35 |= i80;
                                                i31 = fxf.c0(bArr7, i6, vx0Var12);
                                                unsafe4.putObject(obj4, j2, vx0Var12.c);
                                                break;
                                            }
                                            i25 = i35;
                                            i26 = i36;
                                            vx0Var11 = vx0Var12;
                                            bArr2 = bArr7;
                                            unsafe3 = unsafe4;
                                            i4 = i3;
                                            unsafe = unsafe3;
                                            i5 = i81;
                                            vx0Var2 = vx0Var11;
                                            i36 = i26;
                                            i35 = i25;
                                            obj2 = obj4;
                                            break;
                                        case 12:
                                            Object obj12 = obj5;
                                            unsafe4 = unsafe5;
                                            obj4 = obj12;
                                            bArr7 = bArr;
                                            vx0Var12 = vx0Var;
                                            i7 = w;
                                            i6 = i40;
                                            if (i45 == 0) {
                                                int h012 = fxf.h0(bArr7, i6, vx0Var12);
                                                int i102 = vx0Var12.a;
                                                jax A3 = bexVar.A(i7);
                                                if ((i46 & Integer.MIN_VALUE) == 0 || A3 == null || A3.a(i102)) {
                                                    i35 |= i80;
                                                    unsafe4.putInt(obj4, j2, i102);
                                                } else {
                                                    mcx mcxVar2 = (mcx) obj4;
                                                    sex sexVar7 = mcxVar2.zzc;
                                                    if (sexVar7 == sexVar) {
                                                        sexVar7 = sex.b();
                                                        mcxVar2.zzc = sexVar7;
                                                    }
                                                    sexVar7.c(i36, Long.valueOf(i102));
                                                }
                                                obj5 = obj4;
                                                unsafe5 = unsafe4;
                                                i31 = h012;
                                                break;
                                            }
                                            i25 = i35;
                                            i26 = i36;
                                            vx0Var11 = vx0Var12;
                                            bArr2 = bArr7;
                                            unsafe3 = unsafe4;
                                            i4 = i3;
                                            unsafe = unsafe3;
                                            i5 = i81;
                                            vx0Var2 = vx0Var11;
                                            i36 = i26;
                                            i35 = i25;
                                            obj2 = obj4;
                                            break;
                                        case 15:
                                            Object obj13 = obj5;
                                            unsafe4 = unsafe5;
                                            obj4 = obj13;
                                            bArr7 = bArr;
                                            vx0Var12 = vx0Var;
                                            i7 = w;
                                            i6 = i40;
                                            if (i45 == 0) {
                                                i35 |= i80;
                                                i31 = fxf.h0(bArr7, i6, vx0Var12);
                                                int i103 = vx0Var12.a;
                                                unsafe4.putInt(obj4, j2, (i103 >>> 1) ^ (-(i103 & 1)));
                                                break;
                                            }
                                            i25 = i35;
                                            i26 = i36;
                                            vx0Var11 = vx0Var12;
                                            bArr2 = bArr7;
                                            unsafe3 = unsafe4;
                                            i4 = i3;
                                            unsafe = unsafe3;
                                            i5 = i81;
                                            vx0Var2 = vx0Var11;
                                            i36 = i26;
                                            i35 = i25;
                                            obj2 = obj4;
                                            break;
                                        case 16:
                                            bArr7 = bArr;
                                            vx0Var12 = vx0Var;
                                            i7 = w;
                                            i6 = i40;
                                            if (i45 != 0) {
                                                Object obj14 = obj5;
                                                unsafe4 = unsafe5;
                                                obj4 = obj14;
                                                i25 = i35;
                                                i26 = i36;
                                                vx0Var11 = vx0Var12;
                                                bArr2 = bArr7;
                                                unsafe3 = unsafe4;
                                                i4 = i3;
                                                unsafe = unsafe3;
                                                i5 = i81;
                                                vx0Var2 = vx0Var11;
                                                i36 = i26;
                                                i35 = i25;
                                                obj2 = obj4;
                                                break;
                                            } else {
                                                i35 |= i80;
                                                int k03 = fxf.k0(bArr7, i6, vx0Var12);
                                                long j6 = vx0Var12.b;
                                                unsafe5.putLong(obj5, j2, (-(j6 & 1)) ^ (j6 >>> 1));
                                                obj5 = obj5;
                                                unsafe5 = unsafe5;
                                                i30 = i2;
                                                i31 = k03;
                                                break;
                                            }
                                        default:
                                            if (i45 != 3) {
                                                i7 = w;
                                                bArr2 = bArr;
                                                unsafe3 = unsafe5;
                                                obj4 = obj5;
                                                i25 = i35;
                                                i6 = i40;
                                                i26 = i36;
                                                vx0Var11 = vx0Var;
                                                i4 = i3;
                                                unsafe = unsafe3;
                                                i5 = i81;
                                                vx0Var2 = vx0Var11;
                                                i36 = i26;
                                                i35 = i25;
                                                obj2 = obj4;
                                                break;
                                            } else {
                                                i35 |= i80;
                                                Object C2 = bexVar.C(w, obj5);
                                                i7 = w;
                                                i31 = fxf.l0(C2, bexVar.B(w), bArr, i40, i2, (i41 << 3) | 4, vx0Var);
                                                vx0Var12 = vx0Var;
                                                bArr7 = bArr;
                                                bexVar.m(i7, obj5, C2);
                                                break;
                                            }
                                    }
                                }
                            } else {
                                i4 = i3;
                                unsafe = unsafe5;
                                vx0Var2 = vx0Var13;
                                i5 = i34;
                                iArr = iArr2;
                                objArr = objArr2;
                                i6 = i40;
                                i7 = 0;
                                bArr2 = bArr;
                                obj2 = obj5;
                            }
                            if (i36 == i4 || i4 == 0) {
                                mcx mcxVar3 = (mcx) obj2;
                                sexVar2 = mcxVar3.zzc;
                                if (sexVar2 == sexVar) {
                                    sexVar2 = sex.b();
                                    mcxVar3.zzc = sexVar2;
                                }
                                int i104 = i36;
                                int g0 = fxf.g0(i104, bArr2, i6, i2, sexVar2, vx0Var2);
                                bexVar = this;
                                vx0Var13 = vx0Var;
                                i36 = i104;
                                i30 = i2;
                                obj5 = obj2;
                                i33 = i7;
                                i32 = i41;
                                unsafe5 = unsafe;
                                i34 = i5;
                                i37 = 1048575;
                                i31 = g0;
                                bArr8 = bArr;
                            } else {
                                i30 = i2;
                                i31 = i6;
                            }
                        }
                        w = -1;
                        sexVar = sex.f;
                        if (w == -1) {
                        }
                        if (i36 == i4) {
                        }
                        mcx mcxVar32 = (mcx) obj2;
                        sexVar2 = mcxVar32.zzc;
                        if (sexVar2 == sexVar) {
                        }
                        int i1042 = i36;
                        int g02 = fxf.g0(i1042, bArr2, i6, i2, sexVar2, vx0Var2);
                        bexVar = this;
                        vx0Var13 = vx0Var;
                        i36 = i1042;
                        i30 = i2;
                        obj5 = obj2;
                        i33 = i7;
                        i32 = i41;
                        unsafe5 = unsafe;
                        i34 = i5;
                        i37 = 1048575;
                        i31 = g02;
                        bArr8 = bArr;
                    } else {
                        if (i41 >= i43 && i41 <= i42) {
                            w = bexVar.w(i41, 0);
                            sexVar = sex.f;
                            if (w == -1) {
                            }
                            if (i36 == i4) {
                            }
                            mcx mcxVar322 = (mcx) obj2;
                            sexVar2 = mcxVar322.zzc;
                            if (sexVar2 == sexVar) {
                            }
                            int i10422 = i36;
                            int g022 = fxf.g0(i10422, bArr2, i6, i2, sexVar2, vx0Var2);
                            bexVar = this;
                            vx0Var13 = vx0Var;
                            i36 = i10422;
                            i30 = i2;
                            obj5 = obj2;
                            i33 = i7;
                            i32 = i41;
                            unsafe5 = unsafe;
                            i34 = i5;
                            i37 = 1048575;
                            i31 = g022;
                            bArr8 = bArr;
                        }
                        w = -1;
                        sexVar = sex.f;
                        if (w == -1) {
                        }
                        if (i36 == i4) {
                        }
                        mcx mcxVar3222 = (mcx) obj2;
                        sexVar2 = mcxVar3222.zzc;
                        if (sexVar2 == sexVar) {
                        }
                        int i104222 = i36;
                        int g0222 = fxf.g0(i104222, bArr2, i6, i2, sexVar2, vx0Var2);
                        bexVar = this;
                        vx0Var13 = vx0Var;
                        i36 = i104222;
                        i30 = i2;
                        obj5 = obj2;
                        i33 = i7;
                        i32 = i41;
                        unsafe5 = unsafe;
                        i34 = i5;
                        i37 = 1048575;
                        i31 = g0222;
                        bArr8 = bArr;
                    }
                } else {
                    i4 = i3;
                    unsafe = unsafe5;
                    i5 = i34;
                    iArr = iArr2;
                    objArr = objArr2;
                    obj2 = obj5;
                }
            }
        }
    }

    public final int w(int i, int i2) {
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

    public final int y(int i) {
        return this.a[i + 1];
    }
}
