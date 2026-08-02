package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;

/* loaded from: classes4.dex */
public final class zzbrl extends zzbrt {
    public final zzbro zza;

    public zzbrl(zzbro zzbroVar) {
        Trace.checkNotNull(zzbroVar, "result");
        this.zza = zzbroVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbrl) {
            return this.zza.equals(((zzbrl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf.length() + 19), "FixedResultPicker(", valueOf, ")");
    }

    @Override // com.google.android.libraries.places.internal.zzbrt
    public final zzbro zza(zzbrp zzbrpVar) {
        return this.zza;
    }
}
