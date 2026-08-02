package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzanw implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzanu
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i = zzada.zza;
            zzadb zzadbVar = zzanw.zza;
            return new zzacu[]{new zzanw()};
        }
    };
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzans zzj;
    private zzacx zzk;
    private boolean zzl;
    private final zzfw zzb = new zzfw(0);
    private final zzfp zzd = new zzfp(4096);
    private final SparseArray zzc = new SparseArray();
    private final zzant zze = new zzant();

    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) throws IOException {
        zzamy zzanaVar;
        zzek.zzb(this.zzk);
        long zzd = zzacvVar.zzd();
        if (zzd != -1) {
            zzant zzantVar = this.zze;
            if (!zzantVar.zze()) {
                return zzantVar.zza(zzacvVar, zzadrVar);
            }
        }
        if (!this.zzl) {
            this.zzl = true;
            zzant zzantVar2 = this.zze;
            if (zzantVar2.zzb() != -9223372036854775807L) {
                zzans zzansVar = new zzans(zzantVar2.zzd(), zzantVar2.zzb(), zzd);
                this.zzj = zzansVar;
                this.zzk.zzO(zzansVar.zzb());
            } else {
                this.zzk.zzO(new zzadt(zzantVar2.zzb(), 0L));
            }
        }
        zzans zzansVar2 = this.zzj;
        if (zzansVar2 != null && zzansVar2.zze()) {
            return zzansVar2.zza(zzacvVar, zzadrVar);
        }
        zzacvVar.zzj();
        long zze = zzd != -1 ? zzd - zzacvVar.zze() : -1L;
        if ((zze != -1 && zze < 4) || !zzacvVar.zzm(this.zzd.zzM(), 0, 4, true)) {
            return -1;
        }
        this.zzd.zzK(0);
        int zzg = this.zzd.zzg();
        if (zzg == 441) {
            return -1;
        }
        if (zzg == 442) {
            zzack zzackVar = (zzack) zzacvVar;
            zzackVar.zzm(this.zzd.zzM(), 0, 10, false);
            this.zzd.zzK(9);
            zzackVar.zzo((this.zzd.zzm() & 7) + 14, false);
            return 0;
        }
        if (zzg == 443) {
            zzack zzackVar2 = (zzack) zzacvVar;
            zzackVar2.zzm(this.zzd.zzM(), 0, 2, false);
            this.zzd.zzK(0);
            zzackVar2.zzo(this.zzd.zzq() + 6, false);
            return 0;
        }
        if ((zzg >> 8) != 1) {
            ((zzack) zzacvVar).zzo(1, false);
            return 0;
        }
        int i = zzg & 255;
        zzanv zzanvVar = (zzanv) this.zzc.get(i);
        if (!this.zzf) {
            if (zzanvVar == null) {
                zzamy zzamyVar = null;
                if (i == 189) {
                    zzanaVar = new zzamo(null);
                    this.zzg = true;
                    this.zzi = zzacvVar.zzf();
                } else if ((zzg & 224) == 192) {
                    zzanaVar = new zzanm(null);
                    this.zzg = true;
                    this.zzi = zzacvVar.zzf();
                } else {
                    if ((zzg & 240) == 224) {
                        zzanaVar = new zzana(null);
                        this.zzh = true;
                        this.zzi = zzacvVar.zzf();
                    }
                    if (zzamyVar != null) {
                        zzamyVar.zzb(this.zzk, new zzaok(Integer.MIN_VALUE, i, 256));
                        zzanvVar = new zzanv(zzamyVar, this.zzb);
                        this.zzc.put(i, zzanvVar);
                    }
                }
                zzamyVar = zzanaVar;
                if (zzamyVar != null) {
                }
            }
            boolean z = this.zzg;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.zzh) {
                j = PlaybackStateCompat.ACTION_PLAY_FROM_URI + this.zzi;
            }
            if (zzacvVar.zzf() > j) {
                this.zzf = true;
                this.zzk.zzD();
            }
        }
        zzack zzackVar3 = (zzack) zzacvVar;
        zzackVar3.zzm(this.zzd.zzM(), 0, 2, false);
        this.zzd.zzK(0);
        int zzq = this.zzd.zzq() + 6;
        if (zzanvVar == null) {
            zzackVar3.zzo(zzq, false);
        } else {
            this.zzd.zzH(zzq);
            zzackVar3.zzn(this.zzd.zzM(), 0, zzq, false);
            this.zzd.zzK(6);
            zzanvVar.zza(this.zzd);
            zzfp zzfpVar = this.zzd;
            zzfpVar.zzJ(zzfpVar.zzc());
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzk = zzacxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(long j, long j2) {
        zzans zzansVar;
        int i;
        zzfw zzfwVar = this.zzb;
        if (zzfwVar.zzf() != -9223372036854775807L) {
            long zzd = zzfwVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (zzd != 0) {
                }
            }
            zzansVar = this.zzj;
            if (zzansVar != null) {
                zzansVar.zzd(j2);
            }
            for (i = 0; i < this.zzc.size(); i++) {
                ((zzanv) this.zzc.valueAt(i)).zzb();
            }
        }
        zzfwVar.zzi(j2);
        zzansVar = this.zzj;
        if (zzansVar != null) {
        }
        while (i < this.zzc.size()) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) throws IOException {
        byte[] bArr = new byte[14];
        zzack zzackVar = (zzack) zzacvVar;
        zzackVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzackVar.zzl(bArr[13] & 7, false);
        zzackVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
