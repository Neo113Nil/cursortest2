package com.google.android.gms.internal.measurement;

import androidx.tracing.Trace;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class zzvt extends zzvn {
    public final zzwl zza;

    public zzvt(String str, zzvn zzvnVar, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, zzvnVar, zzwqVar);
        Trace.checkArgument(zzwlVar.zzd);
        this.zza = zzwlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwl.zza(this.zza, zzl());
    }

    public zzvt(String str, UUID uuid, String str2, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, uuid, str2, zzwqVar);
        Trace.checkArgument(zzwlVar.zzd);
        this.zza = zzwlVar;
    }
}
