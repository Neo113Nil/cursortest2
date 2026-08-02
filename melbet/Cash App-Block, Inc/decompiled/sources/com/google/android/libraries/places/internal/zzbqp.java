package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbqp {
    public final String zza;
    public final zzbqo zzb;
    public final long zzc;
    public final zzbqz zze;

    public /* synthetic */ zzbqp(String str, zzbqo zzbqoVar, long j, zzcah zzcahVar) {
        this.zza = str;
        Trace.checkNotNull(zzbqoVar, "severity");
        this.zzb = zzbqoVar;
        this.zzc = j;
        this.zze = zzcahVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbqp) {
            zzbqp zzbqpVar = (zzbqp) obj;
            if (Objects.equals(this.zza, zzbqpVar.zza) && Objects.equals(this.zzb, zzbqpVar.zzb) && this.zzc == zzbqpVar.zzc && Objects.equals(this.zze, zzbqpVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, Long.valueOf(this.zzc), null, this.zze);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zza, "description");
        stringHelper.add(this.zzb, "severity");
        stringHelper.add(this.zzc, "timestampNanos");
        stringHelper.add((Object) null, "channelRef");
        stringHelper.add(this.zze, "subchannelRef");
        return stringHelper.toString();
    }
}
