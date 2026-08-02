package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.android.filament.Box;

/* loaded from: classes4.dex */
public final class zzcch extends zzbqu {
    public final zzcci zzb;

    public /* synthetic */ zzcch(zzcci zzcciVar) {
        this.zzb = zzcciVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final Box zza() {
        zzcci zzcciVar = this.zzb;
        Trace.checkNotNull(zzcciVar, "config");
        return new Box(zzbtx.zza, zzcciVar);
    }
}
