package com.google.android.gms.internal.time;

import com.plaid.internal.EnumC0170g;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zze extends zzef {
    public static final zzdq zza = zzf.zza;
    public int zzc;

    public final zzec zza(Level level) {
        if (!((zzef) this.zza).zzc(level)) {
            return zzef.zzb;
        }
        int valueOf = this.zzc != -1 ? 0 : Integer.valueOf(EnumC0170g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE);
        this.zzc = -1;
        zzd zzdVar = new zzd(this, level);
        zzdq zzdqVar = zza;
        zzcw.zza(zzdqVar, "metadata key");
        zzdVar.zzk(zzdqVar, valueOf);
        return zzdVar;
    }
}
