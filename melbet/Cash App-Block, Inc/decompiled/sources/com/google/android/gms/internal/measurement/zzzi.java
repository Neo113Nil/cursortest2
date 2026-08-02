package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzzi extends zzjx {
    public static final zzzi zza = new zzzi();

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final zzyl zzb(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzc(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzd(zzyl zzylVar) {
        return null;
    }
}
