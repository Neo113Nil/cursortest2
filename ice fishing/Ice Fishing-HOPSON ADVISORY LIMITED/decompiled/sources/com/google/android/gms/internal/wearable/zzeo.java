package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzeo<T> implements zzey<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzp();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzel zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzfi zzm;
    private final zzct zzn;

    private zzeo(int[] iArr, Object[] objArr, int i, int i2, zzel zzelVar, boolean z, int[] iArr2, int i3, int i4, zzeq zzeqVar, zzdy zzdyVar, zzfi zzfiVar, zzct zzctVar, zzeg zzegVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzelVar instanceof zzdg;
        boolean z2 = false;
        if (zzctVar != null && (zzelVar instanceof zzdd)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzfiVar;
        this.zzn = zzctVar;
        this.zzg = zzelVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzdg) {
            return ((zzdg) obj).zzL();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (zzE(obj)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        String.valueOf(valueOf);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(valueOf)));
    }

    private static int zzG(Object obj, long j) {
        return ((Integer) zzfp.zzm(obj, j)).intValue();
    }

    private static long zzH(Object obj, long j) {
        return ((Long) zzfp.zzm(obj, j)).longValue();
    }

    private final boolean zzI(Object obj, Object obj2, int i) {
        return zzK(obj, i) == zzK(obj2, i);
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzK(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzK(Object obj, int i) {
        int zzB = zzB(i);
        long j = zzB & 1048575;
        if (j != 1048575) {
            return (zzfp.zzc(obj, j) & (1 << (zzB >>> 20))) != 0;
        }
        int zzA = zzA(i);
        long j2 = zzA & 1048575;
        switch (zzC(zzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzfp.zzk(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfp.zzi(obj, j2)) != 0;
            case 2:
                return zzfp.zze(obj, j2) != 0;
            case 3:
                return zzfp.zze(obj, j2) != 0;
            case 4:
                return zzfp.zzc(obj, j2) != 0;
            case 5:
                return zzfp.zze(obj, j2) != 0;
            case 6:
                return zzfp.zzc(obj, j2) != 0;
            case 7:
                return zzfp.zzg(obj, j2);
            case 8:
                Object zzm = zzfp.zzm(obj, j2);
                return zzm instanceof String ? !((String) zzm).isEmpty() : zzm instanceof zzcg ? !zzcg.zza.equals(zzm) : zzR();
            case 9:
                return zzfp.zzm(obj, j2) != null;
            case 10:
                return !zzcg.zza.equals(zzfp.zzm(obj, j2));
            case 11:
                return zzfp.zzc(obj, j2) != 0;
            case 12:
                return zzfp.zzc(obj, j2) != 0;
            case 13:
                return zzfp.zzc(obj, j2) != 0;
            case 14:
                return zzfp.zze(obj, j2) != 0;
            case 15:
                return zzfp.zzc(obj, j2) != 0;
            case 16:
                return zzfp.zze(obj, j2) != 0;
            case 17:
                return zzfp.zzm(obj, j2) != null;
            default:
                return zzR();
        }
    }

    private final void zzL(Object obj, int i) {
        int zzB = zzB(i);
        long j = 1048575 & zzB;
        if (j == 1048575) {
            return;
        }
        zzfp.zzd(obj, j, (1 << (zzB >>> 20)) | zzfp.zzc(obj, j));
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzfp.zzc(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        long zzB = zzB(i) & 1048575;
        return zzfp.zzc(obj, zzB) == zzfp.zzc(obj2, zzB);
    }

    private final void zzO(Object obj, int i, int i2) {
        zzfp.zzd(obj, zzB(i2) & 1048575, i);
    }

    private final int zzP(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, 0);
    }

    private final int zzQ(int i, int i2) {
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

    private boolean zzR() {
        throw new IllegalArgumentException();
    }

    private static final void zzS(int i, Object obj, zzfx zzfxVar) throws IOException {
        if (obj instanceof String) {
            zzfxVar.zzm(i, (String) obj);
        } else {
            zzfxVar.zzn(i, (zzcg) obj);
        }
    }

    static zzfj zzh(Object obj) {
        zzdg zzdgVar = (zzdg) obj;
        zzfj zzfjVar = zzdgVar.zzc;
        if (zzfjVar != zzfj.zza()) {
            return zzfjVar;
        }
        zzfj zzb2 = zzfj.zzb();
        zzdgVar.zzc = zzb2;
        return zzb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzeo zzm(Class cls, zzei zzeiVar, zzeq zzeqVar, zzdy zzdyVar, zzfi zzfiVar, zzct zzctVar, zzeg zzegVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        char charAt3;
        int i8;
        int i9;
        char charAt4;
        int i10;
        char charAt5;
        int i11;
        char charAt6;
        int i12;
        char charAt7;
        int i13;
        char charAt8;
        int i14;
        char charAt9;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zzew zzewVar;
        String str;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        Field zzn;
        int i23;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field zzn2;
        Object obj2;
        Field zzn3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        int i31;
        char charAt14;
        if (!(zzeiVar instanceof zzew)) {
            throw null;
        }
        zzew zzewVar2 = (zzew) zzeiVar;
        String zzd = zzewVar2.zzd();
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
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i34 = charAt15 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                charAt14 = zzd.charAt(i33);
                if (charAt14 < 55296) {
                    break;
                }
                i34 |= (charAt14 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            charAt15 = i34 | (charAt14 << i35);
            i33 = i31;
        }
        if (charAt15 == 0) {
            i6 = 0;
            charAt = 0;
            charAt2 = 0;
            i5 = 0;
            i3 = 0;
            i2 = 0;
            iArr = zza;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt16 = zzd.charAt(i33);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    charAt9 = zzd.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                charAt16 = i37 | (charAt9 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int charAt17 = zzd.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    charAt8 = zzd.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                charAt17 = i40 | (charAt8 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int charAt18 = zzd.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    charAt7 = zzd.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                charAt18 = i43 | (charAt7 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int charAt19 = zzd.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    charAt6 = zzd.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                charAt19 = i46 | (charAt6 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            charAt = zzd.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    charAt5 = zzd.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                charAt = i49 | (charAt5 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            charAt2 = zzd.charAt(i48);
            if (charAt2 >= 55296) {
                int i52 = charAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    charAt4 = zzd.charAt(i51);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                charAt2 = i52 | (charAt4 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            if (zzd.charAt(i51) >= 55296) {
                while (true) {
                    i8 = i54 + 1;
                    if (zzd.charAt(i54) < 55296) {
                        break;
                    }
                    i54 = i8;
                }
                i54 = i8;
            }
            int i55 = i54 + 1;
            int charAt20 = zzd.charAt(i54);
            if (charAt20 >= 55296) {
                int i56 = charAt20 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    charAt3 = zzd.charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i7;
                }
                charAt20 = i56 | (charAt3 << i57);
                i55 = i7;
            }
            int i58 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt20 + charAt2 + charAt16];
            i2 = charAt20;
            i3 = charAt19;
            i4 = charAt16;
            i33 = i55;
            i5 = charAt18;
            i6 = i58;
            iArr = iArr2;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzewVar2.zze();
        Class<?> cls2 = zzewVar2.zzb().getClass();
        int i59 = i2 + charAt2;
        int i60 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i60];
        int i61 = i2;
        int i62 = i59;
        int i63 = 0;
        int i64 = 0;
        while (i33 < length) {
            int i65 = i33 + 1;
            int charAt21 = zzd.charAt(i33);
            if (charAt21 >= c) {
                int i66 = charAt21 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i30 = i67 + 1;
                    charAt13 = zzd.charAt(i67);
                    if (charAt13 < c) {
                        break;
                    }
                    i66 |= (charAt13 & 8191) << i68;
                    i68 += 13;
                    i67 = i30;
                }
                charAt21 = i66 | (charAt13 << i68);
                i15 = i30;
            } else {
                i15 = i65;
            }
            int i69 = i15 + 1;
            int charAt22 = zzd.charAt(i15);
            if (charAt22 >= c) {
                int i70 = charAt22 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i29 = i71 + 1;
                    charAt12 = zzd.charAt(i71);
                    if (charAt12 < c) {
                        break;
                    }
                    i70 |= (charAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i29;
                }
                charAt22 = i70 | (charAt12 << i72);
                i16 = i29;
            } else {
                i16 = i69;
            }
            if ((charAt22 & 1024) != 0) {
                iArr[i63] = i64;
                i63++;
            }
            int i73 = charAt22 & 255;
            int i74 = length;
            int i75 = charAt22 & 2048;
            int i76 = i3;
            if (i73 >= 51) {
                int i77 = i16 + 1;
                int charAt23 = zzd.charAt(i16);
                if (charAt23 >= 55296) {
                    int i78 = charAt23 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i28 = i79 + 1;
                        charAt11 = zzd.charAt(i79);
                        i17 = i5;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i78 |= (charAt11 & 8191) << i80;
                        i80 += 13;
                        i79 = i28;
                        i5 = i17;
                    }
                    charAt23 = i78 | (charAt11 << i80);
                    i26 = i28;
                } else {
                    i17 = i5;
                    i26 = i77;
                }
                int i81 = i73 - 51;
                int i82 = i26;
                if (i81 == 9 || i81 == 17) {
                    i27 = i6 + 1;
                    int i83 = i64 / 3;
                    objArr[i83 + i83 + 1] = zze[i6];
                } else {
                    if (i81 == 12) {
                        if (zzewVar2.zzc() == 1 || i75 != 0) {
                            i27 = i6 + 1;
                            int i84 = i64 / 3;
                            objArr[i84 + i84 + 1] = zze[i6];
                        } else {
                            i75 = 0;
                        }
                    }
                    int i85 = charAt23 + charAt23;
                    obj = zze[i85];
                    if (obj instanceof Field) {
                        zzn2 = zzn(cls2, (String) obj);
                        zze[i85] = zzn2;
                        iArr[i62] = i64;
                        i62++;
                    } else {
                        zzn2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzn2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    int i87 = i75;
                    if (obj2 instanceof Field) {
                        zzn3 = zzn(cls2, (String) obj2);
                        zze[i86] = zzn3;
                    } else {
                        zzn3 = (Field) obj2;
                    }
                    i21 = objectFieldOffset2;
                    i18 = i6;
                    i75 = i87;
                    zzewVar = zzewVar2;
                    i20 = (int) unsafe.objectFieldOffset(zzn3);
                    i16 = i82;
                    i22 = 0;
                    i19 = charAt21;
                    str = zzd;
                }
                i6 = i27;
                int i852 = charAt23 + charAt23;
                obj = zze[i852];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzn2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                int i872 = i75;
                if (obj2 instanceof Field) {
                }
                i21 = objectFieldOffset22;
                i18 = i6;
                i75 = i872;
                zzewVar = zzewVar2;
                i20 = (int) unsafe.objectFieldOffset(zzn3);
                i16 = i82;
                i22 = 0;
                i19 = charAt21;
                str = zzd;
            } else {
                i17 = i5;
                i18 = i6 + 1;
                Field zzn4 = zzn(cls2, (String) zze[i6]);
                i19 = charAt21;
                if (i73 == 9 || i73 == 17) {
                    zzewVar = zzewVar2;
                    int i88 = i64 / 3;
                    objArr[i88 + i88 + 1] = zzn4.getType();
                } else {
                    if (i73 == 27) {
                        zzewVar = zzewVar2;
                        i24 = 1;
                        i25 = i6 + 2;
                    } else if (i73 == 49) {
                        i25 = i6 + 2;
                        zzewVar = zzewVar2;
                        i24 = 1;
                    } else {
                        if (i73 == 12 || i73 == 30 || i73 == 44) {
                            zzewVar = zzewVar2;
                            if (zzewVar2.zzc() == 1 || i75 != 0) {
                                i25 = i6 + 2;
                                int i89 = i64 / 3;
                                objArr[i89 + i89 + 1] = zze[i18];
                                str = zzd;
                                i18 = i25;
                            } else {
                                str = zzd;
                                i75 = 0;
                            }
                        } else if (i73 == 50) {
                            int i90 = i6 + 2;
                            int i91 = i61 + 1;
                            iArr[i61] = i64;
                            int i92 = i64 / 3;
                            int i93 = i92 + i92;
                            objArr[i93] = zze[i18];
                            if (i75 != 0) {
                                i18 = i6 + 3;
                                objArr[i93 + 1] = zze[i90];
                                str = zzd;
                                i61 = i91;
                                zzewVar = zzewVar2;
                            } else {
                                i18 = i90;
                                i61 = i91;
                                i75 = 0;
                                zzewVar = zzewVar2;
                            }
                        } else {
                            zzewVar = zzewVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                        i20 = 1048575;
                        if ((charAt22 & 4096) != 0 || i73 > 17) {
                            i21 = objectFieldOffset;
                            i22 = 0;
                        } else {
                            int i94 = i16 + 1;
                            int charAt24 = str.charAt(i16);
                            if (charAt24 >= 55296) {
                                int i95 = charAt24 & 8191;
                                int i96 = 13;
                                while (true) {
                                    i23 = i94 + 1;
                                    charAt10 = str.charAt(i94);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i95 |= (charAt10 & 8191) << i96;
                                    i96 += 13;
                                    i94 = i23;
                                }
                                charAt24 = i95 | (charAt10 << i96);
                                i94 = i23;
                            }
                            int i97 = i4 + i4 + (charAt24 / 32);
                            Object obj3 = zze[i97];
                            i21 = objectFieldOffset;
                            if (obj3 instanceof Field) {
                                zzn = (Field) obj3;
                            } else {
                                zzn = zzn(cls2, (String) obj3);
                                zze[i97] = zzn;
                            }
                            i20 = (int) unsafe.objectFieldOffset(zzn);
                            i22 = charAt24 % 32;
                            i16 = i94;
                        }
                    }
                    int i98 = i64 / 3;
                    objArr[i98 + i98 + i24] = zze[i18];
                    str = zzd;
                    i18 = i25;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                    i20 = 1048575;
                    if ((charAt22 & 4096) != 0) {
                    }
                    i21 = objectFieldOffset;
                    i22 = 0;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                i20 = 1048575;
                if ((charAt22 & 4096) != 0) {
                }
                i21 = objectFieldOffset;
                i22 = 0;
            }
            int i99 = i64 + 1;
            iArr3[i64] = i19;
            int i100 = i64 + 2;
            Class<?> cls3 = cls2;
            iArr3[i99] = (i75 != 0 ? Integer.MIN_VALUE : 0) | ((charAt22 & 512) != 0 ? 536870912 : 0) | ((charAt22 & 256) != 0 ? 268435456 : 0) | (i73 << 20) | i21;
            i64 += 3;
            iArr3[i100] = (i22 << 20) | i20;
            zzd = str;
            i33 = i16;
            i6 = i18;
            length = i74;
            i3 = i76;
            cls2 = cls3;
            zzewVar2 = zzewVar;
            i5 = i17;
            c = 55296;
        }
        return new zzeo(iArr3, objArr, i5, i3, zzewVar2.zzb(), false, iArr, i2, i59, zzeqVar, zzdyVar, zzfiVar, zzctVar, zzegVar);
    }

    private static Field zzn(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(name).length() + 29 + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        if (zzK(obj2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zzey zzq = zzq(i);
            if (!zzK(obj, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzL(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zzey zzq = zzq(i);
            if (!zzM(obj, i2, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final zzey zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzey zzeyVar = (zzey) objArr[i3];
        if (zzeyVar != null) {
            return zzeyVar;
        }
        zzey zzb2 = zzeu.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzdl zzs(int i) {
        int i2 = i / 3;
        return (zzdl) this.zzd[i2 + i2 + 1];
    }

    private final Object zzt(Object obj, int i) {
        zzey zzq = zzq(i);
        int zzA = zzA(i) & 1048575;
        if (!zzK(obj, i)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzu(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzL(obj, i);
    }

    private final Object zzv(Object obj, int i, int i2) {
        zzey zzq = zzq(i2);
        if (!zzM(obj, i, i2)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzw(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzO(obj, i, i2);
    }

    private final Object zzx(Object obj, int i, Object obj2, zzfi zzfiVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzm = zzfp.zzm(obj, zzA(i) & 1048575);
        if (zzm == null || zzs(i) == null) {
            return obj2;
        }
        throw null;
    }

    private static boolean zzy(Object obj, int i, zzey zzeyVar) {
        return zzeyVar.zzl(zzfp.zzm(obj, i & 1048575));
    }

    private final void zzz(Object obj, int i, zzex zzexVar) throws IOException {
        long j = i & 1048575;
        if (zzD(i)) {
            zzfp.zzn(obj, j, zzexVar.zzm());
        } else if (this.zzi) {
            zzfp.zzn(obj, j, zzexVar.zzl());
        } else {
            zzfp.zzn(obj, j, zzexVar.zzp());
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final Object zza() {
        return ((zzdg) this.zzg).zzO();
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c2, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.wearable.zzey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(Object obj, Object obj2) {
        boolean zzB;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzA = zzA(i);
            int zzC = zzC(zzA);
            if (zzC <= 50 || zzC >= 69) {
                long j = zzA & 1048575;
                switch (zzC) {
                    case 0:
                        if (zzI(obj, obj2, i) && Double.doubleToLongBits(zzfp.zzk(obj, j)) == Double.doubleToLongBits(zzfp.zzk(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 1:
                        if (zzI(obj, obj2, i) && Float.floatToIntBits(zzfp.zzi(obj, j)) == Float.floatToIntBits(zzfp.zzi(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 2:
                        if (zzI(obj, obj2, i) && zzfp.zze(obj, j) == zzfp.zze(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 3:
                        if (zzI(obj, obj2, i) && zzfp.zze(obj, j) == zzfp.zze(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 4:
                        if (zzI(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 5:
                        if (zzI(obj, obj2, i) && zzfp.zze(obj, j) == zzfp.zze(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 6:
                        if (zzI(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 7:
                        if (zzI(obj, obj2, i) && zzfp.zzg(obj, j) == zzfp.zzg(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 8:
                        if (zzI(obj, obj2, i) && zzez.zzB(zzfp.zzm(obj, j), zzfp.zzm(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 9:
                        if (zzI(obj, obj2, i) && zzez.zzB(zzfp.zzm(obj, j), zzfp.zzm(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 10:
                        if (zzI(obj, obj2, i) && zzez.zzB(zzfp.zzm(obj, j), zzfp.zzm(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 11:
                        if (zzI(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 12:
                        if (zzI(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 13:
                        if (zzI(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 14:
                        if (zzI(obj, obj2, i) && zzfp.zze(obj, j) == zzfp.zze(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 15:
                        if (zzI(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 16:
                        if (zzI(obj, obj2, i) && zzfp.zze(obj, j) == zzfp.zze(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 17:
                        if (zzI(obj, obj2, i) && zzez.zzB(zzfp.zzm(obj, j), zzfp.zzm(obj2, j))) {
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
                        zzB = zzez.zzB(zzfp.zzm(obj, j), zzfp.zzm(obj2, j));
                        break;
                    case 50:
                        zzB = zzez.zzB(zzfp.zzm(obj, j), zzfp.zzm(obj2, j));
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
                        if (zzN(obj, obj2, i) && zzez.zzB(zzfp.zzm(obj, j), zzfp.zzm(obj2, j))) {
                            continue;
                        }
                        return false;
                }
                if (!zzB) {
                    return false;
                }
            }
        }
        int i2 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i2 >= iArr.length) {
                if (!((zzdg) obj).zzc.equals(((zzdg) obj2).zzc)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zzdd) obj).zzb.equals(((zzdd) obj2).zzb);
                }
                return true;
            }
            int i3 = iArr[i2];
            if (!zzN(obj, obj2, i3)) {
                return false;
            }
            if (!zzM(obj, 0, i3)) {
                long zzA2 = zzA(i3) & 1048575;
                if (!zzez.zzB(zzfp.zzm(obj, zzA2), zzfp.zzm(obj2, zzA2))) {
                    return false;
                }
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final int zzc(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzA = zzA(i4);
            int zzC = zzC(zzA);
            if (zzC <= 50 || zzC >= 69) {
                long j = zzA & 1048575;
                int i5 = 37;
                switch (zzC) {
                    case 0:
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzfp.zzk(obj, j));
                        byte[] bArr = zzdq.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 1:
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zzfp.zzi(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    case 2:
                        i = i3 * 53;
                        doubleToLongBits = zzfp.zze(obj, j);
                        byte[] bArr2 = zzdq.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 3:
                        i = i3 * 53;
                        doubleToLongBits = zzfp.zze(obj, j);
                        byte[] bArr3 = zzdq.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 4:
                        i = i3 * 53;
                        floatToIntBits = zzfp.zzc(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 5:
                        i = i3 * 53;
                        doubleToLongBits = zzfp.zze(obj, j);
                        byte[] bArr4 = zzdq.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 6:
                        i = i3 * 53;
                        floatToIntBits = zzfp.zzc(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 7:
                        i = i3 * 53;
                        floatToIntBits = zzdq.zza(zzfp.zzg(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    case 8:
                        i = i3 * 53;
                        floatToIntBits = ((String) zzfp.zzm(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    case 9:
                        i2 = i3 * 53;
                        Object zzm = zzfp.zzm(obj, j);
                        if (zzm != null) {
                            i5 = zzm.hashCode();
                        }
                        i3 = i2 + i5;
                        break;
                    case 10:
                        i = i3 * 53;
                        floatToIntBits = zzfp.zzm(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    case 11:
                        i = i3 * 53;
                        floatToIntBits = zzfp.zzc(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 12:
                        i = i3 * 53;
                        floatToIntBits = zzfp.zzc(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 13:
                        i = i3 * 53;
                        floatToIntBits = zzfp.zzc(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 14:
                        i = i3 * 53;
                        doubleToLongBits = zzfp.zze(obj, j);
                        byte[] bArr5 = zzdq.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 15:
                        i = i3 * 53;
                        floatToIntBits = zzfp.zzc(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 16:
                        i = i3 * 53;
                        doubleToLongBits = zzfp.zze(obj, j);
                        byte[] bArr6 = zzdq.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 17:
                        i2 = i3 * 53;
                        Object zzm2 = zzfp.zzm(obj, j);
                        if (zzm2 != null) {
                            i5 = zzm2.hashCode();
                        }
                        i3 = i2 + i5;
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
                        i = i3 * 53;
                        floatToIntBits = zzfp.zzm(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    case 50:
                        i = i3 * 53;
                        floatToIntBits = zzfp.zzm(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i6 >= iArr.length) {
                int hashCode = (i3 * 53) + ((zzdg) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzdd) obj).zzb.zza.hashCode() : hashCode;
            }
            if (!zzM(obj, 0, iArr[i6])) {
                i3 = (i3 * 53) + zzfp.zzm(obj, zzA(r3) & 1048575).hashCode();
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzez.zzD(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzez.zzC(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzA = zzA(i);
            int i2 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i3 = iArr[i];
            long j = i2;
            switch (zzC) {
                case 0:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzl(obj, j, zzfp.zzk(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 1:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzj(obj, j, zzfp.zzi(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 2:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzf(obj, j, zzfp.zze(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 3:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzf(obj, j, zzfp.zze(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 4:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzd(obj, j, zzfp.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 5:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzf(obj, j, zzfp.zze(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 6:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzd(obj, j, zzfp.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 7:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzh(obj, j, zzfp.zzg(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 8:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzn(obj, j, zzfp.zzm(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i);
                    break;
                case 10:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzn(obj, j, zzfp.zzm(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 11:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzd(obj, j, zzfp.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 12:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzd(obj, j, zzfp.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 13:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzd(obj, j, zzfp.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 14:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzf(obj, j, zzfp.zze(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 15:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzd(obj, j, zzfp.zzc(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 16:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzf(obj, j, zzfp.zze(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i);
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
                    zzdp zzdpVar = (zzdp) zzfp.zzm(obj, j);
                    zzdp zzdpVar2 = (zzdp) zzfp.zzm(obj2, j);
                    int size = zzdpVar.size();
                    int size2 = zzdpVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzdpVar.zza()) {
                            zzdpVar = zzdpVar.zzg(size2 + size);
                        }
                        zzdpVar.addAll(zzdpVar2);
                    }
                    if (size > 0) {
                        zzdpVar2 = zzdpVar;
                    }
                    zzfp.zzn(obj, j, zzdpVar2);
                    break;
                case 50:
                    int i4 = zzez.zza;
                    zzfp.zzn(obj, j, zzeg.zzb(zzfp.zzm(obj, j), zzfp.zzm(obj2, j)));
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
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzfp.zzn(obj, j, zzfp.zzm(obj2, j));
                        zzO(obj, i3, i);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzfp.zzn(obj, j, zzfp.zzm(obj2, j));
                        zzO(obj, i3, i);
                        break;
                    }
                case 68:
                    zzp(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v256, types: [int] */
    /* JADX WARN: Type inference failed for: r0v263, types: [int] */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r0v281 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v120, types: [int] */
    /* JADX WARN: Type inference failed for: r1v123, types: [int] */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v169 */
    /* JADX WARN: Type inference failed for: r1v170 */
    /* JADX WARN: Type inference failed for: r1v80, types: [int] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r2v34, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [int] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [int] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v39, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.wearable.zzey
    public final int zze(Object obj) {
        int i;
        int i2;
        ?? r5;
        int zzu;
        int zzu2;
        int zzu3;
        int zzv;
        int zzu4;
        int zzu5;
        int zzb2;
        int zzu6;
        ?? zzo;
        int size;
        int zzu7;
        int zzb3;
        int zzu8;
        int zzb4;
        int zzu9;
        ?? r3;
        ?? r1;
        ?? r0;
        int zzx;
        int zzu10;
        int zzu11;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i3 = 1048575;
        ?? r12 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int zzi = i5 + ((zzdg) obj).zzc.zzi();
                if (!this.zzh) {
                    return zzi;
                }
                zzfe zzfeVar = ((zzdd) obj).zzb.zza;
                int zzc = zzfeVar.zzc();
                int i7 = 0;
                for (int i8 = 0; i8 < zzc; i8++) {
                    Map.Entry zzd = zzfeVar.zzd(i8);
                    i7 += zzcx.zzg((zzcw) ((zzfb) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zzfeVar.zze()) {
                    i7 += zzcx.zzg((zzcw) entry.getKey(), entry.getValue());
                }
                return zzi + i7;
            }
            int zzA = zzA(i4);
            int zzC = zzC(zzA);
            int i9 = iArr[i4];
            int i10 = iArr[i4 + 2];
            int i11 = i10 & i3;
            if (zzC <= 17) {
                if (i11 != i6) {
                    r12 = i11 == i3 ? z : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = i6;
                i2 = r12;
                r5 = 1 << (i10 >>> 20);
            } else {
                i = i6;
                i2 = r12;
                r5 = z;
            }
            int i12 = zzA & i3;
            if (zzC >= zzcy.DOUBLE_LIST_PACKED.zza()) {
                zzcy.SINT64_LIST_PACKED.zza();
            }
            long j = i12;
            switch (zzC) {
                case 0:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzu = zzcn.zzu(i9 << 3);
                        r0 = zzu + 8;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzu2 = zzcn.zzu(i9 << 3);
                        r0 = zzu2 + 4;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzv(j2);
                        r0 = zzu3 + zzv;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzv(j3);
                        r0 = zzu3 + zzv;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzv(j4);
                        r0 = zzu3 + zzv;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzu = zzcn.zzu(i9 << 3);
                        r0 = zzu + 8;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzu2 = zzcn.zzu(i9 << 3);
                        r0 = zzu2 + 4;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzu4 = zzcn.zzu(i9 << 3);
                        r0 = zzu4 + 1;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzcg) {
                            zzu5 = zzcn.zzu(i13);
                            zzb2 = ((zzcg) object).zzb();
                            zzu6 = zzcn.zzu(zzb2);
                        } else {
                            zzu5 = zzcn.zzu(i13);
                            zzb2 = zzfu.zzb((String) object);
                            zzu6 = zzcn.zzu(zzb2);
                        }
                        r0 = zzu5 + zzu6 + zzb2;
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
                case 9:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        zzey zzq = zzq(i4);
                        int i14 = zzez.zza;
                        zzu5 = zzcn.zzu(i9 << 3);
                        zzb2 = ((zzbr) object2).zzJ(zzq);
                        zzu6 = zzcn.zzu(zzb2);
                        r0 = zzu5 + zzu6 + zzb2;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzcg zzcgVar = (zzcg) unsafe.getObject(obj, j);
                        zzu5 = zzcn.zzu(i9 << 3);
                        zzb2 = zzcgVar.zzb();
                        zzu6 = zzcn.zzu(zzb2);
                        r0 = zzu5 + zzu6 + zzb2;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i15 = unsafe.getInt(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzu(i15);
                        r0 = zzu3 + zzv;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzv(j5);
                        r0 = zzu3 + zzv;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzu2 = zzcn.zzu(i9 << 3);
                        r0 = zzu2 + 4;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzu = zzcn.zzu(i9 << 3);
                        r0 = zzu + 8;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i16 = unsafe.getInt(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzu((i16 >> 31) ^ (i16 + i16));
                        r0 = zzu3 + zzv;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzv((j6 >> 63) ^ (j6 + j6));
                        r0 = zzu3 + zzv;
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
                    if (zzJ(obj, i4, i, i2, r5)) {
                        r0 = zzez.zzz(i9, (zzel) unsafe.getObject(obj, j), zzq(i4));
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
                    r0 = zzez.zzy(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 19:
                    r0 = zzez.zzw(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzez.zza;
                    if (list.size() != 0) {
                        zzo = zzez.zzo(list) + (list.size() * zzcn.zzu(i9 << 3));
                        i5 += zzo;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    zzo = z;
                    i5 += zzo;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i18 = zzez.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzu3 = zzez.zzp(list2);
                        zzu7 = zzcn.zzu(i9 << 3);
                        zzv = size * zzu7;
                        r0 = zzu3 + zzv;
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
                    int i19 = zzez.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzu3 = zzez.zzs(list3);
                        zzu7 = zzcn.zzu(i9 << 3);
                        zzv = size * zzu7;
                        r0 = zzu3 + zzv;
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
                    r0 = zzez.zzy(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 24:
                    r0 = zzez.zzw(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i20 = zzez.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzcn.zzu(i9 << 3) + 1);
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
                    int i21 = zzez.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzu12 = zzcn.zzu(i9 << 3) * size3;
                        if (r02 instanceof zzdx) {
                            zzdx zzdxVar = (zzdx) r02;
                            zzo = zzu12;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object zzc2 = zzdxVar.zzc();
                                if (zzc2 instanceof zzcg) {
                                    zzb4 = ((zzcg) zzc2).zzb();
                                    zzu9 = zzcn.zzu(zzb4);
                                } else {
                                    zzb4 = zzfu.zzb((String) zzc2);
                                    zzu9 = zzcn.zzu(zzb4);
                                }
                                zzo += zzu9 + zzb4;
                            }
                        } else {
                            zzo = zzu12;
                            for (?? r33 = z; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zzcg) {
                                    zzb3 = ((zzcg) obj2).zzb();
                                    zzu8 = zzcn.zzu(zzb3);
                                } else {
                                    zzb3 = zzfu.zzb((String) obj2);
                                    zzu8 = zzcn.zzu(zzb3);
                                }
                                zzo += zzu8 + zzb3;
                            }
                        }
                        i5 += zzo;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    zzo = z;
                    i5 += zzo;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zzey zzq2 = zzq(i4);
                    int i22 = zzez.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        r3 = zzcn.zzu(i9 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            int zzJ = ((zzbr) r03.get(r42)).zzJ(zzq2);
                            r3 = (r3 == true ? 1 : 0) + zzcn.zzu(zzJ) + zzJ;
                        }
                    }
                    i5 += r3;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i23 = zzez.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        r1 = z;
                    } else {
                        r1 = size5 * zzcn.zzu(i9 << 3);
                        for (?? r2 = z; r2 < r04.size(); r2++) {
                            int zzb5 = ((zzcg) r04.get(r2)).zzb();
                            r1 += zzcn.zzu(zzb5) + zzb5;
                        }
                    }
                    i5 += r1;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i24 = zzez.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzu3 = zzez.zzt(list5);
                        zzu7 = zzcn.zzu(i9 << 3);
                        zzv = size * zzu7;
                        r0 = zzu3 + zzv;
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
                    int i25 = zzez.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzu3 = zzez.zzr(list6);
                        zzu7 = zzcn.zzu(i9 << 3);
                        zzv = size * zzu7;
                        r0 = zzu3 + zzv;
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
                case 31:
                    r0 = zzez.zzw(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 32:
                    r0 = zzez.zzy(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i26 = zzez.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzu3 = zzez.zzu(list7);
                        zzu7 = zzcn.zzu(i9 << 3);
                        zzv = size * zzu7;
                        r0 = zzu3 + zzv;
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
                    int i27 = zzez.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzu3 = zzez.zzq(list8);
                        zzu7 = zzcn.zzu(i9 << 3);
                        zzv = size * zzu7;
                        r0 = zzu3 + zzv;
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
                    zzx = zzez.zzx((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzv((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzo((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzp((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzs((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzx((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzv((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    int i28 = zzez.zza;
                    zzx = list9.size();
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzt((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzr((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzv((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzx((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                    zzx = zzez.zzu((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                case 48:
                    zzx = zzez.zzq((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzu10 = zzcn.zzu(i9 << 3);
                        zzu11 = zzcn.zzu(zzx);
                        r1 = zzu10 + zzu11 + zzx;
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
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zzey zzq3 = zzq(i4);
                    int i29 = zzez.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        ?? r34 = z2;
                        while (r34 < size6) {
                            int zzz = zzez.zzz(i9, (zzel) r05.get(r34), zzq3);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zzz;
                        }
                    }
                    i5 += r4;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 50:
                    zzef zzefVar = (zzef) unsafe.getObject(obj, j);
                    if (zzefVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzefVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 51:
                    if (zzM(obj, i9, i4)) {
                        zzu = zzcn.zzu(i9 << 3);
                        r0 = zzu + 8;
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
                case 52:
                    if (zzM(obj, i9, i4)) {
                        zzu2 = zzcn.zzu(i9 << 3);
                        r0 = zzu2 + 4;
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
                case 53:
                    if (zzM(obj, i9, i4)) {
                        long zzH = zzH(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzv(zzH);
                        r0 = zzu3 + zzv;
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
                case 54:
                    if (zzM(obj, i9, i4)) {
                        long zzH2 = zzH(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzv(zzH2);
                        r0 = zzu3 + zzv;
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
                case 55:
                    if (zzM(obj, i9, i4)) {
                        long zzG = zzG(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzv(zzG);
                        r0 = zzu3 + zzv;
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
                    if (zzM(obj, i9, i4)) {
                        zzu = zzcn.zzu(i9 << 3);
                        r0 = zzu + 8;
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
                    if (zzM(obj, i9, i4)) {
                        zzu2 = zzcn.zzu(i9 << 3);
                        r0 = zzu2 + 4;
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
                    if (zzM(obj, i9, i4)) {
                        zzu4 = zzcn.zzu(i9 << 3);
                        r0 = zzu4 + 1;
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
                    if (zzM(obj, i9, i4)) {
                        int i30 = i9 << 3;
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof zzcg) {
                            zzu5 = zzcn.zzu(i30);
                            zzb2 = ((zzcg) object3).zzb();
                            zzu6 = zzcn.zzu(zzb2);
                        } else {
                            zzu5 = zzcn.zzu(i30);
                            zzb2 = zzfu.zzb((String) object3);
                            zzu6 = zzcn.zzu(zzb2);
                        }
                        r0 = zzu5 + zzu6 + zzb2;
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
                case 60:
                    if (zzM(obj, i9, i4)) {
                        Object object4 = unsafe.getObject(obj, j);
                        zzey zzq4 = zzq(i4);
                        int i31 = zzez.zza;
                        zzu5 = zzcn.zzu(i9 << 3);
                        zzb2 = ((zzbr) object4).zzJ(zzq4);
                        zzu6 = zzcn.zzu(zzb2);
                        r0 = zzu5 + zzu6 + zzb2;
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
                case 61:
                    if (zzM(obj, i9, i4)) {
                        zzcg zzcgVar2 = (zzcg) unsafe.getObject(obj, j);
                        zzu5 = zzcn.zzu(i9 << 3);
                        zzb2 = zzcgVar2.zzb();
                        zzu6 = zzcn.zzu(zzb2);
                        r0 = zzu5 + zzu6 + zzb2;
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
                    if (zzM(obj, i9, i4)) {
                        int zzG2 = zzG(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzu(zzG2);
                        r0 = zzu3 + zzv;
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
                case 63:
                    if (zzM(obj, i9, i4)) {
                        long zzG3 = zzG(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzv(zzG3);
                        r0 = zzu3 + zzv;
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
                    if (zzM(obj, i9, i4)) {
                        zzu2 = zzcn.zzu(i9 << 3);
                        r0 = zzu2 + 4;
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
                case 65:
                    if (zzM(obj, i9, i4)) {
                        zzu = zzcn.zzu(i9 << 3);
                        r0 = zzu + 8;
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
                case 66:
                    if (zzM(obj, i9, i4)) {
                        int zzG4 = zzG(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzu((zzG4 >> 31) ^ (zzG4 + zzG4));
                        r0 = zzu3 + zzv;
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
                case 67:
                    if (zzM(obj, i9, i4)) {
                        long zzH3 = zzH(obj, j);
                        zzu3 = zzcn.zzu(i9 << 3);
                        zzv = zzcn.zzv((zzH3 >> 63) ^ (zzH3 + zzH3));
                        r0 = zzu3 + zzv;
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
                    if (zzM(obj, i9, i4)) {
                        r0 = zzez.zzz(i9, (zzel) unsafe.getObject(obj, j), zzq(i4));
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
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.wearable.zzey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzfx zzfxVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr2;
        if (this.zzh) {
            zzcx zzcxVar = ((zzdd) obj).zzb;
            if (!zzcxVar.zza.isEmpty()) {
                entry = (Map.Entry) zzcxVar.zzc().next();
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i5 = 1048575;
                int i6 = 1048575;
                int i7 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzA = zzA(i);
                    int zzC = zzC(zzA);
                    int i8 = iArr[i];
                    if (zzC <= 17) {
                        int i9 = iArr[i + 2];
                        int i10 = i9 & i5;
                        if (i10 != i6) {
                            i7 = i10 == i5 ? 0 : unsafe.getInt(obj, i10);
                            i6 = i10;
                        }
                        i2 = i6;
                        i3 = i7;
                        i4 = 1 << (i9 >>> 20);
                    } else {
                        i2 = i6;
                        i3 = i7;
                        i4 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = zzA & i5;
                    switch (zzC) {
                        case 0:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzf(i8, zzfp.zzk(obj, j));
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 1:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zze(i8, zzfp.zzi(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 2:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzc(i8, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 3:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzh(i8, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 4:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzi(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 5:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzj(i8, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 6:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzk(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 7:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzl(i8, zzfp.zzg(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 8:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzS(i8, unsafe.getObject(obj, j), zzfxVar);
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 9:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzr(i8, unsafe.getObject(obj, j), zzq(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 10:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzn(i8, (zzcg) unsafe.getObject(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 11:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzo(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 12:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzg(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 13:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzb(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 14:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzd(i8, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 15:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzp(i8, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 16:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzq(i8, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 17:
                            iArr2 = iArr;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzfxVar.zzs(i8, unsafe.getObject(obj, j), zzq(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i6 = i2;
                            i7 = i3;
                            iArr = iArr2;
                            i5 = 1048575;
                        case 18:
                            zzez.zza(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 19:
                            zzez.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 20:
                            zzez.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 21:
                            zzez.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 22:
                            zzez.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 23:
                            zzez.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 24:
                            zzez.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 25:
                            zzez.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 26:
                            int i11 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i12 = zzez.zza;
                            if (list != null && !list.isEmpty()) {
                                zzfxVar.zzF(i11, list);
                                break;
                            }
                            break;
                        case 27:
                            int i13 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzey zzq = zzq(i);
                            int i14 = zzez.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((zzco) zzfxVar).zzr(i13, list2.get(i15), zzq);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i16 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i17 = zzez.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzfxVar.zzG(i16, list3);
                                break;
                            }
                            break;
                        case 29:
                            zzez.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 30:
                            zzez.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 31:
                            zzez.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 32:
                            zzez.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 33:
                            zzez.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 34:
                            zzez.zze(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            break;
                        case 35:
                            zzez.zza(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 36:
                            zzez.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 37:
                            zzez.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 38:
                            zzez.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 39:
                            zzez.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 40:
                            zzez.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 41:
                            zzez.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 42:
                            zzez.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 43:
                            zzez.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 44:
                            zzez.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 45:
                            zzez.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 46:
                            zzez.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 47:
                            zzez.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 48:
                            zzez.zze(iArr[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            break;
                        case 49:
                            int i18 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzey zzq2 = zzq(i);
                            int i19 = zzez.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((zzco) zzfxVar).zzs(i18, list4.get(i20), zzq2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            break;
                        case 51:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzf(i8, ((Double) zzfp.zzm(obj, j)).doubleValue());
                                break;
                            }
                            break;
                        case 52:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zze(i8, ((Float) zzfp.zzm(obj, j)).floatValue());
                                break;
                            }
                            break;
                        case 53:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzc(i8, zzH(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzh(i8, zzH(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzi(i8, zzG(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzj(i8, zzH(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzk(i8, zzG(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzl(i8, ((Boolean) zzfp.zzm(obj, j)).booleanValue());
                                break;
                            }
                            break;
                        case 59:
                            if (zzM(obj, i8, i)) {
                                zzS(i8, unsafe.getObject(obj, j), zzfxVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzr(i8, unsafe.getObject(obj, j), zzq(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzn(i8, (zzcg) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzo(i8, zzG(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzg(i8, zzG(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzb(i8, zzG(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzd(i8, zzH(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzp(i8, zzG(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzq(i8, zzH(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzM(obj, i8, i)) {
                                zzfxVar.zzs(i8, unsafe.getObject(obj, j), zzq(i));
                                break;
                            }
                            break;
                    }
                    iArr2 = iArr;
                    i += 3;
                    i6 = i2;
                    i7 = i3;
                    iArr = iArr2;
                    i5 = 1048575;
                }
                if (entry != null) {
                    ((zzdg) obj).zzc.zzg(zzfxVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i52 = 1048575;
        int i62 = 1048575;
        int i72 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        if (entry != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:314:0x0518 A[LOOP:5: B:312:0x0514->B:314:0x0518, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0529  */
    @Override // com.google.android.gms.internal.wearable.zzey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(Object obj, zzex zzexVar, zzcs zzcsVar) throws IOException {
        int i;
        zzcsVar.getClass();
        zzF(obj);
        zzfi zzfiVar = this.zzm;
        Object obj2 = null;
        while (true) {
            try {
                int zzb2 = zzexVar.zzb();
                int zzP = zzP(zzb2);
                if (zzP >= 0) {
                    int zzA = zzA(zzP);
                    try {
                    } catch (zzdu unused) {
                        if (obj2 == null) {
                            obj2 = zzfiVar.zzh(obj);
                        }
                        if (!zzfiVar.zzk(obj2, zzexVar, 0)) {
                            for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                zzx(obj, this.zzj[i2], obj2, zzfiVar, obj);
                            }
                            if (obj2 != null) {
                                zzfiVar.zzi(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                    switch (zzC(zzA)) {
                        case 0:
                            zzfp.zzl(obj, zzA & 1048575, zzexVar.zzd());
                            zzL(obj, zzP);
                        case 1:
                            zzfp.zzj(obj, zzA & 1048575, zzexVar.zze());
                            zzL(obj, zzP);
                        case 2:
                            zzfp.zzf(obj, zzA & 1048575, zzexVar.zzg());
                            zzL(obj, zzP);
                        case 3:
                            zzfp.zzf(obj, zzA & 1048575, zzexVar.zzf());
                            zzL(obj, zzP);
                        case 4:
                            zzfp.zzd(obj, zzA & 1048575, zzexVar.zzh());
                            zzL(obj, zzP);
                        case 5:
                            zzfp.zzf(obj, zzA & 1048575, zzexVar.zzi());
                            zzL(obj, zzP);
                        case 6:
                            zzfp.zzd(obj, zzA & 1048575, zzexVar.zzj());
                            zzL(obj, zzP);
                        case 7:
                            zzfp.zzh(obj, zzA & 1048575, zzexVar.zzk());
                            zzL(obj, zzP);
                        case 8:
                            zzz(obj, zzA, zzexVar);
                            zzL(obj, zzP);
                        case 9:
                            zzel zzelVar = (zzel) zzt(obj, zzP);
                            zzexVar.zzn(zzelVar, zzq(zzP), zzcsVar);
                            zzu(obj, zzP, zzelVar);
                        case 10:
                            zzfp.zzn(obj, zzA & 1048575, zzexVar.zzp());
                            zzL(obj, zzP);
                        case 11:
                            zzfp.zzd(obj, zzA & 1048575, zzexVar.zzq());
                            zzL(obj, zzP);
                        case 12:
                            int zzr = zzexVar.zzr();
                            zzdl zzs = zzs(zzP);
                            if (zzs != null && !zzs.zza(zzr)) {
                                obj2 = zzez.zzF(obj, zzb2, zzr, obj2, zzfiVar);
                            }
                            zzfp.zzd(obj, zzA & 1048575, zzr);
                            zzL(obj, zzP);
                            break;
                        case 13:
                            zzfp.zzd(obj, zzA & 1048575, zzexVar.zzs());
                            zzL(obj, zzP);
                        case 14:
                            zzfp.zzf(obj, zzA & 1048575, zzexVar.zzt());
                            zzL(obj, zzP);
                        case 15:
                            zzfp.zzd(obj, zzA & 1048575, zzexVar.zzu());
                            zzL(obj, zzP);
                        case 16:
                            zzfp.zzf(obj, zzA & 1048575, zzexVar.zzv());
                            zzL(obj, zzP);
                        case 17:
                            zzel zzelVar2 = (zzel) zzt(obj, zzP);
                            zzexVar.zzo(zzelVar2, zzq(zzP), zzcsVar);
                            zzu(obj, zzP, zzelVar2);
                        case 18:
                            zzexVar.zzw(zzdy.zza(obj, zzA & 1048575));
                        case 19:
                            zzexVar.zzx(zzdy.zza(obj, zzA & 1048575));
                        case 20:
                            zzexVar.zzz(zzdy.zza(obj, zzA & 1048575));
                        case 21:
                            zzexVar.zzy(zzdy.zza(obj, zzA & 1048575));
                        case 22:
                            zzexVar.zzA(zzdy.zza(obj, zzA & 1048575));
                        case 23:
                            zzexVar.zzB(zzdy.zza(obj, zzA & 1048575));
                        case 24:
                            zzexVar.zzC(zzdy.zza(obj, zzA & 1048575));
                        case 25:
                            zzexVar.zzD(zzdy.zza(obj, zzA & 1048575));
                        case 26:
                            if (zzD(zzA)) {
                                ((zzck) zzexVar).zzE(zzdy.zza(obj, zzA & 1048575), true);
                            } else {
                                ((zzck) zzexVar).zzE(zzdy.zza(obj, zzA & 1048575), false);
                            }
                        case 27:
                            zzexVar.zzF(zzdy.zza(obj, zzA & 1048575), zzq(zzP), zzcsVar);
                        case 28:
                            zzexVar.zzH(zzdy.zza(obj, zzA & 1048575));
                        case 29:
                            zzexVar.zzI(zzdy.zza(obj, zzA & 1048575));
                        case 30:
                            List zza2 = zzdy.zza(obj, zzA & 1048575);
                            zzexVar.zzJ(zza2);
                            obj2 = zzez.zzE(obj, zzb2, zza2, zzs(zzP), obj2, zzfiVar);
                        case 31:
                            zzexVar.zzK(zzdy.zza(obj, zzA & 1048575));
                        case 32:
                            zzexVar.zzL(zzdy.zza(obj, zzA & 1048575));
                        case 33:
                            zzexVar.zzM(zzdy.zza(obj, zzA & 1048575));
                        case 34:
                            zzexVar.zzN(zzdy.zza(obj, zzA & 1048575));
                        case 35:
                            zzexVar.zzw(zzdy.zza(obj, zzA & 1048575));
                        case 36:
                            zzexVar.zzx(zzdy.zza(obj, zzA & 1048575));
                        case 37:
                            zzexVar.zzz(zzdy.zza(obj, zzA & 1048575));
                        case 38:
                            zzexVar.zzy(zzdy.zza(obj, zzA & 1048575));
                        case 39:
                            zzexVar.zzA(zzdy.zza(obj, zzA & 1048575));
                        case 40:
                            zzexVar.zzB(zzdy.zza(obj, zzA & 1048575));
                        case 41:
                            zzexVar.zzC(zzdy.zza(obj, zzA & 1048575));
                        case 42:
                            zzexVar.zzD(zzdy.zza(obj, zzA & 1048575));
                        case 43:
                            zzexVar.zzI(zzdy.zza(obj, zzA & 1048575));
                        case 44:
                            List zza3 = zzdy.zza(obj, zzA & 1048575);
                            zzexVar.zzJ(zza3);
                            obj2 = zzez.zzE(obj, zzb2, zza3, zzs(zzP), obj2, zzfiVar);
                        case 45:
                            zzexVar.zzK(zzdy.zza(obj, zzA & 1048575));
                        case 46:
                            zzexVar.zzL(zzdy.zza(obj, zzA & 1048575));
                        case 47:
                            zzexVar.zzM(zzdy.zza(obj, zzA & 1048575));
                        case 48:
                            zzexVar.zzN(zzdy.zza(obj, zzA & 1048575));
                        case 49:
                            zzexVar.zzG(zzdy.zza(obj, zzA & 1048575), zzq(zzP), zzcsVar);
                        case 50:
                            Object zzr2 = zzr(zzP);
                            long zzA2 = zzA(zzP) & 1048575;
                            Object zzm = zzfp.zzm(obj, zzA2);
                            if (zzm == null) {
                                zzm = zzef.zza().zzc();
                                zzfp.zzn(obj, zzA2, zzm);
                            } else if (zzeg.zza(zzm)) {
                                Object zzc = zzef.zza().zzc();
                                zzeg.zzb(zzc, zzm);
                                zzfp.zzn(obj, zzA2, zzc);
                                zzm = zzc;
                            }
                            throw null;
                            break;
                        case 51:
                            zzfp.zzn(obj, zzA & 1048575, Double.valueOf(zzexVar.zzd()));
                            zzO(obj, zzb2, zzP);
                        case 52:
                            zzfp.zzn(obj, zzA & 1048575, Float.valueOf(zzexVar.zze()));
                            zzO(obj, zzb2, zzP);
                        case 53:
                            zzfp.zzn(obj, zzA & 1048575, Long.valueOf(zzexVar.zzg()));
                            zzO(obj, zzb2, zzP);
                        case 54:
                            zzfp.zzn(obj, zzA & 1048575, Long.valueOf(zzexVar.zzf()));
                            zzO(obj, zzb2, zzP);
                        case 55:
                            zzfp.zzn(obj, zzA & 1048575, Integer.valueOf(zzexVar.zzh()));
                            zzO(obj, zzb2, zzP);
                        case 56:
                            zzfp.zzn(obj, zzA & 1048575, Long.valueOf(zzexVar.zzi()));
                            zzO(obj, zzb2, zzP);
                        case 57:
                            zzfp.zzn(obj, zzA & 1048575, Integer.valueOf(zzexVar.zzj()));
                            zzO(obj, zzb2, zzP);
                        case 58:
                            zzfp.zzn(obj, zzA & 1048575, Boolean.valueOf(zzexVar.zzk()));
                            zzO(obj, zzb2, zzP);
                        case 59:
                            zzz(obj, zzA, zzexVar);
                            zzO(obj, zzb2, zzP);
                        case 60:
                            zzel zzelVar3 = (zzel) zzv(obj, zzb2, zzP);
                            zzexVar.zzn(zzelVar3, zzq(zzP), zzcsVar);
                            zzw(obj, zzb2, zzP, zzelVar3);
                        case 61:
                            zzfp.zzn(obj, zzA & 1048575, zzexVar.zzp());
                            zzO(obj, zzb2, zzP);
                        case 62:
                            zzfp.zzn(obj, zzA & 1048575, Integer.valueOf(zzexVar.zzq()));
                            zzO(obj, zzb2, zzP);
                        case 63:
                            int zzr3 = zzexVar.zzr();
                            zzdl zzs2 = zzs(zzP);
                            if (zzs2 != null && !zzs2.zza(zzr3)) {
                                obj2 = zzez.zzF(obj, zzb2, zzr3, obj2, zzfiVar);
                            }
                            zzfp.zzn(obj, zzA & 1048575, Integer.valueOf(zzr3));
                            zzO(obj, zzb2, zzP);
                            break;
                        case 64:
                            zzfp.zzn(obj, zzA & 1048575, Integer.valueOf(zzexVar.zzs()));
                            zzO(obj, zzb2, zzP);
                        case 65:
                            zzfp.zzn(obj, zzA & 1048575, Long.valueOf(zzexVar.zzt()));
                            zzO(obj, zzb2, zzP);
                        case 66:
                            zzfp.zzn(obj, zzA & 1048575, Integer.valueOf(zzexVar.zzu()));
                            zzO(obj, zzb2, zzP);
                        case 67:
                            zzfp.zzn(obj, zzA & 1048575, Long.valueOf(zzexVar.zzv()));
                            zzO(obj, zzb2, zzP);
                        case 68:
                            zzel zzelVar4 = (zzel) zzv(obj, zzb2, zzP);
                            zzexVar.zzo(zzelVar4, zzq(zzP), zzcsVar);
                            zzw(obj, zzb2, zzP, zzelVar4);
                        default:
                            if (obj2 == null) {
                                obj2 = zzfiVar.zzh(obj);
                            }
                            if (!zzfiVar.zzk(obj2, zzexVar, 0)) {
                                for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                    zzx(obj, this.zzj[i3], obj2, zzfiVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzx(obj, this.zzj[i4], obj2, zzfiVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzcsVar.zzc(this.zzg, zzb2)) != null) {
                        throw null;
                    }
                    if (obj2 == null) {
                        obj2 = zzfiVar.zzh(obj);
                    }
                    if (!zzfiVar.zzk(obj2, zzexVar, 0)) {
                        for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                            zzx(obj, this.zzj[i5], obj2, zzfiVar, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                while (i < this.zzl) {
                }
                if (obj2 != null) {
                }
                throw th;
            }
            for (i = this.zzk; i < this.zzl; i++) {
                zzx(obj, this.zzj[i], obj2, zzfiVar, obj);
            }
            if (obj2 != null) {
                zzfiVar.zzi(obj, obj2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0be0, code lost:
    
        if (r5 == r0) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0be2, code lost:
    
        r13.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0be6, code lost:
    
        r11 = r34.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0beb, code lost:
    
        if (r11 >= r34.zzl) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0bed, code lost:
    
        zzx(r35, r34.zzj[r11], null, r34.zzm, r35);
        r12 = (com.google.android.gms.internal.wearable.zzfj) null;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0c05, code lost:
    
        if (r9 != 0) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0c09, code lost:
    
        if (r8 != r38) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0c11, code lost:
    
        throw new com.google.android.gms.internal.wearable.zzdv("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0c18, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0c14, code lost:
    
        if (r8 > r38) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0c16, code lost:
    
        if (r10 != r9) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0c1e, code lost:
    
        throw new com.google.android.gms.internal.wearable.zzdv("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x08b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x08c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0b71 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzi(Object obj, byte[] bArr, int i, int i2, int i3, zzbw zzbwVar) throws IOException {
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzP;
        int i9;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe2;
        zzbw zzbwVar2;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe3;
        int i16;
        int i17;
        int i18;
        int i19;
        int zzc;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Unsafe unsafe4;
        int i25;
        long j;
        int i26;
        int i27;
        Unsafe unsafe5;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int zza2;
        int i33;
        Object obj2;
        int i34;
        Unsafe unsafe6;
        int i35;
        int zzk;
        int i36;
        zzbw zzbwVar3;
        int i37;
        int zzf;
        Object obj3 = obj;
        int i38 = i2;
        int i39 = i3;
        zzbw zzbwVar4 = zzbwVar;
        zzF(obj);
        Unsafe unsafe7 = zzb;
        int i40 = -1;
        int i41 = i;
        int i42 = -1;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 1048575;
        while (true) {
            if (i41 < i38) {
                int i47 = i41 + 1;
                int i48 = bArr[i41];
                if (i48 < 0) {
                    int zzb2 = zzbx.zzb(i48, bArr, i47, zzbwVar4);
                    i8 = zzbwVar4.zza;
                    i47 = zzb2;
                } else {
                    i8 = i48;
                }
                int i49 = i8 >>> 3;
                if (i49 > i42) {
                    zzP = (i49 < this.zze || i49 > this.zzf) ? i40 : zzQ(i49, i43 / 3);
                } else {
                    zzP = zzP(i49);
                }
                int i50 = zzP;
                if (i50 == i40) {
                    i9 = i47;
                    i10 = i45;
                    i11 = i46;
                    i12 = i40;
                    unsafe2 = unsafe7;
                    zzbwVar2 = zzbwVar4;
                    i4 = i39;
                    i13 = 0;
                    i14 = i49;
                } else {
                    int i51 = i8 & 7;
                    int[] iArr = this.zzc;
                    int i52 = iArr[i50 + 1];
                    int i53 = i49;
                    int zzC = zzC(i52);
                    long j2 = i52 & 1048575;
                    int i54 = i8;
                    if (zzC <= 17) {
                        int i55 = iArr[i50 + 2];
                        int i56 = 1 << (i55 >>> 20);
                        int i57 = 1048575;
                        int i58 = i55 & 1048575;
                        if (i58 != i46) {
                            if (i46 != 1048575) {
                                unsafe7.putInt(obj3, i46, i45);
                                i57 = 1048575;
                            }
                            i45 = i58 == i57 ? 0 : unsafe7.getInt(obj3, i58);
                            i11 = i58;
                        } else {
                            i11 = i46;
                        }
                        switch (zzC) {
                            case 0:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 1) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    i41 = i47 + 8;
                                    i45 |= i56;
                                    zzfp.zzl(obj3, j2, Double.longBitsToDouble(zzbx.zze(bArr, i47)));
                                    i38 = i2;
                                    i39 = i3;
                                    i44 = i18;
                                    i42 = i17;
                                    i43 = i16;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            case 1:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 5) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    i41 = i47 + 4;
                                    i45 |= i56;
                                    zzfp.zzj(obj3, j2, Float.intBitsToFloat(zzbx.zzd(bArr, i47)));
                                    i38 = i2;
                                    i39 = i3;
                                    i44 = i18;
                                    i42 = i17;
                                    i43 = i16;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            case 2:
                            case 3:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 0) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    i19 = i45 | i56;
                                    zzc = zzbx.zzc(bArr, i47, zzbwVar4);
                                    unsafe7.putLong(obj, j2, zzbwVar4.zzb);
                                    i38 = i2;
                                    i39 = i3;
                                    i44 = i18;
                                    i42 = i17;
                                    i43 = i16;
                                    i45 = i19;
                                    i41 = zzc;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            case 4:
                            case 11:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 0) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    i45 |= i56;
                                    i41 = zzbx.zza(bArr, i47, zzbwVar4);
                                    unsafe7.putInt(obj3, j2, zzbwVar4.zza);
                                    i38 = i2;
                                    i39 = i3;
                                    i44 = i18;
                                    i42 = i17;
                                    i43 = i16;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            case 5:
                            case 14:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 1) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    zzc = i47 + 8;
                                    i19 = i45 | i56;
                                    unsafe7.putLong(obj, j2, zzbx.zze(bArr, i47));
                                    i38 = i2;
                                    i39 = i3;
                                    i44 = i18;
                                    i42 = i17;
                                    i43 = i16;
                                    i45 = i19;
                                    i41 = zzc;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            case 6:
                            case 13:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 5) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    i41 = i47 + 4;
                                    i45 |= i56;
                                    unsafe7.putInt(obj3, j2, zzbx.zzd(bArr, i47));
                                    i38 = i2;
                                    i39 = i3;
                                    i44 = i18;
                                    i42 = i17;
                                    i43 = i16;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            case 7:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 0) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    i45 |= i56;
                                    i41 = zzbx.zzc(bArr, i47, zzbwVar4);
                                    zzfp.zzh(obj3, j2, zzbwVar4.zzb != 0);
                                    i38 = i2;
                                    i39 = i3;
                                    i44 = i18;
                                    i42 = i17;
                                    i43 = i16;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            case 8:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 2) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else if (zzD(i52)) {
                                    i41 = zzbx.zza(bArr, i47, zzbwVar4);
                                    i20 = zzbwVar4.zza;
                                    if (i20 < 0) {
                                        throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                    }
                                    i21 = i45 | i56;
                                    if (i20 == 0) {
                                        zzbwVar4.zzc = "";
                                        i45 = i21;
                                        unsafe7.putObject(obj3, j2, zzbwVar4.zzc);
                                        i38 = i2;
                                        i39 = i3;
                                        i44 = i18;
                                        i42 = i17;
                                        i43 = i16;
                                        i46 = i11;
                                        i40 = -1;
                                    } else {
                                        zzbwVar4.zzc = zzfu.zzd(bArr, i41, i20);
                                        i41 += i20;
                                        i45 = i21;
                                        unsafe7.putObject(obj3, j2, zzbwVar4.zzc);
                                        i38 = i2;
                                        i39 = i3;
                                        i44 = i18;
                                        i42 = i17;
                                        i43 = i16;
                                        i46 = i11;
                                        i40 = -1;
                                    }
                                } else {
                                    i41 = zzbx.zza(bArr, i47, zzbwVar4);
                                    i20 = zzbwVar4.zza;
                                    if (i20 < 0) {
                                        throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                    }
                                    i21 = i45 | i56;
                                    if (i20 == 0) {
                                        zzbwVar4.zzc = "";
                                        i45 = i21;
                                        unsafe7.putObject(obj3, j2, zzbwVar4.zzc);
                                        i38 = i2;
                                        i39 = i3;
                                        i44 = i18;
                                        i42 = i17;
                                        i43 = i16;
                                        i46 = i11;
                                        i40 = -1;
                                    } else {
                                        zzbwVar4.zzc = new String(bArr, i41, i20, StandardCharsets.UTF_8);
                                        i41 += i20;
                                        i45 = i21;
                                        unsafe7.putObject(obj3, j2, zzbwVar4.zzc);
                                        i38 = i2;
                                        i39 = i3;
                                        i44 = i18;
                                        i42 = i17;
                                        i43 = i16;
                                        i46 = i11;
                                        i40 = -1;
                                    }
                                }
                            case 9:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 2) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    Object zzt = zzt(obj3, i16);
                                    i41 = zzbx.zzi(zzt, zzq(i16), bArr, i47, i2, zzbwVar);
                                    zzu(obj3, i16, zzt);
                                    i38 = i2;
                                    i44 = i18;
                                    i42 = i17;
                                    i43 = i16;
                                    i45 |= i56;
                                    i46 = i11;
                                    i40 = -1;
                                    i39 = i3;
                                }
                            case 10:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 2) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    i45 |= i56;
                                    i41 = zzbx.zzf(bArr, i47, zzbwVar4);
                                    unsafe7.putObject(obj3, j2, zzbwVar4.zzc);
                                    i38 = i2;
                                    i39 = i3;
                                    i44 = i18;
                                    i42 = i17;
                                    i43 = i16;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            case 12:
                                i16 = i50;
                                i17 = i53;
                                if (i51 != 0) {
                                    i22 = i45;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i23 = i54;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    i41 = zzbx.zza(bArr, i47, zzbwVar4);
                                    int i59 = zzbwVar4.zza;
                                    zzdl zzs = zzs(i16);
                                    if ((i52 & Integer.MIN_VALUE) == 0 || zzs == null || zzs.zza(i59)) {
                                        i18 = i54;
                                        i45 |= i56;
                                        unsafe7.putInt(obj3, j2, i59);
                                    } else {
                                        i18 = i54;
                                        zzh(obj).zzk(i18, Long.valueOf(i59));
                                    }
                                    i38 = i2;
                                    i39 = i3;
                                    i44 = i18;
                                    i42 = i17;
                                    i43 = i16;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            case 15:
                                i16 = i50;
                                i17 = i53;
                                if (i51 != 0) {
                                    i22 = i45;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i23 = i54;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    i45 |= i56;
                                    i41 = zzbx.zza(bArr, i47, zzbwVar4);
                                    unsafe7.putInt(obj3, j2, zzcj.zzF(zzbwVar4.zza));
                                    i38 = i2;
                                    i39 = i3;
                                    i42 = i17;
                                    i43 = i16;
                                    i44 = i54;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            case 16:
                                if (i51 != 0) {
                                    i24 = i50;
                                    i22 = i45;
                                    unsafe4 = unsafe7;
                                    i23 = i54;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    int i60 = i45 | i56;
                                    int zzc2 = zzbx.zzc(bArr, i47, zzbwVar4);
                                    i17 = i53;
                                    i16 = i50;
                                    unsafe7.putLong(obj, j2, zzcj.zzG(zzbwVar4.zzb));
                                    i41 = zzc2;
                                    i38 = i2;
                                    i39 = i3;
                                    i45 = i60;
                                    i42 = i17;
                                    i43 = i16;
                                    i44 = i54;
                                    i46 = i11;
                                    i40 = -1;
                                }
                            default:
                                i16 = i50;
                                i17 = i53;
                                i18 = i54;
                                if (i51 != 3) {
                                    i22 = i45;
                                    i23 = i18;
                                    i53 = i17;
                                    i24 = i16;
                                    unsafe4 = unsafe7;
                                    i12 = -1;
                                    i4 = i3;
                                    i10 = i22;
                                    i13 = i24;
                                    i8 = i23;
                                    i9 = i47;
                                    unsafe2 = unsafe4;
                                    zzbwVar2 = zzbwVar4;
                                    i14 = i53;
                                    break;
                                } else {
                                    int i61 = i45 | i56;
                                    Object zzt2 = zzt(obj3, i16);
                                    int zzj = zzbx.zzj(zzt2, zzq(i16), bArr, i47, i2, (i17 << 3) | 4, zzbwVar);
                                    zzu(obj3, i16, zzt2);
                                    i39 = i3;
                                    zzbwVar4 = zzbwVar4;
                                    i38 = i2;
                                    unsafe7 = unsafe7;
                                    i41 = zzj;
                                    i40 = -1;
                                    i46 = i11;
                                    i45 = i61;
                                    i44 = i18;
                                    i43 = i16;
                                    i42 = i17;
                                }
                        }
                    } else {
                        int i62 = i50;
                        i10 = i45;
                        i11 = i46;
                        Unsafe unsafe8 = unsafe7;
                        int i63 = i54;
                        i12 = -1;
                        if (zzC != 27) {
                            zzbwVar4 = zzbwVar;
                            if (zzC > 49) {
                                int i64 = i47;
                                unsafe2 = unsafe8;
                                i14 = i53;
                                i62 = i62;
                                if (zzC != 50) {
                                    obj3 = obj;
                                    long j3 = iArr[i62 + 2] & 1048575;
                                    switch (zzC) {
                                        case 51:
                                            i36 = i64;
                                            i14 = i14;
                                            zzbwVar2 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 1) {
                                                i41 = i36 + 8;
                                                unsafe2.putObject(obj3, j2, Double.valueOf(Double.longBitsToDouble(zzbx.zze(bArr, i36))));
                                                unsafe2.putInt(obj3, j3, i14);
                                                if (i41 != i36) {
                                                    i4 = i3;
                                                    i9 = i41;
                                                    break;
                                                } else {
                                                    i38 = i2;
                                                    i39 = i3;
                                                    i42 = i14;
                                                    zzbwVar4 = zzbwVar2;
                                                    i44 = i8;
                                                    i43 = i13;
                                                    i40 = -1;
                                                    i46 = i11;
                                                    unsafe7 = unsafe2;
                                                    i45 = i10;
                                                    break;
                                                }
                                            }
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                        case 52:
                                            i36 = i64;
                                            i14 = i14;
                                            zzbwVar2 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 5) {
                                                i41 = i36 + 4;
                                                unsafe2.putObject(obj3, j2, Float.valueOf(Float.intBitsToFloat(zzbx.zzd(bArr, i36))));
                                                unsafe2.putInt(obj3, j3, i14);
                                                if (i41 != i36) {
                                                }
                                            }
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i36 = i64;
                                            i14 = i14;
                                            zzbwVar2 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 0) {
                                                i41 = zzbx.zzc(bArr, i36, zzbwVar2);
                                                unsafe2.putObject(obj3, j2, Long.valueOf(zzbwVar2.zzb));
                                                unsafe2.putInt(obj3, j3, i14);
                                                if (i41 != i36) {
                                                }
                                            }
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i36 = i64;
                                            i14 = i14;
                                            zzbwVar2 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 0) {
                                                i41 = zzbx.zza(bArr, i36, zzbwVar2);
                                                unsafe2.putObject(obj3, j2, Integer.valueOf(zzbwVar2.zza));
                                                unsafe2.putInt(obj3, j3, i14);
                                                if (i41 != i36) {
                                                }
                                            }
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i36 = i64;
                                            i14 = i14;
                                            zzbwVar2 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 1) {
                                                i41 = i36 + 8;
                                                unsafe2.putObject(obj3, j2, Long.valueOf(zzbx.zze(bArr, i36)));
                                                unsafe2.putInt(obj3, j3, i14);
                                                if (i41 != i36) {
                                                }
                                            }
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i36 = i64;
                                            i14 = i14;
                                            zzbwVar2 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 5) {
                                                i41 = i36 + 4;
                                                unsafe2.putObject(obj3, j2, Integer.valueOf(zzbx.zzd(bArr, i36)));
                                                unsafe2.putInt(obj3, j3, i14);
                                                if (i41 != i36) {
                                                }
                                            }
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 58:
                                            i36 = i64;
                                            i14 = i14;
                                            zzbwVar2 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 0) {
                                                i41 = zzbx.zzc(bArr, i36, zzbwVar2);
                                                unsafe2.putObject(obj3, j2, Boolean.valueOf(zzbwVar2.zzb != 0));
                                                unsafe2.putInt(obj3, j3, i14);
                                                if (i41 != i36) {
                                                }
                                            }
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 59:
                                            i36 = i64;
                                            i14 = i14;
                                            zzbwVar2 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 2) {
                                                i41 = zzbx.zza(bArr, i36, zzbwVar2);
                                                int i65 = zzbwVar2.zza;
                                                if (i65 == 0) {
                                                    unsafe2.putObject(obj3, j2, "");
                                                } else {
                                                    int i66 = i41 + i65;
                                                    if ((i52 & 536870912) != 0 && !zzfu.zza(bArr, i41, i66)) {
                                                        throw new zzdv("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe2.putObject(obj3, j2, new String(bArr, i41, i65, StandardCharsets.UTF_8));
                                                    i41 = i66;
                                                }
                                                unsafe2.putInt(obj3, j3, i14);
                                                if (i41 != i36) {
                                                }
                                            }
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 60:
                                            zzbwVar3 = zzbwVar;
                                            i37 = i14;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 2) {
                                                Object zzv = zzv(obj3, i37, i13);
                                                i36 = i64;
                                                i41 = zzbx.zzi(zzv, zzq(i13), bArr, i64, i2, zzbwVar);
                                                zzw(obj3, i37, i13, zzv);
                                                zzbwVar2 = zzbwVar3;
                                                i14 = i37;
                                                unsafe2 = unsafe2;
                                                if (i41 != i36) {
                                                }
                                            }
                                            i36 = i64;
                                            zzbwVar2 = zzbwVar3;
                                            i14 = i37;
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 61:
                                            i37 = i14;
                                            zzbwVar3 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 2) {
                                                zzf = zzbx.zzf(bArr, i64, zzbwVar3);
                                                unsafe2.putObject(obj3, j2, zzbwVar3.zzc);
                                                unsafe2.putInt(obj3, j3, i37);
                                                i36 = i64;
                                                zzbwVar2 = zzbwVar3;
                                                i14 = i37;
                                                i41 = zzf;
                                                if (i41 != i36) {
                                                }
                                            }
                                            i36 = i64;
                                            zzbwVar2 = zzbwVar3;
                                            i14 = i37;
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 63:
                                            i37 = i14;
                                            zzbwVar3 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 0) {
                                                zzf = zzbx.zza(bArr, i64, zzbwVar3);
                                                int i67 = zzbwVar3.zza;
                                                zzdl zzs2 = zzs(i13);
                                                if (zzs2 == null || zzs2.zza(i67)) {
                                                    unsafe2.putObject(obj3, j2, Integer.valueOf(i67));
                                                    unsafe2.putInt(obj3, j3, i37);
                                                } else {
                                                    zzh(obj).zzk(i8, Long.valueOf(i67));
                                                }
                                                i36 = i64;
                                                zzbwVar2 = zzbwVar3;
                                                i14 = i37;
                                                i41 = zzf;
                                                if (i41 != i36) {
                                                }
                                            }
                                            i36 = i64;
                                            zzbwVar2 = zzbwVar3;
                                            i14 = i37;
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 66:
                                            i37 = i14;
                                            zzbwVar3 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 0) {
                                                zzf = zzbx.zza(bArr, i64, zzbwVar3);
                                                unsafe2.putObject(obj3, j2, Integer.valueOf(zzcj.zzF(zzbwVar3.zza)));
                                                unsafe2.putInt(obj3, j3, i37);
                                                i36 = i64;
                                                zzbwVar2 = zzbwVar3;
                                                i14 = i37;
                                                i41 = zzf;
                                                if (i41 != i36) {
                                                }
                                            }
                                            i36 = i64;
                                            zzbwVar2 = zzbwVar3;
                                            i14 = i37;
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 67:
                                            i37 = i14;
                                            zzbwVar3 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            if (i51 == 0) {
                                                int zzc3 = zzbx.zzc(bArr, i64, zzbwVar3);
                                                unsafe2.putObject(obj3, j2, Long.valueOf(zzcj.zzG(zzbwVar3.zzb)));
                                                unsafe2.putInt(obj3, j3, i37);
                                                i36 = i64;
                                                zzbwVar2 = zzbwVar3;
                                                i14 = i37;
                                                i41 = zzc3;
                                                if (i41 != i36) {
                                                }
                                            }
                                            i36 = i64;
                                            zzbwVar2 = zzbwVar3;
                                            i14 = i37;
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                        case 68:
                                            if (i51 == 3) {
                                                Object zzv2 = zzv(obj3, i14, i62);
                                                int zzj2 = zzbx.zzj(zzv2, zzq(i62), bArr, i64, i2, (i63 & (-8)) | 4, zzbwVar);
                                                zzw(obj3, i14, i62, zzv2);
                                                i13 = i62;
                                                i36 = i64;
                                                zzbwVar2 = zzbwVar;
                                                i14 = i14;
                                                i41 = zzj2;
                                                i8 = i63;
                                                if (i41 != i36) {
                                                }
                                            }
                                            break;
                                        default:
                                            i36 = i64;
                                            i14 = i14;
                                            zzbwVar2 = zzbwVar;
                                            i13 = i62;
                                            i8 = i63;
                                            i41 = i36;
                                            if (i41 != i36) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i51 == 2) {
                                        Object zzr = zzr(i62);
                                        Object object = unsafe2.getObject(obj, j2);
                                        if (zzeg.zza(object)) {
                                            zzef zzc4 = zzef.zza().zzc();
                                            zzeg.zzb(zzc4, object);
                                            unsafe2.putObject(obj, j2, zzc4);
                                        }
                                        throw null;
                                    }
                                    i25 = i64;
                                    obj3 = obj;
                                    i4 = i3;
                                    i9 = i25;
                                    zzbwVar2 = zzbwVar4;
                                }
                            } else {
                                long j4 = i52;
                                zzdp zzdpVar = (zzdp) unsafe8.getObject(obj3, j2);
                                if (zzdpVar.zza()) {
                                    j = j4;
                                } else {
                                    int size = zzdpVar.size();
                                    j = j4;
                                    zzdpVar = zzdpVar.zzg(size + size);
                                    unsafe8.putObject(obj3, j2, zzdpVar);
                                }
                                zzdp zzdpVar2 = zzdpVar;
                                switch (zzC) {
                                    case 18:
                                    case 35:
                                        i26 = i47;
                                        i27 = i2;
                                        unsafe5 = unsafe8;
                                        i62 = i62;
                                        i28 = i53;
                                        if (i51 == 2) {
                                            int i68 = zzbx.zza;
                                            zzcp zzcpVar = (zzcp) zzdpVar2;
                                            i41 = zzbx.zza(bArr, i26, zzbwVar4);
                                            int i69 = zzbwVar4.zza;
                                            int i70 = i41 + i69;
                                            if (i70 > bArr.length) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzcpVar.zzh(zzcpVar.size() + (i69 / 8));
                                            while (i41 < i70) {
                                                zzcpVar.zzf(Double.longBitsToDouble(zzbx.zze(bArr, i41)));
                                                i41 += 8;
                                            }
                                            if (i41 != i70) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i41 != i26) {
                                                obj3 = obj;
                                                i4 = i3;
                                                i9 = i41;
                                                i14 = i28;
                                                zzbwVar2 = zzbwVar4;
                                                unsafe2 = unsafe5;
                                                break;
                                            } else {
                                                obj3 = obj;
                                                i39 = i3;
                                                i43 = i62;
                                                i42 = i28;
                                                i44 = i63;
                                                unsafe7 = unsafe5;
                                                i40 = -1;
                                                i45 = i10;
                                                i46 = i11;
                                                i38 = i27;
                                                break;
                                            }
                                        } else {
                                            if (i51 == 1) {
                                                i29 = i26 + 8;
                                                int i71 = zzbx.zza;
                                                zzcp zzcpVar2 = (zzcp) zzdpVar2;
                                                zzcpVar2.zzf(Double.longBitsToDouble(zzbx.zze(bArr, i26)));
                                                while (i29 < i27) {
                                                    int zza3 = zzbx.zza(bArr, i29, zzbwVar4);
                                                    if (i63 == zzbwVar4.zza) {
                                                        zzcpVar2.zzf(Double.longBitsToDouble(zzbx.zze(bArr, zza3)));
                                                        i29 = zza3 + 8;
                                                    } else {
                                                        i41 = i29;
                                                        if (i41 != i26) {
                                                        }
                                                    }
                                                }
                                                i41 = i29;
                                                if (i41 != i26) {
                                                }
                                            }
                                            i41 = i26;
                                            if (i41 != i26) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        i26 = i47;
                                        i27 = i2;
                                        unsafe5 = unsafe8;
                                        i62 = i62;
                                        i28 = i53;
                                        if (i51 == 2) {
                                            int i72 = zzbx.zza;
                                            zzcz zzczVar = (zzcz) zzdpVar2;
                                            i41 = zzbx.zza(bArr, i26, zzbwVar4);
                                            int i73 = zzbwVar4.zza;
                                            int i74 = i41 + i73;
                                            if (i74 > bArr.length) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzczVar.zzi(zzczVar.size() + (i73 / 4));
                                            while (i41 < i74) {
                                                zzczVar.zzh(Float.intBitsToFloat(zzbx.zzd(bArr, i41)));
                                                i41 += 4;
                                            }
                                            if (i41 != i74) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i41 != i26) {
                                            }
                                        } else {
                                            if (i51 == 5) {
                                                i29 = i26 + 4;
                                                int i75 = zzbx.zza;
                                                zzcz zzczVar2 = (zzcz) zzdpVar2;
                                                zzczVar2.zzh(Float.intBitsToFloat(zzbx.zzd(bArr, i26)));
                                                while (i29 < i27) {
                                                    int zza4 = zzbx.zza(bArr, i29, zzbwVar4);
                                                    if (i63 == zzbwVar4.zza) {
                                                        zzczVar2.zzh(Float.intBitsToFloat(zzbx.zzd(bArr, zza4)));
                                                        i29 = zza4 + 4;
                                                    } else {
                                                        i41 = i29;
                                                        if (i41 != i26) {
                                                        }
                                                    }
                                                }
                                                i41 = i29;
                                                if (i41 != i26) {
                                                }
                                            }
                                            i41 = i26;
                                            if (i41 != i26) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i26 = i47;
                                        i27 = i2;
                                        unsafe5 = unsafe8;
                                        i62 = i62;
                                        i28 = i53;
                                        if (i51 == 2) {
                                            int i76 = zzbx.zza;
                                            zzea zzeaVar = (zzea) zzdpVar2;
                                            i41 = zzbx.zza(bArr, i26, zzbwVar4);
                                            int i77 = zzbwVar4.zza + i41;
                                            while (i41 < i77) {
                                                i41 = zzbx.zzc(bArr, i41, zzbwVar4);
                                                zzeaVar.zzf(zzbwVar4.zzb);
                                            }
                                            if (i41 != i77) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i51 == 0) {
                                                int i78 = zzbx.zza;
                                                zzea zzeaVar2 = (zzea) zzdpVar2;
                                                i41 = zzbx.zzc(bArr, i26, zzbwVar4);
                                                zzeaVar2.zzf(zzbwVar4.zzb);
                                                while (i41 < i27) {
                                                    int zza5 = zzbx.zza(bArr, i41, zzbwVar4);
                                                    if (i63 == zzbwVar4.zza) {
                                                        i41 = zzbx.zzc(bArr, zza5, zzbwVar4);
                                                        zzeaVar2.zzf(zzbwVar4.zzb);
                                                    }
                                                }
                                            }
                                            i41 = i26;
                                        }
                                        if (i41 != i26) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i26 = i47;
                                        i30 = i2;
                                        i31 = i62;
                                        i32 = i53;
                                        if (i51 == 2) {
                                            i41 = zzbx.zzl(bArr, i26, zzdpVar2, zzbwVar4);
                                            i62 = i31;
                                            i27 = i30;
                                            i28 = i32;
                                            unsafe5 = unsafe8;
                                            if (i41 != i26) {
                                            }
                                        } else {
                                            if (i51 == 0) {
                                                i62 = i31;
                                                i27 = i30;
                                                i28 = i32;
                                                unsafe5 = unsafe8;
                                                i41 = zzbx.zzk(i63, bArr, i26, i2, zzdpVar2, zzbwVar);
                                                if (i41 != i26) {
                                                }
                                            }
                                            i62 = i31;
                                            i27 = i30;
                                            i28 = i32;
                                            unsafe5 = unsafe8;
                                            i41 = i26;
                                            if (i41 != i26) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i26 = i47;
                                        i30 = i2;
                                        i31 = i62;
                                        i32 = i53;
                                        if (i51 == 2) {
                                            int i79 = zzbx.zza;
                                            zzea zzeaVar3 = (zzea) zzdpVar2;
                                            i41 = zzbx.zza(bArr, i26, zzbwVar4);
                                            int i80 = zzbwVar4.zza;
                                            int i81 = i41 + i80;
                                            if (i81 > bArr.length) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzeaVar3.zzh(zzeaVar3.size() + (i80 / 8));
                                            while (i41 < i81) {
                                                zzeaVar3.zzf(zzbx.zze(bArr, i41));
                                                i41 += 8;
                                            }
                                            if (i41 != i81) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i51 == 1) {
                                                i41 = i26 + 8;
                                                int i82 = zzbx.zza;
                                                zzea zzeaVar4 = (zzea) zzdpVar2;
                                                zzeaVar4.zzf(zzbx.zze(bArr, i26));
                                                while (i41 < i30) {
                                                    int zza6 = zzbx.zza(bArr, i41, zzbwVar4);
                                                    if (i63 == zzbwVar4.zza) {
                                                        zzeaVar4.zzf(zzbx.zze(bArr, zza6));
                                                        i41 = zza6 + 8;
                                                    }
                                                }
                                            }
                                            i62 = i31;
                                            i27 = i30;
                                            i28 = i32;
                                            unsafe5 = unsafe8;
                                            i41 = i26;
                                            if (i41 != i26) {
                                            }
                                        }
                                        i62 = i31;
                                        i27 = i30;
                                        i28 = i32;
                                        unsafe5 = unsafe8;
                                        if (i41 != i26) {
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i26 = i47;
                                        i30 = i2;
                                        i31 = i62;
                                        i32 = i53;
                                        if (i51 == 2) {
                                            int i83 = zzbx.zza;
                                            zzdh zzdhVar = (zzdh) zzdpVar2;
                                            i41 = zzbx.zza(bArr, i26, zzbwVar4);
                                            int i84 = zzbwVar4.zza;
                                            int i85 = i41 + i84;
                                            if (i85 > bArr.length) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzdhVar.zzh(zzdhVar.size() + (i84 / 4));
                                            while (i41 < i85) {
                                                zzdhVar.zzf(zzbx.zzd(bArr, i41));
                                                i41 += 4;
                                            }
                                            if (i41 != i85) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i51 == 5) {
                                                i41 = i26 + 4;
                                                int i86 = zzbx.zza;
                                                zzdh zzdhVar2 = (zzdh) zzdpVar2;
                                                zzdhVar2.zzf(zzbx.zzd(bArr, i26));
                                                while (i41 < i30) {
                                                    int zza7 = zzbx.zza(bArr, i41, zzbwVar4);
                                                    if (i63 == zzbwVar4.zza) {
                                                        zzdhVar2.zzf(zzbx.zzd(bArr, zza7));
                                                        i41 = zza7 + 4;
                                                    }
                                                }
                                            }
                                            i62 = i31;
                                            i27 = i30;
                                            i28 = i32;
                                            unsafe5 = unsafe8;
                                            i41 = i26;
                                            if (i41 != i26) {
                                            }
                                        }
                                        i62 = i31;
                                        i27 = i30;
                                        i28 = i32;
                                        unsafe5 = unsafe8;
                                        if (i41 != i26) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i26 = i47;
                                        i30 = i2;
                                        i31 = i62;
                                        i32 = i53;
                                        if (i51 == 2) {
                                            int i87 = zzbx.zza;
                                            zzby zzbyVar = (zzby) zzdpVar2;
                                            i41 = zzbx.zza(bArr, i26, zzbwVar4);
                                            int i88 = zzbwVar4.zza + i41;
                                            while (i41 < i88) {
                                                i41 = zzbx.zzc(bArr, i41, zzbwVar4);
                                                zzbyVar.zzf(zzbwVar4.zzb != 0);
                                            }
                                            if (i41 != i88) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i51 == 0) {
                                                int i89 = zzbx.zza;
                                                zzby zzbyVar2 = (zzby) zzdpVar2;
                                                i41 = zzbx.zzc(bArr, i26, zzbwVar4);
                                                zzbyVar2.zzf(zzbwVar4.zzb != 0);
                                                while (i41 < i30) {
                                                    int zza8 = zzbx.zza(bArr, i41, zzbwVar4);
                                                    if (i63 == zzbwVar4.zza) {
                                                        i41 = zzbx.zzc(bArr, zza8, zzbwVar4);
                                                        zzbyVar2.zzf(zzbwVar4.zzb != 0);
                                                    }
                                                }
                                            }
                                            i62 = i31;
                                            i27 = i30;
                                            i28 = i32;
                                            unsafe5 = unsafe8;
                                            i41 = i26;
                                            if (i41 != i26) {
                                            }
                                        }
                                        i62 = i31;
                                        i27 = i30;
                                        i28 = i32;
                                        unsafe5 = unsafe8;
                                        if (i41 != i26) {
                                        }
                                        break;
                                    case 26:
                                        i26 = i47;
                                        i30 = i2;
                                        i32 = i53;
                                        if (i51 == 2) {
                                            if ((j & 536870912) == 0) {
                                                zza2 = zzbx.zza(bArr, i26, zzbwVar4);
                                                int i90 = zzbwVar4.zza;
                                                if (i90 < 0) {
                                                    throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i90 == 0) {
                                                    obj2 = "";
                                                    zzdpVar2.add(obj2);
                                                } else {
                                                    obj2 = "";
                                                    zzdpVar2.add(new String(bArr, zza2, i90, StandardCharsets.UTF_8));
                                                    zza2 += i90;
                                                }
                                                while (zza2 < i30) {
                                                    int zza9 = zzbx.zza(bArr, zza2, zzbwVar4);
                                                    if (i63 == zzbwVar4.zza) {
                                                        zza2 = zzbx.zza(bArr, zza9, zzbwVar4);
                                                        int i91 = zzbwVar4.zza;
                                                        if (i91 < 0) {
                                                            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i91 == 0) {
                                                            zzdpVar2.add(obj2);
                                                        } else {
                                                            zzdpVar2.add(new String(bArr, zza2, i91, StandardCharsets.UTF_8));
                                                            zza2 += i91;
                                                        }
                                                    } else {
                                                        i62 = i62;
                                                    }
                                                }
                                                i62 = i62;
                                            } else {
                                                zza2 = zzbx.zza(bArr, i26, zzbwVar4);
                                                int i92 = zzbwVar4.zza;
                                                if (i92 < 0) {
                                                    throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i92 == 0) {
                                                    zzdpVar2.add("");
                                                    i33 = i62;
                                                } else {
                                                    int i93 = zza2 + i92;
                                                    if (!zzfu.zza(bArr, zza2, i93)) {
                                                        throw new zzdv("Protocol message had invalid UTF-8.");
                                                    }
                                                    i33 = i62;
                                                    zzdpVar2.add(new String(bArr, zza2, i92, StandardCharsets.UTF_8));
                                                    zza2 = i93;
                                                }
                                                while (zza2 < i30) {
                                                    int zza10 = zzbx.zza(bArr, zza2, zzbwVar4);
                                                    if (i63 == zzbwVar4.zza) {
                                                        zza2 = zzbx.zza(bArr, zza10, zzbwVar4);
                                                        int i94 = zzbwVar4.zza;
                                                        if (i94 < 0) {
                                                            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i94 == 0) {
                                                            zzdpVar2.add("");
                                                        } else {
                                                            int i95 = zza2 + i94;
                                                            if (!zzfu.zza(bArr, zza2, i95)) {
                                                                throw new zzdv("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzdpVar2.add(new String(bArr, zza2, i94, StandardCharsets.UTF_8));
                                                            zza2 = i95;
                                                        }
                                                    } else {
                                                        i62 = i33;
                                                    }
                                                }
                                                i62 = i33;
                                            }
                                            i41 = zza2;
                                            i27 = i30;
                                            i28 = i32;
                                            unsafe5 = unsafe8;
                                            if (i41 != i26) {
                                            }
                                        } else {
                                            i62 = i62;
                                            i27 = i30;
                                            i28 = i32;
                                            unsafe5 = unsafe8;
                                            i41 = i26;
                                            if (i41 != i26) {
                                            }
                                        }
                                        break;
                                    case 27:
                                        i34 = i47;
                                        i27 = i2;
                                        unsafe6 = unsafe8;
                                        if (i51 == 2) {
                                            i26 = i34;
                                            int zzm = zzbx.zzm(zzq(i62), i63, bArr, i34, i2, zzdpVar2, zzbwVar);
                                            i63 = i63;
                                            zzbwVar4 = zzbwVar4;
                                            i27 = i27;
                                            i28 = i53;
                                            unsafe5 = unsafe6;
                                            i62 = i62;
                                            i41 = zzm;
                                            if (i41 != i26) {
                                            }
                                        }
                                        i26 = i34;
                                        unsafe5 = unsafe6;
                                        i62 = i62;
                                        i28 = i53;
                                        i41 = i26;
                                        if (i41 != i26) {
                                        }
                                        break;
                                    case 28:
                                        i34 = i47;
                                        i27 = i2;
                                        unsafe6 = unsafe8;
                                        if (i51 == 2) {
                                            i41 = zzbx.zza(bArr, i34, zzbwVar4);
                                            int i96 = zzbwVar4.zza;
                                            if (i96 < 0) {
                                                throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i96 > bArr.length - i41) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i96 == 0) {
                                                zzdpVar2.add(zzcg.zza);
                                            } else {
                                                zzdpVar2.add(zzcg.zzk(bArr, i41, i96));
                                                i41 += i96;
                                            }
                                            while (i41 < i27) {
                                                int zza11 = zzbx.zza(bArr, i41, zzbwVar4);
                                                if (i63 == zzbwVar4.zza) {
                                                    i41 = zzbx.zza(bArr, zza11, zzbwVar4);
                                                    int i97 = zzbwVar4.zza;
                                                    if (i97 < 0) {
                                                        throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i97 > bArr.length - i41) {
                                                        throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i97 == 0) {
                                                        zzdpVar2.add(zzcg.zza);
                                                    } else {
                                                        zzdpVar2.add(zzcg.zzk(bArr, i41, i97));
                                                        i41 += i97;
                                                    }
                                                } else {
                                                    i26 = i34;
                                                    unsafe5 = unsafe6;
                                                    i62 = i62;
                                                    i28 = i53;
                                                    if (i41 != i26) {
                                                    }
                                                }
                                            }
                                            i26 = i34;
                                            unsafe5 = unsafe6;
                                            i62 = i62;
                                            i28 = i53;
                                            if (i41 != i26) {
                                            }
                                        }
                                        i26 = i34;
                                        unsafe5 = unsafe6;
                                        i62 = i62;
                                        i28 = i53;
                                        i41 = i26;
                                        if (i41 != i26) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (i51 == 2) {
                                            zzk = zzbx.zzl(bArr, i47, zzdpVar2, zzbwVar4);
                                            i35 = i47;
                                            i27 = i2;
                                            unsafe6 = unsafe8;
                                        } else {
                                            if (i51 == 0) {
                                                i35 = i47;
                                                i27 = i2;
                                                unsafe6 = unsafe8;
                                                zzk = zzbx.zzk(i63, bArr, i47, i2, zzdpVar2, zzbwVar);
                                            }
                                            i26 = i47;
                                            i27 = i2;
                                            unsafe5 = unsafe8;
                                            i62 = i62;
                                            i28 = i53;
                                            i41 = i26;
                                            if (i41 != i26) {
                                            }
                                        }
                                        zzez.zzE(obj, i53, zzdpVar2, zzs(i62), null, this.zzm);
                                        i26 = i35;
                                        i41 = zzk;
                                        unsafe5 = unsafe6;
                                        i62 = i62;
                                        i28 = i53;
                                        if (i41 != i26) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        if (i51 == 2) {
                                            int i98 = zzbx.zza;
                                            zzdh zzdhVar3 = (zzdh) zzdpVar2;
                                            i41 = zzbx.zza(bArr, i47, zzbwVar4);
                                            int i99 = zzbwVar4.zza + i41;
                                            while (i41 < i99) {
                                                i41 = zzbx.zza(bArr, i41, zzbwVar4);
                                                zzdhVar3.zzf(zzcj.zzF(zzbwVar4.zza));
                                            }
                                            if (i41 != i99) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i51 == 0) {
                                                int i100 = zzbx.zza;
                                                zzdh zzdhVar4 = (zzdh) zzdpVar2;
                                                i41 = zzbx.zza(bArr, i47, zzbwVar4);
                                                zzdhVar4.zzf(zzcj.zzF(zzbwVar4.zza));
                                                while (i41 < i2) {
                                                    int zza12 = zzbx.zza(bArr, i41, zzbwVar4);
                                                    if (i63 == zzbwVar4.zza) {
                                                        i41 = zzbx.zza(bArr, zza12, zzbwVar4);
                                                        zzdhVar4.zzf(zzcj.zzF(zzbwVar4.zza));
                                                    }
                                                }
                                            }
                                            i26 = i47;
                                            i27 = i2;
                                            unsafe5 = unsafe8;
                                            i62 = i62;
                                            i28 = i53;
                                            i41 = i26;
                                            if (i41 != i26) {
                                            }
                                        }
                                        i26 = i47;
                                        i27 = i2;
                                        unsafe5 = unsafe8;
                                        i62 = i62;
                                        i28 = i53;
                                        if (i41 != i26) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i51 == 2) {
                                            int i101 = zzbx.zza;
                                            zzea zzeaVar5 = (zzea) zzdpVar2;
                                            i41 = zzbx.zza(bArr, i47, zzbwVar4);
                                            int i102 = zzbwVar4.zza + i41;
                                            while (i41 < i102) {
                                                i41 = zzbx.zzc(bArr, i41, zzbwVar4);
                                                zzeaVar5.zzf(zzcj.zzG(zzbwVar4.zzb));
                                            }
                                            if (i41 != i102) {
                                                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i51 == 0) {
                                                int i103 = zzbx.zza;
                                                zzea zzeaVar6 = (zzea) zzdpVar2;
                                                i41 = zzbx.zzc(bArr, i47, zzbwVar4);
                                                zzeaVar6.zzf(zzcj.zzG(zzbwVar4.zzb));
                                                while (i41 < i2) {
                                                    int zza13 = zzbx.zza(bArr, i41, zzbwVar4);
                                                    if (i63 == zzbwVar4.zza) {
                                                        i41 = zzbx.zzc(bArr, zza13, zzbwVar4);
                                                        zzeaVar6.zzf(zzcj.zzG(zzbwVar4.zzb));
                                                    }
                                                }
                                            }
                                            i26 = i47;
                                            i27 = i2;
                                            unsafe5 = unsafe8;
                                            i62 = i62;
                                            i28 = i53;
                                            i41 = i26;
                                            if (i41 != i26) {
                                            }
                                        }
                                        i26 = i47;
                                        i27 = i2;
                                        unsafe5 = unsafe8;
                                        i62 = i62;
                                        i28 = i53;
                                        if (i41 != i26) {
                                        }
                                        break;
                                    default:
                                        i26 = i47;
                                        i27 = i2;
                                        unsafe5 = unsafe8;
                                        i62 = i62;
                                        i28 = i53;
                                        if (i51 == 3) {
                                            int i104 = (i63 & (-8)) | 4;
                                            zzey zzq = zzq(i62);
                                            i41 = zzbx.zzh(zzq, bArr, i26, i2, i104, zzbwVar);
                                            zzdpVar2.add(zzbwVar4.zzc);
                                            while (i41 < i27) {
                                                int zza14 = zzbx.zza(bArr, i41, zzbwVar4);
                                                if (i63 == zzbwVar4.zza) {
                                                    i41 = zzbx.zzh(zzq, bArr, zza14, i2, i104, zzbwVar);
                                                    zzdpVar2.add(zzbwVar4.zzc);
                                                } else if (i41 != i26) {
                                                }
                                            }
                                            if (i41 != i26) {
                                            }
                                        }
                                        i41 = i26;
                                        if (i41 != i26) {
                                        }
                                        break;
                                }
                            }
                        } else if (i51 == 2) {
                            zzdp zzdpVar3 = (zzdp) unsafe8.getObject(obj3, j2);
                            if (!zzdpVar3.zza()) {
                                int size2 = zzdpVar3.size();
                                zzdpVar3 = zzdpVar3.zzg(size2 == 0 ? 10 : size2 + size2);
                                unsafe8.putObject(obj3, j2, zzdpVar3);
                            }
                            int zzm2 = zzbx.zzm(zzq(i62), i63, bArr, i47, i2, zzdpVar3, zzbwVar);
                            i39 = i3;
                            zzbwVar4 = zzbwVar;
                            i38 = i2;
                            unsafe7 = unsafe8;
                            i40 = -1;
                            i45 = i10;
                            i46 = i11;
                            i44 = i63;
                            i43 = i62;
                            i42 = i53;
                            i41 = zzm2;
                        } else {
                            zzbwVar4 = zzbwVar;
                            unsafe2 = unsafe8;
                            i25 = i47;
                            i14 = i53;
                            i4 = i3;
                            i9 = i25;
                            zzbwVar2 = zzbwVar4;
                        }
                        int i105 = i63;
                        i13 = i62;
                        i8 = i105;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzcs zzcsVar = zzbwVar2.zzd;
                        int i106 = zzcs.zzb;
                        int i107 = zzbv.zza;
                        if (zzcsVar != zzcs.zza) {
                            zzel zzelVar = this.zzg;
                            int i108 = zzbx.zza;
                            if (zzcsVar.zzc(zzelVar, i14) != null) {
                                throw null;
                            }
                            i15 = i14;
                            unsafe3 = unsafe2;
                            i41 = zzbx.zzn(i8, bArr, i9, i2, zzh(obj), zzbwVar);
                            i38 = i2;
                            i44 = i8;
                            i43 = i13;
                            i42 = i15;
                            unsafe7 = unsafe3;
                            i40 = i12;
                            i45 = i10;
                            i46 = i11;
                            zzbwVar4 = zzbwVar;
                            i39 = i4;
                        }
                    }
                    i15 = i14;
                    unsafe3 = unsafe2;
                    i41 = zzbx.zzn(i8, bArr, i9, i2, zzh(obj), zzbwVar);
                    i38 = i2;
                    i44 = i8;
                    i43 = i13;
                    i42 = i15;
                    unsafe7 = unsafe3;
                    i40 = i12;
                    i45 = i10;
                    i46 = i11;
                    zzbwVar4 = zzbwVar;
                    i39 = i4;
                } else {
                    unsafe = unsafe2;
                    i6 = i8;
                    i45 = i10;
                    i46 = i11;
                    i7 = 1048575;
                    i5 = i9;
                }
            } else {
                i4 = i39;
                unsafe = unsafe7;
                i5 = i41;
                i6 = i44;
                i7 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzbw zzbwVar) throws IOException {
        zzi(obj, bArr, i, i2, 0, zzbwVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzdg) {
                zzdg zzdgVar = (zzdg) obj;
                zzdgVar.zzS(Integer.MAX_VALUE);
                zzdgVar.zza = 0;
                zzdgVar.zzM();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
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
                                ((zzdp) zzfp.zzm(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzef) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzq(i).zzk(zzb.getObject(obj, j));
                    }
                }
                if (zzK(obj, i)) {
                    zzq(i).zzk(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int i6 = this.zzj[i4];
            int zzA = zzA(i6);
            int[] iArr = this.zzc;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i3 = zzb.getInt(obj, i8);
                }
                i2 = i3;
                i = i8;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzA) != 0 && !zzJ(obj, i6, i, i2, i9)) {
                return false;
            }
            int zzC = zzC(zzA);
            if (zzC != 9 && zzC != 17) {
                if (zzC != 27) {
                    if (zzC == 60 || zzC == 68) {
                        if (zzM(obj, iArr[i6], i6) && !zzy(obj, zzA, zzq(i6))) {
                            return false;
                        }
                    } else if (zzC != 49) {
                        if (zzC == 50 && !((zzef) zzfp.zzm(obj, zzA & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzfp.zzm(obj, zzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzey zzq = zzq(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!zzq.zzl(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i6, i, i2, i9) && !zzy(obj, zzA, zzq(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || ((zzdd) obj).zzb.zze();
    }
}
