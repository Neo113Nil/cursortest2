package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.core.LongRunningTracesTracker;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class zzfp implements zzge {
    public static final int[] zza = new int[0];
    public static final Unsafe zzb = zzgz.zzg();
    public final int[] zzc;
    public final Object[] zzd;
    public final int zze;
    public final int zzf;
    public final zzcq zzg;
    public final boolean zzh;
    public final int[] zzi;
    public final int zzj;
    public final int zzk;
    public final zzea zzl;
    public final zzea zzm;

    public zzfp(int[] iArr, Object[] objArr, int i, int i2, zzcq zzcqVar, int[] iArr2, int i3, int i4, zzea zzeaVar, zzea zzeaVar2) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z = false;
        if (zzeaVar2 != null && (zzcqVar instanceof zzed)) {
            z = true;
        }
        this.zzh = z;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzeaVar;
        this.zzm = zzeaVar2;
        this.zzg = zzcqVar;
    }

    public static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzY();
        }
        return true;
    }

    public static zzgt zzd(Object obj) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar != zzgt.zza) {
            return zzgtVar;
        }
        zzgt zzf = zzgt.zzf();
        zzehVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfp zzl(zzfw zzfwVar, zzea zzeaVar, zzea zzeaVar2) {
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
        Field zzz;
        char charAt10;
        int i28;
        int i29;
        int i30;
        int i31;
        Field zzz2;
        Field zzz3;
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
        if (!(zzfwVar instanceof zzfw)) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        String str = zzfwVar.zzb;
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
        Object[] objArr2 = zzfwVar.zzc;
        Class<?> cls = zzfwVar.zza.getClass();
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
                        if (zzfwVar.zzc() == 1 || i85 != 0) {
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
                    zzz2 = (Field) obj;
                } else {
                    zzz2 = zzz(cls, (String) obj);
                    objArr[i93] = zzz2;
                }
                i18 = i2;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz2);
                int i95 = i93 + 1;
                Object obj2 = objArr[i95];
                if (obj2 instanceof Field) {
                    zzz3 = (Field) obj2;
                } else {
                    zzz3 = zzz(cls, (String) obj2);
                    objArr[i95] = zzz3;
                }
                i20 = (int) unsafe.objectFieldOffset(zzz3);
                i19 = i68;
                i27 = objectFieldOffset2;
                i26 = i94;
                i23 = i92;
                i21 = i72;
                i25 = 0;
            } else {
                i18 = i2;
                int i96 = i6 + 1;
                Field zzz4 = zzz(cls, (String) objArr[i6]);
                if (i84 == 9 || i84 == 17) {
                    i19 = i68;
                    objArr4[FillrEnv$EnumUnboxingLocalUtility.m$1(i72, 3, 1)] = zzz4.getType();
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
                            if (zzfwVar.zzc() == 1 || i85 != 0) {
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                                zzz = (Field) obj3;
                            } else {
                                zzz = zzz(cls, (String) obj3);
                                objArr[i104] = zzz;
                            }
                            i21 = i72;
                            i22 = objectFieldOffset;
                            i24 = charAt26 % 32;
                            i20 = (int) unsafe.objectFieldOffset(zzz);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
        return new zzfp(iArr2, objArr3, i3, i5, zzfwVar.zza, iArr, i7, i68, zzeaVar, zzeaVar2);
    }

    public static int zzo(Object obj, long j) {
        return ((Integer) zzgz.zzf(obj, j)).intValue();
    }

    public static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    public static long zzt(Object obj, long j) {
        return ((Long) zzgz.zzf(obj, j)).longValue();
    }

    public static Field zzz(Class cls, String str) {
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
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Field ", str, " for ", name, " not found. Known fields are ");
            m.append(arrays);
            throw new RuntimeException(m.toString());
        }
    }

    public final void zzB(int i, Object obj, Object obj2) {
        if (zzI(i, obj2)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                TransportImpl$$ExternalSyntheticLambda0.m(this.zzc[i], obj2);
                return;
            }
            zzge zzv = zzv(i);
            if (!zzI(i, obj)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    public final void zzC(int i, Object obj, Object obj2) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(i2, i, obj2)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                TransportImpl$$ExternalSyntheticLambda0.m(iArr[i], obj2);
                return;
            }
            zzge zzv = zzv(i);
            if (!zzM(i2, i, obj)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzgz.zzq(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    public final void zzD(int i, Object obj) {
        int i2 = this.zzc[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        zzgz.zzq(j, obj, (1 << (i2 >>> 20)) | zzgz.zzc(obj, j));
    }

    public final void zzF(int i, Object obj, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(i, obj);
    }

    public final void zzG(int i, Object obj, Object obj2, int i2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzgz.zzq(this.zzc[i2 + 2] & 1048575, obj, i);
    }

    public final boolean zzH(zzeh zzehVar, zzeh zzehVar2, int i) {
        return zzI(i, zzehVar) == zzI(i, zzehVar2);
    }

    public final boolean zzI(int i, Object obj) {
        int i2 = this.zzc[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & zzgz.zzc(obj, j)) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                if (Double.doubleToRawLongBits(zzgz.zzf.zza(obj, j2)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(zzgz.zzf.zzb(obj, j2)) != 0) {
                }
                break;
            case 2:
                if (zzgz.zzd(obj, j2) != 0) {
                }
                break;
            case 3:
                if (zzgz.zzd(obj, j2) != 0) {
                }
                break;
            case 4:
                if (zzgz.zzc(obj, j2) != 0) {
                }
                break;
            case 5:
                if (zzgz.zzd(obj, j2) != 0) {
                }
                break;
            case 6:
                if (zzgz.zzc(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object zzf = zzgz.zzf(obj, j2);
                if (!(zzf instanceof String)) {
                    if (!(zzf instanceof zzdf)) {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        break;
                    } else if (!zzdf.zzb.equals(zzf)) {
                    }
                } else if (!((String) zzf).isEmpty()) {
                }
                break;
            case 9:
                if (zzgz.zzf(obj, j2) != null) {
                }
                break;
            case 10:
                if (!zzdf.zzb.equals(zzgz.zzf(obj, j2))) {
                }
                break;
            case 11:
                if (zzgz.zzc(obj, j2) != 0) {
                }
                break;
            case 12:
                if (zzgz.zzc(obj, j2) != 0) {
                }
                break;
            case 13:
                if (zzgz.zzc(obj, j2) != 0) {
                }
                break;
            case 14:
                if (zzgz.zzd(obj, j2) != 0) {
                }
                break;
            case 15:
                if (zzgz.zzc(obj, j2) != 0) {
                }
                break;
            case 16:
                if (zzgz.zzd(obj, j2) != 0) {
                }
                break;
            case 17:
                if (zzgz.zzf(obj, j2) != null) {
                }
                break;
            default:
                Path$$ExternalSyntheticBUOutline0.m$3();
                break;
        }
        return false;
    }

    public final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(i, obj) : (i3 & i4) != 0;
    }

    public final boolean zzM(int i, int i2, Object obj) {
        return zzgz.zzc(obj, (long) (this.zzc[i2 + 2] & 1048575)) == i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zza(zzcq zzcqVar) {
        int i;
        int zzA;
        int zzB;
        int i2;
        int zzB2;
        int zzd;
        int zzA2;
        int size;
        int zzl;
        int zzA3;
        int zzA4;
        int zzA5;
        int i3;
        int zzA6;
        int zzB3;
        zzfp zzfpVar = this;
        zzcq zzcqVar2 = zzcqVar;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = zzfpVar.zzc;
            if (i6 < iArr.length) {
                int zzs = zzfpVar.zzs(i6);
                int zzr = zzr(zzs);
                int i9 = iArr[i6];
                int i10 = iArr[i6 + 2];
                int i11 = i10 & i4;
                if (zzr <= 17) {
                    if (i11 != i5) {
                        i7 = i11 == i4 ? 0 : unsafe.getInt(zzcqVar2, i11);
                        i5 = i11;
                    }
                    i = 1 << (i10 >>> 20);
                } else {
                    i = 0;
                }
                int i12 = zzs & i4;
                if (zzr >= zzdy.zzJ.zzab) {
                    zzdy.zzW.getClass();
                }
                long j = i12;
                switch (zzr) {
                    case 0:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 8, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 1:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 4, i8);
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 2:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            long j2 = unsafe.getLong(zzcqVar2, j);
                            zzA = zzdk.zzA(i9 << 3);
                            zzB = zzdk.zzB(j2);
                            i8 += zzB + zzA;
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 3:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            long j3 = unsafe.getLong(zzcqVar2, j);
                            zzA = zzdk.zzA(i9 << 3);
                            zzB = zzdk.zzB(j3);
                            i8 += zzB + zzA;
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 4:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            long j4 = unsafe.getInt(zzcqVar2, j);
                            zzA = zzdk.zzA(i9 << 3);
                            zzB = zzdk.zzB(j4);
                            i8 += zzB + zzA;
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 5:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 8, i8);
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 6:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 4, i8);
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 7:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 1, i8);
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 8:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            int i13 = i9 << 3;
                            Object object = unsafe.getObject(zzcqVar2, j);
                            if (object instanceof zzdf) {
                                int zzA7 = zzdk.zzA(i13);
                                int zzd2 = ((zzdf) object).zzd();
                                i8 = zzel$EnumUnboxingLocalUtility.m(zzd2, zzd2, zzA7, i8);
                            } else {
                                zzA = zzdk.zzA(i13);
                                zzB = zzdk.zzz((String) object);
                                i8 += zzB + zzA;
                            }
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 9:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            Object object2 = unsafe.getObject(zzcqVar2, j);
                            zzge zzv = zzfpVar.zzv(i6);
                            zzea zzeaVar = zzgg.zzb;
                            int zzA8 = zzdk.zzA(i9 << 3);
                            int zzB4 = ((zzcq) object2).zzB(zzv);
                            i8 = zzel$EnumUnboxingLocalUtility.m(zzB4, zzB4, zzA8, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 10:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            zzdf zzdfVar = (zzdf) unsafe.getObject(zzcqVar2, j);
                            int zzA9 = zzdk.zzA(i9 << 3);
                            int zzd3 = zzdfVar.zzd();
                            i8 = zzel$EnumUnboxingLocalUtility.m(zzd3, zzd3, zzA9, i8);
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 11:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(unsafe.getInt(zzcqVar2, j), zzdk.zzA(i9 << 3), i8);
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 12:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            long j5 = unsafe.getInt(zzcqVar2, j);
                            zzA = zzdk.zzA(i9 << 3);
                            zzB = zzdk.zzB(j5);
                            i8 += zzB + zzA;
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 13:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 4, i8);
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 14:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 8, i8);
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 15:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            int i14 = unsafe.getInt(zzcqVar2, j);
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2((i14 >> 31) ^ (i14 + i14), zzdk.zzA(i9 << 3), i8);
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 16:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            long j6 = unsafe.getLong(zzcqVar2, j);
                            zzA = zzdk.zzA(i9 << 3);
                            zzB = zzdk.zzB((j6 >> 63) ^ (j6 + j6));
                            i8 += zzB + zzA;
                        }
                        zzfpVar = this;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 17:
                        if (zzfpVar.zzJ(zzcqVar2, i6, i5, i7, i)) {
                            zzcq zzcqVar3 = (zzcq) unsafe.getObject(zzcqVar2, j);
                            zzge zzv2 = zzfpVar.zzv(i6);
                            int zzA10 = zzdk.zzA(i9 << 3);
                            i2 = zzA10 + zzA10;
                            zzB2 = zzcqVar3.zzB(zzv2);
                            zzd = zzB2 + i2;
                            i8 += zzd;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        } else {
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                    case 18:
                        zzd = zzgg.zzd(i9, (List) unsafe.getObject(zzcqVar2, j));
                        i8 += zzd;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 19:
                        zzd = zzgg.zzb(i9, (List) unsafe.getObject(zzcqVar2, j));
                        i8 += zzd;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 20:
                        List list = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar2 = zzgg.zzb;
                        if (list.size() != 0) {
                            zzA2 = (zzdk.zzA(i9 << 3) * list.size()) + zzgg.zzg(list);
                            i8 += zzA2;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                        zzA2 = 0;
                        i8 += zzA2;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 21:
                        List list2 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar3 = zzgg.zzb;
                        size = list2.size();
                        if (size != 0) {
                            zzl = zzgg.zzl(list2);
                            zzA3 = zzdk.zzA(i9 << 3);
                            zzA4 = (zzA3 * size) + zzl;
                            i8 += zzA4;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                        zzA4 = 0;
                        i8 += zzA4;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 22:
                        List list3 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar4 = zzgg.zzb;
                        size = list3.size();
                        if (size != 0) {
                            zzl = zzgg.zzf(list3);
                            zzA3 = zzdk.zzA(i9 << 3);
                            zzA4 = (zzA3 * size) + zzl;
                            i8 += zzA4;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                        zzA4 = 0;
                        i8 += zzA4;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 23:
                        zzd = zzgg.zzd(i9, (List) unsafe.getObject(zzcqVar2, j));
                        i8 += zzd;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 24:
                        zzd = zzgg.zzb(i9, (List) unsafe.getObject(zzcqVar2, j));
                        i8 += zzd;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 25:
                        List list4 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar5 = zzgg.zzb;
                        int size2 = list4.size();
                        if (size2 != 0) {
                            zzA2 = (zzdk.zzA(i9 << 3) + 1) * size2;
                            i8 += zzA2;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                        zzA2 = 0;
                        i8 += zzA2;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 26:
                        List list5 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar6 = zzgg.zzb;
                        int size3 = list5.size();
                        if (size3 != 0) {
                            zzA4 = zzdk.zzA(i9 << 3) * size3;
                            if (list5 instanceof zzey) {
                                zzey zzeyVar = (zzey) list5;
                                for (int i15 = 0; i15 < size3; i15++) {
                                    Object zza2 = zzeyVar.zza();
                                    if (zza2 instanceof zzdf) {
                                        int zzd4 = ((zzdf) zza2).zzd();
                                        zzA4 = FillrEnv$EnumUnboxingLocalUtility.m$2(zzd4, zzd4, zzA4);
                                    } else {
                                        zzA4 = zzdk.zzz((String) zza2) + zzA4;
                                    }
                                }
                            } else {
                                for (int i16 = 0; i16 < size3; i16++) {
                                    Object obj = list5.get(i16);
                                    if (obj instanceof zzdf) {
                                        int zzd5 = ((zzdf) obj).zzd();
                                        zzA4 = FillrEnv$EnumUnboxingLocalUtility.m$2(zzd5, zzd5, zzA4);
                                    } else {
                                        zzA4 = zzdk.zzz((String) obj) + zzA4;
                                    }
                                }
                            }
                            i8 += zzA4;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                        zzA4 = 0;
                        i8 += zzA4;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 27:
                        List list6 = (List) unsafe.getObject(zzcqVar2, j);
                        zzge zzv3 = zzfpVar.zzv(i6);
                        zzea zzeaVar7 = zzgg.zzb;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            zzA5 = 0;
                        } else {
                            zzA5 = zzdk.zzA(i9 << 3) * size4;
                            for (int i17 = 0; i17 < size4; i17++) {
                                int zzB5 = ((zzcq) list6.get(i17)).zzB(zzv3);
                                zzA5 = FillrEnv$EnumUnboxingLocalUtility.m$2(zzB5, zzB5, zzA5);
                            }
                        }
                        i8 += zzA5;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 28:
                        List list7 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar8 = zzgg.zzb;
                        int size5 = list7.size();
                        if (size5 != 0) {
                            zzA4 = zzdk.zzA(i9 << 3) * size5;
                            for (int i18 = 0; i18 < list7.size(); i18++) {
                                int zzd6 = ((zzdf) list7.get(i18)).zzd();
                                zzA4 = FillrEnv$EnumUnboxingLocalUtility.m$2(zzd6, zzd6, zzA4);
                            }
                            i8 += zzA4;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                        zzA4 = 0;
                        i8 += zzA4;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 29:
                        List list8 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar9 = zzgg.zzb;
                        size = list8.size();
                        if (size != 0) {
                            zzl = zzgg.zzk(list8);
                            zzA3 = zzdk.zzA(i9 << 3);
                            zzA4 = (zzA3 * size) + zzl;
                            i8 += zzA4;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                        zzA4 = 0;
                        i8 += zzA4;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 30:
                        List list9 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar10 = zzgg.zzb;
                        size = list9.size();
                        if (size != 0) {
                            zzl = zzgg.zza(list9);
                            zzA3 = zzdk.zzA(i9 << 3);
                            zzA4 = (zzA3 * size) + zzl;
                            i8 += zzA4;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                        zzA4 = 0;
                        i8 += zzA4;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 31:
                        zzd = zzgg.zzb(i9, (List) unsafe.getObject(zzcqVar2, j));
                        i8 += zzd;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 32:
                        zzd = zzgg.zzd(i9, (List) unsafe.getObject(zzcqVar2, j));
                        i8 += zzd;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 33:
                        List list10 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar11 = zzgg.zzb;
                        size = list10.size();
                        if (size != 0) {
                            zzl = zzgg.zzi(list10);
                            zzA3 = zzdk.zzA(i9 << 3);
                            zzA4 = (zzA3 * size) + zzl;
                            i8 += zzA4;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                        zzA4 = 0;
                        i8 += zzA4;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 34:
                        List list11 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar12 = zzgg.zzb;
                        size = list11.size();
                        if (size != 0) {
                            zzl = zzgg.zzj(list11);
                            zzA3 = zzdk.zzA(i9 << 3);
                            zzA4 = (zzA3 * size) + zzl;
                            i8 += zzA4;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                        zzA4 = 0;
                        i8 += zzA4;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 35:
                        List list12 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar13 = zzgg.zzb;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(size6, zzdk.zzA(i9 << 3), size6, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 36:
                        List list13 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar14 = zzgg.zzb;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(size7, zzdk.zzA(i9 << 3), size7, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 37:
                        int zzg = zzgg.zzg((List) unsafe.getObject(zzcqVar2, j));
                        if (zzg > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(zzg, zzdk.zzA(i9 << 3), zzg, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 38:
                        int zzl2 = zzgg.zzl((List) unsafe.getObject(zzcqVar2, j));
                        if (zzl2 > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(zzl2, zzdk.zzA(i9 << 3), zzl2, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 39:
                        int zzf = zzgg.zzf((List) unsafe.getObject(zzcqVar2, j));
                        if (zzf > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(zzf, zzdk.zzA(i9 << 3), zzf, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 40:
                        List list14 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar15 = zzgg.zzb;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(size8, zzdk.zzA(i9 << 3), size8, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 41:
                        List list15 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar16 = zzgg.zzb;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(size9, zzdk.zzA(i9 << 3), size9, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 42:
                        List list16 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar17 = zzgg.zzb;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(size10, zzdk.zzA(i9 << 3), size10, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 43:
                        int zzk = zzgg.zzk((List) unsafe.getObject(zzcqVar2, j));
                        if (zzk > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(zzk, zzdk.zzA(i9 << 3), zzk, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 44:
                        int zza3 = zzgg.zza((List) unsafe.getObject(zzcqVar2, j));
                        if (zza3 > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(zza3, zzdk.zzA(i9 << 3), zza3, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 45:
                        List list17 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar18 = zzgg.zzb;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(size11, zzdk.zzA(i9 << 3), size11, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 46:
                        List list18 = (List) unsafe.getObject(zzcqVar2, j);
                        zzea zzeaVar19 = zzgg.zzb;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(size12, zzdk.zzA(i9 << 3), size12, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 47:
                        int zzi = zzgg.zzi((List) unsafe.getObject(zzcqVar2, j));
                        if (zzi > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(zzi, zzdk.zzA(i9 << 3), zzi, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 48:
                        int zzj = zzgg.zzj((List) unsafe.getObject(zzcqVar2, j));
                        if (zzj > 0) {
                            i8 = zzel$EnumUnboxingLocalUtility.m(zzj, zzdk.zzA(i9 << 3), zzj, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 49:
                        List list19 = (List) unsafe.getObject(zzcqVar2, j);
                        zzge zzv4 = zzfpVar.zzv(i6);
                        zzea zzeaVar20 = zzgg.zzb;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            for (int i19 = 0; i19 < size13; i19++) {
                                zzcq zzcqVar4 = (zzcq) list19.get(i19);
                                int zzA11 = zzdk.zzA(i9 << 3);
                                i3 += zzcqVar4.zzB(zzv4) + zzA11 + zzA11;
                            }
                        }
                        i8 += i3;
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 50:
                        Object object3 = unsafe.getObject(zzcqVar2, j);
                        int i20 = i6 / 3;
                        zzfg zzfgVar = (zzfg) object3;
                        if (zzfpVar.zzd[i20 + i20] != null) {
                            a$$ExternalSyntheticBUOutline0.m$1();
                            return 0;
                        }
                        if (zzfgVar.isEmpty()) {
                            continue;
                        } else {
                            Iterator it = zzfgVar.entrySet().iterator();
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getKey();
                                entry.getValue();
                                throw null;
                            }
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 51:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 8, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 52:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 4, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 53:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            long zzt = zzt(zzcqVar2, j);
                            zzA6 = zzdk.zzA(i9 << 3);
                            zzB3 = zzdk.zzB(zzt);
                            i8 += zzB3 + zzA6;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        } else {
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                    case 54:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            long zzt2 = zzt(zzcqVar2, j);
                            zzA6 = zzdk.zzA(i9 << 3);
                            zzB3 = zzdk.zzB(zzt2);
                            i8 += zzB3 + zzA6;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        } else {
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                    case 55:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            long zzo = zzo(zzcqVar2, j);
                            zzA6 = zzdk.zzA(i9 << 3);
                            zzB3 = zzdk.zzB(zzo);
                            i8 += zzB3 + zzA6;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        } else {
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                    case 56:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 8, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 57:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 4, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 58:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 1, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 59:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            int i21 = i9 << 3;
                            Object object4 = unsafe.getObject(zzcqVar2, j);
                            if (object4 instanceof zzdf) {
                                int zzA12 = zzdk.zzA(i21);
                                int zzd7 = ((zzdf) object4).zzd();
                                i8 = zzel$EnumUnboxingLocalUtility.m(zzd7, zzd7, zzA12, i8);
                            } else {
                                zzA6 = zzdk.zzA(i21);
                                zzB3 = zzdk.zzz((String) object4);
                                i8 += zzB3 + zzA6;
                            }
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 60:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            Object object5 = unsafe.getObject(zzcqVar2, j);
                            zzge zzv5 = zzfpVar.zzv(i6);
                            zzea zzeaVar21 = zzgg.zzb;
                            int zzA13 = zzdk.zzA(i9 << 3);
                            int zzB6 = ((zzcq) object5).zzB(zzv5);
                            i8 = zzel$EnumUnboxingLocalUtility.m(zzB6, zzB6, zzA13, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 61:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            zzdf zzdfVar2 = (zzdf) unsafe.getObject(zzcqVar2, j);
                            int zzA14 = zzdk.zzA(i9 << 3);
                            int zzd8 = zzdfVar2.zzd();
                            i8 = zzel$EnumUnboxingLocalUtility.m(zzd8, zzd8, zzA14, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 62:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(zzo(zzcqVar2, j), zzdk.zzA(i9 << 3), i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 63:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            long zzo2 = zzo(zzcqVar2, j);
                            zzA6 = zzdk.zzA(i9 << 3);
                            zzB3 = zzdk.zzB(zzo2);
                            i8 += zzB3 + zzA6;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        } else {
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                    case 64:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 4, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 65:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2(i9 << 3, 8, i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 66:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            int zzo3 = zzo(zzcqVar2, j);
                            i8 = FillrEnv$EnumUnboxingLocalUtility.m$2((zzo3 >> 31) ^ (zzo3 + zzo3), zzdk.zzA(i9 << 3), i8);
                        }
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                    case 67:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            long zzt3 = zzt(zzcqVar2, j);
                            zzA6 = zzdk.zzA(i9 << 3);
                            zzB3 = zzdk.zzB((zzt3 >> 63) ^ (zzt3 + zzt3));
                            i8 += zzB3 + zzA6;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        } else {
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                    case 68:
                        if (zzfpVar.zzM(i9, i6, zzcqVar2)) {
                            zzcq zzcqVar5 = (zzcq) unsafe.getObject(zzcqVar2, j);
                            zzge zzv6 = zzfpVar.zzv(i6);
                            int zzA15 = zzdk.zzA(i9 << 3);
                            i2 = zzA15 + zzA15;
                            zzB2 = zzcqVar5.zzB(zzv6);
                            zzd = zzB2 + i2;
                            i8 += zzd;
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        } else {
                            i6 += 3;
                            zzcqVar2 = zzcqVar;
                            i4 = 1048575;
                        }
                    default:
                        i6 += 3;
                        zzcqVar2 = zzcqVar;
                        i4 = 1048575;
                }
            } else {
                int i22 = 0;
                int zza4 = ((zzeh) zzcqVar).zzc.zza() + i8;
                if (!zzfpVar.zzh) {
                    return zza4;
                }
                zzdx zzdxVar = ((zzed) zzcqVar).zzb;
                int i23 = zzdxVar.zza.zzb;
                int i24 = 0;
                while (true) {
                    zzgh zzghVar = zzdxVar.zza;
                    if (i24 >= i23) {
                        for (Map.Entry entry2 : zzghVar.zzd()) {
                            i22 = zzdx.zza((zzee) entry2.getKey(), entry2.getValue()) + i22;
                        }
                        return zza4 + i22;
                    }
                    zzgi zzg2 = zzghVar.zzg(i24);
                    i22 = zzdx.zza((zzee) zzg2.zzb, zzg2.zzc) + i22;
                    i24++;
                }
            }
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
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzeh zzehVar) {
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
                int hashCode = zzehVar.zzc.hashCode() + (i6 * 53);
                if (!this.zzh) {
                    return hashCode;
                }
                return ((zzed) zzehVar).zzb.zza.hashCode() + (hashCode * 53);
            }
            int zzs = zzs(i5);
            int i7 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (zzr) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzgz.zzf.zza(zzehVar, j));
                    Charset charset = zzep.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(zzgz.zzf.zzb(zzehVar, j));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = zzgz.zzd(zzehVar, j);
                    Charset charset2 = zzep.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = zzgz.zzd(zzehVar, j);
                    Charset charset3 = zzep.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = zzgz.zzc(zzehVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = zzgz.zzd(zzehVar, j);
                    Charset charset4 = zzep.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = zzgz.zzc(zzehVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zzg = zzgz.zzf.zzg(zzehVar, j);
                    Charset charset5 = zzep.zza;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) zzgz.zzf(zzehVar, j)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object zzf = zzgz.zzf(zzehVar, j);
                    if (zzf != null) {
                        i10 = zzf.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = zzgz.zzf(zzehVar, j).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = zzgz.zzc(zzehVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = zzgz.zzc(zzehVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = zzgz.zzc(zzehVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = zzgz.zzd(zzehVar, j);
                    Charset charset6 = zzep.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = zzgz.zzc(zzehVar, j);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = zzgz.zzd(zzehVar, j);
                    Charset charset7 = zzep.zza;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object zzf2 = zzgz.zzf(zzehVar, j);
                    if (zzf2 != null) {
                        i10 = zzf2.hashCode();
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
                    floatToIntBits = zzgz.zzf(zzehVar, j).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = zzgz.zzf(zzehVar, j).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 51:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) zzgz.zzf(zzehVar, j)).doubleValue());
                        Charset charset8 = zzep.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) zzgz.zzf(zzehVar, j)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = zzt(zzehVar, j);
                        Charset charset9 = zzep.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = zzt(zzehVar, j);
                        Charset charset10 = zzep.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzo(zzehVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = zzt(zzehVar, j);
                        Charset charset11 = zzep.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzo(zzehVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 58:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) zzgz.zzf(zzehVar, j)).booleanValue();
                        Charset charset12 = zzep.zza;
                        break;
                    }
                case 59:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) zzgz.zzf(zzehVar, j)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzgz.zzf(zzehVar, j).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzgz.zzf(zzehVar, j).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzo(zzehVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 63:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzo(zzehVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzo(zzehVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = zzt(zzehVar, j);
                        Charset charset13 = zzep.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzo(zzehVar, j);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 67:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = zzt(zzehVar, j);
                        Charset charset14 = zzep.zza;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!zzM(i8, i5, zzehVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = zzgz.zzf(zzehVar, j).hashCode();
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
    public final int zzc(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, com.datadog.trace.core.LongRunningTracesTracker r44) {
        /*
            Method dump skipped, instructions count: 3782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzc(java.lang.Object, byte[], int, int, int, com.datadog.trace.core.LongRunningTracesTracker):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        return (zzeh) ((zzeh) this.zzg).zzg(4, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        if (!zzL(obj)) {
            return;
        }
        if (obj instanceof zzeh) {
            zzeh zzehVar = (zzeh) obj;
            zzehVar.zzW();
            zzehVar.zza = 0;
            zzehVar.zzU();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                this.zzl.getClass();
                zzgt zzgtVar = ((zzeh) obj).zzc;
                if (zzgtVar.zzf) {
                    zzgtVar.zzf = false;
                }
                if (this.zzh) {
                    this.zzm.getClass();
                    ((zzed) obj).zzb.zzg();
                    return;
                }
                return;
            }
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int zzr = zzr(zzs);
            long j = i2;
            if (zzr != 9) {
                if (zzr != 60 && zzr != 68) {
                    switch (zzr) {
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
                            zzcs zzcsVar = (zzcs) ((zzeo) zzgz.zzf(obj, j));
                            if (!zzcsVar.zza) {
                                break;
                            } else {
                                zzcsVar.zza = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object == null) {
                                break;
                            } else {
                                ((zzfg) object).zzb = false;
                                unsafe.putObject(obj, j, object);
                                break;
                            }
                    }
                } else if (zzM(iArr[i], i, obj)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
                i += 3;
            }
            if (zzI(i, obj)) {
                zzv(i).zzf(zzb.getObject(obj, j));
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        Object obj3;
        if (!zzL(obj)) {
            a$$ExternalSyntheticBUOutline0.m$3("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                Object obj4 = obj;
                zzgg.zzp(obj4, obj2);
                if (this.zzh) {
                    zzgg.zzo(obj4, obj2);
                    return;
                }
                return;
            }
            int zzs = zzs(i);
            int i2 = zzs & 1048575;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (zzI(i, obj2)) {
                        zzgy zzgyVar = zzgz.zzf;
                        obj3 = obj;
                        zzgyVar.zze(obj3, j, zzgyVar.zza(obj2, j));
                        zzD(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (zzI(i, obj2)) {
                        zzgy zzgyVar2 = zzgz.zzf;
                        zzgyVar2.zzf(obj, j, zzgyVar2.zzb(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (zzI(i, obj2)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (zzI(i, obj2)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (zzI(i, obj2)) {
                        zzgz.zzq(j, obj, zzgz.zzc(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (zzI(i, obj2)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (zzI(i, obj2)) {
                        zzgz.zzq(j, obj, zzgz.zzc(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (zzI(i, obj2)) {
                        zzgy zzgyVar3 = zzgz.zzf;
                        zzgyVar3.zzc(obj, j, zzgyVar3.zzg(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (zzI(i, obj2)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    zzB(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (zzI(i, obj2)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (zzI(i, obj2)) {
                        zzgz.zzq(j, obj, zzgz.zzc(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (zzI(i, obj2)) {
                        zzgz.zzq(j, obj, zzgz.zzc(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (zzI(i, obj2)) {
                        zzgz.zzq(j, obj, zzgz.zzc(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (zzI(i, obj2)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (zzI(i, obj2)) {
                        zzgz.zzq(j, obj, zzgz.zzc(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (zzI(i, obj2)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    zzB(i, obj, obj2);
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
                    zzeo zzeoVar = (zzeo) zzgz.zzf(obj, j);
                    zzeo zzeoVar2 = (zzeo) zzgz.zzf(obj2, j);
                    int size = zzeoVar.size();
                    int size2 = zzeoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((zzcs) zzeoVar).zza) {
                            zzeoVar = zzeoVar.zzd(size2 + size);
                        }
                        zzeoVar.addAll(zzeoVar2);
                    }
                    if (size > 0) {
                        zzeoVar2 = zzeoVar;
                    }
                    zzgz.zzs(obj, j, zzeoVar2);
                    obj3 = obj;
                    break;
                case 50:
                    zzea zzeaVar = zzgg.zzb;
                    zzgz.zzs(obj, j, zzea.zza(zzgz.zzf(obj, j), zzgz.zzf(obj2, j)));
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
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzgz.zzq(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    zzC(i, obj, obj2);
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
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzgz.zzq(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    zzC(i, obj, obj2);
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzh(Object obj, byte[] bArr, int i, int i2, LongRunningTracesTracker longRunningTracesTracker) {
        zzc(obj, bArr, i, i2, 0, longRunningTracesTracker);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0635 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzfe zzfeVar) {
        Map.Entry entry;
        Iterator it;
        int i;
        int i2;
        int i3;
        int length;
        boolean z;
        int i4;
        int i5;
        Map.Entry entry2;
        int i6;
        boolean z2;
        zzfp zzfpVar = this;
        if (zzfpVar.zzh) {
            zzdx zzdxVar = ((zzed) obj).zzb;
            if (!zzdxVar.zza.isEmpty()) {
                Iterator zzf = zzdxVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                Unsafe unsafe = zzb;
                i = 0;
                i2 = 1048575;
                i3 = 0;
                while (true) {
                    int[] iArr = zzfpVar.zzc;
                    length = iArr.length;
                    zzea zzeaVar = zzfpVar.zzm;
                    if (i < length) {
                        while (entry != null) {
                            zzeaVar.getClass();
                            zzea.zzb(zzfeVar, entry);
                            entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        }
                        ((zzeh) obj).zzc.zzl(zzfeVar);
                        return;
                    }
                    int zzs = zzfpVar.zzs(i);
                    int zzr = zzr(zzs);
                    int i7 = iArr[i];
                    if (zzr <= 17) {
                        int i8 = iArr[i + 2];
                        z = true;
                        int i9 = i8 & 1048575;
                        Map.Entry entry3 = entry;
                        if (i9 != i2) {
                            i3 = i9 == 1048575 ? 0 : unsafe.getInt(obj, i9);
                            i2 = i9;
                        }
                        int i10 = i3;
                        i6 = 1 << (i8 >>> 20);
                        i4 = i2;
                        i5 = i10;
                        entry2 = entry3;
                    } else {
                        Map.Entry entry4 = entry;
                        z = true;
                        i4 = i2;
                        i5 = i3;
                        entry2 = entry4;
                        i6 = 0;
                    }
                    while (entry2 != null) {
                        ((zzee) entry2.getKey()).getClass();
                        if (i7 >= 0) {
                            zzeaVar.getClass();
                            zzea.zzb(zzfeVar, entry2);
                            entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                        } else {
                            long j = zzs & 1048575;
                            switch (zzr) {
                                case 0:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzh(i7, Double.doubleToRawLongBits(zzgz.zzf.zza(obj, j)));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 1:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzf(i7, Float.floatToRawIntBits(zzgz.zzf.zzb(obj, j)));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 2:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzu(i7, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 3:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzu(i7, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 4:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzj(i7, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 5:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzh(i7, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 6:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzf(i7, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 7:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        boolean zzg = zzgz.zzf.zzg(obj, j);
                                        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
                                        zzdkVar.zzt(i7 << 3);
                                        zzdkVar.zzb(zzg ? (byte) 1 : (byte) 0);
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 8:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        Object object = unsafe.getObject(obj, j);
                                        if (object instanceof String) {
                                            ((zzdk) zzfeVar.zzb).zzp(i7, (String) object);
                                        } else {
                                            ((zzdk) zzfeVar.zzb).zze(i7, (zzdf) object);
                                        }
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 9:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        zzfeVar.zzv(i7, unsafe.getObject(obj, j), zzfpVar.zzv(i));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 10:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zze(i7, (zzdf) unsafe.getObject(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 11:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzs(i7, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 12:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzj(i7, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 13:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzf(i7, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 14:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        ((zzdk) zzfeVar.zzb).zzh(i7, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 15:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        int i11 = unsafe.getInt(obj, j);
                                        ((zzdk) zzfeVar.zzb).zzs(i7, (i11 >> 31) ^ (i11 + i11));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 16:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        long j2 = unsafe.getLong(obj, j);
                                        ((zzdk) zzfeVar.zzb).zzu(i7, (j2 + j2) ^ (j2 >> 63));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 17:
                                    if (zzfpVar.zzJ(obj, i, i4, i5, i6)) {
                                        zzfeVar.zzq(i7, unsafe.getObject(obj, j), zzfpVar.zzv(i));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 18:
                                    zzgg.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 19:
                                    zzgg.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 20:
                                    zzgg.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 21:
                                    zzgg.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 22:
                                    zzgg.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 23:
                                    zzgg.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 24:
                                    zzgg.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 25:
                                    zzgg.zzq(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 26:
                                    int i12 = iArr[i];
                                    List list = (List) unsafe.getObject(obj, j);
                                    zzea zzeaVar2 = zzgg.zzb;
                                    if (list != null && !list.isEmpty()) {
                                        zzdk zzdkVar2 = (zzdk) zzfeVar.zzb;
                                        if (list instanceof zzey) {
                                            zzey zzeyVar = (zzey) list;
                                            for (int i13 = 0; i13 < list.size(); i13++) {
                                                Object zza2 = zzeyVar.zza();
                                                if (zza2 instanceof String) {
                                                    zzdkVar2.zzp(i12, (String) zza2);
                                                } else {
                                                    zzdkVar2.zze(i12, (zzdf) zza2);
                                                }
                                            }
                                        } else {
                                            for (int i14 = 0; i14 < list.size(); i14++) {
                                                zzdkVar2.zzp(i12, (String) list.get(i14));
                                            }
                                        }
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                    break;
                                case 27:
                                    int i15 = iArr[i];
                                    List list2 = (List) unsafe.getObject(obj, j);
                                    zzge zzv = zzfpVar.zzv(i);
                                    zzea zzeaVar3 = zzgg.zzb;
                                    if (list2 != null && !list2.isEmpty()) {
                                        for (int i16 = 0; i16 < list2.size(); i16++) {
                                            zzfeVar.zzv(i15, list2.get(i16), zzv);
                                        }
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                    break;
                                case 28:
                                    int i17 = iArr[i];
                                    List list3 = (List) unsafe.getObject(obj, j);
                                    zzea zzeaVar4 = zzgg.zzb;
                                    if (list3 != null && !list3.isEmpty()) {
                                        zzfeVar.getClass();
                                        for (int i18 = 0; i18 < list3.size(); i18++) {
                                            ((zzdk) zzfeVar.zzb).zze(i17, (zzdf) list3.get(i18));
                                        }
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                    break;
                                case 29:
                                    z2 = false;
                                    zzgg.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 30:
                                    z2 = false;
                                    zzgg.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 31:
                                    z2 = false;
                                    zzgg.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 32:
                                    z2 = false;
                                    zzgg.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 33:
                                    z2 = false;
                                    zzgg.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 34:
                                    z2 = false;
                                    zzgg.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, false);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 35:
                                    zzgg.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 36:
                                    zzgg.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 37:
                                    zzgg.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 38:
                                    zzgg.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 39:
                                    zzgg.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 40:
                                    zzgg.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 41:
                                    zzgg.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 42:
                                    zzgg.zzq(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 43:
                                    zzgg.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 44:
                                    zzgg.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 45:
                                    zzgg.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 46:
                                    zzgg.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 47:
                                    zzgg.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 48:
                                    zzgg.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzfeVar, z);
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 49:
                                    int i19 = iArr[i];
                                    List list4 = (List) unsafe.getObject(obj, j);
                                    zzge zzv2 = zzfpVar.zzv(i);
                                    zzea zzeaVar5 = zzgg.zzb;
                                    if (list4 != null && !list4.isEmpty()) {
                                        for (int i20 = 0; i20 < list4.size(); i20++) {
                                            zzfeVar.zzq(i19, list4.get(i20), zzv2);
                                        }
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                    break;
                                case 50:
                                    if (unsafe.getObject(obj, j) != null) {
                                        int i21 = i / 3;
                                        throw Boxes$$ExternalSyntheticOutline1.m(zzfpVar.zzd[i21 + i21]);
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 51:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzh(i7, Double.doubleToRawLongBits(((Double) zzgz.zzf(obj, j)).doubleValue()));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 52:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzf(i7, Float.floatToRawIntBits(((Float) zzgz.zzf(obj, j)).floatValue()));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 53:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzu(i7, zzt(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 54:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzu(i7, zzt(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 55:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzj(i7, zzo(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 56:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzh(i7, zzt(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 57:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzf(i7, zzo(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 58:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        boolean booleanValue = ((Boolean) zzgz.zzf(obj, j)).booleanValue();
                                        zzdk zzdkVar3 = (zzdk) zzfeVar.zzb;
                                        zzdkVar3.zzt(i7 << 3);
                                        zzdkVar3.zzb(booleanValue ? (byte) 1 : (byte) 0);
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 59:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        Object object2 = unsafe.getObject(obj, j);
                                        if (object2 instanceof String) {
                                            ((zzdk) zzfeVar.zzb).zzp(i7, (String) object2);
                                        } else {
                                            ((zzdk) zzfeVar.zzb).zze(i7, (zzdf) object2);
                                        }
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 60:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        zzfeVar.zzv(i7, unsafe.getObject(obj, j), zzfpVar.zzv(i));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 61:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zze(i7, (zzdf) unsafe.getObject(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 62:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzs(i7, zzo(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 63:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzj(i7, zzo(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 64:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzf(i7, zzo(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 65:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        ((zzdk) zzfeVar.zzb).zzh(i7, zzt(obj, j));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 66:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        int zzo = zzo(obj, j);
                                        ((zzdk) zzfeVar.zzb).zzs(i7, (zzo >> 31) ^ (zzo + zzo));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 67:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        long zzt = zzt(obj, j);
                                        ((zzdk) zzfeVar.zzb).zzu(i7, (zzt >> 63) ^ (zzt + zzt));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                case 68:
                                    if (zzfpVar.zzM(i7, i, obj)) {
                                        zzfeVar.zzq(i7, unsafe.getObject(obj, j), zzfpVar.zzv(i));
                                    }
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                                default:
                                    i += 3;
                                    zzfpVar = this;
                                    i3 = i5;
                                    i2 = i4;
                                    entry = entry2;
                            }
                        }
                    }
                    long j3 = zzs & 1048575;
                    switch (zzr) {
                    }
                }
            }
        }
        entry = null;
        it = null;
        Unsafe unsafe2 = zzb;
        i = 0;
        i2 = 1048575;
        i3 = 0;
        while (true) {
            int[] iArr2 = zzfpVar.zzc;
            length = iArr2.length;
            zzea zzeaVar6 = zzfpVar.zzm;
            if (i < length) {
            }
            i += 3;
            zzfpVar = this;
            i3 = i5;
            i2 = i4;
            entry = entry2;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(zzeh zzehVar, zzeh zzehVar2) {
        boolean zzE;
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i < iArr.length) {
                int zzs = zzs(i);
                long j = zzs & 1048575;
                switch (zzr(zzs)) {
                    case 0:
                        if (!zzH(zzehVar, zzehVar2, i)) {
                            break;
                        } else {
                            zzgy zzgyVar = zzgz.zzf;
                            if (Double.doubleToLongBits(zzgyVar.zza(zzehVar, j)) != Double.doubleToLongBits(zzgyVar.zza(zzehVar2, j))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!zzH(zzehVar, zzehVar2, i)) {
                            break;
                        } else {
                            zzgy zzgyVar2 = zzgz.zzf;
                            if (Float.floatToIntBits(zzgyVar2.zzb(zzehVar, j)) != Float.floatToIntBits(zzgyVar2.zzb(zzehVar2, j))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzd(zzehVar, j) == zzgz.zzd(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzd(zzehVar, j) == zzgz.zzd(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzc(zzehVar, j) == zzgz.zzc(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzd(zzehVar, j) == zzgz.zzd(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzc(zzehVar, j) == zzgz.zzc(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!zzH(zzehVar, zzehVar2, i)) {
                            break;
                        } else {
                            zzgy zzgyVar3 = zzgz.zzf;
                            if (zzgyVar3.zzg(zzehVar, j) != zzgyVar3.zzg(zzehVar2, j)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (zzH(zzehVar, zzehVar2, i) && zzgg.zzE(zzgz.zzf(zzehVar, j), zzgz.zzf(zzehVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (zzH(zzehVar, zzehVar2, i) && zzgg.zzE(zzgz.zzf(zzehVar, j), zzgz.zzf(zzehVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (zzH(zzehVar, zzehVar2, i) && zzgg.zzE(zzgz.zzf(zzehVar, j), zzgz.zzf(zzehVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzc(zzehVar, j) == zzgz.zzc(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzc(zzehVar, j) == zzgz.zzc(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzc(zzehVar, j) == zzgz.zzc(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzd(zzehVar, j) == zzgz.zzd(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzc(zzehVar, j) == zzgz.zzc(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (zzH(zzehVar, zzehVar2, i) && zzgz.zzd(zzehVar, j) == zzgz.zzd(zzehVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (zzH(zzehVar, zzehVar2, i) && zzgg.zzE(zzgz.zzf(zzehVar, j), zzgz.zzf(zzehVar2, j))) {
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
                        zzE = zzgg.zzE(zzgz.zzf(zzehVar, j), zzgz.zzf(zzehVar2, j));
                        break;
                    case 50:
                        zzE = zzgg.zzE(zzgz.zzf(zzehVar, j), zzgz.zzf(zzehVar2, j));
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
                        if (zzgz.zzc(zzehVar, j2) == zzgz.zzc(zzehVar2, j2) && zzgg.zzE(zzgz.zzf(zzehVar, j), zzgz.zzf(zzehVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (zzE) {
                    i += 3;
                }
            } else if (zzehVar.zzc.equals(zzehVar2.zzc)) {
                if (this.zzh) {
                    return ((zzed) zzehVar).zzb.equals(((zzed) zzehVar2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ee, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        loop0: while (true) {
            if (i5 < this.zzj) {
                int i7 = this.zzi[i5];
                int[] iArr = this.zzc;
                int i8 = iArr[i7];
                int zzs = zzs(i7);
                int i9 = iArr[i7 + 2];
                int i10 = i9 & 1048575;
                int i11 = 1 << (i9 >>> 20);
                if (i10 != i6) {
                    if (i10 != 1048575) {
                        i4 = zzb.getInt(obj, i10);
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
                if ((268435456 & zzs) != 0 && !zzJ(obj, i2, i, i3, i11)) {
                    break;
                }
                int zzr = zzr(zzs);
                if (zzr == 9 || zzr == 17) {
                    if (zzJ(obj, i2, i, i3, i11) && !zzv(i2).zzk(zzgz.zzf(obj, zzs & 1048575))) {
                        break;
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (zzr != 27) {
                        if (zzr == 60 || zzr == 68) {
                            if (zzM(i8, i2, obj) && !zzv(i2).zzk(zzgz.zzf(obj, zzs & 1048575))) {
                                break;
                            }
                        } else if (zzr != 49) {
                            if (zzr == 50 && !((zzfg) zzgz.zzf(obj, zzs & 1048575)).isEmpty()) {
                                int i13 = i2 / 3;
                                throw Boxes$$ExternalSyntheticOutline1.m(this.zzd[i13 + i13]);
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) zzgz.zzf(obj, zzs & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zzge zzv = zzv(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (!zzv.zzk(list.get(i14))) {
                                break loop0;
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            } else if (!this.zzh || ((zzed) obj).zzb.zzk()) {
                return true;
            }
        }
    }

    public final int zzq(int i, int i2) {
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

    public final int zzs(int i) {
        return this.zzc[i + 1];
    }

    public final zzel zzu(int i) {
        int i2 = i / 3;
        return (zzel) this.zzd[i2 + i2 + 1];
    }

    public final zzge zzv(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.zzd;
        zzge zzgeVar = (zzge) objArr[i3];
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzge zzb2 = zzfu.zzb.zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    public final Object zzx(int i, Object obj) {
        zzge zzv = zzv(i);
        int zzs = zzs(i) & 1048575;
        if (!zzI(i, obj)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    public final Object zzy(int i, int i2, Object obj) {
        zzge zzv = zzv(i2);
        if (!zzM(i, i2, obj)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }
}
