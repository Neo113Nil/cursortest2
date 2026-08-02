package com.google.android.gms.internal.time;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzea implements zzdi {
    public final zzdi zza;
    public final Object zzb;

    public zzea(zzdi zzdiVar, Object obj) {
        this.zza = zzdiVar;
        zzcw.zza(obj, "log site qualifier");
        this.zzb = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzea)) {
            return false;
        }
        zzea zzeaVar = (zzea) obj;
        return this.zza.equals(zzeaVar.zza) && this.zzb.equals(zzeaVar.zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ this.zza.hashCode();
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SpecializedLogSiteKey{ delegate='", this.zza.toString(), "', qualifier='", this.zzb.toString(), "' }");
    }
}
