package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzanl implements zzamy {
    private final String zza;
    private final zzfp zzb;
    private final zzfo zzc;
    private zzaea zzd;
    private String zze;
    private zzam zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzanl(String str) {
        this.zza = str;
        zzfp zzfpVar = new zzfp(1024);
        this.zzb = zzfpVar;
        byte[] zzM = zzfpVar.zzM();
        this.zzc = new zzfo(zzM, zzM.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzfo zzfoVar) throws zzcc {
        int zza = zzfoVar.zza();
        zzabr zzb = zzabs.zzb(zzfoVar, true);
        this.zzu = zzb.zzc;
        this.zzr = zzb.zza;
        this.zzt = zzb.zzb;
        return zza - zzfoVar.zza();
    }

    private static long zzg(zzfo zzfoVar) {
        return zzfoVar.zzd((zzfoVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0154, code lost:
    
        if (r14.zzl == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zzamy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfp zzfpVar) throws zzcc {
        int i;
        int i2;
        int i3;
        boolean zzo;
        zzek.zzb(this.zzd);
        while (zzfpVar.zzb() > 0) {
            int i4 = this.zzg;
            if (i4 != 0) {
                if (i4 == 1) {
                    int zzm = zzfpVar.zzm();
                    if ((zzm & 224) == 224) {
                        this.zzj = zzm;
                        this.zzg = 2;
                    } else if (zzm != 86) {
                        this.zzg = 0;
                    }
                } else if (i4 != 2) {
                    int min = Math.min(zzfpVar.zzb(), this.zzi - this.zzh);
                    zzfpVar.zzG(this.zzc.zza, this.zzh, min);
                    int i5 = this.zzh + min;
                    this.zzh = i5;
                    if (i5 == this.zzi) {
                        this.zzc.zzk(0);
                        zzfo zzfoVar = this.zzc;
                        if (!zzfoVar.zzo()) {
                            this.zzl = true;
                            int zzd = zzfoVar.zzd(1);
                            if (zzd == 1) {
                                i3 = zzfoVar.zzd(1);
                                i2 = 1;
                            } else {
                                i2 = zzd;
                                i3 = 0;
                            }
                            this.zzm = i3;
                            if (i3 != 0) {
                                throw zzcc.zza(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzfoVar);
                                i2 = 1;
                            }
                            if (!zzfoVar.zzo()) {
                                throw zzcc.zza(null, null);
                            }
                            this.zzn = zzfoVar.zzd(6);
                            int zzd2 = zzfoVar.zzd(4);
                            int zzd3 = zzfoVar.zzd(3);
                            if (zzd2 != 0 || zzd3 != 0) {
                                throw zzcc.zza(null, null);
                            }
                            if (i2 == 0) {
                                int zzc = zzfoVar.zzc();
                                int zzf = zzf(zzfoVar);
                                zzfoVar.zzk(zzc);
                                byte[] bArr = new byte[(zzf + 7) / 8];
                                zzfoVar.zzg(bArr, 0, zzf);
                                zzak zzakVar = new zzak();
                                zzakVar.zzK(this.zze);
                                zzakVar.zzW("audio/mp4a-latm");
                                zzakVar.zzz(this.zzu);
                                zzakVar.zzy(this.zzt);
                                zzakVar.zzX(this.zzr);
                                zzakVar.zzL(Collections.singletonList(bArr));
                                zzakVar.zzN(this.zza);
                                zzam zzac = zzakVar.zzac();
                                if (!zzac.equals(this.zzf)) {
                                    this.zzf = zzac;
                                    this.zzs = 1024000000 / zzac.zzA;
                                    this.zzd.zzl(zzac);
                                }
                            } else {
                                zzfoVar.zzm(((int) zzg(zzfoVar)) - zzf(zzfoVar));
                            }
                            int zzd4 = zzfoVar.zzd(3);
                            this.zzo = zzd4;
                            if (zzd4 == 0) {
                                zzfoVar.zzm(8);
                            } else if (zzd4 == 1) {
                                zzfoVar.zzm(9);
                            } else if (zzd4 == 3 || zzd4 == 4 || zzd4 == 5) {
                                zzfoVar.zzm(6);
                            } else {
                                if (zzd4 != 6 && zzd4 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzfoVar.zzm(1);
                            }
                            boolean zzo2 = zzfoVar.zzo();
                            this.zzp = zzo2;
                            this.zzq = 0L;
                            if (zzo2) {
                                if (i2 != 1) {
                                    do {
                                        zzo = zzfoVar.zzo();
                                        this.zzq = (this.zzq << 8) + zzfoVar.zzd(8);
                                    } while (zzo);
                                } else {
                                    this.zzq = zzg(zzfoVar);
                                }
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(8);
                            }
                        }
                        if (this.zzm != 0) {
                            throw zzcc.zza(null, null);
                        }
                        if (this.zzn != 0) {
                            throw zzcc.zza(null, null);
                        }
                        if (this.zzo != 0) {
                            throw zzcc.zza(null, null);
                        }
                        int i6 = 0;
                        while (true) {
                            int zzd5 = zzfoVar.zzd(8);
                            i = i6 + zzd5;
                            if (zzd5 != 255) {
                                break;
                            } else {
                                i6 = i;
                            }
                        }
                        int zzc2 = zzfoVar.zzc();
                        if ((zzc2 & 7) == 0) {
                            this.zzb.zzK(zzc2 >> 3);
                        } else {
                            zzfoVar.zzg(this.zzb.zzM(), 0, i * 8);
                            this.zzb.zzK(0);
                        }
                        this.zzd.zzr(this.zzb, i);
                        zzek.zzf(this.zzk != -9223372036854775807L);
                        this.zzd.zzt(this.zzk, 1, i, 0, null);
                        this.zzk += this.zzs;
                        if (this.zzp) {
                            zzfoVar.zzm((int) this.zzq);
                        }
                        this.zzg = 0;
                    } else {
                        continue;
                    }
                } else {
                    int zzm2 = ((this.zzj & (-225)) << 8) | zzfpVar.zzm();
                    this.zzi = zzm2;
                    zzfp zzfpVar2 = this.zzb;
                    if (zzm2 > zzfpVar2.zzM().length) {
                        zzfpVar2.zzH(zzm2);
                        zzfo zzfoVar2 = this.zzc;
                        byte[] zzM = this.zzb.zzM();
                        zzfoVar2.zzj(zzM, zzM.length);
                    }
                    this.zzh = 0;
                    this.zzg = 3;
                }
            } else if (zzfpVar.zzm() == 86) {
                this.zzg = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzd = zzacxVar.zzw(zzaokVar.zza(), 1);
        this.zze = zzaokVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j, int i) {
        this.zzk = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}
