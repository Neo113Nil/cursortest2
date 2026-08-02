package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class enx implements knx {
    public static final int[] g = new int[0];
    public static final Unsafe h = ynx.i();
    public final int[] a;
    public final Object[] b;
    public final slx c;
    public final int[] d;
    public final int e;
    public final l3l f;

    public enx(int[] iArr, Object[] objArr, slx slxVar, int[] iArr2, int i, l3l l3lVar, euk eukVar) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i;
        this.f = l3lVar;
        this.c = slxVar;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof jmx) {
            return ((jmx) obj).h();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static enx j(jnx jnxVar, l3l l3lVar, euk eukVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char charAt3;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        int i10;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        int i14;
        int i15;
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        int objectFieldOffset;
        int i19;
        String str;
        char c;
        int i20;
        int i21;
        int i22;
        int i23;
        Field q;
        char charAt9;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field q2;
        Object obj2;
        Field q3;
        int i30;
        char charAt10;
        int i31;
        int i32;
        char charAt11;
        int i33;
        char charAt12;
        int i34;
        char charAt13;
        if (!(jnxVar instanceof jnx)) {
            jnxVar.getClass();
            l1j.f();
            return null;
        }
        String str2 = jnxVar.b;
        int length = str2.length();
        char c2 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i = i35 + 1;
                if (str2.charAt(i35) < 55296) {
                    break;
                }
                i35 = i;
            }
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int charAt14 = str2.charAt(i);
        if (charAt14 >= 55296) {
            int i37 = charAt14 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                charAt13 = str2.charAt(i36);
                if (charAt13 < 55296) {
                    break;
                }
                i37 |= (charAt13 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            charAt14 = i37 | (charAt13 << i38);
            i36 = i34;
        }
        if (charAt14 == 0) {
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            i4 = 0;
            iArr = g;
            i3 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt15 = str2.charAt(i36);
            if (charAt15 >= 55296) {
                int i40 = charAt15 & 8191;
                int i41 = 13;
                while (true) {
                    i12 = i39 + 1;
                    charAt8 = str2.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i12;
                }
                charAt15 = i40 | (charAt8 << i41);
                i39 = i12;
            }
            int i42 = i39 + 1;
            int charAt16 = str2.charAt(i39);
            if (charAt16 >= 55296) {
                int i43 = charAt16 & 8191;
                int i44 = 13;
                while (true) {
                    i11 = i42 + 1;
                    charAt7 = str2.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i11;
                }
                charAt16 = i43 | (charAt7 << i44);
                i42 = i11;
            }
            int i45 = i42 + 1;
            if (str2.charAt(i42) >= 55296) {
                while (true) {
                    i10 = i45 + 1;
                    if (str2.charAt(i45) < 55296) {
                        break;
                    }
                    i45 = i10;
                }
                i45 = i10;
            }
            int i46 = i45 + 1;
            if (str2.charAt(i45) >= 55296) {
                while (true) {
                    i9 = i46 + 1;
                    if (str2.charAt(i46) < 55296) {
                        break;
                    }
                    i46 = i9;
                }
                i46 = i9;
            }
            int i47 = i46 + 1;
            charAt = str2.charAt(i46);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i8 = i47 + 1;
                    charAt6 = str2.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i8;
                }
                charAt = i48 | (charAt6 << i49);
                i47 = i8;
            }
            int i50 = i47 + 1;
            charAt2 = str2.charAt(i47);
            if (charAt2 >= 55296) {
                int i51 = charAt2 & 8191;
                int i52 = 13;
                while (true) {
                    i7 = i50 + 1;
                    charAt5 = str2.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i7;
                }
                charAt2 = i51 | (charAt5 << i52);
                i50 = i7;
            }
            int i53 = i50 + 1;
            int charAt17 = str2.charAt(i50);
            if (charAt17 >= 55296) {
                int i54 = charAt17 & 8191;
                int i55 = 13;
                while (true) {
                    i6 = i53 + 1;
                    charAt4 = str2.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i6;
                }
                charAt17 = i54 | (charAt4 << i55);
                i53 = i6;
            }
            int i56 = i53 + 1;
            int charAt18 = str2.charAt(i53);
            if (charAt18 >= 55296) {
                int i57 = charAt18 & 8191;
                int i58 = 13;
                while (true) {
                    i5 = i56 + 1;
                    charAt3 = str2.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i5;
                }
                charAt18 = i57 | (charAt3 << i58);
                i56 = i5;
            }
            int i59 = charAt18 + charAt2 + charAt17;
            i2 = charAt15 + charAt15 + charAt16;
            i3 = charAt15;
            i36 = i56;
            iArr = new int[i59];
            i4 = charAt18;
        }
        Unsafe unsafe = h;
        Object[] objArr2 = jnxVar.c;
        Class<?> cls = jnxVar.a.getClass();
        int i60 = charAt2 + i4;
        int i61 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i61];
        int i62 = i4;
        int i63 = 0;
        int i64 = 0;
        while (i36 < length) {
            int i65 = i36 + 1;
            int charAt19 = str2.charAt(i36);
            if (charAt19 >= c2) {
                int i66 = charAt19 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i33 = i67 + 1;
                    charAt12 = str2.charAt(i67);
                    if (charAt12 < c2) {
                        break;
                    }
                    i66 |= (charAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i33;
                }
                charAt19 = i66 | (charAt12 << i68);
                i13 = i33;
            } else {
                i13 = i65;
            }
            int i69 = i13 + 1;
            int charAt20 = str2.charAt(i13);
            if (charAt20 >= c2) {
                int i70 = charAt20 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i32 = i71 + 1;
                    charAt11 = str2.charAt(i71);
                    i14 = length;
                    if (charAt11 < 55296) {
                        break;
                    }
                    i70 |= (charAt11 & 8191) << i72;
                    i72 += 13;
                    i71 = i32;
                    length = i14;
                }
                charAt20 = i70 | (charAt11 << i72);
                i15 = i32;
            } else {
                i14 = length;
                i15 = i69;
            }
            if ((charAt20 & 1024) != 0) {
                iArr[i63] = i64;
                i63++;
            }
            int i73 = charAt20 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i74 = charAt19;
            int i75 = charAt20 & 2048;
            if (i73 >= 51) {
                int i76 = i15 + 1;
                int charAt21 = str2.charAt(i15);
                if (charAt21 >= 55296) {
                    int i77 = charAt21 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i30 = i78 + 1;
                        charAt10 = str2.charAt(i78);
                        i31 = i77;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i77 = i31 | ((charAt10 & 8191) << i79);
                        i79 += 13;
                        i78 = i30;
                    }
                    charAt21 = i31 | (charAt10 << i79);
                    i27 = i30;
                } else {
                    i27 = i76;
                }
                int i80 = charAt21;
                int i81 = i73 - 51;
                int i82 = i27;
                if (i81 == 9 || i81 == 17) {
                    i28 = i2 + 1;
                    int i83 = i64 / 3;
                    objArr3[i83 + i83 + 1] = objArr2[i2];
                } else {
                    if (i81 == 12) {
                        if (jnxVar.a() == 1 || i75 != 0) {
                            i28 = i2 + 1;
                            int i84 = i64 / 3;
                            objArr3[i84 + i84 + 1] = objArr2[i2];
                        } else {
                            i29 = 0;
                            int i85 = i80 + i80;
                            obj = objArr2[i85];
                            int i86 = i29;
                            if (obj instanceof Field) {
                                q2 = (Field) obj;
                            } else {
                                q2 = q((String) obj, cls);
                                objArr2[i85] = q2;
                            }
                            int i87 = i3;
                            objArr = objArr3;
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(q2);
                            int i88 = i85 + 1;
                            obj2 = objArr2[i88];
                            if (obj2 instanceof Field) {
                                q3 = (Field) obj2;
                            } else {
                                q3 = q((String) obj2, cls);
                                objArr2[i88] = q3;
                            }
                            i16 = i87;
                            i18 = i86;
                            str = str2;
                            i17 = i2;
                            i22 = 0;
                            c = 55296;
                            i19 = (int) unsafe.objectFieldOffset(q3);
                            i23 = objectFieldOffset2;
                            i20 = i82;
                        }
                    }
                    i29 = i75;
                    int i852 = i80 + i80;
                    obj = objArr2[i852];
                    int i862 = i29;
                    if (obj instanceof Field) {
                    }
                    int i872 = i3;
                    objArr = objArr3;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(q2);
                    int i882 = i852 + 1;
                    obj2 = objArr2[i882];
                    if (obj2 instanceof Field) {
                    }
                    i16 = i872;
                    i18 = i862;
                    str = str2;
                    i17 = i2;
                    i22 = 0;
                    c = 55296;
                    i19 = (int) unsafe.objectFieldOffset(q3);
                    i23 = objectFieldOffset22;
                    i20 = i82;
                }
                i2 = i28;
                i29 = i75;
                int i8522 = i80 + i80;
                obj = objArr2[i8522];
                int i8622 = i29;
                if (obj instanceof Field) {
                }
                int i8722 = i3;
                objArr = objArr3;
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(q2);
                int i8822 = i8522 + 1;
                obj2 = objArr2[i8822];
                if (obj2 instanceof Field) {
                }
                i16 = i8722;
                i18 = i8622;
                str = str2;
                i17 = i2;
                i22 = 0;
                c = 55296;
                i19 = (int) unsafe.objectFieldOffset(q3);
                i23 = objectFieldOffset222;
                i20 = i82;
            } else {
                int i89 = i3;
                objArr = objArr3;
                int i90 = i2 + 1;
                Field q4 = q((String) objArr2[i2], cls);
                i16 = i89;
                if (i73 == 9 || i73 == 17) {
                    i17 = i90;
                    int i91 = i64 / 3;
                    objArr[i91 + i91 + 1] = q4.getType();
                } else {
                    if (i73 == 27) {
                        i24 = i90;
                        i25 = 1;
                        i26 = i2 + 2;
                    } else if (i73 == 49) {
                        i26 = i2 + 2;
                        i24 = i90;
                        i25 = 1;
                    } else {
                        if (i73 == 12 || i73 == 30 || i73 == 44) {
                            i17 = i90;
                            if (jnxVar.a() == 1 || i75 != 0) {
                                i26 = i2 + 2;
                                int i92 = i64 / 3;
                                objArr[i92 + i92 + 1] = objArr2[i17];
                                i17 = i26;
                            }
                        } else if (i73 == 50) {
                            int i93 = i2 + 2;
                            int i94 = i62 + 1;
                            iArr[i62] = i64;
                            int i95 = i64 / 3;
                            int i96 = i95 + i95;
                            objArr[i96] = objArr2[i90];
                            if (i75 != 0) {
                                objArr[i96 + 1] = objArr2[i93];
                                i18 = i75;
                                i62 = i94;
                                i17 = i2 + 3;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(q4);
                                i19 = 1048575;
                                if ((charAt20 & 4096) != 0 || i73 > 17) {
                                    str = str2;
                                    c = 55296;
                                    i20 = i15;
                                    i21 = 0;
                                } else {
                                    int i97 = i15 + 1;
                                    int charAt22 = str2.charAt(i15);
                                    if (charAt22 >= 55296) {
                                        int i98 = charAt22 & 8191;
                                        int i99 = 13;
                                        while (true) {
                                            i20 = i97 + 1;
                                            charAt9 = str2.charAt(i97);
                                            if (charAt9 < 55296) {
                                                break;
                                            }
                                            i98 |= (charAt9 & 8191) << i99;
                                            i99 += 13;
                                            i97 = i20;
                                        }
                                        charAt22 = i98 | (charAt9 << i99);
                                    } else {
                                        i20 = i97;
                                    }
                                    int i100 = (charAt22 / 32) + i16 + i16;
                                    Object obj3 = objArr2[i100];
                                    if (obj3 instanceof Field) {
                                        q = (Field) obj3;
                                    } else {
                                        q = q((String) obj3, cls);
                                        objArr2[i100] = q;
                                    }
                                    str = str2;
                                    i21 = charAt22 % 32;
                                    i19 = (int) unsafe.objectFieldOffset(q);
                                    c = 55296;
                                }
                                if (i73 >= 18 && i73 <= 49) {
                                    iArr[i60] = objectFieldOffset;
                                    i60++;
                                }
                                i22 = i21;
                                i23 = objectFieldOffset;
                            } else {
                                i62 = i94;
                                i17 = i93;
                            }
                        } else {
                            i17 = i90;
                        }
                        i18 = 0;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(q4);
                        i19 = 1048575;
                        if ((charAt20 & 4096) != 0) {
                        }
                        str = str2;
                        c = 55296;
                        i20 = i15;
                        i21 = 0;
                        if (i73 >= 18) {
                            iArr[i60] = objectFieldOffset;
                            i60++;
                        }
                        i22 = i21;
                        i23 = objectFieldOffset;
                    }
                    int i101 = i64 / 3;
                    objArr[i101 + i101 + i25] = objArr2[i24];
                    i17 = i26;
                }
                i18 = i75;
                objectFieldOffset = (int) unsafe.objectFieldOffset(q4);
                i19 = 1048575;
                if ((charAt20 & 4096) != 0) {
                }
                str = str2;
                c = 55296;
                i20 = i15;
                i21 = 0;
                if (i73 >= 18) {
                }
                i22 = i21;
                i23 = objectFieldOffset;
            }
            int i102 = i64 + 1;
            iArr2[i64] = i74;
            int i103 = i64 + 2;
            int i104 = i22;
            iArr2[i102] = ((charAt20 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt20 & 256) != 0 ? 268435456 : 0) | (i18 != 0 ? Integer.MIN_VALUE : 0) | (i73 << 20) | i23;
            i64 += 3;
            iArr2[i103] = (i104 << 20) | i19;
            str2 = str;
            i36 = i20;
            length = i14;
            i3 = i16;
            i2 = i17;
            c2 = c;
            objArr3 = objArr;
        }
        return new enx(iArr2, objArr3, jnxVar.a, iArr, i4, l3lVar, eukVar);
    }

    public static int k(long j, Object obj) {
        return ((Integer) ynx.h(j, obj)).intValue();
    }

    public static int m(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long o(long j, Object obj) {
        return ((Long) ynx.h(j, obj)).longValue();
    }

    public static Field q(String str, Class cls) {
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

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        continue;
     */
    @Override // defpackage.knx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof jmx) {
            jmx jmxVar = (jmx) obj;
            jmxVar.g();
            jmxVar.zza = 0;
            jmxVar.e();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.f.getClass();
                mnx mnxVar = ((jmx) obj).zzc;
                if (mnxVar.d) {
                    mnxVar.d = false;
                    return;
                }
                return;
            }
            int n = n(i);
            int i2 = 1048575 & n;
            int m = m(n);
            long j = i2;
            if (m != 9) {
                if (m != 60 && m != 68) {
                    switch (m) {
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
                            tlx tlxVar = (tlx) ((rmx) ynx.h(j, obj));
                            if (!tlxVar.a) {
                                break;
                            } else {
                                tlxVar.a = false;
                                break;
                            }
                        case 50:
                            if (h.getObject(obj, j) != null) {
                                l1j.f();
                                return;
                            }
                            break;
                    }
                } else if (i(iArr[i], i, obj)) {
                    p(i).a(h.getObject(obj, j));
                }
                i += 3;
            }
            if (v(i, obj)) {
                p(i).a(h.getObject(obj, j));
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
    @Override // defpackage.knx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(jmx jmxVar) {
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
                jmxVar.zzc.getClass();
                return (i6 * 53) + 506991;
            }
            int n = n(i5);
            int i7 = 1048575 & n;
            int m = m(n);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (m) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(ynx.c.a(j, jmxVar));
                    Charset charset = smx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(ynx.c.b(j, jmxVar));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = ynx.f(j, jmxVar);
                    Charset charset2 = smx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = ynx.f(j, jmxVar);
                    Charset charset3 = smx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = ynx.e(j, jmxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = ynx.f(j, jmxVar);
                    Charset charset4 = smx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = ynx.e(j, jmxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean g2 = ynx.c.g(j, jmxVar);
                    Charset charset5 = smx.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) ynx.h(j, jmxVar)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object h2 = ynx.h(j, jmxVar);
                    if (h2 != null) {
                        i10 = h2.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = ynx.h(j, jmxVar).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = ynx.e(j, jmxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = ynx.e(j, jmxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = ynx.e(j, jmxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = ynx.f(j, jmxVar);
                    Charset charset6 = smx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = ynx.e(j, jmxVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = ynx.f(j, jmxVar);
                    Charset charset7 = smx.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object h3 = ynx.h(j, jmxVar);
                    if (h3 != null) {
                        i10 = h3.hashCode();
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
                    floatToIntBits = ynx.h(j, jmxVar).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = ynx.h(j, jmxVar).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) ynx.h(j, jmxVar)).doubleValue());
                        Charset charset8 = smx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) ynx.h(j, jmxVar)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = o(j, jmxVar);
                        Charset charset9 = smx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = o(j, jmxVar);
                        Charset charset10 = smx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j, jmxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = o(j, jmxVar);
                        Charset charset11 = smx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j, jmxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 58:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) ynx.h(j, jmxVar)).booleanValue();
                        Charset charset12 = smx.a;
                        break;
                    }
                case 59:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) ynx.h(j, jmxVar)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ynx.h(j, jmxVar).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ynx.h(j, jmxVar).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j, jmxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 63:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j, jmxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j, jmxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = o(j, jmxVar);
                        Charset charset13 = smx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j, jmxVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 67:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = o(j, jmxVar);
                        Charset charset14 = smx.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!i(i8, i5, jmxVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ynx.h(j, jmxVar).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    @Override // defpackage.knx
    public final boolean c(jmx jmxVar, jmx jmxVar2) {
        boolean d;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int n = n(i);
                long j = n & 1048575;
                switch (m(n)) {
                    case 0:
                        if (!u(jmxVar, jmxVar2, i)) {
                            break;
                        } else {
                            wex wexVar = ynx.c;
                            if (Double.doubleToLongBits(wexVar.a(j, jmxVar)) != Double.doubleToLongBits(wexVar.a(j, jmxVar2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!u(jmxVar, jmxVar2, i)) {
                            break;
                        } else {
                            wex wexVar2 = ynx.c;
                            if (Float.floatToIntBits(wexVar2.b(j, jmxVar)) != Float.floatToIntBits(wexVar2.b(j, jmxVar2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (u(jmxVar, jmxVar2, i) && ynx.f(j, jmxVar) == ynx.f(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (u(jmxVar, jmxVar2, i) && ynx.f(j, jmxVar) == ynx.f(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (u(jmxVar, jmxVar2, i) && ynx.e(j, jmxVar) == ynx.e(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (u(jmxVar, jmxVar2, i) && ynx.f(j, jmxVar) == ynx.f(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (u(jmxVar, jmxVar2, i) && ynx.e(j, jmxVar) == ynx.e(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!u(jmxVar, jmxVar2, i)) {
                            break;
                        } else {
                            wex wexVar3 = ynx.c;
                            if (wexVar3.g(j, jmxVar) != wexVar3.g(j, jmxVar2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (u(jmxVar, jmxVar2, i) && lnx.d(ynx.h(j, jmxVar), ynx.h(j, jmxVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (u(jmxVar, jmxVar2, i) && lnx.d(ynx.h(j, jmxVar), ynx.h(j, jmxVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (u(jmxVar, jmxVar2, i) && lnx.d(ynx.h(j, jmxVar), ynx.h(j, jmxVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (u(jmxVar, jmxVar2, i) && ynx.e(j, jmxVar) == ynx.e(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (u(jmxVar, jmxVar2, i) && ynx.e(j, jmxVar) == ynx.e(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (u(jmxVar, jmxVar2, i) && ynx.e(j, jmxVar) == ynx.e(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (u(jmxVar, jmxVar2, i) && ynx.f(j, jmxVar) == ynx.f(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (u(jmxVar, jmxVar2, i) && ynx.e(j, jmxVar) == ynx.e(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (u(jmxVar, jmxVar2, i) && ynx.f(j, jmxVar) == ynx.f(j, jmxVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (u(jmxVar, jmxVar2, i) && lnx.d(ynx.h(j, jmxVar), ynx.h(j, jmxVar2))) {
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
                        d = lnx.d(ynx.h(j, jmxVar), ynx.h(j, jmxVar2));
                        break;
                    case 50:
                        d = lnx.d(ynx.h(j, jmxVar), ynx.h(j, jmxVar2));
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
                        if (ynx.e(j2, jmxVar) == ynx.e(j2, jmxVar2) && lnx.d(ynx.h(j, jmxVar), ynx.h(j, jmxVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (d) {
                    i += 3;
                }
            } else if (jmxVar.zzc.equals(jmxVar2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.knx
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!h(obj)) {
            xq0.x("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                lnx.n(obj, obj2);
                return;
            }
            int n = n(i);
            int i2 = n & 1048575;
            int m = m(n);
            int i3 = iArr[i];
            long j = i2;
            switch (m) {
                case 0:
                    if (v(i, obj2)) {
                        wex wexVar = ynx.c;
                        obj3 = obj;
                        wexVar.e(obj3, j, wexVar.a(j, obj2));
                        t(i, obj3);
                        i += 3;
                        obj = obj3;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 1:
                    if (v(i, obj2)) {
                        wex wexVar2 = ynx.c;
                        wexVar2.f(obj, j, wexVar2.b(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 2:
                    if (v(i, obj2)) {
                        ynx.k(obj, j, ynx.f(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 3:
                    if (v(i, obj2)) {
                        ynx.k(obj, j, ynx.f(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 4:
                    if (v(i, obj2)) {
                        ynx.j(j, obj, ynx.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 5:
                    if (v(i, obj2)) {
                        ynx.k(obj, j, ynx.f(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 6:
                    if (v(i, obj2)) {
                        ynx.j(j, obj, ynx.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 7:
                    if (v(i, obj2)) {
                        wex wexVar3 = ynx.c;
                        wexVar3.c(obj, j, wexVar3.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 8:
                    if (v(i, obj2)) {
                        ynx.l(j, obj, ynx.h(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 9:
                    r(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 10:
                    if (v(i, obj2)) {
                        ynx.l(j, obj, ynx.h(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 11:
                    if (v(i, obj2)) {
                        ynx.j(j, obj, ynx.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 12:
                    if (v(i, obj2)) {
                        ynx.j(j, obj, ynx.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 13:
                    if (v(i, obj2)) {
                        ynx.j(j, obj, ynx.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 14:
                    if (v(i, obj2)) {
                        ynx.k(obj, j, ynx.f(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 15:
                    if (v(i, obj2)) {
                        ynx.j(j, obj, ynx.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 16:
                    if (v(i, obj2)) {
                        ynx.k(obj, j, ynx.f(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 17:
                    r(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
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
                    rmx rmxVar = (rmx) ynx.h(j, obj);
                    rmx rmxVar2 = (rmx) ynx.h(j, obj2);
                    int size = rmxVar.size();
                    int size2 = rmxVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((tlx) rmxVar).a) {
                            rmxVar = rmxVar.c(size2 + size);
                        }
                        rmxVar.addAll(rmxVar2);
                    }
                    if (size > 0) {
                        rmxVar2 = rmxVar;
                    }
                    ynx.l(j, obj, rmxVar2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 50:
                    l3l l3lVar = lnx.a;
                    Object h2 = ynx.h(j, obj);
                    Object h3 = ynx.h(j, obj2);
                    if (h2 == null) {
                        throw ouj.g(h3);
                    }
                    l1j.f();
                    return;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                case 58:
                case 59:
                    if (i(i3, i, obj2)) {
                        ynx.l(j, obj, ynx.h(j, obj2));
                        ynx.j(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    s(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 61:
                case 62:
                case 63:
                case SQLiteDatabase.OPEN_URI /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (i(i3, i, obj2)) {
                        ynx.l(j, obj, ynx.h(j, obj2));
                        ynx.j(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                case 68:
                    s(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                default:
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
            }
        }
    }

    @Override // defpackage.knx
    public final int e(slx slxVar) {
        int i;
        int i2;
        int r;
        int a;
        int r2;
        int n;
        int r3;
        int a2;
        int i3;
        int r4;
        int i4;
        int i5;
        int a3;
        int r5;
        int size;
        int m;
        int r6;
        int r7;
        int r8;
        int size2;
        int r9;
        int i6;
        int r10;
        int a4;
        int r11;
        int n2;
        int k;
        int r12;
        enx enxVar = this;
        slx slxVar2 = slxVar;
        Unsafe unsafe = h;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = enxVar.a;
            if (i9 >= iArr.length) {
                mnx mnxVar = ((jmx) slxVar).zzc;
                int i12 = mnxVar.c;
                if (i12 == -1) {
                    mnxVar.c = 0;
                    i = 0;
                } else {
                    i = i12;
                }
                return i + i11;
            }
            int n3 = enxVar.n(i9);
            int m2 = m(n3);
            int i13 = iArr[i9];
            int i14 = iArr[i9 + 2];
            int i15 = i14 & i7;
            if (m2 <= 17) {
                if (i15 != i8) {
                    i10 = i15 == i7 ? 0 : unsafe.getInt(slxVar2, i15);
                    i8 = i15;
                }
                i2 = 1 << (i14 >>> 20);
            } else {
                i2 = 0;
            }
            int i16 = n3 & i7;
            if (m2 >= gmx.b.a) {
                gmx.c.getClass();
            }
            long j = i16;
            switch (m2) {
                case 0:
                    if (!enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 8, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 1:
                    if (!enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 4, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 2:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        long j2 = unsafe.getLong(slxVar2, j);
                        r = dmx.r(i13 << 3);
                        a = dmx.a(j2);
                        i4 = a + r;
                        i11 += i4;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 3:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        long j3 = unsafe.getLong(slxVar2, j);
                        r = dmx.r(i13 << 3);
                        a = dmx.a(j3);
                        i4 = a + r;
                        i11 += i4;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 4:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        long j4 = unsafe.getInt(slxVar2, j);
                        r = dmx.r(i13 << 3);
                        a = dmx.a(j4);
                        i4 = a + r;
                        i11 += i4;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 5:
                    if (!enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 8, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 6:
                    if (!enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 4, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 7:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        i11 = v3w.o(i13 << 3, 1, i11);
                    }
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 8:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        int i17 = i13 << 3;
                        Object object = unsafe.getObject(slxVar2, j);
                        if (object instanceof cmx) {
                            r2 = dmx.r(i17);
                            n = ((cmx) object).n();
                            i11 = v3w.p(n, n, r2, i11);
                            i9 += 3;
                            enxVar = this;
                            slxVar2 = slxVar;
                            i7 = 1048575;
                        } else {
                            r = dmx.r(i17);
                            a = dmx.q((String) object);
                            i4 = a + r;
                            i11 += i4;
                            i9 += 3;
                            enxVar = this;
                            slxVar2 = slxVar;
                            i7 = 1048575;
                        }
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 9:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        Object object2 = unsafe.getObject(slxVar2, j);
                        knx p = enxVar.p(i9);
                        l3l l3lVar = lnx.a;
                        r3 = dmx.r(i13 << 3);
                        a2 = ((slx) object2).a(p);
                        i11 = v3w.p(a2, a2, r3, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 10:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        cmx cmxVar = (cmx) unsafe.getObject(slxVar2, j);
                        r2 = dmx.r(i13 << 3);
                        n = cmxVar.n();
                        i11 = v3w.p(n, n, r2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 11:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        i3 = unsafe.getInt(slxVar2, j);
                        r4 = dmx.r(i13 << 3);
                        i11 = v3w.o(i3, r4, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 12:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        long j5 = unsafe.getInt(slxVar2, j);
                        r = dmx.r(i13 << 3);
                        a = dmx.a(j5);
                        i4 = a + r;
                        i11 += i4;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 13:
                    if (!enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 4, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 14:
                    if (!enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 8, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 15:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        int i18 = unsafe.getInt(slxVar2, j);
                        r4 = dmx.r(i13 << 3);
                        i3 = (i18 >> 31) ^ (i18 + i18);
                        i11 = v3w.o(i3, r4, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 16:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        long j6 = unsafe.getLong(slxVar2, j);
                        r = dmx.r(i13 << 3);
                        a = dmx.a((j6 >> 63) ^ (j6 + j6));
                        i4 = a + r;
                        i11 += i4;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 17:
                    if (enxVar.w(slxVar2, i9, i8, i10, i2)) {
                        slx slxVar3 = (slx) unsafe.getObject(slxVar2, j);
                        knx p2 = enxVar.p(i9);
                        int r13 = dmx.r(i13 << 3);
                        i5 = r13 + r13;
                        a3 = slxVar3.a(p2);
                        i4 = a3 + i5;
                        i11 += i4;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 18:
                    i4 = lnx.g((List) unsafe.getObject(slxVar2, j), i13);
                    i11 += i4;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 19:
                    i4 = lnx.f((List) unsafe.getObject(slxVar2, j), i13);
                    i11 += i4;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar2 = lnx.a;
                    if (list.size() != 0) {
                        r5 = (dmx.r(i13 << 3) * list.size()) + lnx.i(list);
                        i11 += r5;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    r5 = 0;
                    i11 += r5;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar3 = lnx.a;
                    size = list2.size();
                    if (size != 0) {
                        m = lnx.m(list2);
                        r6 = dmx.r(i13 << 3);
                        r7 = (r6 * size) + m;
                        i11 += r7;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    r7 = 0;
                    i11 += r7;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar4 = lnx.a;
                    size = list3.size();
                    if (size != 0) {
                        m = lnx.h(list3);
                        r6 = dmx.r(i13 << 3);
                        r7 = (r6 * size) + m;
                        i11 += r7;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    r7 = 0;
                    i11 += r7;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 23:
                    i4 = lnx.g((List) unsafe.getObject(slxVar2, j), i13);
                    i11 += i4;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 24:
                    i4 = lnx.f((List) unsafe.getObject(slxVar2, j), i13);
                    i11 += i4;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar5 = lnx.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        r5 = (dmx.r(i13 << 3) + 1) * size3;
                        i11 += r5;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    r5 = 0;
                    i11 += r5;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar6 = lnx.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        r7 = dmx.r(i13 << 3) * size4;
                        if (list5 instanceof umx) {
                            umx umxVar = (umx) list5;
                            for (int i19 = 0; i19 < size4; i19++) {
                                Object d = umxVar.d();
                                if (d instanceof cmx) {
                                    int n4 = ((cmx) d).n();
                                    r7 = v3w.o(n4, n4, r7);
                                } else {
                                    r7 = dmx.q((String) d) + r7;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size4; i20++) {
                                Object obj = list5.get(i20);
                                if (obj instanceof cmx) {
                                    int n5 = ((cmx) obj).n();
                                    r7 = v3w.o(n5, n5, r7);
                                } else {
                                    r7 = dmx.q((String) obj) + r7;
                                }
                            }
                        }
                        i11 += r7;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    r7 = 0;
                    i11 += r7;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(slxVar2, j);
                    knx p3 = enxVar.p(i9);
                    l3l l3lVar7 = lnx.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        r8 = 0;
                    } else {
                        r8 = dmx.r(i13 << 3) * size5;
                        for (int i21 = 0; i21 < size5; i21++) {
                            int a5 = ((slx) list6.get(i21)).a(p3);
                            r8 = v3w.o(a5, a5, r8);
                        }
                    }
                    i11 += r8;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    List list7 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar8 = lnx.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        r7 = dmx.r(i13 << 3) * size6;
                        for (int i22 = 0; i22 < list7.size(); i22++) {
                            int n6 = ((cmx) list7.get(i22)).n();
                            r7 = v3w.o(n6, n6, r7);
                        }
                        i11 += r7;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    r7 = 0;
                    i11 += r7;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar9 = lnx.a;
                    size = list8.size();
                    if (size != 0) {
                        m = lnx.l(list8);
                        r6 = dmx.r(i13 << 3);
                        r7 = (r6 * size) + m;
                        i11 += r7;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    r7 = 0;
                    i11 += r7;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar10 = lnx.a;
                    size = list9.size();
                    if (size != 0) {
                        m = lnx.e(list9);
                        r6 = dmx.r(i13 << 3);
                        r7 = (r6 * size) + m;
                        i11 += r7;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    r7 = 0;
                    i11 += r7;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    i4 = lnx.f((List) unsafe.getObject(slxVar2, j), i13);
                    i11 += i4;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 32:
                    i4 = lnx.g((List) unsafe.getObject(slxVar2, j), i13);
                    i11 += i4;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    List list10 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar11 = lnx.a;
                    size = list10.size();
                    if (size != 0) {
                        m = lnx.j(list10);
                        r6 = dmx.r(i13 << 3);
                        r7 = (r6 * size) + m;
                        i11 += r7;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    r7 = 0;
                    i11 += r7;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar12 = lnx.a;
                    size = list11.size();
                    if (size != 0) {
                        m = lnx.k(list11);
                        r6 = dmx.r(i13 << 3);
                        r7 = (r6 * size) + m;
                        i11 += r7;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    r7 = 0;
                    i11 += r7;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar13 = lnx.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar14 = lnx.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 37:
                    size2 = lnx.i((List) unsafe.getObject(slxVar2, j));
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 38:
                    size2 = lnx.m((List) unsafe.getObject(slxVar2, j));
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 39:
                    size2 = lnx.h((List) unsafe.getObject(slxVar2, j));
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar15 = lnx.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar16 = lnx.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar17 = lnx.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    size2 = lnx.l((List) unsafe.getObject(slxVar2, j));
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    size2 = lnx.e((List) unsafe.getObject(slxVar2, j));
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar18 = lnx.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    List list18 = (List) unsafe.getObject(slxVar2, j);
                    l3l l3lVar19 = lnx.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    size2 = lnx.j((List) unsafe.getObject(slxVar2, j));
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    size2 = lnx.k((List) unsafe.getObject(slxVar2, j));
                    if (size2 > 0) {
                        r9 = dmx.r(i13 << 3);
                        i11 = v3w.p(size2, r9, size2, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    List list19 = (List) unsafe.getObject(slxVar2, j);
                    knx p4 = enxVar.p(i9);
                    l3l l3lVar20 = lnx.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i23 = 0; i23 < size7; i23++) {
                            slx slxVar4 = (slx) list19.get(i23);
                            int r14 = dmx.r(i13 << 3);
                            i6 += slxVar4.a(p4) + r14 + r14;
                        }
                    }
                    i11 += i6;
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(slxVar2, j);
                    int i24 = i9 / 3;
                    Object obj2 = enxVar.b[i24 + i24];
                    if (object3 == null) {
                        throw ouj.g(obj2);
                    }
                    l1j.f();
                    return 0;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (!enxVar.i(i13, i9, slxVar2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 8, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (!enxVar.i(i13, i9, slxVar2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 4, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        long o = o(j, slxVar2);
                        r10 = dmx.r(i13 << 3);
                        a4 = dmx.a(o);
                        i11 += a4 + r10;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        long o2 = o(j, slxVar2);
                        r10 = dmx.r(i13 << 3);
                        a4 = dmx.a(o2);
                        i11 += a4 + r10;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        long k2 = k(j, slxVar2);
                        r10 = dmx.r(i13 << 3);
                        a4 = dmx.a(k2);
                        i11 += a4 + r10;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (!enxVar.i(i13, i9, slxVar2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 8, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (!enxVar.i(i13, i9, slxVar2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 4, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 58:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        i11 = v3w.o(i13 << 3, 1, i11);
                    }
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 59:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        int i25 = i13 << 3;
                        Object object4 = unsafe.getObject(slxVar2, j);
                        if (object4 instanceof cmx) {
                            r11 = dmx.r(i25);
                            n2 = ((cmx) object4).n();
                            i11 = v3w.p(n2, n2, r11, i11);
                            i9 += 3;
                            enxVar = this;
                            slxVar2 = slxVar;
                            i7 = 1048575;
                        } else {
                            r10 = dmx.r(i25);
                            a4 = dmx.q((String) object4);
                            i11 += a4 + r10;
                            i9 += 3;
                            enxVar = this;
                            slxVar2 = slxVar;
                            i7 = 1048575;
                        }
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        Object object5 = unsafe.getObject(slxVar2, j);
                        knx p5 = enxVar.p(i9);
                        l3l l3lVar21 = lnx.a;
                        r3 = dmx.r(i13 << 3);
                        a2 = ((slx) object5).a(p5);
                        i11 = v3w.p(a2, a2, r3, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 61:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        cmx cmxVar2 = (cmx) unsafe.getObject(slxVar2, j);
                        r11 = dmx.r(i13 << 3);
                        n2 = cmxVar2.n();
                        i11 = v3w.p(n2, n2, r11, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 62:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        k = k(j, slxVar2);
                        r12 = dmx.r(i13 << 3);
                        i11 = v3w.o(k, r12, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 63:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        long k3 = k(j, slxVar2);
                        r10 = dmx.r(i13 << 3);
                        a4 = dmx.a(k3);
                        i11 += a4 + r10;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (!enxVar.i(i13, i9, slxVar2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 4, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 65:
                    if (!enxVar.i(i13, i9, slxVar2)) {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                    i11 = v3w.o(i13 << 3, 8, i11);
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
                case 66:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        int k4 = k(j, slxVar2);
                        r12 = dmx.r(i13 << 3);
                        k = (k4 >> 31) ^ (k4 + k4);
                        i11 = v3w.o(k, r12, i11);
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 67:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        long o3 = o(j, slxVar2);
                        r10 = dmx.r(i13 << 3);
                        a4 = dmx.a((o3 >> 63) ^ (o3 + o3));
                        i11 += a4 + r10;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                case 68:
                    if (enxVar.i(i13, i9, slxVar2)) {
                        slx slxVar5 = (slx) unsafe.getObject(slxVar2, j);
                        knx p6 = enxVar.p(i9);
                        int r15 = dmx.r(i13 << 3);
                        i5 = r15 + r15;
                        a3 = slxVar5.a(p6);
                        i4 = a3 + i5;
                        i11 += i4;
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        enxVar = this;
                        slxVar2 = slxVar;
                        i7 = 1048575;
                    }
                default:
                    i9 += 3;
                    enxVar = this;
                    slxVar2 = slxVar;
                    i7 = 1048575;
            }
        }
    }

    @Override // defpackage.knx
    public final boolean f(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.e) {
            int i7 = this.d[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int n = n(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = h.getInt(obj, i10);
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
            if ((268435456 & n) == 0 || w(obj, i2, i, i3, i11)) {
                int m = m(n);
                if (m == 9 || m == 17) {
                    if (w(obj, i2, i, i3, i11) && !p(i2).f(ynx.h(n & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (m != 27) {
                        if (m == 60 || m == 68) {
                            if (i(i8, i2, obj) && !p(i2).f(ynx.h(n & 1048575, obj))) {
                            }
                        } else if (m != 49) {
                            if (m == 50) {
                                ynx.h(n & 1048575, obj).getClass();
                                l1j.f();
                                return false;
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) ynx.h(n & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        knx p = p(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (p.f(list.get(i13))) {
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

    @Override // defpackage.knx
    public final void g(Object obj, hjp hjpVar) {
        int i;
        enx enxVar = this;
        Unsafe unsafe = h;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = enxVar.a;
            if (i3 >= iArr.length) {
                mnx mnxVar = ((jmx) obj).zzc;
                return;
            }
            int n = enxVar.n(i3);
            int m = m(n);
            int i6 = iArr[i3];
            if (m <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = n & i2;
            switch (m) {
                case 0:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).g(i6, Double.doubleToRawLongBits(ynx.c.a(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).e(i6, Float.floatToRawIntBits(ynx.c.b(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).o(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).o(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).i(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).g(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).e(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        boolean g2 = ynx.c.g(j, obj);
                        dmx dmxVar = (dmx) hjpVar.b;
                        dmxVar.n(i6 << 3);
                        dmxVar.b(g2 ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((dmx) hjpVar.b).k(i6, (String) object);
                            break;
                        } else {
                            ((dmx) hjpVar.b).d(i6, (cmx) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        hjpVar.E(i6, unsafe.getObject(obj, j), enxVar.p(i3));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).d(i6, (cmx) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).m(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).i(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).e(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        ((dmx) hjpVar.b).g(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        ((dmx) hjpVar.b).m(i6, (i9 >> 31) ^ (i9 + i9));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((dmx) hjpVar.b).o(i6, (j2 >> 63) ^ (j2 + j2));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (enxVar.w(obj, i3, i5, i4, i)) {
                        hjpVar.D(i6, unsafe.getObject(obj, j), enxVar.p(i3));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    lnx.p(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 19:
                    lnx.t(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 20:
                    lnx.v(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 21:
                    lnx.c(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 22:
                    lnx.u(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 23:
                    lnx.s(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 24:
                    lnx.r(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 25:
                    lnx.o(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 26:
                    int i10 = iArr[i3];
                    List list = (List) unsafe.getObject(obj, j);
                    l3l l3lVar = lnx.a;
                    if (list != null && !list.isEmpty()) {
                        dmx dmxVar2 = (dmx) hjpVar.b;
                        if (list instanceof umx) {
                            umx umxVar = (umx) list;
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                Object d = umxVar.d();
                                if (d instanceof String) {
                                    dmxVar2.k(i10, (String) d);
                                } else {
                                    dmxVar2.d(i10, (cmx) d);
                                }
                            }
                            break;
                        } else {
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                dmxVar2.k(i10, (String) list.get(i12));
                            }
                            break;
                        }
                    }
                    break;
                case 27:
                    int i13 = iArr[i3];
                    List list2 = (List) unsafe.getObject(obj, j);
                    knx p = enxVar.p(i3);
                    l3l l3lVar2 = lnx.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            hjpVar.E(i13, list2.get(i14), p);
                        }
                        break;
                    }
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    int i15 = iArr[i3];
                    List list3 = (List) unsafe.getObject(obj, j);
                    l3l l3lVar3 = lnx.a;
                    if (list3 != null && !list3.isEmpty()) {
                        hjpVar.getClass();
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            ((dmx) hjpVar.b).d(i15, (cmx) list3.get(i16));
                        }
                        break;
                    }
                    break;
                case 29:
                    lnx.b(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 30:
                    lnx.q(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    lnx.w(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 32:
                    lnx.x(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    lnx.y(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    lnx.a(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, false);
                    break;
                case 35:
                    lnx.p(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    lnx.t(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case 37:
                    lnx.v(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case 38:
                    lnx.c(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case 39:
                    lnx.u(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case 40:
                    lnx.s(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case 41:
                    lnx.r(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case 42:
                    lnx.o(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    lnx.b(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    lnx.q(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    lnx.w(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    lnx.x(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    lnx.y(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    lnx.a(iArr[i3], (List) unsafe.getObject(obj, j), hjpVar, true);
                    break;
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    int i17 = iArr[i3];
                    List list4 = (List) unsafe.getObject(obj, j);
                    knx p2 = enxVar.p(i3);
                    l3l l3lVar4 = lnx.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            hjpVar.D(i17, list4.get(i18), p2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        int i19 = i3 / 3;
                        throw ouj.g(enxVar.b[i19 + i19]);
                    }
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).g(i6, Double.doubleToRawLongBits(((Double) ynx.h(j, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).e(i6, Float.floatToRawIntBits(((Float) ynx.h(j, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).o(i6, o(j, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).o(i6, o(j, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).i(i6, k(j, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).g(i6, o(j, obj));
                        break;
                    } else {
                        break;
                    }
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).e(i6, k(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (enxVar.i(i6, i3, obj)) {
                        boolean booleanValue = ((Boolean) ynx.h(j, obj)).booleanValue();
                        dmx dmxVar3 = (dmx) hjpVar.b;
                        dmxVar3.n(i6 << 3);
                        dmxVar3.b(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (enxVar.i(i6, i3, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((dmx) hjpVar.b).k(i6, (String) object2);
                            break;
                        } else {
                            ((dmx) hjpVar.b).d(i6, (cmx) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    if (enxVar.i(i6, i3, obj)) {
                        hjpVar.E(i6, unsafe.getObject(obj, j), enxVar.p(i3));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).d(i6, (cmx) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).m(i6, k(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).i(i6, k(j, obj));
                        break;
                    } else {
                        break;
                    }
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).e(i6, k(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (enxVar.i(i6, i3, obj)) {
                        ((dmx) hjpVar.b).g(i6, o(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (enxVar.i(i6, i3, obj)) {
                        int k = k(j, obj);
                        ((dmx) hjpVar.b).m(i6, (k >> 31) ^ (k + k));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (enxVar.i(i6, i3, obj)) {
                        long o = o(j, obj);
                        ((dmx) hjpVar.b).o(i6, (o >> 63) ^ (o + o));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (enxVar.i(i6, i3, obj)) {
                        hjpVar.D(i6, unsafe.getObject(obj, j), enxVar.p(i3));
                        break;
                    } else {
                        break;
                    }
            }
            i3 += 3;
            i2 = 1048575;
            enxVar = this;
        }
    }

    public final boolean i(int i, int i2, Object obj) {
        return ynx.e((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    @Override // defpackage.knx
    public final jmx l() {
        return (jmx) ((jmx) this.c).i(4, null);
    }

    public final int n(int i) {
        return this.a[i + 1];
    }

    public final knx p(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        knx knxVar = (knx) objArr[i3];
        if (knxVar != null) {
            return knxVar;
        }
        knx a = hnx.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final void r(int i, Object obj, Object obj2) {
        if (v(i, obj2)) {
            int n = n(i) & 1048575;
            Unsafe unsafe = h;
            long j = n;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                xq0.q(hrg.p("Source subfield ", this.a[i], " is present but null: ", obj2.toString()));
                return;
            }
            knx p = p(i);
            if (!v(i, obj)) {
                if (h(object)) {
                    jmx l = p.l();
                    p.d(l, object);
                    unsafe.putObject(obj, j, l);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!h(object2)) {
                jmx l2 = p.l();
                p.d(l2, object2);
                unsafe.putObject(obj, j, l2);
                object2 = l2;
            }
            p.d(object2, object);
        }
    }

    public final void s(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (i(i2, i, obj2)) {
            int n = n(i) & 1048575;
            Unsafe unsafe = h;
            long j = n;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                xq0.q(hrg.p("Source subfield ", iArr[i], " is present but null: ", obj2.toString()));
                return;
            }
            knx p = p(i);
            if (!i(i2, i, obj)) {
                if (h(object)) {
                    jmx l = p.l();
                    p.d(l, object);
                    unsafe.putObject(obj, j, l);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                ynx.j(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!h(object2)) {
                jmx l2 = p.l();
                p.d(l2, object2);
                unsafe.putObject(obj, j, l2);
                object2 = l2;
            }
            p.d(object2, object);
        }
    }

    public final void t(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        ynx.j(j, obj, (1 << (i2 >>> 20)) | ynx.e(j, obj));
    }

    public final boolean u(jmx jmxVar, jmx jmxVar2, int i) {
        return v(i, jmxVar) == v(i, jmxVar2);
    }

    public final boolean v(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int n = n(i);
            long j2 = n & 1048575;
            switch (m(n)) {
                case 0:
                    if (Double.doubleToRawLongBits(ynx.c.a(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(ynx.c.b(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (ynx.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (ynx.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (ynx.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (ynx.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (ynx.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return ynx.c.g(j2, obj);
                case 8:
                    Object h2 = ynx.h(j2, obj);
                    if (h2 instanceof String) {
                        if (((String) h2).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h2 instanceof cmx)) {
                            e7o.e();
                            return false;
                        }
                        if (cmx.c.equals(h2)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (ynx.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (cmx.c.equals(ynx.h(j2, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (ynx.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (ynx.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (ynx.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (ynx.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (ynx.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (ynx.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (ynx.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    e7o.e();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & ynx.e(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean w(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? v(i, obj) : (i3 & i4) != 0;
    }
}
