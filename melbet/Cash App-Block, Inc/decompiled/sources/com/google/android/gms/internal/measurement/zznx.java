package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zznx extends zzof {
    public final boolean zza;
    public volatile boolean zza$1;

    public zznx(String str, zzpi zzpiVar, boolean z) {
        super(str, zzpiVar);
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zza() {
        return Boolean.valueOf(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zzc(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zzd(Object obj) {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zze() {
        return Boolean.valueOf(this.zza$1);
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ void zzh(Object obj) {
        this.zza$1 = ((Boolean) obj).booleanValue();
    }
}
