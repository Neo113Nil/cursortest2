package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzewf implements zzexq {
    private final Context zza;
    private final zzgey zzb;
    private final zzfhh zzc;
    private final zzcei zzd;

    zzewf(Context context, zzgey zzgeyVar, zzfhh zzfhhVar, zzcei zzceiVar) {
        this.zza = context;
        this.zzb = zzgeyVar;
        this.zzc = zzfhhVar;
        this.zzd = zzceiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzewf.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcK)).booleanValue() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzfue.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcY)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzi().zzQ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcL)).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzfuf.zzi(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e9, code lost:
    
        if (r8.zzd.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcU)).intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        r2 = r0.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcZ)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzi().zzQ());
        r3 = r0.zzo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x010f, code lost:
    
        r6 = r0.zzp();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcN)).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcM)).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzewg zzc() throws Exception {
        try {
            Context context = this.zza;
            boolean zzb = this.zzc.zzb();
            zzfub zzfubVar = new zzfub();
            zzfub zzfubVar2 = new zzfub();
            boolean z = true;
            if (zzb) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcO)).booleanValue()) {
                    return new zzewg(true);
                }
            }
            if (!zzb) {
            }
            if (zzb) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcV)).booleanValue()) {
                if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcU)).intValue()) {
                    zzfuf.zzi(context).zzj();
                }
            }
            if (!zzb) {
            }
            if (zzb) {
            }
            zzfub zzfubVar3 = zzfubVar2;
            boolean z2 = true;
            boolean z3 = true;
            return new zzewg(zzfubVar, zzfubVar3, z2, z3, zzb);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "PerAppIdSignal");
            return new zzewg(this.zzc.zzb());
        }
    }
}
