package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import java.util.Objects;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzcdq extends zzbrp {
    public final zzbov zza;
    public final zzbsn zzb;
    public final Schema zzc;
    public final zzbrn zzd;

    public zzcdq(Schema schema, zzbsn zzbsnVar, zzbov zzbovVar, zzbrn zzbrnVar) {
        Trace.checkNotNull(schema, "method");
        this.zzc = schema;
        Trace.checkNotNull(zzbsnVar, "headers");
        this.zzb = zzbsnVar;
        Trace.checkNotNull(zzbovVar, "callOptions");
        this.zza = zzbovVar;
        Trace.checkNotNull(zzbrnVar, "pickDetailsConsumer");
        this.zzd = zzbrnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcdq.class == obj.getClass()) {
            zzcdq zzcdqVar = (zzcdq) obj;
            if (this.zza == zzcdqVar.zza && this.zzb == zzcdqVar.zzb && this.zzc == zzcdqVar.zzc && Objects.equals(this.zzd, zzcdqVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zza);
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 17 + valueOf2.length() + 13 + valueOf3.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "[method=", valueOf, " headers=", valueOf2);
        return Recorder$$ExternalSyntheticOutline2.m(sb, " callOptions=", valueOf3, "]");
    }
}
