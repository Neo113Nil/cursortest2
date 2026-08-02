package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.concurrent.atomic.AtomicInteger;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzbve extends zzbyt {
    public final zzbwf zza;
    public final AtomicInteger zzb = new AtomicInteger(-2147483647);
    public volatile zzbtx zzc;
    public zzbtx zzd;

    public zzbve(zzbvf zzbvfVar, zzbwf zzbwfVar, String str) {
        Trace.checkNotNull(zzbwfVar, "delegate");
        this.zza = zzbwfVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbyt
    public final zzbwf zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbyt, com.google.android.libraries.places.internal.zzbvu
    public final zzbvr zzb(Schema schema, zzbsn zzbsnVar, zzbov zzbovVar, zzbph[] zzbphVarArr) {
        return this.zzb.get() >= 0 ? new zzbym(this.zzc, zzbvs.zza, zzbphVarArr) : this.zza.zzb(schema, zzbsnVar, zzbovVar, zzbphVarArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbyt, com.google.android.libraries.places.internal.zzcck
    public final void zzd(zzbtx zzbtxVar) {
        Trace.checkNotNull(zzbtxVar, "status");
        synchronized (this) {
            try {
                AtomicInteger atomicInteger = this.zzb;
                if (atomicInteger.get() < 0) {
                    this.zzc = zzbtxVar;
                    atomicInteger.addAndGet(Integer.MAX_VALUE);
                    if (atomicInteger.get() != 0) {
                        return;
                    }
                    super.zzd(zzbtxVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbyt, com.google.android.libraries.places.internal.zzcck
    public final void zze(zzbtx zzbtxVar) {
        Trace.checkNotNull(zzbtxVar, "status");
        synchronized (this) {
            try {
                AtomicInteger atomicInteger = this.zzb;
                if (atomicInteger.get() < 0) {
                    this.zzc = zzbtxVar;
                    atomicInteger.addAndGet(Integer.MAX_VALUE);
                } else if (this.zzd != null) {
                    return;
                }
                if (atomicInteger.get() != 0) {
                    this.zzd = zzbtxVar;
                } else {
                    super.zze(zzbtxVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
