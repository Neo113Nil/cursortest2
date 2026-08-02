package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzgbk extends zzgaa {
    static final zzgaa zza = new zzgbk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzgbk(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfxe.zza(i, this.zzc, "index");
        return Objects.requireNonNull(this.zzb[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa, com.google.android.gms.internal.ads.zzfzv
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final Object[] zzg() {
        return this.zzb;
    }
}
