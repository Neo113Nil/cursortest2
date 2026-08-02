package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzhbh<T> implements zzhby<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhcz.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhbe zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhas zzm;
    private final zzhcp zzn;
    private final zzgzg zzo;
    private final zzhbj zzp;
    private final zzhaz zzq;

    private zzhbh(int[] iArr, Object[] objArr, int i, int i2, zzhbe zzhbeVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzhbj zzhbjVar, zzhas zzhasVar, zzhcp zzhcpVar, zzgzg zzgzgVar, zzhaz zzhazVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzhbeVar instanceof zzgzu;
        boolean z2 = false;
        if (zzgzgVar != null && zzgzgVar.zzh(zzhbeVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzhbjVar;
        this.zzm = zzhasVar;
        this.zzn = zzhcpVar;
        this.zzo = zzgzgVar;
        this.zzg = zzhbeVar;
        this.zzq = zzhazVar;
    }

    private final Object zzA(Object obj, int i) {
        zzhby zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzhby zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhby zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhby zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzhbq zzhbqVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzhcz.zzv(obj, j, zzhbqVar.zzs());
        } else if (this.zzi) {
            zzhcz.zzv(obj, j, zzhbqVar.zzr());
        } else {
            zzhcz.zzv(obj, j, zzhbqVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzhcz.zzt(obj, j, (1 << (zzr >>> 20)) | zzhcz.zzd(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzhcz.zzt(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzhcz.zzd(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i);
        long j2 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhcz.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhcz.zzc(obj, j2)) != 0;
            case 2:
                return zzhcz.zzf(obj, j2) != 0;
            case 3:
                return zzhcz.zzf(obj, j2) != 0;
            case 4:
                return zzhcz.zzd(obj, j2) != 0;
            case 5:
                return zzhcz.zzf(obj, j2) != 0;
            case 6:
                return zzhcz.zzd(obj, j2) != 0;
            case 7:
                return zzhcz.zzz(obj, j2);
            case 8:
                Object zzh = zzhcz.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                }
                if (zzh instanceof zzgyl) {
                    return !zzgyl.zzb.equals(zzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhcz.zzh(obj, j2) != null;
            case 10:
                return !zzgyl.zzb.equals(zzhcz.zzh(obj, j2));
            case 11:
                return zzhcz.zzd(obj, j2) != 0;
            case 12:
                return zzhcz.zzd(obj, j2) != 0;
            case 13:
                return zzhcz.zzd(obj, j2) != 0;
            case 14:
                return zzhcz.zzf(obj, j2) != 0;
            case 15:
                return zzhcz.zzd(obj, j2) != 0;
            case 16:
                return zzhcz.zzf(obj, j2) != 0;
            case 17:
                return zzhcz.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzhby zzhbyVar) {
        return zzhbyVar.zzk(zzhcz.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgzu) {
            return ((zzgzu) obj).zzaY();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzhcz.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzhcz.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzgzb zzgzbVar) throws IOException {
        if (obj instanceof String) {
            zzgzbVar.zzF(i, (String) obj);
        } else {
            zzgzbVar.zzd(i, (zzgyl) obj);
        }
    }

    static zzhcq zzd(Object obj) {
        zzgzu zzgzuVar = (zzgzu) obj;
        zzhcq zzhcqVar = zzgzuVar.zzc;
        if (zzhcqVar != zzhcq.zzc()) {
            return zzhcqVar;
        }
        zzhcq zzf = zzhcq.zzf();
        zzgzuVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzhbh zzl(Class cls, zzhbb zzhbbVar, zzhbj zzhbjVar, zzhas zzhasVar, zzhcp zzhcpVar, zzgzg zzgzgVar, zzhaz zzhazVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int[] iArr;
        int i3;
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
        int i18;
        zzhbp zzhbpVar;
        int i19;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zzC;
        char charAt11;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        if (!(zzhbbVar instanceof zzhbp)) {
            throw null;
        }
        zzhbp zzhbpVar2 = (zzhbp) zzhbbVar;
        String zzd = zzhbpVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (zzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i34 = charAt16 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                charAt15 = zzd.charAt(i33);
                if (charAt15 < 55296) {
                    break;
                }
                i34 |= (charAt15 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            charAt16 = i34 | (charAt15 << i35);
            i33 = i31;
        }
        if (charAt16 == 0) {
            charAt = 0;
            charAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
            iArr = zza;
            i5 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt17 = zzd.charAt(i33);
            if (charAt17 >= 55296) {
                int i37 = charAt17 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    charAt10 = zzd.charAt(i36);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i37 |= (charAt10 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                charAt17 = i37 | (charAt10 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int charAt18 = zzd.charAt(i36);
            if (charAt18 >= 55296) {
                int i40 = charAt18 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    charAt9 = zzd.charAt(i39);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i40 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                charAt18 = i40 | (charAt9 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int charAt19 = zzd.charAt(i39);
            if (charAt19 >= 55296) {
                int i43 = charAt19 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    charAt8 = zzd.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                charAt19 = i43 | (charAt8 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int charAt20 = zzd.charAt(i42);
            if (charAt20 >= 55296) {
                int i46 = charAt20 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    charAt7 = zzd.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                charAt20 = i46 | (charAt7 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            charAt = zzd.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    charAt6 = zzd.charAt(i48);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i49 |= (charAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                charAt = i49 | (charAt6 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            charAt2 = zzd.charAt(i48);
            if (charAt2 >= 55296) {
                int i52 = charAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    charAt5 = zzd.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                charAt2 = i52 | (charAt5 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int charAt21 = zzd.charAt(i51);
            if (charAt21 >= 55296) {
                int i55 = charAt21 & 8191;
                int i56 = 13;
                while (true) {
                    i8 = i54 + 1;
                    charAt4 = zzd.charAt(i54);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i8;
                }
                charAt21 = i55 | (charAt4 << i56);
                i54 = i8;
            }
            int i57 = i54 + 1;
            int charAt22 = zzd.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i7 = i57 + 1;
                    charAt3 = zzd.charAt(i57);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i58 |= (charAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i7;
                }
                charAt22 = i58 | (charAt3 << i59);
                i57 = i7;
            }
            i2 = charAt17 + charAt17 + charAt18;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i3 = charAt19;
            i4 = charAt22;
            i5 = charAt17;
            i6 = charAt20;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzhbpVar2.zze();
        Class<?> cls2 = zzhbpVar2.zza().getClass();
        int i60 = i4 + charAt2;
        int i61 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[i61];
        int i62 = 0;
        int i63 = 0;
        int i64 = i4;
        int i65 = i60;
        while (i33 < length) {
            int i66 = i33 + 1;
            int charAt23 = zzd.charAt(i33);
            if (charAt23 >= c) {
                int i67 = charAt23 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i30 = i68 + 1;
                    charAt14 = zzd.charAt(i68);
                    if (charAt14 < c) {
                        break;
                    }
                    i67 |= (charAt14 & 8191) << i69;
                    i69 += 13;
                    i68 = i30;
                }
                charAt23 = i67 | (charAt14 << i69);
                i15 = i30;
            } else {
                i15 = i66;
            }
            int i70 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i71 = charAt24 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i29 = i72 + 1;
                    charAt13 = zzd.charAt(i72);
                    if (charAt13 < c) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i29;
                }
                charAt24 = i71 | (charAt13 << i73);
                i16 = i29;
            } else {
                i16 = i70;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            int i74 = charAt24 & 255;
            int i75 = charAt24 & 2048;
            int i76 = length;
            if (i74 >= 51) {
                int i77 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i78 = 13;
                    int i79 = charAt25 & 8191;
                    int i80 = i77;
                    while (true) {
                        i28 = i80 + 1;
                        charAt12 = zzd.charAt(i80);
                        if (charAt12 < c2) {
                            break;
                        }
                        i79 |= (charAt12 & 8191) << i78;
                        i78 += 13;
                        i80 = i28;
                        c2 = 55296;
                    }
                    charAt25 = i79 | (charAt12 << i78);
                    i26 = i28;
                } else {
                    i26 = i77;
                }
                int i81 = i26;
                int i82 = i74 - 51;
                i18 = i6;
                if (i82 == 9 || i82 == 17) {
                    i27 = i2 + 1;
                    int i83 = i63 / 3;
                    objArr[i83 + i83 + 1] = zze[i2];
                } else {
                    if (i82 == 12) {
                        if (zzhbpVar2.zzc() == 1 || i75 != 0) {
                            i27 = i2 + 1;
                            int i84 = i63 / 3;
                            objArr[i84 + i84 + 1] = zze[i2];
                        } else {
                            i75 = 0;
                        }
                    }
                    int i85 = charAt25 + charAt25;
                    obj = zze[i85];
                    if (obj instanceof Field) {
                        zzC2 = zzC(cls2, (String) obj);
                        zze[i85] = zzC2;
                    } else {
                        zzC2 = (Field) obj;
                    }
                    i17 = i3;
                    i23 = (int) unsafe.objectFieldOffset(zzC2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    if (obj2 instanceof Field) {
                        zzC3 = zzC(cls2, (String) obj2);
                        zze[i86] = zzC3;
                    } else {
                        zzC3 = (Field) obj2;
                    }
                    zzhbpVar = zzhbpVar2;
                    str = zzd;
                    i22 = i2;
                    i20 = i81;
                    i19 = (int) unsafe.objectFieldOffset(zzC3);
                    i21 = 0;
                }
                i2 = i27;
                int i852 = charAt25 + charAt25;
                obj = zze[i852];
                if (obj instanceof Field) {
                }
                i17 = i3;
                i23 = (int) unsafe.objectFieldOffset(zzC2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                if (obj2 instanceof Field) {
                }
                zzhbpVar = zzhbpVar2;
                str = zzd;
                i22 = i2;
                i20 = i81;
                i19 = (int) unsafe.objectFieldOffset(zzC3);
                i21 = 0;
            } else {
                i17 = i3;
                i18 = i6;
                int i87 = i2 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i2]);
                if (i74 == 9 || i74 == 17) {
                    zzhbpVar = zzhbpVar2;
                    int i88 = i63 / 3;
                    objArr[i88 + i88 + 1] = zzC4.getType();
                } else {
                    if (i74 == 27) {
                        zzhbpVar = zzhbpVar2;
                        i24 = 1;
                        i25 = i2 + 2;
                    } else if (i74 == 49) {
                        i25 = i2 + 2;
                        zzhbpVar = zzhbpVar2;
                        i24 = 1;
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        zzhbpVar = zzhbpVar2;
                        if (zzhbpVar2.zzc() == 1 || i75 != 0) {
                            i25 = i2 + 2;
                            int i89 = i63 / 3;
                            objArr[i89 + i89 + 1] = zze[i87];
                            i87 = i25;
                        } else {
                            i75 = 0;
                        }
                    } else {
                        if (i74 == 50) {
                            int i90 = i2 + 2;
                            int i91 = i64 + 1;
                            iArr[i64] = i63;
                            int i92 = i63 / 3;
                            int i93 = i92 + i92;
                            objArr[i93] = zze[i87];
                            if (i75 != 0) {
                                i87 = i2 + 3;
                                objArr[i93 + 1] = zze[i90];
                                i64 = i91;
                            } else {
                                i87 = i90;
                                i64 = i91;
                                i75 = 0;
                            }
                        }
                        zzhbpVar = zzhbpVar2;
                    }
                    int i94 = i63 / 3;
                    objArr[i94 + i94 + i24] = zze[i87];
                    i87 = i25;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i19 = 1048575;
                if ((charAt24 & 4096) == 0 || i74 > 17) {
                    str = zzd;
                    i20 = i16;
                    i21 = 0;
                } else {
                    int i95 = i16 + 1;
                    int charAt26 = zzd.charAt(i16);
                    if (charAt26 >= 55296) {
                        int i96 = charAt26 & 8191;
                        int i97 = 13;
                        while (true) {
                            i20 = i95 + 1;
                            charAt11 = zzd.charAt(i95);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i96 |= (charAt11 & 8191) << i97;
                            i97 += 13;
                            i95 = i20;
                        }
                        charAt26 = i96 | (charAt11 << i97);
                    } else {
                        i20 = i95;
                    }
                    int i98 = i5 + i5 + (charAt26 / 32);
                    Object obj3 = zze[i98];
                    str = zzd;
                    if (obj3 instanceof Field) {
                        zzC = (Field) obj3;
                    } else {
                        zzC = zzC(cls2, (String) obj3);
                        zze[i98] = zzC;
                    }
                    i21 = charAt26 % 32;
                    i19 = (int) unsafe.objectFieldOffset(zzC);
                }
                if (i74 >= 18 && i74 <= 49) {
                    iArr[i65] = objectFieldOffset;
                    i65++;
                }
                i22 = i87;
                i23 = objectFieldOffset;
            }
            int i99 = i63 + 1;
            iArr2[i63] = charAt23;
            int i100 = i63 + 2;
            iArr2[i99] = i23 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i75 != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20);
            i63 += 3;
            iArr2[i100] = (i21 << 20) | i19;
            i2 = i22;
            i33 = i20;
            length = i76;
            zzhbpVar2 = zzhbpVar;
            zzd = str;
            i6 = i18;
            i3 = i17;
            c = 55296;
        }
        zzhbp zzhbpVar3 = zzhbpVar2;
        return new zzhbh(iArr2, objArr, i3, i6, zzhbpVar3.zza(), zzhbpVar3.zzc(), false, iArr, i4, i60, zzhbjVar, zzhasVar, zzhcpVar, zzgzgVar, zzhazVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzhcz.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzhcz.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzhcz.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzhcz.zzh(obj, j)).longValue();
    }

    private final zzgzy zzw(int i) {
        int i2 = i / 3;
        return (zzgzy) this.zzd[i2 + i2 + 1];
    }

    private final zzhby zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhby zzhbyVar = (zzhby) objArr[i3];
        if (zzhbyVar != null) {
            return zzhbyVar;
        }
        zzhby zzb2 = zzhbn.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzhcp zzhcpVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzh = zzhcz.zzh(obj, zzu(i) & 1048575);
        if (zzh == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v109, types: [com.google.android.gms.internal.ads.zzham] */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v178, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v248, types: [int] */
    /* JADX WARN: Type inference failed for: r0v255, types: [int] */
    /* JADX WARN: Type inference failed for: r0v260 */
    /* JADX WARN: Type inference failed for: r0v261 */
    /* JADX WARN: Type inference failed for: r0v262 */
    /* JADX WARN: Type inference failed for: r0v263 */
    /* JADX WARN: Type inference failed for: r0v264 */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v112, types: [int] */
    /* JADX WARN: Type inference failed for: r1v115, types: [int] */
    /* JADX WARN: Type inference failed for: r1v154 */
    /* JADX WARN: Type inference failed for: r1v157 */
    /* JADX WARN: Type inference failed for: r1v158 */
    /* JADX WARN: Type inference failed for: r1v159 */
    /* JADX WARN: Type inference failed for: r1v160 */
    /* JADX WARN: Type inference failed for: r1v72, types: [int] */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [int] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v42, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzhby
    public final int zza(Object obj) {
        int i;
        int i2;
        ?? r5;
        int zzz;
        int zzz2;
        int zzz3;
        int zzA;
        int zzz4;
        int zzz5;
        int zzd;
        int zzz6;
        ?? zzg;
        int size;
        int zzz7;
        int zzy;
        int zzy2;
        ?? r3;
        int zzx;
        ?? r1;
        ?? r0;
        int zze;
        int zzz8;
        int zzz9;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i3 = 1048575;
        ?? r12 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzc.length) {
            int zzu = zzu(i4);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 2];
            int i9 = i8 & i3;
            if (zzt <= 17) {
                if (i9 != i6) {
                    r12 = i9 == i3 ? z : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = i6;
                i2 = r12;
                r5 = 1 << (i8 >>> 20);
            } else {
                i = i6;
                i2 = r12;
                r5 = z;
            }
            int i10 = zzu & i3;
            if (zzt >= zzgzl.DOUBLE_LIST_PACKED.zza()) {
                zzgzl.SINT64_LIST_PACKED.zza();
            }
            long j = i10;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzz = zzgza.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 1:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzz2 = zzgza.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 2:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzA(j2);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 3:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzA(j3);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 4:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzA(j4);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 5:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzz = zzgza.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 6:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzz2 = zzgza.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 7:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzz4 = zzgza.zzz(i7 << 3);
                        r0 = zzz4 + 1;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 8:
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgyl) {
                            zzz5 = zzgza.zzz(i11);
                            zzd = ((zzgyl) object).zzd();
                            zzz6 = zzgza.zzz(zzd);
                            r0 = zzz5 + zzz6 + zzd;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            zzz3 = zzgza.zzz(i11);
                            zzA = zzgza.zzy((String) object);
                            r0 = zzz3 + zzA;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 9:
                    if (zzO(obj, i4, i, i2, r5)) {
                        r0 = zzhca.zzh(i7, unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 10:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzgyl zzgylVar = (zzgyl) unsafe.getObject(obj, j);
                        zzz5 = zzgza.zzz(i7 << 3);
                        zzd = zzgylVar.zzd();
                        zzz6 = zzgza.zzz(zzd);
                        r0 = zzz5 + zzz6 + zzd;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 11:
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i12 = unsafe.getInt(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzz(i12);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 12:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzA(j5);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 13:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzz2 = zzgza.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 14:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzz = zzgza.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 15:
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i13 = unsafe.getInt(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzz((i13 >> 31) ^ (i13 + i13));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 16:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzA((j6 >> 63) ^ (j6 + j6));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 17:
                    if (zzO(obj, i4, i, i2, r5)) {
                        r0 = zzgza.zzw(i7, (zzhbe) unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 18:
                    r0 = zzhca.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 19:
                    r0 = zzhca.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i14 = zzhca.zza;
                    if (list.size() != 0) {
                        zzg = zzhca.zzg(list) + (list.size() * zzgza.zzz(i7 << 3));
                        i5 += zzg;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    zzg = z;
                    i5 += zzg;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i15 = zzhca.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzz3 = zzhca.zzl(list2);
                        zzz7 = zzgza.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zzhca.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzz3 = zzhca.zzf(list3);
                        zzz7 = zzgza.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 23:
                    r0 = zzhca.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 24:
                    r0 = zzhca.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i17 = zzhca.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzgza.zzz(i7 << 3) + 1);
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i18 = zzhca.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzz10 = zzgza.zzz(i7 << 3) * size3;
                        if (r02 instanceof zzham) {
                            ?? r03 = (zzham) r02;
                            zzg = zzz10;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object zzf = r03.zzf(r32);
                                if (zzf instanceof zzgyl) {
                                    int zzd2 = ((zzgyl) zzf).zzd();
                                    zzy2 = zzg + zzgza.zzz(zzd2) + zzd2;
                                } else {
                                    zzy2 = zzg + zzgza.zzy((String) zzf);
                                }
                                zzg = zzy2;
                            }
                        } else {
                            zzg = zzz10;
                            for (?? r33 = z; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zzgyl) {
                                    int zzd3 = ((zzgyl) obj2).zzd();
                                    zzy = zzg + zzgza.zzz(zzd3) + zzd3;
                                } else {
                                    zzy = zzg + zzgza.zzy((String) obj2);
                                }
                                zzg = zzy;
                            }
                        }
                        i5 += zzg;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    zzg = z;
                    i5 += zzg;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 27:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    zzhby zzx2 = zzx(i4);
                    int i19 = zzhca.zza;
                    int size4 = r04.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        r3 = zzgza.zzz(i7 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            Object obj3 = r04.get(r42);
                            if (obj3 instanceof zzhak) {
                                int zza2 = ((zzhak) obj3).zza();
                                zzx = (r3 == true ? 1 : 0) + zzgza.zzz(zza2) + zza2;
                            } else {
                                zzx = (r3 == true ? 1 : 0) + zzgza.zzx((zzhbe) obj3, zzx2);
                            }
                            r3 = zzx;
                        }
                    }
                    i5 += r3;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 28:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    int i20 = zzhca.zza;
                    int size5 = r05.size();
                    if (size5 == 0) {
                        r1 = z;
                    } else {
                        r1 = size5 * zzgza.zzz(i7 << 3);
                        for (?? r2 = z; r2 < r05.size(); r2++) {
                            int zzd4 = ((zzgyl) r05.get(r2)).zzd();
                            r1 += zzgza.zzz(zzd4) + zzd4;
                        }
                    }
                    i5 += r1;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i21 = zzhca.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzz3 = zzhca.zzk(list5);
                        zzz7 = zzgza.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i22 = zzhca.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzz3 = zzhca.zza(list6);
                        zzz7 = zzgza.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    r0 = zzhca.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 32:
                    r0 = zzhca.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i23 = zzhca.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzz3 = zzhca.zzi(list7);
                        zzz7 = zzgza.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i24 = zzhca.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzz3 = zzhca.zzj(list8);
                        zzz7 = zzgza.zzz(i7 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 35:
                    zze = zzhca.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 36:
                    zze = zzhca.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 37:
                    zze = zzhca.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 38:
                    zze = zzhca.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 39:
                    zze = zzhca.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 40:
                    zze = zzhca.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 41:
                    zze = zzhca.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i25 = zzhca.zza;
                    zze = list9.size();
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 43:
                    zze = zzhca.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 44:
                    zze = zzhca.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 45:
                    zze = zzhca.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 46:
                    zze = zzhca.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 47:
                    zze = zzhca.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zze = zzhca.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgza.zzz(i7 << 3);
                        zzz9 = zzgza.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    ?? r06 = (List) unsafe.getObject(obj, j);
                    zzhby zzx3 = zzx(i4);
                    int i26 = zzhca.zza;
                    int size6 = r06.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        ?? r34 = z2;
                        while (r34 < size6) {
                            int zzw = zzgza.zzw(i7, (zzhbe) r06.get(r34), zzx3);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zzw;
                        }
                    }
                    i5 += r4;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 50:
                    zzhay zzhayVar = (zzhay) unsafe.getObject(obj, j);
                    if (zzhayVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzhayVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i7, i4)) {
                        zzz = zzgza.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i7, i4)) {
                        zzz2 = zzgza.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i7, i4)) {
                        long zzv = zzv(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzA(zzv);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i7, i4)) {
                        long zzv2 = zzv(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzA(zzv2);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i7, i4)) {
                        long zzp = zzp(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzA(zzp);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 56:
                    if (zzR(obj, i7, i4)) {
                        zzz = zzgza.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 57:
                    if (zzR(obj, i7, i4)) {
                        zzz2 = zzgza.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 58:
                    if (zzR(obj, i7, i4)) {
                        zzz4 = zzgza.zzz(i7 << 3);
                        r0 = zzz4 + 1;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 59:
                    if (zzR(obj, i7, i4)) {
                        int i27 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgyl) {
                            zzz5 = zzgza.zzz(i27);
                            zzd = ((zzgyl) object2).zzd();
                            zzz6 = zzgza.zzz(zzd);
                            r0 = zzz5 + zzz6 + zzd;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            zzz3 = zzgza.zzz(i27);
                            zzA = zzgza.zzy((String) object2);
                            r0 = zzz3 + zzA;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i7, i4)) {
                        r0 = zzhca.zzh(i7, unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i7, i4)) {
                        zzgyl zzgylVar2 = (zzgyl) unsafe.getObject(obj, j);
                        zzz5 = zzgza.zzz(i7 << 3);
                        zzd = zzgylVar2.zzd();
                        zzz6 = zzgza.zzz(zzd);
                        r0 = zzz5 + zzz6 + zzd;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 62:
                    if (zzR(obj, i7, i4)) {
                        int zzp2 = zzp(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzz(zzp2);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i7, i4)) {
                        long zzp3 = zzp(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzA(zzp3);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 64:
                    if (zzR(obj, i7, i4)) {
                        zzz2 = zzgza.zzz(i7 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i7, i4)) {
                        zzz = zzgza.zzz(i7 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i7, i4)) {
                        int zzp4 = zzp(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzz((zzp4 >> 31) ^ (zzp4 + zzp4));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i7, i4)) {
                        long zzv3 = zzv(obj, j);
                        zzz3 = zzgza.zzz(i7 << 3);
                        zzA = zzgza.zzA((zzv3 >> 63) ^ (zzv3 + zzv3));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 68:
                    if (zzR(obj, i7, i4)) {
                        r0 = zzgza.zzw(i7, (zzhbe) unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                default:
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
            }
        }
        zzhcp zzhcpVar = this.zzn;
        int zza3 = i5 + zzhcpVar.zza(zzhcpVar.zzd(obj));
        if (!this.zzh) {
            return zza3;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzu = zzu(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i6 = iArr[i4];
            long j = i5;
            int i7 = 37;
            switch (zzt) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhcz.zzb(obj, j));
                    byte[] bArr = zzhae.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhcz.zzc(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzhcz.zzf(obj, j);
                    byte[] bArr2 = zzhae.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzhcz.zzf(obj, j);
                    byte[] bArr3 = zzhae.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    floatToIntBits = zzhcz.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzhcz.zzf(obj, j);
                    byte[] bArr4 = zzhae.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    floatToIntBits = zzhcz.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    floatToIntBits = zzhae.zza(zzhcz.zzz(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) zzhcz.zzh(obj, j)).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object zzh = zzhcz.zzh(obj, j);
                    if (zzh != null) {
                        i7 = zzh.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    floatToIntBits = zzhcz.zzh(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    floatToIntBits = zzhcz.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    floatToIntBits = zzhcz.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    floatToIntBits = zzhcz.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzhcz.zzf(obj, j);
                    byte[] bArr5 = zzhae.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    floatToIntBits = zzhcz.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzhcz.zzf(obj, j);
                    byte[] bArr6 = zzhae.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object zzh2 = zzhcz.zzh(obj, j);
                    if (zzh2 != null) {
                        i7 = zzh2.hashCode();
                    }
                    i3 = i2 + i7;
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i3 * 53;
                    floatToIntBits = zzhcz.zzh(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    floatToIntBits = zzhcz.zzh(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzhae.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzhae.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzhae.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzhae.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzhae.zza(zzS(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = ((String) zzhcz.zzh(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzhcz.zzh(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzhcz.zzh(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzhae.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzhae.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzhcz.zzh(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.zzn.zzd(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0b89, code lost:
    
        if (r5 == r0) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0b8b, code lost:
    
        r31.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0b91, code lost:
    
        r10 = r33.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0b96, code lost:
    
        if (r10 >= r33.zzl) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0b98, code lost:
    
        zzy(r34, r33.zzj[r10], null, r33.zzn, r34);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0bab, code lost:
    
        if (r8 != 0) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0baf, code lost:
    
        if (r9 != r37) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0bb6, code lost:
    
        throw com.google.android.gms.internal.ads.zzhag.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0bbd, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0bb9, code lost:
    
        if (r9 > r37) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0bbb, code lost:
    
        if (r14 != r8) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0bc2, code lost:
    
        throw com.google.android.gms.internal.ads.zzhag.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0b28 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x089c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x08ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzgxx zzgxxVar) throws IOException {
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzq;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        zzgxx zzgxxVar2;
        int i14;
        int i15;
        zzgzf zzgzfVar;
        int i16;
        int i17;
        int i18;
        int i19;
        zzgxx zzgxxVar3;
        int i20;
        int i21;
        zzgxx zzgxxVar4;
        Unsafe unsafe2;
        int i22;
        int i23;
        int i24;
        int i25;
        int zza2;
        int i26;
        Unsafe unsafe3;
        int i27;
        int i28;
        int i29;
        int i30;
        Unsafe unsafe4;
        int i31;
        int i32;
        zzgxx zzgxxVar5;
        int zzh;
        int i33;
        zzgxx zzgxxVar6;
        int zzj;
        int i34;
        Object obj2 = obj;
        int i35 = i2;
        zzgxx zzgxxVar7 = zzgxxVar;
        zzD(obj);
        Unsafe unsafe5 = zzb;
        int i36 = -1;
        int i37 = 1048575;
        int i38 = i;
        int i39 = 1048575;
        int i40 = -1;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        while (true) {
            if (i38 < i35) {
                int i44 = i38 + 1;
                int i45 = bArr[i38];
                if (i45 < 0) {
                    int zzi = zzgxy.zzi(i45, bArr, i44, zzgxxVar7);
                    i8 = zzgxxVar7.zza;
                    i44 = zzi;
                } else {
                    i8 = i45;
                }
                int i46 = i8 >>> 3;
                if (i46 > i40) {
                    zzq = (i46 < this.zze || i46 > this.zzf) ? i36 : zzs(i46, i41 / 3);
                } else {
                    zzq = zzq(i46);
                }
                int i47 = zzq;
                if (i47 == i36) {
                    i9 = i44;
                    i10 = i43;
                    i11 = i39;
                    i12 = i46;
                    i6 = i8;
                    i13 = i36;
                    unsafe = unsafe5;
                    zzgxxVar2 = zzgxxVar7;
                    i14 = 0;
                } else {
                    int i48 = i8 & 7;
                    int[] iArr = this.zzc;
                    int i49 = iArr[i47 + 1];
                    int zzt = zzt(i49);
                    long j = i49 & i37;
                    if (zzt <= 17) {
                        int i50 = iArr[i47 + 2];
                        int i51 = 1 << (i50 >>> 20);
                        int i52 = i8;
                        int i53 = 1048575;
                        int i54 = i50 & 1048575;
                        if (i54 != i39) {
                            if (i39 != 1048575) {
                                unsafe5.putInt(obj2, i39, i43);
                                i53 = 1048575;
                            }
                            i43 = i54 == i53 ? 0 : unsafe5.getInt(obj2, i54);
                            i11 = i54;
                        } else {
                            i11 = i39;
                        }
                        switch (zzt) {
                            case 0:
                                i16 = i47;
                                i17 = i52;
                                if (i48 == 1) {
                                    i38 = i44 + 8;
                                    i43 |= i51;
                                    zzhcz.zzr(obj2, j, Double.longBitsToDouble(zzgxy.zzn(bArr, i44)));
                                    i42 = i17;
                                    i37 = i53;
                                    i41 = i16;
                                    i40 = i46;
                                    i39 = i11;
                                    i36 = -1;
                                    break;
                                }
                                i52 = i17;
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe6 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe6;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4 && i4 != 0) {
                                    i5 = i9;
                                    i43 = i10;
                                    i39 = i11;
                                    i7 = 1048575;
                                    break;
                                } else {
                                    if (this.zzh || (zzgzfVar = zzgxxVar2.zzd) == zzgzf.zza) {
                                        i15 = i12;
                                        i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                    } else {
                                        if (zzgzfVar.zzc(this.zzg, i12) != null) {
                                            throw null;
                                        }
                                        i15 = i12;
                                        i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                    }
                                    i40 = i15;
                                    zzgxxVar7 = zzgxxVar2;
                                    i42 = i6;
                                    i36 = i13;
                                    i43 = i10;
                                    i39 = i11;
                                    i41 = i14;
                                    unsafe5 = unsafe;
                                    i37 = 1048575;
                                    break;
                                }
                            case 1:
                                i16 = i47;
                                i17 = i52;
                                if (i48 == 5) {
                                    i38 = i44 + 4;
                                    i43 |= i51;
                                    zzhcz.zzs(obj2, j, Float.intBitsToFloat(zzgxy.zzb(bArr, i44)));
                                    i42 = i17;
                                    i37 = i53;
                                    i41 = i16;
                                    i40 = i46;
                                    i39 = i11;
                                    i36 = -1;
                                    break;
                                }
                                i52 = i17;
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe62 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe62;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4) {
                                }
                                if (this.zzh) {
                                    break;
                                }
                                i15 = i12;
                                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                i40 = i15;
                                zzgxxVar7 = zzgxxVar2;
                                i42 = i6;
                                i36 = i13;
                                i43 = i10;
                                i39 = i11;
                                i41 = i14;
                                unsafe5 = unsafe;
                                i37 = 1048575;
                                break;
                            case 2:
                            case 3:
                                i16 = i47;
                                i17 = i52;
                                if (i48 == 0) {
                                    int i55 = i43 | i51;
                                    int zzk = zzgxy.zzk(bArr, i44, zzgxxVar7);
                                    unsafe5.putLong(obj, j, zzgxxVar7.zzb);
                                    i42 = i17;
                                    i37 = i53;
                                    i41 = i16;
                                    i43 = i55;
                                    i40 = i46;
                                    i39 = i11;
                                    i38 = zzk;
                                    i36 = -1;
                                    break;
                                }
                                i52 = i17;
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe622 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe622;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4) {
                                }
                                if (this.zzh) {
                                }
                                i15 = i12;
                                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                i40 = i15;
                                zzgxxVar7 = zzgxxVar2;
                                i42 = i6;
                                i36 = i13;
                                i43 = i10;
                                i39 = i11;
                                i41 = i14;
                                unsafe5 = unsafe;
                                i37 = 1048575;
                                break;
                            case 4:
                            case 11:
                                i16 = i47;
                                i17 = i52;
                                if (i48 == 0) {
                                    i43 |= i51;
                                    i38 = zzgxy.zzh(bArr, i44, zzgxxVar7);
                                    unsafe5.putInt(obj2, j, zzgxxVar7.zza);
                                    i42 = i17;
                                    i37 = i53;
                                    i41 = i16;
                                    i40 = i46;
                                    i39 = i11;
                                    i36 = -1;
                                    break;
                                }
                                i52 = i17;
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe6222 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe6222;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4) {
                                }
                                if (this.zzh) {
                                }
                                i15 = i12;
                                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                i40 = i15;
                                zzgxxVar7 = zzgxxVar2;
                                i42 = i6;
                                i36 = i13;
                                i43 = i10;
                                i39 = i11;
                                i41 = i14;
                                unsafe5 = unsafe;
                                i37 = 1048575;
                                break;
                            case 5:
                            case 14:
                                i16 = i47;
                                i17 = i52;
                                if (i48 == 1) {
                                    int i56 = i44 + 8;
                                    unsafe5.putLong(obj, j, zzgxy.zzn(bArr, i44));
                                    i42 = i17;
                                    i37 = i53;
                                    i41 = i16;
                                    i38 = i56;
                                    i40 = i46;
                                    i39 = i11;
                                    i43 |= i51;
                                    i36 = -1;
                                    break;
                                }
                                i52 = i17;
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe62222 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe62222;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4) {
                                }
                                if (this.zzh) {
                                }
                                i15 = i12;
                                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                i40 = i15;
                                zzgxxVar7 = zzgxxVar2;
                                i42 = i6;
                                i36 = i13;
                                i43 = i10;
                                i39 = i11;
                                i41 = i14;
                                unsafe5 = unsafe;
                                i37 = 1048575;
                                break;
                            case 6:
                            case 13:
                                i16 = i47;
                                i17 = i52;
                                if (i48 == 5) {
                                    i38 = i44 + 4;
                                    i43 |= i51;
                                    unsafe5.putInt(obj2, j, zzgxy.zzb(bArr, i44));
                                    i42 = i17;
                                    i37 = i53;
                                    i41 = i16;
                                    i40 = i46;
                                    i39 = i11;
                                    i36 = -1;
                                    break;
                                }
                                i52 = i17;
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe622222 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe622222;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4) {
                                }
                                if (this.zzh) {
                                }
                                i15 = i12;
                                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                i40 = i15;
                                zzgxxVar7 = zzgxxVar2;
                                i42 = i6;
                                i36 = i13;
                                i43 = i10;
                                i39 = i11;
                                i41 = i14;
                                unsafe5 = unsafe;
                                i37 = 1048575;
                                break;
                            case 7:
                                i16 = i47;
                                i17 = i52;
                                if (i48 == 0) {
                                    i43 |= i51;
                                    i38 = zzgxy.zzk(bArr, i44, zzgxxVar7);
                                    zzhcz.zzp(obj2, j, zzgxxVar7.zzb != 0);
                                    i42 = i17;
                                    i37 = i53;
                                    i41 = i16;
                                    i40 = i46;
                                    i39 = i11;
                                    i36 = -1;
                                    break;
                                }
                                i52 = i17;
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe6222222 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe6222222;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4) {
                                }
                                if (this.zzh) {
                                }
                                i15 = i12;
                                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                i40 = i15;
                                zzgxxVar7 = zzgxxVar2;
                                i42 = i6;
                                i36 = i13;
                                i43 = i10;
                                i39 = i11;
                                i41 = i14;
                                unsafe5 = unsafe;
                                i37 = 1048575;
                                break;
                            case 8:
                                i16 = i47;
                                i17 = i52;
                                if (i48 == 2) {
                                    if (zzM(i49)) {
                                        i38 = zzgxy.zzh(bArr, i44, zzgxxVar7);
                                        i18 = zzgxxVar7.zza;
                                        if (i18 < 0) {
                                            throw zzhag.zzf();
                                        }
                                        i19 = i43 | i51;
                                        if (i18 == 0) {
                                            zzgxxVar7.zzc = "";
                                            i43 = i19;
                                            unsafe5.putObject(obj2, j, zzgxxVar7.zzc);
                                            i42 = i17;
                                            i37 = i53;
                                            i41 = i16;
                                            i40 = i46;
                                            i39 = i11;
                                            i36 = -1;
                                            break;
                                        } else {
                                            zzgxxVar7.zzc = zzhde.zzh(bArr, i38, i18);
                                            i38 += i18;
                                            i43 = i19;
                                            unsafe5.putObject(obj2, j, zzgxxVar7.zzc);
                                            i42 = i17;
                                            i37 = i53;
                                            i41 = i16;
                                            i40 = i46;
                                            i39 = i11;
                                            i36 = -1;
                                        }
                                    } else {
                                        i38 = zzgxy.zzh(bArr, i44, zzgxxVar7);
                                        i18 = zzgxxVar7.zza;
                                        if (i18 < 0) {
                                            throw zzhag.zzf();
                                        }
                                        i19 = i43 | i51;
                                        if (i18 == 0) {
                                            zzgxxVar7.zzc = "";
                                            i43 = i19;
                                            unsafe5.putObject(obj2, j, zzgxxVar7.zzc);
                                            i42 = i17;
                                            i37 = i53;
                                            i41 = i16;
                                            i40 = i46;
                                            i39 = i11;
                                            i36 = -1;
                                        } else {
                                            zzgxxVar7.zzc = new String(bArr, i38, i18, zzhae.zzb);
                                            i38 += i18;
                                            i43 = i19;
                                            unsafe5.putObject(obj2, j, zzgxxVar7.zzc);
                                            i42 = i17;
                                            i37 = i53;
                                            i41 = i16;
                                            i40 = i46;
                                            i39 = i11;
                                            i36 = -1;
                                        }
                                    }
                                }
                                i52 = i17;
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe62222222 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe62222222;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4) {
                                }
                                if (this.zzh) {
                                }
                                i15 = i12;
                                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                i40 = i15;
                                zzgxxVar7 = zzgxxVar2;
                                i42 = i6;
                                i36 = i13;
                                i43 = i10;
                                i39 = i11;
                                i41 = i14;
                                unsafe5 = unsafe;
                                i37 = 1048575;
                                break;
                            case 9:
                                i16 = i47;
                                i17 = i52;
                                if (i48 != 2) {
                                    i52 = i17;
                                    zzgxxVar3 = zzgxxVar7;
                                    i20 = i16;
                                    i13 = -1;
                                    Unsafe unsafe622222222 = unsafe5;
                                    i4 = i3;
                                    i14 = i20;
                                    i9 = i44;
                                    zzgxxVar2 = zzgxxVar3;
                                    unsafe = unsafe622222222;
                                    i6 = i52;
                                    i10 = i43;
                                    i12 = i46;
                                    if (i6 != i4) {
                                    }
                                    if (this.zzh) {
                                    }
                                    i15 = i12;
                                    i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                    i40 = i15;
                                    zzgxxVar7 = zzgxxVar2;
                                    i42 = i6;
                                    i36 = i13;
                                    i43 = i10;
                                    i39 = i11;
                                    i41 = i14;
                                    unsafe5 = unsafe;
                                    i37 = 1048575;
                                    break;
                                } else {
                                    Object zzA = zzA(obj2, i16);
                                    i38 = zzgxy.zzm(zzA, zzx(i16), bArr, i44, i2, zzgxxVar);
                                    zzJ(obj2, i16, zzA);
                                    i42 = i17;
                                    i43 |= i51;
                                    i41 = i16;
                                    i40 = i46;
                                    i39 = i11;
                                    i36 = -1;
                                    i35 = i2;
                                    i37 = i53;
                                }
                                break;
                            case 10:
                                i16 = i47;
                                i17 = i52;
                                if (i48 == 2) {
                                    i43 |= i51;
                                    i38 = zzgxy.zza(bArr, i44, zzgxxVar7);
                                    unsafe5.putObject(obj2, j, zzgxxVar7.zzc);
                                    i42 = i17;
                                    i37 = i53;
                                    i41 = i16;
                                    i40 = i46;
                                    i39 = i11;
                                    i36 = -1;
                                    break;
                                }
                                i52 = i17;
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe6222222222 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe6222222222;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4) {
                                }
                                if (this.zzh) {
                                }
                                i15 = i12;
                                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                i40 = i15;
                                zzgxxVar7 = zzgxxVar2;
                                i42 = i6;
                                i36 = i13;
                                i43 = i10;
                                i39 = i11;
                                i41 = i14;
                                unsafe5 = unsafe;
                                i37 = 1048575;
                                break;
                            case 12:
                                i16 = i47;
                                if (i48 == 0) {
                                    int zzh2 = zzgxy.zzh(bArr, i44, zzgxxVar7);
                                    int i57 = zzgxxVar7.zza;
                                    zzgzy zzw = zzw(i16);
                                    if ((i49 & Integer.MIN_VALUE) == 0 || zzw == null || zzw.zza(i57)) {
                                        i17 = i52;
                                        i43 |= i51;
                                        unsafe5.putInt(obj2, j, i57);
                                    } else {
                                        i17 = i52;
                                        zzd(obj).zzj(i17, Long.valueOf(i57));
                                    }
                                    i38 = zzh2;
                                    i42 = i17;
                                    i37 = i53;
                                    i41 = i16;
                                    i40 = i46;
                                    i39 = i11;
                                    i36 = -1;
                                    break;
                                }
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe62222222222 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe62222222222;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4) {
                                }
                                if (this.zzh) {
                                }
                                i15 = i12;
                                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                i40 = i15;
                                zzgxxVar7 = zzgxxVar2;
                                i42 = i6;
                                i36 = i13;
                                i43 = i10;
                                i39 = i11;
                                i41 = i14;
                                unsafe5 = unsafe;
                                i37 = 1048575;
                                break;
                            case 15:
                                i16 = i47;
                                if (i48 == 0) {
                                    i43 |= i51;
                                    i38 = zzgxy.zzh(bArr, i44, zzgxxVar7);
                                    unsafe5.putInt(obj2, j, zzgyt.zzF(zzgxxVar7.zza));
                                    i37 = i53;
                                    i41 = i16;
                                    i40 = i46;
                                    i39 = i11;
                                    i42 = i52;
                                    i36 = -1;
                                    break;
                                }
                                zzgxxVar3 = zzgxxVar7;
                                i20 = i16;
                                i13 = -1;
                                Unsafe unsafe622222222222 = unsafe5;
                                i4 = i3;
                                i14 = i20;
                                i9 = i44;
                                zzgxxVar2 = zzgxxVar3;
                                unsafe = unsafe622222222222;
                                i6 = i52;
                                i10 = i43;
                                i12 = i46;
                                if (i6 != i4) {
                                }
                                if (this.zzh) {
                                }
                                i15 = i12;
                                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                i40 = i15;
                                zzgxxVar7 = zzgxxVar2;
                                i42 = i6;
                                i36 = i13;
                                i43 = i10;
                                i39 = i11;
                                i41 = i14;
                                unsafe5 = unsafe;
                                i37 = 1048575;
                                break;
                            case 16:
                                if (i48 != 0) {
                                    i20 = i47;
                                    zzgxxVar3 = zzgxxVar7;
                                    i13 = -1;
                                    Unsafe unsafe6222222222222 = unsafe5;
                                    i4 = i3;
                                    i14 = i20;
                                    i9 = i44;
                                    zzgxxVar2 = zzgxxVar3;
                                    unsafe = unsafe6222222222222;
                                    i6 = i52;
                                    i10 = i43;
                                    i12 = i46;
                                    if (i6 != i4) {
                                    }
                                    if (this.zzh) {
                                    }
                                    i15 = i12;
                                    i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                    i40 = i15;
                                    zzgxxVar7 = zzgxxVar2;
                                    i42 = i6;
                                    i36 = i13;
                                    i43 = i10;
                                    i39 = i11;
                                    i41 = i14;
                                    unsafe5 = unsafe;
                                    i37 = 1048575;
                                    break;
                                } else {
                                    int zzk2 = zzgxy.zzk(bArr, i44, zzgxxVar7);
                                    unsafe5.putLong(obj, j, zzgyt.zzG(zzgxxVar7.zzb));
                                    i43 |= i51;
                                    i38 = zzk2;
                                    i41 = i47;
                                    i40 = i46;
                                    i39 = i11;
                                    i42 = i52;
                                    i36 = -1;
                                    i35 = i2;
                                    i37 = i53;
                                }
                                break;
                            default:
                                i16 = i47;
                                i17 = i52;
                                if (i48 != 3) {
                                    i52 = i17;
                                    zzgxxVar3 = zzgxxVar7;
                                    i20 = i16;
                                    i13 = -1;
                                    Unsafe unsafe62222222222222 = unsafe5;
                                    i4 = i3;
                                    i14 = i20;
                                    i9 = i44;
                                    zzgxxVar2 = zzgxxVar3;
                                    unsafe = unsafe62222222222222;
                                    i6 = i52;
                                    i10 = i43;
                                    i12 = i46;
                                    if (i6 != i4) {
                                    }
                                    if (this.zzh) {
                                    }
                                    i15 = i12;
                                    i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                                    i40 = i15;
                                    zzgxxVar7 = zzgxxVar2;
                                    i42 = i6;
                                    i36 = i13;
                                    i43 = i10;
                                    i39 = i11;
                                    i41 = i14;
                                    unsafe5 = unsafe;
                                    i37 = 1048575;
                                    break;
                                } else {
                                    i43 |= i51;
                                    Object zzA2 = zzA(obj2, i16);
                                    int zzl = zzgxy.zzl(zzA2, zzx(i16), bArr, i44, i2, (i46 << 3) | 4, zzgxxVar);
                                    zzJ(obj2, i16, zzA2);
                                    i35 = i2;
                                    i37 = i53;
                                    unsafe5 = unsafe5;
                                    zzgxxVar7 = zzgxxVar7;
                                    i38 = zzl;
                                    i36 = -1;
                                    i39 = i11;
                                    i42 = i17;
                                    i41 = i16;
                                    i40 = i46;
                                }
                                break;
                        }
                    } else {
                        i11 = i39;
                        int i58 = i8;
                        zzgxx zzgxxVar8 = zzgxxVar7;
                        i13 = -1;
                        Unsafe unsafe7 = unsafe5;
                        if (zzt != 27) {
                            int i59 = i2;
                            if (zzt > 49) {
                                i10 = i43;
                                i12 = i46;
                                i21 = i44;
                                zzgxxVar4 = zzgxxVar8;
                                unsafe2 = unsafe7;
                                i22 = i47;
                                if (zzt != 50) {
                                    obj2 = obj;
                                    unsafe = unsafe2;
                                    Unsafe unsafe8 = zzb;
                                    long j2 = iArr[i22 + 2] & 1048575;
                                    switch (zzt) {
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                            zzgxxVar2 = zzgxxVar;
                                            i6 = i58;
                                            i14 = i22;
                                            i23 = i21;
                                            if (i48 == 1) {
                                                i38 = i23 + 8;
                                                unsafe8.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzgxy.zzn(bArr, i23))));
                                                unsafe8.putInt(obj2, j2, i12);
                                                if (i38 != i23) {
                                                    i4 = i3;
                                                    i9 = i38;
                                                    break;
                                                } else {
                                                    i40 = i12;
                                                    zzgxxVar7 = zzgxxVar2;
                                                    i42 = i6;
                                                    i36 = i13;
                                                    i43 = i10;
                                                    i39 = i11;
                                                    i41 = i14;
                                                    unsafe5 = unsafe;
                                                    i37 = 1048575;
                                                    break;
                                                }
                                            }
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                            zzgxxVar2 = zzgxxVar;
                                            i6 = i58;
                                            i14 = i22;
                                            i23 = i21;
                                            if (i48 == 5) {
                                                i38 = i23 + 4;
                                                unsafe8.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzgxy.zzb(bArr, i23))));
                                                unsafe8.putInt(obj2, j2, i12);
                                                if (i38 != i23) {
                                                }
                                            }
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                            zzgxxVar2 = zzgxxVar;
                                            i6 = i58;
                                            i14 = i22;
                                            i23 = i21;
                                            if (i48 == 0) {
                                                i38 = zzgxy.zzk(bArr, i23, zzgxxVar2);
                                                unsafe8.putObject(obj2, j, Long.valueOf(zzgxxVar2.zzb));
                                                unsafe8.putInt(obj2, j2, i12);
                                                if (i38 != i23) {
                                                }
                                            }
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                        case 62:
                                            zzgxxVar2 = zzgxxVar;
                                            i6 = i58;
                                            i14 = i22;
                                            i23 = i21;
                                            if (i48 == 0) {
                                                i38 = zzgxy.zzh(bArr, i23, zzgxxVar2);
                                                unsafe8.putObject(obj2, j, Integer.valueOf(zzgxxVar2.zza));
                                                unsafe8.putInt(obj2, j2, i12);
                                                if (i38 != i23) {
                                                }
                                            }
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case 56:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                            zzgxxVar2 = zzgxxVar;
                                            i6 = i58;
                                            i14 = i22;
                                            i23 = i21;
                                            if (i48 == 1) {
                                                i38 = i23 + 8;
                                                unsafe8.putObject(obj2, j, Long.valueOf(zzgxy.zzn(bArr, i23)));
                                                unsafe8.putInt(obj2, j2, i12);
                                                if (i38 != i23) {
                                                }
                                            }
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            zzgxxVar2 = zzgxxVar;
                                            i6 = i58;
                                            i14 = i22;
                                            i23 = i21;
                                            if (i48 == 5) {
                                                i38 = i23 + 4;
                                                unsafe8.putObject(obj2, j, Integer.valueOf(zzgxy.zzb(bArr, i23)));
                                                unsafe8.putInt(obj2, j2, i12);
                                                if (i38 != i23) {
                                                }
                                            }
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case 58:
                                            zzgxxVar2 = zzgxxVar;
                                            i6 = i58;
                                            i14 = i22;
                                            i23 = i21;
                                            if (i48 == 0) {
                                                i38 = zzgxy.zzk(bArr, i23, zzgxxVar2);
                                                unsafe8.putObject(obj2, j, Boolean.valueOf(zzgxxVar2.zzb != 0));
                                                unsafe8.putInt(obj2, j2, i12);
                                                if (i38 != i23) {
                                                }
                                            }
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case 59:
                                            zzgxxVar2 = zzgxxVar;
                                            i6 = i58;
                                            i14 = i22;
                                            i23 = i21;
                                            if (i48 == 2) {
                                                int zzh3 = zzgxy.zzh(bArr, i23, zzgxxVar2);
                                                int i60 = zzgxxVar2.zza;
                                                if (i60 == 0) {
                                                    unsafe8.putObject(obj2, j, "");
                                                } else {
                                                    int i61 = zzh3 + i60;
                                                    if ((i49 & 536870912) != 0 && !zzhde.zzj(bArr, zzh3, i61)) {
                                                        throw zzhag.zzd();
                                                    }
                                                    unsafe8.putObject(obj2, j, new String(bArr, zzh3, i60, zzhae.zzb));
                                                    zzh3 = i61;
                                                }
                                                unsafe8.putInt(obj2, j2, i12);
                                                i38 = zzh3;
                                                if (i38 != i23) {
                                                }
                                            }
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                            zzgxxVar2 = zzgxxVar;
                                            i24 = i58;
                                            i25 = i21;
                                            if (i48 == 2) {
                                                Object zzB = zzB(obj2, i12, i22);
                                                zzhby zzx = zzx(i22);
                                                i6 = i24;
                                                i23 = i25;
                                                i38 = zzgxy.zzm(zzB, zzx, bArr, i23, i2, zzgxxVar);
                                                zzK(obj2, i12, i22, zzB);
                                                i14 = i22;
                                                i12 = i12;
                                                if (i38 != i23) {
                                                }
                                            }
                                            i6 = i24;
                                            i14 = i22;
                                            i23 = i25;
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                            zzgxxVar2 = zzgxxVar;
                                            i24 = i58;
                                            i25 = i21;
                                            if (i48 == 2) {
                                                zza2 = zzgxy.zza(bArr, i25, zzgxxVar2);
                                                unsafe8.putObject(obj2, j, zzgxxVar2.zzc);
                                                unsafe8.putInt(obj2, j2, i12);
                                                i6 = i24;
                                                i38 = zza2;
                                                i14 = i22;
                                                i23 = i25;
                                                if (i38 != i23) {
                                                }
                                            }
                                            i6 = i24;
                                            i14 = i22;
                                            i23 = i25;
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                            zzgxxVar2 = zzgxxVar;
                                            i24 = i58;
                                            i25 = i21;
                                            if (i48 == 0) {
                                                zza2 = zzgxy.zzh(bArr, i25, zzgxxVar2);
                                                int i62 = zzgxxVar2.zza;
                                                zzgzy zzw2 = zzw(i22);
                                                if (zzw2 == null || zzw2.zza(i62)) {
                                                    unsafe8.putObject(obj2, j, Integer.valueOf(i62));
                                                    unsafe8.putInt(obj2, j2, i12);
                                                } else {
                                                    zzd(obj).zzj(i24, Long.valueOf(i62));
                                                }
                                                i6 = i24;
                                                i38 = zza2;
                                                i14 = i22;
                                                i23 = i25;
                                                if (i38 != i23) {
                                                }
                                            }
                                            i6 = i24;
                                            i14 = i22;
                                            i23 = i25;
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                            zzgxxVar2 = zzgxxVar;
                                            i24 = i58;
                                            i25 = i21;
                                            if (i48 == 0) {
                                                zza2 = zzgxy.zzh(bArr, i25, zzgxxVar2);
                                                unsafe8.putObject(obj2, j, Integer.valueOf(zzgyt.zzF(zzgxxVar2.zza)));
                                                unsafe8.putInt(obj2, j2, i12);
                                                i6 = i24;
                                                i38 = zza2;
                                                i14 = i22;
                                                i23 = i25;
                                                if (i38 != i23) {
                                                }
                                            }
                                            i6 = i24;
                                            i14 = i22;
                                            i23 = i25;
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                            zzgxxVar2 = zzgxxVar;
                                            i24 = i58;
                                            i25 = i21;
                                            if (i48 == 0) {
                                                zza2 = zzgxy.zzk(bArr, i25, zzgxxVar2);
                                                unsafe8.putObject(obj2, j, Long.valueOf(zzgyt.zzG(zzgxxVar2.zzb)));
                                                unsafe8.putInt(obj2, j2, i12);
                                                i6 = i24;
                                                i38 = zza2;
                                                i14 = i22;
                                                i23 = i25;
                                                if (i38 != i23) {
                                                }
                                            }
                                            i6 = i24;
                                            i14 = i22;
                                            i23 = i25;
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                        case 68:
                                            if (i48 == 3) {
                                                Object zzB2 = zzB(obj2, i12, i22);
                                                i25 = i21;
                                                int zzl2 = zzgxy.zzl(zzB2, zzx(i22), bArr, i25, i2, (i58 & (-8)) | 4, zzgxxVar);
                                                zzK(obj2, i12, i22, zzB2);
                                                zzgxxVar2 = zzgxxVar;
                                                i6 = i58;
                                                i14 = i22;
                                                i38 = zzl2;
                                                i23 = i25;
                                                if (i38 != i23) {
                                                }
                                            }
                                            break;
                                        default:
                                            zzgxxVar2 = zzgxxVar;
                                            i6 = i58;
                                            i14 = i22;
                                            i23 = i21;
                                            i38 = i23;
                                            if (i38 != i23) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i48 == 2) {
                                        Unsafe unsafe9 = zzb;
                                        Object zzz = zzz(i22);
                                        Object object = unsafe9.getObject(obj, j);
                                        if (zzhaz.zza(object)) {
                                            zzhay zzb2 = zzhay.zza().zzb();
                                            zzhaz.zzb(zzb2, object);
                                            unsafe9.putObject(obj, j, zzb2);
                                        }
                                        throw null;
                                    }
                                    i26 = i58;
                                    obj2 = obj;
                                    i14 = i22;
                                    unsafe = unsafe2;
                                    i9 = i21;
                                    zzgxxVar2 = zzgxxVar4;
                                    i6 = i26;
                                }
                            } else {
                                long j3 = i49;
                                Unsafe unsafe10 = zzb;
                                int i63 = i43;
                                zzhad zzhadVar = (zzhad) unsafe10.getObject(obj2, j);
                                if (zzhadVar.zzc()) {
                                    unsafe3 = unsafe7;
                                } else {
                                    int size = zzhadVar.size();
                                    unsafe3 = unsafe7;
                                    zzhadVar = zzhadVar.zzd(size != 0 ? size + size : 10);
                                    unsafe10.putObject(obj2, j, zzhadVar);
                                }
                                zzhad zzhadVar2 = zzhadVar;
                                switch (zzt) {
                                    case 18:
                                    case 35:
                                        i27 = i44;
                                        i28 = i47;
                                        i29 = i58;
                                        i30 = i46;
                                        i10 = i63;
                                        unsafe4 = unsafe3;
                                        if (i48 == 2) {
                                            zzgzc zzgzcVar = (zzgzc) zzhadVar2;
                                            i38 = zzgxy.zzh(bArr, i27, zzgxxVar8);
                                            int i64 = zzgxxVar8.zza + i38;
                                            while (i38 < i64) {
                                                zzgzcVar.zze(Double.longBitsToDouble(zzgxy.zzn(bArr, i38)));
                                                i38 += 8;
                                            }
                                            if (i38 != i64) {
                                                throw zzhag.zzj();
                                            }
                                            zzgxxVar5 = zzgxxVar8;
                                            if (i38 != i27) {
                                                i4 = i3;
                                                i9 = i38;
                                                zzgxxVar2 = zzgxxVar5;
                                                unsafe = unsafe4;
                                                i14 = i28;
                                                i12 = i30;
                                                i6 = i29;
                                                obj2 = obj;
                                                break;
                                            } else {
                                                i42 = i29;
                                                zzgxxVar7 = zzgxxVar5;
                                                i41 = i28;
                                                i40 = i30;
                                                i36 = -1;
                                                i43 = i10;
                                                i39 = i11;
                                                obj2 = obj;
                                                i35 = i59;
                                                unsafe5 = unsafe4;
                                                i37 = 1048575;
                                            }
                                        } else {
                                            if (i48 == 1) {
                                                i31 = i27 + 8;
                                                zzgzc zzgzcVar2 = (zzgzc) zzhadVar2;
                                                zzgzcVar2.zze(Double.longBitsToDouble(zzgxy.zzn(bArr, i27)));
                                                while (i31 < i59) {
                                                    int zzh4 = zzgxy.zzh(bArr, i31, zzgxxVar8);
                                                    if (i29 == zzgxxVar8.zza) {
                                                        zzgzcVar2.zze(Double.longBitsToDouble(zzgxy.zzn(bArr, zzh4)));
                                                        i31 = zzh4 + 8;
                                                    } else {
                                                        i38 = i31;
                                                        zzgxxVar5 = zzgxxVar8;
                                                        if (i38 != i27) {
                                                        }
                                                    }
                                                }
                                                i38 = i31;
                                                zzgxxVar5 = zzgxxVar8;
                                                if (i38 != i27) {
                                                }
                                            }
                                            zzgxxVar5 = zzgxxVar8;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        i27 = i44;
                                        i28 = i47;
                                        i29 = i58;
                                        i30 = i46;
                                        i10 = i63;
                                        unsafe4 = unsafe3;
                                        if (i48 == 2) {
                                            zzgzm zzgzmVar = (zzgzm) zzhadVar2;
                                            i38 = zzgxy.zzh(bArr, i27, zzgxxVar8);
                                            int i65 = zzgxxVar8.zza + i38;
                                            while (i38 < i65) {
                                                zzgzmVar.zze(Float.intBitsToFloat(zzgxy.zzb(bArr, i38)));
                                                i38 += 4;
                                            }
                                            if (i38 != i65) {
                                                throw zzhag.zzj();
                                            }
                                            zzgxxVar5 = zzgxxVar8;
                                            if (i38 != i27) {
                                            }
                                        } else {
                                            if (i48 == 5) {
                                                i31 = i27 + 4;
                                                zzgzm zzgzmVar2 = (zzgzm) zzhadVar2;
                                                zzgzmVar2.zze(Float.intBitsToFloat(zzgxy.zzb(bArr, i27)));
                                                while (i31 < i59) {
                                                    int zzh5 = zzgxy.zzh(bArr, i31, zzgxxVar8);
                                                    if (i29 == zzgxxVar8.zza) {
                                                        zzgzmVar2.zze(Float.intBitsToFloat(zzgxy.zzb(bArr, zzh5)));
                                                        i31 = zzh5 + 4;
                                                    } else {
                                                        i38 = i31;
                                                        zzgxxVar5 = zzgxxVar8;
                                                        if (i38 != i27) {
                                                        }
                                                    }
                                                }
                                                i38 = i31;
                                                zzgxxVar5 = zzgxxVar8;
                                                if (i38 != i27) {
                                                }
                                            }
                                            zzgxxVar5 = zzgxxVar8;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i27 = i44;
                                        i28 = i47;
                                        i29 = i58;
                                        i30 = i46;
                                        i10 = i63;
                                        unsafe4 = unsafe3;
                                        if (i48 == 2) {
                                            zzhat zzhatVar = (zzhat) zzhadVar2;
                                            i38 = zzgxy.zzh(bArr, i27, zzgxxVar8);
                                            int i66 = zzgxxVar8.zza + i38;
                                            while (i38 < i66) {
                                                i38 = zzgxy.zzk(bArr, i38, zzgxxVar8);
                                                zzhatVar.zzg(zzgxxVar8.zzb);
                                            }
                                            if (i38 != i66) {
                                                throw zzhag.zzj();
                                            }
                                        } else {
                                            if (i48 == 0) {
                                                zzhat zzhatVar2 = (zzhat) zzhadVar2;
                                                i38 = zzgxy.zzk(bArr, i27, zzgxxVar8);
                                                zzhatVar2.zzg(zzgxxVar8.zzb);
                                                while (i38 < i59) {
                                                    int zzh6 = zzgxy.zzh(bArr, i38, zzgxxVar8);
                                                    if (i29 == zzgxxVar8.zza) {
                                                        i38 = zzgxy.zzk(bArr, zzh6, zzgxxVar8);
                                                        zzhatVar2.zzg(zzgxxVar8.zzb);
                                                    }
                                                }
                                            }
                                            zzgxxVar5 = zzgxxVar8;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        zzgxxVar5 = zzgxxVar8;
                                        if (i38 != i27) {
                                        }
                                        break;
                                    case 22:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                    case 39:
                                    case 43:
                                        i28 = i47;
                                        i29 = i58;
                                        i32 = i46;
                                        i10 = i63;
                                        unsafe4 = unsafe3;
                                        if (i48 == 2) {
                                            i38 = zzgxy.zzf(bArr, i44, zzhadVar2, zzgxxVar8);
                                            i27 = i44;
                                            i30 = i32;
                                            zzgxxVar5 = zzgxxVar8;
                                            if (i38 != i27) {
                                            }
                                        } else if (i48 == 0) {
                                            i27 = i44;
                                            i30 = i32;
                                            i38 = zzgxy.zzj(i29, bArr, i44, i2, zzhadVar2, zzgxxVar);
                                            zzgxxVar5 = zzgxxVar;
                                            if (i38 != i27) {
                                            }
                                        } else {
                                            i27 = i44;
                                            i30 = i32;
                                            zzgxxVar5 = zzgxxVar;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i28 = i47;
                                        i29 = i58;
                                        i32 = i46;
                                        i10 = i63;
                                        unsafe4 = unsafe3;
                                        if (i48 == 2) {
                                            zzhat zzhatVar3 = (zzhat) zzhadVar2;
                                            i38 = zzgxy.zzh(bArr, i44, zzgxxVar8);
                                            int i67 = zzgxxVar8.zza + i38;
                                            while (i38 < i67) {
                                                zzhatVar3.zzg(zzgxy.zzn(bArr, i38));
                                                i38 += 8;
                                            }
                                            if (i38 != i67) {
                                                throw zzhag.zzj();
                                            }
                                        } else {
                                            if (i48 == 1) {
                                                i38 = i44 + 8;
                                                zzhat zzhatVar4 = (zzhat) zzhadVar2;
                                                zzhatVar4.zzg(zzgxy.zzn(bArr, i44));
                                                while (i38 < i59) {
                                                    int zzh7 = zzgxy.zzh(bArr, i38, zzgxxVar8);
                                                    if (i29 == zzgxxVar8.zza) {
                                                        zzhatVar4.zzg(zzgxy.zzn(bArr, zzh7));
                                                        i38 = zzh7 + 8;
                                                    }
                                                }
                                            }
                                            i27 = i44;
                                            i30 = i32;
                                            zzgxxVar5 = zzgxxVar8;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        i27 = i44;
                                        i30 = i32;
                                        zzgxxVar5 = zzgxxVar8;
                                        if (i38 != i27) {
                                        }
                                        break;
                                    case 24:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                    case 41:
                                    case 45:
                                        i28 = i47;
                                        i29 = i58;
                                        i32 = i46;
                                        i10 = i63;
                                        unsafe4 = unsafe3;
                                        if (i48 == 2) {
                                            zzgzv zzgzvVar = (zzgzv) zzhadVar2;
                                            i38 = zzgxy.zzh(bArr, i44, zzgxxVar8);
                                            int i68 = zzgxxVar8.zza + i38;
                                            while (i38 < i68) {
                                                zzgzvVar.zzh(zzgxy.zzb(bArr, i38));
                                                i38 += 4;
                                            }
                                            if (i38 != i68) {
                                                throw zzhag.zzj();
                                            }
                                        } else {
                                            if (i48 == 5) {
                                                i38 = i44 + 4;
                                                zzgzv zzgzvVar2 = (zzgzv) zzhadVar2;
                                                zzgzvVar2.zzh(zzgxy.zzb(bArr, i44));
                                                while (i38 < i59) {
                                                    int zzh8 = zzgxy.zzh(bArr, i38, zzgxxVar8);
                                                    if (i29 == zzgxxVar8.zza) {
                                                        zzgzvVar2.zzh(zzgxy.zzb(bArr, zzh8));
                                                        i38 = zzh8 + 4;
                                                    }
                                                }
                                            }
                                            i27 = i44;
                                            i30 = i32;
                                            zzgxxVar5 = zzgxxVar8;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        i27 = i44;
                                        i30 = i32;
                                        zzgxxVar5 = zzgxxVar8;
                                        if (i38 != i27) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i28 = i47;
                                        i29 = i58;
                                        i32 = i46;
                                        i10 = i63;
                                        unsafe4 = unsafe3;
                                        if (i48 == 2) {
                                            zzgxz zzgxzVar = (zzgxz) zzhadVar2;
                                            i38 = zzgxy.zzh(bArr, i44, zzgxxVar8);
                                            int i69 = zzgxxVar8.zza + i38;
                                            while (i38 < i69) {
                                                i38 = zzgxy.zzk(bArr, i38, zzgxxVar8);
                                                zzgxzVar.zze(zzgxxVar8.zzb != 0);
                                            }
                                            if (i38 != i69) {
                                                throw zzhag.zzj();
                                            }
                                        } else {
                                            if (i48 == 0) {
                                                zzgxz zzgxzVar2 = (zzgxz) zzhadVar2;
                                                i38 = zzgxy.zzk(bArr, i44, zzgxxVar8);
                                                zzgxzVar2.zze(zzgxxVar8.zzb != 0);
                                                while (i38 < i59) {
                                                    int zzh9 = zzgxy.zzh(bArr, i38, zzgxxVar8);
                                                    if (i29 == zzgxxVar8.zza) {
                                                        i38 = zzgxy.zzk(bArr, zzh9, zzgxxVar8);
                                                        zzgxzVar2.zze(zzgxxVar8.zzb != 0);
                                                    }
                                                }
                                            }
                                            i27 = i44;
                                            i30 = i32;
                                            zzgxxVar5 = zzgxxVar8;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        i27 = i44;
                                        i30 = i32;
                                        zzgxxVar5 = zzgxxVar8;
                                        if (i38 != i27) {
                                        }
                                        break;
                                    case 26:
                                        i28 = i47;
                                        i29 = i58;
                                        i32 = i46;
                                        i10 = i63;
                                        unsafe4 = unsafe3;
                                        if (i48 == 2) {
                                            if ((j3 & 536870912) == 0) {
                                                zzh = zzgxy.zzh(bArr, i44, zzgxxVar8);
                                                int i70 = zzgxxVar8.zza;
                                                if (i70 < 0) {
                                                    throw zzhag.zzf();
                                                }
                                                if (i70 == 0) {
                                                    zzhadVar2.add("");
                                                } else {
                                                    zzhadVar2.add(new String(bArr, zzh, i70, zzhae.zzb));
                                                    zzh += i70;
                                                }
                                                while (zzh < i59) {
                                                    int zzh10 = zzgxy.zzh(bArr, zzh, zzgxxVar8);
                                                    if (i29 == zzgxxVar8.zza) {
                                                        zzh = zzgxy.zzh(bArr, zzh10, zzgxxVar8);
                                                        int i71 = zzgxxVar8.zza;
                                                        if (i71 < 0) {
                                                            throw zzhag.zzf();
                                                        }
                                                        if (i71 == 0) {
                                                            zzhadVar2.add("");
                                                        } else {
                                                            zzhadVar2.add(new String(bArr, zzh, i71, zzhae.zzb));
                                                            zzh += i71;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zzh = zzgxy.zzh(bArr, i44, zzgxxVar8);
                                                int i72 = zzgxxVar8.zza;
                                                if (i72 < 0) {
                                                    throw zzhag.zzf();
                                                }
                                                if (i72 == 0) {
                                                    zzhadVar2.add("");
                                                } else {
                                                    int i73 = zzh + i72;
                                                    if (!zzhde.zzj(bArr, zzh, i73)) {
                                                        throw zzhag.zzd();
                                                    }
                                                    zzhadVar2.add(new String(bArr, zzh, i72, zzhae.zzb));
                                                    zzh = i73;
                                                }
                                                while (zzh < i59) {
                                                    int zzh11 = zzgxy.zzh(bArr, zzh, zzgxxVar8);
                                                    if (i29 == zzgxxVar8.zza) {
                                                        zzh = zzgxy.zzh(bArr, zzh11, zzgxxVar8);
                                                        int i74 = zzgxxVar8.zza;
                                                        if (i74 < 0) {
                                                            throw zzhag.zzf();
                                                        }
                                                        if (i74 == 0) {
                                                            zzhadVar2.add("");
                                                        } else {
                                                            int i75 = zzh + i74;
                                                            if (!zzhde.zzj(bArr, zzh, i75)) {
                                                                throw zzhag.zzd();
                                                            }
                                                            zzhadVar2.add(new String(bArr, zzh, i74, zzhae.zzb));
                                                            zzh = i75;
                                                        }
                                                    }
                                                }
                                            }
                                            i38 = zzh;
                                            i27 = i44;
                                            i30 = i32;
                                            zzgxxVar5 = zzgxxVar8;
                                            if (i38 != i27) {
                                            }
                                        }
                                        i27 = i44;
                                        i30 = i32;
                                        zzgxxVar5 = zzgxxVar8;
                                        i38 = i27;
                                        if (i38 != i27) {
                                        }
                                        break;
                                    case 27:
                                        i33 = i44;
                                        zzgxxVar6 = zzgxxVar8;
                                        i28 = i47;
                                        i10 = i63;
                                        if (i48 == 2) {
                                            i59 = i2;
                                            i29 = i58;
                                            int zze = zzgxy.zze(zzx(i28), i58, bArr, i33, i59, zzhadVar2, zzgxxVar);
                                            i28 = i28;
                                            unsafe4 = unsafe3;
                                            i30 = i46;
                                            zzgxxVar5 = zzgxxVar6;
                                            i38 = zze;
                                            i27 = i33;
                                            if (i38 != i27) {
                                            }
                                        } else {
                                            i29 = i58;
                                            i59 = i2;
                                            i30 = i46;
                                            unsafe4 = unsafe3;
                                            int i76 = i33;
                                            zzgxxVar5 = zzgxxVar6;
                                            i27 = i76;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        i33 = i44;
                                        zzgxxVar6 = zzgxxVar8;
                                        i28 = i47;
                                        i10 = i63;
                                        if (i48 == 2) {
                                            i38 = zzgxy.zzh(bArr, i33, zzgxxVar6);
                                            int i77 = zzgxxVar6.zza;
                                            if (i77 < 0) {
                                                throw zzhag.zzf();
                                            }
                                            if (i77 > bArr.length - i38) {
                                                throw zzhag.zzj();
                                            }
                                            if (i77 == 0) {
                                                zzhadVar2.add(zzgyl.zzb);
                                            } else {
                                                zzhadVar2.add(zzgyl.zzv(bArr, i38, i77));
                                                i38 += i77;
                                            }
                                            while (i38 < i59) {
                                                int zzh12 = zzgxy.zzh(bArr, i38, zzgxxVar6);
                                                if (i58 == zzgxxVar6.zza) {
                                                    i38 = zzgxy.zzh(bArr, zzh12, zzgxxVar6);
                                                    int i78 = zzgxxVar6.zza;
                                                    if (i78 < 0) {
                                                        throw zzhag.zzf();
                                                    }
                                                    if (i78 > bArr.length - i38) {
                                                        throw zzhag.zzj();
                                                    }
                                                    if (i78 == 0) {
                                                        zzhadVar2.add(zzgyl.zzb);
                                                    } else {
                                                        zzhadVar2.add(zzgyl.zzv(bArr, i38, i78));
                                                        i38 += i78;
                                                    }
                                                } else {
                                                    i29 = i58;
                                                    i30 = i46;
                                                    unsafe4 = unsafe3;
                                                    int i79 = i33;
                                                    zzgxxVar5 = zzgxxVar6;
                                                    i27 = i79;
                                                    if (i38 != i27) {
                                                    }
                                                }
                                            }
                                            i29 = i58;
                                            i30 = i46;
                                            unsafe4 = unsafe3;
                                            int i792 = i33;
                                            zzgxxVar5 = zzgxxVar6;
                                            i27 = i792;
                                            if (i38 != i27) {
                                            }
                                        } else {
                                            i29 = i58;
                                            i30 = i46;
                                            unsafe4 = unsafe3;
                                            int i762 = i33;
                                            zzgxxVar5 = zzgxxVar6;
                                            i27 = i762;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (i48 == 2) {
                                            zzj = zzgxy.zzf(bArr, i44, zzhadVar2, zzgxxVar8);
                                            i33 = i44;
                                            zzgxxVar6 = zzgxxVar8;
                                            i28 = i47;
                                            i10 = i63;
                                        } else if (i48 == 0) {
                                            i28 = i47;
                                            i33 = i44;
                                            i10 = i63;
                                            zzgxxVar6 = zzgxxVar8;
                                            zzj = zzgxy.zzj(i58, bArr, i44, i2, zzhadVar2, zzgxxVar);
                                        } else {
                                            i10 = i63;
                                            i27 = i44;
                                            zzgxxVar5 = zzgxxVar8;
                                            i29 = i58;
                                            i28 = i47;
                                            i30 = i46;
                                            unsafe4 = unsafe3;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        zzhca.zzo(obj, i46, zzhadVar2, zzw(i28), null, this.zzn);
                                        i29 = i58;
                                        i38 = zzj;
                                        i30 = i46;
                                        unsafe4 = unsafe3;
                                        int i7922 = i33;
                                        zzgxxVar5 = zzgxxVar6;
                                        i27 = i7922;
                                        if (i38 != i27) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i34 = i58;
                                        if (i48 == 2) {
                                            zzgzv zzgzvVar3 = (zzgzv) zzhadVar2;
                                            i38 = zzgxy.zzh(bArr, i44, zzgxxVar8);
                                            int i80 = zzgxxVar8.zza + i38;
                                            while (i38 < i80) {
                                                i38 = zzgxy.zzh(bArr, i38, zzgxxVar8);
                                                zzgzvVar3.zzh(zzgyt.zzF(zzgxxVar8.zza));
                                            }
                                            if (i38 != i80) {
                                                throw zzhag.zzj();
                                            }
                                        } else if (i48 == 0) {
                                            zzgzv zzgzvVar4 = (zzgzv) zzhadVar2;
                                            i38 = zzgxy.zzh(bArr, i44, zzgxxVar8);
                                            zzgzvVar4.zzh(zzgyt.zzF(zzgxxVar8.zza));
                                            while (i38 < i59) {
                                                int zzh13 = zzgxy.zzh(bArr, i38, zzgxxVar8);
                                                if (i34 == zzgxxVar8.zza) {
                                                    i38 = zzgxy.zzh(bArr, zzh13, zzgxxVar8);
                                                    zzgzvVar4.zzh(zzgyt.zzF(zzgxxVar8.zza));
                                                }
                                            }
                                        } else {
                                            i27 = i44;
                                            zzgxxVar5 = zzgxxVar8;
                                            i29 = i34;
                                            i28 = i47;
                                            i30 = i46;
                                            i10 = i63;
                                            unsafe4 = unsafe3;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        i27 = i44;
                                        zzgxxVar5 = zzgxxVar8;
                                        i29 = i34;
                                        i28 = i47;
                                        i30 = i46;
                                        i10 = i63;
                                        unsafe4 = unsafe3;
                                        if (i38 != i27) {
                                        }
                                        break;
                                    case 34:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                        if (i48 == 2) {
                                            zzhat zzhatVar5 = (zzhat) zzhadVar2;
                                            i38 = zzgxy.zzh(bArr, i44, zzgxxVar8);
                                            int i81 = zzgxxVar8.zza + i38;
                                            while (i38 < i81) {
                                                i38 = zzgxy.zzk(bArr, i38, zzgxxVar8);
                                                zzhatVar5.zzg(zzgyt.zzG(zzgxxVar8.zzb));
                                            }
                                            if (i38 != i81) {
                                                throw zzhag.zzj();
                                            }
                                            i27 = i44;
                                            zzgxxVar5 = zzgxxVar8;
                                            i28 = i47;
                                            i29 = i58;
                                            i30 = i46;
                                            i10 = i63;
                                            unsafe4 = unsafe3;
                                            if (i38 != i27) {
                                            }
                                        } else if (i48 == 0) {
                                            zzhat zzhatVar6 = (zzhat) zzhadVar2;
                                            i38 = zzgxy.zzk(bArr, i44, zzgxxVar8);
                                            zzhatVar6.zzg(zzgyt.zzG(zzgxxVar8.zzb));
                                            while (true) {
                                                if (i38 < i59) {
                                                    int zzh14 = zzgxy.zzh(bArr, i38, zzgxxVar8);
                                                    i34 = i58;
                                                    if (i34 == zzgxxVar8.zza) {
                                                        i38 = zzgxy.zzk(bArr, zzh14, zzgxxVar8);
                                                        zzhatVar6.zzg(zzgyt.zzG(zzgxxVar8.zzb));
                                                        i58 = i34;
                                                    }
                                                } else {
                                                    i34 = i58;
                                                }
                                            }
                                            i27 = i44;
                                            zzgxxVar5 = zzgxxVar8;
                                            i29 = i34;
                                            i28 = i47;
                                            i30 = i46;
                                            i10 = i63;
                                            unsafe4 = unsafe3;
                                            if (i38 != i27) {
                                            }
                                        } else {
                                            i27 = i44;
                                            zzgxxVar5 = zzgxxVar8;
                                            i28 = i47;
                                            i29 = i58;
                                            i30 = i46;
                                            i10 = i63;
                                            unsafe4 = unsafe3;
                                            i38 = i27;
                                            if (i38 != i27) {
                                            }
                                        }
                                        break;
                                    default:
                                        i27 = i44;
                                        i28 = i47;
                                        i29 = i58;
                                        i30 = i46;
                                        i10 = i63;
                                        unsafe4 = unsafe3;
                                        if (i48 == 3) {
                                            int i82 = (i29 & (-8)) | 4;
                                            zzhby zzx2 = zzx(i28);
                                            zzgxxVar5 = zzgxxVar8;
                                            i38 = zzgxy.zzc(zzx2, bArr, i27, i2, i82, zzgxxVar);
                                            zzhadVar2.add(zzgxxVar5.zzc);
                                            while (i38 < i59) {
                                                int zzh15 = zzgxy.zzh(bArr, i38, zzgxxVar5);
                                                if (i29 == zzgxxVar5.zza) {
                                                    i38 = zzgxy.zzc(zzx2, bArr, zzh15, i2, i82, zzgxxVar);
                                                    zzhadVar2.add(zzgxxVar5.zzc);
                                                } else if (i38 != i27) {
                                                }
                                            }
                                            if (i38 != i27) {
                                            }
                                        }
                                        zzgxxVar5 = zzgxxVar8;
                                        i38 = i27;
                                        if (i38 != i27) {
                                        }
                                        break;
                                }
                            }
                        } else if (i48 == 2) {
                            zzhad zzhadVar3 = (zzhad) unsafe7.getObject(obj2, j);
                            if (!zzhadVar3.zzc()) {
                                int size2 = zzhadVar3.size();
                                zzhadVar3 = zzhadVar3.zzd(size2 != 0 ? size2 + size2 : 10);
                                unsafe7.putObject(obj2, j, zzhadVar3);
                            }
                            zzhby zzx3 = zzx(i47);
                            i41 = i47;
                            i40 = i46;
                            i38 = zzgxy.zze(zzx3, i58, bArr, i44, i2, zzhadVar3, zzgxxVar);
                            i35 = i2;
                            unsafe5 = unsafe7;
                            zzgxxVar7 = zzgxxVar8;
                            i36 = -1;
                            i39 = i11;
                            i42 = i58;
                            i37 = 1048575;
                        } else {
                            i21 = i44;
                            i10 = i43;
                            i22 = i47;
                            i12 = i46;
                            zzgxxVar4 = zzgxxVar8;
                            unsafe2 = unsafe7;
                            i26 = i58;
                            i14 = i22;
                            unsafe = unsafe2;
                            i9 = i21;
                            zzgxxVar2 = zzgxxVar4;
                            i6 = i26;
                        }
                        if (i6 != i4) {
                        }
                        if (this.zzh) {
                        }
                        i15 = i12;
                        i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                        i40 = i15;
                        zzgxxVar7 = zzgxxVar2;
                        i42 = i6;
                        i36 = i13;
                        i43 = i10;
                        i39 = i11;
                        i41 = i14;
                        unsafe5 = unsafe;
                        i37 = 1048575;
                    }
                    i35 = i2;
                }
                i4 = i3;
                if (i6 != i4) {
                }
                if (this.zzh) {
                }
                i15 = i12;
                i38 = zzgxy.zzg(i6, bArr, i9, i2, zzd(obj), zzgxxVar);
                i40 = i15;
                zzgxxVar7 = zzgxxVar2;
                i42 = i6;
                i36 = i13;
                i43 = i10;
                i39 = i11;
                i41 = i14;
                unsafe5 = unsafe;
                i37 = 1048575;
                i35 = i2;
            } else {
                i4 = i3;
                unsafe = unsafe5;
                i5 = i38;
                i6 = i42;
                i7 = i37;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final Object zze() {
        return ((zzgzu) this.zzg).zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgzu) {
                zzgzu zzgzuVar = (zzgzu) obj;
                zzgzuVar.zzaV(Integer.MAX_VALUE);
                zzgzuVar.zza = 0;
                zzgzuVar.zzaT();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i2;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
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
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            case 30:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
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
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                this.zzm.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzhay) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zze(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzhcz.zzr(obj, j, zzhcz.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzhcz.zzs(obj, j, zzhcz.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzhcz.zzu(obj, j, zzhcz.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzhcz.zzu(obj, j, zzhcz.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzhcz.zzt(obj, j, zzhcz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzhcz.zzu(obj, j, zzhcz.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzhcz.zzt(obj, j, zzhcz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzhcz.zzp(obj, j, zzhcz.zzz(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzhcz.zzv(obj, j, zzhcz.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzhcz.zzv(obj, j, zzhcz.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzhcz.zzt(obj, j, zzhcz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzhcz.zzt(obj, j, zzhcz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzhcz.zzt(obj, j, zzhcz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzhcz.zzu(obj, j, zzhcz.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzhcz.zzt(obj, j, zzhcz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzhcz.zzu(obj, j, zzhcz.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzhca.zza;
                    zzhcz.zzv(obj, j, zzhaz.zzb(zzhcz.zzh(obj, j), zzhcz.zzh(obj2, j)));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i3, i)) {
                        zzhcz.zzv(obj, j, zzhcz.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzF(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj2, i3, i)) {
                        zzhcz.zzv(obj, j, zzhcz.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzhca.zzq(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0649 A[LOOP:2: B:38:0x0645->B:40:0x0649, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0611 A[Catch: all -> 0x0606, TryCatch #4 {all -> 0x0606, blocks: (B:17:0x05e5, B:46:0x060c, B:48:0x0611, B:49:0x0616), top: B:16:0x05e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x061c A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzhbq zzhbqVar, zzgzf zzgzfVar) throws IOException {
        Object obj2;
        zzhcp zzhcpVar;
        Object obj3;
        int i;
        zzhcp zzhcpVar2;
        Object obj4;
        zzgzg zzgzgVar;
        zzgzf zzgzfVar2;
        Object obj5;
        Object obj6 = obj;
        zzgzf zzgzfVar3 = zzgzfVar;
        zzgzfVar.getClass();
        zzD(obj);
        zzhcp zzhcpVar3 = this.zzn;
        zzgzg zzgzgVar2 = this.zzo;
        Object obj7 = null;
        zzgzk zzgzkVar = null;
        while (true) {
            try {
                int zzc = zzhbqVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    zzhcpVar = zzhcpVar3;
                    obj3 = obj6;
                    try {
                        int zzu = zzu(zzq);
                        try {
                        } catch (zzhaf unused) {
                            obj2 = obj7;
                            zzgzgVar = zzgzgVar2;
                            zzgzfVar2 = zzgzfVar3;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzr(obj3, zzu & 1048575, zzhbqVar.zza());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 1:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzs(obj3, zzu & 1048575, zzhbqVar.zzb());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 2:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzu(obj3, zzu & 1048575, zzhbqVar.zzl());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 3:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzu(obj3, zzu & 1048575, zzhbqVar.zzo());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 4:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzt(obj3, zzu & 1048575, zzhbqVar.zzg());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 5:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzu(obj3, zzu & 1048575, zzhbqVar.zzk());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 6:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzt(obj3, zzu & 1048575, zzhbqVar.zzf());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 7:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzp(obj3, zzu & 1048575, zzhbqVar.zzN());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 8:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzG(obj3, zzu, zzhbqVar);
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 9:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbe zzhbeVar = (zzhbe) zzA(obj3, zzq);
                                zzhbqVar.zzu(zzhbeVar, zzx(zzq), zzgzfVar2);
                                zzJ(obj3, zzq, zzhbeVar);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 10:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzv(obj3, zzu & 1048575, zzhbqVar.zzp());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 11:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzt(obj3, zzu & 1048575, zzhbqVar.zzj());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 12:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                int zze = zzhbqVar.zze();
                                zzgzy zzw = zzw(zzq);
                                if (zzw != null && !zzw.zza(zze)) {
                                    obj7 = zzhca.zzp(obj3, zzc, zze, obj5, zzhcpVar);
                                    obj6 = obj3;
                                    zzgzgVar2 = zzgzgVar;
                                    zzgzfVar3 = zzgzfVar2;
                                    zzhcpVar3 = zzhcpVar;
                                }
                                zzhcz.zzt(obj3, zzu & 1048575, zze);
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                                break;
                            case 13:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzt(obj3, zzu & 1048575, zzhbqVar.zzh());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 14:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzu(obj3, zzu & 1048575, zzhbqVar.zzm());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 15:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzt(obj3, zzu & 1048575, zzhbqVar.zzi());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 16:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhcz.zzu(obj3, zzu & 1048575, zzhbqVar.zzn());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 17:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbe zzhbeVar2 = (zzhbe) zzA(obj3, zzq);
                                zzhbqVar.zzt(zzhbeVar2, zzx(zzq), zzgzfVar2);
                                zzJ(obj3, zzq, zzhbeVar2);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 18:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzx(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 19:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzB(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 20:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzE(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 21:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzM(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 22:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzD(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 23:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzA(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 24:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzz(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 25:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzv(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 26:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                if (zzM(zzu)) {
                                    ((zzgyu) zzhbqVar).zzK(this.zzm.zza(obj3, zzu & 1048575), true);
                                } else {
                                    ((zzgyu) zzhbqVar).zzK(this.zzm.zza(obj3, zzu & 1048575), false);
                                }
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 27:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzF(this.zzm.zza(obj3, zzu & 1048575), zzx(zzq), zzgzfVar2);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 28:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzw(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzL(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 30:
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                List zza2 = this.zzm.zza(obj3, zzu & 1048575);
                                zzhbqVar.zzy(zza2);
                                obj7 = zzhca.zzo(obj, zzc, zza2, zzw(zzq), obj7, zzhcpVar);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzG(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 32:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzH(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 33:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzI(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 34:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzJ(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 35:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzx(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 36:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzB(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 37:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzE(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 38:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzM(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 39:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzD(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 40:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzA(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 41:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzz(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 42:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzv(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 43:
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                zzhbqVar.zzL(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 44:
                                List zza3 = this.zzm.zza(obj3, zzu & 1048575);
                                zzhbqVar.zzy(zza3);
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj7 = zzhca.zzo(obj, zzc, zza3, zzw(zzq), obj7, zzhcpVar);
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 45:
                                zzhbqVar.zzG(this.zzm.zza(obj3, zzu & 1048575));
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 46:
                                zzhbqVar.zzH(this.zzm.zza(obj3, zzu & 1048575));
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 47:
                                zzhbqVar.zzI(this.zzm.zza(obj3, zzu & 1048575));
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                zzhbqVar.zzJ(this.zzm.zza(obj3, zzu & 1048575));
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                zzhbqVar.zzC(this.zzm.zza(obj3, zzu & 1048575), zzx(zzq), zzgzfVar3);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 50:
                                Object zzz = zzz(zzq);
                                long zzu2 = zzu(zzq) & 1048575;
                                Object zzh = zzhcz.zzh(obj3, zzu2);
                                if (zzh == null) {
                                    zzh = zzhay.zza().zzb();
                                    zzhcz.zzv(obj3, zzu2, zzh);
                                } else if (zzhaz.zza(zzh)) {
                                    Object zzb2 = zzhay.zza().zzb();
                                    zzhaz.zzb(zzb2, zzh);
                                    zzhcz.zzv(obj3, zzu2, zzb2);
                                    zzh = zzb2;
                                }
                                throw null;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                zzhcz.zzv(obj3, zzu & 1048575, Double.valueOf(zzhbqVar.zza()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                zzhcz.zzv(obj3, zzu & 1048575, Float.valueOf(zzhbqVar.zzb()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                zzhcz.zzv(obj3, zzu & 1048575, Long.valueOf(zzhbqVar.zzl()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                zzhcz.zzv(obj3, zzu & 1048575, Long.valueOf(zzhbqVar.zzo()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                zzhcz.zzv(obj3, zzu & 1048575, Integer.valueOf(zzhbqVar.zzg()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 56:
                                zzhcz.zzv(obj3, zzu & 1048575, Long.valueOf(zzhbqVar.zzk()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 57:
                                zzhcz.zzv(obj3, zzu & 1048575, Integer.valueOf(zzhbqVar.zzf()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 58:
                                zzhcz.zzv(obj3, zzu & 1048575, Boolean.valueOf(zzhbqVar.zzN()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 59:
                                zzG(obj3, zzu, zzhbqVar);
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                zzhbe zzhbeVar3 = (zzhbe) zzB(obj3, zzc, zzq);
                                zzhbqVar.zzu(zzhbeVar3, zzx(zzq), zzgzfVar3);
                                zzK(obj3, zzc, zzq, zzhbeVar3);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                zzhcz.zzv(obj3, zzu & 1048575, zzhbqVar.zzp());
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 62:
                                zzhcz.zzv(obj3, zzu & 1048575, Integer.valueOf(zzhbqVar.zzj()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                int zze2 = zzhbqVar.zze();
                                zzgzy zzw2 = zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze2)) {
                                    obj7 = zzhca.zzp(obj3, zzc, zze2, obj7, zzhcpVar);
                                    obj6 = obj3;
                                    zzhcpVar3 = zzhcpVar;
                                }
                                zzhcz.zzv(obj3, zzu & 1048575, Integer.valueOf(zze2));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                                break;
                            case 64:
                                zzhcz.zzv(obj3, zzu & 1048575, Integer.valueOf(zzhbqVar.zzh()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                zzhcz.zzv(obj3, zzu & 1048575, Long.valueOf(zzhbqVar.zzm()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                zzhcz.zzv(obj3, zzu & 1048575, Integer.valueOf(zzhbqVar.zzi()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                zzhcz.zzv(obj3, zzu & 1048575, Long.valueOf(zzhbqVar.zzn()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            case 68:
                                zzhbe zzhbeVar4 = (zzhbe) zzB(obj3, zzc, zzq);
                                zzhbqVar.zzt(zzhbeVar4, zzx(zzq), zzgzfVar3);
                                zzK(obj3, zzc, zzq, zzhbeVar4);
                                obj5 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                obj7 = obj5;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                            default:
                                obj2 = obj7;
                                zzgzgVar = zzgzgVar2;
                                zzgzfVar2 = zzgzfVar3;
                                if (obj2 == null) {
                                    try {
                                        obj7 = zzhcpVar.zzc(obj3);
                                    } catch (zzhaf unused2) {
                                        obj7 = obj2;
                                        zzhcpVar.zzq(zzhbqVar);
                                        if (obj7 == null) {
                                        }
                                        if (!zzhcpVar.zzp(obj7, zzhbqVar)) {
                                        }
                                        obj6 = obj3;
                                        zzgzgVar2 = zzgzgVar;
                                        zzgzfVar3 = zzgzfVar2;
                                        zzhcpVar3 = zzhcpVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj7 = obj2;
                                        while (i < this.zzl) {
                                        }
                                        if (obj7 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    obj7 = obj2;
                                }
                                try {
                                    try {
                                        if (!zzhcpVar.zzp(obj7, zzhbqVar)) {
                                            for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                                obj7 = zzy(obj, this.zzj[i2], obj7, zzhcpVar, obj);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        while (i < this.zzl) {
                                        }
                                        if (obj7 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (zzhaf unused3) {
                                    zzhcpVar.zzq(zzhbqVar);
                                    if (obj7 == null) {
                                        obj7 = zzhcpVar.zzc(obj3);
                                    }
                                    if (!zzhcpVar.zzp(obj7, zzhbqVar)) {
                                        for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                            obj7 = zzy(obj, this.zzj[i3], obj7, zzhcpVar, obj);
                                        }
                                        if (obj7 == null) {
                                        }
                                    }
                                    obj6 = obj3;
                                    zzgzgVar2 = zzgzgVar;
                                    zzgzfVar3 = zzgzfVar2;
                                    zzhcpVar3 = zzhcpVar;
                                }
                                obj6 = obj3;
                                zzgzgVar2 = zzgzgVar;
                                zzgzfVar3 = zzgzfVar2;
                                zzhcpVar3 = zzhcpVar;
                                break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = obj7;
                        obj7 = obj2;
                        while (i < this.zzl) {
                        }
                        if (obj7 != null) {
                        }
                        throw th;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        obj7 = zzy(obj, this.zzj[i4], obj7, zzhcpVar3, obj);
                    }
                    zzhcpVar = zzhcpVar3;
                    obj3 = obj6;
                } else {
                    try {
                        Object zzc2 = !this.zzh ? null : zzgzgVar2.zzc(zzgzfVar3, this.zzg, zzc);
                        if (zzc2 != null) {
                            if (zzgzkVar == null) {
                                zzgzkVar = zzgzgVar2.zzb(obj6);
                            }
                            zzgzk zzgzkVar2 = zzgzkVar;
                            zzhcpVar2 = zzhcpVar3;
                            obj4 = obj6;
                            try {
                                obj7 = zzgzgVar2.zzd(obj, zzhbqVar, zzc2, zzgzfVar, zzgzkVar2, obj7, zzhcpVar2);
                                zzgzkVar = zzgzkVar2;
                            } catch (Throwable th4) {
                                th = th4;
                                obj3 = obj4;
                                zzhcpVar = zzhcpVar2;
                                obj2 = obj7;
                                obj7 = obj2;
                                for (i = this.zzk; i < this.zzl; i++) {
                                    obj7 = zzy(obj, this.zzj[i], obj7, zzhcpVar, obj);
                                }
                                if (obj7 != null) {
                                    zzhcpVar.zzn(obj3, obj7);
                                }
                                throw th;
                            }
                        } else {
                            zzhcpVar2 = zzhcpVar3;
                            obj4 = obj6;
                            zzhcpVar2.zzq(zzhbqVar);
                            if (obj7 == null) {
                                obj7 = zzhcpVar2.zzc(obj4);
                            }
                            try {
                                if (!zzhcpVar2.zzp(obj7, zzhbqVar)) {
                                    int i5 = this.zzk;
                                    while (i5 < this.zzl) {
                                        zzhcp zzhcpVar4 = zzhcpVar2;
                                        obj7 = zzy(obj, this.zzj[i5], obj7, zzhcpVar4, obj);
                                        i5++;
                                        obj4 = obj4;
                                        zzhcpVar2 = zzhcpVar4;
                                    }
                                    obj3 = obj4;
                                    zzhcpVar = zzhcpVar2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj3 = obj4;
                                zzhcpVar = zzhcpVar2;
                                while (i < this.zzl) {
                                }
                                if (obj7 != null) {
                                }
                                throw th;
                            }
                        }
                        obj6 = obj4;
                        zzhcpVar3 = zzhcpVar2;
                    } catch (Throwable th6) {
                        th = th6;
                        zzhcpVar = zzhcpVar3;
                        obj3 = obj6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                obj2 = obj7;
                zzhcpVar = zzhcpVar3;
                obj3 = obj6;
            }
        }
        if (obj7 == null) {
            zzhcpVar.zzn(obj3, obj7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgxx zzgxxVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgxxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzs;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzhcz.zzb(obj, j)) == Double.doubleToLongBits(zzhcz.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzhcz.zzc(obj, j)) == Float.floatToIntBits(zzhcz.zzc(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzhcz.zzf(obj, j) == zzhcz.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzhcz.zzf(obj, j) == zzhcz.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzhcz.zzd(obj, j) == zzhcz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzhcz.zzf(obj, j) == zzhcz.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzhcz.zzd(obj, j) == zzhcz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzhcz.zzz(obj, j) == zzhcz.zzz(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzhca.zzs(zzhcz.zzh(obj, j), zzhcz.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzhca.zzs(zzhcz.zzh(obj, j), zzhcz.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzhca.zzs(zzhcz.zzh(obj, j), zzhcz.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzhcz.zzd(obj, j) == zzhcz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzhcz.zzd(obj, j) == zzhcz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzhcz.zzd(obj, j) == zzhcz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzhcz.zzf(obj, j) == zzhcz.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzhcz.zzd(obj, j) == zzhcz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzhcz.zzf(obj, j) == zzhcz.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzhca.zzs(zzhcz.zzh(obj, j), zzhcz.zzh(obj2, j))) {
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
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzs = zzhca.zzs(zzhcz.zzh(obj, j), zzhcz.zzh(obj2, j));
                    break;
                case 50:
                    zzs = zzhca.zzs(zzhcz.zzh(obj, j), zzhcz.zzh(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                case 68:
                    long zzr = zzr(i) & 1048575;
                    if (zzhcz.zzd(obj, zzr) == zzhcz.zzd(obj2, zzr) && zzhca.zzs(zzhcz.zzh(obj, j), zzhcz.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzs) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i7, i6) && !zzP(obj, zzu, zzx(i6))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzhay) zzhcz.zzh(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhcz.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhby zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i6, i, i2, i10) && !zzP(obj, zzu, zzx(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzm(Object obj, zzgzb zzgzbVar) throws IOException {
        int i;
        int i2;
        int i3;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < iArr.length) {
            int zzu = zzu(i7);
            int[] iArr2 = this.zzc;
            int zzt = zzt(zzu);
            int i8 = iArr2[i7];
            if (zzt <= 17) {
                int i9 = iArr2[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = zzu & i4;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzf(i8, zzhcz.zzb(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzo(i8, zzhcz.zzc(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzt(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzJ(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzr(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzm(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzk(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzb(i8, zzhcz.zzz(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzT(i8, unsafe.getObject(obj, j), zzgzbVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzv(i8, unsafe.getObject(obj, j), zzx(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzd(i8, (zzgyl) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzH(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzi(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzw(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzy(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzA(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzC(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgzbVar.zzq(i8, unsafe.getObject(obj, j), zzx(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzhca.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 19:
                    zzhca.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 20:
                    zzhca.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 21:
                    zzhca.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 22:
                    zzhca.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 23:
                    zzhca.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 24:
                    zzhca.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 25:
                    zzhca.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 26:
                    int i11 = this.zzc[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzhca.zza;
                    if (list != null && !list.isEmpty()) {
                        zzgzbVar.zzG(i11, list);
                        break;
                    }
                    break;
                case 27:
                    int i13 = this.zzc[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzhby zzx = zzx(i7);
                    int i14 = zzhca.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            zzgzbVar.zzv(i13, list2.get(i15), zzx);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i16 = this.zzc[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzhca.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzgzbVar.zze(i16, list3);
                        break;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    zzhca.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 30:
                    zzhca.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    zzhca.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 32:
                    zzhca.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 33:
                    zzhca.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 34:
                    zzhca.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, false);
                    break;
                case 35:
                    zzhca.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 36:
                    zzhca.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 37:
                    zzhca.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 38:
                    zzhca.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 39:
                    zzhca.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 40:
                    zzhca.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 41:
                    zzhca.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 42:
                    zzhca.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 43:
                    zzhca.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 44:
                    zzhca.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 45:
                    zzhca.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 46:
                    zzhca.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case 47:
                    zzhca.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzhca.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgzbVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    int i18 = this.zzc[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzhby zzx2 = zzx(i7);
                    int i19 = zzhca.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            zzgzbVar.zzq(i18, list4.get(i20), zzx2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzf(i8, zzn(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzo(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzt(i8, zzv(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzJ(i8, zzv(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzr(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzm(i8, zzv(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzk(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzb(i8, zzS(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i8, i7)) {
                        zzT(i8, unsafe.getObject(obj, j), zzgzbVar);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzv(i8, unsafe.getObject(obj, j), zzx(i7));
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzd(i8, (zzgyl) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzH(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzi(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzw(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzy(i8, zzv(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzA(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzC(i8, zzv(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i8, i7)) {
                        zzgzbVar.zzq(i8, unsafe.getObject(obj, j), zzx(i7));
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        zzhcp zzhcpVar = this.zzn;
        zzhcpVar.zzr(zzhcpVar.zzd(obj), zzgzbVar);
    }
}
