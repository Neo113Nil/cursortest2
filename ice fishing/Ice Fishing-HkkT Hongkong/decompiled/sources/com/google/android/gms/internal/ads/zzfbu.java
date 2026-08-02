package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public abstract class zzfbu implements zzequ {
    protected final zzclg zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfck zzd;
    private final zzfed zze;
    private final zzcei zzf;
    private final ViewGroup zzg;
    private final zzfnc zzh;
    private final zzfhf zzi;

    @Nullable
    private ListenableFuture zzj;

    protected zzfbu(Context context, Executor executor, zzclg zzclgVar, zzfed zzfedVar, zzfck zzfckVar, zzfhf zzfhfVar, zzcei zzceiVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzclgVar;
        this.zze = zzfedVar;
        this.zzd = zzfckVar;
        this.zzi = zzfhfVar;
        this.zzf = zzceiVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzclgVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzdad zzm(zzfeb zzfebVar) {
        zzfbt zzfbtVar = (zzfbt) zzfebVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzia)).booleanValue()) {
            zzcuc zzcucVar = new zzcuc(this.zzg);
            zzdaf zzdafVar = new zzdaf();
            zzdafVar.zze(this.zzb);
            zzdafVar.zzi(zzfbtVar.zza);
            zzdah zzj = zzdafVar.zzj();
            zzdgm zzdgmVar = new zzdgm();
            zzdgmVar.zzc(this.zzd, this.zzc);
            zzdgmVar.zzl(this.zzd, this.zzc);
            return zze(zzcucVar, zzj, zzdgmVar.zzn());
        }
        zzfck zzi = zzfck.zzi(this.zzd);
        zzdgm zzdgmVar2 = new zzdgm();
        zzdgmVar2.zzb(zzi, this.zzc);
        zzdgmVar2.zzg(zzi, this.zzc);
        zzdgmVar2.zzh(zzi, this.zzc);
        zzdgmVar2.zzi(zzi, this.zzc);
        zzdgmVar2.zzc(zzi, this.zzc);
        zzdgmVar2.zzl(zzi, this.zzc);
        zzdgmVar2.zzm(zzi);
        zzcuc zzcucVar2 = new zzcuc(this.zzg);
        zzdaf zzdafVar2 = new zzdaf();
        zzdafVar2.zze(this.zzb);
        zzdafVar2.zzi(zzfbtVar.zza);
        return zze(zzcucVar2, zzdafVar2.zzj(), zzdgmVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0026, B:12:0x0045, B:16:0x0056, B:20:0x005c, B:22:0x006c, B:24:0x0074, B:25:0x0089, B:27:0x00a2, B:29:0x00a6, B:30:0x00af, B:34:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0026, B:12:0x0045, B:16:0x0056, B:20:0x005c, B:22:0x006c, B:24:0x0074, B:25:0x0089, B:27:0x00a2, B:29:0x00a6, B:30:0x00af, B:34:0x003e), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzequ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeqs zzeqsVar, zzeqt zzeqtVar) throws RemoteException {
        boolean z;
        zzfmz zzfmzVar;
        if (((Boolean) zzbhy.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkG)).booleanValue()) {
                z = true;
                if (this.zzf.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkH)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                if (str != null) {
                    zzcec.zzg("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbo
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfbu.this.zzk();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
                    zzfed zzfedVar = this.zze;
                    if (zzfedVar.zzd() != null) {
                        zzfmz zzh = ((zzctp) zzfedVar.zzd()).zzh();
                        zzh.zzh(7);
                        zzh.zzb(zzlVar.zzp);
                        zzfmzVar = zzh;
                        zzfie.zza(this.zzb, zzlVar.zzf);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziN)).booleanValue() && zzlVar.zzf) {
                            this.zza.zzk().zzn(true);
                        }
                        zzfhf zzfhfVar = this.zzi;
                        zzfhfVar.zzs(str);
                        zzfhfVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
                        zzfhfVar.zzE(zzlVar);
                        Context context = this.zzb;
                        zzfhh zzG = zzfhfVar.zzG();
                        zzfmo zzb = zzfmn.zzb(context, zzfmy.zzf(zzG), 7, zzlVar);
                        zzfbt zzfbtVar = new zzfbt(null);
                        zzfbtVar.zza = zzG;
                        ListenableFuture zzc = this.zze.zzc(new zzfee(zzfbtVar, null), new zzfec() { // from class: com.google.android.gms.internal.ads.zzfbp
                            @Override // com.google.android.gms.internal.ads.zzfec
                            public final zzdad zza(zzfeb zzfebVar) {
                                zzdad zzm;
                                zzm = zzfbu.this.zzm(zzfebVar);
                                return zzm;
                            }
                        }, null);
                        this.zzj = zzc;
                        zzgen.zzr(zzc, new zzfbr(this, zzeqtVar, zzfmzVar, zzb, zzfbtVar), this.zzc);
                        return true;
                    }
                }
                zzfmzVar = null;
                zzfie.zza(this.zzb, zzlVar.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziN)).booleanValue()) {
                    this.zza.zzk().zzn(true);
                }
                zzfhf zzfhfVar2 = this.zzi;
                zzfhfVar2.zzs(str);
                zzfhfVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
                zzfhfVar2.zzE(zzlVar);
                Context context2 = this.zzb;
                zzfhh zzG2 = zzfhfVar2.zzG();
                zzfmo zzb2 = zzfmn.zzb(context2, zzfmy.zzf(zzG2), 7, zzlVar);
                zzfbt zzfbtVar2 = new zzfbt(null);
                zzfbtVar2.zza = zzG2;
                ListenableFuture zzc2 = this.zze.zzc(new zzfee(zzfbtVar2, null), new zzfec() { // from class: com.google.android.gms.internal.ads.zzfbp
                    @Override // com.google.android.gms.internal.ads.zzfec
                    public final zzdad zza(zzfeb zzfebVar) {
                        zzdad zzm;
                        zzm = zzfbu.this.zzm(zzfebVar);
                        return zzm;
                    }
                }, null);
                this.zzj = zzc2;
                zzgen.zzr(zzc2, new zzfbr(this, zzeqtVar, zzfmzVar, zzb2, zzfbtVar2), this.zzc);
                return true;
            }
        }
        z = false;
        if (this.zzf.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkH)).intValue()) {
        }
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str != null) {
        }
    }

    protected abstract zzdad zze(zzcuc zzcucVar, zzdah zzdahVar, zzdgo zzdgoVar);

    final /* synthetic */ void zzk() {
        this.zzd.zzbK(zzfij.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
