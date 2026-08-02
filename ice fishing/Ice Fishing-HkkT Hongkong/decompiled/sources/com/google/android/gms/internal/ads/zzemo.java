package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzemo implements zzgdu {
    private final zzflm zza;
    private final zzdaz zzb;
    private final zzfnu zzc;
    private final zzfny zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcwk zzg;
    private final zzemh zzh;
    private final zzeis zzi;
    private final Context zzj;
    private final zzfmz zzk;
    private final zzelr zzl;

    zzemo(Context context, zzflm zzflmVar, zzemh zzemhVar, zzdaz zzdazVar, zzfnu zzfnuVar, zzfny zzfnyVar, zzcwk zzcwkVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeis zzeisVar, zzfmz zzfmzVar, zzelr zzelrVar) {
        this.zzj = context;
        this.zza = zzflmVar;
        this.zzh = zzemhVar;
        this.zzb = zzdazVar;
        this.zzc = zzfnuVar;
        this.zzd = zzfnyVar;
        this.zzg = zzcwkVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeisVar;
        this.zzk = zzfmzVar;
        this.zzl = zzelrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzft)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String zzc(zzfgy zzfgyVar) {
        String str = "No fill.";
        String str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzfu)).booleanValue() ? "No ad config." : "No fill.";
        int i = zzfgyVar.zzb.zzb.zze;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                if (i < 300 || i >= 400) {
                    str = "Received error HTTP response code: " + i;
                } else {
                    str = "No location header to follow redirect or too many redirects.";
                }
            }
            zzfgo zzfgoVar = zzfgyVar.zzb.zzb.zzi;
            return zzfgoVar == null ? zzfgoVar.zza() : str;
        }
        str = str2;
        zzfgo zzfgoVar2 = zzfgyVar.zzb.zzb.zzi;
        if (zzfgoVar2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
    @Override // com.google.android.gms.internal.ads.zzgdu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        final zzfgy zzfgyVar = (zzfgy) obj;
        String zzc = zzc(zzfgyVar);
        this.zzi.zzi(zzfgyVar.zzb.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzih)).booleanValue() && (i = zzfgyVar.zzb.zzb.zze) != 0 && (i < 200 || i >= 300)) {
            return zzgen.zzg(new zzeml(3, zzc));
        }
        zzfgp zzfgpVar = zzfgyVar.zzb.zzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzds)).booleanValue()) {
            String str = zzfgpVar.zzo;
            if (!TextUtils.isEmpty(str)) {
                this.zzi.zzh(str, zzfgyVar.zzb.zza);
                this.zzb.zzo(new zzcsi(zzfgyVar, this.zzd, this.zzc), this.zze);
                if (zzfgyVar.zzb.zzb.zzp <= 1) {
                    return this.zzl.zzb(zzfgyVar);
                }
                zzfkr zza = zzfkw.zzc(zzgen.zzg(new zzeml(3, zzc(zzfgyVar))), zzflg.RENDER_CONFIG_INIT, this.zza).zza();
                this.zzh.zzl();
                int i2 = 0;
                for (final zzfgm zzfgmVar : zzfgyVar.zzb.zza) {
                    Iterator it = zzfgmVar.zza.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str2 = (String) it.next();
                        final zzein zza2 = this.zzg.zza(zzfgmVar.zzb, str2);
                        if (zza2 != null && zza2.zzb(zzfgyVar, zzfgmVar)) {
                            zza = this.zza.zzb(zzflg.RENDER_CONFIG_WATERFALL, zza).zzh("render-config-" + i2 + "-" + str2).zzc(Throwable.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzemm
                                @Override // com.google.android.gms.internal.ads.zzgdu
                                public final ListenableFuture zza(Object obj2) {
                                    return zzemo.this.zzb(zzfgmVar, zzfgyVar, zza2, (Throwable) obj2);
                                }
                            }).zza();
                            break;
                        }
                    }
                    i2++;
                }
                final zzemh zzemhVar = this.zzh;
                Objects.requireNonNull(zzemhVar);
                zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemh.this.zzj();
                    }
                }, this.zze);
                return zza;
            }
        }
        for (zzfgm zzfgmVar2 : zzfgyVar.zzb.zza) {
            this.zzi.zzd(zzfgmVar2);
            Iterator it2 = zzfgmVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.zzi.zzf(zzfgmVar2, 0L, zzfij.zzd(1, null, null));
                    break;
                }
                zzein zza3 = this.zzg.zza(zzfgmVar2.zzb, (String) it2.next());
                if (zza3 == null || !zza3.zzb(zzfgyVar, zzfgmVar2)) {
                }
            }
        }
        this.zzb.zzo(new zzcsi(zzfgyVar, this.zzd, this.zzc), this.zze);
        if (zzfgyVar.zzb.zzb.zzp <= 1) {
        }
    }

    final /* synthetic */ ListenableFuture zzb(zzfgm zzfgmVar, zzfgy zzfgyVar, zzein zzeinVar, Throwable th) throws Exception {
        zzfmo zza = zzfmn.zza(this.zzj, 12);
        zza.zzd(zzfgmVar.zzF);
        zza.zzh();
        ListenableFuture zzo = zzgen.zzo(zzeinVar.zza(zzfgyVar, zzfgmVar), zzfgmVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfgyVar, zzfgmVar, zzo, this.zzc);
        zzfmy.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
