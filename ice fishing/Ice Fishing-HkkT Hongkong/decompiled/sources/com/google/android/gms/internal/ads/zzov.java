package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzov implements zzoz {
    public static final zzfxu zza = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzot
        @Override // com.google.android.gms.internal.ads.zzfxu
        public final Object zza() {
            String zzn;
            zzn = zzov.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzcw zzc;
    private final zzcu zzd;
    private final HashMap zze;
    private final zzfxu zzf;
    private zzoy zzg;
    private zzcx zzh;
    private String zzi;
    private long zzj;

    public zzov() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zzou zzouVar = (zzou) this.zze.get(this.zzi);
        return (zzouVar == null || zzouVar.zzd == -1) ? this.zzj + 1 : zzouVar.zzd;
    }

    private final zzou zzm(int i, zzur zzurVar) {
        long j = Long.MAX_VALUE;
        zzou zzouVar = null;
        for (zzou zzouVar2 : this.zze.values()) {
            zzouVar2.zzg(i, zzurVar);
            if (zzouVar2.zzj(i, zzurVar)) {
                long j2 = zzouVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zzouVar = zzouVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzfy.zza;
                    if (zzouVar.zze != null && zzouVar2.zze != null) {
                        zzouVar = zzouVar2;
                    }
                }
            }
        }
        if (zzouVar != null) {
            return zzouVar;
        }
        String zzn = zzn();
        zzou zzouVar3 = new zzou(this, zzn, i, zzurVar);
        this.zze.put(zzn, zzouVar3);
        return zzouVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzou zzouVar) {
        if (zzouVar.zzd != -1) {
            this.zzj = zzouVar.zzd;
        }
        this.zzi = null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzp(zzmq zzmqVar) {
        if (zzmqVar.zzb.zzo()) {
            String str = this.zzi;
            if (str != null) {
                zzou zzouVar = (zzou) this.zze.get(str);
                zzouVar.getClass();
                zzo(zzouVar);
                return;
            }
            return;
        }
        zzou zzouVar2 = (zzou) this.zze.get(this.zzi);
        zzou zzm = zzm(zzmqVar.zzc, zzmqVar.zzd);
        this.zzi = zzm.zzb;
        zzi(zzmqVar);
        zzur zzurVar = zzmqVar.zzd;
        if (zzurVar == null || !zzurVar.zzb()) {
            return;
        }
        if (zzouVar2 != null) {
            if (zzouVar2.zzd == zzurVar.zzd && zzouVar2.zze != null && zzouVar2.zze.zzb == zzmqVar.zzd.zzb && zzouVar2.zze.zzc == zzmqVar.zzd.zzc) {
                return;
            }
        }
        zzur zzurVar2 = zzmqVar.zzd;
        String unused = zzm(zzmqVar.zzc, new zzur(zzurVar2.zza, zzurVar2.zzd)).zzb;
        String unused2 = zzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized String zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized String zzf(zzcx zzcxVar, zzur zzurVar) {
        return zzm(zzcxVar.zzn(zzurVar.zza, this.zzd).zzd, zzurVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized void zzg(zzmq zzmqVar) {
        zzoy zzoyVar;
        String str = this.zzi;
        if (str != null) {
            zzou zzouVar = (zzou) this.zze.get(str);
            if (zzouVar == null) {
                throw null;
            }
            zzo(zzouVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzou zzouVar2 = (zzou) it.next();
            it.remove();
            if (zzouVar2.zzf && (zzoyVar = this.zzg) != null) {
                zzoyVar.zzd(zzmqVar, zzouVar2.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzh(zzoy zzoyVar) {
        this.zzg = zzoyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r0.zzc == r10.zzc) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzi(zzmq zzmqVar) {
        if (this.zzg == null) {
            throw null;
        }
        if (!zzmqVar.zzb.zzo()) {
            zzur zzurVar = zzmqVar.zzd;
            if (zzurVar != null) {
                if (zzurVar.zzd >= zzl()) {
                    zzou zzouVar = (zzou) this.zze.get(this.zzi);
                    if (zzouVar != null) {
                        if (zzouVar.zzd == -1) {
                        }
                    }
                }
            }
            zzou zzm = zzm(zzmqVar.zzc, zzmqVar.zzd);
            if (this.zzi == null) {
                this.zzi = zzm.zzb;
            }
            zzur zzurVar2 = zzmqVar.zzd;
            if (zzurVar2 != null && zzurVar2.zzb()) {
                zzou zzm2 = zzm(zzmqVar.zzc, new zzur(zzurVar2.zza, zzurVar2.zzd, zzurVar2.zzb));
                if (!zzm2.zzf) {
                    zzm2.zzf = true;
                    zzcx zzcxVar = zzmqVar.zzb;
                    zzur zzurVar3 = zzmqVar.zzd;
                    zzcxVar.zzn(zzurVar3.zza, this.zzd);
                    this.zzd.zzi(zzmqVar.zzd.zzb);
                    Math.max(0L, zzfy.zzt(0L) + zzfy.zzt(0L));
                    String unused = zzm2.zzb;
                }
            }
            if (!zzm.zzf) {
                zzm.zzf = true;
                String unused2 = zzm.zzb;
            }
            if (zzm.zzb.equals(this.zzi) && !zzm.zzg) {
                zzm.zzg = true;
                this.zzg.zzc(zzmqVar, zzm.zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized void zzj(zzmq zzmqVar, int i) {
        if (this.zzg == null) {
            throw null;
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzou zzouVar = (zzou) it.next();
            if (zzouVar.zzk(zzmqVar)) {
                it.remove();
                if (zzouVar.zzf) {
                    boolean equals = zzouVar.zzb.equals(this.zzi);
                    boolean z = false;
                    if (i == 0 && equals && zzouVar.zzg) {
                        z = true;
                    }
                    if (equals) {
                        zzo(zzouVar);
                    }
                    this.zzg.zzd(zzmqVar, zzouVar.zzb, z);
                }
            }
        }
        zzp(zzmqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized void zzk(zzmq zzmqVar) {
        if (this.zzg == null) {
            throw null;
        }
        zzcx zzcxVar = this.zzh;
        this.zzh = zzmqVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzou zzouVar = (zzou) it.next();
            if (!zzouVar.zzl(zzcxVar, this.zzh) || zzouVar.zzk(zzmqVar)) {
                it.remove();
                if (zzouVar.zzf) {
                    if (zzouVar.zzb.equals(this.zzi)) {
                        zzo(zzouVar);
                    }
                    this.zzg.zzd(zzmqVar, zzouVar.zzb, false);
                }
            }
        }
        zzp(zzmqVar);
    }

    public zzov(zzfxu zzfxuVar) {
        this.zzf = zzfxuVar;
        this.zzc = new zzcw();
        this.zzd = new zzcu();
        this.zze = new HashMap();
        this.zzh = zzcx.zza;
        this.zzj = -1L;
    }
}
