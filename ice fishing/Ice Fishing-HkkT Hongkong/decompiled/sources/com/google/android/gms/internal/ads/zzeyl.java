package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzeyl implements zzexq {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcdc zzg;

    zzeyl(zzcdc zzcdcVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzcdcVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzaU)).booleanValue()) {
            return zzgen.zzg(new Exception("Did not ad Ad ID into query param."));
        }
        return zzgen.zze((zzgee) zzgen.zzo(zzgen.zzm(zzgee.zzu(this.zzg.zza(this.zza, this.zzd)), new zzfws() { // from class: com.google.android.gms.internal.ads.zzeyj
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                return zzeyl.this.zzc((AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzaV)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfws() { // from class: com.google.android.gms.internal.ads.zzeyk
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                return zzeyl.this.zzd((Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzo().zzw(r0, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.google.android.gms.internal.ads.zzfub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcS)).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcR)).booleanValue() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzfue.zzj(r7.zza).zzi((java.lang.String) java.util.Objects.requireNonNull(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) java.util.Objects.requireNonNull(r8)).getId()), r7.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcY)).longValue(), r7.zzf);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzeym zzc(AdvertisingIdClient.Info info) {
        zzfub zzfubVar = new zzfub();
        if (!this.zze) {
        }
        if (this.zze) {
        }
        return new zzeym(info, null, zzfubVar);
    }

    final /* synthetic */ zzeym zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzeym(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfub());
    }
}
