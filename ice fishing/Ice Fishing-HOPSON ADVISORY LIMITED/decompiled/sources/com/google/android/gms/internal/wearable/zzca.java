package com.google.android.gms.internal.wearable;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzca extends zzcb {
    final /* synthetic */ zzcg zza;
    private int zzb;
    private final int zzc;

    zzca(zzcg zzcgVar) {
        Objects.requireNonNull(zzcgVar);
        this.zza = zzcgVar;
        this.zzb = 0;
        this.zzc = zzcgVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.wearable.zzcd
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zza(i);
    }
}
