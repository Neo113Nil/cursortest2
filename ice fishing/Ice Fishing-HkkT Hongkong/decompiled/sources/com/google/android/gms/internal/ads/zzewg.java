package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzewg implements zzexp {
    private zzfub zza;
    private zzfub zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzewg(zzfub zzfubVar, zzfub zzfubVar2, boolean z, boolean z2, boolean z3) {
        this.zza = zzfubVar;
        this.zzb = zzfubVar2;
        this.zzc = z;
        this.zzd = z2;
        this.zzf = z3;
    }

    public zzewg(boolean z) {
        this.zzf = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcL)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        if (r5.zzb.zzc() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        r1.putString("paidv2_id_android", r5.zzb.zzb());
        r1.putLong("paidv2_creation_time_android", r5.zzb.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a2, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r5.zzc);
        r1.putBoolean("paidv2_user_option_android", r5.zzd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcN)).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcM)).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzcK)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r5.zza.zzc() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r1.putString("paidv1_id_android", r5.zza.zzb());
        r1.putLong("paidv1_creation_time_android", r5.zza.zza());
     */
    @Override // com.google.android.gms.internal.ads.zzexp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zze) {
            return;
        }
        Bundle zza = zzfhv.zza(bundle, "pii");
        if (!this.zzf) {
        }
        if (this.zzf) {
        }
        if (!this.zzf) {
        }
        if (this.zzf) {
        }
        if (zza.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", zza);
    }
}
