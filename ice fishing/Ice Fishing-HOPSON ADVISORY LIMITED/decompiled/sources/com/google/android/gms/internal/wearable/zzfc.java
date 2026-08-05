package com.google.android.gms.internal.wearable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzfc implements Iterator {
    final /* synthetic */ zzfe zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzfc(zzfe zzfeVar, byte[] bArr) {
        Objects.requireNonNull(zzfeVar);
        this.zza = zzfeVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzfe zzfeVar = this.zza;
        if (i >= zzfeVar.zzj()) {
            return !zzfeVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzfe zzfeVar = this.zza;
        return i < zzfeVar.zzj() ? (zzfb) zzfeVar.zzi()[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzfe zzfeVar = this.zza;
        zzfeVar.zzh();
        int i = this.zzb;
        if (i >= zzfeVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzfeVar.zzg(i);
        }
    }
}
