package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.v;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a1c;
import defpackage.e7o;
import defpackage.g9c;
import defpackage.hrg;
import defpackage.l1j;
import defpackage.lrv;
import defpackage.ouj;
import defpackage.rrv;
import defpackage.s9h;
import defpackage.uym;
import defpackage.wzh;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class h0<T> implements r0<T> {
    public static final int[] o = new int[0];
    public static final Unsafe p = b1.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final wzh e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final j0 k;
    public final x l;
    public final x0 m;
    public final b0 n;

    public h0(int[] iArr, Object[] objArr, int i, int i2, wzh wzhVar, boolean z, int[] iArr2, int i3, int i4, j0 j0Var, x xVar, x0 x0Var, m mVar, b0 b0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = wzhVar instanceof s;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = j0Var;
        this.l = xVar;
        this.m = x0Var;
        this.e = wzhVar;
        this.n = b0Var;
    }

    public static long A(long j, Object obj) {
        return ((Long) b1.d.i(j, obj)).longValue();
    }

    public static Field C(String str, Class cls) {
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

    public static int F(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void J(int i, Object obj, d1 d1Var) {
        if (obj instanceof String) {
            ((k) d1Var).a.y(i, (String) obj);
        } else {
            ((k) d1Var).a(i, (g) obj);
        }
    }

    public static List s(long j, Object obj) {
        return (List) b1.d.i(j, obj);
    }

    public static h0 w(e0 e0Var, j0 j0Var, x xVar, x0 x0Var, m mVar, b0 b0Var) {
        if (e0Var instanceof p0) {
            return x((p0) e0Var, j0Var, xVar, x0Var, mVar, b0Var);
        }
        e0Var.getClass();
        l1j.f();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h0 x(p0 p0Var, j0 j0Var, x xVar, x0 x0Var, m mVar, b0 b0Var) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
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
        Object[] objArr;
        int i15;
        int i16;
        int i17;
        boolean z;
        int i18;
        int objectFieldOffset;
        Class<?> cls;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field C;
        int i25;
        char charAt11;
        int i26;
        int i27;
        Field C2;
        Field C3;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        int i31;
        char charAt14;
        Object[] objArr2;
        int i32;
        char charAt15;
        char charAt16;
        int i33 = p0Var.d & 1;
        uym uymVar = uym.b;
        int i34 = 0;
        boolean z2 = (i33 == 1 ? uym.a : uymVar) == uymVar;
        String str = p0Var.b;
        int length = str.length();
        int charAt17 = str.charAt(0);
        if (charAt17 >= 55296) {
            int i35 = charAt17 & 8191;
            int i36 = 1;
            int i37 = 13;
            while (true) {
                i = i36 + 1;
                charAt16 = str.charAt(i36);
                if (charAt16 < 55296) {
                    break;
                }
                i35 |= (charAt16 & 8191) << i37;
                i37 += 13;
                i36 = i;
            }
            charAt17 = i35 | (charAt16 << i37);
        } else {
            i = 1;
        }
        int i38 = i + 1;
        int charAt18 = str.charAt(i);
        if (charAt18 >= 55296) {
            int i39 = charAt18 & 8191;
            int i40 = 13;
            while (true) {
                i32 = i38 + 1;
                charAt15 = str.charAt(i38);
                if (charAt15 < 55296) {
                    break;
                }
                i39 |= (charAt15 & 8191) << i40;
                i40 += 13;
                i38 = i32;
            }
            charAt18 = i39 | (charAt15 << i40);
            i38 = i32;
        }
        if (charAt18 == 0) {
            i5 = 0;
            charAt = 0;
            i6 = 0;
            charAt2 = 0;
            i3 = 0;
            iArr = o;
            i4 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt19 = str.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt10 = str.charAt(i41);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i42 |= (charAt10 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt19 = i42 | (charAt10 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt20 = str.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt9 = str.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt20 = i45 | (charAt9 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            charAt = str.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt8 = str.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt = i48 | (charAt8 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            int charAt21 = str.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt7 = str.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt21 = i51 | (charAt7 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt22 = str.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt6 = str.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt22 = i54 | (charAt6 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            charAt2 = str.charAt(i53);
            if (charAt2 >= 55296) {
                int i57 = charAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt5 = str.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt2 = i57 | (charAt5 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt23 = str.charAt(i56);
            if (charAt23 >= 55296) {
                int i60 = charAt23 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i8 = i61 + 1;
                    charAt4 = str.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i61 = i8;
                }
                charAt23 = i60 | (charAt4 << i62);
                i2 = i8;
            } else {
                i2 = i59;
            }
            int i63 = i2 + 1;
            int charAt24 = str.charAt(i2);
            if (charAt24 >= 55296) {
                int i64 = charAt24 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i7 = i65 + 1;
                    charAt3 = str.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i66;
                    i66 += 13;
                    i65 = i7;
                }
                charAt24 = i64 | (charAt3 << i66);
                i63 = i7;
            }
            int[] iArr2 = new int[charAt24 + charAt2 + charAt23];
            i3 = (charAt19 * 2) + charAt20;
            i4 = charAt21;
            iArr = iArr2;
            i5 = charAt22;
            i6 = charAt24;
            i34 = charAt19;
            i38 = i63;
        }
        Unsafe unsafe = p;
        Object[] objArr3 = p0Var.c;
        int i67 = i34;
        Class<?> cls2 = p0Var.a.getClass();
        int i68 = charAt17;
        int[] iArr3 = new int[i5 * 3];
        Object[] objArr4 = new Object[i5 * 2];
        int i69 = charAt2 + i6;
        int i70 = i6;
        int i71 = i69;
        int i72 = 0;
        int i73 = 0;
        while (i38 < length) {
            int i74 = i38 + 1;
            int charAt25 = str.charAt(i38);
            int i75 = length;
            if (charAt25 >= 55296) {
                int i76 = charAt25 & 8191;
                int i77 = i74;
                int i78 = 13;
                while (true) {
                    i31 = i77 + 1;
                    charAt14 = str.charAt(i77);
                    objArr2 = objArr4;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i76 |= (charAt14 & 8191) << i78;
                    i78 += 13;
                    i77 = i31;
                    objArr4 = objArr2;
                }
                charAt25 = i76 | (charAt14 << i78);
                i15 = i31;
                objArr = objArr2;
            } else {
                objArr = objArr4;
                i15 = i74;
            }
            int i79 = i15 + 1;
            int charAt26 = str.charAt(i15);
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
                i16 = i29;
            } else {
                i16 = i79;
            }
            Object[] objArr5 = objArr3;
            int i83 = charAt26 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i84 = charAt25;
            if ((charAt26 & 1024) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            int i85 = i4;
            if (i83 >= 51) {
                int i86 = i16 + 1;
                int charAt27 = str.charAt(i16);
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
                    objArr[hrg.B(i72, 3, 2, 1)] = objArr5[i3];
                    i3++;
                } else if (i89 == 12) {
                    i27 = i86;
                    if ((i68 & 1) == 1) {
                        objArr[hrg.B(i72, 3, 2, 1)] = objArr5[i3];
                        i3++;
                    }
                } else {
                    i27 = i86;
                }
                int i91 = i90 * 2;
                Object obj = objArr5[i91];
                if (obj instanceof Field) {
                    C2 = (Field) obj;
                } else {
                    C2 = C((String) obj, cls2);
                    objArr5[i91] = C2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(C2);
                int i92 = i91 + 1;
                Object obj2 = objArr5[i92];
                if (obj2 instanceof Field) {
                    C3 = (Field) obj2;
                } else {
                    C3 = C((String) obj2, cls2);
                    objArr5[i92] = C3;
                }
                int i93 = i27;
                i17 = charAt;
                i20 = i93;
                i19 = i72;
                z = z2;
                i23 = i3;
                cls = cls2;
                i21 = (int) unsafe.objectFieldOffset(C3);
                i24 = objectFieldOffset2;
                i22 = 0;
            } else {
                int i94 = i3 + 1;
                Field C4 = C((String) objArr5[i3], cls2);
                if (i83 == 9 || i83 == 17) {
                    i17 = charAt;
                    z = z2;
                    objArr[hrg.B(i72, 3, 2, 1)] = C4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i17 = charAt;
                        z = z2;
                        i26 = i3 + 2;
                        objArr[hrg.B(i72, 3, 2, 1)] = objArr5[i94];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i17 = charAt;
                        z = z2;
                        if ((i68 & 1) == 1) {
                            i26 = i3 + 2;
                            objArr[hrg.B(i72, 3, 2, 1)] = objArr5[i94];
                        }
                    } else if (i83 == 50) {
                        int i95 = i70 + 1;
                        iArr[i70] = i72;
                        int i96 = (i72 / 3) * 2;
                        int i97 = i3 + 2;
                        objArr[i96] = objArr5[i94];
                        if ((charAt26 & 2048) != 0) {
                            i18 = i3 + 3;
                            objArr[i96 + 1] = objArr5[i97];
                            i17 = charAt;
                            z = z2;
                            i70 = i95;
                        } else {
                            z = z2;
                            i18 = i97;
                            i70 = i95;
                            i17 = charAt;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                        if ((i68 & 1) == 1 || i83 > 17) {
                            cls = cls2;
                            i19 = i72;
                            i20 = i16;
                            i21 = 0;
                            i22 = 0;
                        } else {
                            i20 = i16 + 1;
                            int charAt28 = str.charAt(i16);
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
                            Object obj3 = objArr5[i100];
                            if (obj3 instanceof Field) {
                                C = (Field) obj3;
                            } else {
                                C = C((String) obj3, cls2);
                                objArr5[i100] = C;
                            }
                            cls = cls2;
                            i19 = i72;
                            i21 = (int) unsafe.objectFieldOffset(C);
                            i22 = charAt28 % 32;
                        }
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i71] = objectFieldOffset;
                            i71++;
                        }
                        i23 = i18;
                        i24 = objectFieldOffset;
                    } else {
                        i17 = charAt;
                        z = z2;
                    }
                    i18 = i26;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                    if ((i68 & 1) == 1) {
                    }
                    cls = cls2;
                    i19 = i72;
                    i20 = i16;
                    i21 = 0;
                    i22 = 0;
                    if (i83 >= 18) {
                        iArr[i71] = objectFieldOffset;
                        i71++;
                    }
                    i23 = i18;
                    i24 = objectFieldOffset;
                }
                i18 = i94;
                objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                if ((i68 & 1) == 1) {
                }
                cls = cls2;
                i19 = i72;
                i20 = i16;
                i21 = 0;
                i22 = 0;
                if (i83 >= 18) {
                }
                i23 = i18;
                i24 = objectFieldOffset;
            }
            int i101 = i19 + 1;
            iArr3[i19] = i84;
            int i102 = i19 + 2;
            String str2 = str;
            iArr3[i101] = ((charAt26 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt26 & 256) != 0 ? 268435456 : 0) | (i83 << 20) | i24;
            iArr3[i102] = (i22 << 20) | i21;
            i38 = i20;
            cls2 = cls;
            z2 = z;
            objArr3 = objArr5;
            length = i75;
            objArr4 = objArr;
            charAt = i17;
            i4 = i85;
            i3 = i23;
            i72 = i19 + 3;
            str = str2;
        }
        return new h0(iArr3, objArr4, charAt, i4, p0Var.a, z2, iArr, i6, i69, j0Var, xVar, x0Var, mVar, b0Var);
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static int z(long j, Object obj) {
        return ((Integer) b1.d.i(j, obj)).intValue();
    }

    public final void B(Object obj, int i, q0 q0Var) {
        if ((536870912 & i) != 0) {
            b1.o(i & 1048575, obj, q0Var.L());
        } else if (this.f) {
            b1.o(i & 1048575, obj, q0Var.C());
        } else {
            b1.o(i & 1048575, obj, q0Var.o());
        }
    }

    public final void D(int i, Object obj) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        b1.m(j, obj, b1.d.g(j, obj) | (1 << (i2 >>> 20)));
    }

    public final void E(int i, int i2, Object obj) {
        b1.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int G(int i) {
        return this.a[i + 1];
    }

    public final void H(Object obj, d1 d1Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = p;
        int i5 = -1;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 = i4 + 3) {
            int G = G(i7);
            int i8 = iArr[i7];
            int F = F(G);
            if (this.g || F > 17) {
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
            long j = G & i2;
            switch (F) {
                case 0:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        double e = b1.d.e(j, obj);
                        j jVar = ((k) d1Var).a;
                        jVar.getClass();
                        jVar.s(i8, Double.doubleToRawLongBits(e));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        float f = b1.d.f(j, obj);
                        j jVar2 = ((k) d1Var).a;
                        jVar2.getClass();
                        jVar2.q(i8, Float.floatToRawIntBits(f));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.D(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.D(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.u(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.s(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.q(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.m(i8, b1.d.c(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        J(i8, unsafe.getObject(obj, j), d1Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.w(i8, (wzh) unsafe.getObject(obj, j), n(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a(i8, (g) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.B(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.u(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.q(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).a.s(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        ((k) d1Var).a.B(i8, (i11 >> 31) ^ (i11 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        ((k) d1Var).a.D(i8, (j2 >> 63) ^ (j2 << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        ((k) d1Var).b(i8, unsafe.getObject(obj, j), n(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i4 = i;
                    s0.A(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 19:
                    i4 = i;
                    s0.E(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 20:
                    i4 = i;
                    s0.H(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 21:
                    i4 = i;
                    s0.P(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 22:
                    i4 = i;
                    s0.G(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 23:
                    i4 = i;
                    s0.D(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 24:
                    i4 = i;
                    s0.C(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 25:
                    i4 = i;
                    s0.y(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 26:
                    i4 = i;
                    s0.N(iArr[i4], (List) unsafe.getObject(obj, j), d1Var);
                    break;
                case 27:
                    i4 = i;
                    s0.I(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, n(i4));
                    break;
                case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    i4 = i;
                    s0.z(iArr[i4], (List) unsafe.getObject(obj, j), d1Var);
                    break;
                case 29:
                    i4 = i;
                    z = false;
                    s0.O(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 30:
                    i4 = i;
                    z = false;
                    s0.B(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    i4 = i;
                    z = false;
                    s0.J(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 32:
                    i4 = i;
                    z = false;
                    s0.K(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    i4 = i;
                    z = false;
                    s0.L(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    i4 = i;
                    z = false;
                    s0.M(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, false);
                    break;
                case 35:
                    i4 = i;
                    s0.A(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    i4 = i;
                    s0.E(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case 37:
                    i4 = i;
                    s0.H(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case 38:
                    i4 = i;
                    s0.P(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case 39:
                    i4 = i;
                    s0.G(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case 40:
                    i4 = i;
                    s0.D(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case 41:
                    i4 = i;
                    s0.C(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case 42:
                    i4 = i;
                    s0.y(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    i4 = i;
                    s0.O(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    i4 = i;
                    s0.B(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    i4 = i;
                    s0.J(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    i4 = i;
                    s0.K(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    i4 = i;
                    s0.L(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    i4 = i;
                    s0.M(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    i4 = i;
                    s0.F(iArr[i4], (List) unsafe.getObject(obj, j), d1Var, n(i4));
                    break;
                case 50:
                    i4 = i;
                    I(d1Var, i8, unsafe.getObject(obj, j), i4);
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        double doubleValue = ((Double) b1.d.i(j, obj)).doubleValue();
                        j jVar3 = ((k) d1Var).a;
                        jVar3.getClass();
                        jVar3.s(i8, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        float floatValue = ((Float) b1.d.i(j, obj)).floatValue();
                        j jVar4 = ((k) d1Var).a;
                        jVar4.getClass();
                        jVar4.q(i8, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.D(i8, A(j, obj));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.D(i8, A(j, obj));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.u(i8, z(j, obj));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.s(i8, A(j, obj));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.q(i8, z(j, obj));
                    }
                    break;
                case 58:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.m(i8, ((Boolean) b1.d.i(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        J(i8, unsafe.getObject(obj, j), d1Var);
                    }
                    break;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.w(i8, (wzh) unsafe.getObject(obj, j), n(i4));
                    }
                    break;
                case 61:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a(i8, (g) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.B(i8, z(j, obj));
                    }
                    break;
                case 63:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.u(i8, z(j, obj));
                    }
                    break;
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.q(i8, z(j, obj));
                    }
                    break;
                case 65:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).a.s(i8, A(j, obj));
                    }
                    break;
                case 66:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        int z2 = z(j, obj);
                        ((k) d1Var).a.B(i8, (z2 >> 31) ^ (z2 << 1));
                    }
                    break;
                case 67:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        long A = A(j, obj);
                        ((k) d1Var).a.D(i8, (A >> 63) ^ (A << 1));
                    }
                    break;
                case 68:
                    i4 = i;
                    if (r(i8, i4, obj)) {
                        ((k) d1Var).b(i8, unsafe.getObject(obj, j), n(i4));
                    }
                    break;
                default:
                    i4 = i;
                    break;
            }
        }
        ((z0) this.m).getClass();
        ((s) obj).unknownFields.d(d1Var);
    }

    public final void I(d1 d1Var, int i, Object obj, int i2) {
        if (obj != null) {
            Object m = m(i2);
            c0 c0Var = (c0) this.n;
            c0Var.getClass();
            a0.a aVar = ((a0) m).a;
            lrv lrvVar = aVar.b;
            lrv lrvVar2 = aVar.a;
            c0Var.getClass();
            j jVar = ((k) d1Var).a;
            jVar.getClass();
            for (Map.Entry entry : ((s9h) obj).entrySet()) {
                jVar.A(i, 2);
                jVar.C(p.a(lrvVar2, 1, entry.getKey()) + p.a(lrvVar, 2, entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                p.c(jVar, lrvVar2, 1, key);
                p.c(jVar, lrvVar, 2, value);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
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
            long G = G(iArr[i2]) & 1048575;
            Object i3 = b1.d.i(G, obj);
            if (i3 != null) {
                ((c0) this.n).getClass();
                ((s9h) i3).a = false;
                b1.o(G, obj, i3);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(iArr[i], obj);
            i++;
        }
        ((z0) this.m).getClass();
        ((s) obj).unknownFields.e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
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
            int G = G(i5);
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
            if ((268435456 & G) != 0) {
                if (!(z2 ? q(i5, obj) : (i4 & i) != 0)) {
                    break;
                }
            }
            int F = F(G);
            if (F == 9 || F == 17) {
                if (z2) {
                    z = q(i5, obj);
                } else if ((i & i4) == 0) {
                    z = false;
                }
                if (z) {
                    if (!n(i5).b(b1.d.i(G & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i3++;
            } else {
                if (F != 27) {
                    if (F == 60 || F == 68) {
                        if (r(i6, i5, obj)) {
                            if (!n(i5).b(b1.d.i(G & 1048575, obj))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i3++;
                    } else if (F != 49) {
                        if (F == 50) {
                            Object i9 = b1.d.i(G & 1048575, obj);
                            ((c0) this.n).getClass();
                            s9h s9hVar = (s9h) i9;
                            if (!s9hVar.isEmpty() && ((a0) m(i5)).a.b.a == rrv.MESSAGE) {
                                r0 r0Var = null;
                                for (Object obj2 : s9hVar.values()) {
                                    if (r0Var == null) {
                                        r0Var = n0.c.a(obj2.getClass());
                                    }
                                    if (!r0Var.b(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        i3++;
                    }
                }
                List list = (List) b1.d.i(G & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    r0 n = n(i5);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!n.b(list.get(i10))) {
                            break loop0;
                        }
                    }
                }
                i3++;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final Object c() {
        ((k0) this.k).getClass();
        return ((s) this.e).d(s.c.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x008d, code lost:
    
        if (r11 != null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0664 A[Catch: all -> 0x0692, TryCatch #8 {all -> 0x0692, blocks: (B:50:0x065f, B:52:0x0664, B:54:0x066b, B:56:0x0672), top: B:49:0x065f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0678 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x069a A[LOOP:4: B:70:0x0698->B:71:0x069a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x06a4  */
    @Override // androidx.datastore.preferences.protobuf.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, q0 q0Var, a1c a1cVar) {
        h0<T> h0Var;
        int i;
        int i2;
        y0 y0Var;
        int i3;
        int i4;
        q0 q0Var2;
        int F;
        x xVar;
        h0<T> h0Var2 = this;
        Object obj2 = obj;
        q0 q0Var3 = q0Var;
        a1c a1cVar2 = a1cVar;
        a1cVar2.getClass();
        x0 x0Var = h0Var2.m;
        int[] iArr = h0Var2.h;
        int i5 = h0Var2.j;
        int i6 = h0Var2.i;
        y0 y0Var2 = null;
        while (true) {
            try {
                int D = q0Var3.D();
                try {
                    if (D >= h0Var2.c && D <= h0Var2.d) {
                        int[] iArr2 = h0Var2.a;
                        int length = (iArr2.length / 3) - 1;
                        int i7 = 0;
                        while (i7 <= length) {
                            int i8 = (length + i7) >>> 1;
                            i3 = i8 * 3;
                            int i9 = iArr2[i3];
                            if (D == i9) {
                                i4 = i3;
                                y0 y0Var3 = y0.f;
                                if (i4 < 0) {
                                    int G = h0Var2.G(i4);
                                    try {
                                        F = F(G);
                                        xVar = h0Var2.l;
                                    } catch (v.a unused) {
                                        q0Var2 = q0Var3;
                                        i = i6;
                                    }
                                    switch (F) {
                                        case 0:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            try {
                                                try {
                                                    b1.d.m(obj, y(G), q0Var2.readDouble());
                                                    obj2 = obj;
                                                    h0Var.D(i4, obj2);
                                                    y0Var2 = y0Var;
                                                } catch (v.a unused2) {
                                                    obj2 = obj;
                                                    y0Var2 = y0Var;
                                                    try {
                                                        x0Var.getClass();
                                                        if (y0Var2 == null) {
                                                        }
                                                        if (!x0Var.a(y0Var2, q0Var2)) {
                                                        }
                                                        a1cVar2 = a1cVar;
                                                        h0Var2 = h0Var;
                                                        i6 = i;
                                                        q0Var3 = q0Var2;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        while (i2 < i5) {
                                                        }
                                                        if (y0Var2 != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    obj2 = obj;
                                                    y0Var2 = y0Var;
                                                    while (i2 < i5) {
                                                    }
                                                    if (y0Var2 != null) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (v.a unused3) {
                                                obj2 = obj;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj2 = obj;
                                            }
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                            break;
                                        case 1:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.d.n(obj2, y(G), q0Var2.readFloat());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 2:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.n(obj2, y(G), q0Var2.K());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 3:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.n(obj2, y(G), q0Var2.t());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 4:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.m(y(G), obj2, q0Var2.p());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 5:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.n(obj2, y(G), q0Var2.a());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 6:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.m(y(G), obj2, q0Var2.v());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 7:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.d.k(obj2, y(G), q0Var2.d());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 8:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            h0Var.B(obj2, G, q0Var2);
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 9:
                                            a1c a1cVar3 = a1cVar2;
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            if (h0Var.q(i4, obj2)) {
                                                b1.o(y(G), obj2, u.c(b1.d.i(y(G), obj2), q0Var2.q(h0Var.n(i4), a1cVar3)));
                                            } else {
                                                b1.o(y(G), obj2, q0Var2.q(h0Var.n(i4), a1cVar3));
                                                h0Var.D(i4, obj2);
                                            }
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 10:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.o(y(G), obj2, q0Var2.o());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 11:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.m(y(G), obj2, q0Var2.g());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 12:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            int k = q0Var2.k();
                                            h0Var.l(i4);
                                            b1.m(y(G), obj2, k);
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 13:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.m(y(G), obj2, q0Var2.H());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 14:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.n(obj2, y(G), q0Var2.e());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 15:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.m(y(G), obj2, q0Var2.l());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 16:
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            b1.n(obj2, y(G), q0Var2.B());
                                            h0Var.D(i4, obj2);
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 17:
                                            a1c a1cVar4 = a1cVar2;
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            try {
                                                if (h0Var.q(i4, obj2)) {
                                                    i = i6;
                                                    y0Var = y0Var2;
                                                    try {
                                                        b1.o(y(G), obj2, u.c(b1.d.i(y(G), obj2), q0Var2.j(h0Var.n(i4), a1cVar4)));
                                                    } catch (v.a unused4) {
                                                        y0Var2 = y0Var;
                                                        x0Var.getClass();
                                                        if (y0Var2 == null) {
                                                        }
                                                        if (!x0Var.a(y0Var2, q0Var2)) {
                                                        }
                                                        a1cVar2 = a1cVar;
                                                        h0Var2 = h0Var;
                                                        i6 = i;
                                                        q0Var3 = q0Var2;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        y0Var2 = y0Var;
                                                        while (i2 < i5) {
                                                        }
                                                        if (y0Var2 != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    i = i6;
                                                    y0Var = y0Var2;
                                                    b1.o(y(G), obj2, q0Var2.j(h0Var.n(i4), a1cVar4));
                                                    h0Var.D(i4, obj2);
                                                }
                                                y0Var2 = y0Var;
                                            } catch (v.a unused5) {
                                                i = i6;
                                                x0Var.getClass();
                                                if (y0Var2 == null) {
                                                }
                                                if (!x0Var.a(y0Var2, q0Var2)) {
                                                }
                                                a1cVar2 = a1cVar;
                                                h0Var2 = h0Var;
                                                i6 = i;
                                                q0Var3 = q0Var2;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                i = i6;
                                                while (i2 < i5) {
                                                }
                                                if (y0Var2 != null) {
                                                }
                                                throw th;
                                            }
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                            break;
                                        case 18:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.J(xVar.c(y(G), obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 19:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.F(xVar.c(y(G), obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 20:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.h(xVar.c(y(G), obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 21:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.f(xVar.c(y(G), obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 22:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.y(xVar.c(y(G), obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 23:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.r(xVar.c(y(G), obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 24:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.A(xVar.c(y(G), obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 25:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.m(xVar.c(y(G), obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 26:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            if ((536870912 & G) != 0) {
                                                q0Var2.n(xVar.c(G & 1048575, obj2));
                                            } else {
                                                q0Var2.E(xVar.c(G & 1048575, obj2));
                                            }
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 27:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.z(xVar.c(G & 1048575, obj2), h0Var.n(i4), a1cVar2);
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.I(xVar.c(y(G), obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 29:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.u(xVar.c(y(G), obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 30:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.i(xVar.c(y(G), obj2));
                                            h0Var.l(i4);
                                            Class cls = s0.a;
                                            i = i6;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.b(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 32:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.x(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.s(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.c(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 35:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.J(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.F(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 37:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.h(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 38:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.f(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 39:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.y(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 40:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.r(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 41:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.A(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 42:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.m(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case com.yandex.pulse.metrics.o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.u(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case com.yandex.pulse.metrics.o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.i(xVar.c(G & 1048575, obj2));
                                            h0Var.l(i4);
                                            Class cls2 = s0.a;
                                            i = i6;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case com.yandex.pulse.metrics.o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.b(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case com.yandex.pulse.metrics.o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.x(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case com.yandex.pulse.metrics.o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.s(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            q0Var2.c(xVar.c(G & 1048575, obj2));
                                            i = i6;
                                            y0Var = y0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                                            q0Var2 = q0Var3;
                                            h0Var = h0Var2;
                                            try {
                                                q0Var2.w(xVar.c(G & 1048575, obj2), h0Var.n(i4), a1cVar2);
                                                i = i6;
                                                y0Var = y0Var2;
                                                y0Var2 = y0Var;
                                            } catch (v.a unused6) {
                                                i = i6;
                                                x0Var.getClass();
                                                if (y0Var2 == null) {
                                                }
                                                if (!x0Var.a(y0Var2, q0Var2)) {
                                                }
                                                a1cVar2 = a1cVar;
                                                h0Var2 = h0Var;
                                                i6 = i;
                                                q0Var3 = q0Var2;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                i = i6;
                                                while (i2 < i5) {
                                                }
                                                if (y0Var2 != null) {
                                                }
                                                throw th;
                                            }
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                            break;
                                        case 50:
                                            try {
                                                h0Var2.t(obj2, i4, h0Var2.m(i4), a1cVar2, q0Var3);
                                                q0Var2 = q0Var3;
                                                h0Var = h0Var2;
                                                i = i6;
                                                y0Var = y0Var2;
                                                y0Var2 = y0Var;
                                            } catch (v.a unused7) {
                                                q0Var2 = q0Var3;
                                                h0Var = h0Var2;
                                                i = i6;
                                                x0Var.getClass();
                                                if (y0Var2 == null) {
                                                    s sVar = (s) obj2;
                                                    y0 y0Var4 = sVar.unknownFields;
                                                    if (y0Var4 == y0Var3) {
                                                        y0Var4 = y0.b();
                                                        sVar.unknownFields = y0Var4;
                                                    }
                                                    y0Var2 = y0Var4;
                                                }
                                                if (!x0Var.a(y0Var2, q0Var2)) {
                                                    for (int i10 = i; i10 < i5; i10++) {
                                                        h0Var.k(iArr[i10], obj2, y0Var2);
                                                    }
                                                    if (y0Var2 != null) {
                                                        ((s) obj2).unknownFields = y0Var2;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                a1cVar2 = a1cVar;
                                                h0Var2 = h0Var;
                                                i6 = i;
                                                q0Var3 = q0Var2;
                                            }
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                                            b1.o(G & 1048575, obj2, Double.valueOf(q0Var3.readDouble()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                                            b1.o(G & 1048575, obj2, Float.valueOf(q0Var3.readFloat()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                                            b1.o(G & 1048575, obj2, Long.valueOf(q0Var3.K()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                                            b1.o(G & 1048575, obj2, Long.valueOf(q0Var3.t()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                                            b1.o(G & 1048575, obj2, Integer.valueOf(q0Var3.p()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                                            b1.o(G & 1048575, obj2, Long.valueOf(q0Var3.a()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                                            b1.o(G & 1048575, obj2, Integer.valueOf(q0Var3.v()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 58:
                                            b1.o(G & 1048575, obj2, Boolean.valueOf(q0Var3.d()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 59:
                                            h0Var2.B(obj2, G, q0Var3);
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                                            if (h0Var2.r(D, i4, obj2)) {
                                                long j = G & 1048575;
                                                b1.o(j, obj2, u.c(b1.d.i(j, obj2), q0Var3.q(h0Var2.n(i4), a1cVar2)));
                                            } else {
                                                b1.o(G & 1048575, obj2, q0Var3.q(h0Var2.n(i4), a1cVar2));
                                                h0Var2.D(i4, obj2);
                                            }
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 61:
                                            b1.o(G & 1048575, obj2, q0Var3.o());
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 62:
                                            b1.o(G & 1048575, obj2, Integer.valueOf(q0Var3.g()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 63:
                                            int k2 = q0Var3.k();
                                            h0Var2.l(i4);
                                            b1.o(G & 1048575, obj2, Integer.valueOf(k2));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case SQLiteDatabase.OPEN_URI /* 64 */:
                                            b1.o(G & 1048575, obj2, Integer.valueOf(q0Var3.H()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 65:
                                            b1.o(G & 1048575, obj2, Long.valueOf(q0Var3.e()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 66:
                                            b1.o(G & 1048575, obj2, Integer.valueOf(q0Var3.l()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 67:
                                            b1.o(G & 1048575, obj2, Long.valueOf(q0Var3.B()));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        case 68:
                                            b1.o(G & 1048575, obj2, q0Var3.j(h0Var2.n(i4), a1cVar2));
                                            h0Var2.E(D, i4, obj2);
                                            q0Var2 = q0Var3;
                                            i = i6;
                                            y0Var = y0Var2;
                                            h0Var = h0Var2;
                                            y0Var2 = y0Var;
                                            a1cVar2 = a1cVar;
                                            h0Var2 = h0Var;
                                            i6 = i;
                                            q0Var3 = q0Var2;
                                        default:
                                            if (y0Var2 == null) {
                                                try {
                                                    ((z0) x0Var).getClass();
                                                    y0Var2 = y0.b();
                                                } catch (v.a unused8) {
                                                    q0Var2 = q0Var3;
                                                    i = i6;
                                                    h0Var = h0Var2;
                                                    x0Var.getClass();
                                                    if (y0Var2 == null) {
                                                    }
                                                    if (!x0Var.a(y0Var2, q0Var2)) {
                                                    }
                                                    a1cVar2 = a1cVar;
                                                    h0Var2 = h0Var;
                                                    i6 = i;
                                                    q0Var3 = q0Var2;
                                                }
                                            }
                                            if (!x0Var.a(y0Var2, q0Var3)) {
                                                while (i6 < i5) {
                                                    h0Var2.k(iArr[i6], obj2, y0Var2);
                                                    i6++;
                                                }
                                                break;
                                            } else {
                                                q0Var2 = q0Var3;
                                                i = i6;
                                                h0Var = h0Var2;
                                                a1cVar2 = a1cVar;
                                                h0Var2 = h0Var;
                                                i6 = i;
                                                q0Var3 = q0Var2;
                                            }
                                            break;
                                    }
                                } else if (D == Integer.MAX_VALUE) {
                                    while (i6 < i5) {
                                        h0Var2.k(iArr[i6], obj2, y0Var2);
                                        i6++;
                                    }
                                    if (y0Var2 != null) {
                                        ((z0) x0Var).getClass();
                                    }
                                } else {
                                    try {
                                        x0Var.getClass();
                                        if (y0Var2 == null) {
                                            s sVar2 = (s) obj2;
                                            y0 y0Var5 = sVar2.unknownFields;
                                            if (y0Var5 == y0Var3) {
                                                y0Var5 = y0.b();
                                                sVar2.unknownFields = y0Var5;
                                            }
                                            y0Var2 = y0Var5;
                                        }
                                        if (!x0Var.a(y0Var2, q0Var3)) {
                                            while (i6 < i5) {
                                                h0Var2.k(iArr[i6], obj2, y0Var2);
                                                i6++;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        h0Var = h0Var2;
                                        i = i6;
                                        for (i2 = i; i2 < i5; i2++) {
                                            h0Var.k(iArr[i2], obj2, y0Var2);
                                        }
                                        if (y0Var2 != null) {
                                            ((z0) x0Var).getClass();
                                            ((s) obj2).unknownFields = y0Var2;
                                        }
                                        throw th;
                                    }
                                }
                            } else if (D < i9) {
                                length = i8 - 1;
                            } else {
                                i7 = i8 + 1;
                            }
                        }
                    }
                    i3 = -1;
                    i4 = i3;
                    y0 y0Var32 = y0.f;
                    if (i4 < 0) {
                    }
                } catch (Throwable th8) {
                    th = th8;
                    h0Var = h0Var2;
                    i = i6;
                    y0Var = y0Var2;
                }
            } catch (Throwable th9) {
                th = th9;
                h0Var = h0Var2;
            }
        }
        ((s) obj2).unknownFields = y0Var2;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final int e(a aVar) {
        return this.g ? p(aVar) : o(aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.r0
    public final void f(s sVar, s sVar2) {
        s sVar3;
        sVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                s sVar4 = sVar;
                if (this.g) {
                    return;
                }
                s0.w(this.m, sVar4, sVar2);
                return;
            }
            int G = G(i);
            long j = 1048575 & G;
            int i2 = iArr[i];
            switch (F(G)) {
                case 0:
                    if (q(i, sVar2)) {
                        b1.d dVar = b1.d;
                        sVar3 = sVar;
                        dVar.m(sVar3, j, dVar.e(j, sVar2));
                        D(i, sVar3);
                        break;
                    }
                    sVar3 = sVar;
                    break;
                case 1:
                    if (q(i, sVar2)) {
                        b1.d dVar2 = b1.d;
                        dVar2.n(sVar, j, dVar2.f(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 2:
                    if (q(i, sVar2)) {
                        b1.n(sVar, j, b1.d.h(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 3:
                    if (q(i, sVar2)) {
                        b1.n(sVar, j, b1.d.h(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 4:
                    if (q(i, sVar2)) {
                        b1.m(j, sVar, b1.d.g(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 5:
                    if (q(i, sVar2)) {
                        b1.n(sVar, j, b1.d.h(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 6:
                    if (q(i, sVar2)) {
                        b1.m(j, sVar, b1.d.g(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 7:
                    if (q(i, sVar2)) {
                        b1.d dVar3 = b1.d;
                        dVar3.k(sVar, j, dVar3.c(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 8:
                    if (q(i, sVar2)) {
                        b1.o(j, sVar, b1.d.i(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 9:
                    u(i, sVar, sVar2);
                    sVar3 = sVar;
                    break;
                case 10:
                    if (q(i, sVar2)) {
                        b1.o(j, sVar, b1.d.i(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 11:
                    if (q(i, sVar2)) {
                        b1.m(j, sVar, b1.d.g(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 12:
                    if (q(i, sVar2)) {
                        b1.m(j, sVar, b1.d.g(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 13:
                    if (q(i, sVar2)) {
                        b1.m(j, sVar, b1.d.g(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 14:
                    if (q(i, sVar2)) {
                        b1.n(sVar, j, b1.d.h(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 15:
                    if (q(i, sVar2)) {
                        b1.m(j, sVar, b1.d.g(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 16:
                    if (q(i, sVar2)) {
                        b1.n(sVar, j, b1.d.h(j, sVar2));
                        D(i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 17:
                    u(i, sVar, sVar2);
                    sVar3 = sVar;
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
                case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                case 29:
                case 30:
                case com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                case 32:
                case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                case 35:
                case com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case com.yandex.pulse.metrics.o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                case com.yandex.pulse.metrics.o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                case com.yandex.pulse.metrics.o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                case com.yandex.pulse.metrics.o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                case com.yandex.pulse.metrics.o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    this.l.b(j, sVar, sVar2);
                    sVar3 = sVar;
                    break;
                case 50:
                    Class cls = s0.a;
                    b1.d dVar4 = b1.d;
                    b1.o(j, sVar, ((c0) this.n).b(dVar4.i(j, sVar), dVar4.i(j, sVar2)));
                    sVar3 = sVar;
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
                    if (r(i2, i, sVar2)) {
                        b1.o(j, sVar, b1.d.i(j, sVar2));
                        E(i2, i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    v(i, sVar, sVar2);
                    sVar3 = sVar;
                    break;
                case 61:
                case 62:
                case 63:
                case SQLiteDatabase.OPEN_URI /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (r(i2, i, sVar2)) {
                        b1.o(j, sVar, b1.d.i(j, sVar2));
                        E(i2, i, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 68:
                    v(i, sVar, sVar2);
                    sVar3 = sVar;
                    break;
                default:
                    sVar3 = sVar;
                    break;
            }
            i += 3;
            sVar = sVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0219, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        r3 = r8 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(s sVar) {
        int i;
        int b;
        int i2;
        int g;
        int i3;
        int[] iArr = this.a;
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int G = G(i5);
            int i6 = iArr[i5];
            long j = 1048575 & G;
            int i7 = 1237;
            int i8 = 37;
            switch (F(G)) {
                case 0:
                    i = i4 * 53;
                    b = u.b(Double.doubleToLongBits(b1.d.e(j, sVar)));
                    i4 = b + i;
                    break;
                case 1:
                    i = i4 * 53;
                    b = Float.floatToIntBits(b1.d.f(j, sVar));
                    i4 = b + i;
                    break;
                case 2:
                    i = i4 * 53;
                    b = u.b(b1.d.h(j, sVar));
                    i4 = b + i;
                    break;
                case 3:
                    i = i4 * 53;
                    b = u.b(b1.d.h(j, sVar));
                    i4 = b + i;
                    break;
                case 4:
                    i2 = i4 * 53;
                    g = b1.d.g(j, sVar);
                    i4 = i2 + g;
                    break;
                case 5:
                    i = i4 * 53;
                    b = u.b(b1.d.h(j, sVar));
                    i4 = b + i;
                    break;
                case 6:
                    i2 = i4 * 53;
                    g = b1.d.g(j, sVar);
                    i4 = i2 + g;
                    break;
                case 7:
                    i3 = i4 * 53;
                    boolean c = b1.d.c(j, sVar);
                    Charset charset = u.a;
                    break;
                case 8:
                    i = i4 * 53;
                    b = ((String) b1.d.i(j, sVar)).hashCode();
                    i4 = b + i;
                    break;
                case 9:
                    Object i9 = b1.d.i(j, sVar);
                    if (i9 != null) {
                        i8 = i9.hashCode();
                    }
                    i4 = (i4 * 53) + i8;
                    break;
                case 10:
                    i = i4 * 53;
                    b = b1.d.i(j, sVar).hashCode();
                    i4 = b + i;
                    break;
                case 11:
                    i2 = i4 * 53;
                    g = b1.d.g(j, sVar);
                    i4 = i2 + g;
                    break;
                case 12:
                    i2 = i4 * 53;
                    g = b1.d.g(j, sVar);
                    i4 = i2 + g;
                    break;
                case 13:
                    i2 = i4 * 53;
                    g = b1.d.g(j, sVar);
                    i4 = i2 + g;
                    break;
                case 14:
                    i = i4 * 53;
                    b = u.b(b1.d.h(j, sVar));
                    i4 = b + i;
                    break;
                case 15:
                    i2 = i4 * 53;
                    g = b1.d.g(j, sVar);
                    i4 = i2 + g;
                    break;
                case 16:
                    i = i4 * 53;
                    b = u.b(b1.d.h(j, sVar));
                    i4 = b + i;
                    break;
                case 17:
                    Object i10 = b1.d.i(j, sVar);
                    if (i10 != null) {
                        i8 = i10.hashCode();
                    }
                    i4 = (i4 * 53) + i8;
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
                case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                case 29:
                case 30:
                case com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                case 32:
                case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                case 35:
                case com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case com.yandex.pulse.metrics.o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                case com.yandex.pulse.metrics.o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                case com.yandex.pulse.metrics.o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                case com.yandex.pulse.metrics.o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                case com.yandex.pulse.metrics.o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    i = i4 * 53;
                    b = b1.d.i(j, sVar).hashCode();
                    i4 = b + i;
                    break;
                case 50:
                    i = i4 * 53;
                    b = b1.d.i(j, sVar).hashCode();
                    i4 = b + i;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = u.b(Double.doubleToLongBits(((Double) b1.d.i(j, sVar)).doubleValue()));
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = Float.floatToIntBits(((Float) b1.d.i(j, sVar)).floatValue());
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = u.b(A(j, sVar));
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = u.b(A(j, sVar));
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (r(i6, i5, sVar)) {
                        i2 = i4 * 53;
                        g = z(j, sVar);
                        i4 = i2 + g;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = u.b(A(j, sVar));
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (r(i6, i5, sVar)) {
                        i2 = i4 * 53;
                        g = z(j, sVar);
                        i4 = i2 + g;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i6, i5, sVar)) {
                        i3 = i4 * 53;
                        boolean booleanValue = ((Boolean) b1.d.i(j, sVar)).booleanValue();
                        Charset charset2 = u.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = ((String) b1.d.i(j, sVar)).hashCode();
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = b1.d.i(j, sVar).hashCode();
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = b1.d.i(j, sVar).hashCode();
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i6, i5, sVar)) {
                        i2 = i4 * 53;
                        g = z(j, sVar);
                        i4 = i2 + g;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i6, i5, sVar)) {
                        i2 = i4 * 53;
                        g = z(j, sVar);
                        i4 = i2 + g;
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (r(i6, i5, sVar)) {
                        i2 = i4 * 53;
                        g = z(j, sVar);
                        i4 = i2 + g;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = u.b(A(j, sVar));
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i6, i5, sVar)) {
                        i2 = i4 * 53;
                        g = z(j, sVar);
                        i4 = i2 + g;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = u.b(A(j, sVar));
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i6, i5, sVar)) {
                        i = i4 * 53;
                        b = b1.d.i(j, sVar).hashCode();
                        i4 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((z0) this.m).getClass();
        return sVar.unknownFields.hashCode() + (i4 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void h(Object obj, d1 d1Var) {
        d1Var.getClass();
        if (!this.g) {
            H(obj, d1Var);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int G = G(i);
            int i2 = iArr[i];
            switch (F(G)) {
                case 0:
                    if (q(i, obj)) {
                        double e = b1.d.e(G & 1048575, obj);
                        j jVar = ((k) d1Var).a;
                        jVar.getClass();
                        jVar.s(i2, Double.doubleToRawLongBits(e));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i, obj)) {
                        float f = b1.d.f(G & 1048575, obj);
                        j jVar2 = ((k) d1Var).a;
                        jVar2.getClass();
                        jVar2.q(i2, Float.floatToRawIntBits(f));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i, obj)) {
                        ((k) d1Var).a.D(i2, b1.d.h(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i, obj)) {
                        ((k) d1Var).a.D(i2, b1.d.h(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i, obj)) {
                        ((k) d1Var).a.u(i2, b1.d.g(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i, obj)) {
                        ((k) d1Var).a.s(i2, b1.d.h(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i, obj)) {
                        ((k) d1Var).a.q(i2, b1.d.g(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(i, obj)) {
                        ((k) d1Var).a.m(i2, b1.d.c(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i, obj)) {
                        J(i2, b1.d.i(G & 1048575, obj), d1Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (q(i, obj)) {
                        ((k) d1Var).a.w(i2, (wzh) b1.d.i(G & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i, obj)) {
                        ((k) d1Var).a(i2, (g) b1.d.i(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i, obj)) {
                        ((k) d1Var).a.B(i2, b1.d.g(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i, obj)) {
                        ((k) d1Var).a.u(i2, b1.d.g(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i, obj)) {
                        ((k) d1Var).a.q(i2, b1.d.g(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i, obj)) {
                        ((k) d1Var).a.s(i2, b1.d.h(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i, obj)) {
                        int g = b1.d.g(G & 1048575, obj);
                        ((k) d1Var).a.B(i2, (g >> 31) ^ (g << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i, obj)) {
                        long h = b1.d.h(G & 1048575, obj);
                        ((k) d1Var).a.D(i2, (h >> 63) ^ (h << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i, obj)) {
                        ((k) d1Var).b(i2, b1.d.i(G & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    s0.A(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 19:
                    s0.E(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 20:
                    s0.H(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 21:
                    s0.P(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 22:
                    s0.G(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 23:
                    s0.D(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 24:
                    s0.C(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 25:
                    s0.y(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 26:
                    s0.N(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var);
                    break;
                case 27:
                    s0.I(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, n(i));
                    break;
                case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    s0.z(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var);
                    break;
                case 29:
                    s0.O(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 30:
                    s0.B(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    s0.J(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 32:
                    s0.K(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    s0.L(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    s0.M(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, false);
                    break;
                case 35:
                    s0.A(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    s0.E(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case 37:
                    s0.H(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case 38:
                    s0.P(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case 39:
                    s0.G(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case 40:
                    s0.D(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case 41:
                    s0.C(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case 42:
                    s0.y(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    s0.O(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    s0.B(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    s0.J(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    s0.K(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case com.yandex.pulse.metrics.o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    s0.L(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    s0.M(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    s0.F(iArr[i], (List) b1.d.i(G & 1048575, obj), d1Var, n(i));
                    break;
                case 50:
                    I(d1Var, i2, b1.d.i(G & 1048575, obj), i);
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (r(i2, i, obj)) {
                        double doubleValue = ((Double) b1.d.i(G & 1048575, obj)).doubleValue();
                        j jVar3 = ((k) d1Var).a;
                        jVar3.getClass();
                        jVar3.s(i2, Double.doubleToRawLongBits(doubleValue));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (r(i2, i, obj)) {
                        float floatValue = ((Float) b1.d.i(G & 1048575, obj)).floatValue();
                        j jVar4 = ((k) d1Var).a;
                        jVar4.getClass();
                        jVar4.q(i2, Float.floatToRawIntBits(floatValue));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.D(i2, A(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.D(i2, A(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.u(i2, z(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.s(i2, A(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.q(i2, z(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.m(i2, ((Boolean) b1.d.i(G & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i2, i, obj)) {
                        J(i2, b1.d.i(G & 1048575, obj), d1Var);
                        break;
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.w(i2, (wzh) b1.d.i(G & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a(i2, (g) b1.d.i(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.B(i2, z(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.u(i2, z(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.q(i2, z(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).a.s(i2, A(G & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i2, i, obj)) {
                        int z = z(G & 1048575, obj);
                        ((k) d1Var).a.B(i2, (z >> 31) ^ (z << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i2, i, obj)) {
                        long A = A(G & 1048575, obj);
                        ((k) d1Var).a.D(i2, (A >> 63) ^ (A << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i2, i, obj)) {
                        ((k) d1Var).b(i2, b1.d.i(G & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((z0) this.m).getClass();
        ((s) obj).unknownFields.d(d1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.s0.x(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.s0.x(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.s0.x(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.s0.x(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.s0.x(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(s sVar, s sVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int G = G(i);
                long j = G & 1048575;
                switch (F(G)) {
                    case 0:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar2 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar3 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar4 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar5 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar6 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar7 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar8 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar9 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar10 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar11 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar12 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar13 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar14 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar15 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar16 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar17 = b1.d;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (j(sVar, sVar2, i)) {
                            b1.d dVar18 = b1.d;
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
                    case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    case 29:
                    case 30:
                    case com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    case 32:
                    case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    case 35:
                    case com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case com.yandex.pulse.metrics.o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    case com.yandex.pulse.metrics.o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    case com.yandex.pulse.metrics.o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    case com.yandex.pulse.metrics.o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    case com.yandex.pulse.metrics.o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                        b1.d dVar19 = b1.d;
                        z = s0.x(dVar19.i(j, sVar), dVar19.i(j, sVar2));
                        break;
                    case 50:
                        b1.d dVar20 = b1.d;
                        z = s0.x(dVar20.i(j, sVar), dVar20.i(j, sVar2));
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
                        b1.d dVar21 = b1.d;
                        if (dVar21.g(j2, sVar) == dVar21.g(j2, sVar2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                z0 z0Var = (z0) this.m;
                z0Var.getClass();
                y0 y0Var = sVar.unknownFields;
                z0Var.getClass();
                if (y0Var.equals(sVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j(s sVar, Object obj, int i) {
        return q(i, sVar) == q(i, obj);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (b1.d.i(G(i) & 1048575, obj) == null) {
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

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final r0 n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        r0 r0Var = (r0) objArr[i2];
        if (r0Var != null) {
            return r0Var;
        }
        r0 a = n0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final int o(Object obj) {
        int i;
        int i2;
        int k;
        int i3;
        int g;
        int e;
        int i4;
        int h;
        int h2;
        int f;
        int i5;
        Unsafe unsafe = p;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                ((z0) this.m).getClass();
                return ((s) obj).unknownFields.a() + i8;
            }
            int G = G(i7);
            int i10 = iArr[i7];
            int F = F(G);
            if (F <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & 1048575;
                i = 1 << (i11 >>> 20);
                if (i12 != i6) {
                    i9 = unsafe.getInt(obj, i12);
                    i6 = i12;
                }
            } else {
                i = 0;
            }
            long j = G & 1048575;
            switch (F) {
                case 0:
                    if ((i & i9) != 0) {
                        i8 = hrg.y(i10, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i9 & i) != 0) {
                        i8 = hrg.y(i10, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i9 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        i2 = j.i(i10);
                        k = j.k(j2);
                        i8 += k + i2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i9 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        i2 = j.i(i10);
                        k = j.k(j3);
                        i8 += k + i2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i9 & i) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        i3 = j.i(i10);
                        g = j.g(i13);
                        e = g + i3;
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i9 & i) != 0) {
                        e = j.e(i10);
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i9 & i) != 0) {
                        e = j.d(i10);
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i9 & i) != 0) {
                        i8 = hrg.y(i10, 1, i8);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof g) {
                            int i14 = j.i(i10);
                            int size = ((g) object).size();
                            h2 = hrg.h(size, size, i14, i8);
                            i8 = h2;
                            break;
                        } else {
                            i4 = j.i(i10);
                            h = j.h((String) object);
                            h2 = h + i4 + i8;
                            i8 = h2;
                        }
                    }
                case 9:
                    if ((i9 & i) != 0) {
                        Object object2 = unsafe.getObject(obj, j);
                        r0 n = n(i7);
                        Class cls = s0.a;
                        int i15 = j.i(i10);
                        int b = ((a) ((wzh) object2)).b(n);
                        i8 = hrg.h(b, b, i15, i8);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i9 & i) != 0) {
                        e = j.b(i10, (g) unsafe.getObject(obj, j));
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i9 & i) != 0) {
                        int i16 = unsafe.getInt(obj, j);
                        i3 = j.i(i10);
                        g = j.j(i16);
                        e = g + i3;
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i9 & i) != 0) {
                        int i17 = unsafe.getInt(obj, j);
                        i3 = j.i(i10);
                        g = j.g(i17);
                        e = g + i3;
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i9 & i) != 0) {
                        i8 = hrg.y(i10, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i & i9) != 0) {
                        i8 = hrg.y(i10, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i9 & i) != 0) {
                        int i18 = unsafe.getInt(obj, j);
                        i3 = j.i(i10);
                        g = j.j((i18 >> 31) ^ (i18 << 1));
                        e = g + i3;
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i9 & i) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        i2 = j.i(i10);
                        k = j.k((j4 >> 63) ^ (j4 << 1));
                        i8 += k + i2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i9 & i) != 0) {
                        e = j.f(i10, (wzh) unsafe.getObject(obj, j), n(i7));
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    f = s0.f((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 19:
                    f = s0.d((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 20:
                    f = s0.j((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 21:
                    f = s0.t((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 22:
                    f = s0.h((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 23:
                    f = s0.f((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 24:
                    f = s0.d((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls2 = s0.a;
                    int size2 = list.size();
                    i8 += size2 == 0 ? 0 : (j.i(i10) + 1) * size2;
                    break;
                case 26:
                    f = s0.q((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 27:
                    f = s0.l(i10, (List) unsafe.getObject(obj, j), n(i7));
                    i8 += f;
                    break;
                case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    f = s0.a((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 29:
                    f = s0.r((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 30:
                    f = s0.b((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    f = s0.d((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 32:
                    f = s0.f((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    f = s0.m((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    f = s0.o((List) unsafe.getObject(obj, j), i10);
                    i8 += f;
                    break;
                case 35:
                    int g2 = s0.g((List) unsafe.getObject(obj, j));
                    if (g2 > 0) {
                        i8 = hrg.h(g2, j.i(i10), g2, i8);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    int e2 = s0.e((List) unsafe.getObject(obj, j));
                    if (e2 > 0) {
                        i8 = hrg.h(e2, j.i(i10), e2, i8);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k2 = s0.k((List) unsafe.getObject(obj, j));
                    if (k2 > 0) {
                        i8 = hrg.h(k2, j.i(i10), k2, i8);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u = s0.u((List) unsafe.getObject(obj, j));
                    if (u > 0) {
                        i8 = hrg.h(u, j.i(i10), u, i8);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i19 = s0.i((List) unsafe.getObject(obj, j));
                    if (i19 > 0) {
                        i8 = hrg.h(i19, j.i(i10), i19, i8);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g3 = s0.g((List) unsafe.getObject(obj, j));
                    if (g3 > 0) {
                        i8 = hrg.h(g3, j.i(i10), g3, i8);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e3 = s0.e((List) unsafe.getObject(obj, j));
                    if (e3 > 0) {
                        i8 = hrg.h(e3, j.i(i10), e3, i8);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(obj, j);
                    Class cls3 = s0.a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        i8 = hrg.h(size3, j.i(i10), size3, i8);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    int s = s0.s((List) unsafe.getObject(obj, j));
                    if (s > 0) {
                        i8 = hrg.h(s, j.i(i10), s, i8);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    int c = s0.c((List) unsafe.getObject(obj, j));
                    if (c > 0) {
                        i8 = hrg.h(c, j.i(i10), c, i8);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    int e4 = s0.e((List) unsafe.getObject(obj, j));
                    if (e4 > 0) {
                        i8 = hrg.h(e4, j.i(i10), e4, i8);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    int g4 = s0.g((List) unsafe.getObject(obj, j));
                    if (g4 > 0) {
                        i8 = hrg.h(g4, j.i(i10), g4, i8);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    int n2 = s0.n((List) unsafe.getObject(obj, j));
                    if (n2 > 0) {
                        i8 = hrg.h(n2, j.i(i10), n2, i8);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    int p2 = s0.p((List) unsafe.getObject(obj, j));
                    if (p2 > 0) {
                        i8 = hrg.h(p2, j.i(i10), p2, i8);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    List list3 = (List) unsafe.getObject(obj, j);
                    r0 n3 = n(i7);
                    Class cls4 = s0.a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i20 = 0; i20 < size4; i20++) {
                            i5 += j.f(i10, (wzh) list3.get(i20), n3);
                        }
                    }
                    i8 += i5;
                    break;
                case 50:
                    f = ((c0) this.n).a(i10, unsafe.getObject(obj, j), m(i7));
                    i8 += f;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (r(i10, i7, obj)) {
                        i8 = hrg.y(i10, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (r(i10, i7, obj)) {
                        i8 = hrg.y(i10, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (r(i10, i7, obj)) {
                        long A = A(j, obj);
                        i2 = j.i(i10);
                        k = j.k(A);
                        i8 += k + i2;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (r(i10, i7, obj)) {
                        long A2 = A(j, obj);
                        i2 = j.i(i10);
                        k = j.k(A2);
                        i8 += k + i2;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (r(i10, i7, obj)) {
                        int z = z(j, obj);
                        i3 = j.i(i10);
                        g = j.g(z);
                        e = g + i3;
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (r(i10, i7, obj)) {
                        e = j.e(i10);
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (r(i10, i7, obj)) {
                        e = j.d(i10);
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i10, i7, obj)) {
                        i8 = hrg.y(i10, 1, i8);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!r(i10, i7, obj)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof g) {
                            int i21 = j.i(i10);
                            int size5 = ((g) object3).size();
                            h2 = hrg.h(size5, size5, i21, i8);
                            i8 = h2;
                            break;
                        } else {
                            i4 = j.i(i10);
                            h = j.h((String) object3);
                            h2 = h + i4 + i8;
                            i8 = h2;
                        }
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (r(i10, i7, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        r0 n4 = n(i7);
                        Class cls5 = s0.a;
                        int i22 = j.i(i10);
                        int b2 = ((a) ((wzh) object4)).b(n4);
                        i8 = hrg.h(b2, b2, i22, i8);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i10, i7, obj)) {
                        e = j.b(i10, (g) unsafe.getObject(obj, j));
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i10, i7, obj)) {
                        int z2 = z(j, obj);
                        i3 = j.i(i10);
                        g = j.j(z2);
                        e = g + i3;
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i10, i7, obj)) {
                        int z3 = z(j, obj);
                        i3 = j.i(i10);
                        g = j.g(z3);
                        e = g + i3;
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (r(i10, i7, obj)) {
                        i8 = hrg.y(i10, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i10, i7, obj)) {
                        i8 = hrg.y(i10, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i10, i7, obj)) {
                        int z4 = z(j, obj);
                        i3 = j.i(i10);
                        g = j.j((z4 >> 31) ^ (z4 << 1));
                        e = g + i3;
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i10, i7, obj)) {
                        long A3 = A(j, obj);
                        i2 = j.i(i10);
                        k = j.k((A3 >> 63) ^ (A3 << 1));
                        i8 += k + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i10, i7, obj)) {
                        e = j.f(i10, (wzh) unsafe.getObject(obj, j), n(i7));
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
        }
    }

    public final int p(Object obj) {
        int i;
        int k;
        int i2;
        int g;
        int e;
        int i3;
        int h;
        int i4;
        int k2;
        int f;
        int i5;
        Unsafe unsafe = p;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i6 >= iArr.length) {
                ((z0) this.m).getClass();
                return ((s) obj).unknownFields.a() + i7;
            }
            int G = G(i6);
            int F = F(G);
            int i8 = iArr[i6];
            long j = G & 1048575;
            if (F >= g9c.b.a && F <= g9c.c.a) {
                int i9 = iArr[i6 + 2];
            }
            switch (F) {
                case 0:
                    if (q(i6, obj)) {
                        i7 = hrg.y(i8, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i6, obj)) {
                        i7 = hrg.y(i8, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i6, obj)) {
                        long h2 = b1.d.h(j, obj);
                        i = j.i(i8);
                        k = j.k(h2);
                        e = k + i;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i6, obj)) {
                        long h3 = b1.d.h(j, obj);
                        i = j.i(i8);
                        k = j.k(h3);
                        e = k + i;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i6, obj)) {
                        int g2 = b1.d.g(j, obj);
                        i2 = j.i(i8);
                        g = j.g(g2);
                        e = g + i2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i6, obj)) {
                        e = j.e(i8);
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i6, obj)) {
                        e = j.d(i8);
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(i6, obj)) {
                        i7 = hrg.y(i8, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i6, obj)) {
                        Object i10 = b1.d.i(j, obj);
                        if (i10 instanceof g) {
                            int i11 = j.i(i8);
                            int size = ((g) i10).size();
                            i7 = hrg.h(size, size, i11, i7);
                            break;
                        } else {
                            i3 = j.i(i8);
                            h = j.h((String) i10);
                            i7 = h + i3 + i7;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (q(i6, obj)) {
                        Object i12 = b1.d.i(j, obj);
                        r0 n = n(i6);
                        Class cls = s0.a;
                        int i13 = j.i(i8);
                        int b = ((a) ((wzh) i12)).b(n);
                        i7 = hrg.h(b, b, i13, i7);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i6, obj)) {
                        e = j.b(i8, (g) b1.d.i(j, obj));
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i6, obj)) {
                        int g3 = b1.d.g(j, obj);
                        i2 = j.i(i8);
                        g = j.j(g3);
                        e = g + i2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i6, obj)) {
                        int g4 = b1.d.g(j, obj);
                        i2 = j.i(i8);
                        g = j.g(g4);
                        e = g + i2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i6, obj)) {
                        i7 = hrg.y(i8, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i6, obj)) {
                        i7 = hrg.y(i8, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i6, obj)) {
                        int g5 = b1.d.g(j, obj);
                        i2 = j.i(i8);
                        g = j.j((g5 >> 31) ^ (g5 << 1));
                        e = g + i2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i6, obj)) {
                        long h4 = b1.d.h(j, obj);
                        i4 = j.i(i8);
                        k2 = j.k((h4 >> 63) ^ (h4 << 1));
                        e = k2 + i4;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i6, obj)) {
                        e = j.f(i8, (wzh) b1.d.i(j, obj), n(i6));
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    f = s0.f(s(j, obj), i8);
                    i7 += f;
                    break;
                case 19:
                    f = s0.d(s(j, obj), i8);
                    i7 += f;
                    break;
                case 20:
                    f = s0.j(s(j, obj), i8);
                    i7 += f;
                    break;
                case 21:
                    f = s0.t(s(j, obj), i8);
                    i7 += f;
                    break;
                case 22:
                    f = s0.h(s(j, obj), i8);
                    i7 += f;
                    break;
                case 23:
                    f = s0.f(s(j, obj), i8);
                    i7 += f;
                    break;
                case 24:
                    f = s0.d(s(j, obj), i8);
                    i7 += f;
                    break;
                case 25:
                    List s = s(j, obj);
                    Class cls2 = s0.a;
                    int size2 = s.size();
                    i7 += size2 == 0 ? 0 : (j.i(i8) + 1) * size2;
                    break;
                case 26:
                    f = s0.q(s(j, obj), i8);
                    i7 += f;
                    break;
                case 27:
                    f = s0.l(i8, s(j, obj), n(i6));
                    i7 += f;
                    break;
                case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    f = s0.a(s(j, obj), i8);
                    i7 += f;
                    break;
                case 29:
                    f = s0.r(s(j, obj), i8);
                    i7 += f;
                    break;
                case 30:
                    f = s0.b(s(j, obj), i8);
                    i7 += f;
                    break;
                case com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    f = s0.d(s(j, obj), i8);
                    i7 += f;
                    break;
                case 32:
                    f = s0.f(s(j, obj), i8);
                    i7 += f;
                    break;
                case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    f = s0.m(s(j, obj), i8);
                    i7 += f;
                    break;
                case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    f = s0.o(s(j, obj), i8);
                    i7 += f;
                    break;
                case 35:
                    int g6 = s0.g((List) unsafe.getObject(obj, j));
                    if (g6 > 0) {
                        i7 = hrg.h(g6, j.i(i8), g6, i7);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    int e2 = s0.e((List) unsafe.getObject(obj, j));
                    if (e2 > 0) {
                        i7 = hrg.h(e2, j.i(i8), e2, i7);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k3 = s0.k((List) unsafe.getObject(obj, j));
                    if (k3 > 0) {
                        i7 = hrg.h(k3, j.i(i8), k3, i7);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u = s0.u((List) unsafe.getObject(obj, j));
                    if (u > 0) {
                        i7 = hrg.h(u, j.i(i8), u, i7);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i14 = s0.i((List) unsafe.getObject(obj, j));
                    if (i14 > 0) {
                        i7 = hrg.h(i14, j.i(i8), i14, i7);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g7 = s0.g((List) unsafe.getObject(obj, j));
                    if (g7 > 0) {
                        i7 = hrg.h(g7, j.i(i8), g7, i7);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e3 = s0.e((List) unsafe.getObject(obj, j));
                    if (e3 > 0) {
                        i7 = hrg.h(e3, j.i(i8), e3, i7);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls3 = s0.a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        i7 = hrg.h(size3, j.i(i8), size3, i7);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    int s2 = s0.s((List) unsafe.getObject(obj, j));
                    if (s2 > 0) {
                        i7 = hrg.h(s2, j.i(i8), s2, i7);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    int c = s0.c((List) unsafe.getObject(obj, j));
                    if (c > 0) {
                        i7 = hrg.h(c, j.i(i8), c, i7);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    int e4 = s0.e((List) unsafe.getObject(obj, j));
                    if (e4 > 0) {
                        i7 = hrg.h(e4, j.i(i8), e4, i7);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    int g8 = s0.g((List) unsafe.getObject(obj, j));
                    if (g8 > 0) {
                        i7 = hrg.h(g8, j.i(i8), g8, i7);
                        break;
                    } else {
                        break;
                    }
                case com.yandex.pulse.metrics.o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    int n2 = s0.n((List) unsafe.getObject(obj, j));
                    if (n2 > 0) {
                        i7 = hrg.h(n2, j.i(i8), n2, i7);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    int p2 = s0.p((List) unsafe.getObject(obj, j));
                    if (p2 > 0) {
                        i7 = hrg.h(p2, j.i(i8), p2, i7);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    List s3 = s(j, obj);
                    r0 n3 = n(i6);
                    Class cls4 = s0.a;
                    int size4 = s3.size();
                    if (size4 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i15 = 0; i15 < size4; i15++) {
                            i5 += j.f(i8, (wzh) s3.get(i15), n3);
                        }
                    }
                    i7 += i5;
                    break;
                case 50:
                    f = ((c0) this.n).a(i8, b1.d.i(j, obj), m(i6));
                    i7 += f;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (r(i8, i6, obj)) {
                        i7 = hrg.y(i8, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (r(i8, i6, obj)) {
                        i7 = hrg.y(i8, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (r(i8, i6, obj)) {
                        long A = A(j, obj);
                        i = j.i(i8);
                        k = j.k(A);
                        e = k + i;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (r(i8, i6, obj)) {
                        long A2 = A(j, obj);
                        i = j.i(i8);
                        k = j.k(A2);
                        e = k + i;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (r(i8, i6, obj)) {
                        int z = z(j, obj);
                        i2 = j.i(i8);
                        g = j.g(z);
                        e = g + i2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (r(i8, i6, obj)) {
                        e = j.e(i8);
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (r(i8, i6, obj)) {
                        e = j.d(i8);
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i8, i6, obj)) {
                        i7 = hrg.y(i8, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i8, i6, obj)) {
                        Object i16 = b1.d.i(j, obj);
                        if (i16 instanceof g) {
                            int i17 = j.i(i8);
                            int size5 = ((g) i16).size();
                            i7 = hrg.h(size5, size5, i17, i7);
                            break;
                        } else {
                            i3 = j.i(i8);
                            h = j.h((String) i16);
                            i7 = h + i3 + i7;
                            break;
                        }
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (r(i8, i6, obj)) {
                        Object i18 = b1.d.i(j, obj);
                        r0 n4 = n(i6);
                        Class cls5 = s0.a;
                        int i19 = j.i(i8);
                        int b2 = ((a) ((wzh) i18)).b(n4);
                        i7 = hrg.h(b2, b2, i19, i7);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i8, i6, obj)) {
                        e = j.b(i8, (g) b1.d.i(j, obj));
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i8, i6, obj)) {
                        int z2 = z(j, obj);
                        i2 = j.i(i8);
                        g = j.j(z2);
                        e = g + i2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i8, i6, obj)) {
                        int z3 = z(j, obj);
                        i2 = j.i(i8);
                        g = j.g(z3);
                        e = g + i2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (r(i8, i6, obj)) {
                        i7 = hrg.y(i8, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i8, i6, obj)) {
                        i7 = hrg.y(i8, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i8, i6, obj)) {
                        int z4 = z(j, obj);
                        i2 = j.i(i8);
                        g = j.j((z4 >> 31) ^ (z4 << 1));
                        e = g + i2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i8, i6, obj)) {
                        long A3 = A(j, obj);
                        i4 = j.i(i8);
                        k2 = j.k((A3 >> 63) ^ (A3 << 1));
                        e = k2 + i4;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i8, i6, obj)) {
                        e = j.f(i8, (wzh) b1.d.i(j, obj), n(i6));
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
            }
            i6 += 3;
        }
    }

    public final boolean q(int i, Object obj) {
        if (this.g) {
            int G = G(i);
            long j = G & 1048575;
            switch (F(G)) {
                case 0:
                    if (b1.d.e(j, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (b1.d.f(j, obj) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (b1.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (b1.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (b1.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (b1.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (b1.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return b1.d.c(j, obj);
                case 8:
                    Object i2 = b1.d.i(j, obj);
                    if (i2 instanceof String) {
                        return !((String) i2).isEmpty();
                    }
                    if (i2 instanceof g) {
                        return !g.b.equals(i2);
                    }
                    e7o.e();
                    return false;
                case 9:
                    if (b1.d.i(j, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !g.b.equals(b1.d.i(j, obj));
                case 11:
                    if (b1.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (b1.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (b1.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (b1.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (b1.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (b1.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (b1.d.i(j, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    e7o.e();
                    return false;
            }
        } else {
            if ((b1.d.g(r6 & 1048575, obj) & (1 << (this.a[i + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(int i, int i2, Object obj) {
        return b1.d.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void t(Object obj, int i, Object obj2, a1c a1cVar, q0 q0Var) {
        long G = G(i) & 1048575;
        Object i2 = b1.d.i(G, obj);
        b0 b0Var = this.n;
        if (i2 == null) {
            ((c0) b0Var).getClass();
            i2 = s9h.b.c();
            b1.o(G, obj, i2);
        } else {
            c0 c0Var = (c0) b0Var;
            c0Var.getClass();
            if (!((s9h) i2).a) {
                c0Var.getClass();
                s9h c = s9h.b.c();
                c0Var.b(c, i2);
                b1.o(G, obj, c);
                i2 = c;
            }
        }
        c0 c0Var2 = (c0) b0Var;
        c0Var2.getClass();
        c0Var2.getClass();
        q0Var.G((s9h) i2, ((a0) obj2).a, a1cVar);
    }

    public final void u(int i, Object obj, Object obj2) {
        long G = G(i) & 1048575;
        if (q(i, obj2)) {
            b1.d dVar = b1.d;
            Object i2 = dVar.i(G, obj);
            Object i3 = dVar.i(G, obj2);
            if (i2 != null && i3 != null) {
                b1.o(G, obj, u.c(i2, i3));
                D(i, obj);
            } else if (i3 != null) {
                b1.o(G, obj, i3);
                D(i, obj);
            }
        }
    }

    public final void v(int i, Object obj, Object obj2) {
        int G = G(i);
        int i2 = this.a[i];
        long j = G & 1048575;
        if (r(i2, i, obj2)) {
            b1.d dVar = b1.d;
            Object i3 = dVar.i(j, obj);
            Object i4 = dVar.i(j, obj2);
            if (i3 != null && i4 != null) {
                b1.o(j, obj, u.c(i3, i4));
                E(i2, i, obj);
            } else if (i4 != null) {
                b1.o(j, obj, i4);
                E(i2, i, obj);
            }
        }
    }
}
