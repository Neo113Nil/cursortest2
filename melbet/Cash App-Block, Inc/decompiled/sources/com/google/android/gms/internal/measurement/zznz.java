package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zznz extends zzof {
    public volatile double zza;

    public zznz(zzpi zzpiVar) {
        super("measurement.test.double_flag", zzpiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zza() {
        return Double.valueOf(-3.0d);
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zzc(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zzd(Object obj) {
        return (Double) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zze() {
        return Double.valueOf(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ void zzh(Object obj) {
        this.zza = ((Double) obj).doubleValue();
    }
}
