package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzenj implements zzdkw {
    private final Context zza;
    private final zzdtk zzb;
    private final zzfhh zzc;
    private final zzcei zzd;
    private final zzfgm zze;
    private final ListenableFuture zzf;
    private final zzcjk zzg;
    private final zzbni zzh;
    private final boolean zzi;
    private final zzehs zzj;

    zzenj(Context context, zzdtk zzdtkVar, zzfhh zzfhhVar, zzcei zzceiVar, zzfgm zzfgmVar, ListenableFuture listenableFuture, zzcjk zzcjkVar, zzbni zzbniVar, boolean z, zzehs zzehsVar) {
        this.zza = context;
        this.zzb = zzdtkVar;
        this.zzc = zzfhhVar;
        this.zzd = zzceiVar;
        this.zze = zzfgmVar;
        this.zzf = listenableFuture;
        this.zzg = zzcjkVar;
        this.zzh = zzbniVar;
        this.zzi = z;
        this.zzj = zzehsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzdkw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzdbk zzdbkVar) {
        zzcjk zzcjkVar;
        zzcjk zzcjkVar2;
        zzdsp zzdspVar = (zzdsp) zzgen.zzq(this.zzf);
        try {
            zzfgm zzfgmVar = this.zze;
            if (this.zzg.zzaD()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzaM)).booleanValue()) {
                    final zzcjk zza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbnx.zzb(zza, zzdspVar.zzg());
                    final zzdto zzdtoVar = new zzdto();
                    zzdtoVar.zza(this.zza, (View) zza);
                    zzdspVar.zzl().zzi(zza, true, this.zzi ? this.zzh : null);
                    zza.zzN().zzB(new zzckw() { // from class: com.google.android.gms.internal.ads.zzenh
                        @Override // com.google.android.gms.internal.ads.zzckw
                        public final void zza(boolean z2, int i, String str, String str2) {
                            zzdto.this.zzb();
                            zzcjk zzcjkVar3 = zza;
                            zzcjkVar3.zzZ();
                            zzcjkVar3.zzN().zzr();
                        }
                    });
                    zzcky zzN = zza.zzN();
                    Objects.requireNonNull(zza);
                    zzN.zzH(new zzckx() { // from class: com.google.android.gms.internal.ads.zzeni
                        @Override // com.google.android.gms.internal.ads.zzckx
                        public final void zza() {
                            zzcjk.this.zzY();
                        }
                    });
                    zzfgr zzfgrVar = zzfgmVar.zzt;
                    zza.zzac(zzfgrVar.zzb, zzfgrVar.zza, null);
                    zzcjkVar = zza;
                    zzcjkVar.zzao(true);
                    boolean zze = !this.zzi ? this.zzh.zze(false) : false;
                    com.google.android.gms.ads.internal.zzt.zzp();
                    Context context2 = this.zza;
                    boolean z2 = this.zzi;
                    boolean zzH = com.google.android.gms.ads.internal.util.zzt.zzH(context2);
                    boolean zzd = !z2 ? this.zzh.zzd() : false;
                    float zza2 = !this.zzi ? this.zzh.zza() : 0.0f;
                    zzfgm zzfgmVar2 = this.zze;
                    com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, zzH, zzd, zza2, -1, z, zzfgmVar2.zzP, zzfgmVar2.zzQ);
                    if (zzdbkVar != null) {
                        zzdbkVar.zzf();
                    }
                    com.google.android.gms.ads.internal.zzt.zzi();
                    zzdkl zzh = zzdspVar.zzh();
                    zzfgm zzfgmVar3 = this.zze;
                    zzcei zzceiVar = this.zzd;
                    int i = zzfgmVar3.zzR;
                    String str = zzfgmVar3.zzC;
                    zzfgr zzfgrVar2 = zzfgmVar3.zzt;
                    String str2 = zzfgrVar2.zzb;
                    String str3 = zzfgrVar2.zza;
                    zzfhh zzfhhVar = this.zzc;
                    com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzcjkVar, i, zzceiVar, str, zzjVar, str2, str3, zzfhhVar.zzf, zzdbkVar, zzfgmVar3.zzaj ? this.zzj : null), true);
                }
                zzcjkVar2 = this.zzg;
            } else {
                zzcjkVar2 = this.zzg;
            }
            zzcjkVar = zzcjkVar2;
            zzcjkVar.zzao(true);
            if (!this.zzi) {
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            Context context22 = this.zza;
            boolean z22 = this.zzi;
            boolean zzH2 = com.google.android.gms.ads.internal.util.zzt.zzH(context22);
            if (!z22) {
            }
            float zza22 = !this.zzi ? this.zzh.zza() : 0.0f;
            zzfgm zzfgmVar22 = this.zze;
            com.google.android.gms.ads.internal.zzj zzjVar2 = new com.google.android.gms.ads.internal.zzj(zze, zzH2, zzd, zza22, -1, z, zzfgmVar22.zzP, zzfgmVar22.zzQ);
            if (zzdbkVar != null) {
            }
            com.google.android.gms.ads.internal.zzt.zzi();
            zzdkl zzh2 = zzdspVar.zzh();
            zzfgm zzfgmVar32 = this.zze;
            zzcei zzceiVar2 = this.zzd;
            int i2 = zzfgmVar32.zzR;
            String str4 = zzfgmVar32.zzC;
            zzfgr zzfgrVar22 = zzfgmVar32.zzt;
            String str22 = zzfgrVar22.zzb;
            String str32 = zzfgrVar22.zza;
            zzfhh zzfhhVar2 = this.zzc;
            if (zzfgmVar32.zzaj) {
            }
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh2, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzcjkVar, i2, zzceiVar2, str4, zzjVar2, str22, str32, zzfhhVar2.zzf, zzdbkVar, zzfgmVar32.zzaj ? this.zzj : null), true);
        } catch (zzcjw e) {
            zzcec.zzh("", e);
        }
    }
}
