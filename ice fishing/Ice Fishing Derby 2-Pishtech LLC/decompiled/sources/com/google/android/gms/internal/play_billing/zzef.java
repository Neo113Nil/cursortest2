package com.google.android.gms.internal.play_billing;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i, int i2, zzec zzecVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzceVar != null && zzceVar.zzf(zzecVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzo = zzeiVar;
        this.zzl = zzdqVar;
        this.zzm = zzffVar;
        this.zzn = zzceVar;
        this.zzg = zzecVar;
        this.zzp = zzdxVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
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

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
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

    private final void zzD(Object obj, int i) {
        int zzp = zzp(i);
        long j = 1048575 & zzp;
        if (j == 1048575) {
            return;
        }
        zzfp.zzq(obj, j, (1 << (zzp >>> 20)) | zzfp.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzfp.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int zzp = zzp(i);
        long j = zzp & 1048575;
        if (j != 1048575) {
            return (zzfp.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfp.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfp.zzb(obj, j2)) != 0;
            case 2:
                return zzfp.zzd(obj, j2) != 0;
            case 3:
                return zzfp.zzd(obj, j2) != 0;
            case 4:
                return zzfp.zzc(obj, j2) != 0;
            case 5:
                return zzfp.zzd(obj, j2) != 0;
            case 6:
                return zzfp.zzc(obj, j2) != 0;
            case 7:
                return zzfp.zzw(obj, j2);
            case 8:
                Object zzf = zzfp.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzbq) {
                    return !zzbq.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfp.zzf(obj, j2) != null;
            case 10:
                return !zzbq.zzb.equals(zzfp.zzf(obj, j2));
            case 11:
                return zzfp.zzc(obj, j2) != 0;
            case 12:
                return zzfp.zzc(obj, j2) != 0;
            case 13:
                return zzfp.zzc(obj, j2) != 0;
            case 14:
                return zzfp.zzd(obj, j2) != 0;
            case 15:
                return zzfp.zzc(obj, j2) != 0;
            case 16:
                return zzfp.zzd(obj, j2) != 0;
            case 17:
                return zzfp.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzeo zzeoVar) {
        return zzeoVar.zzk(zzfp.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzfp.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzfp.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzfx zzfxVar) throws IOException {
        if (obj instanceof String) {
            zzfxVar.zzG(i, (String) obj);
        } else {
            zzfxVar.zzd(i, (zzbq) obj);
        }
    }

    static zzfg zzd(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar != zzfg.zzc()) {
            return zzfgVar;
        }
        zzfg zzf = zzfg.zzf();
        zzcsVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzef zzl(Class cls, zzdz zzdzVar, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
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
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int objectFieldOffset;
        int i22;
        int i23;
        int i24;
        String str;
        int i25;
        int i26;
        int i27;
        Field zzz;
        char charAt10;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i32;
        char charAt11;
        int i33;
        char charAt12;
        int i34;
        char charAt13;
        int i35;
        char charAt14;
        if (!(zzdzVar instanceof zzen)) {
            throw null;
        }
        zzen zzenVar = (zzen) zzdzVar;
        String zzd = zzenVar.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i = i36 + 1;
                if (zzd.charAt(i36) < 55296) {
                    break;
                }
                i36 = i;
            }
        } else {
            i = 1;
        }
        int i37 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i38 = charAt15 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                charAt14 = zzd.charAt(i37);
                if (charAt14 < 55296) {
                    break;
                }
                i38 |= (charAt14 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            charAt15 = i38 | (charAt14 << i39);
            i37 = i35;
        }
        if (charAt15 == 0) {
            iArr = zza;
            i7 = 0;
            i4 = 0;
            charAt = 0;
            i3 = 0;
            i5 = 0;
            i2 = 0;
            i6 = 0;
        } else {
            int i40 = i37 + 1;
            int charAt16 = zzd.charAt(i37);
            if (charAt16 >= 55296) {
                int i41 = charAt16 & 8191;
                int i42 = 13;
                while (true) {
                    i15 = i40 + 1;
                    charAt9 = zzd.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i15;
                }
                charAt16 = i41 | (charAt9 << i42);
                i40 = i15;
            }
            int i43 = i40 + 1;
            int charAt17 = zzd.charAt(i40);
            if (charAt17 >= 55296) {
                int i44 = charAt17 & 8191;
                int i45 = 13;
                while (true) {
                    i14 = i43 + 1;
                    charAt8 = zzd.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i14;
                }
                charAt17 = i44 | (charAt8 << i45);
                i43 = i14;
            }
            int i46 = i43 + 1;
            int charAt18 = zzd.charAt(i43);
            if (charAt18 >= 55296) {
                int i47 = charAt18 & 8191;
                int i48 = 13;
                while (true) {
                    i13 = i46 + 1;
                    charAt7 = zzd.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i13;
                }
                charAt18 = i47 | (charAt7 << i48);
                i46 = i13;
            }
            int i49 = i46 + 1;
            int charAt19 = zzd.charAt(i46);
            if (charAt19 >= 55296) {
                int i50 = charAt19 & 8191;
                int i51 = 13;
                while (true) {
                    i12 = i49 + 1;
                    charAt6 = zzd.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i12;
                }
                charAt19 = i50 | (charAt6 << i51);
                i49 = i12;
            }
            int i52 = i49 + 1;
            charAt = zzd.charAt(i49);
            if (charAt >= 55296) {
                int i53 = charAt & 8191;
                int i54 = 13;
                while (true) {
                    i11 = i52 + 1;
                    charAt5 = zzd.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i11;
                }
                charAt = i53 | (charAt5 << i54);
                i52 = i11;
            }
            int i55 = i52 + 1;
            int charAt20 = zzd.charAt(i52);
            if (charAt20 >= 55296) {
                int i56 = charAt20 & 8191;
                int i57 = 13;
                while (true) {
                    i10 = i55 + 1;
                    charAt4 = zzd.charAt(i55);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i56 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i10;
                }
                charAt20 = i56 | (charAt4 << i57);
                i55 = i10;
            }
            int i58 = i55 + 1;
            int charAt21 = zzd.charAt(i55);
            if (charAt21 >= 55296) {
                int i59 = charAt21 & 8191;
                int i60 = 13;
                while (true) {
                    i9 = i58 + 1;
                    charAt3 = zzd.charAt(i58);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i59 |= (charAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i9;
                }
                charAt21 = i59 | (charAt3 << i60);
                i58 = i9;
            }
            int i61 = i58 + 1;
            int charAt22 = zzd.charAt(i58);
            if (charAt22 >= 55296) {
                int i62 = charAt22 & 8191;
                int i63 = 13;
                while (true) {
                    i8 = i61 + 1;
                    charAt2 = zzd.charAt(i61);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i62 |= (charAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i8;
                }
                charAt22 = i62 | (charAt2 << i63);
                i61 = i8;
            }
            i2 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i64 = charAt20;
            i3 = charAt18;
            i4 = i64;
            iArr = iArr2;
            i5 = charAt19;
            i6 = charAt22;
            i7 = charAt16;
            i37 = i61;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzenVar.zze();
        Class<?> cls2 = zzenVar.zza().getClass();
        int i65 = i6 + i4;
        int i66 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i66];
        int i67 = i6;
        int i68 = i65;
        int i69 = 0;
        int i70 = 0;
        while (i37 < length) {
            int i71 = i37 + 1;
            int charAt23 = zzd.charAt(i37);
            if (charAt23 >= c) {
                int i72 = charAt23 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i34 = i73 + 1;
                    charAt13 = zzd.charAt(i73);
                    if (charAt13 < c) {
                        break;
                    }
                    i72 |= (charAt13 & 8191) << i74;
                    i74 += 13;
                    i73 = i34;
                }
                charAt23 = i72 | (charAt13 << i74);
                i16 = i34;
            } else {
                i16 = i71;
            }
            int i75 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c) {
                int i76 = charAt24 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i33 = i77 + 1;
                    charAt12 = zzd.charAt(i77);
                    if (charAt12 < c) {
                        break;
                    }
                    i76 |= (charAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i33;
                }
                charAt24 = i76 | (charAt12 << i78);
                i17 = i33;
            } else {
                i17 = i75;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int i79 = charAt24 & 255;
            int i80 = charAt24 & 2048;
            zzen zzenVar2 = zzenVar;
            if (i79 >= 51) {
                int i81 = i17 + 1;
                int charAt25 = zzd.charAt(i17);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i32 = i83 + 1;
                        charAt11 = zzd.charAt(i83);
                        if (charAt11 < c2) {
                            break;
                        }
                        i82 |= (charAt11 & 8191) << i84;
                        i84 += 13;
                        i83 = i32;
                        c2 = 55296;
                    }
                    charAt25 = i82 | (charAt11 << i84);
                    i30 = i32;
                } else {
                    i30 = i81;
                }
                int i85 = i30;
                int i86 = i79 - 51;
                i18 = length;
                if (i86 == 9 || i86 == 17) {
                    i31 = i2 + 1;
                    int i87 = i70 / 3;
                    objArr[i87 + i87 + 1] = zze[i2];
                } else {
                    if (i86 == 12) {
                        if (zzenVar2.zzc() == 1 || i80 != 0) {
                            i31 = i2 + 1;
                            int i88 = i70 / 3;
                            objArr[i88 + i88 + 1] = zze[i2];
                        } else {
                            i80 = 0;
                        }
                    }
                    int i89 = charAt25 + charAt25;
                    obj = zze[i89];
                    if (obj instanceof Field) {
                        zzz2 = zzz(cls2, (String) obj);
                        zze[i89] = zzz2;
                    } else {
                        zzz2 = (Field) obj;
                    }
                    int i90 = charAt23;
                    int i91 = i80;
                    i27 = (int) unsafe.objectFieldOffset(zzz2);
                    int i92 = i89 + 1;
                    obj2 = zze[i92];
                    if (obj2 instanceof Field) {
                        zzz3 = zzz(cls2, (String) obj2);
                        zze[i92] = zzz3;
                    } else {
                        zzz3 = (Field) obj2;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz3);
                    str = zzd;
                    i37 = i85;
                    i26 = 0;
                    i24 = i2;
                    i23 = objectFieldOffset2;
                    i80 = i91;
                    i19 = i90;
                    i22 = charAt24;
                }
                i2 = i31;
                int i892 = charAt25 + charAt25;
                obj = zze[i892];
                if (obj instanceof Field) {
                }
                int i902 = charAt23;
                int i912 = i80;
                i27 = (int) unsafe.objectFieldOffset(zzz2);
                int i922 = i892 + 1;
                obj2 = zze[i922];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzz3);
                str = zzd;
                i37 = i85;
                i26 = 0;
                i24 = i2;
                i23 = objectFieldOffset22;
                i80 = i912;
                i19 = i902;
                i22 = charAt24;
            } else {
                i18 = length;
                int i93 = charAt23;
                int i94 = i2 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i2]);
                if (i79 == 9 || i79 == 17) {
                    i19 = i93;
                    int i95 = i70 / 3;
                    objArr[i95 + i95 + 1] = zzz4.getType();
                } else {
                    if (i79 == 27) {
                        i19 = i93;
                        i28 = 1;
                        i29 = i2 + 2;
                    } else if (i79 == 49) {
                        i29 = i2 + 2;
                        i19 = i93;
                        i28 = 1;
                    } else {
                        if (i79 == 12 || i79 == 30 || i79 == 44) {
                            i19 = i93;
                            if (zzenVar2.zzc() == 1 || i80 != 0) {
                                i29 = i2 + 2;
                                int i96 = i70 / 3;
                                objArr[i96 + i96 + 1] = zze[i94];
                                i21 = i29;
                                i20 = charAt24;
                            } else {
                                i20 = charAt24;
                                i21 = i94;
                                i80 = 0;
                            }
                        } else if (i79 == 50) {
                            i21 = i2 + 2;
                            int i97 = i67 + 1;
                            iArr[i67] = i70;
                            int i98 = i70 / 3;
                            int i99 = i98 + i98;
                            objArr[i99] = zze[i94];
                            if (i80 != 0) {
                                objArr[i99 + 1] = zze[i21];
                                i21 = i2 + 3;
                                i67 = i97;
                                i19 = i93;
                                i20 = charAt24;
                            } else {
                                i20 = charAt24;
                                i67 = i97;
                                i80 = 0;
                                i19 = i93;
                            }
                        } else {
                            i19 = i93;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                        i22 = i20;
                        i23 = 1048575;
                        if ((i22 & 4096) != 0 || i79 > 17) {
                            i24 = i21;
                            str = zzd;
                            i25 = i17;
                            i26 = 0;
                        } else {
                            int i100 = i17 + 1;
                            int charAt26 = zzd.charAt(i17);
                            i24 = i21;
                            if (charAt26 >= 55296) {
                                int i101 = charAt26 & 8191;
                                int i102 = 13;
                                while (true) {
                                    i25 = i100 + 1;
                                    charAt10 = zzd.charAt(i100);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i101 |= (charAt10 & 8191) << i102;
                                    i102 += 13;
                                    i100 = i25;
                                }
                                charAt26 = i101 | (charAt10 << i102);
                            } else {
                                i25 = i100;
                            }
                            int i103 = i7 + i7 + (charAt26 / 32);
                            Object obj3 = zze[i103];
                            str = zzd;
                            if (obj3 instanceof Field) {
                                zzz = (Field) obj3;
                            } else {
                                zzz = zzz(cls2, (String) obj3);
                                zze[i103] = zzz;
                            }
                            i26 = charAt26 % 32;
                            i23 = (int) unsafe.objectFieldOffset(zzz);
                        }
                        if (i79 >= 18 && i79 <= 49) {
                            iArr[i68] = objectFieldOffset;
                            i68++;
                        }
                        i27 = objectFieldOffset;
                        i37 = i25;
                    }
                    int i104 = i70 / 3;
                    objArr[i104 + i104 + i28] = zze[i94];
                    i21 = i29;
                    i20 = charAt24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                    i22 = i20;
                    i23 = 1048575;
                    if ((i22 & 4096) != 0) {
                    }
                    i24 = i21;
                    str = zzd;
                    i25 = i17;
                    i26 = 0;
                    if (i79 >= 18) {
                        iArr[i68] = objectFieldOffset;
                        i68++;
                    }
                    i27 = objectFieldOffset;
                    i37 = i25;
                }
                i20 = charAt24;
                i21 = i94;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                i22 = i20;
                i23 = 1048575;
                if ((i22 & 4096) != 0) {
                }
                i24 = i21;
                str = zzd;
                i25 = i17;
                i26 = 0;
                if (i79 >= 18) {
                }
                i27 = objectFieldOffset;
                i37 = i25;
            }
            int i105 = i70 + 1;
            iArr3[i70] = i19;
            int i106 = i70 + 2;
            iArr3[i105] = ((i22 & 512) != 0 ? 536870912 : 0) | ((i22 & 256) != 0 ? 268435456 : 0) | (i80 != 0 ? Integer.MIN_VALUE : 0) | (i79 << 20) | i27;
            i70 += 3;
            iArr3[i106] = (i26 << 20) | i23;
            zzenVar = zzenVar2;
            i2 = i24;
            zzd = str;
            length = i18;
            c = 55296;
        }
        zzen zzenVar3 = zzenVar;
        return new zzef(iArr3, objArr, i3, i5, zzenVar3.zza(), zzenVar3.zzc(), false, iArr, i6, i65, zzeiVar, zzdqVar, zzffVar, zzceVar, zzdxVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzfp.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzfp.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzfp.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzfp.zzf(obj, j)).longValue();
    }

    private final zzcw zzu(int i) {
        int i2 = i / 3;
        return (zzcw) this.zzd[i2 + i2 + 1];
    }

    private final zzeo zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzeo zzeoVar = (zzeo) objArr[i3];
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zzb2 = zzel.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzeo zzv = zzv(i);
        int zzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
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

    private final Object zzy(Object obj, int i, int i2) {
        zzeo zzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
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

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zza(Object obj) {
        int i;
        int zzw;
        int zzw2;
        int zzw3;
        int zzx;
        int zzw4;
        int zzw5;
        int zzw6;
        int zzd;
        int zzw7;
        int zzh;
        int i2;
        int zzg;
        int size;
        int zzl;
        int zzw8;
        int zzw9;
        int zzw10;
        int i3;
        int zze;
        int zzw11;
        int zzw12;
        int i4;
        int zzw13;
        int zzw14;
        int zzd2;
        int zzw15;
        zzef<T> zzefVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i6 < zzefVar.zzc.length) {
            int zzs = zzefVar.zzs(i6);
            int zzr = zzr(zzs);
            int[] iArr = zzefVar.zzc;
            int i10 = iArr[i6];
            int i11 = iArr[i6 + 2];
            int i12 = i11 & i5;
            if (zzr <= 17) {
                if (i12 != i7) {
                    i8 = i12 == i5 ? 0 : unsafe.getInt(obj2, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = zzs & i5;
            if (zzr >= zzcj.DOUBLE_LIST_PACKED.zza()) {
                zzcj.SINT64_LIST_PACKED.zza();
            }
            int i14 = i9;
            long j = i13;
            switch (zzr) {
                case 0:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        zzw = zzby.zzw(i10 << 3);
                        zzh = zzw + 8;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 1:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        zzw2 = zzby.zzw(i10 << 3);
                        zzw5 = zzw2 + 4;
                        i9 = i14 + zzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 2:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(j2);
                        i2 = zzw3 + zzx;
                        i9 = i14 + i2;
                        zzefVar = this;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 3:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(j3);
                        i2 = zzw3 + zzx;
                        i9 = i14 + i2;
                        zzefVar = this;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 4:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(j4);
                        i2 = zzw3 + zzx;
                        i9 = i14 + i2;
                        zzefVar = this;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 5:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        zzw4 = zzby.zzw(i10 << 3);
                        zzw5 = zzw4 + 8;
                        i9 = i14 + zzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 6:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        zzw2 = zzby.zzw(i10 << 3);
                        zzw5 = zzw2 + 4;
                        i9 = i14 + zzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 7:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        zzw5 = zzby.zzw(i10 << 3) + 1;
                        i9 = i14 + zzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 8:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        int i15 = i10 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzbq) {
                            zzw6 = zzby.zzw(i15);
                            zzd = ((zzbq) object).zzd();
                            zzw7 = zzby.zzw(zzd);
                            i2 = zzw6 + zzw7 + zzd;
                            i9 = i14 + i2;
                            zzefVar = this;
                            i6 += 3;
                            i5 = 1048575;
                        } else {
                            zzw3 = zzby.zzw(i15);
                            zzx = zzby.zzv((String) object);
                            i2 = zzw3 + zzx;
                            i9 = i14 + i2;
                            zzefVar = this;
                            i6 += 3;
                            i5 = 1048575;
                        }
                    }
                    zzefVar = this;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 9:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        zzh = zzeq.zzh(i10, unsafe.getObject(obj2, j), zzefVar.zzv(i6));
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 10:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        zzbq zzbqVar = (zzbq) unsafe.getObject(obj2, j);
                        zzw6 = zzby.zzw(i10 << 3);
                        zzd = zzbqVar.zzd();
                        zzw7 = zzby.zzw(zzd);
                        i2 = zzw6 + zzw7 + zzd;
                        i9 = i14 + i2;
                        zzefVar = this;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 11:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzw(i16);
                        i2 = zzw3 + zzx;
                        i9 = i14 + i2;
                        zzefVar = this;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 12:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(j5);
                        i2 = zzw3 + zzx;
                        i9 = i14 + i2;
                        zzefVar = this;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 13:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        zzw2 = zzby.zzw(i10 << 3);
                        zzw5 = zzw2 + 4;
                        i9 = i14 + zzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 14:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        zzw4 = zzby.zzw(i10 << 3);
                        zzw5 = zzw4 + 8;
                        i9 = i14 + zzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 15:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        int i17 = unsafe.getInt(obj2, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzw((i17 >> 31) ^ (i17 + i17));
                        i2 = zzw3 + zzx;
                        i9 = i14 + i2;
                        zzefVar = this;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 16:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx((j6 >> 63) ^ (j6 + j6));
                        i2 = zzw3 + zzx;
                        i9 = i14 + i2;
                        zzefVar = this;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzefVar = this;
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 17:
                    if (zzefVar.zzJ(obj2, i6, i7, i8, i)) {
                        zzh = zzby.zzt(i10, (zzec) unsafe.getObject(obj2, j), zzefVar.zzv(i6));
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 18:
                    zzh = zzeq.zzd(i10, (List) unsafe.getObject(obj2, j), false);
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case 19:
                    zzh = zzeq.zzb(i10, (List) unsafe.getObject(obj2, j), false);
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i18 = zzeq.zza;
                    if (list.size() != 0) {
                        zzg = zzeq.zzg(list) + (list.size() * zzby.zzw(i10 << 3));
                        i9 = zzg + i14;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzg = 0;
                    i9 = zzg + i14;
                    i6 += 3;
                    i5 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzeq.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzeq.zzl(list2);
                        zzw8 = zzby.zzw(i10 << 3);
                        i3 = size * zzw8;
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzeq.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzeq.zzf(list3);
                        zzw8 = zzby.zzw(i10 << 3);
                        i3 = size * zzw8;
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case 23:
                    zzh = zzeq.zzd(i10, (List) unsafe.getObject(obj2, j), false);
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case 24:
                    zzh = zzeq.zzb(i10, (List) unsafe.getObject(obj2, j), false);
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzeq.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzby.zzw(i10 << 3) + 1);
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i22 = zzeq.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzby.zzw(i10 << 3) * size3;
                        if (list5 instanceof zzdk) {
                            zzdk zzdkVar = (zzdk) list5;
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object zzf = zzdkVar.zzf(i23);
                                if (zzf instanceof zzbq) {
                                    int zzd3 = ((zzbq) zzf).zzd();
                                    zzg += zzby.zzw(zzd3) + zzd3;
                                } else {
                                    zzg += zzby.zzv((String) zzf);
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object obj3 = list5.get(i24);
                                if (obj3 instanceof zzbq) {
                                    int zzd4 = ((zzbq) obj3).zzd();
                                    zzg += zzby.zzw(zzd4) + zzd4;
                                } else {
                                    zzg += zzby.zzv((String) obj3);
                                }
                            }
                        }
                        i9 = zzg + i14;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzg = 0;
                    i9 = zzg + i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzeo zzv = zzefVar.zzv(i6);
                    int i25 = zzeq.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzw9 = 0;
                    } else {
                        zzw9 = zzby.zzw(i10 << 3) * size4;
                        for (int i26 = 0; i26 < size4; i26++) {
                            Object obj4 = list6.get(i26);
                            if (obj4 instanceof zzdi) {
                                int zza2 = ((zzdi) obj4).zza();
                                zzw9 += zzby.zzw(zza2) + zza2;
                            } else {
                                zzw9 += zzby.zzu((zzec) obj4, zzv);
                            }
                        }
                    }
                    i9 = i14 + zzw9;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i27 = zzeq.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzw10 = 0;
                    } else {
                        zzw10 = size5 * zzby.zzw(i10 << 3);
                        for (int i28 = 0; i28 < list7.size(); i28++) {
                            int zzd5 = ((zzbq) list7.get(i28)).zzd();
                            zzw10 += zzby.zzw(zzd5) + zzd5;
                        }
                    }
                    i9 = i14 + zzw10;
                    i6 += 3;
                    i5 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzeq.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzeq.zzk(list8);
                        zzw8 = zzby.zzw(i10 << 3);
                        i3 = size * zzw8;
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzeq.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzeq.zza(list9);
                        zzw8 = zzby.zzw(i10 << 3);
                        i3 = size * zzw8;
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case 31:
                    zzh = zzeq.zzb(i10, (List) unsafe.getObject(obj2, j), false);
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case 32:
                    zzh = zzeq.zzd(i10, (List) unsafe.getObject(obj2, j), false);
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzeq.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzeq.zzi(list10);
                        zzw8 = zzby.zzw(i10 << 3);
                        i3 = size * zzw8;
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzeq.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzeq.zzj(list11);
                        zzw8 = zzby.zzw(i10 << 3);
                        i3 = size * zzw8;
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 = i14 + zzh;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    zze = zzeq.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    zze = zzeq.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    zze = zzeq.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    zze = zzeq.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    zze = zzeq.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    zze = zzeq.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    zze = zzeq.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i33 = zzeq.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    zze = zzeq.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    zze = zzeq.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    zze = zzeq.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    zze = zzeq.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    zze = zzeq.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 48:
                    zze = zzeq.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzw11 = zzby.zzw(i10 << 3);
                        zzw12 = zzby.zzw(zze);
                        zzw10 = zzw11 + zzw12 + zze;
                        i9 = i14 + zzw10;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzeo zzv2 = zzefVar.zzv(i6);
                    int i34 = zzeq.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i35 = 0; i35 < size6; i35++) {
                            i4 += zzby.zzt(i10, (zzec) list13.get(i35), zzv2);
                        }
                    }
                    i9 = i14 + i4;
                    i6 += 3;
                    i5 = 1048575;
                case 50:
                    zzdw zzdwVar = (zzdw) unsafe.getObject(obj2, j);
                    if (!zzdwVar.isEmpty()) {
                        Iterator it = zzdwVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 51:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        zzw = zzby.zzw(i10 << 3);
                        zzh = zzw + 8;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 52:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        zzw13 = zzby.zzw(i10 << 3);
                        zzh = zzw13 + 4;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 53:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        long zzt = zzt(obj2, j);
                        zzl = zzby.zzw(i10 << 3);
                        i3 = zzby.zzx(zzt);
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 54:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        long zzt2 = zzt(obj2, j);
                        zzl = zzby.zzw(i10 << 3);
                        i3 = zzby.zzx(zzt2);
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 55:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        long zzo = zzo(obj2, j);
                        zzl = zzby.zzw(i10 << 3);
                        i3 = zzby.zzx(zzo);
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 56:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        zzw = zzby.zzw(i10 << 3);
                        zzh = zzw + 8;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 57:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        zzw13 = zzby.zzw(i10 << 3);
                        zzh = zzw13 + 4;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 58:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        zzh = zzby.zzw(i10 << 3) + 1;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 59:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        int i36 = i10 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzbq) {
                            zzw14 = zzby.zzw(i36);
                            zzd2 = ((zzbq) object2).zzd();
                            zzw15 = zzby.zzw(zzd2);
                            zzh = zzw14 + zzw15 + zzd2;
                            i9 = i14 + zzh;
                            i6 += 3;
                            i5 = 1048575;
                        } else {
                            zzl = zzby.zzw(i36);
                            i3 = zzby.zzv((String) object2);
                            zzh = zzl + i3;
                            i9 = i14 + zzh;
                            i6 += 3;
                            i5 = 1048575;
                        }
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 60:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        zzh = zzeq.zzh(i10, unsafe.getObject(obj2, j), zzefVar.zzv(i6));
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 61:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        zzbq zzbqVar2 = (zzbq) unsafe.getObject(obj2, j);
                        zzw14 = zzby.zzw(i10 << 3);
                        zzd2 = zzbqVar2.zzd();
                        zzw15 = zzby.zzw(zzd2);
                        zzh = zzw14 + zzw15 + zzd2;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 62:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        int zzo2 = zzo(obj2, j);
                        zzl = zzby.zzw(i10 << 3);
                        i3 = zzby.zzw(zzo2);
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        long zzo3 = zzo(obj2, j);
                        zzl = zzby.zzw(i10 << 3);
                        i3 = zzby.zzx(zzo3);
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 64:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        zzw13 = zzby.zzw(i10 << 3);
                        zzh = zzw13 + 4;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 65:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        zzw = zzby.zzw(i10 << 3);
                        zzh = zzw + 8;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 66:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        int zzo4 = zzo(obj2, j);
                        zzl = zzby.zzw(i10 << 3);
                        i3 = zzby.zzw((zzo4 >> 31) ^ (zzo4 + zzo4));
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 67:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        long zzt3 = zzt(obj2, j);
                        zzl = zzby.zzw(i10 << 3);
                        i3 = zzby.zzx((zzt3 >> 63) ^ (zzt3 + zzt3));
                        zzh = zzl + i3;
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                case 68:
                    if (zzefVar.zzM(obj2, i10, i6)) {
                        zzh = zzby.zzt(i10, (zzec) unsafe.getObject(obj2, j), zzefVar.zzv(i6));
                        i9 = i14 + zzh;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
                default:
                    i9 = i14;
                    i6 += 3;
                    i5 = 1048575;
            }
        }
        zzff zzffVar = zzefVar.zzm;
        int zza3 = i9 + zzffVar.zza(zzffVar.zzd(obj2));
        if (!zzefVar.zzh) {
            return zza3;
        }
        zzci zzb2 = zzefVar.zzn.zzb(obj2);
        int i37 = 0;
        for (int i38 = 0; i38 < zzb2.zza.zzb(); i38++) {
            Map.Entry zzg2 = zzb2.zza.zzg(i38);
            i37 += zzci.zzb((zzch) zzg2.getKey(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzb2.zza.zzc()) {
            i37 += zzci.zzb((zzch) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i37;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzs = zzs(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzr) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzfp.zza(obj, j));
                    byte[] bArr = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzfp.zzb(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr2 = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr3 = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr4 = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzda.zza(zzfp.zzw(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzfp.zzf(obj, j)).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzfp.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr5 = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr6 = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzfp.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                case 29:
                case 30:
                case 31:
                case 32:
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzda.zza(zzN(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzfp.zzf(obj, j)).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.zzm.zzd(obj).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzn.zzb(obj).zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0ce2, code lost:
    
        if (r14 == 1048575) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0ce4, code lost:
    
        r30.putInt(r8, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0cea, code lost:
    
        r1 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0cee, code lost:
    
        if (r1 >= r0.zzk) goto L692;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0cf0, code lost:
    
        r2 = r0.zzi;
        r5 = r0.zzc;
        r2 = r2[r1];
        r5 = r5[r2];
        r5 = com.google.android.gms.internal.play_billing.zzfp.zzf(r8, r0.zzs(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d06, code lost:
    
        if (r5 != null) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d0d, code lost:
    
        if (r0.zzu(r2) != null) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d12, code lost:
    
        r5 = (com.google.android.gms.internal.play_billing.zzdw) r5;
        r1 = (com.google.android.gms.internal.play_billing.zzdv) r0.zzw(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0d1a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d0f, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0d1b, code lost:
    
        if (r7 != 0) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0d1d, code lost:
    
        if (r3 != r4) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0d24, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0d29, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0d25, code lost:
    
        if (r3 > r4) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0d27, code lost:
    
        if (r6 != r7) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0d2e, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0a05 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0c71 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0c80 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0a17 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0c88 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0c94  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzbc zzbcVar) throws IOException {
        int i4;
        Unsafe unsafe;
        int i5;
        Object obj2;
        int zzq;
        int i6;
        int i7;
        zzbc zzbcVar2;
        int i8;
        int i9;
        byte[] bArr2;
        int i10;
        int i11;
        int i12;
        int i13;
        Object obj3;
        int i14;
        Unsafe unsafe2;
        int i15;
        Unsafe unsafe3;
        int i16;
        Object obj4;
        int zzh;
        int i17;
        int i18;
        int i19;
        Unsafe unsafe4;
        Object obj5;
        int i20;
        zzbc zzbcVar3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        zzbc zzbcVar4;
        int zza2;
        int i27;
        int zzh2;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int zzj;
        int i34;
        int i35;
        int i36;
        zzef<T> zzefVar = this;
        Object obj6 = obj;
        byte[] bArr3 = bArr;
        int i37 = i2;
        zzbc zzbcVar5 = zzbcVar;
        zzA(obj6);
        Unsafe unsafe5 = zzb;
        int i38 = 0;
        int i39 = i;
        int i40 = -1;
        int i41 = 0;
        int i42 = 0;
        int i43 = 1048575;
        int i44 = 0;
        while (true) {
            if (i39 < i37) {
                int i45 = i39 + 1;
                int i46 = bArr3[i39];
                if (i46 < 0) {
                    i45 = zzbd.zzi(i46, bArr3, i45, zzbcVar5);
                    i46 = zzbcVar5.zza;
                }
                int i47 = i45;
                int i48 = i46;
                i39 = i47;
                int i49 = i48 >>> 3;
                if (i49 > i40) {
                    int i50 = i41 / 3;
                    if (i49 >= zzefVar.zze && i49 <= zzefVar.zzf) {
                        zzq = zzefVar.zzq(i49, i50);
                        if (zzq != -1) {
                            unsafe = unsafe5;
                            obj2 = obj6;
                            i6 = i43;
                            i7 = 0;
                            zzbcVar2 = zzbcVar5;
                            i8 = i49;
                            i9 = i48;
                            bArr2 = bArr3;
                            i4 = i3;
                        } else {
                            int i51 = i48 & 7;
                            int[] iArr = zzefVar.zzc;
                            int i52 = iArr[zzq + 1];
                            int i53 = zzq;
                            int zzr = zzr(i52);
                            int i54 = i48;
                            long j = i52 & 1048575;
                            if (zzr <= 17) {
                                int i55 = iArr[i53 + 2];
                                int i56 = 1 << (i55 >>> 20);
                                int i57 = i55 & 1048575;
                                if (i57 != i43) {
                                    int i58 = 1048575;
                                    if (i43 != 1048575) {
                                        unsafe5.putInt(obj6, i43, i44);
                                        i58 = 1048575;
                                    }
                                    i44 = i57 == i58 ? 0 : unsafe5.getInt(obj6, i57);
                                    i43 = i57;
                                }
                                switch (zzr) {
                                    case 0:
                                        zzbcVar5 = zzbcVar;
                                        i12 = i39;
                                        i13 = i43;
                                        i7 = i53;
                                        obj3 = obj6;
                                        i14 = i44;
                                        unsafe2 = unsafe5;
                                        if (i51 != 1) {
                                            i39 = i12;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            i39 = i12 + 8;
                                            i15 = i14 | i56;
                                            zzfp.zzo(obj3, j, Double.longBitsToDouble(zzbd.zzn(bArr3, i12)));
                                            i40 = i49;
                                            obj6 = obj3;
                                            unsafe5 = unsafe2;
                                            i42 = i54;
                                            i38 = 0;
                                            i44 = i15;
                                            i43 = i13;
                                            i41 = i7;
                                            i37 = i2;
                                            break;
                                        }
                                    case 1:
                                        zzbcVar5 = zzbcVar;
                                        i12 = i39;
                                        i13 = i43;
                                        i7 = i53;
                                        obj3 = obj6;
                                        i14 = i44;
                                        unsafe2 = unsafe5;
                                        if (i51 != 5) {
                                            i39 = i12;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            i39 = i12 + 4;
                                            i15 = i14 | i56;
                                            zzfp.zzp(obj3, j, Float.intBitsToFloat(zzbd.zzb(bArr3, i12)));
                                            i40 = i49;
                                            obj6 = obj3;
                                            unsafe5 = unsafe2;
                                            i42 = i54;
                                            i38 = 0;
                                            i44 = i15;
                                            i43 = i13;
                                            i41 = i7;
                                            i37 = i2;
                                            break;
                                        }
                                    case 2:
                                    case 3:
                                        zzbcVar5 = zzbcVar;
                                        i12 = i39;
                                        i13 = i43;
                                        i7 = i53;
                                        i14 = i44;
                                        if (i51 != 0) {
                                            unsafe2 = unsafe5;
                                            obj3 = obj6;
                                            i39 = i12;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            int i59 = i14 | i56;
                                            int zzk = zzbd.zzk(bArr3, i12, zzbcVar5);
                                            unsafe5.putLong(obj6, j, zzbcVar5.zzb);
                                            i43 = i13;
                                            i41 = i7;
                                            i44 = i59;
                                            i39 = zzk;
                                            i40 = i49;
                                            i42 = i54;
                                            i38 = 0;
                                            i37 = i2;
                                            break;
                                        }
                                    case 4:
                                    case 11:
                                        zzbcVar5 = zzbcVar;
                                        i12 = i39;
                                        i13 = i43;
                                        i7 = i53;
                                        i14 = i44;
                                        if (i51 != 0) {
                                            unsafe2 = unsafe5;
                                            obj3 = obj6;
                                            i39 = i12;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            int zzh3 = zzbd.zzh(bArr3, i12, zzbcVar5);
                                            unsafe5.putInt(obj6, j, zzbcVar5.zza);
                                            i44 = i14 | i56;
                                            i39 = zzh3;
                                            i43 = i13;
                                            i41 = i7;
                                            i40 = i49;
                                            i42 = i54;
                                            i38 = 0;
                                            i37 = i2;
                                            break;
                                        }
                                    case 5:
                                    case 14:
                                        Unsafe unsafe6 = unsafe5;
                                        i12 = i39;
                                        byte[] bArr4 = bArr3;
                                        i13 = i43;
                                        i7 = i53;
                                        Object obj7 = obj6;
                                        i14 = i44;
                                        if (i51 != 1) {
                                            obj6 = obj7;
                                            unsafe5 = unsafe6;
                                            unsafe2 = unsafe5;
                                            obj3 = obj6;
                                            i39 = i12;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            long zzn = zzbd.zzn(bArr4, i12);
                                            obj6 = obj7;
                                            bArr3 = bArr4;
                                            unsafe5 = unsafe6;
                                            zzbcVar5 = zzbcVar;
                                            unsafe5.putLong(obj6, j, zzn);
                                            i43 = i13;
                                            i41 = i7;
                                            i39 = i12 + 8;
                                            i44 = i14 | i56;
                                            i40 = i49;
                                            i42 = i54;
                                            i38 = 0;
                                            i37 = i2;
                                            break;
                                        }
                                    case 6:
                                    case 13:
                                        unsafe3 = unsafe5;
                                        i16 = i39;
                                        byte[] bArr5 = bArr3;
                                        i13 = i43;
                                        i7 = i53;
                                        obj4 = obj6;
                                        i14 = i44;
                                        if (i51 != 5) {
                                            i39 = i16;
                                            obj3 = obj4;
                                            unsafe2 = unsafe3;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            unsafe3.putInt(obj4, j, zzbd.zzb(bArr5, i16));
                                            bArr3 = bArr5;
                                            unsafe5 = unsafe3;
                                            zzbcVar5 = zzbcVar;
                                            i39 = i16 + 4;
                                            obj6 = obj4;
                                            i44 = i14 | i56;
                                            i43 = i13;
                                            i41 = i7;
                                            i40 = i49;
                                            i42 = i54;
                                            i38 = 0;
                                            i37 = i2;
                                            break;
                                        }
                                    case 7:
                                        unsafe3 = unsafe5;
                                        i16 = i39;
                                        byte[] bArr6 = bArr3;
                                        i13 = i43;
                                        i7 = i53;
                                        obj4 = obj6;
                                        i14 = i44;
                                        if (i51 != 0) {
                                            i39 = i16;
                                            obj3 = obj4;
                                            unsafe2 = unsafe3;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            int i60 = i14 | i56;
                                            int zzk2 = zzbd.zzk(bArr6, i16, zzbcVar);
                                            zzfp.zzm(obj4, j, zzbcVar.zzb != 0);
                                            i44 = i60;
                                            obj6 = obj4;
                                            i43 = i13;
                                            i41 = i7;
                                            i42 = i54;
                                            i38 = 0;
                                            i37 = i2;
                                            bArr3 = bArr6;
                                            unsafe5 = unsafe3;
                                            zzbcVar5 = zzbcVar;
                                            i39 = zzk2;
                                            i40 = i49;
                                            break;
                                        }
                                    case 8:
                                        Unsafe unsafe7 = unsafe5;
                                        byte[] bArr7 = bArr3;
                                        i13 = i43;
                                        i7 = i53;
                                        Object obj8 = obj6;
                                        i14 = i44;
                                        if (i51 != 2) {
                                            i39 = i39;
                                            obj3 = obj8;
                                            unsafe2 = unsafe7;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            if ((i52 & 536870912) != 0) {
                                                zzh = zzbd.zzh(bArr7, i39, zzbcVar);
                                                int i61 = zzbcVar.zza;
                                                if (i61 < 0) {
                                                    throw zzdc.zzd();
                                                }
                                                int i62 = i14 | i56;
                                                if (i61 == 0) {
                                                    zzbcVar.zzc = "";
                                                    i18 = i62;
                                                } else {
                                                    int i63 = zzfu.zza;
                                                    int length = bArr7.length;
                                                    if ((((length - zzh) - i61) | zzh | i61) < 0) {
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzh), Integer.valueOf(i61)));
                                                    }
                                                    int i64 = zzh + i61;
                                                    char[] cArr = new char[i61];
                                                    int i65 = 0;
                                                    while (zzh < i64) {
                                                        byte b = bArr7[zzh];
                                                        if (zzfq.zzd(b)) {
                                                            zzh++;
                                                            cArr[i65] = (char) b;
                                                            i65++;
                                                        } else {
                                                            while (zzh < i64) {
                                                                int i66 = zzh + 1;
                                                                int i67 = zzh;
                                                                byte b2 = bArr7[i67];
                                                                if (zzfq.zzd(b2)) {
                                                                    int i68 = i65 + 1;
                                                                    cArr[i65] = (char) b2;
                                                                    zzh = i66;
                                                                    while (true) {
                                                                        i65 = i68;
                                                                        if (zzh < i64) {
                                                                            byte b3 = bArr7[zzh];
                                                                            if (zzfq.zzd(b3)) {
                                                                                zzh++;
                                                                                i68 = i65 + 1;
                                                                                cArr[i65] = (char) b3;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    int i69 = i62;
                                                                    if (b2 < -32) {
                                                                        if (i66 >= i64) {
                                                                            throw zzdc.zzc();
                                                                        }
                                                                        i19 = i67 + 2;
                                                                        zzfq.zzc(b2, bArr7[i66], cArr, i65);
                                                                        i65++;
                                                                    } else if (b2 < -16) {
                                                                        if (i66 >= i64 - 1) {
                                                                            throw zzdc.zzc();
                                                                        }
                                                                        int i70 = i67 + 2;
                                                                        i19 = i67 + 3;
                                                                        zzfq.zzb(b2, bArr7[i66], bArr7[i70], cArr, i65);
                                                                        i65++;
                                                                    } else {
                                                                        if (i66 >= i64 - 2) {
                                                                            throw zzdc.zzc();
                                                                        }
                                                                        char[] cArr2 = cArr;
                                                                        zzfq.zza(b2, bArr7[i66], bArr7[i67 + 2], bArr7[i67 + 3], cArr2, i65);
                                                                        i65 += 2;
                                                                        cArr = cArr2;
                                                                        zzh = i67 + 4;
                                                                        i62 = i69;
                                                                    }
                                                                    zzh = i19;
                                                                    i62 = i69;
                                                                }
                                                            }
                                                            i18 = i62;
                                                            zzbcVar.zzc = new String(cArr, 0, i65);
                                                            zzh = i64;
                                                        }
                                                    }
                                                    while (zzh < i64) {
                                                    }
                                                    i18 = i62;
                                                    zzbcVar.zzc = new String(cArr, 0, i65);
                                                    zzh = i64;
                                                }
                                                i17 = i18;
                                            } else {
                                                zzh = zzbd.zzh(bArr7, i39, zzbcVar);
                                                int i71 = zzbcVar.zza;
                                                if (i71 < 0) {
                                                    throw zzdc.zzd();
                                                }
                                                i17 = i14 | i56;
                                                if (i71 == 0) {
                                                    zzbcVar.zzc = "";
                                                } else {
                                                    zzbcVar.zzc = new String(bArr7, zzh, i71, zzda.zzb);
                                                    zzh += i71;
                                                }
                                            }
                                            unsafe7.putObject(obj8, j, zzbcVar.zzc);
                                            bArr3 = bArr7;
                                            unsafe5 = unsafe7;
                                            zzbcVar5 = zzbcVar;
                                            i39 = zzh;
                                            obj6 = obj8;
                                            i43 = i13;
                                            i41 = i7;
                                            i44 = i17;
                                            i40 = i49;
                                            i42 = i54;
                                            i38 = 0;
                                            i37 = i2;
                                            break;
                                        }
                                        break;
                                    case 9:
                                        Object obj9 = obj6;
                                        Unsafe unsafe8 = unsafe5;
                                        i13 = i43;
                                        i7 = i53;
                                        i14 = i44;
                                        if (i51 != 2) {
                                            i54 = i54;
                                            unsafe2 = unsafe8;
                                            i39 = i39;
                                            obj3 = obj9;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            i44 = i14 | i56;
                                            Object zzx = zzefVar.zzx(obj9, i7);
                                            i54 = i54;
                                            byte[] bArr8 = bArr3;
                                            int zzm = zzbd.zzm(zzx, zzefVar.zzv(i7), bArr8, i39, i2, zzbcVar);
                                            zzefVar.zzF(obj9, i7, zzx);
                                            bArr3 = bArr8;
                                            unsafe5 = unsafe8;
                                            zzbcVar5 = zzbcVar;
                                            i39 = zzm;
                                            obj6 = obj9;
                                            i43 = i13;
                                            i41 = i7;
                                            i40 = i49;
                                            i42 = i54;
                                            i38 = 0;
                                            i37 = i2;
                                            break;
                                        }
                                    case 10:
                                        Object obj10 = obj6;
                                        unsafe4 = unsafe5;
                                        obj5 = obj10;
                                        zzbcVar5 = zzbcVar;
                                        i13 = i43;
                                        i7 = i53;
                                        i20 = i54;
                                        i14 = i44;
                                        if (i51 != 2) {
                                            obj3 = obj5;
                                            unsafe2 = unsafe4;
                                            i54 = i20;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            i39 = zzbd.zza(bArr3, i39, zzbcVar5);
                                            unsafe4.putObject(obj5, j, zzbcVar5.zzc);
                                            obj6 = obj5;
                                            unsafe5 = unsafe4;
                                            i42 = i20;
                                            i44 = i14 | i56;
                                            i43 = i13;
                                            i41 = i7;
                                            i40 = i49;
                                            i38 = 0;
                                            i37 = i2;
                                            break;
                                        }
                                    case 12:
                                        Object obj11 = obj6;
                                        unsafe4 = unsafe5;
                                        obj5 = obj11;
                                        zzbcVar5 = zzbcVar;
                                        i13 = i43;
                                        i7 = i53;
                                        i20 = i54;
                                        i14 = i44;
                                        if (i51 != 0) {
                                            obj3 = obj5;
                                            unsafe2 = unsafe4;
                                            i54 = i20;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            i39 = zzbd.zzh(bArr3, i39, zzbcVar5);
                                            int i72 = zzbcVar5.zza;
                                            zzcw zzu = zzefVar.zzu(i7);
                                            if ((i52 & Integer.MIN_VALUE) != 0 && zzu != null && !zzu.zza(i72)) {
                                                zzd(obj5).zzj(i20, Long.valueOf(i72));
                                                obj6 = obj5;
                                                unsafe5 = unsafe4;
                                                i42 = i20;
                                                i43 = i13;
                                                i41 = i7;
                                                i40 = i49;
                                                i44 = i14;
                                                i38 = 0;
                                                i37 = i2;
                                                break;
                                            } else {
                                                unsafe4.putInt(obj5, j, i72);
                                                obj6 = obj5;
                                                unsafe5 = unsafe4;
                                                i44 = i14 | i56;
                                                i43 = i13;
                                                i41 = i7;
                                                i38 = 0;
                                                i37 = i2;
                                                i42 = i20;
                                                i40 = i49;
                                                break;
                                            }
                                        }
                                        break;
                                    case 15:
                                        Object obj12 = obj6;
                                        Unsafe unsafe9 = unsafe5;
                                        zzbcVar5 = zzbcVar;
                                        i13 = i43;
                                        i7 = i53;
                                        i14 = i44;
                                        if (i51 != 0) {
                                            obj3 = obj12;
                                            unsafe2 = unsafe9;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            i39 = zzbd.zzh(bArr3, i39, zzbcVar5);
                                            unsafe9.putInt(obj12, j, zzbu.zzb(zzbcVar5.zza));
                                            obj6 = obj12;
                                            unsafe5 = unsafe9;
                                            i44 = i14 | i56;
                                            i43 = i13;
                                            i41 = i7;
                                            i40 = i49;
                                            i42 = i54;
                                            i38 = 0;
                                            i37 = i2;
                                            break;
                                        }
                                    case 16:
                                        if (i51 != 0) {
                                            i7 = i53;
                                            i13 = i43;
                                            i14 = i44;
                                            obj3 = obj6;
                                            unsafe2 = unsafe5;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            i44 |= i56;
                                            zzbcVar5 = zzbcVar;
                                            int zzk3 = zzbd.zzk(bArr3, i39, zzbcVar5);
                                            i7 = i53;
                                            unsafe5.putLong(obj6, j, zzbu.zzc(zzbcVar5.zzb));
                                            obj6 = obj6;
                                            unsafe5 = unsafe5;
                                            i39 = zzk3;
                                            i41 = i7;
                                            i40 = i49;
                                            i42 = i54;
                                            i38 = 0;
                                            i37 = i2;
                                            break;
                                        }
                                    default:
                                        i12 = i39;
                                        i13 = i43;
                                        i7 = i53;
                                        obj3 = obj6;
                                        i14 = i44;
                                        unsafe2 = unsafe5;
                                        if (i51 != 3) {
                                            i39 = i12;
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i6 = i13;
                                            i8 = i49;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i44 = i14;
                                            i9 = i54;
                                            zzbcVar2 = zzbcVar;
                                            break;
                                        } else {
                                            Object zzx2 = zzefVar.zzx(obj3, i7);
                                            int zzl = zzbd.zzl(zzx2, zzefVar.zzv(i7), bArr3, i12, i2, (i49 << 3) | 4, zzbcVar);
                                            zzefVar.zzF(obj3, i7, zzx2);
                                            bArr3 = bArr;
                                            zzbcVar5 = zzbcVar;
                                            i39 = zzl;
                                            i41 = i7;
                                            i40 = i49;
                                            obj6 = obj3;
                                            unsafe5 = unsafe2;
                                            i42 = i54;
                                            i43 = i13;
                                            i44 = i14 | i56;
                                            i38 = 0;
                                            i37 = i2;
                                            break;
                                        }
                                }
                            } else {
                                Unsafe unsafe10 = unsafe5;
                                obj2 = obj6;
                                i7 = i53;
                                if (zzr != 27) {
                                    unsafe = unsafe10;
                                    i6 = i43;
                                    i21 = i44;
                                    i23 = i39;
                                    zzbcVar3 = zzbcVar;
                                    if (zzr > 49) {
                                        i22 = i54;
                                        i8 = i49;
                                        if (zzr != 50) {
                                            Unsafe unsafe11 = zzb;
                                            long j2 = iArr[i7 + 2] & 1048575;
                                            switch (zzr) {
                                                case 51:
                                                    i24 = i7;
                                                    i9 = i22;
                                                    i25 = i23;
                                                    zzbcVar2 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    if (i51 == 1) {
                                                        i26 = i25 + 8;
                                                        unsafe11.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzbd.zzn(bArr2, i25))));
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = i26;
                                                        if (i39 != i25) {
                                                            i4 = i3;
                                                            i7 = i24;
                                                            i44 = i21;
                                                            break;
                                                        } else {
                                                            bArr3 = bArr2;
                                                            obj6 = obj2;
                                                            i40 = i8;
                                                            i42 = i9;
                                                            zzbcVar5 = zzbcVar2;
                                                            i41 = i24;
                                                            i43 = i6;
                                                            i44 = i21;
                                                            unsafe5 = unsafe;
                                                            i38 = 0;
                                                            i37 = i2;
                                                            break;
                                                        }
                                                    }
                                                    i39 = i25;
                                                    if (i39 != i25) {
                                                    }
                                                case 52:
                                                    i24 = i7;
                                                    i9 = i22;
                                                    i25 = i23;
                                                    zzbcVar2 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    if (i51 == 5) {
                                                        i26 = i25 + 4;
                                                        unsafe11.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzbd.zzb(bArr2, i25))));
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = i26;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    i39 = i25;
                                                    if (i39 != i25) {
                                                    }
                                                    break;
                                                case 53:
                                                case 54:
                                                    i24 = i7;
                                                    i9 = i22;
                                                    i25 = i23;
                                                    zzbcVar2 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    if (i51 == 0) {
                                                        i26 = zzbd.zzk(bArr2, i25, zzbcVar2);
                                                        unsafe11.putObject(obj2, j, Long.valueOf(zzbcVar2.zzb));
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = i26;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    i39 = i25;
                                                    if (i39 != i25) {
                                                    }
                                                    break;
                                                case 55:
                                                case 62:
                                                    i24 = i7;
                                                    i9 = i22;
                                                    i25 = i23;
                                                    zzbcVar2 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    if (i51 == 0) {
                                                        i26 = zzbd.zzh(bArr2, i25, zzbcVar2);
                                                        unsafe11.putObject(obj2, j, Integer.valueOf(zzbcVar2.zza));
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = i26;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    i39 = i25;
                                                    if (i39 != i25) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    i24 = i7;
                                                    i9 = i22;
                                                    i25 = i23;
                                                    zzbcVar2 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    if (i51 == 1) {
                                                        i26 = i25 + 8;
                                                        unsafe11.putObject(obj2, j, Long.valueOf(zzbd.zzn(bArr2, i25)));
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = i26;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    i39 = i25;
                                                    if (i39 != i25) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    i24 = i7;
                                                    i9 = i22;
                                                    i25 = i23;
                                                    zzbcVar2 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    if (i51 == 5) {
                                                        i26 = i25 + 4;
                                                        unsafe11.putObject(obj2, j, Integer.valueOf(zzbd.zzb(bArr2, i25)));
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = i26;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    i39 = i25;
                                                    if (i39 != i25) {
                                                    }
                                                    break;
                                                case 58:
                                                    i24 = i7;
                                                    i9 = i22;
                                                    i25 = i23;
                                                    zzbcVar2 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    if (i51 == 0) {
                                                        i26 = zzbd.zzk(bArr2, i25, zzbcVar2);
                                                        unsafe11.putObject(obj2, j, Boolean.valueOf(zzbcVar2.zzb != 0));
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = i26;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    i39 = i25;
                                                    if (i39 != i25) {
                                                    }
                                                    break;
                                                case 59:
                                                    i24 = i7;
                                                    i9 = i22;
                                                    i25 = i23;
                                                    zzbcVar2 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    if (i51 == 2) {
                                                        i26 = zzbd.zzh(bArr2, i25, zzbcVar2);
                                                        int i73 = zzbcVar2.zza;
                                                        if (i73 == 0) {
                                                            unsafe11.putObject(obj2, j, "");
                                                        } else {
                                                            int i74 = i26 + i73;
                                                            if ((i52 & 536870912) != 0 && !zzfu.zze(bArr2, i26, i74)) {
                                                                throw zzdc.zzc();
                                                            }
                                                            unsafe11.putObject(obj2, j, new String(bArr2, i26, i73, zzda.zzb));
                                                            i26 = i74;
                                                        }
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = i26;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    i39 = i25;
                                                    if (i39 != i25) {
                                                    }
                                                    break;
                                                case 60:
                                                    i9 = i22;
                                                    bArr2 = bArr;
                                                    if (i51 == 2) {
                                                        Object zzy = zzefVar.zzy(obj2, i8, i7);
                                                        int zzm2 = zzbd.zzm(zzy, zzefVar.zzv(i7), bArr2, i23, i2, zzbcVar3);
                                                        zzbcVar2 = zzbcVar3;
                                                        bArr2 = bArr2;
                                                        zzefVar.zzG(obj2, i8, i7, zzy);
                                                        i39 = zzm2;
                                                        i24 = i7;
                                                        i25 = i23;
                                                        if (i39 != i25) {
                                                        }
                                                    } else {
                                                        zzbcVar2 = zzbcVar3;
                                                        i24 = i7;
                                                        i25 = i23;
                                                        i39 = i25;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    break;
                                                case 61:
                                                    zzbcVar4 = zzbcVar3;
                                                    i9 = i22;
                                                    bArr2 = bArr;
                                                    if (i51 == 2) {
                                                        zza2 = zzbd.zza(bArr2, i23, zzbcVar4);
                                                        unsafe11.putObject(obj2, j, zzbcVar4.zzc);
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = zza2;
                                                        i24 = i7;
                                                        i25 = i23;
                                                        zzbcVar2 = zzbcVar4;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    i24 = i7;
                                                    i25 = i23;
                                                    zzbcVar2 = zzbcVar4;
                                                    i39 = i25;
                                                    if (i39 != i25) {
                                                    }
                                                    break;
                                                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                                    zzbcVar4 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    if (i51 == 0) {
                                                        zza2 = zzbd.zzh(bArr2, i23, zzbcVar4);
                                                        int i75 = zzbcVar4.zza;
                                                        zzcw zzu2 = zzefVar.zzu(i7);
                                                        if (zzu2 == null || zzu2.zza(i75)) {
                                                            i9 = i22;
                                                            unsafe11.putObject(obj2, j, Integer.valueOf(i75));
                                                            unsafe11.putInt(obj2, j2, i8);
                                                        } else {
                                                            i9 = i22;
                                                            zzd(obj2).zzj(i9, Long.valueOf(i75));
                                                        }
                                                        i39 = zza2;
                                                        i24 = i7;
                                                        i25 = i23;
                                                        zzbcVar2 = zzbcVar4;
                                                        if (i39 != i25) {
                                                        }
                                                    } else {
                                                        i9 = i22;
                                                        i24 = i7;
                                                        i25 = i23;
                                                        zzbcVar2 = zzbcVar4;
                                                        i39 = i25;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    break;
                                                case 66:
                                                    zzbcVar4 = zzbcVar3;
                                                    i27 = i22;
                                                    bArr2 = bArr;
                                                    if (i51 == 0) {
                                                        zzh2 = zzbd.zzh(bArr2, i23, zzbcVar4);
                                                        unsafe11.putObject(obj2, j, Integer.valueOf(zzbu.zzb(zzbcVar4.zza)));
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = zzh2;
                                                        i24 = i7;
                                                        i25 = i23;
                                                        i9 = i27;
                                                        zzbcVar2 = zzbcVar4;
                                                        if (i39 != i25) {
                                                        }
                                                    } else {
                                                        i24 = i7;
                                                        i25 = i23;
                                                        i9 = i27;
                                                        zzbcVar2 = zzbcVar4;
                                                        i39 = i25;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    break;
                                                case 67:
                                                    zzbcVar4 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    if (i51 == 0) {
                                                        zzh2 = zzbd.zzk(bArr2, i23, zzbcVar4);
                                                        i27 = i22;
                                                        unsafe11.putObject(obj2, j, Long.valueOf(zzbu.zzc(zzbcVar4.zzb)));
                                                        unsafe11.putInt(obj2, j2, i8);
                                                        i39 = zzh2;
                                                        i24 = i7;
                                                        i25 = i23;
                                                        i9 = i27;
                                                        zzbcVar2 = zzbcVar4;
                                                        if (i39 != i25) {
                                                        }
                                                    } else {
                                                        i24 = i7;
                                                        i9 = i22;
                                                        i25 = i23;
                                                        zzbcVar2 = zzbcVar4;
                                                        i39 = i25;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    break;
                                                case 68:
                                                    if (i51 == 3) {
                                                        Object zzy2 = zzefVar.zzy(obj2, i8, i7);
                                                        int zzl2 = zzbd.zzl(zzy2, zzefVar.zzv(i7), bArr, i23, i2, (i22 & (-8)) | 4, zzbcVar);
                                                        bArr2 = bArr;
                                                        zzbcVar4 = zzbcVar;
                                                        zzefVar.zzG(obj2, i8, i7, zzy2);
                                                        i39 = zzl2;
                                                        i24 = i7;
                                                        i9 = i22;
                                                        i25 = i23;
                                                        zzbcVar2 = zzbcVar4;
                                                        if (i39 != i25) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    i24 = i7;
                                                    i9 = i22;
                                                    i25 = i23;
                                                    zzbcVar2 = zzbcVar3;
                                                    bArr2 = bArr;
                                                    i39 = i25;
                                                    if (i39 != i25) {
                                                    }
                                                    break;
                                            }
                                        } else if (i51 == 2) {
                                            Unsafe unsafe12 = zzb;
                                            Object zzw = zzefVar.zzw(i7);
                                            Object object = unsafe12.getObject(obj2, j);
                                            if (!((zzdw) object).zze()) {
                                                zzdw zzb2 = zzdw.zza().zzb();
                                                zzdx.zza(zzb2, object);
                                                unsafe12.putObject(obj2, j, zzb2);
                                            }
                                            throw null;
                                        }
                                    } else {
                                        long j3 = i52;
                                        Unsafe unsafe13 = zzb;
                                        zzcz zzczVar = (zzcz) unsafe13.getObject(obj2, j);
                                        if (zzczVar.zzc()) {
                                            i28 = zzr;
                                        } else {
                                            int size = zzczVar.size();
                                            if (size == 0) {
                                                i28 = zzr;
                                                i36 = 10;
                                            } else {
                                                int i76 = size + size;
                                                i28 = zzr;
                                                i36 = i76;
                                            }
                                            zzczVar = zzczVar.zzd(i36);
                                            unsafe13.putObject(obj2, j, zzczVar);
                                        }
                                        switch (i28) {
                                            case 18:
                                            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                                                i8 = i49;
                                                i29 = i54;
                                                i30 = i23;
                                                if (i51 != 2) {
                                                    if (i51 == 1) {
                                                        i31 = i30 + 8;
                                                        zzca zzcaVar = (zzca) zzczVar;
                                                        zzcaVar.zzf(Double.longBitsToDouble(zzbd.zzn(bArr, i30)));
                                                        while (i31 < i2) {
                                                            int zzh4 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                            if (i29 == zzbcVar3.zza) {
                                                                zzcaVar.zzf(Double.longBitsToDouble(zzbd.zzn(bArr, zzh4)));
                                                                i31 = zzh4 + 8;
                                                            }
                                                        }
                                                    }
                                                    i23 = i30;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                        i4 = i3;
                                                        zzbcVar2 = zzbcVar3;
                                                        i9 = i29;
                                                        i44 = i21;
                                                        bArr2 = bArr;
                                                        break;
                                                    } else {
                                                        bArr3 = bArr;
                                                        obj6 = obj2;
                                                        i41 = i7;
                                                        i40 = i8;
                                                        i43 = i6;
                                                        i44 = i21;
                                                        unsafe5 = unsafe;
                                                        i38 = 0;
                                                        i37 = i2;
                                                        zzbcVar5 = zzbcVar3;
                                                        i42 = i29;
                                                        break;
                                                    }
                                                } else {
                                                    zzca zzcaVar2 = (zzca) zzczVar;
                                                    i31 = zzbd.zzh(bArr, i30, zzbcVar3);
                                                    int i77 = zzbcVar3.zza + i31;
                                                    while (i31 < i77) {
                                                        zzcaVar2.zzf(Double.longBitsToDouble(zzbd.zzn(bArr, i31)));
                                                        i31 += 8;
                                                    }
                                                    if (i31 != i77) {
                                                        throw zzdc.zzg();
                                                    }
                                                }
                                                i23 = i30;
                                                i39 = i31;
                                                if (i39 == i23) {
                                                }
                                            case 19:
                                            case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                                                i8 = i49;
                                                i29 = i54;
                                                i30 = i23;
                                                if (i51 == 2) {
                                                    zzck zzckVar = (zzck) zzczVar;
                                                    i31 = zzbd.zzh(bArr, i30, zzbcVar3);
                                                    int i78 = zzbcVar3.zza + i31;
                                                    while (i31 < i78) {
                                                        zzckVar.zzf(Float.intBitsToFloat(zzbd.zzb(bArr, i31)));
                                                        i31 += 4;
                                                    }
                                                    if (i31 != i78) {
                                                        throw zzdc.zzg();
                                                    }
                                                } else {
                                                    if (i51 == 5) {
                                                        i31 = i30 + 4;
                                                        zzck zzckVar2 = (zzck) zzczVar;
                                                        zzckVar2.zzf(Float.intBitsToFloat(zzbd.zzb(bArr, i30)));
                                                        while (i31 < i2) {
                                                            int zzh5 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                            if (i29 == zzbcVar3.zza) {
                                                                zzckVar2.zzf(Float.intBitsToFloat(zzbd.zzb(bArr, zzh5)));
                                                                i31 = zzh5 + 4;
                                                            }
                                                        }
                                                    }
                                                    i23 = i30;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                i23 = i30;
                                                i39 = i31;
                                                if (i39 == i23) {
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                                            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                                                i8 = i49;
                                                i29 = i54;
                                                i30 = i23;
                                                if (i51 == 2) {
                                                    zzdr zzdrVar = (zzdr) zzczVar;
                                                    i31 = zzbd.zzh(bArr, i30, zzbcVar3);
                                                    int i79 = zzbcVar3.zza + i31;
                                                    while (i31 < i79) {
                                                        i31 = zzbd.zzk(bArr, i31, zzbcVar3);
                                                        zzdrVar.zzf(zzbcVar3.zzb);
                                                    }
                                                    if (i31 != i79) {
                                                        throw zzdc.zzg();
                                                    }
                                                } else {
                                                    if (i51 == 0) {
                                                        zzdr zzdrVar2 = (zzdr) zzczVar;
                                                        i31 = zzbd.zzk(bArr, i30, zzbcVar3);
                                                        zzdrVar2.zzf(zzbcVar3.zzb);
                                                        while (i31 < i2) {
                                                            int zzh6 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                            if (i29 == zzbcVar3.zza) {
                                                                i31 = zzbd.zzk(bArr, zzh6, zzbcVar3);
                                                                zzdrVar2.zzf(zzbcVar3.zzb);
                                                            }
                                                        }
                                                    }
                                                    i23 = i30;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                i23 = i30;
                                                i39 = i31;
                                                if (i39 == i23) {
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                                                i8 = i49;
                                                if (i51 == 2) {
                                                    i31 = zzbd.zzf(bArr, i23, zzczVar, zzbcVar3);
                                                    i29 = i54;
                                                    i39 = i31;
                                                    if (i39 == i23) {
                                                    }
                                                } else {
                                                    if (i51 == 0) {
                                                        i29 = i54;
                                                        i39 = zzbd.zzj(i54, bArr, i23, i2, zzczVar, zzbcVar3);
                                                        if (i39 == i23) {
                                                        }
                                                    }
                                                    i29 = i54;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                                                i8 = i49;
                                                if (i51 == 2) {
                                                    zzdr zzdrVar3 = (zzdr) zzczVar;
                                                    i31 = zzbd.zzh(bArr, i23, zzbcVar3);
                                                    int i80 = zzbcVar3.zza + i31;
                                                    while (i31 < i80) {
                                                        zzdrVar3.zzf(zzbd.zzn(bArr, i31));
                                                        i31 += 8;
                                                    }
                                                    if (i31 != i80) {
                                                        throw zzdc.zzg();
                                                    }
                                                } else {
                                                    if (i51 == 1) {
                                                        i31 = i23 + 8;
                                                        zzdr zzdrVar4 = (zzdr) zzczVar;
                                                        zzdrVar4.zzf(zzbd.zzn(bArr, i23));
                                                        while (i31 < i2) {
                                                            int zzh7 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                            if (i54 == zzbcVar3.zza) {
                                                                zzdrVar4.zzf(zzbd.zzn(bArr, zzh7));
                                                                i31 = zzh7 + 8;
                                                            }
                                                        }
                                                    }
                                                    i29 = i54;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                i29 = i54;
                                                i39 = i31;
                                                if (i39 == i23) {
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                                            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                                                i8 = i49;
                                                if (i51 == 2) {
                                                    zzct zzctVar = (zzct) zzczVar;
                                                    i31 = zzbd.zzh(bArr, i23, zzbcVar3);
                                                    int i81 = zzbcVar3.zza + i31;
                                                    while (i31 < i81) {
                                                        zzctVar.zzg(zzbd.zzb(bArr, i31));
                                                        i31 += 4;
                                                    }
                                                    if (i31 != i81) {
                                                        throw zzdc.zzg();
                                                    }
                                                } else {
                                                    if (i51 == 5) {
                                                        i31 = i23 + 4;
                                                        zzct zzctVar2 = (zzct) zzczVar;
                                                        zzctVar2.zzg(zzbd.zzb(bArr, i23));
                                                        while (i31 < i2) {
                                                            int zzh8 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                            if (i54 == zzbcVar3.zza) {
                                                                zzctVar2.zzg(zzbd.zzb(bArr, zzh8));
                                                                i31 = zzh8 + 4;
                                                            }
                                                        }
                                                    }
                                                    i29 = i54;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                i29 = i54;
                                                i39 = i31;
                                                if (i39 == i23) {
                                                }
                                                break;
                                            case 25:
                                            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                                                if (i51 == 2) {
                                                    zzbe zzbeVar = (zzbe) zzczVar;
                                                    i31 = zzbd.zzh(bArr, i23, zzbcVar3);
                                                    int i82 = zzbcVar3.zza + i31;
                                                    while (i31 < i82) {
                                                        i31 = zzbd.zzk(bArr, i31, zzbcVar3);
                                                        int i83 = i49;
                                                        zzbeVar.zze(zzbcVar3.zzb != 0);
                                                        i49 = i83;
                                                    }
                                                    i8 = i49;
                                                    if (i31 != i82) {
                                                        throw zzdc.zzg();
                                                    }
                                                } else {
                                                    i8 = i49;
                                                    if (i51 == 0) {
                                                        zzbe zzbeVar2 = (zzbe) zzczVar;
                                                        i31 = zzbd.zzk(bArr, i23, zzbcVar3);
                                                        zzbeVar2.zze(zzbcVar3.zzb != 0);
                                                        while (i31 < i2) {
                                                            int zzh9 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                            if (i54 == zzbcVar3.zza) {
                                                                i31 = zzbd.zzk(bArr, zzh9, zzbcVar3);
                                                                zzbeVar2.zze(zzbcVar3.zzb != 0);
                                                            }
                                                        }
                                                    }
                                                    i29 = i54;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                i29 = i54;
                                                i39 = i31;
                                                if (i39 == i23) {
                                                }
                                                break;
                                            case MotionEventCompat.AXIS_SCROLL /* 26 */:
                                                if (i51 == 2) {
                                                    if ((j3 & 536870912) == 0) {
                                                        i31 = zzbd.zzh(bArr, i23, zzbcVar3);
                                                        int i84 = zzbcVar3.zza;
                                                        if (i84 < 0) {
                                                            throw zzdc.zzd();
                                                        }
                                                        if (i84 == 0) {
                                                            zzczVar.add("");
                                                        } else {
                                                            zzczVar.add(new String(bArr, i31, i84, zzda.zzb));
                                                            i31 += i84;
                                                        }
                                                        while (i31 < i2) {
                                                            int zzh10 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                            if (i54 == zzbcVar3.zza) {
                                                                i31 = zzbd.zzh(bArr, zzh10, zzbcVar3);
                                                                int i85 = zzbcVar3.zza;
                                                                if (i85 < 0) {
                                                                    throw zzdc.zzd();
                                                                }
                                                                if (i85 == 0) {
                                                                    zzczVar.add("");
                                                                } else {
                                                                    zzczVar.add(new String(bArr, i31, i85, zzda.zzb));
                                                                    i31 += i85;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i31 = zzbd.zzh(bArr, i23, zzbcVar3);
                                                        int i86 = zzbcVar3.zza;
                                                        if (i86 < 0) {
                                                            throw zzdc.zzd();
                                                        }
                                                        if (i86 == 0) {
                                                            zzczVar.add("");
                                                        } else {
                                                            int i87 = i31 + i86;
                                                            if (!zzfu.zze(bArr, i31, i87)) {
                                                                throw zzdc.zzc();
                                                            }
                                                            zzczVar.add(new String(bArr, i31, i86, zzda.zzb));
                                                            i31 = i87;
                                                        }
                                                        while (i31 < i2) {
                                                            int zzh11 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                            if (i54 == zzbcVar3.zza) {
                                                                i31 = zzbd.zzh(bArr, zzh11, zzbcVar3);
                                                                int i88 = zzbcVar3.zza;
                                                                if (i88 < 0) {
                                                                    throw zzdc.zzd();
                                                                }
                                                                if (i88 == 0) {
                                                                    zzczVar.add("");
                                                                } else {
                                                                    int i89 = i31 + i88;
                                                                    if (!zzfu.zze(bArr, i31, i89)) {
                                                                        throw zzdc.zzc();
                                                                    }
                                                                    zzczVar.add(new String(bArr, i31, i88, zzda.zzb));
                                                                    i31 = i89;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i29 = i54;
                                                    i8 = i49;
                                                    i39 = i31;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                i29 = i54;
                                                i8 = i49;
                                                i39 = i23;
                                                if (i39 == i23) {
                                                }
                                                break;
                                            case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                                                if (i51 == 2) {
                                                    zzefVar = this;
                                                    i7 = i7;
                                                    i31 = zzbd.zze(zzefVar.zzv(i7), i54, bArr, i23, i2, zzczVar, zzbcVar3);
                                                    i23 = i23;
                                                    i29 = i54;
                                                    zzbcVar3 = zzbcVar3;
                                                    i8 = i49;
                                                    i39 = i31;
                                                    if (i39 == i23) {
                                                    }
                                                } else {
                                                    zzefVar = this;
                                                    i7 = i7;
                                                    i29 = i54;
                                                    i23 = i23;
                                                    i8 = i49;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                break;
                                            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                                                if (i51 == 2) {
                                                    int zzh12 = zzbd.zzh(bArr, i23, zzbcVar3);
                                                    int i90 = zzbcVar3.zza;
                                                    if (i90 < 0) {
                                                        throw zzdc.zzd();
                                                    }
                                                    if (i90 > bArr.length - zzh12) {
                                                        throw zzdc.zzg();
                                                    }
                                                    if (i90 == 0) {
                                                        zzczVar.add(zzbq.zzb);
                                                    } else {
                                                        zzczVar.add(zzbq.zzl(bArr, zzh12, i90));
                                                        zzh12 += i90;
                                                    }
                                                    while (zzh12 < i2) {
                                                        int zzh13 = zzbd.zzh(bArr, zzh12, zzbcVar3);
                                                        if (i54 == zzbcVar3.zza) {
                                                            zzh12 = zzbd.zzh(bArr, zzh13, zzbcVar3);
                                                            int i91 = zzbcVar3.zza;
                                                            if (i91 < 0) {
                                                                throw zzdc.zzd();
                                                            }
                                                            if (i91 > bArr.length - zzh12) {
                                                                throw zzdc.zzg();
                                                            }
                                                            if (i91 == 0) {
                                                                zzczVar.add(zzbq.zzb);
                                                            } else {
                                                                zzczVar.add(zzbq.zzl(bArr, zzh12, i91));
                                                                zzh12 += i91;
                                                            }
                                                        } else {
                                                            i29 = i54;
                                                            i23 = i23;
                                                            i8 = i49;
                                                            i7 = i7;
                                                            i39 = zzh12;
                                                            zzefVar = this;
                                                            if (i39 == i23) {
                                                            }
                                                        }
                                                    }
                                                    i29 = i54;
                                                    i23 = i23;
                                                    i8 = i49;
                                                    i7 = i7;
                                                    i39 = zzh12;
                                                    zzefVar = this;
                                                    if (i39 == i23) {
                                                    }
                                                } else {
                                                    zzefVar = this;
                                                    i29 = i54;
                                                    i23 = i23;
                                                    i8 = i49;
                                                    i7 = i7;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                break;
                                            case 30:
                                            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                                                if (i51 == 2) {
                                                    zzj = zzbd.zzf(bArr, i23, zzczVar, zzbcVar3);
                                                    i32 = i54;
                                                    i33 = i23;
                                                } else if (i51 == 0) {
                                                    i32 = i54;
                                                    i33 = i23;
                                                    zzj = zzbd.zzj(i32, bArr, i33, i2, zzczVar, zzbcVar3);
                                                } else {
                                                    zzefVar = this;
                                                    i29 = i54;
                                                    i8 = i49;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                zzcw zzu3 = zzefVar.zzu(i7);
                                                zzff zzffVar = zzefVar.zzm;
                                                int i92 = zzeq.zza;
                                                if (zzu3 == null) {
                                                    i34 = zzj;
                                                    i35 = i7;
                                                } else if (zzczVar instanceof RandomAccess) {
                                                    int size2 = zzczVar.size();
                                                    i34 = zzj;
                                                    Object obj13 = null;
                                                    int i93 = 0;
                                                    int i94 = 0;
                                                    while (i93 < size2) {
                                                        Integer num = (Integer) zzczVar.get(i93);
                                                        int i95 = i7;
                                                        int intValue = num.intValue();
                                                        if (zzu3.zza(intValue)) {
                                                            if (i93 != i94) {
                                                                zzczVar.set(i94, num);
                                                            }
                                                            i94++;
                                                        } else {
                                                            obj13 = zzeq.zzo(obj2, i49, intValue, obj13, zzffVar);
                                                        }
                                                        i93++;
                                                        i7 = i95;
                                                    }
                                                    i35 = i7;
                                                    if (i94 != size2) {
                                                        zzczVar.subList(i94, size2).clear();
                                                    }
                                                } else {
                                                    i34 = zzj;
                                                    i35 = i7;
                                                    Iterator it = zzczVar.iterator();
                                                    Object obj14 = null;
                                                    while (it.hasNext()) {
                                                        int intValue2 = ((Integer) it.next()).intValue();
                                                        if (!zzu3.zza(intValue2)) {
                                                            obj14 = zzeq.zzo(obj2, i49, intValue2, obj14, zzffVar);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                                zzefVar = this;
                                                i29 = i32;
                                                i23 = i33;
                                                i8 = i49;
                                                i7 = i35;
                                                i39 = i34;
                                                if (i39 == i23) {
                                                }
                                                break;
                                            case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                if (i51 == 2) {
                                                    zzct zzctVar3 = (zzct) zzczVar;
                                                    i31 = zzbd.zzh(bArr, i23, zzbcVar3);
                                                    int i96 = zzbcVar3.zza + i31;
                                                    while (i31 < i96) {
                                                        i31 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                        zzctVar3.zzg(zzbu.zzb(zzbcVar3.zza));
                                                    }
                                                    if (i31 != i96) {
                                                        throw zzdc.zzg();
                                                    }
                                                } else {
                                                    if (i51 == 0) {
                                                        zzct zzctVar4 = (zzct) zzczVar;
                                                        i31 = zzbd.zzh(bArr, i23, zzbcVar3);
                                                        zzctVar4.zzg(zzbu.zzb(zzbcVar3.zza));
                                                        while (i31 < i2) {
                                                            int zzh14 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                            if (i54 == zzbcVar3.zza) {
                                                                i31 = zzbd.zzh(bArr, zzh14, zzbcVar3);
                                                                zzctVar4.zzg(zzbu.zzb(zzbcVar3.zza));
                                                            }
                                                        }
                                                    }
                                                    i29 = i54;
                                                    i8 = i49;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                i29 = i54;
                                                i8 = i49;
                                                i39 = i31;
                                                if (i39 == i23) {
                                                }
                                                break;
                                            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                                            case 48:
                                                if (i51 == 2) {
                                                    zzdr zzdrVar5 = (zzdr) zzczVar;
                                                    i31 = zzbd.zzh(bArr, i23, zzbcVar3);
                                                    int i97 = zzbcVar3.zza + i31;
                                                    while (i31 < i97) {
                                                        i31 = zzbd.zzk(bArr, i31, zzbcVar3);
                                                        zzdrVar5.zzf(zzbu.zzc(zzbcVar3.zzb));
                                                    }
                                                    if (i31 != i97) {
                                                        throw zzdc.zzg();
                                                    }
                                                } else {
                                                    if (i51 == 0) {
                                                        zzdr zzdrVar6 = (zzdr) zzczVar;
                                                        i31 = zzbd.zzk(bArr, i23, zzbcVar3);
                                                        zzdrVar6.zzf(zzbu.zzc(zzbcVar3.zzb));
                                                        while (i31 < i2) {
                                                            int zzh15 = zzbd.zzh(bArr, i31, zzbcVar3);
                                                            if (i54 == zzbcVar3.zza) {
                                                                i31 = zzbd.zzk(bArr, zzh15, zzbcVar3);
                                                                zzdrVar6.zzf(zzbu.zzc(zzbcVar3.zzb));
                                                            }
                                                        }
                                                    }
                                                    i29 = i54;
                                                    i8 = i49;
                                                    i39 = i23;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                i29 = i54;
                                                i8 = i49;
                                                i39 = i31;
                                                if (i39 == i23) {
                                                }
                                                break;
                                            default:
                                                byte[] bArr9 = bArr;
                                                int i98 = i2;
                                                i8 = i49;
                                                i29 = i54;
                                                i30 = i23;
                                                if (i51 == 3) {
                                                    int i99 = (i29 & (-8)) | 4;
                                                    zzeo zzv = zzefVar.zzv(i7);
                                                    int zzc = zzbd.zzc(zzv, bArr9, i30, i98, i99, zzbcVar3);
                                                    i23 = i30;
                                                    zzczVar.add(zzbcVar3.zzc);
                                                    while (zzc < i98) {
                                                        int zzh16 = zzbd.zzh(bArr9, zzc, zzbcVar3);
                                                        if (i29 == zzbcVar3.zza) {
                                                            zzc = zzbd.zzc(zzv, bArr9, zzh16, i98, i99, zzbcVar3);
                                                            zzczVar.add(zzbcVar3.zzc);
                                                            bArr9 = bArr;
                                                            i98 = i2;
                                                        } else {
                                                            i39 = zzc;
                                                            if (i39 == i23) {
                                                            }
                                                        }
                                                    }
                                                    i39 = zzc;
                                                    if (i39 == i23) {
                                                    }
                                                }
                                                i23 = i30;
                                                i39 = i23;
                                                if (i39 == i23) {
                                                }
                                                break;
                                        }
                                    }
                                } else if (i51 == 2) {
                                    zzcz zzczVar2 = (zzcz) unsafe10.getObject(obj2, j);
                                    if (!zzczVar2.zzc()) {
                                        int size3 = zzczVar2.size();
                                        zzczVar2 = zzczVar2.zzd(size3 == 0 ? 10 : size3 + size3);
                                        unsafe10.putObject(obj2, j, zzczVar2);
                                    }
                                    int zze = zzbd.zze(zzefVar.zzv(i7), i54, bArr, i39, i2, zzczVar2, zzbcVar);
                                    bArr3 = bArr;
                                    i42 = i54;
                                    obj6 = obj2;
                                    i41 = i7;
                                    i40 = i49;
                                    i38 = 0;
                                    i37 = i2;
                                    i39 = zze;
                                    unsafe5 = unsafe10;
                                    zzbcVar5 = zzbcVar;
                                } else {
                                    zzbcVar3 = zzbcVar;
                                    unsafe = unsafe10;
                                    i8 = i49;
                                    i6 = i43;
                                    i21 = i44;
                                    i22 = i54;
                                    i23 = i39;
                                }
                                i4 = i3;
                                i9 = i22;
                                i39 = i23;
                                i44 = i21;
                                zzbcVar2 = zzbcVar3;
                                bArr2 = bArr;
                            }
                        }
                        if (i9 == i4 || i4 == 0) {
                            if (zzefVar.zzh || zzbcVar2.zzd == zzcd.zza) {
                                i10 = i9;
                                i11 = i2;
                                i39 = zzbd.zzg(i10, bArr, i39, i11, zzd(obj2), zzbcVar);
                            } else {
                                if (zzbcVar2.zzd.zzb(zzefVar.zzg, i8) != null) {
                                    throw null;
                                }
                                i11 = i2;
                                i10 = i9;
                                i39 = zzbd.zzg(i10, bArr2, i39, i11, zzd(obj2), zzbcVar2);
                            }
                            bArr3 = bArr;
                            i42 = i10;
                            obj6 = obj2;
                            i41 = i7;
                            i43 = i6;
                            unsafe5 = unsafe;
                            i38 = 0;
                            i37 = i11;
                            i40 = i8;
                            zzbcVar5 = zzbcVar;
                        } else {
                            i5 = i2;
                            i42 = i9;
                            i43 = i6;
                        }
                    }
                    zzq = -1;
                    if (zzq != -1) {
                    }
                    if (i9 == i4) {
                    }
                    if (zzefVar.zzh) {
                    }
                    i10 = i9;
                    i11 = i2;
                    i39 = zzbd.zzg(i10, bArr, i39, i11, zzd(obj2), zzbcVar);
                    bArr3 = bArr;
                    i42 = i10;
                    obj6 = obj2;
                    i41 = i7;
                    i43 = i6;
                    unsafe5 = unsafe;
                    i38 = 0;
                    i37 = i11;
                    i40 = i8;
                    zzbcVar5 = zzbcVar;
                } else {
                    if (i49 >= zzefVar.zze && i49 <= zzefVar.zzf) {
                        zzq = zzefVar.zzq(i49, i38);
                        if (zzq != -1) {
                        }
                        if (i9 == i4) {
                        }
                        if (zzefVar.zzh) {
                        }
                        i10 = i9;
                        i11 = i2;
                        i39 = zzbd.zzg(i10, bArr, i39, i11, zzd(obj2), zzbcVar);
                        bArr3 = bArr;
                        i42 = i10;
                        obj6 = obj2;
                        i41 = i7;
                        i43 = i6;
                        unsafe5 = unsafe;
                        i38 = 0;
                        i37 = i11;
                        i40 = i8;
                        zzbcVar5 = zzbcVar;
                    }
                    zzq = -1;
                    if (zzq != -1) {
                    }
                    if (i9 == i4) {
                    }
                    if (zzefVar.zzh) {
                    }
                    i10 = i9;
                    i11 = i2;
                    i39 = zzbd.zzg(i10, bArr, i39, i11, zzd(obj2), zzbcVar);
                    bArr3 = bArr;
                    i42 = i10;
                    obj6 = obj2;
                    i41 = i7;
                    i43 = i6;
                    unsafe5 = unsafe;
                    i38 = 0;
                    i37 = i11;
                    i40 = i8;
                    zzbcVar5 = zzbcVar;
                }
            } else {
                i4 = i3;
                unsafe = unsafe5;
                i5 = i37;
                obj2 = obj6;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzcs) {
                zzcs zzcsVar = (zzcs) obj;
                zzcsVar.zzu(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzcsVar.zza = 0;
                zzcsVar.zzs();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
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
                            case MotionEventCompat.AXIS_SCROLL /* 26 */:
                            case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                            case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            case 48:
                            case 49:
                                this.zzl.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzdw) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzd(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzfp.zzo(obj, j, zzfp.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzfp.zzp(obj, j, zzfp.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzfp.zzm(obj, j, zzfp.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                case 29:
                case 30:
                case 31:
                case 32:
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzeq.zza;
                    zzfp.zzs(obj, j, zzdx.zza(zzfp.zzf(obj, j), zzfp.zzf(obj2, j)));
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
                    if (zzM(obj2, i3, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzeq.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzeq.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzbc zzbcVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzbcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzfx zzfxVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        zzef<T> zzefVar = this;
        if (zzefVar.zzh) {
            zzci zzb2 = zzefVar.zzn.zzb(obj);
            if (!zzb2.zza.isEmpty()) {
                Iterator zzf = zzb2.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = zzefVar.zzc;
                Unsafe unsafe = zzb;
                i = 0;
                int i6 = 1048575;
                int i7 = 0;
                while (i < iArr.length) {
                    int zzs = zzefVar.zzs(i);
                    int[] iArr2 = zzefVar.zzc;
                    int zzr = zzr(zzs);
                    int i8 = iArr2[i];
                    if (zzr <= 17) {
                        int i9 = iArr2[i + 2];
                        int i10 = i9 & 1048575;
                        if (i10 != i6) {
                            i5 = 1;
                            i7 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                            i6 = i10;
                        } else {
                            i5 = 1;
                        }
                        entry2 = entry;
                        i2 = i6;
                        i3 = i7;
                        i4 = i5 << (i9 >>> 20);
                    } else {
                        entry2 = entry;
                        i2 = i6;
                        i3 = i7;
                        i4 = 0;
                    }
                    while (entry2 != null && zzefVar.zzn.zza(entry2) <= i8) {
                        zzefVar.zzn.zze(zzfxVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzs & 1048575;
                    switch (zzr) {
                        case 0:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzf(i8, zzfp.zza(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 1:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzo(i8, zzfp.zzb(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 2:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzt(i8, unsafe.getLong(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 3:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzK(i8, unsafe.getLong(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 4:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzr(i8, unsafe.getInt(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 5:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzm(i8, unsafe.getLong(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 6:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzk(i8, unsafe.getInt(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 7:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzb(i8, zzfp.zzw(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 8:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzO(i8, unsafe.getObject(obj, j), zzfxVar);
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 9:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzv(i8, unsafe.getObject(obj, j), zzefVar.zzv(i));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 10:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzd(i8, (zzbq) unsafe.getObject(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 11:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzI(i8, unsafe.getInt(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 12:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzi(i8, unsafe.getInt(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 13:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzx(i8, unsafe.getInt(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 14:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzz(i8, unsafe.getLong(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 15:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzB(i8, unsafe.getInt(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 16:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzD(i8, unsafe.getLong(obj, j));
                            }
                            zzefVar = this;
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 17:
                            if (zzefVar.zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzq(i8, unsafe.getObject(obj, j), zzefVar.zzv(i));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 18:
                            zzeq.zzt(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 19:
                            zzeq.zzx(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 20:
                            zzeq.zzz(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 21:
                            zzeq.zzF(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 22:
                            zzeq.zzy(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 23:
                            zzeq.zzw(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 24:
                            zzeq.zzv(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 25:
                            zzeq.zzs(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_SCROLL /* 26 */:
                            int i11 = zzefVar.zzc[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i12 = zzeq.zza;
                            if (list != null && !list.isEmpty()) {
                                zzfxVar.zzH(i11, list);
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                            break;
                        case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                            int i13 = zzefVar.zzc[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzeo zzv = zzefVar.zzv(i);
                            int i14 = zzeq.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((zzbz) zzfxVar).zzv(i13, list2.get(i15), zzv);
                                }
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                            break;
                        case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                            int i16 = zzefVar.zzc[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i17 = zzeq.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzfxVar.zze(i16, list3);
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                            break;
                        case 29:
                            zzeq.zzE(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 30:
                            zzeq.zzu(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 31:
                            zzeq.zzA(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 32:
                            zzeq.zzB(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                            zzeq.zzC(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                            zzeq.zzD(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                            zzeq.zzt(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                            zzeq.zzx(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                            zzeq.zzz(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            zzeq.zzF(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                            zzeq.zzy(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                            zzeq.zzw(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                            zzeq.zzv(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            zzeq.zzs(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            zzeq.zzE(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                            zzeq.zzu(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                            zzeq.zzA(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            zzeq.zzB(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            zzeq.zzC(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 48:
                            zzeq.zzD(zzefVar.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 49:
                            int i18 = zzefVar.zzc[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzeo zzv2 = zzefVar.zzv(i);
                            int i19 = zzeq.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((zzbz) zzfxVar).zzq(i18, list4.get(i20), zzv2);
                                }
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 51:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzf(i8, zzm(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 52:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzo(i8, zzn(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 53:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzt(i8, zzt(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 54:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzK(i8, zzt(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 55:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzr(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 56:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzm(i8, zzt(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 57:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzk(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 58:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzb(i8, zzN(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 59:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzO(i8, unsafe.getObject(obj, j), zzfxVar);
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 60:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzv(i8, unsafe.getObject(obj, j), zzefVar.zzv(i));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 61:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzd(i8, (zzbq) unsafe.getObject(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 62:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzI(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzi(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 64:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzx(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 65:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzz(i8, zzt(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 66:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzB(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 67:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzD(i8, zzt(obj, j));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        case 68:
                            if (zzefVar.zzM(obj, i8, i)) {
                                zzfxVar.zzq(i8, unsafe.getObject(obj, j), zzefVar.zzv(i));
                            }
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                        default:
                            i += 3;
                            i7 = i3;
                            i6 = i2;
                            entry = entry2;
                    }
                }
                while (entry != null) {
                    zzefVar.zzn.zze(zzfxVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zzff zzffVar = zzefVar.zzm;
                zzffVar.zzj(zzffVar.zzd(obj), zzfxVar);
            }
        }
        entry = null;
        it = null;
        iArr = zzefVar.zzc;
        Unsafe unsafe2 = zzb;
        i = 0;
        int i62 = 1048575;
        int i72 = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        zzff zzffVar2 = zzefVar.zzm;
        zzffVar2.zzj(zzffVar2.zzd(obj), zzfxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzfp.zza(obj, j)) == Double.doubleToLongBits(zzfp.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzfp.zzb(obj, j)) == Float.floatToIntBits(zzfp.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzfp.zzw(obj, j) == zzfp.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                case 29:
                case 30:
                case 31:
                case 32:
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    zzG = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
                    break;
                case 50:
                    zzG = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
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
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzp = zzp(i) & 1048575;
                    if (zzfp.zzc(obj, zzp) == zzfp.zzc(obj2, zzp) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzG) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr2[i6];
            int zzs = zzs(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i4) {
                if (i9 != 1048575) {
                    i5 = zzb.getInt(obj, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i4;
                i2 = i5;
            }
            Object obj2 = obj;
            if ((268435456 & zzs) != 0 && !zzJ(obj2, i6, i, i2, i10)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj2, i7, i6) && !zzK(obj2, zzs, zzv(i6))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzdw) zzfp.zzf(obj2, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzfp.zzf(obj2, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzeo zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj2, i6, i, i2, i10) && !zzK(obj2, zzs, zzv(i6))) {
                return false;
            }
            i3++;
            obj = obj2;
            i4 = i;
            i5 = i2;
        }
        return !this.zzh || this.zzn.zzb(obj).zzj();
    }
}
