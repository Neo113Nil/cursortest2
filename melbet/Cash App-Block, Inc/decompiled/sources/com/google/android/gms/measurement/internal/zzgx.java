package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzae;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzgx implements Runnable {
    public final zzgw zza;
    public final int zzb;
    public final Throwable zzc;
    public final byte[] zzd;
    public final String zze;
    public final Map zzf;

    public /* synthetic */ zzgx(String str, zzgw zzgwVar, int i, IOException iOException, byte[] bArr, Map map) {
        zzae.checkNotNull(zzgwVar);
        this.zza = zzgwVar;
        this.zzb = i;
        this.zzc = iOException;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
