package androidx.glance.appwidget.protobuf;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import defpackage.bmt;
import defpackage.c4j;
import defpackage.cye;
import defpackage.czm;
import defpackage.d1c;
import defpackage.e7o;
import defpackage.ejn;
import defpackage.emt;
import defpackage.eta;
import defpackage.h9c;
import defpackage.hrg;
import defpackage.jzi;
import defpackage.l1j;
import defpackage.mkt;
import defpackage.n8n;
import defpackage.ouj;
import defpackage.p9h;
import defpackage.qn3;
import defpackage.rr4;
import defpackage.sse;
import defpackage.tuh;
import defpackage.v8;
import defpackage.v9h;
import defpackage.vse;
import defpackage.w8g;
import defpackage.x0c;
import defpackage.xq0;
import defpackage.xr4;
import defpackage.xto;
import defpackage.xvf;
import defpackage.zym;
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
public final class d implements xto {
    public static final int[] n = new int[0];
    public static final Unsafe o = emt.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final c4j j;
    public final w8g k;
    public final g l;
    public final v9h m;

    public d(int[] iArr, Object[] objArr, int i, int i2, a aVar, int[] iArr2, int i3, int i4, c4j c4jVar, w8g w8gVar, g gVar, d1c d1cVar, v9h v9hVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = aVar instanceof b;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = c4jVar;
        this.k = w8gVar;
        this.l = gVar;
        this.e = aVar;
        this.m = v9hVar;
    }

    public static Field F(String str, Class cls) {
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

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof b) {
            return ((b) obj).f();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d w(ejn ejnVar, c4j c4jVar, w8g w8gVar, g gVar, d1c d1cVar, v9h v9hVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
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
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field F;
        int i25;
        char charAt10;
        int i26;
        int i27;
        Field F2;
        Field F3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        String str2 = ejnVar.b;
        int length = str2.length();
        if (str2.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str2.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt15 = str2.charAt(i);
        if (charAt15 >= 55296) {
            int i35 = charAt15 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt14 = str2.charAt(i34);
                if (charAt14 < 55296) {
                    break;
                }
                i35 |= (charAt14 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            charAt15 = i35 | (charAt14 << i36);
            i34 = i32;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt16 = str2.charAt(i34);
            if (charAt16 >= 55296) {
                int i38 = charAt16 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    charAt9 = str2.charAt(i37);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i38 |= (charAt9 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                charAt16 = i38 | (charAt9 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int charAt17 = str2.charAt(i37);
            if (charAt17 >= 55296) {
                int i41 = charAt17 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt8 = str2.charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i41 |= (charAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                charAt17 = i41 | (charAt8 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int charAt18 = str2.charAt(i40);
            if (charAt18 >= 55296) {
                int i44 = charAt18 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt7 = str2.charAt(i43);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i44 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                charAt18 = i44 | (charAt7 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int charAt19 = str2.charAt(i43);
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt6 = str2.charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i47 |= (charAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt19 = i47 | (charAt6 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            charAt = str2.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt5 = str2.charAt(i49);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i50 |= (charAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt = i50 | (charAt5 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int charAt20 = str2.charAt(i49);
            if (charAt20 >= 55296) {
                int i53 = charAt20 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt4 = str2.charAt(i52);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i53 |= (charAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                charAt20 = i53 | (charAt4 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int charAt21 = str2.charAt(i52);
            if (charAt21 >= 55296) {
                int i56 = charAt21 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    charAt3 = str2.charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                charAt21 = i56 | (charAt3 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int charAt22 = str2.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    charAt2 = str2.charAt(i58);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i59 |= (charAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                charAt22 = i59 | (charAt2 << i60);
                i58 = i8;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i61 = (charAt16 * 2) + charAt17;
            int i62 = charAt20;
            i2 = charAt18;
            i3 = i62;
            i4 = charAt16;
            i34 = i58;
            iArr = iArr2;
            i5 = charAt19;
            i6 = i61;
            i7 = charAt22;
        }
        Unsafe unsafe = o;
        Object[] objArr2 = ejnVar.c;
        Class<?> cls = ejnVar.a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr3 = new Object[charAt * 2];
        int i63 = i7 + i3;
        int i64 = i63;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int charAt23 = str2.charAt(i34);
            int i69 = length;
            if (charAt23 >= 55296) {
                int i70 = charAt23 & 8191;
                int i71 = i68;
                int i72 = 13;
                while (true) {
                    i31 = i71 + 1;
                    charAt13 = str2.charAt(i71);
                    objArr = objArr2;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i70 |= (charAt13 & 8191) << i72;
                    i72 += 13;
                    i71 = i31;
                    objArr2 = objArr;
                }
                charAt23 = i70 | (charAt13 << i72);
                i16 = i31;
            } else {
                objArr = objArr2;
                i16 = i68;
            }
            int i73 = i16 + 1;
            int charAt24 = str2.charAt(i16);
            if (charAt24 >= 55296) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i29 = i75 + 1;
                    charAt12 = str2.charAt(i75);
                    i30 = i74;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i74 = i30 | ((charAt12 & 8191) << i76);
                    i76 += 13;
                    i75 = i29;
                }
                charAt24 = i30 | (charAt12 << i76);
                i17 = i29;
            } else {
                i17 = i73;
            }
            int i77 = charAt23;
            int i78 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int[] iArr4 = iArr3;
            if ((charAt24 & 1024) != 0) {
                iArr[i67] = i66;
                i67++;
            }
            int i79 = i4;
            if (i78 >= 51) {
                int i80 = i17 + 1;
                int charAt25 = str2.charAt(i17);
                char c = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        charAt11 = str2.charAt(i80);
                        if (charAt11 < c) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i82;
                        i82 += 13;
                        i80 = i28;
                        c = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i82);
                    i80 = i28;
                }
                int i83 = i78 - 51;
                int i84 = charAt25;
                if (i83 == 9 || i83 == 17) {
                    i27 = i80;
                    objArr3[hrg.B(i66, 3, 2, 1)] = objArr[i6];
                    i6++;
                } else {
                    if (i83 == 12 && (ouj.a(ejnVar.a(), 1) || (charAt24 & 2048) != 0)) {
                        i27 = i80;
                        objArr3[hrg.B(i66, 3, 2, 1)] = objArr[i6];
                        i6++;
                    }
                    i27 = i80;
                }
                int i85 = i84 * 2;
                Object obj = objArr[i85];
                if (obj instanceof Field) {
                    F2 = (Field) obj;
                } else {
                    F2 = F((String) obj, cls);
                    objArr[i85] = F2;
                }
                int i86 = i63;
                i20 = i6;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F2);
                int i87 = i85 + 1;
                Object obj2 = objArr[i87];
                if (obj2 instanceof Field) {
                    F3 = (Field) obj2;
                } else {
                    F3 = F((String) obj2, cls);
                    objArr[i87] = F3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F3);
                str = str2;
                objectFieldOffset = objectFieldOffset2;
                i21 = i66;
                i23 = i27;
                i22 = objectFieldOffset3;
                i18 = i86;
                i24 = 0;
            } else {
                int i88 = i63;
                int i89 = i6 + 1;
                Field F4 = F((String) objArr[i6], cls);
                if (i78 == 9 || i78 == 17) {
                    i18 = i88;
                    objArr3[hrg.B(i66, 3, 2, 1)] = F4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i18 = i88;
                        i26 = i6 + 2;
                        objArr3[hrg.B(i66, 3, 2, 1)] = objArr[i89];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i18 = i88;
                        if (ejnVar.a() == 1 || (charAt24 & 2048) != 0) {
                            i26 = i6 + 2;
                            objArr3[hrg.B(i66, 3, 2, 1)] = objArr[i89];
                        }
                    } else if (i78 == 50) {
                        int i90 = i65 + 1;
                        iArr[i65] = i66;
                        int i91 = (i66 / 3) * 2;
                        int i92 = i6 + 2;
                        objArr3[i91] = objArr[i89];
                        if ((charAt24 & 2048) != 0) {
                            i19 = i6 + 3;
                            objArr3[i91 + 1] = objArr[i92];
                            i18 = i88;
                            i65 = i90;
                        } else {
                            i19 = i92;
                            i65 = i90;
                            i18 = i88;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                        if ((charAt24 & 4096) != 0 || i78 > 17) {
                            str = str2;
                            i20 = i19;
                            i21 = i66;
                            i22 = 1048575;
                            i23 = i17;
                            i24 = 0;
                        } else {
                            i23 = i17 + 1;
                            int charAt26 = str2.charAt(i17);
                            if (charAt26 >= 55296) {
                                int i93 = charAt26 & 8191;
                                int i94 = 13;
                                while (true) {
                                    i25 = i23 + 1;
                                    charAt10 = str2.charAt(i23);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i93 |= (charAt10 & 8191) << i94;
                                    i94 += 13;
                                    i23 = i25;
                                }
                                charAt26 = i93 | (charAt10 << i94);
                                i23 = i25;
                            }
                            int i95 = (charAt26 / 32) + (i79 * 2);
                            Object obj3 = objArr[i95];
                            str = str2;
                            if (obj3 instanceof Field) {
                                F = (Field) obj3;
                            } else {
                                F = F((String) obj3, cls);
                                objArr[i95] = F;
                            }
                            i20 = i19;
                            i21 = i66;
                            i22 = (int) unsafe.objectFieldOffset(F);
                            i24 = charAt26 % 32;
                        }
                        if (i78 >= 18 && i78 <= 49) {
                            iArr[i64] = objectFieldOffset;
                            i64++;
                        }
                    } else {
                        i18 = i88;
                    }
                    i19 = i26;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    str = str2;
                    i20 = i19;
                    i21 = i66;
                    i22 = 1048575;
                    i23 = i17;
                    i24 = 0;
                    if (i78 >= 18) {
                        iArr[i64] = objectFieldOffset;
                        i64++;
                    }
                }
                i19 = i89;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                if ((charAt24 & 4096) != 0) {
                }
                str = str2;
                i20 = i19;
                i21 = i66;
                i22 = 1048575;
                i23 = i17;
                i24 = 0;
                if (i78 >= 18) {
                }
            }
            int i96 = i21 + 1;
            iArr4[i21] = i77;
            int i97 = i21 + 2;
            int i98 = i21;
            iArr4[i96] = ((charAt24 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i66 = i98 + 3;
            iArr4[i97] = (i24 << 20) | i22;
            i34 = i23;
            length = i69;
            iArr3 = iArr4;
            objArr2 = objArr;
            i63 = i18;
            i6 = i20;
            i4 = i79;
            str2 = str;
        }
        return new d(iArr3, objArr3, i2, i5, ejnVar.a, iArr, i7, i63, c4jVar, w8gVar, gVar, d1cVar, v9hVar);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) emt.c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) emt.c.h(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
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
        return -1;
    }

    public final void B(Object obj, long j, n8n n8nVar, xto xtoVar, x0c x0cVar) {
        int A;
        this.k.getClass();
        sse a = w8g.a(j, obj);
        rr4 rr4Var = (rr4) n8nVar.e;
        int i = n8nVar.b;
        if ((i & 7) != 3) {
            throw cye.b();
        }
        do {
            b c = xtoVar.c();
            n8nVar.n(c, xtoVar, x0cVar);
            xtoVar.a(c);
            a.add(c);
            if (rr4Var.e() || n8nVar.d != 0) {
                return;
            } else {
                A = rr4Var.A();
            }
        } while (A == i);
        n8nVar.d = A;
    }

    public final void C(Object obj, int i, n8n n8nVar, xto xtoVar, x0c x0cVar) {
        int A;
        this.k.getClass();
        sse a = w8g.a(i & 1048575, obj);
        rr4 rr4Var = (rr4) n8nVar.e;
        int i2 = n8nVar.b;
        if ((i2 & 7) != 2) {
            throw cye.b();
        }
        do {
            b c = xtoVar.c();
            n8nVar.p(c, xtoVar, x0cVar);
            xtoVar.a(c);
            a.add(c);
            if (rr4Var.e() || n8nVar.d != 0) {
                return;
            } else {
                A = rr4Var.A();
            }
        } while (A == i2);
        n8nVar.d = A;
    }

    public final void D(int i, n8n n8nVar, Object obj) {
        if ((536870912 & i) != 0) {
            n8nVar.C0(2);
            emt.o(i & 1048575, obj, ((rr4) n8nVar.e).z());
        } else if (!this.f) {
            emt.o(i & 1048575, obj, n8nVar.w());
        } else {
            n8nVar.C0(2);
            emt.o(i & 1048575, obj, ((rr4) n8nVar.e).y());
        }
    }

    public final void E(int i, n8n n8nVar, Object obj) {
        boolean z = (536870912 & i) != 0;
        w8g w8gVar = this.k;
        if (z) {
            w8gVar.getClass();
            n8nVar.p0(w8g.a(i & 1048575, obj), true);
        } else {
            w8gVar.getClass();
            n8nVar.p0(w8g.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        emt.m(j, obj, (1 << (i2 >>> 20)) | emt.c.f(j, obj));
    }

    public final void H(int i, int i2, Object obj) {
        emt.m(this.a[i2 + 2] & 1048575, obj, i);
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
    public final void M(Object obj, jzi jziVar) {
        int i;
        int i2;
        boolean z;
        d dVar = this;
        int[] iArr = dVar.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int L = dVar.L(i5);
            int i7 = iArr[i5];
            int K = K(L);
            if (K <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = L;
                i2 = 1 << (i8 >>> 20);
            } else {
                i = L;
                i2 = 0;
            }
            long j = i & i3;
            switch (K) {
                case 0:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        double d = emt.c.d(j, obj);
                        xr4 xr4Var = (xr4) jziVar.a;
                        xr4Var.getClass();
                        xr4Var.r(i7, Double.doubleToRawLongBits(d));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 1:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        float e = emt.c.e(j, obj);
                        xr4 xr4Var2 = (xr4) jziVar.a;
                        xr4Var2.getClass();
                        xr4Var2.p(i7, Float.floatToRawIntBits(e));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 2:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).B(i7, unsafe.getLong(obj, j));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 3:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).B(i7, unsafe.getLong(obj, j));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 4:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).t(i7, unsafe.getInt(obj, j));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 5:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).r(i7, unsafe.getLong(obj, j));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 6:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).p(i7, unsafe.getInt(obj, j));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 7:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).n(i7, emt.c.c(j, obj));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 8:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((xr4) jziVar.a).x(i7, (String) object);
                        } else {
                            ((xr4) jziVar.a).o(i7, (qn3) object);
                        }
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 9:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).w(i7, (a) unsafe.getObject(obj, j), dVar.m(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 10:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).o(i7, (qn3) unsafe.getObject(obj, j));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 11:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).z(i7, unsafe.getInt(obj, j));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 12:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).t(i7, unsafe.getInt(obj, j));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 13:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).p(i7, unsafe.getInt(obj, j));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 14:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        ((xr4) jziVar.a).r(i7, unsafe.getLong(obj, j));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 15:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((xr4) jziVar.a).z(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 16:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((xr4) jziVar.a).B(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    dVar = this;
                    i5 += 3;
                    i3 = 1048575;
                case 17:
                    if (dVar.o(obj, i5, i4, i6, i2)) {
                        jziVar.K(i7, unsafe.getObject(obj, j), dVar.m(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 18:
                    f.n(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 19:
                    f.r(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 20:
                    f.t(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 21:
                    f.z(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 22:
                    f.s(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 23:
                    f.q(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 24:
                    f.p(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 25:
                    f.m(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 26:
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = f.a;
                    if (list != null && !list.isEmpty()) {
                        xr4 xr4Var3 = (xr4) jziVar.a;
                        if (list instanceof xvf) {
                            xvf xvfVar = (xvf) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object h = xvfVar.h();
                                if (h instanceof String) {
                                    xr4Var3.x(i11, (String) h);
                                } else {
                                    xr4Var3.o(i11, (qn3) h);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                xr4Var3.x(i11, (String) list.get(i13));
                            }
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    int i14 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    xto m = dVar.m(i5);
                    Class cls2 = f.a;
                    if (list2 != null && !list2.isEmpty()) {
                        jziVar.getClass();
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ((xr4) jziVar.a).w(i14, (a) list2.get(i15), m);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    int i16 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = f.a;
                    if (list3 != null && !list3.isEmpty()) {
                        jziVar.getClass();
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            ((xr4) jziVar.a).o(i16, (qn3) list3.get(i17));
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    z = false;
                    f.y(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 30:
                    z = false;
                    f.o(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    z = false;
                    f.u(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 32:
                    z = false;
                    f.v(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    z = false;
                    f.w(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    z = false;
                    f.x(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, false);
                    i5 += 3;
                    i3 = 1048575;
                case 35:
                    f.n(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    f.r(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case 37:
                    f.t(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case 38:
                    f.z(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case 39:
                    f.s(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case 40:
                    f.q(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case 41:
                    f.p(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case 42:
                    f.m(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    f.y(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    f.o(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    f.u(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    f.v(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    f.w(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    f.x(iArr[i5], (List) unsafe.getObject(obj, j), jziVar, true);
                    i5 += 3;
                    i3 = 1048575;
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    int i18 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    xto m2 = dVar.m(i5);
                    Class cls4 = f.a;
                    if (list4 != null && !list4.isEmpty()) {
                        jziVar.getClass();
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            jziVar.K(i18, list4.get(i19), m2);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object obj2 = dVar.b[(i5 / 3) * 2];
                        dVar.m.getClass();
                        eta.q(obj2);
                        throw null;
                    }
                    i5 += 3;
                    i3 = 1048575;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (dVar.q(i7, i5, obj)) {
                        double doubleValue = ((Double) emt.c.h(j, obj)).doubleValue();
                        xr4 xr4Var4 = (xr4) jziVar.a;
                        xr4Var4.getClass();
                        xr4Var4.r(i7, Double.doubleToRawLongBits(doubleValue));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (dVar.q(i7, i5, obj)) {
                        float floatValue = ((Float) emt.c.h(j, obj)).floatValue();
                        xr4 xr4Var5 = (xr4) jziVar.a;
                        xr4Var5.getClass();
                        xr4Var5.p(i7, Float.floatToRawIntBits(floatValue));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).B(i7, z(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).B(i7, z(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).t(i7, y(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).r(i7, z(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).p(i7, y(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 58:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).n(i7, ((Boolean) emt.c.h(j, obj)).booleanValue());
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 59:
                    if (dVar.q(i7, i5, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((xr4) jziVar.a).x(i7, (String) object2);
                        } else {
                            ((xr4) jziVar.a).o(i7, (qn3) object2);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).w(i7, (a) unsafe.getObject(obj, j), dVar.m(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 61:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).o(i7, (qn3) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 62:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).z(i7, y(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 63:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).t(i7, y(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).p(i7, y(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 65:
                    if (dVar.q(i7, i5, obj)) {
                        ((xr4) jziVar.a).r(i7, z(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 66:
                    if (dVar.q(i7, i5, obj)) {
                        int y = y(j, obj);
                        ((xr4) jziVar.a).z(i7, (y >> 31) ^ (y << 1));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 67:
                    if (dVar.q(i7, i5, obj)) {
                        long z2 = z(j, obj);
                        ((xr4) jziVar.a).B(i7, (z2 << 1) ^ (z2 >> 63));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 68:
                    if (dVar.q(i7, i5, obj)) {
                        jziVar.K(i7, unsafe.getObject(obj, j), dVar.m(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                default:
                    i5 += 3;
                    i3 = 1048575;
            }
        }
        dVar.l.getClass();
        ((b) obj).unknownFields.d(jziVar);
    }

    @Override // defpackage.xto
    public final void a(Object obj) {
        if (p(obj)) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                bVar.j(Integer.MAX_VALUE);
                bVar.memoizedHashCode = 0;
                bVar.g();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int L = L(i);
                long j = 1048575 & L;
                int K = K(L);
                if (K != 9) {
                    if (K != 60 && K != 68) {
                        switch (K) {
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
                                this.k.getClass();
                                v8 v8Var = (v8) ((sse) emt.c.h(j, obj));
                                if (v8Var.a) {
                                    v8Var.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((p9h) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).a(o.getObject(obj, j));
                    }
                }
                if (n(i, obj)) {
                    m(i).a(o.getObject(obj, j));
                }
            }
            this.l.getClass();
            mkt mktVar = ((b) obj).unknownFields;
            if (mktVar.e) {
                mktVar.e = false;
            }
        }
    }

    @Override // defpackage.xto
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int L = L(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & L) == 0 || o(obj, i2, i, i3, i11)) {
                int K = K(L);
                if (K == 9 || K == 17) {
                    if (o(obj, i2, i, i3, i11)) {
                        if (!m(i2).b(emt.c.h(L & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (K != 27) {
                        if (K == 60 || K == 68) {
                            if (q(i8, i2, obj)) {
                                if (!m(i2).b(emt.c.h(L & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (K != 49) {
                            if (K != 50) {
                                continue;
                            } else {
                                Object h = emt.c.h(L & 1048575, obj);
                                this.m.getClass();
                                if (!((p9h) h).isEmpty()) {
                                    eta.q(this.b[(i2 / 3) * 2]);
                                    throw null;
                                }
                            }
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
                    }
                    List list = (List) emt.c.h(L & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        xto m = m(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (m.b(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.xto
    public final b c() {
        this.j.getClass();
        return ((b) this.e).h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.xto
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            xq0.x(hrg.n(obj, "Mutating immutable message: "));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                f.k(this.l, obj, obj2);
                return;
            }
            int L = L(i);
            long j = 1048575 & L;
            int i2 = iArr[i];
            switch (K(L)) {
                case 0:
                    if (n(i, obj2)) {
                        bmt bmtVar = emt.c;
                        obj3 = obj;
                        bmtVar.l(obj3, j, bmtVar.d(j, obj2));
                        G(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i, obj2)) {
                        bmt bmtVar2 = emt.c;
                        bmtVar2.m(obj, j, bmtVar2.e(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        emt.n(obj, j, emt.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        emt.n(obj, j, emt.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        emt.m(j, obj, emt.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        emt.n(obj, j, emt.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        emt.m(j, obj, emt.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        bmt bmtVar3 = emt.c;
                        bmtVar3.j(obj, j, bmtVar3.c(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        emt.o(j, obj, emt.c.h(j, obj2));
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
                        emt.o(j, obj, emt.c.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        emt.m(j, obj, emt.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        emt.m(j, obj, emt.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        emt.m(j, obj, emt.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        emt.n(obj, j, emt.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        emt.m(j, obj, emt.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        emt.n(obj, j, emt.c.g(j, obj2));
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
                    this.k.getClass();
                    bmt bmtVar4 = emt.c;
                    sse sseVar = (sse) bmtVar4.h(j, obj);
                    sse sseVar2 = (sse) bmtVar4.h(j, obj2);
                    int size = sseVar.size();
                    int size2 = sseVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((v8) sseVar).a) {
                            sseVar = ((czm) sseVar).m(size2 + size);
                        }
                        sseVar.addAll(sseVar2);
                    }
                    if (size > 0) {
                        sseVar2 = sseVar;
                    }
                    emt.o(j, obj, sseVar2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = f.a;
                    bmt bmtVar5 = emt.c;
                    Object h = bmtVar5.h(j, obj);
                    Object h2 = bmtVar5.h(j, obj2);
                    this.m.getClass();
                    emt.o(j, obj, v9h.a(h, h2));
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
                    if (q(i2, i, obj2)) {
                        emt.o(j, obj, emt.c.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case SQLiteDatabase.OPEN_URI /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, obj2)) {
                        emt.o(j, obj, emt.c.h(j, obj2));
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.xto
    public final void e(java.lang.Object r21, defpackage.n8n r22, defpackage.x0c r23) {
        /*
            Method dump skipped, instructions count: 2026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.protobuf.d.e(java.lang.Object, n8n, x0c):void");
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
    @Override // defpackage.xto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(b bVar) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int L = L(i4);
            int i5 = iArr[i4];
            long j = 1048575 & L;
            int i6 = 1237;
            int i7 = 37;
            switch (K(L)) {
                case 0:
                    i = i3 * 53;
                    b = vse.b(Double.doubleToLongBits(emt.c.d(j, bVar)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(emt.c.e(j, bVar));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = vse.b(emt.c.g(j, bVar));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = vse.b(emt.c.g(j, bVar));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = emt.c.f(j, bVar);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = vse.b(emt.c.g(j, bVar));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = emt.c.f(j, bVar);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean c = emt.c.c(j, bVar);
                    Charset charset = vse.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) emt.c.h(j, bVar)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object h = emt.c.h(j, bVar);
                    if (h != null) {
                        i7 = h.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = emt.c.h(j, bVar).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = emt.c.f(j, bVar);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = emt.c.f(j, bVar);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = emt.c.f(j, bVar);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = vse.b(emt.c.g(j, bVar));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = emt.c.f(j, bVar);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = vse.b(emt.c.g(j, bVar));
                    i3 = b + i;
                    break;
                case 17:
                    Object h2 = emt.c.h(j, bVar);
                    if (h2 != null) {
                        i7 = h2.hashCode();
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
                    b = emt.c.h(j, bVar).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = emt.c.h(j, bVar).hashCode();
                    i3 = b + i;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = vse.b(Double.doubleToLongBits(((Double) emt.c.h(j, bVar)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) emt.c.h(j, bVar)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = vse.b(z(j, bVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = vse.b(z(j, bVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = y(j, bVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = vse.b(z(j, bVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = y(j, bVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i5, i4, bVar)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) emt.c.h(j, bVar)).booleanValue();
                        Charset charset2 = vse.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = ((String) emt.c.h(j, bVar)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = emt.c.h(j, bVar).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = emt.c.h(j, bVar).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = y(j, bVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = y(j, bVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = y(j, bVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = vse.b(z(j, bVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = y(j, bVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = vse.b(z(j, bVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i5, i4, bVar)) {
                        i = i3 * 53;
                        b = emt.c.h(j, bVar).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return bVar.unknownFields.hashCode() + (i3 * 53);
    }

    @Override // defpackage.xto
    public final int g(b bVar) {
        int i;
        int h;
        int h2;
        int h3;
        int j;
        int h4;
        int j2;
        int h5;
        int h6;
        int h7;
        int a;
        int i2;
        int f;
        int h8;
        int a2;
        int c;
        int h9;
        int size;
        int i3;
        int h10;
        int h11;
        int size2;
        int h12;
        int i4;
        int i5;
        int h13;
        int h14;
        int j3;
        int h15;
        int j4;
        int i6;
        d dVar = this;
        b bVar2 = bVar;
        Unsafe unsafe = o;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (true) {
            int[] iArr = dVar.a;
            if (i7 >= iArr.length) {
                dVar.l.getClass();
                return bVar2.unknownFields.b() + i9;
            }
            int L = dVar.L(i7);
            int K = K(L);
            int i11 = iArr[i7];
            int i12 = iArr[i7 + 2];
            int i13 = i12 & 1048575;
            if (K <= 17) {
                if (i13 != i10) {
                    i8 = i13 == 1048575 ? 0 : unsafe.getInt(bVar2, i13);
                    i10 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            long j5 = L & 1048575;
            if (K >= h9c.b.a) {
                int i14 = h9c.c.a;
            }
            switch (K) {
                case 0:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        h = xr4.h(i11);
                        c = h + 8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 1:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        h2 = xr4.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    dVar = this;
                    bVar2 = bVar;
                    i7 += 3;
                case 2:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        long j6 = unsafe.getLong(bVar2, j5);
                        h3 = xr4.h(i11);
                        j = xr4.j(j6);
                        i9 += j + h3;
                    }
                    dVar = this;
                    i7 += 3;
                case 3:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        long j7 = unsafe.getLong(bVar2, j5);
                        h3 = xr4.h(i11);
                        j = xr4.j(j7);
                        i9 += j + h3;
                    }
                    dVar = this;
                    i7 += 3;
                case 4:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        int i15 = unsafe.getInt(bVar2, j5);
                        h4 = xr4.h(i11);
                        j2 = xr4.j(i15);
                        f = j2 + h4;
                        i9 += f;
                    }
                    dVar = this;
                    i7 += 3;
                case 5:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        h5 = xr4.h(i11);
                        h6 = h5 + 8;
                        i9 += h6;
                    }
                    dVar = this;
                    bVar2 = bVar;
                    i7 += 3;
                case 6:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        h2 = xr4.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    dVar = this;
                    bVar2 = bVar;
                    i7 += 3;
                case 7:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        h6 = xr4.h(i11) + 1;
                        i9 += h6;
                    }
                    dVar = this;
                    bVar2 = bVar;
                    i7 += 3;
                case 8:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        Object object = unsafe.getObject(bVar2, j5);
                        i9 = (object instanceof qn3 ? xr4.f(i11, (qn3) object) : xr4.g((String) object) + xr4.h(i11)) + i9;
                    }
                    dVar = this;
                    i7 += 3;
                case 9:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        Object object2 = unsafe.getObject(bVar2, j5);
                        xto m = dVar.m(i7);
                        Class cls = f.a;
                        h7 = xr4.h(i11);
                        a = ((a) object2).a(m);
                        i2 = xr4.i(a);
                        i6 = i2 + a + h7;
                        i9 += i6;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 10:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        f = xr4.f(i11, (qn3) unsafe.getObject(bVar2, j5));
                        i9 += f;
                    }
                    dVar = this;
                    i7 += 3;
                case 11:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        int i16 = unsafe.getInt(bVar2, j5);
                        h4 = xr4.h(i11);
                        j2 = xr4.i(i16);
                        f = j2 + h4;
                        i9 += f;
                    }
                    dVar = this;
                    i7 += 3;
                case 12:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        int i17 = unsafe.getInt(bVar2, j5);
                        h4 = xr4.h(i11);
                        j2 = xr4.j(i17);
                        f = j2 + h4;
                        i9 += f;
                    }
                    dVar = this;
                    i7 += 3;
                case 13:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        h2 = xr4.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    dVar = this;
                    bVar2 = bVar;
                    i7 += 3;
                case 14:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        h5 = xr4.h(i11);
                        h6 = h5 + 8;
                        i9 += h6;
                    }
                    dVar = this;
                    bVar2 = bVar;
                    i7 += 3;
                case 15:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        int i18 = unsafe.getInt(bVar2, j5);
                        h4 = xr4.h(i11);
                        j2 = xr4.i((i18 >> 31) ^ (i18 << 1));
                        f = j2 + h4;
                        i9 += f;
                    }
                    dVar = this;
                    i7 += 3;
                case 16:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        long j8 = unsafe.getLong(bVar2, j5);
                        h3 = xr4.h(i11);
                        j = xr4.j((j8 << 1) ^ (j8 >> 63));
                        i9 += j + h3;
                    }
                    dVar = this;
                    i7 += 3;
                case 17:
                    if (dVar.o(bVar2, i7, i10, i8, i)) {
                        a aVar = (a) unsafe.getObject(bVar2, j5);
                        xto m2 = dVar.m(i7);
                        h8 = xr4.h(i11) * 2;
                        a2 = aVar.a(m2);
                        c = a2 + h8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 18:
                    c = f.c((List) unsafe.getObject(bVar2, j5), i11);
                    i9 += c;
                    i7 += 3;
                case 19:
                    c = f.b((List) unsafe.getObject(bVar2, j5), i11);
                    i9 += c;
                    i7 += 3;
                case 20:
                    List list = (List) unsafe.getObject(bVar2, j5);
                    Class cls2 = f.a;
                    if (list.size() != 0) {
                        h9 = (xr4.h(i11) * list.size()) + f.e(list);
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 21:
                    List list2 = (List) unsafe.getObject(bVar2, j5);
                    Class cls3 = f.a;
                    size = list2.size();
                    if (size != 0) {
                        i3 = f.i(list2);
                        h10 = xr4.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 22:
                    List list3 = (List) unsafe.getObject(bVar2, j5);
                    Class cls4 = f.a;
                    size = list3.size();
                    if (size != 0) {
                        i3 = f.d(list3);
                        h10 = xr4.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 23:
                    c = f.c((List) unsafe.getObject(bVar2, j5), i11);
                    i9 += c;
                    i7 += 3;
                case 24:
                    c = f.b((List) unsafe.getObject(bVar2, j5), i11);
                    i9 += c;
                    i7 += 3;
                case 25:
                    List list4 = (List) unsafe.getObject(bVar2, j5);
                    Class cls5 = f.a;
                    int size3 = list4.size();
                    i9 += size3 == 0 ? 0 : (xr4.h(i11) + 1) * size3;
                    i7 += 3;
                case 26:
                    List list5 = (List) unsafe.getObject(bVar2, j5);
                    Class cls6 = f.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        h9 = xr4.h(i11) * size4;
                        if (list5 instanceof xvf) {
                            xvf xvfVar = (xvf) list5;
                            for (int i19 = 0; i19 < size4; i19++) {
                                Object h16 = xvfVar.h();
                                if (h16 instanceof qn3) {
                                    int size5 = ((qn3) h16).size();
                                    h9 = xr4.i(size5) + size5 + h9;
                                } else {
                                    h9 = xr4.g((String) h16) + h9;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size4; i20++) {
                                Object obj = list5.get(i20);
                                if (obj instanceof qn3) {
                                    int size6 = ((qn3) obj).size();
                                    h9 = xr4.i(size6) + size6 + h9;
                                } else {
                                    h9 = xr4.g((String) obj) + h9;
                                }
                            }
                        }
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 27:
                    List list6 = (List) unsafe.getObject(bVar2, j5);
                    xto m3 = dVar.m(i7);
                    Class cls7 = f.a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        h11 = 0;
                    } else {
                        h11 = xr4.h(i11) * size7;
                        for (int i21 = 0; i21 < size7; i21++) {
                            int a3 = ((a) list6.get(i21)).a(m3);
                            h11 += xr4.i(a3) + a3;
                        }
                    }
                    i9 += h11;
                    i7 += 3;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    List list7 = (List) unsafe.getObject(bVar2, j5);
                    Class cls8 = f.a;
                    int size8 = list7.size();
                    if (size8 != 0) {
                        h9 = xr4.h(i11) * size8;
                        for (int i22 = 0; i22 < list7.size(); i22++) {
                            int size9 = ((qn3) list7.get(i22)).size();
                            h9 += xr4.i(size9) + size9;
                        }
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 29:
                    List list8 = (List) unsafe.getObject(bVar2, j5);
                    Class cls9 = f.a;
                    size = list8.size();
                    if (size != 0) {
                        i3 = f.h(list8);
                        h10 = xr4.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 30:
                    List list9 = (List) unsafe.getObject(bVar2, j5);
                    Class cls10 = f.a;
                    size = list9.size();
                    if (size != 0) {
                        i3 = f.a(list9);
                        h10 = xr4.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    c = f.b((List) unsafe.getObject(bVar2, j5), i11);
                    i9 += c;
                    i7 += 3;
                case 32:
                    c = f.c((List) unsafe.getObject(bVar2, j5), i11);
                    i9 += c;
                    i7 += 3;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    List list10 = (List) unsafe.getObject(bVar2, j5);
                    Class cls11 = f.a;
                    size = list10.size();
                    if (size != 0) {
                        i3 = f.f(list10);
                        h10 = xr4.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(bVar2, j5);
                    Class cls12 = f.a;
                    size = list11.size();
                    if (size != 0) {
                        i3 = f.g(list11);
                        h10 = xr4.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 35:
                    List list12 = (List) unsafe.getObject(bVar2, j5);
                    Class cls13 = f.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(bVar2, j5);
                    Class cls14 = f.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 37:
                    size2 = f.e((List) unsafe.getObject(bVar2, j5));
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 38:
                    size2 = f.i((List) unsafe.getObject(bVar2, j5));
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 39:
                    size2 = f.d((List) unsafe.getObject(bVar2, j5));
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(bVar2, j5);
                    Class cls15 = f.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(bVar2, j5);
                    Class cls16 = f.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(bVar2, j5);
                    Class cls17 = f.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    size2 = f.h((List) unsafe.getObject(bVar2, j5));
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    size2 = f.a((List) unsafe.getObject(bVar2, j5));
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(bVar2, j5);
                    Class cls18 = f.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    List list18 = (List) unsafe.getObject(bVar2, j5);
                    Class cls19 = f.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    size2 = f.f((List) unsafe.getObject(bVar2, j5));
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    size2 = f.g((List) unsafe.getObject(bVar2, j5));
                    if (size2 > 0) {
                        h12 = xr4.h(i11);
                        i4 = xr4.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    List list19 = (List) unsafe.getObject(bVar2, j5);
                    xto m4 = dVar.m(i7);
                    Class cls20 = f.a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i23 = 0; i23 < size10; i23++) {
                            i5 += ((a) list19.get(i23)).a(m4) + (xr4.h(i11) * 2);
                        }
                    }
                    i9 += i5;
                    i7 += 3;
                case 50:
                    Object object3 = unsafe.getObject(bVar2, j5);
                    Object obj2 = dVar.b[(i7 / 3) * 2];
                    dVar.m.getClass();
                    p9h p9hVar = (p9h) object3;
                    if (obj2 != null) {
                        l1j.f();
                        return 0;
                    }
                    if (p9hVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = p9hVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (dVar.q(i11, i7, bVar2)) {
                        h = xr4.h(i11);
                        c = h + 8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (dVar.q(i11, i7, bVar2)) {
                        h13 = xr4.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (dVar.q(i11, i7, bVar2)) {
                        long z = z(j5, bVar2);
                        h14 = xr4.h(i11);
                        j3 = xr4.j(z);
                        i6 = j3 + h14;
                        i9 += i6;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (dVar.q(i11, i7, bVar2)) {
                        long z2 = z(j5, bVar2);
                        h14 = xr4.h(i11);
                        j3 = xr4.j(z2);
                        i6 = j3 + h14;
                        i9 += i6;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (dVar.q(i11, i7, bVar2)) {
                        int y = y(j5, bVar2);
                        h15 = xr4.h(i11);
                        j4 = xr4.j(y);
                        c = j4 + h15;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (dVar.q(i11, i7, bVar2)) {
                        h = xr4.h(i11);
                        c = h + 8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (dVar.q(i11, i7, bVar2)) {
                        h13 = xr4.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 58:
                    if (dVar.q(i11, i7, bVar2)) {
                        c = xr4.h(i11) + 1;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 59:
                    if (dVar.q(i11, i7, bVar2)) {
                        Object object4 = unsafe.getObject(bVar2, j5);
                        i9 = (object4 instanceof qn3 ? xr4.f(i11, (qn3) object4) : xr4.g((String) object4) + xr4.h(i11)) + i9;
                    }
                    i7 += 3;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (dVar.q(i11, i7, bVar2)) {
                        Object object5 = unsafe.getObject(bVar2, j5);
                        xto m5 = dVar.m(i7);
                        Class cls21 = f.a;
                        h7 = xr4.h(i11);
                        a = ((a) object5).a(m5);
                        i2 = xr4.i(a);
                        i6 = i2 + a + h7;
                        i9 += i6;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 61:
                    if (dVar.q(i11, i7, bVar2)) {
                        c = xr4.f(i11, (qn3) unsafe.getObject(bVar2, j5));
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 62:
                    if (dVar.q(i11, i7, bVar2)) {
                        int y2 = y(j5, bVar2);
                        h15 = xr4.h(i11);
                        j4 = xr4.i(y2);
                        c = j4 + h15;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 63:
                    if (dVar.q(i11, i7, bVar2)) {
                        int y3 = y(j5, bVar2);
                        h15 = xr4.h(i11);
                        j4 = xr4.j(y3);
                        c = j4 + h15;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (dVar.q(i11, i7, bVar2)) {
                        h13 = xr4.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 65:
                    if (dVar.q(i11, i7, bVar2)) {
                        h = xr4.h(i11);
                        c = h + 8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 66:
                    if (dVar.q(i11, i7, bVar2)) {
                        int y4 = y(j5, bVar2);
                        h15 = xr4.h(i11);
                        j4 = xr4.i((y4 >> 31) ^ (y4 << 1));
                        c = j4 + h15;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 67:
                    if (dVar.q(i11, i7, bVar2)) {
                        long z3 = z(j5, bVar2);
                        h14 = xr4.h(i11);
                        j3 = xr4.j((z3 << 1) ^ (z3 >> 63));
                        i6 = j3 + h14;
                        i9 += i6;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 68:
                    if (dVar.q(i11, i7, bVar2)) {
                        a aVar2 = (a) unsafe.getObject(bVar2, j5);
                        xto m6 = dVar.m(i7);
                        h8 = xr4.h(i11) * 2;
                        a2 = aVar2.a(m6);
                        c = a2 + h8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                default:
                    i7 += 3;
            }
        }
    }

    @Override // defpackage.xto
    public final void h(Object obj, jzi jziVar) {
        jziVar.getClass();
        M(obj, jziVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.glance.appwidget.protobuf.f.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.glance.appwidget.protobuf.f.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.glance.appwidget.protobuf.f.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.glance.appwidget.protobuf.f.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.glance.appwidget.protobuf.f.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.xto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(b bVar, b bVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int L = L(i);
                long j = L & 1048575;
                switch (K(L)) {
                    case 0:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar2 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar3 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar4 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar5 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar6 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar7 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar8 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar9 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar10 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar11 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar12 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar13 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar14 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar15 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar16 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar17 = emt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (j(bVar, bVar2, i)) {
                            bmt bmtVar18 = emt.c;
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
                        bmt bmtVar19 = emt.c;
                        z = f.l(bmtVar19.h(j, bVar), bmtVar19.h(j, bVar2));
                        break;
                    case 50:
                        bmt bmtVar20 = emt.c;
                        z = f.l(bmtVar20.h(j, bVar), bmtVar20.h(j, bVar2));
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
                        bmt bmtVar21 = emt.c;
                        if (bmtVar21.f(j2, bVar) == bmtVar21.f(j2, bVar2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (bVar.unknownFields.equals(bVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j(b bVar, b bVar2, int i) {
        return n(i, bVar) == n(i, bVar2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (emt.c.h(L(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[hrg.B(i, 3, 2, 1)] == null) {
            return;
        }
        l1j.f();
    }

    public final xto m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        xto xtoVar = (xto) objArr[i2];
        if (xtoVar != null) {
            return xtoVar;
        }
        xto a = zym.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int L = L(i);
            long j2 = L & 1048575;
            switch (K(L)) {
                case 0:
                    if (Double.doubleToRawLongBits(emt.c.d(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(emt.c.e(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (emt.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (emt.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (emt.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (emt.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (emt.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return emt.c.c(j2, obj);
                case 8:
                    Object h = emt.c.h(j2, obj);
                    if (h instanceof String) {
                        return !((String) h).isEmpty();
                    }
                    if (h instanceof qn3) {
                        return !qn3.b.equals(h);
                    }
                    e7o.e();
                    return false;
                case 9:
                    if (emt.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !qn3.b.equals(emt.c.h(j2, obj));
                case 11:
                    if (emt.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (emt.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (emt.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (emt.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (emt.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (emt.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (emt.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    e7o.e();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & emt.c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? n(i, obj) : (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return emt.c.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void r(int i, Object obj, Object obj2) {
        long L = L(i) & 1048575;
        Object h = emt.c.h(L, obj);
        v9h v9hVar = this.m;
        if (h != null) {
            v9hVar.getClass();
            if (!((p9h) h).a) {
                p9h d = p9h.b.d();
                v9h.a(d, h);
                emt.o(L, obj, d);
                h = d;
            }
        } else {
            v9hVar.getClass();
            h = p9h.b.d();
            emt.o(L, obj, h);
        }
        v9hVar.getClass();
        eta.q(obj2);
        throw null;
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long L = L(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                tuh.b(this.a[i], obj2);
                return;
            }
            xto m = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    b c = m.c();
                    m.d(c, object);
                    unsafe.putObject(obj, L, c);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                b c2 = m.c();
                m.d(c2, object2);
                unsafe.putObject(obj, L, c2);
                object2 = c2;
            }
            m.d(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long L = L(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                tuh.b(iArr[i], obj2);
                return;
            }
            xto m = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    b c = m.c();
                    m.d(c, object);
                    unsafe.putObject(obj, L, c);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                b c2 = m.c();
                m.d(c2, object2);
                unsafe.putObject(obj, L, c2);
                object2 = c2;
            }
            m.d(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        xto m = m(i);
        long L = L(i) & 1048575;
        if (!n(i, obj)) {
            return m.c();
        }
        Object object = o.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        b c = m.c();
        if (object != null) {
            m.d(c, object);
        }
        return c;
    }

    public final Object v(int i, int i2, Object obj) {
        xto m = m(i2);
        if (!q(i, i2, obj)) {
            return m.c();
        }
        Object object = o.getObject(obj, L(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        b c = m.c();
        if (object != null) {
            m.d(c, object);
        }
        return c;
    }
}
