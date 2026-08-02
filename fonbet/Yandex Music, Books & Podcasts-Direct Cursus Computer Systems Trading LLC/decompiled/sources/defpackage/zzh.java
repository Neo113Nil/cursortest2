package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.relay.common.proto.v;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class zzh implements wto {
    public static final int[] n = new int[0];
    public static final Unsafe o = dmt.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final vzh e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final b4j j;
    public final v8g k;
    public final nkt l;
    public final u9h m;

    public zzh(int[] iArr, Object[] objArr, int i, int i2, vzh vzhVar, int[] iArr2, int i3, int i4, b4j b4jVar, v8g v8gVar, nkt nktVar, c1c c1cVar, u9h u9hVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = vzhVar instanceof o3d;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = b4jVar;
        this.k = v8gVar;
        this.l = nktVar;
        this.e = vzhVar;
        this.m = u9hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzh B(djn djnVar, b4j b4jVar, v8g v8gVar, nkt nktVar, c1c c1cVar, u9h u9hVar) {
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
        Field N;
        int i25;
        char charAt10;
        int i26;
        int i27;
        Field N2;
        Field N3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        String str2 = djnVar.b;
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
        Object[] objArr2 = djnVar.c;
        Class<?> cls = djnVar.a.getClass();
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
                    if (i83 == 12 && (ouj.a(djnVar.a(), 1) || (charAt24 & 2048) != 0)) {
                        i27 = i80;
                        objArr3[hrg.B(i66, 3, 2, 1)] = objArr[i6];
                        i6++;
                    }
                    i27 = i80;
                }
                int i85 = i84 * 2;
                Object obj = objArr[i85];
                if (obj instanceof Field) {
                    N2 = (Field) obj;
                } else {
                    N2 = N((String) obj, cls);
                    objArr[i85] = N2;
                }
                int i86 = i63;
                i20 = i6;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(N2);
                int i87 = i85 + 1;
                Object obj2 = objArr[i87];
                if (obj2 instanceof Field) {
                    N3 = (Field) obj2;
                } else {
                    N3 = N((String) obj2, cls);
                    objArr[i87] = N3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(N3);
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
                Field N4 = N((String) objArr[i6], cls);
                if (i78 == 9 || i78 == 17) {
                    i18 = i88;
                    objArr3[hrg.B(i66, 3, 2, 1)] = N4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i18 = i88;
                        i26 = i6 + 2;
                        objArr3[hrg.B(i66, 3, 2, 1)] = objArr[i89];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i18 = i88;
                        if (djnVar.a() == 1 || (charAt24 & 2048) != 0) {
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(N4);
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
                                N = (Field) obj3;
                            } else {
                                N = N((String) obj3, cls);
                                objArr[i95] = N;
                            }
                            i20 = i19;
                            i21 = i66;
                            i22 = (int) unsafe.objectFieldOffset(N);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(N4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(N4);
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
        return new zzh(iArr3, objArr3, i2, i5, djnVar.a, iArr, i7, i63, b4jVar, v8gVar, nktVar, c1cVar, u9hVar);
    }

    public static long C(int i) {
        return i & 1048575;
    }

    public static int D(long j, Object obj) {
        return ((Integer) dmt.c.k(j, obj)).intValue();
    }

    public static long E(long j, Object obj) {
        return ((Long) dmt.c.k(j, obj)).longValue();
    }

    public static Field N(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
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
            throw new RuntimeException(u.toString(), e);
        }
    }

    public static int T(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (u(obj)) {
            return;
        }
        xq0.x(hrg.n(obj, "Mutating immutable message: "));
    }

    public static int m(byte[] bArr, int i, int i2, prv prvVar, Class cls, vx0 vx0Var) {
        switch (prvVar.ordinal()) {
            case 0:
                vx0Var.c = Double.valueOf(Double.longBitsToDouble(lg3.R(i, bArr)));
                return i + 8;
            case 1:
                vx0Var.c = Float.valueOf(Float.intBitsToFloat(lg3.Q(i, bArr)));
                return i + 4;
            case 2:
            case 3:
                int Y = lg3.Y(bArr, i, vx0Var);
                vx0Var.c = Long.valueOf(vx0Var.b);
                return Y;
            case 4:
            case 12:
            case 13:
                int W = lg3.W(bArr, i, vx0Var);
                vx0Var.c = Integer.valueOf(vx0Var.a);
                return W;
            case 5:
            case 15:
                vx0Var.c = Long.valueOf(lg3.R(i, bArr));
                return i + 8;
            case 6:
            case 14:
                vx0Var.c = Integer.valueOf(lg3.Q(i, bArr));
                return i + 4;
            case 7:
                int Y2 = lg3.Y(bArr, i, vx0Var);
                vx0Var.c = Boolean.valueOf(vx0Var.b != 0);
                return Y2;
            case 8:
                int W2 = lg3.W(bArr, i, vx0Var);
                int i3 = vx0Var.a;
                if (i3 < 0) {
                    throw bye.f();
                }
                if (i3 == 0) {
                    vx0Var.c = "";
                    return W2;
                }
                vx0Var.c = nut.a.y(bArr, W2, i3);
                return W2 + i3;
            case 9:
            default:
                wvs.p("unsupported field type.");
                return 0;
            case 10:
                wto a = yym.c.a(cls);
                o3d c = a.c();
                int q0 = lg3.q0(c, a, bArr, i, i2, vx0Var);
                a.a(c);
                vx0Var.c = c;
                return q0;
            case 11:
                return lg3.P(bArr, i, vx0Var);
            case 16:
                int W3 = lg3.W(bArr, i, vx0Var);
                vx0Var.c = Integer.valueOf(qr4.b(vx0Var.a));
                return W3;
            case 17:
                int Y3 = lg3.Y(bArr, i, vx0Var);
                vx0Var.c = Long.valueOf(qr4.c(vx0Var.b));
                return Y3;
        }
    }

    public static lkt r(Object obj) {
        o3d o3dVar = (o3d) obj;
        lkt lktVar = o3dVar.unknownFields;
        if (lktVar != lkt.f) {
            return lktVar;
        }
        lkt lktVar2 = new lkt();
        o3dVar.unknownFields = lktVar2;
        return lktVar2;
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof o3d) {
            return ((o3d) obj).isMutable();
        }
        return true;
    }

    public final Object A(int i, int i2, Object obj) {
        wto q = q(i2);
        if (!v(i, i2, obj)) {
            return q.c();
        }
        Object object = o.getObject(obj, U(i2) & 1048575);
        if (u(object)) {
            return object;
        }
        o3d c = q.c();
        if (object != null) {
            q.d(c, object);
        }
        return c;
    }

    public final int F(Object obj, byte[] bArr, int i, int i2, int i3, long j, vx0 vx0Var) {
        Unsafe unsafe = o;
        Object p = p(i3);
        Object object = unsafe.getObject(obj, j);
        this.m.getClass();
        if (!((r9h) object).a) {
            r9h d = r9h.b.d();
            u9h.a(d, object);
            unsafe.putObject(obj, j, d);
            object = d;
        }
        j6e j6eVar = ((l9h) p).a;
        r9h r9hVar = (r9h) object;
        int W = lg3.W(bArr, i, vx0Var);
        int i4 = vx0Var.a;
        if (i4 < 0 || i4 > i2 - W) {
            throw bye.h();
        }
        int i5 = W + i4;
        Object obj2 = 0;
        Object obj3 = v.c;
        while (W < i5) {
            int i6 = W + 1;
            int i7 = bArr[W];
            if (i7 < 0) {
                i6 = lg3.V(i7, bArr, i6, vx0Var);
                i7 = vx0Var.a;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 != 1) {
                if (i9 == 2) {
                    prv prvVar = (prv) j6eVar.b;
                    if (i10 == prvVar.b) {
                        W = m(bArr, i8, i2, prvVar, v.class, vx0Var);
                        obj3 = vx0Var.c;
                    }
                }
                W = lg3.t0(i7, bArr, i8, i2, vx0Var);
            } else {
                prv prvVar2 = (prv) j6eVar.a;
                if (i10 == prvVar2.b) {
                    W = m(bArr, i8, i2, prvVar2, null, vx0Var);
                    obj2 = vx0Var.c;
                } else {
                    W = lg3.t0(i7, bArr, i8, i2, vx0Var);
                }
            }
        }
        if (W != i5) {
            throw bye.g();
        }
        r9hVar.put(obj2, obj3);
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int G(Object obj, byte[] bArr, int i, int i2, int i3, vx0 vx0Var) {
        zzh zzhVar;
        int i4;
        Unsafe unsafe;
        Object obj2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe2;
        vx0 vx0Var2;
        Object obj3;
        byte[] bArr2;
        int i14;
        int i15;
        Unsafe unsafe3;
        int i16;
        Unsafe unsafe4;
        int i17;
        vx0 vx0Var3;
        byte[] bArr3;
        Unsafe unsafe5;
        vx0 vx0Var4;
        byte[] bArr4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        zzh zzhVar2 = this;
        Object obj4 = obj;
        byte[] bArr5 = bArr;
        int i23 = i2;
        vx0 vx0Var5 = vx0Var;
        l(obj4);
        Unsafe unsafe6 = o;
        int i24 = i;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1048575;
        int i29 = 0;
        while (true) {
            if (i24 < i23) {
                int i30 = i24 + 1;
                int i31 = bArr5[i24];
                if (i31 < 0) {
                    i30 = lg3.V(i31, bArr5, i30, vx0Var5);
                    i31 = vx0Var5.a;
                }
                int i32 = i30;
                int i33 = i31;
                int i34 = i33 >>> 3;
                int i35 = i33 & 7;
                int i36 = zzhVar2.d;
                int i37 = zzhVar2.c;
                if (i34 > i25) {
                    i7 = (i34 < i37 || i34 > i36) ? -1 : zzhVar2.Q(i34, i26 / 3);
                    i6 = 0;
                } else if (i34 < i37 || i34 > i36) {
                    i6 = 0;
                    i7 = -1;
                } else {
                    i6 = 0;
                    i7 = zzhVar2.Q(i34, 0);
                }
                int i38 = i7;
                if (i38 == -1) {
                    zzhVar = zzhVar2;
                    i8 = i32;
                    unsafe = unsafe6;
                    i9 = i34;
                    i38 = i6;
                    i10 = i33;
                    obj2 = obj4;
                } else {
                    int[] iArr = zzhVar2.a;
                    int i39 = iArr[i38 + 1];
                    int i40 = i6;
                    int T = T(i39);
                    long j = i39 & 1048575;
                    if (T <= 17) {
                        int i41 = iArr[i38 + 2];
                        int i42 = 1 << (i41 >>> 20);
                        int i43 = i41 & 1048575;
                        if (i43 != i28) {
                            if (i28 != 1048575) {
                                unsafe6.putInt(obj4, i28, i29);
                            }
                            i28 = i43;
                            i29 = i43 == 1048575 ? i40 : unsafe6.getInt(obj4, i43);
                        }
                        switch (T) {
                            case 0:
                                i11 = i34;
                                i12 = i33;
                                i13 = i32;
                                unsafe5 = unsafe6;
                                vx0 vx0Var6 = vx0Var5;
                                if (i35 != 1) {
                                    unsafe3 = unsafe5;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    dmt.c.o(obj, j, Double.longBitsToDouble(lg3.R(i13, bArr)));
                                    obj4 = obj;
                                    i24 = i13 + 8;
                                    i29 |= i42;
                                    i25 = i11;
                                    i23 = i2;
                                    bArr5 = bArr;
                                    vx0Var5 = vx0Var6;
                                    i26 = i38;
                                    unsafe6 = unsafe5;
                                    i27 = i12;
                                }
                            case 1:
                                i11 = i34;
                                i12 = i33;
                                i13 = i32;
                                unsafe5 = unsafe6;
                                vx0Var4 = vx0Var5;
                                bArr4 = bArr;
                                if (i35 != 5) {
                                    unsafe3 = unsafe5;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    dmt.c.p(obj4, j, Float.intBitsToFloat(lg3.Q(i13, bArr4)));
                                    i24 = i13 + 4;
                                    i29 |= i42;
                                    i23 = i2;
                                    bArr5 = bArr4;
                                    vx0Var5 = vx0Var4;
                                    i27 = i12;
                                    i26 = i38;
                                    unsafe6 = unsafe5;
                                    i25 = i11;
                                }
                            case 2:
                            case 3:
                                unsafe2 = unsafe6;
                                i11 = i34;
                                i12 = i33;
                                i13 = i32;
                                vx0Var4 = vx0Var5;
                                bArr4 = bArr;
                                if (i35 != 0) {
                                    unsafe3 = unsafe2;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    int Y = lg3.Y(bArr4, i13, vx0Var4);
                                    Object obj5 = obj4;
                                    unsafe2.putLong(obj5, j, vx0Var4.b);
                                    unsafe5 = unsafe2;
                                    obj4 = obj5;
                                    i29 |= i42;
                                    i23 = i2;
                                    i24 = Y;
                                    bArr5 = bArr4;
                                    vx0Var5 = vx0Var4;
                                    i27 = i12;
                                    i26 = i38;
                                    unsafe6 = unsafe5;
                                    i25 = i11;
                                }
                            case 4:
                            case 11:
                                unsafe2 = unsafe6;
                                i11 = i34;
                                i12 = i33;
                                i13 = i32;
                                vx0 vx0Var7 = vx0Var5;
                                if (i35 != 0) {
                                    unsafe3 = unsafe2;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    int W = lg3.W(bArr, i13, vx0Var7);
                                    unsafe2.putInt(obj4, j, vx0Var7.a);
                                    i29 |= i42;
                                    unsafe6 = unsafe2;
                                    bArr5 = bArr;
                                    vx0Var5 = vx0Var7;
                                    i23 = i2;
                                    i24 = W;
                                    i27 = i12;
                                    i26 = i38;
                                    i25 = i11;
                                }
                            case 5:
                            case 14:
                                vx0 vx0Var8 = vx0Var5;
                                i11 = i34;
                                i12 = i33;
                                i13 = i32;
                                Object obj6 = obj4;
                                if (i35 != 1) {
                                    obj4 = obj6;
                                    unsafe2 = unsafe6;
                                    unsafe3 = unsafe2;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    Unsafe unsafe7 = unsafe6;
                                    unsafe7.putLong(obj6, j, lg3.R(i13, bArr));
                                    obj4 = obj6;
                                    i24 = i13 + 8;
                                    i29 |= i42;
                                    unsafe6 = unsafe7;
                                    bArr5 = bArr;
                                    vx0Var5 = vx0Var8;
                                    i25 = i11;
                                    i23 = i2;
                                    i27 = i12;
                                    i26 = i38;
                                }
                            case 6:
                            case 13:
                                vx0Var2 = vx0Var5;
                                i11 = i34;
                                i12 = i33;
                                i13 = i32;
                                obj3 = obj4;
                                bArr2 = bArr;
                                if (i35 != 5) {
                                    obj4 = obj3;
                                    unsafe3 = unsafe6;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    unsafe6.putInt(obj3, j, lg3.Q(i13, bArr2));
                                    i14 = i13 + 4;
                                    i29 |= i42;
                                    int i44 = i14;
                                    bArr5 = bArr2;
                                    obj4 = obj3;
                                    vx0Var5 = vx0Var2;
                                    i24 = i44;
                                    i25 = i11;
                                    i23 = i2;
                                    i27 = i12;
                                    i26 = i38;
                                }
                            case 7:
                                vx0Var2 = vx0Var5;
                                i11 = i34;
                                i12 = i33;
                                i15 = i32;
                                obj3 = obj4;
                                bArr2 = bArr;
                                if (i35 != 0) {
                                    obj4 = obj3;
                                    i13 = i15;
                                    unsafe3 = unsafe6;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    i14 = lg3.Y(bArr2, i15, vx0Var2);
                                    dmt.c.m(obj3, j, vx0Var2.b != 0 ? 1 : i40);
                                    i29 |= i42;
                                    int i442 = i14;
                                    bArr5 = bArr2;
                                    obj4 = obj3;
                                    vx0Var5 = vx0Var2;
                                    i24 = i442;
                                    i25 = i11;
                                    i23 = i2;
                                    i27 = i12;
                                    i26 = i38;
                                }
                            case 8:
                                vx0Var2 = vx0Var5;
                                i11 = i34;
                                i12 = i33;
                                i15 = i32;
                                obj3 = obj4;
                                bArr2 = bArr;
                                if (i35 != 2) {
                                    obj4 = obj3;
                                    i13 = i15;
                                    unsafe3 = unsafe6;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    if ((i39 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                                        i14 = lg3.W(bArr2, i15, vx0Var2);
                                        i16 = vx0Var2.a;
                                        if (i16 < 0) {
                                            throw bye.f();
                                        }
                                        if (i16 == 0) {
                                            vx0Var2.c = "";
                                            unsafe6.putObject(obj3, j, vx0Var2.c);
                                            i29 |= i42;
                                            int i4422 = i14;
                                            bArr5 = bArr2;
                                            obj4 = obj3;
                                            vx0Var5 = vx0Var2;
                                            i24 = i4422;
                                        } else {
                                            vx0Var2.c = nut.a.y(bArr2, i14, i16);
                                            i14 += i16;
                                            unsafe6.putObject(obj3, j, vx0Var2.c);
                                            i29 |= i42;
                                            int i44222 = i14;
                                            bArr5 = bArr2;
                                            obj4 = obj3;
                                            vx0Var5 = vx0Var2;
                                            i24 = i44222;
                                        }
                                    } else {
                                        i14 = lg3.W(bArr2, i15, vx0Var2);
                                        i16 = vx0Var2.a;
                                        if (i16 < 0) {
                                            throw bye.f();
                                        }
                                        if (i16 == 0) {
                                            vx0Var2.c = "";
                                            unsafe6.putObject(obj3, j, vx0Var2.c);
                                            i29 |= i42;
                                            int i442222 = i14;
                                            bArr5 = bArr2;
                                            obj4 = obj3;
                                            vx0Var5 = vx0Var2;
                                            i24 = i442222;
                                        } else {
                                            vx0Var2.c = new String(bArr2, i14, i16, use.a);
                                            i14 += i16;
                                            unsafe6.putObject(obj3, j, vx0Var2.c);
                                            i29 |= i42;
                                            int i4422222 = i14;
                                            bArr5 = bArr2;
                                            obj4 = obj3;
                                            vx0Var5 = vx0Var2;
                                            i24 = i4422222;
                                        }
                                    }
                                    i25 = i11;
                                    i23 = i2;
                                    i27 = i12;
                                    i26 = i38;
                                }
                            case 9:
                                Unsafe unsafe8 = unsafe6;
                                i12 = i33;
                                vx0 vx0Var9 = vx0Var5;
                                if (i35 != 2) {
                                    vx0Var2 = vx0Var9;
                                    obj4 = obj4;
                                    unsafe3 = unsafe8;
                                    i11 = i34;
                                    i13 = i32;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    Object obj7 = obj4;
                                    Object z = zzhVar2.z(i38, obj7);
                                    unsafe6 = unsafe8;
                                    int q0 = lg3.q0(z, zzhVar2.q(i38), bArr, i32, i2, vx0Var9);
                                    zzhVar2.R(i38, obj7, z);
                                    i29 |= i42;
                                    bArr5 = bArr;
                                    obj4 = obj7;
                                    vx0Var5 = vx0Var9;
                                    i24 = q0;
                                    i23 = i2;
                                    i25 = i34;
                                    i27 = i12;
                                    i26 = i38;
                                }
                            case 10:
                                unsafe4 = unsafe6;
                                i12 = i33;
                                i17 = i32;
                                vx0Var3 = vx0Var5;
                                bArr3 = bArr;
                                if (i35 != 2) {
                                    unsafe3 = unsafe4;
                                    i11 = i34;
                                    i13 = i17;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    i24 = lg3.P(bArr3, i17, vx0Var3);
                                    unsafe4.putObject(obj4, j, vx0Var3.c);
                                    i29 |= i42;
                                    vx0 vx0Var10 = vx0Var3;
                                    unsafe6 = unsafe4;
                                    bArr5 = bArr3;
                                    vx0Var5 = vx0Var10;
                                    i23 = i2;
                                    i25 = i34;
                                    i27 = i12;
                                    i26 = i38;
                                }
                            case 12:
                                unsafe4 = unsafe6;
                                i12 = i33;
                                i17 = i32;
                                vx0 vx0Var11 = vx0Var5;
                                if (i35 != 0) {
                                    unsafe3 = unsafe4;
                                    i11 = i34;
                                    i13 = i17;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    int W2 = lg3.W(bArr, i17, vx0Var11);
                                    int i45 = vx0Var11.a;
                                    kse o2 = zzhVar2.o(i38);
                                    if ((i39 & Integer.MIN_VALUE) == 0 || o2 == null || o2.a(i45)) {
                                        unsafe4.putInt(obj4, j, i45);
                                        i29 |= i42;
                                    } else {
                                        r(obj4).f(i12, Long.valueOf(i45));
                                    }
                                    unsafe6 = unsafe4;
                                    bArr5 = bArr;
                                    vx0Var5 = vx0Var11;
                                    i24 = W2;
                                    i23 = i2;
                                    i25 = i34;
                                    i27 = i12;
                                    i26 = i38;
                                }
                            case 15:
                                unsafe4 = unsafe6;
                                i12 = i33;
                                i17 = i32;
                                vx0Var3 = vx0Var5;
                                bArr3 = bArr;
                                if (i35 != 0) {
                                    unsafe3 = unsafe4;
                                    i11 = i34;
                                    i13 = i17;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    i24 = lg3.W(bArr3, i17, vx0Var3);
                                    unsafe4.putInt(obj4, j, qr4.b(vx0Var3.a));
                                    i29 |= i42;
                                    vx0 vx0Var102 = vx0Var3;
                                    unsafe6 = unsafe4;
                                    bArr5 = bArr3;
                                    vx0Var5 = vx0Var102;
                                    i23 = i2;
                                    i25 = i34;
                                    i27 = i12;
                                    i26 = i38;
                                }
                            case 16:
                                vx0 vx0Var12 = vx0Var5;
                                i12 = i33;
                                i17 = i32;
                                if (i35 != 0) {
                                    unsafe4 = unsafe6;
                                    unsafe3 = unsafe4;
                                    i11 = i34;
                                    i13 = i17;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    int Y2 = lg3.Y(bArr, i17, vx0Var12);
                                    long c = qr4.c(vx0Var12.b);
                                    Object obj8 = obj4;
                                    Unsafe unsafe9 = unsafe6;
                                    unsafe9.putLong(obj8, j, c);
                                    obj4 = obj8;
                                    i29 |= i42;
                                    unsafe6 = unsafe9;
                                    bArr5 = bArr;
                                    vx0Var5 = vx0Var12;
                                    i23 = i2;
                                    i24 = Y2;
                                    i25 = i34;
                                    i27 = i12;
                                    i26 = i38;
                                }
                            case 17:
                                if (i35 != 3) {
                                    i12 = i33;
                                    unsafe3 = unsafe6;
                                    i11 = i34;
                                    i13 = i32;
                                    i9 = i11;
                                    zzhVar = zzhVar2;
                                    obj2 = obj4;
                                    unsafe = unsafe3;
                                    i8 = i13;
                                    i10 = i12;
                                    break;
                                } else {
                                    Object z2 = zzhVar2.z(i38, obj4);
                                    i12 = i33;
                                    i24 = lg3.p0(z2, zzhVar2.q(i38), bArr, i32, i2, (i34 << 3) | 4, vx0Var5);
                                    zzhVar2.R(i38, obj4, z2);
                                    i29 |= i42;
                                    vx0Var5 = vx0Var5;
                                    bArr5 = bArr;
                                    i23 = i2;
                                    i25 = i34;
                                    i27 = i12;
                                    i26 = i38;
                                }
                            default:
                                unsafe3 = unsafe6;
                                i11 = i34;
                                i12 = i33;
                                i13 = i32;
                                i9 = i11;
                                zzhVar = zzhVar2;
                                obj2 = obj4;
                                unsafe = unsafe3;
                                i8 = i13;
                                i10 = i12;
                                break;
                        }
                    } else {
                        Unsafe unsafe10 = unsafe6;
                        i11 = i34;
                        vx0 vx0Var13 = vx0Var5;
                        if (T != 27) {
                            if (T <= 49) {
                                unsafe = unsafe10;
                                i18 = i28;
                                i19 = i29;
                                int I = zzhVar2.I(obj, bArr, i32, i2, i33, i11, i35, i38, i39, T, j, vx0Var);
                                i20 = i33;
                                i38 = i38;
                                if (I != i32) {
                                    zzhVar2 = this;
                                    obj4 = obj;
                                    bArr5 = bArr;
                                    i23 = i2;
                                    vx0Var5 = vx0Var;
                                    i24 = I;
                                    i25 = i11;
                                } else {
                                    zzhVar = this;
                                    i8 = I;
                                    i9 = i11;
                                    i10 = i20;
                                    i28 = i18;
                                    i29 = i19;
                                    obj2 = obj;
                                }
                            } else {
                                unsafe = unsafe10;
                                i21 = i32;
                                i18 = i28;
                                i19 = i29;
                                i22 = i11;
                                i20 = i33;
                                if (T != 50) {
                                    i9 = i22;
                                    i10 = i20;
                                    int H = H(obj, bArr, i21, i2, i10, i9, i35, i39, T, j, i38, vx0Var);
                                    zzhVar = this;
                                    obj2 = obj;
                                    if (H != i21) {
                                        bArr5 = bArr;
                                        i23 = i2;
                                        i24 = H;
                                        zzhVar2 = zzhVar;
                                        obj4 = obj2;
                                        i28 = i18;
                                        i29 = i19;
                                        unsafe6 = unsafe;
                                        vx0Var5 = vx0Var;
                                        i27 = i10;
                                        i25 = i9;
                                        i26 = i38;
                                    } else {
                                        i8 = H;
                                        i28 = i18;
                                        i29 = i19;
                                    }
                                } else if (i35 == 2) {
                                    int F = F(obj, bArr, i21, i2, i38, j, vx0Var);
                                    if (F != i21) {
                                        zzhVar2 = this;
                                        obj4 = obj;
                                        bArr5 = bArr;
                                        i23 = i2;
                                        vx0Var5 = vx0Var;
                                        i24 = F;
                                        i25 = i22;
                                    } else {
                                        zzhVar = this;
                                        obj2 = obj;
                                        i8 = F;
                                        i9 = i22;
                                        i10 = i20;
                                        i28 = i18;
                                        i29 = i19;
                                    }
                                }
                            }
                            i27 = i20;
                            i26 = i38;
                            i28 = i18;
                            i29 = i19;
                            unsafe6 = unsafe;
                        } else if (i35 == 2) {
                            rse rseVar = (rse) unsafe10.getObject(obj4, j);
                            if (!((u8) rseVar).a) {
                                int size = rseVar.size();
                                rseVar = rseVar.b(size == 0 ? 10 : size * 2);
                                unsafe10.putObject(obj4, j, rseVar);
                            }
                            unsafe6 = unsafe10;
                            bArr5 = bArr;
                            i23 = i2;
                            vx0Var5 = vx0Var;
                            i24 = lg3.T(zzhVar2.q(i38), i33, bArr, i32, i2, rseVar, vx0Var13);
                            i27 = i33;
                            i26 = i38;
                            obj4 = obj;
                            i25 = i11;
                        } else {
                            unsafe = unsafe10;
                            i21 = i32;
                            i19 = i29;
                            i20 = i33;
                            i22 = i11;
                            i18 = i28;
                        }
                        zzhVar = this;
                        obj2 = obj;
                        i8 = i21;
                        i9 = i22;
                        i10 = i20;
                        i28 = i18;
                        i29 = i19;
                    }
                }
                if (i10 != i3 || i3 == 0) {
                    int i46 = i10;
                    int U = lg3.U(i46, bArr, i8, i2, r(obj2), vx0Var);
                    i23 = i2;
                    i27 = i46;
                    i25 = i9;
                    zzhVar2 = zzhVar;
                    obj4 = obj2;
                    i26 = i38;
                    unsafe6 = unsafe;
                    vx0Var5 = vx0Var;
                    i24 = U;
                    bArr5 = bArr;
                } else {
                    i4 = i2;
                    i5 = i8;
                    i27 = i10;
                }
            } else {
                zzhVar = zzhVar2;
                i4 = i23;
                unsafe = unsafe6;
                obj2 = obj4;
                i5 = i24;
            }
        }
        if (i28 != 1048575) {
            unsafe.putInt(obj2, i28, i29);
        }
        lkt lktVar = null;
        int i47 = zzhVar.h;
        while (i47 < zzhVar.i) {
            lktVar = (lkt) zzhVar.n(obj2, zzhVar.g[i47], lktVar, zzhVar.l, obj);
            i47++;
            obj2 = obj;
        }
        zzh zzhVar3 = zzhVar;
        if (lktVar != null) {
            zzhVar3.l.getClass();
            ((o3d) obj).unknownFields = lktVar;
        }
        if (i3 == 0) {
            if (i5 != i4) {
                throw bye.g();
            }
        } else if (i5 > i4 || i27 != i3) {
            throw bye.g();
        }
        return i5;
    }

    public final int H(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, vx0 vx0Var) {
        Unsafe unsafe = o;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(lg3.R(i, bArr))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(lg3.Q(i, bArr))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
            case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                int Y = lg3.Y(bArr, i, vx0Var);
                unsafe.putObject(obj, j, Long.valueOf(vx0Var.b));
                unsafe.putInt(obj, j2, i4);
                return Y;
            case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int W = lg3.W(bArr, i, vx0Var);
                unsafe.putObject(obj, j, Integer.valueOf(vx0Var.a));
                unsafe.putInt(obj, j2, i4);
                return W;
            case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(lg3.R(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
            case SQLiteDatabase.OPEN_URI /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(lg3.Q(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int Y2 = lg3.Y(bArr, i, vx0Var);
                unsafe.putObject(obj, j, Boolean.valueOf(vx0Var.b != 0));
                unsafe.putInt(obj, j2, i4);
                return Y2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int W2 = lg3.W(bArr, i, vx0Var);
                int i13 = vx0Var.a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                        if (nut.a.M(bArr, W2, W2 + i13) != 0) {
                            throw bye.c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, W2, i13, use.a));
                    W2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return W2;
            case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                Object A = A(i4, i8, obj);
                int q0 = lg3.q0(A, q(i8), bArr, i, i2, vx0Var);
                S(i4, obj, A, i8);
                return q0;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int P = lg3.P(bArr, i, vx0Var);
                unsafe.putObject(obj, j, vx0Var.c);
                unsafe.putInt(obj, j2, i4);
                return P;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int W3 = lg3.W(bArr, i, vx0Var);
                int i14 = vx0Var.a;
                kse o2 = o(i8);
                if (o2 != null && !o2.a(i14)) {
                    r(obj).f(i3, Long.valueOf(i14));
                    return W3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return W3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int W4 = lg3.W(bArr, i, vx0Var);
                unsafe.putObject(obj, j, Integer.valueOf(qr4.b(vx0Var.a)));
                unsafe.putInt(obj, j2, i4);
                return W4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int Y3 = lg3.Y(bArr, i, vx0Var);
                unsafe.putObject(obj, j, Long.valueOf(qr4.c(vx0Var.b)));
                unsafe.putInt(obj, j2, i4);
                return Y3;
            case 68:
                if (i5 == 3) {
                    Object A2 = A(i4, i8, obj);
                    int p0 = lg3.p0(A2, q(i8), bArr, i, i2, (i3 & (-8)) | 4, vx0Var);
                    S(i4, obj, A2, i8);
                    return p0;
                }
                break;
        }
        return i;
    }

    public final int I(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, vx0 vx0Var) {
        int i8;
        int i9;
        int X;
        Unsafe unsafe = o;
        rse rseVar = (rse) unsafe.getObject(obj, j2);
        if (!((u8) rseVar).a) {
            rseVar = rseVar.b(rseVar.size() * 2);
            unsafe.putObject(obj, j2, rseVar);
        }
        rse rseVar2 = rseVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 != 2) {
                    if (i5 != 1) {
                        return i;
                    }
                    o8a o8aVar = (o8a) rseVar2;
                    o8aVar.g(Double.longBitsToDouble(lg3.R(i, bArr)));
                    int i10 = i + 8;
                    while (i10 < i2) {
                        int W = lg3.W(bArr, i10, vx0Var);
                        if (i3 != vx0Var.a) {
                            return i10;
                        }
                        o8aVar.g(Double.longBitsToDouble(lg3.R(W, bArr)));
                        i10 = W + 8;
                    }
                    return i10;
                }
                o8a o8aVar2 = (o8a) rseVar2;
                int W2 = lg3.W(bArr, i, vx0Var);
                int i11 = vx0Var.a;
                int i12 = W2 + i11;
                if (i12 > bArr.length) {
                    throw bye.h();
                }
                int i13 = (i11 / 8) + o8aVar2.c;
                double[] dArr = o8aVar2.b;
                if (i13 > dArr.length) {
                    if (dArr.length == 0) {
                        o8aVar2.b = new double[Math.max(i13, 10)];
                    } else {
                        int length = dArr.length;
                        while (length < i13) {
                            length = v3w.c(length, 3, 2, 1, 10);
                        }
                        o8aVar2.b = Arrays.copyOf(o8aVar2.b, length);
                    }
                }
                while (W2 < i12) {
                    o8aVar2.g(Double.longBitsToDouble(lg3.R(W2, bArr)));
                    W2 += 8;
                }
                if (W2 == i12) {
                    return W2;
                }
                throw bye.h();
            case 19:
            case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                if (i5 != 2) {
                    if (i5 != 5) {
                        return i;
                    }
                    tic ticVar = (tic) rseVar2;
                    ticVar.g(Float.intBitsToFloat(lg3.Q(i, bArr)));
                    int i14 = i + 4;
                    while (i14 < i2) {
                        int W3 = lg3.W(bArr, i14, vx0Var);
                        if (i3 != vx0Var.a) {
                            return i14;
                        }
                        ticVar.g(Float.intBitsToFloat(lg3.Q(W3, bArr)));
                        i14 = W3 + 4;
                    }
                    return i14;
                }
                tic ticVar2 = (tic) rseVar2;
                int W4 = lg3.W(bArr, i, vx0Var);
                int i15 = vx0Var.a;
                int i16 = W4 + i15;
                if (i16 > bArr.length) {
                    throw bye.h();
                }
                int i17 = (i15 / 4) + ticVar2.c;
                float[] fArr = ticVar2.b;
                if (i17 > fArr.length) {
                    if (fArr.length == 0) {
                        ticVar2.b = new float[Math.max(i17, 10)];
                    } else {
                        int length2 = fArr.length;
                        while (length2 < i17) {
                            length2 = v3w.c(length2, 3, 2, 1, 10);
                        }
                        ticVar2.b = Arrays.copyOf(ticVar2.b, length2);
                    }
                }
                while (W4 < i16) {
                    ticVar2.g(Float.intBitsToFloat(lg3.Q(W4, bArr)));
                    W4 += 4;
                }
                if (W4 == i16) {
                    return W4;
                }
                throw bye.h();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    qug qugVar = (qug) rseVar2;
                    int W5 = lg3.W(bArr, i, vx0Var);
                    int i18 = vx0Var.a + W5;
                    while (W5 < i18) {
                        W5 = lg3.Y(bArr, W5, vx0Var);
                        qugVar.g(vx0Var.b);
                    }
                    if (W5 == i18) {
                        return W5;
                    }
                    throw bye.h();
                }
                if (i5 != 0) {
                    return i;
                }
                qug qugVar2 = (qug) rseVar2;
                int Y = lg3.Y(bArr, i, vx0Var);
                qugVar2.g(vx0Var.b);
                while (Y < i2) {
                    int W6 = lg3.W(bArr, Y, vx0Var);
                    if (i3 != vx0Var.a) {
                        return Y;
                    }
                    Y = lg3.Y(bArr, W6, vx0Var);
                    qugVar2.g(vx0Var.b);
                }
                return Y;
            case 22:
            case 29:
            case 39:
            case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                if (i5 != 2) {
                    return i5 == 0 ? lg3.X(i3, bArr, i, i2, rseVar2, vx0Var) : i;
                }
                ipe ipeVar = (ipe) rseVar2;
                int W7 = lg3.W(bArr, i, vx0Var);
                int i19 = vx0Var.a + W7;
                while (W7 < i19) {
                    W7 = lg3.W(bArr, W7, vx0Var);
                    ipeVar.g(vx0Var.a);
                }
                if (W7 == i19) {
                    return W7;
                }
                throw bye.h();
            case 23:
            case 32:
            case 40:
            case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                if (i5 != 2) {
                    if (i5 != 1) {
                        return i;
                    }
                    qug qugVar3 = (qug) rseVar2;
                    qugVar3.g(lg3.R(i, bArr));
                    int i20 = i + 8;
                    while (i20 < i2) {
                        int W8 = lg3.W(bArr, i20, vx0Var);
                        if (i3 != vx0Var.a) {
                            return i20;
                        }
                        qugVar3.g(lg3.R(W8, bArr));
                        i20 = W8 + 8;
                    }
                    return i20;
                }
                qug qugVar4 = (qug) rseVar2;
                int W9 = lg3.W(bArr, i, vx0Var);
                int i21 = vx0Var.a;
                int i22 = W9 + i21;
                if (i22 > bArr.length) {
                    throw bye.h();
                }
                int i23 = (i21 / 8) + qugVar4.c;
                long[] jArr = qugVar4.b;
                if (i23 > jArr.length) {
                    if (jArr.length == 0) {
                        qugVar4.b = new long[Math.max(i23, 10)];
                    } else {
                        int length3 = jArr.length;
                        while (length3 < i23) {
                            length3 = v3w.c(length3, 3, 2, 1, 10);
                        }
                        qugVar4.b = Arrays.copyOf(qugVar4.b, length3);
                    }
                }
                while (W9 < i22) {
                    qugVar4.g(lg3.R(W9, bArr));
                    W9 += 8;
                }
                if (W9 == i22) {
                    return W9;
                }
                throw bye.h();
            case 24:
            case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
            case 41:
            case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                if (i5 != 2) {
                    if (i5 != 5) {
                        return i;
                    }
                    ipe ipeVar2 = (ipe) rseVar2;
                    ipeVar2.g(lg3.Q(i, bArr));
                    int i24 = i + 4;
                    while (i24 < i2) {
                        int W10 = lg3.W(bArr, i24, vx0Var);
                        if (i3 != vx0Var.a) {
                            return i24;
                        }
                        ipeVar2.g(lg3.Q(W10, bArr));
                        i24 = W10 + 4;
                    }
                    return i24;
                }
                ipe ipeVar3 = (ipe) rseVar2;
                int W11 = lg3.W(bArr, i, vx0Var);
                int i25 = vx0Var.a;
                int i26 = W11 + i25;
                if (i26 > bArr.length) {
                    throw bye.h();
                }
                int i27 = (i25 / 4) + ipeVar3.c;
                int[] iArr = ipeVar3.b;
                if (i27 > iArr.length) {
                    if (iArr.length == 0) {
                        ipeVar3.b = new int[Math.max(i27, 10)];
                    } else {
                        int length4 = iArr.length;
                        while (length4 < i27) {
                            length4 = v3w.c(length4, 3, 2, 1, 10);
                        }
                        ipeVar3.b = Arrays.copyOf(ipeVar3.b, length4);
                    }
                }
                while (W11 < i26) {
                    ipeVar3.g(lg3.Q(W11, bArr));
                    W11 += 4;
                }
                if (W11 == i26) {
                    return W11;
                }
                throw bye.h();
            case 25:
            case 42:
                if (i5 == 2) {
                    fc3 fc3Var = (fc3) rseVar2;
                    int W12 = lg3.W(bArr, i, vx0Var);
                    int i28 = vx0Var.a + W12;
                    while (W12 < i28) {
                        W12 = lg3.Y(bArr, W12, vx0Var);
                        fc3Var.g(vx0Var.b != 0);
                    }
                    if (W12 == i28) {
                        return W12;
                    }
                    throw bye.h();
                }
                if (i5 != 0) {
                    return i;
                }
                fc3 fc3Var2 = (fc3) rseVar2;
                int Y2 = lg3.Y(bArr, i, vx0Var);
                fc3Var2.g(vx0Var.b != 0);
                while (Y2 < i2) {
                    int W13 = lg3.W(bArr, Y2, vx0Var);
                    if (i3 != vx0Var.a) {
                        return Y2;
                    }
                    Y2 = lg3.Y(bArr, W13, vx0Var);
                    fc3Var2.g(vx0Var.b != 0);
                }
                return Y2;
            case 26:
                if (i5 != 2) {
                    return i;
                }
                if ((j & 536870912) == 0) {
                    int W14 = lg3.W(bArr, i, vx0Var);
                    int i29 = vx0Var.a;
                    if (i29 < 0) {
                        throw bye.f();
                    }
                    if (i29 == 0) {
                        rseVar2.add("");
                    } else {
                        rseVar2.add(new String(bArr, W14, i29, use.a));
                        W14 += i29;
                    }
                    while (W14 < i2) {
                        int W15 = lg3.W(bArr, W14, vx0Var);
                        if (i3 != vx0Var.a) {
                            return W14;
                        }
                        W14 = lg3.W(bArr, W15, vx0Var);
                        int i30 = vx0Var.a;
                        if (i30 < 0) {
                            throw bye.f();
                        }
                        if (i30 == 0) {
                            rseVar2.add("");
                        } else {
                            rseVar2.add(new String(bArr, W14, i30, use.a));
                            W14 += i30;
                        }
                    }
                    return W14;
                }
                int W16 = lg3.W(bArr, i, vx0Var);
                int i31 = vx0Var.a;
                if (i31 < 0) {
                    throw bye.f();
                }
                if (i31 == 0) {
                    rseVar2.add("");
                } else {
                    int i32 = W16 + i31;
                    if (nut.a.M(bArr, W16, i32) != 0) {
                        throw bye.c();
                    }
                    rseVar2.add(new String(bArr, W16, i31, use.a));
                    W16 = i32;
                }
                while (W16 < i2) {
                    int W17 = lg3.W(bArr, W16, vx0Var);
                    if (i3 != vx0Var.a) {
                        return W16;
                    }
                    W16 = lg3.W(bArr, W17, vx0Var);
                    int i33 = vx0Var.a;
                    if (i33 < 0) {
                        throw bye.f();
                    }
                    if (i33 == 0) {
                        rseVar2.add("");
                    } else {
                        int i34 = W16 + i33;
                        if (nut.a.M(bArr, W16, i34) != 0) {
                            throw bye.c();
                        }
                        rseVar2.add(new String(bArr, W16, i33, use.a));
                        W16 = i34;
                    }
                }
                return W16;
            case 27:
                i8 = i;
                if (i5 == 2) {
                    return lg3.T(q(i6), i3, bArr, i8, i2, rseVar2, vx0Var);
                }
                return i8;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                i8 = i;
                if (i5 == 2) {
                    int W18 = lg3.W(bArr, i8, vx0Var);
                    int i35 = vx0Var.a;
                    if (i35 < 0) {
                        throw bye.f();
                    }
                    if (i35 > bArr.length - W18) {
                        throw bye.h();
                    }
                    if (i35 == 0) {
                        rseVar2.add(nn3.b);
                    } else {
                        rseVar2.add(nn3.n(bArr, W18, i35));
                        W18 += i35;
                    }
                    while (W18 < i2) {
                        int W19 = lg3.W(bArr, W18, vx0Var);
                        if (i3 != vx0Var.a) {
                            return W18;
                        }
                        W18 = lg3.W(bArr, W19, vx0Var);
                        int i36 = vx0Var.a;
                        if (i36 < 0) {
                            throw bye.f();
                        }
                        if (i36 > bArr.length - W18) {
                            throw bye.h();
                        }
                        if (i36 == 0) {
                            rseVar2.add(nn3.b);
                        } else {
                            rseVar2.add(nn3.n(bArr, W18, i36));
                            W18 += i36;
                        }
                    }
                    return W18;
                }
                return i8;
            case 30:
            case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                i9 = i;
                if (i5 != 2) {
                    if (i5 == 0) {
                        X = lg3.X(i3, bArr, i9, i2, rseVar2, vx0Var);
                    }
                    return i9;
                }
                ipe ipeVar4 = (ipe) rseVar2;
                X = lg3.W(bArr, i9, vx0Var);
                int i37 = vx0Var.a + X;
                while (X < i37) {
                    X = lg3.W(bArr, X, vx0Var);
                    ipeVar4.g(vx0Var.a);
                }
                if (X != i37) {
                    throw bye.h();
                }
                auo.j(obj, i4, rseVar2, o(i6), null, this.l);
                return X;
            case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
            case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                i9 = i;
                if (i5 == 2) {
                    ipe ipeVar5 = (ipe) rseVar2;
                    int W20 = lg3.W(bArr, i9, vx0Var);
                    int i38 = vx0Var.a + W20;
                    while (W20 < i38) {
                        W20 = lg3.W(bArr, W20, vx0Var);
                        ipeVar5.g(qr4.b(vx0Var.a));
                    }
                    if (W20 == i38) {
                        return W20;
                    }
                    throw bye.h();
                }
                if (i5 == 0) {
                    ipe ipeVar6 = (ipe) rseVar2;
                    int W21 = lg3.W(bArr, i9, vx0Var);
                    ipeVar6.g(qr4.b(vx0Var.a));
                    while (W21 < i2) {
                        int W22 = lg3.W(bArr, W21, vx0Var);
                        if (i3 != vx0Var.a) {
                            return W21;
                        }
                        W21 = lg3.W(bArr, W22, vx0Var);
                        ipeVar6.g(qr4.b(vx0Var.a));
                    }
                    return W21;
                }
                return i9;
            case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
            case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                i9 = i;
                if (i5 == 2) {
                    qug qugVar5 = (qug) rseVar2;
                    int W23 = lg3.W(bArr, i9, vx0Var);
                    int i39 = vx0Var.a + W23;
                    while (W23 < i39) {
                        W23 = lg3.Y(bArr, W23, vx0Var);
                        qugVar5.g(qr4.c(vx0Var.b));
                    }
                    if (W23 == i39) {
                        return W23;
                    }
                    throw bye.h();
                }
                if (i5 == 0) {
                    qug qugVar6 = (qug) rseVar2;
                    int Y3 = lg3.Y(bArr, i9, vx0Var);
                    qugVar6.g(qr4.c(vx0Var.b));
                    while (Y3 < i2) {
                        int W24 = lg3.W(bArr, Y3, vx0Var);
                        if (i3 != vx0Var.a) {
                            return Y3;
                        }
                        Y3 = lg3.Y(bArr, W24, vx0Var);
                        qugVar6.g(qr4.c(vx0Var.b));
                    }
                    return Y3;
                }
                return i9;
            case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                if (i5 == 3) {
                    wto q = q(i6);
                    int i40 = (i3 & (-8)) | 4;
                    int S = lg3.S(q, bArr, i, i2, i40, vx0Var);
                    wto wtoVar = q;
                    byte[] bArr2 = bArr;
                    rseVar2.add(vx0Var.c);
                    while (S < i2) {
                        int W25 = lg3.W(bArr2, S, vx0Var);
                        if (i3 != vx0Var.a) {
                            return S;
                        }
                        byte[] bArr3 = bArr2;
                        wto wtoVar2 = wtoVar;
                        S = lg3.S(wtoVar2, bArr3, W25, i2, i40, vx0Var);
                        rseVar2.add(vx0Var.c);
                        wtoVar = wtoVar2;
                        bArr2 = bArr3;
                    }
                    return S;
                }
            default:
                return i;
        }
    }

    public final void J(Object obj, long j, n8n n8nVar, wto wtoVar, z0c z0cVar) {
        int z;
        this.k.getClass();
        rse a = v8g.a(j, obj);
        qr4 qr4Var = (qr4) n8nVar.e;
        int i = n8nVar.b;
        if ((i & 7) != 3) {
            throw bye.d();
        }
        do {
            o3d c = wtoVar.c();
            n8nVar.m(c, wtoVar, z0cVar);
            wtoVar.a(c);
            a.add(c);
            if (qr4Var.e() || n8nVar.d != 0) {
                return;
            } else {
                z = qr4Var.z();
            }
        } while (z == i);
        n8nVar.d = z;
    }

    public final void K(Object obj, int i, n8n n8nVar, wto wtoVar, z0c z0cVar) {
        int z;
        this.k.getClass();
        rse a = v8g.a(i & 1048575, obj);
        qr4 qr4Var = (qr4) n8nVar.e;
        int i2 = n8nVar.b;
        if ((i2 & 7) != 2) {
            throw bye.d();
        }
        do {
            o3d c = wtoVar.c();
            n8nVar.o(c, wtoVar, z0cVar);
            wtoVar.a(c);
            a.add(c);
            if (qr4Var.e() || n8nVar.d != 0) {
                return;
            } else {
                z = qr4Var.z();
            }
        } while (z == i2);
        n8nVar.d = z;
    }

    public final void L(int i, n8n n8nVar, Object obj) {
        qr4 qr4Var = (qr4) n8nVar.e;
        if ((536870912 & i) != 0) {
            n8nVar.C0(2);
            dmt.p(i & 1048575, obj, qr4Var.y());
        } else if (!this.f) {
            dmt.p(i & 1048575, obj, n8nVar.v());
        } else {
            n8nVar.C0(2);
            dmt.p(i & 1048575, obj, qr4Var.x());
        }
    }

    public final void M(int i, n8n n8nVar, Object obj) {
        boolean z = (536870912 & i) != 0;
        v8g v8gVar = this.k;
        if (z) {
            v8gVar.getClass();
            n8nVar.o0(v8g.a(i & 1048575, obj), true);
        } else {
            v8gVar.getClass();
            n8nVar.o0(v8g.a(i & 1048575, obj), false);
        }
    }

    public final void O(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        dmt.n(j, obj, (1 << (i2 >>> 20)) | dmt.c.i(j, obj));
    }

    public final void P(int i, int i2, Object obj) {
        dmt.n(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int Q(int i, int i2) {
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

    public final void R(int i, Object obj, Object obj2) {
        o.putObject(obj, U(i) & 1048575, obj2);
        O(i, obj);
    }

    public final void S(int i, Object obj, Object obj2, int i2) {
        o.putObject(obj, U(i2) & 1048575, obj2);
        P(i, i2, obj);
    }

    public final int U(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void V(Object obj, rp7 rp7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        zzh zzhVar = this;
        int[] iArr = zzhVar.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int U = zzhVar.U(i7);
            int i9 = iArr[i7];
            int T = T(U);
            if (T <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = U;
                i2 = 1 << (i10 >>> 20);
            } else {
                i = U;
                i2 = 0;
            }
            long j = i & i5;
            switch (T) {
                case 0:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        double g = dmt.c.g(j, obj);
                        yr4 yr4Var = (yr4) rp7Var.a;
                        yr4Var.getClass();
                        yr4Var.p(i9, Double.doubleToRawLongBits(g));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        float h = dmt.c.h(j, obj);
                        yr4 yr4Var2 = (yr4) rp7Var.a;
                        yr4Var2.getClass();
                        yr4Var2.n(i9, Float.floatToRawIntBits(h));
                    }
                    zzhVar = this;
                    break;
                case 2:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).B(i9, unsafe.getLong(obj, j));
                    }
                    zzhVar = this;
                    break;
                case 3:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).B(i9, unsafe.getLong(obj, j));
                    }
                    zzhVar = this;
                    break;
                case 4:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).s(i9, unsafe.getInt(obj, j));
                    }
                    zzhVar = this;
                    break;
                case 5:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).p(i9, unsafe.getLong(obj, j));
                    }
                    zzhVar = this;
                    break;
                case 6:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).n(i9, unsafe.getInt(obj, j));
                    }
                    zzhVar = this;
                    break;
                case 7:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).j(i9, dmt.c.d(j, obj));
                    }
                    zzhVar = this;
                    break;
                case 8:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((yr4) rp7Var.a).w(i9, (String) object);
                        } else {
                            ((yr4) rp7Var.a).l(i9, (nn3) object);
                        }
                    }
                    zzhVar = this;
                    break;
                case 9:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        rp7Var.G(i9, unsafe.getObject(obj, j), zzhVar.q(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).l(i9, (nn3) unsafe.getObject(obj, j));
                    }
                    zzhVar = this;
                    break;
                case 11:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).z(i9, unsafe.getInt(obj, j));
                    }
                    zzhVar = this;
                    break;
                case 12:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).s(i9, unsafe.getInt(obj, j));
                    }
                    zzhVar = this;
                    break;
                case 13:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).n(i9, unsafe.getInt(obj, j));
                    }
                    zzhVar = this;
                    break;
                case 14:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).p(i9, unsafe.getLong(obj, j));
                    }
                    zzhVar = this;
                    break;
                case 15:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        int i12 = unsafe.getInt(obj, j);
                        ((yr4) rp7Var.a).z(i9, (i12 >> 31) ^ (i12 << 1));
                    }
                    zzhVar = this;
                    break;
                case 16:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((yr4) rp7Var.a).B(i9, (j2 >> 63) ^ (j2 << 1));
                    }
                    zzhVar = this;
                    break;
                case 17:
                    if (zzhVar.t(obj, i7, i6, i8, i2)) {
                        ((yr4) rp7Var.a).r(i9, (vzh) unsafe.getObject(obj, j), zzhVar.q(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i3 = i6;
                    auo.o(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 19:
                    i3 = i6;
                    auo.s(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 20:
                    i3 = i6;
                    auo.u(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 21:
                    i3 = i6;
                    auo.A(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 22:
                    i3 = i6;
                    auo.t(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 23:
                    i3 = i6;
                    auo.r(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 24:
                    i3 = i6;
                    auo.q(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 25:
                    i3 = i6;
                    auo.n(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 26:
                    i4 = i6;
                    int i13 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = auo.a;
                    if (list != null && !list.isEmpty()) {
                        yr4 yr4Var3 = (yr4) rp7Var.a;
                        if (list instanceof zvf) {
                            zvf zvfVar = (zvf) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object h2 = zvfVar.h();
                                if (h2 instanceof String) {
                                    yr4Var3.w(i13, (String) h2);
                                } else {
                                    yr4Var3.l(i13, (nn3) h2);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                yr4Var3.w(i13, (String) list.get(i15));
                            }
                        }
                    }
                    i6 = i4;
                    break;
                case 27:
                    i4 = i6;
                    int i16 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    wto q = zzhVar.q(i7);
                    Class cls2 = auo.a;
                    if (list2 != null && !list2.isEmpty()) {
                        rp7Var.getClass();
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            rp7Var.G(i16, list2.get(i17), q);
                        }
                    }
                    i6 = i4;
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    i4 = i6;
                    int i18 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = auo.a;
                    if (list3 != null && !list3.isEmpty()) {
                        rp7Var.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((yr4) rp7Var.a).l(i18, (nn3) list3.get(i19));
                        }
                    }
                    i6 = i4;
                    break;
                case 29:
                    i3 = i6;
                    z = false;
                    auo.z(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 30:
                    i3 = i6;
                    z = false;
                    auo.p(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    i3 = i6;
                    z = false;
                    auo.v(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 32:
                    i3 = i6;
                    z = false;
                    auo.w(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    i3 = i6;
                    z = false;
                    auo.x(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    i3 = i6;
                    z = false;
                    auo.y(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, false);
                    i6 = i3;
                    break;
                case 35:
                    i4 = i6;
                    auo.o(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    i4 = i6;
                    auo.s(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case 37:
                    i4 = i6;
                    auo.u(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case 38:
                    i4 = i6;
                    auo.A(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case 39:
                    i4 = i6;
                    auo.t(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case 40:
                    i4 = i6;
                    auo.r(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case 41:
                    i4 = i6;
                    auo.q(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case 42:
                    i4 = i6;
                    auo.n(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    i4 = i6;
                    auo.z(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    i4 = i6;
                    auo.p(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    i4 = i6;
                    auo.v(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    i4 = i6;
                    auo.w(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    i4 = i6;
                    auo.x(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    i4 = i6;
                    auo.y(iArr[i7], (List) unsafe.getObject(obj, j), rp7Var, true);
                    i6 = i4;
                    break;
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    i4 = i6;
                    int i20 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    wto q2 = zzhVar.q(i7);
                    Class cls4 = auo.a;
                    if (list4 != null && !list4.isEmpty()) {
                        rp7Var.getClass();
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            ((yr4) rp7Var.a).r(i20, (vzh) list4.get(i21), q2);
                        }
                    }
                    i6 = i4;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object p = zzhVar.p(i7);
                        zzhVar.m.getClass();
                        j6e j6eVar = ((l9h) p).a;
                        yr4 yr4Var4 = (yr4) rp7Var.a;
                        yr4Var4.getClass();
                        for (Map.Entry entry : ((r9h) object2).entrySet()) {
                            yr4Var4.y(i9, 2);
                            yr4Var4.A(l9h.a(j6eVar, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            f9c.e(yr4Var4, (prv) j6eVar.a, 1, key);
                            f9c.e(yr4Var4, (prv) j6eVar.b, 2, value);
                            i6 = i6;
                        }
                    }
                    i4 = i6;
                    i6 = i4;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (zzhVar.v(i9, i7, obj)) {
                        double doubleValue = ((Double) dmt.c.k(j, obj)).doubleValue();
                        yr4 yr4Var5 = (yr4) rp7Var.a;
                        yr4Var5.getClass();
                        yr4Var5.p(i9, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (zzhVar.v(i9, i7, obj)) {
                        float floatValue = ((Float) dmt.c.k(j, obj)).floatValue();
                        yr4 yr4Var6 = (yr4) rp7Var.a;
                        yr4Var6.getClass();
                        yr4Var6.n(i9, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).B(i9, E(j, obj));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).B(i9, E(j, obj));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).s(i9, D(j, obj));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).p(i9, E(j, obj));
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).n(i9, D(j, obj));
                    }
                    break;
                case 58:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).j(i9, ((Boolean) dmt.c.k(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (zzhVar.v(i9, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((yr4) rp7Var.a).w(i9, (String) object3);
                        } else {
                            ((yr4) rp7Var.a).l(i9, (nn3) object3);
                        }
                    }
                    break;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (zzhVar.v(i9, i7, obj)) {
                        rp7Var.G(i9, unsafe.getObject(obj, j), zzhVar.q(i7));
                    }
                    break;
                case 61:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).l(i9, (nn3) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).z(i9, D(j, obj));
                    }
                    break;
                case 63:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).s(i9, D(j, obj));
                    }
                    break;
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).n(i9, D(j, obj));
                    }
                    break;
                case 65:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).p(i9, E(j, obj));
                    }
                    break;
                case 66:
                    if (zzhVar.v(i9, i7, obj)) {
                        int D = D(j, obj);
                        ((yr4) rp7Var.a).z(i9, (D >> 31) ^ (D << 1));
                    }
                    break;
                case 67:
                    if (zzhVar.v(i9, i7, obj)) {
                        long E = E(j, obj);
                        ((yr4) rp7Var.a).B(i9, (E << 1) ^ (E >> 63));
                    }
                    break;
                case 68:
                    if (zzhVar.v(i9, i7, obj)) {
                        ((yr4) rp7Var.a).r(i9, (vzh) unsafe.getObject(obj, j), zzhVar.q(i7));
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        zzhVar.l.getClass();
        ((o3d) obj).unknownFields.g(rp7Var);
    }

    @Override // defpackage.wto
    public final void a(Object obj) {
        if (u(obj)) {
            if (obj instanceof o3d) {
                o3d o3dVar = (o3d) obj;
                o3dVar.clearMemoizedSerializedSize();
                o3dVar.clearMemoizedHashCode();
                o3dVar.markImmutable();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int U = U(i);
                long j = 1048575 & U;
                int T = T(U);
                if (T != 9) {
                    if (T != 60 && T != 68) {
                        switch (T) {
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
                                u8 u8Var = (u8) ((rse) dmt.c.k(j, obj));
                                if (u8Var.a) {
                                    u8Var.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((r9h) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (v(iArr[i], i, obj)) {
                        q(i).a(o.getObject(obj, j));
                    }
                }
                if (s(i, obj)) {
                    q(i).a(o.getObject(obj, j));
                }
            }
            this.l.getClass();
            lkt lktVar = ((o3d) obj).unknownFields;
            if (lktVar.e) {
                lktVar.e = false;
            }
        }
    }

    @Override // defpackage.wto
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
            int U = U(i7);
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
            if ((268435456 & U) == 0 || t(obj, i2, i, i3, i11)) {
                int T = T(U);
                if (T == 9 || T == 17) {
                    if (t(obj, i2, i, i3, i11)) {
                        if (!q(i2).b(dmt.c.k(U & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (T != 27) {
                        if (T == 60 || T == 68) {
                            if (v(i8, i2, obj)) {
                                if (!q(i2).b(dmt.c.k(U & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (T != 49) {
                            if (T != 50) {
                                continue;
                            } else {
                                Object k = dmt.c.k(U & 1048575, obj);
                                this.m.getClass();
                                r9h r9hVar = (r9h) k;
                                if (!r9hVar.isEmpty() && ((prv) ((l9h) p(i2)).a.b).a == qrv.MESSAGE) {
                                    wto wtoVar = null;
                                    for (Object obj2 : r9hVar.values()) {
                                        if (wtoVar == null) {
                                            wtoVar = yym.c.a(obj2.getClass());
                                        }
                                        if (!wtoVar.b(obj2)) {
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) dmt.c.k(U & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        wto q = q(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (q.b(list.get(i13))) {
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

    @Override // defpackage.wto
    public final o3d c() {
        this.j.getClass();
        return ((o3d) this.e).newMutableInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.wto
    public final void d(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                auo.k(this.l, obj, obj2);
                return;
            }
            int U = U(i);
            long j = 1048575 & U;
            int i2 = iArr[i];
            switch (T(U)) {
                case 0:
                    if (s(i, obj2)) {
                        amt amtVar = dmt.c;
                        obj3 = obj;
                        amtVar.o(obj3, j, amtVar.g(j, obj2));
                        O(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (s(i, obj2)) {
                        amt amtVar2 = dmt.c;
                        amtVar2.p(obj, j, amtVar2.h(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i, obj2)) {
                        dmt.o(obj, j, dmt.c.j(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i, obj2)) {
                        dmt.o(obj, j, dmt.c.j(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i, obj2)) {
                        dmt.n(j, obj, dmt.c.i(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i, obj2)) {
                        dmt.o(obj, j, dmt.c.j(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i, obj2)) {
                        dmt.n(j, obj, dmt.c.i(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i, obj2)) {
                        amt amtVar3 = dmt.c;
                        amtVar3.m(obj, j, amtVar3.d(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i, obj2)) {
                        dmt.p(j, obj, dmt.c.k(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i, obj2)) {
                        dmt.p(j, obj, dmt.c.k(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (s(i, obj2)) {
                        dmt.n(j, obj, dmt.c.i(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i, obj2)) {
                        dmt.n(j, obj, dmt.c.i(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i, obj2)) {
                        dmt.n(j, obj, dmt.c.i(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i, obj2)) {
                        dmt.o(obj, j, dmt.c.j(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i, obj2)) {
                        dmt.n(j, obj, dmt.c.i(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i, obj2)) {
                        dmt.o(obj, j, dmt.c.j(j, obj2));
                        O(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    x(i, obj, obj2);
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
                    amt amtVar4 = dmt.c;
                    rse rseVar = (rse) amtVar4.k(j, obj);
                    rse rseVar2 = (rse) amtVar4.k(j, obj2);
                    int size = rseVar.size();
                    int size2 = rseVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((u8) rseVar).a) {
                            rseVar = rseVar.b(size2 + size);
                        }
                        rseVar.addAll(rseVar2);
                    }
                    if (size > 0) {
                        rseVar2 = rseVar;
                    }
                    dmt.p(j, obj, rseVar2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = auo.a;
                    amt amtVar5 = dmt.c;
                    Object k = amtVar5.k(j, obj);
                    Object k2 = amtVar5.k(j, obj2);
                    this.m.getClass();
                    dmt.p(j, obj, u9h.a(k, k2));
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
                    if (v(i2, i, obj2)) {
                        dmt.p(j, obj, dmt.c.k(j, obj2));
                        P(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    y(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case SQLiteDatabase.OPEN_URI /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (v(i2, i, obj2)) {
                        dmt.p(j, obj, dmt.c.k(j, obj2));
                        P(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    y(i, obj, obj2);
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
    @Override // defpackage.wto
    public final void e(java.lang.Object r20, defpackage.n8n r21, defpackage.z0c r22) {
        /*
            Method dump skipped, instructions count: 2496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzh.e(java.lang.Object, n8n, z0c):void");
    }

    @Override // defpackage.wto
    public final void f(Object obj, rp7 rp7Var) {
        rp7Var.getClass();
        V(obj, rp7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (defpackage.auo.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (defpackage.auo.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (defpackage.auo.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (defpackage.auo.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.d(r7, r12) == r5.d(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.h(r7, r12)) == java.lang.Float.floatToIntBits(r5.h(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.g(r7, r12)) == java.lang.Double.doubleToLongBits(r5.g(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (defpackage.auo.l(r9.k(r7, r12), r9.k(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.wto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(o3d o3dVar, o3d o3dVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int U = U(i);
                long j = U & 1048575;
                switch (T(U)) {
                    case 0:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar2 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar3 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar4 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar5 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar6 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar7 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar8 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar9 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar10 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar11 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar12 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar13 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar14 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar15 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar16 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar17 = dmt.c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (k(o3dVar, o3dVar2, i)) {
                            amt amtVar18 = dmt.c;
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
                        amt amtVar19 = dmt.c;
                        z = auo.l(amtVar19.k(j, o3dVar), amtVar19.k(j, o3dVar2));
                        break;
                    case 50:
                        amt amtVar20 = dmt.c;
                        z = auo.l(amtVar20.k(j, o3dVar), amtVar20.k(j, o3dVar2));
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
                        amt amtVar21 = dmt.c;
                        if (amtVar21.i(j2, o3dVar) == amtVar21.i(j2, o3dVar2)) {
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
                if (o3dVar.unknownFields.equals(o3dVar2.unknownFields)) {
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
    @Override // defpackage.wto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(o3d o3dVar) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int U = U(i4);
            int i5 = iArr[i4];
            long j = 1048575 & U;
            int i6 = 1237;
            int i7 = 37;
            switch (T(U)) {
                case 0:
                    i = i3 * 53;
                    b = use.b(Double.doubleToLongBits(dmt.c.g(j, o3dVar)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(dmt.c.h(j, o3dVar));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = use.b(dmt.c.j(j, o3dVar));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = use.b(dmt.c.j(j, o3dVar));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = dmt.c.i(j, o3dVar);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = use.b(dmt.c.j(j, o3dVar));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = dmt.c.i(j, o3dVar);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean d = dmt.c.d(j, o3dVar);
                    Charset charset = use.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) dmt.c.k(j, o3dVar)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object k = dmt.c.k(j, o3dVar);
                    if (k != null) {
                        i7 = k.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = dmt.c.k(j, o3dVar).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = dmt.c.i(j, o3dVar);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = dmt.c.i(j, o3dVar);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = dmt.c.i(j, o3dVar);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = use.b(dmt.c.j(j, o3dVar));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = dmt.c.i(j, o3dVar);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = use.b(dmt.c.j(j, o3dVar));
                    i3 = b + i;
                    break;
                case 17:
                    Object k2 = dmt.c.k(j, o3dVar);
                    if (k2 != null) {
                        i7 = k2.hashCode();
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
                    b = dmt.c.k(j, o3dVar).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = dmt.c.k(j, o3dVar).hashCode();
                    i3 = b + i;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = use.b(Double.doubleToLongBits(((Double) dmt.c.k(j, o3dVar)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) dmt.c.k(j, o3dVar)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = use.b(E(j, o3dVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = use.b(E(j, o3dVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = D(j, o3dVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = use.b(E(j, o3dVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = D(j, o3dVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(i5, i4, o3dVar)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) dmt.c.k(j, o3dVar)).booleanValue();
                        Charset charset2 = use.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = ((String) dmt.c.k(j, o3dVar)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = dmt.c.k(j, o3dVar).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = dmt.c.k(j, o3dVar).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = D(j, o3dVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = D(j, o3dVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = D(j, o3dVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = use.b(E(j, o3dVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = D(j, o3dVar);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = use.b(E(j, o3dVar));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(i5, i4, o3dVar)) {
                        i = i3 * 53;
                        b = dmt.c.k(j, o3dVar).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return o3dVar.unknownFields.hashCode() + (i3 * 53);
    }

    @Override // defpackage.wto
    public final void i(Object obj, byte[] bArr, int i, int i2, vx0 vx0Var) {
        G(obj, bArr, i, i2, 0, vx0Var);
    }

    @Override // defpackage.wto
    public final int j(o3d o3dVar) {
        int i;
        int e;
        int e2;
        int e3;
        int g;
        int e4;
        int g2;
        int e5;
        int e6;
        int a;
        int e7;
        int serializedSize;
        int c;
        int e8;
        int size;
        int i2;
        int e9;
        int e10;
        int size2;
        int e11;
        int f;
        int i3;
        int i4;
        int e12;
        int f2;
        zzh zzhVar = this;
        o3d o3dVar2 = o3dVar;
        Unsafe unsafe = o;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = zzhVar.a;
            if (i6 >= iArr.length) {
                zzhVar.l.getClass();
                return o3dVar2.unknownFields.c() + i8;
            }
            int U = zzhVar.U(i6);
            int T = T(U);
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & 1048575;
            if (T <= 17) {
                if (i11 != i5) {
                    i7 = i11 == 1048575 ? 0 : unsafe.getInt(o3dVar2, i11);
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = U & 1048575;
            if (T >= j9c.b.a) {
                int i12 = j9c.c.a;
            }
            switch (T) {
                case 0:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        e = yr4.e(i9);
                        c = e + 8;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        e2 = yr4.e(i9);
                        e6 = e2 + 4;
                        i8 += e6;
                    }
                    zzhVar = this;
                    o3dVar2 = o3dVar;
                    break;
                case 2:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(o3dVar2, j);
                        e3 = yr4.e(i9);
                        g = yr4.g(j2);
                        i8 += g + e3;
                    }
                    zzhVar = this;
                    break;
                case 3:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(o3dVar2, j);
                        e3 = yr4.e(i9);
                        g = yr4.g(j3);
                        i8 += g + e3;
                    }
                    zzhVar = this;
                    break;
                case 4:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        int i13 = unsafe.getInt(o3dVar2, j);
                        e4 = yr4.e(i9);
                        g2 = yr4.g(i13);
                        a = g2 + e4;
                        i8 += a;
                    }
                    zzhVar = this;
                    break;
                case 5:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        e5 = yr4.e(i9);
                        e6 = e5 + 8;
                        i8 += e6;
                    }
                    zzhVar = this;
                    o3dVar2 = o3dVar;
                    break;
                case 6:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        e2 = yr4.e(i9);
                        e6 = e2 + 4;
                        i8 += e6;
                    }
                    zzhVar = this;
                    o3dVar2 = o3dVar;
                    break;
                case 7:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        e6 = yr4.e(i9) + 1;
                        i8 += e6;
                    }
                    zzhVar = this;
                    o3dVar2 = o3dVar;
                    break;
                case 8:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        Object object = unsafe.getObject(o3dVar2, j);
                        i8 = (object instanceof nn3 ? yr4.a(i9, (nn3) object) : yr4.d((String) object) + yr4.e(i9)) + i8;
                    }
                    zzhVar = this;
                    break;
                case 9:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(o3dVar2, j);
                        wto q = zzhVar.q(i6);
                        Class cls = auo.a;
                        int e13 = yr4.e(i9);
                        int serializedSize2 = ((c8) object2).getSerializedSize(q);
                        i8 += yr4.f(serializedSize2) + serializedSize2 + e13;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        a = yr4.a(i9, (nn3) unsafe.getObject(o3dVar2, j));
                        i8 += a;
                    }
                    zzhVar = this;
                    break;
                case 11:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(o3dVar2, j);
                        e4 = yr4.e(i9);
                        g2 = yr4.f(i14);
                        a = g2 + e4;
                        i8 += a;
                    }
                    zzhVar = this;
                    break;
                case 12:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        int i15 = unsafe.getInt(o3dVar2, j);
                        e4 = yr4.e(i9);
                        g2 = yr4.g(i15);
                        a = g2 + e4;
                        i8 += a;
                    }
                    zzhVar = this;
                    break;
                case 13:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        e2 = yr4.e(i9);
                        e6 = e2 + 4;
                        i8 += e6;
                    }
                    zzhVar = this;
                    o3dVar2 = o3dVar;
                    break;
                case 14:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        e5 = yr4.e(i9);
                        e6 = e5 + 8;
                        i8 += e6;
                    }
                    zzhVar = this;
                    o3dVar2 = o3dVar;
                    break;
                case 15:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        int i16 = unsafe.getInt(o3dVar2, j);
                        e4 = yr4.e(i9);
                        g2 = yr4.b(i16);
                        a = g2 + e4;
                        i8 += a;
                    }
                    zzhVar = this;
                    break;
                case 16:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        long j4 = unsafe.getLong(o3dVar2, j);
                        e3 = yr4.e(i9);
                        g = yr4.c(j4);
                        i8 += g + e3;
                    }
                    zzhVar = this;
                    break;
                case 17:
                    if (zzhVar.t(o3dVar2, i6, i5, i7, i)) {
                        vzh vzhVar = (vzh) unsafe.getObject(o3dVar2, j);
                        wto q2 = zzhVar.q(i6);
                        e7 = yr4.e(i9) * 2;
                        serializedSize = ((c8) vzhVar).getSerializedSize(q2);
                        c = serializedSize + e7;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c = auo.c((List) unsafe.getObject(o3dVar2, j), i9);
                    i8 += c;
                    break;
                case 19:
                    c = auo.b((List) unsafe.getObject(o3dVar2, j), i9);
                    i8 += c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(o3dVar2, j);
                    Class cls2 = auo.a;
                    if (list.size() != 0) {
                        e8 = (yr4.e(i9) * list.size()) + auo.e(list);
                        i8 += e8;
                        break;
                    }
                    e8 = 0;
                    i8 += e8;
                case 21:
                    List list2 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls3 = auo.a;
                    size = list2.size();
                    if (size != 0) {
                        i2 = auo.i(list2);
                        e9 = yr4.e(i9);
                        e8 = (e9 * size) + i2;
                        i8 += e8;
                        break;
                    }
                    e8 = 0;
                    i8 += e8;
                case 22:
                    List list3 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls4 = auo.a;
                    size = list3.size();
                    if (size != 0) {
                        i2 = auo.d(list3);
                        e9 = yr4.e(i9);
                        e8 = (e9 * size) + i2;
                        i8 += e8;
                        break;
                    }
                    e8 = 0;
                    i8 += e8;
                case 23:
                    c = auo.c((List) unsafe.getObject(o3dVar2, j), i9);
                    i8 += c;
                    break;
                case 24:
                    c = auo.b((List) unsafe.getObject(o3dVar2, j), i9);
                    i8 += c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls5 = auo.a;
                    int size3 = list4.size();
                    i8 += size3 == 0 ? 0 : (yr4.e(i9) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls6 = auo.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        e8 = yr4.e(i9) * size4;
                        if (list5 instanceof zvf) {
                            zvf zvfVar = (zvf) list5;
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object h = zvfVar.h();
                                if (h instanceof nn3) {
                                    int size5 = ((nn3) h).size();
                                    e8 = yr4.f(size5) + size5 + e8;
                                } else {
                                    e8 = yr4.d((String) h) + e8;
                                }
                            }
                        } else {
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object obj = list5.get(i18);
                                if (obj instanceof nn3) {
                                    int size6 = ((nn3) obj).size();
                                    e8 = yr4.f(size6) + size6 + e8;
                                } else {
                                    e8 = yr4.d((String) obj) + e8;
                                }
                            }
                        }
                        i8 += e8;
                        break;
                    }
                    e8 = 0;
                    i8 += e8;
                case 27:
                    List list6 = (List) unsafe.getObject(o3dVar2, j);
                    wto q3 = zzhVar.q(i6);
                    Class cls7 = auo.a;
                    int size7 = list6.size();
                    if (size7 != 0) {
                        e10 = yr4.e(i9) * size7;
                        for (int i19 = 0; i19 < size7; i19++) {
                            int serializedSize3 = ((c8) list6.get(i19)).getSerializedSize(q3);
                            e10 += yr4.f(serializedSize3) + serializedSize3;
                        }
                        i8 += e10;
                        break;
                    }
                    e10 = 0;
                    i8 += e10;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    List list7 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls8 = auo.a;
                    int size8 = list7.size();
                    if (size8 != 0) {
                        e8 = yr4.e(i9) * size8;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            int size9 = ((nn3) list7.get(i20)).size();
                            e8 += yr4.f(size9) + size9;
                        }
                        i8 += e8;
                        break;
                    }
                    e8 = 0;
                    i8 += e8;
                case 29:
                    List list8 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls9 = auo.a;
                    size = list8.size();
                    if (size != 0) {
                        i2 = auo.h(list8);
                        e9 = yr4.e(i9);
                        e8 = (e9 * size) + i2;
                        i8 += e8;
                        break;
                    }
                    e8 = 0;
                    i8 += e8;
                case 30:
                    List list9 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls10 = auo.a;
                    size = list9.size();
                    if (size != 0) {
                        i2 = auo.a(list9);
                        e9 = yr4.e(i9);
                        e8 = (e9 * size) + i2;
                        i8 += e8;
                        break;
                    }
                    e8 = 0;
                    i8 += e8;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    c = auo.b((List) unsafe.getObject(o3dVar2, j), i9);
                    i8 += c;
                    break;
                case 32:
                    c = auo.c((List) unsafe.getObject(o3dVar2, j), i9);
                    i8 += c;
                    break;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    List list10 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls11 = auo.a;
                    size = list10.size();
                    if (size != 0) {
                        i2 = auo.f(list10);
                        e9 = yr4.e(i9);
                        e8 = (e9 * size) + i2;
                        i8 += e8;
                        break;
                    }
                    e8 = 0;
                    i8 += e8;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls12 = auo.a;
                    size = list11.size();
                    if (size != 0) {
                        i2 = auo.g(list11);
                        e9 = yr4.e(i9);
                        e8 = (e9 * size) + i2;
                        i8 += e8;
                        break;
                    }
                    e8 = 0;
                    i8 += e8;
                case 35:
                    List list12 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls13 = auo.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls14 = auo.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = auo.e((List) unsafe.getObject(o3dVar2, j));
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = auo.i((List) unsafe.getObject(o3dVar2, j));
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = auo.d((List) unsafe.getObject(o3dVar2, j));
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls15 = auo.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls16 = auo.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls17 = auo.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    size2 = auo.h((List) unsafe.getObject(o3dVar2, j));
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    size2 = auo.a((List) unsafe.getObject(o3dVar2, j));
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls18 = auo.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    List list18 = (List) unsafe.getObject(o3dVar2, j);
                    Class cls19 = auo.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    size2 = auo.f((List) unsafe.getObject(o3dVar2, j));
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    size2 = auo.g((List) unsafe.getObject(o3dVar2, j));
                    if (size2 > 0) {
                        e11 = yr4.e(i9);
                        f = yr4.f(size2);
                        i3 = f + e11;
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    List list19 = (List) unsafe.getObject(o3dVar2, j);
                    wto q4 = zzhVar.q(i6);
                    Class cls20 = auo.a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i21 = 0; i21 < size10; i21++) {
                            i4 += ((c8) ((vzh) list19.get(i21))).getSerializedSize(q4) + (yr4.e(i9) * 2);
                        }
                    }
                    i8 += i4;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(o3dVar2, j);
                    Object p = zzhVar.p(i6);
                    zzhVar.m.getClass();
                    r9h r9hVar = (r9h) object3;
                    l9h l9hVar = (l9h) p;
                    if (!r9hVar.isEmpty()) {
                        e10 = 0;
                        for (Map.Entry entry : r9hVar.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            l9hVar.getClass();
                            int e14 = yr4.e(i9);
                            int a2 = l9h.a(l9hVar.a, key, value);
                            e10 += yr4.f(a2) + a2 + e14;
                        }
                        i8 += e10;
                        break;
                    }
                    e10 = 0;
                    i8 += e10;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        e = yr4.e(i9);
                        c = e + 8;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        e12 = yr4.e(i9);
                        c = e12 + 4;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        long E = E(j, o3dVar2);
                        size2 = yr4.e(i9);
                        i3 = yr4.g(E);
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        long E2 = E(j, o3dVar2);
                        size2 = yr4.e(i9);
                        i3 = yr4.g(E2);
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        int D = D(j, o3dVar2);
                        e7 = yr4.e(i9);
                        serializedSize = yr4.g(D);
                        c = serializedSize + e7;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        e = yr4.e(i9);
                        c = e + 8;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        e12 = yr4.e(i9);
                        c = e12 + 4;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        c = yr4.e(i9) + 1;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        Object object4 = unsafe.getObject(o3dVar2, j);
                        i8 = (object4 instanceof nn3 ? yr4.a(i9, (nn3) object4) : yr4.d((String) object4) + yr4.e(i9)) + i8;
                        break;
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        Object object5 = unsafe.getObject(o3dVar2, j);
                        wto q5 = zzhVar.q(i6);
                        Class cls21 = auo.a;
                        int e15 = yr4.e(i9);
                        int serializedSize4 = ((c8) object5).getSerializedSize(q5);
                        f2 = yr4.f(serializedSize4) + serializedSize4 + e15;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        c = yr4.a(i9, (nn3) unsafe.getObject(o3dVar2, j));
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        int D2 = D(j, o3dVar2);
                        e7 = yr4.e(i9);
                        serializedSize = yr4.f(D2);
                        c = serializedSize + e7;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        int D3 = D(j, o3dVar2);
                        e7 = yr4.e(i9);
                        serializedSize = yr4.g(D3);
                        c = serializedSize + e7;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        e12 = yr4.e(i9);
                        c = e12 + 4;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        e = yr4.e(i9);
                        c = e + 8;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        int D4 = D(j, o3dVar2);
                        e7 = yr4.e(i9);
                        serializedSize = yr4.b(D4);
                        c = serializedSize + e7;
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        long E3 = E(j, o3dVar2);
                        size2 = yr4.e(i9);
                        i3 = yr4.c(E3);
                        f2 = i3 + size2;
                        i8 += f2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzhVar.v(i9, i6, o3dVar2)) {
                        c = ((c8) ((vzh) unsafe.getObject(o3dVar2, j))).getSerializedSize(zzhVar.q(i6)) + (yr4.e(i9) * 2);
                        i8 += c;
                        break;
                    } else {
                        break;
                    }
            }
            i6 += 3;
        }
    }

    public final boolean k(o3d o3dVar, o3d o3dVar2, int i) {
        return s(i, o3dVar) == s(i, o3dVar2);
    }

    public final Object n(Object obj, int i, Object obj2, nkt nktVar, Object obj3) {
        kse o2;
        int i2 = this.a[i];
        Object k = dmt.c.k(U(i) & 1048575, obj);
        if (k == null || (o2 = o(i)) == null) {
            return obj2;
        }
        this.m.getClass();
        j6e j6eVar = ((l9h) p(i)).a;
        Iterator it = ((r9h) k).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!o2.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    nktVar.getClass();
                    obj2 = nkt.a(obj3);
                }
                int a = l9h.a(j6eVar, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a];
                Logger logger = yr4.b;
                sr4 sr4Var = new sr4(bArr, 0, a);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    f9c.e(sr4Var, (prv) j6eVar.a, 1, key);
                    f9c.e(sr4Var, (prv) j6eVar.b, 2, value);
                    if (sr4Var.D() != 0) {
                        xq0.q("Did not write as much data as expected.");
                        return null;
                    }
                    kn3 kn3Var = new kn3(bArr);
                    nktVar.getClass();
                    ((lkt) obj2).f((i2 << 3) | 2, kn3Var);
                    it.remove();
                } catch (IOException e) {
                    b6e.q(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final kse o(int i) {
        return (kse) this.b[hrg.B(i, 3, 2, 1)];
    }

    public final Object p(int i) {
        return this.b[(i / 3) * 2];
    }

    public final wto q(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        wto wtoVar = (wto) objArr[i2];
        if (wtoVar != null) {
            return wtoVar;
        }
        wto a = yym.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final boolean s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int U = U(i);
            long j2 = U & 1048575;
            switch (T(U)) {
                case 0:
                    if (Double.doubleToRawLongBits(dmt.c.g(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(dmt.c.h(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (dmt.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (dmt.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (dmt.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (dmt.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (dmt.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return dmt.c.d(j2, obj);
                case 8:
                    Object k = dmt.c.k(j2, obj);
                    if (k instanceof String) {
                        return !((String) k).isEmpty();
                    }
                    if (k instanceof nn3) {
                        return !nn3.b.equals(k);
                    }
                    e7o.e();
                    return false;
                case 9:
                    if (dmt.c.k(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !nn3.b.equals(dmt.c.k(j2, obj));
                case 11:
                    if (dmt.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (dmt.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (dmt.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (dmt.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (dmt.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (dmt.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (dmt.c.k(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    e7o.e();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & dmt.c.i(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean t(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? s(i, obj) : (i3 & i4) != 0;
    }

    public final boolean v(int i, int i2, Object obj) {
        return dmt.c.i((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        r0.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(Object obj, int i, Object obj2, z0c z0cVar, n8n n8nVar) {
        long U = U(i) & 1048575;
        Object k = dmt.c.k(U, obj);
        u9h u9hVar = this.m;
        if (k == null) {
            u9hVar.getClass();
            k = r9h.b.d();
            dmt.p(U, obj, k);
        } else {
            u9hVar.getClass();
            if (!((r9h) k).a) {
                r9h d = r9h.b.d();
                u9h.a(d, k);
                dmt.p(U, obj, d);
                k = d;
            }
        }
        u9hVar.getClass();
        r9h r9hVar = (r9h) k;
        j6e j6eVar = ((l9h) obj2).a;
        n8nVar.C0(2);
        qr4 qr4Var = (qr4) n8nVar.e;
        int i2 = qr4Var.i(qr4Var.A());
        Object obj3 = 0;
        Object obj4 = v.c;
        while (true) {
            try {
                int h = n8nVar.h();
                if (h == Integer.MAX_VALUE || qr4Var.e()) {
                    break;
                }
                if (h == 1) {
                    obj3 = n8nVar.G((prv) j6eVar.a, null, null);
                } else if (h != 2) {
                    try {
                        if (!n8nVar.E0()) {
                            throw new bye("Unable to parse map entry.");
                        }
                    } catch (yxe e) {
                        if (!n8nVar.E0()) {
                            throw new bye("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    obj4 = n8nVar.G((prv) j6eVar.b, v.class, z0cVar);
                }
            } catch (Throwable th) {
                qr4Var.h(i2);
                throw th;
            }
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            long U = U(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, U);
            if (object == null) {
                tuh.b(this.a[i], obj2);
                return;
            }
            wto q = q(i);
            if (!s(i, obj)) {
                if (u(object)) {
                    o3d c = q.c();
                    q.d(c, object);
                    unsafe.putObject(obj, U, c);
                } else {
                    unsafe.putObject(obj, U, object);
                }
                O(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, U);
            if (!u(object2)) {
                o3d c2 = q.c();
                q.d(c2, object2);
                unsafe.putObject(obj, U, c2);
                object2 = c2;
            }
            q.d(object2, object);
        }
    }

    public final void y(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (v(i2, i, obj2)) {
            long U = U(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, U);
            if (object == null) {
                tuh.b(iArr[i], obj2);
                return;
            }
            wto q = q(i);
            if (!v(i2, i, obj)) {
                if (u(object)) {
                    o3d c = q.c();
                    q.d(c, object);
                    unsafe.putObject(obj, U, c);
                } else {
                    unsafe.putObject(obj, U, object);
                }
                P(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, U);
            if (!u(object2)) {
                o3d c2 = q.c();
                q.d(c2, object2);
                unsafe.putObject(obj, U, c2);
                object2 = c2;
            }
            q.d(object2, object);
        }
    }

    public final Object z(int i, Object obj) {
        wto q = q(i);
        long U = U(i) & 1048575;
        if (!s(i, obj)) {
            return q.c();
        }
        Object object = o.getObject(obj, U);
        if (u(object)) {
            return object;
        }
        o3d c = q.c();
        if (object != null) {
            q.d(c, object);
        }
        return c;
    }
}
