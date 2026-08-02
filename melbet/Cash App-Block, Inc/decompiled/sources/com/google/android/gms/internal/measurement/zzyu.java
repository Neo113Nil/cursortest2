package com.google.android.gms.internal.measurement;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzyu implements zzyd {
    public final zzyd zza;
    public final Object zzb;

    public zzyu(zzyd zzydVar, Object obj) {
        this.zza = zzydVar;
        zzky.zza(obj, "log site qualifier");
        this.zzb = obj;
    }

    public static zzyu zza(zzyd zzydVar, Object obj) {
        return new zzyu(zzydVar, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzyu)) {
            return false;
        }
        zzyu zzyuVar = (zzyu) obj;
        return this.zza.equals(zzyuVar.zza) && this.zzb.equals(zzyuVar.zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ this.zza.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 47 + obj2.length() + 3);
        Boxes$$ExternalSyntheticOutline1.m(sb, "SpecializedLogSiteKey{ delegate='", obj, "', qualifier='", obj2);
        sb.append("' }");
        return sb.toString();
    }
}
