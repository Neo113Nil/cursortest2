package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class zzamu implements zzanb {
    public static final int[] zza = new int[0];
    public static final Unsafe zzb = zzanu.zzg();
    public final int[] zzc;
    public final Object[] zzd;
    public final int zze;
    public final int zzf;
    public final zzakg zzg;
    public final int[] zzi;
    public final int zzj;
    public final int zzk;
    public final zzzx zzl;

    public zzamu(int[] iArr, Object[] objArr, int i, int i2, zzakg zzakgVar, int[] iArr2, int i3, int i4, zzzx zzzxVar, zzzx zzzxVar2) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzzxVar;
        this.zzg = zzakgVar;
    }

    public static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzals) {
            return ((zzals) obj).zzw();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamu zzj(zzana zzanaVar, zzzx zzzxVar, zzzx zzzxVar2) {
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
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Field zzv;
        char charAt10;
        int i28;
        int i29;
        int i30;
        int i31;
        Field zzv2;
        Field zzv3;
        int i32;
        char charAt11;
        int i33;
        int i34;
        char charAt12;
        int i35;
        int i36;
        char charAt13;
        int i37;
        char charAt14;
        if (!(zzanaVar instanceof zzana)) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        String str = zzanaVar.zzb;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i = i38 + 1;
                if (str.charAt(i38) < 55296) {
                    break;
                }
                i38 = i;
            }
        } else {
            i = 1;
        }
        int i39 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i40 = charAt15 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                charAt14 = str.charAt(i39);
                if (charAt14 < 55296) {
                    break;
                }
                i40 |= (charAt14 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            charAt15 = i40 | (charAt14 << i41);
            i39 = i37;
        }
        if (charAt15 == 0) {
            i4 = 0;
            i6 = 0;
            charAt = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            iArr = zza;
            i2 = 0;
        } else {
            int i42 = i39 + 1;
            int charAt16 = str.charAt(i39);
            if (charAt16 >= 55296) {
                int i43 = charAt16 & 8191;
                int i44 = 13;
                while (true) {
                    i15 = i42 + 1;
                    charAt9 = str.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i15;
                }
                charAt16 = i43 | (charAt9 << i44);
                i42 = i15;
            }
            int i45 = i42 + 1;
            int charAt17 = str.charAt(i42);
            if (charAt17 >= 55296) {
                int i46 = charAt17 & 8191;
                int i47 = 13;
                while (true) {
                    i14 = i45 + 1;
                    charAt8 = str.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i14;
                }
                charAt17 = i46 | (charAt8 << i47);
                i45 = i14;
            }
            int i48 = i45 + 1;
            int charAt18 = str.charAt(i45);
            if (charAt18 >= 55296) {
                int i49 = charAt18 & 8191;
                int i50 = 13;
                while (true) {
                    i13 = i48 + 1;
                    charAt7 = str.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i13;
                }
                charAt18 = i49 | (charAt7 << i50);
                i48 = i13;
            }
            int i51 = i48 + 1;
            int charAt19 = str.charAt(i48);
            if (charAt19 >= 55296) {
                int i52 = charAt19 & 8191;
                int i53 = 13;
                while (true) {
                    i12 = i51 + 1;
                    charAt6 = str.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i12;
                }
                charAt19 = i52 | (charAt6 << i53);
                i51 = i12;
            }
            int i54 = i51 + 1;
            charAt = str.charAt(i51);
            if (charAt >= 55296) {
                int i55 = charAt & 8191;
                int i56 = 13;
                while (true) {
                    i11 = i54 + 1;
                    charAt5 = str.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i11;
                }
                charAt = i55 | (charAt5 << i56);
                i54 = i11;
            }
            int i57 = i54 + 1;
            int charAt20 = str.charAt(i54);
            if (charAt20 >= 55296) {
                int i58 = charAt20 & 8191;
                int i59 = 13;
                while (true) {
                    i10 = i57 + 1;
                    charAt4 = str.charAt(i57);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i10;
                }
                charAt20 = i58 | (charAt4 << i59);
                i57 = i10;
            }
            int i60 = i57 + 1;
            int charAt21 = str.charAt(i57);
            if (charAt21 >= 55296) {
                int i61 = charAt21 & 8191;
                int i62 = 13;
                while (true) {
                    i9 = i60 + 1;
                    charAt3 = str.charAt(i60);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i61 |= (charAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i9;
                }
                charAt21 = i61 | (charAt3 << i62);
                i60 = i9;
            }
            int i63 = i60 + 1;
            int charAt22 = str.charAt(i60);
            if (charAt22 >= 55296) {
                int i64 = charAt22 & 8191;
                int i65 = 13;
                while (true) {
                    i8 = i63 + 1;
                    charAt2 = str.charAt(i63);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i64 |= (charAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i8;
                }
                charAt22 = i64 | (charAt2 << i65);
                i63 = i8;
            }
            int i66 = charAt16 + charAt16 + charAt17;
            i2 = charAt16;
            i39 = i63;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i67 = charAt20;
            i3 = charAt18;
            i4 = i67;
            i5 = charAt19;
            i6 = i66;
            i7 = charAt22;
        }
        Unsafe unsafe = zzb;
        Object[] objArr2 = zzanaVar.zzc;
        Class<?> cls = zzanaVar.zza.getClass();
        int i68 = i7 + i4;
        int i69 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i69];
        int i70 = i68;
        int i71 = i7;
        int i72 = 0;
        int i73 = 0;
        while (i39 < length) {
            int i74 = i39 + 1;
            int charAt23 = str.charAt(i39);
            int i75 = length;
            if (charAt23 >= 55296) {
                int i76 = charAt23 & 8191;
                int i77 = i74;
                int i78 = 13;
                while (true) {
                    i36 = i77 + 1;
                    charAt13 = str.charAt(i77);
                    objArr = objArr2;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i76 |= (charAt13 & 8191) << i78;
                    i78 += 13;
                    i77 = i36;
                    objArr2 = objArr;
                }
                charAt23 = i76 | (charAt13 << i78);
                i16 = i36;
            } else {
                objArr = objArr2;
                i16 = i74;
            }
            int i79 = i16 + 1;
            int charAt24 = str.charAt(i16);
            if (charAt24 >= 55296) {
                int i80 = charAt24 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i34 = i81 + 1;
                    charAt12 = str.charAt(i81);
                    i35 = i80;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i80 = i35 | ((charAt12 & 8191) << i82);
                    i82 += 13;
                    i81 = i34;
                }
                charAt24 = i35 | (charAt12 << i82);
                i17 = i34;
            } else {
                i17 = i79;
            }
            int i83 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            int i84 = charAt24 & 255;
            Object[] objArr4 = objArr3;
            int i85 = charAt24 & 2048;
            if (i84 >= 51) {
                int i86 = i17 + 1;
                int charAt25 = str.charAt(i17);
                if (charAt25 >= 55296) {
                    int i87 = charAt25 & 8191;
                    int i88 = i86;
                    int i89 = 13;
                    while (true) {
                        i32 = i88 + 1;
                        charAt11 = str.charAt(i88);
                        i33 = i87;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i87 = i33 | ((charAt11 & 8191) << i89);
                        i89 += 13;
                        i88 = i32;
                    }
                    charAt25 = i33 | (charAt11 << i89);
                    i30 = i32;
                } else {
                    i30 = i86;
                }
                int i90 = charAt25;
                int i91 = i84 - 51;
                int i92 = i30;
                if (i91 == 9 || i91 == 17) {
                    objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i72, 3, 1)] = objArr[i6];
                    i31 = i85;
                    i6++;
                } else {
                    if (i91 == 12) {
                        if (zzanaVar.zzc() == 1 || i85 != 0) {
                            objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i72, 3, 1)] = objArr[i6];
                            i6++;
                        } else {
                            i31 = 0;
                        }
                    }
                    i31 = i85;
                }
                int i93 = i90 + i90;
                Object obj = objArr[i93];
                int i94 = i31;
                if (obj instanceof Field) {
                    zzv2 = (Field) obj;
                } else {
                    zzv2 = zzv(cls, (String) obj);
                    objArr[i93] = zzv2;
                }
                i18 = i2;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzv2);
                int i95 = i93 + 1;
                Object obj2 = objArr[i95];
                if (obj2 instanceof Field) {
                    zzv3 = (Field) obj2;
                } else {
                    zzv3 = zzv(cls, (String) obj2);
                    objArr[i95] = zzv3;
                }
                i20 = (int) unsafe.objectFieldOffset(zzv3);
                i19 = i68;
                i27 = objectFieldOffset2;
                i26 = i94;
                i23 = i92;
                i21 = i72;
                i25 = 0;
            } else {
                i18 = i2;
                int i96 = i6 + 1;
                Field zzv4 = zzv(cls, (String) objArr[i6]);
                if (i84 == 9 || i84 == 17) {
                    i19 = i68;
                    objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i72, 3, 1)] = zzv4.getType();
                } else {
                    if (i84 == 27) {
                        i19 = i68;
                        i28 = 3;
                        i29 = 1;
                        i6 += 2;
                    } else if (i84 == 49) {
                        i6 += 2;
                        i19 = i68;
                        i28 = 3;
                        i29 = 1;
                    } else {
                        if (i84 == 12 || i84 == 30 || i84 == 44) {
                            i19 = i68;
                            if (zzanaVar.zzc() == 1 || i85 != 0) {
                                i6 += 2;
                                objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i72, 3, 1)] = objArr[i96];
                            } else {
                                i6 = i96;
                                i85 = 0;
                            }
                        } else if (i84 == 50) {
                            int i97 = i6 + 2;
                            int i98 = i71 + 1;
                            iArr[i71] = i72;
                            int i99 = i72 / 3;
                            int i100 = i99 + i99;
                            objArr4[i100] = objArr[i96];
                            if (i85 != 0) {
                                i6 += 3;
                                objArr4[i100 + 1] = objArr[i97];
                                i71 = i98;
                            } else {
                                i6 = i97;
                                i71 = i98;
                                i85 = 0;
                            }
                            i19 = i68;
                        } else {
                            i19 = i68;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzv4);
                        i20 = 1048575;
                        if ((charAt24 & 4096) != 0 || i84 > 17) {
                            i21 = i72;
                            i22 = objectFieldOffset;
                            i23 = i17;
                            i24 = 0;
                        } else {
                            int i101 = i17 + 1;
                            int charAt26 = str.charAt(i17);
                            if (charAt26 >= 55296) {
                                int i102 = charAt26 & 8191;
                                int i103 = 13;
                                while (true) {
                                    i23 = i101 + 1;
                                    charAt10 = str.charAt(i101);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i102 |= (charAt10 & 8191) << i103;
                                    i103 += 13;
                                    i101 = i23;
                                }
                                charAt26 = i102 | (charAt10 << i103);
                            } else {
                                i23 = i101;
                            }
                            int i104 = (charAt26 / 32) + i18 + i18;
                            Object obj3 = objArr[i104];
                            if (obj3 instanceof Field) {
                                zzv = (Field) obj3;
                            } else {
                                zzv = zzv(cls, (String) obj3);
                                objArr[i104] = zzv;
                            }
                            i21 = i72;
                            i22 = objectFieldOffset;
                            i24 = charAt26 % 32;
                            i20 = (int) unsafe.objectFieldOffset(zzv);
                        }
                        if (i84 >= 18 || i84 > 49) {
                            i25 = i24;
                            i26 = i85;
                        } else {
                            iArr[i70] = i22;
                            i70++;
                            i26 = i85;
                            i25 = i24;
                        }
                        i27 = i22;
                    }
                    objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i72, i28, i29)] = objArr[i96];
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzv4);
                    i20 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i21 = i72;
                    i22 = objectFieldOffset;
                    i23 = i17;
                    i24 = 0;
                    if (i84 >= 18) {
                    }
                    i25 = i24;
                    i26 = i85;
                    i27 = i22;
                }
                i6 = i96;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzv4);
                i20 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i21 = i72;
                i22 = objectFieldOffset;
                i23 = i17;
                i24 = 0;
                if (i84 >= 18) {
                }
                i25 = i24;
                i26 = i85;
                i27 = i22;
            }
            int i105 = i21 + 1;
            iArr2[i21] = i83;
            int i106 = i21 + 2;
            String str2 = str;
            iArr2[i105] = ((charAt24 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i26 != 0 ? PKIFailureInfo.systemUnavail : 0) | (i84 << 20) | i27;
            iArr2[i106] = (i25 << 20) | i20;
            i72 = i21 + 3;
            i39 = i23;
            length = i75;
            objArr3 = objArr4;
            objArr2 = objArr;
            str = str2;
            i68 = i19;
            i2 = i18;
        }
        return new zzamu(iArr2, objArr3, i3, i5, zzanaVar.zza, iArr, i7, i68, zzzxVar, zzzxVar2);
    }

    public static int zzk(zzals zzalsVar, long j) {
        return ((Integer) zzanu.zzf(zzalsVar, j)).intValue();
    }

    public static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    public static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Field ", str, " for ", name, " not found. Known fields are ");
            m.append(arrays);
            throw new RuntimeException(m.toString(), e);
        }
    }

    public final void zzB(int i, Object obj, Object obj2) {
        zzb.putObject(obj, zzo(i) & 1048575, obj2);
        zzz(i, obj);
    }

    public final void zzC(int i, Object obj, Object obj2, int i2) {
        zzb.putObject(obj, zzo(i2) & 1048575, obj2);
        zzanu.zzn(this.zzc[i2 + 2] & 1048575, obj, i);
    }

    public final boolean zzD(zzals zzalsVar, zzals zzalsVar2, int i) {
        return zzE(i, zzalsVar) == zzE(i, zzalsVar2);
    }

    public final boolean zzE(int i, Object obj) {
        int i2 = this.zzc[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & zzanu.zzc(obj, j)) != 0;
        }
        int zzo = zzo(i);
        long j2 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                if (Double.doubleToRawLongBits(zzanu.zzf.zza(obj, j2)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(zzanu.zzf.zzb(obj, j2)) != 0) {
                }
                break;
            case 2:
                if (zzanu.zzd(obj, j2) != 0) {
                }
                break;
            case 3:
                if (zzanu.zzd(obj, j2) != 0) {
                }
                break;
            case 4:
                if (zzanu.zzc(obj, j2) != 0) {
                }
                break;
            case 5:
                if (zzanu.zzd(obj, j2) != 0) {
                }
                break;
            case 6:
                if (zzanu.zzc(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object zzf = zzanu.zzf(obj, j2);
                if (!(zzf instanceof String)) {
                    if (!(zzf instanceof zzaks)) {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        break;
                    } else if (!zzaks.zzb.equals(zzf)) {
                    }
                } else if (!((String) zzf).isEmpty()) {
                }
                break;
            case 9:
                if (zzanu.zzf(obj, j2) != null) {
                }
                break;
            case 10:
                if (!zzaks.zzb.equals(zzanu.zzf(obj, j2))) {
                }
                break;
            case 11:
                if (zzanu.zzc(obj, j2) != 0) {
                }
                break;
            case 12:
                if (zzanu.zzc(obj, j2) != 0) {
                }
                break;
            case 13:
                if (zzanu.zzc(obj, j2) != 0) {
                }
                break;
            case 14:
                if (zzanu.zzd(obj, j2) != 0) {
                }
                break;
            case 15:
                if (zzanu.zzc(obj, j2) != 0) {
                }
                break;
            case 16:
                if (zzanu.zzd(obj, j2) != 0) {
                }
                break;
            case 17:
                if (zzanu.zzf(obj, j2) != null) {
                }
                break;
            default:
                Path$$ExternalSyntheticBUOutline0.m$3();
                break;
        }
        return false;
    }

    public final boolean zzI(int i, int i2, Object obj) {
        return zzanu.zzc(obj, (long) (this.zzc[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
    
        r1 = r6 + r1;
     */
    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzals zzalsVar) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i5 >= iArr.length) {
                return zzalsVar.zzc.hashCode() + (i6 * 53);
            }
            int zzo = zzo(i5);
            int i7 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (zzn) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzanu.zzf.zza(zzalsVar, j));
                    Charset charset = zzalx.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(zzanu.zzf.zzb(zzalsVar, j));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = zzanu.zzd(zzalsVar, j);
                    Charset charset2 = zzalx.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = zzanu.zzd(zzalsVar, j);
                    Charset charset3 = zzalx.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = zzanu.zzc(zzalsVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = zzanu.zzd(zzalsVar, j);
                    Charset charset4 = zzalx.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = zzanu.zzc(zzalsVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zzf = zzanu.zzf.zzf(zzalsVar, j);
                    Charset charset5 = zzalx.zza;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) zzanu.zzf(zzalsVar, j)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object zzf2 = zzanu.zzf(zzalsVar, j);
                    if (zzf2 != null) {
                        i10 = zzf2.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = zzanu.zzf(zzalsVar, j).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = zzanu.zzc(zzalsVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = zzanu.zzc(zzalsVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = zzanu.zzc(zzalsVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = zzanu.zzd(zzalsVar, j);
                    Charset charset6 = zzalx.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = zzanu.zzc(zzalsVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = zzanu.zzd(zzalsVar, j);
                    Charset charset7 = zzalx.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object zzf3 = zzanu.zzf(zzalsVar, j);
                    if (zzf3 != null) {
                        i10 = zzf3.hashCode();
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
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i6 * 53;
                    floatToIntBits = zzanu.zzf(zzalsVar, j).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = zzanu.zzf(zzalsVar, j).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 51:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) zzanu.zzf(zzalsVar, j)).doubleValue());
                        Charset charset8 = zzalx.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) zzanu.zzf(zzalsVar, j)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = ((Long) zzanu.zzf(zzalsVar, j)).longValue();
                        Charset charset9 = zzalx.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = ((Long) zzanu.zzf(zzalsVar, j)).longValue();
                        Charset charset10 = zzalx.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzk(zzalsVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = ((Long) zzanu.zzf(zzalsVar, j)).longValue();
                        Charset charset11 = zzalx.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzk(zzalsVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 58:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) zzanu.zzf(zzalsVar, j)).booleanValue();
                        Charset charset12 = zzalx.zza;
                        break;
                    }
                case 59:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) zzanu.zzf(zzalsVar, j)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzanu.zzf(zzalsVar, j).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzanu.zzf(zzalsVar, j).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzk(zzalsVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 63:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzk(zzalsVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzk(zzalsVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = ((Long) zzanu.zzf(zzalsVar, j)).longValue();
                        Charset charset13 = zzalx.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzk(zzalsVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 67:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = ((Long) zzanu.zzf(zzalsVar, j)).longValue();
                        Charset charset14 = zzalx.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!zzI(i8, i5, zzalsVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzanu.zzf(zzalsVar, j).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzb(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.measurement.zzacg r42) {
        /*
            Method dump skipped, instructions count: 3252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_genai_prompt.zzamu.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzacg):int");
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final zzals zzd() {
        return (zzals) ((zzals) this.zzg).zzb(4);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final void zze(Object obj) {
        if (!zzH(obj)) {
            return;
        }
        if (obj instanceof zzals) {
            zzals zzalsVar = (zzals) obj;
            zzalsVar.zzu();
            zzalsVar.zza = 0;
            zzalsVar.zzs();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                this.zzl.getClass();
                zzano zzanoVar = ((zzals) obj).zzc;
                if (zzanoVar.zze) {
                    zzanoVar.zze = false;
                    return;
                }
                return;
            }
            int zzo = zzo(i);
            int i2 = 1048575 & zzo;
            int zzn = zzn(zzo);
            long j = i2;
            if (zzn != 9) {
                if (zzn != 60 && zzn != 68) {
                    switch (zzn) {
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
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            zzamz zzamzVar = (zzamz) ((zzalw) zzanu.zzf(obj, j));
                            if (!zzamzVar.zza$1) {
                                break;
                            } else {
                                zzamzVar.zza$1 = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object == null) {
                                break;
                            } else {
                                ((zzaml) object).zzb = false;
                                unsafe.putObject(obj, j, object);
                                break;
                            }
                    }
                } else if (zzI(iArr[i], i, obj)) {
                    zzr(i).zze(zzb.getObject(obj, j));
                }
                i += 3;
            }
            if (zzE(i, obj)) {
                zzr(i).zze(zzb.getObject(obj, j));
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final void zzf(Object obj, Object obj2) {
        Object obj3;
        if (!zzH(obj)) {
            a$$ExternalSyntheticBUOutline0.m$3("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzand.zzd(obj, obj2);
                return;
            }
            int zzo = zzo(i);
            int i2 = zzo & 1048575;
            int zzn = zzn(zzo);
            int i3 = iArr[i];
            long j = i2;
            switch (zzn) {
                case 0:
                    if (zzE(i, obj2)) {
                        zzant zzantVar = zzanu.zzf;
                        obj3 = obj;
                        zzantVar.zzd(obj3, j, zzantVar.zza(obj2, j));
                        zzz(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (zzE(i, obj2)) {
                        zzant zzantVar2 = zzanu.zzf;
                        zzantVar2.zze(obj, j, zzantVar2.zzb(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (zzE(i, obj2)) {
                        zzanu.zzo(obj, j, zzanu.zzd(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (zzE(i, obj2)) {
                        zzanu.zzo(obj, j, zzanu.zzd(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (zzE(i, obj2)) {
                        zzanu.zzn(j, obj, zzanu.zzc(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (zzE(i, obj2)) {
                        zzanu.zzo(obj, j, zzanu.zzd(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (zzE(i, obj2)) {
                        zzanu.zzn(j, obj, zzanu.zzc(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (zzE(i, obj2)) {
                        zzant zzantVar3 = zzanu.zzf;
                        zzantVar3.zzc(obj, j, zzantVar3.zzf(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (zzE(i, obj2)) {
                        zzanu.zzp(obj, j, zzanu.zzf(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    zzx(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (zzE(i, obj2)) {
                        zzanu.zzp(obj, j, zzanu.zzf(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (zzE(i, obj2)) {
                        zzanu.zzn(j, obj, zzanu.zzc(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (zzE(i, obj2)) {
                        zzanu.zzn(j, obj, zzanu.zzc(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (zzE(i, obj2)) {
                        zzanu.zzn(j, obj, zzanu.zzc(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (zzE(i, obj2)) {
                        zzanu.zzo(obj, j, zzanu.zzd(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (zzE(i, obj2)) {
                        zzanu.zzn(j, obj, zzanu.zzc(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (zzE(i, obj2)) {
                        zzanu.zzo(obj, j, zzanu.zzd(obj2, j));
                        zzz(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    zzx(i, obj, obj2);
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
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzalw zzalwVar = (zzalw) zzanu.zzf(obj, j);
                    zzalw zzalwVar2 = (zzalw) zzanu.zzf(obj2, j);
                    int size = zzalwVar.size();
                    int size2 = zzalwVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((zzamz) zzalwVar).zza$1) {
                            zzalwVar = ((zzamz) zzalwVar).zzd(size2 + size);
                        }
                        zzalwVar.addAll(zzalwVar2);
                    }
                    if (size > 0) {
                        zzalwVar2 = zzalwVar;
                    }
                    zzanu.zzp(obj, j, zzalwVar2);
                    obj3 = obj;
                    break;
                case 50:
                    zzzx zzzxVar = zzand.zzb;
                    zzanu.zzp(obj, j, zzzx.zza(zzanu.zzf(obj, j), zzanu.zzf(obj2, j)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzI(i3, i, obj2)) {
                        zzanu.zzp(obj, j, zzanu.zzf(obj2, j));
                        zzanu.zzn(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    zzy(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(i3, i, obj2)) {
                        zzanu.zzp(obj, j, zzanu.zzf(obj2, j));
                        zzanu.zzn(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    zzy(i, obj, obj2);
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

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final void zzg(Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        zzb(obj, bArr, i, i2, 0, zzacgVar);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final boolean zzh(zzals zzalsVar, zzals zzalsVar2) {
        boolean zze;
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i < iArr.length) {
                int zzo = zzo(i);
                long j = zzo & 1048575;
                switch (zzn(zzo)) {
                    case 0:
                        if (!zzD(zzalsVar, zzalsVar2, i)) {
                            break;
                        } else {
                            zzant zzantVar = zzanu.zzf;
                            if (Double.doubleToLongBits(zzantVar.zza(zzalsVar, j)) != Double.doubleToLongBits(zzantVar.zza(zzalsVar2, j))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!zzD(zzalsVar, zzalsVar2, i)) {
                            break;
                        } else {
                            zzant zzantVar2 = zzanu.zzf;
                            if (Float.floatToIntBits(zzantVar2.zzb(zzalsVar, j)) != Float.floatToIntBits(zzantVar2.zzb(zzalsVar2, j))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzd(zzalsVar, j) == zzanu.zzd(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzd(zzalsVar, j) == zzanu.zzd(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzc(zzalsVar, j) == zzanu.zzc(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzd(zzalsVar, j) == zzanu.zzd(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzc(zzalsVar, j) == zzanu.zzc(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!zzD(zzalsVar, zzalsVar2, i)) {
                            break;
                        } else {
                            zzant zzantVar3 = zzanu.zzf;
                            if (zzantVar3.zzf(zzalsVar, j) != zzantVar3.zzf(zzalsVar2, j)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzand.zze(zzanu.zzf(zzalsVar, j), zzanu.zzf(zzalsVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzand.zze(zzanu.zzf(zzalsVar, j), zzanu.zzf(zzalsVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzand.zze(zzanu.zzf(zzalsVar, j), zzanu.zzf(zzalsVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzc(zzalsVar, j) == zzanu.zzc(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzc(zzalsVar, j) == zzanu.zzc(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzc(zzalsVar, j) == zzanu.zzc(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzd(zzalsVar, j) == zzanu.zzd(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzc(zzalsVar, j) == zzanu.zzc(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzanu.zzd(zzalsVar, j) == zzanu.zzd(zzalsVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (zzD(zzalsVar, zzalsVar2, i) && zzand.zze(zzanu.zzf(zzalsVar, j), zzanu.zzf(zzalsVar2, j))) {
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
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zze = zzand.zze(zzanu.zzf(zzalsVar, j), zzanu.zzf(zzalsVar2, j));
                        break;
                    case 50:
                        zze = zzand.zze(zzanu.zzf(zzalsVar, j), zzanu.zzf(zzalsVar2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (zzanu.zzc(zzalsVar, j2) == zzanu.zzc(zzalsVar2, j2) && zzand.zze(zzanu.zzf(zzalsVar, j), zzanu.zzf(zzalsVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (zze) {
                    i += 3;
                }
            } else if (zzalsVar.zzc.equals(zzalsVar2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e1, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzi(Object obj) {
        int i = 0;
        int i2 = 0;
        int i3 = 1048575;
        loop0: while (true) {
            boolean z = true;
            if (i >= this.zzj) {
                return true;
            }
            int i4 = this.zzi[i];
            int[] iArr = this.zzc;
            int i5 = iArr[i4];
            int zzo = zzo(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i3) {
                if (i7 != 1048575) {
                    i2 = zzb.getInt(obj, i7);
                }
                i3 = i7;
            }
            if ((268435456 & zzo) != 0) {
                if (!(i3 == 1048575 ? zzE(i4, obj) : (i2 & i8) != 0)) {
                    break;
                }
            }
            int zzn = zzn(zzo);
            if (zzn == 9 || zzn == 17) {
                if (i3 == 1048575) {
                    z = zzE(i4, obj);
                } else if ((i8 & i2) == 0) {
                    z = false;
                }
                if (z && !zzr(i4).zzi(zzanu.zzf(obj, zzo & 1048575))) {
                    break;
                }
                i++;
            } else {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzI(i5, i4, obj) && !zzr(i4).zzi(zzanu.zzf(obj, zzo & 1048575))) {
                            break;
                        }
                    } else if (zzn != 49) {
                        if (zzn == 50 && !((zzaml) zzanu.zzf(obj, zzo & 1048575)).isEmpty()) {
                            int i9 = i4 / 3;
                            throw Boxes$$ExternalSyntheticOutline1.m(this.zzd[i9 + i9]);
                        }
                    }
                    i++;
                }
                List list = (List) zzanu.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzanb zzr = zzr(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!zzr.zzi(list.get(i10))) {
                            break loop0;
                        }
                    }
                }
                i++;
            }
        }
    }

    public final int zzm(int i, int i2) {
        int[] iArr = this.zzc;
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

    public final int zzo(int i) {
        return this.zzc[i + 1];
    }

    public final zzanz zzq(int i) {
        int i2 = i / 3;
        return (zzanz) this.zzd[i2 + i2 + 1];
    }

    public final zzanb zzr(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.zzd;
        zzanb zzanbVar = (zzanb) objArr[i3];
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb zzb2 = zzamy.zza.zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    public final Object zzt(int i, Object obj) {
        zzanb zzr = zzr(i);
        int zzo = zzo(i) & 1048575;
        if (!zzE(i, obj)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo);
        if (zzH(object)) {
            return object;
        }
        zzals zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    public final Object zzu(int i, int i2, Object obj) {
        zzanb zzr = zzr(i2);
        if (!zzI(i, i2, obj)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i2) & 1048575);
        if (zzH(object)) {
            return object;
        }
        zzals zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    public final void zzx(int i, Object obj, Object obj2) {
        if (zzE(i, obj2)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                TransportImpl$$ExternalSyntheticLambda0.m(this.zzc[i], obj2);
                return;
            }
            zzanb zzr = zzr(i);
            if (!zzE(i, obj)) {
                if (zzH(object)) {
                    zzals zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j, zzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzz(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                zzals zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    public final void zzy(int i, Object obj, Object obj2) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzI(i2, i, obj2)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                TransportImpl$$ExternalSyntheticLambda0.m(iArr[i], obj2);
                return;
            }
            zzanb zzr = zzr(i);
            if (!zzI(i2, i, obj)) {
                if (zzH(object)) {
                    zzals zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j, zzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzanu.zzn(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                zzals zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    public final void zzz(int i, Object obj) {
        int i2 = this.zzc[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        zzanu.zzn(j, obj, (1 << (i2 >>> 20)) | zzanu.zzc(obj, j));
    }
}
