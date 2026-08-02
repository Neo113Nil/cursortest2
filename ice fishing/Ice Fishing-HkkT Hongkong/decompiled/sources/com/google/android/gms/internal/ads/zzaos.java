package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzaos implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzaoo
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i = zzada.zza;
            zzadb zzadbVar = zzaos.zza;
            return new zzacu[]{new zzaos()};
        }
    };
    private zzacx zzb;
    private zzaea zzc;
    private zzaoq zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
    
        if (r2 == 32) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) throws IOException {
        int i;
        zzek.zzb(this.zzc);
        int i2 = zzfy.zza;
        int i3 = this.zzd;
        int i4 = 4;
        if (i3 == 0) {
            zzek.zzf(zzacvVar.zzf() == 0);
            int i5 = this.zzg;
            if (i5 != -1) {
                ((zzack) zzacvVar).zzo(i5, false);
                this.zzd = 4;
            } else {
                if (!zzaov.zzc(zzacvVar)) {
                    throw zzcc.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzack) zzacvVar).zzo((int) (zzacvVar.zze() - zzacvVar.zzf()), false);
                this.zzd = 1;
            }
            return 0;
        }
        long j = -1;
        if (i3 == 1) {
            zzfp zzfpVar = new zzfp(8);
            zzaou zza2 = zzaou.zza(zzacvVar, zzfpVar);
            if (zza2.zza != 1685272116) {
                zzacvVar.zzj();
            } else {
                zzack zzackVar = (zzack) zzacvVar;
                zzackVar.zzl(8, false);
                zzfpVar.zzK(0);
                zzackVar.zzm(zzfpVar.zzM(), 0, 8, false);
                j = zzfpVar.zzr();
                zzackVar.zzo(((int) zza2.zzb) + 8, false);
            }
            this.zze = j;
            this.zzd = 2;
            return 0;
        }
        if (i3 == 2) {
            zzaot zzb = zzaov.zzb(zzacvVar);
            int i6 = zzb.zza;
            if (i6 == 17) {
                this.zzf = new zzaop(this.zzb, this.zzc, zzb);
            } else if (i6 == 6) {
                this.zzf = new zzaor(this.zzb, this.zzc, zzb, "audio/g711-alaw", -1);
            } else if (i6 == 7) {
                this.zzf = new zzaor(this.zzb, this.zzc, zzb, "audio/g711-mlaw", -1);
            } else {
                int i7 = zzb.zze;
                if (i6 != 1) {
                    if (i6 != 3) {
                    }
                    i = 0;
                    if (i != 0) {
                        throw zzcc.zzc("Unsupported WAV format type: " + i6);
                    }
                    this.zzf = new zzaor(this.zzb, this.zzc, zzb, "audio/raw", i);
                }
                i4 = zzfy.zzk(i7);
                i = i4;
                if (i != 0) {
                }
            }
            this.zzd = 3;
            return 0;
        }
        if (i3 != 3) {
            zzek.zzf(this.zzh != -1);
            long zzf = this.zzh - zzacvVar.zzf();
            zzaoq zzaoqVar = this.zzf;
            zzaoqVar.getClass();
            return zzaoqVar.zzc(zzacvVar, zzf) ? -1 : 0;
        }
        Pair zza3 = zzaov.zza(zzacvVar);
        this.zzg = ((Long) zza3.first).intValue();
        long longValue = ((Long) zza3.second).longValue();
        long j2 = this.zze;
        if (j2 != -1 && longValue == 4294967295L) {
            longValue = j2;
        }
        long j3 = this.zzg + longValue;
        this.zzh = j3;
        long zzd = zzacvVar.zzd();
        if (zzd != -1 && j3 > zzd) {
            zzff.zzf("WavExtractor", "Data exceeds input length: " + j3 + ", " + zzd);
            this.zzh = zzd;
            j3 = zzd;
        }
        zzaoq zzaoqVar2 = this.zzf;
        zzaoqVar2.getClass();
        zzaoqVar2.zza(this.zzg, j3);
        this.zzd = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzb = zzacxVar;
        this.zzc = zzacxVar.zzw(0, 1);
        zzacxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzaoq zzaoqVar = this.zzf;
        if (zzaoqVar != null) {
            zzaoqVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) throws IOException {
        return zzaov.zzc(zzacvVar);
    }
}
