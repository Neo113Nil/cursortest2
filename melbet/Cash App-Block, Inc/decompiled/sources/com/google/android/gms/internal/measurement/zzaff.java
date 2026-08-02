package com.google.android.gms.internal.measurement;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
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
public final class zzaff implements zzafp {
    public static final int[] zza = new int[0];
    public static final Unsafe zzb = zzagg.zzp();
    public final int[] zzc;
    public final Object[] zzd;
    public final int zze;
    public final int zzf;
    public final zzacb zzg;
    public final boolean zzi;
    public final int[] zzj;
    public final int zzk;
    public final int zzl;
    public final zztw zzm;

    public zzaff(int[] iArr, Object[] objArr, int i, int i2, zzacb zzacbVar, int[] iArr2, int i3, int i4, zztw zztwVar, zztw zztwVar2) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzacbVar instanceof zzadu;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zztwVar;
        this.zzg = zzacbVar;
    }

    public static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzadu) {
            return ((zzadu) obj).zzch();
        }
        return true;
    }

    public static void zzF(Object obj) {
        if (zzE(obj)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int zzG(Object obj, long j) {
        return ((Integer) zzagg.zzm(obj, j)).intValue();
    }

    public static long zzH(Object obj, long j) {
        return ((Long) zzagg.zzm(obj, j)).longValue();
    }

    public static final int zzS(byte[] bArr, int i, int i2, zzagm zzagmVar, Class cls, zzacg zzacgVar) {
        zzagm zzagmVar2 = zzagm.zzi;
        switch (zzagmVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                zzacgVar.zzc = Double.valueOf(Double.longBitsToDouble(zzh.zze(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                zzacgVar.zzc = Float.valueOf(Float.intBitsToFloat(zzh.zzd(i, bArr)));
                return i4;
            case 2:
            case 3:
                int zzc = zzh.zzc(bArr, i, zzacgVar);
                zzacgVar.zzc = Long.valueOf(zzacgVar.zzb);
                return zzc;
            case 4:
            case 12:
            case 13:
                int zza2 = zzh.zza(bArr, i, zzacgVar);
                zzacgVar.zzc = Integer.valueOf(zzacgVar.zza);
                return zza2;
            case 5:
            case 15:
                int i5 = i + 8;
                zzacgVar.zzc = Long.valueOf(zzh.zze(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                zzacgVar.zzc = Integer.valueOf(zzh.zzd(i, bArr));
                return i6;
            case 7:
                int zzc2 = zzh.zzc(bArr, i, zzacgVar);
                zzacgVar.zzc = Boolean.valueOf(zzacgVar.zzb != 0);
                return zzc2;
            case 8:
                return zzh.zzf(bArr, i, zzacgVar);
            case 9:
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m$1("unsupported field type.");
                return 0;
            case 10:
                zzafp zzb2 = zzafl.zza.zzb(cls);
                zzadu zza3 = zzb2.zza();
                int zzj = zzh.zzj(zza3, zzb2, bArr, i, i2, zzacgVar);
                zzb2.zzk(zza3);
                zzacgVar.zzc = zza3;
                return zzj;
            case 11:
                return zzh.zzg(bArr, i, zzacgVar);
            case 16:
                int zza4 = zzh.zza(bArr, i, zzacgVar);
                zzacgVar.zzc = Integer.valueOf(zzacv.zzR(zzacgVar.zza));
                return zza4;
            case 17:
                int zzc3 = zzh.zzc(bArr, i, zzacgVar);
                zzacgVar.zzc = Long.valueOf(zzacv.zzS(zzacgVar.zzb));
                return zzc3;
        }
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
    public static zzaff zzm(zzafn zzafnVar, zztw zztwVar, zztw zztwVar2) {
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
        Field zzn;
        int i25;
        int i26;
        char charAt9;
        int i27;
        int i28;
        int i29;
        int i30;
        Field zzn2;
        Field zzn3;
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
        if (!(zzafnVar instanceof zzafn)) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        String str2 = zzafnVar.zzb;
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
        Object[] objArr2 = zzafnVar.zzc;
        Class<?> cls = zzafnVar.zza.getClass();
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
                        if (zzafnVar.zzc() == 1 || i82 != 0) {
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
                    zzn2 = (Field) obj;
                } else {
                    zzn2 = zzn(cls, (String) obj);
                    objArr[i89] = zzn2;
                    iArr[i67] = i69;
                    i67++;
                }
                i18 = i4;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzn2);
                int i91 = i89 + 1;
                Object obj2 = objArr[i91];
                if (obj2 instanceof Field) {
                    zzn3 = (Field) obj2;
                } else {
                    zzn3 = zzn(cls, (String) obj2);
                    objArr[i91] = zzn3;
                }
                str = str2;
                i20 = (int) unsafe.objectFieldOffset(zzn3);
                i21 = i81;
                i19 = i65;
                i23 = objectFieldOffset2;
                i24 = i90;
            } else {
                i18 = i4;
                int i92 = i6 + 1;
                Field zzn4 = zzn(cls, (String) objArr[i6]);
                if (i81 == 9 || i81 == 17) {
                    i19 = i65;
                    objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i69, 3, 1)] = zzn4.getType();
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
                            if (zzafnVar.zzc() == 1 || i82 != 0) {
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                                zzn = (Field) obj3;
                            } else {
                                zzn = zzn(cls, (String) obj3);
                                objArr[i100] = zzn;
                            }
                            i21 = i81;
                            i25 = charAt24 % 32;
                            i20 = (int) unsafe.objectFieldOffset(zzn);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
        return new zzaff(iArr3, objArr3, i2, i5, zzafnVar.zza, iArr, i7, i65, zztwVar, zztwVar2);
    }

    public static Field zzn(Class cls, String str) {
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

    public final int zzA(int i) {
        return this.zzc[i + 1];
    }

    public final boolean zzI(zzadu zzaduVar, zzadu zzaduVar2, int i) {
        return zzK(i, zzaduVar) == zzK(i, zzaduVar2);
    }

    public final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzK(i, obj) : (i3 & i4) != 0;
    }

    public final boolean zzK(int i, Object obj) {
        int i2 = this.zzc[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & zzagg.zzc(obj, j)) != 0;
        }
        int zzA = zzA(i);
        long j2 = zzA & 1048575;
        switch (zzC(zzA)) {
            case 0:
                if (Double.doubleToRawLongBits(zzagg.zzf.zzf(obj, j2)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(zzagg.zzf.zzd(obj, j2)) != 0) {
                }
                break;
            case 2:
                if (zzagg.zze(obj, j2) != 0) {
                }
                break;
            case 3:
                if (zzagg.zze(obj, j2) != 0) {
                }
                break;
            case 4:
                if (zzagg.zzc(obj, j2) != 0) {
                }
                break;
            case 5:
                if (zzagg.zze(obj, j2) != 0) {
                }
                break;
            case 6:
                if (zzagg.zzc(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object zzm = zzagg.zzm(obj, j2);
                if (!(zzm instanceof String)) {
                    if (!(zzm instanceof zzacr)) {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        break;
                    } else if (!zzacr.zza.equals(zzm)) {
                    }
                } else if (!((String) zzm).isEmpty()) {
                }
                break;
            case 9:
                if (zzagg.zzm(obj, j2) != null) {
                }
                break;
            case 10:
                if (!zzacr.zza.equals(zzagg.zzm(obj, j2))) {
                }
                break;
            case 11:
                if (zzagg.zzc(obj, j2) != 0) {
                }
                break;
            case 12:
                if (zzagg.zzc(obj, j2) != 0) {
                }
                break;
            case 13:
                if (zzagg.zzc(obj, j2) != 0) {
                }
                break;
            case 14:
                if (zzagg.zze(obj, j2) != 0) {
                }
                break;
            case 15:
                if (zzagg.zzc(obj, j2) != 0) {
                }
                break;
            case 16:
                if (zzagg.zze(obj, j2) != 0) {
                }
                break;
            case 17:
                if (zzagg.zzm(obj, j2) != null) {
                }
                break;
            default:
                Path$$ExternalSyntheticBUOutline0.m$3();
                break;
        }
        return false;
    }

    public final void zzL(int i, Object obj) {
        int i2 = this.zzc[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        zzagg.zzd(j, obj, (1 << (i2 >>> 20)) | zzagg.zzc(obj, j));
    }

    public final boolean zzM(int i, int i2, Object obj) {
        return zzagg.zzc(obj, (long) (this.zzc[i2 + 2] & 1048575)) == i;
    }

    public final void zzO(int i, int i2, Object obj) {
        zzagg.zzd(this.zzc[i2 + 2] & 1048575, obj, i);
    }

    public final int zzQ(int i, int i2) {
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

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final zzadu zza() {
        return ((zzadu) this.zzg).zzck();
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(zzadu zzaduVar, zzadu zzaduVar2) {
        boolean zzC;
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i < iArr.length) {
                int zzA = zzA(i);
                int zzC2 = zzC(zzA);
                if (zzC2 <= 50 || zzC2 >= 69) {
                    long j = zzA & 1048575;
                    switch (zzC2) {
                        case 0:
                            if (!zzI(zzaduVar, zzaduVar2, i)) {
                                break;
                            } else {
                                zzyf zzyfVar = zzagg.zzf;
                                if (Double.doubleToLongBits(zzyfVar.zzf(zzaduVar, j)) != Double.doubleToLongBits(zzyfVar.zzf(zzaduVar2, j))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 1:
                            if (!zzI(zzaduVar, zzaduVar2, i)) {
                                break;
                            } else {
                                zzyf zzyfVar2 = zzagg.zzf;
                                if (Float.floatToIntBits(zzyfVar2.zzd(zzaduVar, j)) != Float.floatToIntBits(zzyfVar2.zzd(zzaduVar2, j))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 2:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zze(zzaduVar, j) == zzagg.zze(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 3:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zze(zzaduVar, j) == zzagg.zze(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 4:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zzc(zzaduVar, j) == zzagg.zzc(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 5:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zze(zzaduVar, j) == zzagg.zze(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 6:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zzc(zzaduVar, j) == zzagg.zzc(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 7:
                            if (!zzI(zzaduVar, zzaduVar2, i)) {
                                break;
                            } else {
                                zzyf zzyfVar3 = zzagg.zzf;
                                if (zzyfVar3.zzb(zzaduVar, j) != zzyfVar3.zzb(zzaduVar2, j)) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 8:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzafq.zzC(zzagg.zzm(zzaduVar, j), zzagg.zzm(zzaduVar2, j))) {
                                break;
                            }
                            break;
                        case 9:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzafq.zzC(zzagg.zzm(zzaduVar, j), zzagg.zzm(zzaduVar2, j))) {
                                break;
                            }
                            break;
                        case 10:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzafq.zzC(zzagg.zzm(zzaduVar, j), zzagg.zzm(zzaduVar2, j))) {
                                break;
                            }
                            break;
                        case 11:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zzc(zzaduVar, j) == zzagg.zzc(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 12:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zzc(zzaduVar, j) == zzagg.zzc(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 13:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zzc(zzaduVar, j) == zzagg.zzc(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 14:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zze(zzaduVar, j) == zzagg.zze(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 15:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zzc(zzaduVar, j) == zzagg.zzc(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 16:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzagg.zze(zzaduVar, j) == zzagg.zze(zzaduVar2, j)) {
                                break;
                            }
                            break;
                        case 17:
                            if (zzI(zzaduVar, zzaduVar2, i) && zzafq.zzC(zzagg.zzm(zzaduVar, j), zzagg.zzm(zzaduVar2, j))) {
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
                            zzC = zzafq.zzC(zzagg.zzm(zzaduVar, j), zzagg.zzm(zzaduVar2, j));
                            if (!zzC) {
                                break;
                            } else {
                                break;
                            }
                        case 50:
                            zzC = zzafq.zzC(zzagg.zzm(zzaduVar, j), zzagg.zzm(zzaduVar2, j));
                            if (!zzC) {
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
                            if (zzagg.zzc(zzaduVar, j2) == zzagg.zzc(zzaduVar2, j2) && zzafq.zzC(zzagg.zzm(zzaduVar, j), zzagg.zzm(zzaduVar2, j))) {
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
                        if (zzagg.zzc(zzaduVar, j3) != zzagg.zzc(zzaduVar2, j3)) {
                            return false;
                        }
                        if (!zzM(0, i3, zzaduVar)) {
                            long zzA2 = zzA(i3) & 1048575;
                            if (!zzafq.zzC(zzagg.zzm(zzaduVar, zzA2), zzagg.zzm(zzaduVar2, zzA2))) {
                            }
                        }
                        i2++;
                    } else if (zzaduVar.zzc.equals(zzaduVar2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int zzc(zzadu zzaduVar) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzA = zzA(i6);
            int zzC = zzC(zzA);
            if (zzC <= 50 || zzC >= 69) {
                long j = zzA & 1048575;
                int i7 = 37;
                switch (zzC) {
                    case 0:
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzagg.zzf.zzf(zzaduVar, j));
                        byte[] bArr = zzaed.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 1:
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzagg.zzf.zzd(zzaduVar, j));
                        i5 = i2 + floatToIntBits;
                        break;
                    case 2:
                        i = i5 * 53;
                        doubleToLongBits = zzagg.zze(zzaduVar, j);
                        byte[] bArr2 = zzaed.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 3:
                        i = i5 * 53;
                        doubleToLongBits = zzagg.zze(zzaduVar, j);
                        byte[] bArr3 = zzaed.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 4:
                        i2 = i5 * 53;
                        floatToIntBits = zzagg.zzc(zzaduVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 5:
                        i = i5 * 53;
                        doubleToLongBits = zzagg.zze(zzaduVar, j);
                        byte[] bArr4 = zzaed.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 6:
                        i2 = i5 * 53;
                        floatToIntBits = zzagg.zzc(zzaduVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 7:
                        i = i5 * 53;
                        boolean zzb2 = zzagg.zzf.zzb(zzaduVar, j);
                        byte[] bArr5 = zzaed.zza;
                        i3 = zzb2 ? 1231 : 1237;
                        i5 = i + i3;
                        break;
                    case 8:
                        i2 = i5 * 53;
                        floatToIntBits = ((String) zzagg.zzm(zzaduVar, j)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 9:
                        i4 = i5 * 53;
                        Object zzm = zzagg.zzm(zzaduVar, j);
                        if (zzm != null) {
                            i7 = zzm.hashCode();
                        }
                        i5 = i4 + i7;
                        break;
                    case 10:
                        i2 = i5 * 53;
                        floatToIntBits = zzagg.zzm(zzaduVar, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 11:
                        i2 = i5 * 53;
                        floatToIntBits = zzagg.zzc(zzaduVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 12:
                        i2 = i5 * 53;
                        floatToIntBits = zzagg.zzc(zzaduVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 13:
                        i2 = i5 * 53;
                        floatToIntBits = zzagg.zzc(zzaduVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 14:
                        i = i5 * 53;
                        doubleToLongBits = zzagg.zze(zzaduVar, j);
                        byte[] bArr6 = zzaed.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 15:
                        i2 = i5 * 53;
                        floatToIntBits = zzagg.zzc(zzaduVar, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 16:
                        i = i5 * 53;
                        doubleToLongBits = zzagg.zze(zzaduVar, j);
                        byte[] bArr7 = zzaed.zza;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 17:
                        i4 = i5 * 53;
                        Object zzm2 = zzagg.zzm(zzaduVar, j);
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
                        floatToIntBits = zzagg.zzm(zzaduVar, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 50:
                        i2 = i5 * 53;
                        floatToIntBits = zzagg.zzm(zzaduVar, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                }
            }
        }
        int i8 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i8 >= iArr.length) {
                return zzaduVar.zzc.hashCode() + (i5 * 53);
            }
            if (!zzM(0, iArr[i8], zzaduVar)) {
                i5 = zzagg.zzm(zzaduVar, zzA(r3) & 1048575).hashCode() + (i5 * 53);
            }
            i8++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzd(Object obj, Object obj2) {
        Object obj3;
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzafq.zzE(obj, obj2);
                return;
            }
            int zzA = zzA(i);
            int i2 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i3 = iArr[i];
            long j = i2;
            switch (zzC) {
                case 0:
                    if (zzK(i, obj2)) {
                        zzyf zzyfVar = zzagg.zzf;
                        obj3 = obj;
                        zzyfVar.zzg(obj3, j, zzyfVar.zzf(obj2, j));
                        zzL(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (zzK(i, obj2)) {
                        zzyf zzyfVar2 = zzagg.zzf;
                        zzyfVar2.zze(obj, j, zzyfVar2.zzd(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (zzK(i, obj2)) {
                        zzagg.zzf(obj, j, zzagg.zze(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (zzK(i, obj2)) {
                        zzagg.zzf(obj, j, zzagg.zze(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (zzK(i, obj2)) {
                        zzagg.zzd(j, obj, zzagg.zzc(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (zzK(i, obj2)) {
                        zzagg.zzf(obj, j, zzagg.zze(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (zzK(i, obj2)) {
                        zzagg.zzd(j, obj, zzagg.zzc(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (zzK(i, obj2)) {
                        zzyf zzyfVar3 = zzagg.zzf;
                        zzyfVar3.zzc(obj, j, zzyfVar3.zzb(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (zzK(i, obj2)) {
                        zzagg.zzn(obj, j, zzagg.zzm(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    zzo(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (zzK(i, obj2)) {
                        zzagg.zzn(obj, j, zzagg.zzm(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (zzK(i, obj2)) {
                        zzagg.zzd(j, obj, zzagg.zzc(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (zzK(i, obj2)) {
                        zzagg.zzd(j, obj, zzagg.zzc(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (zzK(i, obj2)) {
                        zzagg.zzd(j, obj, zzagg.zzc(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (zzK(i, obj2)) {
                        zzagg.zzf(obj, j, zzagg.zze(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (zzK(i, obj2)) {
                        zzagg.zzd(j, obj, zzagg.zzc(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (zzK(i, obj2)) {
                        zzagg.zzf(obj, j, zzagg.zze(obj2, j));
                        zzL(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    zzo(i, obj, obj2);
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
                    zzaef zzaefVar = (zzaef) zzagg.zzm(obj, j);
                    zzaef zzaefVar2 = (zzaef) zzagg.zzm(obj2, j);
                    int size = zzaefVar.size();
                    int size2 = zzaefVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((zzace) zzaefVar).zza) {
                            zzaefVar = zzaefVar.zzg(size2 + size);
                        }
                        zzaefVar.addAll(zzaefVar2);
                    }
                    if (size > 0) {
                        zzaefVar2 = zzaefVar;
                    }
                    zzagg.zzn(obj, j, zzaefVar2);
                    obj3 = obj;
                    break;
                case 50:
                    zztw zztwVar = zzafq.zzb;
                    zzagg.zzn(obj, j, zztw.zzb(zzagg.zzm(obj, j), zzagg.zzm(obj2, j)));
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
                    if (zzM(i3, i, obj2)) {
                        zzagg.zzn(obj, j, zzagg.zzm(obj2, j));
                        zzO(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    zzp(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(i3, i, obj2)) {
                        zzagg.zzn(obj, j, zzagg.zzm(obj2, j));
                        zzO(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    zzp(i, obj, obj2);
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

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int zze(zzacb zzacbVar) {
        int i;
        int zzE;
        int zzF;
        int i2;
        int i3;
        int zzcf;
        int zzE2;
        int size;
        int zzp;
        int zzE3;
        int zzE4;
        int zzE5;
        int i4;
        int zzE6;
        int zzF2;
        zzaff zzaffVar = this;
        zzacb zzacbVar2 = zzacbVar;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = zzaffVar.zzc;
            if (i7 >= iArr.length) {
                return ((zzadu) zzacbVar).zzc.zzi() + i9;
            }
            int zzA = zzaffVar.zzA(i7);
            int zzC = zzC(zzA);
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i5;
            if (zzC <= 17) {
                if (i12 != i6) {
                    i8 = i12 == i5 ? 0 : unsafe.getInt(zzacbVar2, i12);
                    i6 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = zzA & i5;
            if (zzC >= zzadl.zzJ.zzZ) {
                zzadl.zzW.getClass();
            }
            long j = i13;
            switch (zzC) {
                case 0:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        long j2 = unsafe.getLong(zzacbVar2, j);
                        zzE = zzada.zzE(i10 << 3);
                        zzF = zzada.zzF(j2);
                        i2 = zzF + zzE;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        long j3 = unsafe.getLong(zzacbVar2, j);
                        zzE = zzada.zzE(i10 << 3);
                        zzF = zzada.zzF(j3);
                        i2 = zzF + zzE;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        long j4 = unsafe.getInt(zzacbVar2, j);
                        zzE = zzada.zzE(i10 << 3);
                        zzF = zzada.zzF(j4);
                        i2 = zzF + zzE;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(zzacbVar2, j);
                        if (object instanceof zzacr) {
                            int zzE7 = zzada.zzE(i14);
                            int zzb2 = ((zzacr) object).zzb();
                            i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzb2, zzb2, zzE7, i9);
                            break;
                        } else {
                            int zzE8 = zzada.zzE(i14);
                            int zzb3 = zzagl.zzb((String) object);
                            i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzb3, zzb3, zzE8, i9);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(zzacbVar2, j);
                        zzafp zzq = zzaffVar.zzq(i7);
                        zztw zztwVar = zzafq.zzb;
                        int zzE9 = zzada.zzE(i10 << 3);
                        int zzcf2 = ((zzacb) object2).zzcf(zzq);
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzcf2, zzcf2, zzE9, i9);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        zzacr zzacrVar = (zzacr) unsafe.getObject(zzacbVar2, j);
                        int zzE10 = zzada.zzE(i10 << 3);
                        int zzb4 = zzacrVar.zzb();
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzb4, zzb4, zzE10, i9);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(unsafe.getInt(zzacbVar2, j), zzada.zzE(i10 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        long j5 = unsafe.getInt(zzacbVar2, j);
                        zzE = zzada.zzE(i10 << 3);
                        zzF = zzada.zzF(j5);
                        i2 = zzF + zzE;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        int i15 = unsafe.getInt(zzacbVar2, j);
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m((i15 >> 31) ^ (i15 + i15), zzada.zzE(i10 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        long j6 = unsafe.getLong(zzacbVar2, j);
                        zzE = zzada.zzE(i10 << 3);
                        zzF = zzada.zzF((j6 >> 63) ^ (j6 + j6));
                        i2 = zzF + zzE;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzaffVar.zzJ(zzacbVar2, i7, i6, i8, i)) {
                        zzacb zzacbVar3 = (zzacb) unsafe.getObject(zzacbVar2, j);
                        zzafp zzq2 = zzaffVar.zzq(i7);
                        zztw zztwVar2 = zzafq.zzb;
                        int zzE11 = zzada.zzE(i10 << 3);
                        i3 = zzE11 + zzE11;
                        zzcf = zzacbVar3.zzcf(zzq2);
                        i2 = zzcf + i3;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i2 = zzafq.zzy(i10, (List) unsafe.getObject(zzacbVar2, j));
                    i9 += i2;
                    break;
                case 19:
                    i2 = zzafq.zzw(i10, (List) unsafe.getObject(zzacbVar2, j));
                    i9 += i2;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar3 = zzafq.zzb;
                    if (list.size() != 0) {
                        zzE2 = (zzada.zzE(i10 << 3) * list.size()) + zzafq.zzo(list);
                        i9 += zzE2;
                        break;
                    }
                    zzE2 = 0;
                    i9 += zzE2;
                case 21:
                    List list2 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar4 = zzafq.zzb;
                    size = list2.size();
                    if (size != 0) {
                        zzp = zzafq.zzp(list2);
                        zzE3 = zzada.zzE(i10 << 3);
                        zzE4 = (zzE3 * size) + zzp;
                        i9 += zzE4;
                        break;
                    }
                    zzE4 = 0;
                    i9 += zzE4;
                case 22:
                    List list3 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar5 = zzafq.zzb;
                    size = list3.size();
                    if (size != 0) {
                        zzp = zzafq.zzs(list3);
                        zzE3 = zzada.zzE(i10 << 3);
                        zzE4 = (zzE3 * size) + zzp;
                        i9 += zzE4;
                        break;
                    }
                    zzE4 = 0;
                    i9 += zzE4;
                case 23:
                    i2 = zzafq.zzy(i10, (List) unsafe.getObject(zzacbVar2, j));
                    i9 += i2;
                    break;
                case 24:
                    i2 = zzafq.zzw(i10, (List) unsafe.getObject(zzacbVar2, j));
                    i9 += i2;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar6 = zzafq.zzb;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzE2 = (zzada.zzE(i10 << 3) + 1) * size2;
                        i9 += zzE2;
                        break;
                    }
                    zzE2 = 0;
                    i9 += zzE2;
                case 26:
                    List list5 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar7 = zzafq.zzb;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzE4 = zzada.zzE(i10 << 3) * size3;
                        if (list5 instanceof zzaen) {
                            zzaen zzaenVar = (zzaen) list5;
                            for (int i16 = 0; i16 < size3; i16++) {
                                Object zzc = zzaenVar.zzc();
                                if (zzc instanceof zzacr) {
                                    int zzb5 = ((zzacr) zzc).zzb();
                                    zzE4 = FillrEnv$EnumUnboxingLocalUtility.m(zzb5, zzb5, zzE4);
                                } else {
                                    int zzb6 = zzagl.zzb((String) zzc);
                                    zzE4 = FillrEnv$EnumUnboxingLocalUtility.m(zzb6, zzb6, zzE4);
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size3; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof zzacr) {
                                    int zzb7 = ((zzacr) obj).zzb();
                                    zzE4 = FillrEnv$EnumUnboxingLocalUtility.m(zzb7, zzb7, zzE4);
                                } else {
                                    int zzb8 = zzagl.zzb((String) obj);
                                    zzE4 = FillrEnv$EnumUnboxingLocalUtility.m(zzb8, zzb8, zzE4);
                                }
                            }
                        }
                        i9 += zzE4;
                        break;
                    }
                    zzE4 = 0;
                    i9 += zzE4;
                case 27:
                    List list6 = (List) unsafe.getObject(zzacbVar2, j);
                    zzafp zzq3 = zzaffVar.zzq(i7);
                    zztw zztwVar8 = zzafq.zzb;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzE5 = 0;
                    } else {
                        zzE5 = zzada.zzE(i10 << 3) * size4;
                        for (int i18 = 0; i18 < size4; i18++) {
                            int zzcf3 = ((zzacb) list6.get(i18)).zzcf(zzq3);
                            zzE5 = FillrEnv$EnumUnboxingLocalUtility.m(zzcf3, zzcf3, zzE5);
                        }
                    }
                    i9 += zzE5;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar9 = zzafq.zzb;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzE4 = zzada.zzE(i10 << 3) * size5;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int zzb9 = ((zzacr) list7.get(i19)).zzb();
                            zzE4 = FillrEnv$EnumUnboxingLocalUtility.m(zzb9, zzb9, zzE4);
                        }
                        i9 += zzE4;
                        break;
                    }
                    zzE4 = 0;
                    i9 += zzE4;
                case 29:
                    List list8 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar10 = zzafq.zzb;
                    size = list8.size();
                    if (size != 0) {
                        zzp = zzafq.zzt(list8);
                        zzE3 = zzada.zzE(i10 << 3);
                        zzE4 = (zzE3 * size) + zzp;
                        i9 += zzE4;
                        break;
                    }
                    zzE4 = 0;
                    i9 += zzE4;
                case 30:
                    List list9 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar11 = zzafq.zzb;
                    size = list9.size();
                    if (size != 0) {
                        zzp = zzafq.zzr(list9);
                        zzE3 = zzada.zzE(i10 << 3);
                        zzE4 = (zzE3 * size) + zzp;
                        i9 += zzE4;
                        break;
                    }
                    zzE4 = 0;
                    i9 += zzE4;
                case 31:
                    i2 = zzafq.zzw(i10, (List) unsafe.getObject(zzacbVar2, j));
                    i9 += i2;
                    break;
                case 32:
                    i2 = zzafq.zzy(i10, (List) unsafe.getObject(zzacbVar2, j));
                    i9 += i2;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar12 = zzafq.zzb;
                    size = list10.size();
                    if (size != 0) {
                        zzp = zzafq.zzu(list10);
                        zzE3 = zzada.zzE(i10 << 3);
                        zzE4 = (zzE3 * size) + zzp;
                        i9 += zzE4;
                        break;
                    }
                    zzE4 = 0;
                    i9 += zzE4;
                case 34:
                    List list11 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar13 = zzafq.zzb;
                    size = list11.size();
                    if (size != 0) {
                        zzp = zzafq.zzq(list11);
                        zzE3 = zzada.zzE(i10 << 3);
                        zzE4 = (zzE3 * size) + zzp;
                        i9 += zzE4;
                        break;
                    }
                    zzE4 = 0;
                    i9 += zzE4;
                case 35:
                    List list12 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar14 = zzafq.zzb;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(size6, zzada.zzE(i10 << 3), size6, i9);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar15 = zzafq.zzb;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(size7, zzada.zzE(i10 << 3), size7, i9);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzo = zzafq.zzo((List) unsafe.getObject(zzacbVar2, j));
                    if (zzo > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzo, zzada.zzE(i10 << 3), zzo, i9);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzp2 = zzafq.zzp((List) unsafe.getObject(zzacbVar2, j));
                    if (zzp2 > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzp2, zzada.zzE(i10 << 3), zzp2, i9);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzs = zzafq.zzs((List) unsafe.getObject(zzacbVar2, j));
                    if (zzs > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzs, zzada.zzE(i10 << 3), zzs, i9);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar16 = zzafq.zzb;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(size8, zzada.zzE(i10 << 3), size8, i9);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar17 = zzafq.zzb;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(size9, zzada.zzE(i10 << 3), size9, i9);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar18 = zzafq.zzb;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(size10, zzada.zzE(i10 << 3), size10, i9);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzt = zzafq.zzt((List) unsafe.getObject(zzacbVar2, j));
                    if (zzt > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzt, zzada.zzE(i10 << 3), zzt, i9);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zzr = zzafq.zzr((List) unsafe.getObject(zzacbVar2, j));
                    if (zzr > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzr, zzada.zzE(i10 << 3), zzr, i9);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar19 = zzafq.zzb;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(size11, zzada.zzE(i10 << 3), size11, i9);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(zzacbVar2, j);
                    zztw zztwVar20 = zzafq.zzb;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(size12, zzada.zzE(i10 << 3), size12, i9);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzu = zzafq.zzu((List) unsafe.getObject(zzacbVar2, j));
                    if (zzu > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzu, zzada.zzE(i10 << 3), zzu, i9);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzq4 = zzafq.zzq((List) unsafe.getObject(zzacbVar2, j));
                    if (zzq4 > 0) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzq4, zzada.zzE(i10 << 3), zzq4, i9);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(zzacbVar2, j);
                    zzafp zzq5 = zzaffVar.zzq(i7);
                    zztw zztwVar21 = zzafq.zzb;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i20 = 0; i20 < size13; i20++) {
                            zzacb zzacbVar4 = (zzacb) list19.get(i20);
                            int zzE12 = zzada.zzE(i10 << 3);
                            i4 += zzacbVar4.zzcf(zzq5) + zzE12 + zzE12;
                        }
                    }
                    i9 += i4;
                    break;
                case 50:
                    zzaew zzaewVar = (zzaew) unsafe.getObject(zzacbVar2, j);
                    zzaev zzaevVar = (zzaev) zzaffVar.zzr(i7);
                    if (!zzaewVar.isEmpty()) {
                        zzE4 = 0;
                        for (Map.Entry entry : zzaewVar.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            com.google.android.gms.maps.zzah zzahVar = zzaevVar.zza;
                            int zzE13 = zzada.zzE(i10 << 3);
                            int zzc2 = zzaev.zzc(zzahVar, key, value);
                            zzE4 = FillrEnv$EnumUnboxingLocalUtility.m(zzc2, zzc2, zzE13, zzE4);
                        }
                        i9 += zzE4;
                        break;
                    }
                    zzE4 = 0;
                    i9 += zzE4;
                case 51:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        long zzH = zzH(zzacbVar2, j);
                        zzE6 = zzada.zzE(i10 << 3);
                        zzF2 = zzada.zzF(zzH);
                        i9 += zzF2 + zzE6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        long zzH2 = zzH(zzacbVar2, j);
                        zzE6 = zzada.zzE(i10 << 3);
                        zzF2 = zzada.zzF(zzH2);
                        i9 += zzF2 + zzE6;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        long zzG = zzG(zzacbVar2, j);
                        zzE6 = zzada.zzE(i10 << 3);
                        zzF2 = zzada.zzF(zzG);
                        i9 += zzF2 + zzE6;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        int i21 = i10 << 3;
                        Object object3 = unsafe.getObject(zzacbVar2, j);
                        if (object3 instanceof zzacr) {
                            int zzE14 = zzada.zzE(i21);
                            int zzb10 = ((zzacr) object3).zzb();
                            i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzb10, zzb10, zzE14, i9);
                            break;
                        } else {
                            int zzE15 = zzada.zzE(i21);
                            int zzb11 = zzagl.zzb((String) object3);
                            i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzb11, zzb11, zzE15, i9);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        Object object4 = unsafe.getObject(zzacbVar2, j);
                        zzafp zzq6 = zzaffVar.zzq(i7);
                        zztw zztwVar22 = zzafq.zzb;
                        int zzE16 = zzada.zzE(i10 << 3);
                        int zzcf4 = ((zzacb) object4).zzcf(zzq6);
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzcf4, zzcf4, zzE16, i9);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        zzacr zzacrVar2 = (zzacr) unsafe.getObject(zzacbVar2, j);
                        int zzE17 = zzada.zzE(i10 << 3);
                        int zzb12 = zzacrVar2.zzb();
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzb12, zzb12, zzE17, i9);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(zzG(zzacbVar2, j), zzada.zzE(i10 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        long zzG2 = zzG(zzacbVar2, j);
                        zzE6 = zzada.zzE(i10 << 3);
                        zzF2 = zzada.zzF(zzG2);
                        i9 += zzF2 + zzE6;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        int zzG3 = zzG(zzacbVar2, j);
                        i9 = FillrEnv$EnumUnboxingLocalUtility.m((zzG3 >> 31) ^ (zzG3 + zzG3), zzada.zzE(i10 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        long zzH3 = zzH(zzacbVar2, j);
                        zzE6 = zzada.zzE(i10 << 3);
                        zzF2 = zzada.zzF((zzH3 >> 63) ^ (zzH3 + zzH3));
                        i9 += zzF2 + zzE6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzaffVar.zzM(i10, i7, zzacbVar2)) {
                        zzacb zzacbVar5 = (zzacb) unsafe.getObject(zzacbVar2, j);
                        zzafp zzq7 = zzaffVar.zzq(i7);
                        zztw zztwVar23 = zzafq.zzb;
                        int zzE18 = zzada.zzE(i10 << 3);
                        i3 = zzE18 + zzE18;
                        zzcf = zzacbVar5.zzcf(zzq7);
                        i2 = zzcf + i3;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            zzaffVar = this;
            zzacbVar2 = zzacbVar;
            i5 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzf(Object obj, zzj zzjVar) {
        int[] iArr;
        int i;
        zzaff zzaffVar = this;
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = zzaffVar.zzc;
            if (i4 >= iArr2.length) {
                ((zzadu) obj).zzc.zzg(zzjVar);
                return;
            }
            int zzA = zzaffVar.zzA(i4);
            int zzC = zzC(zzA);
            int i6 = iArr2[i4];
            if (zzC <= 17) {
                int i7 = iArr2[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                iArr = iArr2;
                i = 1 << (i7 >>> 20);
            } else {
                iArr = iArr2;
                i = 0;
            }
            long j = zzA & i2;
            switch (zzC) {
                case 0:
                    if (!zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        break;
                    } else {
                        zzadaVar.zzg(i6, Double.doubleToRawLongBits(zzagg.zzf.zzf(obj, j)));
                        continue;
                    }
                case 1:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzadaVar.zze(i6, Float.floatToRawIntBits(zzagg.zzf.zzd(obj, j)));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjVar.zzc(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzadaVar.zzf(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzadaVar.zzc(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjVar.zzj(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzadaVar.zzh(i6, zzagg.zzf.zzb(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            zzadaVar.zzi(i6, (String) object);
                            break;
                        } else {
                            zzjVar.zzn(i6, (zzacr) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjVar.zzr(i6, unsafe.getObject(obj, j), zzaffVar.zzq(i4));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjVar.zzn(i6, (zzacr) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzadaVar.zzd(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzadaVar.zzc(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzadaVar.zze(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        zzadaVar.zzg(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        zzadaVar.zzd(i6, (i9 >> 31) ^ (i9 + i9));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzadaVar.zzf(i6, (j2 >> 63) ^ (j2 + j2));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (zzaffVar.zzJ(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        zzadaVar.zzb(i6, 3);
                        zzaffVar.zzq(i4).zzf((zzacb) object2, zzjVar);
                        zzadaVar.zzb(i6, 4);
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzafq.zza(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 19:
                    zzafq.zzb(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 20:
                    zzafq.zzc(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 21:
                    zzafq.zzd(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 22:
                    zzafq.zzh(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 23:
                    zzafq.zzf(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 24:
                    zzafq.zzk(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 25:
                    zzafq.zzn(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 26:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    zztw zztwVar = zzafq.zzb;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zzaen) {
                            zzaen zzaenVar = (zzaen) list;
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                Object zzc = zzaenVar.zzc();
                                if (zzc instanceof String) {
                                    zzadaVar.zzi(i10, (String) zzc);
                                } else {
                                    zzadaVar.zzj(i10, (zzacr) zzc);
                                }
                            }
                            break;
                        } else {
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                zzadaVar.zzi(i10, (String) list.get(i12));
                            }
                            break;
                        }
                    }
                    break;
                case 27:
                    int i13 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzafp zzq = zzaffVar.zzq(i4);
                    zztw zztwVar2 = zzafq.zzb;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            zzjVar.zzr(i13, list2.get(i14), zzq);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i15 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    zztw zztwVar3 = zzafq.zzb;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            zzadaVar.zzj(i15, (zzacr) list3.get(i16));
                        }
                        break;
                    }
                    break;
                case 29:
                    zzafq.zzi(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 30:
                    zzafq.zzm(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 31:
                    zzafq.zzl(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 32:
                    zzafq.zzg(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 33:
                    zzafq.zzj(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 34:
                    zzafq.zze(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, false);
                    continue;
                case 35:
                    zzafq.zza(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 36:
                    zzafq.zzb(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 37:
                    zzafq.zzc(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 38:
                    zzafq.zzd(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 39:
                    zzafq.zzh(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 40:
                    zzafq.zzf(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 41:
                    zzafq.zzk(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 42:
                    zzafq.zzn(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 43:
                    zzafq.zzi(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 44:
                    zzafq.zzm(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 45:
                    zzafq.zzl(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 46:
                    zzafq.zzg(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 47:
                    zzafq.zzj(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 48:
                    zzafq.zze(iArr[i4], (List) unsafe.getObject(obj, j), zzjVar, true);
                    break;
                case 49:
                    int i17 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzafp zzq2 = zzaffVar.zzq(i4);
                    zztw zztwVar4 = zzafq.zzb;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            zzacb zzacbVar = (zzacb) list4.get(i18);
                            zzadaVar.zzb(i17, 3);
                            zzq2.zzf(zzacbVar, zzjVar);
                            zzadaVar.zzb(i17, 4);
                        }
                        break;
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        com.google.android.gms.maps.zzah zzahVar = ((zzaev) zzaffVar.zzr(i4)).zza;
                        for (Map.Entry entry : ((zzaew) object3).entrySet()) {
                            zzadaVar.zzb(i6, 2);
                            zzadaVar.zzr(zzaev.zzc(zzahVar, entry.getKey(), entry.getValue()));
                            zzaev.zzb(zzadaVar, zzahVar, entry.getKey(), entry.getValue());
                        }
                        break;
                    }
                    break;
                case 51:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzadaVar.zzg(i6, Double.doubleToRawLongBits(((Double) zzagg.zzm(obj, j)).doubleValue()));
                        break;
                    }
                    break;
                case 52:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzadaVar.zze(i6, Float.floatToRawIntBits(((Float) zzagg.zzm(obj, j)).floatValue()));
                        break;
                    }
                    break;
                case 53:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzjVar.zzc(i6, zzH(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzadaVar.zzf(i6, zzH(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzadaVar.zzc(i6, zzG(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzjVar.zzj(i6, zzH(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzjVar.zzk(i6, zzG(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzadaVar.zzh(i6, ((Boolean) zzagg.zzm(obj, j)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            zzadaVar.zzi(i6, (String) object4);
                            break;
                        } else {
                            zzjVar.zzn(i6, (zzacr) object4);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzjVar.zzr(i6, unsafe.getObject(obj, j), zzaffVar.zzq(i4));
                        break;
                    }
                    break;
                case 61:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzjVar.zzn(i6, (zzacr) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzadaVar.zzd(i6, zzG(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzadaVar.zzc(i6, zzG(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzadaVar.zze(i6, zzG(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        zzadaVar.zzg(i6, zzH(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        int zzG = zzG(obj, j);
                        zzadaVar.zzd(i6, (zzG >> 31) ^ (zzG + zzG));
                        break;
                    }
                    break;
                case 67:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        long zzH = zzH(obj, j);
                        zzadaVar.zzf(i6, (zzH >> 63) ^ (zzH + zzH));
                        break;
                    }
                    break;
                case 68:
                    if (zzaffVar.zzM(i6, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        zzadaVar.zzb(i6, 3);
                        zzaffVar.zzq(i4).zzf((zzacb) object5, zzjVar);
                        zzadaVar.zzb(i6, 4);
                        break;
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            zzaffVar = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x07ef A[LOOP:1: B:166:0x07ed->B:167:0x07ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x07ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(Object obj, LinkedHashTreeMap.AvlBuilder avlBuilder, zzadf zzadfVar) {
        Object obj2;
        Object obj3;
        Object obj4;
        zzaff zzaffVar;
        zztw zztwVar;
        Object obj5;
        zzaff zzaffVar2;
        Object obj6;
        Object obj7;
        zzaff zzaffVar3 = this;
        zzacv zzacvVar = (zzacv) avlBuilder.stack;
        int[] iArr = zzaffVar3.zzj;
        int i = zzaffVar3.zzl;
        int i2 = zzaffVar3.zzk;
        zzadfVar.getClass();
        zzF(obj);
        zztw zztwVar2 = zzaffVar3.zzm;
        Object obj8 = null;
        while (true) {
            try {
                int zzb2 = avlBuilder.zzb();
                int zzQ = (zzb2 < zzaffVar3.zze || zzb2 > zzaffVar3.zzf) ? -1 : zzaffVar3.zzQ(zzb2, 0);
                if (zzQ >= 0) {
                    int zzA = zzaffVar3.zzA(zzQ);
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            obj2 = obj8;
                        }
                    } catch (zzaeg unused) {
                        zzaffVar = zzaffVar3;
                        obj2 = obj8;
                        zztwVar = zztwVar2;
                        obj5 = obj;
                    }
                    switch (zzC(zzA)) {
                        case 0:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaff zzaffVar4 = zzaffVar3;
                            int i3 = zzA & 1048575;
                            try {
                                avlBuilder.zzQ(1);
                                zzaffVar = zzaffVar4;
                                zzagg.zzf.zzg(obj, i3, zzacvVar.zzd());
                                zzaffVar.zzL(zzQ, obj);
                                zzaffVar3 = zzaffVar;
                                zztwVar2 = zztwVar;
                                obj8 = obj2;
                            } catch (Throwable th2) {
                                th = th2;
                                zztwVar2 = zztwVar;
                                obj8 = obj2;
                                obj3 = obj8;
                                while (i2 < i) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                            break;
                        case 1:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(5);
                            zzagg.zzf.zze(obj, zzA & 1048575, zzacvVar.zze());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 2:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(0);
                            zzagg.zzf(obj, zzA & 1048575, zzacvVar.zzg());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 3:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(0);
                            zzagg.zzf(obj, zzA & 1048575, zzacvVar.zzf());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 4:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(0);
                            zzagg.zzd(zzA & 1048575, obj, zzacvVar.zzh());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 5:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(1);
                            zzagg.zzf(obj, zzA & 1048575, zzacvVar.zzi());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 6:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(5);
                            zzagg.zzd(zzA & 1048575, obj, zzacvVar.zzj());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 7:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(0);
                            zzagg.zzf.zzc(obj, zzA & 1048575, zzacvVar.zzk());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 8:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            zzaffVar2.zzz(zzA, avlBuilder, obj);
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 9:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            zzacb zzacbVar = (zzacb) zzaffVar2.zzt(zzQ, obj);
                            zzafp zzq = zzaffVar2.zzq(zzQ);
                            avlBuilder.zzQ(2);
                            avlBuilder.zzR(zzacbVar, zzq, zzadfVar);
                            zzaffVar2.zzu(zzQ, obj, zzacbVar);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 10:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            zzagg.zzn(obj, zzA & 1048575, avlBuilder.zzq());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 11:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(0);
                            zzagg.zzd(zzA & 1048575, obj, zzacvVar.zzp());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 12:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(0);
                            int zzq2 = zzacvVar.zzq();
                            zzfj zzs = zzaffVar2.zzs(zzQ);
                            if (zzs != null && !zzs.zza(zzq2)) {
                                zztw zztwVar3 = zzafq.zzb;
                                if (obj2 == null) {
                                    zztwVar.getClass();
                                    obj6 = zztw.zzh(obj);
                                } else {
                                    obj6 = obj2;
                                }
                                zztwVar.getClass();
                                ((zzaga) obj6).zzk(zzb2 << 3, Long.valueOf(zzq2));
                                zzaffVar3 = zzaffVar2;
                                obj8 = obj6;
                                zztwVar2 = zztwVar;
                            }
                            zzagg.zzd(zzA & 1048575, obj, zzq2);
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                            break;
                        case 13:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(5);
                            zzagg.zzd(zzA & 1048575, obj, zzacvVar.zzr());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 14:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(1);
                            zzagg.zzf(obj, zzA & 1048575, zzacvVar.zzs());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 15:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(0);
                            zzagg.zzd(zzA & 1048575, obj, zzacvVar.zzt());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 16:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            avlBuilder.zzQ(0);
                            zzagg.zzf(obj, zzA & 1048575, zzacvVar.zzu());
                            zzaffVar2.zzL(zzQ, obj);
                            zzaffVar = zzaffVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 17:
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar2 = zzaffVar3;
                            obj5 = obj;
                            try {
                                zzacb zzacbVar2 = (zzacb) zzaffVar2.zzt(zzQ, obj5);
                                zzafp zzq3 = zzaffVar2.zzq(zzQ);
                                avlBuilder.zzQ(3);
                                avlBuilder.zzT(zzacbVar2, zzq3, zzadfVar);
                                zzaffVar2.zzu(zzQ, obj5, zzacbVar2);
                                zzaffVar = zzaffVar2;
                                zzaffVar3 = zzaffVar;
                                zztwVar2 = zztwVar;
                                obj8 = obj2;
                            } catch (zzaeg unused2) {
                                zzaffVar = zzaffVar2;
                                obj8 = obj2;
                                if (obj8 == null) {
                                    try {
                                        zztwVar.getClass();
                                        obj8 = zztw.zzh(obj5);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        zztwVar2 = zztwVar;
                                        obj3 = obj8;
                                        while (i2 < i) {
                                            obj3 = zzx(obj, iArr[i2], obj3, zztwVar2, obj);
                                            i2++;
                                        }
                                        if (obj3 != null) {
                                            zztwVar2.getClass();
                                            ((zzadu) obj).zzc = (zzaga) obj3;
                                        }
                                        throw th;
                                    }
                                }
                                zztwVar.getClass();
                                if (zztw.zzk(0, avlBuilder, obj8)) {
                                    zzaffVar3 = this;
                                    zztwVar2 = zztwVar;
                                } else {
                                    obj4 = obj8;
                                    while (i2 < i) {
                                        obj4 = zzaffVar.zzx(obj5, iArr[i2], obj4, zztwVar, obj);
                                        i2++;
                                        zzaffVar = this;
                                        obj5 = obj;
                                    }
                                    zztwVar2 = zztwVar;
                                    if (obj4 == null) {
                                    }
                                }
                            }
                            break;
                        case 18:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            avlBuilder.zzx(zztw.zza(obj, zzA & 1048575));
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 19:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            avlBuilder.zzy(zztw.zza(obj, zzA & 1048575));
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 20:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            avlBuilder.zzA(zztw.zza(obj, zzA & 1048575));
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 21:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            avlBuilder.zzz(zztw.zza(obj, zzA & 1048575));
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 22:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            avlBuilder.zzB(zztw.zza(obj, zzA & 1048575));
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 23:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            avlBuilder.zzC(zztw.zza(obj, zzA & 1048575));
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 24:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            avlBuilder.zzD(zztw.zza(obj, zzA & 1048575));
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 25:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            avlBuilder.zzE(zztw.zza(obj, zzA & 1048575));
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 26:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            if ((536870912 & zzA) != 0) {
                                avlBuilder.zzF(zztw.zza(obj, zzA & 1048575), true);
                            } else {
                                avlBuilder.zzF(zztw.zza(obj, zzA & 1048575), false);
                            }
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 27:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            avlBuilder.zzG(zztw.zza(obj, zzA & 1048575), zzaffVar.zzq(zzQ), zzadfVar);
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 28:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            avlBuilder.zzI(zztw.zza(obj, zzA & 1048575));
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 29:
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            obj5 = obj;
                            try {
                                try {
                                    avlBuilder.zzJ(zztw.zza(obj5, zzA & 1048575));
                                    zzaffVar3 = zzaffVar;
                                    zztwVar2 = zztwVar;
                                    obj8 = obj2;
                                } catch (zzaeg unused3) {
                                    obj8 = obj2;
                                    if (obj8 == null) {
                                    }
                                    zztwVar.getClass();
                                    if (zztw.zzk(0, avlBuilder, obj8)) {
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                zztwVar2 = zztwVar;
                                obj8 = obj2;
                                obj3 = obj8;
                                while (i2 < i) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                            break;
                        case 30:
                            zzaffVar = zzaffVar3;
                            zztwVar = zztwVar2;
                            obj5 = obj;
                            Object obj9 = obj8;
                            try {
                                zzaef zza2 = zztw.zza(obj5, zzA & 1048575);
                                avlBuilder.zzK(zza2);
                                try {
                                    obj8 = zzafq.zzF(obj5, zzb2, zza2, zzaffVar.zzs(zzQ), obj9, zztwVar);
                                    zztwVar = zztwVar;
                                    zzaffVar3 = zzaffVar;
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj9;
                                    zztwVar = zztwVar;
                                    zztwVar2 = zztwVar;
                                    obj8 = obj2;
                                    obj3 = obj8;
                                    while (i2 < i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                            } catch (zzaeg unused4) {
                                obj2 = obj9;
                                obj8 = obj2;
                                if (obj8 == null) {
                                }
                                zztwVar.getClass();
                                if (zztw.zzk(0, avlBuilder, obj8)) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj2 = obj9;
                            }
                            zztwVar2 = zztwVar;
                            break;
                        case 31:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzL(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 32:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzM(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 33:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzN(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 34:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzO(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 35:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzx(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 36:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzy(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 37:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzA(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 38:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzz(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 39:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzB(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 40:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzC(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 41:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzD(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 42:
                            zzaffVar = zzaffVar3;
                            avlBuilder.zzE(zztw.zza(obj, zzA & 1048575));
                            obj2 = obj8;
                            zztwVar = zztwVar2;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 43:
                            zzaffVar = zzaffVar3;
                            obj5 = obj;
                            try {
                                avlBuilder.zzJ(zztw.zza(obj5, zzA & 1048575));
                                obj2 = obj8;
                                zztwVar = zztwVar2;
                                zzaffVar3 = zzaffVar;
                                zztwVar2 = zztwVar;
                                obj8 = obj2;
                            } catch (zzaeg unused5) {
                                obj2 = obj8;
                                zztwVar = zztwVar2;
                                obj8 = obj2;
                                if (obj8 == null) {
                                }
                                zztwVar.getClass();
                                if (zztw.zzk(0, avlBuilder, obj8)) {
                                }
                            }
                            break;
                        case 44:
                            zztwVar = zztwVar2;
                            try {
                                zzaef zza3 = zztw.zza(obj, zzA & 1048575);
                                avlBuilder.zzK(zza3);
                                zzfj zzs2 = zzaffVar3.zzs(zzQ);
                                zzaffVar = zzaffVar3;
                                obj5 = obj;
                                Object obj10 = obj8;
                                try {
                                    try {
                                        obj8 = zzafq.zzF(obj5, zzb2, zza3, zzs2, obj10, zztwVar);
                                        zztwVar2 = zztwVar;
                                        zzaffVar3 = zzaffVar;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        obj8 = obj10;
                                        zztwVar2 = zztwVar;
                                        obj2 = obj8;
                                        obj8 = obj2;
                                        obj3 = obj8;
                                        while (i2 < i) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (zzaeg unused6) {
                                    obj2 = obj10;
                                    zztwVar = zztwVar;
                                    obj8 = obj2;
                                    if (obj8 == null) {
                                    }
                                    zztwVar.getClass();
                                    if (zztw.zzk(0, avlBuilder, obj8)) {
                                    }
                                }
                            } catch (zzaeg unused7) {
                                zzaffVar = zzaffVar3;
                                obj5 = obj;
                                obj2 = obj8;
                            } catch (Throwable th8) {
                                th = th8;
                                zztwVar2 = zztwVar;
                            }
                            break;
                        case 45:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzL(zztw.zza(obj7, zzA & 1048575));
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 46:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzM(zztw.zza(obj7, zzA & 1048575));
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 47:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzN(zztw.zza(obj7, zzA & 1048575));
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 48:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzO(zztw.zza(obj7, zzA & 1048575));
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 49:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzH(zztw.zza(obj7, zzA & 1048575), zzaffVar3.zzq(zzQ), zzadfVar);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 50:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            Object zzr = zzaffVar3.zzr(zzQ);
                            long zzA2 = zzaffVar3.zzA(zzQ) & 1048575;
                            Object zzm = zzagg.zzm(obj7, zzA2);
                            if (zzm == null) {
                                zzm = zzaew.zzb.zzc();
                                zzagg.zzn(obj7, zzA2, zzm);
                            } else if (!((zzaew) zzm).zza) {
                                Object zzc = zzaew.zzb.zzc();
                                zztw.zzb(zzc, zzm);
                                zzagg.zzn(obj7, zzA2, zzc);
                                zzm = zzc;
                            }
                            avlBuilder.zzP((zzaew) zzm, ((zzaev) zzr).zze(), zzadfVar);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 51:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(1);
                            zzagg.zzn(obj7, zzA & 1048575, Double.valueOf(zzacvVar.zzd()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 52:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(5);
                            zzagg.zzn(obj7, zzA & 1048575, Float.valueOf(zzacvVar.zze()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 53:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(0);
                            zzagg.zzn(obj7, zzA & 1048575, Long.valueOf(zzacvVar.zzg()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 54:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(0);
                            zzagg.zzn(obj7, zzA & 1048575, Long.valueOf(zzacvVar.zzf()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 55:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(0);
                            zzagg.zzn(obj7, zzA & 1048575, Integer.valueOf(zzacvVar.zzh()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 56:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(1);
                            zzagg.zzn(obj7, zzA & 1048575, Long.valueOf(zzacvVar.zzi()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 57:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(5);
                            zzagg.zzn(obj7, zzA & 1048575, Integer.valueOf(zzacvVar.zzj()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 58:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(0);
                            zzagg.zzn(obj7, zzA & 1048575, Boolean.valueOf(zzacvVar.zzk()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 59:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            zzaffVar3.zzz(zzA, avlBuilder, obj7);
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 60:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            zzacb zzacbVar3 = (zzacb) zzaffVar3.zzv(zzb2, zzQ, obj7);
                            zzafp zzq4 = zzaffVar3.zzq(zzQ);
                            avlBuilder.zzQ(2);
                            avlBuilder.zzR(zzacbVar3, zzq4, zzadfVar);
                            zzaffVar3.zzw(zzb2, obj7, zzacbVar3, zzQ);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 61:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            zzagg.zzn(obj7, zzA & 1048575, avlBuilder.zzq());
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 62:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(0);
                            zzagg.zzn(obj7, zzA & 1048575, Integer.valueOf(zzacvVar.zzp()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 63:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(0);
                            int zzq5 = zzacvVar.zzq();
                            zzfj zzs3 = zzaffVar3.zzs(zzQ);
                            if (zzs3 != null && !zzs3.zza(zzq5)) {
                                zztw zztwVar4 = zzafq.zzb;
                                if (obj8 == null) {
                                    zztwVar.getClass();
                                    obj6 = zztw.zzh(obj7);
                                } else {
                                    obj6 = obj8;
                                }
                                zztwVar.getClass();
                                ((zzaga) obj6).zzk(zzb2 << 3, Long.valueOf(zzq5));
                                obj8 = obj6;
                                zztwVar2 = zztwVar;
                            }
                            zzagg.zzn(obj7, zzA & 1048575, Integer.valueOf(zzq5));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                            break;
                        case 64:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(5);
                            zzagg.zzn(obj7, zzA & 1048575, Integer.valueOf(zzacvVar.zzr()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 65:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(1);
                            zzagg.zzn(obj7, zzA & 1048575, Long.valueOf(zzacvVar.zzs()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 66:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(0);
                            zzagg.zzn(obj7, zzA & 1048575, Integer.valueOf(zzacvVar.zzt()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 67:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            avlBuilder.zzQ(0);
                            zzagg.zzn(obj7, zzA & 1048575, Long.valueOf(zzacvVar.zzu()));
                            zzaffVar3.zzO(zzb2, zzQ, obj7);
                            zzaffVar = zzaffVar3;
                            obj2 = obj8;
                            zzaffVar3 = zzaffVar;
                            zztwVar2 = zztwVar;
                            obj8 = obj2;
                        case 68:
                            zztwVar = zztwVar2;
                            obj7 = obj;
                            try {
                                zzacb zzacbVar4 = (zzacb) zzaffVar3.zzv(zzb2, zzQ, obj7);
                                zzafp zzq6 = zzaffVar3.zzq(zzQ);
                                avlBuilder.zzQ(3);
                                avlBuilder.zzT(zzacbVar4, zzq6, zzadfVar);
                                zzaffVar3.zzw(zzb2, obj7, zzacbVar4, zzQ);
                                zzaffVar = zzaffVar3;
                                obj2 = obj8;
                                zzaffVar3 = zzaffVar;
                                zztwVar2 = zztwVar;
                                obj8 = obj2;
                            } catch (zzaeg unused8) {
                                zzaffVar = zzaffVar3;
                                obj2 = obj8;
                                obj5 = obj7;
                                obj8 = obj2;
                                if (obj8 == null) {
                                }
                                zztwVar.getClass();
                                if (zztw.zzk(0, avlBuilder, obj8)) {
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj8;
                                zztwVar2 = zztwVar;
                                obj8 = obj2;
                                obj3 = obj8;
                                while (i2 < i) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                            break;
                        default:
                            if (obj8 == null) {
                                zztwVar2.getClass();
                                obj8 = zztw.zzh(obj);
                            }
                            try {
                                zztwVar2.getClass();
                            } catch (zzaeg unused9) {
                                zztwVar = zztwVar2;
                                zzaffVar = zzaffVar3;
                                obj5 = obj;
                                if (obj8 == null) {
                                }
                                zztwVar.getClass();
                                if (zztw.zzk(0, avlBuilder, obj8)) {
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                zztwVar = zztwVar2;
                                zztwVar2 = zztwVar;
                                obj3 = obj8;
                                while (i2 < i) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                            if (!zztw.zzk(0, avlBuilder, obj8)) {
                                obj4 = obj8;
                                while (i2 < i) {
                                    obj4 = zzaffVar3.zzx(obj, iArr[i2], obj4, zztwVar2, obj);
                                    i2++;
                                    zztwVar2 = zztwVar2;
                                }
                                zztwVar = zztwVar2;
                                break;
                            } else {
                                zztwVar = zztwVar2;
                                zztwVar2 = zztwVar;
                            }
                            break;
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    obj4 = obj8;
                    while (i2 < i) {
                        obj4 = zzaffVar3.zzx(obj, iArr[i2], obj4, zztwVar2, obj);
                        i2++;
                        zzaffVar3 = this;
                    }
                } else {
                    if (obj8 == null) {
                        zztwVar2.getClass();
                        obj8 = zztw.zzh(obj);
                    }
                    try {
                        zztwVar2.getClass();
                        if (zztw.zzk(0, avlBuilder, obj8)) {
                            zzaffVar3 = this;
                        } else {
                            obj4 = obj8;
                            while (i2 < i) {
                                obj4 = zzx(obj, iArr[i2], obj4, zztwVar2, obj);
                                i2++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        obj3 = obj8;
                        while (i2 < i) {
                        }
                        if (obj3 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        zztwVar2 = zztwVar;
        if (obj4 == null) {
            zztwVar2.getClass();
            ((zzadu) obj).zzc = (zzaga) obj4;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzi(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.zzacg r40) {
        /*
            Method dump skipped, instructions count: 3612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaff.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzacg):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzacg zzacgVar) {
        zzi(obj, bArr, i, i2, 0, zzacgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzk(Object obj) {
        if (!zzE(obj)) {
            return;
        }
        if (obj instanceof zzadu) {
            zzadu zzaduVar = (zzadu) obj;
            zzaduVar.zzcp();
            zzaduVar.zza = 0;
            zzaduVar.zzci();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                this.zzm.getClass();
                zzaga zzagaVar = ((zzadu) obj).zzc;
                if (zzagaVar.zzf) {
                    zzagaVar.zzf = false;
                    return;
                }
                return;
            }
            int zzA = zzA(i);
            int i2 = 1048575 & zzA;
            int zzC = zzC(zzA);
            long j = i2;
            if (zzC != 9) {
                if (zzC != 60 && zzC != 68) {
                    switch (zzC) {
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
                            zzace zzaceVar = (zzace) ((zzaef) zzagg.zzm(obj, j));
                            if (!zzaceVar.zza) {
                                break;
                            } else {
                                zzaceVar.zza = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object == null) {
                                break;
                            } else {
                                ((zzaew) object).zza = false;
                                unsafe.putObject(obj, j, object);
                                break;
                            }
                    }
                } else if (zzM(iArr[i], i, obj)) {
                    zzq(i).zzk(zzb.getObject(obj, j));
                }
                i += 3;
            }
            if (zzK(i, obj)) {
                zzq(i).zzk(zzb.getObject(obj, j));
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zzk) {
            int i6 = this.zzj[i3];
            int zzA = this.zzA(i6);
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
            zzaff zzaffVar = this;
            Object obj2 = obj;
            if ((268435456 & zzA) == 0 || zzaffVar.zzJ(obj2, i6, i, i2, i9)) {
                int zzC = zzC(zzA);
                if (zzC == 9 || zzC == 17) {
                    if (zzaffVar.zzJ(obj2, i6, i, i2, i9) && !zzaffVar.zzq(i6).zzl(zzagg.zzm(obj2, zzA & 1048575))) {
                    }
                    i3++;
                    this = zzaffVar;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else {
                    if (zzC != 27) {
                        if (zzC == 60 || zzC == 68) {
                            if (zzaffVar.zzM(iArr[i6], i6, obj2) && !zzaffVar.zzq(i6).zzl(zzagg.zzm(obj2, zzA & 1048575))) {
                            }
                            i3++;
                            this = zzaffVar;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        } else if (zzC != 49) {
                            if (zzC != 50) {
                                continue;
                            } else {
                                zzaew zzaewVar = (zzaew) zzagg.zzm(obj2, zzA & 1048575);
                                if (!zzaewVar.isEmpty() && ((zzagm) ((zzaev) zzaffVar.zzr(i6)).zza.zzb).zzs == zzagn.zzi) {
                                    zzafp zzafpVar = null;
                                    for (Object obj3 : zzaewVar.values()) {
                                        if (zzafpVar == null) {
                                            zzafpVar = zzafl.zza.zzb(obj3.getClass());
                                        }
                                        if (!zzafpVar.zzl(obj3)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                            this = zzaffVar;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) zzagg.zzm(obj2, zzA & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zzafp zzq = zzaffVar.zzq(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (zzq.zzl(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                    this = zzaffVar;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    public final void zzo(int i, Object obj, Object obj2) {
        if (zzK(i, obj2)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String obj3 = obj2.toString();
                TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(i2).length() + 38 + obj3.length(), i2, obj3);
                return;
            }
            zzafp zzq = zzq(i);
            if (!zzK(i, obj)) {
                if (zzE(object)) {
                    zzadu zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzL(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                zzadu zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    public final void zzp(int i, Object obj, Object obj2) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(i2, i, obj2)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(i3).length() + 38 + obj3.length(), i3, obj3);
                return;
            }
            zzafp zzq = zzq(i);
            if (!zzM(i2, i, obj)) {
                if (zzE(object)) {
                    zzadu zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                zzadu zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    public final zzafp zzq(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.zzd;
        zzafp zzafpVar = (zzafp) objArr[i3];
        if (zzafpVar != null) {
            return zzafpVar;
        }
        zzafp zzb2 = zzafl.zza.zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    public final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    public final zzfj zzs(int i) {
        int i2 = i / 3;
        return (zzfj) this.zzd[i2 + i2 + 1];
    }

    public final Object zzt(int i, Object obj) {
        zzafp zzq = zzq(i);
        int zzA = zzA(i) & 1048575;
        if (!zzK(i, obj)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA);
        if (zzE(object)) {
            return object;
        }
        zzadu zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    public final void zzu(int i, Object obj, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzL(i, obj);
    }

    public final Object zzv(int i, int i2, Object obj) {
        zzafp zzq = zzq(i2);
        if (!zzM(i, i2, obj)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        zzadu zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    public final void zzw(int i, Object obj, Object obj2, int i2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzO(i, i2, obj);
    }

    public final Object zzx(Object obj, int i, Object obj2, zztw zztwVar, Object obj3) {
        zzfj zzs;
        int i2 = this.zzc[i];
        Object zzm = zzagg.zzm(obj, zzA(i) & 1048575);
        if (zzm == null || (zzs = zzs(i)) == null) {
            return obj2;
        }
        com.google.android.gms.maps.zzah zzahVar = ((zzaev) zzr(i)).zza;
        Iterator it = ((zzaew) zzm).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    zztwVar.getClass();
                    obj2 = zztw.zzh(obj3);
                }
                int zzc = zzaev.zzc(zzahVar, entry.getKey(), entry.getValue());
                zzacq zzacqVar = zzacr.zza;
                byte[] bArr = new byte[zzc];
                boolean z = zzada.zzc;
                zzacx zzacxVar = new zzacx(bArr, zzc);
                try {
                    zzaev.zzb(zzacxVar, zzahVar, entry.getKey(), entry.getValue());
                    zzacxVar.zzH();
                    zzacq zzacqVar2 = new zzacq(bArr);
                    zztwVar.getClass();
                    ((zzaga) obj2).zzk((i2 << 3) | 2, zzacqVar2);
                    it.remove();
                } catch (IOException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void zzz(int i, LinkedHashTreeMap.AvlBuilder avlBuilder, Object obj) {
        zzacv zzacvVar = (zzacv) avlBuilder.stack;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            avlBuilder.zzQ(2);
            zzagg.zzn(obj, j, zzacvVar.zzm());
        } else if (!this.zzi) {
            zzagg.zzn(obj, j, avlBuilder.zzq());
        } else {
            avlBuilder.zzQ(2);
            zzagg.zzn(obj, j, zzacvVar.zzl());
        }
    }
}
