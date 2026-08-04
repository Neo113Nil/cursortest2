package com.google.android.gms.internal.play_billing;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.1.1 */
/* JADX INFO: loaded from: classes.dex */
final class zzip<T> implements zzix<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzim zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzjj zzl;
    private final zzgx zzm;

    private zzip(int[] iArr, Object[] objArr, int i, int i2, zzim zzimVar, boolean z, int[] iArr2, int i3, int i4, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzgxVar != null && (zzimVar instanceof zzhh)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzjjVar;
        this.zzm = zzgxVar;
        this.zzg = zzimVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzix zzixVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzixVarZzv.zze();
                    zzixVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzixVarZzv.zze();
                zzixVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzixVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzix zzixVarZzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object objZze = zzixVarZzv.zze();
                    zzixVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzixVarZzv.zze();
                zzixVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzixVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        zzjq.zzq(obj, j, (1 << (iZzp >>> 20)) | zzjq.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzjq.zzq(obj, zzp(i2) & 1048575, i);
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
        int iZzp = zzp(i);
        long j = iZzp & 1048575;
        if (j != 1048575) {
            return (zzjq.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j2 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzjq.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzjq.zzb(obj, j2)) != 0;
            case 2:
                return zzjq.zzd(obj, j2) != 0;
            case 3:
                return zzjq.zzd(obj, j2) != 0;
            case 4:
                return zzjq.zzc(obj, j2) != 0;
            case 5:
                return zzjq.zzd(obj, j2) != 0;
            case 6:
                return zzjq.zzc(obj, j2) != 0;
            case 7:
                return zzjq.zzw(obj, j2);
            case 8:
                Object objZzf = zzjq.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzgk) {
                    return !zzgk.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzjq.zzf(obj, j2) != null;
            case 10:
                return !zzgk.zzb.equals(zzjq.zzf(obj, j2));
            case 11:
                return zzjq.zzc(obj, j2) != 0;
            case 12:
                return zzjq.zzc(obj, j2) != 0;
            case 13:
                return zzjq.zzc(obj, j2) != 0;
            case 14:
                return zzjq.zzd(obj, j2) != 0;
            case 15:
                return zzjq.zzc(obj, j2) != 0;
            case 16:
                return zzjq.zzd(obj, j2) != 0;
            case 17:
                return zzjq.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzI(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzix zzixVar) {
        return zzixVar.zzk(zzjq.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhk) {
            return ((zzhk) obj).zzA();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzjq.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzjq.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzjw zzjwVar) throws IOException {
        if (obj instanceof String) {
            zzjwVar.zzG(i, (String) obj);
        } else {
            zzjwVar.zzd(i, (zzgk) obj);
        }
    }

    static zzjk zzd(Object obj) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVar = zzhkVar.zzc;
        if (zzjkVar != zzjk.zzc()) {
            return zzjkVar;
        }
        zzjk zzjkVarZzf = zzjk.zzf();
        zzhkVar.zzc = zzjkVarZzf;
        return zzjkVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0270  */
    /* JADX WARN: Code duplicated, block: B:130:0x028a  */
    /* JADX WARN: Code duplicated, block: B:131:0x028d  */
    /* JADX WARN: Code duplicated, block: B:170:0x034e  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ad  */
    static zzip zzl(Class cls, zzij zzijVar, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        char c;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        Field fieldZzz;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldZzz2;
        int i27;
        Object obj2;
        Field fieldZzz3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(zzijVar instanceof zziw)) {
            throw null;
        }
        zziw zziwVar = (zziw) zzijVar;
        String strZzd = zziwVar.zzd();
        int length = strZzd.length();
        char c2 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strZzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strZzd.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strZzd.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strZzd.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = strZzd.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strZzd.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strZzd.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strZzd.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strZzd.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strZzd.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = strZzd.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strZzd.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strZzd.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strZzd.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strZzd.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strZzd.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strZzd.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strZzd.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt6;
            i5 = iCharAt9;
            i6 = i60;
            iArr = iArr2;
            i7 = iCharAt3;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zziwVar.zze();
        Class<?> cls2 = zziwVar.zza().getClass();
        int i62 = i5 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i63];
        int i64 = i5;
        int i65 = i62;
        int i66 = 0;
        int i67 = 0;
        while (i33 < length) {
            int i68 = i33 + 1;
            int iCharAt10 = strZzd.charAt(i33);
            if (iCharAt10 >= c2) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = strZzd.charAt(i70);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i16 = i30;
            } else {
                i16 = i68;
            }
            int i72 = i16 + 1;
            int iCharAt11 = strZzd.charAt(i16);
            if (iCharAt11 >= c2) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i29 = i74 + 1;
                    cCharAt11 = strZzd.charAt(i74);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i29;
                }
                iCharAt11 = i73 | (cCharAt11 << i75);
                i17 = i29;
            } else {
                i17 = i72;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i76 = iCharAt11 & 255;
            zziw zziwVar2 = zziwVar;
            int i77 = iCharAt11 & 2048;
            if (i76 >= 51) {
                int i78 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        cCharAt10 = strZzd.charAt(i80);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i80 = i28;
                        c3 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i81);
                    i23 = i28;
                } else {
                    i23 = i78;
                }
                int i82 = i23;
                int i83 = i76 - 51;
                if (i83 == 9 || i83 == 17) {
                    i24 = i6 + 1;
                    int i84 = i67 / 3;
                    objArr[i84 + i84 + 1] = objArrZze[i6];
                } else {
                    if (i83 != 12) {
                        i25 = i77;
                    } else if (zziwVar2.zzc() == 1 || i77 != 0) {
                        i24 = i6 + 1;
                        int i85 = i67 / 3;
                        objArr[i85 + i85 + 1] = objArrZze[i6];
                    } else {
                        i25 = 0;
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i26];
                    int i86 = i25;
                    if (obj instanceof Field) {
                        fieldZzz2 = (Field) obj;
                    } else {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i26] = fieldZzz2;
                    }
                    int i87 = i7;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                    i27 = i26 + 1;
                    obj2 = objArrZze[i27];
                    i18 = i87;
                    if (obj2 instanceof Field) {
                        fieldZzz3 = (Field) obj2;
                    } else {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i27] = fieldZzz3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                    strZzd = strZzd;
                    i20 = i86;
                    i17 = i82;
                    i19 = 0;
                    c = 55296;
                }
                i6 = i24;
                i25 = i77;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrZze[i26];
                int i88 = i25;
                if (obj instanceof Field) {
                    fieldZzz2 = (Field) obj;
                } else {
                    fieldZzz2 = zzz(cls2, (String) obj);
                    objArrZze[i26] = fieldZzz2;
                }
                int i89 = i7;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                i27 = i26 + 1;
                obj2 = objArrZze[i27];
                i18 = i89;
                if (obj2 instanceof Field) {
                    fieldZzz3 = (Field) obj2;
                } else {
                    fieldZzz3 = zzz(cls2, (String) obj2);
                    objArrZze[i27] = fieldZzz3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                strZzd = strZzd;
                i20 = i88;
                i17 = i82;
                i19 = 0;
                c = 55296;
            } else {
                i18 = i7;
                int i90 = i6 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i6]);
                if (i76 == 9 || i76 == 17) {
                    int i91 = i67 / 3;
                    objArr[i91 + i91 + 1] = fieldZzz4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i6 += 2;
                            i22 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            if (zziwVar2.zzc() == 1 || i77 != 0) {
                                i6 += 2;
                                int i92 = i67 / 3;
                                objArr[i92 + i92 + 1] = objArrZze[i90];
                            } else {
                                i6 = i90;
                                i77 = 0;
                            }
                        } else if (i76 == 50) {
                            int i93 = i6 + 2;
                            int i94 = i64 + 1;
                            iArr[i64] = i67;
                            int i95 = i67 / 3;
                            int i96 = i95 + i95;
                            objArr[i96] = objArrZze[i90];
                            if (i77 != 0) {
                                objArr[i96 + 1] = objArrZze[i93];
                                i6 += 3;
                                i64 = i94;
                            } else {
                                i6 = i93;
                                i64 = i94;
                                i77 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                        if ((iCharAt11 & 4096) != 0 || i76 > 17) {
                            c = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i19 = 0;
                        } else {
                            int i97 = i17 + 1;
                            int iCharAt13 = strZzd.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i21 = i97 + 1;
                                    cCharAt9 = strZzd.charAt(i97);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt9 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i21;
                                }
                                iCharAt13 = i98 | (cCharAt9 << i99);
                            } else {
                                i21 = i97;
                            }
                            int i100 = i18 + i18 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i100];
                            if (obj3 instanceof Field) {
                                fieldZzz = (Field) obj3;
                            } else {
                                fieldZzz = zzz(cls2, (String) obj3);
                                objArrZze[i100] = fieldZzz;
                            }
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz);
                            i19 = iCharAt13 % 32;
                            i17 = i21;
                            c = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i65] = iObjectFieldOffset;
                            i65++;
                        }
                        i20 = i77;
                    } else {
                        i22 = 1;
                        i6 += 2;
                    }
                    int i101 = i67 / 3;
                    objArr[i101 + i101 + i22] = objArrZze[i90];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                    if ((iCharAt11 & 4096) != 0) {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    } else {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    }
                    if (i76 >= 18) {
                        iArr[i65] = iObjectFieldOffset;
                        i65++;
                    }
                    i20 = i77;
                }
                i6 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                if ((iCharAt11 & 4096) != 0) {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                } else {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                }
                if (i76 >= 18) {
                    iArr[i65] = iObjectFieldOffset;
                    i65++;
                }
                i20 = i77;
            }
            int i102 = i67 + 1;
            iArr3[i67] = iCharAt10;
            int i103 = i67 + 2;
            iArr3[i102] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | iObjectFieldOffset;
            i67 += 3;
            iArr3[i103] = (i19 << 20) | iObjectFieldOffset2;
            i33 = i17;
            strZzd = strZzd;
            c2 = c;
            zziwVar = zziwVar2;
            length = length;
            i7 = i18;
        }
        return new zzip(iArr3, objArr, i2, i4, zziwVar.zza(), false, iArr, i5, i62, zzirVar, zzhzVar, zzjjVar, zzgxVar, zzihVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzjq.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzjq.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzjq.zzf(obj, j)).intValue();
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
        return ((Long) zzjq.zzf(obj, j)).longValue();
    }

    private final zzhm zzu(int i) {
        int i2 = i / 3;
        return (zzhm) this.zzd[i2 + i2 + 1];
    }

    private final zzix zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzix zzixVar = (zzix) objArr[i3];
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zzixVarZzb = zziu.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzixVarZzb;
        return zzixVarZzb;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzix zzixVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzixVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzixVarZzv.zze();
        if (object != null) {
            zzixVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzix zzixVarZzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzixVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzixVarZzv.zze();
        if (object != null) {
            zzixVarZzv.zzg(objZze, object);
        }
        return objZze;
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
    /* JADX WARN: Code duplicated, block: B:141:0x038a  */
    /* JADX WARN: Code duplicated, block: B:211:0x054c  */
    /* JADX WARN: Code duplicated, block: B:280:0x0710 A[PHI: r0
      0x0710: PHI (r0v2 com.google.android.gms.internal.play_billing.zzip<T>) = 
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v39 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzip<T>)
     binds: [B:18:0x004f, B:278:0x0703, B:243:0x0639, B:276:0x06fb, B:218:0x057f, B:135:0x036a, B:132:0x0353, B:129:0x033c, B:126:0x0325, B:123:0x030e, B:120:0x02f6, B:117:0x02de, B:114:0x02c6, B:111:0x02ac, B:108:0x0294, B:105:0x027c, B:102:0x0264, B:99:0x024c, B:96:0x0234, B:82:0x01e0, B:84:0x01ee, B:78:0x01c4, B:74:0x01b4, B:70:0x019d, B:67:0x0188, B:64:0x0172, B:61:0x0165, B:58:0x0158, B:55:0x0149, B:49:0x011f, B:46:0x010b, B:42:0x00ed, B:39:0x00d7, B:36:0x00c0, B:33:0x00b2, B:30:0x00a4, B:27:0x0089, B:24:0x006e, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zza(Object obj) {
        int i;
        int iZzz;
        int iZzz2;
        int iZzA;
        int iZzz3;
        int iZzz4;
        int iZzz5;
        int iZzd;
        int iZzz6;
        int iZzh;
        int iZzg;
        int size;
        int iZzl;
        int iZzz7;
        int iZzz8;
        int iZzz9;
        int iZzA2;
        int iZze;
        int iZzz10;
        int iZzz11;
        int iZzw;
        int iZzz12;
        int iZzz13;
        int iZzz14;
        int iZzd2;
        int iZzz15;
        zzip<T> zzipVar = this;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int iZzz16 = 0;
        int i5 = 1048575;
        while (i3 < zzipVar.zzc.length) {
            int iZzs = zzipVar.zzs(i3);
            int iZzr = zzr(iZzs);
            int[] iArr = zzipVar.zzc;
            int i6 = iArr[i3];
            int i7 = iArr[i3 + 2];
            int i8 = i7 & i2;
            if (iZzr <= 17) {
                if (i8 != i5) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = iZzs & i2;
            if (iZzr >= zzhc.DOUBLE_LIST_PACKED.zza()) {
                zzhc.SINT64_LIST_PACKED.zza();
            }
            int i10 = iZzz16;
            long j = i9;
            switch (iZzr) {
                case 0:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        iZzz16 = i10 + zzgr.zzz(i6 << 3) + 8;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        iZzz = zzgr.zzz(i6 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzz2 = zzgr.zzz(i6 << 3);
                        iZzA = zzgr.zzA(j2);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzz2 = zzgr.zzz(i6 << 3);
                        iZzA = zzgr.zzA(j3);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzz2 = zzgr.zzz(i6 << 3);
                        iZzA = zzgr.zzA(j4);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        iZzz3 = zzgr.zzz(i6 << 3);
                        iZzz4 = iZzz3 + 8;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        iZzz = zzgr.zzz(i6 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        iZzz4 = zzgr.zzz(i6 << 3) + 1;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        int i11 = i6 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgk) {
                            iZzz5 = zzgr.zzz(i11);
                            iZzd = ((zzgk) object).zzd();
                            iZzz6 = zzgr.zzz(iZzd);
                            iZzz4 = iZzz5 + iZzz6 + iZzd;
                            iZzz16 = i10 + iZzz4;
                            zzipVar = this;
                            i3 += 3;
                            i2 = 1048575;
                        } else {
                            iZzz2 = zzgr.zzz(i11);
                            iZzA = zzgr.zzy((String) object);
                            iZzz4 = iZzz2 + iZzA;
                            iZzz16 = i10 + iZzz4;
                            zzipVar = this;
                            i3 += 3;
                            i2 = 1048575;
                        }
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        iZzh = zziz.zzh(i6, unsafe.getObject(obj, j), zzipVar.zzv(i3));
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj, j);
                        iZzz5 = zzgr.zzz(i6 << 3);
                        iZzd = zzgkVar.zzd();
                        iZzz6 = zzgr.zzz(iZzd);
                        iZzz4 = iZzz5 + iZzz6 + iZzd;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzz2 = zzgr.zzz(i6 << 3);
                        iZzA = zzgr.zzz(i12);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzz2 = zzgr.zzz(i6 << 3);
                        iZzA = zzgr.zzA(j5);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        iZzz = zzgr.zzz(i6 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        iZzz3 = zzgr.zzz(i6 << 3);
                        iZzz4 = iZzz3 + 8;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        int i13 = unsafe.getInt(obj, j);
                        iZzz2 = zzgr.zzz(i6 << 3);
                        iZzA = zzgr.zzz((i13 >> 31) ^ (i13 + i13));
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzz2 = zzgr.zzz(i6 << 3);
                        iZzA = zzgr.zzA((j6 >> 63) ^ (j6 + j6));
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 = i10 + iZzz4;
                        zzipVar = this;
                        i3 += 3;
                        i2 = 1048575;
                    }
                    zzipVar = this;
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (zzipVar.zzJ(obj, i3, i5, i4, i)) {
                        iZzh = zzgr.zzw(i6, (zzim) unsafe.getObject(obj, j), zzipVar.zzv(i3));
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    iZzh = zziz.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    iZzh = zziz.zzb(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i14 = zziz.zza;
                    if (list.size() == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zziz.zzg(list) + (list.size() * zzgr.zzz(i6 << 3));
                    }
                    iZzz16 = iZzg + i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i15 = zziz.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zziz.zzl(list2);
                        iZzz7 = zzgr.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zziz.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zziz.zzf(list3);
                        iZzz7 = zzgr.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    iZzh = zziz.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    iZzh = zziz.zzb(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i17 = zziz.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = size2 * (zzgr.zzz(i6 << 3) + 1);
                    }
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i18 = zziz.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzgr.zzz(i6 << 3) * size3;
                        if (list5 instanceof zzhy) {
                            zzhy zzhyVar = (zzhy) list5;
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object objZzc = zzhyVar.zzc();
                                if (objZzc instanceof zzgk) {
                                    int iZzd3 = ((zzgk) objZzc).zzd();
                                    iZzg += zzgr.zzz(iZzd3) + iZzd3;
                                } else {
                                    iZzg += zzgr.zzy((String) objZzc);
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj2 = list5.get(i20);
                                if (obj2 instanceof zzgk) {
                                    int iZzd4 = ((zzgk) obj2).zzd();
                                    iZzg += zzgr.zzz(iZzd4) + iZzd4;
                                } else {
                                    iZzg += zzgr.zzy((String) obj2);
                                }
                            }
                        }
                    }
                    iZzz16 = iZzg + i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzix zzixVarZzv = zzipVar.zzv(i3);
                    int i21 = zziz.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzz8 = 0;
                    } else {
                        iZzz8 = zzgr.zzz(i6 << 3) * size4;
                        for (int i22 = 0; i22 < size4; i22++) {
                            Object obj3 = list6.get(i22);
                            if (obj3 instanceof zzhx) {
                                int iZza = ((zzhx) obj3).zza();
                                iZzz8 += zzgr.zzz(iZza) + iZza;
                            } else {
                                iZzz8 += zzgr.zzx((zzim) obj3, zzixVarZzv);
                            }
                        }
                    }
                    iZzz16 = i10 + iZzz8;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i23 = zziz.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzz9 = 0;
                    } else {
                        iZzz9 = size5 * zzgr.zzz(i6 << 3);
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int iZzd5 = ((zzgk) list7.get(i24)).zzd();
                            iZzz9 += zzgr.zzz(iZzd5) + iZzd5;
                        }
                    }
                    iZzz16 = i10 + iZzz9;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i25 = zziz.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zziz.zzk(list8);
                        iZzz7 = zzgr.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i26 = zziz.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zziz.zza(list9);
                        iZzz7 = zzgr.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    iZzh = zziz.zzb(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    iZzh = zziz.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i27 = zziz.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zziz.zzi(list10);
                        iZzz7 = zzgr.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i28 = zziz.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zziz.zzj(list11);
                        iZzz7 = zzgr.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 = i10 + iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    iZze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    iZze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    iZze = zziz.zzg((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    iZze = zziz.zzl((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    iZze = zziz.zzf((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    iZze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    iZze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i29 = zziz.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    iZze = zziz.zzk((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    iZze = zziz.zza((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    iZze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    iZze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    iZze = zziz.zzi((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 48:
                    iZze = zziz.zzj((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i6 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 = i10 + iZzz9;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzix zzixVarZzv2 = zzipVar.zzv(i3);
                    int i30 = zziz.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzw = 0;
                    } else {
                        iZzw = 0;
                        for (int i31 = 0; i31 < size6; i31++) {
                            iZzw += zzgr.zzw(i6, (zzim) list13.get(i31), zzixVarZzv2);
                        }
                    }
                    iZzz16 = i10 + iZzw;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES /* 50 */:
                    zzig zzigVar = (zzig) unsafe.getObject(obj, j);
                    if (!zzigVar.isEmpty()) {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 51:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        iZzz12 = zzgr.zzz(i6 << 3);
                        iZzh = iZzz12 + 8;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 52:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        iZzz13 = zzgr.zzz(i6 << 3);
                        iZzh = iZzz13 + 4;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 53:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        long jZzt = zzt(obj, j);
                        iZzl = zzgr.zzz(i6 << 3);
                        iZzA2 = zzgr.zzA(jZzt);
                        iZzh = iZzl + iZzA2;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 54:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        long jZzt2 = zzt(obj, j);
                        iZzl = zzgr.zzz(i6 << 3);
                        iZzA2 = zzgr.zzA(jZzt2);
                        iZzh = iZzl + iZzA2;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 55:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        long jZzo = zzo(obj, j);
                        iZzl = zzgr.zzz(i6 << 3);
                        iZzA2 = zzgr.zzA(jZzo);
                        iZzh = iZzl + iZzA2;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 56:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        iZzz12 = zzgr.zzz(i6 << 3);
                        iZzh = iZzz12 + 8;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 57:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        iZzz13 = zzgr.zzz(i6 << 3);
                        iZzh = iZzz13 + 4;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 58:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        iZzh = zzgr.zzz(i6 << 3) + 1;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 59:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        int i32 = i6 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgk) {
                            iZzz14 = zzgr.zzz(i32);
                            iZzd2 = ((zzgk) object2).zzd();
                            iZzz15 = zzgr.zzz(iZzd2);
                            iZzh = iZzz14 + iZzz15 + iZzd2;
                            iZzz16 = i10 + iZzh;
                        } else {
                            iZzl = zzgr.zzz(i32);
                            iZzA2 = zzgr.zzy((String) object2);
                            iZzh = iZzl + iZzA2;
                            iZzz16 = i10 + iZzh;
                        }
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        iZzh = zziz.zzh(i6, unsafe.getObject(obj, j), zzipVar.zzv(i3));
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj, j);
                        iZzz14 = zzgr.zzz(i6 << 3);
                        iZzd2 = zzgkVar2.zzd();
                        iZzz15 = zzgr.zzz(iZzd2);
                        iZzh = iZzz14 + iZzz15 + iZzd2;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 62:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        int iZzo = zzo(obj, j);
                        iZzl = zzgr.zzz(i6 << 3);
                        iZzA2 = zzgr.zzz(iZzo);
                        iZzh = iZzl + iZzA2;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        long jZzo2 = zzo(obj, j);
                        iZzl = zzgr.zzz(i6 << 3);
                        iZzA2 = zzgr.zzA(jZzo2);
                        iZzh = iZzl + iZzA2;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 64:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        iZzz13 = zzgr.zzz(i6 << 3);
                        iZzh = iZzz13 + 4;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 65:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        iZzz12 = zzgr.zzz(i6 << 3);
                        iZzh = iZzz12 + 8;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 66:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        int iZzo2 = zzo(obj, j);
                        iZzl = zzgr.zzz(i6 << 3);
                        iZzA2 = zzgr.zzz((iZzo2 >> 31) ^ (iZzo2 + iZzo2));
                        iZzh = iZzl + iZzA2;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 67:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        long jZzt3 = zzt(obj, j);
                        iZzl = zzgr.zzz(i6 << 3);
                        iZzA2 = zzgr.zzA((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iZzh = iZzl + iZzA2;
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 68:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        iZzh = zzgr.zzw(i6, (zzim) unsafe.getObject(obj, j), zzipVar.zzv(i3));
                        iZzz16 = i10 + iZzh;
                    } else {
                        iZzz16 = i10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                default:
                    iZzz16 = i10;
                    i3 += 3;
                    i2 = 1048575;
                    break;
            }
        }
        int iZza2 = iZzz16 + ((zzhk) obj).zzc.zza();
        if (!zzipVar.zzh) {
            return iZza2;
        }
        zzhb zzhbVar = ((zzhh) obj).zzb;
        int iZzc = zzhbVar.zza.zzc();
        int iZzb = 0;
        for (int i33 = 0; i33 < iZzc; i33++) {
            Map.Entry entryZzg = zzhbVar.zza.zzg(i33);
            iZzb += zzhb.zzb((zzha) ((zzjb) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzhbVar.zza.zzd()) {
            iZzb += zzhb.zzb((zzha) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzs = zzs(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzjq.zza(obj, j));
                    byte[] bArr = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzjq.zzb(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr2 = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr3 = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr4 = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = zzhp.zza(zzjq.zzw(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objZzf = zzjq.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr5 = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr6 = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objZzf2 = zzjq.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i3 = i2 + iHashCode;
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
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
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
                    i = i3 * 53;
                    iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES /* 50 */:
                    i = i3 * 53;
                    iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzhp.zza(zzN(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + ((zzhk) obj).zzc.hashCode();
        return this.zzh ? (iHashCode2 * 53) + ((zzhh) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0278  */
    /* JADX WARN: Code duplicated, block: B:102:0x027c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0294  */
    /* JADX WARN: Code duplicated, block: B:107:0x0298  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:468:0x0abc A[PHI: r8 r9 r11 r15
      0x0abc: PHI (r8v65 int) = (r8v42 int), (r8v43 int), (r8v44 int), (r8v46 int), (r8v47 int), (r8v50 int), (r8v58 int), (r8v66 int) binds: [B:404:0x0961, B:391:0x091e, B:371:0x08b8, B:343:0x0843, B:283:0x074e, B:281:0x0740, B:216:0x05f4, B:467:0x0abb] A[DONT_GENERATE, DONT_INLINE]
      0x0abc: PHI (r9v99 int) = (r9v66 int), (r9v67 int), (r9v68 int), (r9v70 int), (r9v71 int), (r9v82 int), (r9v92 int), (r9v100 int) binds: [B:404:0x0961, B:391:0x091e, B:371:0x08b8, B:343:0x0843, B:283:0x074e, B:281:0x0740, B:216:0x05f4, B:467:0x0abb] A[DONT_GENERATE, DONT_INLINE]
      0x0abc: PHI (r11v83 int) = (r11v57 int), (r11v58 int), (r11v59 int), (r11v61 int), (r11v62 int), (r11v65 int), (r11v78 int), (r11v84 int) binds: [B:404:0x0961, B:391:0x091e, B:371:0x08b8, B:343:0x0843, B:283:0x074e, B:281:0x0740, B:216:0x05f4, B:467:0x0abb] A[DONT_GENERATE, DONT_INLINE]
      0x0abc: PHI (r15v68 java.lang.Object) = 
      (r15v44 java.lang.Object)
      (r15v45 java.lang.Object)
      (r15v46 java.lang.Object)
      (r15v48 java.lang.Object)
      (r15v49 java.lang.Object)
      (r15v52 java.lang.Object)
      (r15v63 java.lang.Object)
      (r15v69 java.lang.Object)
     binds: [B:404:0x0961, B:391:0x091e, B:371:0x08b8, B:343:0x0843, B:283:0x074e, B:281:0x0740, B:216:0x05f4, B:467:0x0abb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:556:0x0d0d A[PHI: r6 r9 r10 r26
      0x0d0d: PHI (r6v52 byte[]) = 
      (r6v34 byte[])
      (r6v35 byte[])
      (r6v36 byte[])
      (r6v37 byte[])
      (r6v38 byte[])
      (r6v39 byte[])
      (r6v40 byte[])
      (r6v42 byte[])
      (r6v43 byte[])
      (r6v45 byte[])
      (r6v53 byte[])
     binds: [B:553:0x0cf5, B:550:0x0cd7, B:547:0x0cbd, B:544:0x0ca4, B:541:0x0c8a, B:538:0x0c6f, B:531:0x0c4c, B:517:0x0c10, B:515:0x0c01, B:511:0x0bdb, B:485:0x0b27] A[DONT_GENERATE, DONT_INLINE]
      0x0d0d: PHI (r9v43 com.google.android.gms.internal.play_billing.zzfz) = 
      (r9v29 com.google.android.gms.internal.play_billing.zzfz)
      (r9v30 com.google.android.gms.internal.play_billing.zzfz)
      (r9v31 com.google.android.gms.internal.play_billing.zzfz)
      (r9v32 com.google.android.gms.internal.play_billing.zzfz)
      (r9v33 com.google.android.gms.internal.play_billing.zzfz)
      (r9v34 com.google.android.gms.internal.play_billing.zzfz)
      (r9v35 com.google.android.gms.internal.play_billing.zzfz)
      (r9v37 com.google.android.gms.internal.play_billing.zzfz)
      (r9v38 com.google.android.gms.internal.play_billing.zzfz)
      (r9v40 com.google.android.gms.internal.play_billing.zzfz)
      (r9v44 com.google.android.gms.internal.play_billing.zzfz)
     binds: [B:553:0x0cf5, B:550:0x0cd7, B:547:0x0cbd, B:544:0x0ca4, B:541:0x0c8a, B:538:0x0c6f, B:531:0x0c4c, B:517:0x0c10, B:515:0x0c01, B:511:0x0bdb, B:485:0x0b27] A[DONT_GENERATE, DONT_INLINE]
      0x0d0d: PHI (r10v64 int) = 
      (r10v37 int)
      (r10v38 int)
      (r10v39 int)
      (r10v40 int)
      (r10v41 int)
      (r10v42 int)
      (r10v43 int)
      (r10v45 int)
      (r10v47 int)
      (r9v28 int)
      (r10v65 int)
     binds: [B:553:0x0cf5, B:550:0x0cd7, B:547:0x0cbd, B:544:0x0ca4, B:541:0x0c8a, B:538:0x0c6f, B:531:0x0c4c, B:517:0x0c10, B:515:0x0c01, B:511:0x0bdb, B:485:0x0b27] A[DONT_GENERATE, DONT_INLINE]
      0x0d0d: PHI (r26v22 int) = 
      (r26v4 int)
      (r26v5 int)
      (r26v6 int)
      (r26v7 int)
      (r26v8 int)
      (r26v9 int)
      (r26v10 int)
      (r26v12 int)
      (r26v13 int)
      (r26v16 int)
      (r26v23 int)
     binds: [B:553:0x0cf5, B:550:0x0cd7, B:547:0x0cbd, B:544:0x0ca4, B:541:0x0c8a, B:538:0x0c6f, B:531:0x0c4c, B:517:0x0c10, B:515:0x0c01, B:511:0x0bdb, B:485:0x0b27] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:572:0x0d5c  */
    /* JADX WARN: Code duplicated, block: B:641:0x0abf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0d10 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x0d21 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0ad0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:0x022f A[EDGE_INSN: B:770:0x022f->B:768:0x022f BREAK  A[LOOP:26: B:85:0x0243->B:89:0x024f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:0x022f A[EDGE_INSN: B:771:0x022f->B:768:0x022f BREAK  A[LOOP:26: B:85:0x0243->B:89:0x024f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0231  */
    /* JADX WARN: Code duplicated, block: B:87:0x0247  */
    /* JADX WARN: Code duplicated, block: B:89:0x024f A[LOOP:26: B:85:0x0243->B:89:0x024f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x025f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0274  */
    /* JADX WARN: Multi-variable type inference failed */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzfz zzfzVar) throws IOException {
        Unsafe unsafe;
        int i4;
        int i5;
        Object obj2;
        int iZzq;
        int i6;
        byte[] bArr2;
        zzfz zzfzVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe2;
        Object obj3;
        byte[] bArr3;
        zzfz zzfzVar3;
        int i14;
        int i15;
        int i16;
        byte[] bArr4;
        Unsafe unsafe3;
        int i17;
        int i18;
        int i19;
        int i20;
        byte b;
        int i21;
        byte b2;
        int i22;
        Object obj4;
        int i23;
        zzfz zzfzVar4;
        int i24;
        int i25;
        int i26;
        int iZzk;
        byte[] bArr5;
        int i27;
        int iZza;
        int i28;
        int iZzf;
        int iZzh;
        int i29;
        int iZzk2;
        int iZzk3;
        int i30;
        int i31;
        int i32;
        int i33;
        int iZzf2;
        int i34;
        int i35;
        Object obj5 = obj;
        byte[] bArr6 = bArr;
        i2 = i2;
        zzfz zzfzVar5 = zzfzVar;
        zzA(obj5);
        Unsafe unsafe4 = zzb;
        int i36 = 0;
        int iZzg = i;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = -1;
        int i41 = 1048575;
        while (true) {
            if (iZzg < i2) {
                int iZzi = iZzg + 1;
                int i42 = bArr6[iZzg];
                if (i42 < 0) {
                    iZzi = zzga.zzi(i42, bArr6, iZzi, zzfzVar5);
                    i42 = zzfzVar5.zza;
                }
                int i43 = iZzi;
                int i44 = i42;
                iZzg = i43;
                int i45 = (i44 == true ? 1 : 0) >>> 3;
                if (i45 > i40) {
                    int i46 = i37 / 3;
                    if (i45 < this.zze || i45 > this.zzf) {
                        iZzq = -1;
                    } else {
                        iZzq = zzq(i45, i46);
                    }
                } else if (i45 < this.zze || i45 > this.zzf) {
                    iZzq = -1;
                } else {
                    iZzq = zzq(i45, i36);
                }
                if (iZzq == -1) {
                    unsafe = unsafe4;
                    i6 = i44 == true ? 1 : 0;
                    bArr2 = bArr6;
                    zzfzVar2 = zzfzVar5;
                    i7 = i36;
                    i8 = i7;
                    i9 = i45;
                    i5 = i39;
                    i3 = i3;
                    obj2 = obj5;
                } else {
                    boolean z = (i44 == true ? 1 : 0) & 7;
                    int[] iArr = this.zzc;
                    int i47 = iArr[iZzq + 1];
                    int i48 = iZzq;
                    int iZzr = zzr(i47);
                    long j = i47 & 1048575;
                    if (iZzr <= 17) {
                        int i49 = iArr[i48 + 2];
                        int i50 = 1 << (i49 >>> 20);
                        int i51 = i49 & 1048575;
                        if (i51 != i41) {
                            int i52 = 1048575;
                            if (i41 != 1048575) {
                                unsafe4.putInt(obj5, i41, i39);
                                i52 = 1048575;
                            }
                            i39 = i51 == i52 ? 0 : unsafe4.getInt(obj5, i51);
                            i41 = i51;
                        }
                        switch (iZzr) {
                            case 0:
                                zzfz zzfzVar6 = zzfzVar5;
                                bArr3 = bArr6;
                                zzfzVar3 = zzfzVar6;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i36 = 0;
                                i13 = i41;
                                i5 = i39;
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                if (z == 1) {
                                    i14 = iZzg + 8;
                                    i15 = i5 | i50;
                                    zzjq.zzo(obj3, j, Double.longBitsToDouble(zzga.zzn(bArr3, iZzg)));
                                    byte[] bArr7 = bArr3;
                                    zzfzVar5 = zzfzVar3;
                                    bArr6 = bArr7;
                                    i2 = i2;
                                    iZzg = i14;
                                    i38 = i12;
                                    obj5 = obj3;
                                    unsafe4 = unsafe2;
                                    i41 = i13;
                                    i40 = i45;
                                    i39 = i15;
                                    i37 = i7;
                                } else {
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 1:
                                zzfz zzfzVar7 = zzfzVar5;
                                bArr3 = bArr6;
                                zzfzVar3 = zzfzVar7;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i36 = 0;
                                i13 = i41;
                                i5 = i39;
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                if (z == 5) {
                                    i14 = iZzg + 4;
                                    i15 = i5 | i50;
                                    zzjq.zzp(obj3, j, Float.intBitsToFloat(zzga.zzb(bArr3, iZzg)));
                                    byte[] bArr8 = bArr3;
                                    zzfzVar5 = zzfzVar3;
                                    bArr6 = bArr8;
                                    i2 = i2;
                                    iZzg = i14;
                                    i38 = i12;
                                    obj5 = obj3;
                                    unsafe4 = unsafe2;
                                    i41 = i13;
                                    i40 = i45;
                                    i39 = i15;
                                    i37 = i7;
                                } else {
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 2:
                            case 3:
                                zzfz zzfzVar8 = zzfzVar5;
                                byte[] bArr9 = bArr6;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i36 = 0;
                                i13 = i41;
                                i5 = i39;
                                if (z == 0) {
                                    int iZzk4 = zzga.zzk(bArr9, iZzg, zzfzVar8);
                                    unsafe4.putLong(obj5, j, zzfzVar8.zzb);
                                    zzfzVar5 = zzfzVar8;
                                    bArr6 = bArr9;
                                    i39 = i5 | i50;
                                    iZzg = iZzk4;
                                    i37 = i7;
                                    i38 = i12;
                                    i41 = i13;
                                    i40 = i45;
                                    i2 = i2;
                                } else {
                                    unsafe2 = unsafe4;
                                    obj3 = obj5;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 4:
                            case 11:
                                zzfz zzfzVar9 = zzfzVar5;
                                byte[] bArr10 = bArr6;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i36 = 0;
                                i13 = i41;
                                i5 = i39;
                                if (z == 0) {
                                    i16 = i5 | i50;
                                    iZzg = zzga.zzh(bArr10, iZzg, zzfzVar9);
                                    unsafe4.putInt(obj5, j, zzfzVar9.zza);
                                    bArr4 = bArr10;
                                    zzfzVar5 = zzfzVar9;
                                    bArr6 = bArr4;
                                    i2 = i2;
                                    i39 = i16;
                                    i37 = i7;
                                    i38 = i12;
                                    i41 = i13;
                                    i40 = i45;
                                } else {
                                    unsafe2 = unsafe4;
                                    obj3 = obj5;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 5:
                            case 14:
                                byte[] bArr11 = bArr6;
                                Unsafe unsafe5 = unsafe4;
                                zzfz zzfzVar10 = zzfzVar5;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i36 = 0;
                                i13 = i41;
                                i5 = i39;
                                if (z == 1) {
                                    unsafe4 = unsafe5;
                                    unsafe4.putLong(obj5, j, zzga.zzn(bArr11, iZzg));
                                    zzfzVar5 = zzfzVar10;
                                    bArr6 = bArr11;
                                    iZzg += 8;
                                    i39 = i5 | i50;
                                    i37 = i7;
                                    i38 = i12;
                                    i41 = i13;
                                    i40 = i45;
                                    i2 = i2;
                                } else {
                                    unsafe4 = unsafe5;
                                    unsafe2 = unsafe4;
                                    obj3 = obj5;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 6:
                            case 13:
                                byte[] bArr12 = bArr6;
                                unsafe3 = unsafe4;
                                zzfz zzfzVar11 = zzfzVar5;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i36 = 0;
                                i13 = i41;
                                i5 = i39;
                                if (z == 5) {
                                    i17 = i5 | i50;
                                    unsafe3.putInt(obj5, j, zzga.zzb(bArr12, iZzg));
                                    zzfzVar5 = zzfzVar11;
                                    unsafe4 = unsafe3;
                                    bArr6 = bArr12;
                                    iZzg += 4;
                                    i39 = i17;
                                    i37 = i7;
                                    i38 = i12;
                                    i41 = i13;
                                    i40 = i45;
                                } else {
                                    obj3 = obj5;
                                    unsafe2 = unsafe3;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 7:
                                byte[] bArr13 = bArr6;
                                unsafe3 = unsafe4;
                                zzfz zzfzVar12 = zzfzVar5;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i36 = 0;
                                i13 = i41;
                                i5 = i39;
                                if (z == 0) {
                                    i16 = i5 | i50;
                                    iZzg = zzga.zzk(bArr13, iZzg, zzfzVar12);
                                    zzjq.zzm(obj5, j, zzfzVar12.zzb != 0);
                                    bArr4 = bArr13;
                                    zzfzVar5 = zzfzVar12;
                                    unsafe4 = unsafe3;
                                    bArr6 = bArr4;
                                    i2 = i2;
                                    i39 = i16;
                                    i37 = i7;
                                    i38 = i12;
                                    i41 = i13;
                                    i40 = i45;
                                } else {
                                    obj3 = obj5;
                                    unsafe2 = unsafe3;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 8:
                                byte[] bArr14 = bArr6;
                                unsafe3 = unsafe4;
                                zzfz zzfzVar13 = zzfzVar5;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i13 = i41;
                                i5 = i39;
                                if (z == 2) {
                                    if ((i47 & 536870912) != 0) {
                                        int i53 = i5 | i50;
                                        iZzg = zzga.zzh(bArr14, iZzg, zzfzVar13);
                                        int i54 = zzfzVar13.zza;
                                        if (i54 < 0) {
                                            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i54 == 0) {
                                            zzfzVar13.zzc = "";
                                            i18 = i53;
                                            i36 = 0;
                                        } else {
                                            int i55 = zzjt.zza;
                                            int length = bArr14.length;
                                            if ((((length - iZzg) - i54) | iZzg | i54) < 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzg), Integer.valueOf(i54)));
                                            }
                                            int i56 = iZzg + i54;
                                            char[] cArr = new char[i54];
                                            int i57 = 0;
                                            while (iZzg < i56) {
                                                byte b3 = bArr14[iZzg];
                                                if (zzjr.zzd(b3)) {
                                                    iZzg++;
                                                    cArr[i57] = (char) b3;
                                                    i57++;
                                                } else {
                                                    while (iZzg < i56) {
                                                        i19 = iZzg + 1;
                                                        i20 = iZzg;
                                                        b = bArr14[i20];
                                                        if (zzjr.zzd(b)) {
                                                            i21 = i57 + 1;
                                                            cArr[i57] = (char) b;
                                                            iZzg = i19;
                                                            while (true) {
                                                                i57 = i21;
                                                                if (iZzg < i56) {
                                                                }
                                                                b2 = bArr14[iZzg];
                                                                if (zzjr.zzd(b2)) {
                                                                }
                                                                iZzg++;
                                                                i21 = i57 + 1;
                                                                cArr[i57] = (char) b2;
                                                            }
                                                        } else {
                                                            int i58 = i53;
                                                            if (b < -32) {
                                                                if (b < -16) {
                                                                    if (i19 < i56 - 1) {
                                                                        throw new zzhr("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    int i59 = i20 + 2;
                                                                    i22 = i20 + 3;
                                                                    zzjr.zzb(b, bArr14[i19], bArr14[i59], cArr, i57);
                                                                    i57++;
                                                                } else {
                                                                    if (i19 < i56 - 2) {
                                                                        throw new zzhr("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    char[] cArr2 = cArr;
                                                                    zzjr.zza(b, bArr14[i19], bArr14[i20 + 2], bArr14[i20 + 3], cArr2, i57);
                                                                    i57 += 2;
                                                                    cArr = cArr2;
                                                                    iZzg = i20 + 4;
                                                                }
                                                                i53 = i58;
                                                            } else {
                                                                if (i19 < i56) {
                                                                    throw new zzhr("Protocol message had invalid UTF-8.");
                                                                }
                                                                i22 = i20 + 2;
                                                                zzjr.zzc(b, bArr14[i19], cArr, i57);
                                                                i57++;
                                                            }
                                                            iZzg = i22;
                                                            i53 = i58;
                                                        }
                                                        break;
                                                    }
                                                    i18 = i53;
                                                    i36 = 0;
                                                    zzfzVar13.zzc = new String(cArr, 0, i57);
                                                    iZzg = i56;
                                                }
                                            }
                                            while (iZzg < i56) {
                                                i19 = iZzg + 1;
                                                i20 = iZzg;
                                                b = bArr14[i20];
                                                if (zzjr.zzd(b)) {
                                                    i21 = i57 + 1;
                                                    cArr[i57] = (char) b;
                                                    iZzg = i19;
                                                    while (true) {
                                                        i57 = i21;
                                                        if (iZzg < i56) {
                                                        }
                                                        b2 = bArr14[iZzg];
                                                        if (zzjr.zzd(b2)) {
                                                        }
                                                        iZzg++;
                                                        i21 = i57 + 1;
                                                        cArr[i57] = (char) b2;
                                                    }
                                                } else {
                                                    int i510 = i53;
                                                    if (b < -32) {
                                                        if (b < -16) {
                                                            if (i19 < i56 - 1) {
                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                            }
                                                            int i511 = i20 + 2;
                                                            i22 = i20 + 3;
                                                            zzjr.zzb(b, bArr14[i19], bArr14[i511], cArr, i57);
                                                            i57++;
                                                        } else {
                                                            if (i19 < i56 - 2) {
                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                            }
                                                            char[] cArr3 = cArr;
                                                            zzjr.zza(b, bArr14[i19], bArr14[i20 + 2], bArr14[i20 + 3], cArr3, i57);
                                                            i57 += 2;
                                                            cArr = cArr3;
                                                            iZzg = i20 + 4;
                                                        }
                                                        i53 = i510;
                                                    } else {
                                                        if (i19 < i56) {
                                                            throw new zzhr("Protocol message had invalid UTF-8.");
                                                        }
                                                        i22 = i20 + 2;
                                                        zzjr.zzc(b, bArr14[i19], cArr, i57);
                                                        i57++;
                                                    }
                                                    iZzg = i22;
                                                    i53 = i510;
                                                }
                                                break;
                                            }
                                            i18 = i53;
                                            i36 = 0;
                                            zzfzVar13.zzc = new String(cArr, 0, i57);
                                            iZzg = i56;
                                        }
                                        i17 = i18;
                                    } else {
                                        i36 = 0;
                                        iZzg = zzga.zzh(bArr14, iZzg, zzfzVar13);
                                        int i60 = zzfzVar13.zza;
                                        if (i60 < 0) {
                                            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i17 = i5 | i50;
                                        if (i60 == 0) {
                                            zzfzVar13.zzc = "";
                                        } else {
                                            zzfzVar13.zzc = new String(bArr14, iZzg, i60, zzhp.zza);
                                            iZzg += i60;
                                        }
                                    }
                                    unsafe3.putObject(obj5, j, zzfzVar13.zzc);
                                    zzfzVar5 = zzfzVar13;
                                    unsafe4 = unsafe3;
                                    bArr6 = bArr14;
                                    i39 = i17;
                                    i37 = i7;
                                    i38 = i12;
                                    i41 = i13;
                                    i40 = i45;
                                } else {
                                    i36 = 0;
                                    obj3 = obj5;
                                    unsafe2 = unsafe3;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 9:
                                obj4 = obj5;
                                int i61 = i39;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i13 = i41;
                                if (z == 2) {
                                    i39 = i61 | i50;
                                    Unsafe unsafe6 = unsafe4;
                                    Object objZzx = zzx(obj4, i7);
                                    byte[] bArr15 = bArr6;
                                    zzfz zzfzVar14 = zzfzVar5;
                                    int iZzm = zzga.zzm(objZzx, zzv(i7), bArr15, iZzg, i2, zzfzVar14);
                                    zzF(obj4, i7, objZzx);
                                    zzfzVar5 = zzfzVar14;
                                    unsafe4 = unsafe6;
                                    bArr6 = bArr15;
                                    iZzg = iZzm;
                                    obj5 = obj4;
                                    i37 = i7;
                                    i38 = i12;
                                    i41 = i13;
                                    i40 = i45;
                                    i36 = 0;
                                } else {
                                    i5 = i61;
                                    unsafe2 = unsafe4;
                                    obj3 = obj4;
                                    i36 = 0;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 10:
                                obj4 = obj5;
                                i23 = i39;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i13 = i41;
                                if (z == 2) {
                                    i23 |= i50;
                                    iZzg = zzga.zza(bArr6, iZzg, zzfzVar5);
                                    unsafe4.putObject(obj4, j, zzfzVar5.zzc);
                                    i39 = i23;
                                    obj5 = obj4;
                                    i37 = i7;
                                    i38 = i12;
                                    i41 = i13;
                                    i40 = i45;
                                    i36 = 0;
                                } else {
                                    unsafe2 = unsafe4;
                                    i5 = i23;
                                    obj3 = obj4;
                                    i36 = 0;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 12:
                                obj4 = obj5;
                                i23 = i39;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i13 = i41;
                                if (z == 0) {
                                    iZzg = zzga.zzh(bArr6, iZzg, zzfzVar5);
                                    int i62 = zzfzVar5.zza;
                                    zzhm zzhmVarZzu = zzu(i7);
                                    if ((Integer.MIN_VALUE & i47) == 0 || zzhmVarZzu == null || zzhmVarZzu.zza(i62)) {
                                        i23 |= i50;
                                        unsafe4.putInt(obj4, j, i62);
                                    } else {
                                        zzd(obj4).zzj(i12 == true ? 1 : 0, Long.valueOf(i62));
                                    }
                                    i39 = i23;
                                    obj5 = obj4;
                                    i37 = i7;
                                    i38 = i12;
                                    i41 = i13;
                                    i40 = i45;
                                    i36 = 0;
                                } else {
                                    unsafe2 = unsafe4;
                                    i5 = i23;
                                    obj3 = obj4;
                                    i36 = 0;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 15:
                                obj4 = obj5;
                                i23 = i39;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i13 = i41;
                                if (z == 0) {
                                    i23 |= i50;
                                    iZzg = zzga.zzh(bArr6, iZzg, zzfzVar5);
                                    unsafe4.putInt(obj4, j, zzgn.zzb(zzfzVar5.zza));
                                    i39 = i23;
                                    obj5 = obj4;
                                    i37 = i7;
                                    i38 = i12;
                                    i41 = i13;
                                    i40 = i45;
                                    i36 = 0;
                                } else {
                                    unsafe2 = unsafe4;
                                    i5 = i23;
                                    obj3 = obj4;
                                    i36 = 0;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            case 16:
                                if (z == 0) {
                                    i39 |= i50;
                                    int iZzk5 = zzga.zzk(bArr6, iZzg, zzfzVar5);
                                    unsafe4.putLong(obj5, j, zzgn.zzc(zzfzVar5.zzb));
                                    iZzg = iZzk5;
                                    i37 = i48;
                                    i38 = i44 == true ? 1 : 0;
                                    i40 = i45;
                                    i36 = 0;
                                    i2 = i2;
                                } else {
                                    i7 = i48;
                                    i12 = i44 == true ? 1 : 0;
                                    i13 = i41;
                                    i5 = i39;
                                    i36 = 0;
                                    unsafe2 = unsafe4;
                                    obj3 = obj5;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                            default:
                                zzfz zzfzVar15 = zzfzVar5;
                                byte[] bArr16 = bArr6;
                                i7 = i48;
                                i12 = i44 == true ? 1 : 0;
                                i36 = 0;
                                i13 = i41;
                                i5 = i39;
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                if (z == 3) {
                                    Object objZzx2 = zzx(obj3, i7);
                                    int iZzl = zzga.zzl(objZzx2, zzv(i7), bArr16, iZzg, i2, (i45 << 3) | 4, zzfzVar15);
                                    zzF(obj3, i7, objZzx2);
                                    bArr6 = bArr;
                                    zzfzVar5 = zzfzVar;
                                    iZzg = iZzl;
                                    i37 = i7;
                                    i38 = i12 == true ? 1 : 0;
                                    obj5 = obj3;
                                    unsafe4 = unsafe2;
                                    i41 = i13;
                                    i40 = i45;
                                    i39 = i5 | i50;
                                    i2 = i2;
                                } else {
                                    bArr2 = bArr;
                                    i3 = i3;
                                    zzfzVar2 = zzfzVar;
                                    i8 = i36;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i9 = i45;
                                    obj2 = obj3;
                                    i41 = i13;
                                }
                                break;
                        }
                    } else {
                        Unsafe unsafe7 = unsafe4;
                        Object obj6 = obj5;
                        int i63 = i45;
                        i7 = i48;
                        i8 = 0;
                        if (iZzr != 27) {
                            unsafe = unsafe7;
                            i5 = i39;
                            zzfzVar4 = zzfzVar;
                            i24 = i41;
                            if (iZzr <= 49) {
                                long j2 = i47;
                                Unsafe unsafe8 = zzb;
                                zzho zzhoVarZzd = (zzho) unsafe8.getObject(obj6, j);
                                if (!zzhoVarZzd.zzc()) {
                                    int size = zzhoVarZzd.size();
                                    zzhoVarZzd = zzhoVarZzd.zzd(size + size);
                                    unsafe8.putObject(obj6, j, zzhoVarZzd);
                                }
                                switch (iZzr) {
                                    case 18:
                                    case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                                        zzho zzhoVar = zzhoVarZzd;
                                        i6 = i44 == true ? 1 : 0;
                                        i28 = iZzg;
                                        obj2 = obj6;
                                        i9 = i63;
                                        if (z != 2) {
                                            if (z == 1) {
                                                iZzf = i28 + 8;
                                                int i64 = zzga.zza;
                                                zzgt zzgtVar = (zzgt) zzhoVar;
                                                zzgtVar.zzf(Double.longBitsToDouble(zzga.zzn(bArr, i28)));
                                                while (iZzf < i2) {
                                                    int iZzh2 = zzga.zzh(bArr, iZzf, zzfzVar4);
                                                    if (i6 != zzfzVar4.zza) {
                                                        i29 = i28;
                                                        iZzg = iZzf;
                                                        if (iZzg != i29) {
                                                            zzfzVar4 = zzfzVar4;
                                                            bArr6 = bArr;
                                                            zzfzVar5 = zzfzVar4;
                                                            i38 = i6;
                                                            i40 = i9;
                                                            i37 = i7;
                                                            obj5 = obj2;
                                                            i41 = i24;
                                                            i36 = 0;
                                                            i39 = i5;
                                                            unsafe4 = unsafe;
                                                        } else {
                                                            zzfzVar4 = zzfzVar4;
                                                            zzfzVar2 = zzfzVar4;
                                                            i41 = i24;
                                                            bArr2 = bArr;
                                                        }
                                                    } else {
                                                        zzgtVar.zzf(Double.longBitsToDouble(zzga.zzn(bArr, iZzh2)));
                                                        iZzf = iZzh2 + 8;
                                                    }
                                                    break;
                                                }
                                                i29 = i28;
                                                iZzg = iZzf;
                                                if (iZzg != i29) {
                                                    zzfzVar4 = zzfzVar4;
                                                    bArr6 = bArr;
                                                    zzfzVar5 = zzfzVar4;
                                                    i38 = i6;
                                                    i40 = i9;
                                                    i37 = i7;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                } else {
                                                    zzfzVar4 = zzfzVar4;
                                                    zzfzVar2 = zzfzVar4;
                                                    i41 = i24;
                                                    bArr2 = bArr;
                                                }
                                            }
                                            i29 = i28;
                                            iZzg = i29;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                            break;
                                        } else {
                                            int i65 = zzga.zza;
                                            zzgt zzgtVar2 = (zzgt) zzhoVar;
                                            iZzh = zzga.zzh(bArr, i28, zzfzVar4);
                                            int i66 = zzfzVar4.zza;
                                            int i67 = iZzh + i66;
                                            if (i67 > bArr.length) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgtVar2.zzg(zzgtVar2.size() + (i66 / 8));
                                            while (iZzh < i67) {
                                                zzgtVar2.zzf(Double.longBitsToDouble(zzga.zzn(bArr, iZzh)));
                                                iZzh += 8;
                                            }
                                            if (iZzh != i67) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i29 = i28;
                                            iZzg = iZzh;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    case 19:
                                    case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                                        zzho zzhoVar2 = zzhoVarZzd;
                                        i6 = i44 == true ? 1 : 0;
                                        i28 = iZzg;
                                        obj2 = obj6;
                                        i9 = i63;
                                        if (z != 2) {
                                            if (z == 5) {
                                                iZzf = i28 + 4;
                                                int i68 = zzga.zza;
                                                zzhd zzhdVar = (zzhd) zzhoVar2;
                                                zzhdVar.zzf(Float.intBitsToFloat(zzga.zzb(bArr, i28)));
                                                while (iZzf < i2) {
                                                    int iZzh3 = zzga.zzh(bArr, iZzf, zzfzVar4);
                                                    if (i6 != zzfzVar4.zza) {
                                                        i29 = i28;
                                                        iZzg = iZzf;
                                                        if (iZzg != i29) {
                                                            zzfzVar4 = zzfzVar4;
                                                            bArr6 = bArr;
                                                            zzfzVar5 = zzfzVar4;
                                                            i38 = i6;
                                                            i40 = i9;
                                                            i37 = i7;
                                                            obj5 = obj2;
                                                            i41 = i24;
                                                            i36 = 0;
                                                            i39 = i5;
                                                            unsafe4 = unsafe;
                                                        } else {
                                                            zzfzVar4 = zzfzVar4;
                                                            zzfzVar2 = zzfzVar4;
                                                            i41 = i24;
                                                            bArr2 = bArr;
                                                        }
                                                    } else {
                                                        zzhdVar.zzf(Float.intBitsToFloat(zzga.zzb(bArr, iZzh3)));
                                                        iZzf = iZzh3 + 4;
                                                    }
                                                    break;
                                                }
                                                i29 = i28;
                                                iZzg = iZzf;
                                                if (iZzg != i29) {
                                                    zzfzVar4 = zzfzVar4;
                                                    bArr6 = bArr;
                                                    zzfzVar5 = zzfzVar4;
                                                    i38 = i6;
                                                    i40 = i9;
                                                    i37 = i7;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                } else {
                                                    zzfzVar4 = zzfzVar4;
                                                    zzfzVar2 = zzfzVar4;
                                                    i41 = i24;
                                                    bArr2 = bArr;
                                                }
                                            }
                                            i29 = i28;
                                            iZzg = i29;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                            break;
                                        } else {
                                            int i69 = zzga.zza;
                                            zzhd zzhdVar2 = (zzhd) zzhoVar2;
                                            iZzh = zzga.zzh(bArr, i28, zzfzVar4);
                                            int i70 = zzfzVar4.zza;
                                            int i71 = iZzh + i70;
                                            if (i71 > bArr.length) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzhdVar2.zzg(zzhdVar2.size() + (i70 / 4));
                                            while (iZzh < i71) {
                                                zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr, iZzh)));
                                                iZzh += 4;
                                            }
                                            if (iZzh != i71) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i29 = i28;
                                            iZzg = iZzh;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                                        zzho zzhoVar3 = zzhoVarZzd;
                                        i6 = i44 == true ? 1 : 0;
                                        i28 = iZzg;
                                        obj2 = obj6;
                                        i9 = i63;
                                        if (z != 2) {
                                            if (z == 0) {
                                                int i72 = zzga.zza;
                                                zzib zzibVar = (zzib) zzhoVar3;
                                                iZzk2 = zzga.zzk(bArr, i28, zzfzVar4);
                                                zzibVar.zzf(zzfzVar4.zzb);
                                                while (iZzk2 < i2) {
                                                    int iZzh4 = zzga.zzh(bArr, iZzk2, zzfzVar4);
                                                    if (i6 != zzfzVar4.zza) {
                                                        i29 = i28;
                                                        iZzg = iZzk2;
                                                        if (iZzg != i29) {
                                                            zzfzVar4 = zzfzVar4;
                                                            bArr6 = bArr;
                                                            zzfzVar5 = zzfzVar4;
                                                            i38 = i6;
                                                            i40 = i9;
                                                            i37 = i7;
                                                            obj5 = obj2;
                                                            i41 = i24;
                                                            i36 = 0;
                                                            i39 = i5;
                                                            unsafe4 = unsafe;
                                                        } else {
                                                            zzfzVar4 = zzfzVar4;
                                                            zzfzVar2 = zzfzVar4;
                                                            i41 = i24;
                                                            bArr2 = bArr;
                                                        }
                                                    } else {
                                                        iZzk2 = zzga.zzk(bArr, iZzh4, zzfzVar4);
                                                        zzibVar.zzf(zzfzVar4.zzb);
                                                    }
                                                    break;
                                                }
                                                i29 = i28;
                                                iZzg = iZzk2;
                                                if (iZzg != i29) {
                                                    zzfzVar4 = zzfzVar4;
                                                    bArr6 = bArr;
                                                    zzfzVar5 = zzfzVar4;
                                                    i38 = i6;
                                                    i40 = i9;
                                                    i37 = i7;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                } else {
                                                    zzfzVar4 = zzfzVar4;
                                                    zzfzVar2 = zzfzVar4;
                                                    i41 = i24;
                                                    bArr2 = bArr;
                                                }
                                            }
                                            i29 = i28;
                                            iZzg = i29;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                            break;
                                        } else {
                                            int i73 = zzga.zza;
                                            zzib zzibVar2 = (zzib) zzhoVar3;
                                            iZzh = zzga.zzh(bArr, i28, zzfzVar4);
                                            int i74 = zzfzVar4.zza + iZzh;
                                            while (iZzh < i74) {
                                                iZzh = zzga.zzk(bArr, iZzh, zzfzVar4);
                                                zzibVar2.zzf(zzfzVar4.zzb);
                                            }
                                            if (iZzh != i74) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i29 = i28;
                                            iZzg = iZzh;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                                        i29 = iZzg;
                                        i9 = i63;
                                        obj2 = obj6;
                                        zzho zzhoVar4 = zzhoVarZzd;
                                        i6 = i44 == true ? 1 : 0;
                                        if (z == 2) {
                                            iZzf = zzga.zzf(bArr, i29, zzhoVar4, zzfzVar4);
                                            iZzg = iZzf;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        } else if (z == 0) {
                                            iZzk2 = zzga.zzj(i6 == true ? 1 : 0, bArr, i29, i2, zzhoVar4, zzfzVar4);
                                            iZzg = iZzk2;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            iZzg = i29;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                                        i29 = iZzg;
                                        i9 = i63;
                                        obj2 = obj6;
                                        zzho zzhoVar5 = zzhoVarZzd;
                                        i6 = i44 == true ? 1 : 0;
                                        if (z == 2) {
                                            int i75 = zzga.zza;
                                            zzib zzibVar3 = (zzib) zzhoVar5;
                                            iZzk2 = zzga.zzh(bArr, i29, zzfzVar4);
                                            int i76 = zzfzVar4.zza;
                                            int i77 = iZzk2 + i76;
                                            if (i77 > bArr.length) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzibVar3.zzg(zzibVar3.size() + (i76 / 8));
                                            while (iZzk2 < i77) {
                                                zzibVar3.zzf(zzga.zzn(bArr, iZzk2));
                                                iZzk2 += 8;
                                            }
                                            if (iZzk2 != i77) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzg = iZzk2;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            if (z == 1) {
                                                iZzf = i29 + 8;
                                                int i78 = zzga.zza;
                                                zzib zzibVar4 = (zzib) zzhoVar5;
                                                zzibVar4.zzf(zzga.zzn(bArr, i29));
                                                while (iZzf < i2) {
                                                    int iZzh5 = zzga.zzh(bArr, iZzf, zzfzVar4);
                                                    if (i6 == zzfzVar4.zza) {
                                                        zzibVar4.zzf(zzga.zzn(bArr, iZzh5));
                                                        iZzf = iZzh5 + 8;
                                                    } else {
                                                        iZzg = iZzf;
                                                    }
                                                }
                                                iZzg = iZzf;
                                            } else {
                                                iZzg = i29;
                                            }
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                                    case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                                        i29 = iZzg;
                                        i9 = i63;
                                        obj2 = obj6;
                                        zzho zzhoVar6 = zzhoVarZzd;
                                        i6 = i44 == true ? 1 : 0;
                                        if (z == 2) {
                                            int i79 = zzga.zza;
                                            zzhl zzhlVar = (zzhl) zzhoVar6;
                                            iZzk2 = zzga.zzh(bArr, i29, zzfzVar4);
                                            int i80 = zzfzVar4.zza;
                                            int i81 = iZzk2 + i80;
                                            if (i81 > bArr.length) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzhlVar.zzh(zzhlVar.size() + (i80 / 4));
                                            while (iZzk2 < i81) {
                                                zzhlVar.zzg(zzga.zzb(bArr, iZzk2));
                                                iZzk2 += 4;
                                            }
                                            if (iZzk2 != i81) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzg = iZzk2;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            if (z == 5) {
                                                iZzf = i29 + 4;
                                                int i82 = zzga.zza;
                                                zzhl zzhlVar2 = (zzhl) zzhoVar6;
                                                zzhlVar2.zzg(zzga.zzb(bArr, i29));
                                                while (iZzf < i2) {
                                                    int iZzh6 = zzga.zzh(bArr, iZzf, zzfzVar4);
                                                    if (i6 == zzfzVar4.zza) {
                                                        zzhlVar2.zzg(zzga.zzb(bArr, iZzh6));
                                                        iZzf = iZzh6 + 4;
                                                    } else {
                                                        iZzg = iZzf;
                                                    }
                                                }
                                                iZzg = iZzf;
                                            } else {
                                                iZzg = i29;
                                            }
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    case 25:
                                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                                        i29 = iZzg;
                                        i9 = i63;
                                        obj2 = obj6;
                                        zzho zzhoVar7 = zzhoVarZzd;
                                        i6 = i44 == true ? 1 : 0;
                                        if (z == 2) {
                                            int i83 = zzga.zza;
                                            zzgb zzgbVar = (zzgb) zzhoVar7;
                                            iZzk2 = zzga.zzh(bArr, i29, zzfzVar4);
                                            int i84 = zzfzVar4.zza + iZzk2;
                                            while (iZzk2 < i84) {
                                                iZzk2 = zzga.zzk(bArr, iZzk2, zzfzVar4);
                                                zzgbVar.zze(zzfzVar4.zzb != 0);
                                            }
                                            if (iZzk2 != i84) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzg = iZzk2;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            if (z == 0) {
                                                int i85 = zzga.zza;
                                                zzgb zzgbVar2 = (zzgb) zzhoVar7;
                                                iZzk3 = zzga.zzk(bArr, i29, zzfzVar4);
                                                zzgbVar2.zze(zzfzVar4.zzb != 0);
                                                while (iZzk3 < i2) {
                                                    int iZzh7 = zzga.zzh(bArr, iZzk3, zzfzVar4);
                                                    if (i6 == zzfzVar4.zza) {
                                                        iZzk3 = zzga.zzk(bArr, iZzh7, zzfzVar4);
                                                        zzgbVar2.zze(zzfzVar4.zzb != 0);
                                                    } else {
                                                        iZzg = iZzk3;
                                                    }
                                                }
                                                iZzg = iZzk3;
                                            } else {
                                                iZzg = i29;
                                            }
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    case 26:
                                        i29 = iZzg;
                                        i9 = i63;
                                        obj2 = obj6;
                                        zzho zzhoVar8 = zzhoVarZzd;
                                        i6 = i44 == true ? 1 : 0;
                                        if (z == 2) {
                                            if ((j2 & 536870912) == 0) {
                                                iZzf = zzga.zzh(bArr, i29, zzfzVar4);
                                                int i86 = zzfzVar4.zza;
                                                if (i86 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i86 == 0) {
                                                    zzhoVar8.add("");
                                                } else {
                                                    zzhoVar8.add(new String(bArr, iZzf, i86, zzhp.zza));
                                                    iZzf += i86;
                                                }
                                                while (iZzf < i2) {
                                                    int iZzh8 = zzga.zzh(bArr, iZzf, zzfzVar4);
                                                    if (i6 == zzfzVar4.zza) {
                                                        iZzf = zzga.zzh(bArr, iZzh8, zzfzVar4);
                                                        int i87 = zzfzVar4.zza;
                                                        if (i87 < 0) {
                                                            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i87 == 0) {
                                                            zzhoVar8.add("");
                                                        } else {
                                                            zzhoVar8.add(new String(bArr, iZzf, i87, zzhp.zza));
                                                            iZzf += i87;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZzf = zzga.zzh(bArr, i29, zzfzVar4);
                                                int i88 = zzfzVar4.zza;
                                                if (i88 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i88 == 0) {
                                                    zzhoVar8.add("");
                                                } else {
                                                    int i89 = iZzf + i88;
                                                    if (!zzjt.zzd(bArr, iZzf, i89)) {
                                                        throw new zzhr("Protocol message had invalid UTF-8.");
                                                    }
                                                    zzhoVar8.add(new String(bArr, iZzf, i88, zzhp.zza));
                                                    iZzf = i89;
                                                }
                                                while (iZzf < i2) {
                                                    int iZzh9 = zzga.zzh(bArr, iZzf, zzfzVar4);
                                                    if (i6 == zzfzVar4.zza) {
                                                        iZzf = zzga.zzh(bArr, iZzh9, zzfzVar4);
                                                        int i90 = zzfzVar4.zza;
                                                        if (i90 < 0) {
                                                            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i90 == 0) {
                                                            zzhoVar8.add("");
                                                        } else {
                                                            int i91 = iZzf + i90;
                                                            if (!zzjt.zzd(bArr, iZzf, i91)) {
                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzhoVar8.add(new String(bArr, iZzf, i90, zzhp.zza));
                                                            iZzf = i91;
                                                        }
                                                    }
                                                }
                                            }
                                            iZzg = iZzf;
                                        } else {
                                            iZzg = i29;
                                        }
                                        if (iZzg != i29) {
                                            zzfzVar4 = zzfzVar4;
                                            bArr6 = bArr;
                                            zzfzVar5 = zzfzVar4;
                                            i38 = i6;
                                            i40 = i9;
                                            i37 = i7;
                                            obj5 = obj2;
                                            i41 = i24;
                                            i36 = 0;
                                            i39 = i5;
                                            unsafe4 = unsafe;
                                        } else {
                                            zzfzVar4 = zzfzVar4;
                                            zzfzVar2 = zzfzVar4;
                                            i41 = i24;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 27:
                                        i30 = i44 == true ? 1 : 0;
                                        i9 = i63;
                                        obj2 = obj6;
                                        if (z == 2) {
                                            i29 = iZzg;
                                            iZzg = zzga.zze(zzv(i7), i30 == true ? 1 : 0, bArr, iZzg, i2, zzhoVarZzd, zzfzVar4);
                                            i6 = i30 == true ? 1 : 0;
                                        } else {
                                            i29 = iZzg;
                                            i6 = i30;
                                            iZzg = i29;
                                        }
                                        if (iZzg != i29) {
                                            zzfzVar4 = zzfzVar4;
                                            bArr6 = bArr;
                                            zzfzVar5 = zzfzVar4;
                                            i38 = i6;
                                            i40 = i9;
                                            i37 = i7;
                                            obj5 = obj2;
                                            i41 = i24;
                                            i36 = 0;
                                            i39 = i5;
                                            unsafe4 = unsafe;
                                        } else {
                                            zzfzVar4 = zzfzVar4;
                                            zzfzVar2 = zzfzVar4;
                                            i41 = i24;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                                        i30 = i44 == true ? 1 : 0;
                                        i31 = iZzg;
                                        i9 = i63;
                                        obj2 = obj6;
                                        if (z == 2) {
                                            int iZzh10 = zzga.zzh(bArr, i31, zzfzVar4);
                                            int i92 = zzfzVar4.zza;
                                            if (i92 < 0) {
                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i92 > bArr.length - iZzh10) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i92 == 0) {
                                                zzhoVarZzd.add(zzgk.zzb);
                                            } else {
                                                zzhoVarZzd.add(zzgk.zzj(bArr, iZzh10, i92));
                                                iZzh10 += i92;
                                            }
                                            while (iZzh10 < i2) {
                                                int iZzh11 = zzga.zzh(bArr, iZzh10, zzfzVar4);
                                                if (i30 == zzfzVar4.zza) {
                                                    iZzh10 = zzga.zzh(bArr, iZzh11, zzfzVar4);
                                                    int i93 = zzfzVar4.zza;
                                                    if (i93 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i93 > bArr.length - iZzh10) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i93 == 0) {
                                                        zzhoVarZzd.add(zzgk.zzb);
                                                    } else {
                                                        zzhoVarZzd.add(zzgk.zzj(bArr, iZzh10, i93));
                                                        iZzh10 += i93;
                                                    }
                                                } else {
                                                    i29 = i31;
                                                    iZzg = iZzh10;
                                                    i6 = i30 == true ? 1 : 0;
                                                }
                                            }
                                            i29 = i31;
                                            iZzg = iZzh10;
                                            i6 = i30 == true ? 1 : 0;
                                        } else {
                                            i29 = i31;
                                            i6 = i30;
                                            iZzg = i29;
                                        }
                                        if (iZzg != i29) {
                                            zzfzVar4 = zzfzVar4;
                                            bArr6 = bArr;
                                            zzfzVar5 = zzfzVar4;
                                            i38 = i6;
                                            i40 = i9;
                                            i37 = i7;
                                            obj5 = obj2;
                                            i41 = i24;
                                            i36 = 0;
                                            i39 = i5;
                                            unsafe4 = unsafe;
                                        } else {
                                            zzfzVar4 = zzfzVar4;
                                            zzfzVar2 = zzfzVar4;
                                            i41 = i24;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 30:
                                    case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                                        if (z == 2) {
                                            iZzf2 = zzga.zzf(bArr, iZzg, zzhoVarZzd, zzfzVar4);
                                            i33 = i44 == true ? 1 : 0;
                                            i32 = iZzg;
                                        } else if (z != 0) {
                                            i30 = i44 == true ? 1 : 0;
                                            i31 = iZzg;
                                            i9 = i63;
                                            obj2 = obj;
                                            i29 = i31;
                                            i6 = i30;
                                            iZzg = i29;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            i32 = iZzg;
                                            int iZzj = zzga.zzj(i44 == true ? 1 : 0, bArr, i32, i2, zzhoVarZzd, zzfzVar4);
                                            i33 = i44 == true ? 1 : 0;
                                            iZzf2 = iZzj;
                                        }
                                        zzhm zzhmVarZzu2 = zzu(i7);
                                        zzjj zzjjVar = this.zzl;
                                        int i94 = zziz.zza;
                                        if (zzhmVarZzu2 == null) {
                                            obj2 = obj;
                                            i34 = iZzf2;
                                            i9 = i63;
                                        } else if (zzhoVarZzd instanceof RandomAccess) {
                                            int size2 = zzhoVarZzd.size();
                                            Object objZzn = null;
                                            int i95 = 0;
                                            int i96 = 0;
                                            while (i96 < size2) {
                                                Integer num = (Integer) zzhoVarZzd.get(i96);
                                                int i97 = iZzf2;
                                                int iIntValue = num.intValue();
                                                if (zzhmVarZzu2.zza(iIntValue)) {
                                                    if (i96 != i95) {
                                                        zzhoVarZzd.set(i95, num);
                                                    }
                                                    i95++;
                                                    i35 = i63;
                                                } else {
                                                    i35 = i63;
                                                    objZzn = zziz.zzn(obj, i35, iIntValue, objZzn, zzjjVar);
                                                }
                                                i63 = i35;
                                                i96++;
                                                iZzf2 = i97;
                                            }
                                            obj2 = obj;
                                            i34 = iZzf2;
                                            i9 = i63;
                                            if (i95 != size2) {
                                                zzhoVarZzd.subList(i95, size2).clear();
                                            }
                                        } else {
                                            obj2 = obj;
                                            i34 = iZzf2;
                                            i9 = i63;
                                            Iterator it = zzhoVarZzd.iterator();
                                            Object objZzn2 = null;
                                            while (it.hasNext()) {
                                                int iIntValue2 = ((Integer) it.next()).intValue();
                                                if (!zzhmVarZzu2.zza(iIntValue2)) {
                                                    objZzn2 = zziz.zzn(obj2, i9, iIntValue2, objZzn2, zzjjVar);
                                                    it.remove();
                                                }
                                            }
                                        }
                                        i29 = i32;
                                        i6 = i33;
                                        iZzg = i34;
                                        if (iZzg != i29) {
                                            zzfzVar4 = zzfzVar4;
                                            bArr6 = bArr;
                                            zzfzVar5 = zzfzVar4;
                                            i38 = i6;
                                            i40 = i9;
                                            i37 = i7;
                                            obj5 = obj2;
                                            i41 = i24;
                                            i36 = 0;
                                            i39 = i5;
                                            unsafe4 = unsafe;
                                        } else {
                                            zzfzVar4 = zzfzVar4;
                                            zzfzVar2 = zzfzVar4;
                                            i41 = i24;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 33:
                                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                        if (z != 2) {
                                            if (z == 0) {
                                                int i98 = zzga.zza;
                                                zzhl zzhlVar3 = (zzhl) zzhoVarZzd;
                                                iZzf = zzga.zzh(bArr, iZzg, zzfzVar4);
                                                zzhlVar3.zzg(zzgn.zzb(zzfzVar4.zza));
                                                while (iZzf < i2) {
                                                    int iZzh12 = zzga.zzh(bArr, iZzf, zzfzVar4);
                                                    if (i44 != zzfzVar4.zza) {
                                                        i6 = i44 == true ? 1 : 0;
                                                        i29 = iZzg;
                                                        i9 = i63;
                                                        obj2 = obj;
                                                        iZzg = iZzf;
                                                        if (iZzg != i29) {
                                                            zzfzVar4 = zzfzVar4;
                                                            bArr6 = bArr;
                                                            zzfzVar5 = zzfzVar4;
                                                            i38 = i6;
                                                            i40 = i9;
                                                            i37 = i7;
                                                            obj5 = obj2;
                                                            i41 = i24;
                                                            i36 = 0;
                                                            i39 = i5;
                                                            unsafe4 = unsafe;
                                                        } else {
                                                            zzfzVar4 = zzfzVar4;
                                                            zzfzVar2 = zzfzVar4;
                                                            i41 = i24;
                                                            bArr2 = bArr;
                                                        }
                                                    } else {
                                                        iZzf = zzga.zzh(bArr, iZzh12, zzfzVar4);
                                                        zzhlVar3.zzg(zzgn.zzb(zzfzVar4.zza));
                                                    }
                                                    break;
                                                }
                                                i6 = i44 == true ? 1 : 0;
                                                i29 = iZzg;
                                                i9 = i63;
                                                obj2 = obj;
                                                iZzg = iZzf;
                                                if (iZzg != i29) {
                                                    zzfzVar4 = zzfzVar4;
                                                    bArr6 = bArr;
                                                    zzfzVar5 = zzfzVar4;
                                                    i38 = i6;
                                                    i40 = i9;
                                                    i37 = i7;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                } else {
                                                    zzfzVar4 = zzfzVar4;
                                                    zzfzVar2 = zzfzVar4;
                                                    i41 = i24;
                                                    bArr2 = bArr;
                                                }
                                            }
                                            i6 = i44 == true ? 1 : 0;
                                            i29 = iZzg;
                                            i9 = i63;
                                            obj2 = obj;
                                            iZzg = i29;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                            break;
                                        } else {
                                            int i99 = zzga.zza;
                                            zzhl zzhlVar4 = (zzhl) zzhoVarZzd;
                                            iZzk3 = zzga.zzh(bArr, iZzg, zzfzVar4);
                                            int i100 = zzfzVar4.zza + iZzk3;
                                            while (iZzk3 < i100) {
                                                iZzk3 = zzga.zzh(bArr, iZzk3, zzfzVar4);
                                                zzhlVar4.zzg(zzgn.zzb(zzfzVar4.zza));
                                            }
                                            if (iZzk3 != i100) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i6 = i44 == true ? 1 : 0;
                                            i29 = iZzg;
                                            i9 = i63;
                                            obj2 = obj;
                                            iZzg = iZzk3;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                                    case 48:
                                        if (z != 2) {
                                            if (z == 0) {
                                                int i101 = zzga.zza;
                                                zzib zzibVar5 = (zzib) zzhoVarZzd;
                                                iZzf = zzga.zzk(bArr, iZzg, zzfzVar4);
                                                zzibVar5.zzf(zzgn.zzc(zzfzVar4.zzb));
                                                while (iZzf < i2) {
                                                    int iZzh13 = zzga.zzh(bArr, iZzf, zzfzVar4);
                                                    if (i44 != zzfzVar4.zza) {
                                                        i6 = i44 == true ? 1 : 0;
                                                        i29 = iZzg;
                                                        i9 = i63;
                                                        obj2 = obj;
                                                        iZzg = iZzf;
                                                        if (iZzg != i29) {
                                                            zzfzVar4 = zzfzVar4;
                                                            bArr6 = bArr;
                                                            zzfzVar5 = zzfzVar4;
                                                            i38 = i6;
                                                            i40 = i9;
                                                            i37 = i7;
                                                            obj5 = obj2;
                                                            i41 = i24;
                                                            i36 = 0;
                                                            i39 = i5;
                                                            unsafe4 = unsafe;
                                                        } else {
                                                            zzfzVar4 = zzfzVar4;
                                                            zzfzVar2 = zzfzVar4;
                                                            i41 = i24;
                                                            bArr2 = bArr;
                                                        }
                                                    } else {
                                                        iZzf = zzga.zzk(bArr, iZzh13, zzfzVar4);
                                                        zzibVar5.zzf(zzgn.zzc(zzfzVar4.zzb));
                                                    }
                                                    break;
                                                }
                                                i6 = i44 == true ? 1 : 0;
                                                i29 = iZzg;
                                                i9 = i63;
                                                obj2 = obj;
                                                iZzg = iZzf;
                                                if (iZzg != i29) {
                                                    zzfzVar4 = zzfzVar4;
                                                    bArr6 = bArr;
                                                    zzfzVar5 = zzfzVar4;
                                                    i38 = i6;
                                                    i40 = i9;
                                                    i37 = i7;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                } else {
                                                    zzfzVar4 = zzfzVar4;
                                                    zzfzVar2 = zzfzVar4;
                                                    i41 = i24;
                                                    bArr2 = bArr;
                                                }
                                            }
                                            i6 = i44 == true ? 1 : 0;
                                            i29 = iZzg;
                                            i9 = i63;
                                            obj2 = obj;
                                            iZzg = i29;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                            break;
                                        } else {
                                            int i102 = zzga.zza;
                                            zzib zzibVar6 = (zzib) zzhoVarZzd;
                                            iZzk3 = zzga.zzh(bArr, iZzg, zzfzVar4);
                                            int i103 = zzfzVar4.zza + iZzk3;
                                            while (iZzk3 < i103) {
                                                iZzk3 = zzga.zzk(bArr, iZzk3, zzfzVar4);
                                                zzibVar6.zzf(zzgn.zzc(zzfzVar4.zzb));
                                            }
                                            if (iZzk3 != i103) {
                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i6 = i44 == true ? 1 : 0;
                                            i29 = iZzg;
                                            i9 = i63;
                                            obj2 = obj;
                                            iZzg = iZzk3;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    default:
                                        zzho zzhoVar9 = zzhoVarZzd;
                                        i6 = i44 == true ? 1 : 0;
                                        i28 = iZzg;
                                        obj2 = obj6;
                                        byte[] bArr17 = bArr;
                                        int i104 = i2;
                                        i9 = i63;
                                        if (z == 3) {
                                            int i105 = ((i6 == true ? 1 : 0) & (-8)) | 4;
                                            zzix zzixVarZzv = zzv(i7);
                                            iZzh = zzga.zzc(zzixVarZzv, bArr17, i28, i104, i105, zzfzVar4);
                                            i29 = i28;
                                            zzhoVar9.add(zzfzVar4.zzc);
                                            while (iZzh < i104) {
                                                int iZzh14 = zzga.zzh(bArr17, iZzh, zzfzVar4);
                                                if (i6 != zzfzVar4.zza) {
                                                    iZzg = iZzh;
                                                    if (iZzg != i29) {
                                                        zzfzVar4 = zzfzVar4;
                                                        bArr6 = bArr;
                                                        zzfzVar5 = zzfzVar4;
                                                        i38 = i6;
                                                        i40 = i9;
                                                        i37 = i7;
                                                        obj5 = obj2;
                                                        i41 = i24;
                                                        i36 = 0;
                                                        i39 = i5;
                                                        unsafe4 = unsafe;
                                                    } else {
                                                        zzfzVar4 = zzfzVar4;
                                                        zzfzVar2 = zzfzVar4;
                                                        i41 = i24;
                                                        bArr2 = bArr;
                                                    }
                                                } else {
                                                    iZzh = zzga.zzc(zzixVarZzv, bArr17, iZzh14, i104, i105, zzfzVar4);
                                                    zzhoVar9.add(zzfzVar4.zzc);
                                                    bArr17 = bArr;
                                                    i104 = i2;
                                                }
                                                break;
                                            }
                                            iZzg = iZzh;
                                            if (iZzg != i29) {
                                                zzfzVar4 = zzfzVar4;
                                                bArr6 = bArr;
                                                zzfzVar5 = zzfzVar4;
                                                i38 = i6;
                                                i40 = i9;
                                                i37 = i7;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                            } else {
                                                zzfzVar4 = zzfzVar4;
                                                zzfzVar2 = zzfzVar4;
                                                i41 = i24;
                                                bArr2 = bArr;
                                            }
                                        }
                                        i29 = i28;
                                        iZzg = i29;
                                        if (iZzg != i29) {
                                            zzfzVar4 = zzfzVar4;
                                            bArr6 = bArr;
                                            zzfzVar5 = zzfzVar4;
                                            i38 = i6;
                                            i40 = i9;
                                            i37 = i7;
                                            obj5 = obj2;
                                            i41 = i24;
                                            i36 = 0;
                                            i39 = i5;
                                            unsafe4 = unsafe;
                                        } else {
                                            zzfzVar4 = zzfzVar4;
                                            zzfzVar2 = zzfzVar4;
                                            i41 = i24;
                                            bArr2 = bArr;
                                        }
                                        break;
                                }
                            } else {
                                i6 = i44 == true ? 1 : 0;
                                i25 = iZzg;
                                i9 = i63;
                                obj2 = obj6;
                                if (iZzr != 50) {
                                    Unsafe unsafe9 = zzb;
                                    long j3 = iArr[i7 + 2] & 1048575;
                                    switch (iZzr) {
                                        case 51:
                                            i25 = i25;
                                            i26 = i7;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr;
                                            if (z == 1) {
                                                iZzk = i25 + 8;
                                                unsafe9.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzga.zzn(bArr2, i25))));
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i25;
                                            }
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case 52:
                                            i25 = i25;
                                            i26 = i7;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr;
                                            if (z == 5) {
                                                iZzk = i25 + 4;
                                                unsafe9.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzga.zzb(bArr2, i25))));
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i25;
                                            }
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i25 = i25;
                                            i26 = i7;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr;
                                            if (z == 0) {
                                                iZzk = zzga.zzk(bArr2, i25, zzfzVar2);
                                                unsafe9.putObject(obj2, j, Long.valueOf(zzfzVar2.zzb));
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i25;
                                            }
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i25 = i25;
                                            i26 = i7;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr;
                                            if (z == 0) {
                                                iZzk = zzga.zzh(bArr2, i25, zzfzVar2);
                                                unsafe9.putObject(obj2, j, Integer.valueOf(zzfzVar2.zza));
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i25;
                                            }
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i25 = i25;
                                            i26 = i7;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr;
                                            if (z == 1) {
                                                iZzk = i25 + 8;
                                                unsafe9.putObject(obj2, j, Long.valueOf(zzga.zzn(bArr2, i25)));
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i25;
                                            }
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i25 = i25;
                                            i26 = i7;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr;
                                            if (z == 5) {
                                                iZzk = i25 + 4;
                                                unsafe9.putObject(obj2, j, Integer.valueOf(zzga.zzb(bArr2, i25)));
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i25;
                                            }
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case 58:
                                            i25 = i25;
                                            i26 = i7;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr;
                                            if (z == 0) {
                                                iZzk = zzga.zzk(bArr2, i25, zzfzVar2);
                                                unsafe9.putObject(obj2, j, Boolean.valueOf(zzfzVar2.zzb != 0));
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i25;
                                            }
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case 59:
                                            i25 = i25;
                                            i26 = i7;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr;
                                            if (z == 2) {
                                                iZzk = zzga.zzh(bArr2, i25, zzfzVar2);
                                                int i106 = zzfzVar2.zza;
                                                if (i106 == 0) {
                                                    unsafe9.putObject(obj2, j, "");
                                                } else {
                                                    int i107 = iZzk + i106;
                                                    if ((i47 & 536870912) != 0 && !zzjt.zzd(bArr2, iZzk, i107)) {
                                                        throw new zzhr("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe9.putObject(obj2, j, new String(bArr2, iZzk, i106, zzhp.zza));
                                                    iZzk = i107;
                                                }
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i25;
                                            }
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                            if (z == 2) {
                                                Object objZzy = zzy(obj2, i9, i7);
                                                int iZzm2 = zzga.zzm(objZzy, zzv(i7), bArr, i25, i2, zzfzVar4);
                                                zzfzVar2 = zzfzVar4;
                                                bArr2 = bArr;
                                                zzG(obj2, i9, i7, objZzy);
                                                i26 = i7;
                                                i25 = i25;
                                                iZzg = iZzm2;
                                            } else {
                                                zzfzVar2 = zzfzVar4;
                                                bArr2 = bArr;
                                                i26 = i7;
                                                i25 = i25;
                                                iZzg = i25;
                                            }
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                            bArr5 = bArr;
                                            i27 = i7;
                                            if (z == 2) {
                                                iZza = zzga.zza(bArr5, i25, zzfzVar4);
                                                unsafe9.putObject(obj2, j, zzfzVar4.zzc);
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZza;
                                                i26 = i27;
                                                zzfzVar2 = zzfzVar4;
                                                bArr2 = bArr5;
                                                if (iZzg != i25) {
                                                    bArr6 = bArr2;
                                                    i38 = i6 == true ? 1 : 0;
                                                    zzfzVar5 = zzfzVar2;
                                                    i40 = i9;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                    i37 = i26;
                                                } else {
                                                    i3 = i3;
                                                    i41 = i24;
                                                    i7 = i26;
                                                }
                                            }
                                            i26 = i27;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr5;
                                            iZzg = i25;
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                            bArr5 = bArr;
                                            i27 = i7;
                                            if (z == 0) {
                                                iZza = zzga.zzh(bArr5, i25, zzfzVar4);
                                                int i108 = zzfzVar4.zza;
                                                zzhm zzhmVarZzu3 = zzu(i27);
                                                if (zzhmVarZzu3 == null || zzhmVarZzu3.zza(i108)) {
                                                    unsafe9.putObject(obj2, j, Integer.valueOf(i108));
                                                    unsafe9.putInt(obj2, j3, i9);
                                                } else {
                                                    zzd(obj2).zzj(i6 == true ? 1 : 0, Long.valueOf(i108));
                                                }
                                                iZzg = iZza;
                                                i26 = i27;
                                                zzfzVar2 = zzfzVar4;
                                                bArr2 = bArr5;
                                                if (iZzg != i25) {
                                                    bArr6 = bArr2;
                                                    i38 = i6 == true ? 1 : 0;
                                                    zzfzVar5 = zzfzVar2;
                                                    i40 = i9;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                    i37 = i26;
                                                } else {
                                                    i3 = i3;
                                                    i41 = i24;
                                                    i7 = i26;
                                                }
                                            }
                                            i26 = i27;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr5;
                                            iZzg = i25;
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case 66:
                                            bArr5 = bArr;
                                            i27 = i7;
                                            if (z == 0) {
                                                iZza = zzga.zzh(bArr5, i25, zzfzVar4);
                                                unsafe9.putObject(obj2, j, Integer.valueOf(zzgn.zzb(zzfzVar4.zza)));
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZza;
                                                i26 = i27;
                                                zzfzVar2 = zzfzVar4;
                                                bArr2 = bArr5;
                                                if (iZzg != i25) {
                                                    bArr6 = bArr2;
                                                    i38 = i6 == true ? 1 : 0;
                                                    zzfzVar5 = zzfzVar2;
                                                    i40 = i9;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                    i37 = i26;
                                                } else {
                                                    i3 = i3;
                                                    i41 = i24;
                                                    i7 = i26;
                                                }
                                            }
                                            i26 = i27;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr5;
                                            iZzg = i25;
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                        case 67:
                                            bArr5 = bArr;
                                            if (z == 0) {
                                                iZza = zzga.zzk(bArr5, i25, zzfzVar4);
                                                i27 = i7;
                                                unsafe9.putObject(obj2, j, Long.valueOf(zzgn.zzc(zzfzVar4.zzb)));
                                                unsafe9.putInt(obj2, j3, i9);
                                                iZzg = iZza;
                                                i26 = i27;
                                                zzfzVar2 = zzfzVar4;
                                                bArr2 = bArr5;
                                                if (iZzg != i25) {
                                                    bArr6 = bArr2;
                                                    i38 = i6 == true ? 1 : 0;
                                                    zzfzVar5 = zzfzVar2;
                                                    i40 = i9;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                    i37 = i26;
                                                } else {
                                                    i3 = i3;
                                                    i41 = i24;
                                                    i7 = i26;
                                                }
                                            } else {
                                                i26 = i7;
                                                zzfzVar2 = zzfzVar4;
                                                bArr2 = bArr5;
                                                iZzg = i25;
                                                if (iZzg != i25) {
                                                    bArr6 = bArr2;
                                                    i38 = i6 == true ? 1 : 0;
                                                    zzfzVar5 = zzfzVar2;
                                                    i40 = i9;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                    i37 = i26;
                                                } else {
                                                    i3 = i3;
                                                    i41 = i24;
                                                    i7 = i26;
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (z == 3) {
                                                int i109 = ((i6 == true ? 1 : 0) & (-8)) | 4;
                                                Object objZzy2 = zzy(obj2, i9, i7);
                                                int iZzl2 = zzga.zzl(objZzy2, zzv(i7), bArr, i25, i2, i109, zzfzVar);
                                                zzfzVar4 = zzfzVar;
                                                bArr5 = bArr;
                                                zzG(obj2, i9, i7, objZzy2);
                                                iZzg = iZzl2;
                                                i26 = i7;
                                                zzfzVar2 = zzfzVar4;
                                                bArr2 = bArr5;
                                                if (iZzg != i25) {
                                                    bArr6 = bArr2;
                                                    i38 = i6 == true ? 1 : 0;
                                                    zzfzVar5 = zzfzVar2;
                                                    i40 = i9;
                                                    obj5 = obj2;
                                                    i41 = i24;
                                                    i36 = 0;
                                                    i39 = i5;
                                                    unsafe4 = unsafe;
                                                    i37 = i26;
                                                } else {
                                                    i3 = i3;
                                                    i41 = i24;
                                                    i7 = i26;
                                                }
                                                break;
                                            }
                                        default:
                                            i25 = i25;
                                            i26 = i7;
                                            zzfzVar2 = zzfzVar4;
                                            bArr2 = bArr;
                                            iZzg = i25;
                                            if (iZzg != i25) {
                                                bArr6 = bArr2;
                                                i38 = i6 == true ? 1 : 0;
                                                zzfzVar5 = zzfzVar2;
                                                i40 = i9;
                                                obj5 = obj2;
                                                i41 = i24;
                                                i36 = 0;
                                                i39 = i5;
                                                unsafe4 = unsafe;
                                                i37 = i26;
                                            } else {
                                                i3 = i3;
                                                i41 = i24;
                                                i7 = i26;
                                            }
                                            break;
                                    }
                                } else if (z == 2) {
                                    Unsafe unsafe10 = zzb;
                                    Object objZzw = zzw(i7);
                                    Object object = unsafe10.getObject(obj2, j);
                                    if (!((zzig) object).zze()) {
                                        zzig zzigVarZzb = zzig.zza().zzb();
                                        zzih.zza(zzigVarZzb, object);
                                        unsafe10.putObject(obj2, j, zzigVarZzb);
                                    }
                                    throw null;
                                }
                            }
                            i2 = i2;
                        } else if (z == 2) {
                            zzho zzhoVarZzd2 = (zzho) unsafe7.getObject(obj6, j);
                            if (!zzhoVarZzd2.zzc()) {
                                int size3 = zzhoVarZzd2.size();
                                zzhoVarZzd2 = zzhoVarZzd2.zzd(size3 == 0 ? 10 : size3 + size3);
                                unsafe7.putObject(obj6, j, zzhoVarZzd2);
                            }
                            int iZze = zzga.zze(zzv(i7), i44 == true ? 1 : 0, bArr, iZzg, i2, zzhoVarZzd2, zzfzVar);
                            bArr6 = bArr;
                            i2 = i2;
                            i38 = i44 == true ? 1 : 0;
                            obj5 = obj6;
                            i37 = i7;
                            i36 = 0;
                            i40 = i63;
                            zzfzVar5 = zzfzVar;
                            iZzg = iZze;
                            unsafe4 = unsafe7;
                        } else {
                            zzfzVar4 = zzfzVar;
                            i6 = i44 == true ? 1 : 0;
                            unsafe = unsafe7;
                            i5 = i39;
                            i25 = iZzg;
                            i9 = i63;
                            obj2 = obj6;
                            i24 = i41;
                        }
                        iZzg = i25;
                        i41 = i24;
                        zzfzVar2 = zzfzVar4;
                        bArr2 = bArr;
                    }
                }
                if (i6 != i3 || i3 == 0) {
                    if (this.zzh) {
                        zzgw zzgwVar = zzfzVar2.zzd;
                        int i110 = zzgw.zzb;
                        int i111 = zziu.zza;
                        if (zzgwVar != zzgw.zza) {
                            zzim zzimVar = this.zzg;
                            zzgw zzgwVar2 = zzfzVar2.zzd;
                            int i112 = zzga.zza;
                            if (zzgwVar2.zzb(zzimVar, i9) != null) {
                                throw null;
                            }
                            i11 = i2;
                            i10 = i6;
                            iZzg = zzga.zzg(i10 == true ? 1 : 0, bArr2, iZzg, i11, zzd(obj2), zzfzVar2);
                        } else {
                            i10 = i6;
                            i11 = i2;
                            iZzg = zzga.zzg(i10 == true ? 1 : 0, bArr, iZzg, i11, zzd(obj2), zzfzVar);
                        }
                    } else {
                        i10 = i6;
                        i11 = i2;
                        iZzg = zzga.zzg(i10 == true ? 1 : 0, bArr, iZzg, i11, zzd(obj2), zzfzVar);
                    }
                    bArr6 = bArr;
                    zzfzVar5 = zzfzVar;
                    i38 = i10;
                    i2 = i11;
                    i40 = i9;
                    i37 = i7;
                    obj5 = obj2;
                    i36 = i8;
                    i39 = i5;
                    unsafe4 = unsafe;
                } else {
                    i4 = i2;
                    i38 = i6;
                }
            } else {
                i3 = i3;
                unsafe = unsafe4;
                i4 = i2;
                i5 = i39;
                obj2 = obj5;
            }
        }
        int i113 = i5;
        if (i41 != 1048575) {
            unsafe.putInt(obj2, i41, i113);
        }
        for (int i114 = this.zzj; i114 < this.zzk; i114++) {
            int[] iArr2 = this.zzi;
            int[] iArr3 = this.zzc;
            int i115 = iArr2[i114];
            int i116 = iArr3[i115];
            Object objZzf = zzjq.zzf(obj2, zzs(i115) & 1048575);
            if (objZzf != null && zzu(i115) != null) {
                throw null;
            }
        }
        if (i3 == 0) {
            if (iZzg != i4) {
                throw new zzhr("Failed to parse the message.");
            }
        } else if (iZzg > i4 || i38 != i3) {
            throw new zzhr("Failed to parse the message.");
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final Object zze() {
        return ((zzhk) this.zzg).zzp();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzhk) {
                zzhk zzhkVar = (zzhk) obj;
                zzhkVar.zzy(Integer.MAX_VALUE);
                zzhkVar.zza = 0;
                zzhkVar.zzw();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzs = zzs(i);
                int i2 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j = i2;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
                            case 17:
                                if (zzI(obj, i)) {
                                    zzv(i).zzf(zzb.getObject(obj, j));
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
                            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
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
                                ((zzho) zzjq.zzf(obj, j)).zzb();
                                break;
                            case AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzig) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            int i2 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzjq.zzo(obj, j, zzjq.zza(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i)) {
                        zzjq.zzp(obj, j, zzjq.zzb(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i)) {
                        zzjq.zzm(obj, j, zzjq.zzw(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
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
                case 26:
                case 27:
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
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
                    zzho zzhoVarZzd = (zzho) zzjq.zzf(obj, j);
                    zzho zzhoVar = (zzho) zzjq.zzf(obj2, j);
                    int size = zzhoVarZzd.size();
                    int size2 = zzhoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhoVarZzd.zzc()) {
                            zzhoVarZzd = zzhoVarZzd.zzd(size2 + size);
                        }
                        zzhoVarZzd.addAll(zzhoVar);
                    }
                    if (size > 0) {
                        zzhoVar = zzhoVarZzd;
                    }
                    zzjq.zzs(obj, j, zzhoVar);
                    break;
                case AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES /* 50 */:
                    int i4 = zziz.zza;
                    zzjq.zzs(obj, j, zzih.zza(zzjq.zzf(obj, j), zzjq.zzf(obj2, j)));
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
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzE(obj, i3, i);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzC(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzE(obj, i3, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zziz.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zziz.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzfz zzfzVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzfzVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzi(Object obj, zzjw zzjwVar) throws IOException {
        Map.Entry entry;
        int i;
        zzip<T> zzipVar = this;
        if (zzipVar.zzh) {
            zzhb zzhbVar = ((zzhh) obj).zzb;
            if (zzhbVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzhbVar.zze().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zzipVar.zzc;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            int iZzs = zzipVar.zzs(i4);
            int[] iArr2 = zzipVar.zzc;
            int iZzr = zzr(iZzs);
            int i6 = iArr2[i4];
            if (iZzr <= 17) {
                int i7 = iArr2[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iZzs & i2;
            switch (iZzr) {
                case 0:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzf(i6, zzjq.zza(obj, j));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 1:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzo(i6, zzjq.zzb(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 2:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzt(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 3:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzK(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 4:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzr(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 5:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzm(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 6:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzk(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 7:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzb(i6, zzjq.zzw(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 8:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzO(i6, unsafe.getObject(obj, j), zzjwVar);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 9:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzv(i6, unsafe.getObject(obj, j), zzipVar.zzv(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 10:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzd(i6, (zzgk) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 11:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzI(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 12:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzi(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 13:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzx(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 14:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzz(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 15:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzB(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 16:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzD(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 17:
                    if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
                        zzjwVar.zzq(i6, unsafe.getObject(obj, j), zzipVar.zzv(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 18:
                    zziz.zzr(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 19:
                    zziz.zzv(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 20:
                    zziz.zzx(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 21:
                    zziz.zzD(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 22:
                    zziz.zzw(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 23:
                    zziz.zzu(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 24:
                    zziz.zzt(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 25:
                    zziz.zzq(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 26:
                    int i9 = zzipVar.zzc[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    int i10 = zziz.zza;
                    if (list != null && !list.isEmpty()) {
                        zzjwVar.zzH(i9, list);
                    }
                    break;
                case 27:
                    int i11 = zzipVar.zzc[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzix zzixVarZzv = zzipVar.zzv(i4);
                    int i12 = zziz.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ((zzgs) zzjwVar).zzv(i11, list2.get(i13), zzixVarZzv);
                        }
                    }
                    break;
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    int i14 = zzipVar.zzc[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zziz.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzjwVar.zze(i14, list3);
                    }
                    break;
                case 29:
                    zziz.zzC(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 30:
                    zziz.zzs(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 31:
                    zziz.zzy(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 32:
                    zziz.zzz(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case 33:
                    zziz.zzA(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    zziz.zzB(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    zziz.zzr(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    zziz.zzv(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    zziz.zzx(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    zziz.zzD(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    zziz.zzw(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    zziz.zzu(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    zziz.zzt(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    zziz.zzq(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    zziz.zzC(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    zziz.zzs(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    zziz.zzy(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    zziz.zzz(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    zziz.zzA(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 48:
                    zziz.zzB(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 49:
                    int i16 = zzipVar.zzc[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzix zzixVarZzv2 = zzipVar.zzv(i4);
                    int i17 = zziz.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            ((zzgs) zzjwVar).zzq(i16, list4.get(i18), zzixVarZzv2);
                        }
                    }
                    break;
                case AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzf(i6, zzm(obj, j));
                    }
                    break;
                case 52:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzo(i6, zzn(obj, j));
                    }
                    break;
                case 53:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzt(i6, zzt(obj, j));
                    }
                    break;
                case 54:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzK(i6, zzt(obj, j));
                    }
                    break;
                case 55:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzr(i6, zzo(obj, j));
                    }
                    break;
                case 56:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzm(i6, zzt(obj, j));
                    }
                    break;
                case 57:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzk(i6, zzo(obj, j));
                    }
                    break;
                case 58:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzb(i6, zzN(obj, j));
                    }
                    break;
                case 59:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzO(i6, unsafe.getObject(obj, j), zzjwVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzv(i6, unsafe.getObject(obj, j), zzipVar.zzv(i4));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzd(i6, (zzgk) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzI(i6, zzo(obj, j));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzi(i6, zzo(obj, j));
                    }
                    break;
                case 64:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzx(i6, zzo(obj, j));
                    }
                    break;
                case 65:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzz(i6, zzt(obj, j));
                    }
                    break;
                case 66:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzB(i6, zzo(obj, j));
                    }
                    break;
                case 67:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzD(i6, zzt(obj, j));
                    }
                    break;
                case 68:
                    if (zzipVar.zzM(obj, i6, i4)) {
                        zzjwVar.zzq(i6, unsafe.getObject(obj, j), zzipVar.zzv(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            zzipVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzhk) obj).zzc.zzl(zzjwVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzjq.zza(obj, j)) != Double.doubleToLongBits(zzjq.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzjq.zzb(obj, j)) != Float.floatToIntBits(zzjq.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzjq.zzd(obj, j) != zzjq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzjq.zzd(obj, j) != zzjq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzjq.zzd(obj, j) != zzjq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzjq.zzw(obj, j) != zzjq.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzjq.zzd(obj, j) != zzjq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzjq.zzd(obj, j) != zzjq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
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
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
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
                    zZzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
                    break;
                case AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES /* 50 */:
                    zZzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
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
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzp = zzp(i) & 1048575;
                    if (zzjq.zzc(obj, jZzp) != zzjq.zzc(obj2, jZzp) || !zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzix zzixVarZzv;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr2[i7];
            int iZzs = zzs(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i6;
                i2 = i5;
            }
            Object obj2 = obj;
            if ((268435456 & iZzs) != 0 && !zzJ(obj2, i7, i, i2, i11)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj2, i7, i, i2, i11) && !zzK(obj2, iZzs, zzv(i7))) {
                    return false;
                }
            } else if (iZzr == 27) {
                list = (List) zzjq.zzf(obj2, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzixVarZzv = zzv(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzixVarZzv.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj2, i8, i7) && !zzK(obj2, iZzs, zzv(i7))) {
                    return false;
                }
            } else if (iZzr == 49) {
                list = (List) zzjq.zzf(obj2, iZzs & 1048575);
                if (list.isEmpty()) {
                    zzixVarZzv = zzv(i7);
                    while (i3 < list.size()) {
                        if (!zzixVarZzv.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzr == 50 && !((zzig) zzjq.zzf(obj2, iZzs & 1048575)).isEmpty()) {
                throw null;
            }
            i4++;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.zzh || ((zzhh) obj).zzb.zzh();
    }
}
