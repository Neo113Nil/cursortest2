package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.work.WorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzaiw {
    private static final byte[] zza;

    static {
        int i = zzfy.zza;
        zza = "OpusHead".getBytes(zzfwq.zzc);
    }

    public static zzby zza(zzaim zzaimVar) {
        zzgc zzgcVar;
        zzain zzb = zzaimVar.zzb(1751411826);
        zzain zzb2 = zzaimVar.zzb(1801812339);
        zzain zzb3 = zzaimVar.zzb(1768715124);
        if (zzb != null && zzb2 != null && zzb3 != null && zzg(zzb.zza) == 1835299937) {
            zzfp zzfpVar = zzb2.zza;
            zzfpVar.zzK(12);
            int zzg = zzfpVar.zzg();
            String[] strArr = new String[zzg];
            for (int i = 0; i < zzg; i++) {
                int zzg2 = zzfpVar.zzg();
                zzfpVar.zzL(4);
                strArr[i] = zzfpVar.zzA(zzg2 - 8, zzfwq.zzc);
            }
            zzfp zzfpVar2 = zzb3.zza;
            zzfpVar2.zzK(8);
            ArrayList arrayList = new ArrayList();
            while (zzfpVar2.zzb() > 8) {
                int zzd = zzfpVar2.zzd() + zzfpVar2.zzg();
                int zzg3 = zzfpVar2.zzg() - 1;
                if (zzg3 < 0 || zzg3 >= zzg) {
                    zzff.zzf("AtomParsers", "Skipped metadata with unknown key index: " + zzg3);
                } else {
                    String str = strArr[zzg3];
                    int i2 = zzajd.zzb;
                    while (true) {
                        int zzd2 = zzfpVar2.zzd();
                        if (zzd2 >= zzd) {
                            zzgcVar = null;
                            break;
                        }
                        int zzg4 = zzfpVar2.zzg();
                        if (zzfpVar2.zzg() == 1684108385) {
                            int zzg5 = zzfpVar2.zzg();
                            int zzg6 = zzfpVar2.zzg();
                            int i3 = zzg4 - 16;
                            byte[] bArr = new byte[i3];
                            zzfpVar2.zzG(bArr, 0, i3);
                            zzgcVar = new zzgc(str, bArr, zzg6, zzg5);
                            break;
                        }
                        zzfpVar2.zzK(zzd2 + zzg4);
                    }
                    if (zzgcVar != null) {
                        arrayList.add(zzgcVar);
                    }
                }
                zzfpVar2.zzK(zzd);
            }
            if (!arrayList.isEmpty()) {
                return new zzby(arrayList);
            }
        }
        return null;
    }

    public static zzby zzb(zzain zzainVar) {
        int zzn;
        zzfp zzfpVar = zzainVar.zza;
        zzfpVar.zzK(8);
        zzby zzbyVar = new zzby(-9223372036854775807L, new zzbx[0]);
        while (zzfpVar.zzb() >= 8) {
            int zzd = zzfpVar.zzd();
            int zzg = zzfpVar.zzg() + zzd;
            int zzg2 = zzfpVar.zzg();
            zzby zzbyVar2 = null;
            if (zzg2 == 1835365473) {
                zzfpVar.zzK(zzd);
                zzfpVar.zzL(8);
                zze(zzfpVar);
                while (true) {
                    if (zzfpVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzfpVar.zzd();
                    int zzg3 = zzfpVar.zzg() + zzd2;
                    if (zzfpVar.zzg() == 1768715124) {
                        zzfpVar.zzK(zzd2);
                        zzfpVar.zzL(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzfpVar.zzd() < zzg3) {
                            zzbx zza2 = zzajd.zza(zzfpVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbyVar2 = new zzby(arrayList);
                        }
                    } else {
                        zzfpVar.zzK(zzg3);
                    }
                }
                zzbyVar = zzbyVar.zzd(zzbyVar2);
            } else if (zzg2 == 1936553057) {
                zzfpVar.zzK(zzd);
                zzfpVar.zzL(12);
                while (true) {
                    if (zzfpVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzfpVar.zzd();
                    int zzg4 = zzfpVar.zzg();
                    if (zzfpVar.zzg() != 1935766900) {
                        zzfpVar.zzK(zzd3 + zzg4);
                    } else if (zzg4 >= 16) {
                        zzfpVar.zzL(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int zzm = zzfpVar.zzm();
                            int zzm2 = zzfpVar.zzm();
                            if (zzm == 0) {
                                i = zzm2;
                            } else if (zzm == 1) {
                                i2 = zzm2;
                            }
                        }
                        if (i == 12) {
                            zzn = 240;
                        } else if (i == 13) {
                            zzn = 120;
                        } else {
                            if (i == 21 && zzfpVar.zzb() >= 8 && zzfpVar.zzd() + 8 <= zzg) {
                                int zzg5 = zzfpVar.zzg();
                                int zzg6 = zzfpVar.zzg();
                                if (zzg5 >= 12 && zzg6 == 1936877170) {
                                    zzn = zzfpVar.zzn();
                                }
                            }
                            zzn = -2147483647;
                        }
                        if (zzn != -2147483647) {
                            zzbyVar2 = new zzby(-9223372036854775807L, new zzahm(zzn, i2));
                        }
                    }
                }
                zzbyVar = zzbyVar.zzd(zzbyVar2);
            } else if (zzg2 == -1451722374) {
                zzbyVar = zzbyVar.zzd(zzi(zzfpVar));
            }
            zzfpVar.zzK(zzg);
        }
        return zzbyVar;
    }

    public static zzgi zzc(zzfp zzfpVar) {
        long zzt;
        long zzt2;
        zzfpVar.zzK(8);
        if (zzaio.zze(zzfpVar.zzg()) == 0) {
            zzt = zzfpVar.zzu();
            zzt2 = zzfpVar.zzu();
        } else {
            zzt = zzfpVar.zzt();
            zzt2 = zzfpVar.zzt();
        }
        return new zzgi(zzt, zzt2, zzfpVar.zzu());
    }

    /* JADX WARN: Code restructure failed: missing block: B:333:0x0736, code lost:
    
        if (r15 == 1) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0712, code lost:
    
        if (r8.zzd(1) > 0) goto L352;
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0b67 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzd(zzaim zzaimVar, zzadk zzadkVar, long j, zzae zzaeVar, boolean z, boolean z2, zzfws zzfwsVar) throws zzcc {
        long j2;
        int i;
        long j3;
        zzain zzb;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        zzaim zzaimVar2;
        long[] jArr;
        long[] jArr2;
        zzajm zzajmVar;
        int i5;
        zzfws zzfwsVar2;
        Pair create;
        String str;
        int i6;
        Pair pair;
        long j4;
        int i7;
        zzae zzaeVar2;
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        float f;
        String str3;
        byte[] bArr;
        int i12;
        int i13;
        int i14;
        int i15;
        zzais zzaisVar;
        long j5;
        long j6;
        int i16;
        int i17;
        int i18;
        boolean z3;
        int i19;
        int i20;
        int i21;
        float f2;
        String str4;
        zzais zzaisVar2;
        boolean z4;
        byte[] bArr2;
        int i22;
        int zzd;
        int i23;
        boolean z5;
        zzt zzg;
        int i24;
        int zzd2;
        int i25;
        List list;
        float f3;
        boolean z6;
        String str5;
        int i26;
        int i27;
        int i28;
        int i29;
        String str6;
        boolean z7;
        String str7;
        String str8;
        zzgaa zzm;
        long j7;
        long j8;
        ArrayList arrayList2;
        zzaim zzaimVar3 = zzaimVar;
        zzae zzaeVar3 = zzaeVar;
        ArrayList arrayList3 = new ArrayList();
        int i30 = 0;
        while (i30 < zzaimVar3.zzc.size()) {
            zzaim zzaimVar4 = (zzaim) zzaimVar3.zzc.get(i30);
            if (zzaimVar4.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i4 = i30;
            } else {
                zzain zzb2 = zzaimVar3.zzb(1836476516);
                zzb2.getClass();
                zzaim zza2 = zzaimVar4.zza(1835297121);
                zza2.getClass();
                zzain zzb3 = zza2.zzb(1751411826);
                zzb3.getClass();
                int zzg2 = zzg(zzb3.zza);
                int i31 = zzg2 == 1936684398 ? 1 : zzg2 == 1986618469 ? 2 : (zzg2 == 1952807028 || zzg2 == 1935832172 || zzg2 == 1937072756 || zzg2 == 1668047728) ? 3 : zzg2 == 1835365473 ? 5 : -1;
                if (i31 == -1) {
                    zzfwsVar2 = zzfwsVar;
                    arrayList = arrayList3;
                    i4 = i30;
                    zzaimVar2 = zzaimVar4;
                    zzajmVar = null;
                } else {
                    zzain zzb4 = zzaimVar4.zzb(1953196132);
                    zzb4.getClass();
                    zzfp zzfpVar = zzb4.zza;
                    zzfpVar.zzK(8);
                    int zze = zzaio.zze(zzfpVar.zzg());
                    zzfpVar.zzL(zze == 0 ? 8 : 16);
                    int zzg3 = zzfpVar.zzg();
                    zzfpVar.zzL(4);
                    int zzd3 = zzfpVar.zzd();
                    int i32 = 0;
                    while (true) {
                        int i33 = zze == 0 ? 4 : 8;
                        if (i32 >= i33) {
                            zzfpVar.zzL(i33);
                            break;
                        }
                        if (zzfpVar.zzM()[zzd3 + i32] != -1) {
                            long zzu = zze == 0 ? zzfpVar.zzu() : zzfpVar.zzv();
                            if (zzu != 0) {
                                j2 = zzu;
                            }
                        } else {
                            i32++;
                        }
                    }
                    j2 = -9223372036854775807L;
                    zzfpVar.zzL(16);
                    int zzg4 = zzfpVar.zzg();
                    int zzg5 = zzfpVar.zzg();
                    zzfpVar.zzL(4);
                    int zzg6 = zzfpVar.zzg();
                    int zzg7 = zzfpVar.zzg();
                    int i34 = 65536;
                    if (zzg4 == 0) {
                        if (zzg5 == 65536) {
                            if (zzg6 == -65536) {
                                if (zzg7 == 0) {
                                    i = 90;
                                    zzaiv zzaivVar = new zzaiv(zzg3, j2, i);
                                    if (j == -9223372036854775807L) {
                                        j8 = zzaivVar.zzb;
                                        j3 = j8;
                                    } else {
                                        j3 = j;
                                    }
                                    long j9 = zzc(zzb2.zza).zzc;
                                    long zzs = j3 != -9223372036854775807L ? zzfy.zzs(j3, 1000000L, j9, RoundingMode.FLOOR) : -9223372036854775807L;
                                    zzaim zza3 = zza2.zza(1835626086);
                                    zza3.getClass();
                                    zzaim zza4 = zza3.zza(1937007212);
                                    zza4.getClass();
                                    zzain zzb5 = zza2.zzb(1835296868);
                                    zzb5.getClass();
                                    zzfp zzfpVar2 = zzb5.zza;
                                    zzfpVar2.zzK(8);
                                    int zze2 = zzaio.zze(zzfpVar2.zzg());
                                    zzfpVar2.zzL(zze2 == 0 ? 8 : 16);
                                    int i35 = zze2 == 0 ? 4 : 8;
                                    long zzu2 = zzfpVar2.zzu();
                                    zzfpVar2.zzL(i35);
                                    int zzq = zzfpVar2.zzq();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append((char) (((zzq >> 10) & 31) + 96));
                                    sb.append((char) (((zzq >> 5) & 31) + 96));
                                    sb.append((char) ((zzq & 31) + 96));
                                    Pair create2 = Pair.create(Long.valueOf(zzu2), sb.toString());
                                    zzb = zza4.zzb(1937011556);
                                    if (zzb == null) {
                                        throw zzcc.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                                    }
                                    i2 = zzaivVar.zza;
                                    i3 = zzaivVar.zzc;
                                    String str9 = (String) create2.second;
                                    zzfp zzfpVar3 = zzb.zza;
                                    zzfpVar3.zzK(12);
                                    int zzg8 = zzfpVar3.zzg();
                                    i4 = i30;
                                    zzais zzaisVar3 = new zzais(zzg8);
                                    arrayList = arrayList3;
                                    int i36 = 0;
                                    while (i36 < zzg8) {
                                        zzaiv zzaivVar2 = zzaivVar;
                                        int zzd4 = zzfpVar3.zzd();
                                        zzaim zzaimVar5 = zzaimVar4;
                                        int zzg9 = zzfpVar3.zzg();
                                        zzacy.zzb(zzg9 > 0, "childAtomSize must be positive");
                                        int zzg10 = zzfpVar3.zzg();
                                        int i37 = zzg8;
                                        if (zzg10 == 1635148593 || zzg10 == 1635148595 || zzg10 == 1701733238 || zzg10 == 1831958048 || zzg10 == 1836070006 || zzg10 == 1752589105 || zzg10 == 1751479857 || zzg10 == 1932670515 || zzg10 == 1211250227 || zzg10 == 1987063864 || zzg10 == 1987063865 || zzg10 == 1635135537 || zzg10 == 1685479798 || zzg10 == 1685479729 || zzg10 == 1685481573 || zzg10 == 1685481521) {
                                            str = str9;
                                            int i38 = i3;
                                            i6 = i31;
                                            int i39 = i2;
                                            pair = create2;
                                            j4 = j9;
                                            i7 = i37;
                                            zzfpVar3.zzK(zzd4 + 16);
                                            zzfpVar3.zzL(16);
                                            int zzq2 = zzfpVar3.zzq();
                                            int zzq3 = zzfpVar3.zzq();
                                            zzfpVar3.zzL(50);
                                            int zzd5 = zzfpVar3.zzd();
                                            if (zzg10 == 1701733238) {
                                                Pair zzh = zzh(zzfpVar3, zzd4, zzg9);
                                                if (zzh != null) {
                                                    int intValue = ((Integer) zzh.first).intValue();
                                                    zzaeVar2 = zzaeVar3 == null ? null : zzaeVar3.zzb(((zzajn) zzh.second).zzb);
                                                    zzaisVar3.zza[i36] = (zzajn) zzh.second;
                                                    zzg10 = intValue;
                                                } else {
                                                    zzg10 = 1701733238;
                                                    zzaeVar2 = zzaeVar3;
                                                }
                                                zzfpVar3.zzK(zzd5);
                                            } else {
                                                zzaeVar2 = zzaeVar3;
                                            }
                                            if (zzg10 == 1831958048) {
                                                int i40 = zzg10;
                                                str2 = "video/mpeg";
                                                i8 = i40;
                                            } else {
                                                i8 = 1211250227;
                                                if (zzg10 == 1211250227) {
                                                    str2 = "video/3gpp";
                                                } else {
                                                    i8 = zzg10;
                                                    str2 = null;
                                                }
                                            }
                                            int i41 = zzd5;
                                            zzae zzaeVar4 = zzaeVar2;
                                            float f4 = 1.0f;
                                            i9 = i36;
                                            boolean z8 = false;
                                            ByteBuffer byteBuffer = null;
                                            String str10 = null;
                                            byte[] bArr3 = null;
                                            int i42 = -1;
                                            int i43 = -1;
                                            zzaiq zzaiqVar = null;
                                            int i44 = 8;
                                            int i45 = 8;
                                            int i46 = -1;
                                            List list2 = null;
                                            int i47 = -1;
                                            while (true) {
                                                if (i41 - zzd4 >= zzg9) {
                                                    i10 = zzq2;
                                                    i11 = zzq3;
                                                    f = f4;
                                                    str3 = str10;
                                                    bArr = bArr3;
                                                    break;
                                                }
                                                zzfpVar3.zzK(i41);
                                                int zzd6 = zzfpVar3.zzd();
                                                int zzg11 = zzfpVar3.zzg();
                                                if (zzg11 == 0) {
                                                    bArr = bArr3;
                                                    if (zzfpVar3.zzd() - zzd4 == zzg9) {
                                                        i10 = zzq2;
                                                        i11 = zzq3;
                                                        f = f4;
                                                        str3 = str10;
                                                        break;
                                                    }
                                                    i16 = 0;
                                                } else {
                                                    bArr = bArr3;
                                                    i16 = zzg11;
                                                }
                                                if (i16 > 0) {
                                                    i17 = zzd4;
                                                    i18 = zzg9;
                                                    z3 = true;
                                                } else {
                                                    i17 = zzd4;
                                                    i18 = zzg9;
                                                    z3 = false;
                                                }
                                                zzacy.zzb(z3, "childAtomSize must be positive");
                                                int zzg12 = zzfpVar3.zzg();
                                                if (zzg12 == 1635148611) {
                                                    int i48 = zzd6 + 8;
                                                    zzacy.zzb(str2 == null, null);
                                                    zzfpVar3.zzK(i48);
                                                    zzabz zza5 = zzabz.zza(zzfpVar3);
                                                    list = zza5.zza;
                                                    zzaisVar3.zzc = zza5.zzb;
                                                    if (z8) {
                                                        f3 = f4;
                                                        z7 = true;
                                                    } else {
                                                        f3 = zza5.zzj;
                                                        z7 = false;
                                                    }
                                                    str5 = zza5.zzk;
                                                    i43 = zza5.zzg;
                                                    i26 = zza5.zzh;
                                                    i27 = zza5.zzi;
                                                    z8 = z7;
                                                    i28 = zza5.zze;
                                                    i29 = zza5.zzf;
                                                    str6 = "video/avc";
                                                } else if (zzg12 == 1752589123) {
                                                    int i49 = zzd6 + 8;
                                                    zzacy.zzb(str2 == null, null);
                                                    zzfpVar3.zzK(i49);
                                                    zzadl zza6 = zzadl.zza(zzfpVar3);
                                                    list = zza6.zza;
                                                    zzaisVar3.zzc = zza6.zzb;
                                                    if (z8) {
                                                        f3 = f4;
                                                        z6 = true;
                                                    } else {
                                                        f3 = zza6.zzh;
                                                        z6 = false;
                                                    }
                                                    str5 = zza6.zzi;
                                                    i43 = zza6.zze;
                                                    i26 = zza6.zzf;
                                                    i27 = zza6.zzg;
                                                    z8 = z6;
                                                    i28 = zza6.zzc;
                                                    i29 = zza6.zzd;
                                                    str6 = "video/hevc";
                                                } else {
                                                    if (zzg12 == 1685480259 || zzg12 == 1685485123) {
                                                        i19 = i8;
                                                        i20 = zzq2;
                                                        i21 = zzq3;
                                                        f2 = f4;
                                                        str4 = str10;
                                                        zzaisVar2 = zzaisVar3;
                                                        zzacq zza7 = zzacq.zza(zzfpVar3);
                                                        if (zza7 != null) {
                                                            str2 = "video/dolby-vision";
                                                            str10 = zza7.zza;
                                                            f4 = f2;
                                                        }
                                                        f4 = f2;
                                                        str10 = str4;
                                                    } else if (zzg12 != 1987076931) {
                                                        i19 = i8;
                                                        if (zzg12 != 1635135811) {
                                                            if (zzg12 == 1668050025) {
                                                                if (byteBuffer == null) {
                                                                    byteBuffer = zzl();
                                                                }
                                                                byteBuffer.position(21);
                                                                byteBuffer.putShort(zzfpVar3.zzD());
                                                                byteBuffer.putShort(zzfpVar3.zzD());
                                                                i20 = zzq2;
                                                                i21 = zzq3;
                                                                zzaisVar2 = zzaisVar3;
                                                            } else {
                                                                if (zzg12 == 1835295606) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = zzl();
                                                                    }
                                                                    short zzD = zzfpVar3.zzD();
                                                                    short zzD2 = zzfpVar3.zzD();
                                                                    short zzD3 = zzfpVar3.zzD();
                                                                    short zzD4 = zzfpVar3.zzD();
                                                                    zzaisVar2 = zzaisVar3;
                                                                    short zzD5 = zzfpVar3.zzD();
                                                                    f2 = f4;
                                                                    short zzD6 = zzfpVar3.zzD();
                                                                    i21 = zzq3;
                                                                    short zzD7 = zzfpVar3.zzD();
                                                                    i20 = zzq2;
                                                                    short zzD8 = zzfpVar3.zzD();
                                                                    long zzu3 = zzfpVar3.zzu();
                                                                    long zzu4 = zzfpVar3.zzu();
                                                                    str4 = str10;
                                                                    byteBuffer.position(1);
                                                                    byteBuffer.putShort(zzD5);
                                                                    byteBuffer.putShort(zzD6);
                                                                    byteBuffer.putShort(zzD);
                                                                    byteBuffer.putShort(zzD2);
                                                                    byteBuffer.putShort(zzD3);
                                                                    byteBuffer.putShort(zzD4);
                                                                    byteBuffer.putShort(zzD7);
                                                                    byteBuffer.putShort(zzD8);
                                                                    byteBuffer.putShort((short) (zzu3 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                                    byteBuffer.putShort((short) (zzu4 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                                } else {
                                                                    i20 = zzq2;
                                                                    i21 = zzq3;
                                                                    f2 = f4;
                                                                    str4 = str10;
                                                                    zzaisVar2 = zzaisVar3;
                                                                    if (zzg12 == 1681012275) {
                                                                        zzacy.zzb(str2 == null, null);
                                                                        str2 = "video/3gpp";
                                                                    } else if (zzg12 == 1702061171) {
                                                                        zzacy.zzb(str2 == null, null);
                                                                        zzaiq zzj = zzj(zzfpVar3, zzd6);
                                                                        str2 = zzj.zza;
                                                                        bArr2 = zzj.zzb;
                                                                        if (bArr2 != null) {
                                                                            zzaiqVar = zzj;
                                                                            list2 = zzgaa.zzm(bArr2);
                                                                        } else {
                                                                            zzaiqVar = zzj;
                                                                        }
                                                                    } else if (zzg12 == 1885434736) {
                                                                        zzfpVar3.zzK(zzd6 + 8);
                                                                        f4 = zzfpVar3.zzp() / zzfpVar3.zzp();
                                                                        str10 = str4;
                                                                        z8 = true;
                                                                    } else if (zzg12 == 1937126244) {
                                                                        int i50 = zzd6 + 8;
                                                                        while (i50 - zzd6 < i16) {
                                                                            zzfpVar3.zzK(i50);
                                                                            int zzg13 = zzfpVar3.zzg() + i50;
                                                                            if (zzfpVar3.zzg() == 1886547818) {
                                                                                bArr = Arrays.copyOfRange(zzfpVar3.zzM(), i50, zzg13);
                                                                            } else {
                                                                                i50 = zzg13;
                                                                            }
                                                                        }
                                                                        f4 = f2;
                                                                        str10 = str4;
                                                                        bArr = null;
                                                                    } else {
                                                                        if (zzg12 == 1936995172) {
                                                                            int zzm2 = zzfpVar3.zzm();
                                                                            zzfpVar3.zzL(3);
                                                                            if (zzm2 == 0) {
                                                                                int zzm3 = zzfpVar3.zzm();
                                                                                if (zzm3 == 0) {
                                                                                    i47 = 0;
                                                                                } else if (zzm3 == 1) {
                                                                                    f4 = f2;
                                                                                    str10 = str4;
                                                                                    i47 = 1;
                                                                                } else if (zzm3 == 2) {
                                                                                    f4 = f2;
                                                                                    str10 = str4;
                                                                                    i47 = 2;
                                                                                } else if (zzm3 == 3) {
                                                                                    i47 = 3;
                                                                                }
                                                                                f4 = f2;
                                                                                str10 = str4;
                                                                                break;
                                                                            }
                                                                        } else if (zzg12 == 1668246642) {
                                                                            if (i43 == -1) {
                                                                                if (i42 == -1) {
                                                                                    int zzg14 = zzfpVar3.zzg();
                                                                                    if (zzg14 == 1852009592 || zzg14 == 1852009571) {
                                                                                        int zzq4 = zzfpVar3.zzq();
                                                                                        int zzq5 = zzfpVar3.zzq();
                                                                                        zzfpVar3.zzL(2);
                                                                                        if (i16 == 19) {
                                                                                            if ((zzfpVar3.zzm() & 128) != 0) {
                                                                                                i16 = 19;
                                                                                                z4 = true;
                                                                                                int zza8 = zzt.zza(zzq4);
                                                                                                int i51 = true == z4 ? 2 : 1;
                                                                                                i43 = zza8;
                                                                                                i42 = zzt.zzb(zzq5);
                                                                                                i46 = i51;
                                                                                            } else {
                                                                                                i16 = 19;
                                                                                            }
                                                                                        }
                                                                                        z4 = false;
                                                                                        int zza82 = zzt.zza(zzq4);
                                                                                        if (true == z4) {
                                                                                        }
                                                                                        i43 = zza82;
                                                                                        i42 = zzt.zzb(zzq5);
                                                                                        i46 = i51;
                                                                                    } else {
                                                                                        zzff.zzf("AtomParsers", "Unsupported color type: ".concat(zzaio.zzf(zzg14)));
                                                                                        i42 = -1;
                                                                                        i43 = -1;
                                                                                    }
                                                                                } else {
                                                                                    i43 = -1;
                                                                                }
                                                                            }
                                                                            f4 = f2;
                                                                            str10 = str4;
                                                                        }
                                                                        f4 = f2;
                                                                        str10 = str4;
                                                                    }
                                                                }
                                                                f4 = f2;
                                                                str10 = str4;
                                                            }
                                                            break;
                                                            break;
                                                        }
                                                        zzfpVar3.zzK(zzd6 + 8);
                                                        zzr zzrVar = new zzr();
                                                        byte[] zzM = zzfpVar3.zzM();
                                                        zzfo zzfoVar = new zzfo(zzM, zzM.length);
                                                        zzfoVar.zzk(zzfpVar3.zzd() * 8);
                                                        zzfoVar.zzn(1);
                                                        int zzd7 = zzfoVar.zzd(3);
                                                        zzfoVar.zzm(6);
                                                        boolean zzo = zzfoVar.zzo();
                                                        boolean zzo2 = zzfoVar.zzo();
                                                        if (zzd7 == 2) {
                                                            if (zzo) {
                                                                int i52 = true != zzo2 ? 10 : 12;
                                                                zzrVar.zzf(i52);
                                                                zzrVar.zza(i52);
                                                                i22 = 1;
                                                                zzfoVar.zzm(13);
                                                                zzfoVar.zzl();
                                                                int i53 = 4;
                                                                zzd = zzfoVar.zzd(4);
                                                                if (zzd == i22) {
                                                                    zzff.zze("AtomParsers", "Unsupported obu_type: " + zzd);
                                                                    zzg = zzrVar.zzg();
                                                                } else if (zzfoVar.zzo()) {
                                                                    zzff.zze("AtomParsers", "Unsupported obu_extension_flag");
                                                                    zzg = zzrVar.zzg();
                                                                } else {
                                                                    boolean zzo3 = zzfoVar.zzo();
                                                                    zzfoVar.zzl();
                                                                    if (!zzo3 || zzfoVar.zzd(8) <= 127) {
                                                                        int zzd8 = zzfoVar.zzd(3);
                                                                        zzfoVar.zzl();
                                                                        if (zzfoVar.zzo()) {
                                                                            zzff.zze("AtomParsers", "Unsupported reduced_still_picture_header");
                                                                            zzg = zzrVar.zzg();
                                                                        } else if (zzfoVar.zzo()) {
                                                                            zzff.zze("AtomParsers", "Unsupported timing_info_present_flag");
                                                                            zzg = zzrVar.zzg();
                                                                        } else if (zzfoVar.zzo()) {
                                                                            zzff.zze("AtomParsers", "Unsupported initial_display_delay_present_flag");
                                                                            zzg = zzrVar.zzg();
                                                                        } else {
                                                                            int i54 = 5;
                                                                            int zzd9 = zzfoVar.zzd(5);
                                                                            int i55 = 0;
                                                                            while (i55 <= zzd9) {
                                                                                zzfoVar.zzm(12);
                                                                                if (zzfoVar.zzd(i54) > 7) {
                                                                                    zzfoVar.zzl();
                                                                                }
                                                                                i55++;
                                                                                i54 = 5;
                                                                                i53 = 4;
                                                                            }
                                                                            int i56 = i53;
                                                                            int zzd10 = zzfoVar.zzd(i56);
                                                                            int zzd11 = zzfoVar.zzd(i56);
                                                                            zzfoVar.zzm(zzd10 + 1);
                                                                            zzfoVar.zzm(zzd11 + 1);
                                                                            if (zzfoVar.zzo()) {
                                                                                zzfoVar.zzm(7);
                                                                            }
                                                                            zzfoVar.zzm(7);
                                                                            boolean zzo4 = zzfoVar.zzo();
                                                                            if (zzo4) {
                                                                                zzfoVar.zzm(2);
                                                                            }
                                                                            int i57 = zzfoVar.zzo() ? 1 : 1;
                                                                            if (!zzfoVar.zzo()) {
                                                                                zzfoVar.zzm(i57);
                                                                            }
                                                                            if (zzo4) {
                                                                                i23 = 3;
                                                                                zzfoVar.zzm(3);
                                                                            } else {
                                                                                i23 = 3;
                                                                            }
                                                                            zzfoVar.zzm(i23);
                                                                            boolean zzo5 = zzfoVar.zzo();
                                                                            if (zzd8 == 2) {
                                                                                if (zzo5) {
                                                                                    zzfoVar.zzl();
                                                                                }
                                                                            }
                                                                            if (zzfoVar.zzo()) {
                                                                                z5 = true;
                                                                                if (zzfoVar.zzo()) {
                                                                                    int zzd12 = zzfoVar.zzd(8);
                                                                                    int zzd13 = zzfoVar.zzd(8);
                                                                                    int zzd14 = zzfoVar.zzd(8);
                                                                                    if (z5) {
                                                                                        i24 = 1;
                                                                                    } else {
                                                                                        i24 = 1;
                                                                                        if (zzd12 == 1) {
                                                                                            i25 = 13;
                                                                                            if (zzd13 != 13) {
                                                                                                zzd12 = 1;
                                                                                            } else if (zzd14 == 0) {
                                                                                                zzd2 = 1;
                                                                                                zzd12 = 1;
                                                                                                zzrVar.zzc(zzt.zza(zzd12));
                                                                                                zzrVar.zzb(zzd2 != i24 ? 1 : 2);
                                                                                                zzrVar.zzd(zzt.zzb(i25));
                                                                                            } else {
                                                                                                zzd12 = 1;
                                                                                                zzd13 = 13;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    zzd2 = zzfoVar.zzd(i24);
                                                                                    i25 = zzd13;
                                                                                    zzrVar.zzc(zzt.zza(zzd12));
                                                                                    zzrVar.zzb(zzd2 != i24 ? 1 : 2);
                                                                                    zzrVar.zzd(zzt.zzb(i25));
                                                                                }
                                                                                zzg = zzrVar.zzg();
                                                                                int i58 = zzg.zzf;
                                                                                int i59 = zzg.zze;
                                                                                i43 = zzg.zzd;
                                                                                int i60 = zzg.zzi;
                                                                                i45 = zzg.zzh;
                                                                                i20 = zzq2;
                                                                                i21 = zzq3;
                                                                                i46 = i59;
                                                                                i44 = i60;
                                                                                zzaisVar2 = zzaisVar3;
                                                                                i42 = i58;
                                                                                str2 = "video/av01";
                                                                            }
                                                                            z5 = false;
                                                                            if (zzfoVar.zzo()) {
                                                                            }
                                                                            zzg = zzrVar.zzg();
                                                                            int i582 = zzg.zzf;
                                                                            int i592 = zzg.zze;
                                                                            i43 = zzg.zzd;
                                                                            int i602 = zzg.zzi;
                                                                            i45 = zzg.zzh;
                                                                            i20 = zzq2;
                                                                            i21 = zzq3;
                                                                            i46 = i592;
                                                                            i44 = i602;
                                                                            zzaisVar2 = zzaisVar3;
                                                                            i42 = i582;
                                                                            str2 = "video/av01";
                                                                        }
                                                                    } else {
                                                                        zzff.zze("AtomParsers", "Excessive obu_size");
                                                                        zzg = zzrVar.zzg();
                                                                    }
                                                                }
                                                                i23 = 3;
                                                                int i5822 = zzg.zzf;
                                                                int i5922 = zzg.zze;
                                                                i43 = zzg.zzd;
                                                                int i6022 = zzg.zzi;
                                                                i45 = zzg.zzh;
                                                                i20 = zzq2;
                                                                i21 = zzq3;
                                                                i46 = i5922;
                                                                i44 = i6022;
                                                                zzaisVar2 = zzaisVar3;
                                                                i42 = i5822;
                                                                str2 = "video/av01";
                                                            } else {
                                                                zzd7 = 2;
                                                                zzo = false;
                                                            }
                                                        }
                                                        i22 = 1;
                                                        if (zzd7 <= 2) {
                                                            int i61 = true != zzo ? 8 : 10;
                                                            zzrVar.zzf(i61);
                                                            zzrVar.zza(i61);
                                                        }
                                                        zzfoVar.zzm(13);
                                                        zzfoVar.zzl();
                                                        int i532 = 4;
                                                        zzd = zzfoVar.zzd(4);
                                                        if (zzd == i22) {
                                                        }
                                                        i23 = 3;
                                                        int i58222 = zzg.zzf;
                                                        int i59222 = zzg.zze;
                                                        i43 = zzg.zzd;
                                                        int i60222 = zzg.zzi;
                                                        i45 = zzg.zzh;
                                                        i20 = zzq2;
                                                        i21 = zzq3;
                                                        i46 = i59222;
                                                        i44 = i60222;
                                                        zzaisVar2 = zzaisVar3;
                                                        i42 = i58222;
                                                        str2 = "video/av01";
                                                    } else {
                                                        zzacy.zzb(str2 == null, null);
                                                        zzfpVar3.zzK(zzd6 + 12);
                                                        zzfpVar3.zzL(2);
                                                        int zzm4 = zzfpVar3.zzm();
                                                        int i62 = zzm4 >> 4;
                                                        int i63 = zzm4 & 1;
                                                        int zzm5 = zzfpVar3.zzm();
                                                        int zzm6 = zzfpVar3.zzm();
                                                        i43 = zzt.zza(zzm5);
                                                        int i64 = 1 != i63 ? 2 : 1;
                                                        int zzb6 = zzt.zzb(zzm6);
                                                        i19 = i8;
                                                        i46 = i64;
                                                        i20 = zzq2;
                                                        i21 = zzq3;
                                                        i44 = i62;
                                                        i45 = i44;
                                                        str2 = i8 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                        i42 = zzb6;
                                                        zzaisVar2 = zzaisVar3;
                                                    }
                                                    i41 += i16;
                                                    zzd4 = i17;
                                                    bArr3 = bArr;
                                                    zzg9 = i18;
                                                    i8 = i19;
                                                    zzaisVar3 = zzaisVar2;
                                                    zzq3 = i21;
                                                    zzq2 = i20;
                                                }
                                                i19 = i8;
                                                i20 = zzq2;
                                                i21 = zzq3;
                                                i45 = i28;
                                                list2 = list;
                                                f4 = f3;
                                                str10 = str5;
                                                i46 = i26;
                                                zzaisVar2 = zzaisVar3;
                                                i42 = i27;
                                                String str11 = str6;
                                                i44 = i29;
                                                str2 = str11;
                                                i41 += i16;
                                                zzd4 = i17;
                                                bArr3 = bArr;
                                                zzg9 = i18;
                                                i8 = i19;
                                                zzaisVar3 = zzaisVar2;
                                                zzq3 = i21;
                                                zzq2 = i20;
                                            }
                                            i12 = zzd4;
                                            zzais zzaisVar4 = zzaisVar3;
                                            i13 = zzg9;
                                            if (str2 == null) {
                                                i15 = i38;
                                                i14 = i39;
                                                zzaisVar = zzaisVar4;
                                            } else {
                                                zzak zzakVar = new zzak();
                                                i14 = i39;
                                                zzakVar.zzJ(i14);
                                                zzakVar.zzW(str2);
                                                zzakVar.zzz(str3);
                                                zzakVar.zzab(i10);
                                                zzakVar.zzI(i11);
                                                zzakVar.zzS(f);
                                                i15 = i38;
                                                zzakVar.zzV(i15);
                                                zzakVar.zzT(bArr);
                                                zzakVar.zzZ(i47);
                                                zzakVar.zzL(list2);
                                                zzakVar.zzE(zzaeVar4);
                                                zzr zzrVar2 = new zzr();
                                                zzrVar2.zzc(i43);
                                                zzrVar2.zzb(i46);
                                                zzrVar2.zzd(i42);
                                                zzrVar2.zze(byteBuffer != null ? byteBuffer.array() : null);
                                                zzrVar2.zzf(i45);
                                                zzrVar2.zza(i44);
                                                zzakVar.zzA(zzrVar2.zzg());
                                                if (zzaiqVar != null) {
                                                    j5 = zzaiqVar.zzc;
                                                    zzakVar.zzx(zzgcu.zzc(j5));
                                                    j6 = zzaiqVar.zzd;
                                                    zzakVar.zzR(zzgcu.zzc(j6));
                                                }
                                                zzaisVar = zzaisVar4;
                                                zzaisVar.zzb = zzakVar.zzac();
                                            }
                                        } else if (zzg10 == 1836069985 || zzg10 == 1701733217 || zzg10 == 1633889587 || zzg10 == 1700998451 || zzg10 == 1633889588 || zzg10 == 1835823201 || zzg10 == 1685353315 || zzg10 == 1685353317 || zzg10 == 1685353320 || zzg10 == 1685353324 || zzg10 == 1685353336 || zzg10 == 1935764850 || zzg10 == 1935767394 || zzg10 == 1819304813 || zzg10 == 1936684916 || zzg10 == 1953984371 || zzg10 == 778924082 || zzg10 == 778924083 || zzg10 == 1835557169 || zzg10 == 1835560241 || zzg10 == 1634492771 || zzg10 == 1634492791 || zzg10 == 1970037111 || zzg10 == 1332770163 || zzg10 == 1716281667) {
                                            i7 = i37;
                                            str = str9;
                                            i6 = i31;
                                            pair = create2;
                                            j4 = j9;
                                            zzm(zzfpVar3, zzg10, zzd4, zzg9, i2, str, z2, zzaeVar, zzaisVar3, i36);
                                            i9 = i36;
                                            i12 = zzd4;
                                            zzaisVar = zzaisVar3;
                                            i13 = zzg9;
                                            i15 = i3;
                                            i14 = i2;
                                        } else if (zzg10 == 1414810956 || zzg10 == 1954034535 || zzg10 == 2004251764 || zzg10 == 1937010800 || zzg10 == 1664495672) {
                                            zzfpVar3.zzK(zzd4 + 16);
                                            long j10 = Long.MAX_VALUE;
                                            if (zzg10 == 1414810956) {
                                                str8 = "application/ttml+xml";
                                            } else if (zzg10 == 1954034535) {
                                                int i65 = zzg9 - 16;
                                                byte[] bArr4 = new byte[i65];
                                                zzfpVar3.zzG(bArr4, 0, i65);
                                                zzm = zzgaa.zzm(bArr4);
                                                str7 = "application/x-quicktime-tx3g";
                                                j7 = Long.MAX_VALUE;
                                                zzak zzakVar2 = new zzak();
                                                zzakVar2.zzJ(i2);
                                                zzakVar2.zzW(str7);
                                                zzakVar2.zzN(str9);
                                                String str12 = str9;
                                                zzakVar2.zzaa(j7);
                                                zzakVar2.zzL(zzm);
                                                zzaisVar3.zzb = zzakVar2.zzac();
                                                i15 = i3;
                                                i6 = i31;
                                                i14 = i2;
                                                pair = create2;
                                                j4 = j9;
                                                i9 = i36;
                                                i12 = zzd4;
                                                zzaisVar = zzaisVar3;
                                                i13 = zzg9;
                                                i7 = i37;
                                                str = str12;
                                            } else if (zzg10 == 2004251764) {
                                                str8 = "application/x-mp4-vtt";
                                            } else if (zzg10 == 1937010800) {
                                                j10 = 0;
                                                str8 = "application/ttml+xml";
                                            } else {
                                                zzaisVar3.zzd = 1;
                                                str7 = "application/x-mp4-cea-608";
                                                j7 = j10;
                                                zzm = null;
                                                zzak zzakVar22 = new zzak();
                                                zzakVar22.zzJ(i2);
                                                zzakVar22.zzW(str7);
                                                zzakVar22.zzN(str9);
                                                String str122 = str9;
                                                zzakVar22.zzaa(j7);
                                                zzakVar22.zzL(zzm);
                                                zzaisVar3.zzb = zzakVar22.zzac();
                                                i15 = i3;
                                                i6 = i31;
                                                i14 = i2;
                                                pair = create2;
                                                j4 = j9;
                                                i9 = i36;
                                                i12 = zzd4;
                                                zzaisVar = zzaisVar3;
                                                i13 = zzg9;
                                                i7 = i37;
                                                str = str122;
                                            }
                                            str7 = str8;
                                            j7 = j10;
                                            zzm = null;
                                            zzak zzakVar222 = new zzak();
                                            zzakVar222.zzJ(i2);
                                            zzakVar222.zzW(str7);
                                            zzakVar222.zzN(str9);
                                            String str1222 = str9;
                                            zzakVar222.zzaa(j7);
                                            zzakVar222.zzL(zzm);
                                            zzaisVar3.zzb = zzakVar222.zzac();
                                            i15 = i3;
                                            i6 = i31;
                                            i14 = i2;
                                            pair = create2;
                                            j4 = j9;
                                            i9 = i36;
                                            i12 = zzd4;
                                            zzaisVar = zzaisVar3;
                                            i13 = zzg9;
                                            i7 = i37;
                                            str = str1222;
                                        } else {
                                            if (zzg10 == 1835365492) {
                                                zzfpVar3.zzK(zzd4 + 16);
                                                zzfpVar3.zzx((char) 0);
                                                String zzx = zzfpVar3.zzx((char) 0);
                                                if (zzx != null) {
                                                    zzak zzakVar3 = new zzak();
                                                    zzakVar3.zzJ(i2);
                                                    zzakVar3.zzW(zzx);
                                                    zzaisVar3.zzb = zzakVar3.zzac();
                                                }
                                            } else if (zzg10 == 1667329389) {
                                                zzak zzakVar4 = new zzak();
                                                zzakVar4.zzJ(i2);
                                                zzakVar4.zzW("application/x-camera-motion");
                                                zzaisVar3.zzb = zzakVar4.zzac();
                                            }
                                            str = str9;
                                            i15 = i3;
                                            i6 = i31;
                                            i14 = i2;
                                            pair = create2;
                                            j4 = j9;
                                            i9 = i36;
                                            i12 = zzd4;
                                            zzaisVar = zzaisVar3;
                                            i13 = zzg9;
                                            i7 = i37;
                                        }
                                        zzfpVar3.zzK(i12 + i13);
                                        i36 = i9 + 1;
                                        zzaeVar3 = zzaeVar;
                                        i3 = i15;
                                        i2 = i14;
                                        zzaisVar3 = zzaisVar;
                                        zzg8 = i7;
                                        i31 = i6;
                                        zzaivVar = zzaivVar2;
                                        j9 = j4;
                                        str9 = str;
                                        zzaimVar4 = zzaimVar5;
                                        create2 = pair;
                                    }
                                    int i66 = i31;
                                    Pair pair2 = create2;
                                    long j11 = j9;
                                    zzaiv zzaivVar3 = zzaivVar;
                                    zzais zzaisVar5 = zzaisVar3;
                                    zzaim zzaimVar6 = zzaimVar4;
                                    if (z) {
                                        zzaimVar2 = zzaimVar6;
                                    } else {
                                        zzaimVar2 = zzaimVar6;
                                        zzaim zza9 = zzaimVar2.zza(1701082227);
                                        if (zza9 != null) {
                                            zzain zzb7 = zza9.zzb(1701606260);
                                            if (zzb7 == null) {
                                                create = null;
                                            } else {
                                                zzfp zzfpVar4 = zzb7.zza;
                                                zzfpVar4.zzK(8);
                                                int zze3 = zzaio.zze(zzfpVar4.zzg());
                                                int zzp = zzfpVar4.zzp();
                                                long[] jArr3 = new long[zzp];
                                                long[] jArr4 = new long[zzp];
                                                for (int i67 = 0; i67 < zzp; i67++) {
                                                    jArr3[i67] = zze3 == 1 ? zzfpVar4.zzv() : zzfpVar4.zzu();
                                                    jArr4[i67] = zze3 == 1 ? zzfpVar4.zzt() : zzfpVar4.zzg();
                                                    if (zzfpVar4.zzD() != 1) {
                                                        throw new IllegalArgumentException("Unsupported media rate.");
                                                    }
                                                    zzfpVar4.zzL(2);
                                                }
                                                create = Pair.create(jArr3, jArr4);
                                            }
                                            if (create != null) {
                                                jArr = (long[]) create.first;
                                                jArr2 = (long[]) create.second;
                                                if (zzaisVar5.zzb != null) {
                                                    zzfwsVar2 = zzfwsVar;
                                                    zzajmVar = null;
                                                } else {
                                                    i5 = zzaivVar3.zza;
                                                    zzajmVar = new zzajm(i5, i66, ((Long) pair2.first).longValue(), j11, zzs, zzaisVar5.zzb, zzaisVar5.zzd, zzaisVar5.zza, zzaisVar5.zzc, jArr, jArr2);
                                                    zzfwsVar2 = zzfwsVar;
                                                }
                                            }
                                        }
                                    }
                                    jArr = null;
                                    jArr2 = null;
                                    if (zzaisVar5.zzb != null) {
                                    }
                                } else {
                                    zzg6 = -65536;
                                }
                            }
                            zzg5 = 65536;
                        }
                        zzg4 = 0;
                    }
                    if (zzg4 == 0) {
                        if (zzg5 == -65536) {
                            if (zzg6 != 65536) {
                                zzg5 = -65536;
                            } else if (zzg7 == 0) {
                                i = 270;
                                zzaiv zzaivVar4 = new zzaiv(zzg3, j2, i);
                                if (j == -9223372036854775807L) {
                                }
                                long j92 = zzc(zzb2.zza).zzc;
                                if (j3 != -9223372036854775807L) {
                                }
                                zzaim zza32 = zza2.zza(1835626086);
                                zza32.getClass();
                                zzaim zza42 = zza32.zza(1937007212);
                                zza42.getClass();
                                zzain zzb52 = zza2.zzb(1835296868);
                                zzb52.getClass();
                                zzfp zzfpVar22 = zzb52.zza;
                                zzfpVar22.zzK(8);
                                int zze22 = zzaio.zze(zzfpVar22.zzg());
                                zzfpVar22.zzL(zze22 == 0 ? 8 : 16);
                                if (zze22 == 0) {
                                }
                                long zzu22 = zzfpVar22.zzu();
                                zzfpVar22.zzL(i35);
                                int zzq6 = zzfpVar22.zzq();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append((char) (((zzq6 >> 10) & 31) + 96));
                                sb2.append((char) (((zzq6 >> 5) & 31) + 96));
                                sb2.append((char) ((zzq6 & 31) + 96));
                                Pair create22 = Pair.create(Long.valueOf(zzu22), sb2.toString());
                                zzb = zza42.zzb(1937011556);
                                if (zzb == null) {
                                }
                            } else {
                                zzg5 = -65536;
                                zzg4 = 0;
                            }
                        }
                        i34 = zzg6;
                        zzg4 = 0;
                    } else {
                        i34 = zzg6;
                    }
                    i = (zzg4 == -65536 && zzg5 == 0 && i34 == 0 && zzg7 == -65536) ? 180 : 0;
                    zzaiv zzaivVar42 = new zzaiv(zzg3, j2, i);
                    if (j == -9223372036854775807L) {
                    }
                    long j922 = zzc(zzb2.zza).zzc;
                    if (j3 != -9223372036854775807L) {
                    }
                    zzaim zza322 = zza2.zza(1835626086);
                    zza322.getClass();
                    zzaim zza422 = zza322.zza(1937007212);
                    zza422.getClass();
                    zzain zzb522 = zza2.zzb(1835296868);
                    zzb522.getClass();
                    zzfp zzfpVar222 = zzb522.zza;
                    zzfpVar222.zzK(8);
                    int zze222 = zzaio.zze(zzfpVar222.zzg());
                    zzfpVar222.zzL(zze222 == 0 ? 8 : 16);
                    if (zze222 == 0) {
                    }
                    long zzu222 = zzfpVar222.zzu();
                    zzfpVar222.zzL(i35);
                    int zzq62 = zzfpVar222.zzq();
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append((char) (((zzq62 >> 10) & 31) + 96));
                    sb22.append((char) (((zzq62 >> 5) & 31) + 96));
                    sb22.append((char) ((zzq62 & 31) + 96));
                    Pair create222 = Pair.create(Long.valueOf(zzu222), sb22.toString());
                    zzb = zza422.zzb(1937011556);
                    if (zzb == null) {
                    }
                }
                zzajm zzajmVar2 = (zzajm) zzfwsVar2.apply(zzajmVar);
                if (zzajmVar2 != null) {
                    zzaim zza10 = zzaimVar2.zza(1835297121);
                    zza10.getClass();
                    zzaim zza11 = zza10.zza(1835626086);
                    zza11.getClass();
                    zzaim zza12 = zza11.zza(1937007212);
                    zza12.getClass();
                    zzajp zzk = zzk(zzajmVar2, zza12, zzadkVar);
                    arrayList2 = arrayList;
                    arrayList2.add(zzk);
                } else {
                    arrayList2 = arrayList;
                }
            }
            i30 = i4 + 1;
            zzaimVar3 = zzaimVar;
            zzaeVar3 = zzaeVar;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }

    public static void zze(zzfp zzfpVar) {
        int zzd = zzfpVar.zzd();
        zzfpVar.zzL(4);
        if (zzfpVar.zzg() != 1751411826) {
            zzd += 4;
        }
        zzfpVar.zzK(zzd);
    }

    private static int zzf(zzfp zzfpVar) {
        int zzm = zzfpVar.zzm();
        int i = zzm & WorkQueueKt.MASK;
        while ((zzm & 128) == 128) {
            zzm = zzfpVar.zzm();
            i = (i << 7) | (zzm & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zzg(zzfp zzfpVar) {
        zzfpVar.zzK(16);
        return zzfpVar.zzg();
    }

    private static Pair zzh(zzfp zzfpVar, int i, int i2) throws zzcc {
        Integer num;
        zzajn zzajnVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzd = zzfpVar.zzd();
        while (zzd - i < i2) {
            zzfpVar.zzK(zzd);
            int zzg = zzfpVar.zzg();
            zzacy.zzb(zzg > 0, "childAtomSize must be positive");
            if (zzfpVar.zzg() == 1936289382) {
                int i5 = zzd + 8;
                int i6 = 0;
                int i7 = -1;
                String str = null;
                Integer num2 = null;
                while (i5 - zzd < zzg) {
                    zzfpVar.zzK(i5);
                    int zzg2 = zzfpVar.zzg();
                    int zzg3 = zzfpVar.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzfpVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzfpVar.zzL(4);
                        str = zzfpVar.zzA(4, zzfwq.zzc);
                    } else if (zzg3 == 1935894633) {
                        i7 = i5;
                        i6 = zzg2;
                    }
                    i5 += zzg2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzacy.zzb(num2 != null, "frma atom is mandatory");
                    zzacy.zzb(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num2;
                            zzajnVar = null;
                            break;
                        }
                        zzfpVar.zzK(i8);
                        int zzg4 = zzfpVar.zzg();
                        if (zzfpVar.zzg() == 1952804451) {
                            int zze = zzaio.zze(zzfpVar.zzg());
                            zzfpVar.zzL(1);
                            if (zze == 0) {
                                zzfpVar.zzL(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzm = zzfpVar.zzm();
                                int i9 = (zzm & 240) >> 4;
                                i3 = zzm & 15;
                                i4 = i9;
                            }
                            boolean z = zzfpVar.zzm() == 1;
                            int zzm2 = zzfpVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzfpVar.zzG(bArr2, 0, 16);
                            if (z && zzm2 == 0) {
                                int zzm3 = zzfpVar.zzm();
                                byte[] bArr3 = new byte[zzm3];
                                zzfpVar.zzG(bArr3, 0, zzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzajnVar = new zzajn(z, str, zzm2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzg4;
                        }
                    }
                    zzacy.zzb(zzajnVar != null, "tenc atom is mandatory");
                    int i10 = zzfy.zza;
                    create = Pair.create(num, zzajnVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzd += zzg;
        }
        return null;
    }

    private static zzby zzi(zzfp zzfpVar) {
        short zzD = zzfpVar.zzD();
        zzfpVar.zzL(2);
        String zzA = zzfpVar.zzA(zzD, zzfwq.zzc);
        int max = Math.max(zzA.lastIndexOf(43), zzA.lastIndexOf(45));
        try {
            return new zzby(-9223372036854775807L, new zzgf(Float.parseFloat(zzA.substring(0, max)), Float.parseFloat(zzA.substring(max, zzA.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaiq zzj(zzfp zzfpVar, int i) {
        zzfpVar.zzK(i + 12);
        zzfpVar.zzL(1);
        zzf(zzfpVar);
        zzfpVar.zzL(2);
        int zzm = zzfpVar.zzm();
        if ((zzm & 128) != 0) {
            zzfpVar.zzL(2);
        }
        if ((zzm & 64) != 0) {
            zzfpVar.zzL(zzfpVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzfpVar.zzL(2);
        }
        zzfpVar.zzL(1);
        zzf(zzfpVar);
        String zzd = zzcb.zzd(zzfpVar.zzm());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzaiq(zzd, null, -1L, -1L);
        }
        zzfpVar.zzL(4);
        long zzu = zzfpVar.zzu();
        long zzu2 = zzfpVar.zzu();
        zzfpVar.zzL(1);
        int zzf = zzf(zzfpVar);
        byte[] bArr = new byte[zzf];
        zzfpVar.zzG(bArr, 0, zzf);
        return new zzaiq(zzd, bArr, zzu2 <= 0 ? -1L : zzu2, zzu > 0 ? zzu : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0271 A[ADDED_TO_REGION, LOOP:12: B:217:0x0271->B:220:0x027b, LOOP_START, PHI: r16
      0x0271: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:216:0x026f, B:220:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x025f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzajp zzk(zzajm zzajmVar, zzaim zzaimVar, zzadk zzadkVar) throws zzcc {
        zzair zzaiuVar;
        boolean z;
        int i;
        int i2;
        int i3;
        int zza2;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        long[] jArr3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zzajm zzajmVar2;
        int i15;
        int[] iArr2;
        long[] jArr4;
        int[] iArr3;
        int i16;
        int[] iArr4;
        int i17;
        long j2;
        int i18;
        int i19;
        int i20;
        long[] jArr5;
        int i21;
        int i22;
        long[] jArr6;
        int[] iArr5;
        int[] iArr6;
        boolean z4;
        int i23;
        int i24;
        int i25;
        int i26;
        int length;
        zzain zzb = zzaimVar.zzb(1937011578);
        if (zzb != null) {
            zzaiuVar = new zzait(zzb, zzajmVar.zzf);
        } else {
            zzain zzb2 = zzaimVar.zzb(1937013298);
            if (zzb2 == null) {
                throw zzcc.zza("Track has no sample table size information", null);
            }
            zzaiuVar = new zzaiu(zzb2);
        }
        int zzb3 = zzaiuVar.zzb();
        if (zzb3 == 0) {
            return new zzajp(zzajmVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        zzain zzb4 = zzaimVar.zzb(1937007471);
        if (zzb4 == null) {
            zzb4 = zzaimVar.zzb(1668232756);
            zzb4.getClass();
            z = true;
        } else {
            z = false;
        }
        zzain zzb5 = zzaimVar.zzb(1937011555);
        zzb5.getClass();
        zzain zzb6 = zzaimVar.zzb(1937011827);
        zzb6.getClass();
        zzain zzb7 = zzaimVar.zzb(1937011571);
        zzfp zzfpVar = zzb7 != null ? zzb7.zza : null;
        zzain zzb8 = zzaimVar.zzb(1668576371);
        zzfp zzfpVar2 = zzb8 != null ? zzb8.zza : null;
        zzfp zzfpVar3 = zzb6.zza;
        zzaip zzaipVar = new zzaip(zzb5.zza, zzb4.zza, z);
        zzfpVar3.zzK(12);
        int zzp = zzfpVar3.zzp() - 1;
        int zzp2 = zzfpVar3.zzp();
        int zzp3 = zzfpVar3.zzp();
        if (zzfpVar2 != null) {
            zzfpVar2.zzK(12);
            i = zzfpVar2.zzp();
        } else {
            i = 0;
        }
        if (zzfpVar != null) {
            zzfpVar.zzK(12);
            i2 = zzfpVar.zzp();
            if (i2 > 0) {
                i3 = zzfpVar.zzp() - 1;
                zza2 = zzaiuVar.zza();
                String str = zzajmVar.zzf.zzm;
                if (zza2 != -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && zzp == 0)) {
                    if (i != 0 && i2 == 0) {
                        int i27 = zzaipVar.zza;
                        long[] jArr7 = new long[i27];
                        int[] iArr7 = new int[i27];
                        while (zzaipVar.zza()) {
                            int i28 = zzaipVar.zzb;
                            jArr7[i28] = zzaipVar.zzd;
                            iArr7[i28] = zzaipVar.zzc;
                        }
                        long j3 = zzp3;
                        int i29 = 8192 / zza2;
                        int i30 = 0;
                        for (int i31 = 0; i31 < i27; i31++) {
                            int i32 = iArr7[i31];
                            int i33 = zzfy.zza;
                            i30 += ((i32 + i29) - 1) / i29;
                        }
                        long[] jArr8 = new long[i30];
                        int[] iArr8 = new int[i30];
                        long[] jArr9 = new long[i30];
                        int[] iArr9 = new int[i30];
                        int i34 = 0;
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (i34 < i27) {
                            int i38 = iArr7[i34];
                            long j4 = jArr7[i34];
                            int i39 = i27;
                            int i40 = i38;
                            while (i40 > 0) {
                                int min = Math.min(i29, i40);
                                jArr8[i37] = j4;
                                long[] jArr10 = jArr7;
                                int i41 = zza2 * min;
                                iArr8[i37] = i41;
                                i36 = Math.max(i36, i41);
                                jArr9[i37] = i35 * j3;
                                iArr9[i37] = 1;
                                j4 += iArr8[i37];
                                i35 += min;
                                i40 -= min;
                                i37++;
                                jArr7 = jArr10;
                                iArr7 = iArr7;
                            }
                            i34++;
                            i27 = i39;
                        }
                        i17 = zzb3;
                        j2 = j3 * i35;
                        jArr4 = jArr8;
                        iArr3 = iArr9;
                        iArr4 = iArr8;
                        jArr2 = jArr9;
                        i16 = i36;
                        zzajmVar2 = zzajmVar;
                        long zzs = zzfy.zzs(j2, 1000000L, zzajmVar2.zzc, RoundingMode.FLOOR);
                        jArr5 = zzajmVar2.zzh;
                        if (jArr5 != null) {
                            zzfy.zzE(jArr2, 1000000L, zzajmVar2.zzc);
                            return new zzajp(zzajmVar, jArr4, iArr4, i16, jArr2, iArr3, zzs);
                        }
                        if (jArr5.length == 1 && zzajmVar2.zzb == 1 && (length = jArr2.length) >= 2) {
                            long[] jArr11 = zzajmVar2.zzi;
                            jArr11.getClass();
                            long j5 = jArr11[0];
                            int i42 = i17;
                            long zzs2 = zzfy.zzs(jArr5[0], zzajmVar2.zzc, zzajmVar2.zzd, RoundingMode.FLOOR) + j5;
                            int i43 = length - 1;
                            int max = Math.max(0, Math.min(4, i43));
                            int max2 = Math.max(0, Math.min(length - 4, i43));
                            long j6 = jArr2[0];
                            if (j6 > j5 || j5 >= jArr2[max] || jArr2[max2] >= zzs2 || zzs2 > j2) {
                                i21 = i42;
                            } else {
                                long zzs3 = zzfy.zzs(j5 - j6, zzajmVar2.zzf.zzA, zzajmVar2.zzc, RoundingMode.FLOOR);
                                i21 = i42;
                                long zzs4 = zzfy.zzs(j2 - zzs2, zzajmVar2.zzf.zzA, zzajmVar2.zzc, RoundingMode.FLOOR);
                                if (zzs3 == 0) {
                                    if (zzs4 != 0) {
                                        zzs3 = 0;
                                    }
                                }
                                if (zzs3 <= 2147483647L && zzs4 <= 2147483647L) {
                                    zzadkVar.zza = (int) zzs3;
                                    zzadkVar.zzb = (int) zzs4;
                                    zzfy.zzE(jArr2, 1000000L, zzajmVar2.zzc);
                                    return new zzajp(zzajmVar, jArr4, iArr4, i16, jArr2, iArr3, zzfy.zzs(zzajmVar2.zzh[0], 1000000L, zzajmVar2.zzd, RoundingMode.FLOOR));
                                }
                            }
                        } else {
                            i21 = i17;
                        }
                        long[] jArr12 = zzajmVar2.zzh;
                        int length2 = jArr12.length;
                        if (length2 == 1) {
                            if (jArr12[0] == 0) {
                                long[] jArr13 = zzajmVar2.zzi;
                                jArr13.getClass();
                                long j7 = jArr13[0];
                                for (int i44 = 0; i44 < jArr2.length; i44++) {
                                    jArr2[i44] = zzfy.zzs(jArr2[i44] - j7, 1000000L, zzajmVar2.zzc, RoundingMode.FLOOR);
                                }
                                return new zzajp(zzajmVar, jArr4, iArr4, i16, jArr2, iArr3, zzfy.zzs(j2 - j7, 1000000L, zzajmVar2.zzc, RoundingMode.FLOOR));
                            }
                            length2 = 1;
                        }
                        boolean z5 = zzajmVar2.zzb == 1;
                        long[] jArr14 = zzajmVar2.zzi;
                        int[] iArr10 = new int[length2];
                        int[] iArr11 = new int[length2];
                        jArr14.getClass();
                        int i45 = 0;
                        boolean z6 = false;
                        int i46 = 0;
                        int i47 = 0;
                        while (true) {
                            long[] jArr15 = zzajmVar2.zzh;
                            i22 = i16;
                            if (i46 >= jArr15.length) {
                                break;
                            }
                            int[] iArr12 = iArr4;
                            long j8 = jArr14[i46];
                            if (j8 != -1) {
                                i23 = i21;
                                int i48 = i45;
                                boolean z7 = z6;
                                long zzs5 = zzfy.zzs(jArr15[i46], zzajmVar2.zzc, zzajmVar2.zzd, RoundingMode.FLOOR);
                                int i49 = 1;
                                iArr10[i46] = zzfy.zzc(jArr2, j8, true, true);
                                iArr11[i46] = zzfy.zza(jArr2, j8 + zzs5, z5, false);
                                while (true) {
                                    i25 = iArr10[i46];
                                    i26 = iArr11[i46];
                                    if (i25 >= i26 || (iArr3[i25] & i49) != 0) {
                                        break;
                                    }
                                    iArr10[i46] = i25 + 1;
                                    i49 = 1;
                                }
                                i24 = i48 + (i26 - i25);
                                z4 = z7 | (i47 != i25);
                                i47 = i26;
                            } else {
                                z4 = z6;
                                i23 = i21;
                                i24 = i45;
                            }
                            i46++;
                            i16 = i22;
                            i45 = i24;
                            iArr4 = iArr12;
                            i21 = i23;
                            z6 = z4;
                        }
                        int[] iArr13 = iArr4;
                        boolean z8 = z6;
                        int i50 = i45;
                        int i51 = 0;
                        boolean z9 = z8 | (i50 != i21);
                        long[] jArr16 = z9 ? new long[i50] : jArr4;
                        int[] iArr14 = z9 ? new int[i50] : iArr13;
                        int i52 = true == z9 ? 0 : i22;
                        int[] iArr15 = z9 ? new int[i50] : iArr3;
                        long[] jArr17 = new long[i50];
                        int i53 = i52;
                        int i54 = 0;
                        long j9 = 0;
                        while (i51 < zzajmVar2.zzh.length) {
                            long j10 = zzajmVar2.zzi[i51];
                            int i55 = iArr10[i51];
                            int[] iArr16 = iArr10;
                            int i56 = iArr11[i51];
                            int[] iArr17 = iArr11;
                            if (z9) {
                                int i57 = i56 - i55;
                                System.arraycopy(jArr4, i55, jArr16, i54, i57);
                                jArr6 = jArr4;
                                iArr5 = iArr13;
                                System.arraycopy(iArr5, i55, iArr14, i54, i57);
                                System.arraycopy(iArr3, i55, iArr15, i54, i57);
                            } else {
                                jArr6 = jArr4;
                                iArr5 = iArr13;
                            }
                            int i58 = i53;
                            while (i55 < i56) {
                                int i59 = i56;
                                int i60 = i51;
                                long zzs6 = zzfy.zzs(j9, 1000000L, zzajmVar2.zzd, RoundingMode.FLOOR);
                                long[] jArr18 = jArr2;
                                int[] iArr18 = iArr3;
                                long zzs7 = zzfy.zzs(jArr2[i55] - j10, 1000000L, zzajmVar2.zzc, RoundingMode.FLOOR);
                                int[] iArr19 = iArr15;
                                long[] jArr19 = jArr16;
                                if (zzajmVar2.zzb != 1) {
                                    iArr6 = iArr14;
                                    zzs7 = Math.max(0L, zzs7);
                                } else {
                                    iArr6 = iArr14;
                                }
                                jArr17[i54] = zzs6 + zzs7;
                                if (z9 && iArr6[i54] > i58) {
                                    i58 = iArr5[i55];
                                }
                                i54++;
                                i55++;
                                i56 = i59;
                                iArr14 = iArr6;
                                i51 = i60;
                                jArr2 = jArr18;
                                iArr3 = iArr18;
                                iArr15 = iArr19;
                                jArr16 = jArr19;
                            }
                            int i61 = i51;
                            j9 += zzajmVar2.zzh[i61];
                            i51 = i61 + 1;
                            i53 = i58;
                            iArr13 = iArr5;
                            iArr14 = iArr14;
                            iArr10 = iArr16;
                            jArr2 = jArr2;
                            iArr11 = iArr17;
                            jArr4 = jArr6;
                            iArr15 = iArr15;
                            jArr16 = jArr16;
                        }
                        return new zzajp(zzajmVar, jArr16, iArr14, i53, jArr17, iArr15, zzfy.zzs(j9, 1000000L, zzajmVar2.zzd, RoundingMode.FLOOR));
                    }
                    zzp = 0;
                }
                jArr = new long[zzb3];
                iArr = new int[zzb3];
                jArr2 = new long[zzb3];
                int[] iArr20 = new int[zzb3];
                int i62 = zzp;
                i4 = 0;
                i5 = 0;
                int i63 = 0;
                i6 = 0;
                int i64 = 0;
                j = 0;
                long j11 = 0;
                while (true) {
                    if (i4 < zzb3) {
                        i7 = zzp2;
                        i8 = i64;
                        i9 = i6;
                        break;
                    }
                    boolean z10 = true;
                    while (true) {
                        if (i5 != 0) {
                            i18 = zzb3;
                            i7 = zzp2;
                            i19 = zzp3;
                            i20 = i5;
                            break;
                        }
                        z10 = zzaipVar.zza();
                        if (!z10) {
                            i18 = zzb3;
                            i7 = zzp2;
                            i19 = zzp3;
                            i20 = 0;
                            break;
                        }
                        int i65 = zzp2;
                        long j12 = zzaipVar.zzd;
                        i5 = zzaipVar.zzc;
                        j = j12;
                        zzp2 = i65;
                        zzp3 = zzp3;
                        zzb3 = zzb3;
                    }
                    if (!z10) {
                        zzff.zzf("AtomParsers", "Unexpected end of chunk data");
                        jArr = Arrays.copyOf(jArr, i4);
                        iArr = Arrays.copyOf(iArr, i4);
                        jArr2 = Arrays.copyOf(jArr2, i4);
                        iArr20 = Arrays.copyOf(iArr20, i4);
                        zzb3 = i4;
                        i9 = i6;
                        i8 = i64;
                        break;
                    }
                    if (zzfpVar2 != null) {
                        while (true) {
                            if (i63 != 0) {
                                break;
                            }
                            if (i <= 0) {
                                i63 = 0;
                                break;
                            }
                            i--;
                            i63 = zzfpVar2.zzp();
                            i6 = zzfpVar2.zzg();
                        }
                        i63--;
                    }
                    int i66 = i6;
                    jArr[i4] = j;
                    int zzc = zzaiuVar.zzc();
                    iArr[i4] = zzc;
                    int i67 = i64;
                    i64 = zzc > i67 ? zzc : i67;
                    jArr2[i4] = j11 + i66;
                    iArr20[i4] = zzfpVar == null ? 1 : 0;
                    if (i4 == i3) {
                        iArr20[i4] = 1;
                        i2--;
                        if (i2 > 0) {
                            zzfpVar.getClass();
                            i3 = zzfpVar.zzp() - 1;
                        }
                    }
                    int i68 = i3;
                    long[] jArr20 = jArr2;
                    zzp3 = i19;
                    j11 += zzp3;
                    int i69 = i7 - 1;
                    if (i69 == 0) {
                        if (i62 > 0) {
                            i69 = zzfpVar3.zzp();
                            i62--;
                            zzp3 = zzfpVar3.zzg();
                        } else {
                            i69 = 0;
                        }
                    }
                    int[] iArr21 = iArr;
                    j += iArr[i4];
                    int i70 = i20 - 1;
                    i4++;
                    i6 = i66;
                    jArr2 = jArr20;
                    jArr = jArr;
                    zzb3 = i18;
                    zzp2 = i69;
                    i3 = i68;
                    i5 = i70;
                    iArr = iArr21;
                }
                long j13 = j11 + i9;
                if (zzfpVar2 != null) {
                    while (i > 0) {
                        if (zzfpVar2.zzp() != 0) {
                            z2 = false;
                            break;
                        }
                        zzfpVar2.zzg();
                        i--;
                    }
                }
                z2 = true;
                if (i2 != 0) {
                    if (i7 == 0) {
                        if (i5 != 0) {
                            i14 = 0;
                            zzajmVar2 = zzajmVar;
                            z3 = z2;
                            jArr3 = jArr;
                            i11 = i5;
                        } else if (i62 != 0) {
                            i14 = 0;
                            i11 = 0;
                            zzajmVar2 = zzajmVar;
                            z3 = z2;
                            jArr3 = jArr;
                        } else if (i63 != 0) {
                            i14 = 0;
                            i11 = 0;
                            i12 = 0;
                            zzajmVar2 = zzajmVar;
                            z3 = z2;
                            jArr3 = jArr;
                            i13 = i63;
                        } else if (z2) {
                            zzajmVar2 = zzajmVar;
                            jArr3 = jArr;
                            iArr2 = iArr;
                            i15 = zzb3;
                            jArr4 = jArr3;
                            iArr3 = iArr20;
                            i16 = i8;
                            iArr4 = iArr2;
                            i17 = i15;
                            j2 = j13;
                            long zzs8 = zzfy.zzs(j2, 1000000L, zzajmVar2.zzc, RoundingMode.FLOOR);
                            jArr5 = zzajmVar2.zzh;
                            if (jArr5 != null) {
                            }
                        } else {
                            i10 = 0;
                            i14 = 0;
                            z3 = false;
                            i11 = 0;
                            i12 = 0;
                            i13 = 0;
                            zzajmVar2 = zzajmVar;
                            jArr3 = jArr;
                        }
                        i12 = i62;
                        i13 = i63;
                    } else {
                        zzajmVar2 = zzajmVar;
                        z3 = z2;
                        jArr3 = jArr;
                        i11 = i5;
                        i12 = i62;
                        i13 = i63;
                        i14 = i7;
                    }
                    i10 = 0;
                } else {
                    z3 = z2;
                    jArr3 = jArr;
                    i10 = i2;
                    i11 = i5;
                    i12 = i62;
                    i13 = i63;
                    i14 = i7;
                    zzajmVar2 = zzajmVar;
                }
                int i71 = zzajmVar2.zza;
                iArr2 = iArr;
                i15 = zzb3;
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                sb.append(i71);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i10);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i14);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i11);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i12);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i13);
                sb.append(true == z3 ? ", ctts invalid" : "");
                zzff.zzf("AtomParsers", sb.toString());
                jArr4 = jArr3;
                iArr3 = iArr20;
                i16 = i8;
                iArr4 = iArr2;
                i17 = i15;
                j2 = j13;
                long zzs82 = zzfy.zzs(j2, 1000000L, zzajmVar2.zzc, RoundingMode.FLOOR);
                jArr5 = zzajmVar2.zzh;
                if (jArr5 != null) {
                }
            } else {
                zzfpVar = null;
            }
        } else {
            i2 = 0;
        }
        i3 = -1;
        zza2 = zzaiuVar.zza();
        String str2 = zzajmVar.zzf.zzm;
        if (zza2 != -1) {
            if (i != 0) {
            }
            zzp = 0;
        }
        jArr = new long[zzb3];
        iArr = new int[zzb3];
        jArr2 = new long[zzb3];
        int[] iArr202 = new int[zzb3];
        int i622 = zzp;
        i4 = 0;
        i5 = 0;
        int i632 = 0;
        i6 = 0;
        int i642 = 0;
        j = 0;
        long j112 = 0;
        while (true) {
            if (i4 < zzb3) {
            }
            int[] iArr212 = iArr;
            j += iArr[i4];
            int i702 = i20 - 1;
            i4++;
            i6 = i66;
            jArr2 = jArr20;
            jArr = jArr;
            zzb3 = i18;
            zzp2 = i69;
            i3 = i68;
            i5 = i702;
            iArr = iArr212;
        }
        long j132 = j112 + i9;
        if (zzfpVar2 != null) {
        }
        z2 = true;
        if (i2 != 0) {
        }
        int i712 = zzajmVar2.zza;
        iArr2 = iArr;
        i15 = zzb3;
        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
        sb2.append(i712);
        sb2.append(": remainingSynchronizationSamples ");
        sb2.append(i10);
        sb2.append(", remainingSamplesAtTimestampDelta ");
        sb2.append(i14);
        sb2.append(", remainingSamplesInChunk ");
        sb2.append(i11);
        sb2.append(", remainingTimestampDeltaChanges ");
        sb2.append(i12);
        sb2.append(", remainingSamplesAtTimestampOffset ");
        sb2.append(i13);
        sb2.append(true == z3 ? ", ctts invalid" : "");
        zzff.zzf("AtomParsers", sb2.toString());
        jArr4 = jArr3;
        iArr3 = iArr202;
        i16 = i8;
        iArr4 = iArr2;
        i17 = i15;
        j2 = j132;
        long zzs822 = zzfy.zzs(j2, 1000000L, zzajmVar2.zzc, RoundingMode.FLOOR);
        jArr5 = zzajmVar2.zzh;
        if (jArr5 != null) {
        }
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzm(zzfp zzfpVar, int i, int i2, int i3, int i4, String str, boolean z, zzae zzaeVar, zzais zzaisVar, int i5) throws zzcc {
        int i6;
        int zzn;
        int zzg;
        int i7;
        int i8;
        zzae zzaeVar2;
        String str2;
        int i9;
        long j;
        long j2;
        int i10;
        String str3;
        int i11;
        int i12;
        int i13;
        String str4;
        byte[] bArr;
        String str5;
        int i14;
        String str6;
        boolean z2;
        boolean z3;
        zzfp zzfpVar2 = zzfpVar;
        int i15 = i2;
        int i16 = i3;
        zzfpVar2.zzK(i15 + 16);
        if (z) {
            i6 = zzfpVar.zzq();
            zzfpVar2.zzL(6);
        } else {
            zzfpVar2.zzL(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int zzq = zzfpVar.zzq();
            zzfpVar2.zzL(6);
            zzn = zzfpVar.zzn();
            zzfpVar2.zzK(zzfpVar.zzd() - 4);
            zzg = zzfpVar.zzg();
            if (i6 == 1) {
                zzfpVar2.zzL(16);
            }
            i7 = zzq;
            i8 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            zzfpVar2.zzL(16);
            zzn = (int) Math.round(Double.longBitsToDouble(zzfpVar.zzt()));
            i7 = zzfpVar.zzp();
            zzfpVar2.zzL(4);
            int zzp = zzfpVar.zzp();
            int zzp2 = zzfpVar.zzp();
            int i17 = zzp2 & 1;
            int i18 = zzp2 & 2;
            if (i17 == 0) {
                if (zzp == 8) {
                    i8 = 3;
                } else if (zzp == 16) {
                    i8 = i18 != 0 ? 268435456 : 2;
                } else if (zzp == 24) {
                    i8 = i18 != 0 ? 1342177280 : 21;
                } else {
                    if (zzp == 32) {
                        i8 = i18 != 0 ? 1610612736 : 22;
                    }
                    i8 = -1;
                }
                zzfpVar2.zzL(8);
                zzg = 0;
            } else {
                if (zzp == 32) {
                    i8 = 4;
                    zzfpVar2.zzL(8);
                    zzg = 0;
                }
                i8 = -1;
                zzfpVar2.zzL(8);
                zzg = 0;
            }
        }
        int zzd = zzfpVar.zzd();
        int i19 = 1701733217;
        int i20 = i;
        if (i20 == 1701733217) {
            Pair zzh = zzh(zzfpVar2, i15, i16);
            if (zzh != null) {
                i19 = ((Integer) zzh.first).intValue();
                zzaeVar2 = zzaeVar == null ? null : zzaeVar.zzb(((zzajn) zzh.second).zzb);
                zzaisVar.zza[i5] = (zzajn) zzh.second;
            } else {
                zzaeVar2 = zzaeVar;
            }
            zzfpVar2.zzK(zzd);
            i20 = i19;
        } else {
            zzaeVar2 = zzaeVar;
        }
        String str7 = "audio/mhm1";
        if (i20 == 1633889587) {
            str2 = "audio/ac3";
        } else {
            if (i20 != 1700998451) {
                if (i20 == 1633889588) {
                    i9 = i8;
                    str2 = "audio/ac4";
                } else if (i20 == 1685353315) {
                    str2 = "audio/vnd.dts";
                } else if (i20 == 1685353320 || i20 == 1685353324) {
                    str2 = "audio/vnd.dts.hd";
                } else if (i20 == 1685353317) {
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                } else if (i20 == 1685353336) {
                    str2 = "audio/vnd.dts.uhd;profile=p2";
                } else if (i20 == 1935764850) {
                    str2 = "audio/3gpp";
                } else if (i20 == 1935767394) {
                    str2 = "audio/amr-wb";
                } else {
                    if (i20 != 1936684916) {
                        if (i20 == 1953984371) {
                            str2 = "audio/raw";
                            i9 = 268435456;
                        } else if (i20 == 1819304813) {
                            if (i8 != -1) {
                                i9 = i8;
                                str2 = "audio/raw";
                            }
                        } else if (i20 == 778924082 || i20 == 778924083) {
                            str2 = "audio/mpeg";
                        } else if (i20 == 1835557169) {
                            str2 = "audio/mha1";
                        } else if (i20 == 1835560241) {
                            i9 = i8;
                            str2 = "audio/mhm1";
                        } else if (i20 == 1634492771) {
                            str2 = "audio/alac";
                        } else if (i20 == 1634492791) {
                            str2 = "audio/g711-alaw";
                        } else if (i20 == 1970037111) {
                            str2 = "audio/g711-mlaw";
                        } else if (i20 == 1332770163) {
                            str2 = "audio/opus";
                        } else if (i20 == 1716281667) {
                            str2 = "audio/flac";
                        } else if (i20 == 1835823201) {
                            str2 = "audio/true-hd";
                        } else {
                            i9 = i8;
                            str2 = null;
                        }
                    }
                    str2 = "audio/raw";
                    i9 = 2;
                }
                int i21 = i9;
                String str8 = null;
                List list = null;
                zzaiq zzaiqVar = null;
                while (zzd - i15 < i16) {
                    zzfpVar2.zzK(zzd);
                    int zzg2 = zzfpVar.zzg();
                    String str9 = "childAtomSize must be positive";
                    zzacy.zzb(zzg2 > 0, "childAtomSize must be positive");
                    int zzg3 = zzfpVar.zzg();
                    int i22 = zzn;
                    if (zzg3 == 1835557187) {
                        zzfpVar2.zzK(zzd + 8);
                        zzfpVar2.zzL(1);
                        int zzm = zzfpVar.zzm();
                        zzfpVar2.zzL(1);
                        String format = Objects.equals(str2, str7) ? String.format("mhm1.%02X", Integer.valueOf(zzm)) : String.format("mha1.%02X", Integer.valueOf(zzm));
                        int zzq2 = zzfpVar.zzq();
                        byte[] bArr2 = new byte[zzq2];
                        str8 = format;
                        zzfpVar2.zzG(bArr2, 0, zzq2);
                        if (list == null) {
                            list = zzgaa.zzm(bArr2);
                            str5 = str8;
                            zzn = i22;
                            i13 = zzg;
                            str3 = str7;
                            zzd += zzg2;
                            i15 = i2;
                            i16 = i3;
                            str8 = str5;
                            zzg = i13;
                            str7 = str3;
                            zzfpVar2 = zzfpVar;
                        } else {
                            list = zzgaa.zzn(bArr2, (byte[]) list.get(0));
                            str5 = str8;
                            zzn = i22;
                            i13 = zzg;
                            str3 = str7;
                        }
                    } else {
                        if (zzg3 == 1835557200) {
                            zzfpVar2.zzK(zzd + 8);
                            int zzm2 = zzfpVar.zzm();
                            if (zzm2 > 0) {
                                byte[] bArr3 = new byte[zzm2];
                                zzfpVar2.zzG(bArr3, 0, zzm2);
                                if (list == null) {
                                    list = zzgaa.zzm(bArr3);
                                    str5 = str8;
                                    i13 = zzg;
                                    str3 = str7;
                                    zzn = i22;
                                    zzd += zzg2;
                                    i15 = i2;
                                    i16 = i3;
                                    str8 = str5;
                                    zzg = i13;
                                    str7 = str3;
                                    zzfpVar2 = zzfpVar;
                                } else {
                                    list = zzgaa.zzn((byte[]) list.get(0), bArr3);
                                    str5 = str8;
                                    zzn = i22;
                                    i13 = zzg;
                                    str3 = str7;
                                }
                            } else {
                                i10 = i22;
                                i13 = zzg;
                                str3 = str7;
                            }
                        } else {
                            if (zzg3 == 1702061171) {
                                i10 = i22;
                                str3 = str7;
                                i11 = zzd;
                                i12 = -1;
                            } else if (z && zzg3 == 2002876005) {
                                int zzd2 = zzfpVar.zzd();
                                if (zzd2 >= zzd) {
                                    i14 = zzd2;
                                    str6 = null;
                                    z2 = true;
                                } else {
                                    i14 = zzd2;
                                    str6 = null;
                                    z2 = false;
                                }
                                zzacy.zzb(z2, str6);
                                i11 = i14;
                                while (true) {
                                    if (i11 - zzd >= zzg2) {
                                        str3 = str7;
                                        i10 = i22;
                                        i11 = -1;
                                        break;
                                    }
                                    zzfpVar2.zzK(i11);
                                    int zzg4 = zzfpVar.zzg();
                                    if (zzg4 > 0) {
                                        str3 = str7;
                                        z3 = true;
                                    } else {
                                        str3 = str7;
                                        z3 = false;
                                    }
                                    zzacy.zzb(z3, str9);
                                    String str10 = str9;
                                    if (zzfpVar.zzg() == 1702061171) {
                                        i10 = i22;
                                        break;
                                    } else {
                                        i11 += zzg4;
                                        str7 = str3;
                                        str9 = str10;
                                    }
                                }
                                i12 = -1;
                            } else {
                                str3 = str7;
                                if (zzg3 == 1684103987) {
                                    zzfpVar2.zzK(zzd + 8);
                                    zzaisVar.zzb = zzabv.zzc(zzfpVar2, Integer.toString(i4), str, zzaeVar2);
                                } else if (zzg3 == 1684366131) {
                                    zzfpVar2.zzK(zzd + 8);
                                    zzaisVar.zzb = zzabv.zzd(zzfpVar2, Integer.toString(i4), str, zzaeVar2);
                                } else if (zzg3 == 1684103988) {
                                    zzfpVar2.zzK(zzd + 8);
                                    String num = Integer.toString(i4);
                                    int i23 = zzaby.zza;
                                    zzfpVar2.zzL(1);
                                    int zzm3 = zzfpVar.zzm() & 32;
                                    zzak zzakVar = new zzak();
                                    zzakVar.zzK(num);
                                    zzakVar.zzW("audio/ac4");
                                    zzakVar.zzy(2);
                                    zzakVar.zzX(1 != (zzm3 >> 5) ? 44100 : 48000);
                                    zzakVar.zzE(zzaeVar2);
                                    zzakVar.zzN(str);
                                    zzaisVar.zzb = zzakVar.zzac();
                                } else if (zzg3 != 1684892784) {
                                    if (zzg3 == 1684305011 || zzg3 == 1969517683) {
                                        zzak zzakVar2 = new zzak();
                                        zzakVar2.zzJ(i4);
                                        zzakVar2.zzW(str2);
                                        zzakVar2.zzy(i7);
                                        i10 = i22;
                                        zzakVar2.zzX(i10);
                                        zzakVar2.zzE(zzaeVar2);
                                        zzakVar2.zzN(str);
                                        zzaisVar.zzb = zzakVar2.zzac();
                                    } else if (zzg3 == 1682927731) {
                                        int i24 = zzg2 - 8;
                                        byte[] bArr4 = zza;
                                        byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i24);
                                        zzfpVar2.zzK(zzd + 8);
                                        zzfpVar2.zzG(copyOf, bArr4.length, i24);
                                        list = zzadq.zze(copyOf);
                                        str5 = str8;
                                        zzn = i22;
                                        i13 = zzg;
                                    } else {
                                        if (zzg3 == 1684425825) {
                                            byte[] bArr5 = new byte[zzg2 - 8];
                                            bArr5[0] = 102;
                                            bArr5[1] = 76;
                                            bArr5[2] = 97;
                                            bArr5[3] = 67;
                                            zzfpVar2.zzK(zzd + 12);
                                            zzfpVar2.zzG(bArr5, 4, zzg2 - 12);
                                            list = zzgaa.zzm(bArr5);
                                            str5 = str8;
                                            zzn = i22;
                                        } else if (zzg3 == 1634492771) {
                                            int i25 = zzg2 - 12;
                                            byte[] bArr6 = new byte[i25];
                                            zzfpVar2.zzK(zzd + 12);
                                            zzfpVar2.zzG(bArr6, 0, i25);
                                            int i26 = zzem.zza;
                                            zzfp zzfpVar3 = new zzfp(bArr6);
                                            zzfpVar3.zzK(9);
                                            int zzm4 = zzfpVar3.zzm();
                                            zzfpVar3.zzK(20);
                                            Pair create = Pair.create(Integer.valueOf(zzfpVar3.zzp()), Integer.valueOf(zzm4));
                                            int intValue = ((Integer) create.first).intValue();
                                            int intValue2 = ((Integer) create.second).intValue();
                                            list = zzgaa.zzm(bArr6);
                                            str5 = str8;
                                            i7 = intValue2;
                                            zzn = intValue;
                                        } else {
                                            i10 = i22;
                                        }
                                        i13 = zzg;
                                        zzd += zzg2;
                                        i15 = i2;
                                        i16 = i3;
                                        str8 = str5;
                                        zzg = i13;
                                        str7 = str3;
                                        zzfpVar2 = zzfpVar;
                                    }
                                    i13 = zzg;
                                } else {
                                    if (zzg <= 0) {
                                        throw zzcc.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + zzg, null);
                                    }
                                    str5 = str8;
                                    zzn = zzg;
                                    i13 = zzn;
                                    i7 = 2;
                                }
                                i10 = i22;
                                i13 = zzg;
                            }
                            if (i11 != i12) {
                                zzaiqVar = zzj(zzfpVar2, i11);
                                str4 = zzaiqVar.zza;
                                bArr = zzaiqVar.zzb;
                                if (bArr == null) {
                                    i13 = zzg;
                                } else if ("audio/vorbis".equals(str4)) {
                                    zzfp zzfpVar4 = new zzfp(bArr);
                                    zzfpVar4.zzL(1);
                                    int i27 = 0;
                                    while (zzfpVar4.zzb() > 0 && zzfpVar4.zzf() == 255) {
                                        zzfpVar4.zzL(1);
                                        i27 += 255;
                                    }
                                    int zzm5 = i27 + zzfpVar4.zzm();
                                    int i28 = 0;
                                    while (true) {
                                        if (zzfpVar4.zzb() <= 0) {
                                            i13 = zzg;
                                            break;
                                        }
                                        i13 = zzg;
                                        if (zzfpVar4.zzf() != 255) {
                                            break;
                                        }
                                        zzfpVar4.zzL(1);
                                        i28 += 255;
                                        zzg = i13;
                                    }
                                    int zzm6 = i28 + zzfpVar4.zzm();
                                    byte[] bArr7 = new byte[zzm5];
                                    int zzd3 = zzfpVar4.zzd();
                                    System.arraycopy(bArr, zzd3, bArr7, 0, zzm5);
                                    int i29 = zzd3 + zzm5 + zzm6;
                                    int length = bArr.length - i29;
                                    byte[] bArr8 = new byte[length];
                                    System.arraycopy(bArr, i29, bArr8, 0, length);
                                    list = zzgaa.zzn(bArr7, bArr8);
                                } else {
                                    i13 = zzg;
                                    if ("audio/mp4a-latm".equals(str4)) {
                                        zzabr zza2 = zzabs.zza(bArr);
                                        zzn = zza2.zza;
                                        i7 = zza2.zzb;
                                        str5 = zza2.zzc;
                                    } else {
                                        str5 = str8;
                                        zzn = i10;
                                    }
                                    list = zzgaa.zzm(bArr);
                                    str2 = str4;
                                    zzd += zzg2;
                                    i15 = i2;
                                    i16 = i3;
                                    str8 = str5;
                                    zzg = i13;
                                    str7 = str3;
                                    zzfpVar2 = zzfpVar;
                                }
                                str5 = str8;
                                str2 = str4;
                                zzn = i10;
                                zzd += zzg2;
                                i15 = i2;
                                i16 = i3;
                                str8 = str5;
                                zzg = i13;
                                str7 = str3;
                                zzfpVar2 = zzfpVar;
                            }
                            i13 = zzg;
                        }
                        str5 = str8;
                        zzn = i10;
                        zzd += zzg2;
                        i15 = i2;
                        i16 = i3;
                        str8 = str5;
                        zzg = i13;
                        str7 = str3;
                        zzfpVar2 = zzfpVar;
                    }
                    zzd += zzg2;
                    i15 = i2;
                    i16 = i3;
                    str8 = str5;
                    zzg = i13;
                    str7 = str3;
                    zzfpVar2 = zzfpVar;
                }
                int i30 = zzn;
                if (zzaisVar.zzb == null || str2 == null) {
                }
                zzak zzakVar3 = new zzak();
                zzakVar3.zzJ(i4);
                zzakVar3.zzW(str2);
                zzakVar3.zzz(str8);
                zzakVar3.zzy(i7);
                zzakVar3.zzX(i30);
                zzakVar3.zzQ(i21);
                zzakVar3.zzL(list);
                zzakVar3.zzE(zzaeVar2);
                zzakVar3.zzN(str);
                if (zzaiqVar != null) {
                    j = zzaiqVar.zzc;
                    zzakVar3.zzx(zzgcu.zzc(j));
                    j2 = zzaiqVar.zzd;
                    zzakVar3.zzR(zzgcu.zzc(j2));
                }
                zzaisVar.zzb = zzakVar3.zzac();
                return;
            }
            str2 = "audio/eac3";
        }
        i9 = i8;
        int i212 = i9;
        String str82 = null;
        List list2 = null;
        zzaiq zzaiqVar2 = null;
        while (zzd - i15 < i16) {
        }
        int i302 = zzn;
        if (zzaisVar.zzb == null) {
        }
    }
}
