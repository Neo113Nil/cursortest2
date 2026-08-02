package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzaei implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzaeh
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i = zzada.zza;
            zzadb zzadbVar = zzaei.zza;
            return new zzacu[]{new zzaei(0)};
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzacx zzp;
    private zzaea zzq;
    private zzadu zzr;
    private boolean zzs;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        int i = zzfy.zza;
        zzd = "#!AMR\n".getBytes(zzfwq.zzc);
        zze = "#!AMR-WB\n".getBytes(zzfwq.zzc);
        zzf = iArr[8];
    }

    public zzaei() {
        this(0);
    }

    public zzaei(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    private static boolean zzf(zzacv zzacvVar, byte[] bArr) throws IOException {
        zzacvVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzack) zzacvVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzacv zzacvVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zzacvVar, bArr)) {
            this.zzh = false;
            ((zzack) zzacvVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzf(zzacvVar, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zzack) zzacvVar).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) throws IOException {
        zzek.zzb(this.zzq);
        int i = zzfy.zza;
        if (zzacvVar.zzf() == 0 && !zzg(zzacvVar)) {
            throw zzcc.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzh;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            zzaea zzaeaVar = this.zzq;
            zzak zzakVar = new zzak();
            zzakVar.zzW(str);
            zzakVar.zzO(zzf);
            zzakVar.zzy(1);
            zzakVar.zzX(i2);
            zzaeaVar.zzl(zzakVar.zzac());
        }
        int zza2 = zza(zzacvVar);
        if (this.zzl) {
            return zza2;
        }
        zzadt zzadtVar = new zzadt(-9223372036854775807L, 0L);
        this.zzr = zzadtVar;
        this.zzp.zzO(zzadtVar);
        this.zzl = true;
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzp = zzacxVar;
        this.zzq = zzacxVar.zzw(0, 1);
        zzacxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) throws IOException {
        return zzg(zzacvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:13:0x000c, B:15:0x0020, B:23:0x003e, B:24:0x0047, B:30:0x0043, B:40:0x0086, B:41:0x009e, B:42:0x009f, B:43:0x00af), top: B:12:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043 A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:13:0x000c, B:15:0x0020, B:23:0x003e, B:24:0x0047, B:30:0x0043, B:40:0x0086, B:41:0x009e, B:42:0x009f, B:43:0x00af), top: B:12:0x000c }] */
    @RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(zzacv zzacvVar) throws IOException {
        int i;
        int i2 = this.zzk;
        if (i2 == 0) {
            try {
                zzacvVar.zzj();
                ((zzack) zzacvVar).zzm(this.zzg, 0, 1, false);
                byte b = this.zzg[0];
                if ((b & 131) > 0) {
                    throw zzcc.zza("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i3 = b >> 3;
                boolean z = this.zzh;
                int i4 = i3 & 15;
                if (z) {
                    if (i4 >= 10) {
                        if (i4 > 13) {
                        }
                    }
                    i2 = !z ? zzc[i4] : zzb[i4];
                    this.zzj = i2;
                    this.zzk = i2;
                    i = this.zzm;
                    if (i == -1) {
                        this.zzm = i2;
                        i = i2;
                    }
                    if (i == i2) {
                        this.zzn++;
                    }
                }
                if (!z) {
                    if (i4 >= 12 && i4 <= 14) {
                    }
                    i2 = !z ? zzc[i4] : zzb[i4];
                    this.zzj = i2;
                    this.zzk = i2;
                    i = this.zzm;
                    if (i == -1) {
                    }
                    if (i == i2) {
                    }
                }
                throw zzcc.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i4, null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zza2 = zzady.zza(this.zzq, zzacvVar, i2, true);
        if (zza2 == -1) {
            return -1;
        }
        int i5 = this.zzk - zza2;
        this.zzk = i5;
        if (i5 > 0) {
            return 0;
        }
        this.zzq.zzt(this.zzi, 1, this.zzj, 0, null);
        this.zzi += 20000;
        return 0;
    }
}
