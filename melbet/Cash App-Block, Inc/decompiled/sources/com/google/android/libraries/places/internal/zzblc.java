package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.filament.Box;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.moshi.LinkedHashTreeMap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class zzblc implements zzbln {
    public static final int[] zza = new int[0];
    public static final Unsafe zzb = zzbmg.zzp();
    public final int[] zzc;
    public final Object[] zzd;
    public final int zze;
    public final int zzf;
    public final zzbhz zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int[] zzj;
    public final int zzk;
    public final int zzl;
    public final zzgc zzm;
    public final zzgc zzn;

    public zzblc(int[] iArr, Object[] objArr, int i, int i2, zzbhz zzbhzVar, int[] iArr2, int i3, int i4, zzgc zzgcVar, zzgc zzgcVar2) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzbhzVar instanceof zzbjr;
        boolean z = false;
        if (zzgcVar2 != null && (zzbhzVar instanceof zzbjo)) {
            z = true;
        }
        this.zzh = z;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzgcVar;
        this.zzn = zzgcVar2;
        this.zzg = zzbhzVar;
    }

    public static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzbjr) {
            return ((zzbjr) obj).zzbv();
        }
        return true;
    }

    public static int zzD(Object obj, long j) {
        return ((Integer) zzbmg.zzm(obj, j)).intValue();
    }

    public static long zzE(Object obj, long j) {
        return ((Long) zzbmg.zzm(obj, j)).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzblc zzj(zzbll zzbllVar, zzgc zzgcVar, zzgc zzgcVar2) {
        int i;
        int charAt;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt2;
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
        char charAt7;
        int i15;
        char charAt8;
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        int i20;
        String str;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzk;
        int i25;
        int i26;
        char charAt9;
        int i27;
        int i28;
        int i29;
        int i30;
        Field zzk2;
        Field zzk3;
        int i31;
        char charAt10;
        int i32;
        int i33;
        char charAt11;
        int i34;
        int i35;
        char charAt12;
        int i36;
        char charAt13;
        if (!(zzbllVar instanceof zzbll)) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        String str2 = zzbllVar.zzb;
        int length = str2.length();
        if (str2.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i = i37 + 1;
                if (str2.charAt(i37) < 55296) {
                    break;
                }
                i37 = i;
            }
        } else {
            i = 1;
        }
        int i38 = i + 1;
        int charAt14 = str2.charAt(i);
        if (charAt14 >= 55296) {
            int i39 = charAt14 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                charAt13 = str2.charAt(i38);
                if (charAt13 < 55296) {
                    break;
                }
                i39 |= (charAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            charAt14 = i39 | (charAt13 << i40);
            i38 = i36;
        }
        if (charAt14 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = zza;
            i4 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt15 = str2.charAt(i38);
            if (charAt15 >= 55296) {
                int i42 = charAt15 & 8191;
                int i43 = 13;
                while (true) {
                    i15 = i41 + 1;
                    charAt8 = str2.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i15;
                }
                charAt15 = i42 | (charAt8 << i43);
                i41 = i15;
            }
            int i44 = i41 + 1;
            int charAt16 = str2.charAt(i41);
            if (charAt16 >= 55296) {
                int i45 = charAt16 & 8191;
                int i46 = 13;
                while (true) {
                    i14 = i44 + 1;
                    charAt7 = str2.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i14;
                }
                charAt16 = i45 | (charAt7 << i46);
                i44 = i14;
            }
            int i47 = i44 + 1;
            int charAt17 = str2.charAt(i44);
            if (charAt17 >= 55296) {
                int i48 = charAt17 & 8191;
                int i49 = 13;
                while (true) {
                    i13 = i47 + 1;
                    charAt6 = str2.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i13;
                }
                charAt17 = i48 | (charAt6 << i49);
                i47 = i13;
            }
            int i50 = i47 + 1;
            int charAt18 = str2.charAt(i47);
            if (charAt18 >= 55296) {
                int i51 = charAt18 & 8191;
                int i52 = 13;
                while (true) {
                    i12 = i50 + 1;
                    charAt5 = str2.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i12;
                }
                charAt18 = i51 | (charAt5 << i52);
                i50 = i12;
            }
            int i53 = i50 + 1;
            charAt = str2.charAt(i50);
            if (charAt >= 55296) {
                int i54 = charAt & 8191;
                int i55 = 13;
                while (true) {
                    i11 = i53 + 1;
                    charAt4 = str2.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i11;
                }
                charAt = i54 | (charAt4 << i55);
                i53 = i11;
            }
            int i56 = i53 + 1;
            int charAt19 = str2.charAt(i53);
            if (charAt19 >= 55296) {
                int i57 = charAt19 & 8191;
                int i58 = 13;
                while (true) {
                    i10 = i56 + 1;
                    charAt3 = str2.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i10;
                }
                charAt19 = i57 | (charAt3 << i58);
                i56 = i10;
            }
            int i59 = i56 + 1;
            if (str2.charAt(i56) >= 55296) {
                while (true) {
                    i9 = i59 + 1;
                    if (str2.charAt(i59) < 55296) {
                        break;
                    }
                    i59 = i9;
                }
                i59 = i9;
            }
            int i60 = i59 + 1;
            int charAt20 = str2.charAt(i59);
            if (charAt20 >= 55296) {
                int i61 = charAt20 & 8191;
                int i62 = 13;
                while (true) {
                    i8 = i60 + 1;
                    charAt2 = str2.charAt(i60);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i61 |= (charAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i8;
                }
                charAt20 = i61 | (charAt2 << i62);
                i60 = i8;
            }
            int i63 = charAt15 + charAt15 + charAt16;
            int[] iArr2 = new int[charAt20 + charAt19 + charAt15];
            int i64 = charAt19;
            i2 = charAt17;
            i3 = i64;
            iArr = iArr2;
            i4 = charAt15;
            i38 = i60;
            i5 = charAt18;
            i6 = i63;
            i7 = charAt20;
        }
        Unsafe unsafe = zzb;
        Object[] objArr2 = zzbllVar.zzc;
        Class<?> cls = zzbllVar.zza.getClass();
        int i65 = i7 + i3;
        int i66 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr3 = new Object[i66];
        int i67 = i65;
        int i68 = i7;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int charAt21 = str2.charAt(i38);
            int i72 = length;
            if (charAt21 >= 55296) {
                int i73 = charAt21 & 8191;
                int i74 = i71;
                int i75 = 13;
                while (true) {
                    i35 = i74 + 1;
                    charAt12 = str2.charAt(i74);
                    objArr = objArr2;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i73 |= (charAt12 & 8191) << i75;
                    i75 += 13;
                    i74 = i35;
                    objArr2 = objArr;
                }
                charAt21 = i73 | (charAt12 << i75);
                i16 = i35;
            } else {
                objArr = objArr2;
                i16 = i71;
            }
            int i76 = i16 + 1;
            int charAt22 = str2.charAt(i16);
            if (charAt22 >= 55296) {
                int i77 = charAt22 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i33 = i78 + 1;
                    charAt11 = str2.charAt(i78);
                    i34 = i77;
                    if (charAt11 < 55296) {
                        break;
                    }
                    i77 = i34 | ((charAt11 & 8191) << i79);
                    i79 += 13;
                    i78 = i33;
                }
                charAt22 = i34 | (charAt11 << i79);
                i17 = i33;
            } else {
                i17 = i76;
            }
            int i80 = charAt21;
            if ((charAt22 & 1024) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            int i81 = charAt22 & 255;
            Object[] objArr4 = objArr3;
            int i82 = charAt22 & 2048;
            if (i81 >= 51) {
                int i83 = i17 + 1;
                int charAt23 = str2.charAt(i17);
                if (charAt23 >= 55296) {
                    int i84 = charAt23 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i31 = i85 + 1;
                        charAt10 = str2.charAt(i85);
                        i32 = i84;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i84 = i32 | ((charAt10 & 8191) << i86);
                        i86 += 13;
                        i85 = i31;
                    }
                    charAt23 = i32 | (charAt10 << i86);
                    i29 = i31;
                } else {
                    i29 = i83;
                }
                int i87 = charAt23;
                int i88 = i81 - 51;
                i22 = i29;
                if (i88 == 9 || i88 == 17) {
                    objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i69, 3, 1)] = objArr[i6];
                    i30 = i82;
                    i6++;
                } else {
                    if (i88 == 12) {
                        if (zzbllVar.zzc() == 1 || i82 != 0) {
                            objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i69, 3, 1)] = objArr[i6];
                            i6++;
                        } else {
                            i30 = 0;
                        }
                    }
                    i30 = i82;
                }
                int i89 = i87 + i87;
                Object obj = objArr[i89];
                int i90 = i30;
                if (obj instanceof Field) {
                    zzk2 = (Field) obj;
                } else {
                    zzk2 = zzk(cls, (String) obj);
                    objArr[i89] = zzk2;
                    iArr[i67] = i69;
                    i67++;
                }
                i18 = i4;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzk2);
                int i91 = i89 + 1;
                Object obj2 = objArr[i91];
                if (obj2 instanceof Field) {
                    zzk3 = (Field) obj2;
                } else {
                    zzk3 = zzk(cls, (String) obj2);
                    objArr[i91] = zzk3;
                }
                str = str2;
                i20 = (int) unsafe.objectFieldOffset(zzk3);
                i21 = i81;
                i19 = i65;
                i23 = objectFieldOffset2;
                i24 = i90;
            } else {
                i18 = i4;
                int i92 = i6 + 1;
                Field zzk4 = zzk(cls, (String) objArr[i6]);
                if (i81 == 9 || i81 == 17) {
                    i19 = i65;
                    objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i69, 3, 1)] = zzk4.getType();
                } else {
                    if (i81 == 27) {
                        i19 = i65;
                        i27 = 3;
                        i28 = 1;
                        i6 += 2;
                    } else if (i81 == 49) {
                        i6 += 2;
                        i19 = i65;
                        i27 = 3;
                        i28 = 1;
                    } else {
                        if (i81 == 12 || i81 == 30 || i81 == 44) {
                            i19 = i65;
                            if (zzbllVar.zzc() == 1 || i82 != 0) {
                                i6 += 2;
                                objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i69, 3, 1)] = objArr[i92];
                            } else {
                                i6 = i92;
                                i82 = 0;
                            }
                        } else if (i81 == 50) {
                            int i93 = i6 + 2;
                            int i94 = i68 + 1;
                            iArr[i68] = i69;
                            int i95 = i69 / 3;
                            int i96 = i95 + i95;
                            objArr4[i96] = objArr[i92];
                            if (i82 != 0) {
                                i6 += 3;
                                objArr4[i96 + 1] = objArr[i93];
                                i68 = i94;
                            } else {
                                i6 = i93;
                                i68 = i94;
                                i82 = 0;
                            }
                            i19 = i65;
                        } else {
                            i19 = i65;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzk4);
                        i20 = 1048575;
                        if ((charAt22 & 4096) != 0 || i81 > 17) {
                            str = str2;
                            i21 = i81;
                            i22 = i17;
                            i23 = objectFieldOffset;
                            i24 = i82;
                        } else {
                            int i97 = i17 + 1;
                            int charAt24 = str2.charAt(i17);
                            if (charAt24 >= 55296) {
                                int i98 = charAt24 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i26 = i97 + 1;
                                    charAt9 = str2.charAt(i97);
                                    if (charAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (charAt9 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i26;
                                }
                                charAt24 = i98 | (charAt9 << i99);
                                i97 = i26;
                            }
                            int i100 = (charAt24 / 32) + i18 + i18;
                            Object obj3 = objArr[i100];
                            str = str2;
                            if (obj3 instanceof Field) {
                                zzk = (Field) obj3;
                            } else {
                                zzk = zzk(cls, (String) obj3);
                                objArr[i100] = zzk;
                            }
                            i21 = i81;
                            i25 = charAt24 % 32;
                            i20 = (int) unsafe.objectFieldOffset(zzk);
                            i23 = objectFieldOffset;
                            i22 = i97;
                            i24 = i82;
                            int i101 = i69 + 1;
                            iArr3[i69] = i80;
                            int i102 = i69 + 2;
                            iArr3[i101] = ((charAt22 & 512) == 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((charAt22 & 256) == 0 ? 268435456 : 0) | (i24 == 0 ? PKIFailureInfo.systemUnavail : 0) | (i21 << 20) | i23;
                            i69 += 3;
                            iArr3[i102] = (i25 << 20) | i20;
                            length = i72;
                            objArr3 = objArr4;
                            objArr2 = objArr;
                            i65 = i19;
                            str2 = str;
                            i38 = i22;
                            i4 = i18;
                        }
                    }
                    objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i69, i27, i28)] = objArr[i92];
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzk4);
                    i20 = 1048575;
                    if ((charAt22 & 4096) != 0) {
                    }
                    str = str2;
                    i21 = i81;
                    i22 = i17;
                    i23 = objectFieldOffset;
                    i24 = i82;
                }
                i6 = i92;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzk4);
                i20 = 1048575;
                if ((charAt22 & 4096) != 0) {
                }
                str = str2;
                i21 = i81;
                i22 = i17;
                i23 = objectFieldOffset;
                i24 = i82;
            }
            i25 = 0;
            int i1012 = i69 + 1;
            iArr3[i69] = i80;
            int i1022 = i69 + 2;
            if ((charAt22 & 512) == 0) {
            }
            if ((charAt22 & 256) == 0) {
            }
            iArr3[i1012] = ((charAt22 & 512) == 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((charAt22 & 256) == 0 ? 268435456 : 0) | (i24 == 0 ? PKIFailureInfo.systemUnavail : 0) | (i21 << 20) | i23;
            i69 += 3;
            iArr3[i1022] = (i25 << 20) | i20;
            length = i72;
            objArr3 = objArr4;
            objArr2 = objArr;
            i65 = i19;
            str2 = str;
            i38 = i22;
            i4 = i18;
        }
        return new zzblc(iArr3, objArr3, i2, i5, zzbllVar.zza, iArr, i7, i65, zzgcVar, zzgcVar2);
    }

    public static Field zzk(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            Boxes$$ExternalSyntheticOutline1.m(sb, "Field ", str, " for ", name);
            OptionalProvider$$ExternalSyntheticLambda0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, " not found. Known fields are ", arrays), (Throwable) e);
            return null;
        }
    }

    public static int zzz(int i) {
        return (i >>> 20) & 255;
    }

    public final boolean zzF(zzbjr zzbjrVar, zzbjr zzbjrVar2, int i) {
        return zzH(i, zzbjrVar) == zzH(i, zzbjrVar2);
    }

    public final boolean zzG(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzH(i, obj) : (i3 & i4) != 0;
    }

    public final boolean zzH(int i, Object obj) {
        int i2 = this.zzc[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & zzbmg.zzc(obj, j)) != 0;
        }
        int zzx = zzx(i);
        long j2 = zzx & 1048575;
        switch (zzz(zzx)) {
            case 0:
                if (Double.doubleToRawLongBits(zzbmg.zzf.zzf(obj, j2)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(zzbmg.zzf.zzd(obj, j2)) != 0) {
                }
                break;
            case 2:
                if (zzbmg.zze(obj, j2) != 0) {
                }
                break;
            case 3:
                if (zzbmg.zze(obj, j2) != 0) {
                }
                break;
            case 4:
                if (zzbmg.zzc(obj, j2) != 0) {
                }
                break;
            case 5:
                if (zzbmg.zze(obj, j2) != 0) {
                }
                break;
            case 6:
                if (zzbmg.zzc(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object zzm = zzbmg.zzm(obj, j2);
                if (!(zzm instanceof String)) {
                    if (!(zzm instanceof zzbim)) {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        break;
                    } else if (!zzbim.zza.equals(zzm)) {
                    }
                } else if (!((String) zzm).isEmpty()) {
                }
                break;
            case 9:
                if (zzbmg.zzm(obj, j2) != null) {
                }
                break;
            case 10:
                if (!zzbim.zza.equals(zzbmg.zzm(obj, j2))) {
                }
                break;
            case 11:
                if (zzbmg.zzc(obj, j2) != 0) {
                }
                break;
            case 12:
                if (zzbmg.zzc(obj, j2) != 0) {
                }
                break;
            case 13:
                if (zzbmg.zzc(obj, j2) != 0) {
                }
                break;
            case 14:
                if (zzbmg.zze(obj, j2) != 0) {
                }
                break;
            case 15:
                if (zzbmg.zzc(obj, j2) != 0) {
                }
                break;
            case 16:
                if (zzbmg.zze(obj, j2) != 0) {
                }
                break;
            case 17:
                if (zzbmg.zzm(obj, j2) != null) {
                }
                break;
            default:
                Path$$ExternalSyntheticBUOutline0.m$3();
                break;
        }
        return false;
    }

    public final void zzI(int i, Object obj) {
        int i2 = this.zzc[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        zzbmg.zzd(j, obj, (1 << (i2 >>> 20)) | zzbmg.zzc(obj, j));
    }

    public final boolean zzJ(int i, int i2, Object obj) {
        return zzbmg.zzc(obj, (long) (this.zzc[i2 + 2] & 1048575)) == i;
    }

    public final void zzL(int i, int i2, Object obj) {
        zzbmg.zzd(this.zzc[i2 + 2] & 1048575, obj, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final Object zza() {
        return (zzbjr) ((zzbjr) this.zzg).zzb(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.zzbln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(zzbjr zzbjrVar, zzbjr zzbjrVar2) {
        boolean zzB;
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i < iArr.length) {
                int zzx = zzx(i);
                int zzz = zzz(zzx);
                if (zzz <= 50 || zzz >= 69) {
                    long j = zzx & 1048575;
                    switch (zzz) {
                        case 0:
                            if (!zzF(zzbjrVar, zzbjrVar2, i)) {
                                break;
                            } else {
                                zzzl zzzlVar = zzbmg.zzf;
                                if (Double.doubleToLongBits(zzzlVar.zzf(zzbjrVar, j)) != Double.doubleToLongBits(zzzlVar.zzf(zzbjrVar2, j))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 1:
                            if (!zzF(zzbjrVar, zzbjrVar2, i)) {
                                break;
                            } else {
                                zzzl zzzlVar2 = zzbmg.zzf;
                                if (Float.floatToIntBits(zzzlVar2.zzd(zzbjrVar, j)) != Float.floatToIntBits(zzzlVar2.zzd(zzbjrVar2, j))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 2:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zze(zzbjrVar, j) == zzbmg.zze(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 3:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zze(zzbjrVar, j) == zzbmg.zze(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 4:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zzc(zzbjrVar, j) == zzbmg.zzc(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 5:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zze(zzbjrVar, j) == zzbmg.zze(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 6:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zzc(zzbjrVar, j) == zzbmg.zzc(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 7:
                            if (!zzF(zzbjrVar, zzbjrVar2, i)) {
                                break;
                            } else {
                                zzzl zzzlVar3 = zzbmg.zzf;
                                if (zzzlVar3.zzb(zzbjrVar, j) != zzzlVar3.zzb(zzbjrVar2, j)) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 8:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzblo.zzB(zzbmg.zzm(zzbjrVar, j), zzbmg.zzm(zzbjrVar2, j))) {
                                break;
                            }
                            break;
                        case 9:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzblo.zzB(zzbmg.zzm(zzbjrVar, j), zzbmg.zzm(zzbjrVar2, j))) {
                                break;
                            }
                            break;
                        case 10:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzblo.zzB(zzbmg.zzm(zzbjrVar, j), zzbmg.zzm(zzbjrVar2, j))) {
                                break;
                            }
                            break;
                        case 11:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zzc(zzbjrVar, j) == zzbmg.zzc(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 12:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zzc(zzbjrVar, j) == zzbmg.zzc(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 13:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zzc(zzbjrVar, j) == zzbmg.zzc(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 14:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zze(zzbjrVar, j) == zzbmg.zze(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 15:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zzc(zzbjrVar, j) == zzbmg.zzc(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 16:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzbmg.zze(zzbjrVar, j) == zzbmg.zze(zzbjrVar2, j)) {
                                break;
                            }
                            break;
                        case 17:
                            if (zzF(zzbjrVar, zzbjrVar2, i) && zzblo.zzB(zzbmg.zzm(zzbjrVar, j), zzbmg.zzm(zzbjrVar2, j))) {
                                break;
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
                            zzB = zzblo.zzB(zzbmg.zzm(zzbjrVar, j), zzbmg.zzm(zzbjrVar2, j));
                            if (!zzB) {
                                break;
                            } else {
                                break;
                            }
                        case 50:
                            zzB = zzblo.zzB(zzbmg.zzm(zzbjrVar, j), zzbmg.zzm(zzbjrVar2, j));
                            if (!zzB) {
                            }
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
                            if (zzbmg.zzc(zzbjrVar, j2) == zzbmg.zzc(zzbjrVar2, j2) && zzblo.zzB(zzbmg.zzm(zzbjrVar, j), zzbmg.zzm(zzbjrVar2, j))) {
                                break;
                            }
                            break;
                    }
                    return false;
                }
                i += 3;
            } else {
                int i2 = this.zzl;
                while (true) {
                    int[] iArr2 = this.zzj;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j3 = iArr[i3 + 2] & 1048575;
                        if (zzbmg.zzc(zzbjrVar, j3) != zzbmg.zzc(zzbjrVar2, j3)) {
                            return false;
                        }
                        if (!zzJ(0, i3, zzbjrVar)) {
                            long zzx2 = zzx(i3) & 1048575;
                            if (!zzblo.zzB(zzbmg.zzm(zzbjrVar, zzx2), zzbmg.zzm(zzbjrVar2, zzx2))) {
                            }
                        }
                        i2++;
                    } else if (zzbjrVar.zzc.equals(zzbjrVar2.zzc)) {
                        if (this.zzh) {
                            return ((zzbjo) zzbjrVar).zzb.equals(((zzbjo) zzbjrVar2).zzb);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final int zzc(zzbjr zzbjrVar) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzx = zzx(i6);
            int zzz = zzz(zzx);
            if (zzz <= 50 || zzz >= 69) {
                long j = zzx & 1048575;
                int i7 = 37;
                switch (zzz) {
                    case 0:
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzbmg.zzf.zzf(zzbjrVar, j));
                        byte[] bArr = zzbkc.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 1:
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzbmg.zzf.zzd(zzbjrVar, j));
                        i5 = i2 + floatToIntBits;
                        break;
                    case 2:
                        i = i5 * 53;
                        doubleToLongBits = zzbmg.zze(zzbjrVar, j);
                        byte[] bArr2 = zzbkc.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 3:
                        i = i5 * 53;
                        doubleToLongBits = zzbmg.zze(zzbjrVar, j);
                        byte[] bArr3 = zzbkc.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 4:
                        i2 = i5 * 53;
                        floatToIntBits = zzbmg.zzc(zzbjrVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 5:
                        i = i5 * 53;
                        doubleToLongBits = zzbmg.zze(zzbjrVar, j);
                        byte[] bArr4 = zzbkc.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 6:
                        i2 = i5 * 53;
                        floatToIntBits = zzbmg.zzc(zzbjrVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 7:
                        i = i5 * 53;
                        boolean zzb2 = zzbmg.zzf.zzb(zzbjrVar, j);
                        byte[] bArr5 = zzbkc.zza;
                        i3 = zzb2 ? 1231 : 1237;
                        i5 = i + i3;
                        break;
                    case 8:
                        i2 = i5 * 53;
                        floatToIntBits = ((String) zzbmg.zzm(zzbjrVar, j)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 9:
                        i4 = i5 * 53;
                        Object zzm = zzbmg.zzm(zzbjrVar, j);
                        if (zzm != null) {
                            i7 = zzm.hashCode();
                        }
                        i5 = i4 + i7;
                        break;
                    case 10:
                        i2 = i5 * 53;
                        floatToIntBits = zzbmg.zzm(zzbjrVar, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 11:
                        i2 = i5 * 53;
                        floatToIntBits = zzbmg.zzc(zzbjrVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 12:
                        i2 = i5 * 53;
                        floatToIntBits = zzbmg.zzc(zzbjrVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 13:
                        i2 = i5 * 53;
                        floatToIntBits = zzbmg.zzc(zzbjrVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 14:
                        i = i5 * 53;
                        doubleToLongBits = zzbmg.zze(zzbjrVar, j);
                        byte[] bArr6 = zzbkc.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 15:
                        i2 = i5 * 53;
                        floatToIntBits = zzbmg.zzc(zzbjrVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 16:
                        i = i5 * 53;
                        doubleToLongBits = zzbmg.zze(zzbjrVar, j);
                        byte[] bArr7 = zzbkc.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 17:
                        i4 = i5 * 53;
                        Object zzm2 = zzbmg.zzm(zzbjrVar, j);
                        if (zzm2 != null) {
                            i7 = zzm2.hashCode();
                        }
                        i5 = i4 + i7;
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
                        i2 = i5 * 53;
                        floatToIntBits = zzbmg.zzm(zzbjrVar, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 50:
                        i2 = i5 * 53;
                        floatToIntBits = zzbmg.zzm(zzbjrVar, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                }
            }
        }
        int i8 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i8 >= iArr.length) {
                int hashCode = zzbjrVar.zzc.hashCode() + (i5 * 53);
                if (this.zzh) {
                    return ((zzbjo) zzbjrVar).zzb.zza.hashCode() + (hashCode * 53);
                }
                return hashCode;
            }
            if (!zzJ(0, iArr[i8], zzbjrVar)) {
                i5 = zzbmg.zzm(zzbjrVar, zzx(r3) & 1048575).hashCode() + (i5 * 53);
            }
            i8++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.libraries.places.internal.zzbln
    public final void zzd(Object obj, Object obj2) {
        Object obj3;
        if (!zzB(obj)) {
            a$$ExternalSyntheticBUOutline0.m$3("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                Object obj4 = obj;
                zzblo.zzD(obj4, obj2);
                if (this.zzh) {
                    zzblo.zzC(this.zzn, obj4, obj2);
                    return;
                }
                return;
            }
            int zzx = zzx(i);
            int i2 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i3 = iArr[i];
            long j = i2;
            switch (zzz) {
                case 0:
                    if (zzH(i, obj2)) {
                        zzzl zzzlVar = zzbmg.zzf;
                        obj3 = obj;
                        zzzlVar.zzg(obj3, j, zzzlVar.zzf(obj2, j));
                        zzI(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (zzH(i, obj2)) {
                        zzzl zzzlVar2 = zzbmg.zzf;
                        zzzlVar2.zze(obj, j, zzzlVar2.zzd(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (zzH(i, obj2)) {
                        zzbmg.zzf(obj, j, zzbmg.zze(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (zzH(i, obj2)) {
                        zzbmg.zzf(obj, j, zzbmg.zze(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (zzH(i, obj2)) {
                        zzbmg.zzd(j, obj, zzbmg.zzc(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (zzH(i, obj2)) {
                        zzbmg.zzf(obj, j, zzbmg.zze(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (zzH(i, obj2)) {
                        zzbmg.zzd(j, obj, zzbmg.zzc(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (zzH(i, obj2)) {
                        zzzl zzzlVar3 = zzbmg.zzf;
                        zzzlVar3.zzc(obj, j, zzzlVar3.zzb(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (zzH(i, obj2)) {
                        zzbmg.zzn(obj, j, zzbmg.zzm(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    zzl(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (zzH(i, obj2)) {
                        zzbmg.zzn(obj, j, zzbmg.zzm(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (zzH(i, obj2)) {
                        zzbmg.zzd(j, obj, zzbmg.zzc(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (zzH(i, obj2)) {
                        zzbmg.zzd(j, obj, zzbmg.zzc(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (zzH(i, obj2)) {
                        zzbmg.zzd(j, obj, zzbmg.zzc(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (zzH(i, obj2)) {
                        zzbmg.zzf(obj, j, zzbmg.zze(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (zzH(i, obj2)) {
                        zzbmg.zzd(j, obj, zzbmg.zzc(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (zzH(i, obj2)) {
                        zzbmg.zzf(obj, j, zzbmg.zze(obj2, j));
                        zzI(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    zzl(i, obj, obj2);
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
                    zzbkb zzbkbVar = (zzbkb) zzbmg.zzm(obj, j);
                    zzbkb zzbkbVar2 = (zzbkb) zzbmg.zzm(obj2, j);
                    int size = zzbkbVar.size();
                    int size2 = zzbkbVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((zzbic) zzbkbVar).zza) {
                            zzbkbVar = zzbkbVar.zzg(size2 + size);
                        }
                        zzbkbVar.addAll(zzbkbVar2);
                    }
                    if (size > 0) {
                        zzbkbVar2 = zzbkbVar;
                    }
                    zzbmg.zzn(obj, j, zzbkbVar2);
                    obj3 = obj;
                    break;
                case 50:
                    zzgc zzgcVar = zzblo.zzb;
                    zzbmg.zzn(obj, j, zzgc.zza(zzbmg.zzm(obj, j), zzbmg.zzm(obj2, j)));
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
                    if (zzJ(i3, i, obj2)) {
                        zzbmg.zzn(obj, j, zzbmg.zzm(obj2, j));
                        zzL(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    zzm(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(i3, i, obj2)) {
                        zzbmg.zzn(obj, j, zzbmg.zzm(obj2, j));
                        zzL(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    zzm(i, obj, obj2);
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

    @Override // com.google.android.libraries.places.internal.zzbln
    public final int zze(zzbhz zzbhzVar) {
        int i;
        int zzG;
        int zzH;
        int zzbt;
        int i2;
        int zzy;
        int zzG2;
        int size;
        int zzp;
        int zzG3;
        int zzG4;
        int zzG5;
        int i3;
        int zzG6;
        int zzH2;
        zzblc zzblcVar = this;
        zzbhz zzbhzVar2 = zzbhzVar;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = zzblcVar.zzc;
            if (i6 >= iArr.length) {
                int zzi = ((zzbjr) zzbhzVar).zzc.zzi() + i8;
                if (zzblcVar.zzh) {
                    zzblp zzblpVar = ((zzbjo) zzbhzVar).zzb.zza;
                    if (zzblpVar.zzb > 0) {
                        throw null;
                    }
                    Iterator it = zzblpVar.zze().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        entry.getValue();
                        throw null;
                    }
                }
                return zzi;
            }
            int zzx = zzblcVar.zzx(i6);
            int zzz = zzz(zzx);
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & i4;
            if (zzz <= 17) {
                if (i11 != i5) {
                    i7 = i11 == i4 ? 0 : unsafe.getInt(zzbhzVar2, i11);
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = zzx & i4;
            if (zzz >= zzbji.zzJ.zzZ) {
                zzbji.zzW.getClass();
            }
            long j = i12;
            switch (zzz) {
                case 0:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 4, i8);
                    }
                    zzblcVar = this;
                    break;
                case 2:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(zzbhzVar2, j);
                        zzG = zzbiv.zzG(i9 << 3);
                        zzH = zzbiv.zzH(j2);
                        i8 += zzH + zzG;
                    }
                    zzblcVar = this;
                    break;
                case 3:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(zzbhzVar2, j);
                        zzG = zzbiv.zzG(i9 << 3);
                        zzH = zzbiv.zzH(j3);
                        i8 += zzH + zzG;
                    }
                    zzblcVar = this;
                    break;
                case 4:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(zzbhzVar2, j);
                        zzG = zzbiv.zzG(i9 << 3);
                        zzH = zzbiv.zzH(j4);
                        i8 += zzH + zzG;
                    }
                    zzblcVar = this;
                    break;
                case 5:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 8, i8);
                    }
                    zzblcVar = this;
                    break;
                case 6:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 4, i8);
                    }
                    zzblcVar = this;
                    break;
                case 7:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 1, i8);
                    }
                    zzblcVar = this;
                    break;
                case 8:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(zzbhzVar2, j);
                        if (object instanceof zzbim) {
                            int zzG7 = zzbiv.zzG(i13);
                            int zzb2 = ((zzbim) object).zzb();
                            i8 = zzel$EnumUnboxingLocalUtility.m$1(zzb2, zzb2, zzG7, i8);
                        } else {
                            int zzG8 = zzbiv.zzG(i13);
                            int zza2 = zzbml.zza((String) object);
                            i8 = zzel$EnumUnboxingLocalUtility.m$1(zza2, zza2, zzG8, i8);
                        }
                    }
                    zzblcVar = this;
                    break;
                case 9:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(zzbhzVar2, j);
                        zzbln zzn = zzblcVar.zzn(i6);
                        zzgc zzgcVar = zzblo.zzb;
                        int zzG9 = zzbiv.zzG(i9 << 3);
                        int zzbt2 = ((zzbhz) object2).zzbt(zzn);
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzbt2, zzbt2, zzG9, i8);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        zzbim zzbimVar = (zzbim) unsafe.getObject(zzbhzVar2, j);
                        int zzG10 = zzbiv.zzG(i9 << 3);
                        int zzb3 = zzbimVar.zzb();
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzb3, zzb3, zzG10, i8);
                    }
                    zzblcVar = this;
                    break;
                case 11:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(unsafe.getInt(zzbhzVar2, j), zzbiv.zzG(i9 << 3), i8);
                    }
                    zzblcVar = this;
                    break;
                case 12:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(zzbhzVar2, j);
                        zzG = zzbiv.zzG(i9 << 3);
                        zzH = zzbiv.zzH(j5);
                        i8 += zzH + zzG;
                    }
                    zzblcVar = this;
                    break;
                case 13:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 4, i8);
                    }
                    zzblcVar = this;
                    break;
                case 14:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 8, i8);
                    }
                    zzblcVar = this;
                    break;
                case 15:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(zzbhzVar2, j);
                        i8 = zzel$EnumUnboxingLocalUtility.m((i14 >> 31) ^ (i14 + i14), zzbiv.zzG(i9 << 3), i8);
                    }
                    zzblcVar = this;
                    break;
                case 16:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(zzbhzVar2, j);
                        zzG = zzbiv.zzG(i9 << 3);
                        zzH = zzbiv.zzH((j6 >> 63) ^ (j6 + j6));
                        i8 += zzH + zzG;
                    }
                    zzblcVar = this;
                    break;
                case 17:
                    if (zzblcVar.zzG(zzbhzVar2, i6, i5, i7, i)) {
                        zzbhz zzbhzVar3 = (zzbhz) unsafe.getObject(zzbhzVar2, j);
                        zzbln zzn2 = zzblcVar.zzn(i6);
                        zzgc zzgcVar2 = zzblo.zzb;
                        int zzG11 = zzbiv.zzG(i9 << 3);
                        zzbt = zzbhzVar3.zzbt(zzn2) + zzG11 + zzG11;
                        i8 += zzbt;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i2 = i5;
                    zzy = zzblo.zzy(i9, (List) unsafe.getObject(zzbhzVar2, j));
                    i8 += zzy;
                    i5 = i2;
                    break;
                case 19:
                    i2 = i5;
                    zzy = zzblo.zzw(i9, (List) unsafe.getObject(zzbhzVar2, j));
                    i8 += zzy;
                    i5 = i2;
                    break;
                case 20:
                    i2 = i5;
                    List list = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar3 = zzblo.zzb;
                    if (list.size() != 0) {
                        zzG2 = (zzbiv.zzG(i9 << 3) * list.size()) + zzblo.zzo(list);
                        i8 += zzG2;
                        i5 = i2;
                        break;
                    }
                    zzG2 = 0;
                    i8 += zzG2;
                    i5 = i2;
                case 21:
                    i2 = i5;
                    List list2 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar4 = zzblo.zzb;
                    size = list2.size();
                    if (size != 0) {
                        zzp = zzblo.zzp(list2);
                        zzG3 = zzbiv.zzG(i9 << 3);
                        zzG4 = (zzG3 * size) + zzp;
                        i8 += zzG4;
                        i5 = i2;
                        break;
                    }
                    zzG4 = 0;
                    i8 += zzG4;
                    i5 = i2;
                case 22:
                    i2 = i5;
                    List list3 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar5 = zzblo.zzb;
                    size = list3.size();
                    if (size != 0) {
                        zzp = zzblo.zzs(list3);
                        zzG3 = zzbiv.zzG(i9 << 3);
                        zzG4 = (zzG3 * size) + zzp;
                        i8 += zzG4;
                        i5 = i2;
                        break;
                    }
                    zzG4 = 0;
                    i8 += zzG4;
                    i5 = i2;
                case 23:
                    i2 = i5;
                    zzy = zzblo.zzy(i9, (List) unsafe.getObject(zzbhzVar2, j));
                    i8 += zzy;
                    i5 = i2;
                    break;
                case 24:
                    i2 = i5;
                    zzy = zzblo.zzw(i9, (List) unsafe.getObject(zzbhzVar2, j));
                    i8 += zzy;
                    i5 = i2;
                    break;
                case 25:
                    i2 = i5;
                    List list4 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar6 = zzblo.zzb;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzG2 = (zzbiv.zzG(i9 << 3) + 1) * size2;
                        i8 += zzG2;
                        i5 = i2;
                        break;
                    }
                    zzG2 = 0;
                    i8 += zzG2;
                    i5 = i2;
                case 26:
                    i2 = i5;
                    List list5 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar7 = zzblo.zzb;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzG4 = zzbiv.zzG(i9 << 3) * size3;
                        if (list5 instanceof zzbkk) {
                            zzbkk zzbkkVar = (zzbkk) list5;
                            for (int i15 = 0; i15 < size3; i15++) {
                                Object zzc = zzbkkVar.zzc();
                                if (zzc instanceof zzbim) {
                                    int zzb4 = ((zzbim) zzc).zzb();
                                    zzG4 = zzel$EnumUnboxingLocalUtility.m(zzb4, zzb4, zzG4);
                                } else {
                                    int zza3 = zzbml.zza((String) zzc);
                                    zzG4 = zzel$EnumUnboxingLocalUtility.m(zza3, zza3, zzG4);
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < size3; i16++) {
                                Object obj = list5.get(i16);
                                if (obj instanceof zzbim) {
                                    int zzb5 = ((zzbim) obj).zzb();
                                    zzG4 = zzel$EnumUnboxingLocalUtility.m(zzb5, zzb5, zzG4);
                                } else {
                                    int zza4 = zzbml.zza((String) obj);
                                    zzG4 = zzel$EnumUnboxingLocalUtility.m(zza4, zza4, zzG4);
                                }
                            }
                        }
                        i8 += zzG4;
                        i5 = i2;
                        break;
                    }
                    zzG4 = 0;
                    i8 += zzG4;
                    i5 = i2;
                case 27:
                    i2 = i5;
                    List list6 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzbln zzn3 = zzblcVar.zzn(i6);
                    zzgc zzgcVar8 = zzblo.zzb;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzG5 = 0;
                    } else {
                        zzG5 = zzbiv.zzG(i9 << 3) * size4;
                        for (int i17 = 0; i17 < size4; i17++) {
                            int zzbt3 = ((zzbhz) list6.get(i17)).zzbt(zzn3);
                            zzG5 = zzel$EnumUnboxingLocalUtility.m(zzbt3, zzbt3, zzG5);
                        }
                    }
                    i8 += zzG5;
                    i5 = i2;
                    break;
                case 28:
                    i2 = i5;
                    List list7 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar9 = zzblo.zzb;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzG4 = zzbiv.zzG(i9 << 3) * size5;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int zzb6 = ((zzbim) list7.get(i18)).zzb();
                            zzG4 = zzel$EnumUnboxingLocalUtility.m(zzb6, zzb6, zzG4);
                        }
                        i8 += zzG4;
                        i5 = i2;
                        break;
                    }
                    zzG4 = 0;
                    i8 += zzG4;
                    i5 = i2;
                case 29:
                    i2 = i5;
                    List list8 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar10 = zzblo.zzb;
                    size = list8.size();
                    if (size != 0) {
                        zzp = zzblo.zzt(list8);
                        zzG3 = zzbiv.zzG(i9 << 3);
                        zzG4 = (zzG3 * size) + zzp;
                        i8 += zzG4;
                        i5 = i2;
                        break;
                    }
                    zzG4 = 0;
                    i8 += zzG4;
                    i5 = i2;
                case 30:
                    i2 = i5;
                    List list9 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar11 = zzblo.zzb;
                    size = list9.size();
                    if (size != 0) {
                        zzp = zzblo.zzr(list9);
                        zzG3 = zzbiv.zzG(i9 << 3);
                        zzG4 = (zzG3 * size) + zzp;
                        i8 += zzG4;
                        i5 = i2;
                        break;
                    }
                    zzG4 = 0;
                    i8 += zzG4;
                    i5 = i2;
                case 31:
                    i2 = i5;
                    zzy = zzblo.zzw(i9, (List) unsafe.getObject(zzbhzVar2, j));
                    i8 += zzy;
                    i5 = i2;
                    break;
                case 32:
                    i2 = i5;
                    zzy = zzblo.zzy(i9, (List) unsafe.getObject(zzbhzVar2, j));
                    i8 += zzy;
                    i5 = i2;
                    break;
                case 33:
                    i2 = i5;
                    List list10 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar12 = zzblo.zzb;
                    size = list10.size();
                    if (size != 0) {
                        zzp = zzblo.zzu(list10);
                        zzG3 = zzbiv.zzG(i9 << 3);
                        zzG4 = (zzG3 * size) + zzp;
                        i8 += zzG4;
                        i5 = i2;
                        break;
                    }
                    zzG4 = 0;
                    i8 += zzG4;
                    i5 = i2;
                case 34:
                    i2 = i5;
                    List list11 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar13 = zzblo.zzb;
                    size = list11.size();
                    if (size != 0) {
                        zzp = zzblo.zzq(list11);
                        zzG3 = zzbiv.zzG(i9 << 3);
                        zzG4 = (zzG3 * size) + zzp;
                        i8 += zzG4;
                        i5 = i2;
                        break;
                    }
                    zzG4 = 0;
                    i8 += zzG4;
                    i5 = i2;
                case 35:
                    i2 = i5;
                    List list12 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar14 = zzblo.zzb;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(size6, zzbiv.zzG(i9 << 3), size6, i8);
                    }
                    i5 = i2;
                    break;
                case 36:
                    i2 = i5;
                    List list13 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar15 = zzblo.zzb;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(size7, zzbiv.zzG(i9 << 3), size7, i8);
                    }
                    i5 = i2;
                    break;
                case 37:
                    i2 = i5;
                    int zzo = zzblo.zzo((List) unsafe.getObject(zzbhzVar2, j));
                    if (zzo > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzo, zzbiv.zzG(i9 << 3), zzo, i8);
                    }
                    i5 = i2;
                    break;
                case 38:
                    i2 = i5;
                    int zzp2 = zzblo.zzp((List) unsafe.getObject(zzbhzVar2, j));
                    if (zzp2 > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzp2, zzbiv.zzG(i9 << 3), zzp2, i8);
                    }
                    i5 = i2;
                    break;
                case 39:
                    i2 = i5;
                    int zzs = zzblo.zzs((List) unsafe.getObject(zzbhzVar2, j));
                    if (zzs > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzs, zzbiv.zzG(i9 << 3), zzs, i8);
                    }
                    i5 = i2;
                    break;
                case 40:
                    i2 = i5;
                    List list14 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar16 = zzblo.zzb;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(size8, zzbiv.zzG(i9 << 3), size8, i8);
                    }
                    i5 = i2;
                    break;
                case 41:
                    i2 = i5;
                    List list15 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar17 = zzblo.zzb;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(size9, zzbiv.zzG(i9 << 3), size9, i8);
                    }
                    i5 = i2;
                    break;
                case 42:
                    i2 = i5;
                    List list16 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar18 = zzblo.zzb;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(size10, zzbiv.zzG(i9 << 3), size10, i8);
                    }
                    i5 = i2;
                    break;
                case 43:
                    i2 = i5;
                    int zzt = zzblo.zzt((List) unsafe.getObject(zzbhzVar2, j));
                    if (zzt > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzt, zzbiv.zzG(i9 << 3), zzt, i8);
                    }
                    i5 = i2;
                    break;
                case 44:
                    i2 = i5;
                    int zzr = zzblo.zzr((List) unsafe.getObject(zzbhzVar2, j));
                    if (zzr > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzr, zzbiv.zzG(i9 << 3), zzr, i8);
                    }
                    i5 = i2;
                    break;
                case 45:
                    i2 = i5;
                    List list17 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar19 = zzblo.zzb;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(size11, zzbiv.zzG(i9 << 3), size11, i8);
                    }
                    i5 = i2;
                    break;
                case 46:
                    i2 = i5;
                    List list18 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzgc zzgcVar20 = zzblo.zzb;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(size12, zzbiv.zzG(i9 << 3), size12, i8);
                    }
                    i5 = i2;
                    break;
                case 47:
                    i2 = i5;
                    int zzu = zzblo.zzu((List) unsafe.getObject(zzbhzVar2, j));
                    if (zzu > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzu, zzbiv.zzG(i9 << 3), zzu, i8);
                    }
                    i5 = i2;
                    break;
                case 48:
                    i2 = i5;
                    int zzq = zzblo.zzq((List) unsafe.getObject(zzbhzVar2, j));
                    if (zzq > 0) {
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzq, zzbiv.zzG(i9 << 3), zzq, i8);
                    }
                    i5 = i2;
                    break;
                case 49:
                    i2 = i5;
                    List list19 = (List) unsafe.getObject(zzbhzVar2, j);
                    zzbln zzn4 = zzblcVar.zzn(i6);
                    zzgc zzgcVar21 = zzblo.zzb;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i19 = 0; i19 < size13; i19++) {
                            zzbhz zzbhzVar4 = (zzbhz) list19.get(i19);
                            int zzG12 = zzbiv.zzG(i9 << 3);
                            i3 += zzbhzVar4.zzbt(zzn4) + zzG12 + zzG12;
                        }
                    }
                    i8 += i3;
                    i5 = i2;
                    break;
                case 50:
                    int i20 = i6 / 3;
                    zzbkt zzbktVar = (zzbkt) unsafe.getObject(zzbhzVar2, j);
                    zzbks zzbksVar = (zzbks) zzblcVar.zzd[i20 + i20];
                    if (zzbktVar.isEmpty()) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (Map.Entry entry2 : zzbktVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            Box box = zzbksVar.zza;
                            int zzG13 = zzbiv.zzG(i9 << 3);
                            int i21 = i5;
                            int zzk = zzbjh.zzk((zzbmm) box.mHalfExtent, 2, value) + zzbjh.zzk((zzbmm) box.mCenter, 1, key);
                            i3 = zzel$EnumUnboxingLocalUtility.m$1(zzk, zzk, zzG13, i3);
                            i5 = i21;
                        }
                    }
                    i2 = i5;
                    i8 += i3;
                    i5 = i2;
                    break;
                case 51:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        long zzE = zzE(zzbhzVar2, j);
                        zzG6 = zzbiv.zzG(i9 << 3);
                        zzH2 = zzbiv.zzH(zzE);
                        i8 += zzH2 + zzG6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        long zzE2 = zzE(zzbhzVar2, j);
                        zzG6 = zzbiv.zzG(i9 << 3);
                        zzH2 = zzbiv.zzH(zzE2);
                        i8 += zzH2 + zzG6;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        long zzD = zzD(zzbhzVar2, j);
                        zzG6 = zzbiv.zzG(i9 << 3);
                        zzH2 = zzbiv.zzH(zzD);
                        i8 += zzH2 + zzG6;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 1, i8);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        int i22 = i9 << 3;
                        Object object3 = unsafe.getObject(zzbhzVar2, j);
                        if (object3 instanceof zzbim) {
                            int zzG14 = zzbiv.zzG(i22);
                            int zzb7 = ((zzbim) object3).zzb();
                            i8 = zzel$EnumUnboxingLocalUtility.m$1(zzb7, zzb7, zzG14, i8);
                            break;
                        } else {
                            int zzG15 = zzbiv.zzG(i22);
                            int zza5 = zzbml.zza((String) object3);
                            i8 = zzel$EnumUnboxingLocalUtility.m$1(zza5, zza5, zzG15, i8);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        Object object4 = unsafe.getObject(zzbhzVar2, j);
                        zzbln zzn5 = zzblcVar.zzn(i6);
                        zzgc zzgcVar22 = zzblo.zzb;
                        int zzG16 = zzbiv.zzG(i9 << 3);
                        int zzbt4 = ((zzbhz) object4).zzbt(zzn5);
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzbt4, zzbt4, zzG16, i8);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        zzbim zzbimVar2 = (zzbim) unsafe.getObject(zzbhzVar2, j);
                        int zzG17 = zzbiv.zzG(i9 << 3);
                        int zzb8 = zzbimVar2.zzb();
                        i8 = zzel$EnumUnboxingLocalUtility.m$1(zzb8, zzb8, zzG17, i8);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(zzD(zzbhzVar2, j), zzbiv.zzG(i9 << 3), i8);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        long zzD2 = zzD(zzbhzVar2, j);
                        zzG6 = zzbiv.zzG(i9 << 3);
                        zzH2 = zzbiv.zzH(zzD2);
                        i8 += zzH2 + zzG6;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        i8 = zzel$EnumUnboxingLocalUtility.m(i9 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        int zzD3 = zzD(zzbhzVar2, j);
                        i8 = zzel$EnumUnboxingLocalUtility.m((zzD3 >> 31) ^ (zzD3 + zzD3), zzbiv.zzG(i9 << 3), i8);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        long zzE3 = zzE(zzbhzVar2, j);
                        zzG6 = zzbiv.zzG(i9 << 3);
                        zzH2 = zzbiv.zzH((zzE3 >> 63) ^ (zzE3 + zzE3));
                        i8 += zzH2 + zzG6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzblcVar.zzJ(i9, i6, zzbhzVar2)) {
                        zzbhz zzbhzVar5 = (zzbhz) unsafe.getObject(zzbhzVar2, j);
                        zzbln zzn6 = zzblcVar.zzn(i6);
                        zzgc zzgcVar23 = zzblo.zzb;
                        int zzG18 = zzbiv.zzG(i9 << 3);
                        zzbt = zzbhzVar5.zzbt(zzn6) + zzG18 + zzG18;
                        i8 += zzbt;
                        break;
                    } else {
                        break;
                    }
            }
            i6 += 3;
            zzbhzVar2 = zzbhzVar;
            i4 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:273:0x065e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // com.google.android.libraries.places.internal.zzbln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzfv zzfvVar) {
        Map.Entry entry;
        int i;
        int length;
        boolean z;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        zzblc zzblcVar = this;
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        if (zzblcVar.zzh) {
            zzbjh zzbjhVar = ((zzbjo) obj).zzb;
            if (!zzbjhVar.zza.isEmpty()) {
                entry = (Map.Entry) zzbjhVar.zzd().next();
                Unsafe unsafe = zzb;
                i = 0;
                int i7 = 1048575;
                int i8 = 0;
                while (true) {
                    int[] iArr2 = zzblcVar.zzc;
                    length = iArr2.length;
                    zzgc zzgcVar = zzblcVar.zzn;
                    if (i < length) {
                        if (entry == null) {
                            ((zzbjr) obj).zzc.zzg(zzfvVar);
                            return;
                        }
                        zzgcVar.getClass();
                        zzbmm zzbmmVar = zzbmm.zzc;
                        throw null;
                    }
                    int zzx = zzblcVar.zzx(i);
                    int zzz = zzz(zzx);
                    int i9 = iArr2[i];
                    if (zzz <= 17) {
                        int i10 = iArr2[i + 2];
                        z = true;
                        int i11 = i10 & 1048575;
                        if (i11 != i7) {
                            i8 = i11 == 1048575 ? 0 : unsafe.getInt(obj, i11);
                            i7 = i11;
                        }
                        iArr = iArr2;
                        i2 = 1 << (i10 >>> 20);
                    } else {
                        z = true;
                        iArr = iArr2;
                        i2 = 0;
                    }
                    if (entry != null) {
                        if (i9 >= 525004180) {
                            zzgcVar.getClass();
                            zzbmm zzbmmVar2 = zzbmm.zzc;
                            throw null;
                        }
                    }
                    long j = zzx & 1048575;
                    switch (zzz) {
                        case 0:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzh(i9, Double.doubleToRawLongBits(zzbmg.zzf.zzf(obj, j)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzf(i9, Float.floatToRawIntBits(zzbmg.zzf.zzd(obj, j)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzg(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzg(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzd(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzh(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzf(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzi(i9, zzbmg.zzf.zzb(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                Object object = unsafe.getObject(obj, j);
                                if (object instanceof String) {
                                    zzbivVar.zzj(i9, (String) object);
                                    break;
                                } else {
                                    zzbivVar.zzk(i9, (zzbim) object);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 9:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzfvVar.zzr(i9, unsafe.getObject(obj, j), zzblcVar.zzn(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzk(i9, (zzbim) unsafe.getObject(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zze(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzd(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzf(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzbivVar.zzh(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                int i12 = unsafe.getInt(obj, j);
                                zzbivVar.zze(i9, (i12 >> 31) ^ (i12 + i12));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                long j2 = unsafe.getLong(obj, j);
                                zzbivVar.zzg(i9, (j2 + j2) ^ (j2 >> 63));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzblcVar.zzG(obj, i, i7, i8, i2)) {
                                zzfvVar.zzs(i9, unsafe.getObject(obj, j), zzblcVar.zzn(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i3 = i7;
                            i4 = i8;
                            zzblo.zza(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 19:
                            i3 = i7;
                            i4 = i8;
                            zzblo.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 20:
                            i3 = i7;
                            i4 = i8;
                            zzblo.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 21:
                            i3 = i7;
                            i4 = i8;
                            zzblo.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 22:
                            i3 = i7;
                            i4 = i8;
                            zzblo.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 23:
                            i3 = i7;
                            i4 = i8;
                            zzblo.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 24:
                            i3 = i7;
                            i4 = i8;
                            zzblo.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 25:
                            i3 = i7;
                            i4 = i8;
                            zzblo.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 26:
                            i5 = i7;
                            i6 = i8;
                            int i13 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            zzgc zzgcVar2 = zzblo.zzb;
                            if (list != null && !list.isEmpty()) {
                                if (list instanceof zzbkk) {
                                    zzbkk zzbkkVar = (zzbkk) list;
                                    for (int i14 = 0; i14 < list.size(); i14++) {
                                        Object zzc = zzbkkVar.zzc();
                                        if (zzc instanceof String) {
                                            zzbivVar.zzj(i13, (String) zzc);
                                        } else {
                                            zzbivVar.zzk(i13, (zzbim) zzc);
                                        }
                                    }
                                } else {
                                    for (int i15 = 0; i15 < list.size(); i15++) {
                                        zzbivVar.zzj(i13, (String) list.get(i15));
                                    }
                                }
                            }
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 27:
                            i5 = i7;
                            i6 = i8;
                            int i16 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzbln zzn = zzblcVar.zzn(i);
                            zzgc zzgcVar3 = zzblo.zzb;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i17 = 0; i17 < list2.size(); i17++) {
                                    zzfvVar.zzr(i16, list2.get(i17), zzn);
                                }
                            }
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 28:
                            i5 = i7;
                            i6 = i8;
                            int i18 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            zzgc zzgcVar4 = zzblo.zzb;
                            if (list3 != null && !list3.isEmpty()) {
                                for (int i19 = 0; i19 < list3.size(); i19++) {
                                    zzbivVar.zzk(i18, (zzbim) list3.get(i19));
                                }
                            }
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 29:
                            i3 = i7;
                            i4 = i8;
                            z2 = false;
                            zzblo.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 30:
                            i3 = i7;
                            i4 = i8;
                            z2 = false;
                            zzblo.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 31:
                            i3 = i7;
                            i4 = i8;
                            z2 = false;
                            zzblo.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 32:
                            i3 = i7;
                            i4 = i8;
                            z2 = false;
                            zzblo.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 33:
                            i3 = i7;
                            i4 = i8;
                            z2 = false;
                            zzblo.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 34:
                            i3 = i7;
                            i4 = i8;
                            z2 = false;
                            zzblo.zze(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, false);
                            i7 = i3;
                            i8 = i4;
                            break;
                        case 35:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zza(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 36:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 37:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 38:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 39:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 40:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 41:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 42:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 43:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 44:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 45:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 46:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 47:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, z);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 48:
                            i5 = i7;
                            i6 = i8;
                            zzblo.zze(iArr[i], (List) unsafe.getObject(obj, j), zzfvVar, true);
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 49:
                            i5 = i7;
                            i6 = i8;
                            int i20 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzbln zzn2 = zzblcVar.zzn(i);
                            zzgc zzgcVar5 = zzblo.zzb;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i21 = 0; i21 < list4.size(); i21++) {
                                    zzfvVar.zzs(i20, list4.get(i21), zzn2);
                                }
                            }
                            i7 = i5;
                            i8 = i6;
                            break;
                        case 50:
                            Object object2 = unsafe.getObject(obj, j);
                            if (object2 != null) {
                                int i22 = i / 3;
                                Box box = ((zzbks) zzblcVar.zzd[i22 + i22]).zza;
                                zzbmm zzbmmVar3 = (zzbmm) box.mHalfExtent;
                                zzbmm zzbmmVar4 = (zzbmm) box.mCenter;
                                for (Map.Entry entry2 : ((zzbkt) object2).entrySet()) {
                                    zzbivVar.zzc(i9, 2);
                                    int i23 = i7;
                                    int i24 = i8;
                                    boolean z3 = z;
                                    zzbivVar.zzs(zzbjh.zzk(zzbmmVar3, 2, entry2.getValue()) + zzbjh.zzk(zzbmmVar4, z3 ? 1 : 0, entry2.getKey()));
                                    Object key = entry2.getKey();
                                    Object value = entry2.getValue();
                                    zzbjh.zzi(zzbivVar, zzbmmVar4, z3 ? 1 : 0, key);
                                    zzbjh.zzi(zzbivVar, zzbmmVar3, 2, value);
                                    i7 = i23;
                                    i8 = i24;
                                    z = true;
                                }
                            }
                            break;
                        case 51:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzh(i9, Double.doubleToRawLongBits(((Double) zzbmg.zzm(obj, j)).doubleValue()));
                            }
                            break;
                        case 52:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzf(i9, Float.floatToRawIntBits(((Float) zzbmg.zzm(obj, j)).floatValue()));
                            }
                            break;
                        case 53:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzg(i9, zzE(obj, j));
                            }
                            break;
                        case 54:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzg(i9, zzE(obj, j));
                            }
                            break;
                        case 55:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzd(i9, zzD(obj, j));
                            }
                            break;
                        case 56:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzh(i9, zzE(obj, j));
                            }
                            break;
                        case 57:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzf(i9, zzD(obj, j));
                            }
                            break;
                        case 58:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzi(i9, ((Boolean) zzbmg.zzm(obj, j)).booleanValue());
                            }
                            break;
                        case 59:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                Object object3 = unsafe.getObject(obj, j);
                                if (object3 instanceof String) {
                                    zzbivVar.zzj(i9, (String) object3);
                                } else {
                                    zzbivVar.zzk(i9, (zzbim) object3);
                                }
                            }
                            break;
                        case 60:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzfvVar.zzr(i9, unsafe.getObject(obj, j), zzblcVar.zzn(i));
                            }
                            break;
                        case 61:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzk(i9, (zzbim) unsafe.getObject(obj, j));
                            }
                            break;
                        case 62:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zze(i9, zzD(obj, j));
                            }
                            break;
                        case 63:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzd(i9, zzD(obj, j));
                            }
                            break;
                        case 64:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzf(i9, zzD(obj, j));
                            }
                            break;
                        case 65:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzbivVar.zzh(i9, zzE(obj, j));
                            }
                            break;
                        case 66:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                int zzD = zzD(obj, j);
                                zzbivVar.zze(i9, (zzD >> 31) ^ (zzD + zzD));
                            }
                            break;
                        case 67:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                long zzE = zzE(obj, j);
                                zzbivVar.zzg(i9, (zzE + zzE) ^ (zzE >> 63));
                            }
                            break;
                        case 68:
                            if (zzblcVar.zzJ(i9, i, obj)) {
                                zzfvVar.zzs(i9, unsafe.getObject(obj, j), zzblcVar.zzn(i));
                            }
                            break;
                    }
                    i += 3;
                    zzblcVar = this;
                }
            }
        }
        entry = null;
        Unsafe unsafe2 = zzb;
        i = 0;
        int i72 = 1048575;
        int i82 = 0;
        while (true) {
            int[] iArr22 = zzblcVar.zzc;
            length = iArr22.length;
            zzgc zzgcVar6 = zzblcVar.zzn;
            if (i < length) {
            }
            i += 3;
            zzblcVar = this;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.libraries.places.internal.zzbln
    public final void zzg(java.lang.Object r21, com.squareup.moshi.LinkedHashTreeMap.AvlBuilder r22, com.google.android.libraries.places.internal.zzbjc r23) {
        /*
            Method dump skipped, instructions count: 2258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzblc.zzg(java.lang.Object, com.squareup.moshi.LinkedHashTreeMap$AvlBuilder, com.google.android.libraries.places.internal.zzbjc):void");
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final void zzh(Object obj) {
        if (!zzB(obj)) {
            return;
        }
        if (obj instanceof zzbjr) {
            zzbjr zzbjrVar = (zzbjr) obj;
            zzbjrVar.zzbC();
            zzbjrVar.zza = 0;
            zzbjrVar.zzbw();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                this.zzm.getClass();
                zzbma zzbmaVar = ((zzbjr) obj).zzc;
                if (zzbmaVar.zzf) {
                    zzbmaVar.zzf = false;
                }
                if (this.zzh) {
                    this.zzn.getClass();
                    ((zzbjo) obj).zzb.zzb();
                    return;
                }
                return;
            }
            int zzx = zzx(i);
            int i2 = 1048575 & zzx;
            int zzz = zzz(zzx);
            long j = i2;
            if (zzz != 9) {
                if (zzz != 60 && zzz != 68) {
                    switch (zzz) {
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
                            zzbic zzbicVar = (zzbic) ((zzbkb) zzbmg.zzm(obj, j));
                            if (!zzbicVar.zza) {
                                break;
                            } else {
                                zzbicVar.zza = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object == null) {
                                break;
                            } else {
                                ((zzbkt) object).zza = false;
                                unsafe.putObject(obj, j, object);
                                break;
                            }
                    }
                } else if (zzJ(iArr[i], i, obj)) {
                    zzn(i).zzh(zzb.getObject(obj, j));
                }
                i += 3;
            }
            if (zzH(i, obj)) {
                zzn(i).zzh(zzb.getObject(obj, j));
            }
            i += 3;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final boolean zzi(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        loop0: while (true) {
            if (i3 < this.zzk) {
                int i6 = this.zzj[i3];
                int zzx = this.zzx(i6);
                int[] iArr = this.zzc;
                int i7 = iArr[i6 + 2];
                int i8 = i7 & 1048575;
                int i9 = 1 << (i7 >>> 20);
                if (i8 != i5) {
                    if (i8 != 1048575) {
                        i4 = zzb.getInt(obj, i8);
                    }
                    i2 = i4;
                    i = i8;
                } else {
                    i = i5;
                    i2 = i4;
                }
                zzblc zzblcVar = this;
                Object obj2 = obj;
                if ((268435456 & zzx) != 0 && !zzblcVar.zzG(obj2, i6, i, i2, i9)) {
                    break;
                }
                int zzz = zzz(zzx);
                if (zzz == 9 || zzz == 17) {
                    if (zzblcVar.zzG(obj2, i6, i, i2, i9) && !zzblcVar.zzn(i6).zzi(zzbmg.zzm(obj2, zzx & 1048575))) {
                        break;
                    }
                    i3++;
                    this = zzblcVar;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else {
                    if (zzz != 27) {
                        if (zzz == 60 || zzz == 68) {
                            if (zzblcVar.zzJ(iArr[i6], i6, obj2) && !zzblcVar.zzn(i6).zzi(zzbmg.zzm(obj2, zzx & 1048575))) {
                                break;
                            }
                            i3++;
                            this = zzblcVar;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        } else if (zzz != 49) {
                            if (zzz != 50) {
                                continue;
                            } else {
                                zzbkt zzbktVar = (zzbkt) zzbmg.zzm(obj2, zzx & 1048575);
                                if (zzbktVar.isEmpty()) {
                                    continue;
                                } else {
                                    int i10 = i6 / 3;
                                    if (((zzbmm) ((zzbks) zzblcVar.zzd[i10 + i10]).zza.mHalfExtent).zzs == zzbmn.zzi) {
                                        zzbln zzblnVar = null;
                                        for (Object obj3 : zzbktVar.values()) {
                                            if (zzblnVar == null) {
                                                zzblnVar = zzblj.zza.zzb(obj3.getClass());
                                            }
                                            if (!zzblnVar.zzi(obj3)) {
                                                break loop0;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i3++;
                            this = zzblcVar;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) zzbmg.zzm(obj2, zzx & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zzbln zzn = zzblcVar.zzn(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!zzn.zzi(list.get(i11))) {
                                break loop0;
                            }
                        }
                    }
                    i3++;
                    this = zzblcVar;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            } else {
                Object obj4 = obj;
                if (!this.zzh || ((zzbjo) obj4).zzb.zzg()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void zzl(int i, Object obj, Object obj2) {
        if (zzH(i, obj2)) {
            int zzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String obj3 = obj2.toString();
                TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(i2).length() + 38 + obj3.length(), i2, obj3);
                return;
            }
            zzbln zzn = zzn(i);
            if (!zzH(i, obj)) {
                if (zzB(object)) {
                    Object zza2 = zzn.zza();
                    zzn.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object zza3 = zzn.zza();
                zzn.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzn.zzd(object2, object);
        }
    }

    public final void zzm(int i, Object obj, Object obj2) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzJ(i2, i, obj2)) {
            int zzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(i3).length() + 38 + obj3.length(), i3, obj3);
                return;
            }
            zzbln zzn = zzn(i);
            if (!zzJ(i2, i, obj)) {
                if (zzB(object)) {
                    Object zza2 = zzn.zza();
                    zzn.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzL(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object zza3 = zzn.zza();
                zzn.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzn.zzd(object2, object);
        }
    }

    public final zzbln zzn(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.zzd;
        zzbln zzblnVar = (zzbln) objArr[i3];
        if (zzblnVar != null) {
            return zzblnVar;
        }
        zzbln zzb2 = zzblj.zza.zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    public final zzbjx zzp(int i) {
        int i2 = i / 3;
        return (zzbjx) this.zzd[i2 + i2 + 1];
    }

    public final Object zzq(int i, Object obj) {
        zzbln zzn = zzn(i);
        int zzx = zzx(i) & 1048575;
        if (!zzH(i, obj)) {
            return zzn.zza();
        }
        Object object = zzb.getObject(obj, zzx);
        if (zzB(object)) {
            return object;
        }
        Object zza2 = zzn.zza();
        if (object != null) {
            zzn.zzd(zza2, object);
        }
        return zza2;
    }

    public final void zzr(Object obj, int i, zzbhz zzbhzVar) {
        zzb.putObject(obj, zzx(i) & 1048575, zzbhzVar);
        zzI(i, obj);
    }

    public final Object zzs(int i, int i2, Object obj) {
        zzbln zzn = zzn(i2);
        if (!zzJ(i, i2, obj)) {
            return zzn.zza();
        }
        Object object = zzb.getObject(obj, zzx(i2) & 1048575);
        if (zzB(object)) {
            return object;
        }
        Object zza2 = zzn.zza();
        if (object != null) {
            zzn.zzd(zza2, object);
        }
        return zza2;
    }

    public final void zzt(Object obj, int i, int i2, zzbhz zzbhzVar) {
        zzb.putObject(obj, zzx(i2) & 1048575, zzbhzVar);
        zzL(i, i2, obj);
    }

    public final Object zzu(Object obj, int i, Object obj2, zzgc zzgcVar, Object obj3) {
        zzbjx zzp;
        int i2 = this.zzc[i];
        Object zzm = zzbmg.zzm(obj, zzx(i) & 1048575);
        if (zzm == null || (zzp = zzp(i)) == null) {
            return obj2;
        }
        int i3 = i / 3;
        Box box = ((zzbks) this.zzd[i3 + i3]).zza;
        zzbmm zzbmmVar = (zzbmm) box.mHalfExtent;
        zzbmm zzbmmVar2 = (zzbmm) box.mCenter;
        Iterator it = ((zzbkt) zzm).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzp.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    zzgcVar.getClass();
                    obj2 = zzgc.zzh(obj3);
                }
                int zzk = zzbjh.zzk(zzbmmVar, 2, entry.getValue()) + zzbjh.zzk(zzbmmVar2, 1, entry.getKey());
                zzbil zzbilVar = zzbim.zza;
                byte[] bArr = new byte[zzk];
                boolean z = zzbiv.zzc;
                zzbis zzbisVar = new zzbis(bArr, 0, zzk);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    zzbjh.zzi(zzbisVar, zzbmmVar2, 1, key);
                    zzbjh.zzi(zzbisVar, zzbmmVar, 2, value);
                    zzbisVar.zzJ();
                    zzbil zzbilVar2 = new zzbil(bArr);
                    zzgcVar.getClass();
                    ((zzbma) obj2).zzk((i2 << 3) | 2, zzbilVar2);
                    it.remove();
                } catch (IOException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void zzw(int i, LinkedHashTreeMap.AvlBuilder avlBuilder, Object obj) {
        zzbiq zzbiqVar = (zzbiq) avlBuilder.stack;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            avlBuilder.zzS(2);
            zzbmg.zzn(obj, j, zzbiqVar.zzm());
        } else if (!this.zzi) {
            zzbmg.zzn(obj, j, avlBuilder.zzs());
        } else {
            avlBuilder.zzS(2);
            zzbmg.zzn(obj, j, zzbiqVar.zzl());
        }
    }

    public final int zzx(int i) {
        return this.zzc[i + 1];
    }
}
