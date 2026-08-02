package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzbpc extends zzbow {
    public final zzbow zza;
    public final zzayi zzb;

    public /* synthetic */ zzbpc(zzbow zzbowVar, zzayi zzayiVar) {
        this.zza = zzbowVar;
        Trace.checkNotNull(zzayiVar, "interceptor");
        this.zzb = zzayiVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final zzbpa zza(Schema schema, zzbov zzbovVar) {
        zzayi zzayiVar = this.zzb;
        int i = zzayiVar.$r8$classId;
        zzbow zzbowVar = this.zza;
        switch (i) {
            case 0:
                try {
                    ImmutableList immutableList = (ImmutableList) ((zzfv) zzayiVar.zza).zzb();
                    zzey.zzb(schema, true);
                    zzey.zzb(schema, false);
                    return new zzazj(new zzaze(zzbowVar, schema, zzbovVar, immutableList));
                } catch (zzbty e) {
                    return new zzazt(zzbtx.zzb(e));
                }
            default:
                return new zzazj(zzayiVar, zzbowVar.zza(schema, zzbovVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final String zzb() {
        return this.zza.zzb();
    }
}
