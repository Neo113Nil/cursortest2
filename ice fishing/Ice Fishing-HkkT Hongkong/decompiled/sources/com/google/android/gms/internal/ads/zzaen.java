package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzaen implements zzacu {
    private int zzc;
    private zzaeo zze;
    private long zzh;
    private zzaeq zzi;
    private int zzm;
    private boolean zzn;
    private final zzfp zza = new zzfp(12);
    private final zzaem zzb = new zzaem(null);
    private zzacx zzd = new zzacs();
    private zzaeq[] zzg = new zzaeq[0];
    private long zzk = -1;
    private long zzl = -1;
    private int zzj = -1;
    private long zzf = -9223372036854775807L;

    private final zzaeq zzf(int i) {
        for (zzaeq zzaeqVar : this.zzg) {
            if (zzaeqVar.zzg(i)) {
                return zzaeqVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzc = 0;
        this.zzd = zzacxVar;
        this.zzh = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j, long j2) {
        this.zzh = -1L;
        this.zzi = null;
        for (zzaeq zzaeqVar : this.zzg) {
            zzaeqVar.zzf(j);
        }
        if (j == 0) {
            this.zzc = this.zzg.length != 0 ? 3 : 0;
        } else {
            this.zzc = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) throws IOException {
        ((zzack) zzacvVar).zzm(this.zza.zzM(), 0, 12, false);
        this.zza.zzK(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzL(4);
        return this.zza.zzi() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) throws IOException {
        boolean z;
        int i;
        int i2;
        zzaeq zzaeqVar;
        long j;
        long j2 = this.zzh;
        int i3 = 0;
        if (j2 != -1) {
            long zzf = zzacvVar.zzf();
            if (j2 < zzf || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + zzf) {
                zzadrVar.zza = j2;
                z = true;
                this.zzh = -1L;
                if (!z) {
                    return 1;
                }
                int i4 = this.zzc;
                zzaeq zzaeqVar2 = null;
                if (i4 == 0) {
                    if (!zze(zzacvVar)) {
                        throw zzcc.zza("AVI Header List not found", null);
                    }
                    ((zzack) zzacvVar).zzo(12, false);
                    this.zzc = 1;
                    return 0;
                }
                if (i4 == 1) {
                    ((zzack) zzacvVar).zzn(this.zza.zzM(), 0, 12, false);
                    this.zza.zzK(0);
                    zzaem zzaemVar = this.zzb;
                    zzfp zzfpVar = this.zza;
                    zzaemVar.zza(zzfpVar);
                    int i5 = zzaemVar.zza;
                    if (i5 != 1414744396) {
                        throw zzcc.zza("LIST expected, found: " + i5, null);
                    }
                    zzaemVar.zzc = zzfpVar.zzi();
                    zzaem zzaemVar2 = this.zzb;
                    int i6 = zzaemVar2.zzc;
                    if (i6 == 1819436136) {
                        this.zzj = zzaemVar2.zzb;
                        this.zzc = 2;
                        return 0;
                    }
                    throw zzcc.zza("hdrl expected, found: " + i6, null);
                }
                if (i4 == 2) {
                    int i7 = this.zzj - 4;
                    zzfp zzfpVar2 = new zzfp(i7);
                    ((zzack) zzacvVar).zzn(zzfpVar2.zzM(), 0, i7, false);
                    zzaer zzc = zzaer.zzc(1819436136, zzfpVar2);
                    if (zzc.zza() != 1819436136) {
                        throw zzcc.zza("Unexpected header list type " + zzc.zza(), null);
                    }
                    zzaeo zzaeoVar = (zzaeo) zzc.zzb(zzaeo.class);
                    if (zzaeoVar == null) {
                        throw zzcc.zza("AviHeader not found", null);
                    }
                    this.zze = zzaeoVar;
                    this.zzf = zzaeoVar.zzc * zzaeoVar.zza;
                    ArrayList arrayList = new ArrayList();
                    zzgaa zzgaaVar = zzc.zza;
                    int size = zzgaaVar.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < size) {
                        zzaej zzaejVar = (zzaej) zzgaaVar.get(i8);
                        if (zzaejVar.zza() == 1819440243) {
                            zzaer zzaerVar = (zzaer) zzaejVar;
                            int i10 = i9 + 1;
                            zzaep zzaepVar = (zzaep) zzaerVar.zzb(zzaep.class);
                            zzaes zzaesVar = (zzaes) zzaerVar.zzb(zzaes.class);
                            if (zzaepVar == null) {
                                zzff.zzf("AviExtractor", "Missing Stream Header");
                            } else if (zzaesVar == null) {
                                zzff.zzf("AviExtractor", "Missing Stream Format");
                            } else {
                                i = i10;
                                long zzs = zzfy.zzs(zzaepVar.zzd, zzaepVar.zzb * 1000000, zzaepVar.zzc, RoundingMode.FLOOR);
                                zzam zzamVar = zzaesVar.zza;
                                zzak zzb = zzamVar.zzb();
                                zzb.zzJ(i9);
                                int i11 = zzaepVar.zze;
                                if (i11 != 0) {
                                    zzb.zzO(i11);
                                }
                                zzaet zzaetVar = (zzaet) zzaerVar.zzb(zzaet.class);
                                if (zzaetVar != null) {
                                    zzb.zzM(zzaetVar.zza);
                                }
                                int zzb2 = zzcb.zzb(zzamVar.zzm);
                                if (zzb2 == 1) {
                                    i2 = zzb2;
                                } else if (zzb2 == 2) {
                                    i2 = 2;
                                } else {
                                    zzaeqVar = null;
                                    if (zzaeqVar != null) {
                                        arrayList.add(zzaeqVar);
                                    }
                                    i9 = i;
                                }
                                zzaea zzw = this.zzd.zzw(i9, i2);
                                zzw.zzl(zzb.zzac());
                                zzaeqVar = new zzaeq(i9, i2, zzs, zzaepVar.zzd, zzw);
                                this.zzf = zzs;
                                if (zzaeqVar != null) {
                                }
                                i9 = i;
                            }
                            zzaeqVar = zzaeqVar2;
                            i = i10;
                            if (zzaeqVar != null) {
                            }
                            i9 = i;
                        }
                        i8++;
                        zzaeqVar2 = null;
                        i3 = 0;
                    }
                    int i12 = i3;
                    this.zzg = (zzaeq[]) arrayList.toArray(new zzaeq[i12]);
                    this.zzd.zzD();
                    this.zzc = 3;
                    return i12;
                }
                if (i4 == 3) {
                    long j3 = this.zzk;
                    if (j3 != -1 && zzacvVar.zzf() != j3) {
                        this.zzh = j3;
                        return 0;
                    }
                    zzack zzackVar = (zzack) zzacvVar;
                    zzackVar.zzm(this.zza.zzM(), 0, 12, false);
                    zzacvVar.zzj();
                    this.zza.zzK(0);
                    this.zzb.zza(this.zza);
                    zzfp zzfpVar3 = this.zza;
                    zzaem zzaemVar3 = this.zzb;
                    int zzi = zzfpVar3.zzi();
                    int i13 = zzaemVar3.zza;
                    if (i13 == 1179011410) {
                        zzackVar.zzo(12, false);
                        return 0;
                    }
                    if (i13 != 1414744396 || zzi != 1769369453) {
                        this.zzh = zzacvVar.zzf() + zzaemVar3.zzb + 8;
                        return 0;
                    }
                    long zzf2 = zzacvVar.zzf();
                    this.zzk = zzf2;
                    long j4 = zzf2 + zzaemVar3.zzb + 8;
                    this.zzl = j4;
                    if (!this.zzn) {
                        zzaeo zzaeoVar2 = this.zze;
                        zzaeoVar2.getClass();
                        if ((zzaeoVar2.zzb & 16) == 16) {
                            this.zzc = 4;
                            this.zzh = j4;
                            return 0;
                        }
                        this.zzd.zzO(new zzadt(this.zzf, 0L));
                        this.zzn = true;
                    }
                    this.zzh = zzacvVar.zzf() + 12;
                    this.zzc = 6;
                    return 0;
                }
                if (i4 == 4) {
                    ((zzack) zzacvVar).zzn(this.zza.zzM(), 0, 8, false);
                    this.zza.zzK(0);
                    zzfp zzfpVar4 = this.zza;
                    int zzi2 = zzfpVar4.zzi();
                    int zzi3 = zzfpVar4.zzi();
                    if (zzi2 == 829973609) {
                        this.zzc = 5;
                        this.zzm = zzi3;
                    } else {
                        this.zzh = zzacvVar.zzf() + zzi3;
                    }
                    return 0;
                }
                if (i4 == 5) {
                    zzfp zzfpVar5 = new zzfp(this.zzm);
                    ((zzack) zzacvVar).zzn(zzfpVar5.zzM(), 0, this.zzm, false);
                    if (zzfpVar5.zzb() < 16) {
                        j = 0;
                    } else {
                        int zzd = zzfpVar5.zzd();
                        zzfpVar5.zzL(8);
                        long zzi4 = zzfpVar5.zzi();
                        long j5 = this.zzk;
                        j = zzi4 > j5 ? 0L : j5 + 8;
                        zzfpVar5.zzK(zzd);
                    }
                    while (zzfpVar5.zzb() >= 16) {
                        int zzi5 = zzfpVar5.zzi();
                        int zzi6 = zzfpVar5.zzi();
                        long zzi7 = zzfpVar5.zzi() + j;
                        zzfpVar5.zzi();
                        zzaeq zzf3 = zzf(zzi5);
                        if (zzf3 != null) {
                            if ((zzi6 & 16) == 16) {
                                zzf3.zzb(zzi7);
                            }
                            zzf3.zzd();
                        }
                    }
                    for (zzaeq zzaeqVar3 : this.zzg) {
                        zzaeqVar3.zzc();
                    }
                    this.zzn = true;
                    this.zzd.zzO(new zzaek(this, this.zzf));
                    this.zzc = 6;
                    this.zzh = this.zzk;
                    return 0;
                }
                if (zzacvVar.zzf() >= this.zzl) {
                    return -1;
                }
                zzaeq zzaeqVar4 = this.zzi;
                if (zzaeqVar4 != null) {
                    if (!zzaeqVar4.zzh(zzacvVar)) {
                        return 0;
                    }
                    this.zzi = null;
                    return 0;
                }
                if ((zzacvVar.zzf() & 1) == 1) {
                    ((zzack) zzacvVar).zzo(1, false);
                }
                zzack zzackVar2 = (zzack) zzacvVar;
                zzackVar2.zzm(this.zza.zzM(), 0, 12, false);
                this.zza.zzK(0);
                int zzi8 = this.zza.zzi();
                if (zzi8 == 1414744396) {
                    this.zza.zzK(8);
                    zzackVar2.zzo(this.zza.zzi() != 1769369453 ? 8 : 12, false);
                    zzacvVar.zzj();
                    return 0;
                }
                int zzi9 = this.zza.zzi();
                if (zzi8 == 1263424842) {
                    this.zzh = zzacvVar.zzf() + zzi9 + 8;
                    return 0;
                }
                zzackVar2.zzo(8, false);
                zzacvVar.zzj();
                zzaeq zzf4 = zzf(zzi8);
                if (zzf4 == null) {
                    this.zzh = zzacvVar.zzf() + zzi9;
                    return 0;
                }
                zzf4.zze(zzi9);
                this.zzi = zzf4;
                return 0;
            }
            ((zzack) zzacvVar).zzo((int) (j2 - zzf), false);
        }
        z = false;
        this.zzh = -1L;
        if (!z) {
        }
    }
}
