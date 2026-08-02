package com.google.crypto.tink.shaded.protobuf;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import defpackage.a4j;
import defpackage.aye;
import defpackage.b1c;
import defpackage.cjn;
import defpackage.cmt;
import defpackage.d8;
import defpackage.e7o;
import defpackage.ec3;
import defpackage.eta;
import defpackage.hpe;
import defpackage.hrg;
import defpackage.i9c;
import defpackage.jut;
import defpackage.kkt;
import defpackage.kr4;
import defpackage.l1j;
import defpackage.mn3;
import defpackage.mut;
import defpackage.n8a;
import defpackage.n8n;
import defpackage.okt;
import defpackage.ouj;
import defpackage.pug;
import defpackage.q9h;
import defpackage.qse;
import defpackage.sic;
import defpackage.sk3;
import defpackage.t8;
import defpackage.t9h;
import defpackage.tr4;
import defpackage.tse;
import defpackage.u8g;
import defpackage.vto;
import defpackage.wx0;
import defpackage.wym;
import defpackage.xxe;
import defpackage.y0c;
import defpackage.zlt;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class e implements vto {
    public static final int[] o = new int[0];
    public static final Unsafe p = cmt.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final d8 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final a4j k;
    public final u8g l;
    public final okt m;
    public final t9h n;

    public e(int[] iArr, Object[] objArr, int i, int i2, d8 d8Var, boolean z, int[] iArr2, int i3, int i4, a4j a4jVar, u8g u8gVar, okt oktVar, b1c b1cVar, t9h t9hVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = d8Var instanceof c;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = a4jVar;
        this.l = u8gVar;
        this.m = oktVar;
        this.e = d8Var;
        this.n = t9hVar;
    }

    public static int A(long j, Object obj) {
        return ((Integer) cmt.d.i(j, obj)).intValue();
    }

    public static long B(long j, Object obj) {
        return ((Long) cmt.d.i(j, obj)).longValue();
    }

    public static Field J(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder u = ouj.u("Field ", str, " for ");
            u.append(cls.getName());
            u.append(" not found. Known fields are ");
            u.append(Arrays.toString(declaredFields));
            throw new RuntimeException(u.toString());
        }
    }

    public static int N(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void Q(int i, Object obj, b bVar) {
        if (!(obj instanceof String)) {
            bVar.a(i, (mn3) obj);
            return;
        }
        String str = (String) obj;
        a aVar = bVar.a;
        aVar.r(i, 2);
        int i2 = aVar.c;
        byte[] bArr = aVar.b;
        int i3 = aVar.d;
        try {
            int i4 = a.i(str.length() * 3);
            int i5 = a.i(str.length());
            if (i5 != i4) {
                aVar.s(mut.b(str));
                int i6 = aVar.d;
                aVar.d = mut.a.C(str, bArr, i6, i2 - i6);
                return;
            }
            int i7 = i3 + i5;
            aVar.d = i7;
            int C = mut.a.C(str, bArr, i7, i2 - i7);
            aVar.d = i3;
            aVar.s((C - i3) - i5);
            aVar.d = C;
        } catch (IndexOutOfBoundsException e) {
            throw new tr4(e);
        } catch (jut e2) {
            aVar.d = i3;
            a.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(tse.a);
            try {
                aVar.s(bytes.length);
                aVar.l(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e3) {
                throw new tr4(e3);
            } catch (tr4 e4) {
                throw e4;
            }
        }
    }

    public static List t(long j, Object obj) {
        return (List) cmt.d.i(j, obj);
    }

    public static e x(cjn cjnVar, a4j a4jVar, u8g u8gVar, okt oktVar, b1c b1cVar, t9h t9hVar) {
        if (cjnVar instanceof cjn) {
            return y(cjnVar, a4jVar, u8gVar, oktVar, b1cVar, t9hVar);
        }
        cjnVar.getClass();
        l1j.f();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e y(cjn cjnVar, a4j a4jVar, u8g u8gVar, okt oktVar, b1c b1cVar, t9h t9hVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        boolean z;
        int[] iArr2;
        int i18;
        int objectFieldOffset;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field J;
        int i25;
        char charAt11;
        int i26;
        int i27;
        Field J2;
        Field J3;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        int i31;
        char charAt14;
        int i32;
        char charAt15;
        char charAt16;
        int i33 = 0;
        boolean z2 = (cjnVar.d & 1) != 1;
        String str = cjnVar.b;
        int length = str.length();
        int charAt17 = str.charAt(0);
        if (charAt17 >= 55296) {
            int i34 = charAt17 & 8191;
            int i35 = 1;
            int i36 = 13;
            while (true) {
                i = i35 + 1;
                charAt16 = str.charAt(i35);
                if (charAt16 < 55296) {
                    break;
                }
                i34 |= (charAt16 & 8191) << i36;
                i36 += 13;
                i35 = i;
            }
            charAt17 = i34 | (charAt16 << i36);
        } else {
            i = 1;
        }
        int i37 = i + 1;
        int charAt18 = str.charAt(i);
        if (charAt18 >= 55296) {
            int i38 = charAt18 & 8191;
            int i39 = 13;
            while (true) {
                i32 = i37 + 1;
                charAt15 = str.charAt(i37);
                if (charAt15 < 55296) {
                    break;
                }
                i38 |= (charAt15 & 8191) << i39;
                i39 += 13;
                i37 = i32;
            }
            charAt18 = i38 | (charAt15 << i39);
            i37 = i32;
        }
        if (charAt18 == 0) {
            i4 = 0;
            i6 = 0;
            charAt = 0;
            charAt2 = 0;
            i3 = 0;
            iArr = o;
            i5 = 0;
        } else {
            int i40 = i37 + 1;
            int charAt19 = str.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt10 = str.charAt(i40);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i41 |= (charAt10 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                charAt19 = i41 | (charAt10 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int charAt20 = str.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt9 = str.charAt(i43);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i44 |= (charAt9 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                charAt20 = i44 | (charAt9 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int charAt21 = str.charAt(i43);
            if (charAt21 >= 55296) {
                int i47 = charAt21 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt8 = str.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt21 = i47 | (charAt8 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            int charAt22 = str.charAt(i46);
            if (charAt22 >= 55296) {
                int i50 = charAt22 & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt7 = str.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt22 = i50 | (charAt7 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            charAt = str.charAt(i49);
            if (charAt >= 55296) {
                int i53 = charAt & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt6 = str.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                charAt = i53 | (charAt6 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            charAt2 = str.charAt(i52);
            if (charAt2 >= 55296) {
                int i56 = charAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    charAt5 = str.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                charAt2 = i56 | (charAt5 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int charAt23 = str.charAt(i55);
            if (charAt23 >= 55296) {
                int i59 = charAt23 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i8 = i60 + 1;
                    charAt4 = str.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i59 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i60 = i8;
                }
                charAt23 = i59 | (charAt4 << i61);
                i2 = i8;
            } else {
                i2 = i58;
            }
            int i62 = i2 + 1;
            int charAt24 = str.charAt(i2);
            if (charAt24 >= 55296) {
                int i63 = charAt24 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i7 = i64 + 1;
                    charAt3 = str.charAt(i64);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i64 = i7;
                }
                charAt24 = i63 | (charAt3 << i65);
                i62 = i7;
            }
            int[] iArr3 = new int[charAt24 + charAt2 + charAt23];
            i3 = (charAt19 * 2) + charAt20;
            int i66 = charAt21;
            iArr = iArr3;
            i4 = i66;
            i5 = charAt22;
            i6 = charAt24;
            i33 = charAt19;
            i37 = i62;
        }
        Unsafe unsafe = p;
        Object[] objArr = cjnVar.c;
        int i67 = i33;
        Class<?> cls = cjnVar.a.getClass();
        int i68 = charAt17;
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i69 = charAt2 + i6;
        int i70 = i6;
        int i71 = i69;
        int i72 = 0;
        int i73 = 0;
        while (i37 < length) {
            int i74 = i37 + 1;
            int charAt25 = str.charAt(i37);
            int i75 = length;
            if (charAt25 >= 55296) {
                int i76 = charAt25 & 8191;
                int i77 = i74;
                int i78 = 13;
                while (true) {
                    i31 = i77 + 1;
                    charAt14 = str.charAt(i77);
                    i15 = i4;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i76 |= (charAt14 & 8191) << i78;
                    i78 += 13;
                    i77 = i31;
                    i4 = i15;
                }
                charAt25 = i76 | (charAt14 << i78);
                i16 = i31;
            } else {
                i15 = i4;
                i16 = i74;
            }
            int i79 = i16 + 1;
            int charAt26 = str.charAt(i16);
            if (charAt26 >= 55296) {
                int i80 = charAt26 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i29 = i81 + 1;
                    charAt13 = str.charAt(i81);
                    i30 = i80;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i80 = i30 | ((charAt13 & 8191) << i82);
                    i82 += 13;
                    i81 = i29;
                }
                charAt26 = i30 | (charAt13 << i82);
                i17 = i29;
            } else {
                i17 = i79;
            }
            Object[] objArr3 = objArr;
            int i83 = charAt26 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i84 = charAt25;
            if ((charAt26 & 1024) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            int i85 = i5;
            if (i83 >= 51) {
                int i86 = i17 + 1;
                int charAt27 = str.charAt(i17);
                char c = 55296;
                if (charAt27 >= 55296) {
                    int i87 = charAt27 & 8191;
                    int i88 = 13;
                    while (true) {
                        i28 = i86 + 1;
                        charAt12 = str.charAt(i86);
                        if (charAt12 < c) {
                            break;
                        }
                        i87 |= (charAt12 & 8191) << i88;
                        i88 += 13;
                        i86 = i28;
                        c = 55296;
                    }
                    charAt27 = i87 | (charAt12 << i88);
                    i86 = i28;
                }
                int i89 = i83 - 51;
                int i90 = charAt27;
                if (i89 == 9 || i89 == 17) {
                    i27 = i86;
                    objArr2[hrg.B(i72, 3, 2, 1)] = objArr3[i3];
                    i3++;
                } else if (i89 == 12) {
                    i27 = i86;
                    if ((i68 & 1) == 1) {
                        objArr2[hrg.B(i72, 3, 2, 1)] = objArr3[i3];
                        i3++;
                    }
                } else {
                    i27 = i86;
                }
                int i91 = i90 * 2;
                Object obj = objArr3[i91];
                if (obj instanceof Field) {
                    J2 = (Field) obj;
                } else {
                    J2 = J((String) obj, cls);
                    objArr3[i91] = J2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(J2);
                int i92 = i91 + 1;
                Object obj2 = objArr3[i92];
                if (obj2 instanceof Field) {
                    J3 = (Field) obj2;
                } else {
                    J3 = J((String) obj2, cls);
                    objArr3[i92] = J3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(J3);
                int i93 = i27;
                z = z2;
                i20 = i93;
                iArr2 = iArr;
                i23 = i3;
                i19 = i72;
                i21 = objectFieldOffset3;
                i24 = objectFieldOffset2;
                i22 = 0;
            } else {
                int i94 = i3 + 1;
                Field J4 = J((String) objArr3[i3], cls);
                if (i83 == 9 || i83 == 17) {
                    z = z2;
                    iArr2 = iArr;
                    objArr2[hrg.B(i72, 3, 2, 1)] = J4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        z = z2;
                        iArr2 = iArr;
                        i26 = i3 + 2;
                        objArr2[hrg.B(i72, 3, 2, 1)] = objArr3[i94];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        z = z2;
                        iArr2 = iArr;
                        if ((i68 & 1) == 1) {
                            i26 = i3 + 2;
                            objArr2[hrg.B(i72, 3, 2, 1)] = objArr3[i94];
                        }
                    } else if (i83 == 50) {
                        int i95 = i70 + 1;
                        iArr[i70] = i72;
                        int i96 = (i72 / 3) * 2;
                        int i97 = i3 + 2;
                        objArr2[i96] = objArr3[i94];
                        if ((charAt26 & 2048) != 0) {
                            i18 = i3 + 3;
                            objArr2[i96 + 1] = objArr3[i97];
                            z = z2;
                            iArr2 = iArr;
                            i70 = i95;
                        } else {
                            iArr2 = iArr;
                            i18 = i97;
                            i70 = i95;
                            z = z2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(J4);
                        if ((i68 & 1) == 1 || i83 > 17) {
                            i19 = i72;
                            i20 = i17;
                            i21 = 0;
                            i22 = 0;
                        } else {
                            i20 = i17 + 1;
                            int charAt28 = str.charAt(i17);
                            if (charAt28 >= 55296) {
                                int i98 = charAt28 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i25 = i20 + 1;
                                    charAt11 = str.charAt(i20);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i98 |= (charAt11 & 8191) << i99;
                                    i99 += 13;
                                    i20 = i25;
                                }
                                charAt28 = i98 | (charAt11 << i99);
                                i20 = i25;
                            }
                            int i100 = (charAt28 / 32) + (i67 * 2);
                            Object obj3 = objArr3[i100];
                            if (obj3 instanceof Field) {
                                J = (Field) obj3;
                            } else {
                                J = J((String) obj3, cls);
                                objArr3[i100] = J;
                            }
                            i19 = i72;
                            int i101 = charAt28;
                            i21 = (int) unsafe.objectFieldOffset(J);
                            i22 = i101 % 32;
                        }
                        if (i83 >= 18 || i83 > 49) {
                            i23 = i18;
                            i24 = objectFieldOffset;
                        } else {
                            iArr2[i71] = objectFieldOffset;
                            i23 = i18;
                            i24 = objectFieldOffset;
                            i71++;
                        }
                    } else {
                        z = z2;
                        iArr2 = iArr;
                    }
                    i18 = i26;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(J4);
                    if ((i68 & 1) == 1) {
                    }
                    i19 = i72;
                    i20 = i17;
                    i21 = 0;
                    i22 = 0;
                    if (i83 >= 18) {
                    }
                    i23 = i18;
                    i24 = objectFieldOffset;
                }
                i18 = i94;
                objectFieldOffset = (int) unsafe.objectFieldOffset(J4);
                if ((i68 & 1) == 1) {
                }
                i19 = i72;
                i20 = i17;
                i21 = 0;
                i22 = 0;
                if (i83 >= 18) {
                }
                i23 = i18;
                i24 = objectFieldOffset;
            }
            int i102 = i19 + 1;
            iArr4[i19] = i84;
            int i103 = i19 + 2;
            String str2 = str;
            iArr4[i102] = ((charAt26 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt26 & 256) != 0 ? 268435456 : 0) | (i83 << 20) | i24;
            iArr4[i103] = (i22 << 20) | i21;
            i72 = i19 + 3;
            i3 = i23;
            i37 = i20;
            iArr = iArr2;
            objArr = objArr3;
            length = i75;
            i4 = i15;
            z2 = z;
            str = str2;
            i5 = i85;
        }
        return new e(iArr4, objArr2, i4, i5, cjnVar.a, z2, iArr, i6, i69, a4jVar, u8gVar, oktVar, b1cVar, t9hVar);
    }

    public static long z(int i) {
        return i & 1048575;
    }

    public final void C(long j, Object obj, int i) {
        Unsafe unsafe = p;
        Object n = n(i);
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((q9h) object).a) {
            q9h d = q9h.b.d();
            t9h.b(d, object);
            unsafe.putObject(obj, j, d);
        }
        eta.q(n);
        throw null;
    }

    public final int D(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, wx0 wx0Var) {
        Object object;
        Unsafe unsafe = p;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(sk3.u(i, bArr))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(sk3.t(i, bArr))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
            case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                int E = sk3.E(bArr, i, wx0Var);
                unsafe.putObject(obj, j, Long.valueOf(wx0Var.b));
                unsafe.putInt(obj, j2, i4);
                return E;
            case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int C = sk3.C(bArr, i, wx0Var);
                unsafe.putObject(obj, j, Integer.valueOf(wx0Var.a));
                unsafe.putInt(obj, j2, i4);
                return C;
            case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(sk3.u(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
            case SQLiteDatabase.OPEN_URI /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(sk3.t(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int E2 = sk3.E(bArr, i, wx0Var);
                unsafe.putObject(obj, j, Boolean.valueOf(wx0Var.b != 0));
                unsafe.putInt(obj, j2, i4);
                return E2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int C2 = sk3.C(bArr, i, wx0Var);
                int i13 = wx0Var.a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                        if (!mut.a.W(bArr, C2, C2 + i13)) {
                            throw aye.a();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, C2, i13, tse.a));
                    C2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return C2;
            case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                int w = sk3.w(o(i8), bArr, i, i2, wx0Var);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                Object obj2 = wx0Var.c;
                if (object == null) {
                    unsafe.putObject(obj, j, obj2);
                } else {
                    unsafe.putObject(obj, j, tse.c(object, obj2));
                }
                unsafe.putInt(obj, j2, i4);
                return w;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int s = sk3.s(bArr, i, wx0Var);
                unsafe.putObject(obj, j, wx0Var.c);
                unsafe.putInt(obj, j2, i4);
                return s;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int C3 = sk3.C(bArr, i, wx0Var);
                int i14 = wx0Var.a;
                m(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return C3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int C4 = sk3.C(bArr, i, wx0Var);
                unsafe.putObject(obj, j, Integer.valueOf(kr4.a(wx0Var.a)));
                unsafe.putInt(obj, j2, i4);
                return C4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int E3 = sk3.E(bArr, i, wx0Var);
                unsafe.putObject(obj, j, Long.valueOf(kr4.b(wx0Var.b)));
                unsafe.putInt(obj, j2, i4);
                return E3;
            case 68:
                if (i5 == 3) {
                    int v = sk3.v(o(i8), bArr, i, i2, (i3 & (-8)) | 4, wx0Var);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    Object obj3 = wx0Var.c;
                    if (object == null) {
                        unsafe.putObject(obj, j, obj3);
                    } else {
                        unsafe.putObject(obj, j, tse.c(object, obj3));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return v;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int E(Object obj, byte[] bArr, int i, int i2, int i3, wx0 wx0Var) {
        e eVar;
        Object obj2;
        Unsafe unsafe;
        Object obj3;
        int i4;
        int M;
        int i5;
        int i6;
        int i7;
        int i8;
        kkt kktVar;
        int i9;
        int i10;
        wx0 wx0Var2;
        byte[] bArr2;
        int i11;
        int i12;
        Unsafe unsafe2;
        int i13;
        wx0 wx0Var3;
        Unsafe unsafe3;
        int i14;
        int i15;
        Object obj4;
        int i16;
        e eVar2 = this;
        Object obj5 = obj;
        byte[] bArr3 = bArr;
        int i17 = i2;
        wx0 wx0Var4 = wx0Var;
        Unsafe unsafe4 = p;
        int i18 = 0;
        int i19 = i;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        int i24 = -1;
        while (true) {
            if (i19 < i17) {
                int i25 = i19 + 1;
                int i26 = bArr3[i19];
                if (i26 < 0) {
                    i25 = sk3.B(i26, bArr3, i25, wx0Var4);
                    i26 = wx0Var4.a;
                }
                int i27 = i26;
                i19 = i25;
                int i28 = i27 >>> 3;
                int i29 = i20;
                int i30 = i27 & 7;
                int i31 = eVar2.d;
                int i32 = eVar2.c;
                if (i28 > i23) {
                    int i33 = i29 / 3;
                    if (i28 >= i32 && i28 <= i31) {
                        M = eVar2.M(i28, i33);
                        i5 = M;
                        if (i5 != -1) {
                            eVar = eVar2;
                            obj2 = obj5;
                            i6 = i28;
                            unsafe = unsafe4;
                            i5 = i18;
                            i7 = i5;
                            i8 = i27;
                        } else {
                            int[] iArr = eVar2.a;
                            int i34 = iArr[i5 + 1];
                            i7 = i18;
                            int N = N(i34);
                            long j = i34 & 1048575;
                            if (N <= 17) {
                                int i35 = iArr[i5 + 2];
                                int i36 = 1 << (i35 >>> 20);
                                int i37 = i35 & 1048575;
                                if (i37 != i24) {
                                    if (i24 != -1) {
                                        unsafe4.putInt(obj5, i24, i22);
                                    }
                                    i9 = unsafe4.getInt(obj5, i37);
                                    i10 = i37;
                                } else {
                                    i9 = i22;
                                    i10 = i24;
                                }
                                switch (N) {
                                    case 0:
                                        i6 = i28;
                                        unsafe = unsafe4;
                                        i11 = i19;
                                        if (i30 == 1) {
                                            cmt.d.m(obj5, j, Double.longBitsToDouble(sk3.u(i11, bArr)));
                                            i19 = i11 + 8;
                                            i17 = i2;
                                            i24 = i10;
                                            i20 = i5;
                                            unsafe4 = unsafe;
                                            i23 = i6;
                                            i22 = i9 | i36;
                                            bArr3 = bArr;
                                            wx0Var4 = wx0Var;
                                            i21 = i27;
                                            i18 = i7;
                                            break;
                                        } else {
                                            obj2 = obj5;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 1:
                                        wx0Var2 = wx0Var;
                                        i6 = i28;
                                        bArr2 = bArr;
                                        unsafe = unsafe4;
                                        i11 = i19;
                                        if (i30 == 5) {
                                            cmt.d.n(obj5, j, Float.intBitsToFloat(sk3.t(i11, bArr2)));
                                            i19 = i11 + 4;
                                            i12 = i9 | i36;
                                            i17 = i2;
                                            wx0Var4 = wx0Var2;
                                            i24 = i10;
                                            i20 = i5;
                                            unsafe4 = unsafe;
                                            i18 = i7;
                                            i23 = i6;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            obj2 = obj5;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 2:
                                    case 3:
                                        wx0Var2 = wx0Var;
                                        i6 = i28;
                                        unsafe2 = unsafe4;
                                        i11 = i19;
                                        bArr2 = bArr;
                                        if (i30 == 0) {
                                            int E = sk3.E(bArr2, i11, wx0Var2);
                                            unsafe2.putLong(obj5, j, wx0Var2.b);
                                            unsafe = unsafe2;
                                            i12 = i9 | i36;
                                            i17 = i2;
                                            i19 = E;
                                            wx0Var4 = wx0Var2;
                                            i24 = i10;
                                            i20 = i5;
                                            unsafe4 = unsafe;
                                            i18 = i7;
                                            i23 = i6;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            unsafe = unsafe2;
                                            obj2 = obj5;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 4:
                                    case 11:
                                        i6 = i28;
                                        unsafe2 = unsafe4;
                                        i11 = i19;
                                        if (i30 == 0) {
                                            int C = sk3.C(bArr, i11, wx0Var);
                                            unsafe2.putInt(obj5, j, wx0Var.a);
                                            unsafe4 = unsafe2;
                                            bArr3 = bArr;
                                            i17 = i2;
                                            wx0Var4 = wx0Var;
                                            i24 = i10;
                                            i20 = i5;
                                            i21 = i27;
                                            i18 = i7;
                                            i22 = i9 | i36;
                                            i19 = C;
                                            i23 = i6;
                                            break;
                                        } else {
                                            unsafe = unsafe2;
                                            obj2 = obj5;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 5:
                                    case 14:
                                        i6 = i28;
                                        unsafe3 = unsafe4;
                                        if (i30 == 1) {
                                            unsafe3.putLong(obj5, j, sk3.u(i19, bArr));
                                            i19 += 8;
                                            int i38 = i10;
                                            i22 = i9 | i36;
                                            i17 = i2;
                                            i24 = i38;
                                            unsafe4 = unsafe3;
                                            bArr3 = bArr;
                                            wx0Var4 = wx0Var;
                                            i20 = i5;
                                            i21 = i27;
                                            i18 = i7;
                                            i23 = i6;
                                            break;
                                        } else {
                                            i11 = i19;
                                            obj2 = obj5;
                                            unsafe = unsafe3;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 6:
                                    case 13:
                                        i13 = i2;
                                        wx0Var3 = wx0Var;
                                        i6 = i28;
                                        unsafe3 = unsafe4;
                                        i14 = i19;
                                        bArr2 = bArr;
                                        if (i30 == 5) {
                                            unsafe3.putInt(obj5, j, sk3.t(i14, bArr2));
                                            i19 = i14 + 4;
                                            i12 = i9 | i36;
                                            unsafe4 = unsafe3;
                                            i17 = i13;
                                            wx0Var4 = wx0Var3;
                                            i24 = i10;
                                            i20 = i5;
                                            i18 = i7;
                                            i23 = i6;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            obj2 = obj5;
                                            i11 = i14;
                                            unsafe = unsafe3;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 7:
                                        i13 = i2;
                                        wx0Var3 = wx0Var;
                                        i6 = i28;
                                        unsafe3 = unsafe4;
                                        i14 = i19;
                                        bArr2 = bArr;
                                        if (i30 == 0) {
                                            i19 = sk3.E(bArr2, i14, wx0Var3);
                                            cmt.d.k(obj5, j, wx0Var3.b != 0 ? 1 : i7);
                                            i12 = i9 | i36;
                                            unsafe4 = unsafe3;
                                            i17 = i13;
                                            wx0Var4 = wx0Var3;
                                            i24 = i10;
                                            i20 = i5;
                                            i18 = i7;
                                            i23 = i6;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            obj2 = obj5;
                                            i11 = i14;
                                            unsafe = unsafe3;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 8:
                                        i13 = i2;
                                        wx0Var3 = wx0Var;
                                        i6 = i28;
                                        unsafe3 = unsafe4;
                                        i14 = i19;
                                        bArr2 = bArr;
                                        if (i30 == 2) {
                                            i19 = (536870912 & i34) == 0 ? sk3.y(bArr2, i14, wx0Var3) : sk3.z(bArr2, i14, wx0Var3);
                                            unsafe3.putObject(obj5, j, wx0Var3.c);
                                            i12 = i9 | i36;
                                            unsafe4 = unsafe3;
                                            i17 = i13;
                                            wx0Var4 = wx0Var3;
                                            i24 = i10;
                                            i20 = i5;
                                            i18 = i7;
                                            i23 = i6;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            obj2 = obj5;
                                            i11 = i14;
                                            unsafe = unsafe3;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 9:
                                        i13 = i2;
                                        wx0Var3 = wx0Var;
                                        i6 = i28;
                                        unsafe3 = unsafe4;
                                        i14 = i19;
                                        bArr2 = bArr;
                                        if (i30 == 2) {
                                            i19 = sk3.w(eVar2.o(i5), bArr2, i14, i13, wx0Var3);
                                            if ((i9 & i36) == 0) {
                                                unsafe3.putObject(obj5, j, wx0Var3.c);
                                            } else {
                                                unsafe3.putObject(obj5, j, tse.c(unsafe3.getObject(obj5, j), wx0Var3.c));
                                            }
                                            i12 = i9 | i36;
                                            unsafe4 = unsafe3;
                                            i17 = i13;
                                            wx0Var4 = wx0Var3;
                                            i24 = i10;
                                            i20 = i5;
                                            i18 = i7;
                                            i23 = i6;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            obj2 = obj5;
                                            i11 = i14;
                                            unsafe = unsafe3;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 10:
                                        i13 = i2;
                                        wx0Var3 = wx0Var;
                                        i6 = i28;
                                        unsafe3 = unsafe4;
                                        i14 = i19;
                                        bArr2 = bArr;
                                        if (i30 == 2) {
                                            i19 = sk3.s(bArr2, i14, wx0Var3);
                                            unsafe3.putObject(obj5, j, wx0Var3.c);
                                            i12 = i9 | i36;
                                            unsafe4 = unsafe3;
                                            i17 = i13;
                                            wx0Var4 = wx0Var3;
                                            i24 = i10;
                                            i20 = i5;
                                            i18 = i7;
                                            i23 = i6;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            obj2 = obj5;
                                            i11 = i14;
                                            unsafe = unsafe3;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 12:
                                        i13 = i2;
                                        wx0Var3 = wx0Var;
                                        i6 = i28;
                                        unsafe3 = unsafe4;
                                        i14 = i19;
                                        bArr2 = bArr;
                                        if (i30 == 0) {
                                            i19 = sk3.C(bArr2, i14, wx0Var3);
                                            int i39 = wx0Var3.a;
                                            eVar2.m(i5);
                                            unsafe3.putInt(obj5, j, i39);
                                            i12 = i9 | i36;
                                            unsafe4 = unsafe3;
                                            i17 = i13;
                                            wx0Var4 = wx0Var3;
                                            i24 = i10;
                                            i20 = i5;
                                            i18 = i7;
                                            i23 = i6;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            obj2 = obj5;
                                            i11 = i14;
                                            unsafe = unsafe3;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 15:
                                        i13 = i2;
                                        wx0Var3 = wx0Var;
                                        i6 = i28;
                                        unsafe3 = unsafe4;
                                        i14 = i19;
                                        bArr2 = bArr;
                                        if (i30 == 0) {
                                            i19 = sk3.C(bArr2, i14, wx0Var3);
                                            unsafe3.putInt(obj5, j, kr4.a(wx0Var3.a));
                                            i12 = i9 | i36;
                                            unsafe4 = unsafe3;
                                            i17 = i13;
                                            wx0Var4 = wx0Var3;
                                            i24 = i10;
                                            i20 = i5;
                                            i18 = i7;
                                            i23 = i6;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            obj2 = obj5;
                                            i11 = i14;
                                            unsafe = unsafe3;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 16:
                                        i6 = i28;
                                        bArr2 = bArr;
                                        if (i30 == 0) {
                                            int E2 = sk3.E(bArr2, i19, wx0Var);
                                            Unsafe unsafe5 = unsafe4;
                                            unsafe5.putLong(obj5, j, kr4.b(wx0Var.b));
                                            i12 = i9 | i36;
                                            unsafe4 = unsafe5;
                                            i17 = i2;
                                            wx0Var4 = wx0Var;
                                            i24 = i10;
                                            i20 = i5;
                                            i18 = i7;
                                            i23 = i6;
                                            i19 = E2;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            obj2 = obj5;
                                            unsafe = unsafe4;
                                            i11 = i19;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    case 17:
                                        if (i30 == 3) {
                                            i6 = i28;
                                            i19 = sk3.v(eVar2.o(i5), bArr, i19, i2, (i28 << 3) | 4, wx0Var);
                                            bArr2 = bArr;
                                            wx0Var3 = wx0Var;
                                            i13 = i2;
                                            if ((i9 & i36) == 0) {
                                                unsafe4.putObject(obj5, j, wx0Var3.c);
                                            } else {
                                                unsafe4.putObject(obj5, j, tse.c(unsafe4.getObject(obj5, j), wx0Var3.c));
                                            }
                                            i12 = i9 | i36;
                                            i17 = i13;
                                            wx0Var4 = wx0Var3;
                                            i24 = i10;
                                            i20 = i5;
                                            i18 = i7;
                                            i23 = i6;
                                            i22 = i12;
                                            bArr3 = bArr2;
                                            i21 = i27;
                                            break;
                                        } else {
                                            i6 = i28;
                                            obj2 = obj5;
                                            unsafe = unsafe4;
                                            i11 = i19;
                                            eVar = eVar2;
                                            i19 = i11;
                                            i24 = i10;
                                            i8 = i27;
                                            i22 = i9;
                                            break;
                                        }
                                    default:
                                        obj2 = obj5;
                                        i6 = i28;
                                        unsafe = unsafe4;
                                        i11 = i19;
                                        eVar = eVar2;
                                        i19 = i11;
                                        i24 = i10;
                                        i8 = i27;
                                        i22 = i9;
                                        break;
                                }
                            } else {
                                i6 = i28;
                                Object obj6 = obj5;
                                unsafe = unsafe4;
                                if (N != 27) {
                                    i8 = i27;
                                    if (N <= 49) {
                                        int i40 = i24;
                                        int i41 = i22;
                                        obj3 = null;
                                        int G = eVar2.G(obj6, bArr, i19, i2, i8, i30, i5, i34, N, j, wx0Var);
                                        i8 = i8;
                                        i5 = i5;
                                        if (G != i19) {
                                            i24 = i40;
                                            i17 = i2;
                                            wx0Var4 = wx0Var;
                                            i21 = i8;
                                            i19 = G;
                                            i20 = i5;
                                            unsafe4 = unsafe;
                                            i22 = i41;
                                            i18 = i7;
                                            i23 = i6;
                                            obj5 = obj6;
                                            bArr3 = bArr;
                                        } else {
                                            i24 = i40;
                                            i4 = i3;
                                            obj2 = obj6;
                                            i19 = G;
                                            i22 = i41;
                                            eVar = eVar2;
                                            if (i8 == i4 || i4 == 0) {
                                                c cVar = (c) obj2;
                                                kktVar = cVar.unknownFields;
                                                if (kktVar == kkt.f) {
                                                    kktVar = kkt.b();
                                                    cVar.unknownFields = kktVar;
                                                }
                                                int i42 = i8;
                                                int A = sk3.A(i42, bArr, i19, i2, kktVar, wx0Var);
                                                bArr3 = bArr;
                                                i17 = i2;
                                                i21 = i42;
                                                eVar2 = eVar;
                                                i20 = i5;
                                                unsafe4 = unsafe;
                                                i18 = i7;
                                                i23 = i6;
                                                i19 = A;
                                                obj5 = obj2;
                                                wx0Var4 = wx0Var;
                                            } else {
                                                i17 = i2;
                                                i21 = i8;
                                            }
                                        }
                                    } else {
                                        i15 = i24;
                                        i16 = i22;
                                        obj4 = obj6;
                                        obj3 = null;
                                        i19 = i19;
                                        if (N != 50) {
                                            int D = eVar2.D(obj4, bArr, i19, i2, i8, i6, i30, i34, N, j, i5, wx0Var);
                                            obj2 = obj4;
                                            i8 = i8;
                                            eVar = eVar2;
                                            if (D != i19) {
                                                bArr3 = bArr;
                                                i24 = i15;
                                                i17 = i2;
                                                eVar2 = eVar;
                                                i19 = D;
                                                i20 = i5;
                                                unsafe4 = unsafe;
                                                i22 = i16;
                                                i18 = i7;
                                                i23 = i6;
                                                i21 = i8;
                                                obj5 = obj2;
                                                wx0Var4 = wx0Var;
                                            } else {
                                                i24 = i15;
                                                i4 = i3;
                                                i19 = D;
                                                i22 = i16;
                                                if (i8 == i4) {
                                                }
                                                c cVar2 = (c) obj2;
                                                kktVar = cVar2.unknownFields;
                                                if (kktVar == kkt.f) {
                                                }
                                                int i422 = i8;
                                                int A2 = sk3.A(i422, bArr, i19, i2, kktVar, wx0Var);
                                                bArr3 = bArr;
                                                i17 = i2;
                                                i21 = i422;
                                                eVar2 = eVar;
                                                i20 = i5;
                                                unsafe4 = unsafe;
                                                i18 = i7;
                                                i23 = i6;
                                                i19 = A2;
                                                obj5 = obj2;
                                                wx0Var4 = wx0Var;
                                            }
                                        } else if (i30 == 2) {
                                            eVar2.C(j, obj4, i5);
                                            throw null;
                                        }
                                    }
                                } else if (i30 == 2) {
                                    qse qseVar = (qse) unsafe.getObject(obj6, j);
                                    if (!((t8) qseVar).a) {
                                        int size = qseVar.size();
                                        qseVar = qseVar.b(size == 0 ? 10 : size * 2);
                                        unsafe.putObject(obj6, j, qseVar);
                                    }
                                    i17 = i2;
                                    i19 = sk3.x(eVar2.o(i5), i27, bArr, i19, i2, qseVar, wx0Var);
                                    i21 = i27;
                                    i20 = i5;
                                    obj5 = obj6;
                                    unsafe4 = unsafe;
                                    i18 = i7;
                                    i23 = i6;
                                    bArr3 = bArr;
                                    wx0Var4 = wx0Var;
                                } else {
                                    i15 = i24;
                                    i19 = i19;
                                    obj4 = obj6;
                                    i8 = i27;
                                    obj3 = null;
                                    i16 = i22;
                                }
                                i24 = i15;
                                i4 = i3;
                                eVar = eVar2;
                                obj2 = obj4;
                                i22 = i16;
                                if (i8 == i4) {
                                }
                                c cVar22 = (c) obj2;
                                kktVar = cVar22.unknownFields;
                                if (kktVar == kkt.f) {
                                }
                                int i4222 = i8;
                                int A22 = sk3.A(i4222, bArr, i19, i2, kktVar, wx0Var);
                                bArr3 = bArr;
                                i17 = i2;
                                i21 = i4222;
                                eVar2 = eVar;
                                i20 = i5;
                                unsafe4 = unsafe;
                                i18 = i7;
                                i23 = i6;
                                i19 = A22;
                                obj5 = obj2;
                                wx0Var4 = wx0Var;
                            }
                        }
                        obj3 = null;
                        i4 = i3;
                        if (i8 == i4) {
                        }
                        c cVar222 = (c) obj2;
                        kktVar = cVar222.unknownFields;
                        if (kktVar == kkt.f) {
                        }
                        int i42222 = i8;
                        int A222 = sk3.A(i42222, bArr, i19, i2, kktVar, wx0Var);
                        bArr3 = bArr;
                        i17 = i2;
                        i21 = i42222;
                        eVar2 = eVar;
                        i20 = i5;
                        unsafe4 = unsafe;
                        i18 = i7;
                        i23 = i6;
                        i19 = A222;
                        obj5 = obj2;
                        wx0Var4 = wx0Var;
                    }
                    M = -1;
                    i5 = M;
                    if (i5 != -1) {
                    }
                    obj3 = null;
                    i4 = i3;
                    if (i8 == i4) {
                    }
                    c cVar2222 = (c) obj2;
                    kktVar = cVar2222.unknownFields;
                    if (kktVar == kkt.f) {
                    }
                    int i422222 = i8;
                    int A2222 = sk3.A(i422222, bArr, i19, i2, kktVar, wx0Var);
                    bArr3 = bArr;
                    i17 = i2;
                    i21 = i422222;
                    eVar2 = eVar;
                    i20 = i5;
                    unsafe4 = unsafe;
                    i18 = i7;
                    i23 = i6;
                    i19 = A2222;
                    obj5 = obj2;
                    wx0Var4 = wx0Var;
                } else {
                    if (i28 >= i32 && i28 <= i31) {
                        M = eVar2.M(i28, i18);
                        i5 = M;
                        if (i5 != -1) {
                        }
                        obj3 = null;
                        i4 = i3;
                        if (i8 == i4) {
                        }
                        c cVar22222 = (c) obj2;
                        kktVar = cVar22222.unknownFields;
                        if (kktVar == kkt.f) {
                        }
                        int i4222222 = i8;
                        int A22222 = sk3.A(i4222222, bArr, i19, i2, kktVar, wx0Var);
                        bArr3 = bArr;
                        i17 = i2;
                        i21 = i4222222;
                        eVar2 = eVar;
                        i20 = i5;
                        unsafe4 = unsafe;
                        i18 = i7;
                        i23 = i6;
                        i19 = A22222;
                        obj5 = obj2;
                        wx0Var4 = wx0Var;
                    }
                    M = -1;
                    i5 = M;
                    if (i5 != -1) {
                    }
                    obj3 = null;
                    i4 = i3;
                    if (i8 == i4) {
                    }
                    c cVar222222 = (c) obj2;
                    kktVar = cVar222222.unknownFields;
                    if (kktVar == kkt.f) {
                    }
                    int i42222222 = i8;
                    int A222222 = sk3.A(i42222222, bArr, i19, i2, kktVar, wx0Var);
                    bArr3 = bArr;
                    i17 = i2;
                    i21 = i42222222;
                    eVar2 = eVar;
                    i20 = i5;
                    unsafe4 = unsafe;
                    i18 = i7;
                    i23 = i6;
                    i19 = A222222;
                    obj5 = obj2;
                    wx0Var4 = wx0Var;
                }
            } else {
                eVar = eVar2;
                obj2 = obj5;
                unsafe = unsafe4;
                obj3 = null;
                i4 = i3;
            }
        }
        if (i24 != -1) {
            unsafe.putInt(obj2, i24, i22);
        }
        for (int i43 = eVar.i; i43 < eVar.j; i43++) {
            eVar.l(eVar.h[i43], obj2, obj3);
        }
        if (i4 == 0) {
            if (i19 != i17) {
                throw aye.d();
            }
        } else if (i19 > i17 || i21 != i4) {
            throw aye.d();
        }
        return i19;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x0060. Please report as an issue. */
    public final void F(Object obj, byte[] bArr, int i, int i2, wx0 wx0Var) {
        int M;
        Unsafe unsafe;
        int i3;
        int i4;
        Object obj2;
        Unsafe unsafe2;
        int i5;
        int i6;
        Object obj3;
        int i7;
        int E;
        int i8;
        Unsafe unsafe3;
        int i9;
        e eVar = this;
        byte[] bArr2 = bArr;
        int i10 = i2;
        wx0 wx0Var2 = wx0Var;
        Unsafe unsafe4 = p;
        int i11 = -1;
        int i12 = 0;
        int i13 = i;
        int i14 = -1;
        int i15 = 0;
        while (i13 < i10) {
            int i16 = i13 + 1;
            int i17 = bArr2[i13];
            if (i17 < 0) {
                i16 = sk3.B(i17, bArr2, i16, wx0Var2);
                i17 = wx0Var2.a;
            }
            int i18 = i16;
            int i19 = i17;
            int i20 = i19 >>> 3;
            int i21 = i19 & 7;
            int i22 = eVar.d;
            int i23 = eVar.c;
            if (i20 > i14) {
                int i24 = i15 / 3;
                if (i20 >= i23 && i20 <= i22) {
                    M = eVar.M(i20, i24);
                }
                M = i11;
            } else {
                if (i20 >= i23 && i20 <= i22) {
                    M = eVar.M(i20, i12);
                }
                M = i11;
            }
            int i25 = M;
            if (i25 == i11) {
                unsafe = unsafe4;
                i3 = i18;
                i4 = i20;
                i25 = i12;
            } else {
                int i26 = eVar.a[i25 + 1];
                i4 = i20;
                int N = N(i26);
                long j = 1048575 & i26;
                if (N <= 17) {
                    switch (N) {
                        case 0:
                            obj2 = obj;
                            unsafe2 = unsafe4;
                            i5 = i19;
                            if (i21 == 1) {
                                cmt.d.m(obj2, j, Double.longBitsToDouble(sk3.u(i18, bArr2)));
                                i13 = i18 + 8;
                                unsafe4 = unsafe2;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            i19 = i5;
                            i6 = i18;
                            unsafe = unsafe2;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 1:
                            obj2 = obj;
                            unsafe2 = unsafe4;
                            i5 = i19;
                            if (i21 == 5) {
                                cmt.d.n(obj2, j, Float.intBitsToFloat(sk3.t(i18, bArr2)));
                                i13 = i18 + 4;
                                unsafe4 = unsafe2;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            i19 = i5;
                            i6 = i18;
                            unsafe = unsafe2;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 2:
                        case 3:
                            obj3 = obj;
                            i7 = i19;
                            if (i21 == 0) {
                                E = sk3.E(bArr2, i18, wx0Var2);
                                unsafe4.putLong(obj3, j, wx0Var2.b);
                                i13 = E;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            i19 = i7;
                            unsafe = unsafe4;
                            i6 = i18;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 4:
                        case 11:
                            obj3 = obj;
                            i7 = i19;
                            if (i21 == 0) {
                                int C = sk3.C(bArr2, i18, wx0Var2);
                                unsafe4.putInt(obj3, j, wx0Var2.a);
                                i13 = C;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            i19 = i7;
                            unsafe = unsafe4;
                            i6 = i18;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 5:
                        case 14:
                            i8 = i19;
                            unsafe3 = unsafe4;
                            if (i21 != 1) {
                                i19 = i8;
                                unsafe = unsafe3;
                                i6 = i18;
                                i9 = i4;
                                i3 = i6;
                                i4 = i9;
                                break;
                            } else {
                                unsafe4 = unsafe3;
                                unsafe4.putLong(obj, j, sk3.u(i18, bArr2));
                                i13 = i18 + 8;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                        case 6:
                        case 13:
                            i8 = i19;
                            unsafe3 = unsafe4;
                            if (i21 == 5) {
                                unsafe3.putInt(obj, j, sk3.t(i18, bArr2));
                                i13 = i18 + 4;
                                unsafe4 = unsafe3;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            i19 = i8;
                            unsafe = unsafe3;
                            i6 = i18;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 7:
                            i8 = i19;
                            unsafe3 = unsafe4;
                            if (i21 == 0) {
                                i13 = sk3.E(bArr2, i18, wx0Var2);
                                cmt.d.k(obj, j, wx0Var2.b != 0);
                                unsafe4 = unsafe3;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            i19 = i8;
                            unsafe = unsafe3;
                            i6 = i18;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 8:
                            i8 = i19;
                            unsafe3 = unsafe4;
                            if (i21 == 2) {
                                i13 = (i26 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0 ? sk3.y(bArr2, i18, wx0Var2) : sk3.z(bArr2, i18, wx0Var2);
                                unsafe3.putObject(obj, j, wx0Var2.c);
                                unsafe4 = unsafe3;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            i19 = i8;
                            unsafe = unsafe3;
                            i6 = i18;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 9:
                            i8 = i19;
                            unsafe3 = unsafe4;
                            if (i21 == 2) {
                                i13 = sk3.w(eVar.o(i25), bArr2, i18, i10, wx0Var2);
                                Object object = unsafe3.getObject(obj, j);
                                Object obj4 = wx0Var2.c;
                                if (object == null) {
                                    unsafe3.putObject(obj, j, obj4);
                                } else {
                                    unsafe3.putObject(obj, j, tse.c(object, obj4));
                                }
                                unsafe4 = unsafe3;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            i19 = i8;
                            unsafe = unsafe3;
                            i6 = i18;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 10:
                            i8 = i19;
                            unsafe3 = unsafe4;
                            if (i21 == 2) {
                                i13 = sk3.s(bArr2, i18, wx0Var2);
                                unsafe3.putObject(obj, j, wx0Var2.c);
                                unsafe4 = unsafe3;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            i19 = i8;
                            unsafe = unsafe3;
                            i6 = i18;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 12:
                            unsafe3 = unsafe4;
                            if (i21 == 0) {
                                i13 = sk3.C(bArr2, i18, wx0Var2);
                                unsafe3.putInt(obj, j, wx0Var2.a);
                                unsafe4 = unsafe3;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            unsafe = unsafe3;
                            i6 = i18;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 15:
                            unsafe3 = unsafe4;
                            if (i21 == 0) {
                                i13 = sk3.C(bArr2, i18, wx0Var2);
                                unsafe3.putInt(obj, j, kr4.a(wx0Var2.a));
                                unsafe4 = unsafe3;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                            unsafe = unsafe3;
                            i6 = i18;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                        case 16:
                            if (i21 == 0) {
                                E = sk3.E(bArr2, i18, wx0Var2);
                                unsafe4.putLong(obj, j, kr4.b(wx0Var2.b));
                                unsafe4 = unsafe4;
                                i13 = E;
                                i14 = i4;
                                i15 = i25;
                                break;
                            }
                        default:
                            unsafe = unsafe4;
                            i6 = i18;
                            i9 = i4;
                            i3 = i6;
                            i4 = i9;
                            break;
                    }
                    i11 = -1;
                    i12 = 0;
                } else if (N != 27) {
                    i19 = i19;
                    unsafe = unsafe4;
                    if (N <= 49) {
                        i9 = i4;
                        int G = eVar.G(obj, bArr, i18, i2, i19, i21, i25, i26, N, j, wx0Var);
                        i25 = i25;
                        if (G != i18) {
                            bArr2 = bArr;
                            i10 = i2;
                            wx0Var2 = wx0Var;
                            i13 = G;
                            i15 = i25;
                            i14 = i9;
                            unsafe4 = unsafe;
                            i11 = -1;
                            i12 = 0;
                        } else {
                            i3 = G;
                            i4 = i9;
                        }
                    } else {
                        i6 = i18;
                        i9 = i4;
                        if (N == 50) {
                            if (i21 == 2) {
                                eVar.C(j, obj, i25);
                                throw null;
                            }
                            i3 = i6;
                            i4 = i9;
                        } else {
                            int D = eVar.D(obj, bArr, i6, i2, i19, i9, i21, i26, N, j, i25, wx0Var);
                            i4 = i9;
                            if (D != i6) {
                                eVar = this;
                                i10 = i2;
                                wx0Var2 = wx0Var;
                                i13 = D;
                                i14 = i4;
                                i15 = i25;
                                unsafe4 = unsafe;
                                i11 = -1;
                                i12 = 0;
                                bArr2 = bArr;
                            } else {
                                i3 = D;
                            }
                        }
                    }
                } else if (i21 == 2) {
                    qse qseVar = (qse) unsafe4.getObject(obj, j);
                    if (!((t8) qseVar).a) {
                        int size = qseVar.size();
                        qseVar = qseVar.b(size == 0 ? 10 : size * 2);
                        unsafe4.putObject(obj, j, qseVar);
                    }
                    unsafe = unsafe4;
                    i13 = sk3.x(eVar.o(i25), i19, bArr2, i18, i10, qseVar, wx0Var2);
                    bArr2 = bArr;
                    i10 = i2;
                    wx0Var2 = wx0Var;
                    i14 = i4;
                    i15 = i25;
                    unsafe4 = unsafe;
                    i11 = -1;
                    i12 = 0;
                } else {
                    unsafe = unsafe4;
                    i19 = i19;
                    i6 = i18;
                    i9 = i4;
                    i3 = i6;
                    i4 = i9;
                }
            }
            c cVar = (c) obj;
            kkt kktVar = cVar.unknownFields;
            if (kktVar == kkt.f) {
                kktVar = kkt.b();
                cVar.unknownFields = kktVar;
            }
            i13 = sk3.A(i19, bArr, i3, i2, kktVar, wx0Var);
            eVar = this;
            bArr2 = bArr;
            wx0Var2 = wx0Var;
            i10 = i2;
            i14 = i4;
            i15 = i25;
            unsafe4 = unsafe;
            i11 = -1;
            i12 = 0;
        }
        if (i13 != i10) {
            throw aye.d();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int G(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, wx0 wx0Var) {
        int D;
        Unsafe unsafe = p;
        qse qseVar = (qse) unsafe.getObject(obj, j2);
        if (!((t8) qseVar).a) {
            int size = qseVar.size();
            qseVar = qseVar.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, qseVar);
        }
        qse qseVar2 = qseVar;
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    n8a n8aVar = (n8a) qseVar2;
                    int C = sk3.C(bArr, i, wx0Var);
                    int i7 = wx0Var.a + C;
                    while (C < i7) {
                        n8aVar.g(Double.longBitsToDouble(sk3.u(C, bArr)));
                        C += 8;
                    }
                    if (C == i7) {
                        return C;
                    }
                    throw aye.e();
                }
                if (i4 == 1) {
                    n8a n8aVar2 = (n8a) qseVar2;
                    n8aVar2.g(Double.longBitsToDouble(sk3.u(i, bArr)));
                    int i8 = i + 8;
                    while (i8 < i2) {
                        int C2 = sk3.C(bArr, i8, wx0Var);
                        if (i3 != wx0Var.a) {
                            return i8;
                        }
                        n8aVar2.g(Double.longBitsToDouble(sk3.u(C2, bArr)));
                        i8 = C2 + 8;
                    }
                    return i8;
                }
                return i;
            case 19:
            case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                if (i4 == 2) {
                    sic sicVar = (sic) qseVar2;
                    int C3 = sk3.C(bArr, i, wx0Var);
                    int i9 = wx0Var.a + C3;
                    while (C3 < i9) {
                        sicVar.g(Float.intBitsToFloat(sk3.t(C3, bArr)));
                        C3 += 4;
                    }
                    if (C3 == i9) {
                        return C3;
                    }
                    throw aye.e();
                }
                if (i4 == 5) {
                    sic sicVar2 = (sic) qseVar2;
                    sicVar2.g(Float.intBitsToFloat(sk3.t(i, bArr)));
                    int i10 = i + 4;
                    while (i10 < i2) {
                        int C4 = sk3.C(bArr, i10, wx0Var);
                        if (i3 != wx0Var.a) {
                            return i10;
                        }
                        sicVar2.g(Float.intBitsToFloat(sk3.t(C4, bArr)));
                        i10 = C4 + 4;
                    }
                    return i10;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    pug pugVar = (pug) qseVar2;
                    int C5 = sk3.C(bArr, i, wx0Var);
                    int i11 = wx0Var.a + C5;
                    while (C5 < i11) {
                        C5 = sk3.E(bArr, C5, wx0Var);
                        pugVar.g(wx0Var.b);
                    }
                    if (C5 == i11) {
                        return C5;
                    }
                    throw aye.e();
                }
                if (i4 == 0) {
                    pug pugVar2 = (pug) qseVar2;
                    int E = sk3.E(bArr, i, wx0Var);
                    pugVar2.g(wx0Var.b);
                    while (E < i2) {
                        int C6 = sk3.C(bArr, E, wx0Var);
                        if (i3 != wx0Var.a) {
                            return E;
                        }
                        E = sk3.E(bArr, C6, wx0Var);
                        pugVar2.g(wx0Var.b);
                    }
                    return E;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                if (i4 != 2) {
                    if (i4 == 0) {
                        return sk3.D(i3, bArr, i, i2, qseVar2, wx0Var);
                    }
                    return i;
                }
                hpe hpeVar = (hpe) qseVar2;
                int C7 = sk3.C(bArr, i, wx0Var);
                int i12 = wx0Var.a + C7;
                while (C7 < i12) {
                    C7 = sk3.C(bArr, C7, wx0Var);
                    hpeVar.g(wx0Var.a);
                }
                if (C7 == i12) {
                    return C7;
                }
                throw aye.e();
            case 23:
            case 32:
            case 40:
            case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                if (i4 == 2) {
                    pug pugVar3 = (pug) qseVar2;
                    int C8 = sk3.C(bArr, i, wx0Var);
                    int i13 = wx0Var.a + C8;
                    while (C8 < i13) {
                        pugVar3.g(sk3.u(C8, bArr));
                        C8 += 8;
                    }
                    if (C8 == i13) {
                        return C8;
                    }
                    throw aye.e();
                }
                if (i4 == 1) {
                    pug pugVar4 = (pug) qseVar2;
                    pugVar4.g(sk3.u(i, bArr));
                    int i14 = i + 8;
                    while (i14 < i2) {
                        int C9 = sk3.C(bArr, i14, wx0Var);
                        if (i3 != wx0Var.a) {
                            return i14;
                        }
                        pugVar4.g(sk3.u(C9, bArr));
                        i14 = C9 + 8;
                    }
                    return i14;
                }
                return i;
            case 24:
            case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
            case 41:
            case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                if (i4 == 2) {
                    hpe hpeVar2 = (hpe) qseVar2;
                    int C10 = sk3.C(bArr, i, wx0Var);
                    int i15 = wx0Var.a + C10;
                    while (C10 < i15) {
                        hpeVar2.g(sk3.t(C10, bArr));
                        C10 += 4;
                    }
                    if (C10 == i15) {
                        return C10;
                    }
                    throw aye.e();
                }
                if (i4 == 5) {
                    hpe hpeVar3 = (hpe) qseVar2;
                    hpeVar3.g(sk3.t(i, bArr));
                    int i16 = i + 4;
                    while (i16 < i2) {
                        int C11 = sk3.C(bArr, i16, wx0Var);
                        if (i3 != wx0Var.a) {
                            return i16;
                        }
                        hpeVar3.g(sk3.t(C11, bArr));
                        i16 = C11 + 4;
                    }
                    return i16;
                }
                return i;
            case 25:
            case 42:
                if (i4 == 2) {
                    ec3 ec3Var = (ec3) qseVar2;
                    int C12 = sk3.C(bArr, i, wx0Var);
                    int i17 = wx0Var.a + C12;
                    while (C12 < i17) {
                        C12 = sk3.E(bArr, C12, wx0Var);
                        ec3Var.g(wx0Var.b != 0);
                    }
                    if (C12 == i17) {
                        return C12;
                    }
                    throw aye.e();
                }
                if (i4 == 0) {
                    ec3 ec3Var2 = (ec3) qseVar2;
                    int E2 = sk3.E(bArr, i, wx0Var);
                    ec3Var2.g(wx0Var.b != 0);
                    while (E2 < i2) {
                        int C13 = sk3.C(bArr, E2, wx0Var);
                        if (i3 != wx0Var.a) {
                            return E2;
                        }
                        E2 = sk3.E(bArr, C13, wx0Var);
                        ec3Var2.g(wx0Var.b != 0);
                    }
                    return E2;
                }
                return i;
            case 26:
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int C14 = sk3.C(bArr, i, wx0Var);
                        int i18 = wx0Var.a;
                        if (i18 < 0) {
                            throw aye.c();
                        }
                        if (i18 == 0) {
                            qseVar2.add("");
                        } else {
                            qseVar2.add(new String(bArr, C14, i18, tse.a));
                            C14 += i18;
                        }
                        while (C14 < i2) {
                            int C15 = sk3.C(bArr, C14, wx0Var);
                            if (i3 != wx0Var.a) {
                                return C14;
                            }
                            C14 = sk3.C(bArr, C15, wx0Var);
                            int i19 = wx0Var.a;
                            if (i19 < 0) {
                                throw aye.c();
                            }
                            if (i19 == 0) {
                                qseVar2.add("");
                            } else {
                                qseVar2.add(new String(bArr, C14, i19, tse.a));
                                C14 += i19;
                            }
                        }
                        return C14;
                    }
                    int C16 = sk3.C(bArr, i, wx0Var);
                    int i20 = wx0Var.a;
                    if (i20 < 0) {
                        throw aye.c();
                    }
                    if (i20 == 0) {
                        qseVar2.add("");
                    } else {
                        int i21 = C16 + i20;
                        if (!mut.a.W(bArr, C16, i21)) {
                            throw aye.a();
                        }
                        qseVar2.add(new String(bArr, C16, i20, tse.a));
                        C16 = i21;
                    }
                    while (C16 < i2) {
                        int C17 = sk3.C(bArr, C16, wx0Var);
                        if (i3 != wx0Var.a) {
                            return C16;
                        }
                        C16 = sk3.C(bArr, C17, wx0Var);
                        int i22 = wx0Var.a;
                        if (i22 < 0) {
                            throw aye.c();
                        }
                        if (i22 == 0) {
                            qseVar2.add("");
                        } else {
                            int i23 = C16 + i22;
                            if (!mut.a.W(bArr, C16, i23)) {
                                throw aye.a();
                            }
                            qseVar2.add(new String(bArr, C16, i22, tse.a));
                            C16 = i23;
                        }
                    }
                    return C16;
                }
                return i;
            case 27:
                if (i4 == 2) {
                    return sk3.x(o(i5), i3, bArr, i, i2, qseVar2, wx0Var);
                }
                return i;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (i4 == 2) {
                    int C18 = sk3.C(bArr, i, wx0Var);
                    int i24 = wx0Var.a;
                    if (i24 < 0) {
                        throw aye.c();
                    }
                    if (i24 > bArr.length - C18) {
                        throw aye.e();
                    }
                    if (i24 == 0) {
                        qseVar2.add(mn3.b);
                    } else {
                        qseVar2.add(mn3.n(bArr, C18, i24));
                        C18 += i24;
                    }
                    while (C18 < i2) {
                        int C19 = sk3.C(bArr, C18, wx0Var);
                        if (i3 != wx0Var.a) {
                            return C18;
                        }
                        C18 = sk3.C(bArr, C19, wx0Var);
                        int i25 = wx0Var.a;
                        if (i25 < 0) {
                            throw aye.c();
                        }
                        if (i25 > bArr.length - C18) {
                            throw aye.e();
                        }
                        if (i25 == 0) {
                            qseVar2.add(mn3.b);
                        } else {
                            qseVar2.add(mn3.n(bArr, C18, i25));
                            C18 += i25;
                        }
                    }
                    return C18;
                }
                return i;
            case 30:
            case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                if (i4 != 2) {
                    if (i4 == 0) {
                        D = sk3.D(i3, bArr, i, i2, qseVar2, wx0Var);
                    }
                    return i;
                }
                hpe hpeVar4 = (hpe) qseVar2;
                D = sk3.C(bArr, i, wx0Var);
                int i26 = wx0Var.a + D;
                while (D < i26) {
                    D = sk3.C(bArr, D, wx0Var);
                    hpeVar4.g(wx0Var.a);
                }
                if (D != i26) {
                    throw aye.e();
                }
                c cVar = (c) obj;
                kkt kktVar = cVar.unknownFields;
                if (kktVar == kkt.f) {
                    kktVar = null;
                }
                m(i5);
                Class cls = g.a;
                if (kktVar != null) {
                    cVar.unknownFields = kktVar;
                }
                return D;
            case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
            case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                if (i4 == 2) {
                    hpe hpeVar5 = (hpe) qseVar2;
                    int C20 = sk3.C(bArr, i, wx0Var);
                    int i27 = wx0Var.a + C20;
                    while (C20 < i27) {
                        C20 = sk3.C(bArr, C20, wx0Var);
                        hpeVar5.g(kr4.a(wx0Var.a));
                    }
                    if (C20 == i27) {
                        return C20;
                    }
                    throw aye.e();
                }
                if (i4 == 0) {
                    hpe hpeVar6 = (hpe) qseVar2;
                    int C21 = sk3.C(bArr, i, wx0Var);
                    hpeVar6.g(kr4.a(wx0Var.a));
                    while (C21 < i2) {
                        int C22 = sk3.C(bArr, C21, wx0Var);
                        if (i3 != wx0Var.a) {
                            return C21;
                        }
                        C21 = sk3.C(bArr, C22, wx0Var);
                        hpeVar6.g(kr4.a(wx0Var.a));
                    }
                    return C21;
                }
                return i;
            case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
            case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                if (i4 == 2) {
                    pug pugVar5 = (pug) qseVar2;
                    int C23 = sk3.C(bArr, i, wx0Var);
                    int i28 = wx0Var.a + C23;
                    while (C23 < i28) {
                        C23 = sk3.E(bArr, C23, wx0Var);
                        pugVar5.g(kr4.b(wx0Var.b));
                    }
                    if (C23 == i28) {
                        return C23;
                    }
                    throw aye.e();
                }
                if (i4 == 0) {
                    pug pugVar6 = (pug) qseVar2;
                    int E3 = sk3.E(bArr, i, wx0Var);
                    pugVar6.g(kr4.b(wx0Var.b));
                    while (E3 < i2) {
                        int C24 = sk3.C(bArr, E3, wx0Var);
                        if (i3 != wx0Var.a) {
                            return E3;
                        }
                        E3 = sk3.E(bArr, C24, wx0Var);
                        pugVar6.g(kr4.b(wx0Var.b));
                    }
                    return E3;
                }
                return i;
            case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                if (i4 == 3) {
                    vto o2 = o(i5);
                    int i29 = (i3 & (-8)) | 4;
                    int v = sk3.v(o2, bArr, i, i2, i29, wx0Var);
                    vto vtoVar = o2;
                    qseVar2.add(wx0Var.c);
                    while (v < i2) {
                        int C25 = sk3.C(bArr, v, wx0Var);
                        if (i3 != wx0Var.a) {
                            return v;
                        }
                        vto vtoVar2 = vtoVar;
                        v = sk3.v(vtoVar2, bArr, C25, i2, i29, wx0Var);
                        qseVar2.add(wx0Var.c);
                        vtoVar = vtoVar2;
                    }
                    return v;
                }
                return i;
            default:
                return i;
        }
    }

    public final void H(Object obj, int i, n8n n8nVar, vto vtoVar, y0c y0cVar) {
        int l;
        List c = this.l.c(i & 1048575, obj);
        kr4 kr4Var = (kr4) n8nVar.e;
        int i2 = n8nVar.b;
        if ((i2 & 7) != 2) {
            throw aye.b();
        }
        do {
            c.add(n8nVar.Z(vtoVar, y0cVar));
            if (kr4Var.d() || n8nVar.d != 0) {
                return;
            } else {
                l = kr4Var.l();
            }
        } while (l == i2);
        n8nVar.d = l;
    }

    public final void I(int i, n8n n8nVar, Object obj) {
        if ((536870912 & i) != 0) {
            cmt.o(i & 1048575, obj, n8nVar.r0());
        } else if (this.f) {
            cmt.o(i & 1048575, obj, n8nVar.n0());
        } else {
            cmt.o(i & 1048575, obj, n8nVar.u());
        }
    }

    public final void K(int i, Object obj) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        cmt.m(j, obj, cmt.d.g(j, obj) | (1 << (i2 >>> 20)));
    }

    public final void L(int i, int i2, Object obj) {
        cmt.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int M(int i, int i2) {
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

    public final int O(int i) {
        return this.a[i + 1];
    }

    public final void P(Object obj, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = p;
        int i5 = -1;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 = i4 + 3) {
            int O = O(i7);
            int i8 = iArr[i7];
            int N = N(O);
            if (this.g || N > 17) {
                i = i7;
                i2 = 1048575;
                i3 = 0;
            } else {
                int i9 = iArr[i7 + 2];
                i2 = 1048575;
                int i10 = i9 & 1048575;
                i = i7;
                if (i10 != i5) {
                    i6 = unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i3 = 1 << (i9 >>> 20);
            }
            long j = O & i2;
            switch (N) {
                case 0:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        double e = cmt.d.e(j, obj);
                        a aVar = bVar.a;
                        aVar.getClass();
                        aVar.o(i8, Double.doubleToRawLongBits(e));
                        continue;
                    }
                case 1:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        float f = cmt.d.f(j, obj);
                        a aVar2 = bVar.a;
                        aVar2.getClass();
                        aVar2.m(i8, Float.floatToRawIntBits(f));
                    } else {
                        continue;
                    }
                case 2:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bVar.a.t(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 3:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bVar.a.t(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 4:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        a aVar3 = bVar.a;
                        aVar3.r(i8, 0);
                        aVar3.q(i11);
                    }
                    break;
                case 5:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bVar.a.o(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 6:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bVar.a.m(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 7:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        boolean c = cmt.d.c(j, obj);
                        a aVar4 = bVar.a;
                        aVar4.r(i8, 0);
                        aVar4.k(c ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        Q(i8, unsafe.getObject(obj, j), bVar);
                        break;
                    }
                    break;
                case 9:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bVar.c(i8, unsafe.getObject(obj, j), o(i4));
                        break;
                    }
                    break;
                case 10:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bVar.a(i8, (mn3) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 11:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        a aVar5 = bVar.a;
                        aVar5.r(i8, 0);
                        aVar5.s(i12);
                        break;
                    }
                case 12:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        a aVar6 = bVar.a;
                        aVar6.r(i8, 0);
                        aVar6.q(i13);
                    }
                    break;
                case 13:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bVar.a.m(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 14:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bVar.a.o(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 15:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        a aVar7 = bVar.a;
                        aVar7.r(i8, 0);
                        aVar7.s((i14 >> 31) ^ (i14 << 1));
                        break;
                    }
                    break;
                case 16:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        bVar.a.t(i8, (j2 >> 63) ^ (j2 << 1));
                        break;
                    }
                    break;
                case 17:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bVar.b(i8, unsafe.getObject(obj, j), o(i4));
                        break;
                    }
                    break;
                case 18:
                    i4 = i;
                    g.B(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 19:
                    i4 = i;
                    g.F(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 20:
                    i4 = i;
                    g.I(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 21:
                    i4 = i;
                    g.Q(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 22:
                    i4 = i;
                    g.H(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 23:
                    i4 = i;
                    g.E(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 24:
                    i4 = i;
                    g.D(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 25:
                    i4 = i;
                    g.z(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 26:
                    i4 = i;
                    g.O(iArr[i4], (List) unsafe.getObject(obj, j), bVar);
                    break;
                case 27:
                    i4 = i;
                    g.J(iArr[i4], (List) unsafe.getObject(obj, j), bVar, o(i4));
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    i4 = i;
                    g.A(iArr[i4], (List) unsafe.getObject(obj, j), bVar);
                    break;
                case 29:
                    i4 = i;
                    g.P(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 30:
                    i4 = i;
                    g.C(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    i4 = i;
                    g.K(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 32:
                    i4 = i;
                    g.L(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    i4 = i;
                    g.M(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    i4 = i;
                    g.N(iArr[i4], (List) unsafe.getObject(obj, j), bVar, false);
                    continue;
                case 35:
                    i4 = i;
                    g.B(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    i4 = i;
                    g.F(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case 37:
                    i4 = i;
                    g.I(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case 38:
                    i4 = i;
                    g.Q(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case 39:
                    i4 = i;
                    g.H(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case 40:
                    i4 = i;
                    g.E(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case 41:
                    i4 = i;
                    g.D(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case 42:
                    i4 = i;
                    g.z(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    i4 = i;
                    g.P(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    i4 = i;
                    g.C(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    i4 = i;
                    g.K(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    i4 = i;
                    g.L(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    i4 = i;
                    g.M(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    i4 = i;
                    g.N(iArr[i4], (List) unsafe.getObject(obj, j), bVar, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    i4 = i;
                    g.G(iArr[i4], (List) unsafe.getObject(obj, j), bVar, o(i4));
                    break;
                case 50:
                    i4 = i;
                    if (unsafe.getObject(obj, j) != null) {
                        Object n = n(i4);
                        this.n.getClass();
                        eta.q(n);
                        throw null;
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        double doubleValue = ((Double) cmt.d.i(j, obj)).doubleValue();
                        a aVar8 = bVar.a;
                        aVar8.getClass();
                        aVar8.o(i8, Double.doubleToRawLongBits(doubleValue));
                        break;
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        float floatValue = ((Float) cmt.d.i(j, obj)).floatValue();
                        a aVar9 = bVar.a;
                        aVar9.getClass();
                        aVar9.m(i8, Float.floatToRawIntBits(floatValue));
                        break;
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        bVar.a.t(i8, B(j, obj));
                        break;
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        bVar.a.t(i8, B(j, obj));
                        break;
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        int A = A(j, obj);
                        a aVar10 = bVar.a;
                        aVar10.r(i8, 0);
                        aVar10.q(A);
                        break;
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        bVar.a.o(i8, B(j, obj));
                        break;
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        bVar.a.m(i8, A(j, obj));
                        break;
                    }
                    break;
                case 58:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        boolean booleanValue = ((Boolean) cmt.d.i(j, obj)).booleanValue();
                        a aVar11 = bVar.a;
                        aVar11.r(i8, 0);
                        aVar11.k(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 59:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        Q(i8, unsafe.getObject(obj, j), bVar);
                        break;
                    }
                    break;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        bVar.c(i8, unsafe.getObject(obj, j), o(i4));
                        break;
                    }
                    break;
                case 61:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        bVar.a(i8, (mn3) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        int A2 = A(j, obj);
                        a aVar12 = bVar.a;
                        aVar12.r(i8, 0);
                        aVar12.s(A2);
                        break;
                    }
                case 63:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        int A3 = A(j, obj);
                        a aVar13 = bVar.a;
                        aVar13.r(i8, 0);
                        aVar13.q(A3);
                    }
                    break;
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        bVar.a.m(i8, A(j, obj));
                        break;
                    }
                    break;
                case 65:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        bVar.a.o(i8, B(j, obj));
                        break;
                    }
                    break;
                case 66:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        int A4 = A(j, obj);
                        a aVar14 = bVar.a;
                        aVar14.r(i8, 0);
                        aVar14.s((A4 >> 31) ^ (A4 << 1));
                        break;
                    }
                    break;
                case 67:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        long B = B(j, obj);
                        bVar.a.t(i8, (B >> 63) ^ (B << 1));
                        break;
                    }
                    break;
                case 68:
                    i4 = i;
                    if (s(i8, i4, obj)) {
                        bVar.b(i8, unsafe.getObject(obj, j), o(i4));
                        break;
                    }
                    break;
                default:
                    i4 = i;
                    break;
            }
        }
        this.m.getClass();
        ((c) obj).unknownFields.d(bVar);
    }

    @Override // defpackage.vto
    public final void a(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long O = O(iArr[i2]) & 1048575;
            Object i3 = cmt.d.i(O, obj);
            if (i3 != null) {
                this.n.getClass();
                ((q9h) i3).a = false;
                cmt.o(O, obj, i3);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(iArr[i], obj);
            i++;
        }
        this.m.getClass();
        ((c) obj).unknownFields.e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f2, code lost:
    
        return false;
     */
    @Override // defpackage.vto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            boolean z = true;
            if (i3 >= this.i) {
                return true;
            }
            int i5 = this.h[i3];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int O = O(i5);
            boolean z2 = this.g;
            if (z2) {
                i = 0;
            } else {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = p.getInt(obj, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & O) != 0) {
                if (!(z2 ? r(i5, obj) : (i4 & i) != 0)) {
                    break;
                }
            }
            int N = N(O);
            if (N == 9 || N == 17) {
                if (z2) {
                    z = r(i5, obj);
                } else if ((i & i4) == 0) {
                    z = false;
                }
                if (z) {
                    if (!o(i5).b(cmt.d.i(O & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i3++;
            } else {
                if (N != 27) {
                    if (N == 60 || N == 68) {
                        if (s(i6, i5, obj)) {
                            if (!o(i5).b(cmt.d.i(O & 1048575, obj))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else if (N != 49) {
                        if (N != 50) {
                            continue;
                        } else {
                            Object i9 = cmt.d.i(O & 1048575, obj);
                            this.n.getClass();
                            if (!((q9h) i9).isEmpty()) {
                                eta.q(n(i5));
                                throw null;
                            }
                        }
                    }
                    i3++;
                }
                List list = (List) cmt.d.i(O & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    vto o2 = o(i5);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!o2.b(list.get(i10))) {
                            break loop0;
                        }
                    }
                }
                i3++;
            }
        }
    }

    @Override // defpackage.vto
    public final Object c() {
        this.k.getClass();
        return ((c) this.e).f(4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x006d, code lost:
    
        if (r12 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        ((com.google.crypto.tink.shaded.protobuf.c) r2).unknownFields = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06b3 A[Catch: all -> 0x040f, TryCatch #6 {all -> 0x040f, blocks: (B:37:0x06ae, B:39:0x06b3, B:41:0x06ba, B:43:0x06c1, B:138:0x03e6, B:141:0x03ef, B:143:0x03fb, B:144:0x0412, B:145:0x0426, B:146:0x043a, B:147:0x044e, B:148:0x0462, B:149:0x0476, B:150:0x048a, B:151:0x049e, B:153:0x04ab, B:154:0x04ca, B:155:0x04de, B:156:0x04f5, B:157:0x050c, B:158:0x0523, B:159:0x053a, B:160:0x0554, B:161:0x056b, B:162:0x0582, B:164:0x058f, B:165:0x05ae, B:166:0x05c2, B:167:0x05d1, B:168:0x05ea, B:169:0x0601, B:170:0x0618, B:171:0x062f, B:172:0x0645, B:173:0x065b, B:174:0x0673, B:182:0x068b), top: B:36:0x06ae }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x06c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x06e9 A[LOOP:3: B:59:0x06e7->B:60:0x06e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x06f3  */
    @Override // defpackage.vto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, n8n n8nVar, y0c y0cVar) {
        e eVar;
        int i;
        int i2;
        int[] iArr;
        int i3;
        y0c y0cVar2;
        n8n n8nVar2;
        int N;
        u8g u8gVar;
        e eVar2 = this;
        Object obj2 = obj;
        n8n n8nVar3 = n8nVar;
        y0c y0cVar3 = y0cVar;
        y0cVar3.getClass();
        okt oktVar = eVar2.m;
        int[] iArr2 = eVar2.h;
        int i4 = eVar2.j;
        int i5 = eVar2.i;
        kkt kktVar = null;
        while (true) {
            try {
                int h = n8nVar3.h();
                int M = (h < eVar2.c || h > eVar2.d) ? -1 : eVar2.M(h, 0);
                kkt kktVar2 = kkt.f;
                if (M >= 0) {
                    int O = eVar2.O(M);
                    try {
                        N = N(O);
                        u8gVar = eVar2.l;
                    } catch (xxe unused) {
                        i3 = i4;
                        i2 = i5;
                    } catch (Throwable th) {
                        th = th;
                        eVar = eVar2;
                        i3 = i4;
                        i2 = i5;
                        iArr = iArr2;
                    }
                    switch (N) {
                        case 0:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            try {
                            } catch (xxe unused2) {
                                obj2 = obj;
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj;
                            }
                            try {
                                cmt.d.m(obj, z(O), n8nVar2.A());
                                obj2 = obj;
                                eVar.K(M, obj2);
                            } catch (xxe unused3) {
                                obj2 = obj;
                                try {
                                    oktVar.getClass();
                                    if (kktVar == null) {
                                    }
                                    if (!okt.a(kktVar, n8nVar2)) {
                                    }
                                    y0c y0cVar4 = y0cVar2;
                                    i4 = i3;
                                    eVar2 = eVar;
                                    y0cVar3 = y0cVar4;
                                    n8nVar3 = n8nVar2;
                                    iArr2 = iArr;
                                    i5 = i2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    i = i3;
                                    while (i2 < i) {
                                        eVar.l(iArr[i2], obj2, kktVar);
                                        i2++;
                                    }
                                    if (kktVar != null) {
                                        oktVar.getClass();
                                        ((c) obj2).unknownFields = kktVar;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj2 = obj;
                                i = i3;
                                while (i2 < i) {
                                }
                                if (kktVar != null) {
                                }
                                throw th;
                            }
                            y0c y0cVar42 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                            break;
                        case 1:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.d.n(obj2, z(O), n8nVar2.N());
                            eVar.K(M, obj2);
                            y0c y0cVar422 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 2:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.n(obj2, z(O), n8nVar2.W());
                            eVar.K(M, obj2);
                            y0c y0cVar4222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 3:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.n(obj2, z(O), n8nVar2.v0());
                            eVar.K(M, obj2);
                            y0c y0cVar42222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 4:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.m(z(O), obj2, n8nVar2.T());
                            eVar.K(M, obj2);
                            y0c y0cVar422222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 5:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.n(obj2, z(O), n8nVar2.K());
                            eVar.K(M, obj2);
                            y0c y0cVar4222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 6:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.m(z(O), obj2, n8nVar2.H());
                            eVar.K(M, obj2);
                            y0c y0cVar42222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 7:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.d.k(obj2, z(O), n8nVar2.r());
                            eVar.K(M, obj2);
                            y0c y0cVar422222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 8:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            eVar.I(O, n8nVar2, obj2);
                            eVar.K(M, obj2);
                            y0c y0cVar4222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 9:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            if (eVar.r(M, obj2)) {
                                cmt.o(z(O), obj2, tse.c(cmt.d.i(z(O), obj2), n8nVar2.a0(eVar.o(M), y0cVar2)));
                            } else {
                                cmt.o(z(O), obj2, n8nVar2.a0(eVar.o(M), y0cVar2));
                                eVar.K(M, obj2);
                            }
                            y0c y0cVar42222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 10:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.o(z(O), obj2, n8nVar2.u());
                            eVar.K(M, obj2);
                            y0c y0cVar422222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 11:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.m(z(O), obj2, n8nVar2.s0());
                            eVar.K(M, obj2);
                            y0c y0cVar4222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 12:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            int D = n8nVar2.D();
                            eVar.m(M);
                            cmt.m(z(O), obj2, D);
                            eVar.K(M, obj2);
                            y0c y0cVar42222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 13:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.m(z(O), obj2, n8nVar2.b0());
                            eVar.K(M, obj2);
                            y0c y0cVar422222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 14:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.n(obj2, z(O), n8nVar2.e0());
                            eVar.K(M, obj2);
                            y0c y0cVar4222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 15:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.m(z(O), obj2, n8nVar2.h0());
                            eVar.K(M, obj2);
                            y0c y0cVar42222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 16:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            cmt.n(obj2, z(O), n8nVar2.k0());
                            eVar.K(M, obj2);
                            y0c y0cVar422222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 17:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            if (eVar.r(M, obj2)) {
                                cmt.o(z(O), obj2, tse.c(cmt.d.i(z(O), obj2), n8nVar2.R(eVar.o(M), y0cVar2)));
                            } else {
                                cmt.o(z(O), obj2, n8nVar2.R(eVar.o(M), y0cVar2));
                                eVar.K(M, obj2);
                            }
                            y0c y0cVar4222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 18:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            n8nVar2.C(u8gVar.c(z(O), obj2));
                            y0c y0cVar42222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 19:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            n8nVar2.P(u8gVar.c(z(O), obj2));
                            y0c y0cVar422222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 20:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            n8nVar2.Y(u8gVar.c(z(O), obj2));
                            y0c y0cVar4222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 21:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            n8nVar2.x0(u8gVar.c(z(O), obj2));
                            y0c y0cVar42222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 22:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            n8nVar2.V(u8gVar.c(z(O), obj2));
                            y0c y0cVar422222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 23:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            n8nVar2.M(u8gVar.c(z(O), obj2));
                            y0c y0cVar4222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 24:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            n8nVar2.J(u8gVar.c(z(O), obj2));
                            y0c y0cVar42222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 25:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            n8nVar2.t(u8gVar.c(z(O), obj2));
                            y0c y0cVar422222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 26:
                            i3 = i4;
                            i2 = i5;
                            y0cVar2 = y0cVar3;
                            iArr = iArr2;
                            eVar = eVar2;
                            n8nVar2 = n8nVar3;
                            if ((536870912 & O) != 0) {
                                try {
                                    n8nVar2.q0(u8gVar.c(O & 1048575, obj2), true);
                                } catch (xxe unused4) {
                                    oktVar.getClass();
                                    if (kktVar == null) {
                                    }
                                    if (!okt.a(kktVar, n8nVar2)) {
                                    }
                                    y0c y0cVar4222222222222222222222222222 = y0cVar2;
                                    i4 = i3;
                                    eVar2 = eVar;
                                    y0cVar3 = y0cVar4222222222222222222222222222;
                                    n8nVar3 = n8nVar2;
                                    iArr2 = iArr;
                                    i5 = i2;
                                }
                            } else {
                                n8nVar2.q0(u8gVar.c(O & 1048575, obj2), false);
                            }
                            y0c y0cVar42222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                            break;
                        case 27:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            eVar2.H(obj2, O, n8nVar3, eVar2.o(M), y0cVar3);
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.z(u8gVar.c(z(O), obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 29:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.u0(u8gVar.c(z(O), obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 30:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            List c = u8gVar.c(z(O), obj2);
                            n8nVar3.F(c);
                            eVar2.m(M);
                            g.v(h, c, kktVar, oktVar);
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.d0(u8gVar.c(z(O), obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 32:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.g0(u8gVar.c(z(O), obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.j0(u8gVar.c(z(O), obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.m0(u8gVar.c(z(O), obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 35:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.C(u8gVar.c(z(O), obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.P(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 37:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.Y(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 38:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.x0(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 39:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.V(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 40:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.M(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 41:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.J(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 42:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.t(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.u0(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.F(u8gVar.c(O & 1048575, obj2));
                            eVar2.m(M);
                            Class cls = g.a;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.d0(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.g0(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.j0(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                            i3 = i4;
                            i2 = i5;
                            iArr = iArr2;
                            n8nVar3.m0(u8gVar.c(O & 1048575, obj2));
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                            i2 = i5;
                            iArr = iArr2;
                            i3 = i4;
                            try {
                                n8nVar3.S(u8gVar.c(O & 1048575, obj2), eVar2.o(M), y0cVar3);
                                n8nVar2 = n8nVar3;
                                y0cVar2 = y0cVar3;
                                eVar = eVar2;
                            } catch (xxe unused5) {
                                n8nVar2 = n8nVar3;
                                y0cVar2 = y0cVar3;
                                eVar = eVar2;
                                oktVar.getClass();
                                if (kktVar == null) {
                                }
                                if (!okt.a(kktVar, n8nVar2)) {
                                }
                                y0c y0cVar4222222222222222222222222222222222222222222222222222 = y0cVar2;
                                i4 = i3;
                                eVar2 = eVar;
                                y0cVar3 = y0cVar4222222222222222222222222222222222222222222222222222;
                                n8nVar3 = n8nVar2;
                                iArr2 = iArr;
                                i5 = i2;
                            } catch (Throwable th5) {
                                th = th5;
                                eVar = eVar2;
                                i = i3;
                                while (i2 < i) {
                                }
                                if (kktVar != null) {
                                }
                                throw th;
                            }
                            y0c y0cVar42222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                            break;
                        case 50:
                            i2 = i5;
                            eVar2.u(M, obj2, eVar2.n(M));
                            throw null;
                            break;
                        case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Double.valueOf(n8nVar3.A()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Float.valueOf(n8nVar3.N()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Long.valueOf(n8nVar3.W()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Long.valueOf(n8nVar3.v0()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Integer.valueOf(n8nVar3.T()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Long.valueOf(n8nVar3.K()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Integer.valueOf(n8nVar3.H()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 58:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Boolean.valueOf(n8nVar3.r()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 59:
                            i2 = i5;
                            eVar2.I(O, n8nVar3, obj2);
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                            i2 = i5;
                            if (eVar2.s(h, M, obj2)) {
                                long j = O & 1048575;
                                cmt.o(j, obj2, tse.c(cmt.d.i(j, obj2), n8nVar3.a0(eVar2.o(M), y0cVar3)));
                            } else {
                                cmt.o(O & 1048575, obj2, n8nVar3.a0(eVar2.o(M), y0cVar3));
                                eVar2.K(M, obj2);
                            }
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 61:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, n8nVar3.u());
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 62:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Integer.valueOf(n8nVar3.s0()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 63:
                            i2 = i5;
                            int D2 = n8nVar3.D();
                            eVar2.m(M);
                            cmt.o(O & 1048575, obj2, Integer.valueOf(D2));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case SQLiteDatabase.OPEN_URI /* 64 */:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Integer.valueOf(n8nVar3.b0()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 65:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Long.valueOf(n8nVar3.e0()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar42222222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar42222222222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 66:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Integer.valueOf(n8nVar3.h0()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar422222222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 67:
                            i2 = i5;
                            cmt.o(O & 1048575, obj2, Long.valueOf(n8nVar3.k0()));
                            eVar2.L(h, M, obj2);
                            iArr = iArr2;
                            i3 = i4;
                            n8nVar2 = n8nVar3;
                            y0cVar2 = y0cVar3;
                            eVar = eVar2;
                            y0c y0cVar4222222222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar4222222222222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                        case 68:
                            i2 = i5;
                            try {
                                cmt.o(O & 1048575, obj2, n8nVar3.R(eVar2.o(M), y0cVar3));
                                eVar2.L(h, M, obj2);
                                iArr = iArr2;
                                i3 = i4;
                                n8nVar2 = n8nVar3;
                                y0cVar2 = y0cVar3;
                                eVar = eVar2;
                            } catch (xxe unused6) {
                                iArr = iArr2;
                                i3 = i4;
                                n8nVar2 = n8nVar3;
                                y0cVar2 = y0cVar3;
                                eVar = eVar2;
                                oktVar.getClass();
                                if (kktVar == null) {
                                }
                                if (!okt.a(kktVar, n8nVar2)) {
                                }
                                y0c y0cVar42222222222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                                i4 = i3;
                                eVar2 = eVar;
                                y0cVar3 = y0cVar42222222222222222222222222222222222222222222222222222222222222222222222;
                                n8nVar3 = n8nVar2;
                                iArr2 = iArr;
                                i5 = i2;
                            } catch (Throwable th6) {
                                th = th6;
                                eVar = eVar2;
                                iArr = iArr2;
                                i = i4;
                                while (i2 < i) {
                                }
                                if (kktVar != null) {
                                }
                                throw th;
                            }
                            y0c y0cVar422222222222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                            i4 = i3;
                            eVar2 = eVar;
                            y0cVar3 = y0cVar422222222222222222222222222222222222222222222222222222222222222222222222;
                            n8nVar3 = n8nVar2;
                            iArr2 = iArr;
                            i5 = i2;
                            break;
                        default:
                            if (kktVar == null) {
                                try {
                                    oktVar.getClass();
                                    kktVar = kkt.b();
                                } catch (xxe unused7) {
                                    i3 = i4;
                                    i2 = i5;
                                    y0cVar2 = y0cVar3;
                                    iArr = iArr2;
                                    eVar = eVar2;
                                    n8nVar2 = n8nVar3;
                                    oktVar.getClass();
                                    if (kktVar == null) {
                                        c cVar = (c) obj2;
                                        kkt kktVar3 = cVar.unknownFields;
                                        if (kktVar3 == kktVar2) {
                                            kktVar3 = kkt.b();
                                            cVar.unknownFields = kktVar3;
                                        }
                                        kktVar = kktVar3;
                                    }
                                    if (!okt.a(kktVar, n8nVar2)) {
                                        int i6 = i3;
                                        while (i2 < i6) {
                                            eVar.l(iArr[i2], obj2, kktVar);
                                            i2++;
                                        }
                                        if (kktVar != null) {
                                            ((c) obj2).unknownFields = kktVar;
                                            return;
                                        }
                                        return;
                                    }
                                    y0c y0cVar4222222222222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                                    i4 = i3;
                                    eVar2 = eVar;
                                    y0cVar3 = y0cVar4222222222222222222222222222222222222222222222222222222222222222222222222;
                                    n8nVar3 = n8nVar2;
                                    iArr2 = iArr;
                                    i5 = i2;
                                }
                            }
                            oktVar.getClass();
                            if (!okt.a(kktVar, n8nVar3)) {
                                while (i5 < i4) {
                                    eVar2.l(iArr2[i5], obj2, kktVar);
                                    i5++;
                                }
                                break;
                            } else {
                                i3 = i4;
                                i2 = i5;
                                y0cVar2 = y0cVar3;
                                iArr = iArr2;
                                eVar = eVar2;
                                n8nVar2 = n8nVar3;
                                y0c y0cVar42222222222222222222222222222222222222222222222222222222222222222222222222 = y0cVar2;
                                i4 = i3;
                                eVar2 = eVar;
                                y0cVar3 = y0cVar42222222222222222222222222222222222222222222222222222222222222222222222222;
                                n8nVar3 = n8nVar2;
                                iArr2 = iArr;
                                i5 = i2;
                            }
                    }
                } else if (h == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        eVar2.l(iArr2[i5], obj2, kktVar);
                        i5++;
                    }
                    if (kktVar != null) {
                        oktVar.getClass();
                    }
                } else {
                    oktVar.getClass();
                    if (kktVar == null) {
                        c cVar2 = (c) obj2;
                        kkt kktVar4 = cVar2.unknownFields;
                        if (kktVar4 == kktVar2) {
                            kktVar4 = kkt.b();
                            cVar2.unknownFields = kktVar4;
                        }
                        kktVar = kktVar4;
                    }
                    if (!okt.a(kktVar, n8nVar3)) {
                        while (i5 < i4) {
                            eVar2.l(iArr2[i5], obj2, kktVar);
                            i5++;
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                eVar = eVar2;
                i = i4;
                i2 = i5;
                iArr = iArr2;
            }
        }
    }

    @Override // defpackage.vto
    public final void e(Object obj, b bVar) {
        bVar.getClass();
        a aVar = bVar.a;
        if (!this.g) {
            P(obj, bVar);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int O = O(i);
            int i2 = iArr[i];
            switch (N(O)) {
                case 0:
                    if (r(i, obj)) {
                        double e = cmt.d.e(O & 1048575, obj);
                        aVar.getClass();
                        aVar.o(i2, Double.doubleToRawLongBits(e));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(i, obj)) {
                        float f = cmt.d.f(O & 1048575, obj);
                        aVar.getClass();
                        aVar.m(i2, Float.floatToRawIntBits(f));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(i, obj)) {
                        aVar.t(i2, cmt.d.h(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(i, obj)) {
                        aVar.t(i2, cmt.d.h(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(i, obj)) {
                        int g = cmt.d.g(O & 1048575, obj);
                        aVar.r(i2, 0);
                        aVar.q(g);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(i, obj)) {
                        aVar.o(i2, cmt.d.h(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(i, obj)) {
                        aVar.m(i2, cmt.d.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(i, obj)) {
                        boolean c = cmt.d.c(O & 1048575, obj);
                        aVar.r(i2, 0);
                        aVar.k(c ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(i, obj)) {
                        Q(i2, cmt.d.i(O & 1048575, obj), bVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (r(i, obj)) {
                        bVar.c(i2, cmt.d.i(O & 1048575, obj), o(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(i, obj)) {
                        bVar.a(i2, (mn3) cmt.d.i(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(i, obj)) {
                        int g2 = cmt.d.g(O & 1048575, obj);
                        aVar.r(i2, 0);
                        aVar.s(g2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(i, obj)) {
                        int g3 = cmt.d.g(O & 1048575, obj);
                        aVar.r(i2, 0);
                        aVar.q(g3);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(i, obj)) {
                        aVar.m(i2, cmt.d.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(i, obj)) {
                        aVar.o(i2, cmt.d.h(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(i, obj)) {
                        int g4 = cmt.d.g(O & 1048575, obj);
                        aVar.r(i2, 0);
                        aVar.s((g4 >> 31) ^ (g4 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(i, obj)) {
                        long h = cmt.d.h(O & 1048575, obj);
                        aVar.t(i2, (h >> 63) ^ (h << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(i, obj)) {
                        bVar.b(i2, cmt.d.i(O & 1048575, obj), o(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    g.B(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 19:
                    g.F(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 20:
                    g.I(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 21:
                    g.Q(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 22:
                    g.H(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 23:
                    g.E(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 24:
                    g.D(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 25:
                    g.z(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 26:
                    g.O(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar);
                    break;
                case 27:
                    g.J(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, o(i));
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    g.A(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar);
                    break;
                case 29:
                    g.P(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 30:
                    g.C(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    g.K(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 32:
                    g.L(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    g.M(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    g.N(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, false);
                    break;
                case 35:
                    g.B(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    g.F(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case 37:
                    g.I(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case 38:
                    g.Q(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case 39:
                    g.H(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case 40:
                    g.E(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case 41:
                    g.D(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case 42:
                    g.z(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    g.P(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    g.C(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    g.K(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    g.L(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    g.M(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    g.N(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    g.G(iArr[i], (List) cmt.d.i(O & 1048575, obj), bVar, o(i));
                    break;
                case 50:
                    if (cmt.d.i(O & 1048575, obj) != null) {
                        Object n = n(i);
                        this.n.getClass();
                        eta.q(n);
                        throw null;
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (s(i2, i, obj)) {
                        double doubleValue = ((Double) cmt.d.i(O & 1048575, obj)).doubleValue();
                        aVar.getClass();
                        aVar.o(i2, Double.doubleToRawLongBits(doubleValue));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (s(i2, i, obj)) {
                        float floatValue = ((Float) cmt.d.i(O & 1048575, obj)).floatValue();
                        aVar.getClass();
                        aVar.m(i2, Float.floatToRawIntBits(floatValue));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (s(i2, i, obj)) {
                        aVar.t(i2, B(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (s(i2, i, obj)) {
                        aVar.t(i2, B(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (s(i2, i, obj)) {
                        int A = A(O & 1048575, obj);
                        aVar.r(i2, 0);
                        aVar.q(A);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (s(i2, i, obj)) {
                        aVar.o(i2, B(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (s(i2, i, obj)) {
                        aVar.m(i2, A(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i2, i, obj)) {
                        boolean booleanValue = ((Boolean) cmt.d.i(O & 1048575, obj)).booleanValue();
                        aVar.r(i2, 0);
                        aVar.k(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i2, i, obj)) {
                        Q(i2, cmt.d.i(O & 1048575, obj), bVar);
                        break;
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (s(i2, i, obj)) {
                        bVar.c(i2, cmt.d.i(O & 1048575, obj), o(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i2, i, obj)) {
                        bVar.a(i2, (mn3) cmt.d.i(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i2, i, obj)) {
                        int A2 = A(O & 1048575, obj);
                        aVar.r(i2, 0);
                        aVar.s(A2);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i2, i, obj)) {
                        int A3 = A(O & 1048575, obj);
                        aVar.r(i2, 0);
                        aVar.q(A3);
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (s(i2, i, obj)) {
                        aVar.m(i2, A(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i2, i, obj)) {
                        aVar.o(i2, B(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i2, i, obj)) {
                        int A4 = A(O & 1048575, obj);
                        aVar.r(i2, 0);
                        aVar.s((A4 >> 31) ^ (A4 << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i2, i, obj)) {
                        long B = B(O & 1048575, obj);
                        aVar.t(i2, (B >> 63) ^ (B << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i2, i, obj)) {
                        bVar.b(i2, cmt.d.i(O & 1048575, obj), o(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.m.getClass();
        ((c) obj).unknownFields.d(bVar);
    }

    @Override // defpackage.vto
    public final int f(d8 d8Var) {
        return this.g ? q(d8Var) : p(d8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.g.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.g.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.g.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.g.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r7, r12)) == java.lang.Float.floatToIntBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.g.y(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.vto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(c cVar, c cVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int O = O(i);
                long j = O & 1048575;
                switch (N(O)) {
                    case 0:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar2 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar3 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar4 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar5 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar6 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar7 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar8 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar9 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar10 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar11 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar12 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar13 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar14 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar15 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar16 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar17 = cmt.d;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (k(cVar, cVar2, i)) {
                            zlt zltVar18 = cmt.d;
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
                        zlt zltVar19 = cmt.d;
                        z = g.y(zltVar19.i(j, cVar), zltVar19.i(j, cVar2));
                        break;
                    case 50:
                        zlt zltVar20 = cmt.d;
                        z = g.y(zltVar20.i(j, cVar), zltVar20.i(j, cVar2));
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
                        long j2 = iArr[i + 2] & 1048575;
                        zlt zltVar21 = cmt.d;
                        if (zltVar21.g(j2, cVar) == zltVar21.g(j2, cVar2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.m.getClass();
                if (cVar.unknownFields.equals(cVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
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
    @Override // defpackage.vto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(c cVar) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int O = O(i4);
            int i5 = iArr[i4];
            long j = 1048575 & O;
            int i6 = 1237;
            int i7 = 37;
            switch (N(O)) {
                case 0:
                    i = i3 * 53;
                    b = tse.b(Double.doubleToLongBits(cmt.d.e(j, cVar)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(cmt.d.f(j, cVar));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = tse.b(cmt.d.h(j, cVar));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = tse.b(cmt.d.h(j, cVar));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = cmt.d.g(j, cVar);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = tse.b(cmt.d.h(j, cVar));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = cmt.d.g(j, cVar);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean c = cmt.d.c(j, cVar);
                    Charset charset = tse.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) cmt.d.i(j, cVar)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object i8 = cmt.d.i(j, cVar);
                    if (i8 != null) {
                        i7 = i8.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = cmt.d.i(j, cVar).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = cmt.d.g(j, cVar);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = cmt.d.g(j, cVar);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = cmt.d.g(j, cVar);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = tse.b(cmt.d.h(j, cVar));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = cmt.d.g(j, cVar);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = tse.b(cmt.d.h(j, cVar));
                    i3 = b + i;
                    break;
                case 17:
                    Object i9 = cmt.d.i(j, cVar);
                    if (i9 != null) {
                        i7 = i9.hashCode();
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
                    i = i3 * 53;
                    b = cmt.d.i(j, cVar).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = cmt.d.i(j, cVar).hashCode();
                    i3 = b + i;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = tse.b(Double.doubleToLongBits(((Double) cmt.d.i(j, cVar)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) cmt.d.i(j, cVar)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = tse.b(B(j, cVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = tse.b(B(j, cVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = A(j, cVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = tse.b(B(j, cVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = A(j, cVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i5, i4, cVar)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) cmt.d.i(j, cVar)).booleanValue();
                        Charset charset2 = tse.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = ((String) cmt.d.i(j, cVar)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = cmt.d.i(j, cVar).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = cmt.d.i(j, cVar).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = A(j, cVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = A(j, cVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = A(j, cVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = tse.b(B(j, cVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = A(j, cVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = tse.b(B(j, cVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i5, i4, cVar)) {
                        i = i3 * 53;
                        b = cmt.d.i(j, cVar).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.m.getClass();
        return cVar.unknownFields.hashCode() + (i3 * 53);
    }

    @Override // defpackage.vto
    public final void i(Object obj, byte[] bArr, int i, int i2, wx0 wx0Var) {
        if (this.g) {
            F(obj, bArr, i, i2, wx0Var);
        } else {
            E(obj, bArr, i, i2, 0, wx0Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.vto
    public final void j(c cVar, c cVar2) {
        c cVar3;
        cVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                g.x(this.m, cVar, cVar2);
                return;
            }
            int O = O(i);
            long j = 1048575 & O;
            int i2 = iArr[i];
            switch (N(O)) {
                case 0:
                    if (r(i, cVar2)) {
                        zlt zltVar = cmt.d;
                        cVar3 = cVar;
                        zltVar.m(cVar3, j, zltVar.e(j, cVar2));
                        K(i, cVar3);
                        break;
                    }
                    cVar3 = cVar;
                    break;
                case 1:
                    if (r(i, cVar2)) {
                        zlt zltVar2 = cmt.d;
                        zltVar2.n(cVar, j, zltVar2.f(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 2:
                    if (r(i, cVar2)) {
                        cmt.n(cVar, j, cmt.d.h(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 3:
                    if (r(i, cVar2)) {
                        cmt.n(cVar, j, cmt.d.h(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 4:
                    if (r(i, cVar2)) {
                        cmt.m(j, cVar, cmt.d.g(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 5:
                    if (r(i, cVar2)) {
                        cmt.n(cVar, j, cmt.d.h(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 6:
                    if (r(i, cVar2)) {
                        cmt.m(j, cVar, cmt.d.g(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 7:
                    if (r(i, cVar2)) {
                        zlt zltVar3 = cmt.d;
                        zltVar3.k(cVar, j, zltVar3.c(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 8:
                    if (r(i, cVar2)) {
                        cmt.o(j, cVar, cmt.d.i(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 9:
                    v(i, cVar, cVar2);
                    cVar3 = cVar;
                    break;
                case 10:
                    if (r(i, cVar2)) {
                        cmt.o(j, cVar, cmt.d.i(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 11:
                    if (r(i, cVar2)) {
                        cmt.m(j, cVar, cmt.d.g(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 12:
                    if (r(i, cVar2)) {
                        cmt.m(j, cVar, cmt.d.g(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 13:
                    if (r(i, cVar2)) {
                        cmt.m(j, cVar, cmt.d.g(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 14:
                    if (r(i, cVar2)) {
                        cmt.n(cVar, j, cmt.d.h(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 15:
                    if (r(i, cVar2)) {
                        cmt.m(j, cVar, cmt.d.g(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 16:
                    if (r(i, cVar2)) {
                        cmt.n(cVar, j, cmt.d.h(j, cVar2));
                        K(i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 17:
                    v(i, cVar, cVar2);
                    cVar3 = cVar;
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
                    this.l.b(j, cVar, cVar2);
                    cVar3 = cVar;
                    break;
                case 50:
                    Class cls = g.a;
                    zlt zltVar4 = cmt.d;
                    Object i3 = zltVar4.i(j, cVar);
                    Object i4 = zltVar4.i(j, cVar2);
                    this.n.getClass();
                    cmt.o(j, cVar, t9h.b(i3, i4));
                    cVar3 = cVar;
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
                    if (s(i2, i, cVar2)) {
                        cmt.o(j, cVar, cmt.d.i(j, cVar2));
                        L(i2, i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    w(i, cVar, cVar2);
                    cVar3 = cVar;
                    break;
                case 61:
                case 62:
                case 63:
                case SQLiteDatabase.OPEN_URI /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (s(i2, i, cVar2)) {
                        cmt.o(j, cVar, cmt.d.i(j, cVar2));
                        L(i2, i, cVar);
                    }
                    cVar3 = cVar;
                    break;
                case 68:
                    w(i, cVar, cVar2);
                    cVar3 = cVar;
                    break;
                default:
                    cVar3 = cVar;
                    break;
            }
            i += 3;
            cVar = cVar3;
        }
    }

    public final boolean k(c cVar, Object obj, int i) {
        return r(i, cVar) == r(i, obj);
    }

    public final void l(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (cmt.d.i(O(i) & 1048575, obj) == null) {
            return;
        }
        m(i);
    }

    public final void m(int i) {
        if (this.b[hrg.B(i, 3, 2, 1)] == null) {
            return;
        }
        l1j.f();
    }

    public final Object n(int i) {
        return this.b[(i / 3) * 2];
    }

    public final vto o(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        vto vtoVar = (vto) objArr[i2];
        if (vtoVar != null) {
            return vtoVar;
        }
        vto a = wym.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final int p(Object obj) {
        int i;
        int h;
        int j;
        int h2;
        int f;
        int d;
        int h3;
        int g;
        int z;
        int h4;
        int i2;
        Unsafe unsafe = p;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                this.m.getClass();
                return ((c) obj).unknownFields.a() + i5;
            }
            int O = O(i4);
            int i7 = iArr[i4];
            int N = N(O);
            if (N <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i6 = unsafe.getInt(obj, i9);
                    i3 = i9;
                }
            } else {
                i = 0;
            }
            long j2 = O & 1048575;
            switch (N) {
                case 0:
                    if ((i6 & i) != 0) {
                        i5 = hrg.g(i7, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i & i6) != 0) {
                        i5 = hrg.g(i7, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i6 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j2);
                        h = a.h(i7);
                        j = a.j(j3);
                        h4 = j + h;
                        i5 += h4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i6 & i) != 0) {
                        long j4 = unsafe.getLong(obj, j2);
                        h = a.h(i7);
                        j = a.j(j4);
                        h4 = j + h;
                        i5 += h4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i6 & i) != 0) {
                        int i10 = unsafe.getInt(obj, j2);
                        h2 = a.h(i7);
                        f = a.f(i10);
                        d = f + h2;
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i6 & i) != 0) {
                        d = a.d(i7);
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i6 & i) != 0) {
                        d = a.c(i7);
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i6 & i) != 0) {
                        i5 = hrg.g(i7, 1, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof mn3) {
                            int h5 = a.h(i7);
                            int size = ((mn3) object).size();
                            z = hrg.z(size, size, h5, i5);
                            i5 = z;
                            break;
                        } else {
                            h3 = a.h(i7);
                            g = a.g((String) object);
                            z = g + h3 + i5;
                            i5 = z;
                        }
                    }
                case 9:
                    if ((i6 & i) != 0) {
                        Object object2 = unsafe.getObject(obj, j2);
                        vto o2 = o(i4);
                        Class cls = g.a;
                        d8 d8Var = (d8) object2;
                        int h6 = a.h(i7);
                        d8Var.getClass();
                        c cVar = (c) d8Var;
                        int i11 = cVar.memoizedSerializedSize;
                        if (i11 == -1) {
                            i11 = o2.f(d8Var);
                            cVar.memoizedSerializedSize = i11;
                        }
                        i5 = hrg.z(i11, i11, h6, i5);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i6 & i) != 0) {
                        d = a.a(i7, (mn3) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i6 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j2);
                        h2 = a.h(i7);
                        f = a.i(i12);
                        d = f + h2;
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i6 & i) != 0) {
                        int i13 = unsafe.getInt(obj, j2);
                        h2 = a.h(i7);
                        f = a.f(i13);
                        d = f + h2;
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i & i6) != 0) {
                        i5 = hrg.g(i7, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i6 & i) != 0) {
                        i5 = hrg.g(i7, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i6 & i) != 0) {
                        int i14 = unsafe.getInt(obj, j2);
                        h2 = a.h(i7);
                        f = a.i((i14 >> 31) ^ (i14 << 1));
                        d = f + h2;
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i6 & i) != 0) {
                        long j5 = unsafe.getLong(obj, j2);
                        h = a.h(i7);
                        j = a.j((j5 >> 63) ^ (j5 << 1));
                        h4 = j + h;
                        i5 += h4;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i6 & i) != 0) {
                        d = a.e(i7, (d8) unsafe.getObject(obj, j2), o(i4));
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    d = g.f((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 19:
                    d = g.d((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 20:
                    d = g.j((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 21:
                    d = g.t((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 22:
                    d = g.h((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 23:
                    d = g.f((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 24:
                    d = g.d((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(obj, j2);
                    Class cls2 = g.a;
                    int size2 = list.size();
                    h4 = size2 == 0 ? 0 : (a.h(i7) + 1) * size2;
                    i5 += h4;
                    break;
                case 26:
                    d = g.q((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 27:
                    d = g.l(i7, (List) unsafe.getObject(obj, j2), o(i4));
                    i5 += d;
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    d = g.a((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 29:
                    d = g.r((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 30:
                    d = g.b((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    d = g.d((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 32:
                    d = g.f((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    d = g.m((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    d = g.o((List) unsafe.getObject(obj, j2), i7);
                    i5 += d;
                    break;
                case 35:
                    int g2 = g.g((List) unsafe.getObject(obj, j2));
                    if (g2 > 0) {
                        i5 = hrg.z(g2, a.h(i7), g2, i5);
                        break;
                    } else {
                        break;
                    }
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    int e = g.e((List) unsafe.getObject(obj, j2));
                    if (e > 0) {
                        i5 = hrg.z(e, a.h(i7), e, i5);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k = g.k((List) unsafe.getObject(obj, j2));
                    if (k > 0) {
                        i5 = hrg.z(k, a.h(i7), k, i5);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u = g.u((List) unsafe.getObject(obj, j2));
                    if (u > 0) {
                        i5 = hrg.z(u, a.h(i7), u, i5);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i15 = g.i((List) unsafe.getObject(obj, j2));
                    if (i15 > 0) {
                        i5 = hrg.z(i15, a.h(i7), i15, i5);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g3 = g.g((List) unsafe.getObject(obj, j2));
                    if (g3 > 0) {
                        i5 = hrg.z(g3, a.h(i7), g3, i5);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e2 = g.e((List) unsafe.getObject(obj, j2));
                    if (e2 > 0) {
                        i5 = hrg.z(e2, a.h(i7), e2, i5);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(obj, j2);
                    Class cls3 = g.a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        i5 = hrg.z(size3, a.h(i7), size3, i5);
                        break;
                    } else {
                        break;
                    }
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    int s = g.s((List) unsafe.getObject(obj, j2));
                    if (s > 0) {
                        i5 = hrg.z(s, a.h(i7), s, i5);
                        break;
                    } else {
                        break;
                    }
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    int c = g.c((List) unsafe.getObject(obj, j2));
                    if (c > 0) {
                        i5 = hrg.z(c, a.h(i7), c, i5);
                        break;
                    } else {
                        break;
                    }
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    int e3 = g.e((List) unsafe.getObject(obj, j2));
                    if (e3 > 0) {
                        i5 = hrg.z(e3, a.h(i7), e3, i5);
                        break;
                    } else {
                        break;
                    }
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    int g4 = g.g((List) unsafe.getObject(obj, j2));
                    if (g4 > 0) {
                        i5 = hrg.z(g4, a.h(i7), g4, i5);
                        break;
                    } else {
                        break;
                    }
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    int n = g.n((List) unsafe.getObject(obj, j2));
                    if (n > 0) {
                        i5 = hrg.z(n, a.h(i7), n, i5);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    int p2 = g.p((List) unsafe.getObject(obj, j2));
                    if (p2 > 0) {
                        i5 = hrg.z(p2, a.h(i7), p2, i5);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    List list3 = (List) unsafe.getObject(obj, j2);
                    vto o3 = o(i4);
                    Class cls4 = g.a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i16 = 0; i16 < size4; i16++) {
                            i2 += a.e(i7, (d8) list3.get(i16), o3);
                        }
                    }
                    i5 += i2;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j2);
                    Object n2 = n(i4);
                    this.n.getClass();
                    t9h.a(object3, n2);
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (s(i7, i4, obj)) {
                        i5 = hrg.g(i7, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (s(i7, i4, obj)) {
                        i5 = hrg.g(i7, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (s(i7, i4, obj)) {
                        long B = B(j2, obj);
                        h = a.h(i7);
                        j = a.j(B);
                        h4 = j + h;
                        i5 += h4;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (s(i7, i4, obj)) {
                        long B2 = B(j2, obj);
                        h = a.h(i7);
                        j = a.j(B2);
                        h4 = j + h;
                        i5 += h4;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (s(i7, i4, obj)) {
                        int A = A(j2, obj);
                        h2 = a.h(i7);
                        f = a.f(A);
                        d = f + h2;
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (s(i7, i4, obj)) {
                        d = a.d(i7);
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (s(i7, i4, obj)) {
                        d = a.c(i7);
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i7, i4, obj)) {
                        i5 = hrg.g(i7, 1, i5);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!s(i7, i4, obj)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(obj, j2);
                        if (object4 instanceof mn3) {
                            int h7 = a.h(i7);
                            int size5 = ((mn3) object4).size();
                            z = hrg.z(size5, size5, h7, i5);
                            i5 = z;
                            break;
                        } else {
                            h3 = a.h(i7);
                            g = a.g((String) object4);
                            z = g + h3 + i5;
                            i5 = z;
                        }
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (s(i7, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j2);
                        vto o4 = o(i4);
                        Class cls5 = g.a;
                        d8 d8Var2 = (d8) object5;
                        int h8 = a.h(i7);
                        d8Var2.getClass();
                        c cVar2 = (c) d8Var2;
                        int i17 = cVar2.memoizedSerializedSize;
                        if (i17 == -1) {
                            i17 = o4.f(d8Var2);
                            cVar2.memoizedSerializedSize = i17;
                        }
                        i5 = hrg.z(i17, i17, h8, i5);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i7, i4, obj)) {
                        d = a.a(i7, (mn3) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i7, i4, obj)) {
                        int A2 = A(j2, obj);
                        h2 = a.h(i7);
                        f = a.i(A2);
                        d = f + h2;
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i7, i4, obj)) {
                        int A3 = A(j2, obj);
                        h2 = a.h(i7);
                        f = a.f(A3);
                        d = f + h2;
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (s(i7, i4, obj)) {
                        i5 = hrg.g(i7, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i7, i4, obj)) {
                        i5 = hrg.g(i7, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i7, i4, obj)) {
                        int A4 = A(j2, obj);
                        h2 = a.h(i7);
                        f = a.i((A4 >> 31) ^ (A4 << 1));
                        d = f + h2;
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i7, i4, obj)) {
                        long B3 = B(j2, obj);
                        h = a.h(i7);
                        j = a.j((B3 >> 63) ^ (B3 << 1));
                        h4 = j + h;
                        i5 += h4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i7, i4, obj)) {
                        d = a.e(i7, (d8) unsafe.getObject(obj, j2), o(i4));
                        i5 += d;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
        }
    }

    public final int q(Object obj) {
        int h;
        int j;
        int h2;
        int f;
        int d;
        int h3;
        int g;
        int h4;
        int j2;
        int h5;
        int i;
        Unsafe unsafe = p;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                this.m.getClass();
                return ((c) obj).unknownFields.a() + i3;
            }
            int O = O(i2);
            int N = N(O);
            int i4 = iArr[i2];
            long j3 = O & 1048575;
            if (N >= i9c.b.a && N <= i9c.c.a) {
                int i5 = iArr[i2 + 2];
            }
            switch (N) {
                case 0:
                    if (r(i2, obj)) {
                        i3 = hrg.g(i4, 8, i3);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(i2, obj)) {
                        i3 = hrg.g(i4, 4, i3);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(i2, obj)) {
                        long h6 = cmt.d.h(j3, obj);
                        h = a.h(i4);
                        j = a.j(h6);
                        d = j + h;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(i2, obj)) {
                        long h7 = cmt.d.h(j3, obj);
                        h = a.h(i4);
                        j = a.j(h7);
                        d = j + h;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(i2, obj)) {
                        int g2 = cmt.d.g(j3, obj);
                        h2 = a.h(i4);
                        f = a.f(g2);
                        d = f + h2;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(i2, obj)) {
                        d = a.d(i4);
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(i2, obj)) {
                        d = a.c(i4);
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(i2, obj)) {
                        i3 = hrg.g(i4, 1, i3);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(i2, obj)) {
                        Object i6 = cmt.d.i(j3, obj);
                        if (i6 instanceof mn3) {
                            int h8 = a.h(i4);
                            int size = ((mn3) i6).size();
                            i3 = hrg.z(size, size, h8, i3);
                            break;
                        } else {
                            h3 = a.h(i4);
                            g = a.g((String) i6);
                            i3 = g + h3 + i3;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (r(i2, obj)) {
                        Object i7 = cmt.d.i(j3, obj);
                        vto o2 = o(i2);
                        Class cls = g.a;
                        d8 d8Var = (d8) i7;
                        int h9 = a.h(i4);
                        d8Var.getClass();
                        c cVar = (c) d8Var;
                        int i8 = cVar.memoizedSerializedSize;
                        if (i8 == -1) {
                            i8 = o2.f(d8Var);
                            cVar.memoizedSerializedSize = i8;
                        }
                        i3 = hrg.z(i8, i8, h9, i3);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(i2, obj)) {
                        d = a.a(i4, (mn3) cmt.d.i(j3, obj));
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(i2, obj)) {
                        int g3 = cmt.d.g(j3, obj);
                        h2 = a.h(i4);
                        f = a.i(g3);
                        d = f + h2;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(i2, obj)) {
                        int g4 = cmt.d.g(j3, obj);
                        h2 = a.h(i4);
                        f = a.f(g4);
                        d = f + h2;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(i2, obj)) {
                        i3 = hrg.g(i4, 4, i3);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(i2, obj)) {
                        i3 = hrg.g(i4, 8, i3);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(i2, obj)) {
                        int g5 = cmt.d.g(j3, obj);
                        h2 = a.h(i4);
                        f = a.i((g5 >> 31) ^ (g5 << 1));
                        d = f + h2;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(i2, obj)) {
                        long h10 = cmt.d.h(j3, obj);
                        h4 = a.h(i4);
                        j2 = a.j((h10 << 1) ^ (h10 >> 63));
                        h5 = j2 + h4;
                        i3 += h5;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(i2, obj)) {
                        d = a.e(i4, (d8) cmt.d.i(j3, obj), o(i2));
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    d = g.f(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 19:
                    d = g.d(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 20:
                    d = g.j(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 21:
                    d = g.t(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 22:
                    d = g.h(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 23:
                    d = g.f(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 24:
                    d = g.d(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 25:
                    List t = t(j3, obj);
                    Class cls2 = g.a;
                    int size2 = t.size();
                    h5 = size2 == 0 ? 0 : (a.h(i4) + 1) * size2;
                    i3 += h5;
                    break;
                case 26:
                    d = g.q(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 27:
                    d = g.l(i4, t(j3, obj), o(i2));
                    i3 += d;
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    d = g.a(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 29:
                    d = g.r(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 30:
                    d = g.b(t(j3, obj), i4);
                    i3 += d;
                    break;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    d = g.d(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 32:
                    d = g.f(t(j3, obj), i4);
                    i3 += d;
                    break;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    d = g.m(t(j3, obj), i4);
                    i3 += d;
                    break;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    d = g.o(t(j3, obj), i4);
                    i3 += d;
                    break;
                case 35:
                    int g6 = g.g((List) unsafe.getObject(obj, j3));
                    if (g6 > 0) {
                        i3 = hrg.z(g6, a.h(i4), g6, i3);
                        break;
                    } else {
                        break;
                    }
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    int e = g.e((List) unsafe.getObject(obj, j3));
                    if (e > 0) {
                        i3 = hrg.z(e, a.h(i4), e, i3);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k = g.k((List) unsafe.getObject(obj, j3));
                    if (k > 0) {
                        i3 = hrg.z(k, a.h(i4), k, i3);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u = g.u((List) unsafe.getObject(obj, j3));
                    if (u > 0) {
                        i3 = hrg.z(u, a.h(i4), u, i3);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i9 = g.i((List) unsafe.getObject(obj, j3));
                    if (i9 > 0) {
                        i3 = hrg.z(i9, a.h(i4), i9, i3);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g7 = g.g((List) unsafe.getObject(obj, j3));
                    if (g7 > 0) {
                        i3 = hrg.z(g7, a.h(i4), g7, i3);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e2 = g.e((List) unsafe.getObject(obj, j3));
                    if (e2 > 0) {
                        i3 = hrg.z(e2, a.h(i4), e2, i3);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls3 = g.a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        i3 = hrg.z(size3, a.h(i4), size3, i3);
                        break;
                    } else {
                        break;
                    }
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    int s = g.s((List) unsafe.getObject(obj, j3));
                    if (s > 0) {
                        i3 = hrg.z(s, a.h(i4), s, i3);
                        break;
                    } else {
                        break;
                    }
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    int c = g.c((List) unsafe.getObject(obj, j3));
                    if (c > 0) {
                        i3 = hrg.z(c, a.h(i4), c, i3);
                        break;
                    } else {
                        break;
                    }
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    int e3 = g.e((List) unsafe.getObject(obj, j3));
                    if (e3 > 0) {
                        i3 = hrg.z(e3, a.h(i4), e3, i3);
                        break;
                    } else {
                        break;
                    }
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    int g8 = g.g((List) unsafe.getObject(obj, j3));
                    if (g8 > 0) {
                        i3 = hrg.z(g8, a.h(i4), g8, i3);
                        break;
                    } else {
                        break;
                    }
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    int n = g.n((List) unsafe.getObject(obj, j3));
                    if (n > 0) {
                        i3 = hrg.z(n, a.h(i4), n, i3);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    int p2 = g.p((List) unsafe.getObject(obj, j3));
                    if (p2 > 0) {
                        i3 = hrg.z(p2, a.h(i4), p2, i3);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    List t2 = t(j3, obj);
                    vto o3 = o(i2);
                    Class cls4 = g.a;
                    int size4 = t2.size();
                    if (size4 == 0) {
                        i = 0;
                    } else {
                        i = 0;
                        for (int i10 = 0; i10 < size4; i10++) {
                            i += a.e(i4, (d8) t2.get(i10), o3);
                        }
                    }
                    i3 += i;
                    break;
                case 50:
                    Object i11 = cmt.d.i(j3, obj);
                    Object n2 = n(i2);
                    this.n.getClass();
                    t9h.a(i11, n2);
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (s(i4, i2, obj)) {
                        i3 = hrg.g(i4, 8, i3);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (s(i4, i2, obj)) {
                        i3 = hrg.g(i4, 4, i3);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (s(i4, i2, obj)) {
                        long B = B(j3, obj);
                        h = a.h(i4);
                        j = a.j(B);
                        d = j + h;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (s(i4, i2, obj)) {
                        long B2 = B(j3, obj);
                        h = a.h(i4);
                        j = a.j(B2);
                        d = j + h;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (s(i4, i2, obj)) {
                        int A = A(j3, obj);
                        h2 = a.h(i4);
                        f = a.f(A);
                        d = f + h2;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (s(i4, i2, obj)) {
                        d = a.d(i4);
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (s(i4, i2, obj)) {
                        d = a.c(i4);
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i4, i2, obj)) {
                        i3 = hrg.g(i4, 1, i3);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i4, i2, obj)) {
                        Object i12 = cmt.d.i(j3, obj);
                        if (i12 instanceof mn3) {
                            int h11 = a.h(i4);
                            int size5 = ((mn3) i12).size();
                            i3 = hrg.z(size5, size5, h11, i3);
                            break;
                        } else {
                            h3 = a.h(i4);
                            g = a.g((String) i12);
                            i3 = g + h3 + i3;
                            break;
                        }
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (s(i4, i2, obj)) {
                        Object i13 = cmt.d.i(j3, obj);
                        vto o4 = o(i2);
                        Class cls5 = g.a;
                        d8 d8Var2 = (d8) i13;
                        int h12 = a.h(i4);
                        d8Var2.getClass();
                        c cVar2 = (c) d8Var2;
                        int i14 = cVar2.memoizedSerializedSize;
                        if (i14 == -1) {
                            i14 = o4.f(d8Var2);
                            cVar2.memoizedSerializedSize = i14;
                        }
                        i3 = hrg.z(i14, i14, h12, i3);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i4, i2, obj)) {
                        d = a.a(i4, (mn3) cmt.d.i(j3, obj));
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i4, i2, obj)) {
                        int A2 = A(j3, obj);
                        h2 = a.h(i4);
                        f = a.i(A2);
                        d = f + h2;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i4, i2, obj)) {
                        int A3 = A(j3, obj);
                        h2 = a.h(i4);
                        f = a.f(A3);
                        d = f + h2;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (s(i4, i2, obj)) {
                        i3 = hrg.g(i4, 4, i3);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i4, i2, obj)) {
                        i3 = hrg.g(i4, 8, i3);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i4, i2, obj)) {
                        int A4 = A(j3, obj);
                        h2 = a.h(i4);
                        f = a.i((A4 >> 31) ^ (A4 << 1));
                        d = f + h2;
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i4, i2, obj)) {
                        long B3 = B(j3, obj);
                        h4 = a.h(i4);
                        j2 = a.j((B3 << 1) ^ (B3 >> 63));
                        h5 = j2 + h4;
                        i3 += h5;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i4, i2, obj)) {
                        d = a.e(i4, (d8) cmt.d.i(j3, obj), o(i2));
                        i3 += d;
                        break;
                    } else {
                        break;
                    }
            }
            i2 += 3;
        }
    }

    public final boolean r(int i, Object obj) {
        if (this.g) {
            int O = O(i);
            long j = O & 1048575;
            switch (N(O)) {
                case 0:
                    if (cmt.d.e(j, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (cmt.d.f(j, obj) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (cmt.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (cmt.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (cmt.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (cmt.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (cmt.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return cmt.d.c(j, obj);
                case 8:
                    Object i2 = cmt.d.i(j, obj);
                    if (i2 instanceof String) {
                        return !((String) i2).isEmpty();
                    }
                    if (i2 instanceof mn3) {
                        return !mn3.b.equals(i2);
                    }
                    e7o.e();
                    return false;
                case 9:
                    if (cmt.d.i(j, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !mn3.b.equals(cmt.d.i(j, obj));
                case 11:
                    if (cmt.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (cmt.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (cmt.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (cmt.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (cmt.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (cmt.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (cmt.d.i(j, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    e7o.e();
                    return false;
            }
        } else {
            if ((cmt.d.g(r6 & 1048575, obj) & (1 << (this.a[i + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean s(int i, int i2, Object obj) {
        return cmt.d.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void u(int i, Object obj, Object obj2) {
        long O = O(i) & 1048575;
        Object i2 = cmt.d.i(O, obj);
        t9h t9hVar = this.n;
        if (i2 != null) {
            t9hVar.getClass();
            if (!((q9h) i2).a) {
                q9h d = q9h.b.d();
                t9h.b(d, i2);
                cmt.o(O, obj, d);
                i2 = d;
            }
        } else {
            t9hVar.getClass();
            i2 = q9h.b.d();
            cmt.o(O, obj, i2);
        }
        t9hVar.getClass();
        eta.q(obj2);
        throw null;
    }

    public final void v(int i, Object obj, Object obj2) {
        long O = O(i) & 1048575;
        if (r(i, obj2)) {
            zlt zltVar = cmt.d;
            Object i2 = zltVar.i(O, obj);
            Object i3 = zltVar.i(O, obj2);
            if (i2 != null && i3 != null) {
                cmt.o(O, obj, tse.c(i2, i3));
                K(i, obj);
            } else if (i3 != null) {
                cmt.o(O, obj, i3);
                K(i, obj);
            }
        }
    }

    public final void w(int i, Object obj, Object obj2) {
        int O = O(i);
        int i2 = this.a[i];
        long j = O & 1048575;
        if (s(i2, i, obj2)) {
            zlt zltVar = cmt.d;
            Object i3 = zltVar.i(j, obj);
            Object i4 = zltVar.i(j, obj2);
            if (i3 != null && i4 != null) {
                cmt.o(j, obj, tse.c(i3, i4));
                L(i2, i, obj);
            } else if (i4 != null) {
                cmt.o(j, obj, i4);
                L(i2, i, obj);
            }
        }
    }
}
