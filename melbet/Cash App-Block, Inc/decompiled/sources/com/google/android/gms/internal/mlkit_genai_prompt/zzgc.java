package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.ParcelFileDescriptor;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzgc {
    public final zzil zza;
    public final ParcelFileDescriptor zzb;

    public zzgc(zzil zzilVar, ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = zzilVar;
        this.zzb = parcelFileDescriptor;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgc)) {
            return false;
        }
        zzgc zzgcVar = (zzgc) obj;
        return this.zza.equals(zzgcVar.zza) && this.zzb.equals(zzgcVar.zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LlmPrefixParam{promptPrefix=", this.zza.toString(), ", cacheFileToRead=", String.valueOf(this.zzb), "}");
    }
}
