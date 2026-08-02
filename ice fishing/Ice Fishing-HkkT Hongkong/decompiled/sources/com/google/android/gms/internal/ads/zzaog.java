package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzaog implements zzacu {

    @Deprecated
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzaod
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i = zzada.zza;
            zzadb zzadbVar = zzaog.zza;
            return new zzacu[]{new zzaog(1, 1, zzakp.zza, new zzfw(0L), new zzamv(0), 112800)};
        }
    };
    private final List zzb;
    private final zzfp zzc;
    private final SparseIntArray zzd;
    private final zzaoj zze;
    private final zzakp zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzaoc zzj;
    private zzaob zzk;
    private zzacx zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzaog() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b3, code lost:
    
        if (r1 == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) throws IOException {
        ?? r3;
        long j;
        boolean z;
        long zzd = zzacvVar.zzd();
        if (this.zzn) {
            if (zzd != -1) {
                zzaoc zzaocVar = this.zzj;
                if (!zzaocVar.zzd()) {
                    return zzaocVar.zza(zzacvVar, zzadrVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                zzaoc zzaocVar2 = this.zzj;
                if (zzaocVar2.zzb() != -9223372036854775807L) {
                    j = 0;
                    zzaob zzaobVar = new zzaob(zzaocVar2.zzc(), zzaocVar2.zzb(), zzd, this.zzr, 112800);
                    this.zzk = zzaobVar;
                    this.zzl.zzO(zzaobVar.zzb());
                } else {
                    j = 0;
                    this.zzl.zzO(new zzadt(zzaocVar2.zzb(), 0L));
                }
            }
            if (this.zzp) {
                z = false;
                this.zzp = false;
                zzd(j, j);
                if (zzacvVar.zzf() != j) {
                    zzadrVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            zzaob zzaobVar2 = this.zzk;
            r3 = z;
            if (zzaobVar2 != null) {
                r3 = z;
                if (zzaobVar2.zze()) {
                    return zzaobVar2.zza(zzacvVar, zzadrVar);
                }
            }
        } else {
            r3 = 0;
        }
        zzfp zzfpVar = this.zzc;
        byte[] zzM = zzfpVar.zzM();
        if (9400 - zzfpVar.zzd() < 188) {
            int zzb = zzfpVar.zzb();
            if (zzb > 0) {
                System.arraycopy(zzM, zzfpVar.zzd(), zzM, r3, zzb);
            }
            this.zzc.zzI(zzM, zzb);
        }
        while (true) {
            zzfp zzfpVar2 = this.zzc;
            if (zzfpVar2.zzb() >= 188) {
                int zzd2 = zzfpVar2.zzd();
                int zze = zzfpVar2.zze();
                int zza2 = zzaom.zza(zzfpVar2.zzM(), zzd2, zze);
                this.zzc.zzK(zza2);
                int i = zza2 + 188;
                if (i > zze) {
                    this.zzq += zza2 - zzd2;
                } else {
                    this.zzq = r3;
                }
                zzfp zzfpVar3 = this.zzc;
                int zze2 = zzfpVar3.zze();
                if (i > zze2) {
                    return r3;
                }
                int zzg = zzfpVar3.zzg();
                if ((8388608 & zzg) != 0) {
                    this.zzc.zzK(i);
                    return r3;
                }
                int i2 = (4194304 & zzg) != 0 ? 1 : r3;
                int i3 = zzg & 32;
                int i4 = (zzg >> 8) & 8191;
                zzaol zzaolVar = (zzg & 16) != 0 ? (zzaol) this.zzg.get(i4) : null;
                if (zzaolVar == null) {
                    this.zzc.zzK(i);
                    return r3;
                }
                int i5 = zzg & 15;
                int i6 = this.zzd.get(i4, i5 - 1);
                this.zzd.put(i4, i5);
                if (i6 == i5) {
                    this.zzc.zzK(i);
                    return r3;
                }
                if (i5 != ((i6 + 1) & 15)) {
                    zzaolVar.zzc();
                }
                if (i3 != 0) {
                    zzfp zzfpVar4 = this.zzc;
                    int zzm = zzfpVar4.zzm();
                    i2 |= (zzfpVar4.zzm() & 64) != 0 ? 2 : r3;
                    this.zzc.zzL(zzm - 1);
                }
                boolean z2 = this.zzn;
                if (z2 || !this.zzi.get(i4, r3)) {
                    this.zzc.zzJ(i);
                    zzaolVar.zza(this.zzc, i2);
                    this.zzc.zzJ(zze2);
                }
                if (this.zzn && zzd != -1) {
                    this.zzp = true;
                }
                this.zzc.zzK(i);
                return r3;
            }
            int zze3 = zzfpVar2.zze();
            int zza3 = zzacvVar.zza(zzM, zze3, 9400 - zze3);
            if (zza3 == -1) {
                for (int i7 = r3; i7 < this.zzg.size(); i7++) {
                    zzaol zzaolVar2 = (zzaol) this.zzg.valueAt(i7);
                    if (zzaolVar2 instanceof zzanp) {
                        zzaolVar2.zza(new zzfp(), 1);
                    }
                }
                return -1;
            }
            this.zzc.zzJ(zze3 + zza3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzl = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j, long j2) {
        zzaob zzaobVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzfw zzfwVar = (zzfw) this.zzb.get(i);
            if (zzfwVar.zzf() != -9223372036854775807L) {
                long zzd = zzfwVar.zzd();
                if (zzd != -9223372036854775807L) {
                    if (zzd != 0) {
                        if (zzd == j2) {
                        }
                    }
                }
            }
            zzfwVar.zzi(j2);
        }
        if (j2 != 0 && (zzaobVar = this.zzk) != null) {
            zzaobVar.zzd(j2);
        }
        this.zzc.zzH(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzg.size(); i2++) {
            ((zzaol) this.zzg.valueAt(i2)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(zzacv zzacvVar) throws IOException {
        byte[] zzM = this.zzc.zzM();
        zzack zzackVar = (zzack) zzacvVar;
        zzackVar.zzm(zzM, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (zzM[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            zzackVar.zzo(i, false);
            return true;
        }
        return false;
    }

    public zzaog(int i, int i2, zzakp zzakpVar, zzfw zzfwVar, zzaoj zzaojVar, int i3) {
        this.zze = zzaojVar;
        this.zzf = zzakpVar;
        this.zzb = Collections.singletonList(zzfwVar);
        this.zzc = new zzfp(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaoc(112800);
        this.zzl = zzacx.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(sparseArray2.keyAt(i4), (zzaol) sparseArray2.valueAt(i4));
        }
        this.zzg.put(0, new zzany(new zzaoe(this)));
    }
}
