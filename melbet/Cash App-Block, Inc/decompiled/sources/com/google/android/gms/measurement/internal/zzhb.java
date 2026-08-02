package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes.dex */
public final class zzhb extends BroadcastReceiver {
    public final zzpg zza;
    public boolean zzb;
    public boolean zzc;

    public zzhb(zzpg zzpgVar) {
        zzae.checkNotNull(zzpgVar);
        this.zza = zzpgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu$3();
        String action = intent.getAction();
        zzpgVar.zzaW().zzl.zzb(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzpgVar.zzaW().zzg.zzb(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        zzgz zzgzVar = zzpgVar.zzd;
        zzpg.zzaT(zzgzVar);
        boolean zzb = zzgzVar.zzb();
        if (this.zzc != zzb) {
            this.zzc = zzb;
            zzpgVar.zzaX().zzj(new com.google.android.gms.stats.zza(this, zzb));
        }
    }

    public final void zzb() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu$3();
        zzpgVar.zzaX().zzg();
        zzpgVar.zzaX().zzg();
        if (this.zzb) {
            zzpgVar.zzaW().zzl.zza("Unregistering connectivity change receiver");
            this.zzb = false;
            this.zzc = false;
            try {
                zzpgVar.zzn.zzd.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                zzpgVar.zzaW().zzd.zzb(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }
}
